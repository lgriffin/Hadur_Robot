# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485706. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 133 over 6 battles (22.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.0 | 61 / 210 | 2.17 | 17.9% | 32310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.5% | 130 |
| hadur117.Hadur 3.21n3 | 2.0 | 17.9% | 61 |
| sgp.JollyNinja 3.53 | 3.3 | 11.7% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.0% | 2 |
| mz.MicroGodMelee 1 | 5.3 | 10.0% | 2 |
| lorneswork.Predator 1.0 | 5.5 | 9.9% | 1 |
| adt.Ar2 1.0 | 6.8 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 86.0 | 12 / 35 | 5462 |
| 2 | 2 | 68.6 | 86.7 | 9 / 35 | 5662 |
| 3 | 2 | 67.6 | 87.3 | 7 / 35 | 5169 |
| 4 | 2 | 69.1 | 89.8 | 13 / 35 | 5434 |
| 5 | 2 | 69.1 | 89.8 | 12 / 35 | 5579 |
| 6 | 2 | 66.4 | 82.5 | 8 / 35 | 5004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 17% |
| sgp.JollyNinja 3.53 | 19 | 74% |
| mz.MicroGodMelee 1 | 16 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 1190. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 79% | 139 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 13 |
| sgp.JollyNinja 3.53 | 8 | 5% | 18 |
| lorneswork.Predator 1.0 | 6 | 4% | 14 |
| mz.MicroGodMelee 1 | 5 | 3% | 18 |
| adt.Ar2 1.0 | 3 | 2% | 5 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 141161 melee ticks, 89890 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 87 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44584 sent, 39959 reached their opponent, 8141 virtual hits (20.4% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474396. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 197 over 6 battles (32.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.6 | 115 / 210 | 2.12 | 19.1% | 30502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 19.1% | 115 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.2% | 41 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.1% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.5% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 10.1% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.0 | 8.6% | 5 |
| sch.Simone 0.3d | 7.2 | 7.7% | 13 |
| Noran.BitchingElk 0.054 | 7.8 | 7.0% | 5 |
| stelo.PatternRobot 1.0 | 8.7 | 5.3% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.4 | 16 / 35 | 4627 |
| 2 | 1 | 69.0 | 87.0 | 17 / 35 | 5454 |
| 3 | 1 | 69.9 | 91.1 | 20 / 35 | 5031 |
| 4 | 1 | 70.4 | 91.4 | 24 / 35 | 5195 |
| 5 | 1 | 69.9 | 90.2 | 22 / 35 | 5113 |
| 6 | 1 | 68.3 | 86.3 | 16 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 57 | 54% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 81% |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 67% |
| sch.Simone 0.3d | 15 | 73% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| Noran.BitchingElk 0.054 | 8 | 88% |
| fnc.bandit.Bandit 5.2.0 | 6 | 83% |
| stelo.PatternRobot 1.0 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 35 | 37% | 64 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 17 | 18% | 54 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 16% | 34 |
| sch.Simone 0.3d | 10 | 11% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 6% | 13 |
| Noran.BitchingElk 0.054 | 5 | 5% | 14 |
| stelo.PatternRobot 1.0 | 4 | 4% | 7 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 5 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 198 rounds): 157357 melee ticks, 44974 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 81 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 56395 sent, 51744 reached their opponent, 8726 virtual hits (16.9% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479886. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.6 | 181 / 210 | 1.40 | 21.6% | 39237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 21.6% | 181 |
| radnor.DoctorBob 1.42 | 2.3 | 13.5% | 11 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.9% | 4 |
| vuen.Cake 2.51 | 3.5 | 12.2% | 12 |
| urdos.URDOS 1.3 | 5.0 | 8.9% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 96.2 | 31 / 35 | 6591 |
| 2 | 1 | 72.0 | 95.2 | 31 / 35 | 6555 |
| 3 | 1 | 71.3 | 94.6 | 28 / 35 | 6306 |
| 4 | 1 | 72.1 | 95.9 | 31 / 35 | 6533 |
| 5 | 1 | 72.0 | 96.2 | 30 / 35 | 6600 |
| 6 | 1 | 72.2 | 95.2 | 30 / 35 | 6652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 76 | 89% |
| radnor.DoctorBob 1.42 | 57 | 95% |
| kawigi.nano.Lib 1.0 | 47 | 98% |
| adt.Ar1 2.1 | 4 | 100% |
| urdos.URDOS 1.3 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 10 | 34% | 72 |
| radnor.DoctorBob 1.42 | 7 | 24% | 56 |
| kawigi.nano.Lib 1.0 | 6 | 21% | 44 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 7% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 7% | 2 |
| oa.weak.FlyMk1 0.1 | 1 | 3% | 9 |
| urdos.URDOS 1.3 | 1 | 3% | 8 |
| adt.Ar1 2.1 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 127782 melee ticks, 42375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 67 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 38586 sent, 34100 reached their opponent, 8824 virtual hits (25.9% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484996. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 101 over 6 battles (16.8 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.3 | 45 / 210 | 2.05 | 18.4% | 35215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.4% | 145 |
| hadur117.Hadur 3.21n3 | 2.0 | 18.4% | 45 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.7% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 10 |
| josago.Jorgito 0.16 | 5.5 | 8.7% | 1 |
| css.Delitioner 0.11 | 6.0 | 8.1% | 1 |
| tj.zombie1n 1.0.1 | 6.7 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.2 | 3.5% | 1 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.5 | 89.5 | 8 / 35 | 5922 |
| 2 | 2 | 69.7 | 89.5 | 10 / 35 | 5682 |
| 3 | 2 | 68.7 | 86.3 | 7 / 35 | 5862 |
| 4 | 2 | 68.7 | 87.6 | 3 / 35 | 5791 |
| 5 | 2 | 69.8 | 87.9 | 9 / 35 | 6007 |
| 6 | 2 | 69.8 | 88.9 | 8 / 35 | 5951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 143 | 17% |
| apc.LeeroyJenkins2 1.0 | 16 | 75% |
| TNT.TNT 0.99.1 | 13 | 46% |
| css.Delitioner 0.11 | 2 | 100% |
| josago.Jorgito 0.16 | 2 | 50% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 165 of 210 rounds, at a mean tick of 1374. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 130 | 79% | 157 |
| apc.LeeroyJenkins2 1.0 | 15 | 9% | 25 |
| TNT.TNT 0.99.1 | 11 | 7% | 15 |
| josago.Jorgito 0.16 | 4 | 2% | 6 |
| css.Delitioner 0.11 | 2 | 1% | 5 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |

Posture (Hadur's M records, 200 rounds): 185026 melee ticks, 89110 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 65 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 56606 sent, 51956 reached their opponent, 7568 virtual hits (14.6% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493945. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 6 battles (21.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 80.1 | 34 / 210 | 2.79 | 15.7% | 25230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 17.9% | 102 |
| justin.DemonicRage 3.4 | 2.2 | 16.6% | 53 |
| hadur117.Hadur 3.21n3 | 2.8 | 15.7% | 34 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 11 |
| axeBots.HataMoto 3.09 | 5.5 | 8.7% | 6 |
| ms.Ares 0.19 | 5.5 | 9.1% | 4 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 8.8 | 4.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 80.6 | 6 / 35 | 4260 |
| 2 | 3 | 65.9 | 83.2 | 7 / 35 | 4104 |
| 3 | 2 | 65.5 | 81.9 | 6 / 35 | 4289 |
| 4 | 3 | 65.0 | 80.0 | 6 / 35 | 4064 |
| 5 | 3 | 65.2 | 79.4 | 5 / 35 | 4430 |
| 6 | 3 | 63.5 | 75.6 | 4 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 46 | 33% |
| cb.fire.Firestarter 2.0f | 36 | 3% |
| wompi.Numbat 2.1 | 22 | 82% |
| ms.Ares 0.19 | 1 | 0% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 176 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 62 | 35% | 73 |
| cb.fire.Firestarter 2.0f | 62 | 35% | 67 |
| wompi.Numbat 2.1 | 36 | 20% | 52 |
| axeBots.HataMoto 3.09 | 10 | 6% | 10 |
| ms.Ares 0.19 | 5 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 2 |

Posture (Hadur's M records, 203 rounds): 157332 melee ticks, 43115 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 74 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 48098 sent, 43277 reached their opponent, 7303 virtual hits (16.9% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475278. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.6 | 150 / 210 | 1.66 | 20.9% | 35300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 20.9% | 150 |
| jekl.StoneGhost 0.7 | 2.2 | 14.4% | 14 |
| origin.SleepSiphon 1.7b | 2.8 | 13.2% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.7% | 7 |
| mld.Wisdom 1.0 | 4.8 | 10.3% | 2 |
| gg.Wolverine 2.0 | 5.8 | 8.9% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.7% | 3 |
| DBall.NUKE 0.1 | 8.3 | 5.6% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 5.6% | 1 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.7 | 27 / 35 | 5810 |
| 2 | 1 | 71.8 | 93.3 | 25 / 35 | 6070 |
| 3 | 1 | 72.2 | 93.7 | 27 / 35 | 6094 |
| 4 | 1 | 71.4 | 91.7 | 24 / 35 | 5718 |
| 5 | 1 | 70.4 | 89.5 | 20 / 35 | 5648 |
| 6 | 1 | 72.1 | 94.9 | 27 / 35 | 5960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 70 | 91% |
| origin.SleepSiphon 1.7b | 52 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 88% |
| gg.Wolverine 2.0 | 11 | 91% |
| mld.Wisdom 1.0 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| spinnercat.Omen 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 23 | 38% | 77 |
| jekl.StoneGhost 0.7 | 15 | 25% | 67 |
| pe.minimelee.SandboxMiniMelee 1.1 | 11 | 18% | 29 |
| mld.Wisdom 1.0 | 5 | 8% | 12 |
| gg.Wolverine 2.0 | 3 | 5% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 8 |
| DBall.NUKE 0.1 | 1 | 2% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 146130 melee ticks, 44929 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 37 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45205 sent, 40638 reached their opponent, 8974 virtual hits (22.1% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21n3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490833. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 103 over 6 battles (17.2 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.9 | 97.8 | 180 / 210 | 1.18 | 26.6% | 46961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 26.6% | 180 |
| rtk.Tachikoma 1.0 | 2.0 | 18.8% | 18 |
| oog.melee.CapuletDroid 1.1 | 3.2 | 12.8% | 6 |
| franzor.Lizt 1.3.1 | 3.8 | 12.1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 5.5 | 9.4% | 0 |
| exauge.GateKeeper 1.1.121g | 5.5 | 8.7% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.2% | 0 |
| sample.Target 1.0 | 8.3 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 8.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 76.6 | 98.9 | 32 / 35 | 8043 |
| 2 | 1 | 76.5 | 99.3 | 33 / 35 | 8284 |
| 3 | 1 | 75.8 | 97.5 | 30 / 35 | 7882 |
| 4 | 1 | 75.5 | 97.5 | 30 / 35 | 7477 |
| 5 | 1 | 76.2 | 98.2 | 30 / 35 | 7845 |
| 6 | 1 | 74.7 | 95.4 | 25 / 35 | 7430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 122 | 87% |
| oog.melee.CapuletDroid 1.1 | 45 | 93% |
| franzor.Lizt 1.3.1 | 35 | 89% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 1858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 20 | 67% | 128 |
| franzor.Lizt 1.3.1 | 6 | 20% | 5 |
| oog.melee.CapuletDroid 1.1 | 4 | 13% | 62 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 7 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 196984 melee ticks, 88819 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 34 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 54673 sent, 50678 reached their opponent, 10823 virtual hits (21.4% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21n3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475894. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 291 over 6 battles (48.5 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.4 | 153 / 210 | 1.53 | 23.0% | 32081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 23.0% | 153 |
| tm.Yuugao 1.0 | 2.3 | 15.1% | 27 |
| shrub.Vapour v159 | 2.7 | 14.5% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 4.2 | 10.8% | 2 |
| m3thos.Eva00 1.1 | 5.5 | 9.7% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 5.5 | 9.1% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.5 | 6.5% | 0 |
| SHAM.WOW 1.4 | 8.0 | 5.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 96.1 | 26 / 35 | 5412 |
| 2 | 1 | 70.4 | 91.4 | 23 / 35 | 5072 |
| 3 | 1 | 69.7 | 88.6 | 22 / 35 | 5071 |
| 4 | 1 | 72.5 | 95.7 | 29 / 35 | 5862 |
| 5 | 1 | 71.7 | 94.6 | 28 / 35 | 5416 |
| 6 | 1 | 71.7 | 93.9 | 25 / 35 | 5248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 70 | 79% |
| shrub.Vapour v159 | 56 | 80% |
| com.spp.robocode.MostlyHarmless 010 | 25 | 96% |
| m3thos.Eva00 1.1 | 15 | 93% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 24 | 42% | 77 |
| shrub.Vapour v159 | 17 | 30% | 58 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 11% | 27 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 9% | 18 |
| m3thos.Eva00 1.1 | 3 | 5% | 19 |
| qualidafial.MajorDick 1.0.1 | 2 | 4% | 3 |
| SHAM.WOW 1.4 | 0 | 0% | 7 |

Posture (Hadur's M records, 198 rounds): 145899 melee ticks, 50896 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 2.

Targeting waves (198 rounds): 44035 sent, 39967 reached their opponent, 7632 virtual hits (19.1% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480294. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.9 | 64 / 210 | 2.80 | 16.2% | 23444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.9% | 103 |
| hadur117.Hadur 3.21n3 | 1.7 | 16.2% | 64 |
| kc.micro.Figment 1.0 | 3.0 | 14.1% | 23 |
| yagami.Tidus 0.11 | 4.5 | 10.8% | 0 |
| pedersen.Grishnakh 1.0 | 5.0 | 9.7% | 11 |
| mc2.enemy.Original 0.9 | 5.5 | 9.4% | 9 |
| dft.Calliope 5.6 | 7.0 | 7.2% | 0 |
| step.nanoPri 1.0 | 8.2 | 5.6% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.3% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 80.0 | 9 / 35 | 3944 |
| 2 | 1 | 66.5 | 84.4 | 12 / 35 | 4122 |
| 3 | 2 | 64.4 | 76.2 | 10 / 35 | 3899 |
| 4 | 1 | 67.3 | 84.4 | 16 / 35 | 4251 |
| 5 | 2 | 65.5 | 81.0 | 11 / 35 | 3858 |
| 6 | 2 | 62.4 | 73.7 | 6 / 35 | 3370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 35% |
| kc.micro.Figment 1.0 | 36 | 78% |
| pedersen.Grishnakh 1.0 | 10 | 20% |
| mc2.enemy.Original 0.9 | 9 | 44% |
| yagami.Tidus 0.11 | 8 | 100% |
| dft.Calliope 5.6 | 2 | 100% |
| rdm.Dueler 0.4x | 1 | 0% |

Hadur died in 147 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 55 | 37% | 79 |
| kc.micro.Figment 1.0 | 29 | 20% | 53 |
| mc2.enemy.Original 0.9 | 21 | 14% | 25 |
| pedersen.Grishnakh 1.0 | 19 | 13% | 21 |
| yagami.Tidus 0.11 | 10 | 7% | 17 |
| dft.Calliope 5.6 | 4 | 3% | 7 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 2 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 144405 melee ticks, 43978 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 91 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 91 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47403 sent, 42917 reached their opponent, 6211 virtual hits (14.5% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484859. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 6 battles (33.8 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 95.4 | 169 / 210 | 1.41 | 20.9% | 35184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 20.9% | 169 |
| DTF.Kludgy 1.2b | 2.2 | 14.3% | 21 |
| ne.Chimera 1.2 | 3.2 | 12.8% | 5 |
| ejb.Polaris 1.0.1 | 3.8 | 12.4% | 10 |
| vStar.RAFzilla 2.15 | 5.0 | 10.4% | 3 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.8% | 1 |
| sam.Samspin 1.0 | 7.7 | 5.3% | 1 |
| kurios.DOSexe .9b | 7.7 | 5.7% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 4.6% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.0 | 28 / 35 | 5654 |
| 2 | 1 | 71.7 | 96.2 | 25 / 35 | 5968 |
| 3 | 1 | 72.5 | 97.1 | 31 / 35 | 6092 |
| 4 | 1 | 72.1 | 97.8 | 31 / 35 | 5793 |
| 5 | 1 | 71.0 | 94.0 | 28 / 35 | 5695 |
| 6 | 1 | 71.3 | 93.3 | 26 / 35 | 5982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 71 | 80% |
| ejb.Polaris 1.0.1 | 44 | 95% |
| ne.Chimera 1.2 | 37 | 92% |
| vStar.RAFzilla 2.15 | 20 | 95% |
| tvv.micro.Antares 1.1.1 | 11 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| sam.Samspin 1.0 | 2 | 50% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 18 | 44% | 72 |
| ne.Chimera 1.2 | 10 | 24% | 40 |
| ejb.Polaris 1.0.1 | 6 | 15% | 53 |
| tvv.micro.Antares 1.1.1 | 3 | 7% | 13 |
| vStar.RAFzilla 2.15 | 2 | 5% | 20 |
| kurios.DOSexe .9b | 1 | 2% | 9 |
| sam.Samspin 1.0 | 1 | 2% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 141897 melee ticks, 57744 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 54 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 46509 sent, 41923 reached their opponent, 7938 virtual hits (18.9% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1471357. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.2 | 83 / 210 | 2.51 | 16.9% | 23655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.6% | 69 |
| hadur117.Hadur 3.21n3 | 1.5 | 16.9% | 83 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.1% | 16 |
| djc.DynaBot 0.1.1 | 4.0 | 11.2% | 15 |
| rdt199.Warlord 0.73 | 5.7 | 8.8% | 5 |
| uji.YellohFellah 1.0 | 6.0 | 8.5% | 11 |
| br2.MobyDickBot 1.6 | 6.5 | 8.3% | 11 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.0% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 4.6% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 84.4 | 8 / 35 | 3972 |
| 2 | 2 | 65.4 | 80.3 | 14 / 35 | 4197 |
| 3 | 1 | 66.5 | 85.1 | 15 / 35 | 4111 |
| 4 | 1 | 66.2 | 83.5 | 16 / 35 | 3979 |
| 5 | 1 | 67.0 | 86.7 | 17 / 35 | 3759 |
| 6 | 2 | 64.4 | 79.0 | 13 / 35 | 3637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 59 | 54% |
| djc.DynaBot 0.1.1 | 27 | 78% |
| cx.mini.Nimrod 0.55 | 21 | 67% |
| uji.YellohFellah 1.0 | 9 | 78% |
| rdt199.Warlord 0.73 | 8 | 63% |
| br2.MobyDickBot 1.6 | 7 | 57% |

Hadur died in 127 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 48 | 38% | 84 |
| cx.mini.Nimrod 0.55 | 26 | 20% | 34 |
| djc.DynaBot 0.1.1 | 18 | 14% | 37 |
| rdt199.Warlord 0.73 | 9 | 7% | 18 |
| uji.YellohFellah 1.0 | 9 | 7% | 13 |
| br2.MobyDickBot 1.6 | 9 | 7% | 13 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 6 |
| stelo.MirrorNano 1.3 | 2 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 154545 melee ticks, 40341 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 50377 sent, 45637 reached their opponent, 6273 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476994. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.8 | 121 / 210 | 2.28 | 18.2% | 25079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 18.2% | 121 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.5% | 26 |
| nat.PallasHawk 1.0 | 2.8 | 13.1% | 31 |
| darkcanuck.Leon 1.01 | 3.7 | 12.4% | 15 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.4% | 11 |
| jrm.Test0 1.0 | 6.0 | 8.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.1% | 1 |
| jp.Perpy 16.0 | 8.3 | 6.2% | 1 |
| stuff.Vlad 0.1 | 9.0 | 5.6% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.3 | 20 / 35 | 4414 |
| 2 | 1 | 66.0 | 80.3 | 19 / 35 | 4145 |
| 3 | 1 | 66.6 | 83.5 | 18 / 35 | 4106 |
| 4 | 1 | 68.6 | 89.2 | 23 / 35 | 4241 |
| 5 | 1 | 67.7 | 87.3 | 20 / 35 | 4091 |
| 6 | 1 | 68.2 | 87.9 | 21 / 35 | 4082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 49 | 78% |
| nat.PallasHawk 1.0 | 43 | 72% |
| darkcanuck.Leon 1.01 | 37 | 89% |
| brainfade.melee.Genghis 0.36 | 10 | 70% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jrm.Test0 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 19 | 21% | 45 |
| bts.wiki.RipCurl 0.9b | 18 | 20% | 44 |
| darkcanuck.Leon 1.01 | 15 | 17% | 59 |
| brainfade.melee.Genghis 0.36 | 15 | 17% | 20 |
| jrm.Test0 1.0 | 11 | 12% | 15 |
| jaybot.bots.Oddball 4.0 | 7 | 8% | 12 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 8 |
| jp.Perpy 16.0 | 1 | 1% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

Posture (Hadur's M records, 200 rounds): 128699 melee ticks, 33184 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 43 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43896 sent, 39040 reached their opponent, 6575 virtual hits (16.8% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489295. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.0 | 66 / 210 | 2.62 | 16.2% | 25578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.3% | 87 |
| ags.Glacier 0.2.11 | 2.2 | 16.2% | 30 |
| hadur117.Hadur 3.21n3 | 2.3 | 16.2% | 66 |
| shinh.Entangled 0.3 | 4.2 | 12.2% | 20 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.4% | 6 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.6% | 1 |
| ayk.WallHugger 1.0 | 8.5 | 4.8% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 86.3 | 13 / 35 | 4277 |
| 2 | 1 | 67.7 | 87.6 | 19 / 35 | 4511 |
| 3 | 3 | 65.6 | 81.3 | 10 / 35 | 4200 |
| 4 | 4 | 62.4 | 73.0 | 4 / 35 | 3862 |
| 5 | 2 | 66.3 | 83.8 | 12 / 35 | 4413 |
| 6 | 3 | 64.9 | 80.0 | 8 / 35 | 4315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 49 | 29% |
| ags.Glacier 0.2.11 | 47 | 74% |
| shinh.Entangled 0.3 | 19 | 47% |
| gh.micro.Gruweltje 0.7 | 11 | 73% |

Hadur died in 144 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 49 | 34% | 83 |
| mn.Combat 3.25.0 | 48 | 33% | 67 |
| shinh.Entangled 0.3 | 23 | 16% | 27 |
| gh.micro.Gruweltje 0.7 | 11 | 8% | 17 |
| apc.Colossus2 0.17 | 5 | 3% | 6 |
| stelo.Wang 1.0 | 4 | 3% | 6 |
| maribo.FollowFire 1 | 4 | 3% | 4 |

Posture (Hadur's M records, 201 rounds): 143282 melee ticks, 41411 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 90 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 90 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 42493 sent, 37540 reached their opponent, 6147 virtual hits (16.4% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21n3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1497209. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 165 over 6 battles (27.5 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 97.4 | 189 / 210 | 1.21 | 24.4% | 37400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 24.4% | 189 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 17.2% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 3.8 | 11.0% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 3.8 | 11.5% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 10.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.8% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.6% | 0 |
| pa.Improved 1.0 | 8.0 | 6.2% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.2 | 99.3 | 33 / 35 | 6637 |
| 2 | 1 | 73.8 | 99.3 | 33 / 35 | 6337 |
| 3 | 1 | 71.8 | 92.1 | 30 / 35 | 5779 |
| 4 | 1 | 73.1 | 96.8 | 31 / 35 | 6193 |
| 5 | 1 | 73.2 | 97.5 | 29 / 35 | 6258 |
| 6 | 1 | 73.5 | 99.3 | 33 / 35 | 6196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 126 | 94% |
| sanyi.mikrobi.Roberto 1.0 | 32 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 78% |
| Lo_Ian.Gandalf_V4 4.0 | 10 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 21 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 12 | 57% | 108 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 19% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 10% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 5% | 47 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 5% | 16 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 5% | 11 |
| pa.Improved 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 129622 melee ticks, 50251 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 37729 sent, 33778 reached their opponent, 8794 virtual hits (26.0% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486919. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.0 | 117 / 210 | 2.26 | 18.8% | 31271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 18.8% | 117 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.3% | 21 |
| emp.Yngwie 1.11 | 3.2 | 12.8% | 45 |
| mld.DustBunny 3.8 | 3.5 | 12.3% | 12 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.5% | 3 |
| kawigi.robot.Girl 1.2 | 6.2 | 8.9% | 12 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.6% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 5.0% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.1 | 23 / 35 | 5188 |
| 2 | 1 | 67.9 | 82.9 | 16 / 35 | 5426 |
| 3 | 1 | 69.5 | 88.6 | 21 / 35 | 5414 |
| 4 | 1 | 70.3 | 90.5 | 23 / 35 | 5404 |
| 5 | 1 | 65.8 | 77.5 | 15 / 35 | 4538 |
| 6 | 1 | 68.8 | 85.7 | 19 / 35 | 5301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 52 | 94% |
| emp.Yngwie 1.11 | 51 | 57% |
| mld.DustBunny 3.8 | 20 | 90% |
| kawigi.robot.Girl 1.2 | 15 | 67% |
| cb.nano.Insomnia 1.0 | 7 | 100% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 32 | 34% | 72 |
| kawigi.robot.Girl 1.2 | 16 | 17% | 18 |
| mld.DustBunny 3.8 | 14 | 15% | 39 |
| kawigi.micro.Shiz 1.1 | 13 | 14% | 38 |
| cb.nano.Insomnia 1.0 | 12 | 13% | 19 |
| divineomega.TrialBot 0.003 | 5 | 5% | 15 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 3 |
| lambdaxy.TBot 0.1 | 0 | 0% | 5 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 153669 melee ticks, 39271 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 51416 sent, 46669 reached their opponent, 7718 virtual hits (16.5% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477227. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 192 over 6 battles (32.0 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.2 | 133 / 210 | 1.79 | 20.6% | 36083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 20.6% | 133 |
| gh.Griezel 0.5.2 | 2.0 | 16.0% | 48 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.6% | 22 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.0% | 1 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.5% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 8.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 4.7% | 1 |
| asd.Cthulhu 1.3 | 9.0 | 4.6% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.2 | 21 / 35 | 5696 |
| 2 | 1 | 70.4 | 87.6 | 21 / 35 | 5864 |
| 3 | 1 | 70.4 | 89.5 | 21 / 35 | 5898 |
| 4 | 1 | 72.1 | 94.6 | 24 / 35 | 6193 |
| 5 | 1 | 71.3 | 91.4 | 21 / 35 | 6178 |
| 6 | 1 | 72.2 | 94.0 | 25 / 35 | 6254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 97 | 66% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 97% |
| techdude.forest.FlamingForest 1.1 | 29 | 59% |
| bvh.fnr.Fenrir 0.36l | 8 | 100% |
| stelo.IntrinsicVolatility 1.4 | 8 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 50% |

Hadur died in 79 of 210 rounds, at a mean tick of 1226. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 43 | 54% | 112 |
| techdude.forest.FlamingForest 1.1 | 13 | 16% | 34 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 11% | 25 |
| bvh.fnr.Fenrir 0.36l | 7 | 9% | 10 |
| stelo.IntrinsicVolatility 1.4 | 3 | 4% | 14 |
| tvv.nano.Polaris 1.2 | 3 | 4% | 7 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 6 |
| asd.Cthulhu 1.3 | 0 | 0% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 168313 melee ticks, 72852 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 54618 sent, 49967 reached their opponent, 8626 virtual hits (17.3% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483571. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 151 over 6 battles (25.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.6 | 112 / 210 | 1.94 | 19.8% | 34959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 19.8% | 112 |
| et.Predator 1.8 | 2.3 | 13.8% | 21 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.1% | 30 |
| cx.BlestPain 1.41 | 3.8 | 12.0% | 34 |
| ahf.NanoAndrew .4 | 5.3 | 10.2% | 6 |
| nic.Nicator 2.4 | 6.2 | 9.0% | 4 |
| maribo.melee.BMV 0.1 | 6.5 | 8.9% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 2 |
| tex.Longbot 0.4 | 8.5 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.8 | 15 / 35 | 5648 |
| 2 | 1 | 70.3 | 88.6 | 21 / 35 | 5846 |
| 3 | 1 | 70.3 | 89.5 | 17 / 35 | 5940 |
| 4 | 1 | 70.6 | 91.7 | 20 / 35 | 5925 |
| 5 | 1 | 70.0 | 88.6 | 20 / 35 | 5809 |
| 6 | 1 | 70.2 | 88.3 | 19 / 35 | 5791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 61 | 77% |
| oog.melee.Mercutio 1.0 | 56 | 71% |
| cx.BlestPain 1.41 | 34 | 35% |
| ahf.NanoAndrew .4 | 9 | 89% |
| edu.otg.spr.TheTeacher 1.2 | 4 | 75% |
| maribo.melee.BMV 0.1 | 2 | 50% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1153. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 29 | 29% | 49 |
| et.Predator 1.8 | 25 | 25% | 62 |
| oog.melee.Mercutio 1.0 | 23 | 23% | 59 |
| ahf.NanoAndrew .4 | 14 | 14% | 23 |
| maribo.melee.BMV 0.1 | 3 | 3% | 4 |
| nic.Nicator 2.4 | 2 | 2% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 3 |
| tex.Longbot 0.4 | 1 | 1% | 3 |

Posture (Hadur's M records, 199 rounds): 165520 melee ticks, 62692 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 55 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 53461 sent, 48796 reached their opponent, 10016 virtual hits (20.5% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21n3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484965. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 262 over 6 battles (43.7 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 94.2 | 166 / 210 | 1.47 | 23.2% | 30599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 23.2% | 166 |
| agd.Mooserwirt2 2.7 | 2.0 | 14.3% | 14 |
| uji.DBH 1.1 | 3.0 | 12.8% | 13 |
| sigterm.Sigterm 1.0 | 4.3 | 11.0% | 8 |
| spinnercat.Robovirus 2.718 | 4.8 | 9.9% | 2 |
| ratosh.Nobo 0.21 | 6.7 | 8.3% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 6.7 | 8.3% | 5 |
| stelo.WangRobot 1.0 | 8.2 | 6.2% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.1 | 29 / 35 | 5290 |
| 2 | 1 | 71.9 | 95.0 | 30 / 35 | 5267 |
| 3 | 1 | 68.9 | 88.2 | 25 / 35 | 4536 |
| 4 | 1 | 71.4 | 95.7 | 27 / 35 | 5200 |
| 5 | 1 | 70.8 | 93.6 | 26 / 35 | 4945 |
| 6 | 1 | 72.2 | 96.4 | 29 / 35 | 5361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 57 | 89% |
| uji.DBH 1.1 | 50 | 88% |
| sigterm.Sigterm 1.0 | 43 | 81% |
| kawigi.mini.Fhqwhgads 1.1 | 13 | 77% |
| stelo.WangRobot 1.0 | 10 | 100% |
| spinnercat.Robovirus 2.718 | 8 | 100% |
| ratosh.Nobo 0.21 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 12 | 27% | 49 |
| agd.Mooserwirt2 2.7 | 11 | 25% | 51 |
| sigterm.Sigterm 1.0 | 10 | 23% | 42 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 14% | 21 |
| spinnercat.Robovirus 2.718 | 3 | 7% | 19 |
| ratosh.Nobo 0.21 | 1 | 2% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 2% | 9 |
| stelo.WangRobot 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 198 rounds): 130107 melee ticks, 56195 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 70 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 40065 sent, 35909 reached their opponent, 8134 virtual hits (22.7% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480090. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 98.5 | 200 / 210 | 1.14 | 22.7% | 37822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 22.7% | 200 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 5 |
| mld.Infinity 2.2 | 3.3 | 12.1% | 3 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.0% | 0 |
| erdnis.Rover 0.3 | 4.8 | 10.6% | 1 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.5% | 1 |
| mbh.Mbh 0.1 | 6.7 | 7.8% | 0 |
| pac.ABC 2.1 | 8.2 | 6.1% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.7 | 100.0 | 35 / 35 | 6857 |
| 2 | 1 | 72.9 | 96.8 | 31 / 35 | 5975 |
| 3 | 1 | 73.7 | 98.7 | 33 / 35 | 6131 |
| 4 | 1 | 74.6 | 100.0 | 35 / 35 | 6622 |
| 5 | 1 | 73.5 | 97.5 | 33 / 35 | 6213 |
| 6 | 1 | 73.4 | 97.8 | 33 / 35 | 6024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 126 | 99% |
| krillr.mini.JointStrike 2.0.0 | 25 | 100% |
| mld.Infinity 2.2 | 24 | 96% |
| erdnis.Rover 0.3 | 12 | 100% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 10 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 30% | 70 |
| krillr.mini.JointStrike 2.0.0 | 3 | 30% | 27 |
| erdnis.Rover 0.3 | 2 | 20% | 36 |
| mld.Infinity 2.2 | 2 | 20% | 32 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 16 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |
| pac.ABC 2.1 | 0 | 0% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 127489 melee ticks, 47278 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 35 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42445 sent, 37968 reached their opponent, 8799 virtual hits (23.2% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474761. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 125 over 6 battles (20.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 95.1 | 161 / 210 | 1.44 | 21.7% | 37019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 21.7% | 161 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 25 |
| catcat20.Rabbit 0.001 | 3.5 | 11.1% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.2% | 2 |
| fwb.Nine 1.0.1 | 4.3 | 11.0% | 7 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.5% | 0 |
| bayen.nut.Squirrel 1.615 | 7.7 | 6.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.0 | 5.9% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.5 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.9 | 26 / 35 | 5821 |
| 2 | 1 | 71.8 | 95.2 | 25 / 35 | 5815 |
| 3 | 1 | 73.0 | 96.2 | 27 / 35 | 6681 |
| 4 | 1 | 72.4 | 94.6 | 26 / 35 | 6362 |
| 5 | 1 | 72.7 | 97.8 | 29 / 35 | 6162 |
| 6 | 1 | 71.7 | 92.1 | 28 / 35 | 6178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 98 | 84% |
| fwb.Nine 1.0.1 | 44 | 93% |
| catcat20.Rabbit 0.001 | 30 | 77% |
| nz.jdc.nano.GridFu 1.0 | 11 | 91% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 29 | 58% | 105 |
| catcat20.Rabbit 0.001 | 13 | 26% | 46 |
| fwb.Nine 1.0.1 | 3 | 6% | 14 |
| nz.jdc.nano.GridFu 1.0 | 2 | 4% | 14 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 14 |
| bayen.nut.Squirrel 1.615 | 1 | 2% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 4 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 161812 melee ticks, 59812 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50465 sent, 45911 reached their opponent, 10156 virtual hits (22.1% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474400. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 115 over 6 battles (19.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 95.6 | 153 / 210 | 1.40 | 21.7% | 37431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 21.7% | 153 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 45 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.2% | 4 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 5 |
| eld.Hmm 1.0 | 5.2 | 8.1% | 3 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.4% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 95.2 | 26 / 35 | 6609 |
| 2 | 1 | 72.3 | 96.2 | 25 / 35 | 5957 |
| 3 | 1 | 73.2 | 97.1 | 27 / 35 | 6476 |
| 4 | 1 | 72.1 | 95.2 | 27 / 35 | 5951 |
| 5 | 1 | 72.8 | 95.9 | 25 / 35 | 6370 |
| 6 | 1 | 71.7 | 94.0 | 23 / 35 | 6068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 139 | 74% |
| dummy.mini.Scimitar 1.01 | 26 | 88% |
| cf.RiO.RiOx 4.2.1 | 22 | 91% |
| eld.Hmm 1.0 | 9 | 67% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 1367. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 38 | 66% | 108 |
| dummy.mini.Scimitar 1.01 | 11 | 19% | 57 |
| cf.RiO.RiOx 4.2.1 | 5 | 9% | 25 |
| eld.Hmm 1.0 | 4 | 7% | 17 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 172239 melee ticks, 90847 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 51096 sent, 46549 reached their opponent, 8180 virtual hits (17.6% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21n3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492217. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.8 | 123 / 210 | 1.81 | 20.8% | 26919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.2 | 20.8% | 123 |
| pe.SandboxDT 2.71m | 2.2 | 16.7% | 50 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.3% | 21 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.5% | 13 |
| bigpete.Stewie 1.0 | 4.8 | 10.7% | 3 |
| yk.JahRoslav 1.1 | 6.8 | 6.2% | 0 |
| tad.Dalek98 0.98 | 6.8 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.9 | 22 / 35 | 4527 |
| 2 | 1 | 70.7 | 93.9 | 24 / 35 | 4674 |
| 3 | 1 | 68.6 | 87.5 | 18 / 35 | 4412 |
| 4 | 1 | 71.0 | 92.1 | 25 / 35 | 4918 |
| 5 | 2 | 66.5 | 84.3 | 13 / 35 | 3907 |
| 6 | 1 | 69.6 | 92.1 | 21 / 35 | 4481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 51 | 53% |
| kvk.HebusLeTroll 0.35 | 48 | 79% |
| jlm.javaDisturbance 0.59 | 46 | 87% |
| bigpete.Stewie 1.0 | 16 | 88% |
| tad.Dalek98 0.98 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 38 | 44% | 74 |
| kvk.HebusLeTroll 0.35 | 25 | 29% | 48 |
| jlm.javaDisturbance 0.59 | 17 | 20% | 57 |
| bigpete.Stewie 1.0 | 5 | 6% | 16 |
| tad.Dalek98 0.98 | 1 | 1% | 9 |
| pbg.NinjaX 1.2 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 151012 melee ticks, 50634 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 24 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44922 sent, 40866 reached their opponent, 5595 virtual hits (13.7% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472006. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 96.9 | 183 / 210 | 1.28 | 22.4% | 39278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 22.4% | 183 |
| pe.SandboxLump 1.52 | 2.0 | 16.8% | 21 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 2 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.7% | 1 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.3% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.4% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.2% | 0 |
| sample.Walls 1.0 | 8.0 | 6.5% | 1 |
| rrh.Iwillfindyou 2.0 | 9.0 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 97.5 | 31 / 35 | 6647 |
| 2 | 1 | 74.3 | 99.0 | 32 / 35 | 6487 |
| 3 | 1 | 73.2 | 95.9 | 30 / 35 | 6468 |
| 4 | 1 | 73.7 | 95.9 | 31 / 35 | 6585 |
| 5 | 1 | 73.6 | 95.6 | 29 / 35 | 6812 |
| 6 | 1 | 73.5 | 97.5 | 30 / 35 | 6279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 124 | 93% |
| cre.Karolos 0.32 | 43 | 100% |
| stelo.AreaTargetingBot 1.1 | 7 | 100% |
| stelo.RamTrackSurfer 1.2 | 6 | 67% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 12 | 44% | 115 |
| cre.Karolos 0.32 | 10 | 37% | 46 |
| stelo.RamTrackSurfer 1.2 | 3 | 11% | 14 |
| stelo.AreaTargetingBot 1.1 | 1 | 4% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 4% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 7 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 124457 melee ticks, 51452 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 39111 sent, 34423 reached their opponent, 10036 virtual hits (29.2% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1473128. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.4 | 91 / 210 | 2.40 | 17.5% | 25851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 17.5% | 91 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.2% | 44 |
| florent.XSeries.X2 0.12 | 3.3 | 13.3% | 21 |
| davidalves.Phoenix 0.54 | 3.5 | 13.1% | 36 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.1% | 12 |
| oog.melee.Corsair 1.0 | 5.8 | 9.7% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.1% | 3 |
| lunchie.Lunchbox 0.93 | 8.5 | 5.5% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.0% | 1 |
| evd.X1 0.01 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.0 | 17 / 35 | 4277 |
| 2 | 1 | 68.8 | 89.2 | 19 / 35 | 4339 |
| 3 | 1 | 68.6 | 88.9 | 20 / 35 | 4577 |
| 4 | 1 | 66.1 | 83.2 | 14 / 35 | 4235 |
| 5 | 1 | 65.4 | 80.0 | 12 / 35 | 4257 |
| 6 | 1 | 64.7 | 78.1 | 9 / 35 | 4166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 42 | 60% |
| rz.GlowBlowMelee 1.4 | 39 | 59% |
| florent.XSeries.X2 0.12 | 26 | 77% |
| pedersen.Ugluk 1.1.1 | 17 | 71% |
| oog.melee.Corsair 1.0 | 6 | 100% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 34 | 28% | 57 |
| rz.GlowBlowMelee 1.4 | 31 | 26% | 54 |
| davidalves.Phoenix 0.54 | 27 | 22% | 41 |
| oog.melee.Corsair 1.0 | 10 | 8% | 28 |
| pedersen.Ugluk 1.1.1 | 9 | 7% | 14 |
| stelo.SoJNanoMelee 1.1 | 7 | 6% | 8 |
| as.FrankTheTank 1.3 | 1 | 1% | 5 |
| evd.X1 0.01 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 141349 melee ticks, 35082 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 78 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45901 sent, 41105 reached their opponent, 7458 virtual hits (18.1% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21n3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480753. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.6 | 145 / 210 | 1.83 | 21.1% | 23115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 21.1% | 145 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 15.2% | 20 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 14.9% | 16 |
| jdw.Hurricane 1.4 | 4.2 | 11.9% | 15 |
| ds.Oo 2.2 | 4.8 | 10.1% | 8 |
| adt.Ar2 1.1 | 6.7 | 7.5% | 3 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.1% | 2 |
| awesomeness.Elite 1.0 | 7.7 | 6.7% | 0 |
| amk.ChumbaMini 0.2 | 8.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.8 | 26 / 35 | 3809 |
| 2 | 1 | 69.6 | 90.0 | 24 / 35 | 4059 |
| 3 | 1 | 67.4 | 83.9 | 23 / 35 | 3662 |
| 4 | 1 | 68.7 | 90.4 | 21 / 35 | 3768 |
| 5 | 1 | 68.6 | 88.2 | 25 / 35 | 3836 |
| 6 | 1 | 70.1 | 93.6 | 26 / 35 | 3981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 58 | 93% |
| voidious.mini.BrokenSword 2.0.3 | 45 | 84% |
| jdw.Hurricane 1.4 | 28 | 86% |
| ds.Oo 2.2 | 18 | 78% |
| awesomeness.Elite 1.0 | 6 | 100% |
| gjr.Cephalosporin 0.1 | 6 | 83% |
| amk.ChumbaMini 0.2 | 4 | 75% |
| adt.Ar2 1.1 | 3 | 33% |

Hadur died in 66 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ds.Oo 2.2 | 15 | 23% | 32 |
| voidious.mini.BrokenSword 2.0.3 | 13 | 20% | 57 |
| jdw.Hurricane 1.4 | 13 | 20% | 32 |
| voidious.micro.BlitzBat 1.05 | 12 | 18% | 46 |
| awesomeness.Elite 1.0 | 5 | 8% | 16 |
| adt.Ar2 1.1 | 4 | 6% | 9 |
| amk.ChumbaMini 0.2 | 3 | 5% | 6 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 12 |

Posture (Hadur's M records, 201 rounds): 122105 melee ticks, 29953 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 39724 sent, 35529 reached their opponent, 5926 virtual hits (16.7% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474626. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 192 over 6 battles (32.0 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 93.9 | 152 / 210 | 1.55 | 21.6% | 40909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 21.6% | 152 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 30 |
| shu.nitro.LENIN .T34 | 3.2 | 12.2% | 14 |
| lrem.Spectre 0.4.4 | 3.8 | 12.1% | 11 |
| js.PinBall 1.6 | 5.2 | 10.1% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.5% | 0 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.3% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.4 | 25 / 35 | 6784 |
| 2 | 1 | 72.4 | 91.1 | 24 / 35 | 6644 |
| 3 | 1 | 72.7 | 93.0 | 25 / 35 | 6952 |
| 4 | 1 | 73.6 | 96.8 | 28 / 35 | 6906 |
| 5 | 1 | 73.4 | 98.1 | 29 / 35 | 6941 |
| 6 | 1 | 71.9 | 91.7 | 21 / 35 | 6682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 72 | 78% |
| shu.nitro.LENIN .T34 | 45 | 87% |
| lrem.Spectre 0.4.4 | 45 | 80% |
| js.PinBall 1.6 | 10 | 90% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 28 | 47% | 80 |
| lrem.Spectre 0.4.4 | 11 | 19% | 40 |
| shu.nitro.LENIN .T34 | 10 | 17% | 53 |
| js.PinBall 1.6 | 5 | 8% | 19 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 7% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 6 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 153682 melee ticks, 48502 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49526 sent, 44877 reached their opponent, 10945 virtual hits (24.4% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472465. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.0 | 151 / 210 | 2.44 | 19.4% | 33103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.3 | 19.4% | 151 |
| mk.Alpha 0.2.1 | 2.0 | 13.6% | 26 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.1% | 9 |
| EH.Eagle 1.0.6 | 4.5 | 10.2% | 1 |
| wee.Gem 1.8.4 | 4.8 | 9.7% | 17 |
| throxbot.ThroxBot 0.1 | 6.3 | 8.4% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.8% | 2 |
| joe.ADinosaur 1.0 | 6.8 | 8.4% | 2 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.7 | 30 / 35 | 5647 |
| 2 | 1 | 72.2 | 95.2 | 31 / 35 | 6108 |
| 3 | 2 | 60.5 | 58.1 | 12 / 35 | 4843 |
| 4 | 1 | 71.9 | 96.2 | 31 / 35 | 5749 |
| 5 | 2 | 62.1 | 61.9 | 16 / 35 | 4636 |
| 6 | 1 | 73.0 | 98.7 | 31 / 35 | 6120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 83 | 90% |
| EH.Eagle 1.0.6 | 31 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 93% |
| throxbot.ThroxBot 0.1 | 11 | 82% |
| wee.Gem 1.8.4 | 9 | 100% |
| joe.ADinosaur 1.0 | 7 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 18 | 31% | 20 |
| mk.Alpha 0.2.1 | 14 | 24% | 67 |
| EH.Eagle 1.0.6 | 6 | 10% | 32 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 10% | 22 |
| joe.ADinosaur 1.0 | 6 | 10% | 15 |
| throxbot.ThroxBot 0.1 | 5 | 8% | 15 |
| wee.Gem 1.8.4 | 3 | 5% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 10 |
| caimano.Furia_Ceca 0.22 | 0 | 0% | 8 |

Posture (Hadur's M records, 199 rounds): 115074 melee ticks, 35080 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 42 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38133 sent, 33548 reached their opponent, 8972 virtual hits (26.7% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485609. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 191 over 6 battles (31.8 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 88.4 | 129 / 210 | 2.04 | 18.4% | 24416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.2 | 18.4% | 129 |
| kid.test.NightFox .2 | 2.0 | 15.3% | 34 |
| uji.Antique 1.0 | 2.8 | 12.5% | 28 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.8% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.1% | 7 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.5% | 2 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.2% | 4 |
| matt.advanced.Katana 1.0 | 8.7 | 6.0% | 2 |
| stelo.Lifestealer 1.0 | 9.0 | 5.3% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 84.4 | 16 / 35 | 3382 |
| 2 | 1 | 68.4 | 90.8 | 22 / 35 | 4052 |
| 3 | 1 | 68.7 | 90.8 | 25 / 35 | 4140 |
| 4 | 1 | 67.7 | 87.9 | 22 / 35 | 3926 |
| 5 | 1 | 68.2 | 85.7 | 21 / 35 | 4743 |
| 6 | 1 | 68.9 | 90.8 | 23 / 35 | 4173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 79 | 82% |
| uji.Antique 1.0 | 43 | 81% |
| qohnil.blot.BlotBot 3.61 | 11 | 73% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| amk.ChumbaWumba 0.3 | 7 | 71% |
| ahr.ice.Ice 1.0.2 | 6 | 100% |
| matt.advanced.Katana 1.0 | 3 | 67% |

Hadur died in 82 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 23 | 28% | 54 |
| kid.test.NightFox .2 | 21 | 26% | 43 |
| amk.ChumbaWumba 0.3 | 14 | 17% | 26 |
| qohnil.blot.BlotBot 3.61 | 9 | 11% | 32 |
| pfvicm.Sobieski 7.2.3b | 9 | 11% | 22 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 17 |
| matt.advanced.Katana 1.0 | 1 | 1% | 9 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 128778 melee ticks, 35719 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 50 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43075 sent, 38310 reached their opponent, 5535 virtual hits (14.4% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492621. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.5 | 116 / 210 | 1.95 | 19.5% | 29323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 19.5% | 116 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.2% | 39 |
| deewiant.Anomaly 0.2 | 2.8 | 14.7% | 42 |
| myl.micro.Troodon 1.10 | 4.0 | 12.3% | 6 |
| jok.PheonixM 0.1.2 | 5.0 | 10.1% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.0% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.0% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.7% | 1 |
| ap.Frederick 1.1 | 9.2 | 4.3% | 0 |
| jangs.ns51 1.0 | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.2 | 21 / 35 | 4928 |
| 2 | 1 | 68.9 | 88.6 | 16 / 35 | 4460 |
| 3 | 1 | 69.1 | 87.0 | 18 / 35 | 4685 |
| 4 | 1 | 71.6 | 92.4 | 22 / 35 | 5363 |
| 5 | 1 | 69.3 | 88.6 | 20 / 35 | 4687 |
| 6 | 1 | 70.7 | 91.1 | 19 / 35 | 5200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 60% |
| zyx.mega.YersiniaPestis 3.1 | 47 | 64% |
| myl.micro.Troodon 1.10 | 24 | 96% |
| jok.PheonixM 0.1.2 | 14 | 93% |
| ph.melee.ArcherME 0.3 | 4 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 3 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 47 | 49% | 86 |
| zyx.mega.YersiniaPestis 3.1 | 29 | 30% | 68 |
| jok.PheonixM 0.1.2 | 11 | 11% | 22 |
| myl.micro.Troodon 1.10 | 7 | 7% | 25 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 2 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 160890 melee ticks, 51403 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 34 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 52700 sent, 48072 reached their opponent, 7346 virtual hits (15.3% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21n3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485201. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 80.5 | 73 / 210 | 2.56 | 18.3% | 25517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 18.3% | 73 |
| darkcanuck.B26354 1.06 | 2.3 | 15.7% | 64 |
| stelo.PastFuture 2.3.2 | 3.2 | 14.5% | 26 |
| oog.melee.Capulet 1.2 | 3.5 | 14.0% | 26 |
| intruder.PrairieWolf 2.61 | 5.0 | 10.3% | 14 |
| tripphippy.Alice 1.1 | 6.8 | 8.5% | 3 |
| ntc.Opposite 1.5 | 7.0 | 8.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.6% | 5 |
| GarmBox.Anger 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 83.2 | 13 / 35 | 4256 |
| 2 | 1 | 64.6 | 76.1 | 12 / 35 | 4409 |
| 3 | 1 | 66.5 | 83.9 | 13 / 35 | 4217 |
| 4 | 1 | 65.0 | 77.9 | 13 / 35 | 4158 |
| 5 | 1 | 65.4 | 81.8 | 12 / 35 | 4038 |
| 6 | 1 | 65.7 | 80.0 | 10 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 44 | 34% |
| stelo.PastFuture 2.3.2 | 31 | 68% |
| oog.melee.Capulet 1.2 | 27 | 63% |
| intruder.PrairieWolf 2.61 | 14 | 43% |
| tripphippy.Alice 1.1 | 11 | 91% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 40% |
| ntc.Opposite 1.5 | 2 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 49 | 35% | 67 |
| oog.melee.Capulet 1.2 | 24 | 17% | 44 |
| stelo.PastFuture 2.3.2 | 21 | 15% | 34 |
| fowl3628800.LightningBolt 2.6.0 | 14 | 10% | 15 |
| intruder.PrairieWolf 2.61 | 12 | 9% | 21 |
| tripphippy.Alice 1.1 | 12 | 9% | 17 |
| ntc.Opposite 1.5 | 6 | 4% | 10 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 160158 melee ticks, 39963 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 48 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 46875 sent, 42529 reached their opponent, 7309 virtual hits (17.2% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490357. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.7 | 78 / 210 | 2.74 | 16.5% | 23492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.5 | 16.5% | 78 |
| abc.Shadow 3.84i | 1.5 | 17.1% | 74 |
| gh.mini.Griezel 0.2 | 3.2 | 13.2% | 32 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.2% | 12 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.3% | 9 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.1% | 5 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.6% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.2% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.3 | 17 / 35 | 4015 |
| 2 | 1 | 66.5 | 85.1 | 14 / 35 | 3915 |
| 3 | 2 | 63.1 | 74.3 | 10 / 35 | 3708 |
| 4 | 2 | 64.6 | 79.0 | 12 / 35 | 3786 |
| 5 | 2 | 64.9 | 79.0 | 8 / 35 | 3936 |
| 6 | 1 | 67.6 | 85.4 | 17 / 35 | 4132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 61 | 64% |
| gh.mini.Griezel 0.2 | 33 | 64% |
| spinnercat.micro.Tyger 0.1 | 11 | 45% |
| d414.nano.Quantum 1.0.0 | 8 | 88% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 53 | 40% | 88 |
| gh.mini.Griezel 0.2 | 30 | 23% | 53 |
| spinnercat.micro.Tyger 0.1 | 19 | 14% | 26 |
| d414.nano.Quantum 1.0.0 | 11 | 8% | 19 |
| gh.nano.Grofvuil 0.2 | 11 | 8% | 15 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 2% | 3 |
| fm.mammillarias 1.3 | 2 | 2% | 2 |

Posture (Hadur's M records, 199 rounds): 149871 melee ticks, 34466 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 54 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47806 sent, 43123 reached their opponent, 7001 virtual hits (16.2% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481173. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 191 over 6 battles (31.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 91.5 | 127 / 210 | 1.76 | 19.0% | 27914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 19.0% | 127 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 52 |
| lxx.ConceptA 0.8 | 3.5 | 11.1% | 4 |
| apc.botM 3.0 | 3.8 | 11.1% | 17 |
| vjik.UnViolation 1.1 | 4.8 | 10.1% | 4 |
| bayen.UbaMicro 1.4 | 6.5 | 8.0% | 2 |
| panzer.Panzer 0.2 | 7.3 | 7.2% | 0 |
| conscience.Electron 1.3g | 7.8 | 6.9% | 1 |
| yk.JahMicro 1.0 | 8.2 | 6.8% | 3 |
| donjezza.Jezza 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 93.7 | 24 / 35 | 4585 |
| 2 | 1 | 67.7 | 88.3 | 16 / 35 | 4680 |
| 3 | 1 | 68.4 | 88.6 | 21 / 35 | 4725 |
| 4 | 1 | 68.7 | 91.7 | 22 / 35 | 4595 |
| 5 | 1 | 69.6 | 95.2 | 24 / 35 | 4648 |
| 6 | 1 | 68.7 | 91.7 | 20 / 35 | 4681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 52% |
| apc.botM 3.0 | 38 | 76% |
| lxx.ConceptA 0.8 | 20 | 90% |
| vjik.UnViolation 1.1 | 20 | 90% |
| yk.JahMicro 1.0 | 7 | 71% |
| donjezza.Jezza 1.0 | 6 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 44 | 53% | 82 |
| apc.botM 3.0 | 10 | 12% | 39 |
| lxx.ConceptA 0.8 | 10 | 12% | 26 |
| bayen.UbaMicro 1.4 | 7 | 8% | 13 |
| vjik.UnViolation 1.1 | 4 | 5% | 25 |
| conscience.Electron 1.3g | 3 | 4% | 8 |
| yk.JahMicro 1.0 | 2 | 2% | 6 |
| panzer.Panzer 0.2 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |

Posture (Hadur's M records, 198 rounds): 127740 melee ticks, 52793 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 88 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42332 sent, 37629 reached their opponent, 6713 virtual hits (17.8% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21n3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1482603. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.5 | 128 / 210 | 1.76 | 21.9% | 29111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 21.9% | 128 |
| maribo.Quester 0.3 | 2.0 | 18.1% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 14.4% | 24 |
| labg.Cataclysm 2.05 | 3.8 | 12.0% | 12 |
| baal.nano.N 1.42 | 5.5 | 9.7% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.5 | 9.7% | 4 |
| zyx.micro.Ant 1.1 | 7.2 | 6.2% | 0 |
| sanja.First 0.1 | 7.8 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.8 | 22 / 35 | 5182 |
| 2 | 1 | 68.5 | 82.9 | 18 / 35 | 4594 |
| 3 | 1 | 72.5 | 94.3 | 26 / 35 | 5114 |
| 4 | 1 | 69.8 | 90.7 | 18 / 35 | 4375 |
| 5 | 1 | 71.9 | 92.9 | 24 / 35 | 5396 |
| 6 | 1 | 70.1 | 90.7 | 20 / 35 | 4450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 93 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 77% |
| labg.Cataclysm 2.05 | 15 | 67% |
| baal.nano.N 1.42 | 8 | 88% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 71% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 39 | 46% | 98 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 18% | 51 |
| labg.Cataclysm 2.05 | 14 | 17% | 29 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 11% | 13 |
| baal.nano.N 1.42 | 3 | 4% | 12 |
| zyx.micro.Ant 1.1 | 1 | 1% | 3 |
| sanja.First 0.1 | 1 | 1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 163343 melee ticks, 56294 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 62 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 47675 sent, 43449 reached their opponent, 6374 virtual hits (14.7% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486619. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.2 | 92 / 210 | 1.98 | 19.0% | 32563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 19.0% | 92 |
| kid.Gladiator .7.2 | 2.3 | 16.5% | 46 |
| stelo.Spread 0.9 | 2.7 | 16.0% | 50 |
| jcs.Seth 1.8 | 4.3 | 11.6% | 16 |
| tcf.Reach 3 | 4.7 | 10.7% | 7 |
| cli.Dancer 1.1 | 6.0 | 8.8% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.5% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.9 | 15 / 35 | 5462 |
| 2 | 1 | 69.3 | 89.8 | 12 / 35 | 5211 |
| 3 | 1 | 69.3 | 87.9 | 14 / 35 | 5288 |
| 4 | 1 | 70.0 | 87.6 | 16 / 35 | 5524 |
| 5 | 1 | 70.7 | 91.4 | 17 / 35 | 5616 |
| 6 | 1 | 70.5 | 90.2 | 18 / 35 | 5462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 67 | 63% |
| kid.Gladiator .7.2 | 62 | 58% |
| jcs.Seth 1.8 | 16 | 31% |
| tcf.Reach 3 | 6 | 67% |
| ratosh.Wesco 1.4 | 3 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 1121. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 45 | 38% | 70 |
| stelo.Spread 0.9 | 44 | 37% | 93 |
| jcs.Seth 1.8 | 18 | 15% | 25 |
| tcf.Reach 3 | 9 | 8% | 16 |
| amk.Punbot.Punbot 0.01 | 2 | 2% | 2 |
| ratosh.Wesco 1.4 | 0 | 0% | 2 |
| cli.Dancer 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 169255 melee ticks, 53482 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 47 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 52155 sent, 47582 reached their opponent, 7991 virtual hits (16.8% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483743. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 6 battles (22.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.8 | 49 / 210 | 2.28 | 17.0% | 25120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 134 |
| hadur117.Hadur 3.21n3 | 2.0 | 17.0% | 49 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.4% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.9% | 8 |
| rz.HawkOnFire 0.1 | 4.5 | 11.3% | 3 |
| wit.Chuliath 1.0 | 6.2 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 6.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 88.9 | 9 / 35 | 4421 |
| 2 | 2 | 66.9 | 86.3 | 10 / 35 | 4149 |
| 3 | 2 | 65.6 | 83.5 | 5 / 35 | 4006 |
| 4 | 2 | 66.9 | 86.0 | 8 / 35 | 4202 |
| 5 | 2 | 66.8 | 86.7 | 8 / 35 | 4230 |
| 6 | 2 | 66.2 | 83.2 | 9 / 35 | 4112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 98 | 19% |
| gh.mini.Gruwel 0.9 | 23 | 52% |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 63% |
| rz.HawkOnFire 0.1 | 5 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 106 | 66% | 126 |
| gh.mini.Gruwel 0.9 | 24 | 15% | 39 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 10% | 25 |
| rz.HawkOnFire 0.1 | 10 | 6% | 14 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |

Posture (Hadur's M records, 202 rounds): 153200 melee ticks, 54085 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 41 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 46144 sent, 41375 reached their opponent, 6460 virtual hits (15.6% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475276. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 6 battles (36.3 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.0 | 167 / 210 | 1.54 | 21.4% | 34035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 21.4% | 167 |
| bzdp.Pansy 2.1 | 2.8 | 12.3% | 9 |
| alpha.RainingFire 1.0 | 3.2 | 12.1% | 13 |
| mz.Cork 0.1 | 4.2 | 10.9% | 10 |
| bvh.micro.Freya 0.3 | 4.5 | 10.3% | 4 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.1% | 1 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.9% | 1 |
| dl.BetterWalls 1.0 | 8.8 | 5.3% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.3 | 31 / 35 | 5616 |
| 2 | 1 | 71.8 | 94.6 | 27 / 35 | 5591 |
| 3 | 1 | 70.3 | 91.1 | 23 / 35 | 5311 |
| 4 | 1 | 72.2 | 93.3 | 27 / 35 | 6051 |
| 5 | 1 | 71.9 | 93.7 | 29 / 35 | 5560 |
| 6 | 1 | 72.9 | 98.1 | 30 / 35 | 5906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 96% |
| bvh.micro.Freya 0.3 | 42 | 98% |
| mz.Cork 0.1 | 35 | 89% |
| alpha.RainingFire 1.0 | 27 | 78% |
| m3thos.Eva02 0.7.1 | 13 | 100% |
| bvh.mini.Fenrir 0.39 | 11 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 28% | 35 |
| mz.Cork 0.1 | 10 | 23% | 41 |
| bvh.micro.Freya 0.3 | 8 | 19% | 40 |
| bzdp.Pansy 2.1 | 5 | 12% | 57 |
| bvh.mini.Fenrir 0.39 | 4 | 9% | 9 |
| dl.BetterWalls 1.0 | 2 | 5% | 7 |
| m3thos.Eva02 0.7.1 | 1 | 2% | 18 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 3 |

Posture (Hadur's M records, 199 rounds): 141006 melee ticks, 46741 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 57 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48522 sent, 43984 reached their opponent, 9008 virtual hits (20.5% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491616. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 214 over 6 battles (35.7 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.2 | 152 / 210 | 2.15 | 19.0% | 33497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 19.0% | 152 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 11.0% | 12 |
| EBBU.Sim2 1.02 | 4.5 | 9.6% | 4 |
| agrach.Dalek 1.0 | 5.2 | 9.6% | 12 |
| germ.TheMind .2 | 5.2 | 9.5% | 7 |
| stelo.UntouchableNano 1.3 | 5.2 | 9.2% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 6.8 | 8.6% | 0 |
| mb.Beast 0.1 | 6.8 | 8.4% | 6 |
| lmk.ACPFinal 0.1 | 8.0 | 8.1% | 4 |
| skm.Ryubot 1.0 | 10.0 | 7.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.9 | 25 / 35 | 5335 |
| 2 | 1 | 69.1 | 88.3 | 26 / 35 | 6168 |
| 3 | 1 | 69.1 | 91.4 | 28 / 35 | 5583 |
| 4 | 1 | 69.2 | 91.4 | 29 / 35 | 5660 |
| 5 | 1 | 67.3 | 87.9 | 22 / 35 | 5245 |
| 6 | 1 | 66.4 | 81.6 | 22 / 35 | 5506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 30 | 93% |
| agrach.Dalek 1.0 | 25 | 92% |
| germ.TheMind .2 | 21 | 90% |
| mb.Beast 0.1 | 19 | 100% |
| EBBU.Sim2 1.02 | 19 | 100% |
| stelo.UntouchableNano 1.3 | 18 | 83% |
| lmk.ACPFinal 0.1 | 17 | 100% |
| skm.Ryubot 1.0 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 22% | 40 |
| EBBU.Sim2 1.02 | 13 | 22% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 17% | 14 |
| stelo.UntouchableNano 1.3 | 7 | 12% | 27 |
| agrach.Dalek 1.0 | 6 | 10% | 37 |
| mb.Beast 0.1 | 4 | 7% | 18 |
| lmk.ACPFinal 0.1 | 3 | 5% | 22 |
| germ.TheMind .2 | 3 | 5% | 14 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 202 rounds): 93141 melee ticks, 28109 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 39 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 31917 sent, 27409 reached their opponent, 8080 virtual hits (29.5% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1579915. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.3 | 121 / 210 | 1.96 | 19.0% | 29235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 19.0% | 121 |
| justin.Mallais 14.0 | 2.0 | 15.8% | 52 |
| bvh.mini.Freya 0.55 | 3.0 | 12.6% | 9 |
| bts.mega.Gnarly 1.4 | 4.8 | 10.9% | 14 |
| cs.Wren 1.0 | 5.0 | 10.6% | 5 |
| kdf.KoulDestroyer 1.0 | 5.5 | 10.1% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.7 | 8.4% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.6% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.0 | 18 / 35 | 4570 |
| 2 | 1 | 69.7 | 91.1 | 22 / 35 | 4712 |
| 3 | 1 | 69.7 | 92.1 | 22 / 35 | 4782 |
| 4 | 1 | 70.6 | 93.0 | 24 / 35 | 5121 |
| 5 | 1 | 68.2 | 86.0 | 18 / 35 | 4672 |
| 6 | 1 | 69.4 | 87.6 | 17 / 35 | 5378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 81 | 68% |
| bts.mega.Gnarly 1.4 | 25 | 84% |
| bvh.mini.Freya 0.55 | 21 | 90% |
| kdf.KoulDestroyer 1.0 | 16 | 56% |
| cs.Wren 1.0 | 15 | 93% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 49% | 99 |
| kdf.KoulDestroyer 1.0 | 16 | 18% | 17 |
| bts.mega.Gnarly 1.4 | 14 | 16% | 44 |
| cs.Wren 1.0 | 7 | 8% | 20 |
| bvh.mini.Freya 0.55 | 6 | 7% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 3% | 6 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 134368 melee ticks, 46219 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44047 sent, 39172 reached their opponent, 8608 virtual hits (22.0% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21n3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481444. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 6 battles (23.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.5 | 145 / 210 | 1.52 | 22.7% | 33438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 22.7% | 145 |
| bvh.fry.Freya 0.82 | 2.0 | 16.6% | 16 |
| az.Ololobot 0.2.4 | 3.0 | 14.1% | 45 |
| winamp32.micro.MicroMacro 1.0 | 4.2 | 9.8% | 2 |
| gimp.GimpBot 0.1 | 5.5 | 8.7% | 0 |
| apollokidd.ApolloKidd 0.9 | 5.7 | 8.4% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.7% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.0 | 6.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.4 | 21 / 35 | 5053 |
| 2 | 1 | 70.5 | 92.5 | 19 / 35 | 5605 |
| 3 | 1 | 71.2 | 92.1 | 25 / 35 | 5743 |
| 4 | 1 | 71.8 | 96.1 | 27 / 35 | 5662 |
| 5 | 1 | 71.0 | 94.3 | 27 / 35 | 5479 |
| 6 | 1 | 71.8 | 94.6 | 26 / 35 | 5896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 85 | 91% |
| az.Ololobot 0.2.4 | 73 | 56% |
| winamp32.micro.MicroMacro 1.0 | 16 | 94% |
| gimp.GimpBot 0.1 | 6 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 1214. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 39 | 59% | 96 |
| bvh.fry.Freya 0.82 | 19 | 29% | 69 |
| stelo.SoRobotNanoMelee 1.2 | 3 | 5% | 5 |
| winamp32.micro.MicroMacro 1.0 | 1 | 2% | 18 |
| gimp.GimpBot 0.1 | 1 | 2% | 13 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 2% | 6 |
| apollokidd.ApolloKidd 0.9 | 1 | 2% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 2% | 1 |

Posture (Hadur's M records, 199 rounds): 157219 melee ticks, 67206 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 63 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45849 sent, 41645 reached their opponent, 7801 virtual hits (18.7% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1479571. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.6 | 143 / 210 | 1.84 | 20.3% | 32309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 20.3% | 143 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 27 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.5% | 16 |
| mz.AntiGrav 1.0 | 4.2 | 11.3% | 7 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.3% | 3 |
| stelo.Randomness 1.0 | 6.2 | 9.1% | 10 |
| alpha.BlackIce 1.0 | 6.8 | 8.4% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.8% | 1 |
| sample.Corners 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 89.8 | 22 / 35 | 5511 |
| 2 | 1 | 70.0 | 89.5 | 18 / 35 | 5320 |
| 3 | 1 | 70.6 | 89.5 | 26 / 35 | 5180 |
| 4 | 1 | 72.5 | 94.9 | 30 / 35 | 5735 |
| 5 | 1 | 69.4 | 86.7 | 23 / 35 | 5011 |
| 6 | 1 | 71.7 | 93.3 | 24 / 35 | 5552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 63 | 87% |
| kano.gamma.KanoGamma 1.8 | 42 | 88% |
| mz.AntiGrav 1.0 | 21 | 100% |
| Polkwane.SmashMelee 1.0 | 16 | 94% |
| stelo.Randomness 1.0 | 14 | 64% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 26 | 38% | 61 |
| kano.gamma.KanoGamma 1.8 | 11 | 16% | 49 |
| stelo.Randomness 1.0 | 10 | 15% | 26 |
| Polkwane.SmashMelee 1.0 | 8 | 12% | 28 |
| mz.AntiGrav 1.0 | 6 | 9% | 24 |
| alpha.BlackIce 1.0 | 5 | 7% | 12 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 6 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 148953 melee ticks, 39444 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 119 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 119 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 48602 sent, 43797 reached their opponent, 8848 virtual hits (20.2% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484663. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 146 over 6 battles (24.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.6 | 106 / 210 | 1.94 | 18.7% | 27489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 18.7% | 106 |
| eem.EvBotNG v12.8 | 2.0 | 16.7% | 80 |
| ary.Swarm 1.1 | 3.5 | 12.5% | 8 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.5% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.1% | 1 |
| shrub.Silver v048 | 6.0 | 8.7% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.5% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 5.1% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.8 | 19 / 35 | 4802 |
| 2 | 1 | 69.2 | 90.5 | 19 / 35 | 4255 |
| 3 | 1 | 68.3 | 87.3 | 17 / 35 | 4319 |
| 4 | 1 | 69.9 | 92.1 | 19 / 35 | 4759 |
| 5 | 1 | 69.2 | 90.2 | 15 / 35 | 4652 |
| 6 | 1 | 68.8 | 87.6 | 17 / 35 | 4702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 100 | 39% |
| lessonz.robocode.Oz 0.5.0 | 26 | 85% |
| ary.Swarm 1.1 | 24 | 88% |
| simonton.nano.MeleeSeed 1.8 | 18 | 100% |
| stelo.Mirror 1.1 | 3 | 100% |
| shrub.Silver v048 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 1078. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 69 | 66% | 109 |
| lessonz.robocode.Oz 0.5.0 | 17 | 16% | 40 |
| ary.Swarm 1.1 | 11 | 11% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3 | 3% | 19 |
| shrub.Silver v048 | 3 | 3% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| stelo.Mirror 1.1 | 0 | 0% | 4 |
| zyx.nano.Ant 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 153143 melee ticks, 62414 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 77 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 77 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49674 sent, 44849 reached their opponent, 6654 virtual hits (14.8% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1472610. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 6 battles (24.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.0 | 144 / 210 | 1.63 | 20.9% | 37180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 20.9% | 144 |
| wompi.Wallaby 5.1 | 2.2 | 14.9% | 28 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.4% | 10 |
| ara.Shera 0.88 | 3.7 | 13.0% | 25 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 0 |
| dsw.StaticD 1.0 | 6.8 | 6.7% | 3 |
| maribo.IotaCT 1.1 | 7.2 | 6.3% | 0 |
| mme.NikeEnhanced 2.0 | 8.0 | 5.7% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.0 | 26 / 35 | 6434 |
| 2 | 1 | 72.6 | 96.2 | 27 / 35 | 6446 |
| 3 | 1 | 71.3 | 92.4 | 24 / 35 | 5995 |
| 4 | 1 | 71.2 | 93.0 | 23 / 35 | 5989 |
| 5 | 1 | 70.9 | 92.1 | 22 / 35 | 6103 |
| 6 | 1 | 71.0 | 90.5 | 22 / 35 | 6213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 87 | 89% |
| maribo.mini.MiniQuester 0.1 | 47 | 89% |
| ara.Shera 0.88 | 34 | 59% |
| dsw.StaticD 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 29 | 44% | 56 |
| wompi.Wallaby 5.1 | 25 | 38% | 96 |
| maribo.mini.MiniQuester 0.1 | 6 | 9% | 43 |
| amz.NanoClone 1.41 | 2 | 3% | 4 |
| stelo.MirrorMicro 1.0 | 2 | 3% | 2 |
| dsw.StaticD 1.0 | 1 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 162759 melee ticks, 52064 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 50656 sent, 46077 reached their opponent, 9210 virtual hits (20.0% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478125. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.4 | 37 / 210 | 2.77 | 16.1% | 25495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 147 |
| hadur117.Hadur 3.21n3 | 2.0 | 16.1% | 37 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.6% | 21 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.7% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.9% | 1 |
| Krabb.akim2.Akim2 1.1b | 6.5 | 8.5% | 0 |
| mz.NanoGod 2.02 | 6.7 | 8.4% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 84.4 | 3 / 35 | 4468 |
| 2 | 2 | 66.7 | 81.6 | 6 / 35 | 4374 |
| 3 | 2 | 64.8 | 76.5 | 2 / 35 | 4045 |
| 4 | 2 | 67.0 | 82.5 | 9 / 35 | 4294 |
| 5 | 2 | 66.1 | 78.7 | 9 / 35 | 4282 |
| 6 | 2 | 66.1 | 78.4 | 8 / 35 | 4032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 20% |
| brainfade.melee.Dusk 0.44 | 21 | 57% |
| dummy.micro.Sparrow 2.5 | 6 | 67% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 107 | 61% | 124 |
| brainfade.melee.Dusk 0.44 | 29 | 17% | 40 |
| dummy.micro.Sparrow 2.5 | 12 | 7% | 16 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 13 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 7 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 152932 melee ticks, 54967 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48264 sent, 43311 reached their opponent, 7191 virtual hits (16.6% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486740. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 166 over 6 battles (27.7 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.7 | 152 / 210 | 1.57 | 21.4% | 36186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 21.4% | 152 |
| stelo.Liblix 0.3.1 | 2.5 | 14.8% | 43 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.5% | 13 |
| jwirde.Gort 2.0 | 4.3 | 9.7% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.7% | 0 |
| wompi.Quokka 1.6 | 6.7 | 7.1% | 0 |
| disan.Chair 2.2.0 | 6.8 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.5% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 96.5 | 28 / 35 | 6036 |
| 2 | 1 | 71.7 | 91.7 | 25 / 35 | 6086 |
| 3 | 1 | 72.5 | 93.0 | 26 / 35 | 6482 |
| 4 | 1 | 69.9 | 90.2 | 19 / 35 | 5313 |
| 5 | 1 | 71.6 | 94.0 | 26 / 35 | 5909 |
| 6 | 1 | 73.3 | 96.5 | 28 / 35 | 6360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tzu.TheArtOfWar 1.2 | 79 | 91% |
| stelo.Liblix 0.3.1 | 66 | 70% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 17 | 100% |
| jwirde.Gort 2.0 | 7 | 86% |
| disan.Chair 2.2.0 | 6 | 100% |
| wompi.Quokka 1.6 | 4 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 62% | 88 |
| tzu.TheArtOfWar 1.2 | 9 | 16% | 67 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 12% | 18 |
| jwirde.Gort 2.0 | 4 | 7% | 21 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 2 |
| disan.Chair 2.2.0 | 0 | 0% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
| wompi.Quokka 1.6 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 150126 melee ticks, 45737 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 51998 sent, 47410 reached their opponent, 9846 virtual hits (20.8% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21n3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1475181. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.2 | 121 / 210 | 1.88 | 20.2% | 33362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 20.2% | 121 |
| jje.BagPuss 1.2 | 2.2 | 12.9% | 14 |
| eem.IWillFireNoBullet v2.8 | 3.8 | 10.9% | 50 |
| myl.nano.Graviton 1.10 | 4.0 | 10.7% | 5 |
| sul.Lunar 1.1 | 4.5 | 10.5% | 16 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.3% | 1 |
| fm.claire 1.7 | 6.8 | 8.3% | 0 |
| hvilela.HVilela 0.9 | 6.8 | 8.5% | 1 |
| wit.Deep7 2.0 | 9.0 | 5.4% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.1 | 23 / 35 | 5345 |
| 2 | 1 | 70.0 | 90.2 | 20 / 35 | 5512 |
| 3 | 1 | 69.0 | 86.7 | 16 / 35 | 5429 |
| 4 | 1 | 69.5 | 86.3 | 18 / 35 | 5790 |
| 5 | 1 | 70.6 | 93.3 | 24 / 35 | 5033 |
| 6 | 1 | 71.4 | 92.7 | 20 / 35 | 6253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 66 | 55% |
| jje.BagPuss 1.2 | 36 | 75% |
| myl.nano.Graviton 1.10 | 25 | 92% |
| sul.Lunar 1.1 | 18 | 78% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 100% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 35 | 39% | 0 |
| jje.BagPuss 1.2 | 20 | 22% | 71 |
| sul.Lunar 1.1 | 16 | 18% | 54 |
| myl.nano.Graviton 1.10 | 6 | 7% | 32 |
| fm.claire 1.7 | 5 | 6% | 12 |
| hvilela.HVilela 0.9 | 3 | 3% | 11 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 17 |
| wit.Deep7 2.0 | 1 | 1% | 6 |
| abud.ThirdRobo 1.0 | 1 | 1% | 5 |

Posture (Hadur's M records, 199 rounds): 198470 melee ticks, 80350 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 65 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 59765 sent, 55069 reached their opponent, 8053 virtual hits (14.6% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21n3 against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481326. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 6 battles (21.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.7 | 132 / 210 | 1.66 | 21.8% | 30724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21n3 | 1.0 | 21.8% | 132 |
| kc.mini.Mirage 0.2 | 2.0 | 18.9% | 63 |
| mz.MicroSheep 1.0 | 3.0 | 12.6% | 5 |
| cx.Princess 1.0 | 4.0 | 11.9% | 7 |
| sadoner.killer 0.2 | 5.2 | 10.1% | 1 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.8% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.3 | 6.4% | 0 |
| kurios.DOSexe .9a | 7.7 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.4 | 22 / 35 | 5147 |
| 2 | 1 | 71.5 | 96.1 | 27 / 35 | 5099 |
| 3 | 1 | 69.3 | 89.3 | 20 / 35 | 4925 |
| 4 | 1 | 71.2 | 93.9 | 23 / 35 | 5194 |
| 5 | 1 | 68.5 | 88.2 | 16 / 35 | 4944 |
| 6 | 1 | 70.9 | 91.4 | 24 / 35 | 5415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 137 | 73% |
| cx.Princess 1.0 | 19 | 84% |
| mz.MicroSheep 1.0 | 9 | 100% |
| sadoner.killer 0.2 | 5 | 80% |
| arthord.NanoSatanMelee Beta | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 48 | 62% | 138 |
| sadoner.killer 0.2 | 10 | 13% | 14 |
| cx.Princess 1.0 | 9 | 12% | 24 |
| arthord.NanoSatanMelee Beta | 5 | 6% | 7 |
| mz.MicroSheep 1.0 | 4 | 5% | 18 |
| kurios.DOSexe .9a | 1 | 1% | 4 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 142366 melee ticks, 57974 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 64 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39518 sent, 35343 reached their opponent, 5861 virtual hits (16.6% of those reached).

