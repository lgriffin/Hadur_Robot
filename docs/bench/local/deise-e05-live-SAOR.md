# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 70.8 | 28 / 210 | 3.63 | 14.7% | 28508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 146 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.7% | 28 |
| sgp.JollyNinja 3.53 | 3.7 | 11.8% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.8% | 7 |
| mz.MicroGodMelee 1 | 4.8 | 10.6% | 8 |
| lorneswork.Predator 1.0 | 5.2 | 10.2% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.6% | 1 |
| skm.butterfly 1.0 | 8.7 | 5.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 76.2 | 5 / 35 | 4812 |
| 2 | 2 | 64.2 | 76.8 | 6 / 35 | 4831 |
| 3 | 2 | 60.6 | 60.6 | 5 / 35 | 4861 |
| 4 | 2 | 61.1 | 67.9 | 5 / 35 | 4370 |
| 5 | 2 | 63.1 | 70.8 | 4 / 35 | 4605 |
| 6 | 2 | 63.4 | 72.4 | 3 / 35 | 5029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 61 | 2% |
| sgp.JollyNinja 3.53 | 20 | 75% |
| mz.MicroGodMelee 1 | 9 | 44% |
| lorneswork.Predator 1.0 | 6 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 103 | 56% | 110 |
| sgp.JollyNinja 3.53 | 20 | 11% | 30 |
| lorneswork.Predator 1.0 | 15 | 8% | 19 |
| mz.MicroGodMelee 1 | 15 | 8% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 7% | 15 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 3% | 7 |
| adt.Ar2 1.0 | 5 | 3% | 5 |
| skm.butterfly 1.0 | 3 | 2% | 3 |
| mym.EdgeStalker 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.8 | 99 / 210 | 2.73 | 17.9% | 31107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 99 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.2% | 43 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.2 | 13.2% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 11.0% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.0% | 12 |
| sch.Simone 0.3d | 6.8 | 7.9% | 9 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.7% | 0 |
| Noran.BitchingElk 0.054 | 7.3 | 7.5% | 11 |
| stelo.PatternRobot 1.0 | 9.0 | 6.0% | 3 |
| fullsail.SweetTea 1.1 | 9.7 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 79.0 | 16 / 35 | 5487 |
| 2 | 1 | 69.1 | 86.3 | 19 / 35 | 5402 |
| 3 | 1 | 65.5 | 77.1 | 13 / 35 | 4906 |
| 4 | 1 | 65.1 | 74.6 | 16 / 35 | 4733 |
| 5 | 1 | 68.5 | 86.3 | 18 / 35 | 5329 |
| 6 | 1 | 67.5 | 81.3 | 17 / 35 | 5250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 63% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 39 | 69% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 100% |
| sch.Simone 0.3d | 14 | 71% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 64% |
| Noran.BitchingElk 0.054 | 11 | 55% |
| stelo.PatternRobot 1.0 | 6 | 67% |
| fullsail.SweetTea 1.1 | 3 | 67% |

Hadur died in 111 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 37 | 33% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 25% | 60 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 12% | 24 |
| stelo.PatternRobot 1.0 | 9 | 8% | 11 |
| sch.Simone 0.3d | 8 | 7% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 6% | 14 |
| Noran.BitchingElk 0.054 | 5 | 5% | 12 |
| fullsail.SweetTea 1.1 | 3 | 3% | 6 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 5 |

## Melee bench: F03

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 80.5 | 130 / 210 | 2.76 | 18.1% | 33488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 130 |
| radnor.DoctorBob 1.42 | 2.2 | 13.9% | 36 |
| vuen.Cake 2.51 | 3.3 | 12.3% | 19 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.6% | 17 |
| urdos.URDOS 1.3 | 5.0 | 9.9% | 3 |
| adt.Ar1 2.1 | 6.7 | 7.7% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 7.2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.9% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.8 | 25 / 35 | 5326 |
| 2 | 1 | 66.1 | 75.9 | 20 / 35 | 5406 |
| 3 | 1 | 69.7 | 87.9 | 26 / 35 | 6008 |
| 4 | 1 | 65.8 | 75.2 | 18 / 35 | 5441 |
| 5 | 1 | 69.9 | 88.6 | 25 / 35 | 6096 |
| 6 | 1 | 64.3 | 70.5 | 16 / 35 | 5211 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 50 | 98% |
| kawigi.nano.Lib 1.0 | 49 | 90% |
| radnor.DoctorBob 1.42 | 35 | 77% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 30% | 51 |
| kawigi.nano.Lib 1.0 | 17 | 21% | 59 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 13% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 13% | 9 |
| urdos.URDOS 1.3 | 8 | 10% | 14 |
| oa.weak.FlyMk1 0.1 | 5 | 6% | 12 |
| vuen.Cake 2.51 | 3 | 4% | 48 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 3% | 2 |
| adt.Ar1 2.1 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.9 | 7 / 210 | 3.26 | 15.4% | 31281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 195 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.4% | 7 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.5% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.5% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 74.9 | 1 / 35 | 5142 |
| 2 | 2 | 65.5 | 75.6 | 1 / 35 | 5265 |
| 3 | 2 | 66.0 | 76.5 | 4 / 35 | 5462 |
| 4 | 2 | 65.4 | 74.6 | 1 / 35 | 5569 |
| 5 | 2 | 64.2 | 74.6 | 0 / 35 | 4757 |
| 6 | 2 | 64.0 | 73.0 | 0 / 35 | 5086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 75 | 0% |
| TNT.TNT 0.99.1 | 4 | 100% |
| apc.LeeroyJenkins2 1.0 | 3 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 158 | 78% | 160 |
| apc.LeeroyJenkins2 1.0 | 17 | 8% | 20 |
| josago.Jorgito 0.16 | 10 | 5% | 10 |
| css.Delitioner 0.11 | 9 | 4% | 9 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| tj.zombie1n 1.0.1 | 3 | 1% | 2 |
| TNT.TNT 0.99.1 | 2 | 1% | 5 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 59.7 | 8 / 210 | 4.62 | 12.6% | 25526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 17.9% | 113 |
| justin.DemonicRage 3.4 | 1.8 | 17.2% | 66 |
| wompi.Numbat 2.1 | 3.3 | 12.8% | 17 |
| hadur117.micro.Saor 0.2 | 3.7 | 12.6% | 8 |
| axeBots.HataMoto 3.09 | 5.2 | 9.5% | 5 |
| ms.Ares 0.19 | 5.8 | 8.5% | 1 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.2 | 5.6% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 68.3 | 3 / 35 | 4474 |
| 2 | 4 | 57.1 | 54.9 | 2 / 35 | 4086 |
| 3 | 4 | 57.1 | 55.9 | 0 / 35 | 3921 |
| 4 | 4 | 57.4 | 54.9 | 1 / 35 | 4251 |
| 5 | 4 | 58.3 | 57.1 | 1 / 35 | 4405 |
| 6 | 3 | 61.3 | 67.3 | 1 / 35 | 4389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 23 | 4% |
| cb.fire.Firestarter 2.0f | 17 | 6% |
| wompi.Numbat 2.1 | 10 | 40% |
| axeBots.HataMoto 3.09 | 2 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 66 | 33% | 68 |
| cb.fire.Firestarter 2.0f | 64 | 32% | 66 |
| wompi.Numbat 2.1 | 23 | 11% | 25 |
| axeBots.HataMoto 3.09 | 13 | 6% | 15 |
| ms.Ares 0.19 | 12 | 6% | 12 |
| supersample.SuperBoxBot 1.0 | 11 | 5% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 4% | 8 |
| GarmBox.Oranges 1.0 | 3 | 1% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.1 | 97 / 210 | 2.97 | 16.7% | 26685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.7% | 97 |
| jekl.StoneGhost 0.7 | 2.2 | 14.7% | 32 |
| origin.SleepSiphon 1.7b | 2.7 | 13.7% | 52 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.1% | 15 |
| mld.Wisdom 1.0 | 4.5 | 11.3% | 6 |
| gg.Wolverine 2.0 | 6.2 | 8.5% | 3 |
| spinnercat.Omen 1.0 | 7.5 | 7.1% | 2 |
| DBall.NUKE 0.1 | 7.8 | 6.7% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.5% | 2 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.3 | 17 / 35 | 4520 |
| 2 | 1 | 66.3 | 79.4 | 17 / 35 | 4646 |
| 3 | 1 | 65.3 | 76.8 | 15 / 35 | 4515 |
| 4 | 1 | 64.4 | 74.3 | 15 / 35 | 4416 |
| 5 | 3 | 62.7 | 72.4 | 10 / 35 | 3904 |
| 6 | 1 | 68.0 | 84.8 | 23 / 35 | 4684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 46 | 85% |
| origin.SleepSiphon 1.7b | 35 | 51% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 76% |
| gg.Wolverine 2.0 | 6 | 100% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 60% |
| DBall.NUKE 0.1 | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 30 | 26% | 59 |
| mld.Wisdom 1.0 | 27 | 24% | 32 |
| jekl.StoneGhost 0.7 | 24 | 21% | 53 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 16% | 37 |
| spinnercat.Omen 1.0 | 5 | 4% | 10 |
| gg.Wolverine 2.0 | 5 | 4% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 7 |
| DBall.NUKE 0.1 | 2 | 2% | 4 |

