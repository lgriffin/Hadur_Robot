# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS10 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 5.0 | 7.6 | 53 / 700 | 1.92 | 5.0% | 2597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 95.0% | 647 |
| hadur117.nano.SanaroS10 0.1 | 2.0 | 5.0% | 53 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 8.3 | 14.3 | 5 / 35 | 167 |
| 2 | 2 | 3.1 | 2.9 | 1 / 35 | 117 |
| 3 | 2 | 3.0 | 2.9 | 1 / 35 | 115 |
| 4 | 2 | 5.1 | 8.6 | 3 / 35 | 111 |
| 5 | 2 | 6.3 | 11.4 | 4 / 35 | 116 |
| 6 | 2 | 2.3 | 0.0 | 0 / 35 | 140 |
| 7 | 2 | 3.9 | 5.7 | 2 / 35 | 104 |
| 8 | 2 | 5.1 | 8.6 | 3 / 35 | 112 |
| 9 | 2 | 2.9 | 2.9 | 1 / 35 | 111 |
| 10 | 2 | 5.1 | 5.7 | 2 / 35 | 177 |
| 11 | 2 | 6.5 | 11.4 | 4 / 35 | 133 |
| 12 | 2 | 5.0 | 8.6 | 3 / 35 | 105 |
| 13 | 2 | 3.0 | 2.9 | 1 / 35 | 120 |
| 14 | 2 | 9.1 | 17.1 | 6 / 35 | 143 |
| 15 | 2 | 8.0 | 14.3 | 5 / 35 | 160 |
| 16 | 2 | 7.4 | 14.3 | 5 / 35 | 120 |
| 17 | 2 | 1.9 | 0.0 | 0 / 35 | 114 |
| 18 | 2 | 4.2 | 5.7 | 2 / 35 | 124 |
| 19 | 2 | 5.8 | 8.6 | 3 / 35 | 156 |
| 20 | 2 | 4.6 | 5.7 | 2 / 35 | 152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 8% |

Hadur died in 647 of 700 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 647 | 100% | 699 |

## Melee bench: D2

hadur117.nano.SanaroS10 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.3 | 24.9 | 174 / 700 | 1.75 | 54.3% | 34691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS10 0.1 | 1.2 | 54.3% | 174 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 45.7% | 533 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 53.6 | 22.9 | 8 / 35 | 1826 |
| 2 | 1 | 62.1 | 37.1 | 13 / 35 | 1882 |
| 3 | 1 | 56.2 | 31.4 | 11 / 35 | 1710 |
| 4 | 2 | 49.9 | 17.1 | 6 / 35 | 1695 |
| 5 | 1 | 51.5 | 22.9 | 8 / 35 | 1630 |
| 6 | 1 | 51.6 | 20.0 | 7 / 35 | 1747 |
| 7 | 1 | 57.0 | 25.7 | 9 / 35 | 1975 |
| 8 | 1 | 52.0 | 20.0 | 7 / 35 | 1729 |
| 9 | 1 | 55.6 | 25.7 | 9 / 35 | 1785 |
| 10 | 1 | 59.1 | 31.4 | 11 / 35 | 1857 |
| 11 | 1 | 54.4 | 25.7 | 9 / 35 | 1683 |
| 12 | 1 | 65.6 | 45.7 | 16 / 35 | 1797 |
| 13 | 1 | 54.4 | 25.7 | 9 / 35 | 1636 |
| 14 | 2 | 48.6 | 17.1 | 6 / 35 | 1574 |
| 15 | 1 | 56.2 | 25.7 | 9 / 35 | 1879 |
| 16 | 2 | 46.1 | 11.4 | 4 / 35 | 1605 |
| 17 | 1 | 52.2 | 20.0 | 7 / 35 | 1756 |
| 18 | 1 | 56.5 | 31.4 | 11 / 35 | 1640 |
| 19 | 1 | 53.1 | 22.9 | 8 / 35 | 1683 |
| 20 | 2 | 49.6 | 17.1 | 6 / 35 | 1602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 700 | 25% |

Hadur died in 539 of 700 rounds, at a mean tick of 4638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 532 | 99% | 651 |
7 death(s) with no robot to name.

