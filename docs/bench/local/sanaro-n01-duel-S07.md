# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS07 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 2.4 | 0.6 | 4 / 700 | 1.99 | 2.4% | 2811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 97.6% | 696 |
| hadur117.nano.SanaroS07 0.1 | 2.0 | 2.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 2.5 | 0.0 | 0 / 35 | 157 |
| 2 | 2 | 2.0 | 0.0 | 0 / 35 | 124 |
| 3 | 2 | 2.4 | 0.0 | 0 / 35 | 149 |
| 4 | 2 | 2.0 | 0.0 | 0 / 35 | 124 |
| 5 | 2 | 1.9 | 0.0 | 0 / 35 | 122 |
| 6 | 2 | 2.4 | 0.0 | 0 / 35 | 151 |
| 7 | 2 | 2.2 | 0.0 | 0 / 35 | 137 |
| 8 | 2 | 1.9 | 0.0 | 0 / 35 | 123 |
| 9 | 2 | 2.0 | 0.0 | 0 / 35 | 123 |
| 10 | 2 | 3.0 | 2.9 | 1 / 35 | 123 |
| 11 | 2 | 2.3 | 0.0 | 0 / 35 | 147 |
| 12 | 2 | 2.9 | 0.0 | 0 / 35 | 186 |
| 13 | 2 | 3.2 | 2.9 | 1 / 35 | 133 |
| 14 | 2 | 2.9 | 0.0 | 0 / 35 | 182 |
| 15 | 2 | 3.6 | 2.9 | 1 / 35 | 162 |
| 16 | 2 | 2.4 | 0.0 | 0 / 35 | 154 |
| 17 | 2 | 1.7 | 0.0 | 0 / 35 | 109 |
| 18 | 2 | 1.9 | 0.0 | 0 / 35 | 121 |
| 19 | 2 | 3.3 | 2.9 | 1 / 35 | 148 |
| 20 | 2 | 2.1 | 0.0 | 0 / 35 | 136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 1% |

Hadur died in 696 of 700 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 696 | 100% | 700 |

## Melee bench: D2

hadur117.nano.SanaroS07 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 88.4 | 97.9 | 685 / 700 | 1.02 | 88.4% | 47882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS07 0.1 | 1.0 | 88.4% | 685 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 11.6% | 19 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 89.8 | 100.0 | 35 / 35 | 2570 |
| 2 | 1 | 88.4 | 100.0 | 35 / 35 | 2445 |
| 3 | 1 | 88.7 | 97.1 | 34 / 35 | 2336 |
| 4 | 1 | 87.1 | 94.3 | 33 / 35 | 2170 |
| 5 | 1 | 88.0 | 97.1 | 34 / 35 | 2581 |
| 6 | 1 | 89.2 | 100.0 | 35 / 35 | 2533 |
| 7 | 1 | 88.5 | 97.1 | 34 / 35 | 2276 |
| 8 | 1 | 87.5 | 97.1 | 34 / 35 | 2426 |
| 9 | 1 | 87.8 | 97.1 | 34 / 35 | 2323 |
| 10 | 1 | 86.9 | 94.3 | 33 / 35 | 2221 |
| 11 | 1 | 89.1 | 100.0 | 35 / 35 | 2537 |
| 12 | 1 | 88.9 | 100.0 | 35 / 35 | 2495 |
| 13 | 1 | 89.2 | 100.0 | 35 / 35 | 2575 |
| 14 | 1 | 89.2 | 100.0 | 35 / 35 | 2528 |
| 15 | 1 | 88.2 | 97.1 | 34 / 35 | 2307 |
| 16 | 1 | 87.7 | 94.3 | 33 / 35 | 2095 |
| 17 | 1 | 89.4 | 100.0 | 35 / 35 | 2406 |
| 18 | 1 | 88.5 | 97.1 | 34 / 35 | 2330 |
| 19 | 1 | 88.3 | 97.1 | 34 / 35 | 2310 |
| 20 | 1 | 88.0 | 97.1 | 34 / 35 | 2418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 700 | 98% |

Hadur died in 19 of 700 rounds, at a mean tick of 1498. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 79% | 681 |
4 death(s) with no robot to name.

