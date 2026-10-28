# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.8 | 51 / 210 | 2.37 | 16.8% | 29607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 141 |
| hadur117.mini.DeiseWN 0.2 | 2.0 | 16.8% | 51 |
| sgp.JollyNinja 3.53 | 3.8 | 10.9% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.7% | 1 |
| mz.MicroGodMelee 1 | 4.3 | 10.6% | 3 |
| lorneswork.Predator 1.0 | 5.8 | 9.4% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 84.4 | 5 / 35 | 4845 |
| 2 | 2 | 67.2 | 86.3 | 11 / 35 | 5074 |
| 3 | 2 | 67.4 | 86.3 | 10 / 35 | 4888 |
| 4 | 2 | 66.6 | 86.7 | 9 / 35 | 4782 |
| 5 | 2 | 66.6 | 85.4 | 9 / 35 | 5287 |
| 6 | 2 | 64.6 | 79.7 | 7 / 35 | 4731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 14% |
| mz.MicroGodMelee 1 | 14 | 79% |
| sgp.JollyNinja 3.53 | 12 | 75% |
| lorneswork.Predator 1.0 | 6 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 4 | 75% |

Hadur died in 159 of 210 rounds, at a mean tick of 1118. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 113 | 71% | 131 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 11% | 22 |
| sgp.JollyNinja 3.53 | 10 | 6% | 19 |
| mz.MicroGodMelee 1 | 8 | 5% | 19 |
| lorneswork.Predator 1.0 | 8 | 5% | 10 |
| adt.Ar2 1.0 | 3 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 77.1 | 83 / 210 | 3.06 | 16.7% | 29558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 16.7% | 83 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.2% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 14.2% | 38 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.7% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.3% | 19 |
| Noran.BitchingElk 0.054 | 6.8 | 7.9% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.7% | 2 |
| sch.Simone 0.3d | 7.7 | 7.1% | 1 |
| stelo.PatternRobot 1.0 | 8.7 | 6.7% | 6 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 75.6 | 11 / 35 | 4830 |
| 2 | 1 | 64.3 | 75.2 | 9 / 35 | 4788 |
| 3 | 1 | 65.8 | 76.8 | 17 / 35 | 4945 |
| 4 | 1 | 63.1 | 70.8 | 13 / 35 | 4569 |
| 5 | 1 | 68.1 | 84.4 | 16 / 35 | 5440 |
| 6 | 1 | 66.5 | 79.7 | 17 / 35 | 4986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 73% |
| pulsar.PulsarMax 0.8.9 | 35 | 63% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| sch.Simone 0.3d | 7 | 86% |
| stelo.PatternRobot 1.0 | 7 | 71% |
| Noran.BitchingElk 0.054 | 5 | 40% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 46 | 36% | 70 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 31 | 24% | 59 |
| stelo.PatternRobot 1.0 | 13 | 10% | 19 |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 9% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 9% | 15 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 7 |
| Noran.BitchingElk 0.054 | 4 | 3% | 12 |
| sch.Simone 0.3d | 4 | 3% | 6 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.0 | 145 / 210 | 1.63 | 20.3% | 37787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 20.3% | 145 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.1% | 15 |
| radnor.DoctorBob 1.42 | 3.0 | 13.2% | 14 |
| vuen.Cake 2.51 | 3.3 | 12.6% | 33 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.7 | 7.4% | 1 |
| oa.weak.FlyMk1 0.1 | 8.2 | 6.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.9 | 27 / 35 | 6794 |
| 2 | 1 | 71.2 | 96.2 | 28 / 35 | 6020 |
| 3 | 1 | 68.9 | 88.9 | 20 / 35 | 5923 |
| 4 | 1 | 70.4 | 92.1 | 22 / 35 | 6657 |
| 5 | 1 | 69.3 | 91.7 | 24 / 35 | 5775 |
| 6 | 1 | 71.2 | 94.0 | 24 / 35 | 6618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 64 | 56% |
| kawigi.nano.Lib 1.0 | 57 | 88% |
| radnor.DoctorBob 1.42 | 45 | 100% |
| oa.weak.FlyMk1 0.1 | 8 | 88% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 32 | 49% | 72 |
| kawigi.nano.Lib 1.0 | 12 | 18% | 64 |
| radnor.DoctorBob 1.42 | 12 | 18% | 37 |
| urdos.URDOS 1.3 | 3 | 5% | 8 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 13 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 4 |
| adt.Ar1 2.1 | 1 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.3 | 29 / 210 | 2.41 | 17.3% | 34709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 173 |
| hadur117.mini.DeiseWN 0.2 | 2.0 | 17.3% | 29 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.3% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 10.5% | 1 |
| josago.Jorgito 0.16 | 5.2 | 8.8% | 0 |
| css.Delitioner 0.11 | 5.8 | 7.8% | 0 |
| tj.zombie1n 1.0.1 | 7.2 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.1 | 86.7 | 8 / 35 | 6098 |
| 2 | 2 | 66.0 | 80.3 | 5 / 35 | 5101 |
| 3 | 2 | 68.2 | 87.0 | 4 / 35 | 5826 |
| 4 | 2 | 67.7 | 83.5 | 4 / 35 | 5864 |
| 5 | 2 | 68.6 | 87.6 | 3 / 35 | 5895 |
| 6 | 2 | 67.1 | 80.6 | 5 / 35 | 5925 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 144 | 16% |
| apc.LeeroyJenkins2 1.0 | 7 | 57% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| TNT.TNT 0.99.1 | 1 | 0% |

Hadur died in 181 of 210 rounds, at a mean tick of 1250. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 143 | 79% | 166 |
| apc.LeeroyJenkins2 1.0 | 15 | 8% | 19 |
| TNT.TNT 0.99.1 | 12 | 7% | 12 |
| josago.Jorgito 0.16 | 4 | 2% | 4 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| css.Delitioner 0.11 | 2 | 1% | 4 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |

## Melee bench: F05

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 69.5 | 22 / 210 | 3.74 | 13.2% | 20966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 18.1% | 112 |
| justin.DemonicRage 3.4 | 1.5 | 17.2% | 58 |
| wompi.Numbat 2.1 | 3.5 | 12.9% | 11 |
| hadur117.mini.DeiseWN 0.2 | 3.5 | 13.2% | 22 |
| ms.Ares 0.19 | 5.3 | 9.6% | 3 |
| axeBots.HataMoto 3.09 | 5.7 | 9.0% | 4 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.2 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 8.8 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.0 | 64.1 | 5 / 35 | 3336 |
| 2 | 4 | 59.5 | 68.3 | 2 / 35 | 3338 |
| 3 | 3 | 62.4 | 72.4 | 7 / 35 | 3728 |
| 4 | 4 | 60.7 | 70.2 | 2 / 35 | 3523 |
| 5 | 3 | 59.4 | 68.9 | 2 / 35 | 3390 |
| 6 | 3 | 62.0 | 73.3 | 4 / 35 | 3651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 30 | 17% |
| justin.DemonicRage 3.4 | 12 | 42% |
| wompi.Numbat 2.1 | 9 | 78% |
| ms.Ares 0.19 | 3 | 100% |
| axeBots.HataMoto 3.09 | 3 | 67% |

Hadur died in 188 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 64 | 34% | 70 |
| justin.DemonicRage 3.4 | 53 | 28% | 57 |
| wompi.Numbat 2.1 | 35 | 19% | 41 |
| axeBots.HataMoto 3.09 | 12 | 6% | 14 |
| ms.Ares 0.19 | 12 | 6% | 14 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.0 | 83 / 210 | 2.71 | 17.2% | 29840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 17.2% | 83 |
| jekl.StoneGhost 0.7 | 2.2 | 14.9% | 41 |
| origin.SleepSiphon 1.7b | 3.0 | 13.6% | 50 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.3% | 24 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 4 |
| gg.Wolverine 2.0 | 6.0 | 8.3% | 5 |
| spinnercat.Omen 1.0 | 7.0 | 7.4% | 1 |
| DBall.NUKE 0.1 | 8.2 | 6.4% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 6.3% | 2 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.2 | 13 / 35 | 4911 |
| 2 | 1 | 65.7 | 81.3 | 14 / 35 | 4596 |
| 3 | 1 | 67.5 | 83.5 | 17 / 35 | 5060 |
| 4 | 1 | 67.1 | 82.2 | 12 / 35 | 5296 |
| 5 | 1 | 66.7 | 79.7 | 15 / 35 | 5270 |
| 6 | 1 | 65.0 | 75.9 | 12 / 35 | 4707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 37 | 78% |
| origin.SleepSiphon 1.7b | 35 | 63% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 63% |
| mld.Wisdom 1.0 | 7 | 86% |
| gg.Wolverine 2.0 | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 40 | 31% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 24% | 45 |
| origin.SleepSiphon 1.7b | 27 | 21% | 49 |
| mld.Wisdom 1.0 | 12 | 9% | 22 |
| gg.Wolverine 2.0 | 7 | 5% | 10 |
| spinnercat.Omen 1.0 | 5 | 4% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 3% | 8 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
| sample.Fire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.6 | 105 / 210 | 1.85 | 19.6% | 36557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.2 | 19.6% | 105 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.7% | 57 |
| rtk.Tachikoma 1.0 | 2.8 | 16.2% | 30 |
| franzor.Lizt 1.3.1 | 4.3 | 10.7% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.6% | 9 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.7% | 1 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 12 / 35 | 5525 |
| 2 | 1 | 71.0 | 90.5 | 19 / 35 | 6022 |
| 3 | 1 | 71.8 | 92.1 | 21 / 35 | 6353 |
| 4 | 2 | 71.0 | 90.5 | 16 / 35 | 5964 |
| 5 | 1 | 71.8 | 91.4 | 20 / 35 | 6621 |
| 6 | 1 | 70.7 | 90.5 | 17 / 35 | 6072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 76 | 78% |
| rsalesc.melee.Monk 0.3.6c | 49 | 20% |
| oog.melee.CapuletDroid 1.1 | 21 | 76% |
| franzor.Lizt 1.3.1 | 18 | 83% |
| exauge.GateKeeper 1.1.121g | 6 | 83% |

