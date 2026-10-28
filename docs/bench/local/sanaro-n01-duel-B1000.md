# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroB1000 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 19.6 | 13.9 | 97 / 700 | 1.86 | 19.6% | 20655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 80.4% | 603 |
| hadur117.nano.SanaroB1000 0.1 | 2.0 | 19.6% | 97 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 25.9 | 25.7 | 9 / 35 | 1237 |
| 2 | 2 | 19.7 | 17.1 | 6 / 35 | 911 |
| 3 | 2 | 18.0 | 11.4 | 4 / 35 | 942 |
| 4 | 2 | 22.1 | 17.1 | 6 / 35 | 1153 |
| 5 | 2 | 18.9 | 11.4 | 4 / 35 | 1056 |
| 6 | 2 | 14.9 | 2.9 | 1 / 35 | 987 |
| 7 | 2 | 17.0 | 8.6 | 3 / 35 | 949 |
| 8 | 2 | 21.6 | 17.1 | 6 / 35 | 1101 |
| 9 | 2 | 20.2 | 14.3 | 5 / 35 | 1074 |
| 10 | 2 | 17.7 | 11.4 | 4 / 35 | 962 |
| 11 | 2 | 20.3 | 14.3 | 5 / 35 | 1083 |
| 12 | 2 | 19.6 | 17.1 | 6 / 35 | 913 |
| 13 | 2 | 22.5 | 17.1 | 6 / 35 | 1207 |
| 14 | 2 | 20.9 | 17.1 | 6 / 35 | 1018 |
| 15 | 2 | 23.0 | 20.0 | 7 / 35 | 1150 |
| 16 | 2 | 17.8 | 11.4 | 4 / 35 | 973 |
| 17 | 2 | 13.8 | 2.9 | 1 / 35 | 902 |
| 18 | 2 | 19.5 | 14.3 | 5 / 35 | 1004 |
| 19 | 2 | 23.8 | 20.0 | 7 / 35 | 1200 |
| 20 | 2 | 14.5 | 5.7 | 2 / 35 | 833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 14% |

Hadur died in 605 of 700 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 605 | 100% | 699 |

## Melee bench: D2

hadur117.nano.SanaroB1000 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 96.3 | 97.7 | 684 / 700 | 1.02 | 96.3% | 65826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB1000 0.1 | 1.0 | 96.3% | 684 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 3.7% | 18 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 97.1 | 97.1 | 34 / 35 | 3081 |
| 2 | 1 | 93.7 | 94.3 | 33 / 35 | 3292 |
| 3 | 1 | 96.4 | 97.1 | 34 / 35 | 3209 |
| 4 | 1 | 94.7 | 97.1 | 34 / 35 | 3375 |
| 5 | 1 | 94.8 | 97.1 | 34 / 35 | 3177 |
| 6 | 1 | 98.2 | 100.0 | 35 / 35 | 3386 |
| 7 | 1 | 96.4 | 97.1 | 34 / 35 | 3207 |
| 8 | 1 | 95.0 | 97.1 | 34 / 35 | 3363 |
| 9 | 1 | 97.6 | 100.0 | 35 / 35 | 3390 |
| 10 | 1 | 97.8 | 100.0 | 35 / 35 | 3401 |
| 11 | 1 | 97.7 | 100.0 | 35 / 35 | 3266 |
| 12 | 1 | 96.8 | 97.1 | 34 / 35 | 3292 |
| 13 | 1 | 97.8 | 100.0 | 35 / 35 | 3377 |
| 14 | 1 | 94.8 | 97.1 | 34 / 35 | 3327 |
| 15 | 1 | 94.9 | 97.1 | 34 / 35 | 3403 |
| 16 | 1 | 96.8 | 97.1 | 34 / 35 | 3299 |
| 17 | 1 | 97.5 | 100.0 | 35 / 35 | 3206 |
| 18 | 1 | 92.6 | 91.4 | 32 / 35 | 3212 |
| 19 | 1 | 97.3 | 97.1 | 34 / 35 | 3184 |
| 20 | 1 | 97.7 | 100.0 | 35 / 35 | 3379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 700 | 98% |

Hadur died in 18 of 700 rounds, at a mean tick of 2522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 89% | 684 |
2 death(s) with no robot to name.

