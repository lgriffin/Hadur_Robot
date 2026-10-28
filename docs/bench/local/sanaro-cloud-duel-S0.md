# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS0 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 10 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 2.2 | 0.3 | 1 / 350 | 2.00 | 2.2% | 1322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 97.8% | 349 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 2.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 2.0 | 0.0 | 0 / 35 | 127 |
| 2 | 2 | 2.2 | 0.0 | 0 / 35 | 142 |
| 3 | 2 | 2.3 | 0.0 | 0 / 35 | 150 |
| 4 | 2 | 2.1 | 0.0 | 0 / 35 | 134 |
| 5 | 2 | 2.0 | 0.0 | 0 / 35 | 126 |
| 6 | 2 | 1.7 | 0.0 | 0 / 35 | 108 |
| 7 | 2 | 2.3 | 0.0 | 0 / 35 | 150 |
| 8 | 2 | 2.2 | 0.0 | 0 / 35 | 140 |
| 9 | 2 | 2.3 | 0.0 | 0 / 35 | 147 |
| 10 | 2 | 2.5 | 2.9 | 1 / 35 | 98 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 350 | 0% |

Hadur died in 349 of 350 rounds, at a mean tick of 406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 349 | 100% | 349 |

## Melee bench: D2

hadur117.nano.SanaroS0 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 29 over 10 battles (2.9 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 48.7 | 43.7 | 153 / 350 | 1.56 | 48.7% | 50573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.3 | 51.3% | 201 |
| hadur117.nano.SanaroS0 0.1 | 1.7 | 48.7% | 153 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 50.1 | 48.6 | 17 / 35 | 4962 |
| 2 | 2 | 46.4 | 34.3 | 12 / 35 | 5166 |
| 3 | 2 | 47.1 | 37.1 | 13 / 35 | 5190 |
| 4 | 2 | 49.4 | 45.7 | 16 / 35 | 5158 |
| 5 | 2 | 48.8 | 42.9 | 15 / 35 | 5092 |
| 6 | 1 | 52.1 | 57.1 | 20 / 35 | 5127 |
| 7 | 2 | 50.0 | 48.6 | 17 / 35 | 5248 |
| 8 | 1 | 50.4 | 51.4 | 18 / 35 | 5018 |
| 9 | 2 | 48.2 | 45.7 | 16 / 35 | 4596 |
| 10 | 2 | 44.4 | 25.7 | 9 / 35 | 5016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 350 | 44% |

Hadur died in 208 of 350 rounds, at a mean tick of 6514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 204 | 98% | 341 |
4 death(s) with no robot to name.

