# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.4 | 37 / 210 | 2.40 | 17.0% | 31758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 151 |
| hadur117.mini.DeiseHS650 0.4 | 2.0 | 17.0% | 37 |
| sgp.JollyNinja 3.53 | 4.0 | 10.9% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.6% | 1 |
| mz.MicroGodMelee 1 | 4.7 | 10.5% | 8 |
| lorneswork.Predator 1.0 | 5.0 | 9.6% | 0 |
| adt.Ar2 1.0 | 7.2 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.4% | 1 |
| skm.butterfly 1.0 | 8.5 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 85.7 | 9 / 35 | 5314 |
| 2 | 2 | 66.8 | 84.1 | 2 / 35 | 5441 |
| 3 | 2 | 67.5 | 84.4 | 8 / 35 | 5402 |
| 4 | 2 | 67.4 | 87.6 | 7 / 35 | 5113 |
| 5 | 2 | 67.0 | 85.1 | 5 / 35 | 5804 |
| 6 | 2 | 64.8 | 79.7 | 6 / 35 | 4684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 11% |
| sgp.JollyNinja 3.53 | 13 | 62% |
| lorneswork.Predator 1.0 | 7 | 100% |
| mz.MicroGodMelee 1 | 7 | 57% |
| adt.Ar2 1.0 | 2 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 126 | 73% | 139 |
| sgp.JollyNinja 3.53 | 20 | 12% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 5% | 11 |
| mz.MicroGodMelee 1 | 7 | 4% | 13 |
| lorneswork.Predator 1.0 | 4 | 2% | 12 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 2% | 5 |
| adt.Ar2 1.0 | 3 | 2% | 4 |

## Melee bench: F02

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.6 | 90 / 210 | 2.57 | 18.3% | 33057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 18.3% | 90 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.3% | 56 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 12.7% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.3% | 15 |
| Noran.BitchingElk 0.054 | 6.2 | 8.1% | 18 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.6% | 2 |
| sch.Simone 0.3d | 7.5 | 7.3% | 5 |
| stelo.PatternRobot 1.0 | 8.8 | 6.2% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.2 | 9 / 35 | 5420 |
| 2 | 1 | 66.8 | 78.4 | 16 / 35 | 5545 |
| 3 | 1 | 67.0 | 81.6 | 14 / 35 | 5284 |
| 4 | 1 | 66.8 | 80.6 | 17 / 35 | 5266 |
| 5 | 1 | 68.3 | 86.0 | 15 / 35 | 5542 |
| 6 | 1 | 69.6 | 85.7 | 19 / 35 | 6000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 45% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 78% |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 86% |
| Noran.BitchingElk 0.054 | 11 | 27% |
| stelo.PatternRobot 1.0 | 9 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| fullsail.SweetTea 1.1 | 4 | 50% |
| sch.Simone 0.3d | 4 | 75% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 46 | 38% | 69 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 18 | 15% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 13% | 21 |
| Noran.BitchingElk 0.054 | 10 | 8% | 15 |
| stelo.PatternRobot 1.0 | 9 | 8% | 12 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 7% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 8 |
| fullsail.SweetTea 1.1 | 5 | 4% | 12 |
| sch.Simone 0.3d | 3 | 3% | 9 |

## Melee bench: F03

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.6 | 154 / 210 | 1.67 | 20.8% | 39756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 20.8% | 154 |
| radnor.DoctorBob 1.42 | 2.3 | 13.6% | 18 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.9% | 16 |
| vuen.Cake 2.51 | 3.5 | 12.5% | 22 |
| urdos.URDOS 1.3 | 5.2 | 8.8% | 2 |
| adt.Ar1 2.1 | 6.2 | 7.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.3% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.8 | 24 / 35 | 6246 |
| 2 | 1 | 72.3 | 95.6 | 27 / 35 | 6757 |
| 3 | 1 | 71.1 | 93.3 | 26 / 35 | 6642 |
| 4 | 1 | 71.5 | 92.1 | 25 / 35 | 6847 |
| 5 | 1 | 71.6 | 94.0 | 28 / 35 | 6909 |
| 6 | 1 | 70.3 | 90.8 | 24 / 35 | 6355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 95% |
| vuen.Cake 2.51 | 57 | 79% |
| radnor.DoctorBob 1.42 | 43 | 93% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 23 | 40% | 64 |
| radnor.DoctorBob 1.42 | 18 | 32% | 48 |
| kawigi.nano.Lib 1.0 | 13 | 23% | 68 |
| adt.Ar1 2.1 | 1 | 2% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |
| urdos.URDOS 1.3 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.8 | 13 / 210 | 2.46 | 17.2% | 35476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.5% | 189 |
| hadur117.mini.DeiseHS650 0.4 | 2.0 | 17.2% | 13 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 4 |
| TNT.TNT 0.99.1 | 4.0 | 10.0% | 1 |
| josago.Jorgito 0.16 | 5.3 | 8.9% | 3 |
| css.Delitioner 0.11 | 6.2 | 7.2% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 7.1% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 79.0 | 2 / 35 | 6152 |
| 2 | 2 | 67.8 | 83.8 | 3 / 35 | 5835 |
| 3 | 2 | 68.2 | 87.9 | 2 / 35 | 5667 |
| 4 | 2 | 66.9 | 82.9 | 2 / 35 | 5509 |
| 5 | 2 | 68.0 | 83.8 | 1 / 35 | 6137 |
| 6 | 2 | 68.5 | 85.4 | 3 / 35 | 6176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 152 | 6% |
| apc.LeeroyJenkins2 1.0 | 4 | 50% |
| josago.Jorgito 0.16 | 1 | 0% |
| TNT.TNT 0.99.1 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 1219. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 161 | 82% | 171 |
| apc.LeeroyJenkins2 1.0 | 18 | 9% | 19 |
| josago.Jorgito 0.16 | 7 | 4% | 7 |
| css.Delitioner 0.11 | 6 | 3% | 6 |
| tj.zombie1n 1.0.1 | 3 | 2% | 4 |
| TNT.TNT 0.99.1 | 1 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 69.0 | 13 / 210 | 3.79 | 13.1% | 20890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.5% | 117 |
| justin.DemonicRage 3.4 | 1.8 | 17.2% | 56 |
| hadur117.mini.DeiseHS650 0.4 | 3.2 | 13.1% | 13 |
| wompi.Numbat 2.1 | 3.8 | 12.6% | 19 |
| ms.Ares 0.19 | 5.0 | 9.3% | 0 |
| axeBots.HataMoto 3.09 | 6.0 | 8.7% | 5 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 67.9 | 3 / 35 | 3418 |
| 2 | 3 | 60.1 | 67.9 | 1 / 35 | 3612 |
| 3 | 3 | 57.9 | 64.1 | 2 / 35 | 3001 |
| 4 | 3 | 61.1 | 70.5 | 3 / 35 | 3574 |
| 5 | 3 | 62.6 | 74.0 | 3 / 35 | 3740 |
| 6 | 4 | 60.6 | 69.5 | 1 / 35 | 3545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 28 | 21% |
| cb.fire.Firestarter 2.0f | 21 | 10% |
| axeBots.HataMoto 3.09 | 4 | 75% |
| wompi.Numbat 2.1 | 4 | 50% |

Hadur died in 197 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 67 | 34% | 70 |
| justin.DemonicRage 3.4 | 59 | 30% | 64 |
| wompi.Numbat 2.1 | 37 | 19% | 40 |
| ms.Ares 0.19 | 16 | 8% | 16 |
| axeBots.HataMoto 3.09 | 7 | 4% | 9 |
| supersample.SuperBoxBot 1.0 | 6 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 5 |

## Melee bench: F06

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.4 | 76 / 210 | 2.76 | 17.0% | 28949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.2 | 17.0% | 76 |
| jekl.StoneGhost 0.7 | 2.7 | 14.5% | 36 |
| origin.SleepSiphon 1.7b | 2.7 | 14.5% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.4% | 27 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 4 |
| gg.Wolverine 2.0 | 5.8 | 8.9% | 2 |
| spinnercat.Omen 1.0 | 7.8 | 6.7% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.3% | 3 |
| DBall.NUKE 0.1 | 8.2 | 6.3% | 1 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.2 | 13 / 35 | 5260 |
| 2 | 2 | 64.4 | 75.6 | 11 / 35 | 4212 |
| 3 | 1 | 64.9 | 78.4 | 11 / 35 | 4480 |
| 4 | 1 | 65.9 | 79.4 | 13 / 35 | 4644 |
| 5 | 1 | 68.6 | 85.1 | 14 / 35 | 5766 |
| 6 | 1 | 66.0 | 81.0 | 14 / 35 | 4587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 39 | 46% |
| jekl.StoneGhost 0.7 | 29 | 76% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 69% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 88% |
| gg.Wolverine 2.0 | 7 | 100% |
| mld.Wisdom 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 47 | 35% | 68 |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 23% | 53 |
| jekl.StoneGhost 0.7 | 31 | 23% | 46 |
| mld.Wisdom 1.0 | 13 | 10% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 3% | 10 |
| gg.Wolverine 2.0 | 4 | 3% | 8 |
| spinnercat.Omen 1.0 | 3 | 2% | 4 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.5 | 80 / 210 | 1.95 | 19.2% | 36283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.2 | 19.2% | 80 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.7% | 57 |
| rtk.Tachikoma 1.0 | 2.7 | 16.7% | 50 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.2% | 11 |
| franzor.Lizt 1.3.1 | 5.0 | 10.3% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 1 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.3% | 0 |
| sample.Target 1.0 | 9.5 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.5 | 16 / 35 | 6113 |
| 2 | 1 | 70.7 | 90.5 | 14 / 35 | 6042 |
| 3 | 1 | 70.7 | 89.2 | 14 / 35 | 6250 |
| 4 | 1 | 70.3 | 90.5 | 11 / 35 | 5756 |
| 5 | 1 | 71.5 | 90.5 | 18 / 35 | 6274 |
| 6 | 2 | 69.0 | 85.7 | 7 / 35 | 5848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 85 | 54% |
| rsalesc.melee.Monk 0.3.6c | 53 | 23% |
| oog.melee.CapuletDroid 1.1 | 20 | 75% |
| franzor.Lizt 1.3.1 | 12 | 50% |

