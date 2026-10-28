# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroB800 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 3.5 | 1.1 | 8 / 700 | 1.99 | 3.5% | 3996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 96.5% | 692 |
| hadur117.nano.SanaroB800 0.1 | 2.0 | 3.5% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 3.4 | 0.0 | 0 / 35 | 217 |
| 2 | 2 | 2.9 | 0.0 | 0 / 35 | 185 |
| 3 | 2 | 3.7 | 2.9 | 1 / 35 | 172 |
| 4 | 2 | 4.2 | 2.9 | 1 / 35 | 205 |
| 5 | 2 | 3.9 | 2.9 | 1 / 35 | 188 |
| 6 | 2 | 3.4 | 0.0 | 0 / 35 | 219 |
| 7 | 2 | 2.5 | 0.0 | 0 / 35 | 156 |
| 8 | 2 | 3.5 | 2.9 | 1 / 35 | 162 |
| 9 | 2 | 2.8 | 0.0 | 0 / 35 | 180 |
| 10 | 2 | 4.9 | 5.7 | 2 / 35 | 185 |
| 11 | 2 | 3.2 | 0.0 | 0 / 35 | 209 |
| 12 | 2 | 3.6 | 0.0 | 0 / 35 | 235 |
| 13 | 2 | 4.4 | 2.9 | 1 / 35 | 220 |
| 14 | 2 | 2.7 | 0.0 | 0 / 35 | 170 |
| 15 | 2 | 2.8 | 0.0 | 0 / 35 | 173 |
| 16 | 2 | 2.7 | 0.0 | 0 / 35 | 173 |
| 17 | 2 | 3.7 | 0.0 | 0 / 35 | 238 |
| 18 | 2 | 3.5 | 0.0 | 0 / 35 | 226 |
| 19 | 2 | 5.1 | 2.9 | 1 / 35 | 267 |
| 20 | 2 | 3.4 | 0.0 | 0 / 35 | 216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 1% |

Hadur died in 692 of 700 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 692 | 100% | 700 |

## Melee bench: D2

hadur117.nano.SanaroB800 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 87.1 | 99.1 | 694 / 700 | 1.01 | 87.1% | 53433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB800 0.1 | 1.0 | 87.1% | 694 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 12.9% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 86.9 | 97.1 | 34 / 35 | 2553 |
| 2 | 1 | 85.8 | 97.1 | 34 / 35 | 2598 |
| 3 | 1 | 86.8 | 100.0 | 35 / 35 | 2764 |
| 4 | 1 | 86.8 | 100.0 | 35 / 35 | 2805 |
| 5 | 1 | 86.4 | 97.1 | 34 / 35 | 2807 |
| 6 | 1 | 87.2 | 100.0 | 35 / 35 | 2721 |
| 7 | 1 | 87.0 | 100.0 | 35 / 35 | 2432 |
| 8 | 1 | 86.4 | 97.1 | 34 / 35 | 2685 |
| 9 | 1 | 87.8 | 100.0 | 35 / 35 | 2505 |
| 10 | 1 | 87.5 | 100.0 | 35 / 35 | 2699 |
| 11 | 1 | 87.9 | 100.0 | 35 / 35 | 2671 |
| 12 | 1 | 87.2 | 100.0 | 35 / 35 | 2612 |
| 13 | 1 | 87.2 | 97.1 | 34 / 35 | 2594 |
| 14 | 1 | 86.6 | 100.0 | 35 / 35 | 2691 |
| 15 | 1 | 87.6 | 100.0 | 35 / 35 | 2775 |
| 16 | 1 | 87.6 | 100.0 | 35 / 35 | 2579 |
| 17 | 1 | 87.1 | 100.0 | 35 / 35 | 2769 |
| 18 | 1 | 87.6 | 100.0 | 35 / 35 | 2766 |
| 19 | 1 | 87.7 | 100.0 | 35 / 35 | 2833 |
| 20 | 1 | 86.9 | 97.1 | 34 / 35 | 2574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 700 | 99% |

Hadur died in 13 of 700 rounds, at a mean tick of 1439. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 46% | 672 |
7 death(s) with no robot to name.

