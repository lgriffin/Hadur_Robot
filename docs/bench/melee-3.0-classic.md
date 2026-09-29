# Melee bench

hadur2.Hadur 3.0 against 9 opponents at once, 35 rounds per battle, 5 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 77.9 | 42 / 175 | 2.99 | 14.8% | 15188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.3% | 48 |
| hadur2.Hadur 3.0 | 2.6 | 14.8% | 42 |
| kawigi.mini.Coriantumr 1.1 | 3.0 | 15.1% | 36 |
| abc.Tron 2.02 | 3.2 | 14.4% | 40 |
| pedersen.Ugluk 1.0 | 5.0 | 9.9% | 7 |
| kawigi.sbf.FloodMini 1.4 | 6.6 | 7.4% | 0 |
| cx.mini.Cigaret 1.31 | 6.8 | 7.3% | 0 |
| cjm.Chomsky 1.5 | 7.8 | 6.5% | 2 |
| dmp.micro.Aurora 1.41 | 8.8 | 5.5% | 0 |
| mue.Ascendant 1.2.27 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.6 | 79.4 | 6 / 35 | 3290 |
| 2 | 3 | 62.2 | 75.6 | 7 / 35 | 2743 |
| 3 | 1 | 64.5 | 81.6 | 12 / 35 | 3154 |
| 4 | 4 | 60.0 | 69.5 | 5 / 35 | 2886 |
| 5 | 2 | 65.0 | 83.5 | 12 / 35 | 3115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 36 | 47% |
| kawigi.mini.Coriantumr 1.1 | 30 | 50% |
| abc.Tron 2.02 | 24 | 25% |
| pedersen.Ugluk 1.0 | 5 | 80% |

Skipped turns: 303.

Posture (Hadur's M records, 175 rounds): 127087 melee ticks, 29570 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (175 rounds): longest scan gap while four or more were alive 34 ticks (175 rounds over 8); rounds whose longest gap at any count was over 8: 175; robots dropped as dead without a death event: 0.

Targeting waves (175 rounds): 40917 sent, 37034 reached their opponent, 5611 virtual hits (15.2% of those reached).