Hadur died in 130 of 210 rounds, at a mean tick of 1237. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 60 | 46% | 107 |
| rsalesc.melee.Monk 0.3.6c | 50 | 38% | 72 |
| oog.melee.CapuletDroid 1.1 | 12 | 9% | 25 |
| franzor.Lizt 1.3.1 | 6 | 5% | 0 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |

## Melee bench: F08

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.6 | 106 / 210 | 2.30 | 18.5% | 31342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 18.5% | 106 |
| tm.Yuugao 1.0 | 2.3 | 13.4% | 42 |
| shrub.Vapour v159 | 2.7 | 13.1% | 33 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.1% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.3% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.2% | 6 |
| m3thos.Eva00 1.1 | 6.5 | 8.0% | 2 |
| SHAM.WOW 1.4 | 8.0 | 6.9% | 2 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 21 / 35 | 5362 |
| 2 | 1 | 69.4 | 90.2 | 20 / 35 | 5613 |
| 3 | 1 | 65.6 | 81.9 | 9 / 35 | 5035 |
| 4 | 1 | 68.0 | 85.7 | 22 / 35 | 5060 |
| 5 | 1 | 67.9 | 87.6 | 18 / 35 | 5227 |
| 6 | 1 | 66.7 | 81.9 | 16 / 35 | 5045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 53 | 66% |
| shrub.Vapour v159 | 40 | 60% |
| Krabb.sliNk.Garm 0.9u | 20 | 75% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 64% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 80% |
| m3thos.Eva00 1.1 | 6 | 100% |
| SHAM.WOW 1.4 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 37 | 35% | 74 |
| shrub.Vapour v159 | 31 | 29% | 56 |
| Krabb.sliNk.Garm 0.9u | 16 | 15% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 12 | 11% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 5% | 12 |
| m3thos.Eva00 1.1 | 2 | 2% | 6 |
| SHAM.WOW 1.4 | 2 | 2% | 6 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 70.1 | 39 / 210 | 3.69 | 14.6% | 25078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.6% | 106 |
| kc.micro.Figment 1.0 | 2.5 | 14.1% | 33 |
| hadur117.mini.DeiseHS650 0.4 | 2.5 | 14.6% | 39 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.4% | 15 |
| yagami.Tidus 0.11 | 5.0 | 10.4% | 3 |
| mc2.enemy.Original 0.9 | 5.3 | 9.5% | 10 |
| dft.Calliope 5.6 | 7.0 | 8.2% | 4 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 68.3 | 7 / 35 | 4053 |
| 2 | 2 | 64.1 | 75.2 | 9 / 35 | 4347 |
| 3 | 2 | 64.5 | 77.5 | 3 / 35 | 4512 |
| 4 | 3 | 59.7 | 64.8 | 6 / 35 | 3898 |
| 5 | 3 | 60.3 | 63.8 | 7 / 35 | 4091 |
| 6 | 2 | 62.7 | 71.1 | 7 / 35 | 4177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 48 | 25% |
| kc.micro.Figment 1.0 | 14 | 43% |
| yagami.Tidus 0.11 | 11 | 91% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| pedersen.Grishnakh 1.0 | 5 | 80% |
| dft.Calliope 5.6 | 4 | 50% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 70 | 41% | 84 |
| yagami.Tidus 0.11 | 27 | 16% | 33 |
| kc.micro.Figment 1.0 | 25 | 15% | 30 |
| mc2.enemy.Original 0.9 | 15 | 9% | 20 |
| dft.Calliope 5.6 | 11 | 6% | 14 |
| pedersen.Grishnakh 1.0 | 10 | 6% | 16 |
| robar.nano.Assertive_Melee 0.2 | 8 | 5% | 8 |
| step.nanoPri 1.0 | 5 | 3% | 5 |

## Melee bench: F10

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.1 | 146 / 210 | 1.71 | 20.4% | 37017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 20.4% | 146 |
| DTF.Kludgy 1.2b | 2.2 | 13.6% | 24 |
| ne.Chimera 1.2 | 3.5 | 12.1% | 9 |
| ejb.Polaris 1.0.1 | 3.8 | 11.5% | 10 |
| tvv.micro.Antares 1.1.1 | 4.8 | 10.4% | 10 |
| vStar.RAFzilla 2.15 | 5.7 | 9.8% | 8 |
| sam.Samspin 1.0 | 8.0 | 5.9% | 0 |
| kurios.DOSexe .9b | 8.0 | 6.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.7 | 25 / 35 | 6247 |
| 2 | 1 | 70.0 | 90.8 | 22 / 35 | 6149 |
| 3 | 1 | 69.6 | 92.4 | 21 / 35 | 5680 |
| 4 | 1 | 71.1 | 94.9 | 24 / 35 | 6227 |
| 5 | 1 | 70.2 | 89.2 | 25 / 35 | 6331 |
| 6 | 1 | 71.5 | 93.7 | 29 / 35 | 6383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 53 | 70% |
| ejb.Polaris 1.0.1 | 42 | 90% |
| ne.Chimera 1.2 | 31 | 81% |
| tvv.micro.Antares 1.1.1 | 19 | 74% |
| vStar.RAFzilla 2.15 | 16 | 88% |
| donjezza.Muncho 1.0 | 9 | 78% |
| kurios.DOSexe .9b | 7 | 100% |
| sam.Samspin 1.0 | 4 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 36% | 62 |
| ne.Chimera 1.2 | 13 | 20% | 32 |
| ejb.Polaris 1.0.1 | 10 | 16% | 44 |
| tvv.micro.Antares 1.1.1 | 8 | 13% | 12 |
| vStar.RAFzilla 2.15 | 4 | 6% | 23 |
| donjezza.Muncho 1.0 | 4 | 6% | 8 |
| kurios.DOSexe .9b | 1 | 2% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 5 |
| sam.Samspin 1.0 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.4 | 67 / 210 | 2.85 | 16.9% | 29356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.3 | 16.9% | 67 |
| rz.Aleph 0.34 | 1.7 | 15.9% | 71 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.4% | 30 |
| djc.DynaBot 0.1.1 | 3.8 | 11.4% | 18 |
| br2.MobyDickBot 1.6 | 5.7 | 8.9% | 9 |
| rdt199.Warlord 0.73 | 5.8 | 8.7% | 7 |
| uji.YellohFellah 1.0 | 6.5 | 8.2% | 8 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 78.1 | 10 / 35 | 4675 |
| 2 | 1 | 66.5 | 84.1 | 11 / 35 | 4879 |
| 3 | 2 | 64.5 | 76.8 | 10 / 35 | 4488 |
| 4 | 2 | 63.1 | 71.4 | 7 / 35 | 4851 |
| 5 | 1 | 66.4 | 81.3 | 15 / 35 | 4969 |
| 6 | 1 | 68.5 | 84.8 | 14 / 35 | 5494 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 55 | 42% |
| djc.DynaBot 0.1.1 | 23 | 74% |
| cx.mini.Nimrod 0.55 | 16 | 81% |
| uji.YellohFellah 1.0 | 13 | 54% |
| rdt199.Warlord 0.73 | 8 | 63% |
| br2.MobyDickBot 1.6 | 3 | 67% |

Hadur died in 143 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 60 | 42% | 83 |
| cx.mini.Nimrod 0.55 | 25 | 17% | 34 |
| rdt199.Warlord 0.73 | 18 | 13% | 25 |
| djc.DynaBot 0.1.1 | 15 | 10% | 26 |
| uji.YellohFellah 1.0 | 10 | 7% | 18 |
| br2.MobyDickBot 1.6 | 5 | 3% | 13 |
| KiraNL.Chupacabra 0.4 | 5 | 3% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 80.8 | 101 / 210 | 2.73 | 17.1% | 24958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 17.1% | 101 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.0% | 36 |
| darkcanuck.Leon 1.01 | 3.3 | 12.8% | 35 |
| nat.PallasHawk 1.0 | 3.3 | 12.8% | 31 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.3% | 6 |
| jrm.Test0 1.0 | 7.0 | 7.4% | 0 |
| jp.Perpy 16.0 | 7.2 | 7.2% | 0 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.1% | 0 |
| jaybot.bots.Oddball 4.0 | 8.5 | 6.3% | 1 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 80.6 | 16 / 35 | 4161 |
| 2 | 1 | 65.5 | 78.4 | 14 / 35 | 4356 |
| 3 | 1 | 66.7 | 83.2 | 19 / 35 | 4213 |
| 4 | 1 | 65.4 | 78.7 | 16 / 35 | 4187 |
| 5 | 1 | 65.5 | 80.0 | 18 / 35 | 3955 |
| 6 | 1 | 66.7 | 83.8 | 18 / 35 | 4086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 51 | 76% |
| nat.PallasHawk 1.0 | 39 | 77% |
| darkcanuck.Leon 1.01 | 35 | 51% |
| brainfade.melee.Genghis 0.36 | 6 | 83% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 29 | 27% | 55 |
| nat.PallasHawk 1.0 | 25 | 23% | 52 |
| darkcanuck.Leon 1.01 | 21 | 19% | 44 |
| brainfade.melee.Genghis 0.36 | 14 | 13% | 20 |
| jrm.Test0 1.0 | 10 | 9% | 15 |
| jp.Perpy 16.0 | 4 | 4% | 9 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 8 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.1 | 62 / 210 | 2.52 | 16.6% | 28084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.0% | 95 |
| hadur117.mini.DeiseHS650 0.4 | 1.8 | 16.6% | 62 |
| ags.Glacier 0.2.11 | 2.7 | 16.2% | 36 |
| shinh.Entangled 0.3 | 4.3 | 11.5% | 12 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.0% | 5 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 1 |
| maribo.FollowFire 1 | 8.5 | 4.7% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.7 | 15 / 35 | 4791 |
| 2 | 2 | 66.0 | 81.9 | 11 / 35 | 4761 |
| 3 | 3 | 64.0 | 77.5 | 10 / 35 | 4139 |
| 4 | 2 | 66.7 | 84.1 | 9 / 35 | 4844 |
| 5 | 2 | 66.5 | 84.4 | 9 / 35 | 4569 |
| 6 | 1 | 66.9 | 84.8 | 8 / 35 | 4980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 54 | 65% |
| mn.Combat 3.25.0 | 52 | 19% |
| shinh.Entangled 0.3 | 11 | 64% |
| gh.micro.Gruweltje 0.7 | 8 | 88% |
| stelo.Wang 1.0 | 3 | 67% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 67 | 45% | 79 |
| ags.Glacier 0.2.11 | 43 | 29% | 73 |
| shinh.Entangled 0.3 | 18 | 12% | 26 |
| gh.micro.Gruweltje 0.7 | 11 | 7% | 19 |
| stelo.Wang 1.0 | 5 | 3% | 6 |
| apc.Colossus2 0.17 | 3 | 2% | 5 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.1 | 133 / 210 | 1.80 | 20.3% | 37107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 20.3% | 133 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 37 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 27 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.4% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.5% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 8.9% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 8.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.0% | 5 |
| pa.Improved 1.0 | 9.0 | 5.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.1 | 24 / 35 | 6648 |
| 2 | 1 | 71.6 | 94.9 | 24 / 35 | 6201 |
| 3 | 1 | 70.8 | 90.8 | 23 / 35 | 6206 |
| 4 | 1 | 70.2 | 90.5 | 19 / 35 | 6001 |
| 5 | 1 | 70.0 | 88.9 | 19 / 35 | 6046 |
| 6 | 1 | 70.5 | 90.5 | 24 / 35 | 6005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 73% |
| catcat20.shape.Theta 0.018 | 47 | 68% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 88% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 93% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 52% | 102 |
| catcat20.shape.Theta 0.018 | 17 | 22% | 34 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 6% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 6% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 5% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 19 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 3 |
| pa.Improved 1.0 | 1 | 1% | 5 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.9 | 69 / 210 | 3.08 | 16.8% | 31321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 16.8% | 69 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.2% | 28 |
| emp.Yngwie 1.11 | 3.2 | 13.1% | 51 |
| mld.DustBunny 3.8 | 3.5 | 13.1% | 18 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.4% | 18 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.3% | 24 |
| lambdaxy.TBot 0.1 | 7.5 | 5.9% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 76.8 | 10 / 35 | 5234 |
| 2 | 1 | 66.1 | 76.5 | 12 / 35 | 5452 |
| 3 | 1 | 66.7 | 81.0 | 12 / 35 | 4999 |
| 4 | 1 | 65.2 | 75.9 | 9 / 35 | 5056 |
| 5 | 1 | 65.0 | 74.0 | 13 / 35 | 4879 |
| 6 | 1 | 66.9 | 77.1 | 13 / 35 | 5701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 27 | 63% |
| kawigi.micro.Shiz 1.1 | 23 | 87% |
| mld.DustBunny 3.8 | 16 | 88% |
| kawigi.robot.Girl 1.2 | 15 | 67% |
| cb.nano.Insomnia 1.0 | 11 | 55% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 26% | 59 |
| mld.DustBunny 3.8 | 27 | 19% | 46 |
| kawigi.micro.Shiz 1.1 | 23 | 16% | 38 |
| kawigi.robot.Girl 1.2 | 23 | 16% | 31 |
| cb.nano.Insomnia 1.0 | 22 | 16% | 22 |
| divineomega.TrialBot 0.003 | 6 | 4% | 10 |
| lambdaxy.TBot 0.1 | 3 | 2% | 3 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.7 | 89 / 210 | 2.47 | 18.9% | 37291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 18.9% | 89 |
| gh.Griezel 0.5.2 | 2.0 | 15.8% | 66 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 11 |
| techdude.forest.FlamingForest 1.1 | 5.0 | 9.9% | 29 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.4% | 5 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.2% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.6% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.2 | 6.0% | 6 |
| asd.Cthulhu 1.3 | 9.2 | 4.6% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 78.7 | 13 / 35 | 5882 |
| 2 | 1 | 69.7 | 87.3 | 16 / 35 | 6216 |
| 3 | 1 | 67.7 | 78.4 | 13 / 35 | 6223 |
| 4 | 1 | 70.3 | 87.0 | 18 / 35 | 6452 |
| 5 | 1 | 71.7 | 92.1 | 22 / 35 | 6752 |
| 6 | 1 | 66.6 | 78.7 | 7 / 35 | 5766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 70 | 46% |
| techdude.forest.FlamingForest 1.1 | 22 | 45% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 85% |
| bvh.fnr.Fenrir 0.36l | 14 | 79% |
| stelo.IntrinsicVolatility 1.4 | 8 | 100% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 80% |

Hadur died in 123 of 210 rounds, at a mean tick of 1082. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 61 | 50% | 98 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 18% | 39 |
| techdude.forest.FlamingForest 1.1 | 17 | 14% | 29 |
| bvh.fnr.Fenrir 0.36l | 12 | 10% | 18 |
| stelo.IntrinsicVolatility 1.4 | 3 | 2% | 11 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 9 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 4 |
| asd.Cthulhu 1.3 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 78.9 | 81 / 210 | 2.90 | 17.2% | 32261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 17.2% | 81 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.9% | 37 |
| et.Predator 1.8 | 3.0 | 13.6% | 30 |
| cx.BlestPain 1.41 | 3.7 | 12.2% | 41 |
| nic.Nicator 2.4 | 4.7 | 11.4% | 11 |
| ahf.NanoAndrew .4 | 6.0 | 10.0% | 10 |
| maribo.melee.BMV 0.1 | 6.7 | 9.0% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.2% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 77.8 | 16 / 35 | 5716 |
| 2 | 1 | 66.5 | 80.0 | 15 / 35 | 5253 |
| 3 | 1 | 67.2 | 81.9 | 12 / 35 | 5430 |
| 4 | 1 | 67.3 | 81.0 | 17 / 35 | 5309 |
| 5 | 1 | 66.5 | 78.1 | 10 / 35 | 5744 |
| 6 | 1 | 65.0 | 74.6 | 11 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 37 | 76% |
| oog.melee.Mercutio 1.0 | 30 | 70% |
| cx.BlestPain 1.41 | 23 | 43% |
| nic.Nicator 2.4 | 15 | 73% |
| ahf.NanoAndrew .4 | 10 | 80% |
| maribo.melee.BMV 0.1 | 3 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 34 | 26% | 56 |
| cx.BlestPain 1.41 | 33 | 25% | 49 |
| oog.melee.Mercutio 1.0 | 28 | 21% | 41 |
| ahf.NanoAndrew .4 | 18 | 14% | 23 |
| nic.Nicator 2.4 | 9 | 7% | 25 |
| tex.Longbot 0.4 | 4 | 3% | 5 |
| maribo.melee.BMV 0.1 | 2 | 2% | 5 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.3 | 100 / 210 | 2.41 | 17.9% | 28825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 17.9% | 100 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.1% | 38 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.5% | 33 |
| uji.DBH 1.1 | 4.7 | 10.4% | 9 |
| spinnercat.Robovirus 2.718 | 4.8 | 10.1% | 10 |
| ratosh.Nobo 0.21 | 5.2 | 10.0% | 2 |
| sigterm.Sigterm 1.0 | 7.0 | 8.4% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 6.8% | 3 |
| stelo.WangRobot 1.0 | 8.7 | 6.4% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.3 | 20 / 35 | 4914 |
| 2 | 1 | 67.0 | 87.0 | 15 / 35 | 4840 |
| 3 | 1 | 66.2 | 82.2 | 14 / 35 | 4835 |
| 4 | 1 | 66.5 | 82.9 | 17 / 35 | 4796 |
| 5 | 1 | 68.7 | 87.6 | 20 / 35 | 5312 |
| 6 | 1 | 64.6 | 79.7 | 14 / 35 | 4128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 44 | 59% |
| agd.Mooserwirt2 2.7 | 26 | 27% |
| uji.DBH 1.1 | 21 | 86% |
| spinnercat.Robovirus 2.718 | 18 | 72% |
| sigterm.Sigterm 1.0 | 17 | 88% |
| stelo.WangRobot 1.0 | 10 | 100% |
| ratosh.Nobo 0.21 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 36 | 33% | 57 |
| agd.Mooserwirt2 2.7 | 27 | 25% | 41 |
| ratosh.Nobo 0.21 | 11 | 10% | 22 |
| spinnercat.Robovirus 2.718 | 10 | 9% | 21 |
| sigterm.Sigterm 1.0 | 8 | 7% | 19 |
| uji.DBH 1.1 | 6 | 5% | 19 |
| stelo.WangRobot 1.0 | 6 | 5% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 4% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 3 |

## Melee bench: F19

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.1 | 135 / 210 | 1.62 | 20.9% | 37688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 20.9% | 135 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.9% | 30 |
| mld.Infinity 2.2 | 2.5 | 14.6% | 42 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.1% | 0 |
| erdnis.Rover 0.3 | 5.0 | 10.0% | 2 |
| patson.PatsonTestBot 1.0 | 6.3 | 7.9% | 1 |
| mbh.Mbh 0.1 | 6.8 | 7.3% | 0 |
| pac.ABC 2.1 | 7.8 | 6.4% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 95.2 | 25 / 35 | 5836 |
| 2 | 1 | 70.5 | 89.8 | 19 / 35 | 5657 |
| 3 | 1 | 71.5 | 91.4 | 19 / 35 | 6482 |
| 4 | 1 | 72.2 | 92.1 | 23 / 35 | 6607 |
| 5 | 1 | 72.3 | 94.6 | 26 / 35 | 6389 |
| 6 | 1 | 72.7 | 95.6 | 23 / 35 | 6717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 89 | 80% |
| mld.Infinity 2.2 | 64 | 55% |
| krillr.mini.JointStrike 2.0.0 | 12 | 100% |
| erdnis.Rover 0.3 | 9 | 89% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 1431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 33 | 43% | 117 |
| mld.Infinity 2.2 | 31 | 41% | 24 |
| krillr.mini.JointStrike 2.0.0 | 8 | 11% | 27 |
| pbg.R2D2 1.0 | 1 | 1% | 9 |
| erdnis.Rover 0.3 | 1 | 1% | 9 |
| mbh.Mbh 0.1 | 1 | 1% | 7 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 9 |
| pac.ABC 2.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.3 | 97 / 210 | 2.32 | 18.9% | 34762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 18.9% | 97 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 39 |
| fwb.Nine 1.0.1 | 3.5 | 11.2% | 24 |
| catcat20.Rabbit 0.001 | 4.3 | 10.6% | 32 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.7% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.0% | 1 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.8% | 7 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.9% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.7 | 17 / 35 | 6023 |
| 2 | 1 | 68.0 | 83.2 | 16 / 35 | 5627 |
| 3 | 1 | 67.8 | 84.1 | 12 / 35 | 5658 |
| 4 | 1 | 69.1 | 87.9 | 19 / 35 | 5724 |
| 5 | 1 | 69.9 | 89.2 | 17 / 35 | 6143 |
| 6 | 1 | 67.6 | 81.9 | 16 / 35 | 5587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 64 | 75% |
| catcat20.Rabbit 0.001 | 30 | 60% |
| fwb.Nine 1.0.1 | 22 | 41% |
| nz.jdc.nano.GridFu 1.0 | 13 | 46% |
| bayen.nut.Squirrel 1.615 | 12 | 75% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1080. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 46 | 40% | 80 |
| fwb.Nine 1.0.1 | 21 | 18% | 30 |
| catcat20.Rabbit 0.001 | 19 | 17% | 34 |
| nz.jdc.nano.GridFu 1.0 | 10 | 9% | 24 |
| bayen.nut.Squirrel 1.615 | 10 | 9% | 22 |
| ntc.ControlledChaos 1.1.4 | 5 | 4% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 4 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 6 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.9 | 95 / 210 | 2.00 | 19.4% | 35499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 19.4% | 95 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 73 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 25 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 11 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.4% | 0 |
| eld.Hmm 1.0 | 5.8 | 8.1% | 7 |
| fire219.CatBot 1.0 | 7.7 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.5 | 14 / 35 | 6364 |
| 2 | 1 | 69.8 | 92.1 | 17 / 35 | 5654 |
| 3 | 1 | 69.8 | 88.6 | 17 / 35 | 5881 |
| 4 | 1 | 70.4 | 90.8 | 17 / 35 | 6072 |
| 5 | 1 | 69.6 | 87.3 | 16 / 35 | 5791 |
| 6 | 1 | 68.6 | 84.4 | 14 / 35 | 5737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 94 | 48% |
| dummy.mini.Scimitar 1.01 | 42 | 74% |
| cf.RiO.RiOx 4.2.1 | 16 | 81% |
| eld.Hmm 1.0 | 5 | 60% |
| oa.weak.BotherBot 0.1 | 3 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1216. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 56 | 49% | 82 |
| dummy.mini.Scimitar 1.01 | 36 | 31% | 72 |
| cf.RiO.RiOx 4.2.1 | 19 | 17% | 34 |
| eld.Hmm 1.0 | 3 | 3% | 13 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 7 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.0 | 74 / 210 | 2.53 | 17.9% | 33493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.2 | 17.9% | 74 |
| pe.SandboxDT 2.71m | 2.0 | 16.6% | 76 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.9% | 34 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.1% | 18 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 4 |
| yk.JahRoslav 1.1 | 6.8 | 6.5% | 2 |
| tad.Dalek98 0.98 | 6.8 | 6.2% | 1 |
| gg.Squaraus 0.6 | 7.3 | 6.0% | 1 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.9 | 15 / 35 | 5183 |
| 2 | 1 | 68.2 | 83.8 | 13 / 35 | 5614 |
| 3 | 1 | 68.1 | 83.2 | 13 / 35 | 5659 |
| 4 | 1 | 68.3 | 83.8 | 11 / 35 | 5775 |
| 5 | 2 | 68.1 | 83.8 | 10 / 35 | 5656 |
| 6 | 1 | 67.5 | 81.3 | 12 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 44 | 36% |
| kvk.HebusLeTroll 0.35 | 34 | 59% |
| jlm.javaDisturbance 0.59 | 30 | 80% |
| bigpete.Stewie 1.0 | 11 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 52 | 38% | 73 |
| pe.SandboxDT 2.71m | 47 | 34% | 64 |
| jlm.javaDisturbance 0.59 | 30 | 22% | 48 |
| bigpete.Stewie 1.0 | 6 | 4% | 15 |
| tad.Dalek98 0.98 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.0 | 108 / 210 | 2.08 | 19.3% | 33939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.2 | 19.3% | 108 |
| pe.SandboxLump 1.52 | 1.8 | 17.4% | 71 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 20 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.6% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.5% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.3 | 8.5% | 5 |
| cw.megas.Blade 0.8 | 6.5 | 8.5% | 0 |
| sample.Walls 1.0 | 7.7 | 7.8% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 89.5 | 21 / 35 | 5731 |
| 2 | 1 | 70.2 | 88.3 | 20 / 35 | 5322 |
| 3 | 1 | 70.8 | 90.5 | 17 / 35 | 6134 |
| 4 | 2 | 69.1 | 84.1 | 17 / 35 | 5585 |
| 5 | 1 | 70.2 | 88.6 | 20 / 35 | 5724 |
| 6 | 1 | 69.1 | 87.3 | 13 / 35 | 5443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 80 | 59% |
| cre.Karolos 0.32 | 33 | 70% |
| stelo.AreaTargetingBot 1.1 | 18 | 94% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 40% |
| rrh.Iwillfindyou 2.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 58 | 57% | 111 |
| cre.Karolos 0.32 | 26 | 25% | 53 |
| stelo.RamTrackSurfer 1.2 | 8 | 8% | 13 |
| stelo.AreaTargetingBot 1.1 | 6 | 6% | 13 |
| cw.megas.Blade 0.8 | 2 | 2% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 9 |
| sample.Walls 1.0 | 1 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 71.9 | 56 / 210 | 3.53 | 14.8% | 24850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.5 | 14.8% | 56 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.9% | 43 |
| florent.XSeries.X2 0.12 | 2.8 | 13.7% | 35 |
| davidalves.Phoenix 0.54 | 3.0 | 13.7% | 48 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.3% | 19 |
| oog.melee.Corsair 1.0 | 6.5 | 9.1% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.4% | 6 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.6% | 0 |
| evd.X1 0.01 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 74.3 | 10 / 35 | 3860 |
| 2 | 1 | 62.7 | 70.8 | 9 / 35 | 4294 |
| 3 | 1 | 63.7 | 73.3 | 11 / 35 | 4264 |
| 4 | 2 | 62.8 | 73.0 | 12 / 35 | 3862 |
| 5 | 1 | 63.1 | 74.3 | 8 / 35 | 4259 |
| 6 | 2 | 60.9 | 65.4 | 6 / 35 | 4311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 19 | 68% |
| rz.GlowBlowMelee 1.4 | 18 | 72% |
| davidalves.Phoenix 0.54 | 17 | 76% |
| stelo.SoJNanoMelee 1.1 | 11 | 91% |
| pedersen.Ugluk 1.1.1 | 9 | 44% |
| oog.melee.Corsair 1.0 | 5 | 40% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 36 | 23% | 43 |
| rz.GlowBlowMelee 1.4 | 33 | 21% | 48 |
| florent.XSeries.X2 0.12 | 29 | 19% | 46 |
| pedersen.Ugluk 1.1.1 | 25 | 16% | 29 |
| stelo.SoJNanoMelee 1.1 | 14 | 9% | 20 |
| oog.melee.Corsair 1.0 | 9 | 6% | 12 |
| evd.X1 0.01 | 5 | 3% | 6 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.9 | 128 / 210 | 2.18 | 19.0% | 28512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 19.0% | 128 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.4% | 23 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.2% | 17 |
| jdw.Hurricane 1.4 | 3.8 | 12.1% | 25 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 8.8% | 9 |
| ds.Oo 2.2 | 5.8 | 8.3% | 5 |
| awesomeness.Elite 1.0 | 7.7 | 7.1% | 1 |
| gjr.Cephalosporin 0.1 | 8.2 | 6.9% | 2 |
| adt.Ar2 1.1 | 8.3 | 6.8% | 0 |
| amk.ChumbaMini 0.2 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 24 / 35 | 4810 |
| 2 | 1 | 70.2 | 90.5 | 22 / 35 | 5040 |
| 3 | 1 | 68.3 | 87.9 | 20 / 35 | 4556 |
| 4 | 1 | 66.3 | 79.7 | 18 / 35 | 4459 |
| 5 | 1 | 69.8 | 90.8 | 23 / 35 | 4940 |
| 6 | 1 | 68.4 | 85.7 | 21 / 35 | 4707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 46 | 87% |
| voidious.micro.BlitzBat 1.05 | 44 | 86% |
| jdw.Hurricane 1.4 | 34 | 76% |
| gjr.Cephalosporin 0.1 | 9 | 100% |
| awesomeness.Elite 1.0 | 7 | 100% |
| ds.Oo 2.2 | 4 | 75% |
| gre.svman4.Morfeas 1.4.1 | 3 | 67% |
| adt.Ar2 1.1 | 3 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 30% | 53 |
| jdw.Hurricane 1.4 | 21 | 25% | 40 |
| voidious.mini.BrokenSword 2.0.3 | 15 | 18% | 62 |
| ds.Oo 2.2 | 11 | 13% | 18 |
| adt.Ar2 1.1 | 4 | 5% | 6 |
| awesomeness.Elite 1.0 | 3 | 4% | 8 |
| gre.svman4.Morfeas 1.4.1 | 2 | 2% | 14 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 7 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |

## Melee bench: F26

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 87.8 | 109 / 210 | 2.10 | 19.5% | 37325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 19.5% | 109 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 41 |
| shu.nitro.LENIN .T34 | 3.2 | 12.6% | 30 |
| lrem.Spectre 0.4.4 | 3.8 | 11.9% | 10 |
| js.PinBall 1.6 | 5.0 | 10.4% | 9 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.3% | 6 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.7% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 4 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 86.3 | 16 / 35 | 6520 |
| 2 | 1 | 70.9 | 87.9 | 22 / 35 | 6653 |
| 3 | 1 | 70.4 | 88.6 | 18 / 35 | 6295 |
| 4 | 1 | 69.6 | 89.2 | 15 / 35 | 6017 |
| 5 | 1 | 69.1 | 86.7 | 18 / 35 | 5815 |
| 6 | 1 | 70.0 | 88.3 | 20 / 35 | 6025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 45 | 73% |
| shu.nitro.LENIN .T34 | 40 | 68% |
| lrem.Spectre 0.4.4 | 32 | 81% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 64% |
| js.PinBall 1.6 | 10 | 80% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 30 | 30% | 64 |
| ak.Fermat 2.0 | 27 | 27% | 56 |
| lrem.Spectre 0.4.4 | 14 | 14% | 37 |
| js.PinBall 1.6 | 12 | 12% | 22 |
| jaybot.adv.bots.JayBot 2.0 | 11 | 11% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 4% | 6 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 6 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.2 | 106 / 210 | 2.60 | 18.2% | 31074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 18.2% | 106 |
| mk.Alpha 0.2.1 | 3.0 | 12.8% | 41 |
| wee.Gem 1.8.4 | 3.0 | 11.8% | 34 |
| EH.Eagle 1.0.6 | 3.8 | 11.5% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.9% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.2% | 2 |
| joe.ADinosaur 1.0 | 7.8 | 7.7% | 2 |
| throxbot.ThroxBot 0.1 | 8.0 | 7.8% | 3 |
| caimano.Furia_Ceca 0.22 | 8.3 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.8 | 19 / 35 | 4568 |
| 2 | 1 | 69.1 | 91.4 | 22 / 35 | 5059 |
| 3 | 1 | 65.0 | 68.3 | 10 / 35 | 5599 |
| 4 | 1 | 66.2 | 68.9 | 13 / 35 | 5972 |
| 5 | 1 | 68.4 | 89.2 | 20 / 35 | 4740 |
| 6 | 1 | 69.4 | 91.4 | 22 / 35 | 5136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 56 | 71% |
| wee.Gem 1.8.4 | 33 | 52% |
| EH.Eagle 1.0.6 | 19 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 79% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 32 | 31% | 69 |
| wee.Gem 1.8.4 | 24 | 23% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 18% | 35 |
| EH.Eagle 1.0.6 | 8 | 8% | 22 |
| joe.ADinosaur 1.0 | 7 | 7% | 12 |
| throxbot.ThroxBot 0.1 | 5 | 5% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 4% | 16 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 5 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.8 | 130 / 210 | 1.92 | 19.5% | 30393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 19.5% | 130 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 37 |
| uji.Antique 1.0 | 3.7 | 11.4% | 24 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.1% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.3% | 9 |
| amk.ChumbaWumba 0.3 | 5.3 | 9.0% | 2 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.8% | 4 |
| stelo.PianistNano 1.2 | 8.8 | 5.9% | 0 |
| matt.advanced.Katana 1.0 | 8.8 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.0 | 15 / 35 | 4600 |
| 2 | 1 | 70.0 | 91.1 | 26 / 35 | 5355 |
| 3 | 1 | 69.2 | 87.6 | 22 / 35 | 5255 |
| 4 | 1 | 69.5 | 90.5 | 22 / 35 | 5085 |
| 5 | 1 | 70.0 | 91.7 | 22 / 35 | 5130 |
| 6 | 1 | 69.5 | 91.7 | 23 / 35 | 4968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 85 | 75% |
| uji.Antique 1.0 | 34 | 76% |
| amk.ChumbaWumba 0.3 | 15 | 87% |
| qohnil.blot.BlotBot 3.61 | 14 | 64% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| ahr.ice.Ice 1.0.2 | 7 | 86% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 33 | 41% | 89 |
| uji.Antique 1.0 | 18 | 23% | 45 |
| amk.ChumbaWumba 0.3 | 9 | 11% | 20 |
| pfvicm.Sobieski 7.2.3b | 8 | 10% | 15 |
| qohnil.blot.BlotBot 3.61 | 7 | 9% | 19 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 10 |
| stelo.PianistNano 1.2 | 2 | 3% | 5 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |

## Melee bench: F29

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 78.7 | 79 / 210 | 2.92 | 17.3% | 30008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.2 | 17.3% | 79 |
| deewiant.Anomaly 0.2 | 2.3 | 14.7% | 44 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.9% | 60 |
| myl.micro.Troodon 1.10 | 4.3 | 11.6% | 11 |
| jok.PheonixM 0.1.2 | 4.5 | 10.9% | 10 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.6% | 2 |
| DBall.Anarchy 0.1 | 6.8 | 7.0% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 6.0% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.4% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 72.1 | 13 / 35 | 4583 |
| 2 | 1 | 67.2 | 78.4 | 12 / 35 | 5197 |
| 3 | 1 | 68.8 | 86.3 | 17 / 35 | 5130 |
| 4 | 1 | 67.7 | 83.2 | 11 / 35 | 5153 |
| 5 | 1 | 67.1 | 78.4 | 13 / 35 | 5256 |
| 6 | 1 | 65.0 | 73.7 | 13 / 35 | 4689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 52 | 73% |
| zyx.mega.YersiniaPestis 3.1 | 39 | 46% |
| myl.micro.Troodon 1.10 | 13 | 77% |
| jok.PheonixM 0.1.2 | 10 | 60% |
| ap.Frederick 1.1 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 48 | 36% | 86 |
| zyx.mega.YersiniaPestis 3.1 | 39 | 30% | 58 |
| myl.micro.Troodon 1.10 | 21 | 16% | 36 |
| jok.PheonixM 0.1.2 | 15 | 11% | 15 |
| ph.melee.ArcherME 0.3 | 3 | 2% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.1 | 34 / 210 | 3.70 | 14.0% | 23322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 2.3 | 14.0% | 34 |
| darkcanuck.B26354 1.06 | 2.8 | 13.4% | 55 |
| catcat20.Matcha 0.006 | 3.0 | 13.6% | 50 |
| oog.melee.Capulet 1.2 | 3.3 | 13.1% | 30 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.7% | 26 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.5% | 7 |
| ntc.Opposite 1.5 | 7.5 | 7.6% | 2 |
| tripphippy.Alice 1.1 | 8.0 | 7.2% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.2% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.9 | 64.1 | 1 / 35 | 3705 |
| 2 | 3 | 60.3 | 67.9 | 6 / 35 | 3572 |
| 3 | 2 | 61.0 | 70.2 | 5 / 35 | 3734 |
| 4 | 2 | 62.4 | 73.7 | 7 / 35 | 4169 |
| 5 | 1 | 62.2 | 73.7 | 8 / 35 | 3890 |
| 6 | 1 | 62.0 | 70.8 | 7 / 35 | 4252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 24 | 38% |
| oog.melee.Capulet 1.2 | 19 | 63% |
| stelo.PastFuture 2.3.2 | 14 | 64% |
| darkcanuck.B26354 1.06 | 14 | 0% |
| tripphippy.Alice 1.1 | 2 | 50% |
| intruder.PrairieWolf 2.61 | 2 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 38 | 22% | 41 |
| oog.melee.Capulet 1.2 | 37 | 21% | 45 |
| stelo.PastFuture 2.3.2 | 33 | 19% | 42 |
| catcat20.Matcha 0.006 | 33 | 19% | 42 |
| ntc.Opposite 1.5 | 11 | 6% | 12 |
| tripphippy.Alice 1.1 | 10 | 6% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 5% | 11 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 6 |

## Melee bench: F31

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 72.4 | 38 / 210 | 3.48 | 14.6% | 23428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.7% | 117 |
| hadur117.mini.DeiseHS650 0.4 | 2.2 | 14.6% | 38 |
| gh.mini.Griezel 0.2 | 3.2 | 13.0% | 38 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.3% | 2 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.1% | 7 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.8% | 4 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.7% | 3 |
| fm.mammillarias 1.3 | 7.8 | 6.2% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 76.2 | 12 / 35 | 4008 |
| 2 | 2 | 63.3 | 75.6 | 8 / 35 | 3978 |
| 3 | 2 | 62.8 | 76.2 | 5 / 35 | 3694 |
| 4 | 2 | 62.2 | 73.0 | 4 / 35 | 3841 |
| 5 | 2 | 63.4 | 73.0 | 7 / 35 | 4135 |
| 6 | 3 | 58.2 | 60.6 | 2 / 35 | 3772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 35% |
| gh.mini.Griezel 0.2 | 16 | 25% |
| d414.nano.Quantum 1.0.0 | 11 | 100% |
| spinnercat.micro.Tyger 0.1 | 7 | 57% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 74 | 43% | 88 |
| gh.mini.Griezel 0.2 | 40 | 23% | 50 |
| d414.nano.Quantum 1.0.0 | 24 | 14% | 31 |
| spinnercat.micro.Tyger 0.1 | 19 | 11% | 21 |
| gh.nano.Grofvuil 0.2 | 6 | 3% | 8 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 4 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.8 | 114 / 210 | 2.19 | 18.8% | 31998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 18.8% | 114 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.2% | 50 |
| apc.botM 3.0 | 3.2 | 12.0% | 20 |
| lxx.ConceptA 0.8 | 3.8 | 10.9% | 10 |
| vjik.UnViolation 1.1 | 5.3 | 9.5% | 7 |
| bayen.UbaMicro 1.4 | 5.7 | 8.8% | 4 |
| panzer.Panzer 0.2 | 7.3 | 7.3% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.8% | 2 |
| conscience.Electron 1.3g | 9.2 | 6.1% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.7 | 18 / 35 | 4933 |
| 2 | 1 | 67.9 | 87.3 | 15 / 35 | 5327 |
| 3 | 1 | 66.7 | 80.0 | 17 / 35 | 5373 |
| 4 | 1 | 68.4 | 87.3 | 21 / 35 | 5308 |
| 5 | 1 | 69.1 | 88.6 | 22 / 35 | 5388 |
| 6 | 1 | 69.7 | 91.7 | 21 / 35 | 5669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 66 | 58% |
| lxx.ConceptA 0.8 | 32 | 81% |
| apc.botM 3.0 | 25 | 76% |
| donjezza.Jezza 1.0 | 10 | 90% |
| vjik.UnViolation 1.1 | 10 | 70% |
| yk.JahMicro 1.0 | 7 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| conscience.Electron 1.3g | 2 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 49% | 87 |
| lxx.ConceptA 0.8 | 20 | 21% | 31 |
| apc.botM 3.0 | 12 | 13% | 39 |
| bayen.UbaMicro 1.4 | 7 | 7% | 9 |
| vjik.UnViolation 1.1 | 6 | 6% | 27 |
| panzer.Panzer 0.2 | 2 | 2% | 4 |
| conscience.Electron 1.3g | 1 | 1% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |
| yk.JahMicro 1.0 | 0 | 0% | 3 |

