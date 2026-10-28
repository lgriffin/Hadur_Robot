# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.9 | 28 / 210 | 2.72 | 15.7% | 27067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 144 |
| hadur117.mini.DeiseD 0.2 | 2.0 | 15.7% | 28 |
| sgp.JollyNinja 3.53 | 3.3 | 12.0% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.9% | 4 |
| mz.MicroGodMelee 1 | 4.8 | 10.7% | 9 |
| lorneswork.Predator 1.0 | 5.8 | 9.5% | 3 |
| adt.Ar2 1.0 | 7.2 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 7.8 | 5.7% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 82.9 | 2 / 35 | 4191 |
| 2 | 2 | 63.5 | 79.7 | 4 / 35 | 4047 |
| 3 | 2 | 66.3 | 83.8 | 5 / 35 | 5105 |
| 4 | 2 | 65.5 | 81.3 | 8 / 35 | 4732 |
| 5 | 2 | 64.3 | 80.0 | 5 / 35 | 4256 |
| 6 | 2 | 64.1 | 77.8 | 4 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 94 | 9% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 78% |
| sgp.JollyNinja 3.53 | 9 | 67% |
| mz.MicroGodMelee 1 | 5 | 40% |
| lorneswork.Predator 1.0 | 3 | 67% |
| adt.Ar2 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |

Hadur died in 182 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 113 | 62% | 121 |
| sgp.JollyNinja 3.53 | 26 | 14% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 9% | 20 |
| mz.MicroGodMelee 1 | 14 | 8% | 18 |
| lorneswork.Predator 1.0 | 6 | 3% | 7 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 2% | 5 |
| adt.Ar2 1.0 | 3 | 2% | 4 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 79.0 | 70 / 210 | 2.89 | 16.9% | 29784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 16.9% | 70 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.1% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 12.8% | 28 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.2 | 10.3% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.5% | 3 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.2% | 3 |
| Noran.BitchingElk 0.054 | 7.3 | 7.7% | 11 |
| sch.Simone 0.3d | 7.8 | 7.4% | 12 |
| stelo.PatternRobot 1.0 | 8.3 | 7.1% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 80.0 | 10 / 35 | 4772 |
| 2 | 1 | 66.3 | 81.3 | 14 / 35 | 5043 |
| 3 | 1 | 66.6 | 79.4 | 14 / 35 | 5399 |
| 4 | 1 | 67.7 | 85.1 | 14 / 35 | 5425 |
| 5 | 1 | 63.5 | 74.0 | 11 / 35 | 4698 |
| 6 | 1 | 63.2 | 74.3 | 7 / 35 | 4447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 37 | 35% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 70% |
| Noran.BitchingElk 0.054 | 12 | 58% |
| stelo.PatternRobot 1.0 | 12 | 83% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 55% |
| sch.Simone 0.3d | 9 | 44% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 35 | 25% | 62 |
| pulsar.PulsarMax 0.8.9 | 34 | 24% | 42 |
| stelo.PatternRobot 1.0 | 19 | 13% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 11% | 21 |
| sch.Simone 0.3d | 11 | 8% | 18 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 7% | 18 |
| Noran.BitchingElk 0.054 | 10 | 7% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6 | 4% | 10 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.8 | 121 / 210 | 2.19 | 18.6% | 33959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.6% | 121 |
| radnor.DoctorBob 1.42 | 2.5 | 14.3% | 29 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.9% | 33 |
| vuen.Cake 2.51 | 3.7 | 12.1% | 24 |
| urdos.URDOS 1.3 | 5.2 | 9.4% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.5% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 6.7 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.7% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.0 | 20 / 35 | 5345 |
| 2 | 1 | 65.8 | 78.7 | 17 / 35 | 5454 |
| 3 | 1 | 69.3 | 91.1 | 21 / 35 | 5655 |
| 4 | 1 | 68.7 | 86.3 | 19 / 35 | 5991 |
| 5 | 1 | 69.5 | 91.7 | 24 / 35 | 5726 |
| 6 | 1 | 68.5 | 85.7 | 20 / 35 | 5788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 50 | 80% |
| vuen.Cake 2.51 | 43 | 81% |
| radnor.DoctorBob 1.42 | 43 | 81% |
| urdos.URDOS 1.3 | 5 | 80% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 35 | 39% | 74 |
| radnor.DoctorBob 1.42 | 27 | 30% | 65 |
| vuen.Cake 2.51 | 14 | 16% | 49 |
| urdos.URDOS 1.3 | 6 | 7% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 3% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 2% | 4 |
| adt.Ar1 2.1 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 74.2 | 7 / 210 | 3.32 | 15.0% | 31008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 191 |
| hadur117.mini.DeiseD 0.2 | 2.2 | 15.0% | 7 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.9% | 3 |
| TNT.TNT 0.99.1 | 3.8 | 11.3% | 7 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 7.0% | 0 |
| css.Delitioner 0.11 | 6.8 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.0% | 1 |
| spin.Bugstard 0.012b | 9.7 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 75.9 | 1 / 35 | 4954 |
| 2 | 2 | 62.3 | 68.6 | 2 / 35 | 4650 |
| 3 | 3 | 63.3 | 68.6 | 0 / 35 | 5275 |
| 4 | 2 | 67.1 | 81.3 | 3 / 35 | 5569 |
| 5 | 2 | 65.9 | 77.5 | 1 / 35 | 5628 |
| 6 | 2 | 63.8 | 73.3 | 0 / 35 | 4932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 67 | 7% |
| TNT.TNT 0.99.1 | 3 | 33% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 166 | 82% | 171 |
| apc.LeeroyJenkins2 1.0 | 14 | 7% | 14 |
| TNT.TNT 0.99.1 | 6 | 3% | 7 |
| josago.Jorgito 0.16 | 5 | 2% | 5 |
| tj.zombie1n 1.0.1 | 5 | 2% | 5 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 2 |
| spin.Bugstard 0.012b | 1 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 67.0 | 15 / 210 | 3.97 | 12.6% | 20148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.9% | 117 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 56 |
| wompi.Numbat 2.1 | 3.3 | 12.8% | 13 |
| hadur117.mini.DeiseD 0.2 | 3.7 | 12.6% | 15 |
| axeBots.HataMoto 3.09 | 5.3 | 9.5% | 8 |
| ms.Ares 0.19 | 5.7 | 9.1% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.7% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.5 | 66.3 | 5 / 35 | 3480 |
| 2 | 3 | 60.3 | 70.8 | 3 / 35 | 3385 |
| 3 | 3 | 60.4 | 68.6 | 2 / 35 | 3578 |
| 4 | 4 | 58.7 | 65.4 | 1 / 35 | 3496 |
| 5 | 4 | 58.5 | 66.0 | 3 / 35 | 2937 |
| 6 | 4 | 58.6 | 64.8 | 1 / 35 | 3272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 25 | 4% |
| justin.DemonicRage 3.4 | 17 | 47% |
| wompi.Numbat 2.1 | 4 | 75% |
| ms.Ares 0.19 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 84 | 43% | 87 |
| justin.DemonicRage 3.4 | 51 | 26% | 58 |
| wompi.Numbat 2.1 | 32 | 16% | 36 |
| axeBots.HataMoto 3.09 | 10 | 5% | 10 |
| ms.Ares 0.19 | 5 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 5 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.4 | 121 / 210 | 1.95 | 18.8% | 27833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.8% | 121 |
| jekl.StoneGhost 0.7 | 2.0 | 14.4% | 19 |
| origin.SleepSiphon 1.7b | 3.0 | 12.9% | 33 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.5 | 11.0% | 22 |
| mld.Wisdom 1.0 | 4.5 | 11.0% | 5 |
| gg.Wolverine 2.0 | 6.0 | 9.0% | 8 |
| spinnercat.Omen 1.0 | 7.7 | 6.9% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.5% | 2 |
| DBall.NUKE 0.1 | 8.5 | 6.4% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.3 | 19 / 35 | 4438 |
| 2 | 1 | 66.3 | 84.8 | 14 / 35 | 4363 |
| 3 | 1 | 70.0 | 91.7 | 22 / 35 | 5188 |
| 4 | 1 | 69.0 | 92.1 | 21 / 35 | 4436 |
| 5 | 1 | 69.3 | 90.5 | 22 / 35 | 4735 |
| 6 | 1 | 69.1 | 90.2 | 23 / 35 | 4673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 56 | 86% |
| origin.SleepSiphon 1.7b | 37 | 68% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 70% |
| gg.Wolverine 2.0 | 15 | 60% |
| mld.Wisdom 1.0 | 12 | 83% |
| spinnercat.Omen 1.0 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 27 | 30% | 63 |
| origin.SleepSiphon 1.7b | 26 | 29% | 58 |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 21% | 42 |
| mld.Wisdom 1.0 | 8 | 9% | 25 |
| gg.Wolverine 2.0 | 8 | 9% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 4 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.3 | 73 / 210 | 2.50 | 17.5% | 32461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.7 | 17.5% | 73 |
| rsalesc.melee.Monk 0.3.6c | 1.7 | 18.2% | 65 |
| rtk.Tachikoma 1.0 | 2.7 | 16.4% | 45 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.5% | 14 |
| franzor.Lizt 1.3.1 | 4.8 | 11.0% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 83.5 | 11 / 35 | 5385 |
| 2 | 2 | 66.4 | 78.4 | 10 / 35 | 5103 |
| 3 | 1 | 69.3 | 84.8 | 15 / 35 | 5560 |
| 4 | 1 | 69.5 | 85.1 | 15 / 35 | 5877 |
| 5 | 2 | 69.1 | 87.3 | 11 / 35 | 5636 |
| 6 | 2 | 66.8 | 80.6 | 11 / 35 | 4900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 56 | 66% |
| rsalesc.melee.Monk 0.3.6c | 26 | 19% |
| oog.melee.CapuletDroid 1.1 | 22 | 95% |
| franzor.Lizt 1.3.1 | 12 | 58% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 67 | 49% | 83 |
| rtk.Tachikoma 1.0 | 44 | 32% | 82 |
| oog.melee.CapuletDroid 1.1 | 17 | 12% | 33 |
| franzor.Lizt 1.3.1 | 6 | 4% | 4 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.6 | 118 / 210 | 2.21 | 19.0% | 31867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.0% | 118 |
| tm.Yuugao 1.0 | 2.5 | 13.1% | 33 |
| shrub.Vapour v159 | 2.5 | 12.5% | 27 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.4% | 8 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.4% | 9 |
| m3thos.Eva00 1.1 | 5.7 | 9.3% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.5% | 7 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 6.8% | 4 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.6% | 0 |
| SHAM.WOW 1.4 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.6 | 18 / 35 | 5554 |
| 2 | 1 | 70.3 | 92.4 | 25 / 35 | 5704 |
| 3 | 1 | 67.3 | 84.1 | 22 / 35 | 4712 |
| 4 | 1 | 69.2 | 89.2 | 20 / 35 | 5433 |
| 5 | 1 | 68.1 | 84.1 | 16 / 35 | 5493 |
| 6 | 1 | 66.9 | 81.9 | 17 / 35 | 4971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 50 | 72% |
| shrub.Vapour v159 | 31 | 74% |
| Krabb.sliNk.Garm 0.9u | 26 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 20 | 90% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 67% |
| m3thos.Eva00 1.1 | 6 | 83% |
| SHAM.WOW 1.4 | 1 | 0% |

