# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.2 | 47 / 210 | 2.42 | 16.9% | 30434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 144 |
| hadur117.mini.DeiseH650 0.4 | 2.0 | 16.9% | 47 |
| sgp.JollyNinja 3.53 | 3.5 | 11.3% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.0% | 2 |
| mz.MicroGodMelee 1 | 4.3 | 11.0% | 4 |
| lorneswork.Predator 1.0 | 5.8 | 9.3% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.1% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 80.6 | 10 / 35 | 5317 |
| 2 | 2 | 66.1 | 83.2 | 7 / 35 | 4734 |
| 3 | 2 | 66.5 | 84.1 | 7 / 35 | 4903 |
| 4 | 2 | 67.8 | 87.0 | 9 / 35 | 5334 |
| 5 | 2 | 65.0 | 82.2 | 6 / 35 | 4668 |
| 6 | 2 | 67.9 | 87.9 | 8 / 35 | 5478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 12% |
| sgp.JollyNinja 3.53 | 14 | 86% |
| mz.MicroGodMelee 1 | 9 | 67% |
| lorneswork.Predator 1.0 | 7 | 100% |
| adt.Ar2 1.0 | 4 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 73% | 139 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 9% | 20 |
| mz.MicroGodMelee 1 | 12 | 7% | 18 |
| sgp.JollyNinja 3.53 | 11 | 7% | 17 |
| adt.Ar2 1.0 | 2 | 1% | 6 |
| lorneswork.Predator 1.0 | 2 | 1% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.7 | 88 / 210 | 2.47 | 18.5% | 34164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 18.5% | 88 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.4% | 53 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.4% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 11.3% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.5% | 11 |
| Noran.BitchingElk 0.054 | 6.8 | 7.7% | 13 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.6% | 0 |
| sch.Simone 0.3d | 7.3 | 7.4% | 9 |
| stelo.PatternRobot 1.0 | 9.0 | 5.8% | 2 |
| fullsail.SweetTea 1.1 | 9.8 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.2 | 14 / 35 | 5494 |
| 2 | 1 | 68.3 | 84.1 | 13 / 35 | 6089 |
| 3 | 1 | 67.6 | 83.2 | 14 / 35 | 5474 |
| 4 | 1 | 69.6 | 89.2 | 14 / 35 | 5919 |
| 5 | 1 | 67.0 | 79.7 | 13 / 35 | 5533 |
| 6 | 1 | 68.6 | 83.5 | 20 / 35 | 5655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 66% |
| pulsar.PulsarMax 0.8.9 | 40 | 38% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 50% |
| sch.Simone 0.3d | 9 | 78% |
| Noran.BitchingElk 0.054 | 9 | 44% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 47 | 38% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 31 | 25% | 62 |
| Noran.BitchingElk 0.054 | 11 | 9% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 6% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 6% | 14 |
| sch.Simone 0.3d | 7 | 6% | 18 |
| stelo.PatternRobot 1.0 | 5 | 4% | 6 |
| fnc.bandit.Bandit 5.2.0 | 4 | 3% | 7 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.3 | 138 / 210 | 1.79 | 20.5% | 40409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 20.5% | 138 |
| radnor.DoctorBob 1.42 | 2.3 | 13.9% | 28 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.9% | 15 |
| vuen.Cake 2.51 | 3.5 | 12.3% | 28 |
| urdos.URDOS 1.3 | 5.2 | 8.6% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.9% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.2% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.0 | 19 / 35 | 6615 |
| 2 | 1 | 70.5 | 93.0 | 26 / 35 | 6171 |
| 3 | 1 | 71.2 | 90.8 | 26 / 35 | 6762 |
| 4 | 1 | 70.9 | 90.8 | 20 / 35 | 7031 |
| 5 | 1 | 71.5 | 94.3 | 25 / 35 | 6883 |
| 6 | 1 | 71.0 | 91.7 | 22 / 35 | 6947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 54 | 70% |
| kawigi.nano.Lib 1.0 | 49 | 92% |
| radnor.DoctorBob 1.42 | 43 | 88% |
| oa.weak.FlyMk1 0.1 | 8 | 100% |
| urdos.URDOS 1.3 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 25 | 35% | 63 |
| radnor.DoctorBob 1.42 | 20 | 28% | 44 |
| kawigi.nano.Lib 1.0 | 18 | 25% | 65 |
| urdos.URDOS 1.3 | 4 | 6% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 3% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 5 |
| adt.Ar1 2.1 | 1 | 1% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.0 | 19 / 210 | 2.71 | 16.9% | 35245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 181 |
| hadur117.mini.DeiseH650 0.4 | 2.0 | 16.9% | 19 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 6 |
| TNT.TNT 0.99.1 | 4.2 | 10.3% | 0 |
| josago.Jorgito 0.16 | 4.8 | 9.4% | 1 |
| css.Delitioner 0.11 | 6.5 | 6.8% | 2 |
| tj.zombie1n 1.0.1 | 6.5 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.3 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.7 | 4.8% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 78.4 | 5 / 35 | 5942 |
| 2 | 2 | 67.2 | 81.3 | 6 / 35 | 5769 |
| 3 | 2 | 69.0 | 87.0 | 1 / 35 | 6333 |
| 4 | 2 | 66.7 | 81.0 | 1 / 35 | 5793 |
| 5 | 2 | 65.0 | 75.9 | 1 / 35 | 5266 |
| 6 | 2 | 68.0 | 82.2 | 5 / 35 | 6142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 132 | 8% |
| apc.LeeroyJenkins2 1.0 | 7 | 57% |
| TNT.TNT 0.99.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 0% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 1107. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 143 | 75% | 158 |
| apc.LeeroyJenkins2 1.0 | 21 | 11% | 21 |
| TNT.TNT 0.99.1 | 10 | 5% | 11 |
| josago.Jorgito 0.16 | 8 | 4% | 9 |
| tj.zombie1n 1.0.1 | 4 | 2% | 4 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 3 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 69.2 | 15 / 210 | 3.78 | 13.4% | 22500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.8% | 108 |
| justin.DemonicRage 3.4 | 1.7 | 17.1% | 63 |
| wompi.Numbat 2.1 | 3.3 | 12.9% | 17 |
| hadur117.mini.DeiseH650 0.4 | 3.7 | 13.4% | 15 |
| ms.Ares 0.19 | 5.2 | 9.5% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 9.0% | 4 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.3% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.2 | 66.7 | 2 / 35 | 3872 |
| 2 | 4 | 59.8 | 68.3 | 1 / 35 | 3537 |
| 3 | 3 | 62.3 | 72.1 | 3 / 35 | 4131 |
| 4 | 4 | 61.0 | 69.8 | 3 / 35 | 3819 |
| 5 | 3 | 61.1 | 69.8 | 5 / 35 | 3631 |
| 6 | 4 | 60.1 | 68.3 | 1 / 35 | 3510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 23 | 13% |
| justin.DemonicRage 3.4 | 21 | 14% |
| wompi.Numbat 2.1 | 8 | 75% |
| axeBots.HataMoto 3.09 | 4 | 50% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 195 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 59 | 30% | 63 |
| justin.DemonicRage 3.4 | 54 | 28% | 55 |
| wompi.Numbat 2.1 | 34 | 17% | 42 |
| ms.Ares 0.19 | 20 | 10% | 20 |
| axeBots.HataMoto 3.09 | 16 | 8% | 18 |
| supersample.SuperBoxBot 1.0 | 6 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 3 | 2% | 3 |

## Melee bench: F06

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.8 | 83 / 210 | 2.46 | 18.0% | 31227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 18.0% | 83 |
| jekl.StoneGhost 0.7 | 2.2 | 14.9% | 40 |
| origin.SleepSiphon 1.7b | 3.3 | 13.2% | 36 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.6% | 38 |
| mld.Wisdom 1.0 | 4.8 | 10.6% | 8 |
| gg.Wolverine 2.0 | 6.0 | 7.9% | 2 |
| DBall.NUKE 0.1 | 7.8 | 6.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.6% | 2 |
| spinnercat.Omen 1.0 | 8.2 | 6.6% | 1 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.5 | 17 / 35 | 5343 |
| 2 | 1 | 67.7 | 83.2 | 13 / 35 | 5321 |
| 3 | 1 | 66.0 | 78.7 | 13 / 35 | 4826 |
| 4 | 1 | 67.2 | 80.6 | 12 / 35 | 5425 |
| 5 | 1 | 69.5 | 88.9 | 19 / 35 | 5390 |
| 6 | 1 | 65.8 | 81.6 | 9 / 35 | 4922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 40 | 73% |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 53% |
| origin.SleepSiphon 1.7b | 27 | 56% |
| gg.Wolverine 2.0 | 11 | 91% |
| mld.Wisdom 1.0 | 9 | 56% |
| DBall.NUKE 0.1 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 37 | 29% | 54 |
| jekl.StoneGhost 0.7 | 36 | 28% | 60 |
| origin.SleepSiphon 1.7b | 29 | 23% | 48 |
| mld.Wisdom 1.0 | 15 | 12% | 24 |
| gg.Wolverine 2.0 | 5 | 4% | 9 |
| spinnercat.Omen 1.0 | 3 | 2% | 6 |
| DBall.NUKE 0.1 | 1 | 1% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 3 |
| sample.Fire 1.0 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 86.2 | 73 / 210 | 2.24 | 18.6% | 36071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.3 | 18.6% | 73 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.5% | 57 |
| rtk.Tachikoma 1.0 | 2.7 | 16.9% | 57 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.6% | 11 |
| franzor.Lizt 1.3.1 | 5.0 | 10.8% | 14 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.7% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.5 | 84.8 | 12 / 35 | 5806 |
| 2 | 1 | 70.4 | 87.3 | 12 / 35 | 6397 |
| 3 | 2 | 69.9 | 87.6 | 11 / 35 | 6002 |
| 4 | 1 | 70.4 | 87.0 | 14 / 35 | 6326 |
| 5 | 1 | 70.0 | 86.0 | 13 / 35 | 6029 |
| 6 | 1 | 68.7 | 84.4 | 11 / 35 | 5511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 76 | 57% |
| rsalesc.melee.Monk 0.3.6c | 39 | 15% |
| oog.melee.CapuletDroid 1.1 | 22 | 86% |
| franzor.Lizt 1.3.1 | 10 | 50% |

Hadur died in 137 of 210 rounds, at a mean tick of 1111. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 67 | 49% | 117 |
| rsalesc.melee.Monk 0.3.6c | 50 | 36% | 62 |
| oog.melee.CapuletDroid 1.1 | 12 | 9% | 26 |
| franzor.Lizt 1.3.1 | 5 | 4% | 0 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.9 | 98 / 210 | 2.36 | 18.4% | 31428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 18.4% | 98 |
| shrub.Vapour v159 | 2.7 | 12.8% | 28 |
| tm.Yuugao 1.0 | 2.7 | 12.6% | 45 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.3% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.7% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.4% | 5 |
| m3thos.Eva00 1.1 | 7.0 | 8.0% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.6% | 1 |
| SHAM.WOW 1.4 | 8.8 | 6.1% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.4 | 19 / 35 | 5206 |
| 2 | 1 | 68.8 | 85.7 | 19 / 35 | 5640 |
| 3 | 1 | 67.2 | 86.3 | 15 / 35 | 5097 |
| 4 | 1 | 69.3 | 89.5 | 19 / 35 | 5703 |
| 5 | 1 | 65.7 | 79.7 | 13 / 35 | 4957 |
| 6 | 1 | 66.3 | 83.8 | 13 / 35 | 4825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 42 | 52% |
| Krabb.sliNk.Garm 0.9u | 35 | 63% |
| shrub.Vapour v159 | 28 | 71% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 100% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 55% |
| m3thos.Eva00 1.1 | 9 | 100% |
| SHAM.WOW 1.4 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 37 | 32% | 64 |
| Krabb.sliNk.Garm 0.9u | 24 | 21% | 36 |
| shrub.Vapour v159 | 22 | 19% | 46 |
| com.spp.robocode.MostlyHarmless 010 | 18 | 16% | 21 |
| zyx.nano.BacillusComma 1.0 | 5 | 4% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 3% | 19 |
| m3thos.Eva00 1.1 | 3 | 3% | 12 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 69.7 | 42 / 210 | 3.72 | 14.8% | 26343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 109 |
| kc.micro.Figment 1.0 | 2.3 | 15.1% | 32 |
| hadur117.mini.DeiseH650 0.4 | 2.7 | 14.8% | 42 |
| yagami.Tidus 0.11 | 4.3 | 10.3% | 2 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.6% | 18 |
| mc2.enemy.Original 0.9 | 5.8 | 9.0% | 4 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 4 |
| step.nanoPri 1.0 | 8.2 | 5.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.0% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 71.7 | 4 / 35 | 4620 |
| 2 | 3 | 64.3 | 71.7 | 8 / 35 | 4666 |
| 3 | 3 | 61.1 | 65.4 | 5 / 35 | 4101 |
| 4 | 2 | 64.1 | 75.2 | 9 / 35 | 4437 |
| 5 | 3 | 63.5 | 69.8 | 11 / 35 | 4402 |
| 6 | 3 | 60.6 | 64.4 | 5 / 35 | 4117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 37 | 22% |
| kc.micro.Figment 1.0 | 27 | 85% |
| yagami.Tidus 0.11 | 5 | 100% |
| mc2.enemy.Original 0.9 | 3 | 100% |
| pedersen.Grishnakh 1.0 | 3 | 0% |
| dft.Calliope 5.6 | 2 | 50% |
| step.nanoPri 1.0 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 39% | 74 |
| kc.micro.Figment 1.0 | 33 | 20% | 55 |
| yagami.Tidus 0.11 | 19 | 11% | 24 |
| pedersen.Grishnakh 1.0 | 15 | 9% | 17 |
| mc2.enemy.Original 0.9 | 15 | 9% | 17 |
| dft.Calliope 5.6 | 12 | 7% | 14 |
| step.nanoPri 1.0 | 4 | 2% | 5 |
| robar.nano.Assertive_Melee 0.2 | 4 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.0 | 137 / 210 | 1.72 | 20.3% | 37038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 20.3% | 137 |
| DTF.Kludgy 1.2b | 2.3 | 14.2% | 36 |
| ejb.Polaris 1.0.1 | 3.0 | 12.8% | 19 |
| ne.Chimera 1.2 | 3.7 | 12.3% | 9 |
| vStar.RAFzilla 2.15 | 5.3 | 10.1% | 0 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.7% | 8 |
| kurios.DOSexe .9b | 7.3 | 5.9% | 1 |
| sam.Samspin 1.0 | 8.2 | 5.2% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.5 | 27 / 35 | 6021 |
| 2 | 1 | 69.7 | 90.2 | 18 / 35 | 5911 |
| 3 | 1 | 70.2 | 91.1 | 21 / 35 | 6186 |
| 4 | 1 | 70.5 | 92.1 | 21 / 35 | 6078 |
| 5 | 1 | 72.3 | 96.8 | 27 / 35 | 6654 |
| 6 | 1 | 70.8 | 92.1 | 23 / 35 | 6188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 60 | 67% |
| ejb.Polaris 1.0.1 | 43 | 77% |
| ne.Chimera 1.2 | 30 | 80% |
| vStar.RAFzilla 2.15 | 17 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 79% |
| donjezza.Muncho 1.0 | 5 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 28 | 38% | 61 |
| ejb.Polaris 1.0.1 | 19 | 26% | 58 |
| ne.Chimera 1.2 | 10 | 14% | 34 |
| tvv.micro.Antares 1.1.1 | 8 | 11% | 14 |
| vStar.RAFzilla 2.15 | 5 | 7% | 16 |
| donjezza.Muncho 1.0 | 2 | 3% | 8 |
| sam.Samspin 1.0 | 1 | 1% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.3 | 63 / 210 | 2.96 | 16.7% | 28997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.3 | 16.7% | 63 |
| rz.Aleph 0.34 | 1.7 | 16.4% | 70 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.0% | 25 |
| djc.DynaBot 0.1.1 | 3.7 | 11.2% | 22 |
| rdt199.Warlord 0.73 | 5.3 | 9.5% | 11 |
| br2.MobyDickBot 1.6 | 5.8 | 8.8% | 10 |
| uji.YellohFellah 1.0 | 7.0 | 7.7% | 9 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 79.0 | 10 / 35 | 4767 |
| 2 | 1 | 66.9 | 82.5 | 12 / 35 | 5047 |
| 3 | 2 | 62.8 | 71.7 | 8 / 35 | 4462 |
| 4 | 1 | 66.3 | 82.2 | 12 / 35 | 4711 |
| 5 | 2 | 64.2 | 74.9 | 9 / 35 | 4783 |
| 6 | 1 | 66.2 | 79.0 | 12 / 35 | 5227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 50 | 50% |
| djc.DynaBot 0.1.1 | 25 | 64% |
| cx.mini.Nimrod 0.55 | 19 | 42% |
| br2.MobyDickBot 1.6 | 9 | 67% |
| uji.YellohFellah 1.0 | 6 | 83% |
| rdt199.Warlord 0.73 | 4 | 75% |

Hadur died in 147 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 58 | 39% | 81 |
| cx.mini.Nimrod 0.55 | 32 | 22% | 41 |
| djc.DynaBot 0.1.1 | 23 | 16% | 32 |
| rdt199.Warlord 0.73 | 17 | 12% | 22 |
| br2.MobyDickBot 1.6 | 6 | 4% | 13 |
| KiraNL.Chupacabra 0.4 | 5 | 3% | 7 |
| uji.YellohFellah 1.0 | 3 | 2% | 10 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 78.9 | 96 / 210 | 2.90 | 16.8% | 25418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.2 | 16.8% | 96 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.8% | 32 |
| nat.PallasHawk 1.0 | 3.0 | 13.3% | 33 |
| darkcanuck.Leon 1.01 | 3.3 | 12.4% | 21 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 15 |
| jrm.Test0 1.0 | 6.2 | 8.1% | 1 |
| jaybot.bots.Oddball 4.0 | 7.7 | 6.7% | 8 |
| cs.sheldor.Talon 1.1 | 8.5 | 6.8% | 1 |
| jp.Perpy 16.0 | 8.5 | 6.2% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 78.7 | 17 / 35 | 3868 |
| 2 | 1 | 68.6 | 85.4 | 19 / 35 | 5283 |
| 3 | 1 | 66.9 | 84.4 | 18 / 35 | 4272 |
| 4 | 1 | 63.7 | 74.0 | 15 / 35 | 3831 |
| 5 | 2 | 61.8 | 72.4 | 10 / 35 | 3628 |
| 6 | 1 | 66.1 | 78.7 | 17 / 35 | 4536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 37 | 73% |
| bts.wiki.RipCurl 0.9b | 34 | 82% |
| darkcanuck.Leon 1.01 | 34 | 79% |
| brainfade.melee.Genghis 0.36 | 10 | 60% |
| jaybot.bots.Oddball 4.0 | 5 | 20% |
| jrm.Test0 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 28 | 25% | 49 |
| nat.PallasHawk 1.0 | 26 | 23% | 50 |
| brainfade.melee.Genghis 0.36 | 24 | 21% | 25 |
| darkcanuck.Leon 1.01 | 18 | 16% | 53 |
| jrm.Test0 1.0 | 7 | 6% | 9 |
| jaybot.bots.Oddball 4.0 | 7 | 6% | 6 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| jp.Perpy 16.0 | 0 | 0% | 3 |

## Melee bench: F13

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 80.5 | 48 / 210 | 2.75 | 16.2% | 28330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.8% | 88 |
| ags.Glacier 0.2.11 | 2.0 | 16.2% | 47 |
| hadur117.mini.DeiseH650 0.4 | 2.5 | 16.2% | 48 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 19 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.3% | 7 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.7% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.4 | 79.0 | 6 / 35 | 4888 |
| 2 | 2 | 66.3 | 80.3 | 10 / 35 | 4853 |
| 3 | 3 | 65.8 | 81.6 | 8 / 35 | 4695 |
| 4 | 1 | 67.5 | 84.8 | 11 / 35 | 5254 |
| 5 | 3 | 63.8 | 79.7 | 5 / 35 | 4193 |
| 6 | 3 | 64.6 | 77.8 | 8 / 35 | 4447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 57 | 25% |
| ags.Glacier 0.2.11 | 44 | 57% |
| shinh.Entangled 0.3 | 14 | 43% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 64 | 40% | 79 |
| ags.Glacier 0.2.11 | 40 | 25% | 64 |
| shinh.Entangled 0.3 | 31 | 19% | 38 |
| gh.micro.Gruweltje 0.7 | 16 | 10% | 17 |
| apc.Colossus2 0.17 | 6 | 4% | 6 |
| stelo.Wang 1.0 | 4 | 2% | 5 |
| maribo.FollowFire 1 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.4 | 130 / 210 | 1.87 | 20.0% | 36407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 20.0% | 130 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 44 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.7% | 31 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 10.1% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.7% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.3% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 8.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.3% | 6 |
| pa.Improved 1.0 | 9.0 | 5.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.5 | 20 / 35 | 5827 |
| 2 | 1 | 71.8 | 93.7 | 25 / 35 | 6414 |
| 3 | 1 | 70.2 | 89.2 | 25 / 35 | 6021 |
| 4 | 1 | 71.3 | 93.7 | 22 / 35 | 6158 |
| 5 | 1 | 69.5 | 88.6 | 20 / 35 | 5822 |
| 6 | 1 | 69.8 | 87.6 | 18 / 35 | 6165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 96 | 75% |
| catcat20.shape.Theta 0.018 | 37 | 59% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 55% | 110 |
| catcat20.shape.Theta 0.018 | 19 | 23% | 36 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 5% | 18 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 4% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 2% | 13 |
| pa.Improved 1.0 | 0 | 0% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 5 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 78.4 | 81 / 210 | 2.94 | 17.5% | 34053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 17.5% | 81 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.6% | 21 |
| emp.Yngwie 1.11 | 2.7 | 13.2% | 52 |
| mld.DustBunny 3.8 | 4.3 | 11.7% | 9 |
| kawigi.robot.Girl 1.2 | 5.0 | 10.7% | 30 |
| cb.nano.Insomnia 1.0 | 5.5 | 10.7% | 15 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.6% | 0 |
| lambdaxy.TBot 0.1 | 8.0 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.1% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.3 | 14 / 35 | 5575 |
| 2 | 1 | 66.8 | 79.0 | 13 / 35 | 5648 |
| 3 | 1 | 65.3 | 74.0 | 13 / 35 | 5450 |
| 4 | 1 | 66.9 | 78.1 | 15 / 35 | 5827 |
| 5 | 1 | 67.3 | 79.7 | 11 / 35 | 5862 |
| 6 | 1 | 67.2 | 79.4 | 15 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 35 | 91% |
| emp.Yngwie 1.11 | 26 | 50% |
| kawigi.robot.Girl 1.2 | 18 | 39% |
| mld.DustBunny 3.8 | 16 | 94% |
| cb.nano.Insomnia 1.0 | 13 | 69% |
| divineomega.TrialBot 0.003 | 5 | 80% |

Hadur died in 132 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 26% | 63 |
| cb.nano.Insomnia 1.0 | 30 | 23% | 27 |
| kawigi.robot.Girl 1.2 | 24 | 18% | 24 |
| mld.DustBunny 3.8 | 18 | 14% | 35 |
| kawigi.micro.Shiz 1.1 | 15 | 11% | 40 |
| lambdaxy.TBot 0.1 | 4 | 3% | 6 |
| divineomega.TrialBot 0.003 | 2 | 2% | 10 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 4 |
3 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 82.8 | 78 / 210 | 2.55 | 18.6% | 36616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.2 | 18.6% | 78 |
| gh.Griezel 0.5.2 | 2.0 | 16.7% | 82 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.6% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.4% | 28 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.5% | 1 |
| tvv.nano.Polaris 1.2 | 6.2 | 8.4% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.0% | 4 |
| asd.Cthulhu 1.3 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 81.9 | 11 / 35 | 6318 |
| 2 | 2 | 67.8 | 81.3 | 11 / 35 | 5700 |
| 3 | 1 | 67.8 | 79.7 | 12 / 35 | 6010 |
| 4 | 1 | 69.8 | 86.7 | 15 / 35 | 6365 |
| 5 | 1 | 69.2 | 82.9 | 16 / 35 | 6209 |
| 6 | 1 | 68.9 | 84.4 | 13 / 35 | 6014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 77 | 34% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 29 | 97% |
| techdude.forest.FlamingForest 1.1 | 14 | 57% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 78 | 59% | 108 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 16% | 42 |
| bvh.fnr.Fenrir 0.36l | 12 | 9% | 15 |
| techdude.forest.FlamingForest 1.1 | 9 | 7% | 18 |
| stelo.IntrinsicVolatility 1.4 | 5 | 4% | 11 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 9 |
| asd.Cthulhu 1.3 | 2 | 2% | 5 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 2 |

## Melee bench: F17

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.5 | 60 / 210 | 3.20 | 16.7% | 33869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 16.7% | 60 |
| et.Predator 1.8 | 2.2 | 13.4% | 40 |
| cx.BlestPain 1.41 | 3.5 | 12.5% | 52 |
| nic.Nicator 2.4 | 4.3 | 12.3% | 17 |
| oog.melee.Mercutio 1.0 | 4.5 | 12.1% | 29 |
| ahf.NanoAndrew .4 | 5.5 | 11.0% | 12 |
| maribo.melee.BMV 0.1 | 7.0 | 8.5% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.7% | 0 |
| tex.Longbot 0.4 | 8.8 | 5.0% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.7 | 9 / 35 | 5649 |
| 2 | 1 | 65.7 | 74.9 | 9 / 35 | 5762 |
| 3 | 1 | 65.2 | 71.1 | 11 / 35 | 5651 |
| 4 | 1 | 67.1 | 79.4 | 10 / 35 | 6013 |
| 5 | 1 | 62.6 | 68.6 | 6 / 35 | 4988 |
| 6 | 1 | 67.5 | 80.3 | 15 / 35 | 5806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 33 | 55% |
| oog.melee.Mercutio 1.0 | 23 | 65% |
| cx.BlestPain 1.41 | 22 | 27% |
| nic.Nicator 2.4 | 17 | 94% |
| ahf.NanoAndrew .4 | 5 | 40% |
| maribo.melee.BMV 0.1 | 4 | 50% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 37 | 25% | 53 |
| cx.BlestPain 1.41 | 36 | 24% | 45 |
| ahf.NanoAndrew .4 | 26 | 17% | 30 |
| oog.melee.Mercutio 1.0 | 21 | 14% | 36 |
| nic.Nicator 2.4 | 18 | 12% | 33 |
| maribo.melee.BMV 0.1 | 7 | 5% | 7 |
| tex.Longbot 0.4 | 4 | 3% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 81.6 | 84 / 210 | 2.65 | 17.3% | 28592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 17.3% | 84 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.9% | 48 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.0% | 34 |
| uji.DBH 1.1 | 4.3 | 11.0% | 19 |
| ratosh.Nobo 0.21 | 5.0 | 10.0% | 2 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.4% | 7 |
| sigterm.Sigterm 1.0 | 7.3 | 8.1% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 6.9% | 5 |
| stelo.WangRobot 1.0 | 8.8 | 6.1% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 80.3 | 15 / 35 | 5037 |
| 2 | 1 | 67.5 | 86.0 | 14 / 35 | 4904 |
| 3 | 1 | 64.8 | 78.1 | 15 / 35 | 4359 |
| 4 | 1 | 67.5 | 86.7 | 15 / 35 | 5064 |
| 5 | 1 | 63.2 | 75.6 | 9 / 35 | 4381 |
| 6 | 1 | 66.7 | 83.2 | 16 / 35 | 4847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 46 | 50% |
| uji.DBH 1.1 | 25 | 72% |
| agd.Mooserwirt2 2.7 | 21 | 43% |
| spinnercat.Robovirus 2.718 | 15 | 80% |
| stelo.WangRobot 1.0 | 11 | 82% |
| sigterm.Sigterm 1.0 | 9 | 89% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 57% |
| ratosh.Nobo 0.21 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 39% | 69 |
| agd.Mooserwirt2 2.7 | 24 | 19% | 34 |
| uji.DBH 1.1 | 13 | 10% | 23 |
| ratosh.Nobo 0.21 | 13 | 10% | 21 |
| spinnercat.Robovirus 2.718 | 10 | 8% | 18 |
| sigterm.Sigterm 1.0 | 6 | 5% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 3% | 10 |
| stelo.WangRobot 1.0 | 3 | 2% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 2% | 4 |
3 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.5 | 118 / 210 | 1.77 | 20.3% | 36862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 20.3% | 118 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 15.0% | 38 |
| mld.Infinity 2.2 | 2.7 | 14.2% | 47 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.7% | 2 |
| erdnis.Rover 0.3 | 4.5 | 10.9% | 2 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.8% | 2 |
| mbh.Mbh 0.1 | 7.3 | 7.3% | 0 |
| pac.ABC 2.1 | 7.7 | 6.4% | 1 |
| pbg.R2D2 1.0 | 8.7 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 86.3 | 16 / 35 | 6017 |
| 2 | 1 | 71.8 | 93.3 | 18 / 35 | 6473 |
| 3 | 1 | 72.0 | 94.0 | 23 / 35 | 5968 |
| 4 | 1 | 70.3 | 90.2 | 19 / 35 | 5890 |
| 5 | 1 | 71.8 | 92.1 | 24 / 35 | 6292 |
| 6 | 1 | 71.6 | 93.0 | 18 / 35 | 6222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 83 | 66% |
| mld.Infinity 2.2 | 54 | 52% |
| krillr.mini.JointStrike 2.0.0 | 13 | 85% |
| erdnis.Rover 0.3 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 88% |
| pac.ABC 2.1 | 5 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 1257. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 42 | 46% | 108 |
| mld.Infinity 2.2 | 33 | 36% | 22 |
| krillr.mini.JointStrike 2.0.0 | 7 | 8% | 25 |
| erdnis.Rover 0.3 | 5 | 5% | 20 |
| patson.PatsonTestBot 1.0 | 4 | 4% | 15 |
| pbg.R2D2 1.0 | 1 | 1% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.3 | 87 / 210 | 2.23 | 18.9% | 34548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 18.9% | 87 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 46 |
| fwb.Nine 1.0.1 | 3.3 | 12.4% | 39 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.5% | 13 |
| catcat20.Rabbit 0.001 | 4.8 | 10.4% | 23 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.9% | 0 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 6.7% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.8 | 14 / 35 | 5590 |
| 2 | 1 | 69.6 | 88.6 | 15 / 35 | 6115 |
| 3 | 1 | 68.9 | 85.4 | 14 / 35 | 5937 |
| 4 | 1 | 69.1 | 88.3 | 16 / 35 | 5637 |
| 5 | 1 | 68.9 | 88.6 | 15 / 35 | 5656 |
| 6 | 1 | 67.8 | 82.2 | 13 / 35 | 5613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 64 | 69% |
| fwb.Nine 1.0.1 | 29 | 24% |
| catcat20.Rabbit 0.001 | 25 | 60% |
| nz.jdc.nano.GridFu 1.0 | 15 | 60% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 1072. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 51 | 41% | 93 |
| fwb.Nine 1.0.1 | 30 | 24% | 19 |
| catcat20.Rabbit 0.001 | 19 | 15% | 37 |
| nz.jdc.nano.GridFu 1.0 | 16 | 13% | 31 |
| bayen.nut.Squirrel 1.615 | 4 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 7 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 4 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.0 | 93 / 210 | 2.08 | 19.4% | 36632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 19.4% | 93 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 76 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 20 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 9 |
| eld.Hmm 1.0 | 5.2 | 8.5% | 13 |
| oa.weak.BotherBot 0.1 | 6.2 | 8.1% | 1 |
| fire219.CatBot 1.0 | 7.2 | 6.7% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.7 | 14 / 35 | 6013 |
| 2 | 1 | 70.4 | 89.8 | 16 / 35 | 6568 |
| 3 | 1 | 69.4 | 88.3 | 16 / 35 | 5780 |
| 4 | 1 | 70.3 | 88.9 | 18 / 35 | 6504 |
| 5 | 1 | 69.6 | 87.0 | 14 / 35 | 6046 |
| 6 | 1 | 69.2 | 88.3 | 15 / 35 | 5721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 76 | 46% |
| dummy.mini.Scimitar 1.01 | 36 | 81% |
| cf.RiO.RiOx 4.2.1 | 23 | 87% |
| eld.Hmm 1.0 | 14 | 50% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1140. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 53 | 45% | 79 |
| dummy.mini.Scimitar 1.01 | 35 | 30% | 69 |
| cf.RiO.RiOx 4.2.1 | 15 | 13% | 25 |
| eld.Hmm 1.0 | 10 | 9% | 22 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 7 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.4 | 69 / 210 | 2.59 | 17.8% | 33637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.3 | 17.8% | 69 |
| pe.SandboxDT 2.71m | 1.8 | 16.0% | 70 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.3% | 42 |
| jlm.javaDisturbance 0.59 | 3.7 | 13.2% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 9 |
| yk.JahRoslav 1.1 | 6.5 | 6.7% | 2 |
| tad.Dalek98 0.98 | 6.8 | 6.5% | 1 |
| gg.Squaraus 0.6 | 7.7 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 9.3 | 5.0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 78.7 | 7 / 35 | 5368 |
| 2 | 1 | 67.2 | 80.6 | 10 / 35 | 5626 |
| 3 | 1 | 68.9 | 84.4 | 16 / 35 | 5903 |
| 4 | 2 | 64.7 | 75.2 | 9 / 35 | 5109 |
| 5 | 1 | 70.1 | 90.8 | 15 / 35 | 6113 |
| 6 | 1 | 68.4 | 84.4 | 12 / 35 | 5518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 49 | 37% |
| kvk.HebusLeTroll 0.35 | 39 | 64% |
| jlm.javaDisturbance 0.59 | 28 | 71% |
| bigpete.Stewie 1.0 | 10 | 60% |

Hadur died in 141 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 57 | 40% | 80 |
| kvk.HebusLeTroll 0.35 | 36 | 26% | 57 |
| jlm.javaDisturbance 0.59 | 32 | 23% | 44 |
| bigpete.Stewie 1.0 | 9 | 6% | 17 |
| tad.Dalek98 0.98 | 4 | 3% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.1 | 123 / 210 | 1.80 | 20.2% | 34880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 20.2% | 123 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 60 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 15 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.3% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.5% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 8.9% | 4 |
| cw.megas.Blade 0.8 | 7.0 | 8.2% | 0 |
| sample.Walls 1.0 | 7.5 | 8.0% | 3 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.6 | 24 / 35 | 6064 |
| 2 | 1 | 69.3 | 83.2 | 17 / 35 | 5421 |
| 3 | 1 | 72.1 | 94.0 | 23 / 35 | 6272 |
| 4 | 1 | 70.7 | 91.7 | 18 / 35 | 5714 |
| 5 | 1 | 71.0 | 90.8 | 18 / 35 | 5703 |
| 6 | 1 | 71.7 | 92.4 | 23 / 35 | 5706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 94 | 61% |
| cre.Karolos 0.32 | 33 | 82% |
| stelo.AreaTargetingBot 1.1 | 22 | 95% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| sample.Walls 1.0 | 8 | 88% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 56 | 64% | 111 |
| cre.Karolos 0.32 | 18 | 21% | 47 |
| stelo.AreaTargetingBot 1.1 | 7 | 8% | 20 |
| stelo.RamTrackSurfer 1.2 | 5 | 6% | 17 |
| sample.Walls 1.0 | 1 | 1% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |
| cw.megas.Blade 0.8 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.9 | 44 / 210 | 3.62 | 14.7% | 25310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.8 | 14.7% | 44 |
| rz.GlowBlowMelee 1.4 | 1.8 | 14.3% | 45 |
| florent.XSeries.X2 0.12 | 3.2 | 13.5% | 38 |
| davidalves.Phoenix 0.54 | 3.7 | 13.3% | 45 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.4% | 28 |
| oog.melee.Corsair 1.0 | 6.2 | 9.3% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.4% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 1 |
| evd.X1 0.01 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 72.1 | 7 / 35 | 4219 |
| 2 | 3 | 59.7 | 64.4 | 6 / 35 | 3888 |
| 3 | 1 | 63.9 | 73.3 | 9 / 35 | 4408 |
| 4 | 2 | 60.9 | 68.6 | 6 / 35 | 3967 |
| 5 | 2 | 60.8 | 67.9 | 4 / 35 | 4142 |
| 6 | 1 | 65.8 | 79.0 | 12 / 35 | 4686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 22 | 64% |
| davidalves.Phoenix 0.54 | 19 | 42% |
| florent.XSeries.X2 0.12 | 16 | 25% |
| stelo.SoJNanoMelee 1.1 | 12 | 100% |
| pedersen.Ugluk 1.1.1 | 10 | 50% |
| oog.melee.Corsair 1.0 | 2 | 50% |

Hadur died in 168 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 46 | 27% | 56 |
| florent.XSeries.X2 0.12 | 39 | 23% | 42 |
| rz.GlowBlowMelee 1.4 | 37 | 22% | 49 |
| pedersen.Ugluk 1.1.1 | 21 | 13% | 27 |
| stelo.SoJNanoMelee 1.1 | 10 | 6% | 12 |
| oog.melee.Corsair 1.0 | 9 | 5% | 15 |
| evd.X1 0.01 | 2 | 1% | 3 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.8 | 115 / 210 | 2.46 | 18.3% | 28111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 18.3% | 115 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.7% | 22 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.4% | 22 |
| jdw.Hurricane 1.4 | 4.2 | 11.1% | 24 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.1% | 9 |
| ds.Oo 2.2 | 5.5 | 9.1% | 9 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.4% | 6 |
| awesomeness.Elite 1.0 | 7.8 | 7.3% | 2 |
| adt.Ar2 1.1 | 8.8 | 6.3% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.0 | 22 / 35 | 4800 |
| 2 | 1 | 64.6 | 77.1 | 16 / 35 | 3847 |
| 3 | 1 | 68.8 | 85.4 | 21 / 35 | 5069 |
| 4 | 1 | 67.0 | 82.9 | 16 / 35 | 4570 |
| 5 | 1 | 68.6 | 86.7 | 20 / 35 | 5075 |
| 6 | 1 | 67.9 | 83.5 | 20 / 35 | 4750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 85% |
| voidious.mini.BrokenSword 2.0.3 | 43 | 84% |
| jdw.Hurricane 1.4 | 18 | 61% |
| ds.Oo 2.2 | 7 | 100% |
| gre.svman4.Morfeas 1.4.1 | 6 | 67% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| adt.Ar2 1.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 28 | 29% | 38 |
| voidious.micro.BlitzBat 1.05 | 24 | 25% | 62 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 20% | 52 |
| ds.Oo 2.2 | 9 | 9% | 19 |
| awesomeness.Elite 1.0 | 5 | 5% | 6 |
| gre.svman4.Morfeas 1.4.1 | 4 | 4% | 13 |
| adt.Ar2 1.1 | 4 | 4% | 10 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 6 |
| amk.ChumbaMini 0.2 | 0 | 0% | 4 |

## Melee bench: F26

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.2 | 108 / 210 | 2.15 | 19.4% | 37523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 19.4% | 108 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 51 |
| shu.nitro.LENIN .T34 | 3.5 | 11.9% | 19 |
| lrem.Spectre 0.4.4 | 3.5 | 11.6% | 13 |
| js.PinBall 1.6 | 5.3 | 10.2% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.9% | 8 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.6% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 83.8 | 14 / 35 | 5921 |
| 2 | 1 | 70.3 | 87.6 | 18 / 35 | 6545 |
| 3 | 1 | 69.7 | 87.9 | 15 / 35 | 6151 |
| 4 | 1 | 69.4 | 85.7 | 20 / 35 | 6096 |
| 5 | 1 | 68.8 | 85.7 | 16 / 35 | 6159 |
| 6 | 1 | 71.8 | 92.7 | 25 / 35 | 6651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 49 | 63% |
| lrem.Spectre 0.4.4 | 37 | 86% |
| shu.nitro.LENIN .T34 | 32 | 59% |
| jaybot.adv.bots.JayBot 2.0 | 12 | 92% |
| js.PinBall 1.6 | 7 | 86% |
| gh.mini.GrubbmOne 1.0 | 6 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 39 | 38% | 65 |
| shu.nitro.LENIN .T34 | 22 | 21% | 49 |
| lrem.Spectre 0.4.4 | 21 | 20% | 40 |
| js.PinBall 1.6 | 8 | 8% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 6% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 4% | 11 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 11 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.8 | 82 / 210 | 2.91 | 17.2% | 29946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 17.2% | 82 |
| mk.Alpha 0.2.1 | 2.7 | 13.6% | 53 |
| sheldor.melee.nano.TestMelee 0.1 | 3.2 | 12.3% | 32 |
| wee.Gem 1.8.4 | 3.7 | 11.5% | 28 |
| EH.Eagle 1.0.6 | 4.5 | 11.0% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.0% | 4 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.7% | 3 |
| joe.ADinosaur 1.0 | 8.2 | 6.9% | 0 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.2% | 3 |
| cs.Grudge 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 78.1 | 12 / 35 | 4551 |
| 2 | 1 | 66.7 | 83.5 | 15 / 35 | 4593 |
| 3 | 1 | 65.7 | 69.2 | 14 / 35 | 5725 |
| 4 | 1 | 66.7 | 75.2 | 10 / 35 | 5657 |
| 5 | 1 | 66.9 | 84.4 | 15 / 35 | 4831 |
| 6 | 1 | 66.0 | 82.2 | 16 / 35 | 4589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 39 | 67% |
| wee.Gem 1.8.4 | 28 | 57% |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 67% |
| EH.Eagle 1.0.6 | 20 | 95% |
| throxbot.ThroxBot 0.1 | 3 | 67% |
| joe.ADinosaur 1.0 | 2 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 39 | 30% | 68 |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 18% | 36 |
| wee.Gem 1.8.4 | 21 | 16% | 38 |
| caimano.Furia_Ceca 0.22 | 13 | 10% | 14 |
| throxbot.ThroxBot 0.1 | 12 | 9% | 14 |
| EH.Eagle 1.0.6 | 10 | 8% | 24 |
| joe.ADinosaur 1.0 | 5 | 4% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 3% | 6 |
| cs.Grudge 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.4 | 119 / 210 | 2.05 | 19.1% | 30640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 19.1% | 119 |
| kid.test.NightFox .2 | 2.0 | 15.2% | 50 |
| qohnil.blot.BlotBot 3.61 | 3.5 | 11.1% | 14 |
| uji.Antique 1.0 | 3.7 | 11.0% | 18 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 4 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.3% | 2 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.8% | 3 |
| matt.advanced.Katana 1.0 | 8.0 | 6.5% | 1 |
| stelo.Lifestealer 1.0 | 9.0 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.4 | 21 / 35 | 5532 |
| 2 | 1 | 68.9 | 89.2 | 21 / 35 | 4995 |
| 3 | 1 | 66.4 | 83.8 | 15 / 35 | 4750 |
| 4 | 1 | 69.8 | 89.5 | 24 / 35 | 5155 |
| 5 | 1 | 66.7 | 84.1 | 16 / 35 | 4733 |
| 6 | 1 | 70.3 | 92.1 | 22 / 35 | 5475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 75 | 64% |
| uji.Antique 1.0 | 43 | 91% |
| qohnil.blot.BlotBot 3.61 | 22 | 68% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| amk.ChumbaWumba 0.3 | 3 | 100% |
| ahr.ice.Ice 1.0.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 45 | 49% | 80 |
| uji.Antique 1.0 | 11 | 12% | 43 |
| qohnil.blot.BlotBot 3.61 | 11 | 12% | 29 |
| pfvicm.Sobieski 7.2.3b | 11 | 12% | 22 |
| amk.ChumbaWumba 0.3 | 6 | 7% | 9 |
| ahr.ice.Ice 1.0.2 | 3 | 3% | 12 |
| matt.advanced.Katana 1.0 | 2 | 2% | 4 |
| stelo.Lifestealer 1.0 | 1 | 1% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 79.7 | 70 / 210 | 2.83 | 17.5% | 30770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.2 | 17.5% | 70 |
| deewiant.Anomaly 0.2 | 2.0 | 15.6% | 66 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.3% | 49 |
| myl.micro.Troodon 1.10 | 4.2 | 11.9% | 12 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.9% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.3% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.9% | 2 |
| jangs.ns51 1.0 | 9.7 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 70.5 | 8 / 35 | 4702 |
| 2 | 1 | 67.1 | 80.0 | 13 / 35 | 5043 |
| 3 | 1 | 69.1 | 85.1 | 13 / 35 | 5644 |
| 4 | 1 | 65.6 | 76.5 | 10 / 35 | 4948 |
| 5 | 1 | 69.0 | 85.4 | 15 / 35 | 5208 |
| 6 | 1 | 67.3 | 80.6 | 11 / 35 | 5225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 50% |
| zyx.mega.YersiniaPestis 3.1 | 40 | 55% |
| myl.micro.Troodon 1.10 | 13 | 77% |
| jok.PheonixM 0.1.2 | 7 | 57% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ap.Frederick 1.1 | 3 | 67% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 44% | 87 |
| zyx.mega.YersiniaPestis 3.1 | 35 | 25% | 50 |
| myl.micro.Troodon 1.10 | 20 | 14% | 31 |
| jok.PheonixM 0.1.2 | 15 | 11% | 23 |
| ph.melee.ArcherME 0.3 | 7 | 5% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| DBall.Anarchy 0.1 | 0 | 0% | 7 |

## Melee bench: F30

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 67.7 | 28 / 210 | 3.90 | 13.7% | 24089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.5 | 14.5% | 62 |
| darkcanuck.B26354 1.06 | 2.5 | 13.6% | 47 |
| hadur117.mini.DeiseH650 0.4 | 2.7 | 13.7% | 28 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.7% | 29 |
| oog.melee.Capulet 1.2 | 4.3 | 12.4% | 30 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.4% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.5% | 4 |
| ntc.Opposite 1.5 | 7.7 | 7.2% | 1 |
| tripphippy.Alice 1.1 | 8.0 | 7.3% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 72.1 | 8 / 35 | 4137 |
| 2 | 3 | 60.3 | 67.9 | 2 / 35 | 4010 |
| 3 | 4 | 59.0 | 63.8 | 4 / 35 | 3471 |
| 4 | 3 | 60.0 | 66.0 | 4 / 35 | 4054 |
| 5 | 1 | 63.1 | 71.7 | 8 / 35 | 4508 |
| 6 | 3 | 58.7 | 64.8 | 2 / 35 | 3909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 20 | 30% |
| oog.melee.Capulet 1.2 | 16 | 38% |
| darkcanuck.B26354 1.06 | 11 | 27% |
| stelo.PastFuture 2.3.2 | 10 | 70% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |
| intruder.PrairieWolf 2.61 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 42 | 23% | 48 |
| oog.melee.Capulet 1.2 | 39 | 21% | 45 |
| darkcanuck.B26354 1.06 | 38 | 21% | 44 |
| catcat20.Matcha 0.006 | 33 | 18% | 39 |
| ntc.Opposite 1.5 | 10 | 5% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 5% | 8 |
| intruder.PrairieWolf 2.61 | 6 | 3% | 8 |
| tripphippy.Alice 1.1 | 4 | 2% | 6 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 68.9 | 29 / 210 | 3.80 | 14.0% | 23358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 108 |
| hadur117.mini.DeiseH650 0.4 | 2.3 | 14.0% | 29 |
| gh.mini.Griezel 0.2 | 2.8 | 13.5% | 46 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.4% | 17 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.0% | 9 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.1% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.8% | 1 |
| fm.mammillarias 1.3 | 8.3 | 5.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.6 | 62.2 | 3 / 35 | 3814 |
| 2 | 2 | 61.5 | 71.1 | 4 / 35 | 3935 |
| 3 | 3 | 60.7 | 67.3 | 5 / 35 | 3727 |
| 4 | 3 | 61.0 | 68.9 | 4 / 35 | 3968 |
| 5 | 2 | 61.7 | 71.7 | 4 / 35 | 3739 |
| 6 | 2 | 63.2 | 72.4 | 9 / 35 | 4175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 39 | 36% |
| spinnercat.micro.Tyger 0.1 | 12 | 50% |
| gh.mini.Griezel 0.2 | 11 | 27% |
| d414.nano.Quantum 1.0.0 | 8 | 63% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 183 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 60 | 33% | 69 |
| gh.mini.Griezel 0.2 | 40 | 22% | 45 |
| spinnercat.micro.Tyger 0.1 | 37 | 20% | 41 |
| d414.nano.Quantum 1.0.0 | 17 | 9% | 23 |
| fm.mammillarias 1.3 | 11 | 6% | 12 |
| timmit.nano.TimDog 0.33 | 7 | 4% | 8 |
| gh.nano.Grofvuil 0.2 | 6 | 3% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.0 | 98 / 210 | 2.17 | 18.7% | 32665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 18.7% | 98 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.2% | 65 |
| apc.botM 3.0 | 3.0 | 11.7% | 23 |
| lxx.ConceptA 0.8 | 4.2 | 10.7% | 8 |
| bayen.UbaMicro 1.4 | 5.5 | 8.8% | 3 |
| vjik.UnViolation 1.1 | 5.8 | 8.7% | 3 |
| panzer.Panzer 0.2 | 6.5 | 7.9% | 2 |
| yk.JahMicro 1.0 | 8.5 | 6.6% | 5 |
| conscience.Electron 1.3g | 8.8 | 6.4% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.1 | 19 / 35 | 6049 |
| 2 | 1 | 68.8 | 90.2 | 15 / 35 | 5498 |
| 3 | 1 | 64.7 | 76.5 | 12 / 35 | 4849 |
| 4 | 1 | 67.4 | 82.5 | 18 / 35 | 5521 |
| 5 | 1 | 68.8 | 90.5 | 19 / 35 | 5307 |
| 6 | 1 | 69.2 | 91.4 | 15 / 35 | 5441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 88 | 45% |
| apc.botM 3.0 | 27 | 59% |
| lxx.ConceptA 0.8 | 18 | 67% |
| panzer.Panzer 0.2 | 9 | 89% |
| donjezza.Jezza 1.0 | 9 | 78% |
| yk.JahMicro 1.0 | 7 | 71% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| vjik.UnViolation 1.1 | 5 | 80% |

Hadur died in 113 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 57 | 50% | 101 |
| apc.botM 3.0 | 18 | 16% | 41 |
| lxx.ConceptA 0.8 | 17 | 15% | 26 |
| bayen.UbaMicro 1.4 | 7 | 6% | 11 |
| panzer.Panzer 0.2 | 6 | 5% | 11 |
| yk.JahMicro 1.0 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |
| conscience.Electron 1.3g | 2 | 2% | 3 |
| vjik.UnViolation 1.1 | 1 | 1% | 8 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.5 | 80 / 210 | 2.67 | 17.8% | 31671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.3 | 17.8% | 80 |
| maribo.Quester 0.3 | 1.7 | 16.1% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.1% | 27 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.8% | 15 |
| labg.Cataclysm 2.05 | 4.5 | 10.8% | 19 |
| baal.nano.N 1.42 | 6.3 | 8.6% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.2% | 9 |
| zyx.micro.Ant 1.1 | 8.7 | 5.4% | 0 |
| sanja.First 0.1 | 8.8 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.4 | 20 / 35 | 5872 |
| 2 | 2 | 62.8 | 68.3 | 10 / 35 | 4782 |
| 3 | 1 | 66.3 | 80.0 | 9 / 35 | 5160 |
| 4 | 2 | 66.8 | 81.0 | 11 / 35 | 4986 |
| 5 | 1 | 68.8 | 85.1 | 17 / 35 | 5312 |
| 6 | 1 | 68.4 | 83.2 | 13 / 35 | 5559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 41 | 44% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 73% |
| gre.svman4.Leonidas 1.3.2 | 18 | 94% |
| labg.Cataclysm 2.05 | 15 | 53% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 50% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 100% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 62 | 47% | 89 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 23% | 55 |
| labg.Cataclysm 2.05 | 12 | 9% | 18 |
| gre.svman4.Leonidas 1.3.2 | 10 | 8% | 24 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 6% | 9 |
| zyx.micro.Ant 1.1 | 5 | 4% | 7 |
| baal.nano.N 1.42 | 3 | 2% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| sanja.First 0.1 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.3 | 57 / 210 | 2.60 | 17.4% | 32955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.2 | 17.4% | 57 |
| stelo.Spread 0.9 | 2.2 | 17.1% | 87 |
| kid.Gladiator .7.2 | 2.7 | 15.7% | 43 |
| tcf.Reach 3 | 4.5 | 11.0% | 7 |
| jcs.Seth 1.8 | 4.5 | 11.0% | 16 |
| cli.Dancer 1.1 | 6.0 | 9.0% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.9 | 7 / 35 | 5130 |
| 2 | 1 | 67.5 | 79.4 | 10 / 35 | 5753 |
| 3 | 1 | 68.7 | 85.4 | 11 / 35 | 5789 |
| 4 | 2 | 67.1 | 81.9 | 9 / 35 | 4978 |
| 5 | 1 | 68.6 | 84.1 | 9 / 35 | 5946 |
| 6 | 1 | 67.3 | 81.0 | 11 / 35 | 5359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 64 | 38% |
| kid.Gladiator .7.2 | 37 | 59% |
| jcs.Seth 1.8 | 9 | 56% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |
| tcf.Reach 3 | 2 | 50% |

Hadur died in 154 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 71 | 46% | 94 |
| kid.Gladiator .7.2 | 56 | 36% | 75 |
| jcs.Seth 1.8 | 12 | 8% | 19 |
| tcf.Reach 3 | 10 | 6% | 12 |
| ratosh.Wesco 1.4 | 2 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| cli.Dancer 1.1 | 1 | 1% | 4 |

## Melee bench: F35

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 78.3 | 30 / 210 | 2.96 | 15.4% | 24555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 145 |
| hadur117.mini.DeiseH650 0.4 | 2.0 | 15.4% | 30 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.9% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.0% | 16 |
| rz.HawkOnFire 0.1 | 4.5 | 11.6% | 5 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 7.0% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 77.8 | 5 / 35 | 4071 |
| 2 | 2 | 66.3 | 82.5 | 9 / 35 | 4437 |
| 3 | 2 | 61.9 | 73.7 | 1 / 35 | 3675 |
| 4 | 2 | 63.3 | 76.5 | 4 / 35 | 3959 |
| 5 | 2 | 64.1 | 79.4 | 4 / 35 | 4139 |
| 6 | 2 | 65.4 | 79.7 | 7 / 35 | 4274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 67 | 12% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 69% |
| rz.HawkOnFire 0.1 | 11 | 82% |
| gh.mini.Gruwel 0.9 | 7 | 29% |
| wit.Chuliath 1.0 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 88 | 49% | 97 |
| gh.mini.Gruwel 0.9 | 41 | 23% | 43 |
| dmh.robocode.robot.BlackDeath 9.2 | 23 | 13% | 32 |
| rz.HawkOnFire 0.1 | 18 | 10% | 26 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 4 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.2 | 136 / 210 | 1.97 | 20.4% | 35903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 20.4% | 136 |
| bzdp.Pansy 2.1 | 2.3 | 12.5% | 16 |
| alpha.RainingFire 1.0 | 3.3 | 12.0% | 23 |
| mz.Cork 0.1 | 4.2 | 10.9% | 12 |
| bvh.micro.Freya 0.3 | 5.3 | 10.0% | 13 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.6% | 4 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.3% | 6 |
| dl.BetterWalls 1.0 | 8.2 | 5.8% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 4.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.7 | 20 / 35 | 5867 |
| 2 | 1 | 71.3 | 91.1 | 24 / 35 | 6254 |
| 3 | 1 | 68.4 | 83.5 | 18 / 35 | 5749 |
| 4 | 1 | 72.4 | 94.9 | 27 / 35 | 6365 |
| 5 | 1 | 71.6 | 93.3 | 26 / 35 | 5883 |
| 6 | 1 | 69.7 | 86.7 | 21 / 35 | 5785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 96% |
| bvh.micro.Freya 0.3 | 27 | 89% |
| bvh.mini.Fenrir 0.39 | 24 | 96% |
| alpha.RainingFire 1.0 | 21 | 71% |
| mz.Cork 0.1 | 19 | 74% |
| m3thos.Eva02 0.7.1 | 11 | 73% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 18 | 24% | 38 |
| bzdp.Pansy 2.1 | 17 | 23% | 56 |
| bvh.mini.Fenrir 0.39 | 13 | 17% | 22 |
| bvh.micro.Freya 0.3 | 11 | 15% | 32 |
| mz.Cork 0.1 | 6 | 8% | 28 |
| m3thos.Eva02 0.7.1 | 6 | 8% | 16 |
| dl.BetterWalls 1.0 | 2 | 3% | 9 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 8 |

## Melee bench: F37

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.9 | 169 / 210 | 1.64 | 20.7% | 37746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 20.7% | 169 |
| germ.TheMind .2 | 2.5 | 11.0% | 6 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 10.7% | 7 |
| EBBU.Sim2 1.02 | 5.5 | 8.6% | 1 |
| agrach.Dalek 1.0 | 5.7 | 8.7% | 9 |
| lmk.ACPFinal 0.1 | 6.0 | 8.4% | 3 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.9% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 7.8% | 0 |
| mb.Beast 0.1 | 8.3 | 7.9% | 5 |
| skm.Ryubot 1.0 | 9.2 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.0 | 24 / 35 | 6008 |
| 2 | 1 | 70.2 | 92.4 | 27 / 35 | 6481 |
| 3 | 1 | 70.4 | 94.0 | 27 / 35 | 6281 |
| 4 | 1 | 71.3 | 94.9 | 31 / 35 | 6643 |
| 5 | 1 | 71.3 | 96.5 | 31 / 35 | 6388 |
| 6 | 1 | 69.7 | 92.4 | 29 / 35 | 5945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 46 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 96% |
| stelo.UntouchableNano 1.3 | 26 | 77% |
| agrach.Dalek 1.0 | 22 | 95% |
| EBBU.Sim2 1.02 | 21 | 100% |
| lmk.ACPFinal 0.1 | 17 | 88% |
| mb.Beast 0.1 | 11 | 91% |
| skm.Ryubot 1.0 | 10 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 26% | 45 |
| germ.TheMind .2 | 9 | 21% | 49 |
| stelo.UntouchableNano 1.3 | 7 | 16% | 21 |
| lmk.ACPFinal 0.1 | 6 | 14% | 23 |
| agrach.Dalek 1.0 | 4 | 9% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 7% | 5 |
| EBBU.Sim2 1.02 | 2 | 5% | 16 |
| mb.Beast 0.1 | 1 | 2% | 15 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

## Melee bench: F38

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.5 | 75 / 210 | 3.03 | 16.4% | 28133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 15.7% | 72 |
| hadur117.mini.DeiseH650 0.4 | 1.5 | 16.4% | 75 |
| bvh.mini.Freya 0.55 | 3.5 | 12.5% | 11 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.6% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.9% | 6 |
| cs.Wren 1.0 | 5.5 | 10.5% | 10 |
| kdf.KoulDestroyer 1.0 | 6.7 | 8.9% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.8% | 2 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 74.0 | 10 / 35 | 4446 |
| 2 | 1 | 65.4 | 77.8 | 10 / 35 | 4937 |
| 3 | 2 | 63.1 | 72.7 | 10 / 35 | 4069 |
| 4 | 1 | 67.4 | 84.8 | 16 / 35 | 4842 |
| 5 | 1 | 66.4 | 79.7 | 15 / 35 | 4929 |
| 6 | 2 | 65.7 | 75.9 | 14 / 35 | 4910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 45 | 49% |
| bvh.mini.Freya 0.55 | 17 | 82% |
| bts.mega.Gnarly 1.4 | 15 | 60% |
| cs.Wren 1.0 | 13 | 92% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 100% |
| kdf.KoulDestroyer 1.0 | 6 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 49 | 36% | 69 |
| bts.mega.Gnarly 1.4 | 28 | 20% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 13% | 34 |
| bvh.mini.Freya 0.55 | 17 | 12% | 29 |
| kdf.KoulDestroyer 1.0 | 10 | 7% | 15 |
| cs.Wren 1.0 | 9 | 7% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 5 |
| bzdp.BoxCar 2.0 | 2 | 1% | 4 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 3 |

## Melee bench: F39

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 82.8 | 81 / 210 | 2.55 | 17.6% | 31631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 17.6% | 81 |
| bvh.fry.Freya 0.82 | 2.3 | 13.9% | 25 |
| az.Ololobot 0.2.4 | 2.8 | 13.0% | 61 |
| catcat20.Lambda 0.024 | 3.8 | 11.7% | 27 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.5% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.2% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 8.3% | 8 |
| gimp.GimpBot 0.1 | 7.5 | 7.7% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.3 | 16 / 35 | 5623 |
| 2 | 1 | 67.3 | 86.7 | 13 / 35 | 5114 |
| 3 | 1 | 64.0 | 74.3 | 12 / 35 | 4907 |
| 4 | 1 | 67.1 | 84.8 | 12 / 35 | 5409 |
| 5 | 1 | 67.7 | 84.8 | 16 / 35 | 5536 |
| 6 | 1 | 65.4 | 79.7 | 12 / 35 | 5042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 41 | 44% |
| bvh.fry.Freya 0.82 | 29 | 76% |
| catcat20.Lambda 0.024 | 29 | 72% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 93% |
| gimp.GimpBot 0.1 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 43 | 33% | 59 |
| az.Ololobot 0.2.4 | 39 | 30% | 59 |
| catcat20.Lambda 0.024 | 22 | 17% | 43 |
| gimp.GimpBot 0.1 | 8 | 6% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 6% | 15 |
| apollokidd.ApolloKidd 0.9 | 6 | 5% | 9 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.9 | 105 / 210 | 2.45 | 18.8% | 33321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 18.8% | 105 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.2% | 41 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.2% | 23 |
| Polkwane.SmashMelee 1.0 | 4.3 | 10.6% | 18 |
| mz.AntiGrav 1.0 | 4.7 | 10.5% | 5 |
| stelo.Randomness 1.0 | 6.2 | 9.2% | 10 |
| alpha.BlackIce 1.0 | 6.5 | 8.7% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.1% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.6% | 1 |
| sample.Corners 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.9 | 19 / 35 | 5404 |
| 2 | 1 | 68.6 | 86.0 | 16 / 35 | 5595 |
| 3 | 1 | 65.5 | 77.1 | 12 / 35 | 4939 |
| 4 | 1 | 70.4 | 88.6 | 24 / 35 | 5791 |
| 5 | 1 | 69.2 | 85.1 | 16 / 35 | 5988 |
| 6 | 1 | 68.3 | 83.5 | 18 / 35 | 5604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 48 | 65% |
| kano.gamma.KanoGamma 1.8 | 33 | 70% |
| Polkwane.SmashMelee 1.0 | 26 | 73% |
| mz.AntiGrav 1.0 | 16 | 94% |
| stelo.Randomness 1.0 | 11 | 82% |
| sample.Corners 1.0 | 3 | 100% |
| alpha.BlackIce 1.0 | 3 | 67% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 36 | 34% | 60 |
| Polkwane.SmashMelee 1.0 | 19 | 18% | 30 |
| kano.gamma.KanoGamma 1.8 | 18 | 17% | 47 |
| stelo.Randomness 1.0 | 10 | 10% | 29 |
| alpha.BlackIce 1.0 | 9 | 9% | 13 |
| mz.AntiGrav 1.0 | 8 | 8% | 19 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 5 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 3 |
| sample.Corners 1.0 | 1 | 1% | 4 |

## Melee bench: F41

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.0 | 57 / 210 | 2.98 | 16.2% | 27888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.5 | 16.2% | 57 |
| eem.EvBotNG v12.8 | 1.5 | 16.3% | 87 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 13.2% | 31 |
| ary.Swarm 1.1 | 3.7 | 13.0% | 18 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.8% | 11 |
| shrub.Silver v048 | 6.3 | 8.6% | 2 |
| zyx.nano.Ant 1.1 | 6.7 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 5.8% | 3 |
| stelo.Mirror 1.1 | 8.7 | 5.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.8 | 9 / 35 | 5005 |
| 2 | 2 | 63.3 | 73.0 | 7 / 35 | 4379 |
| 3 | 1 | 67.1 | 83.5 | 13 / 35 | 4682 |
| 4 | 2 | 66.6 | 81.6 | 10 / 35 | 4850 |
| 5 | 1 | 64.8 | 76.5 | 11 / 35 | 4445 |
| 6 | 2 | 64.3 | 75.9 | 7 / 35 | 4527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 56 | 39% |
| ary.Swarm 1.1 | 19 | 53% |
| lessonz.robocode.Oz 0.5.0 | 19 | 74% |
| simonton.nano.MeleeSeed 1.8 | 10 | 60% |
| shrub.Silver v048 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 56 | 36% | 76 |
| ary.Swarm 1.1 | 37 | 24% | 49 |
| lessonz.robocode.Oz 0.5.0 | 27 | 18% | 37 |
| simonton.nano.MeleeSeed 1.8 | 16 | 10% | 20 |
| zyx.nano.Ant 1.1 | 5 | 3% | 9 |
| shrub.Silver v048 | 5 | 3% | 8 |
| stelo.Mirror 1.1 | 5 | 3% | 6 |
| jsal.Jsalbot 1.0 | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 76.9 | 49 / 210 | 3.08 | 16.2% | 30988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.5 | 16.2% | 49 |
| wompi.Wallaby 5.1 | 1.8 | 15.7% | 75 |
| ara.Shera 0.88 | 3.0 | 14.7% | 42 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 14.1% | 33 |
| amz.NanoClone 1.41 | 5.8 | 8.4% | 1 |
| dsw.StaticD 1.0 | 5.8 | 7.8% | 11 |
| maribo.IotaCT 1.1 | 7.0 | 7.3% | 0 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 4.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 76.2 | 8 / 35 | 5392 |
| 2 | 2 | 64.0 | 72.7 | 6 / 35 | 5059 |
| 3 | 2 | 64.8 | 77.5 | 6 / 35 | 5048 |
| 4 | 1 | 66.2 | 77.8 | 13 / 35 | 5393 |
| 5 | 1 | 66.0 | 80.0 | 11 / 35 | 5057 |
| 6 | 2 | 64.5 | 77.1 | 5 / 35 | 5039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 36 | 47% |
| ara.Shera 0.88 | 25 | 56% |
| maribo.mini.MiniQuester 0.1 | 24 | 42% |
| dsw.StaticD 1.0 | 6 | 83% |
| amz.NanoClone 1.41 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 54 | 33% | 74 |
| maribo.mini.MiniQuester 0.1 | 48 | 30% | 60 |
| ara.Shera 0.88 | 48 | 30% | 58 |
| dsw.StaticD 1.0 | 5 | 3% | 8 |
| amz.NanoClone 1.41 | 3 | 2% | 4 |
| maribo.IotaCT 1.1 | 2 | 1% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 74.2 | 21 / 210 | 3.32 | 15.1% | 26993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 156 |
| hadur117.mini.DeiseH650 0.4 | 2.0 | 15.1% | 21 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.8% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.1% | 1 |
| dummy.micro.Sparrow 2.5 | 5.0 | 10.6% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 9.9% | 2 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 70.5 | 3 / 35 | 4487 |
| 2 | 2 | 62.2 | 68.3 | 1 / 35 | 4345 |
| 3 | 2 | 64.8 | 75.2 | 4 / 35 | 4337 |
| 4 | 2 | 64.3 | 74.6 | 3 / 35 | 4326 |
| 5 | 2 | 65.8 | 76.8 | 7 / 35 | 4689 |
| 6 | 2 | 66.3 | 80.0 | 3 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 74 | 16% |
| brainfade.melee.Dusk 0.44 | 12 | 33% |
| dummy.micro.Sparrow 2.5 | 5 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 189 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 92 | 49% | 101 |
| brainfade.melee.Dusk 0.44 | 36 | 19% | 43 |
| dummy.micro.Sparrow 2.5 | 22 | 12% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 15 | 8% | 16 |
| Krabb.akim2.Akim2 1.1b | 11 | 6% | 12 |
| mz.NanoGod 2.02 | 11 | 6% | 11 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.1 | 88 / 210 | 2.43 | 18.5% | 33282 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 18.5% | 88 |
| stelo.Liblix 0.3.1 | 2.2 | 16.4% | 78 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.6% | 35 |
| wompi.Quokka 1.6 | 4.3 | 10.9% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.0% | 1 |
| disan.Chair 2.2.0 | 5.8 | 8.2% | 2 |
| jwirde.Gort 2.0 | 6.8 | 8.1% | 2 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.2% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.2% | 0 |
| sample.Crazy 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.5 | 15 / 35 | 5565 |
| 2 | 1 | 68.4 | 85.1 | 14 / 35 | 5580 |
| 3 | 1 | 69.2 | 84.8 | 17 / 35 | 5441 |
| 4 | 1 | 68.4 | 82.9 | 15 / 35 | 5403 |
| 5 | 1 | 68.5 | 84.4 | 13 / 35 | 5626 |
| 6 | 1 | 68.5 | 84.1 | 14 / 35 | 5667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 57% |
| tzu.TheArtOfWar 1.2 | 40 | 60% |
| wompi.Quokka 1.6 | 11 | 64% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 86% |
| disan.Chair 2.2.0 | 5 | 100% |
| jwirde.Gort 2.0 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 58 | 47% | 102 |
| tzu.TheArtOfWar 1.2 | 40 | 32% | 65 |
| wompi.Quokka 1.6 | 13 | 10% | 18 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 3% | 7 |
| jwirde.Gort 2.0 | 3 | 2% | 9 |
| disan.Chair 2.2.0 | 2 | 2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.4 | 69 / 210 | 2.31 | 19.4% | 37658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH650 0.4 | 1.0 | 19.4% | 69 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.0% | 108 |
| jje.BagPuss 1.2 | 3.0 | 11.6% | 12 |
| sul.Lunar 1.1 | 5.0 | 10.0% | 8 |
| myl.nano.Graviton 1.10 | 5.3 | 9.6% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 6.0 | 9.0% | 6 |
| fm.claire 1.7 | 6.7 | 8.5% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.3% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.8% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 10 / 35 | 5687 |
| 2 | 1 | 69.0 | 85.7 | 12 / 35 | 6176 |
| 3 | 1 | 69.8 | 88.9 | 10 / 35 | 6351 |
| 4 | 1 | 68.7 | 82.9 | 10 / 35 | 6595 |
| 5 | 1 | 69.8 | 86.0 | 16 / 35 | 6459 |
| 6 | 1 | 69.2 | 85.4 | 11 / 35 | 6390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 86 | 17% |
| sul.Lunar 1.1 | 18 | 94% |
| myl.nano.Graviton 1.10 | 14 | 79% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 75% |
| jje.BagPuss 1.2 | 10 | 70% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 1492. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 51% | 0 |
| jje.BagPuss 1.2 | 23 | 16% | 54 |
| sul.Lunar 1.1 | 15 | 11% | 61 |
| pez.mini.ChironexFleckeri 0.5 | 15 | 11% | 33 |
| myl.nano.Graviton 1.10 | 9 | 6% | 30 |
| fm.claire 1.7 | 5 | 4% | 13 |
| hvilela.HVilela 0.9 | 1 | 1% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeiseH650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.9 | 31 / 210 | 2.90 | 15.6% | 26367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.2% | 89 |
| kc.mini.Mirage 0.2 | 1.7 | 17.0% | 74 |
| hadur117.mini.DeiseH650 0.4 | 3.0 | 15.6% | 31 |
| cx.Princess 1.0 | 4.5 | 10.2% | 12 |
| mz.MicroSheep 1.0 | 4.5 | 10.2% | 3 |
| sadoner.killer 0.2 | 6.0 | 8.9% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.2% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.8% | 0 |
| kurios.DOSexe .9a | 8.7 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 74.9 | 5 / 35 | 4450 |
| 2 | 3 | 64.8 | 77.8 | 6 / 35 | 4566 |
| 3 | 3 | 64.5 | 80.3 | 5 / 35 | 4153 |
| 4 | 3 | 64.2 | 78.7 | 4 / 35 | 4280 |
| 5 | 3 | 64.4 | 79.7 | 4 / 35 | 4436 |
| 6 | 3 | 65.4 | 81.9 | 7 / 35 | 4482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 47 | 36% |
| rsalesc.melee.Medina 0.4.5 | 41 | 15% |
| cx.Princess 1.0 | 5 | 80% |
| mz.MicroSheep 1.0 | 5 | 60% |
| arthord.NanoSatanMelee Beta | 2 | 50% |

Hadur died in 179 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 77 | 43% | 95 |
| rsalesc.melee.Medina 0.4.5 | 69 | 39% | 76 |
| mz.MicroSheep 1.0 | 12 | 7% | 15 |
| cx.Princess 1.0 | 10 | 6% | 11 |
| sadoner.killer 0.2 | 6 | 3% | 7 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 4 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |

