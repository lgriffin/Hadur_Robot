#!/usr/bin/env bash
# Build Hadur with one or more behaviours switched off, for a paired A/B against the release
# it came from (the live-loser follow-up, docs/bench/local/2026-10-07_live-loser-bisect.md).
#
#   ./build-ablation.sh [--ref REF] ABLATION[,ABLATION...]
#   ./build-ablation.sh ram2            # bisect/hadur2.Hadur_3.8.5nr.jar, "hadur2.Hadur 3.8.5nr"
#   ./build-ablation.sh mir1            # ... 3.8.5nm
#   ./build-ablation.sh ram2,mir1       # ... 3.8.5nrnm
#   ./build-ablation.sh shield-all      # ... 3.8.5sa
#
# Ablations (each a one-line edit of the duel, checked to apply exactly once):
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
listdata="$src/hadur-robot/src/main/java/hadur2/ShieldListData.java"
budget="$src/hadur-core/src/main/java/hadur2/core/policy/TickBudget.java"
dist="$src/hadur-core/src/main/java/hadur2/core/policy/DistancePolicy.java"
detector="$src/hadur-core/src/main/java/hadur2/core/shield/ShieldDetector.java"
surf="$src/hadur-core/src/main/java/hadur2/core/move/SurfMover.java"
mctl="$src/hadur-core/src/main/java/hadur2/core/melee/MeleeController.java"
tlink="$src/hadur-core/src/main/java/hadur2/core/TeamLink.java"
fgun="$src/hadur-core/src/main/java/hadur2/core/melee/FieldGun.java"
core="$src/hadur-core/src/main/java/hadur2/core/HadurCore.java"

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
for a in "${list[@]}"; do
    case "$a" in
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
        shold|slearn|smode|sstay|sturn|snull)
            # One switch of shieldmode.ShieldDesign (SHIELD-8 to SHIELD-12) added to SHIPPED.
            case "$a" in
                shold) flag=hold; suffix=sh ;;
                slearn) flag=learn; suffix=sl ;;
                smode) flag=mode; suffix=sm ;;
                sstay) flag=stay; suffix=ss ;;
                sturn) flag=turn; suffix=st ;;
                snull) flag=all; suffix=sn ;;
            esac
            edit "$design" 'public static final ShieldDesign SHIPPED = parse("' \
                "public static final ShieldDesign SHIPPED = parse(\"$flag,"
            version="${version}${suffix}" ;;
        *) echo "unknown ablation: $a (ram2, mir1, flat, shield-all, nodur, nolearn, fin, fl5, mfire, s50, away, nostore, tpost, tfocus, tfence, tshots, tpow, tpowb, mpow, mpowb, mrate, mhold, shold, slearn, smode, sstay, sturn, snull, strim)" >&2; exit 2 ;;
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
