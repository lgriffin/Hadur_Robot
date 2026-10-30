# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.5 | 55 / 210 | 2.21 | 17.1% | 29148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 142 |
| hadur117.mini.DeiseSHARP 0.4 | 2.0 | 17.1% | 55 |
| sgp.JollyNinja 3.53 | 3.8 | 10.9% | 7 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.0% | 2 |
| mz.MicroGodMelee 1 | 4.7 | 10.7% | 2 |
| lorneswork.Predator 1.0 | 5.5 | 9.6% | 1 |
| adt.Ar2 1.0 | 7.2 | 7.0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 7.8 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 85.4 | 8 / 35 | 4903 |
| 2 | 2 | 67.7 | 87.6 | 12 / 35 | 5053 |
| 3 | 2 | 67.5 | 87.0 | 11 / 35 | 4924 |
| 4 | 2 | 66.3 | 86.0 | 7 / 35 | 4761 |
| 5 | 2 | 67.6 | 88.9 | 8 / 35 | 5101 |
| 6 | 2 | 65.5 | 84.1 | 9 / 35 | 4406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 133 | 17% |
| mz.MicroGodMelee 1 | 17 | 94% |
| sgp.JollyNinja 3.53 | 14 | 71% |
| lorneswork.Predator 1.0 | 5 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |

Hadur died in 155 of 210 rounds, at a mean tick of 1286. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 122 | 79% | 142 |
| sgp.JollyNinja 3.53 | 14 | 9% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 13 |
| mz.MicroGodMelee 1 | 6 | 4% | 22 |
| lorneswork.Predator 1.0 | 2 | 1% | 7 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |

## Melee bench: F02

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 82.6 | 100 / 210 | 2.57 | 17.5% | 28137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 17.5% | 100 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 14.3% | 42 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 12.5% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.0% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.6% | 6 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.0% | 2 |
| Noran.BitchingElk 0.054 | 7.0 | 8.0% | 12 |
| sch.Simone 0.3d | 7.8 | 7.7% | 6 |
| stelo.PatternRobot 1.0 | 8.3 | 7.2% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 79.0 | 17 / 35 | 4472 |
| 2 | 1 | 65.5 | 81.0 | 13 / 35 | 4449 |
| 3 | 1 | 68.0 | 85.7 | 17 / 35 | 5110 |
| 4 | 1 | 65.9 | 82.2 | 15 / 35 | 4467 |
| 5 | 1 | 67.2 | 82.2 | 21 / 35 | 5102 |
| 6 | 1 | 66.8 | 85.4 | 17 / 35 | 4537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 53 | 66% |
| pulsar.PulsarMax 0.8.9 | 32 | 66% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 69% |
| sch.Simone 0.3d | 11 | 73% |
| Noran.BitchingElk 0.054 | 10 | 70% |
| stelo.PatternRobot 1.0 | 9 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 34 | 30% | 67 |
| pulsar.PulsarMax 0.8.9 | 31 | 28% | 48 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 13% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 8% | 15 |
| stelo.PatternRobot 1.0 | 8 | 7% | 9 |
| sch.Simone 0.3d | 6 | 5% | 14 |
| Noran.BitchingElk 0.054 | 4 | 4% | 17 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 10 |
| fullsail.SweetTea 1.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.7 | 166 / 210 | 1.57 | 20.4% | 35531 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 20.4% | 166 |
| radnor.DoctorBob 1.42 | 2.5 | 13.4% | 10 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.0% | 14 |
| vuen.Cake 2.51 | 3.3 | 12.9% | 19 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 2 |
| adt.Ar1 2.1 | 6.2 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 97.1 | 30 / 35 | 6069 |
| 2 | 1 | 70.6 | 94.3 | 27 / 35 | 5914 |
| 3 | 1 | 70.5 | 93.3 | 27 / 35 | 5953 |
| 4 | 1 | 69.4 | 90.2 | 27 / 35 | 5485 |
| 5 | 1 | 70.8 | 94.0 | 28 / 35 | 6143 |
| 6 | 1 | 70.4 | 93.3 | 27 / 35 | 5967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 78 | 86% |
| kawigi.nano.Lib 1.0 | 50 | 92% |
| radnor.DoctorBob 1.42 | 41 | 98% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 18 | 39% | 86 |
| kawigi.nano.Lib 1.0 | 13 | 28% | 56 |
| radnor.DoctorBob 1.42 | 9 | 20% | 50 |
| adt.Ar1 2.1 | 3 | 7% | 6 |
| urdos.URDOS 1.3 | 1 | 2% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.0 | 38 / 210 | 2.26 | 17.5% | 33499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 167 |
| hadur117.mini.DeiseSHARP 0.4 | 2.0 | 17.5% | 38 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.6% | 4 |
| TNT.TNT 0.99.1 | 4.3 | 10.2% | 0 |
| josago.Jorgito 0.16 | 4.7 | 9.3% | 1 |
| css.Delitioner 0.11 | 6.3 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.6% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 84.8 | 5 / 35 | 5485 |
| 2 | 2 | 67.1 | 83.2 | 6 / 35 | 5360 |
| 3 | 2 | 67.7 | 84.8 | 5 / 35 | 5611 |
| 4 | 2 | 67.8 | 85.1 | 6 / 35 | 5490 |
| 5 | 2 | 69.6 | 89.2 | 8 / 35 | 6240 |
| 6 | 2 | 68.7 | 88.9 | 8 / 35 | 5313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 158 | 20% |
| apc.LeeroyJenkins2 1.0 | 6 | 67% |
| josago.Jorgito 0.16 | 2 | 50% |
| TNT.TNT 0.99.1 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 1489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 79% | 168 |
| apc.LeeroyJenkins2 1.0 | 22 | 13% | 27 |
| css.Delitioner 0.11 | 4 | 2% | 4 |
| TNT.TNT 0.99.1 | 3 | 2% | 4 |
| josago.Jorgito 0.16 | 2 | 1% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 76.3 | 32 / 210 | 3.13 | 14.2% | 20123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.4% | 110 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 57 |
| hadur117.mini.DeiseSHARP 0.4 | 3.0 | 14.2% | 32 |
| wompi.Numbat 2.1 | 4.0 | 12.2% | 9 |
| ms.Ares 0.19 | 5.2 | 9.5% | 0 |
| axeBots.HataMoto 3.09 | 5.8 | 9.0% | 2 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.3 | 81.3 | 8 / 35 | 3526 |
| 2 | 3 | 62.9 | 75.9 | 6 / 35 | 3639 |
| 3 | 3 | 61.8 | 74.9 | 6 / 35 | 3115 |
| 4 | 3 | 62.1 | 76.5 | 4 / 35 | 3341 |
| 5 | 3 | 62.5 | 75.9 | 6 / 35 | 3220 |
| 6 | 3 | 60.9 | 73.7 | 2 / 35 | 3282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 41 | 15% |
| justin.DemonicRage 3.4 | 35 | 37% |
| wompi.Numbat 2.1 | 11 | 82% |
| axeBots.HataMoto 3.09 | 4 | 50% |
| ms.Ares 0.19 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 75 | 42% | 82 |
| justin.DemonicRage 3.4 | 59 | 33% | 69 |
| wompi.Numbat 2.1 | 26 | 15% | 34 |
| ms.Ares 0.19 | 8 | 4% | 11 |
| axeBots.HataMoto 3.09 | 5 | 3% | 8 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.0 | 106 / 210 | 2.35 | 17.8% | 27536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 17.8% | 106 |
| jekl.StoneGhost 0.7 | 2.2 | 14.4% | 24 |
| origin.SleepSiphon 1.7b | 3.3 | 13.2% | 41 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.9% | 33 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 0 |
| DBall.NUKE 0.1 | 7.7 | 6.8% | 1 |
| spinnercat.Omen 1.0 | 7.8 | 6.7% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.3% | 2 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.0 | 16 / 35 | 4604 |
| 2 | 1 | 67.5 | 87.3 | 16 / 35 | 4514 |
| 3 | 1 | 67.1 | 82.5 | 19 / 35 | 4356 |
| 4 | 1 | 68.6 | 89.5 | 21 / 35 | 4743 |
| 5 | 1 | 66.7 | 81.6 | 17 / 35 | 4663 |
| 6 | 1 | 66.5 | 82.2 | 17 / 35 | 4656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 47 | 91% |
| origin.SleepSiphon 1.7b | 39 | 59% |
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 64% |
| gg.Wolverine 2.0 | 8 | 100% |
| mld.Wisdom 1.0 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 34% | 64 |
| origin.SleepSiphon 1.7b | 31 | 29% | 56 |
| jekl.StoneGhost 0.7 | 17 | 16% | 47 |
| mld.Wisdom 1.0 | 10 | 9% | 21 |
| gg.Wolverine 2.0 | 4 | 4% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 6 |
| DBall.NUKE 0.1 | 3 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.2 | 138 / 210 | 1.52 | 20.1% | 33593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 20.1% | 138 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.0% | 38 |
| rtk.Tachikoma 1.0 | 2.8 | 16.5% | 23 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.5% | 4 |
| franzor.Lizt 1.3.1 | 5.0 | 10.2% | 7 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.7% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.2 | 2.9% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.6 | 23 / 35 | 5813 |
| 2 | 1 | 71.5 | 95.6 | 23 / 35 | 5460 |
| 3 | 1 | 71.5 | 94.0 | 24 / 35 | 5263 |
| 4 | 1 | 71.5 | 94.6 | 22 / 35 | 5614 |
| 5 | 1 | 72.0 | 94.3 | 24 / 35 | 5939 |
| 6 | 1 | 71.1 | 92.4 | 22 / 35 | 5504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 103 | 85% |
| rsalesc.melee.Monk 0.3.6c | 47 | 30% |
| oog.melee.CapuletDroid 1.1 | 26 | 92% |
| franzor.Lizt 1.3.1 | 13 | 77% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 1496. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 39 | 54% | 64 |
| rtk.Tachikoma 1.0 | 24 | 33% | 115 |
| franzor.Lizt 1.3.1 | 4 | 6% | 1 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 24 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.0 | 124 / 210 | 2.08 | 18.5% | 27629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.5% | 124 |
| shrub.Vapour v159 | 2.7 | 12.6% | 22 |
| tm.Yuugao 1.0 | 2.8 | 12.8% | 36 |
| Krabb.sliNk.Garm 0.9u | 3.5 | 11.6% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 5.7 | 9.0% | 7 |
| m3thos.Eva00 1.1 | 6.2 | 8.4% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.2% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.7% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.4 | 23 / 35 | 4856 |
| 2 | 1 | 66.1 | 85.4 | 17 / 35 | 4256 |
| 3 | 1 | 65.7 | 81.3 | 16 / 35 | 4423 |
| 4 | 1 | 68.2 | 88.6 | 22 / 35 | 4697 |
| 5 | 1 | 69.3 | 93.0 | 22 / 35 | 4782 |
| 6 | 1 | 68.4 | 88.3 | 24 / 35 | 4615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 47 | 62% |
| shrub.Vapour v159 | 38 | 76% |
| Krabb.sliNk.Garm 0.9u | 32 | 75% |
| jwst.DAD.DarkAndDarker 1.1 | 20 | 95% |
| com.spp.robocode.MostlyHarmless 010 | 10 | 90% |
| m3thos.Eva00 1.1 | 5 | 100% |
| SHAM.WOW 1.4 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 27 | 31% | 69 |
| shrub.Vapour v159 | 24 | 28% | 48 |
| Krabb.sliNk.Garm 0.9u | 19 | 22% | 39 |
| zyx.nano.BacillusComma 1.0 | 5 | 6% | 8 |
| m3thos.Eva00 1.1 | 4 | 5% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 3% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 3 | 3% | 12 |
| SHAM.WOW 1.4 | 1 | 1% | 5 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.3 | 75 / 210 | 2.95 | 16.1% | 24045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 17.1% | 89 |
| hadur117.mini.DeiseSHARP 0.4 | 1.7 | 16.1% | 75 |
| kc.micro.Figment 1.0 | 2.8 | 14.2% | 21 |
| yagami.Tidus 0.11 | 4.0 | 10.7% | 1 |
| mc2.enemy.Original 0.9 | 5.3 | 9.5% | 11 |
| pedersen.Grishnakh 1.0 | 5.7 | 9.4% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 3 |
| step.nanoPri 1.0 | 8.3 | 5.3% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 75.6 | 7 / 35 | 3750 |
| 2 | 2 | 65.8 | 80.3 | 13 / 35 | 4163 |
| 3 | 1 | 65.4 | 81.3 | 12 / 35 | 4088 |
| 4 | 2 | 64.3 | 75.2 | 12 / 35 | 3928 |
| 5 | 2 | 64.9 | 77.5 | 13 / 35 | 4065 |
| 6 | 1 | 65.7 | 80.0 | 18 / 35 | 4051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 51 | 47% |
| kc.micro.Figment 1.0 | 41 | 85% |
| mc2.enemy.Original 0.9 | 10 | 60% |
| pedersen.Grishnakh 1.0 | 8 | 75% |
| yagami.Tidus 0.11 | 4 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 52 | 39% | 81 |
| kc.micro.Figment 1.0 | 31 | 23% | 62 |
| mc2.enemy.Original 0.9 | 21 | 16% | 27 |
| pedersen.Grishnakh 1.0 | 13 | 10% | 17 |
| yagami.Tidus 0.11 | 11 | 8% | 14 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| dft.Calliope 5.6 | 1 | 1% | 3 |

