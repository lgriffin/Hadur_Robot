# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 86.1 | 49 / 210 | 2.25 | 16.7% | 27983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 146 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 16.7% | 49 |
| sgp.JollyNinja 3.53 | 3.7 | 11.3% | 8 |
| mz.MicroGodMelee 1 | 4.2 | 11.1% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.6% | 3 |
| lorneswork.Predator 1.0 | 5.5 | 9.7% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.2% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 87.6 | 9 / 35 | 4747 |
| 2 | 2 | 65.9 | 84.4 | 10 / 35 | 4520 |
| 3 | 2 | 65.7 | 83.5 | 8 / 35 | 4619 |
| 4 | 2 | 66.0 | 85.1 | 4 / 35 | 4758 |
| 5 | 2 | 66.9 | 89.5 | 7 / 35 | 4539 |
| 6 | 2 | 67.2 | 86.7 | 11 / 35 | 4800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 138 | 14% |
| mz.MicroGodMelee 1 | 14 | 71% |
| sgp.JollyNinja 3.53 | 10 | 80% |
| lorneswork.Predator 1.0 | 8 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 1277. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 127 | 78% | 148 |
| sgp.JollyNinja 3.53 | 16 | 10% | 24 |
| mz.MicroGodMelee 1 | 8 | 5% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 8 |
| lorneswork.Predator 1.0 | 2 | 1% | 7 |
| adt.Ar2 1.0 | 2 | 1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.9 | 117 / 210 | 2.27 | 18.3% | 28328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.3% | 117 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.5% | 35 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.9% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.3% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.8% | 9 |
| Noran.BitchingElk 0.054 | 6.8 | 7.8% | 14 |
| sch.Simone 0.3d | 7.2 | 7.4% | 4 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.1% | 2 |
| stelo.PatternRobot 1.0 | 8.5 | 6.5% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.8 | 25 / 35 | 5013 |
| 2 | 1 | 67.3 | 84.4 | 19 / 35 | 4587 |
| 3 | 1 | 68.1 | 87.0 | 20 / 35 | 4803 |
| 4 | 1 | 66.9 | 82.5 | 20 / 35 | 4518 |
| 5 | 1 | 67.8 | 88.3 | 18 / 35 | 4592 |
| 6 | 1 | 66.4 | 82.2 | 15 / 35 | 4815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 52 | 81% |
| pulsar.PulsarMax 0.8.9 | 43 | 67% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 80% |
| sch.Simone 0.3d | 13 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| Noran.BitchingElk 0.054 | 9 | 44% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |

Hadur died in 94 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 30 | 32% | 57 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 26% | 62 |
| Noran.BitchingElk 0.054 | 10 | 11% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 11% | 18 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 7% | 20 |
| stelo.PatternRobot 1.0 | 7 | 7% | 12 |
| sch.Simone 0.3d | 3 | 3% | 13 |
| fullsail.SweetTea 1.1 | 2 | 2% | 5 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 5 |

## Melee bench: F03

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.2 | 157 / 210 | 1.61 | 20.3% | 35746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.3% | 157 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.4% | 13 |
| vuen.Cake 2.51 | 3.0 | 13.2% | 28 |
| radnor.DoctorBob 1.42 | 3.2 | 13.2% | 11 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.3% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.0% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.3 | 27 / 35 | 6113 |
| 2 | 1 | 71.4 | 96.8 | 30 / 35 | 5862 |
| 3 | 1 | 68.9 | 88.6 | 23 / 35 | 5695 |
| 4 | 1 | 70.8 | 93.0 | 26 / 35 | 6301 |
| 5 | 1 | 69.7 | 93.7 | 23 / 35 | 5592 |
| 6 | 1 | 71.1 | 94.0 | 28 / 35 | 6183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 74 | 80% |
| kawigi.nano.Lib 1.0 | 66 | 95% |
| radnor.DoctorBob 1.42 | 28 | 93% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 21 | 39% | 79 |
| radnor.DoctorBob 1.42 | 16 | 30% | 44 |
| kawigi.nano.Lib 1.0 | 13 | 24% | 63 |
| urdos.URDOS 1.3 | 4 | 7% | 6 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 9 |
| adt.Ar1 2.1 | 0 | 0% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.6 | 35 / 210 | 2.30 | 17.2% | 31987 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.8% | 176 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 17.2% | 35 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.3% | 0 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 1 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 6.8% | 0 |
| css.Delitioner 0.11 | 6.8 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 86.0 | 5 / 35 | 5425 |
| 2 | 2 | 68.2 | 85.7 | 8 / 35 | 5449 |
| 3 | 2 | 66.0 | 83.5 | 4 / 35 | 4785 |
| 4 | 2 | 67.2 | 84.4 | 3 / 35 | 5232 |
| 5 | 2 | 68.3 | 86.0 | 7 / 35 | 5681 |
| 6 | 2 | 68.5 | 87.9 | 8 / 35 | 5415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 161 | 17% |
| apc.LeeroyJenkins2 1.0 | 5 | 100% |
| TNT.TNT 0.99.1 | 2 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 1474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 150 | 85% | 177 |
| apc.LeeroyJenkins2 1.0 | 13 | 7% | 18 |
| josago.Jorgito 0.16 | 5 | 3% | 6 |
| TNT.TNT 0.99.1 | 3 | 2% | 5 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 75.2 | 30 / 210 | 3.23 | 14.1% | 20748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.3% | 109 |
| justin.DemonicRage 3.4 | 2.0 | 16.6% | 48 |
| hadur117.mini.DeiseD 0.4 | 3.2 | 14.1% | 30 |
| wompi.Numbat 2.1 | 3.8 | 12.6% | 12 |
| ms.Ares 0.19 | 5.3 | 9.3% | 2 |
| axeBots.HataMoto 3.09 | 5.7 | 8.7% | 9 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.8 | 72.4 | 3 / 35 | 3376 |
| 2 | 3 | 62.4 | 75.6 | 4 / 35 | 3371 |
| 3 | 3 | 64.9 | 82.2 | 10 / 35 | 3883 |
| 4 | 3 | 60.2 | 68.9 | 5 / 35 | 3272 |
| 5 | 3 | 61.4 | 73.7 | 4 / 35 | 3329 |
| 6 | 3 | 62.8 | 78.4 | 4 / 35 | 3517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 37 | 11% |
| justin.DemonicRage 3.4 | 32 | 47% |
| wompi.Numbat 2.1 | 10 | 90% |
| axeBots.HataMoto 3.09 | 5 | 40% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 180 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 84 | 47% | 88 |
| justin.DemonicRage 3.4 | 46 | 26% | 59 |
| wompi.Numbat 2.1 | 20 | 11% | 32 |
| axeBots.HataMoto 3.09 | 12 | 7% | 13 |
| ms.Ares 0.19 | 9 | 5% | 9 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.3 | 117 / 210 | 2.23 | 18.2% | 28312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.2% | 117 |
| jekl.StoneGhost 0.7 | 2.0 | 14.5% | 27 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 12.6% | 22 |
| origin.SleepSiphon 1.7b | 3.5 | 12.4% | 34 |
| mld.Wisdom 1.0 | 5.0 | 10.7% | 4 |
| gg.Wolverine 2.0 | 6.3 | 8.2% | 3 |
| DBall.NUKE 0.1 | 7.7 | 6.8% | 1 |
| spinnercat.Omen 1.0 | 7.8 | 6.8% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.3% | 1 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.7 | 20 / 35 | 4768 |
| 2 | 1 | 68.0 | 85.4 | 20 / 35 | 4862 |
| 3 | 1 | 68.7 | 90.8 | 22 / 35 | 4594 |
| 4 | 1 | 65.5 | 78.7 | 13 / 35 | 4615 |
| 5 | 1 | 67.1 | 84.4 | 19 / 35 | 4535 |
| 6 | 1 | 69.6 | 91.7 | 23 / 35 | 4938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 49 | 90% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 82% |
| origin.SleepSiphon 1.7b | 34 | 62% |
| gg.Wolverine 2.0 | 11 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 80% |
| mld.Wisdom 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 29 | 30% | 59 |
| origin.SleepSiphon 1.7b | 26 | 27% | 54 |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 24% | 55 |
| mld.Wisdom 1.0 | 11 | 11% | 21 |
| gg.Wolverine 2.0 | 2 | 2% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 7 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.1 | 125 / 210 | 1.62 | 19.9% | 34324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.9% | 125 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.4% | 49 |
| rtk.Tachikoma 1.0 | 2.8 | 16.3% | 27 |
| franzor.Lizt 1.3.1 | 4.3 | 10.6% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.6% | 2 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.9% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.3 | 21 / 35 | 5746 |
| 2 | 1 | 71.4 | 91.4 | 20 / 35 | 5971 |
| 3 | 1 | 71.4 | 93.0 | 21 / 35 | 5932 |
| 4 | 1 | 71.1 | 93.3 | 20 / 35 | 5626 |
| 5 | 1 | 71.2 | 92.4 | 20 / 35 | 5718 |
| 6 | 1 | 71.5 | 94.9 | 23 / 35 | 5331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 100 | 81% |
| rsalesc.melee.Monk 0.3.6c | 50 | 14% |
| oog.melee.CapuletDroid 1.1 | 26 | 96% |
| franzor.Lizt 1.3.1 | 13 | 69% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 1608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 44 | 52% | 67 |
| rtk.Tachikoma 1.0 | 32 | 38% | 111 |
| oog.melee.CapuletDroid 1.1 | 4 | 5% | 28 |
| franzor.Lizt 1.3.1 | 4 | 5% | 0 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.5 | 119 / 210 | 2.04 | 18.7% | 29054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.7% | 119 |
| tm.Yuugao 1.0 | 2.5 | 13.5% | 44 |
| shrub.Vapour v159 | 2.5 | 13.1% | 26 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.4% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.4% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.0% | 6 |
| m3thos.Eva00 1.1 | 6.7 | 7.8% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.6% | 0 |
| SHAM.WOW 1.4 | 9.0 | 6.1% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 94.6 | 23 / 35 | 5125 |
| 2 | 1 | 66.3 | 82.9 | 15 / 35 | 4761 |
| 3 | 1 | 68.2 | 88.6 | 22 / 35 | 4662 |
| 4 | 1 | 67.2 | 86.3 | 20 / 35 | 4663 |
| 5 | 1 | 68.5 | 90.8 | 19 / 35 | 5015 |
| 6 | 1 | 67.9 | 87.6 | 20 / 35 | 4828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 59 | 58% |
| shrub.Vapour v159 | 46 | 67% |
| Krabb.sliNk.Garm 0.9u | 23 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 80% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 38 | 40% | 76 |
| shrub.Vapour v159 | 23 | 24% | 50 |
| Krabb.sliNk.Garm 0.9u | 15 | 16% | 32 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 5% | 16 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 5% | 15 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 4 |
| SHAM.WOW 1.4 | 2 | 2% | 9 |
| m3thos.Eva00 1.1 | 0 | 0% | 6 |
3 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.5 | 85 / 210 | 2.85 | 16.4% | 24885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.8% | 85 |
| hadur117.mini.DeiseD 0.4 | 1.7 | 16.4% | 85 |
| kc.micro.Figment 1.0 | 3.0 | 14.0% | 15 |
| yagami.Tidus 0.11 | 4.3 | 11.2% | 2 |
| mc2.enemy.Original 0.9 | 5.3 | 9.5% | 14 |
| pedersen.Grishnakh 1.0 | 5.5 | 9.2% | 8 |
| dft.Calliope 5.6 | 6.8 | 7.7% | 3 |
| step.nanoPri 1.0 | 8.5 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 73.0 | 10 / 35 | 3828 |
| 2 | 2 | 65.9 | 81.3 | 12 / 35 | 4259 |
| 3 | 1 | 68.7 | 88.9 | 21 / 35 | 4314 |
| 4 | 1 | 67.3 | 84.8 | 20 / 35 | 4531 |
| 5 | 2 | 61.9 | 69.2 | 10 / 35 | 3929 |
| 6 | 2 | 65.1 | 79.7 | 12 / 35 | 4024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 58 | 50% |
| kc.micro.Figment 1.0 | 31 | 94% |
| mc2.enemy.Original 0.9 | 13 | 69% |
| pedersen.Grishnakh 1.0 | 9 | 78% |
| yagami.Tidus 0.11 | 8 | 100% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 58 | 46% | 86 |
| yagami.Tidus 0.11 | 18 | 14% | 26 |
| kc.micro.Figment 1.0 | 16 | 13% | 48 |
| mc2.enemy.Original 0.9 | 13 | 10% | 23 |
| pedersen.Grishnakh 1.0 | 7 | 6% | 11 |
| robar.nano.Assertive_Melee 0.2 | 6 | 5% | 7 |
| dft.Calliope 5.6 | 3 | 2% | 5 |
| rdm.Dueler 0.4x | 2 | 2% | 2 |
| step.nanoPri 1.0 | 2 | 2% | 2 |
2 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 96.5 | 175 / 210 | 1.32 | 20.5% | 31958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.5% | 175 |
| DTF.Kludgy 1.2b | 2.3 | 13.7% | 17 |
| ejb.Polaris 1.0.1 | 3.2 | 12.9% | 9 |
| ne.Chimera 1.2 | 3.7 | 12.2% | 4 |
| vStar.RAFzilla 2.15 | 5.3 | 9.9% | 2 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 1 |
| kurios.DOSexe .9b | 7.5 | 5.8% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.1% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 98.1 | 31 / 35 | 5341 |
| 2 | 1 | 71.7 | 98.7 | 33 / 35 | 5383 |
| 3 | 1 | 69.9 | 93.3 | 26 / 35 | 4938 |
| 4 | 1 | 71.2 | 96.8 | 30 / 35 | 5360 |
| 5 | 1 | 70.8 | 95.6 | 28 / 35 | 5511 |
| 6 | 1 | 70.8 | 96.2 | 27 / 35 | 5425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 60 | 87% |
| ejb.Polaris 1.0.1 | 56 | 95% |
| ne.Chimera 1.2 | 32 | 97% |
| vStar.RAFzilla 2.15 | 16 | 94% |
| tvv.micro.Antares 1.1.1 | 10 | 90% |
| donjezza.Muncho 1.0 | 9 | 78% |
| kurios.DOSexe .9b | 6 | 100% |
| sam.Samspin 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 18 | 50% | 69 |
| ne.Chimera 1.2 | 6 | 17% | 33 |
| ejb.Polaris 1.0.1 | 4 | 11% | 55 |
| vStar.RAFzilla 2.15 | 3 | 8% | 17 |
| tvv.micro.Antares 1.1.1 | 2 | 6% | 12 |
| donjezza.Muncho 1.0 | 2 | 6% | 10 |
| kurios.DOSexe .9b | 1 | 3% | 13 |
| sam.Samspin 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.9 | 98 / 210 | 2.54 | 17.2% | 25433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 17.2% | 98 |
| rz.Aleph 0.34 | 1.8 | 15.9% | 55 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.2% | 23 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 12 |
| rdt199.Warlord 0.73 | 5.3 | 9.2% | 12 |
| br2.MobyDickBot 1.6 | 5.8 | 8.6% | 6 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.4% | 1 |
| uji.YellohFellah 1.0 | 7.5 | 7.4% | 4 |
| stelo.MirrorNano 1.3 | 9.3 | 5.0% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 80.6 | 13 / 35 | 4177 |
| 2 | 1 | 66.4 | 83.2 | 17 / 35 | 4112 |
| 3 | 1 | 68.5 | 90.5 | 20 / 35 | 4410 |
| 4 | 1 | 66.2 | 82.5 | 15 / 35 | 4566 |
| 5 | 1 | 66.1 | 82.5 | 18 / 35 | 4190 |
| 6 | 1 | 64.4 | 78.1 | 15 / 35 | 3978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 54 | 74% |
| cx.mini.Nimrod 0.55 | 26 | 81% |
| djc.DynaBot 0.1.1 | 18 | 83% |
| uji.YellohFellah 1.0 | 12 | 75% |
| br2.MobyDickBot 1.6 | 9 | 78% |
| rdt199.Warlord 0.73 | 9 | 56% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 54 | 48% | 86 |
| cx.mini.Nimrod 0.55 | 19 | 17% | 34 |
| rdt199.Warlord 0.73 | 14 | 13% | 25 |
| djc.DynaBot 0.1.1 | 6 | 5% | 22 |
| uji.YellohFellah 1.0 | 5 | 4% | 18 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 5 |
| br2.MobyDickBot 1.6 | 4 | 4% | 11 |
| stelo.MirrorNano 1.3 | 4 | 4% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.3 | 133 / 210 | 2.06 | 18.4% | 24159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.4% | 133 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.5% | 23 |
| nat.PallasHawk 1.0 | 3.0 | 13.0% | 34 |
| darkcanuck.Leon 1.01 | 3.3 | 12.5% | 11 |
| brainfade.melee.Genghis 0.36 | 5.2 | 9.6% | 4 |
| jrm.Test0 1.0 | 5.8 | 8.5% | 0 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.9% | 0 |
| jp.Perpy 16.0 | 8.0 | 6.6% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 93.7 | 25 / 35 | 4015 |
| 2 | 1 | 68.5 | 89.8 | 23 / 35 | 4173 |
| 3 | 1 | 68.4 | 89.2 | 25 / 35 | 4105 |
| 4 | 1 | 65.9 | 81.0 | 18 / 35 | 3962 |
| 5 | 1 | 68.4 | 88.9 | 21 / 35 | 4409 |
| 6 | 1 | 66.5 | 87.0 | 21 / 35 | 3495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 53 | 85% |
| bts.wiki.RipCurl 0.9b | 43 | 77% |
| nat.PallasHawk 1.0 | 38 | 74% |
| brainfade.melee.Genghis 0.36 | 12 | 100% |
| jrm.Test0 1.0 | 8 | 100% |
| jaybot.bots.Oddball 4.0 | 6 | 50% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 25 | 32% | 53 |
| nat.PallasHawk 1.0 | 18 | 23% | 46 |
| darkcanuck.Leon 1.01 | 11 | 14% | 70 |
| jrm.Test0 1.0 | 7 | 9% | 10 |
| brainfade.melee.Genghis 0.36 | 6 | 8% | 11 |
| jaybot.bots.Oddball 4.0 | 4 | 5% | 7 |
| jp.Perpy 16.0 | 3 | 4% | 4 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 86.7 | 87 / 210 | 2.20 | 16.9% | 24905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.8% | 82 |
| hadur117.mini.DeiseD 0.4 | 1.8 | 16.9% | 87 |
| ags.Glacier 0.2.11 | 2.3 | 16.5% | 33 |
| shinh.Entangled 0.3 | 4.0 | 12.2% | 8 |
| gh.micro.Gruweltje 0.7 | 5.0 | 10.6% | 1 |
| apc.Colossus2 0.17 | 6.0 | 7.6% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 85.7 | 16 / 35 | 4326 |
| 2 | 1 | 67.5 | 89.2 | 17 / 35 | 4139 |
| 3 | 1 | 67.3 | 89.2 | 17 / 35 | 3970 |
| 4 | 2 | 67.1 | 85.4 | 15 / 35 | 4375 |
| 5 | 2 | 66.3 | 86.3 | 10 / 35 | 4202 |
| 6 | 3 | 65.5 | 84.4 | 12 / 35 | 3893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 64 | 42% |
| ags.Glacier 0.2.11 | 56 | 75% |
| shinh.Entangled 0.3 | 16 | 75% |
| stelo.Wang 1.0 | 3 | 100% |
| gh.micro.Gruweltje 0.7 | 2 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 56 | 45% | 87 |
| ags.Glacier 0.2.11 | 37 | 30% | 78 |
| shinh.Entangled 0.3 | 17 | 14% | 24 |
| gh.micro.Gruweltje 0.7 | 7 | 6% | 12 |
| stelo.Wang 1.0 | 4 | 3% | 5 |
| ayk.WallHugger 1.0 | 1 | 1% | 3 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.4 | 152 / 210 | 1.68 | 19.8% | 31817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.8% | 152 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 24 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 26 |
| co.edu.usb.rc.LidisTron 1.0 | 4.5 | 9.7% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.6% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.4% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 7.0 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.9% | 5 |
| pa.Improved 1.0 | 9.0 | 5.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 96.8 | 29 / 35 | 5807 |
| 2 | 1 | 70.8 | 94.0 | 27 / 35 | 5470 |
| 3 | 1 | 69.3 | 89.2 | 24 / 35 | 5031 |
| 4 | 1 | 70.3 | 93.3 | 27 / 35 | 5079 |
| 5 | 1 | 69.1 | 88.6 | 22 / 35 | 5298 |
| 6 | 1 | 69.8 | 92.7 | 23 / 35 | 5132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 92% |
| catcat20.shape.Theta 0.018 | 59 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 80% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 22 | 37% | 88 |
| catcat20.shape.Theta 0.018 | 16 | 27% | 59 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 12% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 8% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 18 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 3 |
| sample.TrackFire 1.0 | 1 | 2% | 2 |
| pa.Improved 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.1 | 107 / 210 | 2.43 | 18.2% | 30442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.2% | 107 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.5% | 18 |
| emp.Yngwie 1.11 | 2.8 | 12.8% | 43 |
| mld.DustBunny 3.8 | 3.5 | 12.3% | 10 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.6% | 6 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.3% | 21 |
| lambdaxy.TBot 0.1 | 7.2 | 7.0% | 1 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.3% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.8 | 17 / 35 | 5187 |
| 2 | 1 | 68.8 | 87.6 | 20 / 35 | 5018 |
| 3 | 1 | 68.7 | 86.3 | 20 / 35 | 5283 |
| 4 | 1 | 65.6 | 80.3 | 14 / 35 | 4503 |
| 5 | 1 | 67.3 | 81.9 | 17 / 35 | 5101 |
| 6 | 1 | 68.2 | 84.8 | 19 / 35 | 5350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 38 | 66% |
| kawigi.micro.Shiz 1.1 | 31 | 94% |
| kawigi.robot.Girl 1.2 | 24 | 71% |
| mld.DustBunny 3.8 | 20 | 85% |
| cb.nano.Insomnia 1.0 | 13 | 85% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 33 | 32% | 63 |
| mld.DustBunny 3.8 | 17 | 16% | 43 |
| cb.nano.Insomnia 1.0 | 15 | 14% | 17 |
| kawigi.micro.Shiz 1.1 | 14 | 13% | 42 |
| kawigi.robot.Girl 1.2 | 14 | 13% | 26 |
| divineomega.TrialBot 0.003 | 6 | 6% | 11 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.0 | 95 / 210 | 2.44 | 18.4% | 33340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 18.4% | 95 |
| gh.Griezel 0.5.2 | 1.8 | 16.5% | 67 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.7% | 28 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.3% | 2 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.0% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.9% | 0 |
| asd.Cthulhu 1.3 | 8.7 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.3% | 4 |
| repositorio.NanoStep 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.9 | 16 / 35 | 5111 |
| 2 | 1 | 70.4 | 92.7 | 17 / 35 | 5746 |
| 3 | 2 | 67.7 | 81.0 | 14 / 35 | 5451 |
| 4 | 1 | 68.9 | 85.1 | 18 / 35 | 5878 |
| 5 | 1 | 67.0 | 79.0 | 15 / 35 | 5411 |
| 6 | 1 | 68.7 | 84.4 | 15 / 35 | 5743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 87 | 51% |
| techdude.forest.FlamingForest 1.1 | 23 | 43% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 88% |
| bvh.fnr.Fenrir 0.36l | 8 | 100% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 67% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| asd.Cthulhu 1.3 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1342. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 59 | 51% | 110 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 16% | 36 |
| techdude.forest.FlamingForest 1.1 | 15 | 13% | 23 |
| bvh.fnr.Fenrir 0.36l | 11 | 10% | 16 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 5 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 9 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 8 |
| asd.Cthulhu 1.3 | 2 | 2% | 3 |

