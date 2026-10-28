# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 73.2 | 16 / 210 | 3.41 | 14.9% | 30892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 156 |
| hadur117.mini.DeiseWHPC 0.2 | 2.0 | 14.9% | 16 |
| sgp.JollyNinja 3.53 | 3.2 | 12.6% | 25 |
| mz.MicroGodMelee 1 | 4.2 | 11.2% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 10.7% | 4 |
| lorneswork.Predator 1.0 | 6.0 | 9.1% | 0 |
| adt.Ar2 1.0 | 6.8 | 8.0% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.1% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.2% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 75.9 | 3 / 35 | 5250 |
| 2 | 2 | 61.7 | 67.9 | 3 / 35 | 4733 |
| 3 | 2 | 65.9 | 80.0 | 4 / 35 | 5375 |
| 4 | 2 | 62.0 | 68.6 | 2 / 35 | 5191 |
| 5 | 2 | 63.7 | 74.9 | 2 / 35 | 5238 |
| 6 | 2 | 62.8 | 72.1 | 2 / 35 | 5105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 59 | 3% |
| sgp.JollyNinja 3.53 | 13 | 54% |
| mz.MicroGodMelee 1 | 4 | 0% |
| lorneswork.Predator 1.0 | 4 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 59% | 119 |
| sgp.JollyNinja 3.53 | 27 | 14% | 32 |
| mz.MicroGodMelee 1 | 23 | 12% | 23 |
| lorneswork.Predator 1.0 | 13 | 7% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 7% | 15 |
| adt.Ar2 1.0 | 2 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 72.4 | 41 / 210 | 3.49 | 16.0% | 33917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.3 | 16.0% | 41 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 14.5% | 52 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.7% | 54 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.3% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 9.8% | 1 |
| fnc.bandit.Bandit 5.2.0 | 6.0 | 8.9% | 4 |
| Noran.BitchingElk 0.054 | 7.3 | 8.1% | 17 |
| sch.Simone 0.3d | 7.3 | 7.7% | 14 |
| stelo.PatternRobot 1.0 | 8.7 | 6.9% | 6 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 74.9 | 11 / 35 | 5762 |
| 2 | 2 | 63.0 | 70.8 | 4 / 35 | 5378 |
| 3 | 1 | 66.3 | 78.4 | 8 / 35 | 5956 |
| 4 | 1 | 64.8 | 72.7 | 5 / 35 | 6085 |
| 5 | 1 | 65.0 | 75.6 | 8 / 35 | 5656 |
| 6 | 2 | 60.2 | 61.9 | 5 / 35 | 5080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 32 | 38% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 29 | 14% |
| Noran.BitchingElk 0.054 | 11 | 55% |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 56% |
| stelo.PatternRobot 1.0 | 6 | 33% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| sch.Simone 0.3d | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 58 | 34% | 64 |
| pulsar.PulsarMax 0.8.9 | 46 | 27% | 54 |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 10% | 24 |
| sch.Simone 0.3d | 14 | 8% | 23 |
| stelo.PatternRobot 1.0 | 11 | 6% | 11 |
| fnc.bandit.Bandit 5.2.0 | 9 | 5% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 5% | 12 |
| Noran.BitchingElk 0.054 | 6 | 4% | 8 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.9 | 71 / 210 | 2.27 | 18.3% | 38364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.2 | 18.3% | 71 |
| radnor.DoctorBob 1.42 | 1.8 | 16.1% | 79 |
| vuen.Cake 2.51 | 3.3 | 12.8% | 36 |
| kawigi.nano.Lib 1.0 | 3.7 | 12.6% | 23 |
| urdos.URDOS 1.3 | 5.0 | 9.5% | 0 |
| adt.Ar1 2.1 | 7.0 | 7.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.8% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 6.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.3 | 12 / 35 | 6556 |
| 2 | 1 | 68.9 | 88.6 | 15 / 35 | 6589 |
| 3 | 1 | 68.8 | 87.6 | 16 / 35 | 6652 |
| 4 | 1 | 67.8 | 85.4 | 10 / 35 | 6202 |
| 5 | 1 | 67.2 | 83.8 | 11 / 35 | 6071 |
| 6 | 2 | 66.6 | 82.5 | 7 / 35 | 6294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 48 | 13% |
| kawigi.nano.Lib 1.0 | 46 | 89% |
| vuen.Cake 2.51 | 42 | 38% |
| urdos.URDOS 1.3 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 86 | 61% | 98 |
| vuen.Cake 2.51 | 33 | 24% | 51 |
| kawigi.nano.Lib 1.0 | 9 | 6% | 34 |
| urdos.URDOS 1.3 | 5 | 4% | 11 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 1% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 3 |
| adt.Ar1 2.1 | 2 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 67.9 | 3 / 210 | 3.89 | 14.1% | 31169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.9% | 195 |
| hadur117.mini.DeiseWHPC 0.2 | 2.5 | 14.1% | 3 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.5% | 7 |
| TNT.TNT 0.99.1 | 3.8 | 11.9% | 2 |
| josago.Jorgito 0.16 | 5.2 | 9.3% | 2 |
| css.Delitioner 0.11 | 6.3 | 7.3% | 1 |
| tj.zombie1n 1.0.1 | 6.5 | 7.1% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 61.3 | 0 / 35 | 5148 |
| 2 | 2 | 64.3 | 71.7 | 1 / 35 | 5505 |
| 3 | 2 | 64.5 | 72.4 | 1 / 35 | 5554 |
| 4 | 3 | 62.1 | 67.6 | 1 / 35 | 5036 |
| 5 | 3 | 62.7 | 68.9 | 0 / 35 | 5031 |
| 6 | 2 | 61.9 | 65.7 | 0 / 35 | 4895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 42 | 0% |
| TNT.TNT 0.99.1 | 3 | 33% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |
| spin.Bugstard 0.012b | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 116 | 56% | 116 |
| apc.LeeroyJenkins2 1.0 | 35 | 17% | 37 |
| TNT.TNT 0.99.1 | 24 | 12% | 25 |
| josago.Jorgito 0.16 | 23 | 11% | 23 |
| css.Delitioner 0.11 | 5 | 2% | 5 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 0% | 1 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 54.4 | 0 / 210 | 5.10 | 10.8% | 21448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.1% | 132 |
| justin.DemonicRage 3.4 | 2.0 | 17.4% | 53 |
| wompi.Numbat 2.1 | 3.0 | 13.8% | 21 |
| hadur117.mini.DeiseWHPC 0.2 | 4.2 | 10.8% | 0 |
| ms.Ares 0.19 | 5.2 | 9.4% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 9.3% | 3 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.9 | 48.3 | 0 / 35 | 3025 |
| 2 | 4 | 54.8 | 53.7 | 0 / 35 | 3473 |
| 3 | 4 | 56.3 | 54.3 | 0 / 35 | 3834 |
| 4 | 4 | 56.9 | 56.5 | 0 / 35 | 3600 |
| 5 | 4 | 57.5 | 57.8 | 0 / 35 | 4025 |
| 6 | 4 | 55.6 | 56.2 | 0 / 35 | 3491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 7 | 0% |
| cb.fire.Firestarter 2.0f | 5 | 0% |
| wompi.Numbat 2.1 | 3 | 0% |

Hadur died in 210 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 69 | 33% | 69 |
| cb.fire.Firestarter 2.0f | 59 | 28% | 59 |
| wompi.Numbat 2.1 | 36 | 17% | 36 |
| ms.Ares 0.19 | 21 | 10% | 21 |
| axeBots.HataMoto 3.09 | 12 | 6% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 6 | 3% | 6 |
| Queens_teamrobot.UltraRazor 1.0 | 3 | 1% | 3 |
| supersample.SuperBoxBot 1.0 | 3 | 1% | 3 |
| GarmBox.Oranges 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 68.8 | 43 / 210 | 3.81 | 14.5% | 28031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 1.3 | 15.7% | 90 |
| jekl.StoneGhost 0.7 | 2.2 | 15.0% | 41 |
| hadur117.mini.DeiseWHPC 0.2 | 2.5 | 14.5% | 43 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 12.0% | 17 |
| mld.Wisdom 1.0 | 4.8 | 10.4% | 6 |
| gg.Wolverine 2.0 | 6.2 | 8.8% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.2% | 7 |
| spinnercat.Omen 1.0 | 7.8 | 6.8% | 1 |
| DBall.NUKE 0.1 | 8.7 | 6.1% | 1 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 67.6 | 6 / 35 | 4705 |
| 2 | 3 | 60.4 | 64.8 | 6 / 35 | 4325 |
| 3 | 2 | 63.8 | 72.7 | 9 / 35 | 4840 |
| 4 | 3 | 61.0 | 67.0 | 3 / 35 | 4509 |
| 5 | 3 | 61.6 | 67.6 | 7 / 35 | 4682 |
| 6 | 1 | 64.4 | 73.0 | 12 / 35 | 4970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 21 | 71% |
| origin.SleepSiphon 1.7b | 21 | 0% |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 93% |
| gg.Wolverine 2.0 | 8 | 88% |
| mld.Wisdom 1.0 | 7 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 0% |
| DBall.NUKE 0.1 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 70 | 42% | 77 |
| jekl.StoneGhost 0.7 | 37 | 22% | 45 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 8% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 13 | 8% | 18 |
| mld.Wisdom 1.0 | 12 | 7% | 18 |
| gg.Wolverine 2.0 | 11 | 7% | 19 |
| spinnercat.Omen 1.0 | 8 | 5% | 9 |
| DBall.NUKE 0.1 | 1 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.6 | 33 / 210 | 2.66 | 17.2% | 36544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.3 | 18.8% | 83 |
| hadur117.mini.DeiseWHPC 0.2 | 2.0 | 17.2% | 33 |
| rtk.Tachikoma 1.0 | 2.7 | 16.8% | 67 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.9% | 8 |
| franzor.Lizt 1.3.1 | 4.5 | 11.2% | 19 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.9 | 80.3 | 4 / 35 | 6362 |
| 2 | 2 | 68.4 | 83.8 | 4 / 35 | 6121 |
| 3 | 2 | 67.0 | 78.4 | 6 / 35 | 5667 |
| 4 | 2 | 67.0 | 80.0 | 4 / 35 | 5639 |
| 5 | 2 | 68.7 | 84.4 | 7 / 35 | 6130 |
| 6 | 1 | 69.2 | 82.5 | 8 / 35 | 6625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 50 | 24% |
| rsalesc.melee.Monk 0.3.6c | 46 | 7% |
| oog.melee.CapuletDroid 1.1 | 12 | 92% |
| franzor.Lizt 1.3.1 | 9 | 56% |
| sample.Target 1.0 | 1 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 83 | 47% | 89 |
| rtk.Tachikoma 1.0 | 68 | 38% | 82 |
| franzor.Lizt 1.3.1 | 15 | 8% | 11 |
| oog.melee.CapuletDroid 1.1 | 8 | 5% | 20 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 3 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 4 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.3 | 54 / 210 | 3.13 | 16.3% | 30833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.2 | 16.3% | 54 |
| shrub.Vapour v159 | 2.3 | 13.4% | 44 |
| tm.Yuugao 1.0 | 2.5 | 13.4% | 61 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.8% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.9% | 24 |
| m3thos.Eva00 1.1 | 6.5 | 8.0% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 7.3 | 7.7% | 8 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.4% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.4% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 69.5 | 8 / 35 | 4487 |
| 2 | 1 | 63.2 | 74.6 | 5 / 35 | 5052 |
| 3 | 1 | 64.7 | 78.4 | 7 / 35 | 5253 |
| 4 | 1 | 65.7 | 77.8 | 12 / 35 | 5409 |
| 5 | 1 | 66.5 | 81.9 | 12 / 35 | 5409 |
| 6 | 1 | 64.2 | 75.9 | 10 / 35 | 5223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 29 | 34% |
| tm.Yuugao 1.0 | 27 | 15% |
| Krabb.sliNk.Garm 0.9u | 16 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 18% |
| m3thos.Eva00 1.1 | 10 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 57% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| SHAM.WOW 1.4 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 61 | 39% | 69 |
| shrub.Vapour v159 | 32 | 20% | 45 |
| com.spp.robocode.MostlyHarmless 010 | 29 | 18% | 37 |
| Krabb.sliNk.Garm 0.9u | 10 | 6% | 20 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 4% | 15 |
| m3thos.Eva00 1.1 | 6 | 4% | 9 |
| zyx.nano.BacillusComma 1.0 | 5 | 3% | 6 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 5 |
| SHAM.WOW 1.4 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 58.9 | 7 / 210 | 4.70 | 12.3% | 24715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.8% | 126 |
| kc.micro.Figment 1.0 | 2.2 | 14.8% | 36 |
| hadur117.mini.DeiseWHPC 0.2 | 3.0 | 12.3% | 7 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.4% | 17 |
| yagami.Tidus 0.11 | 5.0 | 10.5% | 2 |
| mc2.enemy.Original 0.9 | 5.3 | 10.0% | 19 |
| dft.Calliope 5.6 | 7.3 | 7.2% | 3 |
| step.nanoPri 1.0 | 8.3 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.7 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 65.4 | 1 / 35 | 4711 |
| 2 | 4 | 56.4 | 56.2 | 1 / 35 | 3810 |
| 3 | 3 | 59.5 | 63.5 | 2 / 35 | 4243 |
| 4 | 3 | 57.8 | 59.0 | 1 / 35 | 4220 |
| 5 | 3 | 55.7 | 53.3 | 2 / 35 | 3818 |
| 6 | 3 | 56.5 | 55.9 | 0 / 35 | 3913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 18 | 6% |
| kc.micro.Figment 1.0 | 14 | 21% |
| pedersen.Grishnakh 1.0 | 4 | 25% |
| dft.Calliope 5.6 | 4 | 25% |
| mc2.enemy.Original 0.9 | 3 | 0% |
| yagami.Tidus 0.11 | 2 | 50% |

Hadur died in 203 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 70 | 34% | 72 |
| kc.micro.Figment 1.0 | 59 | 29% | 62 |
| mc2.enemy.Original 0.9 | 20 | 10% | 20 |
| pedersen.Grishnakh 1.0 | 19 | 9% | 19 |
| yagami.Tidus 0.11 | 11 | 5% | 12 |
| step.nanoPri 1.0 | 11 | 5% | 11 |
| dft.Calliope 5.6 | 8 | 4% | 9 |
| robar.nano.Assertive_Melee 0.2 | 5 | 2% | 5 |

## Melee bench: F10

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.7 | 51 / 210 | 2.91 | 16.6% | 34726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.0 | 16.6% | 51 |
| DTF.Kludgy 1.2b | 2.5 | 14.6% | 63 |
| ne.Chimera 1.2 | 3.2 | 13.3% | 25 |
| ejb.Polaris 1.0.1 | 4.0 | 12.6% | 31 |
| vStar.RAFzilla 2.15 | 4.8 | 11.1% | 18 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.6% | 18 |
| kurios.DOSexe .9b | 8.0 | 5.6% | 1 |
| sam.Samspin 1.0 | 8.2 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 77.5 | 7 / 35 | 5946 |
| 2 | 1 | 65.6 | 78.4 | 7 / 35 | 5775 |
| 3 | 1 | 66.6 | 81.0 | 11 / 35 | 5766 |
| 4 | 1 | 66.4 | 81.3 | 9 / 35 | 5870 |
| 5 | 1 | 65.3 | 78.1 | 9 / 35 | 5766 |
| 6 | 1 | 64.9 | 76.2 | 8 / 35 | 5603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 33 | 30% |
| ne.Chimera 1.2 | 27 | 59% |
| ejb.Polaris 1.0.1 | 25 | 24% |
| vStar.RAFzilla 2.15 | 19 | 53% |
| tvv.micro.Antares 1.1.1 | 10 | 40% |
| donjezza.Muncho 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 47 | 29% | 56 |
| ejb.Polaris 1.0.1 | 43 | 27% | 52 |
| ne.Chimera 1.2 | 26 | 16% | 41 |
| vStar.RAFzilla 2.15 | 20 | 13% | 31 |
| tvv.micro.Antares 1.1.1 | 12 | 8% | 13 |
| kurios.DOSexe .9b | 5 | 3% | 9 |
| sam.Samspin 1.0 | 3 | 2% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 2% | 3 |
| donjezza.Muncho 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 67.9 | 36 / 210 | 3.89 | 14.5% | 28269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.5% | 96 |
| hadur117.mini.DeiseWHPC 0.2 | 2.0 | 14.5% | 36 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.0% | 24 |
| djc.DynaBot 0.1.1 | 4.0 | 11.4% | 18 |
| rdt199.Warlord 0.73 | 5.2 | 9.4% | 15 |
| br2.MobyDickBot 1.6 | 6.0 | 9.1% | 16 |
| uji.YellohFellah 1.0 | 6.7 | 8.3% | 8 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 68.3 | 6 / 35 | 4826 |
| 2 | 2 | 60.5 | 66.7 | 1 / 35 | 4500 |
| 3 | 2 | 65.3 | 75.6 | 10 / 35 | 5261 |
| 4 | 2 | 60.0 | 64.1 | 5 / 35 | 4639 |
| 5 | 2 | 63.4 | 73.3 | 8 / 35 | 4604 |
| 6 | 2 | 58.7 | 59.4 | 6 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 32 | 28% |
| djc.DynaBot 0.1.1 | 12 | 92% |
| cx.mini.Nimrod 0.55 | 8 | 75% |
| rdt199.Warlord 0.73 | 6 | 83% |
| br2.MobyDickBot 1.6 | 5 | 20% |
| uji.YellohFellah 1.0 | 4 | 75% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 82 | 47% | 95 |
| cx.mini.Nimrod 0.55 | 36 | 20% | 44 |
| djc.DynaBot 0.1.1 | 16 | 9% | 22 |
| rdt199.Warlord 0.73 | 16 | 9% | 20 |
| br2.MobyDickBot 1.6 | 8 | 5% | 7 |
| uji.YellohFellah 1.0 | 6 | 3% | 10 |
| stelo.MirrorNano 1.3 | 5 | 3% | 6 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 65.0 | 40 / 210 | 4.15 | 13.7% | 24726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 1.7 | 14.5% | 59 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.1% | 39 |
| hadur117.mini.DeiseWHPC 0.2 | 2.7 | 13.7% | 40 |
| nat.PallasHawk 1.0 | 3.5 | 13.3% | 53 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.2% | 12 |
| jrm.Test0 1.0 | 5.8 | 8.5% | 4 |
| jp.Perpy 16.0 | 7.7 | 7.1% | 0 |
| cs.sheldor.Talon 1.1 | 8.0 | 7.1% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.7% | 2 |
| stuff.Vlad 0.1 | 9.2 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 63.8 | 6 / 35 | 4085 |
| 2 | 3 | 60.4 | 65.1 | 7 / 35 | 4073 |
| 3 | 3 | 59.2 | 63.8 | 5 / 35 | 4139 |
| 4 | 4 | 58.7 | 62.5 | 5 / 35 | 3764 |
| 5 | 2 | 60.6 | 64.8 | 6 / 35 | 4410 |
| 6 | 1 | 62.5 | 69.8 | 11 / 35 | 4255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 22 | 27% |
| bts.wiki.RipCurl 0.9b | 22 | 73% |
| nat.PallasHawk 1.0 | 18 | 61% |
| brainfade.melee.Genghis 0.36 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 53 | 31% | 64 |
| nat.PallasHawk 1.0 | 28 | 16% | 38 |
| bts.wiki.RipCurl 0.9b | 26 | 15% | 38 |
| brainfade.melee.Genghis 0.36 | 23 | 14% | 25 |
| jrm.Test0 1.0 | 22 | 13% | 23 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 7 |
| jp.Perpy 16.0 | 5 | 3% | 7 |
| jaybot.bots.Oddball 4.0 | 4 | 2% | 4 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |

## Melee bench: F13

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 58.8 | 1 / 210 | 4.70 | 11.5% | 23097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 18.0% | 116 |
| ags.Glacier 0.2.11 | 1.7 | 17.5% | 54 |
| shinh.Entangled 0.3 | 3.3 | 12.6% | 24 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.0% | 13 |
| hadur117.mini.DeiseWHPC 0.2 | 4.5 | 11.5% | 1 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 2 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.0 | 54.6 | 0 / 35 | 3572 |
| 2 | 5 | 56.6 | 57.1 | 0 / 35 | 3765 |
| 3 | 3 | 59.7 | 67.3 | 1 / 35 | 4001 |
| 4 | 5 | 56.1 | 54.9 | 0 / 35 | 3831 |
| 5 | 4 | 57.6 | 59.0 | 0 / 35 | 4106 |
| 6 | 5 | 56.9 | 60.0 | 0 / 35 | 3822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 13 | 0% |
| mn.Combat 3.25.0 | 5 | 0% |
| shinh.Entangled 0.3 | 2 | 0% |
| gh.micro.Gruweltje 0.7 | 1 | 100% |

Hadur died in 209 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 77 | 37% | 77 |
| mn.Combat 3.25.0 | 55 | 26% | 56 |
| shinh.Entangled 0.3 | 34 | 16% | 34 |
| gh.micro.Gruweltje 0.7 | 19 | 9% | 19 |
| stelo.Wang 1.0 | 13 | 6% | 13 |
| apc.Colossus2 0.17 | 6 | 3% | 6 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| maribo.FollowFire 1 | 1 | 0% | 1 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.9 | 107 / 210 | 2.18 | 19.0% | 36368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.0 | 19.0% | 107 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 45 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 40 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 10.0% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.6% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.1% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 6.7 | 8.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 8.5% | 11 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.4 | 16 / 35 | 6175 |
| 2 | 1 | 70.0 | 90.2 | 19 / 35 | 6334 |
| 3 | 1 | 67.6 | 82.5 | 13 / 35 | 5884 |
| 4 | 1 | 68.9 | 85.4 | 18 / 35 | 6085 |
| 5 | 1 | 69.7 | 88.9 | 22 / 35 | 5981 |
| 6 | 1 | 69.7 | 89.8 | 19 / 35 | 5909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 76% |
| catcat20.shape.Theta 0.018 | 36 | 47% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 39 | 38% | 92 |
| catcat20.shape.Theta 0.018 | 35 | 34% | 54 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 6% | 20 |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 6% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 5% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 5% | 7 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.0 | 91 / 210 | 2.89 | 17.9% | 34614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.2 | 17.9% | 91 |
| emp.Yngwie 1.11 | 2.5 | 13.7% | 56 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.7% | 20 |
| mld.DustBunny 3.8 | 3.7 | 12.4% | 8 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.8% | 14 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.1% | 16 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.9% | 1 |
| lambdaxy.TBot 0.1 | 8.3 | 5.8% | 0 |
| divineomega.TrialBot 0.003 | 8.3 | 5.7% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 82.2 | 16 / 35 | 6174 |
| 2 | 1 | 68.4 | 80.3 | 20 / 35 | 6165 |
| 3 | 1 | 67.3 | 80.0 | 17 / 35 | 5453 |
| 4 | 2 | 62.4 | 68.3 | 5 / 35 | 4942 |
| 5 | 1 | 67.8 | 78.1 | 15 / 35 | 5924 |
| 6 | 1 | 69.0 | 85.1 | 18 / 35 | 5956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 47 | 55% |
| kawigi.micro.Shiz 1.1 | 25 | 100% |
| kawigi.robot.Girl 1.2 | 18 | 78% |
| cb.nano.Insomnia 1.0 | 14 | 86% |
| mld.DustBunny 3.8 | 14 | 93% |
| divineomega.TrialBot 0.003 | 2 | 50% |

Hadur died in 119 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 50 | 42% | 88 |
| mld.DustBunny 3.8 | 17 | 14% | 40 |
| cb.nano.Insomnia 1.0 | 16 | 13% | 17 |
| kawigi.micro.Shiz 1.1 | 15 | 13% | 24 |
| kawigi.robot.Girl 1.2 | 12 | 10% | 18 |
| Grystrion.TrackerWO 1.0 | 6 | 5% | 7 |
| divineomega.TrialBot 0.003 | 2 | 2% | 12 |
| lambdaxy.TBot 0.1 | 1 | 1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.7 | 31 / 210 | 3.55 | 15.8% | 33403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.2 | 17.4% | 92 |
| hadur117.mini.DeiseWHPC 0.2 | 1.8 | 15.8% | 31 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.8% | 55 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.4% | 12 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 8.9% | 5 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.4% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 5.4% | 2 |
| asd.Cthulhu 1.3 | 9.0 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.5 | 8 / 35 | 5904 |
| 2 | 2 | 62.2 | 67.3 | 2 / 35 | 5451 |
| 3 | 2 | 64.7 | 72.4 | 6 / 35 | 5581 |
| 4 | 2 | 62.8 | 68.9 | 7 / 35 | 5168 |
| 5 | 2 | 66.3 | 75.9 | 4 / 35 | 6058 |
| 6 | 2 | 62.9 | 68.3 | 4 / 35 | 5241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 53 | 25% |
| techdude.forest.FlamingForest 1.1 | 22 | 23% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 91 | 51% | 110 |
| techdude.forest.FlamingForest 1.1 | 39 | 22% | 44 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 8% | 16 |
| tvv.nano.Polaris 1.2 | 15 | 8% | 16 |
| bvh.fnr.Fenrir 0.36l | 11 | 6% | 12 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| divineomega.DivineBot 1.9.4.5 | 2 | 1% | 5 |
| stelo.IntrinsicVolatility 1.4 | 2 | 1% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 58.6 | 25 / 210 | 4.72 | 12.8% | 28814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.3 | 14.2% | 48 |
| cx.BlestPain 1.41 | 2.8 | 12.9% | 53 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.9% | 37 |
| hadur117.mini.DeiseWHPC 0.2 | 3.3 | 12.8% | 25 |
| nic.Nicator 2.4 | 5.0 | 11.2% | 15 |
| ahf.NanoAndrew .4 | 5.3 | 11.4% | 28 |
| maribo.melee.BMV 0.1 | 7.0 | 9.6% | 2 |
| tex.Longbot 0.4 | 8.3 | 6.4% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.3% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 62.5 | 4 / 35 | 5134 |
| 2 | 3 | 59.0 | 58.1 | 5 / 35 | 4865 |
| 3 | 5 | 56.2 | 52.7 | 4 / 35 | 4336 |
| 4 | 5 | 56.7 | 55.6 | 2 / 35 | 4395 |
| 5 | 3 | 58.1 | 56.2 | 6 / 35 | 4775 |
| 6 | 2 | 61.4 | 66.7 | 4 / 35 | 5309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 19 | 47% |
| ahf.NanoAndrew .4 | 9 | 11% |
| cx.BlestPain 1.41 | 8 | 0% |
| nic.Nicator 2.4 | 8 | 100% |
| oog.melee.Mercutio 1.0 | 6 | 83% |
| tex.Longbot 0.4 | 2 | 50% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 37 | 20% | 38 |
| et.Predator 1.8 | 34 | 18% | 43 |
| oog.melee.Mercutio 1.0 | 32 | 17% | 36 |
| ahf.NanoAndrew .4 | 31 | 17% | 32 |
| maribo.melee.BMV 0.1 | 25 | 13% | 27 |
| nic.Nicator 2.4 | 13 | 7% | 19 |
| tex.Longbot 0.4 | 12 | 6% | 12 |
| goblin.Bender 2.4 | 1 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 64.0 | 41 / 210 | 4.24 | 13.9% | 28418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.8 | 14.0% | 43 |
| agd.Mooserwirt2 2.7 | 2.2 | 13.2% | 60 |
| hadur117.mini.DeiseWHPC 0.2 | 2.3 | 13.9% | 41 |
| uji.DBH 1.1 | 3.8 | 11.7% | 27 |
| ratosh.Nobo 0.21 | 5.3 | 10.4% | 6 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.8% | 7 |
| sigterm.Sigterm 1.0 | 6.8 | 8.5% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.5% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.5% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 5.5% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.1 | 13 / 35 | 5366 |
| 2 | 4 | 56.2 | 54.9 | 2 / 35 | 4551 |
| 3 | 4 | 58.4 | 60.0 | 4 / 35 | 4503 |
| 4 | 1 | 61.9 | 67.3 | 10 / 35 | 4693 |
| 5 | 3 | 56.3 | 54.9 | 6 / 35 | 4332 |
| 6 | 1 | 61.7 | 68.9 | 6 / 35 | 4973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 32 | 69% |
| uji.DBH 1.1 | 14 | 29% |
| agd.Mooserwirt2 2.7 | 11 | 9% |
| sigterm.Sigterm 1.0 | 9 | 67% |
| ratosh.Nobo 0.21 | 5 | 100% |
| stelo.WangRobot 1.0 | 3 | 0% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 50% |
| spinnercat.Robovirus 2.718 | 2 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 47 | 28% | 52 |
| morbid.MorbidPriest 1.0 | 37 | 22% | 55 |
| agd.Mooserwirt2 2.7 | 34 | 20% | 42 |
| spinnercat.Robovirus 2.718 | 14 | 8% | 15 |
| ratosh.Nobo 0.21 | 12 | 7% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 6% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8 | 5% | 8 |
| sigterm.Sigterm 1.0 | 4 | 2% | 6 |
| stelo.WangRobot 1.0 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.2 | 159 / 210 | 1.70 | 20.9% | 37008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.0 | 20.9% | 159 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.4% | 16 |
| mld.Infinity 2.2 | 3.0 | 12.9% | 20 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 10.8% | 3 |
| erdnis.Rover 0.3 | 4.5 | 10.6% | 5 |
| patson.PatsonTestBot 1.0 | 6.2 | 9.4% | 2 |
| mbh.Mbh 0.1 | 7.0 | 7.3% | 0 |
| pac.ABC 2.1 | 8.0 | 6.6% | 5 |
| pbg.R2D2 1.0 | 8.8 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 95.6 | 29 / 35 | 6038 |
| 2 | 1 | 73.0 | 95.2 | 27 / 35 | 6688 |
| 3 | 1 | 71.2 | 91.1 | 25 / 35 | 6034 |
| 4 | 1 | 70.2 | 87.6 | 24 / 35 | 5533 |
| 5 | 1 | 71.7 | 90.5 | 27 / 35 | 6437 |
| 6 | 1 | 72.1 | 93.3 | 27 / 35 | 6278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 95 | 94% |
| mld.Infinity 2.2 | 29 | 72% |
| krillr.mini.JointStrike 2.0.0 | 18 | 100% |
| erdnis.Rover 0.3 | 10 | 80% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| pac.ABC 2.1 | 6 | 83% |
| pbg.R2D2 1.0 | 6 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 26% | 59 |
| mld.Infinity 2.2 | 11 | 21% | 34 |
| erdnis.Rover 0.3 | 10 | 19% | 34 |
| krillr.mini.JointStrike 2.0.0 | 8 | 15% | 22 |
| patson.PatsonTestBot 1.0 | 6 | 11% | 25 |
| pac.ABC 2.1 | 2 | 4% | 17 |
| pbg.R2D2 1.0 | 1 | 2% | 8 |
| mbh.Mbh 0.1 | 1 | 2% | 8 |

## Melee bench: F20

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.3 | 62 / 210 | 2.77 | 17.9% | 37131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.2 | 17.9% | 62 |
| trm.Wrekt 1.1.6.f | 1.8 | 17.0% | 88 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 10.5% | 6 |
| fwb.Nine 1.0.1 | 4.2 | 10.3% | 17 |
| catcat20.Rabbit 0.001 | 4.2 | 10.5% | 24 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.3% | 1 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.7% | 8 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.3% | 3 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 6.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.5 | 13 / 35 | 6041 |
| 2 | 1 | 70.2 | 88.3 | 15 / 35 | 6951 |
| 3 | 1 | 67.0 | 79.4 | 8 / 35 | 6304 |
| 4 | 2 | 66.3 | 75.9 | 7 / 35 | 6125 |
| 5 | 1 | 66.5 | 79.0 | 11 / 35 | 5949 |
| 6 | 1 | 65.1 | 75.9 | 8 / 35 | 5761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 77 | 39% |
| catcat20.Rabbit 0.001 | 22 | 64% |
| nz.jdc.nano.GridFu 1.0 | 10 | 90% |
| fwb.Nine 1.0.1 | 9 | 22% |
| bayen.nut.Squirrel 1.615 | 6 | 67% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 0% |

Hadur died in 148 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 85 | 57% | 109 |
| catcat20.Rabbit 0.001 | 19 | 13% | 36 |
| fwb.Nine 1.0.1 | 14 | 9% | 12 |
| nz.jdc.nano.GridFu 1.0 | 11 | 7% | 20 |
| bayen.nut.Squirrel 1.615 | 9 | 6% | 13 |
| ntc.ControlledChaos 1.1.4 | 6 | 4% | 9 |
| m3thos.mini.Eva01 0.5.5 | 3 | 2% | 6 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.2 | 82 / 210 | 2.33 | 18.7% | 35796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.3 | 18.7% | 82 |
| eem.EvBot v4.6.16 | 1.7 | 17.2% | 95 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 13 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 11 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.4% | 1 |
| eld.Hmm 1.0 | 5.7 | 8.6% | 10 |
| fire219.CatBot 1.0 | 7.3 | 6.7% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.2 | 13 / 35 | 5937 |
| 2 | 1 | 69.8 | 87.6 | 16 / 35 | 6432 |
| 3 | 2 | 68.8 | 84.8 | 11 / 35 | 6153 |
| 4 | 1 | 69.9 | 88.6 | 16 / 35 | 6063 |
| 5 | 1 | 69.6 | 89.8 | 18 / 35 | 5849 |
| 6 | 2 | 66.1 | 78.1 | 8 / 35 | 5362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 83 | 48% |
| dummy.mini.Scimitar 1.01 | 20 | 85% |
| cf.RiO.RiOx 4.2.1 | 17 | 71% |
| eld.Hmm 1.0 | 11 | 73% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 1044. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 85 | 65% | 122 |
| dummy.mini.Scimitar 1.01 | 17 | 13% | 30 |
| cf.RiO.RiOx 4.2.1 | 14 | 11% | 23 |
| eld.Hmm 1.0 | 7 | 5% | 18 |
| oa.weak.BotherBot 0.1 | 3 | 2% | 12 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 71.4 | 27 / 210 | 3.57 | 15.1% | 31527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.0 | 18.3% | 104 |
| kvk.HebusLeTroll 0.35 | 2.3 | 15.6% | 43 |
| hadur117.mini.DeiseWHPC 0.2 | 2.7 | 15.1% | 27 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.6% | 23 |
| bigpete.Stewie 1.0 | 4.8 | 11.6% | 13 |
| yk.JahRoslav 1.1 | 6.3 | 6.7% | 1 |
| tad.Dalek98 0.98 | 7.2 | 6.2% | 1 |
| gg.Squaraus 0.6 | 7.5 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.7% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.3 | 71.1 | 3 / 35 | 5430 |
| 2 | 3 | 62.9 | 67.9 | 3 / 35 | 5404 |
| 3 | 3 | 66.3 | 78.7 | 5 / 35 | 5402 |
| 4 | 3 | 61.3 | 63.8 | 2 / 35 | 4765 |
| 5 | 2 | 63.6 | 71.4 | 4 / 35 | 5263 |
| 6 | 2 | 65.2 | 75.6 | 10 / 35 | 5263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 22 | 9% |
| kvk.HebusLeTroll 0.35 | 19 | 68% |
| jlm.javaDisturbance 0.59 | 15 | 47% |
| bigpete.Stewie 1.0 | 6 | 50% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |

Hadur died in 184 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 103 | 56% | 109 |
| kvk.HebusLeTroll 0.35 | 36 | 20% | 46 |
| jlm.javaDisturbance 0.59 | 23 | 13% | 28 |
| bigpete.Stewie 1.0 | 14 | 8% | 17 |
| tad.Dalek98 0.98 | 4 | 2% | 4 |
| yk.JahRoslav 1.1 | 3 | 2% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.3 | 45 / 210 | 2.78 | 16.8% | 32107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.2 | 18.7% | 107 |
| hadur117.mini.DeiseWHPC 0.2 | 1.8 | 16.8% | 45 |
| cre.Karolos 0.32 | 3.0 | 14.6% | 38 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.3% | 7 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.4% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.5% | 1 |
| sample.Walls 1.0 | 6.8 | 8.0% | 3 |
| cw.megas.Blade 0.8 | 7.2 | 7.9% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.8 | 9 / 35 | 5571 |
| 2 | 2 | 67.2 | 80.0 | 9 / 35 | 5463 |
| 3 | 2 | 66.1 | 78.1 | 7 / 35 | 5242 |
| 4 | 2 | 66.9 | 80.3 | 6 / 35 | 5522 |
| 5 | 2 | 65.8 | 77.5 | 6 / 35 | 5047 |
| 6 | 2 | 67.2 | 81.0 | 8 / 35 | 5262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 68 | 10% |
| cre.Karolos 0.32 | 23 | 35% |
| stelo.AreaTargetingBot 1.1 | 19 | 95% |
| stelo.RamTrackSurfer 1.2 | 6 | 33% |
| sample.Walls 1.0 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 107 | 65% | 125 |
| cre.Karolos 0.32 | 41 | 25% | 52 |
| stelo.RamTrackSurfer 1.2 | 8 | 5% | 15 |
| stelo.AreaTargetingBot 1.1 | 7 | 4% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 3 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |
| cw.megas.Blade 0.8 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 55.9 | 12 / 210 | 4.97 | 11.5% | 22794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 1.7 | 14.3% | 54 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.0% | 46 |
| davidalves.Phoenix 0.54 | 2.7 | 13.5% | 54 |
| hadur117.mini.DeiseWHPC 0.2 | 4.2 | 11.5% | 12 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.5% | 21 |
| oog.melee.Corsair 1.0 | 5.7 | 10.4% | 13 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.2% | 11 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.8% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 5.1% | 0 |
| evd.X1 0.01 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.3 | 47.0 | 2 / 35 | 3243 |
| 2 | 4 | 57.4 | 57.8 | 6 / 35 | 4056 |
| 3 | 3 | 56.6 | 60.6 | 1 / 35 | 3803 |
| 4 | 4 | 56.2 | 56.2 | 2 / 35 | 3782 |
| 5 | 6 | 55.0 | 53.7 | 1 / 35 | 3849 |
| 6 | 3 | 57.2 | 60.3 | 0 / 35 | 4061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 6 | 50% |
| florent.XSeries.X2 0.12 | 5 | 60% |
| davidalves.Phoenix 0.54 | 4 | 25% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| pedersen.Ugluk 1.1.1 | 3 | 0% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 47 | 24% | 50 |
| florent.XSeries.X2 0.12 | 45 | 23% | 48 |
| davidalves.Phoenix 0.54 | 30 | 15% | 33 |
| oog.melee.Corsair 1.0 | 30 | 15% | 32 |
| pedersen.Ugluk 1.1.1 | 21 | 11% | 22 |
| stelo.SoJNanoMelee 1.1 | 14 | 7% | 14 |
| evd.X1 0.01 | 5 | 3% | 5 |
| as.FrankTheTank 1.3 | 3 | 2% | 3 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 77.5 | 97 / 210 | 3.03 | 17.0% | 27991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.0 | 17.0% | 97 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.1% | 26 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.2% | 29 |
| jdw.Hurricane 1.4 | 3.7 | 11.3% | 21 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.7% | 15 |
| ds.Oo 2.2 | 5.8 | 9.3% | 12 |
| gjr.Cephalosporin 0.1 | 7.3 | 8.0% | 7 |
| awesomeness.Elite 1.0 | 7.7 | 7.8% | 2 |
| adt.Ar2 1.1 | 9.0 | 5.9% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.1 | 21 / 35 | 5007 |
| 2 | 1 | 64.3 | 75.9 | 15 / 35 | 4300 |
| 3 | 1 | 64.6 | 75.9 | 14 / 35 | 4419 |
| 4 | 1 | 64.9 | 73.7 | 14 / 35 | 4826 |
| 5 | 1 | 66.2 | 78.4 | 18 / 35 | 4994 |
| 6 | 1 | 65.1 | 76.8 | 15 / 35 | 4445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 40 | 88% |
| voidious.micro.BlitzBat 1.05 | 29 | 90% |
| jdw.Hurricane 1.4 | 16 | 94% |
| gre.svman4.Morfeas 1.4.1 | 10 | 30% |
| ds.Oo 2.2 | 9 | 89% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |
| adt.Ar2 1.1 | 2 | 50% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 26 | 23% | 57 |
| voidious.micro.BlitzBat 1.05 | 24 | 21% | 41 |
| gre.svman4.Morfeas 1.4.1 | 15 | 13% | 20 |
| awesomeness.Elite 1.0 | 12 | 11% | 17 |
| ds.Oo 2.2 | 10 | 9% | 24 |
| jdw.Hurricane 1.4 | 10 | 9% | 23 |
| gjr.Cephalosporin 0.1 | 8 | 7% | 19 |
| adt.Ar2 1.1 | 5 | 4% | 6 |
| amk.ChumbaMini 0.2 | 3 | 3% | 3 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.2 | 43 / 210 | 3.41 | 15.9% | 34909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.5 | 15.9% | 43 |
| ak.Fermat 2.0 | 1.5 | 16.5% | 81 |
| lrem.Spectre 0.4.4 | 3.3 | 12.8% | 26 |
| shu.nitro.LENIN .T34 | 4.0 | 11.8% | 27 |
| js.PinBall 1.6 | 5.2 | 10.6% | 12 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 10.0% | 11 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.7% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.0% | 6 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.3 | 8 / 35 | 6382 |
| 2 | 2 | 63.6 | 69.5 | 6 / 35 | 5338 |
| 3 | 1 | 64.3 | 72.7 | 7 / 35 | 5657 |
| 4 | 2 | 65.2 | 73.0 | 6 / 35 | 5731 |
| 5 | 1 | 65.4 | 73.0 | 7 / 35 | 5879 |
| 6 | 2 | 66.3 | 76.5 | 9 / 35 | 5922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 29 | 24% |
| lrem.Spectre 0.4.4 | 25 | 80% |
| shu.nitro.LENIN .T34 | 10 | 70% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 71% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 50% |
| js.PinBall 1.6 | 4 | 50% |

Hadur died in 168 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 80 | 48% | 88 |
| js.PinBall 1.6 | 20 | 12% | 24 |
| shu.nitro.LENIN .T34 | 18 | 11% | 29 |
| lrem.Spectre 0.4.4 | 17 | 10% | 28 |
| jaybot.adv.bots.JayBot 2.0 | 13 | 8% | 17 |
| gh.mini.GrubbmOne 1.0 | 13 | 8% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 4% | 7 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 76.5 | 61 / 210 | 3.12 | 16.5% | 30913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.3 | 16.5% | 61 |
| mk.Alpha 0.2.1 | 1.7 | 15.7% | 93 |
| EH.Eagle 1.0.6 | 4.0 | 11.1% | 6 |
| wee.Gem 1.8.4 | 4.0 | 11.0% | 26 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.9% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.2% | 4 |
| joe.ADinosaur 1.0 | 6.7 | 8.4% | 2 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.2% | 7 |
| caimano.Furia_Ceca 0.22 | 8.8 | 5.6% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 73.3 | 6 / 35 | 4874 |
| 2 | 1 | 66.7 | 81.6 | 13 / 35 | 5320 |
| 3 | 1 | 65.8 | 81.0 | 14 / 35 | 4819 |
| 4 | 2 | 62.7 | 61.0 | 10 / 35 | 5327 |
| 5 | 2 | 65.9 | 81.6 | 8 / 35 | 5123 |
| 6 | 1 | 66.0 | 80.3 | 10 / 35 | 5450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 58 | 21% |
| wee.Gem 1.8.4 | 19 | 68% |
| EH.Eagle 1.0.6 | 16 | 94% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 80% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 75 | 50% | 91 |
| wee.Gem 1.8.4 | 23 | 15% | 39 |
| EH.Eagle 1.0.6 | 12 | 8% | 22 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 8% | 22 |
| joe.ADinosaur 1.0 | 9 | 6% | 11 |
| throxbot.ThroxBot 0.1 | 9 | 6% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 3% | 9 |
| caimano.Furia_Ceca 0.22 | 3 | 2% | 4 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.8 | 62 / 210 | 2.91 | 16.4% | 28113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.0 | 16.4% | 62 |
| kid.test.NightFox .2 | 2.0 | 14.3% | 42 |
| uji.Antique 1.0 | 3.2 | 12.9% | 53 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.5% | 31 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.9% | 11 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 5 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.9% | 2 |
| matt.advanced.Katana 1.0 | 8.2 | 6.8% | 4 |
| stelo.PianistNano 1.2 | 8.8 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 77.8 | 10 / 35 | 4690 |
| 2 | 1 | 64.5 | 77.1 | 10 / 35 | 4611 |
| 3 | 1 | 66.1 | 83.5 | 12 / 35 | 4831 |
| 4 | 1 | 65.8 | 80.3 | 13 / 35 | 4770 |
| 5 | 1 | 62.5 | 72.1 | 8 / 35 | 4569 |
| 6 | 1 | 65.3 | 81.9 | 9 / 35 | 4642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 50 | 76% |
| uji.Antique 1.0 | 40 | 25% |
| qohnil.blot.BlotBot 3.61 | 17 | 18% |
| pfvicm.Sobieski 7.2.3b | 7 | 57% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |
| matt.advanced.Katana 1.0 | 2 | 0% |
| ahr.ice.Ice 1.0.2 | 1 | 0% |

Hadur died in 149 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 57 | 38% | 72 |
| qohnil.blot.BlotBot 3.61 | 27 | 18% | 41 |
| pfvicm.Sobieski 7.2.3b | 25 | 17% | 32 |
| kid.test.NightFox .2 | 18 | 12% | 29 |
| amk.ChumbaWumba 0.3 | 7 | 5% | 13 |
| ahr.ice.Ice 1.0.2 | 6 | 4% | 8 |
| stelo.PianistNano 1.2 | 5 | 3% | 8 |
| matt.advanced.Katana 1.0 | 3 | 2% | 3 |
| stelo.Lifestealer 1.0 | 1 | 1% | 4 |

## Melee bench: F29

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 72.2 | 32 / 210 | 3.50 | 15.8% | 30996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.8 | 16.2% | 75 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 16.4% | 87 |
| hadur117.mini.DeiseWHPC 0.2 | 2.3 | 15.8% | 32 |
| jok.PheonixM 0.1.2 | 4.5 | 10.6% | 5 |
| myl.micro.Troodon 1.10 | 4.7 | 10.6% | 4 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.8% | 1 |
| DBall.Anarchy 0.1 | 7.3 | 6.5% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.2 | 5.0% | 2 |
| jangs.ns51 1.0 | 9.7 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 79.7 | 8 / 35 | 5672 |
| 2 | 3 | 64.1 | 69.5 | 7 / 35 | 5058 |
| 3 | 3 | 61.2 | 64.8 | 4 / 35 | 4644 |
| 4 | 2 | 63.7 | 70.8 | 4 / 35 | 5169 |
| 5 | 2 | 66.1 | 76.8 | 4 / 35 | 5413 |
| 6 | 3 | 64.2 | 71.7 | 5 / 35 | 5040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 41 | 15% |
| zyx.mega.YersiniaPestis 3.1 | 34 | 12% |
| myl.micro.Troodon 1.10 | 11 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 4 | 75% |
| jok.PheonixM 0.1.2 | 4 | 75% |
| jangs.ns51 1.0 | 2 | 50% |

Hadur died in 178 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 80 | 45% | 92 |
| zyx.mega.YersiniaPestis 3.1 | 73 | 41% | 79 |
| jok.PheonixM 0.1.2 | 9 | 5% | 13 |
| myl.micro.Troodon 1.10 | 7 | 4% | 13 |
| ph.melee.ArcherME 0.3 | 5 | 3% | 7 |
| jangs.ns51 1.0 | 2 | 1% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |

## Melee bench: F30

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.8 | 47.0 | 3 / 210 | 5.77 | 9.8% | 21042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.6% | 64 |
| darkcanuck.B26354 1.06 | 2.2 | 14.3% | 52 |
| stelo.PastFuture 2.3.2 | 2.7 | 13.8% | 40 |
| oog.melee.Capulet 1.2 | 3.3 | 13.4% | 33 |
| hadur117.mini.DeiseWHPC 0.2 | 5.0 | 9.8% | 3 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.6% | 9 |
| ntc.Opposite 1.5 | 7.5 | 7.9% | 2 |
| tripphippy.Alice 1.1 | 8.0 | 7.1% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.7% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 50.1 | 41.9 | 1 / 35 | 3396 |
| 2 | 5 | 51.7 | 46.7 | 1 / 35 | 3448 |
| 3 | 5 | 53.8 | 50.2 | 0 / 35 | 3738 |
| 4 | 5 | 51.8 | 47.9 | 0 / 35 | 3663 |
| 5 | 5 | 50.8 | 47.0 | 1 / 35 | 3233 |
| 6 | 5 | 52.5 | 48.3 | 0 / 35 | 3564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.PastFuture 2.3.2 | 5 | 20% |
| oog.melee.Capulet 1.2 | 3 | 67% |
| darkcanuck.B26354 1.06 | 3 | 0% |
| intruder.PrairieWolf 2.61 | 1 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 46 | 22% | 46 |
| catcat20.Matcha 0.006 | 42 | 20% | 43 |
| stelo.PastFuture 2.3.2 | 36 | 17% | 37 |
| oog.melee.Capulet 1.2 | 28 | 14% | 31 |
| fowl3628800.LightningBolt 2.6.0 | 16 | 8% | 15 |
| tripphippy.Alice 1.1 | 15 | 7% | 15 |
| ntc.Opposite 1.5 | 14 | 7% | 14 |
| intruder.PrairieWolf 2.61 | 10 | 5% | 9 |

## Melee bench: F31

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 55.7 | 7 / 210 | 4.99 | 11.3% | 20869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.4% | 142 |
| gh.mini.Griezel 0.2 | 2.5 | 13.8% | 39 |
| d414.nano.Quantum 1.0.0 | 2.8 | 12.3% | 9 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.2% | 5 |
| hadur117.mini.DeiseWHPC 0.2 | 4.5 | 11.3% | 7 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.5% | 6 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.1% | 2 |
| fm.mammillarias 1.3 | 8.2 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.5 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 58.4 | 2 / 35 | 3573 |
| 2 | 4 | 54.6 | 53.7 | 0 / 35 | 3435 |
| 3 | 4 | 56.3 | 57.5 | 2 / 35 | 3499 |
| 4 | 6 | 52.9 | 49.8 | 0 / 35 | 3256 |
| 5 | 4 | 56.7 | 57.5 | 2 / 35 | 3537 |
| 6 | 5 | 56.7 | 57.5 | 1 / 35 | 3569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 13 | 0% |
| gh.mini.Griezel 0.2 | 6 | 0% |
| d414.nano.Quantum 1.0.0 | 5 | 80% |
| spinnercat.micro.Tyger 0.1 | 3 | 100% |

Hadur died in 204 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 66 | 32% | 68 |
| gh.mini.Griezel 0.2 | 56 | 27% | 56 |
| d414.nano.Quantum 1.0.0 | 23 | 11% | 24 |
| spinnercat.micro.Tyger 0.1 | 22 | 11% | 25 |
| timmit.nano.TimDog 0.33 | 12 | 6% | 12 |
| gh.nano.Grofvuil 0.2 | 11 | 5% | 12 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 3% | 6 |
| fm.mammillarias 1.3 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 70.5 | 47 / 210 | 3.65 | 14.7% | 27977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.5% | 77 |
| hadur117.mini.DeiseWHPC 0.2 | 1.8 | 14.7% | 47 |
| apc.botM 3.0 | 2.8 | 13.3% | 50 |
| lxx.ConceptA 0.8 | 4.5 | 10.2% | 8 |
| vjik.UnViolation 1.1 | 5.3 | 10.0% | 12 |
| bayen.UbaMicro 1.4 | 5.5 | 9.8% | 7 |
| panzer.Panzer 0.2 | 7.3 | 7.7% | 4 |
| conscience.Electron 1.3g | 8.2 | 7.0% | 2 |
| yk.JahMicro 1.0 | 8.3 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.7 | 62.9 | 4 / 35 | 4589 |
| 2 | 1 | 63.0 | 72.1 | 14 / 35 | 4656 |
| 3 | 2 | 61.7 | 68.9 | 8 / 35 | 4687 |
| 4 | 3 | 59.7 | 64.4 | 4 / 35 | 4594 |
| 5 | 1 | 65.8 | 82.9 | 11 / 35 | 4919 |
| 6 | 2 | 61.7 | 72.1 | 6 / 35 | 4532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 49 | 33% |
| apc.botM 3.0 | 21 | 29% |
| vjik.UnViolation 1.1 | 10 | 70% |
| lxx.ConceptA 0.8 | 8 | 88% |
| bayen.UbaMicro 1.4 | 7 | 71% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 59 | 36% | 77 |
| apc.botM 3.0 | 41 | 25% | 48 |
| lxx.ConceptA 0.8 | 16 | 10% | 17 |
| bayen.UbaMicro 1.4 | 13 | 8% | 15 |
| conscience.Electron 1.3g | 10 | 6% | 13 |
| panzer.Panzer 0.2 | 10 | 6% | 12 |
| vjik.UnViolation 1.1 | 9 | 5% | 22 |
| yk.JahMicro 1.0 | 4 | 2% | 4 |
| donjezza.Jezza 1.0 | 2 | 1% | 2 |

## Melee bench: F33

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 62.5 | 28 / 210 | 4.37 | 13.7% | 28492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.2 | 17.3% | 89 |
| hadur117.mini.DeiseWHPC 0.2 | 2.3 | 13.7% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.7% | 23 |
| labg.Cataclysm 2.05 | 4.2 | 11.4% | 32 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.4% | 23 |
| baal.nano.N 1.42 | 6.5 | 9.4% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 9.0% | 8 |
| zyx.micro.Ant 1.1 | 8.2 | 5.8% | 1 |
| sanja.First 0.1 | 9.2 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 64.4 | 8 / 35 | 4785 |
| 2 | 5 | 56.1 | 51.4 | 0 / 35 | 4295 |
| 3 | 2 | 61.2 | 64.1 | 3 / 35 | 4848 |
| 4 | 2 | 60.6 | 61.3 | 5 / 35 | 4935 |
| 5 | 1 | 64.0 | 74.0 | 6 / 35 | 5040 |
| 6 | 2 | 59.6 | 60.0 | 6 / 35 | 4589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 50% |
| maribo.Quester 0.3 | 17 | 24% |
| gre.svman4.Leonidas 1.3.2 | 12 | 42% |
| labg.Cataclysm 2.05 | 7 | 29% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 100% |
| baal.nano.N 1.42 | 3 | 67% |
| sanja.First 0.1 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 62 | 34% | 65 |
| labg.Cataclysm 2.05 | 29 | 16% | 35 |
| gre.svman4.Leonidas 1.3.2 | 27 | 15% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 14% | 35 |
| kinsen.melee.Angsaichmophobia 1.8c | 15 | 8% | 17 |
| baal.nano.N 1.42 | 12 | 7% | 15 |
| zyx.micro.Ant 1.1 | 5 | 3% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 2% | 4 |
| sanja.First 0.1 | 4 | 2% | 3 |

## Melee bench: F34

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 62.8 | 8 / 210 | 4.35 | 13.0% | 27804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 18.1% | 73 |
| stelo.Spread 0.9 | 1.7 | 18.0% | 101 |
| hadur117.mini.DeiseWHPC 0.2 | 3.3 | 13.0% | 8 |
| tcf.Reach 3 | 4.0 | 11.5% | 11 |
| jcs.Seth 1.8 | 5.0 | 10.7% | 11 |
| cli.Dancer 1.1 | 5.7 | 9.8% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 67.3 | 2 / 35 | 4588 |
| 2 | 3 | 63.3 | 67.6 | 2 / 35 | 5221 |
| 3 | 4 | 57.1 | 54.9 | 0 / 35 | 4309 |
| 4 | 3 | 60.6 | 61.9 | 1 / 35 | 4494 |
| 5 | 4 | 58.7 | 60.3 | 1 / 35 | 4169 |
| 6 | 3 | 61.6 | 64.4 | 2 / 35 | 5023 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 15 | 13% |
| stelo.Spread 0.9 | 14 | 21% |
| tcf.Reach 3 | 3 | 0% |
| jcs.Seth 1.8 | 3 | 67% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 203 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 74 | 36% | 77 |
| stelo.Spread 0.9 | 62 | 31% | 63 |
| tcf.Reach 3 | 34 | 17% | 34 |
| cli.Dancer 1.1 | 15 | 7% | 16 |
| jcs.Seth 1.8 | 11 | 5% | 13 |
| ratosh.Wesco 1.4 | 7 | 3% | 7 |

## Melee bench: F35

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 60.5 | 2 / 210 | 4.56 | 12.0% | 22599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 171 |
| gh.mini.Gruwel 0.9 | 2.0 | 13.6% | 19 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.6% | 13 |
| hadur117.mini.DeiseWHPC 0.2 | 4.0 | 12.0% | 2 |
| rz.HawkOnFire 0.1 | 4.5 | 11.8% | 4 |
| wit.Chuliath 1.0 | 6.3 | 7.5% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 7.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.5% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 60.6 | 0 / 35 | 3830 |
| 2 | 3 | 59.6 | 63.8 | 1 / 35 | 4073 |
| 3 | 5 | 56.3 | 57.1 | 1 / 35 | 3508 |
| 4 | 5 | 57.9 | 59.7 | 0 / 35 | 3888 |
| 5 | 4 | 56.7 | 59.7 | 0 / 35 | 3458 |
| 6 | 3 | 58.5 | 61.9 | 0 / 35 | 3842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 20 | 0% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 25% |
| gh.mini.Gruwel 0.9 | 2 | 0% |
| wit.Chuliath 1.0 | 2 | 0% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 208 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 82 | 39% | 82 |
| dmh.robocode.robot.BlackDeath 9.2 | 46 | 22% | 47 |
| gh.mini.Gruwel 0.9 | 44 | 21% | 44 |
| rz.HawkOnFire 0.1 | 12 | 6% | 12 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 9 | 4% | 9 |
| myl.nano.KomoriNinja 1.1 | 7 | 3% | 8 |
| wit.Chuliath 1.0 | 5 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 0% | 1 |

## Melee bench: F36

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.0 | 106 / 210 | 2.62 | 18.8% | 35879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.0 | 18.8% | 106 |
| alpha.RainingFire 1.0 | 2.3 | 12.1% | 25 |
| bzdp.Pansy 2.1 | 3.0 | 11.7% | 19 |
| bvh.micro.Freya 0.3 | 4.5 | 11.0% | 25 |
| mz.Cork 0.1 | 4.8 | 10.5% | 13 |
| m3thos.Eva02 0.7.1 | 5.5 | 10.5% | 9 |
| bvh.mini.Fenrir 0.39 | 6.8 | 8.7% | 4 |
| dl.BetterWalls 1.0 | 8.2 | 7.0% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.8% | 2 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 85.4 | 20 / 35 | 6288 |
| 2 | 1 | 69.2 | 85.4 | 17 / 35 | 6345 |
| 3 | 1 | 68.5 | 83.2 | 17 / 35 | 5987 |
| 4 | 1 | 67.3 | 79.7 | 17 / 35 | 5572 |
| 5 | 1 | 66.8 | 77.5 | 17 / 35 | 5732 |
| 6 | 1 | 68.1 | 81.0 | 18 / 35 | 5955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 40 | 80% |
| alpha.RainingFire 1.0 | 26 | 65% |
| mz.Cork 0.1 | 21 | 86% |
| bvh.micro.Freya 0.3 | 20 | 60% |
| m3thos.Eva02 0.7.1 | 12 | 83% |
| bvh.mini.Fenrir 0.39 | 12 | 100% |
| dl.BetterWalls 1.0 | 5 | 60% |
| sample.MyFirstRobot 1.0 | 3 | 67% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |

Hadur died in 105 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.Cork 0.1 | 22 | 21% | 40 |
| alpha.RainingFire 1.0 | 21 | 20% | 40 |
| bvh.micro.Freya 0.3 | 20 | 19% | 36 |
| bzdp.Pansy 2.1 | 13 | 12% | 35 |
| bvh.mini.Fenrir 0.39 | 8 | 8% | 17 |
| m3thos.Eva02 0.7.1 | 7 | 7% | 21 |
| dl.BetterWalls 1.0 | 6 | 6% | 11 |
| squidM.TentalceMeleeNano 1.1 | 5 | 5% | 6 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.0 | 119 / 210 | 2.53 | 17.9% | 34150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.0 | 17.9% | 119 |
| germ.TheMind .2 | 3.5 | 10.4% | 11 |
| agrach.Dalek 1.0 | 3.7 | 10.3% | 31 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 10.1% | 12 |
| EBBU.Sim2 1.02 | 4.3 | 9.8% | 6 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.4% | 14 |
| mb.Beast 0.1 | 7.2 | 8.4% | 8 |
| lmk.ACPFinal 0.1 | 7.8 | 8.1% | 3 |
| skm.Ryubot 1.0 | 8.7 | 7.8% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 21 / 35 | 5946 |
| 2 | 1 | 67.3 | 84.4 | 22 / 35 | 5810 |
| 3 | 1 | 64.4 | 77.5 | 16 / 35 | 5569 |
| 4 | 1 | 68.0 | 87.3 | 22 / 35 | 5834 |
| 5 | 1 | 65.5 | 81.6 | 20 / 35 | 5284 |
| 6 | 1 | 66.2 | 82.5 | 18 / 35 | 5707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 29 | 97% |
| stelo.UntouchableNano 1.3 | 23 | 83% |
| agrach.Dalek 1.0 | 23 | 65% |
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 75% |
| EBBU.Sim2 1.02 | 13 | 77% |
| mb.Beast 0.1 | 13 | 92% |
| skm.Ryubot 1.0 | 11 | 100% |
| lmk.ACPFinal 0.1 | 11 | 91% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 493. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 23 | 25% | 45 |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 21% | 44 |
| stelo.UntouchableNano 1.3 | 14 | 15% | 25 |
| mb.Beast 0.1 | 10 | 11% | 31 |
| EBBU.Sim2 1.02 | 9 | 10% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 10% | 16 |
| lmk.ACPFinal 0.1 | 6 | 7% | 12 |
| germ.TheMind .2 | 2 | 2% | 15 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

## Melee bench: F38

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 58.8 | 16 / 210 | 4.71 | 12.0% | 22921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.2% | 102 |
| bts.mega.Gnarly 1.4 | 3.3 | 12.5% | 41 |
| hadur117.mini.DeiseWHPC 0.2 | 3.5 | 12.0% | 16 |
| bvh.mini.Freya 0.55 | 3.5 | 12.5% | 23 |
| cs.Wren 1.0 | 4.7 | 11.0% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.2% | 8 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.8% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.7% | 2 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 58.4 | 6 / 35 | 3699 |
| 2 | 4 | 56.0 | 56.2 | 1 / 35 | 3809 |
| 3 | 4 | 56.1 | 55.2 | 1 / 35 | 3911 |
| 4 | 5 | 56.1 | 55.9 | 1 / 35 | 3711 |
| 5 | 2 | 60.8 | 67.9 | 4 / 35 | 4250 |
| 6 | 3 | 56.7 | 59.0 | 3 / 35 | 3541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 16 | 0% |
| bvh.mini.Freya 0.55 | 7 | 43% |
| cs.Wren 1.0 | 6 | 100% |
| bts.mega.Gnarly 1.4 | 6 | 50% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 80 | 41% | 81 |
| bts.mega.Gnarly 1.4 | 39 | 20% | 42 |
| kdf.KoulDestroyer 1.0 | 22 | 11% | 23 |
| bvh.mini.Freya 0.55 | 18 | 9% | 20 |
| cs.Wren 1.0 | 14 | 7% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 6% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 3% | 5 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 3 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 67.2 | 39 / 210 | 3.95 | 14.3% | 29125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.8% | 43 |
| hadur117.mini.DeiseWHPC 0.2 | 2.2 | 14.3% | 39 |
| az.Ololobot 0.2.4 | 2.7 | 13.9% | 78 |
| catcat20.Lambda 0.024 | 4.0 | 11.4% | 27 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.4% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 6.5 | 8.4% | 11 |
| gimp.GimpBot 0.1 | 6.7 | 7.9% | 4 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.2% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.5 | 66.3 | 3 / 35 | 4331 |
| 2 | 3 | 59.6 | 64.4 | 6 / 35 | 4417 |
| 3 | 3 | 59.1 | 61.0 | 5 / 35 | 4820 |
| 4 | 2 | 63.0 | 69.8 | 9 / 35 | 5176 |
| 5 | 2 | 60.9 | 66.0 | 6 / 35 | 4795 |
| 6 | 1 | 64.7 | 75.9 | 10 / 35 | 5586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 23 | 87% |
| az.Ololobot 0.2.4 | 21 | 19% |
| catcat20.Lambda 0.024 | 7 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 5 | 40% |
| gimp.GimpBot 0.1 | 2 | 50% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 53 | 31% | 62 |
| bvh.fry.Freya 0.82 | 40 | 23% | 50 |
| catcat20.Lambda 0.024 | 25 | 15% | 30 |
| winamp32.micro.MicroMacro 1.0 | 12 | 7% | 17 |
| gimp.GimpBot 0.1 | 12 | 7% | 16 |
| apollokidd.ApolloKidd 0.9 | 9 | 5% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 5% | 10 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 5% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 4 | 2% | 6 |

## Melee bench: F40

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 74.1 | 60 / 210 | 3.33 | 16.2% | 31520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 1.3 | 16.4% | 79 |
| hadur117.mini.DeiseWHPC 0.2 | 1.7 | 16.2% | 60 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.4% | 35 |
| mz.AntiGrav 1.0 | 4.2 | 11.0% | 11 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.0% | 10 |
| stelo.Randomness 1.0 | 5.7 | 9.4% | 10 |
| alpha.BlackIce 1.0 | 6.8 | 8.7% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.8% | 1 |
| sample.Corners 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 75.9 | 9 / 35 | 5755 |
| 2 | 1 | 65.7 | 76.2 | 11 / 35 | 5527 |
| 3 | 2 | 62.6 | 68.9 | 6 / 35 | 4826 |
| 4 | 1 | 65.7 | 76.8 | 11 / 35 | 5447 |
| 5 | 2 | 63.5 | 70.2 | 11 / 35 | 4943 |
| 6 | 2 | 65.5 | 76.5 | 12 / 35 | 5022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 44 | 43% |
| kano.gamma.KanoGamma 1.8 | 21 | 57% |
| mz.AntiGrav 1.0 | 13 | 100% |
| stelo.Randomness 1.0 | 11 | 64% |
| Polkwane.SmashMelee 1.0 | 8 | 63% |
| alpha.BlackIce 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 65 | 43% | 78 |
| kano.gamma.KanoGamma 1.8 | 32 | 21% | 54 |
| stelo.Randomness 1.0 | 14 | 9% | 25 |
| mz.AntiGrav 1.0 | 10 | 7% | 15 |
| Polkwane.SmashMelee 1.0 | 10 | 7% | 13 |
| amk.superstrike.SuperStrike 0.3 | 9 | 6% | 11 |
| alpha.BlackIce 1.0 | 9 | 6% | 11 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |

## Melee bench: F41

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 65.3 | 16 / 210 | 4.12 | 13.7% | 27510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.0% | 105 |
| hadur117.mini.DeiseWHPC 0.2 | 2.8 | 13.7% | 16 |
| lessonz.robocode.Oz 0.5.0 | 3.0 | 13.4% | 41 |
| ary.Swarm 1.1 | 3.2 | 13.0% | 20 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 11.2% | 19 |
| shrub.Silver v048 | 6.0 | 10.4% | 6 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.0% | 2 |
| stelo.Mirror 1.1 | 9.0 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 64.4 | 3 / 35 | 4371 |
| 2 | 3 | 60.4 | 63.2 | 1 / 35 | 4705 |
| 3 | 4 | 59.3 | 60.3 | 1 / 35 | 4691 |
| 4 | 2 | 62.5 | 70.8 | 4 / 35 | 4562 |
| 5 | 2 | 61.1 | 64.8 | 3 / 35 | 4603 |
| 6 | 3 | 62.4 | 68.3 | 4 / 35 | 4578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 23 | 13% |
| lessonz.robocode.Oz 0.5.0 | 11 | 36% |
| ary.Swarm 1.1 | 9 | 78% |
| simonton.nano.MeleeSeed 1.8 | 2 | 0% |
| shrub.Silver v048 | 2 | 50% |
| jsal.Jsalbot 1.0 | 2 | 50% |

Hadur died in 195 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 85 | 44% | 90 |
| lessonz.robocode.Oz 0.5.0 | 47 | 24% | 49 |
| ary.Swarm 1.1 | 28 | 14% | 30 |
| shrub.Silver v048 | 14 | 7% | 16 |
| simonton.nano.MeleeSeed 1.8 | 11 | 6% | 10 |
| jsal.Jsalbot 1.0 | 3 | 2% | 8 |
| zyx.nano.Ant 1.1 | 3 | 2% | 3 |
| stelo.Mirror 1.1 | 2 | 1% | 2 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 68.9 | 18 / 210 | 3.80 | 14.5% | 31322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.3% | 128 |
| hadur117.mini.DeiseWHPC 0.2 | 2.3 | 14.5% | 18 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 13.8% | 29 |
| ara.Shera 0.88 | 4.0 | 12.6% | 24 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 2 |
| dsw.StaticD 1.0 | 6.3 | 7.8% | 7 |
| maribo.IotaCT 1.1 | 6.7 | 7.3% | 0 |
| stelo.MirrorMicro 1.0 | 7.8 | 6.4% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 72.4 | 4 / 35 | 5480 |
| 2 | 3 | 62.3 | 69.2 | 2 / 35 | 5140 |
| 3 | 2 | 61.8 | 67.9 | 6 / 35 | 4953 |
| 4 | 3 | 60.9 | 65.4 | 1 / 35 | 5024 |
| 5 | 2 | 61.4 | 67.0 | 1 / 35 | 5242 |
| 6 | 2 | 63.7 | 71.7 | 4 / 35 | 5483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 40 | 18% |
| maribo.mini.MiniQuester 0.1 | 14 | 29% |
| ara.Shera 0.88 | 11 | 64% |

Hadur died in 192 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 82 | 43% | 89 |
| maribo.mini.MiniQuester 0.1 | 43 | 22% | 47 |
| ara.Shera 0.88 | 37 | 19% | 42 |
| amz.NanoClone 1.41 | 11 | 6% | 11 |
| dsw.StaticD 1.0 | 9 | 5% | 10 |
| maribo.IotaCT 1.1 | 5 | 3% | 5 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 56.5 | 3 / 210 | 4.91 | 11.7% | 23619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.1% | 173 |
| brainfade.melee.Dusk 0.44 | 2.5 | 13.2% | 18 |
| hadur117.mini.DeiseWHPC 0.2 | 3.3 | 11.7% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.0 | 11.2% | 5 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.2% | 8 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.0% | 2 |
| mz.NanoGod 2.02 | 7.5 | 8.1% | 1 |
| jab.DiamondStealer 5 | 7.5 | 8.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 60.3 | 1 / 35 | 4120 |
| 2 | 3 | 58.1 | 55.2 | 0 / 35 | 3884 |
| 3 | 3 | 60.0 | 60.0 | 1 / 35 | 4328 |
| 4 | 4 | 56.9 | 52.7 | 1 / 35 | 3700 |
| 5 | 3 | 58.6 | 57.1 | 0 / 35 | 3817 |
| 6 | 4 | 57.3 | 53.7 | 0 / 35 | 3770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 21 | 5% |
| brainfade.melee.Dusk 0.44 | 2 | 50% |
| dummy.micro.Sparrow 2.5 | 1 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 105 | 51% | 107 |
| brainfade.melee.Dusk 0.44 | 35 | 17% | 35 |
| dummy.micro.Sparrow 2.5 | 18 | 9% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 8% | 16 |
| jab.DiamondStealer 5 | 14 | 7% | 14 |
| Krabb.akim2.Akim2 1.1b | 9 | 4% | 9 |
| mz.NanoGod 2.02 | 8 | 4% | 8 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 67.0 | 26 / 210 | 3.97 | 14.8% | 32733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 16.4% | 96 |
| hadur117.mini.DeiseWHPC 0.2 | 2.2 | 14.8% | 26 |
| tzu.TheArtOfWar 1.2 | 2.7 | 13.5% | 43 |
| jwirde.Gort 2.0 | 4.5 | 11.1% | 24 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 10.3% | 7 |
| wompi.Quokka 1.6 | 5.5 | 10.1% | 9 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.2% | 2 |
| disan.Chair 2.2.0 | 7.5 | 7.6% | 4 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.5% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 57.1 | 3 / 35 | 4889 |
| 2 | 2 | 62.3 | 68.6 | 5 / 35 | 5167 |
| 3 | 2 | 63.4 | 69.8 | 4 / 35 | 5766 |
| 4 | 1 | 65.3 | 73.3 | 7 / 35 | 5933 |
| 5 | 3 | 61.9 | 65.1 | 4 / 35 | 5540 |
| 6 | 2 | 62.7 | 68.3 | 3 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 29 | 17% |
| tzu.TheArtOfWar 1.2 | 21 | 48% |
| jwirde.Gort 2.0 | 8 | 25% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 50% |
| disan.Chair 2.2.0 | 4 | 75% |
| wompi.Quokka 1.6 | 2 | 50% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 55 | 30% | 61 |
| jwirde.Gort 2.0 | 37 | 20% | 40 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 30 | 16% | 32 |
| tzu.TheArtOfWar 1.2 | 26 | 14% | 35 |
| wompi.Quokka 1.6 | 23 | 13% | 25 |
| disan.Chair 2.2.0 | 6 | 3% | 9 |
| amk.jointstrike.JointStrike 0.2 | 4 | 2% | 4 |
| stf.PanzerGeneral 0.1 | 3 | 2% | 4 |

## Melee bench: F45

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 80.5 | 68 / 210 | 2.76 | 18.4% | 36371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPC 0.2 | 1.0 | 18.4% | 68 |
| jje.BagPuss 1.2 | 2.7 | 12.8% | 21 |
| eem.IWillFireNoBullet v2.8 | 3.0 | 12.2% | 91 |
| myl.nano.Graviton 1.10 | 4.3 | 10.3% | 4 |
| sul.Lunar 1.1 | 4.3 | 10.3% | 19 |
| hvilela.HVilela 0.9 | 6.5 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.3% | 5 |
| fm.claire 1.7 | 7.3 | 8.2% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.7% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.5 | 10 / 35 | 5914 |
| 2 | 1 | 64.7 | 71.4 | 9 / 35 | 5656 |
| 3 | 1 | 67.6 | 82.9 | 11 / 35 | 5817 |
| 4 | 1 | 69.9 | 85.4 | 15 / 35 | 6728 |
| 5 | 1 | 67.9 | 81.6 | 12 / 35 | 6106 |
| 6 | 1 | 68.2 | 84.1 | 11 / 35 | 6150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 56 | 27% |
| sul.Lunar 1.1 | 23 | 57% |
| jje.BagPuss 1.2 | 18 | 50% |
| myl.nano.Graviton 1.10 | 13 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 80% |
| fm.claire 1.7 | 5 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |
| wit.Deep7 2.0 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 1404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 45 | 31% | 0 |
| jje.BagPuss 1.2 | 44 | 31% | 78 |
| sul.Lunar 1.1 | 21 | 15% | 45 |
| myl.nano.Graviton 1.10 | 12 | 8% | 24 |
| pez.mini.ChironexFleckeri 0.5 | 10 | 7% | 24 |
| hvilela.HVilela 0.9 | 7 | 5% | 16 |
| fm.claire 1.7 | 2 | 1% | 9 |
| wit.Deep7 2.0 | 2 | 1% | 8 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |

## Melee bench: F46

hadur117.mini.DeiseWHPC 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 64.8 | 2 / 210 | 4.17 | 13.0% | 25934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 18.6% | 94 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.6% | 100 |
| hadur117.mini.DeiseWHPC 0.2 | 3.0 | 13.0% | 2 |
| mz.MicroSheep 1.0 | 4.5 | 10.2% | 1 |
| cx.Princess 1.0 | 4.5 | 10.8% | 10 |
| sadoner.killer 0.2 | 6.0 | 8.7% | 2 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.2% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 69.5 | 2 / 35 | 4468 |
| 2 | 3 | 59.6 | 64.4 | 0 / 35 | 4104 |
| 3 | 3 | 58.0 | 60.3 | 0 / 35 | 4065 |
| 4 | 3 | 59.9 | 64.8 | 0 / 35 | 4264 |
| 5 | 3 | 61.9 | 67.6 | 0 / 35 | 4837 |
| 6 | 3 | 59.2 | 62.2 | 0 / 35 | 4196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 32 | 3% |
| rsalesc.melee.Medina 0.4.5 | 9 | 0% |
| cx.Princess 1.0 | 2 | 0% |
| mz.MicroSheep 1.0 | 1 | 100% |

Hadur died in 208 of 210 rounds, at a mean tick of 585. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 106 | 51% | 107 |
| rsalesc.melee.Medina 0.4.5 | 63 | 30% | 63 |
| mz.MicroSheep 1.0 | 10 | 5% | 10 |
| sadoner.killer 0.2 | 9 | 4% | 9 |
| cx.Princess 1.0 | 8 | 4% | 8 |
| arthord.NanoSatanMelee Beta | 5 | 2% | 6 |
| jeremyreeder.collective.Prophet 5 | 4 | 2% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 0 |

