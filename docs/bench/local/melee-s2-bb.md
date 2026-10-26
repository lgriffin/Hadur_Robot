# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 217 over 6 battles (36.2 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 84.2 | 45 / 210 | 2.42 | 16.3% | 26756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 141 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.3% | 45 |
| sgp.JollyNinja 3.53 | 3.7 | 11.3% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.1% | 2 |
| lorneswork.Predator 1.0 | 4.8 | 10.5% | 3 |
| mz.MicroGodMelee 1 | 5.7 | 10.3% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.5% | 0 |
| skm.butterfly 1.0 | 9.2 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 83.5 | 7 / 35 | 4487 |
| 2 | 2 | 65.0 | 81.6 | 9 / 35 | 4197 |
| 3 | 2 | 65.8 | 83.5 | 5 / 35 | 4474 |
| 4 | 2 | 67.3 | 87.9 | 10 / 35 | 4921 |
| 5 | 2 | 65.3 | 83.5 | 8 / 35 | 4338 |
| 6 | 2 | 65.6 | 85.1 | 6 / 35 | 4339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 11% |
| sgp.JollyNinja 3.53 | 16 | 63% |
| mz.MicroGodMelee 1 | 10 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |
| lorneswork.Predator 1.0 | 5 | 80% |
| adt.Ar2 1.0 | 2 | 50% |
| skm.butterfly 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 1137. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 70% | 131 |
| sgp.JollyNinja 3.53 | 17 | 10% | 23 |
| lorneswork.Predator 1.0 | 12 | 7% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 7% | 18 |
| mz.MicroGodMelee 1 | 5 | 3% | 15 |
| adt.Ar2 1.0 | 2 | 1% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 141367 melee ticks, 85543 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46992 sent, 42469 reached their opponent, 9377 virtual hits (22.1% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 256 over 6 battles (42.7 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.2 | 89 / 210 | 2.33 | 17.6% | 26121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.6% | 89 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.2% | 46 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.0% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.5% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.5% | 17 |
| sch.Simone 0.3d | 7.0 | 7.9% | 8 |
| Noran.BitchingElk 0.054 | 7.0 | 8.1% | 16 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.8% | 4 |
| stelo.PatternRobot 1.0 | 8.8 | 5.6% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.7 | 16 / 35 | 4294 |
| 2 | 1 | 65.4 | 83.2 | 12 / 35 | 4175 |
| 3 | 1 | 67.6 | 87.9 | 19 / 35 | 4141 |
| 4 | 1 | 68.1 | 87.9 | 18 / 35 | 4679 |
| 5 | 1 | 66.3 | 82.5 | 14 / 35 | 4389 |
| 6 | 1 | 66.1 | 84.1 | 10 / 35 | 4443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 49 | 45% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 33 | 61% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 77% |
| Noran.BitchingElk 0.054 | 13 | 46% |
| sch.Simone 0.3d | 11 | 91% |
| fnc.bandit.Bandit 5.2.0 | 5 | 80% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 35% | 67 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 20% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 14% | 21 |
| Noran.BitchingElk 0.054 | 11 | 9% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 7% | 24 |
| sch.Simone 0.3d | 7 | 6% | 16 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 8 |
| stelo.PatternRobot 1.0 | 4 | 3% | 8 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 174078 melee ticks, 46270 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 147 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 61723 sent, 57188 reached their opponent, 10442 virtual hits (18.3% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.2 | 156 / 210 | 1.80 | 19.6% | 33395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.6% | 156 |
| radnor.DoctorBob 1.42 | 2.3 | 14.1% | 21 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.0% | 14 |
| vuen.Cake 2.51 | 3.7 | 12.4% | 16 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| oa.weak.FlyMk1 0.1 | 6.7 | 7.2% | 0 |
| adt.Ar1 2.1 | 6.8 | 7.4% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.3 | 25 / 35 | 5338 |
| 2 | 1 | 69.9 | 93.0 | 27 / 35 | 5584 |
| 3 | 1 | 70.6 | 94.6 | 27 / 35 | 5544 |
| 4 | 1 | 69.6 | 92.1 | 26 / 35 | 5698 |
| 5 | 1 | 70.8 | 94.6 | 28 / 35 | 5971 |
| 6 | 1 | 68.1 | 86.3 | 23 / 35 | 5260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 88% |
| radnor.DoctorBob 1.42 | 50 | 92% |
| kawigi.nano.Lib 1.0 | 37 | 97% |
| oa.weak.FlyMk1 0.1 | 10 | 100% |
| urdos.URDOS 1.3 | 5 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 0% |

Hadur died in 54 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 41% | 68 |
| kawigi.nano.Lib 1.0 | 10 | 19% | 42 |
| vuen.Cake 2.51 | 9 | 17% | 64 |
| urdos.URDOS 1.3 | 8 | 15% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 4% | 2 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 11 |
| adt.Ar1 2.1 | 1 | 2% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 200 rounds): 127469 melee ticks, 41189 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 43 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 39485 sent, 35180 reached their opponent, 9753 virtual hits (27.7% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 399 over 6 battles (66.5 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.1 | 24 / 210 | 2.34 | 16.6% | 28223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 172 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.6% | 24 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 8 |
| TNT.TNT 0.99.1 | 4.5 | 10.7% | 2 |
| josago.Jorgito 0.16 | 4.5 | 9.6% | 3 |
| css.Delitioner 0.11 | 6.5 | 6.9% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 5.9% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 82.9 | 3 / 35 | 4393 |
| 2 | 2 | 67.6 | 88.3 | 6 / 35 | 4748 |
| 3 | 2 | 67.5 | 85.1 | 7 / 35 | 4855 |
| 4 | 2 | 65.2 | 83.2 | 0 / 35 | 4332 |
| 5 | 2 | 67.1 | 86.7 | 3 / 35 | 4830 |
| 6 | 2 | 67.3 | 84.4 | 5 / 35 | 5065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 127 | 6% |
| apc.LeeroyJenkins2 1.0 | 10 | 80% |
| josago.Jorgito 0.16 | 7 | 71% |
| TNT.TNT 0.99.1 | 4 | 50% |
| css.Delitioner 0.11 | 2 | 50% |
| rampancy.Durandal 2.1d | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 1306. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 141 | 74% | 150 |
| apc.LeeroyJenkins2 1.0 | 24 | 13% | 31 |
| josago.Jorgito 0.16 | 9 | 5% | 12 |
| TNT.TNT 0.99.1 | 8 | 4% | 11 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 203620 melee ticks, 62937 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 51 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 62700 sent, 58141 reached their opponent, 9056 virtual hits (15.6% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 513 over 6 battles (85.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 75.9 | 16 / 210 | 3.17 | 14.0% | 19978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.0% | 112 |
| justin.DemonicRage 3.4 | 2.0 | 17.3% | 67 |
| hadur2.Hadur 3.17.1bb | 3.0 | 14.0% | 16 |
| wompi.Numbat 2.1 | 4.0 | 12.3% | 12 |
| ms.Ares 0.19 | 5.0 | 9.4% | 1 |
| axeBots.HataMoto 3.09 | 6.0 | 8.3% | 2 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.1% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 78.4 | 3 / 35 | 3177 |
| 2 | 3 | 62.2 | 75.9 | 4 / 35 | 3075 |
| 3 | 3 | 60.6 | 72.1 | 0 / 35 | 3051 |
| 4 | 3 | 62.4 | 75.6 | 6 / 35 | 3487 |
| 5 | 3 | 62.9 | 78.1 | 2 / 35 | 3576 |
| 6 | 3 | 62.6 | 75.6 | 1 / 35 | 3612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 39 | 10% |
| justin.DemonicRage 3.4 | 36 | 17% |
| wompi.Numbat 2.1 | 3 | 100% |
| supersample.SuperBoxBot 1.0 | 2 | 100% |
| ms.Ares 0.19 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 199 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 90 | 45% | 99 |
| cb.fire.Firestarter 2.0f | 64 | 32% | 68 |
| wompi.Numbat 2.1 | 20 | 10% | 20 |
| ms.Ares 0.19 | 10 | 5% | 11 |
| axeBots.HataMoto 3.09 | 5 | 3% | 5 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 161220 melee ticks, 30719 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 95 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 50363 sent, 45592 reached their opponent, 7973 virtual hits (17.5% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 190 over 6 battles (31.7 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.3 | 120 / 210 | 2.05 | 18.6% | 28011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.6% | 120 |
| jekl.StoneGhost 0.7 | 2.3 | 14.5% | 25 |
| origin.SleepSiphon 1.7b | 2.7 | 13.6% | 40 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 12.2% | 17 |
| mld.Wisdom 1.0 | 4.8 | 10.7% | 3 |
| gg.Wolverine 2.0 | 6.2 | 8.5% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.7% | 1 |
| DBall.NUKE 0.1 | 8.0 | 6.3% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 6.1% | 0 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 17 / 35 | 4618 |
| 2 | 1 | 69.4 | 90.5 | 23 / 35 | 4540 |
| 3 | 1 | 68.9 | 89.5 | 21 / 35 | 4659 |
| 4 | 1 | 68.9 | 89.2 | 21 / 35 | 4783 |
| 5 | 1 | 68.6 | 88.6 | 20 / 35 | 4731 |
| 6 | 1 | 68.3 | 87.6 | 18 / 35 | 4680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 52 | 65% |
| jekl.StoneGhost 0.7 | 48 | 85% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 86% |
| gg.Wolverine 2.0 | 8 | 88% |
| mld.Wisdom 1.0 | 6 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 100% |
| DBall.NUKE 0.1 | 2 | 50% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 34 | 37% | 68 |
| jekl.StoneGhost 0.7 | 25 | 27% | 52 |
| pe.minimelee.SandboxMiniMelee 1.1 | 13 | 14% | 39 |
| mld.Wisdom 1.0 | 7 | 8% | 21 |
| gg.Wolverine 2.0 | 6 | 7% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 10 |
| DBall.NUKE 0.1 | 2 | 2% | 6 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 147442 melee ticks, 43311 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 32 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46721 sent, 42431 reached their opponent, 10589 virtual hits (25.0% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 486 over 6 battles (81.0 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.5 | 117 / 210 | 1.58 | 20.0% | 34048 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.0% | 117 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.4% | 45 |
| rtk.Tachikoma 1.0 | 2.8 | 15.6% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.4% | 10 |
| franzor.Lizt 1.3.1 | 4.5 | 11.0% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.0 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 20 / 35 | 5954 |
| 2 | 1 | 70.8 | 91.7 | 14 / 35 | 5667 |
| 3 | 1 | 72.2 | 95.9 | 25 / 35 | 5397 |
| 4 | 1 | 72.5 | 96.2 | 26 / 35 | 5827 |
| 5 | 1 | 71.0 | 92.4 | 16 / 35 | 5687 |
| 6 | 1 | 70.7 | 91.7 | 16 / 35 | 5516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 78 | 73% |
| rsalesc.melee.Monk 0.3.6c | 60 | 30% |
| franzor.Lizt 1.3.1 | 34 | 76% |
| oog.melee.CapuletDroid 1.1 | 21 | 71% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 47 | 48% | 81 |
| rtk.Tachikoma 1.0 | 27 | 28% | 90 |
| franzor.Lizt 1.3.1 | 9 | 9% | 2 |
| oog.melee.CapuletDroid 1.1 | 8 | 8% | 30 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 5 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 191288 melee ticks, 94471 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 33 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 58064 sent, 53747 reached their opponent, 11528 virtual hits (21.4% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 485 over 6 battles (80.8 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.0 | 126 / 210 | 1.90 | 18.9% | 27659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.9% | 126 |
| tm.Yuugao 1.0 | 2.2 | 13.0% | 37 |
| shrub.Vapour v159 | 2.8 | 12.5% | 15 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 11.2% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 10.3% | 10 |
| m3thos.Eva00 1.1 | 6.2 | 9.1% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.2% | 8 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.6% | 1 |
| SHAM.WOW 1.4 | 9.2 | 5.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 90.2 | 20 / 35 | 4524 |
| 2 | 1 | 69.1 | 92.1 | 22 / 35 | 4709 |
| 3 | 1 | 69.8 | 92.1 | 22 / 35 | 4965 |
| 4 | 1 | 69.4 | 92.4 | 25 / 35 | 4547 |
| 5 | 1 | 65.9 | 82.5 | 15 / 35 | 4454 |
| 6 | 1 | 68.6 | 90.8 | 22 / 35 | 4460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 43 | 77% |
| tm.Yuugao 1.0 | 41 | 54% |
| Krabb.sliNk.Garm 0.9u | 30 | 80% |
| com.spp.robocode.MostlyHarmless 010 | 26 | 92% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 69% |
| m3thos.Eva00 1.1 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 22 | 25% | 51 |
| shrub.Vapour v159 | 21 | 24% | 47 |
| Krabb.sliNk.Garm 0.9u | 16 | 18% | 36 |
| com.spp.robocode.MostlyHarmless 010 | 13 | 15% | 31 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 10% | 23 |
| m3thos.Eva00 1.1 | 3 | 3% | 14 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 4 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 157171 melee ticks, 46505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 64 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51669 sent, 47020 reached their opponent, 9129 virtual hits (19.4% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 532 over 6 battles (88.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 77.2 | 57 / 210 | 3.05 | 15.1% | 19914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.3% | 95 |
| hadur2.Hadur 3.17.1bb | 2.2 | 15.1% | 57 |
| kc.micro.Figment 1.0 | 2.8 | 14.4% | 26 |
| yagami.Tidus 0.11 | 4.5 | 10.6% | 2 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.0% | 10 |
| mc2.enemy.Original 0.9 | 5.7 | 9.5% | 17 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 3 |
| step.nanoPri 1.0 | 8.5 | 5.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 76.5 | 8 / 35 | 3098 |
| 2 | 3 | 62.5 | 75.2 | 10 / 35 | 3103 |
| 3 | 2 | 64.5 | 77.8 | 11 / 35 | 3687 |
| 4 | 2 | 62.9 | 77.1 | 8 / 35 | 3192 |
| 5 | 2 | 64.4 | 80.3 | 12 / 35 | 3480 |
| 6 | 2 | 62.8 | 76.2 | 8 / 35 | 3354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 42 | 24% |
| kc.micro.Figment 1.0 | 38 | 76% |
| mc2.enemy.Original 0.9 | 8 | 25% |
| pedersen.Grishnakh 1.0 | 8 | 88% |
| yagami.Tidus 0.11 | 7 | 100% |
| dft.Calliope 5.6 | 5 | 40% |

Hadur died in 157 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 61 | 39% | 72 |
| kc.micro.Figment 1.0 | 37 | 24% | 63 |
| yagami.Tidus 0.11 | 17 | 11% | 22 |
| mc2.enemy.Original 0.9 | 12 | 8% | 15 |
| pedersen.Grishnakh 1.0 | 11 | 7% | 18 |
| step.nanoPri 1.0 | 6 | 4% | 7 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 6 |
| dft.Calliope 5.6 | 4 | 3% | 7 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 156815 melee ticks, 38250 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 55 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51219 sent, 46794 reached their opponent, 7042 virtual hits (15.0% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 120 over 6 battles (20.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 93.8 | 148 / 210 | 1.56 | 19.6% | 30209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.6% | 148 |
| DTF.Kludgy 1.2b | 2.3 | 14.5% | 28 |
| ejb.Polaris 1.0.1 | 3.2 | 12.9% | 13 |
| ne.Chimera 1.2 | 3.5 | 13.2% | 6 |
| vStar.RAFzilla 2.15 | 5.3 | 10.2% | 5 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.9% | 6 |
| kurios.DOSexe .9b | 7.7 | 5.7% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.2% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.0% | 1 |
| donjezza.Muncho 1.0 | 9.8 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 93.3 | 24 / 35 | 5269 |
| 2 | 1 | 69.4 | 94.9 | 24 / 35 | 4366 |
| 3 | 1 | 72.2 | 98.4 | 32 / 35 | 5460 |
| 4 | 1 | 69.0 | 90.5 | 22 / 35 | 4971 |
| 5 | 1 | 69.4 | 92.4 | 22 / 35 | 5259 |
| 6 | 1 | 69.6 | 93.0 | 24 / 35 | 4884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 69 | 78% |
| ejb.Polaris 1.0.1 | 44 | 86% |
| ne.Chimera 1.2 | 23 | 87% |
| vStar.RAFzilla 2.15 | 23 | 87% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| kurios.DOSexe .9b | 4 | 75% |
| donjezza.Muncho 1.0 | 2 | 50% |
| sam.Samspin 1.0 | 1 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 28 | 44% | 78 |
| ne.Chimera 1.2 | 13 | 21% | 38 |
| ejb.Polaris 1.0.1 | 12 | 19% | 45 |
| vStar.RAFzilla 2.15 | 5 | 8% | 23 |
| kurios.DOSexe .9b | 2 | 3% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 3 |
| sam.Samspin 1.0 | 1 | 2% | 2 |
| donjezza.Muncho 1.0 | 1 | 2% | 1 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 10 |

Posture (Hadur's M records, 200 rounds): 149365 melee ticks, 57406 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 48520 sent, 44189 reached their opponent, 9133 virtual hits (20.7% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 6 battles (56.5 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 77.7 | 55 / 210 | 3.00 | 15.0% | 19632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 16.9% | 80 |
| hadur2.Hadur 3.17.1bb | 2.0 | 15.0% | 55 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.3% | 22 |
| djc.DynaBot 0.1.1 | 4.5 | 10.9% | 15 |
| rdt199.Warlord 0.73 | 5.5 | 9.6% | 18 |
| br2.MobyDickBot 1.6 | 5.5 | 9.5% | 16 |
| uji.YellohFellah 1.0 | 6.3 | 8.5% | 6 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.0% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 77.1 | 10 / 35 | 3483 |
| 2 | 2 | 62.9 | 79.0 | 9 / 35 | 3358 |
| 3 | 2 | 63.8 | 80.6 | 13 / 35 | 3258 |
| 4 | 2 | 62.8 | 80.0 | 9 / 35 | 3096 |
| 5 | 2 | 61.7 | 74.3 | 8 / 35 | 3319 |
| 6 | 2 | 61.4 | 75.2 | 6 / 35 | 3118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 38 | 45% |
| cx.mini.Nimrod 0.55 | 16 | 56% |
| rdt199.Warlord 0.73 | 14 | 36% |
| djc.DynaBot 0.1.1 | 12 | 75% |
| uji.YellohFellah 1.0 | 12 | 83% |
| br2.MobyDickBot 1.6 | 10 | 40% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 63 | 40% | 77 |
| cx.mini.Nimrod 0.55 | 34 | 21% | 42 |
| rdt199.Warlord 0.73 | 26 | 16% | 38 |
| djc.DynaBot 0.1.1 | 11 | 7% | 20 |
| br2.MobyDickBot 1.6 | 10 | 6% | 13 |
| uji.YellohFellah 1.0 | 5 | 3% | 12 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 5 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 165164 melee ticks, 31308 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 35 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 54197 sent, 49451 reached their opponent, 7019 virtual hits (14.2% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 85 over 6 battles (14.2 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.7 | 108 / 210 | 2.38 | 17.1% | 20736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.1% | 108 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.0% | 26 |
| darkcanuck.Leon 1.01 | 3.0 | 13.4% | 31 |
| nat.PallasHawk 1.0 | 3.5 | 13.3% | 32 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.0% | 7 |
| jrm.Test0 1.0 | 5.8 | 8.6% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.0% | 1 |
| jp.Perpy 16.0 | 8.2 | 6.2% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.2% | 1 |
| stuff.Vlad 0.1 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 90.2 | 22 / 35 | 3462 |
| 2 | 1 | 64.1 | 78.7 | 18 / 35 | 3067 |
| 3 | 1 | 66.4 | 85.1 | 20 / 35 | 3329 |
| 4 | 1 | 66.2 | 84.8 | 16 / 35 | 3650 |
| 5 | 1 | 66.4 | 85.4 | 17 / 35 | 3419 |
| 6 | 1 | 66.1 | 83.8 | 15 / 35 | 3809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 46 | 74% |
| bts.wiki.RipCurl 0.9b | 43 | 81% |
| nat.PallasHawk 1.0 | 38 | 74% |
| brainfade.melee.Genghis 0.36 | 8 | 75% |
| jrm.Test0 1.0 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 50% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 31 | 30% | 54 |
| darkcanuck.Leon 1.01 | 21 | 20% | 61 |
| nat.PallasHawk 1.0 | 19 | 18% | 44 |
| jrm.Test0 1.0 | 13 | 13% | 16 |
| brainfade.melee.Genghis 0.36 | 11 | 11% | 17 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 6 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 5 |
| jp.Perpy 16.0 | 2 | 2% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 205 rounds): 135683 melee ticks, 35990 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46716 sent, 41933 reached their opponent, 7273 virtual hits (17.3% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 82 over 6 battles (13.7 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 78.1 | 40 / 210 | 2.97 | 14.5% | 20655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.2% | 97 |
| ags.Glacier 0.2.11 | 1.7 | 16.7% | 42 |
| hadur2.Hadur 3.17.1bb | 3.0 | 14.5% | 40 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.0% | 9 |
| shinh.Entangled 0.3 | 4.5 | 12.4% | 22 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 1 |
| maribo.FollowFire 1 | 8.2 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 81.6 | 9 / 35 | 3787 |
| 2 | 3 | 63.0 | 78.7 | 7 / 35 | 3269 |
| 3 | 3 | 61.5 | 74.0 | 5 / 35 | 3336 |
| 4 | 3 | 64.5 | 81.6 | 9 / 35 | 3712 |
| 5 | 3 | 62.4 | 74.6 | 5 / 35 | 3376 |
| 6 | 3 | 62.2 | 78.1 | 5 / 35 | 3175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 42 | 17% |
| ags.Glacier 0.2.11 | 39 | 56% |
| shinh.Entangled 0.3 | 13 | 38% |
| gh.micro.Gruweltje 0.7 | 6 | 83% |
| stelo.Wang 1.0 | 2 | 50% |

Hadur died in 172 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 62 | 36% | 71 |
| ags.Glacier 0.2.11 | 56 | 33% | 77 |
| shinh.Entangled 0.3 | 23 | 13% | 28 |
| gh.micro.Gruweltje 0.7 | 13 | 8% | 18 |
| stelo.Wang 1.0 | 7 | 4% | 7 |
| maribo.FollowFire 1 | 6 | 3% | 5 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 148656 melee ticks, 36627 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 86 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 86 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44078 sent, 39342 reached their opponent, 6784 virtual hits (17.2% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 6 battles (25.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.9 | 151 / 210 | 1.55 | 20.0% | 31134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.0% | 151 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 17 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 30 |
| Lo_Ian.Gandalf_V4 4.0 | 4.8 | 9.5% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.6% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.6% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.4% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.5 | 8.2% | 0 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.0 | 24 / 35 | 5061 |
| 2 | 1 | 70.4 | 92.4 | 26 / 35 | 5354 |
| 3 | 1 | 71.2 | 95.2 | 28 / 35 | 5449 |
| 4 | 1 | 71.3 | 97.1 | 28 / 35 | 5323 |
| 5 | 1 | 69.5 | 91.7 | 23 / 35 | 4832 |
| 6 | 1 | 69.9 | 92.7 | 22 / 35 | 5115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 93% |
| catcat20.shape.Theta 0.018 | 51 | 59% |
| sanyi.mikrobi.Roberto 1.0 | 18 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 82% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 67% |
| pa.Improved 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 25 | 41% | 49 |
| simonton.micro.Sprout 1.1.3 | 18 | 30% | 86 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 8% | 24 |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 8% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 9 |
| pa.Improved 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 147983 melee ticks, 50037 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 40 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 47165 sent, 43061 reached their opponent, 11132 virtual hits (25.9% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 217 over 6 battles (36.2 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.7 | 114 / 210 | 2.20 | 18.4% | 27871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.4% | 114 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 22 |
| emp.Yngwie 1.11 | 2.8 | 13.1% | 47 |
| mld.DustBunny 3.8 | 3.7 | 12.3% | 5 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.2% | 6 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.1% | 11 |
| lambdaxy.TBot 0.1 | 7.3 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 5.2% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 19 / 35 | 4575 |
| 2 | 1 | 68.9 | 88.3 | 19 / 35 | 4989 |
| 3 | 1 | 69.5 | 90.2 | 21 / 35 | 4759 |
| 4 | 1 | 66.1 | 81.6 | 12 / 35 | 4431 |
| 5 | 1 | 66.2 | 82.2 | 20 / 35 | 4103 |
| 6 | 1 | 70.2 | 93.3 | 23 / 35 | 5014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 50 | 52% |
| kawigi.micro.Shiz 1.1 | 33 | 94% |
| mld.DustBunny 3.8 | 23 | 96% |
| cb.nano.Insomnia 1.0 | 19 | 79% |
| kawigi.robot.Girl 1.2 | 17 | 82% |
| divineomega.TrialBot 0.003 | 7 | 71% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 35% | 78 |
| mld.DustBunny 3.8 | 13 | 13% | 37 |
| kawigi.micro.Shiz 1.1 | 13 | 13% | 34 |
| cb.nano.Insomnia 1.0 | 13 | 13% | 13 |
| divineomega.TrialBot 0.003 | 10 | 10% | 20 |
| kawigi.robot.Girl 1.2 | 8 | 8% | 18 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 169111 melee ticks, 49216 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55938 sent, 51505 reached their opponent, 8694 virtual hits (16.9% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 312 over 6 battles (52.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.4 | 109 / 210 | 2.22 | 18.4% | 28888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.4% | 109 |
| gh.Griezel 0.5.2 | 2.2 | 16.3% | 52 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.1% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.3% | 32 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.1% | 0 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.7% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.5% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.4% | 2 |
| asd.Cthulhu 1.3 | 9.2 | 4.6% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.9 | 18 / 35 | 4824 |
| 2 | 1 | 68.9 | 89.2 | 19 / 35 | 4721 |
| 3 | 1 | 67.1 | 81.6 | 16 / 35 | 4732 |
| 4 | 1 | 69.2 | 88.3 | 22 / 35 | 4717 |
| 5 | 1 | 68.3 | 86.7 | 17 / 35 | 4978 |
| 6 | 1 | 68.0 | 84.8 | 17 / 35 | 4916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 69 | 71% |
| techdude.forest.FlamingForest 1.1 | 32 | 63% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 96% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| tvv.nano.Polaris 1.2 | 3 | 67% |

Hadur died in 103 of 210 rounds, at a mean tick of 1119. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 36 | 35% | 82 |
| techdude.forest.FlamingForest 1.1 | 21 | 20% | 42 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 18% | 35 |
| bvh.fnr.Fenrir 0.36l | 8 | 8% | 14 |
| stelo.IntrinsicVolatility 1.4 | 5 | 5% | 10 |
| divineomega.DivineBot 1.9.4.5 | 4 | 4% | 14 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 9 |
| asd.Cthulhu 1.3 | 4 | 4% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 191260 melee ticks, 58651 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 41 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 61544 sent, 57024 reached their opponent, 10061 virtual hits (17.6% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 506 over 6 battles (84.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.3 | 97 / 210 | 2.41 | 17.9% | 29913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.9% | 97 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.1% | 33 |
| cx.BlestPain 1.41 | 3.2 | 13.6% | 51 |
| et.Predator 1.8 | 3.2 | 12.7% | 15 |
| ahf.NanoAndrew .4 | 5.2 | 10.5% | 8 |
| nic.Nicator 2.4 | 6.0 | 9.9% | 6 |
| maribo.melee.BMV 0.1 | 6.7 | 8.7% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.3 | 14 / 35 | 5139 |
| 2 | 1 | 67.5 | 83.5 | 16 / 35 | 4949 |
| 3 | 1 | 68.5 | 84.8 | 19 / 35 | 5278 |
| 4 | 1 | 66.2 | 83.2 | 13 / 35 | 4632 |
| 5 | 1 | 67.3 | 83.5 | 18 / 35 | 4656 |
| 6 | 1 | 68.1 | 84.8 | 17 / 35 | 5259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 43 | 35% |
| oog.melee.Mercutio 1.0 | 39 | 67% |
| et.Predator 1.8 | 33 | 82% |
| ahf.NanoAndrew .4 | 16 | 100% |
| nic.Nicator 2.4 | 8 | 75% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| edu.otg.spr.TheTeacher 1.2 | 4 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1100. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 46 | 39% | 63 |
| oog.melee.Mercutio 1.0 | 33 | 28% | 54 |
| et.Predator 1.8 | 16 | 13% | 39 |
| ahf.NanoAndrew .4 | 6 | 5% | 21 |
| maribo.melee.BMV 0.1 | 6 | 5% | 10 |
| nic.Nicator 2.4 | 5 | 4% | 17 |
| tex.Longbot 0.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 169100 melee ticks, 58156 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 55 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 56307 sent, 51875 reached their opponent, 11845 virtual hits (22.8% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 370 over 6 battles (61.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 90.3 | 129 / 210 | 1.88 | 18.8% | 25743 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.8% | 129 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.7% | 26 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.5% | 23 |
| uji.DBH 1.1 | 3.8 | 11.3% | 12 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.9% | 4 |
| ratosh.Nobo 0.21 | 6.3 | 8.3% | 2 |
| sigterm.Sigterm 1.0 | 6.3 | 8.4% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 7.6% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.9 | 20 / 35 | 4189 |
| 2 | 1 | 68.5 | 91.4 | 21 / 35 | 4326 |
| 3 | 1 | 69.4 | 90.8 | 27 / 35 | 4617 |
| 4 | 1 | 68.2 | 89.5 | 20 / 35 | 4361 |
| 5 | 1 | 67.1 | 88.9 | 20 / 35 | 3777 |
| 6 | 1 | 69.1 | 93.0 | 21 / 35 | 4473 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 59 | 78% |
| uji.DBH 1.1 | 34 | 79% |
| agd.Mooserwirt2 2.7 | 31 | 74% |
| sigterm.Sigterm 1.0 | 10 | 50% |
| stelo.WangRobot 1.0 | 9 | 89% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 100% |
| ratosh.Nobo 0.21 | 7 | 100% |
| spinnercat.Robovirus 2.718 | 4 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 32 | 39% | 78 |
| uji.DBH 1.1 | 15 | 18% | 32 |
| agd.Mooserwirt2 2.7 | 12 | 14% | 38 |
| sigterm.Sigterm 1.0 | 7 | 8% | 16 |
| ratosh.Nobo 0.21 | 4 | 5% | 13 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 10 |
| stelo.WangRobot 1.0 | 2 | 2% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 142940 melee ticks, 49067 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 70 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 48800 sent, 44328 reached their opponent, 10156 virtual hits (22.9% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 428 over 6 battles (71.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 96.6 | 179 / 210 | 1.31 | 21.4% | 33480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 21.4% | 179 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.4% | 17 |
| mld.Infinity 2.2 | 3.7 | 12.0% | 8 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.6% | 2 |
| erdnis.Rover 0.3 | 4.3 | 10.5% | 4 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.6% | 1 |
| mbh.Mbh 0.1 | 7.2 | 7.3% | 0 |
| pac.ABC 2.1 | 8.0 | 6.6% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 97.5 | 31 / 35 | 5815 |
| 2 | 1 | 72.6 | 97.1 | 30 / 35 | 5729 |
| 3 | 1 | 72.7 | 98.1 | 32 / 35 | 5483 |
| 4 | 1 | 71.3 | 93.0 | 28 / 35 | 5445 |
| 5 | 1 | 71.4 | 94.6 | 26 / 35 | 5454 |
| 6 | 1 | 73.0 | 99.0 | 32 / 35 | 5554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 103 | 96% |
| mld.Infinity 2.2 | 28 | 93% |
| krillr.mini.JointStrike 2.0.0 | 21 | 90% |
| erdnis.Rover 0.3 | 15 | 73% |
| pac.ABC 2.1 | 11 | 100% |
| patson.PatsonTestBot 1.0 | 11 | 91% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 9 | 24% | 70 |
| krillr.mini.JointStrike 2.0.0 | 9 | 24% | 39 |
| erdnis.Rover 0.3 | 8 | 22% | 26 |
| mld.Infinity 2.2 | 3 | 8% | 36 |
| patson.PatsonTestBot 1.0 | 3 | 8% | 17 |
| mbh.Mbh 0.1 | 1 | 3% | 7 |
| pac.ABC 2.1 | 0 | 0% | 6 |
| pbg.R2D2 1.0 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 135551 melee ticks, 48188 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 75 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45872 sent, 41504 reached their opponent, 10470 virtual hits (25.2% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 611 over 6 battles (101.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 93.0 | 139 / 210 | 1.63 | 20.3% | 32371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.3% | 139 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 33 |
| fwb.Nine 1.0.1 | 3.2 | 12.1% | 19 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.1% | 2 |
| catcat20.Rabbit 0.001 | 4.7 | 10.3% | 12 |
| m3thos.mini.Eva01 0.5.5 | 5.7 | 8.8% | 2 |
| bayen.nut.Squirrel 1.615 | 7.0 | 6.9% | 3 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 6.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.0 | 23 / 35 | 5694 |
| 2 | 1 | 70.0 | 92.1 | 20 / 35 | 5185 |
| 3 | 1 | 71.0 | 94.3 | 26 / 35 | 5327 |
| 4 | 1 | 70.2 | 92.1 | 22 / 35 | 5105 |
| 5 | 1 | 72.0 | 95.6 | 26 / 35 | 5955 |
| 6 | 1 | 69.8 | 89.8 | 22 / 35 | 5105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 73% |
| fwb.Nine 1.0.1 | 44 | 89% |
| catcat20.Rabbit 0.001 | 30 | 83% |
| nz.jdc.nano.GridFu 1.0 | 7 | 86% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 1063. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 41 | 54% | 92 |
| fwb.Nine 1.0.1 | 15 | 20% | 29 |
| catcat20.Rabbit 0.001 | 8 | 11% | 42 |
| nz.jdc.nano.GridFu 1.0 | 3 | 4% | 18 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 176325 melee ticks, 56566 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 33 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 56013 sent, 51401 reached their opponent, 12119 virtual hits (23.6% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 615 over 6 battles (102.5 per battle, most in one battle 231). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.4 | 112 / 210 | 1.78 | 19.4% | 31226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 19.4% | 112 |
| eem.EvBot v4.6.16 | 1.8 | 16.5% | 67 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.0% | 6 |
| eld.Hmm 1.0 | 5.0 | 9.0% | 17 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.9% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 94.0 | 23 / 35 | 5434 |
| 2 | 1 | 70.0 | 92.4 | 18 / 35 | 5542 |
| 3 | 1 | 69.2 | 89.8 | 18 / 35 | 5219 |
| 4 | 1 | 70.3 | 92.7 | 20 / 35 | 5344 |
| 5 | 1 | 69.6 | 92.7 | 19 / 35 | 4848 |
| 6 | 2 | 67.7 | 86.7 | 14 / 35 | 4839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 123 | 59% |
| dummy.mini.Scimitar 1.01 | 26 | 85% |
| cf.RiO.RiOx 4.2.1 | 13 | 92% |
| eld.Hmm 1.0 | 11 | 18% |
| el.JumpShoot 0.2 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1321. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 61 | 59% | 113 |
| dummy.mini.Scimitar 1.01 | 17 | 17% | 52 |
| eld.Hmm 1.0 | 11 | 11% | 17 |
| cf.RiO.RiOx 4.2.1 | 6 | 6% | 17 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| PSW.Relentless 0.1 | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 190559 melee ticks, 83424 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 73 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 56140 sent, 51659 reached their opponent, 9525 virtual hits (18.4% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 93 over 6 battles (15.5 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.5 | 100 / 210 | 2.03 | 17.8% | 25588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.8% | 100 |
| pe.SandboxDT 2.71m | 2.0 | 16.7% | 60 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.9% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.7% | 12 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 6 |
| tad.Dalek98 0.98 | 6.5 | 6.8% | 1 |
| yk.JahRoslav 1.1 | 6.8 | 7.2% | 2 |
| gg.Squaraus 0.6 | 7.8 | 5.7% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.9% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 89.8 | 15 / 35 | 4387 |
| 2 | 1 | 67.8 | 89.5 | 17 / 35 | 4127 |
| 3 | 1 | 67.2 | 86.3 | 13 / 35 | 4177 |
| 4 | 1 | 69.8 | 91.4 | 22 / 35 | 4647 |
| 5 | 1 | 66.5 | 83.8 | 14 / 35 | 4018 |
| 6 | 1 | 68.9 | 90.2 | 19 / 35 | 4232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 55 | 42% |
| kvk.HebusLeTroll 0.35 | 43 | 81% |
| jlm.javaDisturbance 0.59 | 39 | 85% |
| bigpete.Stewie 1.0 | 6 | 83% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 2 | 0% |
| yk.JahRoslav 1.1 | 2 | 0% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 52 | 47% | 88 |
| kvk.HebusLeTroll 0.35 | 29 | 26% | 56 |
| jlm.javaDisturbance 0.59 | 13 | 12% | 40 |
| bigpete.Stewie 1.0 | 7 | 6% | 11 |
| tad.Dalek98 0.98 | 6 | 5% | 8 |
| pbg.NinjaX 1.2 | 2 | 2% | 4 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |

Posture (Hadur's M records, 202 rounds): 164002 melee ticks, 48709 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 27 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 53457 sent, 49020 reached their opponent, 8338 virtual hits (17.0% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 699 over 6 battles (116.5 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.2 | 143 / 210 | 1.61 | 20.1% | 30926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.1% | 143 |
| pe.SandboxLump 1.52 | 2.0 | 16.6% | 41 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.4% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.6% | 9 |
| cw.megas.Blade 0.8 | 6.2 | 8.5% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.7% | 1 |
| sample.Walls 1.0 | 8.0 | 7.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 96.8 | 27 / 35 | 5447 |
| 2 | 1 | 71.0 | 92.4 | 26 / 35 | 5075 |
| 3 | 1 | 70.7 | 91.7 | 22 / 35 | 5108 |
| 4 | 1 | 71.2 | 94.6 | 23 / 35 | 5011 |
| 5 | 1 | 70.2 | 92.7 | 24 / 35 | 5091 |
| 6 | 1 | 70.6 | 90.8 | 21 / 35 | 5194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 90 | 74% |
| cre.Karolos 0.32 | 50 | 86% |
| stelo.RamTrackSurfer 1.2 | 15 | 67% |
| stelo.AreaTargetingBot 1.1 | 13 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 80% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 34 | 47% | 96 |
| cre.Karolos 0.32 | 16 | 22% | 49 |
| stelo.RamTrackSurfer 1.2 | 7 | 10% | 23 |
| stelo.AreaTargetingBot 1.1 | 7 | 10% | 21 |
| cw.megas.Blade 0.8 | 2 | 3% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 7 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 134056 melee ticks, 47505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 46 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 42430 sent, 37953 reached their opponent, 12280 virtual hits (32.4% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 724 over 6 battles (120.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.7 | 61 / 210 | 3.00 | 15.0% | 19813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 15.0% | 61 |
| rz.GlowBlowMelee 1.4 | 3.2 | 13.8% | 39 |
| davidalves.Phoenix 0.54 | 3.2 | 13.5% | 47 |
| florent.XSeries.X2 0.12 | 3.3 | 13.1% | 33 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.6% | 25 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.1% | 1 |
| lunchie.Lunchbox 0.93 | 8.3 | 5.8% | 0 |
| as.FrankTheTank 1.3 | 8.7 | 5.4% | 0 |
| evd.X1 0.01 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.3 | 74.0 | 6 / 35 | 3265 |
| 2 | 1 | 63.8 | 81.0 | 11 / 35 | 3144 |
| 3 | 1 | 63.3 | 78.7 | 11 / 35 | 3292 |
| 4 | 2 | 62.8 | 77.1 | 11 / 35 | 3126 |
| 5 | 1 | 64.1 | 79.0 | 13 / 35 | 3573 |
| 6 | 1 | 62.2 | 76.5 | 9 / 35 | 3413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 28 | 61% |
| davidalves.Phoenix 0.54 | 23 | 48% |
| pedersen.Ugluk 1.1.1 | 20 | 65% |
| florent.XSeries.X2 0.12 | 15 | 40% |
| stelo.SoJNanoMelee 1.1 | 8 | 88% |
| oog.melee.Corsair 1.0 | 7 | 43% |
| as.FrankTheTank 1.3 | 4 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 35 | 22% | 49 |
| florent.XSeries.X2 0.12 | 35 | 22% | 44 |
| pedersen.Ugluk 1.1.1 | 33 | 21% | 44 |
| davidalves.Phoenix 0.54 | 29 | 18% | 38 |
| oog.melee.Corsair 1.0 | 10 | 6% | 19 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 6 |
| stelo.SoJNanoMelee 1.1 | 2 | 1% | 3 |
| evd.X1 0.01 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 5 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 137377 melee ticks, 29878 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 52 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 47115 sent, 42257 reached their opponent, 8286 virtual hits (19.6% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 85 over 6 battles (14.2 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.2 | 130 / 210 | 2.33 | 17.8% | 21623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.8% | 130 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.6% | 25 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.8% | 11 |
| jdw.Hurricane 1.4 | 3.8 | 11.6% | 20 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.6% | 11 |
| ds.Oo 2.2 | 5.7 | 9.0% | 10 |
| awesomeness.Elite 1.0 | 7.2 | 7.7% | 2 |
| adt.Ar2 1.1 | 8.2 | 7.0% | 2 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.6 | 24 / 35 | 3568 |
| 2 | 1 | 66.4 | 83.8 | 21 / 35 | 3677 |
| 3 | 1 | 67.4 | 90.8 | 19 / 35 | 3604 |
| 4 | 1 | 65.4 | 81.3 | 19 / 35 | 3335 |
| 5 | 1 | 67.8 | 87.0 | 23 / 35 | 3828 |
| 6 | 1 | 67.6 | 87.0 | 24 / 35 | 3611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 86% |
| jdw.Hurricane 1.4 | 30 | 83% |
| voidious.micro.BlitzBat 1.05 | 30 | 97% |
| gre.svman4.Morfeas 1.4.1 | 11 | 82% |
| ds.Oo 2.2 | 11 | 82% |
| awesomeness.Elite 1.0 | 10 | 90% |
| gjr.Cephalosporin 0.1 | 3 | 67% |
| adt.Ar2 1.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 22 | 28% | 60 |
| jdw.Hurricane 1.4 | 17 | 21% | 40 |
| voidious.micro.BlitzBat 1.05 | 11 | 14% | 34 |
| gre.svman4.Morfeas 1.4.1 | 8 | 10% | 17 |
| awesomeness.Elite 1.0 | 7 | 9% | 17 |
| ds.Oo 2.2 | 6 | 8% | 21 |
| adt.Ar2 1.1 | 5 | 6% | 11 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 6 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |

Posture (Hadur's M records, 203 rounds): 125635 melee ticks, 25674 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 26 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 44858 sent, 40424 reached their opponent, 7087 virtual hits (17.5% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 212 over 6 battles (35.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.6 | 124 / 210 | 1.76 | 19.4% | 31861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.4% | 124 |
| ak.Fermat 2.0 | 2.0 | 15.6% | 44 |
| lrem.Spectre 0.4.4 | 3.5 | 12.5% | 17 |
| shu.nitro.LENIN .T34 | 3.5 | 12.8% | 19 |
| js.PinBall 1.6 | 5.2 | 10.3% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.3% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.2 | 7.6% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.9% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 21 / 35 | 5238 |
| 2 | 1 | 69.4 | 88.9 | 20 / 35 | 5137 |
| 3 | 1 | 68.8 | 88.3 | 16 / 35 | 4927 |
| 4 | 1 | 70.7 | 93.7 | 23 / 35 | 5565 |
| 5 | 1 | 71.0 | 94.6 | 23 / 35 | 5593 |
| 6 | 1 | 70.3 | 92.1 | 21 / 35 | 5401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 63 | 63% |
| shu.nitro.LENIN .T34 | 42 | 83% |
| lrem.Spectre 0.4.4 | 34 | 82% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 80% |
| js.PinBall 1.6 | 9 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 41 | 47% | 76 |
| lrem.Spectre 0.4.4 | 14 | 16% | 40 |
| shu.nitro.LENIN .T34 | 11 | 13% | 47 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 9% | 18 |
| js.PinBall 1.6 | 5 | 6% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 6% | 6 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 8 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 172090 melee ticks, 47148 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55346 sent, 50687 reached their opponent, 12978 virtual hits (25.6% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 306 over 6 battles (51.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 92.7 | 161 / 210 | 1.66 | 19.8% | 27482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.8% | 161 |
| mk.Alpha 0.2.1 | 2.0 | 14.5% | 33 |
| EH.Eagle 1.0.6 | 3.5 | 10.9% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 9.0% | 1 |
| wee.Gem 1.8.4 | 5.7 | 8.8% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 8.7% | 0 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.2% | 0 |
| joe.ADinosaur 1.0 | 6.8 | 8.7% | 0 |
| caimano.Furia_Ceca 0.22 | 7.8 | 7.3% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.8 | 25 / 35 | 4145 |
| 2 | 1 | 69.5 | 92.4 | 27 / 35 | 4405 |
| 3 | 1 | 71.3 | 96.2 | 31 / 35 | 5052 |
| 4 | 1 | 69.4 | 92.7 | 27 / 35 | 4510 |
| 5 | 1 | 70.6 | 95.6 | 28 / 35 | 4754 |
| 6 | 1 | 68.8 | 89.5 | 23 / 35 | 4616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 107 | 90% |
| EH.Eagle 1.0.6 | 24 | 96% |
| wee.Gem 1.8.4 | 15 | 93% |
| throxbot.ThroxBot 0.1 | 10 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 25 | 49% | 96 |
| EH.Eagle 1.0.6 | 7 | 14% | 32 |
| throxbot.ThroxBot 0.1 | 6 | 12% | 20 |
| joe.ADinosaur 1.0 | 4 | 8% | 8 |
| caimano.Furia_Ceca 0.22 | 4 | 8% | 7 |
| wee.Gem 1.8.4 | 1 | 2% | 24 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 2% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 9 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 135072 melee ticks, 41718 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 47 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44952 sent, 40548 reached their opponent, 9967 virtual hits (24.6% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 6 battles (29.2 per battle, most in one battle 112). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 87.0 | 120 / 210 | 2.17 | 17.6% | 21956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.6% | 120 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 37 |
| uji.Antique 1.0 | 3.0 | 12.4% | 23 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.9% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.9% | 16 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.1% | 4 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.2% | 6 |
| matt.advanced.Katana 1.0 | 8.5 | 6.2% | 0 |
| stelo.Lifestealer 1.0 | 8.8 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 88.6 | 21 / 35 | 3680 |
| 2 | 1 | 66.2 | 84.1 | 21 / 35 | 3478 |
| 3 | 1 | 67.5 | 87.6 | 22 / 35 | 3676 |
| 4 | 1 | 65.9 | 86.0 | 15 / 35 | 3760 |
| 5 | 1 | 67.4 | 88.9 | 21 / 35 | 3789 |
| 6 | 1 | 66.5 | 86.7 | 20 / 35 | 3573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 67 | 81% |
| uji.Antique 1.0 | 47 | 83% |
| qohnil.blot.BlotBot 3.61 | 15 | 53% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| ahr.ice.Ice 1.0.2 | 8 | 63% |
| amk.ChumbaWumba 0.3 | 7 | 57% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 28 | 31% | 55 |
| uji.Antique 1.0 | 23 | 25% | 61 |
| qohnil.blot.BlotBot 3.61 | 14 | 15% | 35 |
| pfvicm.Sobieski 7.2.3b | 12 | 13% | 24 |
| amk.ChumbaWumba 0.3 | 4 | 4% | 12 |
| ahr.ice.Ice 1.0.2 | 3 | 3% | 10 |
| matt.advanced.Katana 1.0 | 3 | 3% | 5 |
| stelo.Lifestealer 1.0 | 3 | 3% | 5 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 134429 melee ticks, 31878 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 68 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 68 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45731 sent, 41319 reached their opponent, 6465 virtual hits (15.6% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 265 over 6 battles (44.2 per battle, most in one battle 108). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.2 | 103 / 210 | 2.33 | 18.0% | 25023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.0% | 103 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.2% | 55 |
| deewiant.Anomaly 0.2 | 2.7 | 14.5% | 37 |
| jok.PheonixM 0.1.2 | 4.5 | 11.1% | 7 |
| myl.micro.Troodon 1.10 | 4.5 | 11.5% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 6.1% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 6.3% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.5% | 1 |
| jangs.ns51 1.0 | 9.5 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.6 | 14 / 35 | 4248 |
| 2 | 1 | 69.3 | 89.2 | 19 / 35 | 4309 |
| 3 | 1 | 66.9 | 83.5 | 15 / 35 | 3809 |
| 4 | 1 | 68.5 | 88.3 | 19 / 35 | 3977 |
| 5 | 1 | 67.1 | 81.3 | 16 / 35 | 4205 |
| 6 | 1 | 68.8 | 88.3 | 20 / 35 | 4475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 70% |
| zyx.mega.YersiniaPestis 3.1 | 41 | 54% |
| jok.PheonixM 0.1.2 | 22 | 86% |
| myl.micro.Troodon 1.10 | 16 | 88% |
| DBall.Anarchy 0.1 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 40 | 37% | 83 |
| zyx.mega.YersiniaPestis 3.1 | 35 | 32% | 58 |
| myl.micro.Troodon 1.10 | 13 | 12% | 24 |
| jok.PheonixM 0.1.2 | 12 | 11% | 30 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 4 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 168443 melee ticks, 53274 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 57 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 56113 sent, 51583 reached their opponent, 8667 virtual hits (16.8% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 694 over 6 battles (115.7 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 74.9 | 53 / 210 | 3.26 | 14.6% | 20739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.3 | 14.6% | 53 |
| darkcanuck.B26354 1.06 | 2.3 | 14.1% | 52 |
| catcat20.Matcha 0.006 | 3.3 | 13.1% | 41 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.7% | 21 |
| oog.melee.Capulet 1.2 | 4.0 | 12.5% | 29 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.8% | 6 |
| tripphippy.Alice 1.1 | 7.7 | 7.5% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 6.9% | 3 |
| ntc.Opposite 1.5 | 8.0 | 7.2% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.8 | 69.8 | 6 / 35 | 3658 |
| 2 | 1 | 63.0 | 77.1 | 11 / 35 | 3382 |
| 3 | 1 | 63.7 | 79.4 | 11 / 35 | 3446 |
| 4 | 2 | 60.0 | 71.1 | 7 / 35 | 3100 |
| 5 | 1 | 63.2 | 77.1 | 9 / 35 | 3707 |
| 6 | 2 | 62.1 | 74.6 | 9 / 35 | 3446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 62% |
| darkcanuck.B26354 1.06 | 25 | 40% |
| catcat20.Matcha 0.006 | 20 | 50% |
| stelo.PastFuture 2.3.2 | 11 | 55% |
| tripphippy.Alice 1.1 | 5 | 100% |
| intruder.PrairieWolf 2.61 | 3 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 42 | 26% | 53 |
| catcat20.Matcha 0.006 | 34 | 21% | 46 |
| stelo.PastFuture 2.3.2 | 31 | 19% | 41 |
| oog.melee.Capulet 1.2 | 22 | 13% | 36 |
| tripphippy.Alice 1.1 | 10 | 6% | 11 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 2% | 6 |
| ntc.Opposite 1.5 | 4 | 2% | 4 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 158312 melee ticks, 25599 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 52 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51897 sent, 47238 reached their opponent, 8269 virtual hits (17.5% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 652 over 6 battles (108.7 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 76.6 | 53 / 210 | 3.11 | 14.8% | 18975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.8% | 104 |
| hadur2.Hadur 3.17.1bb | 2.2 | 14.8% | 53 |
| gh.mini.Griezel 0.2 | 3.0 | 13.1% | 37 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.7% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.0% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.4% | 0 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.6% | 1 |
| fm.mammillarias 1.3 | 8.7 | 5.7% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.9% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 78.4 | 11 / 35 | 3113 |
| 2 | 2 | 64.4 | 80.6 | 11 / 35 | 3414 |
| 3 | 2 | 62.7 | 76.2 | 7 / 35 | 3198 |
| 4 | 3 | 62.3 | 75.2 | 7 / 35 | 3134 |
| 5 | 2 | 61.9 | 74.6 | 8 / 35 | 3145 |
| 6 | 2 | 61.9 | 74.3 | 9 / 35 | 2971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 45% |
| gh.mini.Griezel 0.2 | 27 | 52% |
| d414.nano.Quantum 1.0.0 | 10 | 80% |
| spinnercat.micro.Tyger 0.1 | 7 | 71% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 69 | 42% | 98 |
| gh.mini.Griezel 0.2 | 31 | 19% | 45 |
| spinnercat.micro.Tyger 0.1 | 22 | 13% | 26 |
| d414.nano.Quantum 1.0.0 | 17 | 10% | 22 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 6 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 6 |
| fm.mammillarias 1.3 | 5 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 0 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 157043 melee ticks, 31317 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 58 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 51240 sent, 46524 reached their opponent, 7776 virtual hits (16.7% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 591 over 6 battles (98.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 83.4 | 105 / 210 | 2.49 | 16.8% | 23687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 16.8% | 105 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 14.9% | 54 |
| apc.botM 3.0 | 3.0 | 12.5% | 22 |
| lxx.ConceptA 0.8 | 4.0 | 10.6% | 5 |
| vjik.UnViolation 1.1 | 5.2 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 5.8 | 8.6% | 5 |
| panzer.Panzer 0.2 | 7.5 | 7.4% | 0 |
| yk.JahMicro 1.0 | 8.2 | 7.0% | 8 |
| conscience.Electron 1.3g | 8.3 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 86.3 | 17 / 35 | 3726 |
| 2 | 1 | 63.6 | 77.5 | 17 / 35 | 3797 |
| 3 | 2 | 64.1 | 80.6 | 13 / 35 | 3853 |
| 4 | 1 | 65.8 | 82.5 | 19 / 35 | 4255 |
| 5 | 1 | 64.7 | 82.5 | 17 / 35 | 3685 |
| 6 | 1 | 68.2 | 91.1 | 22 / 35 | 4371 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 73 | 53% |
| apc.botM 3.0 | 37 | 81% |
| vjik.UnViolation 1.1 | 12 | 92% |
| yk.JahMicro 1.0 | 8 | 50% |
| lxx.ConceptA 0.8 | 8 | 75% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| donjezza.Jezza 1.0 | 6 | 83% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 44 | 40% | 83 |
| lxx.ConceptA 0.8 | 19 | 17% | 22 |
| apc.botM 3.0 | 13 | 12% | 43 |
| yk.JahMicro 1.0 | 7 | 6% | 9 |
| vjik.UnViolation 1.1 | 6 | 5% | 25 |
| bayen.UbaMicro 1.4 | 6 | 5% | 10 |
| conscience.Electron 1.3g | 5 | 5% | 6 |
| panzer.Panzer 0.2 | 4 | 4% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 122992 melee ticks, 46674 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 71 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 42769 sent, 38369 reached their opponent, 7587 virtual hits (19.8% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 542 over 6 battles (90.3 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.2 | 108 / 210 | 2.24 | 18.0% | 25552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.0% | 108 |
| maribo.Quester 0.3 | 2.0 | 16.0% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.7% | 24 |
| labg.Cataclysm 2.05 | 4.3 | 11.4% | 20 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.6% | 22 |
| baal.nano.N 1.42 | 6.0 | 9.1% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 7.0 | 7.9% | 4 |
| zyx.micro.Ant 1.1 | 8.5 | 4.8% | 0 |
| sanja.First 0.1 | 8.8 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.1 | 18 / 35 | 4267 |
| 2 | 1 | 70.4 | 93.0 | 24 / 35 | 4742 |
| 3 | 1 | 66.2 | 82.2 | 14 / 35 | 4058 |
| 4 | 1 | 67.0 | 86.0 | 15 / 35 | 3923 |
| 5 | 1 | 67.3 | 84.4 | 17 / 35 | 4099 |
| 6 | 1 | 68.7 | 87.3 | 20 / 35 | 4463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 63 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 75% |
| gre.svman4.Leonidas 1.3.2 | 24 | 83% |
| labg.Cataclysm 2.05 | 18 | 56% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 25% |

Hadur died in 106 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 38 | 36% | 88 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 21% | 45 |
| labg.Cataclysm 2.05 | 14 | 13% | 23 |
| gre.svman4.Leonidas 1.3.2 | 13 | 12% | 34 |
| zyx.micro.Ant 1.1 | 6 | 6% | 7 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 5% | 6 |
| baal.nano.N 1.42 | 2 | 2% | 4 |
| sanja.First 0.1 | 2 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 176905 melee ticks, 48569 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 70 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 56871 sent, 52326 reached their opponent, 8372 virtual hits (16.0% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 435 over 6 battles (72.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.5 | 77 / 210 | 2.30 | 17.1% | 25716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.5 | 17.1% | 77 |
| kid.Gladiator .7.2 | 2.0 | 16.6% | 55 |
| stelo.Spread 0.9 | 2.5 | 16.0% | 52 |
| jcs.Seth 1.8 | 4.2 | 11.4% | 20 |
| tcf.Reach 3 | 5.0 | 10.6% | 5 |
| cli.Dancer 1.1 | 6.2 | 9.3% | 2 |
| ratosh.Wesco 1.4 | 6.7 | 7.7% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.6% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 81.9 | 8 / 35 | 3444 |
| 2 | 1 | 69.0 | 90.5 | 15 / 35 | 4572 |
| 3 | 1 | 68.3 | 88.6 | 14 / 35 | 4412 |
| 4 | 1 | 68.0 | 85.1 | 15 / 35 | 4682 |
| 5 | 1 | 67.3 | 85.1 | 12 / 35 | 4469 |
| 6 | 2 | 65.6 | 81.9 | 13 / 35 | 4137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 68 | 46% |
| kid.Gladiator .7.2 | 50 | 56% |
| jcs.Seth 1.8 | 21 | 43% |
| tcf.Reach 3 | 6 | 67% |
| cli.Dancer 1.1 | 4 | 75% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 1096. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 40% | 86 |
| kid.Gladiator .7.2 | 46 | 34% | 67 |
| jcs.Seth 1.8 | 19 | 14% | 32 |
| tcf.Reach 3 | 8 | 6% | 12 |
| cli.Dancer 1.1 | 3 | 2% | 8 |
| ratosh.Wesco 1.4 | 1 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 173622 melee ticks, 58586 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 48 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 54090 sent, 49522 reached their opponent, 8636 virtual hits (17.4% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 602 over 6 battles (100.3 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 81.5 | 39 / 210 | 2.66 | 15.4% | 19905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 141 |
| hadur2.Hadur 3.17.1bb | 2.0 | 15.4% | 39 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.8% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.1% | 7 |
| rz.HawkOnFire 0.1 | 4.5 | 11.9% | 5 |
| wit.Chuliath 1.0 | 7.0 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.0 | 6.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 81.3 | 6 / 35 | 3311 |
| 2 | 2 | 63.0 | 77.1 | 7 / 35 | 3140 |
| 3 | 2 | 64.0 | 80.6 | 7 / 35 | 3369 |
| 4 | 2 | 64.7 | 83.8 | 6 / 35 | 3400 |
| 5 | 2 | 64.7 | 82.5 | 8 / 35 | 3603 |
| 6 | 2 | 64.1 | 83.8 | 5 / 35 | 3082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 81 | 22% |
| gh.mini.Gruwel 0.9 | 18 | 44% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 45% |
| rz.HawkOnFire 0.1 | 10 | 60% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 56% | 121 |
| gh.mini.Gruwel 0.9 | 23 | 13% | 28 |
| rz.HawkOnFire 0.1 | 22 | 13% | 26 |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 12% | 24 |
| wit.Chuliath 1.0 | 2 | 1% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 147430 melee ticks, 45269 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 41 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46477 sent, 41795 reached their opponent, 6975 virtual hits (16.7% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 410 over 6 battles (68.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.1 | 142 / 210 | 1.90 | 19.5% | 28052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.5% | 142 |
| bzdp.Pansy 2.1 | 2.5 | 12.5% | 18 |
| alpha.RainingFire 1.0 | 2.7 | 12.9% | 22 |
| mz.Cork 0.1 | 4.3 | 10.7% | 10 |
| bvh.micro.Freya 0.3 | 5.0 | 10.3% | 8 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.8% | 3 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.6% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.7% | 1 |
| dl.BetterWalls 1.0 | 8.8 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.8 | 24 / 35 | 4677 |
| 2 | 1 | 69.4 | 90.8 | 24 / 35 | 4625 |
| 3 | 1 | 68.6 | 88.9 | 23 / 35 | 4429 |
| 4 | 1 | 69.5 | 89.2 | 23 / 35 | 4931 |
| 5 | 1 | 68.9 | 88.9 | 24 / 35 | 4507 |
| 6 | 1 | 70.3 | 92.7 | 24 / 35 | 4883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 86% |
| alpha.RainingFire 1.0 | 30 | 83% |
| mz.Cork 0.1 | 28 | 86% |
| bvh.micro.Freya 0.3 | 26 | 85% |
| bvh.mini.Fenrir 0.39 | 17 | 100% |
| m3thos.Eva02 0.7.1 | 15 | 93% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 16 | 23% | 43 |
| bzdp.Pansy 2.1 | 14 | 20% | 45 |
| mz.Cork 0.1 | 12 | 17% | 36 |
| m3thos.Eva02 0.7.1 | 8 | 11% | 29 |
| bvh.micro.Freya 0.3 | 8 | 11% | 28 |
| bvh.mini.Fenrir 0.39 | 8 | 11% | 18 |
| dl.BetterWalls 1.0 | 1 | 1% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 149077 melee ticks, 40148 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51753 sent, 47299 reached their opponent, 10269 virtual hits (21.7% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 219 over 6 battles (36.5 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 87.1 | 148 / 210 | 2.16 | 18.4% | 30086 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.4% | 148 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 11.6% | 9 |
| EBBU.Sim2 1.02 | 4.5 | 9.7% | 5 |
| germ.TheMind .2 | 4.8 | 9.7% | 6 |
| agrach.Dalek 1.0 | 5.2 | 9.7% | 13 |
| lmk.ACPFinal 0.1 | 5.5 | 9.1% | 5 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.7% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 7.5 | 8.0% | 3 |
| mb.Beast 0.1 | 7.8 | 8.1% | 6 |
| skm.Ryubot 1.0 | 9.8 | 7.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.7 | 24 / 35 | 5375 |
| 2 | 1 | 67.1 | 86.7 | 23 / 35 | 5081 |
| 3 | 1 | 64.9 | 80.6 | 20 / 35 | 4549 |
| 4 | 1 | 68.7 | 93.0 | 29 / 35 | 5093 |
| 5 | 1 | 66.5 | 86.0 | 24 / 35 | 4769 |
| 6 | 1 | 68.4 | 89.5 | 28 / 35 | 5219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 25 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 96% |
| lmk.ACPFinal 0.1 | 22 | 95% |
| germ.TheMind .2 | 21 | 95% |
| stelo.UntouchableNano 1.3 | 19 | 84% |
| mb.Beast 0.1 | 17 | 100% |
| EBBU.Sim2 1.02 | 16 | 100% |
| skm.Ryubot 1.0 | 10 | 90% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 64 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 23% | 43 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 19% | 13 |
| stelo.UntouchableNano 1.3 | 9 | 14% | 27 |
| agrach.Dalek 1.0 | 8 | 13% | 43 |
| lmk.ACPFinal 0.1 | 8 | 13% | 27 |
| EBBU.Sim2 1.02 | 4 | 6% | 23 |
| mb.Beast 0.1 | 4 | 6% | 16 |
| germ.TheMind .2 | 3 | 5% | 17 |
| skm.Ryubot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 95806 melee ticks, 24076 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 35 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 32676 sent, 28582 reached their opponent, 8774 virtual hits (30.7% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 302 over 6 battles (50.3 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 85.4 | 99 / 210 | 2.31 | 17.1% | 23519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 17.1% | 99 |
| justin.Mallais 14.0 | 1.8 | 15.7% | 60 |
| bvh.mini.Freya 0.55 | 3.2 | 12.7% | 18 |
| bts.mega.Gnarly 1.4 | 3.8 | 11.6% | 22 |
| cs.Wren 1.0 | 5.2 | 10.5% | 5 |
| kdf.KoulDestroyer 1.0 | 6.0 | 10.0% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.8% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.8% | 0 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 84.1 | 15 / 35 | 3778 |
| 2 | 1 | 63.3 | 79.0 | 11 / 35 | 3390 |
| 3 | 1 | 70.2 | 96.2 | 28 / 35 | 4267 |
| 4 | 2 | 65.6 | 81.9 | 13 / 35 | 4023 |
| 5 | 1 | 66.6 | 85.7 | 15 / 35 | 4182 |
| 6 | 1 | 66.8 | 85.4 | 17 / 35 | 3879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 56 | 57% |
| bvh.mini.Freya 0.55 | 26 | 73% |
| bts.mega.Gnarly 1.4 | 19 | 84% |
| cs.Wren 1.0 | 19 | 89% |
| kdf.KoulDestroyer 1.0 | 8 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 39 | 33% | 68 |
| bvh.mini.Freya 0.55 | 23 | 20% | 34 |
| bts.mega.Gnarly 1.4 | 15 | 13% | 40 |
| kdf.KoulDestroyer 1.0 | 15 | 13% | 21 |
| cs.Wren 1.0 | 9 | 8% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 7% | 16 |
| matt.UnderDark3 2.4.34 | 4 | 3% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 144339 melee ticks, 31411 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 47209 sent, 42555 reached their opponent, 9590 virtual hits (22.5% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 718 over 6 battles (119.7 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.6 | 90 / 210 | 2.39 | 17.2% | 25934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.2% | 90 |
| bvh.fry.Freya 0.82 | 2.3 | 14.6% | 17 |
| az.Ololobot 0.2.4 | 3.0 | 13.2% | 60 |
| catcat20.Lambda 0.024 | 3.7 | 11.8% | 35 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.7% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.0% | 0 |
| gimp.GimpBot 0.1 | 6.8 | 7.8% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.7% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 91.4 | 18 / 35 | 4557 |
| 2 | 1 | 66.6 | 84.1 | 15 / 35 | 4536 |
| 3 | 1 | 66.7 | 87.3 | 17 / 35 | 4266 |
| 4 | 1 | 65.7 | 83.5 | 13 / 35 | 4316 |
| 5 | 1 | 64.1 | 78.1 | 15 / 35 | 4051 |
| 6 | 1 | 65.1 | 82.9 | 12 / 35 | 4208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 47 | 87% |
| az.Ololobot 0.2.4 | 44 | 41% |
| catcat20.Lambda 0.024 | 38 | 53% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 2 | 0% |

Hadur died in 128 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 43 | 34% | 67 |
| bvh.fry.Freya 0.82 | 31 | 24% | 57 |
| catcat20.Lambda 0.024 | 23 | 18% | 41 |
| winamp32.micro.MicroMacro 1.0 | 7 | 5% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 4% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 4% | 7 |
| gimp.GimpBot 0.1 | 4 | 3% | 9 |
| apollokidd.ApolloKidd 0.9 | 3 | 2% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 163247 melee ticks, 45526 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 43 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52565 sent, 48046 reached their opponent, 9012 virtual hits (18.8% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 428 over 6 battles (71.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.8 | 121 / 210 | 2.10 | 18.4% | 25155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.4% | 121 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.1% | 46 |
| mz.AntiGrav 1.0 | 3.7 | 11.6% | 4 |
| kano.gamma.KanoGamma 1.8 | 3.8 | 11.6% | 18 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.5% | 10 |
| stelo.Randomness 1.0 | 5.8 | 9.5% | 8 |
| alpha.BlackIce 1.0 | 6.7 | 8.8% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.5% | 0 |
| sample.Corners 1.0 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.5 | 23 / 35 | 4021 |
| 2 | 1 | 69.1 | 89.5 | 22 / 35 | 4410 |
| 3 | 1 | 69.0 | 90.2 | 24 / 35 | 4320 |
| 4 | 1 | 68.0 | 90.8 | 19 / 35 | 3956 |
| 5 | 1 | 65.6 | 79.0 | 15 / 35 | 4011 |
| 6 | 1 | 67.8 | 87.0 | 18 / 35 | 4437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 51 | 69% |
| kano.gamma.KanoGamma 1.8 | 39 | 72% |
| mz.AntiGrav 1.0 | 23 | 96% |
| Polkwane.SmashMelee 1.0 | 14 | 86% |
| stelo.Randomness 1.0 | 13 | 85% |
| alpha.BlackIce 1.0 | 8 | 88% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |
| sample.Corners 1.0 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 33% | 55 |
| kano.gamma.KanoGamma 1.8 | 23 | 24% | 50 |
| stelo.Randomness 1.0 | 9 | 10% | 23 |
| Polkwane.SmashMelee 1.0 | 9 | 10% | 21 |
| alpha.BlackIce 1.0 | 8 | 9% | 19 |
| mz.AntiGrav 1.0 | 5 | 5% | 28 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 10 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 1 |
| sample.Corners 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 155507 melee ticks, 36144 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 120 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 120 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 52074 sent, 47423 reached their opponent, 10256 virtual hits (21.6% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 75 over 6 battles (12.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 84.0 | 84 / 210 | 2.44 | 16.7% | 22217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.5 | 16.7% | 84 |
| eem.EvBotNG v12.8 | 1.5 | 16.9% | 95 |
| ary.Swarm 1.1 | 3.5 | 12.9% | 8 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.3% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.3% | 5 |
| shrub.Silver v048 | 6.0 | 8.8% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.7% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 82.2 | 15 / 35 | 3741 |
| 2 | 2 | 66.0 | 83.2 | 15 / 35 | 3562 |
| 3 | 2 | 66.0 | 80.6 | 15 / 35 | 3729 |
| 4 | 1 | 67.2 | 86.0 | 16 / 35 | 3873 |
| 5 | 2 | 64.1 | 81.6 | 6 / 35 | 3466 |
| 6 | 1 | 68.3 | 90.2 | 17 / 35 | 3846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 75 | 40% |
| lessonz.robocode.Oz 0.5.0 | 24 | 75% |
| ary.Swarm 1.1 | 20 | 95% |
| simonton.nano.MeleeSeed 1.8 | 14 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 64 | 51% | 92 |
| lessonz.robocode.Oz 0.5.0 | 24 | 19% | 38 |
| ary.Swarm 1.1 | 19 | 15% | 39 |
| simonton.nano.MeleeSeed 1.8 | 12 | 10% | 24 |
| shrub.Silver v048 | 4 | 3% | 9 |
| zyx.nano.Ant 1.1 | 3 | 2% | 4 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 151965 melee ticks, 44882 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51001 sent, 46506 reached their opponent, 7651 virtual hits (16.5% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 375 over 6 battles (62.5 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.5 | 117 / 210 | 2.04 | 18.6% | 29487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.2 | 18.6% | 117 |
| wompi.Wallaby 5.1 | 1.8 | 16.4% | 54 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.0% | 15 |
| ara.Shera 0.88 | 3.5 | 12.8% | 19 |
| amz.NanoClone 1.41 | 5.2 | 9.2% | 2 |
| dsw.StaticD 1.0 | 6.0 | 7.3% | 3 |
| maribo.IotaCT 1.1 | 7.2 | 6.4% | 0 |
| mme.NikeEnhanced 2.0 | 8.0 | 5.8% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 80.6 | 11 / 35 | 4413 |
| 2 | 1 | 69.2 | 89.5 | 19 / 35 | 5191 |
| 3 | 1 | 69.7 | 93.3 | 23 / 35 | 5020 |
| 4 | 1 | 67.9 | 85.1 | 19 / 35 | 4892 |
| 5 | 1 | 69.1 | 89.5 | 21 / 35 | 5055 |
| 6 | 1 | 69.9 | 92.7 | 24 / 35 | 4916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 92 | 78% |
| maribo.mini.MiniQuester 0.1 | 29 | 93% |
| ara.Shera 0.88 | 21 | 48% |
| dsw.StaticD 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 41% | 101 |
| ara.Shera 0.88 | 26 | 27% | 43 |
| maribo.mini.MiniQuester 0.1 | 21 | 22% | 47 |
| amz.NanoClone 1.41 | 3 | 3% | 4 |
| dsw.StaticD 1.0 | 2 | 2% | 8 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 170937 melee ticks, 47637 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 42 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 54456 sent, 49888 reached their opponent, 10273 virtual hits (20.6% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 687 over 6 battles (114.5 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 78.2 | 31 / 210 | 2.96 | 14.7% | 19900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 147 |
| hadur2.Hadur 3.17.1bb | 2.0 | 14.7% | 31 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.9% | 22 |
| dummy.micro.Sparrow 2.5 | 4.0 | 12.2% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.8% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.3% | 0 |
| jab.DiamondStealer 5 | 7.2 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 76.8 | 4 / 35 | 3669 |
| 2 | 2 | 62.3 | 74.6 | 3 / 35 | 3044 |
| 3 | 2 | 63.3 | 76.5 | 3 / 35 | 3232 |
| 4 | 2 | 66.5 | 85.1 | 10 / 35 | 3499 |
| 5 | 2 | 63.1 | 76.5 | 4 / 35 | 3076 |
| 6 | 2 | 64.8 | 79.7 | 7 / 35 | 3380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 67 | 12% |
| brainfade.melee.Dusk 0.44 | 16 | 56% |
| dummy.micro.Sparrow 2.5 | 8 | 63% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 80% |
| mz.NanoGod 2.02 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 99 | 53% | 107 |
| brainfade.melee.Dusk 0.44 | 32 | 17% | 42 |
| dummy.micro.Sparrow 2.5 | 26 | 14% | 31 |
| wcsv.melee.EngineerMelee 0.1 | 9 | 5% | 12 |
| mz.NanoGod 2.02 | 7 | 4% | 9 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 5 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 160939 melee ticks, 39708 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 34 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 52033 sent, 47249 reached their opponent, 8269 virtual hits (17.5% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 321 over 6 battles (53.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.2 | 128 / 210 | 1.88 | 19.4% | 30004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 19.4% | 128 |
| stelo.Liblix 0.3.1 | 2.0 | 15.7% | 54 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.7% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.5% | 2 |
| jwirde.Gort 2.0 | 4.5 | 9.4% | 3 |
| wompi.Quokka 1.6 | 6.3 | 8.1% | 3 |
| disan.Chair 2.2.0 | 6.7 | 7.7% | 3 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.3% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.7 | 20 / 35 | 5171 |
| 2 | 1 | 69.0 | 90.5 | 20 / 35 | 4726 |
| 3 | 1 | 69.4 | 88.3 | 20 / 35 | 5191 |
| 4 | 1 | 69.2 | 88.3 | 22 / 35 | 4922 |
| 5 | 1 | 69.4 | 89.8 | 21 / 35 | 5004 |
| 6 | 1 | 70.4 | 92.7 | 25 / 35 | 4990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 73 | 63% |
| tzu.TheArtOfWar 1.2 | 62 | 79% |
| jwirde.Gort 2.0 | 14 | 86% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 100% |
| disan.Chair 2.2.0 | 4 | 75% |
| wompi.Quokka 1.6 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 42 | 49% | 90 |
| tzu.TheArtOfWar 1.2 | 22 | 26% | 67 |
| jwirde.Gort 2.0 | 8 | 9% | 22 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 7% | 12 |
| wompi.Quokka 1.6 | 2 | 2% | 6 |
| disan.Chair 2.2.0 | 1 | 1% | 5 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 3 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 156533 melee ticks, 42970 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54898 sent, 50450 reached their opponent, 11403 virtual hits (22.6% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 680 over 6 battles (113.3 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.3 | 95 / 210 | 2.23 | 18.8% | 30696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 18.8% | 95 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.5% | 84 |
| jje.BagPuss 1.2 | 2.8 | 12.3% | 10 |
| sul.Lunar 1.1 | 4.0 | 10.8% | 9 |
| myl.nano.Graviton 1.10 | 5.0 | 10.0% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 9.1% | 9 |
| hvilela.HVilela 0.9 | 7.0 | 8.0% | 0 |
| fm.claire 1.7 | 7.3 | 8.5% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.8% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.0 | 14 / 35 | 5487 |
| 2 | 1 | 65.9 | 79.0 | 14 / 35 | 4808 |
| 3 | 1 | 70.0 | 90.5 | 21 / 35 | 5126 |
| 4 | 1 | 68.6 | 88.9 | 14 / 35 | 5095 |
| 5 | 1 | 68.5 | 84.4 | 16 / 35 | 5439 |
| 6 | 1 | 68.0 | 87.9 | 16 / 35 | 4741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 91 | 54% |
| jje.BagPuss 1.2 | 16 | 75% |
| sul.Lunar 1.1 | 13 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 91% |
| myl.nano.Graviton 1.10 | 5 | 80% |
| wit.Deep7 2.0 | 4 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 49 | 40% | 0 |
| jje.BagPuss 1.2 | 24 | 20% | 60 |
| sul.Lunar 1.1 | 11 | 9% | 51 |
| myl.nano.Graviton 1.10 | 11 | 9% | 37 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 7% | 24 |
| hvilela.HVilela 0.9 | 6 | 5% | 13 |
| fm.claire 1.7 | 4 | 3% | 16 |
| wit.Deep7 2.0 | 3 | 2% | 6 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 221170 melee ticks, 89760 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 56 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 66477 sent, 61978 reached their opponent, 9966 virtual hits (16.1% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 795 over 6 battles (132.5 per battle, most in one battle 223). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 81.1 | 55 / 210 | 2.70 | 15.6% | 22122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 16.9% | 65 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.4% | 77 |
| hadur2.Hadur 3.17.1bb | 2.5 | 15.6% | 55 |
| mz.MicroSheep 1.0 | 4.3 | 10.9% | 4 |
| cx.Princess 1.0 | 5.2 | 9.7% | 6 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 2 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.9% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.0% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 83.8 | 14 / 35 | 3830 |
| 2 | 3 | 63.0 | 76.2 | 5 / 35 | 3793 |
| 3 | 2 | 65.8 | 84.4 | 13 / 35 | 3735 |
| 4 | 3 | 64.4 | 81.0 | 9 / 35 | 3393 |
| 5 | 3 | 65.0 | 82.9 | 9 / 35 | 3632 |
| 6 | 3 | 63.3 | 78.1 | 5 / 35 | 3739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 51 | 59% |
| rsalesc.melee.Medina 0.4.5 | 37 | 24% |
| cx.Princess 1.0 | 9 | 78% |
| mz.MicroSheep 1.0 | 9 | 67% |
| arthord.NanoSatanMelee Beta | 3 | 67% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 61 | 38% | 73 |
| kc.mini.Mirage 0.2 | 59 | 36% | 89 |
| cx.Princess 1.0 | 11 | 7% | 14 |
| mz.MicroSheep 1.0 | 9 | 6% | 14 |
| sadoner.killer 0.2 | 9 | 6% | 11 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 5 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 156960 melee ticks, 40800 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45911 sent, 41435 reached their opponent, 6775 virtual hits (16.4% of those reached).

