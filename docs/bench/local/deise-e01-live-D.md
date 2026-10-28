# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 81.0 | 34 / 210 | 2.71 | 15.9% | 28699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 137 |
| hadur117.mini.DeiseD 0.2 | 2.0 | 15.9% | 34 |
| sgp.JollyNinja 3.53 | 3.2 | 12.3% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.3% | 5 |
| mz.MicroGodMelee 1 | 4.8 | 10.5% | 10 |
| lorneswork.Predator 1.0 | 5.8 | 9.2% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.7% | 1 |
| skm.butterfly 1.0 | 8.7 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 80.3 | 5 / 35 | 4803 |
| 2 | 2 | 65.3 | 80.3 | 6 / 35 | 4744 |
| 3 | 2 | 65.0 | 81.9 | 6 / 35 | 4553 |
| 4 | 2 | 65.4 | 81.9 | 8 / 35 | 4567 |
| 5 | 2 | 65.1 | 81.0 | 3 / 35 | 5056 |
| 6 | 2 | 65.0 | 80.3 | 6 / 35 | 4976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 94 | 11% |
| mz.MicroGodMelee 1 | 16 | 50% |
| sgp.JollyNinja 3.53 | 14 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |
| lorneswork.Predator 1.0 | 4 | 75% |
| skm.butterfly 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |

Hadur died in 176 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 102 | 58% | 113 |
| sgp.JollyNinja 3.53 | 24 | 14% | 32 |
| mz.MicroGodMelee 1 | 18 | 10% | 23 |
| lorneswork.Predator 1.0 | 10 | 6% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 13 |
| adt.Ar2 1.0 | 6 | 3% | 7 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 3% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.9 | 84 / 210 | 2.90 | 17.1% | 29802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.1% | 84 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 13.1% | 34 |
| pulsar.PulsarMax 0.8.9 | 3.2 | 12.3% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 11.3% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.8% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.6% | 3 |
| sch.Simone 0.3d | 7.2 | 8.2% | 17 |
| Noran.BitchingElk 0.054 | 7.3 | 7.6% | 12 |
| stelo.PatternRobot 1.0 | 8.7 | 6.7% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 75.2 | 15 / 35 | 4601 |
| 2 | 1 | 62.8 | 73.7 | 11 / 35 | 4316 |
| 3 | 1 | 65.3 | 76.5 | 10 / 35 | 5313 |
| 4 | 1 | 68.5 | 86.7 | 16 / 35 | 5494 |
| 5 | 1 | 65.9 | 77.5 | 16 / 35 | 5285 |
| 6 | 1 | 66.5 | 84.1 | 16 / 35 | 4793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 31 | 68% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 30 | 73% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 46% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| sch.Simone 0.3d | 11 | 64% |
| stelo.PatternRobot 1.0 | 9 | 89% |
| Noran.BitchingElk 0.054 | 8 | 50% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 32 | 25% | 61 |
| pulsar.PulsarMax 0.8.9 | 29 | 23% | 50 |
| stelo.PatternRobot 1.0 | 15 | 12% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 11% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 10% | 20 |
| Noran.BitchingElk 0.054 | 9 | 7% | 16 |
| sch.Simone 0.3d | 7 | 6% | 16 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 8 |
| fullsail.SweetTea 1.1 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.3 | 127 / 210 | 2.06 | 18.7% | 32816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.7% | 127 |
| radnor.DoctorBob 1.42 | 2.5 | 14.4% | 28 |
| kawigi.nano.Lib 1.0 | 2.7 | 14.0% | 28 |
| vuen.Cake 2.51 | 3.8 | 12.1% | 23 |
| urdos.URDOS 1.3 | 5.0 | 9.7% | 3 |
| adt.Ar1 2.1 | 6.3 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.0% | 1 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 6.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.3 | 16 / 35 | 5651 |
| 2 | 1 | 69.1 | 91.1 | 22 / 35 | 5600 |
| 3 | 1 | 69.7 | 93.7 | 24 / 35 | 5176 |
| 4 | 1 | 66.8 | 82.5 | 20 / 35 | 5057 |
| 5 | 1 | 70.2 | 93.7 | 25 / 35 | 5819 |
| 6 | 1 | 68.6 | 88.3 | 20 / 35 | 5513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 50 | 90% |
| vuen.Cake 2.51 | 43 | 84% |
| radnor.DoctorBob 1.42 | 42 | 86% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 4 | 75% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 44% | 84 |
| radnor.DoctorBob 1.42 | 21 | 25% | 55 |
| vuen.Cake 2.51 | 12 | 14% | 44 |
| urdos.URDOS 1.3 | 6 | 7% | 11 |
| oa.weak.FlyMk1 0.1 | 3 | 4% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 4% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 1 |
| adt.Ar1 2.1 | 1 | 1% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 70.7 | 5 / 210 | 3.63 | 14.2% | 29131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.7% | 192 |
| hadur117.mini.DeiseD 0.2 | 2.2 | 14.2% | 5 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.1% | 7 |
| TNT.TNT 0.99.1 | 4.2 | 11.3% | 5 |
| josago.Jorgito 0.16 | 4.8 | 9.6% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 7.0% | 0 |
| css.Delitioner 0.11 | 7.2 | 6.3% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.2 | 4.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 75.2 | 1 / 35 | 5211 |
| 2 | 3 | 60.8 | 64.8 | 0 / 35 | 4428 |
| 3 | 2 | 64.7 | 74.0 | 1 / 35 | 5176 |
| 4 | 2 | 62.6 | 69.2 | 3 / 35 | 4797 |
| 5 | 2 | 62.7 | 70.8 | 0 / 35 | 4803 |
| 6 | 2 | 62.9 | 70.5 | 0 / 35 | 4716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 53 | 2% |
| apc.LeeroyJenkins2 1.0 | 4 | 50% |
| TNT.TNT 0.99.1 | 3 | 33% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 205 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 169 | 82% | 169 |
| apc.LeeroyJenkins2 1.0 | 16 | 8% | 18 |
| josago.Jorgito 0.16 | 6 | 3% | 6 |
| TNT.TNT 0.99.1 | 5 | 2% | 6 |
| rampancy.Durandal 2.1d | 4 | 2% | 4 |
| css.Delitioner 0.11 | 3 | 1% | 4 |
| tj.zombie1n 1.0.1 | 2 | 1% | 3 |

## Melee bench: F05

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 63.7 | 14 / 210 | 4.27 | 12.0% | 19346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.7% | 114 |
| justin.DemonicRage 3.4 | 1.7 | 17.1% | 60 |
| wompi.Numbat 2.1 | 3.2 | 13.2% | 16 |
| hadur117.mini.DeiseD 0.2 | 3.8 | 12.0% | 14 |
| ms.Ares 0.19 | 5.3 | 9.2% | 2 |
| axeBots.HataMoto 3.09 | 5.7 | 9.1% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 66.7 | 4 / 35 | 3169 |
| 2 | 4 | 57.5 | 63.5 | 2 / 35 | 3154 |
| 3 | 4 | 55.8 | 59.7 | 1 / 35 | 2950 |
| 4 | 4 | 56.7 | 60.3 | 2 / 35 | 3048 |
| 5 | 4 | 60.2 | 68.3 | 3 / 35 | 3546 |
| 6 | 4 | 58.2 | 63.5 | 2 / 35 | 3479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 15 | 20% |
| justin.DemonicRage 3.4 | 14 | 29% |
| wompi.Numbat 2.1 | 6 | 33% |
| ms.Ares 0.19 | 2 | 100% |
| supersample.SuperBoxBot 1.0 | 2 | 100% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 196 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 89 | 45% | 92 |
| justin.DemonicRage 3.4 | 53 | 27% | 58 |
| wompi.Numbat 2.1 | 31 | 16% | 33 |
| ms.Ares 0.19 | 7 | 4% | 9 |
| supersample.SuperBoxBot 1.0 | 7 | 4% | 8 |
| axeBots.HataMoto 3.09 | 6 | 3% | 7 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.2 | 127 / 210 | 1.88 | 19.0% | 28276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.0% | 127 |
| jekl.StoneGhost 0.7 | 2.0 | 14.9% | 30 |
| origin.SleepSiphon 1.7b | 3.3 | 12.0% | 26 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.6% | 15 |
| mld.Wisdom 1.0 | 4.3 | 10.8% | 4 |
| gg.Wolverine 2.0 | 6.0 | 8.8% | 5 |
| spinnercat.Omen 1.0 | 7.7 | 6.8% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.6% | 3 |
| DBall.NUKE 0.1 | 8.5 | 6.3% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.8 | 24 / 35 | 4386 |
| 2 | 1 | 67.9 | 84.8 | 18 / 35 | 4727 |
| 3 | 1 | 69.7 | 93.3 | 26 / 35 | 4707 |
| 4 | 1 | 69.0 | 91.1 | 19 / 35 | 4885 |
| 5 | 1 | 68.5 | 89.2 | 19 / 35 | 4704 |
| 6 | 1 | 69.5 | 92.1 | 21 / 35 | 4867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 63 | 84% |
| origin.SleepSiphon 1.7b | 32 | 75% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 71% |
| mld.Wisdom 1.0 | 11 | 91% |
| gg.Wolverine 2.0 | 10 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 29 | 35% | 74 |
| origin.SleepSiphon 1.7b | 20 | 24% | 48 |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 19% | 34 |
| mld.Wisdom 1.0 | 8 | 10% | 20 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 12 |
| gg.Wolverine 2.0 | 4 | 5% | 10 |
| sample.Fire 1.0 | 2 | 2% | 2 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
| DBall.NUKE 0.1 | 0 | 0% | 6 |

