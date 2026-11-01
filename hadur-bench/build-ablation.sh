#!/usr/bin/env bash
# Build Hadur with one or more behaviours switched off, for a paired A/B against the release
# it came from (the live-loser follow-up, docs/bench/local/2026-10-07_live-loser-bisect.md).
#
#   ./build-ablation.sh [--ref REF] ABLATION[,ABLATION...]
#   ./build-ablation.sh ram2            # bisect/hadur117.Hadur_3.8.5nr.jar, "hadur117.Hadur 3.8.5nr" (hadur2 before the rename)
#   ./build-ablation.sh mir1            # ... 3.8.5nm
#   ./build-ablation.sh ram2,mir1       # ... 3.8.5nrnm
#   ./build-ablation.sh shield-all      # ... 3.8.5sa
#   ./build-ablation.sh silent          # ... no gun at all, for the movement lab (lab variants: silent,<x>)
#   ./build-ablation.sh silent,heat     # ... 3.13sihw: the lab's silent Hadur with the MOVE-11 heat wave
#
# Ablations (each a one-line edit of the duel, checked to apply exactly once):
#   g24   melee Stage 2: the field gun takes 24 situations an opponent off a team (MGUN-7's 12). Suffix g4.
#   gcrowd  MGUN-11: the field gun's situations also see the crowd (nearest robot, heading to it, alive). Suffix gc.
#   close200  POW-13: the duel fires power 3 inside 200 px (Ogi's melee rule; 2.95 inside 150 px ships). Suffix cr.
#   pfloor  MGUN-12: off a team with 3+ opponents and 20+ energy, fire at least 1.9 at any distance, in place of
#           MGUN-13 where that ships on. Suffix pf.
#   pogi   MGUN-13: as pfloor's conditions, Ogi's power: 1.92, and 3 within 200 px. Suffix po. Ships on since
#          BENCH-118, so it no longer applies on master.
#   ogi2    MGUN-14: MGUN-13 also with two opponents left. Suffix o2.
#   ogie10  MGUN-15: MGUN-13 from 10 own energy, not 20. Suffix oe.
#   ogi300  MGUN-16: MGUN-13's power 3 out to 300 px, not 200. Suffix ow.
#   gexp    MGUN-17: after 20 waves, a head-on, linear or circular aim that out-hits the field gun 1.25x takes that opponent. Suffix gx.
#   grate   MGUN-18: an opponent's weight leans toward the ones the aim it fires has been hitting. Suffix gr.
#   gdist   MGUN-19: the distance weight (100/d)^0.7, not 100/d. Suffix gd.
#   tmswift (team only) TMODE-32: SWIFT on every team: the gun fires no harder than 1.9. Suffix sf.
#   tmconcord (team only) TMODE-33: the team brain after Ogi's design on every team. Suffix cn.
#   tmconcordr / tmconcordm / tmconcordg: one part of it alone (radar cnr, movement cnm, gun cng);
#   tmconcordp: the gun's pooling alone, power as shipped (cnp); tmconcordh: the movement with the hunt dropped (cnh).
#   The brain's shipped parts (TeamConcord): movement and gun on, group radar off, hunt kept.
#   tmnoconcord (team only) TMODE-34 off: CONCORD on no team, as before it shipped. Suffix ncn.
#   tmlead  (team only) TMODE-31: LEAD on every team: the gun leans on the leader and, with droids about, the scanners. Suffix ld.
#   tdecap  (team only) MGUN-21: the gun leans 3x on the enemy leader once its death drains more than it costs. Suffix dc.
#   gsoft   MGUN-20: a situation's weight 1/(distance + mean distance), not 1/(0.01 + distance). Suffix gv.
#   mdmg   MMOVE-22: each opponent's risk weighs by the damage it has done to Hadur this battle x its mean distance (Diamond). Suffix dm. Ships on from 3.21, so on master dm is the robot as it is.
#   mlat   MMOVE-23: the crowd's lateral weight 1.0, not 0.5 (Diamond's 1 + |cos|). Suffix la.
#   mavg   MGUN-23: at or above the field's mean energy, 3 at any range with four or more left; below it, 1 beyond 300 px (Diamond). Suffix ea.
#   etab   HAND-1: in a melee endgame off a team the survivor's 1v1 table entries apply (shield list, dodges, stop-go, heat-jit, gun stack). Suffix et.
#   edge   HAND-2: a survivor whose gun the melee's book read as head-on gets the dodge planner, primed head-on. Suffix ed.
#   eshd   HAND-3: that survivor gets shield mode on SHIELD-15's trial, listed or not. Suffix es.
#   e3ring  MEND-1: with two opponents left off a team, the crowd's ring and lateral weight (no MMOVE-4). Suffix er.
#   e3pow  MEND-2: with two opponents left off a team, the crowd's power table (not the duel's). Suffix ep.
#   e3far  MEND-3: with two opponents left off a team, the closest-robot factor 4 (not 2). Suffix ef.
#   aa    no change: the same robot under another name (suffix aa), the A/A arm of a multi-arm run
#         (BENCH-92, docs/plan-top5.md section 6.1), so a run prices its own noise.
#   bb    no change, suffix bb: a second A/A copy, for a run whose baseline is the aa build (card team-s2).
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
#   rambrk  RAM-5: RAM-2's escape weighs its paths against the rammer's shots in flight (head-on and
#         linear aims). Suffix rk.
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
#   oracle ORACLE-1 (measurement, K0 of the road to king): each wave's first three-option rating also prints an ORC
#         record with every danger view's neighbours on the wave, for data/tools/gun_oracle.py. Sets only
#         ORACLE_RECORD; behaviour unchanged. Suffix or.
#   surfb  MOVE-25: the stop-point surf (docs/bench/surf-b-rivals-read.md): stop points both ways rated on a smoothed
#         probability histogram of the same views, 1 / sqrt(4 + t) time weight, two waves, plan kept until the waves or
#         the views change. Sets only STOP_POINT_SURF. Suffix sb.
#   aimmix  MOVE-26 (with surfb): the shot dodger reads every opponent and the stop-point surf mixes the most-matched
#         simple aim into its danger at its matched share. Sets only AIM_MIX. Suffix am (surfb,aimmix -> sbam).
#   mimics  MOVE-27 (with surfb): the stop-point surf rates waves on the enemy-gun ensemble, the views blended with
#         visit-trained mimics of learning guns weighted by their score at real bullets cubed. Sets only MIMICS.
#         Suffix gm (surfb,mimics -> sbgm).
#   aimmem  MOVE-29 (K1 of the road to king): the three-option surf mixes the views' danger with the head-on, linear
#         and circular aims', each weighted by its rolling score at the bullets that hit us. Sets only AIM_MEMBERS.
#   noaim  MOVE-29 off (it ships on from 3.20): the three-option surf rates on the views alone. Suffix kx.
#   aimp3, aimp1  (with aimmem) MOVE-29's standing weight of each aim 0.1 -> 0.3 or 1.0. Suffix q3, q1.
#   aimbhb  MOVE-30: an enemy bullet ours met also scores the aim members, as a hit does. Sets only AIM_INTERCEPTS.
#         Suffix ki.
#   aimwide  MOVE-31: the aim members read all six simple angles at all three lags (18 aims, the same 0.3 total
#         standing weight) in place of head-on, linear and circular one tick back. Sets only WIDE. Suffix kw.
#   sgoff  MOVE-30 and MOVE-31 off (both on for the census after 3.20): the aim members are MOVE-29's three,
#         scored on hits only. Suffix kj.
#         Suffix km.
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
#         CombatTeam takes 21 (docs/bench/combatteam-3.25.md). MGUN-9 ships 21: use --ref v3.15.
#   tshare0 (team only) MGUN-8 off: teammates' sightings no longer reach the field gun's histories
#         (the World still takes them), so each member learns only from its own radar, as 3.13.
#   tlane0 (team only) T4, no fire lane: a member fires whatever teammates lie ahead, as CombatTeam does.
#   tlane4 (team only) T4, WEAVE-4's lane alone: a teammate's last known point still holds the shot,
#         its predicted track (WEAVE-7) no longer does.
#   tlaneo (team only) team step C, Ogi's lane (docs/bench/ogi-deep-dive.md 4.6): the shot holds only for a
#         teammate nearer than the target (the nearest enemy within atan2(36, d) of the gun line) and
#         within atan2(30, d) of the gun line; no drift, no predicted track. Suffix lo.
#   tram  (team only) TR1, shoot rammers: the field gun no longer skips an enemy closing on the member
#         inside 100 px (FieldGun.rams). Off a team the skip stays. Three ramming teams take 1.6-2.1 APS
#         of the gap to 5th-6th (docs/plan-team-top5.md). Suffix rm. MGUN-10 ships it: use --ref v3.15.
#   t6n   (team only) T6, MMOVE-9: a detected shot is taken as aimed at the member nearest the shooter;
#         the others make no virtual bullets for it (TeamDanger.NEAREST). Suffix dn.
#   t6l   (team only) T6, MMOVE-10: enemy bullets that hit any member teach a shared per-enemy log of
#         its gun; members dodge its learned aims in place of head-on and linear (TeamDanger.LEARNED).
#         Suffix dl. Both together: t6n,t6l (docs/plan-team-top5.md stage S2, card team-s2).
#   tmsoft (team only) T7, TMODE-2: the SOFT mode against every team (a shot weighs 1/(1+k)^2 for the k
#         teammates nearer its shooter). Suffix ms.
#   tmgang (team only) T7, TMODE-3: the GANG mode against every team (a member near two enemies is drawn to
#         its nearest teammate; a free one to a ganged teammate). Suffix mg.
#   tmfin  (team only) T7, TMODE-4: the FINISH mode against every team (close on the last enemy). Suffix mf.
#   tmlearn (team only) T7: the LEARN mode (MMOVE-10) against every team. Suffix ml.
#   tmpack (team only) T7, TMODE-5: the PACK mode against every team (members close on one prey from
#         their own sides, NightmareTeam's pincer). Suffix mp.
#         One census run of each fills the per-team mode table (docs/bench/team-top-decompile.md).
#   tmscreen (team only) T7, TMODE-6: SCREEN against every team (teammates count as robots nearer an
#         enemy in MMOVE-2's closest test, as Ogi). Suffix mx.
#   tmpool (team only) T7, TMODE-7: POOL against every team (learned aims, one log per enemy class). Suffix mo.
#   tmdis  (team only) T7, TMODE-8: DISABLED against every team (drawn to a disabled enemy). Suffix md.
#   tmfire (team only) T7, TMODE-9: MATEFIRE against every team (teammates' bullets as danger). Suffix mb.
#   thunt250, thunt200 (team only) TMODE-13's hunt place 250 / 200 px from the prey, not 350, against
#         every team (hunting closer in; FAR/FARTHER lost in pc-team-counters, PR #370). Suffix hr25 / hr20.
#   tmrear (team only) T7, TMODE-10: REAR against every team (the leader keeps back). Suffix mr.
#   tmwaves (team only) T7, TMODE-11: WAVES against every team (Ogi's wave check on the safest destinations,
#          team step D). Suffix mw.
#   tmwk  (team only) with tmwaves: each virtual bullet's kernel 2.5 bot widths wide, not half of one. Suffix wk.
#          The three combine: tmdis,tmfire,tmrear is one build (suffix mdmbmr).
#   tmpath (team only) TMODE-25: PATH against every team (Firestarter's path check: each candidate's drive
#         checked tick by tick against the teammates' bullets in flight); the teams the table names
#         play it on top of their entry. Suffix mp.
#   tmdodge (team only) TMODE-27: DODGE against every team (Ogi's dodge as one piece: shot profiles from
#         aim experts weighted per enemy class, the 12 safest candidates driven through them and the
#         teammates' bullets); the teams the table names play it on top of their entry. Suffix dg.
#   tmdodgeb (team only) with tmdodge: the base ranking keeps the head-on and linear virtual bullets and
#         the teammates' bullets (TeamDodge.RANK_BULLETS). Suffix db.
#   tmtnear (team only) TMODE-26: NEAR (hunt at 250 px) added to the shipped TroodonPack entry. Suffix tn.
#   tmgunline (team only) TMODE-19: GUNLINE against every team: members state their gun heading and heat,
#         and keep out of the line ahead of a teammate's gun about to fire (K 0.4, 70 px). Suffix mgl.
#   tmgunlinew (team only) with it heavier and wider (K 1.0, 100 px). Suffix mglw.
#   tmtab (team only) T7, TMODE-1: the screen's table, the t.put lines in $TEAM_MODE_TABLE (default
#         work/team-modes-screen.java, written by tools/team_modes.py pick). Suffix mt, or
#         $TEAM_MODE_SUFFIX (the per-opponent counter screens build ka, kb, kc).
#   tmlock (team only) the confirmed table, $TEAM_MODE_LOCKED (default work/team-modes-locked.java,
#         written by tools/team_modes.py lock). Suffix mk.
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
#   strial SHIELD-15: Ogi's shield trial. Every unlisted duel opponent starts in shield mode and
#         leaves it for the battle once the trial fails (35 damage plus 0.25 a shot, two lost
#         rounds, under half of 20 ended bullets shot down, six hits with none shot down, or
#         being rammed). Listed opponents play as shipped. Suffix sy.
#   sprior SHIELD-16: Saguaro's body-turn base (head-on from the enemy's position on the tick
#         before it fired, plus its body turn on the firing tick) as a fifth base. Suffix sq.
#   sdmg400  SHIELD-11's battle exit after 400 enemy bullet damage, not 150 (gap-to-2nd shield read:
#         listed robots leak ~150 by mid-battle, then the surf takes 3-5x more). Suffix s4.
#   sdmgoff  SHIELD-11's damage exit never fires (the silent exit and the budget stay). Suffix s0.
#   slistdrop  the robots named in the file $SHIELD_DROP (one per line, or a pick TSV) leave the shield
#         list, so Hadur surfs them (the gap-to-2nd re-pick, docs/bench/gap-to-2nd.md). Suffix md.
#   slistadd  the robots named in the file $SHIELD_ADD (one per line, or a pick TSV) join the shield
#         list: the shield entries of the 1v1 mode table (docs/plan-shield-quality.md). Suffix mt.
#   smove  SHIELD-17: Saguaro's moving shield, the opening drive (away from walls and the enemy
#         while its gun cools) against every shielded opponent. Suffix sv.
#   srec   SHIELD-18: each shield round's end writes the predictors' state (SP), which saimlist's
#         file is built from. Changes no play. Suffix sk.
#   absurf POW-14: BeepBoop's anti-BasicSurfer powers (2.45-, 1.95, 1.45, 0.95, 0.65, 0.45, 0.15) in round 0
#         and while this battle's hit rate is above 20%, duel only. Suffix ab.
#   sstill SHIELD-20: a shield shot plan from where we stand wins whenever there is one; the 0.1 px
#         step aside only for a bullet no still plan meets (docs/bench/shield-step.md). Suffix sz.
#   smovelist the robots named in $SHIELD_MOVE (one per line, or a pick TSV) get the opening drive
#         per opponent (ShieldTableData.moves()). Suffix mv.
#   saimlist  the lines of $SHIELD_AIM ("predictor offset name", from tools/shield_s2.py aims) become
#         shipped aims (ShieldTableData.aims()). Suffix ak.
#   sdodge DODGE-3: the duel surf dodges the enemy's simple aim (DODGE-1, DODGE-2) against every
#         opponent once one aim matches its bullets. Suffix sg.
#   sdodgelist the robots named in $SHOT_DODGE (one per line, or a pick TSV) get the dodge per
#         opponent (ShieldTableData.dodges()). Suffix dg.
#   sdplan DODGE-6: the shot-dodge planner (Saguaro's ShotDodger movement, DODGE-4 to DODGE-6) against
#         every duel opponent, once an expert stands out; writes DP records. Suffix sp.
#   sdkeep0 with sdplan: the planner neither keeps a close enemy away with no wave nor drives ahead of
#         RAM-2's escape. Suffix k0.
#   sdplanlist the lines of $SHOT_DODGE_PLAN ("expert name", or a name alone for -1, or a pick TSV)
#         get the planner per opponent (ShieldTableData.dodgePlans()). Suffix dp.
#   sgo    POISON-2: stop-and-go (POISON-1, WavePoison: reverse crawl 1 tick before the enemy's gun
#         is ready) against every duel opponent. Suffix wp.
#   sgo2   the same, WavePoisonShift's variant (2 ticks). Suffix ws.
#   sgolist / sgo2list the robots named in $STOP_GO / $STOP_GO2 get stop-and-go per opponent
#         (ShieldTableData.stopGos() / stopGoShifts()). Suffix wl / wm.
#   hjlist / gslist the robots named in $HEAT_JIT / $GUN_STACK get MOVE-13 stop-and-start (MOVE-28) or the gun
#         stack GUN-8 to GUN-10 (GUN-11) per opponent. Suffixes hl, gl.
#   sx4list / sx0list the robots named in $SHIELD_EXIT4 / $SHIELD_EXIT0 get SHIELD-11's battle exit at 400
#         damage or none (SHIELD-19, ShieldTableData.exitLates() / exitOffs()). Suffixes x4, x0.
#   skrec  SKEY-1: each wave's first three-option rating also writes an SKN record with the wave's surf
#         key, for data/tools/surf_key_fit.py (measurement only; pair with oracle). Suffix kr.
#   sklist the lines of $SURF_KEY ("m1 ... m9 bw name", from data/tools/surf_key_fit.py) become per-opponent
#         surf keys (SKEY-2, ShieldTableData.surfKeys()). Suffix kl.
#   szlist the robots named in $SHIELD_STILL get SHIELD-20's still shot plans (SHIELD-21,
#         ShieldTableData.stills()). Suffix zl.
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
# The robot's package: hadur117 since the 2026-10-27 rename, hadur2 in a --ref from before it.
pkg=hadur117
[[ -d "$src/hadur-core/src/main/java/hadur117" ]] || pkg=hadur2
duel="$src/hadur-core/src/main/java/$pkg/core/duel/DuelController.java"
move="$src/hadur-core/src/main/java/$pkg/core/move/MoveController.java"
book="$src/hadur-core/src/main/java/$pkg/core/adapt/OpeningBook.java"
shields="$src/hadur-core/src/main/java/$pkg/core/shieldmode/ShieldList.java"
design="$src/hadur-core/src/main/java/$pkg/core/shieldmode/ShieldDesign.java"
movedesign="$src/hadur-core/src/main/java/$pkg/core/duel/MoveDesign.java"
aimmembers="$src/hadur-core/src/main/java/$pkg/core/move/AimMembers.java"
gundesign="$src/hadur-core/src/main/java/$pkg/core/duel/GunDesign.java"
powerdesign="$src/hadur-core/src/main/java/$pkg/core/duel/PowerDesign.java"
protean="$src/hadur-core/src/main/java/$pkg/core/move/ProteanPick.java"
listdata="$src/hadur-robot/src/main/java/$pkg/ShieldListData.java"
tabledata="$src/hadur-robot/src/main/java/$pkg/ShieldTableData.java"
budget="$src/hadur-core/src/main/java/$pkg/core/policy/TickBudget.java"
dist="$src/hadur-core/src/main/java/$pkg/core/policy/DistancePolicy.java"
detector="$src/hadur-core/src/main/java/$pkg/core/shield/ShieldDetector.java"
surf="$src/hadur-core/src/main/java/$pkg/core/move/SurfMover.java"
mctl="$src/hadur-core/src/main/java/$pkg/core/melee/MeleeController.java"
tlink="$src/hadur-core/src/main/java/$pkg/core/TeamLink.java"
fgun="$src/hadur-core/src/main/java/$pkg/core/melee/FieldGun.java"
danger="$src/hadur-core/src/main/java/$pkg/core/melee/TeamDanger.java"
modes="$src/hadur-core/src/main/java/$pkg/core/melee/TeamModes.java"
dodge="$src/hadur-core/src/main/java/$pkg/core/melee/TeamDodge.java"
mrm="$src/hadur-core/src/main/java/$pkg/core/melee/MinimumRiskMovement.java"
core="$src/hadur-core/src/main/java/$pkg/core/HadurCore.java"
mseam="$src/hadur-core/src/main/java/$pkg/core/MeleeSeam.java"
robot="$src/hadur-robot/src/main/java/$pkg/Hadur.java"

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
        bb)
            # A second A/A copy under its own name, for a run whose baseline is itself an aa build.
            version="${version}bb" ;;
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
        flaton)
            # MOVE-24 off: 3.15's duel flattener-off undone (the flatteners as 3.14 plays them).
            edit "$movedesign" "static final boolean FLATTENER_OFF = true;" "static final boolean FLATTENER_OFF = false;"
            version="${version}fo" ;;
        nowall)
            # SHIELD-14 off: 3.15's shipped wall shot undone (the shield as 3.14 plays it).
            edit "$design" 'parse("wall,hold,learn,mode,stay")' 'parse("hold,learn,mode,stay")'
            version="${version}xs" ;;
        ramheat)
            edit "$movedesign" "static final boolean RAM_HEAT = false;" "static final boolean RAM_HEAT = true;"
            version="${version}rh" ;;
        rambrk)
            edit "$movedesign" "static final boolean RAM_BREAK = false;" "static final boolean RAM_BREAK = true;"
            version="${version}rk" ;;
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
        surfb)
            edit "$movedesign" "static final boolean STOP_POINT_SURF = false;" "static final boolean STOP_POINT_SURF = true;"
            version="${version}sb" ;;
        aimmix)
            edit "$movedesign" "static final boolean AIM_MIX = false;" "static final boolean AIM_MIX = true;"
            version="${version}am" ;;
        mimics)
            edit "$movedesign" "static final boolean MIMICS = false;" "static final boolean MIMICS = true;"
            version="${version}gm" ;;
        aimmem)
            # Ships on from 3.20; the arm stays buildable for the older cards.
            grep -qF "static final boolean AIM_MEMBERS = true;" "$movedesign" \
                || edit "$movedesign" "static final boolean AIM_MEMBERS = false;" "static final boolean AIM_MEMBERS = true;"
            version="${version}km" ;;
        noaim)
            edit "$movedesign" "static final boolean AIM_MEMBERS = true;" "static final boolean AIM_MEMBERS = false;"
            version="${version}kx" ;;
        aimp3)
            edit "$aimmembers" "static final double AIM_PRIOR = 0.1;" "static final double AIM_PRIOR = 0.3;"
            version="${version}q3" ;;
        aimp1)
            edit "$aimmembers" "static final double AIM_PRIOR = 0.1;" "static final double AIM_PRIOR = 1.0;"
            version="${version}q1" ;;
        aimbhb)
            # On for the next census (PR #480); the arm stays buildable for the older cards.
            grep -qF "static final boolean AIM_INTERCEPTS = true;" "$movedesign" \
                || edit "$movedesign" "static final boolean AIM_INTERCEPTS = false;" "static final boolean AIM_INTERCEPTS = true;"
            version="${version}ki" ;;
        aimwide)
            grep -qF "static final boolean WIDE = true;" "$aimmembers" \
                || edit "$aimmembers" "static final boolean WIDE = false;" "static final boolean WIDE = true;"
            version="${version}kw" ;;
        sgoff)
            edit "$movedesign" "static final boolean AIM_INTERCEPTS = true;" "static final boolean AIM_INTERCEPTS = false;"
            edit "$aimmembers" "static final boolean WIDE = true;" "static final boolean WIDE = false;"
            version="${version}kj" ;;
        aesrec)
            edit "$movedesign" "static final boolean AES_RECORD = false;" "static final boolean AES_RECORD = true;"
            version="${version}ar" ;;
        oracle)
            edit "$movedesign" "static final boolean ORACLE_RECORD = false;" "static final boolean ORACLE_RECORD = true;"
            version="${version}or" ;;
        skrec)
            edit "$movedesign" "static final boolean SURF_KEY_RECORD = false;" "static final boolean SURF_KEY_RECORD = true;"
            version="${version}kr" ;;
        close200)
            edit "$src/hadur-core/src/main/java/$pkg/core/gun/GunController.java" "static final double CLOSE_RANGE = 150.0;" "static final double CLOSE_RANGE = 200.0;"
            edit "$src/hadur-core/src/main/java/$pkg/core/gun/GunController.java" "static final double CLOSE_POWER = 2.95;" "static final double CLOSE_POWER = 3.0;"
            version="${version}cr" ;;
        absurf)
            edit "$powerdesign" "static final boolean ANTI_BASIC_SURFER = false;" "static final boolean ANTI_BASIC_SURFER = true;"
            version="${version}ab" ;;
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
        t6n)
            version="${version}dn"
            edit "$danger" "public static final boolean NEAREST = false;" "public static final boolean NEAREST = true;"
            ;;
        t6l)
            version="${version}dl"
            edit "$danger" "public static final boolean LEARNED = false;" "public static final boolean LEARNED = true;"
            ;;
        tmsoft)
            version="${version}ms"
            edit "$modes" "public static final boolean FORCE_SOFT = false;" "public static final boolean FORCE_SOFT = true;"
            ;;
        tmgang)
            version="${version}mg"
            edit "$modes" "public static final boolean FORCE_GANG = false;" "public static final boolean FORCE_GANG = true;"
            ;;
        tmfin)
            version="${version}mf"
            edit "$modes" "public static final boolean FORCE_FINISH = false;" "public static final boolean FORCE_FINISH = true;"
            ;;
        tmlearn)
            version="${version}ml"
            edit "$modes" "public static final boolean FORCE_LEARN = false;" "public static final boolean FORCE_LEARN = true;"
            ;;
        tmpack)
            version="${version}mp"
            edit "$modes" "public static final boolean FORCE_PACK = false;" "public static final boolean FORCE_PACK = true;"
            ;;
        tmscreen)
            version="${version}mx"
            edit "$modes" "public static final boolean FORCE_SCREEN = false;" "public static final boolean FORCE_SCREEN = true;"
            ;;
        tmpool)
            version="${version}mo"
            edit "$modes" "public static final boolean FORCE_POOL = false;" "public static final boolean FORCE_POOL = true;"
            ;;
        tmdis)
            version="${version}md"
            edit "$modes" "public static final boolean FORCE_DISABLED = false;" "public static final boolean FORCE_DISABLED = true;"
            ;;
        tmfire)
            version="${version}mb"
            # TMODE-12 ships MATEFIRE since team step C; on older source (--ref) force it on.
            if ! grep -qF "public static final boolean FORCE_MATEFIRE = true;" "$modes"; then
            edit "$modes" "public static final boolean FORCE_MATEFIRE = false;" "public static final boolean FORCE_MATEFIRE = true;"
            fi
            ;;
        tmnofire)
            version="${version}nmb"
            edit "$modes" "public static final boolean FORCE_MATEFIRE = true;" "public static final boolean FORCE_MATEFIRE = false;"
            ;;
        tmhunt)
            version="${version}mh"
            # TMODE-14 ships HUNT; on older source (--ref) force it on.
            if ! grep -qF "public static final boolean FORCE_HUNT = true;" "$modes"; then
            edit "$modes" "public static final boolean FORCE_HUNT = false;" "public static final boolean FORCE_HUNT = true;"
            fi
            ;;
        tmnohunt)
            version="${version}nmh"
            edit "$modes" "public static final boolean FORCE_HUNT = true;" "public static final boolean FORCE_HUNT = false;"
            ;;
        tmlines)
            version="${version}ml"
            edit "$modes" "public static final boolean FORCE_LINES = false;" "public static final boolean FORCE_LINES = true;"
            ;;
        tmgunline)
            version="${version}mgl"
            edit "$modes" "public static final boolean FORCE_GUNLINE = false;" "public static final boolean FORCE_GUNLINE = true;"
            ;;
        tmgunlinew)
            version="${version}mglw"
            edit "$modes" "public static final boolean FORCE_GUNLINE = false;" "public static final boolean FORCE_GUNLINE = true;"
            edit "$mrm" "static final double GUNLINE_K = 0.4;" "static final double GUNLINE_K = 1.0;"
            edit "$mrm" "static final double GUNLINE_HALF = 70;" "static final double GUNLINE_HALF = 100;"
            ;;
        tmlinesw)
            version="${version}mlw"
            edit "$modes" "public static final boolean FORCE_LINES = false;" "public static final boolean FORCE_LINES = true;"
            edit "$mrm" "static final double LINES_K = 0.3;" "static final double LINES_K = 0.6;"
            edit "$mrm" "static final double LINES_HALF = 0.3;" "static final double LINES_HALF = 0.45;"
            ;;
        tmwk)
            version="${version}wk"
            edit "$mrm" "double sigma = Math.max(1e-3, half / 2);" "double sigma = Math.max(1e-3, half * 2.5);"
            ;;
        tmwaves)
            version="${version}mw"
            edit "$modes" "public static final boolean FORCE_WAVES = false;" "public static final boolean FORCE_WAVES = true;"
            ;;
        thunt250|thunt200)
            r="${a#thunt}"; version="${version}hr${r:0:2}"
            edit "$mrm" "static final double HUNT_RADIUS = 350;" "static final double HUNT_RADIUS = $r;"
            ;;
        tmrear)
            version="${version}mr"
            edit "$modes" "public static final boolean FORCE_REAR = false;" "public static final boolean FORCE_REAR = true;"
            ;;
        tmtab|tmlock)
            if [[ "$a" == tmtab ]]; then table="${TEAM_MODE_TABLE:-$here/work/team-modes-screen.java}"; version="${version}${TEAM_MODE_SUFFIX:-mt}"
            else table="${TEAM_MODE_LOCKED:-$here/work/team-modes-locked.java}"; version="${version}mk"; fi
            [[ -f "$table" ]] || { echo "ablation $a: no table file $table" >&2; exit 1; }
            # After the shipped entries, so a picked line for a team the table already names wins
            # (team_modes.py --shipped keeps that entry's modes in the line).
            edit "$modes" "        return Collections.unmodifiableMap(t);" "$(cat "$table")
        return Collections.unmodifiableMap(t);"
            ;;
        tmpath)
            version="${version}mp"
            # TMODE-28 ships PATH; on older source (--ref) force it on.
            if ! grep -qF "public static final boolean FORCE_PATH = true;" "$modes"; then
            edit "$modes" "public static final boolean FORCE_PATH = false;" "public static final boolean FORCE_PATH = true;"
            # The teams the table already names play PATH on top of their entry.
            sed -i -E 's/^(        t\.put\("[^"]+", of\(.*)\)\);$/\1, Mode.PATH));/' "$modes"
            fi
            ;;
        tmnopath)
            version="${version}nmp"
            edit "$modes" "public static final boolean FORCE_PATH = true;" "public static final boolean FORCE_PATH = false;"
            # Wherever an earlier ablation (tmtnear) left PATH in a named entry.
            sed -i -E '/^        t\.put\(/s/, Mode\.PATH([,)])/\1/' "$modes"
            ;;
        tmdodge)
            version="${version}dg"
            # TMODE-30 ships DODGE; on older source (--ref) force it on.
            if ! grep -qF "public static final boolean FORCE_DODGE = true;" "$modes"; then
            edit "$modes" "public static final boolean FORCE_DODGE = false;" "public static final boolean FORCE_DODGE = true;"
            # The teams the table already names play DODGE on top of their entry.
            sed -i -E 's/^(        t\.put\("[^"]+", of\(.*)\)\);$/\1, Mode.DODGE));/' "$modes"
            fi
            ;;
        tmnododge)
            version="${version}ndg"
            edit "$modes" "public static final boolean FORCE_DODGE = true;" "public static final boolean FORCE_DODGE = false;"
            # Wherever an earlier ablation left DODGE in a named entry.
            sed -i -E '/^        t\.put\(/s/, Mode\.DODGE([,)])/\1/' "$modes"
            ;;
        tmdodgeb)
            version="${version}db"
            edit "$dodge" "static final boolean RANK_BULLETS = false;" "static final boolean RANK_BULLETS = true;"
            ;;
        tmdodgef)
            version="${version}of"
            # TMODE-30 ships OWN_FIRE; on older source force it on.
            grep -qF "static final boolean OWN_FIRE = true;" "$dodge" \
                || edit "$dodge" "static final boolean OWN_FIRE = false;" "static final boolean OWN_FIRE = true;"
            ;;
        tmnoof)
            version="${version}nof"
            edit "$dodge" "static final boolean OWN_FIRE = true;" "static final boolean OWN_FIRE = false;"
            ;;
        tmtnear)
            version="${version}tn"
            n="$(grep -cE '^        t\.put\("myl\.micro\.Troodon(Droid)?", of\(' "$modes" || true)"
            [[ "$n" == 2 ]] || { echo "ablation tmtnear: found $n Troodon entries in $modes" >&2; exit 1; }
            sed -i -E 's/^(        t\.put\("myl\.micro\.Troodon(Droid)?", of\(.*)\)\);$/\1, Mode.NEAR));/' "$modes"
            ;;
        tram)
            version="${version}rm"
            edit "$fgun" "if (!finisher && rams(e, me)) continue;" "if (!finisher && !onTeam && rams(e, me)) continue;"
            ;;
        tlaneo)
            version="${version}lo"
            # WEAVE-9 ships since team step C; on older source (--ref) install Ogi's lane as step C benched it.
            if ! grep -qF "static final boolean NARROW_LANE = true;" "$tlink"; then
            edit "$tlink" "        double dx = Math.sin(in.gunHeading());" "        if (true) {
            double gun = in.gunHeading();
            double target = Double.POSITIVE_INFINITY;
            if (world != null) for (EnemyInfo e : world.alive()) {
                if (e.location == null) continue;
                double d = e.location.distance(in.x(), in.y());
                double off = Math.abs(Angles.normalRelativeAngle(Math.atan2(e.location.x - in.x(), e.location.y - in.y()) - gun));
                if (off <= Math.atan2(36, d) && d < target) target = d;
            }
            for (Roster.Mate m : roster.living(in.time())) {
                double d = Math.hypot(m.x() - in.x(), m.y() - in.y());
                if (d >= target) continue;
                double off = Math.abs(Angles.normalRelativeAngle(Math.atan2(m.x() - in.x(), m.y() - in.y()) - gun));
                if (off <= Math.atan2(30, d)) return false;
            }
            return true;
        }
        double dx = Math.sin(in.gunHeading());"
            fi
            ;;
        tlook)
            version="${version}lk"
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/MeleeRadar.java" "public static final boolean TEAM_LOOK = false;" "public static final boolean TEAM_LOOK = true;"
            ;;
        tlanep)
            version="${version}lp"
            edit "$tlink" "static final boolean NARROW_PREDICT = false;" "static final boolean NARROW_PREDICT = true;"
            ;;
        tlaneb)
            version="${version}lb"
            edit "$tlink" "static final boolean NARROW_BEYOND = false;" "static final boolean NARROW_BEYOND = true;"
            ;;
        tlanew)
            version="${version}lw"
            edit "$tlink" "static final boolean NARROW_LANE = true;" "static final boolean NARROW_LANE = false;"
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
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/MeleeEnergyPolicy.java" \
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
        sdmg400)
            edit "$design" "public static final double STAY_DAMAGE = 150;" "public static final double STAY_DAMAGE = 400;"
            version="${version}s4" ;;
        sdmgoff)
            edit "$design" "public static final double STAY_DAMAGE = 150;" "public static final double STAY_DAMAGE = Double.MAX_VALUE;"
            version="${version}s0" ;;
        slistdrop)
            # Gap to 2nd re-pick: the robots named one per line in $SHIELD_DROP leave ShieldListData.
            [[ -n "${SHIELD_DROP:-}" && -f "$SHIELD_DROP" ]] || { echo "slistdrop needs SHIELD_DROP=<file>" >&2; exit 2; }
            python3 -c 'import sys,json
p,f=sys.argv[1:]
names=[l.split("\t")[0].strip() for l in open(f) if l.strip() and not l.startswith("#")]
s=open(p).read()
for n in names:
    line="            %s,\n" % json.dumps(n)
    if s.count(line)!=1: sys.exit("slistdrop: %s is not on the shield list exactly once" % n)
    s=s.replace(line,"")
open(p,"w").write(s)' "$listdata" "$SHIELD_DROP" || exit 2
            version="${version}md" ;;
        slistadd)
            # Mode table v1 (docs/plan-shield-quality.md): the robots named one per line in the file
            # $SHIELD_ADD (a pick TSV's first column; blank lines and # lines skipped) join the shield list.
            [[ -n "${SHIELD_ADD:-}" && -f "$SHIELD_ADD" ]] || { echo "slistadd needs SHIELD_ADD=<file>" >&2; exit 2; }
            add="$(python3 -c 'import sys,json
names=[l.split("\t")[0].strip() for l in open(sys.argv[1]) if l.strip() and not l.startswith("#")]
print("".join("            %s,\n" % json.dumps(n) for n in dict.fromkeys(names)), end="")' "$SHIELD_ADD")"
            [[ -n "$add" ]] || { echo "slistadd: $SHIELD_ADD names no robot" >&2; exit 2; }
            python3 -c 'import sys; p,a=sys.argv[1:]; s=open(p).read(); k=s.rindex("        };"); open(p,"w").write(s[:k]+a+s[k:])' "$listdata" "$add"
            version="${version}mt" ;;
        sdodge)
            edit "$movedesign" "static final boolean SHOT_DODGE = false;" "static final boolean SHOT_DODGE = true;"
            version="${version}sg" ;;
        sdplan)
            edit "$movedesign" "static final boolean SHOT_DODGE_PLAN = false;" "static final boolean SHOT_DODGE_PLAN = true;"
            version="${version}sp" ;;
        sdkeep0)
            edit "$src/hadur-core/src/main/java/$pkg/core/move/ShotDodgePlanner.java" "public static final boolean KEEP_AWAY = true;" "public static final boolean KEEP_AWAY = false;"
            version="${version}k0" ;;
        sdplanlist)
            # DODGE-4: per-opponent planner entries; a bare name learns its expert (-1).
            [[ -n "${SHOT_DODGE_PLAN:-}" && -f "$SHOT_DODGE_PLAN" ]] || { echo "sdplanlist needs SHOT_DODGE_PLAN=<file>" >&2; exit 2; }
            add="$(python3 -c 'import sys,json,re
out=[]
for l in open(sys.argv[1]):
    l=l.split("\t")[0].strip()
    if not l or l.startswith("#"): continue
    out.append(l if re.match(r"^-?\d+ ", l) else "-1 "+l)
print("".join("            %s,\n" % json.dumps(n) for n in dict.fromkeys(out)), end="")' "$SHOT_DODGE_PLAN")"
            [[ -n "$add" ]] || { echo "sdplanlist: $SHOT_DODGE_PLAN has no line" >&2; exit 2; }
            python3 -c 'import sys; p,m,a=sys.argv[1:]; s=open(p).read(); k=s.index("        };", s.index("static String[] %s()" % m)); open(p,"w").write(s[:k]+a+s[k:])' "$tabledata" dodgePlans "$add"
            version="${version}dp" ;;
        sgo|sgo2)
            edit "$movedesign" "static final boolean STOP_AND_GO = false;" "static final boolean STOP_AND_GO = true;"
            if [[ "$a" == sgo2 ]]; then
                edit "$movedesign" "static final int STOP_AND_GO_PREFIRE = 1;" "static final int STOP_AND_GO_PREFIRE = 2;"
                version="${version}ws"
            else version="${version}wp"; fi ;;
        smovelist|saimlist|sdodgelist|sgolist|sgo2list|hjlist|gslist|sx4list|sx0list|szlist|sklist)
            # Shield part 2 (docs/plan-shield-quality.md): per-opponent opening drive or shipped aims;
            # the mode table's simple-aim dodge (DODGE-3).
            if [[ "$a" == smovelist ]]; then file="${SHIELD_MOVE:-}"; method="moves"; version="${version}mv"
            elif [[ "$a" == saimlist ]]; then file="${SHIELD_AIM:-}"; method="aims"; version="${version}ak"
            elif [[ "$a" == sdodgelist ]]; then file="${SHOT_DODGE:-}"; method="dodges"; version="${version}dg"
            elif [[ "$a" == sgolist ]]; then file="${STOP_GO:-}"; method="stopGos"; version="${version}wl"
            elif [[ "$a" == hjlist ]]; then file="${HEAT_JIT:-}"; method="heatJits"; version="${version}hl"
            elif [[ "$a" == gslist ]]; then file="${GUN_STACK:-}"; method="gunStacks"; version="${version}gl"
            elif [[ "$a" == sx4list ]]; then file="${SHIELD_EXIT4:-}"; method="exitLates"; version="${version}x4"
            elif [[ "$a" == sx0list ]]; then file="${SHIELD_EXIT0:-}"; method="exitOffs"; version="${version}x0"
            elif [[ "$a" == szlist ]]; then file="${SHIELD_STILL:-}"; method="stills"; version="${version}zl"
            elif [[ "$a" == sklist ]]; then file="${SURF_KEY:-}"; method="surfKeys"; version="${version}kl"
            else file="${STOP_GO2:-}"; method="stopGoShifts"; version="${version}wm"; fi
            [[ -n "$file" && -f "$file" ]] || { echo "$a needs SHIELD_MOVE / SHIELD_AIM / SHOT_DODGE / STOP_GO / STOP_GO2 / HEAT_JIT / GUN_STACK / SHIELD_EXIT4 / SHIELD_EXIT0 / SHIELD_STILL / SURF_KEY=<file>" >&2; exit 2; }
            add="$(python3 -c 'import sys,json
lines=[l.split("\t")[0].strip() for l in open(sys.argv[1]) if l.strip() and not l.startswith("#")]
print("".join("            %s,\n" % json.dumps(n) for n in dict.fromkeys(lines)), end="")' "$file")"
            [[ -n "$add" ]] || { echo "$a: $file has no line" >&2; exit 2; }
            python3 -c 'import sys; p,m,a=sys.argv[1:]; s=open(p).read(); k=s.index("        };", s.index("static String[] %s()" % m)); open(p,"w").write(s[:k]+a+s[k:])' "$tabledata" "$method" "$add"
            ;;
        strim)
            # 3.13: the 22 robots 3.13's shield lost to in both gate runs leave the list.
            for r in "trab.Crusader 0.1.7" "kid.Toa .0.5" "mladjo.Grrrrr 0.9" "tw.Exterminator 1.0" "suh.micro.MirrorPM 1.00" "cf.proto.Shiva 2.2" "ary.SMG 1.01" "wilson.Chameleon 0.91" "cx.micro.Smoke 0.96" "davidalves.net.DuelistMicroMkII 1.1" "AIR.iRobot 1.0" "starpkg.StarViewerZ 1.26" "rcb.Vanessa03 0" "kawigi.mini.Coriantumr 1.1" "ary.mini.Nimi 1.0" "DM.mega.Bezier 1.618fprrr" "brainfade.Fallen 0.63" "stelo.Randomness 1.1" "simonton.micro.GFMicro 1.0" "apv.NanoLauLectrikTheCannibal 1.1" "mnt.AHEB 0.6a" "nat.Hikari dev0001"; do
                edit "$listdata" "\"$r\"," '"",'
            done
            version="${version}tr" ;;
        shold|slearn|smode|sstay|sturn|swall|strial|sprior|smove|srec|sstill|snull)
            # One switch of shieldmode.ShieldDesign (SHIELD-8 to SHIELD-12) added to SHIPPED.
            case "$a" in
                shold) flag=hold; suffix=sh ;;
                slearn) flag=learn; suffix=sl ;;
                smode) flag=mode; suffix=sm ;;
                sstay) flag=stay; suffix=ss ;;
                sturn) flag=turn; suffix=st ;;
                swall) flag=wall; suffix=sw ;;
                strial) flag=trial; suffix=sy ;;
                sprior) flag=prior; suffix=sq ;;
                smove) flag=move; suffix=sv ;;
                srec) flag=rec; suffix=sk ;;
                sstill) flag=still; suffix=sz ;;
                snull) flag=all; suffix=sn ;;
            esac
            edit "$design" 'public static final ShieldDesign SHIPPED = parse("' \
                "public static final ShieldDesign SHIPPED = parse(\"$flag,"
            version="${version}${suffix}" ;;
        g24)
            # Melee Stage 2 (docs/plan-melee-top5.md): Ogi's 24 situations an opponent off a team,
            # not MGUN-7's 12. A team keeps its own K. Suffix g4.
            edit "$fgun" "public static final int MELEE_K = 12;" "public static final int MELEE_K = 24;"
            version="${version}g4" ;;
        gcrowd)
            # Melee Stage 2, MGUN-11: the field gun's situations also see the crowd. Suffix gc.
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/EnemyHistory.java" \
                "public static final boolean CROWD = false;" "public static final boolean CROWD = true;"
            version="${version}gc" ;;
        pfloor|pogi)
            # Melee firepower (docs/plan-melee-top5.md, MGUN-12/13): one MeleeEnergyPolicy crowd rule on,
            # off a team with three or more opponents only; duel and team fixtures bit for bit.
            # MGUN-13 ships on since pc-melee-ogi (BENCH-118), so pogi no longer applies on master, and
            # pfloor turns it off: crowdPower gives Ogi's rule precedence, so the floor stands in for it.
            policy="$src/hadur-core/src/main/java/$pkg/core/melee/MeleeEnergyPolicy.java"
            if [[ "$a" == pfloor ]]; then flag=CROWD_FLOOR; suffix=pf; else flag=CROWD_OGI; suffix=po; fi
            if [[ "$a" == pfloor ]] && grep -qF "public static final boolean CROWD_OGI = true;" "$policy"; then
                edit "$policy" "public static final boolean CROWD_OGI = true;" "public static final boolean CROWD_OGI = false;"
            fi
            edit "$policy" \
                "public static final boolean $flag = false;" "public static final boolean $flag = true;"
            version="${version}${suffix}" ;;
        ogi2|ogie10|ogi300)
            # Melee firepower part 2 (docs/plan-melee-top5.md, MGUN-14..16): widen MGUN-13, which
            # ships on, off a team only; duel and team fixtures bit for bit.
            # MGUN-16 ships on since 3.19, so ogi300 no longer applies on master.
            case "$a" in
                ogi2) flag=OGI_TWO; suffix=o2 ;;
                ogie10) flag=OGI_LOW; suffix=oe ;;
                ogi300) flag=OGI_WIDE; suffix=ow ;;
            esac
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/MeleeEnergyPolicy.java" \
                "public static final boolean $flag = false;" "public static final boolean $flag = true;"
            version="${version}${suffix}" ;;
        mscal)
            # ScalarR-inspired melee power (docs/bench/scalarr-melee-decompile.md, MGUN-22): off a
            # team with two or more opponents; duel and team fixtures bit for bit.
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/MeleeEnergyPolicy.java" \
                "public static final boolean SCAL_POWER = false;" "public static final boolean SCAL_POWER = true;"
            version="${version}ec" ;;
        mmix|mwpath|mshade|mbshade|msearch)
            # ScalarR-inspired surfer parts (docs/bench/scalarr-melee-decompile.md, MMOVE-16..18,
            # MMOVE-20, MMOVE-21): the melee surfer (MMOVE-15) with one part on top, off a team only;
            # duel and team bit for bit.
            case "$a" in
                mmix) flag=MELEE_MIX; suffix=wm ;;
                mwpath) flag=MELEE_PATH_DANGER; suffix=wq ;;
                mshade) flag=MELEE_SHADE; suffix=bs ;;
                mbshade) flag=MELEE_BULLET_SHADE; suffix=bw ;;
                msearch) flag=MELEE_SEARCH; suffix=fv ;;
            esac
            # The surfer ships on from 3.21, so only the part is switched on.
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/MinimumRiskMovement.java" \
                "public static final boolean $flag = false;" "public static final boolean $flag = true;"
            version="${version}${suffix}" ;;
        etab|edge|eshd)
            # The endgame hand-off (HAND-1 to HAND-3, docs/plan-melee-top5.md): what the duel plays
            # when it takes over from the melee with one opponent left, off a team only; the duel
            # never takes a hand-off in a 1v1, so the duel and team fixtures are bit for bit.
            case "$a" in
                etab) flag=ENDGAME_TABLE; suffix=et ;;
                edge) flag=ENDGAME_LEARNED_DODGE; suffix=ed ;;
                eshd) flag=ENDGAME_LEARNED_SHIELD; suffix=es ;;
            esac
            edit "$src/hadur-core/src/main/java/$pkg/core/duel/HandOffDesign.java" \
                "public static final boolean $flag = false;" "public static final boolean $flag = true;"
            version="${version}${suffix}" ;;
        mdmg|mlat)
            # Diamond-inspired crowd movement (MMOVE-22 damage memory, MMOVE-23 full lateral weight), off
            # a team only; duel and team fixtures bit for bit. MMOVE-22 ships on from 3.21 (pc-melee-dia
            # dm +0.43 +- 0.17, PR #503), so on master mdmg builds the robot as it is.
            case "$a" in
                mdmg) flag=MELEE_DAMAGE_MEMORY; suffix=dm ;;
                mlat) flag=MELEE_FULL_LATERAL; suffix=la ;;
            esac
            grep -q "public static final boolean $flag = true;" \
                "$src/hadur-core/src/main/java/$pkg/core/melee/MinimumRiskMovement.java" ||
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/MinimumRiskMovement.java" \
                "public static final boolean $flag = false;" "public static final boolean $flag = true;"
            version="${version}${suffix}" ;;
        mavg)
            # Diamond-inspired melee power (MGUN-23): off a team with three or more opponents, 3 at any
            # range while at or above the field's mean energy; duel and team fixtures bit for bit.
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/MeleeEnergyPolicy.java" \
                "public static final boolean AVG_POWER = false;" "public static final boolean AVG_POWER = true;"
            version="${version}ea" ;;
        mcross)
            # ScalarR-inspired learning (docs/bench/scalarr-melee-decompile.md, MMOVE-19): the melee
            # surfer also learns each shooter's aim from its hits on other opponents, off a team
            # only; duel and team fixtures bit for bit. Suffix xh. Ships on from 3.21 (pc-melee-scal
            # +0.19 +- 0.14, PR #484), so on master xh builds the robot as it is.
            grep -q "public static final boolean MELEE_CROSS = true;" \
                "$src/hadur-core/src/main/java/$pkg/core/melee/MeleeController.java" ||
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/MeleeController.java" \
                "public static final boolean MELEE_CROSS = false;" "public static final boolean MELEE_CROSS = true;"
            version="${version}xh" ;;
        maim|mhop|mheat|mcloser|msurf)
            # Melee crowd survival (docs/plan-melee-top5.md Stage 3, MMOVE-11..14): one
            # MinimumRiskMovement crowd switch on, off a team only; duel and team fixtures bit for bit.
            # MMOVE-15 ships on from 3.21, so on master msurf builds the robot as it is.
            case "$a" in
                maim) flag=MELEE_AIMED; suffix=ma ;;
                mhop) flag=MELEE_HOPS; suffix=mh ;;
                mheat) flag=MELEE_HEAT; suffix=mt ;;
                mcloser) flag=MELEE_CLOSER; suffix=mc ;;
                msurf) flag=MELEE_SURF; suffix=ms ;;
            esac
            grep -q "public static final boolean $flag = true;" \
                "$src/hadur-core/src/main/java/$pkg/core/melee/MinimumRiskMovement.java" ||
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/MinimumRiskMovement.java" \
                "public static final boolean $flag = false;" "public static final boolean $flag = true;"
            version="${version}${suffix}" ;;
        tmlead)
            # TMODE-31 (team only): LEAD for every team; the named teams play it on top of their entry.
            # Duel and melee fixtures bit for bit. Suffix ld.
            version="${version}ld"
            edit "$modes" "public static final boolean FORCE_LEAD = false;" "public static final boolean FORCE_LEAD = true;"
            sed -i -E 's/^(        t\.put\("[^"]+", of\(.*)\)\);$/\1, Mode.LEAD));/' "$modes"
            ;;
        tmswift)
            # TMODE-32 (team only): SWIFT for every team; the named teams play it on top of their entry.
            # Duel and melee fixtures bit for bit. Suffix sf.
            version="${version}sf"
            edit "$modes" "public static final boolean FORCE_SWIFT = false;" "public static final boolean FORCE_SWIFT = true;"
            sed -i -E 's/^(        t\.put\("[^"]+", of\(.*)\)\);$/\1, Mode.SWIFT));/' "$modes"
            ;;
        tmconcord|tmconcordr|tmconcordm|tmconcordg|tmconcordp|tmconcordh)
            # TMODE-33 (team only): CONCORD for every team; the named teams play it on top of their entry.
            # Duel and melee fixtures bit for bit. Suffix cn; one part alone: radar cnr, movement cnm, gun cng.
            concord="$src/hadur-core/src/main/java/$pkg/core/melee/TeamConcord.java"
            case "$a" in
                tmconcord) version="${version}cn" ;;
                tmconcordr) version="${version}cnr"
                    edit "$concord" "MOVE = true, RADAR = false, GUN = true;" "MOVE = false, RADAR = true, GUN = false;" ;;
                tmconcordm) version="${version}cnm"
                    edit "$concord" "MOVE = true, RADAR = false, GUN = true;" "MOVE = true, RADAR = false, GUN = false;" ;;
                tmconcordg) version="${version}cng"
                    edit "$concord" "MOVE = true, RADAR = false, GUN = true;" "MOVE = false, RADAR = false, GUN = true;" ;;
                tmconcordp) version="${version}cnp"
                    edit "$concord" "MOVE = true, RADAR = false, GUN = true;" "MOVE = false, RADAR = false, GUN = true;"
                    edit "$concord" "POWER = true, POOL = true;" "POWER = false, POOL = true;" ;;
                tmconcordh) version="${version}cnh"
                    edit "$concord" "MOVE = true, RADAR = false, GUN = true;" "MOVE = true, RADAR = false, GUN = false;"
                    edit "$concord" "NO_HUNT = false, RISK = true," "NO_HUNT = true, RISK = true," ;;
            esac
            # TMODE-34 ships CONCORD; on older source (--ref) force it on.
            if ! grep -qF "public static final boolean FORCE_CONCORD = true;" "$modes"; then
            edit "$modes" "public static final boolean FORCE_CONCORD = false;" "public static final boolean FORCE_CONCORD = true;"
            sed -i -E 's/^(        t\.put\("[^"]+", of\(.*)\)\);$/\1, Mode.CONCORD));/' "$modes"
            fi
            ;;
        tmnoconcord)
            # TMODE-34 off: CONCORD on no team, the build before it shipped. Suffix ncn.
            version="${version}ncn"
            edit "$modes" "public static final boolean FORCE_CONCORD = true;" "public static final boolean FORCE_CONCORD = false;"
            sed -i -E '/^        t\.put\(/s/, Mode\.CONCORD([,)])/\1/' "$modes"
            ;;
        tdecap)
            # MGUN-21 (team only): the field gun leans 3x on the enemy leader once its death pays;
            # duel and melee fixtures bit for bit. Suffix dc.
            edit "$fgun" "public static final boolean DECAP = false;" "public static final boolean DECAP = true;"
            version="${version}dc" ;;
        gexp|grate|gdist|gsoft)
            # Melee gun, inspired by Ogi (docs/plan-melee-top5.md, MGUN-17..20): one FieldGun switch
            # on, off a team only; duel and team fixtures bit for bit.
            case "$a" in
                gexp) flag=EXPERTS; suffix=gx ;;
                grate) flag=HIT_TARGET; suffix=gr ;;
                gdist) flag=FLAT_DISTANCE; suffix=gd ;;
                gsoft) flag=SOFT_MATCH; suffix=gv ;;
            esac
            edit "$fgun" "public static final boolean $flag = false;" "public static final boolean $flag = true;"
            version="${version}${suffix}" ;;
        e3ring|e3pow|e3far)
            # Melee Stage 1 (docs/plan-melee-top5.md, MEND-1..3): one melee.MeleeEndgame switch on,
            # acting only with two opponents left off a team; duel and team fixtures bit for bit.
            case "$a" in
                e3ring) flag=THREE_RING; suffix=er ;;
                e3pow) flag=THREE_POWER; suffix=ep ;;
                e3far) flag=THREE_FAR; suffix=ef ;;
            esac
            edit "$src/hadur-core/src/main/java/$pkg/core/melee/MeleeEndgame.java" \
                "public static final boolean $flag = false;" "public static final boolean $flag = true;"
            version="${version}${suffix}" ;;
        *) echo "unknown ablation: $a (aa, bb, nowarm, ram2, mir1, flat, shield-all, nodur, nolearn, fin, fl5, mfire, s50, away, heat, heatjit, ramheat, flaton, nowall, flt59, flt8, split, wallesc, gungate, hold650, dfac, bhb, hitclr, pkern, keep2, thgun, freegun, nodecay, stacklist, protean, pdw3, pdw8, pc10, phot, repl, absurf, pressure, pdown, pwall, pwc, silent, swall, nostore, tpost, tfocus, tfence, tshots, tpow, tpowb, mpow, mpowb, mrate, mhold, tk12, tk21, tshare0, tlane0, tlane4, tlaneo, tlanew, tlanep, tlaneb, tlook, tram, t6n, t6l, tmsoft, tmgang, tmfin, tmlearn, tmpack, tmscreen, tmpool, tmdis, tmfire, tmnofire, tmrear, tmwaves, tmwk, tmhunt, tmnohunt, tmpath, tmnopath, thunt250, thunt200, tmdodge, tmdodgeb, tmdodgef, tmnododge, tmnoof, tmnoconcord, tmtnear, tmlines, tmlinesw, tmtab, tmlock, gtol, gstick, gwhy, gwin, gk, aesrec, oracle, surfb, aimmix, mimics, shold, slearn, smode, sstay, sturn, swall, strial, sprior, smove, srec, sstill, snull, strim, slistadd, slistdrop, sdmg400, sdmgoff, smovelist, saimlist, sdodge, sdodgelist, sdplan, sdkeep0, sdplanlist, sgo, sgo2, sgolist, sgo2list, hjlist, gslist, rambrk, sx4list, sx0list, szlist, skrec, sklist, e3ring, e3pow, e3far, g24, gcrowd, pfloor, pogi, close200, ogi2, ogie10, ogi300, maim, mhop, mheat, mcloser, msurf, gexp, grate, gdist, gsoft, tdecap, tmlead, mscal, mmix, mwpath, mshade, mcross, mbshade, msearch, mdmg, mlat, mavg, etab, edge, eshd)" >&2; exit 2 ;;
    esac
done

edit "$src/hadur-robot/pom.xml" "<robot.release>$base</robot.release>" "<robot.release>$version</robot.release>"
for f in Hadur.properties HadurRecorder.properties; do
    edit "$src/hadur-robot/src/main/resources/$pkg/$f" "robot.version=$base" "robot.version=$version"
done
team="$src/hadur-robot/src/team/HadurTeam.team"
[[ -f "$team" ]] && sed -i "s/$base/$version/g" "$team"

(cd "$src" && mvn -q -B package -DskipTests -Dmaven.javadoc.skip=true)
jar="$src/hadur-robot/target/${pkg}.Hadur_${version}.jar"
python3 -c 'import sys,zipfile; print(zipfile.ZipFile(sys.argv[1]).read(sys.argv[2] + "/Hadur.properties").decode())' "$jar" "$pkg" | tr -d '\r' | grep -qx "robot.version=$version" \
    || { echo "built jar does not carry robot.version=$version" >&2; exit 1; }
mkdir -p "$here/bisect"
cp "$jar" "$here/bisect/"
teamjar="$src/hadur-robot/target/${pkg}.HadurTeam_${version}.jar"
[[ -f "$teamjar" ]] && cp "$teamjar" "$here/bisect/"
echo "built bisect/${pkg}.Hadur_${version}.jar  --robot \"${pkg}.Hadur ${version}\""