## Melee bench: F07

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 82.6 | 75 / 210 | 2.57 | 18.3% | 35682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 18.3% | 75 |
| rsalesc.melee.Monk 0.3.6c | 1.7 | 18.2% | 67 |
| rtk.Tachikoma 1.0 | 3.0 | 16.1% | 48 |
| franzor.Lizt 1.3.1 | 4.0 | 10.9% | 12 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 10.0% | 6 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.9% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.3% | 0 |
| sample.Target 1.0 | 9.2 | 3.0% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 75.9 | 7 / 35 | 5620 |
| 2 | 1 | 68.6 | 80.3 | 13 / 35 | 5854 |
| 3 | 1 | 69.2 | 82.5 | 11 / 35 | 6121 |
| 4 | 2 | 69.5 | 84.4 | 11 / 35 | 6117 |
| 5 | 1 | 70.4 | 87.0 | 19 / 35 | 5834 |
| 6 | 1 | 69.9 | 85.4 | 14 / 35 | 6136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 63 | 59% |
| rsalesc.melee.Monk 0.3.6c | 47 | 15% |
| oog.melee.CapuletDroid 1.1 | 20 | 85% |
| franzor.Lizt 1.3.1 | 18 | 67% |
| exauge.GateKeeper 1.1.121g | 3 | 33% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 1169. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 63 | 47% | 84 |
| rtk.Tachikoma 1.0 | 38 | 28% | 83 |
| oog.melee.CapuletDroid 1.1 | 14 | 10% | 23 |
| franzor.Lizt 1.3.1 | 9 | 7% | 2 |
| exauge.GateKeeper 1.1.121g | 7 | 5% | 11 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 3 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |

## Melee bench: F08

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 78.6 | 90 / 210 | 2.92 | 18.1% | 34615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 90 |
| tm.Yuugao 1.0 | 2.2 | 13.7% | 64 |
| shrub.Vapour v159 | 3.5 | 11.8% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 9.9% | 7 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.0% | 13 |
| m3thos.Eva00 1.1 | 6.3 | 8.9% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.2% | 9 |
| qualidafial.MajorDick 1.0.1 | 7.5 | 7.9% | 2 |
| SHAM.WOW 1.4 | 9.2 | 6.2% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 81.9 | 19 / 35 | 5703 |
| 2 | 1 | 67.7 | 80.0 | 18 / 35 | 5892 |
| 3 | 1 | 68.1 | 83.2 | 16 / 35 | 5838 |
| 4 | 1 | 64.5 | 70.8 | 13 / 35 | 5281 |
| 5 | 1 | 68.1 | 82.5 | 12 / 35 | 6291 |
| 6 | 1 | 65.6 | 73.3 | 12 / 35 | 5610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 29% |
| shrub.Vapour v159 | 39 | 85% |
| Krabb.sliNk.Garm 0.9u | 23 | 78% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| com.spp.robocode.MostlyHarmless 010 | 10 | 70% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 1 | 0% |

Hadur died in 120 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 54 | 45% | 73 |
| com.spp.robocode.MostlyHarmless 010 | 16 | 13% | 32 |
| Krabb.sliNk.Garm 0.9u | 13 | 11% | 22 |
| shrub.Vapour v159 | 11 | 9% | 33 |
| SHAM.WOW 1.4 | 8 | 7% | 13 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 5% | 13 |
| m3thos.Eva00 1.1 | 5 | 4% | 13 |
| zyx.nano.BacillusComma 1.0 | 5 | 4% | 6 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 5 |

## Melee bench: F09

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 62.9 | 28 / 210 | 4.34 | 13.3% | 23594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 115 |
| hadur117.micro.Saor 0.2 | 2.5 | 13.3% | 28 |
| kc.micro.Figment 1.0 | 2.7 | 13.1% | 30 |
| yagami.Tidus 0.11 | 4.5 | 10.8% | 1 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.7% | 21 |
| mc2.enemy.Original 0.9 | 5.7 | 9.2% | 13 |
| dft.Calliope 5.6 | 7.0 | 8.1% | 2 |
| step.nanoPri 1.0 | 8.2 | 6.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.8% | 0 |
| rdm.Dueler 0.4x | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 60.0 | 5 / 35 | 4266 |
| 2 | 3 | 61.3 | 69.5 | 3 / 35 | 3875 |
| 3 | 3 | 60.3 | 64.8 | 6 / 35 | 4003 |
| 4 | 2 | 60.1 | 67.3 | 5 / 35 | 3592 |
| 5 | 3 | 57.7 | 57.8 | 4 / 35 | 3879 |
| 6 | 2 | 58.7 | 58.1 | 5 / 35 | 3979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 37 | 11% |
| kc.micro.Figment 1.0 | 29 | 55% |
| mc2.enemy.Original 0.9 | 7 | 43% |
| pedersen.Grishnakh 1.0 | 4 | 75% |
| dft.Calliope 5.6 | 2 | 0% |
| yagami.Tidus 0.11 | 2 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 80 | 44% | 83 |
| kc.micro.Figment 1.0 | 52 | 29% | 70 |
| pedersen.Grishnakh 1.0 | 11 | 6% | 14 |
| mc2.enemy.Original 0.9 | 10 | 5% | 12 |
| robar.nano.Assertive_Melee 0.2 | 8 | 4% | 8 |
| yagami.Tidus 0.11 | 7 | 4% | 9 |
| dft.Calliope 5.6 | 6 | 3% | 6 |
| step.nanoPri 1.0 | 4 | 2% | 4 |
| rdm.Dueler 0.4x | 4 | 2% | 4 |

## Melee bench: F10

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.4 | 116 / 210 | 2.31 | 18.4% | 32470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.4% | 116 |
| DTF.Kludgy 1.2b | 2.3 | 14.4% | 49 |
| ne.Chimera 1.2 | 3.5 | 12.4% | 14 |
| ejb.Polaris 1.0.1 | 3.8 | 12.0% | 18 |
| vStar.RAFzilla 2.15 | 5.0 | 11.2% | 4 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.2% | 7 |
| sam.Samspin 1.0 | 7.5 | 6.2% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.4% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.5% | 1 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.3 | 20 / 35 | 5462 |
| 2 | 1 | 65.7 | 77.1 | 20 / 35 | 4654 |
| 3 | 1 | 68.5 | 86.7 | 19 / 35 | 5192 |
| 4 | 1 | 68.8 | 88.3 | 17 / 35 | 5779 |
| 5 | 1 | 68.6 | 86.3 | 21 / 35 | 5506 |
| 6 | 1 | 69.1 | 87.9 | 19 / 35 | 5877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 45 | 44% |
| ejb.Polaris 1.0.1 | 43 | 77% |
| ne.Chimera 1.2 | 29 | 72% |
| vStar.RAFzilla 2.15 | 23 | 91% |
| tvv.micro.Antares 1.1.1 | 15 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 50 | 53% | 68 |
| ne.Chimera 1.2 | 15 | 16% | 37 |
| ejb.Polaris 1.0.1 | 13 | 14% | 49 |
| vStar.RAFzilla 2.15 | 6 | 6% | 26 |
| kurios.DOSexe .9b | 4 | 4% | 8 |
| tvv.micro.Antares 1.1.1 | 3 | 3% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 3% | 3 |
| donjezza.Muncho 1.0 | 1 | 1% | 5 |

## Melee bench: F11

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 71.4 | 48 / 210 | 3.58 | 15.3% | 27430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 17.3% | 95 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.3% | 48 |
| cx.mini.Nimrod 0.55 | 3.2 | 11.6% | 25 |
| djc.DynaBot 0.1.1 | 3.8 | 10.9% | 19 |
| rdt199.Warlord 0.73 | 5.3 | 9.4% | 9 |
| br2.MobyDickBot 1.6 | 6.2 | 8.8% | 10 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.8% | 1 |
| uji.YellohFellah 1.0 | 7.3 | 7.7% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 6.0% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 62.5 | 11 / 35 | 4664 |
| 2 | 1 | 65.8 | 81.6 | 9 / 35 | 4894 |
| 3 | 2 | 60.7 | 64.8 | 6 / 35 | 4252 |
| 4 | 2 | 60.0 | 64.1 | 2 / 35 | 4412 |
| 5 | 2 | 64.7 | 74.9 | 11 / 35 | 4667 |
| 6 | 2 | 65.0 | 80.3 | 9 / 35 | 4541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 51 | 16% |
| djc.DynaBot 0.1.1 | 20 | 80% |
| cx.mini.Nimrod 0.55 | 18 | 56% |
| br2.MobyDickBot 1.6 | 6 | 83% |
| rdt199.Warlord 0.73 | 6 | 50% |
| uji.YellohFellah 1.0 | 5 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |

Hadur died in 163 of 210 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 76 | 47% | 86 |
| cx.mini.Nimrod 0.55 | 35 | 21% | 45 |
| rdt199.Warlord 0.73 | 14 | 9% | 20 |
| djc.DynaBot 0.1.1 | 13 | 8% | 21 |
| KiraNL.Chupacabra 0.4 | 12 | 7% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 2% | 4 |
| uji.YellohFellah 1.0 | 3 | 2% | 10 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| br2.MobyDickBot 1.6 | 2 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.2 | 88 / 210 | 2.88 | 16.6% | 23897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.6% | 88 |
| nat.PallasHawk 1.0 | 2.2 | 14.2% | 54 |
| bts.wiki.RipCurl 0.9b | 3.3 | 12.6% | 32 |
| darkcanuck.Leon 1.01 | 3.7 | 12.4% | 15 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.6% | 13 |
| jrm.Test0 1.0 | 6.0 | 8.6% | 2 |
| jp.Perpy 16.0 | 7.3 | 7.3% | 2 |
| cs.sheldor.Talon 1.1 | 8.0 | 6.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.8% | 4 |
| stuff.Vlad 0.1 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 72.4 | 13 / 35 | 3587 |
| 2 | 1 | 66.6 | 82.2 | 15 / 35 | 4299 |
| 3 | 1 | 65.7 | 79.7 | 16 / 35 | 4014 |
| 4 | 1 | 65.1 | 78.1 | 15 / 35 | 4024 |
| 5 | 1 | 66.0 | 84.4 | 15 / 35 | 4040 |
| 6 | 1 | 64.8 | 78.1 | 14 / 35 | 3933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 45 | 56% |
| darkcanuck.Leon 1.01 | 32 | 81% |
| bts.wiki.RipCurl 0.9b | 28 | 57% |
| brainfade.melee.Genghis 0.36 | 21 | 67% |
| jaybot.bots.Oddball 4.0 | 3 | 33% |
| jrm.Test0 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 33 | 27% | 60 |
| bts.wiki.RipCurl 0.9b | 30 | 24% | 44 |
| darkcanuck.Leon 1.01 | 20 | 16% | 49 |
| brainfade.melee.Genghis 0.36 | 16 | 13% | 23 |
| jrm.Test0 1.0 | 11 | 9% | 15 |
| jp.Perpy 16.0 | 6 | 5% | 8 |
| jaybot.bots.Oddball 4.0 | 4 | 3% | 5 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 62.6 | 12 / 210 | 4.36 | 12.8% | 25037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.9% | 96 |
| ags.Glacier 0.2.11 | 1.5 | 17.0% | 66 |
| shinh.Entangled 0.3 | 3.8 | 12.4% | 21 |
| hadur117.micro.Saor 0.2 | 3.8 | 12.8% | 12 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.9% | 15 |
| apc.Colossus2 0.17 | 6.0 | 8.7% | 1 |
| stelo.Wang 1.0 | 7.2 | 6.4% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.6% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.5 | 59.4 | 2 / 35 | 4068 |
| 2 | 3 | 58.6 | 61.9 | 0 / 35 | 3949 |
| 3 | 3 | 62.0 | 67.6 | 2 / 35 | 4573 |
| 4 | 3 | 61.9 | 66.0 | 5 / 35 | 4593 |
| 5 | 5 | 57.3 | 54.6 | 2 / 35 | 4044 |
| 6 | 4 | 59.5 | 66.3 | 1 / 35 | 3810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 36 | 11% |
| mn.Combat 3.25.0 | 20 | 25% |
| shinh.Entangled 0.3 | 4 | 25% |
| gh.micro.Gruweltje 0.7 | 3 | 0% |
| apc.Colossus2 0.17 | 2 | 50% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 75 | 38% | 80 |
| mn.Combat 3.25.0 | 48 | 24% | 53 |
| shinh.Entangled 0.3 | 26 | 13% | 26 |
| gh.micro.Gruweltje 0.7 | 19 | 10% | 20 |
| maribo.FollowFire 1 | 10 | 5% | 9 |
| stelo.Wang 1.0 | 7 | 4% | 8 |
| apc.Colossus2 0.17 | 6 | 3% | 7 |
| ayk.WallHugger 1.0 | 6 | 3% | 6 |
| sample.Tracker 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.6 | 117 / 210 | 3.11 | 17.1% | 30097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.1% | 117 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.3% | 23 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.6% | 50 |
| Lo_Ian.Gandalf_V4 4.0 | 4.5 | 10.5% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.4% | 4 |
| sanyi.mikrobi.Roberto 1.0 | 6.2 | 9.3% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 8.2% | 6 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 73.7 | 18 / 35 | 4919 |
| 2 | 1 | 66.3 | 78.4 | 19 / 35 | 4746 |
| 3 | 1 | 64.6 | 71.1 | 21 / 35 | 4615 |
| 4 | 1 | 67.0 | 79.0 | 18 / 35 | 5357 |
| 5 | 1 | 67.1 | 79.0 | 21 / 35 | 5400 |
| 6 | 1 | 66.7 | 78.1 | 20 / 35 | 5060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 87% |
| catcat20.shape.Theta 0.018 | 33 | 42% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 91% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 38 | 41% | 104 |
| catcat20.shape.Theta 0.018 | 34 | 37% | 50 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 6% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 15 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 4% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 2% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 2% | 3 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |
| pa.Improved 1.0 | 1 | 1% | 6 |

## Melee bench: F15

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 85.9 | 131 / 210 | 2.27 | 19.8% | 36225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.8% | 131 |
| kawigi.micro.Shiz 1.1 | 2.8 | 12.9% | 13 |
| emp.Yngwie 1.11 | 3.0 | 12.7% | 38 |
| mld.DustBunny 3.8 | 3.2 | 12.4% | 6 |
| kawigi.robot.Girl 1.2 | 5.3 | 9.1% | 13 |
| cb.nano.Insomnia 1.0 | 6.0 | 8.6% | 6 |
| lambdaxy.TBot 0.1 | 7.2 | 7.2% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.0% | 2 |
| divineomega.TrialBot 0.003 | 9.3 | 5.2% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 83.8 | 25 / 35 | 6672 |
| 2 | 1 | 67.0 | 76.2 | 18 / 35 | 5585 |
| 3 | 1 | 70.5 | 88.3 | 26 / 35 | 5856 |
| 4 | 1 | 69.4 | 85.7 | 20 / 35 | 6114 |
| 5 | 1 | 71.7 | 94.3 | 21 / 35 | 6399 |
| 6 | 1 | 69.0 | 87.0 | 21 / 35 | 5599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 45 | 67% |
| kawigi.micro.Shiz 1.1 | 43 | 95% |
| mld.DustBunny 3.8 | 27 | 96% |
| kawigi.robot.Girl 1.2 | 22 | 73% |
| cb.nano.Insomnia 1.0 | 16 | 88% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 25 | 32% | 71 |
| cb.nano.Insomnia 1.0 | 14 | 18% | 14 |
| kawigi.micro.Shiz 1.1 | 13 | 16% | 49 |
| kawigi.robot.Girl 1.2 | 11 | 14% | 19 |
| mld.DustBunny 3.8 | 5 | 6% | 33 |
| divineomega.TrialBot 0.003 | 4 | 5% | 14 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 4% | 3 |
| lambdaxy.TBot 0.1 | 3 | 4% | 3 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.1 | 67 / 210 | 2.61 | 18.0% | 33498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 18.0% | 67 |
| gh.Griezel 0.5.2 | 1.7 | 17.3% | 93 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.3 | 12.7% | 1 |
| techdude.forest.FlamingForest 1.1 | 3.8 | 11.1% | 40 |
| tvv.nano.Polaris 1.2 | 5.3 | 8.8% | 3 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 8.7% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.4% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 5.4% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.3% | 3 |
| asd.Cthulhu 1.3 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.1 | 14 / 35 | 6034 |
| 2 | 2 | 68.1 | 86.0 | 9 / 35 | 5446 |
| 3 | 1 | 66.1 | 79.7 | 10 / 35 | 5217 |
| 4 | 1 | 67.8 | 79.0 | 10 / 35 | 5879 |
| 5 | 2 | 65.4 | 74.9 | 11 / 35 | 5232 |
| 6 | 1 | 69.2 | 87.6 | 13 / 35 | 5690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 86 | 21% |
| techdude.forest.FlamingForest 1.1 | 28 | 50% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 92% |
| bvh.fnr.Fenrir 0.36l | 9 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 1420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 83 | 58% | 106 |
| techdude.forest.FlamingForest 1.1 | 16 | 11% | 31 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 9% | 30 |
| stelo.IntrinsicVolatility 1.4 | 12 | 8% | 15 |
| bvh.fnr.Fenrir 0.36l | 8 | 6% | 8 |
| asd.Cthulhu 1.3 | 4 | 3% | 4 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 8 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 7 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.3 | 101 / 210 | 2.68 | 17.8% | 30315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.8% | 101 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.2% | 34 |
| et.Predator 1.8 | 2.8 | 13.3% | 31 |
| nic.Nicator 2.4 | 4.2 | 11.0% | 10 |
| cx.BlestPain 1.41 | 5.0 | 10.6% | 25 |
| ahf.NanoAndrew .4 | 5.5 | 10.4% | 6 |
| maribo.melee.BMV 0.1 | 7.0 | 8.8% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 6.1% | 0 |
| tex.Longbot 0.4 | 8.5 | 6.1% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.4 | 20 / 35 | 5179 |
| 2 | 1 | 67.1 | 81.0 | 18 / 35 | 5005 |
| 3 | 1 | 66.9 | 81.9 | 14 / 35 | 4803 |
| 4 | 1 | 67.7 | 82.5 | 20 / 35 | 4921 |
| 5 | 1 | 66.8 | 77.8 | 14 / 35 | 5279 |
| 6 | 1 | 67.0 | 79.4 | 15 / 35 | 5128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 41 | 78% |
| oog.melee.Mercutio 1.0 | 37 | 59% |
| nic.Nicator 2.4 | 24 | 75% |
| cx.BlestPain 1.41 | 23 | 43% |
| ahf.NanoAndrew .4 | 10 | 90% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1056. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 30 | 27% | 55 |
| oog.melee.Mercutio 1.0 | 23 | 21% | 53 |
| cx.BlestPain 1.41 | 23 | 21% | 36 |
| nic.Nicator 2.4 | 16 | 14% | 29 |
| ahf.NanoAndrew .4 | 10 | 9% | 17 |
| maribo.melee.BMV 0.1 | 7 | 6% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 5 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| tex.Longbot 0.4 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 81.1 | 110 / 210 | 2.70 | 17.5% | 26974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.5% | 110 |
| morbid.MorbidPriest 1.0 | 2.5 | 12.5% | 23 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.0% | 31 |
| uji.DBH 1.1 | 4.5 | 10.3% | 14 |
| ratosh.Nobo 0.21 | 4.7 | 10.0% | 5 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.6% | 3 |
| sigterm.Sigterm 1.0 | 6.8 | 8.7% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 8.0% | 6 |
| stelo.WangRobot 1.0 | 9.2 | 5.8% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.1 | 18 / 35 | 4654 |
| 2 | 1 | 65.0 | 77.5 | 18 / 35 | 4166 |
| 3 | 1 | 65.6 | 79.7 | 19 / 35 | 4405 |
| 4 | 1 | 69.1 | 90.8 | 22 / 35 | 5088 |
| 5 | 1 | 65.1 | 75.2 | 17 / 35 | 4675 |
| 6 | 1 | 64.4 | 78.4 | 16 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 34 | 79% |
| agd.Mooserwirt2 2.7 | 28 | 50% |
| uji.DBH 1.1 | 26 | 88% |
| sigterm.Sigterm 1.0 | 17 | 100% |
| spinnercat.Robovirus 2.718 | 15 | 93% |
| ratosh.Nobo 0.21 | 7 | 86% |
| stelo.WangRobot 1.0 | 6 | 83% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 40% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 24 | 24% | 57 |
| agd.Mooserwirt2 2.7 | 22 | 22% | 45 |
| uji.DBH 1.1 | 12 | 12% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 12% | 16 |
| ratosh.Nobo 0.21 | 11 | 11% | 18 |
| spinnercat.Robovirus 2.718 | 7 | 7% | 22 |
| stelo.WangRobot 1.0 | 6 | 6% | 9 |
| sigterm.Sigterm 1.0 | 3 | 3% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 3 |

## Melee bench: F19

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.0 | 170 / 210 | 1.72 | 21.1% | 35751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 21.1% | 170 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 13.7% | 8 |
| mld.Infinity 2.2 | 2.8 | 13.1% | 21 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.1% | 9 |
| erdnis.Rover 0.3 | 4.7 | 10.4% | 2 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.5% | 1 |
| mbh.Mbh 0.1 | 7.0 | 7.5% | 0 |
| pac.ABC 2.1 | 8.0 | 7.1% | 1 |
| pbg.R2D2 1.0 | 8.8 | 6.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 92.7 | 27 / 35 | 6059 |
| 2 | 1 | 73.0 | 94.9 | 32 / 35 | 6269 |
| 3 | 1 | 72.9 | 96.2 | 32 / 35 | 6213 |
| 4 | 1 | 70.8 | 88.6 | 26 / 35 | 5728 |
| 5 | 1 | 69.5 | 84.1 | 23 / 35 | 5394 |
| 6 | 1 | 72.4 | 95.6 | 30 / 35 | 6088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 79 | 95% |
| mld.Infinity 2.2 | 59 | 88% |
| krillr.mini.JointStrike 2.0.0 | 20 | 85% |
| erdnis.Rover 0.3 | 8 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 18 | 43% | 101 |
| mld.Infinity 2.2 | 8 | 19% | 26 |
| krillr.mini.JointStrike 2.0.0 | 7 | 17% | 27 |
| erdnis.Rover 0.3 | 4 | 10% | 18 |
| pbg.R2D2 1.0 | 1 | 2% | 14 |
| mbh.Mbh 0.1 | 1 | 2% | 10 |
| patson.PatsonTestBot 1.0 | 1 | 2% | 8 |
| pac.ABC 2.1 | 1 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.5 | 114 / 210 | 2.22 | 19.5% | 34886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.5% | 114 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 49 |
| fwb.Nine 1.0.1 | 3.5 | 11.2% | 25 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.8% | 0 |
| catcat20.Rabbit 0.001 | 4.7 | 9.8% | 17 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.3% | 1 |
| bayen.nut.Squirrel 1.615 | 7.8 | 6.9% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.6 | 18 / 35 | 6035 |
| 2 | 1 | 69.0 | 82.2 | 19 / 35 | 5891 |
| 3 | 1 | 69.6 | 88.3 | 19 / 35 | 5830 |
| 4 | 1 | 68.3 | 83.2 | 17 / 35 | 5622 |
| 5 | 1 | 69.7 | 87.6 | 21 / 35 | 5513 |
| 6 | 1 | 70.4 | 89.8 | 20 / 35 | 5995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 83 | 70% |
| fwb.Nine 1.0.1 | 37 | 57% |
| catcat20.Rabbit 0.001 | 20 | 50% |
| nz.jdc.nano.GridFu 1.0 | 14 | 100% |
| bayen.nut.Squirrel 1.615 | 5 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1154. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 51 | 53% | 99 |
| fwb.Nine 1.0.1 | 21 | 22% | 14 |
| catcat20.Rabbit 0.001 | 15 | 16% | 31 |
| bayen.nut.Squirrel 1.615 | 4 | 4% | 8 |
| nz.jdc.nano.GridFu 1.0 | 2 | 2% | 23 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 10 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F21

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.9 | 107 / 210 | 2.45 | 18.9% | 33586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.9% | 107 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 77 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 6 |
| eld.Hmm 1.0 | 5.5 | 8.0% | 7 |
| oa.weak.BotherBot 0.1 | 6.0 | 8.0% | 3 |
| fire219.CatBot 1.0 | 7.3 | 6.7% | 0 |
| PSW.Relentless 0.1 | 8.0 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.4% | 3 |
| arthord.MannyPacquiao Beta | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.2 | 16 / 35 | 5708 |
| 2 | 1 | 70.1 | 86.7 | 20 / 35 | 5937 |
| 3 | 1 | 67.7 | 78.7 | 17 / 35 | 5651 |
| 4 | 1 | 70.4 | 87.6 | 22 / 35 | 5815 |
| 5 | 1 | 69.3 | 86.3 | 15 / 35 | 5464 |
| 6 | 1 | 67.4 | 81.9 | 17 / 35 | 5011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 103 | 58% |
| dummy.mini.Scimitar 1.01 | 25 | 92% |
| cf.RiO.RiOx 4.2.1 | 17 | 94% |
| oa.weak.BotherBot 0.1 | 6 | 83% |
| eld.Hmm 1.0 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 65 | 62% | 107 |
| dummy.mini.Scimitar 1.01 | 11 | 10% | 36 |
| cf.RiO.RiOx 4.2.1 | 8 | 8% | 28 |
| PSW.Relentless 0.1 | 7 | 7% | 7 |
| el.JumpShoot 0.2 | 5 | 5% | 5 |
| oa.weak.BotherBot 0.1 | 4 | 4% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 4 |
| eld.Hmm 1.0 | 1 | 1% | 12 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.3 | 61 / 210 | 2.77 | 17.1% | 31349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.2 | 17.4% | 82 |
| hadur117.micro.Saor 0.2 | 1.8 | 17.1% | 61 |
| kvk.HebusLeTroll 0.35 | 3.2 | 13.7% | 35 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.1% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 8 |
| tad.Dalek98 0.98 | 6.5 | 7.2% | 1 |
| gg.Squaraus 0.6 | 7.0 | 7.2% | 0 |
| yk.JahRoslav 1.1 | 7.5 | 6.5% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 78.7 | 8 / 35 | 5266 |
| 2 | 2 | 66.1 | 76.8 | 8 / 35 | 5371 |
| 3 | 2 | 67.8 | 83.5 | 11 / 35 | 5428 |
| 4 | 2 | 66.5 | 79.0 | 11 / 35 | 5251 |
| 5 | 2 | 66.4 | 81.9 | 10 / 35 | 5012 |
| 6 | 1 | 67.1 | 81.9 | 13 / 35 | 5021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 67 | 24% |
| kvk.HebusLeTroll 0.35 | 42 | 57% |
| jlm.javaDisturbance 0.59 | 25 | 48% |
| bigpete.Stewie 1.0 | 9 | 78% |
| pbg.NinjaX 1.2 | 2 | 50% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 66 | 44% | 86 |
| kvk.HebusLeTroll 0.35 | 32 | 21% | 46 |
| jlm.javaDisturbance 0.59 | 24 | 16% | 39 |
| tad.Dalek98 0.98 | 11 | 7% | 12 |
| bigpete.Stewie 1.0 | 8 | 5% | 13 |
| pbg.NinjaX 1.2 | 3 | 2% | 5 |
| yk.JahRoslav 1.1 | 3 | 2% | 4 |
| gg.Squaraus 0.6 | 2 | 1% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 79.4 | 87 / 210 | 2.86 | 18.1% | 35060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.1% | 87 |
| pe.SandboxLump 1.52 | 2.0 | 16.8% | 74 |
| cre.Karolos 0.32 | 2.8 | 14.3% | 30 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.9% | 8 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.8% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.8% | 0 |
| cw.megas.Blade 0.8 | 6.3 | 8.9% | 0 |
| sample.Walls 1.0 | 7.8 | 7.4% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 67.6 | 11 / 35 | 5571 |
| 2 | 1 | 70.2 | 83.8 | 17 / 35 | 6829 |
| 3 | 1 | 69.0 | 82.2 | 19 / 35 | 5597 |
| 4 | 1 | 68.2 | 81.3 | 12 / 35 | 5430 |
| 5 | 1 | 68.3 | 79.4 | 14 / 35 | 5880 |
| 6 | 1 | 68.5 | 81.9 | 14 / 35 | 5753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 73 | 49% |
| cre.Karolos 0.32 | 35 | 57% |
| stelo.AreaTargetingBot 1.1 | 13 | 92% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 55 | 45% | 92 |
| cre.Karolos 0.32 | 32 | 26% | 50 |
| stelo.RamTrackSurfer 1.2 | 11 | 9% | 21 |
| stelo.AreaTargetingBot 1.1 | 10 | 8% | 20 |
| cw.megas.Blade 0.8 | 9 | 7% | 13 |
| sample.Walls 1.0 | 4 | 3% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 2% | 8 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 68.5 | 42 / 210 | 3.83 | 14.2% | 23630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 1.3 | 14.9% | 60 |
| hadur117.micro.Saor 0.2 | 2.5 | 14.2% | 42 |
| rz.GlowBlowMelee 1.4 | 2.8 | 14.0% | 40 |
| davidalves.Phoenix 0.54 | 3.7 | 12.4% | 44 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.7% | 18 |
| oog.melee.Corsair 1.0 | 6.0 | 9.1% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 7.2% | 4 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.3% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 5.3% | 0 |
| evd.X1 0.01 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 68.6 | 7 / 35 | 3824 |
| 2 | 2 | 61.7 | 67.9 | 6 / 35 | 4241 |
| 3 | 2 | 59.5 | 61.0 | 9 / 35 | 3971 |
| 4 | 3 | 60.2 | 67.9 | 5 / 35 | 3711 |
| 5 | 2 | 62.1 | 72.1 | 10 / 35 | 3861 |
| 6 | 3 | 62.6 | 73.7 | 5 / 35 | 4022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 27 | 41% |
| rz.GlowBlowMelee 1.4 | 24 | 46% |
| davidalves.Phoenix 0.54 | 20 | 20% |
| pedersen.Ugluk 1.1.1 | 14 | 71% |
| stelo.SoJNanoMelee 1.1 | 8 | 75% |

Hadur died in 170 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 55 | 32% | 67 |
| davidalves.Phoenix 0.54 | 32 | 19% | 38 |
| rz.GlowBlowMelee 1.4 | 29 | 17% | 38 |
| pedersen.Ugluk 1.1.1 | 20 | 12% | 29 |
| oog.melee.Corsair 1.0 | 14 | 8% | 17 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 7 |
| evd.X1 0.01 | 6 | 4% | 6 |
| as.FrankTheTank 1.3 | 5 | 3% | 6 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.8 | 134 / 210 | 2.55 | 18.2% | 25561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.2% | 134 |
| voidious.mini.BrokenSword 2.0.3 | 2.8 | 12.6% | 16 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.5% | 13 |
| jdw.Hurricane 1.4 | 3.5 | 11.8% | 22 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 9.7% | 10 |
| ds.Oo 2.2 | 6.2 | 8.7% | 4 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.9% | 5 |
| awesomeness.Elite 1.0 | 7.7 | 7.4% | 3 |
| adt.Ar2 1.1 | 8.5 | 6.9% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.2 | 20 / 35 | 3995 |
| 2 | 1 | 65.3 | 75.2 | 22 / 35 | 4055 |
| 3 | 1 | 70.7 | 94.0 | 29 / 35 | 4611 |
| 4 | 1 | 66.5 | 79.7 | 21 / 35 | 4265 |
| 5 | 1 | 67.4 | 83.5 | 20 / 35 | 4440 |
| 6 | 1 | 67.1 | 82.2 | 22 / 35 | 4195 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 50 | 96% |
| voidious.mini.BrokenSword 2.0.3 | 41 | 85% |
| jdw.Hurricane 1.4 | 26 | 88% |
| ds.Oo 2.2 | 9 | 78% |
| gre.svman4.Morfeas 1.4.1 | 8 | 63% |
| awesomeness.Elite 1.0 | 6 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 21 | 28% | 54 |
| voidious.micro.BlitzBat 1.05 | 17 | 22% | 55 |
| jdw.Hurricane 1.4 | 11 | 14% | 34 |
| gre.svman4.Morfeas 1.4.1 | 8 | 11% | 16 |
| ds.Oo 2.2 | 7 | 9% | 22 |
| gjr.Cephalosporin 0.1 | 4 | 5% | 13 |
| awesomeness.Elite 1.0 | 4 | 5% | 7 |
| adt.Ar2 1.1 | 2 | 3% | 5 |
| amk.ChumbaMini 0.2 | 2 | 3% | 3 |

## Melee bench: F26

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.7 | 96 / 210 | 2.56 | 18.2% | 34040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.2% | 96 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 59 |
| shu.nitro.LENIN .T34 | 3.5 | 11.8% | 28 |
| lrem.Spectre 0.4.4 | 3.5 | 12.3% | 17 |
| js.PinBall 1.6 | 5.5 | 10.3% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.7% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.5% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.5 | 17 / 35 | 5937 |
| 2 | 1 | 68.2 | 82.9 | 16 / 35 | 5636 |
| 3 | 1 | 69.7 | 87.6 | 19 / 35 | 5828 |
| 4 | 1 | 68.8 | 83.5 | 14 / 35 | 5837 |
| 5 | 1 | 67.5 | 80.3 | 15 / 35 | 5698 |
| 6 | 1 | 66.4 | 78.4 | 15 / 35 | 5104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 51 | 39% |
| shu.nitro.LENIN .T34 | 40 | 73% |
| lrem.Spectre 0.4.4 | 31 | 74% |
| js.PinBall 1.6 | 9 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 67% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 100% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 52 | 45% | 73 |
| shu.nitro.LENIN .T34 | 20 | 17% | 52 |
| lrem.Spectre 0.4.4 | 12 | 10% | 28 |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 9% | 14 |
| js.PinBall 1.6 | 8 | 7% | 14 |
| gh.mini.GrubbmOne 1.0 | 6 | 5% | 12 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 3% | 10 |
| sample.SpinBot 1.0 | 3 | 3% | 3 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.0 | 118 / 210 | 2.89 | 17.4% | 27038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.4% | 118 |
| mk.Alpha 0.2.1 | 1.8 | 14.5% | 52 |
| EH.Eagle 1.0.6 | 3.7 | 10.6% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.2% | 11 |
| wee.Gem 1.8.4 | 4.8 | 10.1% | 15 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 9.0% | 1 |
| joe.ADinosaur 1.0 | 6.7 | 8.9% | 3 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.7% | 1 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.4% | 2 |
| cs.Grudge 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.0 | 22 / 35 | 4366 |
| 2 | 2 | 60.5 | 55.6 | 9 / 35 | 4687 |
| 3 | 1 | 67.3 | 83.8 | 21 / 35 | 4550 |
| 4 | 1 | 66.2 | 79.4 | 20 / 35 | 4579 |
| 5 | 1 | 68.6 | 89.5 | 25 / 35 | 4539 |
| 6 | 1 | 67.6 | 86.7 | 21 / 35 | 4317 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 68 | 72% |
| wee.Gem 1.8.4 | 19 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 13 | 100% |
| EH.Eagle 1.0.6 | 11 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |

Hadur died in 93 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 35 | 38% | 85 |
| joe.ADinosaur 1.0 | 15 | 16% | 18 |
| techdude.kombat.FlamingKombat 1.5 | 10 | 11% | 22 |
| wee.Gem 1.8.4 | 8 | 9% | 22 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 8% | 23 |
| cs.Grudge 1.0 | 7 | 8% | 7 |
| throxbot.ThroxBot 0.1 | 6 | 6% | 10 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 8 |
| EH.Eagle 1.0.6 | 1 | 1% | 13 |

## Melee bench: F28

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.8 | 127 / 210 | 2.19 | 18.6% | 26165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.6% | 127 |
| kid.test.NightFox .2 | 2.0 | 14.2% | 32 |
| uji.Antique 1.0 | 3.3 | 11.6% | 26 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.9% | 20 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.8% | 3 |
| ahr.ice.Ice 1.0.2 | 6.2 | 8.4% | 1 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.9% | 0 |
| matt.advanced.Katana 1.0 | 7.7 | 6.8% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 6.0% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.1 | 20 / 35 | 4093 |
| 2 | 1 | 65.4 | 80.3 | 13 / 35 | 4039 |
| 3 | 1 | 71.0 | 97.1 | 28 / 35 | 4716 |
| 4 | 1 | 68.5 | 88.3 | 23 / 35 | 4489 |
| 5 | 1 | 69.6 | 92.7 | 26 / 35 | 4373 |
| 6 | 1 | 65.3 | 78.4 | 17 / 35 | 4455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 68 | 75% |
| uji.Antique 1.0 | 42 | 86% |
| qohnil.blot.BlotBot 3.61 | 19 | 47% |
| amk.ChumbaWumba 0.3 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| ahr.ice.Ice 1.0.2 | 7 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 24 | 29% | 68 |
| uji.Antique 1.0 | 17 | 20% | 51 |
| qohnil.blot.BlotBot 3.61 | 14 | 17% | 32 |
| pfvicm.Sobieski 7.2.3b | 14 | 17% | 14 |
| amk.ChumbaWumba 0.3 | 7 | 8% | 18 |
| stelo.Lifestealer 1.0 | 3 | 4% | 5 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 10 |
| matt.advanced.Katana 1.0 | 2 | 2% | 9 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |

## Melee bench: F29

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.4 | 72 / 210 | 2.85 | 17.1% | 27676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.1% | 72 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.6% | 71 |
| deewiant.Anomaly 0.2 | 2.5 | 14.5% | 47 |
| myl.micro.Troodon 1.10 | 4.2 | 11.4% | 6 |
| jok.PheonixM 0.1.2 | 4.8 | 10.4% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.8% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.3% | 0 |
| ap.Frederick 1.1 | 9.2 | 5.2% | 2 |
| jangs.ns51 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.6 | 15 / 35 | 5164 |
| 2 | 2 | 65.0 | 75.9 | 9 / 35 | 4545 |
| 3 | 1 | 67.0 | 81.3 | 13 / 35 | 4862 |
| 4 | 1 | 68.0 | 85.7 | 12 / 35 | 4601 |
| 5 | 2 | 61.4 | 66.7 | 8 / 35 | 3973 |
| 6 | 1 | 68.5 | 85.4 | 15 / 35 | 4531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 52 | 42% |
| zyx.mega.YersiniaPestis 3.1 | 48 | 23% |
| myl.micro.Troodon 1.10 | 19 | 95% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| DBall.Anarchy 0.1 | 8 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 1035. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 57 | 41% | 71 |
| deewiant.Anomaly 0.2 | 56 | 40% | 82 |
| myl.micro.Troodon 1.10 | 7 | 5% | 16 |
| jok.PheonixM 0.1.2 | 7 | 5% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 4% | 8 |
| jangs.ns51 1.0 | 4 | 3% | 5 |
| DBall.Anarchy 0.1 | 3 | 2% | 10 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 2 |

## Melee bench: F30

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 59.4 | 21 / 210 | 4.66 | 12.6% | 24634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.2 | 13.7% | 56 |
| darkcanuck.B26354 1.06 | 2.2 | 13.5% | 48 |
| hadur117.micro.Saor 0.2 | 3.3 | 12.6% | 21 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.9% | 31 |
| oog.melee.Capulet 1.2 | 3.8 | 12.2% | 30 |
| intruder.PrairieWolf 2.61 | 6.5 | 9.6% | 19 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.9% | 5 |
| ntc.Opposite 1.5 | 7.3 | 8.1% | 0 |
| tripphippy.Alice 1.1 | 8.8 | 6.7% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 58.7 | 1 / 35 | 3969 |
| 2 | 2 | 60.5 | 63.2 | 7 / 35 | 4556 |
| 3 | 5 | 56.9 | 55.6 | 1 / 35 | 4356 |
| 4 | 3 | 57.8 | 61.3 | 4 / 35 | 3769 |
| 5 | 5 | 54.3 | 49.2 | 2 / 35 | 3832 |
| 6 | 1 | 61.1 | 68.3 | 6 / 35 | 4152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 15 | 40% |
| catcat20.Matcha 0.006 | 14 | 7% |
| stelo.PastFuture 2.3.2 | 12 | 50% |
| darkcanuck.B26354 1.06 | 11 | 18% |
| intruder.PrairieWolf 2.61 | 6 | 33% |
| ntc.Opposite 1.5 | 2 | 100% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 44 | 23% | 49 |
| darkcanuck.B26354 1.06 | 42 | 22% | 45 |
| oog.melee.Capulet 1.2 | 39 | 21% | 47 |
| stelo.PastFuture 2.3.2 | 30 | 16% | 34 |
| intruder.PrairieWolf 2.61 | 12 | 6% | 13 |
| tripphippy.Alice 1.1 | 8 | 4% | 9 |
| ntc.Opposite 1.5 | 6 | 3% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 3% | 6 |
| GarmBox.Anger 1.0 | 2 | 1% | 1 |

## Melee bench: F31

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 72.0 | 29 / 210 | 3.52 | 14.4% | 22271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.0% | 123 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.4% | 29 |
| gh.mini.Griezel 0.2 | 3.3 | 12.9% | 40 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.2% | 7 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.2% | 7 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.1% | 2 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.3% | 2 |
| fm.mammillarias 1.3 | 8.0 | 6.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.9% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 77.1 | 5 / 35 | 3914 |
| 2 | 2 | 61.1 | 69.2 | 4 / 35 | 3630 |
| 3 | 2 | 60.0 | 68.3 | 4 / 35 | 3263 |
| 4 | 2 | 64.1 | 76.8 | 7 / 35 | 3995 |
| 5 | 2 | 62.7 | 73.0 | 4 / 35 | 3957 |
| 6 | 2 | 60.7 | 67.6 | 5 / 35 | 3512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 43 | 9% |
| gh.mini.Griezel 0.2 | 22 | 27% |
| spinnercat.micro.Tyger 0.1 | 10 | 90% |
| d414.nano.Quantum 1.0.0 | 8 | 75% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |

Hadur died in 181 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 101 | 56% | 107 |
| gh.mini.Griezel 0.2 | 33 | 18% | 43 |
| spinnercat.micro.Tyger 0.1 | 15 | 8% | 18 |
| timmit.nano.TimDog 0.33 | 9 | 5% | 10 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 11 |
| d414.nano.Quantum 1.0.0 | 6 | 3% | 11 |
| fm.mammillarias 1.3 | 6 | 3% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 79.4 | 88 / 210 | 2.86 | 17.0% | 28842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.0% | 88 |
| kawigi.sbf.FloodHT 0.9.2 | 1.7 | 15.6% | 77 |
| apc.botM 3.0 | 3.2 | 11.7% | 20 |
| vjik.UnViolation 1.1 | 4.0 | 10.6% | 8 |
| lxx.ConceptA 0.8 | 5.0 | 10.1% | 5 |
| bayen.UbaMicro 1.4 | 5.8 | 9.0% | 3 |
| yk.JahMicro 1.0 | 7.7 | 7.0% | 3 |
| panzer.Panzer 0.2 | 7.7 | 7.3% | 1 |
| conscience.Electron 1.3g | 8.8 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.3% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.9 | 17 / 35 | 5181 |
| 2 | 1 | 67.0 | 82.5 | 20 / 35 | 4742 |
| 3 | 2 | 65.3 | 81.0 | 11 / 35 | 4568 |
| 4 | 2 | 62.9 | 72.7 | 10 / 35 | 4637 |
| 5 | 1 | 66.7 | 82.9 | 13 / 35 | 5027 |
| 6 | 1 | 64.3 | 74.3 | 17 / 35 | 4687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 69 | 22% |
| lxx.ConceptA 0.8 | 26 | 96% |
| apc.botM 3.0 | 21 | 86% |
| vjik.UnViolation 1.1 | 14 | 93% |
| donjezza.Jezza 1.0 | 5 | 80% |
| panzer.Panzer 0.2 | 5 | 80% |
| yk.JahMicro 1.0 | 4 | 75% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 64 | 52% | 95 |
| lxx.ConceptA 0.8 | 13 | 11% | 22 |
| apc.botM 3.0 | 10 | 8% | 26 |
| conscience.Electron 1.3g | 9 | 7% | 12 |
| vjik.UnViolation 1.1 | 8 | 7% | 27 |
| yk.JahMicro 1.0 | 6 | 5% | 9 |
| bayen.UbaMicro 1.4 | 6 | 5% | 7 |
| panzer.Panzer 0.2 | 5 | 4% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 6 |

## Melee bench: F33

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.1 | 100 / 210 | 2.70 | 18.3% | 31883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 18.3% | 100 |
| maribo.Quester 0.3 | 1.8 | 16.2% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.5% | 19 |
| labg.Cataclysm 2.05 | 4.3 | 11.1% | 24 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.8% | 10 |
| baal.nano.N 1.42 | 6.3 | 8.5% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.2% | 7 |
| zyx.micro.Ant 1.1 | 8.5 | 5.4% | 0 |
| sanja.First 0.1 | 8.7 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 86.7 | 19 / 35 | 5717 |
| 2 | 2 | 64.5 | 69.2 | 12 / 35 | 4837 |
| 3 | 2 | 67.6 | 80.6 | 13 / 35 | 5195 |
| 4 | 1 | 68.5 | 85.1 | 19 / 35 | 4901 |
| 5 | 1 | 68.9 | 81.3 | 18 / 35 | 5660 |
| 6 | 1 | 69.3 | 83.8 | 19 / 35 | 5573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 61 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 80% |
| gre.svman4.Leonidas 1.3.2 | 22 | 82% |
| labg.Cataclysm 2.05 | 15 | 40% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 48 | 43% | 95 |
| labg.Cataclysm 2.05 | 18 | 16% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 13% | 36 |
| gre.svman4.Leonidas 1.3.2 | 11 | 10% | 24 |
| zyx.micro.Ant 1.1 | 6 | 5% | 6 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 4% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 4% | 5 |
| baal.nano.N 1.42 | 3 | 3% | 6 |
| sanja.First 0.1 | 2 | 2% | 2 |

## Melee bench: F34

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.1 | 41 / 210 | 3.15 | 15.9% | 28233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.7 | 16.8% | 86 |
| kid.Gladiator .7.2 | 2.0 | 16.3% | 62 |
| hadur117.micro.Saor 0.2 | 2.3 | 15.9% | 41 |
| jcs.Seth 1.8 | 4.3 | 11.2% | 12 |
| tcf.Reach 3 | 5.0 | 10.7% | 5 |
| cli.Dancer 1.1 | 5.7 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.6% | 3 |
| amk.Punbot.Punbot 0.01 | 8.2 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 8.8 | 3.9% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 71.7 | 2 / 35 | 4147 |
| 2 | 3 | 63.8 | 71.4 | 4 / 35 | 4877 |
| 3 | 1 | 67.9 | 83.2 | 11 / 35 | 5043 |
| 4 | 2 | 65.0 | 75.2 | 9 / 35 | 4782 |
| 5 | 2 | 66.4 | 80.0 | 5 / 35 | 5059 |
| 6 | 3 | 65.1 | 75.2 | 10 / 35 | 4325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 50 | 22% |
| kid.Gladiator .7.2 | 34 | 21% |
| jcs.Seth 1.8 | 16 | 88% |
| tcf.Reach 3 | 4 | 75% |
| ratosh.Wesco 1.4 | 4 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 72 | 43% | 75 |
| stelo.Spread 0.9 | 63 | 37% | 77 |
| tcf.Reach 3 | 15 | 9% | 20 |
| jcs.Seth 1.8 | 8 | 5% | 22 |
| ratosh.Wesco 1.4 | 6 | 4% | 9 |
| cli.Dancer 1.1 | 5 | 3% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 74.0 | 27 / 210 | 3.34 | 14.5% | 22033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 147 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.5% | 27 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.8% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.1% | 13 |
| rz.HawkOnFire 0.1 | 4.7 | 11.6% | 5 |
| wit.Chuliath 1.0 | 6.2 | 7.1% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 8.7 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 73.3 | 5 / 35 | 3524 |
| 2 | 2 | 63.4 | 75.2 | 6 / 35 | 3844 |
| 3 | 2 | 63.5 | 76.5 | 5 / 35 | 3915 |
| 4 | 2 | 60.5 | 69.2 | 3 / 35 | 3440 |
| 5 | 2 | 63.7 | 76.8 | 5 / 35 | 3785 |
| 6 | 2 | 61.5 | 72.7 | 3 / 35 | 3525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 46 | 9% |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 73% |
| rz.HawkOnFire 0.1 | 12 | 58% |
| gh.mini.Gruwel 0.9 | 10 | 50% |

