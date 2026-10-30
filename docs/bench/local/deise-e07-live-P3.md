# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 87.2 | 55 / 210 | 2.15 | 17.0% | 27735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 143 |
| hadur117.mini.DeiseP3 0.4 | 2.0 | 17.0% | 55 |
| mz.MicroGodMelee 1 | 3.7 | 11.0% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.3% | 1 |
| sgp.JollyNinja 3.53 | 4.5 | 10.2% | 6 |
| lorneswork.Predator 1.0 | 5.5 | 9.7% | 2 |
| adt.Ar2 1.0 | 6.8 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 88.3 | 8 / 35 | 4560 |
| 2 | 2 | 66.5 | 87.0 | 7 / 35 | 4714 |
| 3 | 2 | 67.8 | 91.1 | 10 / 35 | 4658 |
| 4 | 2 | 66.9 | 88.6 | 11 / 35 | 4720 |
| 5 | 2 | 65.6 | 83.2 | 9 / 35 | 4418 |
| 6 | 2 | 66.4 | 85.1 | 10 / 35 | 4665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 138 | 16% |
| mz.MicroGodMelee 1 | 18 | 83% |
| sgp.JollyNinja 3.53 | 10 | 90% |
| lorneswork.Predator 1.0 | 6 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 1315. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 128 | 82% | 149 |
| mz.MicroGodMelee 1 | 10 | 6% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 9 |
| sgp.JollyNinja 3.53 | 6 | 4% | 14 |
| lorneswork.Predator 1.0 | 2 | 1% | 7 |
| adt.Ar2 1.0 | 1 | 1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.8 | 113 / 210 | 2.46 | 18.0% | 28803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.0% | 113 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 14.6% | 35 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 13.4% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.6% | 7 |
| Noran.BitchingElk 0.054 | 6.7 | 8.1% | 6 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.9% | 1 |
| sch.Simone 0.3d | 7.3 | 7.3% | 7 |
| stelo.PatternRobot 1.0 | 8.5 | 6.1% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 18 / 35 | 4657 |
| 2 | 1 | 66.0 | 79.0 | 16 / 35 | 4667 |
| 3 | 1 | 68.0 | 85.1 | 22 / 35 | 4818 |
| 4 | 1 | 67.5 | 85.4 | 20 / 35 | 4828 |
| 5 | 1 | 66.7 | 81.9 | 17 / 35 | 4925 |
| 6 | 1 | 68.3 | 87.0 | 20 / 35 | 4908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 60 | 82% |
| pulsar.PulsarMax 0.8.9 | 34 | 65% |
| Noran.BitchingElk 0.054 | 15 | 67% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 82% |
| sch.Simone 0.3d | 9 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 3 | 33% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 34 | 34% | 52 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 24% | 68 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 15% | 22 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 10% | 19 |
| Noran.BitchingElk 0.054 | 6 | 6% | 23 |
| stelo.PatternRobot 1.0 | 4 | 4% | 6 |
| fullsail.SweetTea 1.1 | 4 | 4% | 5 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 6 |
| sch.Simone 0.3d | 1 | 1% | 9 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.5 | 153 / 210 | 1.58 | 20.3% | 36039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 20.3% | 153 |
| radnor.DoctorBob 1.42 | 2.5 | 13.5% | 14 |
| vuen.Cake 2.51 | 3.2 | 13.1% | 27 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.7% | 16 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 0 |
| adt.Ar1 2.1 | 6.3 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.9% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 96.2 | 27 / 35 | 5960 |
| 2 | 1 | 70.8 | 94.3 | 27 / 35 | 6152 |
| 3 | 1 | 70.7 | 93.3 | 26 / 35 | 6045 |
| 4 | 1 | 71.3 | 95.9 | 28 / 35 | 6275 |
| 5 | 1 | 69.5 | 90.8 | 25 / 35 | 5611 |
| 6 | 1 | 69.4 | 90.8 | 20 / 35 | 5996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 66 | 74% |
| kawigi.nano.Lib 1.0 | 60 | 90% |
| radnor.DoctorBob 1.42 | 43 | 95% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 24 | 42% | 77 |
| kawigi.nano.Lib 1.0 | 16 | 28% | 67 |
| radnor.DoctorBob 1.42 | 16 | 28% | 50 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |
| urdos.URDOS 1.3 | 0 | 0% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |
| adt.Ar1 2.1 | 0 | 0% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.5 | 40 / 210 | 2.12 | 17.7% | 33081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 162 |
| hadur117.mini.DeiseP3 0.4 | 2.0 | 17.7% | 40 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.4% | 4 |
| TNT.TNT 0.99.1 | 4.0 | 10.5% | 1 |
| josago.Jorgito 0.16 | 5.0 | 9.0% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.4% | 2 |
| tj.zombie1n 1.0.1 | 7.3 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 5.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 88.6 | 8 / 35 | 5088 |
| 2 | 2 | 66.2 | 82.2 | 3 / 35 | 5146 |
| 3 | 2 | 69.4 | 90.2 | 8 / 35 | 5808 |
| 4 | 2 | 69.8 | 88.9 | 9 / 35 | 6123 |
| 5 | 2 | 68.6 | 87.9 | 7 / 35 | 5474 |
| 6 | 2 | 68.0 | 87.3 | 5 / 35 | 5442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 166 | 19% |
| apc.LeeroyJenkins2 1.0 | 5 | 80% |
| TNT.TNT 0.99.1 | 2 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |
| spin.Bugstard 0.012b | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 1531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 146 | 86% | 180 |
| apc.LeeroyJenkins2 1.0 | 10 | 6% | 14 |
| TNT.TNT 0.99.1 | 5 | 3% | 6 |
| josago.Jorgito 0.16 | 4 | 2% | 4 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| rampancy.Durandal 2.1d | 1 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 72.8 | 22 / 210 | 3.45 | 13.3% | 19170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.6% | 117 |
| justin.DemonicRage 3.4 | 1.8 | 17.6% | 54 |
| hadur117.mini.DeiseP3 0.4 | 3.2 | 13.3% | 22 |
| wompi.Numbat 2.1 | 3.8 | 12.4% | 11 |
| axeBots.HataMoto 3.09 | 5.5 | 8.7% | 6 |
| ms.Ares 0.19 | 5.5 | 8.9% | 0 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 8.8 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 71.1 | 2 / 35 | 3307 |
| 2 | 3 | 60.4 | 73.0 | 3 / 35 | 3121 |
| 3 | 3 | 62.6 | 77.1 | 8 / 35 | 3263 |
| 4 | 3 | 60.4 | 71.4 | 2 / 35 | 3233 |
| 5 | 3 | 61.9 | 75.6 | 5 / 35 | 3198 |
| 6 | 4 | 59.3 | 68.6 | 2 / 35 | 3048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 30 | 27% |
| cb.fire.Firestarter 2.0f | 30 | 17% |
| wompi.Numbat 2.1 | 5 | 80% |
| axeBots.HataMoto 3.09 | 4 | 100% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 71 | 38% | 78 |
| justin.DemonicRage 3.4 | 69 | 37% | 75 |
| wompi.Numbat 2.1 | 22 | 12% | 26 |
| ms.Ares 0.19 | 12 | 6% | 14 |
| axeBots.HataMoto 3.09 | 8 | 4% | 11 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.0 | 118 / 210 | 2.08 | 18.3% | 27177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.3% | 118 |
| jekl.StoneGhost 0.7 | 2.0 | 14.8% | 24 |
| origin.SleepSiphon 1.7b | 3.2 | 13.4% | 33 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.3% | 26 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 1 |
| gg.Wolverine 2.0 | 6.2 | 8.1% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.7% | 6 |
| spinnercat.Omen 1.0 | 7.7 | 6.8% | 0 |
| DBall.NUKE 0.1 | 8.7 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.5 | 21 / 35 | 4638 |
| 2 | 1 | 66.7 | 82.9 | 18 / 35 | 4416 |
| 3 | 1 | 68.4 | 89.2 | 19 / 35 | 4555 |
| 4 | 1 | 67.6 | 87.3 | 20 / 35 | 4276 |
| 5 | 1 | 68.4 | 87.9 | 18 / 35 | 4900 |
| 6 | 1 | 68.7 | 90.5 | 22 / 35 | 4392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 51 | 92% |
| origin.SleepSiphon 1.7b | 44 | 70% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 63% |
| gg.Wolverine 2.0 | 13 | 92% |
| mld.Wisdom 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 28 | 30% | 64 |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 29% | 48 |
| jekl.StoneGhost 0.7 | 23 | 25% | 61 |
| mld.Wisdom 1.0 | 8 | 9% | 12 |
| gg.Wolverine 2.0 | 3 | 3% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 7 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.9 | 126 / 210 | 1.55 | 20.0% | 34160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 20.0% | 126 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.4% | 46 |
| rtk.Tachikoma 1.0 | 2.8 | 16.1% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.5% | 4 |
| franzor.Lizt 1.3.1 | 5.0 | 10.3% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.3 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.3 | 20 / 35 | 5476 |
| 2 | 1 | 72.1 | 94.9 | 23 / 35 | 5847 |
| 3 | 1 | 71.3 | 94.0 | 21 / 35 | 5578 |
| 4 | 1 | 70.6 | 91.1 | 18 / 35 | 5706 |
| 5 | 1 | 72.0 | 95.9 | 23 / 35 | 5846 |
| 6 | 1 | 71.5 | 94.3 | 21 / 35 | 5707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 99 | 82% |
| rsalesc.melee.Monk 0.3.6c | 55 | 24% |
| oog.melee.CapuletDroid 1.1 | 29 | 93% |
| franzor.Lizt 1.3.1 | 11 | 45% |