## Melee bench: F10

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 94.3 | 172 / 210 | 1.51 | 20.3% | 32893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 20.3% | 172 |
| DTF.Kludgy 1.2b | 2.2 | 14.4% | 20 |
| ejb.Polaris 1.0.1 | 3.3 | 12.2% | 6 |
| ne.Chimera 1.2 | 3.5 | 12.4% | 3 |
| tvv.micro.Antares 1.1.1 | 5.3 | 9.9% | 5 |
| vStar.RAFzilla 2.15 | 5.7 | 9.5% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.3 | 6.0% | 0 |
| kurios.DOSexe .9b | 8.8 | 5.2% | 1 |
| sam.Samspin 1.0 | 8.8 | 5.2% | 1 |
| donjezza.Muncho 1.0 | 9.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 94.3 | 29 / 35 | 5255 |
| 2 | 1 | 72.0 | 98.4 | 34 / 35 | 5646 |
| 3 | 1 | 67.9 | 85.7 | 22 / 35 | 5148 |
| 4 | 1 | 71.5 | 98.1 | 30 / 35 | 5484 |
| 5 | 1 | 70.9 | 94.9 | 28 / 35 | 5662 |
| 6 | 1 | 71.2 | 94.6 | 29 / 35 | 5698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 61 | 92% |
| ejb.Polaris 1.0.1 | 52 | 96% |
| ne.Chimera 1.2 | 32 | 94% |
| vStar.RAFzilla 2.15 | 12 | 100% |
| tvv.micro.Antares 1.1.1 | 11 | 100% |
| donjezza.Muncho 1.0 | 7 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 20 | 51% | 74 |
| ejb.Polaris 1.0.1 | 7 | 18% | 57 |
| ne.Chimera 1.2 | 5 | 13% | 36 |
| vStar.RAFzilla 2.15 | 2 | 5% | 11 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 5% | 6 |
| sam.Samspin 1.0 | 1 | 3% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 6 |
| donjezza.Muncho 1.0 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.5 | 100 / 210 | 2.58 | 17.2% | 25504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.2 | 17.2% | 100 |
| rz.Aleph 0.34 | 1.8 | 16.1% | 69 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.4% | 12 |
| djc.DynaBot 0.1.1 | 4.0 | 10.7% | 13 |
| rdt199.Warlord 0.73 | 5.3 | 9.3% | 4 |
| br2.MobyDickBot 1.6 | 6.3 | 8.5% | 4 |
| uji.YellohFellah 1.0 | 6.7 | 8.1% | 8 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.1% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.9 | 16 / 35 | 4483 |
| 2 | 1 | 64.9 | 79.7 | 14 / 35 | 4338 |
| 3 | 1 | 67.2 | 86.3 | 17 / 35 | 4461 |
| 4 | 2 | 64.8 | 79.4 | 17 / 35 | 3775 |
| 5 | 1 | 67.1 | 85.7 | 18 / 35 | 4379 |
| 6 | 1 | 65.6 | 81.0 | 18 / 35 | 4068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 62% |
| cx.mini.Nimrod 0.55 | 23 | 83% |
| djc.DynaBot 0.1.1 | 18 | 78% |
| br2.MobyDickBot 1.6 | 12 | 92% |
| rdt199.Warlord 0.73 | 12 | 100% |
| uji.YellohFellah 1.0 | 9 | 56% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 51 | 46% | 85 |
| cx.mini.Nimrod 0.55 | 19 | 17% | 33 |
| rdt199.Warlord 0.73 | 12 | 11% | 26 |
| uji.YellohFellah 1.0 | 8 | 7% | 16 |
| djc.DynaBot 0.1.1 | 7 | 6% | 22 |
| stelo.MirrorNano 1.3 | 5 | 5% | 5 |
| br2.MobyDickBot 1.6 | 3 | 3% | 14 |
| KiraNL.Chupacabra 0.4 | 3 | 3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 3% | 3 |

## Melee bench: F12

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.1 | 113 / 210 | 2.34 | 17.6% | 23610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 17.6% | 113 |
| nat.PallasHawk 1.0 | 2.5 | 14.0% | 31 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.2% | 33 |
| darkcanuck.Leon 1.01 | 3.7 | 12.8% | 17 |
| brainfade.melee.Genghis 0.36 | 5.2 | 9.9% | 8 |
| jrm.Test0 1.0 | 5.8 | 8.4% | 1 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.0% | 1 |
| jp.Perpy 16.0 | 8.2 | 6.2% | 2 |
| jaybot.bots.Oddball 4.0 | 8.5 | 5.8% | 3 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.9 | 19 / 35 | 3916 |
| 2 | 1 | 64.8 | 81.0 | 12 / 35 | 3846 |
| 3 | 1 | 66.8 | 85.4 | 20 / 35 | 3796 |
| 4 | 1 | 65.2 | 82.9 | 15 / 35 | 3650 |
| 5 | 1 | 66.6 | 82.2 | 21 / 35 | 4196 |
| 6 | 1 | 69.2 | 91.4 | 26 / 35 | 4206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 54 | 76% |
| darkcanuck.Leon 1.01 | 47 | 85% |
| bts.wiki.RipCurl 0.9b | 32 | 69% |
| brainfade.melee.Genghis 0.36 | 10 | 70% |
| jaybot.bots.Oddball 4.0 | 3 | 67% |
| stuff.Vlad 0.1 | 1 | 0% |
| jrm.Test0 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 0% |

