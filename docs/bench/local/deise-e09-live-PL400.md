# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 87.7 | 52 / 210 | 2.11 | 17.1% | 28604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 142 |
| hadur117.mini.DeisePL400 0.4 | 2.0 | 17.1% | 52 |
| sgp.JollyNinja 3.53 | 3.3 | 11.6% | 7 |
| mz.MicroGodMelee 1 | 4.0 | 10.8% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.6% | 6 |
| lorneswork.Predator 1.0 | 6.0 | 9.2% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.3% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 85.4 | 4 / 35 | 4972 |
| 2 | 2 | 67.2 | 88.9 | 8 / 35 | 4681 |
| 3 | 2 | 67.0 | 89.2 | 11 / 35 | 4164 |
| 4 | 2 | 67.2 | 85.1 | 11 / 35 | 5045 |
| 5 | 2 | 67.1 | 88.9 | 6 / 35 | 4834 |
| 6 | 2 | 67.9 | 88.6 | 12 / 35 | 4908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 132 | 14% |
| sgp.JollyNinja 3.53 | 18 | 89% |
| mz.MicroGodMelee 1 | 11 | 91% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| lorneswork.Predator 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 1323. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 125 | 79% | 147 |
| sgp.JollyNinja 3.53 | 12 | 8% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 7% | 14 |
| mz.MicroGodMelee 1 | 5 | 3% | 18 |
| lorneswork.Predator 1.0 | 4 | 3% | 6 |
| adt.Ar2 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.2 | 120 / 210 | 2.24 | 18.6% | 29799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.6% | 120 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.2% | 36 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.7% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 11.8% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.0% | 9 |
| Noran.BitchingElk 0.054 | 6.2 | 8.2% | 10 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.6% | 0 |
| sch.Simone 0.3d | 8.0 | 6.9% | 6 |
| stelo.PatternRobot 1.0 | 8.2 | 6.9% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 82.2 | 16 / 35 | 4804 |
| 2 | 1 | 69.6 | 89.5 | 23 / 35 | 5374 |
| 3 | 1 | 69.3 | 91.4 | 23 / 35 | 4992 |
| 4 | 1 | 68.0 | 84.4 | 20 / 35 | 5189 |
| 5 | 1 | 67.8 | 85.7 | 20 / 35 | 4944 |
| 6 | 1 | 67.1 | 83.8 | 18 / 35 | 4496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 80% |
| pulsar.PulsarMax 0.8.9 | 36 | 64% |
| Noran.BitchingElk 0.054 | 17 | 76% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| stelo.PatternRobot 1.0 | 8 | 100% |
| sch.Simone 0.3d | 8 | 63% |
| fnc.bandit.Bandit 5.2.0 | 6 | 100% |
| fullsail.SweetTea 1.1 | 6 | 83% |

Hadur died in 90 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 23 | 26% | 57 |
| pulsar.PulsarMax 0.8.9 | 23 | 26% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 16% | 26 |
| Noran.BitchingElk 0.054 | 7 | 8% | 24 |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 7% | 20 |
| stelo.PatternRobot 1.0 | 6 | 7% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6 | 7% | 9 |
| sch.Simone 0.3d | 4 | 4% | 8 |
| fullsail.SweetTea 1.1 | 1 | 1% | 7 |

## Melee bench: F03

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.1 | 160 / 210 | 1.62 | 20.1% | 34647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.1% | 160 |
| kawigi.nano.Lib 1.0 | 2.3 | 14.0% | 13 |
| radnor.DoctorBob 1.42 | 2.7 | 13.5% | 12 |
| vuen.Cake 2.51 | 4.0 | 12.4% | 24 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 0 |
| adt.Ar1 2.1 | 6.5 | 7.5% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.1 | 28 / 35 | 6126 |
| 2 | 1 | 70.7 | 93.7 | 25 / 35 | 6100 |
| 3 | 1 | 69.7 | 91.4 | 27 / 35 | 5301 |
| 4 | 1 | 70.1 | 94.0 | 26 / 35 | 5384 |
| 5 | 1 | 71.0 | 94.9 | 28 / 35 | 5915 |
| 6 | 1 | 70.0 | 93.3 | 26 / 35 | 5821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 77 | 96% |
| vuen.Cake 2.51 | 51 | 76% |
| radnor.DoctorBob 1.42 | 33 | 97% |
| ghent.ArthurPanzergon 1.0.0 | 5 | 100% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 17 | 33% | 62 |
| kawigi.nano.Lib 1.0 | 16 | 31% | 82 |
| radnor.DoctorBob 1.42 | 9 | 18% | 38 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 6% | 3 |
| adt.Ar1 2.1 | 2 | 4% | 5 |
| urdos.URDOS 1.3 | 2 | 4% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 4 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 4 |

## Melee bench: F04

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.8 | 38 / 210 | 2.10 | 17.8% | 33615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 167 |
| hadur117.mini.DeisePL400 0.4 | 2.0 | 17.8% | 38 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.6% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 10.2% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 0 |
| css.Delitioner 0.11 | 6.7 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.6% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.5 | 90.5 | 9 / 35 | 5849 |
| 2 | 2 | 67.5 | 85.1 | 7 / 35 | 5270 |
| 3 | 2 | 69.6 | 90.2 | 7 / 35 | 6167 |
| 4 | 2 | 67.7 | 86.3 | 2 / 35 | 5669 |
| 5 | 2 | 67.4 | 87.3 | 3 / 35 | 4988 |
| 6 | 2 | 68.7 | 87.6 | 10 / 35 | 5672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 166 | 16% |
| apc.LeeroyJenkins2 1.0 | 7 | 71% |
| TNT.TNT 0.99.1 | 4 | 50% |
| spin.Bugstard 0.012b | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 1564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 155 | 90% | 180 |
| apc.LeeroyJenkins2 1.0 | 8 | 5% | 14 |
| TNT.TNT 0.99.1 | 4 | 2% | 6 |
| rampancy.Durandal 2.1d | 2 | 1% | 3 |
| josago.Jorgito 0.16 | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| css.Delitioner 0.11 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.0 | 32 / 210 | 3.25 | 14.0% | 20206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 17.9% | 102 |
| justin.DemonicRage 3.4 | 1.8 | 17.3% | 56 |
| hadur117.mini.DeisePL400 0.4 | 3.3 | 14.0% | 32 |
| wompi.Numbat 2.1 | 3.7 | 13.1% | 13 |
| ms.Ares 0.19 | 5.2 | 9.4% | 3 |
| axeBots.HataMoto 3.09 | 5.8 | 8.6% | 7 |
| supersample.SuperBoxBot 1.0 | 7.0 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 74.6 | 6 / 35 | 3645 |
| 2 | 3 | 61.4 | 72.1 | 5 / 35 | 3269 |
| 3 | 3 | 63.7 | 80.6 | 6 / 35 | 3682 |
| 4 | 3 | 62.4 | 77.1 | 5 / 35 | 3323 |
| 5 | 4 | 61.3 | 71.4 | 6 / 35 | 3249 |
| 6 | 4 | 60.5 | 74.0 | 4 / 35 | 3038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 35 | 51% |
| cb.fire.Firestarter 2.0f | 34 | 18% |
| wompi.Numbat 2.1 | 6 | 100% |
| ms.Ares 0.19 | 3 | 33% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 69 | 38% | 78 |
| justin.DemonicRage 3.4 | 65 | 36% | 81 |
| wompi.Numbat 2.1 | 16 | 9% | 21 |
| ms.Ares 0.19 | 15 | 8% | 17 |
| axeBots.HataMoto 3.09 | 8 | 4% | 8 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.9 | 115 / 210 | 2.27 | 18.0% | 27416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.0% | 115 |
| jekl.StoneGhost 0.7 | 2.2 | 14.8% | 33 |
| origin.SleepSiphon 1.7b | 3.0 | 13.6% | 40 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 16 |
| mld.Wisdom 1.0 | 5.0 | 9.9% | 0 |
| gg.Wolverine 2.0 | 6.2 | 8.7% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.1% | 5 |
| spinnercat.Omen 1.0 | 8.2 | 6.4% | 0 |
| DBall.NUKE 0.1 | 8.7 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.9 | 23 / 35 | 4799 |
| 2 | 1 | 67.2 | 84.1 | 20 / 35 | 4575 |
| 3 | 1 | 67.9 | 89.5 | 17 / 35 | 4479 |
| 4 | 1 | 67.4 | 85.1 | 21 / 35 | 4514 |
| 5 | 1 | 66.6 | 84.4 | 18 / 35 | 4253 |
| 6 | 1 | 67.7 | 84.1 | 16 / 35 | 4796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 43 | 63% |
| jekl.StoneGhost 0.7 | 41 | 80% |
| pe.minimelee.SandboxMiniMelee 1.1 | 38 | 89% |
| gg.Wolverine 2.0 | 11 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 34 | 35% | 69 |
| origin.SleepSiphon 1.7b | 28 | 29% | 62 |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 20% | 49 |
| mld.Wisdom 1.0 | 7 | 7% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 8 |
| gg.Wolverine 2.0 | 2 | 2% | 7 |
| DBall.NUKE 0.1 | 2 | 2% | 2 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.9 | 129 / 210 | 1.55 | 20.0% | 34252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.0% | 129 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.5% | 44 |
| rtk.Tachikoma 1.0 | 2.8 | 16.1% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.1% | 2 |
| franzor.Lizt 1.3.1 | 4.8 | 10.4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.6% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.2 | 25 / 35 | 5755 |
| 2 | 1 | 71.9 | 93.7 | 23 / 35 | 5709 |
| 3 | 1 | 71.7 | 94.9 | 21 / 35 | 6005 |
| 4 | 1 | 70.3 | 90.5 | 19 / 35 | 5513 |
| 5 | 1 | 70.8 | 92.4 | 17 / 35 | 5794 |
| 6 | 1 | 71.8 | 95.6 | 24 / 35 | 5476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 90 | 78% |
| rsalesc.melee.Monk 0.3.6c | 60 | 35% |
| oog.melee.CapuletDroid 1.1 | 30 | 97% |
| franzor.Lizt 1.3.1 | 15 | 53% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 43 | 53% | 79 |
| rtk.Tachikoma 1.0 | 25 | 31% | 92 |
| franzor.Lizt 1.3.1 | 8 | 10% | 0 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 32 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.3 | 132 / 210 | 1.78 | 19.4% | 29725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.4% | 132 |
| shrub.Vapour v159 | 2.7 | 12.2% | 17 |
| tm.Yuugao 1.0 | 2.8 | 12.6% | 37 |
| Krabb.sliNk.Garm 0.9u | 3.5 | 11.3% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.8% | 6 |
| m3thos.Eva00 1.1 | 6.3 | 8.5% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 7.7% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.3% | 0 |
| SHAM.WOW 1.4 | 9.0 | 6.0% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 92.1 | 20 / 35 | 5050 |
| 2 | 1 | 69.5 | 93.7 | 24 / 35 | 4974 |
| 3 | 1 | 69.2 | 92.1 | 23 / 35 | 4817 |
| 4 | 1 | 67.0 | 83.8 | 19 / 35 | 4725 |
| 5 | 1 | 69.9 | 94.0 | 24 / 35 | 5063 |
| 6 | 1 | 69.5 | 92.4 | 22 / 35 | 5096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 53 | 62% |
| shrub.Vapour v159 | 41 | 76% |
| Krabb.sliNk.Garm 0.9u | 33 | 82% |
| com.spp.robocode.MostlyHarmless 010 | 22 | 91% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 90% |
| SHAM.WOW 1.4 | 4 | 100% |
| m3thos.Eva00 1.1 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 29 | 37% | 67 |
| Krabb.sliNk.Garm 0.9u | 18 | 23% | 42 |
| shrub.Vapour v159 | 18 | 23% | 42 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 9% | 18 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 6% | 27 |
| m3thos.Eva00 1.1 | 1 | 1% | 8 |
| SHAM.WOW 1.4 | 1 | 1% | 6 |