Hadur died in 84 of 210 rounds, at a mean tick of 1683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 48 | 57% | 69 |
| rtk.Tachikoma 1.0 | 24 | 29% | 103 |
| franzor.Lizt 1.3.1 | 7 | 8% | 0 |
| oog.melee.CapuletDroid 1.1 | 4 | 5% | 27 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 92.0 | 140 / 210 | 1.72 | 19.5% | 29026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 19.5% | 140 |
| shrub.Vapour v159 | 2.5 | 12.9% | 17 |
| tm.Yuugao 1.0 | 2.7 | 13.0% | 31 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.5% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.7% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.1% | 5 |
| m3thos.Eva00 1.1 | 6.7 | 7.7% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.8% | 1 |
| SHAM.WOW 1.4 | 9.0 | 6.3% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.4 | 24 / 35 | 4816 |
| 2 | 1 | 70.7 | 96.2 | 25 / 35 | 5117 |
| 3 | 1 | 69.0 | 92.4 | 26 / 35 | 4656 |
| 4 | 1 | 69.7 | 93.3 | 27 / 35 | 4937 |
| 5 | 1 | 68.4 | 90.2 | 21 / 35 | 4729 |
| 6 | 1 | 67.9 | 88.3 | 17 / 35 | 4771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 60 | 65% |
| shrub.Vapour v159 | 51 | 84% |
| Krabb.sliNk.Garm 0.9u | 26 | 77% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 88% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 80% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 33% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 27 | 39% | 78 |
| shrub.Vapour v159 | 13 | 19% | 52 |
| Krabb.sliNk.Garm 0.9u | 13 | 19% | 26 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 9% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 7% | 19 |
| m3thos.Eva00 1.1 | 3 | 4% | 9 |
| SHAM.WOW 1.4 | 2 | 3% | 5 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.0 | 81 / 210 | 2.89 | 16.3% | 24296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 16.7% | 83 |
| hadur117.mini.DeiseP3 0.4 | 1.7 | 16.3% | 81 |
| kc.micro.Figment 1.0 | 2.8 | 14.6% | 24 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.0% | 12 |
| yagami.Tidus 0.11 | 4.8 | 10.4% | 2 |
| mc2.enemy.Original 0.9 | 5.5 | 9.4% | 7 |
| dft.Calliope 5.6 | 6.8 | 7.4% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.3% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.4% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 81.0 | 16 / 35 | 3996 |
| 2 | 2 | 63.9 | 74.9 | 12 / 35 | 3877 |
| 3 | 1 | 66.9 | 83.8 | 16 / 35 | 4314 |
| 4 | 2 | 65.7 | 79.4 | 13 / 35 | 4186 |
| 5 | 2 | 64.6 | 78.4 | 13 / 35 | 3923 |
| 6 | 2 | 64.0 | 76.5 | 11 / 35 | 4000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 49 | 39% |
| kc.micro.Figment 1.0 | 47 | 83% |
| pedersen.Grishnakh 1.0 | 9 | 67% |
| mc2.enemy.Original 0.9 | 9 | 78% |
| yagami.Tidus 0.11 | 8 | 88% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 54 | 42% | 74 |
| kc.micro.Figment 1.0 | 21 | 16% | 62 |
| yagami.Tidus 0.11 | 15 | 12% | 23 |
| mc2.enemy.Original 0.9 | 12 | 9% | 17 |
| pedersen.Grishnakh 1.0 | 12 | 9% | 17 |
| step.nanoPri 1.0 | 8 | 6% | 9 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |
| dft.Calliope 5.6 | 2 | 2% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 95.4 | 171 / 210 | 1.41 | 20.4% | 32377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 20.4% | 171 |
| DTF.Kludgy 1.2b | 2.2 | 14.2% | 21 |
| ne.Chimera 1.2 | 3.0 | 12.5% | 9 |
| ejb.Polaris 1.0.1 | 3.8 | 11.8% | 2 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.8% | 5 |
| vStar.RAFzilla 2.15 | 5.5 | 9.9% | 1 |
| sam.Samspin 1.0 | 7.5 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 93.0 | 26 / 35 | 4946 |
| 2 | 1 | 70.4 | 96.2 | 30 / 35 | 4924 |
| 3 | 1 | 71.3 | 97.1 | 29 / 35 | 5477 |
| 4 | 1 | 70.5 | 95.2 | 27 / 35 | 5420 |
| 5 | 1 | 70.5 | 93.3 | 27 / 35 | 5622 |
| 6 | 1 | 72.0 | 97.8 | 32 / 35 | 5988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 67 | 76% |
| ejb.Polaris 1.0.1 | 44 | 100% |
| ne.Chimera 1.2 | 35 | 86% |
| vStar.RAFzilla 2.15 | 17 | 100% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| kurios.DOSexe .9b | 7 | 100% |
| donjezza.Muncho 1.0 | 5 | 80% |
| sam.Samspin 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 59% | 75 |
| ne.Chimera 1.2 | 6 | 15% | 37 |
| tvv.micro.Antares 1.1.1 | 4 | 10% | 17 |
| vStar.RAFzilla 2.15 | 3 | 8% | 18 |
| ejb.Polaris 1.0.1 | 2 | 5% | 46 |
| donjezza.Muncho 1.0 | 1 | 3% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 10 |
| sam.Samspin 1.0 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.9 | 108 / 210 | 2.36 | 17.6% | 25666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.2 | 17.6% | 108 |
| rz.Aleph 0.34 | 1.8 | 16.1% | 55 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.5% | 22 |
| djc.DynaBot 0.1.1 | 4.2 | 10.8% | 7 |
| rdt199.Warlord 0.73 | 4.8 | 9.7% | 9 |
| br2.MobyDickBot 1.6 | 6.2 | 8.2% | 8 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.2% | 0 |
| uji.YellohFellah 1.0 | 7.5 | 7.4% | 3 |
| stelo.MirrorNano 1.3 | 9.3 | 5.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.9 | 23 / 35 | 4389 |
| 2 | 1 | 66.6 | 82.2 | 18 / 35 | 4369 |
| 3 | 1 | 65.7 | 82.9 | 15 / 35 | 4025 |
| 4 | 1 | 68.6 | 89.8 | 22 / 35 | 4458 |
| 5 | 2 | 64.3 | 78.4 | 12 / 35 | 4051 |
| 6 | 1 | 67.4 | 87.3 | 18 / 35 | 4374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 61 | 72% |
| cx.mini.Nimrod 0.55 | 24 | 75% |
| rdt199.Warlord 0.73 | 23 | 87% |
| djc.DynaBot 0.1.1 | 19 | 84% |
| br2.MobyDickBot 1.6 | 8 | 25% |
| uji.YellohFellah 1.0 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 43 | 42% | 97 |
| cx.mini.Nimrod 0.55 | 25 | 25% | 37 |
| rdt199.Warlord 0.73 | 14 | 14% | 30 |
| br2.MobyDickBot 1.6 | 9 | 9% | 15 |
| djc.DynaBot 0.1.1 | 6 | 6% | 19 |
| uji.YellohFellah 1.0 | 2 | 2% | 9 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
| KiraNL.Chupacabra 0.4 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.6 | 138 / 210 | 2.21 | 18.1% | 23413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.1% | 138 |
| darkcanuck.Leon 1.01 | 3.0 | 13.1% | 15 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.1% | 19 |
| nat.PallasHawk 1.0 | 3.3 | 12.7% | 22 |
| brainfade.melee.Genghis 0.36 | 4.7 | 10.4% | 10 |
| jrm.Test0 1.0 | 6.0 | 8.1% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.9% | 1 |
| jp.Perpy 16.0 | 7.8 | 6.8% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.5% | 2 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 89.5 | 25 / 35 | 3727 |
| 2 | 1 | 67.4 | 87.9 | 21 / 35 | 3726 |
| 3 | 1 | 66.4 | 83.5 | 20 / 35 | 3760 |
| 4 | 1 | 69.7 | 93.0 | 27 / 35 | 4243 |
| 5 | 1 | 67.2 | 84.4 | 23 / 35 | 3971 |
| 6 | 1 | 66.2 | 81.0 | 22 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 47 | 94% |
| nat.PallasHawk 1.0 | 46 | 89% |
| bts.wiki.RipCurl 0.9b | 30 | 97% |
| brainfade.melee.Genghis 0.36 | 14 | 86% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| jrm.Test0 1.0 | 4 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 67% |

