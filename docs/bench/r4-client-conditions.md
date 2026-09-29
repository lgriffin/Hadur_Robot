# BENCH-4: client conditions

R4b of [the rumble climb plan](../rumble-climb-r4-r6-plan.md): reproducing the lost live
rounds behind 3.0's 08:30 UTC rating collapse (85.5 to 77.2 APS, survival 92.6% to 71.2%,
`data/learnings.md` L-01) under conditions closer to a rumble client than the default bench.
Run against `hadur2.Hadur 3.1` (master), weak set, cold, 35 rounds x 1 seed each
(`client-conditions-r4b.txt`).

**Result: not reproduced.** Every condition holds survival at 97 to 100%, the same as the
default bench, against opponents live survival drops to 71 to 77% against after 08:30 UTC.
A shared, never-wiped data directory, the CPU constant forced to 1.0ms and to 0.3ms (up to
112 skipped turns a battle, against 0 to 5 by default), and four background load threads all
leave every battle at 34/35 or 35/35 rounds won. The one lost round (`racso.Crono`, one seed)
recurs in three of the five conditions including the default, so it reads as this bot's own
noise rather than a condition effect (`data/learnings.md` L-19).

**Not tried here:** another Robocode engine release or JVM (BENCH-4 supports `engine=` and
`java=` conditions, but no second engine distribution or JDK is installed in this
environment — see `hadur-bench/engines/README` and the tool's own report, which lists them
as skipped rather than fabricating a result), and a data directory prefilled from an older
Hadur version (`data=prefill:DIR`; building one needs a warm run of the 2.2 jar this
environment does not have handy). Per the plan's decision tree (R4c), this stage ships
RES-7 and RES-8 anyway as 3.2 and reads the live rating with BENCH-5 once it has 300+
pairings, rather than block on conditions this environment cannot exercise.

One bench pass per condition, each isolating one difference from the rumble client's default (a shared or prefilled data directory, CPU constant, background load, engine or JVM). Survival share is Hadur's fraction of rounds survived.

## default

robocode.cpu.constant=4019126.

| Opponent | Survival share | Skipped turns | Rounds won | Battles ok |
|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 100.0% | 0 | 35 / 35 | 1 / 1 |
| abud.ThirdRobo 1.0 | 100.0% | 0 | 35 / 35 | 1 / 1 |
| bons.NanoStalker 1.2 | 100.0% | 3 | 35 / 35 | 1 / 1 |
| dittman.BlindSquirl Retired | 100.0% | 1 | 35 / 35 | 1 / 1 |
| hlavko.nano.Ringo 2.0 | 100.0% | 5 | 35 / 35 | 1 / 1 |
| jep.nano.Hawkwing 0.4.1 | 100.0% | 1 | 35 / 35 | 1 / 1 |
| kawigi.sbf.Barracuda 1.0 | 100.0% | 3 | 35 / 35 | 1 / 1 |
| nexus.Two 0.2 | 100.0% | 1 | 35 / 35 | 1 / 1 |
| pa.Improved 1.1 | 100.0% | 1 | 35 / 35 | 1 / 1 |
| quietus.NarrowRadar 0.1 | 100.0% | 1 | 35 / 35 | 1 / 1 |
| racso.Crono 1.0 | 97.1% | 4 | 34 / 35 | 1 / 1 |
| zzx.Gron 1.14 | 100.0% | 3 | 35 / 35 | 1 / 1 |

## data shared, never wiped

robocode.cpu.constant=3981826.

| Opponent | Survival share | Skipped turns | Rounds won | Battles ok |
|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 100.0% | 2 | 35 / 35 | 1 / 1 |
| abud.ThirdRobo 1.0 | 100.0% | 5 | 35 / 35 | 1 / 1 |
| bons.NanoStalker 1.2 | 100.0% | 2 | 35 / 35 | 1 / 1 |
| dittman.BlindSquirl Retired | 100.0% | 2 | 35 / 35 | 1 / 1 |
| hlavko.nano.Ringo 2.0 | 100.0% | 6 | 35 / 35 | 1 / 1 |
| jep.nano.Hawkwing 0.4.1 | 100.0% | 3 | 35 / 35 | 1 / 1 |
| kawigi.sbf.Barracuda 1.0 | 100.0% | 8 | 35 / 35 | 1 / 1 |
| nexus.Two 0.2 | 100.0% | 4 | 35 / 35 | 1 / 1 |
| pa.Improved 1.1 | 100.0% | 4 | 35 / 35 | 1 / 1 |
| quietus.NarrowRadar 0.1 | 100.0% | 10 | 35 / 35 | 1 / 1 |
| racso.Crono 1.0 | 100.0% | 10 | 35 / 35 | 1 / 1 |
| zzx.Gron 1.14 | 97.1% | 8 | 34 / 35 | 1 / 1 |

