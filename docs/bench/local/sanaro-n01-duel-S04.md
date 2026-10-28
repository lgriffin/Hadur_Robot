# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS04 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 5.0 | 1.6 | 11 / 700 | 1.98 | 5.0% | 5952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 95.0% | 689 |
| hadur117.nano.SanaroS04 0.1 | 2.0 | 5.0% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 4.6 | 0.0 | 0 / 35 | 306 |
| 2 | 2 | 5.5 | 2.9 | 1 / 35 | 298 |
| 3 | 2 | 4.7 | 0.0 | 0 / 35 | 309 |
| 4 | 2 | 5.0 | 0.0 | 0 / 35 | 332 |
| 5 | 2 | 5.2 | 0.0 | 0 / 35 | 349 |
| 6 | 2 | 5.3 | 2.9 | 1 / 35 | 284 |
| 7 | 2 | 4.2 | 0.0 | 0 / 35 | 273 |
| 8 | 2 | 5.3 | 2.9 | 1 / 35 | 289 |
| 9 | 2 | 5.5 | 2.9 | 1 / 35 | 304 |
| 10 | 2 | 6.6 | 2.9 | 1 / 35 | 382 |
| 11 | 2 | 4.7 | 0.0 | 0 / 35 | 312 |
| 12 | 2 | 5.0 | 2.9 | 1 / 35 | 267 |
| 13 | 2 | 4.0 | 0.0 | 0 / 35 | 265 |
| 14 | 2 | 5.8 | 2.9 | 1 / 35 | 318 |
| 15 | 2 | 5.1 | 2.9 | 1 / 35 | 270 |
| 16 | 2 | 4.2 | 0.0 | 0 / 35 | 279 |
| 17 | 2 | 3.8 | 0.0 | 0 / 35 | 252 |
| 18 | 2 | 5.4 | 2.9 | 1 / 35 | 291 |
| 19 | 2 | 4.2 | 0.0 | 0 / 35 | 278 |
| 20 | 2 | 6.5 | 5.7 | 2 / 35 | 294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 2% |

Hadur died in 689 of 700 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 689 | 100% | 700 |

## Melee bench: D2

hadur117.nano.SanaroS04 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 78.4 | 99.6 | 697 / 700 | 1.00 | 78.4% | 68733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS04 0.1 | 1.0 | 78.4% | 697 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 21.6% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 78.1 | 100.0 | 35 / 35 | 3450 |
| 2 | 1 | 78.7 | 100.0 | 35 / 35 | 3413 |
| 3 | 1 | 78.4 | 100.0 | 35 / 35 | 3494 |
| 4 | 1 | 79.1 | 100.0 | 35 / 35 | 3465 |
| 5 | 1 | 78.5 | 100.0 | 35 / 35 | 3403 |
| 6 | 1 | 77.4 | 97.1 | 34 / 35 | 3445 |
| 7 | 1 | 78.9 | 100.0 | 35 / 35 | 3407 |
| 8 | 1 | 78.7 | 100.0 | 35 / 35 | 3501 |
| 9 | 1 | 77.9 | 97.1 | 34 / 35 | 3402 |
| 10 | 1 | 78.0 | 97.1 | 34 / 35 | 3207 |
| 11 | 1 | 78.2 | 100.0 | 35 / 35 | 3511 |
| 12 | 1 | 78.6 | 100.0 | 35 / 35 | 3531 |
| 13 | 1 | 78.5 | 100.0 | 35 / 35 | 3431 |
| 14 | 1 | 78.9 | 100.0 | 35 / 35 | 3383 |
| 15 | 1 | 78.0 | 100.0 | 35 / 35 | 3507 |
| 16 | 1 | 77.9 | 100.0 | 35 / 35 | 3423 |
| 17 | 1 | 78.6 | 100.0 | 35 / 35 | 3437 |
| 18 | 1 | 78.1 | 100.0 | 35 / 35 | 3409 |
| 19 | 1 | 78.3 | 100.0 | 35 / 35 | 3423 |
| 20 | 1 | 78.2 | 100.0 | 35 / 35 | 3491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 700 | 100% |

Hadur died in 7 of 700 rounds, at a mean tick of 1436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 43% | 686 |
4 death(s) with no robot to name.

