# Easy-robot dodge study (MOVE-75, BENCH-299)

Against the robots BeepBoop 2.0 scores 98% or more on live (575 of the 1,212), Hadur 3.25 gives away about 0.6
points of score share a robot. At that share only damage taken matters: one point of the enemy's score costs about
as much as a hundred of ours. This study finds where that damage comes from and tests fixes.

## Method

- Panel: 70 robots drawn at random from the 575 (54 that both robots surf, 16 that both shield). Hadur 3.25.1
  (master 954ef133) and BeepBoop 2.0 each fought them on the same two seeds with truth logs: 280 battles, Robocode
  1.12.0, the live field's engine.
- Every enemy bullet was rebuilt from the truth log (`T,round,turn,me,enemy,bullets` lines): fire tick, origin,
  power, how it was aimed (head-on, linear or circular fit within 9 px at our distance, else other), what we did in
  its flight, and whether it hit. Notes for anyone repeating it: a bullet first appears one step out from the
  shooter's previous-tick position, so its fire tick is the first-seen tick less one; the engine tests a bullet's
  segment against our box at the previous tick; hits that land after the shooter is dead do not score; a hit from a
  disabled (0-energy) shooter does, and revives it.

## Where the damage comes from (52 surfed robots, per battle)

| | Hadur | BeepBoop |
|---|---|---|
| Score share | 98.84 | 99.45 |
| Bullet damage taken | 51.8 | 24.5 |
| Inside 200 px, enemy 20+ energy | 18.3 | 4.1 |
| Enemy under 20 energy | 10.3 | 2.1 |
| Normal range, healthy enemy | 23.1 | 18.7 |

- Simple aims (head-on, linear, circular) account for 22 of the 27-point gap. Against other guns at normal range
  Hadur takes slightly less than BeepBoop.
- **Contact.** Within 60 px of a live enemy Hadur spends 25 ticks a battle (14 of them standing still), BeepBoop 8;
  24 of Hadur's contact episodes last over 50 ticks, none of BeepBoop's. Inside 100 px Hadur takes 86 hits in 104
  battles, BeepBoop 8. In a traced round the enemy drives in near a corner and Hadur stands at one spot with one
  heading for 57 ticks while every power-2 shot from 47 px hits. The orbit's wall smoothing, and RAM-1's choice of
  the other side against a charger, bend the heading back into the enemy; the engine stops a robot that drives into
  another, so the order repeats every tick. RAM-2's escape runs only on confirmed chargers, so it was not driving.
- **Endgame.** Closing to 150 px to finish a weak enemy (END-1) is hit by 1.11% of shots at 200 px or more,
  BeepBoop 0.34%; END-2's straight ram meets the last bullets, which score and revive the enemy.
- **Normal range.** In hindsight 87% of hits had an escape among the surf's three options when the shot was seen.

## MOVE-75 contact break

Inside 62 px (latched until 110 px), and when no ram, mirror drive or rammer escape has the tick, the drive is the
heading within 75 degrees of straight away whose straight run of up to 120 px, cut at a wall, ends furthest from the
enemy; the end of the robot pointing away leads, so the first tick moves. `MoveDesign.CLINCH_BREAK`, off by default.

## Cloud results (0.7x live turn time, paired by robot and seed, share points a robot)

| Panel | Arm | Pairs | vs c | vs aa |
|---|---|---|---|---|
| 54 easy robots, 30 seeds | contact break | 1,620 | +0.11 +- 0.05 | +0.08 +- 0.05 |
| 54 easy robots, 12 more seeds (second box) | contact break | 648 | +0.06 +- 0.07 | +0.09 +- 0.08 |
| 54 other easy robots, 12 seeds | contact break | 648 | +0.02 +- 0.08 | +0.12 +- 0.09 |
| 54 easy robots, 12 seeds | contact break + fin + rwall | 648 | +0.21 +- 0.08 | +0.19 +- 0.07 |
| 54 easy robots, 12 more seeds | contact break + fin + rwall | 648 | +0.18 +- 0.08 | +0.17 +- 0.08 |
| 30 band 80-98% + 12 rammers, 6 seeds | contact break | 252 | +0.28 +- 0.25 | +0.09 +- 0.28 |
| 40 band 85-98%, 24 seeds | contact break | 960 | +0.15 +- 0.16 | +0.11 +- 0.17 |
| 30 band 80-98% + 12 rammers, 12 more seeds | contact break | 504 | +0.06 +- 0.18 | +0.12 +- 0.21 |
| 40 robots with ram lines, 12 seeds | contact break | 480 | +0.03 +- 0.12 | +0.00 +- 0.12 |

fin keeps normal distance when finishing a weak enemy; rwall waits out the last waves before ramming a disabled one. Stacked on the contact break they add +0.16 +- 0.07 and +0.13 +- 0.07 against the contact break alone in the two blocks, and their bullet damage falls about 8 a battle.

Ticks in contact on the easy panel fall from 23 to 12 a battle. Other triggers read level with it or worse: 50 px until 90 (+0.01 +- 0.07 against it), 62 until 160 (-0.05 +- 0.07), 100 until 160 (level with master).

Closed on the way: the simple-aim prior for every opponent (AIM_PRIOR 1.0) did not replicate on fresh seeds;
END-1 and MOVE-46 for all, each alone, read level; power 0.1 against an enemy under 20 energy cost 0.19 against
staying back (longer rounds, more shots taken); adding four mostly head-on robots to the shield list cost 3.3.

The live-field card is `hadur-bench/plans/pc-clinch.queue`.
