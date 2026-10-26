# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 6 battles (51.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 86.3 | 47 / 210 | 2.23 | 16.8% | 27849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 145 |
| hadur2.Hadur 3.17.1ep | 2.0 | 16.8% | 47 |
| sgp.JollyNinja 3.53 | 3.7 | 11.2% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.9% | 2 |
| lorneswork.Predator 1.0 | 4.5 | 10.5% | 2 |
| mz.MicroGodMelee 1 | 5.5 | 10.2% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.4% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 88.9 | 11 / 35 | 4502 |
| 2 | 2 | 66.1 | 84.4 | 11 / 35 | 4557 |
| 3 | 2 | 67.0 | 86.7 | 7 / 35 | 4955 |
| 4 | 2 | 67.0 | 88.3 | 9 / 35 | 4604 |
| 5 | 2 | 66.1 | 84.1 | 3 / 35 | 4741 |
| 6 | 2 | 65.8 | 85.4 | 6 / 35 | 4490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 125 | 10% |
| mz.MicroGodMelee 1 | 12 | 100% |
| sgp.JollyNinja 3.53 | 11 | 73% |
| lorneswork.Predator 1.0 | 10 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 50% |
| adt.Ar2 1.0 | 1 | 0% |

Hadur died in 165 of 210 rounds, at a mean tick of 1167. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 73% | 135 |
| sgp.JollyNinja 3.53 | 15 | 9% | 24 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 7% | 14 |
| lorneswork.Predator 1.0 | 10 | 6% | 16 |
| mz.MicroGodMelee 1 | 2 | 1% | 13 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 4 |
| adt.Ar2 1.0 | 2 | 1% | 3 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 150702 melee ticks, 81038 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 49 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 47517 sent, 43105 reached their opponent, 9215 virtual hits (21.4% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 251 over 6 battles (41.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.4 | 94 / 210 | 2.31 | 17.7% | 26257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 17.7% | 94 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.3% | 42 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 14.2% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.1% | 12 |
| Noran.BitchingElk 0.054 | 6.7 | 7.9% | 15 |
| sch.Simone 0.3d | 6.8 | 8.2% | 14 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.5% | 0 |
| stelo.PatternRobot 1.0 | 9.2 | 5.4% | 3 |
| fullsail.SweetTea 1.1 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.4 | 16 / 35 | 4302 |
| 2 | 1 | 66.8 | 84.8 | 16 / 35 | 4248 |
| 3 | 1 | 67.3 | 85.1 | 14 / 35 | 4418 |
| 4 | 1 | 67.0 | 85.7 | 15 / 35 | 4482 |
| 5 | 1 | 66.4 | 83.5 | 14 / 35 | 4314 |
| 6 | 1 | 68.0 | 88.9 | 19 / 35 | 4493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 51 | 73% |
| pulsar.PulsarMax 0.8.9 | 46 | 50% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 71% |
| Noran.BitchingElk 0.054 | 11 | 45% |
| sch.Simone 0.3d | 11 | 55% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 63% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 33 | 28% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 21% | 61 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 15% | 26 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 9% | 23 |
| sch.Simone 0.3d | 10 | 9% | 15 |
| Noran.BitchingElk 0.054 | 9 | 8% | 15 |
| stelo.PatternRobot 1.0 | 7 | 6% | 7 |
| fullsail.SweetTea 1.1 | 2 | 2% | 5 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 170924 melee ticks, 38827 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 39 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 59984 sent, 55569 reached their opponent, 9920 virtual hits (17.9% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 338 over 6 battles (56.3 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.1 | 151 / 210 | 1.90 | 19.3% | 33532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 19.3% | 151 |
| radnor.DoctorBob 1.42 | 2.3 | 14.4% | 25 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.2% | 18 |
| vuen.Cake 2.51 | 3.5 | 11.9% | 13 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 0 |
| adt.Ar1 2.1 | 6.2 | 8.0% | 1 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.7% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 93.3 | 26 / 35 | 5697 |
| 2 | 1 | 70.1 | 92.7 | 26 / 35 | 5819 |
| 3 | 1 | 68.6 | 88.9 | 26 / 35 | 5244 |
| 4 | 1 | 69.3 | 89.5 | 26 / 35 | 5623 |
| 5 | 1 | 69.5 | 91.1 | 25 / 35 | 5736 |
| 6 | 1 | 67.7 | 84.8 | 22 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 59 | 98% |
| vuen.Cake 2.51 | 50 | 88% |
| kawigi.nano.Lib 1.0 | 35 | 91% |
| oa.weak.FlyMk1 0.1 | 7 | 86% |
| urdos.URDOS 1.3 | 5 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 33% | 67 |
| kawigi.nano.Lib 1.0 | 14 | 23% | 38 |
| vuen.Cake 2.51 | 12 | 20% | 62 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 10% | 7 |
| adt.Ar1 2.1 | 3 | 5% | 4 |
| urdos.URDOS 1.3 | 2 | 3% | 10 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 11 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 131918 melee ticks, 37799 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 42 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 40478 sent, 36277 reached their opponent, 10115 virtual hits (27.9% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 520 over 6 battles (86.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.3 | 26 / 210 | 2.32 | 16.5% | 27815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.8% | 166 |
| hadur2.Hadur 3.17.1ep | 2.0 | 16.5% | 26 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.7% | 10 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 6 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 7.0% | 1 |
| css.Delitioner 0.11 | 6.8 | 6.8% | 1 |
| rampancy.Durandal 2.1d | 7.5 | 5.8% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 85.7 | 5 / 35 | 4673 |
| 2 | 2 | 66.6 | 84.1 | 2 / 35 | 5031 |
| 3 | 2 | 65.7 | 84.4 | 1 / 35 | 4340 |
| 4 | 2 | 67.7 | 86.7 | 8 / 35 | 4736 |
| 5 | 2 | 66.8 | 86.3 | 5 / 35 | 4427 |
| 6 | 2 | 66.6 | 84.8 | 5 / 35 | 4608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 120 | 9% |
| TNT.TNT 0.99.1 | 12 | 67% |
| apc.LeeroyJenkins2 1.0 | 11 | 55% |
| josago.Jorgito 0.16 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 0% |

Hadur died in 188 of 210 rounds, at a mean tick of 1276. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 134 | 71% | 146 |
| apc.LeeroyJenkins2 1.0 | 26 | 14% | 31 |
| TNT.TNT 0.99.1 | 18 | 10% | 25 |
| josago.Jorgito 0.16 | 3 | 2% | 4 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 199572 melee ticks, 61642 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 61827 sent, 57288 reached their opponent, 8870 virtual hits (15.5% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 500 over 6 battles (83.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 74.5 | 20 / 210 | 3.30 | 13.7% | 19315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.7% | 98 |
| justin.DemonicRage 3.4 | 1.5 | 17.9% | 71 |
| hadur2.Hadur 3.17.1ep | 3.2 | 13.7% | 20 |
| wompi.Numbat 2.1 | 3.8 | 12.9% | 18 |
| axeBots.HataMoto 3.09 | 5.3 | 8.8% | 3 |
| ms.Ares 0.19 | 5.7 | 8.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.3 | 6.1% | 0 |
| supersample.SuperBoxBot 1.0 | 7.7 | 6.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.1% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 73.3 | 3 / 35 | 3330 |
| 2 | 3 | 63.0 | 77.8 | 7 / 35 | 3192 |
| 3 | 3 | 60.7 | 72.1 | 2 / 35 | 3166 |
| 4 | 3 | 61.0 | 73.0 | 3 / 35 | 3126 |
| 5 | 3 | 62.8 | 78.4 | 3 / 35 | 3392 |
| 6 | 4 | 60.4 | 72.4 | 2 / 35 | 3109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 33 | 33% |
| cb.fire.Firestarter 2.0f | 30 | 10% |
| wompi.Numbat 2.1 | 6 | 83% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 78 | 40% | 88 |
| cb.fire.Firestarter 2.0f | 56 | 29% | 61 |
| wompi.Numbat 2.1 | 32 | 16% | 35 |
| ms.Ares 0.19 | 13 | 7% | 14 |
| axeBots.HataMoto 3.09 | 5 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 153271 melee ticks, 26358 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 51 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 48294 sent, 43605 reached their opponent, 7569 virtual hits (17.4% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 512 over 6 battles (85.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.7 | 115 / 210 | 2.20 | 18.2% | 27844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 18.2% | 115 |
| jekl.StoneGhost 0.7 | 2.3 | 15.1% | 28 |
| origin.SleepSiphon 1.7b | 2.8 | 13.9% | 45 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.1% | 14 |
| mld.Wisdom 1.0 | 5.0 | 10.1% | 0 |
| gg.Wolverine 2.0 | 5.8 | 8.7% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.3% | 5 |
| spinnercat.Omen 1.0 | 8.0 | 6.4% | 1 |
| DBall.NUKE 0.1 | 8.3 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 20 / 35 | 4677 |
| 2 | 1 | 68.8 | 87.9 | 21 / 35 | 4758 |
| 3 | 1 | 68.4 | 88.9 | 22 / 35 | 4463 |
| 4 | 1 | 67.8 | 86.0 | 18 / 35 | 4572 |
| 5 | 1 | 68.9 | 88.3 | 19 / 35 | 4819 |
| 6 | 1 | 66.7 | 82.9 | 15 / 35 | 4555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 51 | 80% |
| origin.SleepSiphon 1.7b | 35 | 69% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 90% |
| gg.Wolverine 2.0 | 10 | 90% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 36 | 36% | 64 |
| jekl.StoneGhost 0.7 | 30 | 30% | 70 |
| pe.minimelee.SandboxMiniMelee 1.1 | 12 | 12% | 39 |
| mld.Wisdom 1.0 | 6 | 6% | 15 |
| gg.Wolverine 2.0 | 5 | 5% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 8 |
| spinnercat.Omen 1.0 | 2 | 2% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155193 melee ticks, 38348 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 34 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48140 sent, 43702 reached their opponent, 10454 virtual hits (23.9% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 525 over 6 battles (87.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.3 | 117 / 210 | 1.69 | 19.7% | 32864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 19.7% | 117 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.0% | 44 |
| rtk.Tachikoma 1.0 | 2.7 | 16.2% | 29 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.6% | 7 |
| franzor.Lizt 1.3.1 | 4.7 | 11.1% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.0 | 21 / 35 | 5259 |
| 2 | 1 | 71.5 | 92.1 | 17 / 35 | 5972 |
| 3 | 1 | 71.7 | 95.2 | 21 / 35 | 5433 |
| 4 | 1 | 70.7 | 91.4 | 15 / 35 | 5592 |
| 5 | 1 | 70.8 | 91.7 | 22 / 35 | 5041 |
| 6 | 1 | 70.9 | 90.5 | 21 / 35 | 5567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 78 | 73% |
| rsalesc.melee.Monk 0.3.6c | 48 | 31% |
| franzor.Lizt 1.3.1 | 28 | 71% |
| oog.melee.CapuletDroid 1.1 | 27 | 93% |

Hadur died in 97 of 210 rounds, at a mean tick of 1411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 40 | 41% | 72 |
| rtk.Tachikoma 1.0 | 33 | 34% | 88 |
| franzor.Lizt 1.3.1 | 11 | 11% | 3 |
| oog.melee.CapuletDroid 1.1 | 7 | 7% | 41 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 198058 melee ticks, 89116 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 58827 sent, 54417 reached their opponent, 11503 virtual hits (21.1% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 585 over 6 battles (97.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 91.2 | 131 / 210 | 1.80 | 19.2% | 27431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 19.2% | 131 |
| tm.Yuugao 1.0 | 2.5 | 12.2% | 29 |
| shrub.Vapour v159 | 2.7 | 12.5% | 24 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.1% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 10.0% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.7% | 2 |
| m3thos.Eva00 1.1 | 6.7 | 8.5% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 5.9% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 88.6 | 19 / 35 | 4371 |
| 2 | 1 | 68.6 | 91.4 | 21 / 35 | 4546 |
| 3 | 1 | 68.3 | 89.2 | 21 / 35 | 4637 |
| 4 | 1 | 69.5 | 94.3 | 26 / 35 | 4457 |
| 5 | 1 | 69.1 | 90.8 | 23 / 35 | 4792 |
| 6 | 1 | 69.0 | 92.7 | 21 / 35 | 4628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 46 | 65% |
| shrub.Vapour v159 | 35 | 77% |
| Krabb.sliNk.Garm 0.9u | 33 | 70% |
| com.spp.robocode.MostlyHarmless 010 | 28 | 96% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 88% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 20 | 24% | 62 |
| shrub.Vapour v159 | 20 | 24% | 46 |
| Krabb.sliNk.Garm 0.9u | 17 | 20% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 12% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 5% | 17 |
| zyx.nano.BacillusComma 1.0 | 4 | 5% | 5 |
| m3thos.Eva00 1.1 | 3 | 4% | 10 |
| SHAM.WOW 1.4 | 1 | 1% | 6 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155261 melee ticks, 45281 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 577 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 213 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51393 sent, 46769 reached their opponent, 9159 virtual hits (19.6% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 729 over 6 battles (121.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 76.1 | 48 / 210 | 3.15 | 14.8% | 19870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.1% | 102 |
| hadur2.Hadur 3.17.1ep | 2.3 | 14.8% | 48 |
| kc.micro.Figment 1.0 | 2.5 | 14.3% | 28 |
| yagami.Tidus 0.11 | 4.8 | 11.0% | 5 |
| pedersen.Grishnakh 1.0 | 4.8 | 9.9% | 9 |
| mc2.enemy.Original 0.9 | 5.3 | 9.7% | 16 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 1 |
| step.nanoPri 1.0 | 8.0 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.6 | 76.2 | 9 / 35 | 3336 |
| 2 | 2 | 65.1 | 83.2 | 8 / 35 | 3377 |
| 3 | 1 | 64.4 | 80.0 | 11 / 35 | 3514 |
| 4 | 2 | 62.5 | 76.5 | 7 / 35 | 3377 |
| 5 | 3 | 60.1 | 69.5 | 4 / 35 | 3105 |
| 6 | 3 | 61.1 | 71.1 | 9 / 35 | 3161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 53 | 19% |
| kc.micro.Figment 1.0 | 32 | 88% |
| mc2.enemy.Original 0.9 | 9 | 33% |
| dft.Calliope 5.6 | 3 | 67% |
| yagami.Tidus 0.11 | 3 | 67% |
| pedersen.Grishnakh 1.0 | 3 | 67% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 60 | 36% | 71 |
| yagami.Tidus 0.11 | 28 | 17% | 31 |
| kc.micro.Figment 1.0 | 25 | 15% | 50 |
| mc2.enemy.Original 0.9 | 20 | 12% | 26 |
| pedersen.Grishnakh 1.0 | 12 | 7% | 12 |
| dft.Calliope 5.6 | 8 | 5% | 10 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 155552 melee ticks, 34439 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 25 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 50832 sent, 46335 reached their opponent, 6837 virtual hits (14.8% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 6 battles (21.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 93.2 | 151 / 210 | 1.61 | 19.4% | 29729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 19.4% | 151 |
| DTF.Kludgy 1.2b | 2.2 | 14.2% | 22 |
| ne.Chimera 1.2 | 3.0 | 12.9% | 12 |
| ejb.Polaris 1.0.1 | 3.8 | 12.3% | 13 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.2% | 4 |
| vStar.RAFzilla 2.15 | 5.5 | 10.2% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.5% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.2% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.2% | 1 |
| donjezza.Muncho 1.0 | 9.3 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 94.3 | 27 / 35 | 4636 |
| 2 | 1 | 70.3 | 96.8 | 28 / 35 | 4891 |
| 3 | 1 | 69.7 | 92.4 | 26 / 35 | 5101 |
| 4 | 1 | 69.8 | 94.3 | 26 / 35 | 4906 |
| 5 | 1 | 70.6 | 94.3 | 25 / 35 | 5528 |
| 6 | 1 | 67.3 | 87.0 | 19 / 35 | 4667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 59 | 78% |
| ejb.Polaris 1.0.1 | 42 | 83% |
| ne.Chimera 1.2 | 33 | 82% |
| vStar.RAFzilla 2.15 | 22 | 91% |
| tvv.micro.Antares 1.1.1 | 11 | 100% |
| donjezza.Muncho 1.0 | 7 | 86% |
| kurios.DOSexe .9b | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 35% | 66 |
| ejb.Polaris 1.0.1 | 14 | 23% | 49 |
| ne.Chimera 1.2 | 13 | 22% | 32 |
| vStar.RAFzilla 2.15 | 6 | 10% | 22 |
| sam.Samspin 1.0 | 3 | 5% | 5 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 19 |
| donjezza.Muncho 1.0 | 1 | 2% | 5 |
| kurios.DOSexe .9b | 0 | 0% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 147670 melee ticks, 54170 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 54 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 49139 sent, 44767 reached their opponent, 9306 virtual hits (20.8% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 437 over 6 battles (72.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 78.3 | 65 / 210 | 2.96 | 15.5% | 21002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.5% | 69 |
| hadur2.Hadur 3.17.1ep | 1.8 | 15.5% | 65 |
| cx.mini.Nimrod 0.55 | 3.2 | 13.2% | 24 |
| djc.DynaBot 0.1.1 | 3.8 | 11.1% | 15 |
| br2.MobyDickBot 1.6 | 5.8 | 9.1% | 16 |
| rdt199.Warlord 0.73 | 5.8 | 8.9% | 12 |
| uji.YellohFellah 1.0 | 6.3 | 8.6% | 9 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 77.1 | 10 / 35 | 3433 |
| 2 | 2 | 61.6 | 74.9 | 7 / 35 | 3412 |
| 3 | 2 | 65.0 | 82.2 | 12 / 35 | 3680 |
| 4 | 2 | 62.9 | 75.6 | 10 / 35 | 3507 |
| 5 | 1 | 64.8 | 81.9 | 13 / 35 | 3567 |
| 6 | 2 | 63.2 | 77.8 | 13 / 35 | 3403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 37 | 51% |
| br2.MobyDickBot 1.6 | 16 | 44% |
| uji.YellohFellah 1.0 | 15 | 87% |
| djc.DynaBot 0.1.1 | 14 | 71% |
| cx.mini.Nimrod 0.55 | 13 | 69% |
| rdt199.Warlord 0.73 | 9 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 53 | 36% | 80 |
| cx.mini.Nimrod 0.55 | 25 | 17% | 33 |
| djc.DynaBot 0.1.1 | 17 | 11% | 27 |
| rdt199.Warlord 0.73 | 14 | 9% | 20 |
| br2.MobyDickBot 1.6 | 14 | 9% | 20 |
| uji.YellohFellah 1.0 | 10 | 7% | 17 |
| KiraNL.Chupacabra 0.4 | 7 | 5% | 7 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 157928 melee ticks, 34170 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52185 sent, 47509 reached their opponent, 6824 virtual hits (14.4% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 323 over 6 battles (53.8 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.8 | 105 / 210 | 2.55 | 16.7% | 20415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 16.7% | 105 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.9% | 37 |
| darkcanuck.Leon 1.01 | 3.2 | 13.2% | 22 |
| nat.PallasHawk 1.0 | 3.5 | 12.8% | 26 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.8% | 15 |
| jrm.Test0 1.0 | 6.3 | 8.1% | 2 |
| cs.sheldor.Talon 1.1 | 6.5 | 7.2% | 2 |
| jp.Perpy 16.0 | 8.3 | 6.4% | 0 |
| stuff.Vlad 0.1 | 9.2 | 5.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 80.0 | 16 / 35 | 3453 |
| 2 | 1 | 64.5 | 80.6 | 15 / 35 | 3443 |
| 3 | 1 | 64.2 | 79.7 | 15 / 35 | 3328 |
| 4 | 1 | 66.5 | 87.0 | 19 / 35 | 3248 |
| 5 | 1 | 66.3 | 84.1 | 21 / 35 | 3496 |
| 6 | 1 | 65.9 | 85.1 | 19 / 35 | 3447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 48 | 85% |
| bts.wiki.RipCurl 0.9b | 34 | 68% |
| nat.PallasHawk 1.0 | 33 | 67% |
| brainfade.melee.Genghis 0.36 | 16 | 81% |
| jrm.Test0 1.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 34 | 32% | 51 |
| nat.PallasHawk 1.0 | 20 | 19% | 50 |
| darkcanuck.Leon 1.01 | 18 | 17% | 60 |
| brainfade.melee.Genghis 0.36 | 13 | 12% | 21 |
| jrm.Test0 1.0 | 11 | 10% | 13 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 9 |
| stuff.Vlad 0.1 | 3 | 3% | 3 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 2 |
| jp.Perpy 16.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 131293 melee ticks, 36176 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 54 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45286 sent, 40572 reached their opponent, 7212 virtual hits (17.8% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 88 over 6 battles (14.7 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 79.7 | 51 / 210 | 2.82 | 15.0% | 21671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 16.9% | 86 |
| ags.Glacier 0.2.11 | 2.0 | 16.0% | 39 |
| hadur2.Hadur 3.17.1ep | 3.0 | 15.0% | 51 |
| shinh.Entangled 0.3 | 4.2 | 12.7% | 26 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.7% | 7 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 1 |
| ayk.WallHugger 1.0 | 8.5 | 4.7% | 0 |
| maribo.FollowFire 1 | 8.5 | 5.0% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.3 | 81.6 | 9 / 35 | 3577 |
| 2 | 3 | 64.3 | 80.6 | 8 / 35 | 3825 |
| 3 | 3 | 63.3 | 77.8 | 8 / 35 | 3740 |
| 4 | 3 | 64.8 | 82.5 | 9 / 35 | 3724 |
| 5 | 3 | 63.0 | 80.3 | 8 / 35 | 3322 |
| 6 | 3 | 63.1 | 75.6 | 9 / 35 | 3483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 48 | 25% |
| ags.Glacier 0.2.11 | 30 | 73% |
| shinh.Entangled 0.3 | 25 | 56% |
| gh.micro.Gruweltje 0.7 | 4 | 50% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 63 | 39% | 75 |
| ags.Glacier 0.2.11 | 39 | 24% | 58 |
| shinh.Entangled 0.3 | 26 | 16% | 40 |
| gh.micro.Gruweltje 0.7 | 18 | 11% | 20 |
| stelo.Wang 1.0 | 8 | 5% | 10 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 204 rounds): 147493 melee ticks, 42383 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 58 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44022 sent, 39343 reached their opponent, 6602 virtual hits (16.8% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.8 | 142 / 210 | 1.82 | 19.0% | 28527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 19.0% | 142 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 20 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.9% | 34 |
| sanyi.mikrobi.Roberto 1.0 | 4.7 | 9.9% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.5% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.3% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.4% | 4 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.4 | 23 / 35 | 4940 |
| 2 | 1 | 69.0 | 89.5 | 24 / 35 | 4855 |
| 3 | 1 | 69.6 | 90.2 | 24 / 35 | 4922 |
| 4 | 1 | 69.2 | 93.0 | 23 / 35 | 4439 |
| 5 | 1 | 67.9 | 89.2 | 22 / 35 | 4492 |
| 6 | 1 | 69.4 | 91.7 | 26 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.shape.Theta 0.018 | 60 | 65% |
| simonton.micro.Sprout 1.1.3 | 57 | 91% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 82% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 27 | 39% | 56 |
| simonton.micro.Sprout 1.1.3 | 22 | 31% | 83 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 14% | 31 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 4% | 17 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 8 |
| pa.Improved 1.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 147812 melee ticks, 47213 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 33 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46910 sent, 42707 reached their opponent, 10527 virtual hits (24.6% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 545 over 6 battles (90.8 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.0 | 96 / 210 | 2.35 | 17.9% | 27402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 17.9% | 96 |
| emp.Yngwie 1.11 | 2.5 | 13.9% | 62 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.0% | 19 |
| mld.DustBunny 3.8 | 3.8 | 12.2% | 7 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.4% | 6 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.8% | 17 |
| lambdaxy.TBot 0.1 | 7.5 | 6.3% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.2 | 21 / 35 | 5011 |
| 2 | 1 | 68.6 | 87.0 | 16 / 35 | 5023 |
| 3 | 1 | 66.7 | 84.1 | 16 / 35 | 4068 |
| 4 | 1 | 66.3 | 83.8 | 13 / 35 | 4307 |
| 5 | 1 | 67.3 | 85.7 | 15 / 35 | 4421 |
| 6 | 1 | 65.8 | 79.0 | 15 / 35 | 4572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 47 | 47% |
| kawigi.micro.Shiz 1.1 | 23 | 100% |
| mld.DustBunny 3.8 | 20 | 95% |
| kawigi.robot.Girl 1.2 | 16 | 81% |
| cb.nano.Insomnia 1.0 | 15 | 80% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 56 | 47% | 91 |
| kawigi.micro.Shiz 1.1 | 14 | 12% | 36 |
| cb.nano.Insomnia 1.0 | 13 | 11% | 15 |
| kawigi.robot.Girl 1.2 | 12 | 10% | 18 |
| mld.DustBunny 3.8 | 11 | 9% | 28 |
| divineomega.TrialBot 0.003 | 3 | 3% | 12 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 5 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 171353 melee ticks, 42706 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 59 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 56473 sent, 51966 reached their opponent, 8859 virtual hits (17.0% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 210 over 6 battles (35.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.1 | 112 / 210 | 2.07 | 18.7% | 29623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 18.7% | 112 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 52 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.1% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.5% | 29 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 3 |
| bvh.fnr.Fenrir 0.36l | 6.0 | 8.6% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.3 | 8.1% | 6 |
| repositorio.NanoStep 1.0 | 8.8 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.9% | 1 |
| asd.Cthulhu 1.3 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.2 | 21 / 35 | 5104 |
| 2 | 1 | 70.9 | 93.0 | 20 / 35 | 5526 |
| 3 | 1 | 68.8 | 86.3 | 20 / 35 | 4990 |
| 4 | 1 | 69.1 | 89.2 | 20 / 35 | 4843 |
| 5 | 1 | 67.7 | 84.8 | 17 / 35 | 4807 |
| 6 | 1 | 66.4 | 86.0 | 14 / 35 | 4353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 77 | 68% |
| techdude.forest.FlamingForest 1.1 | 40 | 58% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 95% |
| tvv.nano.Polaris 1.2 | 8 | 88% |
| stelo.IntrinsicVolatility 1.4 | 5 | 40% |
| bvh.fnr.Fenrir 0.36l | 4 | 75% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 1138. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 42 | 42% | 89 |
| techdude.forest.FlamingForest 1.1 | 23 | 23% | 45 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 10% | 33 |
| bvh.fnr.Fenrir 0.36l | 8 | 8% | 10 |
| stelo.IntrinsicVolatility 1.4 | 7 | 7% | 13 |
| divineomega.DivineBot 1.9.4.5 | 5 | 5% | 9 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 8 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 180847 melee ticks, 67308 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 47 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 58440 sent, 54085 reached their opponent, 9467 virtual hits (17.5% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 320 over 6 battles (53.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.9 | 96 / 210 | 2.45 | 17.7% | 28940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 17.7% | 96 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.4% | 33 |
| et.Predator 1.8 | 2.8 | 13.3% | 26 |
| cx.BlestPain 1.41 | 3.7 | 12.4% | 37 |
| ahf.NanoAndrew .4 | 5.0 | 11.0% | 7 |
| nic.Nicator 2.4 | 6.2 | 10.0% | 6 |
| maribo.melee.BMV 0.1 | 6.7 | 9.1% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 1 |
| tex.Longbot 0.4 | 8.7 | 5.0% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.9 | 18 / 35 | 4842 |
| 2 | 1 | 67.4 | 82.5 | 15 / 35 | 4913 |
| 3 | 1 | 64.5 | 76.5 | 11 / 35 | 4409 |
| 4 | 1 | 67.9 | 84.8 | 18 / 35 | 4974 |
| 5 | 1 | 68.3 | 87.9 | 17 / 35 | 4784 |
| 6 | 1 | 67.5 | 83.5 | 17 / 35 | 5018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 48 | 75% |
| et.Predator 1.8 | 35 | 69% |
| cx.BlestPain 1.41 | 25 | 40% |
| ahf.NanoAndrew .4 | 12 | 100% |
| nic.Nicator 2.4 | 8 | 88% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 29 | 25% | 42 |
| oog.melee.Mercutio 1.0 | 25 | 22% | 61 |
| et.Predator 1.8 | 23 | 20% | 46 |
| ahf.NanoAndrew .4 | 21 | 18% | 31 |
| nic.Nicator 2.4 | 8 | 7% | 17 |
| maribo.melee.BMV 0.1 | 7 | 6% | 11 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 161491 melee ticks, 43483 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 41 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54888 sent, 50404 reached their opponent, 11651 virtual hits (23.1% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 318 over 6 battles (53.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.8 | 123 / 210 | 2.01 | 18.6% | 26361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 18.6% | 123 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.9% | 35 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.6% | 26 |
| uji.DBH 1.1 | 3.8 | 11.7% | 11 |
| spinnercat.Robovirus 2.718 | 5.8 | 8.6% | 2 |
| ratosh.Nobo 0.21 | 5.8 | 8.6% | 1 |
| sigterm.Sigterm 1.0 | 6.3 | 8.4% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 1 |
| stelo.WangRobot 1.0 | 9.2 | 5.5% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 21 / 35 | 4664 |
| 2 | 1 | 67.6 | 87.6 | 19 / 35 | 4186 |
| 3 | 1 | 65.8 | 84.1 | 16 / 35 | 4099 |
| 4 | 1 | 67.7 | 87.3 | 19 / 35 | 4210 |
| 5 | 1 | 69.4 | 93.0 | 23 / 35 | 4461 |
| 6 | 1 | 69.2 | 91.7 | 25 / 35 | 4741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 66 | 73% |
| agd.Mooserwirt2 2.7 | 35 | 63% |
| uji.DBH 1.1 | 30 | 80% |
| sigterm.Sigterm 1.0 | 13 | 77% |
| spinnercat.Robovirus 2.718 | 6 | 83% |
| ratosh.Nobo 0.21 | 5 | 100% |
| stelo.WangRobot 1.0 | 4 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 30 | 33% | 78 |
| agd.Mooserwirt2 2.7 | 23 | 26% | 44 |
| uji.DBH 1.1 | 14 | 16% | 30 |
| spinnercat.Robovirus 2.718 | 6 | 7% | 15 |
| sigterm.Sigterm 1.0 | 4 | 4% | 13 |
| ratosh.Nobo 0.21 | 3 | 3% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 3% | 6 |
| stelo.WangRobot 1.0 | 2 | 2% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 140825 melee ticks, 49248 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 46 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 47309 sent, 42888 reached their opponent, 9684 virtual hits (22.6% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 197 over 6 battles (32.8 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 97.4 | 190 / 210 | 1.23 | 21.5% | 32712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 21.5% | 190 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.6% | 9 |
| mld.Infinity 2.2 | 3.3 | 12.3% | 7 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.6% | 1 |
| erdnis.Rover 0.3 | 4.5 | 10.6% | 2 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.2% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.6% | 0 |
| pac.ABC 2.1 | 7.7 | 6.7% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 99.0 | 33 / 35 | 5392 |
| 2 | 1 | 71.7 | 94.6 | 30 / 35 | 5397 |
| 3 | 1 | 72.6 | 97.8 | 32 / 35 | 5548 |
| 4 | 1 | 72.7 | 98.4 | 33 / 35 | 5399 |
| 5 | 1 | 73.0 | 98.4 | 33 / 35 | 5672 |
| 6 | 1 | 72.0 | 96.2 | 29 / 35 | 5304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 99 | 95% |
| mld.Infinity 2.2 | 35 | 100% |
| krillr.mini.JointStrike 2.0.0 | 24 | 100% |
| erdnis.Rover 0.3 | 13 | 92% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| pac.ABC 2.1 | 9 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 21 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 12 | 57% | 77 |
| erdnis.Rover 0.3 | 4 | 19% | 25 |
| mld.Infinity 2.2 | 1 | 5% | 23 |
| patson.PatsonTestBot 1.0 | 1 | 5% | 17 |
| mbh.Mbh 0.1 | 1 | 5% | 14 |
| pbg.R2D2 1.0 | 1 | 5% | 6 |
| krillr.mini.JointStrike 2.0.0 | 0 | 0% | 34 |
| pac.ABC 2.1 | 0 | 0% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 135196 melee ticks, 45804 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 63 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45173 sent, 40991 reached their opponent, 10178 virtual hits (24.8% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 321 over 6 battles (53.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.6 | 133 / 210 | 1.76 | 19.9% | 31387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 19.9% | 133 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 43 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.0% | 3 |
| fwb.Nine 1.0.1 | 4.0 | 10.9% | 16 |
| catcat20.Rabbit 0.001 | 4.3 | 10.3% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.8% | 2 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 6.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 6.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.4 | 19 / 35 | 4870 |
| 2 | 1 | 71.2 | 94.9 | 23 / 35 | 5556 |
| 3 | 1 | 69.4 | 89.2 | 24 / 35 | 5155 |
| 4 | 1 | 69.4 | 87.3 | 23 / 35 | 5393 |
| 5 | 1 | 70.6 | 93.0 | 23 / 35 | 5389 |
| 6 | 1 | 69.9 | 93.7 | 21 / 35 | 5024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 84 | 64% |
| fwb.Nine 1.0.1 | 35 | 94% |
| catcat20.Rabbit 0.001 | 23 | 78% |
| nz.jdc.nano.GridFu 1.0 | 15 | 93% |
| m3thos.mini.Eva01 0.5.5 | 6 | 83% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 41 | 52% | 97 |
| fwb.Nine 1.0.1 | 14 | 18% | 28 |
| catcat20.Rabbit 0.001 | 9 | 11% | 29 |
| nz.jdc.nano.GridFu 1.0 | 3 | 4% | 22 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 9 |
| ntc.ControlledChaos 1.1.4 | 3 | 4% | 4 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 170960 melee ticks, 55963 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54674 sent, 50116 reached their opponent, 12101 virtual hits (24.1% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 636 over 6 battles (106.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.8 | 135 / 210 | 1.74 | 19.7% | 30587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 19.7% | 135 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 59 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 2 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 6 |
| eld.Hmm 1.0 | 5.2 | 8.5% | 8 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.2% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.2 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 93.0 | 22 / 35 | 5228 |
| 2 | 1 | 70.0 | 91.4 | 26 / 35 | 4968 |
| 3 | 1 | 69.3 | 90.8 | 19 / 35 | 5073 |
| 4 | 1 | 68.7 | 89.5 | 21 / 35 | 4770 |
| 5 | 1 | 70.9 | 95.2 | 24 / 35 | 5205 |
| 6 | 1 | 70.0 | 90.8 | 23 / 35 | 5343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 106 | 69% |
| cf.RiO.RiOx 4.2.1 | 26 | 88% |
| dummy.mini.Scimitar 1.01 | 25 | 96% |
| eld.Hmm 1.0 | 11 | 55% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| arthord.MannyPacquiao Beta | 2 | 50% |

Hadur died in 81 of 210 rounds, at a mean tick of 1283. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 50 | 62% | 109 |
| cf.RiO.RiOx 4.2.1 | 9 | 11% | 27 |
| dummy.mini.Scimitar 1.01 | 6 | 7% | 36 |
| eld.Hmm 1.0 | 4 | 5% | 20 |
| arthord.MannyPacquiao Beta | 2 | 2% | 5 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 8 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 184289 melee ticks, 81990 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 103 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 55508 sent, 51057 reached their opponent, 9371 virtual hits (18.4% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 216 over 6 battles (36.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.7 | 88 / 210 | 2.20 | 17.5% | 25923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.3 | 17.5% | 88 |
| pe.SandboxDT 2.71m | 1.7 | 16.9% | 73 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.6% | 30 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.3% | 10 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 7 |
| yk.JahRoslav 1.1 | 6.3 | 7.3% | 1 |
| tad.Dalek98 0.98 | 6.8 | 6.7% | 0 |
| gg.Squaraus 0.6 | 8.0 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.9% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 83.8 | 14 / 35 | 4232 |
| 2 | 1 | 67.8 | 87.9 | 16 / 35 | 4357 |
| 3 | 1 | 68.4 | 89.8 | 16 / 35 | 4400 |
| 4 | 2 | 67.6 | 86.0 | 16 / 35 | 4172 |
| 5 | 1 | 68.0 | 87.9 | 16 / 35 | 4522 |
| 6 | 1 | 66.2 | 84.8 | 10 / 35 | 4240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 62 | 47% |
| kvk.HebusLeTroll 0.35 | 39 | 67% |
| jlm.javaDisturbance 0.59 | 27 | 81% |
| bigpete.Stewie 1.0 | 9 | 78% |
| yk.JahRoslav 1.1 | 2 | 50% |
| tad.Dalek98 0.98 | 2 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 60 | 49% | 92 |
| kvk.HebusLeTroll 0.35 | 36 | 29% | 53 |
| jlm.javaDisturbance 0.59 | 14 | 11% | 36 |
| tad.Dalek98 0.98 | 6 | 5% | 9 |
| bigpete.Stewie 1.0 | 3 | 2% | 12 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 161415 melee ticks, 44540 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 52398 sent, 48051 reached their opponent, 8261 virtual hits (17.2% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 709 over 6 battles (118.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.4 | 167 / 210 | 1.50 | 20.6% | 31233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 20.6% | 167 |
| pe.SandboxLump 1.52 | 2.0 | 16.6% | 28 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.8% | 1 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.7% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.1% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 8.4% | 1 |
| sample.Walls 1.0 | 7.8 | 7.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.1 | 27 / 35 | 5100 |
| 2 | 1 | 72.1 | 95.6 | 28 / 35 | 5454 |
| 3 | 1 | 71.5 | 94.0 | 28 / 35 | 5004 |
| 4 | 1 | 70.8 | 92.1 | 26 / 35 | 5109 |
| 5 | 1 | 72.7 | 97.1 | 29 / 35 | 5341 |
| 6 | 1 | 72.0 | 95.9 | 29 / 35 | 5225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 100 | 88% |
| cre.Karolos 0.32 | 43 | 98% |
| stelo.RamTrackSurfer 1.2 | 12 | 67% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 11 | 100% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| cw.megas.Blade 0.8 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 23 | 47% | 105 |
| cre.Karolos 0.32 | 10 | 20% | 45 |
| stelo.RamTrackSurfer 1.2 | 4 | 8% | 21 |
| stelo.AreaTargetingBot 1.1 | 4 | 8% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 9 |
| cw.megas.Blade 0.8 | 1 | 2% | 5 |
| sample.Walls 1.0 | 0 | 0% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 127966 melee ticks, 51029 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 66 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 40670 sent, 36306 reached their opponent, 11655 virtual hits (32.1% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 718 over 6 battles (119.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 79.6 | 67 / 210 | 2.83 | 15.5% | 20092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 15.5% | 67 |
| rz.GlowBlowMelee 1.4 | 2.5 | 13.8% | 42 |
| davidalves.Phoenix 0.54 | 3.0 | 13.1% | 39 |
| florent.XSeries.X2 0.12 | 3.8 | 13.2% | 32 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.9% | 24 |
| oog.melee.Corsair 1.0 | 6.0 | 9.3% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 7.5% | 1 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 0 |
| evd.X1 0.01 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 76.8 | 7 / 35 | 3104 |
| 2 | 1 | 64.8 | 81.9 | 14 / 35 | 3570 |
| 3 | 1 | 65.5 | 83.5 | 14 / 35 | 3540 |
| 4 | 1 | 62.8 | 78.7 | 8 / 35 | 3255 |
| 5 | 1 | 63.4 | 79.0 | 14 / 35 | 3167 |
| 6 | 1 | 63.1 | 77.8 | 10 / 35 | 3456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 39% |
| davidalves.Phoenix 0.54 | 31 | 52% |
| florent.XSeries.X2 0.12 | 20 | 50% |
| pedersen.Ugluk 1.1.1 | 13 | 54% |
| oog.melee.Corsair 1.0 | 9 | 89% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| lunchie.Lunchbox 0.93 | 4 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 37 | 25% | 57 |
| florent.XSeries.X2 0.12 | 35 | 23% | 47 |
| davidalves.Phoenix 0.54 | 30 | 20% | 47 |
| pedersen.Ugluk 1.1.1 | 20 | 13% | 26 |
| oog.melee.Corsair 1.0 | 8 | 5% | 17 |
| stelo.SoJNanoMelee 1.1 | 8 | 5% | 9 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 5 |
| evd.X1 0.01 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 138228 melee ticks, 30934 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 47201 sent, 42477 reached their opponent, 8448 virtual hits (19.9% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 502 over 6 battles (83.7 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 88.0 | 138 / 210 | 2.08 | 18.2% | 21507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 18.2% | 138 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.7% | 24 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.1% | 13 |
| jdw.Hurricane 1.4 | 4.2 | 11.4% | 15 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.5% | 11 |
| ds.Oo 2.2 | 5.5 | 8.9% | 5 |
| awesomeness.Elite 1.0 | 7.5 | 7.2% | 0 |
| gjr.Cephalosporin 0.1 | 7.8 | 6.7% | 2 |
| adt.Ar2 1.1 | 8.5 | 6.5% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 88.3 | 23 / 35 | 3428 |
| 2 | 1 | 68.2 | 89.2 | 24 / 35 | 3749 |
| 3 | 1 | 69.5 | 93.0 | 28 / 35 | 3783 |
| 4 | 1 | 66.9 | 86.3 | 19 / 35 | 3727 |
| 5 | 1 | 66.4 | 85.4 | 21 / 35 | 3419 |
| 6 | 1 | 66.8 | 86.0 | 23 / 35 | 3401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 48 | 90% |
| voidious.micro.BlitzBat 1.05 | 35 | 89% |
| jdw.Hurricane 1.4 | 26 | 77% |
| ds.Oo 2.2 | 20 | 100% |
| awesomeness.Elite 1.0 | 10 | 100% |
| gre.svman4.Morfeas 1.4.1 | 9 | 67% |
| gjr.Cephalosporin 0.1 | 7 | 71% |
| adt.Ar2 1.1 | 4 | 75% |

Hadur died in 76 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 17 | 22% | 53 |
| jdw.Hurricane 1.4 | 17 | 22% | 37 |
| voidious.mini.BrokenSword 2.0.3 | 16 | 21% | 51 |
| adt.Ar2 1.1 | 6 | 8% | 10 |
| ds.Oo 2.2 | 5 | 7% | 21 |
| gre.svman4.Morfeas 1.4.1 | 5 | 7% | 14 |
| awesomeness.Elite 1.0 | 2 | 3% | 11 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 9 |
| amk.ChumbaMini 0.2 | 2 | 3% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 131222 melee ticks, 31742 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46481 sent, 42001 reached their opponent, 7405 virtual hits (17.6% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 455 over 6 battles (75.8 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.8 | 127 / 210 | 2.01 | 19.2% | 32840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 19.2% | 127 |
| ak.Fermat 2.0 | 2.2 | 14.9% | 32 |
| lrem.Spectre 0.4.4 | 3.3 | 12.5% | 15 |
| shu.nitro.LENIN .T34 | 3.7 | 12.4% | 21 |
| js.PinBall 1.6 | 4.8 | 10.6% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.4% | 7 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.0% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 7.1% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.2 | 24 / 35 | 5609 |
| 2 | 1 | 68.2 | 83.5 | 18 / 35 | 5332 |
| 3 | 1 | 69.3 | 87.9 | 20 / 35 | 5335 |
| 4 | 1 | 70.7 | 94.6 | 24 / 35 | 5486 |
| 5 | 1 | 69.1 | 88.3 | 18 / 35 | 5317 |
| 6 | 1 | 70.2 | 88.3 | 23 / 35 | 5761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 56 | 84% |
| lrem.Spectre 0.4.4 | 38 | 82% |
| shu.nitro.LENIN .T34 | 33 | 76% |
| js.PinBall 1.6 | 14 | 86% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 57% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| logiblocs.SittingDroid 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 29 | 34% | 70 |
| lrem.Spectre 0.4.4 | 21 | 24% | 51 |
| shu.nitro.LENIN .T34 | 12 | 14% | 38 |
| js.PinBall 1.6 | 9 | 10% | 24 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 9% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 9 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 157029 melee ticks, 48399 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52186 sent, 47759 reached their opponent, 12732 virtual hits (26.7% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 96). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.6 | 122 / 210 | 2.92 | 17.2% | 26739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.5 | 17.2% | 122 |
| mk.Alpha 0.2.1 | 1.7 | 14.9% | 53 |
| EH.Eagle 1.0.6 | 3.0 | 11.6% | 8 |
| wee.Gem 1.8.4 | 4.3 | 10.2% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.5% | 12 |
| throxbot.ThroxBot 0.1 | 6.3 | 8.8% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.5% | 0 |
| joe.ADinosaur 1.0 | 7.2 | 8.1% | 1 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.5% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.3 | 55.2 | 12 / 35 | 4267 |
| 2 | 1 | 66.7 | 83.8 | 20 / 35 | 4395 |
| 3 | 1 | 71.4 | 96.2 | 30 / 35 | 5146 |
| 4 | 1 | 70.9 | 97.5 | 30 / 35 | 4596 |
| 5 | 3 | 55.4 | 47.9 | 8 / 35 | 4188 |
| 6 | 1 | 68.6 | 91.1 | 22 / 35 | 4147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 83 | 83% |
| EH.Eagle 1.0.6 | 24 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| throxbot.ThroxBot 0.1 | 9 | 89% |
| wee.Gem 1.8.4 | 7 | 86% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 50% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 32 | 36% | 87 |
| cs.Grudge 1.0 | 21 | 23% | 21 |
| wee.Gem 1.8.4 | 7 | 8% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 8% | 16 |
| EH.Eagle 1.0.6 | 6 | 7% | 32 |
| throxbot.ThroxBot 0.1 | 6 | 7% | 13 |
| joe.ADinosaur 1.0 | 5 | 6% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 4% | 12 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 127706 melee ticks, 34030 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 40 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 42240 sent, 37734 reached their opponent, 9914 virtual hits (26.3% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 281 over 6 battles (46.8 per battle, most in one battle 112). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 88.8 | 122 / 210 | 2.01 | 17.9% | 21663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 17.9% | 122 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 40 |
| uji.Antique 1.0 | 3.3 | 12.1% | 24 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.7% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.7% | 7 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.8% | 3 |
| ahr.ice.Ice 1.0.2 | 6.8 | 8.0% | 2 |
| matt.advanced.Katana 1.0 | 8.2 | 6.5% | 2 |
| stelo.PianistNano 1.2 | 9.3 | 5.3% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 89.5 | 22 / 35 | 3601 |
| 2 | 1 | 67.6 | 92.1 | 22 / 35 | 3380 |
| 3 | 1 | 67.1 | 89.2 | 20 / 35 | 3750 |
| 4 | 1 | 67.5 | 91.1 | 17 / 35 | 3790 |
| 5 | 1 | 65.9 | 82.5 | 21 / 35 | 3539 |
| 6 | 1 | 66.9 | 88.3 | 20 / 35 | 3603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 62 | 73% |
| uji.Antique 1.0 | 52 | 85% |
| qohnil.blot.BlotBot 3.61 | 13 | 77% |
| amk.ChumbaWumba 0.3 | 9 | 78% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| matt.advanced.Katana 1.0 | 6 | 83% |
| ahr.ice.Ice 1.0.2 | 5 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 29 | 31% | 58 |
| uji.Antique 1.0 | 23 | 25% | 62 |
| pfvicm.Sobieski 7.2.3b | 15 | 16% | 26 |
| qohnil.blot.BlotBot 3.61 | 11 | 12% | 29 |
| amk.ChumbaWumba 0.3 | 8 | 9% | 13 |
| stelo.PianistNano 1.2 | 2 | 2% | 6 |
| stelo.Lifestealer 1.0 | 2 | 2% | 3 |
| matt.advanced.Katana 1.0 | 1 | 1% | 4 |
| ahr.ice.Ice 1.0.2 | 0 | 0% | 9 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 132092 melee ticks, 35193 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 57 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44771 sent, 40447 reached their opponent, 6381 virtual hits (15.8% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 310 over 6 battles (51.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.6 | 95 / 210 | 2.39 | 17.7% | 25063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 17.7% | 95 |
| deewiant.Anomaly 0.2 | 2.5 | 14.8% | 41 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.5% | 49 |
| myl.micro.Troodon 1.10 | 3.8 | 12.7% | 16 |
| jok.PheonixM 0.1.2 | 4.8 | 11.0% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.4% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.6% | 1 |
| ap.Frederick 1.1 | 9.2 | 4.7% | 2 |
| jangs.ns51 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 17 / 35 | 4273 |
| 2 | 1 | 67.3 | 84.1 | 16 / 35 | 4040 |
| 3 | 1 | 67.6 | 83.2 | 15 / 35 | 4294 |
| 4 | 1 | 66.6 | 81.3 | 15 / 35 | 4075 |
| 5 | 1 | 67.7 | 85.7 | 17 / 35 | 4266 |
| 6 | 1 | 67.4 | 84.1 | 15 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 55 | 69% |
| zyx.mega.YersiniaPestis 3.1 | 37 | 57% |
| myl.micro.Troodon 1.10 | 25 | 80% |
| jok.PheonixM 0.1.2 | 9 | 89% |
| ap.Frederick 1.1 | 5 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 43 | 36% | 86 |
| zyx.mega.YersiniaPestis 3.1 | 35 | 30% | 56 |
| myl.micro.Troodon 1.10 | 17 | 14% | 34 |
| jok.PheonixM 0.1.2 | 11 | 9% | 19 |
| ph.melee.ArcherME 0.3 | 7 | 6% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162396 melee ticks, 48684 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54347 sent, 49840 reached their opponent, 8547 virtual hits (17.1% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 649 over 6 battles (108.2 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 75.7 | 45 / 210 | 3.19 | 14.7% | 21315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.5 | 14.7% | 45 |
| catcat20.Matcha 0.006 | 2.3 | 14.0% | 54 |
| darkcanuck.B26354 1.06 | 2.5 | 13.8% | 48 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.6% | 27 |
| oog.melee.Capulet 1.2 | 4.5 | 12.2% | 21 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.0% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.4% | 6 |
| tripphippy.Alice 1.1 | 8.0 | 7.1% | 3 |
| ntc.Opposite 1.5 | 8.3 | 6.7% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 82.2 | 10 / 35 | 3619 |
| 2 | 1 | 63.1 | 77.5 | 6 / 35 | 3798 |
| 3 | 2 | 61.7 | 74.6 | 7 / 35 | 3308 |
| 4 | 2 | 61.1 | 72.1 | 6 / 35 | 3461 |
| 5 | 2 | 61.2 | 72.1 | 6 / 35 | 3401 |
| 6 | 1 | 63.1 | 75.6 | 10 / 35 | 3728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 41% |
| darkcanuck.B26354 1.06 | 17 | 35% |
| stelo.PastFuture 2.3.2 | 17 | 53% |
| oog.melee.Capulet 1.2 | 12 | 58% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 40% |
| tripphippy.Alice 1.1 | 4 | 75% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 40 | 24% | 54 |
| darkcanuck.B26354 1.06 | 38 | 22% | 46 |
| stelo.PastFuture 2.3.2 | 30 | 18% | 36 |
| oog.melee.Capulet 1.2 | 26 | 15% | 35 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 6% | 12 |
| tripphippy.Alice 1.1 | 7 | 4% | 10 |
| ntc.Opposite 1.5 | 7 | 4% | 7 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 10 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 163318 melee ticks, 26104 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 78 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52763 sent, 48283 reached their opponent, 8368 virtual hits (17.3% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 486 over 6 battles (81.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.6 | 39 / 210 | 3.29 | 14.2% | 18570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 103 |
| hadur2.Hadur 3.17.1ep | 2.2 | 14.2% | 39 |
| gh.mini.Griezel 0.2 | 2.8 | 13.5% | 45 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.8% | 10 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.9% | 9 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 1 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.6% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 8.7 | 5.2% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 78.4 | 10 / 35 | 3195 |
| 2 | 2 | 63.5 | 79.4 | 9 / 35 | 3060 |
| 3 | 2 | 61.4 | 74.3 | 5 / 35 | 2940 |
| 4 | 3 | 58.7 | 68.3 | 2 / 35 | 2798 |
| 5 | 2 | 63.0 | 74.0 | 10 / 35 | 3607 |
| 6 | 2 | 60.2 | 73.0 | 3 / 35 | 2970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 45 | 38% |
| gh.mini.Griezel 0.2 | 26 | 46% |
| spinnercat.micro.Tyger 0.1 | 7 | 57% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| d414.nano.Quantum 1.0.0 | 2 | 50% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 64 | 36% | 76 |
| gh.mini.Griezel 0.2 | 52 | 30% | 66 |
| spinnercat.micro.Tyger 0.1 | 18 | 10% | 22 |
| d414.nano.Quantum 1.0.0 | 13 | 7% | 16 |
| gh.nano.Grofvuil 0.2 | 6 | 3% | 10 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 3% | 7 |
| fm.mammillarias 1.3 | 6 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 151948 melee ticks, 26146 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 38 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 50841 sent, 46087 reached their opponent, 7647 virtual hits (16.6% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 453 over 6 battles (75.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 87.7 | 109 / 210 | 2.11 | 17.4% | 23249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 17.4% | 109 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.7% | 44 |
| apc.botM 3.0 | 3.0 | 12.6% | 27 |
| vjik.UnViolation 1.1 | 4.5 | 10.5% | 11 |
| lxx.ConceptA 0.8 | 4.7 | 10.1% | 5 |
| bayen.UbaMicro 1.4 | 5.7 | 9.0% | 4 |
| panzer.Panzer 0.2 | 7.5 | 7.2% | 1 |
| yk.JahMicro 1.0 | 8.0 | 7.2% | 4 |
| conscience.Electron 1.3g | 8.5 | 6.3% | 2 |
| donjezza.Jezza 1.0 | 10.0 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 88.6 | 15 / 35 | 3918 |
| 2 | 1 | 67.4 | 88.9 | 22 / 35 | 4179 |
| 3 | 1 | 67.0 | 88.6 | 20 / 35 | 3797 |
| 4 | 1 | 64.7 | 83.5 | 17 / 35 | 3553 |
| 5 | 1 | 65.5 | 84.1 | 16 / 35 | 4007 |
| 6 | 1 | 67.3 | 92.4 | 19 / 35 | 3795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 79 | 66% |
| apc.botM 3.0 | 39 | 64% |
| vjik.UnViolation 1.1 | 14 | 79% |
| lxx.ConceptA 0.8 | 9 | 89% |
| yk.JahMicro 1.0 | 6 | 33% |
| panzer.Panzer 0.2 | 5 | 80% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| donjezza.Jezza 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 37 | 36% | 91 |
| apc.botM 3.0 | 21 | 20% | 48 |
| lxx.ConceptA 0.8 | 13 | 13% | 18 |
| bayen.UbaMicro 1.4 | 11 | 11% | 12 |
| vjik.UnViolation 1.1 | 7 | 7% | 22 |
| yk.JahMicro 1.0 | 6 | 6% | 7 |
| conscience.Electron 1.3g | 4 | 4% | 6 |
| panzer.Panzer 0.2 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 127411 melee ticks, 50064 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 40 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 43792 sent, 39418 reached their opponent, 7567 virtual hits (19.2% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 360 over 6 battles (60.0 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.7 | 108 / 210 | 2.20 | 18.3% | 26277 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 18.3% | 108 |
| maribo.Quester 0.3 | 2.0 | 15.5% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 28 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.4% | 21 |
| labg.Cataclysm 2.05 | 5.0 | 10.3% | 9 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.7% | 5 |
| baal.nano.N 1.42 | 6.5 | 8.6% | 1 |
| zyx.micro.Ant 1.1 | 8.2 | 5.6% | 1 |
| sanja.First 0.1 | 9.2 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.2 | 20 / 35 | 4332 |
| 2 | 1 | 70.3 | 90.8 | 23 / 35 | 4724 |
| 3 | 1 | 68.3 | 87.6 | 18 / 35 | 4308 |
| 4 | 1 | 67.0 | 84.4 | 14 / 35 | 4407 |
| 5 | 1 | 68.2 | 89.5 | 17 / 35 | 4428 |
| 6 | 1 | 65.9 | 78.7 | 16 / 35 | 4078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 51 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 64% |
| gre.svman4.Leonidas 1.3.2 | 23 | 74% |
| labg.Cataclysm 2.05 | 16 | 81% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 60% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 41 | 39% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 22% | 55 |
| gre.svman4.Leonidas 1.3.2 | 19 | 18% | 32 |
| labg.Cataclysm 2.05 | 8 | 8% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 8% | 18 |
| baal.nano.N 1.42 | 4 | 4% | 8 |
| sanja.First 0.1 | 0 | 0% | 3 |
| zyx.micro.Ant 1.1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 174678 melee ticks, 50259 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 56 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 56489 sent, 52088 reached their opponent, 8210 virtual hits (15.8% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 499 over 6 battles (83.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.2 | 69 / 210 | 2.42 | 16.7% | 25396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.7 | 17.0% | 75 |
| hadur2.Hadur 3.17.1ep | 1.8 | 16.7% | 69 |
| kid.Gladiator .7.2 | 2.5 | 16.2% | 39 |
| jcs.Seth 1.8 | 4.3 | 11.7% | 19 |
| tcf.Reach 3 | 4.8 | 10.8% | 7 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 80.0 | 9 / 35 | 3999 |
| 2 | 3 | 66.4 | 84.4 | 9 / 35 | 4175 |
| 3 | 1 | 67.4 | 86.0 | 12 / 35 | 4399 |
| 4 | 1 | 67.3 | 86.0 | 13 / 35 | 4253 |
| 5 | 2 | 66.3 | 83.5 | 12 / 35 | 4028 |
| 6 | 1 | 67.8 | 85.4 | 14 / 35 | 4542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 66 | 47% |
| kid.Gladiator .7.2 | 35 | 57% |
| jcs.Seth 1.8 | 19 | 47% |
| tcf.Reach 3 | 9 | 78% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 146 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 61 | 42% | 90 |
| kid.Gladiator .7.2 | 40 | 27% | 57 |
| jcs.Seth 1.8 | 22 | 15% | 31 |
| tcf.Reach 3 | 12 | 8% | 21 |
| cli.Dancer 1.1 | 5 | 3% | 9 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 177362 melee ticks, 44697 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 40 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 55555 sent, 51037 reached their opponent, 8914 virtual hits (17.5% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 713 over 6 battles (118.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 79.2 | 27 / 210 | 2.88 | 14.6% | 19024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 148 |
| hadur2.Hadur 3.17.1ep | 2.2 | 14.6% | 27 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.5% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.3% | 6 |
| rz.HawkOnFire 0.1 | 4.5 | 11.9% | 2 |
| wit.Chuliath 1.0 | 6.0 | 7.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 81.0 | 3 / 35 | 3219 |
| 2 | 2 | 63.6 | 81.9 | 6 / 35 | 3135 |
| 3 | 3 | 61.9 | 77.1 | 4 / 35 | 2955 |
| 4 | 2 | 61.4 | 75.9 | 3 / 35 | 3014 |
| 5 | 2 | 62.2 | 76.2 | 4 / 35 | 3133 |
| 6 | 2 | 65.0 | 82.9 | 7 / 35 | 3568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 72 | 13% |
| gh.mini.Gruwel 0.9 | 18 | 39% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 86% |
| rz.HawkOnFire 0.1 | 5 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 96 | 51% | 109 |
| gh.mini.Gruwel 0.9 | 34 | 18% | 42 |
| dmh.robocode.robot.BlackDeath 9.2 | 27 | 14% | 30 |
| rz.HawkOnFire 0.1 | 22 | 12% | 24 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 145301 melee ticks, 38738 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 25 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46370 sent, 41796 reached their opponent, 6883 virtual hits (16.5% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 6 battles (19.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.3 | 135 / 210 | 1.96 | 19.3% | 28829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 19.3% | 135 |
| alpha.RainingFire 1.0 | 2.5 | 12.9% | 22 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 19 |
| mz.Cork 0.1 | 3.7 | 11.6% | 13 |
| bvh.micro.Freya 0.3 | 5.2 | 10.2% | 9 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.5% | 1 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.1% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.8% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 5.6% | 2 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.7 | 25 / 35 | 5092 |
| 2 | 1 | 70.5 | 93.3 | 25 / 35 | 4981 |
| 3 | 1 | 68.8 | 89.5 | 19 / 35 | 4853 |
| 4 | 1 | 68.3 | 86.7 | 24 / 35 | 4305 |
| 5 | 1 | 68.6 | 85.7 | 22 / 35 | 4922 |
| 6 | 1 | 68.9 | 88.9 | 20 / 35 | 4676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 43 | 81% |
| bzdp.Pansy 2.1 | 34 | 79% |
| alpha.RainingFire 1.0 | 31 | 68% |
| bvh.micro.Freya 0.3 | 26 | 88% |
| m3thos.Eva02 0.7.1 | 15 | 73% |
| bvh.mini.Fenrir 0.39 | 13 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 23 | 30% | 48 |
| bzdp.Pansy 2.1 | 14 | 18% | 46 |
| mz.Cork 0.1 | 11 | 14% | 44 |
| bvh.micro.Freya 0.3 | 9 | 12% | 25 |
| m3thos.Eva02 0.7.1 | 9 | 12% | 20 |
| bvh.mini.Fenrir 0.39 | 6 | 8% | 15 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 7 |
| dl.BetterWalls 1.0 | 1 | 1% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 144453 melee ticks, 39818 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49948 sent, 45622 reached their opponent, 10103 virtual hits (22.1% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 217 over 6 battles (36.2 per battle, most in one battle 114). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.8 | 154 / 210 | 2.28 | 18.2% | 29422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 18.2% | 154 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.6% | 10 |
| germ.TheMind .2 | 3.2 | 10.4% | 10 |
| agrach.Dalek 1.0 | 4.8 | 9.6% | 11 |
| EBBU.Sim2 1.02 | 5.5 | 9.6% | 3 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.3% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 6.2 | 8.9% | 4 |
| lmk.ACPFinal 0.1 | 7.3 | 8.7% | 2 |
| mb.Beast 0.1 | 8.7 | 8.0% | 3 |
| skm.Ryubot 1.0 | 10.0 | 6.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 92.1 | 30 / 35 | 5105 |
| 2 | 1 | 67.6 | 89.5 | 25 / 35 | 4988 |
| 3 | 1 | 67.0 | 86.3 | 26 / 35 | 4886 |
| 4 | 1 | 65.7 | 81.0 | 25 / 35 | 4829 |
| 5 | 1 | 66.1 | 82.9 | 25 / 35 | 4930 |
| 6 | 1 | 65.6 | 82.9 | 23 / 35 | 4684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 32 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 96% |
| germ.TheMind .2 | 25 | 96% |
| mb.Beast 0.1 | 20 | 100% |
| EBBU.Sim2 1.02 | 18 | 100% |
| stelo.UntouchableNano 1.3 | 18 | 83% |
| lmk.ACPFinal 0.1 | 17 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |
| skm.Ryubot 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 363. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 35% | 25 |
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 19% | 42 |
| germ.TheMind .2 | 6 | 11% | 19 |
| agrach.Dalek 1.0 | 5 | 9% | 39 |
| stelo.UntouchableNano 1.3 | 5 | 9% | 22 |
| lmk.ACPFinal 0.1 | 5 | 9% | 21 |
| EBBU.Sim2 1.02 | 3 | 5% | 18 |
| mb.Beast 0.1 | 1 | 2% | 20 |
| skm.Ryubot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 95137 melee ticks, 22709 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 39 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 32569 sent, 28437 reached their opponent, 9026 virtual hits (31.7% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 746 over 6 battles (124.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.3 | 93 / 210 | 2.50 | 16.8% | 23716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.2 | 16.8% | 93 |
| justin.Mallais 14.0 | 1.8 | 15.4% | 54 |
| bvh.mini.Freya 0.55 | 3.2 | 12.8% | 15 |
| bts.mega.Gnarly 1.4 | 4.0 | 12.1% | 31 |
| cs.Wren 1.0 | 4.8 | 11.2% | 6 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.0% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.7 | 8.8% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.1% | 3 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 86.0 | 13 / 35 | 4263 |
| 2 | 1 | 64.1 | 78.1 | 16 / 35 | 3669 |
| 3 | 2 | 65.4 | 81.6 | 10 / 35 | 4189 |
| 4 | 1 | 65.7 | 80.6 | 16 / 35 | 3897 |
| 5 | 1 | 67.1 | 88.3 | 19 / 35 | 3881 |
| 6 | 1 | 66.5 | 85.4 | 19 / 35 | 3817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 51 | 69% |
| bts.mega.Gnarly 1.4 | 30 | 60% |
| bvh.mini.Freya 0.55 | 19 | 84% |
| cs.Wren 1.0 | 14 | 93% |
| kdf.KoulDestroyer 1.0 | 7 | 86% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |

Hadur died in 123 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 42 | 34% | 79 |
| bts.mega.Gnarly 1.4 | 24 | 20% | 38 |
| bvh.mini.Freya 0.55 | 15 | 12% | 25 |
| cs.Wren 1.0 | 14 | 11% | 31 |
| kdf.KoulDestroyer 1.0 | 11 | 9% | 18 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 2% | 10 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 3 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 141419 melee ticks, 28797 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47090 sent, 42410 reached their opponent, 9669 virtual hits (22.8% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 718 over 6 battles (119.7 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 85.3 | 83 / 210 | 2.32 | 17.3% | 26435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 17.3% | 83 |
| bvh.fry.Freya 0.82 | 2.0 | 15.4% | 25 |
| az.Ololobot 0.2.4 | 3.2 | 13.1% | 61 |
| catcat20.Lambda 0.024 | 3.8 | 11.9% | 34 |
| stelo.SoRobotNanoMelee 1.2 | 6.2 | 8.1% | 4 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.1% | 0 |
| gimp.GimpBot 0.1 | 6.5 | 7.8% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.7% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 84.8 | 11 / 35 | 4292 |
| 2 | 1 | 66.2 | 85.1 | 16 / 35 | 4570 |
| 3 | 1 | 66.2 | 83.8 | 16 / 35 | 4169 |
| 4 | 1 | 66.7 | 88.9 | 11 / 35 | 4410 |
| 5 | 1 | 67.9 | 87.6 | 17 / 35 | 4787 |
| 6 | 1 | 65.0 | 81.6 | 12 / 35 | 4207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 48 | 71% |
| az.Ololobot 0.2.4 | 44 | 39% |
| catcat20.Lambda 0.024 | 38 | 53% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |
| gimp.GimpBot 0.1 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 51 | 38% | 75 |
| bvh.fry.Freya 0.82 | 36 | 27% | 61 |
| catcat20.Lambda 0.024 | 24 | 18% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 4% | 11 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 7 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 8 |
| gimp.GimpBot 0.1 | 2 | 2% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 167501 melee ticks, 51591 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 63 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52910 sent, 48488 reached their opponent, 9409 virtual hits (19.4% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 420 over 6 battles (70.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.0 | 122 / 210 | 2.17 | 18.4% | 26299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 18.4% | 122 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.5% | 37 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.8% | 20 |
| mz.AntiGrav 1.0 | 3.8 | 11.6% | 16 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.6% | 5 |
| stelo.Randomness 1.0 | 6.5 | 8.3% | 5 |
| alpha.BlackIce 1.0 | 6.5 | 8.7% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 4.2% | 0 |
| sample.Corners 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.0 | 17 / 35 | 4452 |
| 2 | 1 | 67.7 | 85.1 | 17 / 35 | 4222 |
| 3 | 1 | 69.3 | 89.8 | 24 / 35 | 4370 |
| 4 | 1 | 69.0 | 87.9 | 23 / 35 | 4666 |
| 5 | 1 | 69.0 | 88.6 | 18 / 35 | 4647 |
| 6 | 1 | 66.9 | 83.5 | 23 / 35 | 3942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 87% |
| kano.gamma.KanoGamma 1.8 | 44 | 86% |
| mz.AntiGrav 1.0 | 17 | 88% |
| Polkwane.SmashMelee 1.0 | 14 | 86% |
| alpha.BlackIce 1.0 | 4 | 75% |
| stelo.Randomness 1.0 | 4 | 50% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 29 | 32% | 61 |
| mz.AntiGrav 1.0 | 14 | 15% | 28 |
| kano.gamma.KanoGamma 1.8 | 13 | 14% | 59 |
| Polkwane.SmashMelee 1.0 | 13 | 14% | 21 |
| stelo.Randomness 1.0 | 7 | 8% | 15 |
| alpha.BlackIce 1.0 | 6 | 7% | 14 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 9 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 152917 melee ticks, 38627 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 81 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51777 sent, 47119 reached their opponent, 10183 virtual hits (21.6% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 281 over 6 battles (46.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.9 | 92 / 210 | 2.36 | 16.9% | 22312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 17.0% | 84 |
| hadur2.Hadur 3.17.1ep | 1.7 | 16.9% | 92 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 13.2% | 17 |
| ary.Swarm 1.1 | 3.8 | 12.2% | 9 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.9% | 6 |
| shrub.Silver v048 | 6.2 | 8.8% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.7% | 2 |
| jsal.Jsalbot 1.0 | 8.5 | 5.4% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 89.5 | 19 / 35 | 3845 |
| 2 | 1 | 67.6 | 87.9 | 18 / 35 | 3846 |
| 3 | 2 | 64.9 | 81.6 | 14 / 35 | 3390 |
| 4 | 2 | 66.5 | 85.1 | 13 / 35 | 3990 |
| 5 | 2 | 66.2 | 84.8 | 15 / 35 | 3574 |
| 6 | 2 | 65.8 | 80.6 | 13 / 35 | 3667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 73 | 47% |
| lessonz.robocode.Oz 0.5.0 | 23 | 83% |
| ary.Swarm 1.1 | 19 | 84% |
| simonton.nano.MeleeSeed 1.8 | 18 | 100% |
| stelo.Mirror 1.1 | 3 | 67% |
| shrub.Silver v048 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 48% | 94 |
| lessonz.robocode.Oz 0.5.0 | 19 | 16% | 30 |
| ary.Swarm 1.1 | 18 | 15% | 31 |
| simonton.nano.MeleeSeed 1.8 | 10 | 8% | 29 |
| shrub.Silver v048 | 6 | 5% | 15 |
| zyx.nano.Ant 1.1 | 4 | 3% | 6 |
| stelo.Mirror 1.1 | 2 | 2% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 157711 melee ticks, 43792 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 47 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52180 sent, 47545 reached their opponent, 7844 virtual hits (16.5% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 304 over 6 battles (50.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.7 | 129 / 210 | 1.93 | 19.1% | 30249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 19.1% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 15.7% | 45 |
| ara.Shera 0.88 | 3.3 | 13.1% | 20 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 12.8% | 10 |
| amz.NanoClone 1.41 | 5.0 | 9.2% | 3 |
| dsw.StaticD 1.0 | 7.2 | 6.4% | 3 |
| maribo.IotaCT 1.1 | 7.3 | 6.5% | 0 |
| mme.NikeEnhanced 2.0 | 7.5 | 6.1% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.1 | 22 / 35 | 5113 |
| 2 | 1 | 70.1 | 92.4 | 24 / 35 | 5141 |
| 3 | 1 | 68.2 | 87.9 | 21 / 35 | 4750 |
| 4 | 1 | 69.0 | 89.2 | 21 / 35 | 4936 |
| 5 | 1 | 68.4 | 87.0 | 20 / 35 | 5085 |
| 6 | 1 | 69.5 | 90.5 | 21 / 35 | 5224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 79 | 86% |
| ara.Shera 0.88 | 41 | 68% |
| maribo.mini.MiniQuester 0.1 | 24 | 100% |
| dsw.StaticD 1.0 | 5 | 100% |
| maribo.IotaCT 1.1 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 33 | 40% | 64 |
| wompi.Wallaby 5.1 | 30 | 36% | 88 |
| maribo.mini.MiniQuester 0.1 | 6 | 7% | 35 |
| amz.NanoClone 1.41 | 5 | 6% | 6 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 4 |
| dsw.StaticD 1.0 | 2 | 2% | 9 |
| maribo.IotaCT 1.1 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 164913 melee ticks, 47433 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52775 sent, 48357 reached their opponent, 10181 virtual hits (21.1% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 680 over 6 battles (113.3 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 76.6 | 29 / 210 | 3.11 | 14.4% | 19888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 141 |
| hadur2.Hadur 3.17.1ep | 2.3 | 14.4% | 29 |
| brainfade.melee.Dusk 0.44 | 2.7 | 13.2% | 26 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.4% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.8% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.2% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.9% | 0 |
| mz.NanoGod 2.02 | 7.7 | 8.0% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 76.2 | 4 / 35 | 3276 |
| 2 | 2 | 63.8 | 77.5 | 4 / 35 | 3384 |
| 3 | 3 | 60.2 | 67.6 | 2 / 35 | 2896 |
| 4 | 2 | 64.1 | 79.0 | 5 / 35 | 3233 |
| 5 | 2 | 64.3 | 79.7 | 6 / 35 | 3329 |
| 6 | 2 | 65.4 | 79.4 | 8 / 35 | 3770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 70 | 21% |
| brainfade.melee.Dusk 0.44 | 15 | 27% |
| dummy.micro.Sparrow 2.5 | 3 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| mz.NanoGod 2.02 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| jab.DiamondStealer 5 | 2 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 99 | 53% | 112 |
| brainfade.melee.Dusk 0.44 | 35 | 19% | 39 |
| dummy.micro.Sparrow 2.5 | 15 | 8% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 15 |
| mz.NanoGod 2.02 | 10 | 5% | 11 |
| Krabb.akim2.Akim2 1.1b | 7 | 4% | 10 |
| jab.DiamondStealer 5 | 3 | 2% | 4 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 155115 melee ticks, 41639 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 33 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50339 sent, 45784 reached their opponent, 8034 virtual hits (17.5% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 644 over 6 battles (107.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.4 | 119 / 210 | 2.04 | 19.1% | 30194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.2 | 19.1% | 119 |
| stelo.Liblix 0.3.1 | 2.0 | 16.1% | 62 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.3% | 21 |
| jwirde.Gort 2.0 | 4.7 | 9.8% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 9.5% | 2 |
| wompi.Quokka 1.6 | 6.0 | 8.1% | 1 |
| disan.Chair 2.2.0 | 6.7 | 7.6% | 0 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.2% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 82.2 | 13 / 35 | 4672 |
| 2 | 1 | 69.3 | 89.5 | 21 / 35 | 4965 |
| 3 | 1 | 69.6 | 88.6 | 20 / 35 | 5290 |
| 4 | 1 | 68.6 | 86.0 | 18 / 35 | 4965 |
| 5 | 1 | 70.7 | 92.4 | 26 / 35 | 5217 |
| 6 | 1 | 69.9 | 91.7 | 21 / 35 | 5085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 80 | 58% |
| tzu.TheArtOfWar 1.2 | 52 | 87% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| disan.Chair 2.2.0 | 8 | 100% |
| jwirde.Gort 2.0 | 7 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 54 | 56% | 108 |
| tzu.TheArtOfWar 1.2 | 19 | 20% | 53 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 5% | 14 |
| wompi.Quokka 1.6 | 5 | 5% | 7 |
| jwirde.Gort 2.0 | 4 | 4% | 14 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 2 |
| disan.Chair 2.2.0 | 1 | 1% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 159577 melee ticks, 41100 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 39 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54869 sent, 50408 reached their opponent, 11328 virtual hits (22.5% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 720 over 6 battles (120.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.7 | 84 / 210 | 2.20 | 18.5% | 29227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1ep | 1.0 | 18.5% | 84 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.8% | 93 |
| jje.BagPuss 1.2 | 2.7 | 12.3% | 12 |
| sul.Lunar 1.1 | 4.5 | 10.8% | 11 |
| myl.nano.Graviton 1.10 | 4.5 | 10.8% | 5 |
| fm.claire 1.7 | 6.5 | 8.6% | 0 |
| hvilela.HVilela 0.9 | 7.2 | 8.3% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.1% | 2 |
| wit.Deep7 2.0 | 9.0 | 5.6% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.3 | 14 / 35 | 4693 |
| 2 | 1 | 68.2 | 87.0 | 14 / 35 | 5126 |
| 3 | 1 | 66.9 | 84.4 | 12 / 35 | 4612 |
| 4 | 1 | 69.1 | 89.2 | 20 / 35 | 4984 |
| 5 | 1 | 66.2 | 83.5 | 12 / 35 | 4291 |
| 6 | 1 | 68.8 | 88.9 | 12 / 35 | 5521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 84 | 42% |
| sul.Lunar 1.1 | 22 | 77% |
| jje.BagPuss 1.2 | 13 | 77% |
| myl.nano.Graviton 1.10 | 10 | 80% |
| wit.Deep7 2.0 | 6 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| fm.claire 1.7 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 1509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 52 | 39% | 0 |
| jje.BagPuss 1.2 | 23 | 17% | 65 |
| sul.Lunar 1.1 | 20 | 15% | 50 |
| myl.nano.Graviton 1.10 | 15 | 11% | 43 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 19 |
| fm.claire 1.7 | 5 | 4% | 13 |
| wit.Deep7 2.0 | 3 | 2% | 10 |
| hvilela.HVilela 0.9 | 2 | 2% | 6 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 203217 melee ticks, 98636 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 56 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 63094 sent, 58569 reached their opponent, 9108 virtual hits (15.6% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1ep against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 722 over 6 battles (120.3 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 81.0 | 48 / 210 | 2.71 | 15.4% | 22552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.8% | 63 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.6% | 77 |
| hadur2.Hadur 3.17.1ep | 2.5 | 15.4% | 48 |
| cx.Princess 1.0 | 4.8 | 10.5% | 12 |
| mz.MicroSheep 1.0 | 4.8 | 10.4% | 7 |
| sadoner.killer 0.2 | 5.3 | 9.8% | 3 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.7% | 0 |
| kurios.DOSexe .9a | 8.7 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 73.7 | 4 / 35 | 3558 |
| 2 | 2 | 65.0 | 82.2 | 11 / 35 | 3660 |
| 3 | 3 | 64.6 | 81.9 | 8 / 35 | 3581 |
| 4 | 3 | 63.2 | 79.0 | 3 / 35 | 3710 |
| 5 | 2 | 66.9 | 86.7 | 11 / 35 | 4263 |
| 6 | 2 | 64.5 | 82.5 | 11 / 35 | 3780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 51% |
| rsalesc.melee.Medina 0.4.5 | 32 | 19% |
| mz.MicroSheep 1.0 | 7 | 71% |
| cx.Princess 1.0 | 6 | 50% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| sadoner.killer 0.2 | 2 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 38% | 95 |
| rsalesc.melee.Medina 0.4.5 | 61 | 36% | 66 |
| sadoner.killer 0.2 | 12 | 7% | 15 |
| mz.MicroSheep 1.0 | 10 | 6% | 14 |
| cx.Princess 1.0 | 9 | 5% | 12 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 7 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 154124 melee ticks, 40194 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 59 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45009 sent, 40429 reached their opponent, 6529 virtual hits (16.1% of those reached).