Hadur died in 73 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 19 | 26% | 47 |
| brainfade.melee.Genghis 0.36 | 14 | 19% | 19 |
| nat.PallasHawk 1.0 | 12 | 16% | 50 |
| darkcanuck.Leon 1.01 | 10 | 14% | 59 |
| cs.sheldor.Talon 1.1 | 7 | 10% | 13 |
| jrm.Test0 1.0 | 5 | 7% | 6 |
| jaybot.bots.Oddball 4.0 | 3 | 4% | 7 |
| jp.Perpy 16.0 | 3 | 4% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F13

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.9 | 81 / 210 | 2.45 | 16.4% | 24897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.6% | 80 |
| ags.Glacier 0.2.11 | 2.2 | 16.0% | 29 |
| hadur117.mini.DeiseP3 0.4 | 2.2 | 16.4% | 81 |
| shinh.Entangled 0.3 | 4.2 | 12.1% | 15 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.5% | 6 |
| apc.Colossus2 0.17 | 6.5 | 7.4% | 0 |
| stelo.Wang 1.0 | 6.5 | 7.4% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.2% | 0 |
| maribo.FollowFire 1 | 9.2 | 4.1% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 78.4 | 12 / 35 | 3714 |
| 2 | 1 | 67.3 | 86.7 | 13 / 35 | 4726 |
| 3 | 3 | 63.9 | 77.5 | 11 / 35 | 3936 |
| 4 | 1 | 68.3 | 91.1 | 21 / 35 | 4174 |
| 5 | 2 | 66.2 | 86.0 | 12 / 35 | 4028 |
| 6 | 3 | 66.2 | 83.8 | 12 / 35 | 4319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 58 | 45% |
| ags.Glacier 0.2.11 | 53 | 74% |
| shinh.Entangled 0.3 | 15 | 80% |
| stelo.Wang 1.0 | 4 | 100% |
| gh.micro.Gruweltje 0.7 | 1 | 0% |

Hadur died in 130 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 49 | 38% | 76 |
| ags.Glacier 0.2.11 | 42 | 32% | 75 |
| shinh.Entangled 0.3 | 23 | 18% | 38 |
| gh.micro.Gruweltje 0.7 | 7 | 5% | 10 |
| stelo.Wang 1.0 | 6 | 5% | 9 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 93.7 | 153 / 210 | 1.57 | 19.8% | 30549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 19.8% | 153 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 29 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.7% | 23 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.6% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.1% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.2 | 8.6% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.3% | 4 |
| pa.Improved 1.0 | 9.0 | 5.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 95.2 | 24 / 35 | 5219 |
| 2 | 1 | 69.3 | 90.8 | 22 / 35 | 4829 |
| 3 | 1 | 70.5 | 94.6 | 27 / 35 | 5198 |
| 4 | 1 | 70.7 | 95.9 | 28 / 35 | 5055 |
| 5 | 1 | 70.3 | 95.2 | 28 / 35 | 4911 |
| 6 | 1 | 69.8 | 90.2 | 24 / 35 | 5337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 83% |
| catcat20.shape.Theta 0.018 | 54 | 78% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 88% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 28 | 48% | 100 |
| catcat20.shape.Theta 0.018 | 20 | 34% | 57 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 21 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 5% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 15 |
| pa.Improved 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.4 | 115 / 210 | 2.40 | 18.3% | 30579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.3% | 115 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.3% | 19 |
| emp.Yngwie 1.11 | 3.7 | 12.2% | 40 |
| mld.DustBunny 3.8 | 3.8 | 12.0% | 8 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.9% | 13 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.5% | 14 |
| lambdaxy.TBot 0.1 | 7.0 | 7.2% | 1 |
| Grystrion.TrackerWO 1.0 | 8.3 | 5.9% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.3% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.6 | 23 / 35 | 5344 |
| 2 | 1 | 65.2 | 77.8 | 12 / 35 | 4887 |
| 3 | 1 | 67.3 | 83.5 | 19 / 35 | 4967 |
| 4 | 1 | 68.9 | 85.4 | 22 / 35 | 5193 |
| 5 | 1 | 69.4 | 89.8 | 21 / 35 | 5329 |
| 6 | 1 | 66.8 | 82.2 | 18 / 35 | 4859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 40 | 95% |
| emp.Yngwie 1.11 | 28 | 68% |
| mld.DustBunny 3.8 | 22 | 95% |
| cb.nano.Insomnia 1.0 | 21 | 76% |
| kawigi.robot.Girl 1.2 | 16 | 81% |
| divineomega.TrialBot 0.003 | 9 | 89% |

Hadur died in 96 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 28 | 29% | 55 |
| cb.nano.Insomnia 1.0 | 17 | 18% | 20 |
| kawigi.micro.Shiz 1.1 | 16 | 17% | 50 |
| mld.DustBunny 3.8 | 13 | 14% | 40 |
| kawigi.robot.Girl 1.2 | 10 | 10% | 23 |
| divineomega.TrialBot 0.003 | 6 | 6% | 13 |
| lambdaxy.TBot 0.1 | 4 | 4% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.4 | 115 / 210 | 2.05 | 19.3% | 33138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 19.3% | 115 |
| gh.Griezel 0.5.2 | 2.2 | 16.3% | 58 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.2% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 9.7% | 21 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.1% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.1% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.5% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.3% | 2 |
| asd.Cthulhu 1.3 | 9.0 | 4.7% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.0 | 17 / 35 | 5337 |
| 2 | 1 | 70.6 | 91.4 | 23 / 35 | 5608 |
| 3 | 1 | 69.5 | 88.6 | 21 / 35 | 5406 |
| 4 | 1 | 69.2 | 86.7 | 18 / 35 | 5562 |
| 5 | 1 | 69.9 | 90.2 | 18 / 35 | 5409 |
| 6 | 1 | 69.6 | 87.3 | 18 / 35 | 5816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 88 | 58% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 34 | 94% |
| techdude.forest.FlamingForest 1.1 | 21 | 62% |
| bvh.fnr.Fenrir 0.36l | 10 | 90% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1375. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 53 | 56% | 111 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 16% | 41 |
| techdude.forest.FlamingForest 1.1 | 9 | 9% | 18 |
| bvh.fnr.Fenrir 0.36l | 6 | 6% | 13 |
| stelo.IntrinsicVolatility 1.4 | 4 | 4% | 8 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 7 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 7 |
| asd.Cthulhu 1.3 | 2 | 2% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.2 | 102 / 210 | 2.60 | 17.5% | 28859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 17.5% | 102 |
| et.Predator 1.8 | 2.7 | 13.2% | 21 |
| cx.BlestPain 1.41 | 3.2 | 12.8% | 43 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.5% | 27 |
| nic.Nicator 2.4 | 4.8 | 11.0% | 10 |
| ahf.NanoAndrew .4 | 6.3 | 10.2% | 4 |
| maribo.melee.BMV 0.1 | 6.7 | 8.9% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 78.1 | 14 / 35 | 4540 |
| 2 | 1 | 67.3 | 85.1 | 19 / 35 | 4660 |
| 3 | 1 | 68.6 | 85.7 | 22 / 35 | 4944 |
| 4 | 1 | 67.6 | 81.6 | 18 / 35 | 5214 |
| 5 | 1 | 67.1 | 85.4 | 14 / 35 | 4892 |
| 6 | 1 | 65.2 | 77.1 | 15 / 35 | 4609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 47 | 79% |
| cx.BlestPain 1.41 | 39 | 46% |
| oog.melee.Mercutio 1.0 | 31 | 74% |
| nic.Nicator 2.4 | 19 | 74% |
| ahf.NanoAndrew .4 | 6 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1094. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 30 | 28% | 54 |
| oog.melee.Mercutio 1.0 | 24 | 22% | 40 |
| et.Predator 1.8 | 21 | 19% | 55 |
| nic.Nicator 2.4 | 10 | 9% | 24 |
| ahf.NanoAndrew .4 | 10 | 9% | 20 |
| maribo.melee.BMV 0.1 | 9 | 8% | 11 |
| tex.Longbot 0.4 | 4 | 4% | 4 |
| goblin.Bender 2.4 | 0 | 0% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.4 | 120 / 210 | 2.31 | 17.9% | 25432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 17.9% | 120 |
| morbid.MorbidPriest 1.0 | 2.5 | 12.5% | 22 |
| agd.Mooserwirt2 2.7 | 2.5 | 12.7% | 29 |
| uji.DBH 1.1 | 4.7 | 10.8% | 16 |
| spinnercat.Robovirus 2.718 | 5.5 | 10.1% | 8 |
| ratosh.Nobo 0.21 | 5.5 | 10.1% | 2 |
| sigterm.Sigterm 1.0 | 6.5 | 8.3% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 6.7% | 0 |
| stelo.WangRobot 1.0 | 8.7 | 6.1% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.3 | 19 / 35 | 4598 |
| 2 | 1 | 66.7 | 85.4 | 20 / 35 | 4019 |
| 3 | 1 | 66.9 | 84.1 | 22 / 35 | 4417 |
| 4 | 1 | 66.2 | 85.1 | 17 / 35 | 4059 |
| 5 | 1 | 66.4 | 84.4 | 21 / 35 | 3990 |
| 6 | 1 | 67.2 | 85.4 | 21 / 35 | 4349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 43 | 84% |
| agd.Mooserwirt2 2.7 | 36 | 67% |
| uji.DBH 1.1 | 16 | 81% |
| spinnercat.Robovirus 2.718 | 14 | 93% |
| sigterm.Sigterm 1.0 | 13 | 100% |
| stelo.WangRobot 1.0 | 12 | 75% |
| ratosh.Nobo 0.21 | 5 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 25 | 28% | 60 |
| morbid.MorbidPriest 1.0 | 24 | 27% | 59 |
| uji.DBH 1.1 | 13 | 14% | 20 |
| ratosh.Nobo 0.21 | 8 | 9% | 15 |
| spinnercat.Robovirus 2.718 | 6 | 7% | 16 |
| stelo.WangRobot 1.0 | 5 | 6% | 15 |
| sigterm.Sigterm 1.0 | 4 | 4% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 3% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 4 |

## Melee bench: F19

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.9 | 161 / 210 | 1.55 | 20.5% | 32303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 20.5% | 161 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.1% | 17 |
| mld.Infinity 2.2 | 3.0 | 13.9% | 27 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.9% | 1 |
| erdnis.Rover 0.3 | 4.7 | 10.1% | 3 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.6% | 1 |
| mbh.Mbh 0.1 | 7.2 | 7.3% | 1 |
| pac.ABC 2.1 | 7.3 | 7.0% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 99.4 | 33 / 35 | 6085 |
| 2 | 1 | 71.2 | 92.1 | 24 / 35 | 5618 |
| 3 | 1 | 71.7 | 94.3 | 26 / 35 | 5600 |
| 4 | 1 | 70.8 | 93.7 | 27 / 35 | 5079 |
| 5 | 1 | 70.4 | 92.4 | 26 / 35 | 5042 |
| 6 | 1 | 70.3 | 91.7 | 25 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 96 | 90% |
| mld.Infinity 2.2 | 57 | 77% |
| krillr.mini.JointStrike 2.0.0 | 9 | 89% |
| erdnis.Rover 0.3 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 1275. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 21 | 43% | 121 |
| mld.Infinity 2.2 | 17 | 35% | 23 |
| erdnis.Rover 0.3 | 4 | 8% | 12 |
| patson.PatsonTestBot 1.0 | 3 | 6% | 12 |
| krillr.mini.JointStrike 2.0.0 | 2 | 4% | 18 |
| pac.ABC 2.1 | 1 | 2% | 11 |
| pbg.R2D2 1.0 | 1 | 2% | 6 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.2 | 117 / 210 | 2.15 | 18.6% | 30046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.3 | 18.6% | 117 |
| trm.Wrekt 1.1.6.f | 1.7 | 16.5% | 52 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.2% | 7 |
| fwb.Nine 1.0.1 | 3.7 | 11.4% | 14 |
| catcat20.Rabbit 0.001 | 4.7 | 10.4% | 16 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 7.4% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.2% | 3 |
| bayen.nut.Squirrel 1.615 | 7.7 | 6.7% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.6 | 24 / 35 | 5428 |
| 2 | 2 | 66.8 | 83.5 | 16 / 35 | 4532 |
| 3 | 1 | 69.7 | 91.4 | 21 / 35 | 5468 |
| 4 | 1 | 69.0 | 91.1 | 21 / 35 | 4861 |
| 5 | 2 | 67.3 | 83.5 | 18 / 35 | 4829 |
| 6 | 1 | 67.6 | 86.0 | 17 / 35 | 4928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 74 | 72% |
| fwb.Nine 1.0.1 | 28 | 89% |
| catcat20.Rabbit 0.001 | 23 | 70% |
| nz.jdc.nano.GridFu 1.0 | 9 | 89% |
| bayen.nut.Squirrel 1.615 | 8 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 43 | 46% | 77 |
| fwb.Nine 1.0.1 | 27 | 29% | 47 |
| catcat20.Rabbit 0.001 | 10 | 11% | 31 |
| nz.jdc.nano.GridFu 1.0 | 9 | 10% | 28 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 10 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.2 | 145 / 210 | 1.52 | 20.8% | 33706 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 20.8% | 145 |
| eem.EvBot v4.6.16 | 2.2 | 14.9% | 51 |
| dummy.mini.Scimitar 1.01 | 2.8 | 13.8% | 2 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 4 |
| eld.Hmm 1.0 | 5.3 | 8.6% | 8 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.1% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.6% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.6 | 25 / 35 | 5299 |
| 2 | 1 | 70.3 | 91.4 | 22 / 35 | 5662 |
| 3 | 1 | 73.2 | 96.5 | 28 / 35 | 6265 |
| 4 | 1 | 71.9 | 95.9 | 23 / 35 | 5877 |
| 5 | 1 | 69.8 | 91.4 | 22 / 35 | 4988 |
| 6 | 1 | 71.3 | 95.2 | 25 / 35 | 5615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 111 | 67% |
| dummy.mini.Scimitar 1.01 | 36 | 97% |
| cf.RiO.RiOx 4.2.1 | 17 | 100% |
| eld.Hmm 1.0 | 14 | 86% |
| oa.weak.BotherBot 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 69% | 94 |
| dummy.mini.Scimitar 1.01 | 12 | 18% | 62 |
| cf.RiO.RiOx 4.2.1 | 5 | 8% | 20 |
| eld.Hmm 1.0 | 3 | 5% | 22 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 9 |
| el.JumpShoot 0.2 | 0 | 0% | 3 |

## Melee bench: F22

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.7 | 110 / 210 | 2.01 | 18.6% | 30067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.6% | 110 |
| pe.SandboxDT 2.71m | 2.3 | 16.3% | 54 |
| kvk.HebusLeTroll 0.35 | 2.7 | 14.9% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.4% | 14 |
| bigpete.Stewie 1.0 | 5.0 | 10.1% | 4 |
| yk.JahRoslav 1.1 | 6.5 | 6.8% | 1 |
| tad.Dalek98 0.98 | 7.5 | 6.0% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.2% | 1 |
| pbg.NinjaX 1.2 | 8.3 | 5.3% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.7 | 21 / 35 | 4938 |
| 2 | 1 | 67.1 | 84.4 | 16 / 35 | 4702 |
| 3 | 1 | 70.9 | 93.3 | 24 / 35 | 5655 |
| 4 | 1 | 68.5 | 87.3 | 16 / 35 | 4943 |
| 5 | 1 | 68.2 | 85.4 | 16 / 35 | 4958 |
| 6 | 1 | 69.1 | 90.2 | 17 / 35 | 4871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 57 | 81% |
| pe.SandboxDT 2.71m | 50 | 50% |
| jlm.javaDisturbance 0.59 | 33 | 76% |
| bigpete.Stewie 1.0 | 8 | 88% |
| yk.JahRoslav 1.1 | 5 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 41 | 41% | 73 |
| kvk.HebusLeTroll 0.35 | 29 | 29% | 70 |
| jlm.javaDisturbance 0.59 | 20 | 20% | 39 |
| bigpete.Stewie 1.0 | 6 | 6% | 17 |
| yk.JahRoslav 1.1 | 2 | 2% | 6 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.4 | 144 / 210 | 1.68 | 19.7% | 29534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 19.7% | 144 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 39 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.5% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.1% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 9.1% | 2 |
| sample.Walls 1.0 | 7.2 | 8.0% | 1 |
| cw.megas.Blade 0.8 | 7.3 | 8.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 95.6 | 29 / 35 | 4872 |
| 2 | 1 | 68.9 | 89.5 | 20 / 35 | 4531 |
| 3 | 1 | 71.2 | 93.0 | 26 / 35 | 4972 |
| 4 | 1 | 70.7 | 92.7 | 23 / 35 | 5213 |
| 5 | 1 | 70.1 | 91.4 | 22 / 35 | 4988 |
| 6 | 1 | 71.0 | 92.4 | 24 / 35 | 4958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 92 | 77% |
| cre.Karolos 0.32 | 37 | 84% |
| stelo.AreaTargetingBot 1.1 | 20 | 95% |
| sample.Walls 1.0 | 8 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 35 | 53% | 105 |
| cre.Karolos 0.32 | 18 | 27% | 47 |
| stelo.AreaTargetingBot 1.1 | 6 | 9% | 24 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 5% | 8 |
| cw.megas.Blade 0.8 | 2 | 3% | 6 |
| stelo.RamTrackSurfer 1.2 | 1 | 2% | 13 |
| sample.Walls 1.0 | 1 | 2% | 5 |

## Melee bench: F24

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 78.3 | 88 / 210 | 2.95 | 15.6% | 20783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.2 | 15.6% | 88 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.5% | 32 |
| florent.XSeries.X2 0.12 | 3.2 | 13.4% | 27 |
| davidalves.Phoenix 0.54 | 3.3 | 13.3% | 44 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.6% | 13 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.0% | 4 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.1% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 0 |
| evd.X1 0.01 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 76.5 | 15 / 35 | 3381 |
| 2 | 1 | 61.7 | 72.1 | 11 / 35 | 3525 |
| 3 | 1 | 66.8 | 86.7 | 18 / 35 | 3759 |
| 4 | 2 | 62.2 | 75.6 | 13 / 35 | 3178 |
| 5 | 1 | 64.8 | 82.2 | 17 / 35 | 3553 |
| 6 | 1 | 63.6 | 76.8 | 14 / 35 | 3387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 33 | 61% |
| rz.GlowBlowMelee 1.4 | 27 | 67% |
| florent.XSeries.X2 0.12 | 22 | 77% |
| pedersen.Ugluk 1.1.1 | 16 | 100% |
| stelo.SoJNanoMelee 1.1 | 9 | 78% |
| oog.melee.Corsair 1.0 | 8 | 88% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 35 | 28% | 51 |
| rz.GlowBlowMelee 1.4 | 27 | 22% | 47 |
| florent.XSeries.X2 0.12 | 26 | 21% | 47 |
| pedersen.Ugluk 1.1.1 | 17 | 14% | 29 |
| stelo.SoJNanoMelee 1.1 | 6 | 5% | 7 |
| oog.melee.Corsair 1.0 | 5 | 4% | 19 |
| lunchie.Lunchbox 0.93 | 5 | 4% | 7 |
| evd.X1 0.01 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.4 | 138 / 210 | 2.22 | 18.6% | 25272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.6% | 138 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.3% | 18 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.3% | 18 |
| jdw.Hurricane 1.4 | 4.0 | 11.3% | 17 |
| ds.Oo 2.2 | 5.2 | 9.2% | 6 |
| gre.svman4.Morfeas 1.4.1 | 6.5 | 8.2% | 6 |
| awesomeness.Elite 1.0 | 7.5 | 7.4% | 2 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.3% | 4 |
| adt.Ar2 1.1 | 8.2 | 7.0% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.0 | 20 / 35 | 4229 |
| 2 | 1 | 67.5 | 85.1 | 24 / 35 | 4159 |
| 3 | 1 | 65.9 | 80.3 | 18 / 35 | 4082 |
| 4 | 1 | 68.2 | 86.0 | 22 / 35 | 4319 |
| 5 | 1 | 70.1 | 92.7 | 29 / 35 | 4279 |
| 6 | 1 | 68.2 | 87.3 | 25 / 35 | 4204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 50 | 88% |
| voidious.mini.BrokenSword 2.0.3 | 46 | 91% |
| jdw.Hurricane 1.4 | 32 | 91% |
| ds.Oo 2.2 | 13 | 92% |
| gre.svman4.Morfeas 1.4.1 | 4 | 25% |
| adt.Ar2 1.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 23 | 32% | 62 |
| voidious.mini.BrokenSword 2.0.3 | 17 | 24% | 53 |
| ds.Oo 2.2 | 8 | 11% | 28 |
| jdw.Hurricane 1.4 | 8 | 11% | 27 |
| gre.svman4.Morfeas 1.4.1 | 6 | 8% | 7 |
| awesomeness.Elite 1.0 | 4 | 6% | 11 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 11 |
| adt.Ar2 1.1 | 2 | 3% | 7 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |

## Melee bench: F26

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.1 | 132 / 210 | 1.89 | 19.1% | 31635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 19.1% | 132 |
| ak.Fermat 2.0 | 2.2 | 14.4% | 34 |
| lrem.Spectre 0.4.4 | 3.0 | 12.4% | 12 |
| shu.nitro.LENIN .T34 | 4.0 | 12.1% | 25 |
| js.PinBall 1.6 | 5.2 | 10.6% | 5 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.5% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.3% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.3 | 18 / 35 | 5176 |
| 2 | 1 | 69.0 | 88.6 | 22 / 35 | 5202 |
| 3 | 1 | 71.5 | 95.2 | 26 / 35 | 5847 |
| 4 | 1 | 67.7 | 84.8 | 18 / 35 | 5078 |
| 5 | 1 | 70.6 | 95.2 | 25 / 35 | 5287 |
| 6 | 1 | 69.1 | 88.6 | 23 / 35 | 5045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 46 | 78% |
| shu.nitro.LENIN .T34 | 42 | 69% |
| lrem.Spectre 0.4.4 | 39 | 90% |
| js.PinBall 1.6 | 10 | 90% |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 86% |
| gh.mini.GrubbmOne 1.0 | 7 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 28 | 36% | 66 |
| shu.nitro.LENIN .T34 | 20 | 26% | 52 |
| lrem.Spectre 0.4.4 | 16 | 21% | 41 |
| js.PinBall 1.6 | 6 | 8% | 19 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 5% | 11 |
| gh.mini.GrubbmOne 1.0 | 3 | 4% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 12 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.4 | 130 / 210 | 2.22 | 18.4% | 27406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.4% | 130 |
| mk.Alpha 0.2.1 | 2.3 | 13.7% | 36 |
| wee.Gem 1.8.4 | 3.3 | 11.7% | 27 |
| sheldor.melee.nano.TestMelee 0.1 | 3.7 | 11.2% | 11 |
| EH.Eagle 1.0.6 | 5.0 | 10.7% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 9.1% | 1 |
| joe.ADinosaur 1.0 | 7.2 | 8.2% | 1 |
| throxbot.ThroxBot 0.1 | 8.0 | 6.9% | 0 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.1% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 81.0 | 21 / 35 | 5970 |
| 2 | 1 | 67.5 | 87.0 | 22 / 35 | 4241 |
| 3 | 1 | 66.4 | 83.2 | 18 / 35 | 4250 |
| 4 | 1 | 68.6 | 90.5 | 25 / 35 | 4548 |
| 5 | 1 | 67.8 | 88.3 | 23 / 35 | 4162 |
| 6 | 1 | 67.6 | 88.6 | 21 / 35 | 4235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 68 | 78% |
| wee.Gem 1.8.4 | 35 | 66% |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 90% |
| techdude.kombat.FlamingKombat 1.5 | 14 | 100% |
| EH.Eagle 1.0.6 | 14 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 28 | 35% | 82 |
| wee.Gem 1.8.4 | 14 | 17% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 15% | 31 |
| joe.ADinosaur 1.0 | 9 | 11% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 7 | 9% | 19 |
| EH.Eagle 1.0.6 | 5 | 6% | 22 |
| throxbot.ThroxBot 0.1 | 3 | 4% | 4 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 1 |
| cs.Grudge 1.0 | 1 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 93.3 | 156 / 210 | 1.60 | 19.7% | 26018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 19.7% | 156 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 27 |
| uji.Antique 1.0 | 3.3 | 11.4% | 14 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.2% | 7 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.2% | 2 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.1% | 0 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.1% | 5 |
| stelo.PianistNano 1.2 | 8.7 | 6.2% | 0 |
| matt.advanced.Katana 1.0 | 8.7 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 97.5 | 28 / 35 | 4555 |
| 2 | 1 | 68.8 | 90.8 | 24 / 35 | 4270 |
| 3 | 1 | 69.6 | 93.0 | 25 / 35 | 4441 |
| 4 | 1 | 69.5 | 94.6 | 26 / 35 | 4301 |
| 5 | 1 | 69.4 | 92.1 | 27 / 35 | 4412 |
| 6 | 1 | 69.0 | 91.7 | 26 / 35 | 4039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 90 | 79% |
| uji.Antique 1.0 | 42 | 83% |
| qohnil.blot.BlotBot 3.61 | 22 | 86% |
| amk.ChumbaWumba 0.3 | 10 | 100% |
| ahr.ice.Ice 1.0.2 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 30 | 55% | 90 |
| uji.Antique 1.0 | 9 | 16% | 46 |
| qohnil.blot.BlotBot 3.61 | 5 | 9% | 25 |
| pfvicm.Sobieski 7.2.3b | 5 | 9% | 13 |
| amk.ChumbaWumba 0.3 | 3 | 5% | 10 |
| ahr.ice.Ice 1.0.2 | 1 | 2% | 16 |
| matt.advanced.Katana 1.0 | 1 | 2% | 4 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.4 | 125 / 210 | 2.14 | 18.8% | 27288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.8% | 125 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.8% | 36 |
| deewiant.Anomaly 0.2 | 2.5 | 14.9% | 36 |
| myl.micro.Troodon 1.10 | 4.2 | 11.6% | 2 |
| jok.PheonixM 0.1.2 | 4.8 | 10.2% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.9% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 6.5% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.6% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.7% | 2 |
| jangs.ns51 1.0 | 9.3 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.6 | 22 / 35 | 4591 |
| 2 | 1 | 70.1 | 91.1 | 23 / 35 | 4970 |
| 3 | 1 | 68.2 | 86.0 | 20 / 35 | 4156 |
| 4 | 1 | 69.8 | 88.9 | 19 / 35 | 5111 |
| 5 | 1 | 68.2 | 84.4 | 22 / 35 | 4244 |
| 6 | 1 | 67.9 | 86.0 | 19 / 35 | 4216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 61 | 79% |
| zyx.mega.YersiniaPestis 3.1 | 50 | 74% |
| myl.micro.Troodon 1.10 | 20 | 95% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| DBall.Anarchy 0.1 | 7 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 29 | 34% | 68 |
| deewiant.Anomaly 0.2 | 28 | 33% | 74 |
| myl.micro.Troodon 1.10 | 15 | 18% | 33 |
| jok.PheonixM 0.1.2 | 7 | 8% | 17 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 7 |

## Melee bench: F30

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 76.5 | 75 / 210 | 3.11 | 15.3% | 22007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.2 | 15.3% | 75 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.0% | 26 |
| catcat20.Matcha 0.006 | 3.0 | 13.6% | 42 |
| oog.melee.Capulet 1.2 | 3.8 | 12.9% | 26 |
| darkcanuck.B26354 1.06 | 4.0 | 12.9% | 29 |
| ntc.Opposite 1.5 | 6.8 | 7.8% | 0 |
| intruder.PrairieWolf 2.61 | 7.0 | 8.2% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.7% | 5 |
| tripphippy.Alice 1.1 | 9.0 | 6.4% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 77.1 | 11 / 35 | 3636 |
| 2 | 1 | 63.9 | 77.5 | 12 / 35 | 3857 |
| 3 | 1 | 64.9 | 81.0 | 14 / 35 | 3740 |
| 4 | 2 | 62.2 | 72.7 | 13 / 35 | 3603 |
| 5 | 1 | 64.1 | 77.1 | 13 / 35 | 3840 |
| 6 | 1 | 62.0 | 73.7 | 12 / 35 | 3331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 34 | 71% |
| darkcanuck.B26354 1.06 | 26 | 65% |
| oog.melee.Capulet 1.2 | 16 | 88% |
| stelo.PastFuture 2.3.2 | 16 | 63% |
| tripphippy.Alice 1.1 | 5 | 100% |
| intruder.PrairieWolf 2.61 | 4 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 33 | 24% | 58 |
| stelo.PastFuture 2.3.2 | 31 | 23% | 42 |
| darkcanuck.B26354 1.06 | 24 | 18% | 43 |
| oog.melee.Capulet 1.2 | 22 | 16% | 35 |
| ntc.Opposite 1.5 | 10 | 7% | 10 |
| intruder.PrairieWolf 2.61 | 7 | 5% | 9 |
| tripphippy.Alice 1.1 | 5 | 4% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 5 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 76.0 | 67 / 210 | 3.16 | 14.9% | 19876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.3% | 81 |
| hadur117.mini.DeiseP3 0.4 | 2.3 | 14.9% | 67 |
| gh.mini.Griezel 0.2 | 2.8 | 13.7% | 42 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.3% | 4 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.0% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 7 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.4% | 1 |
| fm.mammillarias 1.3 | 7.7 | 6.5% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 78.4 | 10 / 35 | 3340 |
| 2 | 2 | 63.6 | 74.9 | 15 / 35 | 3305 |
| 3 | 3 | 61.6 | 71.4 | 10 / 35 | 3429 |
| 4 | 2 | 62.0 | 75.2 | 8 / 35 | 3216 |
| 5 | 3 | 62.3 | 75.2 | 11 / 35 | 3085 |
| 6 | 2 | 64.2 | 80.6 | 13 / 35 | 3501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 48 | 56% |
| gh.mini.Griezel 0.2 | 34 | 59% |
| d414.nano.Quantum 1.0.0 | 9 | 100% |
| spinnercat.micro.Tyger 0.1 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 44 | 31% | 74 |
| gh.mini.Griezel 0.2 | 44 | 31% | 60 |
| spinnercat.micro.Tyger 0.1 | 23 | 16% | 32 |
| d414.nano.Quantum 1.0.0 | 11 | 8% | 18 |
| fm.mammillarias 1.3 | 10 | 7% | 11 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 6 |
| gh.nano.Grofvuil 0.2 | 4 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.3 | 122 / 210 | 2.06 | 18.4% | 27615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.4% | 122 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.6% | 59 |
| apc.botM 3.0 | 3.0 | 12.2% | 17 |
| lxx.ConceptA 0.8 | 4.0 | 10.5% | 2 |
| bayen.UbaMicro 1.4 | 5.2 | 9.4% | 3 |
| vjik.UnViolation 1.1 | 5.8 | 9.2% | 4 |
| panzer.Panzer 0.2 | 7.2 | 7.2% | 1 |
| conscience.Electron 1.3g | 8.3 | 6.2% | 0 |
| yk.JahMicro 1.0 | 9.2 | 6.0% | 2 |
| donjezza.Jezza 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 92.7 | 25 / 35 | 4964 |
| 2 | 1 | 65.4 | 80.0 | 18 / 35 | 4453 |
| 3 | 1 | 66.9 | 84.8 | 19 / 35 | 4641 |
| 4 | 1 | 68.7 | 93.3 | 22 / 35 | 4478 |
| 5 | 1 | 68.5 | 90.2 | 21 / 35 | 4563 |
| 6 | 1 | 67.5 | 88.6 | 17 / 35 | 4516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 92 | 59% |
| apc.botM 3.0 | 33 | 79% |
| lxx.ConceptA 0.8 | 20 | 100% |
| bayen.UbaMicro 1.4 | 11 | 91% |
| vjik.UnViolation 1.1 | 6 | 83% |
| donjezza.Jezza 1.0 | 3 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |
| yk.JahMicro 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 49 | 56% | 104 |
| apc.botM 3.0 | 15 | 17% | 46 |
| lxx.ConceptA 0.8 | 6 | 7% | 11 |
| panzer.Panzer 0.2 | 6 | 7% | 6 |
| conscience.Electron 1.3g | 4 | 5% | 7 |
| vjik.UnViolation 1.1 | 3 | 3% | 14 |
| bayen.UbaMicro 1.4 | 3 | 3% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 7 |
| yk.JahMicro 1.0 | 1 | 1% | 5 |

## Melee bench: F33

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.2 | 155 / 210 | 1.70 | 20.2% | 30656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 20.2% | 155 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.5% | 10 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.5% | 3 |
| labg.Cataclysm 2.05 | 4.7 | 10.0% | 8 |
| baal.nano.N 1.42 | 6.0 | 8.4% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.1% | 2 |
| zyx.micro.Ant 1.1 | 8.8 | 4.9% | 0 |
| sanja.First 0.1 | 9.0 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.8 | 24 / 35 | 4894 |
| 2 | 1 | 71.1 | 93.7 | 27 / 35 | 5370 |
| 3 | 1 | 70.8 | 92.1 | 28 / 35 | 5103 |
| 4 | 1 | 69.9 | 91.7 | 23 / 35 | 4869 |
| 5 | 1 | 71.7 | 95.6 | 29 / 35 | 5410 |
| 6 | 1 | 70.1 | 90.2 | 24 / 35 | 5010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 53 | 92% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 90% |
| gre.svman4.Leonidas 1.3.2 | 31 | 100% |
| labg.Cataclysm 2.05 | 15 | 73% |
| kinsen.melee.Angsaichmophobia 1.8c | 14 | 86% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 100% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 31 | 56% | 96 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 20% | 57 |
| labg.Cataclysm 2.05 | 5 | 9% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 5% | 12 |
| gre.svman4.Leonidas 1.3.2 | 2 | 4% | 18 |
| zyx.micro.Ant 1.1 | 2 | 4% | 6 |
| baal.nano.N 1.42 | 1 | 2% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |
| sanja.First 0.1 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.3 | 93 / 210 | 2.32 | 17.5% | 27493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.3 | 17.5% | 93 |
| kid.Gladiator .7.2 | 2.2 | 16.4% | 41 |
| stelo.Spread 0.9 | 2.5 | 16.2% | 63 |
| jcs.Seth 1.8 | 4.5 | 10.8% | 9 |
| tcf.Reach 3 | 4.7 | 10.7% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.5% | 0 |
| ratosh.Wesco 1.4 | 6.8 | 7.7% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.3 | 18 / 35 | 4671 |
| 2 | 1 | 69.0 | 91.1 | 21 / 35 | 4367 |
| 3 | 3 | 66.6 | 83.5 | 12 / 35 | 4198 |
| 4 | 1 | 68.1 | 87.3 | 15 / 35 | 4675 |
| 5 | 1 | 68.6 | 86.0 | 14 / 35 | 5108 |
| 6 | 1 | 66.2 | 82.9 | 13 / 35 | 4474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 68 | 53% |
| kid.Gladiator .7.2 | 49 | 69% |
| jcs.Seth 1.8 | 18 | 78% |
| tcf.Reach 3 | 6 | 83% |
| ratosh.Wesco 1.4 | 2 | 100% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 1055. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 48 | 41% | 82 |
| kid.Gladiator .7.2 | 46 | 39% | 77 |
| jcs.Seth 1.8 | 8 | 7% | 25 |
| tcf.Reach 3 | 8 | 7% | 13 |
| cli.Dancer 1.1 | 3 | 3% | 6 |
| ratosh.Wesco 1.4 | 2 | 2% | 4 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 82.6 | 40 / 210 | 2.56 | 15.4% | 20542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 147 |
| hadur117.mini.DeiseP3 0.4 | 2.0 | 15.4% | 40 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.6% | 12 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.2% | 11 |
| rz.HawkOnFire 0.1 | 4.7 | 11.1% | 0 |
| wit.Chuliath 1.0 | 6.3 | 7.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.9% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 83.5 | 10 / 35 | 3396 |
| 2 | 2 | 64.4 | 83.8 | 4 / 35 | 3405 |
| 3 | 2 | 63.4 | 79.4 | 6 / 35 | 3346 |
| 4 | 2 | 65.0 | 83.5 | 8 / 35 | 3434 |
| 5 | 2 | 63.6 | 81.0 | 5 / 35 | 3453 |
| 6 | 2 | 64.5 | 84.8 | 7 / 35 | 3508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 113 | 18% |
| gh.mini.Gruwel 0.9 | 14 | 71% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 67% |
| rz.HawkOnFire 0.1 | 2 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 110 | 64% | 130 |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 12% | 25 |
| gh.mini.Gruwel 0.9 | 20 | 12% | 32 |
| rz.HawkOnFire 0.1 | 15 | 9% | 17 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |
| wit.Chuliath 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.1 | 175 / 210 | 1.53 | 21.0% | 31708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 21.0% | 175 |
| bzdp.Pansy 2.1 | 2.5 | 12.3% | 10 |
| alpha.RainingFire 1.0 | 3.0 | 11.7% | 9 |
| mz.Cork 0.1 | 4.3 | 10.4% | 6 |
| bvh.micro.Freya 0.3 | 4.8 | 10.3% | 7 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.3% | 0 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.8% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 95.9 | 31 / 35 | 5199 |
| 2 | 1 | 69.9 | 91.4 | 25 / 35 | 4928 |
| 3 | 1 | 70.6 | 91.7 | 27 / 35 | 5341 |
| 4 | 1 | 72.3 | 96.5 | 32 / 35 | 5613 |
| 5 | 1 | 71.0 | 93.7 | 29 / 35 | 5345 |
| 6 | 1 | 71.8 | 95.6 | 31 / 35 | 5282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 95% |
| alpha.RainingFire 1.0 | 34 | 97% |
| bvh.micro.Freya 0.3 | 33 | 91% |
| mz.Cork 0.1 | 31 | 94% |
| bvh.mini.Fenrir 0.39 | 17 | 100% |
| m3thos.Eva02 0.7.1 | 14 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 37% | 63 |
| mz.Cork 0.1 | 6 | 17% | 37 |
| bvh.micro.Freya 0.3 | 6 | 17% | 23 |
| alpha.RainingFire 1.0 | 4 | 11% | 36 |
| m3thos.Eva02 0.7.1 | 2 | 6% | 19 |
| bvh.mini.Fenrir 0.39 | 2 | 6% | 9 |
| dl.BetterWalls 1.0 | 1 | 3% | 12 |
| sample.MyFirstRobot 1.0 | 1 | 3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

## Melee bench: F37

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 95.6 | 188 / 210 | 1.40 | 20.7% | 33610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 20.7% | 188 |
| germ.TheMind .2 | 2.3 | 10.7% | 5 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.3% | 4 |
| EBBU.Sim2 1.02 | 5.0 | 9.0% | 1 |
| agrach.Dalek 1.0 | 5.8 | 8.9% | 2 |
| lmk.ACPFinal 0.1 | 6.7 | 8.6% | 2 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.4% | 3 |
| skm.Ryubot 1.0 | 7.5 | 8.0% | 1 |
| mb.Beast 0.1 | 7.8 | 7.7% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.3 | 30 / 35 | 5548 |
| 2 | 1 | 70.9 | 100.0 | 35 / 35 | 5233 |
| 3 | 1 | 70.8 | 97.1 | 31 / 35 | 5663 |
| 4 | 1 | 69.8 | 94.0 | 31 / 35 | 5456 |
| 5 | 1 | 69.9 | 94.3 | 30 / 35 | 5672 |
| 6 | 1 | 70.4 | 94.0 | 31 / 35 | 6038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 100% |
| agrach.Dalek 1.0 | 27 | 96% |
| mb.Beast 0.1 | 25 | 100% |
| skm.Ryubot 1.0 | 23 | 100% |
| stelo.UntouchableNano 1.3 | 21 | 90% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 100% |
| lmk.ACPFinal 0.1 | 18 | 100% |
| EBBU.Sim2 1.02 | 17 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 22 of 210 rounds, at a mean tick of 459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 4 | 18% | 36 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 18% | 30 |
| mb.Beast 0.1 | 3 | 14% | 22 |
| EBBU.Sim2 1.02 | 3 | 14% | 21 |
| stelo.UntouchableNano 1.3 | 3 | 14% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 14% | 7 |
| agrach.Dalek 1.0 | 1 | 5% | 41 |
| lmk.ACPFinal 0.1 | 1 | 5% | 22 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |

## Melee bench: F38

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.1 | 92 / 210 | 2.70 | 16.3% | 23782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.3 | 16.3% | 92 |
| justin.Mallais 14.0 | 1.7 | 15.9% | 69 |
| bvh.mini.Freya 0.55 | 3.3 | 12.7% | 17 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.6% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 10.9% | 5 |
| cs.Wren 1.0 | 5.5 | 10.3% | 4 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.9% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.5% | 1 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.4% | 1 |
| bzdp.BoxCar 2.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 80.0 | 13 / 35 | 3891 |
| 2 | 1 | 67.2 | 85.1 | 21 / 35 | 4322 |
| 3 | 2 | 61.9 | 73.7 | 10 / 35 | 3397 |
| 4 | 1 | 66.7 | 83.5 | 19 / 35 | 4222 |
| 5 | 1 | 66.3 | 85.1 | 16 / 35 | 3979 |
| 6 | 2 | 64.8 | 79.0 | 13 / 35 | 3971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 48 | 63% |
| bvh.mini.Freya 0.55 | 25 | 80% |
| bts.mega.Gnarly 1.4 | 15 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 93% |
| cs.Wren 1.0 | 8 | 100% |
| kdf.KoulDestroyer 1.0 | 6 | 100% |
| matt.UnderDark3 2.4.34 | 2 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 48 | 40% | 82 |
| bvh.mini.Freya 0.55 | 27 | 23% | 40 |
| bts.mega.Gnarly 1.4 | 19 | 16% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 11% | 27 |
| cs.Wren 1.0 | 6 | 5% | 11 |
| kdf.KoulDestroyer 1.0 | 3 | 3% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 3 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.2 | 105 / 210 | 2.33 | 17.6% | 27456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.2 | 17.6% | 105 |
| bvh.fry.Freya 0.82 | 1.8 | 15.1% | 23 |
| az.Ololobot 0.2.4 | 3.0 | 13.5% | 64 |
| catcat20.Lambda 0.024 | 4.2 | 10.7% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 8.9% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.2% | 0 |
| gimp.GimpBot 0.1 | 7.0 | 7.8% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.3 | 7.9% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.2 | 19 / 35 | 4955 |
| 2 | 1 | 65.7 | 81.3 | 17 / 35 | 4570 |
| 3 | 1 | 68.5 | 91.1 | 22 / 35 | 4594 |
| 4 | 1 | 67.1 | 83.8 | 19 / 35 | 4865 |
| 5 | 1 | 66.9 | 87.0 | 19 / 35 | 4221 |
| 6 | 2 | 63.9 | 79.0 | 9 / 35 | 4251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 53 | 49% |
| bvh.fry.Freya 0.82 | 41 | 85% |
| catcat20.Lambda 0.024 | 31 | 84% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1064. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 41 | 39% | 80 |
| az.Ololobot 0.2.4 | 33 | 31% | 59 |
| catcat20.Lambda 0.024 | 14 | 13% | 34 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 7% | 12 |
| apollokidd.ApolloKidd 0.9 | 5 | 5% | 8 |
| gimp.GimpBot 0.1 | 4 | 4% | 9 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.7 | 120 / 210 | 2.20 | 18.4% | 27830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.4% | 120 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.4% | 41 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.2% | 23 |
| mz.AntiGrav 1.0 | 4.5 | 10.8% | 3 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.4% | 7 |
| stelo.Randomness 1.0 | 6.5 | 8.9% | 11 |
| alpha.BlackIce 1.0 | 6.5 | 8.3% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 5.8% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.5% | 0 |
| sample.Corners 1.0 | 9.8 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.0 | 16 / 35 | 4109 |
| 2 | 1 | 70.4 | 93.7 | 24 / 35 | 5055 |
| 3 | 1 | 67.6 | 87.0 | 18 / 35 | 4498 |
| 4 | 1 | 67.3 | 81.9 | 20 / 35 | 4750 |
| 5 | 1 | 68.3 | 88.6 | 20 / 35 | 4566 |
| 6 | 1 | 68.6 | 88.3 | 22 / 35 | 4852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 70 | 71% |
| kano.gamma.KanoGamma 1.8 | 32 | 72% |
| mz.AntiGrav 1.0 | 22 | 100% |
| Polkwane.SmashMelee 1.0 | 14 | 71% |
| stelo.Randomness 1.0 | 10 | 80% |
| alpha.BlackIce 1.0 | 3 | 67% |
| sample.Corners 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 38 | 42% | 73 |
| kano.gamma.KanoGamma 1.8 | 14 | 15% | 41 |
| mz.AntiGrav 1.0 | 8 | 9% | 28 |
| Polkwane.SmashMelee 1.0 | 8 | 9% | 21 |
| stelo.Randomness 1.0 | 8 | 9% | 20 |
| alpha.BlackIce 1.0 | 7 | 8% | 11 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 7 |
| sample.Corners 1.0 | 1 | 1% | 5 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F41

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.8 | 113 / 210 | 2.19 | 17.7% | 23830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.2 | 17.7% | 113 |
| eem.EvBotNG v12.8 | 2.0 | 15.6% | 60 |
| ary.Swarm 1.1 | 3.0 | 13.4% | 10 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 11.9% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.4% | 14 |
| shrub.Silver v048 | 6.0 | 8.8% | 0 |
| zyx.nano.Ant 1.1 | 7.2 | 7.2% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.3% | 2 |
| stelo.Mirror 1.1 | 8.7 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.7 | 19 / 35 | 4139 |
| 2 | 1 | 67.6 | 89.5 | 19 / 35 | 4018 |
| 3 | 1 | 68.7 | 90.5 | 25 / 35 | 3835 |
| 4 | 1 | 68.6 | 89.5 | 21 / 35 | 4187 |
| 5 | 2 | 65.7 | 81.3 | 11 / 35 | 3884 |
| 6 | 1 | 66.2 | 83.2 | 18 / 35 | 3767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 64 | 52% |
| ary.Swarm 1.1 | 33 | 85% |
| lessonz.robocode.Oz 0.5.0 | 28 | 96% |
| simonton.nano.MeleeSeed 1.8 | 24 | 88% |
| zyx.nano.Ant 1.1 | 2 | 50% |
| stelo.Mirror 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 50% | 84 |
| ary.Swarm 1.1 | 19 | 19% | 46 |
| simonton.nano.MeleeSeed 1.8 | 14 | 14% | 38 |
| lessonz.robocode.Oz 0.5.0 | 6 | 6% | 22 |
| zyx.nano.Ant 1.1 | 4 | 4% | 7 |
| jsal.Jsalbot 1.0 | 3 | 3% | 7 |
| shrub.Silver v048 | 1 | 1% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.6 | 115 / 210 | 2.21 | 18.2% | 29749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 18.2% | 115 |
| wompi.Wallaby 5.1 | 2.3 | 15.2% | 48 |
| ara.Shera 0.88 | 3.2 | 14.2% | 31 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.8% | 15 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 1 |
| maribo.IotaCT 1.1 | 6.3 | 7.2% | 0 |
| dsw.StaticD 1.0 | 6.8 | 6.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.6 | 19 / 35 | 4889 |
| 2 | 1 | 67.9 | 87.9 | 19 / 35 | 4594 |
| 3 | 1 | 67.0 | 83.2 | 16 / 35 | 4811 |
| 4 | 1 | 69.3 | 88.3 | 21 / 35 | 5473 |
| 5 | 1 | 68.4 | 86.7 | 21 / 35 | 5017 |
| 6 | 1 | 67.9 | 85.7 | 19 / 35 | 4965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 51 | 76% |
| wompi.Wallaby 5.1 | 42 | 81% |
| maribo.mini.MiniQuester 0.1 | 41 | 93% |
| amz.NanoClone 1.41 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 37 | 39% | 70 |
| wompi.Wallaby 5.1 | 26 | 27% | 64 |
| maribo.mini.MiniQuester 0.1 | 25 | 26% | 63 |
| amz.NanoClone 1.41 | 5 | 5% | 7 |
| maribo.IotaCT 1.1 | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |
| dsw.StaticD 1.0 | 0 | 0% | 2 |

## Melee bench: F43

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 77.1 | 41 / 210 | 3.06 | 14.8% | 20789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 143 |
| hadur117.mini.DeiseP3 0.4 | 2.2 | 14.8% | 41 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.8% | 15 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.2% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.0% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.6% | 1 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 82.5 | 8 / 35 | 3722 |
| 2 | 3 | 61.4 | 68.3 | 6 / 35 | 3040 |
| 3 | 2 | 65.9 | 82.2 | 7 / 35 | 3762 |
| 4 | 2 | 64.4 | 77.5 | 7 / 35 | 3589 |
| 5 | 2 | 64.9 | 78.7 | 8 / 35 | 3818 |
| 6 | 2 | 62.3 | 73.7 | 5 / 35 | 2858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 91 | 23% |
| brainfade.melee.Dusk 0.44 | 11 | 82% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| cvt.Firsty 1.0 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 107 | 63% | 127 |
| brainfade.melee.Dusk 0.44 | 23 | 14% | 32 |
| dummy.micro.Sparrow 2.5 | 17 | 10% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 7% | 14 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| Krabb.akim2.Akim2 1.1b | 1 | 1% | 3 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |

## Melee bench: F44

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.6 | 137 / 210 | 1.84 | 19.5% | 29721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 19.5% | 137 |
| stelo.Liblix 0.3.1 | 2.0 | 15.4% | 41 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.9% | 22 |
| wompi.Quokka 1.6 | 4.2 | 10.7% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.4% | 1 |
| jwirde.Gort 2.0 | 6.2 | 8.2% | 4 |
| disan.Chair 2.2.0 | 7.0 | 7.6% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.4% | 1 |
| sample.Crazy 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.8 | 18 / 35 | 4734 |
| 2 | 1 | 70.3 | 93.7 | 24 / 35 | 4880 |
| 3 | 1 | 69.8 | 90.8 | 23 / 35 | 4790 |
| 4 | 1 | 70.3 | 91.4 | 24 / 35 | 5144 |
| 5 | 1 | 68.9 | 88.3 | 23 / 35 | 5017 |
| 6 | 1 | 71.0 | 94.9 | 25 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 82 | 84% |
| tzu.TheArtOfWar 1.2 | 51 | 82% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 100% |
| wompi.Quokka 1.6 | 8 | 88% |
| jwirde.Gort 2.0 | 4 | 75% |
| disan.Chair 2.2.0 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 0% |

Hadur died in 74 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 32 | 43% | 100 |
| tzu.TheArtOfWar 1.2 | 22 | 30% | 64 |
| wompi.Quokka 1.6 | 7 | 9% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 12 |
| jwirde.Gort 2.0 | 3 | 4% | 10 |
| disan.Chair 2.2.0 | 3 | 4% | 4 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.5 | 79 / 210 | 2.04 | 19.6% | 35270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP3 0.4 | 1.0 | 19.6% | 79 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.8% | 118 |
| jje.BagPuss 1.2 | 3.3 | 11.8% | 6 |
| myl.nano.Graviton 1.10 | 4.5 | 9.9% | 0 |
| sul.Lunar 1.1 | 5.0 | 9.3% | 3 |
| fm.claire 1.7 | 6.5 | 8.5% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 8.1% | 2 |
| hvilela.HVilela 0.9 | 7.0 | 8.4% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.4% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.1 | 10 / 35 | 5831 |
| 2 | 1 | 69.8 | 89.8 | 12 / 35 | 6023 |
| 3 | 1 | 71.3 | 93.3 | 19 / 35 | 6181 |
| 4 | 1 | 69.0 | 89.5 | 10 / 35 | 5693 |
| 5 | 1 | 68.9 | 87.6 | 16 / 35 | 5741 |
| 6 | 1 | 68.7 | 86.3 | 12 / 35 | 5801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 125 | 22% |
| jje.BagPuss 1.2 | 20 | 80% |
| sul.Lunar 1.1 | 10 | 100% |
| myl.nano.Graviton 1.10 | 9 | 100% |
| wit.Deep7 2.0 | 7 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 100% |
| fm.claire 1.7 | 3 | 67% |

Hadur died in 132 of 210 rounds, at a mean tick of 2417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 98 | 74% | 0 |
| jje.BagPuss 1.2 | 11 | 8% | 69 |
| myl.nano.Graviton 1.10 | 7 | 5% | 35 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 19 |
| fm.claire 1.7 | 4 | 3% | 13 |
| sul.Lunar 1.1 | 3 | 2% | 46 |
| hvilela.HVilela 0.9 | 2 | 2% | 11 |
| wit.Deep7 2.0 | 1 | 1% | 15 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseP3 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.9 | 63 / 210 | 2.45 | 16.5% | 25161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.3% | 78 |
| hadur117.mini.DeiseP3 0.4 | 2.2 | 16.5% | 63 |
| kc.mini.Mirage 0.2 | 2.3 | 16.6% | 58 |
| mz.MicroSheep 1.0 | 4.2 | 10.5% | 2 |
| cx.Princess 1.0 | 5.2 | 9.7% | 9 |
| sadoner.killer 0.2 | 5.8 | 8.9% | 0 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.1% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 80.3 | 7 / 35 | 4036 |
| 2 | 2 | 66.8 | 86.0 | 14 / 35 | 3951 |
| 3 | 1 | 67.0 | 87.6 | 9 / 35 | 4545 |
| 4 | 3 | 64.9 | 79.0 | 11 / 35 | 4083 |
| 5 | 1 | 67.2 | 86.0 | 12 / 35 | 4667 |
| 6 | 3 | 65.6 | 84.4 | 10 / 35 | 3879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 60 | 52% |
| rsalesc.melee.Medina 0.4.5 | 56 | 30% |
| cx.Princess 1.0 | 10 | 60% |
| mz.MicroSheep 1.0 | 7 | 100% |
| sadoner.killer 0.2 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 1078. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 63 | 43% | 82 |
| kc.mini.Mirage 0.2 | 62 | 42% | 91 |
| cx.Princess 1.0 | 7 | 5% | 9 |
| mz.MicroSheep 1.0 | 6 | 4% | 14 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 9 |
| sadoner.killer 0.2 | 2 | 1% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |

