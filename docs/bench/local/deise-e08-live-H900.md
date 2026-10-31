# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.0 | 45 / 210 | 2.26 | 17.7% | 33827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 143 |
| hadur117.mini.DeiseH900 0.4 | 2.0 | 17.7% | 45 |
| sgp.JollyNinja 3.53 | 4.0 | 10.6% | 11 |
| mz.MicroGodMelee 1 | 4.3 | 10.7% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.6% | 4 |
| lorneswork.Predator 1.0 | 5.2 | 9.8% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.7% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 88.3 | 8 / 35 | 5654 |
| 2 | 2 | 67.3 | 83.2 | 7 / 35 | 5689 |
| 3 | 2 | 68.0 | 87.0 | 8 / 35 | 5402 |
| 4 | 2 | 66.6 | 83.5 | 8 / 35 | 5312 |
| 5 | 2 | 68.9 | 87.9 | 8 / 35 | 6204 |
| 6 | 2 | 67.3 | 86.3 | 6 / 35 | 5566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 127 | 13% |
| sgp.JollyNinja 3.53 | 12 | 67% |
| mz.MicroGodMelee 1 | 9 | 78% |
| lorneswork.Predator 1.0 | 7 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 86% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 50% |

Hadur died in 165 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 122 | 74% | 140 |
| sgp.JollyNinja 3.53 | 15 | 9% | 20 |
| mz.MicroGodMelee 1 | 10 | 6% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 5% | 11 |
| lorneswork.Predator 1.0 | 8 | 5% | 16 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 3 |
| adt.Ar2 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 78.7 | 76 / 210 | 2.92 | 17.5% | 32489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 17.5% | 76 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 15.1% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.0% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.8 | 9.1% | 6 |
| Noran.BitchingElk 0.054 | 6.5 | 7.8% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.8% | 4 |
| sch.Simone 0.3d | 6.8 | 8.2% | 11 |
| stelo.PatternRobot 1.0 | 9.0 | 6.1% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.3 | 12 / 35 | 5657 |
| 2 | 1 | 65.3 | 76.5 | 12 / 35 | 4929 |
| 3 | 1 | 67.2 | 82.2 | 12 / 35 | 5340 |
| 4 | 1 | 64.7 | 72.1 | 12 / 35 | 5345 |
| 5 | 1 | 68.3 | 81.9 | 16 / 35 | 5761 |
| 6 | 1 | 66.9 | 79.0 | 12 / 35 | 5457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 41% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 30 | 50% |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 79% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| sch.Simone 0.3d | 10 | 60% |
| Noran.BitchingElk 0.054 | 9 | 67% |
| stelo.PatternRobot 1.0 | 6 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 43 | 32% | 63 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 38 | 28% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 11% | 21 |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 7% | 22 |
| Noran.BitchingElk 0.054 | 8 | 6% | 12 |
| sch.Simone 0.3d | 7 | 5% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6 | 4% | 12 |
| stelo.PatternRobot 1.0 | 5 | 4% | 9 |
| fullsail.SweetTea 1.1 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.3 | 127 / 210 | 1.96 | 20.0% | 39721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 20.0% | 127 |
| radnor.DoctorBob 1.42 | 2.2 | 13.8% | 29 |
| vuen.Cake 2.51 | 3.3 | 12.7% | 35 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.7% | 17 |
| urdos.URDOS 1.3 | 5.0 | 8.9% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.2% | 1 |
| oa.weak.FlyMk1 0.1 | 8.2 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.3 | 19 / 35 | 6879 |
| 2 | 1 | 70.9 | 91.1 | 25 / 35 | 6621 |
| 3 | 1 | 70.7 | 91.1 | 21 / 35 | 6845 |
| 4 | 1 | 69.6 | 88.6 | 22 / 35 | 6526 |
| 5 | 1 | 68.1 | 85.1 | 15 / 35 | 6206 |
| 6 | 1 | 71.0 | 92.7 | 25 / 35 | 6644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 53 | 94% |
| vuen.Cake 2.51 | 50 | 68% |
| radnor.DoctorBob 1.42 | 43 | 74% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 27 | 33% | 65 |
| radnor.DoctorBob 1.42 | 25 | 30% | 47 |
| kawigi.nano.Lib 1.0 | 18 | 22% | 69 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 5% | 2 |
| adt.Ar1 2.1 | 3 | 4% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 2% | 5 |
| urdos.URDOS 1.3 | 2 | 2% | 5 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 78.6 | 9 / 210 | 2.93 | 16.5% | 35472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 187 |
| hadur117.mini.DeiseH900 0.4 | 2.0 | 16.5% | 9 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 8 |
| TNT.TNT 0.99.1 | 4.0 | 10.5% | 3 |
| josago.Jorgito 0.16 | 5.2 | 8.9% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.2% | 1 |
| tj.zombie1n 1.0.1 | 6.8 | 6.8% | 1 |
| rampancy.Durandal 2.1d | 8.2 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 8.8 | 4.9% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 74.9 | 3 / 35 | 5731 |
| 2 | 2 | 65.8 | 75.2 | 0 / 35 | 5847 |
| 3 | 2 | 66.6 | 78.4 | 4 / 35 | 6036 |
| 4 | 2 | 67.0 | 81.0 | 0 / 35 | 6104 |
| 5 | 2 | 65.8 | 77.5 | 1 / 35 | 5603 |
| 6 | 2 | 68.0 | 84.4 | 1 / 35 | 6151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 114 | 5% |
| apc.LeeroyJenkins2 1.0 | 5 | 40% |
| css.Delitioner 0.11 | 1 | 0% |
| tj.zombie1n 1.0.1 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 201 of 210 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 128 | 64% | 135 |
| apc.LeeroyJenkins2 1.0 | 31 | 15% | 33 |
| josago.Jorgito 0.16 | 15 | 7% | 15 |
| TNT.TNT 0.99.1 | 11 | 5% | 12 |
| css.Delitioner 0.11 | 7 | 3% | 7 |
| rampancy.Durandal 2.1d | 4 | 2% | 4 |
| tj.zombie1n 1.0.1 | 3 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 68.7 | 9 / 210 | 3.82 | 13.3% | 23192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.5% | 118 |
| justin.DemonicRage 3.4 | 1.7 | 17.0% | 62 |
| hadur117.mini.DeiseH900 0.4 | 3.0 | 13.3% | 9 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 12 |
| ms.Ares 0.19 | 5.3 | 9.1% | 4 |
| axeBots.HataMoto 3.09 | 5.7 | 9.2% | 6 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 70.2 | 1 / 35 | 3679 |
| 2 | 3 | 61.4 | 69.8 | 2 / 35 | 4025 |
| 3 | 3 | 60.7 | 68.9 | 3 / 35 | 3889 |
| 4 | 3 | 60.2 | 67.3 | 1 / 35 | 3688 |
| 5 | 3 | 60.7 | 68.6 | 2 / 35 | 3808 |
| 6 | 3 | 61.0 | 67.3 | 0 / 35 | 4103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 22 | 14% |
| justin.DemonicRage 3.4 | 19 | 5% |
| axeBots.HataMoto 3.09 | 5 | 40% |
| wompi.Numbat 2.1 | 5 | 20% |
| ms.Ares 0.19 | 3 | 33% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 72 | 36% | 76 |
| justin.DemonicRage 3.4 | 54 | 27% | 55 |
| wompi.Numbat 2.1 | 36 | 18% | 36 |
| ms.Ares 0.19 | 17 | 8% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 4% | 8 |
| supersample.SuperBoxBot 1.0 | 8 | 4% | 8 |
| axeBots.HataMoto 3.09 | 6 | 3% | 8 |
| Queens_teamrobot.UltraRazor 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 79.2 | 62 / 210 | 2.87 | 16.9% | 30369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 16.9% | 62 |
| jekl.StoneGhost 0.7 | 2.2 | 15.0% | 45 |
| origin.SleepSiphon 1.7b | 3.2 | 13.4% | 57 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 13.0% | 34 |
| mld.Wisdom 1.0 | 5.2 | 10.0% | 5 |
| gg.Wolverine 2.0 | 5.8 | 8.6% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.0% | 4 |
| DBall.NUKE 0.1 | 7.8 | 6.7% | 0 |
| spinnercat.Omen 1.0 | 8.8 | 6.3% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 79.0 | 8 / 35 | 4886 |
| 2 | 1 | 65.9 | 78.4 | 11 / 35 | 5062 |
| 3 | 1 | 65.1 | 76.5 | 11 / 35 | 4789 |
| 4 | 1 | 66.4 | 80.6 | 10 / 35 | 5147 |
| 5 | 1 | 65.2 | 77.8 | 9 / 35 | 5062 |
| 6 | 1 | 67.9 | 82.9 | 13 / 35 | 5423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 33 | 73% |
| origin.SleepSiphon 1.7b | 25 | 20% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 64% |
| gg.Wolverine 2.0 | 8 | 100% |
| mld.Wisdom 1.0 | 8 | 75% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 42 | 28% | 64 |
| pe.minimelee.SandboxMiniMelee 1.1 | 39 | 26% | 51 |
| origin.SleepSiphon 1.7b | 38 | 25% | 48 |
| mld.Wisdom 1.0 | 17 | 11% | 24 |
| gg.Wolverine 2.0 | 8 | 5% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 2% | 4 |
| spinnercat.Omen 1.0 | 1 | 1% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 85.8 | 56 / 210 | 2.28 | 18.7% | 38662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.3 | 18.7% | 56 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 18.4% | 73 |
| rtk.Tachikoma 1.0 | 2.7 | 16.7% | 60 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.0% | 12 |
| franzor.Lizt 1.3.1 | 4.8 | 10.4% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.8% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.0 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 84.1 | 7 / 35 | 6136 |
| 2 | 1 | 70.5 | 85.4 | 13 / 35 | 6511 |
| 3 | 1 | 69.3 | 84.8 | 9 / 35 | 6256 |
| 4 | 1 | 70.6 | 87.6 | 8 / 35 | 7020 |
| 5 | 1 | 71.1 | 88.9 | 14 / 35 | 6615 |
| 6 | 2 | 68.9 | 84.1 | 5 / 35 | 6124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 77 | 45% |
| rsalesc.melee.Monk 0.3.6c | 47 | 15% |
| franzor.Lizt 1.3.1 | 9 | 67% |
| oog.melee.CapuletDroid 1.1 | 8 | 88% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 1042. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 69 | 45% | 98 |
| rsalesc.melee.Monk 0.3.6c | 67 | 43% | 81 |
| oog.melee.CapuletDroid 1.1 | 11 | 7% | 21 |
| franzor.Lizt 1.3.1 | 6 | 4% | 2 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 5 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.6 | 93 / 210 | 2.30 | 18.6% | 32747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 18.6% | 93 |
| tm.Yuugao 1.0 | 2.3 | 13.3% | 56 |
| shrub.Vapour v159 | 2.7 | 11.9% | 25 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.4% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.6% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.7% | 9 |
| m3thos.Eva00 1.1 | 7.0 | 8.1% | 1 |
| SHAM.WOW 1.4 | 8.7 | 7.0% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.8 | 20 / 35 | 5701 |
| 2 | 1 | 66.0 | 78.1 | 12 / 35 | 5654 |
| 3 | 1 | 66.6 | 85.7 | 13 / 35 | 4945 |
| 4 | 1 | 67.4 | 86.0 | 13 / 35 | 5272 |
| 5 | 1 | 68.8 | 87.3 | 18 / 35 | 5606 |
| 6 | 1 | 68.4 | 86.7 | 17 / 35 | 5569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 42 | 40% |
| shrub.Vapour v159 | 26 | 58% |
| Krabb.sliNk.Garm 0.9u | 24 | 63% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 76% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 88% |
| m3thos.Eva00 1.1 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 45 | 38% | 66 |
| shrub.Vapour v159 | 28 | 24% | 45 |
| Krabb.sliNk.Garm 0.9u | 22 | 18% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 8% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 6% | 18 |
| m3thos.Eva00 1.1 | 2 | 2% | 10 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 3 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 5 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 69.5 | 32 / 210 | 3.74 | 14.7% | 26630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 16.7% | 98 |
| hadur117.mini.DeiseH900 0.4 | 2.2 | 14.7% | 32 |
| kc.micro.Figment 1.0 | 2.7 | 14.6% | 42 |
| yagami.Tidus 0.11 | 4.0 | 11.3% | 4 |
| pedersen.Grishnakh 1.0 | 5.3 | 10.4% | 18 |
| mc2.enemy.Original 0.9 | 5.7 | 9.7% | 15 |
| dft.Calliope 5.6 | 7.0 | 7.2% | 1 |
| step.nanoPri 1.0 | 8.3 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 74.0 | 4 / 35 | 4743 |
| 2 | 1 | 65.2 | 77.5 | 10 / 35 | 4553 |
| 3 | 3 | 61.6 | 66.0 | 6 / 35 | 4334 |
| 4 | 2 | 61.9 | 70.2 | 4 / 35 | 4294 |
| 5 | 2 | 62.1 | 67.3 | 7 / 35 | 4443 |
| 6 | 3 | 59.2 | 62.2 | 1 / 35 | 4263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 35 | 14% |
| kc.micro.Figment 1.0 | 24 | 46% |
| yagami.Tidus 0.11 | 11 | 91% |
| pedersen.Grishnakh 1.0 | 6 | 67% |
| mc2.enemy.Original 0.9 | 3 | 67% |