Hadur died in 97 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 29 | 30% | 65 |
| bts.wiki.RipCurl 0.9b | 28 | 29% | 46 |
| darkcanuck.Leon 1.01 | 14 | 14% | 59 |
| brainfade.melee.Genghis 0.36 | 9 | 9% | 16 |
| jrm.Test0 1.0 | 8 | 8% | 9 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 6 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 5 |
| jp.Perpy 16.0 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 87.0 | 93 / 210 | 2.17 | 17.2% | 25794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.7 | 17.2% | 93 |
| mn.Combat 3.25.0 | 2.0 | 16.2% | 64 |
| ags.Glacier 0.2.11 | 2.3 | 16.1% | 32 |
| shinh.Entangled 0.3 | 4.0 | 12.5% | 15 |
| gh.micro.Gruweltje 0.7 | 5.0 | 10.6% | 7 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 90.2 | 18 / 35 | 4538 |
| 2 | 3 | 65.1 | 82.2 | 11 / 35 | 4018 |
| 3 | 1 | 68.3 | 89.5 | 19 / 35 | 4551 |
| 4 | 2 | 66.6 | 84.8 | 14 / 35 | 4394 |
| 5 | 2 | 66.3 | 85.1 | 14 / 35 | 4178 |
| 6 | 1 | 67.9 | 90.2 | 17 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 65 | 51% |
| ags.Glacier 0.2.11 | 59 | 73% |
| shinh.Entangled 0.3 | 16 | 56% |
| gh.micro.Gruweltje 0.7 | 7 | 71% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 51 | 43% | 83 |
| ags.Glacier 0.2.11 | 33 | 28% | 72 |
| shinh.Entangled 0.3 | 14 | 12% | 28 |
| gh.micro.Gruweltje 0.7 | 10 | 8% | 17 |
| stelo.Wang 1.0 | 5 | 4% | 5 |
| apc.Colossus2 0.17 | 4 | 3% | 5 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 94.4 | 165 / 210 | 1.50 | 20.4% | 32250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 20.4% | 165 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 21 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 9.6% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.2% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.2% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.8% | 2 |
| pa.Improved 1.0 | 9.0 | 6.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 96.2 | 29 / 35 | 5485 |
| 2 | 1 | 70.3 | 93.7 | 26 / 35 | 5353 |
| 3 | 1 | 71.0 | 96.5 | 29 / 35 | 5250 |
| 4 | 1 | 70.1 | 92.7 | 26 / 35 | 5426 |
| 5 | 1 | 71.9 | 97.8 | 30 / 35 | 5485 |
| 6 | 1 | 69.8 | 89.8 | 25 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 86 | 92% |
| catcat20.shape.Theta 0.018 | 58 | 83% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 92% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 20 | 44% | 97 |
| catcat20.shape.Theta 0.018 | 12 | 27% | 44 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 9% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 7% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 4% | 19 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 4 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F15

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.9 | 117 / 210 | 2.18 | 18.8% | 31420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.8% | 117 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 15 |
| emp.Yngwie 1.11 | 3.2 | 12.8% | 39 |
| mld.DustBunny 3.8 | 3.8 | 12.3% | 9 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.8% | 15 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.2% | 13 |
| lambdaxy.TBot 0.1 | 7.0 | 6.4% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 5.9% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.7% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.4 | 16 / 35 | 5268 |
| 2 | 1 | 68.3 | 88.9 | 21 / 35 | 4946 |
| 3 | 1 | 68.0 | 84.4 | 19 / 35 | 4952 |
| 4 | 1 | 68.5 | 86.0 | 18 / 35 | 5259 |
| 5 | 1 | 70.4 | 90.2 | 24 / 35 | 5704 |
| 6 | 1 | 68.8 | 87.3 | 19 / 35 | 5291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 43 | 65% |
| kawigi.micro.Shiz 1.1 | 30 | 93% |
| kawigi.robot.Girl 1.2 | 25 | 88% |
| mld.DustBunny 3.8 | 21 | 95% |
| cb.nano.Insomnia 1.0 | 19 | 84% |
| lambdaxy.TBot 0.1 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 29 | 31% | 71 |
| mld.DustBunny 3.8 | 16 | 17% | 51 |
| kawigi.robot.Girl 1.2 | 16 | 17% | 24 |
| cb.nano.Insomnia 1.0 | 13 | 14% | 15 |
| kawigi.micro.Shiz 1.1 | 11 | 12% | 32 |
| divineomega.TrialBot 0.003 | 6 | 6% | 9 |
| lambdaxy.TBot 0.1 | 1 | 1% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 2 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.2 | 94 / 210 | 2.24 | 18.7% | 33380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.7% | 94 |
| gh.Griezel 0.5.2 | 2.0 | 17.1% | 74 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.8% | 33 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.0% | 2 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 8.8% | 0 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.2% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.1% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 4.6% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.1 | 11 / 35 | 5659 |
| 2 | 1 | 68.2 | 85.4 | 14 / 35 | 5307 |
| 3 | 1 | 68.7 | 82.9 | 17 / 35 | 5796 |
| 4 | 1 | 68.8 | 86.3 | 17 / 35 | 5592 |
| 5 | 1 | 71.0 | 92.1 | 19 / 35 | 6064 |
| 6 | 1 | 68.1 | 86.7 | 16 / 35 | 4962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 88 | 55% |
| techdude.forest.FlamingForest 1.1 | 19 | 37% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 88% |
| tvv.nano.Polaris 1.2 | 9 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 1423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 63 | 53% | 114 |
| bvh.fnr.Fenrir 0.36l | 16 | 14% | 18 |
| techdude.forest.FlamingForest 1.1 | 14 | 12% | 22 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 11% | 28 |
| stelo.IntrinsicVolatility 1.4 | 8 | 7% | 11 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 8 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
| asd.Cthulhu 1.3 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.7 | 109 / 210 | 2.29 | 18.2% | 30183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.2% | 109 |
| et.Predator 1.8 | 2.2 | 13.6% | 20 |
| cx.BlestPain 1.41 | 3.7 | 11.9% | 34 |
| oog.melee.Mercutio 1.0 | 3.8 | 12.3% | 26 |
| nic.Nicator 2.4 | 4.7 | 11.4% | 12 |
| ahf.NanoAndrew .4 | 5.8 | 10.3% | 7 |
| maribo.melee.BMV 0.1 | 6.8 | 8.8% | 2 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.0 | 19 / 35 | 4975 |
| 2 | 1 | 67.4 | 81.6 | 21 / 35 | 5011 |
| 3 | 1 | 67.2 | 86.0 | 15 / 35 | 4724 |
| 4 | 1 | 68.9 | 88.3 | 19 / 35 | 5354 |
| 5 | 1 | 67.4 | 83.5 | 15 / 35 | 5173 |
| 6 | 1 | 68.8 | 88.6 | 20 / 35 | 4946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 48 | 85% |
| oog.melee.Mercutio 1.0 | 37 | 76% |
| cx.BlestPain 1.41 | 29 | 38% |
| nic.Nicator 2.4 | 17 | 82% |
| ahf.NanoAndrew .4 | 12 | 100% |
| maribo.melee.BMV 0.1 | 5 | 60% |

