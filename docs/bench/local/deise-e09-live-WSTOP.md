# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 85.7 | 48 / 210 | 2.29 | 16.6% | 27671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 143 |
| hadur117.mini.DeiseWSTOP 0.4 | 2.0 | 16.6% | 48 |
| sgp.JollyNinja 3.53 | 3.8 | 10.9% | 10 |
| mz.MicroGodMelee 1 | 4.3 | 11.1% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 10.5% | 0 |
| lorneswork.Predator 1.0 | 5.0 | 10.4% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.0% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 89.5 | 7 / 35 | 4804 |
| 2 | 2 | 66.3 | 85.4 | 6 / 35 | 4960 |
| 3 | 2 | 66.5 | 86.3 | 12 / 35 | 4440 |
| 4 | 2 | 66.3 | 85.1 | 7 / 35 | 4735 |
| 5 | 2 | 64.9 | 83.2 | 5 / 35 | 4435 |
| 6 | 2 | 65.6 | 84.8 | 11 / 35 | 4297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 131 | 14% |
| sgp.JollyNinja 3.53 | 12 | 75% |
| mz.MicroGodMelee 1 | 10 | 80% |
| lorneswork.Predator 1.0 | 10 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 1286. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 76% | 144 |
| sgp.JollyNinja 3.53 | 16 | 10% | 22 |
| lorneswork.Predator 1.0 | 7 | 4% | 11 |
| mz.MicroGodMelee 1 | 6 | 4% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 11 |
| mym.EdgeStalker 1.0 | 2 | 1% | 3 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.1 | 108 / 210 | 2.43 | 17.7% | 27238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 17.7% | 108 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 13.7% | 23 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.5% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.0% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 10.0% | 14 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.7% | 0 |
| sch.Simone 0.3d | 6.8 | 8.0% | 14 |
| Noran.BitchingElk 0.054 | 7.3 | 7.5% | 8 |
| stelo.PatternRobot 1.0 | 8.8 | 6.6% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.5 | 17 / 35 | 4767 |
| 2 | 1 | 64.5 | 77.1 | 15 / 35 | 4176 |
| 3 | 1 | 68.4 | 89.2 | 19 / 35 | 4702 |
| 4 | 1 | 69.6 | 91.7 | 22 / 35 | 4954 |
| 5 | 1 | 66.1 | 82.9 | 18 / 35 | 4501 |
| 6 | 1 | 65.3 | 80.3 | 17 / 35 | 4138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 46 | 65% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 81% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 69% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| sch.Simone 0.3d | 11 | 64% |
| Noran.BitchingElk 0.054 | 10 | 80% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 30 | 29% | 58 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 21% | 26 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 17 | 17% | 57 |
| sch.Simone 0.3d | 11 | 11% | 19 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 7% | 18 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 8 |
| stelo.PatternRobot 1.0 | 5 | 5% | 7 |
| Noran.BitchingElk 0.054 | 4 | 4% | 11 |
| fullsail.SweetTea 1.1 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 95.6 | 160 / 210 | 1.40 | 20.9% | 37712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 20.9% | 160 |
| radnor.DoctorBob 1.42 | 2.5 | 13.3% | 7 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.6% | 18 |
| vuen.Cake 2.51 | 3.8 | 12.2% | 24 |
| urdos.URDOS 1.3 | 5.3 | 8.2% | 1 |
| adt.Ar1 2.1 | 6.2 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 96.5 | 28 / 35 | 6160 |
| 2 | 1 | 71.8 | 94.9 | 25 / 35 | 6868 |
| 3 | 1 | 71.5 | 97.5 | 31 / 35 | 6081 |
| 4 | 1 | 71.0 | 94.0 | 25 / 35 | 6357 |
| 5 | 1 | 70.9 | 94.9 | 24 / 35 | 6240 |
| 6 | 1 | 71.1 | 95.9 | 27 / 35 | 6006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 82% |
| vuen.Cake 2.51 | 63 | 81% |
| radnor.DoctorBob 1.42 | 41 | 93% |
| adt.Ar1 2.1 | 6 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 1132. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 37% | 82 |
| vuen.Cake 2.51 | 19 | 37% | 67 |
| radnor.DoctorBob 1.42 | 11 | 22% | 41 |
| urdos.URDOS 1.3 | 1 | 2% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 5 |
| adt.Ar1 2.1 | 0 | 0% | 4 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.7 | 32 / 210 | 2.29 | 17.2% | 32276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.4% | 172 |
| hadur117.mini.DeiseWSTOP 0.4 | 2.0 | 17.2% | 32 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 3 |
| TNT.TNT 0.99.1 | 4.2 | 10.1% | 4 |
| josago.Jorgito 0.16 | 4.8 | 8.6% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.1% | 0 |
| css.Delitioner 0.11 | 6.5 | 7.2% | 0 |
| rampancy.Durandal 2.1d | 8.3 | 5.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 86.3 | 7 / 35 | 5300 |
| 2 | 2 | 68.2 | 86.7 | 8 / 35 | 5337 |
| 3 | 2 | 66.5 | 83.2 | 4 / 35 | 5306 |
| 4 | 2 | 67.1 | 82.9 | 3 / 35 | 5492 |
| 5 | 2 | 68.6 | 88.6 | 8 / 35 | 5467 |
| 6 | 2 | 67.5 | 86.3 | 2 / 35 | 5374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 157 | 17% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| spin.Bugstard 0.012b | 2 | 100% |
| TNT.TNT 0.99.1 | 2 | 50% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 1504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 144 | 80% | 173 |
| apc.LeeroyJenkins2 1.0 | 16 | 9% | 19 |
| josago.Jorgito 0.16 | 9 | 5% | 9 |
| tj.zombie1n 1.0.1 | 5 | 3% | 5 |
| TNT.TNT 0.99.1 | 4 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 72.4 | 17 / 210 | 3.48 | 13.3% | 19473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.8% | 115 |
| justin.DemonicRage 3.4 | 2.0 | 17.4% | 59 |
| hadur117.mini.DeiseWSTOP 0.4 | 3.2 | 13.3% | 17 |
| wompi.Numbat 2.1 | 3.8 | 12.6% | 12 |
| ms.Ares 0.19 | 5.2 | 9.8% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 8.7% | 4 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.8% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.1% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 73.7 | 4 / 35 | 3338 |
| 2 | 3 | 60.6 | 72.4 | 3 / 35 | 3331 |
| 3 | 3 | 59.8 | 70.2 | 2 / 35 | 2867 |
| 4 | 3 | 61.3 | 73.3 | 4 / 35 | 3313 |
| 5 | 4 | 60.8 | 72.1 | 1 / 35 | 3126 |
| 6 | 3 | 61.6 | 73.0 | 3 / 35 | 3498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 30 | 40% |
| cb.fire.Firestarter 2.0f | 27 | 4% |
| wompi.Numbat 2.1 | 6 | 50% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 193 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 75 | 39% | 76 |
| justin.DemonicRage 3.4 | 65 | 34% | 76 |
| wompi.Numbat 2.1 | 23 | 12% | 26 |
| ms.Ares 0.19 | 10 | 5% | 11 |
| axeBots.HataMoto 3.09 | 8 | 4% | 8 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 5 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.3 | 97 / 210 | 2.32 | 17.5% | 26420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 17.5% | 97 |
| jekl.StoneGhost 0.7 | 2.2 | 14.2% | 27 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.2 | 13.3% | 35 |
| origin.SleepSiphon 1.7b | 3.7 | 12.9% | 46 |
| mld.Wisdom 1.0 | 5.0 | 10.0% | 3 |
| gg.Wolverine 2.0 | 6.2 | 9.0% | 1 |
| DBall.NUKE 0.1 | 7.3 | 7.2% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.3% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.6 | 18 / 35 | 4329 |
| 2 | 1 | 66.6 | 85.4 | 14 / 35 | 4447 |
| 3 | 1 | 67.1 | 86.0 | 17 / 35 | 4511 |
| 4 | 1 | 66.7 | 85.7 | 13 / 35 | 4431 |
| 5 | 1 | 66.2 | 81.9 | 17 / 35 | 4265 |
| 6 | 1 | 67.0 | 85.1 | 18 / 35 | 4437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 42 | 90% |
| origin.SleepSiphon 1.7b | 41 | 61% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 61% |
| gg.Wolverine 2.0 | 7 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 80% |
| mld.Wisdom 1.0 | 3 | 67% |
| DBall.NUKE 0.1 | 3 | 67% |