Hadur died in 179 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 51 | 28% | 57 |
| kc.micro.Figment 1.0 | 48 | 27% | 64 |
| mc2.enemy.Original 0.9 | 25 | 14% | 28 |
| yagami.Tidus 0.11 | 21 | 12% | 26 |
| pedersen.Grishnakh 1.0 | 20 | 11% | 22 |
| dft.Calliope 5.6 | 8 | 4% | 8 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.8 | 123 / 210 | 1.82 | 19.9% | 36898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 19.9% | 123 |
| DTF.Kludgy 1.2b | 2.0 | 14.5% | 40 |
| ne.Chimera 1.2 | 3.7 | 12.0% | 16 |
| ejb.Polaris 1.0.1 | 3.7 | 12.0% | 13 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.0% | 9 |
| vStar.RAFzilla 2.15 | 5.5 | 10.1% | 5 |
| sam.Samspin 1.0 | 7.7 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.6% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.3% | 1 |
| donjezza.Muncho 1.0 | 9.3 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 93.0 | 21 / 35 | 5562 |
| 2 | 1 | 70.2 | 91.1 | 21 / 35 | 6065 |
| 3 | 1 | 68.6 | 83.8 | 19 / 35 | 6135 |
| 4 | 1 | 70.3 | 91.7 | 19 / 35 | 6179 |
| 5 | 1 | 71.5 | 94.3 | 23 / 35 | 6513 |
| 6 | 1 | 70.6 | 91.1 | 20 / 35 | 6444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 52 | 50% |
| ejb.Polaris 1.0.1 | 35 | 80% |
| ne.Chimera 1.2 | 32 | 75% |
| vStar.RAFzilla 2.15 | 22 | 82% |
| tvv.micro.Antares 1.1.1 | 18 | 72% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 5 | 60% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 37 | 43% | 64 |
| ne.Chimera 1.2 | 17 | 20% | 38 |
| ejb.Polaris 1.0.1 | 10 | 11% | 36 |
| vStar.RAFzilla 2.15 | 10 | 11% | 25 |
| tvv.micro.Antares 1.1.1 | 7 | 8% | 16 |
| donjezza.Muncho 1.0 | 3 | 3% | 5 |
| kurios.DOSexe .9b | 2 | 2% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 3 |
| sam.Samspin 1.0 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 75.0 | 44 / 210 | 3.25 | 15.7% | 27997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 17.0% | 93 |
| hadur117.mini.DeiseH900 0.4 | 1.8 | 15.7% | 44 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.4% | 25 |
| djc.DynaBot 0.1.1 | 4.0 | 11.2% | 20 |
| br2.MobyDickBot 1.6 | 5.8 | 9.0% | 10 |
| rdt199.Warlord 0.73 | 5.8 | 9.2% | 11 |
| uji.YellohFellah 1.0 | 6.8 | 8.2% | 11 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.1% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 5.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 79.4 | 10 / 35 | 5220 |
| 2 | 2 | 63.8 | 73.7 | 6 / 35 | 4572 |
| 3 | 2 | 64.0 | 75.2 | 7 / 35 | 4767 |
| 4 | 2 | 62.8 | 72.7 | 6 / 35 | 4338 |
| 5 | 2 | 62.7 | 74.0 | 6 / 35 | 4330 |
| 6 | 2 | 64.2 | 74.9 | 9 / 35 | 4770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 43 | 30% |
| cx.mini.Nimrod 0.55 | 18 | 67% |
| djc.DynaBot 0.1.1 | 10 | 70% |
| br2.MobyDickBot 1.6 | 8 | 50% |
| rdt199.Warlord 0.73 | 8 | 50% |
| uji.YellohFellah 1.0 | 5 | 60% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 86 | 51% | 97 |
| cx.mini.Nimrod 0.55 | 26 | 16% | 35 |
| rdt199.Warlord 0.73 | 14 | 8% | 22 |
| djc.DynaBot 0.1.1 | 12 | 7% | 20 |
| br2.MobyDickBot 1.6 | 11 | 7% | 15 |
| uji.YellohFellah 1.0 | 8 | 5% | 10 |
| stelo.MirrorNano 1.3 | 4 | 2% | 4 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.1 | 72 / 210 | 2.88 | 16.5% | 25869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 16.5% | 72 |
| darkcanuck.Leon 1.01 | 2.7 | 13.6% | 39 |
| nat.PallasHawk 1.0 | 3.2 | 13.7% | 44 |
| bts.wiki.RipCurl 0.9b | 3.2 | 13.3% | 37 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.8% | 13 |
| jrm.Test0 1.0 | 6.2 | 8.0% | 0 |
| jp.Perpy 16.0 | 7.2 | 6.8% | 0 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.6% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.4% | 3 |
| stuff.Vlad 0.1 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.9 | 11 / 35 | 4828 |
| 2 | 1 | 65.9 | 79.7 | 12 / 35 | 4527 |
| 3 | 1 | 62.9 | 72.7 | 11 / 35 | 3969 |
| 4 | 1 | 67.2 | 85.1 | 16 / 35 | 4502 |
| 5 | 1 | 63.8 | 75.2 | 10 / 35 | 4073 |
| 6 | 1 | 64.7 | 79.0 | 12 / 35 | 3970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 45 | 53% |
| nat.PallasHawk 1.0 | 32 | 56% |
| bts.wiki.RipCurl 0.9b | 26 | 69% |
| brainfade.melee.Genghis 0.36 | 13 | 54% |
| jaybot.bots.Oddball 4.0 | 4 | 50% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 35 | 25% | 53 |
| darkcanuck.Leon 1.01 | 32 | 23% | 66 |
| nat.PallasHawk 1.0 | 28 | 20% | 39 |
| brainfade.melee.Genghis 0.36 | 20 | 14% | 20 |
| cs.sheldor.Talon 1.1 | 11 | 8% | 11 |
| jrm.Test0 1.0 | 8 | 6% | 12 |
| jaybot.bots.Oddball 4.0 | 2 | 1% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| jp.Perpy 16.0 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 79.2 | 50 / 210 | 2.88 | 16.2% | 29223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.6% | 89 |
| ags.Glacier 0.2.11 | 2.2 | 16.4% | 43 |
| hadur117.mini.DeiseH900 0.4 | 2.2 | 16.2% | 50 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 17 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.2% | 10 |
| apc.Colossus2 0.17 | 6.2 | 7.9% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.2% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.6 | 77.1 | 7 / 35 | 5145 |
| 2 | 3 | 64.8 | 78.4 | 6 / 35 | 4676 |
| 3 | 2 | 65.5 | 77.1 | 10 / 35 | 4944 |
| 4 | 1 | 65.7 | 82.5 | 10 / 35 | 4701 |
| 5 | 2 | 66.5 | 81.0 | 8 / 35 | 5018 |
| 6 | 2 | 65.5 | 78.7 | 9 / 35 | 4739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 50 | 32% |
| ags.Glacier 0.2.11 | 38 | 61% |
| shinh.Entangled 0.3 | 12 | 67% |
| gh.micro.Gruweltje 0.7 | 5 | 60% |
| stelo.Wang 1.0 | 1 | 0% |

Hadur died in 160 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 70 | 44% | 84 |
| ags.Glacier 0.2.11 | 43 | 27% | 62 |
| shinh.Entangled 0.3 | 23 | 14% | 31 |
| gh.micro.Gruweltje 0.7 | 13 | 8% | 19 |
| stelo.Wang 1.0 | 7 | 4% | 8 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |

## Melee bench: F14

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.1 | 116 / 210 | 1.89 | 20.0% | 37982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 20.0% | 116 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 42 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 36 |
| sanyi.mikrobi.Roberto 1.0 | 4.5 | 10.1% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.3% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.6% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.7 | 8.4% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.1% | 10 |
| pa.Improved 1.0 | 9.0 | 5.6% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.7 | 21 / 35 | 6425 |
| 2 | 1 | 70.2 | 91.1 | 19 / 35 | 6036 |
| 3 | 1 | 70.4 | 90.5 | 23 / 35 | 6063 |
| 4 | 1 | 71.1 | 91.7 | 20 / 35 | 6448 |
| 5 | 1 | 70.3 | 87.9 | 20 / 35 | 6555 |
| 6 | 1 | 69.2 | 86.7 | 13 / 35 | 6455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 70% |
| catcat20.shape.Theta 0.018 | 50 | 48% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 88% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 95 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 37 | 39% | 89 |
| catcat20.shape.Theta 0.018 | 35 | 37% | 55 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 7% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 4% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 2% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 2% | 2 |
| pa.Improved 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.9 | 50 / 210 | 3.35 | 16.3% | 32532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.2 | 16.3% | 50 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.8% | 43 |
| emp.Yngwie 1.11 | 3.2 | 12.9% | 61 |
| mld.DustBunny 3.8 | 4.2 | 12.0% | 13 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.5% | 10 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.5% | 28 |
| lambdaxy.TBot 0.1 | 7.5 | 6.3% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 70.2 | 5 / 35 | 5559 |
| 2 | 1 | 66.0 | 75.9 | 8 / 35 | 5749 |
| 3 | 1 | 64.6 | 74.0 | 10 / 35 | 4984 |
| 4 | 1 | 66.4 | 77.8 | 9 / 35 | 5726 |
| 5 | 1 | 65.0 | 74.6 | 13 / 35 | 5122 |
| 6 | 2 | 64.1 | 71.1 | 5 / 35 | 5392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 23 | 70% |
| emp.Yngwie 1.11 | 20 | 25% |
| kawigi.robot.Girl 1.2 | 15 | 53% |
| mld.DustBunny 3.8 | 12 | 75% |
| cb.nano.Insomnia 1.0 | 9 | 89% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 25% | 47 |
| kawigi.micro.Shiz 1.1 | 36 | 23% | 51 |
| mld.DustBunny 3.8 | 31 | 19% | 48 |
| cb.nano.Insomnia 1.0 | 23 | 14% | 23 |
| kawigi.robot.Girl 1.2 | 18 | 11% | 20 |
| divineomega.TrialBot 0.003 | 7 | 4% | 11 |
| Grystrion.TrackerWO 1.0 | 3 | 2% | 4 |
| lambdaxy.TBot 0.1 | 2 | 1% | 5 |

## Melee bench: F16

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.0 | 71 / 210 | 2.71 | 18.6% | 38435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 18.6% | 71 |
| gh.Griezel 0.5.2 | 2.0 | 15.8% | 71 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 13 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.4% | 35 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.8% | 5 |
| tvv.nano.Polaris 1.2 | 6.3 | 8.5% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 8.2% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.7% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 4.8% | 0 |
| asd.Cthulhu 1.3 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 78.4 | 16 / 35 | 6335 |
| 2 | 1 | 66.4 | 76.5 | 8 / 35 | 6096 |
| 3 | 1 | 68.2 | 80.3 | 11 / 35 | 6213 |
| 4 | 1 | 69.1 | 83.8 | 10 / 35 | 6746 |
| 5 | 1 | 69.2 | 82.5 | 13 / 35 | 6700 |
| 6 | 1 | 69.4 | 84.4 | 13 / 35 | 6345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 67 | 42% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 78% |
| techdude.forest.FlamingForest 1.1 | 11 | 18% |
| stelo.IntrinsicVolatility 1.4 | 7 | 86% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 60% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 63 | 45% | 91 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 30 | 22% | 50 |
| techdude.forest.FlamingForest 1.1 | 16 | 12% | 19 |
| bvh.fnr.Fenrir 0.36l | 11 | 8% | 15 |
| stelo.IntrinsicVolatility 1.4 | 6 | 4% | 11 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 9 |
| divineomega.DivineBot 1.9.4.5 | 4 | 3% | 7 |
| asd.Cthulhu 1.3 | 4 | 3% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 4 |

## Melee bench: F17

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.1 | 60 / 210 | 3.24 | 16.4% | 31623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.2 | 16.4% | 60 |
| et.Predator 1.8 | 2.7 | 13.4% | 32 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.8% | 40 |
| cx.BlestPain 1.41 | 3.7 | 12.4% | 41 |
| nic.Nicator 2.4 | 4.7 | 11.7% | 18 |
| ahf.NanoAndrew .4 | 5.5 | 11.0% | 17 |
| maribo.melee.BMV 0.1 | 7.0 | 9.0% | 2 |
| tex.Longbot 0.4 | 8.5 | 5.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 74.9 | 9 / 35 | 5052 |
| 2 | 1 | 66.2 | 77.5 | 11 / 35 | 5399 |
| 3 | 1 | 67.4 | 81.0 | 12 / 35 | 5668 |
| 4 | 2 | 64.6 | 74.0 | 7 / 35 | 5140 |
| 5 | 1 | 63.6 | 70.2 | 10 / 35 | 5035 |
| 6 | 1 | 64.7 | 73.0 | 11 / 35 | 5329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 36 | 56% |
| oog.melee.Mercutio 1.0 | 29 | 55% |
| nic.Nicator 2.4 | 16 | 69% |
| cx.BlestPain 1.41 | 12 | 33% |
| ahf.NanoAndrew .4 | 11 | 55% |
| maribo.melee.BMV 0.1 | 2 | 50% |
| tex.Longbot 0.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 35 | 23% | 49 |
| cx.BlestPain 1.41 | 27 | 18% | 34 |
| oog.melee.Mercutio 1.0 | 26 | 17% | 36 |
| nic.Nicator 2.4 | 25 | 17% | 40 |
| ahf.NanoAndrew .4 | 22 | 15% | 27 |
| maribo.melee.BMV 0.1 | 8 | 5% | 10 |
| tex.Longbot 0.4 | 4 | 3% | 6 |
| goblin.Bender 2.4 | 2 | 1% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.1 | 75 / 210 | 2.79 | 17.1% | 29300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 17.1% | 75 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.3% | 42 |
| agd.Mooserwirt2 2.7 | 3.7 | 11.9% | 37 |
| uji.DBH 1.1 | 4.0 | 11.5% | 24 |
| ratosh.Nobo 0.21 | 4.5 | 10.5% | 6 |
| spinnercat.Robovirus 2.718 | 6.5 | 9.1% | 9 |
| sigterm.Sigterm 1.0 | 6.8 | 8.2% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.1% | 2 |
| stelo.WangRobot 1.0 | 9.0 | 6.1% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.2 | 13 / 35 | 5175 |
| 2 | 1 | 64.3 | 74.9 | 14 / 35 | 4718 |
| 3 | 1 | 67.1 | 82.9 | 16 / 35 | 5065 |
| 4 | 1 | 65.9 | 80.3 | 12 / 35 | 4994 |
| 5 | 1 | 65.6 | 80.3 | 10 / 35 | 4824 |
| 6 | 1 | 64.6 | 80.0 | 10 / 35 | 4524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 60% |
| uji.DBH 1.1 | 24 | 63% |
| agd.Mooserwirt2 2.7 | 22 | 18% |
| ratosh.Nobo 0.21 | 12 | 83% |
| sigterm.Sigterm 1.0 | 11 | 73% |
| stelo.WangRobot 1.0 | 10 | 70% |
| spinnercat.Robovirus 2.718 | 7 | 57% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 0% |

Hadur died in 137 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 39 | 28% | 58 |
| agd.Mooserwirt2 2.7 | 30 | 22% | 37 |
| ratosh.Nobo 0.21 | 19 | 14% | 29 |
| uji.DBH 1.1 | 14 | 10% | 17 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 7% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 6% | 18 |
| sigterm.Sigterm 1.0 | 6 | 4% | 16 |
| spinnercat.Robovirus 2.718 | 6 | 4% | 11 |
| stelo.WangRobot 1.0 | 5 | 4% | 9 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.0 | 108 / 210 | 1.99 | 19.7% | 36109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 19.7% | 108 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 15.1% | 38 |
| mld.Infinity 2.2 | 2.7 | 14.7% | 55 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.1% | 4 |
| erdnis.Rover 0.3 | 4.8 | 9.7% | 2 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.7% | 2 |
| mbh.Mbh 0.1 | 7.7 | 7.0% | 0 |
| pac.ABC 2.1 | 7.8 | 6.7% | 1 |
| pbg.R2D2 1.0 | 8.5 | 6.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.7 | 20 / 35 | 6226 |
| 2 | 1 | 70.5 | 88.9 | 16 / 35 | 6248 |
| 3 | 1 | 69.8 | 88.6 | 18 / 35 | 5590 |
| 4 | 1 | 72.4 | 94.3 | 24 / 35 | 6664 |
| 5 | 1 | 68.4 | 83.5 | 14 / 35 | 5506 |
| 6 | 1 | 69.4 | 86.0 | 16 / 35 | 5875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 72 | 65% |
| mld.Infinity 2.2 | 51 | 49% |
| krillr.mini.JointStrike 2.0.0 | 18 | 89% |
| patson.PatsonTestBot 1.0 | 11 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| erdnis.Rover 0.3 | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 48 | 47% | 113 |
| mld.Infinity 2.2 | 27 | 26% | 17 |
| krillr.mini.JointStrike 2.0.0 | 14 | 14% | 27 |
| erdnis.Rover 0.3 | 5 | 5% | 19 |
| patson.PatsonTestBot 1.0 | 5 | 5% | 15 |
| pac.ABC 2.1 | 2 | 2% | 2 |
| pbg.R2D2 1.0 | 1 | 1% | 6 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |

## Melee bench: F20

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.9 | 68 / 210 | 2.63 | 18.2% | 35798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.2 | 18.2% | 68 |
| trm.Wrekt 1.1.6.f | 1.8 | 16.2% | 68 |
| fwb.Nine 1.0.1 | 3.7 | 11.4% | 31 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.4% | 15 |
| catcat20.Rabbit 0.001 | 4.5 | 10.3% | 23 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 7.8% | 2 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.2% | 5 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.4% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.2 | 14 / 35 | 5850 |
| 2 | 1 | 67.1 | 81.6 | 11 / 35 | 5701 |
| 3 | 2 | 64.1 | 74.3 | 7 / 35 | 5165 |
| 4 | 1 | 67.7 | 82.9 | 10 / 35 | 6104 |
| 5 | 1 | 70.2 | 87.6 | 14 / 35 | 6759 |
| 6 | 1 | 68.5 | 81.9 | 12 / 35 | 6219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 53 | 55% |
| fwb.Nine 1.0.1 | 23 | 17% |
| catcat20.Rabbit 0.001 | 23 | 70% |
| nz.jdc.nano.GridFu 1.0 | 18 | 61% |
| m3thos.mini.Eva01 0.5.5 | 3 | 67% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 61 | 42% | 88 |
| fwb.Nine 1.0.1 | 25 | 17% | 21 |
| catcat20.Rabbit 0.001 | 24 | 17% | 34 |
| nz.jdc.nano.GridFu 1.0 | 16 | 11% | 30 |
| bayen.nut.Squirrel 1.615 | 6 | 4% | 14 |
| m3thos.mini.Eva01 0.5.5 | 5 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 2% | 5 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
3 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.8 | 70 / 210 | 2.37 | 18.6% | 35999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 18.6% | 70 |
| eem.EvBot v4.6.16 | 2.0 | 16.3% | 94 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 19 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 10 |
| eld.Hmm 1.0 | 5.3 | 8.7% | 15 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.4% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 1 |
| fire219.CatBot 1.0 | 7.7 | 5.9% | 0 |
| PSW.Relentless 0.1 | 9.3 | 5.1% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.3 | 14 / 35 | 5764 |
| 2 | 1 | 69.3 | 85.1 | 13 / 35 | 6290 |
| 3 | 1 | 69.6 | 87.3 | 12 / 35 | 6372 |
| 4 | 1 | 67.7 | 81.0 | 9 / 35 | 5723 |
| 5 | 1 | 69.5 | 87.0 | 13 / 35 | 6464 |
| 6 | 1 | 67.1 | 81.0 | 9 / 35 | 5386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 70 | 37% |
| dummy.mini.Scimitar 1.01 | 33 | 73% |
| cf.RiO.RiOx 4.2.1 | 18 | 78% |
| eld.Hmm 1.0 | 7 | 29% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 63 | 45% | 78 |
| dummy.mini.Scimitar 1.01 | 38 | 27% | 63 |
| cf.RiO.RiOx 4.2.1 | 23 | 16% | 37 |
| eld.Hmm 1.0 | 9 | 6% | 17 |
| oa.weak.BotherBot 0.1 | 4 | 3% | 7 |
| el.JumpShoot 0.2 | 2 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.1 | 57 / 210 | 2.61 | 17.6% | 33657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.3 | 17.6% | 57 |
| pe.SandboxDT 2.71m | 1.8 | 16.3% | 82 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.4% | 44 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 5 |
| tad.Dalek98 0.98 | 7.0 | 6.2% | 1 |
| gg.Squaraus 0.6 | 7.0 | 6.5% | 0 |
| yk.JahRoslav 1.1 | 7.7 | 6.1% | 1 |
| pbg.NinjaX 1.2 | 8.7 | 5.5% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.0 | 11 / 35 | 6038 |
| 2 | 2 | 67.3 | 81.9 | 7 / 35 | 5617 |
| 3 | 1 | 66.9 | 80.3 | 11 / 35 | 5410 |
| 4 | 1 | 66.8 | 80.6 | 9 / 35 | 5511 |
| 5 | 2 | 66.9 | 79.7 | 7 / 35 | 5558 |
| 6 | 1 | 67.9 | 83.2 | 12 / 35 | 5523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 46 | 22% |
| kvk.HebusLeTroll 0.35 | 42 | 50% |
| jlm.javaDisturbance 0.59 | 23 | 74% |
| bigpete.Stewie 1.0 | 7 | 71% |
| yk.JahRoslav 1.1 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 59 | 39% | 78 |
| pe.SandboxDT 2.71m | 58 | 38% | 69 |
| jlm.javaDisturbance 0.59 | 22 | 14% | 37 |
| bigpete.Stewie 1.0 | 9 | 6% | 15 |
| tad.Dalek98 0.98 | 5 | 3% | 5 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 86.2 | 93 / 210 | 2.24 | 18.9% | 33463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.2 | 18.9% | 93 |
| pe.SandboxLump 1.52 | 1.8 | 17.8% | 80 |
| cre.Karolos 0.32 | 3.0 | 14.3% | 24 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.5% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.6% | 5 |
| cw.megas.Blade 0.8 | 6.8 | 8.4% | 0 |
| sample.Walls 1.0 | 7.3 | 8.1% | 2 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 84.4 | 14 / 35 | 5601 |
| 2 | 2 | 68.6 | 82.5 | 15 / 35 | 5440 |
| 3 | 1 | 69.4 | 84.8 | 15 / 35 | 5675 |
| 4 | 1 | 70.3 | 87.9 | 15 / 35 | 5682 |
| 5 | 1 | 69.2 | 87.9 | 14 / 35 | 5120 |
| 6 | 1 | 71.1 | 89.8 | 20 / 35 | 5945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 88 | 58% |
| cre.Karolos 0.32 | 24 | 54% |
| stelo.AreaTargetingBot 1.1 | 13 | 100% |
| stelo.RamTrackSurfer 1.2 | 10 | 60% |
| sample.Walls 1.0 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 62 | 53% | 110 |
| cre.Karolos 0.32 | 32 | 27% | 50 |
| stelo.AreaTargetingBot 1.1 | 9 | 8% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 6% | 9 |
| stelo.RamTrackSurfer 1.2 | 5 | 4% | 13 |
| sample.Walls 1.0 | 2 | 2% | 3 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |

## Melee bench: F24

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 72.0 | 46 / 210 | 3.52 | 15.0% | 26010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.7 | 15.0% | 46 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.9% | 43 |
| davidalves.Phoenix 0.54 | 3.0 | 13.3% | 46 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.2% | 24 |
| florent.XSeries.X2 0.12 | 4.0 | 12.9% | 38 |
| oog.melee.Corsair 1.0 | 6.0 | 8.9% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 7.7% | 9 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 5.1% | 0 |
| evd.X1 0.01 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 69.5 | 7 / 35 | 4491 |
| 2 | 2 | 61.8 | 70.2 | 9 / 35 | 4107 |
| 3 | 1 | 64.2 | 76.8 | 10 / 35 | 4371 |
| 4 | 4 | 61.4 | 68.9 | 4 / 35 | 4192 |
| 5 | 1 | 64.1 | 74.6 | 9 / 35 | 4589 |
| 6 | 1 | 62.3 | 72.1 | 7 / 35 | 4260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 26 | 58% |
| florent.XSeries.X2 0.12 | 24 | 33% |
| davidalves.Phoenix 0.54 | 20 | 45% |
| pedersen.Ugluk 1.1.1 | 14 | 57% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| stelo.SoJNanoMelee 1.1 | 3 | 67% |
| evd.X1 0.01 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 50 | 30% | 65 |
| davidalves.Phoenix 0.54 | 41 | 25% | 47 |
| florent.XSeries.X2 0.12 | 33 | 20% | 41 |
| pedersen.Ugluk 1.1.1 | 24 | 15% | 33 |
| stelo.SoJNanoMelee 1.1 | 8 | 5% | 9 |
| oog.melee.Corsair 1.0 | 4 | 2% | 9 |
| evd.X1 0.01 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.5 | 106 / 210 | 2.57 | 18.2% | 29399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 18.2% | 106 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.7% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.2% | 20 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 30 |
| ds.Oo 2.2 | 5.5 | 8.8% | 7 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 8.6% | 10 |
| awesomeness.Elite 1.0 | 7.0 | 7.5% | 4 |
| gjr.Cephalosporin 0.1 | 7.8 | 7.4% | 3 |
| adt.Ar2 1.1 | 8.7 | 6.3% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 79.7 | 18 / 35 | 4855 |
| 2 | 1 | 67.1 | 80.0 | 18 / 35 | 4802 |
| 3 | 1 | 66.9 | 80.0 | 18 / 35 | 4799 |
| 4 | 1 | 68.3 | 85.7 | 16 / 35 | 5042 |
| 5 | 1 | 67.9 | 83.8 | 18 / 35 | 4663 |
| 6 | 1 | 68.8 | 86.0 | 18 / 35 | 5238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 50 | 86% |
| voidious.micro.BlitzBat 1.05 | 45 | 78% |
| jdw.Hurricane 1.4 | 28 | 50% |
| awesomeness.Elite 1.0 | 7 | 86% |
| gjr.Cephalosporin 0.1 | 6 | 67% |
| gre.svman4.Morfeas 1.4.1 | 5 | 20% |
| adt.Ar2 1.1 | 2 | 100% |
| ds.Oo 2.2 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 28 | 27% | 38 |
| voidious.micro.BlitzBat 1.05 | 27 | 26% | 52 |
| voidious.mini.BrokenSword 2.0.3 | 22 | 21% | 63 |
| gre.svman4.Morfeas 1.4.1 | 9 | 9% | 15 |
| awesomeness.Elite 1.0 | 6 | 6% | 11 |
| ds.Oo 2.2 | 5 | 5% | 12 |
| gjr.Cephalosporin 0.1 | 4 | 4% | 11 |
| adt.Ar2 1.1 | 3 | 3% | 5 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |

## Melee bench: F26

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.6 | 73 / 210 | 2.56 | 18.2% | 37016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.2 | 18.2% | 73 |
| ak.Fermat 2.0 | 1.8 | 15.2% | 53 |
| lrem.Spectre 0.4.4 | 3.5 | 12.5% | 25 |
| shu.nitro.LENIN .T34 | 3.7 | 12.9% | 42 |
| js.PinBall 1.6 | 5.3 | 10.4% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.1% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.6% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.6 | 11 / 35 | 6204 |
| 2 | 1 | 67.7 | 80.3 | 14 / 35 | 5832 |
| 3 | 1 | 69.5 | 86.0 | 13 / 35 | 6426 |
| 4 | 1 | 68.6 | 79.7 | 14 / 35 | 6559 |
| 5 | 2 | 66.5 | 79.0 | 10 / 35 | 5562 |
| 6 | 1 | 68.4 | 82.2 | 11 / 35 | 6433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 40 | 48% |
| shu.nitro.LENIN .T34 | 35 | 43% |
| lrem.Spectre 0.4.4 | 32 | 66% |
| js.PinBall 1.6 | 6 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 80% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 47 | 34% | 66 |
| shu.nitro.LENIN .T34 | 45 | 33% | 62 |
| lrem.Spectre 0.4.4 | 26 | 19% | 45 |
| js.PinBall 1.6 | 10 | 7% | 17 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 4% | 7 |
| gh.mini.GrubbmOne 1.0 | 2 | 1% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 1% | 5 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.5 | 81 / 210 | 2.76 | 17.5% | 30652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 17.5% | 81 |
| mk.Alpha 0.2.1 | 2.5 | 14.1% | 55 |
| wee.Gem 1.8.4 | 3.2 | 11.6% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.1% | 22 |
| EH.Eagle 1.0.6 | 4.3 | 10.6% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 9.2% | 2 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.4% | 1 |
| joe.ADinosaur 1.0 | 7.8 | 7.2% | 2 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.2% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.1 | 14 / 35 | 5142 |
| 2 | 1 | 64.4 | 75.2 | 13 / 35 | 4754 |
| 3 | 1 | 65.7 | 81.3 | 13 / 35 | 4551 |
| 4 | 1 | 65.4 | 70.8 | 9 / 35 | 5674 |
| 5 | 1 | 68.2 | 85.7 | 16 / 35 | 5250 |
| 6 | 1 | 68.4 | 85.7 | 16 / 35 | 5281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 55 | 67% |
| wee.Gem 1.8.4 | 26 | 58% |
| EH.Eagle 1.0.6 | 14 | 93% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 54% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 80% |

Hadur died in 129 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 54 | 42% | 86 |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 16% | 31 |
| wee.Gem 1.8.4 | 18 | 14% | 34 |
| EH.Eagle 1.0.6 | 12 | 9% | 23 |
| throxbot.ThroxBot 0.1 | 8 | 6% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 5% | 11 |
| joe.ADinosaur 1.0 | 5 | 4% | 5 |
| cs.Grudge 1.0 | 3 | 2% | 2 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 4 |

## Melee bench: F28

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.1 | 99 / 210 | 2.34 | 18.3% | 29974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.2 | 18.3% | 99 |
| kid.test.NightFox .2 | 1.8 | 15.8% | 64 |
| uji.Antique 1.0 | 3.3 | 11.6% | 24 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.8% | 14 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 5 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.3% | 3 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.8% | 1 |
| stelo.PianistNano 1.2 | 8.7 | 5.7% | 0 |
| matt.advanced.Katana 1.0 | 9.0 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.2 | 18 / 35 | 5274 |
| 2 | 1 | 66.8 | 81.9 | 17 / 35 | 4766 |
| 3 | 1 | 68.0 | 86.0 | 20 / 35 | 4981 |
| 4 | 2 | 65.6 | 79.0 | 11 / 35 | 4817 |
| 5 | 1 | 68.7 | 86.7 | 19 / 35 | 5191 |
| 6 | 1 | 67.6 | 87.0 | 14 / 35 | 4945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 79 | 54% |
| uji.Antique 1.0 | 34 | 79% |
| qohnil.blot.BlotBot 3.61 | 14 | 64% |
| pfvicm.Sobieski 7.2.3b | 9 | 67% |
| ahr.ice.Ice 1.0.2 | 7 | 100% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 55 | 50% | 89 |
| uji.Antique 1.0 | 18 | 16% | 43 |
| pfvicm.Sobieski 7.2.3b | 13 | 12% | 18 |
| qohnil.blot.BlotBot 3.61 | 11 | 10% | 22 |
| amk.ChumbaWumba 0.3 | 7 | 6% | 10 |
| stelo.Lifestealer 1.0 | 4 | 4% | 6 |
| ahr.ice.Ice 1.0.2 | 1 | 1% | 9 |
| matt.advanced.Katana 1.0 | 1 | 1% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |

## Melee bench: F29

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.8 | 53 / 210 | 3.18 | 16.6% | 30316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.5 | 16.6% | 53 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.5% | 72 |
| deewiant.Anomaly 0.2 | 2.3 | 15.6% | 59 |
| myl.micro.Troodon 1.10 | 4.0 | 12.1% | 9 |
| jok.PheonixM 0.1.2 | 5.0 | 10.2% | 5 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 6.8 | 7.0% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.8% | 2 |
| jangs.ns51 1.0 | 9.8 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.9 | 11 / 35 | 5370 |
| 2 | 2 | 64.4 | 71.4 | 9 / 35 | 4787 |
| 3 | 1 | 66.1 | 76.5 | 8 / 35 | 5252 |
| 4 | 1 | 66.1 | 75.9 | 8 / 35 | 5348 |
| 5 | 3 | 63.9 | 70.5 | 6 / 35 | 4562 |
| 6 | 1 | 66.6 | 78.4 | 11 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 42 | 60% |
| zyx.mega.YersiniaPestis 3.1 | 26 | 23% |
| myl.micro.Troodon 1.10 | 15 | 93% |
| jok.PheonixM 0.1.2 | 6 | 100% |
| DBall.Anarchy 0.1 | 2 | 50% |
| ap.Frederick 1.1 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 157 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 57 | 36% | 63 |
| deewiant.Anomaly 0.2 | 56 | 36% | 84 |
| myl.micro.Troodon 1.10 | 25 | 16% | 38 |
| jok.PheonixM 0.1.2 | 8 | 5% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 4 |
| DBall.Anarchy 0.1 | 3 | 2% | 3 |
| jangs.ns51 1.0 | 3 | 2% | 3 |
| ph.melee.ArcherME 0.3 | 2 | 1% | 2 |

