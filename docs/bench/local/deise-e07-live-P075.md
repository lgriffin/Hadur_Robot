# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 86.2 | 50 / 210 | 2.24 | 17.0% | 28882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 140 |
| hadur117.mini.DeiseP075 0.4 | 2.0 | 17.0% | 50 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.0% | 3 |
| mz.MicroGodMelee 1 | 4.0 | 10.7% | 5 |
| sgp.JollyNinja 3.53 | 4.3 | 10.8% | 13 |
| lorneswork.Predator 1.0 | 6.0 | 9.6% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 87.6 | 10 / 35 | 4877 |
| 2 | 2 | 65.6 | 82.5 | 5 / 35 | 4597 |
| 3 | 2 | 67.4 | 86.3 | 10 / 35 | 4909 |
| 4 | 2 | 66.4 | 87.0 | 9 / 35 | 4458 |
| 5 | 2 | 67.9 | 90.2 | 10 / 35 | 4971 |
| 6 | 2 | 66.5 | 83.8 | 6 / 35 | 5070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 16% |
| mz.MicroGodMelee 1 | 16 | 75% |
| sgp.JollyNinja 3.53 | 11 | 64% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| lorneswork.Predator 1.0 | 5 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 1232. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 123 | 76% | 141 |
| sgp.JollyNinja 3.53 | 17 | 11% | 22 |
| mz.MicroGodMelee 1 | 10 | 6% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 9 |
| adt.Ar2 1.0 | 2 | 1% | 2 |
| lorneswork.Predator 1.0 | 1 | 1% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.9 | 92 / 210 | 2.54 | 17.6% | 28560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 17.6% | 92 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.7% | 47 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.4% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.4% | 10 |
| Noran.BitchingElk 0.054 | 6.0 | 8.4% | 16 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.9% | 3 |
| sch.Simone 0.3d | 7.3 | 7.7% | 9 |
| stelo.PatternRobot 1.0 | 9.0 | 6.1% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.3 | 18 / 35 | 4938 |
| 2 | 1 | 66.1 | 80.0 | 13 / 35 | 5018 |
| 3 | 1 | 67.4 | 85.7 | 20 / 35 | 4579 |
| 4 | 1 | 64.8 | 78.4 | 15 / 35 | 4582 |
| 5 | 1 | 66.4 | 83.5 | 12 / 35 | 4714 |
| 6 | 1 | 66.4 | 83.2 | 14 / 35 | 4729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 84% |
| pulsar.PulsarMax 0.8.9 | 35 | 43% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 63% |
| sch.Simone 0.3d | 15 | 67% |
| Noran.BitchingElk 0.054 | 9 | 44% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| stelo.PatternRobot 1.0 | 7 | 86% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 46 | 39% | 68 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 18 | 15% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 10% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 9% | 22 |
| sch.Simone 0.3d | 8 | 7% | 15 |
| Noran.BitchingElk 0.054 | 8 | 7% | 13 |
| stelo.PatternRobot 1.0 | 8 | 7% | 11 |
| fnc.bandit.Bandit 5.2.0 | 4 | 3% | 5 |
| fullsail.SweetTea 1.1 | 3 | 3% | 4 |

## Melee bench: F03

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.3 | 142 / 210 | 1.78 | 19.9% | 36733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 19.9% | 142 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.5% | 18 |
| vuen.Cake 2.51 | 3.2 | 13.1% | 31 |
| radnor.DoctorBob 1.42 | 3.3 | 13.2% | 16 |
| urdos.URDOS 1.3 | 5.0 | 8.9% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.9% | 1 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.7 | 25 / 35 | 5730 |
| 2 | 1 | 69.8 | 90.8 | 23 / 35 | 6360 |
| 3 | 1 | 70.4 | 93.3 | 28 / 35 | 5933 |
| 4 | 1 | 69.8 | 88.9 | 21 / 35 | 6522 |
| 5 | 1 | 68.6 | 88.6 | 17 / 35 | 5888 |
| 6 | 1 | 71.3 | 94.6 | 28 / 35 | 6300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 74 | 72% |
| kawigi.nano.Lib 1.0 | 57 | 88% |
| radnor.DoctorBob 1.42 | 30 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 75% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 31 | 46% | 84 |
| radnor.DoctorBob 1.42 | 15 | 22% | 36 |
| kawigi.nano.Lib 1.0 | 13 | 19% | 68 |
| urdos.URDOS 1.3 | 4 | 6% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 3% | 2 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 3 |
| adt.Ar1 2.1 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.4 | 36 / 210 | 2.22 | 17.4% | 32495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 169 |
| hadur117.mini.DeiseP075 0.4 | 2.0 | 17.4% | 36 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 1 |
| TNT.TNT 0.99.1 | 4.2 | 10.3% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.5% | 1 |
| tj.zombie1n 1.0.1 | 6.2 | 7.3% | 1 |
| css.Delitioner 0.11 | 6.7 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.3 | 4.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 85.7 | 5 / 35 | 5662 |
| 2 | 2 | 67.7 | 84.4 | 7 / 35 | 5607 |
| 3 | 2 | 68.1 | 88.3 | 7 / 35 | 5449 |
| 4 | 2 | 66.3 | 82.2 | 4 / 35 | 4838 |
| 5 | 2 | 69.3 | 89.5 | 8 / 35 | 5692 |
| 6 | 2 | 68.2 | 88.3 | 5 / 35 | 5247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 163 | 17% |
| apc.LeeroyJenkins2 1.0 | 4 | 100% |
| josago.Jorgito 0.16 | 2 | 100% |
| TNT.TNT 0.99.1 | 2 | 50% |
| tj.zombie1n 1.0.1 | 1 | 0% |
| rampancy.Durandal 2.1d | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 175 of 210 rounds, at a mean tick of 1467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 148 | 85% | 176 |
| josago.Jorgito 0.16 | 8 | 5% | 10 |
| apc.LeeroyJenkins2 1.0 | 5 | 3% | 8 |
| TNT.TNT 0.99.1 | 4 | 2% | 5 |
| tj.zombie1n 1.0.1 | 4 | 2% | 4 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 1 | 1% | 3 |
| rampancy.Durandal 2.1d | 1 | 1% | 2 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 76.1 | 32 / 210 | 3.15 | 14.3% | 21284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.1% | 99 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 57 |
| hadur117.mini.DeiseP075 0.4 | 2.8 | 14.3% | 32 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 14 |
| axeBots.HataMoto 3.09 | 5.3 | 8.9% | 6 |
| ms.Ares 0.19 | 5.7 | 8.9% | 2 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 77.8 | 3 / 35 | 3341 |
| 2 | 3 | 60.6 | 71.4 | 3 / 35 | 3220 |
| 3 | 3 | 63.2 | 77.8 | 4 / 35 | 3683 |
| 4 | 3 | 62.7 | 74.3 | 4 / 35 | 3932 |
| 5 | 3 | 61.5 | 71.7 | 6 / 35 | 3548 |
| 6 | 2 | 64.9 | 83.5 | 12 / 35 | 3560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 34 | 32% |
| cb.fire.Firestarter 2.0f | 27 | 19% |
| wompi.Numbat 2.1 | 15 | 67% |
| axeBots.HataMoto 3.09 | 6 | 67% |
| ms.Ares 0.19 | 3 | 67% |