## Melee bench: F33

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.9 | 86 / 210 | 2.63 | 18.0% | 31374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.2 | 18.0% | 86 |
| maribo.Quester 0.3 | 1.8 | 16.1% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.8% | 30 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.1% | 16 |
| labg.Cataclysm 2.05 | 4.5 | 10.8% | 20 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.2% | 6 |
| baal.nano.N 1.42 | 6.7 | 8.1% | 2 |
| zyx.micro.Ant 1.1 | 8.5 | 5.6% | 0 |
| sanja.First 0.1 | 9.0 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.1 | 15 / 35 | 5493 |
| 2 | 2 | 65.9 | 77.5 | 13 / 35 | 4590 |
| 3 | 1 | 66.8 | 79.7 | 11 / 35 | 5307 |
| 4 | 1 | 67.0 | 81.3 | 12 / 35 | 5030 |
| 5 | 1 | 67.9 | 80.6 | 15 / 35 | 5449 |
| 6 | 1 | 69.6 | 87.9 | 20 / 35 | 5505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 48 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 50% |
| gre.svman4.Leonidas 1.3.2 | 20 | 90% |
| labg.Cataclysm 2.05 | 20 | 75% |
| kinsen.melee.Angsaichmophobia 1.8c | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 55 | 43% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 23% | 46 |
| gre.svman4.Leonidas 1.3.2 | 12 | 9% | 24 |
| labg.Cataclysm 2.05 | 11 | 9% | 24 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 8% | 12 |
| baal.nano.N 1.42 | 7 | 6% | 10 |
| sanja.First 0.1 | 1 | 1% | 2 |
| zyx.micro.Ant 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.2 | 55 / 210 | 2.51 | 17.7% | 34153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.2 | 17.7% | 55 |
| stelo.Spread 0.9 | 2.2 | 16.8% | 82 |
| kid.Gladiator .7.2 | 2.7 | 16.2% | 51 |
| jcs.Seth 1.8 | 4.0 | 10.8% | 16 |
| tcf.Reach 3 | 5.3 | 9.9% | 6 |
| cli.Dancer 1.1 | 5.7 | 9.7% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.9% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 82.9 | 6 / 35 | 5862 |
| 2 | 1 | 68.4 | 82.9 | 11 / 35 | 5761 |
| 3 | 1 | 67.9 | 84.1 | 7 / 35 | 5688 |
| 4 | 1 | 67.3 | 82.2 | 7 / 35 | 5401 |
| 5 | 1 | 69.2 | 85.7 | 12 / 35 | 6183 |
| 6 | 1 | 67.3 | 81.3 | 12 / 35 | 5258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 68 | 35% |
| kid.Gladiator .7.2 | 44 | 41% |
| jcs.Seth 1.8 | 15 | 67% |
| tcf.Reach 3 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 70 | 45% | 94 |
| kid.Gladiator .7.2 | 56 | 36% | 72 |
| jcs.Seth 1.8 | 12 | 8% | 22 |
| tcf.Reach 3 | 10 | 6% | 13 |
| ratosh.Wesco 1.4 | 4 | 3% | 5 |
| cli.Dancer 1.1 | 2 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 76.7 | 25 / 210 | 3.10 | 14.9% | 23305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.8% | 150 |
| hadur117.mini.DeiseHS650 0.4 | 2.0 | 14.9% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.3 | 12.2% | 13 |
| gh.mini.Gruwel 0.9 | 4.2 | 12.0% | 18 |
| rz.HawkOnFire 0.1 | 4.5 | 11.8% | 4 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.2% | 1 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.2% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 70.8 | 1 / 35 | 3775 |
| 2 | 2 | 63.5 | 78.1 | 4 / 35 | 3989 |
| 3 | 2 | 65.5 | 82.5 | 7 / 35 | 4252 |
| 4 | 2 | 61.5 | 71.7 | 3 / 35 | 3522 |
| 5 | 2 | 62.4 | 75.2 | 3 / 35 | 3814 |
| 6 | 2 | 65.0 | 81.6 | 7 / 35 | 3953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 76 | 11% |
| gh.mini.Gruwel 0.9 | 11 | 36% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 78% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 102 | 55% | 110 |
| rz.HawkOnFire 0.1 | 27 | 15% | 28 |
| gh.mini.Gruwel 0.9 | 24 | 13% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 11% | 28 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 4% | 8 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.4 | 141 / 210 | 1.95 | 20.6% | 36332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 20.6% | 141 |
| bzdp.Pansy 2.1 | 2.7 | 11.8% | 17 |
| alpha.RainingFire 1.0 | 3.0 | 12.0% | 21 |
| mz.Cork 0.1 | 4.2 | 11.0% | 11 |
| bvh.micro.Freya 0.3 | 4.5 | 10.3% | 5 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.2% | 2 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.3% | 10 |
| dl.BetterWalls 1.0 | 8.5 | 5.7% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.3% | 1 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.6 | 26 / 35 | 6055 |
| 2 | 1 | 70.9 | 92.1 | 23 / 35 | 5868 |
| 3 | 1 | 71.1 | 90.2 | 26 / 35 | 6148 |
| 4 | 1 | 70.8 | 89.5 | 24 / 35 | 6128 |
| 5 | 1 | 69.7 | 87.0 | 20 / 35 | 5942 |
| 6 | 1 | 70.7 | 90.2 | 22 / 35 | 6191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 38 | 84% |
| bvh.micro.Freya 0.3 | 32 | 100% |
| alpha.RainingFire 1.0 | 30 | 77% |
| mz.Cork 0.1 | 22 | 100% |
| m3thos.Eva02 0.7.1 | 15 | 73% |
| bvh.mini.Fenrir 0.39 | 14 | 93% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 30% | 39 |
| bzdp.Pansy 2.1 | 15 | 21% | 46 |
| m3thos.Eva02 0.7.1 | 9 | 13% | 22 |
| bvh.micro.Freya 0.3 | 7 | 10% | 31 |
| bvh.mini.Fenrir 0.39 | 7 | 10% | 18 |
| mz.Cork 0.1 | 4 | 6% | 33 |
| dl.BetterWalls 1.0 | 3 | 4% | 11 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 93.5 | 174 / 210 | 1.58 | 20.8% | 37188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 20.8% | 174 |
| germ.TheMind .2 | 2.2 | 11.2% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.0% | 7 |
| EBBU.Sim2 1.02 | 4.7 | 9.3% | 1 |
| agrach.Dalek 1.0 | 5.2 | 8.9% | 3 |
| lmk.ACPFinal 0.1 | 6.8 | 8.3% | 5 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.1% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 7.9% | 0 |
| mb.Beast 0.1 | 8.2 | 7.7% | 1 |
| skm.Ryubot 1.0 | 8.3 | 7.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 95.9 | 32 / 35 | 6633 |
| 2 | 1 | 71.1 | 96.5 | 30 / 35 | 6103 |
| 3 | 1 | 70.1 | 94.0 | 28 / 35 | 6125 |
| 4 | 1 | 71.6 | 96.8 | 31 / 35 | 6541 |
| 5 | 1 | 69.0 | 88.9 | 26 / 35 | 6086 |
| 6 | 1 | 68.6 | 89.2 | 27 / 35 | 5700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 48 | 98% |
| stelo.UntouchableNano 1.3 | 27 | 74% |
| EBBU.Sim2 1.02 | 25 | 100% |
| skm.Ryubot 1.0 | 19 | 100% |
| agrach.Dalek 1.0 | 19 | 100% |
| mb.Beast 0.1 | 16 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 100% |
| lmk.ACPFinal 0.1 | 14 | 86% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 8 | 22% | 22 |
| lmk.ACPFinal 0.1 | 7 | 19% | 22 |
| germ.TheMind .2 | 6 | 17% | 53 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 14% | 33 |
| EBBU.Sim2 1.02 | 5 | 14% | 21 |
| agrach.Dalek 1.0 | 2 | 6% | 27 |
| mb.Beast 0.1 | 2 | 6% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 3% | 6 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

## Melee bench: F38

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 79.5 | 81 / 210 | 2.84 | 16.8% | 28798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.2 | 16.8% | 81 |
| justin.Mallais 14.0 | 1.8 | 15.7% | 73 |
| bvh.mini.Freya 0.55 | 3.5 | 12.3% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 10.6% | 4 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.7% | 20 |
| cs.Wren 1.0 | 5.2 | 10.4% | 8 |
| kdf.KoulDestroyer 1.0 | 7.0 | 9.1% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.9% | 2 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.5 | 14 / 35 | 5066 |
| 2 | 1 | 66.0 | 81.6 | 17 / 35 | 4371 |
| 3 | 2 | 65.8 | 78.1 | 12 / 35 | 4745 |
| 4 | 1 | 65.7 | 79.4 | 12 / 35 | 4861 |
| 5 | 1 | 65.9 | 78.7 | 14 / 35 | 4869 |
| 6 | 1 | 65.0 | 76.8 | 12 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 44 | 43% |
| bvh.mini.Freya 0.55 | 20 | 80% |
| bts.mega.Gnarly 1.4 | 18 | 61% |
| cs.Wren 1.0 | 14 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 92% |
| kdf.KoulDestroyer 1.0 | 8 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 53 | 41% | 77 |
| bts.mega.Gnarly 1.4 | 20 | 15% | 32 |
| bvh.mini.Freya 0.55 | 20 | 15% | 29 |
| kdf.KoulDestroyer 1.0 | 12 | 9% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 8% | 25 |
| cs.Wren 1.0 | 10 | 8% | 21 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 6 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 3 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.1 | 86 / 210 | 2.43 | 18.1% | 32427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 18.1% | 86 |
| bvh.fry.Freya 0.82 | 2.3 | 15.1% | 32 |
| az.Ololobot 0.2.4 | 2.7 | 12.9% | 55 |
| catcat20.Lambda 0.024 | 4.0 | 11.0% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 5.8 | 8.8% | 9 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.6% | 6 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.0% | 0 |
| gimp.GimpBot 0.1 | 7.2 | 7.8% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.2 | 20 / 35 | 5535 |
| 2 | 1 | 67.3 | 84.1 | 15 / 35 | 5245 |
| 3 | 1 | 66.2 | 79.0 | 11 / 35 | 5357 |
| 4 | 1 | 67.9 | 85.1 | 15 / 35 | 5484 |
| 5 | 1 | 67.9 | 86.3 | 15 / 35 | 5312 |
| 6 | 1 | 66.3 | 80.0 | 10 / 35 | 5494 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 43 | 77% |
| az.Ololobot 0.2.4 | 35 | 31% |
| catcat20.Lambda 0.024 | 26 | 77% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 94% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| gimp.GimpBot 0.1 | 3 | 67% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 56 | 45% | 81 |
| az.Ololobot 0.2.4 | 38 | 30% | 56 |
| catcat20.Lambda 0.024 | 20 | 16% | 35 |
| gimp.GimpBot 0.1 | 4 | 3% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 3% | 10 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 5 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.2 | 85 / 210 | 2.42 | 18.3% | 31834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 18.3% | 85 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 15.2% | 52 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.3% | 32 |
| mz.AntiGrav 1.0 | 3.8 | 11.5% | 9 |
| Polkwane.SmashMelee 1.0 | 4.7 | 11.2% | 17 |
| stelo.Randomness 1.0 | 6.0 | 9.2% | 12 |
| alpha.BlackIce 1.0 | 7.0 | 8.2% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 5.8% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.9% | 0 |
| sample.Corners 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.9 | 13 / 35 | 5105 |
| 2 | 1 | 68.9 | 86.3 | 17 / 35 | 5515 |
| 3 | 1 | 67.9 | 83.8 | 14 / 35 | 5387 |
| 4 | 1 | 68.8 | 85.1 | 12 / 35 | 5640 |
| 5 | 1 | 68.3 | 84.4 | 19 / 35 | 5146 |
| 6 | 1 | 67.0 | 82.9 | 10 / 35 | 5041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 42% |
| kano.gamma.KanoGamma 1.8 | 37 | 54% |
| mz.AntiGrav 1.0 | 21 | 100% |
| Polkwane.SmashMelee 1.0 | 19 | 84% |
| stelo.Randomness 1.0 | 6 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 50% |
| alpha.BlackIce 1.0 | 1 | 0% |
| sample.Corners 1.0 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 49 | 39% | 66 |
| kano.gamma.KanoGamma 1.8 | 34 | 27% | 58 |
| Polkwane.SmashMelee 1.0 | 19 | 15% | 29 |
| mz.AntiGrav 1.0 | 9 | 7% | 25 |
| stelo.Randomness 1.0 | 8 | 6% | 19 |
| alpha.BlackIce 1.0 | 4 | 3% | 5 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 3 |
| sample.Corners 1.0 | 1 | 1% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.2 | 60 / 210 | 2.96 | 15.9% | 25484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.2 | 16.8% | 94 |
| hadur117.mini.DeiseHS650 0.4 | 1.8 | 15.9% | 60 |
| ary.Swarm 1.1 | 3.2 | 13.5% | 22 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.7% | 17 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.7% | 17 |
| shrub.Silver v048 | 6.2 | 8.4% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 2 |
| stelo.Mirror 1.1 | 8.7 | 5.8% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.6 | 16 / 35 | 4184 |
| 2 | 2 | 65.5 | 79.4 | 13 / 35 | 4319 |
| 3 | 2 | 63.8 | 75.9 | 8 / 35 | 4063 |
| 4 | 2 | 64.3 | 76.8 | 5 / 35 | 4341 |
| 5 | 2 | 64.4 | 75.9 | 10 / 35 | 4275 |
| 6 | 2 | 64.9 | 79.7 | 8 / 35 | 4302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 57 | 30% |
| ary.Swarm 1.1 | 22 | 82% |
| lessonz.robocode.Oz 0.5.0 | 19 | 74% |
| simonton.nano.MeleeSeed 1.8 | 14 | 57% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 66 | 43% | 86 |
| ary.Swarm 1.1 | 29 | 19% | 42 |
| simonton.nano.MeleeSeed 1.8 | 22 | 14% | 28 |
| lessonz.robocode.Oz 0.5.0 | 18 | 12% | 28 |
| jsal.Jsalbot 1.0 | 4 | 3% | 8 |
| shrub.Silver v048 | 4 | 3% | 7 |
| zyx.nano.Ant 1.1 | 3 | 2% | 3 |
| stelo.Mirror 1.1 | 2 | 1% | 4 |
| acogdev.alpha 0.2 | 2 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.3 | 73 / 210 | 2.78 | 17.3% | 32220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 17.3% | 73 |
| wompi.Wallaby 5.1 | 2.0 | 16.1% | 69 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 14.0% | 27 |
| ara.Shera 0.88 | 3.7 | 13.9% | 39 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 3 |
| dsw.StaticD 1.0 | 6.5 | 7.1% | 1 |
| maribo.IotaCT 1.1 | 6.5 | 6.9% | 0 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 80.0 | 11 / 35 | 5038 |
| 2 | 1 | 67.2 | 81.6 | 13 / 35 | 5400 |
| 3 | 1 | 66.9 | 80.0 | 14 / 35 | 5300 |
| 4 | 1 | 66.9 | 82.5 | 11 / 35 | 5400 |
| 5 | 1 | 67.4 | 80.3 | 11 / 35 | 5769 |
| 6 | 1 | 65.9 | 77.1 | 13 / 35 | 5313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 45 | 60% |
| ara.Shera 0.88 | 28 | 71% |
| maribo.mini.MiniQuester 0.1 | 23 | 65% |
| dsw.StaticD 1.0 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 48 | 35% | 84 |
| maribo.mini.MiniQuester 0.1 | 39 | 28% | 53 |
| ara.Shera 0.88 | 38 | 28% | 54 |
| amz.NanoClone 1.41 | 6 | 4% | 8 |
| dsw.StaticD 1.0 | 3 | 2% | 4 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 73.8 | 24 / 210 | 3.36 | 14.9% | 26021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 162 |
| hadur117.mini.DeiseHS650 0.4 | 2.0 | 14.9% | 24 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.3% | 14 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.3% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.4% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.0% | 0 |
| mz.NanoGod 2.02 | 7.3 | 7.5% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 79.7 | 5 / 35 | 4391 |
| 2 | 2 | 64.9 | 75.6 | 3 / 35 | 4431 |
| 3 | 2 | 63.0 | 69.8 | 5 / 35 | 4327 |
| 4 | 2 | 64.2 | 74.3 | 2 / 35 | 4314 |
| 5 | 2 | 64.0 | 71.4 | 6 / 35 | 4457 |
| 6 | 2 | 63.1 | 71.7 | 3 / 35 | 4101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 62 | 8% |
| dummy.micro.Sparrow 2.5 | 12 | 67% |
| brainfade.melee.Dusk 0.44 | 11 | 73% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 99 | 53% | 103 |
| brainfade.melee.Dusk 0.44 | 32 | 17% | 36 |
| dummy.micro.Sparrow 2.5 | 23 | 12% | 33 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 9% | 20 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 6 |
| mz.NanoGod 2.02 | 5 | 3% | 6 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.7 | 88 / 210 | 2.38 | 18.7% | 34366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 18.7% | 88 |
| stelo.Liblix 0.3.1 | 2.0 | 15.7% | 70 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.7% | 40 |
| wompi.Quokka 1.6 | 4.2 | 10.4% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.3% | 1 |
| disan.Chair 2.2.0 | 6.3 | 8.3% | 1 |
| jwirde.Gort 2.0 | 6.8 | 7.8% | 6 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.3 | 17 / 35 | 5572 |
| 2 | 1 | 67.2 | 81.0 | 11 / 35 | 5669 |
| 3 | 1 | 69.5 | 86.3 | 17 / 35 | 6058 |
| 4 | 1 | 66.7 | 80.0 | 12 / 35 | 5329 |
| 5 | 1 | 69.5 | 87.6 | 14 / 35 | 6071 |
| 6 | 1 | 69.2 | 86.0 | 17 / 35 | 5667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 64 | 47% |
| tzu.TheArtOfWar 1.2 | 41 | 51% |
| wompi.Quokka 1.6 | 14 | 93% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| jwirde.Gort 2.0 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 55 | 44% | 94 |
| tzu.TheArtOfWar 1.2 | 35 | 28% | 53 |
| wompi.Quokka 1.6 | 12 | 10% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 6% | 15 |
| disan.Chair 2.2.0 | 4 | 3% | 9 |
| amk.jointstrike.JointStrike 0.2 | 4 | 3% | 4 |
| stf.PanzerGeneral 0.1 | 3 | 2% | 7 |
| jwirde.Gort 2.0 | 2 | 2% | 8 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 86.2 | 64 / 210 | 2.24 | 19.6% | 38535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseHS650 0.4 | 1.0 | 19.6% | 64 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 14.0% | 130 |
| jje.BagPuss 1.2 | 3.2 | 11.4% | 6 |
| sul.Lunar 1.1 | 4.3 | 10.3% | 5 |
| myl.nano.Graviton 1.10 | 4.5 | 10.5% | 5 |
| hvilela.HVilela 0.9 | 6.3 | 8.7% | 0 |
| fm.claire 1.7 | 7.3 | 7.8% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.6% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.9% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 79.7 | 10 / 35 | 5765 |
| 2 | 1 | 70.1 | 87.6 | 12 / 35 | 6665 |
| 3 | 1 | 69.9 | 87.9 | 11 / 35 | 6467 |
| 4 | 1 | 69.2 | 85.4 | 10 / 35 | 6494 |
| 5 | 1 | 70.0 | 89.2 | 10 / 35 | 6467 |
| 6 | 1 | 70.0 | 87.3 | 11 / 35 | 6677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 115 | 17% |
| sul.Lunar 1.1 | 15 | 87% |
| myl.nano.Graviton 1.10 | 12 | 83% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 100% |
| jje.BagPuss 1.2 | 9 | 89% |
| fm.claire 1.7 | 2 | 100% |
| wit.Deep7 2.0 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 1680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 66% | 0 |
| jje.BagPuss 1.2 | 13 | 9% | 53 |
| myl.nano.Graviton 1.10 | 12 | 8% | 36 |
| sul.Lunar 1.1 | 10 | 7% | 54 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 3% | 19 |
| hvilela.HVilela 0.9 | 4 | 3% | 18 |
| wit.Deep7 2.0 | 3 | 2% | 12 |
| fm.claire 1.7 | 3 | 2% | 10 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseHS650 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 80.4 | 41 / 210 | 2.76 | 15.9% | 26436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.3% | 79 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.7% | 80 |
| hadur117.mini.DeiseHS650 0.4 | 2.7 | 15.9% | 41 |
| mz.MicroSheep 1.0 | 4.2 | 10.1% | 3 |
| cx.Princess 1.0 | 5.2 | 9.3% | 7 |
| sadoner.killer 0.2 | 5.7 | 9.4% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.5% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 77.5 | 6 / 35 | 3768 |
| 2 | 3 | 64.7 | 79.4 | 4 / 35 | 4607 |
| 3 | 2 | 66.7 | 84.4 | 11 / 35 | 4662 |
| 4 | 3 | 64.2 | 77.8 | 4 / 35 | 4335 |
| 5 | 2 | 65.8 | 83.2 | 8 / 35 | 4582 |
| 6 | 3 | 65.2 | 80.3 | 8 / 35 | 4482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 44% |
| rsalesc.melee.Medina 0.4.5 | 43 | 28% |
| cx.Princess 1.0 | 4 | 100% |
| mz.MicroSheep 1.0 | 3 | 67% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 75 | 44% | 96 |
| rsalesc.melee.Medina 0.4.5 | 56 | 33% | 69 |
| mz.MicroSheep 1.0 | 14 | 8% | 15 |
| cx.Princess 1.0 | 9 | 5% | 9 |
| arthord.NanoSatanMelee Beta | 8 | 5% | 8 |
| sadoner.killer 0.2 | 6 | 4% | 9 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |
1 death(s) with no robot to name.