Hadur died in 106 of 210 rounds, at a mean tick of 1280. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 52 | 49% | 75 |
| rtk.Tachikoma 1.0 | 39 | 37% | 108 |
| oog.melee.CapuletDroid 1.1 | 9 | 8% | 23 |
| franzor.Lizt 1.3.1 | 3 | 3% | 0 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.9 | 108 / 210 | 2.27 | 18.5% | 31296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 18.5% | 108 |
| shrub.Vapour v159 | 2.7 | 12.8% | 34 |
| tm.Yuugao 1.0 | 3.0 | 12.7% | 30 |
| Krabb.sliNk.Garm 0.9u | 3.5 | 11.5% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.4% | 3 |
| m3thos.Eva00 1.1 | 6.0 | 8.3% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 7.2 | 7.8% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.3% | 0 |
| SHAM.WOW 1.4 | 9.2 | 6.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.0 | 18 / 35 | 5134 |
| 2 | 1 | 68.8 | 87.3 | 20 / 35 | 5424 |
| 3 | 1 | 66.4 | 83.2 | 14 / 35 | 4981 |
| 4 | 1 | 69.8 | 91.1 | 21 / 35 | 5605 |
| 5 | 1 | 67.4 | 86.3 | 16 / 35 | 5113 |
| 6 | 1 | 66.5 | 80.6 | 19 / 35 | 5039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 44 | 55% |
| tm.Yuugao 1.0 | 42 | 69% |
| Krabb.sliNk.Garm 0.9u | 30 | 70% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 100% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 100% |
| m3thos.Eva00 1.1 | 7 | 71% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 33 | 32% | 55 |
| tm.Yuugao 1.0 | 25 | 25% | 58 |
| Krabb.sliNk.Garm 0.9u | 19 | 19% | 36 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 6% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 6% | 14 |
| zyx.nano.BacillusComma 1.0 | 5 | 5% | 9 |
| m3thos.Eva00 1.1 | 4 | 4% | 9 |
| SHAM.WOW 1.4 | 3 | 3% | 7 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 73.2 | 67 / 210 | 3.41 | 15.5% | 25811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.8% | 100 |
| hadur117.mini.DeiseWN 0.2 | 1.8 | 15.5% | 67 |
| kc.micro.Figment 1.0 | 3.0 | 13.3% | 14 |
| yagami.Tidus 0.11 | 4.3 | 10.6% | 1 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.1% | 12 |
| mc2.enemy.Original 0.9 | 5.7 | 9.1% | 14 |
| dft.Calliope 5.6 | 6.8 | 7.9% | 2 |
| step.nanoPri 1.0 | 8.7 | 5.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 74.0 | 12 / 35 | 4397 |
| 2 | 2 | 62.4 | 71.1 | 10 / 35 | 4024 |
| 3 | 1 | 64.3 | 73.7 | 14 / 35 | 4515 |
| 4 | 2 | 63.6 | 73.3 | 10 / 35 | 4105 |
| 5 | 2 | 66.7 | 79.4 | 13 / 35 | 4811 |
| 6 | 2 | 61.6 | 67.9 | 8 / 35 | 3959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 40 | 48% |
| kc.micro.Figment 1.0 | 28 | 86% |
| yagami.Tidus 0.11 | 10 | 100% |
| mc2.enemy.Original 0.9 | 6 | 100% |
| pedersen.Grishnakh 1.0 | 4 | 100% |
| dft.Calliope 5.6 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 67 | 47% | 89 |
| kc.micro.Figment 1.0 | 26 | 18% | 50 |
| yagami.Tidus 0.11 | 12 | 8% | 22 |
| pedersen.Grishnakh 1.0 | 11 | 8% | 12 |
| mc2.enemy.Original 0.9 | 10 | 7% | 17 |
| dft.Calliope 5.6 | 7 | 5% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7 | 5% | 7 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 94.3 | 162 / 210 | 1.51 | 20.3% | 34158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 20.3% | 162 |
| DTF.Kludgy 1.2b | 2.7 | 13.1% | 20 |
| ne.Chimera 1.2 | 2.8 | 13.2% | 13 |
| ejb.Polaris 1.0.1 | 3.5 | 12.1% | 8 |
| vStar.RAFzilla 2.15 | 5.5 | 9.6% | 4 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.0% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.9% | 2 |
| sam.Samspin 1.0 | 8.5 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.4 | 24 / 35 | 5527 |
| 2 | 1 | 70.3 | 93.0 | 24 / 35 | 5833 |
| 3 | 1 | 70.2 | 93.3 | 25 / 35 | 5733 |
| 4 | 1 | 70.5 | 94.0 | 27 / 35 | 5665 |
| 5 | 1 | 71.7 | 98.7 | 32 / 35 | 5379 |
| 6 | 1 | 71.4 | 95.6 | 30 / 35 | 6021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 48 | 71% |
| ejb.Polaris 1.0.1 | 46 | 96% |
| ne.Chimera 1.2 | 42 | 86% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| vStar.RAFzilla 2.15 | 14 | 93% |
| kurios.DOSexe .9b | 10 | 90% |
| donjezza.Muncho 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 43% | 52 |
| ne.Chimera 1.2 | 16 | 33% | 43 |
| ejb.Polaris 1.0.1 | 4 | 8% | 52 |
| tvv.micro.Antares 1.1.1 | 4 | 8% | 25 |
| kurios.DOSexe .9b | 2 | 4% | 10 |
| vStar.RAFzilla 2.15 | 1 | 2% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.3 | 77 / 210 | 2.87 | 16.7% | 27547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.5 | 16.7% | 77 |
| rz.Aleph 0.34 | 1.5 | 16.1% | 66 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.8% | 24 |
| djc.DynaBot 0.1.1 | 4.0 | 10.5% | 10 |
| br2.MobyDickBot 1.6 | 5.5 | 8.9% | 9 |
| rdt199.Warlord 0.73 | 6.2 | 8.7% | 12 |
| uji.YellohFellah 1.0 | 6.8 | 8.0% | 10 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.4% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.8 | 6.3% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.8 | 17 / 35 | 4473 |
| 2 | 1 | 68.4 | 87.3 | 19 / 35 | 5068 |
| 3 | 2 | 64.8 | 77.8 | 9 / 35 | 4730 |
| 4 | 2 | 65.6 | 81.0 | 12 / 35 | 4438 |
| 5 | 1 | 61.9 | 70.5 | 9 / 35 | 4399 |
| 6 | 2 | 63.4 | 74.3 | 11 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 45 | 62% |
| djc.DynaBot 0.1.1 | 21 | 86% |
| cx.mini.Nimrod 0.55 | 15 | 80% |
| rdt199.Warlord 0.73 | 10 | 60% |
| uji.YellohFellah 1.0 | 7 | 100% |
| br2.MobyDickBot 1.6 | 6 | 83% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 55 | 41% | 82 |
| cx.mini.Nimrod 0.55 | 32 | 24% | 41 |
| rdt199.Warlord 0.73 | 13 | 10% | 19 |
| br2.MobyDickBot 1.6 | 13 | 10% | 18 |
| djc.DynaBot 0.1.1 | 12 | 9% | 31 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 4 |
| uji.YellohFellah 1.0 | 2 | 2% | 11 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 81.7 | 109 / 210 | 2.65 | 17.2% | 24986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 17.2% | 109 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.8% | 34 |
| nat.PallasHawk 1.0 | 3.0 | 13.2% | 31 |
| darkcanuck.Leon 1.01 | 3.7 | 12.7% | 26 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.9% | 5 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 2 |
| jp.Perpy 16.0 | 7.0 | 7.2% | 0 |
| cs.sheldor.Talon 1.1 | 8.7 | 6.3% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.8% | 2 |
| stuff.Vlad 0.1 | 9.2 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 77.5 | 17 / 35 | 3705 |
| 2 | 1 | 64.7 | 77.1 | 16 / 35 | 4061 |
| 3 | 1 | 68.0 | 87.0 | 19 / 35 | 4648 |
| 4 | 1 | 66.6 | 82.5 | 18 / 35 | 4614 |
| 5 | 1 | 66.0 | 82.5 | 19 / 35 | 3880 |
| 6 | 1 | 66.5 | 83.5 | 20 / 35 | 4078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 73% |
| bts.wiki.RipCurl 0.9b | 39 | 85% |
| darkcanuck.Leon 1.01 | 34 | 76% |
| brainfade.melee.Genghis 0.36 | 9 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 24 | 24% | 59 |
| bts.wiki.RipCurl 0.9b | 21 | 21% | 44 |
| darkcanuck.Leon 1.01 | 18 | 18% | 55 |
| brainfade.melee.Genghis 0.36 | 14 | 14% | 19 |
| jrm.Test0 1.0 | 12 | 12% | 13 |
| jp.Perpy 16.0 | 6 | 6% | 9 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 7 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.5 | 64 / 210 | 2.75 | 15.9% | 25862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 16.7% | 87 |
| ags.Glacier 0.2.11 | 2.0 | 16.0% | 31 |
| hadur117.mini.DeiseWN 0.2 | 2.7 | 15.9% | 64 |
| shinh.Entangled 0.3 | 4.2 | 12.6% | 18 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.6% | 10 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.7% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 82.2 | 8 / 35 | 4733 |
| 2 | 3 | 65.4 | 82.5 | 13 / 35 | 3999 |
| 3 | 3 | 65.1 | 79.4 | 12 / 35 | 4230 |
| 4 | 3 | 63.9 | 75.6 | 8 / 35 | 4428 |
| 5 | 3 | 65.1 | 79.7 | 11 / 35 | 4165 |
| 6 | 2 | 66.3 | 83.8 | 12 / 35 | 4307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 56 | 38% |
| ags.Glacier 0.2.11 | 39 | 74% |
| shinh.Entangled 0.3 | 14 | 50% |
| gh.micro.Gruweltje 0.7 | 3 | 67% |
| apc.Colossus2 0.17 | 3 | 100% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 60 | 41% | 82 |
| ags.Glacier 0.2.11 | 39 | 27% | 66 |
| shinh.Entangled 0.3 | 24 | 16% | 32 |
| gh.micro.Gruweltje 0.7 | 11 | 8% | 14 |
| stelo.Wang 1.0 | 9 | 6% | 12 |
| apc.Colossus2 0.17 | 2 | 1% | 3 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.7 | 157 / 210 | 1.66 | 20.5% | 35101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 20.5% | 157 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 22 |
| catcat20.shape.Theta 0.018 | 3.2 | 12.4% | 23 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 9.9% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 9.5% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 8.9% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 6.2 | 8.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.7% | 4 |
| pa.Improved 1.0 | 9.0 | 5.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.9 | 30 / 35 | 5960 |
| 2 | 1 | 69.9 | 89.5 | 24 / 35 | 5656 |
| 3 | 1 | 71.0 | 91.1 | 26 / 35 | 5988 |
| 4 | 1 | 71.5 | 94.9 | 27 / 35 | 5816 |
| 5 | 1 | 70.4 | 92.7 | 22 / 35 | 5690 |
| 6 | 1 | 71.5 | 93.0 | 28 / 35 | 5991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 92% |
| catcat20.shape.Theta 0.018 | 41 | 78% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 81% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 26 | 49% | 97 |
| catcat20.shape.Theta 0.018 | 14 | 26% | 45 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 13% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 11 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 4 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 25 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 1 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.4 | 92 / 210 | 2.86 | 17.5% | 31808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 17.5% | 92 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.2% | 27 |
| emp.Yngwie 1.11 | 3.0 | 12.6% | 40 |
| mld.DustBunny 3.8 | 4.2 | 11.8% | 8 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.6% | 15 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.2% | 21 |
| lambdaxy.TBot 0.1 | 7.3 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.4% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 74.3 | 12 / 35 | 4656 |
| 2 | 1 | 66.3 | 79.0 | 14 / 35 | 5217 |
| 3 | 1 | 67.2 | 80.0 | 16 / 35 | 5374 |
| 4 | 1 | 65.9 | 77.8 | 13 / 35 | 5018 |
| 5 | 1 | 68.9 | 83.5 | 21 / 35 | 5782 |
| 6 | 1 | 67.9 | 81.6 | 16 / 35 | 5761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 43 | 70% |
| kawigi.micro.Shiz 1.1 | 19 | 89% |
| kawigi.robot.Girl 1.2 | 18 | 83% |
| mld.DustBunny 3.8 | 16 | 88% |
| cb.nano.Insomnia 1.0 | 13 | 92% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 31 | 26% | 67 |
| mld.DustBunny 3.8 | 28 | 24% | 45 |
| kawigi.micro.Shiz 1.1 | 23 | 19% | 44 |
| kawigi.robot.Girl 1.2 | 11 | 9% | 16 |
| cb.nano.Insomnia 1.0 | 11 | 9% | 15 |
| divineomega.TrialBot 0.003 | 8 | 7% | 13 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 5 |
| lambdaxy.TBot 0.1 | 2 | 2% | 5 |

## Melee bench: F16

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.3 | 83 / 210 | 2.86 | 17.4% | 32007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 17.4% | 83 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 69 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.4% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.3% | 28 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.4% | 4 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.3% | 7 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.8% | 4 |
| asd.Cthulhu 1.3 | 8.5 | 5.3% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 5.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.1 | 15 / 35 | 5259 |
| 2 | 1 | 65.8 | 78.1 | 12 / 35 | 5074 |
| 3 | 1 | 67.6 | 81.6 | 16 / 35 | 5348 |
| 4 | 1 | 64.7 | 71.7 | 12 / 35 | 5292 |
| 5 | 1 | 67.9 | 82.5 | 16 / 35 | 5502 |
| 6 | 1 | 67.9 | 83.8 | 12 / 35 | 5532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 57 | 51% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 25 | 96% |
| techdude.forest.FlamingForest 1.1 | 17 | 71% |
| stelo.IntrinsicVolatility 1.4 | 7 | 86% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 70 | 55% | 106 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 13% | 33 |
| bvh.fnr.Fenrir 0.36l | 14 | 11% | 18 |
| techdude.forest.FlamingForest 1.1 | 7 | 6% | 19 |
| stelo.IntrinsicVolatility 1.4 | 7 | 6% | 11 |
| divineomega.DivineBot 1.9.4.5 | 7 | 6% | 10 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 7 |
| asd.Cthulhu 1.3 | 1 | 1% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |

## Melee bench: F17

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.7 | 92 / 210 | 2.83 | 17.3% | 31006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 17.3% | 92 |
| et.Predator 1.8 | 2.7 | 13.3% | 29 |
| cx.BlestPain 1.41 | 3.7 | 12.0% | 34 |
| oog.melee.Mercutio 1.0 | 4.0 | 11.9% | 32 |
| nic.Nicator 2.4 | 4.2 | 11.9% | 13 |
| ahf.NanoAndrew .4 | 5.5 | 10.7% | 10 |
| maribo.melee.BMV 0.1 | 7.0 | 9.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 76.8 | 15 / 35 | 4729 |
| 2 | 1 | 64.7 | 73.3 | 13 / 35 | 4957 |
| 3 | 1 | 69.2 | 87.0 | 18 / 35 | 5723 |
| 4 | 1 | 65.9 | 77.1 | 14 / 35 | 4965 |
| 5 | 1 | 67.7 | 83.2 | 20 / 35 | 5229 |
| 6 | 1 | 66.7 | 80.6 | 12 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 38 | 89% |
| cx.BlestPain 1.41 | 28 | 46% |
| oog.melee.Mercutio 1.0 | 23 | 70% |
| nic.Nicator 2.4 | 21 | 86% |
| ahf.NanoAndrew .4 | 6 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 38 | 32% | 54 |
| oog.melee.Mercutio 1.0 | 20 | 17% | 35 |
| ahf.NanoAndrew .4 | 18 | 15% | 27 |
| et.Predator 1.8 | 17 | 14% | 48 |
| nic.Nicator 2.4 | 16 | 13% | 29 |
| maribo.melee.BMV 0.1 | 8 | 7% | 14 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.4 | 127 / 210 | 2.22 | 18.7% | 29233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 18.7% | 127 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.4% | 27 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.5% | 21 |
| uji.DBH 1.1 | 4.3 | 10.9% | 12 |
| ratosh.Nobo 0.21 | 5.3 | 10.1% | 5 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.3% | 3 |
| sigterm.Sigterm 1.0 | 6.3 | 8.7% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 7.1% | 4 |
| stelo.WangRobot 1.0 | 9.3 | 5.3% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.3 | 21 / 35 | 4755 |
| 2 | 1 | 67.8 | 86.7 | 21 / 35 | 4749 |
| 3 | 1 | 65.5 | 80.6 | 15 / 35 | 4477 |
| 4 | 1 | 67.8 | 85.7 | 22 / 35 | 4730 |
| 5 | 1 | 69.6 | 89.2 | 22 / 35 | 5321 |
| 6 | 1 | 69.6 | 89.8 | 26 / 35 | 5201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 86% |
| agd.Mooserwirt2 2.7 | 27 | 78% |
| uji.DBH 1.1 | 23 | 78% |
| sigterm.Sigterm 1.0 | 15 | 100% |
| ratosh.Nobo 0.21 | 9 | 89% |
| stelo.WangRobot 1.0 | 9 | 100% |
| spinnercat.Robovirus 2.718 | 8 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 83% |

Hadur died in 84 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 33% | 74 |
| uji.DBH 1.1 | 14 | 17% | 30 |
| agd.Mooserwirt2 2.7 | 11 | 13% | 35 |
| ratosh.Nobo 0.21 | 11 | 13% | 19 |
| spinnercat.Robovirus 2.718 | 8 | 10% | 14 |
| sigterm.Sigterm 1.0 | 5 | 6% | 19 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 4 |
| stelo.WangRobot 1.0 | 2 | 2% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 2% | 7 |

## Melee bench: F19

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.3 | 150 / 210 | 1.69 | 20.5% | 35297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 20.5% | 150 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.5% | 25 |
| mld.Infinity 2.2 | 2.8 | 13.5% | 18 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.6% | 6 |
| erdnis.Rover 0.3 | 5.0 | 10.4% | 5 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.6% | 2 |
| mbh.Mbh 0.1 | 7.2 | 7.2% | 0 |
| pac.ABC 2.1 | 7.7 | 6.6% | 3 |
| pbg.R2D2 1.0 | 8.8 | 5.9% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.8 | 22 / 35 | 5798 |
| 2 | 1 | 71.9 | 93.3 | 25 / 35 | 6246 |
| 3 | 1 | 71.0 | 92.4 | 24 / 35 | 5580 |
| 4 | 1 | 71.8 | 94.3 | 28 / 35 | 5860 |
| 5 | 1 | 70.6 | 89.2 | 24 / 35 | 5689 |
| 6 | 1 | 72.3 | 94.9 | 27 / 35 | 6124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 82 | 88% |
| mld.Infinity 2.2 | 51 | 90% |
| krillr.mini.JointStrike 2.0.0 | 19 | 89% |
| erdnis.Rover 0.3 | 7 | 86% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pac.ABC 2.1 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 19 | 32% | 82 |
| mld.Infinity 2.2 | 12 | 20% | 66 |
| krillr.mini.JointStrike 2.0.0 | 12 | 20% | 27 |
| erdnis.Rover 0.3 | 10 | 17% | 14 |
| patson.PatsonTestBot 1.0 | 4 | 7% | 10 |
| pbg.R2D2 1.0 | 2 | 3% | 4 |
| mbh.Mbh 0.1 | 1 | 2% | 5 |
| pac.ABC 2.1 | 0 | 0% | 1 |

## Melee bench: F20

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.9 | 116 / 210 | 2.18 | 19.1% | 33324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 19.1% | 116 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.1% | 63 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.6% | 7 |
| fwb.Nine 1.0.1 | 3.8 | 11.2% | 12 |
| catcat20.Rabbit 0.001 | 4.8 | 9.8% | 9 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.6% | 1 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.1% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 16 / 35 | 5171 |
| 2 | 1 | 68.3 | 85.1 | 17 / 35 | 5406 |
| 3 | 1 | 71.7 | 94.0 | 28 / 35 | 6263 |
| 4 | 1 | 69.5 | 85.7 | 20 / 35 | 5914 |
| 5 | 1 | 66.9 | 81.9 | 14 / 35 | 5184 |
| 6 | 1 | 69.7 | 89.2 | 21 / 35 | 5386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 68 | 57% |
| catcat20.Rabbit 0.001 | 26 | 96% |
| fwb.Nine 1.0.1 | 25 | 92% |
| nz.jdc.nano.GridFu 1.0 | 17 | 100% |
| bayen.nut.Squirrel 1.615 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 57 | 61% | 91 |
| fwb.Nine 1.0.1 | 15 | 16% | 23 |
| nz.jdc.nano.GridFu 1.0 | 9 | 10% | 33 |
| catcat20.Rabbit 0.001 | 5 | 5% | 33 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 11 |
| ntc.ControlledChaos 1.1.4 | 3 | 3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 9 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F21

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.0 | 131 / 210 | 1.81 | 20.3% | 36082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 20.3% | 131 |
| eem.EvBot v4.6.16 | 2.3 | 15.7% | 56 |
| dummy.mini.Scimitar 1.01 | 2.7 | 14.0% | 14 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 8 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.5% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.2% | 3 |
| el.JumpShoot 0.2 | 7.3 | 6.2% | 1 |
| fire219.CatBot 1.0 | 7.5 | 6.5% | 1 |
| PSW.Relentless 0.1 | 9.0 | 4.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.7 | 22 / 35 | 6306 |
| 2 | 1 | 70.6 | 90.8 | 22 / 35 | 5823 |
| 3 | 1 | 70.2 | 88.6 | 19 / 35 | 5930 |
| 4 | 1 | 70.7 | 91.4 | 23 / 35 | 5869 |
| 5 | 1 | 71.3 | 90.5 | 22 / 35 | 6212 |
| 6 | 1 | 71.0 | 93.0 | 23 / 35 | 5942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 94 | 68% |
| dummy.mini.Scimitar 1.01 | 35 | 100% |
| cf.RiO.RiOx 4.2.1 | 22 | 86% |
| eld.Hmm 1.0 | 7 | 100% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1190. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 42 | 52% | 87 |
| dummy.mini.Scimitar 1.01 | 20 | 25% | 63 |
| cf.RiO.RiOx 4.2.1 | 10 | 12% | 29 |
| oa.weak.BotherBot 0.1 | 3 | 4% | 12 |
| eld.Hmm 1.0 | 2 | 2% | 14 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.3 | 90 / 210 | 2.59 | 17.6% | 30994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.5 | 17.6% | 90 |
| pe.SandboxDT 2.71m | 2.2 | 15.9% | 47 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.4% | 43 |
| jlm.javaDisturbance 0.59 | 3.7 | 13.4% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.8% | 9 |
| yk.JahRoslav 1.1 | 6.7 | 6.6% | 1 |
| gg.Squaraus 0.6 | 6.8 | 6.2% | 0 |
| tad.Dalek98 0.98 | 7.8 | 5.8% | 1 |
| pbg.NinjaX 1.2 | 8.7 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.6 | 14 / 35 | 5290 |
| 2 | 2 | 65.5 | 78.1 | 10 / 35 | 4814 |
| 3 | 1 | 69.0 | 85.4 | 18 / 35 | 5387 |
| 4 | 1 | 69.6 | 87.9 | 20 / 35 | 5622 |
| 5 | 1 | 68.9 | 85.7 | 17 / 35 | 5617 |
| 6 | 3 | 64.2 | 75.2 | 11 / 35 | 4264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 42 | 74% |
| jlm.javaDisturbance 0.59 | 32 | 78% |
| pe.SandboxDT 2.71m | 31 | 71% |
| bigpete.Stewie 1.0 | 11 | 73% |
| tad.Dalek98 0.98 | 3 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 43 | 36% | 71 |
| pe.SandboxDT 2.71m | 38 | 31% | 66 |
| jlm.javaDisturbance 0.59 | 21 | 17% | 42 |
| bigpete.Stewie 1.0 | 13 | 11% | 19 |
| tad.Dalek98 0.98 | 2 | 2% | 4 |
| pbg.NinjaX 1.2 | 1 | 1% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.5 | 118 / 210 | 1.86 | 19.5% | 32477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 19.5% | 118 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 56 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.4% | 9 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 8.9% | 5 |
| cw.megas.Blade 0.8 | 6.2 | 8.8% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.6% | 2 |
| sample.Walls 1.0 | 7.7 | 7.9% | 3 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.8 | 19 / 35 | 5207 |
| 2 | 1 | 71.3 | 92.7 | 24 / 35 | 5269 |
| 3 | 1 | 70.7 | 91.7 | 19 / 35 | 5386 |
| 4 | 1 | 69.2 | 88.3 | 17 / 35 | 5510 |
| 5 | 1 | 70.0 | 89.2 | 19 / 35 | 5423 |
| 6 | 1 | 70.7 | 91.1 | 20 / 35 | 5682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 90 | 60% |
| cre.Karolos 0.32 | 33 | 79% |
| stelo.AreaTargetingBot 1.1 | 26 | 85% |
| stelo.RamTrackSurfer 1.2 | 9 | 56% |
| sample.Walls 1.0 | 9 | 89% |
| cw.megas.Blade 0.8 | 2 | 50% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 54 | 59% | 100 |
| cre.Karolos 0.32 | 15 | 16% | 41 |
| stelo.AreaTargetingBot 1.1 | 12 | 13% | 29 |
| stelo.RamTrackSurfer 1.2 | 5 | 5% | 15 |
| sample.Walls 1.0 | 2 | 2% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 2% | 8 |
| cw.megas.Blade 0.8 | 2 | 2% | 7 |

## Melee bench: F24

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 70.6 | 51 / 210 | 3.65 | 14.2% | 22211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.7% | 38 |
| hadur117.mini.DeiseWN 0.2 | 2.2 | 14.2% | 51 |
| florent.XSeries.X2 0.12 | 2.7 | 13.7% | 41 |
| davidalves.Phoenix 0.54 | 3.8 | 13.1% | 40 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.8% | 26 |
| oog.melee.Corsair 1.0 | 6.2 | 8.9% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.1% | 8 |
| lunchie.Lunchbox 0.93 | 8.3 | 6.2% | 2 |
| as.FrankTheTank 1.3 | 8.8 | 5.3% | 0 |
| evd.X1 0.01 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 65.1 | 5 / 35 | 3365 |
| 2 | 1 | 61.9 | 71.1 | 11 / 35 | 3755 |
| 3 | 2 | 62.2 | 72.7 | 7 / 35 | 4050 |
| 4 | 2 | 62.0 | 73.7 | 10 / 35 | 3675 |
| 5 | 2 | 61.1 | 70.8 | 10 / 35 | 3407 |
| 6 | 3 | 62.1 | 70.2 | 8 / 35 | 3959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 19 | 42% |
| rz.GlowBlowMelee 1.4 | 18 | 72% |
| pedersen.Ugluk 1.1.1 | 11 | 55% |
| stelo.SoJNanoMelee 1.1 | 11 | 91% |
| davidalves.Phoenix 0.54 | 11 | 82% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 55 | 35% | 65 |
| rz.GlowBlowMelee 1.4 | 33 | 21% | 52 |
| pedersen.Ugluk 1.1.1 | 30 | 19% | 34 |
| davidalves.Phoenix 0.54 | 17 | 11% | 24 |
| oog.melee.Corsair 1.0 | 13 | 8% | 16 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 8 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 7 |
| as.FrankTheTank 1.3 | 2 | 1% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |

## Melee bench: F25

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.3 | 113 / 210 | 2.68 | 17.5% | 25736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 17.5% | 113 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.6% | 23 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.7% | 23 |
| jdw.Hurricane 1.4 | 4.0 | 11.9% | 28 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 8.9% | 8 |
| ds.Oo 2.2 | 5.8 | 8.6% | 6 |
| awesomeness.Elite 1.0 | 7.3 | 7.4% | 3 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.4% | 5 |
| adt.Ar2 1.1 | 8.5 | 6.8% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.0 | 23 / 35 | 4441 |
| 2 | 1 | 63.2 | 71.7 | 16 / 35 | 3930 |
| 3 | 1 | 67.2 | 83.8 | 18 / 35 | 4391 |
| 4 | 1 | 67.0 | 82.9 | 20 / 35 | 4479 |
| 5 | 1 | 67.1 | 83.8 | 20 / 35 | 4183 |
| 6 | 1 | 65.6 | 79.7 | 16 / 35 | 4312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 43 | 88% |
| voidious.micro.BlitzBat 1.05 | 39 | 92% |
| jdw.Hurricane 1.4 | 25 | 84% |
| gre.svman4.Morfeas 1.4.1 | 8 | 50% |
| ds.Oo 2.2 | 6 | 67% |
| awesomeness.Elite 1.0 | 6 | 83% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 27% | 49 |
| voidious.mini.BrokenSword 2.0.3 | 20 | 21% | 62 |
| jdw.Hurricane 1.4 | 20 | 21% | 38 |
| adt.Ar2 1.1 | 11 | 11% | 13 |
| ds.Oo 2.2 | 8 | 8% | 15 |
| gre.svman4.Morfeas 1.4.1 | 6 | 6% | 10 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 13 |
| awesomeness.Elite 1.0 | 2 | 2% | 7 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |

## Melee bench: F26

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.4 | 106 / 210 | 2.31 | 18.3% | 33260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 18.3% | 106 |
| ak.Fermat 2.0 | 2.0 | 15.0% | 43 |
| lrem.Spectre 0.4.4 | 3.5 | 12.4% | 20 |
| shu.nitro.LENIN .T34 | 3.7 | 11.9% | 24 |
| js.PinBall 1.6 | 5.2 | 11.0% | 9 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.7% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.0% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.0 | 17 / 35 | 5676 |
| 2 | 1 | 69.4 | 86.7 | 20 / 35 | 6076 |
| 3 | 1 | 69.6 | 88.3 | 20 / 35 | 5812 |
| 4 | 1 | 66.5 | 81.9 | 15 / 35 | 4918 |
| 5 | 1 | 68.2 | 85.7 | 17 / 35 | 5194 |
| 6 | 1 | 68.1 | 83.8 | 17 / 35 | 5584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 51 | 73% |
| lrem.Spectre 0.4.4 | 33 | 79% |
| shu.nitro.LENIN .T34 | 25 | 68% |
| js.PinBall 1.6 | 18 | 83% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 86% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 50% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 37 | 35% | 73 |
| shu.nitro.LENIN .T34 | 24 | 23% | 48 |
| lrem.Spectre 0.4.4 | 18 | 17% | 40 |
| js.PinBall 1.6 | 9 | 9% | 19 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 6% | 12 |
| gh.mini.GrubbmOne 1.0 | 5 | 5% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 5% | 8 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.1 | 119 / 210 | 2.43 | 18.7% | 31498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 18.7% | 119 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 11.0% | 13 |
| wee.Gem 1.8.4 | 3.7 | 11.0% | 22 |
| EH.Eagle 1.0.6 | 3.7 | 11.1% | 6 |
| mk.Alpha 0.2.1 | 3.7 | 12.5% | 45 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 9.2% | 3 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.5% | 1 |
| joe.ADinosaur 1.0 | 7.3 | 8.4% | 2 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.9 | 24 / 35 | 5023 |
| 2 | 1 | 68.7 | 88.6 | 23 / 35 | 5046 |
| 3 | 1 | 66.3 | 73.7 | 13 / 35 | 5514 |
| 4 | 1 | 67.8 | 83.5 | 16 / 35 | 5171 |
| 5 | 1 | 68.7 | 78.7 | 20 / 35 | 5891 |
| 6 | 1 | 69.0 | 91.1 | 23 / 35 | 4853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 37 | 59% |
| sheldor.melee.nano.TestMelee 0.1 | 31 | 90% |
| wee.Gem 1.8.4 | 30 | 83% |
| EH.Eagle 1.0.6 | 22 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 100% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 37 | 40% | 58 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 20% | 44 |
| wee.Gem 1.8.4 | 17 | 18% | 46 |
| throxbot.ThroxBot 0.1 | 6 | 7% | 9 |
| EH.Eagle 1.0.6 | 5 | 5% | 28 |
| joe.ADinosaur 1.0 | 4 | 4% | 8 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 4 |
| cs.Grudge 1.0 | 1 | 1% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 12 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.3 | 138 / 210 | 1.96 | 19.2% | 28885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 19.2% | 138 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 32 |
| uji.Antique 1.0 | 3.5 | 11.4% | 19 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.8% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.6% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 7.9% | 1 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.7% | 2 |
| matt.advanced.Katana 1.0 | 8.8 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.0 | 5.7% | 1 |
| stelo.PianistNano 1.2 | 9.2 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 91.4 | 21 / 35 | 4599 |
| 2 | 1 | 68.6 | 86.7 | 21 / 35 | 5179 |
| 3 | 1 | 68.9 | 90.5 | 24 / 35 | 4760 |
| 4 | 1 | 67.9 | 85.4 | 21 / 35 | 4626 |
| 5 | 1 | 70.3 | 94.6 | 25 / 35 | 4918 |
| 6 | 1 | 68.6 | 87.3 | 26 / 35 | 4803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 75 | 79% |
| uji.Antique 1.0 | 44 | 95% |
| qohnil.blot.BlotBot 3.61 | 15 | 73% |
| pfvicm.Sobieski 7.2.3b | 13 | 85% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 30 | 41% | 83 |
| pfvicm.Sobieski 7.2.3b | 11 | 15% | 19 |
| amk.ChumbaWumba 0.3 | 9 | 12% | 14 |
| uji.Antique 1.0 | 8 | 11% | 52 |
| qohnil.blot.BlotBot 3.61 | 8 | 11% | 26 |
| stelo.PianistNano 1.2 | 3 | 4% | 6 |
| ahr.ice.Ice 1.0.2 | 3 | 4% | 6 |
| stelo.Lifestealer 1.0 | 1 | 1% | 1 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |

## Melee bench: F29

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 78.6 | 87 / 210 | 2.92 | 17.4% | 29919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.2 | 17.4% | 87 |
| deewiant.Anomaly 0.2 | 2.3 | 15.3% | 50 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.9% | 55 |
| myl.micro.Troodon 1.10 | 4.3 | 12.0% | 8 |
| jok.PheonixM 0.1.2 | 4.7 | 10.3% | 3 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.0% | 1 |
| DBall.Anarchy 0.1 | 7.2 | 6.8% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.0% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.6% | 2 |
| ap.Frederick 1.1 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 75.6 | 15 / 35 | 4877 |
| 2 | 1 | 66.4 | 78.7 | 13 / 35 | 4977 |
| 3 | 1 | 68.1 | 83.8 | 15 / 35 | 5027 |
| 4 | 1 | 66.1 | 76.2 | 16 / 35 | 4540 |
| 5 | 1 | 69.1 | 84.8 | 16 / 35 | 5472 |
| 6 | 2 | 65.4 | 72.7 | 12 / 35 | 5026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 48 | 75% |
| zyx.mega.YersiniaPestis 3.1 | 37 | 68% |
| myl.micro.Troodon 1.10 | 16 | 94% |
| jok.PheonixM 0.1.2 | 6 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 46 | 37% | 66 |
| deewiant.Anomaly 0.2 | 45 | 37% | 82 |
| jok.PheonixM 0.1.2 | 12 | 10% | 20 |
| myl.micro.Troodon 1.10 | 10 | 8% | 25 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 3 | 2% | 8 |
| ph.melee.ArcherME 0.3 | 3 | 2% | 4 |

## Melee bench: F30

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 66.1 | 35 / 210 | 4.05 | 13.3% | 22413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.7 | 14.3% | 62 |
| darkcanuck.B26354 1.06 | 2.2 | 14.0% | 46 |
| hadur117.mini.DeiseWN 0.2 | 3.2 | 13.3% | 35 |
| oog.melee.Capulet 1.2 | 3.7 | 13.0% | 31 |
| stelo.PastFuture 2.3.2 | 4.3 | 12.7% | 20 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.3% | 6 |
| ntc.Opposite 1.5 | 7.2 | 7.8% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.5% | 8 |
| tripphippy.Alice 1.1 | 8.7 | 6.6% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.0 | 60.3 | 3 / 35 | 3271 |
| 2 | 1 | 60.4 | 69.2 | 9 / 35 | 3663 |
| 3 | 4 | 60.3 | 67.0 | 7 / 35 | 3683 |
| 4 | 2 | 61.0 | 68.6 | 6 / 35 | 4087 |
| 5 | 3 | 60.6 | 67.9 | 5 / 35 | 3863 |
| 6 | 4 | 59.2 | 63.8 | 5 / 35 | 3846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 27 | 37% |
| darkcanuck.B26354 1.06 | 18 | 56% |
| oog.melee.Capulet 1.2 | 9 | 67% |
| stelo.PastFuture 2.3.2 | 5 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 46 | 26% | 54 |
| catcat20.Matcha 0.006 | 42 | 24% | 52 |
| oog.melee.Capulet 1.2 | 25 | 14% | 35 |
| stelo.PastFuture 2.3.2 | 24 | 14% | 28 |
| ntc.Opposite 1.5 | 12 | 7% | 12 |
| tripphippy.Alice 1.1 | 10 | 6% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 5% | 9 |
| intruder.PrairieWolf 2.61 | 6 | 3% | 9 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.5 | 34 / 210 | 3.84 | 13.5% | 21089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 105 |
| gh.mini.Griezel 0.2 | 2.5 | 13.3% | 38 |
| hadur117.mini.DeiseWN 0.2 | 2.7 | 13.5% | 34 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.4% | 9 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.5% | 14 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.0% | 7 |
| fm.mammillarias 1.3 | 7.3 | 6.8% | 0 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.7% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.9% | 1 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 69.8 | 3 / 35 | 3441 |
| 2 | 2 | 61.8 | 71.1 | 10 / 35 | 3829 |
| 3 | 3 | 60.6 | 67.9 | 8 / 35 | 3569 |
| 4 | 3 | 58.5 | 65.7 | 5 / 35 | 3194 |
| 5 | 3 | 61.4 | 71.4 | 6 / 35 | 3678 |
| 6 | 3 | 58.2 | 64.8 | 2 / 35 | 3378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 38 | 39% |
| gh.mini.Griezel 0.2 | 17 | 47% |
| d414.nano.Quantum 1.0.0 | 7 | 71% |
| spinnercat.micro.Tyger 0.1 | 6 | 67% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 177 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 55 | 31% | 69 |
| gh.mini.Griezel 0.2 | 42 | 24% | 53 |
| d414.nano.Quantum 1.0.0 | 28 | 16% | 30 |
| spinnercat.micro.Tyger 0.1 | 24 | 14% | 27 |
| gh.nano.Grofvuil 0.2 | 11 | 6% | 13 |
| fm.mammillarias 1.3 | 7 | 4% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 3% | 5 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.1 | 116 / 210 | 2.25 | 18.2% | 29398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 18.2% | 116 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.5% | 42 |
| apc.botM 3.0 | 3.0 | 12.1% | 18 |
| lxx.ConceptA 0.8 | 3.8 | 10.5% | 7 |
| vjik.UnViolation 1.1 | 5.3 | 9.1% | 8 |
| bayen.UbaMicro 1.4 | 5.7 | 9.1% | 5 |
| panzer.Panzer 0.2 | 7.2 | 8.0% | 4 |
| yk.JahMicro 1.0 | 8.5 | 6.8% | 5 |
| conscience.Electron 1.3g | 8.8 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 86.0 | 18 / 35 | 4864 |
| 2 | 1 | 68.2 | 88.6 | 18 / 35 | 5047 |
| 3 | 1 | 68.8 | 92.1 | 23 / 35 | 4774 |
| 4 | 1 | 65.7 | 80.3 | 16 / 35 | 4653 |
| 5 | 1 | 66.6 | 82.5 | 19 / 35 | 5030 |
| 6 | 1 | 68.0 | 87.0 | 22 / 35 | 5030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 65 | 69% |
| apc.botM 3.0 | 28 | 86% |
| lxx.ConceptA 0.8 | 19 | 74% |
| panzer.Panzer 0.2 | 8 | 75% |
| donjezza.Jezza 1.0 | 8 | 88% |
| vjik.UnViolation 1.1 | 7 | 86% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 37 | 39% | 90 |
| apc.botM 3.0 | 18 | 19% | 43 |
| lxx.ConceptA 0.8 | 16 | 17% | 30 |
| vjik.UnViolation 1.1 | 8 | 9% | 18 |
| panzer.Panzer 0.2 | 8 | 9% | 8 |
| donjezza.Jezza 1.0 | 3 | 3% | 5 |
| bayen.UbaMicro 1.4 | 2 | 2% | 10 |
| conscience.Electron 1.3g | 2 | 2% | 4 |
| yk.JahMicro 1.0 | 0 | 0% | 1 |

## Melee bench: F33

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.6 | 119 / 210 | 2.12 | 19.2% | 31765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 19.2% | 119 |
| maribo.Quester 0.3 | 2.0 | 15.1% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.5% | 22 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.7% | 12 |
| labg.Cataclysm 2.05 | 5.2 | 10.3% | 11 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.7 | 9.2% | 10 |
| baal.nano.N 1.42 | 6.8 | 8.1% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 5.5% | 0 |
| sanja.First 0.1 | 9.2 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.3 | 21 / 35 | 5622 |
| 2 | 1 | 66.3 | 78.7 | 15 / 35 | 4969 |
| 3 | 1 | 69.5 | 89.8 | 20 / 35 | 5102 |
| 4 | 1 | 68.2 | 86.0 | 17 / 35 | 5056 |
| 5 | 1 | 69.8 | 90.5 | 21 / 35 | 5484 |
| 6 | 1 | 71.0 | 92.1 | 25 / 35 | 5532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 49 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 77% |
| gre.svman4.Leonidas 1.3.2 | 35 | 94% |
| labg.Cataclysm 2.05 | 12 | 75% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 70% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 37% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 22% | 51 |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 13% | 14 |
| gre.svman4.Leonidas 1.3.2 | 11 | 12% | 33 |
| labg.Cataclysm 2.05 | 8 | 9% | 21 |
| zyx.micro.Ant 1.1 | 4 | 4% | 5 |
| baal.nano.N 1.42 | 2 | 2% | 6 |
| sanja.First 0.1 | 1 | 1% | 5 |

## Melee bench: F34

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.3 | 72 / 210 | 2.50 | 17.2% | 29947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.3 | 17.2% | 72 |
| stelo.Spread 0.9 | 2.2 | 16.4% | 70 |
| kid.Gladiator .7.2 | 2.5 | 16.0% | 42 |
| jcs.Seth 1.8 | 4.5 | 11.1% | 19 |
| tcf.Reach 3 | 4.7 | 11.2% | 8 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 79.0 | 10 / 35 | 4681 |
| 2 | 1 | 67.9 | 86.3 | 12 / 35 | 5108 |
| 3 | 1 | 67.8 | 83.5 | 13 / 35 | 5228 |
| 4 | 2 | 67.0 | 81.9 | 11 / 35 | 5165 |
| 5 | 1 | 68.2 | 85.7 | 15 / 35 | 4999 |
| 6 | 1 | 67.0 | 83.2 | 11 / 35 | 4766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 55 | 49% |
| kid.Gladiator .7.2 | 43 | 60% |
| jcs.Seth 1.8 | 13 | 85% |
| tcf.Reach 3 | 7 | 57% |
| amk.Punbot.Punbot 0.01 | 3 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 40% | 85 |
| kid.Gladiator .7.2 | 50 | 36% | 73 |
| tcf.Reach 3 | 15 | 11% | 20 |
| jcs.Seth 1.8 | 13 | 9% | 25 |
| cli.Dancer 1.1 | 3 | 2% | 4 |
| ratosh.Wesco 1.4 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 73.8 | 24 / 210 | 3.36 | 14.2% | 22277 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.2% | 155 |
| hadur117.mini.DeiseWN 0.2 | 2.3 | 14.2% | 24 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.2% | 20 |
| rz.HawkOnFire 0.1 | 4.2 | 11.6% | 1 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.4% | 10 |
| wit.Chuliath 1.0 | 6.5 | 7.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 6.3% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 80.0 | 6 / 35 | 3983 |
| 2 | 2 | 63.1 | 77.5 | 3 / 35 | 4003 |
| 3 | 4 | 58.9 | 67.0 | 0 / 35 | 3314 |
| 4 | 2 | 62.2 | 72.7 | 6 / 35 | 3591 |
| 5 | 2 | 60.7 | 70.8 | 4 / 35 | 3439 |
| 6 | 2 | 63.1 | 74.9 | 5 / 35 | 3947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 74 | 16% |
| gh.mini.Gruwel 0.9 | 7 | 57% |
| rz.HawkOnFire 0.1 | 5 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 75% |

Hadur died in 186 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 96 | 52% | 106 |
| gh.mini.Gruwel 0.9 | 32 | 17% | 39 |
| rz.HawkOnFire 0.1 | 22 | 12% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 11% | 23 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 4% | 7 |
| myl.nano.KomoriNinja 1.1 | 6 | 3% | 7 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.3 | 146 / 210 | 1.96 | 20.2% | 33667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 20.2% | 146 |
| alpha.RainingFire 1.0 | 2.7 | 12.6% | 16 |
| bzdp.Pansy 2.1 | 3.2 | 11.7% | 16 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 9 |
| mz.Cork 0.1 | 5.0 | 10.2% | 9 |
| m3thos.Eva02 0.7.1 | 5.5 | 9.8% | 7 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.0% | 5 |
| dl.BetterWalls 1.0 | 8.3 | 5.9% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.2 | 26 / 35 | 5722 |
| 2 | 1 | 69.7 | 88.6 | 25 / 35 | 5388 |
| 3 | 1 | 71.3 | 94.3 | 28 / 35 | 5581 |
| 4 | 1 | 70.4 | 88.6 | 25 / 35 | 5568 |
| 5 | 1 | 69.7 | 89.5 | 22 / 35 | 5434 |
| 6 | 1 | 69.7 | 85.7 | 20 / 35 | 5974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 38 | 95% |
| bvh.micro.Freya 0.3 | 33 | 85% |
| alpha.RainingFire 1.0 | 26 | 88% |
| mz.Cork 0.1 | 24 | 88% |
| bvh.mini.Fenrir 0.39 | 15 | 93% |
| m3thos.Eva02 0.7.1 | 12 | 92% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| dl.BetterWalls 1.0 | 5 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 13 | 20% | 40 |
| bzdp.Pansy 2.1 | 11 | 17% | 49 |
| mz.Cork 0.1 | 11 | 17% | 31 |
| bvh.mini.Fenrir 0.39 | 11 | 17% | 18 |
| bvh.micro.Freya 0.3 | 10 | 16% | 35 |
| m3thos.Eva02 0.7.1 | 4 | 6% | 21 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| dl.BetterWalls 1.0 | 0 | 0% | 6 |

## Melee bench: F37

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 92.3 | 172 / 210 | 1.69 | 20.3% | 35397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 20.3% | 172 |
| germ.TheMind .2 | 2.7 | 10.2% | 7 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 9.8% | 4 |
| EBBU.Sim2 1.02 | 4.8 | 9.2% | 5 |
| stelo.UntouchableNano 1.3 | 5.0 | 9.2% | 10 |
| agrach.Dalek 1.0 | 6.2 | 8.7% | 3 |
| lmk.ACPFinal 0.1 | 7.0 | 8.5% | 3 |
| mb.Beast 0.1 | 7.2 | 8.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.3 | 8.3% | 0 |
| skm.Ryubot 1.0 | 9.7 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 94.3 | 30 / 35 | 5835 |
| 2 | 1 | 69.4 | 89.8 | 27 / 35 | 6200 |
| 3 | 1 | 70.1 | 92.7 | 28 / 35 | 6165 |
| 4 | 1 | 69.6 | 90.5 | 27 / 35 | 6168 |
| 5 | 1 | 69.6 | 92.7 | 29 / 35 | 5742 |
| 6 | 1 | 69.8 | 94.0 | 31 / 35 | 5287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 40 | 95% |
| stelo.UntouchableNano 1.3 | 27 | 89% |
| agrach.Dalek 1.0 | 26 | 100% |
| mb.Beast 0.1 | 23 | 100% |
| EBBU.Sim2 1.02 | 20 | 95% |
| skm.Ryubot 1.0 | 18 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 89% |
| lmk.ACPFinal 0.1 | 9 | 78% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 7 | 18% | 35 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 15% | 25 |
| lmk.ACPFinal 0.1 | 6 | 15% | 24 |
| stelo.UntouchableNano 1.3 | 5 | 13% | 27 |
| EBBU.Sim2 1.02 | 5 | 13% | 25 |
| germ.TheMind .2 | 4 | 10% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 8% | 11 |
| mb.Beast 0.1 | 2 | 5% | 18 |
| skm.Ryubot 1.0 | 1 | 3% | 8 |

## Melee bench: F38

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 75.5 | 63 / 210 | 3.20 | 15.4% | 25098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 16.3% | 88 |
| hadur117.mini.DeiseWN 0.2 | 1.5 | 15.4% | 63 |
| bvh.mini.Freya 0.55 | 3.0 | 12.8% | 13 |
| bts.mega.Gnarly 1.4 | 4.8 | 11.2% | 21 |
| cs.Wren 1.0 | 5.2 | 10.9% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.5% | 11 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.8% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.9% | 2 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.4% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 75.9 | 7 / 35 | 4229 |
| 2 | 2 | 62.6 | 72.7 | 11 / 35 | 3830 |
| 3 | 1 | 63.9 | 74.6 | 14 / 35 | 4253 |
| 4 | 1 | 66.6 | 82.9 | 14 / 35 | 4558 |
| 5 | 1 | 65.0 | 81.0 | 12 / 35 | 4310 |
| 6 | 2 | 60.3 | 66.0 | 5 / 35 | 3918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 31 | 39% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 80% |
| cs.Wren 1.0 | 13 | 100% |
| bvh.mini.Freya 0.55 | 13 | 85% |
| bts.mega.Gnarly 1.4 | 12 | 83% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 49 | 33% | 64 |
| bvh.mini.Freya 0.55 | 30 | 20% | 38 |
| bts.mega.Gnarly 1.4 | 18 | 12% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 11% | 29 |
| cs.Wren 1.0 | 15 | 10% | 21 |
| kdf.KoulDestroyer 1.0 | 12 | 8% | 13 |
| matt.UnderDark3 2.4.34 | 4 | 3% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.3 | 78 / 210 | 2.87 | 16.6% | 28691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.3 | 16.6% | 78 |
| bvh.fry.Freya 0.82 | 1.7 | 15.8% | 33 |
| az.Ololobot 0.2.4 | 3.2 | 12.8% | 52 |
| catcat20.Lambda 0.024 | 3.8 | 11.3% | 27 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.2% | 14 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.1% | 3 |
| gimp.GimpBot 0.1 | 6.7 | 8.1% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.8% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 79.0 | 15 / 35 | 4582 |
| 2 | 1 | 66.2 | 81.9 | 14 / 35 | 5003 |
| 3 | 1 | 65.2 | 79.4 | 15 / 35 | 4641 |
| 4 | 1 | 66.2 | 82.5 | 12 / 35 | 5022 |
| 5 | 1 | 65.9 | 80.6 | 12 / 35 | 5024 |
| 6 | 2 | 62.7 | 72.1 | 10 / 35 | 4419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 40 | 83% |
| az.Ololobot 0.2.4 | 28 | 32% |
| catcat20.Lambda 0.024 | 27 | 74% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 90% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 49 | 37% | 81 |
| az.Ololobot 0.2.4 | 35 | 27% | 48 |
| catcat20.Lambda 0.024 | 19 | 14% | 39 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 10% | 17 |
| apollokidd.ApolloKidd 0.9 | 6 | 5% | 7 |
| gimp.GimpBot 0.1 | 5 | 4% | 9 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.7 | 111 / 210 | 2.38 | 18.5% | 30673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 18.5% | 111 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 43 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.3% | 28 |
| mz.AntiGrav 1.0 | 4.3 | 10.8% | 9 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.5% | 8 |
| alpha.BlackIce 1.0 | 6.0 | 9.1% | 6 |
| stelo.Randomness 1.0 | 6.8 | 8.2% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.1% | 1 |
| sample.Corners 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.4 | 20 / 35 | 5350 |
| 2 | 1 | 67.9 | 84.1 | 18 / 35 | 4945 |
| 3 | 1 | 67.1 | 84.1 | 17 / 35 | 4666 |
| 4 | 1 | 69.1 | 85.7 | 21 / 35 | 5489 |
| 5 | 1 | 66.6 | 79.4 | 14 / 35 | 5182 |
| 6 | 1 | 69.3 | 89.5 | 21 / 35 | 5041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 73% |
| kano.gamma.KanoGamma 1.8 | 24 | 71% |
| mz.AntiGrav 1.0 | 20 | 100% |
| stelo.Randomness 1.0 | 15 | 93% |
| Polkwane.SmashMelee 1.0 | 15 | 100% |
| alpha.BlackIce 1.0 | 3 | 33% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 39 | 39% | 76 |
| kano.gamma.KanoGamma 1.8 | 18 | 18% | 37 |
| mz.AntiGrav 1.0 | 15 | 15% | 33 |
| Polkwane.SmashMelee 1.0 | 10 | 10% | 22 |
| alpha.BlackIce 1.0 | 8 | 8% | 14 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 6 |
| stelo.Randomness 1.0 | 3 | 3% | 17 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.0 | 84 / 210 | 2.62 | 17.2% | 28264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.2 | 17.2% | 84 |
| eem.EvBotNG v12.8 | 1.8 | 16.0% | 80 |
| ary.Swarm 1.1 | 3.2 | 13.3% | 21 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 11.9% | 12 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.9% | 8 |
| shrub.Silver v048 | 6.2 | 8.8% | 0 |
| zyx.nano.Ant 1.1 | 7.2 | 7.2% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.2% | 3 |
| stelo.Mirror 1.1 | 8.7 | 6.1% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.8 | 13 / 35 | 4991 |
| 2 | 1 | 65.6 | 77.1 | 13 / 35 | 4644 |
| 3 | 1 | 68.1 | 85.4 | 18 / 35 | 4706 |
| 4 | 1 | 66.5 | 79.0 | 14 / 35 | 4806 |
| 5 | 2 | 66.0 | 80.3 | 12 / 35 | 4618 |
| 6 | 1 | 66.9 | 85.4 | 14 / 35 | 4499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 63 | 44% |
| ary.Swarm 1.1 | 18 | 94% |
| simonton.nano.MeleeSeed 1.8 | 16 | 94% |
| lessonz.robocode.Oz 0.5.0 | 16 | 88% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| stelo.Mirror 1.1 | 3 | 100% |
| shrub.Silver v048 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 60 | 48% | 91 |
| ary.Swarm 1.1 | 26 | 21% | 38 |
| lessonz.robocode.Oz 0.5.0 | 15 | 12% | 24 |
| simonton.nano.MeleeSeed 1.8 | 13 | 10% | 32 |
| shrub.Silver v048 | 4 | 3% | 7 |
| zyx.nano.Ant 1.1 | 4 | 3% | 4 |
| jsal.Jsalbot 1.0 | 2 | 2% | 8 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |

## Melee bench: F42

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.4 | 103 / 210 | 2.31 | 18.5% | 33924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 18.5% | 103 |
| wompi.Wallaby 5.1 | 2.0 | 15.5% | 47 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.6% | 23 |
| ara.Shera 0.88 | 3.8 | 13.2% | 30 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 3 |
| maribo.IotaCT 1.1 | 6.7 | 7.0% | 0 |
| dsw.StaticD 1.0 | 6.8 | 7.1% | 4 |
| stelo.MirrorMicro 1.0 | 7.8 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 17 / 35 | 5731 |
| 2 | 1 | 67.7 | 84.1 | 16 / 35 | 5398 |
| 3 | 1 | 68.8 | 86.3 | 18 / 35 | 5677 |
| 4 | 1 | 68.8 | 87.3 | 17 / 35 | 5597 |
| 5 | 1 | 68.1 | 83.5 | 17 / 35 | 5589 |
| 6 | 1 | 68.5 | 84.8 | 18 / 35 | 5932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 56 | 86% |
| maribo.mini.MiniQuester 0.1 | 32 | 84% |
| ara.Shera 0.88 | 29 | 55% |
| dsw.StaticD 1.0 | 6 | 83% |
| amz.NanoClone 1.41 | 4 | 75% |
| maribo.IotaCT 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 39% | 91 |
| ara.Shera 0.88 | 29 | 27% | 46 |
| maribo.mini.MiniQuester 0.1 | 24 | 22% | 47 |
| amz.NanoClone 1.41 | 7 | 7% | 10 |
| dsw.StaticD 1.0 | 3 | 3% | 9 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 3 |
| maribo.IotaCT 1.1 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 71.9 | 19 / 210 | 3.53 | 14.0% | 22460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.9% | 167 |
| hadur117.mini.DeiseWN 0.2 | 2.2 | 14.0% | 19 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.6% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 4.2 | 11.4% | 5 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.1% | 0 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.5% | 2 |
| jab.DiamondStealer 5 | 7.2 | 7.8% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 75.2 | 2 / 35 | 3851 |
| 2 | 3 | 61.5 | 67.0 | 5 / 35 | 3696 |
| 3 | 2 | 61.5 | 66.7 | 3 / 35 | 3639 |
| 4 | 2 | 63.8 | 77.5 | 1 / 35 | 3734 |
| 5 | 2 | 64.2 | 74.0 | 6 / 35 | 3797 |
| 6 | 2 | 62.6 | 71.1 | 2 / 35 | 3743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 70 | 17% |
| brainfade.melee.Dusk 0.44 | 9 | 56% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 104 | 54% | 112 |
| brainfade.melee.Dusk 0.44 | 27 | 14% | 33 |
| wcsv.melee.EngineerMelee 0.1 | 26 | 14% | 27 |
| dummy.micro.Sparrow 2.5 | 19 | 10% | 21 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 8 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.7 | 118 / 210 | 2.20 | 19.2% | 33331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.2 | 19.2% | 118 |
| stelo.Liblix 0.3.1 | 1.8 | 15.9% | 58 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.7% | 27 |
| wompi.Quokka 1.6 | 4.5 | 9.7% | 2 |
| jwirde.Gort 2.0 | 5.5 | 8.9% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.1% | 2 |
| disan.Chair 2.2.0 | 6.5 | 8.0% | 2 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.3 | 15 / 35 | 5237 |
| 2 | 1 | 69.9 | 89.5 | 18 / 35 | 5705 |
| 3 | 1 | 72.0 | 95.2 | 30 / 35 | 5883 |
| 4 | 1 | 69.9 | 87.9 | 17 / 35 | 5829 |
| 5 | 1 | 69.8 | 87.6 | 24 / 35 | 5559 |
| 6 | 2 | 66.3 | 78.4 | 14 / 35 | 5118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 70% |
| tzu.TheArtOfWar 1.2 | 47 | 74% |
| wompi.Quokka 1.6 | 10 | 100% |
| jwirde.Gort 2.0 | 7 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 44 | 47% | 100 |
| tzu.TheArtOfWar 1.2 | 27 | 29% | 60 |
| wompi.Quokka 1.6 | 6 | 6% | 14 |
| jwirde.Gort 2.0 | 4 | 4% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 4% | 10 |
| stf.PanzerGeneral 0.1 | 4 | 4% | 5 |
| disan.Chair 2.2.0 | 3 | 3% | 8 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.1 | 122 / 210 | 2.07 | 20.6% | 38612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWN 0.2 | 1.0 | 20.6% | 122 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.3% | 71 |
| jje.BagPuss 1.2 | 3.0 | 11.7% | 4 |
| myl.nano.Graviton 1.10 | 4.3 | 10.3% | 3 |
| sul.Lunar 1.1 | 4.3 | 10.4% | 6 |
| hvilela.HVilela 0.9 | 6.5 | 8.6% | 0 |
| fm.claire 1.7 | 7.0 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.7% | 3 |
| wit.Deep7 2.0 | 9.0 | 5.5% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 90.5 | 24 / 35 | 6383 |
| 2 | 1 | 70.9 | 88.3 | 21 / 35 | 6633 |
| 3 | 1 | 70.6 | 87.6 | 21 / 35 | 6304 |
| 4 | 1 | 69.7 | 86.7 | 17 / 35 | 6406 |
| 5 | 1 | 71.1 | 88.9 | 20 / 35 | 6560 |
| 6 | 1 | 70.0 | 86.7 | 19 / 35 | 6326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 66% |
| myl.nano.Graviton 1.10 | 19 | 95% |
| jje.BagPuss 1.2 | 15 | 100% |
| sul.Lunar 1.1 | 12 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 34 | 38% | 0 |
| jje.BagPuss 1.2 | 15 | 17% | 54 |
| pez.mini.ChironexFleckeri 0.5 | 12 | 13% | 30 |
| myl.nano.Graviton 1.10 | 11 | 12% | 37 |
| sul.Lunar 1.1 | 7 | 8% | 55 |
| hvilela.HVilela 0.9 | 5 | 6% | 15 |
| fm.claire 1.7 | 5 | 6% | 12 |
| wit.Deep7 2.0 | 0 | 0% | 5 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

hadur117.mini.DeiseWN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.5 | 54 / 210 | 2.84 | 15.9% | 26674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.2% | 95 |
| kc.mini.Mirage 0.2 | 2.0 | 16.3% | 47 |
| hadur117.mini.DeiseWN 0.2 | 2.3 | 15.9% | 54 |
| cx.Princess 1.0 | 4.5 | 10.3% | 7 |
| mz.MicroSheep 1.0 | 4.8 | 10.5% | 4 |
| sadoner.killer 0.2 | 5.7 | 9.5% | 3 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 78.7 | 10 / 35 | 4253 |
| 2 | 3 | 63.1 | 75.6 | 6 / 35 | 3901 |
| 3 | 2 | 65.7 | 79.0 | 9 / 35 | 4767 |
| 4 | 3 | 63.5 | 76.5 | 5 / 35 | 4225 |
| 5 | 1 | 67.7 | 84.8 | 13 / 35 | 4988 |
| 6 | 2 | 66.2 | 82.5 | 11 / 35 | 4540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 41 | 12% |
| kc.mini.Mirage 0.2 | 39 | 74% |
| mz.MicroSheep 1.0 | 13 | 85% |
| cx.Princess 1.0 | 8 | 75% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 65 | 42% | 70 |
| kc.mini.Mirage 0.2 | 56 | 36% | 86 |
| mz.MicroSheep 1.0 | 12 | 8% | 21 |
| cx.Princess 1.0 | 9 | 6% | 13 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 8 |
| sadoner.killer 0.2 | 4 | 3% | 9 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

