# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 87.6 | 65 / 210 | 2.12 | 17.3% | 29280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 134 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 17.3% | 65 |
| sgp.JollyNinja 3.53 | 3.3 | 11.0% | 7 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 10.8% | 0 |
| mz.MicroGodMelee 1 | 4.7 | 10.6% | 3 |
| lorneswork.Predator 1.0 | 5.8 | 9.4% | 2 |
| adt.Ar2 1.0 | 7.2 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 4.9% | 0 |
| skm.butterfly 1.0 | 8.5 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 82.5 | 10 / 35 | 4772 |
| 2 | 2 | 68.1 | 89.5 | 13 / 35 | 4923 |
| 3 | 2 | 68.1 | 90.2 | 11 / 35 | 5001 |
| 4 | 2 | 67.7 | 86.3 | 12 / 35 | 5092 |
| 5 | 2 | 66.6 | 87.6 | 11 / 35 | 4537 |
| 6 | 2 | 67.6 | 89.2 | 8 / 35 | 4955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 126 | 21% |
| sgp.JollyNinja 3.53 | 19 | 84% |
| mz.MicroGodMelee 1 | 16 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| lorneswork.Predator 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 1275. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 78% | 144 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 8% | 15 |
| sgp.JollyNinja 3.53 | 10 | 7% | 19 |
| mz.MicroGodMelee 1 | 3 | 2% | 17 |
| lorneswork.Predator 1.0 | 2 | 1% | 6 |
| mym.EdgeStalker 1.0 | 2 | 1% | 2 |
| adt.Ar2 1.0 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.4 | 115 / 210 | 2.40 | 17.9% | 27838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.9% | 115 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.8% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.5% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.5% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.6% | 8 |
| sch.Simone 0.3d | 6.8 | 7.3% | 6 |
| Noran.BitchingElk 0.054 | 7.0 | 7.3% | 6 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.3% | 1 |
| stelo.PatternRobot 1.0 | 8.8 | 6.1% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 15 / 35 | 4710 |
| 2 | 1 | 67.0 | 83.2 | 19 / 35 | 4749 |
| 3 | 1 | 67.6 | 85.1 | 19 / 35 | 4636 |
| 4 | 1 | 65.5 | 79.7 | 19 / 35 | 4264 |
| 5 | 1 | 67.4 | 85.1 | 19 / 35 | 4519 |
| 6 | 1 | 69.0 | 89.2 | 24 / 35 | 4960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 83% |
| pulsar.PulsarMax 0.8.9 | 44 | 64% |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| Noran.BitchingElk 0.054 | 10 | 70% |
| sch.Simone 0.3d | 9 | 78% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 39 | 41% | 67 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 19 | 20% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 11% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 8% | 26 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 5 |
| sch.Simone 0.3d | 4 | 4% | 10 |
| Noran.BitchingElk 0.054 | 3 | 3% | 18 |
| fullsail.SweetTea 1.1 | 3 | 3% | 9 |
| stelo.PatternRobot 1.0 | 3 | 3% | 7 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.5 | 145 / 210 | 1.76 | 19.8% | 35594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.8% | 145 |
| vuen.Cake 2.51 | 2.5 | 13.7% | 36 |
| radnor.DoctorBob 1.42 | 3.2 | 13.4% | 15 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.9% | 12 |
| urdos.URDOS 1.3 | 5.2 | 9.0% | 1 |
| adt.Ar1 2.1 | 6.0 | 8.0% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 21 / 35 | 5506 |
| 2 | 1 | 69.7 | 92.4 | 24 / 35 | 5582 |
| 3 | 1 | 69.7 | 90.2 | 22 / 35 | 5996 |
| 4 | 1 | 70.1 | 91.7 | 24 / 35 | 6066 |
| 5 | 1 | 70.1 | 90.5 | 26 / 35 | 6044 |
| 6 | 1 | 71.4 | 95.6 | 28 / 35 | 6400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 72 | 74% |
| kawigi.nano.Lib 1.0 | 42 | 98% |
| radnor.DoctorBob 1.42 | 38 | 97% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 29 | 45% | 82 |
| radnor.DoctorBob 1.42 | 18 | 28% | 47 |
| kawigi.nano.Lib 1.0 | 10 | 15% | 46 |
| adt.Ar1 2.1 | 3 | 5% | 11 |
| urdos.URDOS 1.3 | 2 | 3% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 3% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 6 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |

## Melee bench: F04

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.9 | 30 / 210 | 2.36 | 17.0% | 31516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.5% | 170 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 17.0% | 30 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 10.3% | 0 |
| josago.Jorgito 0.16 | 5.2 | 8.6% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 7.0% | 0 |
| css.Delitioner 0.11 | 6.7 | 6.9% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 84.8 | 2 / 35 | 5136 |
| 2 | 2 | 67.8 | 84.4 | 7 / 35 | 5667 |
| 3 | 2 | 67.2 | 85.7 | 4 / 35 | 5007 |
| 4 | 2 | 66.4 | 81.6 | 5 / 35 | 5154 |
| 5 | 2 | 66.3 | 82.5 | 3 / 35 | 4860 |
| 6 | 2 | 69.2 | 90.5 | 9 / 35 | 5692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 157 | 16% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| spin.Bugstard 0.012b | 1 | 100% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 1448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 154 | 85% | 180 |
| apc.LeeroyJenkins2 1.0 | 11 | 6% | 15 |
| josago.Jorgito 0.16 | 9 | 5% | 9 |
| TNT.TNT 0.99.1 | 4 | 2% | 4 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 74.8 | 31 / 210 | 3.27 | 13.9% | 20142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.4% | 113 |
| justin.DemonicRage 3.4 | 1.8 | 16.8% | 50 |
| hadur117.mini.DeiseD 0.4 | 3.0 | 13.9% | 31 |
| wompi.Numbat 2.1 | 4.0 | 12.2% | 8 |
| axeBots.HataMoto 3.09 | 5.5 | 9.3% | 7 |
| ms.Ares 0.19 | 5.5 | 9.1% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.7% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 3.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 75.6 | 6 / 35 | 3325 |
| 2 | 3 | 63.9 | 81.0 | 7 / 35 | 3627 |
| 3 | 3 | 60.4 | 72.7 | 3 / 35 | 3040 |
| 4 | 3 | 62.5 | 75.9 | 10 / 35 | 3400 |
| 5 | 3 | 61.3 | 73.7 | 3 / 35 | 3291 |
| 6 | 3 | 60.6 | 69.8 | 2 / 35 | 3459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 39 | 13% |
| justin.DemonicRage 3.4 | 33 | 48% |
| wompi.Numbat 2.1 | 9 | 78% |
| ms.Ares 0.19 | 2 | 100% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 65 | 36% | 71 |
| justin.DemonicRage 3.4 | 62 | 34% | 78 |
| wompi.Numbat 2.1 | 27 | 15% | 33 |
| ms.Ares 0.19 | 11 | 6% | 14 |
| axeBots.HataMoto 3.09 | 4 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.6 | 113 / 210 | 2.21 | 18.2% | 28010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.2% | 113 |
| jekl.StoneGhost 0.7 | 2.5 | 14.5% | 18 |
| origin.SleepSiphon 1.7b | 2.8 | 13.5% | 44 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.2% | 24 |
| mld.Wisdom 1.0 | 4.7 | 10.6% | 2 |
| gg.Wolverine 2.0 | 6.5 | 7.8% | 5 |
| spinnercat.Omen 1.0 | 7.3 | 7.0% | 2 |
| DBall.NUKE 0.1 | 8.0 | 6.6% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.3% | 3 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.4 | 17 / 35 | 4674 |
| 2 | 1 | 68.3 | 91.1 | 20 / 35 | 4354 |
| 3 | 1 | 68.6 | 87.6 | 20 / 35 | 4757 |
| 4 | 1 | 68.0 | 85.1 | 21 / 35 | 4788 |
| 5 | 1 | 67.8 | 85.4 | 18 / 35 | 5038 |
| 6 | 1 | 67.1 | 84.8 | 17 / 35 | 4399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 46 | 89% |
| origin.SleepSiphon 1.7b | 45 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 77% |
| mld.Wisdom 1.0 | 7 | 100% |
| gg.Wolverine 2.0 | 5 | 100% |
| DBall.NUKE 0.1 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |

Hadur died in 100 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 34 | 34% | 72 |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 25% | 50 |
| jekl.StoneGhost 0.7 | 22 | 22% | 50 |
| mld.Wisdom 1.0 | 8 | 8% | 17 |
| gg.Wolverine 2.0 | 5 | 5% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.3 | 146 / 210 | 1.42 | 20.5% | 33903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.5% | 146 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.9% | 38 |
| rtk.Tachikoma 1.0 | 2.8 | 16.1% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.6% | 5 |
| franzor.Lizt 1.3.1 | 4.7 | 10.4% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| sample.Target 1.0 | 9.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 97.5 | 27 / 35 | 5870 |
| 2 | 1 | 72.4 | 96.8 | 26 / 35 | 5682 |
| 3 | 1 | 72.4 | 96.5 | 25 / 35 | 6144 |
| 4 | 1 | 72.2 | 95.9 | 26 / 35 | 5765 |
| 5 | 1 | 70.9 | 93.3 | 20 / 35 | 5235 |
| 6 | 1 | 70.7 | 91.7 | 22 / 35 | 5207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 100 | 91% |
| rsalesc.melee.Monk 0.3.6c | 49 | 33% |
| oog.melee.CapuletDroid 1.1 | 34 | 88% |
| franzor.Lizt 1.3.1 | 12 | 67% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 1598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 38 | 59% | 62 |
| rtk.Tachikoma 1.0 | 15 | 23% | 108 |
| oog.melee.CapuletDroid 1.1 | 6 | 9% | 32 |
| franzor.Lizt 1.3.1 | 4 | 6% | 1 |
| skm.PateranBotlock2 1.0 | 1 | 2% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.7 | 139 / 210 | 1.83 | 19.4% | 29675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.4% | 139 |
| shrub.Vapour v159 | 2.3 | 12.6% | 20 |
| tm.Yuugao 1.0 | 2.8 | 12.6% | 27 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.9% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.7% | 5 |
| m3thos.Eva00 1.1 | 6.5 | 8.0% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 7.9% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.1% | 0 |
| SHAM.WOW 1.4 | 9.3 | 6.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.8 | 23 / 35 | 5154 |
| 2 | 1 | 69.2 | 92.1 | 21 / 35 | 4882 |
| 3 | 1 | 68.0 | 86.7 | 22 / 35 | 5065 |
| 4 | 1 | 68.8 | 91.1 | 23 / 35 | 4917 |
| 5 | 1 | 70.3 | 94.9 | 28 / 35 | 5146 |
| 6 | 1 | 67.8 | 88.9 | 22 / 35 | 4511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 43 | 79% |
| shrub.Vapour v159 | 39 | 82% |
| Krabb.sliNk.Garm 0.9u | 30 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 90% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 82% |
| m3thos.Eva00 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| SHAM.WOW 1.4 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 19 | 26% | 58 |
| shrub.Vapour v159 | 18 | 24% | 50 |
| Krabb.sliNk.Garm 0.9u | 16 | 22% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 9% | 25 |
| m3thos.Eva00 1.1 | 5 | 7% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 5% | 19 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 3 |
| SHAM.WOW 1.4 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 5 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 77.8 | 81 / 210 | 3.00 | 16.0% | 23542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 16.4% | 81 |
| hadur117.mini.DeiseD 0.4 | 1.5 | 16.0% | 81 |
| kc.micro.Figment 1.0 | 3.0 | 14.0% | 27 |
| yagami.Tidus 0.11 | 4.2 | 11.2% | 3 |
| mc2.enemy.Original 0.9 | 5.3 | 9.9% | 8 |
| pedersen.Grishnakh 1.0 | 5.5 | 9.6% | 10 |
| dft.Calliope 5.6 | 7.3 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 77.8 | 11 / 35 | 3895 |
| 2 | 1 | 65.0 | 79.0 | 15 / 35 | 3927 |
| 3 | 1 | 65.7 | 80.6 | 15 / 35 | 4039 |
| 4 | 2 | 63.9 | 73.7 | 12 / 35 | 4155 |
| 5 | 1 | 66.2 | 83.2 | 16 / 35 | 3874 |
| 6 | 2 | 62.7 | 72.4 | 12 / 35 | 3652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 58 | 41% |
| kc.micro.Figment 1.0 | 41 | 85% |
| yagami.Tidus 0.11 | 9 | 100% |
| mc2.enemy.Original 0.9 | 7 | 100% |
| pedersen.Grishnakh 1.0 | 5 | 60% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 51 | 40% | 76 |
| kc.micro.Figment 1.0 | 30 | 23% | 66 |
| yagami.Tidus 0.11 | 14 | 11% | 21 |
| pedersen.Grishnakh 1.0 | 11 | 9% | 14 |
| mc2.enemy.Original 0.9 | 10 | 8% | 17 |
| robar.nano.Assertive_Melee 0.2 | 7 | 5% | 8 |
| dft.Calliope 5.6 | 3 | 2% | 5 |
| step.nanoPri 1.0 | 2 | 2% | 2 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 95.3 | 171 / 210 | 1.42 | 20.4% | 32222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.4% | 171 |
| DTF.Kludgy 1.2b | 2.2 | 14.0% | 18 |
| ejb.Polaris 1.0.1 | 3.5 | 11.9% | 6 |
| ne.Chimera 1.2 | 3.5 | 12.5% | 6 |
| vStar.RAFzilla 2.15 | 5.2 | 10.2% | 3 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.0% | 5 |
| sam.Samspin 1.0 | 7.7 | 5.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.5% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 93.3 | 25 / 35 | 5324 |
| 2 | 1 | 71.1 | 95.6 | 30 / 35 | 5585 |
| 3 | 1 | 70.8 | 94.0 | 27 / 35 | 5519 |
| 4 | 1 | 70.6 | 95.6 | 30 / 35 | 5148 |
| 5 | 1 | 71.4 | 98.1 | 31 / 35 | 5300 |
| 6 | 1 | 70.7 | 95.2 | 28 / 35 | 5346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 55 | 85% |
| ejb.Polaris 1.0.1 | 49 | 96% |
| ne.Chimera 1.2 | 31 | 90% |
| tvv.micro.Antares 1.1.1 | 19 | 89% |
| vStar.RAFzilla 2.15 | 16 | 94% |
| kurios.DOSexe .9b | 8 | 100% |
| donjezza.Muncho 1.0 | 4 | 75% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 40% | 60 |
| ejb.Polaris 1.0.1 | 6 | 15% | 51 |
| tvv.micro.Antares 1.1.1 | 6 | 15% | 19 |
| ne.Chimera 1.2 | 5 | 13% | 34 |
| vStar.RAFzilla 2.15 | 2 | 5% | 19 |
| donjezza.Muncho 1.0 | 2 | 5% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 5% | 3 |
| sam.Samspin 1.0 | 1 | 3% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 12 |

## Melee bench: F11

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.3 | 109 / 210 | 2.32 | 17.7% | 25490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 17.7% | 109 |
| rz.Aleph 0.34 | 1.8 | 16.2% | 50 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.2% | 16 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 11 |
| br2.MobyDickBot 1.6 | 5.8 | 8.8% | 9 |
| rdt199.Warlord 0.73 | 5.8 | 8.7% | 9 |
| uji.YellohFellah 1.0 | 6.3 | 8.4% | 8 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 79.7 | 13 / 35 | 4155 |
| 2 | 1 | 67.5 | 87.9 | 18 / 35 | 4109 |
| 3 | 1 | 68.3 | 89.5 | 20 / 35 | 4579 |
| 4 | 1 | 66.4 | 82.5 | 18 / 35 | 4388 |
| 5 | 1 | 67.5 | 87.3 | 20 / 35 | 4277 |
| 6 | 1 | 66.8 | 85.1 | 20 / 35 | 3982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 63 | 62% |
| cx.mini.Nimrod 0.55 | 24 | 83% |
| djc.DynaBot 0.1.1 | 19 | 95% |
| uji.YellohFellah 1.0 | 15 | 80% |
| rdt199.Warlord 0.73 | 13 | 77% |
| br2.MobyDickBot 1.6 | 10 | 70% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 50 | 49% | 94 |
| cx.mini.Nimrod 0.55 | 18 | 17% | 35 |
| br2.MobyDickBot 1.6 | 8 | 8% | 17 |
| rdt199.Warlord 0.73 | 7 | 7% | 21 |
| djc.DynaBot 0.1.1 | 7 | 7% | 20 |
| uji.YellohFellah 1.0 | 6 | 6% | 14 |
| stelo.MirrorNano 1.3 | 2 | 2% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |
| KiraNL.Chupacabra 0.4 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.3 | 138 / 210 | 2.05 | 18.5% | 24506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.5% | 138 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.1% | 29 |
| darkcanuck.Leon 1.01 | 3.0 | 12.5% | 15 |
| nat.PallasHawk 1.0 | 3.7 | 12.0% | 20 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.9% | 3 |
| jrm.Test0 1.0 | 6.5 | 8.2% | 0 |
| jp.Perpy 16.0 | 7.2 | 6.9% | 1 |
| cs.sheldor.Talon 1.1 | 8.0 | 6.8% | 1 |
| jaybot.bots.Oddball 4.0 | 8.3 | 6.2% | 3 |
| stuff.Vlad 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 89.5 | 23 / 35 | 3734 |
| 2 | 1 | 69.1 | 92.1 | 27 / 35 | 3963 |
| 3 | 1 | 67.0 | 84.1 | 20 / 35 | 4179 |
| 4 | 1 | 67.7 | 87.6 | 19 / 35 | 4348 |
| 5 | 1 | 67.1 | 84.1 | 22 / 35 | 4163 |
| 6 | 1 | 69.7 | 92.4 | 27 / 35 | 4119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 54 | 81% |
| darkcanuck.Leon 1.01 | 43 | 88% |
| nat.PallasHawk 1.0 | 38 | 87% |
| brainfade.melee.Genghis 0.36 | 9 | 89% |
| jaybot.bots.Oddball 4.0 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 21 | 29% | 51 |
| nat.PallasHawk 1.0 | 19 | 26% | 51 |
| darkcanuck.Leon 1.01 | 12 | 16% | 61 |
| jaybot.bots.Oddball 4.0 | 6 | 8% | 11 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 11 |
| brainfade.melee.Genghis 0.36 | 4 | 5% | 12 |
| jrm.Test0 1.0 | 4 | 5% | 10 |
| jp.Perpy 16.0 | 1 | 1% | 1 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.7 | 84 / 210 | 2.38 | 16.6% | 25197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.5% | 71 |
| ags.Glacier 0.2.11 | 2.0 | 16.0% | 36 |
| hadur117.mini.DeiseD 0.4 | 2.2 | 16.6% | 84 |
| shinh.Entangled 0.3 | 4.3 | 11.8% | 12 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 7 |
| apc.Colossus2 0.17 | 6.3 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.7 | 6.7% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.2 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.3 | 84.8 | 13 / 35 | 4135 |
| 2 | 3 | 64.6 | 76.2 | 14 / 35 | 4205 |
| 3 | 3 | 65.6 | 85.1 | 12 / 35 | 3879 |
| 4 | 1 | 67.0 | 86.3 | 14 / 35 | 4474 |
| 5 | 2 | 66.7 | 89.2 | 14 / 35 | 4149 |
| 6 | 1 | 67.3 | 86.3 | 17 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 62 | 45% |
| ags.Glacier 0.2.11 | 54 | 67% |
| shinh.Entangled 0.3 | 19 | 79% |
| gh.micro.Gruweltje 0.7 | 3 | 67% |
| stelo.Wang 1.0 | 3 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 48 | 38% | 81 |
| ags.Glacier 0.2.11 | 38 | 30% | 69 |
| gh.micro.Gruweltje 0.7 | 15 | 12% | 18 |
| shinh.Entangled 0.3 | 13 | 10% | 28 |
| stelo.Wang 1.0 | 7 | 6% | 10 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 2 | 2% | 1 |

## Melee bench: F14

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.8 | 144 / 210 | 1.65 | 19.7% | 31983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.7% | 144 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.7% | 37 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.6% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 8.9% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.8% | 6 |
| pa.Improved 1.0 | 9.0 | 5.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 95.2 | 27 / 35 | 5753 |
| 2 | 1 | 69.3 | 89.8 | 21 / 35 | 5124 |
| 3 | 1 | 69.7 | 91.7 | 21 / 35 | 5293 |
| 4 | 1 | 70.4 | 94.9 | 26 / 35 | 5227 |
| 5 | 1 | 69.8 | 92.7 | 24 / 35 | 5169 |
| 6 | 1 | 69.9 | 92.1 | 25 / 35 | 5417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 83 | 83% |
| catcat20.shape.Theta 0.018 | 56 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 92% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 33 | 50% | 98 |
| catcat20.shape.Theta 0.018 | 20 | 30% | 57 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 9% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 16 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F15

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.2 | 99 / 210 | 2.51 | 18.0% | 30793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.0% | 99 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.2% | 27 |
| emp.Yngwie 1.11 | 3.3 | 12.8% | 43 |
| mld.DustBunny 3.8 | 4.3 | 11.7% | 10 |
| cb.nano.Insomnia 1.0 | 4.5 | 11.6% | 12 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.1% | 18 |
| lambdaxy.TBot 0.1 | 7.5 | 6.3% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.0% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.9% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.8 | 18 / 35 | 5126 |
| 2 | 1 | 68.4 | 84.1 | 18 / 35 | 5411 |
| 3 | 1 | 66.7 | 80.6 | 15 / 35 | 5064 |
| 4 | 1 | 68.0 | 85.4 | 17 / 35 | 4964 |
| 5 | 1 | 68.0 | 85.4 | 15 / 35 | 5079 |
| 6 | 1 | 66.7 | 80.0 | 16 / 35 | 5149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 36 | 64% |
| kawigi.micro.Shiz 1.1 | 32 | 84% |
| kawigi.robot.Girl 1.2 | 20 | 75% |
| cb.nano.Insomnia 1.0 | 18 | 61% |
| mld.DustBunny 3.8 | 18 | 100% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 32% | 65 |
| kawigi.micro.Shiz 1.1 | 19 | 17% | 46 |
| cb.nano.Insomnia 1.0 | 18 | 16% | 18 |
| kawigi.robot.Girl 1.2 | 16 | 14% | 22 |
| mld.DustBunny 3.8 | 12 | 11% | 38 |
| divineomega.TrialBot 0.003 | 6 | 5% | 12 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| lambdaxy.TBot 0.1 | 1 | 1% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.0 | 103 / 210 | 2.26 | 18.7% | 32547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 18.7% | 103 |
| gh.Griezel 0.5.2 | 2.0 | 16.7% | 61 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.5% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.6% | 33 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.3% | 2 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.4% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.0% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 4.8% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.2 | 20 / 35 | 5414 |
| 2 | 2 | 65.6 | 74.9 | 9 / 35 | 5191 |
| 3 | 1 | 68.1 | 83.5 | 18 / 35 | 5297 |
| 4 | 1 | 69.5 | 87.9 | 20 / 35 | 5449 |
| 5 | 1 | 70.1 | 91.1 | 18 / 35 | 5676 |
| 6 | 1 | 69.7 | 89.2 | 18 / 35 | 5520 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 81 | 60% |
| techdude.forest.FlamingForest 1.1 | 22 | 55% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 95% |
| bvh.fnr.Fenrir 0.36l | 9 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1286. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 56 | 52% | 112 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 16% | 31 |
| techdude.forest.FlamingForest 1.1 | 14 | 13% | 25 |
| bvh.fnr.Fenrir 0.36l | 9 | 8% | 15 |
| divineomega.DivineBot 1.9.4.5 | 8 | 7% | 14 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 7 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 4 |
| asd.Cthulhu 1.3 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.5 | 111 / 210 | 2.48 | 17.9% | 29686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.9% | 111 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.3% | 33 |
| et.Predator 1.8 | 2.8 | 13.3% | 24 |
| cx.BlestPain 1.41 | 3.8 | 11.6% | 28 |
| nic.Nicator 2.4 | 5.0 | 11.0% | 8 |
| ahf.NanoAndrew .4 | 5.8 | 10.3% | 6 |
| maribo.melee.BMV 0.1 | 7.0 | 9.0% | 1 |
| tex.Longbot 0.4 | 8.3 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 77.8 | 14 / 35 | 4624 |
| 2 | 1 | 68.2 | 86.3 | 18 / 35 | 4988 |
| 3 | 1 | 67.7 | 85.7 | 20 / 35 | 4790 |
| 4 | 1 | 66.9 | 77.5 | 18 / 35 | 5274 |
| 5 | 1 | 69.3 | 90.8 | 26 / 35 | 4778 |
| 6 | 1 | 67.4 | 83.2 | 15 / 35 | 5232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 51 | 76% |
| oog.melee.Mercutio 1.0 | 36 | 72% |
| cx.BlestPain 1.41 | 23 | 70% |
| nic.Nicator 2.4 | 20 | 100% |
| ahf.NanoAndrew .4 | 8 | 88% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 25 | 25% | 59 |
| oog.melee.Mercutio 1.0 | 20 | 20% | 49 |
| cx.BlestPain 1.41 | 17 | 17% | 33 |
| nic.Nicator 2.4 | 16 | 16% | 37 |
| ahf.NanoAndrew .4 | 11 | 11% | 17 |
| tex.Longbot 0.4 | 4 | 4% | 5 |
| maribo.melee.BMV 0.1 | 4 | 4% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.0 | 128 / 210 | 1.99 | 18.8% | 27204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.8% | 128 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.8% | 36 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.2% | 24 |
| uji.DBH 1.1 | 4.3 | 10.4% | 8 |
| spinnercat.Robovirus 2.718 | 5.2 | 9.9% | 3 |
| ratosh.Nobo 0.21 | 5.5 | 9.7% | 4 |
| sigterm.Sigterm 1.0 | 7.2 | 7.9% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 1 |
| stelo.WangRobot 1.0 | 9.0 | 5.6% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 95.9 | 29 / 35 | 4632 |
| 2 | 1 | 68.9 | 89.8 | 22 / 35 | 4727 |
| 3 | 1 | 68.1 | 89.2 | 21 / 35 | 4367 |
| 4 | 1 | 67.0 | 86.0 | 17 / 35 | 4392 |
| 5 | 1 | 67.3 | 85.4 | 19 / 35 | 4583 |
| 6 | 1 | 67.7 | 87.9 | 20 / 35 | 4503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 57 | 67% |
| agd.Mooserwirt2 2.7 | 35 | 74% |
| uji.DBH 1.1 | 25 | 88% |
| sigterm.Sigterm 1.0 | 16 | 94% |
| spinnercat.Robovirus 2.718 | 13 | 85% |
| ratosh.Nobo 0.21 | 9 | 100% |
| stelo.WangRobot 1.0 | 5 | 80% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 31 | 38% | 70 |
| agd.Mooserwirt2 2.7 | 16 | 20% | 53 |
| ratosh.Nobo 0.21 | 11 | 13% | 17 |
| uji.DBH 1.1 | 7 | 9% | 20 |
| spinnercat.Robovirus 2.718 | 6 | 7% | 21 |
| sigterm.Sigterm 1.0 | 5 | 6% | 13 |
| stelo.WangRobot 1.0 | 3 | 4% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 7 |

## Melee bench: F19

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 96.0 | 175 / 210 | 1.36 | 21.0% | 33208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 21.0% | 175 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.6% | 8 |
| mld.Infinity 2.2 | 2.8 | 14.1% | 21 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.0% | 1 |
| erdnis.Rover 0.3 | 4.7 | 10.6% | 4 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.4% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.3% | 0 |
| pac.ABC 2.1 | 7.7 | 6.7% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 96.8 | 30 / 35 | 5622 |
| 2 | 1 | 72.4 | 97.1 | 30 / 35 | 5825 |
| 3 | 1 | 72.1 | 96.2 | 27 / 35 | 5384 |
| 4 | 1 | 71.4 | 94.0 | 28 / 35 | 5430 |
| 5 | 1 | 71.5 | 94.3 | 29 / 35 | 5282 |
| 6 | 1 | 72.3 | 97.5 | 31 / 35 | 5665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 88 | 98% |
| mld.Infinity 2.2 | 56 | 80% |
| krillr.mini.JointStrike 2.0.0 | 16 | 100% |
| erdnis.Rover 0.3 | 11 | 82% |
| pac.ABC 2.1 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 1352. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 12 | 34% | 114 |
| mld.Infinity 2.2 | 12 | 34% | 24 |
| erdnis.Rover 0.3 | 5 | 14% | 18 |
| krillr.mini.JointStrike 2.0.0 | 3 | 9% | 17 |
| patson.PatsonTestBot 1.0 | 3 | 9% | 14 |
| mbh.Mbh 0.1 | 0 | 0% | 8 |
| pac.ABC 2.1 | 0 | 0% | 7 |
| pbg.R2D2 1.0 | 0 | 0% | 4 |

## Melee bench: F20

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.4 | 130 / 210 | 1.87 | 19.6% | 32588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.6% | 130 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 40 |
| fwb.Nine 1.0.1 | 3.7 | 11.2% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.8% | 4 |
| catcat20.Rabbit 0.001 | 4.2 | 10.9% | 21 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.0% | 0 |
| bayen.nut.Squirrel 1.615 | 6.7 | 7.5% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.7% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.3 | 26 / 35 | 5980 |
| 2 | 1 | 69.4 | 89.5 | 21 / 35 | 5501 |
| 3 | 1 | 68.5 | 90.5 | 16 / 35 | 5002 |
| 4 | 1 | 69.3 | 90.8 | 19 / 35 | 5266 |
| 5 | 1 | 70.0 | 90.5 | 25 / 35 | 5561 |
| 6 | 1 | 69.2 | 87.6 | 23 / 35 | 5278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 77 | 73% |
| fwb.Nine 1.0.1 | 32 | 78% |
| catcat20.Rabbit 0.001 | 25 | 72% |
| nz.jdc.nano.GridFu 1.0 | 17 | 100% |
| bayen.nut.Squirrel 1.615 | 10 | 80% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1152. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 40 | 49% | 95 |
| catcat20.Rabbit 0.001 | 20 | 24% | 41 |
| fwb.Nine 1.0.1 | 13 | 16% | 21 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 12 |
| nz.jdc.nano.GridFu 1.0 | 2 | 2% | 26 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 2 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.6 | 127 / 210 | 1.76 | 19.9% | 33318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.9% | 127 |
| eem.EvBot v4.6.16 | 2.0 | 16.9% | 71 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 2 |
| eld.Hmm 1.0 | 5.5 | 7.8% | 2 |
| oa.weak.BotherBot 0.1 | 5.5 | 7.9% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.8% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.7 | 19 / 35 | 5168 |
| 2 | 1 | 70.4 | 92.4 | 19 / 35 | 5912 |
| 3 | 1 | 72.0 | 95.9 | 26 / 35 | 5762 |
| 4 | 1 | 70.7 | 93.0 | 22 / 35 | 5586 |
| 5 | 1 | 70.8 | 94.6 | 22 / 35 | 5728 |
| 6 | 1 | 68.9 | 87.0 | 19 / 35 | 5162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 120 | 62% |
| dummy.mini.Scimitar 1.01 | 32 | 88% |
| cf.RiO.RiOx 4.2.1 | 14 | 100% |
| eld.Hmm 1.0 | 8 | 88% |
| el.JumpShoot 0.2 | 2 | 100% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 1461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 52 | 61% | 96 |
| dummy.mini.Scimitar 1.01 | 15 | 18% | 54 |
| cf.RiO.RiOx 4.2.1 | 12 | 14% | 30 |
| eld.Hmm 1.0 | 2 | 2% | 20 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 7 |
| PSW.Relentless 0.1 | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.6 | 114 / 210 | 1.94 | 18.8% | 30072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.8% | 114 |
| pe.SandboxDT 2.71m | 2.2 | 16.1% | 53 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.2% | 22 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.1% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 1 |
| gg.Squaraus 0.6 | 7.0 | 6.2% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.4% | 0 |
| yk.JahRoslav 1.1 | 7.2 | 6.5% | 1 |
| pbg.NinjaX 1.2 | 8.7 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.1 | 22 / 35 | 5103 |
| 2 | 1 | 68.8 | 89.5 | 21 / 35 | 4619 |
| 3 | 1 | 69.6 | 90.2 | 21 / 35 | 5004 |
| 4 | 1 | 68.8 | 87.3 | 18 / 35 | 5279 |
| 5 | 1 | 69.2 | 90.8 | 16 / 35 | 5096 |
| 6 | 1 | 68.9 | 87.6 | 16 / 35 | 4971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 51 | 49% |
| jlm.javaDisturbance 0.59 | 46 | 87% |
| kvk.HebusLeTroll 0.35 | 43 | 84% |
| bigpete.Stewie 1.0 | 10 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 37 | 39% | 69 |
| kvk.HebusLeTroll 0.35 | 35 | 36% | 66 |
| jlm.javaDisturbance 0.59 | 21 | 22% | 55 |
| tad.Dalek98 0.98 | 2 | 2% | 2 |
| bigpete.Stewie 1.0 | 1 | 1% | 15 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.3 | 156 / 210 | 1.51 | 20.3% | 29780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.3% | 156 |
| pe.SandboxLump 1.52 | 2.0 | 17.1% | 41 |
| cre.Karolos 0.32 | 3.2 | 13.7% | 10 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.7% | 3 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 8.6% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 7.8% | 0 |
| sample.Walls 1.0 | 7.5 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.9 | 25 / 35 | 4731 |
| 2 | 1 | 71.1 | 94.3 | 28 / 35 | 4900 |
| 3 | 1 | 71.8 | 94.9 | 27 / 35 | 5244 |
| 4 | 1 | 72.1 | 95.2 | 28 / 35 | 5333 |
| 5 | 1 | 71.7 | 95.6 | 26 / 35 | 4648 |
| 6 | 1 | 70.4 | 91.1 | 22 / 35 | 4924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 97 | 75% |
| cre.Karolos 0.32 | 44 | 95% |
| stelo.AreaTargetingBot 1.1 | 27 | 96% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| stelo.RamTrackSurfer 1.2 | 3 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 37 | 69% | 106 |
| stelo.AreaTargetingBot 1.1 | 8 | 15% | 29 |
| cre.Karolos 0.32 | 6 | 11% | 48 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 4% | 4 |
| cw.megas.Blade 0.8 | 1 | 2% | 6 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 9 |
| sample.Walls 1.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 79.6 | 93 / 210 | 2.84 | 16.0% | 21968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 16.0% | 93 |
| florent.XSeries.X2 0.12 | 2.3 | 13.4% | 25 |
| rz.GlowBlowMelee 1.4 | 3.3 | 13.3% | 29 |
| davidalves.Phoenix 0.54 | 3.5 | 12.8% | 35 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.8% | 14 |
| oog.melee.Corsair 1.0 | 6.2 | 9.2% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.1% | 11 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 4.7% | 0 |
| evd.X1 0.01 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 74.6 | 10 / 35 | 3325 |
| 2 | 1 | 62.9 | 74.6 | 14 / 35 | 3626 |
| 3 | 1 | 65.9 | 84.8 | 18 / 35 | 3830 |
| 4 | 1 | 65.5 | 81.9 | 17 / 35 | 3640 |
| 5 | 1 | 65.5 | 82.2 | 15 / 35 | 4017 |
| 6 | 1 | 64.6 | 79.4 | 19 / 35 | 3530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 32 | 72% |
| rz.GlowBlowMelee 1.4 | 27 | 78% |
| davidalves.Phoenix 0.54 | 24 | 71% |
| pedersen.Ugluk 1.1.1 | 20 | 65% |
| stelo.SoJNanoMelee 1.1 | 13 | 100% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 30 | 25% | 52 |
| davidalves.Phoenix 0.54 | 26 | 22% | 39 |
| rz.GlowBlowMelee 1.4 | 23 | 19% | 46 |
| pedersen.Ugluk 1.1.1 | 19 | 16% | 33 |
| stelo.SoJNanoMelee 1.1 | 8 | 7% | 15 |
| oog.melee.Corsair 1.0 | 6 | 5% | 16 |
| lunchie.Lunchbox 0.93 | 3 | 3% | 4 |
| as.FrankTheTank 1.3 | 2 | 2% | 3 |
| evd.X1 0.01 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.1 | 146 / 210 | 2.07 | 19.0% | 25782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.0% | 146 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.3% | 17 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.1% | 11 |
| jdw.Hurricane 1.4 | 4.0 | 11.5% | 20 |
| ds.Oo 2.2 | 5.5 | 9.2% | 7 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 8.7% | 6 |
| awesomeness.Elite 1.0 | 7.7 | 7.4% | 1 |
| gjr.Cephalosporin 0.1 | 8.0 | 6.8% | 3 |
| adt.Ar2 1.1 | 8.0 | 6.8% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 91.1 | 24 / 35 | 4101 |
| 2 | 1 | 69.7 | 90.2 | 25 / 35 | 4655 |
| 3 | 1 | 65.1 | 76.5 | 22 / 35 | 3892 |
| 4 | 1 | 70.6 | 92.7 | 28 / 35 | 4706 |
| 5 | 1 | 68.3 | 88.6 | 22 / 35 | 4214 |
| 6 | 1 | 68.9 | 89.8 | 25 / 35 | 4214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 55 | 93% |
| voidious.micro.BlitzBat 1.05 | 44 | 91% |
| jdw.Hurricane 1.4 | 29 | 83% |
| ds.Oo 2.2 | 11 | 82% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| gre.svman4.Morfeas 1.4.1 | 6 | 83% |
| adt.Ar2 1.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 37% | 68 |
| jdw.Hurricane 1.4 | 14 | 22% | 41 |
| voidious.mini.BrokenSword 2.0.3 | 7 | 11% | 49 |
| ds.Oo 2.2 | 6 | 9% | 20 |
| adt.Ar2 1.1 | 4 | 6% | 6 |
| gre.svman4.Morfeas 1.4.1 | 3 | 5% | 10 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 8 |
| awesomeness.Elite 1.0 | 2 | 3% | 5 |
| amk.ChumbaMini 0.2 | 2 | 3% | 2 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.7 | 127 / 210 | 2.02 | 18.9% | 31952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.9% | 127 |
| ak.Fermat 2.0 | 2.2 | 14.3% | 31 |
| lrem.Spectre 0.4.4 | 3.5 | 12.1% | 14 |
| shu.nitro.LENIN .T34 | 3.8 | 12.1% | 27 |
| js.PinBall 1.6 | 5.0 | 10.7% | 6 |
| gh.mini.GrubbmOne 1.0 | 5.8 | 9.6% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.2% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.4% | 3 |
| sample.SpinBot 1.0 | 8.8 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.6 | 18 / 35 | 5225 |
| 2 | 1 | 68.9 | 88.3 | 21 / 35 | 5205 |
| 3 | 1 | 69.4 | 90.5 | 23 / 35 | 5391 |
| 4 | 1 | 69.5 | 89.2 | 22 / 35 | 5499 |
| 5 | 1 | 68.5 | 85.7 | 19 / 35 | 5522 |
| 6 | 1 | 69.6 | 90.8 | 24 / 35 | 5110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 46 | 74% |
| ak.Fermat 2.0 | 44 | 64% |
| lrem.Spectre 0.4.4 | 40 | 88% |
| js.PinBall 1.6 | 12 | 92% |
| gh.mini.GrubbmOne 1.0 | 9 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 28 | 33% | 55 |
| shu.nitro.LENIN .T34 | 23 | 27% | 58 |
| lrem.Spectre 0.4.4 | 14 | 17% | 37 |
| js.PinBall 1.6 | 13 | 15% | 25 |
| gh.mini.GrubbmOne 1.0 | 4 | 5% | 13 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 1% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 10 |
| sample.SpinBot 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.9 | 129 / 210 | 2.18 | 18.7% | 27917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.7% | 129 |
| mk.Alpha 0.2.1 | 2.5 | 13.6% | 37 |
| wee.Gem 1.8.4 | 2.8 | 12.4% | 24 |
| EH.Eagle 1.0.6 | 4.0 | 10.7% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 10.9% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.4% | 0 |
| throxbot.ThroxBot 0.1 | 6.8 | 7.9% | 1 |
| joe.ADinosaur 1.0 | 7.8 | 7.3% | 0 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.2% | 1 |
| cs.Grudge 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 92.7 | 25 / 35 | 4305 |
| 2 | 1 | 67.0 | 88.9 | 22 / 35 | 3757 |
| 3 | 1 | 67.3 | 89.2 | 21 / 35 | 3914 |
| 4 | 1 | 70.7 | 85.7 | 21 / 35 | 6214 |
| 5 | 1 | 68.1 | 78.4 | 18 / 35 | 5559 |
| 6 | 1 | 67.3 | 86.7 | 22 / 35 | 4168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 60 | 87% |
| wee.Gem 1.8.4 | 42 | 76% |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 76% |
| EH.Eagle 1.0.6 | 18 | 89% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 22 | 27% | 70 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 20% | 33 |
| wee.Gem 1.8.4 | 15 | 19% | 47 |
| EH.Eagle 1.0.6 | 8 | 10% | 23 |
| throxbot.ThroxBot 0.1 | 6 | 7% | 9 |
| joe.ADinosaur 1.0 | 5 | 6% | 6 |
| caimano.Furia_Ceca 0.22 | 4 | 5% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 10 |
| cs.Grudge 1.0 | 2 | 2% | 2 |

## Melee bench: F28

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.2 | 140 / 210 | 1.89 | 18.9% | 25709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.9% | 140 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 29 |
| uji.Antique 1.0 | 3.3 | 11.8% | 21 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.7% | 8 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.7% | 6 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.5% | 3 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.9% | 1 |
| matt.advanced.Katana 1.0 | 8.3 | 6.2% | 1 |
| stelo.PianistNano 1.2 | 9.2 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 94.0 | 26 / 35 | 4678 |
| 2 | 1 | 68.3 | 90.8 | 21 / 35 | 4068 |
| 3 | 1 | 68.9 | 91.7 | 26 / 35 | 4378 |
| 4 | 1 | 67.6 | 87.6 | 23 / 35 | 4113 |
| 5 | 1 | 66.9 | 85.4 | 20 / 35 | 4115 |
| 6 | 1 | 69.1 | 91.4 | 24 / 35 | 4357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 81 | 80% |
| uji.Antique 1.0 | 50 | 82% |
| qohnil.blot.BlotBot 3.61 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| ahr.ice.Ice 1.0.2 | 5 | 80% |
| stelo.PianistNano 1.2 | 4 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 29 | 41% | 90 |
| uji.Antique 1.0 | 12 | 17% | 48 |
| pfvicm.Sobieski 7.2.3b | 11 | 16% | 18 |
| amk.ChumbaWumba 0.3 | 6 | 9% | 11 |
| qohnil.blot.BlotBot 3.61 | 5 | 7% | 25 |
| stelo.Lifestealer 1.0 | 3 | 4% | 5 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 6 |
| stelo.PianistNano 1.2 | 2 | 3% | 5 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.7 | 108 / 210 | 2.38 | 18.3% | 27785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.3% | 108 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.0% | 42 |
| deewiant.Anomaly 0.2 | 3.0 | 14.7% | 38 |
| myl.micro.Troodon 1.10 | 3.7 | 12.5% | 7 |
| jok.PheonixM 0.1.2 | 5.2 | 9.9% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.9% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 7.2% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.8% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.5% | 0 |
| ap.Frederick 1.1 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.8 | 21 / 35 | 5009 |
| 2 | 1 | 68.6 | 85.1 | 19 / 35 | 4811 |
| 3 | 1 | 69.8 | 89.2 | 20 / 35 | 4955 |
| 4 | 1 | 66.3 | 80.3 | 14 / 35 | 4312 |
| 5 | 1 | 66.8 | 81.9 | 17 / 35 | 4272 |
| 6 | 1 | 67.4 | 81.6 | 17 / 35 | 4426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 58 | 78% |
| zyx.mega.YersiniaPestis 3.1 | 47 | 62% |
| myl.micro.Troodon 1.10 | 21 | 100% |
| jok.PheonixM 0.1.2 | 7 | 100% |
| DBall.Anarchy 0.1 | 5 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 40 | 39% | 66 |
| deewiant.Anomaly 0.2 | 35 | 34% | 84 |
| myl.micro.Troodon 1.10 | 15 | 15% | 33 |
| jok.PheonixM 0.1.2 | 10 | 10% | 18 |
| DBall.Anarchy 0.1 | 1 | 1% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 2 |

## Melee bench: F30

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 74.4 | 54 / 210 | 3.30 | 14.6% | 21644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.7 | 14.6% | 54 |
| darkcanuck.B26354 1.06 | 3.0 | 13.4% | 36 |
| catcat20.Matcha 0.006 | 3.2 | 13.5% | 43 |
| oog.melee.Capulet 1.2 | 3.3 | 13.5% | 38 |
| stelo.PastFuture 2.3.2 | 3.8 | 13.1% | 30 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.4% | 3 |
| ntc.Opposite 1.5 | 7.0 | 7.6% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 6.8% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.7 | 6.6% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 76.8 | 10 / 35 | 3796 |
| 2 | 4 | 61.5 | 71.1 | 6 / 35 | 3639 |
| 3 | 1 | 62.6 | 74.3 | 11 / 35 | 3521 |
| 4 | 2 | 61.7 | 75.6 | 8 / 35 | 3451 |
| 5 | 1 | 62.7 | 74.9 | 11 / 35 | 3615 |
| 6 | 1 | 62.0 | 73.7 | 8 / 35 | 3622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 26 | 62% |
| stelo.PastFuture 2.3.2 | 20 | 65% |
| oog.melee.Capulet 1.2 | 20 | 60% |
| darkcanuck.B26354 1.06 | 17 | 35% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 0% |

Hadur died in 157 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 38 | 24% | 44 |
| stelo.PastFuture 2.3.2 | 37 | 24% | 43 |
| oog.melee.Capulet 1.2 | 32 | 20% | 50 |
| catcat20.Matcha 0.006 | 24 | 15% | 41 |
| ntc.Opposite 1.5 | 9 | 6% | 11 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 10 |
| tripphippy.Alice 1.1 | 4 | 3% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.7 | 60 / 210 | 3.19 | 15.0% | 20721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 102 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 15.0% | 60 |
| gh.mini.Griezel 0.2 | 3.0 | 13.5% | 38 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.6% | 4 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.4% | 6 |
| gh.nano.Grofvuil 0.2 | 6.5 | 8.4% | 1 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.0% | 0 |
| fm.mammillarias 1.3 | 7.7 | 6.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 73.3 | 9 / 35 | 3397 |
| 2 | 2 | 63.0 | 73.7 | 10 / 35 | 3607 |
| 3 | 2 | 63.1 | 76.2 | 10 / 35 | 3316 |
| 4 | 2 | 63.0 | 76.2 | 10 / 35 | 3552 |
| 5 | 2 | 63.2 | 77.1 | 10 / 35 | 3567 |
| 6 | 2 | 63.5 | 77.8 | 11 / 35 | 3282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 55% |
| gh.mini.Griezel 0.2 | 24 | 54% |
| spinnercat.micro.Tyger 0.1 | 11 | 91% |
| d414.nano.Quantum 1.0.0 | 6 | 83% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 56 | 37% | 82 |
| gh.mini.Griezel 0.2 | 41 | 27% | 56 |
| spinnercat.micro.Tyger 0.1 | 23 | 15% | 29 |
| d414.nano.Quantum 1.0.0 | 15 | 10% | 22 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 8 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 6 |
| fm.mammillarias 1.3 | 4 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 89.6 | 129 / 210 | 1.93 | 18.7% | 28535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.7% | 129 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 52 |
| apc.botM 3.0 | 3.2 | 12.1% | 18 |
| lxx.ConceptA 0.8 | 4.2 | 11.0% | 3 |
| bayen.UbaMicro 1.4 | 5.3 | 8.8% | 2 |
| vjik.UnViolation 1.1 | 6.0 | 8.7% | 3 |
| panzer.Panzer 0.2 | 7.0 | 7.8% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 1 |
| conscience.Electron 1.3g | 8.8 | 5.6% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.2 | 25 / 35 | 4810 |
| 2 | 1 | 67.9 | 89.2 | 21 / 35 | 4585 |
| 3 | 1 | 68.0 | 89.5 | 22 / 35 | 4383 |
| 4 | 1 | 70.3 | 96.2 | 26 / 35 | 5314 |
| 5 | 1 | 67.3 | 87.0 | 18 / 35 | 4670 |
| 6 | 1 | 67.1 | 85.7 | 17 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 83 | 65% |
| lxx.ConceptA 0.8 | 30 | 93% |
| apc.botM 3.0 | 23 | 83% |
| bayen.UbaMicro 1.4 | 13 | 85% |
| donjezza.Jezza 1.0 | 6 | 83% |
| yk.JahMicro 1.0 | 6 | 100% |
| vjik.UnViolation 1.1 | 5 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 45 | 56% | 97 |
| lxx.ConceptA 0.8 | 13 | 16% | 27 |
| apc.botM 3.0 | 9 | 11% | 37 |
| bayen.UbaMicro 1.4 | 6 | 7% | 11 |
| vjik.UnViolation 1.1 | 2 | 2% | 19 |
| yk.JahMicro 1.0 | 2 | 2% | 9 |
| panzer.Panzer 0.2 | 2 | 2% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
| conscience.Electron 1.3g | 1 | 1% | 1 |

## Melee bench: F33

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.0 | 135 / 210 | 1.99 | 19.5% | 30577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.5% | 135 |
| maribo.Quester 0.3 | 2.0 | 15.5% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 11.8% | 12 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.2% | 11 |
| labg.Cataclysm 2.05 | 4.3 | 10.5% | 19 |
| baal.nano.N 1.42 | 6.3 | 8.4% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.4% | 6 |
| zyx.micro.Ant 1.1 | 8.2 | 5.7% | 0 |
| sanja.First 0.1 | 8.8 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.5 | 25 / 35 | 4906 |
| 2 | 1 | 70.9 | 92.4 | 25 / 35 | 5587 |
| 3 | 1 | 68.3 | 86.3 | 19 / 35 | 4690 |
| 4 | 1 | 68.8 | 87.0 | 22 / 35 | 4841 |
| 5 | 1 | 69.1 | 86.3 | 21 / 35 | 5153 |
| 6 | 1 | 70.5 | 91.7 | 23 / 35 | 5400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 55 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 88% |
| gre.svman4.Leonidas 1.3.2 | 32 | 94% |
| labg.Cataclysm 2.05 | 24 | 71% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 90% |
| baal.nano.N 1.42 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 31 | 41% | 92 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 19% | 42 |
| labg.Cataclysm 2.05 | 12 | 16% | 27 |
| gre.svman4.Leonidas 1.3.2 | 10 | 13% | 28 |
| baal.nano.N 1.42 | 3 | 4% | 7 |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 4% | 6 |
| sanja.First 0.1 | 1 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.4 | 85 / 210 | 2.31 | 17.4% | 27702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.5 | 17.4% | 85 |
| kid.Gladiator .7.2 | 2.2 | 16.3% | 45 |
| stelo.Spread 0.9 | 2.3 | 16.6% | 65 |
| tcf.Reach 3 | 4.3 | 10.7% | 3 |
| jcs.Seth 1.8 | 4.8 | 10.9% | 9 |
| cli.Dancer 1.1 | 5.8 | 9.5% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.8% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 86.0 | 14 / 35 | 4491 |
| 2 | 1 | 68.0 | 86.7 | 15 / 35 | 4523 |
| 3 | 1 | 67.8 | 87.3 | 15 / 35 | 4617 |
| 4 | 2 | 66.9 | 81.6 | 14 / 35 | 4595 |
| 5 | 2 | 67.1 | 85.4 | 12 / 35 | 4451 |
| 6 | 1 | 68.3 | 85.4 | 15 / 35 | 5025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 74 | 64% |
| kid.Gladiator .7.2 | 41 | 54% |
| jcs.Seth 1.8 | 10 | 90% |
| tcf.Reach 3 | 4 | 100% |
| cli.Dancer 1.1 | 3 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1042. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 54 | 43% | 70 |
| stelo.Spread 0.9 | 49 | 39% | 94 |
| jcs.Seth 1.8 | 9 | 7% | 17 |
| tcf.Reach 3 | 8 | 6% | 16 |
| ratosh.Wesco 1.4 | 4 | 3% | 5 |
| cli.Dancer 1.1 | 1 | 1% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 79.8 | 34 / 210 | 2.82 | 14.8% | 19524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.8% | 143 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 14.8% | 34 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.1% | 24 |
| rz.HawkOnFire 0.1 | 4.2 | 12.0% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.6% | 9 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.8% | 0 |
| wit.Chuliath 1.0 | 6.7 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 81.6 | 5 / 35 | 3333 |
| 2 | 2 | 62.6 | 77.5 | 5 / 35 | 3354 |
| 3 | 2 | 63.8 | 82.2 | 4 / 35 | 3258 |
| 4 | 2 | 63.1 | 80.3 | 8 / 35 | 3265 |
| 5 | 2 | 61.6 | 73.3 | 4 / 35 | 3254 |
| 6 | 2 | 63.9 | 83.8 | 8 / 35 | 3060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 80 | 18% |
| gh.mini.Gruwel 0.9 | 18 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 60% |
| rz.HawkOnFire 0.1 | 4 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 88 | 49% | 101 |
| gh.mini.Gruwel 0.9 | 30 | 17% | 40 |
| rz.HawkOnFire 0.1 | 27 | 15% | 33 |
| dmh.robocode.robot.BlackDeath 9.2 | 22 | 12% | 27 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 5 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.6 | 175 / 210 | 1.49 | 21.3% | 33062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 21.3% | 175 |
| bzdp.Pansy 2.1 | 3.0 | 11.8% | 8 |
| alpha.RainingFire 1.0 | 3.2 | 11.5% | 9 |
| bvh.micro.Freya 0.3 | 4.7 | 10.4% | 7 |
| mz.Cork 0.1 | 4.8 | 10.3% | 6 |
| bvh.mini.Fenrir 0.39 | 5.5 | 10.0% | 1 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.5% | 1 |
| dl.BetterWalls 1.0 | 8.3 | 5.8% | 2 |
| squidM.TentalceMeleeNano 1.1 | 9.3 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.1 | 25 / 35 | 5317 |
| 2 | 1 | 71.3 | 94.3 | 29 / 35 | 5433 |
| 3 | 1 | 72.2 | 98.1 | 33 / 35 | 5268 |
| 4 | 1 | 72.2 | 95.6 | 29 / 35 | 6175 |
| 5 | 1 | 71.3 | 92.1 | 28 / 35 | 5509 |
| 6 | 1 | 72.0 | 96.2 | 31 / 35 | 5360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 98% |
| bvh.mini.Fenrir 0.39 | 30 | 100% |
| mz.Cork 0.1 | 29 | 90% |
| bvh.micro.Freya 0.3 | 27 | 93% |
| alpha.RainingFire 1.0 | 22 | 86% |
| m3thos.Eva02 0.7.1 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 10 | 29% | 32 |
| bvh.micro.Freya 0.3 | 8 | 23% | 26 |
| bzdp.Pansy 2.1 | 6 | 17% | 60 |
| bvh.mini.Fenrir 0.39 | 5 | 14% | 21 |
| mz.Cork 0.1 | 4 | 11% | 25 |
| m3thos.Eva02 0.7.1 | 2 | 6% | 29 |
| dl.BetterWalls 1.0 | 0 | 0% | 7 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F37

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 95.1 | 183 / 210 | 1.44 | 20.7% | 34610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.7% | 183 |
| germ.TheMind .2 | 2.2 | 11.0% | 5 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.1% | 2 |
| EBBU.Sim2 1.02 | 3.7 | 9.8% | 3 |
| agrach.Dalek 1.0 | 6.3 | 8.4% | 4 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.4% | 5 |
| mb.Beast 0.1 | 7.8 | 7.9% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 8.0% | 0 |
| lmk.ACPFinal 0.1 | 8.0 | 8.0% | 3 |
| skm.Ryubot 1.0 | 8.3 | 7.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 93.3 | 28 / 35 | 5804 |
| 2 | 1 | 71.3 | 97.8 | 31 / 35 | 6183 |
| 3 | 1 | 69.1 | 91.4 | 27 / 35 | 5669 |
| 4 | 1 | 70.2 | 95.6 | 32 / 35 | 5446 |
| 5 | 1 | 70.0 | 92.7 | 30 / 35 | 5895 |
| 6 | 1 | 71.2 | 100.0 | 35 / 35 | 5613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 45 | 98% |
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 100% |
| EBBU.Sim2 1.02 | 26 | 92% |
| skm.Ryubot 1.0 | 23 | 100% |
| stelo.UntouchableNano 1.3 | 20 | 85% |
| mb.Beast 0.1 | 19 | 95% |
| lmk.ACPFinal 0.1 | 14 | 93% |
| agrach.Dalek 1.0 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 6 | 21% | 23 |
| germ.TheMind .2 | 5 | 17% | 43 |
| stelo.UntouchableNano 1.3 | 5 | 17% | 24 |
| agrach.Dalek 1.0 | 4 | 14% | 25 |
| EBBU.Sim2 1.02 | 3 | 10% | 25 |
| mb.Beast 0.1 | 2 | 7% | 23 |
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 3% | 33 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 3% | 8 |
| skm.Ryubot 1.0 | 1 | 3% | 3 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.8 | 95 / 210 | 2.55 | 16.8% | 24392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 16.8% | 95 |
| justin.Mallais 14.0 | 2.0 | 15.4% | 61 |
| bvh.mini.Freya 0.55 | 3.2 | 12.7% | 18 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.1% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.7% | 7 |
| cs.Wren 1.0 | 5.3 | 10.6% | 2 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.0% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 5.7% | 3 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.3 | 16 / 35 | 4508 |
| 2 | 1 | 65.8 | 82.9 | 14 / 35 | 4328 |
| 3 | 1 | 66.6 | 84.1 | 18 / 35 | 3822 |
| 4 | 1 | 65.2 | 81.3 | 16 / 35 | 3785 |
| 5 | 1 | 64.4 | 79.0 | 13 / 35 | 4002 |
| 6 | 1 | 66.8 | 87.9 | 18 / 35 | 3947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 49 | 65% |
| bvh.mini.Freya 0.55 | 25 | 76% |
| bts.mega.Gnarly 1.4 | 25 | 64% |
| cs.Wren 1.0 | 12 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 50% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 35 | 30% | 70 |
| bts.mega.Gnarly 1.4 | 27 | 23% | 45 |
| bvh.mini.Freya 0.55 | 22 | 19% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 10% | 27 |
| cs.Wren 1.0 | 8 | 7% | 17 |
| kdf.KoulDestroyer 1.0 | 5 | 4% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 4 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.6 | 92 / 210 | 2.39 | 17.5% | 28381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.5% | 92 |
| bvh.fry.Freya 0.82 | 2.2 | 14.8% | 22 |
| az.Ololobot 0.2.4 | 3.0 | 13.2% | 60 |
| catcat20.Lambda 0.024 | 3.8 | 11.6% | 27 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.1% | 7 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 7.9% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.8% | 0 |
| gimp.GimpBot 0.1 | 7.0 | 7.6% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.9 | 17 / 35 | 4700 |
| 2 | 1 | 65.7 | 82.5 | 17 / 35 | 4428 |
| 3 | 1 | 67.2 | 85.4 | 15 / 35 | 5085 |
| 4 | 1 | 65.0 | 82.5 | 10 / 35 | 4418 |
| 5 | 1 | 67.6 | 87.9 | 16 / 35 | 4800 |
| 6 | 1 | 67.5 | 86.0 | 17 / 35 | 4950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 52 | 48% |
| bvh.fry.Freya 0.82 | 38 | 79% |
| catcat20.Lambda 0.024 | 31 | 61% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 94% |
| gimp.GimpBot 0.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 42 | 36% | 69 |
| az.Ololobot 0.2.4 | 35 | 30% | 68 |
| catcat20.Lambda 0.024 | 26 | 22% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 6% | 9 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 9 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 5 |
| gimp.GimpBot 0.1 | 1 | 1% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |

## Melee bench: F40

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.6 | 129 / 210 | 2.30 | 18.4% | 27484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.4% | 129 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 37 |
| kano.gamma.KanoGamma 1.8 | 3.7 | 11.8% | 15 |
| mz.AntiGrav 1.0 | 4.3 | 10.9% | 6 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.7% | 5 |
| stelo.Randomness 1.0 | 5.8 | 9.2% | 12 |
| alpha.BlackIce 1.0 | 6.7 | 8.3% | 4 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.3% | 2 |
| sample.Corners 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.8 | 20 / 35 | 4466 |
| 2 | 1 | 68.8 | 88.3 | 23 / 35 | 4710 |
| 3 | 1 | 67.0 | 83.8 | 20 / 35 | 4357 |
| 4 | 1 | 68.8 | 88.6 | 24 / 35 | 4616 |
| 5 | 1 | 67.7 | 84.1 | 21 / 35 | 4667 |
| 6 | 1 | 67.6 | 83.8 | 21 / 35 | 4668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 52 | 81% |
| kano.gamma.KanoGamma 1.8 | 34 | 85% |
| mz.AntiGrav 1.0 | 22 | 100% |
| Polkwane.SmashMelee 1.0 | 16 | 100% |
| stelo.Randomness 1.0 | 13 | 92% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |
| alpha.BlackIce 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 28 | 35% | 56 |
| kano.gamma.KanoGamma 1.8 | 16 | 20% | 50 |
| stelo.Randomness 1.0 | 10 | 12% | 26 |
| Polkwane.SmashMelee 1.0 | 10 | 12% | 18 |
| mz.AntiGrav 1.0 | 8 | 10% | 35 |
| alpha.BlackIce 1.0 | 5 | 6% | 10 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 10 |
| sample.Corners 1.0 | 1 | 1% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.8 | 101 / 210 | 2.28 | 17.3% | 23954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 17.3% | 101 |
| eem.EvBotNG v12.8 | 1.8 | 16.2% | 74 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 17 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.1% | 9 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.9% | 6 |
| shrub.Silver v048 | 6.2 | 8.6% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.2% | 3 |
| stelo.Mirror 1.1 | 8.5 | 5.7% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 82.2 | 17 / 35 | 3830 |
| 2 | 2 | 65.7 | 81.3 | 14 / 35 | 4139 |
| 3 | 1 | 67.8 | 89.2 | 19 / 35 | 4084 |
| 4 | 1 | 67.9 | 89.8 | 19 / 35 | 3952 |
| 5 | 1 | 66.3 | 83.2 | 15 / 35 | 3981 |
| 6 | 1 | 67.9 | 88.9 | 17 / 35 | 3968 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 71 | 52% |
| ary.Swarm 1.1 | 31 | 77% |
| lessonz.robocode.Oz 0.5.0 | 23 | 87% |
| simonton.nano.MeleeSeed 1.8 | 15 | 93% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| shrub.Silver v048 | 3 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 50 | 45% | 88 |
| ary.Swarm 1.1 | 29 | 26% | 54 |
| simonton.nano.MeleeSeed 1.8 | 10 | 9% | 23 |
| lessonz.robocode.Oz 0.5.0 | 9 | 8% | 20 |
| acogdev.alpha 0.2 | 4 | 4% | 4 |
| jsal.Jsalbot 1.0 | 3 | 3% | 7 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| stelo.Mirror 1.1 | 1 | 1% | 5 |
| shrub.Silver v048 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.2 | 112 / 210 | 2.15 | 18.4% | 30157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.4% | 112 |
| wompi.Wallaby 5.1 | 2.0 | 15.8% | 57 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.4% | 10 |
| ara.Shera 0.88 | 3.5 | 13.7% | 27 |
| amz.NanoClone 1.41 | 5.2 | 8.9% | 2 |
| dsw.StaticD 1.0 | 6.3 | 7.1% | 3 |
| maribo.IotaCT 1.1 | 6.5 | 6.8% | 1 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.3% | 0 |
| stelo.MirrorMicro 1.0 | 9.0 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.6 | 22 / 35 | 4974 |
| 2 | 1 | 67.8 | 86.3 | 19 / 35 | 4821 |
| 3 | 1 | 68.5 | 86.7 | 18 / 35 | 5145 |
| 4 | 1 | 69.0 | 90.8 | 22 / 35 | 4822 |
| 5 | 1 | 67.3 | 85.7 | 14 / 35 | 5071 |
| 6 | 1 | 68.1 | 86.3 | 17 / 35 | 5324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 48 | 73% |
| maribo.mini.MiniQuester 0.1 | 44 | 91% |
| ara.Shera 0.88 | 40 | 78% |
| dsw.StaticD 1.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 45% | 88 |
| ara.Shera 0.88 | 25 | 25% | 55 |
| maribo.mini.MiniQuester 0.1 | 20 | 20% | 54 |
| amz.NanoClone 1.41 | 5 | 5% | 5 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 1 |
| dsw.StaticD 1.0 | 0 | 0% | 4 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 76.3 | 30 / 210 | 3.13 | 14.6% | 21780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.4% | 155 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 14.6% | 30 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.6% | 15 |
| dummy.micro.Sparrow 2.5 | 4.0 | 12.0% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.7% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.2% | 1 |
| jab.DiamondStealer 5 | 7.0 | 7.6% | 1 |
| mz.NanoGod 2.02 | 7.8 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 72.7 | 5 / 35 | 3536 |
| 2 | 2 | 65.7 | 80.6 | 6 / 35 | 3962 |
| 3 | 2 | 65.3 | 81.0 | 6 / 35 | 3798 |
| 4 | 2 | 62.2 | 71.4 | 4 / 35 | 3321 |
| 5 | 2 | 64.3 | 77.1 | 5 / 35 | 3732 |
| 6 | 2 | 63.1 | 75.2 | 4 / 35 | 3431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 83 | 16% |
| brainfade.melee.Dusk 0.44 | 12 | 75% |
| dummy.micro.Sparrow 2.5 | 5 | 80% |
| cvt.Firsty 1.0 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 110 | 61% | 123 |
| brainfade.melee.Dusk 0.44 | 23 | 13% | 31 |
| dummy.micro.Sparrow 2.5 | 23 | 13% | 30 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 11 |
| mz.NanoGod 2.02 | 5 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 4 |
| cvt.Firsty 1.0 | 3 | 2% | 3 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.3 | 118 / 210 | 2.23 | 18.8% | 30814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.8% | 118 |
| stelo.Liblix 0.3.1 | 2.2 | 15.4% | 52 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.1% | 31 |
| wompi.Quokka 1.6 | 4.2 | 10.3% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.4% | 0 |
| jwirde.Gort 2.0 | 6.3 | 8.5% | 3 |
| disan.Chair 2.2.0 | 6.5 | 7.8% | 2 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.3% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 19 / 35 | 5206 |
| 2 | 1 | 69.5 | 88.3 | 23 / 35 | 5090 |
| 3 | 1 | 67.0 | 81.9 | 19 / 35 | 4825 |
| 4 | 1 | 68.4 | 86.0 | 19 / 35 | 5152 |
| 5 | 1 | 68.7 | 86.3 | 16 / 35 | 5358 |
| 6 | 1 | 69.3 | 88.6 | 22 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 68 | 78% |
| tzu.TheArtOfWar 1.2 | 44 | 70% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 100% |
| disan.Chair 2.2.0 | 9 | 89% |
| wompi.Quokka 1.6 | 8 | 75% |
| jwirde.Gort 2.0 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 67% |

Hadur died in 93 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 42 | 45% | 102 |
| tzu.TheArtOfWar 1.2 | 28 | 30% | 56 |
| wompi.Quokka 1.6 | 11 | 12% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 4% | 10 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 8 |
| disan.Chair 2.2.0 | 3 | 3% | 5 |
| jwirde.Gort 2.0 | 1 | 1% | 8 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.5 | 79 / 210 | 2.13 | 19.8% | 37086 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.8% | 79 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.6% | 117 |
| jje.BagPuss 1.2 | 3.2 | 11.6% | 1 |
| sul.Lunar 1.1 | 5.0 | 9.7% | 0 |
| myl.nano.Graviton 1.10 | 5.0 | 9.7% | 5 |
| pez.mini.ChironexFleckeri 0.5 | 6.3 | 8.8% | 2 |
| fm.claire 1.7 | 6.7 | 8.7% | 2 |
| hvilela.HVilela 0.9 | 7.0 | 8.0% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.1% | 4 |
| abud.ThirdRobo 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.8 | 11 / 35 | 6152 |
| 2 | 1 | 70.6 | 90.5 | 19 / 35 | 6190 |
| 3 | 1 | 70.5 | 89.8 | 11 / 35 | 6569 |
| 4 | 1 | 69.4 | 87.0 | 12 / 35 | 6130 |
| 5 | 1 | 69.4 | 89.2 | 13 / 35 | 5821 |
| 6 | 1 | 68.9 | 84.4 | 13 / 35 | 6224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 127 | 24% |
| sul.Lunar 1.1 | 14 | 100% |
| jje.BagPuss 1.2 | 12 | 100% |
| myl.nano.Graviton 1.10 | 9 | 78% |
| fm.claire 1.7 | 6 | 83% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 100% |
| wit.Deep7 2.0 | 2 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 2483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 73% | 0 |
| fm.claire 1.7 | 8 | 6% | 14 |
| jje.BagPuss 1.2 | 6 | 5% | 51 |
| myl.nano.Graviton 1.10 | 6 | 5% | 38 |
| sul.Lunar 1.1 | 5 | 4% | 55 |
| hvilela.HVilela 0.9 | 5 | 4% | 17 |
| wit.Deep7 2.0 | 3 | 2% | 10 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 17 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 83.8 | 62 / 210 | 2.46 | 16.3% | 24202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.6% | 52 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.3% | 80 |
| hadur117.mini.DeiseD 0.4 | 2.3 | 16.3% | 62 |
| mz.MicroSheep 1.0 | 4.0 | 10.8% | 6 |
| cx.Princess 1.0 | 5.3 | 9.8% | 10 |
| sadoner.killer 0.2 | 6.0 | 8.6% | 0 |
| arthord.NanoSatanMelee Beta | 6.7 | 7.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.3% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 81.6 | 13 / 35 | 4011 |
| 2 | 1 | 67.0 | 87.3 | 12 / 35 | 4248 |
| 3 | 3 | 65.3 | 84.8 | 6 / 35 | 3915 |
| 4 | 3 | 65.3 | 82.5 | 10 / 35 | 3921 |
| 5 | 3 | 64.3 | 80.0 | 8 / 35 | 3979 |
| 6 | 2 | 66.5 | 86.7 | 13 / 35 | 4128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 58 | 55% |
| rsalesc.melee.Medina 0.4.5 | 51 | 29% |
| mz.MicroSheep 1.0 | 13 | 85% |
| cx.Princess 1.0 | 10 | 30% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 1071. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 59 | 40% | 73 |
| kc.mini.Mirage 0.2 | 57 | 39% | 92 |
| mz.MicroSheep 1.0 | 11 | 7% | 21 |
| cx.Princess 1.0 | 11 | 7% | 12 |
| sadoner.killer 0.2 | 8 | 5% | 8 |
| arthord.NanoSatanMelee Beta | 2 | 1% | 4 |