Hadur died in 102 of 210 rounds, at a mean tick of 1073. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 30 | 29% | 42 |
| et.Predator 1.8 | 18 | 18% | 60 |
| oog.melee.Mercutio 1.0 | 15 | 15% | 37 |
| ahf.NanoAndrew .4 | 13 | 13% | 24 |
| nic.Nicator 2.4 | 11 | 11% | 29 |
| maribo.melee.BMV 0.1 | 9 | 9% | 10 |
| tex.Longbot 0.4 | 4 | 4% | 4 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.8 | 123 / 210 | 2.10 | 18.4% | 27075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.4% | 123 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.0% | 27 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.6% | 32 |
| uji.DBH 1.1 | 4.3 | 10.7% | 8 |
| ratosh.Nobo 0.21 | 5.0 | 10.1% | 3 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.1% | 5 |
| sigterm.Sigterm 1.0 | 7.2 | 7.7% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.2% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 5.6% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.7 | 22 / 35 | 4670 |
| 2 | 1 | 66.3 | 82.5 | 21 / 35 | 4176 |
| 3 | 1 | 66.0 | 83.5 | 15 / 35 | 4296 |
| 4 | 1 | 68.6 | 91.1 | 22 / 35 | 4778 |
| 5 | 1 | 68.5 | 90.8 | 21 / 35 | 4671 |
| 6 | 1 | 67.5 | 87.0 | 22 / 35 | 4484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 48 | 81% |
| agd.Mooserwirt2 2.7 | 37 | 70% |
| spinnercat.Robovirus 2.718 | 16 | 94% |
| uji.DBH 1.1 | 16 | 88% |
| ratosh.Nobo 0.21 | 9 | 89% |
| sigterm.Sigterm 1.0 | 8 | 75% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 75% |
| stelo.WangRobot 1.0 | 8 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 30 | 34% | 73 |
| agd.Mooserwirt2 2.7 | 24 | 27% | 51 |
| uji.DBH 1.1 | 8 | 9% | 20 |
| ratosh.Nobo 0.21 | 8 | 9% | 19 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 14 |
| sigterm.Sigterm 1.0 | 5 | 6% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 2 |
| stelo.WangRobot 1.0 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 95.2 | 172 / 210 | 1.43 | 20.9% | 33341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 20.9% | 172 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.7% | 16 |
| mld.Infinity 2.2 | 2.7 | 13.9% | 17 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.2% | 1 |
| erdnis.Rover 0.3 | 4.8 | 10.4% | 3 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.0% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.0% | 0 |
| pac.ABC 2.1 | 7.8 | 6.2% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.9 | 27 / 35 | 5307 |
| 2 | 1 | 71.4 | 94.9 | 27 / 35 | 5377 |
| 3 | 1 | 71.5 | 94.6 | 27 / 35 | 5464 |
| 4 | 1 | 72.2 | 95.9 | 32 / 35 | 5710 |
| 5 | 1 | 72.2 | 94.9 | 28 / 35 | 6000 |
| 6 | 1 | 72.1 | 95.9 | 31 / 35 | 5483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 100 | 94% |
| mld.Infinity 2.2 | 51 | 86% |
| krillr.mini.JointStrike 2.0.0 | 11 | 100% |
| erdnis.Rover 0.3 | 11 | 91% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pac.ABC 2.1 | 6 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 1192. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 16 | 42% | 115 |
| mld.Infinity 2.2 | 10 | 26% | 30 |
| krillr.mini.JointStrike 2.0.0 | 6 | 16% | 19 |
| erdnis.Rover 0.3 | 3 | 8% | 17 |
| patson.PatsonTestBot 1.0 | 2 | 5% | 15 |
| mbh.Mbh 0.1 | 1 | 3% | 2 |
| pac.ABC 2.1 | 0 | 0% | 6 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.2 | 130 / 210 | 1.89 | 19.6% | 32448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 19.6% | 130 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 35 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.5% | 10 |
| fwb.Nine 1.0.1 | 3.7 | 11.1% | 18 |
| catcat20.Rabbit 0.001 | 4.8 | 10.0% | 14 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.7% | 3 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 7.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.4% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.8 | 24 / 35 | 5290 |
| 2 | 1 | 70.4 | 93.7 | 22 / 35 | 5683 |
| 3 | 1 | 68.6 | 87.0 | 18 / 35 | 5532 |
| 4 | 1 | 69.6 | 88.9 | 23 / 35 | 5285 |
| 5 | 1 | 69.6 | 90.2 | 23 / 35 | 5446 |
| 6 | 1 | 69.6 | 91.4 | 20 / 35 | 5212 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 76% |
| fwb.Nine 1.0.1 | 37 | 73% |
| catcat20.Rabbit 0.001 | 23 | 70% |
| nz.jdc.nano.GridFu 1.0 | 16 | 94% |
| bayen.nut.Squirrel 1.615 | 10 | 90% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1155. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 37 | 46% | 87 |
| fwb.Nine 1.0.1 | 17 | 21% | 11 |
| catcat20.Rabbit 0.001 | 11 | 14% | 34 |
| nz.jdc.nano.GridFu 1.0 | 7 | 9% | 34 |
| bayen.nut.Squirrel 1.615 | 4 | 5% | 20 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 9 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 8 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.4 | 137 / 210 | 1.60 | 20.4% | 33788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 20.4% | 137 |
| eem.EvBot v4.6.16 | 2.0 | 16.1% | 61 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.6% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 10.8% | 1 |
| eld.Hmm 1.0 | 5.5 | 8.2% | 3 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.2% | 1 |
| el.JumpShoot 0.2 | 7.2 | 6.7% | 1 |
| fire219.CatBot 1.0 | 8.2 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.1 | 21 / 35 | 6123 |
| 2 | 1 | 70.5 | 94.6 | 24 / 35 | 5193 |
| 3 | 1 | 70.4 | 91.1 | 18 / 35 | 5755 |
| 4 | 1 | 71.4 | 94.9 | 24 / 35 | 5624 |
| 5 | 1 | 70.5 | 92.1 | 24 / 35 | 5444 |
| 6 | 1 | 71.7 | 95.6 | 26 / 35 | 5649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 108 | 64% |
| dummy.mini.Scimitar 1.01 | 51 | 96% |
| cf.RiO.RiOx 4.2.1 | 12 | 100% |
| eld.Hmm 1.0 | 7 | 71% |
| oa.weak.BotherBot 0.1 | 3 | 67% |

Hadur died in 74 of 210 rounds, at a mean tick of 1534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 61% | 98 |
| dummy.mini.Scimitar 1.01 | 15 | 20% | 66 |
| cf.RiO.RiOx 4.2.1 | 6 | 8% | 17 |
| eld.Hmm 1.0 | 3 | 4% | 18 |
| oa.weak.BotherBot 0.1 | 3 | 4% | 7 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.8 | 108 / 210 | 2.00 | 18.6% | 30210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.6% | 108 |
| pe.SandboxDT 2.71m | 2.3 | 16.3% | 57 |
| kvk.HebusLeTroll 0.35 | 2.7 | 14.9% | 31 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.4% | 11 |
| bigpete.Stewie 1.0 | 4.8 | 9.9% | 3 |
| yk.JahRoslav 1.1 | 6.8 | 6.6% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.4% | 1 |
| gg.Squaraus 0.6 | 7.3 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.3% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.6 | 19 / 35 | 5063 |
| 2 | 1 | 68.8 | 88.3 | 16 / 35 | 4880 |
| 3 | 1 | 68.7 | 87.6 | 14 / 35 | 5383 |
| 4 | 1 | 69.6 | 90.5 | 19 / 35 | 5111 |
| 5 | 1 | 67.7 | 85.7 | 19 / 35 | 4620 |
| 6 | 1 | 70.0 | 92.4 | 21 / 35 | 5153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 52 | 50% |
| kvk.HebusLeTroll 0.35 | 48 | 73% |
| jlm.javaDisturbance 0.59 | 37 | 92% |
| bigpete.Stewie 1.0 | 7 | 86% |
| pbg.NinjaX 1.2 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 49 | 48% | 83 |
| kvk.HebusLeTroll 0.35 | 27 | 26% | 57 |
| jlm.javaDisturbance 0.59 | 18 | 17% | 47 |
| bigpete.Stewie 1.0 | 6 | 6% | 12 |
| tad.Dalek98 0.98 | 1 | 1% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.4 | 137 / 210 | 1.68 | 20.0% | 31272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 20.0% | 137 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 44 |
| cre.Karolos 0.32 | 3.0 | 14.4% | 18 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.7% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 8.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.8% | 3 |
| sample.Walls 1.0 | 7.2 | 7.9% | 1 |
| cw.megas.Blade 0.8 | 7.5 | 7.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.7 | 21 / 35 | 5417 |
| 2 | 1 | 72.5 | 94.6 | 29 / 35 | 5215 |
| 3 | 1 | 71.7 | 94.0 | 26 / 35 | 5053 |
| 4 | 1 | 70.6 | 91.4 | 20 / 35 | 5333 |
| 5 | 1 | 70.1 | 90.2 | 19 / 35 | 5374 |
| 6 | 1 | 70.5 | 92.7 | 22 / 35 | 4880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 92 | 76% |
| cre.Karolos 0.32 | 40 | 80% |
| stelo.AreaTargetingBot 1.1 | 15 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 88% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 40 | 55% | 107 |
| cre.Karolos 0.32 | 19 | 26% | 56 |
| stelo.AreaTargetingBot 1.1 | 7 | 10% | 16 |
| stelo.RamTrackSurfer 1.2 | 4 | 5% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 3% | 4 |
| sample.Walls 1.0 | 1 | 1% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |

## Melee bench: F24

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 74.4 | 69 / 210 | 3.30 | 14.9% | 21816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.3 | 14.9% | 69 |
| rz.GlowBlowMelee 1.4 | 1.8 | 14.7% | 50 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.5% | 29 |
| davidalves.Phoenix 0.54 | 3.8 | 12.5% | 32 |
| florent.XSeries.X2 0.12 | 4.2 | 13.0% | 27 |
| oog.melee.Corsair 1.0 | 6.2 | 9.2% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.3% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 0 |
| evd.X1 0.01 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 72.4 | 11 / 35 | 3949 |
| 2 | 2 | 62.9 | 74.3 | 13 / 35 | 3636 |
| 3 | 1 | 63.4 | 75.9 | 13 / 35 | 3469 |
| 4 | 1 | 61.2 | 71.4 | 12 / 35 | 3326 |
| 5 | 1 | 62.1 | 73.0 | 9 / 35 | 3665 |
| 6 | 1 | 63.9 | 79.4 | 11 / 35 | 3771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 61% |
| davidalves.Phoenix 0.54 | 19 | 68% |
| florent.XSeries.X2 0.12 | 17 | 82% |
| pedersen.Ugluk 1.1.1 | 13 | 62% |
| stelo.SoJNanoMelee 1.1 | 11 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| oog.melee.Corsair 1.0 | 2 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 23% | 59 |
| pedersen.Ugluk 1.1.1 | 32 | 23% | 36 |
| florent.XSeries.X2 0.12 | 29 | 20% | 45 |
| davidalves.Phoenix 0.54 | 26 | 18% | 38 |
| stelo.SoJNanoMelee 1.1 | 11 | 8% | 12 |
| oog.melee.Corsair 1.0 | 4 | 3% | 13 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 3 |
| evd.X1 0.01 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.3 | 153 / 210 | 1.97 | 19.3% | 26694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 19.3% | 153 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.0% | 12 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.3% | 15 |
| jdw.Hurricane 1.4 | 4.0 | 11.1% | 15 |
| ds.Oo 2.2 | 5.3 | 9.1% | 5 |
| gre.svman4.Morfeas 1.4.1 | 6.3 | 8.4% | 3 |
| gjr.Cephalosporin 0.1 | 7.2 | 7.5% | 4 |
| awesomeness.Elite 1.0 | 8.0 | 6.9% | 0 |
| adt.Ar2 1.1 | 8.2 | 6.6% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 93.3 | 27 / 35 | 4681 |
| 2 | 1 | 69.5 | 89.2 | 26 / 35 | 4701 |
| 3 | 1 | 70.1 | 93.7 | 28 / 35 | 4404 |
| 4 | 1 | 68.0 | 87.0 | 24 / 35 | 4222 |
| 5 | 1 | 69.2 | 91.1 | 27 / 35 | 4434 |
| 6 | 1 | 66.7 | 81.3 | 21 / 35 | 4252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 55 | 98% |
| voidious.mini.BrokenSword 2.0.3 | 43 | 98% |
| jdw.Hurricane 1.4 | 27 | 96% |
| adt.Ar2 1.1 | 9 | 67% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| ds.Oo 2.2 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| gre.svman4.Morfeas 1.4.1 | 5 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 15 | 26% | 52 |
| jdw.Hurricane 1.4 | 12 | 21% | 42 |
| voidious.mini.BrokenSword 2.0.3 | 8 | 14% | 41 |
| adt.Ar2 1.1 | 7 | 12% | 12 |
| gjr.Cephalosporin 0.1 | 5 | 9% | 20 |
| ds.Oo 2.2 | 5 | 9% | 19 |
| gre.svman4.Morfeas 1.4.1 | 2 | 4% | 12 |
| awesomeness.Elite 1.0 | 2 | 4% | 9 |
| amk.ChumbaMini 0.2 | 1 | 2% | 3 |

## Melee bench: F26

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.5 | 120 / 210 | 2.03 | 18.9% | 32875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.9% | 120 |
| ak.Fermat 2.0 | 2.0 | 14.5% | 34 |
| lrem.Spectre 0.4.4 | 3.2 | 12.8% | 14 |
| shu.nitro.LENIN .T34 | 3.8 | 12.3% | 27 |
| js.PinBall 1.6 | 5.2 | 10.7% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.4% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.0% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.2% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.9 | 21 / 35 | 5555 |
| 2 | 1 | 69.8 | 91.1 | 21 / 35 | 5541 |
| 3 | 1 | 67.9 | 85.4 | 18 / 35 | 5035 |
| 4 | 1 | 68.3 | 86.3 | 18 / 35 | 5377 |
| 5 | 1 | 69.8 | 90.2 | 21 / 35 | 5596 |
| 6 | 1 | 70.2 | 90.2 | 21 / 35 | 5771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 47 | 68% |
| lrem.Spectre 0.4.4 | 44 | 84% |
| shu.nitro.LENIN .T34 | 38 | 79% |
| js.PinBall 1.6 | 10 | 90% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |

Hadur died in 90 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 32 | 36% | 58 |
| shu.nitro.LENIN .T34 | 23 | 26% | 62 |
| lrem.Spectre 0.4.4 | 21 | 23% | 45 |
| js.PinBall 1.6 | 7 | 8% | 20 |
| gh.mini.GrubbmOne 1.0 | 4 | 4% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 2% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 3 |

## Melee bench: F27

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.4 | 135 / 210 | 2.04 | 18.3% | 25217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.3% | 135 |
| mk.Alpha 0.2.1 | 2.2 | 13.7% | 35 |
| wee.Gem 1.8.4 | 3.7 | 11.6% | 22 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 11.0% | 12 |
| EH.Eagle 1.0.6 | 4.7 | 10.3% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 5.7 | 9.3% | 1 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.8% | 1 |
| joe.ADinosaur 1.0 | 7.8 | 7.0% | 1 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.2% | 2 |
| cs.Grudge 1.0 | 9.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 93.7 | 29 / 35 | 4316 |
| 2 | 1 | 67.1 | 86.3 | 20 / 35 | 4244 |
| 3 | 1 | 68.3 | 88.6 | 23 / 35 | 4418 |
| 4 | 1 | 68.0 | 87.6 | 24 / 35 | 4376 |
| 5 | 1 | 67.4 | 87.9 | 19 / 35 | 4165 |
| 6 | 1 | 66.4 | 86.3 | 20 / 35 | 3698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 70 | 81% |
| wee.Gem 1.8.4 | 33 | 79% |
| sheldor.melee.nano.TestMelee 0.1 | 25 | 84% |
| EH.Eagle 1.0.6 | 20 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 29 | 38% | 81 |
| wee.Gem 1.8.4 | 15 | 20% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 17% | 37 |
| joe.ADinosaur 1.0 | 6 | 8% | 8 |
| EH.Eagle 1.0.6 | 4 | 5% | 23 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 5% | 12 |
| throxbot.ThroxBot 0.1 | 2 | 3% | 6 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 5 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.1 | 143 / 210 | 1.80 | 19.3% | 27749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 19.3% | 143 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 38 |
| uji.Antique 1.0 | 3.5 | 11.7% | 13 |
| qohnil.blot.BlotBot 3.61 | 3.5 | 11.2% | 11 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 3 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.1% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.8% | 1 |
| stelo.PianistNano 1.2 | 8.7 | 6.0% | 0 |
| matt.advanced.Katana 1.0 | 9.0 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 92.4 | 26 / 35 | 4620 |
| 2 | 1 | 69.5 | 90.8 | 26 / 35 | 4671 |
| 3 | 1 | 68.1 | 85.4 | 24 / 35 | 4568 |
| 4 | 1 | 69.2 | 93.3 | 23 / 35 | 4302 |
| 5 | 1 | 69.3 | 93.3 | 19 / 35 | 4829 |
| 6 | 1 | 69.4 | 91.4 | 25 / 35 | 4759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 75 | 76% |
| uji.Antique 1.0 | 49 | 88% |
| qohnil.blot.BlotBot 3.61 | 23 | 74% |
| pfvicm.Sobieski 7.2.3b | 11 | 82% |
| amk.ChumbaWumba 0.3 | 9 | 89% |
| ahr.ice.Ice 1.0.2 | 6 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 30 | 45% | 84 |
| qohnil.blot.BlotBot 3.61 | 11 | 16% | 33 |
| pfvicm.Sobieski 7.2.3b | 9 | 13% | 18 |
| uji.Antique 1.0 | 8 | 12% | 51 |
| amk.ChumbaWumba 0.3 | 4 | 6% | 11 |
| ahr.ice.Ice 1.0.2 | 4 | 6% | 8 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |

## Melee bench: F29

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.9 | 118 / 210 | 2.27 | 18.7% | 28729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.7% | 118 |
| deewiant.Anomaly 0.2 | 2.3 | 15.2% | 33 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.7% | 38 |
| myl.micro.Troodon 1.10 | 3.8 | 12.7% | 10 |
| jok.PheonixM 0.1.2 | 5.0 | 9.9% | 6 |
| ph.melee.ArcherME 0.3 | 6.2 | 7.5% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.6% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.8% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.3% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.6 | 21 / 35 | 4750 |
| 2 | 1 | 68.5 | 85.1 | 22 / 35 | 4495 |
| 3 | 1 | 70.6 | 90.2 | 23 / 35 | 5238 |
| 4 | 1 | 67.2 | 82.2 | 15 / 35 | 4470 |
| 5 | 1 | 69.0 | 85.4 | 20 / 35 | 4872 |
| 6 | 1 | 68.4 | 84.1 | 17 / 35 | 4904 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 83% |
| zyx.mega.YersiniaPestis 3.1 | 57 | 70% |
| myl.micro.Troodon 1.10 | 16 | 88% |
| jok.PheonixM 0.1.2 | 7 | 71% |
| DBall.Anarchy 0.1 | 6 | 83% |

