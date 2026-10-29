# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.7 | 58 / 210 | 2.29 | 17.1% | 29637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 127 |
| hadur117.mini.DeiseFIT3F 0.3 | 2.0 | 17.1% | 58 |
| sgp.JollyNinja 3.53 | 3.5 | 11.5% | 13 |
| mz.MicroGodMelee 1 | 4.2 | 10.8% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.9% | 3 |
| lorneswork.Predator 1.0 | 6.0 | 9.2% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.4% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 88.9 | 12 / 35 | 5564 |
| 2 | 2 | 65.8 | 83.5 | 6 / 35 | 4763 |
| 3 | 2 | 64.6 | 80.3 | 7 / 35 | 4575 |
| 4 | 2 | 67.3 | 87.0 | 10 / 35 | 4868 |
| 5 | 2 | 67.4 | 88.6 | 10 / 35 | 4894 |
| 6 | 2 | 67.3 | 85.7 | 13 / 35 | 4973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 126 | 25% |
| sgp.JollyNinja 3.53 | 14 | 71% |
| mz.MicroGodMelee 1 | 12 | 58% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 78% |
| lorneswork.Predator 1.0 | 3 | 67% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 1159. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 107 | 70% | 140 |
| sgp.JollyNinja 3.53 | 21 | 14% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 7% | 17 |
| mz.MicroGodMelee 1 | 6 | 4% | 15 |
| lorneswork.Predator 1.0 | 4 | 3% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| adt.Ar2 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.1 | 108 / 210 | 2.43 | 18.3% | 30620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 18.3% | 108 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.5% | 44 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.6% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.0% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.4% | 8 |
| Noran.BitchingElk 0.054 | 6.5 | 8.0% | 14 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.8% | 1 |
| sch.Simone 0.3d | 7.3 | 7.2% | 5 |
| stelo.PatternRobot 1.0 | 9.0 | 5.9% | 2 |
| fullsail.SweetTea 1.1 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 80.6 | 15 / 35 | 4955 |
| 2 | 1 | 67.6 | 82.5 | 18 / 35 | 5225 |
| 3 | 1 | 68.6 | 87.0 | 20 / 35 | 5026 |
| 4 | 1 | 67.7 | 84.8 | 19 / 35 | 5043 |
| 5 | 1 | 67.9 | 84.8 | 18 / 35 | 4970 |
| 6 | 1 | 68.1 | 84.8 | 18 / 35 | 5401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 79% |
| pulsar.PulsarMax 0.8.9 | 45 | 76% |
| Noran.BitchingElk 0.054 | 10 | 50% |
| stelo.PatternRobot 1.0 | 10 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| sch.Simone 0.3d | 6 | 83% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 40% | 74 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 22% | 62 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 13% | 18 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 10% | 17 |
| Noran.BitchingElk 0.054 | 7 | 7% | 17 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 6 |
| sch.Simone 0.3d | 3 | 3% | 8 |
| stelo.PatternRobot 1.0 | 2 | 2% | 7 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 95.2 | 165 / 210 | 1.43 | 21.0% | 38723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 21.0% | 165 |
| radnor.DoctorBob 1.42 | 2.8 | 12.9% | 7 |
| vuen.Cake 2.51 | 3.0 | 12.5% | 24 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.7% | 9 |
| urdos.URDOS 1.3 | 5.2 | 9.1% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 6.7 | 7.4% | 2 |
| adt.Ar1 2.1 | 6.8 | 7.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 98.7 | 32 / 35 | 6613 |
| 2 | 1 | 69.3 | 90.2 | 20 / 35 | 6079 |
| 3 | 1 | 71.5 | 96.8 | 30 / 35 | 6196 |
| 4 | 1 | 71.6 | 96.2 | 29 / 35 | 6487 |
| 5 | 1 | 71.0 | 95.9 | 26 / 35 | 6389 |
| 6 | 1 | 71.7 | 93.3 | 28 / 35 | 6959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 95% |
| vuen.Cake 2.51 | 63 | 73% |
| radnor.DoctorBob 1.42 | 41 | 98% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| urdos.URDOS 1.3 | 4 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 21 | 47% | 63 |
| kawigi.nano.Lib 1.0 | 11 | 24% | 79 |
| urdos.URDOS 1.3 | 6 | 13% | 8 |
| radnor.DoctorBob 1.42 | 5 | 11% | 35 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 4% | 7 |
| adt.Ar1 2.1 | 0 | 0% | 6 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.6 | 34 / 210 | 2.56 | 17.1% | 34116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.9% | 169 |
| hadur117.mini.DeiseFIT3F 0.3 | 2.0 | 17.1% | 34 |
| apc.LeeroyJenkins2 1.0 | 3.2 | 12.4% | 3 |
| TNT.TNT 0.99.1 | 3.8 | 10.8% | 2 |
| josago.Jorgito 0.16 | 5.0 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 6.9% | 1 |
| css.Delitioner 0.11 | 6.7 | 7.0% | 2 |
| rampancy.Durandal 2.1d | 8.0 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 82.2 | 5 / 35 | 5507 |
| 2 | 2 | 66.5 | 79.0 | 6 / 35 | 5856 |
| 3 | 2 | 68.9 | 87.3 | 8 / 35 | 5904 |
| 4 | 2 | 67.6 | 85.7 | 6 / 35 | 5516 |
| 5 | 2 | 66.2 | 80.0 | 5 / 35 | 5357 |
| 6 | 2 | 67.5 | 81.6 | 4 / 35 | 5976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 20% |
| TNT.TNT 0.99.1 | 4 | 50% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| tj.zombie1n 1.0.1 | 1 | 0% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 1285. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 134 | 76% | 162 |
| apc.LeeroyJenkins2 1.0 | 15 | 8% | 16 |
| TNT.TNT 0.99.1 | 10 | 6% | 13 |
| josago.Jorgito 0.16 | 9 | 5% | 9 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 68.5 | 20 / 210 | 3.83 | 12.9% | 20049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.2% | 126 |
| justin.DemonicRage 3.4 | 2.0 | 17.1% | 50 |
| hadur117.mini.DeiseFIT3F 0.3 | 3.2 | 12.9% | 20 |
| wompi.Numbat 2.1 | 3.8 | 12.4% | 7 |
| ms.Ares 0.19 | 5.3 | 9.2% | 2 |
| axeBots.HataMoto 3.09 | 5.7 | 8.8% | 5 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 71.4 | 2 / 35 | 3419 |
| 2 | 3 | 61.2 | 69.5 | 4 / 35 | 3752 |
| 3 | 3 | 59.8 | 68.3 | 4 / 35 | 3227 |
| 4 | 3 | 59.5 | 67.0 | 3 / 35 | 3280 |
| 5 | 3 | 58.8 | 66.3 | 4 / 35 | 3090 |
| 6 | 4 | 59.6 | 68.6 | 3 / 35 | 3281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 27 | 11% |
| justin.DemonicRage 3.4 | 26 | 42% |
| wompi.Numbat 2.1 | 4 | 100% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 67 | 35% | 77 |
| cb.fire.Firestarter 2.0f | 57 | 30% | 61 |
| wompi.Numbat 2.1 | 35 | 18% | 39 |
| ms.Ares 0.19 | 12 | 6% | 12 |
| axeBots.HataMoto 3.09 | 8 | 4% | 9 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 79.3 | 90 / 210 | 2.87 | 16.9% | 28683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.2 | 16.9% | 90 |
| origin.SleepSiphon 1.7b | 2.3 | 14.4% | 54 |
| jekl.StoneGhost 0.7 | 2.5 | 14.4% | 26 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 12.1% | 29 |
| mld.Wisdom 1.0 | 5.0 | 10.0% | 3 |
| gg.Wolverine 2.0 | 5.8 | 8.9% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 7.1% | 2 |
| DBall.NUKE 0.1 | 8.0 | 6.5% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.5% | 2 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 78.4 | 17 / 35 | 4771 |
| 2 | 1 | 65.2 | 79.0 | 15 / 35 | 4503 |
| 3 | 1 | 68.5 | 84.8 | 21 / 35 | 5360 |
| 4 | 1 | 65.5 | 78.1 | 13 / 35 | 4747 |
| 5 | 2 | 64.2 | 75.2 | 10 / 35 | 4628 |
| 6 | 1 | 66.3 | 80.0 | 14 / 35 | 4674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 37 | 73% |
| jekl.StoneGhost 0.7 | 33 | 91% |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 73% |
| gg.Wolverine 2.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| mld.Wisdom 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 39 | 32% | 58 |
| origin.SleepSiphon 1.7b | 29 | 24% | 60 |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 21% | 43 |
| gg.Wolverine 2.0 | 10 | 8% | 14 |
| mld.Wisdom 1.0 | 9 | 7% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 2% | 9 |
| spinnercat.Omen 1.0 | 3 | 2% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 3 |
| sample.Fire 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.6 | 119 / 210 | 1.76 | 19.7% | 35481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 19.7% | 119 |
| rtk.Tachikoma 1.0 | 2.3 | 16.7% | 33 |
| rsalesc.melee.Monk 0.3.6c | 2.7 | 16.6% | 46 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.5% | 8 |
| franzor.Lizt 1.3.1 | 4.8 | 10.3% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 92.7 | 20 / 35 | 6444 |
| 2 | 1 | 69.6 | 88.3 | 15 / 35 | 5324 |
| 3 | 1 | 70.6 | 89.2 | 20 / 35 | 5783 |
| 4 | 1 | 71.8 | 92.1 | 23 / 35 | 6314 |
| 5 | 1 | 71.3 | 93.7 | 19 / 35 | 5895 |
| 6 | 1 | 71.5 | 93.7 | 22 / 35 | 5721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 96 | 83% |
| rsalesc.melee.Monk 0.3.6c | 42 | 19% |
| oog.melee.CapuletDroid 1.1 | 28 | 89% |
| franzor.Lizt 1.3.1 | 7 | 57% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1447. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 43 | 47% | 56 |
| rtk.Tachikoma 1.0 | 34 | 37% | 113 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 34 |
| franzor.Lizt 1.3.1 | 4 | 4% | 2 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.0 | 115 / 210 | 2.17 | 18.6% | 30434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 18.6% | 115 |
| shrub.Vapour v159 | 2.5 | 13.1% | 30 |
| tm.Yuugao 1.0 | 2.8 | 13.2% | 42 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.3% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.2% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 7.9% | 5 |
| m3thos.Eva00 1.1 | 6.7 | 7.8% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.7% | 1 |
| SHAM.WOW 1.4 | 8.7 | 6.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.1 | 17 / 35 | 4936 |
| 2 | 1 | 66.7 | 84.1 | 16 / 35 | 4950 |
| 3 | 1 | 67.7 | 86.7 | 19 / 35 | 4951 |
| 4 | 1 | 67.9 | 85.1 | 21 / 35 | 5055 |
| 5 | 1 | 68.7 | 89.2 | 21 / 35 | 5264 |
| 6 | 1 | 69.5 | 91.7 | 21 / 35 | 5278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 52 | 56% |
| shrub.Vapour v159 | 32 | 75% |
| Krabb.sliNk.Garm 0.9u | 27 | 89% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 93% |
| m3thos.Eva00 1.1 | 8 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 75% |
| SHAM.WOW 1.4 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 40 | 42% | 77 |
| shrub.Vapour v159 | 23 | 24% | 51 |
| Krabb.sliNk.Garm 0.9u | 15 | 16% | 29 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 5% | 16 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 5% | 15 |
| m3thos.Eva00 1.1 | 3 | 3% | 8 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 6 |

## Melee bench: F09

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 73.9 | 61 / 210 | 3.35 | 15.4% | 25375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 16.6% | 93 |
| hadur117.mini.DeiseFIT3F 0.3 | 2.0 | 15.4% | 61 |
| kc.micro.Figment 1.0 | 2.8 | 14.7% | 28 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.6% | 15 |
| yagami.Tidus 0.11 | 4.8 | 10.4% | 0 |
| mc2.enemy.Original 0.9 | 5.7 | 9.6% | 13 |
| dft.Calliope 5.6 | 7.2 | 7.2% | 0 |
| step.nanoPri 1.0 | 8.3 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 78.4 | 13 / 35 | 4726 |
| 2 | 2 | 61.6 | 69.5 | 9 / 35 | 3939 |
| 3 | 3 | 59.8 | 64.4 | 7 / 35 | 3733 |
| 4 | 2 | 65.4 | 78.7 | 11 / 35 | 4403 |
| 5 | 2 | 64.0 | 75.9 | 10 / 35 | 4244 |
| 6 | 2 | 64.8 | 76.2 | 11 / 35 | 4330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 40 | 33% |
| kc.micro.Figment 1.0 | 30 | 77% |
| mc2.enemy.Original 0.9 | 9 | 67% |
| yagami.Tidus 0.11 | 9 | 100% |
| pedersen.Grishnakh 1.0 | 9 | 67% |
| step.nanoPri 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 59 | 40% | 72 |
| kc.micro.Figment 1.0 | 32 | 21% | 58 |
| yagami.Tidus 0.11 | 17 | 11% | 25 |
| mc2.enemy.Original 0.9 | 14 | 9% | 20 |
| pedersen.Grishnakh 1.0 | 13 | 9% | 17 |
| dft.Calliope 5.6 | 6 | 4% | 8 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 5 |
| step.nanoPri 1.0 | 2 | 1% | 3 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 95.0 | 165 / 210 | 1.45 | 20.4% | 33117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 20.4% | 165 |
| DTF.Kludgy 1.2b | 2.3 | 13.7% | 20 |
| ne.Chimera 1.2 | 3.3 | 12.1% | 4 |
| ejb.Polaris 1.0.1 | 3.5 | 12.1% | 9 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.7% | 4 |
| vStar.RAFzilla 2.15 | 5.7 | 10.4% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.6% | 1 |
| sam.Samspin 1.0 | 8.2 | 5.3% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.2% | 1 |
| donjezza.Muncho 1.0 | 9.5 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 93.0 | 24 / 35 | 5734 |
| 2 | 1 | 70.3 | 93.3 | 28 / 35 | 5377 |
| 3 | 1 | 71.8 | 97.1 | 30 / 35 | 5778 |
| 4 | 1 | 71.9 | 97.1 | 31 / 35 | 5761 |
| 5 | 1 | 70.1 | 95.6 | 26 / 35 | 5163 |
| 6 | 1 | 70.0 | 93.7 | 26 / 35 | 5304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 50 | 84% |
| ejb.Polaris 1.0.1 | 49 | 96% |
| ne.Chimera 1.2 | 28 | 86% |
| vStar.RAFzilla 2.15 | 25 | 96% |
| tvv.micro.Antares 1.1.1 | 21 | 100% |
| donjezza.Muncho 1.0 | 6 | 50% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 22 | 48% | 64 |
| ne.Chimera 1.2 | 10 | 22% | 37 |
| vStar.RAFzilla 2.15 | 4 | 9% | 21 |
| ejb.Polaris 1.0.1 | 3 | 7% | 51 |
| donjezza.Muncho 1.0 | 3 | 7% | 8 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 13 |
| sam.Samspin 1.0 | 1 | 2% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 8 |

## Melee bench: F11

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.2 | 85 / 210 | 2.78 | 17.0% | 28104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.2 | 17.0% | 85 |
| rz.Aleph 0.34 | 1.8 | 15.9% | 55 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.5% | 23 |
| djc.DynaBot 0.1.1 | 4.2 | 11.0% | 18 |
| rdt199.Warlord 0.73 | 5.5 | 9.3% | 13 |
| br2.MobyDickBot 1.6 | 5.7 | 9.3% | 14 |
| uji.YellohFellah 1.0 | 7.2 | 7.8% | 2 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 77.1 | 9 / 35 | 4535 |
| 2 | 1 | 67.0 | 84.4 | 15 / 35 | 4940 |
| 3 | 1 | 64.6 | 76.5 | 13 / 35 | 4393 |
| 4 | 1 | 67.8 | 85.7 | 15 / 35 | 5035 |
| 5 | 1 | 67.9 | 85.4 | 19 / 35 | 4876 |
| 6 | 1 | 63.1 | 72.1 | 14 / 35 | 4325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 55 | 60% |
| djc.DynaBot 0.1.1 | 19 | 74% |
| cx.mini.Nimrod 0.55 | 15 | 93% |
| br2.MobyDickBot 1.6 | 13 | 62% |
| rdt199.Warlord 0.73 | 11 | 64% |
| uji.YellohFellah 1.0 | 7 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 51 | 41% | 83 |
| cx.mini.Nimrod 0.55 | 20 | 16% | 32 |
| rdt199.Warlord 0.73 | 18 | 14% | 27 |
| djc.DynaBot 0.1.1 | 17 | 14% | 27 |
| br2.MobyDickBot 1.6 | 7 | 6% | 16 |
| KiraNL.Chupacabra 0.4 | 7 | 6% | 9 |
| uji.YellohFellah 1.0 | 2 | 2% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 82.8 | 115 / 210 | 2.55 | 17.6% | 25886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 17.6% | 115 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.6% | 23 |
| nat.PallasHawk 1.0 | 3.2 | 13.0% | 28 |
| darkcanuck.Leon 1.01 | 3.5 | 12.7% | 25 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.0% | 13 |
| jrm.Test0 1.0 | 6.5 | 7.9% | 0 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.1% | 0 |
| jp.Perpy 16.0 | 7.5 | 6.7% | 2 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.8% | 3 |
| stuff.Vlad 0.1 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 74.0 | 17 / 35 | 4058 |
| 2 | 1 | 68.7 | 87.9 | 22 / 35 | 4833 |
| 3 | 1 | 66.4 | 82.2 | 18 / 35 | 4364 |
| 4 | 1 | 65.5 | 81.9 | 14 / 35 | 4039 |
| 5 | 1 | 68.0 | 86.0 | 24 / 35 | 4203 |
| 6 | 1 | 67.2 | 84.4 | 20 / 35 | 4389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 48 | 88% |
| darkcanuck.Leon 1.01 | 41 | 78% |
| nat.PallasHawk 1.0 | 32 | 78% |
| brainfade.melee.Genghis 0.36 | 9 | 78% |
| jaybot.bots.Oddball 4.0 | 5 | 80% |
| jrm.Test0 1.0 | 4 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 22 | 23% | 59 |
| bts.wiki.RipCurl 0.9b | 18 | 19% | 45 |
| nat.PallasHawk 1.0 | 17 | 18% | 46 |
| brainfade.melee.Genghis 0.36 | 15 | 15% | 21 |
| cs.sheldor.Talon 1.1 | 11 | 11% | 14 |
| jrm.Test0 1.0 | 7 | 7% | 10 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 7 |
| stuff.Vlad 0.1 | 2 | 2% | 5 |
| jp.Perpy 16.0 | 2 | 2% | 3 |

## Melee bench: F13

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.5 | 69 / 210 | 2.76 | 16.0% | 26413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.7 | 16.5% | 36 |
| mn.Combat 3.25.0 | 1.8 | 16.5% | 85 |
| hadur117.mini.DeiseFIT3F 0.3 | 2.5 | 16.0% | 69 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.7% | 7 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 13 |
| apc.Colossus2 0.17 | 6.2 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.7% | 2 |
| ayk.WallHugger 1.0 | 7.8 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 75.2 | 10 / 35 | 4336 |
| 2 | 2 | 66.1 | 85.4 | 15 / 35 | 4100 |
| 3 | 3 | 64.1 | 76.8 | 8 / 35 | 4273 |
| 4 | 3 | 64.9 | 81.3 | 9 / 35 | 4023 |
| 5 | 3 | 65.8 | 81.0 | 11 / 35 | 4795 |
| 6 | 1 | 67.1 | 83.2 | 16 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 50 | 40% |
| ags.Glacier 0.2.11 | 43 | 74% |
| shinh.Entangled 0.3 | 16 | 81% |
| gh.micro.Gruweltje 0.7 | 4 | 75% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 53 | 37% | 71 |
| ags.Glacier 0.2.11 | 42 | 29% | 73 |
| shinh.Entangled 0.3 | 19 | 13% | 33 |
| gh.micro.Gruweltje 0.7 | 18 | 13% | 23 |
| stelo.Wang 1.0 | 4 | 3% | 5 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.3 | 151 / 210 | 1.70 | 20.2% | 34253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 20.2% | 151 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.4% | 23 |
| catcat20.shape.Theta 0.018 | 2.7 | 12.3% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 9.6% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.3% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.0% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.8 | 8.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.5% | 10 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.1 | 21 / 35 | 5287 |
| 2 | 1 | 71.2 | 93.3 | 24 / 35 | 5869 |
| 3 | 1 | 69.5 | 91.1 | 22 / 35 | 5594 |
| 4 | 1 | 71.9 | 95.9 | 28 / 35 | 6138 |
| 5 | 1 | 70.8 | 94.9 | 28 / 35 | 5495 |
| 6 | 1 | 71.3 | 93.3 | 28 / 35 | 5870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 89% |
| catcat20.shape.Theta 0.018 | 51 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 75% |
| sanyi.mikrobi.Roberto 1.0 | 16 | 94% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 60 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 19 | 32% | 84 |
| catcat20.shape.Theta 0.018 | 16 | 27% | 48 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 15% | 27 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 10% | 10 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 7% | 22 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 7% | 12 |
| pa.Improved 1.0 | 1 | 2% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.9 | 108 / 210 | 2.54 | 18.4% | 33630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 18.4% | 108 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 22 |
| emp.Yngwie 1.11 | 3.3 | 12.5% | 40 |
| mld.DustBunny 3.8 | 4.0 | 12.3% | 7 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.2% | 14 |
| kawigi.robot.Girl 1.2 | 5.3 | 10.1% | 20 |
| lambdaxy.TBot 0.1 | 7.3 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.8% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.9 | 22 / 35 | 5476 |
| 2 | 1 | 65.6 | 74.6 | 13 / 35 | 5235 |
| 3 | 1 | 68.1 | 83.2 | 18 / 35 | 5628 |
| 4 | 1 | 69.3 | 87.3 | 19 / 35 | 5748 |
| 5 | 1 | 68.5 | 85.7 | 18 / 35 | 5512 |
| 6 | 1 | 68.8 | 84.4 | 18 / 35 | 6031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 37 | 70% |
| kawigi.micro.Shiz 1.1 | 30 | 93% |
| cb.nano.Insomnia 1.0 | 21 | 86% |
| kawigi.robot.Girl 1.2 | 18 | 83% |
| mld.DustBunny 3.8 | 18 | 100% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 29 | 28% | 70 |
| cb.nano.Insomnia 1.0 | 22 | 21% | 21 |
| kawigi.micro.Shiz 1.1 | 16 | 15% | 41 |
| mld.DustBunny 3.8 | 14 | 13% | 38 |
| kawigi.robot.Girl 1.2 | 11 | 11% | 19 |
| Grystrion.TrackerWO 1.0 | 4 | 4% | 5 |
| lambdaxy.TBot 0.1 | 3 | 3% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 2 |
| divineomega.TrialBot 0.003 | 1 | 1% | 9 |
2 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.1 | 88 / 210 | 2.61 | 18.0% | 33147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.2 | 18.0% | 88 |
| gh.Griezel 0.5.2 | 2.0 | 16.4% | 70 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.8% | 17 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.6% | 26 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 8.9% | 2 |
| tvv.nano.Polaris 1.2 | 6.2 | 8.3% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.2 | 8.3% | 4 |
| asd.Cthulhu 1.3 | 8.7 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.0% | 1 |
| repositorio.NanoStep 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.1 | 13 / 35 | 5607 |
| 2 | 1 | 67.9 | 82.9 | 18 / 35 | 5373 |
| 3 | 1 | 66.9 | 80.0 | 12 / 35 | 5665 |
| 4 | 1 | 66.5 | 76.8 | 13 / 35 | 5644 |
| 5 | 1 | 69.5 | 87.3 | 20 / 35 | 5612 |
| 6 | 2 | 67.2 | 81.6 | 12 / 35 | 5246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 72 | 56% |
| techdude.forest.FlamingForest 1.1 | 21 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 93% |
| bvh.fnr.Fenrir 0.36l | 9 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| asd.Cthulhu 1.3 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 55 | 45% | 97 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 27 | 22% | 46 |
| bvh.fnr.Fenrir 0.36l | 16 | 13% | 20 |
| techdude.forest.FlamingForest 1.1 | 13 | 11% | 27 |
| divineomega.DivineBot 1.9.4.5 | 3 | 2% | 6 |
| asd.Cthulhu 1.3 | 3 | 2% | 5 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 4 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.5 | 87 / 210 | 2.84 | 17.2% | 31357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 17.2% | 87 |
| et.Predator 1.8 | 3.0 | 12.9% | 24 |
| cx.BlestPain 1.41 | 3.3 | 12.4% | 49 |
| oog.melee.Mercutio 1.0 | 3.8 | 12.4% | 21 |
| nic.Nicator 2.4 | 4.5 | 11.7% | 15 |
| ahf.NanoAndrew .4 | 5.7 | 10.7% | 8 |
| maribo.melee.BMV 0.1 | 6.7 | 9.3% | 6 |
| tex.Longbot 0.4 | 8.3 | 5.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.9 | 17 / 35 | 5107 |
| 2 | 1 | 67.0 | 81.3 | 13 / 35 | 5442 |
| 3 | 1 | 65.1 | 78.1 | 14 / 35 | 4735 |
| 4 | 1 | 68.0 | 84.8 | 15 / 35 | 5398 |
| 5 | 1 | 63.0 | 68.3 | 8 / 35 | 5011 |
| 6 | 1 | 68.2 | 82.9 | 20 / 35 | 5664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 38 | 74% |
| cx.BlestPain 1.41 | 34 | 35% |
| nic.Nicator 2.4 | 23 | 87% |
| oog.melee.Mercutio 1.0 | 19 | 84% |
| ahf.NanoAndrew .4 | 7 | 86% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 29% | 54 |
| oog.melee.Mercutio 1.0 | 22 | 18% | 40 |
| nic.Nicator 2.4 | 22 | 18% | 38 |
| et.Predator 1.8 | 17 | 14% | 40 |
| ahf.NanoAndrew .4 | 15 | 12% | 24 |
| maribo.melee.BMV 0.1 | 8 | 7% | 9 |
| tex.Longbot 0.4 | 3 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.9 | 132 / 210 | 2.27 | 18.6% | 29047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 18.6% | 132 |
| morbid.MorbidPriest 1.0 | 2.5 | 12.3% | 26 |
| uji.DBH 1.1 | 3.5 | 11.1% | 7 |
| agd.Mooserwirt2 2.7 | 3.5 | 12.2% | 24 |
| ratosh.Nobo 0.21 | 5.0 | 10.0% | 3 |
| spinnercat.Robovirus 2.718 | 6.2 | 9.0% | 2 |
| sigterm.Sigterm 1.0 | 6.5 | 8.5% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.4% | 5 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 24 / 35 | 4764 |
| 2 | 1 | 66.2 | 82.5 | 20 / 35 | 4518 |
| 3 | 1 | 67.7 | 85.1 | 21 / 35 | 4978 |
| 4 | 1 | 68.5 | 87.0 | 20 / 35 | 5247 |
| 5 | 1 | 67.1 | 82.9 | 22 / 35 | 4588 |
| 6 | 1 | 68.8 | 89.8 | 25 / 35 | 4952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 42 | 81% |
| agd.Mooserwirt2 2.7 | 30 | 67% |
| uji.DBH 1.1 | 27 | 96% |
| sigterm.Sigterm 1.0 | 16 | 94% |
| spinnercat.Robovirus 2.718 | 15 | 93% |
| ratosh.Nobo 0.21 | 10 | 90% |
| stelo.WangRobot 1.0 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 26 | 33% | 70 |
| agd.Mooserwirt2 2.7 | 15 | 19% | 50 |
| ratosh.Nobo 0.21 | 9 | 11% | 18 |
| uji.DBH 1.1 | 8 | 10% | 18 |
| sigterm.Sigterm 1.0 | 6 | 8% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 6% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 11 |
| stelo.WangRobot 1.0 | 3 | 4% | 12 |
| spinnercat.Robovirus 2.718 | 3 | 4% | 10 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.3 | 151 / 210 | 1.78 | 20.2% | 34490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 20.2% | 151 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.7% | 23 |
| mld.Infinity 2.2 | 2.7 | 14.2% | 25 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.4% | 3 |
| erdnis.Rover 0.3 | 4.7 | 10.3% | 3 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.7% | 1 |
| mbh.Mbh 0.1 | 7.7 | 6.8% | 0 |
| pac.ABC 2.1 | 7.8 | 6.9% | 3 |
| pbg.R2D2 1.0 | 8.5 | 5.8% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 95.6 | 28 / 35 | 5869 |
| 2 | 1 | 70.7 | 91.1 | 24 / 35 | 5512 |
| 3 | 1 | 71.5 | 92.7 | 26 / 35 | 5706 |
| 4 | 1 | 69.6 | 85.1 | 21 / 35 | 5777 |
| 5 | 1 | 70.2 | 88.6 | 26 / 35 | 5609 |
| 6 | 1 | 72.2 | 94.9 | 26 / 35 | 6017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 77 | 91% |
| mld.Infinity 2.2 | 47 | 83% |
| krillr.mini.JointStrike 2.0.0 | 20 | 90% |
| patson.PatsonTestBot 1.0 | 12 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| erdnis.Rover 0.3 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 24 | 40% | 108 |
| mld.Infinity 2.2 | 18 | 30% | 32 |
| krillr.mini.JointStrike 2.0.0 | 11 | 18% | 28 |
| patson.PatsonTestBot 1.0 | 3 | 5% | 13 |
| erdnis.Rover 0.3 | 2 | 3% | 11 |
| pac.ABC 2.1 | 2 | 3% | 4 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 4 |

## Melee bench: F20

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.3 | 113 / 210 | 2.06 | 19.5% | 35170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 19.5% | 113 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.4% | 52 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.0% | 10 |
| catcat20.Rabbit 0.001 | 4.2 | 10.0% | 16 |
| fwb.Nine 1.0.1 | 4.3 | 10.2% | 12 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.1% | 2 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.6% | 4 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.6% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.2 | 20 / 35 | 5752 |
| 2 | 1 | 69.7 | 88.6 | 19 / 35 | 5949 |
| 3 | 1 | 70.1 | 88.6 | 23 / 35 | 5982 |
| 4 | 1 | 68.9 | 87.6 | 15 / 35 | 6017 |
| 5 | 1 | 68.5 | 86.0 | 18 / 35 | 5610 |
| 6 | 1 | 69.6 | 88.6 | 18 / 35 | 5860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 71% |
| fwb.Nine 1.0.1 | 20 | 65% |
| catcat20.Rabbit 0.001 | 19 | 84% |
| nz.jdc.nano.GridFu 1.0 | 18 | 72% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1074. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 49 | 50% | 95 |
| fwb.Nine 1.0.1 | 16 | 16% | 14 |
| catcat20.Rabbit 0.001 | 11 | 11% | 34 |
| nz.jdc.nano.GridFu 1.0 | 10 | 10% | 29 |
| bayen.nut.Squirrel 1.615 | 5 | 5% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 10 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 6 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.9 | 135 / 210 | 1.82 | 20.2% | 35846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 20.2% | 135 |
| eem.EvBot v4.6.16 | 2.2 | 15.6% | 49 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.2% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 7 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 9 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.5% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.2% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.1 | 22 / 35 | 6436 |
| 2 | 1 | 68.8 | 86.3 | 17 / 35 | 5563 |
| 3 | 1 | 70.8 | 89.5 | 23 / 35 | 6055 |
| 4 | 1 | 70.9 | 91.1 | 25 / 35 | 5911 |
| 5 | 1 | 70.6 | 94.6 | 22 / 35 | 5625 |
| 6 | 1 | 71.5 | 92.7 | 26 / 35 | 6256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 93 | 74% |
| dummy.mini.Scimitar 1.01 | 41 | 88% |
| cf.RiO.RiOx 4.2.1 | 19 | 100% |
| eld.Hmm 1.0 | 11 | 55% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 1201. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 33 | 43% | 79 |
| dummy.mini.Scimitar 1.01 | 19 | 25% | 72 |
| cf.RiO.RiOx 4.2.1 | 14 | 18% | 26 |
| eld.Hmm 1.0 | 6 | 8% | 16 |
| fire219.CatBot 1.0 | 2 | 3% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 9 |
| el.JumpShoot 0.2 | 0 | 0% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.3 | 77 / 210 | 2.60 | 17.3% | 30959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.5 | 17.2% | 70 |
| hadur117.mini.DeiseFIT3F 0.3 | 1.5 | 17.3% | 77 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.6% | 40 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 20 |
| bigpete.Stewie 1.0 | 5.0 | 10.0% | 2 |
| tad.Dalek98 0.98 | 7.0 | 6.5% | 1 |
| gg.Squaraus 0.6 | 7.2 | 6.3% | 0 |
| yk.JahRoslav 1.1 | 7.3 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.5 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 79.4 | 14 / 35 | 4992 |
| 2 | 1 | 68.9 | 86.3 | 16 / 35 | 5408 |
| 3 | 1 | 66.8 | 81.3 | 12 / 35 | 5126 |
| 4 | 2 | 67.2 | 80.6 | 13 / 35 | 5188 |
| 5 | 2 | 66.5 | 79.7 | 10 / 35 | 5242 |
| 6 | 1 | 67.7 | 86.3 | 12 / 35 | 5003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 41 | 66% |
| pe.SandboxDT 2.71m | 39 | 44% |
| jlm.javaDisturbance 0.59 | 33 | 82% |
| bigpete.Stewie 1.0 | 3 | 100% |
| tad.Dalek98 0.98 | 2 | 50% |
| pbg.NinjaX 1.2 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 46 | 35% | 65 |
| pe.SandboxDT 2.71m | 45 | 34% | 70 |
| jlm.javaDisturbance 0.59 | 27 | 20% | 51 |
| bigpete.Stewie 1.0 | 8 | 6% | 12 |
| yk.JahRoslav 1.1 | 4 | 3% | 4 |
| tad.Dalek98 0.98 | 1 | 1% | 3 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.2 | 133 / 210 | 1.70 | 19.7% | 30758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 19.7% | 133 |
| pe.SandboxLump 1.52 | 2.0 | 17.6% | 55 |
| cre.Karolos 0.32 | 3.0 | 13.1% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.2% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.7% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.8% | 3 |
| cw.megas.Blade 0.8 | 6.8 | 8.2% | 0 |
| sample.Walls 1.0 | 7.3 | 8.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.5 | 17 / 35 | 4974 |
| 2 | 1 | 71.3 | 93.3 | 23 / 35 | 5407 |
| 3 | 1 | 70.7 | 92.4 | 22 / 35 | 5394 |
| 4 | 1 | 71.0 | 93.0 | 27 / 35 | 5020 |
| 5 | 1 | 70.8 | 92.1 | 22 / 35 | 4916 |
| 6 | 1 | 70.8 | 91.7 | 22 / 35 | 5047 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 96 | 67% |
| cre.Karolos 0.32 | 26 | 85% |
| stelo.AreaTargetingBot 1.1 | 19 | 100% |
| stelo.RamTrackSurfer 1.2 | 11 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 48 | 62% | 109 |
| cre.Karolos 0.32 | 14 | 18% | 41 |
| stelo.AreaTargetingBot 1.1 | 6 | 8% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 6% | 10 |
| stelo.RamTrackSurfer 1.2 | 3 | 4% | 22 |
| sample.Walls 1.0 | 1 | 1% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |

## Melee bench: F24

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 75.4 | 76 / 210 | 3.21 | 15.5% | 23953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.5 | 15.5% | 76 |
| rz.GlowBlowMelee 1.4 | 1.7 | 14.4% | 43 |
| florent.XSeries.X2 0.12 | 3.2 | 13.4% | 35 |
| davidalves.Phoenix 0.54 | 4.0 | 12.4% | 38 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.5% | 14 |
| oog.melee.Corsair 1.0 | 6.2 | 9.2% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.4% | 4 |
| lunchie.Lunchbox 0.93 | 8.3 | 6.0% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 0 |
| evd.X1 0.01 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 71.4 | 10 / 35 | 4101 |
| 2 | 1 | 66.6 | 82.9 | 18 / 35 | 4350 |
| 3 | 1 | 62.4 | 73.0 | 10 / 35 | 3970 |
| 4 | 2 | 62.4 | 72.1 | 12 / 35 | 3802 |
| 5 | 2 | 63.2 | 73.7 | 11 / 35 | 3987 |
| 6 | 1 | 64.4 | 79.4 | 15 / 35 | 3743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 67% |
| florent.XSeries.X2 0.12 | 27 | 67% |
| davidalves.Phoenix 0.54 | 21 | 67% |
| pedersen.Ugluk 1.1.1 | 16 | 81% |
| stelo.SoJNanoMelee 1.1 | 8 | 88% |
| oog.melee.Corsair 1.0 | 4 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 35 | 26% | 53 |
| rz.GlowBlowMelee 1.4 | 33 | 24% | 56 |
| davidalves.Phoenix 0.54 | 26 | 19% | 38 |
| pedersen.Ugluk 1.1.1 | 20 | 15% | 31 |
| stelo.SoJNanoMelee 1.1 | 10 | 7% | 13 |
| oog.melee.Corsair 1.0 | 5 | 4% | 12 |
| evd.X1 0.01 | 3 | 2% | 3 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.1 | 131 / 210 | 2.34 | 18.3% | 26217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 18.3% | 131 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.1% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.8% | 13 |
| jdw.Hurricane 1.4 | 4.0 | 10.7% | 20 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.5% | 8 |
| ds.Oo 2.2 | 5.8 | 8.9% | 4 |
| awesomeness.Elite 1.0 | 7.5 | 7.4% | 3 |
| gjr.Cephalosporin 0.1 | 8.2 | 7.0% | 2 |
| adt.Ar2 1.1 | 8.3 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.3 | 25 / 35 | 4492 |
| 2 | 1 | 68.7 | 87.0 | 23 / 35 | 4757 |
| 3 | 1 | 67.7 | 85.1 | 21 / 35 | 4467 |
| 4 | 1 | 67.0 | 83.5 | 20 / 35 | 4105 |
| 5 | 1 | 66.3 | 81.9 | 20 / 35 | 3961 |
| 6 | 1 | 67.9 | 85.7 | 22 / 35 | 4435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 53 | 85% |
| voidious.micro.BlitzBat 1.05 | 48 | 96% |
| jdw.Hurricane 1.4 | 26 | 77% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| ds.Oo 2.2 | 5 | 100% |
| gre.svman4.Morfeas 1.4.1 | 3 | 33% |
| adt.Ar2 1.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 26 | 33% | 72 |
| jdw.Hurricane 1.4 | 17 | 22% | 36 |
| voidious.micro.BlitzBat 1.05 | 15 | 19% | 54 |
| gre.svman4.Morfeas 1.4.1 | 9 | 11% | 13 |
| ds.Oo 2.2 | 6 | 8% | 15 |
| amk.ChumbaMini 0.2 | 3 | 4% | 3 |
| adt.Ar2 1.1 | 2 | 3% | 5 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 7 |
| awesomeness.Elite 1.0 | 0 | 0% | 5 |

## Melee bench: F26

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.9 | 115 / 210 | 2.18 | 18.8% | 34043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 18.8% | 115 |
| ak.Fermat 2.0 | 2.3 | 14.2% | 37 |
| lrem.Spectre 0.4.4 | 3.3 | 12.5% | 19 |
| shu.nitro.LENIN .T34 | 3.7 | 12.2% | 22 |
| js.PinBall 1.6 | 4.7 | 11.1% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.5% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.7% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 4 |
| sample.SpinBot 1.0 | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.6 | 13 / 35 | 5348 |
| 2 | 1 | 67.5 | 82.9 | 16 / 35 | 5456 |
| 3 | 1 | 68.8 | 87.0 | 19 / 35 | 5628 |
| 4 | 1 | 69.6 | 87.6 | 21 / 35 | 5680 |
| 5 | 1 | 70.0 | 89.8 | 21 / 35 | 5728 |
| 6 | 1 | 70.9 | 92.4 | 25 / 35 | 6203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 47 | 83% |
| ak.Fermat 2.0 | 35 | 80% |
| shu.nitro.LENIN .T34 | 33 | 64% |
| js.PinBall 1.6 | 11 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| gh.mini.GrubbmOne 1.0 | 5 | 80% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 26 | 27% | 58 |
| ak.Fermat 2.0 | 24 | 25% | 51 |
| lrem.Spectre 0.4.4 | 17 | 18% | 44 |
| js.PinBall 1.6 | 10 | 11% | 21 |
| gh.mini.GrubbmOne 1.0 | 7 | 7% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 7% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 4% | 12 |

## Melee bench: F27

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.0 | 128 / 210 | 2.17 | 18.8% | 29662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 18.8% | 128 |
| mk.Alpha 0.2.1 | 2.3 | 13.5% | 42 |
| EH.Eagle 1.0.6 | 3.3 | 11.3% | 4 |
| wee.Gem 1.8.4 | 3.7 | 10.9% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 10.6% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 7.2 | 7.9% | 4 |
| joe.ADinosaur 1.0 | 7.3 | 8.1% | 5 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.6% | 0 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.0% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.3 | 18 / 35 | 4774 |
| 2 | 1 | 69.2 | 89.8 | 25 / 35 | 5038 |
| 3 | 1 | 69.9 | 83.8 | 21 / 35 | 6138 |
| 4 | 1 | 65.2 | 81.0 | 14 / 35 | 4366 |
| 5 | 1 | 69.5 | 90.8 | 27 / 35 | 4884 |
| 6 | 1 | 68.0 | 89.2 | 23 / 35 | 4462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 64 | 75% |
| wee.Gem 1.8.4 | 30 | 77% |
| EH.Eagle 1.0.6 | 25 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 90% |
| throxbot.ThroxBot 0.1 | 6 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 75% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 33 | 40% | 73 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 14% | 30 |
| wee.Gem 1.8.4 | 11 | 13% | 40 |
| EH.Eagle 1.0.6 | 9 | 11% | 34 |
| joe.ADinosaur 1.0 | 6 | 7% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 7% | 10 |
| throxbot.ThroxBot 0.1 | 4 | 5% | 8 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 4 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.9 | 132 / 210 | 2.00 | 18.9% | 28231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.2 | 18.9% | 132 |
| kid.test.NightFox .2 | 1.8 | 15.6% | 44 |
| uji.Antique 1.0 | 3.3 | 11.6% | 14 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 11.2% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.0% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.1% | 1 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.7% | 4 |
| stelo.PianistNano 1.2 | 8.7 | 5.7% | 0 |
| matt.advanced.Katana 1.0 | 9.2 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.2 | 23 / 35 | 4494 |
| 2 | 1 | 69.4 | 91.7 | 23 / 35 | 4741 |
| 3 | 2 | 67.7 | 86.0 | 18 / 35 | 4618 |
| 4 | 1 | 69.1 | 92.1 | 24 / 35 | 4506 |
| 5 | 1 | 68.6 | 88.3 | 22 / 35 | 4840 |
| 6 | 1 | 69.7 | 92.1 | 22 / 35 | 5032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 89 | 75% |
| uji.Antique 1.0 | 37 | 89% |
| qohnil.blot.BlotBot 3.61 | 18 | 83% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| ahr.ice.Ice 1.0.2 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 34 | 44% | 95 |
| uji.Antique 1.0 | 12 | 15% | 44 |
| qohnil.blot.BlotBot 3.61 | 11 | 14% | 27 |
| amk.ChumbaWumba 0.3 | 9 | 12% | 14 |
| pfvicm.Sobieski 7.2.3b | 8 | 10% | 11 |
| ahr.ice.Ice 1.0.2 | 3 | 4% | 10 |
| stelo.Lifestealer 1.0 | 1 | 1% | 1 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 80.3 | 98 / 210 | 2.78 | 17.9% | 30565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 17.9% | 98 |
| deewiant.Anomaly 0.2 | 2.5 | 14.6% | 39 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.9% | 45 |
| myl.micro.Troodon 1.10 | 4.2 | 11.8% | 9 |
| jok.PheonixM 0.1.2 | 4.8 | 10.8% | 7 |
| DBall.Anarchy 0.1 | 6.5 | 7.5% | 6 |
| ph.melee.ArcherME 0.3 | 6.5 | 7.6% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.9% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.4% | 1 |
| ap.Frederick 1.1 | 9.5 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.0 | 17 / 35 | 5050 |
| 2 | 1 | 67.2 | 79.0 | 14 / 35 | 5318 |
| 3 | 1 | 67.2 | 80.0 | 14 / 35 | 5089 |
| 4 | 1 | 67.1 | 79.4 | 14 / 35 | 4881 |
| 5 | 1 | 65.1 | 72.7 | 14 / 35 | 4715 |
| 6 | 1 | 70.8 | 89.5 | 25 / 35 | 5512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 40 | 85% |
| zyx.mega.YersiniaPestis 3.1 | 37 | 65% |
| myl.micro.Troodon 1.10 | 25 | 96% |
| jok.PheonixM 0.1.2 | 9 | 78% |
| DBall.Anarchy 0.1 | 8 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 41% | 84 |
| zyx.mega.YersiniaPestis 3.1 | 31 | 28% | 52 |
| myl.micro.Troodon 1.10 | 15 | 13% | 36 |
| jok.PheonixM 0.1.2 | 11 | 10% | 20 |
| ph.melee.ArcherME 0.3 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

## Melee bench: F30

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 70.4 | 36 / 210 | 3.66 | 14.0% | 23493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 2.0 | 14.0% | 36 |
| catcat20.Matcha 0.006 | 2.2 | 14.1% | 57 |
| oog.melee.Capulet 1.2 | 3.5 | 12.9% | 28 |
| darkcanuck.B26354 1.06 | 3.5 | 12.9% | 42 |
| stelo.PastFuture 2.3.2 | 3.8 | 13.3% | 33 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.5% | 9 |
| ntc.Opposite 1.5 | 7.3 | 7.9% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.4% | 3 |
| tripphippy.Alice 1.1 | 8.3 | 6.2% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 68.3 | 7 / 35 | 3871 |
| 2 | 1 | 61.8 | 71.4 | 8 / 35 | 4262 |
| 3 | 3 | 59.5 | 65.4 | 4 / 35 | 3760 |
| 4 | 1 | 62.4 | 73.7 | 7 / 35 | 4069 |
| 5 | 4 | 59.7 | 67.0 | 2 / 35 | 3762 |
| 6 | 1 | 62.4 | 76.8 | 8 / 35 | 3769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 21 | 29% |
| catcat20.Matcha 0.006 | 19 | 32% |
| stelo.PastFuture 2.3.2 | 14 | 64% |
| oog.melee.Capulet 1.2 | 12 | 58% |
| intruder.PrairieWolf 2.61 | 5 | 60% |
| tripphippy.Alice 1.1 | 3 | 67% |
| ntc.Opposite 1.5 | 2 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 46 | 26% | 54 |
| stelo.PastFuture 2.3.2 | 35 | 20% | 44 |
| darkcanuck.B26354 1.06 | 32 | 18% | 38 |
| oog.melee.Capulet 1.2 | 26 | 15% | 32 |
| intruder.PrairieWolf 2.61 | 13 | 7% | 17 |
| tripphippy.Alice 1.1 | 10 | 6% | 11 |
| ntc.Opposite 1.5 | 8 | 5% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 73.2 | 51 / 210 | 3.41 | 14.8% | 22862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.3% | 90 |
| hadur117.mini.DeiseFIT3F 0.3 | 2.0 | 14.8% | 51 |
| gh.mini.Griezel 0.2 | 3.0 | 13.5% | 43 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.4% | 9 |
| d414.nano.Quantum 1.0.0 | 4.7 | 10.6% | 12 |
| gh.nano.Grofvuil 0.2 | 6.3 | 8.7% | 4 |
| fm.mammillarias 1.3 | 7.3 | 6.9% | 0 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.0% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.2% | 1 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 76.8 | 8 / 35 | 3581 |
| 2 | 2 | 62.8 | 74.6 | 10 / 35 | 3764 |
| 3 | 3 | 60.2 | 67.6 | 6 / 35 | 3508 |
| 4 | 2 | 61.0 | 69.8 | 6 / 35 | 3747 |
| 5 | 1 | 65.1 | 78.1 | 11 / 35 | 4595 |
| 6 | 2 | 62.2 | 72.1 | 10 / 35 | 3667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 44 | 55% |
| gh.mini.Griezel 0.2 | 18 | 56% |
| d414.nano.Quantum 1.0.0 | 8 | 50% |
| spinnercat.micro.Tyger 0.1 | 7 | 100% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |

Hadur died in 159 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 59 | 37% | 83 |
| gh.mini.Griezel 0.2 | 40 | 25% | 51 |
| spinnercat.micro.Tyger 0.1 | 16 | 10% | 22 |
| d414.nano.Quantum 1.0.0 | 13 | 8% | 19 |
| fm.mammillarias 1.3 | 13 | 8% | 13 |
| gh.nano.Grofvuil 0.2 | 9 | 6% | 12 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 3% | 5 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.4 | 130 / 210 | 2.05 | 18.7% | 29648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 18.7% | 130 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 52 |
| apc.botM 3.0 | 3.0 | 11.7% | 11 |
| lxx.ConceptA 0.8 | 4.3 | 10.3% | 1 |
| vjik.UnViolation 1.1 | 5.0 | 9.9% | 6 |
| bayen.UbaMicro 1.4 | 5.7 | 8.9% | 4 |
| yk.JahMicro 1.0 | 7.8 | 7.0% | 2 |
| panzer.Panzer 0.2 | 8.0 | 7.0% | 0 |
| conscience.Electron 1.3g | 8.2 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.3 | 24 / 35 | 4710 |
| 2 | 1 | 67.0 | 85.4 | 20 / 35 | 4719 |
| 3 | 1 | 68.9 | 90.8 | 23 / 35 | 4896 |
| 4 | 1 | 66.8 | 85.7 | 18 / 35 | 4802 |
| 5 | 1 | 69.1 | 88.9 | 23 / 35 | 5367 |
| 6 | 1 | 69.2 | 92.1 | 22 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 77 | 66% |
| apc.botM 3.0 | 32 | 88% |
| lxx.ConceptA 0.8 | 20 | 95% |
| donjezza.Jezza 1.0 | 9 | 100% |
| vjik.UnViolation 1.1 | 8 | 100% |
| panzer.Panzer 0.2 | 7 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| yk.JahMicro 1.0 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 44 | 54% | 95 |
| lxx.ConceptA 0.8 | 16 | 20% | 26 |
| bayen.UbaMicro 1.4 | 7 | 9% | 12 |
| apc.botM 3.0 | 6 | 7% | 42 |
| vjik.UnViolation 1.1 | 3 | 4% | 20 |
| yk.JahMicro 1.0 | 2 | 2% | 3 |
| panzer.Panzer 0.2 | 2 | 2% | 3 |
| conscience.Electron 1.3g | 1 | 1% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 5 |

## Melee bench: F33

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.6 | 116 / 210 | 2.30 | 18.8% | 32055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.2 | 18.8% | 116 |
| maribo.Quester 0.3 | 1.8 | 16.3% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.6% | 16 |
| labg.Cataclysm 2.05 | 4.5 | 10.5% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.3% | 9 |
| baal.nano.N 1.42 | 5.8 | 8.9% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.2% | 2 |
| zyx.micro.Ant 1.1 | 8.0 | 5.5% | 1 |
| sanja.First 0.1 | 9.5 | 4.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 78.7 | 16 / 35 | 4862 |
| 2 | 1 | 69.6 | 88.3 | 18 / 35 | 5518 |
| 3 | 1 | 70.0 | 87.9 | 22 / 35 | 5766 |
| 4 | 1 | 68.6 | 87.0 | 20 / 35 | 5072 |
| 5 | 1 | 69.7 | 86.3 | 21 / 35 | 5541 |
| 6 | 1 | 68.7 | 85.1 | 19 / 35 | 5296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 52 | 81% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 86% |
| gre.svman4.Leonidas 1.3.2 | 25 | 96% |
| labg.Cataclysm 2.05 | 12 | 42% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 5 | 80% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 40 | 43% | 90 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 17% | 49 |
| labg.Cataclysm 2.05 | 14 | 15% | 22 |
| gre.svman4.Leonidas 1.3.2 | 8 | 9% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 6% | 8 |
| baal.nano.N 1.42 | 5 | 5% | 6 |
| zyx.micro.Ant 1.1 | 3 | 3% | 8 |
| sanja.First 0.1 | 1 | 1% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.9 | 73 / 210 | 2.54 | 17.2% | 30392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.7 | 17.2% | 73 |
| stelo.Spread 0.9 | 1.8 | 16.9% | 74 |
| kid.Gladiator .7.2 | 2.5 | 16.0% | 41 |
| jcs.Seth 1.8 | 4.3 | 11.4% | 14 |
| tcf.Reach 3 | 5.0 | 10.1% | 4 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 3 |
| amk.Punbot.Punbot 0.01 | 8.2 | 5.1% | 1 |
| sample.VelociRobot 1.0 | 8.8 | 3.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.7 | 17 / 35 | 5240 |
| 2 | 3 | 66.1 | 80.3 | 10 / 35 | 4668 |
| 3 | 1 | 67.5 | 84.1 | 12 / 35 | 4937 |
| 4 | 2 | 67.2 | 83.2 | 8 / 35 | 5176 |
| 5 | 1 | 67.7 | 82.9 | 14 / 35 | 5434 |
| 6 | 2 | 66.9 | 81.0 | 12 / 35 | 4937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 71 | 56% |
| kid.Gladiator .7.2 | 34 | 56% |
| jcs.Seth 1.8 | 6 | 67% |
| ratosh.Wesco 1.4 | 4 | 50% |
| cli.Dancer 1.1 | 4 | 100% |
| tcf.Reach 3 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 63 | 46% | 98 |
| kid.Gladiator .7.2 | 46 | 34% | 63 |
| jcs.Seth 1.8 | 13 | 9% | 20 |
| tcf.Reach 3 | 6 | 4% | 10 |
| ratosh.Wesco 1.4 | 6 | 4% | 10 |
| cli.Dancer 1.1 | 2 | 1% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 76.4 | 35 / 210 | 3.12 | 14.7% | 22156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.9% | 146 |
| hadur117.mini.DeiseFIT3F 0.3 | 2.0 | 14.7% | 35 |
| gh.mini.Gruwel 0.9 | 3.7 | 12.6% | 9 |
| rz.HawkOnFire 0.1 | 4.0 | 12.1% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.4% | 12 |
| wit.Chuliath 1.0 | 6.3 | 7.4% | 2 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 73.0 | 8 / 35 | 3679 |
| 2 | 2 | 61.5 | 73.0 | 6 / 35 | 3394 |
| 3 | 2 | 63.8 | 79.7 | 8 / 35 | 3725 |
| 4 | 2 | 62.8 | 77.8 | 3 / 35 | 3307 |
| 5 | 2 | 64.7 | 79.4 | 6 / 35 | 4356 |
| 6 | 2 | 62.8 | 75.6 | 4 / 35 | 3695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 70 | 23% |
| gh.mini.Gruwel 0.9 | 11 | 82% |
| rz.HawkOnFire 0.1 | 9 | 89% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 50% |
| wit.Chuliath 1.0 | 2 | 0% |

Hadur died in 175 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 85 | 49% | 99 |
| gh.mini.Gruwel 0.9 | 37 | 21% | 45 |
| rz.HawkOnFire 0.1 | 27 | 15% | 39 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 9% | 17 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 3 | 2% | 2 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.5 | 168 / 210 | 1.67 | 21.1% | 34815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 21.1% | 168 |
| alpha.RainingFire 1.0 | 2.5 | 11.9% | 17 |
| bzdp.Pansy 2.1 | 3.0 | 11.4% | 8 |
| bvh.micro.Freya 0.3 | 4.2 | 10.7% | 4 |
| mz.Cork 0.1 | 4.7 | 10.2% | 1 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.4% | 5 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.2% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 5.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.8% | 1 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.0 | 24 / 35 | 5512 |
| 2 | 1 | 71.0 | 91.7 | 25 / 35 | 5699 |
| 3 | 1 | 70.8 | 92.1 | 28 / 35 | 5567 |
| 4 | 1 | 72.5 | 96.5 | 32 / 35 | 5998 |
| 5 | 1 | 71.4 | 92.4 | 29 / 35 | 5781 |
| 6 | 1 | 72.3 | 95.6 | 30 / 35 | 6258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 40 | 95% |
| alpha.RainingFire 1.0 | 33 | 85% |
| bvh.micro.Freya 0.3 | 31 | 100% |
| mz.Cork 0.1 | 29 | 97% |
| bvh.mini.Fenrir 0.39 | 19 | 100% |
| m3thos.Eva02 0.7.1 | 12 | 92% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| dl.BetterWalls 1.0 | 4 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 13 | 31% | 39 |
| bzdp.Pansy 2.1 | 12 | 29% | 53 |
| m3thos.Eva02 0.7.1 | 5 | 12% | 23 |
| bvh.mini.Fenrir 0.39 | 4 | 10% | 15 |
| bvh.micro.Freya 0.3 | 3 | 7% | 30 |
| mz.Cork 0.1 | 2 | 5% | 32 |
| sample.MyFirstRobot 1.0 | 2 | 5% | 8 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |
| dl.BetterWalls 1.0 | 0 | 0% | 6 |

## Melee bench: F37

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 93.1 | 175 / 210 | 1.62 | 20.5% | 35882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 20.5% | 175 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.2% | 1 |
| germ.TheMind .2 | 3.7 | 10.2% | 8 |
| EBBU.Sim2 1.02 | 4.3 | 9.7% | 2 |
| agrach.Dalek 1.0 | 4.7 | 9.5% | 9 |
| stelo.UntouchableNano 1.3 | 5.2 | 9.2% | 9 |
| mb.Beast 0.1 | 7.2 | 8.0% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.6% | 1 |
| lmk.ACPFinal 0.1 | 8.3 | 7.7% | 1 |
| skm.Ryubot 1.0 | 8.8 | 7.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.6 | 25 / 35 | 5527 |
| 2 | 1 | 70.1 | 93.0 | 28 / 35 | 6056 |
| 3 | 1 | 71.2 | 94.9 | 32 / 35 | 6307 |
| 4 | 1 | 70.4 | 94.6 | 30 / 35 | 6079 |
| 5 | 1 | 69.7 | 89.8 | 28 / 35 | 6174 |
| 6 | 1 | 70.9 | 98.7 | 32 / 35 | 5739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 39 | 92% |
| stelo.UntouchableNano 1.3 | 35 | 86% |
| agrach.Dalek 1.0 | 27 | 96% |
| skm.Ryubot 1.0 | 22 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 100% |
| EBBU.Sim2 1.02 | 20 | 95% |
| mb.Beast 0.1 | 15 | 100% |
| lmk.ACPFinal 0.1 | 6 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 507. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 10 | 28% | 30 |
| germ.TheMind .2 | 6 | 17% | 36 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 11% | 37 |
| EBBU.Sim2 1.02 | 4 | 11% | 25 |
| lmk.ACPFinal 0.1 | 4 | 11% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 11% | 12 |
| agrach.Dalek 1.0 | 3 | 8% | 32 |
| mb.Beast 0.1 | 1 | 3% | 15 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

## Melee bench: F38

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 73.2 | 53 / 210 | 3.41 | 14.8% | 24187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 15.6% | 71 |
| hadur117.mini.DeiseFIT3F 0.3 | 2.3 | 14.8% | 53 |
| bvh.mini.Freya 0.55 | 2.8 | 13.2% | 25 |
| bts.mega.Gnarly 1.4 | 4.3 | 12.0% | 30 |
| cs.Wren 1.0 | 4.5 | 11.2% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.8 | 10.6% | 8 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.5% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.3% | 4 |
| bzdp.BoxCar 2.0 | 9.3 | 3.9% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 70.5 | 8 / 35 | 3697 |
| 2 | 2 | 62.5 | 74.0 | 7 / 35 | 3983 |
| 3 | 3 | 60.6 | 67.3 | 8 / 35 | 3854 |
| 4 | 2 | 63.2 | 73.3 | 10 / 35 | 4343 |
| 5 | 2 | 63.4 | 76.8 | 9 / 35 | 3873 |
| 6 | 2 | 64.5 | 77.5 | 11 / 35 | 4437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 31 | 48% |
| bts.mega.Gnarly 1.4 | 13 | 54% |
| bvh.mini.Freya 0.55 | 11 | 91% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 80% |
| cs.Wren 1.0 | 7 | 100% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 50 | 32% | 68 |
| bts.mega.Gnarly 1.4 | 37 | 24% | 44 |
| bvh.mini.Freya 0.55 | 27 | 17% | 34 |
| cs.Wren 1.0 | 16 | 10% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 7% | 19 |
| kdf.KoulDestroyer 1.0 | 10 | 6% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 8 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.5 | 92 / 210 | 2.66 | 17.3% | 30096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 17.3% | 92 |
| bvh.fry.Freya 0.82 | 2.0 | 14.8% | 28 |
| az.Ololobot 0.2.4 | 3.0 | 13.2% | 59 |
| catcat20.Lambda 0.024 | 4.0 | 11.4% | 18 |
| gimp.GimpBot 0.1 | 6.0 | 8.2% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.5% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.7 | 7.9% | 8 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.7% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.0% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 79.0 | 14 / 35 | 5127 |
| 2 | 1 | 64.7 | 76.8 | 12 / 35 | 4850 |
| 3 | 1 | 66.6 | 81.9 | 16 / 35 | 5120 |
| 4 | 1 | 66.9 | 82.9 | 15 / 35 | 5235 |
| 5 | 1 | 66.7 | 84.4 | 19 / 35 | 4637 |
| 6 | 1 | 66.7 | 84.1 | 16 / 35 | 5127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 49 | 84% |
| az.Ololobot 0.2.4 | 37 | 38% |
| catcat20.Lambda 0.024 | 24 | 83% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 89% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 48 | 40% | 87 |
| az.Ololobot 0.2.4 | 35 | 29% | 52 |
| catcat20.Lambda 0.024 | 17 | 14% | 37 |
| gimp.GimpBot 0.1 | 6 | 5% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 4% | 6 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F40

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 85.4 | 110 / 210 | 2.31 | 18.5% | 30123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.2 | 18.5% | 110 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 14.8% | 43 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 11.8% | 16 |
| mz.AntiGrav 1.0 | 4.5 | 10.9% | 12 |
| Polkwane.SmashMelee 1.0 | 4.5 | 11.2% | 15 |
| alpha.BlackIce 1.0 | 6.3 | 8.4% | 2 |
| stelo.Randomness 1.0 | 6.3 | 9.3% | 10 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.3% | 2 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.3% | 0 |
| sample.Corners 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.7 | 19 / 35 | 5486 |
| 2 | 1 | 68.6 | 88.3 | 20 / 35 | 4621 |
| 3 | 1 | 69.4 | 88.3 | 22 / 35 | 5401 |
| 4 | 2 | 64.7 | 76.5 | 9 / 35 | 4622 |
| 5 | 1 | 69.3 | 88.3 | 22 / 35 | 5102 |
| 6 | 1 | 67.7 | 84.4 | 18 / 35 | 4891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 52 | 65% |
| mz.AntiGrav 1.0 | 22 | 100% |
| Polkwane.SmashMelee 1.0 | 22 | 95% |
| kano.gamma.KanoGamma 1.8 | 21 | 81% |
| stelo.Randomness 1.0 | 13 | 77% |
| alpha.BlackIce 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 33% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 47 | 47% | 76 |
| kano.gamma.KanoGamma 1.8 | 18 | 18% | 41 |
| stelo.Randomness 1.0 | 13 | 13% | 27 |
| Polkwane.SmashMelee 1.0 | 12 | 12% | 24 |
| mz.AntiGrav 1.0 | 6 | 6% | 29 |
| alpha.BlackIce 1.0 | 2 | 2% | 3 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 5 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 3 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 81.3 | 91 / 210 | 2.69 | 16.8% | 26211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.3 | 16.8% | 91 |
| eem.EvBotNG v12.8 | 1.7 | 16.1% | 81 |
| ary.Swarm 1.1 | 3.5 | 12.7% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.0% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.6% | 11 |
| shrub.Silver v048 | 6.0 | 9.2% | 3 |
| zyx.nano.Ant 1.1 | 7.3 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 5.8% | 0 |
| stelo.Mirror 1.1 | 8.7 | 5.3% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.8 | 20 / 35 | 4219 |
| 2 | 1 | 65.7 | 81.3 | 15 / 35 | 4327 |
| 3 | 1 | 67.5 | 82.5 | 17 / 35 | 4725 |
| 4 | 2 | 65.1 | 78.1 | 11 / 35 | 4356 |
| 5 | 2 | 64.2 | 77.1 | 10 / 35 | 4111 |
| 6 | 1 | 67.2 | 83.8 | 18 / 35 | 4473 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 44% |
| simonton.nano.MeleeSeed 1.8 | 24 | 88% |
| ary.Swarm 1.1 | 21 | 95% |
| lessonz.robocode.Oz 0.5.0 | 19 | 84% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 49% | 84 |
| ary.Swarm 1.1 | 22 | 18% | 48 |
| simonton.nano.MeleeSeed 1.8 | 14 | 12% | 32 |
| lessonz.robocode.Oz 0.5.0 | 14 | 12% | 25 |
| shrub.Silver v048 | 5 | 4% | 8 |
| zyx.nano.Ant 1.1 | 5 | 4% | 5 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 5 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

## Melee bench: F42

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.9 | 91 / 210 | 2.63 | 17.5% | 32160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 17.5% | 91 |
| wompi.Wallaby 5.1 | 2.2 | 15.5% | 61 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 14.2% | 25 |
| ara.Shera 0.88 | 3.5 | 13.5% | 24 |
| amz.NanoClone 1.41 | 5.2 | 8.9% | 2 |
| dsw.StaticD 1.0 | 6.3 | 7.2% | 5 |
| maribo.IotaCT 1.1 | 6.5 | 7.1% | 3 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.2 | 15 / 35 | 5384 |
| 2 | 1 | 66.8 | 81.9 | 15 / 35 | 5253 |
| 3 | 1 | 68.7 | 86.0 | 21 / 35 | 5644 |
| 4 | 1 | 66.7 | 80.6 | 12 / 35 | 5416 |
| 5 | 1 | 65.7 | 78.7 | 12 / 35 | 4998 |
| 6 | 1 | 66.8 | 80.6 | 16 / 35 | 5465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.mini.MiniQuester 0.1 | 36 | 86% |
| wompi.Wallaby 5.1 | 34 | 74% |
| ara.Shera 0.88 | 32 | 75% |
| dsw.StaticD 1.0 | 6 | 100% |
| maribo.IotaCT 1.1 | 4 | 75% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 32% | 67 |
| maribo.mini.MiniQuester 0.1 | 35 | 29% | 67 |
| ara.Shera 0.88 | 26 | 22% | 46 |
| amz.NanoClone 1.41 | 9 | 8% | 9 |
| mme.NikeEnhanced 2.0 | 4 | 3% | 5 |
| dsw.StaticD 1.0 | 2 | 2% | 8 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 4 |
| maribo.IotaCT 1.1 | 2 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 71.0 | 25 / 210 | 3.61 | 14.1% | 23854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 147 |
| hadur117.mini.DeiseFIT3F 0.3 | 2.2 | 14.1% | 25 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.7% | 23 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.3% | 8 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.7% | 1 |
| mz.NanoGod 2.02 | 7.2 | 7.8% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 71.7 | 7 / 35 | 3944 |
| 2 | 2 | 63.4 | 72.7 | 6 / 35 | 3992 |
| 3 | 2 | 62.7 | 71.4 | 3 / 35 | 3838 |
| 4 | 2 | 62.3 | 69.5 | 4 / 35 | 3799 |
| 5 | 3 | 61.1 | 66.3 | 1 / 35 | 3736 |
| 6 | 2 | 64.5 | 74.0 | 4 / 35 | 4545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 62 | 19% |
| brainfade.melee.Dusk 0.44 | 9 | 56% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 97 | 52% | 110 |
| brainfade.melee.Dusk 0.44 | 30 | 16% | 34 |
| wcsv.melee.EngineerMelee 0.1 | 19 | 10% | 25 |
| dummy.micro.Sparrow 2.5 | 19 | 10% | 21 |
| Krabb.akim2.Akim2 1.1b | 11 | 6% | 11 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.0 | 118 / 210 | 2.08 | 19.3% | 33183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 19.3% | 118 |
| stelo.Liblix 0.3.1 | 2.0 | 15.5% | 59 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.7% | 25 |
| wompi.Quokka 1.6 | 4.0 | 10.1% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 8.8% | 0 |
| jwirde.Gort 2.0 | 5.5 | 8.8% | 2 |
| disan.Chair 2.2.0 | 7.3 | 7.5% | 2 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.2% | 1 |
| sample.Crazy 1.0 | 9.5 | 4.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.8 | 19 / 35 | 5508 |
| 2 | 1 | 70.1 | 87.9 | 22 / 35 | 5907 |
| 3 | 1 | 68.4 | 85.4 | 18 / 35 | 5178 |
| 4 | 1 | 69.6 | 88.9 | 23 / 35 | 5598 |
| 5 | 1 | 68.5 | 86.0 | 17 / 35 | 5326 |
| 6 | 1 | 69.8 | 89.8 | 19 / 35 | 5666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 78 | 72% |
| tzu.TheArtOfWar 1.2 | 49 | 71% |
| wompi.Quokka 1.6 | 10 | 90% |
| jwirde.Gort 2.0 | 8 | 88% |
| disan.Chair 2.2.0 | 4 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 40 | 43% | 101 |
| tzu.TheArtOfWar 1.2 | 28 | 30% | 55 |
| wompi.Quokka 1.6 | 10 | 11% | 13 |
| jwirde.Gort 2.0 | 5 | 5% | 13 |
| stf.PanzerGeneral 0.1 | 4 | 4% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 3% | 12 |
| disan.Chair 2.2.0 | 2 | 2% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.7 | 86 / 210 | 2.10 | 20.1% | 38879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT3F 0.3 | 1.0 | 20.1% | 86 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.9% | 107 |
| jje.BagPuss 1.2 | 3.0 | 11.7% | 6 |
| sul.Lunar 1.1 | 4.0 | 10.4% | 4 |
| myl.nano.Graviton 1.10 | 5.5 | 9.8% | 0 |
| fm.claire 1.7 | 6.3 | 8.5% | 0 |
| hvilela.HVilela 0.9 | 6.8 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.8% | 2 |
| wit.Deep7 2.0 | 8.8 | 6.3% | 5 |
| abud.ThirdRobo 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 83.8 | 11 / 35 | 6364 |
| 2 | 1 | 70.3 | 89.5 | 14 / 35 | 6458 |
| 3 | 1 | 70.9 | 90.5 | 17 / 35 | 6562 |
| 4 | 1 | 69.6 | 87.3 | 14 / 35 | 6340 |
| 5 | 1 | 69.9 | 89.2 | 14 / 35 | 6495 |
| 6 | 1 | 70.0 | 86.0 | 16 / 35 | 6660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 106 | 24% |
| jje.BagPuss 1.2 | 22 | 86% |
| sul.Lunar 1.1 | 16 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 91% |
| wit.Deep7 2.0 | 8 | 88% |
| myl.nano.Graviton 1.10 | 6 | 100% |
| fm.claire 1.7 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 2267. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 83 | 67% | 0 |
| jje.BagPuss 1.2 | 9 | 7% | 54 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 6% | 24 |
| myl.nano.Graviton 1.10 | 7 | 6% | 27 |
| sul.Lunar 1.1 | 6 | 5% | 64 |
| hvilela.HVilela 0.9 | 6 | 5% | 15 |
| fm.claire 1.7 | 3 | 2% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 13 |
| abud.ThirdRobo 1.0 | 1 | 1% | 2 |

## Melee bench: F46

hadur117.mini.DeiseFIT3F 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 81.0 | 50 / 210 | 2.71 | 16.0% | 26268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.3% | 52 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.9% | 85 |
| hadur117.mini.DeiseFIT3F 0.3 | 2.5 | 16.0% | 50 |
| mz.MicroSheep 1.0 | 4.7 | 10.3% | 7 |
| cx.Princess 1.0 | 4.7 | 10.5% | 15 |
| sadoner.killer 0.2 | 5.7 | 9.0% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.0% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 80.0 | 8 / 35 | 4493 |
| 2 | 2 | 66.6 | 84.8 | 11 / 35 | 4551 |
| 3 | 3 | 64.2 | 80.0 | 6 / 35 | 4194 |
| 4 | 2 | 65.6 | 80.6 | 8 / 35 | 4706 |
| 5 | 3 | 65.0 | 80.6 | 7 / 35 | 4378 |
| 6 | 3 | 64.4 | 80.0 | 10 / 35 | 3946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 49 | 27% |
| kc.mini.Mirage 0.2 | 45 | 56% |
| cx.Princess 1.0 | 12 | 42% |
| mz.MicroSheep 1.0 | 7 | 57% |
| arthord.NanoSatanMelee Beta | 3 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 67 | 42% | 79 |
| kc.mini.Mirage 0.2 | 61 | 38% | 87 |
| mz.MicroSheep 1.0 | 11 | 7% | 17 |
| cx.Princess 1.0 | 10 | 6% | 12 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 7 |
| sadoner.killer 0.2 | 3 | 2% | 5 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

