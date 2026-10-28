# Bench suite: nanomelee-duel.txt

## Melee bench: D1

hadur117.nano.SanaroS0 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 2.3 | 0.1 | 1 / 700 | 2.00 | 2.3% | 2917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 97.7% | 699 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 2.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 2.5 | 0.0 | 0 / 35 | 163 |
| 2 | 2 | 1.9 | 0.0 | 0 / 35 | 123 |
| 3 | 2 | 2.2 | 0.0 | 0 / 35 | 140 |
| 4 | 2 | 2.7 | 0.0 | 0 / 35 | 176 |
| 5 | 2 | 3.6 | 2.9 | 1 / 35 | 167 |
| 6 | 2 | 2.6 | 0.0 | 0 / 35 | 172 |
| 7 | 2 | 2.9 | 0.0 | 0 / 35 | 190 |
| 8 | 2 | 2.1 | 0.0 | 0 / 35 | 134 |
| 9 | 2 | 1.8 | 0.0 | 0 / 35 | 116 |
| 10 | 2 | 2.5 | 0.0 | 0 / 35 | 163 |
| 11 | 2 | 1.8 | 0.0 | 0 / 35 | 114 |
| 12 | 2 | 2.1 | 0.0 | 0 / 35 | 132 |
| 13 | 2 | 2.0 | 0.0 | 0 / 35 | 127 |
| 14 | 2 | 2.8 | 0.0 | 0 / 35 | 178 |
| 15 | 2 | 2.2 | 0.0 | 0 / 35 | 144 |
| 16 | 2 | 1.9 | 0.0 | 0 / 35 | 121 |
| 17 | 2 | 2.3 | 0.0 | 0 / 35 | 151 |
| 18 | 2 | 2.4 | 0.0 | 0 / 35 | 158 |
| 19 | 2 | 2.1 | 0.0 | 0 / 35 | 132 |
| 20 | 2 | 1.8 | 0.0 | 0 / 35 | 116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 700 | 0% |

Hadur died in 699 of 700 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 699 | 100% | 700 |

## Melee bench: D2

hadur117.nano.SanaroS0 0.1 against 1 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 48.4 | 42.3 | 296 / 700 | 1.58 | 48.4% | 101824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.3 | 51.6% | 406 |
| hadur117.nano.SanaroS0 0.1 | 1.8 | 48.4% | 296 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 50.7 | 51.4 | 18 / 35 | 5154 |
| 2 | 2 | 47.9 | 40.0 | 14 / 35 | 5168 |
| 3 | 1 | 50.1 | 48.6 | 17 / 35 | 5258 |
| 4 | 2 | 45.3 | 31.4 | 11 / 35 | 4795 |
| 5 | 2 | 49.3 | 45.7 | 16 / 35 | 5231 |
| 6 | 1 | 53.1 | 60.0 | 21 / 35 | 4987 |
| 7 | 2 | 48.8 | 45.7 | 16 / 35 | 4970 |
| 8 | 2 | 48.5 | 42.9 | 15 / 35 | 4982 |
| 9 | 1 | 51.5 | 54.3 | 19 / 35 | 5243 |
| 10 | 2 | 46.5 | 34.3 | 12 / 35 | 5078 |
| 11 | 2 | 45.8 | 31.4 | 11 / 35 | 5051 |
| 12 | 2 | 49.9 | 48.6 | 17 / 35 | 5280 |
| 13 | 2 | 45.1 | 28.6 | 10 / 35 | 5061 |
| 14 | 2 | 46.3 | 34.3 | 12 / 35 | 4962 |
| 15 | 1 | 52.2 | 57.1 | 20 / 35 | 5180 |
| 16 | 2 | 47.5 | 40.0 | 14 / 35 | 5017 |
| 17 | 2 | 48.7 | 42.9 | 15 / 35 | 5213 |
| 18 | 2 | 49.1 | 45.7 | 16 / 35 | 5049 |
| 19 | 2 | 43.8 | 25.7 | 9 / 35 | 5012 |
| 20 | 2 | 47.2 | 37.1 | 13 / 35 | 5133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 700 | 42% |

Hadur died in 418 of 700 rounds, at a mean tick of 6618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 416 | 100% | 691 |
2 death(s) with no robot to name.

