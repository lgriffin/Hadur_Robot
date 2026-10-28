# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS10 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 10 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 5.2 | 7.7 | 27 / 350 | 1.92 | 5.2% | 1381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 94.8% | 323 |
| hadur117.nano.SanaroS10 0.1 | 2.0 | 5.2% | 27 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 8.0 | 14.3 | 5 / 35 | 151 |
| 2 | 2 | 5.2 | 8.6 | 3 / 35 | 112 |
| 3 | 2 | 3.9 | 2.9 | 1 / 35 | 169 |
| 4 | 2 | 6.9 | 11.4 | 4 / 35 | 154 |
| 5 | 2 | 3.2 | 2.9 | 1 / 35 | 126 |
| 6 | 2 | 4.0 | 5.7 | 2 / 35 | 114 |
| 7 | 2 | 4.0 | 5.7 | 2 / 35 | 115 |
| 8 | 2 | 5.4 | 8.6 | 3 / 35 | 128 |
| 9 | 2 | 5.1 | 5.7 | 2 / 35 | 183 |
| 10 | 2 | 6.6 | 11.4 | 4 / 35 | 129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 350 | 8% |

Hadur died in 323 of 350 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 323 | 100% | 350 |

## Melee bench: D2

hadur117.nano.SanaroS10 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 20 over 10 battles (2.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.3 | 20.9 | 73 / 350 | 1.79 | 52.3% | 17283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS10 0.1 | 1.3 | 52.3% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.7 | 47.7% | 279 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 46.8 | 14.3 | 5 / 35 | 1588 |
| 2 | 1 | 58.8 | 31.4 | 11 / 35 | 1805 |
| 3 | 1 | 56.2 | 25.7 | 9 / 35 | 1888 |
| 4 | 1 | 51.6 | 17.1 | 6 / 35 | 1850 |
| 5 | 1 | 52.1 | 20.0 | 7 / 35 | 1736 |
| 6 | 1 | 56.8 | 31.4 | 11 / 35 | 1593 |
| 7 | 2 | 45.3 | 8.6 | 3 / 35 | 1675 |
| 8 | 1 | 51.7 | 20.0 | 7 / 35 | 1722 |
| 9 | 1 | 56.0 | 25.7 | 9 / 35 | 1802 |
| 10 | 2 | 47.8 | 14.3 | 5 / 35 | 1624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 350 | 21% |

Hadur died in 285 of 350 rounds, at a mean tick of 4660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 283 | 99% | 327 |
2 death(s) with no robot to name.