Hadur died in 183 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 112 | 61% | 118 |
| dmh.robocode.robot.BlackDeath 9.2 | 23 | 13% | 34 |
| gh.mini.Gruwel 0.9 | 21 | 11% | 26 |
| rz.HawkOnFire 0.1 | 12 | 7% | 17 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.4 | 159 / 210 | 1.96 | 20.7% | 34165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.7% | 159 |
| alpha.RainingFire 1.0 | 2.7 | 11.5% | 15 |
| bzdp.Pansy 2.1 | 3.7 | 11.4% | 6 |
| bvh.micro.Freya 0.3 | 3.8 | 10.8% | 13 |
| mz.Cork 0.1 | 4.0 | 10.8% | 7 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.1% | 5 |
| bvh.mini.Fenrir 0.39 | 6.8 | 8.2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.0% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 5.8% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.3 | 26 / 35 | 5762 |
| 2 | 1 | 72.0 | 94.6 | 30 / 35 | 5702 |
| 3 | 1 | 69.6 | 86.7 | 21 / 35 | 5863 |
| 4 | 1 | 70.6 | 89.5 | 25 / 35 | 5799 |
| 5 | 1 | 71.2 | 93.0 | 29 / 35 | 5675 |
| 6 | 1 | 69.8 | 85.1 | 28 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 42 | 86% |
| bzdp.Pansy 2.1 | 42 | 100% |
| mz.Cork 0.1 | 26 | 88% |
| alpha.RainingFire 1.0 | 25 | 88% |
| bvh.mini.Fenrir 0.39 | 18 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| m3thos.Eva02 0.7.1 | 7 | 86% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 13 | 25% | 36 |
| bvh.micro.Freya 0.3 | 12 | 23% | 29 |
| mz.Cork 0.1 | 9 | 17% | 38 |
| bzdp.Pansy 2.1 | 4 | 8% | 46 |
| bvh.mini.Fenrir 0.39 | 4 | 8% | 17 |
| dl.BetterWalls 1.0 | 4 | 8% | 16 |
| squidM.TentalceMeleeNano 1.1 | 3 | 6% | 4 |
| m3thos.Eva02 0.7.1 | 2 | 4% | 15 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 7 |

## Melee bench: F37

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.8 | 132 / 210 | 2.64 | 18.5% | 34135 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.5% | 132 |
| germ.TheMind .2 | 2.8 | 11.1% | 15 |
| EBBU.Sim2 1.02 | 3.8 | 9.9% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 10.1% | 8 |
| agrach.Dalek 1.0 | 5.5 | 9.3% | 12 |
| stelo.UntouchableNano 1.3 | 5.8 | 9.1% | 10 |
| skm.Ryubot 1.0 | 7.0 | 8.4% | 9 |
| lmk.ACPFinal 0.1 | 7.3 | 8.2% | 7 |
| mb.Beast 0.1 | 8.0 | 8.3% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 6.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.6 | 24 / 35 | 5809 |
| 2 | 1 | 66.7 | 79.4 | 20 / 35 | 5591 |
| 3 | 1 | 66.1 | 77.8 | 20 / 35 | 5706 |
| 4 | 1 | 69.6 | 88.9 | 26 / 35 | 6177 |
| 5 | 1 | 65.6 | 75.9 | 19 / 35 | 5400 |
| 6 | 1 | 67.0 | 81.3 | 23 / 35 | 5452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 38 | 89% |
| stelo.UntouchableNano 1.3 | 21 | 86% |
| EBBU.Sim2 1.02 | 20 | 95% |
| skm.Ryubot 1.0 | 17 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 94% |
| agrach.Dalek 1.0 | 11 | 100% |
| lmk.ACPFinal 0.1 | 11 | 91% |
| mb.Beast 0.1 | 9 | 89% |

Hadur died in 79 of 210 rounds, at a mean tick of 369. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 18% | 34 |
| EBBU.Sim2 1.02 | 14 | 18% | 31 |
| germ.TheMind .2 | 9 | 11% | 34 |
| lmk.ACPFinal 0.1 | 9 | 11% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 11% | 10 |
| agrach.Dalek 1.0 | 8 | 10% | 25 |
| stelo.UntouchableNano 1.3 | 7 | 9% | 20 |
| skm.Ryubot 1.0 | 5 | 6% | 15 |
| mb.Beast 0.1 | 4 | 5% | 20 |

## Melee bench: F38

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 74.3 | 48 / 210 | 3.31 | 15.3% | 25791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 17.1% | 104 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.3% | 48 |
| bvh.mini.Freya 0.55 | 3.3 | 12.5% | 13 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.7% | 23 |
| cs.Wren 1.0 | 5.5 | 10.1% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 10.0% | 13 |
| kdf.KoulDestroyer 1.0 | 6.3 | 8.7% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.2% | 3 |
| bzdp.BoxCar 2.0 | 9.2 | 4.4% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 79.4 | 15 / 35 | 4642 |
| 2 | 2 | 63.4 | 73.7 | 7 / 35 | 4175 |
| 3 | 2 | 61.4 | 70.2 | 6 / 35 | 3766 |
| 4 | 2 | 64.2 | 76.8 | 6 / 35 | 4389 |
| 5 | 2 | 62.3 | 71.1 | 6 / 35 | 4342 |
| 6 | 2 | 63.6 | 74.6 | 8 / 35 | 4477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 53 | 15% |
| bts.mega.Gnarly 1.4 | 18 | 50% |
| bvh.mini.Freya 0.55 | 15 | 87% |
| cs.Wren 1.0 | 14 | 86% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 63% |
| kdf.KoulDestroyer 1.0 | 2 | 50% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 163 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 82 | 50% | 90 |
| bts.mega.Gnarly 1.4 | 19 | 12% | 28 |
| bvh.mini.Freya 0.55 | 18 | 11% | 23 |
| cs.Wren 1.0 | 12 | 7% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 6% | 20 |
| kdf.KoulDestroyer 1.0 | 8 | 5% | 10 |
| bzdp.BoxCar 2.0 | 7 | 4% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 2% | 6 |
| matt.UnderDark3 2.4.34 | 4 | 2% | 4 |

## Melee bench: F39

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 75.0 | 56 / 210 | 3.25 | 16.2% | 30482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.2% | 56 |
| bvh.fry.Freya 0.82 | 2.0 | 15.1% | 39 |
| az.Ololobot 0.2.4 | 2.8 | 13.1% | 70 |
| catcat20.Lambda 0.024 | 4.0 | 10.8% | 26 |
| gimp.GimpBot 0.1 | 5.8 | 8.7% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.7% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.0% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.9% | 15 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 77.8 | 12 / 35 | 5558 |
| 2 | 1 | 65.3 | 76.8 | 14 / 35 | 5143 |
| 3 | 1 | 64.8 | 78.4 | 9 / 35 | 4898 |
| 4 | 1 | 64.9 | 78.7 | 7 / 35 | 4960 |
| 5 | 1 | 65.1 | 75.9 | 11 / 35 | 5457 |
| 6 | 3 | 59.0 | 62.5 | 3 / 35 | 4466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 41 | 54% |
| az.Ololobot 0.2.4 | 35 | 14% |
| catcat20.Lambda 0.024 | 24 | 46% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 90% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 51 | 33% | 57 |
| bvh.fry.Freya 0.82 | 47 | 30% | 64 |
| catcat20.Lambda 0.024 | 22 | 14% | 33 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 8% | 20 |
| apollokidd.ApolloKidd 0.9 | 8 | 5% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7 | 4% | 8 |
| gimp.GimpBot 0.1 | 4 | 3% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 3 |
| winamp32.micro.MicroMacro 1.0 | 2 | 1% | 7 |

## Melee bench: F40

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.1 | 117 / 210 | 2.70 | 18.1% | 28783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 117 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 51 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 11.9% | 14 |
| mz.AntiGrav 1.0 | 4.5 | 10.4% | 6 |
| Polkwane.SmashMelee 1.0 | 5.3 | 9.8% | 5 |
| stelo.Randomness 1.0 | 6.0 | 9.4% | 13 |
| alpha.BlackIce 1.0 | 6.3 | 8.8% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.8% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 6.0% | 0 |
| sample.Corners 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 78.7 | 18 / 35 | 4342 |
| 2 | 1 | 68.9 | 86.3 | 22 / 35 | 5057 |
| 3 | 1 | 67.8 | 81.9 | 22 / 35 | 4720 |
| 4 | 1 | 67.6 | 80.3 | 18 / 35 | 5064 |
| 5 | 1 | 66.3 | 77.1 | 16 / 35 | 4872 |
| 6 | 1 | 67.4 | 82.2 | 21 / 35 | 4728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 65 | 57% |
| kano.gamma.KanoGamma 1.8 | 34 | 79% |
| mz.AntiGrav 1.0 | 19 | 100% |
| stelo.Randomness 1.0 | 12 | 92% |
| Polkwane.SmashMelee 1.0 | 11 | 100% |
| alpha.BlackIce 1.0 | 5 | 80% |
| sample.Corners 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 43 | 46% | 72 |
| kano.gamma.KanoGamma 1.8 | 15 | 16% | 47 |
| alpha.BlackIce 1.0 | 10 | 11% | 13 |
| stelo.Randomness 1.0 | 6 | 6% | 26 |
| Polkwane.SmashMelee 1.0 | 6 | 6% | 14 |
| mz.AntiGrav 1.0 | 5 | 5% | 20 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 7 |
| sample.Corners 1.0 | 3 | 3% | 5 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F41

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 73.0 | 83 / 210 | 3.43 | 15.9% | 26405 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 16.0% | 82 |
| hadur117.micro.Saor 0.2 | 1.7 | 15.9% | 83 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.6% | 15 |
| ary.Swarm 1.1 | 3.7 | 12.7% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.7% | 13 |
| shrub.Silver v048 | 6.0 | 9.3% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.7% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 69.5 | 11 / 35 | 4296 |
| 2 | 2 | 62.6 | 67.3 | 7 / 35 | 4413 |
| 3 | 1 | 67.7 | 82.9 | 22 / 35 | 4366 |
| 4 | 2 | 62.7 | 68.9 | 9 / 35 | 4239 |
| 5 | 2 | 64.4 | 70.8 | 15 / 35 | 4553 |
| 6 | 1 | 66.2 | 78.4 | 19 / 35 | 4538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 50 | 22% |
| lessonz.robocode.Oz 0.5.0 | 33 | 88% |
| ary.Swarm 1.1 | 20 | 95% |
| simonton.nano.MeleeSeed 1.8 | 18 | 94% |
| shrub.Silver v048 | 3 | 67% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 59 | 46% | 77 |
| simonton.nano.MeleeSeed 1.8 | 23 | 18% | 39 |
| ary.Swarm 1.1 | 16 | 13% | 35 |
| lessonz.robocode.Oz 0.5.0 | 15 | 12% | 29 |
| zyx.nano.Ant 1.1 | 5 | 4% | 9 |
| shrub.Silver v048 | 4 | 3% | 10 |
| acogdev.alpha 0.2 | 3 | 2% | 3 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 79.2 | 49 / 210 | 2.88 | 16.8% | 31361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 17.2% | 92 |
| hadur117.micro.Saor 0.2 | 1.8 | 16.8% | 49 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.0% | 28 |
| ara.Shera 0.88 | 3.5 | 12.9% | 31 |
| amz.NanoClone 1.41 | 5.2 | 9.2% | 2 |
| maribo.IotaCT 1.1 | 5.8 | 8.2% | 1 |
| dsw.StaticD 1.0 | 7.0 | 7.5% | 7 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.5% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 78.1 | 8 / 35 | 5149 |
| 2 | 2 | 65.5 | 80.3 | 6 / 35 | 4911 |
| 3 | 2 | 64.9 | 76.2 | 7 / 35 | 5195 |
| 4 | 2 | 66.9 | 80.3 | 9 / 35 | 5473 |
| 5 | 2 | 65.3 | 76.8 | 7 / 35 | 5376 |
| 6 | 1 | 67.6 | 83.2 | 12 / 35 | 5257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 52 | 25% |
| ara.Shera 0.88 | 33 | 45% |
| maribo.mini.MiniQuester 0.1 | 24 | 63% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |
| maribo.IotaCT 1.1 | 1 | 0% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 90 | 56% | 106 |
| ara.Shera 0.88 | 37 | 23% | 52 |
| maribo.mini.MiniQuester 0.1 | 17 | 11% | 31 |
| amz.NanoClone 1.41 | 8 | 5% | 8 |
| maribo.IotaCT 1.1 | 3 | 2% | 4 |
| dsw.StaticD 1.0 | 2 | 1% | 4 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 68.8 | 21 / 210 | 3.80 | 13.6% | 21979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 165 |
| hadur117.micro.Saor 0.2 | 2.0 | 13.6% | 21 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.1% | 13 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.7% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 10.7% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 3 |
| jab.DiamondStealer 5 | 7.2 | 8.3% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.8% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 68.6 | 3 / 35 | 3405 |
| 2 | 2 | 63.3 | 73.0 | 4 / 35 | 3750 |
| 3 | 2 | 61.7 | 69.8 | 4 / 35 | 3678 |
| 4 | 2 | 59.5 | 63.5 | 2 / 35 | 3506 |
| 5 | 2 | 61.1 | 65.1 | 2 / 35 | 3684 |
| 6 | 2 | 63.4 | 73.0 | 6 / 35 | 3956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 52 | 0% |
| brainfade.melee.Dusk 0.44 | 9 | 67% |
| dummy.micro.Sparrow 2.5 | 8 | 88% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| Krabb.akim2.Akim2 1.1b | 3 | 67% |
| mz.NanoGod 2.02 | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 116 | 61% | 118 |
| brainfade.melee.Dusk 0.44 | 25 | 13% | 28 |
| wcsv.melee.EngineerMelee 0.1 | 20 | 11% | 23 |
| dummy.micro.Sparrow 2.5 | 14 | 7% | 21 |
| mz.NanoGod 2.02 | 4 | 2% | 7 |
| jab.DiamondStealer 5 | 4 | 2% | 5 |
| cvt.Firsty 1.0 | 3 | 2% | 5 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.0 | 93 / 210 | 2.44 | 18.7% | 33984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.7% | 93 |
| stelo.Liblix 0.3.1 | 1.8 | 15.9% | 80 |
| tzu.TheArtOfWar 1.2 | 3.0 | 12.4% | 24 |
| wompi.Quokka 1.6 | 4.0 | 10.7% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.5% | 3 |
| jwirde.Gort 2.0 | 5.7 | 8.9% | 5 |
| disan.Chair 2.2.0 | 7.2 | 7.5% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.9% | 1 |
| sample.Crazy 1.0 | 9.5 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 82.9 | 18 / 35 | 5955 |
| 2 | 1 | 67.5 | 81.9 | 12 / 35 | 5553 |
| 3 | 1 | 67.6 | 82.5 | 15 / 35 | 5394 |
| 4 | 1 | 68.3 | 84.8 | 15 / 35 | 5653 |
| 5 | 2 | 67.1 | 80.3 | 13 / 35 | 5211 |
| 6 | 1 | 71.1 | 91.7 | 20 / 35 | 6218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 41% |
| tzu.TheArtOfWar 1.2 | 39 | 77% |
| wompi.Quokka 1.6 | 13 | 85% |
| disan.Chair 2.2.0 | 9 | 89% |
| jwirde.Gort 2.0 | 7 | 71% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 0% |

Hadur died in 118 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 68 | 58% | 106 |
| tzu.TheArtOfWar 1.2 | 20 | 17% | 48 |
| wompi.Quokka 1.6 | 11 | 9% | 19 |
| jwirde.Gort 2.0 | 8 | 7% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 3% | 7 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 5 |
| disan.Chair 2.2.0 | 2 | 2% | 6 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 4 |

## Melee bench: F45

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.4 | 84 / 210 | 2.31 | 19.3% | 34477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.3% | 84 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.7% | 106 |
| jje.BagPuss 1.2 | 3.3 | 11.5% | 6 |
| myl.nano.Graviton 1.10 | 4.5 | 10.0% | 2 |
| sul.Lunar 1.1 | 4.7 | 9.9% | 7 |
| hvilela.HVilela 0.9 | 5.8 | 9.0% | 0 |
| fm.claire 1.7 | 6.8 | 8.7% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.8 | 7.7% | 2 |
| wit.Deep7 2.0 | 9.0 | 5.8% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.7 | 13 / 35 | 5874 |
| 2 | 1 | 67.8 | 80.6 | 9 / 35 | 5952 |
| 3 | 1 | 69.3 | 86.3 | 17 / 35 | 5626 |
| 4 | 1 | 68.0 | 83.5 | 14 / 35 | 5435 |
| 5 | 1 | 69.8 | 88.9 | 16 / 35 | 5779 |
| 6 | 1 | 69.0 | 86.7 | 15 / 35 | 5811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 108 | 27% |
| sul.Lunar 1.1 | 17 | 94% |
| jje.BagPuss 1.2 | 12 | 92% |
| myl.nano.Graviton 1.10 | 10 | 90% |
| wit.Deep7 2.0 | 8 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 100% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 2145. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 84 | 67% | 0 |
| jje.BagPuss 1.2 | 12 | 10% | 56 |
| hvilela.HVilela 0.9 | 8 | 6% | 19 |
| myl.nano.Graviton 1.10 | 6 | 5% | 32 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 25 |
| sul.Lunar 1.1 | 4 | 3% | 40 |
| fm.claire 1.7 | 3 | 2% | 14 |
| wit.Deep7 2.0 | 2 | 2% | 13 |
| abud.ThirdRobo 1.0 | 1 | 1% | 6 |

## Melee bench: F46

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 66.2 | 21 / 210 | 4.04 | 13.9% | 26390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.1% | 64 |
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.2% | 104 |
| hadur117.micro.Saor 0.2 | 3.0 | 13.9% | 21 |
| mz.MicroSheep 1.0 | 4.2 | 10.7% | 6 |
| cx.Princess 1.0 | 4.8 | 10.2% | 14 |
| sadoner.killer 0.2 | 6.0 | 9.2% | 0 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.8% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 67.0 | 5 / 35 | 4222 |
| 2 | 3 | 59.2 | 59.4 | 3 / 35 | 4212 |
| 3 | 3 | 62.4 | 67.9 | 5 / 35 | 4541 |
| 4 | 3 | 63.0 | 72.7 | 3 / 35 | 4604 |
| 5 | 3 | 61.4 | 65.7 | 2 / 35 | 4441 |
| 6 | 3 | 61.2 | 64.8 | 3 / 35 | 4370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 32 | 31% |
| rsalesc.melee.Medina 0.4.5 | 22 | 9% |
| mz.MicroSheep 1.0 | 5 | 40% |
| cx.Princess 1.0 | 5 | 80% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 72 | 38% | 85 |
| rsalesc.melee.Medina 0.4.5 | 65 | 34% | 67 |
| cx.Princess 1.0 | 19 | 10% | 20 |
| sadoner.killer 0.2 | 14 | 7% | 16 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 9 |
| mz.MicroSheep 1.0 | 6 | 3% | 7 |
| kurios.DOSexe .9a | 3 | 2% | 3 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

