# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 105 over 6 battles (17.5 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.7 | 57 / 210 | 2.20 | 17.6% | 30987 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 137 |
| hadur117.Hadur 3.20xh | 2.0 | 17.6% | 57 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.0% | 4 |
| lorneswork.Predator 1.0 | 4.0 | 10.4% | 2 |
| sgp.JollyNinja 3.53 | 5.0 | 10.3% | 8 |
| mz.MicroGodMelee 1 | 5.3 | 9.6% | 1 |
| adt.Ar2 1.0 | 7.2 | 7.2% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 7.8 | 6.1% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 87.9 | 9 / 35 | 5361 |
| 2 | 2 | 68.7 | 91.1 | 12 / 35 | 5144 |
| 3 | 2 | 67.8 | 86.7 | 11 / 35 | 5258 |
| 4 | 2 | 66.4 | 84.4 | 6 / 35 | 5048 |
| 5 | 2 | 66.3 | 82.5 | 7 / 35 | 5104 |
| 6 | 2 | 67.9 | 87.6 | 12 / 35 | 5072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 133 | 16% |
| sgp.JollyNinja 3.53 | 13 | 62% |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 92% |
| mz.MicroGodMelee 1 | 9 | 100% |
| lorneswork.Predator 1.0 | 6 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 1191. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 77% | 142 |
| sgp.JollyNinja 3.53 | 16 | 10% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 16 |
| lorneswork.Predator 1.0 | 9 | 6% | 14 |
| mz.MicroGodMelee 1 | 1 | 1% | 9 |
| adt.Ar2 1.0 | 0 | 0% | 2 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 134390 melee ticks, 96658 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 102 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 102 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 44397 sent, 39438 reached their opponent, 7825 virtual hits (19.8% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 375 over 6 battles (62.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.3 | 108 / 210 | 2.14 | 18.9% | 30314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 18.9% | 108 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.5% | 44 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.1% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.9% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.5% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 7.9% | 2 |
| Noran.BitchingElk 0.054 | 7.0 | 8.3% | 14 |
| sch.Simone 0.3d | 7.5 | 7.5% | 11 |
| stelo.PatternRobot 1.0 | 8.7 | 5.9% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.5 | 15 / 35 | 5111 |
| 2 | 1 | 68.6 | 86.3 | 14 / 35 | 5245 |
| 3 | 1 | 68.1 | 87.6 | 16 / 35 | 4891 |
| 4 | 1 | 67.6 | 84.8 | 19 / 35 | 4437 |
| 5 | 1 | 70.8 | 94.3 | 24 / 35 | 5115 |
| 6 | 1 | 69.4 | 88.3 | 20 / 35 | 5515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 52 | 52% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 86% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 65% |
| Noran.BitchingElk 0.054 | 15 | 40% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| sch.Simone 0.3d | 9 | 44% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |
| stelo.PatternRobot 1.0 | 4 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1025. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 42 | 40% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 13 | 12% | 60 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 12% | 27 |
| sch.Simone 0.3d | 11 | 10% | 16 |
| Noran.BitchingElk 0.054 | 9 | 9% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 12 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 7 |
| stelo.PatternRobot 1.0 | 3 | 3% | 6 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 168417 melee ticks, 48563 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 59592 sent, 54735 reached their opponent, 9513 virtual hits (17.4% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.8 | 167 / 210 | 1.65 | 20.8% | 38022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 20.8% | 167 |
| radnor.DoctorBob 1.42 | 2.2 | 14.0% | 17 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.7% | 12 |
| vuen.Cake 2.51 | 3.5 | 12.5% | 14 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 0 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.8 | 28 / 35 | 6453 |
| 2 | 1 | 71.5 | 95.9 | 29 / 35 | 6233 |
| 3 | 1 | 71.2 | 94.0 | 26 / 35 | 6396 |
| 4 | 1 | 70.6 | 89.2 | 27 / 35 | 6409 |
| 5 | 1 | 71.7 | 94.0 | 29 / 35 | 6549 |
| 6 | 1 | 70.5 | 93.0 | 28 / 35 | 5982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 92% |
| radnor.DoctorBob 1.42 | 61 | 100% |
| kawigi.nano.Lib 1.0 | 43 | 84% |
| urdos.URDOS 1.3 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 13 | 30% | 66 |
| kawigi.nano.Lib 1.0 | 12 | 28% | 45 |
| vuen.Cake 2.51 | 6 | 14% | 59 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 12% | 6 |
| urdos.URDOS 1.3 | 2 | 5% | 9 |
| adt.Ar1 2.1 | 2 | 5% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 5% | 4 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 129329 melee ticks, 41976 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 39272 sent, 34607 reached their opponent, 8940 virtual hits (25.8% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 698 over 6 battles (116.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.9 | 40 / 210 | 2.18 | 18.0% | 34291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.8% | 150 |
| hadur117.Hadur 3.20xh | 2.0 | 18.0% | 40 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.7% | 12 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 6 |
| josago.Jorgito 0.16 | 5.0 | 9.7% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.5% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.7% | 1 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.8 | 87.0 | 6 / 35 | 5642 |
| 2 | 2 | 68.4 | 86.3 | 3 / 35 | 5652 |
| 3 | 2 | 68.8 | 86.7 | 9 / 35 | 5631 |
| 4 | 2 | 68.7 | 88.9 | 5 / 35 | 5440 |
| 5 | 2 | 69.3 | 88.9 | 7 / 35 | 5820 |
| 6 | 2 | 69.4 | 83.8 | 10 / 35 | 6106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 132 | 12% |
| apc.LeeroyJenkins2 1.0 | 20 | 65% |
| TNT.TNT 0.99.1 | 13 | 54% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| josago.Jorgito 0.16 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 176 of 210 rounds, at a mean tick of 1318. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 77% | 154 |
| apc.LeeroyJenkins2 1.0 | 19 | 11% | 29 |
| TNT.TNT 0.99.1 | 9 | 5% | 15 |
| josago.Jorgito 0.16 | 5 | 3% | 8 |
| css.Delitioner 0.11 | 1 | 1% | 2 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |
| tj.zombie1n 1.0.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 193279 melee ticks, 76903 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 79 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 59575 sent, 54641 reached their opponent, 8032 virtual hits (14.7% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 617 over 6 battles (102.8 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 77.9 | 31 / 210 | 2.99 | 15.0% | 22827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.5 | 17.7% | 67 |
| cb.fire.Firestarter 2.0f | 1.8 | 17.2% | 89 |
| hadur117.Hadur 3.20xh | 2.7 | 15.0% | 31 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 18 |
| axeBots.HataMoto 3.09 | 5.3 | 9.2% | 5 |
| ms.Ares 0.19 | 5.7 | 9.0% | 0 |
| supersample.SuperBoxBot 1.0 | 7.2 | 5.8% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 74.0 | 4 / 35 | 3747 |
| 2 | 2 | 66.6 | 84.4 | 8 / 35 | 4369 |
| 3 | 3 | 61.9 | 73.7 | 2 / 35 | 3358 |
| 4 | 3 | 62.6 | 74.6 | 5 / 35 | 3361 |
| 5 | 2 | 65.3 | 80.0 | 9 / 35 | 4185 |
| 6 | 3 | 64.2 | 81.0 | 3 / 35 | 3807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 45 | 33% |
| cb.fire.Firestarter 2.0f | 28 | 18% |
| wompi.Numbat 2.1 | 11 | 55% |
| axeBots.HataMoto 3.09 | 4 | 75% |
| ms.Ares 0.19 | 2 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 84 | 46% | 99 |
| cb.fire.Firestarter 2.0f | 46 | 25% | 49 |
| wompi.Numbat 2.1 | 30 | 16% | 37 |
| axeBots.HataMoto 3.09 | 7 | 4% | 11 |
| ms.Ares 0.19 | 5 | 3% | 7 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 161368 melee ticks, 31148 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 56 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48934 sent, 43909 reached their opponent, 6940 virtual hits (15.8% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 333 over 6 battles (55.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.2 | 153 / 210 | 1.61 | 20.5% | 32610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 20.5% | 153 |
| jekl.StoneGhost 0.7 | 2.2 | 14.1% | 17 |
| origin.SleepSiphon 1.7b | 3.3 | 12.7% | 19 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 12.3% | 12 |
| mld.Wisdom 1.0 | 5.3 | 10.0% | 3 |
| gg.Wolverine 2.0 | 5.8 | 8.3% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.2% | 4 |
| DBall.NUKE 0.1 | 8.3 | 6.1% | 1 |
| spinnercat.Omen 1.0 | 8.5 | 5.8% | 1 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.3 | 27 / 35 | 5466 |
| 2 | 1 | 70.9 | 93.3 | 25 / 35 | 5308 |
| 3 | 1 | 71.0 | 94.0 | 25 / 35 | 5517 |
| 4 | 1 | 71.7 | 94.0 | 27 / 35 | 5972 |
| 5 | 1 | 71.1 | 94.0 | 28 / 35 | 5237 |
| 6 | 1 | 69.7 | 89.5 | 21 / 35 | 5110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 56 | 91% |
| origin.SleepSiphon 1.7b | 46 | 87% |
| pe.minimelee.SandboxMiniMelee 1.1 | 37 | 86% |
| gg.Wolverine 2.0 | 12 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 78% |
| mld.Wisdom 1.0 | 6 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 2 | 50% |

Hadur died in 62 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 19 | 31% | 61 |
| origin.SleepSiphon 1.7b | 18 | 29% | 56 |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 13% | 28 |
| mld.Wisdom 1.0 | 5 | 8% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 16 |
| gg.Wolverine 2.0 | 2 | 3% | 14 |
| DBall.NUKE 0.1 | 1 | 2% | 5 |
| spinnercat.Omen 1.0 | 1 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 150143 melee ticks, 47401 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 34 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46983 sent, 42204 reached their opponent, 9045 virtual hits (21.4% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 489 over 6 battles (81.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 93.4 | 118 / 210 | 1.60 | 20.7% | 38848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 20.7% | 118 |
| rtk.Tachikoma 1.0 | 2.5 | 16.2% | 32 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 16.4% | 33 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.1% | 14 |
| franzor.Lizt 1.3.1 | 4.5 | 11.1% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.0 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.8 | 17 / 35 | 6041 |
| 2 | 1 | 72.7 | 93.7 | 22 / 35 | 6528 |
| 3 | 1 | 73.7 | 95.9 | 23 / 35 | 7262 |
| 4 | 1 | 70.2 | 89.8 | 9 / 35 | 5799 |
| 5 | 1 | 73.2 | 95.9 | 23 / 35 | 6673 |
| 6 | 1 | 72.9 | 94.3 | 24 / 35 | 6545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 88 | 70% |
| rsalesc.melee.Monk 0.3.6c | 45 | 36% |
| oog.melee.CapuletDroid 1.1 | 35 | 74% |
| franzor.Lizt 1.3.1 | 23 | 61% |

Hadur died in 96 of 210 rounds, at a mean tick of 1503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 38 | 40% | 99 |
| rsalesc.melee.Monk 0.3.6c | 32 | 33% | 66 |
| oog.melee.CapuletDroid 1.1 | 11 | 11% | 36 |
| franzor.Lizt 1.3.1 | 11 | 11% | 4 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 193744 melee ticks, 92469 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 56 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 57062 sent, 52217 reached their opponent, 10329 virtual hits (19.8% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 601 over 6 battles (100.2 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.6 | 135 / 210 | 1.75 | 19.9% | 31015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 19.9% | 135 |
| tm.Yuugao 1.0 | 2.2 | 13.1% | 30 |
| shrub.Vapour v159 | 3.3 | 12.0% | 17 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.5% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.9% | 8 |
| m3thos.Eva00 1.1 | 6.0 | 8.8% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.1% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.2% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.0 | 25 / 35 | 5380 |
| 2 | 1 | 69.2 | 91.7 | 20 / 35 | 5077 |
| 3 | 1 | 70.5 | 95.2 | 23 / 35 | 5187 |
| 4 | 1 | 68.7 | 87.0 | 21 / 35 | 5081 |
| 5 | 1 | 70.0 | 89.5 | 23 / 35 | 5461 |
| 6 | 1 | 70.0 | 93.3 | 23 / 35 | 4829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 57 | 65% |
| shrub.Vapour v159 | 36 | 72% |
| Krabb.sliNk.Garm 0.9u | 36 | 86% |
| com.spp.robocode.MostlyHarmless 010 | 29 | 86% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 90% |
| m3thos.Eva00 1.1 | 6 | 67% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 27 | 34% | 68 |
| shrub.Vapour v159 | 18 | 23% | 45 |
| Krabb.sliNk.Garm 0.9u | 11 | 14% | 37 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 13% | 34 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 15 |
| m3thos.Eva00 1.1 | 3 | 4% | 8 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 151285 melee ticks, 51143 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 46 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49082 sent, 44226 reached their opponent, 8360 virtual hits (18.9% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 508 over 6 battles (84.7 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 77.8 | 66 / 210 | 3.00 | 15.7% | 21831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.6% | 86 |
| hadur117.Hadur 3.20xh | 2.2 | 15.7% | 66 |
| kc.micro.Figment 1.0 | 2.5 | 14.3% | 31 |
| yagami.Tidus 0.11 | 4.3 | 10.9% | 3 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.1% | 15 |
| mc2.enemy.Original 0.9 | 5.5 | 9.2% | 7 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.2 | 5.9% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.6% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 75.9 | 11 / 35 | 3878 |
| 2 | 2 | 64.4 | 78.7 | 11 / 35 | 3575 |
| 3 | 2 | 64.0 | 76.8 | 12 / 35 | 3511 |
| 4 | 2 | 65.1 | 81.6 | 12 / 35 | 3648 |
| 5 | 2 | 65.2 | 81.6 | 11 / 35 | 3595 |
| 6 | 3 | 62.5 | 72.1 | 9 / 35 | 3624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 51 | 33% |
| kc.micro.Figment 1.0 | 37 | 73% |
| yagami.Tidus 0.11 | 13 | 92% |
| pedersen.Grishnakh 1.0 | 11 | 36% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| rdm.Dueler 0.4x | 1 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 59 | 40% | 81 |
| kc.micro.Figment 1.0 | 28 | 19% | 56 |
| pedersen.Grishnakh 1.0 | 17 | 11% | 18 |
| mc2.enemy.Original 0.9 | 15 | 10% | 18 |
| yagami.Tidus 0.11 | 10 | 7% | 16 |
| dft.Calliope 5.6 | 5 | 3% | 8 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 5 |
| step.nanoPri 1.0 | 5 | 3% | 5 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 146597 melee ticks, 39993 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48677 sent, 43792 reached their opponent, 6209 virtual hits (14.2% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 322 over 6 battles (53.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.8 | 169 / 210 | 1.47 | 20.9% | 34687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 20.9% | 169 |
| DTF.Kludgy 1.2b | 2.5 | 13.4% | 15 |
| ne.Chimera 1.2 | 3.2 | 13.0% | 8 |
| ejb.Polaris 1.0.1 | 3.5 | 12.7% | 14 |
| vStar.RAFzilla 2.15 | 5.0 | 10.5% | 2 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.6% | 2 |
| kurios.DOSexe .9b | 7.8 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.2% | 0 |
| sam.Samspin 1.0 | 8.3 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.3 | 25 / 35 | 5597 |
| 2 | 1 | 71.8 | 97.5 | 32 / 35 | 5621 |
| 3 | 1 | 71.4 | 93.7 | 28 / 35 | 5808 |
| 4 | 1 | 70.3 | 92.1 | 26 / 35 | 5529 |
| 5 | 1 | 72.1 | 94.9 | 29 / 35 | 6308 |
| 6 | 1 | 71.8 | 96.2 | 29 / 35 | 5824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 86% |
| ejb.Polaris 1.0.1 | 46 | 89% |
| ne.Chimera 1.2 | 43 | 93% |
| vStar.RAFzilla 2.15 | 19 | 95% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 35% | 55 |
| ne.Chimera 1.2 | 10 | 23% | 42 |
| ejb.Polaris 1.0.1 | 8 | 19% | 64 |
| vStar.RAFzilla 2.15 | 3 | 7% | 18 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 13 |
| kurios.DOSexe .9b | 2 | 5% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 143811 melee ticks, 52578 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 70 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47180 sent, 42476 reached their opponent, 8259 virtual hits (19.4% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 101 over 6 battles (16.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 80.0 | 69 / 210 | 2.80 | 16.2% | 23322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.2% | 67 |
| hadur117.Hadur 3.20xh | 1.7 | 16.2% | 69 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.6% | 20 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 13 |
| br2.MobyDickBot 1.6 | 5.3 | 9.8% | 16 |
| rdt199.Warlord 0.73 | 5.8 | 9.3% | 15 |
| uji.YellohFellah 1.0 | 7.0 | 7.9% | 9 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 4.9% | 1 |
| stelo.MirrorNano 1.3 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 74.9 | 9 / 35 | 3625 |
| 2 | 2 | 63.2 | 75.9 | 11 / 35 | 3710 |
| 3 | 1 | 68.0 | 88.3 | 17 / 35 | 4454 |
| 4 | 2 | 63.6 | 77.5 | 9 / 35 | 3809 |
| 5 | 1 | 64.6 | 81.0 | 13 / 35 | 3755 |
| 6 | 2 | 65.5 | 82.5 | 10 / 35 | 3969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 50 | 54% |
| cx.mini.Nimrod 0.55 | 17 | 59% |
| djc.DynaBot 0.1.1 | 13 | 69% |
| br2.MobyDickBot 1.6 | 12 | 58% |
| uji.YellohFellah 1.0 | 12 | 92% |
| rdt199.Warlord 0.73 | 8 | 63% |

Hadur died in 141 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 58 | 41% | 91 |
| cx.mini.Nimrod 0.55 | 29 | 21% | 37 |
| djc.DynaBot 0.1.1 | 14 | 10% | 22 |
| rdt199.Warlord 0.73 | 12 | 9% | 20 |
| br2.MobyDickBot 1.6 | 11 | 8% | 16 |
| KiraNL.Chupacabra 0.4 | 7 | 5% | 8 |
| uji.YellohFellah 1.0 | 5 | 4% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |

Posture (Hadur's M records, 206 rounds): 162556 melee ticks, 33417 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 81 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52627 sent, 47699 reached their opponent, 6540 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 437 over 6 battles (72.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.5 | 121 / 210 | 2.22 | 18.0% | 23534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 18.0% | 121 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.8% | 27 |
| nat.PallasHawk 1.0 | 3.0 | 13.1% | 31 |
| darkcanuck.Leon 1.01 | 3.7 | 12.4% | 17 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 10 |
| jrm.Test0 1.0 | 6.0 | 8.8% | 2 |
| cs.sheldor.Talon 1.1 | 8.0 | 6.1% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.5% | 1 |
| stuff.Vlad 0.1 | 8.3 | 5.7% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.4 | 19 / 35 | 3951 |
| 2 | 1 | 67.2 | 85.1 | 18 / 35 | 4042 |
| 3 | 1 | 69.5 | 91.7 | 26 / 35 | 4158 |
| 4 | 1 | 65.1 | 81.0 | 17 / 35 | 3393 |
| 5 | 1 | 69.1 | 91.1 | 24 / 35 | 4326 |
| 6 | 1 | 66.1 | 84.4 | 17 / 35 | 3664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 65% |
| bts.wiki.RipCurl 0.9b | 45 | 87% |
| darkcanuck.Leon 1.01 | 39 | 85% |
| brainfade.melee.Genghis 0.36 | 10 | 60% |
| jrm.Test0 1.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 0% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 28 | 30% | 64 |
| bts.wiki.RipCurl 0.9b | 22 | 24% | 45 |
| darkcanuck.Leon 1.01 | 19 | 20% | 62 |
| brainfade.melee.Genghis 0.36 | 8 | 9% | 16 |
| jrm.Test0 1.0 | 8 | 9% | 11 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 3 |
| jp.Perpy 16.0 | 2 | 2% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 4 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 130018 melee ticks, 35925 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 42 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44458 sent, 39525 reached their opponent, 6571 virtual hits (16.6% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 85 over 6 battles (14.2 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.0 | 65 / 210 | 2.44 | 16.4% | 25316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.7 | 16.4% | 65 |
| mn.Combat 3.25.0 | 2.0 | 16.2% | 75 |
| ags.Glacier 0.2.11 | 2.3 | 15.8% | 34 |
| shinh.Entangled 0.3 | 4.3 | 12.5% | 23 |
| gh.micro.Gruweltje 0.7 | 4.7 | 12.1% | 11 |
| apc.Colossus2 0.17 | 6.3 | 7.6% | 2 |
| stelo.Wang 1.0 | 6.7 | 7.1% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.7% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 82.9 | 12 / 35 | 4245 |
| 2 | 1 | 66.8 | 87.6 | 12 / 35 | 4485 |
| 3 | 1 | 66.8 | 87.0 | 12 / 35 | 4426 |
| 4 | 1 | 65.7 | 84.8 | 9 / 35 | 4090 |
| 5 | 3 | 66.2 | 84.4 | 11 / 35 | 4075 |
| 6 | 2 | 64.2 | 77.5 | 9 / 35 | 3995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 57 | 26% |
| ags.Glacier 0.2.11 | 53 | 64% |
| shinh.Entangled 0.3 | 21 | 48% |
| gh.micro.Gruweltje 0.7 | 7 | 43% |
| stelo.Wang 1.0 | 3 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 55 | 38% | 76 |
| ags.Glacier 0.2.11 | 41 | 28% | 69 |
| shinh.Entangled 0.3 | 22 | 15% | 29 |
| gh.micro.Gruweltje 0.7 | 17 | 12% | 23 |
| stelo.Wang 1.0 | 6 | 4% | 9 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |

Posture (Hadur's M records, 201 rounds): 146351 melee ticks, 51739 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 87 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 43092 sent, 38027 reached their opponent, 6002 virtual hits (15.8% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 138 over 6 battles (23.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.6 | 161 / 210 | 1.40 | 21.3% | 36328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 21.3% | 161 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.6% | 18 |
| catcat20.shape.Theta 0.018 | 2.7 | 12.3% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 4.7 | 9.8% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 9.5% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.0% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.5% | 3 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.6 | 25 / 35 | 5637 |
| 2 | 1 | 72.2 | 94.6 | 27 / 35 | 6225 |
| 3 | 1 | 71.9 | 96.8 | 28 / 35 | 5942 |
| 4 | 1 | 72.2 | 94.3 | 26 / 35 | 6571 |
| 5 | 1 | 71.6 | 96.2 | 28 / 35 | 5784 |
| 6 | 1 | 72.4 | 96.8 | 27 / 35 | 6169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 87% |
| catcat20.shape.Theta 0.018 | 63 | 68% |
| sanyi.mikrobi.Roberto 1.0 | 23 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 79% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 23 | 47% | 63 |
| simonton.micro.Sprout 1.1.3 | 19 | 39% | 78 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 8% | 15 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 10 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 33 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 4 |
| pa.Improved 1.0 | 0 | 0% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 140499 melee ticks, 53435 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 44176 sent, 39520 reached their opponent, 9708 virtual hits (24.6% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 205 over 6 battles (34.2 per battle, most in one battle 107). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.2 | 128 / 210 | 1.98 | 19.5% | 31265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 19.5% | 128 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.8% | 18 |
| emp.Yngwie 1.11 | 3.3 | 12.8% | 33 |
| mld.DustBunny 3.8 | 3.5 | 12.3% | 8 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.7% | 12 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.4% | 12 |
| lambdaxy.TBot 0.1 | 7.2 | 6.4% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 4.8% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.4 | 26 / 35 | 5515 |
| 2 | 1 | 69.0 | 87.3 | 19 / 35 | 5059 |
| 3 | 1 | 69.9 | 90.8 | 23 / 35 | 5034 |
| 4 | 1 | 67.3 | 83.5 | 16 / 35 | 4979 |
| 5 | 1 | 69.8 | 89.8 | 22 / 35 | 5298 |
| 6 | 1 | 70.4 | 91.1 | 22 / 35 | 5380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 48 | 73% |
| kawigi.micro.Shiz 1.1 | 37 | 95% |
| mld.DustBunny 3.8 | 25 | 96% |
| kawigi.robot.Girl 1.2 | 18 | 89% |
| cb.nano.Insomnia 1.0 | 17 | 82% |
| divineomega.TrialBot 0.003 | 5 | 80% |

Hadur died in 85 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 29 | 34% | 71 |
| mld.DustBunny 3.8 | 16 | 19% | 44 |
| kawigi.micro.Shiz 1.1 | 13 | 15% | 41 |
| cb.nano.Insomnia 1.0 | 10 | 12% | 13 |
| kawigi.robot.Girl 1.2 | 9 | 11% | 22 |
| divineomega.TrialBot 0.003 | 4 | 5% | 12 |
| lambdaxy.TBot 0.1 | 1 | 1% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 171471 melee ticks, 48760 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 47 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 54741 sent, 49840 reached their opponent, 7935 virtual hits (15.9% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 666 over 6 battles (111.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.7 | 124 / 210 | 1.84 | 20.1% | 33946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 20.1% | 124 |
| gh.Griezel 0.5.2 | 2.0 | 15.7% | 40 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.3% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.6% | 27 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.4% | 3 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.0% | 9 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.6% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.8 | 20 / 35 | 5524 |
| 2 | 1 | 69.6 | 87.9 | 19 / 35 | 5501 |
| 3 | 1 | 71.6 | 93.3 | 23 / 35 | 5974 |
| 4 | 1 | 71.4 | 93.7 | 22 / 35 | 5848 |
| 5 | 1 | 71.3 | 92.4 | 25 / 35 | 5793 |
| 6 | 1 | 68.7 | 86.0 | 15 / 35 | 5306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 85 | 68% |
| techdude.forest.FlamingForest 1.1 | 42 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 91% |
| bvh.fnr.Fenrir 0.36l | 10 | 90% |
| tvv.nano.Polaris 1.2 | 8 | 50% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1311. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 36 | 40% | 92 |
| techdude.forest.FlamingForest 1.1 | 23 | 25% | 51 |
| bvh.fnr.Fenrir 0.36l | 8 | 9% | 12 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 7 | 8% | 26 |
| tvv.nano.Polaris 1.2 | 6 | 7% | 9 |
| asd.Cthulhu 1.3 | 3 | 3% | 4 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 7 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 183577 melee ticks, 76669 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 55 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 58470 sent, 53652 reached their opponent, 8748 virtual hits (16.3% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 567 over 6 battles (94.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.8 | 104 / 210 | 2.28 | 19.0% | 34087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 19.0% | 104 |
| et.Predator 1.8 | 2.2 | 14.1% | 22 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.7% | 33 |
| cx.BlestPain 1.41 | 3.5 | 12.4% | 36 |
| ahf.NanoAndrew .4 | 5.0 | 10.0% | 4 |
| nic.Nicator 2.4 | 6.3 | 8.8% | 5 |
| maribo.melee.BMV 0.1 | 6.7 | 8.8% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 6.3% | 2 |
| tex.Longbot 0.4 | 9.0 | 5.4% | 2 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 15 / 35 | 5864 |
| 2 | 1 | 70.1 | 89.5 | 20 / 35 | 5544 |
| 3 | 1 | 68.8 | 85.1 | 16 / 35 | 5653 |
| 4 | 1 | 68.5 | 82.2 | 16 / 35 | 5711 |
| 5 | 1 | 69.7 | 89.8 | 20 / 35 | 5706 |
| 6 | 1 | 67.9 | 80.3 | 17 / 35 | 5609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 49 | 80% |
| oog.melee.Mercutio 1.0 | 44 | 75% |
| cx.BlestPain 1.41 | 29 | 28% |
| ahf.NanoAndrew .4 | 11 | 91% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 100% |
| nic.Nicator 2.4 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1093. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 30 | 27% | 68 |
| cx.BlestPain 1.41 | 30 | 27% | 49 |
| oog.melee.Mercutio 1.0 | 26 | 23% | 53 |
| nic.Nicator 2.4 | 7 | 6% | 12 |
| maribo.melee.BMV 0.1 | 6 | 5% | 13 |
| ahf.NanoAndrew .4 | 5 | 5% | 12 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 169018 melee ticks, 58488 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55108 sent, 50289 reached their opponent, 10535 virtual hits (20.9% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 509 over 6 battles (84.8 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 91.0 | 139 / 210 | 1.81 | 19.7% | 29349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 19.7% | 139 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.3% | 23 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.0% | 16 |
| uji.DBH 1.1 | 3.7 | 11.3% | 13 |
| ratosh.Nobo 0.21 | 5.8 | 8.8% | 1 |
| sigterm.Sigterm 1.0 | 6.0 | 8.8% | 10 |
| spinnercat.Robovirus 2.718 | 6.7 | 8.1% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.3% | 3 |
| stelo.WangRobot 1.0 | 9.2 | 5.7% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.4 | 23 / 35 | 5162 |
| 2 | 1 | 68.8 | 90.2 | 18 / 35 | 5004 |
| 3 | 1 | 68.3 | 87.9 | 20 / 35 | 4841 |
| 4 | 1 | 70.1 | 92.7 | 28 / 35 | 4741 |
| 5 | 1 | 68.5 | 88.6 | 24 / 35 | 4653 |
| 6 | 1 | 70.5 | 95.2 | 26 / 35 | 4948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 64 | 78% |
| uji.DBH 1.1 | 33 | 82% |
| agd.Mooserwirt2 2.7 | 26 | 85% |
| sigterm.Sigterm 1.0 | 19 | 74% |
| stelo.WangRobot 1.0 | 13 | 100% |
| spinnercat.Robovirus 2.718 | 8 | 75% |
| ratosh.Nobo 0.21 | 7 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 37% | 77 |
| agd.Mooserwirt2 2.7 | 14 | 19% | 41 |
| uji.DBH 1.1 | 11 | 15% | 32 |
| sigterm.Sigterm 1.0 | 8 | 11% | 20 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 10 |
| ratosh.Nobo 0.21 | 3 | 4% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 5 |
| stelo.WangRobot 1.0 | 1 | 1% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 136266 melee ticks, 50714 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 96 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 45549 sent, 40787 reached their opponent, 8896 virtual hits (21.8% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 98.5 | 201 / 210 | 1.13 | 22.7% | 37783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 22.7% | 201 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.2% | 6 |
| mld.Infinity 2.2 | 3.3 | 11.7% | 1 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.1% | 0 |
| erdnis.Rover 0.3 | 4.7 | 10.6% | 0 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.5% | 1 |
| mbh.Mbh 0.1 | 6.8 | 7.6% | 0 |
| pac.ABC 2.1 | 7.8 | 6.9% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 97.5 | 33 / 35 | 6400 |
| 2 | 1 | 73.9 | 98.4 | 33 / 35 | 6518 |
| 3 | 1 | 73.3 | 97.5 | 33 / 35 | 6193 |
| 4 | 1 | 73.6 | 98.4 | 33 / 35 | 6433 |
| 5 | 1 | 73.3 | 99.4 | 34 / 35 | 5879 |
| 6 | 1 | 74.1 | 100.0 | 35 / 35 | 6360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 109 | 100% |
| mld.Infinity 2.2 | 29 | 100% |
| krillr.mini.JointStrike 2.0.0 | 19 | 100% |
| erdnis.Rover 0.3 | 16 | 100% |
| pac.ABC 2.1 | 13 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| mbh.Mbh 0.1 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 10 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 2 | 20% | 68 |
| erdnis.Rover 0.3 | 2 | 20% | 32 |
| krillr.mini.JointStrike 2.0.0 | 2 | 20% | 26 |
| patson.PatsonTestBot 1.0 | 2 | 20% | 22 |
| pbg.R2D2 1.0 | 1 | 10% | 13 |
| pac.ABC 2.1 | 1 | 10% | 9 |
| mld.Infinity 2.2 | 0 | 0% | 18 |
| mbh.Mbh 0.1 | 0 | 0% | 12 |

Posture (Hadur's M records, 199 rounds): 127195 melee ticks, 42922 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 56 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 42727 sent, 38218 reached their opponent, 8914 virtual hits (23.3% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.6 | 143 / 210 | 1.66 | 20.9% | 35383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 20.9% | 143 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 28 |
| fwb.Nine 1.0.1 | 3.3 | 11.7% | 12 |
| catcat20.Rabbit 0.001 | 3.8 | 11.2% | 18 |
| nz.jdc.nano.GridFu 1.0 | 5.0 | 9.7% | 3 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.7% | 2 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 5.5% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.0 | 23 / 35 | 5738 |
| 2 | 1 | 71.1 | 89.8 | 24 / 35 | 6101 |
| 3 | 1 | 70.3 | 92.1 | 22 / 35 | 5380 |
| 4 | 1 | 72.5 | 96.8 | 28 / 35 | 6209 |
| 5 | 1 | 71.7 | 94.0 | 24 / 35 | 5944 |
| 6 | 1 | 70.9 | 89.2 | 22 / 35 | 6011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 73 | 74% |
| fwb.Nine 1.0.1 | 50 | 90% |
| catcat20.Rabbit 0.001 | 30 | 83% |
| nz.jdc.nano.GridFu 1.0 | 10 | 100% |
| bayen.nut.Squirrel 1.615 | 6 | 50% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 1032. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 49% | 87 |
| catcat20.Rabbit 0.001 | 14 | 20% | 49 |
| fwb.Nine 1.0.1 | 12 | 17% | 24 |
| bayen.nut.Squirrel 1.615 | 6 | 9% | 11 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 11 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| nz.jdc.nano.GridFu 1.0 | 0 | 0% | 13 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 172109 melee ticks, 51971 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 39 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 52748 sent, 48000 reached their opponent, 10480 virtual hits (21.8% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 677 over 6 battles (112.8 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.9 | 123 / 210 | 1.64 | 20.7% | 35700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 20.7% | 123 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 72 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.8% | 7 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 12.0% | 2 |
| eld.Hmm 1.0 | 5.3 | 8.0% | 6 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.5% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 16 / 35 | 5534 |
| 2 | 1 | 72.6 | 95.2 | 23 / 35 | 6532 |
| 3 | 1 | 71.5 | 93.0 | 20 / 35 | 5951 |
| 4 | 1 | 70.9 | 92.7 | 20 / 35 | 5700 |
| 5 | 1 | 71.8 | 93.3 | 23 / 35 | 6090 |
| 6 | 1 | 71.3 | 92.4 | 21 / 35 | 5893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 121 | 54% |
| cf.RiO.RiOx 4.2.1 | 31 | 97% |
| dummy.mini.Scimitar 1.01 | 23 | 87% |
| eld.Hmm 1.0 | 9 | 56% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1374. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 59 | 63% | 111 |
| dummy.mini.Scimitar 1.01 | 12 | 13% | 46 |
| cf.RiO.RiOx 4.2.1 | 10 | 11% | 28 |
| eld.Hmm 1.0 | 4 | 4% | 17 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 5 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 184845 melee ticks, 88192 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 43 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 53841 sent, 49019 reached their opponent, 8406 virtual hits (17.1% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 102 over 6 battles (17.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.0 | 105 / 210 | 1.90 | 18.9% | 30328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.2 | 18.9% | 105 |
| pe.SandboxDT 2.71m | 2.0 | 16.3% | 61 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.9% | 24 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.7% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 3 |
| yk.JahRoslav 1.1 | 6.2 | 7.0% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.3% | 1 |
| gg.Squaraus 0.6 | 7.5 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.8 | 19 / 35 | 4940 |
| 2 | 2 | 67.3 | 83.5 | 11 / 35 | 4805 |
| 3 | 1 | 69.7 | 92.4 | 16 / 35 | 5151 |
| 4 | 1 | 70.7 | 93.0 | 19 / 35 | 5217 |
| 5 | 1 | 70.1 | 91.1 | 18 / 35 | 5183 |
| 6 | 1 | 69.8 | 90.2 | 22 / 35 | 5032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 59 | 41% |
| kvk.HebusLeTroll 0.35 | 53 | 74% |
| jlm.javaDisturbance 0.59 | 41 | 73% |
| bigpete.Stewie 1.0 | 11 | 91% |
| yk.JahRoslav 1.1 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1041. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 49 | 47% | 85 |
| kvk.HebusLeTroll 0.35 | 35 | 33% | 62 |
| jlm.javaDisturbance 0.59 | 16 | 15% | 35 |
| bigpete.Stewie 1.0 | 3 | 3% | 17 |
| gg.Squaraus 0.6 | 1 | 1% | 3 |
| tad.Dalek98 0.98 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 203 rounds): 165687 melee ticks, 46254 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 52346 sent, 47599 reached their opponent, 7507 virtual hits (15.8% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 377 over 6 battles (62.8 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 95.4 | 171 / 210 | 1.41 | 21.9% | 37529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 21.9% | 171 |
| pe.SandboxLump 1.52 | 2.0 | 16.3% | 29 |
| cre.Karolos 0.32 | 3.0 | 14.2% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.2% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.3% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.7% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 7.9% | 0 |
| sample.Walls 1.0 | 7.7 | 7.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 95.6 | 29 / 35 | 6131 |
| 2 | 1 | 73.0 | 95.6 | 28 / 35 | 5969 |
| 3 | 1 | 73.8 | 94.9 | 28 / 35 | 6402 |
| 4 | 1 | 73.3 | 97.1 | 28 / 35 | 5909 |
| 5 | 1 | 73.3 | 96.5 | 29 / 35 | 6610 |
| 6 | 1 | 72.8 | 92.7 | 29 / 35 | 6508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 94 | 84% |
| cre.Karolos 0.32 | 67 | 96% |
| stelo.RamTrackSurfer 1.2 | 11 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| stelo.AreaTargetingBot 1.1 | 6 | 83% |
| sample.Walls 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 23 | 53% | 97 |
| cre.Karolos 0.32 | 9 | 21% | 59 |
| stelo.RamTrackSurfer 1.2 | 3 | 7% | 16 |
| cw.megas.Blade 0.8 | 2 | 5% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 5% | 5 |
| stelo.AreaTargetingBot 1.1 | 1 | 2% | 17 |
| sample.Walls 1.0 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 123511 melee ticks, 52278 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 57 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 39189 sent, 34396 reached their opponent, 10223 virtual hits (29.7% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 680 over 6 battles (113.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 81.5 | 69 / 210 | 2.67 | 16.4% | 23582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.2 | 16.4% | 69 |
| rz.GlowBlowMelee 1.4 | 2.5 | 13.9% | 41 |
| florent.XSeries.X2 0.12 | 3.0 | 13.6% | 37 |
| davidalves.Phoenix 0.54 | 3.3 | 13.2% | 40 |
| pedersen.Ugluk 1.1.1 | 5.2 | 11.1% | 16 |
| oog.melee.Corsair 1.0 | 5.8 | 9.5% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.4% | 2 |
| lunchie.Lunchbox 0.93 | 7.5 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 5.1% | 0 |
| evd.X1 0.01 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 76.8 | 14 / 35 | 3703 |
| 2 | 1 | 64.1 | 77.8 | 11 / 35 | 3748 |
| 3 | 1 | 65.7 | 83.2 | 12 / 35 | 4184 |
| 4 | 1 | 66.9 | 86.3 | 14 / 35 | 4162 |
| 5 | 2 | 64.2 | 79.4 | 7 / 35 | 3944 |
| 6 | 1 | 65.7 | 85.4 | 11 / 35 | 3841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 33 | 45% |
| florent.XSeries.X2 0.12 | 32 | 47% |
| rz.GlowBlowMelee 1.4 | 26 | 58% |
| pedersen.Ugluk 1.1.1 | 19 | 68% |
| oog.melee.Corsair 1.0 | 10 | 50% |
| stelo.SoJNanoMelee 1.1 | 5 | 80% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 36 | 24% | 52 |
| florent.XSeries.X2 0.12 | 36 | 24% | 50 |
| rz.GlowBlowMelee 1.4 | 28 | 19% | 46 |
| pedersen.Ugluk 1.1.1 | 22 | 15% | 28 |
| oog.melee.Corsair 1.0 | 10 | 7% | 15 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 8 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 6 |
| evd.X1 0.01 | 1 | 1% | 1 |
| as.FrankTheTank 1.3 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 141346 melee ticks, 34091 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46622 sent, 41600 reached their opponent, 7645 virtual hits (18.4% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 194 over 6 battles (32.3 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.6 | 147 / 210 | 1.93 | 19.2% | 24849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 19.2% | 147 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.6% | 21 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.5% | 9 |
| jdw.Hurricane 1.4 | 3.8 | 11.3% | 16 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.4% | 7 |
| ds.Oo 2.2 | 5.8 | 9.4% | 6 |
| adt.Ar2 1.1 | 7.3 | 7.1% | 0 |
| awesomeness.Elite 1.0 | 8.3 | 6.6% | 1 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.3% | 5 |
| amk.ChumbaMini 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 83.2 | 20 / 35 | 3951 |
| 2 | 1 | 68.8 | 91.4 | 27 / 35 | 3778 |
| 3 | 1 | 70.7 | 96.2 | 28 / 35 | 4247 |
| 4 | 1 | 68.6 | 87.6 | 23 / 35 | 4266 |
| 5 | 1 | 68.4 | 87.6 | 24 / 35 | 4324 |
| 6 | 1 | 69.7 | 91.7 | 25 / 35 | 4283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 88% |
| jdw.Hurricane 1.4 | 37 | 86% |
| voidious.micro.BlitzBat 1.05 | 33 | 97% |
| gre.svman4.Morfeas 1.4.1 | 18 | 67% |
| ds.Oo 2.2 | 15 | 93% |
| awesomeness.Elite 1.0 | 5 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 15 | 23% | 43 |
| jdw.Hurricane 1.4 | 13 | 20% | 36 |
| voidious.micro.BlitzBat 1.05 | 12 | 18% | 45 |
| gre.svman4.Morfeas 1.4.1 | 7 | 11% | 27 |
| ds.Oo 2.2 | 5 | 8% | 22 |
| adt.Ar2 1.1 | 5 | 8% | 12 |
| awesomeness.Elite 1.0 | 5 | 8% | 11 |
| amk.ChumbaMini 0.2 | 1 | 2% | 8 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 126254 melee ticks, 32584 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 31 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 44776 sent, 40033 reached their opponent, 6571 virtual hits (16.4% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 216 over 6 battles (36.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.9 | 154 / 210 | 1.55 | 21.2% | 38526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 21.2% | 154 |
| ak.Fermat 2.0 | 2.3 | 14.3% | 26 |
| lrem.Spectre 0.4.4 | 2.8 | 12.8% | 12 |
| shu.nitro.LENIN .T34 | 4.0 | 11.8% | 9 |
| js.PinBall 1.6 | 4.8 | 10.6% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.4% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.2 | 7.8% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 7.0% | 2 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.7 | 26 / 35 | 6449 |
| 2 | 1 | 71.5 | 92.4 | 24 / 35 | 6376 |
| 3 | 1 | 73.8 | 98.1 | 31 / 35 | 6747 |
| 4 | 1 | 72.4 | 94.6 | 26 / 35 | 6443 |
| 5 | 1 | 72.3 | 94.3 | 26 / 35 | 6425 |
| 6 | 1 | 70.9 | 91.4 | 21 / 35 | 6086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 80% |
| lrem.Spectre 0.4.4 | 51 | 88% |
| shu.nitro.LENIN .T34 | 38 | 92% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 100% |
| js.PinBall 1.6 | 7 | 86% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 67% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 24 | 42% | 73 |
| shu.nitro.LENIN .T34 | 12 | 21% | 52 |
| lrem.Spectre 0.4.4 | 12 | 21% | 45 |
| js.PinBall 1.6 | 3 | 5% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 4% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 4% | 8 |
| sample.SpinBot 1.0 | 1 | 2% | 2 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 159131 melee ticks, 51319 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 51876 sent, 46944 reached their opponent, 11272 virtual hits (24.0% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 736 over 6 battles (122.7 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.4 | 157 / 210 | 2.31 | 19.7% | 32783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.2 | 19.7% | 157 |
| mk.Alpha 0.2.1 | 1.8 | 13.6% | 28 |
| EH.Eagle 1.0.6 | 3.0 | 11.1% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.1% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.0% | 3 |
| wee.Gem 1.8.4 | 6.5 | 8.8% | 7 |
| joe.ADinosaur 1.0 | 6.7 | 8.2% | 2 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.6% | 2 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.3% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 98.1 | 32 / 35 | 5625 |
| 2 | 1 | 71.2 | 94.9 | 29 / 35 | 5562 |
| 3 | 1 | 72.3 | 96.5 | 31 / 35 | 5650 |
| 4 | 1 | 66.2 | 69.5 | 21 / 35 | 5576 |
| 5 | 2 | 60.1 | 55.9 | 12 / 35 | 4802 |
| 6 | 1 | 72.0 | 97.8 | 32 / 35 | 5568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 81 | 95% |
| EH.Eagle 1.0.6 | 37 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 92% |
| wee.Gem 1.8.4 | 11 | 100% |
| throxbot.ThroxBot 0.1 | 9 | 89% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 86% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| joe.ADinosaur 1.0 | 3 | 67% |

Hadur died in 59 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 16 | 27% | 16 |
| mk.Alpha 0.2.1 | 11 | 19% | 78 |
| wee.Gem 1.8.4 | 5 | 8% | 21 |
| joe.ADinosaur 1.0 | 5 | 8% | 12 |
| throxbot.ThroxBot 0.1 | 5 | 8% | 9 |
| EH.Eagle 1.0.6 | 4 | 7% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 5% | 18 |
| caimano.Furia_Ceca 0.22 | 3 | 5% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 10 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 124383 melee ticks, 37415 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 43 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 41248 sent, 36522 reached their opponent, 9350 virtual hits (25.6% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 6 battles (33.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.6 | 149 / 210 | 1.84 | 19.0% | 24781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 19.0% | 149 |
| kid.test.NightFox .2 | 2.0 | 14.6% | 23 |
| uji.Antique 1.0 | 3.3 | 11.8% | 15 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.6% | 10 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.5% | 7 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 3 |
| amk.ChumbaWumba 0.3 | 6.8 | 8.2% | 2 |
| matt.advanced.Katana 1.0 | 8.2 | 6.2% | 1 |
| stelo.PianistNano 1.2 | 8.8 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 89.2 | 21 / 35 | 4193 |
| 2 | 1 | 68.8 | 91.4 | 27 / 35 | 4034 |
| 3 | 1 | 68.8 | 91.1 | 26 / 35 | 4262 |
| 4 | 1 | 68.6 | 88.9 | 23 / 35 | 4352 |
| 5 | 1 | 68.0 | 88.3 | 28 / 35 | 3793 |
| 6 | 1 | 69.7 | 94.9 | 24 / 35 | 4147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 76 | 86% |
| uji.Antique 1.0 | 48 | 90% |
| qohnil.blot.BlotBot 3.61 | 16 | 94% |
| pfvicm.Sobieski 7.2.3b | 13 | 77% |
| amk.ChumbaWumba 0.3 | 8 | 88% |
| ahr.ice.Ice 1.0.2 | 7 | 86% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 16 | 25% | 46 |
| pfvicm.Sobieski 7.2.3b | 13 | 21% | 24 |
| uji.Antique 1.0 | 12 | 19% | 48 |
| qohnil.blot.BlotBot 3.61 | 6 | 10% | 32 |
| amk.ChumbaWumba 0.3 | 6 | 10% | 19 |
| ahr.ice.Ice 1.0.2 | 4 | 6% | 18 |
| stelo.Lifestealer 1.0 | 2 | 3% | 8 |
| matt.advanced.Katana 1.0 | 2 | 3% | 8 |
| stelo.PianistNano 1.2 | 1 | 2% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 130767 melee ticks, 34263 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 71 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 43696 sent, 38971 reached their opponent, 5555 virtual hits (14.3% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 702 over 6 battles (117.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.1 | 124 / 210 | 2.07 | 19.3% | 28161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 19.3% | 124 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.2% | 38 |
| deewiant.Anomaly 0.2 | 2.5 | 15.0% | 39 |
| myl.micro.Troodon 1.10 | 4.0 | 11.8% | 2 |
| jok.PheonixM 0.1.2 | 5.0 | 10.3% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.9% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.5% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.4 | 22 / 35 | 4536 |
| 2 | 1 | 69.7 | 88.3 | 21 / 35 | 4788 |
| 3 | 1 | 68.7 | 87.0 | 15 / 35 | 4508 |
| 4 | 1 | 70.8 | 92.7 | 23 / 35 | 4758 |
| 5 | 1 | 69.3 | 87.0 | 22 / 35 | 4631 |
| 6 | 1 | 70.3 | 88.6 | 21 / 35 | 4940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 72% |
| zyx.mega.YersiniaPestis 3.1 | 54 | 69% |
| myl.micro.Troodon 1.10 | 22 | 95% |
| jok.PheonixM 0.1.2 | 11 | 91% |
| jangs.ns51 1.0 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 39 | 41% | 87 |
| zyx.mega.YersiniaPestis 3.1 | 25 | 27% | 67 |
| myl.micro.Troodon 1.10 | 8 | 9% | 24 |
| jok.PheonixM 0.1.2 | 8 | 9% | 19 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 3 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 164517 melee ticks, 58234 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53883 sent, 48955 reached their opponent, 7458 virtual hits (15.2% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 707 over 6 battles (117.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 79.0 | 44 / 210 | 2.89 | 15.7% | 24501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.3 | 15.7% | 44 |
| catcat20.Matcha 0.006 | 2.5 | 14.3% | 53 |
| darkcanuck.B26354 1.06 | 3.0 | 13.6% | 49 |
| oog.melee.Capulet 1.2 | 3.8 | 12.7% | 31 |
| stelo.PastFuture 2.3.2 | 4.3 | 12.5% | 22 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.9% | 6 |
| ntc.Opposite 1.5 | 7.8 | 6.7% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 6.5% | 5 |
| tripphippy.Alice 1.1 | 8.0 | 6.4% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 80.0 | 6 / 35 | 3698 |
| 2 | 1 | 62.4 | 74.9 | 7 / 35 | 3824 |
| 3 | 1 | 65.5 | 80.3 | 8 / 35 | 4420 |
| 4 | 2 | 62.7 | 73.7 | 6 / 35 | 3912 |
| 5 | 1 | 65.9 | 84.4 | 9 / 35 | 4335 |
| 6 | 1 | 65.5 | 81.0 | 8 / 35 | 4312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 35 | 29% |
| darkcanuck.B26354 1.06 | 31 | 42% |
| oog.melee.Capulet 1.2 | 23 | 43% |
| stelo.PastFuture 2.3.2 | 15 | 40% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| tripphippy.Alice 1.1 | 3 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 172 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 42 | 24% | 51 |
| darkcanuck.B26354 1.06 | 38 | 22% | 50 |
| stelo.PastFuture 2.3.2 | 36 | 21% | 44 |
| oog.melee.Capulet 1.2 | 29 | 17% | 39 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 7 |
| tripphippy.Alice 1.1 | 4 | 2% | 5 |
| ntc.Opposite 1.5 | 3 | 2% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 162906 melee ticks, 35748 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 72 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51990 sent, 46908 reached their opponent, 7858 virtual hits (16.8% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 400 over 6 battles (66.7 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.1 | 63 / 210 | 2.70 | 16.3% | 23332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.7% | 92 |
| hadur117.Hadur 3.20xh | 1.7 | 16.3% | 63 |
| gh.mini.Griezel 0.2 | 3.0 | 13.0% | 36 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.2% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.3% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.2% | 5 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.9% | 2 |
| fm.mammillarias 1.3 | 8.7 | 5.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.7% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 83.2 | 14 / 35 | 4195 |
| 2 | 2 | 64.6 | 79.4 | 10 / 35 | 3813 |
| 3 | 2 | 65.5 | 80.3 | 11 / 35 | 4048 |
| 4 | 2 | 63.8 | 78.4 | 5 / 35 | 3509 |
| 5 | 1 | 65.8 | 82.5 | 12 / 35 | 3979 |
| 6 | 2 | 65.6 | 82.5 | 11 / 35 | 3788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 53 | 43% |
| gh.mini.Griezel 0.2 | 35 | 43% |
| spinnercat.micro.Tyger 0.1 | 14 | 79% |
| d414.nano.Quantum 1.0.0 | 11 | 64% |
| gh.nano.Grofvuil 0.2 | 5 | 80% |
| timmit.nano.TimDog 0.33 | 2 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 56 | 37% | 76 |
| gh.mini.Griezel 0.2 | 40 | 27% | 55 |
| d414.nano.Quantum 1.0.0 | 19 | 13% | 26 |
| spinnercat.micro.Tyger 0.1 | 15 | 10% | 26 |
| gh.nano.Grofvuil 0.2 | 8 | 5% | 16 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| fm.mammillarias 1.3 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 158483 melee ticks, 34738 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 79 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50550 sent, 45558 reached their opponent, 7349 virtual hits (16.1% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 726 over 6 battles (121.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 89.0 | 125 / 210 | 1.99 | 18.6% | 27692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 18.6% | 125 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 46 |
| apc.botM 3.0 | 3.2 | 11.7% | 13 |
| vjik.UnViolation 1.1 | 4.5 | 9.3% | 9 |
| lxx.ConceptA 0.8 | 4.7 | 9.7% | 4 |
| bayen.UbaMicro 1.4 | 6.2 | 8.8% | 1 |
| panzer.Panzer 0.2 | 7.5 | 7.8% | 1 |
| yk.JahMicro 1.0 | 8.0 | 7.1% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 6.1% | 4 |
| conscience.Electron 1.3g | 9.0 | 6.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 92.4 | 23 / 35 | 4675 |
| 2 | 1 | 67.9 | 89.2 | 18 / 35 | 4786 |
| 3 | 1 | 68.3 | 90.8 | 23 / 35 | 4540 |
| 4 | 1 | 66.9 | 86.3 | 20 / 35 | 4268 |
| 5 | 1 | 68.9 | 89.5 | 23 / 35 | 5125 |
| 6 | 1 | 66.7 | 86.0 | 18 / 35 | 4298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 78 | 63% |
| apc.botM 3.0 | 37 | 81% |
| vjik.UnViolation 1.1 | 13 | 77% |
| lxx.ConceptA 0.8 | 12 | 83% |
| donjezza.Jezza 1.0 | 8 | 88% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| yk.JahMicro 1.0 | 6 | 67% |
| panzer.Panzer 0.2 | 6 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 41% | 87 |
| apc.botM 3.0 | 13 | 14% | 42 |
| lxx.ConceptA 0.8 | 9 | 10% | 18 |
| bayen.UbaMicro 1.4 | 8 | 9% | 17 |
| vjik.UnViolation 1.1 | 5 | 5% | 23 |
| panzer.Panzer 0.2 | 4 | 4% | 5 |
| conscience.Electron 1.3g | 4 | 4% | 5 |
| yk.JahMicro 1.0 | 3 | 3% | 7 |
| donjezza.Jezza 1.0 | 3 | 3% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 128971 melee ticks, 52862 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 81 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 43182 sent, 38331 reached their opponent, 7046 virtual hits (18.4% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 613 over 6 battles (102.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.3 | 138 / 210 | 1.78 | 20.2% | 30676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 20.2% | 138 |
| maribo.Quester 0.3 | 2.0 | 15.7% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.5% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.6% | 9 |
| labg.Cataclysm 2.05 | 4.8 | 10.7% | 11 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.5% | 5 |
| baal.nano.N 1.42 | 6.3 | 8.8% | 0 |
| sanja.First 0.1 | 8.5 | 5.0% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 25 / 35 | 5333 |
| 2 | 1 | 70.4 | 89.2 | 22 / 35 | 5249 |
| 3 | 1 | 71.7 | 94.6 | 29 / 35 | 5060 |
| 4 | 1 | 68.6 | 85.1 | 16 / 35 | 4770 |
| 5 | 1 | 71.6 | 95.9 | 26 / 35 | 5258 |
| 6 | 1 | 70.0 | 89.8 | 20 / 35 | 5006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 79 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 79% |
| labg.Cataclysm 2.05 | 24 | 83% |
| gre.svman4.Leonidas 1.3.2 | 20 | 90% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 75% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 1044. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 33 | 43% | 88 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 17% | 44 |
| gre.svman4.Leonidas 1.3.2 | 12 | 16% | 24 |
| labg.Cataclysm 2.05 | 7 | 9% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 5% | 10 |
| baal.nano.N 1.42 | 3 | 4% | 11 |
| sanja.First 0.1 | 0 | 0% | 4 |
| zyx.micro.Ant 1.1 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 174246 melee ticks, 57215 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 49 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54836 sent, 50096 reached their opponent, 7327 virtual hits (14.6% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 522 over 6 battles (87.0 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.0 | 94 / 210 | 2.08 | 18.7% | 31373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 18.7% | 94 |
| kid.Gladiator .7.2 | 2.5 | 16.1% | 41 |
| stelo.Spread 0.9 | 2.5 | 16.1% | 58 |
| jcs.Seth 1.8 | 4.3 | 10.9% | 14 |
| tcf.Reach 3 | 5.2 | 10.8% | 2 |
| cli.Dancer 1.1 | 5.5 | 9.9% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.1 | 14 / 35 | 5420 |
| 2 | 1 | 68.2 | 87.6 | 12 / 35 | 4785 |
| 3 | 1 | 69.4 | 87.0 | 17 / 35 | 5209 |
| 4 | 1 | 70.0 | 88.3 | 18 / 35 | 5402 |
| 5 | 1 | 70.0 | 89.8 | 16 / 35 | 5311 |
| 6 | 1 | 70.1 | 90.5 | 17 / 35 | 5246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 73 | 51% |
| kid.Gladiator .7.2 | 55 | 64% |
| jcs.Seth 1.8 | 18 | 61% |
| tcf.Reach 3 | 7 | 100% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 1075. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 49 | 40% | 83 |
| kid.Gladiator .7.2 | 42 | 34% | 75 |
| jcs.Seth 1.8 | 19 | 16% | 34 |
| cli.Dancer 1.1 | 4 | 3% | 10 |
| tcf.Reach 3 | 2 | 2% | 8 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 167904 melee ticks, 59480 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52553 sent, 47715 reached their opponent, 8060 virtual hits (16.9% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 108). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 81.2 | 44 / 210 | 2.70 | 15.8% | 22809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 143 |
| hadur117.Hadur 3.20xh | 2.0 | 15.8% | 44 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.4% | 9 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.8% | 9 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 3 |
| wit.Chuliath 1.0 | 6.8 | 6.7% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 5.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.8 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 8.3 | 5.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 81.3 | 8 / 35 | 3731 |
| 2 | 2 | 67.0 | 86.3 | 12 / 35 | 4065 |
| 3 | 2 | 63.0 | 76.2 | 3 / 35 | 3741 |
| 4 | 2 | 65.0 | 82.5 | 7 / 35 | 3834 |
| 5 | 2 | 63.0 | 75.2 | 6 / 35 | 3574 |
| 6 | 2 | 65.8 | 85.4 | 8 / 35 | 3864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 99 | 22% |
| gh.mini.Gruwel 0.9 | 14 | 64% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 67% |
| rz.HawkOnFire 0.1 | 8 | 75% |
| wit.Chuliath 1.0 | 1 | 0% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 103 | 61% | 124 |
| gh.mini.Gruwel 0.9 | 19 | 11% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 10% | 25 |
| rz.HawkOnFire 0.1 | 14 | 8% | 17 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 4% | 8 |
| dans.Cinnamon 1.2 | 4 | 2% | 4 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 140443 melee ticks, 51696 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 56 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 43754 sent, 38868 reached their opponent, 6002 virtual hits (15.4% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 110 over 6 battles (18.3 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.4 | 158 / 210 | 1.50 | 21.1% | 32560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 21.1% | 158 |
| alpha.RainingFire 1.0 | 2.3 | 12.4% | 14 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 13 |
| bvh.micro.Freya 0.3 | 4.5 | 10.9% | 5 |
| mz.Cork 0.1 | 5.2 | 10.1% | 11 |
| m3thos.Eva02 0.7.1 | 5.5 | 10.0% | 5 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.4% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 4.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 96.2 | 30 / 35 | 5649 |
| 2 | 1 | 71.5 | 95.6 | 27 / 35 | 5439 |
| 3 | 1 | 71.0 | 93.0 | 24 / 35 | 5500 |
| 4 | 1 | 71.5 | 93.0 | 28 / 35 | 5150 |
| 5 | 1 | 69.7 | 90.8 | 20 / 35 | 5220 |
| 6 | 1 | 72.6 | 98.1 | 29 / 35 | 5602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 40 | 93% |
| alpha.RainingFire 1.0 | 39 | 77% |
| bvh.micro.Freya 0.3 | 33 | 94% |
| mz.Cork 0.1 | 31 | 81% |
| bvh.mini.Fenrir 0.39 | 21 | 86% |
| m3thos.Eva02 0.7.1 | 20 | 85% |

Hadur died in 52 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 14 | 27% | 41 |
| mz.Cork 0.1 | 10 | 19% | 32 |
| bzdp.Pansy 2.1 | 8 | 15% | 48 |
| bvh.mini.Fenrir 0.39 | 8 | 15% | 15 |
| bvh.micro.Freya 0.3 | 6 | 12% | 37 |
| m3thos.Eva02 0.7.1 | 5 | 10% | 29 |
| dl.BetterWalls 1.0 | 1 | 2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 144944 melee ticks, 50013 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 48 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49464 sent, 44895 reached their opponent, 9089 virtual hits (20.2% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 125 over 6 battles (20.8 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 91.0 | 174 / 210 | 1.81 | 19.9% | 34141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 19.9% | 174 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 10.7% | 7 |
| germ.TheMind .2 | 3.8 | 9.9% | 0 |
| EBBU.Sim2 1.02 | 5.0 | 9.5% | 5 |
| stelo.UntouchableNano 1.3 | 5.7 | 8.9% | 7 |
| lmk.ACPFinal 0.1 | 6.0 | 8.6% | 4 |
| agrach.Dalek 1.0 | 6.5 | 8.9% | 7 |
| mb.Beast 0.1 | 7.5 | 8.4% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.3% | 3 |
| skm.Ryubot 1.0 | 9.3 | 7.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.8 | 25 / 35 | 5654 |
| 2 | 1 | 70.7 | 97.1 | 32 / 35 | 5689 |
| 3 | 1 | 67.9 | 87.3 | 27 / 35 | 5401 |
| 4 | 1 | 70.9 | 95.6 | 31 / 35 | 6313 |
| 5 | 1 | 69.9 | 93.7 | 31 / 35 | 5706 |
| 6 | 1 | 68.0 | 88.3 | 28 / 35 | 5378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 28 | 100% |
| stelo.UntouchableNano 1.3 | 27 | 93% |
| EBBU.Sim2 1.02 | 26 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 100% |
| agrach.Dalek 1.0 | 21 | 100% |
| mb.Beast 0.1 | 19 | 95% |
| lmk.ACPFinal 0.1 | 16 | 88% |
| skm.Ryubot 1.0 | 14 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 15 | 42% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 17% | 33 |
| EBBU.Sim2 1.02 | 4 | 11% | 27 |
| lmk.ACPFinal 0.1 | 4 | 11% | 20 |
| mb.Beast 0.1 | 3 | 8% | 24 |
| stelo.UntouchableNano 1.3 | 2 | 6% | 23 |
| agrach.Dalek 1.0 | 1 | 3% | 37 |
| germ.TheMind .2 | 1 | 3% | 17 |
| skm.Ryubot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 93957 melee ticks, 26661 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 70 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 31725 sent, 27255 reached their opponent, 8084 virtual hits (29.7% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 213 over 6 battles (35.5 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.6 | 114 / 210 | 1.94 | 18.8% | 28391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 18.8% | 114 |
| justin.Mallais 14.0 | 2.0 | 15.6% | 57 |
| bvh.mini.Freya 0.55 | 3.0 | 13.5% | 14 |
| bts.mega.Gnarly 1.4 | 4.8 | 10.3% | 8 |
| kdf.KoulDestroyer 1.0 | 5.0 | 10.1% | 7 |
| cs.Wren 1.0 | 5.2 | 9.9% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.3 | 7.8% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.7 | 6.3% | 0 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.9 | 17 / 35 | 4653 |
| 2 | 1 | 68.3 | 87.3 | 18 / 35 | 4771 |
| 3 | 1 | 69.9 | 93.3 | 22 / 35 | 4684 |
| 4 | 1 | 69.3 | 91.1 | 21 / 35 | 4858 |
| 5 | 1 | 70.0 | 94.0 | 22 / 35 | 4928 |
| 6 | 1 | 66.5 | 82.9 | 14 / 35 | 4497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 70 | 59% |
| bvh.mini.Freya 0.55 | 34 | 85% |
| bts.mega.Gnarly 1.4 | 23 | 78% |
| kdf.KoulDestroyer 1.0 | 14 | 86% |
| cs.Wren 1.0 | 13 | 77% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 67% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 47 | 48% | 96 |
| bvh.mini.Freya 0.55 | 18 | 18% | 34 |
| bts.mega.Gnarly 1.4 | 11 | 11% | 30 |
| cs.Wren 1.0 | 8 | 8% | 22 |
| kdf.KoulDestroyer 1.0 | 7 | 7% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 3% | 5 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 140949 melee ticks, 43869 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 107 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 107 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 46104 sent, 41147 reached their opponent, 8562 virtual hits (20.8% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 590 over 6 battles (98.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.5 | 107 / 210 | 2.04 | 18.8% | 31110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 18.8% | 107 |
| bvh.fry.Freya 0.82 | 2.2 | 14.2% | 13 |
| az.Ololobot 0.2.4 | 3.0 | 13.3% | 57 |
| catcat20.Lambda 0.024 | 3.8 | 11.9% | 27 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.5% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 7.9% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.7 | 7.7% | 1 |
| gimp.GimpBot 0.1 | 6.8 | 7.6% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.2 | 5.4% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.7 | 13 / 35 | 5179 |
| 2 | 1 | 68.8 | 88.3 | 19 / 35 | 5044 |
| 3 | 1 | 68.3 | 89.2 | 17 / 35 | 4969 |
| 4 | 1 | 69.1 | 90.5 | 20 / 35 | 5338 |
| 5 | 1 | 67.7 | 87.0 | 18 / 35 | 4778 |
| 6 | 1 | 69.7 | 90.2 | 20 / 35 | 5802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 63 | 41% |
| bvh.fry.Freya 0.82 | 44 | 93% |
| catcat20.Lambda 0.024 | 36 | 69% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1119. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 44 | 41% | 75 |
| catcat20.Lambda 0.024 | 25 | 23% | 41 |
| bvh.fry.Freya 0.82 | 23 | 21% | 60 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 13 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 5 |
| gimp.GimpBot 0.1 | 1 | 1% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 170405 melee ticks, 55148 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 70 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 53447 sent, 48402 reached their opponent, 8361 virtual hits (17.3% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 332 over 6 battles (55.3 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.6 | 125 / 210 | 1.93 | 19.6% | 30785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 19.6% | 125 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.6% | 33 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.9% | 24 |
| mz.AntiGrav 1.0 | 4.0 | 11.7% | 10 |
| Polkwane.SmashMelee 1.0 | 5.5 | 10.0% | 8 |
| alpha.BlackIce 1.0 | 6.2 | 9.1% | 2 |
| stelo.Randomness 1.0 | 6.2 | 8.6% | 7 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.7% | 0 |
| sample.Corners 1.0 | 9.7 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.0 | 20 / 35 | 5030 |
| 2 | 1 | 71.1 | 92.7 | 21 / 35 | 5495 |
| 3 | 1 | 70.3 | 89.8 | 23 / 35 | 5104 |
| 4 | 1 | 68.1 | 84.1 | 14 / 35 | 4960 |
| 5 | 1 | 70.8 | 93.0 | 25 / 35 | 5136 |
| 6 | 1 | 70.2 | 91.1 | 22 / 35 | 5060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 57 | 77% |
| kano.gamma.KanoGamma 1.8 | 46 | 80% |
| mz.AntiGrav 1.0 | 29 | 79% |
| Polkwane.SmashMelee 1.0 | 16 | 69% |
| stelo.Randomness 1.0 | 6 | 67% |
| alpha.BlackIce 1.0 | 6 | 83% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 24 | 28% | 56 |
| kano.gamma.KanoGamma 1.8 | 17 | 20% | 62 |
| Polkwane.SmashMelee 1.0 | 14 | 16% | 21 |
| mz.AntiGrav 1.0 | 13 | 15% | 27 |
| alpha.BlackIce 1.0 | 7 | 8% | 14 |
| stelo.Randomness 1.0 | 6 | 7% | 18 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 9 |
| sample.Corners 1.0 | 0 | 0% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 157268 melee ticks, 43493 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 79 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51097 sent, 45924 reached their opponent, 9504 virtual hits (20.7% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 280 over 6 battles (46.7 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.4 | 111 / 210 | 2.05 | 18.3% | 25640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 18.3% | 111 |
| eem.EvBotNG v12.8 | 2.0 | 15.9% | 73 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 12.9% | 10 |
| ary.Swarm 1.1 | 3.7 | 12.6% | 6 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.3% | 9 |
| shrub.Silver v048 | 5.8 | 9.1% | 2 |
| zyx.nano.Ant 1.1 | 6.8 | 8.1% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.3% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 18 / 35 | 4224 |
| 2 | 1 | 68.3 | 87.6 | 18 / 35 | 4234 |
| 3 | 1 | 68.6 | 89.5 | 18 / 35 | 4153 |
| 4 | 1 | 68.5 | 88.3 | 18 / 35 | 4365 |
| 5 | 1 | 68.9 | 88.6 | 20 / 35 | 4521 |
| 6 | 1 | 68.3 | 88.6 | 19 / 35 | 4143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 80 | 48% |
| lessonz.robocode.Oz 0.5.0 | 39 | 92% |
| ary.Swarm 1.1 | 19 | 95% |
| simonton.nano.MeleeSeed 1.8 | 12 | 92% |
| shrub.Silver v048 | 5 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 55 | 54% | 95 |
| ary.Swarm 1.1 | 17 | 17% | 33 |
| lessonz.robocode.Oz 0.5.0 | 15 | 15% | 40 |
| simonton.nano.MeleeSeed 1.8 | 8 | 8% | 19 |
| jsal.Jsalbot 1.0 | 2 | 2% | 10 |
| shrub.Silver v048 | 2 | 2% | 7 |
| zyx.nano.Ant 1.1 | 1 | 1% | 4 |
| stelo.Mirror 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 153622 melee ticks, 51209 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 49 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 50420 sent, 45514 reached their opponent, 6839 virtual hits (15.0% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 464 over 6 battles (77.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.5 | 142 / 210 | 1.76 | 20.2% | 34307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 20.2% | 142 |
| wompi.Wallaby 5.1 | 2.0 | 15.2% | 37 |
| ara.Shera 0.88 | 3.5 | 12.6% | 16 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 12.9% | 13 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 2 |
| maribo.IotaCT 1.1 | 7.0 | 6.7% | 0 |
| dsw.StaticD 1.0 | 7.0 | 7.0% | 1 |
| mme.NikeEnhanced 2.0 | 7.8 | 6.0% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 95.9 | 28 / 35 | 6182 |
| 2 | 1 | 71.1 | 94.0 | 23 / 35 | 5876 |
| 3 | 1 | 68.9 | 88.9 | 22 / 35 | 5083 |
| 4 | 1 | 70.8 | 93.7 | 24 / 35 | 5844 |
| 5 | 1 | 68.8 | 84.1 | 19 / 35 | 5473 |
| 6 | 1 | 71.1 | 92.7 | 26 / 35 | 5849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 90 | 88% |
| maribo.mini.MiniQuester 0.1 | 38 | 95% |
| ara.Shera 0.88 | 33 | 67% |
| dsw.StaticD 1.0 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 24 | 33% | 94 |
| ara.Shera 0.88 | 24 | 33% | 48 |
| maribo.mini.MiniQuester 0.1 | 10 | 14% | 42 |
| amz.NanoClone 1.41 | 5 | 7% | 6 |
| dsw.StaticD 1.0 | 2 | 3% | 11 |
| maribo.IotaCT 1.1 | 2 | 3% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162309 melee ticks, 54104 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 46 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51366 sent, 46669 reached their opponent, 9232 virtual hits (19.8% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 660 over 6 battles (110.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.4 | 31 / 210 | 2.85 | 15.5% | 23035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 143 |
| hadur117.Hadur 3.20xh | 2.0 | 15.5% | 31 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.9% | 26 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.9% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.8% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 2 |
| jab.DiamondStealer 5 | 7.5 | 7.1% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 78.1 | 4 / 35 | 4097 |
| 2 | 2 | 65.0 | 79.4 | 3 / 35 | 3721 |
| 3 | 2 | 65.3 | 79.0 | 7 / 35 | 3716 |
| 4 | 2 | 66.3 | 83.5 | 9 / 35 | 3697 |
| 5 | 2 | 65.1 | 77.1 | 4 / 35 | 3794 |
| 6 | 2 | 65.7 | 79.4 | 4 / 35 | 4010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 88 | 18% |
| brainfade.melee.Dusk 0.44 | 20 | 45% |
| dummy.micro.Sparrow 2.5 | 5 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 106 | 57% | 123 |
| brainfade.melee.Dusk 0.44 | 32 | 17% | 40 |
| dummy.micro.Sparrow 2.5 | 17 | 9% | 20 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 9% | 17 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |
| Krabb.akim2.Akim2 1.1b | 2 | 1% | 3 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155358 melee ticks, 52817 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 49326 sent, 44298 reached their opponent, 7296 virtual hits (16.5% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 534 over 6 battles (89.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.1 | 154 / 210 | 1.62 | 21.0% | 34569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 21.0% | 154 |
| stelo.Liblix 0.3.1 | 2.0 | 14.9% | 33 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.9% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.5% | 1 |
| jwirde.Gort 2.0 | 4.7 | 9.5% | 2 |
| wompi.Quokka 1.6 | 6.2 | 7.7% | 2 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.1% | 1 |
| disan.Chair 2.2.0 | 7.5 | 7.1% | 1 |
| sample.Crazy 1.0 | 9.3 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.3 | 26 / 35 | 5722 |
| 2 | 1 | 71.6 | 93.3 | 23 / 35 | 6022 |
| 3 | 1 | 70.3 | 88.6 | 25 / 35 | 5389 |
| 4 | 1 | 72.1 | 95.9 | 28 / 35 | 5810 |
| 5 | 1 | 72.3 | 95.2 | 28 / 35 | 5863 |
| 6 | 1 | 71.1 | 92.1 | 24 / 35 | 5763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 82 | 80% |
| tzu.TheArtOfWar 1.2 | 60 | 88% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 14 | 100% |
| jwirde.Gort 2.0 | 9 | 100% |
| disan.Chair 2.2.0 | 4 | 100% |
| wompi.Quokka 1.6 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 29 | 48% | 104 |
| tzu.TheArtOfWar 1.2 | 19 | 32% | 58 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 5% | 13 |
| jwirde.Gort 2.0 | 2 | 3% | 18 |
| wompi.Quokka 1.6 | 1 | 2% | 8 |
| disan.Chair 2.2.0 | 1 | 2% | 3 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 155032 melee ticks, 48807 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 40 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 53014 sent, 48305 reached their opponent, 10131 virtual hits (21.0% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 392 over 6 battles (65.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.5 | 104 / 210 | 2.03 | 19.7% | 32222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.0 | 19.7% | 104 |
| jje.BagPuss 1.2 | 2.5 | 12.4% | 14 |
| eem.IWillFireNoBullet v2.8 | 3.8 | 10.4% | 73 |
| myl.nano.Graviton 1.10 | 3.8 | 11.4% | 6 |
| sul.Lunar 1.1 | 5.2 | 10.3% | 9 |
| fm.claire 1.7 | 6.5 | 8.8% | 0 |
| hvilela.HVilela 0.9 | 6.5 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.6% | 3 |
| wit.Deep7 2.0 | 8.8 | 5.4% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.3 | 10 / 35 | 5517 |
| 2 | 1 | 69.1 | 85.7 | 16 / 35 | 5671 |
| 3 | 1 | 69.5 | 90.5 | 15 / 35 | 5366 |
| 4 | 1 | 72.1 | 94.3 | 26 / 35 | 4723 |
| 5 | 1 | 69.3 | 87.0 | 17 / 35 | 5552 |
| 6 | 1 | 69.2 | 86.3 | 20 / 35 | 5393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 70 | 41% |
| myl.nano.Graviton 1.10 | 27 | 96% |
| jje.BagPuss 1.2 | 27 | 67% |
| sul.Lunar 1.1 | 23 | 74% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 75% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 44 | 40% | 0 |
| jje.BagPuss 1.2 | 21 | 19% | 65 |
| sul.Lunar 1.1 | 14 | 13% | 44 |
| myl.nano.Graviton 1.10 | 12 | 11% | 43 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 8% | 20 |
| hvilela.HVilela 0.9 | 3 | 3% | 14 |
| fm.claire 1.7 | 2 | 2% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 5 |
| abud.ThirdRobo 1.0 | 0 | 0% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 181040 melee ticks, 92271 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 48 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 56501 sent, 51827 reached their opponent, 8019 virtual hits (15.5% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20xh against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 705 over 6 battles (117.5 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.3 | 71 / 210 | 2.41 | 16.7% | 24709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20xh | 1.8 | 16.7% | 71 |
| kc.mini.Mirage 0.2 | 1.8 | 16.2% | 45 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.1% | 75 |
| mz.MicroSheep 1.0 | 4.8 | 10.7% | 4 |
| cx.Princess 1.0 | 5.0 | 10.1% | 12 |
| sadoner.killer 0.2 | 5.7 | 9.5% | 2 |
| arthord.NanoSatanMelee Beta | 6.7 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 81.0 | 7 / 35 | 4069 |
| 2 | 3 | 64.9 | 81.0 | 7 / 35 | 4045 |
| 3 | 2 | 66.5 | 85.1 | 12 / 35 | 4212 |
| 4 | 1 | 67.9 | 87.6 | 18 / 35 | 4277 |
| 5 | 2 | 66.4 | 84.8 | 13 / 35 | 3968 |
| 6 | 1 | 67.3 | 86.7 | 14 / 35 | 4138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 66 | 70% |
| rsalesc.melee.Medina 0.4.5 | 43 | 12% |
| cx.Princess 1.0 | 12 | 83% |
| mz.MicroSheep 1.0 | 10 | 80% |
| sadoner.killer 0.2 | 2 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 67 | 46% | 70 |
| kc.mini.Mirage 0.2 | 49 | 34% | 98 |
| mz.MicroSheep 1.0 | 7 | 5% | 16 |
| cx.Princess 1.0 | 5 | 3% | 11 |
| jeremyreeder.collective.Prophet 5 | 4 | 3% | 4 |
| sadoner.killer 0.2 | 3 | 2% | 5 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 5 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 151498 melee ticks, 53463 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45053 sent, 40082 reached their opponent, 5911 virtual hits (14.7% of those reached).

