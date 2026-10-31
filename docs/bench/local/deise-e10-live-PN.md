# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 86.9 | 46 / 210 | 2.18 | 17.0% | 29319 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 21.2% | 153 |
| hadur117.mini.DeisePN 0.4 | 2.0 | 17.0% | 46 |
| mz.MicroGodMelee 1 | 3.8 | 10.8% | 4 |
| sgp.JollyNinja 3.53 | 4.2 | 10.8% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.3% | 1 |
| lorneswork.Predator 1.0 | 5.3 | 9.5% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 84.4 | 3 / 35 | 4808 |
| 2 | 2 | 66.9 | 87.3 | 7 / 35 | 4658 |
| 3 | 2 | 67.7 | 89.8 | 10 / 35 | 4820 |
| 4 | 2 | 66.9 | 82.5 | 9 / 35 | 5335 |
| 5 | 2 | 68.0 | 90.5 | 8 / 35 | 5148 |
| 6 | 2 | 66.7 | 87.0 | 9 / 35 | 4550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 138 | 11% |
| sgp.JollyNinja 3.53 | 13 | 85% |
| mz.MicroGodMelee 1 | 12 | 75% |
| lorneswork.Predator 1.0 | 6 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 1285. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 131 | 80% | 149 |
| sgp.JollyNinja 3.53 | 12 | 7% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 10 |
| mz.MicroGodMelee 1 | 6 | 4% | 15 |
| lorneswork.Predator 1.0 | 6 | 4% | 11 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
| adt.Ar2 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.5 | 120 / 210 | 2.30 | 18.3% | 27905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 18.3% | 120 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.0% | 42 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.0% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.8% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.9% | 12 |
| Noran.BitchingElk 0.054 | 7.0 | 7.8% | 4 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.6% | 1 |
| sch.Simone 0.3d | 7.7 | 7.2% | 5 |
| stelo.PatternRobot 1.0 | 8.0 | 7.1% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 80.3 | 17 / 35 | 4434 |
| 2 | 1 | 68.8 | 89.5 | 21 / 35 | 4655 |
| 3 | 1 | 69.4 | 89.2 | 24 / 35 | 5155 |
| 4 | 1 | 67.2 | 83.2 | 22 / 35 | 4560 |
| 5 | 1 | 68.8 | 90.8 | 24 / 35 | 4519 |
| 6 | 1 | 65.2 | 80.0 | 12 / 35 | 4582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 52 | 63% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 80% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 88% |
| stelo.PatternRobot 1.0 | 11 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 80% |
| Noran.BitchingElk 0.054 | 9 | 89% |
| sch.Simone 0.3d | 8 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 32 | 36% | 63 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 21 | 23% | 54 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 16% | 26 |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 10% | 28 |
| Noran.BitchingElk 0.054 | 5 | 6% | 15 |
| stelo.PatternRobot 1.0 | 4 | 4% | 9 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 3 |
| sch.Simone 0.3d | 2 | 2% | 8 |
| fullsail.SweetTea 1.1 | 0 | 0% | 3 |

## Melee bench: F03

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.3 | 150 / 210 | 1.60 | 20.3% | 37130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 20.3% | 150 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.6% | 17 |
| radnor.DoctorBob 1.42 | 3.2 | 13.4% | 12 |
| vuen.Cake 2.51 | 3.3 | 13.0% | 30 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 3 |
| adt.Ar1 2.1 | 6.5 | 7.0% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 93.7 | 24 / 35 | 6198 |
| 2 | 1 | 71.4 | 95.9 | 25 / 35 | 6521 |
| 3 | 1 | 70.3 | 92.4 | 25 / 35 | 5983 |
| 4 | 1 | 71.2 | 95.2 | 28 / 35 | 6288 |
| 5 | 1 | 70.4 | 92.4 | 26 / 35 | 6012 |
| 6 | 1 | 69.9 | 90.2 | 22 / 35 | 6128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 70 | 71% |
| kawigi.nano.Lib 1.0 | 67 | 93% |
| radnor.DoctorBob 1.42 | 30 | 90% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| adt.Ar1 2.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 27 | 42% | 73 |
| kawigi.nano.Lib 1.0 | 16 | 25% | 75 |
| radnor.DoctorBob 1.42 | 12 | 19% | 39 |
| urdos.URDOS 1.3 | 3 | 5% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 3% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |
| adt.Ar1 2.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F04

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.1 | 40 / 210 | 2.16 | 17.5% | 32664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 168 |
| hadur117.mini.DeisePN 0.4 | 2.0 | 17.5% | 40 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 10.4% | 1 |
| josago.Jorgito 0.16 | 5.2 | 8.7% | 1 |
| tj.zombie1n 1.0.1 | 6.3 | 6.9% | 0 |
| css.Delitioner 0.11 | 7.0 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 87.3 | 6 / 35 | 5428 |
| 2 | 2 | 66.0 | 81.9 | 5 / 35 | 4880 |
| 3 | 2 | 69.6 | 90.8 | 9 / 35 | 5977 |
| 4 | 2 | 68.1 | 87.3 | 10 / 35 | 5416 |
| 5 | 2 | 67.8 | 87.0 | 4 / 35 | 5452 |
| 6 | 2 | 68.2 | 88.3 | 6 / 35 | 5511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 166 | 20% |
| TNT.TNT 0.99.1 | 3 | 67% |
| apc.LeeroyJenkins2 1.0 | 3 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 1528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 146 | 84% | 179 |
| apc.LeeroyJenkins2 1.0 | 14 | 8% | 18 |
| css.Delitioner 0.11 | 3 | 2% | 4 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| TNT.TNT 0.99.1 | 2 | 1% | 3 |
| josago.Jorgito 0.16 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 74.8 | 35 / 210 | 3.27 | 14.0% | 19805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.4% | 106 |
| justin.DemonicRage 3.4 | 1.8 | 17.1% | 52 |
| hadur117.mini.DeisePN 0.4 | 3.2 | 14.0% | 35 |
| wompi.Numbat 2.1 | 3.8 | 12.7% | 10 |
| ms.Ares 0.19 | 5.2 | 9.3% | 3 |
| axeBots.HataMoto 3.09 | 5.8 | 8.7% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.2 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 8.8 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 73.0 | 5 / 35 | 3274 |
| 2 | 3 | 62.9 | 74.9 | 8 / 35 | 3427 |
| 3 | 3 | 63.8 | 78.7 | 8 / 35 | 3452 |
| 4 | 3 | 63.3 | 78.4 | 6 / 35 | 3316 |
| 5 | 4 | 59.5 | 69.2 | 3 / 35 | 3145 |
| 6 | 3 | 61.5 | 74.3 | 5 / 35 | 3191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 38 | 29% |
| justin.DemonicRage 3.4 | 32 | 47% |
| wompi.Numbat 2.1 | 7 | 100% |
| ms.Ares 0.19 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 62 | 35% | 74 |
| justin.DemonicRage 3.4 | 53 | 30% | 65 |
| wompi.Numbat 2.1 | 30 | 17% | 37 |
| ms.Ares 0.19 | 9 | 5% | 11 |
| axeBots.HataMoto 3.09 | 9 | 5% | 10 |
| supersample.SuperBoxBot 1.0 | 6 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.8 | 112 / 210 | 2.46 | 17.7% | 27643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 17.7% | 112 |
| jekl.StoneGhost 0.7 | 2.3 | 14.3% | 28 |
| origin.SleepSiphon 1.7b | 3.0 | 13.6% | 37 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.6% | 23 |
| mld.Wisdom 1.0 | 5.0 | 11.0% | 3 |
| gg.Wolverine 2.0 | 6.2 | 8.7% | 5 |
| spinnercat.Omen 1.0 | 6.8 | 7.1% | 1 |
| DBall.NUKE 0.1 | 8.5 | 5.9% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.0% | 2 |
| sample.Fire 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.2 | 18 / 35 | 4385 |
| 2 | 1 | 66.3 | 80.0 | 18 / 35 | 4574 |
| 3 | 1 | 67.3 | 84.1 | 19 / 35 | 4517 |
| 4 | 1 | 66.8 | 82.9 | 19 / 35 | 4436 |
| 5 | 1 | 68.9 | 87.6 | 21 / 35 | 5119 |
| 6 | 1 | 67.2 | 85.1 | 17 / 35 | 4612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 47 | 79% |
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 78% |
| jekl.StoneGhost 0.7 | 34 | 88% |
| gg.Wolverine 2.0 | 11 | 73% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| mld.Wisdom 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 27 | 26% | 67 |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 25% | 45 |
| jekl.StoneGhost 0.7 | 24 | 24% | 54 |
| mld.Wisdom 1.0 | 13 | 13% | 18 |
| gg.Wolverine 2.0 | 6 | 6% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 9 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
| sample.Fire 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.8 | 132 / 210 | 1.56 | 20.1% | 34134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 20.1% | 132 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.1% | 49 |
| rtk.Tachikoma 1.0 | 2.7 | 16.7% | 22 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.4% | 5 |
| franzor.Lizt 1.3.1 | 4.8 | 10.0% | 2 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.7% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.3 | 24 / 35 | 5740 |
| 2 | 1 | 72.3 | 94.9 | 23 / 35 | 6080 |
| 3 | 1 | 71.3 | 92.7 | 22 / 35 | 5523 |
| 4 | 1 | 71.5 | 92.4 | 19 / 35 | 5977 |
| 5 | 1 | 70.2 | 92.4 | 17 / 35 | 5300 |
| 6 | 1 | 72.2 | 95.9 | 27 / 35 | 5514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 97 | 85% |
| rsalesc.melee.Monk 0.3.6c | 49 | 24% |
| oog.melee.CapuletDroid 1.1 | 34 | 85% |
| franzor.Lizt 1.3.1 | 6 | 100% |
| skm.PateranBotlock2 1.0 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 44 | 56% | 64 |
| rtk.Tachikoma 1.0 | 24 | 31% | 107 |
| oog.melee.CapuletDroid 1.1 | 7 | 9% | 32 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 1 |
| franzor.Lizt 1.3.1 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 92.4 | 144 / 210 | 1.68 | 19.9% | 30694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.9% | 144 |
| shrub.Vapour v159 | 2.7 | 12.1% | 20 |
| tm.Yuugao 1.0 | 3.0 | 12.3% | 29 |
| Krabb.sliNk.Garm 0.9u | 3.3 | 11.3% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.0% | 2 |
| m3thos.Eva00 1.1 | 6.5 | 8.3% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.3% | 3 |
| zyx.nano.BacillusComma 1.0 | 8.7 | 6.5% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.3% | 0 |
| SHAM.WOW 1.4 | 9.3 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 93.3 | 25 / 35 | 5242 |
| 2 | 1 | 69.4 | 92.1 | 26 / 35 | 4886 |
| 3 | 1 | 69.3 | 93.0 | 24 / 35 | 4813 |
| 4 | 1 | 69.6 | 91.4 | 22 / 35 | 5438 |
| 5 | 1 | 70.0 | 93.0 | 24 / 35 | 5328 |
| 6 | 1 | 69.3 | 91.7 | 23 / 35 | 4987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 54 | 78% |
| shrub.Vapour v159 | 36 | 81% |
| Krabb.sliNk.Garm 0.9u | 35 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 94% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 88% |
| m3thos.Eva00 1.1 | 8 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 24 | 35% | 73 |
| Krabb.sliNk.Garm 0.9u | 16 | 24% | 39 |
| shrub.Vapour v159 | 14 | 21% | 45 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 7% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 6% | 20 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 2 |
| m3thos.Eva00 1.1 | 1 | 1% | 7 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.2 | 77 / 210 | 2.87 | 16.3% | 24680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.5 | 16.3% | 77 |
| positive.Portia 1.26e | 1.5 | 16.6% | 84 |
| kc.micro.Figment 1.0 | 3.0 | 13.4% | 14 |
| yagami.Tidus 0.11 | 4.5 | 10.9% | 3 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.4% | 17 |
| mc2.enemy.Original 0.9 | 5.3 | 10.0% | 12 |
| dft.Calliope 5.6 | 7.2 | 7.3% | 2 |
| robar.nano.Assertive_Melee 0.2 | 8.5 | 5.3% | 0 |
| step.nanoPri 1.0 | 8.5 | 5.5% | 1 |
| rdm.Dueler 0.4x | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 80.6 | 14 / 35 | 3998 |
| 2 | 1 | 65.9 | 81.3 | 11 / 35 | 4544 |
| 3 | 2 | 63.9 | 77.8 | 10 / 35 | 3840 |
| 4 | 1 | 66.3 | 83.5 | 17 / 35 | 4208 |
| 5 | 2 | 65.1 | 77.1 | 14 / 35 | 3944 |
| 6 | 2 | 64.3 | 74.9 | 11 / 35 | 4146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 55 | 35% |
| kc.micro.Figment 1.0 | 36 | 86% |
| yagami.Tidus 0.11 | 13 | 100% |
| pedersen.Grishnakh 1.0 | 9 | 67% |
| mc2.enemy.Original 0.9 | 6 | 67% |
| dft.Calliope 5.6 | 5 | 60% |
| step.nanoPri 1.0 | 1 | 0% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 62 | 47% | 86 |
| kc.micro.Figment 1.0 | 25 | 19% | 53 |
| mc2.enemy.Original 0.9 | 12 | 9% | 14 |
| yagami.Tidus 0.11 | 11 | 8% | 24 |
| pedersen.Grishnakh 1.0 | 9 | 7% | 15 |
| robar.nano.Assertive_Melee 0.2 | 6 | 5% | 6 |
| dft.Calliope 5.6 | 4 | 3% | 7 |
| step.nanoPri 1.0 | 4 | 3% | 5 |

## Melee bench: F10

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 95.3 | 169 / 210 | 1.42 | 20.4% | 32598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 20.4% | 169 |
| DTF.Kludgy 1.2b | 2.2 | 13.9% | 17 |
| ejb.Polaris 1.0.1 | 3.3 | 12.4% | 9 |
| ne.Chimera 1.2 | 3.5 | 12.1% | 8 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.2% | 2 |
| vStar.RAFzilla 2.15 | 5.7 | 9.7% | 4 |
| sam.Samspin 1.0 | 7.2 | 6.0% | 0 |
| kurios.DOSexe .9b | 8.8 | 5.1% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.3 | 28 / 35 | 5236 |
| 2 | 1 | 72.0 | 97.8 | 33 / 35 | 5892 |
| 3 | 1 | 70.5 | 95.6 | 29 / 35 | 5104 |
| 4 | 1 | 69.9 | 94.0 | 24 / 35 | 5329 |
| 5 | 1 | 69.6 | 92.7 | 26 / 35 | 5176 |
| 6 | 1 | 71.5 | 97.8 | 29 / 35 | 5861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 57 | 86% |
| ejb.Polaris 1.0.1 | 52 | 94% |
| ne.Chimera 1.2 | 35 | 89% |
| vStar.RAFzilla 2.15 | 18 | 83% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| donjezza.Muncho 1.0 | 8 | 88% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 18 | 44% | 65 |
| ejb.Polaris 1.0.1 | 8 | 20% | 58 |
| ne.Chimera 1.2 | 6 | 15% | 33 |
| tvv.micro.Antares 1.1.1 | 4 | 10% | 15 |
| vStar.RAFzilla 2.15 | 2 | 5% | 12 |
| donjezza.Muncho 1.0 | 2 | 5% | 7 |
| kurios.DOSexe .9b | 1 | 2% | 9 |
| sam.Samspin 1.0 | 0 | 0% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.1 | 109 / 210 | 2.43 | 17.6% | 25960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.3 | 17.6% | 109 |
| rz.Aleph 0.34 | 1.7 | 16.1% | 54 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 23 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 8 |
| rdt199.Warlord 0.73 | 5.7 | 8.5% | 6 |
| br2.MobyDickBot 1.6 | 5.8 | 8.8% | 3 |
| uji.YellohFellah 1.0 | 6.7 | 8.3% | 7 |
| KiraNL.Chupacabra 0.4 | 7.8 | 6.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.6 | 18 / 35 | 4317 |
| 2 | 2 | 64.9 | 78.4 | 18 / 35 | 4002 |
| 3 | 2 | 66.1 | 82.9 | 14 / 35 | 4213 |
| 4 | 1 | 67.6 | 84.4 | 20 / 35 | 4665 |
| 5 | 1 | 67.8 | 88.3 | 20 / 35 | 4382 |
| 6 | 1 | 66.5 | 82.9 | 19 / 35 | 4381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 61 | 66% |
| cx.mini.Nimrod 0.55 | 21 | 90% |
| uji.YellohFellah 1.0 | 20 | 85% |
| djc.DynaBot 0.1.1 | 18 | 89% |
| rdt199.Warlord 0.73 | 10 | 100% |
| br2.MobyDickBot 1.6 | 8 | 88% |

Hadur died in 101 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 47 | 47% | 92 |
| cx.mini.Nimrod 0.55 | 24 | 24% | 38 |
| djc.DynaBot 0.1.1 | 8 | 8% | 17 |
| KiraNL.Chupacabra 0.4 | 8 | 8% | 10 |
| uji.YellohFellah 1.0 | 6 | 6% | 23 |
| rdt199.Warlord 0.73 | 4 | 4% | 18 |
| br2.MobyDickBot 1.6 | 2 | 2% | 10 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F12

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.2 | 122 / 210 | 2.42 | 17.6% | 23878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 17.6% | 122 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.7% | 23 |
| nat.PallasHawk 1.0 | 2.8 | 13.2% | 32 |
| darkcanuck.Leon 1.01 | 4.0 | 12.2% | 18 |
| brainfade.melee.Genghis 0.36 | 4.7 | 10.2% | 9 |
| jrm.Test0 1.0 | 6.2 | 8.8% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.4% | 1 |
| jp.Perpy 16.0 | 7.8 | 6.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.5% | 4 |
| stuff.Vlad 0.1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 76.8 | 18 / 35 | 3668 |
| 2 | 1 | 66.3 | 82.5 | 20 / 35 | 3958 |
| 3 | 1 | 67.3 | 85.4 | 19 / 35 | 4222 |
| 4 | 1 | 67.7 | 86.3 | 21 / 35 | 4166 |
| 5 | 1 | 66.0 | 83.5 | 20 / 35 | 3821 |
| 6 | 1 | 68.9 | 90.5 | 24 / 35 | 4043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 50 | 78% |
| bts.wiki.RipCurl 0.9b | 36 | 81% |
| darkcanuck.Leon 1.01 | 33 | 82% |
| brainfade.melee.Genghis 0.36 | 15 | 93% |
| cs.sheldor.Talon 1.1 | 6 | 83% |
| jaybot.bots.Oddball 4.0 | 5 | 80% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 28 | 31% | 49 |
| nat.PallasHawk 1.0 | 21 | 23% | 49 |
| darkcanuck.Leon 1.01 | 17 | 19% | 56 |
| brainfade.melee.Genghis 0.36 | 8 | 9% | 18 |
| jrm.Test0 1.0 | 6 | 7% | 17 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 9 |
| jp.Perpy 16.0 | 2 | 2% | 3 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |

## Melee bench: F13

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 86.9 | 91 / 210 | 2.18 | 17.0% | 24678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.7 | 17.0% | 91 |
| mn.Combat 3.25.0 | 2.0 | 16.7% | 76 |
| ags.Glacier 0.2.11 | 2.3 | 16.2% | 29 |
| shinh.Entangled 0.3 | 4.2 | 11.6% | 9 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.1% | 6 |
| apc.Colossus2 0.17 | 6.3 | 7.6% | 0 |
| stelo.Wang 1.0 | 6.7 | 6.7% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 88.6 | 16 / 35 | 4487 |
| 2 | 2 | 66.6 | 84.8 | 13 / 35 | 4339 |
| 3 | 1 | 67.5 | 91.1 | 22 / 35 | 3638 |
| 4 | 3 | 65.0 | 80.0 | 8 / 35 | 4248 |
| 5 | 1 | 67.0 | 88.6 | 19 / 35 | 3906 |
| 6 | 2 | 67.1 | 88.6 | 13 / 35 | 4060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 67 | 46% |
| ags.Glacier 0.2.11 | 50 | 80% |
| shinh.Entangled 0.3 | 13 | 77% |
| gh.micro.Gruweltje 0.7 | 11 | 73% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 58 | 48% | 87 |
| ags.Glacier 0.2.11 | 27 | 22% | 66 |
| shinh.Entangled 0.3 | 15 | 12% | 26 |
| gh.micro.Gruweltje 0.7 | 10 | 8% | 19 |
| stelo.Wang 1.0 | 5 | 4% | 7 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 94.1 | 158 / 210 | 1.53 | 20.4% | 33300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 20.4% | 158 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 25 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 20 |
| sanyi.mikrobi.Roberto 1.0 | 4.7 | 9.8% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.9% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.1% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 7.2 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.6% | 4 |
| pa.Improved 1.0 | 9.0 | 5.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 96.2 | 29 / 35 | 5574 |
| 2 | 1 | 69.4 | 89.2 | 22 / 35 | 5323 |
| 3 | 1 | 70.9 | 96.2 | 25 / 35 | 5357 |
| 4 | 1 | 70.8 | 94.0 | 27 / 35 | 5630 |
| 5 | 1 | 71.3 | 93.3 | 28 / 35 | 5877 |
| 6 | 1 | 71.3 | 95.6 | 27 / 35 | 5539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 93 | 91% |
| catcat20.shape.Theta 0.018 | 58 | 76% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 24 | 46% | 108 |
| catcat20.shape.Theta 0.018 | 19 | 37% | 54 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 6% | 12 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 6% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 16 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.7 | 109 / 210 | 2.47 | 18.1% | 30334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 18.1% | 109 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 19 |
| emp.Yngwie 1.11 | 3.0 | 13.0% | 42 |
| mld.DustBunny 3.8 | 4.2 | 12.0% | 9 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.9% | 14 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.1% | 17 |
| lambdaxy.TBot 0.1 | 7.3 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.6% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.1 | 19 / 35 | 5297 |
| 2 | 1 | 66.8 | 82.2 | 17 / 35 | 4991 |
| 3 | 1 | 67.9 | 84.1 | 16 / 35 | 5341 |
| 4 | 1 | 65.8 | 78.7 | 16 / 35 | 4680 |
| 5 | 1 | 68.2 | 84.8 | 20 / 35 | 5154 |
| 6 | 1 | 68.8 | 88.3 | 21 / 35 | 4871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 51 | 71% |
| kawigi.micro.Shiz 1.1 | 31 | 94% |
| cb.nano.Insomnia 1.0 | 24 | 71% |
| kawigi.robot.Girl 1.2 | 16 | 88% |
| mld.DustBunny 3.8 | 9 | 100% |
| divineomega.TrialBot 0.003 | 4 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 31 | 31% | 83 |
| cb.nano.Insomnia 1.0 | 23 | 23% | 18 |
| mld.DustBunny 3.8 | 17 | 17% | 42 |
| kawigi.micro.Shiz 1.1 | 13 | 13% | 37 |
| kawigi.robot.Girl 1.2 | 10 | 10% | 17 |
| lambdaxy.TBot 0.1 | 3 | 3% | 5 |
| divineomega.TrialBot 0.003 | 2 | 2% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 2 |

## Melee bench: F16

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.6 | 109 / 210 | 2.20 | 18.9% | 33191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 18.9% | 109 |
| gh.Griezel 0.5.2 | 2.0 | 16.4% | 63 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.2% | 22 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.5% | 4 |
| tvv.nano.Polaris 1.2 | 5.8 | 9.1% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 8.2% | 3 |
| asd.Cthulhu 1.3 | 8.5 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.7% | 1 |
| repositorio.NanoStep 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.1 | 19 / 35 | 5566 |
| 2 | 1 | 68.8 | 87.6 | 17 / 35 | 5659 |
| 3 | 1 | 70.7 | 90.2 | 22 / 35 | 5868 |
| 4 | 1 | 68.4 | 84.8 | 19 / 35 | 5198 |
| 5 | 1 | 70.3 | 91.4 | 20 / 35 | 5672 |
| 6 | 1 | 66.4 | 80.6 | 12 / 35 | 5228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 85 | 59% |
| techdude.forest.FlamingForest 1.1 | 25 | 68% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 95% |
| stelo.IntrinsicVolatility 1.4 | 10 | 100% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1225. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 55 | 53% | 104 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 12% | 31 |
| techdude.forest.FlamingForest 1.1 | 10 | 10% | 27 |
| bvh.fnr.Fenrir 0.36l | 10 | 10% | 14 |
| stelo.IntrinsicVolatility 1.4 | 4 | 4% | 13 |
| divineomega.DivineBot 1.9.4.5 | 4 | 4% | 12 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 4 |
| asd.Cthulhu 1.3 | 2 | 2% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.7 | 100 / 210 | 2.47 | 17.7% | 28962 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 17.7% | 100 |
| cx.BlestPain 1.41 | 3.0 | 12.7% | 42 |
| et.Predator 1.8 | 3.0 | 12.8% | 16 |
| oog.melee.Mercutio 1.0 | 3.8 | 12.4% | 34 |
| nic.Nicator 2.4 | 4.2 | 12.0% | 14 |
| ahf.NanoAndrew .4 | 6.2 | 10.4% | 4 |
| maribo.melee.BMV 0.1 | 6.8 | 8.9% | 0 |
| tex.Longbot 0.4 | 8.3 | 5.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.3 | 17 / 35 | 5057 |
| 2 | 1 | 66.6 | 81.9 | 14 / 35 | 4805 |
| 3 | 1 | 66.3 | 83.2 | 13 / 35 | 4597 |
| 4 | 1 | 67.8 | 84.8 | 18 / 35 | 4988 |
| 5 | 1 | 68.3 | 87.9 | 21 / 35 | 4660 |
| 6 | 1 | 67.5 | 82.9 | 17 / 35 | 4855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 42 | 83% |
| oog.melee.Mercutio 1.0 | 34 | 74% |
| cx.BlestPain 1.41 | 34 | 32% |
| nic.Nicator 2.4 | 25 | 68% |
| ahf.NanoAndrew .4 | 11 | 100% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1079. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 32 | 29% | 50 |
| nic.Nicator 2.4 | 23 | 21% | 42 |
| et.Predator 1.8 | 18 | 16% | 48 |
| oog.melee.Mercutio 1.0 | 15 | 14% | 40 |
| ahf.NanoAndrew .4 | 11 | 10% | 16 |
| maribo.melee.BMV 0.1 | 7 | 6% | 8 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |

## Melee bench: F18

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.5 | 126 / 210 | 2.04 | 18.6% | 27186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 18.6% | 126 |
| morbid.MorbidPriest 1.0 | 2.5 | 13.4% | 28 |
| agd.Mooserwirt2 2.7 | 3.3 | 12.3% | 26 |
| uji.DBH 1.1 | 3.5 | 11.5% | 12 |
| ratosh.Nobo 0.21 | 5.2 | 9.9% | 2 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.2% | 4 |
| sigterm.Sigterm 1.0 | 7.3 | 7.4% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 6.9% | 1 |
| stelo.WangRobot 1.0 | 9.0 | 5.7% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.6 | 22 / 35 | 4550 |
| 2 | 1 | 67.1 | 83.8 | 19 / 35 | 4576 |
| 3 | 1 | 67.8 | 89.2 | 21 / 35 | 4257 |
| 4 | 1 | 66.2 | 83.8 | 17 / 35 | 4396 |
| 5 | 1 | 68.6 | 89.8 | 20 / 35 | 4638 |
| 6 | 1 | 70.1 | 95.6 | 27 / 35 | 4769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 51 | 82% |
| agd.Mooserwirt2 2.7 | 35 | 60% |
| uji.DBH 1.1 | 28 | 79% |
| stelo.WangRobot 1.0 | 14 | 71% |
| ratosh.Nobo 0.21 | 13 | 92% |
| sigterm.Sigterm 1.0 | 11 | 82% |
| spinnercat.Robovirus 2.718 | 8 | 75% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 26 | 30% | 76 |
| agd.Mooserwirt2 2.7 | 21 | 24% | 45 |
| uji.DBH 1.1 | 11 | 13% | 23 |
| ratosh.Nobo 0.21 | 10 | 12% | 16 |
| stelo.WangRobot 1.0 | 5 | 6% | 14 |
| sigterm.Sigterm 1.0 | 5 | 6% | 12 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 0 | 0% | 10 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.4 | 173 / 210 | 1.41 | 21.1% | 34236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 21.1% | 173 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.5% | 10 |
| mld.Infinity 2.2 | 2.7 | 13.9% | 20 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 10.7% | 2 |
| erdnis.Rover 0.3 | 5.0 | 10.0% | 1 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.0% | 2 |
| pac.ABC 2.1 | 7.3 | 7.1% | 1 |
| mbh.Mbh 0.1 | 8.0 | 6.8% | 0 |
| pbg.R2D2 1.0 | 8.7 | 6.0% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 95.6 | 30 / 35 | 5834 |
| 2 | 1 | 72.7 | 97.8 | 31 / 35 | 6020 |
| 3 | 1 | 72.5 | 97.5 | 31 / 35 | 5644 |
| 4 | 1 | 71.5 | 94.6 | 29 / 35 | 5352 |
| 5 | 1 | 71.8 | 94.3 | 27 / 35 | 5831 |
| 6 | 1 | 71.2 | 93.0 | 25 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 97% |
| mld.Infinity 2.2 | 61 | 85% |
| krillr.mini.JointStrike 2.0.0 | 16 | 94% |
| pac.ABC 2.1 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| erdnis.Rover 0.3 | 5 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 1164. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 37% | 111 |
| mld.Infinity 2.2 | 11 | 29% | 18 |
| krillr.mini.JointStrike 2.0.0 | 8 | 21% | 29 |
| erdnis.Rover 0.3 | 2 | 5% | 17 |
| pbg.R2D2 1.0 | 1 | 3% | 11 |
| patson.PatsonTestBot 1.0 | 1 | 3% | 9 |
| mbh.Mbh 0.1 | 1 | 3% | 6 |
| pac.ABC 2.1 | 0 | 0% | 7 |

## Melee bench: F20

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.4 | 136 / 210 | 1.95 | 19.6% | 32308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.6% | 136 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 32 |
| fwb.Nine 1.0.1 | 3.8 | 10.8% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.7% | 3 |
| catcat20.Rabbit 0.001 | 4.3 | 10.7% | 16 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.7% | 2 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.8% | 4 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.3% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 93.0 | 20 / 35 | 5670 |
| 2 | 1 | 69.4 | 89.5 | 24 / 35 | 5228 |
| 3 | 1 | 70.4 | 91.7 | 25 / 35 | 5735 |
| 4 | 1 | 69.5 | 88.6 | 24 / 35 | 5365 |
| 5 | 1 | 70.5 | 92.4 | 26 / 35 | 5534 |
| 6 | 1 | 66.5 | 81.3 | 17 / 35 | 4776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 83 | 78% |
| fwb.Nine 1.0.1 | 36 | 81% |
| catcat20.Rabbit 0.001 | 31 | 71% |
| bayen.nut.Squirrel 1.615 | 8 | 88% |
| nz.jdc.nano.GridFu 1.0 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 1117. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 31 | 41% | 88 |
| catcat20.Rabbit 0.001 | 16 | 21% | 37 |
| fwb.Nine 1.0.1 | 13 | 17% | 11 |
| nz.jdc.nano.GridFu 1.0 | 6 | 8% | 25 |
| bayen.nut.Squirrel 1.615 | 4 | 5% | 27 |
| m3thos.mini.Eva01 0.5.5 | 3 | 4% | 7 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.0 | 141 / 210 | 1.63 | 20.4% | 33808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 20.4% | 141 |
| eem.EvBot v4.6.16 | 2.0 | 16.3% | 56 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.0% | 1 |
| eld.Hmm 1.0 | 5.3 | 8.4% | 8 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.8% | 1 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.4 | 23 / 35 | 5267 |
| 2 | 1 | 70.4 | 90.8 | 22 / 35 | 5752 |
| 3 | 1 | 69.9 | 91.1 | 21 / 35 | 5311 |
| 4 | 1 | 73.1 | 96.2 | 29 / 35 | 6299 |
| 5 | 1 | 71.8 | 95.2 | 25 / 35 | 5565 |
| 6 | 1 | 70.4 | 92.1 | 21 / 35 | 5614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 110 | 68% |
| dummy.mini.Scimitar 1.01 | 39 | 100% |
| cf.RiO.RiOx 4.2.1 | 13 | 100% |
| eld.Hmm 1.0 | 12 | 83% |
| el.JumpShoot 0.2 | 3 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 43 | 61% | 91 |
| dummy.mini.Scimitar 1.01 | 17 | 24% | 73 |
| eld.Hmm 1.0 | 4 | 6% | 22 |
| cf.RiO.RiOx 4.2.1 | 3 | 4% | 16 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 6 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.0 | 109 / 210 | 2.08 | 18.5% | 30357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.2 | 18.5% | 109 |
| pe.SandboxDT 2.71m | 2.2 | 15.7% | 56 |
| kvk.HebusLeTroll 0.35 | 2.7 | 14.9% | 21 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.9% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 7 |
| yk.JahRoslav 1.1 | 6.7 | 6.8% | 0 |
| gg.Squaraus 0.6 | 7.0 | 6.5% | 0 |
| tad.Dalek98 0.98 | 7.7 | 6.3% | 1 |
| pbg.NinjaX 1.2 | 8.7 | 5.1% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.3 | 20 / 35 | 5242 |
| 2 | 1 | 68.8 | 89.5 | 19 / 35 | 5036 |
| 3 | 1 | 70.0 | 90.5 | 25 / 35 | 5108 |
| 4 | 2 | 67.5 | 83.5 | 12 / 35 | 4950 |
| 5 | 1 | 69.1 | 90.5 | 18 / 35 | 5071 |
| 6 | 1 | 68.1 | 86.7 | 15 / 35 | 4950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 50 | 84% |
| pe.SandboxDT 2.71m | 44 | 39% |
| jlm.javaDisturbance 0.59 | 40 | 85% |
| bigpete.Stewie 1.0 | 11 | 91% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 38 | 37% | 61 |
| jlm.javaDisturbance 0.59 | 26 | 25% | 60 |
| kvk.HebusLeTroll 0.35 | 26 | 25% | 56 |
| bigpete.Stewie 1.0 | 5 | 5% | 19 |
| pbg.NinjaX 1.2 | 2 | 2% | 5 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |
| tad.Dalek98 0.98 | 2 | 2% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.2 | 137 / 210 | 1.70 | 19.5% | 29024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.5% | 137 |
| pe.SandboxLump 1.52 | 2.0 | 17.2% | 52 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.7% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 8.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.2% | 4 |
| cw.megas.Blade 0.8 | 7.0 | 8.0% | 0 |
| sample.Walls 1.0 | 7.5 | 7.6% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.0 | 28 / 35 | 4862 |
| 2 | 1 | 70.6 | 91.4 | 22 / 35 | 5083 |
| 3 | 1 | 70.7 | 94.0 | 23 / 35 | 4631 |
| 4 | 1 | 70.2 | 91.7 | 22 / 35 | 4546 |
| 5 | 1 | 69.7 | 90.8 | 18 / 35 | 4797 |
| 6 | 1 | 70.5 | 91.4 | 24 / 35 | 5105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 101 | 65% |
| cre.Karolos 0.32 | 45 | 84% |
| stelo.AreaTargetingBot 1.1 | 18 | 94% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| sample.Walls 1.0 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 44 | 59% | 115 |
| cre.Karolos 0.32 | 16 | 22% | 52 |
| stelo.AreaTargetingBot 1.1 | 8 | 11% | 18 |
| stelo.RamTrackSurfer 1.2 | 4 | 5% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 3 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
| sample.Walls 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F24

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.9 | 84 / 210 | 2.80 | 16.1% | 23193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 16.1% | 84 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.8% | 34 |
| florent.XSeries.X2 0.12 | 3.5 | 12.6% | 25 |
| davidalves.Phoenix 0.54 | 3.8 | 12.4% | 32 |
| pedersen.Ugluk 1.1.1 | 4.3 | 12.2% | 27 |
| oog.melee.Corsair 1.0 | 6.2 | 9.0% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.6% | 8 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.8% | 0 |
| evd.X1 0.01 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 82.5 | 14 / 35 | 3970 |
| 2 | 1 | 64.8 | 81.3 | 15 / 35 | 3760 |
| 3 | 1 | 64.9 | 81.0 | 12 / 35 | 3998 |
| 4 | 1 | 62.1 | 71.7 | 13 / 35 | 3656 |
| 5 | 1 | 64.0 | 78.7 | 13 / 35 | 3716 |
| 6 | 1 | 66.4 | 84.4 | 17 / 35 | 4093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 28 | 71% |
| florent.XSeries.X2 0.12 | 21 | 71% |
| pedersen.Ugluk 1.1.1 | 19 | 58% |
| davidalves.Phoenix 0.54 | 19 | 84% |
| stelo.SoJNanoMelee 1.1 | 19 | 89% |
| lunchie.Lunchbox 0.93 | 3 | 100% |
| oog.melee.Corsair 1.0 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 28 | 22% | 47 |
| davidalves.Phoenix 0.54 | 27 | 21% | 41 |
| rz.GlowBlowMelee 1.4 | 25 | 20% | 52 |
| pedersen.Ugluk 1.1.1 | 23 | 18% | 29 |
| stelo.SoJNanoMelee 1.1 | 11 | 9% | 19 |
| oog.melee.Corsair 1.0 | 6 | 5% | 10 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 6 |
| evd.X1 0.01 | 2 | 2% | 3 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.4 | 148 / 210 | 2.05 | 19.2% | 26827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.2% | 148 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 13.5% | 21 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.8% | 12 |
| jdw.Hurricane 1.4 | 4.0 | 11.4% | 12 |
| ds.Oo 2.2 | 5.5 | 8.9% | 6 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 8.9% | 6 |
| awesomeness.Elite 1.0 | 7.5 | 7.3% | 4 |
| adt.Ar2 1.1 | 8.0 | 6.8% | 1 |
| gjr.Cephalosporin 0.1 | 8.0 | 6.9% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.1 | 25 / 35 | 4133 |
| 2 | 1 | 68.7 | 87.0 | 22 / 35 | 4640 |
| 3 | 1 | 70.5 | 92.4 | 29 / 35 | 4762 |
| 4 | 1 | 68.1 | 87.6 | 23 / 35 | 4275 |
| 5 | 1 | 69.1 | 87.6 | 26 / 35 | 4763 |
| 6 | 1 | 67.4 | 84.4 | 23 / 35 | 4254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 90% |
| voidious.micro.BlitzBat 1.05 | 48 | 94% |
| jdw.Hurricane 1.4 | 29 | 93% |
| gjr.Cephalosporin 0.1 | 9 | 100% |
| awesomeness.Elite 1.0 | 9 | 78% |
| ds.Oo 2.2 | 7 | 100% |
| adt.Ar2 1.1 | 5 | 80% |
| gre.svman4.Morfeas 1.4.1 | 5 | 40% |

Hadur died in 62 of 210 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 17 | 27% | 60 |
| jdw.Hurricane 1.4 | 14 | 23% | 33 |
| voidious.mini.BrokenSword 2.0.3 | 12 | 19% | 53 |
| awesomeness.Elite 1.0 | 6 | 10% | 12 |
| gre.svman4.Morfeas 1.4.1 | 5 | 8% | 13 |
| adt.Ar2 1.1 | 5 | 8% | 9 |
| ds.Oo 2.2 | 2 | 3% | 16 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 11 |

## Melee bench: F26

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.6 | 144 / 210 | 1.75 | 19.8% | 33796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.8% | 144 |
| ak.Fermat 2.0 | 2.3 | 14.0% | 26 |
| shu.nitro.LENIN .T34 | 3.5 | 12.2% | 27 |
| lrem.Spectre 0.4.4 | 3.5 | 11.9% | 9 |
| js.PinBall 1.6 | 5.0 | 10.7% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.3% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 9.0% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.9% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.4 | 25 / 35 | 5467 |
| 2 | 1 | 70.8 | 91.4 | 26 / 35 | 5936 |
| 3 | 1 | 71.4 | 95.2 | 29 / 35 | 5823 |
| 4 | 1 | 70.6 | 92.4 | 22 / 35 | 5969 |
| 5 | 1 | 69.7 | 91.7 | 19 / 35 | 5490 |
| 6 | 1 | 69.1 | 87.6 | 23 / 35 | 5111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 46 | 93% |
| ak.Fermat 2.0 | 43 | 86% |
| shu.nitro.LENIN .T34 | 41 | 71% |
| js.PinBall 1.6 | 15 | 87% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 100% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 26 | 38% | 64 |
| ak.Fermat 2.0 | 21 | 31% | 57 |
| lrem.Spectre 0.4.4 | 10 | 15% | 40 |
| js.PinBall 1.6 | 6 | 9% | 17 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 3% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 1% | 12 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.3 | 135 / 210 | 2.14 | 18.3% | 25533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 18.3% | 135 |
| mk.Alpha 0.2.1 | 2.0 | 15.0% | 45 |
| EH.Eagle 1.0.6 | 3.3 | 11.5% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 4.8 | 10.3% | 4 |
| wee.Gem 1.8.4 | 5.2 | 10.0% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 8.5% | 1 |
| throxbot.ThroxBot 0.1 | 7.0 | 7.7% | 2 |
| joe.ADinosaur 1.0 | 7.3 | 7.7% | 2 |
| caimano.Furia_Ceca 0.22 | 8.3 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.2 | 24 / 35 | 4498 |
| 2 | 1 | 66.2 | 85.1 | 20 / 35 | 3836 |
| 3 | 1 | 68.7 | 89.2 | 23 / 35 | 4608 |
| 4 | 1 | 68.0 | 87.0 | 24 / 35 | 4214 |
| 5 | 1 | 68.0 | 87.6 | 24 / 35 | 4305 |
| 6 | 1 | 66.4 | 84.8 | 20 / 35 | 4072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 84 | 82% |
| wee.Gem 1.8.4 | 27 | 78% |
| EH.Eagle 1.0.6 | 16 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 35 | 45% | 110 |
| wee.Gem 1.8.4 | 12 | 16% | 31 |
| joe.ADinosaur 1.0 | 8 | 10% | 12 |
| caimano.Furia_Ceca 0.22 | 5 | 6% | 7 |
| EH.Eagle 1.0.6 | 4 | 5% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 5% | 10 |
| throxbot.ThroxBot 0.1 | 4 | 5% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 4% | 17 |
| cs.Grudge 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.9 | 143 / 210 | 1.82 | 19.1% | 25563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.1% | 143 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 35 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.7% | 13 |
| uji.Antique 1.0 | 3.8 | 11.0% | 15 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.4% | 1 |
| ahr.ice.Ice 1.0.2 | 6.2 | 8.6% | 2 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.3% | 1 |
| matt.advanced.Katana 1.0 | 8.7 | 6.0% | 0 |
| stelo.PianistNano 1.2 | 8.7 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 87.9 | 21 / 35 | 3969 |
| 2 | 1 | 70.4 | 94.9 | 27 / 35 | 4711 |
| 3 | 1 | 68.9 | 90.5 | 25 / 35 | 4253 |
| 4 | 1 | 66.8 | 85.1 | 20 / 35 | 3984 |
| 5 | 1 | 69.6 | 93.3 | 25 / 35 | 4346 |
| 6 | 1 | 69.4 | 93.7 | 25 / 35 | 4300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 84 | 77% |
| uji.Antique 1.0 | 41 | 93% |
| qohnil.blot.BlotBot 3.61 | 17 | 65% |
| amk.ChumbaWumba 0.3 | 12 | 100% |
| ahr.ice.Ice 1.0.2 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 33 | 49% | 91 |
| qohnil.blot.BlotBot 3.61 | 10 | 15% | 24 |
| amk.ChumbaWumba 0.3 | 8 | 12% | 20 |
| uji.Antique 1.0 | 7 | 10% | 38 |
| pfvicm.Sobieski 7.2.3b | 6 | 9% | 17 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 11 |
| matt.advanced.Katana 1.0 | 1 | 1% | 6 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.5 | 119 / 210 | 2.13 | 19.0% | 28773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.0% | 119 |
| deewiant.Anomaly 0.2 | 2.5 | 14.6% | 32 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.9% | 44 |
| myl.micro.Troodon 1.10 | 4.2 | 12.4% | 9 |
| jok.PheonixM 0.1.2 | 4.8 | 10.0% | 2 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.7% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.7% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.5% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.8% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.3 | 15 / 35 | 4207 |
| 2 | 1 | 69.2 | 89.2 | 18 / 35 | 4645 |
| 3 | 1 | 68.9 | 86.3 | 21 / 35 | 4702 |
| 4 | 1 | 69.6 | 88.3 | 22 / 35 | 4884 |
| 5 | 1 | 70.6 | 90.2 | 23 / 35 | 5166 |
| 6 | 1 | 70.0 | 89.5 | 20 / 35 | 5169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 64 | 83% |
| zyx.mega.YersiniaPestis 3.1 | 54 | 61% |
| myl.micro.Troodon 1.10 | 20 | 90% |
| jok.PheonixM 0.1.2 | 8 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 34 | 37% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 32 | 35% | 61 |
| myl.micro.Troodon 1.10 | 12 | 13% | 29 |
| jok.PheonixM 0.1.2 | 10 | 11% | 19 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 3 |

## Melee bench: F30

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 75.8 | 65 / 210 | 3.18 | 15.0% | 21651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.7 | 15.0% | 65 |
| catcat20.Matcha 0.006 | 2.5 | 13.7% | 50 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.1% | 24 |
| darkcanuck.B26354 1.06 | 3.3 | 13.5% | 40 |
| oog.melee.Capulet 1.2 | 4.2 | 13.1% | 21 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.1% | 7 |
| ntc.Opposite 1.5 | 7.7 | 7.1% | 0 |
| tripphippy.Alice 1.1 | 7.7 | 7.0% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 6.7% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 74.6 | 8 / 35 | 3379 |
| 2 | 1 | 64.3 | 77.1 | 15 / 35 | 3886 |
| 3 | 4 | 60.0 | 67.9 | 7 / 35 | 3443 |
| 4 | 1 | 64.5 | 79.7 | 15 / 35 | 3481 |
| 5 | 1 | 63.6 | 79.7 | 8 / 35 | 3814 |
| 6 | 1 | 63.2 | 75.9 | 12 / 35 | 3648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 32 | 69% |
| catcat20.Matcha 0.006 | 27 | 41% |
| oog.melee.Capulet 1.2 | 23 | 78% |
| stelo.PastFuture 2.3.2 | 17 | 71% |
| intruder.PrairieWolf 2.61 | 4 | 25% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 44 | 30% | 68 |
| catcat20.Matcha 0.006 | 35 | 24% | 49 |
| stelo.PastFuture 2.3.2 | 27 | 19% | 36 |
| oog.melee.Capulet 1.2 | 23 | 16% | 38 |
| intruder.PrairieWolf 2.61 | 7 | 5% | 7 |
| ntc.Opposite 1.5 | 5 | 3% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 2 | 1% | 4 |
| tripphippy.Alice 1.1 | 2 | 1% | 3 |

## Melee bench: F31

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 74.9 | 62 / 210 | 3.26 | 14.7% | 19906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.5% | 88 |
| hadur117.mini.DeisePN 0.4 | 1.8 | 14.7% | 62 |
| gh.mini.Griezel 0.2 | 3.3 | 12.5% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 12.1% | 9 |
| d414.nano.Quantum 1.0.0 | 5.0 | 10.8% | 9 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.4% | 5 |
| fm.mammillarias 1.3 | 7.3 | 6.4% | 0 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.5% | 3 |
| tlp.ThreeLeggedPig 1 | 9.3 | 5.1% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 73.3 | 8 / 35 | 3126 |
| 2 | 2 | 64.2 | 79.7 | 13 / 35 | 3527 |
| 3 | 2 | 61.6 | 73.3 | 9 / 35 | 3129 |
| 4 | 2 | 61.9 | 72.4 | 11 / 35 | 3405 |
| 5 | 2 | 60.4 | 68.9 | 8 / 35 | 3093 |
| 6 | 1 | 64.8 | 81.9 | 13 / 35 | 3626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 52 | 50% |
| gh.mini.Griezel 0.2 | 30 | 57% |
| d414.nano.Quantum 1.0.0 | 11 | 91% |
| spinnercat.micro.Tyger 0.1 | 7 | 86% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |

Hadur died in 148 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 47 | 32% | 74 |
| gh.mini.Griezel 0.2 | 37 | 25% | 54 |
| spinnercat.micro.Tyger 0.1 | 27 | 18% | 32 |
| d414.nano.Quantum 1.0.0 | 12 | 8% | 22 |
| gh.nano.Grofvuil 0.2 | 12 | 8% | 14 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| timmit.nano.TimDog 0.33 | 2 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.7 | 144 / 210 | 1.84 | 19.2% | 29184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.2% | 144 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.2% | 39 |
| apc.botM 3.0 | 3.2 | 12.1% | 10 |
| lxx.ConceptA 0.8 | 3.7 | 11.6% | 4 |
| vjik.UnViolation 1.1 | 5.7 | 9.1% | 3 |
| bayen.UbaMicro 1.4 | 6.0 | 8.7% | 5 |
| panzer.Panzer 0.2 | 6.7 | 7.9% | 0 |
| yk.JahMicro 1.0 | 7.8 | 6.4% | 2 |
| conscience.Electron 1.3g | 9.3 | 5.5% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.5 | 21 / 35 | 4910 |
| 2 | 1 | 69.7 | 92.1 | 25 / 35 | 4996 |
| 3 | 1 | 69.2 | 92.4 | 27 / 35 | 4796 |
| 4 | 1 | 69.2 | 90.5 | 27 / 35 | 5084 |
| 5 | 1 | 67.2 | 87.0 | 20 / 35 | 4542 |
| 6 | 1 | 69.2 | 92.7 | 24 / 35 | 4856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 65 | 66% |
| lxx.ConceptA 0.8 | 44 | 93% |
| apc.botM 3.0 | 38 | 84% |
| vjik.UnViolation 1.1 | 11 | 100% |
| yk.JahMicro 1.0 | 8 | 88% |
| donjezza.Jezza 1.0 | 6 | 83% |
| bayen.UbaMicro 1.4 | 5 | 60% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 31 | 47% | 76 |
| apc.botM 3.0 | 11 | 17% | 54 |
| lxx.ConceptA 0.8 | 9 | 14% | 30 |
| panzer.Panzer 0.2 | 5 | 8% | 8 |
| bayen.UbaMicro 1.4 | 4 | 6% | 9 |
| vjik.UnViolation 1.1 | 2 | 3% | 22 |
| conscience.Electron 1.3g | 2 | 3% | 4 |
| donjezza.Jezza 1.0 | 1 | 2% | 4 |
| yk.JahMicro 1.0 | 1 | 2% | 2 |

## Melee bench: F33

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.6 | 144 / 210 | 1.93 | 19.9% | 31337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.9% | 144 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.2% | 14 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.0% | 9 |
| labg.Cataclysm 2.05 | 4.5 | 10.4% | 7 |
| baal.nano.N 1.42 | 6.3 | 8.2% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 7.8% | 3 |
| zyx.micro.Ant 1.1 | 8.0 | 6.0% | 0 |
| sanja.First 0.1 | 9.0 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.7 | 25 / 35 | 5088 |
| 2 | 1 | 69.2 | 87.0 | 22 / 35 | 5094 |
| 3 | 1 | 69.9 | 88.3 | 24 / 35 | 5233 |
| 4 | 1 | 69.1 | 85.7 | 22 / 35 | 5158 |
| 5 | 1 | 70.7 | 91.4 | 26 / 35 | 5333 |
| 6 | 1 | 71.1 | 92.7 | 25 / 35 | 5431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 60 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 93% |
| gre.svman4.Leonidas 1.3.2 | 25 | 100% |
| labg.Cataclysm 2.05 | 14 | 86% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 67% |
| sanja.First 0.1 | 4 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| baal.nano.N 1.42 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 45% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 15% | 54 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 12% | 10 |
| gre.svman4.Leonidas 1.3.2 | 7 | 11% | 23 |
| labg.Cataclysm 2.05 | 7 | 11% | 22 |
| zyx.micro.Ant 1.1 | 2 | 3% | 7 |
| baal.nano.N 1.42 | 2 | 3% | 6 |
| sanja.First 0.1 | 0 | 0% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.7 | 99 / 210 | 2.29 | 17.6% | 28113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.3 | 17.6% | 99 |
| stelo.Spread 0.9 | 2.0 | 16.4% | 62 |
| kid.Gladiator .7.2 | 2.7 | 15.9% | 34 |
| jcs.Seth 1.8 | 4.7 | 10.9% | 11 |
| tcf.Reach 3 | 4.7 | 10.8% | 3 |
| cli.Dancer 1.1 | 5.7 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 80.0 | 14 / 35 | 4440 |
| 2 | 1 | 68.0 | 86.7 | 16 / 35 | 4492 |
| 3 | 1 | 69.3 | 89.8 | 19 / 35 | 5177 |
| 4 | 2 | 67.1 | 83.5 | 17 / 35 | 4376 |
| 5 | 1 | 68.2 | 87.0 | 16 / 35 | 4912 |
| 6 | 1 | 68.4 | 87.3 | 17 / 35 | 4716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 77 | 58% |
| kid.Gladiator .7.2 | 47 | 64% |
| jcs.Seth 1.8 | 14 | 86% |
| tcf.Reach 3 | 5 | 60% |
| ratosh.Wesco 1.4 | 4 | 100% |
| cli.Dancer 1.1 | 3 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 57 | 51% | 102 |
| kid.Gladiator .7.2 | 28 | 25% | 49 |
| jcs.Seth 1.8 | 10 | 9% | 31 |
| tcf.Reach 3 | 7 | 6% | 11 |
| ratosh.Wesco 1.4 | 6 | 5% | 9 |
| cli.Dancer 1.1 | 2 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 80.7 | 45 / 210 | 2.74 | 15.4% | 21682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 136 |
| hadur117.mini.DeisePN 0.4 | 2.2 | 15.4% | 45 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.6% | 22 |
| rz.HawkOnFire 0.1 | 4.0 | 12.3% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 5.0 | 11.0% | 2 |
| wit.Chuliath 1.0 | 6.7 | 7.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.5% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 82.5 | 8 / 35 | 3549 |
| 2 | 2 | 63.7 | 78.1 | 10 / 35 | 3574 |
| 3 | 2 | 65.6 | 84.8 | 11 / 35 | 3844 |
| 4 | 2 | 63.9 | 79.7 | 7 / 35 | 3558 |
| 5 | 3 | 62.8 | 78.1 | 4 / 35 | 3459 |
| 6 | 2 | 64.3 | 81.0 | 5 / 35 | 3698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 79 | 18% |
| gh.mini.Gruwel 0.9 | 21 | 67% |
| rz.HawkOnFire 0.1 | 11 | 82% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 92 | 56% | 104 |
| gh.mini.Gruwel 0.9 | 39 | 24% | 56 |
| rz.HawkOnFire 0.1 | 21 | 13% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 4% | 13 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 0 | 0% | 1 |

## Melee bench: F36

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 95.1 | 184 / 210 | 1.44 | 21.6% | 33806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 21.6% | 184 |
| bzdp.Pansy 2.1 | 2.0 | 12.4% | 9 |
| alpha.RainingFire 1.0 | 3.8 | 11.1% | 2 |
| bvh.micro.Freya 0.3 | 4.2 | 10.2% | 1 |
| mz.Cork 0.1 | 4.8 | 10.3% | 4 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.5% | 3 |
| m3thos.Eva02 0.7.1 | 6.5 | 8.9% | 3 |
| dl.BetterWalls 1.0 | 8.5 | 6.0% | 0 |
| squidM.TentalceMeleeNano 1.1 | 9.2 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 4.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 98.4 | 32 / 35 | 5570 |
| 2 | 1 | 71.6 | 94.3 | 31 / 35 | 5599 |
| 3 | 1 | 72.5 | 97.8 | 32 / 35 | 5576 |
| 4 | 1 | 71.0 | 92.4 | 30 / 35 | 5525 |
| 5 | 1 | 72.3 | 95.2 | 31 / 35 | 5870 |
| 6 | 1 | 70.9 | 92.4 | 28 / 35 | 5666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 98% |
| bvh.micro.Freya 0.3 | 35 | 97% |
| mz.Cork 0.1 | 29 | 97% |
| bvh.mini.Fenrir 0.39 | 24 | 100% |
| alpha.RainingFire 1.0 | 18 | 100% |
| m3thos.Eva02 0.7.1 | 15 | 93% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 26 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 6 | 23% | 59 |
| alpha.RainingFire 1.0 | 5 | 19% | 23 |
| m3thos.Eva02 0.7.1 | 4 | 15% | 29 |
| bvh.micro.Freya 0.3 | 4 | 15% | 28 |
| bvh.mini.Fenrir 0.39 | 2 | 8% | 13 |
| dl.BetterWalls 1.0 | 2 | 8% | 9 |
| sample.MyFirstRobot 1.0 | 2 | 8% | 7 |
| mz.Cork 0.1 | 1 | 4% | 34 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |

## Melee bench: F37

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 92.8 | 175 / 210 | 1.65 | 20.1% | 34078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 20.1% | 175 |
| germ.TheMind .2 | 2.2 | 11.2% | 13 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.3% | 4 |
| EBBU.Sim2 1.02 | 4.0 | 9.4% | 0 |
| stelo.UntouchableNano 1.3 | 5.8 | 8.7% | 7 |
| lmk.ACPFinal 0.1 | 6.0 | 8.7% | 2 |
| mb.Beast 0.1 | 7.5 | 8.4% | 2 |
| agrach.Dalek 1.0 | 7.5 | 8.2% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.5% | 1 |
| skm.Ryubot 1.0 | 8.8 | 7.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.6 | 26 / 35 | 5738 |
| 2 | 1 | 70.3 | 96.5 | 31 / 35 | 5566 |
| 3 | 1 | 70.2 | 94.3 | 30 / 35 | 5923 |
| 4 | 1 | 68.4 | 89.5 | 28 / 35 | 5315 |
| 5 | 1 | 70.2 | 94.9 | 30 / 35 | 5757 |
| 6 | 1 | 69.6 | 92.7 | 30 / 35 | 5779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 44 | 95% |
| EBBU.Sim2 1.02 | 28 | 100% |
| stelo.UntouchableNano 1.3 | 26 | 81% |
| mb.Beast 0.1 | 23 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 100% |
| skm.Ryubot 1.0 | 17 | 100% |
| lmk.ACPFinal 0.1 | 14 | 100% |
| agrach.Dalek 1.0 | 14 | 93% |

Hadur died in 35 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 8 | 23% | 42 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 17% | 35 |
| stelo.UntouchableNano 1.3 | 6 | 17% | 26 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 17% | 7 |
| agrach.Dalek 1.0 | 4 | 11% | 32 |
| lmk.ACPFinal 0.1 | 4 | 11% | 23 |
| EBBU.Sim2 1.02 | 1 | 3% | 19 |
| mb.Beast 0.1 | 0 | 0% | 22 |
| skm.Ryubot 1.0 | 0 | 0% | 1 |

## Melee bench: F38

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 82.2 | 102 / 210 | 2.60 | 16.8% | 24592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.3 | 16.8% | 102 |
| justin.Mallais 14.0 | 1.7 | 16.0% | 62 |
| bvh.mini.Freya 0.55 | 3.5 | 12.1% | 11 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.6% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 10.8% | 6 |
| cs.Wren 1.0 | 5.8 | 10.3% | 6 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.5% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.4% | 3 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 82.9 | 18 / 35 | 4087 |
| 2 | 1 | 65.6 | 81.6 | 16 / 35 | 4204 |
| 3 | 1 | 66.3 | 83.5 | 18 / 35 | 4002 |
| 4 | 2 | 64.7 | 78.7 | 14 / 35 | 3756 |
| 5 | 1 | 65.3 | 81.6 | 17 / 35 | 3943 |
| 6 | 1 | 67.7 | 84.8 | 19 / 35 | 4600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 68% |
| bts.mega.Gnarly 1.4 | 27 | 78% |
| bvh.mini.Freya 0.55 | 19 | 95% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 93% |
| cs.Wren 1.0 | 9 | 89% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 38 | 35% | 71 |
| bvh.mini.Freya 0.55 | 22 | 20% | 33 |
| bts.mega.Gnarly 1.4 | 20 | 18% | 45 |
| cs.Wren 1.0 | 13 | 12% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 6% | 22 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 5% | 12 |
| kdf.KoulDestroyer 1.0 | 4 | 4% | 7 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.7 | 121 / 210 | 2.20 | 18.3% | 28656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 18.3% | 121 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 21 |
| catcat20.Lambda 0.024 | 3.5 | 11.3% | 16 |
| az.Ololobot 0.2.4 | 3.5 | 12.0% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.4% | 5 |
| gimp.GimpBot 0.1 | 6.7 | 8.0% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 8.0% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.7% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.0% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.0 | 21 / 35 | 4757 |
| 2 | 1 | 66.7 | 83.8 | 18 / 35 | 4685 |
| 3 | 1 | 68.4 | 89.2 | 21 / 35 | 4900 |
| 4 | 1 | 66.2 | 83.5 | 17 / 35 | 4617 |
| 5 | 1 | 68.1 | 88.6 | 24 / 35 | 4672 |
| 6 | 1 | 68.5 | 87.9 | 20 / 35 | 5025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 49 | 86% |
| az.Ololobot 0.2.4 | 37 | 57% |
| catcat20.Lambda 0.024 | 33 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 20 | 95% |
| gimp.GimpBot 0.1 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 30 | 34% | 72 |
| az.Ololobot 0.2.4 | 27 | 30% | 52 |
| catcat20.Lambda 0.024 | 12 | 13% | 32 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 10% | 18 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 10 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 6 |
| gimp.GimpBot 0.1 | 2 | 2% | 13 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.3 | 133 / 210 | 2.05 | 19.1% | 29828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.1% | 133 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 42 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.3% | 15 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.2% | 7 |
| mz.AntiGrav 1.0 | 4.8 | 9.9% | 4 |
| alpha.BlackIce 1.0 | 5.8 | 9.2% | 3 |
| stelo.Randomness 1.0 | 6.8 | 8.6% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.5 | 4.8% | 1 |
| sample.Corners 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.8 | 22 / 35 | 5102 |
| 2 | 1 | 69.1 | 91.1 | 22 / 35 | 4842 |
| 3 | 1 | 69.6 | 90.2 | 24 / 35 | 5108 |
| 4 | 1 | 67.7 | 84.1 | 20 / 35 | 4719 |
| 5 | 1 | 69.6 | 89.5 | 24 / 35 | 5059 |
| 6 | 1 | 68.1 | 84.1 | 21 / 35 | 4998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 69 | 78% |
| kano.gamma.KanoGamma 1.8 | 30 | 80% |
| Polkwane.SmashMelee 1.0 | 26 | 96% |
| mz.AntiGrav 1.0 | 10 | 100% |
| stelo.Randomness 1.0 | 8 | 100% |
| sample.Corners 1.0 | 7 | 100% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |
| alpha.BlackIce 1.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 40% | 67 |
| kano.gamma.KanoGamma 1.8 | 18 | 23% | 55 |
| Polkwane.SmashMelee 1.0 | 8 | 10% | 25 |
| mz.AntiGrav 1.0 | 7 | 9% | 18 |
| stelo.Randomness 1.0 | 6 | 8% | 22 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 7 |
| alpha.BlackIce 1.0 | 3 | 4% | 7 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 4 |
| sample.Corners 1.0 | 0 | 0% | 5 |

## Melee bench: F41

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 87.0 | 108 / 210 | 2.17 | 17.8% | 25390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.2 | 17.8% | 108 |
| eem.EvBotNG v12.8 | 1.8 | 15.8% | 66 |
| ary.Swarm 1.1 | 3.0 | 13.3% | 15 |
| lessonz.robocode.Oz 0.5.0 | 4.2 | 11.8% | 8 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.0% | 9 |
| shrub.Silver v048 | 6.0 | 8.8% | 0 |
| zyx.nano.Ant 1.1 | 7.2 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.1% | 4 |
| stelo.Mirror 1.1 | 8.8 | 5.6% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 91.1 | 18 / 35 | 4301 |
| 2 | 1 | 66.7 | 84.4 | 17 / 35 | 4226 |
| 3 | 1 | 69.5 | 94.0 | 19 / 35 | 4581 |
| 4 | 2 | 65.0 | 79.0 | 13 / 35 | 3912 |
| 5 | 1 | 68.6 | 88.9 | 24 / 35 | 4212 |
| 6 | 1 | 66.9 | 84.4 | 17 / 35 | 4158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 75 | 49% |
| ary.Swarm 1.1 | 37 | 76% |
| simonton.nano.MeleeSeed 1.8 | 20 | 100% |
| lessonz.robocode.Oz 0.5.0 | 15 | 100% |
| jsal.Jsalbot 1.0 | 8 | 63% |
| shrub.Silver v048 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 48 | 47% | 78 |
| ary.Swarm 1.1 | 31 | 30% | 62 |
| simonton.nano.MeleeSeed 1.8 | 8 | 8% | 29 |
| lessonz.robocode.Oz 0.5.0 | 8 | 8% | 20 |
| jsal.Jsalbot 1.0 | 3 | 3% | 11 |
| shrub.Silver v048 | 2 | 2% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 2 |
| zyx.nano.Ant 1.1 | 0 | 0% | 2 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.9 | 125 / 210 | 2.00 | 19.1% | 31787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.1% | 125 |
| wompi.Wallaby 5.1 | 2.3 | 14.9% | 35 |
| ara.Shera 0.88 | 3.0 | 14.0% | 38 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.1% | 11 |
| amz.NanoClone 1.41 | 5.2 | 8.9% | 1 |
| maribo.IotaCT 1.1 | 6.0 | 7.6% | 0 |
| dsw.StaticD 1.0 | 7.3 | 6.4% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.1 | 19 / 35 | 5207 |
| 2 | 1 | 68.9 | 87.9 | 22 / 35 | 5177 |
| 3 | 1 | 70.0 | 91.4 | 25 / 35 | 5160 |
| 4 | 1 | 70.0 | 90.5 | 20 / 35 | 5846 |
| 5 | 1 | 68.2 | 85.7 | 21 / 35 | 5142 |
| 6 | 1 | 68.4 | 87.0 | 18 / 35 | 5255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 67 | 84% |
| ara.Shera 0.88 | 49 | 65% |
| maribo.mini.MiniQuester 0.1 | 31 | 97% |
| dsw.StaticD 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| maribo.IotaCT 1.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 32 | 38% | 63 |
| wompi.Wallaby 5.1 | 28 | 33% | 89 |
| maribo.mini.MiniQuester 0.1 | 15 | 18% | 38 |
| amz.NanoClone 1.41 | 8 | 9% | 11 |
| dsw.StaticD 1.0 | 1 | 1% | 5 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 75.1 | 32 / 210 | 3.24 | 14.4% | 21271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 155 |
| hadur117.mini.DeisePN 0.4 | 2.0 | 14.4% | 32 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.6% | 10 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.7% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.7% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 2 |
| mz.NanoGod 2.02 | 7.2 | 7.6% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.6% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 74.6 | 7 / 35 | 3693 |
| 2 | 2 | 62.7 | 72.1 | 5 / 35 | 3370 |
| 3 | 2 | 64.3 | 78.7 | 6 / 35 | 3551 |
| 4 | 2 | 62.0 | 70.8 | 4 / 35 | 3562 |
| 5 | 2 | 65.0 | 78.7 | 6 / 35 | 3729 |
| 6 | 2 | 63.2 | 75.9 | 4 / 35 | 3366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 24% |
| brainfade.melee.Dusk 0.44 | 9 | 78% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 178 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 97 | 54% | 117 |
| dummy.micro.Sparrow 2.5 | 23 | 13% | 27 |
| brainfade.melee.Dusk 0.44 | 22 | 12% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 14 |
| Krabb.akim2.Akim2 1.1b | 11 | 6% | 11 |
| mz.NanoGod 2.02 | 6 | 3% | 6 |
| jab.DiamondStealer 5 | 6 | 3% | 6 |

## Melee bench: F44

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.0 | 135 / 210 | 1.90 | 19.7% | 31760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 19.7% | 135 |
| stelo.Liblix 0.3.1 | 2.2 | 15.5% | 48 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.7% | 20 |
| wompi.Quokka 1.6 | 4.3 | 10.2% | 3 |
| jwirde.Gort 2.0 | 5.3 | 8.7% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 8.8% | 1 |
| disan.Chair 2.2.0 | 7.2 | 7.3% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.9% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.7 | 21 / 35 | 5372 |
| 2 | 1 | 71.6 | 95.2 | 27 / 35 | 5589 |
| 3 | 1 | 70.8 | 91.1 | 28 / 35 | 5582 |
| 4 | 1 | 68.8 | 88.3 | 20 / 35 | 5034 |
| 5 | 1 | 69.3 | 87.0 | 22 / 35 | 5220 |
| 6 | 1 | 68.3 | 86.7 | 17 / 35 | 4963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 95 | 73% |
| tzu.TheArtOfWar 1.2 | 45 | 78% |
| wompi.Quokka 1.6 | 10 | 100% |
| jwirde.Gort 2.0 | 7 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 80% |
| amk.jointstrike.JointStrike 0.2 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 35 | 45% | 111 |
| tzu.TheArtOfWar 1.2 | 21 | 27% | 57 |
| wompi.Quokka 1.6 | 9 | 12% | 18 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 6 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 5 |
| disan.Chair 2.2.0 | 2 | 3% | 3 |
| jwirde.Gort 2.0 | 1 | 1% | 8 |
| sample.Crazy 1.0 | 1 | 1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.7 | 95 / 210 | 1.93 | 20.2% | 36661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePN 0.4 | 1.0 | 20.2% | 95 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.6% | 99 |
| jje.BagPuss 1.2 | 2.8 | 11.6% | 2 |
| myl.nano.Graviton 1.10 | 4.5 | 9.9% | 1 |
| sul.Lunar 1.1 | 4.7 | 10.0% | 4 |
| hvilela.HVilela 0.9 | 6.2 | 8.7% | 0 |
| fm.claire 1.7 | 7.2 | 8.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.7% | 3 |
| wit.Deep7 2.0 | 8.8 | 6.3% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.2 | 13 / 35 | 6016 |
| 2 | 1 | 69.1 | 85.4 | 17 / 35 | 5932 |
| 3 | 1 | 70.6 | 91.1 | 19 / 35 | 6139 |
| 4 | 1 | 70.0 | 90.5 | 14 / 35 | 6146 |
| 5 | 1 | 70.5 | 90.2 | 16 / 35 | 6313 |
| 6 | 1 | 70.3 | 91.7 | 16 / 35 | 6115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 115 | 23% |
| sul.Lunar 1.1 | 21 | 95% |
| jje.BagPuss 1.2 | 18 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 92% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| wit.Deep7 2.0 | 6 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 2614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 89 | 77% | 0 |
| sul.Lunar 1.1 | 9 | 8% | 56 |
| fm.claire 1.7 | 6 | 5% | 11 |
| myl.nano.Graviton 1.10 | 5 | 4% | 35 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 22 |
| hvilela.HVilela 0.9 | 2 | 2% | 15 |
| jje.BagPuss 1.2 | 1 | 1% | 55 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |
| wit.Deep7 2.0 | 0 | 0% | 8 |

## Melee bench: F46

hadur117.mini.DeisePN 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.8 | 75 / 210 | 2.28 | 16.9% | 25129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 16.6% | 62 |
| hadur117.mini.DeisePN 0.4 | 1.8 | 16.9% | 75 |
| rsalesc.melee.Medina 0.4.5 | 2.7 | 15.5% | 61 |
| mz.MicroSheep 1.0 | 4.3 | 10.7% | 1 |
| cx.Princess 1.0 | 4.7 | 10.4% | 9 |
| sadoner.killer 0.2 | 6.2 | 8.7% | 1 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.8% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 86.7 | 12 / 35 | 4191 |
| 2 | 2 | 65.9 | 84.1 | 13 / 35 | 3863 |
| 3 | 2 | 66.8 | 85.4 | 14 / 35 | 4165 |
| 4 | 2 | 66.7 | 87.3 | 10 / 35 | 4223 |
| 5 | 2 | 66.6 | 86.3 | 12 / 35 | 4268 |
| 6 | 1 | 66.5 | 85.1 | 14 / 35 | 4419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 71 | 49% |
| rsalesc.melee.Medina 0.4.5 | 48 | 42% |
| cx.Princess 1.0 | 12 | 67% |
| mz.MicroSheep 1.0 | 6 | 100% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| sadoner.killer 0.2 | 2 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 1058. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 47% | 99 |
| rsalesc.melee.Medina 0.4.5 | 41 | 30% | 61 |
| cx.Princess 1.0 | 14 | 10% | 21 |
| arthord.NanoSatanMelee Beta | 7 | 5% | 11 |
| sadoner.killer 0.2 | 6 | 4% | 8 |
| mz.MicroSheep 1.0 | 2 | 1% | 8 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |

