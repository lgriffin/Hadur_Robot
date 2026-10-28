# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS06 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 10 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 3.3 | 0.9 | 3 / 350 | 1.99 | 3.3% | 1906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 96.7% | 347 |
| hadur117.nano.SanaroS06 0.1 | 2.0 | 3.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 2.8 | 0.0 | 0 / 35 | 183 |
| 2 | 2 | 3.8 | 2.9 | 1 / 35 | 180 |
| 3 | 2 | 3.0 | 0.0 | 0 / 35 | 190 |
| 4 | 2 | 3.2 | 0.0 | 0 / 35 | 207 |
| 5 | 2 | 3.2 | 0.0 | 0 / 35 | 208 |
| 6 | 2 | 2.8 | 0.0 | 0 / 35 | 182 |
| 7 | 2 | 4.1 | 2.9 | 1 / 35 | 203 |
| 8 | 2 | 3.0 | 0.0 | 0 / 35 | 192 |
| 9 | 2 | 3.9 | 2.9 | 1 / 35 | 185 |
| 10 | 2 | 2.7 | 0.0 | 0 / 35 | 176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 350 | 1% |

Hadur died in 347 of 350 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 347 | 100% | 350 |

## Melee bench: D2

hadur117.nano.SanaroS06 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 27 over 10 battles (2.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 87.3 | 99.7 | 349 / 350 | 1.00 | 87.3% | 26925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS06 0.1 | 1.0 | 87.3% | 349 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 12.7% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 87.2 | 100.0 | 35 / 35 | 2765 |
| 2 | 1 | 87.1 | 100.0 | 35 / 35 | 2694 |
| 3 | 1 | 87.0 | 100.0 | 35 / 35 | 2769 |
| 4 | 1 | 87.2 | 100.0 | 35 / 35 | 2789 |
| 5 | 1 | 87.2 | 100.0 | 35 / 35 | 2758 |
| 6 | 1 | 86.8 | 100.0 | 35 / 35 | 2669 |
| 7 | 1 | 86.9 | 97.1 | 34 / 35 | 2618 |
| 8 | 1 | 88.1 | 100.0 | 35 / 35 | 2648 |
| 9 | 1 | 87.3 | 100.0 | 35 / 35 | 2809 |
| 10 | 1 | 88.1 | 100.0 | 35 / 35 | 2406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 350 | 100% |

Hadur died in 7 of 350 rounds, at a mean tick of 1465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1 | 14% | 338 |
6 death(s) with no robot to name.