## Melee bench: F17

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.4 | 101 / 210 | 2.50 | 17.7% | 29681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.7% | 101 |
| et.Predator 1.8 | 2.5 | 13.1% | 23 |
| cx.BlestPain 1.41 | 3.3 | 12.4% | 37 |
| oog.melee.Mercutio 1.0 | 3.5 | 12.1% | 25 |
| nic.Nicator 2.4 | 5.2 | 11.2% | 13 |
| ahf.NanoAndrew .4 | 5.5 | 10.7% | 10 |
| maribo.melee.BMV 0.1 | 7.0 | 8.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.6% | 1 |
| tex.Longbot 0.4 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.5 | 13 / 35 | 4771 |
| 2 | 1 | 69.4 | 90.2 | 19 / 35 | 5289 |
| 3 | 1 | 68.1 | 85.4 | 21 / 35 | 4906 |
| 4 | 1 | 66.1 | 79.0 | 18 / 35 | 4984 |
| 5 | 1 | 67.0 | 83.5 | 15 / 35 | 4962 |
| 6 | 1 | 66.0 | 79.7 | 15 / 35 | 4769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 41 | 80% |
| oog.melee.Mercutio 1.0 | 31 | 81% |
| cx.BlestPain 1.41 | 27 | 56% |
| ahf.NanoAndrew .4 | 16 | 94% |
| nic.Nicator 2.4 | 15 | 73% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 27 | 25% | 58 |
| cx.BlestPain 1.41 | 26 | 24% | 40 |
| oog.melee.Mercutio 1.0 | 19 | 17% | 45 |
| nic.Nicator 2.4 | 17 | 15% | 28 |
| ahf.NanoAndrew .4 | 15 | 14% | 26 |
| maribo.melee.BMV 0.1 | 3 | 3% | 7 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.0 | 132 / 210 | 2.17 | 18.4% | 26941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.4% | 132 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.2% | 22 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.1% | 23 |
| uji.DBH 1.1 | 4.0 | 10.9% | 7 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.7% | 5 |
| ratosh.Nobo 0.21 | 5.5 | 9.4% | 3 |
| sigterm.Sigterm 1.0 | 7.0 | 8.2% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.0% | 3 |
| stelo.WangRobot 1.0 | 9.2 | 5.9% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 89.5 | 22 / 35 | 4751 |
| 2 | 1 | 67.4 | 86.7 | 21 / 35 | 4242 |
| 3 | 1 | 68.6 | 89.5 | 22 / 35 | 4724 |
| 4 | 1 | 67.2 | 85.4 | 23 / 35 | 4315 |
| 5 | 1 | 64.4 | 79.7 | 18 / 35 | 3883 |
| 6 | 1 | 69.6 | 91.4 | 26 / 35 | 5026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 54 | 89% |
| agd.Mooserwirt2 2.7 | 36 | 78% |
| uji.DBH 1.1 | 23 | 91% |
| sigterm.Sigterm 1.0 | 12 | 92% |
| spinnercat.Robovirus 2.718 | 12 | 75% |
| ratosh.Nobo 0.21 | 9 | 78% |
| stelo.WangRobot 1.0 | 9 | 78% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 50% |

Hadur died in 80 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 24 | 30% | 71 |
| agd.Mooserwirt2 2.7 | 15 | 19% | 53 |
| uji.DBH 1.1 | 12 | 15% | 27 |
| sigterm.Sigterm 1.0 | 8 | 10% | 14 |
| spinnercat.Robovirus 2.718 | 6 | 8% | 15 |
| ratosh.Nobo 0.21 | 5 | 6% | 12 |
| stelo.WangRobot 1.0 | 4 | 5% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 3 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 94.5 | 169 / 210 | 1.50 | 21.0% | 34586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 21.0% | 169 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.8% | 17 |
| mld.Infinity 2.2 | 2.8 | 14.0% | 19 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.3% | 2 |
| erdnis.Rover 0.3 | 5.0 | 9.8% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.5% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 7.8 | 6.9% | 3 |
| pbg.R2D2 1.0 | 8.7 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.0 | 28 / 35 | 5726 |
| 2 | 1 | 72.6 | 96.5 | 29 / 35 | 5844 |
| 3 | 1 | 72.1 | 94.3 | 27 / 35 | 5968 |
| 4 | 1 | 71.4 | 92.7 | 28 / 35 | 5569 |
| 5 | 1 | 72.0 | 95.2 | 29 / 35 | 5430 |
| 6 | 1 | 72.3 | 95.2 | 28 / 35 | 6049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 85 | 92% |
| mld.Infinity 2.2 | 63 | 90% |
| erdnis.Rover 0.3 | 9 | 100% |
| krillr.mini.JointStrike 2.0.0 | 8 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 1154. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 14 | 33% | 23 |
| davidalves.net.DuelistMiniMelee 1.2 | 13 | 31% | 117 |
| krillr.mini.JointStrike 2.0.0 | 6 | 14% | 23 |
| patson.PatsonTestBot 1.0 | 3 | 7% | 14 |
| erdnis.Rover 0.3 | 3 | 7% | 11 |
| pbg.R2D2 1.0 | 1 | 2% | 9 |
| pac.ABC 2.1 | 1 | 2% | 6 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.2 | 127 / 210 | 1.89 | 19.7% | 33432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.7% | 127 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 39 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.5% | 6 |
| fwb.Nine 1.0.1 | 4.2 | 10.9% | 14 |
| catcat20.Rabbit 0.001 | 4.3 | 10.6% | 22 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 7.4% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.2% | 0 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.1% | 2 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.5 | 18 / 35 | 5528 |
| 2 | 1 | 70.3 | 91.4 | 21 / 35 | 5658 |
| 3 | 1 | 68.9 | 89.2 | 20 / 35 | 5427 |
| 4 | 1 | 69.1 | 88.3 | 21 / 35 | 5421 |
| 5 | 1 | 70.2 | 91.7 | 24 / 35 | 5596 |
| 6 | 1 | 70.3 | 89.8 | 23 / 35 | 5802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 68 | 75% |
| fwb.Nine 1.0.1 | 33 | 76% |
| catcat20.Rabbit 0.001 | 32 | 59% |
| nz.jdc.nano.GridFu 1.0 | 21 | 90% |
| m3thos.mini.Eva01 0.5.5 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1222. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 43% | 76 |
| catcat20.Rabbit 0.001 | 20 | 24% | 47 |
| fwb.Nine 1.0.1 | 14 | 17% | 19 |
| nz.jdc.nano.GridFu 1.0 | 10 | 12% | 41 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 9 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 7 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.3 | 138 / 210 | 1.60 | 20.4% | 33980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.4% | 138 |
| eem.EvBot v4.6.16 | 2.0 | 15.9% | 58 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.1% | 3 |
| eld.Hmm 1.0 | 5.5 | 8.2% | 5 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.1% | 1 |
| fire219.CatBot 1.0 | 7.5 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.1% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.1 | 20 / 35 | 5560 |
| 2 | 1 | 71.9 | 94.3 | 23 / 35 | 6013 |
| 3 | 1 | 71.1 | 91.1 | 27 / 35 | 5927 |
| 4 | 1 | 71.4 | 95.6 | 25 / 35 | 5759 |
| 5 | 1 | 69.8 | 91.7 | 20 / 35 | 5141 |
| 6 | 1 | 71.1 | 94.9 | 23 / 35 | 5580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 116 | 66% |
| dummy.mini.Scimitar 1.01 | 29 | 93% |
| cf.RiO.RiOx 4.2.1 | 18 | 100% |
| eld.Hmm 1.0 | 14 | 71% |
| oa.weak.BotherBot 0.1 | 5 | 80% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 43 | 59% | 97 |
| dummy.mini.Scimitar 1.01 | 11 | 15% | 53 |
| cf.RiO.RiOx 4.2.1 | 10 | 14% | 28 |
| eld.Hmm 1.0 | 5 | 7% | 19 |
| oa.weak.BotherBot 0.1 | 3 | 4% | 10 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.1 | 100 / 210 | 2.25 | 18.1% | 30305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.1% | 100 |
| pe.SandboxDT 2.71m | 2.2 | 16.0% | 51 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.8% | 33 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.0% | 18 |
| bigpete.Stewie 1.0 | 5.0 | 10.1% | 4 |
| tad.Dalek98 0.98 | 6.8 | 6.6% | 1 |
| yk.JahRoslav 1.1 | 7.2 | 6.6% | 1 |
| gg.Squaraus 0.6 | 7.3 | 6.4% | 1 |
| pbg.NinjaX 1.2 | 8.7 | 5.3% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 79.4 | 12 / 35 | 4718 |
| 2 | 1 | 68.7 | 86.7 | 18 / 35 | 5128 |
| 3 | 1 | 70.9 | 92.4 | 23 / 35 | 5659 |
| 4 | 1 | 69.0 | 88.6 | 17 / 35 | 5129 |
| 5 | 1 | 67.5 | 86.3 | 15 / 35 | 4674 |
| 6 | 1 | 67.7 | 83.2 | 15 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 52 | 65% |
| kvk.HebusLeTroll 0.35 | 45 | 67% |
| jlm.javaDisturbance 0.59 | 32 | 81% |
| bigpete.Stewie 1.0 | 6 | 83% |
| yk.JahRoslav 1.1 | 4 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 40 | 36% | 86 |
| kvk.HebusLeTroll 0.35 | 39 | 35% | 55 |
| jlm.javaDisturbance 0.59 | 21 | 19% | 47 |
| bigpete.Stewie 1.0 | 6 | 5% | 13 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.9 | 140 / 210 | 1.73 | 19.8% | 30140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.8% | 140 |
| pe.SandboxLump 1.52 | 2.0 | 17.3% | 47 |
| cre.Karolos 0.32 | 3.2 | 13.8% | 17 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.6% | 5 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 8.9% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 8.7% | 0 |
| cw.megas.Blade 0.8 | 7.2 | 8.2% | 0 |
| sample.Walls 1.0 | 7.5 | 8.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.9 | 23 / 35 | 4796 |
| 2 | 1 | 70.4 | 91.1 | 25 / 35 | 4797 |
| 3 | 1 | 70.5 | 89.2 | 22 / 35 | 5364 |
| 4 | 1 | 71.5 | 95.6 | 25 / 35 | 4941 |
| 5 | 1 | 71.1 | 94.0 | 21 / 35 | 5371 |
| 6 | 1 | 71.1 | 92.4 | 24 / 35 | 4871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 98 | 76% |
| cre.Karolos 0.32 | 35 | 89% |
| stelo.AreaTargetingBot 1.1 | 14 | 93% |
| sample.Walls 1.0 | 11 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 42 | 60% | 109 |
| cre.Karolos 0.32 | 18 | 26% | 56 |
| stelo.AreaTargetingBot 1.1 | 5 | 7% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 4% | 8 |
| stelo.RamTrackSurfer 1.2 | 2 | 3% | 10 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| cw.megas.Blade 0.8 | 0 | 0% | 2 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 78.8 | 77 / 210 | 2.90 | 15.8% | 22168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.5 | 15.8% | 77 |
| rz.GlowBlowMelee 1.4 | 1.7 | 14.8% | 51 |
| florent.XSeries.X2 0.12 | 3.0 | 13.1% | 33 |
| davidalves.Phoenix 0.54 | 4.3 | 11.8% | 25 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.4% | 16 |
| oog.melee.Corsair 1.0 | 6.2 | 9.5% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.5% | 7 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 0 |
| evd.X1 0.01 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.3 | 12 / 35 | 3439 |
| 2 | 1 | 62.7 | 78.1 | 8 / 35 | 3532 |
| 3 | 1 | 66.4 | 82.9 | 16 / 35 | 4171 |
| 4 | 2 | 62.3 | 76.2 | 10 / 35 | 3423 |
| 5 | 1 | 66.8 | 84.4 | 19 / 35 | 4060 |
| 6 | 2 | 63.3 | 77.1 | 12 / 35 | 3543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 39 | 64% |
| florent.XSeries.X2 0.12 | 22 | 59% |
| davidalves.Phoenix 0.54 | 17 | 65% |
| stelo.SoJNanoMelee 1.1 | 15 | 87% |
| pedersen.Ugluk 1.1.1 | 13 | 77% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 43 | 32% | 71 |
| florent.XSeries.X2 0.12 | 35 | 26% | 47 |
| davidalves.Phoenix 0.54 | 22 | 17% | 33 |
| pedersen.Ugluk 1.1.1 | 21 | 16% | 27 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 11 |
| oog.melee.Corsair 1.0 | 2 | 2% | 12 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 4 |
| evd.X1 0.01 | 1 | 1% | 3 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |

## Melee bench: F25

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.7 | 147 / 210 | 2.01 | 19.0% | 25735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.0% | 147 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.0% | 20 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.8% | 12 |
| jdw.Hurricane 1.4 | 3.7 | 11.7% | 22 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 8.6% | 2 |
| ds.Oo 2.2 | 6.3 | 8.1% | 3 |
| gjr.Cephalosporin 0.1 | 6.8 | 7.8% | 2 |
| awesomeness.Elite 1.0 | 7.2 | 7.3% | 1 |
| adt.Ar2 1.1 | 9.0 | 6.4% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.5 | 22 / 35 | 4494 |
| 2 | 1 | 68.6 | 89.2 | 26 / 35 | 4153 |
| 3 | 1 | 68.2 | 85.4 | 22 / 35 | 4419 |
| 4 | 1 | 68.8 | 89.2 | 25 / 35 | 4452 |
| 5 | 1 | 69.2 | 89.5 | 26 / 35 | 4281 |
| 6 | 1 | 68.3 | 88.6 | 26 / 35 | 3936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 50 | 94% |
| voidious.micro.BlitzBat 1.05 | 46 | 89% |
| jdw.Hurricane 1.4 | 37 | 89% |
| gjr.Cephalosporin 0.1 | 12 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| gre.svman4.Morfeas 1.4.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 3 | 100% |
| adt.Ar2 1.1 | 2 | 100% |
| ds.Oo 2.2 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 19 | 30% | 48 |
| voidious.micro.BlitzBat 1.05 | 13 | 21% | 51 |
| voidious.mini.BrokenSword 2.0.3 | 11 | 17% | 56 |
| ds.Oo 2.2 | 5 | 8% | 11 |
| gjr.Cephalosporin 0.1 | 4 | 6% | 16 |
| adt.Ar2 1.1 | 4 | 6% | 9 |
| gre.svman4.Morfeas 1.4.1 | 3 | 5% | 8 |
| awesomeness.Elite 1.0 | 3 | 5% | 8 |
| amk.ChumbaMini 0.2 | 1 | 2% | 2 |

## Melee bench: F26

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.7 | 128 / 210 | 1.93 | 19.2% | 32966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.2% | 128 |
| ak.Fermat 2.0 | 2.0 | 15.1% | 43 |
| shu.nitro.LENIN .T34 | 3.7 | 11.9% | 19 |
| lrem.Spectre 0.4.4 | 3.7 | 11.8% | 16 |
| js.PinBall 1.6 | 5.0 | 10.7% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.1% | 0 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.1% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.7 | 26 / 35 | 5786 |
| 2 | 1 | 69.3 | 90.8 | 19 / 35 | 5432 |
| 3 | 1 | 68.3 | 86.3 | 18 / 35 | 5316 |
| 4 | 1 | 70.4 | 92.1 | 23 / 35 | 5850 |
| 5 | 1 | 69.3 | 90.5 | 21 / 35 | 5333 |
| 6 | 1 | 68.7 | 86.7 | 21 / 35 | 5249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 58 | 69% |
| shu.nitro.LENIN .T34 | 48 | 81% |
| lrem.Spectre 0.4.4 | 28 | 89% |
| js.PinBall 1.6 | 11 | 82% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 40 | 49% | 81 |
| lrem.Spectre 0.4.4 | 19 | 23% | 37 |
| shu.nitro.LENIN .T34 | 14 | 17% | 51 |
| js.PinBall 1.6 | 5 | 6% | 23 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 5 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 0 | 0% | 5 |

## Melee bench: F27

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 89.4 | 142 / 210 | 1.95 | 18.8% | 26765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.8% | 142 |
| mk.Alpha 0.2.1 | 2.5 | 13.7% | 30 |
| wee.Gem 1.8.4 | 3.7 | 11.3% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.0% | 9 |
| EH.Eagle 1.0.6 | 4.3 | 10.9% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 5.7 | 9.2% | 1 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.2% | 1 |
| joe.ADinosaur 1.0 | 8.3 | 6.7% | 0 |
| caimano.Furia_Ceca 0.22 | 8.8 | 5.4% | 2 |
| cs.Grudge 1.0 | 8.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.5 | 24 / 35 | 4490 |
| 2 | 1 | 70.3 | 93.7 | 28 / 35 | 4851 |
| 3 | 1 | 66.9 | 86.0 | 20 / 35 | 4102 |
| 4 | 1 | 68.2 | 85.4 | 23 / 35 | 4905 |
| 5 | 1 | 68.5 | 90.8 | 22 / 35 | 4500 |
| 6 | 1 | 68.1 | 90.2 | 25 / 35 | 3917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 69 | 84% |
| wee.Gem 1.8.4 | 30 | 77% |
| sheldor.melee.nano.TestMelee 0.1 | 26 | 96% |
| techdude.kombat.FlamingKombat 1.5 | 17 | 100% |
| EH.Eagle 1.0.6 | 13 | 100% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 27 | 40% | 85 |
| wee.Gem 1.8.4 | 13 | 19% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 15% | 36 |
| EH.Eagle 1.0.6 | 5 | 7% | 21 |
| throxbot.ThroxBot 0.1 | 5 | 7% | 8 |
| joe.ADinosaur 1.0 | 5 | 7% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 12 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 3 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F28

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 93.0 | 147 / 210 | 1.63 | 19.6% | 27015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.6% | 147 |
| kid.test.NightFox .2 | 2.0 | 15.3% | 33 |
| uji.Antique 1.0 | 3.7 | 11.1% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.6% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.3% | 7 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 1 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.7% | 1 |
| matt.advanced.Katana 1.0 | 8.7 | 5.8% | 1 |
| stelo.PianistNano 1.2 | 9.0 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 93.0 | 22 / 35 | 4632 |
| 2 | 1 | 71.5 | 98.1 | 30 / 35 | 4874 |
| 3 | 1 | 69.8 | 94.0 | 26 / 35 | 4394 |
| 4 | 1 | 68.0 | 89.2 | 22 / 35 | 4287 |
| 5 | 1 | 69.5 | 93.3 | 26 / 35 | 4425 |
| 6 | 1 | 68.5 | 90.5 | 21 / 35 | 4403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 95 | 77% |
| uji.Antique 1.0 | 37 | 84% |
| qohnil.blot.BlotBot 3.61 | 26 | 85% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| ahr.ice.Ice 1.0.2 | 5 | 100% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 42% | 84 |
| uji.Antique 1.0 | 11 | 17% | 39 |
| qohnil.blot.BlotBot 3.61 | 8 | 13% | 27 |
| pfvicm.Sobieski 7.2.3b | 8 | 13% | 20 |
| amk.ChumbaWumba 0.3 | 5 | 8% | 15 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 11 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| matt.advanced.Katana 1.0 | 1 | 2% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 3 |

## Melee bench: F29

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.5 | 124 / 210 | 2.12 | 19.0% | 28371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.0% | 124 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.2% | 39 |
| deewiant.Anomaly 0.2 | 2.8 | 14.3% | 28 |
| myl.micro.Troodon 1.10 | 4.0 | 11.7% | 6 |
| jok.PheonixM 0.1.2 | 5.0 | 9.8% | 6 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 6.8 | 7.3% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.5% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.4 | 26 / 35 | 4731 |
| 2 | 1 | 69.4 | 88.9 | 21 / 35 | 4677 |
| 3 | 1 | 68.4 | 83.8 | 20 / 35 | 4977 |
| 4 | 1 | 68.5 | 85.1 | 17 / 35 | 4817 |
| 5 | 1 | 68.0 | 84.8 | 20 / 35 | 4452 |
| 6 | 1 | 69.9 | 91.1 | 20 / 35 | 4717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 57 | 68% |
| deewiant.Anomaly 0.2 | 56 | 82% |
| myl.micro.Troodon 1.10 | 21 | 90% |
| DBall.Anarchy 0.1 | 8 | 100% |
| jok.PheonixM 0.1.2 | 8 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 38 | 44% | 76 |
| deewiant.Anomaly 0.2 | 32 | 37% | 79 |
| jok.PheonixM 0.1.2 | 6 | 7% | 12 |
| myl.micro.Troodon 1.10 | 5 | 6% | 22 |
| ph.melee.ArcherME 0.3 | 4 | 5% | 8 |
| DBall.Anarchy 0.1 | 1 | 1% | 9 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |

## Melee bench: F30

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 78.6 | 73 / 210 | 2.93 | 15.7% | 23442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 15.7% | 73 |
| catcat20.Matcha 0.006 | 3.2 | 13.7% | 32 |
| darkcanuck.B26354 1.06 | 3.3 | 13.3% | 45 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.2% | 27 |
| oog.melee.Capulet 1.2 | 4.0 | 12.3% | 22 |
| intruder.PrairieWolf 2.61 | 6.8 | 7.6% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.5% | 6 |
| tripphippy.Alice 1.1 | 7.3 | 7.2% | 3 |
| ntc.Opposite 1.5 | 8.5 | 7.0% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.8 | 19 / 35 | 4219 |
| 2 | 2 | 62.1 | 73.7 | 10 / 35 | 3603 |
| 3 | 1 | 65.9 | 81.9 | 14 / 35 | 4141 |
| 4 | 1 | 61.8 | 73.7 | 7 / 35 | 3651 |
| 5 | 1 | 65.0 | 81.6 | 14 / 35 | 3873 |
| 6 | 1 | 63.6 | 75.9 | 9 / 35 | 3955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 37 | 62% |
| darkcanuck.B26354 1.06 | 30 | 43% |
| stelo.PastFuture 2.3.2 | 21 | 81% |
| oog.melee.Capulet 1.2 | 16 | 81% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 4 | 75% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 38 | 28% | 52 |
| stelo.PastFuture 2.3.2 | 33 | 24% | 50 |
| catcat20.Matcha 0.006 | 27 | 20% | 49 |
| oog.melee.Capulet 1.2 | 23 | 17% | 35 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 8 |
| intruder.PrairieWolf 2.61 | 4 | 3% | 7 |
| ntc.Opposite 1.5 | 4 | 3% | 5 |
| tripphippy.Alice 1.1 | 1 | 1% | 2 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 74.9 | 57 / 210 | 3.26 | 14.7% | 20515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 16.9% | 76 |
| hadur117.mini.DeiseD 0.4 | 2.2 | 14.7% | 57 |
| gh.mini.Griezel 0.2 | 2.8 | 13.8% | 53 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.4% | 11 |
| d414.nano.Quantum 1.0.0 | 4.7 | 10.7% | 4 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.2% | 3 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.0% | 3 |
| fm.mammillarias 1.3 | 7.8 | 6.6% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.9% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 74.9 | 9 / 35 | 3255 |
| 2 | 2 | 61.5 | 71.4 | 10 / 35 | 3520 |
| 3 | 2 | 62.5 | 74.0 | 11 / 35 | 3254 |
| 4 | 2 | 65.4 | 84.8 | 11 / 35 | 3632 |
| 5 | 3 | 61.6 | 71.7 | 9 / 35 | 3433 |
| 6 | 2 | 61.7 | 72.7 | 7 / 35 | 3421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 38 | 61% |
| gh.mini.Griezel 0.2 | 30 | 43% |
| spinnercat.micro.Tyger 0.1 | 12 | 92% |
| d414.nano.Quantum 1.0.0 | 10 | 90% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 53 | 35% | 70 |
| abc.Shadow 3.84i | 44 | 29% | 66 |
| spinnercat.micro.Tyger 0.1 | 25 | 16% | 36 |
| d414.nano.Quantum 1.0.0 | 11 | 7% | 19 |
| gh.nano.Grofvuil 0.2 | 8 | 5% | 8 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| timmit.nano.TimDog 0.33 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 0 |

## Melee bench: F32

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 88.4 | 135 / 210 | 2.04 | 18.7% | 28520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.7% | 135 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.6% | 41 |
| apc.botM 3.0 | 3.0 | 12.4% | 20 |
| lxx.ConceptA 0.8 | 4.2 | 11.0% | 3 |
| vjik.UnViolation 1.1 | 5.0 | 9.6% | 4 |
| bayen.UbaMicro 1.4 | 6.2 | 8.4% | 3 |
| panzer.Panzer 0.2 | 7.0 | 7.7% | 3 |
| conscience.Electron 1.3g | 8.2 | 6.3% | 0 |
| yk.JahMicro 1.0 | 8.7 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 79.4 | 18 / 35 | 4442 |
| 2 | 1 | 68.4 | 88.6 | 21 / 35 | 4914 |
| 3 | 1 | 70.2 | 94.9 | 28 / 35 | 4728 |
| 4 | 1 | 68.2 | 89.5 | 23 / 35 | 4729 |
| 5 | 1 | 68.4 | 88.9 | 22 / 35 | 4936 |
| 6 | 1 | 68.4 | 89.2 | 23 / 35 | 4771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 80 | 68% |
| apc.botM 3.0 | 30 | 87% |
| lxx.ConceptA 0.8 | 19 | 95% |
| vjik.UnViolation 1.1 | 12 | 100% |
| yk.JahMicro 1.0 | 8 | 100% |
| donjezza.Jezza 1.0 | 6 | 100% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 33 | 43% | 84 |
| apc.botM 3.0 | 17 | 22% | 48 |
| lxx.ConceptA 0.8 | 15 | 19% | 24 |
| bayen.UbaMicro 1.4 | 6 | 8% | 11 |
| yk.JahMicro 1.0 | 2 | 3% | 7 |
| vjik.UnViolation 1.1 | 1 | 1% | 21 |
| donjezza.Jezza 1.0 | 1 | 1% | 8 |
| conscience.Electron 1.3g | 1 | 1% | 3 |
| panzer.Panzer 0.2 | 1 | 1% | 2 |

## Melee bench: F33

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.6 | 142 / 210 | 1.94 | 19.5% | 29776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.5% | 142 |
| maribo.Quester 0.3 | 2.0 | 15.5% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.2% | 11 |
| labg.Cataclysm 2.05 | 4.2 | 10.9% | 14 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.7% | 5 |
| baal.nano.N 1.42 | 6.2 | 8.7% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.2% | 4 |
| zyx.micro.Ant 1.1 | 8.5 | 5.4% | 0 |
| sanja.First 0.1 | 8.7 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 21 / 35 | 5019 |
| 2 | 1 | 70.1 | 90.2 | 27 / 35 | 5180 |
| 3 | 1 | 69.3 | 89.2 | 25 / 35 | 4671 |
| 4 | 1 | 69.9 | 91.1 | 23 / 35 | 4866 |
| 5 | 1 | 70.5 | 93.0 | 24 / 35 | 5006 |
| 6 | 1 | 68.9 | 86.0 | 22 / 35 | 5034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 65 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 91% |
| gre.svman4.Leonidas 1.3.2 | 28 | 96% |
| labg.Cataclysm 2.05 | 24 | 75% |
| baal.nano.N 1.42 | 7 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 67% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 33 | 49% | 87 |
| labg.Cataclysm 2.05 | 11 | 16% | 28 |
| gre.svman4.Leonidas 1.3.2 | 8 | 12% | 21 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 10% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 9% | 46 |
| zyx.micro.Ant 1.1 | 2 | 3% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| baal.nano.N 1.42 | 0 | 0% | 6 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.2 | 82 / 210 | 2.33 | 17.5% | 28893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.5 | 17.5% | 82 |
| stelo.Spread 0.9 | 2.2 | 16.6% | 71 |
| kid.Gladiator .7.2 | 2.3 | 16.2% | 43 |
| jcs.Seth 1.8 | 4.5 | 10.9% | 10 |
| tcf.Reach 3 | 4.7 | 10.5% | 1 |
| cli.Dancer 1.1 | 5.8 | 9.3% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.9% | 1 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.7 | 13 / 35 | 4900 |
| 2 | 1 | 68.1 | 87.3 | 17 / 35 | 4685 |
| 3 | 1 | 68.2 | 84.1 | 17 / 35 | 5079 |
| 4 | 2 | 67.7 | 85.4 | 11 / 35 | 4773 |
| 5 | 1 | 68.3 | 87.0 | 16 / 35 | 4820 |
| 6 | 3 | 66.0 | 81.9 | 8 / 35 | 4636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 71 | 55% |
| kid.Gladiator .7.2 | 44 | 48% |
| jcs.Seth 1.8 | 16 | 81% |
| tcf.Reach 3 | 5 | 100% |
| cli.Dancer 1.1 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 128 of 210 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 54 | 42% | 69 |
| stelo.Spread 0.9 | 51 | 40% | 88 |
| jcs.Seth 1.8 | 15 | 12% | 30 |
| tcf.Reach 3 | 4 | 3% | 9 |
| ratosh.Wesco 1.4 | 2 | 2% | 5 |
| cli.Dancer 1.1 | 1 | 1% | 7 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 81.2 | 43 / 210 | 2.69 | 15.4% | 21119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 134 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 15.4% | 43 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.9% | 21 |
| rz.HawkOnFire 0.1 | 4.3 | 11.7% | 5 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.7% | 7 |
| wit.Chuliath 1.0 | 6.5 | 6.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 82.9 | 7 / 35 | 3731 |
| 2 | 2 | 64.0 | 81.0 | 6 / 35 | 3703 |
| 3 | 2 | 63.3 | 79.4 | 5 / 35 | 3516 |
| 4 | 2 | 63.9 | 80.0 | 6 / 35 | 3414 |
| 5 | 2 | 64.7 | 82.5 | 11 / 35 | 3276 |
| 6 | 2 | 64.2 | 81.6 | 8 / 35 | 3479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 88 | 19% |
| gh.mini.Gruwel 0.9 | 15 | 53% |
| rz.HawkOnFire 0.1 | 10 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 67% |
| wit.Chuliath 1.0 | 1 | 100% |
| dans.Cinnamon 1.2 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 90 | 54% | 107 |
| gh.mini.Gruwel 0.9 | 38 | 23% | 46 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 11% | 24 |
| rz.HawkOnFire 0.1 | 17 | 10% | 26 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 1 |
| dans.Cinnamon 1.2 | 0 | 0% | 1 |

## Melee bench: F36

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 94.3 | 165 / 210 | 1.51 | 20.9% | 32096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.9% | 165 |
| bzdp.Pansy 2.1 | 2.5 | 12.1% | 7 |
| alpha.RainingFire 1.0 | 3.0 | 11.8% | 10 |
| mz.Cork 0.1 | 4.7 | 10.4% | 8 |
| bvh.micro.Freya 0.3 | 5.3 | 9.8% | 5 |
| bvh.mini.Fenrir 0.39 | 5.5 | 9.3% | 1 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.3% | 8 |
| dl.BetterWalls 1.0 | 8.5 | 6.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.2 | 26 / 35 | 5365 |
| 2 | 1 | 71.8 | 97.8 | 30 / 35 | 5366 |
| 3 | 1 | 71.2 | 95.2 | 29 / 35 | 5426 |
| 4 | 1 | 70.3 | 92.4 | 27 / 35 | 5007 |
| 5 | 1 | 71.7 | 95.6 | 29 / 35 | 5410 |
| 6 | 1 | 71.2 | 95.9 | 24 / 35 | 5522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 94% |
| mz.Cork 0.1 | 31 | 90% |
| alpha.RainingFire 1.0 | 24 | 83% |
| bvh.micro.Freya 0.3 | 23 | 91% |
| m3thos.Eva02 0.7.1 | 22 | 77% |
| bvh.mini.Fenrir 0.39 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 11 | 64% |
| dl.BetterWalls 1.0 | 7 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 27% | 28 |
| bvh.mini.Fenrir 0.39 | 7 | 16% | 23 |
| bzdp.Pansy 2.1 | 6 | 13% | 54 |
| mz.Cork 0.1 | 5 | 11% | 30 |
| m3thos.Eva02 0.7.1 | 5 | 11% | 26 |
| bvh.micro.Freya 0.3 | 5 | 11% | 25 |
| sample.MyFirstRobot 1.0 | 4 | 9% | 7 |
| dl.BetterWalls 1.0 | 1 | 2% | 14 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 93.8 | 180 / 210 | 1.56 | 20.7% | 36300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.7% | 180 |
| germ.TheMind .2 | 2.8 | 10.7% | 4 |
| EBBU.Sim2 1.02 | 3.7 | 10.0% | 1 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 9.7% | 2 |
| agrach.Dalek 1.0 | 5.2 | 9.2% | 8 |
| stelo.UntouchableNano 1.3 | 5.7 | 8.9% | 5 |
| lmk.ACPFinal 0.1 | 7.3 | 8.4% | 4 |
| mb.Beast 0.1 | 8.3 | 7.6% | 3 |
| skm.Ryubot 1.0 | 8.3 | 7.7% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.4 | 31 / 35 | 5963 |
| 2 | 1 | 70.2 | 93.7 | 30 / 35 | 5702 |
| 3 | 1 | 69.8 | 90.5 | 28 / 35 | 6266 |
| 4 | 1 | 70.9 | 94.9 | 32 / 35 | 6244 |
| 5 | 1 | 71.2 | 95.9 | 30 / 35 | 6608 |
| 6 | 1 | 69.9 | 95.2 | 29 / 35 | 5517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 100% |
| EBBU.Sim2 1.02 | 28 | 100% |
| stelo.UntouchableNano 1.3 | 25 | 88% |
| skm.Ryubot 1.0 | 22 | 100% |
| lmk.ACPFinal 0.1 | 22 | 95% |
| agrach.Dalek 1.0 | 20 | 100% |
| mb.Beast 0.1 | 15 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 6 | 20% | 27 |
| agrach.Dalek 1.0 | 5 | 17% | 42 |
| germ.TheMind .2 | 5 | 17% | 36 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 17% | 25 |
| lmk.ACPFinal 0.1 | 5 | 17% | 20 |
| EBBU.Sim2 1.02 | 1 | 3% | 26 |
| mb.Beast 0.1 | 1 | 3% | 16 |
| skm.Ryubot 1.0 | 1 | 3% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 3% | 5 |

## Melee bench: F38

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.7 | 105 / 210 | 2.47 | 17.2% | 25432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 17.2% | 105 |
| justin.Mallais 14.0 | 1.8 | 16.1% | 64 |
| bvh.mini.Freya 0.55 | 3.3 | 12.4% | 11 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.8% | 14 |
| cs.Wren 1.0 | 4.7 | 11.0% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 9.9% | 4 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.8% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.4% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 82.2 | 19 / 35 | 4109 |
| 2 | 1 | 66.7 | 85.4 | 16 / 35 | 4135 |
| 3 | 2 | 65.8 | 82.5 | 13 / 35 | 4259 |
| 4 | 1 | 66.6 | 81.9 | 19 / 35 | 4307 |
| 5 | 1 | 68.0 | 88.3 | 20 / 35 | 4280 |
| 6 | 1 | 66.5 | 81.9 | 18 / 35 | 4342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 80 | 66% |
| bts.mega.Gnarly 1.4 | 17 | 88% |
| cs.Wren 1.0 | 16 | 94% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 91% |
| bvh.mini.Freya 0.55 | 10 | 80% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 45 | 43% | 98 |
| bvh.mini.Freya 0.55 | 17 | 16% | 25 |
| cs.Wren 1.0 | 12 | 11% | 23 |
| bts.mega.Gnarly 1.4 | 10 | 10% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 9% | 21 |
| kdf.KoulDestroyer 1.0 | 7 | 7% | 13 |
| matt.UnderDark3 2.4.34 | 3 | 3% | 4 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F39

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.9 | 117 / 210 | 2.18 | 18.2% | 28514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.2% | 117 |
| bvh.fry.Freya 0.82 | 2.0 | 14.8% | 26 |
| az.Ololobot 0.2.4 | 3.2 | 12.6% | 46 |
| catcat20.Lambda 0.024 | 3.8 | 11.3% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.1% | 4 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.0% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.6% | 0 |
| gimp.GimpBot 0.1 | 7.3 | 7.5% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 81.0 | 15 / 35 | 4957 |
| 2 | 1 | 66.4 | 85.7 | 18 / 35 | 4419 |
| 3 | 1 | 69.2 | 91.4 | 22 / 35 | 5010 |
| 4 | 1 | 68.8 | 90.5 | 22 / 35 | 4981 |
| 5 | 1 | 67.8 | 88.3 | 21 / 35 | 4556 |
| 6 | 1 | 66.6 | 84.4 | 19 / 35 | 4591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 59 | 49% |
| bvh.fry.Freya 0.82 | 44 | 80% |
| catcat20.Lambda 0.024 | 31 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 94% |
| gimp.GimpBot 0.1 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1158. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 38 | 40% | 67 |
| bvh.fry.Freya 0.82 | 31 | 33% | 65 |
| catcat20.Lambda 0.024 | 9 | 10% | 36 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 10% | 16 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 8 |
| gimp.GimpBot 0.1 | 2 | 2% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 4 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 3 |

## Melee bench: F40

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.2 | 112 / 210 | 2.24 | 18.2% | 27769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.2% | 112 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 43 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.4% | 23 |
| Polkwane.SmashMelee 1.0 | 4.2 | 11.0% | 15 |
| mz.AntiGrav 1.0 | 5.0 | 10.7% | 5 |
| stelo.Randomness 1.0 | 6.2 | 8.9% | 8 |
| alpha.BlackIce 1.0 | 6.5 | 8.6% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.1% | 0 |
| sample.Corners 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.7 | 20 / 35 | 5089 |
| 2 | 1 | 67.0 | 84.8 | 17 / 35 | 4261 |
| 3 | 1 | 67.2 | 84.1 | 18 / 35 | 4654 |
| 4 | 1 | 68.0 | 87.6 | 17 / 35 | 4709 |
| 5 | 1 | 67.2 | 84.4 | 20 / 35 | 4299 |
| 6 | 1 | 68.9 | 89.5 | 20 / 35 | 4757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 61 | 67% |
| Polkwane.SmashMelee 1.0 | 26 | 88% |
| kano.gamma.KanoGamma 1.8 | 20 | 90% |
| mz.AntiGrav 1.0 | 16 | 100% |
| stelo.Randomness 1.0 | 10 | 80% |
| sample.Corners 1.0 | 2 | 100% |
| alpha.BlackIce 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 49 | 50% | 81 |
| kano.gamma.KanoGamma 1.8 | 12 | 12% | 35 |
| Polkwane.SmashMelee 1.0 | 11 | 11% | 29 |
| stelo.Randomness 1.0 | 9 | 9% | 20 |
| mz.AntiGrav 1.0 | 8 | 8% | 22 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 12 |
| alpha.BlackIce 1.0 | 3 | 3% | 5 |
| sample.Corners 1.0 | 1 | 1% | 3 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |

## Melee bench: F41

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.9 | 107 / 210 | 2.36 | 17.2% | 23565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.3 | 17.2% | 107 |
| eem.EvBotNG v12.8 | 1.7 | 16.0% | 64 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 11 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 11.9% | 8 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.1% | 14 |
| shrub.Silver v048 | 6.0 | 9.1% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.1% | 3 |
| stelo.Mirror 1.1 | 8.7 | 5.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.3 | 22 / 35 | 4082 |
| 2 | 2 | 65.2 | 81.3 | 14 / 35 | 3707 |
| 3 | 1 | 67.2 | 86.0 | 20 / 35 | 4059 |
| 4 | 1 | 67.2 | 87.0 | 16 / 35 | 3967 |
| 5 | 2 | 65.4 | 80.3 | 15 / 35 | 3742 |
| 6 | 1 | 68.0 | 88.6 | 20 / 35 | 4008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 67 | 60% |
| ary.Swarm 1.1 | 33 | 85% |
| lessonz.robocode.Oz 0.5.0 | 25 | 96% |
| simonton.nano.MeleeSeed 1.8 | 14 | 71% |
| jsal.Jsalbot 1.0 | 5 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 38 | 37% | 77 |
| ary.Swarm 1.1 | 30 | 29% | 54 |
| simonton.nano.MeleeSeed 1.8 | 16 | 15% | 27 |
| lessonz.robocode.Oz 0.5.0 | 10 | 10% | 27 |
| zyx.nano.Ant 1.1 | 6 | 6% | 8 |
| shrub.Silver v048 | 2 | 2% | 7 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
| jsal.Jsalbot 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.8 | 110 / 210 | 2.28 | 18.0% | 29062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.0% | 110 |
| wompi.Wallaby 5.1 | 2.0 | 15.5% | 53 |
| ara.Shera 0.88 | 3.3 | 13.6% | 30 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.4% | 14 |
| amz.NanoClone 1.41 | 5.0 | 8.8% | 2 |
| dsw.StaticD 1.0 | 6.0 | 7.6% | 2 |
| maribo.IotaCT 1.1 | 7.5 | 6.5% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.1 | 17 / 35 | 4685 |
| 2 | 1 | 69.0 | 87.0 | 19 / 35 | 5593 |
| 3 | 1 | 68.8 | 89.8 | 21 / 35 | 4869 |
| 4 | 1 | 67.7 | 86.0 | 18 / 35 | 4941 |
| 5 | 1 | 66.6 | 82.9 | 16 / 35 | 4555 |
| 6 | 1 | 66.7 | 84.8 | 19 / 35 | 4419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 48 | 73% |
| ara.Shera 0.88 | 40 | 68% |
| maribo.mini.MiniQuester 0.1 | 38 | 95% |
| dsw.StaticD 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 36% | 80 |
| ara.Shera 0.88 | 32 | 32% | 61 |
| maribo.mini.MiniQuester 0.1 | 17 | 17% | 43 |
| amz.NanoClone 1.41 | 5 | 5% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 3% | 4 |
| maribo.IotaCT 1.1 | 3 | 3% | 4 |
| dsw.StaticD 1.0 | 2 | 2% | 9 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 75.4 | 33 / 210 | 3.21 | 14.5% | 21578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 145 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 14.5% | 33 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.7% | 23 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.1% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.9% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.3% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.3% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 74.9 | 4 / 35 | 3506 |
| 2 | 2 | 64.0 | 77.1 | 5 / 35 | 3660 |
| 3 | 2 | 61.4 | 69.2 | 3 / 35 | 3437 |
| 4 | 2 | 63.8 | 76.2 | 5 / 35 | 3719 |
| 5 | 2 | 64.2 | 77.1 | 5 / 35 | 3708 |
| 6 | 2 | 65.4 | 78.1 | 11 / 35 | 3548 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 76 | 17% |
| brainfade.melee.Dusk 0.44 | 17 | 71% |
| dummy.micro.Sparrow 2.5 | 5 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 98 | 55% | 111 |
| dummy.micro.Sparrow 2.5 | 26 | 15% | 30 |
| brainfade.melee.Dusk 0.44 | 24 | 13% | 35 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 9% | 19 |
| Krabb.akim2.Akim2 1.1b | 8 | 4% | 9 |
| jab.DiamondStealer 5 | 2 | 1% | 3 |
| mz.NanoGod 2.02 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.4 | 121 / 210 | 1.96 | 19.2% | 30995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.2% | 121 |
| stelo.Liblix 0.3.1 | 2.3 | 15.4% | 55 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.8% | 27 |
| wompi.Quokka 1.6 | 4.2 | 10.4% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.0% | 0 |
| jwirde.Gort 2.0 | 6.0 | 8.7% | 3 |
| stf.PanzerGeneral 0.1 | 7.3 | 6.8% | 0 |
| disan.Chair 2.2.0 | 7.3 | 6.9% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.5% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.8 | 19 / 35 | 4918 |
| 2 | 1 | 70.6 | 92.1 | 23 / 35 | 5433 |
| 3 | 1 | 69.8 | 89.5 | 24 / 35 | 5162 |
| 4 | 1 | 69.6 | 89.8 | 18 / 35 | 5175 |
| 5 | 1 | 69.7 | 90.2 | 19 / 35 | 5273 |
| 6 | 1 | 69.0 | 89.8 | 18 / 35 | 5034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 77 | 68% |
| tzu.TheArtOfWar 1.2 | 59 | 73% |
| wompi.Quokka 1.6 | 14 | 86% |
| disan.Chair 2.2.0 | 6 | 100% |
| jwirde.Gort 2.0 | 5 | 40% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 42 | 47% | 106 |
| tzu.TheArtOfWar 1.2 | 31 | 34% | 65 |
| wompi.Quokka 1.6 | 8 | 9% | 12 |
| jwirde.Gort 2.0 | 3 | 3% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 3% | 6 |
| disan.Chair 2.2.0 | 2 | 2% | 6 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.1 | 98 / 210 | 2.07 | 19.9% | 36221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.9% | 98 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.6% | 94 |
| jje.BagPuss 1.2 | 3.2 | 11.5% | 3 |
| sul.Lunar 1.1 | 4.3 | 10.7% | 6 |
| myl.nano.Graviton 1.10 | 4.7 | 10.5% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 6.3 | 8.8% | 3 |
| fm.claire 1.7 | 6.3 | 8.9% | 1 |
| hvilela.HVilela 0.9 | 7.8 | 7.6% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.2% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.3 | 16 / 35 | 6447 |
| 2 | 1 | 70.9 | 93.0 | 13 / 35 | 6553 |
| 3 | 1 | 70.2 | 88.3 | 22 / 35 | 5932 |
| 4 | 1 | 69.4 | 88.9 | 16 / 35 | 5879 |
| 5 | 1 | 72.2 | 95.6 | 21 / 35 | 6531 |
| 6 | 1 | 64.4 | 74.9 | 10 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 116 | 32% |
| sul.Lunar 1.1 | 18 | 94% |
| myl.nano.Graviton 1.10 | 17 | 94% |
| jje.BagPuss 1.2 | 12 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 91% |
| fm.claire 1.7 | 5 | 100% |
| wit.Deep7 2.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 2328. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 81 | 72% | 0 |
| jje.BagPuss 1.2 | 8 | 7% | 50 |
| myl.nano.Graviton 1.10 | 8 | 7% | 50 |
| sul.Lunar 1.1 | 4 | 4% | 57 |
| fm.claire 1.7 | 4 | 4% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 3% | 22 |
| hvilela.HVilela 0.9 | 3 | 3% | 10 |
| wit.Deep7 2.0 | 1 | 1% | 4 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |

## Melee bench: F46

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.8 | 66 / 210 | 2.37 | 16.7% | 25817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.8 | 16.8% | 59 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 16.7% | 66 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.4% | 77 |
| mz.MicroSheep 1.0 | 4.5 | 10.5% | 2 |
| cx.Princess 1.0 | 5.2 | 9.7% | 6 |
| sadoner.killer 0.2 | 5.3 | 9.6% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.3% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 84.1 | 10 / 35 | 4363 |
| 2 | 1 | 68.0 | 88.9 | 17 / 35 | 4418 |
| 3 | 2 | 66.3 | 84.8 | 7 / 35 | 4438 |
| 4 | 2 | 66.5 | 84.4 | 14 / 35 | 4253 |
| 5 | 3 | 65.3 | 83.2 | 7 / 35 | 4252 |
| 6 | 3 | 66.0 | 83.2 | 11 / 35 | 4093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 63 | 54% |
| rsalesc.melee.Medina 0.4.5 | 56 | 34% |
| cx.Princess 1.0 | 6 | 67% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| sadoner.killer 0.2 | 3 | 100% |
| mz.MicroSheep 1.0 | 3 | 67% |

Hadur died in 145 of 210 rounds, at a mean tick of 1076. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 61 | 42% | 96 |
| rsalesc.melee.Medina 0.4.5 | 59 | 41% | 80 |
| cx.Princess 1.0 | 9 | 6% | 14 |
| mz.MicroSheep 1.0 | 6 | 4% | 7 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 5 |
| sadoner.killer 0.2 | 4 | 3% | 4 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

