# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS08 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 2.1 | 0.4 | 3 / 700 | 2.00 | 2.1% | 2495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 97.9% | 697 |
| hadur117.nano.SanaroS08 0.1 | 2.0 | 2.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 1.5 | 0.0 | 0 / 35 | 95 |
| 2 | 2 | 2.3 | 0.0 | 0 / 35 | 148 |
| 3 | 2 | 2.0 | 0.0 | 0 / 35 | 121 |
| 4 | 2 | 2.6 | 0.0 | 0 / 35 | 165 |
| 5 | 2 | 1.7 | 0.0 | 0 / 35 | 107 |
| 6 | 2 | 1.7 | 0.0 | 0 / 35 | 105 |
| 7 | 2 | 2.7 | 2.9 | 1 / 35 | 104 |
| 8 | 2 | 1.7 | 0.0 | 0 / 35 | 105 |
| 9 | 2 | 2.3 | 0.0 | 0 / 35 | 143 |
| 10 | 2 | 1.9 | 0.0 | 0 / 35 | 117 |
| 11 | 2 | 3.3 | 2.9 | 1 / 35 | 144 |
| 12 | 2 | 2.6 | 0.0 | 0 / 35 | 167 |
| 13 | 2 | 1.7 | 0.0 | 0 / 35 | 105 |
| 14 | 2 | 1.9 | 0.0 | 0 / 35 | 120 |
| 15 | 2 | 2.1 | 0.0 | 0 / 35 | 134 |
| 16 | 2 | 1.7 | 0.0 | 0 / 35 | 103 |
| 17 | 2 | 4.1 | 2.9 | 1 / 35 | 197 |
| 18 | 2 | 2.1 | 0.0 | 0 / 35 | 135 |
| 19 | 2 | 1.7 | 0.0 | 0 / 35 | 105 |
| 20 | 2 | 1.2 | 0.0 | 0 / 35 | 75 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 0% |

Hadur died in 697 of 700 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 697 | 100% | 700 |

## Melee bench: D2

hadur117.nano.SanaroS08 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 88.7 | 96.6 | 676 / 700 | 1.03 | 88.7% | 45493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS08 0.1 | 1.0 | 88.7% | 676 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 11.3% | 34 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 89.2 | 97.1 | 34 / 35 | 2275 |
| 2 | 1 | 85.4 | 88.6 | 31 / 35 | 2187 |
| 3 | 1 | 88.2 | 97.1 | 34 / 35 | 2216 |
| 4 | 1 | 89.1 | 97.1 | 34 / 35 | 2246 |
| 5 | 1 | 88.0 | 94.3 | 33 / 35 | 2233 |
| 6 | 1 | 88.6 | 97.1 | 34 / 35 | 2306 |
| 7 | 1 | 87.5 | 94.3 | 33 / 35 | 2253 |
| 8 | 1 | 88.6 | 97.1 | 34 / 35 | 2168 |
| 9 | 1 | 89.0 | 97.1 | 34 / 35 | 2298 |
| 10 | 1 | 87.9 | 94.3 | 33 / 35 | 2354 |
| 11 | 1 | 88.9 | 97.1 | 34 / 35 | 2309 |
| 12 | 1 | 89.1 | 97.1 | 34 / 35 | 2400 |
| 13 | 1 | 90.8 | 100.0 | 35 / 35 | 2238 |
| 14 | 1 | 89.8 | 100.0 | 35 / 35 | 2525 |
| 15 | 1 | 87.7 | 94.3 | 33 / 35 | 2217 |
| 16 | 1 | 88.9 | 97.1 | 34 / 35 | 2352 |
| 17 | 1 | 88.7 | 97.1 | 34 / 35 | 2152 |
| 18 | 1 | 90.2 | 100.0 | 35 / 35 | 2331 |
| 19 | 1 | 89.6 | 100.0 | 35 / 35 | 2307 |
| 20 | 1 | 87.9 | 94.3 | 33 / 35 | 2126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 700 | 97% |

Hadur died in 34 of 700 rounds, at a mean tick of 1458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 71% | 671 |
10 death(s) with no robot to name.

