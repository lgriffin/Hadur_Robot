# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS06 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 3.5 | 1.1 | 8 / 700 | 1.99 | 3.5% | 3956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 96.5% | 692 |
| hadur117.nano.SanaroS06 0.1 | 2.0 | 3.5% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 3.4 | 0.0 | 0 / 35 | 221 |
| 2 | 2 | 3.7 | 2.9 | 1 / 35 | 174 |
| 3 | 2 | 3.9 | 2.9 | 1 / 35 | 188 |
| 4 | 2 | 4.3 | 2.9 | 1 / 35 | 211 |
| 5 | 2 | 2.6 | 0.0 | 0 / 35 | 167 |
| 6 | 2 | 2.9 | 0.0 | 0 / 35 | 185 |
| 7 | 2 | 2.8 | 0.0 | 0 / 35 | 178 |
| 8 | 2 | 4.0 | 2.9 | 1 / 35 | 190 |
| 9 | 2 | 4.4 | 2.9 | 1 / 35 | 222 |
| 10 | 2 | 3.2 | 0.0 | 0 / 35 | 210 |
| 11 | 2 | 4.2 | 2.9 | 1 / 35 | 203 |
| 12 | 2 | 3.7 | 0.0 | 0 / 35 | 240 |
| 13 | 2 | 3.2 | 0.0 | 0 / 35 | 204 |
| 14 | 2 | 3.7 | 0.0 | 0 / 35 | 234 |
| 15 | 2 | 3.2 | 0.0 | 0 / 35 | 206 |
| 16 | 2 | 3.6 | 2.9 | 1 / 35 | 167 |
| 17 | 2 | 2.5 | 0.0 | 0 / 35 | 160 |
| 18 | 2 | 4.6 | 2.9 | 1 / 35 | 232 |
| 19 | 2 | 3.1 | 0.0 | 0 / 35 | 202 |
| 20 | 2 | 2.5 | 0.0 | 0 / 35 | 162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 1% |

Hadur died in 692 of 700 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 692 | 100% | 700 |

## Melee bench: D2

hadur117.nano.SanaroS06 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 87.0 | 98.7 | 691 / 700 | 1.01 | 87.0% | 53983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS06 0.1 | 1.0 | 87.0% | 691 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 13.0% | 18 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 87.8 | 100.0 | 35 / 35 | 2578 |
| 2 | 1 | 87.8 | 100.0 | 35 / 35 | 2671 |
| 3 | 1 | 86.6 | 100.0 | 35 / 35 | 2722 |
| 4 | 1 | 87.7 | 100.0 | 35 / 35 | 2740 |
| 5 | 1 | 87.1 | 100.0 | 35 / 35 | 2776 |
| 6 | 1 | 86.2 | 97.1 | 34 / 35 | 2565 |
| 7 | 1 | 86.2 | 100.0 | 35 / 35 | 2718 |
| 8 | 1 | 86.8 | 97.1 | 34 / 35 | 2750 |
| 9 | 1 | 86.7 | 97.1 | 34 / 35 | 2652 |
| 10 | 1 | 86.3 | 97.1 | 34 / 35 | 2610 |
| 11 | 1 | 87.8 | 100.0 | 35 / 35 | 2746 |
| 12 | 1 | 86.0 | 94.3 | 33 / 35 | 2519 |
| 13 | 1 | 86.6 | 97.1 | 34 / 35 | 2743 |
| 14 | 1 | 87.4 | 100.0 | 35 / 35 | 2773 |
| 15 | 1 | 86.6 | 97.1 | 34 / 35 | 2730 |
| 16 | 1 | 87.0 | 100.0 | 35 / 35 | 2831 |
| 17 | 1 | 86.8 | 97.1 | 34 / 35 | 2612 |
| 18 | 1 | 87.0 | 100.0 | 35 / 35 | 2766 |
| 19 | 1 | 87.4 | 100.0 | 35 / 35 | 2682 |
| 20 | 1 | 87.2 | 100.0 | 35 / 35 | 2799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 700 | 99% |

Hadur died in 18 of 700 rounds, at a mean tick of 1446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 50% | 672 |
9 death(s) with no robot to name.

