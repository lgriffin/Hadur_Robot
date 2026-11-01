# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.2 | 38 / 210 | 2.24 | 17.2% | 31692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 158 |
| hadur117.mini.DeisePTS 0.5 | 2.0 | 17.2% | 38 |
| sgp.JollyNinja 3.53 | 3.8 | 11.2% | 8 |
| mz.MicroGodMelee 1 | 4.3 | 10.6% | 4 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.7% | 1 |
| lorneswork.Predator 1.0 | 5.2 | 10.0% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.4% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 87.9 | 10 / 35 | 5121 |
| 2 | 2 | 67.4 | 86.7 | 5 / 35 | 5198 |
| 3 | 2 | 65.5 | 81.0 | 3 / 35 | 4946 |
| 4 | 2 | 68.4 | 89.8 | 7 / 35 | 5232 |
| 5 | 2 | 67.5 | 86.0 | 4 / 35 | 5446 |
| 6 | 2 | 67.7 | 85.7 | 9 / 35 | 5749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 143 | 10% |
| mz.MicroGodMelee 1 | 12 | 67% |
| lorneswork.Predator 1.0 | 8 | 100% |
| sgp.JollyNinja 3.53 | 5 | 20% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 1144. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 138 | 80% | 153 |
| mz.MicroGodMelee 1 | 14 | 8% | 22 |
| sgp.JollyNinja 3.53 | 13 | 8% | 18 |
| lorneswork.Predator 1.0 | 3 | 2% | 8 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 2% | 7 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.0 | 98 / 210 | 2.71 | 17.6% | 29457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 17.6% | 98 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 15.3% | 60 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 14.0% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.2% | 4 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.7% | 2 |
| Noran.BitchingElk 0.054 | 6.8 | 7.7% | 6 |
| sch.Simone 0.3d | 7.2 | 7.5% | 11 |
| stelo.PatternRobot 1.0 | 9.0 | 5.7% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.4 | 17 / 35 | 5059 |
| 2 | 1 | 66.6 | 81.0 | 13 / 35 | 4768 |
| 3 | 1 | 67.5 | 83.2 | 20 / 35 | 4781 |
| 4 | 1 | 66.2 | 80.0 | 16 / 35 | 4822 |
| 5 | 1 | 67.8 | 82.5 | 17 / 35 | 5192 |
| 6 | 1 | 66.7 | 80.0 | 15 / 35 | 4835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 54 | 50% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 77% |
| sch.Simone 0.3d | 13 | 62% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| Noran.BitchingElk 0.054 | 5 | 100% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 50 | 45% | 72 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 26 | 23% | 58 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 8% | 16 |
| sch.Simone 0.3d | 8 | 7% | 18 |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 5% | 15 |
| stelo.PatternRobot 1.0 | 5 | 4% | 7 |
| fullsail.SweetTea 1.1 | 5 | 4% | 5 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 8 |
| Noran.BitchingElk 0.054 | 1 | 1% | 11 |

## Melee bench: F03

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.9 | 141 / 210 | 1.73 | 20.7% | 41386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 20.7% | 141 |
| radnor.DoctorBob 1.42 | 2.7 | 13.8% | 21 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.5% | 18 |
| vuen.Cake 2.51 | 3.5 | 12.8% | 27 |
| urdos.URDOS 1.3 | 5.7 | 8.3% | 1 |
| adt.Ar1 2.1 | 6.2 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 6.5 | 7.3% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.2% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.9 | 21 / 35 | 6916 |
| 2 | 1 | 71.9 | 94.0 | 27 / 35 | 7067 |
| 3 | 1 | 70.9 | 91.1 | 22 / 35 | 6805 |
| 4 | 1 | 70.6 | 90.5 | 21 / 35 | 6914 |
| 5 | 1 | 70.5 | 90.5 | 22 / 35 | 6660 |
| 6 | 1 | 72.3 | 96.2 | 28 / 35 | 7024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 79% |
| kawigi.nano.Lib 1.0 | 48 | 90% |
| radnor.DoctorBob 1.42 | 42 | 93% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 34% | 55 |
| kawigi.nano.Lib 1.0 | 22 | 31% | 62 |
| vuen.Cake 2.51 | 18 | 25% | 74 |
| urdos.URDOS 1.3 | 4 | 6% | 5 |
| adt.Ar1 2.1 | 1 | 1% | 5 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.3 | 14 / 210 | 2.41 | 17.2% | 33960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.5% | 189 |
| hadur117.mini.DeisePTS 0.5 | 2.0 | 17.2% | 14 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.3% | 0 |
| josago.Jorgito 0.16 | 5.3 | 8.5% | 0 |
| css.Delitioner 0.11 | 6.2 | 6.9% | 1 |
| tj.zombie1n 1.0.1 | 6.7 | 6.9% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 85.4 | 3 / 35 | 5827 |
| 2 | 2 | 68.7 | 85.7 | 4 / 35 | 5931 |
| 3 | 2 | 66.6 | 82.5 | 1 / 35 | 5398 |
| 4 | 2 | 66.3 | 83.5 | 1 / 35 | 4990 |
| 5 | 2 | 68.5 | 84.8 | 1 / 35 | 6139 |
| 6 | 2 | 67.9 | 84.1 | 4 / 35 | 5675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 162 | 8% |
| TNT.TNT 0.99.1 | 1 | 100% |
| apc.LeeroyJenkins2 1.0 | 1 | 0% |

