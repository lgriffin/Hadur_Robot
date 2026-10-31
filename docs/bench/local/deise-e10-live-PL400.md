# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 88.0 | 58 / 210 | 2.08 | 17.4% | 29877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 141 |
| hadur117.mini.DeisePL400 0.4 | 2.0 | 17.4% | 58 |
| sgp.JollyNinja 3.53 | 3.5 | 11.5% | 6 |
| mz.MicroGodMelee 1 | 4.2 | 10.7% | 4 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 10.7% | 1 |
| lorneswork.Predator 1.0 | 5.5 | 10.0% | 2 |
| adt.Ar2 1.0 | 7.2 | 6.9% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.4% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 88.3 | 12 / 35 | 5226 |
| 2 | 2 | 67.2 | 88.3 | 9 / 35 | 5054 |
| 3 | 2 | 67.2 | 90.2 | 10 / 35 | 4765 |
| 4 | 2 | 67.6 | 88.3 | 8 / 35 | 5091 |
| 5 | 2 | 66.7 | 86.3 | 7 / 35 | 4782 |
| 6 | 2 | 67.5 | 86.7 | 12 / 35 | 4959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 134 | 18% |
| mz.MicroGodMelee 1 | 20 | 80% |
| sgp.JollyNinja 3.53 | 12 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| lorneswork.Predator 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 1328. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 76% | 140 |
| sgp.JollyNinja 3.53 | 12 | 8% | 20 |
| mz.MicroGodMelee 1 | 10 | 6% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 15 |
| lorneswork.Predator 1.0 | 2 | 1% | 7 |
| adt.Ar2 1.0 | 0 | 0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.1 | 117 / 210 | 2.25 | 18.5% | 29520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.5% | 117 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.9% | 28 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.8% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.3% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.2% | 7 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 7.8% | 2 |
| Noran.BitchingElk 0.054 | 7.3 | 7.4% | 7 |
| sch.Simone 0.3d | 7.3 | 7.7% | 8 |
| stelo.PatternRobot 1.0 | 8.5 | 6.5% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.1 | 17 / 35 | 4564 |
| 2 | 1 | 67.1 | 83.8 | 20 / 35 | 4666 |
| 3 | 1 | 66.5 | 81.0 | 15 / 35 | 4804 |
| 4 | 1 | 69.0 | 89.2 | 23 / 35 | 4841 |
| 5 | 1 | 70.3 | 90.8 | 23 / 35 | 5521 |
| 6 | 1 | 68.4 | 87.9 | 19 / 35 | 5124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 49 | 73% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 74% |
| Noran.BitchingElk 0.054 | 14 | 79% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 88% |
| sch.Simone 0.3d | 8 | 88% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 28 | 30% | 63 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 26% | 57 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 12% | 19 |
| sch.Simone 0.3d | 10 | 11% | 19 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 7% | 17 |
| Noran.BitchingElk 0.054 | 5 | 5% | 13 |
| stelo.PatternRobot 1.0 | 5 | 5% | 10 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 8 |
| fullsail.SweetTea 1.1 | 0 | 0% | 3 |

## Melee bench: F03

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 92.9 | 148 / 210 | 1.64 | 20.1% | 36090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.1% | 148 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.5% | 19 |
| radnor.DoctorBob 1.42 | 2.8 | 13.4% | 8 |
| vuen.Cake 2.51 | 3.5 | 12.8% | 30 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 1 |
| adt.Ar1 2.1 | 6.7 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.8% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.7% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.7 | 25 / 35 | 5940 |
| 2 | 1 | 70.6 | 95.9 | 25 / 35 | 5958 |
| 3 | 1 | 71.4 | 95.9 | 30 / 35 | 6145 |
| 4 | 1 | 69.3 | 90.2 | 20 / 35 | 5848 |
| 5 | 1 | 69.6 | 89.8 | 24 / 35 | 5888 |
| 6 | 1 | 70.4 | 92.7 | 24 / 35 | 6311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 68% |
| kawigi.nano.Lib 1.0 | 64 | 89% |
| radnor.DoctorBob 1.42 | 36 | 94% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| urdos.URDOS 1.3 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 28 | 45% | 74 |
| kawigi.nano.Lib 1.0 | 18 | 29% | 73 |
| radnor.DoctorBob 1.42 | 12 | 19% | 45 |
| urdos.URDOS 1.3 | 2 | 3% | 7 |
| adt.Ar1 2.1 | 1 | 2% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.6 | 33 / 210 | 2.20 | 17.4% | 33153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.5% | 170 |
| hadur117.mini.DeisePL400 0.4 | 2.0 | 17.4% | 33 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.3% | 4 |
| TNT.TNT 0.99.1 | 4.3 | 10.3% | 1 |
| josago.Jorgito 0.16 | 4.7 | 9.5% | 1 |
| tj.zombie1n 1.0.1 | 6.5 | 6.7% | 1 |
| css.Delitioner 0.11 | 6.7 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 85.7 | 7 / 35 | 6031 |
| 2 | 2 | 69.3 | 88.3 | 8 / 35 | 6112 |
| 3 | 2 | 66.9 | 85.1 | 1 / 35 | 5274 |
| 4 | 2 | 67.7 | 85.7 | 6 / 35 | 5346 |
| 5 | 2 | 67.3 | 87.0 | 5 / 35 | 4884 |
| 6 | 2 | 68.3 | 87.9 | 6 / 35 | 5506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 167 | 17% |
| apc.LeeroyJenkins2 1.0 | 5 | 40% |
| josago.Jorgito 0.16 | 3 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 1463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 152 | 86% | 181 |
| apc.LeeroyJenkins2 1.0 | 13 | 7% | 15 |
| josago.Jorgito 0.16 | 4 | 2% | 6 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| TNT.TNT 0.99.1 | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.0 | 32 / 210 | 3.34 | 13.8% | 19715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.4% | 109 |
| justin.DemonicRage 3.4 | 1.8 | 17.0% | 54 |
| hadur117.mini.DeisePL400 0.4 | 3.0 | 13.8% | 32 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 11 |
| axeBots.HataMoto 3.09 | 5.5 | 8.8% | 2 |
| ms.Ares 0.19 | 5.5 | 9.4% | 2 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 74.3 | 7 / 35 | 2980 |
| 2 | 3 | 62.2 | 75.6 | 8 / 35 | 3285 |
| 3 | 3 | 61.1 | 72.1 | 2 / 35 | 3231 |
| 4 | 3 | 62.4 | 76.8 | 5 / 35 | 3433 |
| 5 | 3 | 61.6 | 73.3 | 3 / 35 | 3384 |
| 6 | 3 | 61.5 | 72.1 | 7 / 35 | 3402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 38 | 16% |
| justin.DemonicRage 3.4 | 28 | 39% |
| wompi.Numbat 2.1 | 8 | 88% |
| axeBots.HataMoto 3.09 | 5 | 100% |
| ms.Ares 0.19 | 3 | 67% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 64 | 36% | 74 |
| cb.fire.Firestarter 2.0f | 61 | 34% | 67 |
| wompi.Numbat 2.1 | 18 | 10% | 25 |
| ms.Ares 0.19 | 13 | 7% | 16 |
| axeBots.HataMoto 3.09 | 12 | 7% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 6 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.9 | 109 / 210 | 2.36 | 17.8% | 27176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 17.8% | 109 |
| jekl.StoneGhost 0.7 | 2.5 | 14.4% | 22 |
| origin.SleepSiphon 1.7b | 2.7 | 13.8% | 39 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.3% | 32 |
| mld.Wisdom 1.0 | 5.2 | 10.1% | 0 |
| gg.Wolverine 2.0 | 5.7 | 9.2% | 5 |
| DBall.NUKE 0.1 | 7.7 | 6.5% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.6% | 3 |
| spinnercat.Omen 1.0 | 8.5 | 6.1% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 82.2 | 16 / 35 | 4405 |
| 2 | 1 | 68.9 | 89.2 | 22 / 35 | 4692 |
| 3 | 1 | 66.9 | 82.2 | 17 / 35 | 4608 |
| 4 | 1 | 68.9 | 90.8 | 21 / 35 | 4729 |
| 5 | 1 | 64.0 | 76.2 | 13 / 35 | 3984 |
| 6 | 1 | 68.6 | 88.6 | 20 / 35 | 4758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 45 | 91% |
| origin.SleepSiphon 1.7b | 40 | 80% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 53% |
| gg.Wolverine 2.0 | 11 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 83% |
| mld.Wisdom 1.0 | 3 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 36% | 52 |
| origin.SleepSiphon 1.7b | 27 | 27% | 66 |
| jekl.StoneGhost 0.7 | 26 | 26% | 56 |
| mld.Wisdom 1.0 | 5 | 5% | 11 |
| gg.Wolverine 2.0 | 3 | 3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 12 |
| spinnercat.Omen 1.0 | 2 | 2% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |

## Melee bench: F07

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.7 | 137 / 210 | 1.48 | 20.2% | 33676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.2% | 137 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.3% | 40 |
| rtk.Tachikoma 1.0 | 3.0 | 16.3% | 24 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.9% | 1 |
| franzor.Lizt 1.3.1 | 4.8 | 10.2% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 97.5 | 28 / 35 | 5749 |
| 2 | 1 | 71.5 | 94.3 | 22 / 35 | 5477 |
| 3 | 1 | 71.0 | 92.7 | 20 / 35 | 5666 |
| 4 | 1 | 71.4 | 94.0 | 21 / 35 | 5501 |
| 5 | 1 | 72.5 | 96.5 | 26 / 35 | 5937 |
| 6 | 1 | 70.7 | 93.0 | 20 / 35 | 5346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 105 | 84% |
| rsalesc.melee.Monk 0.3.6c | 52 | 33% |
| oog.melee.CapuletDroid 1.1 | 24 | 96% |
| franzor.Lizt 1.3.1 | 11 | 55% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 38 | 52% | 63 |
| rtk.Tachikoma 1.0 | 29 | 40% | 117 |
| franzor.Lizt 1.3.1 | 5 | 7% | 0 |
| oog.melee.CapuletDroid 1.1 | 1 | 1% | 25 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.2 | 137 / 210 | 1.80 | 19.5% | 29983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.5% | 137 |
| tm.Yuugao 1.0 | 2.5 | 13.0% | 32 |
| shrub.Vapour v159 | 3.0 | 12.1% | 21 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.0% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.1% | 4 |
| m3thos.Eva00 1.1 | 6.0 | 8.7% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.0% | 5 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 6.3% | 0 |
| SHAM.WOW 1.4 | 9.0 | 6.2% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 92.7 | 25 / 35 | 4823 |
| 2 | 1 | 69.1 | 91.4 | 21 / 35 | 5260 |
| 3 | 1 | 69.1 | 90.5 | 26 / 35 | 4705 |
| 4 | 1 | 69.8 | 94.3 | 25 / 35 | 4953 |
| 5 | 1 | 67.6 | 86.7 | 16 / 35 | 5143 |
| 6 | 1 | 69.8 | 91.4 | 24 / 35 | 5099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 67% |
| shrub.Vapour v159 | 41 | 80% |
| Krabb.sliNk.Garm 0.9u | 30 | 90% |
| jwst.DAD.DarkAndDarker 1.1 | 18 | 78% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 91% |
| m3thos.Eva00 1.1 | 7 | 100% |
| SHAM.WOW 1.4 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 29 | 39% | 81 |
| shrub.Vapour v159 | 17 | 23% | 48 |
| Krabb.sliNk.Garm 0.9u | 11 | 15% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 11% | 21 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 7% | 16 |
| SHAM.WOW 1.4 | 2 | 3% | 7 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
| m3thos.Eva00 1.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 77.5 | 66 / 210 | 3.03 | 15.9% | 24569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.1% | 98 |
| hadur117.mini.DeisePL400 0.4 | 2.0 | 15.9% | 66 |
| kc.micro.Figment 1.0 | 3.0 | 13.8% | 22 |
| yagami.Tidus 0.11 | 4.5 | 10.6% | 3 |
| pedersen.Grishnakh 1.0 | 5.0 | 9.9% | 12 |
| mc2.enemy.Original 0.9 | 5.8 | 9.1% | 6 |
| dft.Calliope 5.6 | 6.7 | 7.6% | 2 |
| step.nanoPri 1.0 | 8.0 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.6% | 1 |
| rdm.Dueler 0.4x | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 73.3 | 11 / 35 | 4062 |
| 2 | 2 | 65.3 | 78.4 | 13 / 35 | 4168 |
| 3 | 2 | 64.3 | 76.8 | 8 / 35 | 4043 |
| 4 | 2 | 65.1 | 78.4 | 12 / 35 | 4108 |
| 5 | 2 | 65.1 | 79.4 | 11 / 35 | 4145 |
| 6 | 2 | 64.9 | 78.4 | 11 / 35 | 4043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 65 | 42% |
| kc.micro.Figment 1.0 | 24 | 79% |
| mc2.enemy.Original 0.9 | 8 | 100% |
| yagami.Tidus 0.11 | 8 | 88% |
| pedersen.Grishnakh 1.0 | 4 | 75% |
| dft.Calliope 5.6 | 3 | 67% |

Hadur died in 144 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 67 | 47% | 95 |
| kc.micro.Figment 1.0 | 28 | 19% | 48 |
| yagami.Tidus 0.11 | 14 | 10% | 19 |
| mc2.enemy.Original 0.9 | 11 | 8% | 20 |
| pedersen.Grishnakh 1.0 | 11 | 8% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 7 |
| dft.Calliope 5.6 | 5 | 3% | 7 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 96.7 | 176 / 210 | 1.30 | 20.7% | 32366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.7% | 176 |
| DTF.Kludgy 1.2b | 2.2 | 13.9% | 16 |
| ne.Chimera 1.2 | 3.0 | 13.1% | 9 |
| ejb.Polaris 1.0.1 | 3.8 | 12.5% | 6 |
| tvv.micro.Antares 1.1.1 | 5.3 | 9.6% | 1 |
| vStar.RAFzilla 2.15 | 5.7 | 9.4% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.7 | 6.0% | 0 |
| kurios.DOSexe .9b | 7.8 | 5.7% | 0 |
| sam.Samspin 1.0 | 8.7 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 99.0 | 33 / 35 | 5657 |
| 2 | 1 | 72.0 | 98.1 | 31 / 35 | 5759 |
| 3 | 1 | 71.2 | 97.5 | 28 / 35 | 5309 |
| 4 | 1 | 71.6 | 98.1 | 31 / 35 | 5399 |
| 5 | 1 | 69.6 | 92.7 | 26 / 35 | 5210 |
| 6 | 1 | 70.3 | 94.6 | 27 / 35 | 5032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 61 | 85% |
| ejb.Polaris 1.0.1 | 53 | 96% |
| ne.Chimera 1.2 | 40 | 83% |
| vStar.RAFzilla 2.15 | 18 | 94% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| donjezza.Muncho 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 1036. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 13 | 37% | 63 |
| ne.Chimera 1.2 | 13 | 37% | 47 |
| ejb.Polaris 1.0.1 | 5 | 14% | 57 |
| vStar.RAFzilla 2.15 | 1 | 3% | 17 |
| tvv.micro.Antares 1.1.1 | 1 | 3% | 13 |
| donjezza.Muncho 1.0 | 1 | 3% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 3% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.2 | 99 / 210 | 2.51 | 17.3% | 26246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.3 | 17.3% | 99 |
| rz.Aleph 0.34 | 1.7 | 16.3% | 60 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.3% | 15 |
| djc.DynaBot 0.1.1 | 4.2 | 10.7% | 16 |
| rdt199.Warlord 0.73 | 5.5 | 9.3% | 10 |
| br2.MobyDickBot 1.6 | 5.7 | 8.6% | 4 |
| uji.YellohFellah 1.0 | 6.3 | 8.0% | 6 |
| KiraNL.Chupacabra 0.4 | 8.2 | 6.8% | 1 |
| stelo.MirrorNano 1.3 | 9.3 | 5.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.3 | 17 / 35 | 4451 |
| 2 | 2 | 64.6 | 77.8 | 13 / 35 | 4304 |
| 3 | 2 | 66.1 | 83.2 | 16 / 35 | 4181 |
| 4 | 1 | 67.6 | 87.3 | 20 / 35 | 4473 |
| 5 | 1 | 68.1 | 88.9 | 20 / 35 | 4637 |
| 6 | 1 | 65.2 | 80.6 | 13 / 35 | 4200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 63% |
| cx.mini.Nimrod 0.55 | 23 | 83% |
| djc.DynaBot 0.1.1 | 16 | 81% |
| uji.YellohFellah 1.0 | 15 | 93% |
| rdt199.Warlord 0.73 | 14 | 64% |
| br2.MobyDickBot 1.6 | 8 | 75% |
| KiraNL.Chupacabra 0.4 | 3 | 67% |

Hadur died in 111 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 47 | 42% | 83 |
| cx.mini.Nimrod 0.55 | 25 | 23% | 40 |
| rdt199.Warlord 0.73 | 16 | 14% | 28 |
| djc.DynaBot 0.1.1 | 11 | 10% | 23 |
| uji.YellohFellah 1.0 | 4 | 4% | 19 |
| br2.MobyDickBot 1.6 | 4 | 4% | 9 |
| KiraNL.Chupacabra 0.4 | 3 | 3% | 5 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.7 | 110 / 210 | 2.74 | 16.8% | 23276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 16.8% | 110 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.0% | 39 |
| nat.PallasHawk 1.0 | 3.2 | 13.3% | 29 |
| darkcanuck.Leon 1.01 | 3.3 | 13.1% | 20 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.7% | 11 |
| jrm.Test0 1.0 | 6.3 | 8.1% | 0 |
| jp.Perpy 16.0 | 7.3 | 6.9% | 0 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.5% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.5% | 1 |
| stuff.Vlad 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.1 | 20 / 35 | 4144 |
| 2 | 1 | 66.2 | 81.0 | 19 / 35 | 4184 |
| 3 | 1 | 66.2 | 82.2 | 19 / 35 | 3858 |
| 4 | 1 | 65.7 | 80.3 | 20 / 35 | 3851 |
| 5 | 1 | 64.8 | 79.4 | 15 / 35 | 3701 |
| 6 | 1 | 64.2 | 77.1 | 17 / 35 | 3538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 46 | 83% |
| darkcanuck.Leon 1.01 | 40 | 93% |
| bts.wiki.RipCurl 0.9b | 30 | 80% |
| brainfade.melee.Genghis 0.36 | 7 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 22 | 22% | 57 |
| bts.wiki.RipCurl 0.9b | 22 | 22% | 41 |
| darkcanuck.Leon 1.01 | 18 | 18% | 60 |
| brainfade.melee.Genghis 0.36 | 15 | 15% | 20 |
| jrm.Test0 1.0 | 9 | 9% | 11 |
| jp.Perpy 16.0 | 7 | 7% | 6 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 7 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 85.0 | 73 / 210 | 2.35 | 16.6% | 25372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.8 | 16.6% | 73 |
| ags.Glacier 0.2.11 | 2.0 | 16.4% | 38 |
| mn.Combat 3.25.0 | 2.2 | 16.6% | 79 |
| shinh.Entangled 0.3 | 4.5 | 11.9% | 14 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.4% | 6 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.6% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 88.9 | 17 / 35 | 4006 |
| 2 | 3 | 65.0 | 81.3 | 9 / 35 | 4214 |
| 3 | 3 | 64.3 | 79.0 | 9 / 35 | 3930 |
| 4 | 2 | 65.9 | 84.1 | 10 / 35 | 4363 |
| 5 | 1 | 67.2 | 89.2 | 13 / 35 | 4222 |
| 6 | 1 | 67.7 | 87.6 | 15 / 35 | 4637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 65 | 42% |
| ags.Glacier 0.2.11 | 50 | 56% |
| shinh.Entangled 0.3 | 20 | 65% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 52 | 38% | 78 |
| mn.Combat 3.25.0 | 50 | 36% | 79 |
| shinh.Entangled 0.3 | 18 | 13% | 30 |
| gh.micro.Gruweltje 0.7 | 12 | 9% | 18 |
| stelo.Wang 1.0 | 4 | 3% | 4 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 94.7 | 168 / 210 | 1.48 | 20.4% | 31620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.4% | 168 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 16 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.8% | 16 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.8% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.4% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.1% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 6.2 | 9.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.9% | 2 |
| pa.Improved 1.0 | 9.0 | 5.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 95.6 | 30 / 35 | 5574 |
| 2 | 1 | 70.6 | 95.2 | 27 / 35 | 5221 |
| 3 | 1 | 70.6 | 94.0 | 28 / 35 | 5215 |
| 4 | 1 | 70.5 | 93.0 | 28 / 35 | 5099 |
| 5 | 1 | 70.8 | 95.9 | 27 / 35 | 4886 |
| 6 | 1 | 71.0 | 94.6 | 28 / 35 | 5625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 93 | 92% |
| catcat20.shape.Theta 0.018 | 44 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 88% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 17 | 40% | 101 |
| catcat20.shape.Theta 0.018 | 14 | 33% | 46 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 7% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 7% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 5% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 5% | 11 |
| pa.Improved 1.0 | 1 | 2% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 3 |

## Melee bench: F15

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.7 | 100 / 210 | 2.74 | 17.5% | 30158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 17.5% | 100 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.4% | 23 |
| emp.Yngwie 1.11 | 2.8 | 12.8% | 41 |
| mld.DustBunny 3.8 | 4.2 | 12.2% | 10 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.5% | 12 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.4% | 27 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.5% | 1 |
| lambdaxy.TBot 0.1 | 7.7 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.9% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.2 | 18 / 35 | 5275 |
| 2 | 1 | 67.6 | 83.8 | 18 / 35 | 4939 |
| 3 | 1 | 65.9 | 78.1 | 15 / 35 | 4952 |
| 4 | 1 | 65.8 | 78.7 | 12 / 35 | 5118 |
| 5 | 1 | 67.0 | 80.3 | 19 / 35 | 5079 |
| 6 | 1 | 66.5 | 80.0 | 18 / 35 | 4795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 35 | 69% |
| kawigi.micro.Shiz 1.1 | 23 | 100% |
| mld.DustBunny 3.8 | 20 | 85% |
| cb.nano.Insomnia 1.0 | 19 | 84% |
| kawigi.robot.Girl 1.2 | 16 | 75% |
| divineomega.TrialBot 0.003 | 7 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 33 | 29% | 72 |
| mld.DustBunny 3.8 | 22 | 19% | 40 |
| kawigi.micro.Shiz 1.1 | 18 | 16% | 45 |
| cb.nano.Insomnia 1.0 | 16 | 14% | 13 |
| kawigi.robot.Girl 1.2 | 13 | 12% | 21 |
| divineomega.TrialBot 0.003 | 4 | 4% | 9 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.6 | 101 / 210 | 2.21 | 18.9% | 33551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.9% | 101 |
| gh.Griezel 0.5.2 | 2.2 | 16.5% | 69 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.2% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.2% | 26 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.2% | 0 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.9% | 6 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.8% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.1% | 1 |
| asd.Cthulhu 1.3 | 8.8 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.6 | 21 / 35 | 5586 |
| 2 | 1 | 69.5 | 87.0 | 20 / 35 | 5685 |
| 3 | 1 | 68.7 | 85.4 | 14 / 35 | 5689 |
| 4 | 1 | 69.0 | 87.9 | 17 / 35 | 5711 |
| 5 | 1 | 67.7 | 81.9 | 14 / 35 | 5264 |
| 6 | 1 | 69.8 | 88.6 | 15 / 35 | 5616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 93 | 52% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 100% |
| techdude.forest.FlamingForest 1.1 | 20 | 55% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 65 | 60% | 114 |
| techdude.forest.FlamingForest 1.1 | 11 | 10% | 22 |
| bvh.fnr.Fenrir 0.36l | 10 | 9% | 11 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 8% | 32 |
| divineomega.DivineBot 1.9.4.5 | 6 | 6% | 12 |
| stelo.IntrinsicVolatility 1.4 | 5 | 5% | 15 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 2 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |

## Melee bench: F17

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.7 | 128 / 210 | 2.20 | 18.7% | 30303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.7% | 128 |
| et.Predator 1.8 | 2.3 | 12.9% | 20 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.4% | 19 |
| cx.BlestPain 1.41 | 4.2 | 11.6% | 25 |
| ahf.NanoAndrew .4 | 5.2 | 10.8% | 10 |
| nic.Nicator 2.4 | 5.3 | 10.8% | 6 |
| maribo.melee.BMV 0.1 | 6.7 | 8.9% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.7% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.2 | 22 / 35 | 4845 |
| 2 | 1 | 69.2 | 89.2 | 23 / 35 | 5174 |
| 3 | 1 | 69.4 | 91.1 | 23 / 35 | 5006 |
| 4 | 1 | 66.6 | 81.3 | 19 / 35 | 4657 |
| 5 | 1 | 65.9 | 77.5 | 17 / 35 | 5071 |
| 6 | 1 | 70.6 | 92.1 | 24 / 35 | 5550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 52 | 79% |
| oog.melee.Mercutio 1.0 | 43 | 88% |
| cx.BlestPain 1.41 | 28 | 54% |
| nic.Nicator 2.4 | 17 | 94% |
| ahf.NanoAndrew .4 | 13 | 85% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 1037. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 21 | 25% | 35 |
| et.Predator 1.8 | 20 | 24% | 52 |
| ahf.NanoAndrew .4 | 15 | 18% | 29 |
| oog.melee.Mercutio 1.0 | 13 | 16% | 49 |
| nic.Nicator 2.4 | 6 | 7% | 27 |
| maribo.melee.BMV 0.1 | 5 | 6% | 10 |
| tex.Longbot 0.4 | 2 | 2% | 4 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.4 | 134 / 210 | 2.05 | 18.5% | 26289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.5% | 134 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.0% | 29 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.4% | 15 |
| uji.DBH 1.1 | 3.7 | 11.3% | 6 |
| ratosh.Nobo 0.21 | 5.3 | 10.0% | 4 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.4% | 6 |
| sigterm.Sigterm 1.0 | 7.3 | 7.8% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.2% | 4 |
| stelo.WangRobot 1.0 | 8.7 | 6.0% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.2 | 24 / 35 | 4632 |
| 2 | 1 | 66.6 | 86.0 | 20 / 35 | 3936 |
| 3 | 1 | 68.1 | 88.6 | 22 / 35 | 4677 |
| 4 | 1 | 66.9 | 86.3 | 22 / 35 | 4063 |
| 5 | 1 | 68.0 | 88.9 | 24 / 35 | 4540 |
| 6 | 1 | 68.3 | 90.2 | 22 / 35 | 4441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 82% |
| agd.Mooserwirt2 2.7 | 31 | 81% |
| uji.DBH 1.1 | 25 | 88% |
| spinnercat.Robovirus 2.718 | 17 | 100% |
| sigterm.Sigterm 1.0 | 13 | 100% |
| ratosh.Nobo 0.21 | 11 | 82% |
| stelo.WangRobot 1.0 | 10 | 70% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 36% | 70 |
| agd.Mooserwirt2 2.7 | 13 | 17% | 43 |
| uji.DBH 1.1 | 8 | 10% | 20 |
| ratosh.Nobo 0.21 | 6 | 8% | 24 |
| stelo.WangRobot 1.0 | 6 | 8% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 8% | 11 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 14 |
| sigterm.Sigterm 1.0 | 3 | 4% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 3% | 2 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.9 | 171 / 210 | 1.46 | 20.9% | 33577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.9% | 171 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.4% | 13 |
| mld.Infinity 2.2 | 2.5 | 13.8% | 22 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 10.9% | 2 |
| erdnis.Rover 0.3 | 5.2 | 9.9% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.8% | 0 |
| pac.ABC 2.1 | 7.2 | 7.3% | 1 |
| mbh.Mbh 0.1 | 7.5 | 7.4% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.3 | 28 / 35 | 5243 |
| 2 | 1 | 72.0 | 96.2 | 29 / 35 | 5625 |
| 3 | 1 | 71.2 | 93.3 | 27 / 35 | 5408 |
| 4 | 1 | 72.2 | 97.5 | 30 / 35 | 5469 |
| 5 | 1 | 73.0 | 98.1 | 31 / 35 | 5953 |
| 6 | 1 | 71.5 | 91.1 | 26 / 35 | 5879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 79 | 96% |
| mld.Infinity 2.2 | 74 | 86% |
| krillr.mini.JointStrike 2.0.0 | 13 | 92% |
| erdnis.Rover 0.3 | 6 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 1164. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 12 | 31% | 104 |
| mld.Infinity 2.2 | 12 | 31% | 29 |
| krillr.mini.JointStrike 2.0.0 | 8 | 21% | 23 |
| erdnis.Rover 0.3 | 4 | 10% | 16 |
| patson.PatsonTestBot 1.0 | 2 | 5% | 14 |
| pac.ABC 2.1 | 1 | 3% | 4 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 92.8 | 133 / 210 | 1.65 | 20.1% | 32956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.1% | 133 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 35 |
| fwb.Nine 1.0.1 | 3.3 | 11.7% | 21 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 11.1% | 3 |
| catcat20.Rabbit 0.001 | 4.7 | 9.9% | 16 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.7% | 0 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.7% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.5 | 20 / 35 | 5097 |
| 2 | 1 | 69.2 | 88.3 | 21 / 35 | 5370 |
| 3 | 1 | 70.5 | 92.4 | 22 / 35 | 5568 |
| 4 | 1 | 71.3 | 95.9 | 22 / 35 | 5806 |
| 5 | 1 | 70.7 | 94.6 | 24 / 35 | 5564 |
| 6 | 1 | 71.0 | 95.9 | 24 / 35 | 5551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 86 | 72% |
| fwb.Nine 1.0.1 | 49 | 59% |
| catcat20.Rabbit 0.001 | 26 | 62% |
| nz.jdc.nano.GridFu 1.0 | 12 | 92% |
| bayen.nut.Squirrel 1.615 | 9 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 44% | 83 |
| fwb.Nine 1.0.1 | 19 | 24% | 8 |
| catcat20.Rabbit 0.001 | 15 | 19% | 40 |
| nz.jdc.nano.GridFu 1.0 | 5 | 6% | 39 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 13 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 12 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F21

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 94.7 | 145 / 210 | 1.48 | 20.7% | 33791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.7% | 145 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 56 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 3 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 4 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.1% | 0 |
| eld.Hmm 1.0 | 5.5 | 8.2% | 3 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 1 |
| fire219.CatBot 1.0 | 7.8 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.1% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 94.6 | 24 / 35 | 5199 |
| 2 | 1 | 71.9 | 96.2 | 28 / 35 | 5967 |
| 3 | 1 | 71.9 | 96.5 | 26 / 35 | 5721 |
| 4 | 1 | 70.7 | 94.6 | 22 / 35 | 5454 |
| 5 | 1 | 71.8 | 94.6 | 24 / 35 | 5954 |
| 6 | 1 | 70.6 | 91.4 | 21 / 35 | 5496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 123 | 66% |
| dummy.mini.Scimitar 1.01 | 35 | 94% |
| cf.RiO.RiOx 4.2.1 | 20 | 95% |
| eld.Hmm 1.0 | 10 | 90% |
| el.JumpShoot 0.2 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 1554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 67% | 94 |
| cf.RiO.RiOx 4.2.1 | 8 | 12% | 20 |
| dummy.mini.Scimitar 1.01 | 6 | 9% | 58 |
| eld.Hmm 1.0 | 5 | 7% | 31 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.8 | 113 / 210 | 1.91 | 18.8% | 30227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.8% | 113 |
| pe.SandboxDT 2.71m | 2.3 | 15.9% | 50 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.1% | 28 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 15 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 5 |
| yk.JahRoslav 1.1 | 6.7 | 6.7% | 1 |
| tad.Dalek98 0.98 | 7.0 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.0 | 15 / 35 | 4719 |
| 2 | 1 | 69.2 | 90.5 | 19 / 35 | 5049 |
| 3 | 1 | 68.8 | 89.2 | 16 / 35 | 5032 |
| 4 | 1 | 70.7 | 93.7 | 22 / 35 | 5301 |
| 5 | 1 | 69.7 | 90.8 | 21 / 35 | 5064 |
| 6 | 1 | 69.1 | 88.9 | 20 / 35 | 5062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 58 | 74% |
| pe.SandboxDT 2.71m | 50 | 52% |
| jlm.javaDisturbance 0.59 | 40 | 83% |
| bigpete.Stewie 1.0 | 6 | 83% |
| yk.JahRoslav 1.1 | 4 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 41 | 41% | 79 |
| kvk.HebusLeTroll 0.35 | 31 | 31% | 62 |
| jlm.javaDisturbance 0.59 | 21 | 21% | 53 |
| bigpete.Stewie 1.0 | 3 | 3% | 8 |
| gg.Squaraus 0.6 | 2 | 2% | 3 |
| yk.JahRoslav 1.1 | 0 | 0% | 3 |
| tad.Dalek98 0.98 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.7 | 131 / 210 | 1.83 | 19.4% | 30411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.4% | 131 |
| pe.SandboxLump 1.52 | 2.0 | 17.9% | 58 |
| cre.Karolos 0.32 | 3.0 | 14.1% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.5% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.0 | 9.4% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.3 | 8.2% | 3 |
| sample.Walls 1.0 | 7.2 | 7.7% | 0 |
| cw.megas.Blade 0.8 | 7.2 | 7.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.6 | 19 / 35 | 4900 |
| 2 | 1 | 70.8 | 91.1 | 21 / 35 | 5061 |
| 3 | 1 | 70.6 | 91.1 | 25 / 35 | 4922 |
| 4 | 1 | 70.8 | 92.4 | 23 / 35 | 5018 |
| 5 | 1 | 71.0 | 91.4 | 22 / 35 | 5319 |
| 6 | 1 | 70.4 | 90.8 | 21 / 35 | 5191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 96 | 70% |
| cre.Karolos 0.32 | 40 | 93% |
| stelo.AreaTargetingBot 1.1 | 14 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| stelo.RamTrackSurfer 1.2 | 3 | 67% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 46 | 58% | 117 |
| cre.Karolos 0.32 | 17 | 22% | 50 |
| stelo.AreaTargetingBot 1.1 | 9 | 11% | 19 |
| stelo.RamTrackSurfer 1.2 | 4 | 5% | 10 |
| sample.Walls 1.0 | 1 | 1% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 5 |
| cw.megas.Blade 0.8 | 1 | 1% | 1 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 77.8 | 72 / 210 | 3.00 | 15.6% | 22605 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.2 | 15.6% | 72 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.3% | 35 |
| davidalves.Phoenix 0.54 | 3.5 | 12.7% | 42 |
| florent.XSeries.X2 0.12 | 3.8 | 12.6% | 27 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.3% | 19 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.9% | 8 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.0% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 0 |
| evd.X1 0.01 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 75.6 | 9 / 35 | 4062 |
| 2 | 1 | 63.4 | 77.8 | 11 / 35 | 3572 |
| 3 | 1 | 66.1 | 84.4 | 16 / 35 | 3850 |
| 4 | 2 | 62.9 | 75.9 | 11 / 35 | 3570 |
| 5 | 1 | 62.9 | 74.9 | 14 / 35 | 3553 |
| 6 | 1 | 64.3 | 78.4 | 11 / 35 | 3998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 71% |
| davidalves.Phoenix 0.54 | 21 | 67% |
| florent.XSeries.X2 0.12 | 20 | 65% |
| pedersen.Ugluk 1.1.1 | 17 | 65% |
| stelo.SoJNanoMelee 1.1 | 8 | 100% |
| oog.melee.Corsair 1.0 | 5 | 60% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 41 | 30% | 67 |
| pedersen.Ugluk 1.1.1 | 28 | 20% | 35 |
| davidalves.Phoenix 0.54 | 26 | 19% | 33 |
| florent.XSeries.X2 0.12 | 25 | 18% | 39 |
| oog.melee.Corsair 1.0 | 7 | 5% | 12 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 15 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |
| evd.X1 0.01 | 2 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 3 |

## Melee bench: F25

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.7 | 142 / 210 | 2.10 | 18.8% | 25403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.8% | 142 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.9% | 21 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.6% | 19 |
| jdw.Hurricane 1.4 | 4.0 | 10.9% | 15 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 8.8% | 4 |
| ds.Oo 2.2 | 5.8 | 8.6% | 4 |
| awesomeness.Elite 1.0 | 7.0 | 7.6% | 2 |
| gjr.Cephalosporin 0.1 | 8.2 | 7.1% | 3 |
| adt.Ar2 1.1 | 8.7 | 6.2% | 0 |
| amk.ChumbaMini 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.4 | 24 / 35 | 4560 |
| 2 | 1 | 67.4 | 85.1 | 21 / 35 | 4001 |
| 3 | 1 | 66.6 | 82.5 | 22 / 35 | 4033 |
| 4 | 1 | 69.0 | 89.2 | 26 / 35 | 4114 |
| 5 | 1 | 68.3 | 87.0 | 23 / 35 | 4333 |
| 6 | 1 | 69.3 | 90.2 | 26 / 35 | 4362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 87% |
| voidious.micro.BlitzBat 1.05 | 49 | 90% |
| jdw.Hurricane 1.4 | 23 | 87% |
| ds.Oo 2.2 | 13 | 92% |
| awesomeness.Elite 1.0 | 8 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| gre.svman4.Morfeas 1.4.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 35% | 71 |
| jdw.Hurricane 1.4 | 14 | 21% | 35 |
| voidious.mini.BrokenSword 2.0.3 | 13 | 19% | 48 |
| gjr.Cephalosporin 0.1 | 5 | 7% | 16 |
| ds.Oo 2.2 | 3 | 4% | 14 |
| gre.svman4.Morfeas 1.4.1 | 3 | 4% | 14 |
| awesomeness.Elite 1.0 | 3 | 4% | 6 |
| adt.Ar2 1.1 | 3 | 4% | 5 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |

## Melee bench: F26

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.7 | 123 / 210 | 2.20 | 18.5% | 31605 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.5% | 123 |
| ak.Fermat 2.0 | 2.0 | 14.3% | 31 |
| lrem.Spectre 0.4.4 | 3.3 | 12.7% | 18 |
| shu.nitro.LENIN .T34 | 3.7 | 12.1% | 23 |
| js.PinBall 1.6 | 5.5 | 10.3% | 4 |
| gh.mini.GrubbmOne 1.0 | 5.8 | 9.8% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.3% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 4 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 25 / 35 | 5672 |
| 2 | 1 | 67.7 | 85.4 | 18 / 35 | 5261 |
| 3 | 1 | 68.8 | 87.0 | 20 / 35 | 5424 |
| 4 | 1 | 68.4 | 85.4 | 21 / 35 | 5282 |
| 5 | 1 | 68.3 | 86.0 | 19 / 35 | 5077 |
| 6 | 1 | 67.6 | 84.8 | 20 / 35 | 4889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 49 | 76% |
| ak.Fermat 2.0 | 44 | 86% |
| shu.nitro.LENIN .T34 | 41 | 68% |
| js.PinBall 1.6 | 7 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 100% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |

Hadur died in 88 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 26 | 30% | 60 |
| ak.Fermat 2.0 | 25 | 28% | 56 |
| lrem.Spectre 0.4.4 | 20 | 23% | 47 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 6% | 11 |
| js.PinBall 1.6 | 4 | 5% | 18 |
| gh.mini.GrubbmOne 1.0 | 4 | 5% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 7 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 89.7 | 139 / 210 | 1.93 | 18.8% | 26952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.8% | 139 |
| mk.Alpha 0.2.1 | 2.0 | 13.9% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 3.7 | 10.8% | 6 |
| wee.Gem 1.8.4 | 4.0 | 10.9% | 16 |
| EH.Eagle 1.0.6 | 4.5 | 10.9% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.6% | 1 |
| joe.ADinosaur 1.0 | 7.0 | 7.9% | 2 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.2% | 3 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.8 | 23 / 35 | 4521 |
| 2 | 1 | 69.2 | 92.1 | 23 / 35 | 4833 |
| 3 | 1 | 68.3 | 90.2 | 24 / 35 | 4287 |
| 4 | 1 | 67.5 | 85.7 | 22 / 35 | 4210 |
| 5 | 1 | 68.4 | 90.5 | 22 / 35 | 4603 |
| 6 | 1 | 68.3 | 88.9 | 25 / 35 | 4498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 78 | 78% |
| wee.Gem 1.8.4 | 28 | 75% |
| sheldor.melee.nano.TestMelee 0.1 | 27 | 93% |
| EH.Eagle 1.0.6 | 15 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 36 | 51% | 97 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 15% | 37 |
| wee.Gem 1.8.4 | 9 | 13% | 27 |
| throxbot.ThroxBot 0.1 | 5 | 7% | 11 |
| joe.ADinosaur 1.0 | 4 | 6% | 5 |
| EH.Eagle 1.0.6 | 3 | 4% | 21 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 8 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F28

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 93.0 | 152 / 210 | 1.63 | 19.8% | 28139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.8% | 152 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 28 |
| uji.Antique 1.0 | 3.2 | 11.4% | 15 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.0% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.4% | 10 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.2% | 1 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.8% | 0 |
| stelo.PianistNano 1.2 | 8.5 | 6.0% | 0 |
| matt.advanced.Katana 1.0 | 9.0 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 96.2 | 28 / 35 | 4653 |
| 2 | 1 | 68.4 | 90.5 | 23 / 35 | 4462 |
| 3 | 1 | 68.8 | 89.8 | 24 / 35 | 4413 |
| 4 | 1 | 70.6 | 96.8 | 27 / 35 | 4859 |
| 5 | 1 | 68.6 | 87.9 | 23 / 35 | 4718 |
| 6 | 1 | 71.2 | 96.5 | 27 / 35 | 5034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 95 | 79% |
| uji.Antique 1.0 | 43 | 93% |
| qohnil.blot.BlotBot 3.61 | 24 | 83% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 50% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 46% | 96 |
| pfvicm.Sobieski 7.2.3b | 10 | 17% | 16 |
| uji.Antique 1.0 | 9 | 15% | 48 |
| qohnil.blot.BlotBot 3.61 | 6 | 10% | 29 |
| amk.ChumbaWumba 0.3 | 3 | 5% | 6 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 7 |
| stelo.PianistNano 1.2 | 1 | 2% | 4 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.7 | 113 / 210 | 2.47 | 18.3% | 28640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.3% | 113 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 14.9% | 40 |
| deewiant.Anomaly 0.2 | 2.7 | 14.4% | 34 |
| myl.micro.Troodon 1.10 | 4.0 | 12.7% | 8 |
| jok.PheonixM 0.1.2 | 5.0 | 10.7% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.9% | 1 |
| DBall.Anarchy 0.1 | 7.2 | 6.8% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.7% | 0 |
| jangs.ns51 1.0 | 9.2 | 4.4% | 1 |
| ap.Frederick 1.1 | 9.5 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.8 | 21 / 35 | 5018 |
| 2 | 1 | 69.3 | 86.0 | 20 / 35 | 5003 |
| 3 | 1 | 67.6 | 82.2 | 20 / 35 | 4705 |
| 4 | 1 | 69.0 | 86.0 | 17 / 35 | 4878 |
| 5 | 1 | 67.5 | 83.5 | 17 / 35 | 4335 |
| 6 | 1 | 67.0 | 79.7 | 18 / 35 | 4701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 56 | 82% |
| zyx.mega.YersiniaPestis 3.1 | 50 | 78% |
| myl.micro.Troodon 1.10 | 18 | 94% |
| jok.PheonixM 0.1.2 | 6 | 83% |
| DBall.Anarchy 0.1 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 39 | 40% | 85 |
| zyx.mega.YersiniaPestis 3.1 | 21 | 22% | 58 |
| myl.micro.Troodon 1.10 | 18 | 19% | 35 |
| jok.PheonixM 0.1.2 | 13 | 13% | 19 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 4% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 75.1 | 56 / 210 | 3.24 | 14.8% | 22519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.7 | 14.8% | 56 |
| catcat20.Matcha 0.006 | 2.7 | 13.9% | 50 |
| darkcanuck.B26354 1.06 | 3.3 | 13.2% | 44 |
| stelo.PastFuture 2.3.2 | 3.7 | 13.0% | 19 |
| oog.melee.Capulet 1.2 | 3.7 | 13.0% | 30 |
| ntc.Opposite 1.5 | 7.2 | 7.9% | 1 |
| intruder.PrairieWolf 2.61 | 7.3 | 7.9% | 4 |
| tripphippy.Alice 1.1 | 7.3 | 7.3% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.7% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 78.1 | 12 / 35 | 3760 |
| 2 | 1 | 62.3 | 72.7 | 9 / 35 | 3794 |
| 3 | 1 | 63.3 | 76.2 | 10 / 35 | 3917 |
| 4 | 2 | 61.8 | 75.6 | 7 / 35 | 3521 |
| 5 | 1 | 64.8 | 79.4 | 14 / 35 | 3998 |
| 6 | 4 | 60.5 | 68.9 | 4 / 35 | 3529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 52% |
| darkcanuck.B26354 1.06 | 23 | 22% |
| oog.melee.Capulet 1.2 | 17 | 76% |
| stelo.PastFuture 2.3.2 | 16 | 88% |
| intruder.PrairieWolf 2.61 | 3 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 100% |
| ntc.Opposite 1.5 | 2 | 50% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 28% | 50 |
| catcat20.Matcha 0.006 | 33 | 21% | 50 |
| stelo.PastFuture 2.3.2 | 29 | 19% | 45 |
| oog.melee.Capulet 1.2 | 23 | 15% | 35 |
| ntc.Opposite 1.5 | 10 | 6% | 12 |
| tripphippy.Alice 1.1 | 8 | 5% | 9 |
| intruder.PrairieWolf 2.61 | 4 | 3% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 4 |

## Melee bench: F31

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 76.2 | 64 / 210 | 3.14 | 14.9% | 20041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.4% | 84 |
| hadur117.mini.DeisePL400 0.4 | 2.2 | 14.9% | 64 |
| gh.mini.Griezel 0.2 | 3.0 | 13.6% | 41 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.3% | 10 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.1% | 8 |
| gh.nano.Grofvuil 0.2 | 6.3 | 8.9% | 1 |
| fm.mammillarias 1.3 | 7.2 | 6.7% | 1 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.8% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 72.7 | 8 / 35 | 3331 |
| 2 | 2 | 63.0 | 76.8 | 11 / 35 | 3160 |
| 3 | 2 | 62.3 | 74.0 | 10 / 35 | 3353 |
| 4 | 2 | 63.6 | 79.0 | 11 / 35 | 3344 |
| 5 | 2 | 63.0 | 75.9 | 12 / 35 | 3398 |
| 6 | 2 | 63.7 | 78.7 | 12 / 35 | 3455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 48 | 48% |
| gh.mini.Griezel 0.2 | 29 | 69% |
| d414.nano.Quantum 1.0.0 | 14 | 79% |
| spinnercat.micro.Tyger 0.1 | 9 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |

Hadur died in 146 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 48 | 33% | 68 |
| gh.mini.Griezel 0.2 | 40 | 27% | 60 |
| d414.nano.Quantum 1.0.0 | 21 | 14% | 29 |
| spinnercat.micro.Tyger 0.1 | 14 | 10% | 24 |
| fm.mammillarias 1.3 | 8 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 7 | 5% | 8 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 4 |

## Melee bench: F32

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 92.5 | 147 / 210 | 1.68 | 19.6% | 29400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.6% | 147 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.1% | 33 |
| apc.botM 3.0 | 3.5 | 11.5% | 19 |
| lxx.ConceptA 0.8 | 3.5 | 11.1% | 3 |
| bayen.UbaMicro 1.4 | 5.5 | 8.5% | 4 |
| vjik.UnViolation 1.1 | 5.8 | 8.7% | 2 |
| panzer.Panzer 0.2 | 7.2 | 7.3% | 0 |
| yk.JahMicro 1.0 | 7.7 | 7.2% | 0 |
| conscience.Electron 1.3g | 9.0 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 94.0 | 26 / 35 | 4974 |
| 2 | 1 | 68.4 | 90.5 | 21 / 35 | 4614 |
| 3 | 1 | 68.9 | 92.1 | 22 / 35 | 4949 |
| 4 | 1 | 69.6 | 94.3 | 28 / 35 | 4615 |
| 5 | 1 | 69.7 | 92.1 | 26 / 35 | 5326 |
| 6 | 1 | 69.1 | 92.1 | 24 / 35 | 4922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 75 | 69% |
| apc.botM 3.0 | 29 | 69% |
| lxx.ConceptA 0.8 | 24 | 100% |
| vjik.UnViolation 1.1 | 16 | 94% |
| donjezza.Jezza 1.0 | 14 | 93% |
| yk.JahMicro 1.0 | 12 | 100% |
| panzer.Panzer 0.2 | 6 | 100% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 32 | 51% | 98 |
| apc.botM 3.0 | 15 | 24% | 33 |
| lxx.ConceptA 0.8 | 8 | 13% | 27 |
| donjezza.Jezza 1.0 | 2 | 3% | 11 |
| bayen.UbaMicro 1.4 | 2 | 3% | 7 |
| conscience.Electron 1.3g | 2 | 3% | 4 |
| vjik.UnViolation 1.1 | 1 | 2% | 19 |
| panzer.Panzer 0.2 | 1 | 2% | 3 |
| yk.JahMicro 1.0 | 0 | 0% | 8 |

## Melee bench: F33

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.6 | 142 / 210 | 2.02 | 19.4% | 30269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.4% | 142 |
| maribo.Quester 0.3 | 2.0 | 15.8% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.8% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.4% | 6 |
| labg.Cataclysm 2.05 | 4.7 | 10.6% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 8.7% | 4 |
| baal.nano.N 1.42 | 6.7 | 8.4% | 0 |
| sanja.First 0.1 | 8.5 | 4.9% | 0 |
| zyx.micro.Ant 1.1 | 8.7 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.1 | 21 / 35 | 5101 |
| 2 | 1 | 67.3 | 82.5 | 17 / 35 | 4723 |
| 3 | 1 | 70.5 | 90.8 | 25 / 35 | 5439 |
| 4 | 1 | 69.0 | 86.0 | 22 / 35 | 4956 |
| 5 | 1 | 71.1 | 94.3 | 30 / 35 | 4951 |
| 6 | 1 | 70.9 | 93.0 | 27 / 35 | 5099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 92% |
| maribo.Quester 0.3 | 53 | 85% |
| gre.svman4.Leonidas 1.3.2 | 26 | 92% |
| labg.Cataclysm 2.05 | 20 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 100% |
| baal.nano.N 1.42 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 26 | 38% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 22% | 60 |
| gre.svman4.Leonidas 1.3.2 | 11 | 16% | 28 |
| labg.Cataclysm 2.05 | 9 | 13% | 24 |
| baal.nano.N 1.42 | 4 | 6% | 7 |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 4% | 5 |
| sanja.First 0.1 | 0 | 0% | 2 |
| zyx.micro.Ant 1.1 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.7 | 100 / 210 | 2.10 | 18.1% | 29395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.7 | 18.1% | 100 |
| stelo.Spread 0.9 | 1.8 | 16.9% | 61 |
| kid.Gladiator .7.2 | 2.5 | 16.1% | 40 |
| jcs.Seth 1.8 | 4.3 | 10.9% | 7 |
| tcf.Reach 3 | 5.0 | 10.5% | 2 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.6 | 84.1 | 14 / 35 | 4829 |
| 2 | 1 | 69.5 | 88.9 | 17 / 35 | 4946 |
| 3 | 1 | 69.3 | 92.4 | 17 / 35 | 4918 |
| 4 | 1 | 69.4 | 89.8 | 23 / 35 | 4901 |
| 5 | 1 | 69.6 | 90.2 | 19 / 35 | 5080 |
| 6 | 3 | 66.5 | 81.0 | 10 / 35 | 4721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 78 | 65% |
| kid.Gladiator .7.2 | 52 | 63% |
| jcs.Seth 1.8 | 12 | 83% |
| tcf.Reach 3 | 4 | 75% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 50 | 45% | 100 |
| kid.Gladiator .7.2 | 47 | 42% | 68 |
| jcs.Seth 1.8 | 8 | 7% | 20 |
| tcf.Reach 3 | 3 | 3% | 12 |
| ratosh.Wesco 1.4 | 2 | 2% | 4 |
| cli.Dancer 1.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 80.3 | 38 / 210 | 2.77 | 15.1% | 20460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.2% | 136 |
| hadur117.mini.DeisePL400 0.4 | 2.0 | 15.1% | 38 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.5% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.6% | 7 |
| rz.HawkOnFire 0.1 | 4.7 | 11.6% | 5 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.6% | 0 |
| wit.Chuliath 1.0 | 7.0 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.2 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.4% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 80.6 | 7 / 35 | 3509 |
| 2 | 2 | 62.9 | 78.7 | 4 / 35 | 3487 |
| 3 | 2 | 63.9 | 82.5 | 4 / 35 | 3568 |
| 4 | 2 | 63.0 | 77.8 | 5 / 35 | 3447 |
| 5 | 2 | 63.9 | 81.3 | 10 / 35 | 3199 |
| 6 | 2 | 63.8 | 81.0 | 8 / 35 | 3250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 81 | 12% |
| gh.mini.Gruwel 0.9 | 21 | 43% |
| rz.HawkOnFire 0.1 | 11 | 91% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 60% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 91 | 53% | 105 |
| gh.mini.Gruwel 0.9 | 39 | 23% | 50 |
| rz.HawkOnFire 0.1 | 17 | 10% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 10% | 21 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 2 |

## Melee bench: F36

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.2 | 167 / 210 | 1.70 | 20.6% | 31977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.6% | 167 |
| bzdp.Pansy 2.1 | 2.7 | 12.2% | 11 |
| alpha.RainingFire 1.0 | 2.8 | 12.0% | 12 |
| mz.Cork 0.1 | 5.0 | 10.3% | 6 |
| bvh.micro.Freya 0.3 | 5.0 | 10.4% | 7 |
| bvh.mini.Fenrir 0.39 | 5.0 | 10.2% | 4 |
| m3thos.Eva02 0.7.1 | 6.5 | 8.7% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 5.8% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.3% | 0 |
| sample.MyFirstRobot 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 83.5 | 25 / 35 | 5402 |
| 2 | 1 | 70.6 | 92.4 | 27 / 35 | 5414 |
| 3 | 1 | 71.7 | 94.9 | 28 / 35 | 5563 |
| 4 | 1 | 70.4 | 93.0 | 29 / 35 | 4959 |
| 5 | 1 | 71.1 | 93.7 | 28 / 35 | 5403 |
| 6 | 1 | 71.4 | 95.6 | 30 / 35 | 5236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 100% |
| bvh.micro.Freya 0.3 | 32 | 94% |
| alpha.RainingFire 1.0 | 27 | 89% |
| mz.Cork 0.1 | 24 | 100% |
| bvh.mini.Fenrir 0.39 | 20 | 90% |
| sample.MyFirstRobot 1.0 | 11 | 100% |
| m3thos.Eva02 0.7.1 | 9 | 100% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 28% | 37 |
| bzdp.Pansy 2.1 | 8 | 19% | 58 |
| bvh.mini.Fenrir 0.39 | 8 | 19% | 16 |
| bvh.micro.Freya 0.3 | 7 | 16% | 31 |
| mz.Cork 0.1 | 4 | 9% | 36 |
| m3thos.Eva02 0.7.1 | 3 | 7% | 12 |
| dl.BetterWalls 1.0 | 1 | 2% | 10 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |

## Melee bench: F37

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 92.4 | 170 / 210 | 1.69 | 20.1% | 34364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.1% | 170 |
| germ.TheMind .2 | 2.8 | 10.7% | 5 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.4% | 11 |
| EBBU.Sim2 1.02 | 4.3 | 9.4% | 1 |
| agrach.Dalek 1.0 | 5.7 | 8.8% | 4 |
| lmk.ACPFinal 0.1 | 6.5 | 8.6% | 5 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.6% | 8 |
| mb.Beast 0.1 | 6.8 | 8.2% | 5 |
| skm.Ryubot 1.0 | 8.3 | 7.6% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 7.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.6 | 28 / 35 | 5353 |
| 2 | 1 | 69.0 | 91.4 | 25 / 35 | 5889 |
| 3 | 1 | 69.3 | 92.4 | 27 / 35 | 5793 |
| 4 | 1 | 69.2 | 92.4 | 30 / 35 | 5331 |
| 5 | 1 | 70.0 | 93.7 | 29 / 35 | 5948 |
| 6 | 1 | 70.8 | 95.9 | 31 / 35 | 6050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 95% |
| stelo.UntouchableNano 1.3 | 25 | 88% |
| EBBU.Sim2 1.02 | 24 | 100% |
| agrach.Dalek 1.0 | 20 | 100% |
| mb.Beast 0.1 | 18 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 94% |
| skm.Ryubot 1.0 | 14 | 100% |
| lmk.ACPFinal 0.1 | 13 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 485. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 9 | 23% | 29 |
| EBBU.Sim2 1.02 | 6 | 15% | 29 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 15% | 25 |
| lmk.ACPFinal 0.1 | 6 | 15% | 15 |
| germ.TheMind .2 | 5 | 13% | 38 |
| agrach.Dalek 1.0 | 4 | 10% | 36 |
| mb.Beast 0.1 | 2 | 5% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 5% | 8 |
| skm.Ryubot 1.0 | 0 | 0% | 5 |

## Melee bench: F38

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.3 | 86 / 210 | 2.68 | 16.4% | 24222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.5 | 16.4% | 86 |
| justin.Mallais 14.0 | 1.7 | 16.3% | 70 |
| bvh.mini.Freya 0.55 | 3.2 | 13.0% | 15 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.8% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 11.1% | 4 |
| cs.Wren 1.0 | 5.2 | 11.0% | 8 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.3% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.1% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 72.1 | 7 / 35 | 3256 |
| 2 | 1 | 67.2 | 85.1 | 18 / 35 | 4249 |
| 3 | 2 | 63.9 | 77.5 | 12 / 35 | 3891 |
| 4 | 1 | 66.2 | 80.3 | 15 / 35 | 4438 |
| 5 | 1 | 66.5 | 86.7 | 14 / 35 | 4060 |
| 6 | 1 | 67.6 | 86.3 | 20 / 35 | 4328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 54 | 54% |
| bvh.mini.Freya 0.55 | 21 | 71% |
| bts.mega.Gnarly 1.4 | 17 | 59% |
| cs.Wren 1.0 | 15 | 93% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 100% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 47 | 38% | 85 |
| bvh.mini.Freya 0.55 | 23 | 19% | 32 |
| bts.mega.Gnarly 1.4 | 20 | 16% | 35 |
| cs.Wren 1.0 | 13 | 10% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 9% | 24 |
| kdf.KoulDestroyer 1.0 | 8 | 6% | 12 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.4 | 98 / 210 | 2.40 | 17.5% | 27830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 17.5% | 98 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 32 |
| az.Ololobot 0.2.4 | 3.3 | 12.5% | 49 |
| catcat20.Lambda 0.024 | 3.7 | 11.6% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.5% | 10 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.1% | 3 |
| gimp.GimpBot 0.1 | 7.2 | 7.7% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.7 | 7.3% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 83.8 | 17 / 35 | 4274 |
| 2 | 1 | 67.7 | 87.0 | 19 / 35 | 4991 |
| 3 | 1 | 67.8 | 87.6 | 21 / 35 | 4778 |
| 4 | 1 | 64.8 | 80.0 | 11 / 35 | 4447 |
| 5 | 1 | 65.4 | 82.5 | 13 / 35 | 4491 |
| 6 | 1 | 67.1 | 85.4 | 17 / 35 | 4849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 47 | 74% |
| az.Ololobot 0.2.4 | 42 | 48% |
| catcat20.Lambda 0.024 | 31 | 74% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 87% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 37 | 33% | 75 |
| az.Ololobot 0.2.4 | 35 | 31% | 61 |
| catcat20.Lambda 0.024 | 18 | 16% | 35 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 8% | 12 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 7 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 12 |
| gimp.GimpBot 0.1 | 4 | 4% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |

## Melee bench: F40

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.9 | 131 / 210 | 2.18 | 18.8% | 28799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.8% | 131 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.1% | 34 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.1% | 17 |
| Polkwane.SmashMelee 1.0 | 4.2 | 11.1% | 7 |
| mz.AntiGrav 1.0 | 4.3 | 11.3% | 10 |
| stelo.Randomness 1.0 | 6.5 | 9.2% | 8 |
| alpha.BlackIce 1.0 | 6.7 | 8.6% | 3 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.0% | 0 |
| sample.Corners 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 20 / 35 | 4676 |
| 2 | 1 | 67.9 | 84.4 | 22 / 35 | 4628 |
| 3 | 1 | 69.0 | 89.5 | 21 / 35 | 4827 |
| 4 | 1 | 69.5 | 88.6 | 23 / 35 | 5091 |
| 5 | 1 | 68.5 | 86.3 | 21 / 35 | 4868 |
| 6 | 1 | 69.0 | 86.7 | 24 / 35 | 4709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 56 | 79% |
| kano.gamma.KanoGamma 1.8 | 29 | 72% |
| mz.AntiGrav 1.0 | 22 | 100% |
| Polkwane.SmashMelee 1.0 | 22 | 91% |
| stelo.Randomness 1.0 | 16 | 88% |
| alpha.BlackIce 1.0 | 7 | 86% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 33 | 42% | 64 |
| kano.gamma.KanoGamma 1.8 | 14 | 18% | 43 |
| mz.AntiGrav 1.0 | 9 | 11% | 30 |
| Polkwane.SmashMelee 1.0 | 8 | 10% | 24 |
| stelo.Randomness 1.0 | 7 | 9% | 22 |
| alpha.BlackIce 1.0 | 6 | 8% | 10 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 7 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.1 | 104 / 210 | 2.34 | 17.4% | 24368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 17.4% | 104 |
| eem.EvBotNG v12.8 | 2.0 | 15.4% | 60 |
| ary.Swarm 1.1 | 3.7 | 12.7% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.8% | 17 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.9% | 17 |
| shrub.Silver v048 | 6.2 | 8.7% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.1% | 0 |
| stelo.Mirror 1.1 | 8.8 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.4 | 18 / 35 | 4010 |
| 2 | 1 | 67.6 | 85.4 | 18 / 35 | 4250 |
| 3 | 1 | 67.0 | 87.3 | 16 / 35 | 4147 |
| 4 | 1 | 67.4 | 86.7 | 19 / 35 | 3923 |
| 5 | 1 | 66.7 | 81.6 | 19 / 35 | 4190 |
| 6 | 1 | 66.7 | 85.1 | 14 / 35 | 3848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 62 | 47% |
| ary.Swarm 1.1 | 25 | 96% |
| simonton.nano.MeleeSeed 1.8 | 25 | 96% |
| lessonz.robocode.Oz 0.5.0 | 21 | 95% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| shrub.Silver v048 | 2 | 50% |
| stelo.Mirror 1.1 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 48 | 45% | 77 |
| simonton.nano.MeleeSeed 1.8 | 18 | 17% | 44 |
| ary.Swarm 1.1 | 16 | 15% | 40 |
| lessonz.robocode.Oz 0.5.0 | 12 | 11% | 27 |
| shrub.Silver v048 | 6 | 6% | 7 |
| zyx.nano.Ant 1.1 | 4 | 4% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

## Melee bench: F42

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.5 | 100 / 210 | 2.13 | 18.2% | 29984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.2% | 100 |
| wompi.Wallaby 5.1 | 2.0 | 15.7% | 54 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.4% | 18 |
| ara.Shera 0.88 | 3.5 | 13.6% | 32 |
| amz.NanoClone 1.41 | 5.0 | 8.7% | 2 |
| maribo.IotaCT 1.1 | 6.8 | 6.7% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.8% | 4 |
| stelo.MirrorMicro 1.0 | 7.3 | 6.5% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 88.3 | 17 / 35 | 4864 |
| 2 | 1 | 67.2 | 86.7 | 16 / 35 | 4708 |
| 3 | 1 | 68.9 | 88.6 | 19 / 35 | 5462 |
| 4 | 1 | 68.6 | 87.9 | 20 / 35 | 5015 |
| 5 | 1 | 67.3 | 85.7 | 15 / 35 | 4923 |
| 6 | 1 | 67.9 | 87.6 | 13 / 35 | 5012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 58 | 64% |
| ara.Shera 0.88 | 40 | 63% |
| maribo.mini.MiniQuester 0.1 | 36 | 92% |
| dsw.StaticD 1.0 | 4 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 110 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 39% | 85 |
| ara.Shera 0.88 | 38 | 35% | 60 |
| maribo.mini.MiniQuester 0.1 | 18 | 16% | 48 |
| amz.NanoClone 1.41 | 7 | 6% | 7 |
| dsw.StaticD 1.0 | 2 | 2% | 6 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 1 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.7 | 35 / 210 | 2.92 | 14.9% | 21426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 141 |
| hadur117.mini.DeisePL400 0.4 | 2.2 | 14.9% | 35 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.3% | 22 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.3% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 5.3 | 10.7% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 9.9% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.3% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 75.6 | 6 / 35 | 3328 |
| 2 | 2 | 65.9 | 81.6 | 7 / 35 | 3997 |
| 3 | 2 | 65.8 | 83.8 | 5 / 35 | 3839 |
| 4 | 2 | 64.8 | 80.6 | 5 / 35 | 3642 |
| 5 | 3 | 61.4 | 70.8 | 4 / 35 | 3177 |
| 6 | 2 | 64.9 | 79.7 | 8 / 35 | 3443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 94 | 17% |
| brainfade.melee.Dusk 0.44 | 13 | 77% |
| dummy.micro.Sparrow 2.5 | 6 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 50% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 99 | 56% | 115 |
| brainfade.melee.Dusk 0.44 | 24 | 14% | 33 |
| dummy.micro.Sparrow 2.5 | 22 | 13% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 9% | 18 |
| Krabb.akim2.Akim2 1.1b | 7 | 4% | 8 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.3 | 121 / 210 | 2.14 | 19.0% | 30900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.0% | 121 |
| stelo.Liblix 0.3.1 | 2.5 | 15.2% | 44 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.6% | 31 |
| wompi.Quokka 1.6 | 4.3 | 10.5% | 1 |
| jwirde.Gort 2.0 | 5.7 | 8.7% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 8.8% | 2 |
| disan.Chair 2.2.0 | 6.5 | 7.9% | 5 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.7% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.6% | 1 |
| sample.Crazy 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.3 | 20 / 35 | 5467 |
| 2 | 1 | 68.9 | 87.9 | 21 / 35 | 4976 |
| 3 | 1 | 67.8 | 85.1 | 17 / 35 | 4867 |
| 4 | 1 | 68.1 | 83.8 | 19 / 35 | 5024 |
| 5 | 1 | 71.4 | 95.2 | 25 / 35 | 5584 |
| 6 | 1 | 68.3 | 83.5 | 19 / 35 | 4982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 85 | 75% |
| tzu.TheArtOfWar 1.2 | 45 | 67% |
| wompi.Quokka 1.6 | 17 | 94% |
| disan.Chair 2.2.0 | 4 | 100% |
| jwirde.Gort 2.0 | 4 | 75% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 38% | 97 |
| tzu.TheArtOfWar 1.2 | 27 | 30% | 63 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 10% | 10 |
| disan.Chair 2.2.0 | 5 | 6% | 12 |
| jwirde.Gort 2.0 | 5 | 6% | 11 |
| wompi.Quokka 1.6 | 4 | 4% | 11 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 3 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 3 |

## Melee bench: F45

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.3 | 100 / 210 | 1.88 | 20.3% | 36158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.3% | 100 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.0% | 100 |
| jje.BagPuss 1.2 | 2.8 | 11.9% | 1 |
| myl.nano.Graviton 1.10 | 4.2 | 10.3% | 4 |
| sul.Lunar 1.1 | 5.0 | 9.5% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.3% | 0 |
| hvilela.HVilela 0.9 | 7.2 | 8.0% | 0 |
| fm.claire 1.7 | 7.2 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.2 | 6.1% | 3 |
| abud.ThirdRobo 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.2 | 16 / 35 | 5854 |
| 2 | 1 | 71.0 | 93.0 | 19 / 35 | 6033 |
| 3 | 1 | 71.8 | 95.2 | 20 / 35 | 6215 |
| 4 | 1 | 72.0 | 94.6 | 20 / 35 | 6807 |
| 5 | 1 | 68.2 | 84.8 | 12 / 35 | 5861 |
| 6 | 1 | 67.7 | 83.8 | 13 / 35 | 5388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 127 | 30% |
| jje.BagPuss 1.2 | 15 | 100% |
| sul.Lunar 1.1 | 15 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 13 | 100% |
| myl.nano.Graviton 1.10 | 13 | 77% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 4 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 2536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 89 | 81% | 0 |
| myl.nano.Graviton 1.10 | 8 | 7% | 48 |
| fm.claire 1.7 | 5 | 5% | 15 |
| jje.BagPuss 1.2 | 3 | 3% | 50 |
| sul.Lunar 1.1 | 2 | 2% | 56 |
| pez.mini.ChironexFleckeri 0.5 | 1 | 1% | 17 |
| hvilela.HVilela 0.9 | 1 | 1% | 8 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |
| wit.Deep7 2.0 | 0 | 0% | 9 |

## Melee bench: F46

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.2 | 69 / 210 | 2.42 | 16.6% | 25226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.8 | 16.6% | 69 |
| kc.mini.Mirage 0.2 | 1.8 | 16.9% | 63 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.3% | 65 |
| mz.MicroSheep 1.0 | 4.2 | 10.8% | 2 |
| cx.Princess 1.0 | 4.8 | 10.3% | 11 |
| sadoner.killer 0.2 | 6.2 | 8.0% | 0 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.6% | 1 |
| kurios.DOSexe .9a | 8.7 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.8 | 10 / 35 | 4322 |
| 2 | 1 | 67.0 | 86.7 | 15 / 35 | 4172 |
| 3 | 3 | 64.3 | 79.0 | 10 / 35 | 3987 |
| 4 | 2 | 65.3 | 82.9 | 8 / 35 | 4157 |
| 5 | 3 | 65.7 | 82.5 | 11 / 35 | 4051 |
| 6 | 1 | 68.1 | 89.2 | 15 / 35 | 4537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 61 | 51% |
| rsalesc.melee.Medina 0.4.5 | 47 | 47% |
| cx.Princess 1.0 | 16 | 63% |
| mz.MicroSheep 1.0 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 0% |

Hadur died in 142 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 66 | 46% | 102 |
| rsalesc.melee.Medina 0.4.5 | 48 | 34% | 69 |
| cx.Princess 1.0 | 13 | 9% | 17 |
| mz.MicroSheep 1.0 | 10 | 7% | 15 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 3 |
| sadoner.killer 0.2 | 1 | 1% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