Hadur died in 115 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 31% | 61 |
| origin.SleepSiphon 1.7b | 29 | 25% | 57 |
| jekl.StoneGhost 0.7 | 26 | 23% | 52 |
| mld.Wisdom 1.0 | 15 | 13% | 20 |
| gg.Wolverine 2.0 | 4 | 3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 5 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.9 | 125 / 210 | 1.73 | 19.3% | 31467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 19.3% | 125 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.6% | 50 |
| rtk.Tachikoma 1.0 | 2.7 | 16.6% | 26 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.4% | 7 |
| franzor.Lizt 1.3.1 | 4.8 | 10.4% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.5 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 18 / 35 | 5057 |
| 2 | 1 | 71.7 | 94.6 | 23 / 35 | 5398 |
| 3 | 1 | 71.9 | 95.2 | 26 / 35 | 5490 |
| 4 | 1 | 70.6 | 91.1 | 21 / 35 | 5240 |
| 5 | 1 | 69.4 | 89.2 | 18 / 35 | 4927 |
| 6 | 1 | 70.4 | 90.5 | 19 / 35 | 5355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 87 | 84% |
| rsalesc.melee.Monk 0.3.6c | 49 | 35% |
| oog.melee.CapuletDroid 1.1 | 25 | 84% |
| franzor.Lizt 1.3.1 | 10 | 100% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1377. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 44 | 51% | 64 |
| rtk.Tachikoma 1.0 | 34 | 40% | 106 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 28 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 5 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| franzor.Lizt 1.3.1 | 0 | 0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.3 | 131 / 210 | 1.87 | 19.1% | 28011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 19.1% | 131 |
| tm.Yuugao 1.0 | 2.8 | 12.7% | 30 |
| shrub.Vapour v159 | 2.8 | 12.1% | 26 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.3% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.1% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 5.7 | 8.7% | 4 |
| m3thos.Eva00 1.1 | 7.0 | 7.6% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.8% | 0 |
| SHAM.WOW 1.4 | 9.2 | 6.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.8 | 22 / 35 | 4507 |
| 2 | 1 | 68.6 | 91.4 | 22 / 35 | 4481 |
| 3 | 1 | 69.3 | 94.3 | 23 / 35 | 4572 |
| 4 | 1 | 68.8 | 88.3 | 22 / 35 | 5021 |
| 5 | 1 | 66.3 | 84.1 | 18 / 35 | 4456 |
| 6 | 1 | 69.5 | 93.0 | 24 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 71% |
| shrub.Vapour v159 | 39 | 64% |
| Krabb.sliNk.Garm 0.9u | 32 | 81% |
| jwst.DAD.DarkAndDarker 1.1 | 21 | 90% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 93% |
| SHAM.WOW 1.4 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| m3thos.Eva00 1.1 | 1 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 23 | 29% | 67 |
| shrub.Vapour v159 | 23 | 29% | 51 |
| Krabb.sliNk.Garm 0.9u | 15 | 19% | 32 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 19 |
| m3thos.Eva00 1.1 | 5 | 6% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 5% | 15 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 5 |
| SHAM.WOW 1.4 | 1 | 1% | 9 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 74.0 | 51 / 210 | 3.34 | 14.8% | 21703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.5% | 94 |
| hadur117.mini.DeiseWSTOP 0.4 | 2.2 | 14.8% | 51 |
| kc.micro.Figment 1.0 | 2.7 | 14.8% | 37 |
| yagami.Tidus 0.11 | 4.5 | 10.6% | 1 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.7% | 16 |
| mc2.enemy.Original 0.9 | 5.8 | 8.8% | 9 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 2 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.2% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.1 | 62.2 | 5 / 35 | 2861 |
| 2 | 2 | 63.0 | 75.2 | 6 / 35 | 3610 |
| 3 | 2 | 64.4 | 80.3 | 7 / 35 | 3944 |
| 4 | 1 | 67.0 | 85.1 | 17 / 35 | 4081 |
| 5 | 3 | 62.0 | 69.2 | 10 / 35 | 3717 |
| 6 | 2 | 61.2 | 71.7 | 6 / 35 | 3490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 52 | 33% |
| kc.micro.Figment 1.0 | 26 | 65% |
| mc2.enemy.Original 0.9 | 9 | 67% |
| pedersen.Grishnakh 1.0 | 7 | 71% |
| yagami.Tidus 0.11 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 42% | 85 |
| kc.micro.Figment 1.0 | 38 | 24% | 53 |
| yagami.Tidus 0.11 | 19 | 12% | 23 |
| pedersen.Grishnakh 1.0 | 14 | 9% | 17 |
| mc2.enemy.Original 0.9 | 13 | 8% | 20 |
| dft.Calliope 5.6 | 7 | 4% | 9 |
| step.nanoPri 1.0 | 1 | 1% | 2 |
| robar.nano.Assertive_Melee 0.2 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 94.2 | 158 / 210 | 1.52 | 19.8% | 30774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 19.8% | 158 |
| DTF.Kludgy 1.2b | 2.2 | 14.6% | 26 |
| ejb.Polaris 1.0.1 | 3.3 | 12.6% | 13 |
| ne.Chimera 1.2 | 3.5 | 12.5% | 5 |
| vStar.RAFzilla 2.15 | 5.3 | 10.0% | 2 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.7% | 4 |
| kurios.DOSexe .9b | 7.8 | 5.6% | 1 |
| sam.Samspin 1.0 | 8.2 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 97.8 | 30 / 35 | 5406 |
| 2 | 1 | 69.9 | 93.7 | 27 / 35 | 4816 |
| 3 | 1 | 69.8 | 93.7 | 26 / 35 | 5225 |
| 4 | 1 | 69.0 | 91.7 | 24 / 35 | 4930 |
| 5 | 1 | 70.6 | 96.2 | 28 / 35 | 5284 |
| 6 | 1 | 69.5 | 92.1 | 23 / 35 | 5113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 66 | 77% |
| ejb.Polaris 1.0.1 | 50 | 88% |
| ne.Chimera 1.2 | 21 | 86% |
| vStar.RAFzilla 2.15 | 19 | 95% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| kurios.DOSexe .9b | 8 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 26 | 50% | 76 |
| ejb.Polaris 1.0.1 | 12 | 23% | 56 |
| ne.Chimera 1.2 | 7 | 13% | 29 |
| kurios.DOSexe .9b | 3 | 6% | 15 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 15 |
| vStar.RAFzilla 2.15 | 1 | 2% | 10 |
| donjezza.Muncho 1.0 | 1 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
| sam.Samspin 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 80.6 | 84 / 210 | 2.75 | 16.2% | 23522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.3 | 16.2% | 84 |
| rz.Aleph 0.34 | 1.7 | 16.0% | 59 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.0% | 28 |
| djc.DynaBot 0.1.1 | 4.3 | 10.6% | 15 |
| rdt199.Warlord 0.73 | 5.5 | 9.5% | 10 |
| br2.MobyDickBot 1.6 | 5.7 | 9.2% | 13 |
| uji.YellohFellah 1.0 | 6.7 | 8.2% | 5 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.0% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 5.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 83.5 | 13 / 35 | 4137 |
| 2 | 1 | 65.1 | 80.6 | 15 / 35 | 3981 |
| 3 | 1 | 65.0 | 80.3 | 14 / 35 | 4209 |
| 4 | 1 | 66.0 | 86.0 | 16 / 35 | 3899 |
| 5 | 2 | 63.4 | 78.4 | 14 / 35 | 3599 |
| 6 | 2 | 62.9 | 74.6 | 12 / 35 | 3697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 49 | 63% |
| cx.mini.Nimrod 0.55 | 26 | 69% |
| djc.DynaBot 0.1.1 | 21 | 67% |
| rdt199.Warlord 0.73 | 15 | 67% |
| uji.YellohFellah 1.0 | 9 | 78% |
| br2.MobyDickBot 1.6 | 8 | 50% |

Hadur died in 129 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 45 | 35% | 77 |
| cx.mini.Nimrod 0.55 | 25 | 19% | 38 |
| rdt199.Warlord 0.73 | 19 | 15% | 31 |
| djc.DynaBot 0.1.1 | 14 | 11% | 24 |
| br2.MobyDickBot 1.6 | 10 | 8% | 18 |
| uji.YellohFellah 1.0 | 6 | 5% | 12 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 6 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.0 | 94 / 210 | 2.62 | 16.7% | 22229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 16.7% | 94 |
| nat.PallasHawk 1.0 | 3.0 | 13.1% | 32 |
| darkcanuck.Leon 1.01 | 3.0 | 13.4% | 44 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.3% | 25 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 10 |
| jrm.Test0 1.0 | 6.3 | 7.9% | 0 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.5% | 0 |
| jp.Perpy 16.0 | 7.8 | 6.6% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 3 |
| stuff.Vlad 0.1 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 80.3 | 16 / 35 | 3826 |
| 2 | 1 | 67.1 | 86.7 | 19 / 35 | 3742 |
| 3 | 1 | 62.9 | 74.0 | 13 / 35 | 3804 |
| 4 | 1 | 67.1 | 88.3 | 18 / 35 | 3593 |
| 5 | 1 | 64.9 | 82.2 | 15 / 35 | 3492 |
| 6 | 1 | 64.5 | 80.3 | 13 / 35 | 3772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 41 | 71% |
| darkcanuck.Leon 1.01 | 40 | 48% |
| bts.wiki.RipCurl 0.9b | 37 | 78% |
| brainfade.melee.Genghis 0.36 | 12 | 83% |
| jaybot.bots.Oddball 4.0 | 5 | 80% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 36 | 31% | 62 |
| bts.wiki.RipCurl 0.9b | 23 | 20% | 40 |
| nat.PallasHawk 1.0 | 22 | 19% | 51 |
| brainfade.melee.Genghis 0.36 | 15 | 13% | 25 |
| jrm.Test0 1.0 | 11 | 9% | 14 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 6 |
| jp.Perpy 16.0 | 3 | 3% | 4 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 6 |

## Melee bench: F13

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 83.2 | 75 / 210 | 2.51 | 16.2% | 24042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.7% | 78 |
| ags.Glacier 0.2.11 | 2.0 | 16.3% | 35 |
| hadur117.mini.DeiseWSTOP 0.4 | 2.2 | 16.2% | 75 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.7% | 7 |
| shinh.Entangled 0.3 | 4.5 | 11.5% | 15 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.4 | 17 / 35 | 4258 |
| 2 | 3 | 64.9 | 79.7 | 9 / 35 | 4068 |
| 3 | 1 | 66.5 | 87.6 | 15 / 35 | 3943 |
| 4 | 2 | 64.9 | 81.6 | 11 / 35 | 3953 |
| 5 | 3 | 65.4 | 81.9 | 12 / 35 | 3933 |
| 6 | 3 | 65.6 | 83.8 | 11 / 35 | 3887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 59 | 46% |
| ags.Glacier 0.2.11 | 45 | 64% |
| shinh.Entangled 0.3 | 18 | 67% |
| gh.micro.Gruweltje 0.7 | 6 | 67% |
| stelo.Wang 1.0 | 3 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 57 | 42% | 85 |
| ags.Glacier 0.2.11 | 39 | 28% | 66 |
| shinh.Entangled 0.3 | 20 | 15% | 29 |
| gh.micro.Gruweltje 0.7 | 9 | 7% | 14 |
| stelo.Wang 1.0 | 9 | 7% | 12 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
| maribo.FollowFire 1 | 0 | 0% | 1 |

## Melee bench: F14

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 92.8 | 152 / 210 | 1.65 | 19.7% | 30428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 19.7% | 152 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.0% | 30 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.9% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.4% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.5% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.1% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.2% | 7 |
| pa.Improved 1.0 | 9.0 | 5.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.4 | 24 / 35 | 5312 |
| 2 | 1 | 68.7 | 90.2 | 21 / 35 | 4651 |
| 3 | 1 | 70.9 | 94.3 | 28 / 35 | 5275 |
| 4 | 1 | 68.1 | 88.3 | 21 / 35 | 4631 |
| 5 | 1 | 71.0 | 95.2 | 28 / 35 | 5229 |
| 6 | 1 | 71.5 | 96.5 | 30 / 35 | 5330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 90 | 87% |
| catcat20.shape.Theta 0.018 | 44 | 84% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 86% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 85% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 32 | 52% | 106 |
| catcat20.shape.Theta 0.018 | 12 | 20% | 46 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 7% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.4 | 90 / 210 | 2.68 | 17.4% | 29666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 17.4% | 90 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.5% | 22 |
| emp.Yngwie 1.11 | 2.8 | 13.4% | 44 |
| mld.DustBunny 3.8 | 4.2 | 12.3% | 12 |
| cb.nano.Insomnia 1.0 | 4.3 | 11.7% | 23 |
| kawigi.robot.Girl 1.2 | 6.0 | 10.0% | 19 |
| lambdaxy.TBot 0.1 | 7.5 | 6.5% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.1% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 4.5% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 73.7 | 12 / 35 | 4615 |
| 2 | 1 | 69.0 | 86.3 | 20 / 35 | 5430 |
| 3 | 1 | 67.9 | 84.8 | 18 / 35 | 4914 |
| 4 | 1 | 64.4 | 77.5 | 9 / 35 | 4485 |
| 5 | 1 | 67.9 | 84.4 | 14 / 35 | 5473 |
| 6 | 1 | 66.6 | 81.6 | 17 / 35 | 4749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 38 | 63% |
| cb.nano.Insomnia 1.0 | 25 | 48% |
| mld.DustBunny 3.8 | 18 | 94% |
| kawigi.micro.Shiz 1.1 | 18 | 100% |
| kawigi.robot.Girl 1.2 | 17 | 94% |
| divineomega.TrialBot 0.003 | 3 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1061. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 33% | 82 |
| cb.nano.Insomnia 1.0 | 25 | 21% | 15 |
| mld.DustBunny 3.8 | 17 | 14% | 41 |
| kawigi.micro.Shiz 1.1 | 16 | 13% | 33 |
| kawigi.robot.Girl 1.2 | 13 | 11% | 22 |
| divineomega.TrialBot 0.003 | 4 | 3% | 12 |
| lambdaxy.TBot 0.1 | 3 | 2% | 3 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.8 | 82 / 210 | 2.55 | 17.4% | 29349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.5 | 17.6% | 81 |
| hadur117.mini.DeiseWSTOP 0.4 | 1.5 | 17.4% | 82 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.8% | 33 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.0% | 2 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 8.9% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.3% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.2% | 4 |
| asd.Cthulhu 1.3 | 8.8 | 5.1% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 79.4 | 17 / 35 | 4498 |
| 2 | 1 | 67.2 | 83.8 | 13 / 35 | 4956 |
| 3 | 2 | 67.3 | 83.5 | 12 / 35 | 5011 |
| 4 | 1 | 66.5 | 81.9 | 12 / 35 | 4779 |
| 5 | 1 | 68.5 | 87.3 | 16 / 35 | 5126 |
| 6 | 2 | 66.5 | 81.0 | 12 / 35 | 4979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 79 | 46% |
| techdude.forest.FlamingForest 1.1 | 24 | 46% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 94% |
| stelo.IntrinsicVolatility 1.4 | 7 | 71% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| bvh.fnr.Fenrir 0.36l | 5 | 80% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 1224. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 69 | 53% | 108 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 17% | 37 |
| techdude.forest.FlamingForest 1.1 | 15 | 12% | 27 |
| bvh.fnr.Fenrir 0.36l | 8 | 6% | 9 |
| divineomega.DivineBot 1.9.4.5 | 5 | 4% | 8 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 12 |
| asd.Cthulhu 1.3 | 3 | 2% | 4 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.6 | 75 / 210 | 2.92 | 16.3% | 27306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 16.3% | 75 |
| et.Predator 1.8 | 2.5 | 14.0% | 27 |
| cx.BlestPain 1.41 | 3.2 | 13.2% | 45 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.8% | 35 |
| nic.Nicator 2.4 | 4.8 | 11.4% | 14 |
| ahf.NanoAndrew .4 | 5.8 | 10.3% | 13 |
| maribo.melee.BMV 0.1 | 7.0 | 8.8% | 0 |
| tex.Longbot 0.4 | 8.3 | 5.2% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.2% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 73.7 | 12 / 35 | 4412 |
| 2 | 1 | 64.6 | 78.1 | 11 / 35 | 4300 |
| 3 | 1 | 65.6 | 77.1 | 13 / 35 | 4998 |
| 4 | 1 | 66.9 | 84.4 | 14 / 35 | 4946 |
| 5 | 1 | 65.1 | 79.4 | 12 / 35 | 4184 |
| 6 | 1 | 65.3 | 79.0 | 13 / 35 | 4466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 39 | 87% |
| oog.melee.Mercutio 1.0 | 31 | 52% |
| cx.BlestPain 1.41 | 27 | 30% |
| nic.Nicator 2.4 | 16 | 69% |
| ahf.NanoAndrew .4 | 5 | 80% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 26% | 46 |
| oog.melee.Mercutio 1.0 | 28 | 21% | 45 |
| et.Predator 1.8 | 25 | 18% | 46 |
| nic.Nicator 2.4 | 19 | 14% | 34 |
| ahf.NanoAndrew .4 | 18 | 13% | 23 |
| maribo.melee.BMV 0.1 | 7 | 5% | 10 |
| tex.Longbot 0.4 | 2 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.7 | 134 / 210 | 1.92 | 18.8% | 26477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 18.8% | 134 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.1% | 21 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.1% | 20 |
| uji.DBH 1.1 | 4.3 | 10.9% | 16 |
| ratosh.Nobo 0.21 | 5.3 | 9.7% | 2 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.7% | 6 |
| sigterm.Sigterm 1.0 | 6.8 | 8.0% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 6.8% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.4% | 1 |
| stelo.WangRobot 1.0 | 9.7 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.6 | 22 / 35 | 4662 |
| 2 | 1 | 68.8 | 92.4 | 23 / 35 | 4345 |
| 3 | 1 | 68.4 | 89.2 | 24 / 35 | 4568 |
| 4 | 1 | 68.4 | 89.5 | 22 / 35 | 4517 |
| 5 | 1 | 68.1 | 90.5 | 22 / 35 | 4030 |
| 6 | 1 | 67.7 | 88.3 | 21 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 58 | 84% |
| agd.Mooserwirt2 2.7 | 35 | 69% |
| uji.DBH 1.1 | 25 | 76% |
| sigterm.Sigterm 1.0 | 17 | 82% |
| spinnercat.Robovirus 2.718 | 13 | 92% |
| ratosh.Nobo 0.21 | 7 | 100% |
| stelo.WangRobot 1.0 | 7 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 20 | 26% | 73 |
| agd.Mooserwirt2 2.7 | 17 | 22% | 45 |
| uji.DBH 1.1 | 12 | 16% | 27 |
| sigterm.Sigterm 1.0 | 11 | 14% | 19 |
| ratosh.Nobo 0.21 | 7 | 9% | 18 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 11 |
| stelo.WangRobot 1.0 | 2 | 3% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 3% | 3 |

## Melee bench: F19

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 94.2 | 139 / 210 | 1.52 | 20.3% | 32861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 20.3% | 139 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.4% | 32 |
| mld.Infinity 2.2 | 3.0 | 13.8% | 36 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.2% | 4 |
| erdnis.Rover 0.3 | 4.8 | 10.0% | 1 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.2% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.4% | 0 |
| pac.ABC 2.1 | 7.5 | 7.1% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.7 | 21 / 35 | 5365 |
| 2 | 1 | 71.4 | 95.6 | 25 / 35 | 5199 |
| 3 | 1 | 71.3 | 95.2 | 26 / 35 | 5551 |
| 4 | 1 | 70.6 | 92.7 | 23 / 35 | 5348 |
| 5 | 1 | 71.6 | 95.6 | 24 / 35 | 5653 |
| 6 | 1 | 71.1 | 94.3 | 20 / 35 | 5745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 103 | 82% |
| mld.Infinity 2.2 | 51 | 49% |
| krillr.mini.JointStrike 2.0.0 | 16 | 94% |
| erdnis.Rover 0.3 | 6 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| patson.PatsonTestBot 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 1803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 34 | 46% | 131 |
| mld.Infinity 2.2 | 27 | 36% | 21 |
| krillr.mini.JointStrike 2.0.0 | 6 | 8% | 26 |
| erdnis.Rover 0.3 | 3 | 4% | 9 |
| patson.PatsonTestBot 1.0 | 1 | 1% | 7 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.7 | 94 / 210 | 2.38 | 17.8% | 28882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 17.8% | 94 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.4% | 44 |
| fwb.Nine 1.0.1 | 3.7 | 11.0% | 24 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.7% | 10 |
| catcat20.Rabbit 0.001 | 4.5 | 10.4% | 23 |
| bayen.nut.Squirrel 1.615 | 6.5 | 8.5% | 10 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 7.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.3 | 18 / 35 | 4967 |
| 2 | 1 | 68.1 | 87.0 | 16 / 35 | 4949 |
| 3 | 1 | 66.4 | 82.9 | 13 / 35 | 4956 |
| 4 | 1 | 66.8 | 81.0 | 17 / 35 | 5059 |
| 5 | 1 | 66.3 | 84.4 | 15 / 35 | 4578 |
| 6 | 1 | 66.6 | 84.4 | 15 / 35 | 4373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 67 | 82% |
| catcat20.Rabbit 0.001 | 29 | 55% |
| fwb.Nine 1.0.1 | 18 | 33% |
| nz.jdc.nano.GridFu 1.0 | 12 | 67% |
| bayen.nut.Squirrel 1.615 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1169. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 45 | 39% | 89 |
| fwb.Nine 1.0.1 | 34 | 29% | 34 |
| catcat20.Rabbit 0.001 | 18 | 16% | 36 |
| nz.jdc.nano.GridFu 1.0 | 9 | 8% | 22 |
| bayen.nut.Squirrel 1.615 | 8 | 7% | 17 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |

## Melee bench: F21

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 93.8 | 139 / 210 | 1.56 | 20.3% | 32809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 20.3% | 139 |
| eem.EvBot v4.6.16 | 2.2 | 16.2% | 58 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.2% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.2% | 4 |
| eld.Hmm 1.0 | 5.3 | 8.0% | 3 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.7% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.1% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.2% | 0 |
| PSW.Relentless 0.1 | 9.3 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.0 | 20 / 35 | 5440 |
| 2 | 1 | 69.9 | 92.7 | 20 / 35 | 5212 |
| 3 | 1 | 70.9 | 94.0 | 25 / 35 | 5433 |
| 4 | 1 | 71.1 | 92.7 | 25 / 35 | 5878 |
| 5 | 1 | 71.1 | 95.6 | 24 / 35 | 5479 |
| 6 | 1 | 70.8 | 93.7 | 25 / 35 | 5367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 113 | 63% |
| dummy.mini.Scimitar 1.01 | 45 | 89% |
| cf.RiO.RiOx 4.2.1 | 22 | 95% |
| eld.Hmm 1.0 | 6 | 83% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 48 | 66% | 98 |
| dummy.mini.Scimitar 1.01 | 12 | 16% | 65 |
| cf.RiO.RiOx 4.2.1 | 9 | 12% | 26 |
| eld.Hmm 1.0 | 1 | 1% | 14 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.2 | 97 / 210 | 2.15 | 18.1% | 29428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 18.1% | 97 |
| pe.SandboxDT 2.71m | 2.0 | 16.1% | 57 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.8% | 28 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.3% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 9.8% | 4 |
| yk.JahRoslav 1.1 | 6.2 | 7.0% | 1 |
| gg.Squaraus 0.6 | 7.3 | 6.3% | 0 |
| tad.Dalek98 0.98 | 7.7 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.3% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.4 | 20 / 35 | 5197 |
| 2 | 1 | 67.7 | 86.0 | 13 / 35 | 4943 |
| 3 | 1 | 68.8 | 89.5 | 19 / 35 | 4821 |
| 4 | 1 | 67.7 | 85.4 | 19 / 35 | 4742 |
| 5 | 1 | 68.0 | 85.1 | 14 / 35 | 4975 |
| 6 | 1 | 67.5 | 86.0 | 12 / 35 | 4750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 49 | 49% |
| kvk.HebusLeTroll 0.35 | 44 | 75% |
| jlm.javaDisturbance 0.59 | 41 | 71% |
| bigpete.Stewie 1.0 | 9 | 89% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 40 | 35% | 72 |
| kvk.HebusLeTroll 0.35 | 35 | 31% | 60 |
| jlm.javaDisturbance 0.59 | 32 | 28% | 61 |
| bigpete.Stewie 1.0 | 5 | 4% | 10 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.2 | 144 / 210 | 1.61 | 20.1% | 31276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 20.1% | 144 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 40 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 15 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.7% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.0 | 9.2% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.8% | 2 |
| cw.megas.Blade 0.8 | 7.2 | 8.3% | 1 |
| sample.Walls 1.0 | 7.7 | 7.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.5 | 22 / 35 | 4852 |
| 2 | 1 | 71.5 | 96.2 | 24 / 35 | 5354 |
| 3 | 1 | 70.6 | 93.3 | 23 / 35 | 5011 |
| 4 | 1 | 71.1 | 94.3 | 24 / 35 | 5016 |
| 5 | 1 | 72.4 | 94.3 | 29 / 35 | 5873 |
| 6 | 1 | 70.9 | 91.7 | 22 / 35 | 5170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 97 | 79% |
| cre.Karolos 0.32 | 34 | 76% |
| stelo.AreaTargetingBot 1.1 | 31 | 81% |
| sample.Walls 1.0 | 6 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 0% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 35 | 53% | 112 |
| cre.Karolos 0.32 | 16 | 24% | 49 |
| stelo.AreaTargetingBot 1.1 | 12 | 18% | 26 |
| sample.Walls 1.0 | 2 | 3% | 5 |
| cw.megas.Blade 0.8 | 1 | 2% | 2 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 5 |

## Melee bench: F24

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 79.0 | 82 / 210 | 2.89 | 15.6% | 20856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.3 | 15.6% | 82 |
| rz.GlowBlowMelee 1.4 | 1.8 | 14.3% | 36 |
| florent.XSeries.X2 0.12 | 3.7 | 12.8% | 27 |
| pedersen.Ugluk 1.1.1 | 3.7 | 12.4% | 26 |
| davidalves.Phoenix 0.54 | 4.5 | 12.1% | 30 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.1% | 4 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 1 |
| evd.X1 0.01 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 83.8 | 19 / 35 | 3688 |
| 2 | 1 | 63.8 | 78.7 | 14 / 35 | 3587 |
| 3 | 2 | 62.6 | 74.9 | 11 / 35 | 3528 |
| 4 | 1 | 62.8 | 78.1 | 12 / 35 | 3139 |
| 5 | 1 | 64.2 | 79.0 | 17 / 35 | 3572 |
| 6 | 2 | 63.2 | 79.4 | 9 / 35 | 3342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 76% |
| davidalves.Phoenix 0.54 | 17 | 47% |
| florent.XSeries.X2 0.12 | 15 | 80% |
| stelo.SoJNanoMelee 1.1 | 15 | 93% |
| pedersen.Ugluk 1.1.1 | 11 | 82% |
| oog.melee.Corsair 1.0 | 6 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 29 | 22% | 62 |
| pedersen.Ugluk 1.1.1 | 28 | 22% | 36 |
| florent.XSeries.X2 0.12 | 27 | 21% | 39 |
| davidalves.Phoenix 0.54 | 27 | 21% | 33 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 13 |
| oog.melee.Corsair 1.0 | 6 | 5% | 19 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |
| evd.X1 0.01 | 1 | 1% | 1 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.9 | 124 / 210 | 2.45 | 17.8% | 24141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 17.8% | 124 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.6% | 22 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.2% | 20 |
| jdw.Hurricane 1.4 | 3.8 | 11.7% | 18 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.3% | 7 |
| ds.Oo 2.2 | 5.8 | 8.9% | 8 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.4% | 4 |
| adt.Ar2 1.1 | 8.2 | 6.8% | 5 |
| awesomeness.Elite 1.0 | 8.2 | 7.0% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 76.8 | 16 / 35 | 3947 |
| 2 | 1 | 68.8 | 89.2 | 24 / 35 | 4179 |
| 3 | 1 | 69.2 | 91.4 | 25 / 35 | 4270 |
| 4 | 1 | 68.3 | 88.3 | 24 / 35 | 3974 |
| 5 | 1 | 64.7 | 77.5 | 17 / 35 | 3800 |
| 6 | 1 | 65.4 | 80.0 | 18 / 35 | 3971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 88% |
| voidious.micro.BlitzBat 1.05 | 42 | 83% |
| jdw.Hurricane 1.4 | 22 | 91% |
| adt.Ar2 1.1 | 7 | 71% |
| ds.Oo 2.2 | 5 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| gre.svman4.Morfeas 1.4.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 29% | 58 |
| voidious.mini.BrokenSword 2.0.3 | 20 | 23% | 61 |
| jdw.Hurricane 1.4 | 18 | 21% | 30 |
| ds.Oo 2.2 | 8 | 9% | 18 |
| adt.Ar2 1.1 | 6 | 7% | 11 |
| awesomeness.Elite 1.0 | 6 | 7% | 8 |
| gre.svman4.Morfeas 1.4.1 | 2 | 2% | 8 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 14 |
| amk.ChumbaMini 0.2 | 1 | 1% | 1 |

## Melee bench: F26

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.4 | 110 / 210 | 2.04 | 18.4% | 30558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 18.4% | 110 |
| ak.Fermat 2.0 | 2.0 | 14.8% | 38 |
| shu.nitro.LENIN .T34 | 3.2 | 12.9% | 27 |
| lrem.Spectre 0.4.4 | 3.8 | 12.3% | 25 |
| js.PinBall 1.6 | 5.3 | 10.5% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.2% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 8.7% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.7% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.5 | 18 / 35 | 5366 |
| 2 | 1 | 68.5 | 87.6 | 16 / 35 | 5011 |
| 3 | 1 | 68.6 | 89.2 | 22 / 35 | 4834 |
| 4 | 1 | 68.7 | 87.9 | 19 / 35 | 5126 |
| 5 | 1 | 68.4 | 90.2 | 17 / 35 | 5110 |
| 6 | 1 | 68.1 | 86.0 | 18 / 35 | 5111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 51 | 59% |
| shu.nitro.LENIN .T34 | 45 | 69% |
| lrem.Spectre 0.4.4 | 41 | 73% |
| js.PinBall 1.6 | 12 | 83% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 80% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 101 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 32 | 32% | 56 |
| shu.nitro.LENIN .T34 | 29 | 29% | 66 |
| lrem.Spectre 0.4.4 | 19 | 19% | 39 |
| js.PinBall 1.6 | 9 | 9% | 22 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 5% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 8 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 7 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.0 | 127 / 210 | 2.17 | 18.9% | 29586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 18.9% | 127 |
| mk.Alpha 0.2.1 | 2.2 | 13.8% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 3.3 | 11.6% | 14 |
| EH.Eagle 1.0.6 | 4.2 | 11.1% | 5 |
| wee.Gem 1.8.4 | 4.7 | 10.4% | 18 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.0% | 4 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.8% | 2 |
| joe.ADinosaur 1.0 | 7.5 | 7.8% | 1 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.7% | 2 |
| cs.Grudge 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 85.1 | 19 / 35 | 4115 |
| 2 | 1 | 68.4 | 88.6 | 22 / 35 | 4662 |
| 3 | 1 | 70.4 | 89.5 | 21 / 35 | 5701 |
| 4 | 1 | 70.0 | 84.4 | 22 / 35 | 5818 |
| 5 | 1 | 68.5 | 82.5 | 19 / 35 | 5363 |
| 6 | 1 | 68.0 | 91.7 | 24 / 35 | 3927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 71 | 73% |
| wee.Gem 1.8.4 | 25 | 76% |
| EH.Eagle 1.0.6 | 24 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 80% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| joe.ADinosaur 1.0 | 6 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 37 | 44% | 90 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 19% | 35 |
| wee.Gem 1.8.4 | 10 | 12% | 31 |
| joe.ADinosaur 1.0 | 5 | 6% | 9 |
| EH.Eagle 1.0.6 | 4 | 5% | 20 |
| caimano.Furia_Ceca 0.22 | 4 | 5% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 9 |
| throxbot.ThroxBot 0.1 | 3 | 4% | 8 |
| cs.Grudge 1.0 | 2 | 2% | 2 |

## Melee bench: F28

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.5 | 140 / 210 | 1.94 | 18.7% | 25087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 18.7% | 140 |
| kid.test.NightFox .2 | 2.0 | 15.3% | 34 |
| uji.Antique 1.0 | 3.2 | 11.6% | 18 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.8% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.1% | 1 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.1% | 6 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.2% | 1 |
| stelo.PianistNano 1.2 | 8.8 | 5.9% | 0 |
| matt.advanced.Katana 1.0 | 9.0 | 5.6% | 1 |
| stelo.Lifestealer 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 95.6 | 26 / 35 | 4326 |
| 2 | 1 | 68.9 | 90.8 | 24 / 35 | 4374 |
| 3 | 1 | 69.2 | 91.4 | 25 / 35 | 4203 |
| 4 | 1 | 67.8 | 87.9 | 22 / 35 | 4068 |
| 5 | 1 | 69.2 | 91.1 | 27 / 35 | 4256 |
| 6 | 1 | 64.7 | 80.3 | 16 / 35 | 3860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 89 | 78% |
| uji.Antique 1.0 | 44 | 89% |
| qohnil.blot.BlotBot 3.61 | 15 | 73% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| ahr.ice.Ice 1.0.2 | 3 | 33% |
| stelo.Lifestealer 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 45% | 91 |
| uji.Antique 1.0 | 11 | 15% | 51 |
| pfvicm.Sobieski 7.2.3b | 9 | 13% | 17 |
| qohnil.blot.BlotBot 3.61 | 5 | 7% | 19 |
| ahr.ice.Ice 1.0.2 | 5 | 7% | 9 |
| amk.ChumbaWumba 0.3 | 5 | 7% | 9 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| stelo.Lifestealer 1.0 | 1 | 1% | 4 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |

## Melee bench: F29

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.5 | 88 / 210 | 2.76 | 17.2% | 26997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.2 | 17.2% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.9% | 61 |
| deewiant.Anomaly 0.2 | 3.2 | 14.3% | 41 |
| myl.micro.Troodon 1.10 | 3.5 | 12.5% | 9 |
| jok.PheonixM 0.1.2 | 5.0 | 10.7% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.9% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.5% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 2 |
| jangs.ns51 1.0 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 77.1 | 15 / 35 | 4341 |
| 2 | 2 | 65.2 | 75.9 | 11 / 35 | 4294 |
| 3 | 1 | 69.2 | 88.6 | 18 / 35 | 4948 |
| 4 | 1 | 66.7 | 79.4 | 15 / 35 | 4508 |
| 5 | 1 | 66.5 | 78.7 | 16 / 35 | 4527 |
| 6 | 1 | 66.9 | 83.2 | 13 / 35 | 4379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 48 | 58% |
| deewiant.Anomaly 0.2 | 43 | 63% |
| myl.micro.Troodon 1.10 | 17 | 94% |
| jok.PheonixM 0.1.2 | 8 | 100% |
| DBall.Anarchy 0.1 | 5 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 42 | 34% | 77 |
| zyx.mega.YersiniaPestis 3.1 | 40 | 33% | 64 |
| myl.micro.Troodon 1.10 | 20 | 16% | 34 |
| jok.PheonixM 0.1.2 | 10 | 8% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 4% | 7 |
| DBall.Anarchy 0.1 | 4 | 3% | 9 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 4 |

## Melee bench: F30

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 75.3 | 58 / 210 | 3.22 | 14.7% | 21018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.8 | 14.7% | 58 |
| catcat20.Matcha 0.006 | 2.3 | 14.1% | 45 |
| darkcanuck.B26354 1.06 | 3.5 | 13.1% | 37 |
| oog.melee.Capulet 1.2 | 3.5 | 13.2% | 31 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.9% | 25 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.8% | 10 |
| ntc.Opposite 1.5 | 7.2 | 7.7% | 0 |
| tripphippy.Alice 1.1 | 7.8 | 7.1% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 6.9% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 67.9 | 8 / 35 | 3391 |
| 2 | 2 | 63.1 | 76.5 | 8 / 35 | 3615 |
| 3 | 2 | 61.3 | 74.3 | 8 / 35 | 3310 |
| 4 | 1 | 63.0 | 77.1 | 12 / 35 | 3505 |
| 5 | 1 | 64.5 | 82.2 | 13 / 35 | 3562 |
| 6 | 1 | 62.1 | 74.0 | 9 / 35 | 3635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 48% |
| darkcanuck.B26354 1.06 | 25 | 56% |
| oog.melee.Capulet 1.2 | 20 | 60% |
| stelo.PastFuture 2.3.2 | 13 | 69% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 83% |
| ntc.Opposite 1.5 | 1 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 40 | 26% | 55 |
| stelo.PastFuture 2.3.2 | 32 | 21% | 39 |
| darkcanuck.B26354 1.06 | 31 | 20% | 47 |
| oog.melee.Capulet 1.2 | 28 | 18% | 42 |
| ntc.Opposite 1.5 | 8 | 5% | 8 |
| tripphippy.Alice 1.1 | 5 | 3% | 6 |
| intruder.PrairieWolf 2.61 | 4 | 3% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 5 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 74.1 | 45 / 210 | 3.33 | 14.2% | 18720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 104 |
| hadur117.mini.DeiseWSTOP 0.4 | 2.2 | 14.2% | 45 |
| gh.mini.Griezel 0.2 | 3.0 | 13.0% | 38 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.2% | 5 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 11.3% | 11 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.3% | 6 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.6% | 0 |
| fm.mammillarias 1.3 | 7.7 | 6.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 77.1 | 9 / 35 | 3547 |
| 2 | 3 | 59.0 | 69.2 | 5 / 35 | 2734 |
| 3 | 2 | 61.2 | 72.4 | 7 / 35 | 3256 |
| 4 | 2 | 60.5 | 70.8 | 5 / 35 | 3044 |
| 5 | 2 | 63.2 | 80.0 | 9 / 35 | 3038 |
| 6 | 2 | 62.1 | 74.9 | 10 / 35 | 3101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 48 | 33% |
| gh.mini.Griezel 0.2 | 29 | 52% |
| spinnercat.micro.Tyger 0.1 | 8 | 63% |
| d414.nano.Quantum 1.0.0 | 6 | 83% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 165 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 68 | 41% | 83 |
| gh.mini.Griezel 0.2 | 41 | 25% | 56 |
| spinnercat.micro.Tyger 0.1 | 18 | 11% | 24 |
| d414.nano.Quantum 1.0.0 | 14 | 8% | 17 |
| gh.nano.Grofvuil 0.2 | 9 | 5% | 12 |
| fm.mammillarias 1.3 | 8 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.9 | 139 / 210 | 1.73 | 19.3% | 28648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 19.3% | 139 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.2% | 50 |
| apc.botM 3.0 | 3.0 | 12.0% | 9 |
| lxx.ConceptA 0.8 | 4.0 | 10.7% | 2 |
| vjik.UnViolation 1.1 | 5.0 | 9.4% | 7 |
| bayen.UbaMicro 1.4 | 6.3 | 8.5% | 1 |
| panzer.Panzer 0.2 | 7.5 | 7.2% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.4% | 1 |
| conscience.Electron 1.3g | 8.5 | 5.9% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 94.0 | 24 / 35 | 4419 |
| 2 | 1 | 69.0 | 91.4 | 23 / 35 | 4820 |
| 3 | 1 | 67.0 | 84.8 | 19 / 35 | 4515 |
| 4 | 1 | 70.1 | 91.7 | 24 / 35 | 5220 |
| 5 | 1 | 69.6 | 93.7 | 23 / 35 | 4974 |
| 6 | 1 | 69.9 | 95.9 | 26 / 35 | 4700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 89 | 61% |
| apc.botM 3.0 | 30 | 87% |
| lxx.ConceptA 0.8 | 21 | 95% |
| vjik.UnViolation 1.1 | 15 | 87% |
| donjezza.Jezza 1.0 | 11 | 100% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| panzer.Panzer 0.2 | 4 | 100% |
| yk.JahMicro 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 42 | 59% | 106 |
| apc.botM 3.0 | 12 | 17% | 39 |
| lxx.ConceptA 0.8 | 7 | 10% | 14 |
| vjik.UnViolation 1.1 | 4 | 6% | 22 |
| bayen.UbaMicro 1.4 | 4 | 6% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |
| conscience.Electron 1.3g | 1 | 1% | 5 |
| yk.JahMicro 1.0 | 0 | 0% | 4 |
| panzer.Panzer 0.2 | 0 | 0% | 2 |

## Melee bench: F33

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.6 | 133 / 210 | 1.85 | 19.5% | 29802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 19.5% | 133 |
| maribo.Quester 0.3 | 2.0 | 15.4% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.8% | 18 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.8% | 8 |
| labg.Cataclysm 2.05 | 5.0 | 9.9% | 13 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 8.1% | 5 |
| baal.nano.N 1.42 | 6.3 | 8.2% | 0 |
| zyx.micro.Ant 1.1 | 8.2 | 6.0% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 4.9% | 0 |
| sanja.First 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.7 | 18 / 35 | 4763 |
| 2 | 1 | 70.2 | 92.1 | 24 / 35 | 5150 |
| 3 | 1 | 69.7 | 89.8 | 20 / 35 | 5415 |
| 4 | 1 | 70.0 | 92.1 | 23 / 35 | 4953 |
| 5 | 1 | 68.8 | 89.2 | 24 / 35 | 4306 |
| 6 | 1 | 71.0 | 94.6 | 24 / 35 | 5215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 63 | 71% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 79% |
| gre.svman4.Leonidas 1.3.2 | 32 | 97% |
| labg.Cataclysm 2.05 | 16 | 69% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 73% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 100% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1076. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 37 | 47% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 22% | 52 |
| labg.Cataclysm 2.05 | 9 | 12% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 9% | 10 |
| gre.svman4.Leonidas 1.3.2 | 5 | 6% | 25 |
| sanja.First 0.1 | 1 | 1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| baal.nano.N 1.42 | 0 | 0% | 3 |
| zyx.micro.Ant 1.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.5 | 84 / 210 | 2.21 | 17.5% | 27730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.3 | 17.5% | 84 |
| stelo.Spread 0.9 | 1.7 | 17.3% | 77 |
| kid.Gladiator .7.2 | 3.0 | 15.9% | 39 |
| jcs.Seth 1.8 | 4.2 | 11.0% | 9 |
| tcf.Reach 3 | 5.0 | 10.5% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.5% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.8% | 0 |
| sample.RamFire 1.0 | 9.3 | 3.2% | 0 |
| sample.VelociRobot 1.0 | 9.5 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 83.5 | 13 / 35 | 4877 |
| 2 | 2 | 66.8 | 84.4 | 12 / 35 | 4345 |
| 3 | 1 | 68.3 | 90.2 | 15 / 35 | 4540 |
| 4 | 1 | 67.2 | 87.6 | 12 / 35 | 4433 |
| 5 | 1 | 69.0 | 87.9 | 16 / 35 | 4984 |
| 6 | 1 | 67.9 | 85.4 | 16 / 35 | 4551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 86 | 51% |
| kid.Gladiator .7.2 | 44 | 61% |
| jcs.Seth 1.8 | 12 | 75% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| tcf.Reach 3 | 1 | 0% |

Hadur died in 131 of 210 rounds, at a mean tick of 1172. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 68 | 52% | 107 |
| kid.Gladiator .7.2 | 45 | 34% | 68 |
| tcf.Reach 3 | 7 | 5% | 11 |
| jcs.Seth 1.8 | 5 | 4% | 14 |
| cli.Dancer 1.1 | 3 | 2% | 9 |
| ratosh.Wesco 1.4 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 80.3 | 31 / 210 | 2.78 | 14.8% | 19010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 155 |
| hadur117.mini.DeiseWSTOP 0.4 | 2.0 | 14.8% | 31 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.8% | 14 |
| rz.HawkOnFire 0.1 | 3.8 | 11.9% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.8 | 11.4% | 7 |
| myl.nano.KomoriNinja 1.1 | 6.0 | 7.2% | 0 |
| wit.Chuliath 1.0 | 7.0 | 6.7% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.7 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 79.0 | 5 / 35 | 3366 |
| 2 | 2 | 62.0 | 79.0 | 3 / 35 | 2867 |
| 3 | 2 | 64.6 | 84.1 | 5 / 35 | 3326 |
| 4 | 2 | 65.3 | 84.1 | 8 / 35 | 3516 |
| 5 | 2 | 62.2 | 78.1 | 6 / 35 | 2904 |
| 6 | 2 | 61.4 | 77.1 | 4 / 35 | 3031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 88 | 13% |
| gh.mini.Gruwel 0.9 | 13 | 46% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 73% |
| rz.HawkOnFire 0.1 | 5 | 80% |
| myl.nano.KomoriNinja 1.1 | 2 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 105 | 59% | 113 |
| gh.mini.Gruwel 0.9 | 31 | 17% | 38 |
| rz.HawkOnFire 0.1 | 22 | 12% | 26 |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 7% | 22 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.8 | 158 / 210 | 1.83 | 20.0% | 30220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 20.0% | 158 |
| bzdp.Pansy 2.1 | 2.7 | 12.4% | 11 |
| alpha.RainingFire 1.0 | 2.8 | 12.0% | 11 |
| bvh.micro.Freya 0.3 | 4.8 | 10.5% | 9 |
| mz.Cork 0.1 | 4.8 | 10.6% | 9 |
| bvh.mini.Fenrir 0.39 | 5.2 | 10.2% | 3 |
| m3thos.Eva02 0.7.1 | 6.7 | 8.8% | 3 |
| dl.BetterWalls 1.0 | 8.3 | 6.2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.3% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.4 | 26 / 35 | 5360 |
| 2 | 1 | 71.3 | 94.6 | 31 / 35 | 5202 |
| 3 | 1 | 69.3 | 89.2 | 25 / 35 | 5121 |
| 4 | 1 | 70.4 | 91.4 | 28 / 35 | 5064 |
| 5 | 1 | 70.3 | 92.1 | 26 / 35 | 4890 |
| 6 | 1 | 67.9 | 85.1 | 22 / 35 | 4583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 98% |
| bvh.micro.Freya 0.3 | 27 | 89% |
| alpha.RainingFire 1.0 | 27 | 81% |
| mz.Cork 0.1 | 23 | 91% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 12 | 100% |
| dl.BetterWalls 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 83% |

Hadur died in 53 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.mini.Fenrir 0.39 | 13 | 25% | 20 |
| alpha.RainingFire 1.0 | 12 | 23% | 43 |
| bzdp.Pansy 2.1 | 7 | 13% | 58 |
| bvh.micro.Freya 0.3 | 6 | 11% | 22 |
| mz.Cork 0.1 | 5 | 9% | 24 |
| m3thos.Eva02 0.7.1 | 4 | 8% | 20 |
| dl.BetterWalls 1.0 | 2 | 4% | 15 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 3 |

## Melee bench: F37

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 92.3 | 171 / 210 | 1.70 | 20.2% | 34852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 20.2% | 171 |
| germ.TheMind .2 | 2.2 | 10.8% | 6 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.0% | 3 |
| EBBU.Sim2 1.02 | 4.5 | 9.5% | 5 |
| agrach.Dalek 1.0 | 5.2 | 9.2% | 5 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.7% | 13 |
| lmk.ACPFinal 0.1 | 6.8 | 8.6% | 3 |
| skm.Ryubot 1.0 | 7.8 | 7.9% | 0 |
| mb.Beast 0.1 | 8.5 | 8.0% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 7.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 94.0 | 30 / 35 | 5925 |
| 2 | 1 | 68.8 | 89.5 | 25 / 35 | 5929 |
| 3 | 1 | 71.1 | 99.0 | 33 / 35 | 5780 |
| 4 | 1 | 67.8 | 88.3 | 26 / 35 | 5205 |
| 5 | 1 | 69.1 | 88.9 | 28 / 35 | 5690 |
| 6 | 1 | 70.7 | 94.0 | 29 / 35 | 6323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 41 | 100% |
| stelo.UntouchableNano 1.3 | 25 | 76% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 96% |
| EBBU.Sim2 1.02 | 22 | 100% |
| skm.Ryubot 1.0 | 19 | 100% |
| mb.Beast 0.1 | 18 | 100% |
| agrach.Dalek 1.0 | 17 | 100% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 473. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 11 | 28% | 19 |
| germ.TheMind .2 | 7 | 18% | 41 |
| EBBU.Sim2 1.02 | 6 | 15% | 26 |
| lmk.ACPFinal 0.1 | 5 | 13% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 8% | 32 |
| agrach.Dalek 1.0 | 3 | 8% | 26 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 8% | 11 |
| mb.Beast 0.1 | 2 | 5% | 21 |
| skm.Ryubot 1.0 | 0 | 0% | 7 |

## Melee bench: F38

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 79.6 | 65 / 210 | 2.83 | 15.6% | 22617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 17.1% | 87 |
| hadur117.mini.DeiseWSTOP 0.4 | 1.8 | 15.6% | 65 |
| bvh.mini.Freya 0.55 | 3.3 | 12.5% | 16 |
| cs.Wren 1.0 | 4.5 | 11.1% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 11.1% | 11 |
| bts.mega.Gnarly 1.4 | 5.5 | 10.7% | 18 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.7% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.5% | 0 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 80.3 | 9 / 35 | 3564 |
| 2 | 2 | 65.8 | 81.3 | 15 / 35 | 3924 |
| 3 | 2 | 65.5 | 82.2 | 13 / 35 | 4016 |
| 4 | 2 | 62.8 | 77.5 | 7 / 35 | 3454 |
| 5 | 1 | 65.3 | 81.3 | 12 / 35 | 4063 |
| 6 | 2 | 62.7 | 75.2 | 9 / 35 | 3596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 52 | 40% |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 61% |
| bvh.mini.Freya 0.55 | 13 | 62% |
| cs.Wren 1.0 | 13 | 100% |
| bts.mega.Gnarly 1.4 | 13 | 62% |
| matt.UnderDark3 2.4.34 | 2 | 100% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 54 | 37% | 78 |
| bvh.mini.Freya 0.55 | 28 | 19% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 13% | 33 |
| cs.Wren 1.0 | 17 | 12% | 24 |
| bts.mega.Gnarly 1.4 | 14 | 10% | 21 |
| kdf.KoulDestroyer 1.0 | 9 | 6% | 12 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 81.3 | 73 / 210 | 2.68 | 16.5% | 26360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 16.5% | 73 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 29 |
| az.Ololobot 0.2.4 | 3.2 | 13.5% | 73 |
| catcat20.Lambda 0.024 | 4.0 | 11.6% | 23 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.2% | 11 |
| gimp.GimpBot 0.1 | 6.8 | 7.9% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 7.9% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.7% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 80.3 | 10 / 35 | 4100 |
| 2 | 1 | 65.0 | 82.2 | 9 / 35 | 4436 |
| 3 | 1 | 63.2 | 76.2 | 12 / 35 | 4185 |
| 4 | 1 | 66.8 | 85.1 | 16 / 35 | 4632 |
| 5 | 1 | 65.6 | 81.6 | 13 / 35 | 4679 |
| 6 | 1 | 65.0 | 82.5 | 13 / 35 | 4328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 41 | 10% |
| catcat20.Lambda 0.024 | 31 | 71% |
| bvh.fry.Freya 0.82 | 26 | 85% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 1144. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 55 | 40% | 78 |
| az.Ololobot 0.2.4 | 49 | 35% | 58 |
| catcat20.Lambda 0.024 | 18 | 13% | 36 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 5% | 17 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 5 |
| winamp32.micro.MicroMacro 1.0 | 2 | 1% | 4 |
| gimp.GimpBot 0.1 | 2 | 1% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 1% | 4 |
| apollokidd.ApolloKidd 0.9 | 2 | 1% | 4 |

## Melee bench: F40

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.1 | 111 / 210 | 2.25 | 18.0% | 26646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 18.0% | 111 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.8% | 37 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.1% | 29 |
| mz.AntiGrav 1.0 | 4.2 | 11.2% | 11 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.3% | 7 |
| alpha.BlackIce 1.0 | 6.3 | 8.8% | 2 |
| stelo.Randomness 1.0 | 6.5 | 8.3% | 11 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 5.1% | 1 |
| sample.Corners 1.0 | 9.8 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.7 | 17 / 35 | 4320 |
| 2 | 1 | 68.6 | 88.3 | 20 / 35 | 4771 |
| 3 | 1 | 68.2 | 89.5 | 20 / 35 | 4480 |
| 4 | 1 | 68.6 | 87.6 | 21 / 35 | 4658 |
| 5 | 1 | 67.1 | 84.4 | 19 / 35 | 4207 |
| 6 | 1 | 65.3 | 80.3 | 14 / 35 | 4210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 57 | 70% |
| kano.gamma.KanoGamma 1.8 | 26 | 65% |
| Polkwane.SmashMelee 1.0 | 23 | 87% |
| mz.AntiGrav 1.0 | 22 | 95% |
| stelo.Randomness 1.0 | 7 | 86% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 37 | 37% | 58 |
| kano.gamma.KanoGamma 1.8 | 21 | 21% | 53 |
| mz.AntiGrav 1.0 | 13 | 13% | 37 |
| Polkwane.SmashMelee 1.0 | 12 | 12% | 27 |
| stelo.Randomness 1.0 | 8 | 8% | 15 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 7 |
| alpha.BlackIce 1.0 | 3 | 3% | 7 |
| sample.Corners 1.0 | 1 | 1% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 4 |

## Melee bench: F41

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.4 | 106 / 210 | 2.31 | 17.3% | 23536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.3 | 17.3% | 106 |
| eem.EvBotNG v12.8 | 1.7 | 16.3% | 62 |
| ary.Swarm 1.1 | 3.2 | 13.4% | 19 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.8% | 16 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.1% | 7 |
| shrub.Silver v048 | 6.3 | 8.1% | 0 |
| zyx.nano.Ant 1.1 | 6.7 | 7.6% | 0 |
| stelo.Mirror 1.1 | 8.2 | 5.7% | 2 |
| jsal.Jsalbot 1.0 | 8.8 | 5.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 85.7 | 16 / 35 | 3882 |
| 2 | 2 | 67.7 | 87.0 | 18 / 35 | 3951 |
| 3 | 1 | 67.0 | 87.0 | 20 / 35 | 3609 |
| 4 | 1 | 67.3 | 86.0 | 20 / 35 | 3986 |
| 5 | 2 | 65.8 | 79.4 | 15 / 35 | 4065 |
| 6 | 1 | 67.4 | 87.3 | 17 / 35 | 4043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 78 | 60% |
| lessonz.robocode.Oz 0.5.0 | 25 | 88% |
| ary.Swarm 1.1 | 21 | 76% |
| simonton.nano.MeleeSeed 1.8 | 19 | 84% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| shrub.Silver v048 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 47 | 44% | 97 |
| ary.Swarm 1.1 | 23 | 22% | 43 |
| simonton.nano.MeleeSeed 1.8 | 13 | 12% | 32 |
| lessonz.robocode.Oz 0.5.0 | 12 | 11% | 23 |
| shrub.Silver v048 | 5 | 5% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.0 | 89 / 210 | 2.53 | 17.2% | 28192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.2 | 17.2% | 89 |
| wompi.Wallaby 5.1 | 1.8 | 15.7% | 56 |
| ara.Shera 0.88 | 3.2 | 14.0% | 34 |
| maribo.mini.MiniQuester 0.1 | 3.8 | 13.4% | 26 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 1 |
| maribo.IotaCT 1.1 | 6.2 | 7.4% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.9% | 3 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.4 | 15 / 35 | 4766 |
| 2 | 1 | 67.7 | 86.0 | 19 / 35 | 4923 |
| 3 | 1 | 67.3 | 87.0 | 16 / 35 | 4757 |
| 4 | 1 | 67.1 | 83.8 | 14 / 35 | 4854 |
| 5 | 1 | 64.9 | 79.4 | 12 / 35 | 4320 |
| 6 | 2 | 64.9 | 77.5 | 13 / 35 | 4572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 49 | 73% |
| ara.Shera 0.88 | 43 | 70% |
| maribo.mini.MiniQuester 0.1 | 30 | 63% |
| dsw.StaticD 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 31% | 77 |
| ara.Shera 0.88 | 37 | 30% | 60 |
| maribo.mini.MiniQuester 0.1 | 32 | 26% | 52 |
| amz.NanoClone 1.41 | 10 | 8% | 13 |
| dsw.StaticD 1.0 | 3 | 2% | 5 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 74.0 | 24 / 210 | 3.34 | 13.8% | 19376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 160 |
| hadur117.mini.DeiseWSTOP 0.4 | 2.3 | 13.8% | 24 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.9% | 20 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.8% | 2 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.6% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.7% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.4% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 73.7 | 4 / 35 | 3183 |
| 2 | 2 | 65.1 | 81.9 | 6 / 35 | 3526 |
| 3 | 3 | 61.5 | 72.4 | 2 / 35 | 3063 |
| 4 | 2 | 63.4 | 75.6 | 4 / 35 | 3408 |
| 5 | 3 | 61.3 | 69.8 | 3 / 35 | 3056 |
| 6 | 2 | 61.5 | 70.8 | 5 / 35 | 3140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 77 | 14% |
| dummy.micro.Sparrow 2.5 | 7 | 100% |
| brainfade.melee.Dusk 0.44 | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| cvt.Firsty 1.0 | 2 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 103 | 55% | 116 |
| brainfade.melee.Dusk 0.44 | 25 | 13% | 28 |
| dummy.micro.Sparrow 2.5 | 22 | 12% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 18 | 10% | 19 |
| Krabb.akim2.Akim2 1.1b | 8 | 4% | 8 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.7 | 128 / 210 | 1.93 | 19.4% | 30738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 19.4% | 128 |
| stelo.Liblix 0.3.1 | 2.2 | 15.2% | 49 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.4% | 28 |
| wompi.Quokka 1.6 | 4.0 | 10.3% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 8.5% | 0 |
| jwirde.Gort 2.0 | 5.8 | 8.6% | 2 |
| disan.Chair 2.2.0 | 6.7 | 7.6% | 0 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.9% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 93.7 | 23 / 35 | 5278 |
| 2 | 1 | 67.7 | 84.8 | 20 / 35 | 4676 |
| 3 | 1 | 69.7 | 91.1 | 22 / 35 | 4942 |
| 4 | 1 | 69.5 | 88.3 | 21 / 35 | 5293 |
| 5 | 1 | 69.5 | 89.2 | 20 / 35 | 5239 |
| 6 | 1 | 69.9 | 91.1 | 22 / 35 | 5310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 77 | 70% |
| tzu.TheArtOfWar 1.2 | 56 | 79% |
| wompi.Quokka 1.6 | 14 | 93% |
| jwirde.Gort 2.0 | 6 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 44 | 53% | 102 |
| tzu.TheArtOfWar 1.2 | 23 | 28% | 62 |
| wompi.Quokka 1.6 | 7 | 8% | 18 |
| jwirde.Gort 2.0 | 3 | 4% | 14 |
| disan.Chair 2.2.0 | 3 | 4% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 2% | 4 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.6 | 68 / 210 | 2.12 | 19.3% | 35213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWSTOP 0.4 | 1.0 | 19.3% | 68 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.7% | 123 |
| jje.BagPuss 1.2 | 3.2 | 11.1% | 2 |
| sul.Lunar 1.1 | 4.5 | 10.2% | 4 |
| myl.nano.Graviton 1.10 | 4.7 | 10.3% | 5 |
| fm.claire 1.7 | 6.8 | 8.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.1% | 4 |
| hvilela.HVilela 0.9 | 7.2 | 7.8% | 0 |
| wit.Deep7 2.0 | 8.7 | 6.6% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.1 | 12 / 35 | 5874 |
| 2 | 1 | 69.4 | 90.2 | 12 / 35 | 5891 |
| 3 | 1 | 69.2 | 87.9 | 13 / 35 | 5931 |
| 4 | 1 | 68.9 | 86.7 | 9 / 35 | 6220 |
| 5 | 1 | 69.1 | 88.3 | 13 / 35 | 5695 |
| 6 | 1 | 67.2 | 81.3 | 9 / 35 | 5602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 118 | 19% |
| sul.Lunar 1.1 | 16 | 94% |
| myl.nano.Graviton 1.10 | 15 | 87% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 67% |
| jje.BagPuss 1.2 | 8 | 88% |
| wit.Deep7 2.0 | 4 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 2363. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 68% | 0 |
| jje.BagPuss 1.2 | 12 | 8% | 52 |
| sul.Lunar 1.1 | 9 | 6% | 62 |
| myl.nano.Graviton 1.10 | 9 | 6% | 39 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 6% | 25 |
| fm.claire 1.7 | 6 | 4% | 12 |
| wit.Deep7 2.0 | 1 | 1% | 13 |
| hvilela.HVilela 0.9 | 0 | 0% | 3 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeiseWSTOP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 86.1 | 67 / 210 | 2.25 | 16.6% | 23424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.5% | 74 |
| kc.mini.Mirage 0.2 | 1.8 | 16.6% | 58 |
| hadur117.mini.DeiseWSTOP 0.4 | 2.5 | 16.6% | 67 |
| mz.MicroSheep 1.0 | 4.3 | 10.6% | 3 |
| cx.Princess 1.0 | 4.8 | 9.7% | 5 |
| sadoner.killer 0.2 | 6.0 | 8.7% | 2 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.7% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.6% | 0 |
| kurios.DOSexe .9a | 8.7 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.6 | 87.3 | 12 / 35 | 3872 |
| 2 | 1 | 67.8 | 87.9 | 13 / 35 | 4711 |
| 3 | 3 | 66.6 | 84.4 | 14 / 35 | 4121 |
| 4 | 2 | 65.6 | 86.3 | 12 / 35 | 3527 |
| 5 | 3 | 65.0 | 84.1 | 7 / 35 | 3843 |
| 6 | 3 | 64.6 | 86.3 | 9 / 35 | 3350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 67 | 55% |
| rsalesc.melee.Medina 0.4.5 | 45 | 36% |
| mz.MicroSheep 1.0 | 9 | 78% |
| cx.Princess 1.0 | 7 | 86% |
| arthord.NanoSatanMelee Beta | 2 | 50% |

Hadur died in 144 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 69 | 48% | 108 |
| rsalesc.melee.Medina 0.4.5 | 49 | 34% | 70 |
| mz.MicroSheep 1.0 | 12 | 8% | 14 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 6 |
| cx.Princess 1.0 | 3 | 2% | 6 |
| sadoner.killer 0.2 | 3 | 2% | 4 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

