# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroFL 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 3.3 | 0.0 | 0 / 700 | 2.00 | 3.3% | 4284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 96.7% | 700 |
| hadur117.nano.SanaroFL 0.1 | 2.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 3.6 | 0.0 | 0 / 35 | 233 |
| 2 | 2 | 3.1 | 0.0 | 0 / 35 | 200 |
| 3 | 2 | 3.3 | 0.0 | 0 / 35 | 216 |
| 4 | 2 | 3.0 | 0.0 | 0 / 35 | 194 |
| 5 | 2 | 4.6 | 0.0 | 0 / 35 | 307 |
| 6 | 2 | 3.5 | 0.0 | 0 / 35 | 226 |
| 7 | 2 | 4.4 | 0.0 | 0 / 35 | 293 |
| 8 | 2 | 2.9 | 0.0 | 0 / 35 | 185 |
| 9 | 2 | 3.0 | 0.0 | 0 / 35 | 194 |
| 10 | 2 | 3.2 | 0.0 | 0 / 35 | 209 |
| 11 | 2 | 3.2 | 0.0 | 0 / 35 | 208 |
| 12 | 2 | 3.4 | 0.0 | 0 / 35 | 220 |
| 13 | 2 | 3.1 | 0.0 | 0 / 35 | 202 |
| 14 | 2 | 3.0 | 0.0 | 0 / 35 | 195 |
| 15 | 2 | 3.1 | 0.0 | 0 / 35 | 201 |
| 16 | 2 | 2.8 | 0.0 | 0 / 35 | 177 |
| 17 | 2 | 3.0 | 0.0 | 0 / 35 | 197 |
| 18 | 2 | 2.9 | 0.0 | 0 / 35 | 187 |
| 19 | 2 | 3.7 | 0.0 | 0 / 35 | 243 |
| 20 | 2 | 3.1 | 0.0 | 0 / 35 | 197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 0% |

Hadur died in 700 of 700 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 100% | 700 |

## Melee bench: D2

hadur117.nano.SanaroFL 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 76.1 | 99.1 | 694 / 700 | 1.01 | 76.1% | 70784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroFL 0.1 | 1.0 | 76.1% | 694 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 23.9% | 10 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 76.9 | 100.0 | 35 / 35 | 3429 |
| 2 | 1 | 75.6 | 97.1 | 34 / 35 | 3488 |
| 3 | 1 | 76.4 | 100.0 | 35 / 35 | 3591 |
| 4 | 1 | 76.0 | 97.1 | 34 / 35 | 3568 |
| 5 | 1 | 75.8 | 100.0 | 35 / 35 | 3483 |
| 6 | 1 | 76.9 | 100.0 | 35 / 35 | 3510 |
| 7 | 1 | 76.5 | 100.0 | 35 / 35 | 3601 |
| 8 | 1 | 75.9 | 100.0 | 35 / 35 | 3628 |
| 9 | 1 | 76.2 | 100.0 | 35 / 35 | 3569 |
| 10 | 1 | 75.9 | 100.0 | 35 / 35 | 3664 |
| 11 | 1 | 75.5 | 97.1 | 34 / 35 | 3478 |
| 12 | 1 | 76.3 | 100.0 | 35 / 35 | 3640 |
| 13 | 1 | 75.9 | 97.1 | 34 / 35 | 3535 |
| 14 | 1 | 74.7 | 97.1 | 34 / 35 | 3496 |
| 15 | 1 | 76.2 | 100.0 | 35 / 35 | 3596 |
| 16 | 1 | 76.0 | 97.1 | 34 / 35 | 3472 |
| 17 | 1 | 76.9 | 100.0 | 35 / 35 | 3511 |
| 18 | 1 | 76.6 | 100.0 | 35 / 35 | 3444 |
| 19 | 1 | 76.5 | 100.0 | 35 / 35 | 3513 |
| 20 | 1 | 75.9 | 100.0 | 35 / 35 | 3568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 700 | 99% |

Hadur died in 10 of 700 rounds, at a mean tick of 1419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 60% | 688 |
4 death(s) with no robot to name.