Hadur died in 94 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 34 | 36% | 89 |
| zyx.mega.YersiniaPestis 3.1 | 31 | 33% | 70 |
| myl.micro.Troodon 1.10 | 13 | 14% | 25 |
| jok.PheonixM 0.1.2 | 8 | 9% | 13 |
| DBall.Anarchy 0.1 | 3 | 3% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 4 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 75.7 | 60 / 210 | 3.19 | 14.9% | 21515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.3 | 14.9% | 60 |
| oog.melee.Capulet 1.2 | 2.8 | 13.7% | 34 |
| catcat20.Matcha 0.006 | 3.2 | 13.1% | 45 |
| darkcanuck.B26354 1.06 | 3.5 | 13.6% | 40 |
| stelo.PastFuture 2.3.2 | 4.2 | 13.3% | 27 |
| intruder.PrairieWolf 2.61 | 6.8 | 7.9% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.2% | 3 |
| ntc.Opposite 1.5 | 7.7 | 7.1% | 0 |
| tripphippy.Alice 1.1 | 8.2 | 6.8% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 72.7 | 8 / 35 | 3691 |
| 2 | 1 | 62.6 | 75.9 | 10 / 35 | 3592 |
| 3 | 1 | 62.2 | 73.3 | 12 / 35 | 3310 |
| 4 | 1 | 64.4 | 80.6 | 9 / 35 | 3801 |
| 5 | 3 | 60.9 | 70.8 | 9 / 35 | 3333 |
| 6 | 1 | 64.8 | 81.0 | 12 / 35 | 3788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 33 | 64% |
| catcat20.Matcha 0.006 | 29 | 45% |
| oog.melee.Capulet 1.2 | 21 | 57% |
| stelo.PastFuture 2.3.2 | 16 | 63% |
| intruder.PrairieWolf 2.61 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 38 | 25% | 56 |
| stelo.PastFuture 2.3.2 | 34 | 23% | 46 |
| catcat20.Matcha 0.006 | 32 | 21% | 43 |
| oog.melee.Capulet 1.2 | 21 | 14% | 35 |
| ntc.Opposite 1.5 | 11 | 7% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 5% | 9 |
| tripphippy.Alice 1.1 | 5 | 3% | 5 |
| intruder.PrairieWolf 2.61 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 75.8 | 55 / 210 | 3.18 | 14.8% | 20522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 18.2% | 99 |
| hadur117.mini.DeiseSHARP 0.4 | 1.8 | 14.8% | 55 |
| gh.mini.Griezel 0.2 | 3.3 | 13.2% | 35 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.8% | 12 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.1% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.0% | 6 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.5% | 1 |
| fm.mammillarias 1.3 | 7.8 | 5.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 74.9 | 7 / 35 | 3329 |
| 2 | 2 | 61.8 | 72.4 | 6 / 35 | 3381 |
| 3 | 2 | 63.1 | 75.2 | 11 / 35 | 3464 |
| 4 | 2 | 62.8 | 76.5 | 8 / 35 | 3455 |
| 5 | 1 | 64.8 | 81.3 | 15 / 35 | 3491 |
| 6 | 2 | 62.0 | 74.3 | 8 / 35 | 3402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 61 | 54% |
| gh.mini.Griezel 0.2 | 16 | 31% |
| d414.nano.Quantum 1.0.0 | 13 | 77% |
| spinnercat.micro.Tyger 0.1 | 7 | 86% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |

Hadur died in 157 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 55 | 35% | 85 |
| gh.mini.Griezel 0.2 | 46 | 29% | 53 |
| spinnercat.micro.Tyger 0.1 | 19 | 12% | 26 |
| d414.nano.Quantum 1.0.0 | 15 | 10% | 25 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 8 |
| fm.mammillarias 1.3 | 7 | 4% | 7 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.1 | 133 / 210 | 2.07 | 18.6% | 28129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.6% | 133 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 48 |
| apc.botM 3.0 | 3.3 | 11.5% | 11 |
| lxx.ConceptA 0.8 | 4.0 | 10.7% | 3 |
| vjik.UnViolation 1.1 | 4.7 | 10.4% | 6 |
| bayen.UbaMicro 1.4 | 6.2 | 9.3% | 4 |
| panzer.Panzer 0.2 | 7.5 | 7.3% | 3 |
| yk.JahMicro 1.0 | 8.3 | 6.0% | 0 |
| conscience.Electron 1.3g | 8.7 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.6 | 22 / 35 | 4800 |
| 2 | 1 | 67.5 | 84.1 | 19 / 35 | 5104 |
| 3 | 1 | 68.8 | 92.1 | 26 / 35 | 4437 |
| 4 | 1 | 67.1 | 84.8 | 21 / 35 | 4687 |
| 5 | 1 | 69.5 | 91.7 | 26 / 35 | 4694 |
| 6 | 1 | 67.1 | 88.6 | 19 / 35 | 4407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 82 | 63% |
| lxx.ConceptA 0.8 | 24 | 96% |
| apc.botM 3.0 | 24 | 79% |
| vjik.UnViolation 1.1 | 17 | 100% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| donjezza.Jezza 1.0 | 7 | 71% |
| yk.JahMicro 1.0 | 6 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 40 | 52% | 93 |
| apc.botM 3.0 | 14 | 18% | 41 |
| panzer.Panzer 0.2 | 8 | 10% | 10 |
| lxx.ConceptA 0.8 | 6 | 8% | 18 |
| bayen.UbaMicro 1.4 | 4 | 5% | 11 |
| donjezza.Jezza 1.0 | 3 | 4% | 7 |
| vjik.UnViolation 1.1 | 1 | 1% | 23 |
| yk.JahMicro 1.0 | 1 | 1% | 3 |
| conscience.Electron 1.3g | 0 | 0% | 4 |

## Melee bench: F33

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.5 | 147 / 210 | 1.85 | 19.8% | 30630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 19.8% | 147 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.0% | 11 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.2% | 7 |
| labg.Cataclysm 2.05 | 4.3 | 10.5% | 7 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.3% | 7 |
| baal.nano.N 1.42 | 6.7 | 8.0% | 0 |
| zyx.micro.Ant 1.1 | 8.2 | 5.7% | 0 |
| sanja.First 0.1 | 9.2 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.8 | 21 / 35 | 4699 |
| 2 | 1 | 71.6 | 94.6 | 29 / 35 | 5382 |
| 3 | 1 | 69.5 | 87.9 | 23 / 35 | 4995 |
| 4 | 1 | 70.8 | 93.0 | 25 / 35 | 5442 |
| 5 | 1 | 70.5 | 91.4 | 26 / 35 | 5130 |
| 6 | 1 | 70.2 | 91.4 | 23 / 35 | 4982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 57 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 100% |
| gre.svman4.Leonidas 1.3.2 | 36 | 100% |
| labg.Cataclysm 2.05 | 20 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 63% |
| sanja.First 0.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 48% | 92 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 14% | 10 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 13% | 51 |
| gre.svman4.Leonidas 1.3.2 | 7 | 11% | 23 |
| labg.Cataclysm 2.05 | 5 | 8% | 24 |
| zyx.micro.Ant 1.1 | 2 | 3% | 5 |
| baal.nano.N 1.42 | 2 | 3% | 4 |
| sanja.First 0.1 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.0 | 81 / 210 | 2.26 | 17.7% | 29431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 17.7% | 81 |
| kid.Gladiator .7.2 | 2.5 | 16.8% | 52 |
| stelo.Spread 0.9 | 2.5 | 16.2% | 65 |
| jcs.Seth 1.8 | 4.5 | 10.8% | 8 |
| tcf.Reach 3 | 4.7 | 10.5% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.2 | 16 / 35 | 4980 |
| 2 | 1 | 67.6 | 87.0 | 11 / 35 | 4813 |
| 3 | 1 | 67.2 | 81.3 | 14 / 35 | 5059 |
| 4 | 1 | 67.4 | 85.7 | 10 / 35 | 4746 |
| 5 | 1 | 68.6 | 87.3 | 17 / 35 | 4979 |
| 6 | 1 | 68.1 | 85.4 | 13 / 35 | 4854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 67 | 55% |
| kid.Gladiator .7.2 | 48 | 48% |
| jcs.Seth 1.8 | 14 | 86% |
| tcf.Reach 3 | 8 | 75% |
| ratosh.Wesco 1.4 | 2 | 50% |
| cli.Dancer 1.1 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1075. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 59 | 46% | 79 |
| stelo.Spread 0.9 | 54 | 42% | 90 |
| jcs.Seth 1.8 | 8 | 6% | 20 |
| tcf.Reach 3 | 4 | 3% | 12 |
| ratosh.Wesco 1.4 | 3 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 2 |
| cli.Dancer 1.1 | 0 | 0% | 2 |

## Melee bench: F35

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 79.2 | 29 / 210 | 2.87 | 15.0% | 21206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.9% | 153 |
| hadur117.mini.DeiseSHARP 0.4 | 2.2 | 15.0% | 29 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.3% | 16 |
| rz.HawkOnFire 0.1 | 4.2 | 11.8% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.2% | 5 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 7.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 80.3 | 9 / 35 | 3590 |
| 2 | 2 | 62.7 | 77.1 | 2 / 35 | 3598 |
| 3 | 2 | 63.1 | 78.4 | 5 / 35 | 3297 |
| 4 | 3 | 62.9 | 79.4 | 3 / 35 | 3528 |
| 5 | 2 | 63.7 | 77.5 | 4 / 35 | 3743 |
| 6 | 2 | 64.0 | 82.5 | 6 / 35 | 3450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 78 | 10% |
| gh.mini.Gruwel 0.9 | 17 | 53% |
| rz.HawkOnFire 0.1 | 7 | 86% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 83% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 100 | 55% | 108 |
| gh.mini.Gruwel 0.9 | 36 | 20% | 45 |
| rz.HawkOnFire 0.1 | 20 | 11% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 8% | 19 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 4% | 8 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 1 |
| dans.Cinnamon 1.2 | 0 | 0% | 1 |

