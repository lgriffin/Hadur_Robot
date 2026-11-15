# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1507304. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 183 over 6 battles (30.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.4 | 56 / 210 | 2.22 | 18.1% | 34760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.2 | 19.1% | 134 |
| hadur117.Hadur 3.21aa | 1.8 | 18.1% | 56 |
| sgp.JollyNinja 3.53 | 3.7 | 11.0% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.9% | 2 |
| mz.MicroGodMelee 1 | 4.7 | 10.4% | 5 |
| lorneswork.Predator 1.0 | 5.3 | 9.6% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.7% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.1 | 14 / 35 | 6091 |
| 2 | 2 | 67.6 | 86.3 | 8 / 35 | 5455 |
| 3 | 2 | 67.3 | 83.2 | 8 / 35 | 5683 |
| 4 | 2 | 68.4 | 88.3 | 9 / 35 | 5656 |
| 5 | 2 | 67.0 | 81.0 | 9 / 35 | 5813 |
| 6 | 2 | 68.7 | 87.6 | 8 / 35 | 6062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 15% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 86% |
| sgp.JollyNinja 3.53 | 14 | 64% |
| mz.MicroGodMelee 1 | 13 | 85% |
| lorneswork.Predator 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 2 | 50% |

Hadur died in 154 of 210 rounds, at a mean tick of 1166. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 111 | 72% | 130 |
| lorneswork.Predator 1.0 | 14 | 9% | 19 |
| sgp.JollyNinja 3.53 | 10 | 6% | 19 |
| mz.MicroGodMelee 1 | 7 | 5% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 13 |
| adt.Ar2 1.0 | 5 | 3% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 4 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 130677 melee ticks, 94622 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 41 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 41820 sent, 36899 reached their opponent, 7208 virtual hits (19.5% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1498084. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 6 battles (33.2 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.1 | 100 / 210 | 2.34 | 18.7% | 31269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.7% | 100 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 15.0% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.4% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.0% | 12 |
| Noran.BitchingElk 0.054 | 6.7 | 7.9% | 15 |
| sch.Simone 0.3d | 6.8 | 8.0% | 12 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.8% | 0 |
| stelo.PatternRobot 1.0 | 9.0 | 5.2% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.3 | 17 / 35 | 5333 |
| 2 | 1 | 68.3 | 84.4 | 17 / 35 | 5081 |
| 3 | 1 | 66.6 | 82.2 | 13 / 35 | 4654 |
| 4 | 1 | 69.5 | 87.0 | 18 / 35 | 5597 |
| 5 | 1 | 68.6 | 85.1 | 18 / 35 | 5227 |
| 6 | 1 | 68.5 | 83.5 | 17 / 35 | 5377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 63 | 62% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 75% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 60% |
| Noran.BitchingElk 0.054 | 12 | 50% |
| sch.Simone 0.3d | 10 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 33 | 30% | 75 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 23% | 53 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 14% | 24 |
| sch.Simone 0.3d | 15 | 14% | 20 |
| Noran.BitchingElk 0.054 | 10 | 9% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 5% | 15 |
| stelo.PatternRobot 1.0 | 4 | 4% | 4 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 4 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 159602 melee ticks, 42630 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 64 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 55198 sent, 50467 reached their opponent, 8066 virtual hits (16.0% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1500504. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 95.2 | 183 / 210 | 1.43 | 21.9% | 41667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.9% | 183 |
| radnor.DoctorBob 1.42 | 2.3 | 13.9% | 10 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.2% | 8 |
| vuen.Cake 2.51 | 3.7 | 12.1% | 9 |
| urdos.URDOS 1.3 | 5.0 | 8.9% | 0 |
| adt.Ar1 2.1 | 6.0 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.0 | 29 / 35 | 6823 |
| 2 | 1 | 73.0 | 96.5 | 32 / 35 | 7145 |
| 3 | 1 | 72.1 | 95.6 | 29 / 35 | 6668 |
| 4 | 1 | 72.6 | 94.9 | 31 / 35 | 7122 |
| 5 | 1 | 71.1 | 91.7 | 29 / 35 | 6628 |
| 6 | 1 | 73.6 | 98.7 | 33 / 35 | 7281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 63 | 94% |
| kawigi.nano.Lib 1.0 | 62 | 94% |
| radnor.DoctorBob 1.42 | 61 | 98% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 9 | 33% | 72 |
| kawigi.nano.Lib 1.0 | 7 | 26% | 48 |
| urdos.URDOS 1.3 | 4 | 15% | 9 |
| radnor.DoctorBob 1.42 | 2 | 7% | 50 |
| adt.Ar1 2.1 | 2 | 7% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 7% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 4% | 5 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 124475 melee ticks, 45265 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 66 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 37157 sent, 32447 reached their opponent, 8133 virtual hits (25.1% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492717. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 115 over 6 battles (19.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.1 | 44 / 210 | 2.07 | 18.9% | 38155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.6% | 152 |
| hadur117.Hadur 3.21aa | 2.0 | 18.9% | 44 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 8 |
| josago.Jorgito 0.16 | 5.0 | 9.0% | 1 |
| css.Delitioner 0.11 | 6.8 | 6.7% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 7.2 | 5.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.7% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.1 | 88.6 | 10 / 35 | 6345 |
| 2 | 2 | 68.9 | 86.0 | 5 / 35 | 6124 |
| 3 | 2 | 70.8 | 90.2 | 5 / 35 | 6808 |
| 4 | 2 | 68.5 | 83.5 | 7 / 35 | 6040 |
| 5 | 2 | 70.6 | 90.5 | 10 / 35 | 6398 |
| 6 | 2 | 70.4 | 89.8 | 7 / 35 | 6440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 147 | 14% |
| apc.LeeroyJenkins2 1.0 | 14 | 79% |
| TNT.TNT 0.99.1 | 14 | 50% |
| josago.Jorgito 0.16 | 3 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 1363. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 132 | 79% | 156 |
| apc.LeeroyJenkins2 1.0 | 13 | 8% | 24 |
| TNT.TNT 0.99.1 | 11 | 7% | 18 |
| josago.Jorgito 0.16 | 8 | 5% | 10 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 180953 melee ticks, 91668 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 79 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 55275 sent, 50539 reached their opponent, 7061 virtual hits (14.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489642. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 6 battles (22.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 76.7 | 33 / 210 | 3.10 | 15.2% | 24833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.6% | 116 |
| justin.DemonicRage 3.4 | 2.0 | 16.6% | 48 |
| hadur117.Hadur 3.21aa | 3.0 | 15.2% | 33 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 9 |
| axeBots.HataMoto 3.09 | 5.5 | 9.2% | 3 |
| ms.Ares 0.19 | 5.5 | 9.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.6% | 1 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 3.8% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.2 | 77.5 | 7 / 35 | 4464 |
| 2 | 3 | 64.3 | 78.4 | 6 / 35 | 3843 |
| 3 | 3 | 64.2 | 78.1 | 3 / 35 | 4006 |
| 4 | 3 | 65.5 | 79.0 | 7 / 35 | 4306 |
| 5 | 3 | 62.3 | 69.5 | 6 / 35 | 4065 |
| 6 | 3 | 64.3 | 77.5 | 4 / 35 | 4149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 33 | 36% |
| cb.fire.Firestarter 2.0f | 29 | 3% |
| wompi.Numbat 2.1 | 16 | 88% |
| axeBots.HataMoto 3.09 | 5 | 80% |
| ms.Ares 0.19 | 2 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 0% |

Hadur died in 177 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 63 | 36% | 74 |
| cb.fire.Firestarter 2.0f | 62 | 35% | 65 |
| wompi.Numbat 2.1 | 29 | 16% | 43 |
| axeBots.HataMoto 3.09 | 10 | 6% | 13 |
| ms.Ares 0.19 | 9 | 5% | 11 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 144709 melee ticks, 28970 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 74 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44832 sent, 39816 reached their opponent, 6408 virtual hits (16.1% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484246. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.0 | 150 / 210 | 1.63 | 20.8% | 34967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.8% | 150 |
| jekl.StoneGhost 0.7 | 2.3 | 14.2% | 15 |
| origin.SleepSiphon 1.7b | 2.7 | 13.7% | 31 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.2% | 13 |
| mld.Wisdom 1.0 | 5.3 | 9.9% | 0 |
| gg.Wolverine 2.0 | 5.7 | 8.9% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.4% | 1 |
| spinnercat.Omen 1.0 | 7.8 | 6.0% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.6% | 0 |
| sample.Fire 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.4 | 22 / 35 | 5702 |
| 2 | 1 | 72.3 | 94.0 | 28 / 35 | 6230 |
| 3 | 1 | 71.0 | 93.0 | 23 / 35 | 5717 |
| 4 | 1 | 70.5 | 90.2 | 21 / 35 | 5585 |
| 5 | 1 | 72.3 | 95.2 | 28 / 35 | 5888 |
| 6 | 1 | 72.1 | 94.3 | 28 / 35 | 5845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 64 | 81% |
| jekl.StoneGhost 0.7 | 55 | 93% |
| pe.minimelee.SandboxMiniMelee 1.1 | 37 | 89% |
| gg.Wolverine 2.0 | 12 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 0% |

Hadur died in 65 of 210 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 27 | 42% | 79 |
| jekl.StoneGhost 0.7 | 18 | 28% | 56 |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 12% | 37 |
| mld.Wisdom 1.0 | 3 | 5% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 5 |
| gg.Wolverine 2.0 | 2 | 3% | 13 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 149521 melee ticks, 48262 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 53 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44787 sent, 39860 reached their opponent, 8260 virtual hits (20.7% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493840. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 112 over 6 battles (18.7 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.5 | 95.6 | 160 / 210 | 1.35 | 26.1% | 47831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 26.1% | 160 |
| rtk.Tachikoma 1.0 | 2.0 | 18.9% | 28 |
| oog.melee.CapuletDroid 1.1 | 3.3 | 12.6% | 9 |
| franzor.Lizt 1.3.1 | 3.7 | 12.3% | 13 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.2% | 1 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.8% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 5.7% | 0 |
| sample.Target 1.0 | 8.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 8.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 76.0 | 97.1 | 29 / 35 | 8022 |
| 2 | 1 | 74.8 | 93.9 | 24 / 35 | 7731 |
| 3 | 1 | 75.6 | 95.0 | 27 / 35 | 7975 |
| 4 | 1 | 74.8 | 93.9 | 23 / 35 | 7825 |
| 5 | 1 | 75.7 | 96.1 | 28 / 35 | 8051 |
| 6 | 1 | 76.2 | 97.5 | 29 / 35 | 8227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 125 | 82% |
| oog.melee.CapuletDroid 1.1 | 39 | 90% |
| franzor.Lizt 1.3.1 | 30 | 67% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 1607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 31 | 62% | 131 |
| franzor.Lizt 1.3.1 | 11 | 22% | 4 |
| oog.melee.CapuletDroid 1.1 | 6 | 12% | 60 |
| exauge.GateKeeper 1.1.121g | 2 | 4% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 7 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 183411 melee ticks, 87521 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 39 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50094 sent, 45948 reached their opponent, 9380 virtual hits (20.4% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480784. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 278 over 6 battles (46.3 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.3 | 150 / 210 | 1.62 | 22.9% | 32287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.9% | 150 |
| tm.Yuugao 1.0 | 2.5 | 14.6% | 29 |
| shrub.Vapour v159 | 2.7 | 14.1% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 4.2 | 11.4% | 9 |
| jwst.DAD.DarkAndDarker 1.1 | 5.0 | 9.9% | 5 |
| m3thos.Eva00 1.1 | 5.7 | 9.8% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.2 | 6.8% | 0 |
| SHAM.WOW 1.4 | 8.0 | 5.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 96.1 | 27 / 35 | 5975 |
| 2 | 1 | 70.5 | 93.6 | 24 / 35 | 5076 |
| 3 | 1 | 70.7 | 89.6 | 24 / 35 | 5413 |
| 4 | 1 | 70.8 | 91.4 | 26 / 35 | 4988 |
| 5 | 1 | 70.9 | 89.6 | 24 / 35 | 5479 |
| 6 | 1 | 71.3 | 93.2 | 25 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 69 | 80% |
| shrub.Vapour v159 | 51 | 86% |
| com.spp.robocode.MostlyHarmless 010 | 28 | 89% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 80% |
| m3thos.Eva00 1.1 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 21 | 35% | 71 |
| shrub.Vapour v159 | 12 | 20% | 55 |
| com.spp.robocode.MostlyHarmless 010 | 12 | 20% | 38 |
| m3thos.Eva00 1.1 | 8 | 13% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 10% | 26 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 2 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 3 |
| SHAM.WOW 1.4 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 143688 melee ticks, 48422 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 47 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42321 sent, 38061 reached their opponent, 6668 virtual hits (17.5% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476942. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 6 battles (24.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.9 | 60 / 210 | 2.90 | 16.1% | 23727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.5% | 94 |
| hadur117.Hadur 3.21aa | 1.8 | 16.1% | 60 |
| kc.micro.Figment 1.0 | 3.0 | 14.2% | 28 |
| pedersen.Grishnakh 1.0 | 4.0 | 11.4% | 14 |
| yagami.Tidus 0.11 | 5.2 | 10.1% | 1 |
| mc2.enemy.Original 0.9 | 5.8 | 9.3% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.0 | 4.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 73.0 | 6 / 35 | 3357 |
| 2 | 1 | 68.0 | 87.9 | 16 / 35 | 4330 |
| 3 | 2 | 65.4 | 80.3 | 7 / 35 | 4014 |
| 4 | 2 | 65.9 | 81.9 | 10 / 35 | 4049 |
| 5 | 2 | 65.4 | 79.4 | 12 / 35 | 4002 |
| 6 | 2 | 63.2 | 71.1 | 9 / 35 | 3975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 58 | 33% |
| kc.micro.Figment 1.0 | 37 | 76% |
| pedersen.Grishnakh 1.0 | 12 | 58% |
| mc2.enemy.Original 0.9 | 5 | 0% |
| yagami.Tidus 0.11 | 4 | 100% |
| dft.Calliope 5.6 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 70 | 47% | 88 |
| kc.micro.Figment 1.0 | 25 | 17% | 49 |
| pedersen.Grishnakh 1.0 | 17 | 11% | 18 |
| mc2.enemy.Original 0.9 | 16 | 11% | 21 |
| yagami.Tidus 0.11 | 9 | 6% | 14 |
| dft.Calliope 5.6 | 7 | 5% | 10 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 6 |
| step.nanoPri 1.0 | 2 | 1% | 4 |

Posture (Hadur's M records, 200 rounds): 145815 melee ticks, 35817 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 47179 sent, 42556 reached their opponent, 5855 virtual hits (13.8% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491981. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 228 over 6 battles (38.0 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 96.6 | 176 / 210 | 1.30 | 21.5% | 36961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.5% | 176 |
| DTF.Kludgy 1.2b | 2.3 | 13.9% | 15 |
| ne.Chimera 1.2 | 2.7 | 13.0% | 4 |
| ejb.Polaris 1.0.1 | 4.2 | 12.0% | 9 |
| vStar.RAFzilla 2.15 | 5.3 | 10.3% | 2 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.1% | 2 |
| kurios.DOSexe .9b | 7.5 | 5.4% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.0% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 97.1 | 30 / 35 | 6059 |
| 2 | 1 | 72.0 | 94.9 | 29 / 35 | 6089 |
| 3 | 1 | 72.4 | 97.1 | 29 / 35 | 6224 |
| 4 | 1 | 72.5 | 95.9 | 30 / 35 | 6315 |
| 5 | 1 | 72.2 | 97.1 | 27 / 35 | 6060 |
| 6 | 1 | 72.4 | 97.5 | 31 / 35 | 6214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 59 | 76% |
| ejb.Polaris 1.0.1 | 57 | 89% |
| ne.Chimera 1.2 | 35 | 97% |
| vStar.RAFzilla 2.15 | 25 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| donjezza.Muncho 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 2 | 50% |
| sam.Samspin 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 14 | 39% | 50 |
| ejb.Polaris 1.0.1 | 9 | 25% | 62 |
| ne.Chimera 1.2 | 6 | 17% | 41 |
| vStar.RAFzilla 2.15 | 2 | 6% | 27 |
| donjezza.Muncho 1.0 | 2 | 6% | 3 |
| kurios.DOSexe .9b | 1 | 3% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 3% | 3 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 12 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 140006 melee ticks, 58059 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 96 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44907 sent, 40103 reached their opponent, 7209 virtual hits (18.0% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489218. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.3 | 68 / 210 | 2.69 | 16.4% | 23971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.5 | 16.4% | 68 |
| rz.Aleph 0.34 | 1.5 | 16.6% | 75 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.2% | 24 |
| djc.DynaBot 0.1.1 | 4.0 | 10.9% | 14 |
| rdt199.Warlord 0.73 | 5.3 | 8.8% | 12 |
| br2.MobyDickBot 1.6 | 6.7 | 8.1% | 9 |
| uji.YellohFellah 1.0 | 6.8 | 8.1% | 9 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.4% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 84.8 | 14 / 35 | 4246 |
| 2 | 2 | 64.0 | 78.7 | 10 / 35 | 3673 |
| 3 | 1 | 64.8 | 81.3 | 9 / 35 | 4107 |
| 4 | 2 | 65.9 | 81.9 | 15 / 35 | 4034 |
| 5 | 1 | 64.5 | 81.0 | 9 / 35 | 4097 |
| 6 | 2 | 64.5 | 80.0 | 11 / 35 | 3814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 56 | 43% |
| cx.mini.Nimrod 0.55 | 24 | 54% |
| djc.DynaBot 0.1.1 | 22 | 73% |
| rdt199.Warlord 0.73 | 10 | 70% |
| br2.MobyDickBot 1.6 | 10 | 30% |
| uji.YellohFellah 1.0 | 5 | 80% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 57 | 40% | 86 |
| cx.mini.Nimrod 0.55 | 24 | 17% | 34 |
| rdt199.Warlord 0.73 | 15 | 10% | 24 |
| djc.DynaBot 0.1.1 | 13 | 9% | 26 |
| br2.MobyDickBot 1.6 | 11 | 8% | 12 |
| uji.YellohFellah 1.0 | 8 | 6% | 12 |
| stelo.MirrorNano 1.3 | 6 | 4% | 7 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 3% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 158245 melee ticks, 34387 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49539 sent, 44520 reached their opponent, 5986 virtual hits (13.4% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487330. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.9 | 139 / 210 | 1.90 | 19.1% | 25726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.1% | 139 |
| bts.wiki.RipCurl 0.9b | 2.2 | 13.7% | 31 |
| nat.PallasHawk 1.0 | 3.2 | 12.5% | 21 |
| darkcanuck.Leon 1.01 | 3.8 | 12.1% | 9 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 7 |
| jrm.Test0 1.0 | 5.8 | 8.9% | 1 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.8% | 0 |
| jp.Perpy 16.0 | 7.7 | 6.5% | 1 |
| stuff.Vlad 0.1 | 8.8 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.8 | 20 / 35 | 4197 |
| 2 | 1 | 71.4 | 97.1 | 28 / 35 | 4708 |
| 3 | 1 | 67.7 | 86.7 | 22 / 35 | 4165 |
| 4 | 1 | 68.8 | 89.5 | 23 / 35 | 4315 |
| 5 | 1 | 68.0 | 86.3 | 20 / 35 | 4428 |
| 6 | 1 | 68.7 | 90.2 | 26 / 35 | 3913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 47 | 79% |
| bts.wiki.RipCurl 0.9b | 46 | 80% |
| darkcanuck.Leon 1.01 | 41 | 88% |
| brainfade.melee.Genghis 0.36 | 17 | 82% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jp.Perpy 16.0 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jrm.Test0 1.0 | 2 | 50% |

Hadur died in 72 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 25 | 35% | 54 |
| nat.PallasHawk 1.0 | 16 | 22% | 47 |
| brainfade.melee.Genghis 0.36 | 11 | 15% | 25 |
| jrm.Test0 1.0 | 9 | 13% | 17 |
| darkcanuck.Leon 1.01 | 7 | 10% | 52 |
| jp.Perpy 16.0 | 3 | 4% | 7 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |
| cs.sheldor.Talon 1.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 126336 melee ticks, 39605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 49 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 42704 sent, 37640 reached their opponent, 5993 virtual hits (15.9% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1499666. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.5 | 54 / 210 | 2.75 | 16.0% | 26721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.3% | 86 |
| ags.Glacier 0.2.11 | 1.8 | 16.5% | 43 |
| hadur117.Hadur 3.21aa | 2.3 | 16.0% | 54 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.9% | 11 |
| shinh.Entangled 0.3 | 4.7 | 11.4% | 16 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 0 |
| maribo.FollowFire 1 | 8.3 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 82.5 | 9 / 35 | 4344 |
| 2 | 3 | 65.1 | 78.7 | 9 / 35 | 4383 |
| 3 | 3 | 65.0 | 77.8 | 9 / 35 | 4618 |
| 4 | 3 | 64.9 | 79.7 | 7 / 35 | 4458 |
| 5 | 1 | 65.5 | 82.2 | 10 / 35 | 4277 |
| 6 | 2 | 66.4 | 82.2 | 10 / 35 | 4641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 50 | 64% |
| mn.Combat 3.25.0 | 40 | 18% |
| shinh.Entangled 0.3 | 17 | 53% |
| gh.micro.Gruweltje 0.7 | 9 | 56% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 54 | 35% | 63 |
| ags.Glacier 0.2.11 | 49 | 31% | 76 |
| shinh.Entangled 0.3 | 22 | 14% | 30 |
| gh.micro.Gruweltje 0.7 | 18 | 12% | 25 |
| stelo.Wang 1.0 | 5 | 3% | 8 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |

Posture (Hadur's M records, 201 rounds): 142753 melee ticks, 35148 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 69 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 41208 sent, 35997 reached their opponent, 5587 virtual hits (15.5% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487940. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 97.3 | 190 / 210 | 1.22 | 24.8% | 39443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 24.8% | 190 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.6% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 3.8 | 10.7% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 3.8 | 11.1% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 10.1% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.7% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.7% | 5 |
| pa.Improved 1.0 | 8.0 | 6.6% | 1 |
| sample.TrackFire 1.0 | 9.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 99.6 | 34 / 35 | 6425 |
| 2 | 1 | 72.9 | 96.1 | 29 / 35 | 6380 |
| 3 | 1 | 73.7 | 97.1 | 34 / 35 | 6483 |
| 4 | 1 | 73.8 | 96.8 | 32 / 35 | 6853 |
| 5 | 1 | 72.9 | 96.1 | 29 / 35 | 6532 |
| 6 | 1 | 73.9 | 97.9 | 32 / 35 | 6770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 122 | 98% |
| sanyi.mikrobi.Roberto 1.0 | 34 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 88% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 20 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 9 | 45% | 113 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 15% | 36 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 15% | 20 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 15% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 5% | 9 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 5% | 7 |
| pa.Improved 1.0 | 0 | 0% | 8 |

Posture (Hadur's M records, 198 rounds): 119733 melee ticks, 50128 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 30 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 34977 sent, 30871 reached their opponent, 7838 virtual hits (25.4% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1504003. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 6 battles (33.8 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.0 | 118 / 210 | 2.08 | 19.4% | 32890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.4% | 118 |
| emp.Yngwie 1.11 | 2.8 | 13.0% | 45 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.5% | 15 |
| mld.DustBunny 3.8 | 3.3 | 12.2% | 7 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.3% | 17 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.7% | 7 |
| lambdaxy.TBot 0.1 | 7.3 | 7.5% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.8% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.4% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.3 | 19 / 35 | 5506 |
| 2 | 1 | 70.0 | 88.6 | 21 / 35 | 5858 |
| 3 | 1 | 69.4 | 87.0 | 21 / 35 | 5507 |
| 4 | 1 | 69.9 | 91.4 | 20 / 35 | 5439 |
| 5 | 1 | 68.5 | 85.7 | 18 / 35 | 5303 |
| 6 | 1 | 69.3 | 88.3 | 19 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 53 | 60% |
| kawigi.micro.Shiz 1.1 | 34 | 97% |
| mld.DustBunny 3.8 | 29 | 90% |
| kawigi.robot.Girl 1.2 | 17 | 53% |
| cb.nano.Insomnia 1.0 | 12 | 92% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 39 | 42% | 84 |
| kawigi.robot.Girl 1.2 | 14 | 15% | 17 |
| cb.nano.Insomnia 1.0 | 12 | 13% | 15 |
| mld.DustBunny 3.8 | 11 | 12% | 39 |
| kawigi.micro.Shiz 1.1 | 10 | 11% | 35 |
| lambdaxy.TBot 0.1 | 5 | 5% | 9 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 6 |
| divineomega.TrialBot 0.003 | 0 | 0% | 5 |

Posture (Hadur's M records, 201 rounds): 157774 melee ticks, 47519 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 44 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51090 sent, 46088 reached their opponent, 7118 virtual hits (15.4% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1499018. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.1 | 131 / 210 | 1.71 | 21.0% | 37311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.0% | 131 |
| gh.Griezel 0.5.2 | 2.0 | 16.0% | 45 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.5% | 20 |
| bvh.fnr.Fenrir 0.36l | 4.7 | 9.7% | 2 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.6% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 6.9% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.6% | 1 |
| asd.Cthulhu 1.3 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.7 | 21 / 35 | 6108 |
| 2 | 1 | 70.9 | 91.1 | 21 / 35 | 5944 |
| 3 | 1 | 70.8 | 91.4 | 19 / 35 | 6045 |
| 4 | 1 | 73.3 | 95.9 | 24 / 35 | 6707 |
| 5 | 1 | 72.8 | 93.3 | 26 / 35 | 6752 |
| 6 | 1 | 70.5 | 88.9 | 20 / 35 | 5755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 88 | 67% |
| techdude.forest.FlamingForest 1.1 | 43 | 65% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 91% |
| bvh.fnr.Fenrir 0.36l | 9 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1294. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 35 | 44% | 97 |
| techdude.forest.FlamingForest 1.1 | 21 | 27% | 49 |
| bvh.fnr.Fenrir 0.36l | 9 | 11% | 14 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 5 | 6% | 22 |
| stelo.IntrinsicVolatility 1.4 | 3 | 4% | 8 |
| tvv.nano.Polaris 1.2 | 2 | 3% | 5 |
| asd.Cthulhu 1.3 | 2 | 3% | 4 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 5 |

Posture (Hadur's M records, 200 rounds): 179129 melee ticks, 69868 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 55647 sent, 51003 reached their opponent, 8404 virtual hits (16.5% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480911. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 176 over 6 battles (29.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 86.6 | 110 / 210 | 2.21 | 19.8% | 37450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.8% | 110 |
| et.Predator 1.8 | 2.3 | 13.6% | 19 |
| oog.melee.Mercutio 1.0 | 3.2 | 13.1% | 30 |
| cx.BlestPain 1.41 | 3.5 | 12.3% | 43 |
| ahf.NanoAndrew .4 | 5.3 | 9.9% | 8 |
| maribo.melee.BMV 0.1 | 6.3 | 8.6% | 0 |
| nic.Nicator 2.4 | 6.3 | 8.9% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.9% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 85.1 | 21 / 35 | 6175 |
| 2 | 1 | 69.3 | 84.1 | 16 / 35 | 6236 |
| 3 | 1 | 68.9 | 84.8 | 17 / 35 | 5676 |
| 4 | 1 | 71.4 | 89.8 | 22 / 35 | 6572 |
| 5 | 1 | 69.8 | 84.8 | 17 / 35 | 6106 |
| 6 | 1 | 71.4 | 90.8 | 17 / 35 | 6685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 74% |
| et.Predator 1.8 | 46 | 80% |
| cx.BlestPain 1.41 | 38 | 39% |
| ahf.NanoAndrew .4 | 11 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| maribo.melee.BMV 0.1 | 1 | 100% |
| nic.Nicator 2.4 | 1 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1082. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 36% | 56 |
| et.Predator 1.8 | 24 | 24% | 55 |
| oog.melee.Mercutio 1.0 | 22 | 22% | 63 |
| ahf.NanoAndrew .4 | 10 | 10% | 20 |
| nic.Nicator 2.4 | 3 | 3% | 6 |
| maribo.melee.BMV 0.1 | 2 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 158674 melee ticks, 64287 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 46 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50711 sent, 45823 reached their opponent, 9173 virtual hits (20.0% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490198. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 264 over 6 battles (44.0 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.3 | 160 / 210 | 1.62 | 22.7% | 30528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.7% | 160 |
| agd.Mooserwirt2 2.7 | 2.2 | 14.0% | 18 |
| uji.DBH 1.1 | 2.8 | 13.3% | 14 |
| ratosh.Nobo 0.21 | 5.0 | 10.0% | 3 |
| sigterm.Sigterm 1.0 | 5.5 | 9.8% | 10 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.5% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 6.0 | 8.7% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.2 | 6.3% | 0 |
| stelo.WangRobot 1.0 | 8.7 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 95.0 | 29 / 35 | 5040 |
| 2 | 1 | 70.5 | 90.4 | 25 / 35 | 5324 |
| 3 | 1 | 70.0 | 91.1 | 25 / 35 | 4782 |
| 4 | 1 | 70.8 | 92.5 | 28 / 35 | 5046 |
| 5 | 1 | 70.0 | 88.2 | 25 / 35 | 5147 |
| 6 | 1 | 71.7 | 96.4 | 28 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 60 | 92% |
| agd.Mooserwirt2 2.7 | 48 | 85% |
| sigterm.Sigterm 1.0 | 24 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 15 | 93% |
| spinnercat.Robovirus 2.718 | 12 | 92% |
| ratosh.Nobo 0.21 | 11 | 100% |
| stelo.WangRobot 1.0 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 17 | 34% | 61 |
| uji.DBH 1.1 | 12 | 24% | 51 |
| ratosh.Nobo 0.21 | 8 | 16% | 20 |
| sigterm.Sigterm 1.0 | 6 | 12% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 4% | 20 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 4% | 10 |
| stelo.WangRobot 1.0 | 2 | 4% | 8 |
| spinnercat.Robovirus 2.718 | 1 | 2% | 13 |

Posture (Hadur's M records, 199 rounds): 123752 melee ticks, 47868 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 106 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 106 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38263 sent, 33927 reached their opponent, 7360 virtual hits (21.7% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1501926. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 209 over 6 battles (34.8 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 98.5 | 195 / 210 | 1.13 | 22.7% | 38238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.7% | 195 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.4% | 10 |
| krillr.mini.JointStrike 2.0.0 | 3.5 | 11.6% | 2 |
| mld.Infinity 2.2 | 4.0 | 11.2% | 2 |
| erdnis.Rover 0.3 | 4.5 | 10.8% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.4% | 0 |
| pac.ABC 2.1 | 7.7 | 6.8% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 97.8 | 32 / 35 | 6321 |
| 2 | 1 | 73.7 | 98.7 | 33 / 35 | 6439 |
| 3 | 1 | 72.7 | 97.1 | 31 / 35 | 5830 |
| 4 | 1 | 74.2 | 98.7 | 33 / 35 | 6719 |
| 5 | 1 | 74.4 | 99.7 | 34 / 35 | 6671 |
| 6 | 1 | 73.4 | 99.0 | 32 / 35 | 6258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 116 | 97% |
| krillr.mini.JointStrike 2.0.0 | 30 | 93% |
| mld.Infinity 2.2 | 17 | 100% |
| erdnis.Rover 0.3 | 17 | 94% |
| pac.ABC 2.1 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 15 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 10 | 67% | 65 |
| krillr.mini.JointStrike 2.0.0 | 4 | 27% | 43 |
| erdnis.Rover 0.3 | 1 | 7% | 28 |
| mld.Infinity 2.2 | 0 | 0% | 19 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 17 |
| pac.ABC 2.1 | 0 | 0% | 14 |
| mbh.Mbh 0.1 | 0 | 0% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |

Posture (Hadur's M records, 198 rounds): 123892 melee ticks, 44213 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 41442 sent, 36613 reached their opponent, 7708 virtual hits (21.1% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1514215. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.6 | 154 / 210 | 1.49 | 21.9% | 39146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.9% | 154 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 28 |
| catcat20.Rabbit 0.001 | 3.8 | 11.2% | 17 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.5% | 2 |
| fwb.Nine 1.0.1 | 4.2 | 11.0% | 8 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 7.2 | 6.7% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.3 | 5.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 95.6 | 26 / 35 | 6767 |
| 2 | 1 | 72.6 | 95.9 | 27 / 35 | 6457 |
| 3 | 1 | 72.7 | 94.3 | 24 / 35 | 6885 |
| 4 | 1 | 72.0 | 93.0 | 26 / 35 | 6272 |
| 5 | 1 | 72.2 | 94.0 | 25 / 35 | 6344 |
| 6 | 1 | 72.4 | 94.6 | 26 / 35 | 6421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 100 | 83% |
| fwb.Nine 1.0.1 | 35 | 94% |
| catcat20.Rabbit 0.001 | 31 | 68% |
| nz.jdc.nano.GridFu 1.0 | 13 | 85% |
| m3thos.mini.Eva01 0.5.5 | 6 | 83% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 30 | 54% | 102 |
| catcat20.Rabbit 0.001 | 14 | 25% | 45 |
| fwb.Nine 1.0.1 | 6 | 11% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3 | 5% | 20 |
| bayen.nut.Squirrel 1.615 | 2 | 4% | 11 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 157393 melee ticks, 58765 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 44 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48705 sent, 43827 reached their opponent, 9280 virtual hits (21.2% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1506600. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 103 over 6 battles (17.2 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.2 | 129 / 210 | 1.61 | 21.2% | 38037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.2% | 129 |
| eem.EvBot v4.6.16 | 2.0 | 16.5% | 58 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 13 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 5 |
| eld.Hmm 1.0 | 5.2 | 8.4% | 6 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.0% | 0 |
| fire219.CatBot 1.0 | 7.7 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.0 | 5.6% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 92.7 | 21 / 35 | 7005 |
| 2 | 1 | 70.8 | 91.7 | 19 / 35 | 5814 |
| 3 | 1 | 72.2 | 93.7 | 26 / 35 | 6266 |
| 4 | 1 | 72.3 | 94.3 | 22 / 35 | 6438 |
| 5 | 1 | 71.2 | 92.1 | 18 / 35 | 6096 |
| 6 | 1 | 72.6 | 94.6 | 23 / 35 | 6418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 130 | 69% |
| cf.RiO.RiOx 4.2.1 | 23 | 87% |
| dummy.mini.Scimitar 1.01 | 19 | 68% |
| eld.Hmm 1.0 | 9 | 44% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1263. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 46 | 57% | 114 |
| dummy.mini.Scimitar 1.01 | 15 | 19% | 50 |
| cf.RiO.RiOx 4.2.1 | 9 | 11% | 21 |
| eld.Hmm 1.0 | 7 | 9% | 18 |
| oa.weak.BotherBot 0.1 | 3 | 4% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 171595 melee ticks, 78282 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 47 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49831 sent, 45014 reached their opponent, 7289 virtual hits (16.2% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496261. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.3 | 94 / 210 | 2.02 | 20.4% | 28440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.4% | 94 |
| pe.SandboxDT 2.71m | 2.2 | 16.5% | 54 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.9% | 31 |
| jlm.javaDisturbance 0.59 | 4.0 | 14.1% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 8 |
| yk.JahRoslav 1.1 | 6.3 | 6.7% | 0 |
| tad.Dalek98 0.98 | 7.5 | 5.8% | 1 |
| gg.Squaraus 0.6 | 7.5 | 5.7% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.9 | 18 / 35 | 5103 |
| 2 | 1 | 69.8 | 88.2 | 17 / 35 | 4988 |
| 3 | 1 | 69.0 | 89.3 | 16 / 35 | 4632 |
| 4 | 1 | 65.9 | 81.4 | 10 / 35 | 4182 |
| 5 | 1 | 68.8 | 88.9 | 17 / 35 | 4481 |
| 6 | 1 | 69.5 | 87.9 | 16 / 35 | 5054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 48 | 46% |
| kvk.HebusLeTroll 0.35 | 48 | 60% |
| jlm.javaDisturbance 0.59 | 43 | 70% |
| bigpete.Stewie 1.0 | 13 | 77% |
| tad.Dalek98 0.98 | 2 | 50% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 38% | 67 |
| kvk.HebusLeTroll 0.35 | 39 | 34% | 62 |
| jlm.javaDisturbance 0.59 | 21 | 18% | 51 |
| bigpete.Stewie 1.0 | 6 | 5% | 19 |
| tad.Dalek98 0.98 | 3 | 3% | 4 |
| pbg.NinjaX 1.2 | 2 | 2% | 2 |
| yk.JahRoslav 1.1 | 1 | 1% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 153660 melee ticks, 42565 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44963 sent, 40569 reached their opponent, 5186 virtual hits (12.8% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1502963. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 96.2 | 171 / 210 | 1.34 | 22.3% | 40534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.3% | 171 |
| pe.SandboxLump 1.52 | 2.0 | 16.4% | 27 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 9 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.5% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.1% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 5.8 | 8.7% | 2 |
| sample.Walls 1.0 | 8.0 | 6.9% | 0 |
| rrh.Iwillfindyou 2.0 | 9.0 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 94.0 | 29 / 35 | 6864 |
| 2 | 1 | 73.8 | 96.8 | 29 / 35 | 7146 |
| 3 | 1 | 73.9 | 97.5 | 29 / 35 | 6659 |
| 4 | 1 | 73.7 | 97.5 | 28 / 35 | 6850 |
| 5 | 1 | 72.9 | 94.9 | 29 / 35 | 6494 |
| 6 | 1 | 72.8 | 96.5 | 27 / 35 | 6521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 113 | 85% |
| cre.Karolos 0.32 | 48 | 94% |
| stelo.RamTrackSurfer 1.2 | 13 | 92% |
| stelo.AreaTargetingBot 1.1 | 8 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 4 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 24 | 62% | 105 |
| cre.Karolos 0.32 | 10 | 26% | 51 |
| stelo.AreaTargetingBot 1.1 | 2 | 5% | 11 |
| cw.megas.Blade 0.8 | 2 | 5% | 10 |
| stelo.RamTrackSurfer 1.2 | 1 | 3% | 18 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 5 |

Posture (Hadur's M records, 198 rounds): 119724 melee ticks, 50825 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 33 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 37092 sent, 32119 reached their opponent, 9041 virtual hits (28.1% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1518739. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.1 | 88 / 210 | 2.43 | 17.5% | 26448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 17.5% | 88 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.3% | 40 |
| florent.XSeries.X2 0.12 | 3.5 | 13.0% | 31 |
| davidalves.Phoenix 0.54 | 4.0 | 12.1% | 25 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.1% | 18 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.4% | 3 |
| lunchie.Lunchbox 0.93 | 7.8 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 8.7 | 5.0% | 0 |
| evd.X1 0.01 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.4 | 14 / 35 | 4242 |
| 2 | 1 | 67.5 | 86.3 | 15 / 35 | 4633 |
| 3 | 1 | 65.4 | 81.6 | 11 / 35 | 3969 |
| 4 | 1 | 69.0 | 91.1 | 18 / 35 | 4638 |
| 5 | 1 | 65.4 | 78.1 | 13 / 35 | 4360 |
| 6 | 1 | 67.3 | 83.2 | 17 / 35 | 4606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 51 | 59% |
| davidalves.Phoenix 0.54 | 31 | 42% |
| florent.XSeries.X2 0.12 | 25 | 52% |
| pedersen.Ugluk 1.1.1 | 23 | 61% |
| oog.melee.Corsair 1.0 | 12 | 83% |
| stelo.SoJNanoMelee 1.1 | 7 | 86% |
| as.FrankTheTank 1.3 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 35 | 28% | 62 |
| florent.XSeries.X2 0.12 | 28 | 23% | 49 |
| davidalves.Phoenix 0.54 | 23 | 19% | 34 |
| pedersen.Ugluk 1.1.1 | 22 | 18% | 34 |
| oog.melee.Corsair 1.0 | 8 | 6% | 19 |
| evd.X1 0.01 | 4 | 3% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 5 |
| stelo.SoJNanoMelee 1.1 | 2 | 2% | 2 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 133086 melee ticks, 38380 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 105 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 105 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43667 sent, 38642 reached their opponent, 6555 virtual hits (17.0% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489989. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.0 | 142 / 210 | 1.96 | 21.0% | 24143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.0% | 142 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 15.0% | 18 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 14.3% | 14 |
| jdw.Hurricane 1.4 | 3.8 | 13.3% | 20 |
| ds.Oo 2.2 | 5.5 | 9.0% | 8 |
| adt.Ar2 1.1 | 6.2 | 8.1% | 1 |
| awesomeness.Elite 1.0 | 6.8 | 7.5% | 2 |
| gjr.Cephalosporin 0.1 | 7.7 | 6.6% | 5 |
| amk.ChumbaMini 0.2 | 8.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.1 | 22 / 35 | 3610 |
| 2 | 1 | 69.7 | 89.6 | 25 / 35 | 4290 |
| 3 | 1 | 69.0 | 88.9 | 23 / 35 | 4105 |
| 4 | 1 | 69.3 | 88.6 | 24 / 35 | 4385 |
| 5 | 1 | 68.2 | 85.4 | 23 / 35 | 3861 |
| 6 | 1 | 69.0 | 88.2 | 25 / 35 | 3892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 49 | 84% |
| voidious.mini.BrokenSword 2.0.3 | 46 | 85% |
| jdw.Hurricane 1.4 | 38 | 87% |
| ds.Oo 2.2 | 13 | 92% |
| awesomeness.Elite 1.0 | 8 | 88% |
| gjr.Cephalosporin 0.1 | 6 | 67% |
| adt.Ar2 1.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 28% | 51 |
| jdw.Hurricane 1.4 | 14 | 21% | 43 |
| voidious.mini.BrokenSword 2.0.3 | 13 | 19% | 53 |
| ds.Oo 2.2 | 7 | 10% | 22 |
| adt.Ar2 1.1 | 5 | 7% | 13 |
| awesomeness.Elite 1.0 | 5 | 7% | 11 |
| gjr.Cephalosporin 0.1 | 4 | 6% | 11 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |

Posture (Hadur's M records, 201 rounds): 120242 melee ticks, 31040 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 38 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 38066 sent, 33801 reached their opponent, 5405 virtual hits (16.0% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1497934. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 94.9 | 159 / 210 | 1.46 | 22.2% | 43209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.2% | 159 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 25 |
| lrem.Spectre 0.4.4 | 3.3 | 12.2% | 8 |
| shu.nitro.LENIN .T34 | 3.7 | 11.7% | 14 |
| js.PinBall 1.6 | 5.2 | 10.7% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.3% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 93.3 | 26 / 35 | 7460 |
| 2 | 1 | 73.6 | 95.2 | 25 / 35 | 7363 |
| 3 | 1 | 73.1 | 94.0 | 26 / 35 | 7064 |
| 4 | 1 | 73.8 | 95.9 | 28 / 35 | 7319 |
| 5 | 1 | 74.1 | 97.5 | 30 / 35 | 7372 |
| 6 | 1 | 72.2 | 93.3 | 24 / 35 | 6631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 75 | 85% |
| lrem.Spectre 0.4.4 | 42 | 88% |
| shu.nitro.LENIN .T34 | 40 | 90% |
| js.PinBall 1.6 | 9 | 89% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 23 | 45% | 89 |
| shu.nitro.LENIN .T34 | 11 | 22% | 50 |
| lrem.Spectre 0.4.4 | 9 | 18% | 37 |
| js.PinBall 1.6 | 6 | 12% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 2% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 7 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 151631 melee ticks, 52461 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 23 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 23 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 47542 sent, 42715 reached their opponent, 9823 virtual hits (23.0% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480900. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.2 | 166 / 210 | 1.61 | 21.0% | 33701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.0% | 166 |
| mk.Alpha 0.2.1 | 2.2 | 14.0% | 27 |
| EH.Eagle 1.0.6 | 4.0 | 10.1% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 5.0 | 9.2% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 8.9% | 4 |
| wee.Gem 1.8.4 | 6.0 | 8.7% | 4 |
| throxbot.ThroxBot 0.1 | 6.5 | 8.1% | 2 |
| caimano.Furia_Ceca 0.22 | 7.7 | 7.4% | 0 |
| joe.ADinosaur 1.0 | 7.7 | 8.0% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 96.2 | 29 / 35 | 5845 |
| 2 | 1 | 70.1 | 92.7 | 27 / 35 | 5077 |
| 3 | 1 | 72.1 | 96.8 | 32 / 35 | 5801 |
| 4 | 1 | 70.4 | 89.8 | 25 / 35 | 5616 |
| 5 | 1 | 70.6 | 90.2 | 26 / 35 | 5675 |
| 6 | 1 | 71.3 | 93.3 | 27 / 35 | 5687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 100 | 91% |
| EH.Eagle 1.0.6 | 39 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 90% |
| wee.Gem 1.8.4 | 8 | 88% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 17 | 39% | 85 |
| throxbot.ThroxBot 0.1 | 8 | 18% | 19 |
| EH.Eagle 1.0.6 | 5 | 11% | 35 |
| joe.ADinosaur 1.0 | 5 | 11% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 7% | 21 |
| wee.Gem 1.8.4 | 3 | 7% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 5% | 13 |
| cs.Grudge 1.0 | 1 | 2% | 1 |
| caimano.Furia_Ceca 0.22 | 0 | 0% | 8 |

Posture (Hadur's M records, 199 rounds): 125628 melee ticks, 40948 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 25 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 40803 sent, 35958 reached their opponent, 8162 virtual hits (22.7% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480244. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 188 over 6 battles (31.3 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.2 | 143 / 210 | 1.89 | 19.2% | 27038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.2% | 143 |
| kid.test.NightFox .2 | 2.2 | 14.3% | 25 |
| uji.Antique 1.0 | 2.8 | 12.5% | 15 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.8% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.4% | 9 |
| ahr.ice.Ice 1.0.2 | 6.2 | 8.2% | 3 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.0% | 3 |
| matt.advanced.Katana 1.0 | 8.2 | 6.5% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.1% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.9 | 30 / 35 | 4626 |
| 2 | 1 | 68.7 | 89.2 | 23 / 35 | 4342 |
| 3 | 1 | 69.2 | 91.4 | 23 / 35 | 4516 |
| 4 | 1 | 66.8 | 83.8 | 20 / 35 | 4275 |
| 5 | 1 | 69.0 | 88.9 | 24 / 35 | 4592 |
| 6 | 1 | 69.8 | 92.7 | 23 / 35 | 4687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 64 | 84% |
| uji.Antique 1.0 | 56 | 96% |
| qohnil.blot.BlotBot 3.61 | 19 | 79% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 8 | 63% |
| amk.ChumbaWumba 0.3 | 6 | 67% |
| matt.advanced.Katana 1.0 | 4 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 16 | 23% | 61 |
| pfvicm.Sobieski 7.2.3b | 15 | 22% | 23 |
| kid.test.NightFox .2 | 14 | 20% | 50 |
| qohnil.blot.BlotBot 3.61 | 9 | 13% | 35 |
| amk.ChumbaWumba 0.3 | 6 | 9% | 9 |
| ahr.ice.Ice 1.0.2 | 4 | 6% | 15 |
| stelo.Lifestealer 1.0 | 4 | 6% | 5 |
| matt.advanced.Katana 1.0 | 1 | 1% | 5 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 126598 melee ticks, 39038 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 57 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 3.

Targeting waves (201 rounds): 42134 sent, 37200 reached their opponent, 5129 virtual hits (13.8% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479541. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.2 | 103 / 210 | 1.97 | 19.5% | 30221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.5% | 103 |
| deewiant.Anomaly 0.2 | 2.3 | 15.0% | 50 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.8% | 44 |
| myl.micro.Troodon 1.10 | 4.2 | 11.9% | 5 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.9% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.8% | 2 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 1 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.7 | 17 / 35 | 5131 |
| 2 | 1 | 68.0 | 82.5 | 15 / 35 | 4722 |
| 3 | 1 | 70.9 | 90.8 | 19 / 35 | 5277 |
| 4 | 1 | 70.3 | 89.5 | 19 / 35 | 5161 |
| 5 | 1 | 69.6 | 90.2 | 16 / 35 | 4819 |
| 6 | 1 | 70.5 | 89.5 | 17 / 35 | 5111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 64 | 56% |
| zyx.mega.YersiniaPestis 3.1 | 44 | 55% |
| myl.micro.Troodon 1.10 | 24 | 92% |
| jok.PheonixM 0.1.2 | 18 | 89% |
| fullsail.TimbotNoPrediction 1.0 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1082. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 48 | 45% | 82 |
| zyx.mega.YersiniaPestis 3.1 | 38 | 36% | 68 |
| myl.micro.Troodon 1.10 | 8 | 7% | 23 |
| jok.PheonixM 0.1.2 | 6 | 6% | 18 |
| ph.melee.ArcherME 0.3 | 5 | 5% | 10 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 172705 melee ticks, 50013 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 53878 sent, 48969 reached their opponent, 6972 virtual hits (14.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1512972. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 79.8 | 69 / 210 | 2.62 | 18.4% | 26731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.2 | 18.4% | 69 |
| darkcanuck.B26354 1.06 | 2.0 | 16.5% | 69 |
| oog.melee.Capulet 1.2 | 3.3 | 14.3% | 32 |
| stelo.PastFuture 2.3.2 | 3.5 | 14.5% | 30 |
| intruder.PrairieWolf 2.61 | 5.3 | 9.3% | 6 |
| tripphippy.Alice 1.1 | 6.2 | 9.0% | 1 |
| ntc.Opposite 1.5 | 6.7 | 8.3% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 6.7% | 3 |
| GarmBox.Anger 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 80.7 | 11 / 35 | 4513 |
| 2 | 1 | 66.1 | 80.7 | 11 / 35 | 4339 |
| 3 | 1 | 67.0 | 82.9 | 14 / 35 | 4529 |
| 4 | 2 | 62.6 | 71.8 | 6 / 35 | 4092 |
| 5 | 1 | 66.7 | 82.1 | 15 / 35 | 4495 |
| 6 | 1 | 66.6 | 80.4 | 12 / 35 | 4763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 51 | 39% |
| oog.melee.Capulet 1.2 | 28 | 64% |
| stelo.PastFuture 2.3.2 | 26 | 54% |
| intruder.PrairieWolf 2.61 | 14 | 71% |
| tripphippy.Alice 1.1 | 4 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 55 | 39% | 71 |
| stelo.PastFuture 2.3.2 | 34 | 24% | 48 |
| oog.melee.Capulet 1.2 | 22 | 15% | 44 |
| intruder.PrairieWolf 2.61 | 10 | 7% | 19 |
| tripphippy.Alice 1.1 | 8 | 6% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 5% | 7 |
| ntc.Opposite 1.5 | 6 | 4% | 7 |

Posture (Hadur's M records, 201 rounds): 153802 melee ticks, 39754 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 70 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44635 sent, 40174 reached their opponent, 6760 virtual hits (16.8% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1511127. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 80.9 | 72 / 210 | 2.72 | 16.6% | 24314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.7% | 84 |
| hadur117.Hadur 3.21aa | 1.8 | 16.6% | 72 |
| gh.mini.Griezel 0.2 | 3.0 | 13.8% | 33 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.3% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.0% | 10 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.8% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 8.5 | 5.2% | 0 |
| fm.mammillarias 1.3 | 8.8 | 4.8% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 83.5 | 12 / 35 | 4387 |
| 2 | 2 | 64.6 | 77.1 | 15 / 35 | 3688 |
| 3 | 2 | 66.0 | 80.3 | 11 / 35 | 4051 |
| 4 | 2 | 66.5 | 83.2 | 10 / 35 | 4096 |
| 5 | 1 | 66.2 | 83.2 | 12 / 35 | 4106 |
| 6 | 2 | 65.2 | 78.1 | 12 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 55 | 51% |
| gh.mini.Griezel 0.2 | 39 | 64% |
| d414.nano.Quantum 1.0.0 | 11 | 91% |
| spinnercat.micro.Tyger 0.1 | 9 | 67% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 138 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 41% | 83 |
| gh.mini.Griezel 0.2 | 32 | 23% | 58 |
| spinnercat.micro.Tyger 0.1 | 22 | 16% | 26 |
| d414.nano.Quantum 1.0.0 | 11 | 8% | 20 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 13 |
| timmit.nano.TimDog 0.33 | 5 | 4% | 5 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 149362 melee ticks, 39147 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 47635 sent, 42621 reached their opponent, 6626 virtual hits (15.5% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474936. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 207 over 6 battles (34.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.0 | 129 / 210 | 1.90 | 19.1% | 29624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.1% | 129 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 50 |
| apc.botM 3.0 | 3.3 | 11.5% | 11 |
| lxx.ConceptA 0.8 | 3.8 | 10.3% | 4 |
| vjik.UnViolation 1.1 | 5.2 | 9.3% | 7 |
| bayen.UbaMicro 1.4 | 5.7 | 8.9% | 2 |
| panzer.Panzer 0.2 | 7.5 | 7.6% | 0 |
| yk.JahMicro 1.0 | 8.0 | 7.4% | 6 |
| conscience.Electron 1.3g | 8.5 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 88.6 | 18 / 35 | 4611 |
| 2 | 1 | 69.0 | 89.2 | 23 / 35 | 4950 |
| 3 | 1 | 67.2 | 86.3 | 19 / 35 | 4660 |
| 4 | 1 | 70.0 | 93.0 | 26 / 35 | 5203 |
| 5 | 1 | 70.1 | 92.1 | 23 / 35 | 5365 |
| 6 | 1 | 68.6 | 90.8 | 20 / 35 | 4835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 91 | 64% |
| apc.botM 3.0 | 31 | 77% |
| vjik.UnViolation 1.1 | 15 | 80% |
| lxx.ConceptA 0.8 | 11 | 82% |
| bayen.UbaMicro 1.4 | 11 | 100% |
| yk.JahMicro 1.0 | 10 | 70% |
| donjezza.Jezza 1.0 | 4 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 35 | 43% | 85 |
| apc.botM 3.0 | 12 | 15% | 37 |
| lxx.ConceptA 0.8 | 11 | 14% | 18 |
| vjik.UnViolation 1.1 | 8 | 10% | 29 |
| yk.JahMicro 1.0 | 6 | 7% | 14 |
| bayen.UbaMicro 1.4 | 4 | 5% | 15 |
| panzer.Panzer 0.2 | 4 | 5% | 7 |
| conscience.Electron 1.3g | 1 | 1% | 1 |
| donjezza.Jezza 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 120945 melee ticks, 53617 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 40367 sent, 35492 reached their opponent, 6176 virtual hits (17.4% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488473. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 263 over 6 battles (43.8 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.8 | 133 / 210 | 1.73 | 22.2% | 29464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.2% | 133 |
| maribo.Quester 0.3 | 2.0 | 17.7% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 14.3% | 29 |
| labg.Cataclysm 2.05 | 3.7 | 12.6% | 12 |
| baal.nano.N 1.42 | 5.2 | 9.9% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.7 | 9.4% | 3 |
| zyx.micro.Ant 1.1 | 7.2 | 6.1% | 0 |
| sanja.First 0.1 | 7.8 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.5 | 25 / 35 | 5274 |
| 2 | 1 | 70.4 | 89.3 | 19 / 35 | 4600 |
| 3 | 1 | 71.2 | 92.1 | 22 / 35 | 4871 |
| 4 | 1 | 71.4 | 89.6 | 24 / 35 | 5269 |
| 5 | 1 | 70.7 | 90.4 | 22 / 35 | 4618 |
| 6 | 1 | 71.1 | 91.1 | 21 / 35 | 4832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 84 | 81% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 71% |
| labg.Cataclysm 2.05 | 22 | 82% |
| baal.nano.N 1.42 | 6 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1074. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 38% | 92 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 32% | 59 |
| labg.Cataclysm 2.05 | 11 | 14% | 32 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 8% | 9 |
| baal.nano.N 1.42 | 2 | 3% | 10 |
| zyx.micro.Ant 1.1 | 2 | 3% | 6 |
| sanja.First 0.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 166666 melee ticks, 53774 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 48 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 47477 sent, 43148 reached their opponent, 6006 virtual hits (13.9% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1494002. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.8 | 96 / 210 | 1.91 | 19.7% | 35936 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.7% | 96 |
| kid.Gladiator .7.2 | 2.5 | 15.9% | 42 |
| stelo.Spread 0.9 | 2.5 | 15.8% | 51 |
| jcs.Seth 1.8 | 4.0 | 11.5% | 19 |
| tcf.Reach 3 | 5.3 | 10.2% | 2 |
| cli.Dancer 1.1 | 5.7 | 9.5% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 6.6% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.1 | 18 / 35 | 6444 |
| 2 | 1 | 71.7 | 91.7 | 17 / 35 | 6427 |
| 3 | 1 | 70.7 | 90.2 | 17 / 35 | 5842 |
| 4 | 1 | 70.0 | 87.6 | 14 / 35 | 5750 |
| 5 | 1 | 70.5 | 88.9 | 18 / 35 | 5842 |
| 6 | 1 | 69.6 | 88.6 | 12 / 35 | 5631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 69 | 57% |
| kid.Gladiator .7.2 | 66 | 59% |
| jcs.Seth 1.8 | 19 | 37% |
| tcf.Reach 3 | 9 | 89% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1134. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 49 | 42% | 86 |
| kid.Gladiator .7.2 | 44 | 38% | 67 |
| jcs.Seth 1.8 | 16 | 14% | 28 |
| tcf.Reach 3 | 7 | 6% | 16 |
| cli.Dancer 1.1 | 0 | 0% | 8 |
| ratosh.Wesco 1.4 | 0 | 0% | 3 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 166517 melee ticks, 60583 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50043 sent, 45232 reached their opponent, 7349 virtual hits (16.2% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488575. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.4 | 45 / 210 | 2.49 | 16.4% | 24338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 133 |
| hadur117.Hadur 3.21aa | 2.0 | 16.4% | 45 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.9% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.6% | 7 |
| rz.HawkOnFire 0.1 | 4.3 | 12.0% | 5 |
| wit.Chuliath 1.0 | 6.3 | 7.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 5.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.7 | 5.6% | 1 |
| dans.Cinnamon 1.2 | 9.2 | 4.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 89.2 | 12 / 35 | 4299 |
| 2 | 2 | 65.5 | 80.0 | 8 / 35 | 4297 |
| 3 | 2 | 67.3 | 87.0 | 13 / 35 | 3950 |
| 4 | 2 | 63.9 | 79.4 | 3 / 35 | 3710 |
| 5 | 2 | 65.5 | 82.5 | 5 / 35 | 4020 |
| 6 | 2 | 65.4 | 82.5 | 4 / 35 | 4062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 101 | 20% |
| gh.mini.Gruwel 0.9 | 18 | 67% |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 79% |
| rz.HawkOnFire 0.1 | 4 | 0% |
| wit.Chuliath 1.0 | 2 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 106 | 64% | 130 |
| gh.mini.Gruwel 0.9 | 20 | 12% | 28 |
| rz.HawkOnFire 0.1 | 18 | 11% | 19 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 10% | 25 |
| wit.Chuliath 1.0 | 2 | 1% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 143349 melee ticks, 48015 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43312 sent, 38416 reached their opponent, 5743 virtual hits (14.9% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482037. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 6 battles (34.3 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.2 | 167 / 210 | 1.52 | 21.6% | 35392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.6% | 167 |
| alpha.RainingFire 1.0 | 2.5 | 12.5% | 14 |
| bzdp.Pansy 2.1 | 2.8 | 12.4% | 9 |
| bvh.micro.Freya 0.3 | 3.8 | 11.2% | 10 |
| mz.Cork 0.1 | 5.7 | 10.3% | 6 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.7% | 1 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.7% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.3% | 1 |
| dl.BetterWalls 1.0 | 8.8 | 4.6% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.1 | 27 / 35 | 5849 |
| 2 | 1 | 72.1 | 94.3 | 26 / 35 | 5962 |
| 3 | 1 | 72.3 | 95.6 | 29 / 35 | 5715 |
| 4 | 1 | 73.4 | 97.5 | 31 / 35 | 6148 |
| 5 | 1 | 72.2 | 94.9 | 28 / 35 | 5821 |
| 6 | 1 | 71.8 | 91.7 | 26 / 35 | 5897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 42 | 93% |
| bzdp.Pansy 2.1 | 41 | 93% |
| mz.Cork 0.1 | 32 | 94% |
| alpha.RainingFire 1.0 | 31 | 90% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 15 | 93% |
| sample.MyFirstRobot 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 11 | 24% | 41 |
| alpha.RainingFire 1.0 | 8 | 18% | 37 |
| m3thos.Eva02 0.7.1 | 8 | 18% | 28 |
| bzdp.Pansy 2.1 | 7 | 16% | 45 |
| bvh.mini.Fenrir 0.39 | 5 | 11% | 17 |
| mz.Cork 0.1 | 4 | 9% | 30 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 5 |
| dl.BetterWalls 1.0 | 0 | 0% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 142381 melee ticks, 43953 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 30 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47138 sent, 42347 reached their opponent, 8011 virtual hits (18.9% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1500702. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 234 over 6 battles (39.0 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.1 | 170 / 210 | 1.80 | 20.3% | 36392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.3% | 170 |
| EBBU.Sim2 1.02 | 3.8 | 9.8% | 3 |
| germ.TheMind .2 | 3.8 | 10.0% | 6 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 9.9% | 4 |
| agrach.Dalek 1.0 | 5.5 | 9.2% | 6 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.2% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 6.5 | 8.8% | 2 |
| lmk.ACPFinal 0.1 | 7.5 | 8.0% | 6 |
| mb.Beast 0.1 | 7.5 | 7.9% | 5 |
| skm.Ryubot 1.0 | 9.5 | 6.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.3 | 26 / 35 | 5775 |
| 2 | 1 | 67.9 | 83.2 | 26 / 35 | 5853 |
| 3 | 1 | 70.1 | 91.1 | 30 / 35 | 6205 |
| 4 | 1 | 70.7 | 94.0 | 31 / 35 | 6015 |
| 5 | 1 | 71.4 | 95.9 | 32 / 35 | 6440 |
| 6 | 1 | 70.1 | 94.0 | 25 / 35 | 6104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 31 | 97% |
| stelo.UntouchableNano 1.3 | 30 | 97% |
| agrach.Dalek 1.0 | 28 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 96% |
| mb.Beast 0.1 | 18 | 89% |
| lmk.ACPFinal 0.1 | 15 | 87% |
| germ.TheMind .2 | 14 | 100% |
| skm.Ryubot 1.0 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 40 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 9 | 23% | 12 |
| lmk.ACPFinal 0.1 | 7 | 18% | 24 |
| agrach.Dalek 1.0 | 4 | 10% | 41 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 10% | 37 |
| EBBU.Sim2 1.02 | 4 | 10% | 26 |
| mb.Beast 0.1 | 4 | 10% | 20 |
| stelo.UntouchableNano 1.3 | 3 | 8% | 27 |
| germ.TheMind .2 | 3 | 8% | 13 |
| skm.Ryubot 1.0 | 2 | 5% | 5 |

Posture (Hadur's M records, 199 rounds): 93671 melee ticks, 25762 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 30978 sent, 26420 reached their opponent, 7497 virtual hits (28.4% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1511190. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.4 | 117 / 210 | 1.96 | 19.2% | 30734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.2% | 117 |
| justin.Mallais 14.0 | 2.0 | 15.9% | 50 |
| bvh.mini.Freya 0.55 | 3.2 | 12.8% | 10 |
| bts.mega.Gnarly 1.4 | 3.8 | 11.7% | 21 |
| cs.Wren 1.0 | 5.2 | 10.3% | 5 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.2% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 7.6% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.1% | 2 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.7 | 24 / 35 | 5301 |
| 2 | 1 | 69.2 | 89.2 | 20 / 35 | 4931 |
| 3 | 1 | 67.2 | 83.8 | 14 / 35 | 4740 |
| 4 | 1 | 69.7 | 89.2 | 16 / 35 | 5212 |
| 5 | 1 | 70.4 | 91.7 | 22 / 35 | 5375 |
| 6 | 1 | 70.0 | 90.5 | 21 / 35 | 5175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 75 | 75% |
| bts.mega.Gnarly 1.4 | 38 | 63% |
| bvh.mini.Freya 0.55 | 23 | 78% |
| cs.Wren 1.0 | 12 | 83% |
| kdf.KoulDestroyer 1.0 | 7 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 37 | 39% | 94 |
| bts.mega.Gnarly 1.4 | 26 | 28% | 51 |
| bvh.mini.Freya 0.55 | 13 | 14% | 25 |
| cs.Wren 1.0 | 10 | 11% | 24 |
| kdf.KoulDestroyer 1.0 | 4 | 4% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 142710 melee ticks, 35794 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 64 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44942 sent, 39767 reached their opponent, 7769 virtual hits (19.5% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496120. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.2 | 143 / 210 | 1.54 | 23.1% | 35783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 23.1% | 143 |
| bvh.fry.Freya 0.82 | 2.0 | 16.6% | 17 |
| az.Ololobot 0.2.4 | 3.0 | 14.3% | 46 |
| winamp32.micro.MicroMacro 1.0 | 4.7 | 9.4% | 2 |
| apollokidd.ApolloKidd 0.9 | 5.0 | 8.7% | 0 |
| gimp.GimpBot 0.1 | 5.5 | 8.6% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.5 | 7.2% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.0 | 6.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.9 | 23 / 35 | 5693 |
| 2 | 1 | 71.0 | 92.1 | 25 / 35 | 5803 |
| 3 | 1 | 72.2 | 95.0 | 24 / 35 | 6169 |
| 4 | 1 | 71.9 | 95.0 | 26 / 35 | 5998 |
| 5 | 1 | 72.6 | 95.7 | 25 / 35 | 6402 |
| 6 | 1 | 70.1 | 88.6 | 20 / 35 | 5718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 88 | 89% |
| az.Ololobot 0.2.4 | 75 | 60% |
| gimp.GimpBot 0.1 | 9 | 89% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1136. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 39 | 56% | 101 |
| bvh.fry.Freya 0.82 | 23 | 33% | 68 |
| gimp.GimpBot 0.1 | 3 | 4% | 16 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 1% | 4 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 152600 melee ticks, 66133 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 31 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44074 sent, 39752 reached their opponent, 6899 virtual hits (17.4% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486948. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.1 | 137 / 210 | 1.80 | 20.5% | 33918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.5% | 137 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.5% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.5% | 18 |
| mz.AntiGrav 1.0 | 3.8 | 11.4% | 5 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.1% | 4 |
| alpha.BlackIce 1.0 | 6.3 | 8.7% | 0 |
| stelo.Randomness 1.0 | 6.5 | 8.7% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 5.9% | 1 |
| sample.Corners 1.0 | 9.5 | 3.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.5 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.4 | 22 / 35 | 5514 |
| 2 | 1 | 70.2 | 88.3 | 18 / 35 | 5588 |
| 3 | 1 | 72.0 | 92.4 | 27 / 35 | 5868 |
| 4 | 1 | 71.2 | 91.7 | 24 / 35 | 5523 |
| 5 | 1 | 71.5 | 90.5 | 23 / 35 | 5844 |
| 6 | 1 | 71.3 | 92.1 | 23 / 35 | 5581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 73 | 74% |
| kano.gamma.KanoGamma 1.8 | 45 | 80% |
| mz.AntiGrav 1.0 | 23 | 83% |
| Polkwane.SmashMelee 1.0 | 16 | 100% |
| stelo.Randomness 1.0 | 8 | 88% |
| alpha.BlackIce 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 30 | 41% | 74 |
| kano.gamma.KanoGamma 1.8 | 22 | 30% | 60 |
| Polkwane.SmashMelee 1.0 | 7 | 9% | 22 |
| alpha.BlackIce 1.0 | 5 | 7% | 11 |
| mz.AntiGrav 1.0 | 4 | 5% | 20 |
| stelo.Randomness 1.0 | 4 | 5% | 13 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 8 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 147055 melee ticks, 44829 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 63 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 46668 sent, 41704 reached their opponent, 8139 virtual hits (19.5% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1497061. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 160 over 6 battles (26.7 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.7 | 113 / 210 | 1.92 | 19.2% | 29586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.2% | 113 |
| eem.EvBotNG v12.8 | 2.0 | 16.3% | 75 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 4 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.3% | 7 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.5% | 8 |
| shrub.Silver v048 | 6.0 | 9.0% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.2% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.3% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.6 | 17 / 35 | 4856 |
| 2 | 1 | 69.3 | 88.3 | 20 / 35 | 4752 |
| 3 | 1 | 70.7 | 91.4 | 20 / 35 | 5244 |
| 4 | 1 | 70.1 | 90.2 | 19 / 35 | 5213 |
| 5 | 1 | 70.5 | 93.3 | 22 / 35 | 4881 |
| 6 | 1 | 68.8 | 87.6 | 15 / 35 | 4640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 83 | 46% |
| ary.Swarm 1.1 | 37 | 95% |
| lessonz.robocode.Oz 0.5.0 | 28 | 96% |
| simonton.nano.MeleeSeed 1.8 | 8 | 88% |
| shrub.Silver v048 | 6 | 67% |
| stelo.Mirror 1.1 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 60% | 100 |
| ary.Swarm 1.1 | 12 | 12% | 37 |
| simonton.nano.MeleeSeed 1.8 | 12 | 12% | 23 |
| lessonz.robocode.Oz 0.5.0 | 10 | 10% | 30 |
| shrub.Silver v048 | 4 | 4% | 7 |
| stelo.Mirror 1.1 | 1 | 1% | 6 |
| zyx.nano.Ant 1.1 | 0 | 0% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 150373 melee ticks, 55504 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 64 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 48599 sent, 43493 reached their opponent, 6241 virtual hits (14.3% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1510251. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.1 | 142 / 210 | 1.80 | 20.7% | 37233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.7% | 142 |
| wompi.Wallaby 5.1 | 2.3 | 15.0% | 29 |
| ara.Shera 0.88 | 3.2 | 13.8% | 21 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.0% | 15 |
| amz.NanoClone 1.41 | 5.2 | 8.9% | 0 |
| dsw.StaticD 1.0 | 6.0 | 7.2% | 3 |
| maribo.IotaCT 1.1 | 7.2 | 6.1% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 4.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 96.5 | 28 / 35 | 6416 |
| 2 | 1 | 71.0 | 90.5 | 26 / 35 | 5938 |
| 3 | 1 | 69.9 | 87.3 | 18 / 35 | 6080 |
| 4 | 1 | 70.1 | 87.6 | 21 / 35 | 5838 |
| 5 | 1 | 72.7 | 94.9 | 25 / 35 | 6804 |
| 6 | 1 | 71.0 | 89.8 | 24 / 35 | 6157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 92 | 88% |
| maribo.mini.MiniQuester 0.1 | 42 | 83% |
| ara.Shera 0.88 | 29 | 76% |
| amz.NanoClone 1.41 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 26 | 38% | 45 |
| wompi.Wallaby 5.1 | 21 | 31% | 94 |
| maribo.mini.MiniQuester 0.1 | 16 | 24% | 52 |
| dsw.StaticD 1.0 | 3 | 4% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 3% | 2 |
| amz.NanoClone 1.41 | 0 | 0% | 4 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 155095 melee ticks, 52162 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 48376 sent, 43578 reached their opponent, 8186 virtual hits (18.8% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1494829. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 120 over 6 battles (20.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.2 | 39 / 210 | 2.69 | 16.3% | 25855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 137 |
| hadur117.Hadur 3.21aa | 2.0 | 16.3% | 39 |
| brainfade.melee.Dusk 0.44 | 3.0 | 13.1% | 29 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.0% | 2 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 10.9% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 80.0 | 5 / 35 | 3773 |
| 2 | 2 | 67.8 | 84.4 | 10 / 35 | 4295 |
| 3 | 2 | 68.6 | 85.1 | 7 / 35 | 4843 |
| 4 | 2 | 66.7 | 82.2 | 5 / 35 | 4224 |
| 5 | 2 | 65.4 | 76.2 | 6 / 35 | 4408 |
| 6 | 2 | 66.0 | 79.4 | 6 / 35 | 4312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 91 | 23% |
| brainfade.melee.Dusk 0.44 | 20 | 40% |
| dummy.micro.Sparrow 2.5 | 5 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 3 | 33% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 103 | 60% | 121 |
| brainfade.melee.Dusk 0.44 | 34 | 20% | 42 |
| dummy.micro.Sparrow 2.5 | 18 | 10% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 9 | 5% | 13 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 5 |
| jab.DiamondStealer 5 | 3 | 2% | 4 |
| mz.NanoGod 2.02 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 148823 melee ticks, 49713 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 39 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 46380 sent, 41393 reached their opponent, 6354 virtual hits (15.4% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1499730. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.1 | 154 / 210 | 1.53 | 21.6% | 37011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.6% | 154 |
| stelo.Liblix 0.3.1 | 2.2 | 15.0% | 40 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.3% | 12 |
| jwirde.Gort 2.0 | 4.2 | 9.9% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 8.9% | 0 |
| wompi.Quokka 1.6 | 6.7 | 7.2% | 1 |
| disan.Chair 2.2.0 | 6.8 | 7.1% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.0 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 91.7 | 24 / 35 | 6276 |
| 2 | 1 | 71.1 | 92.1 | 26 / 35 | 5709 |
| 3 | 1 | 72.5 | 95.2 | 27 / 35 | 6336 |
| 4 | 1 | 72.8 | 97.1 | 28 / 35 | 6182 |
| 5 | 1 | 72.6 | 95.2 | 25 / 35 | 6185 |
| 6 | 1 | 72.3 | 93.3 | 24 / 35 | 6323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 82 | 65% |
| tzu.TheArtOfWar 1.2 | 70 | 97% |
| jwirde.Gort 2.0 | 11 | 100% |
| disan.Chair 2.2.0 | 9 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| wompi.Quokka 1.6 | 3 | 67% |
| sample.Crazy 1.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 66% | 98 |
| tzu.TheArtOfWar 1.2 | 7 | 13% | 59 |
| jwirde.Gort 2.0 | 4 | 7% | 20 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 7% | 13 |
| wompi.Quokka 1.6 | 2 | 4% | 7 |
| disan.Chair 2.2.0 | 1 | 2% | 6 |
| sample.Crazy 1.0 | 1 | 2% | 4 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 151112 melee ticks, 47570 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50314 sent, 45482 reached their opponent, 9065 virtual hits (19.9% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488739. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 192 over 6 battles (32.0 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.2 | 122 / 210 | 1.89 | 20.5% | 35142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.5% | 122 |
| jje.BagPuss 1.2 | 2.7 | 12.5% | 8 |
| eem.IWillFireNoBullet v2.8 | 3.3 | 11.5% | 58 |
| sul.Lunar 1.1 | 3.5 | 11.1% | 18 |
| myl.nano.Graviton 1.10 | 4.5 | 10.5% | 1 |
| hvilela.HVilela 0.9 | 6.7 | 8.6% | 0 |
| fm.claire 1.7 | 7.2 | 8.1% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.0% | 2 |
| wit.Deep7 2.0 | 9.3 | 4.8% | 1 |
| abud.ThirdRobo 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.0 | 23 / 35 | 5672 |
| 2 | 1 | 68.7 | 85.7 | 17 / 35 | 5355 |
| 3 | 1 | 72.0 | 92.7 | 24 / 35 | 6302 |
| 4 | 1 | 71.5 | 91.7 | 22 / 35 | 6092 |
| 5 | 1 | 69.5 | 86.7 | 16 / 35 | 5874 |
| 6 | 1 | 70.7 | 91.1 | 20 / 35 | 5847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 60% |
| jje.BagPuss 1.2 | 27 | 85% |
| sul.Lunar 1.1 | 26 | 73% |
| myl.nano.Graviton 1.10 | 16 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 89% |
| fm.claire 1.7 | 7 | 100% |
| wit.Deep7 2.0 | 4 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 1526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 39 | 44% | 0 |
| jje.BagPuss 1.2 | 16 | 18% | 68 |
| sul.Lunar 1.1 | 13 | 15% | 55 |
| myl.nano.Graviton 1.10 | 10 | 11% | 27 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 5% | 23 |
| hvilela.HVilela 0.9 | 3 | 3% | 11 |
| wit.Deep7 2.0 | 2 | 2% | 10 |
| fm.claire 1.7 | 1 | 1% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 188419 melee ticks, 86713 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 56 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 57242 sent, 52407 reached their opponent, 7200 virtual hits (13.7% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21aa against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1498099. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 123 over 6 battles (20.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 92.1 | 132 / 210 | 1.63 | 21.8% | 30734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.8% | 132 |
| kc.mini.Mirage 0.2 | 2.0 | 18.7% | 58 |
| mz.MicroSheep 1.0 | 4.0 | 11.8% | 6 |
| sadoner.killer 0.2 | 4.0 | 11.4% | 3 |
| cx.Princess 1.0 | 4.2 | 11.6% | 9 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.7% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.0 | 6.8% | 0 |
| kurios.DOSexe .9a | 8.0 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.9 | 21 / 35 | 5328 |
| 2 | 1 | 71.3 | 92.9 | 26 / 35 | 5465 |
| 3 | 1 | 69.9 | 92.5 | 20 / 35 | 5006 |
| 4 | 1 | 71.1 | 92.9 | 23 / 35 | 5214 |
| 5 | 1 | 68.5 | 90.0 | 19 / 35 | 4628 |
| 6 | 1 | 70.2 | 91.4 | 23 / 35 | 5093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 139 | 71% |
| cx.Princess 1.0 | 18 | 83% |
| mz.MicroSheep 1.0 | 17 | 71% |
| sadoner.killer 0.2 | 4 | 75% |
| arthord.NanoSatanMelee Beta | 4 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 48 | 60% | 147 |
| mz.MicroSheep 1.0 | 11 | 14% | 23 |
| cx.Princess 1.0 | 9 | 11% | 18 |
| sadoner.killer 0.2 | 7 | 9% | 12 |
| kurios.DOSexe .9a | 3 | 4% | 4 |
| arthord.NanoSatanMelee Beta | 1 | 1% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 132293 melee ticks, 58154 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 31 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 36716 sent, 32373 reached their opponent, 4945 virtual hits (15.3% of those reached).