## Melee bench: F09

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 75.2 | 70 / 210 | 3.23 | 15.5% | 23908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.5% | 89 |
| hadur117.mini.DeisePL400 0.4 | 2.0 | 15.5% | 70 |
| kc.micro.Figment 1.0 | 2.7 | 14.5% | 29 |
| yagami.Tidus 0.11 | 4.5 | 10.7% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.4% | 12 |
| mc2.enemy.Original 0.9 | 5.7 | 9.1% | 8 |
| dft.Calliope 5.6 | 7.0 | 7.2% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.2% | 1 |
| rdm.Dueler 0.4x | 9.5 | 4.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 75.9 | 11 / 35 | 3879 |
| 2 | 1 | 63.5 | 73.0 | 14 / 35 | 4064 |
| 3 | 3 | 61.9 | 68.9 | 7 / 35 | 4021 |
| 4 | 3 | 62.6 | 74.3 | 7 / 35 | 3696 |
| 5 | 2 | 64.8 | 76.8 | 15 / 35 | 3996 |
| 6 | 1 | 65.9 | 82.2 | 16 / 35 | 4252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 46 | 37% |
| kc.micro.Figment 1.0 | 35 | 91% |
| yagami.Tidus 0.11 | 8 | 100% |
| mc2.enemy.Original 0.9 | 7 | 86% |
| pedersen.Grishnakh 1.0 | 5 | 60% |
| dft.Calliope 5.6 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 57 | 41% | 76 |
| kc.micro.Figment 1.0 | 28 | 20% | 61 |
| yagami.Tidus 0.11 | 16 | 11% | 23 |
| pedersen.Grishnakh 1.0 | 16 | 11% | 16 |
| mc2.enemy.Original 0.9 | 11 | 8% | 17 |
| robar.nano.Assertive_Melee 0.2 | 7 | 5% | 8 |
| dft.Calliope 5.6 | 2 | 1% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 4 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 96.3 | 175 / 210 | 1.33 | 20.6% | 32512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.6% | 175 |
| DTF.Kludgy 1.2b | 2.7 | 13.2% | 15 |
| ne.Chimera 1.2 | 2.8 | 12.5% | 4 |
| ejb.Polaris 1.0.1 | 3.8 | 11.9% | 9 |
| vStar.RAFzilla 2.15 | 5.2 | 10.3% | 2 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.1% | 4 |
| sam.Samspin 1.0 | 7.3 | 6.2% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.9% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.0 | 27 / 35 | 5939 |
| 2 | 1 | 70.3 | 96.5 | 29 / 35 | 5064 |
| 3 | 1 | 71.5 | 98.4 | 30 / 35 | 5394 |
| 4 | 1 | 71.3 | 97.5 | 32 / 35 | 5232 |
| 5 | 1 | 70.8 | 95.2 | 28 / 35 | 5356 |
| 6 | 1 | 71.1 | 96.2 | 29 / 35 | 5527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 61 | 84% |
| ejb.Polaris 1.0.1 | 54 | 91% |
| ne.Chimera 1.2 | 31 | 87% |
| vStar.RAFzilla 2.15 | 25 | 100% |
| tvv.micro.Antares 1.1.1 | 18 | 89% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 46% | 60 |
| ejb.Polaris 1.0.1 | 7 | 20% | 56 |
| ne.Chimera 1.2 | 5 | 14% | 27 |
| vStar.RAFzilla 2.15 | 3 | 9% | 19 |
| tvv.micro.Antares 1.1.1 | 3 | 9% | 17 |
| sam.Samspin 1.0 | 1 | 3% | 7 |
| kurios.DOSexe .9b | 0 | 0% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 5 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.8 | 96 / 210 | 2.55 | 17.2% | 26018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 17.2% | 96 |
| rz.Aleph 0.34 | 2.0 | 15.9% | 62 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.4% | 22 |
| djc.DynaBot 0.1.1 | 4.2 | 10.9% | 9 |
| br2.MobyDickBot 1.6 | 5.5 | 9.2% | 10 |
| rdt199.Warlord 0.73 | 5.5 | 9.1% | 8 |
| uji.YellohFellah 1.0 | 7.3 | 7.5% | 5 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 78.4 | 13 / 35 | 4083 |
| 2 | 1 | 66.7 | 86.3 | 14 / 35 | 4292 |
| 3 | 1 | 67.0 | 86.3 | 18 / 35 | 4608 |
| 4 | 1 | 66.2 | 81.3 | 16 / 35 | 4512 |
| 5 | 1 | 66.4 | 82.2 | 19 / 35 | 4409 |
| 6 | 1 | 65.8 | 82.2 | 16 / 35 | 4114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 63% |
| djc.DynaBot 0.1.1 | 26 | 85% |
| cx.mini.Nimrod 0.55 | 19 | 74% |
| rdt199.Warlord 0.73 | 14 | 86% |
| br2.MobyDickBot 1.6 | 10 | 70% |
| uji.YellohFellah 1.0 | 8 | 63% |

Hadur died in 115 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 51 | 44% | 89 |
| cx.mini.Nimrod 0.55 | 25 | 22% | 37 |
| rdt199.Warlord 0.73 | 11 | 10% | 22 |
| KiraNL.Chupacabra 0.4 | 7 | 6% | 8 |
| br2.MobyDickBot 1.6 | 6 | 5% | 17 |
| djc.DynaBot 0.1.1 | 5 | 4% | 22 |
| uji.YellohFellah 1.0 | 5 | 4% | 11 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.7 | 120 / 210 | 2.38 | 17.6% | 23658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 17.6% | 120 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.0% | 28 |
| nat.PallasHawk 1.0 | 3.3 | 12.8% | 28 |
| darkcanuck.Leon 1.01 | 3.7 | 12.5% | 23 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.3% | 10 |
| jrm.Test0 1.0 | 6.5 | 8.0% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.1% | 0 |
| jp.Perpy 16.0 | 7.5 | 6.8% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.2 | 27 / 35 | 4265 |
| 2 | 1 | 65.6 | 82.9 | 16 / 35 | 3687 |
| 3 | 1 | 67.6 | 87.6 | 21 / 35 | 3935 |
| 4 | 1 | 65.8 | 82.9 | 17 / 35 | 3889 |
| 5 | 1 | 65.8 | 82.9 | 21 / 35 | 3702 |
| 6 | 1 | 66.7 | 81.9 | 18 / 35 | 4180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 46 | 83% |
| nat.PallasHawk 1.0 | 43 | 70% |
| darkcanuck.Leon 1.01 | 40 | 83% |
| brainfade.melee.Genghis 0.36 | 12 | 92% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| jrm.Test0 1.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 21 | 23% | 53 |
| bts.wiki.RipCurl 0.9b | 20 | 22% | 49 |
| darkcanuck.Leon 1.01 | 18 | 20% | 53 |
| brainfade.melee.Genghis 0.36 | 14 | 15% | 24 |
| cs.sheldor.Talon 1.1 | 8 | 9% | 14 |
| jrm.Test0 1.0 | 5 | 5% | 7 |
| jp.Perpy 16.0 | 4 | 4% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.9 | 86 / 210 | 2.27 | 17.0% | 26193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.5 | 17.0% | 86 |
| mn.Combat 3.25.0 | 2.0 | 16.6% | 81 |
| ags.Glacier 0.2.11 | 2.5 | 16.2% | 26 |
| shinh.Entangled 0.3 | 4.2 | 11.9% | 14 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.1% | 3 |
| apc.Colossus2 0.17 | 6.0 | 7.5% | 0 |
| stelo.Wang 1.0 | 7.2 | 6.5% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 88.3 | 13 / 35 | 4410 |
| 2 | 1 | 67.3 | 87.0 | 17 / 35 | 4240 |
| 3 | 1 | 67.6 | 87.9 | 18 / 35 | 4316 |
| 4 | 3 | 64.7 | 80.3 | 10 / 35 | 4021 |
| 5 | 2 | 67.5 | 85.4 | 15 / 35 | 4513 |
| 6 | 1 | 67.4 | 86.7 | 13 / 35 | 4693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 66 | 39% |
| ags.Glacier 0.2.11 | 58 | 79% |
| shinh.Entangled 0.3 | 9 | 67% |
| gh.micro.Gruweltje 0.7 | 7 | 86% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 57 | 46% | 84 |
| ags.Glacier 0.2.11 | 34 | 27% | 73 |
| shinh.Entangled 0.3 | 20 | 16% | 27 |
| gh.micro.Gruweltje 0.7 | 7 | 6% | 17 |
| stelo.Wang 1.0 | 3 | 2% | 5 |
| apc.Colossus2 0.17 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 92.6 | 154 / 210 | 1.66 | 19.9% | 31689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.9% | 154 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.0% | 25 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 22 |
| co.edu.usb.rc.LidisTron 1.0 | 4.3 | 10.1% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.4% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.3% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.7% | 5 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.5 | 21 / 35 | 4896 |
| 2 | 1 | 71.5 | 95.9 | 28 / 35 | 5525 |
| 3 | 1 | 69.8 | 90.8 | 24 / 35 | 5319 |
| 4 | 1 | 71.7 | 97.5 | 30 / 35 | 5620 |
| 5 | 1 | 69.9 | 88.9 | 26 / 35 | 5319 |
| 6 | 1 | 70.1 | 93.3 | 25 / 35 | 5010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 100 | 91% |
| catcat20.shape.Theta 0.018 | 44 | 77% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 20 | 36% | 50 |
| simonton.micro.Sprout 1.1.3 | 19 | 34% | 108 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 11% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 7% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 7% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 4 |
| sample.TrackFire 1.0 | 1 | 2% | 1 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.2 | 115 / 210 | 2.51 | 18.3% | 31334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.3% | 115 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.4% | 18 |
| emp.Yngwie 1.11 | 3.2 | 12.9% | 35 |
| mld.DustBunny 3.8 | 4.0 | 12.0% | 10 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.8% | 10 |
| kawigi.robot.Girl 1.2 | 5.3 | 10.2% | 20 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.4% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.7 | 21 / 35 | 5454 |
| 2 | 1 | 67.0 | 81.0 | 18 / 35 | 5134 |
| 3 | 1 | 67.8 | 82.9 | 18 / 35 | 5258 |
| 4 | 1 | 69.5 | 86.3 | 23 / 35 | 5657 |
| 5 | 1 | 67.2 | 79.4 | 18 / 35 | 5138 |
| 6 | 1 | 67.2 | 82.9 | 17 / 35 | 4693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 49 | 78% |
| kawigi.micro.Shiz 1.1 | 33 | 97% |
| kawigi.robot.Girl 1.2 | 19 | 79% |
| cb.nano.Insomnia 1.0 | 17 | 82% |
| mld.DustBunny 3.8 | 12 | 92% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 31 | 33% | 78 |
| cb.nano.Insomnia 1.0 | 15 | 16% | 18 |
| mld.DustBunny 3.8 | 14 | 15% | 34 |
| kawigi.micro.Shiz 1.1 | 13 | 14% | 41 |
| kawigi.robot.Girl 1.2 | 10 | 11% | 15 |
| lambdaxy.TBot 0.1 | 6 | 6% | 7 |
| Grystrion.TrackerWO 1.0 | 4 | 4% | 4 |
| divineomega.TrialBot 0.003 | 2 | 2% | 12 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.6 | 102 / 210 | 2.21 | 18.7% | 32552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.7% | 102 |
| gh.Griezel 0.5.2 | 2.0 | 16.5% | 68 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.3% | 22 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.3% | 2 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.0% | 7 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.8% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.1% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 4.8% | 0 |
| asd.Cthulhu 1.3 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.7 | 19 / 35 | 5481 |
| 2 | 1 | 67.8 | 85.1 | 15 / 35 | 5007 |
| 3 | 1 | 67.7 | 83.5 | 14 / 35 | 5163 |
| 4 | 1 | 67.7 | 84.1 | 14 / 35 | 5383 |
| 5 | 1 | 70.0 | 91.1 | 18 / 35 | 5580 |
| 6 | 1 | 70.3 | 88.9 | 22 / 35 | 5938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 86 | 53% |
| techdude.forest.FlamingForest 1.1 | 27 | 59% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 95% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 4 | 50% |
| tvv.nano.Polaris 1.2 | 4 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1312. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 57 | 51% | 105 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 13% | 35 |
| bvh.fnr.Fenrir 0.36l | 13 | 12% | 15 |
| techdude.forest.FlamingForest 1.1 | 12 | 11% | 26 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 10 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 8 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 9 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
3 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.4 | 113 / 210 | 2.50 | 17.9% | 30106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 17.9% | 113 |
| cx.BlestPain 1.41 | 3.0 | 12.6% | 38 |
| et.Predator 1.8 | 3.2 | 12.9% | 19 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.4% | 22 |
| nic.Nicator 2.4 | 4.3 | 11.1% | 10 |
| ahf.NanoAndrew .4 | 6.0 | 9.9% | 5 |
| maribo.melee.BMV 0.1 | 6.8 | 8.8% | 1 |
| tex.Longbot 0.4 | 8.3 | 5.9% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.5% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.7 | 22 / 35 | 5017 |
| 2 | 1 | 67.4 | 84.4 | 17 / 35 | 4979 |
| 3 | 1 | 66.5 | 79.4 | 19 / 35 | 5079 |
| 4 | 1 | 66.2 | 79.7 | 17 / 35 | 4833 |
| 5 | 1 | 67.5 | 84.4 | 18 / 35 | 4903 |
| 6 | 1 | 68.8 | 86.7 | 20 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 42 | 76% |
| oog.melee.Mercutio 1.0 | 38 | 79% |
| cx.BlestPain 1.41 | 26 | 50% |
| nic.Nicator 2.4 | 26 | 96% |
| ahf.NanoAndrew .4 | 9 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 28 | 29% | 42 |
| et.Predator 1.8 | 16 | 16% | 55 |
| oog.melee.Mercutio 1.0 | 16 | 16% | 44 |
| nic.Nicator 2.4 | 13 | 13% | 31 |
| ahf.NanoAndrew .4 | 12 | 12% | 19 |
| maribo.melee.BMV 0.1 | 5 | 5% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 4% | 8 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| goblin.Bender 2.4 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.5 | 150 / 210 | 1.77 | 19.4% | 27577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.4% | 150 |
| morbid.MorbidPriest 1.0 | 2.0 | 12.9% | 23 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.4% | 12 |
| ratosh.Nobo 0.21 | 4.7 | 10.3% | 2 |
| uji.DBH 1.1 | 4.8 | 10.3% | 7 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.1% | 4 |
| sigterm.Sigterm 1.0 | 7.5 | 7.5% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.2% | 0 |
| stelo.WangRobot 1.0 | 8.7 | 5.8% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.9 | 24 / 35 | 4286 |
| 2 | 1 | 69.5 | 91.7 | 27 / 35 | 4658 |
| 3 | 1 | 68.8 | 90.5 | 24 / 35 | 4553 |
| 4 | 1 | 67.7 | 87.3 | 20 / 35 | 4647 |
| 5 | 1 | 70.0 | 96.8 | 26 / 35 | 4571 |
| 6 | 1 | 70.4 | 94.6 | 29 / 35 | 4862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 60 | 88% |
| agd.Mooserwirt2 2.7 | 33 | 82% |
| uji.DBH 1.1 | 21 | 86% |
| ratosh.Nobo 0.21 | 18 | 100% |
| sigterm.Sigterm 1.0 | 15 | 73% |
| spinnercat.Robovirus 2.718 | 15 | 93% |
| stelo.WangRobot 1.0 | 8 | 63% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 19 | 32% | 67 |
| agd.Mooserwirt2 2.7 | 14 | 23% | 46 |
| sigterm.Sigterm 1.0 | 7 | 12% | 16 |
| uji.DBH 1.1 | 6 | 10% | 21 |
| ratosh.Nobo 0.21 | 5 | 8% | 16 |
| spinnercat.Robovirus 2.718 | 4 | 7% | 13 |
| stelo.WangRobot 1.0 | 4 | 7% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 2% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 0 | 0% | 12 |