## Melee bench: F07

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.5 | 64 / 210 | 2.67 | 16.8% | 30664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 17.9% | 66 |
| rtk.Tachikoma 1.0 | 2.0 | 17.1% | 54 |
| hadur117.mini.DeiseD 0.2 | 2.5 | 16.8% | 64 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.2% | 7 |
| franzor.Lizt 1.3.1 | 4.7 | 10.9% | 19 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| sample.Target 1.0 | 9.0 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.4 | 78.1 | 11 / 35 | 5012 |
| 2 | 3 | 66.3 | 81.0 | 9 / 35 | 4800 |
| 3 | 3 | 66.6 | 79.7 | 10 / 35 | 4726 |
| 4 | 2 | 67.7 | 81.3 | 11 / 35 | 5413 |
| 5 | 3 | 66.9 | 82.5 | 8 / 35 | 4680 |
| 6 | 1 | 69.8 | 86.3 | 15 / 35 | 6033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 48 | 63% |
| rsalesc.melee.Monk 0.3.6c | 30 | 17% |
| oog.melee.CapuletDroid 1.1 | 19 | 100% |
| franzor.Lizt 1.3.1 | 6 | 100% |
| skm.PateranBotlock2 1.0 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 64 | 44% | 71 |
| rtk.Tachikoma 1.0 | 58 | 40% | 95 |
| oog.melee.CapuletDroid 1.1 | 17 | 12% | 35 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 3 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 3 |
| franzor.Lizt 1.3.1 | 2 | 1% | 2 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 1 |

## Melee bench: F08

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.1 | 113 / 210 | 2.25 | 18.8% | 31341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.8% | 113 |
| tm.Yuugao 1.0 | 2.0 | 13.4% | 39 |
| shrub.Vapour v159 | 3.2 | 11.8% | 22 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.2% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.7% | 10 |
| m3thos.Eva00 1.1 | 5.7 | 9.2% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.2% | 12 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.9% | 0 |
| SHAM.WOW 1.4 | 9.0 | 6.1% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.6 | 18 / 35 | 5409 |
| 2 | 1 | 69.2 | 91.1 | 21 / 35 | 5374 |
| 3 | 1 | 66.4 | 79.0 | 17 / 35 | 5180 |
| 4 | 1 | 69.5 | 88.9 | 21 / 35 | 5640 |
| 5 | 1 | 67.7 | 87.0 | 17 / 35 | 4933 |
| 6 | 1 | 67.0 | 83.2 | 19 / 35 | 4805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 69% |
| shrub.Vapour v159 | 32 | 72% |
| Krabb.sliNk.Garm 0.9u | 23 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 81% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 77% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 3 | 67% |
| m3thos.Eva00 1.1 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 34 | 35% | 77 |
| shrub.Vapour v159 | 18 | 18% | 44 |
| Krabb.sliNk.Garm 0.9u | 13 | 13% | 24 |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 11% | 21 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 11% | 17 |
| SHAM.WOW 1.4 | 3 | 3% | 7 |
| m3thos.Eva00 1.1 | 3 | 3% | 7 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 6 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 6 |

## Melee bench: F09

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 73.5 | 46 / 210 | 3.39 | 14.5% | 21636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.4% | 106 |
| hadur117.mini.DeiseD 0.2 | 2.5 | 14.5% | 46 |
| kc.micro.Figment 1.0 | 2.7 | 13.9% | 30 |
| pedersen.Grishnakh 1.0 | 4.2 | 10.9% | 14 |
| yagami.Tidus 0.11 | 4.8 | 10.0% | 3 |
| mc2.enemy.Original 0.9 | 5.8 | 9.1% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.7 | 5.7% | 0 |
| step.nanoPri 1.0 | 9.0 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 78.4 | 5 / 35 | 3977 |
| 2 | 2 | 61.1 | 69.2 | 11 / 35 | 3315 |
| 3 | 2 | 63.7 | 79.4 | 11 / 35 | 3638 |
| 4 | 2 | 63.7 | 77.5 | 10 / 35 | 3694 |
| 5 | 4 | 57.3 | 62.2 | 3 / 35 | 3281 |
| 6 | 3 | 62.3 | 74.3 | 6 / 35 | 3731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 38 | 24% |
| kc.micro.Figment 1.0 | 28 | 71% |
| yagami.Tidus 0.11 | 11 | 82% |
| pedersen.Grishnakh 1.0 | 8 | 75% |
| mc2.enemy.Original 0.9 | 5 | 40% |

Hadur died in 164 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 69 | 42% | 78 |
| kc.micro.Figment 1.0 | 29 | 18% | 52 |
| yagami.Tidus 0.11 | 17 | 10% | 23 |
| mc2.enemy.Original 0.9 | 16 | 10% | 19 |
| robar.nano.Assertive_Melee 0.2 | 12 | 7% | 12 |
| pedersen.Grishnakh 1.0 | 8 | 5% | 11 |
| rdm.Dueler 0.4x | 5 | 3% | 5 |
| dft.Calliope 5.6 | 4 | 2% | 5 |
| step.nanoPri 1.0 | 4 | 2% | 4 |

## Melee bench: F10

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 93.4 | 142 / 210 | 1.59 | 19.5% | 30661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.5% | 142 |
| DTF.Kludgy 1.2b | 2.0 | 14.6% | 33 |
| ejb.Polaris 1.0.1 | 3.3 | 12.5% | 16 |
| ne.Chimera 1.2 | 3.7 | 12.0% | 9 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 3 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.0% | 6 |
| sam.Samspin 1.0 | 7.7 | 5.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.7 | 5.3% | 1 |
| donjezza.Muncho 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 93.3 | 20 / 35 | 4706 |
| 2 | 1 | 69.9 | 93.0 | 27 / 35 | 5159 |
| 3 | 1 | 69.3 | 91.1 | 22 / 35 | 5353 |
| 4 | 1 | 69.5 | 92.1 | 24 / 35 | 5127 |
| 5 | 1 | 69.9 | 94.6 | 21 / 35 | 5293 |
| 6 | 1 | 70.6 | 96.5 | 28 / 35 | 5023 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 71 | 73% |
| ejb.Polaris 1.0.1 | 51 | 80% |
| ne.Chimera 1.2 | 22 | 68% |
| tvv.micro.Antares 1.1.1 | 14 | 79% |
| vStar.RAFzilla 2.15 | 13 | 85% |
| kurios.DOSexe .9b | 9 | 89% |
| donjezza.Muncho 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 33 | 49% | 81 |
| ejb.Polaris 1.0.1 | 13 | 19% | 51 |
| ne.Chimera 1.2 | 10 | 15% | 29 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 16 |
| vStar.RAFzilla 2.15 | 4 | 6% | 12 |
| kurios.DOSexe .9b | 1 | 1% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 4 |
| sam.Samspin 1.0 | 1 | 1% | 4 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |

## Melee bench: F11

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.5 | 79 / 210 | 2.67 | 16.7% | 25273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.3% | 81 |
| hadur117.mini.DeiseD 0.2 | 1.7 | 16.7% | 79 |
| cx.mini.Nimrod 0.55 | 3.2 | 11.6% | 17 |
| djc.DynaBot 0.1.1 | 3.8 | 10.8% | 11 |
| rdt199.Warlord 0.73 | 5.5 | 9.1% | 12 |
| br2.MobyDickBot 1.6 | 5.7 | 8.9% | 8 |
| uji.YellohFellah 1.0 | 7.0 | 7.8% | 5 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 81.3 | 12 / 35 | 4403 |
| 2 | 2 | 65.1 | 81.9 | 8 / 35 | 4217 |
| 3 | 2 | 66.2 | 84.4 | 15 / 35 | 4109 |
| 4 | 1 | 64.5 | 78.7 | 13 / 35 | 4175 |
| 5 | 2 | 67.0 | 85.4 | 18 / 35 | 4179 |
| 6 | 2 | 64.5 | 77.1 | 13 / 35 | 4190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 72 | 50% |
| djc.DynaBot 0.1.1 | 21 | 76% |
| cx.mini.Nimrod 0.55 | 13 | 77% |
| rdt199.Warlord 0.73 | 9 | 89% |
| br2.MobyDickBot 1.6 | 8 | 75% |
| uji.YellohFellah 1.0 | 5 | 60% |

Hadur died in 132 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 68 | 52% | 96 |
| cx.mini.Nimrod 0.55 | 23 | 17% | 29 |
| djc.DynaBot 0.1.1 | 10 | 8% | 21 |
| br2.MobyDickBot 1.6 | 8 | 6% | 24 |
| rdt199.Warlord 0.73 | 7 | 5% | 17 |
| KiraNL.Chupacabra 0.4 | 6 | 5% | 8 |
| uji.YellohFellah 1.0 | 4 | 3% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 79.6 | 73 / 210 | 2.84 | 16.1% | 23124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 16.1% | 73 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.9% | 54 |
| nat.PallasHawk 1.0 | 3.0 | 12.6% | 34 |
| darkcanuck.Leon 1.01 | 3.7 | 12.5% | 28 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 15 |
| jrm.Test0 1.0 | 6.0 | 8.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.8% | 1 |
| jp.Perpy 16.0 | 7.8 | 6.9% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.7% | 3 |
| stuff.Vlad 0.1 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 85.7 | 15 / 35 | 4003 |
| 2 | 1 | 63.7 | 78.4 | 11 / 35 | 3657 |
| 3 | 1 | 65.2 | 79.4 | 16 / 35 | 4181 |
| 4 | 1 | 64.8 | 80.0 | 14 / 35 | 3796 |
| 5 | 2 | 61.5 | 74.0 | 5 / 35 | 3705 |
| 6 | 1 | 64.4 | 80.0 | 12 / 35 | 3782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 40 | 60% |
| darkcanuck.Leon 1.01 | 32 | 75% |
| nat.PallasHawk 1.0 | 22 | 64% |
| brainfade.melee.Genghis 0.36 | 8 | 63% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jrm.Test0 1.0 | 2 | 50% |
| jp.Perpy 16.0 | 2 | 50% |

Hadur died in 137 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 54 | 39% | 74 |
| nat.PallasHawk 1.0 | 35 | 26% | 51 |
| darkcanuck.Leon 1.01 | 16 | 12% | 42 |
| brainfade.melee.Genghis 0.36 | 12 | 9% | 15 |
| jp.Perpy 16.0 | 7 | 5% | 9 |
| jaybot.bots.Oddball 4.0 | 5 | 4% | 9 |
| jrm.Test0 1.0 | 5 | 4% | 6 |
| cs.sheldor.Talon 1.1 | 2 | 1% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 73.8 | 32 / 210 | 3.36 | 14.2% | 23713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.6% | 40 |
| mn.Combat 3.25.0 | 1.5 | 16.9% | 99 |
| hadur117.mini.DeiseD 0.2 | 3.2 | 14.2% | 32 |
| shinh.Entangled 0.3 | 4.3 | 12.6% | 20 |
| gh.micro.Gruweltje 0.7 | 4.5 | 12.2% | 19 |
| apc.Colossus2 0.17 | 6.0 | 7.8% | 0 |
| stelo.Wang 1.0 | 7.2 | 6.6% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.7 | 68.9 | 1 / 35 | 3938 |
| 2 | 3 | 61.6 | 74.0 | 4 / 35 | 3599 |
| 3 | 3 | 63.0 | 75.2 | 8 / 35 | 4169 |
| 4 | 3 | 61.7 | 71.1 | 7 / 35 | 4040 |
| 5 | 3 | 63.9 | 76.8 | 7 / 35 | 4062 |
| 6 | 3 | 62.9 | 76.5 | 5 / 35 | 3905 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 28 | 36% |
| ags.Glacier 0.2.11 | 15 | 53% |
| gh.micro.Gruweltje 0.7 | 10 | 50% |
| shinh.Entangled 0.3 | 9 | 67% |
| apc.Colossus2 0.17 | 2 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 68 | 38% | 78 |
| ags.Glacier 0.2.11 | 66 | 37% | 75 |
| shinh.Entangled 0.3 | 22 | 12% | 28 |
| gh.micro.Gruweltje 0.7 | 13 | 7% | 18 |
| stelo.Wang 1.0 | 4 | 2% | 4 |
| apc.Colossus2 0.17 | 2 | 1% | 4 |
| sample.Tracker 1.0 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.7 | 142 / 210 | 1.84 | 19.3% | 30058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.3% | 142 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.3% | 41 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.6% | 16 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 9.6% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.6% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.3% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.9% | 5 |
| pa.Improved 1.0 | 9.0 | 5.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.5 | 23 / 35 | 4757 |
| 2 | 1 | 69.8 | 90.8 | 25 / 35 | 4983 |
| 3 | 1 | 71.4 | 97.1 | 28 / 35 | 5426 |
| 4 | 1 | 69.3 | 90.8 | 22 / 35 | 5017 |
| 5 | 1 | 69.9 | 92.1 | 25 / 35 | 5059 |
| 6 | 1 | 68.4 | 89.8 | 19 / 35 | 4816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 93 | 83% |
| catcat20.shape.Theta 0.018 | 43 | 74% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 73% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 38 | 56% | 107 |
| catcat20.shape.Theta 0.018 | 15 | 22% | 48 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 6% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 6% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 1% | 5 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.8 | 102 / 210 | 2.37 | 18.6% | 32488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.6% | 102 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.2% | 25 |
| emp.Yngwie 1.11 | 3.2 | 12.9% | 42 |
| mld.DustBunny 3.8 | 3.5 | 12.2% | 17 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.4% | 6 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.3% | 17 |
| Grystrion.TrackerWO 1.0 | 7.0 | 7.4% | 0 |
| lambdaxy.TBot 0.1 | 8.0 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.7% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.0 | 18 / 35 | 5587 |
| 2 | 1 | 69.9 | 89.2 | 22 / 35 | 5426 |
| 3 | 1 | 66.1 | 78.7 | 11 / 35 | 5099 |
| 4 | 1 | 66.1 | 79.4 | 14 / 35 | 5029 |
| 5 | 1 | 70.3 | 88.6 | 21 / 35 | 5774 |
| 6 | 1 | 68.7 | 86.7 | 16 / 35 | 5573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 34 | 59% |
| kawigi.micro.Shiz 1.1 | 31 | 84% |
| mld.DustBunny 3.8 | 22 | 82% |
| cb.nano.Insomnia 1.0 | 21 | 100% |
| kawigi.robot.Girl 1.2 | 16 | 81% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 38 | 35% | 70 |
| kawigi.micro.Shiz 1.1 | 24 | 22% | 47 |
| mld.DustBunny 3.8 | 17 | 16% | 41 |
| cb.nano.Insomnia 1.0 | 11 | 10% | 13 |
| kawigi.robot.Girl 1.2 | 9 | 8% | 20 |
| lambdaxy.TBot 0.1 | 4 | 4% | 5 |
| divineomega.TrialBot 0.003 | 3 | 3% | 9 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 4 |

## Melee bench: F16

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.5 | 99 / 210 | 1.94 | 19.3% | 33883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.3% | 99 |
| gh.Griezel 0.5.2 | 2.0 | 17.0% | 76 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 9 |
| bvh.fnr.Fenrir 0.36l | 4.7 | 9.5% | 3 |
| techdude.forest.FlamingForest 1.1 | 5.0 | 9.8% | 17 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.0% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.2 | 7.1% | 3 |
| repositorio.NanoStep 1.0 | 8.5 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 13 / 35 | 5263 |
| 2 | 1 | 69.5 | 89.8 | 18 / 35 | 5409 |
| 3 | 1 | 70.6 | 90.8 | 19 / 35 | 5739 |
| 4 | 1 | 70.4 | 89.2 | 18 / 35 | 6082 |
| 5 | 1 | 69.5 | 90.2 | 15 / 35 | 5584 |
| 6 | 1 | 70.2 | 91.4 | 16 / 35 | 5806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 101 | 49% |
| techdude.forest.FlamingForest 1.1 | 22 | 50% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 80% |
| bvh.fnr.Fenrir 0.36l | 9 | 89% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| asd.Cthulhu 1.3 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1348. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 56 | 50% | 106 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 14% | 35 |
| techdude.forest.FlamingForest 1.1 | 15 | 14% | 27 |
| bvh.fnr.Fenrir 0.36l | 11 | 10% | 13 |
| stelo.IntrinsicVolatility 1.4 | 5 | 5% | 11 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 8 |
| asd.Cthulhu 1.3 | 2 | 2% | 3 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.8 | 98 / 210 | 2.37 | 17.8% | 28654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.8% | 98 |
| et.Predator 1.8 | 2.8 | 12.7% | 20 |
| cx.BlestPain 1.41 | 3.5 | 12.3% | 39 |
| nic.Nicator 2.4 | 4.0 | 11.5% | 19 |
| oog.melee.Mercutio 1.0 | 4.0 | 11.9% | 24 |
| ahf.NanoAndrew .4 | 6.0 | 10.5% | 6 |
| maribo.melee.BMV 0.1 | 6.7 | 9.9% | 3 |
| tex.Longbot 0.4 | 8.3 | 5.5% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.0 | 19 / 35 | 5099 |
| 2 | 1 | 67.8 | 87.9 | 14 / 35 | 4835 |
| 3 | 1 | 68.0 | 86.3 | 22 / 35 | 4504 |
| 4 | 1 | 64.1 | 74.3 | 13 / 35 | 4387 |
| 5 | 1 | 68.3 | 87.6 | 15 / 35 | 5130 |
| 6 | 1 | 67.5 | 85.4 | 15 / 35 | 4699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 38 | 76% |
| cx.BlestPain 1.41 | 38 | 47% |
| oog.melee.Mercutio 1.0 | 31 | 68% |
| nic.Nicator 2.4 | 28 | 71% |
| ahf.NanoAndrew .4 | 7 | 71% |
| maribo.melee.BMV 0.1 | 5 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 32% | 55 |
| et.Predator 1.8 | 25 | 22% | 57 |
| nic.Nicator 2.4 | 17 | 15% | 32 |
| oog.melee.Mercutio 1.0 | 14 | 13% | 32 |
| ahf.NanoAndrew .4 | 9 | 8% | 18 |
| maribo.melee.BMV 0.1 | 6 | 5% | 10 |
| goblin.Bender 2.4 | 3 | 3% | 3 |
| tex.Longbot 0.4 | 2 | 2% | 2 |

## Melee bench: F18

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 87.0 | 124 / 210 | 2.17 | 18.2% | 25225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.2% | 124 |
| morbid.MorbidPriest 1.0 | 2.3 | 12.7% | 29 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.0% | 21 |
| ratosh.Nobo 0.21 | 4.2 | 10.9% | 4 |
| uji.DBH 1.1 | 4.8 | 10.2% | 14 |
| spinnercat.Robovirus 2.718 | 6.2 | 9.1% | 2 |
| sigterm.Sigterm 1.0 | 7.0 | 8.1% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.7% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.2 | 5.9% | 0 |
| stelo.WangRobot 1.0 | 9.8 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 91.1 | 25 / 35 | 4119 |
| 2 | 1 | 69.4 | 94.0 | 25 / 35 | 4408 |
| 3 | 1 | 65.7 | 81.0 | 17 / 35 | 4286 |
| 4 | 1 | 66.4 | 84.8 | 19 / 35 | 4169 |
| 5 | 1 | 65.4 | 81.0 | 17 / 35 | 3987 |
| 6 | 1 | 68.1 | 90.5 | 21 / 35 | 4256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 42 | 71% |
| agd.Mooserwirt2 2.7 | 30 | 73% |
| uji.DBH 1.1 | 27 | 93% |
| sigterm.Sigterm 1.0 | 16 | 75% |
| spinnercat.Robovirus 2.718 | 14 | 93% |
| ratosh.Nobo 0.21 | 13 | 85% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| stelo.WangRobot 1.0 | 4 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 21 | 24% | 55 |
| agd.Mooserwirt2 2.7 | 20 | 23% | 46 |
| ratosh.Nobo 0.21 | 10 | 12% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 12% | 18 |
| uji.DBH 1.1 | 6 | 7% | 21 |
| sigterm.Sigterm 1.0 | 6 | 7% | 17 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 14 |
| stelo.WangRobot 1.0 | 5 | 6% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 4 |

## Melee bench: F19

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 92.2 | 139 / 210 | 1.70 | 19.7% | 31091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.7% | 139 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 15.4% | 30 |
| mld.Infinity 2.2 | 2.7 | 14.1% | 30 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.7% | 2 |
| erdnis.Rover 0.3 | 4.5 | 11.0% | 7 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.4% | 1 |
| pac.ABC 2.1 | 7.5 | 6.8% | 1 |
| mbh.Mbh 0.1 | 7.5 | 7.2% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.2 | 24 / 35 | 4969 |
| 2 | 1 | 69.7 | 89.2 | 21 / 35 | 5283 |
| 3 | 1 | 70.3 | 93.3 | 22 / 35 | 5130 |
| 4 | 1 | 70.9 | 92.7 | 22 / 35 | 5321 |
| 5 | 1 | 71.0 | 93.7 | 24 / 35 | 5369 |
| 6 | 1 | 71.2 | 95.2 | 26 / 35 | 5019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 79 | 77% |
| mld.Infinity 2.2 | 62 | 92% |
| erdnis.Rover 0.3 | 13 | 85% |
| krillr.mini.JointStrike 2.0.0 | 7 | 86% |
| pbg.R2D2 1.0 | 2 | 100% |
| patson.PatsonTestBot 1.0 | 1 | 100% |
| pac.ABC 2.1 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 43 | 61% | 107 |
| mld.Infinity 2.2 | 10 | 14% | 47 |
| krillr.mini.JointStrike 2.0.0 | 8 | 11% | 16 |
| erdnis.Rover 0.3 | 5 | 7% | 17 |
| patson.PatsonTestBot 1.0 | 4 | 6% | 10 |
| pac.ABC 2.1 | 1 | 1% | 2 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.1 | 113 / 210 | 1.89 | 19.2% | 31106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.2% | 113 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.5% | 61 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.4% | 8 |
| fwb.Nine 1.0.1 | 3.8 | 10.6% | 8 |
| catcat20.Rabbit 0.001 | 5.0 | 9.8% | 12 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 7.7% | 1 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.3% | 5 |
| m3thos.mini.Eva01 0.5.5 | 7.3 | 7.3% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.5 | 22 / 35 | 5361 |
| 2 | 1 | 67.9 | 87.6 | 18 / 35 | 4686 |
| 3 | 1 | 69.4 | 90.2 | 17 / 35 | 5542 |
| 4 | 1 | 69.5 | 89.2 | 21 / 35 | 5368 |
| 5 | 1 | 69.1 | 90.8 | 17 / 35 | 5121 |
| 6 | 1 | 69.4 | 92.4 | 18 / 35 | 5028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 90 | 56% |
| fwb.Nine 1.0.1 | 30 | 90% |
| catcat20.Rabbit 0.001 | 18 | 78% |
| nz.jdc.nano.GridFu 1.0 | 14 | 79% |
| bayen.nut.Squirrel 1.615 | 8 | 88% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 62 | 64% | 108 |
| catcat20.Rabbit 0.001 | 12 | 12% | 28 |
| fwb.Nine 1.0.1 | 12 | 12% | 19 |
| nz.jdc.nano.GridFu 1.0 | 6 | 6% | 28 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |

## Melee bench: F21

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.3 | 124 / 210 | 1.79 | 19.4% | 30934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.4% | 124 |
| eem.EvBot v4.6.16 | 2.2 | 15.7% | 62 |
| dummy.mini.Scimitar 1.01 | 2.8 | 13.6% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 7 |
| eld.Hmm 1.0 | 5.5 | 8.4% | 10 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.0% | 2 |
| fire219.CatBot 1.0 | 7.7 | 6.7% | 0 |
| PSW.Relentless 0.1 | 8.2 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.3 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 94.9 | 25 / 35 | 5334 |
| 2 | 1 | 68.6 | 87.0 | 17 / 35 | 5136 |
| 3 | 1 | 67.9 | 87.0 | 19 / 35 | 4621 |
| 4 | 1 | 69.9 | 94.6 | 23 / 35 | 5176 |
| 5 | 1 | 70.4 | 94.9 | 22 / 35 | 5377 |
| 6 | 1 | 69.5 | 89.2 | 18 / 35 | 5290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 92 | 62% |
| dummy.mini.Scimitar 1.01 | 37 | 92% |
| cf.RiO.RiOx 4.2.1 | 21 | 90% |
| eld.Hmm 1.0 | 14 | 57% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1269. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 46 | 53% | 85 |
| dummy.mini.Scimitar 1.01 | 15 | 17% | 58 |
| cf.RiO.RiOx 4.2.1 | 12 | 14% | 22 |
| eld.Hmm 1.0 | 11 | 13% | 30 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 4 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F22

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.0 | 98 / 210 | 2.17 | 17.9% | 28555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.3 | 17.9% | 98 |
| pe.SandboxDT 2.71m | 1.7 | 16.5% | 61 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.5% | 36 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.1% | 11 |
| bigpete.Stewie 1.0 | 4.8 | 10.7% | 4 |
| tad.Dalek98 0.98 | 6.7 | 6.8% | 1 |
| gg.Squaraus 0.6 | 7.0 | 6.7% | 0 |
| yk.JahRoslav 1.1 | 7.3 | 6.8% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 87.0 | 16 / 35 | 4679 |
| 2 | 1 | 68.0 | 88.3 | 13 / 35 | 4822 |
| 3 | 2 | 66.2 | 82.2 | 13 / 35 | 4430 |
| 4 | 1 | 69.7 | 90.5 | 21 / 35 | 5130 |
| 5 | 1 | 67.1 | 85.4 | 16 / 35 | 4417 |
| 6 | 1 | 68.7 | 88.9 | 19 / 35 | 5077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 57 | 40% |
| kvk.HebusLeTroll 0.35 | 42 | 74% |
| jlm.javaDisturbance 0.59 | 26 | 85% |
| bigpete.Stewie 1.0 | 12 | 83% |
| yk.JahRoslav 1.1 | 5 | 100% |
| pbg.NinjaX 1.2 | 4 | 100% |
| gg.Squaraus 0.6 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 46 | 41% | 74 |
| kvk.HebusLeTroll 0.35 | 34 | 30% | 57 |
| jlm.javaDisturbance 0.59 | 17 | 15% | 39 |
| tad.Dalek98 0.98 | 9 | 8% | 11 |
| bigpete.Stewie 1.0 | 4 | 4% | 16 |
| yk.JahRoslav 1.1 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 5 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.9 | 103 / 210 | 2.09 | 18.7% | 31153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 18.7% | 103 |
| pe.SandboxLump 1.52 | 1.8 | 17.1% | 70 |
| cre.Karolos 0.32 | 3.0 | 12.8% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.4% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.2 | 9.6% | 3 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 9.3% | 6 |
| cw.megas.Blade 0.8 | 7.0 | 8.1% | 0 |
| sample.Walls 1.0 | 7.8 | 7.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.1 | 20 / 35 | 5173 |
| 2 | 1 | 68.9 | 86.7 | 16 / 35 | 5319 |
| 3 | 2 | 68.9 | 90.2 | 14 / 35 | 4683 |
| 4 | 1 | 69.6 | 87.9 | 20 / 35 | 5223 |
| 5 | 1 | 68.7 | 84.8 | 19 / 35 | 5440 |
| 6 | 1 | 68.6 | 85.7 | 14 / 35 | 5315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 83 | 53% |
| stelo.AreaTargetingBot 1.1 | 22 | 91% |
| cre.Karolos 0.32 | 22 | 73% |
| sample.Walls 1.0 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 50% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 65 | 61% | 105 |
| cre.Karolos 0.32 | 17 | 16% | 37 |
| stelo.AreaTargetingBot 1.1 | 12 | 11% | 25 |
| stelo.RamTrackSurfer 1.2 | 6 | 6% | 19 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 3% | 9 |
| cw.megas.Blade 0.8 | 2 | 2% | 5 |
| sample.Walls 1.0 | 1 | 1% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |

## Melee bench: F24

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 73.0 | 52 / 210 | 3.43 | 14.4% | 20915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.8 | 14.4% | 52 |
| florent.XSeries.X2 0.12 | 2.2 | 13.7% | 40 |
| rz.GlowBlowMelee 1.4 | 3.3 | 13.3% | 36 |
| davidalves.Phoenix 0.54 | 3.7 | 12.6% | 37 |
| pedersen.Ugluk 1.1.1 | 4.2 | 11.9% | 28 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 9.0% | 13 |
| oog.melee.Corsair 1.0 | 6.5 | 8.9% | 4 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.6% | 0 |
| evd.X1 0.01 | 9.5 | 4.9% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 65.1 | 8 / 35 | 3142 |
| 2 | 2 | 62.4 | 74.9 | 10 / 35 | 3574 |
| 3 | 3 | 59.8 | 68.3 | 5 / 35 | 3548 |
| 4 | 1 | 62.8 | 76.5 | 13 / 35 | 3263 |
| 5 | 1 | 62.5 | 75.9 | 9 / 35 | 3681 |
| 6 | 1 | 63.1 | 77.5 | 7 / 35 | 3707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 25 | 60% |
| davidalves.Phoenix 0.54 | 24 | 54% |
| florent.XSeries.X2 0.12 | 19 | 37% |
| pedersen.Ugluk 1.1.1 | 11 | 64% |
| stelo.SoJNanoMelee 1.1 | 6 | 83% |
| as.FrankTheTank 1.3 | 3 | 100% |
| oog.melee.Corsair 1.0 | 2 | 50% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 57 | 36% | 71 |
| rz.GlowBlowMelee 1.4 | 30 | 19% | 42 |
| pedersen.Ugluk 1.1.1 | 21 | 13% | 29 |
| davidalves.Phoenix 0.54 | 20 | 13% | 29 |
| stelo.SoJNanoMelee 1.1 | 14 | 9% | 17 |
| oog.melee.Corsair 1.0 | 7 | 4% | 9 |
| evd.X1 0.01 | 6 | 4% | 6 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 4 |

## Melee bench: F25

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 81.4 | 103 / 210 | 2.68 | 17.1% | 23733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.1% | 103 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.1% | 26 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.0% | 21 |
| jdw.Hurricane 1.4 | 3.8 | 12.4% | 33 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.6% | 11 |
| ds.Oo 2.2 | 6.5 | 8.5% | 6 |
| gjr.Cephalosporin 0.1 | 6.7 | 7.4% | 7 |
| adt.Ar2 1.1 | 8.0 | 6.9% | 2 |
| awesomeness.Elite 1.0 | 8.5 | 6.6% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 83.5 | 15 / 35 | 3850 |
| 2 | 1 | 65.1 | 77.5 | 18 / 35 | 4066 |
| 3 | 1 | 63.7 | 74.0 | 13 / 35 | 3876 |
| 4 | 1 | 66.4 | 82.2 | 20 / 35 | 3707 |
| 5 | 1 | 67.6 | 86.0 | 19 / 35 | 4122 |
| 6 | 1 | 66.8 | 85.1 | 18 / 35 | 4112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 82% |
| voidious.mini.BrokenSword 2.0.3 | 45 | 87% |
| jdw.Hurricane 1.4 | 18 | 67% |
| gre.svman4.Morfeas 1.4.1 | 8 | 50% |
| ds.Oo 2.2 | 5 | 60% |
| awesomeness.Elite 1.0 | 4 | 75% |
| adt.Ar2 1.1 | 3 | 67% |
| gjr.Cephalosporin 0.1 | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 31 | 29% | 43 |
| voidious.mini.BrokenSword 2.0.3 | 26 | 24% | 61 |
| voidious.micro.BlitzBat 1.05 | 24 | 22% | 56 |
| gre.svman4.Morfeas 1.4.1 | 10 | 9% | 13 |
| awesomeness.Elite 1.0 | 5 | 5% | 9 |
| adt.Ar2 1.1 | 5 | 5% | 5 |
| ds.Oo 2.2 | 4 | 4% | 12 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 10 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |

## Melee bench: F26

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.6 | 102 / 210 | 2.03 | 18.4% | 31306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.4% | 102 |
| ak.Fermat 2.0 | 2.0 | 15.1% | 58 |
| lrem.Spectre 0.4.4 | 3.8 | 11.7% | 14 |
| shu.nitro.LENIN .T34 | 4.0 | 11.6% | 22 |
| js.PinBall 1.6 | 4.7 | 11.1% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.1% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.4% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.6% | 0 |
| sample.SpinBot 1.0 | 8.8 | 5.3% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.0 | 15 / 35 | 5523 |
| 2 | 1 | 68.6 | 89.2 | 18 / 35 | 5164 |
| 3 | 1 | 67.7 | 88.9 | 17 / 35 | 4927 |
| 4 | 1 | 69.1 | 89.5 | 18 / 35 | 5262 |
| 5 | 1 | 68.7 | 90.2 | 16 / 35 | 5022 |
| 6 | 1 | 68.4 | 87.6 | 18 / 35 | 5408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 46% |
| shu.nitro.LENIN .T34 | 37 | 76% |
| lrem.Spectre 0.4.4 | 22 | 82% |
| js.PinBall 1.6 | 17 | 88% |
| gh.mini.GrubbmOne 1.0 | 7 | 86% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 57% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 57 | 52% | 81 |
| shu.nitro.LENIN .T34 | 21 | 19% | 56 |
| lrem.Spectre 0.4.4 | 16 | 15% | 36 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 5% | 9 |
| js.PinBall 1.6 | 4 | 4% | 15 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 4 |
| sample.SpinBot 1.0 | 2 | 2% | 2 |

## Melee bench: F27

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.2 | 112 / 210 | 2.51 | 17.4% | 25003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.4% | 112 |
| mk.Alpha 0.2.1 | 2.0 | 14.8% | 54 |
| wee.Gem 1.8.4 | 3.7 | 11.7% | 26 |
| EH.Eagle 1.0.6 | 4.0 | 10.6% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 9.4% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 8.8% | 0 |
| joe.ADinosaur 1.0 | 6.8 | 8.3% | 0 |
| throxbot.ThroxBot 0.1 | 7.2 | 7.7% | 2 |
| caimano.Furia_Ceca 0.22 | 8.7 | 7.5% | 2 |
| cs.Grudge 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 87.3 | 21 / 35 | 3767 |
| 2 | 1 | 66.8 | 87.0 | 19 / 35 | 4155 |
| 3 | 1 | 67.5 | 87.0 | 24 / 35 | 4016 |
| 4 | 1 | 67.5 | 86.3 | 21 / 35 | 4273 |
| 5 | 1 | 66.4 | 87.3 | 16 / 35 | 3891 |
| 6 | 1 | 62.9 | 64.4 | 11 / 35 | 4901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 77 | 71% |
| wee.Gem 1.8.4 | 24 | 88% |
| EH.Eagle 1.0.6 | 10 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 70% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| cs.Grudge 1.0 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 44 | 45% | 97 |
| caimano.Furia_Ceca 0.22 | 12 | 12% | 16 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 10% | 17 |
| EH.Eagle 1.0.6 | 8 | 8% | 21 |
| joe.ADinosaur 1.0 | 8 | 8% | 10 |
| wee.Gem 1.8.4 | 7 | 7% | 29 |
| throxbot.ThroxBot 0.1 | 5 | 5% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 3% | 9 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 88.0 | 125 / 210 | 2.08 | 18.1% | 24139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.1% | 125 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 41 |
| uji.Antique 1.0 | 3.5 | 11.8% | 22 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.0% | 10 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.3% | 1 |
| amk.ChumbaWumba 0.3 | 5.8 | 8.8% | 5 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.0% | 4 |
| matt.advanced.Katana 1.0 | 8.5 | 6.1% | 2 |
| stelo.Lifestealer 1.0 | 9.2 | 5.7% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 89.5 | 22 / 35 | 3979 |
| 2 | 1 | 68.5 | 91.4 | 22 / 35 | 4062 |
| 3 | 1 | 68.2 | 88.9 | 23 / 35 | 4277 |
| 4 | 1 | 66.4 | 83.8 | 18 / 35 | 4063 |
| 5 | 1 | 65.9 | 87.0 | 19 / 35 | 3512 |
| 6 | 1 | 67.7 | 87.3 | 21 / 35 | 4246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 78 | 77% |
| uji.Antique 1.0 | 33 | 91% |
| qohnil.blot.BlotBot 3.61 | 19 | 74% |
| amk.ChumbaWumba 0.3 | 10 | 90% |
| ahr.ice.Ice 1.0.2 | 6 | 67% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 0% |

Hadur died in 88 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 36% | 82 |
| amk.ChumbaWumba 0.3 | 18 | 20% | 25 |
| uji.Antique 1.0 | 13 | 15% | 40 |
| qohnil.blot.BlotBot 3.61 | 8 | 9% | 25 |
| ahr.ice.Ice 1.0.2 | 6 | 7% | 13 |
| pfvicm.Sobieski 7.2.3b | 6 | 7% | 11 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| stelo.Lifestealer 1.0 | 2 | 2% | 3 |
| matt.advanced.Katana 1.0 | 1 | 1% | 4 |

## Melee bench: F29

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.8 | 70 / 210 | 3.00 | 16.5% | 26522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.3 | 16.5% | 70 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.6% | 71 |
| deewiant.Anomaly 0.2 | 2.7 | 14.9% | 43 |
| myl.micro.Troodon 1.10 | 4.0 | 11.9% | 10 |
| jok.PheonixM 0.1.2 | 5.0 | 10.3% | 8 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.8% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.2 | 5.0% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.7 | 18 / 35 | 4415 |
| 2 | 1 | 67.1 | 82.9 | 12 / 35 | 4692 |
| 3 | 1 | 66.8 | 82.9 | 10 / 35 | 4573 |
| 4 | 1 | 64.4 | 73.3 | 12 / 35 | 4243 |
| 5 | 2 | 62.9 | 73.0 | 7 / 35 | 4184 |
| 6 | 2 | 65.0 | 75.2 | 11 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 51 | 61% |
| zyx.mega.YersiniaPestis 3.1 | 30 | 47% |
| myl.micro.Troodon 1.10 | 18 | 83% |
| jok.PheonixM 0.1.2 | 9 | 67% |
| DBall.Anarchy 0.1 | 3 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 50 | 36% | 62 |
| deewiant.Anomaly 0.2 | 43 | 31% | 74 |
| myl.micro.Troodon 1.10 | 20 | 14% | 33 |
| jok.PheonixM 0.1.2 | 12 | 9% | 20 |
| ph.melee.ArcherME 0.3 | 9 | 6% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 3 |
| jangs.ns51 1.0 | 2 | 1% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |

## Melee bench: F30

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 75.4 | 45 / 210 | 3.21 | 15.0% | 23346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.5 | 15.0% | 45 |
| catcat20.Matcha 0.006 | 2.0 | 14.2% | 57 |
| darkcanuck.B26354 1.06 | 3.0 | 13.3% | 41 |
| oog.melee.Capulet 1.2 | 3.8 | 13.0% | 30 |
| stelo.PastFuture 2.3.2 | 4.7 | 11.8% | 24 |
| intruder.PrairieWolf 2.61 | 6.0 | 8.5% | 7 |
| ntc.Opposite 1.5 | 7.8 | 7.2% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.4% | 2 |
| tripphippy.Alice 1.1 | 8.2 | 7.2% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 78.1 | 9 / 35 | 3993 |
| 2 | 1 | 63.8 | 77.5 | 11 / 35 | 3951 |
| 3 | 3 | 59.2 | 64.4 | 5 / 35 | 3724 |
| 4 | 2 | 62.1 | 75.2 | 3 / 35 | 3799 |
| 5 | 1 | 63.4 | 77.5 | 9 / 35 | 3738 |
| 6 | 1 | 64.4 | 80.0 | 8 / 35 | 4141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 24 | 33% |
| darkcanuck.B26354 1.06 | 20 | 40% |
| oog.melee.Capulet 1.2 | 15 | 60% |
| stelo.PastFuture 2.3.2 | 12 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 100% |
| intruder.PrairieWolf 2.61 | 6 | 50% |
| tripphippy.Alice 1.1 | 4 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 52 | 32% | 62 |
| stelo.PastFuture 2.3.2 | 33 | 20% | 40 |
| darkcanuck.B26354 1.06 | 33 | 20% | 39 |
| oog.melee.Capulet 1.2 | 26 | 16% | 37 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 10 |
| tripphippy.Alice 1.1 | 6 | 4% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 8 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |
| ntc.Opposite 1.5 | 1 | 1% | 2 |

## Melee bench: F31

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 74.7 | 42 / 210 | 3.28 | 14.4% | 20203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.7% | 112 |
| hadur117.mini.DeiseD 0.2 | 2.0 | 14.4% | 42 |
| gh.mini.Griezel 0.2 | 3.5 | 12.3% | 28 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.2% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.4% | 13 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.3% | 5 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.8% | 1 |
| fm.mammillarias 1.3 | 7.5 | 6.8% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 76.8 | 8 / 35 | 3388 |
| 2 | 2 | 61.3 | 71.1 | 5 / 35 | 3581 |
| 3 | 2 | 62.5 | 76.2 | 5 / 35 | 3414 |
| 4 | 2 | 62.9 | 77.8 | 8 / 35 | 3491 |
| 5 | 2 | 63.0 | 77.8 | 11 / 35 | 3194 |
| 6 | 2 | 60.1 | 68.6 | 5 / 35 | 3135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 43 | 33% |
| gh.mini.Griezel 0.2 | 16 | 63% |
| spinnercat.micro.Tyger 0.1 | 12 | 67% |
| d414.nano.Quantum 1.0.0 | 7 | 57% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 86 | 51% | 101 |
| d414.nano.Quantum 1.0.0 | 24 | 14% | 26 |
| spinnercat.micro.Tyger 0.1 | 23 | 14% | 28 |
| gh.mini.Griezel 0.2 | 19 | 11% | 32 |
| fm.mammillarias 1.3 | 5 | 3% | 7 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 6 |
| gh.nano.Grofvuil 0.2 | 4 | 2% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |

## Melee bench: F32

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.4 | 126 / 210 | 2.22 | 18.1% | 27079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.1% | 126 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.2% | 45 |
| apc.botM 3.0 | 3.0 | 12.4% | 18 |
| lxx.ConceptA 0.8 | 4.3 | 10.3% | 4 |
| vjik.UnViolation 1.1 | 4.7 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 6.3 | 8.5% | 1 |
| panzer.Panzer 0.2 | 7.0 | 7.9% | 1 |
| yk.JahMicro 1.0 | 7.7 | 6.7% | 2 |
| donjezza.Jezza 1.0 | 9.5 | 5.5% | 4 |
| conscience.Electron 1.3g | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.3 | 19 / 35 | 4603 |
| 2 | 1 | 67.3 | 87.6 | 19 / 35 | 4569 |
| 3 | 1 | 67.5 | 86.3 | 24 / 35 | 4219 |
| 4 | 1 | 68.1 | 87.9 | 20 / 35 | 4730 |
| 5 | 1 | 67.6 | 85.4 | 25 / 35 | 4354 |
| 6 | 1 | 66.6 | 84.8 | 19 / 35 | 4604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 76 | 72% |
| apc.botM 3.0 | 31 | 84% |
| lxx.ConceptA 0.8 | 19 | 84% |
| vjik.UnViolation 1.1 | 12 | 100% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| yk.JahMicro 1.0 | 4 | 75% |
| donjezza.Jezza 1.0 | 3 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 45% | 100 |
| lxx.ConceptA 0.8 | 17 | 20% | 25 |
| apc.botM 3.0 | 11 | 13% | 38 |
| panzer.Panzer 0.2 | 6 | 7% | 7 |
| bayen.UbaMicro 1.4 | 5 | 6% | 8 |
| conscience.Electron 1.3g | 4 | 5% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |
| vjik.UnViolation 1.1 | 1 | 1% | 20 |
| yk.JahMicro 1.0 | 1 | 1% | 3 |

## Melee bench: F33

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.2 | 115 / 210 | 2.33 | 18.6% | 30054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.6% | 115 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.6% | 23 |
| labg.Cataclysm 2.05 | 4.2 | 11.4% | 22 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.9% | 9 |
| baal.nano.N 1.42 | 6.2 | 8.6% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 7.8% | 2 |
| zyx.micro.Ant 1.1 | 8.3 | 5.3% | 0 |
| sanja.First 0.1 | 8.7 | 5.2% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.7 | 20 / 35 | 5435 |
| 2 | 1 | 67.5 | 81.9 | 15 / 35 | 4814 |
| 3 | 1 | 67.2 | 80.0 | 20 / 35 | 4777 |
| 4 | 1 | 67.4 | 83.5 | 14 / 35 | 4828 |
| 5 | 1 | 69.5 | 88.9 | 22 / 35 | 4908 |
| 6 | 1 | 70.6 | 91.4 | 24 / 35 | 5292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 61 | 77% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 67% |
| gre.svman4.Leonidas 1.3.2 | 27 | 89% |
| labg.Cataclysm 2.05 | 14 | 71% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 100% |
| sanja.First 0.1 | 3 | 67% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 37 | 39% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 18% | 43 |
| labg.Cataclysm 2.05 | 15 | 16% | 26 |
| gre.svman4.Leonidas 1.3.2 | 12 | 13% | 31 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 6 | 6% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 5% | 7 |
| zyx.micro.Ant 1.1 | 4 | 4% | 5 |
| baal.nano.N 1.42 | 0 | 0% | 3 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.0 | 78 / 210 | 2.44 | 17.2% | 27802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.7 | 16.4% | 68 |
| hadur117.mini.DeiseD 0.2 | 1.7 | 17.2% | 78 |
| kid.Gladiator .7.2 | 2.7 | 15.5% | 39 |
| jcs.Seth 1.8 | 4.5 | 11.0% | 14 |
| tcf.Reach 3 | 4.8 | 11.3% | 9 |
| cli.Dancer 1.1 | 5.7 | 9.8% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 6.9% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 8.8 | 4.1% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 82.2 | 11 / 35 | 4295 |
| 2 | 2 | 66.8 | 83.8 | 12 / 35 | 4400 |
| 3 | 1 | 69.9 | 90.2 | 19 / 35 | 5277 |
| 4 | 1 | 67.8 | 85.4 | 13 / 35 | 4679 |
| 5 | 2 | 67.0 | 82.5 | 13 / 35 | 4867 |
| 6 | 2 | 65.6 | 80.0 | 10 / 35 | 4284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 64 | 47% |
| kid.Gladiator .7.2 | 34 | 50% |
| jcs.Seth 1.8 | 17 | 88% |
| tcf.Reach 3 | 11 | 82% |
| cli.Dancer 1.1 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 63 | 48% | 90 |
| kid.Gladiator .7.2 | 37 | 28% | 53 |
| tcf.Reach 3 | 14 | 11% | 22 |
| jcs.Seth 1.8 | 7 | 5% | 25 |
| ratosh.Wesco 1.4 | 6 | 5% | 9 |
| cli.Dancer 1.1 | 4 | 3% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F35

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 73.0 | 18 / 210 | 3.43 | 13.5% | 18764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.3% | 163 |
| hadur117.mini.DeiseD 0.2 | 2.2 | 13.5% | 18 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.7% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.9% | 10 |
| rz.HawkOnFire 0.1 | 4.5 | 11.7% | 4 |
| myl.nano.KomoriNinja 1.1 | 6.2 | 7.4% | 1 |
| wit.Chuliath 1.0 | 7.0 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.4% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 74.9 | 4 / 35 | 3170 |
| 2 | 2 | 61.9 | 77.1 | 3 / 35 | 3362 |
| 3 | 2 | 60.9 | 73.3 | 4 / 35 | 2936 |
| 4 | 2 | 59.3 | 68.6 | 3 / 35 | 3063 |
| 5 | 2 | 60.3 | 72.4 | 2 / 35 | 3229 |
| 6 | 3 | 60.1 | 71.7 | 2 / 35 | 3004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 28 | 7% |
| gh.mini.Gruwel 0.9 | 10 | 50% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 60% |
| myl.nano.KomoriNinja 1.1 | 2 | 50% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 106 | 55% | 110 |
| rz.HawkOnFire 0.1 | 27 | 14% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 24 | 13% | 26 |
| gh.mini.Gruwel 0.9 | 17 | 9% | 23 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 4% | 7 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 4 |
| dans.Cinnamon 1.2 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.9 | 168 / 210 | 1.55 | 20.9% | 31922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 20.9% | 168 |
| alpha.RainingFire 1.0 | 3.0 | 11.7% | 17 |
| bzdp.Pansy 2.1 | 3.2 | 11.3% | 5 |
| bvh.micro.Freya 0.3 | 4.0 | 10.4% | 7 |
| mz.Cork 0.1 | 4.2 | 10.2% | 6 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.2% | 3 |
| m3thos.Eva02 0.7.1 | 6.7 | 9.1% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.5% | 1 |
| dl.BetterWalls 1.0 | 9.2 | 5.6% | 2 |
| sample.MyFirstRobot 1.0 | 9.7 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 95.2 | 30 / 35 | 5286 |
| 2 | 1 | 71.5 | 95.2 | 29 / 35 | 5402 |
| 3 | 1 | 70.0 | 91.1 | 27 / 35 | 5012 |
| 4 | 1 | 71.6 | 96.2 | 30 / 35 | 5410 |
| 5 | 1 | 69.8 | 92.1 | 24 / 35 | 5205 |
| 6 | 1 | 71.2 | 93.3 | 28 / 35 | 5607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 100% |
| bvh.micro.Freya 0.3 | 39 | 95% |
| bvh.mini.Fenrir 0.39 | 24 | 100% |
| mz.Cork 0.1 | 22 | 86% |
| m3thos.Eva02 0.7.1 | 18 | 100% |
| alpha.RainingFire 1.0 | 18 | 72% |
| sample.MyFirstRobot 1.0 | 12 | 92% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 20 | 48% | 34 |
| bzdp.Pansy 2.1 | 5 | 12% | 53 |
| mz.Cork 0.1 | 5 | 12% | 25 |
| bvh.micro.Freya 0.3 | 4 | 10% | 23 |
| bvh.mini.Fenrir 0.39 | 3 | 7% | 15 |
| dl.BetterWalls 1.0 | 3 | 7% | 13 |
| m3thos.Eva02 0.7.1 | 1 | 2% | 22 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 17 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |

## Melee bench: F37

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.9 | 124 / 210 | 2.45 | 17.9% | 31726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.9% | 124 |
| germ.TheMind .2 | 2.5 | 12.0% | 31 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.8% | 2 |
| EBBU.Sim2 1.02 | 3.8 | 10.3% | 9 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.7% | 13 |
| agrach.Dalek 1.0 | 6.7 | 8.6% | 8 |
| mb.Beast 0.1 | 7.3 | 8.3% | 12 |
| skm.Ryubot 1.0 | 7.7 | 7.8% | 8 |
| lmk.ACPFinal 0.1 | 8.0 | 7.9% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 81.3 | 19 / 35 | 5186 |
| 2 | 1 | 65.6 | 81.3 | 19 / 35 | 5060 |
| 3 | 1 | 67.8 | 84.8 | 24 / 35 | 5769 |
| 4 | 1 | 68.0 | 89.8 | 21 / 35 | 5362 |
| 5 | 1 | 65.4 | 80.3 | 19 / 35 | 5147 |
| 6 | 1 | 66.9 | 85.7 | 22 / 35 | 5202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 34 | 71% |
| EBBU.Sim2 1.02 | 28 | 86% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 100% |
| stelo.UntouchableNano 1.3 | 18 | 72% |
| skm.Ryubot 1.0 | 14 | 86% |
| agrach.Dalek 1.0 | 11 | 100% |
| mb.Beast 0.1 | 9 | 89% |
| lmk.ACPFinal 0.1 | 7 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 0% |

Hadur died in 87 of 210 rounds, at a mean tick of 457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 22 | 25% | 44 |
| stelo.UntouchableNano 1.3 | 13 | 15% | 27 |
| EBBU.Sim2 1.02 | 11 | 13% | 34 |
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 13% | 32 |
| agrach.Dalek 1.0 | 9 | 10% | 29 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 9% | 9 |
| lmk.ACPFinal 0.1 | 5 | 6% | 9 |
| mb.Beast 0.1 | 4 | 5% | 14 |
| skm.Ryubot 1.0 | 4 | 5% | 11 |

## Melee bench: F38

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 79.4 | 73 / 210 | 2.86 | 16.1% | 24745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.8% | 82 |
| hadur117.mini.DeiseD 0.2 | 1.7 | 16.1% | 73 |
| bvh.mini.Freya 0.55 | 3.0 | 13.4% | 17 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.1% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 9.7% | 6 |
| cs.Wren 1.0 | 6.0 | 9.6% | 8 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.0% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.2% | 0 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 81.6 | 11 / 35 | 4146 |
| 2 | 1 | 66.9 | 82.9 | 18 / 35 | 4415 |
| 3 | 2 | 62.1 | 74.6 | 7 / 35 | 3553 |
| 4 | 1 | 66.1 | 83.8 | 14 / 35 | 4193 |
| 5 | 2 | 66.5 | 81.0 | 13 / 35 | 4696 |
| 6 | 2 | 62.4 | 72.4 | 10 / 35 | 3742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 51 | 61% |
| bvh.mini.Freya 0.55 | 16 | 63% |
| bts.mega.Gnarly 1.4 | 15 | 47% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 88% |
| cs.Wren 1.0 | 8 | 100% |
| kdf.KoulDestroyer 1.0 | 7 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 49 | 36% | 78 |
| bvh.mini.Freya 0.55 | 39 | 28% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 12% | 24 |
| bts.mega.Gnarly 1.4 | 16 | 12% | 23 |
| cs.Wren 1.0 | 7 | 5% | 16 |
| kdf.KoulDestroyer 1.0 | 7 | 5% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.2 | 99 / 210 | 2.33 | 17.7% | 28265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.7% | 99 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 31 |
| az.Ololobot 0.2.4 | 3.5 | 12.0% | 43 |
| catcat20.Lambda 0.024 | 3.8 | 10.9% | 19 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.3% | 13 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.4% | 4 |
| gimp.GimpBot 0.1 | 6.8 | 7.9% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.5% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 79.4 | 14 / 35 | 4313 |
| 2 | 1 | 66.4 | 85.7 | 17 / 35 | 4641 |
| 3 | 1 | 65.7 | 84.4 | 15 / 35 | 4523 |
| 4 | 1 | 68.6 | 88.9 | 20 / 35 | 5052 |
| 5 | 1 | 66.1 | 82.9 | 14 / 35 | 4872 |
| 6 | 1 | 68.3 | 90.2 | 19 / 35 | 4864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 48 | 67% |
| az.Ololobot 0.2.4 | 33 | 58% |
| catcat20.Lambda 0.024 | 21 | 76% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 89% |
| gimp.GimpBot 0.1 | 8 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 49 | 44% | 82 |
| az.Ololobot 0.2.4 | 21 | 19% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 16% | 32 |
| catcat20.Lambda 0.024 | 15 | 13% | 29 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 4 |
| gimp.GimpBot 0.1 | 2 | 2% | 9 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.1 | 124 / 210 | 2.07 | 18.7% | 27598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.7% | 124 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 42 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.4% | 17 |
| mz.AntiGrav 1.0 | 4.5 | 10.4% | 5 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.0% | 8 |
| alpha.BlackIce 1.0 | 6.0 | 9.2% | 6 |
| stelo.Randomness 1.0 | 6.8 | 7.9% | 7 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.7% | 0 |
| sample.Corners 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.3 | 22 / 35 | 4668 |
| 2 | 1 | 68.7 | 90.5 | 21 / 35 | 4534 |
| 3 | 1 | 68.1 | 86.3 | 21 / 35 | 4595 |
| 4 | 1 | 66.8 | 85.7 | 15 / 35 | 4515 |
| 5 | 1 | 70.0 | 91.4 | 24 / 35 | 5045 |
| 6 | 1 | 67.6 | 86.7 | 21 / 35 | 4241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 64 | 75% |
| kano.gamma.KanoGamma 1.8 | 30 | 80% |
| mz.AntiGrav 1.0 | 27 | 100% |
| Polkwane.SmashMelee 1.0 | 12 | 83% |
| alpha.BlackIce 1.0 | 9 | 56% |
| stelo.Randomness 1.0 | 8 | 63% |
| sample.Corners 1.0 | 3 | 67% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 35 | 41% | 70 |
| kano.gamma.KanoGamma 1.8 | 14 | 16% | 44 |
| Polkwane.SmashMelee 1.0 | 12 | 14% | 19 |
| alpha.BlackIce 1.0 | 9 | 10% | 16 |
| mz.AntiGrav 1.0 | 6 | 7% | 30 |
| stelo.Randomness 1.0 | 4 | 5% | 13 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 6 |
| sample.Corners 1.0 | 2 | 2% | 7 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 5 |

## Melee bench: F41

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 86.2 | 107 / 210 | 2.24 | 17.4% | 23406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 17.4% | 107 |
| eem.EvBotNG v12.8 | 1.8 | 16.0% | 63 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.5% | 18 |
| ary.Swarm 1.1 | 3.8 | 12.4% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.0% | 7 |
| shrub.Silver v048 | 6.2 | 8.9% | 0 |
| zyx.nano.Ant 1.1 | 6.8 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.6% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 5.7% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 88.6 | 18 / 35 | 3721 |
| 2 | 1 | 66.6 | 84.1 | 20 / 35 | 3977 |
| 3 | 1 | 66.1 | 84.4 | 16 / 35 | 3877 |
| 4 | 1 | 66.4 | 83.8 | 15 / 35 | 3885 |
| 5 | 2 | 66.7 | 86.3 | 16 / 35 | 3752 |
| 6 | 1 | 68.8 | 89.8 | 22 / 35 | 4194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 67 | 57% |
| lessonz.robocode.Oz 0.5.0 | 32 | 72% |
| ary.Swarm 1.1 | 25 | 84% |
| simonton.nano.MeleeSeed 1.8 | 16 | 94% |
| shrub.Silver v048 | 6 | 100% |
| stelo.Mirror 1.1 | 3 | 67% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 45 | 44% | 86 |
| simonton.nano.MeleeSeed 1.8 | 18 | 17% | 38 |
| ary.Swarm 1.1 | 15 | 15% | 33 |
| lessonz.robocode.Oz 0.5.0 | 15 | 15% | 33 |
| stelo.Mirror 1.1 | 3 | 3% | 5 |
| zyx.nano.Ant 1.1 | 3 | 3% | 5 |
| acogdev.alpha 0.2 | 3 | 3% | 2 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| shrub.Silver v048 | 0 | 0% | 6 |

## Melee bench: F42

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.8 | 101 / 210 | 2.46 | 17.5% | 28791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.5% | 101 |
| wompi.Wallaby 5.1 | 2.2 | 15.4% | 51 |
| ara.Shera 0.88 | 3.2 | 13.8% | 29 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.3% | 23 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 3 |
| maribo.IotaCT 1.1 | 6.2 | 7.9% | 2 |
| dsw.StaticD 1.0 | 7.2 | 6.4% | 1 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 78.4 | 13 / 35 | 4716 |
| 2 | 1 | 67.4 | 86.0 | 19 / 35 | 4546 |
| 3 | 1 | 68.0 | 88.6 | 19 / 35 | 4703 |
| 4 | 1 | 67.5 | 84.4 | 18 / 35 | 5165 |
| 5 | 1 | 64.8 | 75.6 | 12 / 35 | 4559 |
| 6 | 1 | 68.9 | 89.5 | 20 / 35 | 5102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 54 | 78% |
| ara.Shera 0.88 | 43 | 70% |
| maribo.mini.MiniQuester 0.1 | 33 | 73% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| dsw.StaticD 1.0 | 2 | 50% |
| amz.NanoClone 1.41 | 2 | 50% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 0% |

Hadur died in 111 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 36% | 85 |
| ara.Shera 0.88 | 28 | 25% | 53 |
| maribo.mini.MiniQuester 0.1 | 24 | 22% | 48 |
| amz.NanoClone 1.41 | 12 | 11% | 13 |
| dsw.StaticD 1.0 | 2 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 4 |
| maribo.IotaCT 1.1 | 1 | 1% | 1 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 68.7 | 15 / 210 | 3.81 | 13.1% | 20098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 167 |
| hadur117.mini.DeiseD 0.2 | 2.5 | 13.1% | 15 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.7% | 18 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.9% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.0% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.3% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 72.7 | 2 / 35 | 3255 |
| 2 | 3 | 61.4 | 69.5 | 2 / 35 | 3322 |
| 3 | 3 | 60.3 | 64.4 | 3 / 35 | 3486 |
| 4 | 2 | 61.6 | 71.1 | 3 / 35 | 3121 |
| 5 | 2 | 61.9 | 70.8 | 4 / 35 | 3340 |
| 6 | 3 | 60.2 | 63.8 | 1 / 35 | 3574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 42 | 7% |
| brainfade.melee.Dusk 0.44 | 10 | 50% |
| dummy.micro.Sparrow 2.5 | 6 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 195 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 132 | 68% | 136 |
| brainfade.melee.Dusk 0.44 | 17 | 9% | 21 |
| dummy.micro.Sparrow 2.5 | 14 | 7% | 20 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 7% | 14 |
| Krabb.akim2.Akim2 1.1b | 7 | 4% | 7 |
| jab.DiamondStealer 5 | 4 | 2% | 5 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |
| cvt.Firsty 1.0 | 3 | 2% | 3 |

## Melee bench: F44

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.9 | 126 / 210 | 1.91 | 19.3% | 30101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.3% | 126 |
| stelo.Liblix 0.3.1 | 2.0 | 15.2% | 48 |
| tzu.TheArtOfWar 1.2 | 3.3 | 12.6% | 20 |
| wompi.Quokka 1.6 | 4.3 | 10.4% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.4% | 1 |
| jwirde.Gort 2.0 | 5.3 | 9.2% | 8 |
| disan.Chair 2.2.0 | 7.3 | 7.8% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.8 | 21 / 35 | 4679 |
| 2 | 1 | 70.5 | 93.7 | 27 / 35 | 5047 |
| 3 | 1 | 68.5 | 86.7 | 19 / 35 | 4905 |
| 4 | 1 | 70.9 | 94.0 | 21 / 35 | 5545 |
| 5 | 1 | 67.6 | 85.1 | 17 / 35 | 4881 |
| 6 | 1 | 69.1 | 89.2 | 21 / 35 | 5044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 85 | 69% |
| tzu.TheArtOfWar 1.2 | 41 | 78% |
| wompi.Quokka 1.6 | 12 | 92% |
| jwirde.Gort 2.0 | 10 | 60% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| disan.Chair 2.2.0 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 40 | 48% | 100 |
| tzu.TheArtOfWar 1.2 | 22 | 26% | 54 |
| wompi.Quokka 1.6 | 9 | 11% | 23 |
| jwirde.Gort 2.0 | 5 | 6% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 12 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 5 |
| disan.Chair 2.2.0 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.3 | 88 / 210 | 1.96 | 20.2% | 37059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 20.2% | 88 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.5% | 104 |
| myl.nano.Graviton 1.10 | 4.0 | 10.3% | 2 |
| jje.BagPuss 1.2 | 4.0 | 10.4% | 4 |
| sul.Lunar 1.1 | 4.2 | 10.3% | 5 |
| hvilela.HVilela 0.9 | 6.7 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 7.9% | 3 |
| fm.claire 1.7 | 7.2 | 7.9% | 3 |
| wit.Deep7 2.0 | 9.0 | 6.1% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.1 | 14 / 35 | 6053 |
| 2 | 1 | 70.1 | 89.5 | 14 / 35 | 6259 |
| 3 | 1 | 69.0 | 87.9 | 12 / 35 | 5945 |
| 4 | 1 | 70.8 | 92.4 | 19 / 35 | 6187 |
| 5 | 1 | 70.1 | 90.5 | 10 / 35 | 6506 |
| 6 | 1 | 70.7 | 90.5 | 19 / 35 | 6109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 121 | 37% |
| sul.Lunar 1.1 | 15 | 93% |
| jje.BagPuss 1.2 | 10 | 90% |
| myl.nano.Graviton 1.10 | 8 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 2 | 0% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 2295. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 79 | 65% | 0 |
| myl.nano.Graviton 1.10 | 15 | 12% | 43 |
| sul.Lunar 1.1 | 8 | 7% | 65 |
| jje.BagPuss 1.2 | 7 | 6% | 34 |
| fm.claire 1.7 | 6 | 5% | 13 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 24 |
| hvilela.HVilela 0.9 | 3 | 2% | 14 |
| wit.Deep7 2.0 | 1 | 1% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 7 |

## Melee bench: F46

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 76.7 | 24 / 210 | 3.10 | 14.9% | 24970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.4% | 94 |
| kc.mini.Mirage 0.2 | 1.7 | 17.1% | 71 |
| hadur117.mini.DeiseD 0.2 | 3.0 | 14.9% | 24 |
| cx.Princess 1.0 | 4.0 | 10.8% | 19 |
| mz.MicroSheep 1.0 | 5.0 | 10.1% | 0 |
| sadoner.killer 0.2 | 6.0 | 8.6% | 0 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.1% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 5.9% | 1 |
| kurios.DOSexe .9a | 9.2 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 81.3 | 4 / 35 | 4466 |
| 2 | 3 | 64.3 | 79.0 | 7 / 35 | 4264 |
| 3 | 3 | 63.1 | 77.8 | 3 / 35 | 3971 |
| 4 | 3 | 63.0 | 75.6 | 3 / 35 | 4054 |
| 5 | 3 | 62.3 | 74.9 | 4 / 35 | 3802 |
| 6 | 3 | 62.5 | 71.7 | 3 / 35 | 4413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 35 | 23% |
| rsalesc.melee.Medina 0.4.5 | 34 | 24% |
| cx.Princess 1.0 | 7 | 57% |
| mz.MicroSheep 1.0 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 75 | 40% | 84 |
| rsalesc.melee.Medina 0.4.5 | 75 | 40% | 82 |
| cx.Princess 1.0 | 17 | 9% | 19 |
| mz.MicroSheep 1.0 | 6 | 3% | 10 |
| sadoner.killer 0.2 | 6 | 3% | 6 |
| arthord.NanoSatanMelee Beta | 4 | 2% | 5 |
| kurios.DOSexe .9a | 1 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

