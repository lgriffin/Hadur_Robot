# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS12 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 17 over 10 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 40.9 | 70.0 | 245 / 350 | 1.30 | 40.9% | 1690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 59.1% | 106 |
| hadur117.nano.SanaroS12 0.1 | 2.0 | 40.9% | 245 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 33.4 | 60.0 | 21 / 35 | 160 |
| 2 | 2 | 48.8 | 77.1 | 27 / 35 | 190 |
| 3 | 2 | 42.3 | 71.4 | 25 / 35 | 180 |
| 4 | 2 | 39.7 | 71.4 | 25 / 35 | 173 |
| 5 | 2 | 43.2 | 74.3 | 26 / 35 | 193 |
| 6 | 2 | 40.3 | 71.4 | 25 / 35 | 170 |
| 7 | 2 | 33.1 | 60.0 | 21 / 35 | 178 |
| 8 | 2 | 46.7 | 77.1 | 27 / 35 | 148 |
| 9 | 2 | 38.4 | 65.7 | 23 / 35 | 135 |
| 10 | 2 | 42.8 | 71.4 | 25 / 35 | 163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 350 | 70% |

Hadur died in 111 of 350 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 110 | 99% | 346 |
1 death(s) with no robot to name.

## Melee bench: D2

hadur117.nano.SanaroS12 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 11 over 10 battles (1.1 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 26.1 | 2.0 | 7 / 350 | 1.98 | 26.1% | 7614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.0 | 73.9% | 345 |
| hadur117.nano.SanaroS12 0.1 | 2.0 | 26.1% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 27.3 | 0.0 | 0 / 35 | 890 |
| 2 | 2 | 26.4 | 0.0 | 0 / 35 | 801 |
| 3 | 2 | 24.6 | 0.0 | 0 / 35 | 727 |
| 4 | 2 | 27.7 | 2.9 | 1 / 35 | 838 |
| 5 | 2 | 28.2 | 2.9 | 1 / 35 | 804 |
| 6 | 2 | 23.8 | 2.9 | 1 / 35 | 681 |
| 7 | 2 | 25.5 | 2.9 | 1 / 35 | 683 |
| 8 | 2 | 23.8 | 2.9 | 1 / 35 | 677 |
| 9 | 2 | 26.1 | 0.0 | 0 / 35 | 784 |
| 10 | 2 | 27.2 | 5.7 | 2 / 35 | 729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 350 | 2% |

Hadur died in 345 of 350 rounds, at a mean tick of 2415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 343 | 99% | 300 |
2 death(s) with no robot to name.