Hadur died in 196 of 210 rounds, at a mean tick of 1318. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 170 | 87% | 183 |
| apc.LeeroyJenkins2 1.0 | 14 | 7% | 14 |
| TNT.TNT 0.99.1 | 4 | 2% | 5 |
| josago.Jorgito 0.16 | 4 | 2% | 4 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| css.Delitioner 0.11 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 73.8 | 23 / 210 | 3.36 | 14.0% | 21550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.0% | 108 |
| justin.DemonicRage 3.4 | 1.8 | 17.5% | 65 |
| hadur117.mini.DeisePTS 0.5 | 3.0 | 14.0% | 23 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 13 |
| ms.Ares 0.19 | 5.2 | 9.4% | 1 |
| axeBots.HataMoto 3.09 | 5.8 | 8.7% | 1 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 75.9 | 4 / 35 | 3708 |
| 2 | 3 | 62.3 | 74.9 | 5 / 35 | 3678 |
| 3 | 3 | 61.7 | 71.1 | 4 / 35 | 3546 |
| 4 | 3 | 62.9 | 75.9 | 4 / 35 | 3673 |
| 5 | 3 | 61.2 | 71.7 | 3 / 35 | 3456 |
| 6 | 3 | 61.5 | 73.0 | 3 / 35 | 3489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 38 | 39% |
| cb.fire.Firestarter 2.0f | 24 | 13% |
| wompi.Numbat 2.1 | 4 | 75% |
| ms.Ares 0.19 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 78 | 41% | 89 |
| cb.fire.Firestarter 2.0f | 61 | 32% | 65 |
| wompi.Numbat 2.1 | 17 | 9% | 19 |
| ms.Ares 0.19 | 12 | 6% | 15 |
| axeBots.HataMoto 3.09 | 10 | 5% | 13 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.7 | 91 / 210 | 2.38 | 18.2% | 31209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 18.2% | 91 |
| jekl.StoneGhost 0.7 | 2.3 | 14.8% | 29 |
| origin.SleepSiphon 1.7b | 3.2 | 14.3% | 51 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 13.0% | 32 |
| mld.Wisdom 1.0 | 5.2 | 9.2% | 2 |
| gg.Wolverine 2.0 | 5.8 | 8.9% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.6% | 1 |
| spinnercat.Omen 1.0 | 8.3 | 6.0% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.9% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 79.0 | 10 / 35 | 4906 |
| 2 | 1 | 67.5 | 85.1 | 13 / 35 | 4993 |
| 3 | 1 | 69.9 | 89.5 | 21 / 35 | 5438 |
| 4 | 1 | 67.9 | 83.2 | 15 / 35 | 5396 |
| 5 | 1 | 69.9 | 87.9 | 20 / 35 | 5507 |
| 6 | 1 | 67.2 | 83.2 | 12 / 35 | 4969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 43 | 86% |
| origin.SleepSiphon 1.7b | 42 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 53% |
| gg.Wolverine 2.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 35 | 29% | 60 |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 29% | 50 |
| origin.SleepSiphon 1.7b | 30 | 25% | 69 |
| mld.Wisdom 1.0 | 8 | 7% | 11 |
| gg.Wolverine 2.0 | 8 | 7% | 11 |
| DBall.NUKE 0.1 | 3 | 2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.4 | 115 / 210 | 1.68 | 20.2% | 37216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 20.2% | 115 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 17.3% | 47 |
| rtk.Tachikoma 1.0 | 2.5 | 16.8% | 36 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.4% | 10 |
| franzor.Lizt 1.3.1 | 4.8 | 10.3% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.7 | 20 / 35 | 6307 |
| 2 | 1 | 72.1 | 92.1 | 21 / 35 | 6145 |
| 3 | 1 | 71.3 | 90.8 | 20 / 35 | 5868 |
| 4 | 1 | 71.9 | 93.7 | 20 / 35 | 6073 |
| 5 | 1 | 72.1 | 91.4 | 18 / 35 | 6762 |
| 6 | 1 | 71.6 | 93.0 | 16 / 35 | 6061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 109 | 77% |
| rsalesc.melee.Monk 0.3.6c | 47 | 21% |
| oog.melee.CapuletDroid 1.1 | 20 | 75% |
| franzor.Lizt 1.3.1 | 5 | 80% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1319. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 47 | 49% | 65 |
| rtk.Tachikoma 1.0 | 33 | 34% | 109 |
| oog.melee.CapuletDroid 1.1 | 14 | 15% | 30 |
| franzor.Lizt 1.3.1 | 1 | 1% | 0 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.2 | 126 / 210 | 1.98 | 19.5% | 32363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 19.5% | 126 |
| tm.Yuugao 1.0 | 2.2 | 14.1% | 47 |
| shrub.Vapour v159 | 2.8 | 12.5% | 14 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.5% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.0% | 7 |
| m3thos.Eva00 1.1 | 6.2 | 8.2% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.2% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.5% | 1 |
| SHAM.WOW 1.4 | 9.2 | 5.9% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.7 | 21 / 35 | 5320 |
| 2 | 1 | 71.5 | 93.7 | 28 / 35 | 5859 |
| 3 | 1 | 66.7 | 82.9 | 15 / 35 | 5058 |
| 4 | 1 | 69.6 | 91.4 | 21 / 35 | 5637 |
| 5 | 1 | 68.7 | 88.6 | 20 / 35 | 5234 |
| 6 | 1 | 68.4 | 85.7 | 21 / 35 | 5255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 65 | 62% |
| shrub.Vapour v159 | 34 | 85% |
| Krabb.sliNk.Garm 0.9u | 27 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 80% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 92% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| m3thos.Eva00 1.1 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 41 | 49% | 88 |
| shrub.Vapour v159 | 15 | 18% | 44 |
| Krabb.sliNk.Garm 0.9u | 11 | 13% | 33 |
| m3thos.Eva00 1.1 | 6 | 7% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 5% | 14 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 5 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 76.1 | 52 / 210 | 3.15 | 15.6% | 24260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 113 |
| hadur117.mini.DeisePTS 0.5 | 2.2 | 15.6% | 52 |
| kc.micro.Figment 1.0 | 2.8 | 13.8% | 26 |
| yagami.Tidus 0.11 | 4.2 | 11.3% | 3 |
| pedersen.Grishnakh 1.0 | 5.3 | 9.7% | 7 |
| mc2.enemy.Original 0.9 | 5.5 | 8.9% | 9 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 0 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 75.9 | 6 / 35 | 3929 |
| 2 | 3 | 60.2 | 66.7 | 5 / 35 | 3541 |
| 3 | 2 | 66.7 | 81.3 | 11 / 35 | 4584 |
| 4 | 2 | 65.9 | 80.0 | 11 / 35 | 4353 |
| 5 | 2 | 63.5 | 75.9 | 9 / 35 | 3862 |
| 6 | 2 | 64.1 | 76.8 | 10 / 35 | 3991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 52 | 21% |
| kc.micro.Figment 1.0 | 28 | 64% |
| yagami.Tidus 0.11 | 13 | 92% |
| mc2.enemy.Original 0.9 | 8 | 50% |
| pedersen.Grishnakh 1.0 | 6 | 67% |
| dft.Calliope 5.6 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 80 | 51% | 93 |
| kc.micro.Figment 1.0 | 29 | 18% | 48 |
| yagami.Tidus 0.11 | 23 | 15% | 33 |
| mc2.enemy.Original 0.9 | 10 | 6% | 14 |
| pedersen.Grishnakh 1.0 | 9 | 6% | 11 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 6 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| dft.Calliope 5.6 | 1 | 1% | 3 |

## Melee bench: F10

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 95.3 | 166 / 210 | 1.42 | 20.8% | 34926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 20.8% | 166 |
| DTF.Kludgy 1.2b | 2.5 | 13.6% | 21 |
| ne.Chimera 1.2 | 3.0 | 13.0% | 8 |
| ejb.Polaris 1.0.1 | 3.5 | 12.3% | 6 |
| vStar.RAFzilla 2.15 | 5.3 | 10.0% | 3 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.9% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.5 | 5.7% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 95.2 | 27 / 35 | 5860 |
| 2 | 1 | 71.6 | 95.6 | 27 / 35 | 6046 |
| 3 | 1 | 71.5 | 97.1 | 30 / 35 | 5600 |
| 4 | 1 | 71.7 | 96.2 | 28 / 35 | 5919 |
| 5 | 1 | 71.8 | 97.8 | 30 / 35 | 5735 |
| 6 | 1 | 70.1 | 90.2 | 24 / 35 | 5766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 58 | 76% |
| ejb.Polaris 1.0.1 | 56 | 93% |
| ne.Chimera 1.2 | 41 | 93% |
| vStar.RAFzilla 2.15 | 15 | 87% |
| tvv.micro.Antares 1.1.1 | 12 | 83% |
| kurios.DOSexe .9b | 4 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 25 | 56% | 64 |
| ne.Chimera 1.2 | 7 | 16% | 47 |
| ejb.Polaris 1.0.1 | 5 | 11% | 55 |
| vStar.RAFzilla 2.15 | 4 | 9% | 18 |
| tvv.micro.Antares 1.1.1 | 3 | 7% | 12 |
| kurios.DOSexe .9b | 1 | 2% | 8 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.3 | 89 / 210 | 2.78 | 17.0% | 27050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.5 | 17.0% | 89 |
| rz.Aleph 0.34 | 1.5 | 16.6% | 62 |
| cx.mini.Nimrod 0.55 | 3.5 | 11.5% | 16 |
| djc.DynaBot 0.1.1 | 3.7 | 11.0% | 16 |
| br2.MobyDickBot 1.6 | 5.5 | 9.2% | 13 |
| rdt199.Warlord 0.73 | 5.5 | 9.2% | 11 |
| uji.YellohFellah 1.0 | 7.5 | 7.6% | 4 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.5 | 16 / 35 | 4683 |
| 2 | 1 | 68.1 | 87.0 | 19 / 35 | 4765 |
| 3 | 1 | 67.9 | 85.1 | 17 / 35 | 4844 |
| 4 | 2 | 64.9 | 77.8 | 15 / 35 | 4220 |
| 5 | 2 | 63.2 | 74.6 | 10 / 35 | 4169 |
| 6 | 2 | 64.0 | 74.6 | 12 / 35 | 4369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 67% |
| djc.DynaBot 0.1.1 | 22 | 77% |
| rdt199.Warlord 0.73 | 13 | 69% |
| uji.YellohFellah 1.0 | 12 | 67% |
| cx.mini.Nimrod 0.55 | 12 | 100% |
| br2.MobyDickBot 1.6 | 4 | 75% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 62 | 51% | 103 |
| cx.mini.Nimrod 0.55 | 19 | 16% | 29 |
| djc.DynaBot 0.1.1 | 14 | 12% | 26 |
| rdt199.Warlord 0.73 | 11 | 9% | 20 |
| uji.YellohFellah 1.0 | 6 | 5% | 14 |
| br2.MobyDickBot 1.6 | 4 | 3% | 8 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 5 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.5 | 120 / 210 | 2.22 | 18.2% | 25444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 18.2% | 120 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.0% | 25 |
| nat.PallasHawk 1.0 | 2.7 | 13.4% | 33 |
| darkcanuck.Leon 1.01 | 4.0 | 12.2% | 20 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.0% | 6 |
| jrm.Test0 1.0 | 5.8 | 8.3% | 0 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.8% | 1 |
| jp.Perpy 16.0 | 8.0 | 6.2% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.1 | 18 / 35 | 4718 |
| 2 | 1 | 66.9 | 83.8 | 20 / 35 | 3988 |
| 3 | 1 | 68.6 | 88.6 | 21 / 35 | 4453 |
| 4 | 1 | 66.9 | 83.8 | 19 / 35 | 3990 |
| 5 | 1 | 68.9 | 91.4 | 22 / 35 | 4205 |
| 6 | 1 | 67.3 | 87.0 | 20 / 35 | 4090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 59 | 81% |
| nat.PallasHawk 1.0 | 44 | 66% |
| darkcanuck.Leon 1.01 | 30 | 70% |
| brainfade.melee.Genghis 0.36 | 15 | 93% |
| jrm.Test0 1.0 | 4 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| jp.Perpy 16.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 26 | 29% | 61 |
| darkcanuck.Leon 1.01 | 18 | 20% | 49 |
| bts.wiki.RipCurl 0.9b | 17 | 19% | 50 |
| brainfade.melee.Genghis 0.36 | 13 | 14% | 17 |
| jrm.Test0 1.0 | 6 | 7% | 11 |
| jp.Perpy 16.0 | 4 | 4% | 5 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 5 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 82.3 | 66 / 210 | 2.59 | 16.4% | 26738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 17.0% | 88 |
| ags.Glacier 0.2.11 | 2.2 | 16.3% | 40 |
| hadur117.mini.DeisePTS 0.5 | 2.2 | 16.4% | 66 |
| shinh.Entangled 0.3 | 4.3 | 11.9% | 7 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.0% | 9 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.1% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 4.8% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 75.9 | 5 / 35 | 4233 |
| 2 | 2 | 66.5 | 84.1 | 16 / 35 | 4181 |
| 3 | 3 | 64.5 | 76.8 | 11 / 35 | 4321 |
| 4 | 3 | 65.8 | 81.6 | 7 / 35 | 4460 |
| 5 | 1 | 68.9 | 89.8 | 15 / 35 | 5079 |
| 6 | 1 | 67.1 | 85.7 | 12 / 35 | 4464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 60 | 38% |
| ags.Glacier 0.2.11 | 45 | 67% |
| shinh.Entangled 0.3 | 11 | 82% |
| stelo.Wang 1.0 | 3 | 100% |
| gh.micro.Gruweltje 0.7 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 57 | 39% | 79 |
| ags.Glacier 0.2.11 | 46 | 32% | 73 |
| shinh.Entangled 0.3 | 18 | 12% | 30 |
| gh.micro.Gruweltje 0.7 | 10 | 7% | 11 |
| stelo.Wang 1.0 | 8 | 6% | 10 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.8 | 154 / 210 | 1.65 | 20.7% | 36565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 20.7% | 154 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.5% | 21 |
| catcat20.shape.Theta 0.018 | 3.0 | 13.3% | 32 |
| sanyi.mikrobi.Roberto 1.0 | 4.5 | 9.9% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 8.5% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 6.3 | 8.7% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.7 | 8.0% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.2% | 1 |
| pa.Improved 1.0 | 9.0 | 5.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 89.5 | 25 / 35 | 5915 |
| 2 | 1 | 72.3 | 95.2 | 29 / 35 | 6295 |
| 3 | 1 | 70.8 | 89.5 | 23 / 35 | 6391 |
| 4 | 1 | 72.4 | 96.8 | 28 / 35 | 6040 |
| 5 | 1 | 71.4 | 94.0 | 26 / 35 | 5984 |
| 6 | 1 | 70.7 | 91.7 | 23 / 35 | 5940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.shape.Theta 0.018 | 81 | 77% |
| simonton.micro.Sprout 1.1.3 | 78 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 4 | 75% |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 100% |
| pa.Improved 1.0 | 2 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 27 | 45% | 69 |
| simonton.micro.Sprout 1.1.3 | 17 | 28% | 92 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 8% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 5% | 16 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 5 |
| pa.Improved 1.0 | 1 | 2% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 1 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.2 | 87 / 210 | 2.78 | 17.5% | 31188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 17.5% | 87 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.1% | 24 |
| mld.DustBunny 3.8 | 3.2 | 13.4% | 16 |
| emp.Yngwie 1.11 | 3.3 | 13.1% | 44 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.3% | 5 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.8% | 30 |
| lambdaxy.TBot 0.1 | 7.7 | 6.3% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 5.9% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 4.8% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.2 | 13 / 35 | 5589 |
| 2 | 1 | 64.5 | 72.4 | 10 / 35 | 5043 |
| 3 | 1 | 68.1 | 84.8 | 17 / 35 | 5476 |
| 4 | 1 | 67.4 | 81.0 | 17 / 35 | 5050 |
| 5 | 1 | 66.4 | 78.4 | 14 / 35 | 5054 |
| 6 | 1 | 67.1 | 81.6 | 16 / 35 | 4976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 32 | 88% |
| emp.Yngwie 1.11 | 31 | 55% |
| kawigi.robot.Girl 1.2 | 24 | 71% |
| kawigi.micro.Shiz 1.1 | 17 | 88% |
| cb.nano.Insomnia 1.0 | 9 | 89% |
| divineomega.TrialBot 0.003 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 30% | 61 |
| kawigi.micro.Shiz 1.1 | 22 | 18% | 34 |
| mld.DustBunny 3.8 | 20 | 16% | 56 |
| kawigi.robot.Girl 1.2 | 20 | 16% | 27 |
| cb.nano.Insomnia 1.0 | 18 | 15% | 20 |
| divineomega.TrialBot 0.003 | 3 | 2% | 7 |
| lambdaxy.TBot 0.1 | 2 | 2% | 2 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 79.9 | 79 / 210 | 2.80 | 17.6% | 32995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.2 | 17.6% | 79 |
| gh.Griezel 0.5.2 | 1.8 | 16.9% | 80 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.3% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.6% | 26 |
| tvv.nano.Polaris 1.2 | 5.0 | 9.5% | 8 |
| bvh.fnr.Fenrir 0.36l | 6.3 | 8.6% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.8% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.3% | 1 |
| asd.Cthulhu 1.3 | 9.0 | 5.0% | 1 |
| repositorio.NanoStep 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.0 | 11 / 35 | 5517 |
| 2 | 1 | 66.2 | 77.1 | 15 / 35 | 5217 |
| 3 | 1 | 68.7 | 83.5 | 14 / 35 | 5918 |
| 4 | 1 | 67.5 | 79.7 | 16 / 35 | 5391 |
| 5 | 2 | 65.7 | 76.2 | 9 / 35 | 5292 |
| 6 | 1 | 68.2 | 82.2 | 14 / 35 | 5660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 78 | 49% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 88% |
| techdude.forest.FlamingForest 1.1 | 15 | 47% |
| stelo.IntrinsicVolatility 1.4 | 7 | 86% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 1090. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 70 | 53% | 108 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 16% | 34 |
| techdude.forest.FlamingForest 1.1 | 13 | 10% | 22 |
| bvh.fnr.Fenrir 0.36l | 12 | 9% | 15 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 10 |
| stelo.IntrinsicVolatility 1.4 | 5 | 4% | 9 |
| asd.Cthulhu 1.3 | 3 | 2% | 5 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.8 | 101 / 210 | 2.55 | 18.1% | 32398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 18.1% | 101 |
| et.Predator 1.8 | 2.3 | 13.4% | 29 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.9% | 31 |
| cx.BlestPain 1.41 | 3.3 | 12.3% | 24 |
| nic.Nicator 2.4 | 5.3 | 11.1% | 11 |
| ahf.NanoAndrew .4 | 5.7 | 10.4% | 10 |
| maribo.melee.BMV 0.1 | 7.0 | 8.6% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 2 |
| tex.Longbot 0.4 | 8.7 | 5.2% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.3 | 16 / 35 | 5221 |
| 2 | 1 | 68.6 | 83.2 | 19 / 35 | 5547 |
| 3 | 1 | 65.4 | 75.6 | 13 / 35 | 5117 |
| 4 | 1 | 68.3 | 82.5 | 18 / 35 | 5587 |
| 5 | 1 | 69.3 | 88.6 | 18 / 35 | 5488 |
| 6 | 1 | 68.9 | 85.7 | 17 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 50 | 72% |
| oog.melee.Mercutio 1.0 | 33 | 67% |
| cx.BlestPain 1.41 | 22 | 86% |
| nic.Nicator 2.4 | 16 | 81% |
| ahf.NanoAndrew .4 | 11 | 73% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 33 | 30% | 70 |
| oog.melee.Mercutio 1.0 | 26 | 24% | 43 |
| cx.BlestPain 1.41 | 15 | 14% | 38 |
| ahf.NanoAndrew .4 | 13 | 12% | 20 |
| nic.Nicator 2.4 | 8 | 7% | 23 |
| maribo.melee.BMV 0.1 | 7 | 6% | 8 |
| tex.Longbot 0.4 | 4 | 4% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 4 |

## Melee bench: F18

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.7 | 112 / 210 | 2.38 | 17.8% | 26654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 17.8% | 112 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.8% | 33 |
| morbid.MorbidPriest 1.0 | 2.7 | 13.4% | 31 |
| uji.DBH 1.1 | 3.7 | 11.6% | 13 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.4% | 9 |
| ratosh.Nobo 0.21 | 5.7 | 9.5% | 5 |
| sigterm.Sigterm 1.0 | 7.5 | 7.3% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.0% | 0 |
| stelo.WangRobot 1.0 | 9.0 | 5.7% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.7 | 20 / 35 | 4419 |
| 2 | 1 | 64.9 | 78.7 | 14 / 35 | 4420 |
| 3 | 1 | 66.2 | 83.8 | 17 / 35 | 4268 |
| 4 | 1 | 68.0 | 86.7 | 23 / 35 | 4659 |
| 5 | 1 | 66.6 | 83.2 | 18 / 35 | 4433 |
| 6 | 1 | 68.2 | 88.9 | 20 / 35 | 4455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 49 | 76% |
| agd.Mooserwirt2 2.7 | 40 | 63% |
| uji.DBH 1.1 | 18 | 83% |
| spinnercat.Robovirus 2.718 | 14 | 64% |
| stelo.WangRobot 1.0 | 7 | 100% |
| sigterm.Sigterm 1.0 | 7 | 86% |
| ratosh.Nobo 0.21 | 7 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 0% |

Hadur died in 101 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 33 | 33% | 66 |
| agd.Mooserwirt2 2.7 | 28 | 28% | 57 |
| ratosh.Nobo 0.21 | 11 | 11% | 20 |
| uji.DBH 1.1 | 10 | 10% | 23 |
| spinnercat.Robovirus 2.718 | 8 | 8% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 4% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 4% | 6 |
| sigterm.Sigterm 1.0 | 2 | 2% | 7 |
| stelo.WangRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F19

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.7 | 141 / 210 | 1.57 | 20.8% | 36097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 20.8% | 141 |
| mld.Infinity 2.2 | 2.5 | 14.7% | 40 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 15.2% | 22 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.5% | 2 |
| erdnis.Rover 0.3 | 4.5 | 10.4% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.2% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 7.7 | 6.7% | 4 |
| pbg.R2D2 1.0 | 8.8 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 95.9 | 28 / 35 | 6483 |
| 2 | 1 | 71.5 | 94.0 | 23 / 35 | 5841 |
| 3 | 1 | 71.7 | 95.2 | 24 / 35 | 5609 |
| 4 | 1 | 71.3 | 91.7 | 22 / 35 | 5784 |
| 5 | 1 | 72.0 | 93.3 | 23 / 35 | 6289 |
| 6 | 1 | 71.3 | 91.7 | 21 / 35 | 6091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 98 | 87% |
| mld.Infinity 2.2 | 66 | 61% |
| krillr.mini.JointStrike 2.0.0 | 8 | 88% |
| erdnis.Rover 0.3 | 7 | 86% |
| mbh.Mbh 0.1 | 1 | 100% |
| patson.PatsonTestBot 1.0 | 1 | 100% |
| pac.ABC 2.1 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 1360. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 32 | 46% | 22 |
| davidalves.net.DuelistMiniMelee 1.2 | 27 | 39% | 114 |
| krillr.mini.JointStrike 2.0.0 | 4 | 6% | 25 |
| erdnis.Rover 0.3 | 3 | 4% | 16 |
| mbh.Mbh 0.1 | 2 | 3% | 10 |
| pac.ABC 2.1 | 1 | 1% | 5 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |

## Melee bench: F20

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.5 | 98 / 210 | 2.03 | 19.5% | 35200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 19.5% | 98 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.6% | 57 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.3% | 3 |
| fwb.Nine 1.0.1 | 4.0 | 11.6% | 30 |
| catcat20.Rabbit 0.001 | 4.2 | 11.1% | 21 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 7.5% | 0 |
| bayen.nut.Squirrel 1.615 | 6.7 | 7.2% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.3 | 5.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.8 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.0 | 16 / 35 | 5601 |
| 2 | 1 | 70.4 | 90.8 | 16 / 35 | 6035 |
| 3 | 1 | 69.7 | 87.9 | 17 / 35 | 5824 |
| 4 | 1 | 69.9 | 88.3 | 15 / 35 | 5918 |
| 5 | 1 | 69.7 | 88.3 | 17 / 35 | 5844 |
| 6 | 1 | 69.8 | 88.9 | 17 / 35 | 5978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 71 | 68% |
| fwb.Nine 1.0.1 | 40 | 38% |
| catcat20.Rabbit 0.001 | 35 | 66% |
| nz.jdc.nano.GridFu 1.0 | 6 | 83% |
| bayen.nut.Squirrel 1.615 | 4 | 75% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1218. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 51 | 45% | 94 |
| fwb.Nine 1.0.1 | 29 | 26% | 22 |
| catcat20.Rabbit 0.001 | 19 | 17% | 41 |
| nz.jdc.nano.GridFu 1.0 | 9 | 8% | 32 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 6 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.6 | 119 / 210 | 1.76 | 20.5% | 37078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 20.5% | 119 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 76 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.2% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.1% | 3 |
| eld.Hmm 1.0 | 5.2 | 8.4% | 7 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.1% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.7 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 89.2 | 20 / 35 | 6204 |
| 2 | 1 | 71.7 | 91.4 | 22 / 35 | 6420 |
| 3 | 1 | 71.4 | 94.0 | 22 / 35 | 5965 |
| 4 | 1 | 71.3 | 93.0 | 20 / 35 | 6338 |
| 5 | 1 | 69.3 | 89.2 | 15 / 35 | 5634 |
| 6 | 1 | 71.9 | 92.7 | 20 / 35 | 6517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 120 | 55% |
| dummy.mini.Scimitar 1.01 | 34 | 94% |
| cf.RiO.RiOx 4.2.1 | 13 | 100% |
| eld.Hmm 1.0 | 11 | 73% |

Hadur died in 93 of 210 rounds, at a mean tick of 1410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 63 | 68% | 107 |
| dummy.mini.Scimitar 1.01 | 17 | 18% | 61 |
| cf.RiO.RiOx 4.2.1 | 6 | 6% | 21 |
| eld.Hmm 1.0 | 3 | 3% | 15 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.3 | 92 / 210 | 2.23 | 18.5% | 33300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 18.5% | 92 |
| pe.SandboxDT 2.71m | 2.2 | 16.3% | 64 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.1% | 34 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.9% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 10.1% | 2 |
| tad.Dalek98 0.98 | 6.8 | 6.3% | 0 |
| yk.JahRoslav 1.1 | 7.0 | 6.7% | 1 |
| gg.Squaraus 0.6 | 7.3 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.8 | 15 / 35 | 5771 |
| 2 | 1 | 68.5 | 86.3 | 14 / 35 | 5388 |
| 3 | 1 | 68.9 | 87.9 | 16 / 35 | 5249 |
| 4 | 1 | 68.9 | 84.4 | 16 / 35 | 5689 |
| 5 | 1 | 68.6 | 85.7 | 15 / 35 | 5443 |
| 6 | 1 | 69.4 | 88.9 | 16 / 35 | 5760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 55 | 36% |
| kvk.HebusLeTroll 0.35 | 51 | 67% |
| jlm.javaDisturbance 0.59 | 38 | 79% |
| bigpete.Stewie 1.0 | 5 | 100% |
| pbg.NinjaX 1.2 | 3 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 49 | 41% | 70 |
| kvk.HebusLeTroll 0.35 | 41 | 34% | 65 |
| jlm.javaDisturbance 0.59 | 24 | 20% | 57 |
| tad.Dalek98 0.98 | 3 | 3% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| bigpete.Stewie 1.0 | 0 | 0% | 8 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.2 | 143 / 210 | 1.70 | 20.5% | 33935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 20.5% | 143 |
| pe.SandboxLump 1.52 | 2.0 | 17.3% | 45 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.0 | 9.4% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.7% | 2 |
| cw.megas.Blade 0.8 | 6.8 | 8.2% | 0 |
| sample.Walls 1.0 | 7.8 | 7.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 93.7 | 23 / 35 | 6044 |
| 2 | 1 | 72.4 | 92.7 | 23 / 35 | 5987 |
| 3 | 1 | 72.6 | 95.2 | 24 / 35 | 5935 |
| 4 | 1 | 71.7 | 91.7 | 26 / 35 | 5822 |
| 5 | 1 | 71.3 | 91.1 | 26 / 35 | 5216 |
| 6 | 1 | 70.1 | 88.6 | 21 / 35 | 4931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 103 | 83% |
| cre.Karolos 0.32 | 44 | 68% |
| stelo.AreaTargetingBot 1.1 | 15 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 80% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 34 | 51% | 111 |
| cre.Karolos 0.32 | 26 | 39% | 56 |
| stelo.AreaTargetingBot 1.1 | 3 | 4% | 17 |
| stelo.RamTrackSurfer 1.2 | 3 | 4% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 3 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 72.0 | 47 / 210 | 3.52 | 14.5% | 23055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.8 | 14.5% | 47 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.0% | 36 |
| davidalves.Phoenix 0.54 | 3.3 | 13.5% | 60 |
| florent.XSeries.X2 0.12 | 3.5 | 13.1% | 33 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.6% | 26 |
| oog.melee.Corsair 1.0 | 6.2 | 9.3% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.0% | 6 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.9% | 0 |
| evd.X1 0.01 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 70.2 | 10 / 35 | 3759 |
| 2 | 1 | 63.7 | 75.9 | 10 / 35 | 4085 |
| 3 | 1 | 63.5 | 76.5 | 8 / 35 | 3955 |
| 4 | 4 | 60.0 | 66.7 | 6 / 35 | 3468 |
| 5 | 1 | 61.1 | 71.4 | 6 / 35 | 3764 |
| 6 | 2 | 62.0 | 71.4 | 7 / 35 | 4024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 22 | 45% |
| florent.XSeries.X2 0.12 | 20 | 55% |
| davidalves.Phoenix 0.54 | 18 | 50% |
| pedersen.Ugluk 1.1.1 | 17 | 71% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 39 | 24% | 51 |
| davidalves.Phoenix 0.54 | 38 | 23% | 46 |
| florent.XSeries.X2 0.12 | 33 | 20% | 44 |
| pedersen.Ugluk 1.1.1 | 30 | 18% | 36 |
| oog.melee.Corsair 1.0 | 9 | 5% | 14 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 9 |
| lunchie.Lunchbox 0.93 | 5 | 3% | 6 |
| evd.X1 0.01 | 2 | 1% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.8 | 137 / 210 | 2.10 | 19.1% | 27871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 19.1% | 137 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.5% | 22 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.2% | 21 |
| jdw.Hurricane 1.4 | 3.7 | 11.9% | 19 |
| ds.Oo 2.2 | 5.2 | 9.1% | 4 |
| gre.svman4.Morfeas 1.4.1 | 6.3 | 8.5% | 4 |
| adt.Ar2 1.1 | 7.7 | 6.7% | 2 |
| awesomeness.Elite 1.0 | 7.7 | 7.1% | 1 |
| gjr.Cephalosporin 0.1 | 8.2 | 6.2% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.3 | 25 / 35 | 4635 |
| 2 | 1 | 64.8 | 75.2 | 16 / 35 | 4288 |
| 3 | 1 | 71.6 | 95.6 | 29 / 35 | 5120 |
| 4 | 1 | 69.7 | 89.8 | 25 / 35 | 4827 |
| 5 | 1 | 69.3 | 90.8 | 22 / 35 | 4632 |
| 6 | 1 | 68.2 | 87.0 | 20 / 35 | 4369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 55 | 89% |
| voidious.mini.BrokenSword 2.0.3 | 43 | 86% |
| jdw.Hurricane 1.4 | 38 | 84% |
| ds.Oo 2.2 | 8 | 88% |
| adt.Ar2 1.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| gre.svman4.Morfeas 1.4.1 | 2 | 50% |
| gjr.Cephalosporin 0.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 33% | 56 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 26% | 56 |
| jdw.Hurricane 1.4 | 14 | 19% | 37 |
| ds.Oo 2.2 | 7 | 10% | 23 |
| adt.Ar2 1.1 | 3 | 4% | 12 |
| awesomeness.Elite 1.0 | 2 | 3% | 8 |
| amk.ChumbaMini 0.2 | 2 | 3% | 4 |
| gre.svman4.Morfeas 1.4.1 | 1 | 1% | 10 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 4 |

## Melee bench: F26

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.8 | 120 / 210 | 1.83 | 20.0% | 37222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 20.0% | 120 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 37 |
| shu.nitro.LENIN .T34 | 3.3 | 13.1% | 29 |
| lrem.Spectre 0.4.4 | 3.7 | 12.8% | 19 |
| js.PinBall 1.6 | 5.0 | 10.4% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.2% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 7.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.1 | 24 / 35 | 5952 |
| 2 | 1 | 71.1 | 91.4 | 22 / 35 | 6340 |
| 3 | 1 | 70.8 | 91.7 | 19 / 35 | 6077 |
| 4 | 1 | 69.7 | 87.3 | 16 / 35 | 6207 |
| 5 | 1 | 70.9 | 91.7 | 18 / 35 | 6237 |
| 6 | 1 | 70.9 | 90.5 | 21 / 35 | 6409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 58 | 72% |
| lrem.Spectre 0.4.4 | 51 | 78% |
| shu.nitro.LENIN .T34 | 45 | 69% |
| js.PinBall 1.6 | 7 | 57% |
| jaybot.adv.bots.JayBot 2.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 33 | 36% | 82 |
| shu.nitro.LENIN .T34 | 28 | 31% | 59 |
| lrem.Spectre 0.4.4 | 22 | 24% | 43 |
| js.PinBall 1.6 | 6 | 7% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 0 | 0% | 4 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.2 | 127 / 210 | 1.98 | 19.6% | 31772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 19.6% | 127 |
| mk.Alpha 0.2.1 | 2.2 | 14.0% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 10.7% | 11 |
| wee.Gem 1.8.4 | 4.2 | 11.1% | 21 |
| EH.Eagle 1.0.6 | 4.2 | 10.4% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.7% | 0 |
| joe.ADinosaur 1.0 | 6.8 | 8.2% | 0 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.9% | 3 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.8% | 3 |
| cs.Grudge 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 93.0 | 26 / 35 | 5186 |
| 2 | 1 | 71.2 | 89.8 | 20 / 35 | 6150 |
| 3 | 1 | 70.9 | 86.3 | 19 / 35 | 6420 |
| 4 | 1 | 67.2 | 86.3 | 16 / 35 | 4699 |
| 5 | 1 | 69.4 | 89.8 | 23 / 35 | 4978 |
| 6 | 1 | 68.2 | 89.5 | 23 / 35 | 4339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 69 | 71% |
| wee.Gem 1.8.4 | 37 | 73% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 77% |
| EH.Eagle 1.0.6 | 19 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 32 | 39% | 81 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 23% | 39 |
| wee.Gem 1.8.4 | 13 | 16% | 40 |
| caimano.Furia_Ceca 0.22 | 7 | 8% | 8 |
| EH.Eagle 1.0.6 | 5 | 6% | 19 |
| joe.ADinosaur 1.0 | 3 | 4% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 2% | 10 |
| throxbot.ThroxBot 0.1 | 2 | 2% | 6 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F28

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 91.6 | 138 / 210 | 1.76 | 19.4% | 28426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 19.4% | 138 |
| kid.test.NightFox .2 | 2.0 | 15.6% | 46 |
| uji.Antique 1.0 | 3.5 | 11.6% | 16 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.0% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.0% | 4 |
| amk.ChumbaWumba 0.3 | 6.2 | 7.9% | 0 |
| ahr.ice.Ice 1.0.2 | 6.3 | 7.9% | 2 |
| matt.advanced.Katana 1.0 | 8.5 | 5.9% | 0 |
| stelo.PianistNano 1.2 | 9.2 | 5.4% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 95.6 | 28 / 35 | 4691 |
| 2 | 1 | 68.8 | 90.2 | 22 / 35 | 4469 |
| 3 | 1 | 68.1 | 89.2 | 18 / 35 | 4537 |
| 4 | 1 | 68.0 | 85.4 | 21 / 35 | 4621 |
| 5 | 1 | 70.3 | 94.9 | 25 / 35 | 4846 |
| 6 | 1 | 70.7 | 94.3 | 24 / 35 | 5262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 93 | 72% |
| uji.Antique 1.0 | 43 | 93% |
| qohnil.blot.BlotBot 3.61 | 20 | 80% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| ahr.ice.Ice 1.0.2 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 37 | 49% | 93 |
| uji.Antique 1.0 | 16 | 21% | 51 |
| qohnil.blot.BlotBot 3.61 | 7 | 9% | 32 |
| pfvicm.Sobieski 7.2.3b | 7 | 9% | 15 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 7 |
| amk.ChumbaWumba 0.3 | 2 | 3% | 11 |
2 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.9 | 113 / 210 | 2.18 | 19.2% | 31206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 19.2% | 113 |
| deewiant.Anomaly 0.2 | 2.2 | 15.6% | 43 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.6% | 41 |
| myl.micro.Troodon 1.10 | 4.0 | 11.4% | 6 |
| jok.PheonixM 0.1.2 | 5.3 | 9.6% | 4 |
| ph.melee.ArcherME 0.3 | 5.7 | 8.7% | 1 |
| DBall.Anarchy 0.1 | 7.3 | 6.0% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.8% | 1 |
| jangs.ns51 1.0 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.0 | 20 / 35 | 4911 |
| 2 | 1 | 70.9 | 89.5 | 21 / 35 | 5715 |
| 3 | 1 | 67.4 | 79.4 | 16 / 35 | 4887 |
| 4 | 1 | 68.7 | 84.4 | 15 / 35 | 5248 |
| 5 | 1 | 70.1 | 89.5 | 17 / 35 | 5375 |
| 6 | 1 | 70.9 | 91.4 | 24 / 35 | 5070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 74 | 76% |
| zyx.mega.YersiniaPestis 3.1 | 51 | 73% |
| myl.micro.Troodon 1.10 | 8 | 100% |
| jok.PheonixM 0.1.2 | 6 | 83% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 52 | 53% | 112 |
| zyx.mega.YersiniaPestis 3.1 | 29 | 30% | 59 |
| myl.micro.Troodon 1.10 | 8 | 8% | 18 |
| jok.PheonixM 0.1.2 | 4 | 4% | 10 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 70.1 | 36 / 210 | 3.69 | 13.9% | 22380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.7 | 13.8% | 57 |
| hadur117.mini.DeisePTS 0.5 | 2.7 | 13.9% | 36 |
| oog.melee.Capulet 1.2 | 2.8 | 13.7% | 35 |
| catcat20.Matcha 0.006 | 3.3 | 13.6% | 47 |
| stelo.PastFuture 2.3.2 | 3.5 | 13.1% | 26 |
| intruder.PrairieWolf 2.61 | 7.2 | 7.7% | 6 |
| ntc.Opposite 1.5 | 7.5 | 7.4% | 0 |
| tripphippy.Alice 1.1 | 7.5 | 7.2% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.0% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.2 | 68.6 | 5 / 35 | 3417 |
| 2 | 3 | 60.8 | 69.5 | 7 / 35 | 3712 |
| 3 | 4 | 59.4 | 64.8 | 5 / 35 | 3767 |
| 4 | 2 | 61.3 | 73.3 | 5 / 35 | 3522 |
| 5 | 1 | 62.4 | 71.7 | 8 / 35 | 4010 |
| 6 | 2 | 62.4 | 72.7 | 6 / 35 | 3952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 23 | 43% |
| darkcanuck.B26354 1.06 | 22 | 32% |
| oog.melee.Capulet 1.2 | 17 | 47% |
| stelo.PastFuture 2.3.2 | 14 | 50% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |

Hadur died in 174 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 43 | 25% | 55 |
| darkcanuck.B26354 1.06 | 43 | 25% | 49 |
| stelo.PastFuture 2.3.2 | 35 | 20% | 43 |
| oog.melee.Capulet 1.2 | 25 | 14% | 33 |
| ntc.Opposite 1.5 | 11 | 6% | 11 |
| tripphippy.Alice 1.1 | 7 | 4% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 3% | 5 |
| intruder.PrairieWolf 2.61 | 4 | 2% | 5 |

## Melee bench: F31

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 70.4 | 39 / 210 | 3.66 | 14.1% | 21732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.8% | 98 |
| hadur117.mini.DeisePTS 0.5 | 2.5 | 14.1% | 39 |
| gh.mini.Griezel 0.2 | 2.8 | 13.5% | 52 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.7% | 9 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.1% | 8 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.3% | 4 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.7% | 0 |
| fm.mammillarias 1.3 | 8.2 | 6.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.2% | 1 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 69.5 | 6 / 35 | 3556 |
| 2 | 2 | 59.7 | 67.6 | 5 / 35 | 3370 |
| 3 | 2 | 63.4 | 73.7 | 8 / 35 | 3975 |
| 4 | 2 | 64.2 | 77.5 | 9 / 35 | 4061 |
| 5 | 3 | 59.3 | 65.1 | 6 / 35 | 3236 |
| 6 | 3 | 60.8 | 69.2 | 5 / 35 | 3534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 41 | 39% |
| gh.mini.Griezel 0.2 | 29 | 31% |
| spinnercat.micro.Tyger 0.1 | 9 | 78% |
| d414.nano.Quantum 1.0.0 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 33% | 72 |
| gh.mini.Griezel 0.2 | 54 | 32% | 65 |
| d414.nano.Quantum 1.0.0 | 18 | 11% | 22 |
| spinnercat.micro.Tyger 0.1 | 17 | 10% | 21 |
| fm.mammillarias 1.3 | 11 | 6% | 11 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 8 |
| gh.nano.Grofvuil 0.2 | 4 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.1 | 120 / 210 | 2.07 | 18.8% | 30725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 18.8% | 120 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.3% | 58 |
| apc.botM 3.0 | 3.2 | 12.2% | 17 |
| lxx.ConceptA 0.8 | 3.8 | 10.9% | 4 |
| vjik.UnViolation 1.1 | 5.5 | 9.1% | 4 |
| bayen.UbaMicro 1.4 | 6.0 | 8.2% | 2 |
| panzer.Panzer 0.2 | 6.7 | 7.6% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 3 |
| conscience.Electron 1.3g | 9.2 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.1 | 24 / 35 | 5166 |
| 2 | 1 | 69.5 | 91.7 | 24 / 35 | 5164 |
| 3 | 1 | 67.3 | 86.3 | 17 / 35 | 4770 |
| 4 | 1 | 68.3 | 87.0 | 19 / 35 | 5199 |
| 5 | 1 | 68.6 | 88.9 | 17 / 35 | 5405 |
| 6 | 1 | 67.3 | 83.8 | 19 / 35 | 5021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 59% |
| apc.botM 3.0 | 24 | 79% |
| lxx.ConceptA 0.8 | 21 | 95% |
| yk.JahMicro 1.0 | 8 | 75% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| vjik.UnViolation 1.1 | 6 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 46 | 51% | 98 |
| lxx.ConceptA 0.8 | 17 | 19% | 25 |
| apc.botM 3.0 | 13 | 14% | 36 |
| panzer.Panzer 0.2 | 5 | 6% | 11 |
| bayen.UbaMicro 1.4 | 5 | 6% | 10 |
| vjik.UnViolation 1.1 | 2 | 2% | 14 |
| yk.JahMicro 1.0 | 2 | 2% | 8 |
| conscience.Electron 1.3g | 0 | 0% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F33

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.4 | 107 / 210 | 2.40 | 18.6% | 31627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 18.6% | 107 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.0% | 25 |
| gre.svman4.Leonidas 1.3.2 | 3.8 | 11.7% | 16 |
| labg.Cataclysm 2.05 | 4.5 | 11.7% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.1% | 2 |
| baal.nano.N 1.42 | 6.5 | 8.5% | 1 |
| zyx.micro.Ant 1.1 | 8.3 | 5.5% | 0 |
| sanja.First 0.1 | 8.8 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.7 | 20 / 35 | 5480 |
| 2 | 1 | 67.3 | 83.5 | 15 / 35 | 4800 |
| 3 | 1 | 68.3 | 83.5 | 21 / 35 | 5088 |
| 4 | 1 | 69.0 | 84.8 | 17 / 35 | 5454 |
| 5 | 1 | 68.6 | 84.1 | 15 / 35 | 5482 |
| 6 | 1 | 68.8 | 85.1 | 19 / 35 | 5323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 42 | 69% |
| gre.svman4.Leonidas 1.3.2 | 31 | 90% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 76% |
| labg.Cataclysm 2.05 | 28 | 71% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 75% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 37 | 35% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 20% | 43 |
| gre.svman4.Leonidas 1.3.2 | 17 | 16% | 36 |
| labg.Cataclysm 2.05 | 14 | 13% | 28 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 8% | 14 |
| zyx.micro.Ant 1.1 | 6 | 6% | 8 |
| baal.nano.N 1.42 | 1 | 1% | 9 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |
| sanja.First 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.3 | 54 / 210 | 2.59 | 16.9% | 30161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.2% | 83 |
| kid.Gladiator .7.2 | 2.0 | 16.8% | 52 |
| hadur117.mini.DeisePTS 0.5 | 2.5 | 16.9% | 54 |
| jcs.Seth 1.8 | 4.3 | 11.3% | 17 |
| tcf.Reach 3 | 4.8 | 10.4% | 2 |
| cli.Dancer 1.1 | 5.8 | 9.5% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 6.6% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.7 | 13 / 35 | 5378 |
| 2 | 3 | 66.7 | 80.3 | 7 / 35 | 5010 |
| 3 | 2 | 68.8 | 84.8 | 13 / 35 | 5371 |
| 4 | 3 | 66.3 | 79.4 | 9 / 35 | 4818 |
| 5 | 3 | 65.1 | 78.7 | 6 / 35 | 4660 |
| 6 | 3 | 67.1 | 85.1 | 6 / 35 | 4924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 73 | 42% |
| kid.Gladiator .7.2 | 49 | 41% |
| jcs.Seth 1.8 | 10 | 20% |
| tcf.Reach 3 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 0% |

Hadur died in 156 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 71 | 46% | 100 |
| kid.Gladiator .7.2 | 60 | 38% | 73 |
| jcs.Seth 1.8 | 16 | 10% | 21 |
| tcf.Reach 3 | 5 | 3% | 10 |
| cli.Dancer 1.1 | 3 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 80.9 | 34 / 210 | 2.72 | 15.5% | 22743 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.9% | 153 |
| hadur117.mini.DeisePTS 0.5 | 2.2 | 15.5% | 34 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.8% | 17 |
| rz.HawkOnFire 0.1 | 3.8 | 12.1% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.1% | 4 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.0% | 0 |
| wit.Chuliath 1.0 | 7.2 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 8.7 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 86.3 | 7 / 35 | 4033 |
| 2 | 2 | 62.8 | 76.8 | 4 / 35 | 3693 |
| 3 | 2 | 64.6 | 82.5 | 4 / 35 | 3754 |
| 4 | 2 | 64.3 | 81.0 | 10 / 35 | 3435 |
| 5 | 2 | 65.3 | 83.8 | 6 / 35 | 4132 |
| 6 | 3 | 62.2 | 74.9 | 3 / 35 | 3696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 96 | 17% |
| gh.mini.Gruwel 0.9 | 12 | 67% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 86% |
| rz.HawkOnFire 0.1 | 5 | 80% |

Hadur died in 177 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 111 | 63% | 129 |
| gh.mini.Gruwel 0.9 | 29 | 16% | 38 |
| rz.HawkOnFire 0.1 | 19 | 11% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 6% | 12 |
| wit.Chuliath 1.0 | 4 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.4 | 170 / 210 | 1.59 | 21.7% | 37089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 21.7% | 170 |
| bzdp.Pansy 2.1 | 2.2 | 12.7% | 16 |
| alpha.RainingFire 1.0 | 3.2 | 12.0% | 12 |
| mz.Cork 0.1 | 4.8 | 10.5% | 3 |
| m3thos.Eva02 0.7.1 | 4.8 | 10.2% | 4 |
| bvh.micro.Freya 0.3 | 5.5 | 9.9% | 3 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.1% | 1 |
| dl.BetterWalls 1.0 | 8.3 | 5.4% | 0 |
| squidM.TentalceMeleeNano 1.1 | 9.3 | 4.4% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.3 | 27 / 35 | 5962 |
| 2 | 1 | 72.4 | 93.3 | 29 / 35 | 6298 |
| 3 | 1 | 72.0 | 93.0 | 26 / 35 | 6203 |
| 4 | 1 | 72.5 | 94.9 | 30 / 35 | 6102 |
| 5 | 1 | 72.1 | 93.0 | 29 / 35 | 6133 |
| 6 | 1 | 72.4 | 93.0 | 29 / 35 | 6391 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 95% |
| bvh.micro.Freya 0.3 | 30 | 97% |
| alpha.RainingFire 1.0 | 28 | 82% |
| mz.Cork 0.1 | 25 | 100% |
| m3thos.Eva02 0.7.1 | 24 | 96% |
| bvh.mini.Fenrir 0.39 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 11 | 27% | 38 |
| bzdp.Pansy 2.1 | 10 | 24% | 53 |
| bvh.mini.Fenrir 0.39 | 10 | 24% | 20 |
| bvh.micro.Freya 0.3 | 4 | 10% | 23 |
| m3thos.Eva02 0.7.1 | 3 | 7% | 27 |
| mz.Cork 0.1 | 2 | 5% | 32 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| dl.BetterWalls 1.0 | 0 | 0% | 6 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.4 | 170 / 210 | 1.69 | 20.5% | 36792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 20.5% | 170 |
| germ.TheMind .2 | 2.2 | 10.9% | 10 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 9.5% | 3 |
| EBBU.Sim2 1.02 | 4.5 | 9.4% | 3 |
| agrach.Dalek 1.0 | 5.0 | 9.1% | 9 |
| lmk.ACPFinal 0.1 | 6.5 | 8.6% | 2 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.6% | 7 |
| mb.Beast 0.1 | 7.3 | 8.4% | 4 |
| skm.Ryubot 1.0 | 8.0 | 7.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 7.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.0 | 29 / 35 | 6008 |
| 2 | 1 | 69.3 | 88.3 | 26 / 35 | 6319 |
| 3 | 1 | 71.2 | 96.2 | 32 / 35 | 6231 |
| 4 | 1 | 69.1 | 91.1 | 26 / 35 | 5692 |
| 5 | 1 | 69.7 | 94.0 | 28 / 35 | 5701 |
| 6 | 1 | 70.8 | 91.7 | 29 / 35 | 6841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 45 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 96% |
| stelo.UntouchableNano 1.3 | 22 | 95% |
| EBBU.Sim2 1.02 | 20 | 100% |
| agrach.Dalek 1.0 | 20 | 95% |
| skm.Ryubot 1.0 | 15 | 100% |
| mb.Beast 0.1 | 15 | 100% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 9 | 23% | 45 |
| stelo.UntouchableNano 1.3 | 8 | 20% | 28 |
| agrach.Dalek 1.0 | 6 | 15% | 29 |
| EBBU.Sim2 1.02 | 5 | 13% | 19 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 10% | 33 |
| lmk.ACPFinal 0.1 | 3 | 8% | 19 |
| mb.Beast 0.1 | 3 | 8% | 18 |
| skm.Ryubot 1.0 | 1 | 3% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 3% | 7 |

## Melee bench: F38

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.3 | 86 / 210 | 2.59 | 16.9% | 26535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.3 | 16.9% | 86 |
| justin.Mallais 14.0 | 1.7 | 16.1% | 72 |
| bvh.mini.Freya 0.55 | 3.2 | 12.7% | 18 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.2% | 18 |
| cs.Wren 1.0 | 5.8 | 10.1% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.0 | 9.4% | 1 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.4% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.6% | 1 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.8 | 18 / 35 | 4743 |
| 2 | 2 | 64.2 | 80.0 | 11 / 35 | 3780 |
| 3 | 2 | 63.5 | 75.2 | 11 / 35 | 4078 |
| 4 | 1 | 67.6 | 86.3 | 16 / 35 | 4603 |
| 5 | 1 | 66.2 | 82.9 | 13 / 35 | 4520 |
| 6 | 1 | 67.7 | 84.8 | 17 / 35 | 4811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 70 | 60% |
| bts.mega.Gnarly 1.4 | 21 | 81% |
| bvh.mini.Freya 0.55 | 16 | 69% |
| cs.Wren 1.0 | 7 | 86% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 35% | 85 |
| bts.mega.Gnarly 1.4 | 22 | 18% | 38 |
| bvh.mini.Freya 0.55 | 22 | 18% | 28 |
| cs.Wren 1.0 | 13 | 10% | 20 |
| kdf.KoulDestroyer 1.0 | 12 | 10% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 6% | 15 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 5 |

## Melee bench: F39

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.5 | 85 / 210 | 2.48 | 17.7% | 31024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 17.7% | 85 |
| bvh.fry.Freya 0.82 | 2.0 | 15.1% | 26 |
| az.Ololobot 0.2.4 | 3.3 | 13.0% | 65 |
| catcat20.Lambda 0.024 | 3.7 | 12.0% | 26 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.4% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.4% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.6% | 1 |
| gimp.GimpBot 0.1 | 7.8 | 7.0% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.1 | 15 / 35 | 5426 |
| 2 | 1 | 66.6 | 81.9 | 16 / 35 | 5052 |
| 3 | 1 | 67.5 | 84.4 | 12 / 35 | 5415 |
| 4 | 1 | 65.2 | 80.0 | 9 / 35 | 4834 |
| 5 | 1 | 66.9 | 84.8 | 17 / 35 | 4872 |
| 6 | 1 | 68.1 | 85.1 | 16 / 35 | 5425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 45 | 29% |
| bvh.fry.Freya 0.82 | 38 | 87% |
| catcat20.Lambda 0.024 | 34 | 62% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| gimp.GimpBot 0.1 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 45 | 36% | 73 |
| az.Ololobot 0.2.4 | 42 | 33% | 56 |
| catcat20.Lambda 0.024 | 21 | 17% | 39 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 6% | 10 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 2% | 4 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 4 |
| gimp.GimpBot 0.1 | 1 | 1% | 12 |

## Melee bench: F40

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.1 | 118 / 210 | 2.25 | 19.2% | 32777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 19.2% | 118 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.8% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.7% | 23 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.9% | 9 |
| mz.AntiGrav 1.0 | 5.0 | 10.3% | 2 |
| stelo.Randomness 1.0 | 6.0 | 9.4% | 9 |
| alpha.BlackIce 1.0 | 6.2 | 8.8% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.3% | 2 |
| sample.Corners 1.0 | 9.8 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.9 | 22 / 35 | 5569 |
| 2 | 1 | 71.0 | 92.7 | 25 / 35 | 5439 |
| 3 | 1 | 68.4 | 84.8 | 18 / 35 | 5156 |
| 4 | 1 | 70.3 | 88.6 | 19 / 35 | 5796 |
| 5 | 1 | 68.5 | 83.8 | 21 / 35 | 5448 |
| 6 | 1 | 66.6 | 77.8 | 13 / 35 | 5369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 64 | 78% |
| kano.gamma.KanoGamma 1.8 | 32 | 66% |
| Polkwane.SmashMelee 1.0 | 20 | 85% |
| mz.AntiGrav 1.0 | 16 | 100% |
| stelo.Randomness 1.0 | 10 | 90% |
| alpha.BlackIce 1.0 | 3 | 67% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 37 | 40% | 69 |
| kano.gamma.KanoGamma 1.8 | 21 | 23% | 47 |
| Polkwane.SmashMelee 1.0 | 14 | 15% | 28 |
| stelo.Randomness 1.0 | 6 | 7% | 21 |
| alpha.BlackIce 1.0 | 6 | 7% | 12 |
| amk.superstrike.SuperStrike 0.3 | 6 | 7% | 11 |
| mz.AntiGrav 1.0 | 1 | 1% | 19 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.4 | 74 / 210 | 2.68 | 16.8% | 26364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.5 | 16.8% | 74 |
| eem.EvBotNG v12.8 | 1.7 | 16.8% | 89 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.7% | 17 |
| ary.Swarm 1.1 | 3.5 | 13.2% | 17 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.4% | 7 |
| shrub.Silver v048 | 6.0 | 8.5% | 1 |
| zyx.nano.Ant 1.1 | 6.7 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.9% | 4 |
| stelo.Mirror 1.1 | 8.7 | 5.6% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 14 / 35 | 4674 |
| 2 | 1 | 66.2 | 80.0 | 17 / 35 | 4201 |
| 3 | 3 | 63.2 | 71.4 | 9 / 35 | 4086 |
| 4 | 1 | 67.4 | 86.3 | 14 / 35 | 4569 |
| 5 | 2 | 66.4 | 82.2 | 10 / 35 | 4417 |
| 6 | 1 | 66.3 | 82.5 | 10 / 35 | 4417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 71 | 32% |
| lessonz.robocode.Oz 0.5.0 | 24 | 79% |
| ary.Swarm 1.1 | 21 | 86% |
| simonton.nano.MeleeSeed 1.8 | 11 | 82% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| stelo.Mirror 1.1 | 2 | 50% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 66 | 49% | 86 |
| ary.Swarm 1.1 | 31 | 23% | 48 |
| simonton.nano.MeleeSeed 1.8 | 15 | 11% | 28 |
| lessonz.robocode.Oz 0.5.0 | 10 | 7% | 25 |
| zyx.nano.Ant 1.1 | 7 | 5% | 8 |
| stelo.Mirror 1.1 | 3 | 2% | 5 |
| shrub.Silver v048 | 2 | 1% | 5 |
| jsal.Jsalbot 1.0 | 2 | 1% | 4 |

## Melee bench: F42

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.0 | 92 / 210 | 2.17 | 18.4% | 32034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.2 | 18.4% | 92 |
| wompi.Wallaby 5.1 | 2.0 | 16.3% | 66 |
| ara.Shera 0.88 | 3.3 | 13.6% | 29 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.5% | 20 |
| amz.NanoClone 1.41 | 5.0 | 8.8% | 2 |
| maribo.IotaCT 1.1 | 6.3 | 7.1% | 1 |
| dsw.StaticD 1.0 | 7.0 | 6.8% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.5% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.5 | 16 / 35 | 5239 |
| 2 | 1 | 68.5 | 87.3 | 16 / 35 | 5329 |
| 3 | 1 | 65.9 | 82.2 | 10 / 35 | 4903 |
| 4 | 1 | 68.9 | 87.6 | 17 / 35 | 5443 |
| 5 | 1 | 71.0 | 93.0 | 23 / 35 | 5956 |
| 6 | 2 | 66.7 | 82.5 | 10 / 35 | 5164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 72 | 64% |
| ara.Shera 0.88 | 32 | 56% |
| maribo.mini.MiniQuester 0.1 | 29 | 79% |
| dsw.StaticD 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 56 | 46% | 106 |
| ara.Shera 0.88 | 40 | 33% | 54 |
| maribo.mini.MiniQuester 0.1 | 16 | 13% | 32 |
| amz.NanoClone 1.41 | 5 | 4% | 7 |
| dsw.StaticD 1.0 | 2 | 2% | 6 |
| maribo.IotaCT 1.1 | 2 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 76.3 | 20 / 210 | 3.13 | 15.0% | 25029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 151 |
| hadur117.mini.DeisePTS 0.5 | 2.0 | 15.0% | 20 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.8% | 24 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.7% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.0% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.5% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 78.7 | 5 / 35 | 4297 |
| 2 | 2 | 64.0 | 75.6 | 3 / 35 | 3859 |
| 3 | 2 | 64.7 | 77.8 | 4 / 35 | 4105 |
| 4 | 2 | 64.0 | 74.0 | 1 / 35 | 4149 |
| 5 | 2 | 64.5 | 76.5 | 2 / 35 | 4172 |
| 6 | 2 | 64.9 | 75.6 | 5 / 35 | 4447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 76 | 14% |
| brainfade.melee.Dusk 0.44 | 12 | 50% |
| dummy.micro.Sparrow 2.5 | 4 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 192 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 113 | 59% | 125 |
| brainfade.melee.Dusk 0.44 | 27 | 14% | 30 |
| dummy.micro.Sparrow 2.5 | 21 | 11% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 10 | 5% | 11 |
| Krabb.akim2.Akim2 1.1b | 8 | 4% | 9 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.5 | 106 / 210 | 2.22 | 19.1% | 33687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.2 | 19.1% | 106 |
| stelo.Liblix 0.3.1 | 1.8 | 17.0% | 79 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.2% | 24 |
| wompi.Quokka 1.6 | 4.2 | 9.9% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 9.5% | 3 |
| disan.Chair 2.2.0 | 6.3 | 7.6% | 0 |
| jwirde.Gort 2.0 | 6.8 | 7.3% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.7 | 20 / 35 | 5424 |
| 2 | 2 | 67.7 | 81.9 | 16 / 35 | 5252 |
| 3 | 1 | 69.1 | 84.8 | 16 / 35 | 5587 |
| 4 | 1 | 71.0 | 91.4 | 21 / 35 | 5904 |
| 5 | 1 | 70.5 | 90.2 | 19 / 35 | 5903 |
| 6 | 1 | 68.6 | 84.8 | 14 / 35 | 5617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 67% |
| tzu.TheArtOfWar 1.2 | 42 | 69% |
| wompi.Quokka 1.6 | 9 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 75% |
| disan.Chair 2.2.0 | 3 | 100% |
| jwirde.Gort 2.0 | 3 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 58 | 54% | 119 |
| tzu.TheArtOfWar 1.2 | 27 | 25% | 54 |
| wompi.Quokka 1.6 | 9 | 8% | 15 |
| disan.Chair 2.2.0 | 4 | 4% | 6 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
| jwirde.Gort 2.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.4 | 71 / 210 | 1.96 | 20.4% | 39345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePTS 0.5 | 1.0 | 20.4% | 71 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.8% | 128 |
| jje.BagPuss 1.2 | 3.7 | 11.0% | 2 |
| myl.nano.Graviton 1.10 | 4.2 | 10.7% | 2 |
| sul.Lunar 1.1 | 4.3 | 10.3% | 5 |
| pez.mini.ChironexFleckeri 0.5 | 6.2 | 8.7% | 1 |
| hvilela.HVilela 0.9 | 7.2 | 7.9% | 1 |
| fm.claire 1.7 | 7.5 | 7.8% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.0% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 87.0 | 13 / 35 | 6619 |
| 2 | 1 | 70.1 | 88.3 | 11 / 35 | 6682 |
| 3 | 1 | 70.1 | 88.3 | 11 / 35 | 6296 |
| 4 | 1 | 71.6 | 92.7 | 14 / 35 | 6795 |
| 5 | 1 | 70.5 | 89.8 | 11 / 35 | 6487 |
| 6 | 1 | 70.5 | 90.2 | 11 / 35 | 6466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 137 | 20% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| sul.Lunar 1.1 | 11 | 100% |
| jje.BagPuss 1.2 | 11 | 91% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |
| wit.Deep7 2.0 | 2 | 50% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 1863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 109 | 78% | 0 |
| jje.BagPuss 1.2 | 11 | 8% | 50 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 4% | 28 |
| sul.Lunar 1.1 | 4 | 3% | 56 |
| myl.nano.Graviton 1.10 | 4 | 3% | 33 |
| wit.Deep7 2.0 | 3 | 2% | 8 |
| hvilela.HVilela 0.9 | 1 | 1% | 14 |
| fm.claire 1.7 | 1 | 1% | 13 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeisePTS 0.5 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.6 | 52 / 210 | 2.56 | 16.5% | 27061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 17.2% | 65 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.7% | 83 |
| hadur117.mini.DeisePTS 0.5 | 2.5 | 16.5% | 52 |
| mz.MicroSheep 1.0 | 4.0 | 10.7% | 3 |
| cx.Princess 1.0 | 5.5 | 9.5% | 5 |
| sadoner.killer 0.2 | 5.5 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 6.7% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 83.8 | 9 / 35 | 4553 |
| 2 | 2 | 65.7 | 81.3 | 10 / 35 | 4432 |
| 3 | 3 | 66.7 | 84.1 | 8 / 35 | 4556 |
| 4 | 3 | 65.8 | 81.0 | 9 / 35 | 4566 |
| 5 | 3 | 66.7 | 85.7 | 6 / 35 | 4673 |
| 6 | 3 | 65.4 | 80.0 | 10 / 35 | 4281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 46% |
| rsalesc.melee.Medina 0.4.5 | 48 | 27% |
| cx.Princess 1.0 | 8 | 88% |
| mz.MicroSheep 1.0 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 67 | 42% | 79 |
| kc.mini.Mirage 0.2 | 65 | 41% | 93 |
| mz.MicroSheep 1.0 | 10 | 6% | 15 |
| sadoner.killer 0.2 | 6 | 4% | 6 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 6 |
| cx.Princess 1.0 | 5 | 3% | 9 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

