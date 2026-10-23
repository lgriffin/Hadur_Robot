#!/usr/bin/env bash
# Build Hadur with one or more behaviours switched off, for a paired A/B against the release
# it came from (the live-loser follow-up, docs/bench/local/2026-10-07_live-loser-bisect.md).
#
#   ./build-ablation.sh [--ref REF] ABLATION[,ABLATION...]
#   ./build-ablation.sh ram2            # bisect/hadur2.Hadur_3.8.5nr.jar, "hadur2.Hadur 3.8.5nr"
#   ./build-ablation.sh mir1            # ... 3.8.5nm
#   ./build-ablation.sh ram2,mir1       # ... 3.8.5nrnm
#   ./build-ablation.sh shield-all      # ... 3.8.5sa
#   ./build-ablation.sh silent          # ... no gun at all, for the movement lab (lab variants: silent,<x>)
#   ./build-ablation.sh silent,heat     # ... 3.13sihw: the lab's silent Hadur with the MOVE-11 heat wave
#
# Ablations (each a one-line edit of the duel, checked to apply exactly once):
#   aa    no change: the same robot under another name (suffix aa), the A/A arm of a multi-arm run
#         (BENCH-92, docs/plan-top5.md section 6.1), so a run prices its own noise.
#   nowarm  TIME-5's warm-up on a throwaway core is skipped, so round 0 opens cold: the free-points
#         fix arm for start-up disables (docs/plan-top5.md, Stage F). Suffix xw.
#   ram2  RAM-2 off: never escape a confirmed rammer; RAM-1's full-power rule stays (3.4's play)
#   mir1  MIR-1 off: never recognise a mirror bot, so no mirror drive or mirror aim
#   flat  the flattener views never switch on (MOVE-5's threshold out of reach, ADAPT-2's forcing off): is the
#         flattener what lets simple guns hit us (docs/bench/plan-3.11.md, part 2)?
#   shield-all  the D5 shield list matches every opponent, so each 1v1 round opens in shield
#         mode (SHIELD-6 still takes it back where the enemy's bullets would hold the score
#         share under 85%). Issue #140, M2: is Nullstride's mid-table score a shielding score?
#   nodur  RES-9 duress never switches on: skipped turns still shed levels (TIME-2) but the
#         round never drops to the orbit-and-head-on fallback. 3.11 M4 (docs/plan-3.11-census.md):
#         the census lost 0.62 APS in battles with start-up duress.
#   nolearn  TIME-3 never learns an allowance from a skipped turn, so a round-0 warm-up skip
#         does not set the shedding threshold for the rest of the battle.
#   fin   END-1 finishing keeps the controller's distance instead of closing to 150 px (END-2's
#         ram on a disabled enemy stays). 3.12 P1 (docs/plan-3.12.md): does closing in to finish
#         weak bots let their simple guns hit us?
#   fl5   DIST-1 never walks in closer than 500 px (the floor is 400). 3.12 P1: does the walk-in
#         against bots we out-hit cost more bullets than it wins?
#   mfire SHIELD-2's hold of the settled aim skips a MIR-1 mirror aim, which carries no jitter and
#         so was never fired once a shield verdict latched. 3.12 P4 (docs/plan-3.12.md): the
#         silent battles against mirror bots.
#   away  "never close in" (3.12 P5): DIST-1 never steps in (the target stays at the opening's,
#         650 px for a stranger), END-1 keeps that distance, and the surf corrects being too
#         close with the orbit's 1.65 gain instead of 0.6.
#   heat  MOVE-11: the gun-heat wave is on: when the enemy's gun is about to be cool and fewer than two
#         firing waves are in the air, the surf also dodges the shot it has not fired yet. Suffix hw.
#   flt59  MOVE-5's flattener threshold 4.5% -> 5.9% (Diamond's). Suffix f5.
#   flt8  MOVE-5's flattener threshold 4.5% -> 8% (near DrussGT's 8-9%). Suffix f8.
#   heatjit  MOVE-13: the gun-heat wave taken afresh each tick (the first MOVE-11 build): the surf
#         re-ranks every tick while the enemy's gun is ready and stops and starts. Suffix hj.
#   wallesc  MOVE-12: the first wave's danger is also multiplied by BeepBoop's escape-angle position term
#         (our escape room against his, at the move's end), in the three options and in go-to. Suffix we.
#   protean  MOVE-14: the protean pick: while the enemy's gun is cool and no real bullet is within 10 ticks,
#         the surf draws its option from a softmin over the three dangers (temperature from the views'
#         disagreement, safety-capped) with a replaying chaotic die, instead of taking the least danger;
#         the dwell stays 1 tick (re-pick every tick). Suffix pr.
#   pdw3  MOVE-14: protean with a mean dwell of 3 ticks. Suffix p3.
#   pdw8  MOVE-14: protean with a mean dwell of 8 ticks. Suffix p8.
#   pc10  MOVE-14 protean's temperature gain c raised from 1 to 10 (combine with protean). Suffix pc.
#   phot  MOVE-14 protean near-uniform over the options at most twice the best's danger: the
#         temperature floor 0.02 -> 0.5 of the best danger, the cap 0.5 -> 1.0 (combine with protean). Suffix ph.
#   split  MOVE-15: movement by the enemy's gun: once 6 of the enemy's hits on us this battle are counted and
#         60% are of the learned class, the surf holds the gun-heat wave and takes the hot protean pick
#         (floor 0.5, cap 1.0, dwell 1); until then it takes the wave afresh each tick (stop-and-start).
#         Sets HEAT_WAVE and GUN_SPLIT, so build it alone: not combined with heat or heatjit (they edit the
#         same HEAT_WAVE line, which the second edit would not find), nor with protean or phot (unneeded). Suffix sp.
#   gungate  MOVE-17: the gun-heat wave is dropped once the enemy's gun is called learning (MOVE-15's count: 6 hits,
#         60% learned), so the stop-and-start runs only against other guns. Meant to combine with heatjit
#         (heatjit,gungate -> hjgg); sets only GUN_GATE. With split the split wins. Suffix gg.
#   hold650  DIST-3: no DIST-1 walk-in in a duel; the desired distance stays at the opening's (650 for a stranger).
#         END-1's finish is unchanged. Sets only HOLD_650. Suffix d6.
#   dfac     MOVE-18: the surf's distancing factor is measured to the enemy's last scanned position, as Diamond does,
#         not to the wave's source. Sets only DISTANCING_TO_ENEMY. Suffix df.
#   bhb      MOVE-19: a bullet of ours that destroys an enemy bullet teaches the hit views that bullet's guess factor,
#         as Diamond's onBulletHitBullet does. Sets only BULLET_HIT_BULLET_LOG. Suffix bh.
#   hitclr   MOVE-20: every hit on us and every intercept clears the cached neighbour searches, not only a change of the
#         surfed wave. Sets only HIT_CLEARS_CACHE. Suffix hc.
#   pkern    MOVE-21: the danger kernel is the point value 2^-abs(u) at the intersection centre (Diamond's) instead of
#         MOVE-4's integral over it. Sets only POINT_KERNEL. Suffix pk.
#   keep2    TIME-6: a skipped turn no longer drops the surf's second wave for the rest of the round (dropped from level 2;
#         the k halving and go-to shedding stay). Sets only KEEP_SECOND_WAVE. Suffix w2.
#   thgun    GUN-8: in a duel the main gun aims from a TripHammer view, Diamond 1.8.22's duel gun (its formula, weight
#         schedule, k = size/9 up to 225, 59 candidate angles, cube kernel); the displacement view keeps logging and the
#         main candidate's virtual bullet and rating are the TripHammer's. Sets only TRIPHAMMER. Suffix th.
#   freegun  GUN-9: the live gun verdict is the highest-rated candidate with no margin test (Diamond's bestGun), in both
#         power classes; GUN-4's hybrid gate is unchanged. Sets only FREE_GUN. Suffix fg.
#   nodecay  GUN-10: gun ratings are lifetime hits over shots, without GUN-1's 100-shot half-life (Diamond's form). Sets
#         only UNDECAYED. Suffix nk (not nd: nodur has it). Suffixes follow the order given, so stack as thgun,freegun,
#         nodecay for th, fg, nk (heatjit,swall,thgun,freegun,nodecay -> hjswthfgnk).
#   stacklist  MOVE-23: the stop-and-start stack (heatjit, swall, and hitclr, pkern, keep2 whenever those are also named)
#         applies only to opponents not on the stack off-list (hadur-bench/stack-off-top200.txt, held in the robot's
#         StackListData); a listed opponent plays as if those switches were off. Sets only STACK_LIST; the stack's own
#         codes still turn the switches on. Suffix xl (not sl: slearn has it). Last in the stack's order:
#         heatjit,swall,thgun,freegun,nodecay,stacklist -> hjswthfgnkxl.
#   aesrec  AES-1 (measurement, docs/plan-aes.md): each wave's first three-option rating is printed as an AES
#         record with every term of each option's danger, for data/tools/aes_rank.py. Sets only AES_RECORD;
#         behaviour unchanged (the rating is made without the cutoff, which picks the same option). Suffix ar.
#   pressure  POW-12 (the plan's POW-11): while our rolling hit rate less its margin is at least 12%, theirs plus its margin at
#         most 9%, and our energy is above 12, the duel gun skips the cubic power-down and fires a base power of 2.5
#         beyond 150 px (2.95 inside stays); the lead-aware regime wins where it holds. Sets PRESSURE only; combines
#         with heatjit,swall,flt8. Suffix pw.
#   pdown  POW-12's weaker form: under the same gate only the power-down is skipped, the base power stays 1.95. Sets
#         PRESSURE and PRESSURE_BASE_ONLY_POWERDOWN, so build it alone: not with pressure. Suffix pd.
#   pwall  POW-12 gate variant: pressure power on every duel aim with no rate gate (energy floor and lead-regime yield kept).
#         Sets PRESSURE and PRESSURE_ALWAYS; build it alone: not with pressure or pdown; wins over pwc. Suffix pa.
#   pwc  POW-12 gate variant: the window centres only (ours >= 12%, theirs <= 9%, both windows >= 30 outcomes, no margins).
#         Sets PRESSURE and PRESSURE_CENTRES; build it alone: not with pressure, pdown or pwall. Suffix pz (pc is pc10's).
#   repl  MOVE-16: the danger views' weights evolve by the replicator equation: each enemy bullet that hits us
#         multiplies a view's weight by how well it predicted the bullet's angle against the weighted average
#         (every view keeps 2% of the share), so the view that reads this gun takes over. Suffix rp.
#   silent  the Duel never fires: drive() is entered with WEAVE-3's fire permission withdrawn (mayFire = false),
#         which both of the duel's fire sites (the aimed shot and the shield's) honour; the radar,
#         aim, waves and movement all still run. Hadur then scores only by survival, which is what
#         the movement lab measures (docs/bench/move-lab.md). Melee and team play are unchanged.
#         Suffix si. Lab variants are built as silent,<x>, e.g. ./build-ablation.sh silent,heat
#         (suffix sihw), and fought against lab-panel.txt.
#   tpost (team only) the melee posture is always NORMAL while Hadur has living teammates: on a team,
#         two enemies hit by our own members read as "fighting each other", so LET_THEM_FIGHT backs
#         this member away from its teammates' fight (docs/bench/team-lower-half.md).
#   tfocus (team only) every member's gun weights the lowest-energy enemy three times over, so
#         members that share eyes converge on one target (docs/bench/team-lower-half.md).
#   tfence (team only) the WEAVE-8 teammate fence never replaces a drive (members may collide):
#         does braking or reversing for a mate leave members standing in simple guns' fire?
#   tshots (team only, measurement) every scan a member takes is printed as
#         SC,round,tick,name,energy,shot (shot = the power MSENSE-2 inferred, or -), so the shots
#         a member detects can be matched to the engine's bullets (bullets.log); a teammate's sighting
#         merged over the link is printed the same way as SL. Behaviour unchanged.
#   tpow  (team only) a member with 30 energy or more fires power 3 (or what kills the target) at
#         every target: on ranks 21-33 HadurTeam fires mean power 1.35 against HOFSwarm's 1.93,
#         and its rounds last a third longer (docs/bench/team-lower-half.md section 10).
#   tpowb (team only) as tpow, but one power step: a member with 30 energy or more fires one power
#         above MGUN-3's table (at most 3, or what kills the target). Both replace the table's
#         result outright, so MGUN-3's lead cap and two-left duel row do not apply then.
#   mpow  (melee only) with three or more opponents left and 30 energy or more, fire power 3 (or what
#         kills the target) at every target: on the melee top-20 fields Hadur fires about 1.5 in the
#         crowd against the field's 2.4-2.8 and has the lowest bullet damage of all 21 robots
#         (docs/bench/melee-gap-3.13.md). The two-left row and the duel are untouched.
#   mpowb (melee only) as mpow, but one power step above MGUN-3's table (at most 3). mpow and mpowb
#         are alternatives and do not combine; either combines with mrate, mhold and the rest.
#   gtol  (melee only, 3+ opponents, no teammates) fire when the gun is within 2 degrees of last tick's
#         aim (about half a robot at 500 px) instead of 0.05: the bullet leaves along the gun's
#         heading, so a shot inside the target's width still hits, and a gun that never quite
#         settles on a moving peak stops holding fire (3.13's gun idles 21% of ticks).
#   gstick (melee only, 3+ opponents, no teammates) for the last three ticks before the gun is cool,
#         aim only at last tick's target, so the gun converges instead of chasing a new peak.
#   gwhy  (measurement) each tick the gun is cool, print GW,<why>: F fired, A gun still turning (past
#         the seam's tolerance, gtol's when combined), H the brain held fire at a target, T no target,
#         N no command yet, E too little energy, P the conductor withheld fire permission.
#   gwin  (melee only, 3+ opponents, no teammates) the fire window: on a tick the gun is cool, fire at
#         once along the gun's present heading when the firing solutions it covers hold 70% or more of
#         the peak's density (the target there fresh, energy to spare), instead of waiting for the gun
#         to settle on a peak that moves each tick (gwhy: "gun still turning" is half the idle ticks).
#   gk    (melee and team; sources before MGUN-7 only, so --ref v3.13) the field gun's kNN takes 12
#         situations per opponent, not 3. MGUN-7 ships it off a team.
#   tk12, tk21 (team only) T3, the field gun's kNN depth on a team: 12 or 21 situations per opponent,
#         not 3 (FieldGun.K is read only while a teammate lives; MGUN-7's 12 off a team stays).
#         CombatTeam takes 21 (docs/bench/combatteam-3.25.md).
#   tshare0 (team only) MGUN-8 off: teammates' sightings no longer reach the field gun's histories
#         (the World still takes them), so each member learns only from its own radar, as 3.13.
#   tlane0 (team only) T4, no fire lane: a member fires whatever teammates lie ahead, as CombatTeam does.
#   tlane4 (team only) T4, WEAVE-4's lane alone: a teammate's last known point still holds the shot,
#         its predicted track (WEAVE-7) no longer does.
#   mrate (melee and team) fire more often: the controller fires on a scan up to 8 ticks old (was 5;
#         the field gun already aims on 8, the radar's sweep is 10-11), and with three or more
#         opponents left the lead cap (never drop below the target's energy) no longer holds or
#         shrinks a shot. 3.13's gun sits cool and unfired 21% of its ticks, the most of the
#         top-20 fields (docs/bench/melee-gap-3.13.md).
#   mhold (melee only) the passive theory: with three or more opponents left Hadur fires only to
#         finish a robot (16 energy or less), keeping its energy for the last two and the duel.
#   s50   SHIELD-1 needs 10 of the last 20 bullets intercepted, and half of them, not 4 and a
#         quarter. 3.12 P4: half of all census battles latch a shield verdict.
#   nostore  SHIELD-3 no longer starts a battle from the profile's stored shield verdict: each
#         battle decides from its own bullets (the verdict is still saved). 3.12 P6: live
#         clients carry a stored verdict for about 55% of their opponents, and 3.12 would load
#         3.11's.
#   shold  SHIELD-8 (docs/plan-90.md step 1): shield mode never fires at a living enemy.
#   slearn SHIELD-9: an intercepted enemy bullet's heading teaches the predictors.
#   smode  SHIELD-10: learned offsets are the most frequent error, not the mean.
#   sstay  SHIELD-11: no exit inside a round; off for the battle past 150 damage or a silent enemy.
#   sturn  SHIELD-12: the body-turn head-on base.
#   swall  SHIELD-14: a shot whose power the ledger is unsure of (a wall hit inferred on its scan
#         interval) builds a shield wave at the ledger's best-guess power instead of none. Suffix sw.
#   snull  all five at once: Nullstride's design as read from its jar.
#   strim (3.13) the 22 listed robots that 3.13 lost to in both plan90-gate runs come off the shield
#         list, so they are fought in normal mode: does the shield still pay against them
#         (docs/bench/local/2026-10-13_plan90-gate-read.md)? Suffix tr.
#         The shield switches combine: shold,slearn,smode is one build (suffix shslsm). Each
#         adds to SHIPPED, which since 3.13 holds hold, learn, mode and stay (SHIELD-13): from
#         3.13 on, only sturn changes the robot; use --ref v3.12 for the 3.12 ablations.
#
# The build runs in a temporary git worktree of REF (default HEAD), so the checkout is not
# touched. The robot version is REF's version plus one suffix per ablation (nr, nm), so the
# jar installs beside the release in the same Robocode home. Tests are skipped: the pins and
# fixtures would rightly fail on an edited duel. Needs git, mvn, python3 and bash (Git Bash
# on Windows).
set -euo pipefail

ref=HEAD
if [[ "${1:-}" == "--ref" ]]; then ref="$2"; shift 2; fi
[[ $# -eq 1 ]] || { sed -n '2,/^set -euo/{/^#/p}' "$0"; exit 2; }

here="$(cd "$(dirname "$0")" && pwd)"
repo="$(git -C "$here" rev-parse --show-toplevel)"
work="$(mktemp -d)"
trap 'git -C "$repo" worktree remove --force "$work/src" >/dev/null 2>&1 || true; rm -rf "$work"' EXIT
git -C "$repo" worktree add --detach "$work/src" "$ref" >/dev/null
src="$work/src"
duel="$src/hadur-core/src/main/java/hadur2/core/duel/DuelController.java"
move="$src/hadur-core/src/main/java/hadur2/core/move/MoveController.java"
book="$src/hadur-core/src/main/java/hadur2/core/adapt/OpeningBook.java"
shields="$src/hadur-core/src/main/java/hadur2/core/shieldmode/ShieldList.java"
design="$src/hadur-core/src/main/java/hadur2/core/shieldmode/ShieldDesign.java"
movedesign="$src/hadur-core/src/main/java/hadur2/core/duel/MoveDesign.java"
gundesign="$src/hadur-core/src/main/java/hadur2/core/duel/GunDesign.java"
powerdesign="$src/hadur-core/src/main/java/hadur2/core/duel/PowerDesign.java"
protean="$src/hadur-core/src/main/java/hadur2/core/move/ProteanPick.java"
listdata="$src/hadur-robot/src/main/java/hadur2/ShieldListData.java"
budget="$src/hadur-core/src/main/java/hadur2/core/policy/TickBudget.java"
dist="$src/hadur-core/src/main/java/hadur2/core/policy/DistancePolicy.java"
detector="$src/hadur-core/src/main/java/hadur2/core/shield/ShieldDetector.java"
surf="$src/hadur-core/src/main/java/hadur2/core/move/SurfMover.java"
mctl="$src/hadur-core/src/main/java/hadur2/core/melee/MeleeController.java"
tlink="$src/hadur-core/src/main/java/hadur2/core/TeamLink.java"
fgun="$src/hadur-core/src/main/java/hadur2/core/melee/FieldGun.java"
core="$src/hadur-core/src/main/java/hadur2/core/HadurCore.java"
mseam="$src/hadur-core/src/main/java/hadur2/core/MeleeSeam.java"
robot="$src/hadur-robot/src/main/java/hadur2/Hadur.java"

# Replace exactly one occurrence of $2 with $3 in file $1, or fail.
edit() {
    local n
    n="$(grep -cF -- "$2" "$1" || true)"
    [[ "$n" == 1 ]] || { echo "ablation does not apply: found '$2' $n times in $1" >&2; exit 1; }
    python3 -c 'import sys; p,a,b=sys.argv[1:]; s=open(p).read(); open(p,"w").write(s.replace(a,b,1))' "$1" "$2" "$3"
}

base="$(sed -n 's:.*<robot.release>\(.*\)</robot.release>.*:\1:p' "$src/hadur-robot/pom.xml")"
version="$base"
IFS=, read -ra list <<< "$1"
# The fire seam's turn tolerance, which gtol widens; gwhy reads the same one.
gtolerance="0.05"
[[ ",$1," == *,gtol,* ]] && gtolerance="(in.others() >= 3 && core.livingTeammates().isEmpty() ? 2.0 : 0.05)"
for a in "${list[@]}"; do
    case "$a" in
        aa)
            version="${version}aa" ;;
        nowarm)
            edit "$robot" "            warmUp(getBattleFieldWidth(), getBattleFieldHeight(), getOthers());" \
                "            // nowarm ablation: TIME-5's warm-up skipped."
            version="${version}xw" ;;
        ram2)
            # Since RAM-3 (3.9) the escape line ends with the trial arm's condition; before it
            # (3.5 to 3.8.5) the call ends the line.
            ram3="&& trialRound && trialArm == EscapeTrial.Arm.ESCAPE;"
            if grep -qF -- "$ram3" "$duel"; then
                edit "$duel" "$ram3" "&& false;"
            else
                edit "$duel" "ramEscaping = rammer.escape(e.distance(), enemyClosingSpeed, in.energy(), e.energy());" \
                    "ramEscaping = rammer.escape(e.distance(), enemyClosingSpeed, in.energy(), e.energy()) && false;"
            fi
            version="${version}nr" ;;
        mir1)
            edit "$duel" "java.util.Arrays.copyOf(xs, n), java.util.Arrays.copyOf(ys, n), ourEnergy, enemyEnergy);" \
                "java.util.Arrays.copyOf(xs, n), java.util.Arrays.copyOf(ys, n), ourEnergy, enemyEnergy) && false;"
            version="${version}nm" ;;
        flat)
            edit "$move" "public static final double FLATTENER_THRESHOLD = 4.5;" \
                "public static final double FLATTENER_THRESHOLD = 1000.0;"
            edit "$move" "if (flattenerFirst && view.logVisits) return true;" \
                "if (false && flattenerFirst && view.logVisits) return true;"
            version="${version}nf" ;;
        shield-all)
            edit "$shields" "return entries.contains(name) || entries.contains(withoutVersion(name));"                 "return true;"
            version="${version}sa" ;;
        nodur)
            edit "$budget" "return skipsThisRound >= DURESS_SKIPS && now - lastSkip < DURESS_QUIET_TICKS;" \
                "return false && skipsThisRound >= DURESS_SKIPS && now - lastSkip < DURESS_QUIET_TICKS;"
            version="${version}nd" ;;
        nolearn)
            edit "$budget" "if (learnedAllowanceNanos <= 0 && lastUsedNanos > 0" \
                "if (false && learnedAllowanceNanos <= 0 && lastUsedNanos > 0"
            version="${version}nl" ;;
        fin)
            edit "$dist" "return finishing ? FINISH : target;" "return target;"
            version="${version}ne" ;;
        fl5)
            edit "$dist" "target = Math.max(FLOOR, target - STEP);" "target = Math.max(Math.max(FLOOR, 500), target - STEP);"
            version="${version}f5" ;;
        mfire)
            edit "$duel" "boolean predictable = shieldDetector.shielded() && !aimCarriesJitter;" \
                "boolean predictable = shieldDetector.shielded() && !aimCarriesJitter && !aimIsMirror;"
            version="${version}mf" ;;
        away)
            edit "$dist" "if (gap >= GAP && certainLead(ours, theirs) && target > FLOOR) {" \
                "if (false && gap >= GAP && certainLead(ours, theirs) && target > FLOOR) {"
            edit "$dist" "return finishing ? FINISH : target;" "return target;"
            edit "$surf" "return DiaUtils.limit(-MAX_ATTACK_ANGLE, factor * 0.6, MAX_ATTACK_ANGLE);" \
                "return DiaUtils.limit(-MAX_ATTACK_ANGLE, factor * (factor < 0 ? 1.65 : 0.6), MAX_ATTACK_ANGLE);"
            version="${version}aw" ;;
        s50)
            edit "$detector" "public static final int MIN_INTERCEPTS = 4;" "public static final int MIN_INTERCEPTS = 10;"
            edit "$detector" "public static final double MIN_SHARE = 0.25;" "public static final double MIN_SHARE = 0.5;"
            version="${version}s5" ;;
        heat)
            edit "$movedesign" "static final boolean HEAT_WAVE = false;" "static final boolean HEAT_WAVE = true;"
            version="${version}hw" ;;
        flt59)
            edit "$move" "public static final double FLATTENER_THRESHOLD = 4.5;" "public static final double FLATTENER_THRESHOLD = 5.9;"
            version="${version}f5" ;;
        flt8)
            edit "$move" "public static final double FLATTENER_THRESHOLD = 4.5;" "public static final double FLATTENER_THRESHOLD = 8.0;"
            version="${version}f8" ;;
        ramheat)
            edit "$movedesign" "static final boolean RAM_HEAT = false;" "static final boolean RAM_HEAT = true;"
            version="${version}rh" ;;
        heatjit)
            edit "$movedesign" "static final boolean HEAT_WAVE = false;" "static final boolean HEAT_WAVE = true;"
            edit "$movedesign" "static final boolean HEAT_HOLD = true;" "static final boolean HEAT_HOLD = false;"
            version="${version}hj" ;;
        split)
            edit "$movedesign" "static final boolean HEAT_WAVE = false;" "static final boolean HEAT_WAVE = true;"
            edit "$movedesign" "static final boolean GUN_SPLIT = false;" "static final boolean GUN_SPLIT = true;"
            version="${version}sp" ;;
        gungate)
            edit "$movedesign" "static final boolean GUN_GATE = false;" "static final boolean GUN_GATE = true;"
            version="${version}gg" ;;
        hold650)
            edit "$movedesign" "static final boolean HOLD_650 = false;" "static final boolean HOLD_650 = true;"
            version="${version}d6" ;;
        dfac)
            edit "$movedesign" "static final boolean DISTANCING_TO_ENEMY = false;" "static final boolean DISTANCING_TO_ENEMY = true;"
            version="${version}df" ;;
        bhb)
            edit "$movedesign" "static final boolean BULLET_HIT_BULLET_LOG = false;" "static final boolean BULLET_HIT_BULLET_LOG = true;"
            version="${version}bh" ;;
        hitclr)
            edit "$movedesign" "static final boolean HIT_CLEARS_CACHE = false;" "static final boolean HIT_CLEARS_CACHE = true;"
            version="${version}hc" ;;
        pkern)
            edit "$movedesign" "static final boolean POINT_KERNEL = false;" "static final boolean POINT_KERNEL = true;"
            version="${version}pk" ;;
        keep2)
            edit "$movedesign" "static final boolean KEEP_SECOND_WAVE = false;" "static final boolean KEEP_SECOND_WAVE = true;"
            version="${version}w2" ;;
        thgun)
            edit "$gundesign" "static final boolean TRIPHAMMER = false;" "static final boolean TRIPHAMMER = true;"
            version="${version}th" ;;
        freegun)
            edit "$gundesign" "static final boolean FREE_GUN = false;" "static final boolean FREE_GUN = true;"
            version="${version}fg" ;;
        nodecay)
            edit "$gundesign" "static final boolean UNDECAYED = false;" "static final boolean UNDECAYED = true;"
            version="${version}nk" ;;
        stacklist)
            edit "$movedesign" "static final boolean STACK_LIST = false;" "static final boolean STACK_LIST = true;"
            version="${version}xl" ;;
        aesrec)
            edit "$movedesign" "static final boolean AES_RECORD = false;" "static final boolean AES_RECORD = true;"
            version="${version}ar" ;;
        pressure)
            edit "$powerdesign" "static final boolean PRESSURE = false;" "static final boolean PRESSURE = true;"
            version="${version}pw" ;;
        pdown)
            edit "$powerdesign" "static final boolean PRESSURE = false;" "static final boolean PRESSURE = true;"
            edit "$powerdesign" "static final boolean PRESSURE_BASE_ONLY_POWERDOWN = false;" "static final boolean PRESSURE_BASE_ONLY_POWERDOWN = true;"
            version="${version}pd" ;;
        pwall)
            edit "$powerdesign" "static final boolean PRESSURE = false;" "static final boolean PRESSURE = true;"
            edit "$powerdesign" "static final boolean PRESSURE_ALWAYS = false;" "static final boolean PRESSURE_ALWAYS = true;"
            version="${version}pa" ;;
        pwc)
            edit "$powerdesign" "static final boolean PRESSURE = false;" "static final boolean PRESSURE = true;"
            edit "$powerdesign" "static final boolean PRESSURE_CENTRES = false;" "static final boolean PRESSURE_CENTRES = true;"
            version="${version}pz" ;;
        repl)
            edit "$movedesign" "static final boolean REPLICATOR = false;" "static final boolean REPLICATOR = true;"
            version="${version}rp" ;;
        wallesc)
            edit "$movedesign" "static final boolean ESCAPE_ROOM = false;" "static final boolean ESCAPE_ROOM = true;"
            version="${version}we" ;;
        protean)
            edit "$movedesign" "static final boolean PROTEAN = false;" "static final boolean PROTEAN = true;"
            version="${version}pr" ;;
        pdw3)
            edit "$movedesign" "static final boolean PROTEAN = false;" "static final boolean PROTEAN = true;"
            edit "$movedesign" "static final int PROTEAN_DWELL = 1;" "static final int PROTEAN_DWELL = 3;"
            version="${version}p3" ;;
        pc10)
            edit "$protean" "static final double C = 1.0;" "static final double C = 10.0;"
            version="${version}pc" ;;
        phot)
            edit "$protean" "static final double T0_SHARE = 0.02;" "static final double T0_SHARE = 0.5;"
            edit "$protean" "static final double DELTA = 0.5;" "static final double DELTA = 1.0;"
            version="${version}ph" ;;
        pdw8)
            edit "$movedesign" "static final boolean PROTEAN = false;" "static final boolean PROTEAN = true;"
            edit "$movedesign" "static final int PROTEAN_DWELL = 1;" "static final int PROTEAN_DWELL = 8;"
            version="${version}p8" ;;
        silent)
            edit "$duel" "public void drive(BotInput in, BotOrders.Builder orders, int level, boolean mayFire) {" \
                "public void drive(BotInput in, BotOrders.Builder orders, int level, boolean mayFire) { mayFire = false;"
            version="${version}si" ;;
        tpost)
            edit "$mctl" "MeleeStrategy.Plan plan = strategy.evaluate(tracker, s.me, s.energy, s.others, s.time);" \
                "MeleeStrategy.Plan plan = s.teammates.isEmpty() ? strategy.evaluate(tracker, s.me, s.energy, s.others, s.time) : MeleeStrategy.Plan.normal();"
            version="${version}tp" ;;
        tfocus)
            edit "$mctl" "FieldGun.Aim aim = gun.aim(s.me, s.energy, s.others, alive, s.time);" \
                "gun.teamFocus = !s.teammates.isEmpty(); FieldGun.Aim aim = gun.aim(s.me, s.energy, s.others, alive, s.time);"
            edit "$fgun" "static final double SHOOTER_BOOST = 1.5;" \
                "static final double SHOOTER_BOOST = 1.5; public boolean teamFocus;"
            edit "$fgun" "if (isolated(e, alive)) w *= ISOLATED_BOOST;" \
                "if (isolated(e, alive)) w *= ISOLATED_BOOST; if (teamFocus) { boolean low = true; for (EnemyInfo o : alive) if (o.energy < e.energy) low = false; if (low) w *= 3.0; }"
            version="${version}tf" ;;
        tfence)
            edit "$tlink" "if (living.isEmpty()) return built;" "if (true || living.isEmpty()) return built;"
            version="${version}tn" ;;
        tshots)
            edit "$core" "scanShot = world.lastScanShot();" \
                "scanShot = world.lastScanShot(); if (teamLink != null) telemetry.emit(\"SC,\" + round + \",\" + in.time() + \",\" + clean(scan.name()) + \",\" + scan.energy() + \",\" + (scanShot == null ? \"-\" : String.valueOf(scanShot.power)));"
            edit "$tlink" "world.onScan(s.name, at, s.energy, s.heading, s.velocity, s.tick, at.distance(in.x(), in.y()));" \
                "world.onScan(s.name, at, s.energy, s.heading, s.velocity, s.tick, at.distance(in.x(), in.y())); System.out.println(\"SL,\" + in.round() + \",\" + s.tick + \",\" + s.name + \",\" + s.energy + \",\" + (world.lastScanShot() == null ? \"-\" : String.valueOf(world.lastScanShot().power)));"
            version="${version}ts" ;;
        tpow|tpowb)
            edit "$mctl" "waves.tick(s.me, s.time, s.gunHeat, alive, gun, s.energy, s.others);" \
                "gun.teamPower = !s.teammates.isEmpty(); waves.tick(s.me, s.time, s.gunHeat, alive, gun, s.energy, s.others);"
            edit "$fgun" "public List<Solution> solutions(" "public boolean teamPower; public List<Solution> solutions("
            if [[ "$a" == tpow ]]; then raise="3.0"; version="${version}tw"; else raise="power + 1.0"; version="${version}tb"; fi
            edit "$fgun" "if (power <= 0) continue;" \
                "if (power <= 0) continue; if (teamPower && energy >= 30) power = Math.min(Math.min(3.0, $raise), MeleeEnergyPolicy.killPower(e.energy));"
            ;;
        gtol)
            version="${version}gt"
            edit "$mseam" "&& Math.abs(Math.toDegrees(in.gunTurnRemaining())) < 0.05" \
                "&& Math.abs(Math.toDegrees(in.gunTurnRemaining())) < $gtolerance"
            ;;
        gstick)
            version="${version}gs"
            edit "$mctl" "FieldGun.Aim aim = gun.aim(s.me, s.energy, s.others, alive, s.time);" \
                "List<EnemyInfo> pool = alive; if (s.teammates.isEmpty() && s.others >= 3 && s.gunHeat > 0 && s.gunHeat <= 0.3 && last != null && alive.contains(last) && last.age(s.time) <= MAX_FIRE_AGE) pool = java.util.Collections.singletonList(last); FieldGun.Aim aim = gun.aim(s.me, s.energy, s.others, pool, s.time);"
            ;;
        gwhy)
            version="${version}gw"
            edit "$mseam" "        MeleeController.Command c = melee.tick(new MeleeController.Situation(" \
                "        if (in.gunHeat() == 0 && in.energy() > 0.1) System.out.println(\"GW,\" + (previous == null ? \"N\" : previous.firePower <= 0 ? (previous.target == null ? \"T\" : \"H\") : Math.abs(Math.toDegrees(in.gunTurnRemaining())) >= $gtolerance ? \"A\" : in.energy() <= previous.firePower ? \"E\" : !tick.mayFire() ? \"P\" : \"F\"));
        MeleeController.Command c = melee.tick(new MeleeController.Situation("
            ;;
        gwin)
            version="${version}gn"
            edit "$fgun" "static final double ISOLATED_RANGE = 350;" \
                "static final double ISOLATED_RANGE = 350; List<Solution> lastAll = new ArrayList<>(); public Aim at(double angle) { double density = 0; Map<String, Double> by = new LinkedHashMap<>(); Map<String, Double> pw = new LinkedHashMap<>(); for (Solution o : lastAll) { if (Math.abs(Angles.normalRelativeAngle(angle - o.angle)) <= o.tolerance) { density += o.weight; by.merge(o.target, o.weight, Double::sum); pw.put(o.target, o.power); } } String t = null; double top = -1; for (Map.Entry<String, Double> e : by.entrySet()) if (e.getValue() > top) { top = e.getValue(); t = e.getKey(); } return t == null ? null : new Aim(angle, pw.get(t), density, t, false); }"
            edit "$fgun" "List<Solution> all = solutions(me, energy, others, alive, now);" \
                "List<Solution> all = solutions(me, energy, others, alive, now); lastAll = all;"
            edit "$mctl" "public boolean learnedAim;" "public boolean learnedAim; public double fireNow;"
            edit "$mctl" "c.firePower = hold ? 0 : power;" \
                "c.firePower = hold ? 0 : power; if (s.teammates.isEmpty() && s.others >= 3 && s.gunHeat == 0) { FieldGun.Aim w = gun.at(s.gunHeading); if (w != null && w.density >= 0.7 * aim.density) { EnemyInfo wt = tracker.get(w.target); double wp = Math.min(w.power, MeleeEnergyPolicy.killPower(wt.energy)); if (wt.age(s.time) <= MAX_FIRE_AGE && s.energy >= MeleeEnergyPolicy.MIN_OWN_ENERGY && s.energy > wp + 0.1) c.fireNow = wp; } }"
            edit "$mseam" "MeleeController.Command previous = lastCommand;" "MeleeController.Command previous = lastCommand; boolean firedNow = false;"
            edit "$mseam" "orders.fire(previous.firePower);" "orders.fire(previous.firePower); firedNow = true;"
            edit "$mseam" "        if (c.target != null && core.diedThisRound(c.target)) ghostTicks++;" \
                "        if (!firedNow && c.fireNow > 0 && in.gunHeat() == 0 && in.energy() > c.fireNow && tick.mayFire()) { orders.fire(c.fireNow); stats.shotsFired++; core.meleeShotFired(); }
        if (c.target != null && core.diedThisRound(c.target)) ghostTicks++;"
            ;;
        tk12|tk21)
            k="${a#tk}"
            version="${version}k${k}"
            edit "$fgun" "public static final int K = 3;" "public static final int K = ${k};"
            ;;
        tshare0)
            version="${version}s0"
            edit "$core" "if (teamLink != null && meleeSeam != null) meleeSeam.mateSightings(teamLink.mateSightings());" \
                "if (false && teamLink != null && meleeSeam != null) meleeSeam.mateSightings(teamLink.mateSightings());"
            ;;
        tlane0)
            version="${version}l0"
            edit "$core" "boolean laneClear = teamLink == null || teamLink.laneClear(raw);" "boolean laneClear = true;"
            ;;
        tlane4)
            version="${version}l4"
            edit "$tlink" "            if (across <= half) return false;" "            if (across <= half) return false;
            if (true) continue;"
            ;;
        gk)
            # MGUN-7 ships twelve situations off a team, so on its sources this would change
            # only the team's depth: the screen it stands for is 3.13's (--ref v3.13).
            grep -qF "MELEE_K" "$fgun" && { echo "gk applies to sources before MGUN-7 (use --ref v3.13)" >&2; exit 2; }
            version="${version}gk"
            edit "$fgun" "public static final int K = 3;" "public static final int K = 12;"
            ;;
        mrate)
            version="${version}mr"
            edit "$mctl" "static final long MAX_FIRE_AGE = 5;" "static final long MAX_FIRE_AGE = 8;"
            edit "$src/hadur-core/src/main/java/hadur2/core/melee/MeleeEnergyPolicy.java" \
                "if (ownEnergy > targetEnergy) {" "if (others <= 2 && ownEnergy > targetEnergy) {"
            ;;
        mhold)
            version="${version}mh"
            edit "$fgun" "if (!finisher && rams(e, me)) continue;" \
                "if (!finisher && rams(e, me)) continue; if (!onTeam && others >= 3 && !finisher) continue;"
            ;;
        mpow|mpowb)
            if [[ "$a" == mpow ]]; then raise="3.0"; version="${version}mw"; else raise="power + 1.0"; version="${version}mb"; fi
            edit "$fgun" "if (onTeam) power = MeleeEnergyPolicy.teamPower(power, energy, e.energy);" \
                "if (onTeam) power = MeleeEnergyPolicy.teamPower(power, energy, e.energy); if (!onTeam && others >= 3 && energy >= 30) power = Math.min(Math.min(3.0, $raise), MeleeEnergyPolicy.killPower(e.energy));"
            ;;
        nostore)
            edit "$book" "distance(gunTier), profile.leadAware(), profile.shielder());" \
                "distance(gunTier), profile.leadAware(), false);"
            version="${version}ns" ;;
        strim)
            # 3.13: the 22 robots 3.13's shield lost to in both gate runs leave the list.
            for r in "trab.Crusader 0.1.7" "kid.Toa .0.5" "mladjo.Grrrrr 0.9" "tw.Exterminator 1.0" "suh.micro.MirrorPM 1.00" "cf.proto.Shiva 2.2" "ary.SMG 1.01" "wilson.Chameleon 0.91" "cx.micro.Smoke 0.96" "davidalves.net.DuelistMicroMkII 1.1" "AIR.iRobot 1.0" "starpkg.StarViewerZ 1.26" "rcb.Vanessa03 0" "kawigi.mini.Coriantumr 1.1" "ary.mini.Nimi 1.0" "DM.mega.Bezier 1.618fprrr" "brainfade.Fallen 0.63" "stelo.Randomness 1.1" "simonton.micro.GFMicro 1.0" "apv.NanoLauLectrikTheCannibal 1.1" "mnt.AHEB 0.6a" "nat.Hikari dev0001"; do
                edit "$listdata" "\"$r\"," '"",'
            done
            version="${version}tr" ;;
        shold|slearn|smode|sstay|sturn|swall|snull)
            # One switch of shieldmode.ShieldDesign (SHIELD-8 to SHIELD-12) added to SHIPPED.
            case "$a" in
                shold) flag=hold; suffix=sh ;;
                slearn) flag=learn; suffix=sl ;;
                smode) flag=mode; suffix=sm ;;
                sstay) flag=stay; suffix=ss ;;
                sturn) flag=turn; suffix=st ;;
                swall) flag=wall; suffix=sw ;;
                snull) flag=all; suffix=sn ;;
            esac
            edit "$design" 'public static final ShieldDesign SHIPPED = parse("' \
                "public static final ShieldDesign SHIPPED = parse(\"$flag,"
            version="${version}${suffix}" ;;
        *) echo "unknown ablation: $a (aa, nowarm, ram2, mir1, flat, shield-all, nodur, nolearn, fin, fl5, mfire, s50, away, heat, heatjit, ramheat, flt59, flt8, split, wallesc, gungate, hold650, dfac, bhb, hitclr, pkern, keep2, thgun, freegun, nodecay, stacklist, protean, pdw3, pdw8, pc10, phot, repl, pressure, pdown, pwall, pwc, silent, swall, nostore, tpost, tfocus, tfence, tshots, tpow, tpowb, mpow, mpowb, mrate, mhold, tk12, tk21, tshare0, tlane0, tlane4, gtol, gstick, gwhy, gwin, gk, aesrec, shold, slearn, smode, sstay, sturn, snull, strim)" >&2; exit 2 ;;
    esac
done

edit "$src/hadur-robot/pom.xml" "<robot.release>$base</robot.release>" "<robot.release>$version</robot.release>"
for f in Hadur.properties HadurRecorder.properties; do
    edit "$src/hadur-robot/src/main/resources/hadur2/$f" "robot.version=$base" "robot.version=$version"
done
team="$src/hadur-robot/src/team/HadurTeam.team"
[[ -f "$team" ]] && sed -i "s/$base/$version/g" "$team"

(cd "$src" && mvn -q -B package -DskipTests -Dmaven.javadoc.skip=true)
jar="$src/hadur-robot/target/hadur2.Hadur_${version}.jar"
python3 -c 'import sys,zipfile; print(zipfile.ZipFile(sys.argv[1]).read("hadur2/Hadur.properties").decode())' "$jar" | tr -d '\r' | grep -qx "robot.version=$version" \
    || { echo "built jar does not carry robot.version=$version" >&2; exit 1; }
mkdir -p "$here/bisect"
cp "$jar" "$here/bisect/"
teamjar="$src/hadur-robot/target/hadur2.HadurTeam_${version}.jar"
[[ -f "$teamjar" ]] && cp "$teamjar" "$here/bisect/"
echo "built bisect/hadur2.Hadur_${version}.jar  --robot \"hadur2.Hadur ${version}\""
