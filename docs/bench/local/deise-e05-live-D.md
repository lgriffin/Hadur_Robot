# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.1 | 57 / 210 | 2.25 | 17.3% | 31021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 133 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 17.3% | 57 |
| sgp.JollyNinja 3.53 | 3.3 | 12.0% | 18 |
| mz.MicroGodMelee 1 | 4.7 | 9.9% | 2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.0% | 1 |
| lorneswork.Predator 1.0 | 5.3 | 9.4% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.8% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 85.1 | 8 / 35 | 5334 |
| 2 | 2 | 68.9 | 90.2 | 14 / 35 | 5450 |
| 3 | 2 | 66.5 | 85.1 | 9 / 35 | 5095 |
| 4 | 2 | 66.1 | 83.8 | 10 / 35 | 4730 |
| 5 | 2 | 67.2 | 86.0 | 9 / 35 | 5382 |
| 6 | 2 | 67.1 | 86.7 | 7 / 35 | 5030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 19% |
| sgp.JollyNinja 3.53 | 23 | 74% |
| mz.MicroGodMelee 1 | 8 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| lorneswork.Predator 1.0 | 4 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 1191. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 74% | 143 |
| sgp.JollyNinja 3.53 | 19 | 12% | 27 |
| mz.MicroGodMelee 1 | 8 | 5% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 5% | 9 |
| lorneswork.Predator 1.0 | 2 | 1% | 7 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.5 | 98 / 210 | 2.67 | 17.7% | 30125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.2 | 17.7% | 98 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.5% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.7% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.2% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.6% | 10 |
| Noran.BitchingElk 0.054 | 6.5 | 7.9% | 10 |
| sch.Simone 0.3d | 7.3 | 7.4% | 9 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.5% | 2 |
| stelo.PatternRobot 1.0 | 8.7 | 6.2% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 74.3 | 12 / 35 | 4924 |
| 2 | 1 | 68.2 | 83.8 | 20 / 35 | 5349 |
| 3 | 1 | 67.2 | 85.1 | 16 / 35 | 4680 |
| 4 | 1 | 66.5 | 82.2 | 12 / 35 | 5098 |
| 5 | 1 | 66.5 | 79.7 | 17 / 35 | 4883 |
| 6 | 1 | 68.2 | 83.8 | 21 / 35 | 5191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 51 | 69% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 40 | 73% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 80% |
| Noran.BitchingElk 0.054 | 10 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| stelo.PatternRobot 1.0 | 7 | 86% |
| sch.Simone 0.3d | 5 | 60% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 38 | 34% | 73 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 25% | 62 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 13% | 17 |
| Noran.BitchingElk 0.054 | 7 | 6% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 5% | 15 |
| stelo.PatternRobot 1.0 | 6 | 5% | 11 |
| sch.Simone 0.3d | 6 | 5% | 6 |
| fullsail.SweetTea 1.1 | 4 | 4% | 8 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 3 |

## Melee bench: F03

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.5 | 164 / 210 | 1.59 | 20.8% | 38788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.8% | 164 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.0% | 16 |
| radnor.DoctorBob 1.42 | 3.0 | 12.9% | 10 |
| vuen.Cake 2.51 | 3.2 | 12.6% | 19 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.3% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 7.0% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.2% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.6 | 27 / 35 | 6778 |
| 2 | 1 | 70.5 | 90.8 | 26 / 35 | 6339 |
| 3 | 1 | 70.7 | 93.3 | 27 / 35 | 6235 |
| 4 | 1 | 70.3 | 90.5 | 25 / 35 | 6434 |
| 5 | 1 | 72.2 | 98.1 | 30 / 35 | 6728 |
| 6 | 1 | 70.9 | 93.7 | 29 / 35 | 6274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 79% |
| kawigi.nano.Lib 1.0 | 65 | 95% |
| radnor.DoctorBob 1.42 | 40 | 98% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 18 | 38% | 73 |
| radnor.DoctorBob 1.42 | 11 | 23% | 36 |
| kawigi.nano.Lib 1.0 | 9 | 19% | 67 |
| urdos.URDOS 1.3 | 4 | 8% | 8 |
| oa.weak.FlyMk1 0.1 | 2 | 4% | 9 |
| adt.Ar1 2.1 | 2 | 4% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 4% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.0 | 32 / 210 | 2.35 | 17.5% | 34724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.9% | 167 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 17.5% | 32 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 10.3% | 1 |
| josago.Jorgito 0.16 | 5.0 | 8.8% | 3 |
| css.Delitioner 0.11 | 6.0 | 7.3% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 78.7 | 4 / 35 | 5472 |
| 2 | 2 | 67.7 | 84.1 | 2 / 35 | 5743 |
| 3 | 2 | 67.6 | 83.5 | 5 / 35 | 5669 |
| 4 | 2 | 67.8 | 86.0 | 3 / 35 | 5810 |
| 5 | 2 | 69.1 | 88.9 | 9 / 35 | 5773 |
| 6 | 2 | 69.7 | 88.9 | 9 / 35 | 6257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 154 | 16% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| TNT.TNT 0.99.1 | 3 | 100% |
| josago.Jorgito 0.16 | 2 | 50% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 1369. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 151 | 84% | 175 |
| apc.LeeroyJenkins2 1.0 | 13 | 7% | 18 |
| josago.Jorgito 0.16 | 5 | 3% | 6 |
| TNT.TNT 0.99.1 | 3 | 2% | 7 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 2 | 1% | 0 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 70.3 | 17 / 210 | 3.68 | 13.2% | 21137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 19.1% | 124 |
| justin.DemonicRage 3.4 | 1.8 | 16.7% | 55 |
| hadur117.mini.DeiseD 0.3 | 3.3 | 13.2% | 17 |
| wompi.Numbat 2.1 | 3.7 | 12.5% | 8 |
| ms.Ares 0.19 | 5.0 | 9.7% | 2 |
| axeBots.HataMoto 3.09 | 6.0 | 8.2% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 6.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.2 | 67.9 | 1 / 35 | 3722 |
| 2 | 4 | 58.4 | 64.1 | 4 / 35 | 3227 |
| 3 | 3 | 60.9 | 71.1 | 3 / 35 | 3442 |
| 4 | 3 | 59.5 | 69.5 | 1 / 35 | 3320 |
| 5 | 3 | 62.3 | 73.0 | 6 / 35 | 3918 |
| 6 | 3 | 62.2 | 75.9 | 2 / 35 | 3508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 37 | 8% |
| justin.DemonicRage 3.4 | 21 | 38% |
| wompi.Numbat 2.1 | 5 | 80% |
| axeBots.HataMoto 3.09 | 2 | 100% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 193 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 75 | 39% | 80 |
| justin.DemonicRage 3.4 | 50 | 26% | 55 |
| wompi.Numbat 2.1 | 32 | 17% | 37 |
| ms.Ares 0.19 | 15 | 8% | 15 |
| axeBots.HataMoto 3.09 | 8 | 4% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 4% | 7 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 82.4 | 96 / 210 | 2.59 | 17.3% | 28403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.2 | 17.3% | 96 |
| jekl.StoneGhost 0.7 | 2.3 | 14.7% | 29 |
| origin.SleepSiphon 1.7b | 2.7 | 14.4% | 54 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 17 |
| mld.Wisdom 1.0 | 5.0 | 10.1% | 3 |
| gg.Wolverine 2.0 | 6.2 | 8.2% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.9% | 4 |
| spinnercat.Omen 1.0 | 7.8 | 6.7% | 1 |
| DBall.NUKE 0.1 | 8.3 | 6.2% | 1 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.2 | 18 / 35 | 4350 |
| 2 | 1 | 68.2 | 85.1 | 18 / 35 | 5294 |
| 3 | 1 | 69.1 | 89.2 | 21 / 35 | 5039 |
| 4 | 1 | 65.5 | 78.7 | 14 / 35 | 4840 |
| 5 | 2 | 65.6 | 80.0 | 12 / 35 | 4536 |
| 6 | 1 | 65.3 | 79.0 | 13 / 35 | 4344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 44 | 68% |
| jekl.StoneGhost 0.7 | 33 | 85% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 75% |
| gg.Wolverine 2.0 | 7 | 71% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 71% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 41 | 35% | 61 |
| origin.SleepSiphon 1.7b | 33 | 28% | 69 |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 18% | 40 |
| mld.Wisdom 1.0 | 9 | 8% | 13 |
| gg.Wolverine 2.0 | 6 | 5% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 4% | 11 |
| spinnercat.Omen 1.0 | 1 | 1% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.9 | 124 / 210 | 1.64 | 20.1% | 36094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.1% | 124 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.4% | 45 |
| rtk.Tachikoma 1.0 | 2.8 | 15.6% | 28 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.9% | 5 |
| franzor.Lizt 1.3.1 | 4.8 | 10.3% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.6% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.6 | 24 / 35 | 6181 |
| 2 | 1 | 71.8 | 94.6 | 23 / 35 | 6062 |
| 3 | 1 | 70.3 | 89.2 | 14 / 35 | 6072 |
| 4 | 1 | 70.3 | 89.8 | 17 / 35 | 5652 |
| 5 | 1 | 72.1 | 94.0 | 22 / 35 | 6078 |
| 6 | 1 | 72.2 | 94.9 | 24 / 35 | 6049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 89 | 76% |
| rsalesc.melee.Monk 0.3.6c | 52 | 35% |
| oog.melee.CapuletDroid 1.1 | 27 | 96% |
| franzor.Lizt 1.3.1 | 17 | 65% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 44 | 51% | 71 |
| rtk.Tachikoma 1.0 | 30 | 34% | 105 |
| franzor.Lizt 1.3.1 | 7 | 8% | 1 |
| oog.melee.CapuletDroid 1.1 | 4 | 5% | 28 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.7 | 119 / 210 | 2.29 | 18.6% | 30254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.6% | 119 |
| tm.Yuugao 1.0 | 2.5 | 13.2% | 38 |
| shrub.Vapour v159 | 2.8 | 12.9% | 27 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.1% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.2% | 4 |
| m3thos.Eva00 1.1 | 6.7 | 8.2% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.0% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.3% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.4 | 22 / 35 | 4991 |
| 2 | 1 | 67.2 | 83.8 | 18 / 35 | 5091 |
| 3 | 1 | 68.3 | 89.2 | 21 / 35 | 4863 |
| 4 | 1 | 68.5 | 88.6 | 20 / 35 | 5106 |
| 5 | 1 | 67.6 | 84.4 | 20 / 35 | 5172 |
| 6 | 1 | 67.4 | 82.9 | 18 / 35 | 5031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 69% |
| shrub.Vapour v159 | 39 | 77% |
| Krabb.sliNk.Garm 0.9u | 23 | 91% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 100% |
| m3thos.Eva00 1.1 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 36 | 40% | 77 |
| shrub.Vapour v159 | 32 | 35% | 61 |
| Krabb.sliNk.Garm 0.9u | 13 | 14% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 4% | 12 |
| m3thos.Eva00 1.1 | 3 | 3% | 12 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 5 |
| com.spp.robocode.MostlyHarmless 010 | 0 | 0% | 10 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 75.7 | 65 / 210 | 3.19 | 16.0% | 27052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.2% | 95 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 16.0% | 65 |
| kc.micro.Figment 1.0 | 3.0 | 13.3% | 24 |
| yagami.Tidus 0.11 | 4.5 | 10.5% | 5 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.0% | 9 |
| mc2.enemy.Original 0.9 | 5.5 | 9.6% | 11 |
| dft.Calliope 5.6 | 7.2 | 7.5% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 74.0 | 8 / 35 | 4690 |
| 2 | 2 | 64.5 | 76.5 | 8 / 35 | 4758 |
| 3 | 2 | 64.2 | 73.0 | 12 / 35 | 4553 |
| 4 | 2 | 65.2 | 78.1 | 14 / 35 | 4319 |
| 5 | 2 | 64.4 | 76.2 | 13 / 35 | 4157 |
| 6 | 2 | 65.1 | 76.5 | 10 / 35 | 4575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 41 | 37% |
| kc.micro.Figment 1.0 | 36 | 78% |
| yagami.Tidus 0.11 | 11 | 91% |
| pedersen.Grishnakh 1.0 | 9 | 78% |
| mc2.enemy.Original 0.9 | 5 | 60% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 64 | 44% | 78 |
| kc.micro.Figment 1.0 | 34 | 23% | 66 |
| mc2.enemy.Original 0.9 | 15 | 10% | 20 |
| pedersen.Grishnakh 1.0 | 11 | 8% | 16 |
| yagami.Tidus 0.11 | 10 | 7% | 17 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| dft.Calliope 5.6 | 3 | 2% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 3 |

## Melee bench: F10

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.7 | 162 / 210 | 1.57 | 20.4% | 34870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.4% | 162 |
| ne.Chimera 1.2 | 2.7 | 13.1% | 8 |
| DTF.Kludgy 1.2b | 2.7 | 13.0% | 19 |
| ejb.Polaris 1.0.1 | 3.7 | 12.2% | 14 |
| vStar.RAFzilla 2.15 | 5.3 | 10.0% | 3 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.6% | 2 |
| kurios.DOSexe .9b | 7.5 | 5.9% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.6% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 95.2 | 30 / 35 | 5832 |
| 2 | 1 | 70.6 | 92.7 | 24 / 35 | 6052 |
| 3 | 1 | 71.0 | 93.3 | 30 / 35 | 5861 |
| 4 | 1 | 71.4 | 95.6 | 29 / 35 | 5746 |
| 5 | 1 | 71.8 | 97.1 | 29 / 35 | 6074 |
| 6 | 1 | 68.1 | 87.9 | 20 / 35 | 5305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 86% |
| ejb.Polaris 1.0.1 | 46 | 87% |
| ne.Chimera 1.2 | 34 | 94% |
| vStar.RAFzilla 2.15 | 16 | 100% |
| tvv.micro.Antares 1.1.1 | 15 | 100% |
| kurios.DOSexe .9b | 8 | 100% |
| donjezza.Muncho 1.0 | 4 | 75% |

Hadur died in 48 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 35% | 58 |
| ejb.Polaris 1.0.1 | 9 | 19% | 51 |
| ne.Chimera 1.2 | 9 | 19% | 50 |
| vStar.RAFzilla 2.15 | 7 | 15% | 15 |
| donjezza.Muncho 1.0 | 2 | 4% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 2 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 13 |
| sam.Samspin 1.0 | 1 | 2% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 10 |

## Melee bench: F11

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 79.7 | 73 / 210 | 2.82 | 16.7% | 27950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.8% | 78 |
| hadur117.mini.DeiseD 0.3 | 1.8 | 16.7% | 73 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.9% | 25 |
| djc.DynaBot 0.1.1 | 4.0 | 10.5% | 12 |
| br2.MobyDickBot 1.6 | 6.0 | 8.8% | 13 |
| rdt199.Warlord 0.73 | 6.2 | 8.4% | 5 |
| uji.YellohFellah 1.0 | 6.3 | 8.3% | 4 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.0% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 80.0 | 11 / 35 | 4545 |
| 2 | 2 | 66.0 | 81.9 | 10 / 35 | 4928 |
| 3 | 1 | 66.5 | 82.9 | 14 / 35 | 4907 |
| 4 | 2 | 66.7 | 81.3 | 16 / 35 | 4871 |
| 5 | 2 | 65.2 | 78.7 | 12 / 35 | 4657 |
| 6 | 2 | 62.6 | 73.7 | 10 / 35 | 4042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 56 | 52% |
| cx.mini.Nimrod 0.55 | 20 | 70% |
| djc.DynaBot 0.1.1 | 17 | 71% |
| uji.YellohFellah 1.0 | 7 | 100% |
| br2.MobyDickBot 1.6 | 6 | 67% |
| rdt199.Warlord 0.73 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 67 | 49% | 94 |
| cx.mini.Nimrod 0.55 | 29 | 21% | 43 |
| djc.DynaBot 0.1.1 | 14 | 10% | 26 |
| rdt199.Warlord 0.73 | 10 | 7% | 18 |
| KiraNL.Chupacabra 0.4 | 7 | 5% | 8 |
| br2.MobyDickBot 1.6 | 5 | 4% | 7 |
| uji.YellohFellah 1.0 | 3 | 2% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.4 | 116 / 210 | 2.40 | 17.8% | 25575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.8% | 116 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.5% | 31 |
| nat.PallasHawk 1.0 | 3.5 | 13.0% | 35 |
| darkcanuck.Leon 1.01 | 3.5 | 12.7% | 18 |
| brainfade.melee.Genghis 0.36 | 4.7 | 10.1% | 7 |
| jrm.Test0 1.0 | 6.2 | 8.0% | 0 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.9% | 1 |
| jp.Perpy 16.0 | 8.0 | 6.8% | 1 |
| jaybot.bots.Oddball 4.0 | 8.5 | 6.0% | 2 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 79.4 | 16 / 35 | 4190 |
| 2 | 1 | 67.4 | 85.1 | 19 / 35 | 4523 |
| 3 | 1 | 67.1 | 85.7 | 21 / 35 | 3903 |
| 4 | 1 | 66.7 | 83.2 | 18 / 35 | 4358 |
| 5 | 1 | 67.3 | 87.3 | 20 / 35 | 4242 |
| 6 | 1 | 67.7 | 86.0 | 22 / 35 | 4359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 39 | 82% |
| bts.wiki.RipCurl 0.9b | 38 | 76% |
| nat.PallasHawk 1.0 | 36 | 81% |
| brainfade.melee.Genghis 0.36 | 13 | 92% |
| jaybot.bots.Oddball 4.0 | 9 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 24 | 26% | 44 |
| darkcanuck.Leon 1.01 | 20 | 21% | 64 |
| nat.PallasHawk 1.0 | 20 | 21% | 48 |
| brainfade.melee.Genghis 0.36 | 14 | 15% | 21 |
| jrm.Test0 1.0 | 8 | 9% | 12 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 8 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 6 |
| jp.Perpy 16.0 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.0 | 67 / 210 | 2.53 | 16.4% | 26552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 17.3% | 98 |
| hadur117.mini.DeiseD 0.3 | 2.5 | 16.4% | 67 |
| ags.Glacier 0.2.11 | 2.5 | 15.9% | 30 |
| shinh.Entangled 0.3 | 4.3 | 11.6% | 7 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.7% | 9 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 83.5 | 10 / 35 | 4698 |
| 2 | 3 | 64.9 | 81.3 | 10 / 35 | 4063 |
| 3 | 2 | 66.4 | 84.1 | 12 / 35 | 4533 |
| 4 | 3 | 65.3 | 81.3 | 11 / 35 | 4213 |
| 5 | 3 | 65.3 | 80.0 | 11 / 35 | 4355 |
| 6 | 2 | 67.8 | 87.6 | 13 / 35 | 4690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 61 | 39% |
| ags.Glacier 0.2.11 | 37 | 76% |
| shinh.Entangled 0.3 | 10 | 90% |
| gh.micro.Gruweltje 0.7 | 7 | 86% |

Hadur died in 143 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 53 | 37% | 76 |
| ags.Glacier 0.2.11 | 49 | 34% | 74 |
| gh.micro.Gruweltje 0.7 | 14 | 10% | 19 |
| shinh.Entangled 0.3 | 12 | 8% | 26 |
| stelo.Wang 1.0 | 10 | 7% | 10 |
| apc.Colossus2 0.17 | 4 | 3% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.1 | 147 / 210 | 1.89 | 19.8% | 34059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.8% | 147 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.2% | 31 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.5% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.5% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.5% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.3% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.7 | 8.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.0% | 7 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.7 | 21 / 35 | 5396 |
| 2 | 1 | 69.5 | 89.5 | 22 / 35 | 5646 |
| 3 | 1 | 70.6 | 90.8 | 27 / 35 | 5642 |
| 4 | 1 | 70.2 | 89.8 | 26 / 35 | 5640 |
| 5 | 1 | 70.1 | 89.8 | 23 / 35 | 5838 |
| 6 | 1 | 71.4 | 94.9 | 28 / 35 | 5897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 90 | 90% |
| catcat20.shape.Theta 0.018 | 35 | 74% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 81% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 25 | 40% | 105 |
| catcat20.shape.Theta 0.018 | 18 | 29% | 37 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 13% | 20 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 6% | 21 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 3 |
| sample.TrackFire 1.0 | 1 | 2% | 2 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F15

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.6 | 117 / 210 | 2.39 | 18.8% | 33924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.8% | 117 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.9% | 18 |
| emp.Yngwie 1.11 | 3.3 | 12.3% | 36 |
| mld.DustBunny 3.8 | 3.5 | 12.4% | 13 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.9% | 11 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.7% | 14 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.5% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.7% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.7 | 15 / 35 | 5294 |
| 2 | 1 | 66.6 | 77.1 | 16 / 35 | 5503 |
| 3 | 1 | 69.1 | 85.1 | 20 / 35 | 5898 |
| 4 | 1 | 69.3 | 87.9 | 20 / 35 | 5936 |
| 5 | 1 | 69.9 | 89.2 | 24 / 35 | 5480 |
| 6 | 1 | 70.4 | 89.5 | 22 / 35 | 5813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 65% |
| kawigi.micro.Shiz 1.1 | 32 | 100% |
| cb.nano.Insomnia 1.0 | 23 | 78% |
| mld.DustBunny 3.8 | 20 | 100% |
| kawigi.robot.Girl 1.2 | 17 | 100% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 32 | 34% | 67 |
| cb.nano.Insomnia 1.0 | 15 | 16% | 14 |
| kawigi.micro.Shiz 1.1 | 13 | 14% | 45 |
| mld.DustBunny 3.8 | 13 | 14% | 43 |
| kawigi.robot.Girl 1.2 | 9 | 10% | 23 |
| Grystrion.TrackerWO 1.0 | 5 | 5% | 5 |
| lambdaxy.TBot 0.1 | 4 | 4% | 5 |
| divineomega.TrialBot 0.003 | 2 | 2% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.5 | 98 / 210 | 2.48 | 18.4% | 33627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.4% | 98 |
| gh.Griezel 0.5.2 | 2.0 | 16.1% | 58 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.6% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.2% | 31 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.5% | 4 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.8% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.8% | 2 |
| asd.Cthulhu 1.3 | 8.7 | 5.1% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.9% | 3 |
| repositorio.NanoStep 1.0 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.8 | 16 / 35 | 5603 |
| 2 | 1 | 68.4 | 83.8 | 18 / 35 | 5501 |
| 3 | 1 | 66.4 | 77.1 | 13 / 35 | 5598 |
| 4 | 1 | 67.6 | 82.9 | 16 / 35 | 5421 |
| 5 | 1 | 69.9 | 88.9 | 19 / 35 | 5730 |
| 6 | 1 | 68.6 | 83.8 | 16 / 35 | 5774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 66 | 58% |
| techdude.forest.FlamingForest 1.1 | 28 | 61% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 96% |
| stelo.IntrinsicVolatility 1.4 | 6 | 100% |
| bvh.fnr.Fenrir 0.36l | 4 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 67% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1064. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 51 | 46% | 99 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 18% | 43 |
| techdude.forest.FlamingForest 1.1 | 16 | 14% | 31 |
| bvh.fnr.Fenrir 0.36l | 15 | 13% | 16 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 7 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 6 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.1 | 91 / 210 | 2.52 | 17.8% | 31608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.8% | 91 |
| et.Predator 1.8 | 2.8 | 13.1% | 25 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.7% | 29 |
| cx.BlestPain 1.41 | 3.3 | 12.5% | 44 |
| nic.Nicator 2.4 | 4.5 | 11.2% | 13 |
| ahf.NanoAndrew .4 | 6.3 | 9.9% | 6 |
| maribo.melee.BMV 0.1 | 6.7 | 8.7% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.5 | 14 / 35 | 5152 |
| 2 | 1 | 67.0 | 81.0 | 15 / 35 | 5430 |
| 3 | 1 | 67.2 | 82.2 | 14 / 35 | 5395 |
| 4 | 1 | 67.9 | 85.4 | 19 / 35 | 5012 |
| 5 | 1 | 66.5 | 81.6 | 13 / 35 | 5202 |
| 6 | 1 | 68.1 | 86.0 | 16 / 35 | 5417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 47 | 70% |
| cx.BlestPain 1.41 | 31 | 29% |
| nic.Nicator 2.4 | 24 | 79% |
| oog.melee.Mercutio 1.0 | 23 | 65% |
| ahf.NanoAndrew .4 | 11 | 91% |
| maribo.melee.BMV 0.1 | 5 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 30 | 25% | 47 |
| oog.melee.Mercutio 1.0 | 29 | 24% | 43 |
| et.Predator 1.8 | 21 | 18% | 50 |
| nic.Nicator 2.4 | 16 | 13% | 33 |
| ahf.NanoAndrew .4 | 12 | 10% | 21 |
| maribo.melee.BMV 0.1 | 7 | 6% | 10 |
| goblin.Bender 2.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 2 |
| tex.Longbot 0.4 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.8 | 99 / 210 | 2.37 | 17.7% | 27836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.7% | 99 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.0% | 48 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.8% | 27 |
| ratosh.Nobo 0.21 | 4.7 | 10.5% | 6 |
| uji.DBH 1.1 | 4.7 | 10.5% | 9 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.3% | 4 |
| sigterm.Sigterm 1.0 | 6.7 | 8.4% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 3 |
| stelo.WangRobot 1.0 | 9.0 | 5.7% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.7 | 18 / 35 | 4859 |
| 2 | 1 | 67.0 | 85.7 | 16 / 35 | 4713 |
| 3 | 1 | 67.3 | 86.3 | 16 / 35 | 4972 |
| 4 | 1 | 65.4 | 81.3 | 17 / 35 | 4149 |
| 5 | 1 | 66.9 | 85.4 | 15 / 35 | 4505 |
| 6 | 1 | 66.7 | 84.1 | 17 / 35 | 4638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 54 | 57% |
| agd.Mooserwirt2 2.7 | 30 | 53% |
| uji.DBH 1.1 | 19 | 79% |
| spinnercat.Robovirus 2.718 | 12 | 92% |
| ratosh.Nobo 0.21 | 11 | 100% |
| sigterm.Sigterm 1.0 | 10 | 80% |
| stelo.WangRobot 1.0 | 5 | 80% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 60% |

Hadur died in 111 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 41% | 80 |
| agd.Mooserwirt2 2.7 | 20 | 18% | 38 |
| ratosh.Nobo 0.21 | 16 | 14% | 24 |
| uji.DBH 1.1 | 11 | 10% | 23 |
| sigterm.Sigterm 1.0 | 6 | 5% | 15 |
| spinnercat.Robovirus 2.718 | 4 | 4% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 4% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 4% | 6 |
| stelo.WangRobot 1.0 | 1 | 1% | 4 |

## Melee bench: F19

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.6 | 163 / 210 | 1.49 | 21.0% | 35584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 21.0% | 163 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 17 |
| mld.Infinity 2.2 | 3.2 | 12.8% | 18 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.4% | 5 |
| erdnis.Rover 0.3 | 5.0 | 10.6% | 5 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.8% | 1 |
| pac.ABC 2.1 | 7.7 | 6.8% | 1 |
| mbh.Mbh 0.1 | 7.8 | 7.0% | 0 |
| pbg.R2D2 1.0 | 8.5 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 95.2 | 30 / 35 | 5926 |
| 2 | 1 | 72.3 | 96.8 | 29 / 35 | 5693 |
| 3 | 1 | 71.0 | 90.5 | 22 / 35 | 5867 |
| 4 | 1 | 72.0 | 96.2 | 26 / 35 | 6246 |
| 5 | 1 | 71.8 | 94.3 | 29 / 35 | 5716 |
| 6 | 1 | 72.1 | 94.3 | 27 / 35 | 6136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 93 | 89% |
| mld.Infinity 2.2 | 47 | 81% |
| krillr.mini.JointStrike 2.0.0 | 21 | 81% |
| erdnis.Rover 0.3 | 13 | 85% |
| patson.PatsonTestBot 1.0 | 9 | 89% |
| pac.ABC 2.1 | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 1092. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 32% | 109 |
| krillr.mini.JointStrike 2.0.0 | 11 | 23% | 26 |
| mld.Infinity 2.2 | 10 | 21% | 21 |
| erdnis.Rover 0.3 | 8 | 17% | 20 |
| patson.PatsonTestBot 1.0 | 3 | 6% | 15 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
| pac.ABC 2.1 | 0 | 0% | 5 |
| mbh.Mbh 0.1 | 0 | 0% | 2 |

## Melee bench: F20

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.4 | 128 / 210 | 1.96 | 19.9% | 35166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.9% | 128 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 41 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.4% | 10 |
| fwb.Nine 1.0.1 | 4.0 | 11.1% | 18 |
| catcat20.Rabbit 0.001 | 4.8 | 9.5% | 9 |
| bayen.nut.Squirrel 1.615 | 6.7 | 7.7% | 4 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 7.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.8 | 17 / 35 | 5915 |
| 2 | 1 | 67.6 | 84.4 | 17 / 35 | 5160 |
| 3 | 1 | 70.1 | 89.2 | 22 / 35 | 5706 |
| 4 | 1 | 70.1 | 89.8 | 23 / 35 | 5817 |
| 5 | 1 | 71.7 | 94.9 | 25 / 35 | 6187 |
| 6 | 1 | 71.3 | 93.0 | 24 / 35 | 6381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 80 | 74% |
| fwb.Nine 1.0.1 | 28 | 71% |
| catcat20.Rabbit 0.001 | 26 | 85% |
| nz.jdc.nano.GridFu 1.0 | 18 | 89% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 40 | 49% | 90 |
| fwb.Nine 1.0.1 | 17 | 21% | 21 |
| bayen.nut.Squirrel 1.615 | 9 | 11% | 22 |
| nz.jdc.nano.GridFu 1.0 | 8 | 10% | 34 |
| catcat20.Rabbit 0.001 | 6 | 7% | 27 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F21

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.5 | 134 / 210 | 1.77 | 20.3% | 36060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.3% | 134 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 61 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 6 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.5% | 0 |
| eld.Hmm 1.0 | 6.0 | 8.1% | 1 |
| fire219.CatBot 1.0 | 7.2 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.7 | 26 / 35 | 6324 |
| 2 | 1 | 70.9 | 91.4 | 21 / 35 | 6051 |
| 3 | 1 | 69.9 | 87.0 | 20 / 35 | 6218 |
| 4 | 1 | 70.1 | 91.4 | 19 / 35 | 5748 |
| 5 | 1 | 70.6 | 92.1 | 22 / 35 | 5609 |
| 6 | 1 | 71.8 | 93.3 | 26 / 35 | 6110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 104 | 65% |
| dummy.mini.Scimitar 1.01 | 37 | 92% |
| cf.RiO.RiOx 4.2.1 | 23 | 87% |
| eld.Hmm 1.0 | 10 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1230. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 58% | 95 |
| dummy.mini.Scimitar 1.01 | 17 | 22% | 63 |
| cf.RiO.RiOx 4.2.1 | 13 | 17% | 30 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
| eld.Hmm 1.0 | 0 | 0% | 14 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.8 | 95 / 210 | 2.46 | 17.8% | 31224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.8% | 95 |
| pe.SandboxDT 2.71m | 2.3 | 15.2% | 55 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.4% | 24 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.4% | 24 |
| bigpete.Stewie 1.0 | 4.8 | 11.4% | 10 |
| gg.Squaraus 0.6 | 7.0 | 6.6% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.1% | 0 |
| yk.JahRoslav 1.1 | 7.7 | 6.4% | 0 |
| pbg.NinjaX 1.2 | 8.2 | 5.7% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.1 | 18 / 35 | 5087 |
| 2 | 1 | 68.8 | 84.1 | 19 / 35 | 5404 |
| 3 | 1 | 66.5 | 82.2 | 13 / 35 | 5016 |
| 4 | 1 | 69.1 | 87.3 | 19 / 35 | 5432 |
| 5 | 1 | 66.9 | 81.6 | 12 / 35 | 5061 |
| 6 | 1 | 67.3 | 83.2 | 14 / 35 | 5224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 44 | 77% |
| jlm.javaDisturbance 0.59 | 38 | 84% |
| pe.SandboxDT 2.71m | 31 | 45% |
| bigpete.Stewie 1.0 | 15 | 80% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 38% | 61 |
| jlm.javaDisturbance 0.59 | 29 | 25% | 58 |
| kvk.HebusLeTroll 0.35 | 26 | 23% | 57 |
| bigpete.Stewie 1.0 | 10 | 9% | 22 |
| tad.Dalek98 0.98 | 4 | 3% | 4 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.2 | 131 / 210 | 1.79 | 19.4% | 30346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.4% | 131 |
| pe.SandboxLump 1.52 | 2.0 | 17.5% | 59 |
| cre.Karolos 0.32 | 3.0 | 14.1% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.1% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 8.8% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.3 | 8.6% | 1 |
| sample.Walls 1.0 | 7.0 | 8.0% | 1 |
| cw.megas.Blade 0.8 | 7.2 | 7.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.8 | 23 / 35 | 4821 |
| 2 | 1 | 69.9 | 88.9 | 19 / 35 | 5247 |
| 3 | 1 | 71.2 | 94.3 | 24 / 35 | 4999 |
| 4 | 1 | 70.5 | 92.1 | 19 / 35 | 5149 |
| 5 | 1 | 70.3 | 89.8 | 23 / 35 | 5133 |
| 6 | 1 | 70.4 | 91.4 | 23 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 87 | 68% |
| cre.Karolos 0.32 | 37 | 95% |
| stelo.AreaTargetingBot 1.1 | 20 | 100% |
| sample.Walls 1.0 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 67% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 55 | 70% | 115 |
| cre.Karolos 0.32 | 14 | 18% | 54 |
| stelo.AreaTargetingBot 1.1 | 5 | 6% | 20 |
| stelo.RamTrackSurfer 1.2 | 2 | 3% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 3% | 5 |
| sample.Walls 1.0 | 1 | 1% | 3 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 71.6 | 54 / 210 | 3.55 | 14.7% | 24097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.8 | 14.7% | 54 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.0% | 47 |
| florent.XSeries.X2 0.12 | 3.0 | 13.6% | 40 |
| davidalves.Phoenix 0.54 | 3.8 | 12.8% | 37 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.2% | 25 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.6% | 5 |
| oog.melee.Corsair 1.0 | 6.5 | 9.0% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.5% | 1 |
| evd.X1 0.01 | 9.3 | 4.3% | 0 |
| as.FrankTheTank 1.3 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 76.8 | 13 / 35 | 4145 |
| 2 | 4 | 60.1 | 66.7 | 5 / 35 | 3804 |
| 3 | 1 | 64.5 | 76.2 | 11 / 35 | 4551 |
| 4 | 2 | 61.1 | 69.5 | 8 / 35 | 3703 |
| 5 | 1 | 62.0 | 71.4 | 10 / 35 | 4009 |
| 6 | 2 | 61.1 | 69.2 | 7 / 35 | 3885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 20 | 50% |
| davidalves.Phoenix 0.54 | 18 | 56% |
| florent.XSeries.X2 0.12 | 17 | 59% |
| pedersen.Ugluk 1.1.1 | 16 | 50% |
| stelo.SoJNanoMelee 1.1 | 13 | 77% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 41 | 26% | 54 |
| rz.GlowBlowMelee 1.4 | 38 | 24% | 49 |
| pedersen.Ugluk 1.1.1 | 31 | 20% | 37 |
| davidalves.Phoenix 0.54 | 28 | 18% | 42 |
| stelo.SoJNanoMelee 1.1 | 10 | 6% | 13 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 6 |
| oog.melee.Corsair 1.0 | 3 | 2% | 5 |
| as.FrankTheTank 1.3 | 1 | 1% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.4 | 129 / 210 | 2.31 | 18.5% | 27350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.5% | 129 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.7% | 27 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.5% | 13 |
| jdw.Hurricane 1.4 | 3.8 | 11.1% | 14 |
| ds.Oo 2.2 | 5.7 | 9.4% | 8 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.4% | 9 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.1% | 7 |
| awesomeness.Elite 1.0 | 8.3 | 6.7% | 1 |
| adt.Ar2 1.1 | 8.5 | 6.1% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 78.1 | 18 / 35 | 4393 |
| 2 | 1 | 68.2 | 86.0 | 22 / 35 | 4570 |
| 3 | 1 | 67.3 | 85.7 | 22 / 35 | 4218 |
| 4 | 1 | 68.7 | 88.6 | 22 / 35 | 4775 |
| 5 | 1 | 67.6 | 84.1 | 21 / 35 | 4591 |
| 6 | 1 | 69.7 | 90.2 | 24 / 35 | 4803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 45 | 89% |
| voidious.micro.BlitzBat 1.05 | 44 | 93% |
| jdw.Hurricane 1.4 | 23 | 91% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| ds.Oo 2.2 | 8 | 88% |
| awesomeness.Elite 1.0 | 4 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| gre.svman4.Morfeas 1.4.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 19 | 23% | 56 |
| voidious.micro.BlitzBat 1.05 | 18 | 22% | 55 |
| jdw.Hurricane 1.4 | 16 | 20% | 33 |
| ds.Oo 2.2 | 9 | 11% | 17 |
| gjr.Cephalosporin 0.1 | 7 | 9% | 19 |
| gre.svman4.Morfeas 1.4.1 | 6 | 7% | 14 |
| amk.ChumbaMini 0.2 | 3 | 4% | 4 |
| adt.Ar2 1.1 | 2 | 2% | 5 |
| awesomeness.Elite 1.0 | 1 | 1% | 7 |

## Melee bench: F26

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.6 | 117 / 210 | 2.20 | 18.7% | 33257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.7% | 117 |
| ak.Fermat 2.0 | 2.0 | 14.6% | 38 |
| shu.nitro.LENIN .T34 | 3.3 | 12.3% | 23 |
| lrem.Spectre 0.4.4 | 3.8 | 12.2% | 19 |
| js.PinBall 1.6 | 4.8 | 10.7% | 9 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.0% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.2% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.3% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.9 | 21 / 35 | 6315 |
| 2 | 1 | 68.8 | 86.7 | 21 / 35 | 5412 |
| 3 | 1 | 68.3 | 87.3 | 19 / 35 | 5189 |
| 4 | 1 | 68.7 | 86.3 | 20 / 35 | 5524 |
| 5 | 1 | 69.3 | 87.9 | 20 / 35 | 5388 |
| 6 | 1 | 68.0 | 83.5 | 16 / 35 | 5429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 47 | 85% |
| ak.Fermat 2.0 | 35 | 74% |
| shu.nitro.LENIN .T34 | 28 | 79% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 91% |
| js.PinBall 1.6 | 11 | 91% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 34 | 37% | 63 |
| lrem.Spectre 0.4.4 | 18 | 19% | 45 |
| shu.nitro.LENIN .T34 | 15 | 16% | 45 |
| js.PinBall 1.6 | 13 | 14% | 26 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 6% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 5% | 10 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 5 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |

## Melee bench: F27

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.1 | 130 / 210 | 2.25 | 18.4% | 27620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.4% | 130 |
| mk.Alpha 0.2.1 | 2.0 | 14.3% | 42 |
| EH.Eagle 1.0.6 | 3.7 | 11.1% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.8% | 12 |
| wee.Gem 1.8.4 | 5.3 | 10.0% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 5.7 | 9.1% | 1 |
| joe.ADinosaur 1.0 | 6.5 | 8.8% | 4 |
| throxbot.ThroxBot 0.1 | 8.5 | 7.0% | 1 |
| caimano.Furia_Ceca 0.22 | 8.5 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 91.1 | 26 / 35 | 4284 |
| 2 | 1 | 68.0 | 87.0 | 22 / 35 | 4714 |
| 3 | 1 | 68.4 | 86.0 | 23 / 35 | 4985 |
| 4 | 1 | 66.7 | 84.4 | 20 / 35 | 4187 |
| 5 | 1 | 68.2 | 88.3 | 21 / 35 | 4745 |
| 6 | 1 | 66.2 | 80.0 | 18 / 35 | 4705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 77 | 79% |
| EH.Eagle 1.0.6 | 26 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 86% |
| wee.Gem 1.8.4 | 14 | 79% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 31 | 39% | 90 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 18% | 33 |
| wee.Gem 1.8.4 | 10 | 13% | 24 |
| joe.ADinosaur 1.0 | 9 | 11% | 15 |
| EH.Eagle 1.0.6 | 5 | 6% | 24 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 6% | 12 |
| throxbot.ThroxBot 0.1 | 4 | 5% | 8 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 3 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.3 | 138 / 210 | 2.14 | 18.7% | 27502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.7% | 138 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 33 |
| uji.Antique 1.0 | 3.3 | 11.6% | 15 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.0% | 14 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 4 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.4% | 2 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.9% | 3 |
| matt.advanced.Katana 1.0 | 8.3 | 6.2% | 0 |
| stelo.PianistNano 1.2 | 8.8 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.9 | 23 / 35 | 4747 |
| 2 | 1 | 67.7 | 84.8 | 24 / 35 | 4523 |
| 3 | 1 | 66.5 | 83.2 | 20 / 35 | 4320 |
| 4 | 1 | 68.7 | 87.0 | 22 / 35 | 4875 |
| 5 | 1 | 70.3 | 94.3 | 28 / 35 | 4747 |
| 6 | 1 | 67.5 | 85.7 | 21 / 35 | 4290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 74 | 82% |
| uji.Antique 1.0 | 38 | 92% |
| qohnil.blot.BlotBot 3.61 | 17 | 82% |
| amk.ChumbaWumba 0.3 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 8 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 25 | 35% | 78 |
| uji.Antique 1.0 | 10 | 14% | 41 |
| qohnil.blot.BlotBot 3.61 | 10 | 14% | 31 |
| amk.ChumbaWumba 0.3 | 10 | 14% | 18 |
| pfvicm.Sobieski 7.2.3b | 7 | 10% | 13 |
| ahr.ice.Ice 1.0.2 | 5 | 7% | 13 |
| matt.advanced.Katana 1.0 | 2 | 3% | 6 |
| stelo.Lifestealer 1.0 | 2 | 3% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |

## Melee bench: F29

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.1 | 116 / 210 | 2.52 | 18.5% | 30776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.5% | 116 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.3% | 44 |
| deewiant.Anomaly 0.2 | 2.8 | 14.2% | 37 |
| myl.micro.Troodon 1.10 | 4.3 | 11.5% | 4 |
| jok.PheonixM 0.1.2 | 4.7 | 10.3% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.9% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 6.7% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.2 | 5.0% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.7 | 22 / 35 | 5241 |
| 2 | 1 | 68.6 | 84.8 | 18 / 35 | 5081 |
| 3 | 1 | 68.4 | 84.4 | 17 / 35 | 5094 |
| 4 | 1 | 69.0 | 85.4 | 23 / 35 | 4800 |
| 5 | 1 | 69.1 | 83.5 | 21 / 35 | 5354 |
| 6 | 1 | 66.2 | 74.9 | 15 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 48 | 73% |
| zyx.mega.YersiniaPestis 3.1 | 47 | 74% |
| myl.micro.Troodon 1.10 | 24 | 96% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| DBall.Anarchy 0.1 | 8 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 33 | 35% | 74 |
| zyx.mega.YersiniaPestis 3.1 | 26 | 28% | 61 |
| jok.PheonixM 0.1.2 | 14 | 15% | 25 |
| myl.micro.Troodon 1.10 | 12 | 13% | 28 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |

## Melee bench: F30

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.8 | 47 / 210 | 3.62 | 14.5% | 24955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 2.0 | 14.5% | 47 |
| catcat20.Matcha 0.006 | 2.8 | 13.8% | 43 |
| oog.melee.Capulet 1.2 | 3.2 | 13.1% | 19 |
| darkcanuck.B26354 1.06 | 3.3 | 13.7% | 51 |
| stelo.PastFuture 2.3.2 | 3.7 | 13.3% | 37 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.7% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.6% | 3 |
| ntc.Opposite 1.5 | 7.8 | 7.3% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.0% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 75.9 | 10 / 35 | 4212 |
| 2 | 1 | 63.4 | 73.3 | 10 / 35 | 4232 |
| 3 | 1 | 64.1 | 76.2 | 7 / 35 | 4488 |
| 4 | 3 | 61.1 | 67.0 | 7 / 35 | 4001 |
| 5 | 2 | 61.0 | 67.3 | 7 / 35 | 4160 |
| 6 | 4 | 60.0 | 65.4 | 6 / 35 | 3862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 22 | 23% |
| catcat20.Matcha 0.006 | 22 | 59% |
| oog.melee.Capulet 1.2 | 17 | 76% |
| stelo.PastFuture 2.3.2 | 15 | 53% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 0% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 44 | 27% | 51 |
| stelo.PastFuture 2.3.2 | 40 | 25% | 49 |
| catcat20.Matcha 0.006 | 33 | 20% | 44 |
| oog.melee.Capulet 1.2 | 20 | 12% | 35 |
| ntc.Opposite 1.5 | 10 | 6% | 10 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 8 |
| tripphippy.Alice 1.1 | 5 | 3% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 2% | 5 |

## Melee bench: F31

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 67.7 | 35 / 210 | 3.90 | 13.4% | 21121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 106 |
| gh.mini.Griezel 0.2 | 2.2 | 13.5% | 37 |
| hadur117.mini.DeiseD 0.3 | 2.8 | 13.4% | 35 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.6% | 12 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.4% | 12 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.5% | 3 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.9% | 3 |
| fm.mammillarias 1.3 | 7.7 | 6.8% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 65.7 | 8 / 35 | 3154 |
| 2 | 3 | 59.6 | 65.7 | 6 / 35 | 3547 |
| 3 | 2 | 60.8 | 69.2 | 7 / 35 | 3560 |
| 4 | 3 | 61.1 | 70.8 | 6 / 35 | 3676 |
| 5 | 3 | 59.9 | 67.3 | 5 / 35 | 3499 |
| 6 | 3 | 60.0 | 67.6 | 3 / 35 | 3685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 33 | 48% |
| gh.mini.Griezel 0.2 | 16 | 38% |
| spinnercat.micro.Tyger 0.1 | 8 | 75% |
| d414.nano.Quantum 1.0.0 | 7 | 57% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 58 | 33% | 76 |
| gh.mini.Griezel 0.2 | 44 | 25% | 52 |
| d414.nano.Quantum 1.0.0 | 24 | 14% | 26 |
| spinnercat.micro.Tyger 0.1 | 23 | 13% | 27 |
| timmit.nano.TimDog 0.33 | 9 | 5% | 9 |
| fm.mammillarias 1.3 | 7 | 4% | 7 |
| gh.nano.Grofvuil 0.2 | 6 | 3% | 9 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.7 | 137 / 210 | 1.93 | 19.3% | 31319 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.3% | 137 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 46 |
| apc.botM 3.0 | 3.3 | 11.8% | 17 |
| lxx.ConceptA 0.8 | 3.8 | 10.9% | 2 |
| vjik.UnViolation 1.1 | 4.8 | 9.8% | 4 |
| bayen.UbaMicro 1.4 | 6.2 | 8.5% | 2 |
| panzer.Panzer 0.2 | 7.3 | 7.1% | 1 |
| yk.JahMicro 1.0 | 7.8 | 6.9% | 0 |
| conscience.Electron 1.3g | 8.8 | 6.1% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.3 | 18 / 35 | 5148 |
| 2 | 1 | 69.5 | 92.4 | 26 / 35 | 5132 |
| 3 | 1 | 70.1 | 92.7 | 24 / 35 | 5490 |
| 4 | 1 | 69.5 | 90.8 | 23 / 35 | 5434 |
| 5 | 1 | 69.0 | 87.3 | 25 / 35 | 5320 |
| 6 | 1 | 67.8 | 86.7 | 21 / 35 | 4795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 73 | 74% |
| apc.botM 3.0 | 31 | 71% |
| lxx.ConceptA 0.8 | 25 | 92% |
| vjik.UnViolation 1.1 | 16 | 100% |
| donjezza.Jezza 1.0 | 9 | 89% |
| yk.JahMicro 1.0 | 6 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| panzer.Panzer 0.2 | 4 | 75% |

Hadur died in 73 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 29 | 40% | 86 |
| apc.botM 3.0 | 14 | 19% | 44 |
| lxx.ConceptA 0.8 | 14 | 19% | 25 |
| vjik.UnViolation 1.1 | 4 | 5% | 25 |
| bayen.UbaMicro 1.4 | 4 | 5% | 13 |
| panzer.Panzer 0.2 | 3 | 4% | 5 |
| yk.JahMicro 1.0 | 2 | 3% | 6 |
| conscience.Electron 1.3g | 2 | 3% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F33

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.5 | 114 / 210 | 2.40 | 18.6% | 31377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.3 | 18.6% | 114 |
| maribo.Quester 0.3 | 1.7 | 16.7% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.6% | 20 |
| labg.Cataclysm 2.05 | 4.3 | 10.9% | 19 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.0% | 7 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.1% | 3 |
| baal.nano.N 1.42 | 6.7 | 7.9% | 0 |
| zyx.micro.Ant 1.1 | 8.3 | 5.4% | 0 |
| sanja.First 0.1 | 9.0 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.1 | 26 / 35 | 5181 |
| 2 | 1 | 68.9 | 86.3 | 20 / 35 | 5364 |
| 3 | 1 | 68.9 | 85.7 | 18 / 35 | 5405 |
| 4 | 2 | 67.2 | 79.0 | 17 / 35 | 5059 |
| 5 | 2 | 65.1 | 74.3 | 9 / 35 | 4766 |
| 6 | 1 | 70.6 | 90.5 | 24 / 35 | 5602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 59 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 87% |
| gre.svman4.Leonidas 1.3.2 | 23 | 96% |
| labg.Cataclysm 2.05 | 14 | 79% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 83% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 41 | 42% | 89 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 21% | 50 |
| gre.svman4.Leonidas 1.3.2 | 11 | 11% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 10% | 12 |
| labg.Cataclysm 2.05 | 7 | 7% | 20 |
| baal.nano.N 1.42 | 6 | 6% | 8 |
| zyx.micro.Ant 1.1 | 2 | 2% | 4 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.3 | 67 / 210 | 2.69 | 16.8% | 29738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.7 | 16.9% | 68 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 16.8% | 67 |
| kid.Gladiator .7.2 | 2.3 | 16.3% | 51 |
| jcs.Seth 1.8 | 4.0 | 11.4% | 19 |
| tcf.Reach 3 | 5.3 | 10.6% | 4 |
| cli.Dancer 1.1 | 5.7 | 9.7% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 82.9 | 14 / 35 | 4782 |
| 2 | 3 | 66.1 | 79.0 | 6 / 35 | 4895 |
| 3 | 1 | 66.8 | 81.3 | 11 / 35 | 5009 |
| 4 | 1 | 68.7 | 87.9 | 16 / 35 | 5151 |
| 5 | 2 | 65.7 | 76.2 | 11 / 35 | 4851 |
| 6 | 3 | 66.6 | 80.3 | 9 / 35 | 5050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 58 | 53% |
| kid.Gladiator .7.2 | 44 | 45% |
| jcs.Seth 1.8 | 13 | 54% |
| tcf.Reach 3 | 3 | 100% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 3 | 67% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 59 | 41% | 90 |
| kid.Gladiator .7.2 | 52 | 36% | 66 |
| jcs.Seth 1.8 | 17 | 12% | 26 |
| tcf.Reach 3 | 8 | 6% | 12 |
| cli.Dancer 1.1 | 3 | 2% | 8 |
| ratosh.Wesco 1.4 | 3 | 2% | 6 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 74.9 | 18 / 210 | 3.26 | 14.5% | 23347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 158 |
| hadur117.mini.DeiseD 0.3 | 2.2 | 14.5% | 18 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.1% | 19 |
| rz.HawkOnFire 0.1 | 4.0 | 11.9% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.2% | 10 |
| wit.Chuliath 1.0 | 6.5 | 7.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.6% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 68.6 | 2 / 35 | 3672 |
| 2 | 3 | 60.6 | 69.2 | 3 / 35 | 3796 |
| 3 | 2 | 64.7 | 80.0 | 5 / 35 | 4354 |
| 4 | 2 | 64.0 | 81.6 | 3 / 35 | 3769 |
| 5 | 2 | 62.8 | 74.3 | 3 / 35 | 3800 |
| 6 | 2 | 62.8 | 75.6 | 2 / 35 | 3956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 72 | 11% |
| gh.mini.Gruwel 0.9 | 11 | 18% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 40% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 89 | 46% | 97 |
| gh.mini.Gruwel 0.9 | 42 | 22% | 45 |
| rz.HawkOnFire 0.1 | 26 | 14% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 10% | 22 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| wit.Chuliath 1.0 | 5 | 3% | 6 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.2 | 153 / 210 | 1.89 | 20.3% | 33324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.3% | 153 |
| bzdp.Pansy 2.1 | 2.3 | 12.3% | 18 |
| alpha.RainingFire 1.0 | 2.8 | 12.0% | 17 |
| bvh.micro.Freya 0.3 | 4.3 | 10.7% | 9 |
| mz.Cork 0.1 | 4.7 | 10.7% | 6 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.1% | 3 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.0% | 1 |
| dl.BetterWalls 1.0 | 8.0 | 6.4% | 2 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.2 | 23 / 35 | 5731 |
| 2 | 1 | 71.1 | 93.0 | 29 / 35 | 5531 |
| 3 | 1 | 70.3 | 88.3 | 26 / 35 | 5794 |
| 4 | 1 | 71.0 | 92.7 | 26 / 35 | 5596 |
| 5 | 1 | 69.4 | 89.5 | 24 / 35 | 5140 |
| 6 | 1 | 69.7 | 88.3 | 25 / 35 | 5532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 92% |
| bvh.micro.Freya 0.3 | 33 | 94% |
| alpha.RainingFire 1.0 | 29 | 79% |
| mz.Cork 0.1 | 28 | 93% |
| dl.BetterWalls 1.0 | 10 | 90% |
| bvh.mini.Fenrir 0.39 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| m3thos.Eva02 0.7.1 | 4 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 26% | 39 |
| bzdp.Pansy 2.1 | 12 | 21% | 61 |
| bvh.micro.Freya 0.3 | 10 | 17% | 34 |
| mz.Cork 0.1 | 9 | 16% | 34 |
| bvh.mini.Fenrir 0.39 | 7 | 12% | 11 |
| dl.BetterWalls 1.0 | 3 | 5% | 11 |
| m3thos.Eva02 0.7.1 | 2 | 3% | 14 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 95.2 | 181 / 210 | 1.43 | 20.9% | 35630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.9% | 181 |
| germ.TheMind .2 | 3.0 | 10.6% | 9 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.2% | 5 |
| EBBU.Sim2 1.02 | 3.2 | 10.3% | 2 |
| agrach.Dalek 1.0 | 6.2 | 8.5% | 3 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.4% | 5 |
| mb.Beast 0.1 | 7.2 | 8.2% | 3 |
| lmk.ACPFinal 0.1 | 7.7 | 8.0% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.7% | 0 |
| skm.Ryubot 1.0 | 8.7 | 7.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 96.8 | 31 / 35 | 6252 |
| 2 | 1 | 71.4 | 95.2 | 32 / 35 | 6423 |
| 3 | 1 | 69.4 | 94.0 | 28 / 35 | 5467 |
| 4 | 1 | 69.6 | 94.6 | 31 / 35 | 5311 |
| 5 | 1 | 71.2 | 96.5 | 31 / 35 | 6221 |
| 6 | 1 | 70.1 | 94.3 | 28 / 35 | 5956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 39 | 90% |
| EBBU.Sim2 1.02 | 29 | 97% |
| stelo.UntouchableNano 1.3 | 25 | 92% |
| mb.Beast 0.1 | 21 | 100% |
| agrach.Dalek 1.0 | 20 | 100% |
| skm.Ryubot 1.0 | 19 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 100% |
| lmk.ACPFinal 0.1 | 15 | 93% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 517. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 7 | 24% | 39 |
| stelo.UntouchableNano 1.3 | 7 | 24% | 26 |
| lmk.ACPFinal 0.1 | 6 | 21% | 19 |
| mb.Beast 0.1 | 3 | 10% | 31 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 10% | 29 |
| EBBU.Sim2 1.02 | 2 | 7% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 3% | 5 |
| agrach.Dalek 1.0 | 0 | 0% | 29 |
| skm.Ryubot 1.0 | 0 | 0% | 5 |

## Melee bench: F38

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.1 | 80 / 210 | 3.06 | 15.9% | 25395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.5 | 15.9% | 80 |
| justin.Mallais 14.0 | 1.7 | 15.9% | 71 |
| bvh.mini.Freya 0.55 | 3.0 | 12.6% | 17 |
| cs.Wren 1.0 | 4.8 | 10.7% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.8% | 8 |
| bts.mega.Gnarly 1.4 | 5.0 | 11.0% | 19 |
| kdf.KoulDestroyer 1.0 | 7.3 | 8.3% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.7 | 6.5% | 3 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.4% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 78.1 | 16 / 35 | 4329 |
| 2 | 1 | 66.4 | 81.9 | 14 / 35 | 4643 |
| 3 | 2 | 62.2 | 72.4 | 11 / 35 | 3846 |
| 4 | 1 | 67.8 | 86.7 | 20 / 35 | 4732 |
| 5 | 1 | 65.4 | 80.0 | 13 / 35 | 4269 |
| 6 | 3 | 58.4 | 63.5 | 6 / 35 | 3576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 38 | 63% |
| davidalves.net.DuelistNanoMelee 1.01 | 21 | 90% |
| bvh.mini.Freya 0.55 | 14 | 79% |
| cs.Wren 1.0 | 13 | 100% |
| bts.mega.Gnarly 1.4 | 12 | 58% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 45 | 35% | 72 |
| bvh.mini.Freya 0.55 | 22 | 17% | 33 |
| bts.mega.Gnarly 1.4 | 17 | 13% | 25 |
| cs.Wren 1.0 | 16 | 12% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 12% | 35 |
| kdf.KoulDestroyer 1.0 | 12 | 9% | 14 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.9 | 83 / 210 | 2.81 | 16.7% | 29068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 16.7% | 83 |
| bvh.fry.Freya 0.82 | 2.2 | 15.0% | 26 |
| az.Ololobot 0.2.4 | 2.8 | 13.5% | 67 |
| catcat20.Lambda 0.024 | 4.0 | 11.0% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.2% | 9 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.2% | 0 |
| gimp.GimpBot 0.1 | 6.8 | 7.9% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.2 | 7.9% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.7% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 75.9 | 12 / 35 | 4738 |
| 2 | 1 | 67.3 | 84.4 | 15 / 35 | 5356 |
| 3 | 1 | 64.1 | 77.1 | 15 / 35 | 4529 |
| 4 | 1 | 64.8 | 80.0 | 10 / 35 | 4854 |
| 5 | 1 | 65.3 | 80.3 | 15 / 35 | 4650 |
| 6 | 1 | 66.2 | 81.6 | 16 / 35 | 4941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 40 | 93% |
| az.Ololobot 0.2.4 | 35 | 29% |
| catcat20.Lambda 0.024 | 24 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 87% |
| gimp.GimpBot 0.1 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 42 | 33% | 72 |
| az.Ololobot 0.2.4 | 41 | 32% | 54 |
| catcat20.Lambda 0.024 | 20 | 16% | 33 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 11% | 20 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 9 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 8 |
| gimp.GimpBot 0.1 | 2 | 2% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F40

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.8 | 97 / 210 | 2.46 | 18.1% | 30669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.2 | 18.1% | 97 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 15.3% | 52 |
| kano.gamma.KanoGamma 1.8 | 3.7 | 11.6% | 20 |
| mz.AntiGrav 1.0 | 4.5 | 10.9% | 8 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.9% | 15 |
| stelo.Randomness 1.0 | 6.0 | 8.9% | 13 |
| alpha.BlackIce 1.0 | 6.3 | 9.0% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.5 | 4.5% | 0 |
| sample.Corners 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 79.4 | 11 / 35 | 4987 |
| 2 | 1 | 67.6 | 84.4 | 18 / 35 | 4954 |
| 3 | 1 | 68.6 | 87.0 | 17 / 35 | 5231 |
| 4 | 1 | 66.3 | 79.7 | 15 / 35 | 4910 |
| 5 | 1 | 68.8 | 86.7 | 20 / 35 | 5455 |
| 6 | 1 | 68.3 | 85.7 | 16 / 35 | 5132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 63 | 59% |
| kano.gamma.KanoGamma 1.8 | 28 | 64% |
| Polkwane.SmashMelee 1.0 | 16 | 81% |
| mz.AntiGrav 1.0 | 15 | 100% |
| stelo.Randomness 1.0 | 9 | 67% |
| alpha.BlackIce 1.0 | 4 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 43 | 38% | 69 |
| kano.gamma.KanoGamma 1.8 | 24 | 21% | 48 |
| stelo.Randomness 1.0 | 17 | 15% | 23 |
| mz.AntiGrav 1.0 | 11 | 10% | 27 |
| Polkwane.SmashMelee 1.0 | 7 | 6% | 17 |
| alpha.BlackIce 1.0 | 7 | 6% | 14 |
| sample.Corners 1.0 | 3 | 3% | 9 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 81.4 | 85 / 210 | 2.68 | 16.9% | 26288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.5 | 15.9% | 68 |
| hadur117.mini.DeiseD 0.3 | 1.5 | 16.9% | 85 |
| ary.Swarm 1.1 | 3.7 | 12.9% | 19 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.4% | 21 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.4% | 12 |
| shrub.Silver v048 | 6.3 | 8.4% | 2 |
| zyx.nano.Ant 1.1 | 6.7 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.0% | 2 |
| stelo.Mirror 1.1 | 8.7 | 5.7% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 80.3 | 10 / 35 | 4048 |
| 2 | 1 | 65.0 | 76.5 | 14 / 35 | 4304 |
| 3 | 2 | 66.0 | 81.9 | 12 / 35 | 4317 |
| 4 | 1 | 66.8 | 81.0 | 18 / 35 | 4419 |
| 5 | 2 | 65.1 | 78.7 | 10 / 35 | 4212 |
| 6 | 1 | 69.4 | 89.8 | 21 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 58 | 48% |
| lessonz.robocode.Oz 0.5.0 | 26 | 85% |
| simonton.nano.MeleeSeed 1.8 | 19 | 89% |
| ary.Swarm 1.1 | 18 | 61% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| shrub.Silver v048 | 2 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 55 | 44% | 87 |
| ary.Swarm 1.1 | 26 | 21% | 42 |
| lessonz.robocode.Oz 0.5.0 | 19 | 15% | 29 |
| simonton.nano.MeleeSeed 1.8 | 13 | 10% | 30 |
| stelo.Mirror 1.1 | 4 | 3% | 8 |
| zyx.nano.Ant 1.1 | 4 | 3% | 6 |
| shrub.Silver v048 | 3 | 2% | 5 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |

## Melee bench: F42

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.5 | 95 / 210 | 2.48 | 17.9% | 32349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.2 | 17.9% | 95 |
| wompi.Wallaby 5.1 | 1.8 | 16.0% | 61 |
| ara.Shera 0.88 | 3.3 | 13.5% | 29 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.3% | 20 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 3 |
| dsw.StaticD 1.0 | 6.5 | 7.0% | 3 |
| maribo.IotaCT 1.1 | 6.5 | 7.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.3 | 14 / 35 | 5156 |
| 2 | 1 | 66.3 | 80.6 | 16 / 35 | 5076 |
| 3 | 1 | 67.1 | 81.9 | 16 / 35 | 5532 |
| 4 | 1 | 69.3 | 87.3 | 18 / 35 | 5858 |
| 5 | 2 | 66.5 | 81.9 | 12 / 35 | 5203 |
| 6 | 1 | 69.1 | 88.3 | 19 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 44 | 77% |
| maribo.mini.MiniQuester 0.1 | 35 | 86% |
| ara.Shera 0.88 | 31 | 74% |
| dsw.StaticD 1.0 | 5 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 0% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 46 | 39% | 81 |
| ara.Shera 0.88 | 31 | 26% | 52 |
| maribo.mini.MiniQuester 0.1 | 30 | 26% | 60 |
| amz.NanoClone 1.41 | 3 | 3% | 3 |
| maribo.IotaCT 1.1 | 2 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 2 |
| dsw.StaticD 1.0 | 1 | 1% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 71.6 | 28 / 210 | 3.55 | 14.1% | 23298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 146 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 14.1% | 28 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.8% | 25 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.6% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.1% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.9% | 2 |
| mz.NanoGod 2.02 | 7.2 | 8.2% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 73.7 | 5 / 35 | 3660 |
| 2 | 2 | 62.4 | 70.5 | 5 / 35 | 3644 |
| 3 | 2 | 61.5 | 67.3 | 5 / 35 | 3578 |
| 4 | 2 | 63.7 | 73.3 | 5 / 35 | 4050 |
| 5 | 2 | 63.8 | 74.0 | 2 / 35 | 4210 |
| 6 | 2 | 63.1 | 71.1 | 6 / 35 | 4156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 49 | 29% |
| brainfade.melee.Dusk 0.44 | 12 | 33% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |
| dummy.micro.Sparrow 2.5 | 6 | 33% |
| mz.NanoGod 2.02 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 76 | 42% | 89 |
| brainfade.melee.Dusk 0.44 | 37 | 20% | 41 |
| dummy.micro.Sparrow 2.5 | 32 | 17% | 35 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 9% | 21 |
| Krabb.akim2.Akim2 1.1b | 9 | 5% | 10 |
| mz.NanoGod 2.02 | 8 | 4% | 10 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.1 | 107 / 210 | 2.25 | 18.8% | 32404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.8% | 107 |
| stelo.Liblix 0.3.1 | 2.2 | 15.3% | 54 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.6% | 36 |
| wompi.Quokka 1.6 | 4.2 | 10.5% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.5% | 2 |
| jwirde.Gort 2.0 | 6.2 | 8.7% | 5 |
| disan.Chair 2.2.0 | 6.8 | 8.0% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.1% | 1 |
| sample.Crazy 1.0 | 9.3 | 4.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.7 | 18 / 35 | 5256 |
| 2 | 1 | 67.2 | 81.0 | 16 / 35 | 5014 |
| 3 | 1 | 68.2 | 84.4 | 12 / 35 | 5459 |
| 4 | 1 | 70.4 | 91.4 | 24 / 35 | 5547 |
| 5 | 1 | 69.5 | 88.9 | 17 / 35 | 5650 |
| 6 | 1 | 68.7 | 84.4 | 20 / 35 | 5478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 72 | 69% |
| tzu.TheArtOfWar 1.2 | 52 | 63% |
| wompi.Quokka 1.6 | 10 | 90% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 89% |
| disan.Chair 2.2.0 | 4 | 100% |
| jwirde.Gort 2.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 43 | 42% | 98 |
| tzu.TheArtOfWar 1.2 | 28 | 27% | 55 |
| wompi.Quokka 1.6 | 10 | 10% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 8% | 13 |
| jwirde.Gort 2.0 | 6 | 6% | 11 |
| disan.Chair 2.2.0 | 3 | 3% | 7 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 4 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.8 | 80 / 210 | 2.28 | 19.4% | 36801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.4% | 80 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.5% | 113 |
| jje.BagPuss 1.2 | 2.8 | 12.2% | 5 |
| myl.nano.Graviton 1.10 | 4.3 | 9.9% | 3 |
| sul.Lunar 1.1 | 5.0 | 9.8% | 4 |
| fm.claire 1.7 | 6.2 | 8.8% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.4% | 5 |
| hvilela.HVilela 0.9 | 7.7 | 7.7% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.6% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 82.5 | 10 / 35 | 5864 |
| 2 | 1 | 68.3 | 82.9 | 14 / 35 | 5848 |
| 3 | 1 | 70.3 | 89.8 | 15 / 35 | 6484 |
| 4 | 1 | 70.1 | 88.3 | 13 / 35 | 6610 |
| 5 | 1 | 67.0 | 81.3 | 11 / 35 | 5482 |
| 6 | 1 | 70.8 | 90.2 | 17 / 35 | 6513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 104 | 24% |
| jje.BagPuss 1.2 | 17 | 94% |
| myl.nano.Graviton 1.10 | 10 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 100% |
| sul.Lunar 1.1 | 8 | 100% |
| wit.Deep7 2.0 | 8 | 88% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 1950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 81 | 62% | 0 |
| jje.BagPuss 1.2 | 16 | 12% | 72 |
| sul.Lunar 1.1 | 8 | 6% | 50 |
| myl.nano.Graviton 1.10 | 8 | 6% | 30 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 18 |
| fm.claire 1.7 | 6 | 5% | 13 |
| hvilela.HVilela 0.9 | 4 | 3% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 12 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |

## Melee bench: F46

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 78.5 | 48 / 210 | 2.93 | 15.6% | 26056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.7% | 62 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.8% | 81 |
| hadur117.mini.DeiseD 0.3 | 2.7 | 15.6% | 48 |
| cx.Princess 1.0 | 4.5 | 10.2% | 11 |
| mz.MicroSheep 1.0 | 4.7 | 10.2% | 2 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 3 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.4% | 4 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.4 | 15 / 35 | 4581 |
| 2 | 3 | 63.3 | 76.8 | 4 / 35 | 4413 |
| 3 | 3 | 63.1 | 76.2 | 8 / 35 | 3922 |
| 4 | 3 | 64.4 | 78.4 | 6 / 35 | 4437 |
| 5 | 3 | 64.0 | 76.8 | 8 / 35 | 4267 |
| 6 | 3 | 64.4 | 77.5 | 7 / 35 | 4436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 41 | 37% |
| kc.mini.Mirage 0.2 | 36 | 58% |
| cx.Princess 1.0 | 10 | 70% |
| mz.MicroSheep 1.0 | 4 | 75% |
| sadoner.killer 0.2 | 2 | 50% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 39% | 83 |
| rsalesc.melee.Medina 0.4.5 | 54 | 33% | 70 |
| mz.MicroSheep 1.0 | 13 | 8% | 16 |
| cx.Princess 1.0 | 12 | 7% | 19 |
| sadoner.killer 0.2 | 9 | 6% | 11 |
| arthord.NanoSatanMelee Beta | 9 | 6% | 10 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
1 death(s) with no robot to name.

