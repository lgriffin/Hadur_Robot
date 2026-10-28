# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 79.5 | 28 / 210 | 2.85 | 15.5% | 27439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 141 |
| hadur117.mini.DeiseCM 0.2 | 2.0 | 15.5% | 28 |
| sgp.JollyNinja 3.53 | 3.0 | 12.0% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.8% | 4 |
| lorneswork.Predator 1.0 | 5.2 | 10.2% | 7 |
| mz.MicroGodMelee 1 | 5.3 | 10.4% | 8 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 79.0 | 5 / 35 | 4581 |
| 2 | 2 | 65.1 | 82.5 | 7 / 35 | 4362 |
| 3 | 2 | 64.4 | 76.5 | 2 / 35 | 4992 |
| 4 | 2 | 63.8 | 77.8 | 5 / 35 | 4345 |
| 5 | 2 | 64.3 | 80.3 | 5 / 35 | 4558 |
| 6 | 2 | 64.8 | 80.6 | 4 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 92 | 11% |
| sgp.JollyNinja 3.53 | 15 | 53% |
| lorneswork.Predator 1.0 | 9 | 44% |
| mz.MicroGodMelee 1 | 8 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |

Hadur died in 182 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 109 | 60% | 117 |
| sgp.JollyNinja 3.53 | 29 | 16% | 36 |
| mz.MicroGodMelee 1 | 16 | 9% | 21 |
| lorneswork.Predator 1.0 | 11 | 6% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 5% | 13 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| adt.Ar2 1.0 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 77.0 | 44 / 210 | 3.07 | 16.0% | 27702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.3 | 16.0% | 44 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.5% | 67 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 14.2% | 51 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.1% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.6% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.4% | 1 |
| Noran.BitchingElk 0.054 | 7.0 | 7.9% | 16 |
| sch.Simone 0.3d | 7.8 | 7.3% | 8 |
| stelo.PatternRobot 1.0 | 8.5 | 6.4% | 6 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 78.1 | 6 / 35 | 4512 |
| 2 | 1 | 66.0 | 79.0 | 10 / 35 | 5213 |
| 3 | 2 | 63.3 | 75.6 | 4 / 35 | 4672 |
| 4 | 1 | 62.5 | 73.3 | 8 / 35 | 4441 |
| 5 | 1 | 64.7 | 80.0 | 8 / 35 | 4498 |
| 6 | 2 | 64.0 | 76.2 | 8 / 35 | 4366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 39 | 23% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 30 | 30% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 78% |
| Noran.BitchingElk 0.054 | 9 | 33% |
| sch.Simone 0.3d | 6 | 33% |
| stelo.PatternRobot 1.0 | 5 | 60% |
| fullsail.SweetTea 1.1 | 3 | 33% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 56 | 34% | 71 |
| pulsar.PulsarMax 0.8.9 | 47 | 28% | 55 |
| stelo.PatternRobot 1.0 | 16 | 10% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 8% | 16 |
| Noran.BitchingElk 0.054 | 10 | 6% | 11 |
| sch.Simone 0.3d | 9 | 5% | 14 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 4% | 14 |
| fnc.bandit.Bandit 5.2.0 | 6 | 4% | 7 |
| fullsail.SweetTea 1.1 | 3 | 2% | 4 |

## Melee bench: F03

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 93.0 | 141 / 210 | 1.63 | 19.9% | 34964 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 19.9% | 141 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.2% | 19 |
| radnor.DoctorBob 1.42 | 2.7 | 13.6% | 22 |
| vuen.Cake 2.51 | 3.7 | 12.4% | 25 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.7% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.4 | 22 / 35 | 5625 |
| 2 | 1 | 70.4 | 94.6 | 24 / 35 | 6128 |
| 3 | 1 | 69.6 | 94.9 | 24 / 35 | 5347 |
| 4 | 1 | 70.0 | 93.7 | 23 / 35 | 5899 |
| 5 | 1 | 69.0 | 89.2 | 22 / 35 | 5668 |
| 6 | 1 | 71.1 | 94.3 | 26 / 35 | 6297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 64 | 73% |
| kawigi.nano.Lib 1.0 | 51 | 84% |
| radnor.DoctorBob 1.42 | 47 | 83% |
| urdos.URDOS 1.3 | 6 | 100% |
| oa.weak.FlyMk1 0.1 | 5 | 80% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 67% |

Hadur died in 69 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 39% | 70 |
| vuen.Cake 2.51 | 21 | 30% | 63 |
| radnor.DoctorBob 1.42 | 13 | 19% | 44 |
| oa.weak.FlyMk1 0.1 | 4 | 6% | 12 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 3 |
| urdos.URDOS 1.3 | 1 | 1% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 2 |
| adt.Ar1 2.1 | 0 | 0% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 73.3 | 7 / 210 | 3.40 | 15.0% | 31187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.0% | 190 |
| hadur117.mini.DeiseCM 0.2 | 2.2 | 15.0% | 7 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.4% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 5 |
| josago.Jorgito 0.16 | 5.0 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 7.2% | 0 |
| css.Delitioner 0.11 | 6.8 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.8% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.1% | 1 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 74.0 | 1 / 35 | 5204 |
| 2 | 2 | 64.7 | 74.3 | 0 / 35 | 5485 |
| 3 | 2 | 63.7 | 73.3 | 1 / 35 | 4858 |
| 4 | 2 | 62.9 | 70.5 | 1 / 35 | 4959 |
| 5 | 3 | 63.8 | 71.4 | 2 / 35 | 5076 |
| 6 | 2 | 65.9 | 76.5 | 2 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 53 | 6% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| TNT.TNT 0.99.1 | 2 | 0% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 153 | 75% | 159 |
| apc.LeeroyJenkins2 1.0 | 21 | 10% | 22 |
| josago.Jorgito 0.16 | 10 | 5% | 10 |
| TNT.TNT 0.99.1 | 7 | 3% | 7 |
| tj.zombie1n 1.0.1 | 6 | 3% | 6 |
| rampancy.Durandal 2.1d | 4 | 2% | 4 |
| css.Delitioner 0.11 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 64.1 | 8 / 210 | 4.23 | 12.1% | 19961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.7% | 113 |
| justin.DemonicRage 3.4 | 2.0 | 17.3% | 60 |
| wompi.Numbat 2.1 | 3.0 | 13.3% | 21 |
| hadur117.mini.DeiseCM 0.2 | 4.0 | 12.1% | 8 |
| ms.Ares 0.19 | 5.5 | 8.8% | 1 |
| axeBots.HataMoto 3.09 | 5.5 | 9.0% | 7 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.8% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.2 | 70.5 | 3 / 35 | 3654 |
| 2 | 4 | 57.6 | 63.5 | 2 / 35 | 3162 |
| 3 | 4 | 55.4 | 57.8 | 0 / 35 | 2972 |
| 4 | 4 | 59.4 | 67.0 | 2 / 35 | 3233 |
| 5 | 4 | 56.4 | 59.4 | 0 / 35 | 3375 |
| 6 | 4 | 59.4 | 66.3 | 1 / 35 | 3565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 14 | 29% |
| cb.fire.Firestarter 2.0f | 14 | 7% |
| wompi.Numbat 2.1 | 8 | 25% |
| ms.Ares 0.19 | 1 | 0% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 76 | 38% | 77 |
| justin.DemonicRage 3.4 | 60 | 30% | 64 |
| wompi.Numbat 2.1 | 25 | 12% | 26 |
| axeBots.HataMoto 3.09 | 17 | 8% | 17 |
| ms.Ares 0.19 | 14 | 7% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 2% | 5 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 0% | 2 |

## Melee bench: F06

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.7 | 112 / 210 | 2.20 | 18.1% | 27333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 18.1% | 112 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 38 |
| origin.SleepSiphon 1.7b | 3.5 | 11.9% | 31 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.7% | 13 |
| mld.Wisdom 1.0 | 4.5 | 11.2% | 6 |
| gg.Wolverine 2.0 | 5.8 | 8.9% | 5 |
| spinnercat.Omen 1.0 | 7.7 | 6.8% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.7% | 3 |
| DBall.NUKE 0.1 | 8.2 | 6.7% | 2 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.7 | 17 / 35 | 4810 |
| 2 | 1 | 69.3 | 92.4 | 24 / 35 | 4485 |
| 3 | 1 | 66.3 | 81.3 | 18 / 35 | 4199 |
| 4 | 1 | 68.8 | 88.9 | 21 / 35 | 4835 |
| 5 | 1 | 68.3 | 90.8 | 19 / 35 | 4500 |
| 6 | 1 | 65.7 | 81.3 | 13 / 35 | 4504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 52 | 79% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 81% |
| origin.SleepSiphon 1.7b | 25 | 64% |
| mld.Wisdom 1.0 | 14 | 86% |
| gg.Wolverine 2.0 | 12 | 83% |
| DBall.NUKE 0.1 | 6 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| sample.Fire 1.0 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 43 | 44% | 73 |
| origin.SleepSiphon 1.7b | 19 | 19% | 44 |
| pe.minimelee.SandboxMiniMelee 1.1 | 17 | 17% | 37 |
| mld.Wisdom 1.0 | 13 | 13% | 31 |
| gg.Wolverine 2.0 | 4 | 4% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 6 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 7 |

## Melee bench: F07

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.9 | 50 / 210 | 2.90 | 16.2% | 29601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 17.7% | 58 |
| rtk.Tachikoma 1.0 | 1.7 | 17.7% | 72 |
| hadur117.mini.DeiseCM 0.2 | 2.8 | 16.2% | 50 |
| franzor.Lizt 1.3.1 | 4.5 | 10.9% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.4% | 16 |
| exauge.GateKeeper 1.1.121g | 6.3 | 8.1% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.4% | 0 |
| sample.Target 1.0 | 9.2 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 82.9 | 12 / 35 | 5005 |
| 2 | 3 | 65.0 | 74.6 | 5 / 35 | 4748 |
| 3 | 3 | 66.3 | 77.5 | 10 / 35 | 5006 |
| 4 | 3 | 65.3 | 76.8 | 6 / 35 | 4644 |
| 5 | 3 | 67.3 | 80.0 | 10 / 35 | 5245 |
| 6 | 3 | 66.8 | 81.9 | 7 / 35 | 4953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 57 | 49% |
| oog.melee.CapuletDroid 1.1 | 14 | 71% |
| rsalesc.melee.Monk 0.3.6c | 13 | 15% |
| franzor.Lizt 1.3.1 | 7 | 86% |
| skm.PateranBotlock2 1.0 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 65 | 41% | 92 |
| rsalesc.melee.Monk 0.3.6c | 63 | 39% | 74 |
| oog.melee.CapuletDroid 1.1 | 20 | 13% | 29 |
| exauge.GateKeeper 1.1.121g | 6 | 4% | 7 |
| franzor.Lizt 1.3.1 | 4 | 3% | 4 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.4 | 100 / 210 | 2.31 | 18.7% | 32272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 18.7% | 100 |
| tm.Yuugao 1.0 | 2.3 | 13.5% | 49 |
| shrub.Vapour v159 | 2.7 | 11.7% | 32 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.0% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.6% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.8% | 3 |
| m3thos.Eva00 1.1 | 6.2 | 8.8% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.8% | 2 |
| SHAM.WOW 1.4 | 9.0 | 6.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.8 | 14 / 35 | 5027 |
| 2 | 1 | 68.0 | 83.5 | 16 / 35 | 5738 |
| 3 | 1 | 68.2 | 86.7 | 19 / 35 | 5304 |
| 4 | 1 | 68.3 | 85.7 | 17 / 35 | 5457 |
| 5 | 1 | 68.9 | 87.9 | 18 / 35 | 5481 |
| 6 | 1 | 67.8 | 85.1 | 16 / 35 | 5265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 42 | 48% |
| Krabb.sliNk.Garm 0.9u | 32 | 75% |
| shrub.Vapour v159 | 30 | 60% |
| jwst.DAD.DarkAndDarker 1.1 | 18 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 12 | 83% |
| m3thos.Eva00 1.1 | 10 | 70% |
| SHAM.WOW 1.4 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 48 | 44% | 72 |
| shrub.Vapour v159 | 24 | 22% | 43 |
| Krabb.sliNk.Garm 0.9u | 18 | 16% | 31 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 5% | 19 |
| zyx.nano.BacillusComma 1.0 | 5 | 5% | 6 |
| m3thos.Eva00 1.1 | 4 | 4% | 13 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 3% | 18 |
| SHAM.WOW 1.4 | 1 | 1% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 68.3 | 35 / 210 | 3.86 | 13.8% | 22091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.6% | 105 |
| kc.micro.Figment 1.0 | 2.2 | 14.4% | 39 |
| hadur117.mini.DeiseCM 0.2 | 2.8 | 13.8% | 35 |
| yagami.Tidus 0.11 | 4.7 | 10.8% | 2 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.8% | 18 |
| mc2.enemy.Original 0.9 | 5.5 | 9.7% | 11 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.7 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.2 | 5.0% | 0 |
| step.nanoPri 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 72.4 | 7 / 35 | 4155 |
| 2 | 3 | 58.7 | 63.5 | 3 / 35 | 3484 |
| 3 | 2 | 59.1 | 66.0 | 6 / 35 | 3290 |
| 4 | 3 | 62.1 | 70.2 | 5 / 35 | 3744 |
| 5 | 3 | 60.5 | 67.0 | 6 / 35 | 3723 |
| 6 | 3 | 61.4 | 70.5 | 8 / 35 | 3695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 35 | 57% |
| positive.Portia 1.26e | 34 | 15% |
| mc2.enemy.Original 0.9 | 5 | 100% |
| pedersen.Grishnakh 1.0 | 4 | 75% |
| yagami.Tidus 0.11 | 2 | 50% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 73 | 42% | 79 |
| kc.micro.Figment 1.0 | 38 | 22% | 60 |
| yagami.Tidus 0.11 | 21 | 12% | 22 |
| pedersen.Grishnakh 1.0 | 13 | 7% | 13 |
| mc2.enemy.Original 0.9 | 12 | 7% | 17 |
| robar.nano.Assertive_Melee 0.2 | 10 | 6% | 10 |
| rdm.Dueler 0.4x | 4 | 2% | 4 |
| dft.Calliope 5.6 | 2 | 1% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.6 | 136 / 210 | 1.76 | 19.2% | 30293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 19.2% | 136 |
| DTF.Kludgy 1.2b | 2.0 | 14.4% | 34 |
| ne.Chimera 1.2 | 3.2 | 12.6% | 12 |
| ejb.Polaris 1.0.1 | 4.0 | 12.1% | 17 |
| tvv.micro.Antares 1.1.1 | 5.3 | 9.9% | 5 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 5 |
| kurios.DOSexe .9b | 8.0 | 5.9% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 5.8% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.1 | 26 / 35 | 5604 |
| 2 | 1 | 69.2 | 92.1 | 25 / 35 | 4671 |
| 3 | 1 | 70.0 | 93.0 | 24 / 35 | 5350 |
| 4 | 1 | 68.0 | 88.9 | 18 / 35 | 5033 |
| 5 | 1 | 68.8 | 91.1 | 22 / 35 | 4810 |
| 6 | 1 | 68.7 | 92.4 | 21 / 35 | 4825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 67 | 66% |
| ejb.Polaris 1.0.1 | 41 | 85% |
| ne.Chimera 1.2 | 30 | 77% |
| vStar.RAFzilla 2.15 | 13 | 85% |
| tvv.micro.Antares 1.1.1 | 10 | 90% |
| donjezza.Muncho 1.0 | 7 | 86% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 3 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 39 | 52% | 81 |
| ne.Chimera 1.2 | 15 | 20% | 37 |
| ejb.Polaris 1.0.1 | 10 | 13% | 43 |
| vStar.RAFzilla 2.15 | 3 | 4% | 13 |
| kurios.DOSexe .9b | 2 | 3% | 11 |
| donjezza.Muncho 1.0 | 2 | 3% | 8 |
| tvv.micro.Antares 1.1.1 | 2 | 3% | 7 |
| sam.Samspin 1.0 | 1 | 1% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 2 |

## Melee bench: F11

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.9 | 64 / 210 | 2.99 | 16.0% | 25608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.8% | 76 |
| hadur117.mini.DeiseCM 0.2 | 1.7 | 16.0% | 64 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.6% | 25 |
| djc.DynaBot 0.1.1 | 4.2 | 10.5% | 12 |
| rdt199.Warlord 0.73 | 5.2 | 9.5% | 18 |
| uji.YellohFellah 1.0 | 6.7 | 8.5% | 10 |
| br2.MobyDickBot 1.6 | 6.8 | 8.5% | 6 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.0% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 79.4 | 14 / 35 | 4260 |
| 2 | 2 | 62.2 | 72.7 | 7 / 35 | 4019 |
| 3 | 2 | 64.8 | 79.0 | 11 / 35 | 4119 |
| 4 | 1 | 64.6 | 78.4 | 12 / 35 | 4276 |
| 5 | 2 | 63.9 | 77.8 | 7 / 35 | 4350 |
| 6 | 2 | 65.7 | 80.0 | 13 / 35 | 4584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 51 | 41% |
| djc.DynaBot 0.1.1 | 16 | 88% |
| cx.mini.Nimrod 0.55 | 13 | 77% |
| uji.YellohFellah 1.0 | 11 | 91% |
| rdt199.Warlord 0.73 | 7 | 43% |
| br2.MobyDickBot 1.6 | 6 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 66 | 45% | 86 |
| cx.mini.Nimrod 0.55 | 26 | 18% | 39 |
| djc.DynaBot 0.1.1 | 14 | 10% | 22 |
| rdt199.Warlord 0.73 | 13 | 9% | 15 |
| br2.MobyDickBot 1.6 | 9 | 6% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 5% | 7 |
| KiraNL.Chupacabra 0.4 | 5 | 3% | 8 |
| uji.YellohFellah 1.0 | 4 | 3% | 14 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 82.0 | 74 / 210 | 2.62 | 16.6% | 23355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 16.6% | 74 |
| nat.PallasHawk 1.0 | 2.7 | 13.7% | 53 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.4% | 36 |
| darkcanuck.Leon 1.01 | 3.7 | 12.8% | 25 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.5% | 16 |
| jrm.Test0 1.0 | 6.3 | 7.7% | 1 |
| cs.sheldor.Talon 1.1 | 7.7 | 7.0% | 2 |
| jp.Perpy 16.0 | 7.7 | 6.9% | 1 |
| jaybot.bots.Oddball 4.0 | 8.8 | 6.0% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 77.5 | 12 / 35 | 3935 |
| 2 | 1 | 67.4 | 90.2 | 16 / 35 | 3853 |
| 3 | 1 | 65.0 | 82.5 | 13 / 35 | 3818 |
| 4 | 1 | 64.1 | 79.0 | 12 / 35 | 3726 |
| 5 | 1 | 66.1 | 86.0 | 14 / 35 | 3852 |
| 6 | 1 | 63.6 | 76.8 | 7 / 35 | 4171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 42 | 50% |
| darkcanuck.Leon 1.01 | 27 | 56% |
| bts.wiki.RipCurl 0.9b | 25 | 68% |
| brainfade.melee.Genghis 0.36 | 19 | 58% |
| jp.Perpy 16.0 | 5 | 80% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jrm.Test0 1.0 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 47 | 34% | 70 |
| bts.wiki.RipCurl 0.9b | 34 | 25% | 52 |
| darkcanuck.Leon 1.01 | 27 | 20% | 40 |
| brainfade.melee.Genghis 0.36 | 15 | 11% | 21 |
| jrm.Test0 1.0 | 6 | 4% | 7 |
| jp.Perpy 16.0 | 4 | 3% | 6 |
| jaybot.bots.Oddball 4.0 | 2 | 1% | 7 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 69.9 | 20 / 210 | 3.71 | 13.5% | 24053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 17.6% | 58 |
| mn.Combat 3.25.0 | 1.7 | 16.9% | 92 |
| hadur117.mini.DeiseCM 0.2 | 3.3 | 13.5% | 20 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.9% | 14 |
| shinh.Entangled 0.3 | 4.3 | 12.5% | 23 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 3 |
| ayk.WallHugger 1.0 | 8.3 | 4.8% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.6 | 61.6 | 1 / 35 | 3649 |
| 2 | 3 | 62.9 | 74.0 | 4 / 35 | 4333 |
| 3 | 3 | 61.1 | 68.6 | 3 / 35 | 4162 |
| 4 | 3 | 61.9 | 72.7 | 5 / 35 | 3876 |
| 5 | 3 | 61.4 | 69.8 | 3 / 35 | 4123 |
| 6 | 3 | 62.3 | 72.7 | 4 / 35 | 3910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 24 | 33% |
| ags.Glacier 0.2.11 | 22 | 27% |
| shinh.Entangled 0.3 | 7 | 43% |
| stelo.Wang 1.0 | 3 | 67% |
| gh.micro.Gruweltje 0.7 | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 78 | 41% | 84 |
| mn.Combat 3.25.0 | 47 | 25% | 55 |
| shinh.Entangled 0.3 | 30 | 16% | 34 |
| gh.micro.Gruweltje 0.7 | 15 | 8% | 16 |
| stelo.Wang 1.0 | 12 | 6% | 12 |
| maribo.FollowFire 1 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 3 | 2% | 4 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.8 | 138 / 210 | 1.74 | 19.4% | 30368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 19.4% | 138 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.5% | 33 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 28 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 10.0% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 9.5% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.4% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.3 | 6.8% | 5 |
| pa.Improved 1.0 | 8.7 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.7 | 24 / 35 | 5283 |
| 2 | 1 | 69.1 | 88.6 | 21 / 35 | 5109 |
| 3 | 1 | 69.1 | 91.4 | 23 / 35 | 4929 |
| 4 | 1 | 69.6 | 90.5 | 23 / 35 | 5237 |
| 5 | 1 | 69.7 | 94.0 | 23 / 35 | 4818 |
| 6 | 1 | 69.8 | 94.6 | 24 / 35 | 4992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 82% |
| catcat20.shape.Theta 0.018 | 42 | 62% |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 77% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 33 | 46% | 109 |
| catcat20.shape.Theta 0.018 | 25 | 35% | 47 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 6% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 7 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 1% | 2 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F15

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.8 | 90 / 210 | 2.64 | 18.0% | 32968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 18.0% | 90 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.6% | 29 |
| emp.Yngwie 1.11 | 3.3 | 12.6% | 46 |
| mld.DustBunny 3.8 | 3.7 | 12.1% | 16 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.1% | 8 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.1% | 19 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.8% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.8% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.0 | 12 / 35 | 5173 |
| 2 | 1 | 68.8 | 86.7 | 19 / 35 | 5382 |
| 3 | 1 | 67.4 | 80.6 | 17 / 35 | 5439 |
| 4 | 1 | 65.6 | 74.9 | 12 / 35 | 5295 |
| 5 | 1 | 69.2 | 86.7 | 18 / 35 | 6000 |
| 6 | 1 | 67.3 | 82.9 | 12 / 35 | 5679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 37 | 89% |
| emp.Yngwie 1.11 | 26 | 46% |
| mld.DustBunny 3.8 | 22 | 68% |
| cb.nano.Insomnia 1.0 | 17 | 88% |
| kawigi.robot.Girl 1.2 | 13 | 85% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 39 | 33% | 58 |
| kawigi.micro.Shiz 1.1 | 28 | 23% | 62 |
| mld.DustBunny 3.8 | 22 | 18% | 41 |
| cb.nano.Insomnia 1.0 | 15 | 13% | 18 |
| kawigi.robot.Girl 1.2 | 10 | 8% | 19 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 4 |
| divineomega.TrialBot 0.003 | 2 | 2% | 8 |

## Melee bench: F16

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.3 | 102 / 210 | 2.32 | 18.6% | 32255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.2 | 18.6% | 102 |
| gh.Griezel 0.5.2 | 1.8 | 16.6% | 69 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.1% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 9.9% | 23 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.1% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 8.8% | 0 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.4% | 3 |
| repositorio.NanoStep 1.0 | 8.3 | 5.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 5.3% | 4 |
| asd.Cthulhu 1.3 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 77.8 | 12 / 35 | 4921 |
| 2 | 1 | 68.3 | 86.7 | 15 / 35 | 5206 |
| 3 | 1 | 71.2 | 93.3 | 25 / 35 | 5783 |
| 4 | 1 | 69.2 | 86.3 | 19 / 35 | 5445 |
| 5 | 1 | 68.6 | 85.4 | 19 / 35 | 5462 |
| 6 | 1 | 67.6 | 82.2 | 12 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 92 | 62% |
| techdude.forest.FlamingForest 1.1 | 17 | 53% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 93% |
| bvh.fnr.Fenrir 0.36l | 8 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 83% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1050. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 43 | 39% | 100 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 22% | 41 |
| stelo.IntrinsicVolatility 1.4 | 11 | 10% | 15 |
| techdude.forest.FlamingForest 1.1 | 10 | 9% | 18 |
| bvh.fnr.Fenrir 0.36l | 9 | 8% | 11 |
| divineomega.DivineBot 1.9.4.5 | 6 | 6% | 14 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 6 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |

## Melee bench: F17

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.1 | 106 / 210 | 2.07 | 18.6% | 29873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 18.6% | 106 |
| et.Predator 1.8 | 2.7 | 13.2% | 20 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.9% | 33 |
| cx.BlestPain 1.41 | 4.2 | 11.5% | 28 |
| nic.Nicator 2.4 | 5.0 | 10.8% | 16 |
| ahf.NanoAndrew .4 | 5.2 | 10.6% | 6 |
| maribo.melee.BMV 0.1 | 7.0 | 8.7% | 2 |
| tex.Longbot 0.4 | 8.3 | 6.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.7 | 16 / 35 | 5205 |
| 2 | 1 | 67.4 | 85.1 | 12 / 35 | 5165 |
| 3 | 1 | 68.9 | 89.5 | 19 / 35 | 4962 |
| 4 | 1 | 67.5 | 87.0 | 16 / 35 | 4471 |
| 5 | 1 | 69.0 | 89.2 | 22 / 35 | 4804 |
| 6 | 1 | 70.0 | 92.1 | 21 / 35 | 5266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 49 | 80% |
| oog.melee.Mercutio 1.0 | 37 | 73% |
| cx.BlestPain 1.41 | 26 | 50% |
| nic.Nicator 2.4 | 24 | 50% |
| ahf.NanoAndrew .4 | 11 | 82% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| goblin.Bender 2.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 26 | 24% | 41 |
| oog.melee.Mercutio 1.0 | 23 | 21% | 47 |
| et.Predator 1.8 | 22 | 21% | 58 |
| nic.Nicator 2.4 | 18 | 17% | 33 |
| ahf.NanoAndrew .4 | 9 | 8% | 18 |
| maribo.melee.BMV 0.1 | 5 | 5% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 3 |
| goblin.Bender 2.4 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.7 | 113 / 210 | 2.20 | 18.0% | 26138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 18.0% | 113 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.4% | 33 |
| agd.Mooserwirt2 2.7 | 3.0 | 11.9% | 26 |
| uji.DBH 1.1 | 3.7 | 10.7% | 13 |
| ratosh.Nobo 0.21 | 5.3 | 9.9% | 6 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.3% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.9% | 8 |
| sigterm.Sigterm 1.0 | 7.3 | 7.8% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.5% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.4 | 20 / 35 | 4486 |
| 2 | 1 | 67.6 | 90.2 | 16 / 35 | 4458 |
| 3 | 1 | 65.3 | 79.7 | 15 / 35 | 4435 |
| 4 | 1 | 66.8 | 86.0 | 22 / 35 | 3984 |
| 5 | 1 | 67.5 | 90.2 | 21 / 35 | 4160 |
| 6 | 1 | 68.1 | 88.6 | 19 / 35 | 4615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 42 | 67% |
| agd.Mooserwirt2 2.7 | 40 | 63% |
| uji.DBH 1.1 | 24 | 67% |
| spinnercat.Robovirus 2.718 | 16 | 88% |
| sigterm.Sigterm 1.0 | 15 | 87% |
| ratosh.Nobo 0.21 | 11 | 64% |
| stelo.WangRobot 1.0 | 8 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 30 | 31% | 61 |
| morbid.MorbidPriest 1.0 | 21 | 22% | 55 |
| uji.DBH 1.1 | 14 | 14% | 26 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 10% | 17 |
| ratosh.Nobo 0.21 | 8 | 8% | 15 |
| sigterm.Sigterm 1.0 | 4 | 4% | 11 |
| spinnercat.Robovirus 2.718 | 4 | 4% | 11 |
| stelo.WangRobot 1.0 | 4 | 4% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 6 |

## Melee bench: F19

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.4 | 138 / 210 | 1.78 | 19.7% | 31231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 19.7% | 138 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 15.0% | 36 |
| mld.Infinity 2.2 | 2.7 | 13.8% | 28 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.9% | 3 |
| erdnis.Rover 0.3 | 4.8 | 10.8% | 2 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.0% | 0 |
| pac.ABC 2.1 | 7.3 | 6.8% | 1 |
| mbh.Mbh 0.1 | 7.5 | 7.0% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.8% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 95.2 | 27 / 35 | 5024 |
| 2 | 1 | 68.9 | 84.8 | 18 / 35 | 5067 |
| 3 | 1 | 71.5 | 93.7 | 24 / 35 | 5851 |
| 4 | 1 | 70.1 | 90.5 | 23 / 35 | 5190 |
| 5 | 1 | 70.9 | 94.0 | 24 / 35 | 5277 |
| 6 | 1 | 69.6 | 90.2 | 22 / 35 | 4822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 72 | 74% |
| mld.Infinity 2.2 | 60 | 88% |
| krillr.mini.JointStrike 2.0.0 | 17 | 88% |
| erdnis.Rover 0.3 | 5 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 35 | 49% | 90 |
| krillr.mini.JointStrike 2.0.0 | 14 | 19% | 27 |
| mld.Infinity 2.2 | 13 | 18% | 55 |
| erdnis.Rover 0.3 | 6 | 8% | 14 |
| mbh.Mbh 0.1 | 2 | 3% | 8 |
| patson.PatsonTestBot 1.0 | 1 | 1% | 6 |
| pac.ABC 2.1 | 1 | 1% | 4 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.6 | 111 / 210 | 2.03 | 19.3% | 33078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 19.3% | 111 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.3% | 57 |
| fwb.Nine 1.0.1 | 3.8 | 11.0% | 14 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.5% | 5 |
| catcat20.Rabbit 0.001 | 4.3 | 10.3% | 15 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.6% | 1 |
| bayen.nut.Squirrel 1.615 | 6.7 | 7.9% | 5 |
| djdjdj.NanoSkunk10 1.0 | 7.7 | 7.2% | 2 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.4 | 20 / 35 | 5510 |
| 2 | 1 | 69.7 | 88.9 | 19 / 35 | 5585 |
| 3 | 1 | 68.7 | 86.7 | 15 / 35 | 5540 |
| 4 | 1 | 68.8 | 89.8 | 18 / 35 | 5056 |
| 5 | 1 | 70.3 | 91.4 | 20 / 35 | 5832 |
| 6 | 1 | 69.3 | 89.2 | 19 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 53% |
| fwb.Nine 1.0.1 | 37 | 86% |
| nz.jdc.nano.GridFu 1.0 | 14 | 93% |
| catcat20.Rabbit 0.001 | 13 | 77% |
| bayen.nut.Squirrel 1.615 | 9 | 89% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 65 | 66% | 107 |
| fwb.Nine 1.0.1 | 11 | 11% | 13 |
| bayen.nut.Squirrel 1.615 | 8 | 8% | 15 |
| catcat20.Rabbit 0.001 | 6 | 6% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3 | 3% | 23 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 13 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 4 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F21

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.6 | 128 / 210 | 1.76 | 19.6% | 31424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 19.6% | 128 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 58 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 14 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 3 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.5% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.0% | 6 |
| fire219.CatBot 1.0 | 7.2 | 6.6% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 1 |
| PSW.Relentless 0.1 | 9.5 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.7 | 19 / 35 | 5637 |
| 2 | 1 | 68.8 | 90.2 | 19 / 35 | 4899 |
| 3 | 1 | 71.4 | 94.6 | 26 / 35 | 5512 |
| 4 | 1 | 68.4 | 87.6 | 18 / 35 | 4932 |
| 5 | 1 | 72.1 | 96.2 | 26 / 35 | 5961 |
| 6 | 1 | 68.4 | 89.2 | 20 / 35 | 4483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 103 | 66% |
| dummy.mini.Scimitar 1.01 | 34 | 82% |
| cf.RiO.RiOx 4.2.1 | 18 | 94% |
| eld.Hmm 1.0 | 11 | 82% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1213. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 43 | 52% | 85 |
| dummy.mini.Scimitar 1.01 | 19 | 23% | 58 |
| cf.RiO.RiOx 4.2.1 | 11 | 13% | 31 |
| eld.Hmm 1.0 | 6 | 7% | 21 |
| el.JumpShoot 0.2 | 3 | 4% | 5 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 4 |
| fire219.CatBot 1.0 | 0 | 0% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
| PSW.Relentless 0.1 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.2 | 59 / 210 | 2.51 | 16.8% | 27983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.3 | 17.5% | 73 |
| hadur117.mini.DeiseCM 0.2 | 2.0 | 16.8% | 59 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.1% | 43 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.0% | 27 |
| bigpete.Stewie 1.0 | 5.0 | 9.7% | 3 |
| yk.JahRoslav 1.1 | 6.5 | 6.8% | 1 |
| tad.Dalek98 0.98 | 7.3 | 6.4% | 2 |
| gg.Squaraus 0.6 | 7.3 | 6.5% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.3% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 84.8 | 8 / 35 | 4873 |
| 2 | 2 | 66.4 | 83.8 | 6 / 35 | 4650 |
| 3 | 2 | 66.0 | 81.3 | 11 / 35 | 4599 |
| 4 | 3 | 65.5 | 80.0 | 8 / 35 | 4491 |
| 5 | 1 | 67.7 | 86.0 | 16 / 35 | 4698 |
| 6 | 2 | 66.8 | 83.5 | 10 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 56 | 29% |
| kvk.HebusLeTroll 0.35 | 39 | 46% |
| jlm.javaDisturbance 0.59 | 29 | 69% |
| pbg.NinjaX 1.2 | 3 | 67% |
| bigpete.Stewie 1.0 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 0% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 58 | 38% | 80 |
| kvk.HebusLeTroll 0.35 | 48 | 32% | 61 |
| jlm.javaDisturbance 0.59 | 32 | 21% | 49 |
| bigpete.Stewie 1.0 | 5 | 3% | 8 |
| tad.Dalek98 0.98 | 5 | 3% | 5 |
| pbg.NinjaX 1.2 | 1 | 1% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.6 | 77 / 210 | 2.39 | 17.9% | 31833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.3 | 17.9% | 77 |
| pe.SandboxLump 1.52 | 1.7 | 17.7% | 84 |
| cre.Karolos 0.32 | 3.2 | 13.5% | 27 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.9% | 12 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.7% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.0% | 1 |
| cw.megas.Blade 0.8 | 6.7 | 8.1% | 1 |
| sample.Walls 1.0 | 7.8 | 7.8% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.3 | 15 / 35 | 5120 |
| 2 | 2 | 68.4 | 81.9 | 11 / 35 | 5726 |
| 3 | 1 | 68.3 | 86.0 | 10 / 35 | 5536 |
| 4 | 1 | 68.6 | 87.0 | 15 / 35 | 5117 |
| 5 | 2 | 66.6 | 80.3 | 10 / 35 | 4886 |
| 6 | 1 | 68.5 | 84.1 | 16 / 35 | 5448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 83 | 39% |
| cre.Karolos 0.32 | 24 | 58% |
| stelo.AreaTargetingBot 1.1 | 20 | 80% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 83% |
| sample.Walls 1.0 | 6 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 0% |

Hadur died in 133 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 84 | 63% | 118 |
| cre.Karolos 0.32 | 22 | 17% | 35 |
| stelo.AreaTargetingBot 1.1 | 11 | 8% | 23 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 5% | 10 |
| cw.megas.Blade 0.8 | 5 | 4% | 5 |
| stelo.RamTrackSurfer 1.2 | 3 | 2% | 10 |
| sample.Walls 1.0 | 2 | 2% | 7 |

## Melee bench: F24

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.7 | 42 / 210 | 3.55 | 14.0% | 20462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 2.2 | 13.8% | 39 |
| hadur117.mini.DeiseCM 0.2 | 2.3 | 14.0% | 42 |
| rz.GlowBlowMelee 1.4 | 2.5 | 13.7% | 40 |
| davidalves.Phoenix 0.54 | 3.3 | 13.0% | 46 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.8% | 22 |
| oog.melee.Corsair 1.0 | 6.3 | 9.1% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.6% | 14 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.5% | 3 |
| as.FrankTheTank 1.3 | 9.3 | 4.9% | 0 |
| evd.X1 0.01 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 74.0 | 8 / 35 | 3438 |
| 2 | 2 | 59.7 | 71.7 | 3 / 35 | 3125 |
| 3 | 3 | 60.0 | 70.5 | 4 / 35 | 3463 |
| 4 | 4 | 59.1 | 65.4 | 8 / 35 | 3448 |
| 5 | 1 | 63.6 | 78.4 | 12 / 35 | 3533 |
| 6 | 2 | 60.5 | 70.2 | 7 / 35 | 3455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 18 | 39% |
| pedersen.Ugluk 1.1.1 | 17 | 59% |
| davidalves.Phoenix 0.54 | 16 | 44% |
| rz.GlowBlowMelee 1.4 | 15 | 73% |
| stelo.SoJNanoMelee 1.1 | 12 | 42% |
| oog.melee.Corsair 1.0 | 2 | 50% |
| lunchie.Lunchbox 0.93 | 2 | 50% |

Hadur died in 169 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 44 | 26% | 55 |
| rz.GlowBlowMelee 1.4 | 35 | 21% | 49 |
| davidalves.Phoenix 0.54 | 25 | 15% | 28 |
| pedersen.Ugluk 1.1.1 | 24 | 14% | 32 |
| stelo.SoJNanoMelee 1.1 | 14 | 8% | 17 |
| oog.melee.Corsair 1.0 | 11 | 7% | 14 |
| evd.X1 0.01 | 9 | 5% | 9 |
| lunchie.Lunchbox 0.93 | 6 | 4% | 6 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 82.2 | 115 / 210 | 2.60 | 17.6% | 24683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 17.6% | 115 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 14.0% | 31 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.9% | 17 |
| jdw.Hurricane 1.4 | 3.8 | 11.8% | 29 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 9.2% | 7 |
| gjr.Cephalosporin 0.1 | 6.7 | 7.9% | 3 |
| ds.Oo 2.2 | 7.2 | 8.0% | 6 |
| awesomeness.Elite 1.0 | 7.5 | 7.5% | 1 |
| adt.Ar2 1.1 | 8.7 | 6.6% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 80.0 | 21 / 35 | 3902 |
| 2 | 1 | 64.5 | 74.3 | 17 / 35 | 3996 |
| 3 | 1 | 68.7 | 87.6 | 23 / 35 | 4346 |
| 4 | 1 | 68.6 | 88.9 | 21 / 35 | 4277 |
| 5 | 1 | 66.6 | 83.5 | 17 / 35 | 4250 |
| 6 | 1 | 65.3 | 79.0 | 16 / 35 | 3912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 83% |
| voidious.mini.BrokenSword 2.0.3 | 40 | 75% |
| jdw.Hurricane 1.4 | 26 | 92% |
| gjr.Cephalosporin 0.1 | 10 | 90% |
| gre.svman4.Morfeas 1.4.1 | 7 | 57% |
| ds.Oo 2.2 | 3 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |
| amk.ChumbaMini 0.2 | 3 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 26 | 27% | 59 |
| jdw.Hurricane 1.4 | 21 | 22% | 47 |
| voidious.micro.BlitzBat 1.05 | 17 | 18% | 52 |
| adt.Ar2 1.1 | 8 | 8% | 10 |
| ds.Oo 2.2 | 7 | 7% | 10 |
| gre.svman4.Morfeas 1.4.1 | 7 | 7% | 10 |
| awesomeness.Elite 1.0 | 4 | 4% | 7 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 11 |
| amk.ChumbaMini 0.2 | 2 | 2% | 4 |

## Melee bench: F26

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.1 | 85 / 210 | 2.16 | 18.0% | 31826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.2 | 18.0% | 85 |
| ak.Fermat 2.0 | 1.8 | 16.3% | 68 |
| lrem.Spectre 0.4.4 | 3.2 | 12.3% | 23 |
| shu.nitro.LENIN .T34 | 4.2 | 11.2% | 24 |
| js.PinBall 1.6 | 5.0 | 10.5% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.4% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 8.8% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 5.1% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 83.5 | 11 / 35 | 5016 |
| 2 | 1 | 69.9 | 91.7 | 17 / 35 | 5720 |
| 3 | 1 | 66.1 | 83.2 | 11 / 35 | 5051 |
| 4 | 1 | 67.8 | 88.6 | 14 / 35 | 5078 |
| 5 | 1 | 69.1 | 89.5 | 19 / 35 | 5330 |
| 6 | 1 | 68.9 | 86.3 | 13 / 35 | 5631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 62 | 39% |
| shu.nitro.LENIN .T34 | 32 | 69% |
| lrem.Spectre 0.4.4 | 31 | 71% |
| js.PinBall 1.6 | 7 | 86% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 80% |
| sample.SpinBot 1.0 | 3 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 63 | 50% | 93 |
| shu.nitro.LENIN .T34 | 25 | 20% | 48 |
| lrem.Spectre 0.4.4 | 24 | 19% | 44 |
| js.PinBall 1.6 | 5 | 4% | 8 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 4% | 7 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 6 |
| sample.SpinBot 1.0 | 1 | 1% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 81.3 | 108 / 210 | 2.68 | 17.1% | 25279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 17.1% | 108 |
| mk.Alpha 0.2.1 | 2.0 | 14.5% | 55 |
| wee.Gem 1.8.4 | 3.8 | 11.6% | 20 |
| EH.Eagle 1.0.6 | 4.3 | 10.5% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.7% | 16 |
| joe.ADinosaur 1.0 | 5.3 | 9.3% | 1 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.3% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 7.5 | 7.8% | 0 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.7% | 4 |
| cs.Grudge 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 87.6 | 22 / 35 | 4028 |
| 2 | 1 | 65.4 | 82.2 | 17 / 35 | 3868 |
| 3 | 1 | 66.1 | 84.1 | 19 / 35 | 3984 |
| 4 | 1 | 66.4 | 85.4 | 19 / 35 | 4042 |
| 5 | 1 | 65.7 | 82.2 | 19 / 35 | 4091 |
| 6 | 1 | 64.4 | 66.3 | 12 / 35 | 5266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 63 | 73% |
| wee.Gem 1.8.4 | 32 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 71% |
| EH.Eagle 1.0.6 | 11 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 33% |
| caimano.Furia_Ceca 0.22 | 3 | 33% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 37 | 36% | 76 |
| throxbot.ThroxBot 0.1 | 13 | 13% | 16 |
| caimano.Furia_Ceca 0.22 | 13 | 13% | 15 |
| wee.Gem 1.8.4 | 11 | 11% | 40 |
| joe.ADinosaur 1.0 | 11 | 11% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 10% | 20 |
| EH.Eagle 1.0.6 | 5 | 5% | 20 |
| cs.Grudge 1.0 | 2 | 2% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 88.5 | 113 / 210 | 2.04 | 18.1% | 24787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 18.1% | 113 |
| kid.test.NightFox .2 | 2.0 | 15.7% | 57 |
| uji.Antique 1.0 | 3.2 | 11.8% | 20 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.8% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.9% | 2 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 1 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.6% | 4 |
| matt.advanced.Katana 1.0 | 8.5 | 6.4% | 1 |
| stelo.PianistNano 1.2 | 9.0 | 6.1% | 1 |
| stelo.Lifestealer 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 91.7 | 21 / 35 | 4377 |
| 2 | 1 | 67.5 | 88.6 | 18 / 35 | 4121 |
| 3 | 1 | 66.3 | 86.7 | 17 / 35 | 3850 |
| 4 | 1 | 67.4 | 87.9 | 18 / 35 | 4324 |
| 5 | 1 | 67.4 | 88.3 | 20 / 35 | 3967 |
| 6 | 1 | 67.3 | 87.6 | 19 / 35 | 4148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 74 | 59% |
| uji.Antique 1.0 | 38 | 89% |
| qohnil.blot.BlotBot 3.61 | 16 | 69% |
| amk.ChumbaWumba 0.3 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 43 | 43% | 87 |
| amk.ChumbaWumba 0.3 | 19 | 19% | 24 |
| uji.Antique 1.0 | 14 | 14% | 43 |
| ahr.ice.Ice 1.0.2 | 9 | 9% | 14 |
| qohnil.blot.BlotBot 3.61 | 8 | 8% | 21 |
| pfvicm.Sobieski 7.2.3b | 5 | 5% | 10 |
| stelo.PianistNano 1.2 | 1 | 1% | 5 |
| matt.advanced.Katana 1.0 | 1 | 1% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 77.4 | 70 / 210 | 3.04 | 16.4% | 25901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.7 | 16.4% | 70 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.5% | 61 |
| deewiant.Anomaly 0.2 | 2.5 | 14.6% | 55 |
| myl.micro.Troodon 1.10 | 4.2 | 11.9% | 7 |
| jok.PheonixM 0.1.2 | 5.0 | 10.3% | 9 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.3% | 2 |
| DBall.Anarchy 0.1 | 6.7 | 7.6% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.2 | 5.2% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 78.7 | 15 / 35 | 4027 |
| 2 | 2 | 64.0 | 73.7 | 11 / 35 | 4121 |
| 3 | 2 | 65.1 | 76.2 | 9 / 35 | 4492 |
| 4 | 2 | 64.4 | 74.9 | 9 / 35 | 4399 |
| 5 | 1 | 67.7 | 83.2 | 16 / 35 | 4674 |
| 6 | 2 | 64.6 | 77.5 | 10 / 35 | 4188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 41 | 54% |
| deewiant.Anomaly 0.2 | 34 | 53% |
| myl.micro.Troodon 1.10 | 14 | 93% |
| jok.PheonixM 0.1.2 | 11 | 82% |
| DBall.Anarchy 0.1 | 8 | 88% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 47 | 34% | 65 |
| zyx.mega.YersiniaPestis 3.1 | 42 | 30% | 62 |
| jok.PheonixM 0.1.2 | 18 | 13% | 25 |
| myl.micro.Troodon 1.10 | 14 | 10% | 30 |
| ph.melee.ArcherME 0.3 | 9 | 6% | 9 |
| fullsail.TimbotNoPrediction 1.0 | 6 | 4% | 6 |
| DBall.Anarchy 0.1 | 2 | 1% | 11 |
| jangs.ns51 1.0 | 2 | 1% | 2 |

## Melee bench: F30

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 70.7 | 38 / 210 | 3.64 | 14.3% | 23959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.8 | 14.3% | 38 |
| catcat20.Matcha 0.006 | 2.0 | 14.0% | 57 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.0% | 37 |
| darkcanuck.B26354 1.06 | 3.8 | 12.8% | 38 |
| oog.melee.Capulet 1.2 | 4.0 | 12.6% | 29 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.7% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.7% | 5 |
| ntc.Opposite 1.5 | 7.3 | 7.7% | 0 |
| tripphippy.Alice 1.1 | 8.8 | 6.8% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 69.2 | 5 / 35 | 3882 |
| 2 | 1 | 63.1 | 74.6 | 10 / 35 | 4162 |
| 3 | 2 | 60.5 | 69.5 | 2 / 35 | 3896 |
| 4 | 3 | 60.6 | 67.0 | 8 / 35 | 3884 |
| 5 | 1 | 62.4 | 72.7 | 6 / 35 | 4229 |
| 6 | 2 | 62.1 | 71.1 | 7 / 35 | 3906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 20 | 65% |
| catcat20.Matcha 0.006 | 18 | 33% |
| stelo.PastFuture 2.3.2 | 15 | 47% |
| darkcanuck.B26354 1.06 | 14 | 43% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 50% |
| intruder.PrairieWolf 2.61 | 3 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 42 | 24% | 50 |
| darkcanuck.B26354 1.06 | 38 | 22% | 45 |
| stelo.PastFuture 2.3.2 | 37 | 21% | 44 |
| oog.melee.Capulet 1.2 | 22 | 13% | 31 |
| tripphippy.Alice 1.1 | 12 | 7% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 6% | 10 |
| intruder.PrairieWolf 2.61 | 6 | 3% | 11 |
| ntc.Opposite 1.5 | 6 | 3% | 6 |

## Melee bench: F31

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 74.2 | 28 / 210 | 3.32 | 14.4% | 20954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 114 |
| hadur117.mini.DeiseCM 0.2 | 2.0 | 14.4% | 28 |
| gh.mini.Griezel 0.2 | 3.0 | 13.3% | 45 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.4% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.0% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 5 |
| fm.mammillarias 1.3 | 7.3 | 6.7% | 0 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.9% | 1 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 78.4 | 7 / 35 | 3651 |
| 2 | 2 | 63.1 | 75.6 | 7 / 35 | 3605 |
| 3 | 2 | 60.5 | 70.8 | 3 / 35 | 3304 |
| 4 | 2 | 62.2 | 76.2 | 3 / 35 | 3688 |
| 5 | 2 | 60.6 | 71.4 | 4 / 35 | 3122 |
| 6 | 2 | 61.6 | 72.7 | 4 / 35 | 3584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 49 | 16% |
| gh.mini.Griezel 0.2 | 17 | 29% |
| spinnercat.micro.Tyger 0.1 | 9 | 78% |
| d414.nano.Quantum 1.0.0 | 7 | 57% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 90 | 49% | 99 |
| gh.mini.Griezel 0.2 | 26 | 14% | 30 |
| d414.nano.Quantum 1.0.0 | 24 | 13% | 28 |
| spinnercat.micro.Tyger 0.1 | 22 | 12% | 29 |
| fm.mammillarias 1.3 | 9 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 6 | 3% | 7 |
| gh.nano.Grofvuil 0.2 | 2 | 1% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.9 | 110 / 210 | 2.27 | 18.1% | 29042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 18.1% | 110 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 59 |
| apc.botM 3.0 | 3.0 | 11.9% | 17 |
| lxx.ConceptA 0.8 | 4.5 | 10.7% | 5 |
| vjik.UnViolation 1.1 | 5.0 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 6.2 | 8.5% | 6 |
| panzer.Panzer 0.2 | 7.0 | 7.6% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.8% | 2 |
| conscience.Electron 1.3g | 8.3 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 83.5 | 14 / 35 | 4777 |
| 2 | 1 | 66.5 | 83.8 | 14 / 35 | 4990 |
| 3 | 1 | 68.3 | 87.9 | 21 / 35 | 4900 |
| 4 | 1 | 68.4 | 88.6 | 21 / 35 | 4835 |
| 5 | 1 | 67.1 | 86.0 | 17 / 35 | 4841 |
| 6 | 1 | 67.6 | 85.7 | 23 / 35 | 4699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 70 | 53% |
| apc.botM 3.0 | 27 | 70% |
| lxx.ConceptA 0.8 | 19 | 84% |
| vjik.UnViolation 1.1 | 10 | 100% |
| yk.JahMicro 1.0 | 9 | 89% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| panzer.Panzer 0.2 | 6 | 100% |
| donjezza.Jezza 1.0 | 6 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 46 | 45% | 87 |
| lxx.ConceptA 0.8 | 18 | 17% | 26 |
| apc.botM 3.0 | 15 | 15% | 36 |
| bayen.UbaMicro 1.4 | 9 | 9% | 14 |
| vjik.UnViolation 1.1 | 6 | 6% | 21 |
| panzer.Panzer 0.2 | 4 | 4% | 5 |
| conscience.Electron 1.3g | 3 | 3% | 6 |
| yk.JahMicro 1.0 | 2 | 2% | 8 |
| donjezza.Jezza 1.0 | 0 | 0% | 6 |

## Melee bench: F33

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.9 | 118 / 210 | 2.18 | 18.9% | 30115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 18.9% | 118 |
| maribo.Quester 0.3 | 2.0 | 16.1% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.0% | 19 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.9% | 17 |
| labg.Cataclysm 2.05 | 4.3 | 10.5% | 12 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.6% | 7 |
| baal.nano.N 1.42 | 6.5 | 8.3% | 0 |
| zyx.micro.Ant 1.1 | 8.2 | 5.9% | 0 |
| sanja.First 0.1 | 9.0 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.1 | 21 / 35 | 5101 |
| 2 | 1 | 69.7 | 88.3 | 19 / 35 | 5327 |
| 3 | 1 | 69.9 | 90.2 | 20 / 35 | 4893 |
| 4 | 1 | 69.3 | 88.6 | 19 / 35 | 5035 |
| 5 | 1 | 66.9 | 80.6 | 17 / 35 | 4714 |
| 6 | 1 | 69.2 | 88.9 | 22 / 35 | 5045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 61 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 76% |
| gre.svman4.Leonidas 1.3.2 | 29 | 86% |
| labg.Cataclysm 2.05 | 9 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 89% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 32 | 34% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 23% | 48 |
| gre.svman4.Leonidas 1.3.2 | 13 | 14% | 29 |
| labg.Cataclysm 2.05 | 10 | 11% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 10% | 13 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 4% | 4 |
| zyx.micro.Ant 1.1 | 2 | 2% | 4 |
| sanja.First 0.1 | 1 | 1% | 4 |
| baal.nano.N 1.42 | 1 | 1% | 4 |

## Melee bench: F34

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 82.4 | 54 / 210 | 2.58 | 16.8% | 28536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.7 | 16.8% | 54 |
| stelo.Spread 0.9 | 2.0 | 16.4% | 78 |
| kid.Gladiator .7.2 | 2.3 | 16.2% | 54 |
| jcs.Seth 1.8 | 4.5 | 11.0% | 9 |
| tcf.Reach 3 | 4.7 | 11.0% | 14 |
| cli.Dancer 1.1 | 5.8 | 9.9% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 78.1 | 7 / 35 | 4691 |
| 2 | 1 | 66.1 | 83.2 | 8 / 35 | 4470 |
| 3 | 1 | 67.0 | 85.1 | 11 / 35 | 4832 |
| 4 | 2 | 66.7 | 82.5 | 12 / 35 | 4546 |
| 5 | 3 | 65.7 | 79.7 | 6 / 35 | 4722 |
| 6 | 1 | 68.6 | 86.0 | 10 / 35 | 5275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 55 | 40% |
| kid.Gladiator .7.2 | 44 | 30% |
| jcs.Seth 1.8 | 10 | 100% |
| tcf.Reach 3 | 8 | 38% |
| cli.Dancer 1.1 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 64 | 41% | 74 |
| stelo.Spread 0.9 | 60 | 38% | 85 |
| tcf.Reach 3 | 14 | 9% | 17 |
| ratosh.Wesco 1.4 | 7 | 4% | 11 |
| cli.Dancer 1.1 | 7 | 4% | 10 |
| jcs.Seth 1.8 | 3 | 2% | 11 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F35

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 73.5 | 21 / 210 | 3.38 | 13.8% | 19400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 149 |
| hadur117.mini.DeiseCM 0.2 | 2.2 | 13.8% | 21 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.1% | 22 |
| rz.HawkOnFire 0.1 | 4.3 | 12.0% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 13 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 6.9% | 0 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 71.4 | 1 / 35 | 2948 |
| 2 | 2 | 62.6 | 74.9 | 5 / 35 | 3649 |
| 3 | 2 | 62.2 | 77.1 | 4 / 35 | 3082 |
| 4 | 3 | 60.5 | 71.7 | 5 / 35 | 3079 |
| 5 | 2 | 62.0 | 74.6 | 4 / 35 | 3445 |
| 6 | 2 | 60.6 | 71.4 | 2 / 35 | 3197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 40 | 23% |
| gh.mini.Gruwel 0.9 | 12 | 42% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 57% |
| rz.HawkOnFire 0.1 | 4 | 50% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 94 | 50% | 101 |
| rz.HawkOnFire 0.1 | 38 | 20% | 41 |
| gh.mini.Gruwel 0.9 | 23 | 12% | 29 |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 11% | 25 |
| dans.Cinnamon 1.2 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 95.0 | 168 / 210 | 1.45 | 21.0% | 31510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 21.0% | 168 |
| bzdp.Pansy 2.1 | 2.0 | 12.5% | 11 |
| alpha.RainingFire 1.0 | 3.3 | 11.1% | 12 |
| mz.Cork 0.1 | 4.8 | 10.6% | 4 |
| bvh.micro.Freya 0.3 | 5.0 | 10.3% | 6 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.4% | 4 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.7% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 5.8% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 4.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 95.2 | 29 / 35 | 5307 |
| 2 | 1 | 71.4 | 96.2 | 30 / 35 | 4913 |
| 3 | 1 | 71.5 | 96.2 | 28 / 35 | 5237 |
| 4 | 1 | 70.4 | 92.1 | 28 / 35 | 4878 |
| 5 | 1 | 71.1 | 94.0 | 25 / 35 | 5616 |
| 6 | 1 | 71.6 | 96.2 | 28 / 35 | 5559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 96% |
| mz.Cork 0.1 | 31 | 94% |
| bvh.micro.Freya 0.3 | 31 | 94% |
| bvh.mini.Fenrir 0.39 | 25 | 88% |
| alpha.RainingFire 1.0 | 17 | 71% |
| m3thos.Eva02 0.7.1 | 16 | 88% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 28% | 32 |
| mz.Cork 0.1 | 8 | 19% | 32 |
| bvh.micro.Freya 0.3 | 8 | 19% | 26 |
| bvh.mini.Fenrir 0.39 | 7 | 16% | 24 |
| bzdp.Pansy 2.1 | 6 | 14% | 66 |
| m3thos.Eva02 0.7.1 | 2 | 5% | 16 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 9 |
| dl.BetterWalls 1.0 | 0 | 0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 82.6 | 116 / 210 | 2.57 | 17.6% | 31266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 17.6% | 116 |
| germ.TheMind .2 | 2.5 | 12.2% | 27 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.8% | 8 |
| EBBU.Sim2 1.02 | 3.7 | 10.2% | 7 |
| agrach.Dalek 1.0 | 5.8 | 9.0% | 14 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.4% | 9 |
| mb.Beast 0.1 | 7.5 | 8.2% | 15 |
| skm.Ryubot 1.0 | 7.7 | 8.2% | 6 |
| lmk.ACPFinal 0.1 | 7.8 | 7.8% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.2 | 22 / 35 | 5202 |
| 2 | 1 | 68.9 | 90.8 | 24 / 35 | 5631 |
| 3 | 1 | 67.2 | 85.7 | 21 / 35 | 5546 |
| 4 | 1 | 64.9 | 77.8 | 15 / 35 | 5614 |
| 5 | 1 | 65.0 | 81.3 | 18 / 35 | 4835 |
| 6 | 1 | 63.2 | 76.8 | 16 / 35 | 4438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 43 | 77% |
| skm.Ryubot 1.0 | 22 | 91% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 94% |
| stelo.UntouchableNano 1.3 | 18 | 78% |
| EBBU.Sim2 1.02 | 18 | 94% |
| agrach.Dalek 1.0 | 8 | 88% |
| lmk.ACPFinal 0.1 | 7 | 71% |
| mb.Beast 0.1 | 4 | 75% |

Hadur died in 94 of 210 rounds, at a mean tick of 459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 22 | 23% | 51 |
| EBBU.Sim2 1.02 | 16 | 17% | 38 |
| agrach.Dalek 1.0 | 16 | 17% | 33 |
| stelo.UntouchableNano 1.3 | 11 | 12% | 20 |
| mb.Beast 0.1 | 8 | 9% | 16 |
| lmk.ACPFinal 0.1 | 7 | 7% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 6% | 8 |
| skm.Ryubot 1.0 | 5 | 5% | 14 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 3% | 18 |

## Melee bench: F38

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 72.9 | 43 / 210 | 3.44 | 14.6% | 23657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.4% | 88 |
| hadur117.mini.DeiseCM 0.2 | 2.0 | 14.6% | 43 |
| bvh.mini.Freya 0.55 | 3.0 | 13.1% | 25 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.4% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.7% | 11 |
| cs.Wren 1.0 | 5.5 | 10.4% | 10 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.8% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.6% | 5 |
| bzdp.BoxCar 2.0 | 9.5 | 4.2% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 67.0 | 7 / 35 | 3690 |
| 2 | 2 | 63.0 | 73.3 | 6 / 35 | 4225 |
| 3 | 2 | 63.4 | 76.5 | 8 / 35 | 4011 |
| 4 | 2 | 63.9 | 77.5 | 10 / 35 | 4064 |
| 5 | 2 | 62.2 | 74.6 | 7 / 35 | 3674 |
| 6 | 2 | 60.9 | 68.3 | 5 / 35 | 3993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 23 | 35% |
| bts.mega.Gnarly 1.4 | 14 | 50% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 85% |
| bvh.mini.Freya 0.55 | 11 | 64% |
| cs.Wren 1.0 | 6 | 83% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |

Hadur died in 167 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 57 | 34% | 70 |
| bvh.mini.Freya 0.55 | 35 | 21% | 37 |
| bts.mega.Gnarly 1.4 | 30 | 18% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 12% | 32 |
| cs.Wren 1.0 | 10 | 6% | 14 |
| kdf.KoulDestroyer 1.0 | 10 | 6% | 13 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 4 |

## Melee bench: F39

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 82.3 | 78 / 210 | 2.60 | 17.0% | 28054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 17.0% | 78 |
| bvh.fry.Freya 0.82 | 2.0 | 14.8% | 38 |
| az.Ololobot 0.2.4 | 3.0 | 12.6% | 49 |
| catcat20.Lambda 0.024 | 4.0 | 11.2% | 25 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.2% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 8.5% | 13 |
| gimp.GimpBot 0.1 | 6.7 | 8.1% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.0% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.9% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 79.0 | 8 / 35 | 4407 |
| 2 | 1 | 65.5 | 80.0 | 12 / 35 | 4889 |
| 3 | 1 | 66.3 | 85.4 | 13 / 35 | 4597 |
| 4 | 1 | 66.9 | 85.7 | 18 / 35 | 4782 |
| 5 | 1 | 65.4 | 81.6 | 12 / 35 | 4916 |
| 6 | 1 | 65.5 | 81.9 | 15 / 35 | 4463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 36 | 64% |
| az.Ololobot 0.2.4 | 35 | 43% |
| catcat20.Lambda 0.024 | 26 | 69% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 71% |
| gimp.GimpBot 0.1 | 4 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 44 | 33% | 62 |
| az.Ololobot 0.2.4 | 29 | 22% | 49 |
| catcat20.Lambda 0.024 | 24 | 18% | 41 |
| stelo.SoRobotNanoMelee 1.2 | 21 | 16% | 30 |
| apollokidd.ApolloKidd 0.9 | 6 | 5% | 8 |
| gimp.GimpBot 0.1 | 4 | 3% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 4 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 4 |

## Melee bench: F40

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.9 | 86 / 210 | 2.63 | 17.4% | 27550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 17.4% | 86 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 54 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.0% | 29 |
| mz.AntiGrav 1.0 | 5.0 | 10.5% | 8 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.2% | 6 |
| stelo.Randomness 1.0 | 5.5 | 9.6% | 19 |
| alpha.BlackIce 1.0 | 6.3 | 9.1% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 5.0% | 2 |
| sample.Corners 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.5 | 15 / 35 | 4662 |
| 2 | 1 | 66.2 | 78.1 | 13 / 35 | 4741 |
| 3 | 1 | 66.9 | 85.7 | 16 / 35 | 4368 |
| 4 | 1 | 67.0 | 82.2 | 15 / 35 | 4812 |
| 5 | 1 | 67.0 | 84.1 | 14 / 35 | 4594 |
| 6 | 1 | 65.3 | 78.4 | 13 / 35 | 4373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 46 | 57% |
| kano.gamma.KanoGamma 1.8 | 34 | 68% |
| mz.AntiGrav 1.0 | 20 | 90% |
| Polkwane.SmashMelee 1.0 | 10 | 80% |
| stelo.Randomness 1.0 | 8 | 63% |
| alpha.BlackIce 1.0 | 4 | 75% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 44 | 35% | 64 |
| kano.gamma.KanoGamma 1.8 | 22 | 18% | 51 |
| stelo.Randomness 1.0 | 17 | 14% | 24 |
| mz.AntiGrav 1.0 | 13 | 10% | 28 |
| Polkwane.SmashMelee 1.0 | 11 | 9% | 16 |
| alpha.BlackIce 1.0 | 10 | 8% | 14 |
| amk.superstrike.SuperStrike 0.3 | 7 | 6% | 8 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.6 | 90 / 210 | 2.56 | 16.6% | 22933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.3 | 16.6% | 90 |
| eem.EvBotNG v12.8 | 1.8 | 15.8% | 68 |
| ary.Swarm 1.1 | 3.3 | 13.4% | 14 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.9% | 22 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.9% | 12 |
| shrub.Silver v048 | 6.0 | 9.3% | 4 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.4% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 83.2 | 14 / 35 | 3866 |
| 2 | 1 | 66.6 | 84.8 | 17 / 35 | 3965 |
| 3 | 2 | 63.8 | 77.8 | 11 / 35 | 3521 |
| 4 | 1 | 66.3 | 82.5 | 16 / 35 | 3917 |
| 5 | 1 | 67.0 | 84.8 | 16 / 35 | 4103 |
| 6 | 1 | 65.6 | 82.9 | 16 / 35 | 3561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 52 | 56% |
| lessonz.robocode.Oz 0.5.0 | 33 | 73% |
| ary.Swarm 1.1 | 20 | 80% |
| simonton.nano.MeleeSeed 1.8 | 17 | 88% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 47 | 39% | 75 |
| simonton.nano.MeleeSeed 1.8 | 21 | 17% | 38 |
| ary.Swarm 1.1 | 20 | 17% | 44 |
| lessonz.robocode.Oz 0.5.0 | 18 | 15% | 31 |
| shrub.Silver v048 | 7 | 6% | 9 |
| zyx.nano.Ant 1.1 | 3 | 2% | 5 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |
| stelo.Mirror 1.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.2 | 102 / 210 | 2.33 | 18.0% | 30036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 18.0% | 102 |
| wompi.Wallaby 5.1 | 2.3 | 15.1% | 50 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.9% | 29 |
| ara.Shera 0.88 | 3.7 | 12.7% | 27 |
| amz.NanoClone 1.41 | 5.2 | 9.5% | 2 |
| maribo.IotaCT 1.1 | 6.3 | 7.7% | 0 |
| dsw.StaticD 1.0 | 6.8 | 7.2% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 81.6 | 12 / 35 | 4709 |
| 2 | 1 | 69.5 | 90.8 | 19 / 35 | 5486 |
| 3 | 1 | 66.6 | 79.7 | 20 / 35 | 4818 |
| 4 | 1 | 65.9 | 81.3 | 11 / 35 | 4739 |
| 5 | 1 | 69.7 | 91.4 | 25 / 35 | 4946 |
| 6 | 1 | 68.1 | 86.7 | 15 / 35 | 5338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 61 | 66% |
| ara.Shera 0.88 | 38 | 66% |
| maribo.mini.MiniQuester 0.1 | 38 | 82% |
| amz.NanoClone 1.41 | 4 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 34% | 76 |
| ara.Shera 0.88 | 28 | 26% | 52 |
| maribo.mini.MiniQuester 0.1 | 24 | 22% | 55 |
| amz.NanoClone 1.41 | 10 | 9% | 14 |
| mme.NikeEnhanced 2.0 | 3 | 3% | 3 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 3 |
| dsw.StaticD 1.0 | 2 | 2% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |

## Melee bench: F43

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 70.1 | 21 / 210 | 3.69 | 13.6% | 21363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 158 |
| hadur117.mini.DeiseCM 0.2 | 2.2 | 13.6% | 21 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.4% | 17 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.6% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.3% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.2% | 4 |
| mz.NanoGod 2.02 | 7.2 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 70.8 | 4 / 35 | 3564 |
| 2 | 2 | 61.9 | 69.2 | 4 / 35 | 3639 |
| 3 | 2 | 62.1 | 68.6 | 3 / 35 | 3876 |
| 4 | 2 | 62.7 | 73.7 | 4 / 35 | 3638 |
| 5 | 3 | 61.0 | 67.9 | 4 / 35 | 3341 |
| 6 | 2 | 62.1 | 70.5 | 2 / 35 | 3305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 37 | 5% |
| brainfade.melee.Dusk 0.44 | 11 | 82% |
| dummy.micro.Sparrow 2.5 | 6 | 83% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 60% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 108 | 57% | 110 |
| wcsv.melee.EngineerMelee 0.1 | 29 | 15% | 32 |
| dummy.micro.Sparrow 2.5 | 24 | 13% | 28 |
| brainfade.melee.Dusk 0.44 | 12 | 6% | 21 |
| Krabb.akim2.Akim2 1.1b | 8 | 4% | 9 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 2 | 1% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.3 | 107 / 210 | 2.05 | 18.8% | 29709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 18.8% | 107 |
| stelo.Liblix 0.3.1 | 2.0 | 15.8% | 69 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.9% | 29 |
| wompi.Quokka 1.6 | 4.0 | 10.5% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.1% | 0 |
| jwirde.Gort 2.0 | 5.7 | 8.5% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.4% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.5% | 1 |
| sample.Crazy 1.0 | 9.3 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.4 | 16 / 35 | 4783 |
| 2 | 1 | 69.5 | 88.9 | 21 / 35 | 5230 |
| 3 | 1 | 69.2 | 90.2 | 16 / 35 | 5119 |
| 4 | 1 | 69.0 | 90.2 | 16 / 35 | 4980 |
| 5 | 1 | 69.4 | 90.2 | 19 / 35 | 5038 |
| 6 | 1 | 67.8 | 85.1 | 19 / 35 | 4559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 80 | 48% |
| tzu.TheArtOfWar 1.2 | 55 | 65% |
| wompi.Quokka 1.6 | 17 | 94% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| jwirde.Gort 2.0 | 6 | 83% |
| disan.Chair 2.2.0 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 59 | 57% | 108 |
| tzu.TheArtOfWar 1.2 | 28 | 27% | 63 |
| wompi.Quokka 1.6 | 8 | 8% | 13 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 8 |
| jwirde.Gort 2.0 | 2 | 2% | 5 |
| disan.Chair 2.2.0 | 1 | 1% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 0 | 0% | 5 |

## Melee bench: F45

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.9 | 104 / 210 | 2.00 | 20.3% | 36563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCM 0.2 | 1.0 | 20.3% | 104 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 13.1% | 88 |
| jje.BagPuss 1.2 | 2.7 | 11.4% | 4 |
| sul.Lunar 1.1 | 4.7 | 10.1% | 6 |
| myl.nano.Graviton 1.10 | 4.8 | 9.9% | 2 |
| hvilela.HVilela 0.9 | 6.3 | 8.5% | 0 |
| fm.claire 1.7 | 6.8 | 7.8% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.6% | 3 |
| wit.Deep7 2.0 | 9.0 | 6.4% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.0 | 17 / 35 | 6123 |
| 2 | 1 | 69.4 | 88.3 | 13 / 35 | 6012 |
| 3 | 1 | 69.1 | 83.8 | 14 / 35 | 5882 |
| 4 | 1 | 69.7 | 88.6 | 20 / 35 | 5782 |
| 5 | 1 | 71.4 | 92.7 | 20 / 35 | 6419 |
| 6 | 1 | 71.5 | 93.3 | 20 / 35 | 6345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 113 | 51% |
| sul.Lunar 1.1 | 16 | 100% |
| jje.BagPuss 1.2 | 11 | 73% |
| myl.nano.Graviton 1.10 | 11 | 91% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 80% |
| wit.Deep7 2.0 | 5 | 80% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 56 | 53% | 0 |
| myl.nano.Graviton 1.10 | 16 | 15% | 41 |
| jje.BagPuss 1.2 | 11 | 10% | 44 |
| sul.Lunar 1.1 | 8 | 8% | 69 |
| fm.claire 1.7 | 7 | 7% | 17 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 5% | 17 |
| wit.Deep7 2.0 | 1 | 1% | 9 |
| hvilela.HVilela 0.9 | 1 | 1% | 9 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |

## Melee bench: F46

hadur117.mini.DeiseCM 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 76.4 | 32 / 210 | 3.12 | 14.9% | 24818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 16.9% | 71 |
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.1% | 81 |
| hadur117.mini.DeiseCM 0.2 | 3.0 | 14.9% | 32 |
| mz.MicroSheep 1.0 | 4.2 | 10.7% | 6 |
| cx.Princess 1.0 | 5.0 | 10.2% | 19 |
| sadoner.killer 0.2 | 5.8 | 8.9% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.0% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.2 | 78.7 | 4 / 35 | 4435 |
| 2 | 3 | 64.3 | 78.4 | 5 / 35 | 4392 |
| 3 | 3 | 63.1 | 75.9 | 7 / 35 | 3921 |
| 4 | 3 | 61.3 | 72.4 | 3 / 35 | 3931 |
| 5 | 3 | 63.0 | 76.2 | 5 / 35 | 4052 |
| 6 | 3 | 63.8 | 76.8 | 8 / 35 | 4087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 33 | 39% |
| rsalesc.melee.Medina 0.4.5 | 20 | 35% |
| cx.Princess 1.0 | 9 | 33% |
| mz.MicroSheep 1.0 | 8 | 50% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| sadoner.killer 0.2 | 2 | 50% |

Hadur died in 178 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 74 | 42% | 87 |
| rsalesc.melee.Medina 0.4.5 | 50 | 28% | 58 |
| cx.Princess 1.0 | 20 | 11% | 23 |
| mz.MicroSheep 1.0 | 19 | 11% | 24 |
| sadoner.killer 0.2 | 8 | 4% | 9 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 6 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

