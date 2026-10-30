# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 86.0 | 49 / 210 | 2.26 | 16.8% | 28754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 150 |
| hadur117.mini.DeiseFAP 0.3 | 2.0 | 16.8% | 49 |
| sgp.JollyNinja 3.53 | 4.0 | 11.1% | 9 |
| mz.MicroGodMelee 1 | 4.0 | 11.1% | 2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.8% | 0 |
| lorneswork.Predator 1.0 | 5.3 | 9.9% | 1 |
| adt.Ar2 1.0 | 7.2 | 6.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.1% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 85.7 | 9 / 35 | 5070 |
| 2 | 2 | 66.8 | 86.7 | 11 / 35 | 4638 |
| 3 | 2 | 66.9 | 87.0 | 12 / 35 | 4716 |
| 4 | 2 | 65.4 | 84.1 | 3 / 35 | 4614 |
| 5 | 2 | 66.2 | 86.0 | 6 / 35 | 4796 |
| 6 | 2 | 67.0 | 86.7 | 8 / 35 | 4920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 129 | 12% |
| sgp.JollyNinja 3.53 | 14 | 79% |
| mz.MicroGodMelee 1 | 11 | 100% |
| lorneswork.Predator 1.0 | 6 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 1296. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 77% | 143 |
| sgp.JollyNinja 3.53 | 10 | 6% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 15 |
| mz.MicroGodMelee 1 | 8 | 5% | 18 |
| lorneswork.Predator 1.0 | 8 | 5% | 15 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.4 | 116 / 210 | 2.40 | 18.0% | 28091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 18.0% | 116 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.4% | 43 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.2% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.9% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.7% | 12 |
| sch.Simone 0.3d | 6.8 | 7.6% | 6 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.9% | 2 |
| Noran.BitchingElk 0.054 | 7.3 | 7.8% | 7 |
| stelo.PatternRobot 1.0 | 8.7 | 6.5% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.7 | 25 / 35 | 5049 |
| 2 | 1 | 66.7 | 83.8 | 17 / 35 | 4369 |
| 3 | 1 | 65.9 | 80.3 | 18 / 35 | 4343 |
| 4 | 1 | 65.8 | 80.3 | 15 / 35 | 4587 |
| 5 | 1 | 69.2 | 88.6 | 24 / 35 | 4926 |
| 6 | 1 | 66.7 | 81.9 | 17 / 35 | 4817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 42 | 69% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 37 | 81% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 88% |
| Noran.BitchingElk 0.054 | 15 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| sch.Simone 0.3d | 9 | 100% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 5 | 80% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 36 | 38% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 15 | 16% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 11% | 16 |
| stelo.PatternRobot 1.0 | 8 | 8% | 11 |
| Noran.BitchingElk 0.054 | 7 | 7% | 23 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 7% | 20 |
| fnc.bandit.Bandit 5.2.0 | 7 | 7% | 13 |
| sch.Simone 0.3d | 3 | 3% | 10 |
| fullsail.SweetTea 1.1 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.4 | 160 / 210 | 1.59 | 20.3% | 35560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 20.3% | 160 |
| radnor.DoctorBob 1.42 | 2.5 | 13.6% | 16 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.1% | 11 |
| vuen.Cake 2.51 | 3.3 | 12.6% | 20 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 2 |
| adt.Ar1 2.1 | 6.2 | 8.0% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.7 | 28 / 35 | 6177 |
| 2 | 1 | 71.1 | 95.2 | 27 / 35 | 6311 |
| 3 | 1 | 70.6 | 96.2 | 29 / 35 | 5533 |
| 4 | 1 | 68.5 | 87.6 | 21 / 35 | 5439 |
| 5 | 1 | 71.1 | 95.2 | 29 / 35 | 5979 |
| 6 | 1 | 70.5 | 92.7 | 26 / 35 | 6121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 68 | 84% |
| kawigi.nano.Lib 1.0 | 54 | 98% |
| radnor.DoctorBob 1.42 | 40 | 93% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 17 | 33% | 66 |
| radnor.DoctorBob 1.42 | 16 | 31% | 52 |
| kawigi.nano.Lib 1.0 | 12 | 24% | 68 |
| urdos.URDOS 1.3 | 4 | 8% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 6 |
| adt.Ar1 2.1 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.1 | 40 / 210 | 2.16 | 17.7% | 33738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 168 |
| hadur117.mini.DeiseFAP 0.3 | 2.0 | 17.7% | 40 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.1% | 1 |
| TNT.TNT 0.99.1 | 4.2 | 10.4% | 0 |
| josago.Jorgito 0.16 | 5.0 | 8.8% | 0 |
| css.Delitioner 0.11 | 6.5 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.5% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.5 | 88.3 | 10 / 35 | 5527 |
| 2 | 2 | 67.8 | 85.4 | 4 / 35 | 5701 |
| 3 | 2 | 68.3 | 86.3 | 6 / 35 | 5454 |
| 4 | 2 | 69.4 | 87.6 | 8 / 35 | 6032 |
| 5 | 2 | 67.8 | 87.3 | 5 / 35 | 5316 |
| 6 | 2 | 68.2 | 87.6 | 7 / 35 | 5708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 161 | 17% |
| apc.LeeroyJenkins2 1.0 | 4 | 100% |
| TNT.TNT 0.99.1 | 2 | 100% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| rampancy.Durandal 2.1d | 2 | 100% |
| spin.Bugstard 0.012b | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 1501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 151 | 89% | 182 |
| apc.LeeroyJenkins2 1.0 | 9 | 5% | 13 |
| TNT.TNT 0.99.1 | 4 | 2% | 6 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| josago.Jorgito 0.16 | 3 | 2% | 3 |
| css.Delitioner 0.11 | 0 | 0% | 2 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 71.0 | 19 / 210 | 3.61 | 13.0% | 18902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.7% | 109 |
| justin.DemonicRage 3.4 | 1.7 | 17.4% | 65 |
| hadur117.mini.DeiseFAP 0.3 | 3.5 | 13.0% | 19 |
| wompi.Numbat 2.1 | 3.5 | 12.7% | 11 |
| axeBots.HataMoto 3.09 | 5.3 | 9.1% | 6 |
| ms.Ares 0.19 | 5.7 | 8.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 6.2% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.6 | 77.1 | 3 / 35 | 3551 |
| 2 | 4 | 59.0 | 67.6 | 3 / 35 | 3072 |
| 3 | 4 | 59.6 | 69.2 | 2 / 35 | 3242 |
| 4 | 4 | 58.1 | 67.0 | 1 / 35 | 2864 |
| 5 | 3 | 61.5 | 73.3 | 5 / 35 | 3139 |
| 6 | 3 | 60.5 | 71.4 | 5 / 35 | 3034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 31 | 26% |
| cb.fire.Firestarter 2.0f | 30 | 13% |
| wompi.Numbat 2.1 | 9 | 67% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 71 | 37% | 76 |
| justin.DemonicRage 3.4 | 64 | 34% | 70 |
| wompi.Numbat 2.1 | 25 | 13% | 30 |
| axeBots.HataMoto 3.09 | 11 | 6% | 13 |
| ms.Ares 0.19 | 11 | 6% | 12 |
| supersample.SuperBoxBot 1.0 | 6 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.0 | 116 / 210 | 2.17 | 18.3% | 28127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 18.3% | 116 |
| jekl.StoneGhost 0.7 | 2.3 | 14.2% | 29 |
| origin.SleepSiphon 1.7b | 3.2 | 13.3% | 27 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.1% | 27 |
| mld.Wisdom 1.0 | 4.8 | 10.7% | 6 |
| gg.Wolverine 2.0 | 5.7 | 8.9% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 6.5% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.7% | 2 |
| DBall.NUKE 0.1 | 8.7 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.7 | 23 / 35 | 4828 |
| 2 | 1 | 68.1 | 87.3 | 18 / 35 | 4963 |
| 3 | 1 | 67.2 | 83.2 | 17 / 35 | 4671 |
| 4 | 1 | 67.4 | 86.0 | 19 / 35 | 4384 |
| 5 | 1 | 67.6 | 85.1 | 22 / 35 | 4349 |
| 6 | 1 | 68.4 | 88.6 | 17 / 35 | 4932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 50 | 82% |
| origin.SleepSiphon 1.7b | 49 | 80% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 59% |
| gg.Wolverine 2.0 | 7 | 86% |
| mld.Wisdom 1.0 | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 30 | 32% | 72 |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 28% | 49 |
| jekl.StoneGhost 0.7 | 25 | 27% | 57 |
| mld.Wisdom 1.0 | 10 | 11% | 16 |
| gg.Wolverine 2.0 | 2 | 2% | 6 |
| DBall.NUKE 0.1 | 1 | 1% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.9 | 127 / 210 | 1.64 | 19.9% | 34101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 19.9% | 127 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 17.0% | 51 |
| rtk.Tachikoma 1.0 | 2.5 | 16.4% | 26 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.2% | 2 |
| franzor.Lizt 1.3.1 | 5.0 | 10.0% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.4 | 20 / 35 | 5835 |
| 2 | 1 | 70.5 | 89.5 | 19 / 35 | 5722 |
| 3 | 1 | 71.8 | 94.0 | 21 / 35 | 5907 |
| 4 | 1 | 71.7 | 94.6 | 22 / 35 | 5783 |
| 5 | 1 | 71.0 | 94.3 | 22 / 35 | 5515 |
| 6 | 1 | 71.4 | 93.7 | 23 / 35 | 5339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 94 | 83% |
| rsalesc.melee.Monk 0.3.6c | 54 | 26% |
| oog.melee.CapuletDroid 1.1 | 27 | 96% |
| franzor.Lizt 1.3.1 | 8 | 75% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 1495. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 47 | 57% | 69 |
| rtk.Tachikoma 1.0 | 29 | 35% | 103 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 29 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 4 |
| franzor.Lizt 1.3.1 | 2 | 2% | 0 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.0 | 124 / 210 | 1.99 | 18.7% | 28259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 18.7% | 124 |
| tm.Yuugao 1.0 | 2.3 | 13.3% | 38 |
| shrub.Vapour v159 | 2.7 | 13.1% | 35 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.8% | 5 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 8.9% | 4 |
| m3thos.Eva00 1.1 | 6.2 | 8.2% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 7.8% | 3 |
| zyx.nano.BacillusComma 1.0 | 8.7 | 6.5% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.3% | 0 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.2 | 19 / 35 | 4902 |
| 2 | 1 | 69.4 | 92.7 | 25 / 35 | 4966 |
| 3 | 1 | 68.3 | 90.5 | 21 / 35 | 4558 |
| 4 | 1 | 67.9 | 89.8 | 22 / 35 | 4498 |
| 5 | 1 | 67.0 | 84.4 | 18 / 35 | 4591 |
| 6 | 1 | 67.6 | 87.6 | 19 / 35 | 4744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 67% |
| shrub.Vapour v159 | 48 | 65% |
| Krabb.sliNk.Garm 0.9u | 28 | 96% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| com.spp.robocode.MostlyHarmless 010 | 10 | 90% |
| SHAM.WOW 1.4 | 6 | 100% |
| m3thos.Eva00 1.1 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 31 | 36% | 69 |
| shrub.Vapour v159 | 27 | 31% | 52 |
| Krabb.sliNk.Garm 0.9u | 11 | 13% | 32 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 8% | 21 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 5% | 11 |
| SHAM.WOW 1.4 | 4 | 5% | 7 |
| m3thos.Eva00 1.1 | 2 | 2% | 12 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 3 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 76.8 | 64 / 210 | 3.09 | 15.5% | 23391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 98 |
| hadur117.mini.DeiseFAP 0.3 | 2.0 | 15.5% | 64 |
| kc.micro.Figment 1.0 | 3.0 | 13.8% | 19 |
| yagami.Tidus 0.11 | 4.5 | 10.6% | 4 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.5% | 14 |
| mc2.enemy.Original 0.9 | 5.8 | 9.0% | 8 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 4 |
| step.nanoPri 1.0 | 8.5 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 75.2 | 9 / 35 | 3729 |
| 2 | 2 | 63.9 | 76.5 | 12 / 35 | 3873 |
| 3 | 2 | 63.5 | 75.6 | 9 / 35 | 3961 |
| 4 | 2 | 65.4 | 80.3 | 12 / 35 | 3921 |
| 5 | 2 | 65.6 | 80.0 | 14 / 35 | 4352 |
| 6 | 2 | 61.8 | 73.0 | 8 / 35 | 3555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 61 | 36% |
| kc.micro.Figment 1.0 | 26 | 73% |
| pedersen.Grishnakh 1.0 | 10 | 60% |
| mc2.enemy.Original 0.9 | 10 | 70% |
| yagami.Tidus 0.11 | 8 | 100% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 65 | 44% | 88 |
| kc.micro.Figment 1.0 | 31 | 21% | 54 |
| yagami.Tidus 0.11 | 15 | 10% | 22 |
| pedersen.Grishnakh 1.0 | 10 | 7% | 12 |
| mc2.enemy.Original 0.9 | 8 | 5% | 15 |
| step.nanoPri 1.0 | 7 | 5% | 8 |
| dft.Calliope 5.6 | 6 | 4% | 7 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 95.8 | 175 / 210 | 1.38 | 20.5% | 32283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 20.5% | 175 |
| DTF.Kludgy 1.2b | 2.5 | 13.4% | 13 |
| ne.Chimera 1.2 | 2.8 | 12.9% | 5 |
| ejb.Polaris 1.0.1 | 3.7 | 11.9% | 8 |
| vStar.RAFzilla 2.15 | 5.5 | 10.4% | 5 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.8% | 2 |
| sam.Samspin 1.0 | 7.7 | 5.9% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.4% | 1 |
| donjezza.Muncho 1.0 | 8.8 | 4.8% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 96.2 | 31 / 35 | 5377 |
| 2 | 1 | 70.9 | 95.9 | 29 / 35 | 5425 |
| 3 | 1 | 71.1 | 97.8 | 30 / 35 | 5167 |
| 4 | 1 | 70.1 | 95.2 | 29 / 35 | 5049 |
| 5 | 1 | 71.0 | 95.9 | 29 / 35 | 5527 |
| 6 | 1 | 70.9 | 94.0 | 27 / 35 | 5738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 54 | 96% |
| DTF.Kludgy 1.2b | 50 | 80% |
| ne.Chimera 1.2 | 37 | 95% |
| vStar.RAFzilla 2.15 | 25 | 92% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| donjezza.Muncho 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 49% | 63 |
| ne.Chimera 1.2 | 9 | 26% | 40 |
| ejb.Polaris 1.0.1 | 3 | 9% | 55 |
| vStar.RAFzilla 2.15 | 3 | 9% | 22 |
| tvv.micro.Antares 1.1.1 | 2 | 6% | 13 |
| sam.Samspin 1.0 | 1 | 3% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 8 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.7 | 108 / 210 | 2.47 | 17.3% | 25108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.2 | 17.3% | 108 |
| rz.Aleph 0.34 | 1.8 | 15.7% | 51 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 18 |
| djc.DynaBot 0.1.1 | 4.0 | 10.7% | 14 |
| rdt199.Warlord 0.73 | 5.3 | 9.2% | 7 |
| br2.MobyDickBot 1.6 | 5.8 | 8.7% | 7 |
| uji.YellohFellah 1.0 | 6.8 | 7.9% | 6 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 79.7 | 13 / 35 | 3745 |
| 2 | 1 | 66.1 | 82.2 | 16 / 35 | 4225 |
| 3 | 1 | 69.1 | 92.1 | 24 / 35 | 4518 |
| 4 | 2 | 64.5 | 78.7 | 14 / 35 | 4103 |
| 5 | 1 | 67.7 | 86.0 | 22 / 35 | 4489 |
| 6 | 1 | 66.0 | 83.5 | 19 / 35 | 4028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 71% |
| cx.mini.Nimrod 0.55 | 23 | 91% |
| djc.DynaBot 0.1.1 | 19 | 100% |
| br2.MobyDickBot 1.6 | 12 | 75% |
| uji.YellohFellah 1.0 | 11 | 73% |
| rdt199.Warlord 0.73 | 10 | 90% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 45 | 44% | 88 |
| cx.mini.Nimrod 0.55 | 27 | 26% | 41 |
| rdt199.Warlord 0.73 | 9 | 9% | 20 |
| djc.DynaBot 0.1.1 | 6 | 6% | 20 |
| uji.YellohFellah 1.0 | 6 | 6% | 11 |
| KiraNL.Chupacabra 0.4 | 4 | 4% | 9 |
| br2.MobyDickBot 1.6 | 3 | 3% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 3 |
| stelo.MirrorNano 1.3 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.3 | 123 / 210 | 2.32 | 17.6% | 22611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 17.6% | 123 |
| nat.PallasHawk 1.0 | 2.5 | 13.9% | 32 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.5% | 29 |
| darkcanuck.Leon 1.01 | 3.5 | 12.8% | 11 |
| brainfade.melee.Genghis 0.36 | 5.2 | 9.5% | 5 |
| jrm.Test0 1.0 | 6.2 | 7.8% | 2 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.0% | 3 |
| jp.Perpy 16.0 | 8.0 | 6.6% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.6% | 3 |
| stuff.Vlad 0.1 | 9.2 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 83.5 | 16 / 35 | 3924 |
| 2 | 1 | 68.5 | 90.2 | 24 / 35 | 4063 |
| 3 | 1 | 66.8 | 86.0 | 23 / 35 | 3577 |
| 4 | 1 | 67.9 | 87.6 | 22 / 35 | 3937 |
| 5 | 1 | 67.3 | 87.9 | 22 / 35 | 3696 |
| 6 | 1 | 63.4 | 76.8 | 16 / 35 | 3414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 55 | 76% |
| bts.wiki.RipCurl 0.9b | 50 | 80% |
| darkcanuck.Leon 1.01 | 38 | 87% |
| brainfade.melee.Genghis 0.36 | 9 | 78% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 0% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 27 | 31% | 51 |
| nat.PallasHawk 1.0 | 18 | 20% | 59 |
| darkcanuck.Leon 1.01 | 16 | 18% | 59 |
| jrm.Test0 1.0 | 8 | 9% | 8 |
| brainfade.melee.Genghis 0.36 | 7 | 8% | 14 |
| jp.Perpy 16.0 | 3 | 3% | 6 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 4 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 83.1 | 70 / 210 | 2.52 | 16.0% | 23990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.1% | 88 |
| ags.Glacier 0.2.11 | 2.0 | 16.3% | 35 |
| hadur117.mini.DeiseFAP 0.3 | 2.5 | 16.0% | 70 |
| shinh.Entangled 0.3 | 4.5 | 11.6% | 11 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.3% | 8 |
| stelo.Wang 1.0 | 6.5 | 7.5% | 0 |
| apc.Colossus2 0.17 | 6.5 | 7.4% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.5 | 82.5 | 12 / 35 | 4203 |
| 2 | 3 | 63.9 | 79.0 | 11 / 35 | 3627 |
| 3 | 2 | 65.6 | 84.8 | 12 / 35 | 3959 |
| 4 | 2 | 65.9 | 84.1 | 13 / 35 | 4023 |
| 5 | 2 | 65.4 | 85.1 | 8 / 35 | 4073 |
| 6 | 3 | 66.0 | 83.2 | 14 / 35 | 4105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 70 | 41% |
| ags.Glacier 0.2.11 | 49 | 57% |
| shinh.Entangled 0.3 | 7 | 71% |
| gh.micro.Gruweltje 0.7 | 5 | 80% |
| stelo.Wang 1.0 | 3 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 59 | 42% | 88 |
| ags.Glacier 0.2.11 | 39 | 27% | 68 |
| shinh.Entangled 0.3 | 22 | 15% | 27 |
| gh.micro.Gruweltje 0.7 | 12 | 8% | 15 |
| stelo.Wang 1.0 | 4 | 3% | 5 |
| apc.Colossus2 0.17 | 2 | 1% | 4 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.6 | 156 / 210 | 1.58 | 20.2% | 32434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 20.2% | 156 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 20 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.8% | 25 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 9.4% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.3% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.1% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.8 | 8.5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.8% | 5 |
| pa.Improved 1.0 | 9.0 | 5.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.1 | 26 / 35 | 5242 |
| 2 | 1 | 71.8 | 97.8 | 29 / 35 | 5795 |
| 3 | 1 | 70.9 | 94.0 | 25 / 35 | 5263 |
| 4 | 1 | 71.0 | 93.3 | 26 / 35 | 5786 |
| 5 | 1 | 70.3 | 94.6 | 26 / 35 | 5114 |
| 6 | 1 | 69.4 | 89.8 | 24 / 35 | 5234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 85 | 88% |
| catcat20.shape.Theta 0.018 | 56 | 79% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 82% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 85% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 24 | 44% | 96 |
| catcat20.shape.Theta 0.018 | 15 | 28% | 54 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 11% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 7% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 6% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 3 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.6 | 99 / 210 | 2.57 | 17.6% | 29372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 17.6% | 99 |
| emp.Yngwie 1.11 | 2.7 | 13.9% | 53 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.5% | 21 |
| mld.DustBunny 3.8 | 3.8 | 12.3% | 12 |
| cb.nano.Insomnia 1.0 | 4.5 | 11.1% | 7 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.8% | 17 |
| lambdaxy.TBot 0.1 | 7.3 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.0% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.7% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.6 | 20 / 35 | 5205 |
| 2 | 1 | 64.0 | 74.9 | 11 / 35 | 4373 |
| 3 | 1 | 67.1 | 82.5 | 17 / 35 | 4942 |
| 4 | 1 | 67.0 | 84.1 | 16 / 35 | 4884 |
| 5 | 1 | 65.8 | 78.4 | 13 / 35 | 4916 |
| 6 | 1 | 68.9 | 87.9 | 22 / 35 | 5052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 47 | 62% |
| kawigi.micro.Shiz 1.1 | 20 | 90% |
| cb.nano.Insomnia 1.0 | 19 | 84% |
| kawigi.robot.Girl 1.2 | 19 | 84% |
| mld.DustBunny 3.8 | 19 | 89% |
| divineomega.TrialBot 0.003 | 3 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 32% | 81 |
| kawigi.micro.Shiz 1.1 | 22 | 19% | 44 |
| cb.nano.Insomnia 1.0 | 17 | 15% | 19 |
| mld.DustBunny 3.8 | 15 | 13% | 33 |
| kawigi.robot.Girl 1.2 | 10 | 9% | 18 |
| divineomega.TrialBot 0.003 | 8 | 7% | 10 |
| lambdaxy.TBot 0.1 | 2 | 2% | 4 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.5 | 109 / 210 | 2.13 | 19.0% | 32875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 19.0% | 109 |
| gh.Griezel 0.5.2 | 2.0 | 16.8% | 63 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.3% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.2% | 21 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.1% | 0 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.5% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.5% | 2 |
| asd.Cthulhu 1.3 | 8.7 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.2% | 1 |
| repositorio.NanoStep 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.3 | 18 / 35 | 5507 |
| 2 | 1 | 68.6 | 85.7 | 15 / 35 | 5394 |
| 3 | 1 | 69.0 | 87.3 | 18 / 35 | 5268 |
| 4 | 1 | 69.7 | 90.5 | 22 / 35 | 5371 |
| 5 | 1 | 68.3 | 81.3 | 16 / 35 | 5644 |
| 6 | 1 | 70.6 | 92.7 | 20 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 85 | 60% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 83% |
| techdude.forest.FlamingForest 1.1 | 20 | 55% |
| bvh.fnr.Fenrir 0.36l | 10 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1237. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 54 | 53% | 111 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 17% | 35 |
| techdude.forest.FlamingForest 1.1 | 13 | 13% | 25 |
| bvh.fnr.Fenrir 0.36l | 6 | 6% | 10 |
| stelo.IntrinsicVolatility 1.4 | 5 | 5% | 9 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 9 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 8 |
| asd.Cthulhu 1.3 | 2 | 2% | 3 |

