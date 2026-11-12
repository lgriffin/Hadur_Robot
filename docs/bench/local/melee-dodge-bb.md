# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490500. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.7 | 56 / 210 | 2.20 | 18.0% | 33655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 140 |
| hadur117.Hadur 3.21bb | 2.0 | 18.0% | 56 |
| sgp.JollyNinja 3.53 | 3.5 | 11.1% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.1% | 2 |
| lorneswork.Predator 1.0 | 5.3 | 9.5% | 2 |
| mz.MicroGodMelee 1 | 5.3 | 10.2% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 85.4 | 8 / 35 | 5196 |
| 2 | 2 | 67.4 | 84.1 | 4 / 35 | 5788 |
| 3 | 2 | 69.0 | 87.6 | 11 / 35 | 5659 |
| 4 | 2 | 68.8 | 85.7 | 9 / 35 | 5885 |
| 5 | 2 | 69.5 | 90.5 | 13 / 35 | 5582 |
| 6 | 2 | 68.1 | 87.0 | 11 / 35 | 5545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 123 | 11% |
| sgp.JollyNinja 3.53 | 22 | 73% |
| mz.MicroGodMelee 1 | 11 | 91% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 91% |
| lorneswork.Predator 1.0 | 6 | 83% |
| adt.Ar2 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 1218. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 76% | 138 |
| sgp.JollyNinja 3.53 | 12 | 8% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 14 |
| lorneswork.Predator 1.0 | 8 | 5% | 13 |
| mz.MicroGodMelee 1 | 5 | 3% | 15 |
| adt.Ar2 1.0 | 2 | 1% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 138424 melee ticks, 95005 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43392 sent, 38362 reached their opponent, 7387 virtual hits (19.3% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1501850. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 191 over 6 battles (31.8 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.3 | 94 / 210 | 2.32 | 18.7% | 31696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.7% | 94 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 14.2% | 35 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.3% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.1% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.3% | 18 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 7.8% | 1 |
| Noran.BitchingElk 0.054 | 7.0 | 7.8% | 11 |
| sch.Simone 0.3d | 7.3 | 7.1% | 2 |
| stelo.PatternRobot 1.0 | 9.0 | 5.2% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.2 | 16 / 35 | 5182 |
| 2 | 1 | 69.4 | 85.7 | 14 / 35 | 5651 |
| 3 | 1 | 67.7 | 83.8 | 14 / 35 | 5043 |
| 4 | 1 | 68.2 | 85.1 | 18 / 35 | 5015 |
| 5 | 1 | 68.7 | 86.3 | 15 / 35 | 5324 |
| 6 | 1 | 69.6 | 87.6 | 17 / 35 | 5481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 53% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 64% |
| com.cohesiva.robocode.ManOwaR 1.0 | 27 | 59% |
| Noran.BitchingElk 0.054 | 13 | 62% |
| sch.Simone 0.3d | 8 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 34 | 29% | 66 |
| pulsar.PulsarMax 0.8.9 | 31 | 27% | 53 |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 16% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 10% | 15 |
| Noran.BitchingElk 0.054 | 7 | 6% | 14 |
| sch.Simone 0.3d | 6 | 5% | 11 |
| fnc.bandit.Bandit 5.2.0 | 4 | 3% | 7 |
| fullsail.SweetTea 1.1 | 2 | 2% | 5 |
| stelo.PatternRobot 1.0 | 2 | 2% | 5 |

Posture (Hadur's M records, 200 rounds): 164612 melee ticks, 41521 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 53 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 57097 sent, 52204 reached their opponent, 8504 virtual hits (16.3% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1497993. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 166 over 6 battles (27.7 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.7 | 169 / 210 | 1.57 | 21.3% | 40731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.3% | 169 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.2% | 14 |
| radnor.DoctorBob 1.42 | 2.8 | 13.3% | 12 |
| vuen.Cake 2.51 | 3.3 | 12.9% | 15 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 0 |
| adt.Ar1 2.1 | 6.2 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.2 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.2 | 27 / 35 | 6726 |
| 2 | 1 | 70.9 | 91.4 | 28 / 35 | 6283 |
| 3 | 1 | 72.0 | 94.3 | 29 / 35 | 6892 |
| 4 | 1 | 72.5 | 95.9 | 30 / 35 | 7043 |
| 5 | 1 | 72.4 | 96.2 | 30 / 35 | 6752 |
| 6 | 1 | 72.0 | 94.3 | 25 / 35 | 7035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 84 | 92% |
| radnor.DoctorBob 1.42 | 44 | 98% |
| kawigi.nano.Lib 1.0 | 42 | 93% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 12 | 29% | 88 |
| radnor.DoctorBob 1.42 | 11 | 27% | 58 |
| kawigi.nano.Lib 1.0 | 5 | 12% | 34 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 12% | 6 |
| oa.weak.FlyMk1 0.1 | 3 | 7% | 7 |
| urdos.URDOS 1.3 | 2 | 5% | 6 |
| adt.Ar1 2.1 | 2 | 5% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 128949 melee ticks, 45280 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 38024 sent, 33121 reached their opponent, 7998 virtual hits (24.1% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1498900. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 117 over 6 battles (19.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.1 | 40 / 210 | 2.16 | 18.3% | 35897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.1% | 162 |
| hadur117.Hadur 3.21bb | 2.0 | 18.3% | 40 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 4 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.0% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.9% | 0 |
| tj.zombie1n 1.0.1 | 7.2 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.2% | 1 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.9 | 88.9 | 8 / 35 | 6256 |
| 2 | 2 | 68.9 | 87.3 | 4 / 35 | 6069 |
| 3 | 2 | 68.3 | 84.8 | 3 / 35 | 5565 |
| 4 | 2 | 69.7 | 87.9 | 10 / 35 | 6114 |
| 5 | 2 | 69.9 | 87.6 | 8 / 35 | 6111 |
| 6 | 2 | 69.0 | 86.3 | 7 / 35 | 5782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 12% |
| apc.LeeroyJenkins2 1.0 | 14 | 86% |
| TNT.TNT 0.99.1 | 10 | 80% |
| josago.Jorgito 0.16 | 2 | 100% |
| css.Delitioner 0.11 | 2 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 1303. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 131 | 77% | 148 |
| apc.LeeroyJenkins2 1.0 | 18 | 11% | 29 |
| TNT.TNT 0.99.1 | 10 | 6% | 18 |
| josago.Jorgito 0.16 | 8 | 5% | 10 |
| css.Delitioner 0.11 | 3 | 2% | 5 |

Posture (Hadur's M records, 198 rounds): 184031 melee ticks, 75344 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 62 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 55408 sent, 50518 reached their opponent, 7160 virtual hits (14.2% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1499383. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 142 over 6 battles (23.7 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.1 | 42 / 210 | 2.88 | 15.8% | 25967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 17.6% | 94 |
| justin.DemonicRage 3.4 | 2.0 | 16.4% | 47 |
| hadur117.Hadur 3.21bb | 3.0 | 15.8% | 42 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 15 |
| ms.Ares 0.19 | 5.2 | 9.6% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 9.1% | 10 |
| supersample.SuperBoxBot 1.0 | 7.7 | 5.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 80.3 | 5 / 35 | 3998 |
| 2 | 3 | 65.4 | 80.0 | 10 / 35 | 4219 |
| 3 | 3 | 64.4 | 76.2 | 6 / 35 | 4414 |
| 4 | 3 | 64.6 | 76.8 | 7 / 35 | 4227 |
| 5 | 3 | 66.4 | 82.2 | 7 / 35 | 4656 |
| 6 | 3 | 65.6 | 79.0 | 7 / 35 | 4453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 44 | 41% |
| cb.fire.Firestarter 2.0f | 37 | 11% |
| wompi.Numbat 2.1 | 20 | 75% |
| ms.Ares 0.19 | 4 | 75% |
| axeBots.HataMoto 3.09 | 4 | 50% |

Hadur died in 168 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 55 | 33% | 72 |
| cb.fire.Firestarter 2.0f | 54 | 32% | 62 |
| wompi.Numbat 2.1 | 30 | 18% | 40 |
| axeBots.HataMoto 3.09 | 11 | 7% | 14 |
| ms.Ares 0.19 | 11 | 7% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 147691 melee ticks, 43837 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 67 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 45033 sent, 39894 reached their opponent, 6261 virtual hits (15.7% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492854. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 163 over 6 battles (27.2 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.7 | 148 / 210 | 1.57 | 21.0% | 35239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.0% | 148 |
| jekl.StoneGhost 0.7 | 2.3 | 14.4% | 18 |
| origin.SleepSiphon 1.7b | 3.0 | 13.0% | 29 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.2% | 11 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 3 |
| gg.Wolverine 2.0 | 6.0 | 8.6% | 2 |
| DBall.NUKE 0.1 | 8.0 | 5.9% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 6.0% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.7 | 22 / 35 | 5760 |
| 2 | 1 | 71.9 | 94.0 | 25 / 35 | 5878 |
| 3 | 1 | 72.2 | 94.6 | 26 / 35 | 6371 |
| 4 | 1 | 71.8 | 93.0 | 27 / 35 | 5975 |
| 5 | 1 | 71.9 | 94.6 | 25 / 35 | 5681 |
| 6 | 1 | 71.1 | 93.0 | 23 / 35 | 5574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 65 | 89% |
| origin.SleepSiphon 1.7b | 44 | 75% |
| pe.minimelee.SandboxMiniMelee 1.1 | 39 | 85% |
| gg.Wolverine 2.0 | 14 | 93% |
| mld.Wisdom 1.0 | 10 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 24 | 37% | 61 |
| jekl.StoneGhost 0.7 | 15 | 23% | 64 |
| pe.minimelee.SandboxMiniMelee 1.1 | 13 | 20% | 48 |
| mld.Wisdom 1.0 | 5 | 8% | 14 |
| gg.Wolverine 2.0 | 3 | 5% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 4 |
| spinnercat.Omen 1.0 | 1 | 2% | 4 |
| DBall.NUKE 0.1 | 1 | 2% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 147462 melee ticks, 44596 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 28 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 28 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44345 sent, 39598 reached their opponent, 8175 virtual hits (20.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1495788. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 101 over 6 battles (16.8 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.5 | 95.7 | 157 / 210 | 1.34 | 26.1% | 47561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 26.1% | 157 |
| rtk.Tachikoma 1.0 | 2.0 | 18.4% | 23 |
| franzor.Lizt 1.3.1 | 3.5 | 12.8% | 19 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.9% | 11 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.7% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.1% | 0 |
| drd.Dreadknoght 0.9 | 8.3 | 2.3% | 0 |
| sample.Target 1.0 | 8.7 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 76.1 | 97.5 | 29 / 35 | 8074 |
| 2 | 1 | 74.8 | 94.3 | 23 / 35 | 7903 |
| 3 | 1 | 75.1 | 94.3 | 27 / 35 | 7644 |
| 4 | 1 | 76.3 | 97.1 | 29 / 35 | 8193 |
| 5 | 1 | 75.1 | 95.7 | 24 / 35 | 7823 |
| 6 | 1 | 75.3 | 95.4 | 25 / 35 | 7924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 109 | 82% |
| franzor.Lizt 1.3.1 | 47 | 74% |
| oog.melee.CapuletDroid 1.1 | 38 | 84% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 1654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 27 | 51% | 133 |
| franzor.Lizt 1.3.1 | 16 | 30% | 2 |
| oog.melee.CapuletDroid 1.1 | 9 | 17% | 56 |
| exauge.GateKeeper 1.1.121g | 1 | 2% | 12 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 193745 melee ticks, 93694 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 26 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 52449 sent, 48264 reached their opponent, 9653 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1511135. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 6 battles (51.5 per battle, most in one battle 71). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.7 | 145 / 210 | 1.58 | 22.7% | 32101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.7% | 145 |
| tm.Yuugao 1.0 | 2.5 | 14.5% | 26 |
| shrub.Vapour v159 | 2.5 | 14.5% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 11.4% | 11 |
| m3thos.Eva00 1.1 | 5.2 | 9.7% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 5.5 | 9.2% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.0 | 7.0% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 5.4% | 0 |
| SHAM.WOW 1.4 | 8.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.0 | 20 / 35 | 4849 |
| 2 | 1 | 71.6 | 94.6 | 25 / 35 | 5474 |
| 3 | 1 | 71.2 | 92.9 | 21 / 35 | 5621 |
| 4 | 1 | 71.4 | 93.2 | 26 / 35 | 5330 |
| 5 | 1 | 70.7 | 91.4 | 26 / 35 | 5414 |
| 6 | 1 | 71.6 | 94.3 | 27 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 67 | 73% |
| shrub.Vapour v159 | 57 | 67% |
| com.spp.robocode.MostlyHarmless 010 | 33 | 88% |
| m3thos.Eva00 1.1 | 12 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 90% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 27 | 41% | 60 |
| tm.Yuugao 1.0 | 22 | 33% | 74 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 17% | 35 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 5% | 19 |
| m3thos.Eva00 1.1 | 1 | 2% | 10 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 6 |

Posture (Hadur's M records, 200 rounds): 145400 melee ticks, 48543 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 63 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43112 sent, 38655 reached their opponent, 6771 virtual hits (17.5% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1505249. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 158 over 6 battles (26.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.6 | 62 / 210 | 2.83 | 16.2% | 23617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.8% | 90 |
| hadur117.Hadur 3.21bb | 1.7 | 16.2% | 62 |
| kc.micro.Figment 1.0 | 3.0 | 14.2% | 27 |
| yagami.Tidus 0.11 | 4.5 | 11.1% | 0 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.3% | 17 |
| mc2.enemy.Original 0.9 | 5.7 | 9.5% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.3% | 2 |
| step.nanoPri 1.0 | 8.2 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.7% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 75.6 | 10 / 35 | 3905 |
| 2 | 1 | 63.9 | 78.4 | 8 / 35 | 3780 |
| 3 | 2 | 65.1 | 80.6 | 9 / 35 | 3781 |
| 4 | 2 | 65.4 | 80.0 | 12 / 35 | 3899 |
| 5 | 1 | 66.9 | 85.7 | 12 / 35 | 4230 |
| 6 | 2 | 65.3 | 77.5 | 11 / 35 | 4022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 28% |
| kc.micro.Figment 1.0 | 38 | 71% |
| pedersen.Grishnakh 1.0 | 15 | 53% |
| yagami.Tidus 0.11 | 8 | 100% |
| mc2.enemy.Original 0.9 | 8 | 13% |
| dft.Calliope 5.6 | 3 | 100% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 61 | 41% | 77 |
| kc.micro.Figment 1.0 | 28 | 19% | 53 |
| mc2.enemy.Original 0.9 | 17 | 11% | 20 |
| pedersen.Grishnakh 1.0 | 16 | 11% | 19 |
| yagami.Tidus 0.11 | 13 | 9% | 24 |
| dft.Calliope 5.6 | 4 | 3% | 7 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 145210 melee ticks, 40858 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46795 sent, 42054 reached their opponent, 5613 virtual hits (13.3% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493570. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 6 battles (33.8 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.4 | 169 / 210 | 1.41 | 21.2% | 36414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.2% | 169 |
| DTF.Kludgy 1.2b | 2.5 | 13.8% | 18 |
| ne.Chimera 1.2 | 3.2 | 13.3% | 6 |
| ejb.Polaris 1.0.1 | 3.3 | 12.8% | 8 |
| tvv.micro.Antares 1.1.1 | 5.3 | 9.8% | 3 |
| vStar.RAFzilla 2.15 | 5.7 | 9.1% | 5 |
| sam.Samspin 1.0 | 7.7 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.7% | 1 |
| kurios.DOSexe .9b | 8.8 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 95.6 | 31 / 35 | 6344 |
| 2 | 1 | 72.0 | 94.9 | 28 / 35 | 6220 |
| 3 | 1 | 72.1 | 96.2 | 27 / 35 | 6044 |
| 4 | 1 | 72.4 | 95.9 | 29 / 35 | 6287 |
| 5 | 1 | 71.1 | 95.6 | 27 / 35 | 5509 |
| 6 | 1 | 71.2 | 94.3 | 27 / 35 | 6010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 68 | 85% |
| ejb.Polaris 1.0.1 | 49 | 92% |
| ne.Chimera 1.2 | 42 | 93% |
| tvv.micro.Antares 1.1.1 | 13 | 92% |
| vStar.RAFzilla 2.15 | 6 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 50% |

Hadur died in 41 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 37% | 66 |
| ne.Chimera 1.2 | 11 | 27% | 39 |
| ejb.Polaris 1.0.1 | 9 | 22% | 62 |
| vStar.RAFzilla 2.15 | 3 | 7% | 12 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 11 |
| sam.Samspin 1.0 | 1 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 9 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 139050 melee ticks, 57658 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 91 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 91 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44530 sent, 39679 reached their opponent, 6907 virtual hits (17.4% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1495239. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.3 | 68 / 210 | 2.87 | 16.1% | 24064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.6% | 81 |
| hadur117.Hadur 3.21bb | 1.7 | 16.1% | 68 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.7% | 20 |
| djc.DynaBot 0.1.1 | 4.0 | 10.9% | 10 |
| br2.MobyDickBot 1.6 | 5.5 | 8.9% | 13 |
| rdt199.Warlord 0.73 | 6.2 | 8.9% | 10 |
| uji.YellohFellah 1.0 | 6.7 | 8.4% | 8 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.4% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 81.0 | 14 / 35 | 4038 |
| 2 | 2 | 64.3 | 78.4 | 11 / 35 | 4002 |
| 3 | 2 | 64.0 | 76.5 | 12 / 35 | 4016 |
| 4 | 2 | 64.9 | 81.0 | 9 / 35 | 4104 |
| 5 | 2 | 63.6 | 76.8 | 12 / 35 | 3734 |
| 6 | 1 | 65.6 | 81.9 | 10 / 35 | 4170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 53 | 43% |
| cx.mini.Nimrod 0.55 | 21 | 62% |
| djc.DynaBot 0.1.1 | 11 | 91% |
| rdt199.Warlord 0.73 | 11 | 82% |
| br2.MobyDickBot 1.6 | 11 | 27% |
| uji.YellohFellah 1.0 | 11 | 91% |

Hadur died in 143 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 55 | 38% | 79 |
| cx.mini.Nimrod 0.55 | 30 | 21% | 38 |
| rdt199.Warlord 0.73 | 16 | 11% | 25 |
| djc.DynaBot 0.1.1 | 14 | 10% | 24 |
| br2.MobyDickBot 1.6 | 12 | 8% | 15 |
| uji.YellohFellah 1.0 | 10 | 7% | 19 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 2 |
| stelo.MirrorNano 1.3 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 153840 melee ticks, 35818 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 38 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 48599 sent, 43748 reached their opponent, 5800 virtual hits (13.3% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1503934. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.9 | 134 / 210 | 2.09 | 19.1% | 27482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.1% | 134 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.7% | 31 |
| nat.PallasHawk 1.0 | 2.8 | 13.1% | 22 |
| darkcanuck.Leon 1.01 | 3.7 | 12.0% | 12 |
| brainfade.melee.Genghis 0.36 | 5.2 | 9.9% | 9 |
| jrm.Test0 1.0 | 6.0 | 8.6% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.7% | 0 |
| jp.Perpy 16.0 | 7.7 | 6.5% | 0 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.4 | 23 / 35 | 4633 |
| 2 | 1 | 68.7 | 87.0 | 21 / 35 | 4654 |
| 3 | 1 | 71.1 | 96.5 | 28 / 35 | 4731 |
| 4 | 1 | 67.2 | 84.8 | 19 / 35 | 4280 |
| 5 | 1 | 68.4 | 85.7 | 20 / 35 | 4486 |
| 6 | 1 | 69.0 | 88.3 | 23 / 35 | 4698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 46 | 87% |
| bts.wiki.RipCurl 0.9b | 43 | 77% |
| darkcanuck.Leon 1.01 | 40 | 90% |
| brainfade.melee.Genghis 0.36 | 11 | 73% |
| jrm.Test0 1.0 | 11 | 91% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 20 | 26% | 56 |
| bts.wiki.RipCurl 0.9b | 17 | 22% | 35 |
| jrm.Test0 1.0 | 13 | 17% | 17 |
| darkcanuck.Leon 1.01 | 9 | 12% | 60 |
| brainfade.melee.Genghis 0.36 | 8 | 10% | 14 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 9 |
| jp.Perpy 16.0 | 3 | 4% | 8 |
| jaybot.bots.Oddball 4.0 | 2 | 3% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |

Posture (Hadur's M records, 200 rounds): 124488 melee ticks, 39154 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 34 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 42095 sent, 37070 reached their opponent, 5939 virtual hits (16.0% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496091. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.2 | 62 / 210 | 2.78 | 16.2% | 27370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.8% | 91 |
| ags.Glacier 0.2.11 | 2.2 | 16.2% | 35 |
| hadur117.Hadur 3.21bb | 2.3 | 16.2% | 62 |
| shinh.Entangled 0.3 | 4.5 | 11.4% | 17 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.2% | 5 |
| apc.Colossus2 0.17 | 6.3 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.7 | 7.5% | 1 |
| maribo.FollowFire 1 | 8.2 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.8 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 81.3 | 7 / 35 | 4304 |
| 2 | 3 | 65.5 | 81.9 | 6 / 35 | 4494 |
| 3 | 2 | 66.5 | 81.6 | 11 / 35 | 4761 |
| 4 | 1 | 67.9 | 86.7 | 18 / 35 | 4803 |
| 5 | 3 | 62.3 | 71.4 | 8 / 35 | 4144 |
| 6 | 2 | 65.8 | 78.4 | 12 / 35 | 4864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 50 | 36% |
| ags.Glacier 0.2.11 | 42 | 76% |
| shinh.Entangled 0.3 | 11 | 45% |
| gh.micro.Gruweltje 0.7 | 6 | 83% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 54 | 36% | 72 |
| ags.Glacier 0.2.11 | 44 | 30% | 74 |
| shinh.Entangled 0.3 | 23 | 15% | 29 |
| stelo.Wang 1.0 | 10 | 7% | 12 |
| gh.micro.Gruweltje 0.7 | 7 | 5% | 13 |
| maribo.FollowFire 1 | 6 | 4% | 6 |
| apc.Colossus2 0.17 | 4 | 3% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 139527 melee ticks, 41978 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 254 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 250 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 40336 sent, 35122 reached their opponent, 5532 virtual hits (15.8% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491674. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 186 over 6 battles (31.0 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 98.2 | 196 / 210 | 1.14 | 25.0% | 39176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 25.0% | 196 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.1% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 3.7 | 11.0% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 4.3 | 10.5% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 10.1% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 9.5% | 4 |
| pa.Improved 1.0 | 8.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 99.3 | 33 / 35 | 6453 |
| 2 | 1 | 73.9 | 98.2 | 33 / 35 | 6544 |
| 3 | 1 | 73.3 | 98.6 | 31 / 35 | 6342 |
| 4 | 1 | 73.9 | 96.8 | 32 / 35 | 6784 |
| 5 | 1 | 74.4 | 99.6 | 34 / 35 | 6783 |
| 6 | 1 | 73.2 | 96.8 | 33 / 35 | 6270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 110 | 97% |
| sanyi.mikrobi.Roberto 1.0 | 33 | 97% |
| sheldor.micro.PointInLineRRAL 1.0 | 21 | 86% |
| co.edu.usb.rc.LidisTron 1.0 | 20 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 12 | 83% |
| pa.Improved 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 14 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 6 | 43% | 102 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 21% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 21% | 15 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 7% | 40 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 7 |
| pa.Improved 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 198 rounds): 122524 melee ticks, 52222 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 39 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 35572 sent, 31461 reached their opponent, 7615 virtual hits (24.2% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481128. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.1 | 133 / 210 | 1.90 | 20.0% | 33492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.0% | 133 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.1% | 7 |
| mld.DustBunny 3.8 | 3.0 | 13.1% | 11 |
| emp.Yngwie 1.11 | 3.5 | 12.8% | 41 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.7% | 4 |
| kawigi.robot.Girl 1.2 | 5.8 | 8.8% | 11 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.7% | 2 |
| lambdaxy.TBot 0.1 | 7.7 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 3.9% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.3 | 19 / 35 | 5394 |
| 2 | 1 | 70.7 | 91.1 | 25 / 35 | 5643 |
| 3 | 1 | 70.7 | 90.2 | 22 / 35 | 5766 |
| 4 | 1 | 69.2 | 86.0 | 20 / 35 | 5559 |
| 5 | 1 | 70.3 | 89.5 | 22 / 35 | 5419 |
| 6 | 1 | 71.6 | 95.2 | 25 / 35 | 5711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 59 | 64% |
| kawigi.micro.Shiz 1.1 | 44 | 95% |
| mld.DustBunny 3.8 | 31 | 87% |
| kawigi.robot.Girl 1.2 | 15 | 80% |
| cb.nano.Insomnia 1.0 | 11 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 50% |
| divineomega.TrialBot 0.003 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 44% | 88 |
| mld.DustBunny 3.8 | 12 | 16% | 38 |
| cb.nano.Insomnia 1.0 | 12 | 16% | 19 |
| kawigi.micro.Shiz 1.1 | 8 | 10% | 38 |
| kawigi.robot.Girl 1.2 | 6 | 8% | 12 |
| Grystrion.TrackerWO 1.0 | 2 | 3% | 3 |
| divineomega.TrialBot 0.003 | 1 | 1% | 5 |
| lambdaxy.TBot 0.1 | 1 | 1% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 155498 melee ticks, 53621 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50556 sent, 45663 reached their opponent, 7097 virtual hits (15.5% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1500226. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.8 | 122 / 210 | 2.00 | 20.1% | 35753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.1% | 122 |
| gh.Griezel 0.5.2 | 2.0 | 16.5% | 53 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.3% | 18 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.5% | 4 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.4% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.1% | 4 |
| asd.Cthulhu 1.3 | 8.5 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.0 | 18 / 35 | 5566 |
| 2 | 1 | 71.0 | 88.9 | 20 / 35 | 6102 |
| 3 | 1 | 69.8 | 87.9 | 19 / 35 | 5575 |
| 4 | 1 | 69.1 | 85.4 | 18 / 35 | 5553 |
| 5 | 1 | 72.6 | 93.3 | 25 / 35 | 6443 |
| 6 | 1 | 72.0 | 91.4 | 22 / 35 | 6514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 87 | 74% |
| techdude.forest.FlamingForest 1.1 | 22 | 64% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 91% |
| bvh.fnr.Fenrir 0.36l | 13 | 77% |
| tvv.nano.Polaris 1.2 | 9 | 78% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 1106. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 39 | 44% | 103 |
| techdude.forest.FlamingForest 1.1 | 16 | 18% | 38 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 13% | 31 |
| bvh.fnr.Fenrir 0.36l | 11 | 13% | 16 |
| stelo.IntrinsicVolatility 1.4 | 5 | 6% | 9 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 8 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 3 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |

Posture (Hadur's M records, 200 rounds): 173771 melee ticks, 63800 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 54639 sent, 49912 reached their opponent, 8151 virtual hits (16.3% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496557. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 196 over 6 battles (32.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.5 | 124 / 210 | 1.94 | 20.6% | 38867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.6% | 124 |
| et.Predator 1.8 | 2.5 | 13.3% | 22 |
| cx.BlestPain 1.41 | 3.0 | 12.8% | 38 |
| oog.melee.Mercutio 1.0 | 3.5 | 12.6% | 20 |
| ahf.NanoAndrew .4 | 5.3 | 9.7% | 5 |
| nic.Nicator 2.4 | 6.0 | 9.0% | 1 |
| maribo.melee.BMV 0.1 | 6.7 | 8.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 6.0% | 0 |
| tex.Longbot 0.4 | 9.0 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.1 | 21 / 35 | 6712 |
| 2 | 1 | 72.4 | 91.4 | 24 / 35 | 6787 |
| 3 | 1 | 70.8 | 89.5 | 20 / 35 | 6251 |
| 4 | 1 | 70.4 | 87.6 | 19 / 35 | 6276 |
| 5 | 1 | 70.6 | 87.0 | 20 / 35 | 6427 |
| 6 | 1 | 71.1 | 90.5 | 20 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 76% |
| et.Predator 1.8 | 46 | 80% |
| cx.BlestPain 1.41 | 38 | 42% |
| ahf.NanoAndrew .4 | 13 | 100% |
| nic.Nicator 2.4 | 10 | 100% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1100. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 38 | 44% | 63 |
| oog.melee.Mercutio 1.0 | 23 | 26% | 60 |
| et.Predator 1.8 | 16 | 18% | 47 |
| ahf.NanoAndrew .4 | 5 | 6% | 17 |
| maribo.melee.BMV 0.1 | 4 | 5% | 9 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
| nic.Nicator 2.4 | 0 | 0% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 161551 melee ticks, 61871 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 58 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 3.

Targeting waves (199 rounds): 51589 sent, 46834 reached their opponent, 9426 virtual hits (20.1% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483118. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 276 over 6 battles (46.0 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 94.1 | 158 / 210 | 1.47 | 23.0% | 30986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 23.0% | 158 |
| agd.Mooserwirt2 2.7 | 2.5 | 13.7% | 19 |
| uji.DBH 1.1 | 2.8 | 12.6% | 12 |
| spinnercat.Robovirus 2.718 | 4.8 | 10.3% | 6 |
| sigterm.Sigterm 1.0 | 5.0 | 10.0% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 5.7 | 9.3% | 6 |
| ratosh.Nobo 0.21 | 6.2 | 9.4% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.5 | 5.7% | 0 |
| stelo.WangRobot 1.0 | 8.5 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.4 | 24 / 35 | 4984 |
| 2 | 1 | 72.1 | 97.1 | 29 / 35 | 5249 |
| 3 | 1 | 71.1 | 95.0 | 27 / 35 | 5157 |
| 4 | 1 | 72.7 | 97.5 | 31 / 35 | 5562 |
| 5 | 1 | 69.6 | 91.1 | 21 / 35 | 5045 |
| 6 | 1 | 70.9 | 93.6 | 26 / 35 | 4989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 52 | 90% |
| agd.Mooserwirt2 2.7 | 47 | 83% |
| sigterm.Sigterm 1.0 | 29 | 86% |
| ratosh.Nobo 0.21 | 15 | 87% |
| kawigi.mini.Fhqwhgads 1.1 | 15 | 67% |
| spinnercat.Robovirus 2.718 | 14 | 71% |
| stelo.WangRobot 1.0 | 13 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 12 | 23% | 50 |
| uji.DBH 1.1 | 9 | 17% | 44 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 17% | 26 |
| ratosh.Nobo 0.21 | 8 | 15% | 22 |
| sigterm.Sigterm 1.0 | 7 | 13% | 32 |
| spinnercat.Robovirus 2.718 | 7 | 13% | 24 |
| stelo.WangRobot 1.0 | 1 | 2% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 6 |

Posture (Hadur's M records, 198 rounds): 127239 melee ticks, 51292 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 103 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 38298 sent, 34031 reached their opponent, 7388 virtual hits (21.7% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1502515. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 208 over 6 battles (34.7 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 98.5 | 200 / 210 | 1.13 | 22.9% | 39174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.9% | 200 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.1% | 4 |
| krillr.mini.JointStrike 2.0.0 | 3.3 | 11.8% | 1 |
| mld.Infinity 2.2 | 3.7 | 12.1% | 4 |
| erdnis.Rover 0.3 | 4.8 | 10.9% | 0 |
| patson.PatsonTestBot 1.0 | 6.5 | 7.9% | 0 |
| mbh.Mbh 0.1 | 6.8 | 7.2% | 0 |
| pac.ABC 2.1 | 7.8 | 6.6% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.3 | 98.1 | 34 / 35 | 6879 |
| 2 | 1 | 74.1 | 99.7 | 34 / 35 | 6415 |
| 3 | 1 | 73.4 | 97.8 | 31 / 35 | 6391 |
| 4 | 1 | 74.0 | 100.0 | 35 / 35 | 6286 |
| 5 | 1 | 73.2 | 95.6 | 31 / 35 | 6433 |
| 6 | 1 | 74.9 | 100.0 | 35 / 35 | 6770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 106 | 97% |
| krillr.mini.JointStrike 2.0.0 | 31 | 97% |
| mld.Infinity 2.2 | 28 | 100% |
| erdnis.Rover 0.3 | 21 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 10 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 5 | 50% | 31 |
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 40% | 67 |
| pac.ABC 2.1 | 1 | 10% | 13 |
| mld.Infinity 2.2 | 0 | 0% | 36 |
| erdnis.Rover 0.3 | 0 | 0% | 32 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 16 |
| mbh.Mbh 0.1 | 0 | 0% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 122205 melee ticks, 44289 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 42 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 41115 sent, 36215 reached their opponent, 8010 virtual hits (22.1% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1501933. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 93.2 | 153 / 210 | 1.61 | 21.8% | 39641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.8% | 153 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 30 |
| fwb.Nine 1.0.1 | 3.8 | 10.5% | 5 |
| catcat20.Rabbit 0.001 | 4.0 | 10.9% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.1% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.8% | 4 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 5.8% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.0 | 24 / 35 | 6819 |
| 2 | 1 | 72.9 | 94.3 | 27 / 35 | 6685 |
| 3 | 1 | 71.7 | 92.4 | 24 / 35 | 6198 |
| 4 | 1 | 73.5 | 97.1 | 31 / 35 | 6860 |
| 5 | 1 | 72.7 | 94.3 | 26 / 35 | 6548 |
| 6 | 1 | 70.8 | 88.3 | 21 / 35 | 6531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 83 | 78% |
| catcat20.Rabbit 0.001 | 43 | 79% |
| fwb.Nine 1.0.1 | 39 | 97% |
| nz.jdc.nano.GridFu 1.0 | 8 | 88% |
| m3thos.mini.Eva01 0.5.5 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 28 | 49% | 91 |
| catcat20.Rabbit 0.001 | 16 | 28% | 58 |
| m3thos.mini.Eva01 0.5.5 | 4 | 7% | 12 |
| nz.jdc.nano.GridFu 1.0 | 3 | 5% | 13 |
| ntc.ControlledChaos 1.1.4 | 3 | 5% | 4 |
| bayen.nut.Squirrel 1.615 | 2 | 4% | 7 |
| fwb.Nine 1.0.1 | 1 | 2% | 13 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 155754 melee ticks, 59043 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 49 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 47983 sent, 43161 reached their opponent, 9071 virtual hits (21.0% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1498238. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 109 over 6 battles (18.2 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.9 | 129 / 210 | 1.73 | 20.9% | 37990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.9% | 129 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 69 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 4 |
| eld.Hmm 1.0 | 5.5 | 8.2% | 5 |
| oa.weak.BotherBot 0.1 | 5.5 | 7.8% | 0 |
| fire219.CatBot 1.0 | 7.7 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.0 | 5.6% | 0 |
| el.JumpShoot 0.2 | 8.8 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 95.6 | 22 / 35 | 6412 |
| 2 | 1 | 71.4 | 91.7 | 23 / 35 | 6192 |
| 3 | 1 | 71.9 | 93.3 | 21 / 35 | 6515 |
| 4 | 1 | 71.1 | 88.3 | 20 / 35 | 6335 |
| 5 | 1 | 72.8 | 94.6 | 23 / 35 | 6593 |
| 6 | 1 | 70.4 | 87.6 | 20 / 35 | 5943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 137 | 65% |
| cf.RiO.RiOx 4.2.1 | 22 | 91% |
| dummy.mini.Scimitar 1.01 | 19 | 95% |
| eld.Hmm 1.0 | 4 | 25% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 1266. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 57 | 69% | 120 |
| dummy.mini.Scimitar 1.01 | 11 | 13% | 45 |
| cf.RiO.RiOx 4.2.1 | 6 | 7% | 26 |
| eld.Hmm 1.0 | 3 | 4% | 11 |
| PSW.Relentless 0.1 | 3 | 4% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 169134 melee ticks, 77915 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 73 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 49127 sent, 44409 reached their opponent, 7230 virtual hits (16.3% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493859. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.2 | 101 / 210 | 1.94 | 20.5% | 27949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.2 | 20.5% | 101 |
| pe.SandboxDT 2.71m | 2.2 | 17.1% | 62 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.6% | 28 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.4% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 4 |
| yk.JahRoslav 1.1 | 6.5 | 6.9% | 1 |
| tad.Dalek98 0.98 | 6.8 | 6.5% | 0 |
| gg.Squaraus 0.6 | 7.7 | 5.6% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.7 | 19 / 35 | 4677 |
| 2 | 1 | 70.2 | 91.1 | 22 / 35 | 4809 |
| 3 | 1 | 67.8 | 84.3 | 14 / 35 | 4703 |
| 4 | 2 | 68.1 | 86.1 | 11 / 35 | 4555 |
| 5 | 1 | 69.0 | 88.9 | 16 / 35 | 4715 |
| 6 | 1 | 68.3 | 88.2 | 19 / 35 | 4490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 65 | 46% |
| jlm.javaDisturbance 0.59 | 39 | 72% |
| kvk.HebusLeTroll 0.35 | 35 | 69% |
| bigpete.Stewie 1.0 | 14 | 100% |
| tad.Dalek98 0.98 | 3 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 58 | 52% | 91 |
| kvk.HebusLeTroll 0.35 | 23 | 21% | 45 |
| jlm.javaDisturbance 0.59 | 19 | 17% | 41 |
| bigpete.Stewie 1.0 | 5 | 5% | 19 |
| yk.JahRoslav 1.1 | 3 | 3% | 7 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| tad.Dalek98 0.98 | 0 | 0% | 4 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 155615 melee ticks, 45614 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 25 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 45060 sent, 40848 reached their opponent, 5269 virtual hits (12.9% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489940. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 6 battles (30.2 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 95.9 | 176 / 210 | 1.37 | 22.4% | 40579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.4% | 176 |
| pe.SandboxLump 1.52 | 2.0 | 15.7% | 23 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 9.9% | 4 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.0% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.5% | 1 |
| cw.megas.Blade 0.8 | 6.5 | 8.3% | 1 |
| sample.Walls 1.0 | 8.0 | 7.2% | 0 |
| rrh.Iwillfindyou 2.0 | 9.0 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 96.2 | 30 / 35 | 6819 |
| 2 | 1 | 73.0 | 94.9 | 28 / 35 | 6339 |
| 3 | 1 | 73.4 | 96.2 | 30 / 35 | 6670 |
| 4 | 1 | 74.1 | 97.5 | 30 / 35 | 7070 |
| 5 | 1 | 72.9 | 93.7 | 28 / 35 | 6667 |
| 6 | 1 | 74.1 | 96.8 | 30 / 35 | 7014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 92 | 87% |
| cre.Karolos 0.32 | 63 | 98% |
| stelo.RamTrackSurfer 1.2 | 14 | 100% |
| stelo.AreaTargetingBot 1.1 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 17 | 50% | 81 |
| cre.Karolos 0.32 | 10 | 29% | 68 |
| stelo.AreaTargetingBot 1.1 | 3 | 9% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 6% | 10 |
| cw.megas.Blade 0.8 | 2 | 6% | 9 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 17 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 119368 melee ticks, 49608 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 58 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 37254 sent, 32369 reached their opponent, 9101 virtual hits (28.1% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488655. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 181 over 6 battles (30.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.1 | 86 / 210 | 2.43 | 17.4% | 26307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 17.4% | 86 |
| rz.GlowBlowMelee 1.4 | 2.2 | 13.9% | 40 |
| davidalves.Phoenix 0.54 | 3.2 | 12.8% | 38 |
| florent.XSeries.X2 0.12 | 4.0 | 12.7% | 24 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.7% | 18 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 6.7% | 2 |
| lunchie.Lunchbox 0.93 | 8.5 | 5.6% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.0% | 1 |
| evd.X1 0.01 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.6 | 16 / 35 | 4624 |
| 2 | 1 | 66.7 | 85.1 | 14 / 35 | 4071 |
| 3 | 1 | 66.1 | 82.5 | 14 / 35 | 4258 |
| 4 | 1 | 68.4 | 87.9 | 18 / 35 | 4739 |
| 5 | 1 | 65.4 | 79.7 | 12 / 35 | 4186 |
| 6 | 1 | 65.8 | 81.9 | 12 / 35 | 4429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 39 | 49% |
| davidalves.Phoenix 0.54 | 36 | 61% |
| florent.XSeries.X2 0.12 | 30 | 67% |
| pedersen.Ugluk 1.1.1 | 21 | 67% |
| oog.melee.Corsair 1.0 | 7 | 71% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 0% |

Hadur died in 125 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 32 | 26% | 56 |
| davidalves.Phoenix 0.54 | 32 | 26% | 51 |
| florent.XSeries.X2 0.12 | 26 | 21% | 46 |
| pedersen.Ugluk 1.1.1 | 19 | 15% | 27 |
| oog.melee.Corsair 1.0 | 9 | 7% | 17 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 7 |
| as.FrankTheTank 1.3 | 2 | 2% | 2 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 2 |
| evd.X1 0.01 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 138960 melee ticks, 37793 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 97 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 44427 sent, 39382 reached their opponent, 7064 virtual hits (17.9% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484456. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.5 | 131 / 210 | 2.16 | 20.3% | 23603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.3% | 131 |
| voidious.mini.BrokenSword 2.0.3 | 2.8 | 14.3% | 11 |
| jdw.Hurricane 1.4 | 3.0 | 13.5% | 34 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 13.7% | 12 |
| ds.Oo 2.2 | 5.2 | 10.4% | 15 |
| awesomeness.Elite 1.0 | 6.2 | 8.2% | 3 |
| adt.Ar2 1.1 | 6.8 | 8.0% | 3 |
| gjr.Cephalosporin 0.1 | 7.8 | 6.8% | 2 |
| amk.ChumbaMini 0.2 | 9.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 80.7 | 17 / 35 | 3680 |
| 2 | 1 | 69.3 | 88.6 | 25 / 35 | 4222 |
| 3 | 1 | 68.7 | 86.4 | 23 / 35 | 4200 |
| 4 | 1 | 69.8 | 90.7 | 25 / 35 | 4329 |
| 5 | 1 | 66.7 | 81.8 | 18 / 35 | 3795 |
| 6 | 1 | 67.1 | 84.6 | 23 / 35 | 3377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 47 | 94% |
| jdw.Hurricane 1.4 | 43 | 67% |
| voidious.micro.BlitzBat 1.05 | 33 | 94% |
| ds.Oo 2.2 | 17 | 82% |
| awesomeness.Elite 1.0 | 5 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| gjr.Cephalosporin 0.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 27 | 34% | 46 |
| voidious.micro.BlitzBat 1.05 | 16 | 20% | 41 |
| voidious.mini.BrokenSword 2.0.3 | 10 | 13% | 46 |
| ds.Oo 2.2 | 9 | 11% | 35 |
| adt.Ar2 1.1 | 9 | 11% | 14 |
| awesomeness.Elite 1.0 | 4 | 5% | 16 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 7 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |

Posture (Hadur's M records, 198 rounds): 120058 melee ticks, 25289 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 26 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 38224 sent, 33917 reached their opponent, 5396 virtual hits (15.9% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483120. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 225 over 6 battles (37.5 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 93.5 | 151 / 210 | 1.58 | 21.7% | 41682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.7% | 151 |
| ak.Fermat 2.0 | 2.2 | 14.1% | 30 |
| lrem.Spectre 0.4.4 | 3.0 | 12.5% | 13 |
| shu.nitro.LENIN .T34 | 3.8 | 12.1% | 10 |
| js.PinBall 1.6 | 5.0 | 10.9% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.4% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.2 | 7.6% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 3 |
| sample.SpinBot 1.0 | 9.0 | 3.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 94.6 | 26 / 35 | 6727 |
| 2 | 1 | 73.7 | 95.6 | 28 / 35 | 7205 |
| 3 | 1 | 72.6 | 94.6 | 21 / 35 | 7111 |
| 4 | 1 | 73.0 | 93.7 | 25 / 35 | 7138 |
| 5 | 1 | 73.5 | 94.3 | 28 / 35 | 7112 |
| 6 | 1 | 71.3 | 88.6 | 23 / 35 | 6389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 51 | 71% |
| lrem.Spectre 0.4.4 | 50 | 84% |
| shu.nitro.LENIN .T34 | 46 | 89% |
| js.PinBall 1.6 | 15 | 93% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 67% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 43% | 63 |
| lrem.Spectre 0.4.4 | 11 | 18% | 47 |
| shu.nitro.LENIN .T34 | 9 | 15% | 48 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 10% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 7% | 15 |
| js.PinBall 1.6 | 3 | 5% | 17 |
| gh.mini.GrubbmOne 1.0 | 1 | 2% | 4 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 154298 melee ticks, 48135 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48565 sent, 43676 reached their opponent, 9732 virtual hits (22.3% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480774. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.3 | 174 / 210 | 1.51 | 21.3% | 34163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.3% | 174 |
| mk.Alpha 0.2.1 | 2.0 | 13.9% | 21 |
| EH.Eagle 1.0.6 | 4.2 | 10.3% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 4.5 | 9.5% | 0 |
| wee.Gem 1.8.4 | 6.0 | 8.5% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 6.3 | 8.5% | 3 |
| joe.ADinosaur 1.0 | 6.5 | 8.4% | 2 |
| throxbot.ThroxBot 0.1 | 6.8 | 7.7% | 2 |
| caimano.Furia_Ceca 0.22 | 8.0 | 7.4% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.1 | 29 / 35 | 6008 |
| 2 | 1 | 72.3 | 97.1 | 31 / 35 | 5675 |
| 3 | 1 | 71.4 | 94.6 | 27 / 35 | 5933 |
| 4 | 1 | 72.4 | 97.5 | 31 / 35 | 5950 |
| 5 | 1 | 70.5 | 92.4 | 28 / 35 | 5137 |
| 6 | 1 | 70.8 | 92.4 | 28 / 35 | 5460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 102 | 97% |
| EH.Eagle 1.0.6 | 38 | 100% |
| throxbot.ThroxBot 0.1 | 11 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 89% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 100% |
| joe.ADinosaur 1.0 | 5 | 80% |
| wee.Gem 1.8.4 | 5 | 80% |
| caimano.Furia_Ceca 0.22 | 4 | 50% |

Hadur died in 36 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 8 | 22% | 86 |
| EH.Eagle 1.0.6 | 7 | 19% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 14% | 18 |
| joe.ADinosaur 1.0 | 5 | 14% | 9 |
| caimano.Furia_Ceca 0.22 | 4 | 11% | 11 |
| wee.Gem 1.8.4 | 2 | 6% | 15 |
| throxbot.ThroxBot 0.1 | 2 | 6% | 13 |
| cs.Grudge 1.0 | 2 | 6% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 3% | 19 |

Posture (Hadur's M records, 198 rounds): 126218 melee ticks, 40486 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 62 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 40918 sent, 36061 reached their opponent, 8120 virtual hits (22.5% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492604. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.1 | 149 / 210 | 1.80 | 19.2% | 25697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.2% | 149 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 22 |
| uji.Antique 1.0 | 3.2 | 12.3% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.5% | 3 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.4% | 11 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.0% | 1 |
| amk.ChumbaWumba 0.3 | 6.5 | 7.5% | 0 |
| matt.advanced.Katana 1.0 | 8.0 | 6.4% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.5% | 0 |
| stelo.PianistNano 1.2 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.3 | 27 / 35 | 4400 |
| 2 | 1 | 68.7 | 90.5 | 23 / 35 | 4040 |
| 3 | 1 | 69.0 | 91.7 | 26 / 35 | 4129 |
| 4 | 1 | 70.2 | 95.2 | 28 / 35 | 4402 |
| 5 | 1 | 69.0 | 89.8 | 24 / 35 | 4519 |
| 6 | 1 | 67.5 | 84.8 | 21 / 35 | 4207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 82 | 90% |
| uji.Antique 1.0 | 54 | 91% |
| ahr.ice.Ice 1.0.2 | 8 | 100% |
| matt.advanced.Katana 1.0 | 7 | 86% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| qohnil.blot.BlotBot 3.61 | 5 | 40% |
| amk.ChumbaWumba 0.3 | 3 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 18 | 30% | 70 |
| kid.test.NightFox .2 | 15 | 25% | 47 |
| pfvicm.Sobieski 7.2.3b | 13 | 21% | 23 |
| qohnil.blot.BlotBot 3.61 | 7 | 11% | 27 |
| ahr.ice.Ice 1.0.2 | 3 | 5% | 14 |
| matt.advanced.Katana 1.0 | 3 | 5% | 12 |
| amk.ChumbaWumba 0.3 | 2 | 3% | 11 |
| stelo.PianistNano 1.2 | 0 | 0% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 126839 melee ticks, 35426 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 27 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42030 sent, 37114 reached their opponent, 5067 virtual hits (13.7% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487573. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.3 | 125 / 210 | 1.88 | 20.2% | 31800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.2% | 125 |
| deewiant.Anomaly 0.2 | 2.3 | 15.4% | 40 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 15.2% | 38 |
| myl.micro.Troodon 1.10 | 4.2 | 11.5% | 4 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 1 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.9% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.2 | 5.9% | 0 |
| DBall.Anarchy 0.1 | 8.0 | 5.3% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.4% | 1 |
| jangs.ns51 1.0 | 9.8 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.1 | 24 / 35 | 5378 |
| 2 | 1 | 70.7 | 87.3 | 20 / 35 | 5481 |
| 3 | 1 | 71.5 | 93.0 | 24 / 35 | 5218 |
| 4 | 1 | 70.2 | 87.9 | 18 / 35 | 5192 |
| 5 | 1 | 71.6 | 91.7 | 21 / 35 | 5449 |
| 6 | 1 | 70.4 | 89.5 | 18 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 80 | 71% |
| zyx.mega.YersiniaPestis 3.1 | 59 | 75% |
| jok.PheonixM 0.1.2 | 11 | 91% |
| myl.micro.Troodon 1.10 | 9 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 53% | 101 |
| zyx.mega.YersiniaPestis 3.1 | 29 | 33% | 68 |
| myl.micro.Troodon 1.10 | 6 | 7% | 13 |
| jok.PheonixM 0.1.2 | 5 | 6% | 20 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 163143 melee ticks, 60651 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 51944 sent, 47124 reached their opponent, 6970 virtual hits (14.8% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496353. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 6 battles (24.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.9 | 67 / 210 | 2.60 | 18.4% | 26410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.2 | 18.4% | 67 |
| darkcanuck.B26354 1.06 | 2.2 | 15.9% | 58 |
| stelo.PastFuture 2.3.2 | 3.2 | 14.5% | 29 |
| oog.melee.Capulet 1.2 | 3.5 | 14.3% | 36 |
| intruder.PrairieWolf 2.61 | 5.2 | 9.7% | 7 |
| tripphippy.Alice 1.1 | 6.5 | 8.9% | 7 |
| ntc.Opposite 1.5 | 6.8 | 8.2% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.3% | 3 |
| GarmBox.Anger 1.0 | 9.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.7 | 11 / 35 | 4512 |
| 2 | 1 | 66.6 | 83.2 | 12 / 35 | 4411 |
| 3 | 1 | 64.0 | 76.1 | 11 / 35 | 4167 |
| 4 | 2 | 62.6 | 73.2 | 9 / 35 | 3732 |
| 5 | 1 | 67.6 | 82.9 | 10 / 35 | 4953 |
| 6 | 1 | 67.5 | 83.6 | 14 / 35 | 4635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 49 | 41% |
| oog.melee.Capulet 1.2 | 33 | 55% |
| stelo.PastFuture 2.3.2 | 24 | 58% |
| intruder.PrairieWolf 2.61 | 11 | 64% |
| fowl3628800.LightningBolt 2.6.0 | 7 | 71% |
| tripphippy.Alice 1.1 | 4 | 50% |
| ntc.Opposite 1.5 | 2 | 50% |

Hadur died in 143 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 55 | 38% | 77 |
| oog.melee.Capulet 1.2 | 31 | 22% | 54 |
| stelo.PastFuture 2.3.2 | 29 | 20% | 42 |
| ntc.Opposite 1.5 | 10 | 7% | 10 |
| intruder.PrairieWolf 2.61 | 8 | 6% | 13 |
| tripphippy.Alice 1.1 | 6 | 4% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 6 |

Posture (Hadur's M records, 199 rounds): 150930 melee ticks, 38566 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44717 sent, 40359 reached their opponent, 6752 virtual hits (16.7% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1476727. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.6 | 69 / 210 | 2.75 | 16.6% | 24742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 16.7% | 77 |
| hadur117.Hadur 3.21bb | 1.7 | 16.6% | 69 |
| gh.mini.Griezel 0.2 | 3.0 | 13.4% | 48 |
| d414.nano.Quantum 1.0.0 | 4.0 | 12.2% | 8 |
| spinnercat.micro.Tyger 0.1 | 5.2 | 10.1% | 3 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.9% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.8% | 0 |
| tlp.ThreeLeggedPig 1 | 8.8 | 4.9% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 76.2 | 11 / 35 | 4010 |
| 2 | 1 | 67.6 | 85.7 | 16 / 35 | 4513 |
| 3 | 2 | 64.7 | 78.1 | 11 / 35 | 3961 |
| 4 | 2 | 63.9 | 76.8 | 9 / 35 | 3988 |
| 5 | 1 | 68.0 | 86.3 | 13 / 35 | 4492 |
| 6 | 2 | 64.8 | 80.3 | 9 / 35 | 3778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 53 | 36% |
| gh.mini.Griezel 0.2 | 41 | 59% |
| d414.nano.Quantum 1.0.0 | 15 | 80% |
| spinnercat.micro.Tyger 0.1 | 9 | 100% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 0% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 40% | 80 |
| gh.mini.Griezel 0.2 | 33 | 23% | 58 |
| d414.nano.Quantum 1.0.0 | 18 | 13% | 26 |
| spinnercat.micro.Tyger 0.1 | 12 | 8% | 20 |
| gh.nano.Grofvuil 0.2 | 9 | 6% | 12 |
| fm.mammillarias 1.3 | 5 | 4% | 5 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 201 rounds): 149493 melee ticks, 34620 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 47374 sent, 42402 reached their opponent, 6692 virtual hits (15.8% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485566. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 91.3 | 122 / 210 | 1.78 | 19.2% | 29226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.2% | 122 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 49 |
| lxx.ConceptA 0.8 | 3.5 | 10.7% | 3 |
| apc.botM 3.0 | 3.7 | 11.7% | 21 |
| vjik.UnViolation 1.1 | 5.3 | 9.3% | 3 |
| bayen.UbaMicro 1.4 | 5.7 | 8.8% | 3 |
| panzer.Panzer 0.2 | 7.2 | 7.5% | 1 |
| yk.JahMicro 1.0 | 8.2 | 6.8% | 8 |
| conscience.Electron 1.3g | 8.5 | 6.7% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.1 | 23 / 35 | 5034 |
| 2 | 1 | 66.0 | 84.1 | 13 / 35 | 4403 |
| 3 | 1 | 70.2 | 94.6 | 24 / 35 | 5158 |
| 4 | 1 | 69.1 | 92.4 | 18 / 35 | 4988 |
| 5 | 1 | 69.2 | 92.7 | 21 / 35 | 4883 |
| 6 | 1 | 69.2 | 93.0 | 23 / 35 | 4760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 54% |
| apc.botM 3.0 | 37 | 73% |
| lxx.ConceptA 0.8 | 12 | 92% |
| vjik.UnViolation 1.1 | 12 | 92% |
| yk.JahMicro 1.0 | 10 | 60% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| donjezza.Jezza 1.0 | 7 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 46 | 52% | 90 |
| apc.botM 3.0 | 16 | 18% | 45 |
| lxx.ConceptA 0.8 | 10 | 11% | 23 |
| yk.JahMicro 1.0 | 8 | 9% | 11 |
| bayen.UbaMicro 1.4 | 4 | 4% | 11 |
| vjik.UnViolation 1.1 | 3 | 3% | 18 |
| conscience.Electron 1.3g | 1 | 1% | 5 |
| panzer.Panzer 0.2 | 1 | 1% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 124701 melee ticks, 56692 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 66 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 41440 sent, 36415 reached their opponent, 6163 virtual hits (16.9% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491505. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 136 over 6 battles (22.7 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.3 | 125 / 210 | 1.85 | 21.9% | 29415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.9% | 125 |
| maribo.Quester 0.3 | 2.0 | 17.9% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 14.3% | 21 |
| labg.Cataclysm 2.05 | 4.0 | 11.6% | 12 |
| baal.nano.N 1.42 | 5.3 | 9.7% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.5 | 10.0% | 5 |
| zyx.micro.Ant 1.1 | 7.2 | 6.6% | 0 |
| sanja.First 0.1 | 7.8 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.7 | 21 / 35 | 5095 |
| 2 | 1 | 70.8 | 89.6 | 20 / 35 | 4876 |
| 3 | 1 | 70.9 | 90.0 | 22 / 35 | 5109 |
| 4 | 1 | 69.9 | 87.1 | 18 / 35 | 4813 |
| 5 | 1 | 69.4 | 85.7 | 20 / 35 | 4801 |
| 6 | 1 | 71.4 | 92.9 | 24 / 35 | 4721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 81 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 80% |
| labg.Cataclysm 2.05 | 16 | 63% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 78% |
| zyx.micro.Ant 1.1 | 4 | 100% |
| baal.nano.N 1.42 | 4 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 42 | 49% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 18% | 50 |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 14% | 15 |
| labg.Cataclysm 2.05 | 10 | 12% | 26 |
| baal.nano.N 1.42 | 3 | 4% | 13 |
| zyx.micro.Ant 1.1 | 3 | 4% | 8 |

Posture (Hadur's M records, 201 rounds): 160082 melee ticks, 56741 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 58 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46965 sent, 42608 reached their opponent, 6005 virtual hits (14.1% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1513267. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 6 battles (25.5 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.0 | 89 / 210 | 2.17 | 18.8% | 33821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.8% | 89 |
| stelo.Spread 0.9 | 2.5 | 16.5% | 67 |
| kid.Gladiator .7.2 | 2.5 | 16.0% | 32 |
| jcs.Seth 1.8 | 4.5 | 11.1% | 16 |
| tcf.Reach 3 | 4.7 | 10.6% | 7 |
| cli.Dancer 1.1 | 5.8 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.2 | 16 / 35 | 5717 |
| 2 | 1 | 68.4 | 84.8 | 10 / 35 | 5237 |
| 3 | 1 | 68.7 | 82.5 | 14 / 35 | 5478 |
| 4 | 1 | 70.9 | 90.5 | 16 / 35 | 6107 |
| 5 | 1 | 70.2 | 88.6 | 16 / 35 | 5803 |
| 6 | 1 | 69.6 | 86.7 | 17 / 35 | 5479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 78 | 55% |
| kid.Gladiator .7.2 | 51 | 67% |
| jcs.Seth 1.8 | 16 | 38% |
| tcf.Reach 3 | 5 | 40% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1093. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 53 | 43% | 93 |
| kid.Gladiator .7.2 | 37 | 30% | 68 |
| jcs.Seth 1.8 | 18 | 15% | 26 |
| tcf.Reach 3 | 9 | 7% | 13 |
| cli.Dancer 1.1 | 2 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 2% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
| ratosh.Wesco 1.4 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 160087 melee ticks, 64897 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 82 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48856 sent, 44011 reached their opponent, 6988 virtual hits (15.9% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1500760. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 6 battles (24.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.9 | 55 / 210 | 2.36 | 17.0% | 25837 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.2 | 18.6% | 121 |
| hadur117.Hadur 3.21bb | 1.8 | 17.0% | 55 |
| gh.mini.Gruwel 0.9 | 3.7 | 12.4% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.1% | 8 |
| rz.HawkOnFire 0.1 | 4.5 | 11.7% | 7 |
| wit.Chuliath 1.0 | 6.2 | 7.2% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 5.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 86.7 | 8 / 35 | 4459 |
| 2 | 1 | 67.7 | 88.3 | 13 / 35 | 4343 |
| 3 | 2 | 66.5 | 85.7 | 7 / 35 | 4289 |
| 4 | 2 | 65.4 | 79.0 | 6 / 35 | 4349 |
| 5 | 2 | 66.4 | 86.3 | 8 / 35 | 3993 |
| 6 | 2 | 66.8 | 83.2 | 13 / 35 | 4404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 93 | 22% |
| gh.mini.Gruwel 0.9 | 17 | 53% |
| rz.HawkOnFire 0.1 | 16 | 81% |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 71% |
| wit.Chuliath 1.0 | 2 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 101 | 65% | 123 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 12% | 24 |
| rz.HawkOnFire 0.1 | 16 | 10% | 22 |
| gh.mini.Gruwel 0.9 | 14 | 9% | 25 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 4 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 3 |
| wit.Chuliath 1.0 | 1 | 1% | 5 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 2 |
| dans.Cinnamon 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 140724 melee ticks, 52075 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 33 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 42908 sent, 37958 reached their opponent, 5782 virtual hits (15.2% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1474748. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 94.5 | 162 / 210 | 1.50 | 21.6% | 35116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.6% | 162 |
| bzdp.Pansy 2.1 | 2.3 | 12.2% | 10 |
| alpha.RainingFire 1.0 | 3.0 | 12.3% | 14 |
| bvh.micro.Freya 0.3 | 3.8 | 11.0% | 11 |
| mz.Cork 0.1 | 5.7 | 10.0% | 4 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.6% | 6 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.3% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.7 | 27 / 35 | 6130 |
| 2 | 1 | 72.8 | 97.5 | 30 / 35 | 5832 |
| 3 | 1 | 72.6 | 96.5 | 30 / 35 | 5841 |
| 4 | 1 | 72.0 | 94.3 | 27 / 35 | 6015 |
| 5 | 1 | 70.6 | 92.1 | 23 / 35 | 5219 |
| 6 | 1 | 72.1 | 93.0 | 25 / 35 | 6079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 90% |
| bvh.micro.Freya 0.3 | 40 | 88% |
| alpha.RainingFire 1.0 | 35 | 89% |
| mz.Cork 0.1 | 25 | 92% |
| m3thos.Eva02 0.7.1 | 16 | 88% |
| bvh.mini.Fenrir 0.39 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 10 | 21% | 41 |
| alpha.RainingFire 1.0 | 10 | 21% | 34 |
| bzdp.Pansy 2.1 | 9 | 19% | 53 |
| mz.Cork 0.1 | 6 | 13% | 37 |
| bvh.mini.Fenrir 0.39 | 6 | 13% | 11 |
| m3thos.Eva02 0.7.1 | 4 | 8% | 18 |
| dl.BetterWalls 1.0 | 2 | 4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 139798 melee ticks, 48910 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 42 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 47174 sent, 42512 reached their opponent, 8305 virtual hits (19.5% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487719. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 226 over 6 battles (37.7 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.3 | 153 / 210 | 2.06 | 19.4% | 34919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 19.4% | 153 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 11.3% | 9 |
| EBBU.Sim2 1.02 | 3.5 | 10.0% | 7 |
| germ.TheMind .2 | 3.7 | 9.8% | 8 |
| agrach.Dalek 1.0 | 5.5 | 9.1% | 12 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.6% | 7 |
| lmk.ACPFinal 0.1 | 6.8 | 8.5% | 6 |
| mb.Beast 0.1 | 8.2 | 7.8% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 8.1% | 1 |
| skm.Ryubot 1.0 | 9.3 | 7.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.3 | 25 / 35 | 6035 |
| 2 | 1 | 68.3 | 87.0 | 25 / 35 | 5704 |
| 3 | 1 | 68.6 | 87.6 | 25 / 35 | 5934 |
| 4 | 1 | 69.5 | 90.2 | 29 / 35 | 5815 |
| 5 | 1 | 69.7 | 92.4 | 28 / 35 | 5859 |
| 6 | 1 | 66.8 | 84.1 | 21 / 35 | 5572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 37 | 92% |
| germ.TheMind .2 | 25 | 96% |
| agrach.Dalek 1.0 | 25 | 96% |
| stelo.UntouchableNano 1.3 | 20 | 80% |
| mb.Beast 0.1 | 17 | 94% |
| EBBU.Sim2 1.02 | 15 | 93% |
| skm.Ryubot 1.0 | 14 | 93% |
| lmk.ACPFinal 0.1 | 12 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 10 | 17% | 35 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 15% | 49 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 15% | 14 |
| EBBU.Sim2 1.02 | 8 | 14% | 29 |
| stelo.UntouchableNano 1.3 | 7 | 12% | 21 |
| lmk.ACPFinal 0.1 | 6 | 10% | 20 |
| germ.TheMind .2 | 6 | 10% | 16 |
| mb.Beast 0.1 | 2 | 3% | 16 |
| skm.Ryubot 1.0 | 2 | 3% | 7 |

Posture (Hadur's M records, 199 rounds): 91003 melee ticks, 25910 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 30389 sent, 25628 reached their opponent, 7250 virtual hits (28.3% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1491078. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 6 battles (21.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.3 | 111 / 210 | 1.96 | 19.0% | 30381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.2 | 19.0% | 111 |
| justin.Mallais 14.0 | 1.8 | 16.8% | 63 |
| bvh.mini.Freya 0.55 | 3.2 | 12.8% | 13 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.7% | 13 |
| kdf.KoulDestroyer 1.0 | 4.8 | 10.0% | 8 |
| cs.Wren 1.0 | 5.3 | 9.8% | 1 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.2 | 8.0% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.4% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.8% | 0 |
| bzdp.BoxCar 2.0 | 9.3 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.3 | 16 / 35 | 5084 |
| 2 | 2 | 68.0 | 86.0 | 16 / 35 | 4803 |
| 3 | 1 | 69.7 | 89.5 | 20 / 35 | 5149 |
| 4 | 1 | 69.6 | 89.8 | 20 / 35 | 5203 |
| 5 | 1 | 70.5 | 94.0 | 22 / 35 | 4968 |
| 6 | 1 | 69.5 | 89.2 | 17 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 98 | 63% |
| bvh.mini.Freya 0.55 | 30 | 83% |
| bts.mega.Gnarly 1.4 | 16 | 56% |
| kdf.KoulDestroyer 1.0 | 14 | 79% |
| cs.Wren 1.0 | 4 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 43 | 43% | 99 |
| bts.mega.Gnarly 1.4 | 19 | 19% | 30 |
| bvh.mini.Freya 0.55 | 18 | 18% | 32 |
| kdf.KoulDestroyer 1.0 | 12 | 12% | 26 |
| cs.Wren 1.0 | 5 | 5% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 138158 melee ticks, 43498 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 33 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44124 sent, 39095 reached their opponent, 7876 virtual hits (20.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1513440. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.0 | 124 / 210 | 1.80 | 22.0% | 34340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 22.0% | 124 |
| bvh.fry.Freya 0.82 | 2.2 | 15.9% | 9 |
| az.Ololobot 0.2.4 | 2.8 | 15.0% | 68 |
| winamp32.micro.MicroMacro 1.0 | 4.5 | 9.7% | 2 |
| apollokidd.ApolloKidd 0.9 | 5.2 | 8.8% | 0 |
| gimp.GimpBot 0.1 | 5.8 | 8.5% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 7.6% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.3 | 6.2% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.3 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.9 | 21 / 35 | 5957 |
| 2 | 1 | 69.7 | 89.3 | 20 / 35 | 5379 |
| 3 | 1 | 69.2 | 88.2 | 17 / 35 | 5636 |
| 4 | 1 | 71.2 | 91.8 | 25 / 35 | 5880 |
| 5 | 1 | 70.6 | 91.1 | 19 / 35 | 5879 |
| 6 | 1 | 70.0 | 90.7 | 22 / 35 | 5609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 83 | 52% |
| bvh.fry.Freya 0.82 | 60 | 92% |
| winamp32.micro.MicroMacro 1.0 | 12 | 92% |
| gimp.GimpBot 0.1 | 8 | 88% |
| apollokidd.ApolloKidd 0.9 | 5 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 67% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1136. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 49 | 57% | 100 |
| bvh.fry.Freya 0.82 | 17 | 20% | 55 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 9% | 13 |
| winamp32.micro.MicroMacro 1.0 | 6 | 7% | 18 |
| gimp.GimpBot 0.1 | 5 | 6% | 13 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 155370 melee ticks, 67310 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 31 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 44617 sent, 40200 reached their opponent, 6807 virtual hits (16.9% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1486669. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 6 battles (36.3 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.6 | 141 / 210 | 1.84 | 20.7% | 34476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.7% | 141 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.2% | 36 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.4% | 10 |
| Polkwane.SmashMelee 1.0 | 4.3 | 11.1% | 8 |
| mz.AntiGrav 1.0 | 5.0 | 10.4% | 6 |
| stelo.Randomness 1.0 | 5.8 | 9.2% | 8 |
| alpha.BlackIce 1.0 | 6.8 | 8.6% | 1 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.6% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.6% | 0 |
| sample.Corners 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.7 | 23 / 35 | 5769 |
| 2 | 1 | 71.4 | 92.4 | 26 / 35 | 5524 |
| 3 | 1 | 71.3 | 91.4 | 23 / 35 | 5758 |
| 4 | 1 | 70.1 | 86.3 | 22 / 35 | 5369 |
| 5 | 1 | 70.4 | 86.7 | 21 / 35 | 5873 |
| 6 | 1 | 72.4 | 94.3 | 26 / 35 | 6183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 54 | 76% |
| kano.gamma.KanoGamma 1.8 | 39 | 92% |
| Polkwane.SmashMelee 1.0 | 26 | 100% |
| mz.AntiGrav 1.0 | 19 | 95% |
| stelo.Randomness 1.0 | 12 | 67% |
| alpha.BlackIce 1.0 | 7 | 100% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 25 | 36% | 62 |
| mz.AntiGrav 1.0 | 11 | 16% | 24 |
| kano.gamma.KanoGamma 1.8 | 10 | 14% | 59 |
| Polkwane.SmashMelee 1.0 | 8 | 12% | 23 |
| stelo.Randomness 1.0 | 8 | 12% | 17 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 11 |
| alpha.BlackIce 1.0 | 2 | 3% | 9 |
| sample.Corners 1.0 | 1 | 1% | 3 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 198 rounds): 149665 melee ticks, 39124 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 106 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 106 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 2.

Targeting waves (198 rounds): 47332 sent, 42378 reached their opponent, 8201 virtual hits (19.4% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1500337. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 142 over 6 battles (23.7 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.1 | 111 / 210 | 2.16 | 18.8% | 29690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 18.8% | 111 |
| eem.EvBotNG v12.8 | 2.0 | 16.5% | 72 |
| ary.Swarm 1.1 | 3.5 | 12.9% | 8 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.7% | 14 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.4% | 6 |
| shrub.Silver v048 | 6.0 | 8.8% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.1% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.1% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.1 | 22 / 35 | 5290 |
| 2 | 1 | 68.2 | 84.1 | 16 / 35 | 4715 |
| 3 | 1 | 69.3 | 87.3 | 20 / 35 | 5082 |
| 4 | 1 | 69.6 | 88.3 | 18 / 35 | 5132 |
| 5 | 1 | 69.2 | 88.3 | 20 / 35 | 4648 |
| 6 | 1 | 68.1 | 83.5 | 15 / 35 | 4823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 83 | 54% |
| lessonz.robocode.Oz 0.5.0 | 30 | 90% |
| ary.Swarm 1.1 | 22 | 100% |
| simonton.nano.MeleeSeed 1.8 | 11 | 100% |
| shrub.Silver v048 | 4 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 60 | 60% | 108 |
| lessonz.robocode.Oz 0.5.0 | 14 | 14% | 31 |
| ary.Swarm 1.1 | 13 | 13% | 36 |
| simonton.nano.MeleeSeed 1.8 | 6 | 6% | 21 |
| shrub.Silver v048 | 4 | 4% | 10 |
| zyx.nano.Ant 1.1 | 1 | 1% | 2 |
| stelo.Mirror 1.1 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 150874 melee ticks, 52188 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 53 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 48244 sent, 43163 reached their opponent, 6233 virtual hits (14.4% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480353. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.8 | 148 / 210 | 1.65 | 21.1% | 37772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.1% | 148 |
| wompi.Wallaby 5.1 | 2.2 | 14.6% | 29 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.9% | 8 |
| ara.Shera 0.88 | 3.7 | 12.8% | 21 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 2 |
| dsw.StaticD 1.0 | 6.8 | 6.4% | 2 |
| maribo.IotaCT 1.1 | 7.0 | 6.2% | 0 |
| stelo.MirrorMicro 1.0 | 7.5 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.6 | 23 / 35 | 6428 |
| 2 | 1 | 72.4 | 94.0 | 26 / 35 | 6502 |
| 3 | 1 | 72.1 | 94.3 | 26 / 35 | 6380 |
| 4 | 1 | 70.4 | 89.2 | 24 / 35 | 5795 |
| 5 | 1 | 71.7 | 91.7 | 25 / 35 | 6189 |
| 6 | 1 | 72.0 | 93.0 | 24 / 35 | 6478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 87 | 86% |
| maribo.mini.MiniQuester 0.1 | 49 | 94% |
| ara.Shera 0.88 | 30 | 67% |
| dsw.StaticD 1.0 | 6 | 83% |
| amz.NanoClone 1.41 | 3 | 67% |

Hadur died in 62 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 26 | 42% | 101 |
| ara.Shera 0.88 | 21 | 34% | 46 |
| maribo.mini.MiniQuester 0.1 | 9 | 15% | 46 |
| amz.NanoClone 1.41 | 3 | 5% | 6 |
| maribo.IotaCT 1.1 | 2 | 3% | 4 |
| dsw.StaticD 1.0 | 1 | 2% | 6 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 160925 melee ticks, 52944 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 696 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 173 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49277 sent, 44553 reached their opponent, 8270 virtual hits (18.6% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1485911. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 6 battles (19.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 79.9 | 29 / 210 | 2.81 | 15.9% | 25329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.5% | 147 |
| hadur117.Hadur 3.21bb | 2.0 | 15.9% | 29 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.8% | 25 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.7% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.6% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.8% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 1 |
| jab.DiamondStealer 5 | 7.7 | 6.9% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 81.9 | 7 / 35 | 4012 |
| 2 | 2 | 67.3 | 82.9 | 9 / 35 | 4514 |
| 3 | 2 | 65.2 | 78.1 | 2 / 35 | 4106 |
| 4 | 2 | 65.8 | 78.7 | 5 / 35 | 4161 |
| 5 | 2 | 66.7 | 82.2 | 4 / 35 | 4421 |
| 6 | 2 | 64.6 | 75.6 | 2 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 92 | 15% |
| brainfade.melee.Dusk 0.44 | 16 | 50% |
| dummy.micro.Sparrow 2.5 | 8 | 63% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 116 | 64% | 130 |
| brainfade.melee.Dusk 0.44 | 29 | 16% | 37 |
| dummy.micro.Sparrow 2.5 | 16 | 9% | 21 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 7% | 12 |
| mz.NanoGod 2.02 | 5 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 2 | 1% | 3 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 148360 melee ticks, 48244 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 56 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 46857 sent, 41786 reached their opponent, 6714 virtual hits (16.1% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489530. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 176 over 6 battles (29.3 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.3 | 156 / 210 | 1.60 | 21.5% | 37626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 21.5% | 156 |
| stelo.Liblix 0.3.1 | 2.2 | 15.1% | 40 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.2% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.4% | 0 |
| jwirde.Gort 2.0 | 4.7 | 9.3% | 3 |
| wompi.Quokka 1.6 | 6.7 | 7.1% | 1 |
| disan.Chair 2.2.0 | 7.0 | 7.5% | 0 |
| stf.PanzerGeneral 0.1 | 7.3 | 6.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.2 | 26 / 35 | 6068 |
| 2 | 1 | 73.0 | 95.9 | 29 / 35 | 6352 |
| 3 | 1 | 73.0 | 96.2 | 26 / 35 | 6497 |
| 4 | 1 | 71.5 | 90.5 | 24 / 35 | 6265 |
| 5 | 1 | 72.1 | 95.9 | 25 / 35 | 5978 |
| 6 | 1 | 72.1 | 91.4 | 26 / 35 | 6466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tzu.TheArtOfWar 1.2 | 77 | 92% |
| stelo.Liblix 0.3.1 | 74 | 70% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 100% |
| jwirde.Gort 2.0 | 12 | 100% |
| disan.Chair 2.2.0 | 7 | 100% |
| wompi.Quokka 1.6 | 2 | 50% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 63% | 102 |
| tzu.TheArtOfWar 1.2 | 9 | 17% | 59 |
| jwirde.Gort 2.0 | 3 | 6% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 6% | 13 |
| disan.Chair 2.2.0 | 2 | 4% | 4 |
| wompi.Quokka 1.6 | 1 | 2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 3 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 151285 melee ticks, 49316 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 50700 sent, 45840 reached their opponent, 9263 virtual hits (20.2% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1478209. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.7 | 122 / 210 | 1.84 | 20.6% | 35010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.0 | 20.6% | 122 |
| jje.BagPuss 1.2 | 2.0 | 12.9% | 12 |
| eem.IWillFireNoBullet v2.8 | 3.8 | 11.3% | 56 |
| sul.Lunar 1.1 | 4.0 | 11.2% | 11 |
| myl.nano.Graviton 1.10 | 4.2 | 10.9% | 4 |
| hvilela.HVilela 0.9 | 6.8 | 8.0% | 0 |
| fm.claire 1.7 | 7.0 | 8.0% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 7.7% | 3 |
| wit.Deep7 2.0 | 9.0 | 5.3% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.8 | 21 / 35 | 5784 |
| 2 | 1 | 71.3 | 91.7 | 22 / 35 | 5941 |
| 3 | 1 | 71.5 | 92.7 | 24 / 35 | 5880 |
| 4 | 1 | 69.8 | 88.3 | 16 / 35 | 5783 |
| 5 | 1 | 71.1 | 92.1 | 22 / 35 | 5898 |
| 6 | 1 | 70.2 | 88.6 | 17 / 35 | 5724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 65 | 52% |
| jje.BagPuss 1.2 | 42 | 81% |
| sul.Lunar 1.1 | 31 | 74% |
| myl.nano.Graviton 1.10 | 21 | 90% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 86% |
| wit.Deep7 2.0 | 3 | 67% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 1464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 37 | 42% | 0 |
| jje.BagPuss 1.2 | 20 | 23% | 83 |
| sul.Lunar 1.1 | 11 | 13% | 46 |
| myl.nano.Graviton 1.10 | 10 | 11% | 37 |
| fm.claire 1.7 | 6 | 7% | 17 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 14 |
| hvilela.HVilela 0.9 | 1 | 1% | 8 |
| wit.Deep7 2.0 | 1 | 1% | 2 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 185710 melee ticks, 76935 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 79 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 56161 sent, 51503 reached their opponent, 7297 virtual hits (14.2% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21bb against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1495605. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 127 over 6 battles (21.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.9 | 121 / 210 | 1.97 | 21.2% | 31436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21bb | 1.2 | 21.2% | 121 |
| kc.mini.Mirage 0.2 | 1.8 | 19.1% | 67 |
| mz.MicroSheep 1.0 | 3.2 | 12.5% | 10 |
| cx.Princess 1.0 | 3.8 | 11.8% | 11 |
| sadoner.killer 0.2 | 5.3 | 10.2% | 0 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.0% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.3 | 6.6% | 0 |
| kurios.DOSexe .9a | 7.7 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 84.6 | 17 / 35 | 5229 |
| 2 | 1 | 71.4 | 92.5 | 23 / 35 | 5682 |
| 3 | 1 | 70.0 | 90.0 | 20 / 35 | 5279 |
| 4 | 2 | 67.4 | 81.1 | 16 / 35 | 4783 |
| 5 | 1 | 70.5 | 91.1 | 22 / 35 | 5385 |
| 6 | 1 | 69.5 | 87.9 | 23 / 35 | 5078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 130 | 70% |
| cx.Princess 1.0 | 15 | 73% |
| mz.MicroSheep 1.0 | 13 | 85% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| sadoner.killer 0.2 | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 53 | 60% | 133 |
| cx.Princess 1.0 | 10 | 11% | 16 |
| sadoner.killer 0.2 | 9 | 10% | 15 |
| mz.MicroSheep 1.0 | 7 | 8% | 23 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 11 |
| kurios.DOSexe .9a | 3 | 3% | 7 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 137003 melee ticks, 54599 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 37416 sent, 33075 reached their opponent, 5356 virtual hits (16.2% of those reached).