## Melee bench: F19

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.1 | 161 / 210 | 1.53 | 20.8% | 33700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.8% | 161 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.0% | 19 |
| mld.Infinity 2.2 | 2.8 | 13.9% | 22 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.0% | 0 |
| erdnis.Rover 0.3 | 5.0 | 10.1% | 2 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.2% | 3 |
| pac.ABC 2.1 | 7.2 | 7.2% | 2 |
| mbh.Mbh 0.1 | 8.0 | 6.7% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.7% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.7 | 26 / 35 | 5699 |
| 2 | 1 | 71.9 | 95.2 | 25 / 35 | 5563 |
| 3 | 1 | 72.1 | 95.6 | 30 / 35 | 5472 |
| 4 | 1 | 72.4 | 95.6 | 29 / 35 | 6162 |
| 5 | 1 | 71.2 | 92.4 | 27 / 35 | 5456 |
| 6 | 1 | 70.4 | 92.1 | 24 / 35 | 5348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 85 | 89% |
| mld.Infinity 2.2 | 56 | 88% |
| krillr.mini.JointStrike 2.0.0 | 14 | 100% |
| erdnis.Rover 0.3 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| pac.ABC 2.1 | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 1089. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 20 | 40% | 107 |
| mld.Infinity 2.2 | 14 | 28% | 31 |
| krillr.mini.JointStrike 2.0.0 | 6 | 12% | 25 |
| erdnis.Rover 0.3 | 5 | 10% | 14 |
| patson.PatsonTestBot 1.0 | 2 | 4% | 8 |
| pbg.R2D2 1.0 | 2 | 4% | 7 |
| mbh.Mbh 0.1 | 1 | 2% | 7 |
| pac.ABC 2.1 | 0 | 0% | 6 |

## Melee bench: F20

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.2 | 147 / 210 | 1.70 | 20.2% | 32778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.2% | 147 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 28 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.2% | 11 |
| fwb.Nine 1.0.1 | 3.8 | 10.9% | 12 |
| catcat20.Rabbit 0.001 | 4.5 | 10.6% | 7 |
| bayen.nut.Squirrel 1.615 | 6.5 | 7.7% | 4 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.2% | 0 |
| m3thos.mini.Eva01 0.5.5 | 7.3 | 7.4% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.6 | 23 / 35 | 5211 |
| 2 | 1 | 69.7 | 90.8 | 22 / 35 | 5345 |
| 3 | 1 | 70.5 | 92.7 | 24 / 35 | 5572 |
| 4 | 1 | 70.0 | 92.4 | 25 / 35 | 5321 |
| 5 | 1 | 71.7 | 94.9 | 27 / 35 | 5753 |
| 6 | 1 | 71.0 | 93.7 | 26 / 35 | 5576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 78 | 81% |
| fwb.Nine 1.0.1 | 37 | 81% |
| catcat20.Rabbit 0.001 | 33 | 91% |
| nz.jdc.nano.GridFu 1.0 | 14 | 71% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 1125. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 31 | 48% | 85 |
| catcat20.Rabbit 0.001 | 9 | 14% | 45 |
| nz.jdc.nano.GridFu 1.0 | 9 | 14% | 30 |
| fwb.Nine 1.0.1 | 9 | 14% | 14 |
| bayen.nut.Squirrel 1.615 | 5 | 8% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 5 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 8 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 6 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.7 | 137 / 210 | 1.57 | 20.3% | 33155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.3% | 137 |
| eem.EvBot v4.6.16 | 2.0 | 16.3% | 62 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.1% | 6 |
| oa.weak.BotherBot 0.1 | 5.5 | 7.9% | 1 |
| eld.Hmm 1.0 | 5.5 | 7.8% | 2 |
| fire219.CatBot 1.0 | 7.5 | 6.2% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.9% | 0 |
| PSW.Relentless 0.1 | 9.2 | 4.9% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.7 | 21 / 35 | 5528 |
| 2 | 1 | 70.2 | 93.0 | 25 / 35 | 5046 |
| 3 | 1 | 71.1 | 94.9 | 23 / 35 | 5550 |
| 4 | 1 | 71.0 | 90.8 | 21 / 35 | 5958 |
| 5 | 1 | 70.5 | 93.7 | 21 / 35 | 5406 |
| 6 | 1 | 71.8 | 95.9 | 26 / 35 | 5667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 124 | 64% |
| dummy.mini.Scimitar 1.01 | 33 | 94% |
| cf.RiO.RiOx 4.2.1 | 20 | 95% |
| eld.Hmm 1.0 | 9 | 78% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 1482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 46 | 61% | 109 |
| dummy.mini.Scimitar 1.01 | 13 | 17% | 49 |
| cf.RiO.RiOx 4.2.1 | 10 | 13% | 28 |
| eld.Hmm 1.0 | 2 | 3% | 15 |
| oa.weak.BotherBot 0.1 | 2 | 3% | 5 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |
| fire219.CatBot 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.6 | 114 / 210 | 2.02 | 18.9% | 31420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.9% | 114 |
| pe.SandboxDT 2.71m | 2.2 | 15.7% | 50 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.1% | 25 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.4% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 3 |
| gg.Squaraus 0.6 | 6.8 | 6.4% | 0 |
| yk.JahRoslav 1.1 | 6.8 | 6.6% | 1 |
| tad.Dalek98 0.98 | 7.5 | 6.1% | 1 |
| pbg.NinjaX 1.2 | 8.8 | 5.4% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.2 | 22 / 35 | 5456 |
| 2 | 1 | 70.1 | 90.5 | 20 / 35 | 5453 |
| 3 | 1 | 67.9 | 85.4 | 14 / 35 | 5094 |
| 4 | 1 | 70.6 | 92.7 | 24 / 35 | 5282 |
| 5 | 1 | 69.2 | 87.6 | 20 / 35 | 5239 |
| 6 | 1 | 67.2 | 85.4 | 14 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 57 | 81% |
| pe.SandboxDT 2.71m | 53 | 47% |
| jlm.javaDisturbance 0.59 | 37 | 92% |
| bigpete.Stewie 1.0 | 3 | 100% |
| yk.JahRoslav 1.1 | 3 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 45% | 75 |
| kvk.HebusLeTroll 0.35 | 29 | 30% | 60 |
| jlm.javaDisturbance 0.59 | 16 | 16% | 53 |
| bigpete.Stewie 1.0 | 6 | 6% | 10 |
| tad.Dalek98 0.98 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 4 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.1 | 148 / 210 | 1.62 | 19.9% | 29811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.9% | 148 |
| pe.SandboxLump 1.52 | 2.0 | 17.2% | 41 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.8% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.1% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.4% | 1 |
| sample.Walls 1.0 | 6.8 | 8.2% | 2 |
| cw.megas.Blade 0.8 | 7.7 | 7.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.5 | 23 / 35 | 4892 |
| 2 | 1 | 71.1 | 93.7 | 25 / 35 | 4840 |
| 3 | 1 | 70.7 | 93.0 | 22 / 35 | 4875 |
| 4 | 1 | 69.7 | 92.7 | 24 / 35 | 4583 |
| 5 | 1 | 72.0 | 94.6 | 27 / 35 | 5452 |
| 6 | 1 | 71.4 | 94.3 | 27 / 35 | 5169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 107 | 77% |
| cre.Karolos 0.32 | 38 | 92% |
| stelo.AreaTargetingBot 1.1 | 14 | 100% |
| sample.Walls 1.0 | 9 | 89% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 46 | 74% | 127 |
| cre.Karolos 0.32 | 7 | 11% | 38 |
| stelo.AreaTargetingBot 1.1 | 7 | 11% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 6 |
| sample.Walls 1.0 | 1 | 2% | 2 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 79.0 | 78 / 210 | 2.89 | 15.7% | 21935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.2 | 15.7% | 78 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.9% | 32 |
| florent.XSeries.X2 0.12 | 3.3 | 12.9% | 29 |
| davidalves.Phoenix 0.54 | 3.5 | 13.0% | 43 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.4% | 18 |
| oog.melee.Corsair 1.0 | 6.3 | 9.0% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.2% | 6 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.9% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 5.1% | 1 |
| evd.X1 0.01 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 79.4 | 13 / 35 | 3926 |
| 2 | 1 | 65.6 | 85.4 | 16 / 35 | 3661 |
| 3 | 1 | 64.3 | 79.0 | 14 / 35 | 3646 |
| 4 | 1 | 62.3 | 76.2 | 11 / 35 | 3455 |
| 5 | 2 | 63.0 | 76.2 | 10 / 35 | 3531 |
| 6 | 1 | 63.8 | 78.1 | 14 / 35 | 3716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 73% |
| davidalves.Phoenix 0.54 | 29 | 55% |
| florent.XSeries.X2 0.12 | 21 | 62% |
| pedersen.Ugluk 1.1.1 | 15 | 60% |
| stelo.SoJNanoMelee 1.1 | 11 | 91% |
| oog.melee.Corsair 1.0 | 6 | 67% |
| lunchie.Lunchbox 0.93 | 4 | 100% |
| as.FrankTheTank 1.3 | 1 | 0% |

Hadur died in 135 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 35 | 26% | 45 |
| davidalves.Phoenix 0.54 | 29 | 21% | 43 |
| rz.GlowBlowMelee 1.4 | 26 | 19% | 49 |
| pedersen.Ugluk 1.1.1 | 22 | 16% | 31 |
| stelo.SoJNanoMelee 1.1 | 10 | 7% | 14 |
| oog.melee.Corsair 1.0 | 4 | 3% | 13 |
| as.FrankTheTank 1.3 | 3 | 2% | 5 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 7 |
| evd.X1 0.01 | 2 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.7 | 128 / 210 | 2.29 | 18.2% | 24970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.2% | 128 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.3% | 25 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.0% | 12 |
| jdw.Hurricane 1.4 | 3.7 | 12.0% | 23 |
| ds.Oo 2.2 | 5.3 | 9.3% | 8 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 9.0% | 7 |
| adt.Ar2 1.1 | 7.5 | 7.0% | 3 |
| gjr.Cephalosporin 0.1 | 8.2 | 6.9% | 5 |
| awesomeness.Elite 1.0 | 8.2 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.9 | 20 / 35 | 4391 |
| 2 | 1 | 66.4 | 83.8 | 19 / 35 | 3879 |
| 3 | 1 | 64.7 | 79.0 | 16 / 35 | 3766 |
| 4 | 1 | 68.4 | 90.2 | 24 / 35 | 4037 |
| 5 | 1 | 70.1 | 91.1 | 25 / 35 | 4713 |
| 6 | 1 | 68.5 | 87.9 | 24 / 35 | 4184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 46 | 87% |
| voidious.micro.BlitzBat 1.05 | 45 | 93% |
| jdw.Hurricane 1.4 | 30 | 83% |
| ds.Oo 2.2 | 9 | 56% |
| gjr.Cephalosporin 0.1 | 8 | 88% |
| adt.Ar2 1.1 | 7 | 100% |
| gre.svman4.Morfeas 1.4.1 | 3 | 0% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 25 | 30% | 44 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 23% | 59 |
| voidious.micro.BlitzBat 1.05 | 17 | 20% | 48 |
| gjr.Cephalosporin 0.1 | 7 | 8% | 21 |
| ds.Oo 2.2 | 5 | 6% | 16 |
| gre.svman4.Morfeas 1.4.1 | 4 | 5% | 8 |
| awesomeness.Elite 1.0 | 2 | 2% | 8 |
| adt.Ar2 1.1 | 2 | 2% | 5 |
| amk.ChumbaMini 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.1 | 130 / 210 | 1.90 | 19.1% | 32224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.1% | 130 |
| ak.Fermat 2.0 | 2.0 | 15.0% | 30 |
| lrem.Spectre 0.4.4 | 3.3 | 12.2% | 12 |
| shu.nitro.LENIN .T34 | 3.7 | 12.2% | 29 |
| js.PinBall 1.6 | 5.0 | 10.4% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 8.9% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.1% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.2% | 0 |
| sample.SpinBot 1.0 | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 93.3 | 25 / 35 | 5160 |
| 2 | 1 | 68.6 | 88.6 | 21 / 35 | 4880 |
| 3 | 1 | 69.1 | 88.3 | 20 / 35 | 5393 |
| 4 | 1 | 69.3 | 87.0 | 20 / 35 | 5823 |
| 5 | 1 | 70.2 | 92.7 | 23 / 35 | 5525 |
| 6 | 1 | 69.6 | 90.5 | 21 / 35 | 5443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 54 | 89% |
| ak.Fermat 2.0 | 50 | 68% |
| shu.nitro.LENIN .T34 | 36 | 69% |
| js.PinBall 1.6 | 9 | 78% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 35 | 44% | 74 |
| shu.nitro.LENIN .T34 | 22 | 28% | 58 |
| lrem.Spectre 0.4.4 | 12 | 15% | 41 |
| js.PinBall 1.6 | 5 | 6% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 5% | 9 |
| gh.mini.GrubbmOne 1.0 | 2 | 3% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 4 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.7 | 144 / 210 | 2.01 | 19.5% | 30073 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.5% | 144 |
| mk.Alpha 0.2.1 | 2.0 | 14.1% | 37 |
| wee.Gem 1.8.4 | 4.0 | 11.0% | 15 |
| EH.Eagle 1.0.6 | 4.0 | 10.8% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.2% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.0% | 3 |
| joe.ADinosaur 1.0 | 7.2 | 7.9% | 1 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.8% | 1 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.7% | 1 |
| cs.Grudge 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.6 | 28 / 35 | 4760 |
| 2 | 1 | 70.0 | 93.7 | 29 / 35 | 4752 |
| 3 | 1 | 69.3 | 90.8 | 25 / 35 | 4650 |
| 4 | 1 | 67.7 | 75.2 | 18 / 35 | 5717 |
| 5 | 1 | 71.1 | 90.2 | 21 / 35 | 6040 |
| 6 | 1 | 67.7 | 87.9 | 23 / 35 | 4154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 77 | 87% |
| wee.Gem 1.8.4 | 34 | 76% |
| EH.Eagle 1.0.6 | 23 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 89% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| throxbot.ThroxBot 0.1 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 24 | 36% | 89 |
| wee.Gem 1.8.4 | 12 | 18% | 38 |
| throxbot.ThroxBot 0.1 | 9 | 14% | 14 |
| EH.Eagle 1.0.6 | 6 | 9% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 8% | 25 |
| joe.ADinosaur 1.0 | 4 | 6% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 5% | 10 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 3 |
| cs.Grudge 1.0 | 1 | 2% | 1 |

## Melee bench: F28

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 92.3 | 155 / 210 | 1.70 | 19.6% | 26897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.6% | 155 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 29 |
| uji.Antique 1.0 | 3.0 | 12.3% | 15 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.8% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 2 |
| amk.ChumbaWumba 0.3 | 6.3 | 7.9% | 2 |
| ahr.ice.Ice 1.0.2 | 6.3 | 7.9% | 1 |
| matt.advanced.Katana 1.0 | 8.8 | 5.7% | 0 |
| stelo.PianistNano 1.2 | 9.0 | 5.5% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.9 | 24 / 35 | 4404 |
| 2 | 1 | 69.5 | 92.4 | 26 / 35 | 4515 |
| 3 | 1 | 70.2 | 94.3 | 27 / 35 | 4443 |
| 4 | 1 | 69.3 | 91.7 | 23 / 35 | 4483 |
| 5 | 1 | 69.7 | 93.7 | 28 / 35 | 4384 |
| 6 | 1 | 70.1 | 93.7 | 27 / 35 | 4668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 91 | 85% |
| uji.Antique 1.0 | 48 | 94% |
| qohnil.blot.BlotBot 3.61 | 14 | 86% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| ahr.ice.Ice 1.0.2 | 6 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 26 | 47% | 92 |
| uji.Antique 1.0 | 10 | 18% | 55 |
| pfvicm.Sobieski 7.2.3b | 8 | 15% | 17 |
| amk.ChumbaWumba 0.3 | 6 | 11% | 8 |
| qohnil.blot.BlotBot 3.61 | 4 | 7% | 24 |
| stelo.PianistNano 1.2 | 1 | 2% | 1 |
| ahr.ice.Ice 1.0.2 | 0 | 0% | 8 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.6 | 126 / 210 | 2.11 | 19.0% | 28442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.0% | 126 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.5% | 39 |
| deewiant.Anomaly 0.2 | 2.7 | 14.3% | 27 |
| myl.micro.Troodon 1.10 | 3.8 | 12.1% | 2 |
| jok.PheonixM 0.1.2 | 5.0 | 10.4% | 9 |
| ph.melee.ArcherME 0.3 | 6.2 | 7.7% | 1 |
| DBall.Anarchy 0.1 | 6.8 | 6.7% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.6% | 1 |
| jangs.ns51 1.0 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.3 | 22 / 35 | 5010 |
| 2 | 1 | 70.5 | 92.1 | 25 / 35 | 4837 |
| 3 | 1 | 68.8 | 88.9 | 24 / 35 | 4298 |
| 4 | 1 | 69.5 | 87.0 | 23 / 35 | 5079 |
| 5 | 1 | 68.3 | 84.1 | 17 / 35 | 4775 |
| 6 | 1 | 67.8 | 85.4 | 15 / 35 | 4443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 70 | 86% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 63% |
| myl.micro.Troodon 1.10 | 21 | 100% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| DBall.Anarchy 0.1 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 32 | 38% | 90 |
| zyx.mega.YersiniaPestis 3.1 | 28 | 33% | 58 |
| myl.micro.Troodon 1.10 | 9 | 11% | 31 |
| jok.PheonixM 0.1.2 | 9 | 11% | 19 |
| ph.melee.ArcherME 0.3 | 3 | 4% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 1 |

## Melee bench: F30

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 75.6 | 57 / 210 | 3.20 | 14.9% | 22629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 2.0 | 14.9% | 57 |
| catcat20.Matcha 0.006 | 2.2 | 14.3% | 49 |
| darkcanuck.B26354 1.06 | 3.2 | 13.4% | 49 |
| stelo.PastFuture 2.3.2 | 3.7 | 13.1% | 24 |
| oog.melee.Capulet 1.2 | 4.0 | 12.9% | 22 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.8% | 5 |
| ntc.Opposite 1.5 | 7.2 | 7.6% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.1% | 3 |
| tripphippy.Alice 1.1 | 8.2 | 6.3% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.0 | 69.8 | 6 / 35 | 3765 |
| 2 | 1 | 65.7 | 81.9 | 14 / 35 | 4233 |
| 3 | 1 | 63.9 | 79.4 | 9 / 35 | 3953 |
| 4 | 2 | 60.6 | 71.7 | 7 / 35 | 3242 |
| 5 | 1 | 64.3 | 78.4 | 13 / 35 | 3844 |
| 6 | 3 | 61.8 | 72.1 | 8 / 35 | 3592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 30 | 40% |
| catcat20.Matcha 0.006 | 29 | 48% |
| stelo.PastFuture 2.3.2 | 19 | 89% |
| oog.melee.Capulet 1.2 | 15 | 53% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 2 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 42 | 27% | 54 |
| catcat20.Matcha 0.006 | 32 | 21% | 46 |
| stelo.PastFuture 2.3.2 | 30 | 20% | 47 |
| oog.melee.Capulet 1.2 | 24 | 16% | 29 |
| tripphippy.Alice 1.1 | 9 | 6% | 11 |
| ntc.Opposite 1.5 | 7 | 5% | 8 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 7 |

## Melee bench: F31

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 81.4 | 76 / 210 | 2.67 | 16.2% | 22040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 16.6% | 69 |
| hadur117.mini.DeisePL400 0.4 | 1.7 | 16.2% | 76 |
| gh.mini.Griezel 0.2 | 3.0 | 13.7% | 47 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.2% | 9 |
| d414.nano.Quantum 1.0.0 | 4.7 | 10.8% | 4 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.5% | 4 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.7% | 1 |
| fm.mammillarias 1.3 | 7.8 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 84.8 | 15 / 35 | 3821 |
| 2 | 2 | 64.9 | 81.6 | 11 / 35 | 3798 |
| 3 | 2 | 64.5 | 80.3 | 13 / 35 | 3673 |
| 4 | 1 | 65.4 | 81.9 | 16 / 35 | 3599 |
| 5 | 2 | 63.6 | 80.6 | 10 / 35 | 3472 |
| 6 | 2 | 64.8 | 79.4 | 11 / 35 | 3677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 63% |
| gh.mini.Griezel 0.2 | 37 | 43% |
| spinnercat.micro.Tyger 0.1 | 14 | 93% |
| d414.nano.Quantum 1.0.0 | 12 | 83% |
| fm.mammillarias 1.3 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 45 | 33% | 73 |
| gh.mini.Griezel 0.2 | 35 | 26% | 55 |
| d414.nano.Quantum 1.0.0 | 19 | 14% | 32 |
| spinnercat.micro.Tyger 0.1 | 18 | 13% | 25 |
| gh.nano.Grofvuil 0.2 | 9 | 7% | 11 |
| timmit.nano.TimDog 0.33 | 5 | 4% | 9 |
| fm.mammillarias 1.3 | 3 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.2 | 145 / 210 | 1.89 | 19.1% | 28562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.1% | 145 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.3% | 45 |
| lxx.ConceptA 0.8 | 3.5 | 11.6% | 2 |
| apc.botM 3.0 | 3.5 | 11.8% | 10 |
| vjik.UnViolation 1.1 | 5.5 | 9.0% | 2 |
| bayen.UbaMicro 1.4 | 6.2 | 8.3% | 3 |
| panzer.Panzer 0.2 | 6.8 | 7.4% | 1 |
| yk.JahMicro 1.0 | 8.0 | 6.8% | 1 |
| conscience.Electron 1.3g | 8.8 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.7 | 23 / 35 | 4528 |
| 2 | 1 | 70.0 | 95.6 | 27 / 35 | 4694 |
| 3 | 1 | 66.1 | 83.2 | 16 / 35 | 4471 |
| 4 | 1 | 68.5 | 90.8 | 24 / 35 | 4753 |
| 5 | 1 | 69.7 | 92.4 | 28 / 35 | 4935 |
| 6 | 1 | 69.9 | 93.3 | 27 / 35 | 5181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 76 | 66% |
| lxx.ConceptA 0.8 | 31 | 100% |
| apc.botM 3.0 | 30 | 93% |
| vjik.UnViolation 1.1 | 13 | 100% |
| yk.JahMicro 1.0 | 12 | 92% |
| donjezza.Jezza 1.0 | 9 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 34 | 52% | 89 |
| lxx.ConceptA 0.8 | 9 | 14% | 24 |
| apc.botM 3.0 | 7 | 11% | 40 |
| bayen.UbaMicro 1.4 | 6 | 9% | 10 |
| conscience.Electron 1.3g | 3 | 5% | 6 |
| yk.JahMicro 1.0 | 2 | 3% | 8 |
| panzer.Panzer 0.2 | 2 | 3% | 5 |
| vjik.UnViolation 1.1 | 1 | 2% | 21 |
| donjezza.Jezza 1.0 | 1 | 2% | 6 |

## Melee bench: F33

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.3 | 144 / 210 | 1.97 | 19.7% | 30791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.7% | 144 |
| maribo.Quester 0.3 | 2.0 | 15.1% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.0% | 13 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.0% | 9 |
| labg.Cataclysm 2.05 | 4.3 | 10.9% | 15 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 7.9% | 1 |
| baal.nano.N 1.42 | 6.5 | 8.5% | 0 |
| zyx.micro.Ant 1.1 | 8.3 | 5.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.2 | 4.6% | 0 |
| sanja.First 0.1 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.0 | 26 / 35 | 5081 |
| 2 | 1 | 69.0 | 85.7 | 24 / 35 | 5050 |
| 3 | 1 | 71.8 | 94.9 | 26 / 35 | 5469 |
| 4 | 1 | 69.7 | 89.8 | 22 / 35 | 4914 |
| 5 | 1 | 70.2 | 92.4 | 26 / 35 | 4960 |
| 6 | 1 | 69.4 | 86.7 | 20 / 35 | 5317 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 47 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 93% |
| gre.svman4.Leonidas 1.3.2 | 32 | 100% |
| labg.Cataclysm 2.05 | 24 | 75% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 100% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 32 | 48% | 90 |
| labg.Cataclysm 2.05 | 13 | 20% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 14% | 46 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 9% | 8 |
| gre.svman4.Leonidas 1.3.2 | 2 | 3% | 24 |
| baal.nano.N 1.42 | 2 | 3% | 7 |
| zyx.micro.Ant 1.1 | 2 | 3% | 4 |
| sanja.First 0.1 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.1 | 85 / 210 | 2.34 | 17.6% | 28838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.2 | 17.6% | 85 |
| kid.Gladiator .7.2 | 2.3 | 16.2% | 41 |
| stelo.Spread 0.9 | 2.5 | 16.7% | 68 |
| jcs.Seth 1.8 | 4.2 | 11.1% | 12 |
| tcf.Reach 3 | 5.0 | 10.7% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.3% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.5 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.8 | 16 / 35 | 4760 |
| 2 | 1 | 68.9 | 87.3 | 18 / 35 | 4923 |
| 3 | 1 | 66.6 | 83.8 | 10 / 35 | 4671 |
| 4 | 2 | 66.8 | 82.5 | 11 / 35 | 4697 |
| 5 | 1 | 68.5 | 86.3 | 16 / 35 | 4966 |
| 6 | 1 | 68.0 | 85.7 | 14 / 35 | 4821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 68 | 62% |
| kid.Gladiator .7.2 | 57 | 56% |
| jcs.Seth 1.8 | 12 | 67% |
| tcf.Reach 3 | 3 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 127 of 210 rounds, at a mean tick of 1053. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 43% | 90 |
| kid.Gladiator .7.2 | 50 | 39% | 76 |
| jcs.Seth 1.8 | 9 | 7% | 19 |
| tcf.Reach 3 | 7 | 6% | 10 |
| ratosh.Wesco 1.4 | 4 | 3% | 4 |
| cli.Dancer 1.1 | 1 | 1% | 8 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 81.9 | 49 / 210 | 2.63 | 15.5% | 20843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 136 |
| hadur117.mini.DeisePL400 0.4 | 2.0 | 15.5% | 49 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.0% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.5% | 8 |
| rz.HawkOnFire 0.1 | 4.7 | 11.5% | 3 |
| wit.Chuliath 1.0 | 6.5 | 6.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.7% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 82.9 | 6 / 35 | 3410 |
| 2 | 2 | 64.0 | 81.6 | 9 / 35 | 3514 |
| 3 | 2 | 65.6 | 85.1 | 10 / 35 | 3670 |
| 4 | 2 | 64.9 | 82.5 | 9 / 35 | 3457 |
| 5 | 2 | 61.9 | 77.8 | 4 / 35 | 3032 |
| 6 | 2 | 65.1 | 81.6 | 11 / 35 | 3760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 78 | 23% |
| gh.mini.Gruwel 0.9 | 18 | 72% |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 71% |
| rz.HawkOnFire 0.1 | 9 | 89% |

Hadur died in 161 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 86 | 53% | 103 |
| gh.mini.Gruwel 0.9 | 35 | 22% | 49 |
| rz.HawkOnFire 0.1 | 16 | 10% | 26 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 9% | 23 |
| wit.Chuliath 1.0 | 4 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 94.0 | 177 / 210 | 1.54 | 21.1% | 32645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 21.1% | 177 |
| alpha.RainingFire 1.0 | 2.5 | 12.0% | 10 |
| bzdp.Pansy 2.1 | 3.0 | 11.9% | 5 |
| mz.Cork 0.1 | 4.7 | 10.6% | 4 |
| bvh.micro.Freya 0.3 | 5.2 | 9.8% | 5 |
| bvh.mini.Fenrir 0.39 | 5.5 | 9.8% | 4 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.3% | 3 |
| dl.BetterWalls 1.0 | 8.5 | 5.8% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.8 | 31 / 35 | 5652 |
| 2 | 1 | 71.0 | 92.4 | 27 / 35 | 5556 |
| 3 | 1 | 71.4 | 94.9 | 31 / 35 | 5328 |
| 4 | 1 | 70.3 | 92.4 | 28 / 35 | 5106 |
| 5 | 1 | 71.9 | 94.6 | 31 / 35 | 5510 |
| 6 | 1 | 71.0 | 92.7 | 29 / 35 | 5493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 61 | 97% |
| mz.Cork 0.1 | 31 | 97% |
| alpha.RainingFire 1.0 | 24 | 100% |
| bvh.micro.Freya 0.3 | 23 | 100% |
| bvh.mini.Fenrir 0.39 | 21 | 95% |
| m3thos.Eva02 0.7.1 | 13 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 8 | 24% | 63 |
| bvh.mini.Fenrir 0.39 | 7 | 21% | 18 |
| alpha.RainingFire 1.0 | 6 | 18% | 34 |
| mz.Cork 0.1 | 4 | 12% | 31 |
| bvh.micro.Freya 0.3 | 3 | 9% | 25 |
| dl.BetterWalls 1.0 | 3 | 9% | 11 |
| m3thos.Eva02 0.7.1 | 2 | 6% | 26 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 94.2 | 183 / 210 | 1.52 | 20.6% | 34751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 20.6% | 183 |
| germ.TheMind .2 | 2.7 | 10.8% | 6 |
| EBBU.Sim2 1.02 | 3.7 | 10.2% | 1 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 10.1% | 1 |
| stelo.UntouchableNano 1.3 | 5.2 | 9.2% | 6 |
| agrach.Dalek 1.0 | 5.8 | 8.7% | 6 |
| skm.Ryubot 1.0 | 7.5 | 7.9% | 3 |
| lmk.ACPFinal 0.1 | 8.0 | 7.8% | 2 |
| mb.Beast 0.1 | 8.5 | 7.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 95.2 | 31 / 35 | 5958 |
| 2 | 1 | 69.5 | 93.7 | 29 / 35 | 5370 |
| 3 | 1 | 69.7 | 92.4 | 30 / 35 | 5644 |
| 4 | 1 | 70.7 | 94.9 | 30 / 35 | 6006 |
| 5 | 1 | 70.8 | 94.6 | 32 / 35 | 6025 |
| 6 | 1 | 70.2 | 94.3 | 31 / 35 | 5748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 51 | 96% |
| stelo.UntouchableNano 1.3 | 29 | 93% |
| skm.Ryubot 1.0 | 27 | 100% |
| EBBU.Sim2 1.02 | 24 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 100% |
| agrach.Dalek 1.0 | 18 | 100% |
| mb.Beast 0.1 | 11 | 100% |
| lmk.ACPFinal 0.1 | 9 | 89% |

Hadur died in 27 of 210 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 6 | 22% | 44 |
| EBBU.Sim2 1.02 | 5 | 19% | 26 |
| stelo.UntouchableNano 1.3 | 4 | 15% | 27 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 11% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 11% | 6 |
| agrach.Dalek 1.0 | 2 | 7% | 27 |
| mb.Beast 0.1 | 2 | 7% | 19 |
| lmk.ACPFinal 0.1 | 2 | 7% | 15 |
| skm.Ryubot 1.0 | 0 | 0% | 7 |

## Melee bench: F38

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 82.7 | 92 / 210 | 2.56 | 16.7% | 24010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.2 | 16.7% | 92 |
| justin.Mallais 14.0 | 1.8 | 15.6% | 63 |
| bvh.mini.Freya 0.55 | 3.0 | 12.9% | 21 |
| bts.mega.Gnarly 1.4 | 4.8 | 11.0% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 11.0% | 9 |
| cs.Wren 1.0 | 5.2 | 10.8% | 4 |
| kdf.KoulDestroyer 1.0 | 7.2 | 8.1% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.1% | 2 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.6% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.4 | 17 / 35 | 4204 |
| 2 | 1 | 66.8 | 85.4 | 18 / 35 | 4088 |
| 3 | 2 | 65.0 | 79.4 | 13 / 35 | 4035 |
| 4 | 1 | 63.8 | 78.1 | 11 / 35 | 3747 |
| 5 | 1 | 64.7 | 81.6 | 15 / 35 | 3826 |
| 6 | 1 | 67.2 | 86.3 | 18 / 35 | 4110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 46 | 63% |
| cs.Wren 1.0 | 17 | 94% |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 88% |
| bts.mega.Gnarly 1.4 | 16 | 88% |
| bvh.mini.Freya 0.55 | 14 | 79% |
| kdf.KoulDestroyer 1.0 | 6 | 83% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |

Hadur died in 119 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 43 | 36% | 75 |
| bvh.mini.Freya 0.55 | 25 | 21% | 34 |
| bts.mega.Gnarly 1.4 | 14 | 12% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 11% | 31 |
| cs.Wren 1.0 | 12 | 10% | 22 |
| kdf.KoulDestroyer 1.0 | 8 | 7% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 7 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 2 |

## Melee bench: F39

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.3 | 91 / 210 | 2.60 | 17.1% | 27782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 17.1% | 91 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 27 |
| az.Ololobot 0.2.4 | 3.2 | 13.2% | 57 |
| catcat20.Lambda 0.024 | 4.0 | 11.4% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.5% | 12 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 7.9% | 2 |
| gimp.GimpBot 0.1 | 6.8 | 7.9% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 7.7% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 79.7 | 12 / 35 | 4288 |
| 2 | 1 | 63.8 | 78.1 | 13 / 35 | 4203 |
| 3 | 1 | 66.9 | 83.8 | 18 / 35 | 4807 |
| 4 | 1 | 67.0 | 84.4 | 17 / 35 | 4996 |
| 5 | 1 | 65.6 | 82.2 | 13 / 35 | 4571 |
| 6 | 1 | 67.8 | 85.4 | 18 / 35 | 4917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 41 | 54% |
| catcat20.Lambda 0.024 | 33 | 73% |
| bvh.fry.Freya 0.82 | 33 | 76% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |
| gimp.GimpBot 0.1 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 50 | 42% | 71 |
| az.Ololobot 0.2.4 | 28 | 23% | 55 |
| catcat20.Lambda 0.024 | 14 | 12% | 38 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 11% | 18 |
| apollokidd.ApolloKidd 0.9 | 6 | 5% | 8 |
| gimp.GimpBot 0.1 | 4 | 3% | 10 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F40

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.8 | 124 / 210 | 2.19 | 18.7% | 29125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.7% | 124 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 35 |
| kano.gamma.KanoGamma 1.8 | 3.7 | 12.2% | 18 |
| mz.AntiGrav 1.0 | 4.3 | 10.8% | 4 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.7% | 11 |
| stelo.Randomness 1.0 | 5.3 | 9.6% | 15 |
| alpha.BlackIce 1.0 | 7.0 | 8.1% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.2% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.4% | 1 |
| sample.Corners 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 22 / 35 | 5008 |
| 2 | 1 | 66.4 | 81.9 | 19 / 35 | 4419 |
| 3 | 1 | 67.8 | 84.4 | 21 / 35 | 4765 |
| 4 | 1 | 69.6 | 89.2 | 21 / 35 | 5254 |
| 5 | 1 | 70.0 | 93.0 | 24 / 35 | 4950 |
| 6 | 1 | 67.7 | 86.0 | 17 / 35 | 4729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 71% |
| kano.gamma.KanoGamma 1.8 | 33 | 82% |
| Polkwane.SmashMelee 1.0 | 23 | 87% |
| mz.AntiGrav 1.0 | 21 | 100% |
| stelo.Randomness 1.0 | 8 | 75% |
| alpha.BlackIce 1.0 | 5 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 36 | 41% | 58 |
| kano.gamma.KanoGamma 1.8 | 18 | 21% | 58 |
| Polkwane.SmashMelee 1.0 | 10 | 11% | 23 |
| mz.AntiGrav 1.0 | 7 | 8% | 27 |
| stelo.Randomness 1.0 | 7 | 8% | 17 |
| alpha.BlackIce 1.0 | 5 | 6% | 15 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 6 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.6 | 106 / 210 | 2.30 | 17.4% | 24514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.2 | 17.4% | 106 |
| eem.EvBotNG v12.8 | 1.8 | 15.9% | 63 |
| ary.Swarm 1.1 | 3.3 | 12.7% | 14 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.6% | 12 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.5% | 13 |
| shrub.Silver v048 | 6.0 | 8.7% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 5.3% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.8% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 83.8 | 19 / 35 | 3764 |
| 2 | 1 | 67.2 | 86.7 | 18 / 35 | 3968 |
| 3 | 1 | 66.4 | 83.8 | 14 / 35 | 4256 |
| 4 | 2 | 65.7 | 81.0 | 11 / 35 | 4249 |
| 5 | 1 | 69.0 | 90.2 | 23 / 35 | 4186 |
| 6 | 1 | 68.2 | 88.3 | 21 / 35 | 4091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 66 | 53% |
| lessonz.robocode.Oz 0.5.0 | 27 | 96% |
| simonton.nano.MeleeSeed 1.8 | 22 | 91% |
| ary.Swarm 1.1 | 22 | 82% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 44 | 42% | 80 |
| ary.Swarm 1.1 | 22 | 21% | 47 |
| lessonz.robocode.Oz 0.5.0 | 14 | 13% | 29 |
| simonton.nano.MeleeSeed 1.8 | 12 | 11% | 31 |
| shrub.Silver v048 | 5 | 5% | 6 |
| stelo.Mirror 1.1 | 4 | 4% | 5 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 9 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.3 | 111 / 210 | 2.23 | 18.4% | 31674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 18.4% | 111 |
| wompi.Wallaby 5.1 | 2.2 | 15.6% | 57 |
| ara.Shera 0.88 | 3.3 | 13.9% | 29 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.4% | 12 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 0 |
| maribo.IotaCT 1.1 | 6.3 | 7.2% | 0 |
| dsw.StaticD 1.0 | 6.7 | 6.6% | 2 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.0 | 19 / 35 | 5126 |
| 2 | 1 | 68.3 | 84.4 | 17 / 35 | 5522 |
| 3 | 1 | 70.0 | 92.4 | 22 / 35 | 5471 |
| 4 | 1 | 69.5 | 88.9 | 22 / 35 | 5450 |
| 5 | 1 | 66.5 | 81.6 | 13 / 35 | 5037 |
| 6 | 1 | 67.6 | 84.4 | 18 / 35 | 5068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 53 | 81% |
| ara.Shera 0.88 | 47 | 74% |
| maribo.mini.MiniQuester 0.1 | 29 | 97% |
| amz.NanoClone 1.41 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 2 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 40 | 40% | 71 |
| wompi.Wallaby 5.1 | 33 | 33% | 82 |
| maribo.mini.MiniQuester 0.1 | 16 | 16% | 45 |
| amz.NanoClone 1.41 | 4 | 4% | 6 |
| dsw.StaticD 1.0 | 3 | 3% | 3 |
| maribo.IotaCT 1.1 | 2 | 2% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 75.8 | 38 / 210 | 3.18 | 14.7% | 22077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 148 |
| hadur117.mini.DeisePL400 0.4 | 2.0 | 14.7% | 38 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.9% | 16 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.3% | 2 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.1% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.3% | 1 |
| jab.DiamondStealer 5 | 7.3 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 78.7 | 6 / 35 | 3768 |
| 2 | 2 | 62.8 | 71.7 | 4 / 35 | 3540 |
| 3 | 2 | 64.3 | 75.2 | 5 / 35 | 3950 |
| 4 | 2 | 62.7 | 73.0 | 5 / 35 | 3464 |
| 5 | 2 | 65.1 | 78.7 | 11 / 35 | 3772 |
| 6 | 2 | 64.3 | 77.1 | 7 / 35 | 3583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 86 | 23% |
| brainfade.melee.Dusk 0.44 | 7 | 86% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 100% |
| dummy.micro.Sparrow 2.5 | 5 | 100% |
| cvt.Firsty 1.0 | 1 | 0% |

Hadur died in 172 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 99 | 58% | 118 |
| brainfade.melee.Dusk 0.44 | 24 | 14% | 30 |
| dummy.micro.Sparrow 2.5 | 16 | 9% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 8% | 19 |
| Krabb.akim2.Akim2 1.1b | 9 | 5% | 9 |
| jab.DiamondStealer 5 | 8 | 5% | 9 |
| mz.NanoGod 2.02 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.7 | 130 / 210 | 1.83 | 19.8% | 32042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.8% | 130 |
| stelo.Liblix 0.3.1 | 2.2 | 15.7% | 52 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.0% | 22 |
| wompi.Quokka 1.6 | 4.2 | 9.9% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.4% | 0 |
| disan.Chair 2.2.0 | 6.3 | 7.9% | 2 |
| jwirde.Gort 2.0 | 6.3 | 8.1% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.8 | 23 / 35 | 5070 |
| 2 | 1 | 70.2 | 91.4 | 22 / 35 | 5162 |
| 3 | 1 | 70.7 | 93.0 | 23 / 35 | 5577 |
| 4 | 1 | 68.8 | 87.9 | 18 / 35 | 5064 |
| 5 | 1 | 70.9 | 93.3 | 23 / 35 | 5449 |
| 6 | 1 | 70.1 | 88.9 | 21 / 35 | 5720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 96 | 76% |
| tzu.TheArtOfWar 1.2 | 55 | 73% |
| wompi.Quokka 1.6 | 7 | 100% |
| disan.Chair 2.2.0 | 6 | 83% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| jwirde.Gort 2.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 42 | 53% | 109 |
| tzu.TheArtOfWar 1.2 | 25 | 31% | 60 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 10 |
| disan.Chair 2.2.0 | 4 | 5% | 7 |
| wompi.Quokka 1.6 | 3 | 4% | 12 |
| jwirde.Gort 2.0 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 7 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.3 | 82 / 210 | 1.97 | 19.8% | 36156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePL400 0.4 | 1.0 | 19.8% | 82 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.3% | 115 |
| jje.BagPuss 1.2 | 3.2 | 11.5% | 5 |
| sul.Lunar 1.1 | 4.3 | 10.3% | 4 |
| myl.nano.Graviton 1.10 | 4.8 | 9.9% | 1 |
| fm.claire 1.7 | 6.3 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 6.8 | 8.3% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.8% | 3 |
| wit.Deep7 2.0 | 9.2 | 5.7% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.3 | 15 / 35 | 6068 |
| 2 | 1 | 68.8 | 87.6 | 11 / 35 | 5798 |
| 3 | 1 | 69.4 | 87.9 | 13 / 35 | 5984 |
| 4 | 1 | 69.4 | 89.2 | 12 / 35 | 6058 |
| 5 | 1 | 70.7 | 92.1 | 21 / 35 | 5894 |
| 6 | 1 | 70.0 | 90.5 | 10 / 35 | 6354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 120 | 20% |
| sul.Lunar 1.1 | 18 | 94% |
| jje.BagPuss 1.2 | 18 | 89% |
| myl.nano.Graviton 1.10 | 10 | 90% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 89% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 2532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 75% | 0 |
| jje.BagPuss 1.2 | 12 | 9% | 60 |
| myl.nano.Graviton 1.10 | 9 | 7% | 31 |
| sul.Lunar 1.1 | 3 | 2% | 64 |
| fm.claire 1.7 | 3 | 2% | 10 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 22 |
| hvilela.HVilela 0.9 | 2 | 2% | 8 |
| wit.Deep7 2.0 | 1 | 1% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeisePL400 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.2 | 81 / 210 | 2.42 | 16.6% | 24637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.9% | 64 |
| hadur117.mini.DeisePL400 0.4 | 1.7 | 16.6% | 81 |
| rsalesc.melee.Medina 0.4.5 | 2.7 | 15.8% | 50 |
| mz.MicroSheep 1.0 | 4.3 | 10.7% | 5 |
| cx.Princess 1.0 | 4.8 | 9.9% | 9 |
| sadoner.killer 0.2 | 5.8 | 9.0% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.9% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 83.8 | 14 / 35 | 4318 |
| 2 | 2 | 65.5 | 83.2 | 12 / 35 | 4046 |
| 3 | 2 | 65.6 | 83.5 | 12 / 35 | 3858 |
| 4 | 2 | 65.6 | 82.9 | 17 / 35 | 3899 |
| 5 | 1 | 66.8 | 86.0 | 14 / 35 | 4189 |
| 6 | 1 | 66.4 | 86.0 | 12 / 35 | 4327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 72 | 64% |
| rsalesc.melee.Medina 0.4.5 | 38 | 39% |
| cx.Princess 1.0 | 12 | 83% |
| mz.MicroSheep 1.0 | 7 | 86% |
| sadoner.killer 0.2 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 50% |

Hadur died in 130 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 45% | 113 |
| rsalesc.melee.Medina 0.4.5 | 41 | 32% | 54 |
| mz.MicroSheep 1.0 | 11 | 8% | 16 |
| sadoner.killer 0.2 | 8 | 6% | 11 |
| cx.Princess 1.0 | 5 | 4% | 9 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 2 |
| arthord.NanoSatanMelee Beta | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