## Melee bench: F30

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 63.6 | 13 / 210 | 4.28 | 12.9% | 23799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 2.3 | 13.6% | 39 |
| catcat20.Matcha 0.006 | 2.7 | 13.7% | 53 |
| darkcanuck.B26354 1.06 | 2.8 | 13.5% | 53 |
| oog.melee.Capulet 1.2 | 3.3 | 13.3% | 37 |
| hadur117.mini.DeiseH900 0.4 | 3.8 | 12.9% | 13 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.6% | 9 |
| ntc.Opposite 1.5 | 7.0 | 8.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 6.9% | 4 |
| tripphippy.Alice 1.1 | 8.3 | 6.9% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.2 | 59.7 | 1 / 35 | 3730 |
| 2 | 5 | 58.9 | 60.6 | 2 / 35 | 4178 |
| 3 | 1 | 61.5 | 68.3 | 4 / 35 | 4464 |
| 4 | 4 | 58.6 | 63.5 | 3 / 35 | 3832 |
| 5 | 4 | 58.4 | 64.4 | 0 / 35 | 3678 |
| 6 | 4 | 59.2 | 65.1 | 3 / 35 | 3917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 18 | 28% |
| stelo.PastFuture 2.3.2 | 10 | 20% |
| darkcanuck.B26354 1.06 | 9 | 11% |
| oog.melee.Capulet 1.2 | 8 | 38% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 0% |

Hadur died in 197 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 49 | 25% | 50 |
| stelo.PastFuture 2.3.2 | 47 | 24% | 49 |
| oog.melee.Capulet 1.2 | 29 | 15% | 34 |
| catcat20.Matcha 0.006 | 27 | 14% | 30 |
| ntc.Opposite 1.5 | 19 | 10% | 20 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 6% | 13 |
| intruder.PrairieWolf 2.61 | 11 | 6% | 11 |
| tripphippy.Alice 1.1 | 3 | 2% | 3 |

## Melee bench: F31

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 72.1 | 26 / 210 | 3.51 | 14.8% | 26021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.9% | 111 |
| hadur117.mini.DeiseH900 0.4 | 2.0 | 14.8% | 26 |
| gh.mini.Griezel 0.2 | 3.0 | 13.5% | 45 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.8% | 12 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.2% | 12 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.0% | 5 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.9% | 2 |
| fm.mammillarias 1.3 | 8.0 | 5.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.7% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 69.8 | 4 / 35 | 4154 |
| 2 | 2 | 64.4 | 75.2 | 3 / 35 | 4863 |
| 3 | 2 | 61.9 | 71.1 | 4 / 35 | 4228 |
| 4 | 2 | 62.9 | 73.7 | 5 / 35 | 4082 |
| 5 | 2 | 61.6 | 67.9 | 5 / 35 | 4092 |
| 6 | 2 | 64.5 | 74.6 | 5 / 35 | 4602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 44 | 16% |
| gh.mini.Griezel 0.2 | 15 | 27% |
| spinnercat.micro.Tyger 0.1 | 10 | 60% |
| d414.nano.Quantum 1.0.0 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |

Hadur died in 185 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 63 | 34% | 70 |
| gh.mini.Griezel 0.2 | 55 | 30% | 61 |
| spinnercat.micro.Tyger 0.1 | 26 | 14% | 30 |
| d414.nano.Quantum 1.0.0 | 21 | 11% | 27 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 9 |
| fm.mammillarias 1.3 | 5 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 5 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.1 | 113 / 210 | 2.16 | 18.9% | 32675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 18.9% | 113 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.2% | 55 |
| lxx.ConceptA 0.8 | 3.7 | 11.2% | 3 |
| apc.botM 3.0 | 3.7 | 11.5% | 22 |
| vjik.UnViolation 1.1 | 5.5 | 8.9% | 4 |
| bayen.UbaMicro 1.4 | 5.8 | 8.9% | 2 |
| panzer.Panzer 0.2 | 7.2 | 7.5% | 2 |
| yk.JahMicro 1.0 | 8.3 | 6.5% | 4 |
| conscience.Electron 1.3g | 8.8 | 6.2% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 6.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.4 | 20 / 35 | 5224 |
| 2 | 1 | 70.6 | 93.0 | 19 / 35 | 6300 |
| 3 | 1 | 67.8 | 85.4 | 18 / 35 | 5419 |
| 4 | 1 | 69.0 | 88.6 | 20 / 35 | 5501 |
| 5 | 1 | 66.6 | 81.9 | 17 / 35 | 4990 |
| 6 | 1 | 68.4 | 89.2 | 19 / 35 | 5241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 57 | 53% |
| apc.botM 3.0 | 28 | 71% |
| lxx.ConceptA 0.8 | 24 | 96% |
| donjezza.Jezza 1.0 | 11 | 100% |
| vjik.UnViolation 1.1 | 11 | 100% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| yk.JahMicro 1.0 | 7 | 71% |
| panzer.Panzer 0.2 | 7 | 86% |

Hadur died in 97 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 36 | 37% | 78 |
| lxx.ConceptA 0.8 | 20 | 21% | 29 |
| apc.botM 3.0 | 18 | 19% | 42 |
| panzer.Panzer 0.2 | 7 | 7% | 11 |
| bayen.UbaMicro 1.4 | 6 | 6% | 10 |
| vjik.UnViolation 1.1 | 5 | 5% | 25 |
| yk.JahMicro 1.0 | 3 | 3% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |
| conscience.Electron 1.3g | 1 | 1% | 2 |

## Melee bench: F33

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.7 | 70 / 210 | 2.83 | 17.7% | 32846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.2 | 17.7% | 70 |
| maribo.Quester 0.3 | 1.8 | 16.3% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.4% | 31 |
| labg.Cataclysm 2.05 | 4.3 | 11.0% | 29 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.6% | 12 |
| baal.nano.N 1.42 | 6.3 | 8.7% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 7.7% | 4 |
| zyx.micro.Ant 1.1 | 8.7 | 5.4% | 0 |
| sanja.First 0.1 | 9.0 | 4.9% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 76.5 | 13 / 35 | 5295 |
| 2 | 1 | 67.9 | 81.3 | 14 / 35 | 5430 |
| 3 | 1 | 67.9 | 80.0 | 12 / 35 | 5860 |
| 4 | 1 | 67.6 | 79.7 | 13 / 35 | 5736 |
| 5 | 1 | 68.2 | 82.2 | 12 / 35 | 5533 |
| 6 | 2 | 65.7 | 78.4 | 6 / 35 | 4992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 45 | 62% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 58% |
| labg.Cataclysm 2.05 | 11 | 64% |
| gre.svman4.Leonidas 1.3.2 | 11 | 82% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 67% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 2 | 50% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 49 | 35% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 27% | 56 |
| gre.svman4.Leonidas 1.3.2 | 21 | 15% | 26 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 7% | 12 |
| labg.Cataclysm 2.05 | 9 | 6% | 19 |
| baal.nano.N 1.42 | 7 | 5% | 11 |
| sanja.First 0.1 | 2 | 1% | 4 |
| zyx.micro.Ant 1.1 | 2 | 1% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 1% | 2 |

## Melee bench: F34

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.2 | 52 / 210 | 2.79 | 17.4% | 34974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.5 | 17.4% | 52 |
| stelo.Spread 0.9 | 2.2 | 16.6% | 75 |
| kid.Gladiator .7.2 | 2.3 | 16.5% | 63 |
| jcs.Seth 1.8 | 4.5 | 11.2% | 16 |
| tcf.Reach 3 | 4.7 | 10.4% | 2 |
| cli.Dancer 1.1 | 5.8 | 9.0% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 6.7% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.9% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 79.7 | 10 / 35 | 5883 |
| 2 | 1 | 68.4 | 80.0 | 10 / 35 | 6428 |
| 3 | 1 | 67.6 | 81.3 | 9 / 35 | 5598 |
| 4 | 3 | 65.3 | 74.3 | 6 / 35 | 5416 |
| 5 | 1 | 68.4 | 83.2 | 12 / 35 | 5808 |
| 6 | 1 | 68.1 | 82.5 | 5 / 35 | 5841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 64 | 36% |
| kid.Gladiator .7.2 | 39 | 41% |
| jcs.Seth 1.8 | 7 | 43% |
| tcf.Reach 3 | 4 | 100% |
| cli.Dancer 1.1 | 3 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 72 | 46% | 95 |
| kid.Gladiator .7.2 | 62 | 39% | 76 |
| jcs.Seth 1.8 | 11 | 7% | 15 |
| tcf.Reach 3 | 6 | 4% | 14 |
| ratosh.Wesco 1.4 | 3 | 2% | 3 |
| cli.Dancer 1.1 | 2 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 75.4 | 22 / 210 | 3.21 | 14.9% | 24512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 155 |
| hadur117.mini.DeiseH900 0.4 | 2.2 | 14.9% | 22 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.3% | 19 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.4% | 7 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.1% | 0 |
| wit.Chuliath 1.0 | 6.7 | 7.0% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 76.8 | 4 / 35 | 4364 |
| 2 | 2 | 62.2 | 72.4 | 3 / 35 | 3928 |
| 3 | 2 | 63.9 | 76.5 | 5 / 35 | 4295 |
| 4 | 3 | 61.6 | 72.4 | 1 / 35 | 3467 |
| 5 | 2 | 63.1 | 75.6 | 4 / 35 | 4009 |
| 6 | 2 | 64.9 | 78.7 | 5 / 35 | 4449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 59 | 8% |
| rz.HawkOnFire 0.1 | 11 | 64% |
| gh.mini.Gruwel 0.9 | 10 | 40% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 71% |
| wit.Chuliath 1.0 | 1 | 0% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 79 | 42% | 82 |
| gh.mini.Gruwel 0.9 | 41 | 22% | 47 |
| rz.HawkOnFire 0.1 | 27 | 14% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 27 | 14% | 30 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 6 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 3 | 2% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 90.8 | 135 / 210 | 1.82 | 20.9% | 37635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 20.9% | 135 |
| alpha.RainingFire 1.0 | 2.7 | 12.4% | 19 |
| bzdp.Pansy 2.1 | 2.7 | 12.0% | 22 |
| bvh.micro.Freya 0.3 | 4.5 | 10.4% | 11 |
| mz.Cork 0.1 | 5.0 | 9.9% | 6 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.2% | 3 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.2% | 6 |
| dl.BetterWalls 1.0 | 8.2 | 6.1% | 0 |
| squidM.TentalceMeleeNano 1.1 | 9.3 | 5.2% | 1 |
| sample.MyFirstRobot 1.0 | 9.5 | 4.6% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.0 | 24 / 35 | 6216 |
| 2 | 1 | 70.8 | 90.8 | 22 / 35 | 6192 |
| 3 | 1 | 71.1 | 90.8 | 22 / 35 | 6383 |
| 4 | 1 | 69.8 | 85.4 | 19 / 35 | 6309 |
| 5 | 1 | 70.8 | 88.9 | 20 / 35 | 6177 |
| 6 | 1 | 72.6 | 96.2 | 28 / 35 | 6358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 76% |
| alpha.RainingFire 1.0 | 34 | 76% |
| bvh.micro.Freya 0.3 | 34 | 76% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 14 | 86% |
| mz.Cork 0.1 | 13 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 23 | 31% | 51 |
| bzdp.Pansy 2.1 | 22 | 29% | 56 |
| bvh.micro.Freya 0.3 | 15 | 20% | 25 |
| m3thos.Eva02 0.7.1 | 6 | 8% | 24 |
| bvh.mini.Fenrir 0.39 | 6 | 8% | 13 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 5 |
| mz.Cork 0.1 | 1 | 1% | 23 |
| dl.BetterWalls 1.0 | 0 | 0% | 12 |