Hadur died in 178 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 65 | 37% | 74 |
| cb.fire.Firestarter 2.0f | 60 | 34% | 65 |
| wompi.Numbat 2.1 | 29 | 16% | 38 |
| ms.Ares 0.19 | 9 | 5% | 12 |
| axeBots.HataMoto 3.09 | 8 | 4% | 13 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.2 | 105 / 210 | 2.42 | 17.7% | 27681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 17.7% | 105 |
| jekl.StoneGhost 0.7 | 2.0 | 14.5% | 24 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.3 | 12.9% | 31 |
| origin.SleepSiphon 1.7b | 3.7 | 13.1% | 39 |
| mld.Wisdom 1.0 | 5.0 | 10.3% | 4 |
| gg.Wolverine 2.0 | 6.5 | 8.4% | 4 |
| spinnercat.Omen 1.0 | 7.0 | 7.0% | 1 |
| DBall.NUKE 0.1 | 7.8 | 6.5% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 6.5% | 2 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.8 | 18 / 35 | 4574 |
| 2 | 1 | 68.0 | 86.3 | 20 / 35 | 4718 |
| 3 | 1 | 67.9 | 87.0 | 18 / 35 | 4910 |
| 4 | 1 | 63.7 | 74.9 | 11 / 35 | 4098 |
| 5 | 1 | 67.5 | 84.4 | 17 / 35 | 4843 |
| 6 | 1 | 68.2 | 88.6 | 21 / 35 | 4538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 46 | 85% |
| origin.SleepSiphon 1.7b | 35 | 66% |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 62% |
| gg.Wolverine 2.0 | 9 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 89% |
| mld.Wisdom 1.0 | 5 | 80% |
| DBall.NUKE 0.1 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 28% | 48 |
| jekl.StoneGhost 0.7 | 29 | 27% | 63 |
| origin.SleepSiphon 1.7b | 27 | 25% | 57 |
| gg.Wolverine 2.0 | 9 | 8% | 15 |
| mld.Wisdom 1.0 | 5 | 5% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 10 |
| spinnercat.Omen 1.0 | 2 | 2% | 3 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 94.4 | 138 / 210 | 1.50 | 20.6% | 36012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 20.6% | 138 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 16.6% | 41 |
| rtk.Tachikoma 1.0 | 2.5 | 16.2% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.0% | 1 |
| franzor.Lizt 1.3.1 | 4.8 | 10.5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.6% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 96.2 | 27 / 35 | 6536 |
| 2 | 1 | 70.5 | 90.5 | 18 / 35 | 5830 |
| 3 | 1 | 71.6 | 94.3 | 23 / 35 | 5710 |
| 4 | 1 | 72.4 | 95.9 | 26 / 35 | 5715 |
| 5 | 1 | 72.1 | 94.6 | 20 / 35 | 6044 |
| 6 | 1 | 72.4 | 95.2 | 24 / 35 | 6177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 97 | 88% |
| rsalesc.melee.Monk 0.3.6c | 43 | 23% |
| oog.melee.CapuletDroid 1.1 | 26 | 100% |
| franzor.Lizt 1.3.1 | 22 | 68% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 42 | 58% | 60 |
| rtk.Tachikoma 1.0 | 23 | 32% | 108 |
| franzor.Lizt 1.3.1 | 7 | 10% | 1 |
| oog.melee.CapuletDroid 1.1 | 1 | 1% | 30 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 4 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.1 | 122 / 210 | 2.16 | 18.7% | 29675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 18.7% | 122 |
| shrub.Vapour v159 | 2.3 | 13.1% | 34 |
| tm.Yuugao 1.0 | 2.7 | 12.6% | 32 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.6% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.8% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.1% | 3 |
| m3thos.Eva00 1.1 | 7.3 | 7.9% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.6% | 1 |
| SHAM.WOW 1.4 | 8.7 | 6.6% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.5 | 23 / 35 | 4703 |
| 2 | 1 | 68.1 | 86.0 | 20 / 35 | 5112 |
| 3 | 1 | 66.9 | 84.1 | 20 / 35 | 4725 |
| 4 | 1 | 69.1 | 89.2 | 18 / 35 | 5381 |
| 5 | 1 | 67.7 | 86.3 | 20 / 35 | 5126 |
| 6 | 1 | 67.9 | 87.3 | 21 / 35 | 4628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 48 | 73% |
| shrub.Vapour v159 | 45 | 71% |
| Krabb.sliNk.Garm 0.9u | 24 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 100% |
| SHAM.WOW 1.4 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| m3thos.Eva00 1.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 27 | 30% | 60 |
| tm.Yuugao 1.0 | 21 | 24% | 61 |
| Krabb.sliNk.Garm 0.9u | 11 | 12% | 23 |
| zyx.nano.BacillusComma 1.0 | 11 | 12% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 9 | 10% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 4% | 14 |
| SHAM.WOW 1.4 | 3 | 3% | 11 |
| m3thos.Eva00 1.1 | 1 | 1% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.8 | 77 / 210 | 2.73 | 16.8% | 25791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.5 | 16.8% | 77 |
| positive.Portia 1.26e | 1.5 | 17.1% | 87 |
| kc.micro.Figment 1.0 | 3.0 | 13.6% | 24 |
| yagami.Tidus 0.11 | 4.0 | 10.5% | 2 |
| pedersen.Grishnakh 1.0 | 5.5 | 9.0% | 9 |
| mc2.enemy.Original 0.9 | 5.7 | 9.4% | 11 |
| dft.Calliope 5.6 | 6.8 | 7.9% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.3% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 82.5 | 14 / 35 | 4194 |
| 2 | 2 | 68.3 | 87.6 | 14 / 35 | 4770 |
| 3 | 2 | 63.7 | 76.5 | 11 / 35 | 3821 |
| 4 | 1 | 65.7 | 78.7 | 15 / 35 | 4366 |
| 5 | 1 | 66.4 | 83.8 | 11 / 35 | 4508 |
| 6 | 2 | 64.5 | 75.6 | 12 / 35 | 4132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 64 | 41% |
| kc.micro.Figment 1.0 | 35 | 74% |
| yagami.Tidus 0.11 | 12 | 100% |
| mc2.enemy.Original 0.9 | 10 | 60% |
| pedersen.Grishnakh 1.0 | 4 | 100% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 64 | 48% | 94 |
| kc.micro.Figment 1.0 | 28 | 21% | 52 |
| mc2.enemy.Original 0.9 | 14 | 11% | 21 |
| yagami.Tidus 0.11 | 10 | 8% | 22 |
| pedersen.Grishnakh 1.0 | 6 | 5% | 8 |
| dft.Calliope 5.6 | 4 | 3% | 6 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 2% | 2 |
| rdm.Dueler 0.4x | 2 | 2% | 2 |

## Melee bench: F10

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 94.6 | 167 / 210 | 1.49 | 20.1% | 31469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 20.1% | 167 |
| DTF.Kludgy 1.2b | 2.7 | 13.3% | 17 |
| ejb.Polaris 1.0.1 | 3.0 | 12.8% | 8 |
| ne.Chimera 1.2 | 3.3 | 12.9% | 11 |
| tvv.micro.Antares 1.1.1 | 5.0 | 10.1% | 1 |
| vStar.RAFzilla 2.15 | 6.0 | 9.6% | 1 |
| kurios.DOSexe .9b | 7.3 | 6.5% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.2% | 1 |
| sam.Samspin 1.0 | 8.7 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 97.5 | 31 / 35 | 5386 |
| 2 | 1 | 70.4 | 96.5 | 28 / 35 | 5132 |
| 3 | 1 | 68.2 | 87.6 | 23 / 35 | 4939 |
| 4 | 1 | 70.9 | 95.2 | 28 / 35 | 5585 |
| 5 | 1 | 71.0 | 95.2 | 30 / 35 | 5375 |
| 6 | 1 | 70.5 | 95.2 | 27 / 35 | 5052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 66 | 94% |
| DTF.Kludgy 1.2b | 51 | 86% |
| ne.Chimera 1.2 | 29 | 79% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| vStar.RAFzilla 2.15 | 15 | 100% |
| kurios.DOSexe .9b | 6 | 83% |
| sam.Samspin 1.0 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 0% |

Hadur died in 43 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 37% | 58 |
| ne.Chimera 1.2 | 9 | 21% | 37 |
| ejb.Polaris 1.0.1 | 8 | 19% | 68 |
| sam.Samspin 1.0 | 3 | 7% | 6 |
| kurios.DOSexe .9b | 2 | 5% | 16 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 8 |
| vStar.RAFzilla 2.15 | 1 | 2% | 14 |
| donjezza.Muncho 1.0 | 1 | 2% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 1 |

## Melee bench: F11

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.4 | 110 / 210 | 2.31 | 17.9% | 26515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 17.9% | 110 |
| rz.Aleph 0.34 | 2.0 | 15.9% | 51 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.6% | 15 |
| djc.DynaBot 0.1.1 | 3.8 | 10.8% | 11 |
| rdt199.Warlord 0.73 | 5.7 | 8.9% | 8 |
| br2.MobyDickBot 1.6 | 6.3 | 8.6% | 8 |
| uji.YellohFellah 1.0 | 6.5 | 7.9% | 7 |
| KiraNL.Chupacabra 0.4 | 7.5 | 6.9% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.6 | 23 / 35 | 4595 |
| 2 | 1 | 65.7 | 80.6 | 17 / 35 | 4316 |
| 3 | 1 | 67.7 | 87.9 | 19 / 35 | 4219 |
| 4 | 1 | 67.5 | 86.0 | 19 / 35 | 4454 |
| 5 | 1 | 65.5 | 82.5 | 14 / 35 | 4094 |
| 6 | 1 | 68.0 | 87.9 | 18 / 35 | 4837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 52 | 71% |
| cx.mini.Nimrod 0.55 | 28 | 86% |
| djc.DynaBot 0.1.1 | 18 | 94% |
| rdt199.Warlord 0.73 | 16 | 88% |
| uji.YellohFellah 1.0 | 12 | 75% |
| br2.MobyDickBot 1.6 | 9 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 48 | 48% | 88 |
| cx.mini.Nimrod 0.55 | 16 | 16% | 33 |
| rdt199.Warlord 0.73 | 10 | 10% | 26 |
| djc.DynaBot 0.1.1 | 10 | 10% | 23 |
| br2.MobyDickBot 1.6 | 7 | 7% | 17 |
| uji.YellohFellah 1.0 | 6 | 6% | 17 |
| KiraNL.Chupacabra 0.4 | 3 | 3% | 4 |
| stelo.MirrorNano 1.3 | 0 | 0% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.3 | 132 / 210 | 2.23 | 18.2% | 24387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 18.2% | 132 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.6% | 21 |
| nat.PallasHawk 1.0 | 2.8 | 13.2% | 32 |
| darkcanuck.Leon 1.01 | 3.8 | 12.3% | 14 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 5 |
| jrm.Test0 1.0 | 6.2 | 7.8% | 0 |
| jp.Perpy 16.0 | 7.7 | 6.8% | 1 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 8.5 | 6.1% | 5 |
| stuff.Vlad 0.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.2 | 21 / 35 | 4231 |
| 2 | 1 | 66.5 | 83.8 | 18 / 35 | 4126 |
| 3 | 1 | 67.2 | 85.1 | 22 / 35 | 3866 |
| 4 | 1 | 69.0 | 91.1 | 26 / 35 | 4150 |
| 5 | 1 | 67.5 | 87.6 | 22 / 35 | 3900 |
| 6 | 1 | 68.3 | 87.9 | 23 / 35 | 4114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 48 | 92% |
| nat.PallasHawk 1.0 | 45 | 78% |
| darkcanuck.Leon 1.01 | 41 | 85% |
| brainfade.melee.Genghis 0.36 | 7 | 86% |
| jaybot.bots.Oddball 4.0 | 7 | 43% |
| jrm.Test0 1.0 | 4 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 20 | 26% | 53 |
| bts.wiki.RipCurl 0.9b | 18 | 23% | 45 |
| darkcanuck.Leon 1.01 | 13 | 17% | 66 |
| brainfade.melee.Genghis 0.36 | 12 | 15% | 15 |
| jaybot.bots.Oddball 4.0 | 8 | 10% | 12 |
| jrm.Test0 1.0 | 3 | 4% | 6 |
| stuff.Vlad 0.1 | 2 | 3% | 4 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 5 |
| jp.Perpy 16.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 86.0 | 83 / 210 | 2.26 | 16.6% | 24520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.8 | 16.6% | 83 |
| ags.Glacier 0.2.11 | 2.0 | 16.2% | 25 |
| mn.Combat 3.25.0 | 2.2 | 16.2% | 81 |
| shinh.Entangled 0.3 | 4.2 | 12.0% | 14 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.2% | 8 |
| apc.Colossus2 0.17 | 6.2 | 7.6% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.5% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.0 | 83.8 | 13 / 35 | 3995 |
| 2 | 2 | 65.1 | 83.2 | 12 / 35 | 3974 |
| 3 | 1 | 67.5 | 91.7 | 19 / 35 | 3958 |
| 4 | 1 | 67.7 | 89.8 | 16 / 35 | 4538 |
| 5 | 2 | 65.2 | 81.6 | 12 / 35 | 4037 |
| 6 | 2 | 65.8 | 86.0 | 11 / 35 | 4018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 61 | 38% |
| ags.Glacier 0.2.11 | 60 | 75% |
| shinh.Entangled 0.3 | 15 | 73% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |
| stelo.Wang 1.0 | 2 | 50% |