## Melee bench: F36

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.9 | 158 / 210 | 1.73 | 20.6% | 32612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 20.6% | 158 |
| bzdp.Pansy 2.1 | 2.3 | 12.1% | 7 |
| alpha.RainingFire 1.0 | 3.0 | 11.6% | 15 |
| mz.Cork 0.1 | 4.7 | 10.0% | 9 |
| bvh.micro.Freya 0.3 | 4.7 | 10.5% | 9 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.3% | 5 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.2% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 6.7% | 0 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.8% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.9 | 29 / 35 | 5663 |
| 2 | 1 | 69.2 | 87.3 | 23 / 35 | 5293 |
| 3 | 1 | 71.2 | 93.0 | 29 / 35 | 5528 |
| 4 | 1 | 70.5 | 92.4 | 24 / 35 | 5343 |
| 5 | 1 | 70.7 | 93.0 | 28 / 35 | 5255 |
| 6 | 1 | 70.2 | 90.8 | 25 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 96% |
| bvh.micro.Freya 0.3 | 35 | 83% |
| alpha.RainingFire 1.0 | 26 | 77% |
| mz.Cork 0.1 | 25 | 88% |
| bvh.mini.Fenrir 0.39 | 17 | 100% |
| dl.BetterWalls 1.0 | 8 | 100% |
| m3thos.Eva02 0.7.1 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 83% |

Hadur died in 52 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 29% | 38 |
| bvh.micro.Freya 0.3 | 12 | 23% | 30 |
| bzdp.Pansy 2.1 | 7 | 13% | 56 |
| mz.Cork 0.1 | 6 | 12% | 24 |
| m3thos.Eva02 0.7.1 | 5 | 10% | 24 |
| dl.BetterWalls 1.0 | 3 | 6% | 20 |
| bvh.mini.Fenrir 0.39 | 3 | 6% | 12 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F37

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 93.4 | 174 / 210 | 1.60 | 20.1% | 33552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 20.1% | 174 |
| germ.TheMind .2 | 2.5 | 10.7% | 5 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.4% | 7 |
| EBBU.Sim2 1.02 | 4.7 | 9.7% | 2 |
| stelo.UntouchableNano 1.3 | 5.2 | 9.3% | 7 |
| agrach.Dalek 1.0 | 6.5 | 8.6% | 10 |
| lmk.ACPFinal 0.1 | 6.7 | 8.6% | 3 |
| mb.Beast 0.1 | 6.8 | 8.5% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.3% | 0 |
| skm.Ryubot 1.0 | 9.3 | 6.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.4 | 27 / 35 | 5600 |
| 2 | 1 | 69.0 | 91.7 | 28 / 35 | 5371 |
| 3 | 1 | 69.0 | 91.4 | 28 / 35 | 5523 |
| 4 | 1 | 69.0 | 92.4 | 29 / 35 | 5401 |
| 5 | 1 | 70.3 | 96.5 | 32 / 35 | 5522 |
| 6 | 1 | 71.0 | 96.8 | 30 / 35 | 6135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 40 | 100% |
| EBBU.Sim2 1.02 | 32 | 100% |
| mb.Beast 0.1 | 28 | 100% |
| stelo.UntouchableNano 1.3 | 27 | 81% |
| agrach.Dalek 1.0 | 17 | 76% |
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 94% |
| skm.Ryubot 1.0 | 15 | 100% |
| lmk.ACPFinal 0.1 | 9 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 9 | 25% | 32 |
| stelo.UntouchableNano 1.3 | 7 | 19% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 14% | 26 |
| germ.TheMind .2 | 4 | 11% | 34 |
| mb.Beast 0.1 | 4 | 11% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 11% | 9 |
| lmk.ACPFinal 0.1 | 2 | 6% | 15 |
| EBBU.Sim2 1.02 | 1 | 3% | 28 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

## Melee bench: F38

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.6 | 93 / 210 | 2.66 | 16.6% | 24450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.3 | 16.6% | 93 |
| justin.Mallais 14.0 | 1.7 | 16.1% | 64 |
| bvh.mini.Freya 0.55 | 3.0 | 13.3% | 16 |
| bts.mega.Gnarly 1.4 | 4.8 | 11.0% | 20 |
| cs.Wren 1.0 | 5.0 | 10.5% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.5% | 7 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.0% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.2% | 2 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.4 | 17 / 35 | 4268 |
| 2 | 1 | 65.7 | 81.9 | 15 / 35 | 4080 |
| 3 | 2 | 64.4 | 77.1 | 13 / 35 | 4003 |
| 4 | 1 | 66.1 | 83.2 | 19 / 35 | 3959 |
| 5 | 1 | 66.0 | 83.5 | 14 / 35 | 4222 |
| 6 | 2 | 64.9 | 79.4 | 15 / 35 | 3918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 53 | 66% |
| bvh.mini.Freya 0.55 | 20 | 90% |
| cs.Wren 1.0 | 15 | 100% |
| bts.mega.Gnarly 1.4 | 13 | 69% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 100% |
| kdf.KoulDestroyer 1.0 | 6 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 118 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 37 | 31% | 74 |
| bvh.mini.Freya 0.55 | 26 | 22% | 38 |
| bts.mega.Gnarly 1.4 | 21 | 18% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 9% | 28 |
| cs.Wren 1.0 | 11 | 9% | 21 |
| kdf.KoulDestroyer 1.0 | 4 | 3% | 9 |
| matt.UnderDark3 2.4.34 | 3 | 3% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 3 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F39

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.0 | 93 / 210 | 2.44 | 17.4% | 27964 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 17.4% | 93 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 31 |
| az.Ololobot 0.2.4 | 3.2 | 12.9% | 56 |
| catcat20.Lambda 0.024 | 4.0 | 11.5% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 9.7% | 6 |
| gimp.GimpBot 0.1 | 6.5 | 8.1% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.7% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.5 | 7.5% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.8 | 15 / 35 | 4829 |
| 2 | 1 | 67.1 | 87.3 | 16 / 35 | 4642 |
| 3 | 1 | 66.5 | 84.4 | 14 / 35 | 4753 |
| 4 | 1 | 64.4 | 78.4 | 15 / 35 | 4313 |
| 5 | 1 | 67.5 | 86.3 | 19 / 35 | 4877 |
| 6 | 1 | 65.8 | 82.9 | 14 / 35 | 4550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 52 | 38% |
| catcat20.Lambda 0.024 | 32 | 78% |
| bvh.fry.Freya 0.82 | 30 | 80% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1063. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 42 | 36% | 64 |
| bvh.fry.Freya 0.82 | 36 | 31% | 52 |
| catcat20.Lambda 0.024 | 15 | 13% | 41 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 7% | 17 |
| gimp.GimpBot 0.1 | 7 | 6% | 14 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 9 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |

## Melee bench: F40

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.6 | 121 / 210 | 2.11 | 18.8% | 29234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 18.8% | 121 |
| kawigi.mini.Coriantumr 1.1 | 2.5 | 13.8% | 40 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 13.0% | 28 |
| mz.AntiGrav 1.0 | 4.3 | 11.0% | 5 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.2% | 6 |
| stelo.Randomness 1.0 | 5.7 | 9.5% | 7 |
| alpha.BlackIce 1.0 | 6.8 | 8.4% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.8% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.7% | 1 |
| sample.Corners 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.8 | 23 / 35 | 4803 |
| 2 | 1 | 69.4 | 90.2 | 20 / 35 | 5083 |
| 3 | 1 | 70.2 | 91.4 | 23 / 35 | 5292 |
| 4 | 1 | 68.7 | 87.9 | 22 / 35 | 4791 |
| 5 | 1 | 65.9 | 79.7 | 15 / 35 | 4702 |
| 6 | 1 | 67.6 | 85.7 | 18 / 35 | 4563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kano.gamma.KanoGamma 1.8 | 44 | 77% |
| kawigi.mini.Coriantumr 1.1 | 42 | 64% |
| mz.AntiGrav 1.0 | 20 | 95% |
| Polkwane.SmashMelee 1.0 | 18 | 94% |
| stelo.Randomness 1.0 | 15 | 93% |
| alpha.BlackIce 1.0 | 4 | 75% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 29 | 33% | 51 |
| kano.gamma.KanoGamma 1.8 | 24 | 27% | 66 |
| mz.AntiGrav 1.0 | 11 | 12% | 31 |
| Polkwane.SmashMelee 1.0 | 9 | 10% | 20 |
| stelo.Randomness 1.0 | 6 | 7% | 21 |
| amk.superstrike.SuperStrike 0.3 | 5 | 6% | 6 |
| alpha.BlackIce 1.0 | 4 | 4% | 7 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 6 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.3 | 108 / 210 | 2.23 | 17.7% | 25379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.2 | 17.7% | 108 |
| eem.EvBotNG v12.8 | 1.8 | 15.7% | 64 |
| ary.Swarm 1.1 | 3.3 | 12.7% | 12 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.6% | 16 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.3% | 9 |
| shrub.Silver v048 | 6.2 | 8.2% | 0 |
| zyx.nano.Ant 1.1 | 6.8 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.9% | 2 |
| stelo.Mirror 1.1 | 8.5 | 5.7% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.4 | 26 / 35 | 4640 |
| 2 | 1 | 67.5 | 87.3 | 16 / 35 | 4241 |
| 3 | 2 | 65.5 | 80.3 | 14 / 35 | 4173 |
| 4 | 1 | 68.0 | 88.3 | 20 / 35 | 4241 |
| 5 | 1 | 66.5 | 85.1 | 14 / 35 | 4034 |
| 6 | 1 | 67.1 | 84.4 | 18 / 35 | 4050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 65 | 52% |
| ary.Swarm 1.1 | 35 | 83% |
| lessonz.robocode.Oz 0.5.0 | 26 | 92% |
| simonton.nano.MeleeSeed 1.8 | 18 | 89% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| shrub.Silver v048 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 44 | 43% | 82 |
| lessonz.robocode.Oz 0.5.0 | 21 | 20% | 35 |
| ary.Swarm 1.1 | 17 | 17% | 44 |
| simonton.nano.MeleeSeed 1.8 | 9 | 9% | 26 |
| jsal.Jsalbot 1.0 | 3 | 3% | 8 |
| shrub.Silver v048 | 3 | 3% | 7 |
| stelo.Mirror 1.1 | 3 | 3% | 5 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.6 | 102 / 210 | 2.30 | 17.9% | 29842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.2 | 17.9% | 102 |
| wompi.Wallaby 5.1 | 1.8 | 15.6% | 58 |
| ara.Shera 0.88 | 3.3 | 13.8% | 32 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.6% | 13 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 1 |
| maribo.IotaCT 1.1 | 6.3 | 7.2% | 0 |
| dsw.StaticD 1.0 | 6.7 | 7.0% | 3 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.5% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.7 | 17 / 35 | 5092 |
| 2 | 1 | 68.3 | 88.3 | 18 / 35 | 5022 |
| 3 | 1 | 67.3 | 84.4 | 15 / 35 | 5006 |
| 4 | 1 | 69.1 | 87.6 | 19 / 35 | 5570 |
| 5 | 2 | 64.9 | 78.7 | 14 / 35 | 4308 |
| 6 | 1 | 68.1 | 87.6 | 19 / 35 | 4844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 43 | 70% |
| ara.Shera 0.88 | 42 | 71% |
| maribo.mini.MiniQuester 0.1 | 37 | 92% |
| dsw.StaticD 1.0 | 7 | 71% |
| amz.NanoClone 1.41 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 44 | 41% | 74 |
| wompi.Wallaby 5.1 | 33 | 31% | 67 |
| maribo.mini.MiniQuester 0.1 | 23 | 21% | 56 |
| dsw.StaticD 1.0 | 4 | 4% | 7 |
| amz.NanoClone 1.41 | 3 | 3% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 76.5 | 32 / 210 | 3.12 | 14.8% | 22129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.1% | 146 |
| hadur117.mini.DeiseSHARP 0.4 | 2.2 | 14.8% | 32 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.8% | 21 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.0% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 5.3 | 10.7% | 0 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.6% | 4 |
| mz.NanoGod 2.02 | 7.2 | 7.4% | 0 |
| jab.DiamondStealer 5 | 7.8 | 6.9% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 80.0 | 5 / 35 | 3710 |
| 2 | 2 | 64.5 | 76.5 | 7 / 35 | 3759 |
| 3 | 2 | 64.3 | 77.1 | 4 / 35 | 3681 |
| 4 | 2 | 63.3 | 73.3 | 5 / 35 | 3727 |
| 5 | 2 | 65.7 | 81.3 | 6 / 35 | 3814 |
| 6 | 3 | 62.2 | 70.5 | 5 / 35 | 3438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 82 | 22% |
| brainfade.melee.Dusk 0.44 | 11 | 45% |
| dummy.micro.Sparrow 2.5 | 8 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 94 | 53% | 112 |
| brainfade.melee.Dusk 0.44 | 32 | 18% | 37 |
| dummy.micro.Sparrow 2.5 | 23 | 13% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 16 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 6 |
| jab.DiamondStealer 5 | 6 | 3% | 6 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |

## Melee bench: F44

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.8 | 130 / 210 | 1.83 | 19.5% | 30316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 19.5% | 130 |
| stelo.Liblix 0.3.1 | 2.2 | 15.4% | 43 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.3% | 23 |
| wompi.Quokka 1.6 | 4.0 | 10.4% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 8.8% | 0 |
| jwirde.Gort 2.0 | 6.0 | 8.3% | 1 |
| disan.Chair 2.2.0 | 7.2 | 7.7% | 2 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.5% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.1 | 19 / 35 | 5337 |
| 2 | 1 | 69.4 | 90.8 | 22 / 35 | 4945 |
| 3 | 1 | 69.3 | 92.1 | 19 / 35 | 4782 |
| 4 | 1 | 71.2 | 93.0 | 27 / 35 | 5313 |
| 5 | 1 | 69.0 | 88.3 | 23 / 35 | 4722 |
| 6 | 1 | 69.4 | 88.6 | 20 / 35 | 5217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 76% |
| tzu.TheArtOfWar 1.2 | 59 | 76% |
| wompi.Quokka 1.6 | 13 | 62% |
| jwirde.Gort 2.0 | 6 | 100% |
| disan.Chair 2.2.0 | 3 | 67% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 50% |

Hadur died in 81 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 32 | 40% | 95 |
| tzu.TheArtOfWar 1.2 | 30 | 37% | 70 |
| wompi.Quokka 1.6 | 10 | 12% | 17 |
| stf.PanzerGeneral 0.1 | 3 | 4% | 6 |
| jwirde.Gort 2.0 | 2 | 2% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| disan.Chair 2.2.0 | 1 | 1% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.9 | 87 / 210 | 2.00 | 20.0% | 36808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSHARP 0.4 | 1.0 | 20.0% | 87 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.1% | 112 |
| jje.BagPuss 1.2 | 3.3 | 11.2% | 2 |
| sul.Lunar 1.1 | 4.5 | 10.6% | 4 |
| myl.nano.Graviton 1.10 | 4.8 | 9.9% | 3 |
| hvilela.HVilela 0.9 | 6.7 | 8.3% | 1 |
| fm.claire 1.7 | 6.7 | 8.4% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.3% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.7% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.9 | 16 / 35 | 5936 |
| 2 | 1 | 69.2 | 87.0 | 14 / 35 | 6063 |
| 3 | 1 | 70.0 | 90.5 | 15 / 35 | 5928 |
| 4 | 1 | 69.1 | 86.3 | 13 / 35 | 6117 |
| 5 | 1 | 70.8 | 91.7 | 16 / 35 | 6427 |
| 6 | 1 | 70.3 | 90.2 | 13 / 35 | 6337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 110 | 22% |
| sul.Lunar 1.1 | 26 | 92% |
| myl.nano.Graviton 1.10 | 14 | 86% |
| jje.BagPuss 1.2 | 13 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| wit.Deep7 2.0 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 2435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 86 | 70% | 0 |
| myl.nano.Graviton 1.10 | 13 | 11% | 39 |
| jje.BagPuss 1.2 | 10 | 8% | 47 |
| sul.Lunar 1.1 | 8 | 7% | 66 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 19 |
| hvilela.HVilela 0.9 | 2 | 2% | 12 |
| fm.claire 1.7 | 2 | 2% | 9 |
| wit.Deep7 2.0 | 0 | 0% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 8 |

## Melee bench: F46

hadur117.mini.DeiseSHARP 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.5 | 66 / 210 | 2.66 | 16.1% | 24678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.9% | 76 |
| kc.mini.Mirage 0.2 | 2.0 | 16.6% | 54 |
| hadur117.mini.DeiseSHARP 0.4 | 2.0 | 16.1% | 66 |
| mz.MicroSheep 1.0 | 4.2 | 11.1% | 4 |
| cx.Princess 1.0 | 4.8 | 10.3% | 10 |
| sadoner.killer 0.2 | 6.0 | 8.6% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 6.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.3 | 79.4 | 11 / 35 | 4339 |
| 2 | 1 | 66.1 | 83.2 | 12 / 35 | 4195 |
| 3 | 2 | 66.1 | 83.2 | 14 / 35 | 4126 |
| 4 | 3 | 63.4 | 78.1 | 6 / 35 | 3706 |
| 5 | 1 | 66.5 | 85.7 | 15 / 35 | 4004 |
| 6 | 2 | 65.0 | 79.7 | 8 / 35 | 4308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 54% |
| rsalesc.melee.Medina 0.4.5 | 49 | 51% |
| cx.Princess 1.0 | 11 | 64% |
| mz.MicroSheep 1.0 | 7 | 86% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 61 | 42% | 89 |
| rsalesc.melee.Medina 0.4.5 | 52 | 36% | 79 |
| mz.MicroSheep 1.0 | 15 | 10% | 20 |
| cx.Princess 1.0 | 8 | 6% | 12 |
| sadoner.killer 0.2 | 5 | 3% | 6 |
| arthord.NanoSatanMelee Beta | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |

