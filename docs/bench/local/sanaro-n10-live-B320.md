# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 78.1 | 150 / 700 | 2.97 | 13.3% | 46539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 436 |
| hadur117.nano.SanaroB320 0.3 | 2.3 | 13.3% | 150 |
| sgp.JollyNinja 3.53 | 3.1 | 12.2% | 64 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.3% | 20 |
| mz.MicroGodMelee 1 | 4.6 | 11.3% | 13 |
| lorneswork.Predator 1.0 | 5.9 | 9.5% | 11 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.8% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 81.0 | 12 / 35 | 2548 |
| 2 | 3 | 57.4 | 73.3 | 7 / 35 | 1773 |
| 3 | 2 | 62.1 | 83.5 | 6 / 35 | 2449 |
| 4 | 2 | 59.6 | 77.5 | 6 / 35 | 2180 |
| 5 | 2 | 62.3 | 85.7 | 8 / 35 | 1951 |
| 6 | 4 | 57.9 | 72.1 | 4 / 35 | 2105 |
| 7 | 2 | 60.5 | 77.5 | 8 / 35 | 2423 |
| 8 | 2 | 60.7 | 78.1 | 11 / 35 | 2313 |
| 9 | 2 | 61.4 | 79.4 | 11 / 35 | 2232 |
| 10 | 2 | 62.1 | 83.5 | 8 / 35 | 2320 |
| 11 | 2 | 61.8 | 78.7 | 9 / 35 | 2832 |
| 12 | 3 | 59.1 | 74.3 | 8 / 35 | 2176 |
| 13 | 3 | 59.5 | 74.6 | 7 / 35 | 2646 |
| 14 | 2 | 59.4 | 76.2 | 3 / 35 | 2208 |
| 15 | 2 | 60.2 | 74.9 | 10 / 35 | 2352 |
| 16 | 3 | 59.0 | 73.7 | 6 / 35 | 2323 |
| 17 | 2 | 61.4 | 81.3 | 5 / 35 | 2416 |
| 18 | 2 | 59.8 | 76.8 | 5 / 35 | 2455 |
| 19 | 2 | 60.9 | 78.1 | 8 / 35 | 2490 |
| 20 | 2 | 62.3 | 82.9 | 8 / 35 | 2347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 320 | 20% |
| sgp.JollyNinja 3.53 | 60 | 63% |
| mz.MicroGodMelee 1 | 34 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 77% |
| lorneswork.Predator 1.0 | 10 | 30% |
| skm.butterfly 1.0 | 3 | 67% |
| adt.Ar2 1.0 | 3 | 67% |

Hadur died in 550 of 700 rounds, at a mean tick of 1103. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 307 | 56% | 374 |
| sgp.JollyNinja 3.53 | 66 | 12% | 98 |
| simonton.nano.WeekendObsession_Melee 1.0 | 55 | 10% | 67 |
| lorneswork.Predator 1.0 | 54 | 10% | 58 |
| mz.MicroGodMelee 1 | 35 | 6% | 63 |
| adt.Ar2 1.0 | 23 | 4% | 25 |
| kawigi.sbf.FloodSonnet 0.9 | 9 | 2% | 11 |
| skm.butterfly 1.0 | 1 | 0% | 2 |

## Melee bench: F02

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 75.1 | 203 / 700 | 3.24 | 13.5% | 45435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.7 | 15.1% | 193 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.8 | 15.0% | 148 |
| hadur117.nano.SanaroB320 0.3 | 2.6 | 13.5% | 203 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.0% | 10 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.1% | 36 |
| Noran.BitchingElk 0.054 | 6.8 | 8.1% | 47 |
| sch.Simone 0.3d | 7.2 | 7.9% | 33 |
| fnc.bandit.Bandit 5.2.0 | 7.4 | 8.0% | 11 |
| stelo.PatternRobot 1.0 | 8.6 | 6.7% | 17 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 84.1 | 19 / 35 | 2497 |
| 2 | 3 | 59.9 | 75.2 | 10 / 35 | 2133 |
| 3 | 3 | 56.9 | 68.6 | 9 / 35 | 2015 |
| 4 | 3 | 62.4 | 81.9 | 14 / 35 | 2153 |
| 5 | 2 | 61.2 | 76.8 | 14 / 35 | 2555 |
| 6 | 2 | 61.3 | 79.7 | 15 / 35 | 2009 |
| 7 | 3 | 55.7 | 65.7 | 4 / 35 | 2073 |
| 8 | 3 | 57.3 | 67.9 | 6 / 35 | 2364 |
| 9 | 2 | 60.0 | 75.9 | 10 / 35 | 2212 |
| 10 | 3 | 58.9 | 72.7 | 13 / 35 | 2146 |
| 11 | 3 | 58.2 | 69.2 | 8 / 35 | 2413 |
| 12 | 3 | 60.1 | 76.2 | 11 / 35 | 2467 |
| 13 | 3 | 58.6 | 73.0 | 7 / 35 | 2017 |
| 14 | 2 | 59.2 | 72.7 | 9 / 35 | 2509 |
| 15 | 3 | 59.0 | 72.4 | 9 / 35 | 2325 |
| 16 | 2 | 61.2 | 81.6 | 10 / 35 | 2264 |
| 17 | 3 | 60.4 | 76.2 | 9 / 35 | 2228 |
| 18 | 3 | 58.3 | 74.6 | 7 / 35 | 1996 |
| 19 | 2 | 60.1 | 78.1 | 8 / 35 | 2291 |
| 20 | 2 | 62.2 | 80.3 | 11 / 35 | 2768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 122 | 50% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 117 | 38% |
| Noran.BitchingElk 0.054 | 39 | 56% |
| com.cohesiva.robocode.ManOwaR 1.0 | 39 | 87% |
| sch.Simone 0.3d | 27 | 26% |
| stelo.PatternRobot 1.0 | 17 | 47% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 94% |
| fullsail.SweetTea 1.1 | 9 | 56% |
| fnc.bandit.Bandit 5.2.0 | 7 | 71% |

Hadur died in 499 of 700 rounds, at a mean tick of 1096. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 141 | 28% | 196 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 125 | 25% | 164 |
| lrem.micro.SpikeSoldier 0.4 | 60 | 12% | 70 |
| sch.Simone 0.3d | 42 | 8% | 53 |
| stelo.PatternRobot 1.0 | 38 | 8% | 48 |
| com.cohesiva.robocode.ManOwaR 1.0 | 32 | 6% | 70 |
| fnc.bandit.Bandit 5.2.0 | 25 | 5% | 30 |
| Noran.BitchingElk 0.054 | 24 | 5% | 52 |
| fullsail.SweetTea 1.1 | 11 | 2% | 17 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 80.5 | 172 / 700 | 2.76 | 14.0% | 55218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.2 | 15.6% | 201 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.7% | 164 |
| hadur117.nano.SanaroB320 0.3 | 3.1 | 14.0% | 172 |
| vuen.Cake 2.51 | 3.6 | 13.3% | 129 |
| urdos.URDOS 1.3 | 5.0 | 10.2% | 23 |
| adt.Ar1 2.1 | 6.6 | 7.9% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.3% | 5 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.8% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.7% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.6 | 76.5 | 8 / 35 | 2371 |
| 2 | 3 | 61.9 | 81.6 | 11 / 35 | 2861 |
| 3 | 4 | 60.9 | 77.5 | 8 / 35 | 3102 |
| 4 | 3 | 61.9 | 82.2 | 5 / 35 | 3279 |
| 5 | 4 | 59.7 | 76.2 | 6 / 35 | 2815 |
| 6 | 2 | 62.1 | 84.1 | 10 / 35 | 2821 |
| 7 | 4 | 60.8 | 81.9 | 8 / 35 | 2538 |
| 8 | 3 | 61.9 | 82.2 | 9 / 35 | 2919 |
| 9 | 3 | 61.5 | 82.5 | 13 / 35 | 2538 |
| 10 | 2 | 62.9 | 85.1 | 10 / 35 | 3121 |
| 11 | 3 | 60.0 | 77.8 | 5 / 35 | 2847 |
| 12 | 3 | 60.5 | 78.7 | 9 / 35 | 2741 |
| 13 | 3 | 60.0 | 76.8 | 8 / 35 | 2816 |
| 14 | 4 | 61.1 | 82.2 | 9 / 35 | 2562 |
| 15 | 3 | 59.9 | 77.8 | 8 / 35 | 2670 |
| 16 | 3 | 60.9 | 82.9 | 6 / 35 | 2572 |
| 17 | 3 | 61.0 | 81.0 | 7 / 35 | 2716 |
| 18 | 3 | 61.8 | 79.4 | 11 / 35 | 3061 |
| 19 | 3 | 59.8 | 79.4 | 11 / 35 | 2079 |
| 20 | 2 | 62.1 | 83.5 | 10 / 35 | 2789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 138 | 47% |
| vuen.Cake 2.51 | 129 | 41% |
| kawigi.nano.Lib 1.0 | 117 | 15% |
| urdos.URDOS 1.3 | 36 | 72% |
| adt.Ar1 2.1 | 5 | 80% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 50% |
| oa.weak.FlyMk1 0.1 | 4 | 75% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 67% |

Hadur died in 528 of 700 rounds, at a mean tick of 1135. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 175 | 33% | 195 |
| radnor.DoctorBob 1.42 | 149 | 28% | 207 |
| vuen.Cake 2.51 | 101 | 19% | 158 |
| urdos.URDOS 1.3 | 45 | 9% | 69 |
| adt.Ar1 2.1 | 21 | 4% | 25 |
| ghent.ArthurPanzergon 1.0.0 | 15 | 3% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 2% | 11 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 5 | 1% | 9 |
| oa.weak.FlyMk1 0.1 | 5 | 1% | 8 |

## Melee bench: F04

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 77.8 | 33 / 700 | 3.00 | 13.1% | 52654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 25.1% | 636 |
| apc.LeeroyJenkins2 1.0 | 2.3 | 14.1% | 22 |
| hadur117.nano.SanaroB320 0.3 | 2.8 | 13.1% | 33 |
| TNT.TNT 0.99.1 | 4.1 | 10.9% | 7 |
| josago.Jorgito 0.16 | 5.1 | 9.2% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.9% | 1 |
| rampancy.Durandal 2.1d | 8.2 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.9 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 84.8 | 1 / 35 | 2701 |
| 2 | 3 | 62.0 | 81.0 | 1 / 35 | 2807 |
| 3 | 2 | 61.5 | 80.6 | 1 / 35 | 2563 |
| 4 | 3 | 61.5 | 77.1 | 0 / 35 | 2961 |
| 5 | 2 | 60.2 | 74.9 | 1 / 35 | 2768 |
| 6 | 2 | 62.6 | 83.8 | 2 / 35 | 2465 |
| 7 | 3 | 60.9 | 77.8 | 1 / 35 | 2513 |
| 8 | 3 | 61.2 | 74.3 | 4 / 35 | 2881 |
| 9 | 3 | 60.1 | 73.3 | 0 / 35 | 2652 |
| 10 | 3 | 62.0 | 82.2 | 2 / 35 | 2411 |
| 11 | 3 | 62.5 | 80.6 | 3 / 35 | 2893 |
| 12 | 3 | 62.0 | 81.9 | 2 / 35 | 2524 |
| 13 | 3 | 60.1 | 73.7 | 2 / 35 | 2632 |
| 14 | 3 | 59.2 | 72.1 | 1 / 35 | 2567 |
| 15 | 3 | 61.6 | 81.0 | 2 / 35 | 2565 |
| 16 | 3 | 61.1 | 76.8 | 3 / 35 | 2547 |
| 17 | 3 | 58.7 | 70.5 | 0 / 35 | 2603 |
| 18 | 3 | 60.5 | 74.9 | 4 / 35 | 2525 |
| 19 | 3 | 60.7 | 78.4 | 2 / 35 | 2337 |
| 20 | 2 | 60.4 | 75.9 | 1 / 35 | 2739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 399 | 3% |
| apc.LeeroyJenkins2 1.0 | 20 | 55% |
| TNT.TNT 0.99.1 | 7 | 57% |
| josago.Jorgito 0.16 | 5 | 80% |
| spin.Bugstard 0.012b | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 668 of 700 rounds, at a mean tick of 1633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 510 | 76% | 521 |
| apc.LeeroyJenkins2 1.0 | 72 | 11% | 83 |
| josago.Jorgito 0.16 | 37 | 6% | 41 |
| TNT.TNT 0.99.1 | 23 | 3% | 27 |
| css.Delitioner 0.11 | 13 | 2% | 14 |
| tj.zombie1n 1.0.1 | 8 | 1% | 8 |
| rampancy.Durandal 2.1d | 3 | 0% | 4 |
| sp.Nanos.Ember 1.1 | 2 | 0% | 2 |

## Melee bench: F06

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 72.0 | 215 / 700 | 3.52 | 12.9% | 41397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.5 | 15.2% | 127 |
| origin.SleepSiphon 1.7b | 1.7 | 14.9% | 205 |
| hadur117.nano.SanaroB320 0.3 | 3.6 | 12.9% | 215 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.7% | 81 |
| mld.Wisdom 1.0 | 4.6 | 11.5% | 27 |
| gg.Wolverine 2.0 | 6.2 | 8.8% | 21 |
| spinnercat.Omen 1.0 | 7.6 | 7.4% | 2 |
| DBall.NUKE 0.1 | 7.7 | 7.0% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.2% | 14 |
| sample.Fire 1.0 | 10.0 | 3.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 71.1 | 11 / 35 | 1851 |
| 2 | 4 | 59.8 | 74.9 | 11 / 35 | 2143 |
| 3 | 3 | 61.2 | 78.1 | 12 / 35 | 2151 |
| 4 | 4 | 59.3 | 71.4 | 15 / 35 | 2203 |
| 5 | 3 | 61.4 | 78.1 | 15 / 35 | 2253 |
| 6 | 5 | 55.7 | 63.2 | 7 / 35 | 2105 |
| 7 | 5 | 57.0 | 69.5 | 6 / 35 | 1981 |
| 8 | 4 | 58.0 | 67.6 | 11 / 35 | 2072 |
| 9 | 3 | 57.8 | 68.9 | 12 / 35 | 1840 |
| 10 | 3 | 59.0 | 72.7 | 12 / 35 | 2075 |
| 11 | 3 | 59.1 | 72.4 | 10 / 35 | 2154 |
| 12 | 3 | 59.1 | 72.7 | 10 / 35 | 2088 |
| 13 | 5 | 57.4 | 68.3 | 7 / 35 | 1920 |
| 14 | 2 | 61.1 | 78.1 | 14 / 35 | 2176 |
| 15 | 4 | 57.4 | 70.5 | 6 / 35 | 2052 |
| 16 | 3 | 58.7 | 69.5 | 12 / 35 | 2081 |
| 17 | 3 | 60.1 | 76.2 | 14 / 35 | 1912 |
| 18 | 4 | 57.4 | 68.3 | 8 / 35 | 2046 |
| 19 | 3 | 58.2 | 69.8 | 11 / 35 | 2068 |
| 20 | 3 | 61.0 | 77.8 | 11 / 35 | 2226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 94 | 59% |
| jekl.StoneGhost 0.7 | 90 | 77% |
| pe.minimelee.SandboxMiniMelee 1.1 | 70 | 63% |
| gg.Wolverine 2.0 | 25 | 72% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 93% |
| mld.Wisdom 1.0 | 14 | 57% |
| DBall.NUKE 0.1 | 8 | 50% |
| spinnercat.Omen 1.0 | 3 | 100% |
| sample.Fire 1.0 | 2 | 0% |

Hadur died in 485 of 700 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 130 | 27% | 192 |
| jekl.StoneGhost 0.7 | 126 | 26% | 176 |
| pe.minimelee.SandboxMiniMelee 1.1 | 86 | 18% | 135 |
| mld.Wisdom 1.0 | 76 | 16% | 92 |
| gg.Wolverine 2.0 | 28 | 6% | 42 |
| spinnercat.Omen 1.0 | 22 | 5% | 23 |
| DBall.NUKE 0.1 | 9 | 2% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 1% | 19 |
| sample.Fire 1.0 | 2 | 0% | 2 |

## Melee bench: F07

hadur117.nano.SanaroB320 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 86.5 | 311 / 700 | 2.08 | 17.0% | 49587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.0 | 22.6% | 218 |
| hadur117.nano.SanaroB320 0.3 | 2.0 | 17.0% | 311 |
| franzor.Lizt 1.3.1 | 3.3 | 14.0% | 119 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 13.6% | 49 |
| lrem.micro.MoggFanatic 0.2 | 5.2 | 10.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.1 | 8.7% | 0 |
| skm.PateranBotlock2 1.0 | 6.8 | 7.7% | 3 |
| drd.Dreadknoght 0.9 | 8.4 | 3.3% | 2 |
| sample.Target 1.0 | 8.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 91.1 | 20 / 35 | 2463 |
| 2 | 2 | 65.0 | 87.1 | 15 / 35 | 2391 |
| 3 | 2 | 63.1 | 80.7 | 13 / 35 | 2293 |
| 4 | 2 | 63.5 | 86.1 | 14 / 35 | 1931 |
| 5 | 2 | 64.5 | 83.2 | 13 / 35 | 2751 |
| 6 | 2 | 64.8 | 87.5 | 18 / 35 | 2184 |
| 7 | 2 | 65.8 | 90.0 | 17 / 35 | 2528 |
| 8 | 2 | 65.4 | 89.6 | 14 / 35 | 2542 |
| 9 | 2 | 64.6 | 88.2 | 15 / 35 | 2237 |
| 10 | 2 | 64.6 | 83.6 | 17 / 35 | 2624 |
| 11 | 2 | 65.4 | 85.0 | 18 / 35 | 2817 |
| 12 | 2 | 65.0 | 85.4 | 13 / 35 | 2748 |
| 13 | 2 | 65.0 | 87.5 | 16 / 35 | 2364 |
| 14 | 2 | 65.4 | 87.1 | 17 / 35 | 2585 |
| 15 | 2 | 64.8 | 85.7 | 15 / 35 | 2558 |
| 16 | 2 | 65.5 | 88.6 | 20 / 35 | 2211 |
| 17 | 2 | 65.5 | 90.0 | 17 / 35 | 2421 |
| 18 | 2 | 65.2 | 85.7 | 14 / 35 | 2745 |
| 19 | 2 | 65.0 | 83.9 | 15 / 35 | 2802 |
| 20 | 2 | 63.4 | 83.6 | 10 / 35 | 2392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 272 | 54% |
| franzor.Lizt 1.3.1 | 132 | 62% |
| oog.melee.CapuletDroid 1.1 | 95 | 76% |
| skm.PateranBotlock2 1.0 | 4 | 100% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| drd.Dreadknoght 0.9 | 2 | 50% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 390 of 700 rounds, at a mean tick of 1713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 248 | 64% | 505 |
| oog.melee.CapuletDroid 1.1 | 61 | 16% | 141 |
| franzor.Lizt 1.3.1 | 56 | 14% | 3 |
| exauge.GateKeeper 1.1.121g | 12 | 3% | 22 |
| skm.PateranBotlock2 1.0 | 6 | 2% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6 | 2% | 9 |
| drd.Dreadknoght 0.9 | 1 | 0% | 5 |

## Melee bench: F08

hadur117.nano.SanaroB320 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 80.1 | 282 / 700 | 2.59 | 15.7% | 41096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.9 | 16.1% | 155 |
| hadur117.nano.SanaroB320 0.3 | 2.1 | 15.7% | 282 |
| shrub.Vapour v159 | 2.1 | 15.9% | 160 |
| com.spp.robocode.MostlyHarmless 010 | 4.4 | 11.4% | 53 |
| m3thos.Eva00 1.1 | 5.2 | 10.0% | 15 |
| jwst.DAD.DarkAndDarker 1.1 | 5.7 | 9.3% | 26 |
| SHAM.WOW 1.4 | 7.7 | 7.4% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.1% | 3 |
| zyx.nano.BacillusComma 1.0 | 8.1 | 7.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.1 | 77.1 | 11 / 35 | 2285 |
| 2 | 1 | 62.0 | 82.9 | 20 / 35 | 1798 |
| 3 | 3 | 57.0 | 71.1 | 12 / 35 | 1760 |
| 4 | 2 | 60.4 | 80.0 | 14 / 35 | 1941 |
| 5 | 2 | 60.4 | 80.4 | 13 / 35 | 2051 |
| 6 | 2 | 60.2 | 78.6 | 15 / 35 | 1927 |
| 7 | 2 | 61.1 | 79.6 | 17 / 35 | 1895 |
| 8 | 1 | 61.5 | 85.7 | 9 / 35 | 2074 |
| 9 | 3 | 61.7 | 79.6 | 15 / 35 | 2198 |
| 10 | 2 | 62.5 | 84.6 | 14 / 35 | 2321 |
| 11 | 3 | 59.9 | 77.1 | 11 / 35 | 2025 |
| 12 | 3 | 59.5 | 75.0 | 12 / 35 | 2245 |
| 13 | 3 | 59.5 | 76.1 | 12 / 35 | 2057 |
| 14 | 2 | 60.1 | 78.9 | 14 / 35 | 1767 |
| 15 | 1 | 64.2 | 88.6 | 20 / 35 | 2198 |
| 16 | 3 | 61.2 | 80.7 | 13 / 35 | 2207 |
| 17 | 3 | 59.1 | 74.3 | 14 / 35 | 1955 |
| 18 | 1 | 62.8 | 85.0 | 14 / 35 | 2307 |
| 19 | 3 | 61.4 | 81.8 | 16 / 35 | 1834 |
| 20 | 1 | 62.9 | 84.6 | 16 / 35 | 2251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 192 | 68% |
| shrub.Vapour v159 | 111 | 35% |
| com.spp.robocode.MostlyHarmless 010 | 59 | 61% |
| jwst.DAD.DarkAndDarker 1.1 | 38 | 71% |
| m3thos.Eva00 1.1 | 36 | 78% |
| SHAM.WOW 1.4 | 11 | 82% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |

Hadur died in 420 of 700 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 154 | 37% | 192 |
| tm.Yuugao 1.0 | 105 | 25% | 242 |
| com.spp.robocode.MostlyHarmless 010 | 53 | 13% | 91 |
| jwst.DAD.DarkAndDarker 1.1 | 33 | 8% | 62 |
| m3thos.Eva00 1.1 | 26 | 6% | 47 |
| zyx.nano.BacillusComma 1.0 | 22 | 5% | 26 |
| qualidafial.MajorDick 1.0.1 | 15 | 4% | 19 |
| SHAM.WOW 1.4 | 11 | 3% | 21 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 67.0 | 118 / 700 | 3.97 | 11.6% | 34539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 18.4% | 384 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 107 |
| hadur117.nano.SanaroB320 0.3 | 3.7 | 11.6% | 118 |
| yagami.Tidus 0.11 | 4.1 | 11.4% | 9 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.9% | 46 |
| mc2.enemy.Original 0.9 | 5.9 | 9.5% | 29 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 6 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.2% | 1 |
| rdm.Dueler 0.4x | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.5 | 72.4 | 8 / 35 | 1621 |
| 2 | 3 | 55.6 | 66.3 | 7 / 35 | 1574 |
| 3 | 5 | 55.3 | 63.8 | 7 / 35 | 1598 |
| 4 | 3 | 56.6 | 67.3 | 5 / 35 | 1897 |
| 5 | 3 | 58.6 | 73.0 | 8 / 35 | 1766 |
| 6 | 3 | 57.2 | 67.9 | 5 / 35 | 1829 |
| 7 | 3 | 56.5 | 67.6 | 5 / 35 | 1843 |
| 8 | 4 | 56.0 | 67.3 | 6 / 35 | 1575 |
| 9 | 4 | 56.2 | 63.2 | 10 / 35 | 1668 |
| 10 | 3 | 57.4 | 69.8 | 6 / 35 | 1837 |
| 11 | 3 | 56.5 | 68.3 | 5 / 35 | 1617 |
| 12 | 4 | 56.6 | 68.3 | 7 / 35 | 1798 |
| 13 | 4 | 54.7 | 64.1 | 3 / 35 | 1641 |
| 14 | 3 | 58.6 | 71.1 | 7 / 35 | 1760 |
| 15 | 4 | 55.2 | 64.1 | 5 / 35 | 1748 |
| 16 | 5 | 55.1 | 64.8 | 5 / 35 | 1498 |
| 17 | 5 | 55.2 | 63.2 | 5 / 35 | 1757 |
| 18 | 5 | 52.1 | 56.2 | 2 / 35 | 1904 |
| 19 | 3 | 55.3 | 64.8 | 3 / 35 | 1824 |
| 20 | 3 | 60.2 | 76.8 | 9 / 35 | 1784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 166 | 28% |
| kc.micro.Figment 1.0 | 57 | 53% |
| mc2.enemy.Original 0.9 | 30 | 67% |
| pedersen.Grishnakh 1.0 | 18 | 44% |
| yagami.Tidus 0.11 | 11 | 91% |
| dft.Calliope 5.6 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 0% |

Hadur died in 582 of 700 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 217 | 37% | 264 |
| kc.micro.Figment 1.0 | 138 | 24% | 171 |
| yagami.Tidus 0.11 | 71 | 12% | 84 |
| pedersen.Grishnakh 1.0 | 57 | 10% | 59 |
| mc2.enemy.Original 0.9 | 43 | 7% | 63 |
| robar.nano.Assertive_Melee 0.2 | 20 | 3% | 20 |
| dft.Calliope 5.6 | 16 | 3% | 18 |
| step.nanoPri 1.0 | 14 | 2% | 15 |
| rdm.Dueler 0.4x | 6 | 1% | 6 |

## Melee bench: F10

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 84.1 | 273 / 700 | 2.43 | 14.8% | 49725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.5 | 15.8% | 182 |
| hadur117.nano.SanaroB320 0.3 | 1.9 | 14.8% | 273 |
| ne.Chimera 1.2 | 3.2 | 13.5% | 68 |
| ejb.Polaris 1.0.1 | 3.7 | 12.7% | 63 |
| vStar.RAFzilla 2.15 | 5.4 | 10.8% | 29 |
| tvv.micro.Antares 1.1.1 | 5.4 | 10.6% | 63 |
| sam.Samspin 1.0 | 7.6 | 6.2% | 5 |
| kurios.DOSexe .9b | 8.4 | 5.7% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.6% | 1 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 78.4 | 13 / 35 | 2480 |
| 2 | 2 | 63.5 | 88.6 | 16 / 35 | 2163 |
| 3 | 3 | 61.6 | 77.8 | 16 / 35 | 2576 |
| 4 | 2 | 59.7 | 76.8 | 8 / 35 | 2466 |
| 5 | 1 | 63.6 | 85.4 | 18 / 35 | 2741 |
| 6 | 2 | 61.0 | 79.7 | 7 / 35 | 2802 |
| 7 | 1 | 62.7 | 85.4 | 12 / 35 | 2406 |
| 8 | 1 | 64.5 | 88.3 | 18 / 35 | 2934 |
| 9 | 2 | 63.4 | 85.1 | 16 / 35 | 2692 |
| 10 | 3 | 60.5 | 77.8 | 8 / 35 | 2262 |
| 11 | 2 | 61.4 | 82.9 | 7 / 35 | 2726 |
| 12 | 2 | 63.4 | 86.7 | 16 / 35 | 2446 |
| 13 | 1 | 63.3 | 84.1 | 16 / 35 | 2670 |
| 14 | 3 | 62.8 | 84.8 | 10 / 35 | 2529 |
| 15 | 2 | 62.0 | 82.2 | 14 / 35 | 2233 |
| 16 | 2 | 63.5 | 88.6 | 16 / 35 | 1988 |
| 17 | 2 | 62.8 | 85.1 | 14 / 35 | 2333 |
| 18 | 2 | 62.8 | 87.0 | 14 / 35 | 2142 |
| 19 | 2 | 63.4 | 86.0 | 16 / 35 | 2587 |
| 20 | 1 | 65.3 | 91.7 | 18 / 35 | 2549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 150 | 42% |
| ejb.Polaris 1.0.1 | 106 | 93% |
| ne.Chimera 1.2 | 68 | 47% |
| tvv.micro.Antares 1.1.1 | 67 | 45% |
| vStar.RAFzilla 2.15 | 48 | 75% |
| donjezza.Muncho 1.0 | 11 | 64% |
| kurios.DOSexe .9b | 10 | 40% |
| sam.Samspin 1.0 | 4 | 50% |

Hadur died in 427 of 700 rounds, at a mean tick of 1058. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 161 | 38% | 224 |
| ne.Chimera 1.2 | 128 | 30% | 166 |
| tvv.micro.Antares 1.1.1 | 49 | 11% | 74 |
| ejb.Polaris 1.0.1 | 31 | 7% | 132 |
| vStar.RAFzilla 2.15 | 26 | 6% | 57 |
| kurios.DOSexe .9b | 10 | 2% | 15 |
| sam.Samspin 1.0 | 10 | 2% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 2% | 7 |
| donjezza.Muncho 1.0 | 5 | 1% | 12 |

## Melee bench: F11

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 70.6 | 199 / 700 | 3.65 | 12.6% | 39314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.3% | 246 |
| cx.mini.Nimrod 0.55 | 2.3 | 13.4% | 93 |
| hadur117.nano.SanaroB320 0.3 | 2.8 | 12.6% | 199 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 44 |
| br2.MobyDickBot 1.6 | 6.0 | 9.4% | 38 |
| rdt199.Warlord 0.73 | 6.0 | 9.4% | 35 |
| uji.YellohFellah 1.0 | 6.3 | 9.0% | 47 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.3% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 70.8 | 8 / 35 | 1832 |
| 2 | 3 | 56.0 | 63.2 | 9 / 35 | 2145 |
| 3 | 4 | 54.5 | 61.6 | 8 / 35 | 1896 |
| 4 | 3 | 59.5 | 73.7 | 13 / 35 | 1858 |
| 5 | 3 | 58.8 | 72.4 | 9 / 35 | 2118 |
| 6 | 3 | 59.0 | 71.4 | 11 / 35 | 2232 |
| 7 | 2 | 58.6 | 73.3 | 12 / 35 | 1852 |
| 8 | 3 | 56.7 | 67.6 | 9 / 35 | 1904 |
| 9 | 3 | 59.0 | 72.4 | 12 / 35 | 1997 |
| 10 | 3 | 56.5 | 69.2 | 7 / 35 | 1789 |
| 11 | 3 | 56.4 | 67.3 | 10 / 35 | 1790 |
| 12 | 3 | 57.1 | 66.7 | 10 / 35 | 1974 |
| 13 | 4 | 53.6 | 60.0 | 4 / 35 | 1829 |
| 14 | 2 | 60.3 | 74.9 | 15 / 35 | 2095 |
| 15 | 2 | 61.9 | 81.3 | 14 / 35 | 2280 |
| 16 | 3 | 58.4 | 72.4 | 8 / 35 | 1990 |
| 17 | 3 | 56.0 | 67.3 | 5 / 35 | 1875 |
| 18 | 2 | 58.3 | 72.1 | 11 / 35 | 2095 |
| 19 | 2 | 61.8 | 80.6 | 16 / 35 | 2033 |
| 20 | 2 | 58.2 | 73.7 | 8 / 35 | 1730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 153 | 59% |
| cx.mini.Nimrod 0.55 | 49 | 63% |
| uji.YellohFellah 1.0 | 42 | 52% |
| br2.MobyDickBot 1.6 | 27 | 63% |
| rdt199.Warlord 0.73 | 22 | 82% |
| djc.DynaBot 0.1.1 | 22 | 86% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 502 of 700 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 195 | 39% | 283 |
| cx.mini.Nimrod 0.55 | 104 | 21% | 128 |
| rdt199.Warlord 0.73 | 50 | 10% | 72 |
| uji.YellohFellah 1.0 | 39 | 8% | 65 |
| br2.MobyDickBot 1.6 | 29 | 6% | 48 |
| KiraNL.Chupacabra 0.4 | 28 | 6% | 29 |
| djc.DynaBot 0.1.1 | 24 | 5% | 42 |
| jeremyreeder.Vincent 2011.12.09 | 17 | 3% | 18 |
| stelo.MirrorNano 1.3 | 15 | 3% | 15 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 74.6 | 203 / 700 | 3.28 | 13.2% | 35417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.4 | 14.9% | 157 |
| nat.PallasHawk 1.0 | 2.4 | 14.0% | 170 |
| darkcanuck.Leon 1.01 | 3.1 | 13.4% | 113 |
| hadur117.nano.SanaroB320 0.3 | 3.2 | 13.2% | 203 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 39 |
| jrm.Test0 1.0 | 6.7 | 8.1% | 3 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.5% | 3 |
| jp.Perpy 16.0 | 7.6 | 7.2% | 2 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.9% | 9 |
| stuff.Vlad 0.1 | 9.6 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 72.7 | 10 / 35 | 1683 |
| 2 | 4 | 57.6 | 69.8 | 8 / 35 | 1838 |
| 3 | 4 | 60.6 | 79.7 | 10 / 35 | 1773 |
| 4 | 4 | 58.7 | 73.7 | 11 / 35 | 1529 |
| 5 | 3 | 60.1 | 77.8 | 9 / 35 | 1822 |
| 6 | 4 | 56.4 | 66.7 | 8 / 35 | 2042 |
| 7 | 2 | 61.7 | 81.9 | 12 / 35 | 1961 |
| 8 | 4 | 55.0 | 64.1 | 7 / 35 | 1787 |
| 9 | 2 | 60.1 | 76.8 | 11 / 35 | 1960 |
| 10 | 2 | 61.6 | 80.3 | 14 / 35 | 1883 |
| 11 | 4 | 57.4 | 70.8 | 10 / 35 | 1456 |
| 12 | 4 | 58.4 | 74.6 | 7 / 35 | 1680 |
| 13 | 3 | 59.1 | 74.3 | 9 / 35 | 1954 |
| 14 | 3 | 59.7 | 76.5 | 13 / 35 | 1573 |
| 15 | 3 | 59.6 | 77.1 | 9 / 35 | 1776 |
| 16 | 3 | 58.4 | 71.7 | 12 / 35 | 1787 |
| 17 | 3 | 59.6 | 73.0 | 14 / 35 | 1845 |
| 18 | 2 | 60.6 | 79.4 | 12 / 35 | 1806 |
| 19 | 3 | 58.7 | 75.2 | 9 / 35 | 1563 |
| 20 | 4 | 59.1 | 76.2 | 8 / 35 | 1699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 138 | 62% |
| nat.PallasHawk 1.0 | 117 | 31% |
| darkcanuck.Leon 1.01 | 101 | 43% |
| brainfade.melee.Genghis 0.36 | 27 | 74% |
| jaybot.bots.Oddball 4.0 | 11 | 55% |
| jp.Perpy 16.0 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 498 of 700 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 130 | 26% | 173 |
| bts.wiki.RipCurl 0.9b | 116 | 23% | 187 |
| darkcanuck.Leon 1.01 | 93 | 19% | 145 |
| jrm.Test0 1.0 | 52 | 10% | 58 |
| brainfade.melee.Genghis 0.36 | 38 | 8% | 51 |
| jp.Perpy 16.0 | 22 | 4% | 24 |
| jaybot.bots.Oddball 4.0 | 21 | 4% | 27 |
| cs.sheldor.Talon 1.1 | 18 | 4% | 23 |
| stuff.Vlad 0.1 | 8 | 2% | 12 |

## Melee bench: F13

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 73.9 | 128 / 700 | 3.35 | 12.5% | 41949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.6% | 295 |
| ags.Glacier 0.2.11 | 1.7 | 17.1% | 181 |
| hadur117.nano.SanaroB320 0.3 | 3.7 | 12.5% | 128 |
| shinh.Entangled 0.3 | 4.1 | 12.4% | 50 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.1% | 41 |
| apc.Colossus2 0.17 | 6.1 | 8.2% | 2 |
| stelo.Wang 1.0 | 7.0 | 7.0% | 3 |
| ayk.WallHugger 1.0 | 8.1 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 78.7 | 4 / 35 | 2334 |
| 2 | 3 | 59.2 | 74.3 | 7 / 35 | 2069 |
| 3 | 3 | 60.8 | 78.7 | 7 / 35 | 2178 |
| 4 | 4 | 59.2 | 73.0 | 6 / 35 | 2286 |
| 5 | 4 | 56.5 | 67.0 | 7 / 35 | 2008 |
| 6 | 5 | 58.8 | 71.4 | 8 / 35 | 2143 |
| 7 | 3 | 60.5 | 77.1 | 7 / 35 | 2239 |
| 8 | 5 | 57.0 | 68.9 | 4 / 35 | 1963 |
| 9 | 3 | 59.9 | 77.5 | 7 / 35 | 2044 |
| 10 | 3 | 59.3 | 72.4 | 4 / 35 | 2512 |
| 11 | 5 | 54.7 | 61.9 | 6 / 35 | 1884 |
| 12 | 4 | 59.1 | 73.7 | 7 / 35 | 2017 |
| 13 | 3 | 59.5 | 77.5 | 7 / 35 | 1874 |
| 14 | 3 | 61.0 | 77.5 | 9 / 35 | 2370 |
| 15 | 5 | 57.5 | 68.6 | 4 / 35 | 2090 |
| 16 | 4 | 60.0 | 77.8 | 8 / 35 | 1707 |
| 17 | 5 | 57.9 | 74.0 | 2 / 35 | 1870 |
| 18 | 3 | 60.6 | 78.4 | 9 / 35 | 2177 |
| 19 | 3 | 60.1 | 74.6 | 9 / 35 | 2195 |
| 20 | 3 | 59.8 | 75.6 | 6 / 35 | 1989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 165 | 42% |
| ags.Glacier 0.2.11 | 106 | 21% |
| shinh.Entangled 0.3 | 43 | 58% |
| gh.micro.Gruweltje 0.7 | 19 | 42% |
| stelo.Wang 1.0 | 5 | 80% |

Hadur died in 572 of 700 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 181 | 32% | 204 |
| mn.Combat 3.25.0 | 173 | 30% | 242 |
| gh.micro.Gruweltje 0.7 | 82 | 14% | 89 |
| shinh.Entangled 0.3 | 68 | 12% | 94 |
| stelo.Wang 1.0 | 26 | 5% | 30 |
| maribo.FollowFire 1 | 16 | 3% | 15 |
| apc.Colossus2 0.17 | 15 | 3% | 15 |
| ayk.WallHugger 1.0 | 8 | 1% | 8 |
| sample.Tracker 1.0 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.nano.SanaroB320 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 85.0 | 303 / 700 | 2.20 | 15.9% | 36735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 20.3% | 270 |
| hadur117.nano.SanaroB320 0.3 | 2.0 | 15.9% | 303 |
| Lo_Ian.Gandalf_V4 4.0 | 4.0 | 12.1% | 32 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.1 | 12.1% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 4.9 | 11.0% | 29 |
| co.edu.usb.rc.LidisTron 1.0 | 5.4 | 10.7% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 9.4% | 32 |
| pa.Improved 1.0 | 8.0 | 6.0% | 6 |
| sample.TrackFire 1.0 | 9.0 | 2.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 88.9 | 17 / 35 | 2152 |
| 2 | 2 | 63.5 | 84.3 | 16 / 35 | 2598 |
| 3 | 2 | 63.5 | 88.2 | 16 / 35 | 1715 |
| 4 | 2 | 63.2 | 86.1 | 16 / 35 | 1948 |
| 5 | 2 | 62.2 | 83.2 | 19 / 35 | 1846 |
| 6 | 2 | 62.3 | 87.1 | 16 / 35 | 1711 |
| 7 | 2 | 61.9 | 86.1 | 14 / 35 | 1428 |
| 8 | 2 | 61.9 | 85.0 | 16 / 35 | 1696 |
| 9 | 2 | 61.5 | 83.9 | 13 / 35 | 1621 |
| 10 | 2 | 62.7 | 88.6 | 16 / 35 | 1386 |
| 11 | 2 | 61.3 | 83.2 | 11 / 35 | 2165 |
| 12 | 2 | 62.2 | 83.6 | 16 / 35 | 2304 |
| 13 | 2 | 61.2 | 85.7 | 12 / 35 | 1463 |
| 14 | 2 | 60.6 | 81.4 | 12 / 35 | 1780 |
| 15 | 2 | 61.7 | 81.8 | 12 / 35 | 2300 |
| 16 | 2 | 63.2 | 87.5 | 20 / 35 | 1621 |
| 17 | 2 | 62.6 | 83.9 | 16 / 35 | 1888 |
| 18 | 2 | 62.6 | 86.4 | 16 / 35 | 1992 |
| 19 | 2 | 60.4 | 81.4 | 14 / 35 | 1524 |
| 20 | 2 | 61.7 | 83.9 | 15 / 35 | 1597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 341 | 55% |
| sheldor.micro.PointInLineRRAL 1.0 | 60 | 75% |
| Lo_Ian.Gandalf_V4 4.0 | 36 | 64% |
| sanyi.mikrobi.Roberto 1.0 | 35 | 51% |
| co.edu.usb.rc.LidisTron 1.0 | 24 | 46% |
| dmh.robocode.robot.RedDwarf 0.4 | 18 | 94% |
| pa.Improved 1.0 | 6 | 17% |
| sample.TrackFire 1.0 | 1 | 0% |

Hadur died in 398 of 700 rounds, at a mean tick of 1245. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 230 | 58% | 402 |
| co.edu.usb.rc.LidisTron 1.0 | 37 | 9% | 34 |
| dmh.robocode.robot.RedDwarf 0.4 | 35 | 9% | 53 |
| sanyi.mikrobi.Roberto 1.0 | 32 | 8% | 69 |
| Lo_Ian.Gandalf_V4 4.0 | 30 | 8% | 55 |
| sheldor.micro.PointInLineRRAL 1.0 | 28 | 7% | 77 |
| pa.Improved 1.0 | 5 | 1% | 6 |
| sample.TrackFire 1.0 | 1 | 0% | 2 |

## Melee bench: F15

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 73.1 | 187 / 700 | 3.42 | 13.2% | 48052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.4 | 15.3% | 147 |
| emp.Yngwie 1.11 | 2.4 | 13.8% | 182 |
| mld.DustBunny 3.8 | 3.3 | 13.0% | 75 |
| hadur117.nano.SanaroB320 0.3 | 3.3 | 13.2% | 187 |
| cb.nano.Insomnia 1.0 | 5.1 | 11.1% | 31 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.5% | 68 |
| lambdaxy.TBot 0.1 | 7.4 | 6.9% | 1 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.7% | 3 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 68.6 | 6 / 35 | 2775 |
| 2 | 1 | 62.8 | 81.6 | 15 / 35 | 2524 |
| 3 | 4 | 58.3 | 69.5 | 9 / 35 | 2230 |
| 4 | 2 | 60.5 | 74.6 | 11 / 35 | 2544 |
| 5 | 4 | 58.4 | 70.5 | 8 / 35 | 2394 |
| 6 | 4 | 58.7 | 69.8 | 8 / 35 | 2437 |
| 7 | 4 | 59.7 | 73.7 | 11 / 35 | 2173 |
| 8 | 4 | 56.7 | 65.4 | 8 / 35 | 2464 |
| 9 | 2 | 60.6 | 76.5 | 9 / 35 | 2528 |
| 10 | 4 | 59.1 | 72.4 | 10 / 35 | 2200 |
| 11 | 4 | 59.8 | 75.2 | 7 / 35 | 2366 |
| 12 | 4 | 59.5 | 72.4 | 9 / 35 | 2390 |
| 13 | 4 | 56.3 | 65.1 | 8 / 35 | 2195 |
| 14 | 2 | 62.5 | 78.7 | 17 / 35 | 2589 |
| 15 | 4 | 59.6 | 74.6 | 5 / 35 | 2513 |
| 16 | 3 | 59.1 | 73.0 | 9 / 35 | 2312 |
| 17 | 2 | 59.2 | 70.8 | 10 / 35 | 2549 |
| 18 | 4 | 59.3 | 74.9 | 6 / 35 | 2067 |
| 19 | 2 | 62.4 | 80.0 | 12 / 35 | 2675 |
| 20 | 3 | 59.3 | 74.3 | 9 / 35 | 2127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 123 | 68% |
| kawigi.micro.Shiz 1.1 | 74 | 42% |
| mld.DustBunny 3.8 | 41 | 17% |
| kawigi.robot.Girl 1.2 | 40 | 73% |
| cb.nano.Insomnia 1.0 | 39 | 77% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| lambdaxy.TBot 0.1 | 2 | 50% |

Hadur died in 513 of 700 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 118 | 23% | 152 |
| mld.DustBunny 3.8 | 112 | 22% | 133 |
| emp.Yngwie 1.11 | 110 | 21% | 211 |
| cb.nano.Insomnia 1.0 | 65 | 13% | 60 |
| kawigi.robot.Girl 1.2 | 54 | 11% | 79 |
| lambdaxy.TBot 0.1 | 19 | 4% | 20 |
| Grystrion.TrackerWO 1.0 | 18 | 4% | 19 |
| divineomega.TrialBot 0.003 | 15 | 3% | 24 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 0% | 2 |

## Melee bench: F16

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 71.9 | 148 / 700 | 3.53 | 12.8% | 45439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.4% | 309 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.1% | 46 |
| hadur117.nano.SanaroB320 0.3 | 3.1 | 12.8% | 148 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.3% | 130 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.7% | 6 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.4% | 32 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.9% | 9 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.3% | 16 |
| repositorio.NanoStep 1.0 | 8.8 | 5.2% | 2 |
| asd.Cthulhu 1.3 | 9.6 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 71.7 | 8 / 35 | 2080 |
| 2 | 3 | 58.9 | 72.1 | 8 / 35 | 2324 |
| 3 | 3 | 59.5 | 69.5 | 8 / 35 | 2659 |
| 4 | 3 | 57.8 | 69.5 | 7 / 35 | 2115 |
| 5 | 4 | 56.4 | 64.1 | 6 / 35 | 2118 |
| 6 | 3 | 60.2 | 75.6 | 6 / 35 | 2260 |
| 7 | 3 | 57.8 | 68.3 | 7 / 35 | 2170 |
| 8 | 3 | 60.2 | 75.2 | 5 / 35 | 2422 |
| 9 | 3 | 61.5 | 76.5 | 13 / 35 | 2412 |
| 10 | 3 | 58.5 | 67.6 | 7 / 35 | 2346 |
| 11 | 3 | 61.2 | 79.4 | 8 / 35 | 2295 |
| 12 | 3 | 57.1 | 67.3 | 6 / 35 | 2101 |
| 13 | 4 | 58.4 | 68.6 | 7 / 35 | 2352 |
| 14 | 3 | 59.7 | 72.7 | 10 / 35 | 2380 |
| 15 | 3 | 58.8 | 71.4 | 6 / 35 | 2425 |
| 16 | 3 | 58.5 | 70.2 | 6 / 35 | 2094 |
| 17 | 3 | 60.8 | 78.1 | 5 / 35 | 2436 |
| 18 | 3 | 56.1 | 65.7 | 5 / 35 | 2035 |
| 19 | 3 | 59.6 | 74.9 | 9 / 35 | 1916 |
| 20 | 3 | 61.9 | 80.0 | 11 / 35 | 2499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 205 | 24% |
| techdude.forest.FlamingForest 1.1 | 67 | 55% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 37 | 78% |
| tvv.nano.Polaris 1.2 | 22 | 50% |
| bvh.fnr.Fenrir 0.36l | 11 | 91% |
| divineomega.DivineBot 1.9.4.5 | 8 | 88% |
| stelo.IntrinsicVolatility 1.4 | 6 | 83% |
| repositorio.NanoStep 1.0 | 2 | 0% |
| asd.Cthulhu 1.3 | 1 | 0% |

Hadur died in 552 of 700 rounds, at a mean tick of 1602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 273 | 49% | 331 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 89 | 16% | 110 |
| bvh.fnr.Fenrir 0.36l | 57 | 10% | 62 |
| techdude.forest.FlamingForest 1.1 | 52 | 9% | 88 |
| tvv.nano.Polaris 1.2 | 30 | 5% | 43 |
| divineomega.DivineBot 1.9.4.5 | 19 | 3% | 23 |
| stelo.IntrinsicVolatility 1.4 | 16 | 3% | 26 |
| asd.Cthulhu 1.3 | 11 | 2% | 11 |
| repositorio.NanoStep 1.0 | 5 | 1% | 6 |

## Melee bench: F17

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 72.4 | 212 / 700 | 3.48 | 13.0% | 43682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.7 | 14.5% | 145 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.9% | 123 |
| hadur117.nano.SanaroB320 0.3 | 3.5 | 13.0% | 212 |
| cx.BlestPain 1.41 | 3.6 | 12.8% | 110 |
| nic.Nicator 2.4 | 4.7 | 11.8% | 45 |
| ahf.NanoAndrew .4 | 5.6 | 10.9% | 54 |
| maribo.melee.BMV 0.1 | 6.9 | 9.0% | 6 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.7% | 4 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 70.8 | 12 / 35 | 2065 |
| 2 | 3 | 59.8 | 74.3 | 10 / 35 | 2240 |
| 3 | 3 | 61.9 | 77.1 | 17 / 35 | 2305 |
| 4 | 2 | 61.1 | 76.8 | 15 / 35 | 2132 |
| 5 | 5 | 57.9 | 68.3 | 8 / 35 | 2184 |
| 6 | 2 | 61.0 | 77.5 | 15 / 35 | 1990 |
| 7 | 4 | 57.4 | 65.4 | 12 / 35 | 2237 |
| 8 | 5 | 56.6 | 66.7 | 7 / 35 | 2095 |
| 9 | 4 | 58.6 | 69.5 | 8 / 35 | 2404 |
| 10 | 4 | 58.2 | 70.8 | 7 / 35 | 2125 |
| 11 | 4 | 59.4 | 71.7 | 9 / 35 | 2461 |
| 12 | 4 | 58.4 | 67.9 | 9 / 35 | 2434 |
| 13 | 4 | 58.5 | 72.4 | 9 / 35 | 1942 |
| 14 | 4 | 58.9 | 73.3 | 8 / 35 | 2096 |
| 15 | 5 | 57.7 | 70.8 | 10 / 35 | 1678 |
| 16 | 3 | 59.0 | 70.5 | 10 / 35 | 2394 |
| 17 | 3 | 61.8 | 77.8 | 14 / 35 | 2370 |
| 18 | 1 | 60.5 | 76.8 | 12 / 35 | 2288 |
| 19 | 5 | 57.1 | 69.5 | 6 / 35 | 1887 |
| 20 | 1 | 62.2 | 80.6 | 14 / 35 | 2355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 114 | 35% |
| oog.melee.Mercutio 1.0 | 91 | 68% |
| cx.BlestPain 1.41 | 68 | 97% |
| nic.Nicator 2.4 | 42 | 67% |
| ahf.NanoAndrew .4 | 15 | 60% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 488 of 700 rounds, at a mean tick of 1066. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 127 | 26% | 168 |
| oog.melee.Mercutio 1.0 | 89 | 18% | 152 |
| ahf.NanoAndrew .4 | 89 | 18% | 97 |
| nic.Nicator 2.4 | 67 | 14% | 95 |
| cx.BlestPain 1.41 | 65 | 13% | 133 |
| maribo.melee.BMV 0.1 | 26 | 5% | 27 |
| tex.Longbot 0.4 | 19 | 4% | 19 |
| goblin.Bender 2.4 | 4 | 1% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 0% | 5 |

## Melee bench: F18

hadur117.nano.SanaroB320 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 74.6 | 270 / 700 | 3.04 | 14.8% | 38037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 1.7 | 15.2% | 166 |
| hadur117.nano.SanaroB320 0.3 | 1.9 | 14.8% | 270 |
| uji.DBH 1.1 | 3.2 | 13.3% | 87 |
| ratosh.Nobo 0.21 | 4.1 | 12.4% | 23 |
| spinnercat.Robovirus 2.718 | 4.6 | 12.0% | 37 |
| sigterm.Sigterm 1.0 | 6.0 | 10.3% | 59 |
| kawigi.mini.Fhqwhgads 1.1 | 6.8 | 9.1% | 18 |
| stelo.WangRobot 1.0 | 8.3 | 6.8% | 37 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.6 | 6.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 70.4 | 13 / 35 | 1633 |
| 2 | 2 | 56.5 | 67.9 | 12 / 35 | 1724 |
| 3 | 1 | 62.7 | 82.1 | 17 / 35 | 2374 |
| 4 | 1 | 58.8 | 76.8 | 11 / 35 | 1844 |
| 5 | 2 | 59.8 | 76.8 | 14 / 35 | 1965 |
| 6 | 2 | 58.1 | 70.7 | 13 / 35 | 2007 |
| 7 | 1 | 59.6 | 77.5 | 12 / 35 | 1983 |
| 8 | 2 | 57.9 | 73.6 | 10 / 35 | 1984 |
| 9 | 2 | 60.1 | 77.1 | 16 / 35 | 1803 |
| 10 | 1 | 61.7 | 78.9 | 17 / 35 | 2263 |
| 11 | 3 | 55.6 | 67.5 | 9 / 35 | 1765 |
| 12 | 2 | 58.6 | 73.6 | 14 / 35 | 1756 |
| 13 | 1 | 60.5 | 77.9 | 12 / 35 | 2246 |
| 14 | 1 | 62.2 | 85.0 | 20 / 35 | 1654 |
| 15 | 1 | 60.2 | 77.9 | 15 / 35 | 2006 |
| 16 | 4 | 55.2 | 64.6 | 9 / 35 | 1948 |
| 17 | 3 | 57.7 | 71.1 | 11 / 35 | 1619 |
| 18 | 2 | 57.3 | 71.8 | 12 / 35 | 1651 |
| 19 | 2 | 60.7 | 77.1 | 17 / 35 | 1807 |
| 20 | 2 | 59.2 | 72.9 | 16 / 35 | 2005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 145 | 68% |
| uji.DBH 1.1 | 72 | 57% |
| spinnercat.Robovirus 2.718 | 55 | 85% |
| sigterm.Sigterm 1.0 | 49 | 76% |
| ratosh.Nobo 0.21 | 25 | 76% |
| stelo.WangRobot 1.0 | 24 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 18 | 78% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 430 of 700 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 116 | 27% | 220 |
| ratosh.Nobo 0.21 | 74 | 17% | 101 |
| uji.DBH 1.1 | 73 | 17% | 105 |
| spinnercat.Robovirus 2.718 | 51 | 12% | 78 |
| sigterm.Sigterm 1.0 | 43 | 10% | 78 |
| stelo.WangRobot 1.0 | 37 | 9% | 57 |
| kawigi.mini.Fhqwhgads 1.1 | 20 | 5% | 43 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 16 | 4% | 18 |

## Melee bench: F19

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 83.9 | 290 / 700 | 2.45 | 15.4% | 52338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.6 | 16.4% | 147 |
| mld.Infinity 2.2 | 1.9 | 16.1% | 199 |
| hadur117.nano.SanaroB320 0.3 | 2.5 | 15.4% | 290 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.5% | 23 |
| erdnis.Rover 0.3 | 4.9 | 10.5% | 12 |
| patson.PatsonTestBot 1.0 | 6.0 | 9.0% | 10 |
| mbh.Mbh 0.1 | 7.5 | 7.0% | 0 |
| pac.ABC 2.1 | 7.7 | 7.1% | 17 |
| pbg.R2D2 1.0 | 8.7 | 6.0% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 88.3 | 13 / 35 | 2725 |
| 2 | 3 | 63.2 | 81.9 | 11 / 35 | 2175 |
| 3 | 3 | 64.6 | 83.8 | 13 / 35 | 2849 |
| 4 | 3 | 64.8 | 82.2 | 16 / 35 | 2907 |
| 5 | 3 | 64.6 | 83.2 | 18 / 35 | 2521 |
| 6 | 1 | 65.6 | 88.6 | 18 / 35 | 2508 |
| 7 | 3 | 60.8 | 75.2 | 9 / 35 | 2188 |
| 8 | 3 | 65.5 | 86.0 | 16 / 35 | 2600 |
| 9 | 3 | 65.3 | 86.7 | 16 / 35 | 2481 |
| 10 | 1 | 64.8 | 84.1 | 19 / 35 | 2531 |
| 11 | 3 | 64.3 | 86.0 | 13 / 35 | 2409 |
| 12 | 2 | 65.0 | 85.4 | 17 / 35 | 2655 |
| 13 | 3 | 63.5 | 81.0 | 14 / 35 | 2474 |
| 14 | 2 | 64.8 | 83.8 | 13 / 35 | 3035 |
| 15 | 1 | 65.8 | 82.5 | 19 / 35 | 3226 |
| 16 | 3 | 63.7 | 82.2 | 14 / 35 | 2458 |
| 17 | 3 | 63.4 | 83.5 | 12 / 35 | 2389 |
| 18 | 3 | 65.2 | 85.4 | 16 / 35 | 2761 |
| 19 | 2 | 64.1 | 84.4 | 12 / 35 | 2825 |
| 20 | 3 | 63.7 | 82.9 | 11 / 35 | 2621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 233 | 62% |
| davidalves.net.DuelistMiniMelee 1.2 | 149 | 56% |
| krillr.mini.JointStrike 2.0.0 | 34 | 82% |
| erdnis.Rover 0.3 | 19 | 68% |
| pac.ABC 2.1 | 11 | 64% |
| patson.PatsonTestBot 1.0 | 10 | 90% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 412 of 700 rounds, at a mean tick of 1183. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 154 | 37% | 346 |
| mld.Infinity 2.2 | 129 | 31% | 84 |
| krillr.mini.JointStrike 2.0.0 | 51 | 12% | 91 |
| erdnis.Rover 0.3 | 32 | 8% | 61 |
| patson.PatsonTestBot 1.0 | 22 | 5% | 51 |
| pac.ABC 2.1 | 14 | 3% | 32 |
| pbg.R2D2 1.0 | 5 | 1% | 17 |
| mbh.Mbh 0.1 | 5 | 1% | 11 |

## Melee bench: F20

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 77.6 | 247 / 700 | 3.02 | 13.9% | 43219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.5% | 246 |
| hadur117.nano.SanaroB320 0.3 | 2.2 | 13.9% | 247 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.9% | 30 |
| fwb.Nine 1.0.1 | 3.6 | 11.8% | 82 |
| catcat20.Rabbit 0.001 | 4.9 | 10.4% | 48 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.4% | 15 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 8.4% | 7 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.9% | 20 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.5% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 76.2 | 14 / 35 | 2050 |
| 2 | 2 | 61.8 | 81.0 | 12 / 35 | 2342 |
| 3 | 2 | 60.9 | 77.5 | 14 / 35 | 2096 |
| 4 | 2 | 62.9 | 84.8 | 15 / 35 | 2067 |
| 5 | 3 | 59.9 | 73.7 | 13 / 35 | 2043 |
| 6 | 2 | 63.1 | 84.4 | 16 / 35 | 2328 |
| 7 | 2 | 61.2 | 78.1 | 13 / 35 | 2140 |
| 8 | 2 | 59.2 | 72.1 | 12 / 35 | 2234 |
| 9 | 2 | 59.4 | 74.0 | 12 / 35 | 2241 |
| 10 | 2 | 61.4 | 79.7 | 14 / 35 | 2110 |
| 11 | 2 | 63.5 | 86.3 | 18 / 35 | 1958 |
| 12 | 3 | 58.4 | 73.0 | 8 / 35 | 1957 |
| 13 | 2 | 60.2 | 77.1 | 7 / 35 | 2530 |
| 14 | 2 | 61.2 | 80.0 | 10 / 35 | 2449 |
| 15 | 2 | 61.2 | 79.4 | 15 / 35 | 1824 |
| 16 | 2 | 59.9 | 76.2 | 11 / 35 | 2029 |
| 17 | 2 | 59.6 | 74.9 | 10 / 35 | 2039 |
| 18 | 3 | 57.4 | 69.8 | 6 / 35 | 2045 |
| 19 | 2 | 60.1 | 74.9 | 12 / 35 | 2380 |
| 20 | 2 | 61.6 | 78.1 | 15 / 35 | 2357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 203 | 46% |
| fwb.Nine 1.0.1 | 80 | 74% |
| catcat20.Rabbit 0.001 | 53 | 75% |
| nz.jdc.nano.GridFu 1.0 | 27 | 70% |
| djdjdj.NanoSkunk10 1.0 | 14 | 86% |
| bayen.nut.Squirrel 1.615 | 13 | 100% |
| m3thos.mini.Eva01 0.5.5 | 10 | 70% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 60% |
| ntc.ControlledChaos 1.1.4 | 2 | 0% |

Hadur died in 454 of 700 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 209 | 46% | 276 |
| fwb.Nine 1.0.1 | 75 | 17% | 92 |
| nz.jdc.nano.GridFu 1.0 | 60 | 13% | 107 |
| catcat20.Rabbit 0.001 | 34 | 7% | 89 |
| bayen.nut.Squirrel 1.615 | 24 | 5% | 43 |
| djdjdj.NanoSkunk10 1.0 | 20 | 4% | 38 |
| m3thos.mini.Eva01 0.5.5 | 16 | 4% | 31 |
| ntc.ControlledChaos 1.1.4 | 9 | 2% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 1% | 12 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 20 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 86.2 | 361 / 700 | 2.24 | 16.2% | 57928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.1 | 17.7% | 262 |
| hadur117.nano.SanaroB320 0.3 | 2.0 | 16.2% | 361 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.7% | 31 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 21 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.6% | 0 |
| eld.Hmm 1.0 | 5.6 | 8.3% | 22 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 4 |
| fire219.CatBot 1.0 | 7.8 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 84.8 | 17 / 35 | 2389 |
| 2 | 2 | 65.6 | 87.0 | 19 / 35 | 3017 |
| 3 | 2 | 64.8 | 85.4 | 15 / 35 | 2880 |
| 4 | 2 | 64.6 | 82.9 | 14 / 35 | 3297 |
| 5 | 2 | 66.0 | 86.7 | 17 / 35 | 3285 |
| 6 | 2 | 65.7 | 91.1 | 20 / 35 | 2576 |
| 7 | 1 | 66.3 | 84.8 | 19 / 35 | 3727 |
| 8 | 2 | 65.0 | 85.4 | 19 / 35 | 2944 |
| 9 | 2 | 66.0 | 90.5 | 22 / 35 | 2338 |
| 10 | 1 | 66.3 | 88.6 | 20 / 35 | 3177 |
| 11 | 2 | 67.3 | 94.3 | 21 / 35 | 2657 |
| 12 | 2 | 66.9 | 90.8 | 21 / 35 | 3135 |
| 13 | 2 | 66.0 | 90.5 | 20 / 35 | 2915 |
| 14 | 3 | 63.0 | 81.0 | 15 / 35 | 2592 |
| 15 | 3 | 64.1 | 82.5 | 16 / 35 | 2680 |
| 16 | 2 | 64.9 | 83.2 | 20 / 35 | 3096 |
| 17 | 2 | 63.8 | 81.6 | 16 / 35 | 2715 |
| 18 | 2 | 65.3 | 83.5 | 20 / 35 | 2950 |
| 19 | 2 | 64.4 | 84.8 | 17 / 35 | 2526 |
| 20 | 2 | 64.5 | 85.7 | 13 / 35 | 3032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 353 | 60% |
| dummy.mini.Scimitar 1.01 | 81 | 90% |
| eld.Hmm 1.0 | 46 | 83% |
| cf.RiO.RiOx 4.2.1 | 36 | 78% |
| oa.weak.BotherBot 0.1 | 9 | 100% |
| el.JumpShoot 0.2 | 2 | 0% |

Hadur died in 340 of 700 rounds, at a mean tick of 1542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 178 | 52% | 336 |
| dummy.mini.Scimitar 1.01 | 68 | 20% | 169 |
| cf.RiO.RiOx 4.2.1 | 44 | 13% | 81 |
| fire219.CatBot 1.0 | 12 | 4% | 11 |
| eld.Hmm 1.0 | 11 | 3% | 60 |
| oa.weak.BotherBot 0.1 | 8 | 2% | 22 |
| PSW.Relentless 0.1 | 8 | 2% | 8 |
| arthord.MannyPacquiao Beta | 6 | 2% | 6 |
| el.JumpShoot 0.2 | 5 | 1% | 7 |

## Melee bench: F23

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 84.6 | 276 / 700 | 2.39 | 15.3% | 50718 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.2% | 235 |
| hadur117.nano.SanaroB320 0.3 | 2.4 | 15.3% | 276 |
| cre.Karolos 0.32 | 2.5 | 15.2% | 128 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.3% | 31 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 9.2% | 10 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 9.1% | 14 |
| cw.megas.Blade 0.8 | 7.0 | 8.4% | 1 |
| sample.Walls 1.0 | 7.1 | 8.2% | 5 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 81.0 | 11 / 35 | 2605 |
| 2 | 2 | 64.6 | 80.3 | 11 / 35 | 2947 |
| 3 | 2 | 64.0 | 83.5 | 10 / 35 | 3181 |
| 4 | 2 | 64.7 | 86.7 | 14 / 35 | 2473 |
| 5 | 2 | 63.8 | 80.0 | 11 / 35 | 2637 |
| 6 | 1 | 64.7 | 84.1 | 13 / 35 | 2877 |
| 7 | 3 | 64.4 | 86.3 | 14 / 35 | 2292 |
| 8 | 2 | 65.5 | 88.6 | 16 / 35 | 2380 |
| 9 | 3 | 63.9 | 83.8 | 11 / 35 | 2243 |
| 10 | 2 | 65.9 | 88.9 | 15 / 35 | 2776 |
| 11 | 3 | 64.3 | 84.8 | 19 / 35 | 2056 |
| 12 | 2 | 66.1 | 85.4 | 17 / 35 | 2845 |
| 13 | 3 | 65.2 | 86.7 | 11 / 35 | 2610 |
| 14 | 2 | 64.7 | 85.1 | 17 / 35 | 2315 |
| 15 | 3 | 64.4 | 82.9 | 17 / 35 | 2467 |
| 16 | 3 | 65.0 | 85.1 | 13 / 35 | 2259 |
| 17 | 3 | 63.7 | 80.0 | 10 / 35 | 2914 |
| 18 | 2 | 66.1 | 87.9 | 22 / 35 | 2408 |
| 19 | 3 | 63.4 | 86.0 | 11 / 35 | 2055 |
| 20 | 2 | 64.3 | 84.8 | 13 / 35 | 2378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 244 | 56% |
| cre.Karolos 0.32 | 118 | 42% |
| stelo.AreaTargetingBot 1.1 | 43 | 67% |
| sample.Walls 1.0 | 37 | 97% |
| stelo.RamTrackSurfer 1.2 | 21 | 81% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 38% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 425 of 700 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 193 | 45% | 347 |
| cre.Karolos 0.32 | 137 | 32% | 184 |
| stelo.AreaTargetingBot 1.1 | 44 | 10% | 69 |
| stelo.RamTrackSurfer 1.2 | 19 | 4% | 47 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 19 | 4% | 25 |
| cw.megas.Blade 0.8 | 7 | 2% | 10 |
| sample.Walls 1.0 | 6 | 1% | 17 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 66.3 | 151 / 700 | 4.03 | 11.5% | 31925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 2.1 | 14.3% | 130 |
| florent.XSeries.X2 0.12 | 2.2 | 14.0% | 122 |
| davidalves.Phoenix 0.54 | 2.5 | 13.6% | 153 |
| pedersen.Ugluk 1.1.1 | 3.9 | 12.4% | 81 |
| hadur117.nano.SanaroB320 0.3 | 4.6 | 11.5% | 151 |
| oog.melee.Corsair 1.0 | 6.4 | 9.5% | 20 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.6% | 34 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.3% | 4 |
| as.FrankTheTank 1.3 | 9.1 | 5.2% | 5 |
| evd.X1 0.01 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.9 | 68.6 | 5 / 35 | 1660 |
| 2 | 4 | 57.1 | 70.2 | 13 / 35 | 1397 |
| 3 | 5 | 54.0 | 61.9 | 7 / 35 | 1637 |
| 4 | 5 | 52.9 | 59.4 | 5 / 35 | 1598 |
| 5 | 5 | 54.8 | 63.8 | 4 / 35 | 1838 |
| 6 | 5 | 56.2 | 67.0 | 6 / 35 | 1639 |
| 7 | 6 | 50.7 | 58.4 | 2 / 35 | 1420 |
| 8 | 4 | 57.5 | 70.8 | 9 / 35 | 1568 |
| 9 | 4 | 55.7 | 66.7 | 8 / 35 | 1628 |
| 10 | 5 | 55.5 | 65.7 | 8 / 35 | 1493 |
| 11 | 2 | 59.8 | 78.4 | 13 / 35 | 1474 |
| 12 | 4 | 56.8 | 69.5 | 9 / 35 | 1478 |
| 13 | 5 | 56.5 | 68.6 | 6 / 35 | 1841 |
| 14 | 4 | 56.6 | 68.9 | 10 / 35 | 1647 |
| 15 | 6 | 52.4 | 57.8 | 4 / 35 | 1681 |
| 16 | 4 | 57.0 | 70.2 | 10 / 35 | 1598 |
| 17 | 5 | 54.7 | 64.1 | 9 / 35 | 1478 |
| 18 | 5 | 56.1 | 65.4 | 9 / 35 | 1768 |
| 19 | 4 | 57.2 | 72.1 | 9 / 35 | 1475 |
| 20 | 6 | 52.7 | 59.7 | 5 / 35 | 1607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 69 | 58% |
| davidalves.Phoenix 0.54 | 69 | 48% |
| florent.XSeries.X2 0.12 | 55 | 71% |
| pedersen.Ugluk 1.1.1 | 25 | 76% |
| stelo.SoJNanoMelee 1.1 | 19 | 32% |
| oog.melee.Corsair 1.0 | 12 | 75% |
| as.FrankTheTank 1.3 | 4 | 75% |
| lunchie.Lunchbox 0.93 | 2 | 0% |

Hadur died in 549 of 700 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 115 | 21% | 157 |
| davidalves.Phoenix 0.54 | 114 | 21% | 144 |
| florent.XSeries.X2 0.12 | 107 | 19% | 144 |
| pedersen.Ugluk 1.1.1 | 82 | 15% | 91 |
| stelo.SoJNanoMelee 1.1 | 44 | 8% | 48 |
| oog.melee.Corsair 1.0 | 35 | 6% | 53 |
| lunchie.Lunchbox 0.93 | 24 | 4% | 25 |
| as.FrankTheTank 1.3 | 14 | 3% | 19 |
| evd.X1 0.01 | 14 | 3% | 15 |

## Melee bench: F25

hadur117.nano.SanaroB320 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 77.7 | 239 / 700 | 2.79 | 15.1% | 32084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.8 | 15.9% | 136 |
| voidious.micro.BlitzBat 1.05 | 1.9 | 15.9% | 155 |
| hadur117.nano.SanaroB320 0.3 | 2.7 | 15.1% | 239 |
| jdw.Hurricane 1.4 | 3.7 | 13.8% | 78 |
| ds.Oo 2.2 | 5.5 | 10.1% | 49 |
| gjr.Cephalosporin 0.1 | 5.6 | 9.5% | 35 |
| adt.Ar2 1.1 | 7.3 | 7.6% | 6 |
| awesomeness.Elite 1.0 | 7.6 | 7.3% | 3 |
| amk.ChumbaMini 0.2 | 9.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 81.1 | 7 / 35 | 1834 |
| 2 | 4 | 59.1 | 75.4 | 12 / 35 | 1395 |
| 3 | 2 | 61.6 | 80.7 | 13 / 35 | 1899 |
| 4 | 2 | 60.5 | 76.1 | 15 / 35 | 1712 |
| 5 | 2 | 60.3 | 76.4 | 11 / 35 | 1839 |
| 6 | 2 | 61.4 | 81.4 | 13 / 35 | 1681 |
| 7 | 3 | 60.3 | 78.9 | 10 / 35 | 1505 |
| 8 | 3 | 60.5 | 78.9 | 13 / 35 | 1470 |
| 9 | 2 | 62.8 | 82.5 | 16 / 35 | 1805 |
| 10 | 3 | 58.9 | 74.6 | 10 / 35 | 1551 |
| 11 | 3 | 60.6 | 79.6 | 13 / 35 | 1481 |
| 12 | 3 | 58.3 | 74.6 | 10 / 35 | 1405 |
| 13 | 3 | 59.3 | 75.7 | 10 / 35 | 1586 |
| 14 | 3 | 59.7 | 78.6 | 10 / 35 | 1525 |
| 15 | 2 | 62.5 | 83.2 | 15 / 35 | 1704 |
| 16 | 1 | 57.7 | 70.7 | 10 / 35 | 1760 |
| 17 | 3 | 58.5 | 73.2 | 13 / 35 | 1450 |
| 18 | 2 | 61.4 | 82.9 | 14 / 35 | 1346 |
| 19 | 4 | 58.6 | 73.2 | 10 / 35 | 1746 |
| 20 | 3 | 58.8 | 75.4 | 14 / 35 | 1390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 122 | 40% |
| voidious.micro.BlitzBat 1.05 | 121 | 31% |
| jdw.Hurricane 1.4 | 111 | 85% |
| gjr.Cephalosporin 0.1 | 38 | 66% |
| ds.Oo 2.2 | 28 | 57% |
| adt.Ar2 1.1 | 15 | 87% |
| awesomeness.Elite 1.0 | 4 | 100% |

Hadur died in 462 of 700 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 160 | 35% | 213 |
| voidious.mini.BrokenSword 2.0.3 | 128 | 28% | 175 |
| jdw.Hurricane 1.4 | 59 | 13% | 130 |
| ds.Oo 2.2 | 38 | 8% | 62 |
| gjr.Cephalosporin 0.1 | 34 | 7% | 61 |
| adt.Ar2 1.1 | 22 | 5% | 35 |
| awesomeness.Elite 1.0 | 14 | 3% | 18 |
| amk.ChumbaMini 0.2 | 6 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 74.6 | 141 / 700 | 3.29 | 12.7% | 42753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.6% | 229 |
| shu.nitro.LENIN .T34 | 2.9 | 13.4% | 166 |
| hadur117.nano.SanaroB320 0.3 | 3.0 | 12.7% | 141 |
| lrem.Spectre 0.4.4 | 3.5 | 12.5% | 83 |
| js.PinBall 1.6 | 5.3 | 11.2% | 28 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 10.8% | 30 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.2% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.7% | 11 |
| sample.SpinBot 1.0 | 9.0 | 5.4% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 78.4 | 6 / 35 | 2069 |
| 2 | 3 | 58.6 | 71.7 | 8 / 35 | 2207 |
| 3 | 3 | 60.3 | 78.4 | 6 / 35 | 2274 |
| 4 | 3 | 60.2 | 79.7 | 4 / 35 | 2113 |
| 5 | 2 | 60.0 | 77.8 | 8 / 35 | 1965 |
| 6 | 4 | 56.8 | 69.2 | 4 / 35 | 1997 |
| 7 | 2 | 59.8 | 76.2 | 7 / 35 | 2311 |
| 8 | 3 | 59.1 | 73.0 | 5 / 35 | 2548 |
| 9 | 3 | 59.2 | 73.3 | 9 / 35 | 2019 |
| 10 | 3 | 57.9 | 69.2 | 8 / 35 | 2302 |
| 11 | 3 | 59.6 | 76.2 | 9 / 35 | 1884 |
| 12 | 3 | 59.2 | 74.6 | 6 / 35 | 1956 |
| 13 | 3 | 59.6 | 76.8 | 8 / 35 | 1925 |
| 14 | 3 | 58.7 | 75.2 | 5 / 35 | 1891 |
| 15 | 4 | 56.4 | 67.3 | 6 / 35 | 1923 |
| 16 | 3 | 58.4 | 69.5 | 9 / 35 | 2241 |
| 17 | 3 | 59.0 | 74.3 | 7 / 35 | 2354 |
| 18 | 3 | 58.7 | 73.3 | 4 / 35 | 2328 |
| 19 | 3 | 61.8 | 81.0 | 13 / 35 | 2125 |
| 20 | 3 | 60.6 | 76.8 | 9 / 35 | 2321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 142 | 32% |
| shu.nitro.LENIN .T34 | 90 | 16% |
| lrem.Spectre 0.4.4 | 69 | 57% |
| gh.mini.GrubbmOne 1.0 | 21 | 71% |
| js.PinBall 1.6 | 19 | 68% |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 56% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 88% |
| sample.SpinBot 1.0 | 3 | 67% |

Hadur died in 563 of 700 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 182 | 32% | 226 |
| shu.nitro.LENIN .T34 | 116 | 21% | 134 |
| lrem.Spectre 0.4.4 | 83 | 15% | 111 |
| gh.mini.GrubbmOne 1.0 | 66 | 12% | 82 |
| js.PinBall 1.6 | 40 | 7% | 57 |
| jaybot.adv.bots.JayBot 2.0 | 37 | 7% | 47 |
| fullsail.LaxativeTeaTwo 1.0 | 22 | 4% | 26 |
| sample.SpinBot 1.0 | 15 | 3% | 16 |
2 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 72.1 | 268 / 700 | 3.51 | 13.4% | 43142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.4 | 15.3% | 216 |
| hadur117.nano.SanaroB320 0.3 | 2.6 | 13.4% | 268 |
| wee.Gem 1.8.4 | 3.1 | 12.3% | 106 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.7% | 58 |
| EH.Eagle 1.0.6 | 4.1 | 11.3% | 32 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.8% | 11 |
| joe.ADinosaur 1.0 | 7.2 | 8.4% | 13 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.7% | 5 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 81.3 | 17 / 35 | 1784 |
| 2 | 2 | 61.1 | 81.0 | 17 / 35 | 1584 |
| 3 | 4 | 55.5 | 51.7 | 10 / 35 | 3216 |
| 4 | 2 | 62.6 | 82.5 | 17 / 35 | 1990 |
| 5 | 2 | 59.7 | 75.6 | 17 / 35 | 1537 |
| 6 | 1 | 60.0 | 78.4 | 17 / 35 | 1697 |
| 7 | 2 | 61.0 | 81.0 | 17 / 35 | 1561 |
| 8 | 5 | 55.9 | 53.3 | 4 / 35 | 3631 |
| 9 | 4 | 55.8 | 53.7 | 6 / 35 | 3391 |
| 10 | 2 | 61.9 | 83.2 | 17 / 35 | 1470 |
| 11 | 1 | 61.5 | 81.3 | 16 / 35 | 1979 |
| 12 | 7 | 49.5 | 39.0 | 4 / 35 | 3382 |
| 13 | 5 | 52.6 | 44.4 | 4 / 35 | 3695 |
| 14 | 1 | 63.3 | 84.4 | 20 / 35 | 2037 |
| 15 | 2 | 61.5 | 78.7 | 18 / 35 | 1832 |
| 16 | 2 | 60.5 | 79.7 | 16 / 35 | 1421 |
| 17 | 2 | 60.8 | 81.6 | 14 / 35 | 1445 |
| 18 | 2 | 61.5 | 81.6 | 16 / 35 | 1831 |
| 19 | 2 | 59.2 | 75.2 | 11 / 35 | 1887 |
| 20 | 2 | 58.8 | 74.9 | 10 / 35 | 1772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 171 | 64% |
| wee.Gem 1.8.4 | 89 | 63% |
| EH.Eagle 1.0.6 | 58 | 93% |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 68% |
| techdude.kombat.FlamingKombat 1.5 | 24 | 71% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| joe.ADinosaur 1.0 | 5 | 60% |
| throxbot.ThroxBot 0.1 | 4 | 100% |

Hadur died in 437 of 700 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 134 | 31% | 234 |
| sheldor.melee.nano.TestMelee 0.1 | 69 | 16% | 95 |
| wee.Gem 1.8.4 | 65 | 15% | 125 |
| joe.ADinosaur 1.0 | 38 | 9% | 40 |
| techdude.kombat.FlamingKombat 1.5 | 34 | 8% | 45 |
| cs.Grudge 1.0 | 31 | 7% | 29 |
| EH.Eagle 1.0.6 | 24 | 5% | 86 |
| caimano.Furia_Ceca 0.22 | 21 | 5% | 25 |
| throxbot.ThroxBot 0.1 | 17 | 4% | 21 |
4 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 83.0 | 314 / 700 | 2.53 | 15.1% | 42737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.4 | 15.8% | 169 |
| hadur117.nano.SanaroB320 0.3 | 1.7 | 15.1% | 314 |
| uji.Antique 1.0 | 3.3 | 12.6% | 106 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 11.0% | 25 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 11.3% | 52 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 22 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.3% | 7 |
| matt.advanced.Katana 1.0 | 8.6 | 6.3% | 4 |
| stelo.PianistNano 1.2 | 9.0 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.4 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 80.6 | 17 / 35 | 2294 |
| 2 | 1 | 63.4 | 86.3 | 17 / 35 | 2033 |
| 3 | 3 | 60.6 | 77.5 | 10 / 35 | 2017 |
| 4 | 1 | 63.0 | 82.9 | 17 / 35 | 2343 |
| 5 | 2 | 60.4 | 78.1 | 13 / 35 | 1885 |
| 6 | 2 | 63.8 | 86.7 | 20 / 35 | 1943 |
| 7 | 2 | 63.4 | 86.0 | 16 / 35 | 2075 |
| 8 | 1 | 63.3 | 85.4 | 18 / 35 | 2101 |
| 9 | 1 | 64.0 | 86.3 | 15 / 35 | 2488 |
| 10 | 2 | 62.5 | 81.9 | 15 / 35 | 2049 |
| 11 | 2 | 63.2 | 83.5 | 16 / 35 | 2258 |
| 12 | 2 | 63.5 | 85.1 | 18 / 35 | 2197 |
| 13 | 1 | 64.2 | 87.3 | 19 / 35 | 2429 |
| 14 | 1 | 65.3 | 89.5 | 19 / 35 | 2373 |
| 15 | 2 | 60.5 | 80.6 | 8 / 35 | 1890 |
| 16 | 2 | 62.9 | 84.8 | 17 / 35 | 2085 |
| 17 | 2 | 59.3 | 73.3 | 11 / 35 | 2170 |
| 18 | 1 | 63.1 | 81.9 | 19 / 35 | 2331 |
| 19 | 1 | 62.7 | 82.9 | 18 / 35 | 2066 |
| 20 | 2 | 60.6 | 80.3 | 11 / 35 | 1710 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 230 | 67% |
| uji.Antique 1.0 | 106 | 70% |
| qohnil.blot.BlotBot 3.61 | 59 | 61% |
| pfvicm.Sobieski 7.2.3b | 31 | 61% |
| ahr.ice.Ice 1.0.2 | 23 | 52% |
| amk.ChumbaWumba 0.3 | 12 | 92% |
| matt.advanced.Katana 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 387 of 700 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 137 | 35% | 254 |
| pfvicm.Sobieski 7.2.3b | 66 | 17% | 82 |
| uji.Antique 1.0 | 59 | 15% | 151 |
| qohnil.blot.BlotBot 3.61 | 56 | 14% | 101 |
| amk.ChumbaWumba 0.3 | 30 | 8% | 38 |
| ahr.ice.Ice 1.0.2 | 21 | 5% | 37 |
| stelo.Lifestealer 1.0 | 9 | 2% | 11 |
| matt.advanced.Katana 1.0 | 7 | 2% | 20 |
| stelo.PianistNano 1.2 | 2 | 1% | 4 |

## Melee bench: F29

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 73.9 | 190 / 700 | 3.35 | 13.3% | 40375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.6 | 15.7% | 179 |
| deewiant.Anomaly 0.2 | 1.6 | 16.0% | 209 |
| hadur117.nano.SanaroB320 0.3 | 3.1 | 13.3% | 190 |
| myl.micro.Troodon 1.10 | 3.9 | 12.7% | 43 |
| jok.PheonixM 0.1.2 | 5.0 | 11.2% | 27 |
| ph.melee.ArcherME 0.3 | 6.4 | 8.1% | 3 |
| DBall.Anarchy 0.1 | 6.6 | 7.6% | 35 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.4 | 4.7% | 9 |
| jangs.ns51 1.0 | 9.6 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 73.0 | 9 / 35 | 2036 |
| 2 | 3 | 61.1 | 75.9 | 12 / 35 | 2134 |
| 3 | 3 | 61.8 | 78.4 | 10 / 35 | 2059 |
| 4 | 1 | 63.2 | 82.5 | 15 / 35 | 1918 |
| 5 | 3 | 59.9 | 75.2 | 9 / 35 | 1726 |
| 6 | 4 | 59.2 | 71.1 | 9 / 35 | 1973 |
| 7 | 2 | 62.0 | 75.2 | 16 / 35 | 2232 |
| 8 | 3 | 59.7 | 75.2 | 9 / 35 | 1810 |
| 9 | 3 | 60.6 | 75.9 | 8 / 35 | 1995 |
| 10 | 4 | 56.5 | 63.5 | 8 / 35 | 1876 |
| 11 | 3 | 59.5 | 72.4 | 10 / 35 | 2117 |
| 12 | 4 | 58.3 | 69.8 | 6 / 35 | 2134 |
| 13 | 3 | 61.0 | 77.1 | 9 / 35 | 2066 |
| 14 | 3 | 59.3 | 73.3 | 8 / 35 | 1904 |
| 15 | 4 | 57.0 | 69.5 | 3 / 35 | 2031 |
| 16 | 3 | 62.2 | 78.4 | 12 / 35 | 2084 |
| 17 | 3 | 58.9 | 71.1 | 7 / 35 | 1971 |
| 18 | 4 | 59.7 | 71.4 | 10 / 35 | 1966 |
| 19 | 3 | 62.3 | 79.7 | 12 / 35 | 2076 |
| 20 | 3 | 58.7 | 69.2 | 8 / 35 | 2267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 128 | 13% |
| zyx.mega.YersiniaPestis 3.1 | 123 | 72% |
| myl.micro.Troodon 1.10 | 51 | 82% |
| DBall.Anarchy 0.1 | 32 | 56% |
| jok.PheonixM 0.1.2 | 21 | 76% |
| ap.Frederick 1.1 | 8 | 63% |
| jangs.ns51 1.0 | 3 | 67% |
| ph.melee.ArcherME 0.3 | 2 | 50% |

Hadur died in 512 of 700 rounds, at a mean tick of 1372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 223 | 44% | 249 |
| zyx.mega.YersiniaPestis 3.1 | 87 | 17% | 175 |
| myl.micro.Troodon 1.10 | 72 | 14% | 107 |
| jok.PheonixM 0.1.2 | 63 | 12% | 84 |
| ph.melee.ArcherME 0.3 | 21 | 4% | 25 |
| DBall.Anarchy 0.1 | 20 | 4% | 37 |
| fullsail.TimbotNoPrediction 1.0 | 16 | 3% | 15 |
| jangs.ns51 1.0 | 7 | 1% | 8 |
| ap.Frederick 1.1 | 3 | 1% | 0 |

## Melee bench: F30

hadur117.nano.SanaroB320 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.0 | 62.6 | 95 / 700 | 3.99 | 11.8% | 33675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.6 | 16.9% | 238 |
| oog.melee.Capulet 1.2 | 2.2 | 16.1% | 147 |
| stelo.PastFuture 2.3.2 | 2.2 | 16.0% | 129 |
| hadur117.nano.SanaroB320 0.3 | 4.2 | 11.8% | 95 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.6% | 32 |
| fowl3628800.LightningBolt 2.6.0 | 6.5 | 9.1% | 29 |
| ntc.Opposite 1.5 | 6.7 | 8.8% | 6 |
| tripphippy.Alice 1.1 | 6.8 | 9.0% | 24 |
| GarmBox.Anger 1.0 | 9.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 65.0 | 9 / 35 | 1776 |
| 2 | 4 | 53.8 | 62.1 | 5 / 35 | 1726 |
| 3 | 4 | 54.9 | 64.3 | 6 / 35 | 1758 |
| 4 | 4 | 53.8 | 62.1 | 4 / 35 | 1567 |
| 5 | 4 | 54.5 | 61.4 | 5 / 35 | 1940 |
| 6 | 5 | 49.5 | 53.6 | 2 / 35 | 1445 |
| 7 | 4 | 54.3 | 65.7 | 5 / 35 | 1424 |
| 8 | 4 | 54.6 | 63.6 | 5 / 35 | 1642 |
| 9 | 4 | 54.5 | 65.4 | 5 / 35 | 1741 |
| 10 | 4 | 54.8 | 61.8 | 5 / 35 | 1934 |
| 11 | 5 | 51.4 | 56.4 | 4 / 35 | 1424 |
| 12 | 4 | 54.7 | 65.7 | 6 / 35 | 1495 |
| 13 | 4 | 53.3 | 62.1 | 3 / 35 | 1642 |
| 14 | 5 | 49.9 | 53.9 | 3 / 35 | 1494 |
| 15 | 4 | 55.9 | 67.9 | 5 / 35 | 1690 |
| 16 | 4 | 55.1 | 67.9 | 4 / 35 | 1498 |
| 17 | 4 | 53.2 | 59.6 | 3 / 35 | 1793 |
| 18 | 4 | 55.0 | 64.6 | 4 / 35 | 1864 |
| 19 | 4 | 54.9 | 62.1 | 4 / 35 | 2027 |
| 20 | 4 | 55.9 | 66.8 | 8 / 35 | 1795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 107 | 27% |
| oog.melee.Capulet 1.2 | 56 | 36% |
| stelo.PastFuture 2.3.2 | 30 | 73% |
| fowl3628800.LightningBolt 2.6.0 | 23 | 61% |
| intruder.PrairieWolf 2.61 | 15 | 47% |
| tripphippy.Alice 1.1 | 7 | 43% |

Hadur died in 605 of 700 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 159 | 26% | 180 |
| oog.melee.Capulet 1.2 | 127 | 21% | 157 |
| stelo.PastFuture 2.3.2 | 121 | 20% | 152 |
| fowl3628800.LightningBolt 2.6.0 | 63 | 10% | 68 |
| ntc.Opposite 1.5 | 53 | 9% | 53 |
| tripphippy.Alice 1.1 | 45 | 7% | 48 |
| intruder.PrairieWolf 2.61 | 33 | 5% | 38 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.2 | 63.1 | 102 / 700 | 4.32 | 10.7% | 28752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 321 |
| gh.mini.Griezel 0.2 | 2.2 | 14.0% | 155 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 12.2% | 52 |
| d414.nano.Quantum 1.0.0 | 3.9 | 12.0% | 48 |
| hadur117.nano.SanaroB320 0.3 | 4.6 | 10.7% | 102 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.5% | 17 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.7% | 4 |
| fm.mammillarias 1.3 | 7.8 | 6.5% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.3 | 67.6 | 7 / 35 | 1608 |
| 2 | 5 | 51.9 | 58.1 | 1 / 35 | 1423 |
| 3 | 3 | 54.6 | 65.7 | 5 / 35 | 1475 |
| 4 | 4 | 57.9 | 72.1 | 7 / 35 | 1614 |
| 5 | 4 | 58.3 | 71.7 | 9 / 35 | 1539 |
| 6 | 5 | 51.9 | 55.6 | 5 / 35 | 1558 |
| 7 | 5 | 53.4 | 61.6 | 6 / 35 | 1225 |
| 8 | 5 | 53.7 | 61.9 | 8 / 35 | 1272 |
| 9 | 5 | 54.8 | 63.5 | 5 / 35 | 1415 |
| 10 | 5 | 52.8 | 59.7 | 5 / 35 | 1346 |
| 11 | 3 | 56.2 | 69.5 | 4 / 35 | 1473 |
| 12 | 3 | 57.8 | 70.8 | 6 / 35 | 1705 |
| 13 | 5 | 52.5 | 57.5 | 5 / 35 | 1434 |
| 14 | 5 | 51.7 | 58.1 | 5 / 35 | 1163 |
| 15 | 6 | 53.7 | 63.2 | 2 / 35 | 1505 |
| 16 | 5 | 54.7 | 63.5 | 7 / 35 | 1510 |
| 17 | 4 | 55.0 | 65.4 | 4 / 35 | 1614 |
| 18 | 5 | 52.3 | 57.8 | 6 / 35 | 1314 |
| 19 | 5 | 51.9 | 59.7 | 1 / 35 | 1451 |
| 20 | 5 | 51.8 | 60.0 | 4 / 35 | 1108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 117 | 39% |
| gh.mini.Griezel 0.2 | 92 | 46% |
| d414.nano.Quantum 1.0.0 | 19 | 16% |
| spinnercat.micro.Tyger 0.1 | 16 | 19% |
| timmit.nano.TimDog 0.33 | 4 | 75% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 598 of 700 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 152 | 25% | 196 |
| gh.mini.Griezel 0.2 | 143 | 24% | 183 |
| spinnercat.micro.Tyger 0.1 | 108 | 18% | 112 |
| d414.nano.Quantum 1.0.0 | 87 | 15% | 91 |
| gh.nano.Grofvuil 0.2 | 37 | 6% | 39 |
| fm.mammillarias 1.3 | 30 | 5% | 31 |
| timmit.nano.TimDog 0.33 | 22 | 4% | 27 |
| Gecko.ultimateGeckoBot 1.0 | 14 | 2% | 16 |
| tlp.ThreeLeggedPig 1 | 5 | 1% | 5 |

## Melee bench: F32

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 80.2 | 311 / 700 | 2.78 | 14.5% | 44829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.2 | 15.5% | 191 |
| hadur117.nano.SanaroB320 0.3 | 2.0 | 14.5% | 311 |
| apc.botM 3.0 | 3.2 | 12.7% | 72 |
| lxx.ConceptA 0.8 | 4.3 | 10.9% | 23 |
| vjik.UnViolation 1.1 | 4.7 | 10.8% | 43 |
| bayen.UbaMicro 1.4 | 5.9 | 9.0% | 15 |
| panzer.Panzer 0.2 | 7.5 | 7.4% | 4 |
| conscience.Electron 1.3g | 8.6 | 6.6% | 0 |
| yk.JahMicro 1.0 | 8.6 | 6.7% | 9 |
| donjezza.Jezza 1.0 | 9.4 | 5.8% | 33 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 75.2 | 13 / 35 | 2247 |
| 2 | 3 | 58.9 | 73.7 | 9 / 35 | 2416 |
| 3 | 2 | 60.6 | 81.3 | 14 / 35 | 1939 |
| 4 | 2 | 61.6 | 81.3 | 13 / 35 | 2354 |
| 5 | 2 | 59.0 | 74.9 | 16 / 35 | 2014 |
| 6 | 2 | 62.6 | 84.4 | 17 / 35 | 2208 |
| 7 | 2 | 60.8 | 76.8 | 14 / 35 | 2415 |
| 8 | 2 | 61.9 | 81.3 | 18 / 35 | 1990 |
| 9 | 2 | 62.9 | 83.8 | 19 / 35 | 2231 |
| 10 | 2 | 61.2 | 77.8 | 17 / 35 | 2189 |
| 11 | 2 | 61.4 | 81.9 | 14 / 35 | 2005 |
| 12 | 1 | 65.8 | 93.0 | 25 / 35 | 2392 |
| 13 | 2 | 61.5 | 79.7 | 17 / 35 | 2149 |
| 14 | 2 | 62.3 | 82.5 | 15 / 35 | 2254 |
| 15 | 2 | 60.3 | 79.0 | 16 / 35 | 1802 |
| 16 | 1 | 62.9 | 82.2 | 13 / 35 | 3012 |
| 17 | 3 | 58.2 | 69.8 | 12 / 35 | 2428 |
| 18 | 2 | 60.1 | 77.8 | 15 / 35 | 2145 |
| 19 | 2 | 62.3 | 82.5 | 18 / 35 | 2222 |
| 20 | 1 | 62.7 | 84.8 | 16 / 35 | 2417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 213 | 63% |
| apc.botM 3.0 | 98 | 73% |
| vjik.UnViolation 1.1 | 42 | 83% |
| lxx.ConceptA 0.8 | 34 | 88% |
| donjezza.Jezza 1.0 | 20 | 20% |
| bayen.UbaMicro 1.4 | 19 | 74% |
| yk.JahMicro 1.0 | 15 | 93% |
| panzer.Panzer 0.2 | 6 | 83% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 392 of 700 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 143 | 36% | 274 |
| lxx.ConceptA 0.8 | 75 | 19% | 91 |
| apc.botM 3.0 | 59 | 15% | 135 |
| bayen.UbaMicro 1.4 | 32 | 8% | 44 |
| vjik.UnViolation 1.1 | 27 | 7% | 75 |
| donjezza.Jezza 1.0 | 22 | 6% | 27 |
| conscience.Electron 1.3g | 15 | 4% | 19 |
| panzer.Panzer 0.2 | 12 | 3% | 15 |
| yk.JahMicro 1.0 | 7 | 2% | 19 |

## Melee bench: F33

hadur117.nano.SanaroB320 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 79.5 | 225 / 700 | 2.64 | 15.7% | 42245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 19.2% | 200 |
| hadur117.nano.SanaroB320 0.3 | 2.5 | 15.7% | 225 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 15.6% | 165 |
| labg.Cataclysm 2.05 | 4.0 | 13.2% | 72 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.5 | 10.1% | 25 |
| baal.nano.N 1.42 | 5.5 | 10.3% | 7 |
| zyx.micro.Ant 1.1 | 7.4 | 6.5% | 1 |
| sanja.First 0.1 | 7.8 | 5.5% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.8 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 79.6 | 9 / 35 | 1846 |
| 2 | 3 | 61.1 | 77.5 | 10 / 35 | 1962 |
| 3 | 2 | 62.3 | 78.6 | 12 / 35 | 2286 |
| 4 | 2 | 59.6 | 72.5 | 11 / 35 | 1974 |
| 5 | 2 | 63.9 | 85.4 | 11 / 35 | 2430 |
| 6 | 2 | 61.0 | 76.1 | 13 / 35 | 2022 |
| 7 | 2 | 62.4 | 80.4 | 12 / 35 | 2128 |
| 8 | 3 | 61.3 | 77.1 | 9 / 35 | 2347 |
| 9 | 3 | 61.9 | 78.9 | 9 / 35 | 2237 |
| 10 | 2 | 62.1 | 79.6 | 10 / 35 | 2304 |
| 11 | 3 | 62.6 | 81.4 | 12 / 35 | 2111 |
| 12 | 2 | 64.0 | 85.7 | 15 / 35 | 2039 |
| 13 | 3 | 61.1 | 76.8 | 8 / 35 | 2229 |
| 14 | 3 | 63.1 | 81.8 | 12 / 35 | 2204 |
| 15 | 2 | 63.8 | 85.4 | 15 / 35 | 2056 |
| 16 | 2 | 62.4 | 80.4 | 10 / 35 | 2200 |
| 17 | 3 | 61.0 | 76.1 | 11 / 35 | 2007 |
| 18 | 3 | 61.8 | 80.0 | 11 / 35 | 1956 |
| 19 | 3 | 61.8 | 78.2 | 14 / 35 | 2122 |
| 20 | 2 | 60.6 | 78.2 | 11 / 35 | 1785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 179 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 150 | 20% |
| labg.Cataclysm 2.05 | 71 | 63% |
| kinsen.melee.Angsaichmophobia 1.8c | 39 | 77% |
| baal.nano.N 1.42 | 13 | 85% |
| zyx.micro.Ant 1.1 | 5 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 50% |
| sanja.First 0.1 | 3 | 100% |

Hadur died in 479 of 700 rounds, at a mean tick of 1764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 186 | 39% | 296 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 175 | 37% | 214 |
| labg.Cataclysm 2.05 | 50 | 10% | 91 |
| kinsen.melee.Angsaichmophobia 1.8c | 36 | 8% | 48 |
| baal.nano.N 1.42 | 20 | 4% | 32 |
| zyx.micro.Ant 1.1 | 8 | 2% | 13 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 2 |
| sanja.First 0.1 | 1 | 0% | 4 |

## Melee bench: F34

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 78.6 | 211 / 700 | 2.93 | 13.7% | 43527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 17.5% | 238 |
| kid.Gladiator .7.2 | 1.6 | 17.5% | 171 |
| hadur117.nano.SanaroB320 0.3 | 3.1 | 13.7% | 211 |
| jcs.Seth 1.8 | 4.4 | 11.7% | 48 |
| tcf.Reach 3 | 4.7 | 11.3% | 27 |
| cli.Dancer 1.1 | 5.9 | 9.5% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.7% | 1 |
| sample.RamFire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 72.7 | 7 / 35 | 1618 |
| 2 | 4 | 59.3 | 70.5 | 9 / 35 | 2049 |
| 3 | 3 | 63.0 | 81.9 | 12 / 35 | 2179 |
| 4 | 3 | 61.6 | 78.4 | 8 / 35 | 2389 |
| 5 | 3 | 63.9 | 84.1 | 12 / 35 | 2492 |
| 6 | 3 | 63.2 | 83.8 | 13 / 35 | 2152 |
| 7 | 3 | 60.8 | 74.0 | 9 / 35 | 2317 |
| 8 | 3 | 62.8 | 83.8 | 12 / 35 | 1840 |
| 9 | 3 | 61.8 | 76.8 | 13 / 35 | 2139 |
| 10 | 3 | 61.5 | 77.5 | 9 / 35 | 2019 |
| 11 | 3 | 62.4 | 81.6 | 13 / 35 | 2092 |
| 12 | 3 | 63.4 | 82.5 | 14 / 35 | 2144 |
| 13 | 3 | 59.8 | 76.2 | 6 / 35 | 1942 |
| 14 | 3 | 61.9 | 80.0 | 9 / 35 | 2180 |
| 15 | 3 | 62.8 | 80.0 | 13 / 35 | 2372 |
| 16 | 3 | 61.6 | 75.2 | 13 / 35 | 2429 |
| 17 | 3 | 62.6 | 79.4 | 12 / 35 | 2248 |
| 18 | 3 | 61.3 | 75.2 | 6 / 35 | 2516 |
| 19 | 3 | 62.0 | 78.4 | 13 / 35 | 2108 |
| 20 | 4 | 61.9 | 79.7 | 8 / 35 | 2302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 150 | 57% |
| kid.Gladiator .7.2 | 136 | 50% |
| jcs.Seth 1.8 | 56 | 71% |
| tcf.Reach 3 | 22 | 59% |
| cli.Dancer 1.1 | 5 | 40% |
| ratosh.Wesco 1.4 | 3 | 67% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 493 of 700 rounds, at a mean tick of 1119. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 202 | 41% | 255 |
| stelo.Spread 0.9 | 157 | 32% | 256 |
| jcs.Seth 1.8 | 50 | 10% | 91 |
| tcf.Reach 3 | 39 | 8% | 54 |
| cli.Dancer 1.1 | 17 | 3% | 19 |
| ratosh.Wesco 1.4 | 15 | 3% | 15 |
| sample.VelociRobot 1.0 | 5 | 1% | 5 |
| amk.Punbot.Punbot 0.01 | 4 | 1% | 4 |
| sample.RamFire 1.0 | 1 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 71.6 | 76 / 700 | 3.55 | 12.0% | 33549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 516 |
| gh.mini.Gruwel 0.9 | 2.9 | 13.1% | 66 |
| rz.HawkOnFire 0.1 | 3.3 | 12.5% | 13 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.6 | 12.5% | 27 |
| hadur117.nano.SanaroB320 0.3 | 4.2 | 12.0% | 76 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 7.1% | 1 |
| wit.Chuliath 1.0 | 6.6 | 6.9% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.9 | 70.5 | 3 / 35 | 1830 |
| 2 | 4 | 57.7 | 71.4 | 6 / 35 | 1674 |
| 3 | 5 | 55.3 | 65.4 | 1 / 35 | 1609 |
| 4 | 3 | 59.8 | 76.5 | 5 / 35 | 1885 |
| 5 | 3 | 60.2 | 78.1 | 7 / 35 | 1774 |
| 6 | 2 | 60.2 | 76.8 | 9 / 35 | 1758 |
| 7 | 5 | 56.3 | 69.8 | 1 / 35 | 1407 |
| 8 | 4 | 58.8 | 74.3 | 4 / 35 | 1649 |
| 9 | 5 | 56.4 | 70.5 | 3 / 35 | 1408 |
| 10 | 5 | 56.6 | 70.2 | 3 / 35 | 1628 |
| 11 | 3 | 58.9 | 76.5 | 3 / 35 | 1680 |
| 12 | 5 | 58.2 | 73.3 | 5 / 35 | 1493 |
| 13 | 2 | 60.0 | 79.7 | 7 / 35 | 1478 |
| 14 | 5 | 56.9 | 69.8 | 0 / 35 | 1867 |
| 15 | 4 | 56.6 | 68.9 | 0 / 35 | 1767 |
| 16 | 5 | 55.5 | 66.7 | 1 / 35 | 1562 |
| 17 | 5 | 57.3 | 67.3 | 6 / 35 | 1802 |
| 18 | 5 | 54.9 | 62.5 | 3 / 35 | 1833 |
| 19 | 4 | 58.6 | 73.0 | 4 / 35 | 1765 |
| 20 | 5 | 57.7 | 71.4 | 5 / 35 | 1680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 186 | 6% |
| gh.mini.Gruwel 0.9 | 53 | 60% |
| dmh.robocode.robot.BlackDeath 9.2 | 28 | 64% |
| rz.HawkOnFire 0.1 | 20 | 70% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 625 of 700 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 287 | 46% | 297 |
| rz.HawkOnFire 0.1 | 109 | 17% | 123 |
| gh.mini.Gruwel 0.9 | 97 | 16% | 129 |
| dmh.robocode.robot.BlackDeath 9.2 | 74 | 12% | 92 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 19 | 3% | 19 |
| myl.nano.KomoriNinja 1.1 | 16 | 3% | 17 |
| wit.Chuliath 1.0 | 9 | 1% | 10 |
| dans.Cinnamon 1.2 | 7 | 1% | 7 |
| stelo.MyAgileRobot 0.2 | 6 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 80.0 | 308 / 700 | 2.80 | 15.0% | 48963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB320 0.3 | 1.2 | 15.0% | 308 |
| alpha.RainingFire 1.0 | 2.7 | 13.0% | 105 |
| bzdp.Pansy 2.1 | 3.5 | 12.2% | 74 |
| mz.Cork 0.1 | 3.8 | 11.7% | 57 |
| bvh.micro.Freya 0.3 | 5.1 | 10.8% | 45 |
| m3thos.Eva02 0.7.1 | 5.5 | 10.4% | 52 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.7% | 16 |
| squidM.TentalceMeleeNano 1.1 | 8.4 | 6.5% | 6 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 8 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.5% | 32 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 78.1 | 16 / 35 | 2085 |
| 2 | 3 | 57.8 | 69.8 | 9 / 35 | 2270 |
| 3 | 1 | 64.6 | 87.6 | 18 / 35 | 2526 |
| 4 | 1 | 63.9 | 84.1 | 18 / 35 | 2422 |
| 5 | 2 | 58.6 | 68.9 | 14 / 35 | 2149 |
| 6 | 1 | 61.8 | 78.7 | 14 / 35 | 2466 |
| 7 | 1 | 64.3 | 84.1 | 20 / 35 | 2466 |
| 8 | 1 | 62.0 | 78.4 | 14 / 35 | 2479 |
| 9 | 1 | 61.5 | 78.4 | 16 / 35 | 2217 |
| 10 | 1 | 61.4 | 77.8 | 16 / 35 | 2362 |
| 11 | 1 | 62.3 | 81.6 | 15 / 35 | 2470 |
| 12 | 1 | 60.7 | 74.3 | 14 / 35 | 2681 |
| 13 | 1 | 64.2 | 82.2 | 19 / 35 | 2775 |
| 14 | 1 | 64.0 | 87.6 | 16 / 35 | 2569 |
| 15 | 1 | 62.1 | 80.3 | 16 / 35 | 2281 |
| 16 | 1 | 61.7 | 80.3 | 10 / 35 | 2572 |
| 17 | 1 | 62.3 | 79.7 | 15 / 35 | 2409 |
| 18 | 1 | 64.4 | 86.7 | 18 / 35 | 2641 |
| 19 | 1 | 64.2 | 85.7 | 17 / 35 | 2613 |
| 20 | 1 | 60.8 | 74.6 | 13 / 35 | 2510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 101 | 53% |
| bzdp.Pansy 2.1 | 83 | 64% |
| mz.Cork 0.1 | 76 | 82% |
| bvh.micro.Freya 0.3 | 62 | 85% |
| m3thos.Eva02 0.7.1 | 49 | 69% |
| bvh.mini.Fenrir 0.39 | 38 | 89% |
| sample.MyFirstRobot 1.0 | 19 | 11% |
| dl.BetterWalls 1.0 | 12 | 92% |
| squidM.TentalceMeleeNano 1.1 | 8 | 50% |

Hadur died in 392 of 700 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 94 | 24% | 147 |
| bzdp.Pansy 2.1 | 69 | 18% | 138 |
| mz.Cork 0.1 | 57 | 15% | 124 |
| bvh.mini.Fenrir 0.39 | 47 | 12% | 68 |
| bvh.micro.Freya 0.3 | 42 | 11% | 78 |
| m3thos.Eva02 0.7.1 | 42 | 11% | 77 |
| sample.MyFirstRobot 1.0 | 22 | 6% | 29 |
| squidM.TentalceMeleeNano 1.1 | 13 | 3% | 19 |
| dl.BetterWalls 1.0 | 6 | 2% | 20 |

## Melee bench: F37

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 79.2 | 246 / 700 | 2.88 | 14.4% | 60816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB320 0.3 | 1.2 | 14.4% | 246 |
| germ.TheMind .2 | 2.7 | 11.7% | 97 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.4 | 11.1% | 69 |
| EBBU.Sim2 1.02 | 3.5 | 11.0% | 73 |
| agrach.Dalek 1.0 | 5.4 | 9.6% | 59 |
| lmk.ACPFinal 0.1 | 6.8 | 9.0% | 33 |
| stelo.UntouchableNano 1.3 | 7.7 | 8.6% | 31 |
| mb.Beast 0.1 | 7.7 | 8.6% | 46 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 8.0% | 1 |
| skm.Ryubot 1.0 | 8.6 | 8.1% | 45 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 83.8 | 13 / 35 | 2597 |
| 2 | 1 | 59.7 | 76.8 | 12 / 35 | 3021 |
| 3 | 1 | 61.3 | 81.3 | 14 / 35 | 3065 |
| 4 | 2 | 57.9 | 75.2 | 10 / 35 | 2400 |
| 5 | 1 | 61.4 | 83.8 | 12 / 35 | 2836 |
| 6 | 1 | 63.4 | 86.3 | 17 / 35 | 3326 |
| 7 | 1 | 60.5 | 77.8 | 10 / 35 | 3617 |
| 8 | 2 | 57.0 | 72.7 | 11 / 35 | 2412 |
| 9 | 1 | 61.5 | 81.6 | 11 / 35 | 3471 |
| 10 | 1 | 62.5 | 83.5 | 14 / 35 | 3512 |
| 11 | 1 | 62.0 | 81.9 | 18 / 35 | 3150 |
| 12 | 1 | 60.9 | 78.1 | 13 / 35 | 3363 |
| 13 | 1 | 60.8 | 79.0 | 14 / 35 | 2971 |
| 14 | 1 | 61.4 | 82.5 | 14 / 35 | 3007 |
| 15 | 1 | 61.1 | 80.0 | 10 / 35 | 3387 |
| 16 | 2 | 57.4 | 71.4 | 9 / 35 | 2776 |
| 17 | 1 | 60.6 | 78.7 | 13 / 35 | 3093 |
| 18 | 1 | 60.0 | 78.7 | 12 / 35 | 2783 |
| 19 | 1 | 59.1 | 75.2 | 8 / 35 | 3058 |
| 20 | 1 | 58.8 | 74.6 | 11 / 35 | 2971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 94 | 62% |
| EBBU.Sim2 1.02 | 81 | 35% |
| agrach.Dalek 1.0 | 53 | 74% |
| skm.Ryubot 1.0 | 51 | 45% |
| mb.Beast 0.1 | 46 | 63% |
| com.syncleus.robocode.Dreadnaught 0.1 | 44 | 45% |
| lmk.ACPFinal 0.1 | 35 | 69% |
| stelo.UntouchableNano 1.3 | 33 | 73% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 457 of 700 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 90 | 20% | 111 |
| germ.TheMind .2 | 88 | 19% | 134 |
| com.syncleus.robocode.Dreadnaught 0.1 | 71 | 16% | 101 |
| lmk.ACPFinal 0.1 | 45 | 10% | 66 |
| agrach.Dalek 1.0 | 39 | 9% | 87 |
| skm.Ryubot 1.0 | 34 | 7% | 55 |
| mn.nano.perceptual.Impact 1.3.0 | 34 | 7% | 37 |
| mb.Beast 0.1 | 31 | 7% | 61 |
| stelo.UntouchableNano 1.3 | 25 | 5% | 44 |

## Melee bench: F38

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 70.7 | 130 / 700 | 3.63 | 12.1% | 37654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 283 |
| bvh.mini.Freya 0.55 | 2.2 | 13.3% | 59 |
| hadur117.nano.SanaroB320 0.3 | 3.7 | 12.1% | 130 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.8% | 102 |
| cs.Wren 1.0 | 4.9 | 11.1% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 10.3% | 43 |
| kdf.KoulDestroyer 1.0 | 6.4 | 9.3% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.5% | 12 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.4% | 3 |
| bzdp.BoxCar 2.0 | 9.6 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 71.7 | 7 / 35 | 1826 |
| 2 | 4 | 57.5 | 71.7 | 7 / 35 | 1703 |
| 3 | 4 | 58.0 | 69.8 | 7 / 35 | 1923 |
| 4 | 3 | 59.0 | 75.2 | 7 / 35 | 1784 |
| 5 | 4 | 57.8 | 69.2 | 7 / 35 | 2119 |
| 6 | 2 | 59.8 | 77.8 | 7 / 35 | 1949 |
| 7 | 5 | 56.4 | 67.9 | 6 / 35 | 1781 |
| 8 | 4 | 56.8 | 68.9 | 6 / 35 | 1869 |
| 9 | 3 | 57.4 | 68.9 | 8 / 35 | 1937 |
| 10 | 4 | 56.7 | 69.2 | 5 / 35 | 1844 |
| 11 | 3 | 58.8 | 74.6 | 6 / 35 | 2120 |
| 12 | 5 | 54.8 | 64.8 | 3 / 35 | 1858 |
| 13 | 4 | 56.4 | 67.0 | 6 / 35 | 2028 |
| 14 | 3 | 58.2 | 74.0 | 9 / 35 | 1707 |
| 15 | 3 | 57.9 | 69.8 | 11 / 35 | 1996 |
| 16 | 5 | 56.5 | 70.2 | 4 / 35 | 1808 |
| 17 | 3 | 59.5 | 75.6 | 10 / 35 | 1835 |
| 18 | 6 | 52.3 | 59.7 | 3 / 35 | 1641 |
| 19 | 3 | 57.7 | 73.0 | 6 / 35 | 1798 |
| 20 | 3 | 58.8 | 75.9 | 5 / 35 | 2128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 151 | 52% |
| bts.mega.Gnarly 1.4 | 47 | 21% |
| bvh.mini.Freya 0.55 | 32 | 53% |
| cs.Wren 1.0 | 24 | 21% |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 11% |
| kawigi.spare.SpareParts 0.7.6nosnd | 9 | 89% |
| kdf.KoulDestroyer 1.0 | 8 | 63% |
| matt.UnderDark3 2.4.34 | 4 | 75% |

Hadur died in 570 of 700 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 173 | 30% | 251 |
| bvh.mini.Freya 0.55 | 100 | 18% | 114 |
| bts.mega.Gnarly 1.4 | 82 | 14% | 92 |
| cs.Wren 1.0 | 75 | 13% | 82 |
| davidalves.net.DuelistNanoMelee 1.01 | 66 | 12% | 74 |
| kdf.KoulDestroyer 1.0 | 44 | 8% | 48 |
| kawigi.spare.SpareParts 0.7.6nosnd | 17 | 3% | 23 |
| bzdp.BoxCar 2.0 | 7 | 1% | 7 |
| matt.UnderDark3 2.4.34 | 6 | 1% | 9 |

## Melee bench: F39

hadur117.nano.SanaroB320 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 71.6 | 83 / 700 | 3.27 | 13.1% | 38107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.3 | 17.9% | 186 |
| az.Ololobot 0.2.4 | 1.7 | 16.8% | 323 |
| hadur117.nano.SanaroB320 0.3 | 3.1 | 13.1% | 83 |
| stelo.SoRobotNanoMelee 1.2 | 4.1 | 11.5% | 75 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.4% | 11 |
| apollokidd.ApolloKidd 0.9 | 5.8 | 9.6% | 10 |
| gimp.GimpBot 0.1 | 6.4 | 8.9% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.2 | 6.8% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.9 | 6.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 53.2 | 64.6 | 2 / 35 | 1822 |
| 2 | 3 | 56.5 | 74.6 | 3 / 35 | 1913 |
| 3 | 3 | 56.9 | 73.9 | 6 / 35 | 1794 |
| 4 | 3 | 56.4 | 72.5 | 5 / 35 | 1994 |
| 5 | 3 | 56.6 | 75.0 | 3 / 35 | 2106 |
| 6 | 3 | 56.7 | 75.4 | 2 / 35 | 1605 |
| 7 | 3 | 56.0 | 72.9 | 2 / 35 | 1614 |
| 8 | 3 | 55.5 | 69.6 | 5 / 35 | 1798 |
| 9 | 3 | 57.3 | 75.4 | 5 / 35 | 1874 |
| 10 | 3 | 57.8 | 72.5 | 5 / 35 | 2389 |
| 11 | 3 | 55.0 | 66.8 | 2 / 35 | 2306 |
| 12 | 3 | 56.8 | 74.3 | 3 / 35 | 1877 |
| 13 | 3 | 58.4 | 76.4 | 9 / 35 | 1855 |
| 14 | 3 | 54.1 | 67.5 | 3 / 35 | 1708 |
| 15 | 3 | 55.8 | 71.8 | 4 / 35 | 1663 |
| 16 | 3 | 55.1 | 65.0 | 5 / 35 | 2207 |
| 17 | 4 | 53.9 | 64.6 | 5 / 35 | 1684 |
| 18 | 3 | 58.0 | 77.5 | 3 / 35 | 2000 |
| 19 | 3 | 55.7 | 66.8 | 5 / 35 | 2097 |
| 20 | 3 | 57.1 | 75.4 | 6 / 35 | 1801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 196 | 8% |
| bvh.fry.Freya 0.82 | 107 | 24% |
| stelo.SoRobotNanoMelee 1.2 | 44 | 45% |
| winamp32.micro.MicroMacro 1.0 | 12 | 92% |
| gimp.GimpBot 0.1 | 8 | 75% |
| apollokidd.ApolloKidd 0.9 | 5 | 60% |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 67% |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 0% |

Hadur died in 618 of 700 rounds, at a mean tick of 1553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 216 | 35% | 231 |
| bvh.fry.Freya 0.82 | 210 | 34% | 233 |
| stelo.SoRobotNanoMelee 1.2 | 82 | 13% | 96 |
| apollokidd.ApolloKidd 0.9 | 45 | 7% | 49 |
| gimp.GimpBot 0.1 | 20 | 3% | 31 |
| dcs.Eater_of_Worlds 1.1.3-A | 20 | 3% | 21 |
| winamp32.micro.MicroMacro 1.0 | 15 | 2% | 26 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 2% | 13 |

## Melee bench: F41

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 76.7 | 265 / 700 | 3.10 | 13.6% | 34933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.8% | 261 |
| hadur117.nano.SanaroB320 0.3 | 2.8 | 13.6% | 265 |
| ary.Swarm 1.1 | 3.2 | 13.5% | 50 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 13.3% | 63 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.8% | 43 |
| shrub.Silver v048 | 6.3 | 8.9% | 6 |
| zyx.nano.Ant 1.1 | 6.8 | 8.1% | 2 |
| jsal.Jsalbot 1.0 | 8.5 | 5.8% | 9 |
| stelo.Mirror 1.1 | 8.6 | 5.6% | 3 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 85.7 | 18 / 35 | 1346 |
| 2 | 2 | 61.6 | 77.8 | 13 / 35 | 2177 |
| 3 | 3 | 60.2 | 76.2 | 11 / 35 | 1599 |
| 4 | 2 | 62.1 | 79.4 | 18 / 35 | 1491 |
| 5 | 4 | 58.4 | 67.6 | 12 / 35 | 1891 |
| 6 | 2 | 59.8 | 74.3 | 15 / 35 | 1595 |
| 7 | 4 | 58.8 | 71.7 | 9 / 35 | 1866 |
| 8 | 5 | 58.9 | 68.9 | 13 / 35 | 1876 |
| 9 | 2 | 59.5 | 74.0 | 12 / 35 | 1763 |
| 10 | 4 | 59.6 | 74.6 | 11 / 35 | 1598 |
| 11 | 2 | 62.0 | 80.6 | 12 / 35 | 2051 |
| 12 | 2 | 62.4 | 79.4 | 18 / 35 | 1918 |
| 13 | 4 | 61.5 | 79.7 | 11 / 35 | 1774 |
| 14 | 2 | 61.2 | 81.3 | 11 / 35 | 1621 |
| 15 | 3 | 61.0 | 77.8 | 11 / 35 | 1841 |
| 16 | 2 | 60.8 | 76.5 | 13 / 35 | 2019 |
| 17 | 3 | 60.1 | 72.7 | 14 / 35 | 1904 |
| 18 | 2 | 62.5 | 82.2 | 15 / 35 | 1547 |
| 19 | 2 | 60.2 | 76.8 | 14 / 35 | 1650 |
| 20 | 4 | 60.3 | 77.1 | 14 / 35 | 1406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 223 | 56% |
| lessonz.robocode.Oz 0.5.0 | 66 | 76% |
| ary.Swarm 1.1 | 55 | 82% |
| simonton.nano.MeleeSeed 1.8 | 38 | 84% |
| shrub.Silver v048 | 9 | 67% |
| jsal.Jsalbot 1.0 | 7 | 71% |
| stelo.Mirror 1.1 | 4 | 50% |
| zyx.nano.Ant 1.1 | 2 | 50% |

Hadur died in 435 of 700 rounds, at a mean tick of 1182. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 164 | 38% | 284 |
| ary.Swarm 1.1 | 91 | 21% | 139 |
| lessonz.robocode.Oz 0.5.0 | 68 | 16% | 105 |
| simonton.nano.MeleeSeed 1.8 | 44 | 10% | 83 |
| zyx.nano.Ant 1.1 | 26 | 6% | 27 |
| shrub.Silver v048 | 24 | 6% | 29 |
| stelo.Mirror 1.1 | 11 | 3% | 16 |
| jsal.Jsalbot 1.0 | 4 | 1% | 13 |
| acogdev.alpha 0.2 | 3 | 1% | 3 |

## Melee bench: F42

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 76.7 | 185 / 700 | 3.09 | 13.4% | 43491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.5% | 308 |
| ara.Shera 0.88 | 2.8 | 14.1% | 115 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.4% | 68 |
| hadur117.nano.SanaroB320 0.3 | 3.5 | 13.4% | 185 |
| amz.NanoClone 1.41 | 5.1 | 9.4% | 7 |
| maribo.IotaCT 1.1 | 6.3 | 7.6% | 3 |
| dsw.StaticD 1.0 | 7.0 | 6.9% | 13 |
| stelo.MirrorMicro 1.0 | 8.5 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 74.9 | 6 / 35 | 2070 |
| 2 | 2 | 61.2 | 81.3 | 10 / 35 | 2314 |
| 3 | 4 | 58.6 | 73.7 | 9 / 35 | 1931 |
| 4 | 3 | 62.0 | 80.0 | 13 / 35 | 2520 |
| 5 | 4 | 61.3 | 80.3 | 9 / 35 | 2257 |
| 6 | 4 | 58.7 | 74.3 | 6 / 35 | 2088 |
| 7 | 4 | 58.9 | 73.3 | 8 / 35 | 2101 |
| 8 | 3 | 59.9 | 76.2 | 10 / 35 | 1998 |
| 9 | 4 | 58.2 | 70.5 | 9 / 35 | 2197 |
| 10 | 4 | 59.0 | 75.6 | 3 / 35 | 2262 |
| 11 | 2 | 61.2 | 80.3 | 12 / 35 | 2028 |
| 12 | 3 | 60.3 | 79.4 | 10 / 35 | 1901 |
| 13 | 4 | 59.9 | 74.0 | 12 / 35 | 2278 |
| 14 | 3 | 60.0 | 73.7 | 11 / 35 | 2611 |
| 15 | 3 | 60.0 | 75.6 | 10 / 35 | 2202 |
| 16 | 3 | 62.3 | 82.2 | 13 / 35 | 2160 |
| 17 | 4 | 59.2 | 74.0 | 9 / 35 | 1976 |
| 18 | 3 | 61.7 | 83.2 | 11 / 35 | 2048 |
| 19 | 4 | 59.3 | 74.3 | 5 / 35 | 2345 |
| 20 | 4 | 60.8 | 78.4 | 9 / 35 | 2204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 186 | 35% |
| ara.Shera 0.88 | 87 | 57% |
| maribo.mini.MiniQuester 0.1 | 73 | 77% |
| dsw.StaticD 1.0 | 7 | 86% |
| amz.NanoClone 1.41 | 6 | 50% |
| maribo.IotaCT 1.1 | 4 | 75% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% |

Hadur died in 515 of 700 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 208 | 40% | 275 |
| ara.Shera 0.88 | 128 | 25% | 176 |
| maribo.mini.MiniQuester 0.1 | 104 | 20% | 159 |
| amz.NanoClone 1.41 | 39 | 8% | 42 |
| maribo.IotaCT 1.1 | 16 | 3% | 20 |
| stelo.MirrorMicro 1.0 | 8 | 2% | 9 |
| mme.NikeEnhanced 2.0 | 6 | 1% | 7 |
| dsw.StaticD 1.0 | 4 | 1% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 0% | 2 |

## Melee bench: F43

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 20 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 66.6 | 72 / 700 | 4.00 | 11.1% | 32082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.1% | 533 |
| brainfade.melee.Dusk 0.44 | 2.6 | 12.8% | 52 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 17 |
| hadur117.nano.SanaroB320 0.3 | 4.3 | 11.1% | 72 |
| wcsv.melee.EngineerMelee 0.1 | 4.4 | 11.2% | 17 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 10.0% | 9 |
| mz.NanoGod 2.02 | 7.2 | 8.1% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.8% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.6 | 71.7 | 3 / 35 | 1684 |
| 2 | 2 | 59.8 | 74.0 | 4 / 35 | 1761 |
| 3 | 6 | 54.6 | 60.6 | 2 / 35 | 1466 |
| 4 | 4 | 58.5 | 72.1 | 3 / 35 | 1588 |
| 5 | 4 | 58.6 | 70.5 | 7 / 35 | 1309 |
| 6 | 5 | 57.9 | 67.9 | 4 / 35 | 1778 |
| 7 | 6 | 53.8 | 57.8 | 1 / 35 | 1630 |
| 8 | 5 | 56.1 | 63.2 | 4 / 35 | 1454 |
| 9 | 3 | 58.3 | 69.5 | 6 / 35 | 1446 |
| 10 | 5 | 54.6 | 60.0 | 1 / 35 | 1659 |
| 11 | 4 | 58.2 | 69.5 | 3 / 35 | 1495 |
| 12 | 5 | 56.7 | 65.7 | 2 / 35 | 1750 |
| 13 | 2 | 61.5 | 78.1 | 7 / 35 | 1744 |
| 14 | 5 | 56.9 | 65.7 | 5 / 35 | 1479 |
| 15 | 4 | 55.5 | 62.5 | 3 / 35 | 1575 |
| 16 | 6 | 56.3 | 62.2 | 5 / 35 | 1673 |
| 17 | 4 | 56.3 | 64.1 | 3 / 35 | 1723 |
| 18 | 4 | 57.7 | 66.3 | 4 / 35 | 1728 |
| 19 | 6 | 55.5 | 61.6 | 3 / 35 | 1521 |
| 20 | 3 | 57.9 | 69.2 | 2 / 35 | 1619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 190 | 21% |
| brainfade.melee.Dusk 0.44 | 30 | 63% |
| dummy.micro.Sparrow 2.5 | 10 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 100% |
| Krabb.akim2.Akim2 1.1b | 4 | 50% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 628 of 700 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 319 | 51% | 357 |
| brainfade.melee.Dusk 0.44 | 87 | 14% | 108 |
| wcsv.melee.EngineerMelee 0.1 | 71 | 11% | 75 |
| dummy.micro.Sparrow 2.5 | 70 | 11% | 76 |
| mz.NanoGod 2.02 | 29 | 5% | 28 |
| jab.DiamondStealer 5 | 25 | 4% | 25 |
| Krabb.akim2.Akim2 1.1b | 24 | 4% | 28 |
| cvt.Firsty 1.0 | 3 | 0% | 3 |

## Melee bench: F44

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 76.1 | 225 / 700 | 3.15 | 13.8% | 46269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.3 | 17.0% | 241 |
| tzu.TheArtOfWar 1.2 | 1.8 | 15.8% | 179 |
| hadur117.nano.SanaroB320 0.3 | 3.0 | 13.8% | 225 |
| wompi.Quokka 1.6 | 4.5 | 10.7% | 14 |
| jwirde.Gort 2.0 | 4.6 | 10.6% | 32 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.2% | 5 |
| disan.Chair 2.2.0 | 7.3 | 7.4% | 6 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.5% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.5% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.5 | 63.2 | 8 / 35 | 2113 |
| 2 | 4 | 58.2 | 67.6 | 11 / 35 | 2222 |
| 3 | 2 | 60.6 | 74.6 | 11 / 35 | 2239 |
| 4 | 3 | 60.5 | 77.8 | 8 / 35 | 2036 |
| 5 | 3 | 59.9 | 74.9 | 7 / 35 | 2327 |
| 6 | 3 | 60.5 | 76.5 | 10 / 35 | 1974 |
| 7 | 3 | 62.5 | 81.0 | 13 / 35 | 2167 |
| 8 | 3 | 62.0 | 77.5 | 13 / 35 | 2369 |
| 9 | 3 | 61.7 | 75.9 | 12 / 35 | 2633 |
| 10 | 3 | 62.3 | 79.0 | 13 / 35 | 2307 |
| 11 | 3 | 62.2 | 81.0 | 12 / 35 | 2342 |
| 12 | 3 | 60.7 | 75.9 | 11 / 35 | 2292 |
| 13 | 3 | 62.9 | 80.6 | 14 / 35 | 2595 |
| 14 | 3 | 62.3 | 76.8 | 14 / 35 | 2614 |
| 15 | 3 | 60.7 | 74.3 | 12 / 35 | 2345 |
| 16 | 3 | 59.8 | 72.7 | 8 / 35 | 2448 |
| 17 | 3 | 63.1 | 81.9 | 13 / 35 | 2551 |
| 18 | 3 | 60.8 | 74.6 | 11 / 35 | 2334 |
| 19 | 3 | 60.6 | 76.2 | 9 / 35 | 2216 |
| 20 | 3 | 62.5 | 80.3 | 15 / 35 | 2145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 182 | 69% |
| tzu.TheArtOfWar 1.2 | 121 | 30% |
| jwirde.Gort 2.0 | 35 | 57% |
| wompi.Quokka 1.6 | 30 | 87% |
| disan.Chair 2.2.0 | 9 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |

Hadur died in 476 of 700 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 177 | 37% | 214 |
| stelo.Liblix 0.3.1 | 162 | 34% | 292 |
| jwirde.Gort 2.0 | 39 | 8% | 69 |
| wompi.Quokka 1.6 | 38 | 8% | 48 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 27 | 6% | 34 |
| stf.PanzerGeneral 0.1 | 15 | 3% | 19 |
| disan.Chair 2.2.0 | 11 | 2% | 16 |
| amk.jointstrike.JointStrike 0.2 | 4 | 1% | 4 |
| sample.Crazy 1.0 | 3 | 1% | 4 |

## Melee bench: F45

hadur117.nano.SanaroB320 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 79.6 | 215 / 700 | 2.84 | 14.7% | 49415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB320 0.3 | 1.2 | 14.7% | 215 |
| eem.IWillFireNoBullet v2.8 | 2.6 | 12.7% | 305 |
| jje.BagPuss 1.2 | 2.8 | 12.7% | 46 |
| sul.Lunar 1.1 | 4.4 | 11.0% | 62 |
| myl.nano.Graviton 1.10 | 4.4 | 11.2% | 22 |
| hvilela.HVilela 0.9 | 6.6 | 8.9% | 2 |
| fm.claire 1.7 | 7.1 | 8.5% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.3% | 17 |
| wit.Deep7 2.0 | 8.9 | 6.7% | 30 |
| abud.ThirdRobo 1.0 | 9.9 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 82.5 | 10 / 35 | 2288 |
| 2 | 1 | 60.3 | 76.8 | 10 / 35 | 2343 |
| 3 | 1 | 61.8 | 77.5 | 13 / 35 | 2776 |
| 4 | 1 | 61.4 | 78.4 | 10 / 35 | 2627 |
| 5 | 1 | 60.2 | 73.0 | 13 / 35 | 2509 |
| 6 | 1 | 63.9 | 85.4 | 13 / 35 | 2643 |
| 7 | 1 | 64.0 | 85.1 | 14 / 35 | 2610 |
| 8 | 1 | 58.8 | 73.0 | 6 / 35 | 2382 |
| 9 | 1 | 60.4 | 75.2 | 11 / 35 | 2592 |
| 10 | 1 | 61.4 | 78.4 | 10 / 35 | 2735 |
| 11 | 3 | 55.7 | 65.7 | 3 / 35 | 2268 |
| 12 | 1 | 63.9 | 87.3 | 12 / 35 | 2619 |
| 13 | 1 | 61.3 | 79.7 | 8 / 35 | 2492 |
| 14 | 1 | 62.6 | 84.1 | 11 / 35 | 2165 |
| 15 | 1 | 60.1 | 75.9 | 11 / 35 | 2183 |
| 16 | 1 | 63.0 | 81.6 | 13 / 35 | 2607 |
| 17 | 1 | 62.7 | 82.9 | 12 / 35 | 2558 |
| 18 | 1 | 62.8 | 84.4 | 13 / 35 | 2407 |
| 19 | 2 | 61.0 | 78.4 | 10 / 35 | 2409 |
| 20 | 1 | 63.0 | 86.3 | 12 / 35 | 2202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 262 | 48% |
| sul.Lunar 1.1 | 53 | 28% |
| jje.BagPuss 1.2 | 52 | 40% |
| wit.Deep7 2.0 | 24 | 46% |
| myl.nano.Graviton 1.10 | 23 | 83% |
| pez.mini.ChironexFleckeri 0.5 | 13 | 77% |
| hvilela.HVilela 0.9 | 7 | 86% |
| fm.claire 1.7 | 5 | 100% |

Hadur died in 491 of 700 rounds, at a mean tick of 1654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 148 | 30% | 0 |
| jje.BagPuss 1.2 | 105 | 21% | 227 |
| sul.Lunar 1.1 | 69 | 14% | 154 |
| myl.nano.Graviton 1.10 | 58 | 12% | 115 |
| hvilela.HVilela 0.9 | 35 | 7% | 53 |
| fm.claire 1.7 | 28 | 6% | 43 |
| wit.Deep7 2.0 | 21 | 4% | 54 |
| pez.mini.ChironexFleckeri 0.5 | 21 | 4% | 43 |
| abud.ThirdRobo 1.0 | 4 | 1% | 10 |
2 death(s) with no robot to name.

## Melee bench: F46

hadur117.nano.SanaroB320 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 78.5 | 170 / 700 | 2.72 | 14.7% | 39893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 22.0% | 415 |
| hadur117.nano.SanaroB320 0.3 | 2.2 | 14.7% | 170 |
| cx.Princess 1.0 | 3.4 | 13.0% | 71 |
| mz.MicroSheep 1.0 | 3.6 | 12.9% | 32 |
| sadoner.killer 0.2 | 5.1 | 10.6% | 6 |
| arthord.NanoSatanMelee Beta | 5.9 | 8.8% | 4 |
| jeremyreeder.collective.Prophet 5 | 7.0 | 7.5% | 1 |
| kurios.DOSexe .9a | 8.1 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 8.9 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 79.3 | 8 / 35 | 2078 |
| 2 | 2 | 61.3 | 76.4 | 13 / 35 | 2252 |
| 3 | 2 | 59.0 | 73.6 | 6 / 35 | 2248 |
| 4 | 2 | 59.4 | 78.6 | 6 / 35 | 1781 |
| 5 | 2 | 59.4 | 74.3 | 12 / 35 | 2040 |
| 6 | 3 | 59.1 | 77.1 | 6 / 35 | 1591 |
| 7 | 2 | 61.4 | 82.5 | 9 / 35 | 2103 |
| 8 | 2 | 59.0 | 77.1 | 7 / 35 | 1735 |
| 9 | 2 | 58.8 | 74.3 | 4 / 35 | 2101 |
| 10 | 2 | 59.9 | 78.9 | 9 / 35 | 1808 |
| 11 | 2 | 61.6 | 80.7 | 11 / 35 | 2153 |
| 12 | 2 | 61.6 | 80.0 | 11 / 35 | 2462 |
| 13 | 2 | 58.7 | 75.7 | 8 / 35 | 1921 |
| 14 | 2 | 60.2 | 78.9 | 8 / 35 | 1831 |
| 15 | 3 | 59.4 | 76.8 | 9 / 35 | 1916 |
| 16 | 2 | 61.0 | 80.7 | 11 / 35 | 2036 |
| 17 | 3 | 60.2 | 82.9 | 6 / 35 | 1702 |
| 18 | 2 | 61.6 | 83.2 | 9 / 35 | 2083 |
| 19 | 2 | 60.1 | 79.6 | 8 / 35 | 1937 |
| 20 | 2 | 60.2 | 78.6 | 9 / 35 | 2115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 327 | 37% |
| cx.Princess 1.0 | 44 | 55% |
| mz.MicroSheep 1.0 | 28 | 32% |
| arthord.NanoSatanMelee Beta | 8 | 88% |
| sadoner.killer 0.2 | 8 | 50% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 530 of 700 rounds, at a mean tick of 1197. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 323 | 61% | 451 |
| mz.MicroSheep 1.0 | 66 | 12% | 74 |
| cx.Princess 1.0 | 61 | 12% | 76 |
| sadoner.killer 0.2 | 39 | 7% | 46 |
| arthord.NanoSatanMelee Beta | 22 | 4% | 29 |
| jeremyreeder.collective.Prophet 5 | 13 | 2% | 14 |
| mbro.Detektor3 0.1.1 | 3 | 1% | 6 |
| kurios.DOSexe .9a | 3 | 1% | 4 |

