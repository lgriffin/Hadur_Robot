# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroFL 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 9 over 10 battles (0.9 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 4.8 | 3.7 | 13 / 350 | 1.96 | 4.8% | 2191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 95.2% | 337 |
| hadur117.nano.SanaroFL 0.1 | 2.0 | 4.8% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 3.0 | 0.0 | 0 / 35 | 190 |
| 2 | 2 | 6.0 | 5.7 | 2 / 35 | 254 |
| 3 | 2 | 4.5 | 2.9 | 1 / 35 | 221 |
| 4 | 2 | 5.0 | 5.7 | 2 / 35 | 186 |
| 5 | 2 | 5.0 | 2.9 | 1 / 35 | 258 |
| 6 | 2 | 5.8 | 5.7 | 2 / 35 | 243 |
| 7 | 2 | 4.1 | 2.9 | 1 / 35 | 196 |
| 8 | 2 | 5.6 | 5.7 | 2 / 35 | 228 |
| 9 | 2 | 5.3 | 5.7 | 2 / 35 | 197 |
| 10 | 2 | 3.4 | 0.0 | 0 / 35 | 218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 350 | 4% |

Hadur died in 337 of 350 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 337 | 100% | 350 |

## Melee bench: D2

hadur117.nano.SanaroFL 0.1 against 1 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 20 over 10 battles (2.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 82.5 | 96.0 | 336 / 350 | 1.04 | 82.5% | 27505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroFL 0.1 | 1.0 | 82.5% | 336 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 17.5% | 19 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 83.7 | 100.0 | 35 / 35 | 2955 |
| 2 | 1 | 81.9 | 94.3 | 33 / 35 | 2644 |
| 3 | 1 | 81.8 | 94.3 | 33 / 35 | 2771 |
| 4 | 1 | 83.6 | 97.1 | 34 / 35 | 2581 |
| 5 | 1 | 82.9 | 97.1 | 34 / 35 | 2917 |
| 6 | 1 | 80.7 | 91.4 | 32 / 35 | 2399 |
| 7 | 1 | 80.2 | 88.6 | 31 / 35 | 2707 |
| 8 | 1 | 83.5 | 100.0 | 35 / 35 | 2884 |
| 9 | 1 | 82.6 | 97.1 | 34 / 35 | 2833 |
| 10 | 1 | 83.7 | 100.0 | 35 / 35 | 2814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 350 | 96% |

Hadur died in 19 of 350 rounds, at a mean tick of 1869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 74% | 334 |
5 death(s) with no robot to name.

