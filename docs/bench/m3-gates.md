# Melee gates: M3 (minimum-risk movement)

The M3 build (still versioned 2.2) on the two melee fields of `melee-gates.txt`. M3 replaces the melee mover with minimum-risk movement and virtual bullets (MMOVE-1..4); the duel sources are unchanged (DuelIdentityTest), so the duel and sentry fields were not rerun here and the M4 bench, which runs the whole suite, is their check. This run was taken on M2 before its review fixes (ghost choice and shot timing), which change sensing only at the margins. Same engine, cores and seeds as M1; the reference field runs 5 seeds, not the plan's 20, to keep a bench under ten minutes.

## Summary against the exit gate

The M3 exit gate is 100 firsts on the challenge field (every round won) and reference survival ≥ 40.

| Measure | M2 | M3 | Gate |
|---|---|---|---|
| Challenge: firsts of 100 | 34 | 71 | 100 |
| Challenge: APS, survival | 60.5, 70.2 | 67.8, 87.9 | |
| Challenge: mean place | 3.68 | 2.09 | |
| Reference: survival | 31.5 | 55.0 | ≥ 40 |
| Reference: APS, rounds won | 37.1, 1 / 175 | 50.6, 12 / 175 | M4 gate: APS ≥ 55 |
| Reference: Hadur's mean place | 9.0 | 6.0 | |

**Reference survival is met by a wide margin; 100 firsts is not.** Hadur is now first on the challenge field by mean place and outlives the field in 71 rounds of 100, against 34 at M2. Of the 29 lost rounds, Shiz won 10 and HawkOnFire 7; the M4 gun and the M5 hand-off are the levers for the rest.

The movement also moved the radar's worst case: per-round longest gaps with four or more alive still cluster at 10 to 11 ticks, but the tail now reaches 55 ticks on the challenge field and 47 on the reference field. The minimum-risk movement pulls Hadur off the centre toward the walls; the likely cause, not yet traced, is an opponent in a far corner beyond the radar's 1200 px range. It is an M6 radar item alongside the 8-tick gate.

Per-round longest gap while four or more were alive, rounds at each value:

| Field | 9 | 10 | 11 | 12 | 13-20 | 21-30 | over 30 |
|---|---|---|---|---|---|---|---|
| challenge | 9 | 38 | 17 | 9 | 9 | 8 | 10 |
| reference | 10 | 64 | 57 | 21 | 13 | 6 | 3 |

## Melee bench: challenge

hadur2.Hadur 2.2 against 9 opponents at once, 100 rounds per battle, 1 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.9 | 71 / 100 | 2.09 | 18.5% | 10691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 2.2 | 1.0 | 18.5% | 71 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.3% | 10 |
| rz.HawkOnFire 0.1 | 3.0 | 13.4% | 7 |
| supersample.SuperSpinBot 1.0 | 4.0 | 9.9% | 4 |
| sample.Walls | 5.0 | 8.9% | 3 |
| supersample.SuperTracker 1.0 | 6.0 | 8.0% | 0 |
| sample.Crazy | 7.0 | 7.5% | 3 |
| sample.SpinBot | 8.0 | 6.8% | 0 |
| SuperSample.SuperCrazy 1.0 | 9.0 | 6.5% | 0 |
| supersample.SuperWalls 1.0 | 10.0 | 6.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.9 | 71 / 100 | 10691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 21 | 100% |
| rz.HawkOnFire 0.1 | 21 | 100% |
| sample.Walls | 15 | 93% |
| sample.Crazy | 9 | 89% |
| supersample.SuperWalls 1.0 | 4 | 75% |
| sample.SpinBot | 3 | 100% |
| supersample.SuperSpinBot 1.0 | 1 | 100% |

Skipped turns: 0.

Posture (Hadur's M records, 100 rounds): 71691 melee ticks, 18191 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (100 rounds): longest scan gap while four or more were alive 55 ticks (100 rounds over 8); rounds whose longest gap at any count was over 8: 100; robots dropped as dead without a death event: 0.

## Melee bench: reference

hadur2.Hadur 2.2 against 9 opponents at once, 35 rounds per battle, 5 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.6 | 55.0 | 12 / 175 | 5.05 | 9.8% | 8915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 13.5% | 38 |
| rz.HawkOnFire 0.1 | 4.4 | 10.6% | 15 |
| simonton.micro.Sprout 1.1.3 | 4.4 | 11.0% | 12 |
| abc.Tron 2.02 | 4.8 | 10.5% | 24 |
| kawigi.sbf.FloodHT 0.9.2 | 5.0 | 10.5% | 14 |
| darkcanuck.B26354 1.06 | 5.0 | 10.7% | 23 |
| hadur2.Hadur 2.2 | 6.0 | 9.8% | 12 |
| kawigi.mini.Coriantumr 1.1 | 6.2 | 10.2% | 15 |
| gh.Griezel 0.5.4 | 8.0 | 9.2% | 21 |
| cx.mini.Cigaret 1.31 | 10.0 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 53.3 | 59.7 | 5 / 35 | 1917 |
| 2 | 8 | 49.3 | 53.0 | 0 / 35 | 1684 |
| 3 | 7 | 49.0 | 53.7 | 2 / 35 | 1670 |
| 4 | 5 | 53.2 | 59.4 | 2 / 35 | 2124 |
| 5 | 7 | 48.2 | 49.5 | 3 / 35 | 1520 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 6 | 33% |
| rz.HawkOnFire 0.1 | 5 | 60% |
| kawigi.mini.Coriantumr 1.1 | 4 | 75% |
| darkcanuck.B26354 1.06 | 4 | 25% |
| kawigi.sbf.FloodHT 0.9.2 | 2 | 50% |
| abc.Tron 2.02 | 2 | 0% |
| simonton.micro.Sprout 1.1.3 | 2 | 100% |

Skipped turns: 0.

Posture (Hadur's M records, 174 rounds): 92599 melee ticks, 7518 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (174 rounds): longest scan gap while four or more were alive 47 ticks (174 rounds over 8); rounds whose longest gap at any count was over 8: 174; robots dropped as dead without a death event: 0.
