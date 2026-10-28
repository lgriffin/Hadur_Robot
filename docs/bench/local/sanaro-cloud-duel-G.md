# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroG 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 17 over 10 battles (1.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 4.4 | 5.7 | 20 / 350 | 1.94 | 4.4% | 1372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 95.6% | 330 |
| hadur117.nano.SanaroG 0.1 | 2.0 | 4.4% | 20 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 5.1 | 5.7 | 2 / 35 | 176 |
| 2 | 2 | 5.3 | 8.6 | 3 / 35 | 121 |
| 3 | 2 | 2.2 | 0.0 | 0 / 35 | 135 |
| 4 | 2 | 6.4 | 11.4 | 4 / 35 | 130 |
| 5 | 2 | 5.4 | 8.6 | 3 / 35 | 131 |
| 6 | 2 | 3.3 | 2.9 | 1 / 35 | 130 |
| 7 | 2 | 4.2 | 5.7 | 2 / 35 | 123 |
| 8 | 2 | 3.0 | 2.9 | 1 / 35 | 120 |
| 9 | 2 | 6.9 | 11.4 | 4 / 35 | 154 |
| 10 | 2 | 2.5 | 0.0 | 0 / 35 | 152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 350 | 6% |

Hadur died in 330 of 350 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 330 | 100% | 350 |

## Melee bench: D2

hadur117.nano.SanaroG 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 31 over 10 battles (3.1 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 78.5 | 67.1 | 235 / 350 | 1.33 | 78.5% | 22056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG 0.1 | 1.0 | 78.5% | 235 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 21.5% | 116 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 76.8 | 62.9 | 22 / 35 | 2353 |
| 2 | 1 | 79.3 | 68.6 | 24 / 35 | 2206 |
| 3 | 1 | 81.0 | 71.4 | 25 / 35 | 2258 |
| 4 | 1 | 79.3 | 68.6 | 24 / 35 | 2386 |
| 5 | 1 | 83.3 | 77.1 | 27 / 35 | 2208 |
| 6 | 1 | 82.0 | 74.3 | 26 / 35 | 2385 |
| 7 | 1 | 73.9 | 60.0 | 21 / 35 | 1947 |
| 8 | 1 | 78.8 | 68.6 | 24 / 35 | 1940 |
| 9 | 1 | 82.1 | 74.3 | 26 / 35 | 2224 |
| 10 | 1 | 68.2 | 45.7 | 16 / 35 | 2149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 350 | 67% |

Hadur died in 122 of 350 rounds, at a mean tick of 4614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 121 | 99% | 328 |
1 death(s) with no robot to name.

