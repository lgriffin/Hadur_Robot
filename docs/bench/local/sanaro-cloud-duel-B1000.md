# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroB1000 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 25 over 10 battles (2.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 28.5 | 32.9 | 115 / 350 | 1.67 | 28.5% | 9805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 71.5% | 235 |
| hadur117.nano.SanaroB1000 0.1 | 2.0 | 28.5% | 115 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 31.2 | 37.1 | 13 / 35 | 994 |
| 2 | 2 | 26.9 | 28.6 | 10 / 35 | 1016 |
| 3 | 2 | 21.5 | 22.9 | 8 / 35 | 784 |
| 4 | 2 | 26.0 | 28.6 | 10 / 35 | 930 |
| 5 | 2 | 38.0 | 51.4 | 18 / 35 | 1127 |
| 6 | 2 | 25.2 | 25.7 | 9 / 35 | 990 |
| 7 | 2 | 29.8 | 34.3 | 12 / 35 | 1054 |
| 8 | 2 | 30.7 | 37.1 | 13 / 35 | 983 |
| 9 | 2 | 32.2 | 40.0 | 14 / 35 | 994 |
| 10 | 2 | 23.8 | 22.9 | 8 / 35 | 933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 350 | 33% |

Hadur died in 235 of 350 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 235 | 100% | 348 |

## Melee bench: D2

hadur117.nano.SanaroB1000 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 10 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 96.9 | 94.3 | 330 / 350 | 1.06 | 96.9% | 31050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB1000 0.1 | 1.0 | 96.9% | 330 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 3.1% | 21 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 94.8 | 88.6 | 31 / 35 | 2966 |
| 2 | 1 | 97.1 | 94.3 | 33 / 35 | 3145 |
| 3 | 1 | 97.0 | 94.3 | 33 / 35 | 3154 |
| 4 | 1 | 96.1 | 91.4 | 32 / 35 | 3031 |
| 5 | 1 | 95.8 | 91.4 | 32 / 35 | 2987 |
| 6 | 1 | 97.6 | 97.1 | 34 / 35 | 2984 |
| 7 | 1 | 99.2 | 100.0 | 35 / 35 | 3204 |
| 8 | 1 | 95.9 | 91.4 | 32 / 35 | 3074 |
| 9 | 1 | 99.1 | 100.0 | 35 / 35 | 3349 |
| 10 | 1 | 96.9 | 94.3 | 33 / 35 | 3156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 350 | 94% |

Hadur died in 21 of 350 rounds, at a mean tick of 1425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 95% | 322 |
1 death(s) with no robot to name.