## Melee bench: F17

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.4 | 95 / 210 | 2.50 | 17.7% | 30291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 17.7% | 95 |
| et.Predator 1.8 | 2.5 | 13.4% | 24 |
| cx.BlestPain 1.41 | 3.5 | 12.5% | 38 |
| oog.melee.Mercutio 1.0 | 4.0 | 12.2% | 30 |
| nic.Nicator 2.4 | 4.2 | 12.0% | 16 |
| ahf.NanoAndrew .4 | 6.0 | 9.9% | 5 |
| maribo.melee.BMV 0.1 | 6.8 | 8.9% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.1% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 22 / 35 | 5120 |
| 2 | 1 | 67.2 | 83.5 | 15 / 35 | 5014 |
| 3 | 1 | 67.5 | 84.8 | 16 / 35 | 4941 |
| 4 | 1 | 67.4 | 82.2 | 16 / 35 | 5162 |
| 5 | 1 | 67.1 | 84.8 | 15 / 35 | 4962 |
| 6 | 1 | 65.5 | 76.5 | 11 / 35 | 5092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 41 | 80% |
| oog.melee.Mercutio 1.0 | 33 | 67% |
| nic.Nicator 2.4 | 26 | 88% |
| cx.BlestPain 1.41 | 24 | 33% |
| ahf.NanoAndrew .4 | 9 | 78% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1025. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 30% | 48 |
| et.Predator 1.8 | 23 | 20% | 52 |
| oog.melee.Mercutio 1.0 | 21 | 18% | 42 |
| nic.Nicator 2.4 | 19 | 17% | 40 |
| ahf.NanoAndrew .4 | 11 | 10% | 16 |
| maribo.melee.BMV 0.1 | 4 | 3% | 4 |
| tex.Longbot 0.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.3 | 128 / 210 | 2.05 | 18.5% | 26449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 18.5% | 128 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.0% | 28 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.0% | 24 |
| uji.DBH 1.1 | 4.3 | 10.8% | 10 |
| ratosh.Nobo 0.21 | 4.8 | 10.2% | 3 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.4% | 3 |
| sigterm.Sigterm 1.0 | 7.0 | 7.8% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.3% | 4 |
| stelo.WangRobot 1.0 | 9.3 | 5.7% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 89.2 | 20 / 35 | 4615 |
| 2 | 1 | 68.4 | 90.2 | 24 / 35 | 4402 |
| 3 | 1 | 67.8 | 87.9 | 21 / 35 | 4534 |
| 4 | 1 | 68.0 | 87.6 | 22 / 35 | 4673 |
| 5 | 1 | 66.5 | 85.4 | 20 / 35 | 3995 |
| 6 | 1 | 67.6 | 89.5 | 21 / 35 | 4230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 44 | 80% |
| agd.Mooserwirt2 2.7 | 35 | 63% |
| uji.DBH 1.1 | 21 | 90% |
| sigterm.Sigterm 1.0 | 20 | 90% |
| spinnercat.Robovirus 2.718 | 16 | 88% |
| ratosh.Nobo 0.21 | 12 | 92% |
| stelo.WangRobot 1.0 | 7 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 32% | 69 |
| agd.Mooserwirt2 2.7 | 17 | 20% | 46 |
| uji.DBH 1.1 | 8 | 10% | 21 |
| spinnercat.Robovirus 2.718 | 8 | 10% | 14 |
| ratosh.Nobo 0.21 | 7 | 8% | 21 |
| sigterm.Sigterm 1.0 | 5 | 6% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 6% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 12 |
| stelo.WangRobot 1.0 | 3 | 4% | 7 |

## Melee bench: F19

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.6 | 169 / 210 | 1.49 | 20.8% | 33377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 20.8% | 169 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.1% | 16 |
| mld.Infinity 2.2 | 3.0 | 13.8% | 19 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.5% | 5 |
| erdnis.Rover 0.3 | 4.8 | 10.5% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.1% | 1 |
| pac.ABC 2.1 | 7.3 | 7.0% | 0 |
| mbh.Mbh 0.1 | 7.5 | 6.8% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 97.1 | 32 / 35 | 5568 |
| 2 | 1 | 71.8 | 95.6 | 28 / 35 | 5357 |
| 3 | 1 | 72.3 | 96.5 | 31 / 35 | 5296 |
| 4 | 1 | 71.4 | 92.7 | 29 / 35 | 5742 |
| 5 | 1 | 71.3 | 91.1 | 23 / 35 | 6058 |
| 6 | 1 | 71.6 | 94.6 | 26 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 95 | 95% |
| mld.Infinity 2.2 | 55 | 85% |
| krillr.mini.JointStrike 2.0.0 | 14 | 93% |
| erdnis.Rover 0.3 | 7 | 100% |
| pac.ABC 2.1 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 1118. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 21 | 51% | 117 |
| mld.Infinity 2.2 | 10 | 24% | 21 |
| krillr.mini.JointStrike 2.0.0 | 6 | 15% | 34 |
| patson.PatsonTestBot 1.0 | 2 | 5% | 9 |
| erdnis.Rover 0.3 | 2 | 5% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 6 |
| mbh.Mbh 0.1 | 0 | 0% | 4 |

## Melee bench: F20

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.7 | 132 / 210 | 1.75 | 20.0% | 33379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 20.0% | 132 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 36 |
| fwb.Nine 1.0.1 | 3.5 | 11.4% | 20 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.6% | 7 |
| catcat20.Rabbit 0.001 | 4.8 | 9.7% | 14 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.9% | 0 |
| bayen.nut.Squirrel 1.615 | 6.5 | 7.5% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.7 | 7.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 6.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.3 | 19 / 35 | 5185 |
| 2 | 1 | 70.4 | 94.3 | 24 / 35 | 5149 |
| 3 | 1 | 70.9 | 93.0 | 21 / 35 | 6012 |
| 4 | 1 | 70.7 | 93.0 | 23 / 35 | 5716 |
| 5 | 1 | 70.3 | 91.7 | 23 / 35 | 5812 |
| 6 | 1 | 69.8 | 91.7 | 22 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 79% |
| fwb.Nine 1.0.1 | 46 | 74% |
| nz.jdc.nano.GridFu 1.0 | 15 | 67% |
| catcat20.Rabbit 0.001 | 13 | 54% |
| bayen.nut.Squirrel 1.615 | 8 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1323. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 46% | 90 |
| fwb.Nine 1.0.1 | 19 | 24% | 23 |
| catcat20.Rabbit 0.001 | 10 | 13% | 30 |
| nz.jdc.nano.GridFu 1.0 | 8 | 10% | 34 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 17 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 4 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 3 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 93.1 | 144 / 210 | 1.62 | 20.2% | 32595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 20.2% | 144 |
| eem.EvBot v4.6.16 | 2.0 | 16.0% | 51 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.6% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 6 |
| eld.Hmm 1.0 | 5.2 | 8.3% | 4 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.8% | 1 |
| fire219.CatBot 1.0 | 7.0 | 6.6% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 98.4 | 30 / 35 | 6169 |
| 2 | 1 | 69.8 | 89.5 | 22 / 35 | 5311 |
| 3 | 1 | 69.6 | 92.7 | 19 / 35 | 5154 |
| 4 | 1 | 69.8 | 91.4 | 22 / 35 | 5087 |
| 5 | 1 | 72.0 | 97.1 | 29 / 35 | 5605 |
| 6 | 1 | 69.6 | 89.2 | 22 / 35 | 5269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 113 | 75% |
| dummy.mini.Scimitar 1.01 | 29 | 90% |
| cf.RiO.RiOx 4.2.1 | 22 | 86% |
| eld.Hmm 1.0 | 9 | 78% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 1267. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 34 | 50% | 101 |
| dummy.mini.Scimitar 1.01 | 17 | 25% | 58 |
| cf.RiO.RiOx 4.2.1 | 10 | 15% | 25 |
| eld.Hmm 1.0 | 4 | 6% | 15 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 8 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.2 | 98 / 210 | 2.06 | 18.3% | 29596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.2 | 18.3% | 98 |
| pe.SandboxDT 2.71m | 1.8 | 16.8% | 65 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.7% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 14 |
| bigpete.Stewie 1.0 | 5.0 | 10.0% | 6 |
| yk.JahRoslav 1.1 | 6.5 | 6.7% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.4% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.4% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.7% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.5 | 20 / 35 | 5428 |
| 2 | 1 | 69.6 | 91.1 | 22 / 35 | 4752 |
| 3 | 1 | 69.3 | 91.4 | 17 / 35 | 4880 |
| 4 | 1 | 68.3 | 86.3 | 16 / 35 | 4996 |
| 5 | 1 | 68.1 | 86.3 | 14 / 35 | 4980 |
| 6 | 2 | 66.4 | 83.5 | 9 / 35 | 4560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 58 | 48% |
| kvk.HebusLeTroll 0.35 | 41 | 76% |
| jlm.javaDisturbance 0.59 | 34 | 94% |
| bigpete.Stewie 1.0 | 9 | 78% |

Hadur died in 112 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 53 | 47% | 89 |
| kvk.HebusLeTroll 0.35 | 34 | 30% | 56 |
| jlm.javaDisturbance 0.59 | 16 | 14% | 43 |
| bigpete.Stewie 1.0 | 5 | 4% | 10 |
| tad.Dalek98 0.98 | 3 | 3% | 3 |
| gg.Squaraus 0.6 | 1 | 1% | 3 |
| yk.JahRoslav 1.1 | 0 | 0% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.9 | 145 / 210 | 1.73 | 19.8% | 29888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.2 | 19.8% | 145 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 39 |
| cre.Karolos 0.32 | 2.8 | 14.0% | 17 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.4% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.0 | 9.4% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.7% | 2 |
| cw.megas.Blade 0.8 | 7.3 | 8.1% | 0 |
| sample.Walls 1.0 | 7.5 | 7.8% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 96.2 | 26 / 35 | 5416 |
| 2 | 1 | 70.5 | 91.4 | 24 / 35 | 4779 |
| 3 | 1 | 71.4 | 92.7 | 25 / 35 | 5550 |
| 4 | 1 | 71.3 | 94.6 | 26 / 35 | 5124 |
| 5 | 1 | 70.4 | 92.4 | 24 / 35 | 4790 |
| 6 | 2 | 68.0 | 83.8 | 20 / 35 | 4229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 90 | 84% |
| cre.Karolos 0.32 | 36 | 83% |
| stelo.AreaTargetingBot 1.1 | 18 | 94% |
| stelo.RamTrackSurfer 1.2 | 9 | 89% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 36 | 55% | 109 |
| cre.Karolos 0.32 | 18 | 28% | 53 |
| stelo.AreaTargetingBot 1.1 | 6 | 9% | 15 |
| stelo.RamTrackSurfer 1.2 | 3 | 5% | 13 |
| sample.Walls 1.0 | 2 | 3% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 10 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |

## Melee bench: F24

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 77.0 | 72 / 210 | 3.07 | 15.4% | 22098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.2 | 15.4% | 72 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.1% | 32 |
| florent.XSeries.X2 0.12 | 3.0 | 13.3% | 36 |
| davidalves.Phoenix 0.54 | 4.0 | 12.7% | 39 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.9% | 17 |
| oog.melee.Corsair 1.0 | 6.2 | 9.6% | 10 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.4% | 4 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.9% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 0 |
| evd.X1 0.01 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 71.7 | 11 / 35 | 3675 |
| 2 | 1 | 65.3 | 81.3 | 14 / 35 | 3993 |
| 3 | 1 | 62.9 | 76.2 | 9 / 35 | 3444 |
| 4 | 1 | 65.3 | 82.5 | 16 / 35 | 3733 |
| 5 | 1 | 63.8 | 76.5 | 14 / 35 | 3529 |
| 6 | 2 | 62.5 | 74.0 | 8 / 35 | 3724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 63% |
| florent.XSeries.X2 0.12 | 22 | 68% |
| pedersen.Ugluk 1.1.1 | 21 | 86% |
| davidalves.Phoenix 0.54 | 18 | 33% |
| stelo.SoJNanoMelee 1.1 | 11 | 91% |
| oog.melee.Corsair 1.0 | 6 | 67% |

Hadur died in 138 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 36 | 26% | 49 |
| florent.XSeries.X2 0.12 | 35 | 25% | 45 |
| rz.GlowBlowMelee 1.4 | 29 | 21% | 47 |
| pedersen.Ugluk 1.1.1 | 21 | 15% | 37 |
| oog.melee.Corsair 1.0 | 10 | 7% | 20 |
| stelo.SoJNanoMelee 1.1 | 5 | 4% | 8 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 2 |
| evd.X1 0.01 | 1 | 1% | 1 |

## Melee bench: F25

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.9 | 143 / 210 | 2.00 | 19.0% | 25514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 19.0% | 143 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 13.8% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.9% | 13 |
| jdw.Hurricane 1.4 | 4.0 | 10.9% | 16 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 8.9% | 4 |
| ds.Oo 2.2 | 6.0 | 8.9% | 5 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.2% | 1 |
| awesomeness.Elite 1.0 | 7.8 | 7.4% | 2 |
| adt.Ar2 1.1 | 8.3 | 6.7% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 92.1 | 25 / 35 | 4067 |
| 2 | 1 | 69.0 | 89.2 | 23 / 35 | 4651 |
| 3 | 1 | 68.6 | 89.8 | 22 / 35 | 4091 |
| 4 | 1 | 68.5 | 87.9 | 25 / 35 | 4026 |
| 5 | 1 | 69.2 | 89.8 | 26 / 35 | 4575 |
| 6 | 1 | 67.5 | 84.8 | 22 / 35 | 4104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 59 | 85% |
| voidious.micro.BlitzBat 1.05 | 48 | 96% |
| jdw.Hurricane 1.4 | 24 | 83% |
| ds.Oo 2.2 | 9 | 89% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| adt.Ar2 1.1 | 6 | 83% |
| gre.svman4.Morfeas 1.4.1 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 75% |

Hadur died in 67 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 19 | 28% | 66 |
| voidious.micro.BlitzBat 1.05 | 18 | 27% | 55 |
| jdw.Hurricane 1.4 | 13 | 19% | 35 |
| gre.svman4.Morfeas 1.4.1 | 5 | 7% | 13 |
| ds.Oo 2.2 | 4 | 6% | 12 |
| awesomeness.Elite 1.0 | 4 | 6% | 11 |
| adt.Ar2 1.1 | 4 | 6% | 8 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 8 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |

## Melee bench: F26

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.7 | 142 / 210 | 1.83 | 19.5% | 33158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 19.5% | 142 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 29 |
| shu.nitro.LENIN .T34 | 3.2 | 12.0% | 24 |
| lrem.Spectre 0.4.4 | 4.0 | 11.6% | 6 |
| js.PinBall 1.6 | 5.2 | 10.7% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.7% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.3 | 22 / 35 | 5446 |
| 2 | 1 | 71.4 | 95.2 | 29 / 35 | 5760 |
| 3 | 1 | 69.8 | 90.2 | 22 / 35 | 5525 |
| 4 | 1 | 71.0 | 93.3 | 24 / 35 | 5809 |
| 5 | 1 | 69.3 | 90.2 | 21 / 35 | 5502 |
| 6 | 1 | 68.8 | 87.3 | 24 / 35 | 5116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 58 | 83% |
| shu.nitro.LENIN .T34 | 43 | 79% |
| lrem.Spectre 0.4.4 | 31 | 97% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 80% |
| js.PinBall 1.6 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 100% |
| gh.mini.GrubbmOne 1.0 | 7 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 22 | 32% | 70 |
| shu.nitro.LENIN .T34 | 22 | 32% | 58 |
| js.PinBall 1.6 | 10 | 15% | 21 |
| lrem.Spectre 0.4.4 | 7 | 10% | 26 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 7% | 16 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 10 |

## Melee bench: F27

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.2 | 142 / 210 | 1.79 | 19.2% | 27098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 19.2% | 142 |
| mk.Alpha 0.2.1 | 2.0 | 14.4% | 37 |
| EH.Eagle 1.0.6 | 3.7 | 11.1% | 5 |
| wee.Gem 1.8.4 | 4.2 | 10.8% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 10.1% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 8.9% | 1 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.8% | 1 |
| joe.ADinosaur 1.0 | 7.5 | 7.2% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 5.9% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.4 | 25 / 35 | 4503 |
| 2 | 1 | 68.3 | 91.1 | 22 / 35 | 4354 |
| 3 | 1 | 68.5 | 91.1 | 21 / 35 | 4502 |
| 4 | 1 | 70.8 | 92.4 | 27 / 35 | 5393 |
| 5 | 1 | 67.8 | 91.7 | 22 / 35 | 3955 |
| 6 | 1 | 68.6 | 89.5 | 25 / 35 | 4391 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 85 | 78% |
| EH.Eagle 1.0.6 | 30 | 100% |
| wee.Gem 1.8.4 | 28 | 71% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 85% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 30 | 44% | 93 |
| wee.Gem 1.8.4 | 16 | 24% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 12% | 25 |
| throxbot.ThroxBot 0.1 | 5 | 7% | 10 |
| EH.Eagle 1.0.6 | 4 | 6% | 29 |
| joe.ADinosaur 1.0 | 3 | 4% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 6 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.5 | 137 / 210 | 1.85 | 18.9% | 26139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 18.9% | 137 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 37 |
| uji.Antique 1.0 | 3.3 | 11.4% | 18 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 11.1% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.8% | 3 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.2% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.7% | 4 |
| stelo.PianistNano 1.2 | 8.7 | 6.3% | 1 |
| matt.advanced.Katana 1.0 | 9.0 | 5.9% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 87.6 | 19 / 35 | 3977 |
| 2 | 1 | 67.2 | 84.1 | 22 / 35 | 4386 |
| 3 | 1 | 69.6 | 94.6 | 25 / 35 | 4528 |
| 4 | 1 | 69.3 | 93.0 | 23 / 35 | 4431 |
| 5 | 1 | 69.8 | 94.3 | 26 / 35 | 4446 |
| 6 | 1 | 68.3 | 89.5 | 22 / 35 | 4371 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 90 | 73% |
| uji.Antique 1.0 | 44 | 86% |
| qohnil.blot.BlotBot 3.61 | 19 | 79% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 75% |
| stelo.PianistNano 1.2 | 2 | 50% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 34 | 47% | 97 |
| uji.Antique 1.0 | 11 | 15% | 40 |
| pfvicm.Sobieski 7.2.3b | 10 | 14% | 16 |
| qohnil.blot.BlotBot 3.61 | 7 | 10% | 26 |
| amk.ChumbaWumba 0.3 | 6 | 8% | 10 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 11 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.7 | 103 / 210 | 2.64 | 17.7% | 27669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 17.7% | 103 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.4% | 51 |
| deewiant.Anomaly 0.2 | 2.8 | 14.9% | 35 |
| myl.micro.Troodon 1.10 | 4.2 | 11.6% | 9 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 7 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 6.8% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.0 | 5.0% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 79.7 | 14 / 35 | 4827 |
| 2 | 1 | 66.7 | 80.3 | 17 / 35 | 4432 |
| 3 | 1 | 66.0 | 78.4 | 15 / 35 | 4309 |
| 4 | 1 | 67.1 | 80.6 | 18 / 35 | 4630 |
| 5 | 1 | 69.9 | 89.5 | 22 / 35 | 4976 |
| 6 | 1 | 67.1 | 81.9 | 17 / 35 | 4495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 53 | 77% |
| deewiant.Anomaly 0.2 | 48 | 75% |
| myl.micro.Troodon 1.10 | 12 | 100% |
| jok.PheonixM 0.1.2 | 8 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 38 | 35% | 75 |
| zyx.mega.YersiniaPestis 3.1 | 31 | 29% | 67 |
| myl.micro.Troodon 1.10 | 19 | 18% | 31 |
| jok.PheonixM 0.1.2 | 13 | 12% | 22 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 74.6 | 69 / 210 | 3.29 | 14.8% | 21643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.7 | 14.8% | 69 |
| catcat20.Matcha 0.006 | 2.3 | 14.0% | 50 |
| oog.melee.Capulet 1.2 | 3.5 | 13.0% | 27 |
| stelo.PastFuture 2.3.2 | 3.5 | 13.0% | 27 |
| darkcanuck.B26354 1.06 | 4.0 | 13.0% | 31 |
| ntc.Opposite 1.5 | 7.0 | 7.9% | 0 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.8% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.7% | 3 |
| tripphippy.Alice 1.1 | 8.8 | 6.6% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 78.7 | 11 / 35 | 3611 |
| 2 | 2 | 62.8 | 73.7 | 14 / 35 | 3427 |
| 3 | 2 | 61.1 | 69.8 | 8 / 35 | 3696 |
| 4 | 3 | 60.3 | 68.6 | 7 / 35 | 3422 |
| 5 | 1 | 65.2 | 81.6 | 16 / 35 | 3876 |
| 6 | 1 | 63.0 | 75.2 | 13 / 35 | 3611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 74% |
| darkcanuck.B26354 1.06 | 20 | 60% |
| oog.melee.Capulet 1.2 | 18 | 83% |
| stelo.PastFuture 2.3.2 | 13 | 77% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 100% |
| intruder.PrairieWolf 2.61 | 4 | 75% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 39 | 27% | 51 |
| catcat20.Matcha 0.006 | 34 | 24% | 55 |
| darkcanuck.B26354 1.06 | 21 | 15% | 36 |
| oog.melee.Capulet 1.2 | 20 | 14% | 34 |
| tripphippy.Alice 1.1 | 11 | 8% | 13 |
| intruder.PrairieWolf 2.61 | 8 | 6% | 10 |
| ntc.Opposite 1.5 | 5 | 4% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 5 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 74.5 | 57 / 210 | 3.30 | 14.7% | 20855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.9% | 90 |
| hadur117.mini.DeiseFAP 0.3 | 2.2 | 14.7% | 57 |
| gh.mini.Griezel 0.2 | 2.8 | 13.9% | 43 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.1% | 7 |
| d414.nano.Quantum 1.0.0 | 4.7 | 10.5% | 4 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.1% | 6 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.9% | 3 |
| fm.mammillarias 1.3 | 8.0 | 6.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 78.4 | 12 / 35 | 3667 |
| 2 | 2 | 64.8 | 80.6 | 15 / 35 | 3323 |
| 3 | 3 | 60.5 | 69.5 | 6 / 35 | 3312 |
| 4 | 2 | 61.8 | 71.4 | 9 / 35 | 3505 |
| 5 | 2 | 62.0 | 73.0 | 8 / 35 | 3520 |
| 6 | 2 | 62.0 | 74.0 | 7 / 35 | 3528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 47 | 57% |
| gh.mini.Griezel 0.2 | 31 | 35% |
| spinnercat.micro.Tyger 0.1 | 8 | 100% |
| d414.nano.Quantum 1.0.0 | 5 | 80% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 53 | 34% | 67 |
| abc.Shadow 3.84i | 47 | 31% | 68 |
| spinnercat.micro.Tyger 0.1 | 19 | 12% | 28 |
| d414.nano.Quantum 1.0.0 | 15 | 10% | 23 |
| gh.nano.Grofvuil 0.2 | 9 | 6% | 13 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.1 | 145 / 210 | 1.80 | 19.3% | 28684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 19.3% | 145 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 38 |
| apc.botM 3.0 | 3.0 | 11.6% | 11 |
| lxx.ConceptA 0.8 | 4.0 | 10.8% | 5 |
| vjik.UnViolation 1.1 | 5.3 | 9.3% | 4 |
| bayen.UbaMicro 1.4 | 5.7 | 9.3% | 4 |
| panzer.Panzer 0.2 | 7.2 | 7.3% | 0 |
| yk.JahMicro 1.0 | 8.5 | 6.5% | 1 |
| conscience.Electron 1.3g | 8.7 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 92.7 | 24 / 35 | 4543 |
| 2 | 1 | 67.0 | 85.7 | 20 / 35 | 4528 |
| 3 | 1 | 69.8 | 93.3 | 27 / 35 | 4979 |
| 4 | 1 | 70.1 | 94.9 | 26 / 35 | 4869 |
| 5 | 1 | 69.5 | 92.1 | 24 / 35 | 4981 |
| 6 | 1 | 68.3 | 87.9 | 24 / 35 | 4784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 87 | 75% |
| apc.botM 3.0 | 25 | 84% |
| lxx.ConceptA 0.8 | 24 | 96% |
| bayen.UbaMicro 1.4 | 11 | 82% |
| vjik.UnViolation 1.1 | 11 | 100% |
| donjezza.Jezza 1.0 | 8 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 30 | 45% | 95 |
| lxx.ConceptA 0.8 | 14 | 21% | 26 |
| apc.botM 3.0 | 10 | 15% | 34 |
| bayen.UbaMicro 1.4 | 4 | 6% | 9 |
| yk.JahMicro 1.0 | 3 | 5% | 7 |
| vjik.UnViolation 1.1 | 2 | 3% | 22 |
| panzer.Panzer 0.2 | 1 | 2% | 6 |
| donjezza.Jezza 1.0 | 1 | 2% | 6 |
| conscience.Electron 1.3g | 1 | 2% | 2 |

## Melee bench: F33

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.7 | 138 / 210 | 2.01 | 19.4% | 30251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 19.4% | 138 |
| maribo.Quester 0.3 | 2.0 | 15.1% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.5% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.2% | 8 |
| labg.Cataclysm 2.05 | 4.7 | 10.9% | 14 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.5% | 3 |
| baal.nano.N 1.42 | 6.7 | 8.3% | 1 |
| zyx.micro.Ant 1.1 | 8.0 | 5.9% | 0 |
| sanja.First 0.1 | 9.5 | 4.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.7 | 21 / 35 | 5181 |
| 2 | 1 | 70.4 | 90.2 | 25 / 35 | 5138 |
| 3 | 1 | 70.7 | 93.0 | 25 / 35 | 5117 |
| 4 | 1 | 69.8 | 89.5 | 25 / 35 | 5065 |
| 5 | 1 | 69.6 | 87.9 | 22 / 35 | 5228 |
| 6 | 1 | 68.1 | 86.0 | 20 / 35 | 4522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 50 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 84% |
| gre.svman4.Leonidas 1.3.2 | 33 | 97% |
| labg.Cataclysm 2.05 | 18 | 83% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 100% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 25 | 34% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 18% | 49 |
| labg.Cataclysm 2.05 | 11 | 15% | 28 |
| gre.svman4.Leonidas 1.3.2 | 8 | 11% | 28 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 8% | 14 |
| zyx.micro.Ant 1.1 | 5 | 7% | 6 |
| baal.nano.N 1.42 | 3 | 4% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 3% | 2 |
| sanja.First 0.1 | 0 | 0% | 3 |

## Melee bench: F34

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.1 | 86 / 210 | 2.34 | 17.3% | 27541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.0% | 68 |
| hadur117.mini.DeiseFAP 0.3 | 1.7 | 17.3% | 86 |
| kid.Gladiator .7.2 | 2.8 | 15.8% | 38 |
| tcf.Reach 3 | 4.5 | 11.2% | 4 |
| jcs.Seth 1.8 | 4.7 | 11.2% | 12 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.3 | 84.8 | 15 / 35 | 4202 |
| 2 | 1 | 67.5 | 86.0 | 13 / 35 | 4662 |
| 3 | 2 | 66.0 | 81.3 | 14 / 35 | 4086 |
| 4 | 1 | 69.6 | 89.5 | 18 / 35 | 4886 |
| 5 | 1 | 68.1 | 86.3 | 15 / 35 | 4988 |
| 6 | 2 | 67.1 | 82.9 | 11 / 35 | 4717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 74 | 58% |
| kid.Gladiator .7.2 | 46 | 54% |
| jcs.Seth 1.8 | 14 | 79% |
| tcf.Reach 3 | 4 | 75% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 1072. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 52 | 42% | 90 |
| kid.Gladiator .7.2 | 46 | 37% | 64 |
| jcs.Seth 1.8 | 11 | 9% | 26 |
| tcf.Reach 3 | 6 | 5% | 16 |
| ratosh.Wesco 1.4 | 5 | 4% | 6 |
| cli.Dancer 1.1 | 3 | 2% | 6 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 83.2 | 53 / 210 | 2.51 | 15.8% | 20891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.2% | 133 |
| hadur117.mini.DeiseFAP 0.3 | 2.0 | 15.8% | 53 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.1% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.6% | 5 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 1 |
| wit.Chuliath 1.0 | 6.5 | 7.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 82.2 | 12 / 35 | 3714 |
| 2 | 2 | 65.1 | 85.4 | 8 / 35 | 3589 |
| 3 | 2 | 63.1 | 80.3 | 5 / 35 | 3206 |
| 4 | 2 | 65.0 | 86.3 | 10 / 35 | 3316 |
| 5 | 2 | 64.5 | 81.3 | 8 / 35 | 3734 |
| 6 | 2 | 64.8 | 83.8 | 10 / 35 | 3332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 91 | 21% |
| gh.mini.Gruwel 0.9 | 15 | 47% |
| rz.HawkOnFire 0.1 | 13 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 90% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| dans.Cinnamon 1.2 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 94 | 60% | 104 |
| gh.mini.Gruwel 0.9 | 26 | 17% | 39 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 10% | 23 |
| rz.HawkOnFire 0.1 | 13 | 8% | 29 |
| wit.Chuliath 1.0 | 4 | 3% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 4 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.2 | 175 / 210 | 1.61 | 20.8% | 31635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 20.8% | 175 |
| bzdp.Pansy 2.1 | 2.8 | 11.7% | 7 |
| alpha.RainingFire 1.0 | 3.3 | 11.5% | 10 |
| bvh.micro.Freya 0.3 | 4.0 | 10.8% | 7 |
| mz.Cork 0.1 | 5.0 | 10.2% | 7 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.8% | 1 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.7% | 1 |
| dl.BetterWalls 1.0 | 8.3 | 6.3% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.1 | 27 / 35 | 5177 |
| 2 | 1 | 72.2 | 95.9 | 32 / 35 | 5427 |
| 3 | 1 | 70.6 | 91.1 | 26 / 35 | 5566 |
| 4 | 1 | 70.8 | 92.1 | 31 / 35 | 4997 |
| 5 | 1 | 70.0 | 90.2 | 28 / 35 | 5029 |
| 6 | 1 | 72.0 | 97.8 | 31 / 35 | 5439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 100% |
| bvh.micro.Freya 0.3 | 33 | 94% |
| mz.Cork 0.1 | 29 | 90% |
| alpha.RainingFire 1.0 | 26 | 88% |
| m3thos.Eva02 0.7.1 | 21 | 100% |
| bvh.mini.Fenrir 0.39 | 14 | 93% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 10 | 29% | 35 |
| bvh.micro.Freya 0.3 | 6 | 17% | 28 |
| bvh.mini.Fenrir 0.39 | 6 | 17% | 20 |
| mz.Cork 0.1 | 5 | 14% | 26 |
| bzdp.Pansy 2.1 | 3 | 9% | 54 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 4 |
| m3thos.Eva02 0.7.1 | 1 | 3% | 28 |
| dl.BetterWalls 1.0 | 1 | 3% | 11 |
| sample.MyFirstRobot 1.0 | 1 | 3% | 3 |

## Melee bench: F37

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 94.3 | 180 / 210 | 1.51 | 20.3% | 32960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 20.3% | 180 |
| germ.TheMind .2 | 2.3 | 10.9% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.5% | 1 |
| EBBU.Sim2 1.02 | 4.2 | 9.6% | 1 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.0% | 8 |
| agrach.Dalek 1.0 | 6.2 | 8.7% | 6 |
| lmk.ACPFinal 0.1 | 6.3 | 8.7% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 7.6% | 0 |
| skm.Ryubot 1.0 | 8.7 | 7.4% | 0 |
| mb.Beast 0.1 | 9.0 | 7.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.7 | 29 / 35 | 5366 |
| 2 | 1 | 70.6 | 97.8 | 32 / 35 | 5489 |
| 3 | 1 | 69.3 | 93.0 | 28 / 35 | 5453 |
| 4 | 1 | 70.2 | 95.2 | 31 / 35 | 5465 |
| 5 | 1 | 68.9 | 91.1 | 28 / 35 | 5428 |
| 6 | 1 | 70.6 | 96.8 | 32 / 35 | 5759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 46 | 98% |
| stelo.UntouchableNano 1.3 | 32 | 94% |
| EBBU.Sim2 1.02 | 25 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 100% |
| lmk.ACPFinal 0.1 | 15 | 100% |
| skm.Ryubot 1.0 | 14 | 100% |
| mb.Beast 0.1 | 13 | 100% |
| agrach.Dalek 1.0 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 8 | 27% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 17% | 44 |
| germ.TheMind .2 | 4 | 13% | 45 |
| EBBU.Sim2 1.02 | 4 | 13% | 25 |
| lmk.ACPFinal 0.1 | 4 | 13% | 18 |
| skm.Ryubot 1.0 | 3 | 10% | 4 |
| agrach.Dalek 1.0 | 2 | 7% | 20 |
| mb.Beast 0.1 | 0 | 0% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 0 | 0% | 5 |

## Melee bench: F38

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 80.8 | 84 / 210 | 2.72 | 16.1% | 23224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 16.8% | 77 |
| hadur117.mini.DeiseFAP 0.3 | 1.5 | 16.1% | 84 |
| bvh.mini.Freya 0.55 | 3.3 | 12.2% | 6 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.2% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.6% | 12 |
| cs.Wren 1.0 | 5.0 | 10.6% | 4 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.7% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.9% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.2% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 73.7 | 9 / 35 | 3852 |
| 2 | 2 | 65.8 | 83.2 | 18 / 35 | 3642 |
| 3 | 1 | 66.3 | 84.8 | 15 / 35 | 4233 |
| 4 | 2 | 64.3 | 81.9 | 11 / 35 | 3567 |
| 5 | 1 | 63.0 | 74.6 | 12 / 35 | 3713 |
| 6 | 1 | 67.4 | 87.0 | 19 / 35 | 4217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 54 | 57% |
| bts.mega.Gnarly 1.4 | 20 | 90% |
| cs.Wren 1.0 | 14 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 80% |
| bvh.mini.Freya 0.55 | 8 | 100% |
| kdf.KoulDestroyer 1.0 | 7 | 57% |
| matt.UnderDark3 2.4.34 | 2 | 50% |

Hadur died in 126 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 54 | 43% | 90 |
| bvh.mini.Freya 0.55 | 18 | 14% | 25 |
| bts.mega.Gnarly 1.4 | 14 | 11% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 10% | 21 |
| cs.Wren 1.0 | 10 | 8% | 17 |
| kdf.KoulDestroyer 1.0 | 8 | 6% | 12 |
| bzdp.BoxCar 2.0 | 4 | 3% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 3 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 3 |

## Melee bench: F39

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.3 | 106 / 210 | 2.23 | 18.0% | 28765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 18.0% | 106 |
| bvh.fry.Freya 0.82 | 2.3 | 14.4% | 20 |
| az.Ololobot 0.2.4 | 2.7 | 13.1% | 51 |
| catcat20.Lambda 0.024 | 4.0 | 10.9% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.1% | 10 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.0% | 3 |
| gimp.GimpBot 0.1 | 6.5 | 8.4% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.7 | 19 / 35 | 4952 |
| 2 | 1 | 68.7 | 91.4 | 17 / 35 | 5221 |
| 3 | 1 | 65.5 | 81.9 | 15 / 35 | 4446 |
| 4 | 1 | 67.6 | 87.3 | 18 / 35 | 4712 |
| 5 | 1 | 65.4 | 83.5 | 16 / 35 | 4415 |
| 6 | 1 | 68.1 | 87.0 | 21 / 35 | 5019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 53 | 57% |
| bvh.fry.Freya 0.82 | 36 | 81% |
| catcat20.Lambda 0.024 | 32 | 81% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 89% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| gimp.GimpBot 0.1 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1089. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 35 | 33% | 67 |
| bvh.fry.Freya 0.82 | 33 | 31% | 59 |
| catcat20.Lambda 0.024 | 15 | 14% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 10% | 18 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 8 |
| gimp.GimpBot 0.1 | 2 | 2% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 3 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F40

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.8 | 118 / 210 | 2.19 | 18.5% | 27974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 18.5% | 118 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 42 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.1% | 26 |
| mz.AntiGrav 1.0 | 4.2 | 11.1% | 5 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.5% | 9 |
| stelo.Randomness 1.0 | 6.5 | 8.3% | 8 |
| alpha.BlackIce 1.0 | 6.7 | 8.1% | 1 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.9% | 0 |
| sample.Corners 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.6 | 20 / 35 | 4527 |
| 2 | 1 | 67.4 | 84.8 | 18 / 35 | 4453 |
| 3 | 1 | 68.3 | 86.7 | 16 / 35 | 4944 |
| 4 | 1 | 67.1 | 84.4 | 18 / 35 | 4489 |
| 5 | 1 | 68.9 | 87.6 | 21 / 35 | 4675 |
| 6 | 1 | 69.1 | 88.9 | 25 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 60 | 77% |
| kano.gamma.KanoGamma 1.8 | 39 | 69% |
| mz.AntiGrav 1.0 | 23 | 96% |
| Polkwane.SmashMelee 1.0 | 13 | 77% |
| stelo.Randomness 1.0 | 7 | 71% |
| alpha.BlackIce 1.0 | 6 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 32 | 35% | 66 |
| kano.gamma.KanoGamma 1.8 | 21 | 23% | 50 |
| Polkwane.SmashMelee 1.0 | 13 | 14% | 25 |
| mz.AntiGrav 1.0 | 12 | 13% | 32 |
| stelo.Randomness 1.0 | 5 | 5% | 14 |
| alpha.BlackIce 1.0 | 4 | 4% | 11 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 4 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.3 | 108 / 210 | 2.23 | 17.6% | 24486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.2 | 17.6% | 108 |
| eem.EvBotNG v12.8 | 1.8 | 15.9% | 69 |
| ary.Swarm 1.1 | 3.2 | 13.1% | 19 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.4% | 9 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.8% | 6 |
| shrub.Silver v048 | 6.0 | 8.3% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.2% | 0 |
| stelo.Mirror 1.1 | 8.7 | 5.7% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 87.3 | 15 / 35 | 4226 |
| 2 | 1 | 67.5 | 88.3 | 21 / 35 | 3995 |
| 3 | 1 | 68.6 | 89.5 | 22 / 35 | 4155 |
| 4 | 1 | 66.9 | 84.8 | 18 / 35 | 3881 |
| 5 | 1 | 67.4 | 86.7 | 18 / 35 | 4338 |
| 6 | 2 | 65.4 | 81.6 | 14 / 35 | 3891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 77 | 48% |
| lessonz.robocode.Oz 0.5.0 | 28 | 100% |
| ary.Swarm 1.1 | 28 | 71% |
| simonton.nano.MeleeSeed 1.8 | 19 | 95% |
| stelo.Mirror 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 50 | 49% | 89 |
| ary.Swarm 1.1 | 22 | 21% | 46 |
| simonton.nano.MeleeSeed 1.8 | 13 | 13% | 28 |
| lessonz.robocode.Oz 0.5.0 | 6 | 6% | 24 |
| shrub.Silver v048 | 3 | 3% | 6 |
| jsal.Jsalbot 1.0 | 3 | 3% | 6 |
| zyx.nano.Ant 1.1 | 3 | 3% | 3 |
| stelo.Mirror 1.1 | 1 | 1% | 5 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.5 | 106 / 210 | 2.12 | 18.3% | 30449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 18.3% | 106 |
| wompi.Wallaby 5.1 | 2.0 | 15.4% | 48 |
| ara.Shera 0.88 | 3.3 | 14.1% | 34 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.4% | 20 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 0 |
| dsw.StaticD 1.0 | 6.5 | 7.3% | 2 |
| maribo.IotaCT 1.1 | 6.8 | 7.1% | 0 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 4.7% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.3 | 18 / 35 | 5170 |
| 2 | 1 | 67.0 | 84.1 | 16 / 35 | 4894 |
| 3 | 1 | 68.6 | 89.8 | 19 / 35 | 5040 |
| 4 | 1 | 67.4 | 85.7 | 14 / 35 | 4929 |
| 5 | 1 | 67.9 | 85.4 | 17 / 35 | 4975 |
| 6 | 1 | 70.1 | 92.7 | 22 / 35 | 5441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 51 | 76% |
| ara.Shera 0.88 | 45 | 71% |
| maribo.mini.MiniQuester 0.1 | 36 | 86% |
| dsw.StaticD 1.0 | 5 | 80% |

