# Melee bench

hadur2.Hadur 3.0 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 76.6 | 100.0 | 105 / 105 | 1.00 | 26.4% | 32989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.0 | 1.0 | 26.4% | 105 |
| sample.Walls | 2.0 | 11.2% | 0 |
| sample.SpinBot | 3.7 | 9.8% | 0 |
| sample.Crazy | 4.3 | 9.5% | 0 |
| sample.Tracker | 4.7 | 9.5% | 0 |
| sample.VelociRobot | 6.3 | 8.4% | 0 |
| sample.RamFire | 6.7 | 7.5% | 0 |
| sample.Fire | 7.3 | 6.6% | 0 |
| sample.Corners | 9.0 | 5.9% | 0 |
| sample.TrackFire | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 76.6 | 100.0 | 35 / 35 | 10735 |
| 2 | 1 | 76.7 | 100.0 | 35 / 35 | 11090 |
| 3 | 1 | 76.6 | 100.0 | 35 / 35 | 11164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sample.Walls | 37 | 100% |
| sample.Crazy | 19 | 100% |
| sample.VelociRobot | 18 | 100% |
| sample.Tracker | 17 | 100% |
| sample.Fire | 5 | 100% |
| sample.SpinBot | 4 | 100% |
| sample.Corners | 3 | 100% |
| sample.RamFire | 2 | 100% |

Skipped turns: 644.

Posture (Hadur's M records, 105 rounds): 86861 melee ticks, 27959 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 80 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 29862 sent, 27709 reached their opponent, 13114 virtual hits (47.3% of those reached).