Hadur died in 94 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 30 | 32% | 72 |
| shrub.Vapour v159 | 27 | 29% | 47 |
| Krabb.sliNk.Garm 0.9u | 10 | 11% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 7% | 21 |
| m3thos.Eva00 1.1 | 7 | 7% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 5% | 13 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 6 |
| SHAM.WOW 1.4 | 2 | 2% | 5 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 75.6 | 49 / 210 | 3.20 | 15.1% | 22637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 100 |
| hadur117.mini.DeiseD 0.2 | 2.2 | 15.1% | 49 |
| kc.micro.Figment 1.0 | 2.8 | 13.7% | 31 |
| yagami.Tidus 0.11 | 4.5 | 10.8% | 5 |
| pedersen.Grishnakh 1.0 | 5.2 | 9.9% | 8 |
| mc2.enemy.Original 0.9 | 5.3 | 9.7% | 16 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.7 | 5.3% | 0 |
| step.nanoPri 1.0 | 8.7 | 5.6% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 71.7 | 7 / 35 | 3571 |
| 2 | 2 | 64.3 | 78.1 | 9 / 35 | 4103 |
| 3 | 2 | 64.1 | 77.8 | 12 / 35 | 3947 |
| 4 | 3 | 60.9 | 69.5 | 5 / 35 | 3549 |
| 5 | 2 | 62.2 | 74.0 | 5 / 35 | 3660 |
| 6 | 2 | 65.1 | 82.2 | 11 / 35 | 3807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 44 | 32% |
| kc.micro.Figment 1.0 | 24 | 75% |
| yagami.Tidus 0.11 | 11 | 82% |
| mc2.enemy.Original 0.9 | 5 | 60% |
| pedersen.Grishnakh 1.0 | 5 | 60% |
| dft.Calliope 5.6 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 76 | 47% | 89 |
| kc.micro.Figment 1.0 | 27 | 17% | 47 |
| yagami.Tidus 0.11 | 17 | 11% | 25 |
| mc2.enemy.Original 0.9 | 17 | 11% | 21 |
| pedersen.Grishnakh 1.0 | 11 | 7% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| rdm.Dueler 0.4x | 4 | 2% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 4 |
| dft.Calliope 5.6 | 1 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 94.1 | 151 / 210 | 1.53 | 19.8% | 31477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.8% | 151 |
| DTF.Kludgy 1.2b | 2.2 | 14.0% | 30 |
| ne.Chimera 1.2 | 3.3 | 12.5% | 10 |
| ejb.Polaris 1.0.1 | 3.7 | 11.9% | 9 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.6% | 6 |
| vStar.RAFzilla 2.15 | 5.5 | 10.2% | 4 |
| sam.Samspin 1.0 | 7.7 | 5.9% | 0 |
| kurios.DOSexe .9b | 7.8 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 98.1 | 30 / 35 | 5255 |
| 2 | 1 | 70.2 | 94.0 | 25 / 35 | 5392 |
| 3 | 1 | 70.6 | 94.0 | 29 / 35 | 5275 |
| 4 | 1 | 69.3 | 93.0 | 22 / 35 | 4966 |
| 5 | 1 | 68.9 | 92.1 | 24 / 35 | 4906 |
| 6 | 1 | 70.2 | 93.3 | 21 / 35 | 5683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 71% |
| ejb.Polaris 1.0.1 | 43 | 86% |
| ne.Chimera 1.2 | 33 | 79% |
| vStar.RAFzilla 2.15 | 22 | 86% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 30 | 50% | 65 |
| ne.Chimera 1.2 | 13 | 22% | 37 |
| ejb.Polaris 1.0.1 | 6 | 10% | 48 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 21 |
| vStar.RAFzilla 2.15 | 3 | 5% | 20 |
| sam.Samspin 1.0 | 2 | 3% | 6 |
| donjezza.Muncho 1.0 | 1 | 2% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 7 |

## Melee bench: F11

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.4 | 76 / 210 | 2.86 | 16.3% | 24988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 17.1% | 79 |
| hadur117.mini.DeiseD 0.2 | 1.5 | 16.3% | 76 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.2% | 13 |
| djc.DynaBot 0.1.1 | 3.8 | 10.5% | 11 |
| br2.MobyDickBot 1.6 | 5.3 | 9.2% | 11 |
| rdt199.Warlord 0.73 | 6.2 | 8.6% | 9 |
| uji.YellohFellah 1.0 | 6.5 | 7.9% | 9 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.1% | 2 |
| stelo.MirrorNano 1.3 | 9.5 | 5.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 71.1 | 9 / 35 | 3673 |
| 2 | 1 | 65.7 | 81.9 | 13 / 35 | 4318 |
| 3 | 1 | 66.1 | 82.9 | 13 / 35 | 4576 |
| 4 | 2 | 64.0 | 76.5 | 12 / 35 | 4280 |
| 5 | 2 | 64.6 | 79.4 | 13 / 35 | 4049 |
| 6 | 1 | 66.3 | 84.4 | 16 / 35 | 4092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 56 | 45% |
| cx.mini.Nimrod 0.55 | 21 | 95% |
| djc.DynaBot 0.1.1 | 13 | 77% |
| br2.MobyDickBot 1.6 | 11 | 73% |
| rdt199.Warlord 0.73 | 10 | 80% |
| uji.YellohFellah 1.0 | 6 | 50% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 63 | 47% | 89 |
| cx.mini.Nimrod 0.55 | 29 | 22% | 43 |
| rdt199.Warlord 0.73 | 11 | 8% | 16 |
| br2.MobyDickBot 1.6 | 9 | 7% | 19 |
| djc.DynaBot 0.1.1 | 7 | 5% | 19 |
| uji.YellohFellah 1.0 | 6 | 4% | 13 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 3% | 5 |

## Melee bench: F12

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.3 | 89 / 210 | 2.60 | 16.7% | 22799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 16.7% | 89 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.8% | 40 |
| nat.PallasHawk 1.0 | 3.2 | 12.8% | 29 |
| darkcanuck.Leon 1.01 | 3.3 | 13.1% | 27 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.7% | 21 |
| jrm.Test0 1.0 | 6.8 | 7.6% | 2 |
| jp.Perpy 16.0 | 7.7 | 7.0% | 1 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.9% | 2 |
| stuff.Vlad 0.1 | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 86.0 | 18 / 35 | 3521 |
| 2 | 1 | 64.9 | 78.7 | 16 / 35 | 3868 |
| 3 | 1 | 66.0 | 83.5 | 13 / 35 | 4140 |
| 4 | 2 | 63.3 | 78.4 | 11 / 35 | 3523 |
| 5 | 1 | 66.0 | 85.7 | 15 / 35 | 3915 |
| 6 | 1 | 65.6 | 81.3 | 16 / 35 | 3832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 38 | 68% |
| darkcanuck.Leon 1.01 | 32 | 69% |
| bts.wiki.RipCurl 0.9b | 27 | 67% |
| brainfade.melee.Genghis 0.36 | 16 | 81% |
| jaybot.bots.Oddball 4.0 | 5 | 60% |
| jrm.Test0 1.0 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 39 | 32% | 58 |
| darkcanuck.Leon 1.01 | 31 | 26% | 51 |
| nat.PallasHawk 1.0 | 27 | 22% | 59 |
| brainfade.melee.Genghis 0.36 | 14 | 12% | 24 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 6 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 5 |
| jrm.Test0 1.0 | 2 | 2% | 5 |
| jp.Perpy 16.0 | 2 | 2% | 2 |