Hadur died in 105 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 43 | 41% | 74 |
| wompi.Wallaby 5.1 | 36 | 34% | 81 |
| maribo.mini.MiniQuester 0.1 | 19 | 18% | 46 |
| dsw.StaticD 1.0 | 3 | 3% | 3 |
| maribo.IotaCT 1.1 | 3 | 3% | 3 |
| amz.NanoClone 1.41 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 75.7 | 45 / 210 | 3.19 | 14.7% | 21560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 146 |
| hadur117.mini.DeiseFAP 0.3 | 2.0 | 14.7% | 45 |
| brainfade.melee.Dusk 0.44 | 3.0 | 13.2% | 14 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.5% | 2 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.3% | 1 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.7% | 1 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 73.3 | 7 / 35 | 3577 |
| 2 | 2 | 64.0 | 77.5 | 4 / 35 | 3631 |
| 3 | 2 | 62.5 | 72.1 | 7 / 35 | 3240 |
| 4 | 2 | 65.2 | 78.1 | 9 / 35 | 3762 |
| 5 | 2 | 62.7 | 72.4 | 7 / 35 | 3430 |
| 6 | 2 | 66.1 | 80.6 | 11 / 35 | 3920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 75 | 28% |
| brainfade.melee.Dusk 0.44 | 16 | 88% |
| dummy.micro.Sparrow 2.5 | 6 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 165 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 94 | 57% | 116 |
| brainfade.melee.Dusk 0.44 | 20 | 12% | 33 |
| wcsv.melee.EngineerMelee 0.1 | 20 | 12% | 24 |
| dummy.micro.Sparrow 2.5 | 14 | 8% | 19 |
| mz.NanoGod 2.02 | 7 | 4% | 8 |
| Krabb.akim2.Akim2 1.1b | 6 | 4% | 6 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |

## Melee bench: F44

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.9 | 127 / 210 | 2.09 | 19.1% | 31158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 19.1% | 127 |
| stelo.Liblix 0.3.1 | 2.0 | 15.8% | 47 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.1% | 24 |
| wompi.Quokka 1.6 | 4.3 | 10.3% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 8.9% | 1 |
| jwirde.Gort 2.0 | 5.8 | 8.8% | 4 |
| disan.Chair 2.2.0 | 6.8 | 7.4% | 3 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.3 | 21 / 35 | 5489 |
| 2 | 1 | 70.1 | 90.5 | 24 / 35 | 5347 |
| 3 | 1 | 68.5 | 85.4 | 20 / 35 | 5158 |
| 4 | 1 | 69.2 | 89.8 | 22 / 35 | 4863 |
| 5 | 1 | 70.7 | 92.1 | 23 / 35 | 5458 |
| 6 | 1 | 67.2 | 82.2 | 17 / 35 | 4843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 87 | 82% |
| tzu.TheArtOfWar 1.2 | 39 | 79% |
| wompi.Quokka 1.6 | 10 | 100% |
| disan.Chair 2.2.0 | 8 | 75% |
| jwirde.Gort 2.0 | 6 | 83% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 32 | 38% | 103 |
| tzu.TheArtOfWar 1.2 | 29 | 35% | 62 |
| wompi.Quokka 1.6 | 7 | 8% | 14 |
| disan.Chair 2.2.0 | 4 | 5% | 8 |
| jwirde.Gort 2.0 | 3 | 4% | 9 |
| stf.PanzerGeneral 0.1 | 3 | 4% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 4% | 4 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.6 | 87 / 210 | 2.11 | 19.5% | 35219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAP 0.3 | 1.0 | 19.5% | 87 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.8% | 105 |
| jje.BagPuss 1.2 | 2.7 | 12.1% | 2 |
| myl.nano.Graviton 1.10 | 4.3 | 10.2% | 7 |
| sul.Lunar 1.1 | 5.0 | 10.2% | 5 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.3% | 1 |
| fm.claire 1.7 | 6.8 | 8.3% | 1 |
| hvilela.HVilela 0.9 | 7.3 | 8.0% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.1% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.3 | 18 / 35 | 5849 |
| 2 | 1 | 68.4 | 86.3 | 13 / 35 | 5614 |
| 3 | 1 | 67.7 | 84.1 | 14 / 35 | 5407 |
| 4 | 1 | 70.3 | 89.8 | 13 / 35 | 6407 |
| 5 | 1 | 69.9 | 90.2 | 11 / 35 | 6221 |
| 6 | 1 | 69.4 | 87.0 | 18 / 35 | 5721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 108 | 21% |
| jje.BagPuss 1.2 | 20 | 95% |
| sul.Lunar 1.1 | 16 | 100% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 100% |
| wit.Deep7 2.0 | 5 | 80% |
| fm.claire 1.7 | 4 | 75% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 2326. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 86 | 70% | 0 |
| jje.BagPuss 1.2 | 10 | 8% | 69 |
| myl.nano.Graviton 1.10 | 7 | 6% | 43 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 16 |
| sul.Lunar 1.1 | 5 | 4% | 48 |
| fm.claire 1.7 | 4 | 3% | 11 |
| wit.Deep7 2.0 | 3 | 2% | 12 |
| hvilela.HVilela 0.9 | 2 | 2% | 9 |

## Melee bench: F46

hadur117.mini.DeiseFAP 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 85.4 | 80 / 210 | 2.31 | 16.9% | 24796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.8% | 56 |
| hadur117.mini.DeiseFAP 0.3 | 2.0 | 16.9% | 80 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.1% | 63 |
| mz.MicroSheep 1.0 | 4.5 | 10.1% | 2 |
| cx.Princess 1.0 | 5.0 | 9.8% | 8 |
| sadoner.killer 0.2 | 5.7 | 9.0% | 0 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.8% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 85.4 | 11 / 35 | 4056 |
| 2 | 1 | 67.1 | 87.0 | 16 / 35 | 4271 |
| 3 | 1 | 67.4 | 88.3 | 17 / 35 | 4266 |
| 4 | 3 | 65.7 | 83.8 | 11 / 35 | 4046 |
| 5 | 3 | 66.2 | 83.5 | 12 / 35 | 4042 |
| 6 | 2 | 66.3 | 84.8 | 13 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 80 | 60% |
| rsalesc.melee.Medina 0.4.5 | 43 | 35% |
| cx.Princess 1.0 | 16 | 75% |
| sadoner.killer 0.2 | 2 | 100% |
| mz.MicroSheep 1.0 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 50% |

Hadur died in 130 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 61 | 47% | 116 |
| rsalesc.melee.Medina 0.4.5 | 44 | 34% | 57 |
| cx.Princess 1.0 | 7 | 5% | 15 |
| mz.MicroSheep 1.0 | 7 | 5% | 9 |
| sadoner.killer 0.2 | 5 | 4% | 7 |
| arthord.NanoSatanMelee Beta | 5 | 4% | 5 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

