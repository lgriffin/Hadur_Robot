# Cracking the melee top 3

Started 2026-11-02. Hadur 3.21 is 7th in the melee rumble with 69.47 APS. It is 1.98 behind 3rd
(Firestarter 71.43) and 3.25 behind 1st (ScalarR 72.72). The live data stops at 416 pairings,
because a new Robocode release breaks a bot.

## Where the gap is

`melee_gap.py`, comparing live 3.21 with Firestarter by opponent rank band:

| Band | APS gap |
|---|---|
| 1-10 | +0.10 |
| 11-30 | +0.17 |
| 31-60 | +0.24 |
| 61-100 | +0.34 |
| 101-200 | +0.70 |
| 201-300 | +0.38 |
| 301+ | +0.06 |

Hadur's survival is 18 to 20 points lower than Firestarter's in every band. The gap is field-wide
crowd survival, and no one pairing holds it: each opponent is 1/416 of the score. So per-opponent
tailoring cannot find +2 in melee the way it has in 1v1.

## The 1.11.2 cloud census of 3.21

36 fields, 1 seed. The 10 broken fields were dropped; the robots are in `hadur-bench/broken-1.11.2.txt`
and the evidence is in `melee-broken-1.11.2.md`.

- Hadur wins 58% of rounds and is in the last two in 79%.
- 21% of rounds end in a crowd death, mostly at places 3 to 5.
- 21% of rounds are lost in the endgame duel. That duel is fought at a median 694 px with power 1.0.
  Hadur hits 14% of its shots there, against 40% in the crowd.
- Against survivors ranked 31 and lower, Hadur wins 95% or more of the duels it enters ahead on
  energy, and 51-64% of those it enters behind.
- Rounds lost in the duel took 61 crowd damage, against 45 in rounds won. Both spent about 58
  energy on bullets. Hadur entered the lost duels on 29 energy and the won ones on 64.
- Against top-10 survivors Hadur wins only 43% of duels, even when ahead on energy. The duel starts
  with a cold gun and cold movement against a bot the melee has watched all battle.

## Levers tried

| Lever | What it does | Cloud smoke | Status |
|---|---|---|---|
| HAND-4 `ENDGAME_CLOSE` (arm `eclose`, suffix ek) | The endgame duel opens at 400 px, not the 650 stranger ceiling | 58 paired battles, seeds 4200-01. Distance 690 to 575 px. Hadur's duel hit rate 14.4 to 14.7%, the survivor's 9.8 to 10.9%. Duel wins +0.5 points, APS +0.12 ± 0.51 | **FAILED** on pc-melee-end (PR #591): +0.04 ± 0.23, 1-30 endgame wins +1.3 points |
| HAND-5 `ENDGAME_MELEE_GUN` (arm `emgun`, suffix eg) | In the endgame duel, the melee field gun (kNN, learned on the survivor all battle) aims and fires whenever it has learned the survivor | 56 paired battles, 28 fields, seeds 4300-01. Rounds won 54.6 to 56.2%. Duel wins 69.0 to 71.7%, against top-10 survivors 21.3 to 26.0%, against 11-30 57.2 to 61.8%. Duel hit rate level (14.0 vs 13.9%). Score share -0.12 ± 0.32, APS -0.13 ± 0.50 | **FAILED** on pc-melee-end (PR #591): -0.17 ± 0.23, 1-30 endgame wins -1.8 points |

The HAND-5 smoke ran on a build in which the duel still booked the shots the field gun held: their
waves, virtual bullets and bullet shadows. The duel also learned from the field gun's bullet outcomes.
The card runs the fixed build (PR #582 review), which decides the gun's owner before the duel drives.

Both switches act only after a melee hand-off (charter MELEE, no team link, one enemy left), so the
1v1 and the team never see them. Both ship off.

## The card

`hadur-bench/plans/pc-melee-end.queue` (BENCH-171) runs four arms (aa, bb, eg, ek) on the 46 census
fields × 6 fresh seeds (3265-3270), 1,104 battles, about 1.8 h. Each arm has fails 20 and stall 30m
stop rules. The read uses `melee_s0.py screen --base2` under the melee gate, and the card opens a
results PR on `claude/pc-melee-end-results`.

## pc-melee-end read (PR #591, 2026-11-02)

46 fields × 6 seeds, 276 battles an arm, none missing. The bb A/A copy was clean at +0.03 ± 0.16.
HAND-5 lost 0.17 ± 0.23 APS and 1.8 points of 1-30 endgame wins once the duel no longer booked its
shots: the melee kNN aims worse in a duel than the duel gun does. HAND-4 was flat at +0.04 ± 0.23.
Energy entering the endgame (54.7) and deaths with two opponents left (9.3%) did not move in any arm.
Both stay off. The endgame duel is not where the melee gap is.

## Crowd survival (both options, 2026-11-02)

From the pc-melee-end baselines (aa and bb, 19,320 rounds) and the cloud census:

- **Per opponent:** crowd deaths are spread thin. The worst killer, DemonicRage, causes 1.8% of
  4,208 crowd deaths. Hadur dies in the crowd in 24% of rounds 0-4 and 22% of rounds 5-29, so a
  saved per-opponent danger prior would win back about 0.3 points of crowd deaths at most. Not built.
- **Crowd damage:** in rounds Hadur dies in the crowd it is the nearest robot of 0.98 opponents on a
  mean crowd tick, against 0.77 in rounds it survives. The damage it takes from those opponents
  doubles, 44 against 20. Diamond and ScalarR sit at 0.50, and ScalarR takes half Hadur's crowd
  damage a tick.

MMOVE-24 `CLOSEST_FACTOR_SOLO` (arms `mnear3` n3, `mnear4` n4) raises the closest-robot factor off a
team from 2. Cloud smoke of n4 (43 paired battles, 22 fields, seeds 4400-01; the container restarted
mid-run): crowd deaths 22.1 to 19.1% of rounds (-3.0 ± 2.5), damage from opponents Hadur is nearest
to -3.0 ± 1.5 a round, score share +0.29 ± 0.30. Carded as `pc-melee-near` (BENCH-176): aa, bb, n3, n4
on 46 fields × 6 seeds (3271-3276).

The PC card rule of 2026-11-03 asks for per-opponent tailoring, a pilot that stops early and a
written case. pc-melee-near is a melee-wide switch; it was granted an exception on 2026-11-03
("Exception with a pilot"). The pilot (BENCH-178) fights n4 against aa on 46 fields × 2 seeds
(3277-3278, 184 battles, about 17% of the card); `tools/melee_pilot.py` stops the card unless the
score share is up and crowd deaths are down, and opens the results PR with its read when it stops.


## pc-melee-near read (PR #608, 2026-11-03)

46 fields × 6 seeds, 276 battles an arm, none missing. The run started before the pilot merged, so
it ran in full. The bb A/A copy was clean at +0.22 ± 0.20. n3 was flat at +0.01 ± 0.15, with 1-30
endgame wins +3.2 points and energy entering the endgame +1.2. n4 was flat at -0.03 ± 0.16, with
skips +19%. Both fail. The cloud smoke's +0.29 share did not repeat. `CLOSEST_FACTOR_SOLO` stays at
2. Crowd distance is not a lever on its own, so the melee top 3 has no switch left in this line.

## Kill the strong scorers first (2026-11-03)

The per-opponent card rule does not apply to melee, which has capacity for field-wide cards; this is an
overnight card. Melee APS is pairwise: against each opponent in a battle, Hadur's pairing is its
battle score over its score plus the opponent's. Survival dominates the score (+50 for each robot that
dies while one lives, +10 an opponent for the last alive), so a robot that keeps finishing high banks
the most points against Hadur. Each one Hadur denies it by killing it before the crowd thins lifts
that pairing even if Hadur scores no more. The field gun weighs opponents by distance, energy and
recent hits only.

MGUN-24 `STRONG_BOOST` (arms `mstr1` k1, `mstr2` k2; ships 0) multiplies an opponent's gun weight by
1 + boost × s in the crowd (three or more opponents alive), with s its mean finishing place this battle
scaled from 0 (always first to die) to 1 (always last alive), once two rounds have placed it. The risk
is that strong robots are harder to hit. Card `pc-melee-strong` (BENCH-185): aa, bb, k1, k2 on 46 fields
× 6 seeds (3280-3285); the pilot (BENCH-186) fights k2 against aa on 2 seeds (3286-3287) and stops the
card unless the score share is up (`melee_pilot.py --share-only`).

## pc-melee-strong read (PR #625, 2026-11-04)

The pilot stopped the card after 184 battles: k2 against aa on 92 pairs moved Hadur's score share
-0.11 ± 0.23 points and crowd deaths -1.4 ± 1.9 points of rounds. Leaning the gun toward the robots
that keep finishing high does not pay: what Hadur takes from them is matched by what it loses on the
easier targets it no longer shoots. `STRONG_BOOST` stays 0, and 920 battles were saved.

## Diamond's whole melee mover (cloud, 2026-11-04)

Next (2026-11-04): rebuild the crowd movement on a top bot's design. Of the top five only Diamond ships
its source (zlib licence), and it survives 68.6 live against Hadur's 55.8. MMOVE-25 (`MELEE_CLEAN`,
built on branch `claude/project-thread-s5g1cq`, never merged) put Diamond's 270-line melee mover in
place of Hadur's off a team, with Hadur's gun and radar. Cloud smoke, 46 census fields × seed 4600,
paired against 3.21: score share -1.13 ± 0.36 points, crowd deaths +5.7 ± 2.7 points of rounds.
Hadur's surfer mover outsurvives Diamond's on Hadur; the live survival gap to Diamond is not its
movement design. Not carded.

## Far power on spare energy (MGUN-25, pc-melee-far, 2026-11-04)

The diagnosis after the Diamond mover failed. In the cloud 3.21 census fields Hadur shares with the
top bots, Hadur fires about as many crowd shots at about the same hit rate, but they put 15-25% more
power into the crowd (a battle: Diamond 66 to Hadur's 54, ScalarR 90 to 72, Firestarter 67 to 57,
Neuromancer 75 to 61, DemonicRage 66 to 57) and do that much more crowd damage. Hadur's crowd damage
taken is no worse than Diamond's (59 to 64), so movement is not the gap; firepower is.

Where the power goes (Hadur's crowd shots, not finishers, three or more left):

| Range | Own energy | Share of shots | Mean power |
|---|---|---|---|
| beyond 300 px | 60 or more | 64% | 2.03 |
| beyond 300 px | 40-60 | 9% | 1.94 |
| beyond 300 px | under 40 | 9% | 1.47 |
| within 300 px | 60 or more | 16% | 2.83 |

MGUN-13 fires 1.92 beyond 300 px. Every earlier step up paid (MGUN-13 +0.62, MGUN-16 power 3 out to
300 px +0.15). ScalarR's rule (MGUN-22) scored +0.18 but cost 4.8 points of endgame wins by spending
energy, and Diamond's (MGUN-23) was flat in its cloud smoke. MGUN-25 raises far power only while
Hadur has 60 energy or more, so the endgame reserve stays: arms y3 (power 3) and y5 (power 2.5),
pilot y3 against aa with a share-only stop.

### pc-melee-far read (PR #647): MGUN-25 ships on at 2.5

Pilot y3 against aa: share +0.30 ± 0.26, so the card ran in full. Paired over aa and bb (bb clean, +0.11 ± 0.18):
y5 (power 2.5) **+0.30 ± 0.17**, low end +0.13, endgame wins +0.9, energy entering the endgame -0.2, skips +16%: PASS;
y3 (power 3) +0.19 ± 0.19, others outlived -0.8, endgame energy -0.9. FAR_SPARE ships on at power 2.5 for 3.22; the card,
its arms and plan test are removed, the melee-samples and melee-handoff fixtures re-recorded. Duel and team fixtures bit for bit.

## Far power from less spare energy (MGUN-26, pc-melee-floor, 2026-11-04)

Next after 2026-11-04: MGUN-25 (on at 2.5, PR #652) fires only from 60 energy; another 9% of crowd shots
beyond 300 px leave with 40-60 energy at about 1.94. pc-melee-floor tries the floor at 40 (z4) and 50 (z5), pilot z4 against aa.

### pc-melee-floor read (PR #656): FAIL, the floor stays 60

Pilot z4 against aa: share +0.07 ± 0.23, so the card ran in full. Paired over aa and bb (bb clean, +0.01 ± 0.19):
z4 (from 40 energy) **-0.11 ± 0.13**, others outlived -0.5; z5 (from 50) -0.00 ± 0.16, endgame wins +2.1. Neither clears
0, so spending the reserve under 60 buys nothing: the far-power lever is used up at 60. MGUN-26, the arms and the card
are removed; master keeps MGUN-25 on at 2.5 from 60 energy.

## The three-robot phase (MEND-4, MEND-5, pc-melee-three, 2026-11-08)

Leigh 2026-11-08: "Where is melee at? Its within touching distance of first lets figure this out". Live
2026-11-08: 7th 69.48; ScalarR 72.72, Neuromancer 72.13, Firestarter 71.43, Ogi 70.74, Diamond 70.10,
DemonicRage 69.97. Survival 55.8 against ScalarR's 82.7.

Where the score goes (cloud 3.21 census, 1,260 rounds): 263 rounds lost in the endgame duel, 269 in
the crowd. A crowd death gives up every opponent still alive, so the crowd costs about 3.5 times the
opponents outlived the duel does (925 against 263).

The endgame duel by energy lead at its start (opponent-adjusted: each duel's win against its
survivor's own rate over the other duels):

| Lead at the duel | Duels | Won | Survivor's own rate | Energy entering two-left | Survivor's energy | Spent with two left |
|---|---|---|---|---|---|---|
| 20+ behind | 213 | 32% | 65% | 48 | 71.5 | 18.6 on 16.6 shots |
| 0-20 behind | 180 | 65% | 69% | 55 | 44.6 | 19.4 on 16.3 shots |
| 0-20 ahead | 194 | 81% | 73% | 65 | 39.2 | 18.2 on 12.6 shots |
| 20+ ahead | 380 | 97% | 79% | 90 | 29.3 | 15.4 on 9.5 shots |

The lead is made mostly before two are left (48 against 90 energy entering it) and by who survives;
the two-left phase spends about 19 energy at about 700 px and 1.25 power in every row. Against the top
three the duel is lost even ahead (ScalarR 17%, Diamond 11% when Hadur leads), so the lever is the
middle of the field. pc-melee-three tries two ways to reach the duel nearer even: hold far shots at a
richer target (MEND-4, `mthold`) and wear down the richer of the two (MEND-5, `mtstrong`), pilot both
together. Expected +0.1 to +0.3: even all the 20+-behind duels won at the 0-20-behind rate is about +0.4.

### pc-melee-three read (PR #708): the pilot stopped the card

Both switches together against aa, 92 pairs: share -0.16 ± 0.24, crowd deaths +1.8 points of rounds. Holding
far shots and leaning on the richer robot with two left do not reach the duel better off; the energy lead is
made earlier, in the crowd. MEND-4, MEND-5, the arms and the card are removed; the melee is bit for bit master's.

## Tracing a melee round (BENCH-213, 2026-11-08)

Leigh: "Show me a diagram of our data, I want to see an example where we are nearest compared to other bots.
Tracing is a good addition to our harness." `--melee-trace true` makes a melee battle write `trace.log.gz`
(every robot and bullet, every turn), and `tools/melee_trace_draw.py BATTLE --round N --out PNG` draws the
field at four ticks with an arrow from each robot to its nearest, plus the round's timeline of how many
robots have Hadur as their nearest against the field's mean, Hadur's energy and its death. First cloud
battle (field f24, seed 4400, 6 rounds, /mnt/project-files/melee/trace-f24-round*.png): in the two crowd
deaths Hadur holds a corner, loses 40 energy to shots while nobody's nearest, then from about tick 370 the
nearest opponent (Corsair) hunts it along the edge until two robots share it as nearest and it dies at 6
energy. The trace is the input for the death-forensics pass.

## The hide posture (MHIDE-1..3, 2026-11-08): three cloud smokes, all losses, not merged

The question from the traces was whether Hadur should use the field's empty spaces to hide and survive until
the crowd thins. Built as a switch on the thread branch:
with five or more alive, or three or more and Hadur under the median energy, the mover's candidates gained a
7 × 7 field grid and each point paid 2 units of risk for every opponent it would make Hadur the nearest of,
and the gun held unless the target was a finisher or already had Hadur as its nearest robot. Cloud smokes,
12 census fields × 2 seeds (24 paired battles) against aa:

| Build | Score share | Crowd deaths (points of rounds) | Rounds won | Damage a crowd tick | Nearest load |
|---|---|---|---|---|---|
| both (hd) | -3.91 ± 0.61 | +19.8 | -16.9 | +35% | 0.82 → 0.87 |
| movement only (hm) | -1.52 ± 0.69 | +9.9 | -8.1 | +25% | 0.82 → 0.86 |
| fire hold only (hf) | -2.10 ± 0.50 | +5.4 | -7.0 | +7% | level |

Hiding kills Hadur faster on both halves. The grid drives cross the field through other robots' fire, and the
nearest-robot term did not even lower the nearest load; holding fire leaves the crowd stronger for longer and
gives up the bullet-damage half of the score. The one melee lever that has paid since 3.19 is the opposite:
more firepower in the crowd (MGUN-13, MGUN-16, MGUN-25). The code was never merged; nothing to remove.

## What the surfer saw of the shots that hit us (MMOVE-26, 2026-11-08)

The hide study left one question: how much of the damage Hadur takes comes from shots its surfer never
weighed? Each hit on Hadur off a team now writes an `MH` record (`MH,round,tick,shooter,damage,distance,
seen,nearer,weight,alive`): whether a shot the World inferred matches the hit, how many living opponents
were nearer the shooter than Hadur when it fired, and the crowd weight 1/(1+k)^2 the surfer gave it
(MMOVE-15; shots under 0.1 make no virtual bullets). `tools/melee_hits.py DIR` aggregates the records of a
bench's battles.

Twelve census fields, one battle of 35 rounds each, master with the record (mean APS 69.0):

| what the surfer saw of the shot | hits | damage | share |
|---|---:|---:|---:|
| inferred shot, weight >= 0.1 (surfed) | 2219 | 16424 | 61% |
| inferred shot, weight < 0.1 (dropped as aimed at someone nearer the shooter) | 376 | 4357 | 16% |
| no inferred shot matches the hit (never surfed) | 711 | 6330 | 23% |

| alive | damage | surfed | dropped | unseen |
|---:|---:|---:|---:|---:|
| 9 | 4466 | 48% | 30% | 21% |
| 8 | 3768 | 48% | 26% | 26% |
| 7 | 2782 | 50% | 25% | 26% |
| 6 | 2499 | 51% | 20% | 29% |
| 5 | 2904 | 54% | 16% | 30% |
| 4 | 3072 | 63% | 12% | 25% |
| 3 | 2771 | 80% | 0% | 20% |
| 2 | 2844 | 87% | 0% | 13% |
| 1 | 1901 | 85% | 0% | 15% |

Of the damage from inferred shots, 48% (10,045 of 20,781) came from a shooter that had at least one robot
nearer it than Hadur, so the surfer had given the shot a quarter of its weight or less. By shooter that share
runs from 21% (Figment, which mostly shoots its nearest) to 68% (ACPFinal), with Diamond 36%, Combat 47%,
DemonicRage 48%, Portia 54%, Scimitar 59% and JollyNinja 67%: half the field picks a target by something other
than distance. (This run's records recomputed the weight at impact from the living opponents and counted a
killing bullet's full damage; the record now carries the weight the surfer itself gave the shot and caps the
damage at Hadur's energy. Rows with one opponent alive are the endgame duel, which the duel drives.)

Read: in the crowd (five or more alive, where the deaths that cost the rank happen) about half the damage
Hadur takes is from shots its surfer weighed at a quarter or less, or never saw. The nearest-robot crowd
weight is the wrong model for half the shooters, and a quarter of the hits match no inferred shot at all.
The next melee lever is the danger model, not the mover's geometry or its posture: a per-shooter target
model (who each robot actually shoots at, learned from the trace or from its hits) in place of 1/(1+k)^2,
and a look at why a quarter of the hits have no shot to match (scan gaps, energy drops masked by damage).

## The field's target curve (MMOVE-27, pc-melee-curve, 2026-11-08)

The MH read above says the surfer never weighed 39% of the damage Hadur takes. The other side of that is
who the field actually shoots at. `tools/melee_targets.py` reads it from melee traces (BENCH-213): for every
bullet that first appears, the living robot whose head-on or linear bearing from the shooter lies nearest
the bullet's heading, filed by that robot's distance rank from the shooter. Twelve traced census fields,
20 rounds each, 63,408 opponent shots (7% match no robot within 12 degrees):

| target's distance rank from the shooter (0 = nearest) | shots | share | surfer weight 1/(1+k)^2 |
|---:|---:|---:|---:|
| 0 | 18438 | 41% | 1.00 |
| 1 | 7873 | 17% | 0.25 |
| 2 | 5233 | 12% | 0.11 |
| 3 | 3876 | 9% | 0.06 |
| 4 | 3028 | 7% | 0.04 |
| 5 to 8 | 6651 | 15% | 0.03 to 0.01 |

| robots nearer the shooter than Hadur | shots with Hadur there | at Hadur | share | surfer weight |
|---:|---:|---:|---:|---:|
| 0 | 5584 | 2667 | 48% | 1.00 |
| 1 | 7031 | 1400 | 20% | 0.25 |
| 2 | 7336 | 1011 | 14% | 0.11 |
| 3 | 5978 | 734 | 12% | 0.06 |
| 4 | 5027 | 592 | 12% | 0.04 |
| 5 | 4290 | 416 | 10% | 0.03 |
| 6 | 3538 | 328 | 9% | 0.02 |
| 7 | 2785 | 240 | 9% | 0.02 |
| 8 | 2000 | 130 | 6% | 0.01 |

A shot goes to the shooter's nearest robot 41% of the time. The 1/(1+k)^2 weight is right at k = 0 and
k = 1, a third low at k = 2, and from k = 3 up it falls under the 0.1 floor, so the surfer dropped every
such shot: a third of the shots aimed at Hadur. Per shooter the nearest share runs from 24% (Original) and
28% (Diamond) to 72% (Numbat); Diamond, Portia, Lunar and Glacier put 42 to 50% of their shots at their
third-nearest or further.

MMOVE-27 (`CROWD_CURVE`, arm `mcurve`, suffix cv) replaced 1/(1+k)^2 with that curve scaled to 1 at
k = 0: 1, 0.42, 0.29, 0.25, 0.25, 0.21, 0.19, 0.19, 0.15, so no seen shot fell under the floor.

Cloud smoke 2026-11-08, 12 census fields x 2 seeds against master, 24 pairs:

| measure | cv | master | diff |
|---|---:|---:|---:|
| score share | 19.43 | 18.96 | +0.47 ± 0.34 |
| crowd deaths (%) | 23.2 | 26.2 | -3.0 ± 3.3 |
| rounds won (%) | 51.2 | 47.4 | +3.8 ± 4.0 |
| crowd damage per tick (x100) | 7.80 | 8.16 | -0.35 ± 0.46 |
| skipped turns a battle | 43.9 | 28.1 | more virtual bullets |

The first melee smoke since the surfer itself with a low end above 0, at a CPU cost: every seen shot made
bullets, and skipped turns rose by half on the slow cloud box. Card pc-melee-curve (BENCH-215, pilot
BENCH-216) took it to the PC: a cv-against-aa pilot on the 46 census fields x 2 seeds (3326-3327), then aa,
bb and cv alone at 6 seeds (3320-3325) if the pilot's share was up.

### pc-melee-curve read (PR #715): the pilot stopped the card

| measure (cv minus aa, 92 paired battles, 46 fields x 2 seeds) | read |
|---|---:|
| score share | -0.05 ± 0.26 |
| crowd deaths (points of rounds) | +0.16 ± 2.05 |

No gain and no harm: the interval spans zero, and the cloud smoke's +0.47 centre lies above its upper end.
The pilot gives skipped turns for both arms together (about 48 a battle, 184 battles, none failed), so cv's
own skip cost was never read on the PC. The third melee cloud smoke to over-read the PC (pc-melee-near,
pc-melee-three, pc-melee-curve), and the third melee card in a row to stop at its pilot. CROWD_CURVE, the
`mcurve` arm, the card and its test are removed; MMOVE-27, BENCH-215 and BENCH-216 are retired.
`tools/melee_targets.py` and the MH record stay: the target fit is a fact about the field, and the lesson
is that weighing every seen shot by the field-wide curve does not turn it into points. What it says for
the next step: the curve is flat from k = 3 up (12% to 7%), so the surfer gains little from telling those
shots apart by k alone; a per-shooter table (Diamond, Portia, Lunar and Glacier put 42 to 50% of their
shots at their third-nearest or further, Figment and Numbat shoot nearest) or the 23% of hits no inferred
shot matches are the parts of the danger model still unread.

## The hits no inferred shot matches (MSENSE-3, the energy ledger, 2026-11-09)

The MH read (MMOVE-26) left 23% of the damage Hadur takes with no inferred shot behind it. To see why, the 12
census fields were fought again (seed 5300, 20 rounds) with the recorder, so Hadur's own scans and hit events
(the replay transcript) sit beside the trace's truth of every bullet. Every one of the 1,831 hits found its
bullet in the trace, so each unseen hit can be put against the two scans of its shooter that bracket the fire.

| why the inferred shot is missing | hits | damage | share of unseen damage |
|---|---:|---:|---:|
| another robot's bullet hit the shooter in the same scan gap (drop over 3, read as damage) | 71 | 755 | 30% |
| the shooter's own bullet hit another robot in the gap (3 x power back, read as a gain) | 60 | 642 | 26% |
| the shooter's own bullet hit Hadur in the gap (3 x power back; Hadur knows this one exactly) | 47 | 360 | 14% |
| the shooter was not scanned again before the bullet arrived | 28 | 242 | 10% |
| both: hit and landed in the gap | 20 | 217 | 9% |
| drop over 3 with no bullet event in the trace (wall or ram) | 17 | 167 | 7% |
| other | 22 | 118 | 4% |

The same classifier over the 1,569 seen hits puts 95% of them in "drop equals the power", so the split is
sound. Over every pair of consecutive scans of every robot (238,400 pairs, 54,225 with a shot in the gap),
MSENSE-2 reads the shot cleanly 80% of the time; the lost fifth splits the same way: the shooter's bullet
landed on another robot 38% (its shot was itself tracked in two thirds of those), the shooter was hit 29%
(the hitting shot tracked in 70%), two bullet events in one gap 12%, wall or ram 8%, its bullet hit Hadur 5%.
A drop over 3 with the shooter's gun cool holds a shot 73% of the time; with the gun hot, never.

MSENSE-3 (`MeleeController.ENERGY_LEDGER`, arm `mledger`, suffix lg) books what Hadur knows of those
changes. A hit on Hadur by a shooter of power q gives it 3q, exactly. A drop over 3 is put against the one
other tracked shot whose wave reached the shooter between its two scans (the same geometry as MMOVE-19), and
what is left over the bullet's damage is the shot. A gain is put against the one tracked shot of the shooter's
own whose wave reached another living robot in the gap, and 3 x its power less the gain is the shot. A shot is
read only when one power explains the change, that power is a bullet's, and the shooter's gun, by its last
tracked shot, could have cooled. The ledger's own measure is the MH record: the unseen share should fall from
23% to about 10%.

### First read of the ledger (cloud, 2026-11-09)

Paired smoke, the 12 census fields x 2 seeds (seed 5500, 35 rounds), `mledger` against the A/A build:

| measure | ledger | baseline | diff |
|---|---:|---:|---:|
| score share | | | +0.23 ± 0.39 |
| crowd deaths per 100 rounds | | | -3.7 ± 3.7 |
| crowd damage per tick | | | -0.45 ± 0.60 |
| skipped turns (sum) | 606 | 607 | none |
| MH: hits with no inferred shot, share of damage | 14% | 20% | |
| MH: hits surfed | 64% | 59% | |

The recorded and traced run of the same 12 fields with the ledger on (seed 5300, 20 rounds) put the unseen
damage at 12.0% against 16.6% off, and showed what the ledger still missed. The hits on Hadur the shooter
earned back were all but gone (47 to 12 hits) and its landings on other robots halved (60 to 38), but a
shooter hit by another robot's bullet stayed where it was (71 to 69 hits, 43% of the damage still unseen).
The cause was the "exactly one candidate" rule: when a shooter is hit, two to five tracked waves of two to five
different powers straddle it in its scan gap (68 of 69 cases had the true wave among them, none had it alone).
Filtering the candidates by what their damage leaves of the drop (a bullet's power, or nothing) leaves one
power in 39 of the 69, two in 13, none in 13. The ledger now reads that way on both branches.

### Second read (2026-11-09): the sensing is fixed, the score does not move

With the residual filter the recorded run's unseen damage fell to 10.1% (1,506 of 14,873), the figure the
first study predicted: a hit shooter 71 to 37 hits, its own landing 60 to 22, its hit on Hadur 47 to 5. What is
left is a drop over 3 with no bullet event in the trace (wall or ram, 25%), a shooter not scanned again before
its bullet arrived (12%), and the hit shooters where two powers still fit (27%). The MH record of the second
paired smoke (seed 5600, 24 pairs) says the same: hits with no inferred shot 20% to 10% of damage, surfed 60%
to 67%, dropped as aimed elsewhere 20% to 23%.

| paired smoke, 12 census fields x 2 seeds | share | crowd deaths per 100 rounds |
|---|---:|---:|
| seed 5500 | +0.23 ± 0.39 | -3.7 ± 3.7 |
| seed 5600 (residual filter) | -0.22 ± 0.50 | +3.0 ± 4.7 |
| pooled, 48 pairs | +0.01 ± 0.32 | |

Skipped turns per battle were the same in both arms. Verdict: seeing one shot in ten more does not change the
melee score. The surfer already had the waves that mattered; the hits it takes come from waves it had and
weighed wrong (23% of damage is a shot it held under weight 0.1 because other robots stood nearer the shooter)
or surfed and still took (67%). The lever is in the weighing and the choice, not in the sensing. MSENSE-3 is not
carded for the PC and does not ship: the ledger code, its arm and its requirement were taken out of the PR
(the no-dead-switch rule); the study and tools stay as the record, and the code is in the branch history.

Tools: scratchpad `ms/unseen.py` (hits against the trace and transcript), `ms/gaps.py` (every scan pair),
`ms/cadence.py` (each robot's power constancy, 69%, and how often it fires within a tick of its gun cooling, 84%).

## Where the bullets at Hadur go, and what the surfer learns (2026-11-09)

Three reads of the ledger-on recorded run (12 census fields, seed 5300, 20 rounds, 52,000 traced shots) and the
MH record of the seed-5600 paired smoke, taken after the ledger showed that sensing is not the lever.

**Who a shooter aims at.** A bullet's target is the living robot nearest its heading at the fire (within 25
degrees). Given k robots nearer the shooter than Hadur, the chance it is aimed at Hadur is 0.45, 0.18, 0.13,
0.11, 0.11, 0.09 for k = 0 to 5, close to MMOVE-15's 1/(1+k)^2. Shooters persist: when a shooter's previous
shot was at Hadur, the next is at Hadur with 0.51 against the base 0.16, at every k (0.76, 0.50, 0.44, 0.37
for k = 0 to 3). The aim of a miss is unknowable in battle, but the shooter's last landed bullet is: when it
landed on Hadur (onHitByBullet, exact) the next shot is at Hadur with 0.60, 0.33, 0.28, 0.20 for k = 0 to 3,
against 0.41, 0.15, 0.12, 0.11 when it landed on another robot. The signal is real but thin where it would
matter: of the 335 hits on Hadur from shots held under the 0.1 floor (k of 3 or more), 27 came from a shooter
whose last bullet had landed on Hadur.

**Where the bullets go.** For the 10,164 bullets aimed at Hadur with three or more robots alive, the guess
factor (GF; +1 is the full escape angle in Hadur's direction of travel, the linear aim):

| GF band | of all bullets at Hadur | of the 1,546 that hit |
|---|---:|---:|
| within 0.1 of head-on (0) | 38% | 27% |
| 0.2 to 0.9 (between the two default guesses) | 36% | 52% |
| within 0.1 of the linear aim | 19% | 27% |
| behind Hadur (GF under -0.1) | 15% | 13% |

The surfer's default guesses are head-on and linear (MMOVE-15), each carrying the shot's weight; nothing sits
between them, where half the hits land. Near shooters (under 300 px) spread further toward the linear aim.

**What the learned aims buy.** Once a shooter's log holds five hits on Hadur, its shot's danger is its four
nearest learned aims in place of the guesses. Crowd damage taken per round, 24 master battles of 35 rounds:

| rounds | 0-4 | 5-9 | 10-14 | 15-19 | 20-24 | 25-29 | 30-34 |
|---|---:|---:|---:|---:|---:|---:|---:|
| damage per round | 51.5 | 52.0 | 50.3 | 49.9 | 53.7 | 46.0 | 48.9 |
| hits per round | 5.10 | 4.95 | 4.86 | 5.04 | 5.16 | 4.42 | 4.72 |

Flat. The ledger arm reads the same (58.7 in rounds 0-4, 56.3 in rounds 30-34). Whatever the melee surfer
learns from a shooter's hits does not lower the hits it takes from that shooter later in the battle.

**Cloud arms (seed 5700, 12 fields x 2 seeds each, paired against master):** `mnolearn` (the guesses are never
replaced by learned aims), `mmid` (a third default guess at GF 0.4, `MinimumRiskMovement.MID_GUESS`), and both.
Read (24 pairs each): `mnolearn` -0.28 ± 0.59 share, crowd deaths +4.6 ± 4.4 per 100 rounds;
`mmid` +0.15 ± 0.49, crowd deaths -1.3 ± 3.7; both -0.23 ± 0.39. Neither moves the score at this size; the
learned aims may be worth a few crowd deaths, and a third guess buys nothing visible. The arms and the
`MID_GUESS` constant were removed. Four wave-model changes in a row (weights, sensing, aims, learning) read
flat on the cloud: the melee gap is not in the wave model. Tools: scratchpad `ms-lg2/persist3.py`, `ms-lg2/gf.py`.

## ScalarR and Hadur in the same crowds (2026-11-09)

The 12 census fields were fought again (seed 5800, 20 rounds, traced) with ScalarR 0.005g.047 seated in each in
place of the field's lowest-ranked robot, so both robots stand in the same ten-robot crowds. Over 240 rounds each,
ticks with three or more alive (scratchpad `sc/posture.py`, `sc/guns.py`, `sc/targets.py`, `sc/shadow.py`):

| in the crowd | ScalarR | Hadur |
|---|---:|---:|
| score share in these battles | 20.2 | 16.2 |
| survival score / bullet damage score per battle | 7,883 / 2,968 | 7,062 / 2,366 |
| mean place, deaths in the crowd (4+ alive) | 1.95, 14% | 2.76, 21% |
| damage taken / dealt per round | 54 / 164 | 67 / 130 |
| distance to the nearest robot | 521 px | 443 px |
| robots within 400 px | 0.65 | 0.91 |
| robots whose nearest robot it is | 0.66 | 0.91 |
| wall room; share of ticks in a corner (both walls under 150 px) | 51 px; 43% | 102 px; 17% |
| speed; energy | 5.3; 68 | 6.2; 59 |
| bullets aimed at it (within the escape angle), per 240 rounds | 6,976 | 7,917 |
| of those: hit it / taken by another robot on the way | 13% / 9% | 12% / 8% |
| shots per round; mean power; landed anywhere (crowd only) | 49; 2.12; 28% | 48; 1.76; 27% |
| landed anywhere, all phases (the endgame duel included) | 38% | 30% |
| distance to the target at the fire; shots at its nearest robot | 772 px; 33% | 607 px; 51% |

Three things follow. **Dodging per bullet is equal:** of the bullets aimed at each, ScalarR is hit by 13% and Hadur
by 12%, and bot shadows take 9% and 8%. That is the fourth and last way the wave model turns out not to be the gap.
**ScalarR is shot at less:** 12% fewer bullets are aimed at it because it stands 80 px further from everyone, in a
corner two ticks in five, and is the nearest robot of 0.66 opponents against Hadur's 0.91. **ScalarR fires harder
at the same crowd hit rate:** power 2.12 against 1.76 at 28% against 27%, and it chooses its target by hittability
rather than nearness (a third of its shots go to robots with three or more others nearer), so it does 26% more
damage; it also reaches the final duel more often, where its gun lands 38% overall against Hadur's 30%.

Every one-part imitation of this has failed on the PC: ScalarR's power rule (MGUN-22), its step search with the
corner pull (MMOVE-21), the nearest-target factor (MMOVE-24), and the hide posture on the cloud. None of those
arms was checked against the posture numbers above; the hide posture, for one, raised the nearest load it was
meant to lower. The posture was therefore built to the numbers above and read against them first.

### Posture arms (2026-11-09): ScalarR's posture reached, and it costs Hadur more

Three cloud arms on the mover's constants, fought traced on the same twelve ScalarR fields (seed 5800, 240 rounds
each): `pc` drops the corner and wall penalties (`CORNER_K`, `WALL_K` to 0); `pp` also turns the corner term into
a pull over 400 px; `pf` adds the closest-robot factor 3.

| Hadur arm | nearest px | nearest-of | corner ticks | wall room | bullets aimed at it | hit per aimed bullet | damage taken / round | crowd deaths | place |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| master | 443 | 0.91 | 17% | 102 | 7,917 | 12% | 66.9 | 21% | 2.77 |
| pc | 455 | 0.79 | 28% | 64 | | | 68.3 | 20% | 2.68 |
| pp | 499 | 0.68 | 58% | 50 | 6,998 | 17% | 72.5 | 23% | 2.92 |
| pf | 510 | 0.68 | 57% | 52 | 7,012 | 17% | 74.3 | 29% | 3.08 |
| ScalarR, same fields | 509-524 | 0.66-0.76 | 39-43% | 51-55 | 6,976-8,035 | 13% | 54-60 | 14-16% | 1.94-2.02 |

The pull reaches ScalarR's posture to the pixel and cuts the bullets aimed at Hadur by 12%, the same 12% ScalarR
enjoys. Hadur then takes more damage, not less: the hit rate per aimed bullet rises from 12% to 17%, all of it at
the walls (under 60 px of wall room: master 13%, `pf` 18%, ScalarR 13-14%). A constant pull parks Hadur at the
corner's apex, where its candidate ring has nowhere to go; ScalarR sits in the same corners and keeps dodging.
The posture is not the lever on its own, and a pull is the wrong way to it; the arms were removed. What ScalarR's
corner buys depends on a dodge that still works with 50 px of wall room, which Hadur's mover does not have.

A second round kept Hadur moving: `pg` (penalties off, a gentle pull of -0.15 over 400 px) and `pe` (penalties off,
the centre push doubled, no pull). Same fields and seed:

| Hadur arm | nearest px | nearest-of | corner ticks | wall room | bullets aimed at it | hit per aimed bullet | hit, under 60 px of wall | damage taken / round | crowd deaths |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| master | 443 | 0.91 | 17% | 102 | 7,917 | 12% | 13% of 2,128 | 66.9 | 21% |
| pc | 455 | 0.79 | 28% | 64 | 7,350 | 14% | 16% of 5,041 | 68.3 | 20% |
| pg | 478 | 0.79 | 38% | 59 | 7,046 | 15% | 16% of 5,095 | 72.9 | 24% |
| pe | 470 | 0.79 | 30% | 52 | 7,470 | 15% | 15% of 5,515 | 70.7 | 27% |

Every step toward the walls trades 6 to 11% fewer bullets aimed at Hadur for a higher hit rate on the ones that
are, and the trade never pays: with its wall room under 60 px Hadur is hit by 15 to 18% of the bullets aimed at it
against 13% in master's rare visits and ScalarR's 13 to 14% at the same wall room. The posture arms were all
removed. The melee lever, as far as these crowds can show it, is the dodge with little wall room: the surfer's
candidate ring and its guesses were made for the open field, and Hadur pays for every tick it spends at a wall.

Four parts of the melee gap have now been measured in the same crowds and tried one at a time: the wave model
(four flat arms), the firepower (MGUN-22, failed on the PC), the target choice, and the posture (this section).
Each of ScalarR's parts imitated alone has lost; its edge is the parts together. The next design is the dodge at the
walls (the per-aimed-bullet hit rate under 60 px of wall room, 15 to 18% today against ScalarR's 13%), read by the
same traced numbers before any posture change or score.

### Which aims hit Hadur at the wall (2026-11-09)

The bullets aimed at each robot (within the escape angle), by the aim's guess factor and the target's wall room at
the fire, master Hadur and ScalarR in the same fields (scratchpad `sc/wallgf.py`, `sc/wallspeed.py`):

| wall room under 60 px | aimed | hit | behind (GF < -0.15) | head-on | mid (0.15 to 0.6) | linear (0.6+) |
|---|---:|---:|---:|---:|---:|---:|
| Hadur: share of aims / hit rate | 2,128 | 13% | 16% / 5% | 51% / 12% | 24% / 15% | 9% / **29%** |
| ScalarR: share of aims / hit rate | 5,558 | 14% | 15% / 7% | 56% / 15% | 22% / 16% | 6% / 14% |
| Hadur in the open (150 px or more) | 1,301 | 10% | 14% / 4% | 61% / 8% | 21% / 16% | 4% / 22% |

At a wall, Hadur is hit by 29% of the linear aims fired at it, ScalarR by 14%; head-on and mid aims hit the two
alike. Hadur is not slower there (mean speed 5.7 against ScalarR's 5.0; still 5% of ticks against 12%): it runs
along the wall at a steady speed and is led. Two cloud arms test the two obvious causes on the same fields, read by
this table: `pnopast` dropped the past-position penalty (`PAST_K` 0.02 to 0), which charges Hadur for reversing over
ground it has just covered; `plinwall` doubled the linear guess's weight for shots fired while Hadur had under
60 px of wall room.

| Hadur arm | hit per aimed bullet, under 60 px | linear aims there: share / hit | mid aims there: hit | damage taken / round | crowd deaths | place |
|---|---:|---:|---:|---:|---:|---:|
| master | 13% | 9% / 29% | 15% | 66.9 | 21% | 2.76 |
| pnopast | 13% | 5% / 25% | 19% | 62.6 | 23% | 2.80 |
| plinwall | 13% | 8% / 25% | 19% | 66.5 | 25% | 2.96 |

Neither moved the gate: the hit rate per aimed bullet at the wall stayed 13%. Both took hits off the linear band and
put them on the mid band, which is what a surfer does when it is told to fear one aim more. `pnopast` took 4 less
damage a round over one seed with no change in place or crowd deaths; `plinwall` changed nothing. Both arms and the
constant were removed. The wall dodge is not a constant away: the surfer's two guesses and its candidate ring are
the design that fails there, and the next step is a candidate set for little wall room (a reversal along the wall
and a stop, scored against the waves the way ScalarR's five steps are), read by this table before any score.

### The wall candidate set (2026-11-10)

Arm `pwall` (`MinimumRiskMovement.WALL_SET_ROOM` 60, 0 on master): with under 60 px of wall room the mover's
candidates gain a stop and 40 and 80 px steps either way along the wall, the moves the ring (nearest points 100 px
out, clipped onto the wall) does not hold. First build: the wall set joined the candidate list only, so it reached
the wave check only when it ranked among the eight least risky points, which short steps at a wall (wall, corner
and past-position risk) rarely do. Same 12 ScalarR fields, seed 5800, 20 rounds:

| Hadur arm | hit per aimed bullet, under 60 px | linear aims there: share / hit | mid aims there: hit | damage taken / round | crowd deaths | place |
|---|---:|---:|---:|---:|---:|---:|
| master | 13% | 9% / 29% | 15% | 66.9 | 21% | 2.76 |
| pwall, ring-ranked | 12% | 7% / 27% | 16% | 64.7 | 22% | 2.73 |

Nothing the table can tell from noise (about 2,200 aimed bullets a cell, so one point either way). Second build:
the wall set is always wave-scored, added to the re-rank pool the way the held destination is, so the stop and the
short reversals are judged by the waves and not by the ring's risk:

| Hadur arm | hit per aimed bullet, under 60 px | linear aims there: share / hit | mid aims there: hit | damage taken / round | crowd deaths | place |
|---|---:|---:|---:|---:|---:|---:|
| master | 13% | 9% / 29% | 15% | 66.9 | 21% | 2.76 |
| pwall, wave-scored | 14% | 8% / 27% | 18% | 64.2 | 22% | 2.95 |

Wave-scoring the stop and the short steps did not lower the hit rate at the wall (14%, mid aims 18%) and cost
place (2.95). Under Hadur's own posture the wall table does not move with candidates any more than with constants.

Reading the posture tables again puts the gap where it is: under its OWN posture Hadur is hit at the wall as
rarely as ScalarR (13% vs 14% per aimed bullet); it is under ScalarR's posture (`pfar`, 57% of ticks in a corner)
that Hadur's wall dodge fails (18%), and there the bands that fail are head-on (21% vs ScalarR's 15%) and linear
(21% vs 14%): standing still at the apex, or driving along one wall. So the wall set is read where it was built for,
under the posture: arm `pwallpf` = `pfar` plus the wall set, same fields, same seed.

| Hadur arm | hit per aimed bullet, under 60 px | head-on aims there: hit | linear aims there: hit | mid aims there: hit | aimed bullets at the wall | damage taken / round | crowd deaths | place |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| master (own posture) | 13% | 12% | 29% | 15% | 2,128 | 66.9 | 21% | 2.76 |
| pfar (ScalarR's posture) | 18% | 21% | 21% | 17% | 5,552 | 74.3 | 29% | 3.08 |
| pwallpf (posture + wall set) | 17% | 19% | 22% | 17% | 6,000 | 73.2 | 25% | 2.91 |
| ScalarR, same fields | 14% | 15% | 14% | 16% | 5,558 | 54.4 | 14% | 1.95 |

Under the posture the wall set takes one point off the hit rate at the wall (18% to 17%) and the head-on band
(21% to 19%), inside the noise of 6,000 bullets, and Hadur is still hit 3 points more than ScalarR per aimed bullet
and takes 19 more damage a round. The stop and the short steps along the wall are not the wall dodge either. All
wall-set code (`WALL_SET_ROOM`, `addWallSet`, the re-rank pool entry) and the `pwall`/`pwallpf` arms were removed;
the mover is as on master.

**What the wall study leaves.** Three quick fixes (no past-position penalty, a doubled linear guess, a wall
candidate set ring-ranked and then wave-scored) and the set under the posture all leave Hadur's hit rate at the wall
where it was. The design that fails there is the min-risk mover with a wave check bolted on: it ranks 160 ring
points by a risk sum, hands eight of them to the waves, and drives in straight lines. ScalarR's melee surf is the
other way round: five short steps, each scored by the waves two deep plus a crowd term, re-chosen every tick. Hadur
dodges as well as ScalarR in the open with the mover it has; it cannot hold ScalarR's posture with it. The remaining
lever is that surf, a build and not an arm, read by the same wall table before any score.

## The step surf (MMOVE-28, 2026-11-10)

The build the wall study ends in: `StepSurf` behind `MinimumRiskMovement.STEP_SURF` (off; arm `mstep`). Five 140 px
steps a tick (the anti-gravity direction with a weak pull to the nearest corner, on, back, left, right), each driven
through the nine soonest shots in flight and scored `(20 x wave damage / damage in air + crowd / crowd now) x
(1 + crowd / crowd now)`, the crowd being each opponent's energy over Hadur's (0.25..4) over distance squared plus
collision penalties. No wall, corner or centre term. Read on the same 12 ScalarR fields, seed 5800, 20 rounds.

| Hadur arm | place | crowd deaths | damage taken / round | hit per aimed bullet | at the wall (<60 px) | head-on there | corner share | speed | nearest px |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| master | 2.76 | 21% | 66.9 | 12% | 13% | 12% | 17% | 6.2 | 443 |
| ScalarR | 1.94 | 14% | 54.4 | 13% | 14% | 15% | 43% | 5.3 | 521 |
| mstep build 1 (steps clipped at the wall) | 3.97 | 48% | 98.9 | 23% | 24% | 29% | 64% | 3.8 | 490 |

Build 1 took ScalarR's posture (corner 64%, nearest 490) and was shot to pieces there: 29% of head-on aims hit it at
the wall, its speed fell to 3.8. The cause is the wall: a 140 px step into it was clipped to a short or empty move,
so in a corner all five steps collapsed onto the spot, and the surf stood. Build 2 slides a step along the wall at
full length instead (turned by the least angle that keeps it inside the margin), as the leader's "orbital smoothing"
does.

| Hadur arm | place | crowd deaths | damage taken / round | hit per aimed bullet | at the wall (<60 px) | head-on there | wall share of ticks | speed | still ticks at the wall |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| ScalarR | 1.94 | 14% | 54.4 | 13% | 14% | 15% | 76% | 5.0 | 12% |
| mstep build 2 (steps slide along the wall) | 3.80 | 44% | 86.5 | 21% | 23% | 27% | 77% | 4.4 | 17% |

Build 2 holds ScalarR's posture to the tick (77% of ticks under 60 px of wall room against 76%, speed 4.4 against
5.0) and is still hit by 27% of the head-on aims there against ScalarR's 15%. Head-on hits on a robot that moves are
the waves it does not see: the surfer drops a shot whose crowd weight is under 0.1, that is any shot with three or
more robots nearer its shooter, and in a corner most shots at Hadur come from such shooters (they pick targets by
hittability, not nearness, as the ScalarR read found). Build 3 rides every shot, weighted by the field's measured
chance it is at Hadur given k nearer robots (the MMOVE-27 curve, 1 to 0.15), as the leader surfs every wave in the
air as a mixture over its possible targets.

| Hadur arm | place | crowd deaths | damage taken / round | hit per aimed bullet | at the wall (<60 px) | head-on there | net move in 25 ticks at the wall | reversals / 100 ticks |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| ScalarR | 1.94 | 14% | 54.4 | 13% | 14% | 15% | 104 px | 1.7 |
| mstep build 3 (every shot ridden) | 3.84 | 45% | 84.8 | 21% | 22% | 27% | 86 px | 4.2 |

Riding every shot changed nothing (22% at the wall, head-on 27%), so the dropped shots were not the cause. The
oscillation reader (scratchpad sc/osc.py) shows the surf is not standing or shuttling: 86 px net in a bullet's
flight against ScalarR's 104, reversals 4.2 against 1.7 per 100 ticks. What it does do is ask for side steps: the
seam drives to a destination over 45 degrees off the heading at 4 px a tick while the body turns at Robocode's
10 - 0.75 |v| degrees a tick, and the first drive simulation turned on the spot at full speed. So the surf chose
side steps it believed would clear a wave and the robot swung slowly through it: head-on hits. Build 4 simulates the
drive as the seam makes it (turn rate, the 4 px cap under a sharp turn, reversal through zero), so the on and back
steps, which need no turn, win when the wave is close and the side steps only when there is time.

| Hadur arm | place | crowd deaths | damage taken / round | hit per aimed bullet | at the wall (<60 px) | head-on there | ticks at speed 8 at the wall | reversals per bullet flight (hit / miss) | net lateral px in flight (hit / miss) |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| master | 2.76 | 21% | 66.9 | 12% | 13% | 12% | 50% | 0.28 / 0.37 | 64 / 128 |
| ScalarR | 1.94 | 14% | 54.4 | 13% | 14% | 15% | 39% | 0.71 / 0.73 | 47 / 92 |
| mstep build 4 (seam's drive simulated) | 4.08 | 50% | 92.7 | 22% | 23% | 28% | 28% | 2.94 / 2.60 | 28 / 75 |

Build 4 read the same as 2 and 3. The flight forensic (scratchpad sc/hitpath.py: what the target did between a
bullet's fire and its pass, for bullets aimed at it with under 60 px of wall room) names the fault: the surf
reverses about three times in one bullet's flight, ScalarR 0.7 and the ring mover 0.3; its speed in flight is 3.6
against 4.9 and 5.8; it ends 28 px to the side of where it was aimed at when it is hit, ScalarR 47 and the ring mover
64. A step chosen afresh every tick from five directions flips between on and back as the waves come and go, so the
robot shuttles and the head-on aim finds it. Build 5 holds the step chosen last tick: it is scored again from the
current state and kept unless another step's danger is under 0.8 of its own, until it is within 20 px.

| Hadur arm | place | crowd deaths | damage taken / round | hit per aimed bullet | at the wall (<60 px) | head-on there | speed at the wall | lateral speed | reversals per flight (hit / miss) | net lateral px (hit / miss) |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| ScalarR | 1.94 | 14% | 54.4 | 13% | 14% | 15% | 5.0 | 3.7 | 0.71 / 0.73 | 47 / 92 |
| mstep build 5 (held step) | 3.30 | 32% | 78.3 | 18% | 20% | 23% | 5.4 | 3.7 | 0.64 / 0.44 | 38 / 91 |

The hold moved every number (place 4.08 to 3.30, crowd deaths 50% to 32%, damage 92.7 to 78.3, hit per aimed
bullet 22% to 18%) and brings the movement itself level with ScalarR's: the same speed, the same lateral speed, the
same reversals, the same lateral distance on a miss. What is left is the dodge's choice: hit by 23% of head-on aims
at the wall against 15%, ending within 0.15 of the head-on line on 71% of its hits. The wave profile the surf scores
against is a Gaussian a box half-width over 2 wide (about one degree at 500 px), so a step a bot's width beside the
head-on line reads as safe, and a tick of the shooter's latency or a bot of lead puts the bullet there. The leader's
kernel is over a bot wide with fat tails. Build 6 scores the step surf's waves through a kernel three times as wide
(`StepSurf.SPREAD`, the ring mover's profile untouched).

| Hadur arm | place | crowd deaths | damage taken / round | hit per aimed bullet | at the wall (<60 px) | head-on there |
|---|---:|---:|---:|---:|---:|---:|
| mstep build 5 (held step) | 3.30 | 32% | 78.3 | 18% | 20% | 23% |
| mstep build 6 (kernel three times wider) | 3.69 | 43% | 86.4 | 19% | 21% | 24% |

The wider kernel did not help (a point worse everywhere, more reversals); the spread constant and its plumbing were
removed. The per-shooter read on build 5 (scratchpad sc/shooter.py: for each gun, bullets aimed at Hadur and at
ScalarR in the same battles and the hit rate on each) says which guns find the surf: the simple ones. NanoAndrew hits
Hadur with 31% of its aimed bullets and ScalarR with 7%, JollyNinja 25% against 8%, Predator 21% against 8%,
Firestarter 19% against 7%, Anomaly 27% against 14%; ScalarR's own gun hits Hadur at 15%, the same as Hadur's hits
ScalarR (14%). Head-on and linear guns fire where the target is or will be at a steady speed, and build 5 gave them
that: it held the step as a point, so the seam braked to it at every leg's end (every 140 px, about 20 ticks, twice
in a bullet's flight) and the next leg began from rest. Build 7 holds the step's direction instead: each tick the
held step is a fresh 140 px step the same way (slid along a wall as the others), so the robot never brakes but to
turn, and still changes direction only when another step is clearly safer.

| Hadur arm | place | crowd deaths | damage taken / round | hit per aimed bullet | at the wall (<60 px) | head-on there | wall share of ticks | damage dealt / round |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| master | 2.76 | 21% | 66.9 | 12% | 13% | 12% | 27% | 129.9 |
| ScalarR (in the master fields) | 1.94 | 14% | 54.4 | 13% | 14% | 15% | 79% | 164.1 |
| mstep build 7 (direction held) | 3.29 | 34% | 72.5 | 16% | 18% | 21% | 67% | 114.9 |
| ScalarR (in the build 7 fields) | | | 63.1 (3+ alive) | 14% | | | 76% | 176.1 (guns.py) |

Build 7 is the best step surf so far: damage taken 92.7 (build 4) to 78.3 (5) to 72.5, hit per aimed bullet 22% to
16%, and the per-shooter read is now mixed (Figment 20% on Hadur against 16% on ScalarR, Scimitar 10% against 13%,
Numbat 18% against 22%; overall 16% against 14%). In the same battles ScalarR takes 63.1 a round in the crowd to
Hadur's 73.5 (sc/dmg.py): 6% more hits on Hadur and bullets 10% heavier (power 1.98 against 1.81). So the dodge
under ScalarR's posture is within about 14% of ScalarR's, from 70% behind at build 1.

**Why the place is still worse, and what it says about the gap.** With the posture reached, Hadur's place falls
(3.29 against the ring mover's 2.76) because its gun does less from the corner: 114.9 damage dealt a round against
129.9 under its own posture, where ScalarR deals 164-176 from the same corners. The gun read (sc/guns.py,
targets.py) puts the whole of that on the gun, not the posture: ScalarR hits 39% of its shots to Hadur's 30% at a
longer target distance (755 px against 666), and on every target both shot thirty times or more ScalarR's hit rate
is 8 to 15 points higher (Scimitar 28% against 12%, Numbat 24% against 11%, Predator 28% against 18%, Mercutio 23%
against 15%), at every distance band and every target speed; the gap is widest on targets moving at 4-5 px a tick
(31% against 24%) and smallest on still ones (33% against 31%). In energy a round, ScalarR's gun returns about 25
more than Hadur's and its dodge saves about 10: under the leader's posture the gun is the larger half of the gap,
and it is the same gap under Hadur's own posture (30% against 38% in the master fields). The step surf stays off
behind its switch as the movement for that posture; the next build is the gun's prediction of a moving target.

### The gun lab (2026-11-10, scratchpad gun/gunlab.py, choicelab.py)

An offline melee gun on the traced master fields: Hadur the shooter, power 1.9, every seventh tick with three or more
alive, each target's K = 24 play-forward angles from its own earlier situations (Hadur's tree: distance, speed, turn
rate, time since reversing, wall distance; situations at least 90 ticks old; learning across rounds), scored by
whether the chosen angle would hit the target where it really was when the bullet arrived.

| aim | would hit | by target speed 0-1 / 2-3 / 4-5 / 6-7 / 8 |
|---|---:|---|
| head-on | 12.8% | 17.0 / 12.3 / 12.9 / 12.4 / 11.5 |
| linear | 12.2% | 16.8 / 12.6 / 10.1 / 9.6 / 11.8 |
| Hadur's five attributes | 16.0% | 17.5 / 16.7 / 15.6 / 15.4 / 15.6 |
| + wall reach ahead and behind | 16.9% | 18.7 / 17.3 / 16.4 / 15.5 / 16.7 |
| + distance to its own nearest robot | 16.9% | 19.3 / 17.1 / 15.9 / 16.2 / 16.4 |
| + acceleration | 16.0% | |
| + lateral and advancing speed | 15.6% | |

| target choice (four fields, 8,212 ticks) | would hit | chosen target's distance |
|---|---:|---:|
| nearest | 23.6% | 476 |
| Hadur's weights (peak share over distance, energy, finisher) | 25.3% | 520 |
| most covered (hittability, no distance) | 25.5% | 628 |
| most covered over root distance | 26.2% | 547 |
| the field's summed density, any target hit | 28.4% | |

The leader's two gun features that Hadur lacks buy under a point (wall reach +0.9, the nearest-robot distance
nothing), and its target rule (hittability over nearness) a quarter point; the field density Hadur already fires at
is the best of the rules. So the per-target table above overstates the prediction gap: in the crowd (three or more
alive) ScalarR lands 29% of its shots on some robot to Hadur's 27%, and the per-target gaps are phases (ScalarR's
endgame duels at close range). The gun's extra damage is power (2.11 against 1.81, 17% more a hit), cadence (46.7
against 43.1 shots a round) and the endgame it reaches more often. Under the step surf's posture the power rule is
the cheap test: arm `mspow` (power 3 to 433 px and beyond it from 30 energy, the leader's shape) with `mstep`.

| Hadur arm | place | crowd deaths | damage taken / round | damage dealt / round | power | shots / round | hit per aimed bullet |
|---|---:|---:|---:|---:|---:|---:|---:|
| mstep build 7 | 3.29 | 34% | 72.5 | 114.9 | 1.81 | 43.1 | 16% |
| mstep + mspow (power 3 to 433 px, beyond it from 30 energy) | 3.38 | 37% | 74.3 | 120.7 | 1.96 | 41.9 | 17% |
| master | 2.76 | 21% | 66.9 | 129.9 | 1.76 | 48.2 | 12% |
| ScalarR | 1.94 | 14% | 54.4 | 164.1 | 2.12 | 46.7 | 13% |

The leader's power shape under the surf dealt 6 more a round and died 3 points more: place flat. The arm was
removed. The damage dealt by phase (sc/dealt.py) settles where the crowd gun's gap is. With three or more alive,
ScalarR lands 3,163 hits in 240 rounds at power 2.42 for 165.8 a round; master Hadur lands 3,101, almost the same
count, at 1.99 for 132.3; the step surf lands 2,556 (shooting from farther) at 2.21 for 122.6. Per shot the two
crowd guns are equal (30% against 28%); ScalarR fires 9% more shots a round and 22% harder. So the crowd gun gap is
power and cadence, not prediction, and the surf's posture costs 18% of the hits that its range gives back only in
part. The one-part power imitation failed on the ring posture before (MGUN-22) and is flat on the surf's: the power
has to come with the hits, which means the gun must keep its hit count at the surf's range (ScalarR's does at 765 px)
or the surf must hold the posture nearer the crowd. Next: the gun's hold rules (why Hadur fires 9% less with lighter
shots) and the hit rate by range for the two crowd guns at equal distance.

### Why Hadur fires fewer shots: the gun-hold record (2026-11-10)

The `gwhy` arm prints one line for every tick the gun is cool with energy to spare, saying what happened (F fired,
A still turning to the aim, H the brain held fire, T no target). On the traced ScalarR fields, with the ring mover
and under the step surf:

| mover | cool ticks | fired | turning | held | no target |
|---|---:|---:|---:|---:|---:|
| ring (master) | 27,355 | 43% | 29% | 16% | 12% |
| step surf | 23,424 | 44% | 30% | 18% | 8% |

The shares are the same; the surf has 14% fewer cool ticks because Hadur is dead sooner. So the lower cadence is
survival, not a hold rule, and the aim-turning share (a third of cool ticks) is the one the 3.13 study already
tried to cut (gtol, gwin: firing sooner added the poor shots and left damage level). At equal range the two crowd
guns are within a few points at every band (sc/range.py: 400-599 px 29% against 35%, 600-799 28% against 30%,
800-999 30% against 29%) and differ in power by 0.3 to 0.6 beyond 400 px (1.96-2.05 against 2.28-2.58). The crowd
gun gap is power that ScalarR can afford because it is hit less; the step surf buys that survival in the crowd and
pays 18% of the hits for it at the range it chooses. The two have to be scored together: a paired census smoke of
`mstep` against master (12 fields, 2 seeds, 35 rounds) runs next, knowing that 24-pair melee smokes have over-read
the PC three times.

### The paired census smoke: the step surf fails (2026-11-10)

`mstep` (build 7) against master, 12 census fields, 2 seeds from 5900, 35 rounds, paired by seed. The repo's
paired view reproduces the headline from the smoke's work directory (`python3 data/tools/melee_pairwise.py --work
<smoke dir> --hadur hadur117.Hadur`): APS 65.9 against 68.5, -2.6 +/- 0.4 over the 24 cells, every field down. The
rows below add the bench's exposure columns (`exposure.csv`, `rounds.csv`), read per (field, seed) pair the same way:

| | step surf | master | diff (95%) |
|---|---:|---:|---|
| score share | 17.10 | 18.91 | -1.81 ± 0.31 |
| rounds won | 40.8% | 47.0% | -6.2 ± 3.9 |
| survival score | 12,273 | 13,342 | -1,069 ± 222 |
| crowd deaths (3+ alive, not first) | 40.7% | 28.0% | +12.7 ± 3.3 |
| nearest load (per crowd tick) | 0.70 | 0.81 | -0.10 ± 0.03 |
| crowd damage taken (per 100 crowd ticks) | 9.14 | 8.13 | +1.00 ± 0.49 |

23 of 24 pairs are down (the one up is +0.03), every field is down. What the traced ScalarR fields showed in
the small (damage taken 72.5 against 66.9) holds over the census: the surf reaches ScalarR's posture, is shot at
less (nearest load down 13%), and still takes more damage in the crowd and dies there 45% more often. With the
gun's 18% fewer hits from that range on top, the place is worse on every field. The 24-pair smoke over-reads the
PC in Hadur's favour, so this is a floor on the loss, not a ceiling.

The reading is that posture is not what ScalarR's movement buys; the step-surf geometry under Hadur's danger model
loses the dodge the ring mover has (16% against 14% hit per aimed bullet on the traced fields, 21% against 15%
head-on at the wall). The wave danger is where the two differ, and the wave model was shown not to be the gap in
the crowd (above). MMOVE-28 is retired; `StepSurf`, the `STEP_SURF` switch, the `mstep` arm and the tests are
removed. The decision stands as it was before the surf: the paying melee levers since 3.19 have been firepower, and
no movement built from ScalarR's posture or geometry has paid on Hadur's own danger model.

### The crowd energy ledger, and how the crowd deaths happen (2026-11-10, sc/ledger.py, sc/death.py)

Before the next route, the whole budget. On the traced ScalarR fields (ring mover, 240 rounds), per round while
three or more are alive:

| | Hadur | ScalarR |
|---|---:|---:|
| energy fired (shots, mean power) | 86.7 (48.9, 1.77) | 105.0 (49.6, 2.12) |
| energy regained from hits landed (hits) | 76.3 (12.8) | 96.6 (13.2) |
| firing, net | -10.4 | -8.4 |
| damage taken | 64.0 | 55.5 |
| net energy over the crowd phase | -74.4 | -64.0 |
| crowd deaths | 42% | 24% |
| energy of the survivors when the crowd ends | 37.8 | 47.1 |

The gun is not the survival gap: firing nets the same for both (a 26% hit rate returns 0.78 of each unit fired,
at any power), so the 22% harder shots cost ScalarR 18 more and return 20 more. The whole 10-point gap in net
energy is the damage taken, 8.5 a round, and the survivors enter the endgame 9 energy apart.

The crowd deaths themselves (the last 120 ticks before each, three or more alive): Hadur 100, ScalarR 57 over the
same rounds. Both die the same way: from 23-26 energy 120 ticks out, 24-29 damage from 1.6-1.9 shooters, having
been under 30 energy for 250-300 ticks. Per tick spent under 30 energy in the crowd, ScalarR takes more damage
(7.1 against 6.1 per 100 ticks) and dies at the same rate (2.0 against 2.3 deaths per 1,000 such ticks); Hadur
simply spends 53% more ticks there (43,408 against 28,450). There is no low-energy escape in ScalarR's movement to
copy: it reaches low energy later because it was hit less at full energy, and that is the same 13% fewer bullets
aimed at it that the posture reads found.

### What has not been tried on melee survival, and why

Reported so the line is not called closed without saying what was left:

- **ScalarR's own wave danger: per-(shooter, target) learning from every robot's hits, the wave in the air a
  mixture over its possible targets.** Not built. Hadur's surfer weights each shot by a field-wide curve in k
  (robots nearer the shooter than Hadur) and its own per-class danger views. The unbuilt part is which target
  each gun chooses, learned per shooter. A cloud read of it is running (sc/choice.py): how much better than the
  field curve a per-class model predicts that a shot is at Hadur. If it is sharper, the surfer's weighting is the
  member to build, as an arm on the ring mover, not the step geometry.
- **Two waves deep.** ScalarR scores a step through the next two waves per shooter; the step surf scored the nine
  soonest at arrival only, and the ring's wave check eight. Not tried; the step surf's failure was at the dodge per
  bullet, which depth would not change on the traces (88% of hits landed inside the last plan in the 1v1 read, and
  the melee hit paths showed the same).
- **Bullet shadows in melee.** Not tried: the same-crowd read found shadows take 8-9% of the bullets aimed at each
  robot equally, so there is no gap there to close.
- **A low-energy posture (retreat or hide when under 30 energy).** Not tried, and the death read above says it is
  flat: ScalarR dodges no better than Hadur when low.
- **Being the nearest robot of fewer opponents without the corner.** Hadur is the nearest robot of 0.91 opponents
  against ScalarR's 0.66; every posture arm reached that only by standing in corners, where its hit rate per bullet
  rose. An arm that pays distance only against the robots whose guns shoot their nearest (the per-class read above
  says which) has not been tried; it depends on the choice read.

### The per-shooter target choice (2026-11-10, sc/choice.py): the field curve already has it

54,823 shots with an inferred target on the traced ScalarR fields, Hadur alive and three or more alive. Per
shooter class the shares at its nearest robot run from 5% (stelo.Wang) to 65% (jok.PheonixM), at the weakest 6% to
51%, at Hadur 3% to 31%, ScalarR 32/32/19%. Predicting "this shot is at Hadur", fitted on even rounds and scored on
odd:

| model | Brier | log loss |
|---|---:|---:|
| constant | 0.1529 | 0.484 |
| field k-curve (robots nearer the shooter than Hadur; the MMOVE-27 weighting) | 0.1323 | 0.424 |
| per-class k-curve | 0.1305 | 0.422 |
| per-class k, whether Hadur is its nearest, whether its weakest | 0.1286 | 0.417 |

Learning each gun's choice buys 3% of the Brier over the curve Hadur already uses. There is no per-shooter target
model to build: which robot a gun shoots at is, for the surfer's purposes, the nearness order and little else, and
the arm that would pay distance only against nearest-shooters has nothing to hold on to. Of the five untried
routes above this closes the first and the last offline; the low-energy posture and the shadows were closed by the
reads before it; two waves deep remains, with the stated reason it is not expected to move the dodge per bullet.

### Two waves deep, measured (MMOVE-29, 2026-11-10, sc/depth.py)

Of the 1,752 hits on Hadur in the crowd on the traced ScalarR fields, 77% were bullets fired while their shooter
already had an earlier wave in the air, and for 52% that earlier wave was within 20 ticks of reaching Hadur. The
ring's wave check drives each candidate 30 ticks, so the shooter's second wave is usually outside the horizon
when the first is dodged; it enters it a few ticks later, with the candidate already chosen. That is a measurable
difference from ScalarR's two waves deep, so it is measured rather than reasoned away: `MELEE_WAVE_TICKS` (30, the
robot as on 3.21) is the melee surfer's own horizon, the team dodge keeps `WAVE_TICKS`, and arm `mdeep` sets it to
60. The same paired census smoke as the step surf's runs on it (12 fields, 2 seeds from 5900, 35 rounds); if it is
flat or worse the switch and arm come out.

The smoke, `mdeep` against master, 12 fields, 2 seeds from 5900, 35 rounds, 24 pairs (same reader as the step
surf's, and the repo's paired view):

| | mdeep (60 ticks) | master (30) | diff (95%) |
|---|---:|---:|---|
| score share | 19.10 | 19.04 | +0.06 ± 0.47 |
| APS (data/tools/melee_pairwise.py) | 68.8 | 68.7 | +0.1 ± 0.6 |
| crowd deaths | 26.9% | 27.1% | -0.2 ± 4.5 |
| crowd damage taken (per 100 crowd ticks) | 8.18 | 8.31 | -0.13 ± 0.62 |
| survival score | 13,435 | 13,338 | +98 ± 243 |

Flat on every column. Scoring the shooter's second wave while dodging the first changes nothing the candidate
re-choice each tick was not already doing once the wave came into the 30-tick horizon. MMOVE-29 is retired and
the switch, arm and test are removed. With that, every route on the not-tried list is measured: the melee
survival line is closed on the cloud until a new direction is chosen, and the melee levers that have paid since
3.19 remain the firepower ones (MGUN-25 banked, unreleased).

## Survive the crowd by doing little in the opening (MGUN-27, 2026-11-10)

The direction set on 2026-11-10 15:34 UTC: survive in the crowd by dealing minimal damage until the first two
robots die. Two trace reads on the ring mover's ScalarR fields (240 rounds) before the build (sc/revenge.py,
sc/phase.py):

**Does hitting a robot draw its fire?** For every shot with an inferred target, the chance the target is X given
X's nearness rank from the shooter and whether X landed a bullet on the shooter in the last 60 ticks:

| X is the shooter's | not hit it | hit it in the last 60 ticks |
|---|---:|---:|
| nearest | 42.5% (55,908) | 48.8% (14,239) |
| 2nd nearest | 19.1% | 24.3% |
| 3rd nearest | 13.1% | 15.7% |
| 4th or further | 8.7% | 10.5% |
| Hadur as X: nearest / 2nd / 3rd / further | 48.6 / 19.5 / 12.6 / 8.4% | 53.9 / 24.0 / 16.1 / 11.6% |

A hit buys 5 to 6 points of the victim's next targets for 60 ticks; nearness buys 30. Per class the lift among
non-nearest targets runs from +20 (TheTeacher) to +0.5; Hadur's own gun is one of the stronger revenge shooters
(+7), ScalarR's hardly one (+2).

**The opening phase, until two have died (218 ticks a round):**

| | Hadur | ScalarR |
|---|---:|---:|
| shots; energy fired | 11.9; 29.0 | 11.7; 34.0 |
| energy regained; damage dealt | 34.0; 59.1 | 39.9; 70.8 |
| damage taken; bullets aimed at it | 21.6; 10.5 | 23.8; 12.2 |
| alive when two have died; energy then | 98%; 83.6 | 98%; 84.5 |

The opening is not where Hadur dies, its firing there nets energy (regained above fired), and it is aimed at
less than ScalarR. Holding fire until two die would give up 59 damage a round (half the score) and about 5 net
energy, and by the revenge read spare Hadur a fraction of a bullet. The 2026-11-08 fire-hold half (hold with five
or more alive) lost -2.10 ± 0.50. The direction is still measured rather than argued: MGUN-27 `OPENING_HOLD`
(arm `mopen`) holds the gun off a team until two of the round's starting opponents have died, a finisher
excepted, and runs on the 24-pair census smoke.

### The opening hold, measured: it loses (2026-11-10)

`mopen` against master, 12 census fields, 2 seeds from 5900, 35 rounds, 24 pairs:

| | opening hold | master | diff (95%) |
|---|---:|---:|---|
| score share | 15.54 | 19.24 | -3.70 ± 0.33 |
| APS (data/tools/melee_pairwise.py) | 63.3 | 69.0 | -5.7 ± 0.6 |
| rounds won | 38.3% | 49.8% | -11.4 ± 4.5 |
| crowd deaths | 35.4% | 25.5% | +9.9 ± 3.0 |
| survival score | 12,490 | 13,477 | -988 ± 231 |
| nearest load; crowd damage taken per 100 ticks | 0.83; 8.45 | 0.80; 8.16 | +0.03; +0.28 |

Every field down, and the loss is in survival, not only in the damage given up: holding fire until two have died
leaves Hadur in a crowd that is stronger for longer, it is aimed at no less (the nearest load is up), and it dies
in the crowd 10 points more often. This is the same shape as the 2026-11-08 fire-hold arm (-2.10 with five or
more alive), now worse with the hold confined to the opening, where Hadur's firing was netting energy. Doing less
damage in the crowd does not buy survival; it costs it. MGUN-27 is retired and the switch, arm and test are
removed. The direction's other half, surviving the crowd, has every measured route above closed; the lever that
has paid is the opposite one, firepower early.

## The states Hadur is hit in, against ScalarR (2026-11-11)

The pc-melee-states card (BENCH-232, results PR #766) traced master on the 46 census fields at one seed. Hadur was
the only robot aimed at 2,000 times: ScalarR, Neuromancer and Ogi sit in too few census fields to be read there.
The same tool (`hadur-bench/tools/melee_states.py --min-shots 1000`) run on the cloud trace with ScalarR seated in
each of 12 census fields (seed 5800, 20 rounds, 240 rounds in all) gives the comparison the card's rule asks for:

| | Hadur | ScalarR |
|---|---:|---:|
| bullets aimed at it (three or more alive) | 10,171 | 9,901 |
| hit rate | 9.8% | 9.9% |
| shots taken under 3 px a tick sideways | 36% | 46% |
| shots taken within 0.2 of head-on | 60% | 64% |
| hit rate when the fired guess factor is 0.5 to 0.8 | 14.1% | 9.5% |
| damage on it from bullets aimed at another robot | 44% | 27% |

Hadur is not slow across the line or head-on more often than ScalarR: ScalarR is the slower and the more head-on
of the two, and the hit rate a bullet is the same. By the card's rule no keep-moving arm is built and card 4 (the
shot profiles in the crowd, MMOVE-30) stands alone. Two differences remain. Hadur is hit half again as often by
bullets fired at the wide guesses (0.5 to 0.8), the aims a linear or circular gun takes at a robot moving
across its line, which is what the aim experts of MMOVE-30 profile and the two guesses do not. And 44% of the
damage Hadur takes comes from bullets aimed at someone else, against 27% for ScalarR, the stray fire of the
crowd measured before (23% of hits never seen as aimed at Hadur). The PC trace agrees on Hadur's own row:
10.1% a bullet, 36% slow, 61% head-on, 43% stray, 14.6% and 18.7% at guess factors 0.5 to 0.8 and over 0.8.