## Melee bench: F13

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 72.6 | 25 / 210 | 3.46 | 13.8% | 23108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 17.6% | 64 |
| mn.Combat 3.25.0 | 1.7 | 16.7% | 90 |
| hadur117.mini.DeiseD 0.2 | 3.0 | 13.8% | 25 |
| shinh.Entangled 0.3 | 4.3 | 12.6% | 22 |
| gh.micro.Gruweltje 0.7 | 4.7 | 12.2% | 8 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 1 |
| stelo.Wang 1.0 | 7.2 | 6.4% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 75.9 | 8 / 35 | 3818 |
| 2 | 3 | 62.3 | 71.7 | 5 / 35 | 3987 |
| 3 | 3 | 61.2 | 71.1 | 2 / 35 | 3829 |
| 4 | 3 | 61.5 | 73.0 | 2 / 35 | 3603 |
| 5 | 3 | 61.4 | 71.1 | 4 / 35 | 3884 |
| 6 | 3 | 62.3 | 73.0 | 4 / 35 | 3987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 26 | 35% |
| ags.Glacier 0.2.11 | 21 | 52% |
| shinh.Entangled 0.3 | 8 | 50% |
| gh.micro.Gruweltje 0.7 | 2 | 50% |

Hadur died in 185 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 86 | 46% | 97 |
| mn.Combat 3.25.0 | 47 | 25% | 55 |
| shinh.Entangled 0.3 | 30 | 16% | 35 |
| gh.micro.Gruweltje 0.7 | 10 | 5% | 11 |
| stelo.Wang 1.0 | 9 | 5% | 9 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
| maribo.FollowFire 1 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.6 | 142 / 210 | 1.76 | 19.4% | 30264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.4% | 142 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.8% | 29 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 27 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.6% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.3% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.4% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.4% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.7% | 8 |
| pa.Improved 1.0 | 9.0 | 5.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.4 | 24 / 35 | 5097 |
| 2 | 1 | 70.2 | 92.4 | 25 / 35 | 5328 |
| 3 | 1 | 68.8 | 90.5 | 22 / 35 | 4602 |
| 4 | 1 | 71.2 | 94.0 | 28 / 35 | 5347 |
| 5 | 1 | 69.6 | 91.4 | 22 / 35 | 5103 |
| 6 | 1 | 68.5 | 89.8 | 21 / 35 | 4787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 94 | 88% |
| catcat20.shape.Theta 0.018 | 37 | 70% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 44% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 51% | 112 |
| catcat20.shape.Theta 0.018 | 21 | 30% | 50 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 10% | 12 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 4% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 1% | 3 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.7 | 82 / 210 | 2.74 | 17.4% | 31361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.4% | 82 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.1% | 31 |
| emp.Yngwie 1.11 | 3.2 | 13.2% | 57 |
| mld.DustBunny 3.8 | 3.5 | 12.5% | 18 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.6% | 7 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.4% | 12 |
| Grystrion.TrackerWO 1.0 | 7.0 | 7.2% | 1 |
| lambdaxy.TBot 0.1 | 7.8 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.8% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.4 | 15 / 35 | 5569 |
| 2 | 1 | 68.1 | 85.4 | 15 / 35 | 5286 |
| 3 | 1 | 67.2 | 83.5 | 16 / 35 | 5156 |
| 4 | 1 | 66.5 | 81.0 | 14 / 35 | 5089 |
| 5 | 1 | 66.5 | 79.4 | 12 / 35 | 5363 |
| 6 | 1 | 64.7 | 75.6 | 10 / 35 | 4898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 36 | 42% |
| kawigi.micro.Shiz 1.1 | 29 | 83% |
| kawigi.robot.Girl 1.2 | 18 | 89% |
| mld.DustBunny 3.8 | 17 | 59% |
| cb.nano.Insomnia 1.0 | 10 | 100% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 44 | 34% | 64 |
| mld.DustBunny 3.8 | 25 | 20% | 39 |
| kawigi.micro.Shiz 1.1 | 21 | 16% | 44 |
| cb.nano.Insomnia 1.0 | 19 | 15% | 21 |
| kawigi.robot.Girl 1.2 | 10 | 8% | 24 |
| divineomega.TrialBot 0.003 | 4 | 3% | 11 |
| Grystrion.TrackerWO 1.0 | 3 | 2% | 4 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.3 | 94 / 210 | 2.32 | 18.5% | 32231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 18.5% | 94 |
| gh.Griezel 0.5.2 | 1.8 | 16.8% | 68 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.1% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.2% | 25 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.0% | 6 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.1% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.5% | 4 |
| asd.Cthulhu 1.3 | 8.8 | 5.1% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 5.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 82.5 | 12 / 35 | 5471 |
| 2 | 1 | 69.7 | 89.5 | 20 / 35 | 5407 |
| 3 | 1 | 70.0 | 91.1 | 19 / 35 | 5706 |
| 4 | 1 | 67.4 | 82.2 | 14 / 35 | 5169 |
| 5 | 2 | 66.9 | 81.3 | 12 / 35 | 5040 |
| 6 | 1 | 68.3 | 85.1 | 17 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 86 | 47% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 95% |
| techdude.forest.FlamingForest 1.1 | 18 | 67% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| tvv.nano.Polaris 1.2 | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 50% |
| asd.Cthulhu 1.3 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1220. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 56 | 48% | 98 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 12% | 30 |
| bvh.fnr.Fenrir 0.36l | 13 | 11% | 15 |
| techdude.forest.FlamingForest 1.1 | 11 | 9% | 20 |
| asd.Cthulhu 1.3 | 7 | 6% | 10 |
| divineomega.DivineBot 1.9.4.5 | 6 | 5% | 14 |
| stelo.IntrinsicVolatility 1.4 | 5 | 4% | 10 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 12 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.1 | 108 / 210 | 2.16 | 18.4% | 29233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.4% | 108 |
| et.Predator 1.8 | 2.3 | 13.9% | 29 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.7% | 26 |
| cx.BlestPain 1.41 | 3.5 | 11.9% | 30 |
| nic.Nicator 2.4 | 5.5 | 10.6% | 10 |
| ahf.NanoAndrew .4 | 5.5 | 10.5% | 7 |
| maribo.melee.BMV 0.1 | 7.2 | 8.0% | 0 |
| tex.Longbot 0.4 | 8.2 | 6.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 17 / 35 | 4803 |
| 2 | 1 | 67.8 | 84.1 | 17 / 35 | 4875 |
| 3 | 1 | 68.9 | 89.2 | 21 / 35 | 4932 |
| 4 | 1 | 66.8 | 83.5 | 15 / 35 | 4533 |
| 5 | 1 | 68.2 | 86.3 | 17 / 35 | 4883 |
| 6 | 1 | 69.9 | 90.8 | 21 / 35 | 5207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 46 | 67% |
| cx.BlestPain 1.41 | 34 | 62% |
| oog.melee.Mercutio 1.0 | 34 | 79% |
| nic.Nicator 2.4 | 22 | 82% |
| ahf.NanoAndrew .4 | 13 | 77% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 37 | 36% | 69 |
| cx.BlestPain 1.41 | 22 | 21% | 45 |
| oog.melee.Mercutio 1.0 | 16 | 16% | 41 |
| ahf.NanoAndrew .4 | 11 | 11% | 20 |
| nic.Nicator 2.4 | 10 | 10% | 22 |
| maribo.melee.BMV 0.1 | 4 | 4% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |
| tex.Longbot 0.4 | 1 | 1% | 3 |
| goblin.Bender 2.4 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.0 | 107 / 210 | 2.35 | 17.6% | 24715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.6% | 107 |
| morbid.MorbidPriest 1.0 | 2.3 | 12.9% | 30 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.4% | 34 |
| uji.DBH 1.1 | 4.0 | 11.4% | 17 |
| ratosh.Nobo 0.21 | 5.3 | 10.1% | 3 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.7% | 7 |
| sigterm.Sigterm 1.0 | 7.2 | 8.3% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.3% | 4 |
| stelo.WangRobot 1.0 | 9.0 | 5.6% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 85.1 | 16 / 35 | 4122 |
| 2 | 1 | 64.9 | 80.6 | 14 / 35 | 3952 |
| 3 | 1 | 66.2 | 86.0 | 18 / 35 | 3980 |
| 4 | 1 | 65.7 | 81.9 | 17 / 35 | 4205 |
| 5 | 1 | 67.6 | 86.7 | 21 / 35 | 4340 |
| 6 | 1 | 67.8 | 89.8 | 21 / 35 | 4116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 44 | 57% |
| agd.Mooserwirt2 2.7 | 31 | 58% |
| uji.DBH 1.1 | 22 | 77% |
| sigterm.Sigterm 1.0 | 21 | 81% |
| ratosh.Nobo 0.21 | 11 | 100% |
| spinnercat.Robovirus 2.718 | 11 | 82% |
| stelo.WangRobot 1.0 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 34% | 62 |
| agd.Mooserwirt2 2.7 | 33 | 32% | 53 |
| uji.DBH 1.1 | 12 | 12% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 8% | 9 |
| sigterm.Sigterm 1.0 | 5 | 5% | 19 |
| ratosh.Nobo 0.21 | 4 | 4% | 16 |
| spinnercat.Robovirus 2.718 | 3 | 3% | 10 |
| stelo.WangRobot 1.0 | 2 | 2% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 6 |

## Melee bench: F19

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.6 | 161 / 210 | 1.49 | 20.5% | 31587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 20.5% | 161 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.8% | 22 |
| mld.Infinity 2.2 | 2.8 | 13.5% | 18 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.3% | 4 |
| erdnis.Rover 0.3 | 5.3 | 9.9% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.3% | 3 |
| mbh.Mbh 0.1 | 6.5 | 7.7% | 0 |
| pac.ABC 2.1 | 8.0 | 6.9% | 1 |
| pbg.R2D2 1.0 | 9.0 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 95.6 | 29 / 35 | 5332 |
| 2 | 1 | 71.0 | 94.0 | 26 / 35 | 5137 |
| 3 | 1 | 71.4 | 94.9 | 27 / 35 | 5281 |
| 4 | 1 | 71.3 | 94.0 | 26 / 35 | 5480 |
| 5 | 1 | 70.7 | 94.0 | 25 / 35 | 5133 |
| 6 | 1 | 71.3 | 94.9 | 28 / 35 | 5224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 87 | 87% |
| mld.Infinity 2.2 | 57 | 88% |
| krillr.mini.JointStrike 2.0.0 | 16 | 94% |
| erdnis.Rover 0.3 | 8 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 26 | 52% | 101 |
| mld.Infinity 2.2 | 11 | 22% | 47 |
| krillr.mini.JointStrike 2.0.0 | 5 | 10% | 23 |
| patson.PatsonTestBot 1.0 | 5 | 10% | 13 |
| erdnis.Rover 0.3 | 2 | 4% | 11 |
| pbg.R2D2 1.0 | 1 | 2% | 8 |
| mbh.Mbh 0.1 | 0 | 0% | 4 |
| pac.ABC 2.1 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.5 | 114 / 210 | 2.03 | 19.1% | 31641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.1% | 114 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.8% | 59 |
| fwb.Nine 1.0.1 | 3.5 | 10.9% | 16 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.8% | 3 |
| catcat20.Rabbit 0.001 | 4.7 | 9.9% | 15 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.3% | 0 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.5 | 18 / 35 | 5349 |
| 2 | 1 | 69.9 | 89.5 | 24 / 35 | 5346 |
| 3 | 1 | 68.5 | 86.7 | 19 / 35 | 5168 |
| 4 | 1 | 69.2 | 90.5 | 18 / 35 | 5096 |
| 5 | 1 | 67.6 | 85.7 | 16 / 35 | 5050 |
| 6 | 1 | 69.8 | 89.2 | 19 / 35 | 5632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 84 | 60% |
| fwb.Nine 1.0.1 | 30 | 83% |
| catcat20.Rabbit 0.001 | 15 | 80% |
| nz.jdc.nano.GridFu 1.0 | 13 | 100% |
| bayen.nut.Squirrel 1.615 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 58 | 60% | 96 |
| catcat20.Rabbit 0.001 | 15 | 16% | 36 |
| fwb.Nine 1.0.1 | 11 | 11% | 20 |
| nz.jdc.nano.GridFu 1.0 | 6 | 6% | 28 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 9 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 9 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.5 | 128 / 210 | 1.67 | 20.0% | 32389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 20.0% | 128 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 64 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.1% | 4 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 7 |
| eld.Hmm 1.0 | 5.5 | 8.8% | 7 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.3% | 1 |
| el.JumpShoot 0.2 | 7.2 | 6.6% | 1 |
| fire219.CatBot 1.0 | 8.5 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 96.2 | 23 / 35 | 5573 |
| 2 | 1 | 70.8 | 93.3 | 26 / 35 | 5395 |
| 3 | 1 | 70.5 | 92.7 | 21 / 35 | 5485 |
| 4 | 1 | 70.7 | 93.0 | 23 / 35 | 5459 |
| 5 | 1 | 68.8 | 87.9 | 18 / 35 | 5221 |
| 6 | 1 | 70.0 | 92.1 | 17 / 35 | 5256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 111 | 59% |
| dummy.mini.Scimitar 1.01 | 30 | 90% |
| cf.RiO.RiOx 4.2.1 | 17 | 100% |
| eld.Hmm 1.0 | 14 | 64% |
| oa.weak.BotherBot 0.1 | 7 | 86% |
| el.JumpShoot 0.2 | 4 | 75% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 49 | 58% | 94 |
| dummy.mini.Scimitar 1.01 | 15 | 18% | 49 |
| eld.Hmm 1.0 | 6 | 7% | 23 |
| cf.RiO.RiOx 4.2.1 | 6 | 7% | 22 |
| el.JumpShoot 0.2 | 4 | 5% | 7 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 9 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| PSW.Relentless 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.5 | 83 / 210 | 2.21 | 17.5% | 27574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.5 | 17.5% | 83 |
| pe.SandboxDT 2.71m | 1.7 | 16.6% | 78 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.6% | 32 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.3% | 14 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 2 |
| yk.JahRoslav 1.1 | 6.5 | 7.1% | 0 |
| tad.Dalek98 0.98 | 6.8 | 6.7% | 1 |
| gg.Squaraus 0.6 | 7.7 | 6.4% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 88.9 | 12 / 35 | 4145 |
| 2 | 1 | 68.8 | 89.5 | 19 / 35 | 4965 |
| 3 | 2 | 67.0 | 85.4 | 13 / 35 | 4522 |
| 4 | 1 | 67.8 | 87.3 | 17 / 35 | 4630 |
| 5 | 2 | 66.1 | 84.1 | 8 / 35 | 4500 |
| 6 | 1 | 66.9 | 83.8 | 14 / 35 | 4812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 64 | 31% |
| kvk.HebusLeTroll 0.35 | 48 | 67% |
| jlm.javaDisturbance 0.59 | 27 | 89% |
| bigpete.Stewie 1.0 | 6 | 67% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 57 | 45% | 84 |
| kvk.HebusLeTroll 0.35 | 38 | 30% | 60 |
| jlm.javaDisturbance 0.59 | 19 | 15% | 42 |
| tad.Dalek98 0.98 | 7 | 6% | 8 |
| bigpete.Stewie 1.0 | 4 | 3% | 9 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 3 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.7 | 100 / 210 | 2.29 | 18.3% | 30294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.3 | 18.3% | 100 |
| pe.SandboxLump 1.52 | 1.7 | 17.7% | 76 |
| cre.Karolos 0.32 | 3.0 | 14.6% | 23 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.5% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.3% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.0% | 3 |
| cw.megas.Blade 0.8 | 6.8 | 8.2% | 1 |
| sample.Walls 1.0 | 7.7 | 7.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.3 | 18 / 35 | 5080 |
| 2 | 1 | 67.8 | 84.1 | 17 / 35 | 4526 |
| 3 | 2 | 67.2 | 80.0 | 14 / 35 | 4704 |
| 4 | 1 | 70.2 | 90.8 | 19 / 35 | 4909 |
| 5 | 2 | 68.5 | 83.2 | 14 / 35 | 5211 |
| 6 | 1 | 70.6 | 87.9 | 18 / 35 | 5864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 76 | 59% |
| cre.Karolos 0.32 | 34 | 62% |
| stelo.AreaTargetingBot 1.1 | 22 | 95% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 100% |
| stelo.RamTrackSurfer 1.2 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 54 | 49% | 93 |
| cre.Karolos 0.32 | 29 | 26% | 50 |
| stelo.AreaTargetingBot 1.1 | 14 | 13% | 29 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 5% | 14 |
| stelo.RamTrackSurfer 1.2 | 5 | 5% | 14 |
| sample.Walls 1.0 | 2 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 70.6 | 44 / 210 | 3.65 | 13.8% | 19929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 2.3 | 14.2% | 46 |
| hadur117.mini.DeiseD 0.2 | 2.5 | 13.8% | 44 |
| florent.XSeries.X2 0.12 | 2.8 | 13.3% | 43 |
| davidalves.Phoenix 0.54 | 3.5 | 13.0% | 42 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.3% | 29 |
| oog.melee.Corsair 1.0 | 6.2 | 9.3% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 7.9% | 4 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.5% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 5.0% | 0 |
| evd.X1 0.01 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.6 | 64.4 | 7 / 35 | 2833 |
| 2 | 1 | 61.8 | 74.3 | 8 / 35 | 3503 |
| 3 | 4 | 59.7 | 69.2 | 5 / 35 | 3220 |
| 4 | 1 | 63.0 | 78.1 | 8 / 35 | 3702 |
| 5 | 3 | 58.5 | 64.1 | 9 / 35 | 3201 |
| 6 | 2 | 61.3 | 73.3 | 7 / 35 | 3470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 21 | 62% |
| rz.GlowBlowMelee 1.4 | 16 | 56% |
| florent.XSeries.X2 0.12 | 16 | 44% |
| pedersen.Ugluk 1.1.1 | 13 | 38% |
| stelo.SoJNanoMelee 1.1 | 7 | 71% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 50 | 30% | 55 |
| davidalves.Phoenix 0.54 | 35 | 21% | 46 |
| rz.GlowBlowMelee 1.4 | 31 | 19% | 45 |
| pedersen.Ugluk 1.1.1 | 24 | 14% | 27 |
| stelo.SoJNanoMelee 1.1 | 9 | 5% | 14 |
| evd.X1 0.01 | 7 | 4% | 7 |
| oog.melee.Corsair 1.0 | 4 | 2% | 7 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 4 |

## Melee bench: F25

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.5 | 106 / 210 | 2.48 | 17.7% | 25152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.7% | 106 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.3% | 31 |
| jdw.Hurricane 1.4 | 3.0 | 12.9% | 38 |
| voidious.micro.BlitzBat 1.05 | 3.5 | 12.7% | 12 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.9% | 10 |
| ds.Oo 2.2 | 6.0 | 8.8% | 7 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.5% | 2 |
| awesomeness.Elite 1.0 | 7.8 | 7.0% | 3 |
| adt.Ar2 1.1 | 8.7 | 6.4% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.5 | 20 / 35 | 4145 |
| 2 | 1 | 67.5 | 86.7 | 20 / 35 | 4225 |
| 3 | 1 | 66.2 | 81.3 | 14 / 35 | 4360 |
| 4 | 1 | 68.4 | 87.3 | 21 / 35 | 4259 |
| 5 | 1 | 66.9 | 85.1 | 16 / 35 | 4030 |
| 6 | 1 | 65.5 | 78.4 | 15 / 35 | 4133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 35 | 63% |
| voidious.micro.BlitzBat 1.05 | 33 | 85% |
| jdw.Hurricane 1.4 | 32 | 84% |
| ds.Oo 2.2 | 11 | 91% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| gre.svman4.Morfeas 1.4.1 | 5 | 60% |
| adt.Ar2 1.1 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 34 | 33% | 60 |
| voidious.mini.BrokenSword 2.0.3 | 28 | 27% | 51 |
| voidious.micro.BlitzBat 1.05 | 21 | 20% | 44 |
| gre.svman4.Morfeas 1.4.1 | 8 | 8% | 14 |
| adt.Ar2 1.1 | 4 | 4% | 8 |
| ds.Oo 2.2 | 3 | 3% | 14 |
| awesomeness.Elite 1.0 | 3 | 3% | 8 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 10 |
| amk.ChumbaMini 0.2 | 1 | 1% | 1 |

## Melee bench: F26

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.6 | 106 / 210 | 2.21 | 18.2% | 31061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.2% | 106 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 46 |
| shu.nitro.LENIN .T34 | 3.5 | 12.4% | 33 |
| lrem.Spectre 0.4.4 | 4.0 | 11.5% | 10 |
| js.PinBall 1.6 | 4.5 | 11.1% | 10 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.5% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.2% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 4 |
| sample.SpinBot 1.0 | 9.0 | 4.9% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.9 | 19 / 35 | 4940 |
| 2 | 1 | 67.5 | 84.8 | 16 / 35 | 5287 |
| 3 | 1 | 67.6 | 86.7 | 15 / 35 | 5105 |
| 4 | 1 | 66.6 | 81.6 | 17 / 35 | 4660 |
| 5 | 1 | 68.8 | 90.2 | 16 / 35 | 5357 |
| 6 | 1 | 70.6 | 94.3 | 23 / 35 | 5712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 45 | 58% |
| shu.nitro.LENIN .T34 | 37 | 65% |
| lrem.Spectre 0.4.4 | 29 | 86% |
| jaybot.adv.bots.JayBot 2.0 | 13 | 100% |
| js.PinBall 1.6 | 10 | 70% |
| gh.mini.GrubbmOne 1.0 | 7 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 0% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 42 | 40% | 64 |
| shu.nitro.LENIN .T34 | 28 | 26% | 63 |
| lrem.Spectre 0.4.4 | 18 | 17% | 39 |
| js.PinBall 1.6 | 8 | 8% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 4% | 13 |
| sample.SpinBot 1.0 | 3 | 3% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 5 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 9 |

## Melee bench: F27

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.7 | 115 / 210 | 2.47 | 17.6% | 25754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.6% | 115 |
| mk.Alpha 0.2.1 | 2.0 | 14.3% | 50 |
| wee.Gem 1.8.4 | 3.3 | 11.6% | 27 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.7% | 10 |
| EH.Eagle 1.0.6 | 4.8 | 10.3% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.5% | 0 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.6% | 3 |
| joe.ADinosaur 1.0 | 7.7 | 7.9% | 2 |
| caimano.Furia_Ceca 0.22 | 8.7 | 5.7% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 85.7 | 20 / 35 | 4089 |
| 2 | 1 | 67.6 | 87.3 | 18 / 35 | 4445 |
| 3 | 1 | 65.5 | 72.1 | 15 / 35 | 5126 |
| 4 | 1 | 65.8 | 83.5 | 19 / 35 | 3882 |
| 5 | 1 | 66.9 | 86.3 | 21 / 35 | 3843 |
| 6 | 1 | 67.4 | 87.0 | 22 / 35 | 4369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 67 | 70% |
| wee.Gem 1.8.4 | 29 | 79% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 94% |
| EH.Eagle 1.0.6 | 15 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 83% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 35 | 37% | 84 |
| wee.Gem 1.8.4 | 16 | 17% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 13% | 32 |
| throxbot.ThroxBot 0.1 | 11 | 12% | 17 |
| joe.ADinosaur 1.0 | 7 | 7% | 12 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 6 |
| EH.Eagle 1.0.6 | 5 | 5% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 2% | 6 |
| cs.Grudge 1.0 | 1 | 1% | 2 |

## Melee bench: F28

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.9 | 127 / 210 | 2.00 | 18.4% | 25048 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.4% | 127 |
| kid.test.NightFox .2 | 2.0 | 15.2% | 34 |
| uji.Antique 1.0 | 3.3 | 11.6% | 20 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.9% | 16 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.2% | 5 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.7% | 2 |
| ahr.ice.Ice 1.0.2 | 6.8 | 8.0% | 6 |
| matt.advanced.Katana 1.0 | 8.2 | 6.6% | 0 |
| stelo.Lifestealer 1.0 | 9.0 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 88.6 | 20 / 35 | 4249 |
| 2 | 1 | 68.6 | 90.8 | 23 / 35 | 4420 |
| 3 | 1 | 67.7 | 89.2 | 20 / 35 | 4330 |
| 4 | 1 | 66.7 | 86.7 | 19 / 35 | 4000 |
| 5 | 1 | 69.3 | 93.0 | 28 / 35 | 4118 |
| 6 | 1 | 66.4 | 85.4 | 17 / 35 | 3931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 88 | 77% |
| uji.Antique 1.0 | 38 | 87% |
| qohnil.blot.BlotBot 3.61 | 18 | 56% |
| pfvicm.Sobieski 7.2.3b | 10 | 70% |
| ahr.ice.Ice 1.0.2 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| amk.ChumbaWumba 0.3 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 39% | 89 |
| pfvicm.Sobieski 7.2.3b | 13 | 16% | 22 |
| uji.Antique 1.0 | 12 | 14% | 41 |
| qohnil.blot.BlotBot 3.61 | 10 | 12% | 23 |
| amk.ChumbaWumba 0.3 | 9 | 11% | 16 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 10 |
| stelo.Lifestealer 1.0 | 2 | 2% | 3 |
| matt.advanced.Katana 1.0 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.3 | 94 / 210 | 2.68 | 17.4% | 26597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.3 | 17.4% | 94 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.6% | 60 |
| deewiant.Anomaly 0.2 | 3.0 | 14.9% | 38 |
| myl.micro.Troodon 1.10 | 4.0 | 12.2% | 7 |
| jok.PheonixM 0.1.2 | 5.2 | 9.4% | 7 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.1% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 6.9% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.2 | 5.0% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.9 | 20 / 35 | 4579 |
| 2 | 1 | 68.0 | 85.1 | 16 / 35 | 4747 |
| 3 | 1 | 67.5 | 82.5 | 14 / 35 | 4527 |
| 4 | 3 | 63.0 | 70.2 | 11 / 35 | 3884 |
| 5 | 1 | 67.3 | 83.5 | 13 / 35 | 4347 |
| 6 | 1 | 68.1 | 83.8 | 20 / 35 | 4513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 72% |
| zyx.mega.YersiniaPestis 3.1 | 36 | 64% |
| myl.micro.Troodon 1.10 | 19 | 89% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| DBall.Anarchy 0.1 | 8 | 88% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 39 | 34% | 65 |
| deewiant.Anomaly 0.2 | 37 | 32% | 71 |
| myl.micro.Troodon 1.10 | 16 | 14% | 29 |
| jok.PheonixM 0.1.2 | 16 | 14% | 25 |
| ph.melee.ArcherME 0.3 | 7 | 6% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 9 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 75.6 | 47 / 210 | 3.20 | 14.9% | 23190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 14.9% | 47 |
| darkcanuck.B26354 1.06 | 2.5 | 13.3% | 44 |
| catcat20.Matcha 0.006 | 3.3 | 13.2% | 49 |
| oog.melee.Capulet 1.2 | 4.0 | 12.5% | 26 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.8% | 28 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.5% | 7 |
| ntc.Opposite 1.5 | 6.8 | 8.1% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.5% | 3 |
| tripphippy.Alice 1.1 | 8.5 | 6.5% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 71.7 | 6 / 35 | 3899 |
| 2 | 1 | 61.8 | 74.6 | 6 / 35 | 3733 |
| 3 | 1 | 64.3 | 79.7 | 9 / 35 | 4012 |
| 4 | 1 | 63.5 | 77.1 | 11 / 35 | 3793 |
| 5 | 1 | 61.5 | 72.1 | 7 / 35 | 3672 |
| 6 | 1 | 63.4 | 78.1 | 8 / 35 | 4081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.PastFuture 2.3.2 | 22 | 55% |
| oog.melee.Capulet 1.2 | 18 | 72% |
| catcat20.Matcha 0.006 | 18 | 33% |
| darkcanuck.B26354 1.06 | 14 | 21% |
| fowl3628800.LightningBolt 2.6.0 | 7 | 100% |
| intruder.PrairieWolf 2.61 | 6 | 50% |
| tripphippy.Alice 1.1 | 3 | 67% |
| ntc.Opposite 1.5 | 2 | 50% |

Hadur died in 164 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 48 | 29% | 58 |
| darkcanuck.B26354 1.06 | 37 | 23% | 43 |
| stelo.PastFuture 2.3.2 | 34 | 21% | 45 |
| oog.melee.Capulet 1.2 | 16 | 10% | 27 |
| tripphippy.Alice 1.1 | 9 | 5% | 13 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 9 |
| ntc.Opposite 1.5 | 7 | 4% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 8 |

## Melee bench: F31

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 75.6 | 38 / 210 | 3.20 | 14.6% | 20451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.8% | 115 |
| hadur117.mini.DeiseD 0.2 | 2.0 | 14.6% | 38 |
| gh.mini.Griezel 0.2 | 3.0 | 13.4% | 39 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.5% | 10 |
| d414.nano.Quantum 1.0.0 | 5.0 | 10.5% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 2 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.4% | 0 |
| fm.mammillarias 1.3 | 7.7 | 6.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.3% | 1 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 81.0 | 9 / 35 | 3571 |
| 2 | 2 | 61.9 | 75.2 | 4 / 35 | 3539 |
| 3 | 2 | 61.3 | 75.9 | 5 / 35 | 3015 |
| 4 | 2 | 61.1 | 69.8 | 7 / 35 | 3488 |
| 5 | 2 | 63.3 | 76.2 | 6 / 35 | 3561 |
| 6 | 2 | 62.7 | 75.2 | 7 / 35 | 3277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 41 | 34% |
| gh.mini.Griezel 0.2 | 29 | 41% |
| spinnercat.micro.Tyger 0.1 | 9 | 67% |
| d414.nano.Quantum 1.0.0 | 4 | 75% |
| fm.mammillarias 1.3 | 2 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 80 | 47% | 95 |
| gh.mini.Griezel 0.2 | 37 | 22% | 49 |
| spinnercat.micro.Tyger 0.1 | 20 | 12% | 25 |
| d414.nano.Quantum 1.0.0 | 15 | 9% | 18 |
| gh.nano.Grofvuil 0.2 | 9 | 5% | 11 |
| fm.mammillarias 1.3 | 5 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.7 | 128 / 210 | 1.93 | 18.8% | 28424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.8% | 128 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.0% | 49 |
| lxx.ConceptA 0.8 | 3.7 | 10.9% | 6 |
| apc.botM 3.0 | 3.8 | 11.5% | 17 |
| vjik.UnViolation 1.1 | 4.5 | 10.0% | 5 |
| bayen.UbaMicro 1.4 | 6.3 | 8.1% | 2 |
| panzer.Panzer 0.2 | 7.2 | 7.4% | 0 |
| yk.JahMicro 1.0 | 8.0 | 6.6% | 2 |
| conscience.Electron 1.3g | 8.7 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 87.3 | 19 / 35 | 4451 |
| 2 | 1 | 69.1 | 92.7 | 23 / 35 | 4923 |
| 3 | 1 | 70.0 | 95.2 | 25 / 35 | 4935 |
| 4 | 1 | 68.6 | 87.6 | 20 / 35 | 5127 |
| 5 | 1 | 66.8 | 85.7 | 18 / 35 | 4262 |
| 6 | 1 | 68.4 | 89.5 | 23 / 35 | 4726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 67 | 69% |
| lxx.ConceptA 0.8 | 26 | 92% |
| apc.botM 3.0 | 26 | 85% |
| vjik.UnViolation 1.1 | 13 | 92% |
| yk.JahMicro 1.0 | 11 | 91% |
| donjezza.Jezza 1.0 | 7 | 100% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 42 | 51% | 97 |
| lxx.ConceptA 0.8 | 20 | 24% | 29 |
| apc.botM 3.0 | 7 | 8% | 30 |
| bayen.UbaMicro 1.4 | 6 | 7% | 8 |
| vjik.UnViolation 1.1 | 3 | 4% | 26 |
| panzer.Panzer 0.2 | 3 | 4% | 5 |
| yk.JahMicro 1.0 | 2 | 2% | 8 |
| donjezza.Jezza 1.0 | 0 | 0% | 7 |

## Melee bench: F33

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.0 | 116 / 210 | 2.17 | 18.8% | 29265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.8% | 116 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 11.3% | 16 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.7% | 9 |
| labg.Cataclysm 2.05 | 5.0 | 10.1% | 17 |
| baal.nano.N 1.42 | 6.2 | 9.1% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.9% | 5 |
| zyx.micro.Ant 1.1 | 8.3 | 6.0% | 1 |
| sanja.First 0.1 | 8.8 | 5.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 80.3 | 16 / 35 | 5180 |
| 2 | 1 | 68.4 | 87.6 | 17 / 35 | 4984 |
| 3 | 1 | 69.4 | 91.1 | 21 / 35 | 4728 |
| 4 | 1 | 70.3 | 91.1 | 24 / 35 | 5024 |
| 5 | 1 | 68.0 | 85.1 | 20 / 35 | 4615 |
| 6 | 1 | 68.8 | 87.0 | 18 / 35 | 4734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 60 | 78% |
| gre.svman4.Leonidas 1.3.2 | 30 | 87% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 79% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 82% |
| labg.Cataclysm 2.05 | 9 | 67% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 2 | 50% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 32 | 33% | 83 |
| labg.Cataclysm 2.05 | 14 | 15% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 14% | 40 |
| zyx.micro.Ant 1.1 | 13 | 14% | 14 |
| gre.svman4.Leonidas 1.3.2 | 11 | 11% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 7% | 8 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 4% | 6 |
| baal.nano.N 1.42 | 2 | 2% | 5 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.3 | 64 / 210 | 2.69 | 16.5% | 27674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.8 | 16.5% | 64 |
| stelo.Spread 0.9 | 2.0 | 16.4% | 80 |
| kid.Gladiator .7.2 | 2.2 | 16.4% | 48 |
| jcs.Seth 1.8 | 4.2 | 11.5% | 14 |
| tcf.Reach 3 | 5.0 | 10.5% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.8% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.9% | 1 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.5 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.1 | 10 / 35 | 4715 |
| 2 | 3 | 65.2 | 77.8 | 9 / 35 | 4407 |
| 3 | 3 | 64.3 | 73.7 | 10 / 35 | 4497 |
| 4 | 2 | 66.6 | 81.9 | 11 / 35 | 4679 |
| 5 | 1 | 66.6 | 82.9 | 10 / 35 | 4670 |
| 6 | 1 | 67.9 | 86.3 | 14 / 35 | 4706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 56 | 32% |
| kid.Gladiator .7.2 | 39 | 62% |
| jcs.Seth 1.8 | 21 | 76% |
| tcf.Reach 3 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 62 | 42% | 79 |
| kid.Gladiator .7.2 | 49 | 34% | 68 |
| ratosh.Wesco 1.4 | 14 | 10% | 14 |
| tcf.Reach 3 | 10 | 7% | 18 |
| jcs.Seth 1.8 | 9 | 6% | 26 |
| cli.Dancer 1.1 | 1 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 71.1 | 11 / 210 | 3.60 | 13.2% | 18826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 160 |
| hadur117.mini.DeiseD 0.2 | 2.5 | 13.2% | 11 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.7% | 18 |
| rz.HawkOnFire 0.1 | 4.2 | 11.9% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.7% | 14 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.1% | 0 |
| wit.Chuliath 1.0 | 6.8 | 7.2% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.5 | 70.8 | 1 / 35 | 2920 |
| 2 | 2 | 59.4 | 70.5 | 1 / 35 | 3081 |
| 3 | 2 | 60.5 | 71.1 | 3 / 35 | 3231 |
| 4 | 2 | 61.3 | 74.3 | 2 / 35 | 3398 |
| 5 | 2 | 60.1 | 70.8 | 3 / 35 | 2996 |
| 6 | 3 | 59.4 | 69.2 | 1 / 35 | 3200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 32 | 9% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 57% |
| rz.HawkOnFire 0.1 | 5 | 80% |
| gh.mini.Gruwel 0.9 | 4 | 0% |

Hadur died in 199 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 112 | 56% | 117 |
| dmh.robocode.robot.BlackDeath 9.2 | 28 | 14% | 30 |
| rz.HawkOnFire 0.1 | 26 | 13% | 28 |
| gh.mini.Gruwel 0.9 | 17 | 9% | 19 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.6 | 174 / 210 | 1.49 | 21.0% | 31225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 21.0% | 174 |
| alpha.RainingFire 1.0 | 3.0 | 11.6% | 12 |
| bzdp.Pansy 2.1 | 3.2 | 11.6% | 7 |
| mz.Cork 0.1 | 4.8 | 10.4% | 4 |
| bvh.micro.Freya 0.3 | 5.0 | 10.2% | 7 |
| m3thos.Eva02 0.7.1 | 5.3 | 9.8% | 3 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.7% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.6% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 5.0% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.6 | 30 / 35 | 5628 |
| 2 | 1 | 70.6 | 93.7 | 26 / 35 | 4850 |
| 3 | 1 | 71.2 | 94.0 | 28 / 35 | 5225 |
| 4 | 1 | 71.9 | 97.5 | 32 / 35 | 5162 |
| 5 | 1 | 71.3 | 95.2 | 31 / 35 | 5140 |
| 6 | 1 | 70.7 | 92.4 | 27 / 35 | 5220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 96% |
| bvh.micro.Freya 0.3 | 36 | 89% |
| mz.Cork 0.1 | 25 | 100% |
| alpha.RainingFire 1.0 | 25 | 84% |
| m3thos.Eva02 0.7.1 | 24 | 92% |
| bvh.mini.Fenrir 0.39 | 20 | 95% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 41% | 51 |
| bvh.mini.Fenrir 0.39 | 6 | 16% | 18 |
| bvh.micro.Freya 0.3 | 6 | 16% | 16 |
| bzdp.Pansy 2.1 | 5 | 14% | 56 |
| m3thos.Eva02 0.7.1 | 4 | 11% | 32 |
| mz.Cork 0.1 | 1 | 3% | 20 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 9 |
| dl.BetterWalls 1.0 | 0 | 0% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.7 | 123 / 210 | 2.47 | 17.7% | 30754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.7% | 123 |
| germ.TheMind .2 | 2.2 | 12.3% | 29 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.6% | 9 |
| EBBU.Sim2 1.02 | 4.8 | 9.7% | 8 |
| agrach.Dalek 1.0 | 6.0 | 8.8% | 4 |
| stelo.UntouchableNano 1.3 | 6.2 | 9.1% | 14 |
| mb.Beast 0.1 | 6.2 | 8.8% | 8 |
| skm.Ryubot 1.0 | 7.5 | 8.2% | 10 |
| lmk.ACPFinal 0.1 | 8.8 | 7.6% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 7.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 86.7 | 23 / 35 | 4873 |
| 2 | 1 | 65.8 | 85.7 | 20 / 35 | 4566 |
| 3 | 1 | 65.0 | 82.9 | 17 / 35 | 4826 |
| 4 | 1 | 67.6 | 87.6 | 23 / 35 | 5277 |
| 5 | 1 | 64.9 | 77.8 | 18 / 35 | 5305 |
| 6 | 1 | 66.9 | 81.3 | 22 / 35 | 5907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 34 | 74% |
| EBBU.Sim2 1.02 | 25 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 100% |
| stelo.UntouchableNano 1.3 | 17 | 88% |
| skm.Ryubot 1.0 | 14 | 86% |
| mb.Beast 0.1 | 11 | 91% |
| agrach.Dalek 1.0 | 7 | 100% |
| lmk.ACPFinal 0.1 | 7 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 32 | 36% | 55 |
| stelo.UntouchableNano 1.3 | 15 | 17% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 8% | 29 |
| EBBU.Sim2 1.02 | 7 | 8% | 28 |
| agrach.Dalek 1.0 | 7 | 8% | 22 |
| mb.Beast 0.1 | 6 | 7% | 18 |
| lmk.ACPFinal 0.1 | 5 | 6% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 6% | 9 |
| skm.Ryubot 1.0 | 4 | 5% | 9 |

## Melee bench: F38

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.4 | 74 / 210 | 2.85 | 16.3% | 26020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 16.1% | 81 |
| hadur117.mini.DeiseD 0.2 | 1.5 | 16.3% | 74 |
| bvh.mini.Freya 0.55 | 3.2 | 13.1% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.3% | 13 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.2% | 13 |
| cs.Wren 1.0 | 5.5 | 9.6% | 10 |
| kdf.KoulDestroyer 1.0 | 7.2 | 8.6% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.8% | 3 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 70.2 | 6 / 35 | 3919 |
| 2 | 2 | 64.8 | 80.0 | 13 / 35 | 3961 |
| 3 | 1 | 67.0 | 84.1 | 16 / 35 | 4574 |
| 4 | 1 | 65.5 | 81.0 | 13 / 35 | 4361 |
| 5 | 2 | 65.4 | 79.7 | 13 / 35 | 4391 |
| 6 | 1 | 66.6 | 81.6 | 13 / 35 | 4814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 54% |
| bvh.mini.Freya 0.55 | 22 | 82% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 80% |
| cs.Wren 1.0 | 13 | 77% |
| bts.mega.Gnarly 1.4 | 8 | 75% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 49 | 36% | 75 |
| bvh.mini.Freya 0.55 | 24 | 18% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 14% | 31 |
| bts.mega.Gnarly 1.4 | 15 | 11% | 26 |
| cs.Wren 1.0 | 14 | 10% | 23 |
| kdf.KoulDestroyer 1.0 | 10 | 7% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 6 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 83.5 | 78 / 210 | 2.48 | 16.9% | 26908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 16.9% | 78 |
| bvh.fry.Freya 0.82 | 2.0 | 15.3% | 31 |
| az.Ololobot 0.2.4 | 3.0 | 12.8% | 55 |
| catcat20.Lambda 0.024 | 4.7 | 10.3% | 28 |
| apollokidd.ApolloKidd 0.9 | 5.7 | 8.9% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 5.8 | 9.0% | 15 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 8.2% | 2 |
| gimp.GimpBot 0.1 | 7.2 | 7.9% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 85.1 | 11 / 35 | 4175 |
| 2 | 1 | 64.9 | 83.2 | 13 / 35 | 4215 |
| 3 | 1 | 65.8 | 82.9 | 13 / 35 | 4578 |
| 4 | 1 | 66.4 | 81.6 | 14 / 35 | 5027 |
| 5 | 1 | 65.2 | 82.9 | 13 / 35 | 4359 |
| 6 | 1 | 66.3 | 85.7 | 14 / 35 | 4554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 41 | 39% |
| bvh.fry.Freya 0.82 | 40 | 70% |
| catcat20.Lambda 0.024 | 25 | 56% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 67% |
| gimp.GimpBot 0.1 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |

Hadur died in 133 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 49 | 37% | 79 |
| az.Ololobot 0.2.4 | 34 | 26% | 49 |
| stelo.SoRobotNanoMelee 1.2 | 22 | 17% | 28 |
| catcat20.Lambda 0.024 | 21 | 16% | 30 |
| apollokidd.ApolloKidd 0.9 | 3 | 2% | 8 |
| gimp.GimpBot 0.1 | 2 | 2% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 5 |

## Melee bench: F40

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.1 | 119 / 210 | 2.34 | 18.1% | 26625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.1% | 119 |
| kawigi.mini.Coriantumr 1.1 | 2.3 | 14.5% | 37 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.6% | 25 |
| mz.AntiGrav 1.0 | 3.7 | 11.7% | 12 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.6% | 8 |
| alpha.BlackIce 1.0 | 6.3 | 8.7% | 4 |
| stelo.Randomness 1.0 | 6.7 | 8.1% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.3% | 0 |
| sample.Corners 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.7 | 22 / 35 | 4477 |
| 2 | 1 | 67.4 | 85.1 | 20 / 35 | 4493 |
| 3 | 1 | 68.6 | 87.9 | 23 / 35 | 4359 |
| 4 | 1 | 66.2 | 80.3 | 13 / 35 | 4426 |
| 5 | 1 | 68.0 | 86.0 | 23 / 35 | 4329 |
| 6 | 1 | 67.1 | 84.8 | 18 / 35 | 4541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 51 | 75% |
| kano.gamma.KanoGamma 1.8 | 34 | 74% |
| mz.AntiGrav 1.0 | 32 | 94% |
| Polkwane.SmashMelee 1.0 | 13 | 92% |
| stelo.Randomness 1.0 | 10 | 90% |
| alpha.BlackIce 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 28 | 30% | 58 |
| kano.gamma.KanoGamma 1.8 | 17 | 18% | 51 |
| mz.AntiGrav 1.0 | 16 | 17% | 44 |
| Polkwane.SmashMelee 1.0 | 14 | 15% | 19 |
| alpha.BlackIce 1.0 | 7 | 8% | 10 |
| stelo.Randomness 1.0 | 5 | 5% | 15 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 6 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.3 | 109 / 210 | 2.32 | 17.4% | 23909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.4% | 109 |
| eem.EvBotNG v12.8 | 2.0 | 15.5% | 58 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 13 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.7% | 16 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.5% | 11 |
| shrub.Silver v048 | 5.7 | 9.5% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.7% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.5% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.9 | 19 / 35 | 4092 |
| 2 | 1 | 67.7 | 87.6 | 18 / 35 | 4083 |
| 3 | 1 | 67.6 | 83.5 | 23 / 35 | 4094 |
| 4 | 1 | 67.7 | 88.6 | 20 / 35 | 3857 |
| 5 | 1 | 65.7 | 82.5 | 14 / 35 | 3871 |
| 6 | 1 | 65.9 | 81.9 | 15 / 35 | 3912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 55 | 60% |
| lessonz.robocode.Oz 0.5.0 | 40 | 78% |
| ary.Swarm 1.1 | 26 | 92% |
| simonton.nano.MeleeSeed 1.8 | 19 | 95% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 40 | 40% | 79 |
| ary.Swarm 1.1 | 21 | 21% | 44 |
| simonton.nano.MeleeSeed 1.8 | 16 | 16% | 37 |
| lessonz.robocode.Oz 0.5.0 | 15 | 15% | 35 |
| zyx.nano.Ant 1.1 | 5 | 5% | 5 |
| shrub.Silver v048 | 2 | 2% | 4 |
| acogdev.alpha 0.2 | 2 | 2% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |

## Melee bench: F42

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.8 | 104 / 210 | 2.19 | 18.2% | 29891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.2% | 104 |
| wompi.Wallaby 5.1 | 2.3 | 14.9% | 46 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.6% | 25 |
| ara.Shera 0.88 | 3.3 | 13.5% | 31 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 1 |
| maribo.IotaCT 1.1 | 6.3 | 7.4% | 0 |
| dsw.StaticD 1.0 | 7.2 | 6.9% | 3 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.3 | 16 / 35 | 4939 |
| 2 | 1 | 66.9 | 84.8 | 14 / 35 | 4877 |
| 3 | 1 | 68.5 | 88.3 | 20 / 35 | 5133 |
| 4 | 1 | 69.6 | 91.4 | 23 / 35 | 5242 |
| 5 | 1 | 67.1 | 84.1 | 15 / 35 | 4754 |
| 6 | 1 | 67.7 | 86.0 | 16 / 35 | 4946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 58 | 67% |
| maribo.mini.MiniQuester 0.1 | 43 | 77% |
| ara.Shera 0.88 | 37 | 70% |
| dsw.StaticD 1.0 | 5 | 60% |
| maribo.IotaCT 1.1 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 40% | 80 |
| ara.Shera 0.88 | 32 | 30% | 60 |
| maribo.mini.MiniQuester 0.1 | 19 | 18% | 48 |
| amz.NanoClone 1.41 | 7 | 6% | 9 |
| dsw.StaticD 1.0 | 3 | 3% | 7 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 73.3 | 34 / 210 | 3.40 | 14.0% | 20659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 142 |
| hadur117.mini.DeiseD 0.2 | 2.0 | 14.0% | 34 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.2% | 11 |
| brainfade.melee.Dusk 0.44 | 4.2 | 11.9% | 14 |
| wcsv.melee.EngineerMelee 0.1 | 4.2 | 11.4% | 7 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 68.9 | 4 / 35 | 3456 |
| 2 | 2 | 62.8 | 74.6 | 5 / 35 | 3561 |
| 3 | 2 | 62.9 | 72.7 | 5 / 35 | 3562 |
| 4 | 2 | 62.6 | 71.7 | 6 / 35 | 3557 |
| 5 | 2 | 63.3 | 76.5 | 8 / 35 | 3239 |
| 6 | 2 | 62.9 | 75.2 | 6 / 35 | 3284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 47 | 21% |
| brainfade.melee.Dusk 0.44 | 15 | 73% |
| dummy.micro.Sparrow 2.5 | 8 | 88% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |
| cvt.Firsty 1.0 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 177 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 110 | 62% | 120 |
| brainfade.melee.Dusk 0.44 | 19 | 11% | 27 |
| dummy.micro.Sparrow 2.5 | 18 | 10% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 10% | 22 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 6 |
| cvt.Firsty 1.0 | 3 | 2% | 5 |
| mz.NanoGod 2.02 | 3 | 2% | 3 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.6 | 124 / 210 | 1.93 | 19.3% | 29901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.3% | 124 |
| stelo.Liblix 0.3.1 | 2.3 | 14.6% | 43 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.2% | 31 |
| wompi.Quokka 1.6 | 4.2 | 10.2% | 3 |
| jwirde.Gort 2.0 | 5.3 | 9.1% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 8.6% | 2 |
| disan.Chair 2.2.0 | 6.7 | 7.7% | 2 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.5% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 20 / 35 | 5028 |
| 2 | 1 | 68.6 | 85.4 | 20 / 35 | 4817 |
| 3 | 1 | 67.1 | 84.1 | 14 / 35 | 4811 |
| 4 | 1 | 69.7 | 92.1 | 24 / 35 | 4912 |
| 5 | 1 | 69.8 | 92.4 | 21 / 35 | 4977 |
| 6 | 1 | 71.2 | 95.9 | 25 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 75 | 73% |
| tzu.TheArtOfWar 1.2 | 64 | 69% |
| wompi.Quokka 1.6 | 9 | 78% |
| jwirde.Gort 2.0 | 7 | 86% |
| disan.Chair 2.2.0 | 7 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 80% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 40% | 94 |
| tzu.TheArtOfWar 1.2 | 32 | 37% | 71 |
| wompi.Quokka 1.6 | 9 | 10% | 17 |
| disan.Chair 2.2.0 | 3 | 3% | 8 |
| jwirde.Gort 2.0 | 2 | 2% | 9 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 2% | 3 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.1 | 110 / 210 | 1.80 | 20.6% | 35771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 20.6% | 110 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.1% | 78 |
| jje.BagPuss 1.2 | 3.5 | 11.1% | 4 |
| myl.nano.Graviton 1.10 | 3.8 | 10.8% | 9 |
| sul.Lunar 1.1 | 4.7 | 10.1% | 2 |
| fm.claire 1.7 | 6.3 | 8.8% | 1 |
| hvilela.HVilela 0.9 | 7.2 | 8.2% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 7.5% | 5 |
| wit.Deep7 2.0 | 9.0 | 6.2% | 1 |
| abud.ThirdRobo 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.4 | 20 / 35 | 6343 |
| 2 | 1 | 69.1 | 87.9 | 14 / 35 | 5635 |
| 3 | 1 | 71.3 | 93.3 | 20 / 35 | 6194 |
| 4 | 1 | 70.7 | 90.2 | 16 / 35 | 6204 |
| 5 | 1 | 70.0 | 90.8 | 18 / 35 | 5645 |
| 6 | 1 | 70.5 | 92.1 | 22 / 35 | 5750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 105 | 50% |
| sul.Lunar 1.1 | 20 | 95% |
| myl.nano.Graviton 1.10 | 15 | 93% |
| jje.BagPuss 1.2 | 12 | 75% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 70% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 2 | 50% |
| fm.claire 1.7 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 2048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 53 | 53% | 0 |
| myl.nano.Graviton 1.10 | 22 | 22% | 53 |
| sul.Lunar 1.1 | 7 | 7% | 54 |
| jje.BagPuss 1.2 | 6 | 6% | 39 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 6% | 20 |
| fm.claire 1.7 | 4 | 4% | 16 |
| hvilela.HVilela 0.9 | 1 | 1% | 15 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |
| wit.Deep7 2.0 | 0 | 0% | 9 |

## Melee bench: F46

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 75.6 | 28 / 210 | 3.20 | 14.8% | 24931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.6% | 103 |
| kc.mini.Mirage 0.2 | 1.7 | 17.1% | 61 |
| hadur117.mini.DeiseD 0.2 | 3.0 | 14.8% | 28 |
| cx.Princess 1.0 | 4.5 | 10.4% | 12 |
| mz.MicroSheep 1.0 | 4.7 | 10.5% | 4 |
| sadoner.killer 0.2 | 5.8 | 8.9% | 0 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.5% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.1% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 73.0 | 4 / 35 | 3999 |
| 2 | 3 | 62.8 | 74.6 | 6 / 35 | 3957 |
| 3 | 3 | 62.1 | 73.0 | 1 / 35 | 4047 |
| 4 | 3 | 64.2 | 77.5 | 7 / 35 | 4348 |
| 5 | 3 | 64.2 | 78.1 | 4 / 35 | 4384 |
| 6 | 3 | 64.1 | 77.5 | 6 / 35 | 4196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 34 | 35% |
| rsalesc.melee.Medina 0.4.5 | 23 | 30% |
| cx.Princess 1.0 | 4 | 50% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| mz.MicroSheep 1.0 | 3 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 69 | 38% | 79 |
| rsalesc.melee.Medina 0.4.5 | 63 | 34% | 70 |
| cx.Princess 1.0 | 26 | 14% | 28 |
| mz.MicroSheep 1.0 | 16 | 9% | 22 |
| sadoner.killer 0.2 | 4 | 2% | 6 |
| arthord.NanoSatanMelee Beta | 4 | 2% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

