# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1481081. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 12 over 1 battles (12.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.3 | 3 / 20 | 2.50 | 17.1% | 3159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 21.0% | 17 |
| hadur117.Hadur 3.21aa | 2.0 | 17.1% | 3 |
| mz.MicroGodMelee 1 | 3.0 | 10.9% | 0 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.6% | 0 |
| lorneswork.Predator 1.0 | 5.0 | 10.4% | 0 |
| sgp.JollyNinja 3.53 | 6.0 | 9.8% | 0 |
| adt.Ar2 1.0 | 7.0 | 8.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 3.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 83.3 | 3 / 20 | 3159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 13 | 8% |
| mz.MicroGodMelee 1 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 17 of 20 rounds, at a mean tick of 1166. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 12 | 71% | 13 |
| mz.MicroGodMelee 1 | 2 | 12% | 3 |
| lorneswork.Predator 1.0 | 1 | 6% | 1 |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 6% | 1 |
| sgp.JollyNinja 3.53 | 1 | 6% | 1 |
| adt.Ar2 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 20 rounds): 14038 melee ticks, 8517 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 17 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (20 rounds): longest scan gap while four or more were alive 17 ticks (20 rounds over 8); rounds whose longest gap at any count was over 8: 20; robots dropped as dead without a death event: 0.

Targeting waves (20 rounds): 4380 sent, 3935 reached their opponent, 741 virtual hits (18.8% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1510737. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 25 over 1 battles (25.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.1 | 12 / 20 | 1.80 | 20.6% | 3417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.6% | 12 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.6% | 4 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 14.0% | 2 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.3% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.8% | 1 |
| sch.Simone 0.3d | 6.0 | 7.6% | 0 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 6.8% | 0 |
| Noran.BitchingElk 0.054 | 8.0 | 6.3% | 1 |
| fullsail.SweetTea 1.1 | 9.0 | 5.4% | 0 |
| stelo.PatternRobot 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.1 | 12 / 20 | 3417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 5 | 60% |
| pulsar.PulsarMax 0.8.9 | 5 | 40% |
| com.cohesiva.robocode.ManOwaR 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| Noran.BitchingElk 0.054 | 1 | 0% |
| lrem.micro.SpikeSoldier 0.4 | 1 | 100% |
| sch.Simone 0.3d | 1 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 8 of 20 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 4 | 50% | 8 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2 | 25% | 6 |
| Noran.BitchingElk 0.054 | 1 | 13% | 2 |
| fullsail.SweetTea 1.1 | 1 | 13% | 2 |
| lrem.micro.SpikeSoldier 0.4 | 0 | 0% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 15413 melee ticks, 4090 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 17 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 17 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 5382 sent, 4918 reached their opponent, 746 virtual hits (15.2% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1508348. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 18 over 1 battles (18.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 99.4 | 19 / 20 | 1.05 | 22.3% | 3756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.3% | 19 |
| kawigi.nano.Lib 1.0 | 2.0 | 12.9% | 0 |
| radnor.DoctorBob 1.42 | 3.0 | 12.5% | 0 |
| vuen.Cake 2.51 | 4.0 | 12.4% | 1 |
| urdos.URDOS 1.3 | 5.0 | 10.9% | 0 |
| adt.Ar1 2.1 | 6.0 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.7% | 0 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 5.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 99.4 | 19 / 20 | 3756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 10 | 90% |
| kawigi.nano.Lib 1.0 | 7 | 100% |
| radnor.DoctorBob 1.42 | 2 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 1 of 20 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 1 | 100% | 11 |
| kawigi.nano.Lib 1.0 | 0 | 0% | 5 |
| radnor.DoctorBob 1.42 | 0 | 0% | 2 |
| adt.Ar1 2.1 | 0 | 0% | 1 |
| urdos.URDOS 1.3 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 12034 melee ticks, 5097 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 24 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 3585 sent, 3132 reached their opponent, 765 virtual hits (24.4% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1489234. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 10 over 1 battles (10.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.6 | 3 / 20 | 2.30 | 18.2% | 3576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 17 |
| hadur117.Hadur 3.21aa | 2.0 | 18.2% | 3 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 0 |
| TNT.TNT 0.99.1 | 4.0 | 10.3% | 0 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 0 |
| rampancy.Durandal 2.1d | 6.0 | 6.1% | 0 |
| css.Delitioner 0.11 | 7.0 | 6.0% | 0 |
| tj.zombie1n 1.0.1 | 8.0 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.3% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.2 | 85.6 | 3 / 20 | 3576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 14 | 14% |
| apc.LeeroyJenkins2 1.0 | 1 | 100% |

Hadur died in 17 of 20 rounds, at a mean tick of 1340. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 14 | 82% | 16 |
| apc.LeeroyJenkins2 1.0 | 1 | 6% | 2 |
| TNT.TNT 0.99.1 | 1 | 6% | 1 |
| rampancy.Durandal 2.1d | 1 | 6% | 1 |

Posture (Hadur's M records, 19 rounds): 16794 melee ticks, 8095 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 31 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 5161 sent, 4713 reached their opponent, 659 virtual hits (14.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1490052. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 133 over 1 battles (133.0 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 70.6 | 2 / 20 | 3.65 | 13.6% | 2070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.0% | 13 |
| justin.DemonicRage 3.4 | 2.0 | 16.0% | 3 |
| hadur117.Hadur 3.21aa | 3.0 | 13.6% | 2 |
| wompi.Numbat 2.1 | 4.0 | 13.1% | 1 |
| axeBots.HataMoto 3.09 | 5.0 | 10.5% | 1 |
| ms.Ares 0.19 | 6.0 | 8.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.0 | 6.2% | 0 |
| supersample.SuperBoxBot 1.0 | 8.0 | 4.8% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 4.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 70.6 | 2 / 20 | 2070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 4 | 0% |
| justin.DemonicRage 3.4 | 2 | 50% |
| wompi.Numbat 2.1 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 19 of 20 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 9 | 47% | 9 |
| justin.DemonicRage 3.4 | 5 | 26% | 6 |
| wompi.Numbat 2.1 | 2 | 11% | 3 |
| axeBots.HataMoto 3.09 | 2 | 11% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 20 rounds): 13763 melee ticks, 2784 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (20 rounds): longest scan gap while four or more were alive 62 ticks (20 rounds over 8); rounds whose longest gap at any count was over 8: 20; robots dropped as dead without a death event: 0.

Targeting waves (20 rounds): 4260 sent, 3763 reached their opponent, 612 virtual hits (16.3% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1510848. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 18 over 1 battles (18.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.8 | 11 / 20 | 1.65 | 20.6% | 3427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.6% | 11 |
| pe.minimelee.SandboxMiniMelee 1.1 | 2.0 | 14.5% | 3 |
| origin.SleepSiphon 1.7b | 3.0 | 13.9% | 4 |
| jekl.StoneGhost 0.7 | 4.0 | 11.4% | 0 |
| mld.Wisdom 1.0 | 5.0 | 10.9% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.0 | 8.4% | 1 |
| gg.Wolverine 2.0 | 7.0 | 8.0% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 5.4% | 1 |
| DBall.NUKE 0.1 | 9.0 | 4.3% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.8 | 11 / 20 | 3427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 57% |
| origin.SleepSiphon 1.7b | 6 | 83% |
| gg.Wolverine 2.0 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 0% |

Hadur died in 9 of 20 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 4 | 44% | 8 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3 | 33% | 8 |
| spinnercat.Omen 1.0 | 1 | 11% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 11% | 1 |
| gg.Wolverine 2.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 19 rounds): 12959 melee ticks, 5323 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 14 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 14 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4119 sent, 3667 reached their opponent, 720 virtual hits (19.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21aa against 8 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1481385. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 132 over 1 battles (132.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 76.2 | 97.5 | 17 / 20 | 1.20 | 26.8% | 4635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 26.8% | 17 |
| rtk.Tachikoma 1.0 | 2.0 | 18.1% | 2 |
| franzor.Lizt 1.3.1 | 3.0 | 13.6% | 1 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.6% | 0 |
| lrem.micro.MoggFanatic 0.2 | 5.0 | 10.7% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.0% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.9% | 0 |
| sample.Target 1.0 | 8.0 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 76.2 | 97.5 | 17 / 20 | 4635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 12 | 92% |
| franzor.Lizt 1.3.1 | 6 | 83% |
| oog.melee.CapuletDroid 1.1 | 1 | 100% |

Hadur died in 4 of 20 rounds, at a mean tick of 1453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 2 | 50% | 16 |
| franzor.Lizt 1.3.1 | 1 | 25% | 0 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
| oog.melee.CapuletDroid 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 19 rounds): 17746 melee ticks, 8128 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 57 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4811 sent, 4415 reached their opponent, 868 virtual hits (19.7% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21aa against 8 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1483753. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 31 over 1 battles (31.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.1 | 14 / 20 | 1.55 | 22.2% | 2800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.2% | 14 |
| shrub.Vapour v159 | 2.0 | 15.2% | 4 |
| tm.Yuugao 1.0 | 3.0 | 14.3% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 4.0 | 10.9% | 0 |
| m3thos.Eva00 1.1 | 5.0 | 10.5% | 0 |
| com.spp.robocode.MostlyHarmless 010 | 6.0 | 8.6% | 0 |
| qualidafial.MajorDick 1.0.1 | 7.0 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.0 | 5.9% | 0 |
| SHAM.WOW 1.4 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 93.1 | 14 / 20 | 2800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 6 | 67% |
| tm.Yuugao 1.0 | 4 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 100% |
| com.spp.robocode.MostlyHarmless 010 | 2 | 100% |
| m3thos.Eva00 1.1 | 1 | 100% |

Hadur died in 6 of 20 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 3 | 50% | 5 |
| tm.Yuugao 1.0 | 2 | 33% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 1 | 17% | 5 |
| m3thos.Eva00 1.1 | 0 | 0% | 1 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 20 rounds): 14950 melee ticks, 2896 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 18 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (20 rounds): longest scan gap while four or more were alive 17 ticks (20 rounds over 8); rounds whose longest gap at any count was over 8: 20; robots dropped as dead without a death event: 1.

Targeting waves (20 rounds): 4423 sent, 3995 reached their opponent, 688 virtual hits (17.2% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1516145. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 12 over 1 battles (12.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 79.4 | 8 / 20 | 2.85 | 17.5% | 2901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.1% | 8 |
| hadur117.Hadur 3.21aa | 2.0 | 17.5% | 8 |
| kc.micro.Figment 1.0 | 3.0 | 15.0% | 2 |
| yagami.Tidus 0.11 | 4.0 | 13.4% | 1 |
| mc2.enemy.Original 0.9 | 5.0 | 10.1% | 1 |
| dft.Calliope 5.6 | 6.0 | 7.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 6.3% | 0 |
| rdm.Dueler 0.4x | 8.0 | 6.0% | 0 |
| step.nanoPri 1.0 | 9.0 | 5.6% | 0 |
| pedersen.Grishnakh 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 79.4 | 8 / 20 | 2901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 6 | 67% |
| kc.micro.Figment 1.0 | 4 | 75% |
| mc2.enemy.Original 0.9 | 1 | 100% |

Hadur died in 12 of 20 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 6 | 50% | 9 |
| kc.micro.Figment 1.0 | 3 | 25% | 6 |
| mc2.enemy.Original 0.9 | 1 | 8% | 2 |
| yagami.Tidus 0.11 | 1 | 8% | 2 |
| robar.nano.Assertive_Melee 0.2 | 1 | 8% | 1 |

Posture (Hadur's M records, 20 rounds): 15232 melee ticks, 4097 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 14 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (20 rounds): longest scan gap while four or more were alive 13 ticks (20 rounds over 8); rounds whose longest gap at any count was over 8: 20; robots dropped as dead without a death event: 0.

Targeting waves (20 rounds): 4595 sent, 4114 reached their opponent, 702 virtual hits (17.1% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1489794. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 14 over 1 battles (14.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 95.0 | 16 / 20 | 1.45 | 21.0% | 3421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.0% | 16 |
| ne.Chimera 1.2 | 2.0 | 13.9% | 0 |
| ejb.Polaris 1.0.1 | 3.0 | 13.3% | 2 |
| DTF.Kludgy 1.2b | 4.0 | 12.6% | 1 |
| vStar.RAFzilla 2.15 | 5.0 | 11.0% | 0 |
| tvv.micro.Antares 1.1.1 | 6.0 | 9.2% | 1 |
| kurios.DOSexe .9b | 7.0 | 5.7% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 4.1% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 95.0 | 16 / 20 | 3421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ne.Chimera 1.2 | 7 | 100% |
| ejb.Polaris 1.0.1 | 7 | 86% |
| DTF.Kludgy 1.2b | 2 | 50% |
| vStar.RAFzilla 2.15 | 2 | 100% |

Hadur died in 4 of 20 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ejb.Polaris 1.0.1 | 2 | 50% | 7 |
| ne.Chimera 1.2 | 1 | 25% | 6 |
| DTF.Kludgy 1.2b | 1 | 25% | 4 |
| vStar.RAFzilla 2.15 | 0 | 0% | 2 |
| sam.Samspin 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 11873 melee ticks, 4495 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 51 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4082 sent, 3585 reached their opponent, 663 virtual hits (18.5% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1491502. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 17 over 1 battles (17.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 85.0 | 7 / 20 | 2.35 | 17.3% | 2387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 17.3% | 7 |
| rz.Aleph 0.34 | 2.0 | 14.0% | 4 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.8% | 2 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 3 |
| uji.YellohFellah 1.0 | 5.0 | 9.0% | 2 |
| br2.MobyDickBot 1.6 | 6.0 | 8.9% | 1 |
| rdt199.Warlord 0.73 | 7.0 | 8.8% | 1 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.8% | 0 |
| stelo.MirrorNano 1.3 | 9.0 | 5.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 85.0 | 7 / 20 | 2387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.mini.Nimrod 0.55 | 6 | 83% |
| djc.DynaBot 0.1.1 | 3 | 0% |
| rz.Aleph 0.34 | 2 | 50% |
| uji.YellohFellah 1.0 | 2 | 50% |
| rdt199.Warlord 0.73 | 1 | 0% |

Hadur died in 13 of 20 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| djc.DynaBot 0.1.1 | 4 | 31% | 4 |
| cx.mini.Nimrod 0.55 | 2 | 15% | 5 |
| uji.YellohFellah 1.0 | 2 | 15% | 5 |
| rz.Aleph 0.34 | 2 | 15% | 3 |
| rdt199.Warlord 0.73 | 2 | 15% | 2 |
| br2.MobyDickBot 1.6 | 1 | 8% | 1 |

Posture (Hadur's M records, 20 rounds): 15475 melee ticks, 4258 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (20 rounds): longest scan gap while four or more were alive 26 ticks (20 rounds over 8); rounds whose longest gap at any count was over 8: 20; robots dropped as dead without a death event: 0.

Targeting waves (20 rounds): 4912 sent, 4391 reached their opponent, 614 virtual hits (14.0% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1486684. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 17 over 1 battles (17.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.1 | 14 / 20 | 1.80 | 19.9% | 2617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.9% | 14 |
| bts.wiki.RipCurl 0.9b | 2.0 | 13.2% | 2 |
| nat.PallasHawk 1.0 | 3.0 | 12.4% | 2 |
| darkcanuck.Leon 1.01 | 4.0 | 11.8% | 1 |
| brainfade.melee.Genghis 0.36 | 5.0 | 8.1% | 0 |
| jrm.Test0 1.0 | 6.0 | 7.8% | 0 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.4% | 0 |
| jp.Perpy 16.0 | 8.0 | 7.2% | 0 |
| stuff.Vlad 0.1 | 9.0 | 6.4% | 0 |
| jaybot.bots.Oddball 4.0 | 10.0 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.1 | 14 / 20 | 2617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 7 | 86% |
| nat.PallasHawk 1.0 | 4 | 75% |
| darkcanuck.Leon 1.01 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 6 of 20 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 2 | 33% | 3 |
| bts.wiki.RipCurl 0.9b | 1 | 17% | 6 |
| jaybot.bots.Oddball 4.0 | 1 | 17% | 2 |
| brainfade.melee.Genghis 0.36 | 1 | 17% | 1 |
| jrm.Test0 1.0 | 1 | 17% | 1 |
| darkcanuck.Leon 1.01 | 0 | 0% | 5 |
| cs.sheldor.Talon 1.1 | 0 | 0% | 1 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 11330 melee ticks, 4152 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 20 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 20 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4068 sent, 3557 reached their opponent, 584 virtual hits (16.4% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1495647. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 13 over 1 battles (13.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.7 | 6 / 20 | 2.65 | 16.1% | 2504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 17.0% | 9 |
| ags.Glacier 0.2.11 | 2.0 | 16.7% | 4 |
| hadur117.Hadur 3.21aa | 3.0 | 16.1% | 6 |
| shinh.Entangled 0.3 | 4.0 | 11.8% | 0 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.7% | 1 |
| apc.Colossus2 0.17 | 6.0 | 6.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.0% | 0 |
| maribo.FollowFire 1 | 9.0 | 5.0% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.5 | 81.7 | 6 / 20 | 2504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 5 | 60% |
| mn.Combat 3.25.0 | 5 | 20% |
| gh.micro.Gruweltje 0.7 | 1 | 100% |
| shinh.Entangled 0.3 | 1 | 100% |

Hadur died in 14 of 20 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 7 | 50% | 8 |
| ags.Glacier 0.2.11 | 4 | 29% | 6 |
| gh.micro.Gruweltje 0.7 | 2 | 14% | 3 |
| maribo.FollowFire 1 | 1 | 7% | 1 |
| shinh.Entangled 0.3 | 0 | 0% | 2 |

Posture (Hadur's M records, 18 rounds): 12716 melee ticks, 3808 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (18 rounds): longest scan gap while four or more were alive 24 ticks (18 rounds over 8); rounds whose longest gap at any count was over 8: 18; robots dropped as dead without a death event: 0.

Targeting waves (18 rounds): 3691 sent, 3231 reached their opponent, 507 virtual hits (15.7% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21aa against 8 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1502484. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 16 over 1 battles (16.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.4 | 99.4 | 19 / 20 | 1.05 | 25.5% | 3882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 25.5% | 19 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.6% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 3.0 | 10.7% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 4.0 | 10.4% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 9.8% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 9.1% | 0 |
| pa.Improved 1.0 | 8.0 | 7.6% | 1 |
| sample.TrackFire 1.0 | 9.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 99.4 | 19 / 20 | 3882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 2 | 100% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 1 of 20 rounds, at a mean tick of 2509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pa.Improved 1.0 | 1 | 100% | 1 |
| simonton.micro.Sprout 1.1.3 | 0 | 0% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 0 | 0% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 12144 melee ticks, 6104 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 14 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 14 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 3376 sent, 2986 reached their opponent, 730 virtual hits (24.4% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1503659. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 18 over 1 battles (18.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.4 | 11 / 20 | 1.95 | 19.0% | 2860 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.0% | 11 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.5% | 4 |
| mld.DustBunny 3.8 | 3.0 | 14.3% | 3 |
| emp.Yngwie 1.11 | 4.0 | 12.3% | 1 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.9% | 0 |
| kawigi.robot.Girl 1.2 | 6.0 | 8.8% | 1 |
| lambdaxy.TBot 0.1 | 7.0 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.5% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.0 | 3.5% | 0 |
| divineomega.TrialBot 0.003 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.4 | 11 / 20 | 2860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 6 | 67% |
| kawigi.robot.Girl 1.2 | 2 | 50% |
| mld.DustBunny 3.8 | 2 | 100% |
| cb.nano.Insomnia 1.0 | 2 | 100% |
| emp.Yngwie 1.11 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 9 of 20 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 4 | 44% | 8 |
| mld.DustBunny 3.8 | 2 | 22% | 5 |
| kawigi.robot.Girl 1.2 | 2 | 22% | 1 |
| emp.Yngwie 1.11 | 1 | 11% | 5 |
| divineomega.TrialBot 0.003 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 15833 melee ticks, 3466 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 27 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4977 sent, 4498 reached their opponent, 677 virtual hits (15.1% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1495936. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 18 over 1 battles (18.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 91.7 | 14 / 20 | 1.75 | 21.5% | 3794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.5% | 14 |
| gh.Griezel 0.5.2 | 2.0 | 15.4% | 2 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.9% | 2 |
| bvh.fnr.Fenrir 0.36l | 4.0 | 10.4% | 1 |
| techdude.forest.FlamingForest 1.1 | 5.0 | 8.5% | 1 |
| tvv.nano.Polaris 1.2 | 6.0 | 7.4% | 0 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 6.2% | 0 |
| asd.Cthulhu 1.3 | 8.0 | 5.6% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 5.6% | 0 |
| divineomega.DivineBot 1.9.4.5 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 91.7 | 14 / 20 | 3794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 7 | 86% |
| techdude.forest.FlamingForest 1.1 | 4 | 100% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2 | 100% |
| bvh.fnr.Fenrir 0.36l | 2 | 50% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 6 of 20 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.surreptitious.MiniSurreptitious 0.0.1 | 4 | 67% | 5 |
| gh.Griezel 0.5.2 | 1 | 17% | 7 |
| bvh.fnr.Fenrir 0.36l | 1 | 17% | 3 |
| techdude.forest.FlamingForest 1.1 | 0 | 0% | 4 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 14629 melee ticks, 8779 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 25 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4783 sent, 4346 reached their opponent, 728 virtual hits (16.8% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1499647. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 17 over 1 battles (17.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.7 | 11 / 20 | 1.75 | 20.3% | 3421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.3% | 11 |
| et.Predator 1.8 | 2.0 | 14.4% | 2 |
| oog.melee.Mercutio 1.0 | 3.0 | 14.3% | 4 |
| cx.BlestPain 1.41 | 4.0 | 12.0% | 2 |
| ahf.NanoAndrew .4 | 5.0 | 11.3% | 1 |
| nic.Nicator 2.4 | 6.0 | 7.9% | 0 |
| maribo.melee.BMV 0.1 | 7.0 | 6.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 5.6% | 0 |
| tex.Longbot 0.4 | 9.0 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.7 | 11 / 20 | 3421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 6 | 67% |
| oog.melee.Mercutio 1.0 | 6 | 67% |
| cx.BlestPain 1.41 | 2 | 50% |
| ahf.NanoAndrew .4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 9 of 20 rounds, at a mean tick of 1105. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 4 | 44% | 7 |
| et.Predator 1.8 | 2 | 22% | 7 |
| cx.BlestPain 1.41 | 2 | 22% | 4 |
| ahf.NanoAndrew .4 | 1 | 11% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 20 rounds): 17383 melee ticks, 5282 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 14 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (20 rounds): longest scan gap while four or more were alive 14 ticks (20 rounds over 8); rounds whose longest gap at any count was over 8: 20; robots dropped as dead without a death event: 0.

Targeting waves (20 rounds): 5381 sent, 4892 reached their opponent, 954 virtual hits (19.5% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21aa against 8 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1488514. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 20 over 1 battles (20.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 95.6 | 17 / 20 | 1.35 | 24.0% | 3176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 24.0% | 17 |
| agd.Mooserwirt2 2.7 | 2.0 | 17.7% | 3 |
| uji.DBH 1.1 | 3.0 | 13.2% | 0 |
| spinnercat.Robovirus 2.718 | 4.0 | 11.6% | 0 |
| sigterm.Sigterm 1.0 | 5.0 | 9.8% | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 6.0 | 7.5% | 0 |
| ratosh.Nobo 0.21 | 7.0 | 5.5% | 0 |
| stelo.WangRobot 1.0 | 8.0 | 5.4% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 95.6 | 17 / 20 | 3176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 10 | 80% |
| uji.DBH 1.1 | 5 | 100% |
| sigterm.Sigterm 1.0 | 3 | 100% |
| spinnercat.Robovirus 2.718 | 1 | 100% |

Hadur died in 3 of 20 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 2 | 67% | 9 |
| spinnercat.Robovirus 2.718 | 1 | 33% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 0 | 0% | 2 |
| uji.DBH 1.1 | 0 | 0% | 2 |
| stelo.WangRobot 1.0 | 0 | 0% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 1 |
| sigterm.Sigterm 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 12137 melee ticks, 6433 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 23 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 23 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 3754 sent, 3329 reached their opponent, 704 virtual hits (21.1% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1511967. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 20 over 1 battles (20.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.5 | 98.9 | 18 / 20 | 1.10 | 23.3% | 3898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 23.3% | 18 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 13.7% | 2 |
| krillr.mini.JointStrike 2.0.0 | 3.0 | 12.3% | 0 |
| erdnis.Rover 0.3 | 4.0 | 12.0% | 0 |
| patson.PatsonTestBot 1.0 | 5.0 | 10.3% | 0 |
| mld.Infinity 2.2 | 6.0 | 9.8% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.3% | 0 |
| pac.ABC 2.1 | 8.0 | 5.9% | 0 |
| pbg.R2D2 1.0 | 9.0 | 4.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.5 | 98.9 | 18 / 20 | 3898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 8 | 75% |
| krillr.mini.JointStrike 2.0.0 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 2 | 100% |
| mld.Infinity 2.2 | 2 | 100% |
| erdnis.Rover 0.3 | 1 | 100% |

Hadur died in 2 of 20 rounds, at a mean tick of 1237. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1 | 50% | 5 |
| erdnis.Rover 0.3 | 1 | 50% | 4 |
| krillr.mini.JointStrike 2.0.0 | 0 | 0% | 6 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 4 |
| mld.Infinity 2.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 11596 melee ticks, 5313 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 16 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 16 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 3831 sent, 3354 reached their opponent, 715 virtual hits (21.3% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1508654. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 12 over 1 battles (12.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.9 | 11 / 20 | 1.55 | 20.6% | 3499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.6% | 11 |
| catcat20.Rabbit 0.001 | 2.0 | 15.4% | 5 |
| trm.Wrekt 1.1.6.f | 3.0 | 14.7% | 3 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.7% | 0 |
| bayen.nut.Squirrel 1.615 | 5.0 | 9.3% | 1 |
| fwb.Nine 1.0.1 | 6.0 | 8.7% | 0 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 8.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 5.8% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 3.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.9 | 11 / 20 | 3499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Rabbit 0.001 | 11 | 55% |
| trm.Wrekt 1.1.6.f | 5 | 80% |
| bayen.nut.Squirrel 1.615 | 1 | 0% |
| fwb.Nine 1.0.1 | 1 | 100% |

Hadur died in 9 of 20 rounds, at a mean tick of 1202. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Rabbit 0.001 | 5 | 56% | 13 |
| trm.Wrekt 1.1.6.f | 3 | 33% | 6 |
| bayen.nut.Squirrel 1.615 | 1 | 11% | 1 |

Posture (Hadur's M records, 19 rounds): 14761 melee ticks, 7596 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 16 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 16 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4411 sent, 3950 reached their opponent, 753 virtual hits (19.1% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1507560. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 14 over 1 battles (14.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.0 | 13 / 20 | 1.45 | 21.1% | 3543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.1% | 13 |
| eem.EvBot v4.6.16 | 2.0 | 17.0% | 7 |
| dummy.mini.Scimitar 1.01 | 3.0 | 12.0% | 0 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 0 |
| eld.Hmm 1.0 | 5.0 | 9.7% | 1 |
| oa.weak.BotherBot 0.1 | 6.0 | 9.1% | 0 |
| fire219.CatBot 1.0 | 7.0 | 6.7% | 0 |
| PSW.Relentless 0.1 | 8.0 | 5.4% | 0 |
| el.JumpShoot 0.2 | 9.0 | 4.0% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 95.0 | 13 / 20 | 3543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 13 | 69% |
| cf.RiO.RiOx 4.2.1 | 3 | 100% |
| dummy.mini.Scimitar 1.01 | 1 | 100% |
| eld.Hmm 1.0 | 1 | 0% |

Hadur died in 8 of 20 rounds, at a mean tick of 1438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 5 | 63% | 12 |
| dummy.mini.Scimitar 1.01 | 1 | 13% | 3 |
| eld.Hmm 1.0 | 1 | 13% | 1 |
| cf.RiO.RiOx 4.2.1 | 0 | 0% | 3 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 19 rounds): 16361 melee ticks, 8539 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 40 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4588 sent, 4175 reached their opponent, 681 virtual hits (16.3% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21aa against 8 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1512551. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 131 over 1 battles (131.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 93.1 | 12 / 20 | 1.55 | 22.4% | 2976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.4% | 12 |
| pe.SandboxDT 2.71m | 2.0 | 16.3% | 4 |
| kvk.HebusLeTroll 0.35 | 3.0 | 16.2% | 3 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.3% | 0 |
| bigpete.Stewie 1.0 | 5.0 | 9.9% | 1 |
| yk.JahRoslav 1.1 | 6.0 | 7.4% | 0 |
| gg.Squaraus 0.6 | 7.0 | 6.4% | 0 |
| tad.Dalek98 0.98 | 8.0 | 5.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.1 | 12 / 20 | 2976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 7 | 43% |
| kvk.HebusLeTroll 0.35 | 6 | 67% |
| bigpete.Stewie 1.0 | 3 | 67% |
| jlm.javaDisturbance 0.59 | 3 | 100% |

Hadur died in 9 of 20 rounds, at a mean tick of 1157. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 4 | 44% | 7 |
| kvk.HebusLeTroll 0.35 | 2 | 22% | 7 |
| bigpete.Stewie 1.0 | 2 | 22% | 4 |
| jlm.javaDisturbance 0.59 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 19 rounds): 14044 melee ticks, 5968 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 17 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 17 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4180 sent, 3813 reached their opponent, 471 virtual hits (12.4% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1492372. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 138 over 1 battles (138.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 98.9 | 18 / 20 | 1.10 | 22.3% | 3528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.3% | 18 |
| pe.SandboxLump 1.52 | 2.0 | 15.8% | 1 |
| stelo.AreaTargetingBot 1.1 | 3.0 | 11.8% | 0 |
| cre.Karolos 0.32 | 4.0 | 11.7% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.9% | 1 |
| cw.megas.Blade 0.8 | 6.0 | 8.3% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7.0 | 7.8% | 0 |
| sample.Walls 1.0 | 8.0 | 7.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.0 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 98.9 | 18 / 20 | 3528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 12 | 92% |
| stelo.AreaTargetingBot 1.1 | 5 | 100% |
| cre.Karolos 0.32 | 2 | 100% |
| stelo.RamTrackSurfer 1.2 | 1 | 0% |

Hadur died in 3 of 20 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1 | 33% | 9 |
| stelo.RamTrackSurfer 1.2 | 1 | 33% | 1 |
| cre.Karolos 0.32 | 0 | 0% | 5 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 2 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 19 rounds): 11311 melee ticks, 5054 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 38 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 3553 sent, 3069 reached their opponent, 814 virtual hits (26.5% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1514770. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 20 over 1 battles (20.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.6 | 10 / 20 | 2.30 | 18.3% | 2759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.3% | 10 |
| florent.XSeries.X2 0.12 | 2.0 | 14.2% | 5 |
| davidalves.Phoenix 0.54 | 3.0 | 13.1% | 3 |
| rz.GlowBlowMelee 1.4 | 4.0 | 12.1% | 1 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.4% | 0 |
| oog.melee.Corsair 1.0 | 6.0 | 8.2% | 1 |
| lunchie.Lunchbox 0.93 | 7.0 | 7.3% | 0 |
| stelo.SoJNanoMelee 1.1 | 8.0 | 6.5% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.6% | 0 |
| evd.X1 0.01 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.6 | 10 / 20 | 2759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 3 | 67% |
| pedersen.Ugluk 1.1.1 | 3 | 100% |
| florent.XSeries.X2 0.12 | 3 | 33% |
| davidalves.Phoenix 0.54 | 2 | 100% |
| oog.melee.Corsair 1.0 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 10 of 20 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 5 | 50% | 5 |
| rz.GlowBlowMelee 1.4 | 2 | 20% | 5 |
| pedersen.Ugluk 1.1.1 | 1 | 10% | 3 |
| davidalves.Phoenix 0.54 | 1 | 10% | 2 |
| stelo.SoJNanoMelee 1.1 | 1 | 10% | 1 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 3 |
| oog.melee.Corsair 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 12254 melee ticks, 4509 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 23 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 23 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4042 sent, 3563 reached their opponent, 624 virtual hits (17.5% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21aa against 8 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1478641. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 124 over 1 battles (124.0 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.6 | 12 / 20 | 1.75 | 20.7% | 2138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.7% | 12 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 15.4% | 3 |
| jdw.Hurricane 1.4 | 3.0 | 13.6% | 2 |
| voidious.micro.BlitzBat 1.05 | 4.0 | 13.5% | 2 |
| ds.Oo 2.2 | 5.0 | 8.9% | 0 |
| adt.Ar2 1.1 | 6.0 | 8.5% | 0 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.5% | 1 |
| awesomeness.Elite 1.0 | 8.0 | 7.4% | 0 |
| amk.ChumbaMini 0.2 | 9.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.6 | 12 / 20 | 2138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 7 | 71% |
| jdw.Hurricane 1.4 | 3 | 67% |
| voidious.micro.BlitzBat 1.05 | 2 | 50% |
| gjr.Cephalosporin 0.1 | 1 | 0% |
| amk.ChumbaMini 0.2 | 1 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |
| ds.Oo 2.2 | 1 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 9 of 20 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 4 | 44% | 7 |
| voidious.mini.BrokenSword 2.0.3 | 2 | 22% | 4 |
| gjr.Cephalosporin 0.1 | 1 | 11% | 2 |
| jdw.Hurricane 1.4 | 1 | 11% | 2 |
| adt.Ar2 1.1 | 0 | 0% | 2 |
| awesomeness.Elite 1.0 | 0 | 0% | 1 |
| ds.Oo 2.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 19 rounds): 11341 melee ticks, 3110 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 30 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 3727 sent, 3311 reached their opponent, 529 virtual hits (16.0% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1497281. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 26 over 1 battles (26.0 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 94.4 | 15 / 20 | 1.50 | 21.7% | 3921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.7% | 15 |
| ak.Fermat 2.0 | 2.0 | 16.6% | 3 |
| shu.nitro.LENIN .T34 | 3.0 | 12.4% | 1 |
| lrem.Spectre 0.4.4 | 4.0 | 11.8% | 1 |
| js.PinBall 1.6 | 5.0 | 10.1% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 8.5% | 0 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.5% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 5.1% | 0 |
| sample.SpinBot 1.0 | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 94.4 | 15 / 20 | 3921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 7 | 86% |
| lrem.Spectre 0.4.4 | 4 | 75% |
| shu.nitro.LENIN .T34 | 3 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |
| js.PinBall 1.6 | 1 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 1 | 100% |

Hadur died in 5 of 20 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.Spectre 0.4.4 | 2 | 40% | 3 |
| ak.Fermat 2.0 | 1 | 20% | 9 |
| shu.nitro.LENIN .T34 | 1 | 20% | 4 |
| js.PinBall 1.6 | 1 | 20% | 2 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 14078 melee ticks, 4915 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 15 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 15 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4454 sent, 3993 reached their opponent, 994 virtual hits (24.9% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1485071. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 13 over 1 battles (13.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 68.3 | 9 / 20 | 3.85 | 16.4% | 3043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 16.4% | 9 |
| mk.Alpha 0.2.1 | 2.0 | 15.1% | 4 |
| EH.Eagle 1.0.6 | 3.0 | 11.3% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 10.2% | 2 |
| joe.ADinosaur 1.0 | 5.0 | 9.8% | 0 |
| throxbot.ThroxBot 0.1 | 6.0 | 8.8% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 7.0 | 8.8% | 0 |
| wee.Gem 1.8.4 | 8.0 | 7.4% | 0 |
| caimano.Furia_Ceca 0.22 | 9.0 | 7.0% | 0 |
| cs.Grudge 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 68.3 | 9 / 20 | 3043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 8 | 88% |
| techdude.kombat.FlamingKombat 1.5 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 11 of 20 rounds, at a mean tick of 468. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 4 | 36% | 9 |
| cs.Grudge 1.0 | 4 | 36% | 4 |
| EH.Eagle 1.0.6 | 2 | 18% | 3 |
| throxbot.ThroxBot 0.1 | 1 | 9% | 1 |
| wee.Gem 1.8.4 | 0 | 0% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 1 |
| caimano.Furia_Ceca 0.22 | 0 | 0% | 1 |

Posture (Hadur's M records, 20 rounds): 10797 melee ticks, 3213 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (20 rounds): longest scan gap while four or more were alive 48 ticks (20 rounds over 8); rounds whose longest gap at any count was over 8: 20; robots dropped as dead without a death event: 0.

Targeting waves (20 rounds): 3713 sent, 3216 reached their opponent, 812 virtual hits (25.2% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1482279. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 17 over 1 battles (17.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 93.3 | 16 / 20 | 1.60 | 20.0% | 2495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.0% | 16 |
| kid.test.NightFox .2 | 2.0 | 14.4% | 1 |
| uji.Antique 1.0 | 3.0 | 13.2% | 1 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.7% | 1 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.7% | 1 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.2% | 0 |
| matt.advanced.Katana 1.0 | 7.0 | 7.1% | 0 |
| ahr.ice.Ice 1.0.2 | 8.0 | 6.6% | 0 |
| stelo.Lifestealer 1.0 | 9.0 | 5.1% | 0 |
| stelo.PianistNano 1.2 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 93.3 | 16 / 20 | 2495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.Antique 1.0 | 8 | 88% |
| kid.test.NightFox .2 | 8 | 88% |
| amk.ChumbaWumba 0.3 | 1 | 100% |
| qohnil.blot.BlotBot 3.61 | 1 | 100% |

Hadur died in 4 of 20 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 2 | 50% | 7 |
| uji.Antique 1.0 | 1 | 25% | 9 |
| pfvicm.Sobieski 7.2.3b | 1 | 25% | 1 |
| qohnil.blot.BlotBot 3.61 | 0 | 0% | 2 |
| ahr.ice.Ice 1.0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 12213 melee ticks, 3501 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 17 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 17 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4262 sent, 3776 reached their opponent, 462 virtual hits (12.2% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1497189. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 17 over 1 battles (17.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.0 | 8 / 20 | 2.35 | 17.8% | 2487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 17.8% | 8 |
| deewiant.Anomaly 0.2 | 2.0 | 17.2% | 7 |
| zyx.mega.YersiniaPestis 3.1 | 3.0 | 13.5% | 2 |
| jok.PheonixM 0.1.2 | 4.0 | 11.6% | 1 |
| myl.micro.Troodon 1.10 | 5.0 | 10.9% | 0 |
| ph.melee.ArcherME 0.3 | 6.0 | 9.0% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.8% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 4.7% | 0 |
| jangs.ns51 1.0 | 9.0 | 4.7% | 0 |
| ap.Frederick 1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.0 | 8 / 20 | 2487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 7 | 57% |
| zyx.mega.YersiniaPestis 3.1 | 3 | 67% |
| jok.PheonixM 0.1.2 | 2 | 50% |
| myl.micro.Troodon 1.10 | 1 | 100% |

Hadur died in 12 of 20 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 7 | 58% | 12 |
| zyx.mega.YersiniaPestis 3.1 | 2 | 17% | 4 |
| myl.micro.Troodon 1.10 | 2 | 17% | 3 |
| jok.PheonixM 0.1.2 | 1 | 8% | 1 |

Posture (Hadur's M records, 20 rounds): 16322 melee ticks, 4631 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (20 rounds): longest scan gap while four or more were alive 39 ticks (20 rounds over 8); rounds whose longest gap at any count was over 8: 20; robots dropped as dead without a death event: 0.

Targeting waves (20 rounds): 5328 sent, 4826 reached their opponent, 674 virtual hits (14.0% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21aa against 8 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1488549. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 122 over 1 battles (122.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.0 | 9 / 20 | 2.20 | 19.6% | 2654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.6% | 9 |
| oog.melee.Capulet 1.2 | 2.0 | 15.2% | 4 |
| darkcanuck.B26354 1.06 | 3.0 | 15.1% | 5 |
| stelo.PastFuture 2.3.2 | 4.0 | 14.3% | 2 |
| intruder.PrairieWolf 2.61 | 5.0 | 9.7% | 0 |
| ntc.Opposite 1.5 | 6.0 | 8.4% | 0 |
| tripphippy.Alice 1.1 | 7.0 | 8.2% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.9% | 0 |
| GarmBox.Anger 1.0 | 9.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.0 | 9 / 20 | 2654 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 6 | 83% |
| darkcanuck.B26354 1.06 | 5 | 20% |
| ntc.Opposite 1.5 | 1 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 12 of 20 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 4 | 33% | 5 |
| stelo.PastFuture 2.3.2 | 3 | 25% | 4 |
| intruder.PrairieWolf 2.61 | 2 | 17% | 3 |
| oog.melee.Capulet 1.2 | 1 | 8% | 6 |
| tripphippy.Alice 1.1 | 1 | 8% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 19 rounds): 13794 melee ticks, 5587 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 17 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 17 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4095 sent, 3668 reached their opponent, 649 virtual hits (17.7% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1479374. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 16 over 1 battles (16.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 73.9 | 4 / 20 | 3.35 | 14.9% | 2311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.4% | 13 |
| hadur117.Hadur 3.21aa | 2.0 | 14.9% | 4 |
| gh.mini.Griezel 0.2 | 3.0 | 13.8% | 2 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.3% | 1 |
| gh.nano.Grofvuil 0.2 | 5.0 | 9.9% | 1 |
| d414.nano.Quantum 1.0.0 | 6.0 | 9.5% | 0 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.6% | 0 |
| fm.mammillarias 1.3 | 8.0 | 5.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 73.9 | 4 / 20 | 2311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 5 | 40% |
| gh.mini.Griezel 0.2 | 2 | 0% |
| d414.nano.Quantum 1.0.0 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 17 of 20 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 7 | 41% | 9 |
| gh.mini.Griezel 0.2 | 6 | 35% | 7 |
| d414.nano.Quantum 1.0.0 | 1 | 6% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 6% | 1 |
| timmit.nano.TimDog 0.33 | 1 | 6% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 19 rounds): 14682 melee ticks, 1188 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 24 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4520 sent, 4039 reached their opponent, 642 virtual hits (15.9% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1472962. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 19 over 1 battles (19.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.1 | 13 / 20 | 1.80 | 19.5% | 2875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.5% | 13 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 13.6% | 4 |
| vjik.UnViolation 1.1 | 3.0 | 13.4% | 1 |
| apc.botM 3.0 | 4.0 | 11.2% | 1 |
| lxx.ConceptA 0.8 | 5.0 | 10.0% | 1 |
| yk.JahMicro 1.0 | 6.0 | 8.6% | 0 |
| panzer.Panzer 0.2 | 7.0 | 7.4% | 0 |
| bayen.UbaMicro 1.4 | 8.0 | 7.3% | 0 |
| conscience.Electron 1.3g | 9.0 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.1 | 13 / 20 | 2875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 7 | 57% |
| vjik.UnViolation 1.1 | 5 | 100% |
| lxx.ConceptA 0.8 | 2 | 100% |
| apc.botM 3.0 | 2 | 50% |
| yk.JahMicro 1.0 | 1 | 100% |

Hadur died in 7 of 20 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 3 | 43% | 7 |
| vjik.UnViolation 1.1 | 2 | 29% | 6 |
| apc.botM 3.0 | 1 | 14% | 2 |
| panzer.Panzer 0.2 | 1 | 14% | 1 |
| lxx.ConceptA 0.8 | 0 | 0% | 3 |
| yk.JahMicro 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 11398 melee ticks, 5031 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 25 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 3845 sent, 3365 reached their opponent, 567 virtual hits (16.8% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21aa against 8 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1491623. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 132 over 1 battles (132.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.1 | 12 / 20 | 1.55 | 22.9% | 3046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.9% | 12 |
| maribo.Quester 0.3 | 2.0 | 19.6% | 6 |
| labg.Cataclysm 2.05 | 3.0 | 12.6% | 1 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 11.5% | 1 |
| baal.nano.N 1.42 | 5.0 | 10.7% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 8.5% | 0 |
| sanja.First 0.1 | 7.0 | 5.6% | 0 |
| zyx.micro.Ant 1.1 | 8.0 | 5.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.1 | 12 / 20 | 3046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 13 | 62% |
| labg.Cataclysm 2.05 | 3 | 67% |
| sanja.First 0.1 | 1 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1 | 100% |

Hadur died in 9 of 20 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 7 | 78% | 14 |
| labg.Cataclysm 2.05 | 1 | 11% | 2 |
| baal.nano.N 1.42 | 0 | 0% | 2 |
| sanja.First 0.1 | 0 | 0% | 1 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 20 rounds): 16072 melee ticks, 5142 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (20 rounds): longest scan gap while four or more were alive 34 ticks (20 rounds over 8); rounds whose longest gap at any count was over 8: 20; robots dropped as dead without a death event: 0.

Targeting waves (20 rounds): 4779 sent, 4357 reached their opponent, 617 virtual hits (14.2% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1485082. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 16 over 1 battles (16.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.6 | 9 / 20 | 1.85 | 19.5% | 3306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 19.5% | 9 |
| stelo.Spread 0.9 | 2.0 | 17.1% | 5 |
| kid.Gladiator .7.2 | 3.0 | 16.0% | 5 |
| tcf.Reach 3 | 4.0 | 11.9% | 0 |
| cli.Dancer 1.1 | 5.0 | 9.4% | 0 |
| jcs.Seth 1.8 | 6.0 | 9.1% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 5.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.5% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.6 | 9 / 20 | 3306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 8 | 63% |
| kid.Gladiator .7.2 | 6 | 50% |
| tcf.Reach 3 | 1 | 100% |
| jcs.Seth 1.8 | 1 | 0% |

Hadur died in 11 of 20 rounds, at a mean tick of 1140. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 4 | 36% | 10 |
| kid.Gladiator .7.2 | 4 | 36% | 6 |
| tcf.Reach 3 | 1 | 9% | 2 |
| jcs.Seth 1.8 | 1 | 9% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 9% | 1 |

Posture (Hadur's M records, 19 rounds): 15828 melee ticks, 5576 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 24 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4818 sent, 4365 reached their opponent, 735 virtual hits (16.8% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1504237. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 12 over 1 battles (12.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.7 | 6 / 20 | 2.65 | 16.4% | 2209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.5% | 11 |
| hadur117.Hadur 3.21aa | 2.0 | 16.4% | 6 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.1% | 2 |
| rz.HawkOnFire 0.1 | 4.0 | 12.1% | 1 |
| dmh.robocode.robot.BlackDeath 9.2 | 5.0 | 9.8% | 0 |
| wit.Chuliath 1.0 | 6.0 | 7.5% | 0 |
| stelo.MyAgileRobot 0.2 | 7.0 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 9.0 | 5.2% | 0 |
| dans.Cinnamon 1.2 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 81.7 | 6 / 20 | 2209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 8 | 25% |
| gh.mini.Gruwel 0.9 | 4 | 75% |
| rz.HawkOnFire 0.1 | 2 | 50% |

Hadur died in 14 of 20 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 9 | 64% | 11 |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 14% | 2 |
| gh.mini.Gruwel 0.9 | 1 | 7% | 3 |
| rz.HawkOnFire 0.1 | 1 | 7% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 7% | 1 |
| dans.Cinnamon 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 13150 melee ticks, 3617 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 34 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4178 sent, 3682 reached their opponent, 509 virtual hits (13.8% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1504554. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 21 over 1 battles (21.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.7 | 14 / 20 | 1.75 | 20.6% | 3303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.6% | 14 |
| alpha.RainingFire 1.0 | 2.0 | 13.5% | 1 |
| bvh.micro.Freya 0.3 | 3.0 | 12.4% | 3 |
| bzdp.Pansy 2.1 | 4.0 | 11.9% | 1 |
| m3thos.Eva02 0.7.1 | 5.0 | 11.4% | 1 |
| mz.Cork 0.1 | 6.0 | 9.6% | 0 |
| bvh.mini.Fenrir 0.39 | 7.0 | 7.7% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 5.6% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.3% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.7 | 14 / 20 | 3303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 6 | 67% |
| bzdp.Pansy 2.1 | 4 | 75% |
| alpha.RainingFire 1.0 | 4 | 75% |
| bvh.mini.Fenrir 0.39 | 2 | 100% |
| m3thos.Eva02 0.7.1 | 1 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 6 of 20 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 3 | 50% | 5 |
| alpha.RainingFire 1.0 | 2 | 33% | 7 |
| bzdp.Pansy 2.1 | 1 | 17% | 4 |
| m3thos.Eva02 0.7.1 | 0 | 0% | 2 |
| mz.Cork 0.1 | 0 | 0% | 1 |
| bvh.mini.Fenrir 0.39 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 13174 melee ticks, 3651 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 26 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4166 sent, 3719 reached their opponent, 704 virtual hits (18.9% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1486569. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 23 over 1 battles (23.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 95.0 | 18 / 20 | 1.45 | 20.8% | 3262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 20.8% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.0 | 12.3% | 0 |
| germ.TheMind .2 | 3.0 | 10.1% | 1 |
| agrach.Dalek 1.0 | 4.0 | 9.0% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 5.0 | 8.6% | 0 |
| EBBU.Sim2 1.02 | 6.0 | 8.4% | 0 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.3% | 1 |
| mb.Beast 0.1 | 8.0 | 8.2% | 0 |
| lmk.ACPFinal 0.1 | 9.0 | 7.6% | 0 |
| skm.Ryubot 1.0 | 10.0 | 6.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 95.0 | 18 / 20 | 3262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 100% |
| lmk.ACPFinal 0.1 | 3 | 100% |
| germ.TheMind .2 | 3 | 100% |
| mb.Beast 0.1 | 3 | 100% |
| EBBU.Sim2 1.02 | 2 | 100% |
| skm.Ryubot 1.0 | 1 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 2 of 20 rounds, at a mean tick of 300. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 50% | 10 |
| EBBU.Sim2 1.02 | 1 | 50% | 2 |
| mb.Beast 0.1 | 0 | 0% | 2 |
| germ.TheMind .2 | 0 | 0% | 2 |
| agrach.Dalek 1.0 | 0 | 0% | 2 |
| lmk.ACPFinal 0.1 | 0 | 0% | 1 |
| skm.Ryubot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 18 rounds): 8885 melee ticks, 2345 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (18 rounds): longest scan gap while four or more were alive 43 ticks (18 rounds over 8); rounds whose longest gap at any count was over 8: 18; robots dropped as dead without a death event: 0.

Targeting waves (18 rounds): 2925 sent, 2479 reached their opponent, 609 virtual hits (24.6% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1499470. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 11 over 1 battles (11.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.8 | 9 / 20 | 2.10 | 18.1% | 2697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.1% | 9 |
| justin.Mallais 14.0 | 2.0 | 16.5% | 5 |
| bvh.mini.Freya 0.55 | 3.0 | 12.5% | 0 |
| cs.Wren 1.0 | 4.0 | 12.3% | 4 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.4% | 1 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.8% | 1 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.4% | 0 |
| matt.UnderDark3 2.4.34 | 8.0 | 4.9% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 9.0 | 4.8% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.8 | 9 / 20 | 2697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 9 | 44% |
| bvh.mini.Freya 0.55 | 3 | 100% |
| bts.mega.Gnarly 1.4 | 2 | 100% |

Hadur died in 11 of 20 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 5 | 45% | 8 |
| bvh.mini.Freya 0.55 | 4 | 36% | 7 |
| cs.Wren 1.0 | 1 | 9% | 2 |
| kdf.KoulDestroyer 1.0 | 1 | 9% | 1 |
| bts.mega.Gnarly 1.4 | 0 | 0% | 1 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 13271 melee ticks, 3442 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 17 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 17 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4219 sent, 3715 reached their opponent, 752 virtual hits (20.2% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21aa against 8 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1496268. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 119 over 1 battles (119.0 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.4 | 15 / 20 | 1.45 | 23.7% | 3481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 23.7% | 15 |
| bvh.fry.Freya 0.82 | 2.0 | 15.5% | 3 |
| az.Ololobot 0.2.4 | 3.0 | 12.8% | 1 |
| apollokidd.ApolloKidd 0.9 | 4.0 | 9.5% | 1 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.0% | 0 |
| gimp.GimpBot 0.1 | 6.0 | 8.7% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 8.5% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.0 | 6.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.4 | 15 / 20 | 3481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 9 | 67% |
| az.Ololobot 0.2.4 | 7 | 86% |
| gimp.GimpBot 0.1 | 3 | 100% |

Hadur died in 6 of 20 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 3 | 50% | 7 |
| az.Ololobot 0.2.4 | 1 | 17% | 8 |
| winamp32.micro.MicroMacro 1.0 | 1 | 17% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 0 | 0% | 1 |
| gimp.GimpBot 0.1 | 0 | 0% | 1 |
| apollokidd.ApolloKidd 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 19 rounds): 13352 melee ticks, 7163 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 15 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 14 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4133 sent, 3699 reached their opponent, 629 virtual hits (17.0% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1500175. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 15 over 1 battles (15.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 92.2 | 16 / 20 | 1.70 | 21.8% | 3597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.8% | 16 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 13.7% | 2 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 11.6% | 1 |
| alpha.BlackIce 1.0 | 4.0 | 10.8% | 1 |
| mz.AntiGrav 1.0 | 5.0 | 10.7% | 0 |
| stelo.Randomness 1.0 | 6.0 | 9.0% | 0 |
| Polkwane.SmashMelee 1.0 | 7.0 | 8.6% | 0 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.9% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.9% | 0 |
| sample.Corners 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.2 | 16 / 20 | 3597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 7 | 100% |
| kano.gamma.KanoGamma 1.8 | 5 | 80% |
| mz.AntiGrav 1.0 | 3 | 100% |
| stelo.Randomness 1.0 | 1 | 100% |
| alpha.BlackIce 1.0 | 1 | 100% |

Hadur died in 4 of 20 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kano.gamma.KanoGamma 1.8 | 2 | 50% | 5 |
| kawigi.mini.Coriantumr 1.1 | 1 | 25% | 4 |
| mz.AntiGrav 1.0 | 1 | 25% | 3 |
| amk.superstrike.SuperStrike 0.3 | 0 | 0% | 3 |
| stelo.Randomness 1.0 | 0 | 0% | 2 |
| alpha.BlackIce 1.0 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 12523 melee ticks, 4298 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 32 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4389 sent, 3919 reached their opponent, 782 virtual hits (20.0% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1502779. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 15 over 1 battles (15.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.6 | 9 / 20 | 2.30 | 18.2% | 2715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.2% | 9 |
| eem.EvBotNG v12.8 | 2.0 | 17.1% | 7 |
| ary.Swarm 1.1 | 3.0 | 12.6% | 0 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 12.1% | 3 |
| lessonz.robocode.Oz 0.5.0 | 5.0 | 11.7% | 1 |
| shrub.Silver v048 | 6.0 | 8.7% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.0% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 4.6% | 0 |
| stelo.Mirror 1.1 | 9.0 | 4.2% | 0 |
| acogdev.alpha 0.2 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.6 | 9 / 20 | 2715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 9 | 67% |
| ary.Swarm 1.1 | 2 | 100% |
| simonton.nano.MeleeSeed 1.8 | 1 | 0% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 11 of 20 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 5 | 45% | 12 |
| simonton.nano.MeleeSeed 1.8 | 3 | 27% | 3 |
| shrub.Silver v048 | 1 | 9% | 2 |
| ary.Swarm 1.1 | 1 | 9% | 1 |
| acogdev.alpha 0.2 | 1 | 9% | 1 |
| lessonz.robocode.Oz 0.5.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 14315 melee ticks, 3952 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 27 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4583 sent, 4092 reached their opponent, 592 virtual hits (14.5% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1498755. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 12 over 1 battles (12.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.1 | 14 / 20 | 1.80 | 21.0% | 3740 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.0% | 14 |
| wompi.Wallaby 5.1 | 2.0 | 14.8% | 3 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 14.6% | 1 |
| ara.Shera 0.88 | 4.0 | 12.5% | 1 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 0 |
| maribo.IotaCT 1.1 | 6.0 | 6.5% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.2% | 1 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 4.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.1 | 14 / 20 | 3740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.mini.MiniQuester 0.1 | 7 | 100% |
| wompi.Wallaby 5.1 | 5 | 80% |
| ara.Shera 0.88 | 3 | 100% |

Hadur died in 6 of 20 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 2 | 33% | 6 |
| ara.Shera 0.88 | 2 | 33% | 5 |
| maribo.mini.MiniQuester 0.1 | 1 | 17% | 7 |
| dsw.StaticD 1.0 | 1 | 17% | 2 |

Posture (Hadur's M records, 20 rounds): 15625 melee ticks, 5508 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 17 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (20 rounds): longest scan gap while four or more were alive 17 ticks (20 rounds over 8); rounds whose longest gap at any count was over 8: 20; robots dropped as dead without a death event: 0.

Targeting waves (20 rounds): 4841 sent, 4367 reached their opponent, 788 virtual hits (18.0% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1498754. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 8 over 1 battles (8.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.7 | 4 / 20 | 2.65 | 16.4% | 2574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 13 |
| hadur117.Hadur 3.21aa | 2.0 | 16.4% | 4 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.8% | 1 |
| brainfade.melee.Dusk 0.44 | 4.0 | 11.7% | 1 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.0% | 0 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.8% | 1 |
| mz.NanoGod 2.02 | 7.0 | 7.9% | 1 |
| jab.DiamondStealer 5 | 8.0 | 5.9% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 81.7 | 4 / 20 | 2574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 12 | 33% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 17 of 20 rounds, at a mean tick of 1058. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 10 | 59% | 14 |
| dummy.micro.Sparrow 2.5 | 2 | 12% | 2 |
| Krabb.akim2.Akim2 1.1b | 2 | 12% | 2 |
| wcsv.melee.EngineerMelee 0.1 | 1 | 6% | 1 |
| brainfade.melee.Dusk 0.44 | 1 | 6% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 19 rounds): 13593 melee ticks, 6862 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 24 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4292 sent, 3793 reached their opponent, 562 virtual hits (14.8% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1498143. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 14 over 1 battles (14.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 93.3 | 16 / 20 | 1.60 | 22.2% | 3874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 22.2% | 16 |
| stelo.Liblix 0.3.1 | 2.0 | 15.0% | 2 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.0% | 1 |
| jwirde.Gort 2.0 | 4.0 | 9.2% | 0 |
| disan.Chair 2.2.0 | 5.0 | 9.1% | 1 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 7.6% | 0 |
| wompi.Quokka 1.6 | 7.0 | 7.3% | 0 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.0 | 4.6% | 0 |
| sample.Crazy 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 93.3 | 16 / 20 | 3874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tzu.TheArtOfWar 1.2 | 8 | 100% |
| stelo.Liblix 0.3.1 | 7 | 86% |
| jwirde.Gort 2.0 | 2 | 100% |

Hadur died in 4 of 20 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 2 | 50% | 8 |
| disan.Chair 2.2.0 | 1 | 25% | 2 |
| wompi.Quokka 1.6 | 1 | 25% | 1 |
| tzu.TheArtOfWar 1.2 | 0 | 0% | 8 |
| jwirde.Gort 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 15071 melee ticks, 4499 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 20 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 16 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 4953 sent, 4506 reached their opponent, 896 virtual hits (19.9% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21aa against 9 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1498072. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 15 over 1 battles (15.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.1 | 8 / 20 | 2.25 | 18.8% | 3013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 18.8% | 8 |
| myl.nano.Graviton 1.10 | 2.0 | 13.4% | 2 |
| jje.BagPuss 1.2 | 3.0 | 12.9% | 1 |
| eem.IWillFireNoBullet v2.8 | 4.0 | 11.9% | 7 |
| sul.Lunar 1.1 | 5.0 | 9.6% | 1 |
| hvilela.HVilela 0.9 | 6.0 | 9.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.7% | 1 |
| fm.claire 1.7 | 8.0 | 7.3% | 0 |
| abud.ThirdRobo 1.0 | 9.0 | 4.3% | 0 |
| wit.Deep7 2.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.1 | 8 / 20 | 3013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 6 | 50% |
| myl.nano.Graviton 1.10 | 4 | 100% |
| jje.BagPuss 1.2 | 2 | 50% |
| sul.Lunar 1.1 | 1 | 0% |

Hadur died in 12 of 20 rounds, at a mean tick of 1398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 4 | 33% | 7 |
| eem.IWillFireNoBullet v2.8 | 3 | 25% | 0 |
| myl.nano.Graviton 1.10 | 2 | 17% | 6 |
| hvilela.HVilela 0.9 | 1 | 8% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 1 | 8% | 2 |
| sul.Lunar 1.1 | 1 | 8% | 1 |
| fm.claire 1.7 | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 16898 melee ticks, 7477 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 24 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 5413 sent, 4948 reached their opponent, 642 virtual hits (13.0% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21aa against 8 opponents at once, 20 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=1495461. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G -Dhadur.bench.melee.trace=true.

Skipped turns: 11 over 1 battles (11.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.5 | 13 / 20 | 1.60 | 21.8% | 2931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21aa | 1.0 | 21.8% | 13 |
| kc.mini.Mirage 0.2 | 2.0 | 18.5% | 4 |
| mz.MicroSheep 1.0 | 3.0 | 12.0% | 1 |
| cx.Princess 1.0 | 4.0 | 12.0% | 0 |
| sadoner.killer 0.2 | 5.0 | 10.3% | 1 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.3% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.0 | 8.0% | 0 |
| mbro.Detektor3 0.1.1 | 8.0 | 4.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.5 | 13 / 20 | 2931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 9 | 78% |
| cx.Princess 1.0 | 5 | 100% |
| sadoner.killer 0.2 | 2 | 50% |

Hadur died in 7 of 20 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 4 | 57% | 12 |
| mz.MicroSheep 1.0 | 1 | 14% | 2 |
| sadoner.killer 0.2 | 1 | 14% | 1 |
| arthord.NanoSatanMelee Beta | 1 | 14% | 1 |
| cx.Princess 1.0 | 0 | 0% | 2 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |

Posture (Hadur's M records, 19 rounds): 12766 melee ticks, 5132 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 14 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (19 rounds): longest scan gap while four or more were alive 13 ticks (19 rounds over 8); rounds whose longest gap at any count was over 8: 19; robots dropped as dead without a death event: 0.

Targeting waves (19 rounds): 3579 sent, 3153 reached their opponent, 407 virtual hits (12.9% of those reached).