Hadur died in 129 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 56 | 43% | 82 |
| ags.Glacier 0.2.11 | 29 | 22% | 67 |
| shinh.Entangled 0.3 | 19 | 15% | 32 |
| gh.micro.Gruweltje 0.7 | 14 | 11% | 19 |
| stelo.Wang 1.0 | 5 | 4% | 6 |
| apc.Colossus2 0.17 | 4 | 3% | 4 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.9 | 149 / 210 | 1.73 | 19.8% | 32113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 19.8% | 149 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.9% | 26 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 23 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.7% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.2% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.6% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 8.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.7% | 8 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 96.5 | 30 / 35 | 5614 |
| 2 | 1 | 69.3 | 90.2 | 23 / 35 | 5289 |
| 3 | 1 | 71.9 | 97.8 | 29 / 35 | 5598 |
| 4 | 1 | 68.7 | 88.9 | 21 / 35 | 4813 |
| 5 | 1 | 69.0 | 88.9 | 22 / 35 | 5125 |
| 6 | 1 | 69.7 | 89.2 | 24 / 35 | 5674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 98 | 91% |
| catcat20.shape.Theta 0.018 | 46 | 67% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 85% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 23 | 37% | 105 |
| catcat20.shape.Theta 0.018 | 22 | 35% | 46 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 10% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 10% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 11 |
| sample.TrackFire 1.0 | 1 | 2% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |
| pa.Improved 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.8 | 100 / 210 | 2.73 | 17.4% | 29585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 17.4% | 100 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 25 |
| emp.Yngwie 1.11 | 3.2 | 13.2% | 49 |
| mld.DustBunny 3.8 | 4.0 | 11.9% | 7 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.0% | 13 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.8% | 16 |
| lambdaxy.TBot 0.1 | 7.0 | 7.6% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.0% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 80.3 | 18 / 35 | 5310 |
| 2 | 1 | 67.5 | 84.8 | 15 / 35 | 5267 |
| 3 | 1 | 64.3 | 75.2 | 15 / 35 | 4482 |
| 4 | 1 | 68.5 | 85.7 | 20 / 35 | 5102 |
| 5 | 1 | 65.9 | 80.3 | 17 / 35 | 4570 |
| 6 | 1 | 65.9 | 78.4 | 15 / 35 | 4854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 48 | 71% |
| kawigi.micro.Shiz 1.1 | 28 | 89% |
| kawigi.robot.Girl 1.2 | 20 | 85% |
| cb.nano.Insomnia 1.0 | 13 | 69% |
| mld.DustBunny 3.8 | 12 | 83% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 32 | 29% | 77 |
| kawigi.micro.Shiz 1.1 | 22 | 20% | 46 |
| cb.nano.Insomnia 1.0 | 20 | 18% | 24 |
| mld.DustBunny 3.8 | 15 | 14% | 31 |
| kawigi.robot.Girl 1.2 | 12 | 11% | 15 |
| Grystrion.TrackerWO 1.0 | 4 | 4% | 4 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| divineomega.TrialBot 0.003 | 2 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.3 | 98 / 210 | 2.32 | 18.6% | 33264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.3 | 18.6% | 98 |
| gh.Griezel 0.5.2 | 1.7 | 16.9% | 69 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.5% | 27 |
| tvv.nano.Polaris 1.2 | 5.3 | 8.9% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.0% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.8% | 2 |
| asd.Cthulhu 1.3 | 8.7 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 4.7% | 3 |
| repositorio.NanoStep 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.0 | 16 / 35 | 5460 |
| 2 | 2 | 66.9 | 81.9 | 14 / 35 | 4889 |
| 3 | 2 | 67.3 | 81.6 | 14 / 35 | 5204 |
| 4 | 1 | 69.2 | 86.3 | 20 / 35 | 5720 |
| 5 | 1 | 68.8 | 87.3 | 12 / 35 | 5691 |
| 6 | 1 | 70.8 | 88.6 | 22 / 35 | 6300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 89 | 54% |
| techdude.forest.FlamingForest 1.1 | 26 | 62% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 100% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1293. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 56 | 50% | 111 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 18% | 34 |
| techdude.forest.FlamingForest 1.1 | 14 | 13% | 30 |
| asd.Cthulhu 1.3 | 11 | 10% | 11 |
| bvh.fnr.Fenrir 0.36l | 8 | 7% | 11 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 5 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 4 |
| stelo.IntrinsicVolatility 1.4 | 0 | 0% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.2 | 90 / 210 | 2.79 | 17.0% | 29066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 17.0% | 90 |
| et.Predator 1.8 | 2.5 | 13.6% | 27 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.4% | 28 |
| cx.BlestPain 1.41 | 3.7 | 12.4% | 45 |
| nic.Nicator 2.4 | 5.0 | 11.2% | 10 |
| ahf.NanoAndrew .4 | 5.7 | 10.8% | 8 |
| maribo.melee.BMV 0.1 | 6.8 | 9.0% | 3 |
| tex.Longbot 0.4 | 8.3 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 18 / 35 | 4754 |
| 2 | 1 | 65.7 | 79.4 | 13 / 35 | 4628 |
| 3 | 1 | 65.5 | 76.2 | 16 / 35 | 4883 |
| 4 | 1 | 66.7 | 81.0 | 16 / 35 | 4931 |
| 5 | 1 | 67.4 | 84.4 | 14 / 35 | 5193 |
| 6 | 1 | 64.8 | 75.6 | 13 / 35 | 4677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 45 | 76% |
| oog.melee.Mercutio 1.0 | 27 | 74% |
| nic.Nicator 2.4 | 25 | 84% |
| cx.BlestPain 1.41 | 23 | 35% |
| ahf.NanoAndrew .4 | 6 | 83% |
| goblin.Bender 2.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 33 | 27% | 47 |
| et.Predator 1.8 | 25 | 21% | 52 |
| oog.melee.Mercutio 1.0 | 19 | 16% | 37 |
| nic.Nicator 2.4 | 15 | 12% | 34 |
| ahf.NanoAndrew .4 | 15 | 12% | 22 |
| maribo.melee.BMV 0.1 | 11 | 9% | 13 |
| goblin.Bender 2.4 | 1 | 1% | 2 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.2 | 125 / 210 | 1.98 | 18.7% | 27382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 18.7% | 125 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.4% | 34 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.1% | 24 |
| uji.DBH 1.1 | 4.3 | 10.7% | 7 |
| ratosh.Nobo 0.21 | 5.3 | 9.7% | 2 |
| spinnercat.Robovirus 2.718 | 6.2 | 9.3% | 5 |
| sigterm.Sigterm 1.0 | 6.8 | 7.9% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.4% | 2 |
| stelo.WangRobot 1.0 | 9.0 | 5.8% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 90.8 | 22 / 35 | 4581 |
| 2 | 1 | 67.9 | 87.0 | 19 / 35 | 4908 |
| 3 | 1 | 68.9 | 91.1 | 21 / 35 | 4749 |
| 4 | 1 | 67.5 | 87.0 | 21 / 35 | 4403 |
| 5 | 1 | 67.9 | 87.9 | 22 / 35 | 4539 |
| 6 | 1 | 68.1 | 91.1 | 20 / 35 | 4202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 51 | 71% |
| agd.Mooserwirt2 2.7 | 36 | 67% |
| uji.DBH 1.1 | 26 | 88% |
| stelo.WangRobot 1.0 | 13 | 77% |
| sigterm.Sigterm 1.0 | 13 | 92% |
| ratosh.Nobo 0.21 | 10 | 90% |
| spinnercat.Robovirus 2.718 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 31 | 36% | 70 |
| agd.Mooserwirt2 2.7 | 21 | 25% | 44 |
| uji.DBH 1.1 | 11 | 13% | 30 |
| ratosh.Nobo 0.21 | 7 | 8% | 15 |
| stelo.WangRobot 1.0 | 5 | 6% | 14 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 14 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 11 |
| sigterm.Sigterm 1.0 | 2 | 2% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 2 |

