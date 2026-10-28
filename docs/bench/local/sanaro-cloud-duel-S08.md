# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS08 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 25 over 10 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 2.0 | 0.0 | 0 / 350 | 2.00 | 2.0% | 1249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 98.0% | 350 |
| hadur117.nano.SanaroS08 0.1 | 2.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 2.5 | 0.0 | 0 / 35 | 157 |
| 2 | 2 | 1.6 | 0.0 | 0 / 35 | 98 |
| 3 | 2 | 2.3 | 0.0 | 0 / 35 | 144 |
| 4 | 2 | 2.0 | 0.0 | 0 / 35 | 126 |
| 5 | 2 | 1.6 | 0.0 | 0 / 35 | 99 |
| 6 | 2 | 1.4 | 0.0 | 0 / 35 | 86 |
| 7 | 2 | 2.1 | 0.0 | 0 / 35 | 136 |
| 8 | 2 | 1.9 | 0.0 | 0 / 35 | 120 |
| 9 | 2 | 2.0 | 0.0 | 0 / 35 | 127 |
| 10 | 2 | 2.5 | 0.0 | 0 / 35 | 156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 350 | 0% |

Hadur died in 350 of 350 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 350 | 100% | 350 |

## Melee bench: D2

hadur117.nano.SanaroS08 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 19 over 10 battles (1.9 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 88.8 | 97.1 | 340 / 350 | 1.03 | 88.8% | 23067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS08 0.1 | 1.0 | 88.8% | 340 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 11.2% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 90.3 | 100.0 | 35 / 35 | 2290 |
| 2 | 1 | 89.1 | 97.1 | 34 / 35 | 2279 |
| 3 | 1 | 88.6 | 97.1 | 34 / 35 | 2469 |
| 4 | 1 | 89.4 | 100.0 | 35 / 35 | 2482 |
| 5 | 1 | 87.4 | 94.3 | 33 / 35 | 2264 |
| 6 | 1 | 87.8 | 94.3 | 33 / 35 | 2278 |
| 7 | 1 | 88.8 | 97.1 | 34 / 35 | 2348 |
| 8 | 1 | 87.7 | 94.3 | 33 / 35 | 2106 |
| 9 | 1 | 88.9 | 97.1 | 34 / 35 | 2074 |
| 10 | 1 | 90.0 | 100.0 | 35 / 35 | 2477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 350 | 97% |

Hadur died in 13 of 350 rounds, at a mean tick of 1583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 77% | 339 |
3 death(s) with no robot to name.