## Melee bench: F37

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.8 | 156 / 210 | 1.82 | 20.2% | 36964 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 20.2% | 156 |
| germ.TheMind .2 | 2.8 | 10.8% | 12 |
| EBBU.Sim2 1.02 | 3.5 | 9.8% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.3 | 10.0% | 7 |
| lmk.ACPFinal 0.1 | 6.0 | 8.7% | 7 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.7% | 11 |
| agrach.Dalek 1.0 | 6.7 | 8.3% | 3 |
| mb.Beast 0.1 | 7.2 | 8.2% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 8.0% | 0 |
| skm.Ryubot 1.0 | 9.2 | 7.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 95.9 | 28 / 35 | 6726 |
| 2 | 1 | 68.9 | 90.5 | 24 / 35 | 5866 |
| 3 | 1 | 69.2 | 90.5 | 27 / 35 | 5812 |
| 4 | 1 | 68.5 | 86.3 | 24 / 35 | 6081 |
| 5 | 1 | 69.8 | 91.7 | 27 / 35 | 6322 |
| 6 | 1 | 69.6 | 90.2 | 26 / 35 | 6157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 38 | 92% |
| EBBU.Sim2 1.02 | 22 | 100% |
| mb.Beast 0.1 | 22 | 95% |
| agrach.Dalek 1.0 | 20 | 100% |
| lmk.ACPFinal 0.1 | 19 | 84% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 83% |
| stelo.UntouchableNano 1.3 | 17 | 71% |
| skm.Ryubot 1.0 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 15 | 27% | 31 |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 22% | 40 |
| stelo.UntouchableNano 1.3 | 10 | 18% | 19 |
| mb.Beast 0.1 | 5 | 9% | 19 |
| germ.TheMind .2 | 4 | 7% | 31 |
| agrach.Dalek 1.0 | 3 | 5% | 32 |
| skm.Ryubot 1.0 | 3 | 5% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 4% | 8 |
| EBBU.Sim2 1.02 | 1 | 2% | 19 |

## Melee bench: F38

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 76.3 | 61 / 210 | 3.13 | 16.2% | 29060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.5 | 16.2% | 61 |
| justin.Mallais 14.0 | 1.7 | 16.0% | 86 |
| bvh.mini.Freya 0.55 | 2.8 | 13.1% | 17 |
| cs.Wren 1.0 | 4.8 | 10.7% | 10 |
| bts.mega.Gnarly 1.4 | 5.0 | 11.1% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.2% | 9 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.6% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 5.8% | 2 |
| matt.UnderDark3 2.4.34 | 8.7 | 4.6% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.4 | 12 / 35 | 5137 |
| 2 | 1 | 64.6 | 76.8 | 8 / 35 | 4826 |
| 3 | 3 | 61.4 | 66.0 | 8 / 35 | 4267 |
| 4 | 1 | 66.6 | 80.3 | 14 / 35 | 4986 |
| 5 | 2 | 65.5 | 78.7 | 8 / 35 | 4832 |
| 6 | 1 | 65.5 | 76.5 | 11 / 35 | 5012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 37 | 41% |
| bvh.mini.Freya 0.55 | 15 | 67% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 93% |
| bts.mega.Gnarly 1.4 | 14 | 79% |
| cs.Wren 1.0 | 11 | 82% |
| kdf.KoulDestroyer 1.0 | 5 | 60% |

Hadur died in 149 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 50 | 34% | 74 |
| bts.mega.Gnarly 1.4 | 29 | 19% | 36 |
| bvh.mini.Freya 0.55 | 25 | 17% | 30 |
| cs.Wren 1.0 | 18 | 12% | 22 |
| kdf.KoulDestroyer 1.0 | 11 | 7% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 6% | 20 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 6 |
| bzdp.BoxCar 2.0 | 3 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.6 | 72 / 210 | 2.74 | 17.5% | 33325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 17.5% | 72 |
| bvh.fry.Freya 0.82 | 2.2 | 14.8% | 32 |
| az.Ololobot 0.2.4 | 3.0 | 13.2% | 62 |
| catcat20.Lambda 0.024 | 3.8 | 11.2% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.1% | 12 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.0% | 3 |
| gimp.GimpBot 0.1 | 7.0 | 7.7% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.5% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 13 / 35 | 5801 |
| 2 | 1 | 63.9 | 74.6 | 8 / 35 | 5232 |
| 3 | 1 | 67.8 | 81.3 | 14 / 35 | 5990 |
| 4 | 1 | 66.4 | 82.2 | 13 / 35 | 5341 |
| 5 | 1 | 66.6 | 80.3 | 11 / 35 | 5576 |
| 6 | 1 | 66.2 | 79.4 | 13 / 35 | 5385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 38 | 39% |
| catcat20.Lambda 0.024 | 30 | 67% |
| bvh.fry.Freya 0.82 | 30 | 70% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 92% |
| winamp32.micro.MicroMacro 1.0 | 4 | 50% |
| gimp.GimpBot 0.1 | 3 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 53 | 38% | 73 |
| az.Ololobot 0.2.4 | 43 | 31% | 61 |
| catcat20.Lambda 0.024 | 19 | 14% | 31 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 7% | 14 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 11 |
| gimp.GimpBot 0.1 | 4 | 3% | 8 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 1% | 5 |

## Melee bench: F40

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.6 | 76 / 210 | 2.74 | 17.7% | 32170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 17.7% | 76 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 56 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.3% | 24 |
| mz.AntiGrav 1.0 | 4.2 | 11.3% | 17 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.8% | 20 |
| stelo.Randomness 1.0 | 6.2 | 9.2% | 8 |
| alpha.BlackIce 1.0 | 6.8 | 8.8% | 8 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.8% | 0 |
| sample.Corners 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.4 | 17 / 35 | 5567 |
| 2 | 1 | 65.4 | 74.9 | 9 / 35 | 5430 |
| 3 | 1 | 66.7 | 79.4 | 16 / 35 | 5136 |
| 4 | 1 | 66.0 | 78.4 | 10 / 35 | 4958 |
| 5 | 1 | 68.5 | 86.7 | 12 / 35 | 5605 |
| 6 | 1 | 66.9 | 79.0 | 12 / 35 | 5474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 47 | 51% |
| kano.gamma.KanoGamma 1.8 | 22 | 68% |
| mz.AntiGrav 1.0 | 18 | 83% |
| Polkwane.SmashMelee 1.0 | 13 | 54% |
| stelo.Randomness 1.0 | 9 | 100% |
| alpha.BlackIce 1.0 | 7 | 71% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 51 | 38% | 70 |
| kano.gamma.KanoGamma 1.8 | 23 | 17% | 48 |
| mz.AntiGrav 1.0 | 21 | 16% | 35 |
| Polkwane.SmashMelee 1.0 | 18 | 13% | 19 |
| alpha.BlackIce 1.0 | 7 | 5% | 9 |
| stelo.Randomness 1.0 | 6 | 4% | 17 |
| amk.superstrike.SuperStrike 0.3 | 6 | 4% | 7 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 76.2 | 47 / 210 | 3.14 | 15.8% | 27424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.5 | 16.7% | 94 |
| hadur117.mini.DeiseH900 0.4 | 1.5 | 15.8% | 47 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 23 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.8% | 26 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.4% | 19 |
| shrub.Silver v048 | 6.0 | 8.9% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.9% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 68.3 | 6 / 35 | 4129 |
| 2 | 2 | 64.4 | 76.8 | 5 / 35 | 4362 |
| 3 | 1 | 65.6 | 79.4 | 10 / 35 | 4492 |
| 4 | 1 | 66.1 | 79.4 | 11 / 35 | 4670 |
| 5 | 1 | 66.1 | 80.0 | 8 / 35 | 4953 |
| 6 | 2 | 64.2 | 73.3 | 7 / 35 | 4818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 51 | 24% |
| ary.Swarm 1.1 | 22 | 59% |
| lessonz.robocode.Oz 0.5.0 | 15 | 73% |
| simonton.nano.MeleeSeed 1.8 | 11 | 64% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 61 | 37% | 75 |
| ary.Swarm 1.1 | 37 | 23% | 47 |
| lessonz.robocode.Oz 0.5.0 | 24 | 15% | 29 |
| simonton.nano.MeleeSeed 1.8 | 23 | 14% | 30 |
| shrub.Silver v048 | 5 | 3% | 10 |
| zyx.nano.Ant 1.1 | 5 | 3% | 6 |
| jsal.Jsalbot 1.0 | 5 | 3% | 6 |
| stelo.Mirror 1.1 | 2 | 1% | 5 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.8 | 60 / 210 | 2.81 | 17.1% | 32790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 17.1% | 60 |
| wompi.Wallaby 5.1 | 2.0 | 16.1% | 74 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 14.6% | 33 |
| ara.Shera 0.88 | 4.0 | 12.4% | 38 |
| amz.NanoClone 1.41 | 5.3 | 9.0% | 1 |
| maribo.IotaCT 1.1 | 5.8 | 7.8% | 0 |
| dsw.StaticD 1.0 | 7.2 | 6.9% | 4 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.5% | 0 |
| stelo.MirrorMicro 1.0 | 9.0 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.7 | 9 / 35 | 5494 |
| 2 | 1 | 67.2 | 81.3 | 13 / 35 | 5607 |
| 3 | 1 | 65.4 | 78.1 | 10 / 35 | 5147 |
| 4 | 1 | 67.6 | 83.8 | 8 / 35 | 5707 |
| 5 | 1 | 65.7 | 77.5 | 9 / 35 | 5510 |
| 6 | 1 | 66.0 | 78.7 | 11 / 35 | 5325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 41 | 49% |
| maribo.mini.MiniQuester 0.1 | 30 | 63% |
| ara.Shera 0.88 | 20 | 45% |
| dsw.StaticD 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| maribo.IotaCT 1.1 | 3 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 60 | 39% | 81 |
| maribo.mini.MiniQuester 0.1 | 44 | 29% | 58 |
| ara.Shera 0.88 | 34 | 22% | 47 |
| amz.NanoClone 1.41 | 7 | 5% | 8 |
| maribo.IotaCT 1.1 | 4 | 3% | 7 |
| dsw.StaticD 1.0 | 1 | 1% | 5 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 73.7 | 15 / 210 | 3.37 | 15.1% | 27946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 155 |
| hadur117.mini.DeiseH900 0.4 | 2.0 | 15.1% | 15 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.3% | 18 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 13 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.8% | 5 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.5% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.5% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 78.1 | 1 / 35 | 5062 |
| 2 | 2 | 63.4 | 72.4 | 1 / 35 | 4419 |
| 3 | 2 | 62.0 | 66.0 | 1 / 35 | 4497 |
| 4 | 2 | 66.1 | 76.8 | 6 / 35 | 4916 |
| 5 | 2 | 64.3 | 72.4 | 4 / 35 | 4515 |
| 6 | 2 | 65.0 | 76.2 | 2 / 35 | 4537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 58 | 7% |
| dummy.micro.Sparrow 2.5 | 8 | 38% |
| brainfade.melee.Dusk 0.44 | 8 | 63% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 50% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 196 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 104 | 53% | 108 |
| brainfade.melee.Dusk 0.44 | 32 | 16% | 34 |
| dummy.micro.Sparrow 2.5 | 21 | 11% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 18 | 9% | 21 |
| Krabb.akim2.Akim2 1.1b | 8 | 4% | 8 |
| mz.NanoGod 2.02 | 7 | 4% | 8 |
| jab.DiamondStealer 5 | 5 | 3% | 6 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.0 | 79 / 210 | 2.53 | 18.6% | 36031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 18.6% | 79 |
| stelo.Liblix 0.3.1 | 2.0 | 15.7% | 80 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.7% | 32 |
| wompi.Quokka 1.6 | 4.3 | 10.6% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.1% | 3 |
| disan.Chair 2.2.0 | 5.8 | 8.3% | 3 |
| jwirde.Gort 2.0 | 6.5 | 8.3% | 3 |
| stf.PanzerGeneral 0.1 | 7.8 | 7.0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.3 | 14 / 35 | 6451 |
| 2 | 1 | 69.5 | 87.3 | 12 / 35 | 6240 |
| 3 | 1 | 65.0 | 73.0 | 12 / 35 | 5225 |
| 4 | 1 | 68.7 | 83.2 | 16 / 35 | 6134 |
| 5 | 1 | 66.4 | 77.5 | 10 / 35 | 5582 |
| 6 | 1 | 70.5 | 89.5 | 15 / 35 | 6399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 65 | 45% |
| tzu.TheArtOfWar 1.2 | 41 | 56% |
| wompi.Quokka 1.6 | 12 | 92% |
| disan.Chair 2.2.0 | 7 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 71% |
| jwirde.Gort 2.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 66 | 49% | 98 |
| tzu.TheArtOfWar 1.2 | 28 | 21% | 50 |
| wompi.Quokka 1.6 | 18 | 13% | 27 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 7% | 15 |
| disan.Chair 2.2.0 | 5 | 4% | 7 |
| stf.PanzerGeneral 0.1 | 3 | 2% | 5 |
| jwirde.Gort 2.0 | 1 | 1% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 81.6 | 59 / 210 | 2.66 | 18.8% | 38111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH900 0.4 | 1.0 | 18.8% | 59 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.6% | 121 |
| jje.BagPuss 1.2 | 3.2 | 12.4% | 7 |
| myl.nano.Graviton 1.10 | 4.7 | 9.9% | 7 |
| sul.Lunar 1.1 | 5.0 | 10.3% | 5 |
| pez.mini.ChironexFleckeri 0.5 | 6.2 | 8.4% | 5 |
| fm.claire 1.7 | 7.0 | 8.0% | 1 |
| hvilela.HVilela 0.9 | 7.2 | 8.1% | 0 |
| wit.Deep7 2.0 | 8.8 | 6.2% | 4 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 82.5 | 13 / 35 | 6458 |
| 2 | 1 | 68.8 | 82.9 | 7 / 35 | 6651 |
| 3 | 1 | 69.0 | 82.9 | 8 / 35 | 6565 |
| 4 | 1 | 68.0 | 82.5 | 11 / 35 | 6097 |
| 5 | 1 | 67.4 | 78.1 | 9 / 35 | 6298 |
| 6 | 1 | 67.7 | 80.6 | 11 / 35 | 6042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 84 | 13% |
| sul.Lunar 1.1 | 15 | 93% |
| jje.BagPuss 1.2 | 13 | 62% |
| myl.nano.Graviton 1.10 | 12 | 75% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 88% |
| wit.Deep7 2.0 | 6 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 1283. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 76 | 50% | 0 |
| sul.Lunar 1.1 | 22 | 15% | 65 |
| jje.BagPuss 1.2 | 20 | 13% | 55 |
| myl.nano.Graviton 1.10 | 11 | 7% | 29 |
| fm.claire 1.7 | 10 | 7% | 21 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 4% | 17 |
| hvilela.HVilela 0.9 | 2 | 1% | 10 |
| wit.Deep7 2.0 | 2 | 1% | 6 |
| abud.ThirdRobo 1.0 | 2 | 1% | 4 |

## Melee bench: F46

hadur117.mini.DeiseH900 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 78.0 | 28 / 210 | 2.98 | 15.4% | 26604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.0% | 77 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.9% | 92 |
| hadur117.mini.DeiseH900 0.4 | 2.8 | 15.4% | 28 |
| mz.MicroSheep 1.0 | 4.7 | 10.1% | 3 |
| cx.Princess 1.0 | 4.8 | 10.2% | 8 |
| sadoner.killer 0.2 | 5.5 | 9.1% | 2 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.0% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 79.4 | 6 / 35 | 4497 |
| 2 | 3 | 64.4 | 77.5 | 4 / 35 | 4537 |
| 3 | 3 | 64.8 | 79.0 | 8 / 35 | 4514 |
| 4 | 3 | 63.4 | 75.9 | 5 / 35 | 4199 |
| 5 | 3 | 64.0 | 76.8 | 2 / 35 | 4453 |
| 6 | 3 | 64.3 | 79.7 | 3 / 35 | 4404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 45 | 27% |
| rsalesc.melee.Medina 0.4.5 | 36 | 17% |
| cx.Princess 1.0 | 7 | 57% |
| mz.MicroSheep 1.0 | 5 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 83 | 45% | 93 |
| rsalesc.melee.Medina 0.4.5 | 63 | 34% | 70 |
| mz.MicroSheep 1.0 | 14 | 8% | 17 |
| sadoner.killer 0.2 | 7 | 4% | 10 |
| cx.Princess 1.0 | 7 | 4% | 8 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 7 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
| kurios.DOSexe .9a | 1 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

