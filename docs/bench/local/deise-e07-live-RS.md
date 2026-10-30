# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 87.0 | 49 / 210 | 2.17 | 17.1% | 29209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 150 |
| hadur117.mini.DeiseRS 0.4 | 2.0 | 17.1% | 49 |
| mz.MicroGodMelee 1 | 3.5 | 11.1% | 4 |
| sgp.JollyNinja 3.53 | 4.3 | 10.9% | 7 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.5% | 0 |
| lorneswork.Predator 1.0 | 5.7 | 9.2% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 85.7 | 10 / 35 | 4703 |
| 2 | 2 | 66.3 | 85.4 | 10 / 35 | 4584 |
| 3 | 2 | 67.3 | 87.6 | 9 / 35 | 4995 |
| 4 | 2 | 67.3 | 88.3 | 8 / 35 | 4941 |
| 5 | 2 | 66.1 | 85.4 | 7 / 35 | 4742 |
| 6 | 2 | 67.9 | 89.5 | 5 / 35 | 5244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 145 | 13% |
| sgp.JollyNinja 3.53 | 11 | 82% |
| mz.MicroGodMelee 1 | 10 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 1304. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 137 | 85% | 159 |
| sgp.JollyNinja 3.53 | 10 | 6% | 16 |
| mz.MicroGodMelee 1 | 7 | 4% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 10 |
| lorneswork.Predator 1.0 | 1 | 1% | 6 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| adt.Ar2 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.0 | 111 / 210 | 2.35 | 18.2% | 29358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 18.2% | 111 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.0% | 42 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.7% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.9% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.5% | 8 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.1% | 1 |
| Noran.BitchingElk 0.054 | 7.2 | 7.6% | 10 |
| stelo.PatternRobot 1.0 | 8.2 | 6.8% | 5 |
| sch.Simone 0.3d | 8.2 | 6.8% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 26 / 35 | 5030 |
| 2 | 1 | 66.9 | 84.4 | 14 / 35 | 4748 |
| 3 | 1 | 67.6 | 83.5 | 22 / 35 | 4823 |
| 4 | 1 | 66.4 | 81.6 | 16 / 35 | 4849 |
| 5 | 1 | 66.0 | 80.3 | 16 / 35 | 4638 |
| 6 | 1 | 68.4 | 88.3 | 17 / 35 | 5270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 50 | 80% |
| pulsar.PulsarMax 0.8.9 | 46 | 70% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 82% |
| Noran.BitchingElk 0.054 | 11 | 64% |
| sch.Simone 0.3d | 6 | 67% |
| stelo.PatternRobot 1.0 | 5 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |

Hadur died in 100 of 210 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 32 | 32% | 58 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 21 | 21% | 62 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 12% | 16 |
| stelo.PatternRobot 1.0 | 11 | 11% | 13 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 7% | 22 |
| Noran.BitchingElk 0.054 | 7 | 7% | 21 |
| sch.Simone 0.3d | 5 | 5% | 8 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 7 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 94.1 | 156 / 210 | 1.53 | 20.3% | 35717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 20.3% | 156 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.1% | 12 |
| radnor.DoctorBob 1.42 | 3.0 | 13.2% | 8 |
| vuen.Cake 2.51 | 3.0 | 13.1% | 33 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 0 |
| adt.Ar1 2.1 | 6.5 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.1% | 1 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.5 | 25 / 35 | 5914 |
| 2 | 1 | 69.8 | 93.0 | 27 / 35 | 5564 |
| 3 | 1 | 71.1 | 96.5 | 28 / 35 | 6124 |
| 4 | 1 | 71.3 | 95.2 | 25 / 35 | 6453 |
| 5 | 1 | 71.9 | 97.5 | 29 / 35 | 6293 |
| 6 | 1 | 69.0 | 92.1 | 22 / 35 | 5369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 82 | 74% |
| kawigi.nano.Lib 1.0 | 56 | 89% |
| radnor.DoctorBob 1.42 | 41 | 93% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 1028. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 24 | 44% | 85 |
| radnor.DoctorBob 1.42 | 13 | 24% | 47 |
| kawigi.nano.Lib 1.0 | 11 | 20% | 60 |
| urdos.URDOS 1.3 | 4 | 7% | 8 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 2 |
| adt.Ar1 2.1 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.7 | 31 / 210 | 2.20 | 17.5% | 33563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 173 |
| hadur117.mini.DeiseRS 0.4 | 2.0 | 17.5% | 31 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 6 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 1 |
| josago.Jorgito 0.16 | 5.2 | 8.7% | 0 |
| css.Delitioner 0.11 | 6.3 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 86.3 | 7 / 35 | 5992 |
| 2 | 2 | 67.7 | 87.0 | 4 / 35 | 5341 |
| 3 | 2 | 68.8 | 87.3 | 4 / 35 | 5993 |
| 4 | 2 | 68.5 | 86.3 | 9 / 35 | 5667 |
| 5 | 2 | 68.2 | 87.9 | 4 / 35 | 5435 |
| 6 | 2 | 67.0 | 85.4 | 3 / 35 | 5135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 158 | 13% |
| apc.LeeroyJenkins2 1.0 | 6 | 67% |
| TNT.TNT 0.99.1 | 4 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 1457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 155 | 86% | 176 |
| apc.LeeroyJenkins2 1.0 | 18 | 10% | 23 |
| TNT.TNT 0.99.1 | 4 | 2% | 7 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.1 | 27 / 210 | 3.06 | 14.5% | 21725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.5% | 110 |
| justin.DemonicRage 3.4 | 1.8 | 17.2% | 59 |
| hadur117.mini.DeiseRS 0.4 | 3.0 | 14.5% | 27 |
| wompi.Numbat 2.1 | 4.0 | 12.1% | 9 |
| ms.Ares 0.19 | 5.2 | 9.4% | 3 |
| axeBots.HataMoto 3.09 | 5.8 | 8.5% | 3 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 78.7 | 5 / 35 | 3572 |
| 2 | 3 | 63.5 | 78.7 | 3 / 35 | 3816 |
| 3 | 3 | 62.6 | 74.9 | 6 / 35 | 3580 |
| 4 | 3 | 64.4 | 81.6 | 6 / 35 | 3716 |
| 5 | 3 | 61.2 | 71.1 | 4 / 35 | 3513 |
| 6 | 3 | 62.9 | 77.8 | 3 / 35 | 3528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 48 | 6% |
| justin.DemonicRage 3.4 | 36 | 39% |
| wompi.Numbat 2.1 | 9 | 78% |
| ms.Ares 0.19 | 4 | 50% |
| axeBots.HataMoto 3.09 | 2 | 50% |

Hadur died in 184 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 78 | 42% | 83 |
| justin.DemonicRage 3.4 | 60 | 33% | 73 |
| wompi.Numbat 2.1 | 21 | 11% | 27 |
| ms.Ares 0.19 | 10 | 5% | 11 |
| axeBots.HataMoto 3.09 | 7 | 4% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.3 | 113 / 210 | 2.23 | 18.2% | 28454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 18.2% | 113 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 28 |
| origin.SleepSiphon 1.7b | 3.3 | 13.1% | 39 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.3% | 18 |
| mld.Wisdom 1.0 | 4.8 | 10.5% | 6 |
| gg.Wolverine 2.0 | 6.2 | 8.4% | 0 |
| DBall.NUKE 0.1 | 7.7 | 6.6% | 1 |
| spinnercat.Omen 1.0 | 7.8 | 6.5% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.3% | 4 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 15 / 35 | 4933 |
| 2 | 1 | 67.6 | 85.1 | 19 / 35 | 4690 |
| 3 | 1 | 68.6 | 89.5 | 19 / 35 | 4845 |
| 4 | 1 | 67.3 | 85.7 | 18 / 35 | 4524 |
| 5 | 1 | 67.5 | 84.1 | 20 / 35 | 4736 |
| 6 | 1 | 68.4 | 87.6 | 22 / 35 | 4726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 50 | 68% |
| jekl.StoneGhost 0.7 | 48 | 81% |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 57% |
| gg.Wolverine 2.0 | 6 | 100% |
| mld.Wisdom 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 31 | 32% | 63 |
| origin.SleepSiphon 1.7b | 27 | 28% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 21% | 44 |
| mld.Wisdom 1.0 | 8 | 8% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 12 |
| gg.Wolverine 2.0 | 4 | 4% | 9 |
| DBall.NUKE 0.1 | 2 | 2% | 3 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.8 | 129 / 210 | 1.56 | 20.0% | 34255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 20.0% | 129 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.1% | 45 |
| rtk.Tachikoma 1.0 | 2.7 | 16.2% | 28 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.8% | 3 |
| franzor.Lizt 1.3.1 | 4.8 | 10.2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 1 |
| sample.Target 1.0 | 9.5 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.0 | 23 / 35 | 5863 |
| 2 | 1 | 70.6 | 91.4 | 20 / 35 | 5470 |
| 3 | 1 | 71.5 | 95.2 | 23 / 35 | 5506 |
| 4 | 1 | 71.7 | 94.0 | 22 / 35 | 6088 |
| 5 | 1 | 71.0 | 94.0 | 19 / 35 | 5717 |
| 6 | 1 | 71.5 | 94.3 | 22 / 35 | 5611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 102 | 76% |
| rsalesc.melee.Monk 0.3.6c | 49 | 24% |
| oog.melee.CapuletDroid 1.1 | 30 | 97% |
| franzor.Lizt 1.3.1 | 11 | 82% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 46 | 56% | 64 |
| rtk.Tachikoma 1.0 | 29 | 35% | 108 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 30 |
| franzor.Lizt 1.3.1 | 3 | 4% | 0 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 5 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 91.2 | 137 / 210 | 1.80 | 19.6% | 30675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 19.6% | 137 |
| shrub.Vapour v159 | 2.2 | 13.3% | 25 |
| tm.Yuugao 1.0 | 3.0 | 12.3% | 32 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.3% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.2% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.2% | 2 |
| m3thos.Eva00 1.1 | 7.0 | 7.6% | 0 |
| SHAM.WOW 1.4 | 8.5 | 6.8% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.4% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 24 / 35 | 5149 |
| 2 | 1 | 69.8 | 92.7 | 26 / 35 | 5002 |
| 3 | 1 | 69.9 | 93.3 | 23 / 35 | 5219 |
| 4 | 1 | 69.9 | 92.4 | 23 / 35 | 5310 |
| 5 | 1 | 69.0 | 91.1 | 22 / 35 | 5219 |
| 6 | 1 | 66.8 | 85.4 | 19 / 35 | 4776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 65% |
| shrub.Vapour v159 | 47 | 68% |
| Krabb.sliNk.Garm 0.9u | 33 | 82% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 100% |
| m3thos.Eva00 1.1 | 6 | 100% |
| SHAM.WOW 1.4 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 26 | 35% | 65 |
| shrub.Vapour v159 | 22 | 29% | 60 |
| Krabb.sliNk.Garm 0.9u | 14 | 19% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 7% | 15 |
| zyx.nano.BacillusComma 1.0 | 4 | 5% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 3 | 4% | 17 |
| m3thos.Eva00 1.1 | 1 | 1% | 5 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.4 | 63 / 210 | 3.03 | 15.8% | 24068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.7% | 103 |
| hadur117.mini.DeiseRS 0.4 | 1.8 | 15.8% | 63 |
| kc.micro.Figment 1.0 | 3.2 | 13.1% | 17 |
| yagami.Tidus 0.11 | 4.5 | 10.9% | 3 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.5% | 17 |
| mc2.enemy.Original 0.9 | 5.7 | 9.5% | 8 |
| dft.Calliope 5.6 | 7.3 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 73.3 | 4 / 35 | 3860 |
| 2 | 2 | 63.4 | 75.9 | 7 / 35 | 3927 |
| 3 | 2 | 63.4 | 72.4 | 13 / 35 | 3903 |
| 4 | 1 | 65.9 | 81.9 | 13 / 35 | 4029 |
| 5 | 2 | 67.9 | 86.3 | 17 / 35 | 4416 |
| 6 | 2 | 63.7 | 74.6 | 9 / 35 | 3933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 74 | 35% |
| kc.micro.Figment 1.0 | 26 | 77% |
| yagami.Tidus 0.11 | 10 | 80% |
| mc2.enemy.Original 0.9 | 9 | 56% |
| pedersen.Grishnakh 1.0 | 6 | 33% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 75 | 51% | 100 |
| kc.micro.Figment 1.0 | 20 | 14% | 41 |
| yagami.Tidus 0.11 | 13 | 9% | 23 |
| pedersen.Grishnakh 1.0 | 13 | 9% | 13 |
| mc2.enemy.Original 0.9 | 9 | 6% | 13 |
| step.nanoPri 1.0 | 6 | 4% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 7 |
| dft.Calliope 5.6 | 5 | 3% | 5 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 95.6 | 166 / 210 | 1.40 | 20.3% | 31711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 20.3% | 166 |
| DTF.Kludgy 1.2b | 2.2 | 14.4% | 28 |
| ejb.Polaris 1.0.1 | 3.0 | 12.7% | 6 |
| ne.Chimera 1.2 | 3.8 | 12.5% | 5 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 1 |
| vStar.RAFzilla 2.15 | 5.5 | 9.5% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.6% | 1 |
| sam.Samspin 1.0 | 8.2 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 4.6% | 1 |
| kurios.DOSexe .9b | 9.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 95.6 | 28 / 35 | 5041 |
| 2 | 1 | 72.0 | 98.7 | 32 / 35 | 5492 |
| 3 | 1 | 69.0 | 90.8 | 23 / 35 | 4980 |
| 4 | 1 | 71.8 | 97.1 | 28 / 35 | 5986 |
| 5 | 1 | 71.5 | 98.7 | 31 / 35 | 5281 |
| 6 | 1 | 69.4 | 92.4 | 24 / 35 | 4931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 67 | 73% |
| ejb.Polaris 1.0.1 | 52 | 98% |
| ne.Chimera 1.2 | 27 | 89% |
| vStar.RAFzilla 2.15 | 18 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| donjezza.Muncho 1.0 | 6 | 83% |
| sam.Samspin 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 25 | 57% | 69 |
| ne.Chimera 1.2 | 8 | 18% | 36 |
| ejb.Polaris 1.0.1 | 7 | 16% | 66 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 5% | 2 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 9 |
| donjezza.Muncho 1.0 | 1 | 2% | 5 |
| vStar.RAFzilla 2.15 | 0 | 0% | 13 |
| kurios.DOSexe .9b | 0 | 0% | 6 |
| sam.Samspin 1.0 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.4 | 91 / 210 | 2.49 | 17.3% | 26272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.2 | 17.3% | 91 |
| rz.Aleph 0.34 | 1.8 | 15.9% | 62 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.0% | 18 |
| djc.DynaBot 0.1.1 | 4.0 | 10.9% | 13 |
| rdt199.Warlord 0.73 | 5.7 | 8.9% | 4 |
| br2.MobyDickBot 1.6 | 6.0 | 9.1% | 14 |
| uji.YellohFellah 1.0 | 6.7 | 8.3% | 8 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.2% | 0 |
| stelo.MirrorNano 1.3 | 9.2 | 5.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 79.0 | 12 / 35 | 4094 |
| 2 | 1 | 67.4 | 86.7 | 16 / 35 | 4553 |
| 3 | 1 | 65.3 | 81.3 | 14 / 35 | 4209 |
| 4 | 1 | 66.0 | 81.9 | 15 / 35 | 4658 |
| 5 | 1 | 66.6 | 84.8 | 16 / 35 | 4409 |
| 6 | 1 | 67.2 | 87.0 | 18 / 35 | 4349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 53 | 51% |
| djc.DynaBot 0.1.1 | 23 | 74% |
| uji.YellohFellah 1.0 | 16 | 88% |
| cx.mini.Nimrod 0.55 | 14 | 86% |
| br2.MobyDickBot 1.6 | 13 | 54% |
| rdt199.Warlord 0.73 | 13 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 61 | 51% | 88 |
| cx.mini.Nimrod 0.55 | 16 | 13% | 26 |
| djc.DynaBot 0.1.1 | 14 | 12% | 31 |
| KiraNL.Chupacabra 0.4 | 8 | 7% | 10 |
| rdt199.Warlord 0.73 | 7 | 6% | 20 |
| br2.MobyDickBot 1.6 | 7 | 6% | 18 |
| uji.YellohFellah 1.0 | 5 | 4% | 15 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.4 | 112 / 210 | 2.67 | 16.9% | 22646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 16.9% | 112 |
| darkcanuck.Leon 1.01 | 2.7 | 12.8% | 32 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.6% | 23 |
| nat.PallasHawk 1.0 | 3.3 | 12.6% | 28 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.0% | 13 |
| jrm.Test0 1.0 | 6.7 | 7.7% | 0 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.4% | 0 |
| jp.Perpy 16.0 | 7.3 | 7.1% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 6.1% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 85.4 | 22 / 35 | 3777 |
| 2 | 1 | 63.4 | 75.9 | 15 / 35 | 3531 |
| 3 | 1 | 68.0 | 87.6 | 25 / 35 | 4059 |
| 4 | 1 | 66.3 | 84.4 | 20 / 35 | 3837 |
| 5 | 1 | 65.1 | 80.3 | 17 / 35 | 3914 |
| 6 | 1 | 62.7 | 74.9 | 13 / 35 | 3528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 44 | 73% |
| bts.wiki.RipCurl 0.9b | 43 | 91% |
| nat.PallasHawk 1.0 | 36 | 75% |
| brainfade.melee.Genghis 0.36 | 12 | 75% |
| jaybot.bots.Oddball 4.0 | 3 | 67% |
| jp.Perpy 16.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 23 | 23% | 60 |
| nat.PallasHawk 1.0 | 19 | 19% | 47 |
| brainfade.melee.Genghis 0.36 | 14 | 14% | 20 |
| jrm.Test0 1.0 | 13 | 13% | 14 |
| bts.wiki.RipCurl 0.9b | 11 | 11% | 44 |
| cs.sheldor.Talon 1.1 | 8 | 8% | 8 |
| jaybot.bots.Oddball 4.0 | 4 | 4% | 7 |
| jp.Perpy 16.0 | 4 | 4% | 6 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |

## Melee bench: F13

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.9 | 77 / 210 | 2.36 | 16.8% | 26400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.9% | 82 |
| ags.Glacier 0.2.11 | 2.0 | 16.5% | 33 |
| hadur117.mini.DeiseRS 0.4 | 2.2 | 16.8% | 77 |
| shinh.Entangled 0.3 | 4.2 | 11.6% | 13 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.0% | 5 |
| apc.Colossus2 0.17 | 6.3 | 7.6% | 1 |
| stelo.Wang 1.0 | 6.8 | 6.5% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.2% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.3% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.1 | 20 / 35 | 4558 |
| 2 | 1 | 67.9 | 88.9 | 17 / 35 | 4484 |
| 3 | 2 | 66.6 | 85.7 | 13 / 35 | 4412 |
| 4 | 3 | 65.5 | 82.5 | 9 / 35 | 4307 |
| 5 | 3 | 64.6 | 78.4 | 9 / 35 | 4255 |
| 6 | 3 | 65.8 | 82.9 | 9 / 35 | 4384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 66 | 35% |
| ags.Glacier 0.2.11 | 49 | 78% |
| shinh.Entangled 0.3 | 21 | 67% |
| stelo.Wang 1.0 | 2 | 100% |
| gh.micro.Gruweltje 0.7 | 1 | 0% |

Hadur died in 134 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 63 | 47% | 94 |
| ags.Glacier 0.2.11 | 38 | 28% | 69 |
| shinh.Entangled 0.3 | 15 | 11% | 27 |
| gh.micro.Gruweltje 0.7 | 10 | 7% | 11 |
| stelo.Wang 1.0 | 5 | 4% | 7 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 92.8 | 156 / 210 | 1.65 | 20.1% | 32508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 20.1% | 156 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 23 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.2% | 26 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.5% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.3% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.2% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 8.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.6% | 4 |
| pa.Improved 1.0 | 9.0 | 5.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.0 | 27 / 35 | 5568 |
| 2 | 1 | 69.3 | 88.9 | 24 / 35 | 5376 |
| 3 | 1 | 71.2 | 94.9 | 26 / 35 | 5546 |
| 4 | 1 | 70.4 | 94.6 | 27 / 35 | 5039 |
| 5 | 1 | 70.4 | 93.3 | 27 / 35 | 5276 |
| 6 | 1 | 70.4 | 91.1 | 25 / 35 | 5703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 96 | 92% |
| catcat20.shape.Theta 0.018 | 53 | 74% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 85% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 21 | 39% | 48 |
| simonton.micro.Sprout 1.1.3 | 18 | 33% | 100 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 9% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 6% | 14 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 6% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 7 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.1 | 109 / 210 | 2.25 | 18.6% | 31655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 18.6% | 109 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.4% | 17 |
| emp.Yngwie 1.11 | 3.0 | 13.1% | 49 |
| mld.DustBunny 3.8 | 3.8 | 12.1% | 12 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.7% | 7 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.0% | 13 |
| lambdaxy.TBot 0.1 | 7.2 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 8.3 | 6.0% | 1 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.3 | 17 / 35 | 5190 |
| 2 | 1 | 70.0 | 88.6 | 22 / 35 | 5655 |
| 3 | 1 | 67.7 | 84.8 | 15 / 35 | 5201 |
| 4 | 1 | 69.9 | 90.2 | 23 / 35 | 5385 |
| 5 | 1 | 67.6 | 85.1 | 17 / 35 | 5055 |
| 6 | 1 | 67.2 | 81.9 | 15 / 35 | 5169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 58% |
| kawigi.micro.Shiz 1.1 | 36 | 86% |
| kawigi.robot.Girl 1.2 | 22 | 82% |
| cb.nano.Insomnia 1.0 | 21 | 95% |
| mld.DustBunny 3.8 | 14 | 100% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 38 | 38% | 72 |
| kawigi.robot.Girl 1.2 | 16 | 16% | 28 |
| cb.nano.Insomnia 1.0 | 16 | 16% | 23 |
| mld.DustBunny 3.8 | 12 | 12% | 30 |
| kawigi.micro.Shiz 1.1 | 11 | 11% | 35 |
| Grystrion.TrackerWO 1.0 | 4 | 4% | 5 |
| divineomega.TrialBot 0.003 | 3 | 3% | 11 |
| lambdaxy.TBot 0.1 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.0 | 100 / 210 | 2.26 | 18.9% | 33721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 18.9% | 100 |
| gh.Griezel 0.5.2 | 2.0 | 16.8% | 69 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.5% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.4% | 27 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.3% | 1 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 5 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.6% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.2% | 2 |
| asd.Cthulhu 1.3 | 9.0 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.0 | 18 / 35 | 5335 |
| 2 | 1 | 68.6 | 86.0 | 17 / 35 | 5503 |
| 3 | 1 | 69.7 | 88.6 | 17 / 35 | 5845 |
| 4 | 1 | 68.5 | 85.7 | 15 / 35 | 5525 |
| 5 | 1 | 68.6 | 85.4 | 13 / 35 | 5573 |
| 6 | 1 | 69.6 | 83.5 | 20 / 35 | 5940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 87 | 60% |
| techdude.forest.FlamingForest 1.1 | 21 | 38% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 100% |
| divineomega.DivineBot 1.9.4.5 | 8 | 100% |
| tvv.nano.Polaris 1.2 | 8 | 100% |
| bvh.fnr.Fenrir 0.36l | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1332. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 51 | 46% | 101 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 16% | 33 |
| techdude.forest.FlamingForest 1.1 | 17 | 15% | 29 |
| bvh.fnr.Fenrir 0.36l | 12 | 11% | 13 |
| divineomega.DivineBot 1.9.4.5 | 5 | 5% | 13 |
| stelo.IntrinsicVolatility 1.4 | 5 | 5% | 10 |
| asd.Cthulhu 1.3 | 2 | 2% | 4 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.3 | 104 / 210 | 2.50 | 17.8% | 29706 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 17.8% | 104 |
| et.Predator 1.8 | 2.5 | 13.0% | 21 |
| cx.BlestPain 1.41 | 3.8 | 12.3% | 35 |
| oog.melee.Mercutio 1.0 | 3.8 | 12.1% | 25 |
| nic.Nicator 2.4 | 4.2 | 11.8% | 16 |
| ahf.NanoAndrew .4 | 5.8 | 10.4% | 9 |
| maribo.melee.BMV 0.1 | 6.8 | 8.9% | 0 |
| tex.Longbot 0.4 | 8.3 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.3% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 77.8 | 14 / 35 | 4861 |
| 2 | 1 | 66.9 | 81.3 | 18 / 35 | 4729 |
| 3 | 1 | 68.0 | 85.1 | 22 / 35 | 4784 |
| 4 | 1 | 66.5 | 83.5 | 9 / 35 | 4888 |
| 5 | 1 | 68.5 | 86.3 | 22 / 35 | 5136 |
| 6 | 1 | 68.4 | 85.7 | 19 / 35 | 5308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 52 | 85% |
| oog.melee.Mercutio 1.0 | 33 | 73% |
| nic.Nicator 2.4 | 29 | 76% |
| cx.BlestPain 1.41 | 19 | 26% |
| ahf.NanoAndrew .4 | 7 | 100% |
| maribo.melee.BMV 0.1 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1050. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 33% | 43 |
| et.Predator 1.8 | 24 | 23% | 59 |
| nic.Nicator 2.4 | 17 | 16% | 39 |
| oog.melee.Mercutio 1.0 | 14 | 13% | 38 |
| ahf.NanoAndrew .4 | 10 | 9% | 20 |
| maribo.melee.BMV 0.1 | 5 | 5% | 7 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.7 | 125 / 210 | 2.20 | 18.3% | 26996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 18.3% | 125 |
| morbid.MorbidPriest 1.0 | 2.2 | 14.0% | 30 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.7% | 30 |
| uji.DBH 1.1 | 3.8 | 10.8% | 11 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.1% | 5 |
| ratosh.Nobo 0.21 | 5.7 | 9.5% | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.5% | 2 |
| sigterm.Sigterm 1.0 | 7.7 | 7.2% | 2 |
| stelo.WangRobot 1.0 | 9.0 | 5.8% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.2 | 20 / 35 | 4482 |
| 2 | 1 | 68.5 | 90.5 | 21 / 35 | 4500 |
| 3 | 1 | 68.0 | 87.0 | 21 / 35 | 4797 |
| 4 | 1 | 67.8 | 88.3 | 23 / 35 | 4128 |
| 5 | 1 | 68.1 | 87.6 | 20 / 35 | 4591 |
| 6 | 1 | 67.1 | 84.8 | 20 / 35 | 4498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 56 | 80% |
| agd.Mooserwirt2 2.7 | 37 | 62% |
| uji.DBH 1.1 | 22 | 77% |
| stelo.WangRobot 1.0 | 13 | 92% |
| sigterm.Sigterm 1.0 | 10 | 90% |
| ratosh.Nobo 0.21 | 8 | 100% |
| spinnercat.Robovirus 2.718 | 6 | 83% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 24 | 28% | 71 |
| agd.Mooserwirt2 2.7 | 21 | 25% | 50 |
| uji.DBH 1.1 | 14 | 16% | 26 |
| ratosh.Nobo 0.21 | 11 | 13% | 23 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 12 |
| sigterm.Sigterm 1.0 | 3 | 4% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 4 |
| stelo.WangRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F19

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 95.7 | 172 / 210 | 1.39 | 21.4% | 35775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 21.4% | 172 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 13.8% | 8 |
| mld.Infinity 2.2 | 2.7 | 13.7% | 27 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.5% | 3 |
| erdnis.Rover 0.3 | 5.0 | 9.8% | 0 |
| patson.PatsonTestBot 1.0 | 5.7 | 8.4% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.3% | 0 |
| pac.ABC 2.1 | 7.8 | 7.0% | 1 |
| pbg.R2D2 1.0 | 9.0 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.3 | 27 / 35 | 5998 |
| 2 | 1 | 72.4 | 95.9 | 29 / 35 | 5674 |
| 3 | 1 | 72.3 | 96.5 | 27 / 35 | 6027 |
| 4 | 1 | 71.5 | 91.4 | 27 / 35 | 5917 |
| 5 | 1 | 73.2 | 98.7 | 32 / 35 | 6225 |
| 6 | 1 | 72.4 | 98.1 | 30 / 35 | 5934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 91 | 96% |
| mld.Infinity 2.2 | 60 | 77% |
| krillr.mini.JointStrike 2.0.0 | 9 | 100% |
| pac.ABC 2.1 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| erdnis.Rover 0.3 | 8 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 1591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 18 | 46% | 29 |
| davidalves.net.DuelistMiniMelee 1.2 | 13 | 33% | 102 |
| patson.PatsonTestBot 1.0 | 3 | 8% | 18 |
| krillr.mini.JointStrike 2.0.0 | 2 | 5% | 23 |
| erdnis.Rover 0.3 | 2 | 5% | 17 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
| pac.ABC 2.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.8 | 140 / 210 | 1.82 | 20.2% | 34667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 20.2% | 140 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.0% | 31 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.5% | 5 |
| fwb.Nine 1.0.1 | 3.7 | 11.8% | 21 |
| catcat20.Rabbit 0.001 | 4.7 | 10.5% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.3% | 2 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.1% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.7% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 4.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.9 | 25 / 35 | 5733 |
| 2 | 1 | 70.8 | 91.4 | 25 / 35 | 5944 |
| 3 | 1 | 69.5 | 90.2 | 17 / 35 | 5722 |
| 4 | 1 | 71.4 | 93.3 | 28 / 35 | 5717 |
| 5 | 1 | 70.8 | 91.7 | 23 / 35 | 5712 |
| 6 | 1 | 70.3 | 89.5 | 22 / 35 | 5839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 67 | 84% |
| fwb.Nine 1.0.1 | 38 | 63% |
| catcat20.Rabbit 0.001 | 30 | 80% |
| nz.jdc.nano.GridFu 1.0 | 15 | 87% |
| bayen.nut.Squirrel 1.615 | 13 | 100% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1335. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 28 | 40% | 92 |
| fwb.Nine 1.0.1 | 20 | 29% | 16 |
| nz.jdc.nano.GridFu 1.0 | 12 | 17% | 36 |
| catcat20.Rabbit 0.001 | 7 | 10% | 30 |
| bayen.nut.Squirrel 1.615 | 1 | 1% | 15 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 13 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.0 | 131 / 210 | 1.72 | 20.3% | 35088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 20.3% | 131 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 62 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.2% | 3 |
| eld.Hmm 1.0 | 5.3 | 8.6% | 8 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.7% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.9 | 27 / 35 | 6050 |
| 2 | 1 | 70.7 | 90.5 | 20 / 35 | 6050 |
| 3 | 1 | 70.2 | 91.7 | 18 / 35 | 5721 |
| 4 | 1 | 71.0 | 94.0 | 24 / 35 | 5598 |
| 5 | 1 | 68.9 | 86.3 | 17 / 35 | 5625 |
| 6 | 1 | 71.8 | 94.6 | 25 / 35 | 6044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 120 | 68% |
| dummy.mini.Scimitar 1.01 | 31 | 97% |
| cf.RiO.RiOx 4.2.1 | 12 | 100% |
| eld.Hmm 1.0 | 9 | 67% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 48 | 59% | 103 |
| dummy.mini.Scimitar 1.01 | 19 | 23% | 62 |
| cf.RiO.RiOx 4.2.1 | 6 | 7% | 18 |
| eld.Hmm 1.0 | 5 | 6% | 17 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 7 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
| PSW.Relentless 0.1 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.4 | 118 / 210 | 1.86 | 19.1% | 31066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 19.1% | 118 |
| pe.SandboxDT 2.71m | 2.5 | 15.3% | 43 |
| kvk.HebusLeTroll 0.35 | 2.5 | 14.9% | 34 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 14 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 1 |
| yk.JahRoslav 1.1 | 6.2 | 6.9% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.5 | 16 / 35 | 5286 |
| 2 | 1 | 70.5 | 93.0 | 24 / 35 | 5285 |
| 3 | 1 | 70.0 | 93.3 | 23 / 35 | 4909 |
| 4 | 1 | 69.4 | 88.9 | 21 / 35 | 5267 |
| 5 | 1 | 69.3 | 88.9 | 18 / 35 | 5144 |
| 6 | 1 | 68.5 | 88.9 | 16 / 35 | 5175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 52 | 69% |
| jlm.javaDisturbance 0.59 | 48 | 90% |
| pe.SandboxDT 2.71m | 40 | 53% |
| bigpete.Stewie 1.0 | 13 | 92% |
| yk.JahRoslav 1.1 | 4 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 33 | 35% | 67 |
| pe.SandboxDT 2.71m | 32 | 34% | 59 |
| jlm.javaDisturbance 0.59 | 25 | 27% | 60 |
| tad.Dalek98 0.98 | 2 | 2% | 2 |
| bigpete.Stewie 1.0 | 1 | 1% | 12 |
| yk.JahRoslav 1.1 | 0 | 0% | 7 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.1 | 132 / 210 | 1.71 | 19.9% | 31625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 19.9% | 132 |
| pe.SandboxLump 1.52 | 2.0 | 17.4% | 54 |
| cre.Karolos 0.32 | 3.0 | 14.6% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.3% | 3 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.6% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.7% | 1 |
| cw.megas.Blade 0.8 | 6.5 | 8.1% | 0 |
| sample.Walls 1.0 | 7.3 | 7.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.9 | 21 / 35 | 4638 |
| 2 | 1 | 70.4 | 91.7 | 23 / 35 | 5106 |
| 3 | 1 | 72.0 | 95.2 | 24 / 35 | 5354 |
| 4 | 1 | 71.3 | 93.7 | 23 / 35 | 5461 |
| 5 | 1 | 71.6 | 93.7 | 22 / 35 | 5318 |
| 6 | 1 | 71.0 | 89.2 | 19 / 35 | 5748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 93 | 67% |
| cre.Karolos 0.32 | 50 | 88% |
| stelo.AreaTargetingBot 1.1 | 12 | 100% |
| stelo.RamTrackSurfer 1.2 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 55 | 71% | 124 |
| cre.Karolos 0.32 | 14 | 18% | 54 |
| stelo.AreaTargetingBot 1.1 | 6 | 8% | 13 |
| stelo.RamTrackSurfer 1.2 | 1 | 1% | 9 |
| cw.megas.Blade 0.8 | 1 | 1% | 3 |
| sample.Walls 1.0 | 1 | 1% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.5 | 91 / 210 | 2.67 | 16.5% | 23609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 16.5% | 91 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.2% | 37 |
| davidalves.Phoenix 0.54 | 3.0 | 13.0% | 39 |
| pedersen.Ugluk 1.1.1 | 4.2 | 11.6% | 19 |
| florent.XSeries.X2 0.12 | 4.5 | 11.9% | 23 |
| oog.melee.Corsair 1.0 | 6.5 | 8.7% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.7% | 3 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 0 |
| evd.X1 0.01 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.8 | 19 / 35 | 4181 |
| 2 | 1 | 64.1 | 77.1 | 15 / 35 | 3809 |
| 3 | 1 | 65.4 | 85.4 | 14 / 35 | 3792 |
| 4 | 1 | 65.2 | 81.9 | 13 / 35 | 3845 |
| 5 | 1 | 64.5 | 78.4 | 14 / 35 | 4026 |
| 6 | 1 | 65.4 | 82.2 | 16 / 35 | 3956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 71% |
| davidalves.Phoenix 0.54 | 28 | 64% |
| florent.XSeries.X2 0.12 | 25 | 64% |
| pedersen.Ugluk 1.1.1 | 16 | 75% |
| stelo.SoJNanoMelee 1.1 | 16 | 88% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| oog.melee.Corsair 1.0 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 31 | 25% | 46 |
| rz.GlowBlowMelee 1.4 | 28 | 23% | 52 |
| davidalves.Phoenix 0.54 | 23 | 19% | 39 |
| pedersen.Ugluk 1.1.1 | 21 | 17% | 35 |
| stelo.SoJNanoMelee 1.1 | 11 | 9% | 14 |
| oog.melee.Corsair 1.0 | 4 | 3% | 18 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 5 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.6 | 135 / 210 | 2.30 | 18.4% | 25494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 18.4% | 135 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.8% | 19 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.6% | 14 |
| jdw.Hurricane 1.4 | 4.0 | 11.3% | 14 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.0% | 5 |
| ds.Oo 2.2 | 5.8 | 9.4% | 13 |
| awesomeness.Elite 1.0 | 7.3 | 7.4% | 4 |
| adt.Ar2 1.1 | 7.7 | 7.2% | 2 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.8% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 93.3 | 28 / 35 | 4624 |
| 2 | 1 | 67.1 | 83.5 | 22 / 35 | 4045 |
| 3 | 1 | 67.0 | 83.5 | 22 / 35 | 3977 |
| 4 | 1 | 65.2 | 79.4 | 17 / 35 | 4107 |
| 5 | 1 | 67.9 | 83.8 | 23 / 35 | 4431 |
| 6 | 1 | 68.7 | 90.2 | 23 / 35 | 4310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 47 | 91% |
| voidious.micro.BlitzBat 1.05 | 46 | 98% |
| jdw.Hurricane 1.4 | 26 | 92% |
| ds.Oo 2.2 | 7 | 86% |
| gre.svman4.Morfeas 1.4.1 | 7 | 71% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 4 | 75% |
| awesomeness.Elite 1.0 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 20 | 27% | 43 |
| voidious.micro.BlitzBat 1.05 | 16 | 21% | 54 |
| voidious.mini.BrokenSword 2.0.3 | 14 | 19% | 47 |
| ds.Oo 2.2 | 10 | 13% | 21 |
| gre.svman4.Morfeas 1.4.1 | 5 | 7% | 13 |
| adt.Ar2 1.1 | 4 | 5% | 12 |
| awesomeness.Elite 1.0 | 3 | 4% | 10 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 6 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |

## Melee bench: F26

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.3 | 138 / 210 | 1.78 | 19.6% | 33109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 19.6% | 138 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 33 |
| lrem.Spectre 0.4.4 | 3.3 | 12.2% | 12 |
| shu.nitro.LENIN .T34 | 4.0 | 11.8% | 20 |
| js.PinBall 1.6 | 4.8 | 10.6% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.5% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.9% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.2% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.0 | 26 / 35 | 5987 |
| 2 | 1 | 70.9 | 93.3 | 24 / 35 | 5854 |
| 3 | 1 | 70.2 | 91.1 | 24 / 35 | 5452 |
| 4 | 1 | 69.0 | 87.0 | 21 / 35 | 5341 |
| 5 | 1 | 70.2 | 92.7 | 25 / 35 | 5444 |
| 6 | 1 | 68.8 | 89.8 | 18 / 35 | 5031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 55 | 73% |
| lrem.Spectre 0.4.4 | 45 | 93% |
| shu.nitro.LENIN .T34 | 40 | 75% |
| js.PinBall 1.6 | 16 | 94% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 36% | 69 |
| shu.nitro.LENIN .T34 | 19 | 26% | 58 |
| lrem.Spectre 0.4.4 | 9 | 12% | 34 |
| js.PinBall 1.6 | 8 | 11% | 19 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 8% | 14 |
| gh.mini.GrubbmOne 1.0 | 4 | 5% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 7 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.5 | 127 / 210 | 2.21 | 18.4% | 27530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 18.4% | 127 |
| mk.Alpha 0.2.1 | 2.0 | 14.2% | 37 |
| wee.Gem 1.8.4 | 3.8 | 11.4% | 23 |
| EH.Eagle 1.0.6 | 4.0 | 11.1% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.7% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 9.1% | 3 |
| joe.ADinosaur 1.0 | 7.3 | 7.6% | 2 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.6% | 4 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.6% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 74.0 | 16 / 35 | 5703 |
| 2 | 1 | 67.4 | 87.6 | 18 / 35 | 4116 |
| 3 | 1 | 68.0 | 89.8 | 24 / 35 | 4199 |
| 4 | 1 | 68.0 | 87.3 | 24 / 35 | 4422 |
| 5 | 1 | 69.6 | 92.7 | 25 / 35 | 4564 |
| 6 | 1 | 68.0 | 87.6 | 20 / 35 | 4526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 71 | 80% |
| wee.Gem 1.8.4 | 33 | 67% |
| EH.Eagle 1.0.6 | 20 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 83% |
| throxbot.ThroxBot 0.1 | 6 | 83% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 30 | 36% | 92 |
| wee.Gem 1.8.4 | 15 | 18% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 17% | 28 |
| EH.Eagle 1.0.6 | 8 | 10% | 25 |
| throxbot.ThroxBot 0.1 | 5 | 6% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 5% | 11 |
| cs.Grudge 1.0 | 3 | 4% | 4 |
| joe.ADinosaur 1.0 | 3 | 4% | 3 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 2 |

## Melee bench: F28

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.6 | 136 / 210 | 1.85 | 19.1% | 27322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 19.1% | 136 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 33 |
| uji.Antique 1.0 | 3.3 | 11.4% | 21 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 10.9% | 11 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.5% | 3 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.4% | 2 |
| ahr.ice.Ice 1.0.2 | 7.3 | 7.5% | 4 |
| stelo.PianistNano 1.2 | 8.5 | 6.4% | 0 |
| matt.advanced.Katana 1.0 | 8.7 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.7 | 29 / 35 | 4609 |
| 2 | 1 | 67.3 | 87.0 | 19 / 35 | 4405 |
| 3 | 1 | 69.9 | 93.7 | 24 / 35 | 4723 |
| 4 | 1 | 66.7 | 85.4 | 18 / 35 | 4265 |
| 5 | 1 | 69.0 | 91.1 | 22 / 35 | 4662 |
| 6 | 1 | 69.5 | 93.7 | 24 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 85 | 79% |
| uji.Antique 1.0 | 44 | 77% |
| qohnil.blot.BlotBot 3.61 | 17 | 76% |
| amk.ChumbaWumba 0.3 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| ahr.ice.Ice 1.0.2 | 4 | 75% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 29 | 39% | 87 |
| uji.Antique 1.0 | 14 | 19% | 37 |
| qohnil.blot.BlotBot 3.61 | 12 | 16% | 30 |
| pfvicm.Sobieski 7.2.3b | 8 | 11% | 16 |
| amk.ChumbaWumba 0.3 | 4 | 5% | 13 |
| ahr.ice.Ice 1.0.2 | 3 | 4% | 7 |
| matt.advanced.Katana 1.0 | 2 | 3% | 11 |
| stelo.Lifestealer 1.0 | 1 | 1% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |

## Melee bench: F29

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.6 | 115 / 210 | 2.02 | 19.1% | 28697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 19.1% | 115 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 14.9% | 44 |
| deewiant.Anomaly 0.2 | 2.7 | 14.3% | 40 |
| myl.micro.Troodon 1.10 | 4.2 | 11.6% | 7 |
| jok.PheonixM 0.1.2 | 4.8 | 10.2% | 2 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.4% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 6.3% | 3 |
| jangs.ns51 1.0 | 9.2 | 4.7% | 0 |
| ap.Frederick 1.1 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.9 | 17 / 35 | 4746 |
| 2 | 1 | 70.1 | 89.2 | 22 / 35 | 5042 |
| 3 | 1 | 69.1 | 88.6 | 18 / 35 | 4895 |
| 4 | 1 | 69.0 | 89.2 | 20 / 35 | 4519 |
| 5 | 1 | 68.3 | 86.0 | 18 / 35 | 4563 |
| 6 | 1 | 70.0 | 89.8 | 20 / 35 | 4932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 58 | 67% |
| zyx.mega.YersiniaPestis 3.1 | 57 | 63% |
| myl.micro.Troodon 1.10 | 21 | 95% |
| jok.PheonixM 0.1.2 | 9 | 100% |
| DBall.Anarchy 0.1 | 5 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 41 | 43% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 32 | 34% | 68 |
| myl.micro.Troodon 1.10 | 11 | 12% | 19 |
| jok.PheonixM 0.1.2 | 5 | 5% | 13 |
| DBall.Anarchy 0.1 | 2 | 2% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 2 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 1 |

## Melee bench: F30

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 76.8 | 63 / 210 | 3.09 | 15.3% | 23523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.5 | 15.3% | 63 |
| catcat20.Matcha 0.006 | 2.0 | 14.5% | 57 |
| darkcanuck.B26354 1.06 | 3.2 | 13.2% | 45 |
| oog.melee.Capulet 1.2 | 3.8 | 12.5% | 20 |
| stelo.PastFuture 2.3.2 | 4.5 | 12.3% | 19 |
| intruder.PrairieWolf 2.61 | 6.7 | 7.9% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.5% | 5 |
| ntc.Opposite 1.5 | 7.5 | 7.5% | 0 |
| tripphippy.Alice 1.1 | 8.5 | 6.4% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 75.9 | 14 / 35 | 3853 |
| 2 | 1 | 66.2 | 85.1 | 14 / 35 | 4033 |
| 3 | 1 | 62.8 | 74.6 | 8 / 35 | 4092 |
| 4 | 2 | 62.3 | 73.7 | 9 / 35 | 3859 |
| 5 | 2 | 63.0 | 75.9 | 8 / 35 | 3880 |
| 6 | 2 | 63.0 | 75.9 | 10 / 35 | 3806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 34 | 56% |
| catcat20.Matcha 0.006 | 33 | 52% |
| oog.melee.Capulet 1.2 | 16 | 88% |
| stelo.PastFuture 2.3.2 | 14 | 71% |
| intruder.PrairieWolf 2.61 | 3 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 148 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 41 | 28% | 57 |
| darkcanuck.B26354 1.06 | 38 | 26% | 57 |
| stelo.PastFuture 2.3.2 | 33 | 22% | 42 |
| oog.melee.Capulet 1.2 | 17 | 11% | 30 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 6% | 10 |
| intruder.PrairieWolf 2.61 | 4 | 3% | 9 |
| ntc.Opposite 1.5 | 4 | 3% | 4 |
| tripphippy.Alice 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 75.2 | 59 / 210 | 3.23 | 14.9% | 21200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.5% | 89 |
| hadur117.mini.DeiseRS 0.4 | 2.0 | 14.9% | 59 |
| gh.mini.Griezel 0.2 | 3.0 | 13.5% | 38 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.4% | 7 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.5% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 7 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.9% | 2 |
| fm.mammillarias 1.3 | 8.2 | 5.9% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.0% | 2 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 71.4 | 6 / 35 | 3595 |
| 2 | 2 | 63.4 | 77.8 | 10 / 35 | 3458 |
| 3 | 2 | 63.4 | 77.1 | 9 / 35 | 3619 |
| 4 | 2 | 62.9 | 74.6 | 9 / 35 | 3479 |
| 5 | 1 | 66.6 | 84.4 | 18 / 35 | 3968 |
| 6 | 2 | 59.1 | 66.0 | 7 / 35 | 3081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 59% |
| gh.mini.Griezel 0.2 | 24 | 38% |
| spinnercat.micro.Tyger 0.1 | 13 | 77% |
| d414.nano.Quantum 1.0.0 | 7 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 50% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 0% |

Hadur died in 152 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 48 | 32% | 82 |
| gh.mini.Griezel 0.2 | 44 | 29% | 54 |
| d414.nano.Quantum 1.0.0 | 23 | 15% | 26 |
| spinnercat.micro.Tyger 0.1 | 20 | 13% | 31 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 5 |
| fm.mammillarias 1.3 | 4 | 3% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.5 | 133 / 210 | 1.85 | 19.0% | 28872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 19.0% | 133 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.2% | 50 |
| apc.botM 3.0 | 3.3 | 11.8% | 12 |
| lxx.ConceptA 0.8 | 3.8 | 10.8% | 3 |
| bayen.UbaMicro 1.4 | 5.5 | 8.6% | 3 |
| vjik.UnViolation 1.1 | 5.5 | 8.9% | 3 |
| panzer.Panzer 0.2 | 7.7 | 7.2% | 0 |
| yk.JahMicro 1.0 | 7.8 | 6.8% | 3 |
| conscience.Electron 1.3g | 8.8 | 6.1% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 93.0 | 25 / 35 | 4922 |
| 2 | 1 | 68.2 | 88.6 | 24 / 35 | 4627 |
| 3 | 1 | 68.5 | 91.4 | 20 / 35 | 4835 |
| 4 | 1 | 67.0 | 85.4 | 17 / 35 | 4717 |
| 5 | 1 | 68.3 | 89.8 | 20 / 35 | 4908 |
| 6 | 1 | 70.3 | 94.9 | 27 / 35 | 4863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 76 | 62% |
| lxx.ConceptA 0.8 | 29 | 93% |
| apc.botM 3.0 | 25 | 88% |
| vjik.UnViolation 1.1 | 12 | 100% |
| donjezza.Jezza 1.0 | 8 | 75% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| yk.JahMicro 1.0 | 7 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 42 | 55% | 103 |
| lxx.ConceptA 0.8 | 10 | 13% | 20 |
| apc.botM 3.0 | 9 | 12% | 33 |
| panzer.Panzer 0.2 | 5 | 6% | 8 |
| bayen.UbaMicro 1.4 | 4 | 5% | 9 |
| vjik.UnViolation 1.1 | 3 | 4% | 23 |
| donjezza.Jezza 1.0 | 2 | 3% | 7 |
| yk.JahMicro 1.0 | 1 | 1% | 5 |
| conscience.Electron 1.3g | 1 | 1% | 2 |

## Melee bench: F33

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.3 | 126 / 210 | 2.06 | 19.3% | 31043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 19.3% | 126 |
| maribo.Quester 0.3 | 2.2 | 15.0% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.9% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.6% | 5 |
| labg.Cataclysm 2.05 | 4.3 | 10.7% | 17 |
| baal.nano.N 1.42 | 6.5 | 8.5% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.4% | 7 |
| zyx.micro.Ant 1.1 | 8.3 | 5.5% | 0 |
| sanja.First 0.1 | 9.2 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.3 | 20 / 35 | 5232 |
| 2 | 1 | 69.3 | 87.9 | 18 / 35 | 5343 |
| 3 | 1 | 68.0 | 83.2 | 16 / 35 | 4998 |
| 4 | 1 | 70.5 | 91.1 | 26 / 35 | 5151 |
| 5 | 1 | 71.1 | 94.0 | 26 / 35 | 5246 |
| 6 | 1 | 68.6 | 87.0 | 20 / 35 | 5073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 51 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 79% |
| gre.svman4.Leonidas 1.3.2 | 35 | 94% |
| labg.Cataclysm 2.05 | 18 | 78% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 80% |
| baal.nano.N 1.42 | 3 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 37 | 44% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 20% | 42 |
| labg.Cataclysm 2.05 | 14 | 17% | 29 |
| gre.svman4.Leonidas 1.3.2 | 7 | 8% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 7% | 11 |
| baal.nano.N 1.42 | 3 | 4% | 10 |
| sanja.First 0.1 | 0 | 0% | 6 |
| zyx.micro.Ant 1.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.5 | 88 / 210 | 2.21 | 17.8% | 29169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.3 | 17.8% | 88 |
| stelo.Spread 0.9 | 2.0 | 16.9% | 69 |
| kid.Gladiator .7.2 | 2.7 | 16.2% | 40 |
| jcs.Seth 1.8 | 4.5 | 10.5% | 11 |
| tcf.Reach 3 | 5.0 | 10.3% | 2 |
| cli.Dancer 1.1 | 5.5 | 9.5% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.0 | 19 / 35 | 5058 |
| 2 | 1 | 67.7 | 84.8 | 19 / 35 | 4474 |
| 3 | 1 | 68.9 | 87.9 | 15 / 35 | 5160 |
| 4 | 2 | 66.1 | 81.9 | 11 / 35 | 4466 |
| 5 | 2 | 68.3 | 87.0 | 13 / 35 | 4914 |
| 6 | 1 | 67.6 | 84.4 | 11 / 35 | 5097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 82 | 55% |
| kid.Gladiator .7.2 | 46 | 63% |
| jcs.Seth 1.8 | 18 | 67% |
| tcf.Reach 3 | 2 | 50% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 1088. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 54 | 44% | 99 |
| kid.Gladiator .7.2 | 54 | 44% | 74 |
| jcs.Seth 1.8 | 8 | 7% | 23 |
| tcf.Reach 3 | 4 | 3% | 9 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| cli.Dancer 1.1 | 0 | 0% | 2 |

## Melee bench: F35

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 80.3 | 46 / 210 | 2.77 | 15.3% | 21283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 140 |
| hadur117.mini.DeiseRS 0.4 | 2.0 | 15.3% | 46 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.8% | 18 |
| rz.HawkOnFire 0.1 | 4.2 | 11.6% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.0% | 3 |
| wit.Chuliath 1.0 | 6.5 | 7.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 81.6 | 12 / 35 | 3592 |
| 2 | 2 | 62.6 | 77.5 | 3 / 35 | 3248 |
| 3 | 2 | 64.3 | 81.6 | 6 / 35 | 3657 |
| 4 | 2 | 65.0 | 81.9 | 11 / 35 | 3943 |
| 5 | 2 | 64.2 | 82.9 | 8 / 35 | 3401 |
| 6 | 2 | 62.9 | 76.5 | 6 / 35 | 3442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 78 | 17% |
| gh.mini.Gruwel 0.9 | 21 | 62% |
| rz.HawkOnFire 0.1 | 13 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 86% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 94 | 57% | 112 |
| gh.mini.Gruwel 0.9 | 33 | 20% | 48 |
| rz.HawkOnFire 0.1 | 18 | 11% | 22 |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 7% | 19 |
| myl.nano.KomoriNinja 1.1 | 5 | 3% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.4 | 168 / 210 | 1.59 | 20.9% | 32508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 20.9% | 168 |
| alpha.RainingFire 1.0 | 2.7 | 12.1% | 16 |
| bzdp.Pansy 2.1 | 3.5 | 11.8% | 9 |
| mz.Cork 0.1 | 4.8 | 10.5% | 7 |
| bvh.micro.Freya 0.3 | 5.2 | 9.9% | 2 |
| bvh.mini.Fenrir 0.39 | 5.2 | 9.7% | 2 |
| m3thos.Eva02 0.7.1 | 5.7 | 9.3% | 2 |
| dl.BetterWalls 1.0 | 8.3 | 5.7% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.6% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 95.9 | 28 / 35 | 5792 |
| 2 | 1 | 71.6 | 93.7 | 31 / 35 | 5523 |
| 3 | 1 | 70.3 | 91.4 | 24 / 35 | 5458 |
| 4 | 1 | 71.6 | 95.9 | 28 / 35 | 5454 |
| 5 | 1 | 70.5 | 91.4 | 28 / 35 | 5284 |
| 6 | 1 | 70.2 | 92.4 | 29 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 100% |
| mz.Cork 0.1 | 30 | 87% |
| alpha.RainingFire 1.0 | 28 | 86% |
| bvh.micro.Freya 0.3 | 28 | 100% |
| m3thos.Eva02 0.7.1 | 18 | 100% |
| bvh.mini.Fenrir 0.39 | 17 | 94% |
| sample.MyFirstRobot 1.0 | 8 | 75% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 9 | 20% | 33 |
| bzdp.Pansy 2.1 | 7 | 16% | 56 |
| mz.Cork 0.1 | 7 | 16% | 32 |
| bvh.mini.Fenrir 0.39 | 6 | 14% | 16 |
| bvh.micro.Freya 0.3 | 5 | 11% | 26 |
| sample.MyFirstRobot 1.0 | 5 | 11% | 9 |
| m3thos.Eva02 0.7.1 | 4 | 9% | 30 |
| dl.BetterWalls 1.0 | 0 | 0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.4 | 172 / 210 | 1.77 | 19.9% | 33390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 19.9% | 172 |
| germ.TheMind .2 | 3.3 | 10.6% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.2% | 3 |
| EBBU.Sim2 1.02 | 4.2 | 9.9% | 3 |
| lmk.ACPFinal 0.1 | 5.7 | 9.2% | 5 |
| agrach.Dalek 1.0 | 5.8 | 8.9% | 8 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.6% | 7 |
| mb.Beast 0.1 | 7.5 | 8.1% | 5 |
| skm.Ryubot 1.0 | 8.2 | 7.6% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 7.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 90.8 | 28 / 35 | 5242 |
| 2 | 1 | 69.3 | 90.8 | 29 / 35 | 5593 |
| 3 | 1 | 71.1 | 98.7 | 33 / 35 | 5784 |
| 4 | 1 | 66.3 | 85.1 | 22 / 35 | 4958 |
| 5 | 1 | 70.1 | 94.6 | 30 / 35 | 5600 |
| 6 | 1 | 69.6 | 88.6 | 30 / 35 | 6213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 46 | 98% |
| EBBU.Sim2 1.02 | 28 | 100% |
| mb.Beast 0.1 | 20 | 95% |
| lmk.ACPFinal 0.1 | 18 | 89% |
| stelo.UntouchableNano 1.3 | 17 | 82% |
| agrach.Dalek 1.0 | 17 | 100% |
| skm.Ryubot 1.0 | 15 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 10 | 26% | 33 |
| agrach.Dalek 1.0 | 6 | 16% | 28 |
| stelo.UntouchableNano 1.3 | 6 | 16% | 21 |
| germ.TheMind .2 | 4 | 11% | 39 |
| mb.Beast 0.1 | 4 | 11% | 24 |
| EBBU.Sim2 1.02 | 3 | 8% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 8% | 9 |
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 3% | 30 |
| skm.Ryubot 1.0 | 1 | 3% | 2 |

## Melee bench: F38

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.2 | 89 / 210 | 2.79 | 16.3% | 24423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.5 | 16.3% | 89 |
| justin.Mallais 14.0 | 1.5 | 16.9% | 78 |
| bvh.mini.Freya 0.55 | 3.3 | 12.7% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.9% | 4 |
| cs.Wren 1.0 | 4.8 | 10.5% | 7 |
| bts.mega.Gnarly 1.4 | 5.2 | 10.3% | 11 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.6% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.9% | 1 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 79.7 | 14 / 35 | 4246 |
| 2 | 2 | 65.9 | 79.7 | 17 / 35 | 4088 |
| 3 | 1 | 66.3 | 83.5 | 15 / 35 | 4315 |
| 4 | 2 | 63.3 | 75.9 | 12 / 35 | 3396 |
| 5 | 2 | 64.9 | 77.5 | 12 / 35 | 4280 |
| 6 | 1 | 66.2 | 84.8 | 19 / 35 | 4098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 69 | 59% |
| bvh.mini.Freya 0.55 | 16 | 69% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 100% |
| bts.mega.Gnarly 1.4 | 12 | 75% |
| cs.Wren 1.0 | 9 | 89% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 57 | 47% | 98 |
| bvh.mini.Freya 0.55 | 20 | 17% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 11% | 30 |
| bts.mega.Gnarly 1.4 | 12 | 10% | 24 |
| kdf.KoulDestroyer 1.0 | 8 | 7% | 12 |
| cs.Wren 1.0 | 7 | 6% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.7 | 99 / 210 | 2.38 | 17.6% | 28333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 17.6% | 99 |
| bvh.fry.Freya 0.82 | 2.3 | 14.6% | 18 |
| az.Ololobot 0.2.4 | 2.8 | 13.3% | 50 |
| catcat20.Lambda 0.024 | 3.8 | 11.9% | 30 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 8.7% | 9 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.1% | 2 |
| gimp.GimpBot 0.1 | 6.5 | 7.6% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.8% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.1 | 12 / 35 | 4607 |
| 2 | 1 | 67.4 | 86.0 | 17 / 35 | 4850 |
| 3 | 1 | 66.0 | 82.5 | 17 / 35 | 4552 |
| 4 | 1 | 64.8 | 80.6 | 14 / 35 | 4291 |
| 5 | 1 | 67.2 | 84.4 | 21 / 35 | 4619 |
| 6 | 1 | 68.8 | 90.5 | 18 / 35 | 5414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 43 | 49% |
| bvh.fry.Freya 0.82 | 39 | 92% |
| catcat20.Lambda 0.024 | 35 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 93% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |

Hadur died in 111 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 37 | 33% | 80 |
| az.Ololobot 0.2.4 | 29 | 26% | 51 |
| catcat20.Lambda 0.024 | 26 | 23% | 39 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 9% | 12 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 9 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 7 |
| gimp.GimpBot 0.1 | 1 | 1% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |

## Melee bench: F40

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.1 | 124 / 210 | 2.25 | 18.5% | 28619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 18.5% | 124 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 40 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.2% | 16 |
| Polkwane.SmashMelee 1.0 | 3.7 | 11.5% | 12 |
| mz.AntiGrav 1.0 | 5.2 | 10.4% | 4 |
| stelo.Randomness 1.0 | 6.5 | 8.6% | 6 |
| alpha.BlackIce 1.0 | 6.5 | 8.3% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.0% | 1 |
| sample.Corners 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.4 | 19 / 35 | 4576 |
| 2 | 1 | 68.7 | 87.3 | 21 / 35 | 4729 |
| 3 | 1 | 67.3 | 85.7 | 20 / 35 | 4378 |
| 4 | 1 | 68.2 | 85.7 | 22 / 35 | 4763 |
| 5 | 1 | 69.0 | 87.3 | 21 / 35 | 5158 |
| 6 | 1 | 69.0 | 86.3 | 21 / 35 | 5015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 58 | 69% |
| kano.gamma.KanoGamma 1.8 | 38 | 87% |
| Polkwane.SmashMelee 1.0 | 27 | 81% |
| mz.AntiGrav 1.0 | 13 | 100% |
| stelo.Randomness 1.0 | 9 | 89% |
| alpha.BlackIce 1.0 | 7 | 71% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 36 | 42% | 65 |
| kano.gamma.KanoGamma 1.8 | 13 | 15% | 53 |
| Polkwane.SmashMelee 1.0 | 11 | 13% | 23 |
| stelo.Randomness 1.0 | 10 | 12% | 22 |
| mz.AntiGrav 1.0 | 7 | 8% | 23 |
| alpha.BlackIce 1.0 | 6 | 7% | 13 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 5 |
| sample.Corners 1.0 | 1 | 1% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 4 |

## Melee bench: F41

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.3 | 106 / 210 | 2.32 | 17.6% | 25327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 17.6% | 106 |
| eem.EvBotNG v12.8 | 2.0 | 15.8% | 59 |
| ary.Swarm 1.1 | 3.3 | 12.7% | 17 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 12.4% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 12.2% | 12 |
| shrub.Silver v048 | 6.3 | 8.3% | 0 |
| zyx.nano.Ant 1.1 | 6.7 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.7% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.2% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.3 | 22 / 35 | 4345 |
| 2 | 1 | 66.4 | 82.2 | 19 / 35 | 3671 |
| 3 | 1 | 68.1 | 87.9 | 18 / 35 | 4172 |
| 4 | 1 | 67.0 | 84.8 | 15 / 35 | 4298 |
| 5 | 1 | 67.5 | 86.3 | 16 / 35 | 4457 |
| 6 | 1 | 67.5 | 84.4 | 16 / 35 | 4384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 69 | 59% |
| simonton.nano.MeleeSeed 1.8 | 26 | 88% |
| ary.Swarm 1.1 | 21 | 81% |
| lessonz.robocode.Oz 0.5.0 | 18 | 89% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| shrub.Silver v048 | 3 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 47% | 94 |
| ary.Swarm 1.1 | 18 | 17% | 33 |
| simonton.nano.MeleeSeed 1.8 | 14 | 13% | 33 |
| lessonz.robocode.Oz 0.5.0 | 11 | 11% | 25 |
| shrub.Silver v048 | 3 | 3% | 7 |
| jsal.Jsalbot 1.0 | 3 | 3% | 6 |
| stelo.Mirror 1.1 | 3 | 3% | 6 |
| zyx.nano.Ant 1.1 | 3 | 3% | 4 |

## Melee bench: F42

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.3 | 105 / 210 | 2.23 | 18.3% | 31210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 18.3% | 105 |
| wompi.Wallaby 5.1 | 2.0 | 16.1% | 58 |
| ara.Shera 0.88 | 3.2 | 13.3% | 30 |
| maribo.mini.MiniQuester 0.1 | 3.8 | 12.5% | 13 |
| amz.NanoClone 1.41 | 5.0 | 9.0% | 3 |
| maribo.IotaCT 1.1 | 6.3 | 7.4% | 1 |
| dsw.StaticD 1.0 | 6.7 | 7.3% | 1 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.8 | 5.4% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.1 | 15 / 35 | 4900 |
| 2 | 1 | 67.9 | 83.8 | 19 / 35 | 5370 |
| 3 | 1 | 68.5 | 90.5 | 18 / 35 | 5066 |
| 4 | 1 | 68.7 | 89.5 | 18 / 35 | 5324 |
| 5 | 1 | 67.4 | 83.5 | 16 / 35 | 5142 |
| 6 | 1 | 68.3 | 85.7 | 19 / 35 | 5408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 57 | 67% |
| ara.Shera 0.88 | 46 | 72% |
| maribo.mini.MiniQuester 0.1 | 27 | 89% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 48 | 45% | 96 |
| ara.Shera 0.88 | 31 | 29% | 60 |
| maribo.mini.MiniQuester 0.1 | 15 | 14% | 34 |
| amz.NanoClone 1.41 | 7 | 7% | 7 |
| dsw.StaticD 1.0 | 2 | 2% | 5 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 4 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 74.1 | 31 / 210 | 3.33 | 14.2% | 21035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 148 |
| hadur117.mini.DeiseRS 0.4 | 2.0 | 14.2% | 31 |
| brainfade.melee.Dusk 0.44 | 3.0 | 13.0% | 20 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 12.0% | 4 |
| dummy.micro.Sparrow 2.5 | 4.7 | 11.1% | 5 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.9% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.4% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 75.2 | 6 / 35 | 3448 |
| 2 | 2 | 61.0 | 68.9 | 1 / 35 | 3279 |
| 3 | 2 | 64.3 | 77.8 | 4 / 35 | 3713 |
| 4 | 2 | 62.5 | 70.8 | 6 / 35 | 3614 |
| 5 | 2 | 64.9 | 78.4 | 9 / 35 | 3660 |
| 6 | 2 | 62.8 | 73.3 | 5 / 35 | 3321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 75 | 20% |
| brainfade.melee.Dusk 0.44 | 10 | 50% |
| dummy.micro.Sparrow 2.5 | 9 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |

Hadur died in 179 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 103 | 58% | 120 |
| brainfade.melee.Dusk 0.44 | 26 | 15% | 31 |
| dummy.micro.Sparrow 2.5 | 23 | 13% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 15 | 8% | 18 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 6 |
| mz.NanoGod 2.02 | 3 | 2% | 3 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.8 | 117 / 210 | 2.19 | 18.8% | 30998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 18.8% | 117 |
| stelo.Liblix 0.3.1 | 2.3 | 15.5% | 49 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.4% | 30 |
| wompi.Quokka 1.6 | 4.2 | 10.3% | 6 |
| jwirde.Gort 2.0 | 5.5 | 9.3% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.2% | 4 |
| disan.Chair 2.2.0 | 7.2 | 7.1% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.1% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.4% | 0 |
| sample.Crazy 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 15 / 35 | 5123 |
| 2 | 1 | 68.7 | 86.0 | 18 / 35 | 5368 |
| 3 | 1 | 68.8 | 85.1 | 23 / 35 | 5003 |
| 4 | 1 | 69.0 | 88.3 | 19 / 35 | 4970 |
| 5 | 1 | 71.0 | 93.0 | 22 / 35 | 5511 |
| 6 | 1 | 68.2 | 85.1 | 20 / 35 | 5023 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 79 | 76% |
| tzu.TheArtOfWar 1.2 | 46 | 78% |
| wompi.Quokka 1.6 | 12 | 83% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 75% |
| jwirde.Gort 2.0 | 4 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 41 | 44% | 99 |
| tzu.TheArtOfWar 1.2 | 22 | 24% | 52 |
| wompi.Quokka 1.6 | 13 | 14% | 20 |
| stf.PanzerGeneral 0.1 | 6 | 6% | 8 |
| jwirde.Gort 2.0 | 4 | 4% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 4% | 9 |
| disan.Chair 2.2.0 | 3 | 3% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.2 | 85 / 210 | 1.98 | 20.2% | 37279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseRS 0.4 | 1.0 | 20.2% | 85 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.4% | 113 |
| jje.BagPuss 1.2 | 3.2 | 11.5% | 3 |
| sul.Lunar 1.1 | 4.3 | 10.2% | 4 |
| myl.nano.Graviton 1.10 | 4.8 | 9.7% | 2 |
| fm.claire 1.7 | 6.7 | 8.3% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.1% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.1% | 1 |
| wit.Deep7 2.0 | 9.2 | 5.8% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.8 | 8 / 35 | 5935 |
| 2 | 1 | 70.8 | 91.1 | 19 / 35 | 6248 |
| 3 | 1 | 71.7 | 94.0 | 19 / 35 | 6459 |
| 4 | 1 | 70.9 | 92.4 | 16 / 35 | 6479 |
| 5 | 1 | 69.2 | 85.7 | 11 / 35 | 6110 |
| 6 | 1 | 69.1 | 87.0 | 12 / 35 | 6048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 117 | 21% |
| jje.BagPuss 1.2 | 20 | 90% |
| sul.Lunar 1.1 | 16 | 100% |
| myl.nano.Graviton 1.10 | 10 | 90% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| fm.claire 1.7 | 6 | 100% |
| wit.Deep7 2.0 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 2496. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 77% | 0 |
| jje.BagPuss 1.2 | 8 | 6% | 64 |
| sul.Lunar 1.1 | 7 | 6% | 56 |
| myl.nano.Graviton 1.10 | 7 | 6% | 24 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 21 |
| hvilela.HVilela 0.9 | 2 | 2% | 18 |
| fm.claire 1.7 | 1 | 1% | 10 |
| wit.Deep7 2.0 | 1 | 1% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 6 |

## Melee bench: F46

hadur117.mini.DeiseRS 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 85.1 | 66 / 210 | 2.34 | 16.6% | 24805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.8 | 16.6% | 52 |
| hadur117.mini.DeiseRS 0.4 | 2.0 | 16.6% | 66 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.6% | 79 |
| cx.Princess 1.0 | 4.2 | 10.6% | 12 |
| mz.MicroSheep 1.0 | 4.8 | 10.1% | 2 |
| sadoner.killer 0.2 | 6.0 | 9.0% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 6.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 84.8 | 12 / 35 | 4377 |
| 2 | 1 | 66.6 | 87.6 | 12 / 35 | 4216 |
| 3 | 3 | 65.4 | 81.6 | 12 / 35 | 3985 |
| 4 | 1 | 66.3 | 87.0 | 13 / 35 | 4030 |
| 5 | 3 | 65.8 | 84.1 | 5 / 35 | 4406 |
| 6 | 2 | 65.8 | 85.7 | 12 / 35 | 3791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 58 | 62% |
| rsalesc.melee.Medina 0.4.5 | 49 | 27% |
| cx.Princess 1.0 | 13 | 69% |
| mz.MicroSheep 1.0 | 5 | 80% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| sadoner.killer 0.2 | 2 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 1052. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 68 | 47% | 81 |
| kc.mini.Mirage 0.2 | 55 | 38% | 92 |
| mz.MicroSheep 1.0 | 9 | 6% | 14 |
| cx.Princess 1.0 | 5 | 3% | 12 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 5 |
| sadoner.killer 0.2 | 3 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
1 death(s) with no robot to name.

