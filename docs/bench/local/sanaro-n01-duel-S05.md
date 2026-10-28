# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS05 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 4.2 | 0.9 | 6 / 700 | 1.99 | 4.2% | 5074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 95.8% | 694 |
| hadur117.nano.SanaroS05 0.1 | 2.0 | 4.2% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 3.9 | 0.0 | 0 / 35 | 254 |
| 2 | 2 | 4.3 | 2.9 | 1 / 35 | 214 |
| 3 | 2 | 4.1 | 0.0 | 0 / 35 | 272 |
| 4 | 2 | 3.4 | 0.0 | 0 / 35 | 221 |
| 5 | 2 | 3.6 | 0.0 | 0 / 35 | 232 |
| 6 | 2 | 4.1 | 0.0 | 0 / 35 | 270 |
| 7 | 2 | 4.7 | 0.0 | 0 / 35 | 310 |
| 8 | 2 | 5.6 | 2.9 | 1 / 35 | 303 |
| 9 | 2 | 3.9 | 0.0 | 0 / 35 | 256 |
| 10 | 2 | 4.6 | 2.9 | 1 / 35 | 234 |
| 11 | 2 | 4.6 | 0.0 | 0 / 35 | 302 |
| 12 | 2 | 3.4 | 0.0 | 0 / 35 | 222 |
| 13 | 2 | 3.8 | 0.0 | 0 / 35 | 246 |
| 14 | 2 | 4.9 | 2.9 | 1 / 35 | 256 |
| 15 | 2 | 5.6 | 2.9 | 1 / 35 | 306 |
| 16 | 2 | 3.6 | 0.0 | 0 / 35 | 233 |
| 17 | 2 | 3.0 | 0.0 | 0 / 35 | 197 |
| 18 | 2 | 4.8 | 2.9 | 1 / 35 | 250 |
| 19 | 2 | 3.7 | 0.0 | 0 / 35 | 243 |
| 20 | 2 | 3.9 | 0.0 | 0 / 35 | 253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 1% |

Hadur died in 694 of 700 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 694 | 100% | 699 |

## Melee bench: D2

hadur117.nano.SanaroS05 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 83.2 | 99.3 | 695 / 700 | 1.01 | 83.2% | 60896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS05 0.1 | 1.0 | 83.2% | 695 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 16.8% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 82.1 | 97.1 | 34 / 35 | 2972 |
| 2 | 1 | 83.7 | 100.0 | 35 / 35 | 2940 |
| 3 | 1 | 82.9 | 97.1 | 34 / 35 | 2995 |
| 4 | 1 | 83.5 | 100.0 | 35 / 35 | 3131 |
| 5 | 1 | 83.7 | 100.0 | 35 / 35 | 3069 |
| 6 | 1 | 83.5 | 100.0 | 35 / 35 | 2927 |
| 7 | 1 | 83.6 | 100.0 | 35 / 35 | 2956 |
| 8 | 1 | 82.8 | 97.1 | 34 / 35 | 3022 |
| 9 | 1 | 83.5 | 100.0 | 35 / 35 | 3156 |
| 10 | 1 | 83.4 | 100.0 | 35 / 35 | 3047 |
| 11 | 1 | 82.6 | 100.0 | 35 / 35 | 3186 |
| 12 | 1 | 83.3 | 100.0 | 35 / 35 | 3078 |
| 13 | 1 | 83.4 | 100.0 | 35 / 35 | 3048 |
| 14 | 1 | 83.0 | 100.0 | 35 / 35 | 3177 |
| 15 | 1 | 82.5 | 97.1 | 34 / 35 | 2999 |
| 16 | 1 | 82.3 | 97.1 | 34 / 35 | 3074 |
| 17 | 1 | 83.4 | 100.0 | 35 / 35 | 3081 |
| 18 | 1 | 84.1 | 100.0 | 35 / 35 | 2943 |
| 19 | 1 | 83.7 | 100.0 | 35 / 35 | 3017 |
| 20 | 1 | 82.7 | 100.0 | 35 / 35 | 3078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 700 | 99% |

Hadur died in 8 of 700 rounds, at a mean tick of 1475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 5 | 63% | 685 |
3 death(s) with no robot to name.

