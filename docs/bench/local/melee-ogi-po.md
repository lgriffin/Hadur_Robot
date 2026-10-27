# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 660 over 8 battles (82.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.0 | 59 / 280 | 2.26 | 17.1% | 40110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 191 |
| hadur2.Hadur 3.17.1po | 2.0 | 17.1% | 59 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.4 | 11.2% | 6 |
| sgp.JollyNinja 3.53 | 4.1 | 11.2% | 18 |
| mz.MicroGodMelee 1 | 5.1 | 10.0% | 6 |
| lorneswork.Predator 1.0 | 5.4 | 10.1% | 1 |
| adt.Ar2 1.0 | 7.1 | 7.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.1% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 86.7 | 5 / 35 | 5248 |
| 2 | 2 | 66.5 | 84.1 | 8 / 35 | 5033 |
| 3 | 2 | 66.2 | 84.4 | 8 / 35 | 4621 |
| 4 | 2 | 67.0 | 85.7 | 9 / 35 | 5009 |
| 5 | 2 | 66.0 | 85.4 | 3 / 35 | 4771 |
| 6 | 2 | 69.0 | 91.4 | 14 / 35 | 5346 |
| 7 | 2 | 66.5 | 83.2 | 6 / 35 | 5089 |
| 8 | 2 | 66.8 | 87.3 | 6 / 35 | 4993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 169 | 11% |
| sgp.JollyNinja 3.53 | 25 | 60% |
| mz.MicroGodMelee 1 | 15 | 73% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 78% |
| lorneswork.Predator 1.0 | 7 | 86% |
| adt.Ar2 1.0 | 2 | 100% |

Hadur died in 227 of 280 rounds, at a mean tick of 1150. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 161 | 71% | 188 |
| sgp.JollyNinja 3.53 | 25 | 11% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 7% | 19 |
| mz.MicroGodMelee 1 | 9 | 4% | 21 |
| lorneswork.Predator 1.0 | 9 | 4% | 15 |
| adt.Ar2 1.0 | 1 | 0% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 186758 melee ticks, 121762 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 48 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 60800 sent, 54167 reached their opponent, 10863 virtual hits (20.1% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 538 over 8 battles (67.3 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.4 | 128 / 280 | 2.32 | 18.1% | 38506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.1% | 128 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.7% | 54 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.2% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.9% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 9.8% | 13 |
| Noran.BitchingElk 0.054 | 6.4 | 8.6% | 22 |
| sch.Simone 0.3d | 7.1 | 8.1% | 13 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.9% | 4 |
| stelo.PatternRobot 1.0 | 8.9 | 5.8% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.1 | 17 / 35 | 4542 |
| 2 | 1 | 66.2 | 81.0 | 12 / 35 | 4928 |
| 3 | 1 | 68.7 | 88.9 | 19 / 35 | 4931 |
| 4 | 1 | 68.2 | 88.3 | 14 / 35 | 4949 |
| 5 | 1 | 64.6 | 79.0 | 11 / 35 | 4322 |
| 6 | 1 | 68.5 | 86.0 | 20 / 35 | 5018 |
| 7 | 1 | 68.5 | 86.7 | 19 / 35 | 5150 |
| 8 | 1 | 68.0 | 87.9 | 16 / 35 | 4666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 59 | 68% |
| pulsar.PulsarMax 0.8.9 | 59 | 56% |
| com.cohesiva.robocode.ManOwaR 1.0 | 27 | 63% |
| Noran.BitchingElk 0.054 | 24 | 42% |
| sch.Simone 0.3d | 15 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 80% |
| fnc.bandit.Bandit 5.2.0 | 7 | 57% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| stelo.PatternRobot 1.0 | 2 | 100% |

Hadur died in 155 of 280 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 28% | 75 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 32 | 21% | 74 |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 12% | 38 |
| Noran.BitchingElk 0.054 | 16 | 10% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 9% | 21 |
| stelo.PatternRobot 1.0 | 12 | 8% | 15 |
| sch.Simone 0.3d | 10 | 6% | 19 |
| fnc.bandit.Bandit 5.2.0 | 5 | 3% | 12 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 224952 melee ticks, 61670 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 47 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 0.

Targeting waves (270 rounds): 80198 sent, 73817 reached their opponent, 12734 virtual hits (17.3% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 8 battles (17.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.7 | 206 / 280 | 1.74 | 20.2% | 49137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.2% | 206 |
| radnor.DoctorBob 1.42 | 2.1 | 14.3% | 26 |
| kawigi.nano.Lib 1.0 | 3.3 | 13.0% | 21 |
| vuen.Cake 2.51 | 3.6 | 12.6% | 26 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 1 |
| adt.Ar1 2.1 | 6.1 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 7.0% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.4 | 5.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.3 | 24 / 35 | 6231 |
| 2 | 1 | 70.3 | 89.5 | 26 / 35 | 6096 |
| 3 | 1 | 68.9 | 87.6 | 22 / 35 | 5819 |
| 4 | 1 | 69.0 | 87.9 | 24 / 35 | 5707 |
| 5 | 1 | 70.2 | 90.5 | 23 / 35 | 6248 |
| 6 | 1 | 70.9 | 93.7 | 28 / 35 | 6034 |
| 7 | 1 | 71.0 | 94.6 | 28 / 35 | 5976 |
| 8 | 1 | 72.4 | 96.8 | 31 / 35 | 7026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 89 | 84% |
| radnor.DoctorBob 1.42 | 76 | 96% |
| kawigi.nano.Lib 1.0 | 53 | 92% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 74 of 280 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 35% | 94 |
| vuen.Cake 2.51 | 17 | 23% | 95 |
| kawigi.nano.Lib 1.0 | 16 | 22% | 53 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 11% | 9 |
| urdos.URDOS 1.3 | 6 | 8% | 12 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |
| adt.Ar1 2.1 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 272 rounds): 175392 melee ticks, 56068 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 71 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 1.

Targeting waves (272 rounds): 53704 sent, 47350 reached their opponent, 12379 virtual hits (26.1% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 602 over 8 battles (75.3 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.0 | 37 / 280 | 2.26 | 17.3% | 42901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.6% | 216 |
| hadur2.Hadur 3.17.1po | 2.0 | 17.3% | 37 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 16 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 9 |
| josago.Jorgito 0.16 | 5.0 | 8.7% | 2 |
| css.Delitioner 0.11 | 6.5 | 6.6% | 0 |
| tj.zombie1n 1.0.1 | 6.6 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.4 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 86.3 | 7 / 35 | 5531 |
| 2 | 2 | 68.3 | 87.0 | 6 / 35 | 5422 |
| 3 | 2 | 67.1 | 84.8 | 0 / 35 | 5157 |
| 4 | 2 | 66.6 | 82.2 | 2 / 35 | 4952 |
| 5 | 2 | 68.5 | 87.3 | 5 / 35 | 5662 |
| 6 | 2 | 68.5 | 88.9 | 7 / 35 | 5147 |
| 7 | 2 | 68.0 | 85.7 | 7 / 35 | 5423 |
| 8 | 2 | 68.0 | 86.0 | 3 / 35 | 5607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 180 | 9% |
| apc.LeeroyJenkins2 1.0 | 14 | 64% |
| TNT.TNT 0.99.1 | 14 | 64% |
| css.Delitioner 0.11 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 248 of 280 rounds, at a mean tick of 1325. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 188 | 76% | 205 |
| apc.LeeroyJenkins2 1.0 | 29 | 12% | 39 |
| TNT.TNT 0.99.1 | 14 | 6% | 22 |
| josago.Jorgito 0.16 | 7 | 3% | 8 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 1 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 267773 melee ticks, 96745 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 45 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 0.

Targeting waves (273 rounds): 82869 sent, 76273 reached their opponent, 11590 virtual hits (15.2% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 415 over 8 battles (51.9 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 76.9 | 31 / 280 | 3.08 | 14.5% | 28953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.4 | 18.7% | 155 |
| justin.DemonicRage 3.4 | 1.8 | 17.0% | 73 |
| hadur2.Hadur 3.17.1po | 2.9 | 14.5% | 31 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 10 |
| ms.Ares 0.19 | 5.3 | 9.1% | 1 |
| axeBots.HataMoto 3.09 | 5.8 | 9.0% | 9 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.6 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.4 | 4.2% | 1 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 72.7 | 0 / 35 | 3356 |
| 2 | 3 | 64.0 | 79.4 | 5 / 35 | 3615 |
| 3 | 3 | 63.0 | 77.8 | 4 / 35 | 3443 |
| 4 | 3 | 64.5 | 77.1 | 7 / 35 | 3907 |
| 5 | 2 | 63.8 | 77.8 | 5 / 35 | 3803 |
| 6 | 3 | 65.0 | 83.2 | 5 / 35 | 3947 |
| 7 | 3 | 62.8 | 74.6 | 3 / 35 | 3588 |
| 8 | 3 | 61.2 | 72.4 | 2 / 35 | 3294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 42 | 12% |
| justin.DemonicRage 3.4 | 41 | 20% |
| wompi.Numbat 2.1 | 17 | 76% |
| axeBots.HataMoto 3.09 | 6 | 67% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 252 of 280 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 100 | 40% | 109 |
| justin.DemonicRage 3.4 | 80 | 32% | 87 |
| wompi.Numbat 2.1 | 40 | 16% | 50 |
| ms.Ares 0.19 | 12 | 5% | 15 |
| axeBots.HataMoto 3.09 | 11 | 4% | 13 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 0% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 212275 melee ticks, 38703 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 64 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 66540 sent, 59714 reached their opponent, 9821 virtual hits (16.4% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 479 over 8 battles (59.9 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.4 | 168 / 280 | 1.95 | 19.3% | 41168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.3% | 168 |
| jekl.StoneGhost 0.7 | 2.0 | 14.9% | 29 |
| origin.SleepSiphon 1.7b | 3.3 | 13.1% | 49 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 11.9% | 22 |
| mld.Wisdom 1.0 | 4.9 | 10.3% | 0 |
| gg.Wolverine 2.0 | 6.1 | 8.7% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.9 | 6.5% | 7 |
| spinnercat.Omen 1.0 | 8.0 | 6.3% | 1 |
| DBall.NUKE 0.1 | 8.0 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.1 | 18 / 35 | 4948 |
| 2 | 1 | 68.8 | 89.2 | 20 / 35 | 4774 |
| 3 | 1 | 69.6 | 88.9 | 20 / 35 | 5491 |
| 4 | 1 | 68.8 | 88.6 | 18 / 35 | 4840 |
| 5 | 1 | 70.0 | 91.4 | 20 / 35 | 5393 |
| 6 | 1 | 70.4 | 90.2 | 20 / 35 | 5380 |
| 7 | 1 | 71.4 | 94.6 | 28 / 35 | 5312 |
| 8 | 1 | 69.4 | 88.6 | 24 / 35 | 5030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 75 | 95% |
| origin.SleepSiphon 1.7b | 66 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 40 | 80% |
| gg.Wolverine 2.0 | 13 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 56% |
| mld.Wisdom 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 116 of 280 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 38 | 33% | 82 |
| jekl.StoneGhost 0.7 | 30 | 26% | 88 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 16% | 50 |
| mld.Wisdom 1.0 | 9 | 8% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 6% | 14 |
| gg.Wolverine 2.0 | 7 | 6% | 14 |
| spinnercat.Omen 1.0 | 2 | 2% | 4 |
| sample.Fire 1.0 | 1 | 1% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 7 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 198076 melee ticks, 61334 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 39 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 63205 sent, 56759 reached their opponent, 13092 virtual hits (23.1% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 306 over 8 battles (38.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 93.4 | 164 / 280 | 1.60 | 20.8% | 51649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.8% | 164 |
| rsalesc.melee.Monk 0.3.6c | 2.4 | 16.7% | 55 |
| rtk.Tachikoma 1.0 | 2.6 | 16.0% | 34 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.2% | 10 |
| franzor.Lizt 1.3.1 | 4.8 | 11.1% | 19 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.0 | 18 / 35 | 6556 |
| 2 | 1 | 72.4 | 94.3 | 22 / 35 | 6237 |
| 3 | 1 | 72.5 | 93.0 | 19 / 35 | 6644 |
| 4 | 1 | 72.5 | 93.7 | 22 / 35 | 6179 |
| 5 | 1 | 72.8 | 94.9 | 23 / 35 | 6709 |
| 6 | 1 | 72.4 | 93.0 | 21 / 35 | 6358 |
| 7 | 1 | 72.4 | 92.7 | 19 / 35 | 6477 |
| 8 | 1 | 72.4 | 92.4 | 20 / 35 | 6489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 105 | 73% |
| rsalesc.melee.Monk 0.3.6c | 64 | 34% |
| franzor.Lizt 1.3.1 | 45 | 71% |
| oog.melee.CapuletDroid 1.1 | 37 | 86% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 120 of 280 rounds, at a mean tick of 1486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 51 | 43% | 93 |
| rtk.Tachikoma 1.0 | 43 | 36% | 129 |
| franzor.Lizt 1.3.1 | 13 | 11% | 1 |
| oog.melee.CapuletDroid 1.1 | 8 | 7% | 49 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 269 rounds): 249301 melee ticks, 128563 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 41 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 75523 sent, 69276 reached their opponent, 14302 virtual hits (20.6% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 950 over 8 battles (118.8 per battle, most in one battle 258). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.0 | 174 / 280 | 1.90 | 19.3% | 39460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.3% | 174 |
| tm.Yuugao 1.0 | 2.5 | 12.9% | 38 |
| shrub.Vapour v159 | 3.0 | 12.4% | 28 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.8% | 20 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.9% | 13 |
| m3thos.Eva00 1.1 | 6.3 | 8.8% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.0% | 4 |
| qualidafial.MajorDick 1.0.1 | 7.9 | 7.1% | 0 |
| SHAM.WOW 1.4 | 9.3 | 5.6% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.7 | 24 / 35 | 5141 |
| 2 | 1 | 71.1 | 96.5 | 27 / 35 | 5437 |
| 3 | 1 | 66.2 | 83.2 | 16 / 35 | 4468 |
| 4 | 1 | 69.6 | 90.8 | 26 / 35 | 5089 |
| 5 | 1 | 68.3 | 86.3 | 21 / 35 | 4745 |
| 6 | 1 | 69.2 | 89.2 | 20 / 35 | 5056 |
| 7 | 1 | 69.0 | 90.5 | 20 / 35 | 4948 |
| 8 | 1 | 68.6 | 91.4 | 20 / 35 | 4576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 60 | 73% |
| shrub.Vapour v159 | 52 | 71% |
| Krabb.sliNk.Garm 0.9u | 41 | 80% |
| com.spp.robocode.MostlyHarmless 010 | 30 | 90% |
| jwst.DAD.DarkAndDarker 1.1 | 20 | 85% |
| m3thos.Eva00 1.1 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 113 of 280 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 33 | 29% | 86 |
| shrub.Vapour v159 | 22 | 19% | 58 |
| Krabb.sliNk.Garm 0.9u | 18 | 16% | 48 |
| com.spp.robocode.MostlyHarmless 010 | 17 | 15% | 42 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 7% | 21 |
| m3thos.Eva00 1.1 | 5 | 4% | 14 |
| SHAM.WOW 1.4 | 2 | 2% | 5 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 4 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 197589 melee ticks, 58376 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 51 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 65821 sent, 59391 reached their opponent, 11196 virtual hits (18.9% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 667 over 8 battles (83.4 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 72.7 | 52 / 280 | 3.46 | 14.2% | 26501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.6% | 137 |
| hadur2.Hadur 3.17.1po | 2.4 | 14.2% | 52 |
| kc.micro.Figment 1.0 | 2.6 | 14.1% | 43 |
| pedersen.Grishnakh 1.0 | 4.6 | 11.2% | 25 |
| yagami.Tidus 0.11 | 4.9 | 10.7% | 3 |
| mc2.enemy.Original 0.9 | 5.6 | 9.5% | 16 |
| dft.Calliope 5.6 | 6.9 | 8.0% | 3 |
| step.nanoPri 1.0 | 8.1 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 72.1 | 4 / 35 | 3144 |
| 2 | 2 | 61.3 | 72.4 | 9 / 35 | 3218 |
| 3 | 3 | 60.4 | 67.9 | 8 / 35 | 3194 |
| 4 | 3 | 62.5 | 74.3 | 6 / 35 | 3436 |
| 5 | 2 | 62.5 | 77.5 | 7 / 35 | 3099 |
| 6 | 2 | 59.2 | 65.4 | 3 / 35 | 3258 |
| 7 | 2 | 63.8 | 76.5 | 8 / 35 | 3720 |
| 8 | 2 | 62.4 | 75.2 | 7 / 35 | 3432 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 63 | 19% |
| kc.micro.Figment 1.0 | 35 | 69% |
| pedersen.Grishnakh 1.0 | 13 | 38% |
| mc2.enemy.Original 0.9 | 8 | 25% |
| dft.Calliope 5.6 | 7 | 71% |
| yagami.Tidus 0.11 | 6 | 67% |
| rdm.Dueler 0.4x | 1 | 0% |

Hadur died in 233 of 280 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 92 | 39% | 104 |
| kc.micro.Figment 1.0 | 38 | 16% | 64 |
| yagami.Tidus 0.11 | 33 | 14% | 36 |
| mc2.enemy.Original 0.9 | 25 | 11% | 28 |
| pedersen.Grishnakh 1.0 | 19 | 8% | 23 |
| robar.nano.Assertive_Melee 0.2 | 8 | 3% | 8 |
| dft.Calliope 5.6 | 5 | 2% | 9 |
| rdm.Dueler 0.4x | 4 | 2% | 4 |
| step.nanoPri 1.0 | 4 | 2% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 194917 melee ticks, 40182 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 58 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 2.

Targeting waves (276 rounds): 65058 sent, 58589 reached their opponent, 8566 virtual hits (14.6% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 449 over 8 battles (56.1 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.7 | 206 / 280 | 1.56 | 20.2% | 44830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.2% | 206 |
| DTF.Kludgy 1.2b | 2.0 | 14.5% | 28 |
| ne.Chimera 1.2 | 3.0 | 12.9% | 20 |
| ejb.Polaris 1.0.1 | 4.0 | 12.4% | 18 |
| vStar.RAFzilla 2.15 | 5.5 | 9.8% | 5 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.6% | 1 |
| kurios.DOSexe .9b | 7.5 | 6.0% | 2 |
| sam.Samspin 1.0 | 7.8 | 5.5% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.3 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.7 | 26 / 35 | 5467 |
| 2 | 1 | 70.2 | 92.7 | 24 / 35 | 5253 |
| 3 | 1 | 69.1 | 89.5 | 22 / 35 | 5483 |
| 4 | 1 | 71.7 | 96.2 | 28 / 35 | 5844 |
| 5 | 1 | 71.4 | 96.2 | 29 / 35 | 5564 |
| 6 | 1 | 70.2 | 92.7 | 23 / 35 | 5415 |
| 7 | 1 | 69.8 | 91.4 | 24 / 35 | 5559 |
| 8 | 1 | 72.4 | 98.4 | 30 / 35 | 6245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 95 | 83% |
| ejb.Polaris 1.0.1 | 47 | 85% |
| ne.Chimera 1.2 | 39 | 79% |
| vStar.RAFzilla 2.15 | 24 | 100% |
| tvv.micro.Antares 1.1.1 | 23 | 100% |
| kurios.DOSexe .9b | 5 | 80% |
| sam.Samspin 1.0 | 3 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |

Hadur died in 78 of 280 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 26 | 33% | 93 |
| ne.Chimera 1.2 | 22 | 28% | 58 |
| ejb.Polaris 1.0.1 | 16 | 21% | 62 |
| kurios.DOSexe .9b | 4 | 5% | 15 |
| vStar.RAFzilla 2.15 | 3 | 4% | 29 |
| tvv.micro.Antares 1.1.1 | 2 | 3% | 16 |
| sam.Samspin 1.0 | 1 | 1% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 1 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 267 rounds): 193575 melee ticks, 68811 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 64 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 1.

Targeting waves (267 rounds): 63776 sent, 57556 reached their opponent, 10988 virtual hits (19.1% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 391 over 8 battles (48.9 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 80.1 | 85 / 280 | 2.79 | 16.0% | 30087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.1 | 17.1% | 114 |
| hadur2.Hadur 3.17.1po | 1.9 | 16.0% | 85 |
| cx.mini.Nimrod 0.55 | 3.1 | 11.9% | 19 |
| djc.DynaBot 0.1.1 | 3.9 | 11.1% | 23 |
| br2.MobyDickBot 1.6 | 5.8 | 9.3% | 18 |
| rdt199.Warlord 0.73 | 5.8 | 8.8% | 13 |
| uji.YellohFellah 1.0 | 6.8 | 8.4% | 7 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.1% | 1 |
| stelo.MirrorNano 1.3 | 9.6 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 81.0 | 8 / 35 | 3777 |
| 2 | 2 | 64.9 | 82.9 | 11 / 35 | 3834 |
| 3 | 2 | 63.4 | 75.6 | 9 / 35 | 3906 |
| 4 | 2 | 64.3 | 80.0 | 13 / 35 | 3624 |
| 5 | 2 | 64.4 | 80.0 | 12 / 35 | 3702 |
| 6 | 1 | 65.7 | 84.1 | 14 / 35 | 3793 |
| 7 | 2 | 63.3 | 76.8 | 8 / 35 | 3736 |
| 8 | 2 | 64.0 | 80.3 | 10 / 35 | 3715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 73 | 48% |
| djc.DynaBot 0.1.1 | 24 | 58% |
| br2.MobyDickBot 1.6 | 20 | 60% |
| cx.mini.Nimrod 0.55 | 15 | 80% |
| rdt199.Warlord 0.73 | 10 | 30% |
| uji.YellohFellah 1.0 | 10 | 90% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 0% |

Hadur died in 198 of 280 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 88 | 44% | 120 |
| djc.DynaBot 0.1.1 | 30 | 15% | 40 |
| cx.mini.Nimrod 0.55 | 21 | 11% | 36 |
| rdt199.Warlord 0.73 | 16 | 8% | 22 |
| br2.MobyDickBot 1.6 | 15 | 8% | 26 |
| KiraNL.Chupacabra 0.4 | 10 | 5% | 10 |
| uji.YellohFellah 1.0 | 9 | 5% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 2% | 3 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 213554 melee ticks, 47864 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 39 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 70428 sent, 63836 reached their opponent, 8911 virtual hits (14.0% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 842 over 8 battles (105.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.5 | 145 / 280 | 2.39 | 17.5% | 30753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 17.5% | 145 |
| bts.wiki.RipCurl 0.9b | 2.6 | 13.7% | 40 |
| nat.PallasHawk 1.0 | 2.9 | 13.4% | 50 |
| darkcanuck.Leon 1.01 | 3.5 | 12.6% | 26 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.4% | 13 |
| jrm.Test0 1.0 | 6.0 | 8.4% | 3 |
| cs.sheldor.Talon 1.1 | 7.6 | 6.7% | 3 |
| jp.Perpy 16.0 | 7.8 | 6.6% | 0 |
| stuff.Vlad 0.1 | 9.0 | 5.3% | 1 |
| jaybot.bots.Oddball 4.0 | 9.6 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 85.4 | 18 / 35 | 3815 |
| 2 | 1 | 66.2 | 82.9 | 17 / 35 | 3863 |
| 3 | 1 | 65.7 | 82.5 | 15 / 35 | 3825 |
| 4 | 1 | 66.4 | 84.4 | 18 / 35 | 3705 |
| 5 | 1 | 68.0 | 86.3 | 22 / 35 | 4135 |
| 6 | 1 | 67.7 | 87.3 | 21 / 35 | 3875 |
| 7 | 1 | 66.5 | 84.4 | 18 / 35 | 3869 |
| 8 | 1 | 65.7 | 82.9 | 16 / 35 | 3666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 56 | 84% |
| nat.PallasHawk 1.0 | 55 | 64% |
| bts.wiki.RipCurl 0.9b | 49 | 78% |
| brainfade.melee.Genghis 0.36 | 7 | 57% |
| jrm.Test0 1.0 | 7 | 86% |
| jaybot.bots.Oddball 4.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 142 of 280 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 35 | 25% | 67 |
| nat.PallasHawk 1.0 | 32 | 23% | 68 |
| darkcanuck.Leon 1.01 | 24 | 17% | 72 |
| brainfade.melee.Genghis 0.36 | 19 | 13% | 31 |
| jrm.Test0 1.0 | 14 | 10% | 21 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 8 |
| jp.Perpy 16.0 | 3 | 2% | 6 |
| stuff.Vlad 0.1 | 3 | 2% | 6 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 177529 melee ticks, 46269 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 57 ticks (276 rounds over 8); rounds whose longest gap at any count was over 8: 276; robots dropped as dead without a death event: 1.

Targeting waves (276 rounds): 61439 sent, 54763 reached their opponent, 9635 virtual hits (17.6% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 125 over 8 battles (15.6 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 81.3 | 67 / 280 | 2.69 | 15.4% | 30956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.6 | 17.0% | 121 |
| ags.Glacier 0.2.11 | 1.9 | 16.7% | 54 |
| hadur2.Hadur 3.17.1po | 2.5 | 15.4% | 67 |
| shinh.Entangled 0.3 | 4.3 | 11.5% | 23 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.1% | 12 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 1 |
| stelo.Wang 1.0 | 7.0 | 7.1% | 4 |
| ayk.WallHugger 1.0 | 8.3 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 81.6 | 6 / 35 | 3869 |
| 2 | 3 | 65.1 | 82.2 | 9 / 35 | 3879 |
| 3 | 3 | 62.2 | 76.2 | 3 / 35 | 3695 |
| 4 | 3 | 62.3 | 77.8 | 8 / 35 | 3247 |
| 5 | 1 | 65.4 | 83.2 | 11 / 35 | 4303 |
| 6 | 3 | 64.1 | 82.2 | 6 / 35 | 3561 |
| 7 | 2 | 65.7 | 84.1 | 11 / 35 | 4211 |
| 8 | 2 | 65.8 | 82.9 | 13 / 35 | 4191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 63 | 24% |
| ags.Glacier 0.2.11 | 52 | 77% |
| shinh.Entangled 0.3 | 18 | 39% |
| gh.micro.Gruweltje 0.7 | 6 | 33% |
| stelo.Wang 1.0 | 4 | 75% |

Hadur died in 216 of 280 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 81 | 38% | 106 |
| mn.Combat 3.25.0 | 79 | 37% | 99 |
| shinh.Entangled 0.3 | 28 | 13% | 38 |
| gh.micro.Gruweltje 0.7 | 13 | 6% | 18 |
| maribo.FollowFire 1 | 7 | 3% | 7 |
| stelo.Wang 1.0 | 5 | 2% | 8 |
| apc.Colossus2 0.17 | 1 | 0% | 2 |
| ayk.WallHugger 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 204077 melee ticks, 47117 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 59 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 2.

Targeting waves (272 rounds): 58999 sent, 52225 reached their opponent, 8386 virtual hits (16.1% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 306 over 8 battles (38.3 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.9 | 211 / 280 | 1.46 | 20.7% | 44855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.7% | 211 |
| simonton.micro.Sprout 1.1.3 | 2.1 | 14.9% | 29 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.5% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 9.7% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.4 | 9.4% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 8.1% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.7% | 2 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 97.8 | 31 / 35 | 5726 |
| 2 | 1 | 70.7 | 94.9 | 24 / 35 | 5314 |
| 3 | 1 | 70.8 | 91.7 | 26 / 35 | 5586 |
| 4 | 1 | 71.6 | 94.9 | 28 / 35 | 5844 |
| 5 | 1 | 72.3 | 97.1 | 28 / 35 | 5761 |
| 6 | 1 | 71.2 | 95.2 | 25 / 35 | 5732 |
| 7 | 1 | 70.1 | 92.4 | 23 / 35 | 5240 |
| 8 | 1 | 71.0 | 95.2 | 26 / 35 | 5652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 108 | 86% |
| catcat20.shape.Theta 0.018 | 77 | 77% |
| sanyi.mikrobi.Roberto 1.0 | 28 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 94% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 88% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 70 of 280 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 27 | 39% | 111 |
| catcat20.shape.Theta 0.018 | 25 | 36% | 75 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 10% | 33 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 4% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 4% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 1% | 26 |
| pa.Improved 1.0 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 193338 melee ticks, 69911 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 48 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 61154 sent, 54978 reached their opponent, 13411 virtual hits (24.4% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 519 over 8 battles (64.9 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.0 | 143 / 280 | 2.26 | 18.4% | 39858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.4% | 143 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.4% | 27 |
| emp.Yngwie 1.11 | 3.4 | 13.1% | 71 |
| mld.DustBunny 3.8 | 3.8 | 12.5% | 10 |
| cb.nano.Insomnia 1.0 | 5.1 | 10.5% | 7 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.1% | 20 |
| lambdaxy.TBot 0.1 | 7.4 | 6.4% | 0 |
| Grystrion.TrackerWO 1.0 | 7.9 | 6.2% | 2 |
| divineomega.TrialBot 0.003 | 8.8 | 5.3% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.6 | 21 / 35 | 5037 |
| 2 | 1 | 67.4 | 83.5 | 15 / 35 | 5011 |
| 3 | 1 | 68.7 | 87.3 | 16 / 35 | 5046 |
| 4 | 1 | 68.6 | 86.3 | 17 / 35 | 5332 |
| 5 | 1 | 69.5 | 89.5 | 22 / 35 | 4946 |
| 6 | 1 | 68.8 | 88.6 | 21 / 35 | 4767 |
| 7 | 1 | 66.3 | 80.0 | 16 / 35 | 4866 |
| 8 | 1 | 67.7 | 84.1 | 15 / 35 | 4853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 67 | 54% |
| kawigi.micro.Shiz 1.1 | 44 | 91% |
| mld.DustBunny 3.8 | 35 | 94% |
| kawigi.robot.Girl 1.2 | 21 | 76% |
| cb.nano.Insomnia 1.0 | 13 | 92% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 141 of 280 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 53 | 38% | 104 |
| kawigi.micro.Shiz 1.1 | 22 | 16% | 55 |
| cb.nano.Insomnia 1.0 | 20 | 14% | 24 |
| mld.DustBunny 3.8 | 18 | 13% | 54 |
| kawigi.robot.Girl 1.2 | 15 | 11% | 22 |
| divineomega.TrialBot 0.003 | 4 | 3% | 13 |
| lambdaxy.TBot 0.1 | 4 | 3% | 5 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 223003 melee ticks, 60304 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 49 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 2.

Targeting waves (275 rounds): 73831 sent, 67381 reached their opponent, 11428 virtual hits (17.0% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 710 over 8 battles (88.8 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.6 | 137 / 280 | 2.20 | 19.0% | 44138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.0% | 137 |
| gh.Griezel 0.5.2 | 2.1 | 15.9% | 63 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.9 | 14.6% | 14 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.2% | 51 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.5% | 4 |
| tvv.nano.Polaris 1.2 | 6.1 | 8.5% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.3% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.8% | 5 |
| asd.Cthulhu 1.3 | 8.8 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.3 | 17 / 35 | 5543 |
| 2 | 1 | 67.9 | 86.0 | 16 / 35 | 4902 |
| 3 | 1 | 71.8 | 93.0 | 24 / 35 | 5931 |
| 4 | 1 | 67.7 | 83.8 | 15 / 35 | 5150 |
| 5 | 1 | 69.0 | 85.1 | 14 / 35 | 5840 |
| 6 | 1 | 69.1 | 84.1 | 17 / 35 | 5817 |
| 7 | 1 | 69.2 | 84.8 | 20 / 35 | 5542 |
| 8 | 1 | 69.0 | 87.9 | 14 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 92 | 64% |
| techdude.forest.FlamingForest 1.1 | 45 | 53% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 34 | 85% |
| bvh.fnr.Fenrir 0.36l | 13 | 77% |
| tvv.nano.Polaris 1.2 | 7 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| asd.Cthulhu 1.3 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 149 of 280 rounds, at a mean tick of 1144. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 46 | 31% | 103 |
| techdude.forest.FlamingForest 1.1 | 38 | 26% | 69 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 16% | 46 |
| bvh.fnr.Fenrir 0.36l | 18 | 12% | 23 |
| stelo.IntrinsicVolatility 1.4 | 11 | 7% | 17 |
| asd.Cthulhu 1.3 | 4 | 3% | 6 |
| divineomega.DivineBot 1.9.4.5 | 2 | 1% | 9 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 246963 melee ticks, 83642 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 634 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 442 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 79533 sent, 73242 reached their opponent, 12947 virtual hits (17.7% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 954 over 8 battles (119.3 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.8 | 137 / 280 | 2.28 | 18.9% | 44545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.9% | 137 |
| et.Predator 1.8 | 2.5 | 13.6% | 32 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.6% | 48 |
| cx.BlestPain 1.41 | 4.0 | 12.2% | 49 |
| ahf.NanoAndrew .4 | 5.0 | 10.3% | 9 |
| nic.Nicator 2.4 | 6.3 | 8.9% | 6 |
| maribo.melee.BMV 0.1 | 6.8 | 8.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.8% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.9 | 22 / 35 | 5573 |
| 2 | 1 | 67.9 | 83.2 | 17 / 35 | 5170 |
| 3 | 1 | 70.2 | 90.5 | 18 / 35 | 5697 |
| 4 | 1 | 67.3 | 81.6 | 15 / 35 | 5083 |
| 5 | 1 | 68.1 | 83.2 | 15 / 35 | 5394 |
| 6 | 1 | 69.6 | 86.7 | 16 / 35 | 6006 |
| 7 | 1 | 69.5 | 86.3 | 19 / 35 | 5681 |
| 8 | 1 | 69.3 | 86.3 | 15 / 35 | 5941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 70 | 71% |
| et.Predator 1.8 | 69 | 72% |
| cx.BlestPain 1.41 | 40 | 33% |
| ahf.NanoAndrew .4 | 12 | 100% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| nic.Nicator 2.4 | 4 | 75% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 153 of 280 rounds, at a mean tick of 1064. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 44 | 29% | 58 |
| et.Predator 1.8 | 37 | 24% | 88 |
| oog.melee.Mercutio 1.0 | 34 | 22% | 75 |
| ahf.NanoAndrew .4 | 15 | 10% | 30 |
| nic.Nicator 2.4 | 6 | 4% | 13 |
| maribo.melee.BMV 0.1 | 6 | 4% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 273 rounds): 219017 melee ticks, 80890 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 76 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (273 rounds): longest scan gap while four or more were alive 76 ticks (273 rounds over 8); rounds whose longest gap at any count was over 8: 273; robots dropped as dead without a death event: 1.

Targeting waves (273 rounds): 73521 sent, 67213 reached their opponent, 14550 virtual hits (21.6% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 728 over 8 battles (91.0 per battle, most in one battle 167). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.8 | 178 / 280 | 1.83 | 19.6% | 39371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.6% | 178 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.4% | 43 |
| uji.DBH 1.1 | 3.5 | 11.6% | 14 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.6% | 20 |
| sigterm.Sigterm 1.0 | 5.6 | 9.0% | 14 |
| spinnercat.Robovirus 2.718 | 5.8 | 8.6% | 7 |
| ratosh.Nobo 0.21 | 7.1 | 7.7% | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.4% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.7% | 0 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.1 | 20 / 35 | 4625 |
| 2 | 1 | 67.7 | 87.0 | 20 / 35 | 4379 |
| 3 | 1 | 70.4 | 92.1 | 26 / 35 | 5378 |
| 4 | 1 | 68.2 | 89.2 | 16 / 35 | 4750 |
| 5 | 1 | 70.1 | 93.0 | 22 / 35 | 5322 |
| 6 | 1 | 70.6 | 94.0 | 27 / 35 | 5278 |
| 7 | 1 | 69.2 | 92.1 | 20 / 35 | 4808 |
| 8 | 1 | 70.6 | 94.6 | 27 / 35 | 4831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 83 | 67% |
| uji.DBH 1.1 | 49 | 84% |
| agd.Mooserwirt2 2.7 | 34 | 74% |
| sigterm.Sigterm 1.0 | 31 | 77% |
| spinnercat.Robovirus 2.718 | 13 | 69% |
| ratosh.Nobo 0.21 | 9 | 100% |
| stelo.WangRobot 1.0 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 106 of 280 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 38 | 36% | 97 |
| agd.Mooserwirt2 2.7 | 20 | 19% | 50 |
| uji.DBH 1.1 | 16 | 15% | 38 |
| sigterm.Sigterm 1.0 | 11 | 10% | 35 |
| spinnercat.Robovirus 2.718 | 6 | 6% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 4% | 11 |
| ratosh.Nobo 0.21 | 4 | 4% | 10 |
| stelo.WangRobot 1.0 | 2 | 2% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 183918 melee ticks, 65223 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 104 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 4.

Targeting waves (270 rounds): 63016 sent, 56604 reached their opponent, 12587 virtual hits (22.2% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 8 battles (22.1 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 96.9 | 252 / 280 | 1.28 | 22.0% | 48773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 22.0% | 252 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 14 |
| mld.Infinity 2.2 | 3.4 | 12.0% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.4% | 4 |
| erdnis.Rover 0.3 | 4.6 | 10.9% | 2 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.6% | 3 |
| mbh.Mbh 0.1 | 7.3 | 7.3% | 0 |
| pac.ABC 2.1 | 7.9 | 6.5% | 2 |
| pbg.R2D2 1.0 | 8.6 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 96.8 | 31 / 35 | 6104 |
| 2 | 1 | 72.9 | 95.6 | 32 / 35 | 6127 |
| 3 | 1 | 73.7 | 97.1 | 32 / 35 | 6594 |
| 4 | 1 | 73.1 | 98.7 | 32 / 35 | 6051 |
| 5 | 1 | 72.9 | 96.2 | 33 / 35 | 5727 |
| 6 | 1 | 73.3 | 96.8 | 31 / 35 | 6266 |
| 7 | 1 | 72.7 | 95.2 | 30 / 35 | 6190 |
| 8 | 1 | 72.9 | 98.7 | 31 / 35 | 5714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 148 | 97% |
| mld.Infinity 2.2 | 35 | 100% |
| krillr.mini.JointStrike 2.0.0 | 30 | 90% |
| erdnis.Rover 0.3 | 20 | 95% |
| pac.ABC 2.1 | 14 | 93% |
| patson.PatsonTestBot 1.0 | 13 | 92% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 29 of 280 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 10 | 34% | 99 |
| krillr.mini.JointStrike 2.0.0 | 7 | 24% | 46 |
| patson.PatsonTestBot 1.0 | 4 | 14% | 28 |
| pac.ABC 2.1 | 3 | 10% | 13 |
| erdnis.Rover 0.3 | 2 | 7% | 27 |
| mbh.Mbh 0.1 | 2 | 7% | 16 |
| mld.Infinity 2.2 | 1 | 3% | 34 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |

Posture (Hadur's M records, 265 rounds): 166833 melee ticks, 61281 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (265 rounds): longest scan gap while four or more were alive 39 ticks (265 rounds over 8); rounds whose longest gap at any count was over 8: 265; robots dropped as dead without a death event: 0.

Targeting waves (265 rounds): 57075 sent, 51104 reached their opponent, 12337 virtual hits (24.1% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 786 over 8 battles (98.3 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.6 | 178 / 280 | 1.85 | 20.3% | 46472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.3% | 178 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 50 |
| catcat20.Rabbit 0.001 | 3.5 | 11.4% | 27 |
| fwb.Nine 1.0.1 | 3.8 | 11.3% | 19 |
| nz.jdc.nano.GridFu 1.0 | 5.0 | 10.2% | 3 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.9% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 6.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.9 | 6.3% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.9 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.4 | 24 / 35 | 5595 |
| 2 | 1 | 70.2 | 91.4 | 22 / 35 | 5417 |
| 3 | 1 | 71.2 | 92.7 | 24 / 35 | 5895 |
| 4 | 1 | 70.5 | 89.8 | 21 / 35 | 6106 |
| 5 | 1 | 71.7 | 93.0 | 27 / 35 | 5986 |
| 6 | 1 | 69.3 | 84.4 | 18 / 35 | 5819 |
| 7 | 1 | 70.4 | 90.5 | 20 / 35 | 5760 |
| 8 | 1 | 70.8 | 91.1 | 22 / 35 | 5894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 94 | 79% |
| fwb.Nine 1.0.1 | 51 | 96% |
| catcat20.Rabbit 0.001 | 37 | 65% |
| m3thos.mini.Eva01 0.5.5 | 14 | 100% |
| nz.jdc.nano.GridFu 1.0 | 9 | 100% |
| bayen.nut.Squirrel 1.615 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 110 of 280 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 51 | 46% | 126 |
| catcat20.Rabbit 0.001 | 23 | 21% | 56 |
| fwb.Nine 1.0.1 | 18 | 16% | 37 |
| nz.jdc.nano.GridFu 1.0 | 6 | 5% | 24 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 16 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 7 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 230191 melee ticks, 66335 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 40 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 72872 sent, 66302 reached their opponent, 14890 virtual hits (22.5% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 512 over 8 battles (64.0 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.0 | 139 / 280 | 1.90 | 19.6% | 45692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.6% | 139 |
| eem.EvBot v4.6.16 | 2.0 | 17.3% | 114 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.4% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 6 |
| eld.Hmm 1.0 | 5.0 | 8.8% | 14 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.5% | 0 |
| fire219.CatBot 1.0 | 7.9 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.7% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.6 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.2 | 19 / 35 | 5819 |
| 2 | 1 | 68.1 | 85.1 | 15 / 35 | 5229 |
| 3 | 1 | 70.2 | 90.5 | 18 / 35 | 5533 |
| 4 | 1 | 70.9 | 91.7 | 19 / 35 | 5801 |
| 5 | 1 | 71.0 | 91.7 | 18 / 35 | 5939 |
| 6 | 1 | 70.4 | 89.5 | 15 / 35 | 6154 |
| 7 | 1 | 70.5 | 91.7 | 17 / 35 | 5728 |
| 8 | 1 | 69.3 | 89.5 | 18 / 35 | 5489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 171 | 52% |
| dummy.mini.Scimitar 1.01 | 23 | 74% |
| cf.RiO.RiOx 4.2.1 | 22 | 91% |
| eld.Hmm 1.0 | 16 | 44% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 146 of 280 rounds, at a mean tick of 1351. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 86 | 59% | 155 |
| dummy.mini.Scimitar 1.01 | 25 | 17% | 54 |
| eld.Hmm 1.0 | 13 | 9% | 30 |
| cf.RiO.RiOx 4.2.1 | 10 | 7% | 23 |
| PSW.Relentless 0.1 | 5 | 3% | 5 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 10 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 277 rounds): 237476 melee ticks, 124387 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (277 rounds): longest scan gap while four or more were alive 47 ticks (277 rounds over 8); rounds whose longest gap at any count was over 8: 277; robots dropped as dead without a death event: 0.

Targeting waves (277 rounds): 71474 sent, 65145 reached their opponent, 11526 virtual hits (17.7% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 489 over 8 battles (61.1 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.1 | 123 / 280 | 2.16 | 18.0% | 37677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.1 | 18.0% | 123 |
| pe.SandboxDT 2.71m | 2.0 | 16.8% | 88 |
| kvk.HebusLeTroll 0.35 | 2.9 | 15.0% | 40 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 23 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 4 |
| yk.JahRoslav 1.1 | 6.9 | 6.5% | 2 |
| tad.Dalek98 0.98 | 7.1 | 6.5% | 1 |
| gg.Squaraus 0.6 | 7.3 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.3% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.6 | 15 / 35 | 4827 |
| 2 | 1 | 68.1 | 87.3 | 14 / 35 | 4730 |
| 3 | 1 | 69.4 | 90.5 | 18 / 35 | 4940 |
| 4 | 1 | 70.1 | 92.4 | 19 / 35 | 4895 |
| 5 | 2 | 66.1 | 79.7 | 13 / 35 | 4468 |
| 6 | 1 | 67.1 | 82.9 | 12 / 35 | 4605 |
| 7 | 1 | 67.8 | 85.7 | 15 / 35 | 4476 |
| 8 | 1 | 68.7 | 89.5 | 17 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 77 | 44% |
| kvk.HebusLeTroll 0.35 | 61 | 70% |
| jlm.javaDisturbance 0.59 | 45 | 69% |
| bigpete.Stewie 1.0 | 13 | 77% |
| yk.JahRoslav 1.1 | 5 | 80% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 161 of 280 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 60 | 37% | 105 |
| kvk.HebusLeTroll 0.35 | 49 | 30% | 77 |
| jlm.javaDisturbance 0.59 | 31 | 19% | 63 |
| bigpete.Stewie 1.0 | 9 | 6% | 19 |
| tad.Dalek98 0.98 | 5 | 3% | 5 |
| yk.JahRoslav 1.1 | 1 | 1% | 6 |
| pbg.NinjaX 1.2 | 1 | 1% | 3 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 213773 melee ticks, 63175 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 32 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 3.

Targeting waves (270 rounds): 69433 sent, 63125 reached their opponent, 10473 virtual hits (16.6% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 233 over 8 battles (29.1 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 94.6 | 211 / 280 | 1.49 | 21.3% | 47900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 21.3% | 211 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 51 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.4 | 10.0% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.1 | 9.1% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.0% | 2 |
| cw.megas.Blade 0.8 | 7.0 | 8.2% | 1 |
| sample.Walls 1.0 | 7.9 | 7.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.6 | 26 / 35 | 5903 |
| 2 | 1 | 73.4 | 96.5 | 28 / 35 | 6475 |
| 3 | 1 | 72.0 | 94.0 | 27 / 35 | 5487 |
| 4 | 1 | 72.6 | 94.9 | 25 / 35 | 6231 |
| 5 | 1 | 73.3 | 96.8 | 29 / 35 | 6030 |
| 6 | 1 | 72.8 | 91.7 | 28 / 35 | 6107 |
| 7 | 1 | 72.5 | 94.6 | 26 / 35 | 5920 |
| 8 | 1 | 71.8 | 93.3 | 22 / 35 | 5747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 137 | 82% |
| cre.Karolos 0.32 | 65 | 92% |
| stelo.RamTrackSurfer 1.2 | 14 | 86% |
| stelo.AreaTargetingBot 1.1 | 14 | 93% |
| sample.Walls 1.0 | 7 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 4 | 75% |

Hadur died in 71 of 280 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 33 | 46% | 137 |
| cre.Karolos 0.32 | 19 | 27% | 78 |
| stelo.AreaTargetingBot 1.1 | 11 | 15% | 25 |
| stelo.RamTrackSurfer 1.2 | 2 | 3% | 20 |
| cw.megas.Blade 0.8 | 2 | 3% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 3% | 4 |
| sample.Walls 1.0 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 279 rounds): 173946 melee ticks, 70783 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (279 rounds): longest scan gap while four or more were alive 47 ticks (279 rounds over 8); rounds whose longest gap at any count was over 8: 279; robots dropped as dead without a death event: 0.

Targeting waves (279 rounds): 54318 sent, 47897 reached their opponent, 14706 virtual hits (30.7% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 624 over 8 battles (78.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.1 | 88 / 280 | 2.79 | 16.1% | 31601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 16.1% | 88 |
| rz.GlowBlowMelee 1.4 | 2.5 | 13.9% | 58 |
| florent.XSeries.X2 0.12 | 3.0 | 13.2% | 38 |
| davidalves.Phoenix 0.54 | 4.1 | 12.3% | 50 |
| pedersen.Ugluk 1.1.1 | 4.4 | 12.3% | 30 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 10 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.8% | 4 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.2% | 0 |
| as.FrankTheTank 1.3 | 9.1 | 5.0% | 2 |
| evd.X1 0.01 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 81.6 | 12 / 35 | 3822 |
| 2 | 1 | 63.5 | 77.1 | 7 / 35 | 4054 |
| 3 | 1 | 65.7 | 81.9 | 11 / 35 | 4370 |
| 4 | 1 | 65.1 | 81.0 | 11 / 35 | 4237 |
| 5 | 1 | 63.9 | 75.6 | 11 / 35 | 3861 |
| 6 | 1 | 64.8 | 81.9 | 13 / 35 | 3636 |
| 7 | 1 | 65.1 | 81.6 | 13 / 35 | 3843 |
| 8 | 1 | 64.0 | 80.0 | 10 / 35 | 3778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 43 | 37% |
| florent.XSeries.X2 0.12 | 34 | 59% |
| pedersen.Ugluk 1.1.1 | 31 | 58% |
| davidalves.Phoenix 0.54 | 26 | 46% |
| oog.melee.Corsair 1.0 | 12 | 75% |
| stelo.SoJNanoMelee 1.1 | 8 | 88% |
| as.FrankTheTank 1.3 | 4 | 50% |
| lunchie.Lunchbox 0.93 | 4 | 100% |

Hadur died in 196 of 280 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 46 | 23% | 62 |
| davidalves.Phoenix 0.54 | 44 | 22% | 59 |
| florent.XSeries.X2 0.12 | 42 | 21% | 61 |
| pedersen.Ugluk 1.1.1 | 35 | 18% | 45 |
| oog.melee.Corsair 1.0 | 10 | 5% | 25 |
| stelo.SoJNanoMelee 1.1 | 6 | 3% | 8 |
| as.FrankTheTank 1.3 | 4 | 2% | 8 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 9 |
| evd.X1 0.01 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 184421 melee ticks, 44017 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 46 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 62588 sent, 55731 reached their opponent, 10551 virtual hits (18.9% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 8 battles (21.6 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.6 | 162 / 280 | 2.38 | 17.8% | 31481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 17.8% | 162 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.3% | 32 |
| voidious.mini.BrokenSword 2.0.3 | 2.8 | 13.2% | 22 |
| jdw.Hurricane 1.4 | 3.8 | 11.4% | 23 |
| gre.svman4.Morfeas 1.4.1 | 5.4 | 9.7% | 16 |
| ds.Oo 2.2 | 5.6 | 9.5% | 12 |
| awesomeness.Elite 1.0 | 7.4 | 7.4% | 4 |
| adt.Ar2 1.1 | 8.0 | 6.9% | 3 |
| gjr.Cephalosporin 0.1 | 8.6 | 6.5% | 5 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.3 | 22 / 35 | 4082 |
| 2 | 1 | 66.4 | 81.6 | 21 / 35 | 3873 |
| 3 | 1 | 66.1 | 83.2 | 17 / 35 | 3701 |
| 4 | 1 | 67.5 | 85.7 | 21 / 35 | 4219 |
| 5 | 1 | 66.9 | 84.4 | 19 / 35 | 4013 |
| 6 | 1 | 66.1 | 83.2 | 17 / 35 | 3837 |
| 7 | 1 | 67.5 | 87.0 | 22 / 35 | 3825 |
| 8 | 1 | 67.9 | 85.7 | 23 / 35 | 3931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 53 | 87% |
| voidious.micro.BlitzBat 1.05 | 51 | 86% |
| jdw.Hurricane 1.4 | 31 | 90% |
| gre.svman4.Morfeas 1.4.1 | 17 | 65% |
| ds.Oo 2.2 | 16 | 94% |
| gjr.Cephalosporin 0.1 | 9 | 78% |
| awesomeness.Elite 1.0 | 7 | 71% |
| adt.Ar2 1.1 | 6 | 67% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 119 of 280 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 24% | 58 |
| voidious.mini.BrokenSword 2.0.3 | 24 | 20% | 61 |
| jdw.Hurricane 1.4 | 19 | 16% | 44 |
| gre.svman4.Morfeas 1.4.1 | 15 | 13% | 36 |
| ds.Oo 2.2 | 14 | 12% | 31 |
| awesomeness.Elite 1.0 | 9 | 8% | 19 |
| adt.Ar2 1.1 | 7 | 6% | 16 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 12 |
| amk.ChumbaMini 0.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 269 rounds): 164868 melee ticks, 33238 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 78 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (269 rounds): longest scan gap while four or more were alive 78 ticks (269 rounds over 8); rounds whose longest gap at any count was over 8: 269; robots dropped as dead without a death event: 0.

Targeting waves (269 rounds): 59324 sent, 53189 reached their opponent, 9078 virtual hits (17.1% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 8 battles (21.9 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.3 | 179 / 280 | 1.78 | 20.2% | 48454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.2% | 179 |
| ak.Fermat 2.0 | 2.0 | 14.8% | 41 |
| lrem.Spectre 0.4.4 | 3.3 | 12.7% | 23 |
| shu.nitro.LENIN .T34 | 3.9 | 12.4% | 27 |
| js.PinBall 1.6 | 5.0 | 10.7% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.3% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 7.9% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 7.9 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 3.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.8 | 21 / 35 | 6059 |
| 2 | 1 | 70.8 | 91.4 | 20 / 35 | 6026 |
| 3 | 1 | 70.6 | 90.2 | 23 / 35 | 5784 |
| 4 | 1 | 70.8 | 89.2 | 19 / 35 | 6250 |
| 5 | 1 | 72.6 | 96.2 | 26 / 35 | 6282 |
| 6 | 1 | 71.0 | 91.1 | 21 / 35 | 5994 |
| 7 | 1 | 69.9 | 87.3 | 22 / 35 | 5826 |
| 8 | 1 | 72.6 | 95.6 | 27 / 35 | 6233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 77 | 75% |
| lrem.Spectre 0.4.4 | 64 | 81% |
| shu.nitro.LENIN .T34 | 59 | 86% |
| js.PinBall 1.6 | 9 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 63% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |

Hadur died in 103 of 280 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 41 | 40% | 90 |
| shu.nitro.LENIN .T34 | 25 | 24% | 76 |
| lrem.Spectre 0.4.4 | 21 | 20% | 62 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 8% | 16 |
| js.PinBall 1.6 | 4 | 4% | 21 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 10 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 271 rounds): 213570 melee ticks, 60392 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 33 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 0.

Targeting waves (271 rounds): 70014 sent, 63701 reached their opponent, 15800 virtual hits (24.8% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 354 over 8 battles (44.3 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.7 | 183 / 280 | 2.91 | 18.1% | 41123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.4 | 18.1% | 183 |
| mk.Alpha 0.2.1 | 1.6 | 14.7% | 60 |
| EH.Eagle 1.0.6 | 4.8 | 9.7% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 4.9 | 9.7% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 5.9 | 8.9% | 4 |
| joe.ADinosaur 1.0 | 5.9 | 8.9% | 1 |
| wee.Gem 1.8.4 | 6.0 | 8.9% | 11 |
| throxbot.ThroxBot 0.1 | 6.4 | 8.6% | 4 |
| caimano.Furia_Ceca 0.22 | 8.9 | 7.0% | 4 |
| cs.Grudge 1.0 | 9.4 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.9 | 31 / 35 | 6191 |
| 2 | 2 | 56.5 | 49.5 | 9 / 35 | 4332 |
| 3 | 2 | 60.6 | 57.5 | 13 / 35 | 4770 |
| 4 | 1 | 71.0 | 94.3 | 30 / 35 | 5297 |
| 5 | 1 | 69.6 | 90.2 | 26 / 35 | 5117 |
| 6 | 2 | 56.4 | 49.5 | 11 / 35 | 4364 |
| 7 | 1 | 72.5 | 98.1 | 32 / 35 | 5831 |
| 8 | 1 | 71.4 | 95.9 | 31 / 35 | 5221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 102 | 93% |
| EH.Eagle 1.0.6 | 28 | 100% |
| wee.Gem 1.8.4 | 16 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 100% |
| throxbot.ThroxBot 0.1 | 13 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| joe.ADinosaur 1.0 | 4 | 100% |

Hadur died in 100 of 280 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 33 | 33% | 38 |
| mk.Alpha 0.2.1 | 19 | 19% | 104 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 11% | 29 |
| throxbot.ThroxBot 0.1 | 8 | 8% | 16 |
| wee.Gem 1.8.4 | 7 | 7% | 23 |
| joe.ADinosaur 1.0 | 7 | 7% | 12 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 9 |
| EH.Eagle 1.0.6 | 4 | 4% | 32 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 2% | 17 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 151412 melee ticks, 44048 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 56 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 2.

Targeting waves (271 rounds): 51349 sent, 45107 reached their opponent, 11655 virtual hits (25.8% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 495 over 8 battles (61.9 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.1 | 171 / 280 | 2.07 | 18.3% | 31905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.3% | 171 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 43 |
| uji.Antique 1.0 | 3.1 | 12.3% | 34 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.6% | 6 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.8% | 10 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.4% | 5 |
| ahr.ice.Ice 1.0.2 | 6.6 | 8.1% | 8 |
| matt.advanced.Katana 1.0 | 8.9 | 5.9% | 3 |
| stelo.PianistNano 1.2 | 8.9 | 5.4% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.9 | 21 / 35 | 4055 |
| 2 | 1 | 68.2 | 90.2 | 21 / 35 | 3988 |
| 3 | 1 | 67.2 | 86.0 | 20 / 35 | 4045 |
| 4 | 1 | 67.6 | 87.6 | 23 / 35 | 4013 |
| 5 | 1 | 67.8 | 88.6 | 24 / 35 | 3695 |
| 6 | 1 | 67.1 | 87.6 | 19 / 35 | 3812 |
| 7 | 1 | 68.1 | 89.8 | 22 / 35 | 4063 |
| 8 | 1 | 67.8 | 87.0 | 21 / 35 | 4234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 103 | 82% |
| uji.Antique 1.0 | 58 | 83% |
| qohnil.blot.BlotBot 3.61 | 13 | 85% |
| pfvicm.Sobieski 7.2.3b | 13 | 92% |
| amk.ChumbaWumba 0.3 | 11 | 82% |
| ahr.ice.Ice 1.0.2 | 8 | 50% |
| matt.advanced.Katana 1.0 | 3 | 67% |

Hadur died in 113 of 280 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 40 | 35% | 84 |
| uji.Antique 1.0 | 22 | 19% | 73 |
| pfvicm.Sobieski 7.2.3b | 20 | 18% | 38 |
| ahr.ice.Ice 1.0.2 | 9 | 8% | 20 |
| qohnil.blot.BlotBot 3.61 | 7 | 6% | 29 |
| amk.ChumbaWumba 0.3 | 7 | 6% | 24 |
| stelo.Lifestealer 1.0 | 3 | 3% | 5 |
| matt.advanced.Katana 1.0 | 2 | 2% | 6 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 173383 melee ticks, 47662 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 39 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 1.

Targeting waves (270 rounds): 59068 sent, 52696 reached their opponent, 7821 virtual hits (14.8% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 466 over 8 battles (58.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.7 | 136 / 280 | 2.20 | 18.5% | 36431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.5% | 136 |
| deewiant.Anomaly 0.2 | 2.3 | 15.1% | 56 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.8% | 67 |
| myl.micro.Troodon 1.10 | 4.4 | 12.1% | 11 |
| jok.PheonixM 0.1.2 | 4.6 | 11.1% | 11 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 0 |
| DBall.Anarchy 0.1 | 7.6 | 5.9% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.5% | 0 |
| ap.Frederick 1.1 | 8.6 | 4.7% | 0 |
| jangs.ns51 1.0 | 9.6 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.0 | 16 / 35 | 4599 |
| 2 | 1 | 67.2 | 82.9 | 11 / 35 | 4429 |
| 3 | 1 | 69.5 | 86.0 | 19 / 35 | 5040 |
| 4 | 1 | 68.7 | 85.7 | 17 / 35 | 4706 |
| 5 | 1 | 68.4 | 86.7 | 18 / 35 | 4368 |
| 6 | 1 | 66.6 | 82.5 | 14 / 35 | 3869 |
| 7 | 1 | 70.1 | 90.8 | 19 / 35 | 4828 |
| 8 | 1 | 70.1 | 91.7 | 22 / 35 | 4592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 89 | 66% |
| zyx.mega.YersiniaPestis 3.1 | 57 | 58% |
| myl.micro.Troodon 1.10 | 21 | 90% |
| jok.PheonixM 0.1.2 | 16 | 88% |
| ap.Frederick 1.1 | 5 | 100% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 149 of 280 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 57 | 38% | 111 |
| zyx.mega.YersiniaPestis 3.1 | 51 | 34% | 88 |
| myl.micro.Troodon 1.10 | 18 | 12% | 36 |
| jok.PheonixM 0.1.2 | 9 | 6% | 27 |
| ph.melee.ArcherME 0.3 | 8 | 5% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 5 |
| DBall.Anarchy 0.1 | 0 | 0% | 1 |
| jangs.ns51 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 217798 melee ticks, 70326 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 46 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 72714 sent, 66206 reached their opponent, 10677 virtual hits (16.1% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 994 over 8 battles (124.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.4 | 63 / 280 | 3.21 | 14.9% | 30557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.4 | 14.9% | 63 |
| darkcanuck.B26354 1.06 | 2.4 | 14.0% | 65 |
| catcat20.Matcha 0.006 | 3.0 | 13.5% | 62 |
| oog.melee.Capulet 1.2 | 4.1 | 13.0% | 39 |
| stelo.PastFuture 2.3.2 | 4.1 | 12.7% | 30 |
| intruder.PrairieWolf 2.61 | 6.0 | 8.8% | 15 |
| tripphippy.Alice 1.1 | 7.8 | 7.1% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 6.7% | 3 |
| ntc.Opposite 1.5 | 8.1 | 6.7% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 75.2 | 6 / 35 | 3937 |
| 2 | 1 | 62.0 | 73.3 | 11 / 35 | 3532 |
| 3 | 2 | 61.5 | 73.3 | 4 / 35 | 3597 |
| 4 | 1 | 64.0 | 77.5 | 8 / 35 | 4106 |
| 5 | 1 | 62.6 | 72.4 | 11 / 35 | 3667 |
| 6 | 1 | 64.5 | 80.0 | 7 / 35 | 4096 |
| 7 | 3 | 62.2 | 73.0 | 8 / 35 | 3689 |
| 8 | 1 | 63.9 | 78.7 | 8 / 35 | 3933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 45% |
| darkcanuck.B26354 1.06 | 31 | 45% |
| oog.melee.Capulet 1.2 | 27 | 70% |
| stelo.PastFuture 2.3.2 | 16 | 31% |
| intruder.PrairieWolf 2.61 | 7 | 57% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 60% |
| tripphippy.Alice 1.1 | 4 | 100% |

Hadur died in 226 of 280 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 55 | 24% | 69 |
| catcat20.Matcha 0.006 | 48 | 21% | 66 |
| stelo.PastFuture 2.3.2 | 46 | 20% | 54 |
| oog.melee.Capulet 1.2 | 27 | 12% | 41 |
| intruder.PrairieWolf 2.61 | 12 | 5% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 4% | 12 |
| ntc.Opposite 1.5 | 9 | 4% | 9 |
| tripphippy.Alice 1.1 | 8 | 4% | 12 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |
9 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 218882 melee ticks, 35839 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 74 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 0.

Targeting waves (278 rounds): 70859 sent, 64250 reached their opponent, 11181 virtual hits (17.4% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 539 over 8 battles (67.4 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 77.1 | 70 / 280 | 3.06 | 15.2% | 28337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.5% | 116 |
| hadur2.Hadur 3.17.1po | 2.1 | 15.2% | 70 |
| gh.mini.Griezel 0.2 | 2.9 | 13.5% | 64 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.3% | 10 |
| spinnercat.micro.Tyger 0.1 | 5.1 | 10.1% | 8 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.3% | 4 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.9% | 4 |
| fm.mammillarias 1.3 | 8.6 | 5.7% | 0 |
| tlp.ThreeLeggedPig 1 | 8.9 | 5.4% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 9.4 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 75.9 | 9 / 35 | 3303 |
| 2 | 2 | 64.7 | 81.6 | 13 / 35 | 3411 |
| 3 | 3 | 60.0 | 68.6 | 6 / 35 | 3105 |
| 4 | 2 | 64.3 | 79.7 | 9 / 35 | 3796 |
| 5 | 2 | 64.1 | 77.8 | 9 / 35 | 3760 |
| 6 | 2 | 62.9 | 75.9 | 8 / 35 | 3588 |
| 7 | 2 | 62.8 | 75.2 | 8 / 35 | 3567 |
| 8 | 2 | 64.6 | 81.9 | 8 / 35 | 3807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 68 | 41% |
| gh.mini.Griezel 0.2 | 43 | 35% |
| d414.nano.Quantum 1.0.0 | 22 | 73% |
| spinnercat.micro.Tyger 0.1 | 6 | 83% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 3 | 67% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 214 of 280 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 88 | 41% | 116 |
| gh.mini.Griezel 0.2 | 50 | 23% | 66 |
| d414.nano.Quantum 1.0.0 | 20 | 9% | 37 |
| spinnercat.micro.Tyger 0.1 | 19 | 9% | 22 |
| gh.nano.Grofvuil 0.2 | 13 | 6% | 16 |
| timmit.nano.TimDog 0.33 | 8 | 4% | 9 |
| fm.mammillarias 1.3 | 8 | 4% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 271 rounds): 194715 melee ticks, 44059 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (271 rounds): longest scan gap while four or more were alive 70 ticks (271 rounds over 8); rounds whose longest gap at any count was over 8: 271; robots dropped as dead without a death event: 2.

Targeting waves (271 rounds): 65424 sent, 58909 reached their opponent, 9885 virtual hits (16.8% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 633 over 8 battles (79.1 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 89.2 | 164 / 280 | 1.98 | 18.4% | 35331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.4% | 164 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 69 |
| apc.botM 3.0 | 3.4 | 11.6% | 13 |
| lxx.ConceptA 0.8 | 3.9 | 10.8% | 6 |
| vjik.UnViolation 1.1 | 5.0 | 9.6% | 10 |
| bayen.UbaMicro 1.4 | 6.0 | 8.7% | 3 |
| panzer.Panzer 0.2 | 7.4 | 7.4% | 1 |
| yk.JahMicro 1.0 | 8.3 | 6.5% | 7 |
| conscience.Electron 1.3g | 8.6 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.7% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.9 | 19 / 35 | 4524 |
| 2 | 1 | 67.0 | 86.3 | 20 / 35 | 4316 |
| 3 | 1 | 66.6 | 85.1 | 21 / 35 | 4223 |
| 4 | 1 | 68.6 | 92.1 | 19 / 35 | 4579 |
| 5 | 1 | 68.7 | 91.4 | 24 / 35 | 4519 |
| 6 | 1 | 68.4 | 90.5 | 21 / 35 | 4653 |
| 7 | 1 | 67.4 | 88.3 | 19 / 35 | 4238 |
| 8 | 1 | 67.7 | 90.8 | 21 / 35 | 4279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 108 | 60% |
| apc.botM 3.0 | 41 | 85% |
| vjik.UnViolation 1.1 | 22 | 86% |
| lxx.ConceptA 0.8 | 20 | 90% |
| yk.JahMicro 1.0 | 12 | 75% |
| donjezza.Jezza 1.0 | 12 | 75% |
| bayen.UbaMicro 1.4 | 7 | 57% |
| panzer.Panzer 0.2 | 3 | 67% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 121 of 280 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 52 | 43% | 113 |
| lxx.ConceptA 0.8 | 23 | 19% | 40 |
| apc.botM 3.0 | 11 | 9% | 45 |
| panzer.Panzer 0.2 | 7 | 6% | 9 |
| vjik.UnViolation 1.1 | 6 | 5% | 36 |
| bayen.UbaMicro 1.4 | 6 | 5% | 13 |
| yk.JahMicro 1.0 | 6 | 5% | 11 |
| donjezza.Jezza 1.0 | 3 | 2% | 6 |
| conscience.Electron 1.3g | 3 | 2% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 270 rounds): 170368 melee ticks, 72959 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (270 rounds): longest scan gap while four or more were alive 65 ticks (270 rounds over 8); rounds whose longest gap at any count was over 8: 270; robots dropped as dead without a death event: 1.

Targeting waves (270 rounds): 58187 sent, 51816 reached their opponent, 9557 virtual hits (18.4% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 812 over 8 battles (101.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.2 | 153 / 280 | 2.15 | 18.6% | 36470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.6% | 153 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 12.9% | 31 |
| labg.Cataclysm 2.05 | 4.5 | 10.8% | 21 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 10.5% | 13 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.1 | 8.6% | 11 |
| baal.nano.N 1.42 | 6.6 | 8.6% | 1 |
| zyx.micro.Ant 1.1 | 8.1 | 5.8% | 1 |
| sanja.First 0.1 | 8.9 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.7 | 24 / 35 | 5150 |
| 2 | 1 | 66.6 | 82.2 | 14 / 35 | 4208 |
| 3 | 1 | 68.6 | 87.0 | 20 / 35 | 4535 |
| 4 | 1 | 68.0 | 87.6 | 20 / 35 | 4233 |
| 5 | 1 | 68.9 | 88.9 | 16 / 35 | 4573 |
| 6 | 1 | 69.4 | 89.5 | 21 / 35 | 4456 |
| 7 | 1 | 67.7 | 83.5 | 19 / 35 | 4355 |
| 8 | 1 | 69.1 | 87.0 | 19 / 35 | 4960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 77 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 73% |
| gre.svman4.Leonidas 1.3.2 | 29 | 79% |
| labg.Cataclysm 2.05 | 27 | 85% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 33% |
| baal.nano.N 1.42 | 7 | 100% |
| zyx.micro.Ant 1.1 | 2 | 50% |
| sanja.First 0.1 | 2 | 100% |

Hadur died in 134 of 280 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 48 | 36% | 115 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 17% | 60 |
| gre.svman4.Leonidas 1.3.2 | 20 | 15% | 34 |
| kinsen.melee.Angsaichmophobia 1.8c | 16 | 12% | 19 |
| labg.Cataclysm 2.05 | 11 | 8% | 35 |
| zyx.micro.Ant 1.1 | 4 | 3% | 6 |
| baal.nano.N 1.42 | 3 | 2% | 6 |
| sanja.First 0.1 | 3 | 2% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 230265 melee ticks, 62525 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 61 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (275 rounds): 75690 sent, 69147 reached their opponent, 10411 virtual hits (15.1% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 457 over 8 battles (57.1 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.4 | 100 / 280 | 2.22 | 17.8% | 38984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 17.8% | 100 |
| stelo.Spread 0.9 | 2.5 | 16.3% | 84 |
| kid.Gladiator .7.2 | 2.5 | 16.6% | 65 |
| jcs.Seth 1.8 | 4.1 | 11.6% | 29 |
| tcf.Reach 3 | 5.0 | 10.2% | 2 |
| cli.Dancer 1.1 | 5.9 | 9.5% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.0 | 14 / 35 | 4671 |
| 2 | 1 | 68.6 | 87.0 | 12 / 35 | 4873 |
| 3 | 1 | 67.9 | 85.4 | 9 / 35 | 4944 |
| 4 | 1 | 68.6 | 86.7 | 16 / 35 | 4903 |
| 5 | 1 | 68.0 | 83.8 | 11 / 35 | 5005 |
| 6 | 1 | 67.9 | 85.7 | 11 / 35 | 4915 |
| 7 | 1 | 68.7 | 87.9 | 13 / 35 | 5024 |
| 8 | 1 | 68.3 | 87.9 | 14 / 35 | 4649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 83 | 51% |
| kid.Gladiator .7.2 | 83 | 47% |
| jcs.Seth 1.8 | 27 | 33% |
| tcf.Reach 3 | 7 | 86% |
| cli.Dancer 1.1 | 3 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 183 of 280 rounds, at a mean tick of 1133. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 75 | 41% | 110 |
| stelo.Spread 0.9 | 67 | 37% | 106 |
| jcs.Seth 1.8 | 23 | 13% | 32 |
| tcf.Reach 3 | 9 | 5% | 17 |
| cli.Dancer 1.1 | 2 | 1% | 6 |
| ratosh.Wesco 1.4 | 2 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 3 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 233382 melee ticks, 80514 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 47 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (274 rounds): 72521 sent, 66061 reached their opponent, 11201 virtual hits (17.0% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 995 over 8 battles (124.4 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 80.4 | 45 / 280 | 2.77 | 15.5% | 29971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.0% | 180 |
| hadur2.Hadur 3.17.1po | 2.0 | 15.5% | 45 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.5% | 37 |
| rz.HawkOnFire 0.1 | 3.9 | 12.1% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.6 | 11.5% | 13 |
| wit.Chuliath 1.0 | 6.5 | 7.0% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.9 | 6.6% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 76.2 | 5 / 35 | 3646 |
| 2 | 2 | 64.2 | 81.6 | 9 / 35 | 3500 |
| 3 | 2 | 63.7 | 78.7 | 5 / 35 | 3626 |
| 4 | 2 | 66.2 | 84.4 | 8 / 35 | 4178 |
| 5 | 2 | 63.5 | 79.4 | 2 / 35 | 3870 |
| 6 | 2 | 64.0 | 80.3 | 6 / 35 | 3697 |
| 7 | 2 | 63.9 | 81.0 | 5 / 35 | 3686 |
| 8 | 2 | 64.5 | 81.3 | 5 / 35 | 3768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 110 | 17% |
| gh.mini.Gruwel 0.9 | 27 | 33% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 55% |
| rz.HawkOnFire 0.1 | 10 | 80% |
| wit.Chuliath 1.0 | 3 | 33% |
| dans.Cinnamon 1.2 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 244 of 280 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 126 | 52% | 149 |
| gh.mini.Gruwel 0.9 | 36 | 15% | 45 |
| rz.HawkOnFire 0.1 | 31 | 13% | 37 |
| dmh.robocode.robot.BlackDeath 9.2 | 27 | 11% | 32 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 2% | 7 |
| wit.Chuliath 1.0 | 4 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
9 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 191571 melee ticks, 62695 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 38 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 2.

Targeting waves (275 rounds): 60340 sent, 53769 reached their opponent, 8666 virtual hits (16.1% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 630 over 8 battles (78.8 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.0 | 209 / 280 | 1.81 | 20.2% | 41260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.2% | 209 |
| bzdp.Pansy 2.1 | 2.6 | 12.7% | 18 |
| alpha.RainingFire 1.0 | 3.1 | 12.1% | 19 |
| bvh.micro.Freya 0.3 | 4.3 | 11.3% | 10 |
| mz.Cork 0.1 | 4.5 | 11.0% | 13 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.5% | 6 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.1% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.3% | 1 |
| dl.BetterWalls 1.0 | 8.9 | 4.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.9 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.2 | 22 / 35 | 5298 |
| 2 | 1 | 70.4 | 90.5 | 28 / 35 | 4974 |
| 3 | 1 | 71.4 | 94.0 | 28 / 35 | 5389 |
| 4 | 1 | 71.4 | 94.6 | 28 / 35 | 5340 |
| 5 | 1 | 70.6 | 92.7 | 28 / 35 | 4887 |
| 6 | 1 | 70.1 | 89.5 | 22 / 35 | 5387 |
| 7 | 1 | 69.4 | 86.3 | 26 / 35 | 4840 |
| 8 | 1 | 70.5 | 91.1 | 27 / 35 | 5145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 72 | 90% |
| bvh.micro.Freya 0.3 | 48 | 96% |
| mz.Cork 0.1 | 38 | 89% |
| alpha.RainingFire 1.0 | 32 | 94% |
| bvh.mini.Fenrir 0.39 | 15 | 100% |
| m3thos.Eva02 0.7.1 | 14 | 93% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 75 of 280 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 20 | 27% | 73 |
| alpha.RainingFire 1.0 | 16 | 21% | 49 |
| bvh.micro.Freya 0.3 | 11 | 15% | 51 |
| bvh.mini.Fenrir 0.39 | 9 | 12% | 28 |
| mz.Cork 0.1 | 8 | 11% | 41 |
| m3thos.Eva02 0.7.1 | 7 | 9% | 26 |
| dl.BetterWalls 1.0 | 0 | 0% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 193085 melee ticks, 57505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 569 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 245 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 67466 sent, 61274 reached their opponent, 13052 virtual hits (21.3% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 313 over 8 battles (39.1 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.2 | 208 / 280 | 1.88 | 19.4% | 44130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.4% | 208 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.9 | 10.6% | 10 |
| germ.TheMind .2 | 3.9 | 9.8% | 11 |
| EBBU.Sim2 1.02 | 4.3 | 9.5% | 8 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.2% | 18 |
| agrach.Dalek 1.0 | 5.6 | 9.0% | 9 |
| mb.Beast 0.1 | 7.1 | 8.4% | 4 |
| lmk.ACPFinal 0.1 | 7.5 | 8.4% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.2% | 2 |
| skm.Ryubot 1.0 | 9.3 | 7.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 88.3 | 24 / 35 | 5217 |
| 2 | 1 | 68.8 | 92.7 | 29 / 35 | 5089 |
| 3 | 1 | 67.5 | 86.0 | 22 / 35 | 5522 |
| 4 | 1 | 69.2 | 93.0 | 29 / 35 | 5401 |
| 5 | 1 | 69.6 | 94.6 | 27 / 35 | 5731 |
| 6 | 1 | 69.4 | 91.1 | 26 / 35 | 5983 |
| 7 | 1 | 66.8 | 83.2 | 22 / 35 | 5563 |
| 8 | 1 | 69.6 | 92.7 | 29 / 35 | 5624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 42 | 74% |
| com.syncleus.robocode.Dreadnaught 0.1 | 33 | 91% |
| agrach.Dalek 1.0 | 33 | 100% |
| mb.Beast 0.1 | 30 | 100% |
| germ.TheMind .2 | 26 | 96% |
| skm.Ryubot 1.0 | 23 | 100% |
| EBBU.Sim2 1.02 | 18 | 100% |
| lmk.ACPFinal 0.1 | 16 | 88% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 75% |

Hadur died in 74 of 280 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 20% | 47 |
| stelo.UntouchableNano 1.3 | 15 | 20% | 45 |
| agrach.Dalek 1.0 | 11 | 15% | 52 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 15% | 18 |
| EBBU.Sim2 1.02 | 7 | 9% | 33 |
| lmk.ACPFinal 0.1 | 5 | 7% | 30 |
| mb.Beast 0.1 | 5 | 7% | 23 |
| germ.TheMind .2 | 4 | 5% | 22 |
| skm.Ryubot 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 267 rounds): 127296 melee ticks, 33837 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (267 rounds): longest scan gap while four or more were alive 49 ticks (267 rounds over 8); rounds whose longest gap at any count was over 8: 267; robots dropped as dead without a death event: 0.

Targeting waves (267 rounds): 43401 sent, 37550 reached their opponent, 11491 virtual hits (30.6% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 599 over 8 battles (74.9 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.2 | 125 / 280 | 2.43 | 17.3% | 34759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.3 | 17.3% | 125 |
| justin.Mallais 14.0 | 1.8 | 16.1% | 84 |
| bvh.mini.Freya 0.55 | 3.1 | 12.8% | 22 |
| bts.mega.Gnarly 1.4 | 4.4 | 11.0% | 24 |
| cs.Wren 1.0 | 4.9 | 10.8% | 11 |
| kdf.KoulDestroyer 1.0 | 5.6 | 9.5% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.1 | 8.2% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.4% | 2 |
| matt.UnderDark3 2.4.34 | 8.6 | 4.6% | 1 |
| bzdp.BoxCar 2.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.8 | 16 / 35 | 4433 |
| 2 | 1 | 67.0 | 84.8 | 18 / 35 | 4343 |
| 3 | 1 | 67.3 | 86.0 | 17 / 35 | 4505 |
| 4 | 2 | 66.6 | 84.1 | 15 / 35 | 4277 |
| 5 | 1 | 67.1 | 85.4 | 16 / 35 | 4313 |
| 6 | 1 | 68.0 | 87.6 | 17 / 35 | 4490 |
| 7 | 1 | 66.2 | 81.6 | 15 / 35 | 4280 |
| 8 | 2 | 64.7 | 79.0 | 11 / 35 | 4118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 81 | 64% |
| cs.Wren 1.0 | 30 | 87% |
| bts.mega.Gnarly 1.4 | 29 | 55% |
| bvh.mini.Freya 0.55 | 23 | 70% |
| kdf.KoulDestroyer 1.0 | 10 | 70% |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 71% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |

Hadur died in 159 of 280 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 58 | 36% | 107 |
| bts.mega.Gnarly 1.4 | 30 | 19% | 53 |
| bvh.mini.Freya 0.55 | 29 | 18% | 34 |
| cs.Wren 1.0 | 16 | 10% | 40 |
| kdf.KoulDestroyer 1.0 | 9 | 6% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 4% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 10 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 4 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 183981 melee ticks, 46822 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 54 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 0.

Targeting waves (274 rounds): 62044 sent, 55338 reached their opponent, 11762 virtual hits (21.3% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 711 over 8 battles (88.9 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.5 | 127 / 280 | 2.30 | 17.8% | 38582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.1 | 17.8% | 127 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 34 |
| az.Ololobot 0.2.4 | 3.0 | 13.0% | 68 |
| catcat20.Lambda 0.024 | 3.9 | 11.7% | 39 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.7% | 3 |
| gimp.GimpBot 0.1 | 6.5 | 8.1% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.6 | 7.8% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.9 | 6.8% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.6 | 5.9% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.6 | 17 / 35 | 4708 |
| 2 | 1 | 66.7 | 84.1 | 15 / 35 | 4833 |
| 3 | 1 | 67.2 | 88.3 | 15 / 35 | 4693 |
| 4 | 1 | 67.3 | 85.4 | 16 / 35 | 4980 |
| 5 | 1 | 68.3 | 87.9 | 20 / 35 | 5042 |
| 6 | 2 | 63.8 | 77.5 | 10 / 35 | 4305 |
| 7 | 1 | 66.5 | 83.5 | 15 / 35 | 4807 |
| 8 | 1 | 69.1 | 89.8 | 19 / 35 | 5214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 63 | 49% |
| bvh.fry.Freya 0.82 | 59 | 81% |
| catcat20.Lambda 0.024 | 46 | 65% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 83% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 159 of 280 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 49 | 31% | 89 |
| az.Ololobot 0.2.4 | 48 | 30% | 79 |
| catcat20.Lambda 0.024 | 35 | 22% | 62 |
| winamp32.micro.MicroMacro 1.0 | 8 | 5% | 12 |
| apollokidd.ApolloKidd 0.9 | 6 | 4% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 3% | 13 |
| gimp.GimpBot 0.1 | 1 | 1% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 274 rounds): 217998 melee ticks, 66244 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (274 rounds): longest scan gap while four or more were alive 51 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 3.

Targeting waves (274 rounds): 69919 sent, 63435 reached their opponent, 11197 virtual hits (17.7% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 368 over 8 battles (46.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.1 | 142 / 280 | 2.34 | 18.2% | 36618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.2% | 142 |
| kawigi.mini.Coriantumr 1.1 | 2.1 | 14.5% | 46 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.2% | 38 |
| mz.AntiGrav 1.0 | 4.4 | 11.0% | 12 |
| Polkwane.SmashMelee 1.0 | 4.6 | 10.9% | 17 |
| stelo.Randomness 1.0 | 6.4 | 9.5% | 17 |
| alpha.BlackIce 1.0 | 6.5 | 9.2% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.3% | 2 |
| sample.Corners 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.2 | 16 / 35 | 4807 |
| 2 | 1 | 68.2 | 85.1 | 18 / 35 | 4657 |
| 3 | 1 | 67.6 | 84.1 | 19 / 35 | 4447 |
| 4 | 1 | 68.1 | 85.4 | 20 / 35 | 4384 |
| 5 | 1 | 66.3 | 81.6 | 14 / 35 | 4389 |
| 6 | 1 | 67.8 | 83.8 | 17 / 35 | 4603 |
| 7 | 1 | 69.2 | 90.8 | 20 / 35 | 4424 |
| 8 | 1 | 69.1 | 87.6 | 18 / 35 | 4907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 58 | 72% |
| kano.gamma.KanoGamma 1.8 | 55 | 69% |
| mz.AntiGrav 1.0 | 30 | 83% |
| Polkwane.SmashMelee 1.0 | 23 | 91% |
| stelo.Randomness 1.0 | 16 | 50% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 141 of 280 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kano.gamma.KanoGamma 1.8 | 40 | 28% | 79 |
| kawigi.mini.Coriantumr 1.1 | 39 | 28% | 75 |
| mz.AntiGrav 1.0 | 21 | 15% | 45 |
| stelo.Randomness 1.0 | 17 | 12% | 31 |
| Polkwane.SmashMelee 1.0 | 12 | 9% | 19 |
| alpha.BlackIce 1.0 | 8 | 6% | 19 |
| amk.superstrike.SuperStrike 0.3 | 2 | 1% | 7 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 268 rounds): 196626 melee ticks, 44548 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (268 rounds): longest scan gap while four or more were alive 67 ticks (268 rounds over 8); rounds whose longest gap at any count was over 8: 268; robots dropped as dead without a death event: 0.

Targeting waves (268 rounds): 65784 sent, 59291 reached their opponent, 12204 virtual hits (20.6% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 558 over 8 battles (69.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.5 | 143 / 280 | 2.13 | 18.1% | 34010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 18.1% | 143 |
| eem.EvBotNG v12.8 | 2.0 | 16.1% | 100 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 10 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.5% | 17 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.8% | 6 |
| shrub.Silver v048 | 5.9 | 9.3% | 3 |
| zyx.nano.Ant 1.1 | 6.9 | 7.5% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.5% | 0 |
| jsal.Jsalbot 1.0 | 8.8 | 5.1% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.7 | 15 / 35 | 4150 |
| 2 | 1 | 67.8 | 86.7 | 17 / 35 | 4155 |
| 3 | 1 | 68.4 | 87.6 | 19 / 35 | 4212 |
| 4 | 1 | 66.4 | 82.9 | 14 / 35 | 4286 |
| 5 | 1 | 68.7 | 89.8 | 19 / 35 | 4212 |
| 6 | 1 | 68.0 | 86.0 | 19 / 35 | 4190 |
| 7 | 1 | 69.5 | 91.7 | 21 / 35 | 4631 |
| 8 | 1 | 68.9 | 89.5 | 19 / 35 | 4174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 104 | 48% |
| lessonz.robocode.Oz 0.5.0 | 40 | 90% |
| ary.Swarm 1.1 | 38 | 84% |
| simonton.nano.MeleeSeed 1.8 | 19 | 89% |
| shrub.Silver v048 | 5 | 60% |
| stelo.Mirror 1.1 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 142 of 280 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 70 | 49% | 124 |
| lessonz.robocode.Oz 0.5.0 | 26 | 18% | 52 |
| ary.Swarm 1.1 | 20 | 14% | 40 |
| simonton.nano.MeleeSeed 1.8 | 10 | 7% | 31 |
| shrub.Silver v048 | 7 | 5% | 15 |
| zyx.nano.Ant 1.1 | 3 | 2% | 5 |
| stelo.Mirror 1.1 | 2 | 1% | 8 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 204019 melee ticks, 67420 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 703 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 365 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 1.

Targeting waves (272 rounds): 67698 sent, 61224 reached their opponent, 9671 virtual hits (15.8% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 668 over 8 battles (83.5 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.1 | 175 / 280 | 1.80 | 19.8% | 44351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.8% | 175 |
| wompi.Wallaby 5.1 | 2.0 | 15.4% | 50 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 20 |
| ara.Shera 0.88 | 3.8 | 12.8% | 32 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 2 |
| maribo.IotaCT 1.1 | 6.9 | 6.6% | 0 |
| dsw.StaticD 1.0 | 6.9 | 6.5% | 1 |
| stelo.MirrorMicro 1.0 | 8.1 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.3 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.9 | 17 / 35 | 5335 |
| 2 | 1 | 70.0 | 91.1 | 24 / 35 | 5500 |
| 3 | 1 | 71.9 | 95.9 | 29 / 35 | 5828 |
| 4 | 1 | 69.2 | 89.2 | 17 / 35 | 5342 |
| 5 | 1 | 69.3 | 89.8 | 20 / 35 | 5148 |
| 6 | 1 | 71.4 | 93.7 | 26 / 35 | 5960 |
| 7 | 1 | 70.6 | 92.4 | 24 / 35 | 5688 |
| 8 | 1 | 69.3 | 87.9 | 18 / 35 | 5550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 119 | 83% |
| maribo.mini.MiniQuester 0.1 | 51 | 90% |
| ara.Shera 0.88 | 29 | 59% |
| dsw.StaticD 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 110 of 280 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 36% | 131 |
| ara.Shera 0.88 | 40 | 36% | 60 |
| maribo.mini.MiniQuester 0.1 | 18 | 16% | 57 |
| amz.NanoClone 1.41 | 6 | 5% | 10 |
| dsw.StaticD 1.0 | 1 | 1% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 3 |
| maribo.IotaCT 1.1 | 0 | 0% | 3 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 217055 melee ticks, 62825 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 25 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 0.

Targeting waves (272 rounds): 70352 sent, 64048 reached their opponent, 12826 virtual hits (20.0% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 679 over 8 battles (84.9 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.9 | 44 / 280 | 2.90 | 15.4% | 30623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 196 |
| hadur2.Hadur 3.17.1po | 2.1 | 15.4% | 44 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.8% | 33 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.9% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.1 | 10.4% | 1 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.0% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.5% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 82.5 | 6 / 35 | 3924 |
| 2 | 2 | 66.1 | 81.0 | 7 / 35 | 4105 |
| 3 | 2 | 64.9 | 77.8 | 5 / 35 | 3620 |
| 4 | 2 | 64.2 | 77.5 | 3 / 35 | 3433 |
| 5 | 2 | 65.4 | 79.7 | 8 / 35 | 3776 |
| 6 | 3 | 63.5 | 74.3 | 3 / 35 | 3672 |
| 7 | 2 | 66.5 | 81.3 | 6 / 35 | 4166 |
| 8 | 2 | 65.3 | 77.1 | 6 / 35 | 3927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 102 | 17% |
| brainfade.melee.Dusk 0.44 | 23 | 52% |
| dummy.micro.Sparrow 2.5 | 9 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |
| Krabb.akim2.Akim2 1.1b | 4 | 50% |
| mz.NanoGod 2.02 | 2 | 100% |

Hadur died in 246 of 280 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 143 | 58% | 163 |
| brainfade.melee.Dusk 0.44 | 33 | 13% | 43 |
| dummy.micro.Sparrow 2.5 | 30 | 12% | 35 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 5% | 17 |
| Krabb.akim2.Akim2 1.1b | 9 | 4% | 11 |
| mz.NanoGod 2.02 | 9 | 4% | 10 |
| jab.DiamondStealer 5 | 0 | 0% | 1 |
9 death(s) with no robot to name.

Posture (Hadur's M records, 278 rounds): 213277 melee ticks, 63459 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (278 rounds): longest scan gap while four or more were alive 38 ticks (278 rounds over 8); rounds whose longest gap at any count was over 8: 278; robots dropped as dead without a death event: 1.

Targeting waves (278 rounds): 69178 sent, 62348 reached their opponent, 10599 virtual hits (17.0% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 280 over 8 battles (35.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.1 | 179 / 280 | 1.80 | 20.2% | 45009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 20.2% | 179 |
| stelo.Liblix 0.3.1 | 2.1 | 15.5% | 68 |
| tzu.TheArtOfWar 1.2 | 2.9 | 14.3% | 22 |
| jwirde.Gort 2.0 | 4.5 | 9.6% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.6 | 9.6% | 1 |
| wompi.Quokka 1.6 | 6.3 | 7.5% | 2 |
| disan.Chair 2.2.0 | 6.6 | 7.7% | 0 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.4% | 0 |
| sample.Crazy 1.0 | 9.4 | 4.6% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.5 | 22 / 35 | 5774 |
| 2 | 1 | 70.9 | 92.7 | 22 / 35 | 5545 |
| 3 | 1 | 70.0 | 90.2 | 23 / 35 | 5421 |
| 4 | 1 | 70.7 | 90.8 | 23 / 35 | 5717 |
| 5 | 1 | 71.6 | 92.7 | 24 / 35 | 5995 |
| 6 | 1 | 69.6 | 89.2 | 18 / 35 | 5431 |
| 7 | 1 | 70.1 | 88.9 | 21 / 35 | 5442 |
| 8 | 1 | 71.5 | 94.6 | 26 / 35 | 5684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 88 | 61% |
| tzu.TheArtOfWar 1.2 | 87 | 92% |
| jwirde.Gort 2.0 | 17 | 94% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 14 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |
| wompi.Quokka 1.6 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 102 of 280 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 59 | 58% | 130 |
| tzu.TheArtOfWar 1.2 | 22 | 22% | 82 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 9% | 25 |
| jwirde.Gort 2.0 | 5 | 5% | 27 |
| disan.Chair 2.2.0 | 3 | 3% | 5 |
| wompi.Quokka 1.6 | 2 | 2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 272 rounds): 209945 melee ticks, 53810 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (272 rounds): longest scan gap while four or more were alive 41 ticks (272 rounds over 8); rounds whose longest gap at any count was over 8: 272; robots dropped as dead without a death event: 2.

Targeting waves (272 rounds): 72285 sent, 66076 reached their opponent, 14304 virtual hits (21.6% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 844 over 8 battles (105.5 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.8 | 136 / 280 | 2.19 | 19.5% | 44617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1po | 1.0 | 19.5% | 136 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.2% | 110 |
| jje.BagPuss 1.2 | 2.8 | 12.2% | 12 |
| sul.Lunar 1.1 | 4.5 | 10.8% | 13 |
| myl.nano.Graviton 1.10 | 4.8 | 10.6% | 3 |
| fm.claire 1.7 | 6.4 | 9.0% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.3% | 2 |
| hvilela.HVilela 0.9 | 7.1 | 7.8% | 1 |
| wit.Deep7 2.0 | 9.3 | 5.5% | 3 |
| abud.ThirdRobo 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.4 | 14 / 35 | 5711 |
| 2 | 1 | 69.4 | 88.6 | 17 / 35 | 5523 |
| 3 | 1 | 70.3 | 90.5 | 16 / 35 | 5919 |
| 4 | 1 | 69.9 | 86.7 | 19 / 35 | 5787 |
| 5 | 1 | 68.6 | 83.8 | 20 / 35 | 5359 |
| 6 | 1 | 67.8 | 83.8 | 17 / 35 | 5080 |
| 7 | 1 | 70.1 | 88.3 | 21 / 35 | 5613 |
| 8 | 1 | 68.8 | 87.3 | 12 / 35 | 5625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 114 | 49% |
| jje.BagPuss 1.2 | 29 | 72% |
| sul.Lunar 1.1 | 20 | 95% |
| myl.nano.Graviton 1.10 | 19 | 95% |
| wit.Deep7 2.0 | 10 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 100% |
| fm.claire 1.7 | 2 | 50% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 152 of 280 rounds, at a mean tick of 1518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 63 | 41% | 0 |
| jje.BagPuss 1.2 | 31 | 20% | 88 |
| sul.Lunar 1.1 | 15 | 10% | 70 |
| myl.nano.Graviton 1.10 | 13 | 9% | 44 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 5% | 25 |
| fm.claire 1.7 | 8 | 5% | 23 |
| hvilela.HVilela 0.9 | 4 | 3% | 16 |
| wit.Deep7 2.0 | 3 | 2% | 13 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 275 rounds): 262538 melee ticks, 131108 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (275 rounds): longest scan gap while four or more were alive 49 ticks (274 rounds over 8); rounds whose longest gap at any count was over 8: 274; robots dropped as dead without a death event: 1.

Targeting waves (275 rounds): 81228 sent, 74997 reached their opponent, 11564 virtual hits (15.4% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1po against 9 opponents at once, 35 rounds per battle, 8 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 8. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 760 over 8 battles (95.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 8 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.0 | 75 / 280 | 2.53 | 16.4% | 33746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.1% | 84 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.4% | 101 |
| hadur2.Hadur 3.17.1po | 2.5 | 16.4% | 75 |
| mz.MicroSheep 1.0 | 4.3 | 10.3% | 3 |
| cx.Princess 1.0 | 5.1 | 9.7% | 10 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.3% | 6 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.6% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.1 | 82.2 | 10 / 35 | 4398 |
| 2 | 2 | 65.4 | 81.6 | 10 / 35 | 4096 |
| 3 | 2 | 66.2 | 84.4 | 12 / 35 | 4106 |
| 4 | 3 | 65.4 | 81.6 | 7 / 35 | 4522 |
| 5 | 3 | 66.2 | 84.1 | 11 / 35 | 4102 |
| 6 | 2 | 65.7 | 82.9 | 7 / 35 | 4419 |
| 7 | 3 | 64.4 | 79.7 | 6 / 35 | 3991 |
| 8 | 2 | 67.1 | 87.6 | 12 / 35 | 4112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 91 | 58% |
| rsalesc.melee.Medina 0.4.5 | 43 | 21% |
| cx.Princess 1.0 | 11 | 64% |
| mz.MicroSheep 1.0 | 6 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 0% |

Hadur died in 211 of 280 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 85 | 40% | 136 |
| rsalesc.melee.Medina 0.4.5 | 69 | 33% | 81 |
| cx.Princess 1.0 | 13 | 6% | 16 |
| sadoner.killer 0.2 | 12 | 6% | 13 |
| arthord.NanoSatanMelee Beta | 12 | 6% | 13 |
| mz.MicroSheep 1.0 | 11 | 5% | 18 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |
| kurios.DOSexe .9a | 1 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 276 rounds): 214512 melee ticks, 59490 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 481 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (276 rounds): longest scan gap while four or more were alive 227 ticks (275 rounds over 8); rounds whose longest gap at any count was over 8: 275; robots dropped as dead without a death event: 0.

Targeting waves (276 rounds): 62371 sent, 55770 reached their opponent, 8861 virtual hits (15.9% of those reached).