## Melee bench: F19

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 95.6 | 172 / 210 | 1.40 | 21.4% | 35559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 21.4% | 172 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.9% | 15 |
| mld.Infinity 2.2 | 3.0 | 13.6% | 21 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.9% | 1 |
| erdnis.Rover 0.3 | 4.5 | 10.5% | 1 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.1% | 0 |
| pac.ABC 2.1 | 7.5 | 6.9% | 0 |
| mbh.Mbh 0.1 | 7.7 | 7.0% | 0 |
| pbg.R2D2 1.0 | 8.5 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.2 | 30 / 35 | 5818 |
| 2 | 1 | 72.9 | 97.1 | 29 / 35 | 6353 |
| 3 | 1 | 72.9 | 97.5 | 30 / 35 | 5964 |
| 4 | 1 | 71.3 | 93.3 | 27 / 35 | 5471 |
| 5 | 1 | 72.4 | 94.0 | 26 / 35 | 6230 |
| 6 | 1 | 72.2 | 95.6 | 30 / 35 | 5723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 92% |
| mld.Infinity 2.2 | 57 | 88% |
| erdnis.Rover 0.3 | 14 | 93% |
| krillr.mini.JointStrike 2.0.0 | 12 | 100% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pac.ABC 2.1 | 7 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 1118. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 19 | 50% | 123 |
| mld.Infinity 2.2 | 12 | 32% | 25 |
| krillr.mini.JointStrike 2.0.0 | 5 | 13% | 23 |
| erdnis.Rover 0.3 | 2 | 5% | 10 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 4 |
| mbh.Mbh 0.1 | 0 | 0% | 4 |

## Melee bench: F20

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.3 | 132 / 210 | 1.87 | 19.8% | 33302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 19.8% | 132 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.1% | 31 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.5% | 11 |
| fwb.Nine 1.0.1 | 3.8 | 11.2% | 18 |
| catcat20.Rabbit 0.001 | 4.7 | 10.4% | 17 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.8% | 0 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 24 / 35 | 5730 |
| 2 | 1 | 70.1 | 92.1 | 23 / 35 | 5373 |
| 3 | 1 | 68.8 | 87.6 | 16 / 35 | 5826 |
| 4 | 1 | 70.3 | 92.1 | 24 / 35 | 5500 |
| 5 | 1 | 70.9 | 91.7 | 25 / 35 | 5665 |
| 6 | 1 | 69.4 | 90.8 | 20 / 35 | 5208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 81% |
| fwb.Nine 1.0.1 | 42 | 74% |
| nz.jdc.nano.GridFu 1.0 | 20 | 85% |
| catcat20.Rabbit 0.001 | 15 | 60% |
| bayen.nut.Squirrel 1.615 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1185. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 35 | 44% | 86 |
| fwb.Nine 1.0.1 | 14 | 18% | 22 |
| nz.jdc.nano.GridFu 1.0 | 12 | 15% | 37 |
| catcat20.Rabbit 0.001 | 12 | 15% | 31 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 17 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 7 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 93.7 | 150 / 210 | 1.57 | 20.6% | 34007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 20.6% | 150 |
| eem.EvBot v4.6.16 | 2.0 | 16.0% | 47 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.6% | 8 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 11.7% | 1 |
| eld.Hmm 1.0 | 5.2 | 8.2% | 2 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.9% | 4 |
| fire219.CatBot 1.0 | 7.2 | 6.8% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.9% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.9 | 26 / 35 | 5496 |
| 2 | 1 | 70.8 | 94.3 | 23 / 35 | 5357 |
| 3 | 1 | 71.3 | 94.6 | 26 / 35 | 5474 |
| 4 | 1 | 71.3 | 93.3 | 23 / 35 | 6020 |
| 5 | 1 | 70.6 | 90.2 | 25 / 35 | 5655 |
| 6 | 1 | 72.1 | 94.9 | 27 / 35 | 6005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 109 | 74% |
| dummy.mini.Scimitar 1.01 | 37 | 95% |
| cf.RiO.RiOx 4.2.1 | 20 | 100% |
| eld.Hmm 1.0 | 11 | 91% |
| oa.weak.BotherBot 0.1 | 6 | 67% |

Hadur died in 62 of 210 rounds, at a mean tick of 1442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 35 | 56% | 95 |
| dummy.mini.Scimitar 1.01 | 14 | 23% | 59 |
| cf.RiO.RiOx 4.2.1 | 6 | 10% | 24 |
| oa.weak.BotherBot 0.1 | 3 | 5% | 7 |
| eld.Hmm 1.0 | 1 | 2% | 20 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.0 | 107 / 210 | 2.17 | 18.3% | 30228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 18.3% | 107 |
| kvk.HebusLeTroll 0.35 | 2.5 | 15.6% | 38 |
| pe.SandboxDT 2.71m | 2.5 | 15.3% | 46 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.1% | 18 |
| bigpete.Stewie 1.0 | 5.0 | 9.8% | 1 |
| tad.Dalek98 0.98 | 6.7 | 6.6% | 0 |
| yk.JahRoslav 1.1 | 6.8 | 6.8% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.0 | 18 / 35 | 4961 |
| 2 | 1 | 67.3 | 83.8 | 14 / 35 | 5223 |
| 3 | 1 | 69.4 | 89.5 | 18 / 35 | 5326 |
| 4 | 1 | 70.0 | 89.8 | 24 / 35 | 5254 |
| 5 | 1 | 68.5 | 87.3 | 20 / 35 | 5136 |
| 6 | 1 | 66.6 | 84.8 | 13 / 35 | 4328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 59 | 71% |
| pe.SandboxDT 2.71m | 43 | 53% |
| jlm.javaDisturbance 0.59 | 36 | 83% |
| bigpete.Stewie 1.0 | 7 | 100% |
| pbg.NinjaX 1.2 | 3 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 40 | 38% | 66 |
| kvk.HebusLeTroll 0.35 | 36 | 35% | 74 |
| jlm.javaDisturbance 0.59 | 20 | 19% | 47 |
| bigpete.Stewie 1.0 | 5 | 5% | 17 |
| tad.Dalek98 0.98 | 2 | 2% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.4 | 143 / 210 | 1.59 | 19.9% | 30344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 19.9% | 143 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 49 |
| cre.Karolos 0.32 | 3.0 | 13.2% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.8% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.3% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.7% | 2 |
| cw.megas.Blade 0.8 | 6.7 | 8.3% | 0 |
| sample.Walls 1.0 | 7.8 | 7.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.7 | 22 / 35 | 5224 |
| 2 | 1 | 72.0 | 97.8 | 29 / 35 | 5045 |
| 3 | 1 | 70.4 | 92.7 | 22 / 35 | 4716 |
| 4 | 1 | 71.2 | 94.6 | 24 / 35 | 5442 |
| 5 | 1 | 70.4 | 89.8 | 21 / 35 | 5339 |
| 6 | 1 | 69.8 | 93.0 | 25 / 35 | 4578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 90 | 70% |
| cre.Karolos 0.32 | 45 | 82% |
| stelo.AreaTargetingBot 1.1 | 19 | 89% |
| stelo.RamTrackSurfer 1.2 | 10 | 100% |
| sample.Walls 1.0 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 39 | 57% | 99 |
| cre.Karolos 0.32 | 13 | 19% | 50 |
| stelo.AreaTargetingBot 1.1 | 10 | 14% | 27 |
| stelo.RamTrackSurfer 1.2 | 4 | 6% | 17 |
| cw.megas.Blade 0.8 | 1 | 1% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 4 |
| sample.Walls 1.0 | 0 | 0% | 2 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F24

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 73.8 | 56 / 210 | 3.36 | 14.6% | 21387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.8 | 14.6% | 56 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.6% | 46 |
| davidalves.Phoenix 0.54 | 2.3 | 14.1% | 47 |
| florent.XSeries.X2 0.12 | 3.8 | 13.3% | 29 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.9% | 21 |
| oog.melee.Corsair 1.0 | 6.0 | 8.8% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.6% | 7 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 0 |
| evd.X1 0.01 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 77.5 | 13 / 35 | 3707 |
| 2 | 1 | 63.2 | 78.4 | 11 / 35 | 3554 |
| 3 | 1 | 64.2 | 81.0 | 10 / 35 | 3587 |
| 4 | 4 | 58.6 | 63.5 | 3 / 35 | 3466 |
| 5 | 2 | 61.7 | 72.4 | 10 / 35 | 3554 |
| 6 | 2 | 61.1 | 70.2 | 9 / 35 | 3519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 25 | 64% |
| davidalves.Phoenix 0.54 | 24 | 63% |
| florent.XSeries.X2 0.12 | 19 | 63% |
| pedersen.Ugluk 1.1.1 | 12 | 58% |
| stelo.SoJNanoMelee 1.1 | 5 | 60% |
| as.FrankTheTank 1.3 | 2 | 100% |
| oog.melee.Corsair 1.0 | 1 | 0% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 27% | 57 |
| davidalves.Phoenix 0.54 | 34 | 22% | 42 |
| pedersen.Ugluk 1.1.1 | 31 | 20% | 38 |
| florent.XSeries.X2 0.12 | 29 | 19% | 42 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 7 |
| oog.melee.Corsair 1.0 | 5 | 3% | 12 |
| lunchie.Lunchbox 0.93 | 5 | 3% | 8 |
| evd.X1 0.01 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.9 | 138 / 210 | 2.09 | 18.9% | 26395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 18.9% | 138 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.1% | 24 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.3% | 19 |
| jdw.Hurricane 1.4 | 3.8 | 11.1% | 16 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 8.8% | 8 |
| ds.Oo 2.2 | 6.0 | 8.5% | 3 |
| awesomeness.Elite 1.0 | 7.5 | 7.0% | 2 |
| adt.Ar2 1.1 | 7.8 | 6.7% | 1 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.2 | 26 / 35 | 4283 |
| 2 | 1 | 67.3 | 84.8 | 21 / 35 | 4183 |
| 3 | 1 | 68.0 | 87.0 | 19 / 35 | 4528 |
| 4 | 1 | 68.2 | 85.1 | 22 / 35 | 4476 |
| 5 | 1 | 71.0 | 95.6 | 29 / 35 | 4885 |
| 6 | 1 | 67.3 | 85.1 | 21 / 35 | 4040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 90% |
| voidious.micro.BlitzBat 1.05 | 42 | 95% |
| jdw.Hurricane 1.4 | 27 | 81% |
| ds.Oo 2.2 | 15 | 93% |
| adt.Ar2 1.1 | 8 | 100% |
| gre.svman4.Morfeas 1.4.1 | 7 | 14% |
| awesomeness.Elite 1.0 | 3 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| gjr.Cephalosporin 0.1 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 23 | 32% | 68 |
| jdw.Hurricane 1.4 | 14 | 19% | 29 |
| voidious.micro.BlitzBat 1.05 | 10 | 14% | 53 |
| gre.svman4.Morfeas 1.4.1 | 9 | 13% | 13 |
| ds.Oo 2.2 | 5 | 7% | 22 |
| adt.Ar2 1.1 | 4 | 6% | 10 |
| gjr.Cephalosporin 0.1 | 4 | 6% | 9 |
| amk.ChumbaMini 0.2 | 2 | 3% | 3 |
| awesomeness.Elite 1.0 | 1 | 1% | 3 |

## Melee bench: F26

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.9 | 128 / 210 | 1.91 | 19.4% | 34444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 19.4% | 128 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 40 |
| lrem.Spectre 0.4.4 | 3.5 | 12.3% | 13 |
| shu.nitro.LENIN .T34 | 3.7 | 12.1% | 23 |
| js.PinBall 1.6 | 5.5 | 10.1% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.5% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.5% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 7.0% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.9 | 26 / 35 | 5642 |
| 2 | 1 | 70.3 | 90.8 | 23 / 35 | 6079 |
| 3 | 1 | 70.5 | 90.2 | 22 / 35 | 5883 |
| 4 | 1 | 68.8 | 88.6 | 18 / 35 | 5770 |
| 5 | 1 | 68.7 | 86.7 | 20 / 35 | 5357 |
| 6 | 1 | 69.6 | 88.3 | 19 / 35 | 5713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 49 | 67% |
| shu.nitro.LENIN .T34 | 42 | 69% |
| lrem.Spectre 0.4.4 | 40 | 88% |
| js.PinBall 1.6 | 16 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 35 | 42% | 72 |
| shu.nitro.LENIN .T34 | 26 | 31% | 59 |
| lrem.Spectre 0.4.4 | 11 | 13% | 36 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 4% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 4% | 8 |
| js.PinBall 1.6 | 2 | 2% | 19 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 3 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.5 | 143 / 210 | 1.85 | 18.9% | 25859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 18.9% | 143 |
| mk.Alpha 0.2.1 | 2.0 | 14.2% | 30 |
| wee.Gem 1.8.4 | 3.7 | 11.3% | 20 |
| EH.Eagle 1.0.6 | 3.8 | 11.1% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.5% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.1% | 1 |
| throxbot.ThroxBot 0.1 | 8.2 | 7.4% | 0 |
| joe.ADinosaur 1.0 | 8.2 | 6.6% | 1 |
| caimano.Furia_Ceca 0.22 | 8.7 | 5.6% | 1 |
| cs.Grudge 1.0 | 8.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 94.0 | 26 / 35 | 4750 |
| 2 | 1 | 68.9 | 89.5 | 25 / 35 | 4619 |
| 3 | 1 | 68.6 | 92.1 | 24 / 35 | 4261 |
| 4 | 1 | 67.7 | 87.9 | 23 / 35 | 3948 |
| 5 | 1 | 67.0 | 87.6 | 20 / 35 | 3938 |
| 6 | 1 | 69.0 | 92.1 | 25 / 35 | 4343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 76 | 84% |
| wee.Gem 1.8.4 | 32 | 84% |
| EH.Eagle 1.0.6 | 20 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 95% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 31 | 46% | 88 |
| joe.ADinosaur 1.0 | 8 | 12% | 12 |
| wee.Gem 1.8.4 | 7 | 10% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 10% | 26 |
| throxbot.ThroxBot 0.1 | 6 | 9% | 9 |
| EH.Eagle 1.0.6 | 5 | 7% | 26 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 8 |

## Melee bench: F28

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 91.1 | 144 / 210 | 1.80 | 19.4% | 27763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 19.4% | 144 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 34 |
| uji.Antique 1.0 | 3.2 | 11.9% | 15 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.7% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.9% | 4 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.6% | 0 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.6% | 0 |
| matt.advanced.Katana 1.0 | 8.7 | 6.1% | 0 |
| stelo.PianistNano 1.2 | 8.8 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.5 | 23 / 35 | 4333 |
| 2 | 1 | 69.6 | 93.0 | 27 / 35 | 4479 |
| 3 | 1 | 68.9 | 89.5 | 23 / 35 | 4630 |
| 4 | 1 | 68.7 | 87.3 | 22 / 35 | 4953 |
| 5 | 1 | 70.2 | 94.9 | 27 / 35 | 4505 |
| 6 | 1 | 69.3 | 91.1 | 22 / 35 | 4863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 88 | 78% |
| uji.Antique 1.0 | 47 | 89% |
| qohnil.blot.BlotBot 3.61 | 15 | 67% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| ahr.ice.Ice 1.0.2 | 6 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 41% | 87 |
| uji.Antique 1.0 | 11 | 17% | 43 |
| pfvicm.Sobieski 7.2.3b | 10 | 15% | 20 |
| amk.ChumbaWumba 0.3 | 8 | 12% | 15 |
| qohnil.blot.BlotBot 3.61 | 7 | 11% | 25 |
| ahr.ice.Ice 1.0.2 | 1 | 2% | 8 |
| matt.advanced.Katana 1.0 | 1 | 2% | 5 |
| stelo.PianistNano 1.2 | 1 | 2% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.6 | 115 / 210 | 2.30 | 18.7% | 29159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 18.7% | 115 |
| deewiant.Anomaly 0.2 | 2.3 | 15.2% | 34 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 15.0% | 43 |
| myl.micro.Troodon 1.10 | 4.3 | 11.1% | 9 |
| jok.PheonixM 0.1.2 | 4.7 | 10.9% | 5 |
| ph.melee.ArcherME 0.3 | 6.3 | 7.6% | 1 |
| DBall.Anarchy 0.1 | 6.7 | 7.1% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.4% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.6% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.1 | 19 / 35 | 4651 |
| 2 | 1 | 69.8 | 87.9 | 20 / 35 | 5038 |
| 3 | 1 | 70.0 | 90.2 | 19 / 35 | 5270 |
| 4 | 1 | 68.4 | 83.8 | 18 / 35 | 4871 |
| 5 | 1 | 67.2 | 81.0 | 18 / 35 | 4490 |
| 6 | 1 | 69.1 | 86.7 | 21 / 35 | 4839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 63 | 78% |
| zyx.mega.YersiniaPestis 3.1 | 52 | 65% |
| myl.micro.Troodon 1.10 | 15 | 87% |
| jok.PheonixM 0.1.2 | 14 | 93% |
| DBall.Anarchy 0.1 | 5 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 0% |

Hadur died in 96 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 39 | 41% | 91 |
| zyx.mega.YersiniaPestis 3.1 | 29 | 30% | 60 |
| myl.micro.Troodon 1.10 | 15 | 16% | 27 |
| jok.PheonixM 0.1.2 | 8 | 8% | 18 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 7 |

## Melee bench: F30

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 71.4 | 45 / 210 | 3.58 | 13.9% | 21033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.2 | 14.3% | 58 |
| hadur117.mini.DeiseP075 0.4 | 3.0 | 13.9% | 45 |
| darkcanuck.B26354 1.06 | 3.0 | 13.8% | 46 |
| oog.melee.Capulet 1.2 | 3.3 | 12.8% | 28 |
| stelo.PastFuture 2.3.2 | 3.5 | 13.5% | 23 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.8% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 7.5% | 1 |
| ntc.Opposite 1.5 | 7.7 | 7.3% | 2 |
| tripphippy.Alice 1.1 | 8.3 | 6.7% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 75.2 | 6 / 35 | 3642 |
| 2 | 1 | 64.2 | 78.7 | 10 / 35 | 4021 |
| 3 | 3 | 60.5 | 71.1 | 6 / 35 | 3241 |
| 4 | 5 | 60.4 | 68.9 | 6 / 35 | 3315 |
| 5 | 2 | 62.0 | 73.7 | 11 / 35 | 3509 |
| 6 | 5 | 56.9 | 60.6 | 6 / 35 | 3305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 25 | 44% |
| darkcanuck.B26354 1.06 | 24 | 42% |
| stelo.PastFuture 2.3.2 | 19 | 74% |
| oog.melee.Capulet 1.2 | 8 | 38% |
| intruder.PrairieWolf 2.61 | 4 | 75% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 26% | 52 |
| catcat20.Matcha 0.006 | 40 | 24% | 53 |
| stelo.PastFuture 2.3.2 | 35 | 21% | 48 |
| oog.melee.Capulet 1.2 | 23 | 14% | 28 |
| ntc.Opposite 1.5 | 9 | 5% | 10 |
| tripphippy.Alice 1.1 | 5 | 3% | 7 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 2% | 6 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 73.1 | 49 / 210 | 3.42 | 14.2% | 19853 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.9% | 95 |
| hadur117.mini.DeiseP075 0.4 | 2.3 | 14.2% | 49 |
| gh.mini.Griezel 0.2 | 3.0 | 13.0% | 38 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.9% | 14 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.6% | 11 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 3 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.7% | 1 |
| fm.mammillarias 1.3 | 7.8 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 66.0 | 6 / 35 | 3205 |
| 2 | 2 | 62.4 | 73.7 | 8 / 35 | 3644 |
| 3 | 2 | 62.8 | 78.7 | 6 / 35 | 3256 |
| 4 | 2 | 62.5 | 76.5 | 9 / 35 | 3174 |
| 5 | 2 | 62.6 | 74.0 | 13 / 35 | 3242 |
| 6 | 3 | 60.7 | 69.5 | 7 / 35 | 3332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 43% |
| gh.mini.Griezel 0.2 | 20 | 60% |
| spinnercat.micro.Tyger 0.1 | 8 | 88% |
| d414.nano.Quantum 1.0.0 | 6 | 67% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |
| timmit.nano.TimDog 0.33 | 2 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 58 | 36% | 79 |
| spinnercat.micro.Tyger 0.1 | 30 | 19% | 36 |
| gh.mini.Griezel 0.2 | 29 | 18% | 41 |
| d414.nano.Quantum 1.0.0 | 21 | 13% | 26 |
| gh.nano.Grofvuil 0.2 | 9 | 6% | 12 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 90.4 | 123 / 210 | 1.87 | 18.7% | 28019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 18.7% | 123 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.2% | 58 |
| apc.botM 3.0 | 3.5 | 11.8% | 15 |
| lxx.ConceptA 0.8 | 3.8 | 11.1% | 5 |
| vjik.UnViolation 1.1 | 5.3 | 9.1% | 5 |
| bayen.UbaMicro 1.4 | 5.7 | 8.7% | 4 |
| panzer.Panzer 0.2 | 6.8 | 7.7% | 0 |
| conscience.Electron 1.3g | 8.5 | 6.2% | 0 |
| yk.JahMicro 1.0 | 8.5 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 90.2 | 18 / 35 | 4756 |
| 2 | 1 | 69.7 | 94.6 | 24 / 35 | 4927 |
| 3 | 1 | 66.9 | 87.0 | 18 / 35 | 4445 |
| 4 | 1 | 68.7 | 92.1 | 20 / 35 | 4790 |
| 5 | 1 | 68.3 | 90.2 | 22 / 35 | 4505 |
| 6 | 1 | 67.5 | 88.3 | 21 / 35 | 4596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 73 | 55% |
| lxx.ConceptA 0.8 | 37 | 86% |
| apc.botM 3.0 | 23 | 70% |
| vjik.UnViolation 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| panzer.Panzer 0.2 | 8 | 100% |
| donjezza.Jezza 1.0 | 6 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 50 | 57% | 97 |
| apc.botM 3.0 | 13 | 15% | 35 |
| lxx.ConceptA 0.8 | 11 | 13% | 31 |
| bayen.UbaMicro 1.4 | 7 | 8% | 14 |
| vjik.UnViolation 1.1 | 4 | 5% | 21 |
| conscience.Electron 1.3g | 3 | 3% | 3 |
| yk.JahMicro 1.0 | 0 | 0% | 3 |
| panzer.Panzer 0.2 | 0 | 0% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F33

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.5 | 143 / 210 | 1.95 | 19.8% | 31065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 19.8% | 143 |
| maribo.Quester 0.3 | 2.0 | 15.7% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 11.8% | 10 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.0% | 8 |
| labg.Cataclysm 2.05 | 4.7 | 10.3% | 12 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.7% | 4 |
| baal.nano.N 1.42 | 6.5 | 8.4% | 0 |
| zyx.micro.Ant 1.1 | 8.2 | 5.8% | 0 |
| sanja.First 0.1 | 9.0 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 25 / 35 | 5216 |
| 2 | 1 | 70.3 | 90.2 | 25 / 35 | 5394 |
| 3 | 1 | 70.1 | 91.1 | 25 / 35 | 4764 |
| 4 | 1 | 69.9 | 89.5 | 23 / 35 | 5196 |
| 5 | 1 | 70.1 | 88.9 | 22 / 35 | 5208 |
| 6 | 1 | 69.3 | 85.7 | 23 / 35 | 5287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 63 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 92% |
| gre.svman4.Leonidas 1.3.2 | 35 | 97% |
| labg.Cataclysm 2.05 | 12 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 100% |
| sanja.First 0.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 32 | 47% | 93 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 19% | 47 |
| labg.Cataclysm 2.05 | 9 | 13% | 20 |
| gre.svman4.Leonidas 1.3.2 | 6 | 9% | 28 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 7% | 10 |
| sanja.First 0.1 | 1 | 1% | 2 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| baal.nano.N 1.42 | 0 | 0% | 6 |

## Melee bench: F34

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.9 | 70 / 210 | 2.63 | 16.7% | 27915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.7 | 17.0% | 73 |
| hadur117.mini.DeiseP075 0.4 | 1.8 | 16.7% | 70 |
| kid.Gladiator .7.2 | 2.5 | 16.2% | 45 |
| tcf.Reach 3 | 4.3 | 11.7% | 7 |
| jcs.Seth 1.8 | 4.8 | 11.1% | 14 |
| cli.Dancer 1.1 | 5.8 | 9.5% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 6.4% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 81.9 | 10 / 35 | 4454 |
| 2 | 3 | 63.9 | 70.8 | 9 / 35 | 4428 |
| 3 | 1 | 68.8 | 87.9 | 16 / 35 | 4759 |
| 4 | 2 | 66.7 | 81.9 | 10 / 35 | 4625 |
| 5 | 2 | 66.7 | 83.2 | 11 / 35 | 4484 |
| 6 | 1 | 68.2 | 85.7 | 14 / 35 | 5165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 66 | 53% |
| kid.Gladiator .7.2 | 34 | 47% |
| jcs.Seth 1.8 | 16 | 69% |
| tcf.Reach 3 | 8 | 63% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 60 | 43% | 94 |
| kid.Gladiator .7.2 | 54 | 39% | 68 |
| tcf.Reach 3 | 14 | 10% | 21 |
| jcs.Seth 1.8 | 7 | 5% | 20 |
| cli.Dancer 1.1 | 2 | 1% | 4 |
| ratosh.Wesco 1.4 | 2 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 80.4 | 48 / 210 | 2.77 | 15.5% | 22053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.3% | 132 |
| hadur117.mini.DeiseP075 0.4 | 2.0 | 15.5% | 48 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.2% | 13 |
| rz.HawkOnFire 0.1 | 4.3 | 11.7% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.3% | 11 |
| wit.Chuliath 1.0 | 6.8 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 6.4% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.6% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 84.1 | 8 / 35 | 4035 |
| 2 | 2 | 65.4 | 84.4 | 10 / 35 | 3739 |
| 3 | 2 | 65.0 | 81.3 | 10 / 35 | 3688 |
| 4 | 2 | 62.9 | 78.1 | 6 / 35 | 3390 |
| 5 | 2 | 62.7 | 75.6 | 6 / 35 | 3591 |
| 6 | 2 | 63.6 | 78.7 | 8 / 35 | 3610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 84 | 21% |
| gh.mini.Gruwel 0.9 | 16 | 69% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 82% |
| rz.HawkOnFire 0.1 | 10 | 90% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 86 | 53% | 108 |
| gh.mini.Gruwel 0.9 | 34 | 21% | 46 |
| rz.HawkOnFire 0.1 | 21 | 13% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 8% | 19 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 5 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 3 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.2 | 167 / 210 | 1.61 | 20.9% | 32601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 20.9% | 167 |
| bzdp.Pansy 2.1 | 2.5 | 12.1% | 15 |
| alpha.RainingFire 1.0 | 3.3 | 11.1% | 10 |
| bvh.micro.Freya 0.3 | 3.8 | 10.8% | 4 |
| mz.Cork 0.1 | 5.0 | 10.1% | 6 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.4% | 1 |
| m3thos.Eva02 0.7.1 | 6.7 | 8.9% | 3 |
| dl.BetterWalls 1.0 | 8.0 | 6.6% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.7% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.8 | 29 / 35 | 5222 |
| 2 | 1 | 70.1 | 92.7 | 24 / 35 | 5179 |
| 3 | 1 | 70.9 | 93.0 | 28 / 35 | 5420 |
| 4 | 1 | 71.9 | 96.8 | 30 / 35 | 5452 |
| 5 | 1 | 70.8 | 90.8 | 28 / 35 | 5688 |
| 6 | 1 | 71.5 | 94.9 | 28 / 35 | 5640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 87% |
| alpha.RainingFire 1.0 | 31 | 81% |
| bvh.micro.Freya 0.3 | 25 | 100% |
| mz.Cork 0.1 | 21 | 100% |
| bvh.mini.Fenrir 0.39 | 18 | 94% |
| m3thos.Eva02 0.7.1 | 13 | 92% |
| dl.BetterWalls 1.0 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 33% | 61 |
| alpha.RainingFire 1.0 | 8 | 19% | 36 |
| bvh.mini.Fenrir 0.39 | 8 | 19% | 21 |
| mz.Cork 0.1 | 3 | 7% | 28 |
| bvh.micro.Freya 0.3 | 3 | 7% | 19 |
| m3thos.Eva02 0.7.1 | 3 | 7% | 19 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 4 |
| dl.BetterWalls 1.0 | 1 | 2% | 16 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F37

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 93.4 | 175 / 210 | 1.60 | 20.3% | 34187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 20.3% | 175 |
| germ.TheMind .2 | 2.0 | 11.4% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.2% | 6 |
| EBBU.Sim2 1.02 | 4.7 | 9.5% | 4 |
| agrach.Dalek 1.0 | 6.0 | 8.6% | 4 |
| lmk.ACPFinal 0.1 | 6.3 | 8.5% | 1 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.7% | 8 |
| mb.Beast 0.1 | 8.0 | 7.8% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 7.6% | 0 |
| skm.Ryubot 1.0 | 8.7 | 7.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 96.2 | 29 / 35 | 5504 |
| 2 | 1 | 69.4 | 92.1 | 27 / 35 | 5789 |
| 3 | 1 | 70.2 | 94.9 | 32 / 35 | 5525 |
| 4 | 1 | 70.0 | 94.0 | 30 / 35 | 5750 |
| 5 | 1 | 69.9 | 92.7 | 29 / 35 | 5769 |
| 6 | 1 | 69.1 | 90.5 | 28 / 35 | 5850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 58 | 95% |
| stelo.UntouchableNano 1.3 | 29 | 90% |
| agrach.Dalek 1.0 | 21 | 95% |
| skm.Ryubot 1.0 | 17 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 94% |
| EBBU.Sim2 1.02 | 16 | 100% |
| mb.Beast 0.1 | 12 | 100% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 7 | 19% | 51 |
| stelo.UntouchableNano 1.3 | 6 | 17% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 11% | 32 |
| agrach.Dalek 1.0 | 4 | 11% | 31 |
| mb.Beast 0.1 | 4 | 11% | 20 |
| lmk.ACPFinal 0.1 | 4 | 11% | 19 |
| EBBU.Sim2 1.02 | 4 | 11% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 6% | 6 |
| skm.Ryubot 1.0 | 1 | 3% | 1 |

## Melee bench: F38

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.1 | 94 / 210 | 2.70 | 16.5% | 24722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.3 | 16.5% | 94 |
| justin.Mallais 14.0 | 1.7 | 15.6% | 64 |
| bvh.mini.Freya 0.55 | 3.2 | 13.0% | 11 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.3% | 22 |
| cs.Wren 1.0 | 5.2 | 10.5% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 11.0% | 6 |
| kdf.KoulDestroyer 1.0 | 6.7 | 8.6% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 6.0% | 1 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 85.1 | 16 / 35 | 4079 |
| 2 | 1 | 67.6 | 85.4 | 19 / 35 | 4474 |
| 3 | 2 | 64.9 | 78.1 | 13 / 35 | 4073 |
| 4 | 1 | 66.1 | 82.5 | 17 / 35 | 4354 |
| 5 | 2 | 62.1 | 70.8 | 13 / 35 | 3478 |
| 6 | 1 | 66.8 | 84.4 | 16 / 35 | 4264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 46 | 61% |
| bvh.mini.Freya 0.55 | 27 | 85% |
| bts.mega.Gnarly 1.4 | 21 | 86% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 100% |
| cs.Wren 1.0 | 9 | 100% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 41 | 35% | 69 |
| bvh.mini.Freya 0.55 | 23 | 19% | 35 |
| bts.mega.Gnarly 1.4 | 17 | 14% | 33 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 12% | 39 |
| cs.Wren 1.0 | 10 | 8% | 17 |
| kdf.KoulDestroyer 1.0 | 10 | 8% | 14 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 1 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F39

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.3 | 103 / 210 | 2.23 | 18.2% | 30407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 18.2% | 103 |
| bvh.fry.Freya 0.82 | 2.2 | 14.4% | 19 |
| az.Ololobot 0.2.4 | 3.0 | 13.1% | 52 |
| catcat20.Lambda 0.024 | 3.8 | 11.6% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.1% | 8 |
| gimp.GimpBot 0.1 | 6.5 | 7.7% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.2% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.5 | 7.2% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.0 | 20 / 35 | 5035 |
| 2 | 1 | 67.8 | 86.0 | 20 / 35 | 5064 |
| 3 | 1 | 68.2 | 87.0 | 20 / 35 | 5190 |
| 4 | 1 | 67.8 | 87.3 | 15 / 35 | 5225 |
| 5 | 1 | 68.0 | 88.9 | 16 / 35 | 5101 |
| 6 | 1 | 65.7 | 82.5 | 12 / 35 | 4792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 53 | 53% |
| bvh.fry.Freya 0.82 | 46 | 78% |
| catcat20.Lambda 0.024 | 27 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 87% |
| gimp.GimpBot 0.1 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1075. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 36 | 34% | 68 |
| bvh.fry.Freya 0.82 | 34 | 32% | 72 |
| catcat20.Lambda 0.024 | 17 | 16% | 34 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 10% | 15 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 5 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 7 |
| gimp.GimpBot 0.1 | 1 | 1% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |

## Melee bench: F40

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.0 | 128 / 210 | 1.99 | 19.1% | 29274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 19.1% | 128 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.6% | 36 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.3% | 17 |
| mz.AntiGrav 1.0 | 4.7 | 10.7% | 6 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.8% | 10 |
| stelo.Randomness 1.0 | 6.2 | 8.9% | 11 |
| alpha.BlackIce 1.0 | 6.2 | 9.0% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 5.9% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.2% | 0 |
| sample.Corners 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.6 | 15 / 35 | 4370 |
| 2 | 1 | 70.9 | 94.3 | 26 / 35 | 5135 |
| 3 | 1 | 68.7 | 88.3 | 23 / 35 | 4608 |
| 4 | 1 | 69.6 | 90.2 | 23 / 35 | 5028 |
| 5 | 1 | 70.0 | 91.1 | 23 / 35 | 4977 |
| 6 | 1 | 69.0 | 88.6 | 18 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 61 | 77% |
| kano.gamma.KanoGamma 1.8 | 37 | 84% |
| Polkwane.SmashMelee 1.0 | 21 | 90% |
| mz.AntiGrav 1.0 | 16 | 94% |
| stelo.Randomness 1.0 | 13 | 77% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| alpha.BlackIce 1.0 | 2 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 38% | 64 |
| kano.gamma.KanoGamma 1.8 | 23 | 28% | 55 |
| stelo.Randomness 1.0 | 10 | 12% | 30 |
| Polkwane.SmashMelee 1.0 | 8 | 10% | 21 |
| alpha.BlackIce 1.0 | 5 | 6% | 11 |
| mz.AntiGrav 1.0 | 4 | 5% | 19 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 4 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.0 | 116 / 210 | 2.26 | 17.8% | 25507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 17.8% | 116 |
| eem.EvBotNG v12.8 | 2.0 | 15.4% | 57 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.6% | 15 |
| ary.Swarm 1.1 | 3.5 | 13.2% | 11 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.7% | 12 |
| shrub.Silver v048 | 6.0 | 9.1% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.1% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.6% | 1 |
| stelo.Mirror 1.1 | 8.8 | 4.8% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.1 | 17 / 35 | 4458 |
| 2 | 1 | 67.3 | 84.4 | 18 / 35 | 4191 |
| 3 | 1 | 66.0 | 81.9 | 15 / 35 | 4045 |
| 4 | 1 | 68.7 | 90.8 | 22 / 35 | 4128 |
| 5 | 1 | 69.7 | 90.2 | 23 / 35 | 4807 |
| 6 | 1 | 66.8 | 84.8 | 21 / 35 | 3878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 66 | 73% |
| ary.Swarm 1.1 | 29 | 83% |
| simonton.nano.MeleeSeed 1.8 | 21 | 95% |
| lessonz.robocode.Oz 0.5.0 | 20 | 90% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| shrub.Silver v048 | 2 | 50% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 30 | 31% | 76 |
| ary.Swarm 1.1 | 28 | 29% | 55 |
| lessonz.robocode.Oz 0.5.0 | 15 | 15% | 27 |
| simonton.nano.MeleeSeed 1.8 | 9 | 9% | 33 |
| shrub.Silver v048 | 5 | 5% | 7 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| stelo.Mirror 1.1 | 2 | 2% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 2 |
| zyx.nano.Ant 1.1 | 1 | 1% | 2 |
3 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.0 | 95 / 210 | 2.26 | 18.0% | 30583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 18.0% | 95 |
| wompi.Wallaby 5.1 | 2.2 | 15.4% | 53 |
| ara.Shera 0.88 | 3.2 | 14.2% | 36 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.5% | 21 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 2 |
| maribo.IotaCT 1.1 | 6.0 | 7.0% | 0 |
| dsw.StaticD 1.0 | 7.2 | 6.4% | 3 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.5% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.3 | 16 / 35 | 5090 |
| 2 | 1 | 67.5 | 85.1 | 14 / 35 | 5111 |
| 3 | 1 | 66.5 | 83.8 | 14 / 35 | 4682 |
| 4 | 1 | 67.7 | 84.8 | 17 / 35 | 5255 |
| 5 | 1 | 68.0 | 86.0 | 18 / 35 | 5081 |
| 6 | 1 | 68.6 | 87.9 | 16 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 52 | 73% |
| ara.Shera 0.88 | 47 | 62% |
| maribo.mini.MiniQuester 0.1 | 30 | 77% |
| dsw.StaticD 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 49 | 43% | 78 |
| wompi.Wallaby 5.1 | 30 | 26% | 67 |
| maribo.mini.MiniQuester 0.1 | 23 | 20% | 47 |
| amz.NanoClone 1.41 | 7 | 6% | 7 |
| dsw.StaticD 1.0 | 4 | 3% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 75.1 | 34 / 210 | 3.24 | 14.4% | 21001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 149 |
| hadur117.mini.DeiseP075 0.4 | 2.2 | 14.4% | 34 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.8% | 16 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.7% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.4% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 3 |
| jab.DiamondStealer 5 | 7.0 | 7.5% | 0 |
| mz.NanoGod 2.02 | 8.0 | 6.9% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 81.0 | 11 / 35 | 3799 |
| 2 | 2 | 61.4 | 70.8 | 2 / 35 | 3315 |
| 3 | 2 | 63.6 | 73.7 | 4 / 35 | 3608 |
| 4 | 2 | 65.6 | 80.0 | 10 / 35 | 3726 |
| 5 | 2 | 63.1 | 74.0 | 5 / 35 | 3448 |
| 6 | 3 | 61.4 | 71.4 | 2 / 35 | 3105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 74 | 19% |
| brainfade.melee.Dusk 0.44 | 15 | 73% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| dummy.micro.Sparrow 2.5 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 91 | 52% | 108 |
| wcsv.melee.EngineerMelee 0.1 | 22 | 13% | 23 |
| brainfade.melee.Dusk 0.44 | 21 | 12% | 29 |
| dummy.micro.Sparrow 2.5 | 21 | 12% | 24 |
| mz.NanoGod 2.02 | 8 | 5% | 10 |
| Krabb.akim2.Akim2 1.1b | 8 | 5% | 10 |
| jab.DiamondStealer 5 | 5 | 3% | 6 |

## Melee bench: F44

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.8 | 119 / 210 | 2.10 | 19.0% | 31182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 19.0% | 119 |
| stelo.Liblix 0.3.1 | 2.2 | 15.6% | 52 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.0% | 32 |
| wompi.Quokka 1.6 | 4.7 | 10.1% | 1 |
| jwirde.Gort 2.0 | 5.0 | 8.9% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.0% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.5% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.1% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.5% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.9 | 15 / 35 | 5169 |
| 2 | 1 | 68.2 | 85.7 | 18 / 35 | 5073 |
| 3 | 1 | 70.2 | 92.4 | 23 / 35 | 5170 |
| 4 | 1 | 67.6 | 82.5 | 17 / 35 | 4995 |
| 5 | 1 | 70.8 | 94.0 | 26 / 35 | 5381 |
| 6 | 1 | 69.8 | 90.5 | 20 / 35 | 5394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 75 | 73% |
| tzu.TheArtOfWar 1.2 | 49 | 63% |
| wompi.Quokka 1.6 | 15 | 93% |
| jwirde.Gort 2.0 | 7 | 86% |
| disan.Chair 2.2.0 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 41 | 45% | 98 |
| tzu.TheArtOfWar 1.2 | 34 | 37% | 65 |
| wompi.Quokka 1.6 | 6 | 7% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 3% | 7 |
| jwirde.Gort 2.0 | 2 | 2% | 13 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 7 |
| disan.Chair 2.2.0 | 2 | 2% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.3 | 90 / 210 | 2.06 | 20.0% | 37528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP075 0.4 | 1.0 | 20.0% | 90 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.3% | 112 |
| jje.BagPuss 1.2 | 3.7 | 11.2% | 1 |
| sul.Lunar 1.1 | 4.0 | 10.6% | 4 |
| myl.nano.Graviton 1.10 | 4.5 | 10.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.4% | 2 |
| hvilela.HVilela 0.9 | 7.2 | 8.0% | 0 |
| fm.claire 1.7 | 7.3 | 8.1% | 1 |
| wit.Deep7 2.0 | 8.8 | 6.1% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.3 | 16 / 35 | 6171 |
| 2 | 1 | 71.1 | 94.3 | 18 / 35 | 6032 |
| 3 | 1 | 69.6 | 87.9 | 17 / 35 | 6156 |
| 4 | 1 | 70.3 | 87.3 | 18 / 35 | 6409 |
| 5 | 1 | 68.5 | 83.5 | 12 / 35 | 5947 |
| 6 | 1 | 70.1 | 88.3 | 9 / 35 | 6813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 116 | 26% |
| sul.Lunar 1.1 | 15 | 100% |
| jje.BagPuss 1.2 | 13 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 100% |
| myl.nano.Graviton 1.10 | 10 | 100% |
| wit.Deep7 2.0 | 7 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 2487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 86 | 71% | 0 |
| jje.BagPuss 1.2 | 11 | 9% | 54 |
| myl.nano.Graviton 1.10 | 8 | 7% | 37 |
| fm.claire 1.7 | 6 | 5% | 19 |
| sul.Lunar 1.1 | 4 | 3% | 70 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 10 |
| hvilela.HVilela 0.9 | 2 | 2% | 7 |
| wit.Deep7 2.0 | 1 | 1% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseP075 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.8 | 67 / 210 | 2.55 | 16.4% | 25144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.0% | 63 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.5% | 72 |
| hadur117.mini.DeiseP075 0.4 | 2.5 | 16.4% | 67 |
| mz.MicroSheep 1.0 | 4.5 | 10.5% | 2 |
| cx.Princess 1.0 | 4.8 | 9.7% | 6 |
| sadoner.killer 0.2 | 6.0 | 8.7% | 0 |
| arthord.NanoSatanMelee Beta | 6.7 | 7.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.3 | 82.5 | 14 / 35 | 4191 |
| 2 | 3 | 66.5 | 83.2 | 11 / 35 | 4515 |
| 3 | 2 | 66.2 | 84.4 | 12 / 35 | 4114 |
| 4 | 2 | 65.1 | 82.2 | 11 / 35 | 3996 |
| 5 | 3 | 64.4 | 80.0 | 8 / 35 | 4036 |
| 6 | 2 | 66.4 | 84.4 | 11 / 35 | 4292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 53 | 51% |
| rsalesc.melee.Medina 0.4.5 | 47 | 43% |
| cx.Princess 1.0 | 10 | 70% |
| mz.MicroSheep 1.0 | 8 | 100% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 58 | 41% | 92 |
| rsalesc.melee.Medina 0.4.5 | 53 | 37% | 72 |
| mz.MicroSheep 1.0 | 10 | 7% | 16 |
| sadoner.killer 0.2 | 9 | 6% | 11 |
| cx.Princess 1.0 | 9 | 6% | 11 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 6 |
| kurios.DOSexe .9a | 0 | 0% | 2 |

