# Melee gates: M2 (melee sensing)

The M2 build (still versioned 2.2) on the two melee fields of `melee-gates.txt`, challenge and reference. M2 changes only the melee package and the M record, so the duel is unchanged by construction (DuelIdentityTest pins the duel sources' hashes) and the duel and sentry fields were not rerun; M1's figures stand for them (docs/bench/m1-gates.md). Same engine, cores and seeds as M1.

## Summary against the exit gate

The M2 exit gate is a longest scan gap of at most 8 ticks on a 10-bot field, with no ghosts.

| Measure | M1 | M2 | Gate |
|---|---|---|---|
| Longest scan gap, any round (challenge / reference) | 526 / 15 | 24 / 15 | ≤ 8 |
| Longest scan gap with four or more alive (challenge / reference) | not measured | 24 / 13 | ≤ 8 |
| Most common per-round longest gap with four or more alive | not measured | 10 ticks | ≤ 8 |
| Rounds whose longest gap with four or more alive stayed at or under 12 ticks | not measured | 97 / 100 and 174 / 175 | |
| Ghosts (ticks aimed at a dead robot; robots dropped without a death event) | 0; not measured | 0; 0 | 0 |
| Challenge: APS, firsts | 62.5, 42 | 60.5, 34 | M3 gate: 100 firsts |
| Reference: APS, survival | 37.0, 32.1 | 37.1, 31.5 | M3 gate: survival ≥ 40 |

**The ghost half of the gate is met; the 8-tick half is not.** The freeze behind M1's 526-tick gap is gone: the old stalest-first radar wobbled around a stale bearing when a robot had moved (MRADAR-1 now sweeps on in the same direction until the stalest robot is found), and a robot the engine had already removed could stay in the tracker (MRADAR-2 now drops the stalest one while more are tracked than the engine's count). What remains is the spin itself. A full radar turn at 45° a tick takes 8 ticks, so 8 is the floor for a steady spin, and a robot moving with the sweep adds one to four more; per-round maxima cluster at 10 to 11 ticks. The two 24-tick rounds on the challenge field have not been traced; they are the outliers to check first. Getting under 8 needs the radar to turn with the gun and body when they turn the same way (up to 75° a tick), or to sweep only the arc the opponents occupy when Hadur is near a wall; both are M6 tuning items, not M2's.

Firsts and APS moved within the noise of a single 100-round battle (M1 42 firsts, a first M2 run 36, this one 34), and reference APS is flat. M2 was a sensing stage and was not expected to move score; M3 and M4 carry the score gates.

Per-round longest gap while four or more were alive (sweep gap), rounds at each value:

| Field | 9 | 10 | 11 | 12 | 13 | 16 | 24 |
|---|---|---|---|---|---|---|---|
| challenge | 16 | 51 | 24 | 6 | 0 | 1 | 2 |
| reference | 33 | 77 | 50 | 14 | 1 | 0 | 0 |

## Melee bench: challenge

hadur2.Hadur 2.2 against 9 opponents at once, 100 rounds per battle, 1 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 70.2 | 34 / 100 | 3.68 | 14.2% | 8951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.0 | 14.5% | 26 |
| rz.HawkOnFire 0.1 | 2.0 | 14.5% | 18 |
| hadur2.Hadur 2.2 | 3.0 | 14.2% | 34 |
| sample.Walls | 4.0 | 9.4% | 6 |
| supersample.SuperSpinBot 1.0 | 5.0 | 9.1% | 5 |
| supersample.SuperTracker 1.0 | 6.0 | 8.6% | 1 |
| SuperSample.SuperCrazy 1.0 | 7.0 | 8.3% | 4 |
| sample.Crazy | 8.0 | 7.5% | 3 |
| sample.SpinBot | 9.0 | 7.4% | 1 |
| supersample.SuperWalls 1.0 | 10.0 | 6.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 70.2 | 34 / 100 | 8951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 16 | 100% |
| sample.Walls | 8 | 100% |
| rz.HawkOnFire 0.1 | 7 | 29% |
| supersample.SuperWalls 1.0 | 3 | 100% |
| supersample.SuperTracker 1.0 | 2 | 100% |
| sample.SpinBot | 2 | 100% |
| SuperSample.SuperCrazy 1.0 | 2 | 0% |
| supersample.SuperSpinBot 1.0 | 2 | 50% |

Skipped turns: 0.

Posture (Hadur's M records, 100 rounds): 62224 melee ticks, 8258 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (100 rounds): longest scan gap while four or more were alive 24 ticks (100 rounds over 8); rounds whose longest gap at any count was over 8: 100; robots dropped as dead without a death event: 0.

## Melee bench: reference

hadur2.Hadur 2.2 against 9 opponents at once, 35 rounds per battle, 5 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 37.1 | 31.5 | 1 / 175 | 7.17 | 5.9% | 7076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 14.2% | 47 |
| darkcanuck.B26354 1.06 | 3.0 | 12.1% | 38 |
| abc.Tron 2.02 | 4.4 | 10.8% | 20 |
| kawigi.sbf.FloodHT 0.9.2 | 5.0 | 10.9% | 19 |
| rz.HawkOnFire 0.1 | 5.0 | 10.8% | 9 |
| simonton.micro.Sprout 1.1.3 | 5.6 | 10.7% | 7 |
| kawigi.mini.Coriantumr 1.1 | 5.8 | 10.3% | 10 |
| gh.Griezel 0.5.4 | 6.2 | 10.2% | 24 |
| hadur2.Hadur 2.2 | 9.0 | 5.9% | 1 |
| cx.mini.Cigaret 1.31 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 9 | 35.1 | 29.2 | 0 / 35 | 1316 |
| 2 | 9 | 36.1 | 30.2 | 1 / 35 | 1303 |
| 3 | 9 | 36.7 | 29.8 | 0 / 35 | 1475 |
| 4 | 9 | 36.0 | 30.5 | 0 / 35 | 1266 |
| 5 | 9 | 41.7 | 37.8 | 0 / 35 | 1716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1 | 100% |
| simonton.micro.Sprout 1.1.3 | 1 | 0% |

Skipped turns: 0.

Posture (Hadur's M records, 175 rounds): 62326 melee ticks, 172 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 15 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (175 rounds): longest scan gap while four or more were alive 13 ticks (175 rounds over 8); rounds whose longest gap at any count was over 8: 175; robots dropped as dead without a death event: 0.