## cpu constant forced to 1.0ms

robocode.cpu.constant=1000000.

| Opponent | Survival share | Skipped turns | Rounds won | Battles ok |
|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 100.0% | 23 | 35 / 35 | 1 / 1 |
| abud.ThirdRobo 1.0 | 100.0% | 17 | 35 / 35 | 1 / 1 |
| bons.NanoStalker 1.2 | 100.0% | 25 | 35 / 35 | 1 / 1 |
| dittman.BlindSquirl Retired | 100.0% | 32 | 35 / 35 | 1 / 1 |
| hlavko.nano.Ringo 2.0 | 100.0% | 31 | 35 / 35 | 1 / 1 |
| jep.nano.Hawkwing 0.4.1 | 100.0% | 30 | 35 / 35 | 1 / 1 |
| kawigi.sbf.Barracuda 1.0 | 100.0% | 34 | 35 / 35 | 1 / 1 |
| nexus.Two 0.2 | 100.0% | 31 | 35 / 35 | 1 / 1 |
| pa.Improved 1.1 | 100.0% | 28 | 35 / 35 | 1 / 1 |
| quietus.NarrowRadar 0.1 | 100.0% | 20 | 35 / 35 | 1 / 1 |
| racso.Crono 1.0 | 100.0% | 35 | 35 / 35 | 1 / 1 |
| zzx.Gron 1.14 | 100.0% | 37 | 35 / 35 | 1 / 1 |

## cpu constant forced to 0.3ms

robocode.cpu.constant=300000.

| Opponent | Survival share | Skipped turns | Rounds won | Battles ok |
|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 100.0% | 62 | 35 / 35 | 1 / 1 |
| abud.ThirdRobo 1.0 | 100.0% | 52 | 35 / 35 | 1 / 1 |
| bons.NanoStalker 1.2 | 100.0% | 81 | 35 / 35 | 1 / 1 |
| dittman.BlindSquirl Retired | 100.0% | 71 | 35 / 35 | 1 / 1 |
| hlavko.nano.Ringo 2.0 | 100.0% | 83 | 35 / 35 | 1 / 1 |
| jep.nano.Hawkwing 0.4.1 | 100.0% | 104 | 35 / 35 | 1 / 1 |
| kawigi.sbf.Barracuda 1.0 | 100.0% | 96 | 35 / 35 | 1 / 1 |
| nexus.Two 0.2 | 100.0% | 79 | 35 / 35 | 1 / 1 |
| pa.Improved 1.1 | 100.0% | 74 | 35 / 35 | 1 / 1 |
| quietus.NarrowRadar 0.1 | 100.0% | 63 | 35 / 35 | 1 / 1 |
| racso.Crono 1.0 | 100.0% | 112 | 35 / 35 | 1 / 1 |
| zzx.Gron 1.14 | 100.0% | 67 | 35 / 35 | 1 / 1 |

## background load, 4 threads

robocode.cpu.constant=5267033.

| Opponent | Survival share | Skipped turns | Rounds won | Battles ok |
|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 100.0% | 6 | 35 / 35 | 1 / 1 |
| abud.ThirdRobo 1.0 | 100.0% | 6 | 35 / 35 | 1 / 1 |
| bons.NanoStalker 1.2 | 100.0% | 5 | 35 / 35 | 1 / 1 |
| dittman.BlindSquirl Retired | 100.0% | 8 | 35 / 35 | 1 / 1 |
| hlavko.nano.Ringo 2.0 | 100.0% | 10 | 35 / 35 | 1 / 1 |
| jep.nano.Hawkwing 0.4.1 | 100.0% | 4 | 35 / 35 | 1 / 1 |
| kawigi.sbf.Barracuda 1.0 | 100.0% | 5 | 35 / 35 | 1 / 1 |
| nexus.Two 0.2 | 100.0% | 9 | 35 / 35 | 1 / 1 |
| pa.Improved 1.1 | 100.0% | 4 | 35 / 35 | 1 / 1 |
| quietus.NarrowRadar 0.1 | 100.0% | 11 | 35 / 35 | 1 / 1 |
| racso.Crono 1.0 | 97.1% | 8 | 34 / 35 | 1 / 1 |
| zzx.Gron 1.14 | 100.0% | 4 | 35 / 35 | 1 / 1 |

