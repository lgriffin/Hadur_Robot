# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.9 | 57 / 210 | 2.54 | 16.9% | 30261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 136 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 16.9% | 57 |
| sgp.JollyNinja 3.53 | 3.2 | 11.4% | 11 |
| mz.MicroGodMelee 1 | 4.3 | 10.7% | 2 |
| lorneswork.Predator 1.0 | 4.8 | 10.1% | 1 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.7 | 9.6% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.2% | 1 |
| skm.butterfly 1.0 | 8.5 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 83.8 | 7 / 35 | 5210 |
| 2 | 2 | 67.5 | 85.7 | 10 / 35 | 5317 |
| 3 | 2 | 66.2 | 83.5 | 8 / 35 | 4869 |
| 4 | 2 | 66.4 | 84.8 | 12 / 35 | 4791 |
| 5 | 2 | 64.8 | 78.1 | 8 / 35 | 4925 |
| 6 | 2 | 67.1 | 81.6 | 12 / 35 | 5149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 23% |
| sgp.JollyNinja 3.53 | 17 | 88% |
| mz.MicroGodMelee 1 | 9 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| lorneswork.Predator 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 112 | 73% | 140 |
| sgp.JollyNinja 3.53 | 12 | 8% | 19 |
| mz.MicroGodMelee 1 | 11 | 7% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 5% | 10 |
| lorneswork.Predator 1.0 | 4 | 3% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 3% | 4 |
| adt.Ar2 1.0 | 3 | 2% | 4 |

## Melee bench: F02

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.3 | 94 / 210 | 2.78 | 17.5% | 30341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.5% | 94 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.1% | 45 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.8% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.8% | 11 |
| Noran.BitchingElk 0.054 | 6.8 | 7.8% | 14 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.9% | 4 |
| sch.Simone 0.3d | 7.3 | 7.6% | 5 |
| stelo.PatternRobot 1.0 | 8.5 | 6.5% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 76.5 | 14 / 35 | 4893 |
| 2 | 1 | 65.6 | 78.4 | 14 / 35 | 4761 |
| 3 | 1 | 68.5 | 85.1 | 21 / 35 | 5355 |
| 4 | 1 | 67.8 | 84.1 | 16 / 35 | 5259 |
| 5 | 1 | 65.7 | 77.8 | 16 / 35 | 5004 |
| 6 | 1 | 66.0 | 79.7 | 13 / 35 | 5069 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 73% |
| pulsar.PulsarMax 0.8.9 | 38 | 55% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 90% |
| sch.Simone 0.3d | 8 | 88% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| Noran.BitchingElk 0.054 | 1 | 0% |

Hadur died in 118 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 37 | 31% | 57 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 23% | 62 |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 12% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 9% | 15 |
| fnc.bandit.Bandit 5.2.0 | 9 | 8% | 15 |
| Noran.BitchingElk 0.054 | 7 | 6% | 11 |
| stelo.PatternRobot 1.0 | 7 | 6% | 9 |
| sch.Simone 0.3d | 4 | 3% | 10 |
| fullsail.SweetTea 1.1 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.0 | 136 / 210 | 1.81 | 19.9% | 37165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.9% | 136 |
| radnor.DoctorBob 1.42 | 2.2 | 14.0% | 17 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.9% | 20 |
| vuen.Cake 2.51 | 3.5 | 12.6% | 35 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.0% | 0 |
| adt.Ar1 2.1 | 7.0 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.7% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 93.3 | 23 / 35 | 6283 |
| 2 | 1 | 70.9 | 91.7 | 23 / 35 | 6655 |
| 3 | 1 | 69.9 | 89.8 | 19 / 35 | 6672 |
| 4 | 1 | 68.0 | 86.3 | 21 / 35 | 5402 |
| 5 | 1 | 70.3 | 91.7 | 26 / 35 | 6270 |
| 6 | 1 | 70.3 | 92.7 | 24 / 35 | 5883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 57 | 60% |
| kawigi.nano.Lib 1.0 | 56 | 82% |
| radnor.DoctorBob 1.42 | 41 | 98% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 29 | 39% | 66 |
| radnor.DoctorBob 1.42 | 23 | 31% | 56 |
| kawigi.nano.Lib 1.0 | 13 | 18% | 56 |
| urdos.URDOS 1.3 | 3 | 4% | 8 |
| adt.Ar1 2.1 | 3 | 4% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 8 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.7 | 16 / 210 | 2.74 | 16.3% | 32220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.6% | 183 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 16.3% | 16 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 7 |
| TNT.TNT 0.99.1 | 4.2 | 10.3% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.0% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.3% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 80.6 | 1 / 35 | 5406 |
| 2 | 2 | 64.6 | 76.8 | 3 / 35 | 4693 |
| 3 | 2 | 66.7 | 82.2 | 3 / 35 | 5513 |
| 4 | 2 | 66.6 | 80.0 | 1 / 35 | 5779 |
| 5 | 2 | 67.1 | 81.9 | 5 / 35 | 5612 |
| 6 | 2 | 67.0 | 82.5 | 3 / 35 | 5217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 11% |
| TNT.TNT 0.99.1 | 2 | 0% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 1175. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 153 | 79% | 169 |
| apc.LeeroyJenkins2 1.0 | 18 | 9% | 18 |
| TNT.TNT 0.99.1 | 9 | 5% | 9 |
| josago.Jorgito 0.16 | 8 | 4% | 8 |
| css.Delitioner 0.11 | 5 | 3% | 5 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 69.2 | 27 / 210 | 3.77 | 13.3% | 21578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.2% | 113 |
| justin.DemonicRage 3.4 | 2.0 | 16.8% | 55 |
| hadur117.mini.DeiseW 0.2 | 3.2 | 13.3% | 27 |
| wompi.Numbat 2.1 | 3.8 | 12.6% | 10 |
| ms.Ares 0.19 | 5.2 | 9.4% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 9.1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.9% | 0 |
| supersample.SuperBoxBot 1.0 | 8.2 | 5.6% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 67.9 | 4 / 35 | 3717 |
| 2 | 3 | 61.2 | 70.8 | 3 / 35 | 3859 |
| 3 | 3 | 61.8 | 72.4 | 4 / 35 | 3760 |
| 4 | 4 | 59.0 | 64.8 | 3 / 35 | 3471 |
| 5 | 3 | 59.6 | 68.3 | 5 / 35 | 3093 |
| 6 | 3 | 61.7 | 71.1 | 8 / 35 | 3678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 23 | 39% |
| cb.fire.Firestarter 2.0f | 20 | 25% |
| wompi.Numbat 2.1 | 11 | 82% |
| axeBots.HataMoto 3.09 | 3 | 100% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 184 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 55 | 30% | 64 |
| cb.fire.Firestarter 2.0f | 53 | 29% | 57 |
| wompi.Numbat 2.1 | 37 | 20% | 44 |
| ms.Ares 0.19 | 19 | 10% | 21 |
| axeBots.HataMoto 3.09 | 9 | 5% | 13 |
| GarmBox.Oranges 1.0 | 4 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.0 | 91 / 210 | 2.62 | 17.2% | 28055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.2% | 91 |
| jekl.StoneGhost 0.7 | 2.3 | 14.7% | 37 |
| origin.SleepSiphon 1.7b | 3.0 | 13.8% | 49 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 11.6% | 19 |
| mld.Wisdom 1.0 | 5.0 | 10.8% | 3 |
| gg.Wolverine 2.0 | 5.8 | 9.1% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.7% | 5 |
| spinnercat.Omen 1.0 | 8.0 | 6.5% | 1 |
| DBall.NUKE 0.1 | 8.2 | 6.5% | 1 |
| sample.Fire 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 81.6 | 15 / 35 | 4791 |
| 2 | 1 | 65.7 | 80.3 | 13 / 35 | 4640 |
| 3 | 1 | 66.9 | 81.3 | 17 / 35 | 4558 |
| 4 | 1 | 65.8 | 79.0 | 15 / 35 | 4456 |
| 5 | 1 | 67.2 | 86.0 | 16 / 35 | 4800 |
| 6 | 1 | 66.5 | 83.5 | 15 / 35 | 4810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 39 | 77% |
| origin.SleepSiphon 1.7b | 34 | 53% |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 80% |
| gg.Wolverine 2.0 | 14 | 93% |
| mld.Wisdom 1.0 | 10 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 60% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 35 | 29% | 62 |
| jekl.StoneGhost 0.7 | 28 | 23% | 53 |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 21% | 39 |
| mld.Wisdom 1.0 | 14 | 12% | 25 |
| gg.Wolverine 2.0 | 9 | 7% | 14 |
| spinnercat.Omen 1.0 | 4 | 3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 6 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |
| sample.Fire 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 90.7 | 107 / 210 | 1.84 | 19.7% | 36469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.7% | 107 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.4% | 46 |
| rtk.Tachikoma 1.0 | 2.8 | 16.7% | 40 |
| franzor.Lizt 1.3.1 | 4.2 | 10.9% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.8% | 7 |
| exauge.GateKeeper 1.1.121g | 6.3 | 7.8% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.5 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.9 | 18 / 35 | 5648 |
| 2 | 1 | 69.4 | 88.6 | 13 / 35 | 5469 |
| 3 | 1 | 70.2 | 87.3 | 14 / 35 | 6080 |
| 4 | 1 | 73.0 | 95.2 | 23 / 35 | 6584 |
| 5 | 1 | 72.4 | 93.0 | 22 / 35 | 6469 |
| 6 | 1 | 71.2 | 91.1 | 17 / 35 | 6219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 92 | 72% |
| rsalesc.melee.Monk 0.3.6c | 39 | 28% |
| franzor.Lizt 1.3.1 | 22 | 82% |
| oog.melee.CapuletDroid 1.1 | 14 | 71% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 1201. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 47 | 45% | 119 |
| rsalesc.melee.Monk 0.3.6c | 43 | 41% | 63 |
| oog.melee.CapuletDroid 1.1 | 6 | 6% | 20 |
| franzor.Lizt 1.3.1 | 5 | 5% | 1 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 5 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.9 | 112 / 210 | 2.18 | 18.7% | 30626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.7% | 112 |
| tm.Yuugao 1.0 | 2.5 | 12.6% | 39 |
| shrub.Vapour v159 | 2.8 | 12.1% | 31 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 10.6% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 8.8% | 7 |
| m3thos.Eva00 1.1 | 6.0 | 8.9% | 2 |
| com.spp.robocode.MostlyHarmless 010 | 6.3 | 8.8% | 7 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.6% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.5% | 1 |
| SHAM.WOW 1.4 | 9.2 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.9 | 17 / 35 | 4865 |
| 2 | 1 | 67.2 | 85.7 | 15 / 35 | 5062 |
| 3 | 1 | 68.1 | 88.3 | 17 / 35 | 5035 |
| 4 | 1 | 70.0 | 93.7 | 23 / 35 | 5261 |
| 5 | 1 | 69.1 | 88.3 | 23 / 35 | 5528 |
| 6 | 1 | 66.4 | 82.9 | 17 / 35 | 4875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 43 | 70% |
| tm.Yuugao 1.0 | 41 | 51% |
| Krabb.sliNk.Garm 0.9u | 26 | 88% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 13 | 92% |
| m3thos.Eva00 1.1 | 5 | 80% |
| qualidafial.MajorDick 1.0.1 | 4 | 50% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 33 | 34% | 63 |
| shrub.Vapour v159 | 25 | 26% | 56 |
| Krabb.sliNk.Garm 0.9u | 20 | 20% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 7% | 17 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 6% | 18 |
| m3thos.Eva00 1.1 | 3 | 3% | 10 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 6 |
| SHAM.WOW 1.4 | 1 | 1% | 1 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 4 |

## Melee bench: F09

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 71.0 | 45 / 210 | 3.61 | 14.8% | 24735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.0% | 103 |
| hadur117.mini.DeiseW 0.2 | 1.8 | 14.8% | 45 |
| kc.micro.Figment 1.0 | 2.8 | 14.1% | 29 |
| yagami.Tidus 0.11 | 4.5 | 11.1% | 2 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.9% | 16 |
| mc2.enemy.Original 0.9 | 6.2 | 9.3% | 10 |
| dft.Calliope 5.6 | 6.8 | 7.7% | 2 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 2 |
| rdm.Dueler 0.4x | 9.2 | 4.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 70.8 | 7 / 35 | 4250 |
| 2 | 2 | 63.9 | 74.0 | 9 / 35 | 4189 |
| 3 | 3 | 62.1 | 68.9 | 6 / 35 | 3875 |
| 4 | 1 | 64.1 | 75.6 | 8 / 35 | 4503 |
| 5 | 2 | 59.5 | 63.8 | 5 / 35 | 3739 |
| 6 | 1 | 63.1 | 73.0 | 10 / 35 | 4179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 33 | 24% |
| kc.micro.Figment 1.0 | 21 | 67% |
| pedersen.Grishnakh 1.0 | 10 | 80% |
| yagami.Tidus 0.11 | 8 | 88% |
| mc2.enemy.Original 0.9 | 8 | 75% |
| dft.Calliope 5.6 | 4 | 50% |
| robar.nano.Assertive_Melee 0.2 | 1 | 0% |

Hadur died in 165 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 58 | 35% | 64 |
| kc.micro.Figment 1.0 | 43 | 26% | 62 |
| yagami.Tidus 0.11 | 17 | 10% | 21 |
| mc2.enemy.Original 0.9 | 15 | 9% | 21 |
| pedersen.Grishnakh 1.0 | 15 | 9% | 21 |
| dft.Calliope 5.6 | 6 | 4% | 10 |
| rdm.Dueler 0.4x | 6 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.8 | 159 / 210 | 1.56 | 20.3% | 34306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.3% | 159 |
| DTF.Kludgy 1.2b | 2.2 | 13.8% | 18 |
| ne.Chimera 1.2 | 3.3 | 12.9% | 13 |
| ejb.Polaris 1.0.1 | 3.5 | 12.2% | 11 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.4% | 3 |
| vStar.RAFzilla 2.15 | 5.5 | 9.9% | 6 |
| kurios.DOSexe .9b | 7.8 | 5.9% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.5% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 93.0 | 26 / 35 | 5665 |
| 2 | 1 | 71.3 | 97.1 | 27 / 35 | 5650 |
| 3 | 1 | 71.2 | 95.6 | 29 / 35 | 5993 |
| 4 | 1 | 67.9 | 85.1 | 20 / 35 | 5255 |
| 5 | 1 | 71.7 | 95.6 | 28 / 35 | 6205 |
| 6 | 1 | 71.2 | 96.5 | 29 / 35 | 5538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 48 | 85% |
| DTF.Kludgy 1.2b | 46 | 78% |
| ne.Chimera 1.2 | 43 | 91% |
| vStar.RAFzilla 2.15 | 20 | 80% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| kurios.DOSexe .9b | 8 | 100% |
| donjezza.Muncho 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 40% | 56 |
| ne.Chimera 1.2 | 12 | 23% | 44 |
| ejb.Polaris 1.0.1 | 8 | 15% | 53 |
| vStar.RAFzilla 2.15 | 5 | 10% | 20 |
| tvv.micro.Antares 1.1.1 | 3 | 6% | 14 |
| kurios.DOSexe .9b | 1 | 2% | 12 |
| donjezza.Muncho 1.0 | 1 | 2% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 78.8 | 80 / 210 | 2.91 | 16.7% | 27571 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.3 | 16.7% | 80 |
| rz.Aleph 0.34 | 1.8 | 16.3% | 74 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.8% | 21 |
| djc.DynaBot 0.1.1 | 3.8 | 11.0% | 16 |
| br2.MobyDickBot 1.6 | 5.8 | 8.8% | 10 |
| rdt199.Warlord 0.73 | 6.0 | 8.7% | 6 |
| uji.YellohFellah 1.0 | 6.3 | 8.4% | 4 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.9% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 5.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.2 | 19 / 35 | 4921 |
| 2 | 1 | 65.8 | 80.3 | 14 / 35 | 4536 |
| 3 | 1 | 66.2 | 81.0 | 14 / 35 | 4770 |
| 4 | 2 | 62.8 | 72.7 | 8 / 35 | 4231 |
| 5 | 2 | 64.2 | 75.2 | 10 / 35 | 4613 |
| 6 | 1 | 66.1 | 81.3 | 15 / 35 | 4500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 46 | 48% |
| djc.DynaBot 0.1.1 | 16 | 75% |
| cx.mini.Nimrod 0.55 | 16 | 81% |
| br2.MobyDickBot 1.6 | 14 | 93% |
| uji.YellohFellah 1.0 | 11 | 100% |
| rdt199.Warlord 0.73 | 9 | 89% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 54 | 42% | 82 |
| cx.mini.Nimrod 0.55 | 30 | 23% | 40 |
| djc.DynaBot 0.1.1 | 13 | 10% | 19 |
| rdt199.Warlord 0.73 | 11 | 8% | 19 |
| br2.MobyDickBot 1.6 | 9 | 7% | 21 |
| KiraNL.Chupacabra 0.4 | 7 | 5% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 2 | 2% | 5 |
| uji.YellohFellah 1.0 | 1 | 1% | 13 |

## Melee bench: F12

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.6 | 99 / 210 | 2.74 | 17.0% | 24835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.0% | 99 |
| darkcanuck.Leon 1.01 | 2.7 | 13.8% | 33 |
| nat.PallasHawk 1.0 | 3.0 | 13.5% | 46 |
| bts.wiki.RipCurl 0.9b | 3.5 | 12.9% | 19 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.3% | 8 |
| jrm.Test0 1.0 | 6.3 | 7.9% | 0 |
| jp.Perpy 16.0 | 7.3 | 6.9% | 1 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.5% | 1 |
| jaybot.bots.Oddball 4.0 | 8.7 | 6.1% | 3 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.0 | 20 / 35 | 4108 |
| 2 | 1 | 66.7 | 84.1 | 18 / 35 | 4258 |
| 3 | 1 | 63.6 | 72.7 | 14 / 35 | 4052 |
| 4 | 1 | 64.6 | 77.5 | 11 / 35 | 4155 |
| 5 | 1 | 66.9 | 83.2 | 20 / 35 | 4346 |
| 6 | 1 | 65.3 | 79.4 | 16 / 35 | 3916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 41 | 68% |
| bts.wiki.RipCurl 0.9b | 31 | 87% |
| nat.PallasHawk 1.0 | 28 | 71% |
| brainfade.melee.Genghis 0.36 | 15 | 93% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 32 | 29% | 46 |
| darkcanuck.Leon 1.01 | 26 | 23% | 61 |
| bts.wiki.RipCurl 0.9b | 18 | 16% | 44 |
| brainfade.melee.Genghis 0.36 | 15 | 14% | 22 |
| jrm.Test0 1.0 | 8 | 7% | 8 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 8 |
| jaybot.bots.Oddball 4.0 | 4 | 4% | 10 |
| jp.Perpy 16.0 | 3 | 3% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F13

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.3 | 51 / 210 | 2.86 | 15.6% | 26461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.4% | 46 |
| mn.Combat 3.25.0 | 1.8 | 16.6% | 89 |
| hadur117.mini.DeiseW 0.2 | 2.5 | 15.6% | 51 |
| shinh.Entangled 0.3 | 4.0 | 12.3% | 15 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.4% | 9 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.2 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 76.2 | 7 / 35 | 3879 |
| 2 | 2 | 65.4 | 84.1 | 9 / 35 | 4282 |
| 3 | 3 | 63.3 | 73.0 | 9 / 35 | 4309 |
| 4 | 3 | 65.2 | 80.0 | 7 / 35 | 4600 |
| 5 | 2 | 64.9 | 81.0 | 8 / 35 | 4500 |
| 6 | 2 | 66.3 | 81.6 | 11 / 35 | 4891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 48 | 42% |
| ags.Glacier 0.2.11 | 38 | 47% |
| shinh.Entangled 0.3 | 13 | 54% |
| gh.micro.Gruweltje 0.7 | 3 | 67% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 2 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 61 | 38% | 84 |
| ags.Glacier 0.2.11 | 50 | 31% | 64 |
| shinh.Entangled 0.3 | 24 | 15% | 32 |
| gh.micro.Gruweltje 0.7 | 12 | 8% | 17 |
| apc.Colossus2 0.17 | 4 | 3% | 5 |
| stelo.Wang 1.0 | 4 | 3% | 4 |
| ayk.WallHugger 1.0 | 3 | 2% | 3 |
| maribo.FollowFire 1 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.4 | 140 / 210 | 2.04 | 19.4% | 33646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.4% | 140 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.8% | 32 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 27 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.5% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.2% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.1% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.2% | 6 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.4 | 25 / 35 | 5754 |
| 2 | 1 | 69.9 | 90.8 | 23 / 35 | 5483 |
| 3 | 1 | 69.5 | 88.3 | 23 / 35 | 5561 |
| 4 | 1 | 70.6 | 93.0 | 24 / 35 | 5535 |
| 5 | 1 | 69.2 | 85.4 | 21 / 35 | 5786 |
| 6 | 1 | 69.7 | 88.6 | 24 / 35 | 5527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 85% |
| catcat20.shape.Theta 0.018 | 50 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 80% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 27 | 39% | 81 |
| catcat20.shape.Theta 0.018 | 17 | 24% | 55 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 9% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 7% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 7% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 4% | 16 |
| pa.Improved 1.0 | 2 | 3% | 5 |

## Melee bench: F15

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.8 | 107 / 210 | 2.55 | 18.4% | 32838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.4% | 107 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.5% | 22 |
| emp.Yngwie 1.11 | 3.0 | 12.9% | 44 |
| mld.DustBunny 3.8 | 3.5 | 12.0% | 6 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.7% | 8 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.1% | 21 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.4% | 1 |
| lambdaxy.TBot 0.1 | 7.8 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.3 | 18 / 35 | 5587 |
| 2 | 1 | 67.5 | 81.6 | 15 / 35 | 5588 |
| 3 | 1 | 66.4 | 77.1 | 16 / 35 | 5259 |
| 4 | 1 | 66.0 | 76.8 | 14 / 35 | 5019 |
| 5 | 1 | 70.1 | 87.3 | 24 / 35 | 6000 |
| 6 | 1 | 68.7 | 86.3 | 20 / 35 | 5385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 31 | 97% |
| emp.Yngwie 1.11 | 31 | 55% |
| mld.DustBunny 3.8 | 25 | 96% |
| kawigi.robot.Girl 1.2 | 21 | 81% |
| cb.nano.Insomnia 1.0 | 17 | 100% |
| divineomega.TrialBot 0.003 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 36% | 69 |
| mld.DustBunny 3.8 | 15 | 14% | 44 |
| kawigi.micro.Shiz 1.1 | 14 | 13% | 44 |
| kawigi.robot.Girl 1.2 | 14 | 13% | 21 |
| cb.nano.Insomnia 1.0 | 12 | 12% | 14 |
| divineomega.TrialBot 0.003 | 6 | 6% | 11 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 80.1 | 82 / 210 | 2.79 | 17.7% | 33243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.3 | 17.7% | 82 |
| gh.Griezel 0.5.2 | 1.7 | 16.8% | 69 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.5% | 34 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.7% | 1 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.3% | 7 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.8% | 3 |
| asd.Cthulhu 1.3 | 8.5 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.9% | 2 |
| repositorio.NanoStep 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 79.0 | 16 / 35 | 5892 |
| 2 | 1 | 68.3 | 79.7 | 14 / 35 | 5840 |
| 3 | 2 | 66.6 | 79.4 | 14 / 35 | 5099 |
| 4 | 1 | 67.3 | 82.9 | 11 / 35 | 5501 |
| 5 | 2 | 65.9 | 75.9 | 11 / 35 | 5325 |
| 6 | 1 | 68.3 | 83.8 | 16 / 35 | 5586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 68 | 53% |
| techdude.forest.FlamingForest 1.1 | 19 | 58% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 100% |
| stelo.IntrinsicVolatility 1.4 | 8 | 88% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| tvv.nano.Polaris 1.2 | 3 | 67% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 52 | 40% | 92 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 20% | 42 |
| techdude.forest.FlamingForest 1.1 | 19 | 15% | 28 |
| bvh.fnr.Fenrir 0.36l | 16 | 12% | 21 |
| tvv.nano.Polaris 1.2 | 8 | 6% | 9 |
| stelo.IntrinsicVolatility 1.4 | 3 | 2% | 8 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 6 |
| asd.Cthulhu 1.3 | 2 | 2% | 4 |

## Melee bench: F17

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.1 | 97 / 210 | 2.70 | 17.7% | 31483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.7% | 97 |
| cx.BlestPain 1.41 | 2.8 | 12.3% | 41 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.4% | 29 |
| et.Predator 1.8 | 3.7 | 12.2% | 17 |
| ahf.NanoAndrew .4 | 4.8 | 10.9% | 10 |
| nic.Nicator 2.4 | 5.2 | 10.9% | 12 |
| maribo.melee.BMV 0.1 | 6.8 | 9.5% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 78.4 | 18 / 35 | 5452 |
| 2 | 1 | 67.9 | 82.9 | 15 / 35 | 5521 |
| 3 | 1 | 67.2 | 80.6 | 14 / 35 | 5445 |
| 4 | 1 | 66.6 | 81.3 | 16 / 35 | 4960 |
| 5 | 1 | 65.7 | 77.1 | 13 / 35 | 5172 |
| 6 | 1 | 68.2 | 86.3 | 21 / 35 | 4933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 39 | 85% |
| oog.melee.Mercutio 1.0 | 28 | 86% |
| cx.BlestPain 1.41 | 23 | 48% |
| nic.Nicator 2.4 | 20 | 65% |
| ahf.NanoAndrew .4 | 15 | 87% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| tex.Longbot 0.4 | 1 | 0% |

Hadur died in 113 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 25% | 56 |
| cx.BlestPain 1.41 | 20 | 18% | 38 |
| et.Predator 1.8 | 17 | 15% | 39 |
| ahf.NanoAndrew .4 | 17 | 15% | 29 |
| nic.Nicator 2.4 | 16 | 14% | 30 |
| maribo.melee.BMV 0.1 | 12 | 11% | 15 |
| tex.Longbot 0.4 | 3 | 3% | 3 |

## Melee bench: F18

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.9 | 120 / 210 | 2.36 | 18.3% | 28889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.3% | 120 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.0% | 27 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.2% | 18 |
| uji.DBH 1.1 | 4.0 | 10.7% | 11 |
| ratosh.Nobo 0.21 | 5.0 | 9.9% | 6 |
| spinnercat.Robovirus 2.718 | 5.7 | 8.9% | 7 |
| sigterm.Sigterm 1.0 | 7.3 | 8.2% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 8.0% | 5 |
| stelo.WangRobot 1.0 | 9.2 | 6.3% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.8 | 20 / 35 | 4472 |
| 2 | 1 | 68.9 | 88.6 | 22 / 35 | 5117 |
| 3 | 1 | 64.8 | 77.8 | 17 / 35 | 4357 |
| 4 | 1 | 67.8 | 87.6 | 18 / 35 | 4905 |
| 5 | 1 | 69.2 | 89.2 | 23 / 35 | 5266 |
| 6 | 1 | 66.7 | 82.5 | 20 / 35 | 4772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 49 | 76% |
| agd.Mooserwirt2 2.7 | 26 | 73% |
| uji.DBH 1.1 | 19 | 84% |
| sigterm.Sigterm 1.0 | 17 | 94% |
| ratosh.Nobo 0.21 | 14 | 79% |
| stelo.WangRobot 1.0 | 10 | 90% |
| spinnercat.Robovirus 2.718 | 7 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 30 | 33% | 70 |
| uji.DBH 1.1 | 14 | 16% | 22 |
| agd.Mooserwirt2 2.7 | 9 | 10% | 37 |
| ratosh.Nobo 0.21 | 9 | 10% | 22 |
| spinnercat.Robovirus 2.718 | 8 | 9% | 15 |
| sigterm.Sigterm 1.0 | 6 | 7% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 6% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 6% | 6 |
| stelo.WangRobot 1.0 | 4 | 4% | 6 |

## Melee bench: F19

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.0 | 152 / 210 | 1.72 | 20.5% | 34427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.5% | 152 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.7% | 23 |
| mld.Infinity 2.2 | 2.8 | 13.9% | 27 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.9% | 2 |
| erdnis.Rover 0.3 | 4.7 | 10.4% | 1 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.3% | 3 |
| pac.ABC 2.1 | 7.5 | 7.1% | 2 |
| mbh.Mbh 0.1 | 7.7 | 6.6% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.6 | 28 / 35 | 5892 |
| 2 | 1 | 69.0 | 84.4 | 22 / 35 | 5216 |
| 3 | 1 | 72.7 | 96.5 | 29 / 35 | 6096 |
| 4 | 1 | 70.7 | 90.2 | 23 / 35 | 5748 |
| 5 | 1 | 71.9 | 93.7 | 25 / 35 | 5852 |
| 6 | 1 | 71.2 | 92.7 | 25 / 35 | 5623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 83 | 89% |
| mld.Infinity 2.2 | 48 | 92% |
| krillr.mini.JointStrike 2.0.0 | 11 | 91% |
| pac.ABC 2.1 | 9 | 89% |
| erdnis.Rover 0.3 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 83% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 29 | 50% | 89 |
| mld.Infinity 2.2 | 13 | 22% | 63 |
| krillr.mini.JointStrike 2.0.0 | 7 | 12% | 20 |
| patson.PatsonTestBot 1.0 | 3 | 5% | 11 |
| erdnis.Rover 0.3 | 3 | 5% | 8 |
| pbg.R2D2 1.0 | 1 | 2% | 7 |
| mbh.Mbh 0.1 | 1 | 2% | 6 |
| pac.ABC 2.1 | 1 | 2% | 6 |

## Melee bench: F20

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.0 | 120 / 210 | 2.17 | 19.6% | 35772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.6% | 120 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.8% | 47 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.6% | 4 |
| fwb.Nine 1.0.1 | 3.8 | 11.0% | 13 |
| catcat20.Rabbit 0.001 | 4.3 | 10.1% | 20 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.8% | 0 |
| bayen.nut.Squirrel 1.615 | 6.7 | 7.9% | 4 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 7.2% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.0 | 20 / 35 | 5703 |
| 2 | 1 | 71.3 | 90.2 | 23 / 35 | 6583 |
| 3 | 1 | 70.0 | 89.5 | 18 / 35 | 6162 |
| 4 | 1 | 68.6 | 84.4 | 20 / 35 | 5598 |
| 5 | 1 | 70.3 | 89.2 | 22 / 35 | 6084 |
| 6 | 1 | 67.7 | 82.9 | 17 / 35 | 5642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 71% |
| catcat20.Rabbit 0.001 | 23 | 78% |
| fwb.Nine 1.0.1 | 23 | 83% |
| nz.jdc.nano.GridFu 1.0 | 20 | 95% |
| bayen.nut.Squirrel 1.615 | 9 | 89% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 44 | 49% | 87 |
| catcat20.Rabbit 0.001 | 13 | 14% | 36 |
| nz.jdc.nano.GridFu 1.0 | 11 | 12% | 33 |
| fwb.Nine 1.0.1 | 10 | 11% | 13 |
| bayen.nut.Squirrel 1.615 | 5 | 6% | 13 |
| m3thos.mini.Eva01 0.5.5 | 4 | 4% | 13 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 8 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F21

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.7 | 141 / 210 | 1.57 | 20.8% | 36060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.8% | 141 |
| eem.EvBot v4.6.16 | 2.0 | 15.2% | 48 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 8 |
| eld.Hmm 1.0 | 5.5 | 8.2% | 4 |
| oa.weak.BotherBot 0.1 | 6.0 | 8.0% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.7% | 0 |
| el.JumpShoot 0.2 | 7.3 | 6.2% | 1 |
| PSW.Relentless 0.1 | 9.0 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 95.6 | 27 / 35 | 5997 |
| 2 | 1 | 71.5 | 92.4 | 21 / 35 | 6384 |
| 3 | 1 | 70.6 | 92.1 | 18 / 35 | 6190 |
| 4 | 1 | 69.6 | 88.9 | 19 / 35 | 5676 |
| 5 | 1 | 72.7 | 97.8 | 30 / 35 | 5985 |
| 6 | 1 | 71.6 | 95.6 | 26 / 35 | 5828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 94 | 67% |
| dummy.mini.Scimitar 1.01 | 48 | 90% |
| cf.RiO.RiOx 4.2.1 | 20 | 90% |
| eld.Hmm 1.0 | 13 | 77% |
| oa.weak.BotherBot 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1283. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 38 | 54% | 85 |
| dummy.mini.Scimitar 1.01 | 13 | 19% | 63 |
| cf.RiO.RiOx 4.2.1 | 11 | 16% | 25 |
| eld.Hmm 1.0 | 3 | 4% | 18 |
| el.JumpShoot 0.2 | 3 | 4% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 11 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.1 | 87 / 210 | 2.43 | 17.9% | 32115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 17.9% | 87 |
| pe.SandboxDT 2.71m | 2.0 | 15.8% | 59 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.6% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.0% | 26 |
| bigpete.Stewie 1.0 | 5.0 | 11.0% | 10 |
| yk.JahRoslav 1.1 | 6.8 | 6.9% | 1 |
| tad.Dalek98 0.98 | 7.2 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 18 / 35 | 5493 |
| 2 | 1 | 66.8 | 81.6 | 15 / 35 | 5105 |
| 3 | 1 | 68.6 | 84.4 | 16 / 35 | 5481 |
| 4 | 1 | 68.4 | 84.8 | 15 / 35 | 5425 |
| 5 | 2 | 66.4 | 82.2 | 7 / 35 | 5254 |
| 6 | 1 | 68.2 | 82.9 | 16 / 35 | 5357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 44 | 82% |
| pe.SandboxDT 2.71m | 39 | 49% |
| jlm.javaDisturbance 0.59 | 31 | 74% |
| bigpete.Stewie 1.0 | 7 | 57% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 50 | 40% | 77 |
| jlm.javaDisturbance 0.59 | 31 | 25% | 51 |
| kvk.HebusLeTroll 0.35 | 28 | 23% | 54 |
| bigpete.Stewie 1.0 | 9 | 7% | 15 |
| gg.Squaraus 0.6 | 2 | 2% | 3 |
| tad.Dalek98 0.98 | 2 | 2% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.8 | 115 / 210 | 2.01 | 19.2% | 32302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.2% | 115 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 57 |
| cre.Karolos 0.32 | 3.0 | 14.2% | 23 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.7% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.2% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 8.9% | 4 |
| cw.megas.Blade 0.8 | 7.2 | 8.1% | 0 |
| sample.Walls 1.0 | 7.3 | 8.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 19 / 35 | 5365 |
| 2 | 1 | 70.5 | 88.3 | 19 / 35 | 5509 |
| 3 | 1 | 70.0 | 87.3 | 18 / 35 | 5545 |
| 4 | 1 | 70.4 | 89.8 | 23 / 35 | 5302 |
| 5 | 1 | 69.1 | 87.9 | 19 / 35 | 5106 |
| 6 | 1 | 69.7 | 87.9 | 17 / 35 | 5475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 79 | 58% |
| cre.Karolos 0.32 | 37 | 73% |
| stelo.AreaTargetingBot 1.1 | 25 | 92% |
| sample.Walls 1.0 | 12 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 51 | 54% | 97 |
| cre.Karolos 0.32 | 26 | 27% | 52 |
| stelo.AreaTargetingBot 1.1 | 9 | 9% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 5% | 10 |
| stelo.RamTrackSurfer 1.2 | 3 | 3% | 14 |
| cw.megas.Blade 0.8 | 1 | 1% | 3 |
| sample.Walls 1.0 | 0 | 0% | 10 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 70.7 | 53 / 210 | 3.63 | 14.3% | 22700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 2.2 | 14.3% | 53 |
| florent.XSeries.X2 0.12 | 2.3 | 14.1% | 49 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.8% | 41 |
| davidalves.Phoenix 0.54 | 3.3 | 13.3% | 41 |
| pedersen.Ugluk 1.1.1 | 4.3 | 12.1% | 21 |
| oog.melee.Corsair 1.0 | 6.0 | 9.3% | 2 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 7.4% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 0 |
| evd.X1 0.01 | 9.2 | 4.6% | 0 |
| as.FrankTheTank 1.3 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 68.3 | 10 / 35 | 3871 |
| 2 | 1 | 63.4 | 76.2 | 9 / 35 | 3992 |
| 3 | 4 | 59.2 | 65.1 | 5 / 35 | 3441 |
| 4 | 1 | 62.6 | 73.0 | 10 / 35 | 3984 |
| 5 | 4 | 58.7 | 64.4 | 4 / 35 | 3551 |
| 6 | 1 | 64.3 | 77.5 | 15 / 35 | 3861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 21 | 71% |
| davidalves.Phoenix 0.54 | 20 | 35% |
| rz.GlowBlowMelee 1.4 | 16 | 50% |
| pedersen.Ugluk 1.1.1 | 16 | 81% |
| stelo.SoJNanoMelee 1.1 | 8 | 88% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 34 | 22% | 49 |
| rz.GlowBlowMelee 1.4 | 34 | 22% | 46 |
| davidalves.Phoenix 0.54 | 32 | 20% | 37 |
| pedersen.Ugluk 1.1.1 | 25 | 16% | 32 |
| oog.melee.Corsair 1.0 | 11 | 7% | 18 |
| stelo.SoJNanoMelee 1.1 | 10 | 6% | 13 |
| evd.X1 0.01 | 5 | 3% | 5 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 6 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |

## Melee bench: F25

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.2 | 131 / 210 | 2.42 | 18.6% | 27834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.6% | 131 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.1% | 18 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.7% | 21 |
| jdw.Hurricane 1.4 | 3.5 | 11.8% | 19 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 8.9% | 8 |
| ds.Oo 2.2 | 6.0 | 8.7% | 6 |
| awesomeness.Elite 1.0 | 7.0 | 7.9% | 3 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.2% | 2 |
| adt.Ar2 1.1 | 8.3 | 6.7% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.0 | 23 / 35 | 4734 |
| 2 | 1 | 69.6 | 88.6 | 24 / 35 | 4946 |
| 3 | 1 | 68.3 | 86.0 | 23 / 35 | 4515 |
| 4 | 1 | 67.0 | 82.5 | 20 / 35 | 4597 |
| 5 | 1 | 66.9 | 78.7 | 21 / 35 | 4593 |
| 6 | 1 | 67.2 | 83.2 | 20 / 35 | 4449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 45 | 87% |
| voidious.micro.BlitzBat 1.05 | 42 | 93% |
| jdw.Hurricane 1.4 | 31 | 90% |
| gre.svman4.Morfeas 1.4.1 | 8 | 50% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| amk.ChumbaMini 0.2 | 4 | 100% |
| ds.Oo 2.2 | 3 | 67% |
| adt.Ar2 1.1 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 19 | 24% | 32 |
| voidious.micro.BlitzBat 1.05 | 16 | 20% | 58 |
| voidious.mini.BrokenSword 2.0.3 | 14 | 18% | 48 |
| gre.svman4.Morfeas 1.4.1 | 11 | 14% | 19 |
| ds.Oo 2.2 | 9 | 11% | 22 |
| gjr.Cephalosporin 0.1 | 4 | 5% | 12 |
| awesomeness.Elite 1.0 | 3 | 4% | 8 |
| adt.Ar2 1.1 | 2 | 3% | 8 |
| amk.ChumbaMini 0.2 | 1 | 1% | 3 |

## Melee bench: F26

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.6 | 100 / 210 | 2.39 | 18.1% | 32976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.1% | 100 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 49 |
| shu.nitro.LENIN .T34 | 3.5 | 12.7% | 30 |
| lrem.Spectre 0.4.4 | 3.7 | 12.2% | 21 |
| js.PinBall 1.6 | 4.8 | 11.2% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.0% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 8.7% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.8 | 17 / 35 | 5509 |
| 2 | 1 | 68.5 | 83.5 | 19 / 35 | 5847 |
| 3 | 1 | 67.7 | 84.8 | 15 / 35 | 5226 |
| 4 | 1 | 67.2 | 82.5 | 13 / 35 | 5150 |
| 5 | 1 | 69.5 | 88.6 | 19 / 35 | 5638 |
| 6 | 1 | 67.9 | 84.1 | 17 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 45 | 69% |
| lrem.Spectre 0.4.4 | 36 | 67% |
| shu.nitro.LENIN .T34 | 27 | 78% |
| js.PinBall 1.6 | 12 | 92% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 46 | 42% | 75 |
| lrem.Spectre 0.4.4 | 27 | 25% | 46 |
| shu.nitro.LENIN .T34 | 20 | 18% | 51 |
| js.PinBall 1.6 | 10 | 9% | 22 |
| gh.mini.GrubbmOne 1.0 | 5 | 5% | 6 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 2% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 2 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |

## Melee bench: F27

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.5 | 130 / 210 | 2.21 | 19.1% | 30955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.1% | 130 |
| mk.Alpha 0.2.1 | 2.2 | 12.9% | 33 |
| wee.Gem 1.8.4 | 3.5 | 10.8% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.3% | 20 |
| EH.Eagle 1.0.6 | 4.3 | 10.6% | 3 |
| joe.ADinosaur 1.0 | 6.3 | 9.2% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.9% | 3 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.7% | 2 |
| caimano.Furia_Ceca 0.22 | 9.2 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.5 | 22 / 35 | 4568 |
| 2 | 1 | 69.6 | 89.5 | 25 / 35 | 4987 |
| 3 | 1 | 69.0 | 80.6 | 20 / 35 | 6022 |
| 4 | 1 | 68.0 | 87.6 | 18 / 35 | 4860 |
| 5 | 1 | 69.2 | 82.9 | 20 / 35 | 5786 |
| 6 | 1 | 68.7 | 88.9 | 25 / 35 | 4732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 57 | 79% |
| EH.Eagle 1.0.6 | 24 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 23 | 78% |
| wee.Gem 1.8.4 | 23 | 87% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 28 | 35% | 65 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 25% | 32 |
| wee.Gem 1.8.4 | 10 | 12% | 40 |
| joe.ADinosaur 1.0 | 8 | 10% | 10 |
| throxbot.ThroxBot 0.1 | 5 | 6% | 13 |
| EH.Eagle 1.0.6 | 4 | 5% | 32 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 15 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.5 | 129 / 210 | 2.03 | 19.0% | 28548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.0% | 129 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 41 |
| uji.Antique 1.0 | 3.3 | 11.4% | 21 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 11.2% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 1 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 4 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.9% | 6 |
| matt.advanced.Katana 1.0 | 8.5 | 6.0% | 0 |
| stelo.PianistNano 1.2 | 8.7 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.9 | 20 / 35 | 4587 |
| 2 | 1 | 69.1 | 91.1 | 22 / 35 | 4806 |
| 3 | 1 | 69.2 | 90.2 | 22 / 35 | 4824 |
| 4 | 1 | 68.1 | 87.9 | 20 / 35 | 4637 |
| 5 | 1 | 69.1 | 87.6 | 23 / 35 | 5098 |
| 6 | 1 | 68.1 | 86.3 | 22 / 35 | 4596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 84 | 75% |
| uji.Antique 1.0 | 41 | 78% |
| qohnil.blot.BlotBot 3.61 | 14 | 79% |
| ahr.ice.Ice 1.0.2 | 11 | 73% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| amk.ChumbaWumba 0.3 | 7 | 71% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 30 | 37% | 78 |
| uji.Antique 1.0 | 15 | 19% | 47 |
| amk.ChumbaWumba 0.3 | 8 | 10% | 14 |
| qohnil.blot.BlotBot 3.61 | 7 | 9% | 31 |
| pfvicm.Sobieski 7.2.3b | 7 | 9% | 15 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 11 |
| stelo.PianistNano 1.2 | 4 | 5% | 5 |
| matt.advanced.Katana 1.0 | 4 | 5% | 5 |
| stelo.Lifestealer 1.0 | 2 | 2% | 4 |

## Melee bench: F29

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.4 | 76 / 210 | 2.58 | 17.8% | 30721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.8% | 76 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.6% | 58 |
| deewiant.Anomaly 0.2 | 2.7 | 14.6% | 57 |
| myl.micro.Troodon 1.10 | 4.0 | 11.8% | 7 |
| jok.PheonixM 0.1.2 | 5.0 | 10.4% | 5 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.3% | 2 |
| DBall.Anarchy 0.1 | 6.8 | 7.3% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.7% | 0 |
| jangs.ns51 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.8 | 13 / 35 | 5160 |
| 2 | 1 | 69.3 | 85.4 | 14 / 35 | 5667 |
| 3 | 1 | 68.0 | 83.5 | 14 / 35 | 5134 |
| 4 | 1 | 66.0 | 79.0 | 12 / 35 | 4606 |
| 5 | 1 | 67.7 | 83.8 | 11 / 35 | 5106 |
| 6 | 1 | 66.7 | 79.0 | 12 / 35 | 5048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 41% |
| zyx.mega.YersiniaPestis 3.1 | 44 | 45% |
| myl.micro.Troodon 1.10 | 21 | 100% |
| jok.PheonixM 0.1.2 | 9 | 89% |
| DBall.Anarchy 0.1 | 7 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 0% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 56 | 42% | 77 |
| zyx.mega.YersiniaPestis 3.1 | 38 | 28% | 57 |
| myl.micro.Troodon 1.10 | 19 | 14% | 36 |
| jok.PheonixM 0.1.2 | 15 | 11% | 22 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 4 |
| ph.melee.ArcherME 0.3 | 2 | 1% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 12 |

## Melee bench: F30

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 66.5 | 37 / 210 | 4.01 | 13.4% | 22839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.3 | 14.3% | 59 |
| hadur117.mini.DeiseW 0.2 | 2.3 | 13.4% | 37 |
| oog.melee.Capulet 1.2 | 2.8 | 13.8% | 39 |
| catcat20.Matcha 0.006 | 3.7 | 13.1% | 39 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.8% | 21 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.2% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.9% | 8 |
| ntc.Opposite 1.5 | 7.5 | 7.4% | 0 |
| tripphippy.Alice 1.1 | 8.7 | 6.5% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 66.7 | 7 / 35 | 3995 |
| 2 | 3 | 59.1 | 62.9 | 6 / 35 | 3651 |
| 3 | 2 | 61.1 | 70.5 | 8 / 35 | 3699 |
| 4 | 5 | 57.5 | 58.7 | 4 / 35 | 3701 |
| 5 | 1 | 61.5 | 70.8 | 6 / 35 | 3858 |
| 6 | 1 | 61.3 | 69.5 | 6 / 35 | 3935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.PastFuture 2.3.2 | 14 | 79% |
| darkcanuck.B26354 1.06 | 12 | 33% |
| oog.melee.Capulet 1.2 | 12 | 67% |
| catcat20.Matcha 0.006 | 12 | 58% |
| intruder.PrairieWolf 2.61 | 5 | 60% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 46 | 26% | 50 |
| stelo.PastFuture 2.3.2 | 33 | 19% | 44 |
| catcat20.Matcha 0.006 | 32 | 18% | 39 |
| oog.melee.Capulet 1.2 | 30 | 17% | 39 |
| ntc.Opposite 1.5 | 13 | 7% | 13 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 8 |
| tripphippy.Alice 1.1 | 5 | 3% | 6 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 70.4 | 48 / 210 | 3.67 | 14.4% | 23093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.3% | 93 |
| hadur117.mini.DeiseW 0.2 | 2.3 | 14.4% | 48 |
| gh.mini.Griezel 0.2 | 2.7 | 13.6% | 53 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.0% | 10 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.1% | 5 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.0% | 1 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.0% | 1 |
| fm.mammillarias 1.3 | 8.0 | 6.3% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 72.7 | 11 / 35 | 3966 |
| 2 | 3 | 60.1 | 64.1 | 7 / 35 | 3843 |
| 3 | 3 | 60.9 | 67.6 | 8 / 35 | 3884 |
| 4 | 2 | 63.0 | 73.7 | 7 / 35 | 4117 |
| 5 | 2 | 61.0 | 69.5 | 8 / 35 | 3484 |
| 6 | 2 | 62.9 | 74.6 | 7 / 35 | 3799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 33 | 27% |
| gh.mini.Griezel 0.2 | 26 | 38% |
| spinnercat.micro.Tyger 0.1 | 15 | 87% |
| d414.nano.Quantum 1.0.0 | 13 | 92% |
| fm.mammillarias 1.3 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 35% | 70 |
| gh.mini.Griezel 0.2 | 44 | 27% | 58 |
| spinnercat.micro.Tyger 0.1 | 20 | 12% | 25 |
| d414.nano.Quantum 1.0.0 | 15 | 9% | 26 |
| gh.nano.Grofvuil 0.2 | 12 | 7% | 14 |
| timmit.nano.TimDog 0.33 | 9 | 6% | 11 |
| fm.mammillarias 1.3 | 4 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.0 | 103 / 210 | 2.26 | 18.1% | 29375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.1% | 103 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 56 |
| apc.botM 3.0 | 3.3 | 11.4% | 22 |
| lxx.ConceptA 0.8 | 4.5 | 10.6% | 6 |
| vjik.UnViolation 1.1 | 5.0 | 9.7% | 9 |
| bayen.UbaMicro 1.4 | 5.2 | 9.6% | 8 |
| panzer.Panzer 0.2 | 7.2 | 7.8% | 2 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 2 |
| conscience.Electron 1.3g | 9.0 | 6.0% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 93.3 | 21 / 35 | 5202 |
| 2 | 1 | 65.8 | 81.6 | 15 / 35 | 4611 |
| 3 | 1 | 66.7 | 84.4 | 17 / 35 | 4653 |
| 4 | 1 | 67.5 | 84.8 | 17 / 35 | 5365 |
| 5 | 1 | 66.9 | 86.0 | 17 / 35 | 4708 |
| 6 | 1 | 67.1 | 85.7 | 16 / 35 | 4836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 79 | 51% |
| apc.botM 3.0 | 23 | 74% |
| bayen.UbaMicro 1.4 | 18 | 72% |
| lxx.ConceptA 0.8 | 17 | 82% |
| vjik.UnViolation 1.1 | 8 | 88% |
| panzer.Panzer 0.2 | 7 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| yk.JahMicro 1.0 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 53 | 50% | 97 |
| lxx.ConceptA 0.8 | 18 | 17% | 29 |
| apc.botM 3.0 | 16 | 15% | 42 |
| bayen.UbaMicro 1.4 | 11 | 10% | 16 |
| vjik.UnViolation 1.1 | 4 | 4% | 17 |
| panzer.Panzer 0.2 | 3 | 3% | 4 |
| yk.JahMicro 1.0 | 1 | 1% | 3 |
| conscience.Electron 1.3g | 1 | 1% | 1 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F33

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.0 | 106 / 210 | 2.44 | 18.3% | 30407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.3% | 106 |
| maribo.Quester 0.3 | 2.0 | 16.0% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.6% | 24 |
| labg.Cataclysm 2.05 | 4.3 | 10.9% | 17 |
| gre.svman4.Leonidas 1.3.2 | 5.0 | 10.7% | 11 |
| baal.nano.N 1.42 | 6.0 | 9.1% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.2% | 4 |
| zyx.micro.Ant 1.1 | 8.2 | 5.4% | 0 |
| sanja.First 0.1 | 9.3 | 4.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.6 | 23 / 35 | 5622 |
| 2 | 1 | 67.3 | 81.6 | 14 / 35 | 4980 |
| 3 | 1 | 68.3 | 85.7 | 19 / 35 | 4864 |
| 4 | 1 | 68.1 | 83.5 | 17 / 35 | 5097 |
| 5 | 1 | 68.2 | 83.8 | 18 / 35 | 5115 |
| 6 | 1 | 67.1 | 81.9 | 15 / 35 | 4729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 49 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 80% |
| gre.svman4.Leonidas 1.3.2 | 27 | 89% |
| labg.Cataclysm 2.05 | 12 | 58% |
| baal.nano.N 1.42 | 6 | 83% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 50% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 39 | 38% | 80 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 24% | 54 |
| labg.Cataclysm 2.05 | 17 | 16% | 25 |
| gre.svman4.Leonidas 1.3.2 | 12 | 12% | 32 |
| baal.nano.N 1.42 | 4 | 4% | 9 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 4% | 5 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
| sanja.First 0.1 | 1 | 1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.6 | 70 / 210 | 2.56 | 17.1% | 29549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 17.1% | 70 |
| stelo.Spread 0.9 | 2.0 | 16.9% | 78 |
| kid.Gladiator .7.2 | 2.8 | 15.7% | 41 |
| tcf.Reach 3 | 4.7 | 10.3% | 3 |
| jcs.Seth 1.8 | 4.7 | 11.0% | 13 |
| cli.Dancer 1.1 | 5.7 | 9.9% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.6 | 14 / 35 | 5028 |
| 2 | 1 | 65.9 | 81.0 | 11 / 35 | 4550 |
| 3 | 2 | 66.8 | 81.0 | 10 / 35 | 5033 |
| 4 | 1 | 67.8 | 84.1 | 14 / 35 | 4929 |
| 5 | 1 | 68.3 | 86.0 | 12 / 35 | 5252 |
| 6 | 1 | 66.7 | 83.2 | 9 / 35 | 4757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 62 | 48% |
| kid.Gladiator .7.2 | 41 | 59% |
| jcs.Seth 1.8 | 12 | 67% |
| tcf.Reach 3 | 4 | 50% |
| cli.Dancer 1.1 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 60 | 43% | 92 |
| kid.Gladiator .7.2 | 48 | 34% | 70 |
| jcs.Seth 1.8 | 12 | 9% | 20 |
| tcf.Reach 3 | 9 | 6% | 12 |
| ratosh.Wesco 1.4 | 5 | 4% | 8 |
| cli.Dancer 1.1 | 5 | 4% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 75.7 | 29 / 210 | 3.19 | 14.6% | 22040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 154 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 14.6% | 29 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.0% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.5% | 9 |
| rz.HawkOnFire 0.1 | 4.7 | 11.5% | 3 |
| wit.Chuliath 1.0 | 6.5 | 6.9% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 7.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 76.8 | 9 / 35 | 3640 |
| 2 | 2 | 64.0 | 80.0 | 7 / 35 | 3556 |
| 3 | 2 | 62.1 | 73.3 | 1 / 35 | 3770 |
| 4 | 2 | 60.8 | 69.8 | 4 / 35 | 3656 |
| 5 | 2 | 62.5 | 74.9 | 4 / 35 | 3520 |
| 6 | 2 | 63.5 | 79.0 | 4 / 35 | 3898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 72 | 13% |
| gh.mini.Gruwel 0.9 | 9 | 67% |
| rz.HawkOnFire 0.1 | 8 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 67% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 98 | 54% | 106 |
| gh.mini.Gruwel 0.9 | 31 | 17% | 40 |
| rz.HawkOnFire 0.1 | 24 | 13% | 29 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 9% | 20 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 4% | 8 |
| wit.Chuliath 1.0 | 2 | 1% | 4 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 3 |

## Melee bench: F36

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.2 | 158 / 210 | 1.79 | 20.6% | 33457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.6% | 158 |
| bzdp.Pansy 2.1 | 2.5 | 11.8% | 11 |
| alpha.RainingFire 1.0 | 2.8 | 11.8% | 16 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 11 |
| mz.Cork 0.1 | 4.7 | 10.3% | 6 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.3% | 3 |
| m3thos.Eva02 0.7.1 | 6.8 | 8.8% | 0 |
| dl.BetterWalls 1.0 | 8.3 | 6.3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.0% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 96.5 | 27 / 35 | 5910 |
| 2 | 1 | 70.9 | 92.7 | 28 / 35 | 5446 |
| 3 | 1 | 70.0 | 88.6 | 24 / 35 | 5491 |
| 4 | 1 | 69.9 | 88.3 | 25 / 35 | 5376 |
| 5 | 1 | 68.9 | 85.7 | 25 / 35 | 5166 |
| 6 | 1 | 72.1 | 95.6 | 29 / 35 | 6068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 87% |
| bvh.micro.Freya 0.3 | 30 | 90% |
| alpha.RainingFire 1.0 | 28 | 89% |
| bvh.mini.Fenrir 0.39 | 21 | 100% |
| mz.Cork 0.1 | 20 | 100% |
| m3thos.Eva02 0.7.1 | 13 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| dl.BetterWalls 1.0 | 5 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 17 | 33% | 42 |
| bvh.micro.Freya 0.3 | 13 | 25% | 35 |
| bzdp.Pansy 2.1 | 10 | 19% | 56 |
| dl.BetterWalls 1.0 | 4 | 8% | 10 |
| mz.Cork 0.1 | 3 | 6% | 28 |
| bvh.mini.Fenrir 0.39 | 3 | 6% | 14 |
| m3thos.Eva02 0.7.1 | 2 | 4% | 19 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.6 | 158 / 210 | 2.12 | 19.1% | 32919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.1% | 158 |
| germ.TheMind .2 | 2.5 | 11.0% | 14 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.5% | 8 |
| EBBU.Sim2 1.02 | 4.2 | 10.3% | 4 |
| agrach.Dalek 1.0 | 5.3 | 9.2% | 9 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.9% | 6 |
| lmk.ACPFinal 0.1 | 7.7 | 8.0% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 7.9% | 0 |
| skm.Ryubot 1.0 | 8.5 | 7.4% | 2 |
| mb.Beast 0.1 | 8.8 | 7.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 80.6 | 22 / 35 | 5043 |
| 2 | 1 | 66.7 | 84.4 | 23 / 35 | 5351 |
| 3 | 1 | 67.6 | 85.7 | 26 / 35 | 5189 |
| 4 | 1 | 67.1 | 83.2 | 24 / 35 | 5702 |
| 5 | 1 | 70.5 | 94.6 | 32 / 35 | 5868 |
| 6 | 1 | 70.7 | 96.8 | 31 / 35 | 5766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 39 | 97% |
| germ.TheMind .2 | 26 | 92% |
| stelo.UntouchableNano 1.3 | 25 | 92% |
| agrach.Dalek 1.0 | 22 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 100% |
| mb.Beast 0.1 | 15 | 100% |
| lmk.ACPFinal 0.1 | 10 | 90% |
| skm.Ryubot 1.0 | 10 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 11 | 21% | 35 |
| lmk.ACPFinal 0.1 | 11 | 21% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 13% | 40 |
| stelo.UntouchableNano 1.3 | 7 | 13% | 22 |
| EBBU.Sim2 1.02 | 6 | 11% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 9% | 10 |
| agrach.Dalek 1.0 | 3 | 6% | 22 |
| mb.Beast 0.1 | 3 | 6% | 15 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |

## Melee bench: F38

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 77.8 | 74 / 210 | 3.00 | 16.1% | 25893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.3 | 16.1% | 74 |
| justin.Mallais 14.0 | 1.7 | 15.9% | 73 |
| bvh.mini.Freya 0.55 | 3.3 | 12.6% | 20 |
| bts.mega.Gnarly 1.4 | 5.0 | 11.0% | 19 |
| cs.Wren 1.0 | 5.0 | 10.9% | 13 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.1% | 4 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.1% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.7% | 1 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.7% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 80.3 | 13 / 35 | 4516 |
| 2 | 1 | 66.8 | 81.9 | 19 / 35 | 4382 |
| 3 | 2 | 64.8 | 80.0 | 10 / 35 | 4217 |
| 4 | 2 | 62.9 | 72.7 | 9 / 35 | 4078 |
| 5 | 1 | 64.2 | 75.2 | 11 / 35 | 4503 |
| 6 | 1 | 64.3 | 76.5 | 12 / 35 | 4197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 35 | 60% |
| cs.Wren 1.0 | 16 | 81% |
| bvh.mini.Freya 0.55 | 14 | 64% |
| bts.mega.Gnarly 1.4 | 13 | 85% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 92% |
| kdf.KoulDestroyer 1.0 | 7 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 43 | 32% | 68 |
| bvh.mini.Freya 0.55 | 28 | 21% | 33 |
| bts.mega.Gnarly 1.4 | 20 | 15% | 31 |
| cs.Wren 1.0 | 19 | 14% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 8% | 28 |
| kdf.KoulDestroyer 1.0 | 8 | 6% | 13 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 4 |
| bzdp.BoxCar 2.0 | 2 | 1% | 3 |

## Melee bench: F39

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.5 | 77 / 210 | 2.76 | 17.1% | 30655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 17.1% | 77 |
| bvh.fry.Freya 0.82 | 1.8 | 15.0% | 36 |
| az.Ololobot 0.2.4 | 3.0 | 12.7% | 51 |
| catcat20.Lambda 0.024 | 4.0 | 10.7% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.1% | 18 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.3% | 1 |
| gimp.GimpBot 0.1 | 6.8 | 8.3% | 3 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 8.3% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.5 | 13 / 35 | 5222 |
| 2 | 1 | 66.5 | 81.9 | 16 / 35 | 5227 |
| 3 | 1 | 64.0 | 76.2 | 7 / 35 | 5057 |
| 4 | 2 | 63.6 | 73.7 | 10 / 35 | 4770 |
| 5 | 1 | 66.6 | 82.5 | 13 / 35 | 5285 |
| 6 | 1 | 67.5 | 86.0 | 18 / 35 | 5094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 37 | 68% |
| az.Ololobot 0.2.4 | 37 | 38% |
| catcat20.Lambda 0.024 | 24 | 71% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 69% |
| gimp.GimpBot 0.1 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 41 | 31% | 69 |
| az.Ololobot 0.2.4 | 29 | 22% | 46 |
| catcat20.Lambda 0.024 | 20 | 15% | 33 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 14% | 23 |
| apollokidd.ApolloKidd 0.9 | 14 | 11% | 16 |
| gimp.GimpBot 0.1 | 7 | 5% | 13 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |

## Melee bench: F40

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.7 | 94 / 210 | 2.38 | 18.3% | 30644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.3% | 94 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 15.2% | 57 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 11.8% | 25 |
| mz.AntiGrav 1.0 | 4.5 | 10.5% | 6 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.3% | 11 |
| alpha.BlackIce 1.0 | 6.2 | 9.3% | 4 |
| stelo.Randomness 1.0 | 6.3 | 9.3% | 12 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.2% | 1 |
| sample.Corners 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.1 | 13 / 35 | 4741 |
| 2 | 1 | 67.2 | 81.0 | 15 / 35 | 5363 |
| 3 | 1 | 69.7 | 90.8 | 18 / 35 | 5373 |
| 4 | 1 | 68.8 | 87.0 | 19 / 35 | 5232 |
| 5 | 1 | 68.5 | 86.0 | 17 / 35 | 5303 |
| 6 | 1 | 65.2 | 78.1 | 12 / 35 | 4632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 49% |
| kano.gamma.KanoGamma 1.8 | 32 | 56% |
| Polkwane.SmashMelee 1.0 | 19 | 84% |
| mz.AntiGrav 1.0 | 16 | 100% |
| stelo.Randomness 1.0 | 11 | 55% |
| alpha.BlackIce 1.0 | 7 | 86% |
| sample.Corners 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 52 | 45% | 70 |
| kano.gamma.KanoGamma 1.8 | 29 | 25% | 52 |
| stelo.Randomness 1.0 | 10 | 9% | 22 |
| mz.AntiGrav 1.0 | 8 | 7% | 25 |
| Polkwane.SmashMelee 1.0 | 7 | 6% | 17 |
| alpha.BlackIce 1.0 | 7 | 6% | 15 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 3 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 4 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.4 | 87 / 210 | 2.58 | 17.3% | 27640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 17.3% | 87 |
| eem.EvBotNG v12.8 | 2.0 | 15.6% | 70 |
| ary.Swarm 1.1 | 3.3 | 13.3% | 17 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 13.0% | 21 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.4% | 12 |
| shrub.Silver v048 | 6.0 | 8.9% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.9% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.5 | 16 / 35 | 4498 |
| 2 | 1 | 66.7 | 83.5 | 13 / 35 | 4490 |
| 3 | 2 | 66.3 | 80.6 | 12 / 35 | 4769 |
| 4 | 1 | 67.6 | 83.8 | 14 / 35 | 4780 |
| 5 | 1 | 68.4 | 85.4 | 17 / 35 | 4954 |
| 6 | 1 | 65.7 | 78.7 | 15 / 35 | 4149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 43% |
| ary.Swarm 1.1 | 29 | 83% |
| lessonz.robocode.Oz 0.5.0 | 24 | 75% |
| simonton.nano.MeleeSeed 1.8 | 17 | 88% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| stelo.Mirror 1.1 | 1 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 40% | 73 |
| lessonz.robocode.Oz 0.5.0 | 24 | 19% | 38 |
| ary.Swarm 1.1 | 21 | 17% | 42 |
| simonton.nano.MeleeSeed 1.8 | 17 | 14% | 33 |
| shrub.Silver v048 | 5 | 4% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 7 |
| zyx.nano.Ant 1.1 | 3 | 2% | 5 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.3 | 98 / 210 | 2.50 | 17.8% | 31117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.8% | 98 |
| wompi.Wallaby 5.1 | 2.0 | 15.7% | 55 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.5% | 25 |
| ara.Shera 0.88 | 3.7 | 13.0% | 25 |
| amz.NanoClone 1.41 | 5.2 | 9.0% | 1 |
| maribo.IotaCT 1.1 | 6.0 | 7.7% | 2 |
| dsw.StaticD 1.0 | 7.0 | 6.9% | 4 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.2% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 18 / 35 | 5717 |
| 2 | 1 | 66.7 | 81.0 | 18 / 35 | 4937 |
| 3 | 1 | 66.6 | 83.8 | 16 / 35 | 4796 |
| 4 | 1 | 67.3 | 83.2 | 18 / 35 | 5082 |
| 5 | 1 | 67.3 | 83.2 | 15 / 35 | 5597 |
| 6 | 1 | 66.2 | 80.3 | 13 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 47 | 87% |
| maribo.mini.MiniQuester 0.1 | 34 | 79% |
| ara.Shera 0.88 | 32 | 69% |
| dsw.StaticD 1.0 | 6 | 83% |
| amz.NanoClone 1.41 | 2 | 50% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 32% | 77 |
| ara.Shera 0.88 | 36 | 32% | 59 |
| maribo.mini.MiniQuester 0.1 | 25 | 22% | 47 |
| dsw.StaticD 1.0 | 4 | 4% | 9 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 3% | 4 |
| amz.NanoClone 1.41 | 3 | 3% | 4 |
| maribo.IotaCT 1.1 | 2 | 2% | 4 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 71.6 | 33 / 210 | 3.56 | 14.1% | 22586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 150 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 14.1% | 33 |
| brainfade.melee.Dusk 0.44 | 3.8 | 12.0% | 16 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.6% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.3% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.5% | 1 |
| jab.DiamondStealer 5 | 7.2 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.8% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 79.0 | 7 / 35 | 3837 |
| 2 | 2 | 60.0 | 64.4 | 5 / 35 | 3406 |
| 3 | 2 | 62.5 | 67.6 | 5 / 35 | 4236 |
| 4 | 2 | 62.9 | 72.4 | 5 / 35 | 3756 |
| 5 | 2 | 62.6 | 70.8 | 6 / 35 | 3522 |
| 6 | 2 | 64.0 | 75.2 | 5 / 35 | 3829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 66 | 23% |
| brainfade.melee.Dusk 0.44 | 10 | 90% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 82 | 46% | 96 |
| wcsv.melee.EngineerMelee 0.1 | 24 | 14% | 27 |
| brainfade.melee.Dusk 0.44 | 21 | 12% | 30 |
| dummy.micro.Sparrow 2.5 | 18 | 10% | 22 |
| Krabb.akim2.Akim2 1.1b | 12 | 7% | 12 |
| mz.NanoGod 2.02 | 9 | 5% | 9 |
| jab.DiamondStealer 5 | 8 | 5% | 11 |
| cvt.Firsty 1.0 | 3 | 2% | 3 |

## Melee bench: F44

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.7 | 100 / 210 | 2.29 | 18.7% | 32318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 18.7% | 100 |
| stelo.Liblix 0.3.1 | 1.8 | 16.4% | 75 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.3% | 31 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.0% | 0 |
| wompi.Quokka 1.6 | 4.7 | 9.5% | 3 |
| jwirde.Gort 2.0 | 5.8 | 8.7% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.0% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.9 | 17 / 35 | 5255 |
| 2 | 1 | 67.0 | 78.7 | 13 / 35 | 5336 |
| 3 | 1 | 70.4 | 92.1 | 19 / 35 | 5727 |
| 4 | 1 | 66.8 | 80.3 | 15 / 35 | 5059 |
| 5 | 2 | 67.1 | 81.0 | 12 / 35 | 5157 |
| 6 | 1 | 70.9 | 93.3 | 24 / 35 | 5784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 85 | 64% |
| tzu.TheArtOfWar 1.2 | 40 | 55% |
| wompi.Quokka 1.6 | 9 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| jwirde.Gort 2.0 | 5 | 60% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 55 | 50% | 110 |
| tzu.TheArtOfWar 1.2 | 36 | 32% | 57 |
| wompi.Quokka 1.6 | 9 | 8% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 4% | 10 |
| jwirde.Gort 2.0 | 3 | 3% | 7 |
| disan.Chair 2.2.0 | 1 | 1% | 7 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.1 | 95 / 210 | 2.25 | 19.7% | 36575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.7% | 95 |
| jje.BagPuss 1.2 | 2.3 | 12.6% | 7 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.6% | 91 |
| sul.Lunar 1.1 | 4.3 | 10.2% | 8 |
| myl.nano.Graviton 1.10 | 4.8 | 9.5% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 6.2 | 8.4% | 3 |
| fm.claire 1.7 | 6.8 | 8.2% | 1 |
| hvilela.HVilela 0.9 | 8.0 | 7.5% | 0 |
| wit.Deep7 2.0 | 8.8 | 6.1% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.9 | 16 / 35 | 6217 |
| 2 | 1 | 68.8 | 84.8 | 12 / 35 | 6046 |
| 3 | 1 | 70.4 | 90.8 | 19 / 35 | 6135 |
| 4 | 1 | 68.7 | 82.9 | 15 / 35 | 6050 |
| 5 | 1 | 67.1 | 78.4 | 13 / 35 | 5921 |
| 6 | 1 | 70.8 | 90.8 | 20 / 35 | 6206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 93 | 39% |
| jje.BagPuss 1.2 | 19 | 84% |
| sul.Lunar 1.1 | 17 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| myl.nano.Graviton 1.10 | 9 | 89% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 4 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 60 | 52% | 0 |
| jje.BagPuss 1.2 | 19 | 17% | 75 |
| sul.Lunar 1.1 | 10 | 9% | 61 |
| myl.nano.Graviton 1.10 | 8 | 7% | 30 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 6% | 21 |
| hvilela.HVilela 0.9 | 5 | 4% | 10 |
| fm.claire 1.7 | 4 | 3% | 5 |
| wit.Deep7 2.0 | 1 | 1% | 7 |
| abud.ThirdRobo 1.0 | 1 | 1% | 0 |

## Melee bench: F46

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 77.8 | 53 / 210 | 3.00 | 15.6% | 25626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.1% | 54 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 17.0% | 79 |
| hadur117.mini.DeiseW 0.2 | 2.7 | 15.6% | 53 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 8 |
| cx.Princess 1.0 | 4.7 | 10.1% | 15 |
| sadoner.killer 0.2 | 5.8 | 8.9% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 80.0 | 9 / 35 | 4859 |
| 2 | 3 | 63.7 | 76.5 | 7 / 35 | 4104 |
| 3 | 3 | 64.1 | 74.3 | 9 / 35 | 4414 |
| 4 | 3 | 62.5 | 74.9 | 6 / 35 | 3766 |
| 5 | 3 | 64.5 | 80.6 | 9 / 35 | 3859 |
| 6 | 2 | 66.5 | 80.6 | 13 / 35 | 4624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 40 | 63% |
| rsalesc.melee.Medina 0.4.5 | 32 | 50% |
| cx.Princess 1.0 | 8 | 63% |
| mz.MicroSheep 1.0 | 5 | 100% |
| sadoner.killer 0.2 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 74 | 47% | 103 |
| rsalesc.melee.Medina 0.4.5 | 48 | 31% | 64 |
| mz.MicroSheep 1.0 | 10 | 6% | 11 |
| cx.Princess 1.0 | 9 | 6% | 12 |
| sadoner.killer 0.2 | 7 | 4% | 9 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 6 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

