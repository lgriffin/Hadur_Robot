# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS12B 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 10 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 77.4 | 271 / 350 | 1.23 | 59.9% | 9291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS12B 0.1 | 1.0 | 59.9% | 271 |
| d414.nano.Quantum 1.0.0 | 2.0 | 40.1% | 79 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 77.1 | 27 / 35 | 853 |
| 2 | 1 | 62.6 | 77.1 | 27 / 35 | 1005 |
| 3 | 1 | 60.5 | 77.1 | 27 / 35 | 888 |
| 4 | 1 | 57.5 | 74.3 | 26 / 35 | 863 |
| 5 | 1 | 65.5 | 82.9 | 29 / 35 | 1059 |
| 6 | 1 | 67.2 | 85.7 | 30 / 35 | 1047 |
| 7 | 1 | 52.6 | 68.6 | 24 / 35 | 894 |
| 8 | 1 | 56.3 | 77.1 | 27 / 35 | 953 |
| 9 | 1 | 52.7 | 71.4 | 25 / 35 | 846 |
| 10 | 1 | 62.1 | 82.9 | 29 / 35 | 883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 350 | 77% |

Hadur died in 79 of 350 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 100% | 332 |

## Melee bench: D2

hadur117.nano.SanaroS12B 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 13 over 10 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 93.1 | 86.3 | 302 / 350 | 1.14 | 93.1% | 28454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS12B 0.1 | 1.0 | 93.1% | 302 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 6.9% | 51 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 94.9 | 88.6 | 31 / 35 | 2909 |
| 2 | 1 | 95.0 | 88.6 | 31 / 35 | 3005 |
| 3 | 1 | 97.3 | 94.3 | 33 / 35 | 3140 |
| 4 | 1 | 89.5 | 80.0 | 28 / 35 | 2632 |
| 5 | 1 | 94.5 | 88.6 | 31 / 35 | 2685 |
| 6 | 1 | 93.0 | 85.7 | 30 / 35 | 2865 |
| 7 | 1 | 96.3 | 91.4 | 32 / 35 | 3108 |
| 8 | 1 | 88.4 | 80.0 | 28 / 35 | 2732 |
| 9 | 1 | 93.6 | 85.7 | 30 / 35 | 2787 |
| 10 | 1 | 88.7 | 80.0 | 28 / 35 | 2591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 350 | 86% |

Hadur died in 51 of 350 rounds, at a mean tick of 1654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 94% | 297 |
3 death(s) with no robot to name.

