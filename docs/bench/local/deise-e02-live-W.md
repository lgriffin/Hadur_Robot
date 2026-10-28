# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.8 | 39 / 210 | 2.46 | 16.7% | 30593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 149 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 16.7% | 39 |
| mz.MicroGodMelee 1 | 4.0 | 10.9% | 5 |
| sgp.JollyNinja 3.53 | 4.2 | 10.9% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.9% | 4 |
| lorneswork.Predator 1.0 | 5.5 | 9.8% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 86.7 | 9 / 35 | 4777 |
| 2 | 2 | 67.8 | 88.3 | 6 / 35 | 5532 |
| 3 | 2 | 65.2 | 79.7 | 5 / 35 | 4979 |
| 4 | 2 | 65.7 | 81.3 | 8 / 35 | 4961 |
| 5 | 2 | 66.2 | 84.1 | 4 / 35 | 5004 |
| 6 | 2 | 66.5 | 82.9 | 7 / 35 | 5340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 15% |
| sgp.JollyNinja 3.53 | 11 | 64% |
| mz.MicroGodMelee 1 | 10 | 70% |
| lorneswork.Predator 1.0 | 5 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |

Hadur died in 172 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 72% | 145 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 8% | 15 |
| sgp.JollyNinja 3.53 | 13 | 8% | 15 |
| mz.MicroGodMelee 1 | 11 | 6% | 19 |
| lorneswork.Predator 1.0 | 7 | 4% | 11 |
| adt.Ar2 1.0 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.2 | 93 / 210 | 2.51 | 18.1% | 31218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.1% | 93 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.7% | 52 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.3% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.8% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.7% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6.0 | 8.7% | 1 |
| Noran.BitchingElk 0.054 | 6.8 | 8.3% | 15 |
| sch.Simone 0.3d | 8.3 | 6.7% | 5 |
| stelo.PatternRobot 1.0 | 8.8 | 6.2% | 2 |
| fullsail.SweetTea 1.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.6 | 13 / 35 | 4818 |
| 2 | 1 | 66.8 | 83.5 | 15 / 35 | 4886 |
| 3 | 1 | 69.5 | 86.7 | 23 / 35 | 5580 |
| 4 | 1 | 68.1 | 81.9 | 18 / 35 | 5675 |
| 5 | 1 | 65.8 | 80.0 | 14 / 35 | 4720 |
| 6 | 1 | 67.6 | 85.7 | 10 / 35 | 5539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 68% |
| pulsar.PulsarMax 0.8.9 | 40 | 45% |
| Noran.BitchingElk 0.054 | 14 | 43% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| stelo.PatternRobot 1.0 | 6 | 100% |
| sch.Simone 0.3d | 6 | 83% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 35% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 24% | 56 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 12% | 19 |
| Noran.BitchingElk 0.054 | 11 | 9% | 26 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 8% | 19 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 10 |
| stelo.PatternRobot 1.0 | 4 | 3% | 9 |
| sch.Simone 0.3d | 4 | 3% | 7 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.9 | 134 / 210 | 1.82 | 19.9% | 38042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.9% | 134 |
| radnor.DoctorBob 1.42 | 2.5 | 13.5% | 22 |
| vuen.Cake 2.51 | 3.2 | 13.0% | 38 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.6% | 12 |
| urdos.URDOS 1.3 | 5.2 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.8% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.3 | 19 / 35 | 6429 |
| 2 | 1 | 71.4 | 95.9 | 26 / 35 | 6689 |
| 3 | 1 | 70.6 | 96.8 | 27 / 35 | 5826 |
| 4 | 1 | 69.5 | 87.6 | 19 / 35 | 6615 |
| 5 | 1 | 68.9 | 86.3 | 20 / 35 | 6155 |
| 6 | 1 | 69.9 | 90.5 | 23 / 35 | 6328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 94% |
| vuen.Cake 2.51 | 60 | 53% |
| radnor.DoctorBob 1.42 | 28 | 89% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| urdos.URDOS 1.3 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 33 | 43% | 72 |
| kawigi.nano.Lib 1.0 | 18 | 24% | 70 |
| radnor.DoctorBob 1.42 | 15 | 20% | 34 |
| oa.weak.FlyMk1 0.1 | 5 | 7% | 12 |
| urdos.URDOS 1.3 | 3 | 4% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 5 |
| adt.Ar1 2.1 | 0 | 0% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.9 | 29 / 210 | 2.63 | 16.8% | 32625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 174 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 16.8% | 29 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 3 |
| TNT.TNT 0.99.1 | 4.2 | 10.2% | 3 |
| josago.Jorgito 0.16 | 4.8 | 9.2% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.1% | 1 |
| css.Delitioner 0.11 | 6.5 | 7.3% | 1 |
| rampancy.Durandal 2.1d | 8.5 | 4.8% | 0 |
| sp.Nanos.Ember 1.1 | 8.5 | 4.8% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 81.9 | 7 / 35 | 5743 |
| 2 | 2 | 67.9 | 84.8 | 7 / 35 | 5450 |
| 3 | 2 | 66.6 | 81.0 | 1 / 35 | 5459 |
| 4 | 2 | 66.0 | 79.7 | 5 / 35 | 5075 |
| 5 | 2 | 66.4 | 81.0 | 3 / 35 | 5427 |
| 6 | 2 | 67.5 | 83.2 | 6 / 35 | 5471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 131 | 16% |
| apc.LeeroyJenkins2 1.0 | 3 | 67% |
| TNT.TNT 0.99.1 | 3 | 100% |
| josago.Jorgito 0.16 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 1153. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 136 | 75% | 157 |
| apc.LeeroyJenkins2 1.0 | 17 | 9% | 20 |
| TNT.TNT 0.99.1 | 12 | 7% | 14 |
| josago.Jorgito 0.16 | 11 | 6% | 13 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 68.3 | 24 / 210 | 3.85 | 13.3% | 22001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.7% | 118 |
| justin.DemonicRage 3.4 | 1.8 | 17.3% | 57 |
| hadur117.mini.DeiseW 0.2 | 3.2 | 13.3% | 24 |
| wompi.Numbat 2.1 | 3.8 | 12.3% | 6 |
| ms.Ares 0.19 | 5.3 | 9.2% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 9.1% | 4 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.3% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.4 | 65.7 | 2 / 35 | 3396 |
| 2 | 3 | 60.4 | 69.2 | 4 / 35 | 3534 |
| 3 | 3 | 59.7 | 63.2 | 5 / 35 | 3726 |
| 4 | 3 | 61.4 | 70.8 | 3 / 35 | 3865 |
| 5 | 3 | 62.0 | 72.1 | 7 / 35 | 3701 |
| 6 | 3 | 61.7 | 68.9 | 3 / 35 | 3779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 29 | 48% |
| cb.fire.Firestarter 2.0f | 20 | 10% |
| wompi.Numbat 2.1 | 7 | 86% |
| ms.Ares 0.19 | 1 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |
| supersample.SuperBoxBot 1.0 | 1 | 0% |

Hadur died in 187 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 67 | 36% | 70 |
| justin.DemonicRage 3.4 | 55 | 29% | 70 |
| wompi.Numbat 2.1 | 32 | 17% | 35 |
| axeBots.HataMoto 3.09 | 14 | 7% | 15 |
| ms.Ares 0.19 | 11 | 6% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.7 | 92 / 210 | 2.64 | 17.2% | 27864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 17.2% | 92 |
| jekl.StoneGhost 0.7 | 1.8 | 15.1% | 44 |
| origin.SleepSiphon 1.7b | 3.3 | 13.2% | 42 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 11.8% | 16 |
| mld.Wisdom 1.0 | 4.8 | 10.9% | 6 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 6.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.7% | 4 |
| DBall.NUKE 0.1 | 8.5 | 6.6% | 1 |
| sample.Fire 1.0 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.1 | 14 / 35 | 4652 |
| 2 | 1 | 65.9 | 81.3 | 13 / 35 | 4483 |
| 3 | 1 | 67.3 | 83.5 | 18 / 35 | 4734 |
| 4 | 1 | 67.4 | 83.2 | 17 / 35 | 4697 |
| 5 | 2 | 62.7 | 71.1 | 11 / 35 | 4276 |
| 6 | 1 | 68.6 | 87.3 | 19 / 35 | 5022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 46 | 72% |
| origin.SleepSiphon 1.7b | 26 | 65% |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 87% |
| gg.Wolverine 2.0 | 8 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 100% |
| mld.Wisdom 1.0 | 3 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 118 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 43 | 36% | 69 |
| origin.SleepSiphon 1.7b | 31 | 26% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 17 | 14% | 35 |
| mld.Wisdom 1.0 | 17 | 14% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 3% | 8 |
| gg.Wolverine 2.0 | 3 | 3% | 7 |
| spinnercat.Omen 1.0 | 2 | 2% | 5 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |

## Melee bench: F07

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.6 | 87 / 210 | 1.94 | 19.1% | 35414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 19.1% | 87 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 18.1% | 64 |
| rtk.Tachikoma 1.0 | 2.8 | 16.5% | 41 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.8% | 5 |
| franzor.Lizt 1.3.1 | 4.7 | 10.7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.3 | 89.2 | 13 / 35 | 5676 |
| 2 | 1 | 70.0 | 89.5 | 15 / 35 | 5584 |
| 3 | 1 | 70.9 | 89.2 | 16 / 35 | 6345 |
| 4 | 1 | 70.8 | 90.8 | 14 / 35 | 5882 |
| 5 | 1 | 71.1 | 90.8 | 15 / 35 | 6196 |
| 6 | 1 | 69.8 | 87.9 | 14 / 35 | 5731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 87 | 71% |
| rsalesc.melee.Monk 0.3.6c | 51 | 10% |
| franzor.Lizt 1.3.1 | 16 | 44% |
| oog.melee.CapuletDroid 1.1 | 14 | 86% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 1244. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 64 | 52% | 75 |
| rtk.Tachikoma 1.0 | 42 | 34% | 105 |
| franzor.Lizt 1.3.1 | 10 | 8% | 3 |
| oog.melee.CapuletDroid 1.1 | 5 | 4% | 19 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 3 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.0 | 110 / 210 | 2.26 | 18.4% | 29509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.4% | 110 |
| tm.Yuugao 1.0 | 2.3 | 13.2% | 45 |
| shrub.Vapour v159 | 3.0 | 12.2% | 26 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.0% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 9.9% | 6 |
| m3thos.Eva00 1.1 | 6.5 | 8.4% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 7.9% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.5% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.7% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 80.0 | 17 / 35 | 4777 |
| 2 | 1 | 69.2 | 91.4 | 19 / 35 | 5533 |
| 3 | 1 | 67.3 | 85.7 | 20 / 35 | 4516 |
| 4 | 1 | 66.2 | 80.3 | 18 / 35 | 4625 |
| 5 | 1 | 68.3 | 87.0 | 19 / 35 | 5165 |
| 6 | 1 | 68.4 | 91.4 | 17 / 35 | 4893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 44 | 50% |
| shrub.Vapour v159 | 35 | 57% |
| Krabb.sliNk.Garm 0.9u | 28 | 82% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 89% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 88% |
| SHAM.WOW 1.4 | 8 | 75% |
| m3thos.Eva00 1.1 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 36 | 36% | 65 |
| shrub.Vapour v159 | 28 | 28% | 48 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 11% | 27 |
| Krabb.sliNk.Garm 0.9u | 10 | 10% | 25 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 5% | 17 |
| SHAM.WOW 1.4 | 4 | 4% | 11 |
| zyx.nano.BacillusComma 1.0 | 4 | 4% | 5 |
| m3thos.Eva00 1.1 | 3 | 3% | 9 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 72.5 | 57 / 210 | 3.47 | 15.3% | 25465 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.4% | 97 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 15.3% | 57 |
| kc.micro.Figment 1.0 | 2.8 | 13.9% | 32 |
| yagami.Tidus 0.11 | 4.7 | 10.6% | 2 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.4% | 10 |
| mc2.enemy.Original 0.9 | 5.7 | 9.7% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.3% | 0 |
| step.nanoPri 1.0 | 8.7 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.0 | 5.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 75.9 | 8 / 35 | 4251 |
| 2 | 1 | 65.5 | 79.0 | 13 / 35 | 4414 |
| 3 | 3 | 60.9 | 66.7 | 7 / 35 | 3691 |
| 4 | 2 | 62.4 | 66.3 | 8 / 35 | 4572 |
| 5 | 2 | 64.5 | 74.0 | 11 / 35 | 4449 |
| 6 | 2 | 63.3 | 73.3 | 10 / 35 | 4088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 46 | 37% |
| kc.micro.Figment 1.0 | 26 | 69% |
| yagami.Tidus 0.11 | 14 | 93% |
| pedersen.Grishnakh 1.0 | 4 | 75% |
| mc2.enemy.Original 0.9 | 4 | 100% |
| dft.Calliope 5.6 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 63 | 41% | 83 |
| kc.micro.Figment 1.0 | 40 | 26% | 62 |
| yagami.Tidus 0.11 | 18 | 12% | 26 |
| mc2.enemy.Original 0.9 | 11 | 7% | 15 |
| pedersen.Grishnakh 1.0 | 9 | 6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 5 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 2 | 1% | 3 |
| dft.Calliope 5.6 | 1 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.3 | 154 / 210 | 1.70 | 20.0% | 33938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.0% | 154 |
| DTF.Kludgy 1.2b | 2.3 | 13.7% | 28 |
| ne.Chimera 1.2 | 2.8 | 13.0% | 7 |
| ejb.Polaris 1.0.1 | 4.0 | 11.6% | 8 |
| vStar.RAFzilla 2.15 | 5.2 | 10.5% | 5 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.0% | 7 |
| kurios.DOSexe .9b | 8.0 | 6.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.5% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 96.8 | 27 / 35 | 6002 |
| 2 | 1 | 70.8 | 91.4 | 25 / 35 | 6044 |
| 3 | 1 | 69.3 | 90.5 | 23 / 35 | 5323 |
| 4 | 1 | 71.3 | 95.2 | 30 / 35 | 5752 |
| 5 | 1 | 69.6 | 89.8 | 27 / 35 | 5505 |
| 6 | 1 | 68.8 | 89.8 | 22 / 35 | 5312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 48 | 73% |
| ejb.Polaris 1.0.1 | 43 | 91% |
| ne.Chimera 1.2 | 36 | 92% |
| vStar.RAFzilla 2.15 | 21 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| kurios.DOSexe .9b | 7 | 100% |
| donjezza.Muncho 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 3 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 28 | 50% | 61 |
| ne.Chimera 1.2 | 10 | 18% | 40 |
| ejb.Polaris 1.0.1 | 8 | 14% | 50 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 18 |
| vStar.RAFzilla 2.15 | 4 | 7% | 20 |
| kurios.DOSexe .9b | 1 | 2% | 12 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |
| sam.Samspin 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 78.9 | 81 / 210 | 2.90 | 16.8% | 28166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.0% | 72 |
| hadur117.mini.DeiseW 0.2 | 1.7 | 16.8% | 81 |
| cx.mini.Nimrod 0.55 | 3.2 | 11.6% | 15 |
| djc.DynaBot 0.1.1 | 4.7 | 10.3% | 14 |
| br2.MobyDickBot 1.6 | 5.5 | 9.0% | 12 |
| rdt199.Warlord 0.73 | 5.8 | 8.7% | 8 |
| uji.YellohFellah 1.0 | 6.3 | 8.5% | 7 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 77.5 | 10 / 35 | 4384 |
| 2 | 2 | 64.3 | 74.0 | 14 / 35 | 4598 |
| 3 | 1 | 67.7 | 85.4 | 15 / 35 | 5119 |
| 4 | 2 | 64.6 | 74.9 | 12 / 35 | 4692 |
| 5 | 2 | 65.1 | 78.1 | 9 / 35 | 4728 |
| 6 | 1 | 67.6 | 83.8 | 21 / 35 | 4645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 56% |
| uji.YellohFellah 1.0 | 18 | 78% |
| cx.mini.Nimrod 0.55 | 16 | 63% |
| djc.DynaBot 0.1.1 | 16 | 81% |
| rdt199.Warlord 0.73 | 10 | 80% |
| KiraNL.Chupacabra 0.4 | 5 | 60% |
| br2.MobyDickBot 1.6 | 2 | 50% |

Hadur died in 129 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 58 | 45% | 87 |
| cx.mini.Nimrod 0.55 | 25 | 19% | 35 |
| djc.DynaBot 0.1.1 | 13 | 10% | 25 |
| rdt199.Warlord 0.73 | 11 | 9% | 20 |
| KiraNL.Chupacabra 0.4 | 9 | 7% | 10 |
| uji.YellohFellah 1.0 | 8 | 6% | 21 |
| stelo.MirrorNano 1.3 | 2 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |
| br2.MobyDickBot 1.6 | 1 | 1% | 7 |

## Melee bench: F12

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.9 | 96 / 210 | 2.81 | 16.7% | 24340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 16.7% | 96 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.1% | 33 |
| darkcanuck.Leon 1.01 | 2.8 | 13.3% | 33 |
| nat.PallasHawk 1.0 | 3.7 | 12.7% | 27 |
| brainfade.melee.Genghis 0.36 | 5.2 | 9.8% | 13 |
| jrm.Test0 1.0 | 6.5 | 7.7% | 1 |
| jp.Perpy 16.0 | 7.2 | 7.1% | 3 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.1% | 2 |
| jaybot.bots.Oddball 4.0 | 9.0 | 6.0% | 2 |
| stuff.Vlad 0.1 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 81.9 | 17 / 35 | 3948 |
| 2 | 1 | 63.1 | 76.5 | 14 / 35 | 3551 |
| 3 | 1 | 66.1 | 81.0 | 16 / 35 | 4391 |
| 4 | 1 | 67.5 | 85.4 | 19 / 35 | 4552 |
| 5 | 1 | 61.9 | 70.5 | 10 / 35 | 3837 |
| 6 | 1 | 67.0 | 84.1 | 20 / 35 | 4061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 40 | 83% |
| darkcanuck.Leon 1.01 | 39 | 64% |
| nat.PallasHawk 1.0 | 28 | 86% |
| brainfade.melee.Genghis 0.36 | 17 | 65% |
| jrm.Test0 1.0 | 2 | 50% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 33 | 29% | 64 |
| bts.wiki.RipCurl 0.9b | 20 | 18% | 48 |
| nat.PallasHawk 1.0 | 17 | 15% | 41 |
| brainfade.melee.Genghis 0.36 | 16 | 14% | 21 |
| jp.Perpy 16.0 | 11 | 10% | 12 |
| jrm.Test0 1.0 | 10 | 9% | 12 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| stuff.Vlad 0.1 | 3 | 3% | 3 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 82.1 | 60 / 210 | 2.61 | 16.1% | 26340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.7% | 46 |
| mn.Combat 3.25.0 | 1.8 | 16.3% | 83 |
| hadur117.mini.DeiseW 0.2 | 2.7 | 16.1% | 60 |
| shinh.Entangled 0.3 | 4.3 | 12.0% | 15 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.1% | 6 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.0% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.6 | 80.0 | 8 / 35 | 4304 |
| 2 | 3 | 65.7 | 80.6 | 11 / 35 | 4639 |
| 3 | 2 | 66.6 | 85.4 | 10 / 35 | 4624 |
| 4 | 3 | 63.2 | 78.7 | 9 / 35 | 3766 |
| 5 | 2 | 66.9 | 85.7 | 13 / 35 | 4601 |
| 6 | 3 | 65.7 | 82.2 | 9 / 35 | 4406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 54 | 37% |
| ags.Glacier 0.2.11 | 50 | 54% |
| shinh.Entangled 0.3 | 8 | 75% |
| gh.micro.Gruweltje 0.7 | 5 | 80% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 55 | 37% | 79 |
| mn.Combat 3.25.0 | 55 | 37% | 78 |
| shinh.Entangled 0.3 | 19 | 13% | 26 |
| gh.micro.Gruweltje 0.7 | 14 | 9% | 18 |
| apc.Colossus2 0.17 | 4 | 3% | 5 |
| stelo.Wang 1.0 | 2 | 1% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.2 | 143 / 210 | 1.97 | 19.5% | 32758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.5% | 143 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 31 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 28 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.5% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.2% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.8% | 4 |
| pa.Improved 1.0 | 9.0 | 5.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.7 | 21 / 35 | 5140 |
| 2 | 1 | 71.2 | 95.9 | 30 / 35 | 5334 |
| 3 | 1 | 69.3 | 87.0 | 22 / 35 | 5399 |
| 4 | 1 | 70.0 | 88.9 | 23 / 35 | 5586 |
| 5 | 1 | 70.2 | 91.1 | 25 / 35 | 5681 |
| 6 | 1 | 69.6 | 86.7 | 22 / 35 | 5618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 89% |
| catcat20.shape.Theta 0.018 | 47 | 74% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 85% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 52% | 102 |
| catcat20.shape.Theta 0.018 | 19 | 28% | 53 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 6% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 1% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 1% | 7 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 1% | 1 |

## Melee bench: F15

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.7 | 120 / 210 | 2.29 | 19.3% | 34400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.3% | 120 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.3% | 16 |
| mld.DustBunny 3.8 | 3.2 | 12.7% | 13 |
| emp.Yngwie 1.11 | 3.7 | 12.3% | 36 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.9% | 10 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.1% | 14 |
| lambdaxy.TBot 0.1 | 7.3 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.6% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.3 | 23 / 35 | 5713 |
| 2 | 1 | 71.3 | 91.1 | 25 / 35 | 6206 |
| 3 | 1 | 69.0 | 87.0 | 18 / 35 | 5504 |
| 4 | 1 | 67.5 | 80.6 | 14 / 35 | 5684 |
| 5 | 1 | 69.2 | 87.6 | 20 / 35 | 5488 |
| 6 | 1 | 68.5 | 81.6 | 20 / 35 | 5805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 31 | 97% |
| cb.nano.Insomnia 1.0 | 30 | 93% |
| emp.Yngwie 1.11 | 27 | 59% |
| mld.DustBunny 3.8 | 26 | 96% |
| kawigi.robot.Girl 1.2 | 18 | 89% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 21 | 23% | 51 |
| cb.nano.Insomnia 1.0 | 16 | 18% | 20 |
| kawigi.micro.Shiz 1.1 | 14 | 16% | 46 |
| kawigi.robot.Girl 1.2 | 13 | 14% | 21 |
| mld.DustBunny 3.8 | 12 | 13% | 43 |
| divineomega.TrialBot 0.003 | 12 | 13% | 19 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| lambdaxy.TBot 0.1 | 0 | 0% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.5 | 86 / 210 | 2.67 | 17.9% | 33465 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 17.9% | 86 |
| gh.Griezel 0.5.2 | 1.8 | 17.0% | 79 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.4% | 13 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.4% | 23 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.7% | 3 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.6% | 5 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.1% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.0% | 2 |
| asd.Cthulhu 1.3 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 82.9 | 13 / 35 | 5723 |
| 2 | 1 | 66.4 | 78.4 | 11 / 35 | 5265 |
| 3 | 1 | 68.7 | 81.9 | 21 / 35 | 5661 |
| 4 | 1 | 68.4 | 81.3 | 16 / 35 | 5965 |
| 5 | 2 | 65.6 | 77.8 | 10 / 35 | 5413 |
| 6 | 1 | 68.9 | 86.7 | 15 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 67 | 48% |
| techdude.forest.FlamingForest 1.1 | 20 | 85% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 88% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 64 | 50% | 101 |
| bvh.fnr.Fenrir 0.36l | 22 | 17% | 29 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 15% | 37 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 10 |
| techdude.forest.FlamingForest 1.1 | 5 | 4% | 14 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 7 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |
3 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.2 | 97 / 210 | 2.78 | 17.6% | 31913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.6% | 97 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.6% | 33 |
| et.Predator 1.8 | 3.2 | 12.4% | 22 |
| cx.BlestPain 1.41 | 3.5 | 12.2% | 37 |
| nic.Nicator 2.4 | 5.3 | 11.0% | 10 |
| ahf.NanoAndrew .4 | 5.5 | 10.2% | 8 |
| maribo.melee.BMV 0.1 | 6.5 | 9.7% | 2 |
| tex.Longbot 0.4 | 8.3 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.6% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.1 | 15 / 35 | 5233 |
| 2 | 1 | 66.8 | 79.4 | 16 / 35 | 5224 |
| 3 | 1 | 66.8 | 79.4 | 14 / 35 | 5429 |
| 4 | 1 | 67.5 | 79.0 | 17 / 35 | 5734 |
| 5 | 1 | 65.6 | 77.1 | 18 / 35 | 4805 |
| 6 | 1 | 67.6 | 82.2 | 17 / 35 | 5488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 35 | 80% |
| cx.BlestPain 1.41 | 29 | 52% |
| oog.melee.Mercutio 1.0 | 27 | 81% |
| nic.Nicator 2.4 | 14 | 93% |
| ahf.NanoAndrew .4 | 11 | 82% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |

Hadur died in 114 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 30 | 26% | 48 |
| et.Predator 1.8 | 19 | 17% | 44 |
| oog.melee.Mercutio 1.0 | 19 | 17% | 41 |
| ahf.NanoAndrew .4 | 19 | 17% | 26 |
| nic.Nicator 2.4 | 13 | 11% | 29 |
| maribo.melee.BMV 0.1 | 9 | 8% | 13 |
| tex.Longbot 0.4 | 3 | 3% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |
| goblin.Bender 2.4 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.7 | 106 / 210 | 2.65 | 17.8% | 29179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.8% | 106 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.4% | 33 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.2% | 28 |
| uji.DBH 1.1 | 4.0 | 11.1% | 15 |
| ratosh.Nobo 0.21 | 5.3 | 9.7% | 4 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.8% | 7 |
| sigterm.Sigterm 1.0 | 7.2 | 8.0% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.4% | 5 |
| stelo.WangRobot 1.0 | 9.3 | 6.0% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 80.0 | 18 / 35 | 4678 |
| 2 | 1 | 69.4 | 90.2 | 23 / 35 | 4969 |
| 3 | 1 | 65.7 | 78.1 | 18 / 35 | 4723 |
| 4 | 1 | 65.1 | 79.0 | 13 / 35 | 4753 |
| 5 | 1 | 67.7 | 83.5 | 18 / 35 | 5157 |
| 6 | 1 | 65.9 | 79.4 | 16 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 40 | 75% |
| agd.Mooserwirt2 2.7 | 23 | 74% |
| sigterm.Sigterm 1.0 | 20 | 85% |
| uji.DBH 1.1 | 15 | 87% |
| ratosh.Nobo 0.21 | 12 | 83% |
| spinnercat.Robovirus 2.718 | 10 | 80% |
| stelo.WangRobot 1.0 | 9 | 78% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 29 | 27% | 64 |
| agd.Mooserwirt2 2.7 | 23 | 22% | 46 |
| ratosh.Nobo 0.21 | 15 | 14% | 24 |
| uji.DBH 1.1 | 10 | 9% | 20 |
| spinnercat.Robovirus 2.718 | 10 | 9% | 15 |
| sigterm.Sigterm 1.0 | 6 | 6% | 16 |
| stelo.WangRobot 1.0 | 5 | 5% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 5% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 7 |

## Melee bench: F19

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.7 | 170 / 210 | 1.48 | 21.0% | 34546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 21.0% | 170 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.9% | 17 |
| mld.Infinity 2.2 | 3.0 | 14.0% | 20 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.0% | 4 |
| erdnis.Rover 0.3 | 4.8 | 10.1% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.4% | 0 |
| mbh.Mbh 0.1 | 7.5 | 7.0% | 0 |
| pac.ABC 2.1 | 7.8 | 6.7% | 0 |
| pbg.R2D2 1.0 | 8.5 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.9 | 25 / 35 | 5435 |
| 2 | 1 | 72.2 | 95.2 | 28 / 35 | 5768 |
| 3 | 1 | 72.0 | 96.8 | 29 / 35 | 5529 |
| 4 | 1 | 72.7 | 97.8 | 31 / 35 | 5868 |
| 5 | 1 | 71.6 | 92.4 | 27 / 35 | 5968 |
| 6 | 1 | 72.6 | 97.1 | 30 / 35 | 5978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 101 | 95% |
| mld.Infinity 2.2 | 43 | 91% |
| krillr.mini.JointStrike 2.0.0 | 17 | 88% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| erdnis.Rover 0.3 | 5 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 19 | 46% | 104 |
| mld.Infinity 2.2 | 9 | 22% | 51 |
| krillr.mini.JointStrike 2.0.0 | 6 | 15% | 18 |
| erdnis.Rover 0.3 | 3 | 7% | 11 |
| patson.PatsonTestBot 1.0 | 2 | 5% | 11 |
| pac.ABC 2.1 | 1 | 2% | 3 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.7 | 109 / 210 | 2.20 | 19.1% | 33981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.1% | 109 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.1% | 60 |
| fwb.Nine 1.0.1 | 3.7 | 10.6% | 14 |
| catcat20.Rabbit 0.001 | 3.8 | 10.8% | 20 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.0% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.2% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.6% | 1 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.2% | 4 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.1 | 25 / 35 | 5681 |
| 2 | 1 | 69.2 | 87.3 | 18 / 35 | 5937 |
| 3 | 1 | 68.7 | 86.3 | 17 / 35 | 5611 |
| 4 | 1 | 67.8 | 83.2 | 16 / 35 | 5423 |
| 5 | 1 | 68.2 | 85.1 | 14 / 35 | 5542 |
| 6 | 1 | 68.8 | 86.0 | 19 / 35 | 5787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 55% |
| catcat20.Rabbit 0.001 | 26 | 65% |
| fwb.Nine 1.0.1 | 26 | 85% |
| nz.jdc.nano.GridFu 1.0 | 10 | 90% |
| bayen.nut.Squirrel 1.615 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 56 | 55% | 96 |
| catcat20.Rabbit 0.001 | 15 | 15% | 35 |
| nz.jdc.nano.GridFu 1.0 | 9 | 9% | 24 |
| fwb.Nine 1.0.1 | 9 | 9% | 15 |
| ntc.ControlledChaos 1.1.4 | 4 | 4% | 5 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 15 |
| m3thos.mini.Eva01 0.5.5 | 3 | 3% | 11 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F21

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.9 | 150 / 210 | 1.46 | 21.2% | 36224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 21.2% | 150 |
| eem.EvBot v4.6.16 | 2.0 | 15.6% | 48 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.7% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 4 |
| oa.weak.BotherBot 0.1 | 5.0 | 8.9% | 0 |
| eld.Hmm 1.0 | 6.0 | 7.8% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.1% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.0 | 26 / 35 | 6026 |
| 2 | 1 | 72.6 | 96.2 | 26 / 35 | 6300 |
| 3 | 1 | 71.8 | 94.0 | 25 / 35 | 6192 |
| 4 | 1 | 71.3 | 94.6 | 23 / 35 | 5738 |
| 5 | 1 | 71.6 | 94.6 | 24 / 35 | 5917 |
| 6 | 1 | 72.1 | 95.9 | 26 / 35 | 6051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 110 | 70% |
| dummy.mini.Scimitar 1.01 | 44 | 93% |
| cf.RiO.RiOx 4.2.1 | 19 | 89% |
| eld.Hmm 1.0 | 7 | 100% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 1280. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 41 | 68% | 105 |
| dummy.mini.Scimitar 1.01 | 12 | 20% | 51 |
| cf.RiO.RiOx 4.2.1 | 6 | 10% | 29 |
| eld.Hmm 1.0 | 1 | 2% | 19 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 4 |
| PSW.Relentless 0.1 | 0 | 0% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.6 | 71 / 210 | 2.65 | 17.2% | 31342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 17.2% | 71 |
| pe.SandboxDT 2.71m | 1.8 | 16.3% | 57 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.8% | 43 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.0% | 29 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 5 |
| gg.Squaraus 0.6 | 7.0 | 6.6% | 0 |
| yk.JahRoslav 1.1 | 7.0 | 6.6% | 1 |
| tad.Dalek98 0.98 | 7.3 | 6.3% | 2 |
| pbg.NinjaX 1.2 | 8.7 | 5.5% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.3 | 11 / 35 | 4959 |
| 2 | 2 | 66.3 | 81.9 | 9 / 35 | 4848 |
| 3 | 1 | 67.3 | 82.2 | 15 / 35 | 5293 |
| 4 | 1 | 67.3 | 80.0 | 13 / 35 | 5653 |
| 5 | 1 | 65.3 | 75.9 | 9 / 35 | 5106 |
| 6 | 1 | 68.8 | 88.6 | 14 / 35 | 5483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 35 | 71% |
| pe.SandboxDT 2.71m | 32 | 50% |
| jlm.javaDisturbance 0.59 | 26 | 54% |
| bigpete.Stewie 1.0 | 13 | 92% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |
| pbg.NinjaX 1.2 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 54 | 39% | 78 |
| jlm.javaDisturbance 0.59 | 39 | 28% | 53 |
| kvk.HebusLeTroll 0.35 | 32 | 23% | 52 |
| bigpete.Stewie 1.0 | 5 | 4% | 15 |
| tad.Dalek98 0.98 | 4 | 3% | 4 |
| gg.Squaraus 0.6 | 2 | 1% | 2 |
| yk.JahRoslav 1.1 | 2 | 1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |

## Melee bench: F23

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.9 | 118 / 210 | 2.09 | 19.0% | 31467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.3 | 19.0% | 118 |
| pe.SandboxLump 1.52 | 1.7 | 17.2% | 61 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 20 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.5% | 5 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.5% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.7% | 1 |
| cw.megas.Blade 0.8 | 6.7 | 8.2% | 0 |
| sample.Walls 1.0 | 7.3 | 8.0% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.0 | 20 / 35 | 5382 |
| 2 | 2 | 68.5 | 86.7 | 16 / 35 | 4894 |
| 3 | 2 | 68.3 | 84.8 | 19 / 35 | 4903 |
| 4 | 1 | 69.1 | 87.9 | 18 / 35 | 4831 |
| 5 | 1 | 70.9 | 89.5 | 22 / 35 | 5891 |
| 6 | 1 | 71.6 | 91.7 | 23 / 35 | 5566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 80 | 64% |
| cre.Karolos 0.32 | 31 | 84% |
| stelo.AreaTargetingBot 1.1 | 23 | 96% |
| stelo.RamTrackSurfer 1.2 | 10 | 90% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 52 | 57% | 103 |
| cre.Karolos 0.32 | 14 | 15% | 40 |
| stelo.AreaTargetingBot 1.1 | 11 | 12% | 24 |
| stelo.RamTrackSurfer 1.2 | 6 | 7% | 23 |
| sample.Walls 1.0 | 4 | 4% | 8 |
| cw.megas.Blade 0.8 | 3 | 3% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 2% | 6 |

## Melee bench: F24

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 71.1 | 52 / 210 | 3.60 | 14.4% | 22930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.5% | 43 |
| hadur117.mini.DeiseW 0.2 | 2.3 | 14.4% | 52 |
| florent.XSeries.X2 0.12 | 3.0 | 13.4% | 36 |
| davidalves.Phoenix 0.54 | 3.0 | 13.6% | 42 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.7% | 21 |
| oog.melee.Corsair 1.0 | 6.2 | 9.0% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.5% | 9 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.6% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 5.3% | 2 |
| evd.X1 0.01 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 74.3 | 9 / 35 | 4263 |
| 2 | 3 | 60.7 | 69.2 | 5 / 35 | 3791 |
| 3 | 2 | 60.3 | 67.6 | 9 / 35 | 3536 |
| 4 | 1 | 65.1 | 79.0 | 15 / 35 | 4158 |
| 5 | 5 | 58.6 | 65.7 | 6 / 35 | 3224 |
| 6 | 2 | 61.5 | 70.5 | 8 / 35 | 3958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 27 | 52% |
| florent.XSeries.X2 0.12 | 20 | 65% |
| davidalves.Phoenix 0.54 | 17 | 59% |
| pedersen.Ugluk 1.1.1 | 10 | 70% |
| stelo.SoJNanoMelee 1.1 | 8 | 75% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 159 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 40 | 25% | 54 |
| davidalves.Phoenix 0.54 | 33 | 21% | 44 |
| florent.XSeries.X2 0.12 | 32 | 20% | 46 |
| pedersen.Ugluk 1.1.1 | 20 | 13% | 22 |
| oog.melee.Corsair 1.0 | 14 | 9% | 18 |
| stelo.SoJNanoMelee 1.1 | 7 | 4% | 8 |
| as.FrankTheTank 1.3 | 5 | 3% | 7 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 7 |
| evd.X1 0.01 | 3 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.0 | 122 / 210 | 2.53 | 18.0% | 26404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.0% | 122 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.4% | 27 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.7% | 18 |
| jdw.Hurricane 1.4 | 4.0 | 11.0% | 15 |
| ds.Oo 2.2 | 5.3 | 9.5% | 9 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 9.5% | 7 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.8% | 7 |
| awesomeness.Elite 1.0 | 7.7 | 7.5% | 4 |
| adt.Ar2 1.1 | 8.8 | 6.4% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.4 | 20 / 35 | 4161 |
| 2 | 1 | 66.3 | 80.6 | 20 / 35 | 4238 |
| 3 | 1 | 67.8 | 83.8 | 21 / 35 | 4739 |
| 4 | 1 | 67.5 | 87.0 | 20 / 35 | 4195 |
| 5 | 1 | 65.9 | 79.0 | 17 / 35 | 4315 |
| 6 | 1 | 69.3 | 88.9 | 24 / 35 | 4756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 48 | 88% |
| voidious.micro.BlitzBat 1.05 | 48 | 90% |
| jdw.Hurricane 1.4 | 22 | 86% |
| ds.Oo 2.2 | 9 | 78% |
| awesomeness.Elite 1.0 | 5 | 80% |
| gre.svman4.Morfeas 1.4.1 | 4 | 50% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| adt.Ar2 1.1 | 3 | 67% |

Hadur died in 89 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 22 | 25% | 38 |
| voidious.mini.BrokenSword 2.0.3 | 21 | 24% | 62 |
| voidious.micro.BlitzBat 1.05 | 15 | 17% | 48 |
| ds.Oo 2.2 | 12 | 13% | 21 |
| gre.svman4.Morfeas 1.4.1 | 8 | 9% | 16 |
| amk.ChumbaMini 0.2 | 4 | 4% | 4 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 9 |
| awesomeness.Elite 1.0 | 2 | 2% | 7 |
| adt.Ar2 1.1 | 2 | 2% | 5 |

## Melee bench: F26

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.6 | 106 / 210 | 2.30 | 18.5% | 34276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 18.5% | 106 |
| ak.Fermat 2.0 | 1.8 | 15.5% | 47 |
| shu.nitro.LENIN .T34 | 3.5 | 12.2% | 21 |
| lrem.Spectre 0.4.4 | 3.7 | 12.2% | 23 |
| js.PinBall 1.6 | 5.0 | 10.6% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.7% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.1% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 83.5 | 13 / 35 | 5096 |
| 2 | 1 | 69.8 | 85.1 | 21 / 35 | 6289 |
| 3 | 1 | 68.3 | 84.1 | 17 / 35 | 5761 |
| 4 | 1 | 68.7 | 84.1 | 17 / 35 | 5833 |
| 5 | 1 | 69.4 | 88.9 | 20 / 35 | 5679 |
| 6 | 1 | 69.6 | 87.9 | 18 / 35 | 5618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 49 | 65% |
| shu.nitro.LENIN .T34 | 36 | 86% |
| lrem.Spectre 0.4.4 | 32 | 75% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 89% |
| js.PinBall 1.6 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 44 | 42% | 74 |
| lrem.Spectre 0.4.4 | 23 | 22% | 36 |
| shu.nitro.LENIN .T34 | 13 | 13% | 47 |
| js.PinBall 1.6 | 10 | 10% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 7% | 14 |
| gh.mini.GrubbmOne 1.0 | 4 | 4% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 5 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |

## Melee bench: F27

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.0 | 108 / 210 | 2.53 | 18.1% | 30354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.1% | 108 |
| mk.Alpha 0.2.1 | 2.3 | 14.2% | 62 |
| EH.Eagle 1.0.6 | 3.5 | 11.0% | 8 |
| wee.Gem 1.8.4 | 4.2 | 10.8% | 15 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.5% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.8% | 2 |
| joe.ADinosaur 1.0 | 6.8 | 8.8% | 2 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.9% | 2 |
| caimano.Furia_Ceca 0.22 | 9.2 | 5.5% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 84.4 | 19 / 35 | 4641 |
| 2 | 1 | 67.4 | 84.8 | 18 / 35 | 4855 |
| 3 | 1 | 65.3 | 77.1 | 15 / 35 | 4807 |
| 4 | 1 | 67.4 | 74.3 | 15 / 35 | 5935 |
| 5 | 1 | 68.3 | 86.7 | 17 / 35 | 5209 |
| 6 | 1 | 69.1 | 90.5 | 24 / 35 | 4907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 58 | 55% |
| wee.Gem 1.8.4 | 23 | 91% |
| EH.Eagle 1.0.6 | 22 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 75% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 100% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 37 | 36% | 68 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 19% | 36 |
| wee.Gem 1.8.4 | 14 | 14% | 37 |
| joe.ADinosaur 1.0 | 10 | 10% | 12 |
| EH.Eagle 1.0.6 | 9 | 9% | 27 |
| throxbot.ThroxBot 0.1 | 5 | 5% | 9 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 2% | 12 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.7 | 116 / 210 | 2.20 | 18.3% | 27018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.3% | 116 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 41 |
| uji.Antique 1.0 | 3.2 | 12.8% | 28 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.4% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.9% | 3 |
| amk.ChumbaWumba 0.3 | 6.5 | 7.9% | 5 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.4% | 3 |
| stelo.PianistNano 1.2 | 8.3 | 5.8% | 0 |
| matt.advanced.Katana 1.0 | 8.7 | 6.1% | 5 |
| stelo.Lifestealer 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 18 / 35 | 4620 |
| 2 | 1 | 67.9 | 87.3 | 19 / 35 | 4459 |
| 3 | 1 | 67.8 | 86.7 | 19 / 35 | 4396 |
| 4 | 1 | 69.0 | 89.8 | 19 / 35 | 4956 |
| 5 | 1 | 66.1 | 81.3 | 20 / 35 | 4160 |
| 6 | 1 | 68.4 | 89.5 | 21 / 35 | 4427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 66 | 62% |
| uji.Antique 1.0 | 47 | 72% |
| qohnil.blot.BlotBot 3.61 | 20 | 90% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 100% |
| matt.advanced.Katana 1.0 | 3 | 67% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 42 | 45% | 84 |
| uji.Antique 1.0 | 23 | 24% | 51 |
| amk.ChumbaWumba 0.3 | 8 | 9% | 13 |
| pfvicm.Sobieski 7.2.3b | 8 | 9% | 13 |
| qohnil.blot.BlotBot 3.61 | 6 | 6% | 32 |
| ahr.ice.Ice 1.0.2 | 4 | 4% | 9 |
| matt.advanced.Katana 1.0 | 1 | 1% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| stelo.Lifestealer 1.0 | 1 | 1% | 1 |

## Melee bench: F29

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 78.5 | 83 / 210 | 2.94 | 17.1% | 28700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.1% | 83 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.4% | 61 |
| deewiant.Anomaly 0.2 | 3.0 | 14.6% | 44 |
| myl.micro.Troodon 1.10 | 4.2 | 11.6% | 6 |
| jok.PheonixM 0.1.2 | 4.8 | 11.0% | 9 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 1 |
| DBall.Anarchy 0.1 | 7.2 | 7.0% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.8% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 77.1 | 14 / 35 | 4866 |
| 2 | 1 | 67.1 | 76.8 | 13 / 35 | 4985 |
| 3 | 1 | 64.7 | 75.6 | 10 / 35 | 4576 |
| 4 | 1 | 67.8 | 83.5 | 18 / 35 | 4744 |
| 5 | 1 | 66.2 | 76.2 | 16 / 35 | 4660 |
| 6 | 1 | 67.0 | 81.6 | 12 / 35 | 4869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 59% |
| zyx.mega.YersiniaPestis 3.1 | 38 | 53% |
| myl.micro.Troodon 1.10 | 17 | 100% |
| DBall.Anarchy 0.1 | 8 | 100% |
| jok.PheonixM 0.1.2 | 7 | 71% |
| ph.melee.ArcherME 0.3 | 3 | 67% |
| ap.Frederick 1.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 43 | 34% | 68 |
| zyx.mega.YersiniaPestis 3.1 | 43 | 34% | 66 |
| jok.PheonixM 0.1.2 | 16 | 13% | 21 |
| myl.micro.Troodon 1.10 | 14 | 11% | 28 |
| ph.melee.ArcherME 0.3 | 9 | 7% | 12 |
| DBall.Anarchy 0.1 | 1 | 1% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

## Melee bench: F30

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 68.8 | 37 / 210 | 3.81 | 13.9% | 23910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 2.5 | 13.9% | 37 |
| catcat20.Matcha 0.006 | 2.8 | 13.4% | 45 |
| oog.melee.Capulet 1.2 | 2.8 | 13.4% | 30 |
| stelo.PastFuture 2.3.2 | 3.2 | 13.4% | 36 |
| darkcanuck.B26354 1.06 | 3.7 | 13.2% | 46 |
| intruder.PrairieWolf 2.61 | 7.0 | 8.2% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.6% | 7 |
| ntc.Opposite 1.5 | 7.2 | 7.7% | 1 |
| tripphippy.Alice 1.1 | 8.7 | 6.6% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 68.9 | 8 / 35 | 3955 |
| 2 | 4 | 59.6 | 66.7 | 3 / 35 | 3703 |
| 3 | 2 | 63.0 | 72.4 | 8 / 35 | 4344 |
| 4 | 3 | 60.7 | 69.8 | 5 / 35 | 3901 |
| 5 | 1 | 62.2 | 70.8 | 8 / 35 | 4027 |
| 6 | 4 | 59.6 | 64.1 | 5 / 35 | 3980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 19 | 53% |
| catcat20.Matcha 0.006 | 15 | 47% |
| stelo.PastFuture 2.3.2 | 15 | 47% |
| oog.melee.Capulet 1.2 | 14 | 64% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 50% |
| ntc.Opposite 1.5 | 1 | 100% |
| tripphippy.Alice 1.1 | 1 | 0% |

Hadur died in 173 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 26% | 54 |
| stelo.PastFuture 2.3.2 | 42 | 24% | 47 |
| darkcanuck.B26354 1.06 | 29 | 17% | 39 |
| catcat20.Matcha 0.006 | 21 | 12% | 31 |
| ntc.Opposite 1.5 | 13 | 8% | 14 |
| tripphippy.Alice 1.1 | 9 | 5% | 9 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 3% | 6 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 71.4 | 46 / 210 | 3.58 | 14.5% | 22663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 104 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 14.5% | 46 |
| gh.mini.Griezel 0.2 | 3.2 | 13.1% | 38 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.6% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.8% | 10 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.8% | 3 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.9% | 1 |
| fm.mammillarias 1.3 | 7.7 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 73.3 | 9 / 35 | 3852 |
| 2 | 2 | 62.4 | 70.5 | 8 / 35 | 4039 |
| 3 | 2 | 63.3 | 75.2 | 8 / 35 | 3821 |
| 4 | 2 | 61.4 | 71.1 | 7 / 35 | 3572 |
| 5 | 2 | 62.3 | 72.4 | 8 / 35 | 3787 |
| 6 | 2 | 60.6 | 65.7 | 6 / 35 | 3592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 49 | 59% |
| gh.mini.Griezel 0.2 | 18 | 39% |
| spinnercat.micro.Tyger 0.1 | 6 | 83% |
| d414.nano.Quantum 1.0.0 | 6 | 83% |

Hadur died in 164 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 53 | 32% | 81 |
| gh.mini.Griezel 0.2 | 46 | 28% | 55 |
| d414.nano.Quantum 1.0.0 | 19 | 12% | 24 |
| spinnercat.micro.Tyger 0.1 | 19 | 12% | 22 |
| timmit.nano.TimDog 0.33 | 9 | 5% | 9 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 4% | 6 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.1 | 118 / 210 | 2.16 | 18.5% | 30043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.5% | 118 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 48 |
| apc.botM 3.0 | 3.3 | 12.1% | 17 |
| lxx.ConceptA 0.8 | 4.2 | 10.5% | 9 |
| vjik.UnViolation 1.1 | 5.0 | 9.8% | 4 |
| bayen.UbaMicro 1.4 | 5.7 | 9.0% | 6 |
| panzer.Panzer 0.2 | 7.0 | 7.3% | 3 |
| conscience.Electron 1.3g | 8.2 | 6.5% | 0 |
| yk.JahMicro 1.0 | 8.7 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.8 | 21 / 35 | 4895 |
| 2 | 1 | 68.1 | 88.6 | 18 / 35 | 4945 |
| 3 | 1 | 67.1 | 84.8 | 19 / 35 | 4996 |
| 4 | 1 | 67.5 | 84.8 | 20 / 35 | 5264 |
| 5 | 1 | 67.3 | 83.8 | 19 / 35 | 5064 |
| 6 | 1 | 68.4 | 90.2 | 21 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 74 | 64% |
| lxx.ConceptA 0.8 | 28 | 79% |
| apc.botM 3.0 | 28 | 82% |
| vjik.UnViolation 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 6 | 50% |
| donjezza.Jezza 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 41 | 45% | 92 |
| apc.botM 3.0 | 17 | 18% | 45 |
| lxx.ConceptA 0.8 | 14 | 15% | 24 |
| bayen.UbaMicro 1.4 | 8 | 9% | 12 |
| vjik.UnViolation 1.1 | 4 | 4% | 18 |
| panzer.Panzer 0.2 | 4 | 4% | 6 |
| yk.JahMicro 1.0 | 3 | 3% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |
| conscience.Electron 1.3g | 0 | 0% | 4 |

## Melee bench: F33

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 81.9 | 107 / 210 | 2.63 | 18.2% | 30822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.3 | 18.2% | 107 |
| maribo.Quester 0.3 | 1.7 | 16.3% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.6% | 18 |
| labg.Cataclysm 2.05 | 4.5 | 11.0% | 16 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.3% | 15 |
| baal.nano.N 1.42 | 6.2 | 8.7% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.3% | 8 |
| zyx.micro.Ant 1.1 | 8.2 | 5.9% | 2 |
| sanja.First 0.1 | 9.0 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.5 | 25 / 35 | 5591 |
| 2 | 2 | 65.6 | 73.3 | 13 / 35 | 5024 |
| 3 | 2 | 65.6 | 75.6 | 15 / 35 | 4726 |
| 4 | 1 | 68.3 | 83.5 | 16 / 35 | 5335 |
| 5 | 1 | 68.2 | 83.5 | 19 / 35 | 5088 |
| 6 | 1 | 68.5 | 85.1 | 19 / 35 | 5058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 63 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 74% |
| labg.Cataclysm 2.05 | 16 | 63% |
| gre.svman4.Leonidas 1.3.2 | 14 | 93% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 40% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 33 | 32% | 80 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 25% | 51 |
| labg.Cataclysm 2.05 | 13 | 13% | 27 |
| gre.svman4.Leonidas 1.3.2 | 11 | 11% | 18 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 8% | 11 |
| baal.nano.N 1.42 | 6 | 6% | 12 |
| zyx.micro.Ant 1.1 | 4 | 4% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 2% | 3 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.7 | 65 / 210 | 2.56 | 17.2% | 30280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.5 | 17.2% | 65 |
| stelo.Spread 0.9 | 2.0 | 16.8% | 81 |
| kid.Gladiator .7.2 | 2.5 | 16.3% | 43 |
| jcs.Seth 1.8 | 4.5 | 10.7% | 14 |
| tcf.Reach 3 | 5.2 | 10.2% | 5 |
| cli.Dancer 1.1 | 5.3 | 9.9% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 82.2 | 8 / 35 | 5013 |
| 2 | 1 | 66.6 | 79.4 | 9 / 35 | 5175 |
| 3 | 2 | 67.6 | 85.7 | 12 / 35 | 4779 |
| 4 | 2 | 66.2 | 80.6 | 12 / 35 | 4760 |
| 5 | 1 | 67.7 | 81.6 | 10 / 35 | 5343 |
| 6 | 1 | 68.6 | 86.7 | 14 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 69 | 41% |
| kid.Gladiator .7.2 | 42 | 55% |
| jcs.Seth 1.8 | 9 | 56% |
| tcf.Reach 3 | 4 | 75% |
| ratosh.Wesco 1.4 | 3 | 100% |
| cli.Dancer 1.1 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 64 | 44% | 95 |
| kid.Gladiator .7.2 | 45 | 31% | 62 |
| jcs.Seth 1.8 | 15 | 10% | 23 |
| tcf.Reach 3 | 10 | 7% | 13 |
| cli.Dancer 1.1 | 5 | 3% | 8 |
| amk.Punbot.Punbot 0.01 | 4 | 3% | 4 |
| ratosh.Wesco 1.4 | 2 | 1% | 5 |

## Melee bench: F35

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.9 | 32 / 210 | 3.17 | 14.8% | 23078 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.8% | 145 |
| hadur117.mini.DeiseW 0.2 | 2.2 | 14.8% | 32 |
| gh.mini.Gruwel 0.9 | 3.0 | 12.9% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.0% | 8 |
| rz.HawkOnFire 0.1 | 4.7 | 11.6% | 4 |
| wit.Chuliath 1.0 | 6.3 | 6.9% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.8% | 1 |
| dans.Cinnamon 1.2 | 9.2 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 76.8 | 5 / 35 | 3652 |
| 2 | 2 | 63.8 | 79.0 | 6 / 35 | 3732 |
| 3 | 2 | 64.4 | 78.7 | 8 / 35 | 4181 |
| 4 | 3 | 60.0 | 67.9 | 1 / 35 | 3712 |
| 5 | 2 | 63.8 | 79.0 | 7 / 35 | 3795 |
| 6 | 2 | 63.0 | 74.0 | 5 / 35 | 4006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 65 | 15% |
| gh.mini.Gruwel 0.9 | 15 | 67% |
| rz.HawkOnFire 0.1 | 8 | 75% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 80% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 93 | 52% | 104 |
| gh.mini.Gruwel 0.9 | 37 | 21% | 47 |
| rz.HawkOnFire 0.1 | 25 | 14% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 10% | 25 |
| wit.Chuliath 1.0 | 3 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.9 | 147 / 210 | 2.00 | 20.1% | 33476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.1% | 147 |
| bzdp.Pansy 2.1 | 2.8 | 12.0% | 13 |
| alpha.RainingFire 1.0 | 3.2 | 12.0% | 18 |
| mz.Cork 0.1 | 3.8 | 11.1% | 8 |
| bvh.micro.Freya 0.3 | 4.7 | 10.6% | 11 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.9% | 7 |
| bvh.mini.Fenrir 0.39 | 6.7 | 8.8% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.7% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.6% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.2 | 24 / 35 | 5253 |
| 2 | 1 | 70.6 | 88.9 | 26 / 35 | 5796 |
| 3 | 1 | 67.4 | 81.6 | 18 / 35 | 5243 |
| 4 | 1 | 70.7 | 92.4 | 26 / 35 | 5516 |
| 5 | 1 | 71.7 | 94.3 | 27 / 35 | 5826 |
| 6 | 1 | 71.4 | 94.3 | 26 / 35 | 5842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 38 | 89% |
| bvh.micro.Freya 0.3 | 30 | 93% |
| alpha.RainingFire 1.0 | 28 | 89% |
| mz.Cork 0.1 | 27 | 93% |
| bvh.mini.Fenrir 0.39 | 15 | 93% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| dl.BetterWalls 1.0 | 8 | 100% |
| m3thos.Eva02 0.7.1 | 6 | 67% |

Hadur died in 63 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 14 | 22% | 39 |
| bvh.micro.Freya 0.3 | 13 | 21% | 34 |
| bzdp.Pansy 2.1 | 12 | 19% | 45 |
| mz.Cork 0.1 | 6 | 10% | 35 |
| bvh.mini.Fenrir 0.39 | 6 | 10% | 17 |
| squidM.TentalceMeleeNano 1.1 | 5 | 8% | 8 |
| m3thos.Eva02 0.7.1 | 3 | 5% | 16 |
| dl.BetterWalls 1.0 | 3 | 5% | 11 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F37

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 91.1 | 169 / 210 | 1.80 | 20.1% | 35379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.1% | 169 |
| EBBU.Sim2 1.02 | 2.8 | 10.3% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.4% | 5 |
| germ.TheMind .2 | 4.0 | 9.7% | 10 |
| stelo.UntouchableNano 1.3 | 5.8 | 9.0% | 9 |
| agrach.Dalek 1.0 | 6.5 | 8.5% | 1 |
| lmk.ACPFinal 0.1 | 7.2 | 8.3% | 5 |
| mb.Beast 0.1 | 7.2 | 8.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.1% | 1 |
| skm.Ryubot 1.0 | 9.7 | 7.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.4 | 30 / 35 | 5871 |
| 2 | 1 | 70.7 | 96.2 | 31 / 35 | 5804 |
| 3 | 1 | 68.8 | 90.2 | 24 / 35 | 5818 |
| 4 | 1 | 68.2 | 85.7 | 27 / 35 | 5688 |
| 5 | 1 | 69.0 | 87.0 | 29 / 35 | 6048 |
| 6 | 1 | 70.1 | 94.9 | 28 / 35 | 6150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 33 | 100% |
| agrach.Dalek 1.0 | 31 | 100% |
| germ.TheMind .2 | 28 | 86% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 100% |
| stelo.UntouchableNano 1.3 | 20 | 80% |
| mb.Beast 0.1 | 20 | 100% |
| skm.Ryubot 1.0 | 12 | 100% |
| lmk.ACPFinal 0.1 | 9 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 450. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 11 | 27% | 25 |
| germ.TheMind .2 | 9 | 22% | 29 |
| agrach.Dalek 1.0 | 5 | 12% | 42 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 12% | 11 |
| EBBU.Sim2 1.02 | 4 | 10% | 29 |
| mb.Beast 0.1 | 3 | 7% | 25 |
| lmk.ACPFinal 0.1 | 2 | 5% | 13 |
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 2% | 31 |
| skm.Ryubot 1.0 | 1 | 2% | 3 |

## Melee bench: F38

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 77.4 | 73 / 210 | 3.04 | 16.1% | 26710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 16.1% | 73 |
| justin.Mallais 14.0 | 1.8 | 15.4% | 67 |
| bvh.mini.Freya 0.55 | 3.5 | 12.2% | 17 |
| bts.mega.Gnarly 1.4 | 3.5 | 12.3% | 33 |
| cs.Wren 1.0 | 5.2 | 10.9% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.0 | 9.5% | 6 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.4% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.8% | 3 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 71.7 | 9 / 35 | 4181 |
| 2 | 1 | 64.6 | 77.1 | 13 / 35 | 4271 |
| 3 | 1 | 65.7 | 80.0 | 13 / 35 | 4686 |
| 4 | 1 | 65.1 | 78.4 | 14 / 35 | 4477 |
| 5 | 1 | 65.5 | 79.4 | 13 / 35 | 4512 |
| 6 | 1 | 64.6 | 77.5 | 11 / 35 | 4583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 34 | 56% |
| bts.mega.Gnarly 1.4 | 21 | 71% |
| cs.Wren 1.0 | 18 | 89% |
| bvh.mini.Freya 0.55 | 17 | 76% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 90% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kdf.KoulDestroyer 1.0 | 1 | 0% |

Hadur died in 137 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 45 | 33% | 66 |
| bts.mega.Gnarly 1.4 | 33 | 24% | 48 |
| bvh.mini.Freya 0.55 | 22 | 16% | 29 |
| cs.Wren 1.0 | 16 | 12% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 8% | 28 |
| kdf.KoulDestroyer 1.0 | 4 | 3% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.6 | 76 / 210 | 2.83 | 16.9% | 30085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 16.9% | 76 |
| bvh.fry.Freya 0.82 | 1.8 | 15.5% | 42 |
| az.Ololobot 0.2.4 | 3.3 | 11.9% | 47 |
| catcat20.Lambda 0.024 | 4.2 | 10.6% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.7% | 4 |
| gimp.GimpBot 0.1 | 6.7 | 8.1% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.9% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.9% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 75.2 | 9 / 35 | 4973 |
| 2 | 1 | 66.8 | 84.4 | 16 / 35 | 4997 |
| 3 | 1 | 66.0 | 79.7 | 16 / 35 | 4865 |
| 4 | 1 | 63.5 | 75.2 | 10 / 35 | 4648 |
| 5 | 1 | 66.3 | 82.2 | 14 / 35 | 5161 |
| 6 | 1 | 66.4 | 81.0 | 11 / 35 | 5441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 41 | 59% |
| az.Ololobot 0.2.4 | 29 | 59% |
| catcat20.Lambda 0.024 | 24 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 80% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 58 | 43% | 78 |
| az.Ololobot 0.2.4 | 24 | 18% | 48 |
| catcat20.Lambda 0.024 | 19 | 14% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 12% | 19 |
| gimp.GimpBot 0.1 | 7 | 5% | 13 |
| apollokidd.ApolloKidd 0.9 | 6 | 4% | 12 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.9 | 110 / 210 | 2.63 | 17.9% | 29298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.9% | 110 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.5% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.2% | 23 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.8% | 14 |
| mz.AntiGrav 1.0 | 4.7 | 10.9% | 6 |
| stelo.Randomness 1.0 | 5.8 | 9.5% | 11 |
| alpha.BlackIce 1.0 | 6.7 | 8.9% | 7 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.0% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.5% | 0 |
| sample.Corners 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.5 | 19 / 35 | 4960 |
| 2 | 1 | 67.5 | 85.1 | 19 / 35 | 4803 |
| 3 | 1 | 68.5 | 85.7 | 21 / 35 | 4975 |
| 4 | 1 | 66.7 | 79.7 | 18 / 35 | 4876 |
| 5 | 1 | 66.4 | 79.0 | 17 / 35 | 4778 |
| 6 | 1 | 66.2 | 78.1 | 16 / 35 | 4906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 54 | 80% |
| kano.gamma.KanoGamma 1.8 | 25 | 68% |
| Polkwane.SmashMelee 1.0 | 19 | 84% |
| mz.AntiGrav 1.0 | 16 | 100% |
| stelo.Randomness 1.0 | 12 | 92% |
| alpha.BlackIce 1.0 | 3 | 33% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 37 | 37% | 65 |
| kano.gamma.KanoGamma 1.8 | 21 | 21% | 45 |
| stelo.Randomness 1.0 | 12 | 12% | 25 |
| Polkwane.SmashMelee 1.0 | 11 | 11% | 27 |
| mz.AntiGrav 1.0 | 9 | 9% | 23 |
| alpha.BlackIce 1.0 | 6 | 6% | 11 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 4 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 8 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.8 | 87 / 210 | 2.64 | 16.9% | 26310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.3 | 16.9% | 87 |
| eem.EvBotNG v12.8 | 1.7 | 16.5% | 81 |
| ary.Swarm 1.1 | 3.5 | 12.9% | 17 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.3% | 12 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.8% | 7 |
| shrub.Silver v048 | 6.2 | 8.4% | 1 |
| zyx.nano.Ant 1.1 | 7.2 | 7.5% | 0 |
| stelo.Mirror 1.1 | 8.2 | 6.3% | 3 |
| jsal.Jsalbot 1.0 | 8.5 | 5.8% | 3 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 82.9 | 12 / 35 | 4312 |
| 2 | 1 | 68.0 | 87.0 | 17 / 35 | 4603 |
| 3 | 1 | 66.7 | 84.4 | 17 / 35 | 4225 |
| 4 | 1 | 66.5 | 81.9 | 14 / 35 | 4631 |
| 5 | 2 | 63.9 | 73.0 | 12 / 35 | 4096 |
| 6 | 1 | 66.4 | 81.6 | 15 / 35 | 4443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 58 | 48% |
| lessonz.robocode.Oz 0.5.0 | 25 | 92% |
| ary.Swarm 1.1 | 21 | 71% |
| simonton.nano.MeleeSeed 1.8 | 16 | 94% |
| stelo.Mirror 1.1 | 4 | 75% |
| shrub.Silver v048 | 3 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 56 | 46% | 85 |
| ary.Swarm 1.1 | 24 | 20% | 45 |
| lessonz.robocode.Oz 0.5.0 | 21 | 17% | 36 |
| simonton.nano.MeleeSeed 1.8 | 10 | 8% | 22 |
| zyx.nano.Ant 1.1 | 6 | 5% | 7 |
| stelo.Mirror 1.1 | 3 | 2% | 7 |
| shrub.Silver v048 | 3 | 2% | 6 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |

## Melee bench: F42

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.4 | 88 / 210 | 2.76 | 17.1% | 30463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 17.1% | 88 |
| wompi.Wallaby 5.1 | 1.8 | 16.3% | 65 |
| ara.Shera 0.88 | 3.0 | 13.8% | 35 |
| maribo.mini.MiniQuester 0.1 | 4.0 | 12.5% | 17 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 2 |
| maribo.IotaCT 1.1 | 6.5 | 7.3% | 0 |
| dsw.StaticD 1.0 | 6.5 | 7.4% | 3 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.0% | 0 |
| mme.NikeEnhanced 2.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 78.1 | 14 / 35 | 4897 |
| 2 | 1 | 65.9 | 78.7 | 14 / 35 | 4945 |
| 3 | 1 | 67.2 | 81.9 | 15 / 35 | 5360 |
| 4 | 1 | 66.9 | 80.3 | 18 / 35 | 5206 |
| 5 | 1 | 66.7 | 82.5 | 13 / 35 | 4980 |
| 6 | 1 | 66.3 | 81.0 | 14 / 35 | 5075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 53 | 83% |
| ara.Shera 0.88 | 29 | 52% |
| maribo.mini.MiniQuester 0.1 | 25 | 92% |
| dsw.StaticD 1.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 47 | 38% | 85 |
| ara.Shera 0.88 | 39 | 32% | 54 |
| maribo.mini.MiniQuester 0.1 | 21 | 17% | 46 |
| amz.NanoClone 1.41 | 6 | 5% | 7 |
| dsw.StaticD 1.0 | 4 | 3% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 4 |
| maribo.IotaCT 1.1 | 2 | 2% | 3 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 3 |

## Melee bench: F43

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 72.6 | 16 / 210 | 3.47 | 14.2% | 23215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 159 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 14.2% | 16 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.8% | 21 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.3% | 8 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.2% | 5 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 1 |
| jab.DiamondStealer 5 | 7.2 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 76.5 | 3 / 35 | 4242 |
| 2 | 2 | 62.9 | 72.7 | 2 / 35 | 3723 |
| 3 | 2 | 63.2 | 72.1 | 2 / 35 | 3928 |
| 4 | 2 | 62.2 | 70.5 | 0 / 35 | 3594 |
| 5 | 2 | 62.8 | 73.3 | 6 / 35 | 3561 |
| 6 | 2 | 62.9 | 70.5 | 3 / 35 | 4167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 60 | 7% |
| brainfade.melee.Dusk 0.44 | 6 | 83% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 67% |
| dummy.micro.Sparrow 2.5 | 4 | 50% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |

Hadur died in 194 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100 | 52% | 105 |
| brainfade.melee.Dusk 0.44 | 27 | 14% | 30 |
| dummy.micro.Sparrow 2.5 | 23 | 12% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 17 | 9% | 20 |
| Krabb.akim2.Akim2 1.1b | 12 | 6% | 12 |
| jab.DiamondStealer 5 | 10 | 5% | 10 |
| mz.NanoGod 2.02 | 4 | 2% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.5 | 112 / 210 | 2.21 | 19.1% | 33447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.1% | 112 |
| stelo.Liblix 0.3.1 | 2.3 | 15.3% | 53 |
| tzu.TheArtOfWar 1.2 | 2.7 | 13.5% | 30 |
| wompi.Quokka 1.6 | 4.3 | 9.8% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.6% | 3 |
| jwirde.Gort 2.0 | 5.8 | 8.9% | 2 |
| disan.Chair 2.2.0 | 6.7 | 7.8% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.9% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.0 | 5.0% | 0 |
| sample.Crazy 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.9 | 23 / 35 | 5891 |
| 2 | 1 | 68.2 | 85.4 | 15 / 35 | 5472 |
| 3 | 1 | 68.0 | 82.9 | 18 / 35 | 5415 |
| 4 | 1 | 69.5 | 88.9 | 19 / 35 | 5477 |
| 5 | 1 | 70.6 | 90.8 | 21 / 35 | 5921 |
| 6 | 1 | 67.7 | 82.2 | 16 / 35 | 5271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 66 | 73% |
| tzu.TheArtOfWar 1.2 | 46 | 61% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 100% |
| wompi.Quokka 1.6 | 11 | 64% |
| disan.Chair 2.2.0 | 7 | 86% |
| jwirde.Gort 2.0 | 7 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 35 | 36% | 91 |
| tzu.TheArtOfWar 1.2 | 28 | 29% | 58 |
| wompi.Quokka 1.6 | 14 | 14% | 22 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 9% | 17 |
| disan.Chair 2.2.0 | 4 | 4% | 7 |
| stf.PanzerGeneral 0.1 | 4 | 4% | 5 |
| jwirde.Gort 2.0 | 3 | 3% | 9 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.7 | 95 / 210 | 2.11 | 19.9% | 36555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.9% | 95 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.6% | 96 |
| jje.BagPuss 1.2 | 3.2 | 12.2% | 7 |
| sul.Lunar 1.1 | 4.2 | 10.3% | 5 |
| myl.nano.Graviton 1.10 | 4.8 | 10.2% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.5% | 2 |
| fm.claire 1.7 | 7.0 | 8.1% | 0 |
| hvilela.HVilela 0.9 | 7.5 | 7.7% | 0 |
| wit.Deep7 2.0 | 8.8 | 5.7% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.7 | 16 / 35 | 5991 |
| 2 | 1 | 68.4 | 83.2 | 15 / 35 | 5767 |
| 3 | 1 | 70.1 | 87.9 | 16 / 35 | 6376 |
| 4 | 1 | 69.9 | 88.9 | 14 / 35 | 6184 |
| 5 | 1 | 70.6 | 88.6 | 18 / 35 | 6276 |
| 6 | 1 | 70.1 | 90.8 | 16 / 35 | 5961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 101 | 37% |
| sul.Lunar 1.1 | 17 | 100% |
| jje.BagPuss 1.2 | 17 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 100% |
| myl.nano.Graviton 1.10 | 7 | 100% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 56% | 0 |
| jje.BagPuss 1.2 | 15 | 13% | 63 |
| myl.nano.Graviton 1.10 | 10 | 9% | 30 |
| sul.Lunar 1.1 | 8 | 7% | 57 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 6% | 23 |
| hvilela.HVilela 0.9 | 4 | 3% | 7 |
| abud.ThirdRobo 1.0 | 3 | 3% | 7 |
| wit.Deep7 2.0 | 2 | 2% | 11 |
| fm.claire 1.7 | 2 | 2% | 9 |

## Melee bench: F46

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.7 | 49 / 210 | 2.92 | 15.9% | 27035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.4% | 68 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.3% | 78 |
| hadur117.mini.DeiseW 0.2 | 2.5 | 15.9% | 49 |
| mz.MicroSheep 1.0 | 4.2 | 10.5% | 3 |
| cx.Princess 1.0 | 5.3 | 9.7% | 10 |
| sadoner.killer 0.2 | 5.5 | 8.9% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.0% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 76.2 | 10 / 35 | 4472 |
| 2 | 1 | 66.4 | 83.8 | 11 / 35 | 4837 |
| 3 | 2 | 65.8 | 81.6 | 7 / 35 | 4755 |
| 4 | 3 | 64.7 | 78.7 | 8 / 35 | 4287 |
| 5 | 3 | 64.4 | 74.6 | 7 / 35 | 4587 |
| 6 | 3 | 63.4 | 77.1 | 6 / 35 | 4097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 53 | 55% |
| rsalesc.melee.Medina 0.4.5 | 31 | 29% |
| cx.Princess 1.0 | 9 | 44% |
| mz.MicroSheep 1.0 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 81 | 50% | 111 |
| rsalesc.melee.Medina 0.4.5 | 51 | 32% | 59 |
| cx.Princess 1.0 | 12 | 7% | 13 |
| mz.MicroSheep 1.0 | 6 | 4% | 9 |
| sadoner.killer 0.2 | 5 | 3% | 7 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |

