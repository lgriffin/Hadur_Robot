# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 74.4 | 31 / 210 | 3.30 | 15.2% | 28581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 146 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.2% | 31 |
| sgp.JollyNinja 3.53 | 4.0 | 11.0% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.2% | 3 |
| mz.MicroGodMelee 1 | 4.8 | 10.6% | 10 |
| lorneswork.Predator 1.0 | 5.0 | 10.1% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.8% | 1 |
| skm.butterfly 1.0 | 8.7 | 5.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 72.7 | 6 / 35 | 4682 |
| 2 | 2 | 65.1 | 78.4 | 6 / 35 | 4931 |
| 3 | 2 | 62.6 | 72.7 | 6 / 35 | 4209 |
| 4 | 2 | 64.6 | 77.1 | 4 / 35 | 4920 |
| 5 | 2 | 64.0 | 74.3 | 5 / 35 | 4936 |
| 6 | 2 | 63.0 | 71.4 | 4 / 35 | 4903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 83 | 6% |
| mz.MicroGodMelee 1 | 13 | 62% |
| sgp.JollyNinja 3.53 | 11 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 67% |
| lorneswork.Predator 1.0 | 4 | 75% |
| skm.butterfly 1.0 | 3 | 67% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |

Hadur died in 179 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 103 | 58% | 111 |
| mz.MicroGodMelee 1 | 18 | 10% | 25 |
| sgp.JollyNinja 3.53 | 15 | 8% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 8% | 20 |
| lorneswork.Predator 1.0 | 11 | 6% | 17 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 3% | 4 |
| skm.butterfly 1.0 | 5 | 3% | 6 |
| adt.Ar2 1.0 | 4 | 2% | 4 |
| mym.EdgeStalker 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.1 | 74 / 210 | 2.88 | 17.4% | 31424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 74 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.6% | 59 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 12.7% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.7% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.6% | 15 |
| fnc.bandit.Bandit 5.2.0 | 5.7 | 8.9% | 2 |
| Noran.BitchingElk 0.054 | 7.7 | 7.4% | 9 |
| sch.Simone 0.3d | 7.7 | 7.6% | 7 |
| stelo.PatternRobot 1.0 | 8.7 | 6.3% | 5 |
| fullsail.SweetTea 1.1 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.0 | 15 / 35 | 5562 |
| 2 | 1 | 64.7 | 74.9 | 8 / 35 | 5344 |
| 3 | 1 | 65.4 | 76.8 | 12 / 35 | 4972 |
| 4 | 1 | 66.2 | 78.1 | 13 / 35 | 5211 |
| 5 | 1 | 68.2 | 85.7 | 12 / 35 | 5337 |
| 6 | 1 | 64.6 | 73.0 | 14 / 35 | 4998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 47 | 38% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 34 | 53% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 54% |
| Noran.BitchingElk 0.054 | 11 | 73% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| stelo.PatternRobot 1.0 | 7 | 71% |
| sch.Simone 0.3d | 7 | 71% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 39% | 69 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 33 | 24% | 50 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 11% | 21 |
| fnc.bandit.Bandit 5.2.0 | 9 | 7% | 13 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 6% | 15 |
| sch.Simone 0.3d | 6 | 4% | 15 |
| stelo.PatternRobot 1.0 | 5 | 4% | 12 |
| Noran.BitchingElk 0.054 | 4 | 3% | 10 |
| fullsail.SweetTea 1.1 | 3 | 2% | 5 |

## Melee bench: F03

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 79.9 | 117 / 210 | 2.81 | 18.0% | 34172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.0% | 117 |
| radnor.DoctorBob 1.42 | 2.3 | 14.2% | 36 |
| vuen.Cake 2.51 | 3.2 | 12.3% | 28 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.1% | 25 |
| urdos.URDOS 1.3 | 5.0 | 10.1% | 2 |
| adt.Ar1 2.1 | 6.5 | 8.0% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 7.1% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.5 | 25 / 35 | 6593 |
| 2 | 1 | 67.0 | 79.0 | 21 / 35 | 5726 |
| 3 | 1 | 67.0 | 78.4 | 17 / 35 | 5746 |
| 4 | 1 | 67.3 | 81.0 | 19 / 35 | 5529 |
| 5 | 1 | 67.0 | 80.0 | 18 / 35 | 5370 |
| 6 | 1 | 64.4 | 70.5 | 17 / 35 | 5208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 46 | 85% |
| radnor.DoctorBob 1.42 | 42 | 81% |
| kawigi.nano.Lib 1.0 | 37 | 81% |
| oa.weak.FlyMk1 0.1 | 8 | 75% |
| urdos.URDOS 1.3 | 3 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 30% | 63 |
| kawigi.nano.Lib 1.0 | 20 | 22% | 50 |
| vuen.Cake 2.51 | 12 | 13% | 48 |
| urdos.URDOS 1.3 | 10 | 11% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 10% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 6 | 6% | 9 |
| adt.Ar1 2.1 | 4 | 4% | 8 |
| oa.weak.FlyMk1 0.1 | 4 | 4% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.3 | 8 / 210 | 3.40 | 15.3% | 31826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.0% | 196 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.3% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 0 |
| josago.Jorgito 0.16 | 5.0 | 9.0% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.5% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.2% | 0 |
| spin.Bugstard 0.012b | 9.0 | 4.3% | 0 |
| sp.Nanos.Ember 1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 72.7 | 1 / 35 | 5103 |
| 2 | 2 | 65.7 | 76.2 | 2 / 35 | 5479 |
| 3 | 2 | 64.7 | 73.0 | 0 / 35 | 5183 |
| 4 | 2 | 65.3 | 72.4 | 2 / 35 | 5592 |
| 5 | 2 | 64.2 | 70.8 | 1 / 35 | 5376 |
| 6 | 2 | 64.9 | 74.6 | 2 / 35 | 5093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 71 | 3% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| sp.Nanos.Ember 1.1 | 2 | 100% |
| josago.Jorgito 0.16 | 2 | 50% |
| spin.Bugstard 0.012b | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 154 | 76% | 158 |
| apc.LeeroyJenkins2 1.0 | 16 | 8% | 19 |
| josago.Jorgito 0.16 | 11 | 5% | 11 |
| css.Delitioner 0.11 | 6 | 3% | 5 |
| tj.zombie1n 1.0.1 | 5 | 2% | 5 |
| TNT.TNT 0.99.1 | 5 | 2% | 5 |
| rampancy.Durandal 2.1d | 4 | 2% | 5 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 2 |

## Melee bench: F05

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 59.7 | 6 / 210 | 4.62 | 12.4% | 24312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.5 | 17.0% | 68 |
| cb.fire.Firestarter 2.0f | 1.5 | 18.0% | 115 |
| wompi.Numbat 2.1 | 3.5 | 12.7% | 14 |
| hadur117.micro.Saor 0.2 | 3.5 | 12.4% | 6 |
| ms.Ares 0.19 | 5.5 | 9.3% | 1 |
| axeBots.HataMoto 3.09 | 5.5 | 9.2% | 6 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.3 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 57.8 | 3 / 35 | 3885 |
| 2 | 3 | 59.9 | 64.8 | 1 / 35 | 3950 |
| 3 | 4 | 56.2 | 52.1 | 0 / 35 | 4039 |
| 4 | 3 | 58.2 | 56.8 | 0 / 35 | 4500 |
| 5 | 4 | 59.9 | 63.8 | 1 / 35 | 4115 |
| 6 | 3 | 59.2 | 63.2 | 1 / 35 | 3823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 27 | 7% |
| justin.DemonicRage 3.4 | 18 | 6% |
| wompi.Numbat 2.1 | 4 | 75% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 204 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 64 | 31% | 65 |
| cb.fire.Firestarter 2.0f | 63 | 31% | 64 |
| wompi.Numbat 2.1 | 27 | 13% | 30 |
| ms.Ares 0.19 | 17 | 8% | 17 |
| supersample.SuperBoxBot 1.0 | 12 | 6% | 12 |
| axeBots.HataMoto 3.09 | 10 | 5% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 6 | 3% | 6 |
| GarmBox.Oranges 1.0 | 4 | 2% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 78.5 | 101 / 210 | 2.93 | 16.9% | 27091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.9% | 101 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 37 |
| origin.SleepSiphon 1.7b | 3.3 | 12.8% | 42 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 15 |
| mld.Wisdom 1.0 | 4.8 | 11.1% | 5 |
| gg.Wolverine 2.0 | 6.3 | 8.4% | 5 |
| spinnercat.Omen 1.0 | 7.0 | 7.4% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.6% | 5 |
| DBall.NUKE 0.1 | 8.7 | 6.3% | 1 |
| sample.Fire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.5 | 20 / 35 | 4626 |
| 2 | 1 | 66.1 | 79.7 | 16 / 35 | 4719 |
| 3 | 1 | 68.0 | 85.4 | 19 / 35 | 4611 |
| 4 | 1 | 63.9 | 71.4 | 16 / 35 | 4138 |
| 5 | 1 | 64.9 | 76.8 | 15 / 35 | 4375 |
| 6 | 1 | 64.9 | 75.2 | 15 / 35 | 4622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 47 | 89% |
| origin.SleepSiphon 1.7b | 36 | 58% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 74% |
| gg.Wolverine 2.0 | 6 | 50% |
| mld.Wisdom 1.0 | 5 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 80% |
| DBall.NUKE 0.1 | 5 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 33 | 30% | 55 |
| mld.Wisdom 1.0 | 25 | 23% | 31 |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 21% | 50 |
| jekl.StoneGhost 0.7 | 14 | 13% | 46 |
| gg.Wolverine 2.0 | 8 | 7% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 7 |
| DBall.NUKE 0.1 | 1 | 1% | 4 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |
| sample.Fire 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 82.5 | 71 / 210 | 2.58 | 18.2% | 35588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.3 | 18.4% | 65 |
| hadur117.micro.Saor 0.2 | 1.7 | 18.2% | 71 |
| rtk.Tachikoma 1.0 | 3.0 | 15.6% | 51 |
| franzor.Lizt 1.3.1 | 4.3 | 11.0% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| drd.Dreadknoght 0.9 | 9.3 | 2.6% | 0 |
| sample.Target 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 83.2 | 12 / 35 | 5966 |
| 2 | 2 | 68.1 | 82.2 | 10 / 35 | 5517 |
| 3 | 2 | 67.9 | 80.3 | 12 / 35 | 5784 |
| 4 | 1 | 71.2 | 89.2 | 15 / 35 | 6070 |
| 5 | 2 | 69.5 | 81.0 | 11 / 35 | 6353 |
| 6 | 2 | 68.3 | 79.0 | 11 / 35 | 5898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 62 | 56% |
| rsalesc.melee.Monk 0.3.6c | 41 | 17% |
| oog.melee.CapuletDroid 1.1 | 23 | 87% |
| franzor.Lizt 1.3.1 | 13 | 62% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |

Hadur died in 140 of 210 rounds, at a mean tick of 1159. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 68 | 49% | 93 |
| rtk.Tachikoma 1.0 | 43 | 31% | 84 |
| oog.melee.CapuletDroid 1.1 | 13 | 9% | 19 |
| franzor.Lizt 1.3.1 | 6 | 4% | 1 |
| exauge.GateKeeper 1.1.121g | 4 | 3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 4 | 3% | 5 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 74.9 | 87 / 210 | 3.26 | 17.1% | 32406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.1% | 87 |
| tm.Yuugao 1.0 | 2.2 | 13.6% | 53 |
| shrub.Vapour v159 | 3.0 | 11.6% | 26 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.6% | 18 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.5% | 13 |
| m3thos.Eva00 1.1 | 6.2 | 9.0% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.4% | 4 |
| qualidafial.MajorDick 1.0.1 | 7.7 | 7.5% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 6.4% | 1 |
| SHAM.WOW 1.4 | 9.5 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 66.3 | 15 / 35 | 4662 |
| 2 | 1 | 66.3 | 78.4 | 18 / 35 | 5183 |
| 3 | 1 | 64.3 | 70.8 | 12 / 35 | 5278 |
| 4 | 1 | 64.4 | 71.4 | 14 / 35 | 5285 |
| 5 | 1 | 66.7 | 75.6 | 15 / 35 | 5898 |
| 6 | 1 | 68.8 | 87.0 | 13 / 35 | 6100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 44 | 41% |
| shrub.Vapour v159 | 32 | 78% |
| Krabb.sliNk.Garm 0.9u | 21 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 13 | 85% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| SHAM.WOW 1.4 | 2 | 100% |
| m3thos.Eva00 1.1 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 45 | 36% | 71 |
| Krabb.sliNk.Garm 0.9u | 24 | 19% | 32 |
| zyx.nano.BacillusComma 1.0 | 13 | 10% | 15 |
| shrub.Vapour v159 | 12 | 10% | 31 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 6% | 20 |
| qualidafial.MajorDick 1.0.1 | 8 | 6% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 5% | 18 |
| m3thos.Eva00 1.1 | 5 | 4% | 8 |
| SHAM.WOW 1.4 | 2 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 61.7 | 27 / 210 | 4.44 | 13.0% | 23120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.0% | 100 |
| kc.micro.Figment 1.0 | 2.3 | 13.6% | 40 |
| hadur117.micro.Saor 0.2 | 2.8 | 13.0% | 27 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.5% | 16 |
| yagami.Tidus 0.11 | 4.8 | 10.5% | 3 |
| mc2.enemy.Original 0.9 | 5.5 | 9.8% | 19 |
| dft.Calliope 5.6 | 7.0 | 8.2% | 4 |
| step.nanoPri 1.0 | 8.2 | 6.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.8% | 0 |
| rdm.Dueler 0.4x | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.2 | 58.7 | 6 / 35 | 3616 |
| 2 | 3 | 58.5 | 61.6 | 5 / 35 | 3579 |
| 3 | 2 | 62.3 | 72.1 | 5 / 35 | 4147 |
| 4 | 4 | 56.3 | 56.8 | 0 / 35 | 3727 |
| 5 | 3 | 58.3 | 58.7 | 5 / 35 | 4135 |
| 6 | 3 | 59.2 | 62.5 | 6 / 35 | 3916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 28 | 46% |
| positive.Portia 1.26e | 28 | 11% |
| mc2.enemy.Original 0.9 | 10 | 30% |
| yagami.Tidus 0.11 | 5 | 100% |
| pedersen.Grishnakh 1.0 | 3 | 67% |
| dft.Calliope 5.6 | 1 | 100% |
| rdm.Dueler 0.4x | 1 | 0% |

Hadur died in 183 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 36% | 70 |
| kc.micro.Figment 1.0 | 61 | 33% | 75 |
| yagami.Tidus 0.11 | 16 | 9% | 20 |
| mc2.enemy.Original 0.9 | 12 | 7% | 15 |
| pedersen.Grishnakh 1.0 | 8 | 4% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6 | 3% | 6 |
| step.nanoPri 1.0 | 5 | 3% | 5 |
| rdm.Dueler 0.4x | 5 | 3% | 4 |
| dft.Calliope 5.6 | 4 | 2% | 5 |

## Melee bench: F10

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.8 | 106 / 210 | 2.37 | 18.2% | 32889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.2% | 106 |
| DTF.Kludgy 1.2b | 2.0 | 15.1% | 54 |
| ne.Chimera 1.2 | 3.5 | 12.5% | 6 |
| ejb.Polaris 1.0.1 | 4.3 | 11.7% | 18 |
| vStar.RAFzilla 2.15 | 4.7 | 11.4% | 13 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.1% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.7 | 5.9% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.6% | 3 |
| donjezza.Muncho 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.7 | 22 / 35 | 5360 |
| 2 | 1 | 68.4 | 83.2 | 18 / 35 | 5666 |
| 3 | 1 | 69.8 | 89.8 | 21 / 35 | 5767 |
| 4 | 1 | 66.9 | 82.2 | 14 / 35 | 5438 |
| 5 | 1 | 66.4 | 79.4 | 14 / 35 | 5399 |
| 6 | 1 | 67.7 | 87.3 | 17 / 35 | 5259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 46 | 41% |
| ejb.Polaris 1.0.1 | 38 | 71% |
| ne.Chimera 1.2 | 26 | 92% |
| vStar.RAFzilla 2.15 | 26 | 85% |
| tvv.micro.Antares 1.1.1 | 10 | 90% |
| donjezza.Muncho 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 67% |

Hadur died in 104 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 62 | 60% | 81 |
| ejb.Polaris 1.0.1 | 13 | 13% | 43 |
| ne.Chimera 1.2 | 13 | 13% | 35 |
| vStar.RAFzilla 2.15 | 6 | 6% | 26 |
| tvv.micro.Antares 1.1.1 | 4 | 4% | 10 |
| kurios.DOSexe .9b | 2 | 2% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 2% | 2 |
| donjezza.Muncho 1.0 | 1 | 1% | 4 |
| sam.Samspin 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 75.8 | 57 / 210 | 3.18 | 15.9% | 26947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.1% | 93 |
| hadur117.micro.Saor 0.2 | 1.7 | 15.9% | 57 |
| cx.mini.Nimrod 0.55 | 3.2 | 11.3% | 17 |
| djc.DynaBot 0.1.1 | 4.0 | 10.4% | 13 |
| rdt199.Warlord 0.73 | 5.2 | 9.7% | 16 |
| br2.MobyDickBot 1.6 | 6.2 | 8.7% | 10 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.9% | 1 |
| uji.YellohFellah 1.0 | 7.3 | 7.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.9% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 77.5 | 8 / 35 | 4539 |
| 2 | 2 | 62.8 | 72.4 | 8 / 35 | 4399 |
| 3 | 1 | 66.1 | 81.3 | 15 / 35 | 4503 |
| 4 | 2 | 62.7 | 72.4 | 6 / 35 | 4223 |
| 5 | 1 | 62.6 | 69.5 | 13 / 35 | 4475 |
| 6 | 2 | 65.8 | 81.6 | 7 / 35 | 4808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 56 | 23% |
| cx.mini.Nimrod 0.55 | 20 | 85% |
| djc.DynaBot 0.1.1 | 15 | 60% |
| rdt199.Warlord 0.73 | 11 | 55% |
| uji.YellohFellah 1.0 | 8 | 63% |
| br2.MobyDickBot 1.6 | 6 | 83% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 75 | 49% | 88 |
| cx.mini.Nimrod 0.55 | 24 | 16% | 41 |
| rdt199.Warlord 0.73 | 15 | 10% | 20 |
| KiraNL.Chupacabra 0.4 | 12 | 8% | 13 |
| djc.DynaBot 0.1.1 | 9 | 6% | 13 |
| stelo.MirrorNano 1.3 | 6 | 4% | 6 |
| uji.YellohFellah 1.0 | 5 | 3% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 3% | 6 |
| br2.MobyDickBot 1.6 | 3 | 2% | 12 |

## Melee bench: F12

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.0 | 88 / 210 | 2.98 | 16.5% | 24400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.5% | 88 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.4% | 36 |
| nat.PallasHawk 1.0 | 3.0 | 13.3% | 44 |
| darkcanuck.Leon 1.01 | 3.3 | 12.8% | 20 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.7% | 13 |
| jrm.Test0 1.0 | 6.8 | 7.6% | 1 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.0% | 1 |
| jp.Perpy 16.0 | 7.5 | 7.1% | 3 |
| jaybot.bots.Oddball 4.0 | 9.0 | 6.2% | 4 |
| stuff.Vlad 0.1 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 75.6 | 13 / 35 | 4188 |
| 2 | 1 | 65.1 | 79.4 | 15 / 35 | 4017 |
| 3 | 1 | 66.7 | 82.9 | 19 / 35 | 4104 |
| 4 | 1 | 65.2 | 76.5 | 17 / 35 | 4047 |
| 5 | 1 | 63.7 | 74.0 | 13 / 35 | 4039 |
| 6 | 1 | 64.7 | 79.7 | 11 / 35 | 4005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 40 | 83% |
| nat.PallasHawk 1.0 | 38 | 53% |
| bts.wiki.RipCurl 0.9b | 32 | 72% |
| brainfade.melee.Genghis 0.36 | 13 | 62% |
| jaybot.bots.Oddball 4.0 | 3 | 33% |
| cs.sheldor.Talon 1.1 | 2 | 50% |
| jrm.Test0 1.0 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 36 | 29% | 52 |
| nat.PallasHawk 1.0 | 32 | 26% | 51 |
| darkcanuck.Leon 1.01 | 18 | 15% | 61 |
| brainfade.melee.Genghis 0.36 | 14 | 11% | 16 |
| cs.sheldor.Talon 1.1 | 7 | 6% | 8 |
| jp.Perpy 16.0 | 6 | 5% | 5 |
| jrm.Test0 1.0 | 5 | 4% | 8 |
| jaybot.bots.Oddball 4.0 | 4 | 3% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 66.6 | 9 / 210 | 4.00 | 13.3% | 25119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.1% | 60 |
| mn.Combat 3.25.0 | 1.5 | 17.2% | 108 |
| hadur117.micro.Saor 0.2 | 3.0 | 13.3% | 9 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 19 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.7% | 12 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.1% | 2 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 74.6 | 3 / 35 | 4112 |
| 2 | 3 | 58.5 | 61.0 | 0 / 35 | 3855 |
| 3 | 3 | 60.0 | 64.4 | 2 / 35 | 4093 |
| 4 | 3 | 61.4 | 67.6 | 3 / 35 | 4463 |
| 5 | 3 | 58.9 | 62.9 | 0 / 35 | 4143 |
| 6 | 3 | 62.0 | 69.2 | 1 / 35 | 4453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 24 | 17% |
| ags.Glacier 0.2.11 | 23 | 13% |
| gh.micro.Gruweltje 0.7 | 5 | 0% |
| shinh.Entangled 0.3 | 5 | 20% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 201 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 69 | 34% | 72 |
| mn.Combat 3.25.0 | 65 | 32% | 69 |
| shinh.Entangled 0.3 | 21 | 10% | 22 |
| gh.micro.Gruweltje 0.7 | 19 | 9% | 18 |
| stelo.Wang 1.0 | 11 | 5% | 11 |
| apc.Colossus2 0.17 | 6 | 3% | 8 |
| maribo.FollowFire 1 | 6 | 3% | 6 |
| ayk.WallHugger 1.0 | 4 | 2% | 4 |

## Melee bench: F14

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 73.1 | 119 / 210 | 3.42 | 16.7% | 30173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 16.7% | 119 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.0% | 32 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 32 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.2% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.9% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.8% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 6.2 | 9.5% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.4% | 15 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 64.1 | 14 / 35 | 4705 |
| 2 | 1 | 66.9 | 79.0 | 21 / 35 | 5257 |
| 3 | 1 | 65.8 | 72.7 | 24 / 35 | 4850 |
| 4 | 1 | 66.6 | 74.0 | 21 / 35 | 5417 |
| 5 | 1 | 67.5 | 81.0 | 19 / 35 | 5240 |
| 6 | 1 | 63.7 | 67.9 | 20 / 35 | 4704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 88% |
| catcat20.shape.Theta 0.018 | 40 | 68% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 45% | 102 |
| catcat20.shape.Theta 0.018 | 21 | 23% | 38 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 11% | 13 |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 8% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 5% | 15 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 3% | 19 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 3% | 3 |
| pa.Improved 1.0 | 1 | 1% | 1 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.0 | 121 / 210 | 2.26 | 19.6% | 35451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.6% | 121 |
| emp.Yngwie 1.11 | 2.7 | 13.0% | 47 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.3% | 13 |
| mld.DustBunny 3.8 | 3.5 | 12.4% | 5 |
| kawigi.robot.Girl 1.2 | 5.3 | 9.2% | 12 |
| cb.nano.Insomnia 1.0 | 6.0 | 8.5% | 7 |
| Grystrion.TrackerWO 1.0 | 7.3 | 7.0% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 5.1% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.5 | 24 / 35 | 5867 |
| 2 | 1 | 69.4 | 84.4 | 18 / 35 | 6060 |
| 3 | 1 | 71.0 | 91.7 | 26 / 35 | 5727 |
| 4 | 1 | 68.1 | 79.0 | 17 / 35 | 5943 |
| 5 | 1 | 69.5 | 84.4 | 19 / 35 | 6111 |
| 6 | 1 | 68.8 | 86.0 | 17 / 35 | 5743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 53 | 49% |
| kawigi.micro.Shiz 1.1 | 38 | 100% |
| mld.DustBunny 3.8 | 32 | 94% |
| kawigi.robot.Girl 1.2 | 17 | 76% |
| cb.nano.Insomnia 1.0 | 9 | 89% |
| divineomega.TrialBot 0.003 | 6 | 67% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1063. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 45 | 50% | 87 |
| cb.nano.Insomnia 1.0 | 11 | 12% | 10 |
| mld.DustBunny 3.8 | 9 | 10% | 32 |
| kawigi.robot.Girl 1.2 | 8 | 9% | 16 |
| kawigi.micro.Shiz 1.1 | 6 | 7% | 35 |
| divineomega.TrialBot 0.003 | 4 | 4% | 13 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 6 |
| lambdaxy.TBot 0.1 | 2 | 2% | 4 |

## Melee bench: F16

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.5 | 77 / 210 | 2.67 | 18.2% | 34664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.2% | 77 |
| gh.Griezel 0.5.2 | 2.0 | 16.8% | 86 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.6% | 33 |
| tvv.nano.Polaris 1.2 | 5.3 | 8.8% | 5 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 8.8% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.2% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 5.1% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.4% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.9 | 12 / 35 | 5422 |
| 2 | 1 | 68.8 | 83.2 | 15 / 35 | 6094 |
| 3 | 1 | 68.0 | 82.2 | 12 / 35 | 5558 |
| 4 | 1 | 66.3 | 77.5 | 9 / 35 | 5501 |
| 5 | 1 | 68.8 | 84.8 | 12 / 35 | 6122 |
| 6 | 1 | 68.0 | 78.4 | 17 / 35 | 5967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 67 | 12% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 100% |
| techdude.forest.FlamingForest 1.1 | 24 | 46% |
| tvv.nano.Polaris 1.2 | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 1394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 73 | 55% | 94 |
| techdude.forest.FlamingForest 1.1 | 17 | 13% | 25 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 10% | 42 |
| bvh.fnr.Fenrir 0.36l | 12 | 9% | 16 |
| stelo.IntrinsicVolatility 1.4 | 8 | 6% | 12 |
| asd.Cthulhu 1.3 | 5 | 4% | 6 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 9 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |

## Melee bench: F17

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.2 | 96 / 210 | 2.78 | 17.6% | 29439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.6% | 96 |
| et.Predator 1.8 | 2.7 | 12.8% | 19 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.3% | 25 |
| cx.BlestPain 1.41 | 3.8 | 12.1% | 49 |
| ahf.NanoAndrew .4 | 5.2 | 10.6% | 10 |
| nic.Nicator 2.4 | 5.3 | 10.7% | 10 |
| maribo.melee.BMV 0.1 | 7.0 | 8.8% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.3% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.2 | 13 / 35 | 4892 |
| 2 | 1 | 68.4 | 86.3 | 16 / 35 | 5274 |
| 3 | 1 | 66.2 | 80.3 | 14 / 35 | 4734 |
| 4 | 1 | 63.4 | 69.2 | 12 / 35 | 4615 |
| 5 | 1 | 67.4 | 79.7 | 21 / 35 | 4853 |
| 6 | 1 | 68.4 | 82.5 | 20 / 35 | 5071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 45 | 80% |
| cx.BlestPain 1.41 | 36 | 19% |
| oog.melee.Mercutio 1.0 | 31 | 77% |
| nic.Nicator 2.4 | 26 | 81% |
| ahf.NanoAndrew .4 | 9 | 33% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| tex.Longbot 0.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 33 | 29% | 42 |
| oog.melee.Mercutio 1.0 | 19 | 17% | 37 |
| et.Predator 1.8 | 17 | 15% | 50 |
| ahf.NanoAndrew .4 | 17 | 15% | 22 |
| nic.Nicator 2.4 | 13 | 11% | 39 |
| maribo.melee.BMV 0.1 | 6 | 5% | 8 |
| tex.Longbot 0.4 | 4 | 4% | 4 |
| goblin.Bender 2.4 | 4 | 4% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |

## Melee bench: F18

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.3 | 118 / 210 | 2.59 | 17.9% | 27668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 118 |
| morbid.MorbidPriest 1.0 | 2.3 | 12.6% | 27 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.3% | 27 |
| uji.DBH 1.1 | 4.7 | 10.5% | 14 |
| ratosh.Nobo 0.21 | 5.0 | 10.2% | 1 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.3% | 7 |
| sigterm.Sigterm 1.0 | 7.3 | 8.3% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.7% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.3% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 74.3 | 19 / 35 | 4289 |
| 2 | 1 | 66.3 | 78.7 | 18 / 35 | 4755 |
| 3 | 1 | 67.9 | 86.3 | 21 / 35 | 4728 |
| 4 | 1 | 67.5 | 84.4 | 19 / 35 | 4657 |
| 5 | 1 | 68.3 | 89.5 | 22 / 35 | 4585 |
| 6 | 1 | 66.9 | 80.6 | 19 / 35 | 4654 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 34 | 71% |
| agd.Mooserwirt2 2.7 | 26 | 62% |
| sigterm.Sigterm 1.0 | 23 | 83% |
| spinnercat.Robovirus 2.718 | 21 | 90% |
| uji.DBH 1.1 | 21 | 81% |
| ratosh.Nobo 0.21 | 14 | 100% |
| stelo.WangRobot 1.0 | 8 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 50% |

Hadur died in 92 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 25 | 27% | 52 |
| morbid.MorbidPriest 1.0 | 17 | 18% | 45 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 13% | 14 |
| uji.DBH 1.1 | 11 | 12% | 25 |
| spinnercat.Robovirus 2.718 | 11 | 12% | 23 |
| sigterm.Sigterm 1.0 | 9 | 10% | 22 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 4% | 7 |
| ratosh.Nobo 0.21 | 3 | 3% | 15 |
| stelo.WangRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F19

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.0 | 173 / 210 | 1.54 | 21.3% | 35636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 21.3% | 173 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.1% | 16 |
| mld.Infinity 2.2 | 2.8 | 13.4% | 15 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.5% | 3 |
| erdnis.Rover 0.3 | 4.8 | 10.4% | 2 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.1% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.4% | 0 |
| pac.ABC 2.1 | 7.7 | 6.7% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.7 | 28 / 35 | 5728 |
| 2 | 1 | 72.4 | 96.8 | 30 / 35 | 5750 |
| 3 | 1 | 72.9 | 95.9 | 32 / 35 | 6059 |
| 4 | 1 | 72.9 | 94.6 | 31 / 35 | 6089 |
| 5 | 1 | 72.0 | 94.3 | 25 / 35 | 6110 |
| 6 | 1 | 71.4 | 89.5 | 27 / 35 | 5900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 82 | 91% |
| mld.Infinity 2.2 | 72 | 92% |
| krillr.mini.JointStrike 2.0.0 | 15 | 93% |
| erdnis.Rover 0.3 | 10 | 90% |
| pac.ABC 2.1 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| patson.PatsonTestBot 1.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 37% | 101 |
| mld.Infinity 2.2 | 8 | 21% | 21 |
| krillr.mini.JointStrike 2.0.0 | 6 | 16% | 22 |
| erdnis.Rover 0.3 | 4 | 11% | 18 |
| mbh.Mbh 0.1 | 2 | 5% | 15 |
| pbg.R2D2 1.0 | 2 | 5% | 9 |
| patson.PatsonTestBot 1.0 | 1 | 3% | 9 |
| pac.ABC 2.1 | 1 | 3% | 5 |

## Melee bench: F20

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.4 | 114 / 210 | 2.05 | 19.7% | 35174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.7% | 114 |
| trm.Wrekt 1.1.6.f | 2.2 | 15.5% | 54 |
| fwb.Nine 1.0.1 | 3.5 | 11.8% | 25 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.7% | 2 |
| catcat20.Rabbit 0.001 | 4.5 | 10.0% | 13 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.3% | 1 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.6 | 19 / 35 | 6271 |
| 2 | 1 | 69.9 | 93.3 | 19 / 35 | 5389 |
| 3 | 1 | 68.5 | 83.5 | 20 / 35 | 5537 |
| 4 | 1 | 69.8 | 86.0 | 19 / 35 | 6240 |
| 5 | 1 | 69.6 | 87.6 | 18 / 35 | 5751 |
| 6 | 1 | 70.6 | 92.1 | 19 / 35 | 5986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 90 | 62% |
| fwb.Nine 1.0.1 | 39 | 62% |
| catcat20.Rabbit 0.001 | 16 | 63% |
| nz.jdc.nano.GridFu 1.0 | 15 | 100% |
| bayen.nut.Squirrel 1.615 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1234. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 55 | 57% | 103 |
| fwb.Nine 1.0.1 | 19 | 20% | 12 |
| catcat20.Rabbit 0.001 | 11 | 11% | 29 |
| nz.jdc.nano.GridFu 1.0 | 5 | 5% | 33 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 8 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 6 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 1 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 5 |

## Melee bench: F21

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.2 | 121 / 210 | 2.06 | 19.6% | 33399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.6% | 121 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 66 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.5% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.2% | 3 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.0% | 1 |
| eld.Hmm 1.0 | 5.5 | 8.6% | 8 |
| fire219.CatBot 1.0 | 7.3 | 6.5% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.6 | 14 / 35 | 5499 |
| 2 | 1 | 69.5 | 86.7 | 20 / 35 | 5402 |
| 3 | 1 | 71.7 | 93.0 | 26 / 35 | 6238 |
| 4 | 1 | 69.8 | 87.6 | 21 / 35 | 5463 |
| 5 | 1 | 69.3 | 87.9 | 22 / 35 | 5267 |
| 6 | 1 | 69.3 | 86.3 | 18 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 106 | 52% |
| dummy.mini.Scimitar 1.01 | 30 | 90% |
| cf.RiO.RiOx 4.2.1 | 26 | 96% |
| eld.Hmm 1.0 | 10 | 80% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1221. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 60 | 67% | 99 |
| dummy.mini.Scimitar 1.01 | 9 | 10% | 42 |
| cf.RiO.RiOx 4.2.1 | 7 | 8% | 24 |
| eld.Hmm 1.0 | 5 | 6% | 19 |
| fire219.CatBot 1.0 | 4 | 4% | 5 |
| PSW.Relentless 0.1 | 2 | 2% | 5 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 9 |
| el.JumpShoot 0.2 | 1 | 1% | 4 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

## Melee bench: F22

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.2 | 76 / 210 | 2.42 | 17.7% | 30107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.7% | 76 |
| pe.SandboxDT 2.71m | 1.8 | 16.6% | 73 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.5% | 35 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.5% | 23 |
| bigpete.Stewie 1.0 | 4.8 | 10.5% | 2 |
| yk.JahRoslav 1.1 | 6.8 | 6.9% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.7% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.4% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.6 | 14 / 35 | 5198 |
| 2 | 1 | 66.8 | 85.7 | 11 / 35 | 4543 |
| 3 | 1 | 67.4 | 84.8 | 12 / 35 | 4817 |
| 4 | 2 | 66.9 | 81.6 | 10 / 35 | 4927 |
| 5 | 1 | 67.0 | 82.9 | 12 / 35 | 5017 |
| 6 | 1 | 69.9 | 88.9 | 17 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 56 | 36% |
| kvk.HebusLeTroll 0.35 | 41 | 59% |
| jlm.javaDisturbance 0.59 | 40 | 55% |
| bigpete.Stewie 1.0 | 8 | 88% |
| gg.Squaraus 0.6 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 50 | 37% | 78 |
| kvk.HebusLeTroll 0.35 | 37 | 28% | 49 |
| jlm.javaDisturbance 0.59 | 29 | 22% | 49 |
| tad.Dalek98 0.98 | 7 | 5% | 7 |
| bigpete.Stewie 1.0 | 6 | 4% | 16 |
| yk.JahRoslav 1.1 | 3 | 2% | 5 |
| gg.Squaraus 0.6 | 2 | 1% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 83.1 | 103 / 210 | 2.52 | 18.9% | 35207 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.9% | 103 |
| pe.SandboxLump 1.52 | 1.8 | 17.5% | 75 |
| cre.Karolos 0.32 | 3.0 | 13.1% | 17 |
| stelo.RamTrackSurfer 1.2 | 4.7 | 9.7% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4.7 | 9.7% | 1 |
| cw.megas.Blade 0.8 | 6.7 | 8.7% | 0 |
| stelo.AreaTargetingBot 1.1 | 6.7 | 8.8% | 6 |
| sample.Walls 1.0 | 7.3 | 7.8% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.6 | 19 / 35 | 6017 |
| 2 | 1 | 71.6 | 90.2 | 20 / 35 | 6453 |
| 3 | 1 | 69.7 | 83.8 | 20 / 35 | 5836 |
| 4 | 1 | 66.8 | 76.5 | 15 / 35 | 5510 |
| 5 | 2 | 68.2 | 81.9 | 12 / 35 | 5140 |
| 6 | 1 | 69.2 | 78.7 | 17 / 35 | 6251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 74 | 53% |
| cre.Karolos 0.32 | 39 | 82% |
| stelo.RamTrackSurfer 1.2 | 12 | 92% |
| stelo.AreaTargetingBot 1.1 | 9 | 89% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 100% |
| sample.Walls 1.0 | 3 | 67% |
| cw.megas.Blade 0.8 | 1 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 57 | 53% | 100 |
| cre.Karolos 0.32 | 27 | 25% | 58 |
| cw.megas.Blade 0.8 | 7 | 7% | 6 |
| stelo.AreaTargetingBot 1.1 | 6 | 6% | 14 |
| sample.Walls 1.0 | 4 | 4% | 7 |
| stelo.RamTrackSurfer 1.2 | 3 | 3% | 15 |
| rrh.Iwillfindyou 2.0 | 2 | 2% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 7 |

## Melee bench: F24

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 67.1 | 52 / 210 | 3.96 | 14.1% | 23084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.7 | 14.3% | 49 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.1% | 52 |
| florent.XSeries.X2 0.12 | 2.7 | 13.5% | 37 |
| davidalves.Phoenix 0.54 | 4.0 | 12.8% | 38 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.3% | 18 |
| oog.melee.Corsair 1.0 | 6.0 | 9.8% | 10 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 7.0% | 5 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.5% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 5.4% | 1 |
| evd.X1 0.01 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 70.5 | 8 / 35 | 4229 |
| 2 | 1 | 64.1 | 77.5 | 11 / 35 | 3950 |
| 3 | 3 | 58.6 | 61.0 | 6 / 35 | 3649 |
| 4 | 3 | 59.5 | 62.2 | 8 / 35 | 3819 |
| 5 | 1 | 61.4 | 68.9 | 12 / 35 | 3758 |
| 6 | 2 | 59.4 | 62.9 | 7 / 35 | 3679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 65% |
| pedersen.Ugluk 1.1.1 | 17 | 53% |
| davidalves.Phoenix 0.54 | 14 | 57% |
| florent.XSeries.X2 0.12 | 13 | 38% |
| stelo.SoJNanoMelee 1.1 | 7 | 71% |
| oog.melee.Corsair 1.0 | 6 | 50% |
| lunchie.Lunchbox 0.93 | 2 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 37 | 23% | 43 |
| rz.GlowBlowMelee 1.4 | 34 | 22% | 50 |
| davidalves.Phoenix 0.54 | 31 | 20% | 40 |
| oog.melee.Corsair 1.0 | 17 | 11% | 24 |
| pedersen.Ugluk 1.1.1 | 15 | 9% | 23 |
| evd.X1 0.01 | 11 | 7% | 11 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 9 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 6 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |

## Melee bench: F25

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.9 | 130 / 210 | 2.63 | 18.0% | 26090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.0% | 130 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 12.9% | 18 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.4% | 11 |
| jdw.Hurricane 1.4 | 3.7 | 12.1% | 25 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.6% | 4 |
| ds.Oo 2.2 | 5.8 | 9.2% | 12 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.6% | 7 |
| awesomeness.Elite 1.0 | 8.3 | 7.0% | 1 |
| adt.Ar2 1.1 | 8.5 | 6.6% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 74.6 | 18 / 35 | 4351 |
| 2 | 1 | 66.6 | 80.6 | 21 / 35 | 4238 |
| 3 | 1 | 67.0 | 81.0 | 22 / 35 | 4412 |
| 4 | 1 | 67.7 | 83.8 | 22 / 35 | 4260 |
| 5 | 1 | 67.1 | 81.6 | 23 / 35 | 4093 |
| 6 | 1 | 69.7 | 89.8 | 24 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 90% |
| voidious.mini.BrokenSword 2.0.3 | 36 | 94% |
| jdw.Hurricane 1.4 | 27 | 93% |
| gjr.Cephalosporin 0.1 | 15 | 87% |
| ds.Oo 2.2 | 12 | 50% |
| gre.svman4.Morfeas 1.4.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 17 | 21% | 50 |
| ds.Oo 2.2 | 16 | 20% | 30 |
| voidious.micro.BlitzBat 1.05 | 15 | 19% | 52 |
| jdw.Hurricane 1.4 | 13 | 16% | 33 |
| gre.svman4.Morfeas 1.4.1 | 5 | 6% | 11 |
| awesomeness.Elite 1.0 | 5 | 6% | 9 |
| gjr.Cephalosporin 0.1 | 4 | 5% | 16 |
| adt.Ar2 1.1 | 4 | 5% | 8 |
| amk.ChumbaMini 0.2 | 1 | 1% | 1 |

## Melee bench: F26

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.3 | 81 / 210 | 2.50 | 17.8% | 32699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.8% | 81 |
| ak.Fermat 2.0 | 1.8 | 15.8% | 71 |
| shu.nitro.LENIN .T34 | 3.5 | 12.0% | 27 |
| lrem.Spectre 0.4.4 | 3.7 | 11.6% | 19 |
| js.PinBall 1.6 | 5.2 | 10.5% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.8% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.0% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.4 | 16 / 35 | 5140 |
| 2 | 1 | 67.7 | 84.1 | 12 / 35 | 5522 |
| 3 | 1 | 68.8 | 87.0 | 14 / 35 | 5736 |
| 4 | 2 | 67.3 | 79.4 | 13 / 35 | 5507 |
| 5 | 1 | 67.4 | 81.9 | 14 / 35 | 5515 |
| 6 | 1 | 66.8 | 81.9 | 12 / 35 | 5279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 49 | 24% |
| shu.nitro.LENIN .T34 | 39 | 72% |
| lrem.Spectre 0.4.4 | 28 | 61% |
| gh.mini.GrubbmOne 1.0 | 12 | 83% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| js.PinBall 1.6 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 65 | 50% | 80 |
| shu.nitro.LENIN .T34 | 21 | 16% | 52 |
| lrem.Spectre 0.4.4 | 17 | 13% | 27 |
| gh.mini.GrubbmOne 1.0 | 7 | 5% | 16 |
| js.PinBall 1.6 | 7 | 5% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 5% | 9 |
| sample.SpinBot 1.0 | 4 | 3% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 2% | 10 |

## Melee bench: F27

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.3 | 111 / 210 | 3.31 | 16.7% | 26711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 16.7% | 111 |
| mk.Alpha 0.2.1 | 2.3 | 13.8% | 45 |
| wee.Gem 1.8.4 | 3.7 | 11.3% | 23 |
| EH.Eagle 1.0.6 | 4.0 | 11.0% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.9% | 10 |
| throxbot.ThroxBot 0.1 | 6.7 | 8.6% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 7.2 | 8.5% | 7 |
| joe.ADinosaur 1.0 | 7.2 | 8.1% | 2 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 80.3 | 20 / 35 | 4575 |
| 2 | 1 | 65.1 | 77.8 | 22 / 35 | 3989 |
| 3 | 1 | 65.7 | 80.0 | 21 / 35 | 4092 |
| 4 | 1 | 63.5 | 63.8 | 14 / 35 | 4649 |
| 5 | 2 | 60.8 | 54.9 | 9 / 35 | 4719 |
| 6 | 1 | 69.0 | 88.9 | 25 / 35 | 4687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 57 | 75% |
| wee.Gem 1.8.4 | 26 | 92% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 89% |
| EH.Eagle 1.0.6 | 12 | 100% |
| throxbot.ThroxBot 0.1 | 8 | 88% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 34 | 34% | 82 |
| wee.Gem 1.8.4 | 14 | 14% | 34 |
| joe.ADinosaur 1.0 | 14 | 14% | 19 |
| cs.Grudge 1.0 | 11 | 11% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 10% | 29 |
| EH.Eagle 1.0.6 | 6 | 6% | 15 |
| throxbot.ThroxBot 0.1 | 5 | 5% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 4% | 9 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 3 |

## Melee bench: F28

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.2 | 116 / 210 | 2.51 | 18.0% | 26527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.0% | 116 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 43 |
| pfvicm.Sobieski 7.2.3b | 3.8 | 10.6% | 9 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.8% | 20 |
| uji.Antique 1.0 | 4.2 | 10.9% | 19 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.0% | 0 |
| matt.advanced.Katana 1.0 | 8.2 | 6.7% | 1 |
| stelo.PianistNano 1.2 | 9.3 | 5.9% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 79.7 | 14 / 35 | 4424 |
| 2 | 1 | 66.3 | 82.2 | 20 / 35 | 4229 |
| 3 | 1 | 68.3 | 88.3 | 22 / 35 | 4474 |
| 4 | 1 | 67.8 | 84.4 | 21 / 35 | 4459 |
| 5 | 1 | 67.7 | 84.1 | 18 / 35 | 4561 |
| 6 | 1 | 66.7 | 80.6 | 21 / 35 | 4380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 68 | 81% |
| uji.Antique 1.0 | 32 | 88% |
| qohnil.blot.BlotBot 3.61 | 22 | 45% |
| ahr.ice.Ice 1.0.2 | 8 | 100% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 23 | 24% | 71 |
| pfvicm.Sobieski 7.2.3b | 20 | 21% | 25 |
| qohnil.blot.BlotBot 3.61 | 17 | 18% | 36 |
| uji.Antique 1.0 | 11 | 12% | 38 |
| amk.ChumbaWumba 0.3 | 10 | 11% | 16 |
| stelo.PianistNano 1.2 | 6 | 6% | 6 |
| stelo.Lifestealer 1.0 | 4 | 4% | 4 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 8 |
| matt.advanced.Katana 1.0 | 1 | 1% | 6 |

## Melee bench: F29

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.7 | 70 / 210 | 2.92 | 17.1% | 28496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.1% | 70 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.2% | 61 |
| deewiant.Anomaly 0.2 | 2.8 | 14.1% | 55 |
| myl.micro.Troodon 1.10 | 4.2 | 11.6% | 8 |
| jok.PheonixM 0.1.2 | 4.8 | 10.5% | 8 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 6.4% | 5 |
| ap.Frederick 1.1 | 8.3 | 5.7% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.8% | 0 |
| jangs.ns51 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.0 | 14 / 35 | 4795 |
| 2 | 1 | 67.2 | 81.3 | 13 / 35 | 4826 |
| 3 | 1 | 67.9 | 84.1 | 13 / 35 | 5025 |
| 4 | 1 | 64.5 | 74.6 | 8 / 35 | 4599 |
| 5 | 1 | 67.9 | 86.3 | 12 / 35 | 4862 |
| 6 | 2 | 64.2 | 71.7 | 10 / 35 | 4389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 58 | 43% |
| zyx.mega.YersiniaPestis 3.1 | 40 | 28% |
| myl.micro.Troodon 1.10 | 13 | 92% |
| jok.PheonixM 0.1.2 | 12 | 92% |
| ap.Frederick 1.1 | 4 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 53 | 38% | 77 |
| zyx.mega.YersiniaPestis 3.1 | 48 | 34% | 64 |
| jok.PheonixM 0.1.2 | 9 | 6% | 20 |
| myl.micro.Troodon 1.10 | 9 | 6% | 18 |
| ph.melee.ArcherME 0.3 | 6 | 4% | 9 |
| DBall.Anarchy 0.1 | 5 | 4% | 10 |
| jangs.ns51 1.0 | 5 | 4% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 4% | 5 |

## Melee bench: F30

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 57.1 | 30 / 210 | 4.86 | 12.3% | 24008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.0 | 13.5% | 48 |
| darkcanuck.B26354 1.06 | 2.7 | 13.6% | 51 |
| oog.melee.Capulet 1.2 | 2.8 | 12.6% | 28 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.6% | 29 |
| hadur117.micro.Saor 0.2 | 4.0 | 12.3% | 30 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.6% | 12 |
| ntc.Opposite 1.5 | 7.7 | 7.8% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.7% | 7 |
| tripphippy.Alice 1.1 | 8.2 | 7.5% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.6 | 56.8 | 4 / 35 | 4048 |
| 2 | 5 | 55.4 | 54.3 | 2 / 35 | 3842 |
| 3 | 5 | 54.2 | 49.8 | 4 / 35 | 3871 |
| 4 | 2 | 59.6 | 62.5 | 5 / 35 | 4320 |
| 5 | 2 | 60.2 | 65.7 | 7 / 35 | 4133 |
| 6 | 5 | 56.9 | 53.7 | 8 / 35 | 3794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 19 | 21% |
| stelo.PastFuture 2.3.2 | 15 | 80% |
| oog.melee.Capulet 1.2 | 14 | 43% |
| darkcanuck.B26354 1.06 | 13 | 23% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| tripphippy.Alice 1.1 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 48 | 27% | 54 |
| oog.melee.Capulet 1.2 | 43 | 24% | 48 |
| darkcanuck.B26354 1.06 | 29 | 16% | 33 |
| stelo.PastFuture 2.3.2 | 25 | 14% | 36 |
| ntc.Opposite 1.5 | 10 | 6% | 10 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 9 |
| GarmBox.Anger 1.0 | 6 | 3% | 7 |
| tripphippy.Alice 1.1 | 6 | 3% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 3% | 6 |

## Melee bench: F31

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 68.6 | 24 / 210 | 3.83 | 13.8% | 22217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.4% | 132 |
| hadur117.micro.Saor 0.2 | 2.2 | 13.8% | 24 |
| gh.mini.Griezel 0.2 | 2.8 | 13.3% | 41 |
| d414.nano.Quantum 1.0.0 | 4.5 | 10.7% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.7% | 3 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.5% | 4 |
| timmit.nano.TimDog 0.33 | 6.8 | 7.1% | 1 |
| fm.mammillarias 1.3 | 8.2 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.4% | 1 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 71.7 | 3 / 35 | 3438 |
| 2 | 2 | 60.4 | 67.0 | 2 / 35 | 4036 |
| 3 | 2 | 59.8 | 66.3 | 4 / 35 | 3667 |
| 4 | 3 | 60.8 | 67.6 | 3 / 35 | 3683 |
| 5 | 2 | 60.5 | 66.0 | 5 / 35 | 3580 |
| 6 | 2 | 62.1 | 72.7 | 7 / 35 | 3813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 37 | 14% |
| gh.mini.Griezel 0.2 | 17 | 24% |
| spinnercat.micro.Tyger 0.1 | 11 | 82% |
| d414.nano.Quantum 1.0.0 | 7 | 71% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 106 | 57% | 112 |
| gh.mini.Griezel 0.2 | 29 | 16% | 33 |
| spinnercat.micro.Tyger 0.1 | 14 | 8% | 21 |
| d414.nano.Quantum 1.0.0 | 11 | 6% | 17 |
| gh.nano.Grofvuil 0.2 | 11 | 6% | 12 |
| timmit.nano.TimDog 0.33 | 7 | 4% | 7 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.1 | 82 / 210 | 3.15 | 16.2% | 27553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 16.2% | 82 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.2% | 68 |
| apc.botM 3.0 | 3.3 | 12.1% | 28 |
| vjik.UnViolation 1.1 | 4.3 | 10.6% | 12 |
| lxx.ConceptA 0.8 | 4.7 | 10.6% | 7 |
| bayen.UbaMicro 1.4 | 6.2 | 8.7% | 3 |
| panzer.Panzer 0.2 | 6.8 | 7.8% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.8% | 8 |
| conscience.Electron 1.3g | 8.7 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 73.0 | 11 / 35 | 4404 |
| 2 | 1 | 65.1 | 79.4 | 12 / 35 | 4678 |
| 3 | 1 | 66.1 | 81.0 | 16 / 35 | 4884 |
| 4 | 1 | 64.0 | 73.0 | 15 / 35 | 4405 |
| 5 | 1 | 64.8 | 77.1 | 14 / 35 | 4691 |
| 6 | 1 | 63.2 | 73.3 | 14 / 35 | 4491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 59 | 34% |
| apc.botM 3.0 | 27 | 74% |
| lxx.ConceptA 0.8 | 19 | 89% |
| vjik.UnViolation 1.1 | 8 | 75% |
| donjezza.Jezza 1.0 | 8 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 60 | 46% | 83 |
| lxx.ConceptA 0.8 | 19 | 15% | 24 |
| apc.botM 3.0 | 15 | 12% | 35 |
| conscience.Electron 1.3g | 10 | 8% | 12 |
| vjik.UnViolation 1.1 | 9 | 7% | 24 |
| panzer.Panzer 0.2 | 6 | 5% | 8 |
| bayen.UbaMicro 1.4 | 5 | 4% | 8 |
| yk.JahMicro 1.0 | 4 | 3% | 9 |
| donjezza.Jezza 1.0 | 2 | 2% | 6 |

## Melee bench: F33

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.4 | 110 / 210 | 2.31 | 19.2% | 32290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.2% | 110 |
| maribo.Quester 0.3 | 2.2 | 15.7% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 12.8% | 20 |
| labg.Cataclysm 2.05 | 4.3 | 10.6% | 18 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 10.4% | 11 |
| baal.nano.N 1.42 | 6.0 | 9.0% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.0% | 6 |
| zyx.micro.Ant 1.1 | 8.2 | 5.7% | 1 |
| sanja.First 0.1 | 9.0 | 5.0% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 82.9 | 20 / 35 | 5141 |
| 2 | 1 | 70.0 | 89.2 | 18 / 35 | 5411 |
| 3 | 1 | 70.1 | 86.7 | 18 / 35 | 5675 |
| 4 | 1 | 69.6 | 87.6 | 20 / 35 | 5148 |
| 5 | 1 | 68.8 | 83.5 | 19 / 35 | 5128 |
| 6 | 1 | 68.6 | 82.9 | 15 / 35 | 5787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 53 | 68% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 86% |
| gre.svman4.Leonidas 1.3.2 | 27 | 85% |
| labg.Cataclysm 2.05 | 14 | 50% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 33% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 42 | 41% | 83 |
| labg.Cataclysm 2.05 | 18 | 18% | 28 |
| gre.svman4.Leonidas 1.3.2 | 14 | 14% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 9% | 49 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 7% | 9 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 7% | 7 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
| baal.nano.N 1.42 | 2 | 2% | 2 |
| sanja.First 0.1 | 1 | 1% | 2 |

## Melee bench: F34

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.6 | 32 / 210 | 3.02 | 16.0% | 29709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.7 | 17.1% | 101 |
| kid.Gladiator .7.2 | 1.7 | 16.9% | 56 |
| hadur117.micro.Saor 0.2 | 2.7 | 16.0% | 32 |
| jcs.Seth 1.8 | 4.7 | 10.8% | 15 |
| tcf.Reach 3 | 4.7 | 10.6% | 6 |
| cli.Dancer 1.1 | 5.7 | 9.5% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.2 | 77.1 | 2 / 35 | 5090 |
| 2 | 2 | 65.6 | 77.8 | 9 / 35 | 4770 |
| 3 | 2 | 67.2 | 81.0 | 6 / 35 | 5299 |
| 4 | 3 | 65.8 | 77.1 | 7 / 35 | 4885 |
| 5 | 3 | 64.4 | 74.3 | 4 / 35 | 4804 |
| 6 | 3 | 65.5 | 78.1 | 4 / 35 | 4861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 54 | 24% |
| kid.Gladiator .7.2 | 44 | 27% |
| jcs.Seth 1.8 | 6 | 50% |
| tcf.Reach 3 | 5 | 40% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 75 | 42% | 85 |
| kid.Gladiator .7.2 | 66 | 37% | 74 |
| tcf.Reach 3 | 15 | 8% | 17 |
| jcs.Seth 1.8 | 13 | 7% | 20 |
| ratosh.Wesco 1.4 | 3 | 2% | 5 |
| sample.RamFire 1.0 | 3 | 2% | 3 |
| cli.Dancer 1.1 | 2 | 1% | 5 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.9 | 15 / 210 | 3.71 | 13.6% | 21201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 165 |
| hadur117.micro.Saor 0.2 | 2.3 | 13.6% | 15 |
| gh.mini.Gruwel 0.9 | 2.7 | 13.1% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.7% | 5 |
| rz.HawkOnFire 0.1 | 4.8 | 11.0% | 1 |
| wit.Chuliath 1.0 | 6.5 | 7.2% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 67.0 | 2 / 35 | 3735 |
| 2 | 2 | 61.4 | 71.1 | 4 / 35 | 3512 |
| 3 | 3 | 60.2 | 69.2 | 0 / 35 | 3498 |
| 4 | 2 | 60.9 | 71.4 | 3 / 35 | 3454 |
| 5 | 2 | 62.5 | 75.6 | 3 / 35 | 3588 |
| 6 | 3 | 59.5 | 65.1 | 3 / 35 | 3414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 45 | 7% |
| gh.mini.Gruwel 0.9 | 12 | 8% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 75% |
| rz.HawkOnFire 0.1 | 3 | 100% |
| myl.nano.KomoriNinja 1.1 | 2 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 114 | 58% | 117 |
| gh.mini.Gruwel 0.9 | 36 | 18% | 39 |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 10% | 23 |
| rz.HawkOnFire 0.1 | 10 | 5% | 12 |
| myl.nano.KomoriNinja 1.1 | 6 | 3% | 8 |
| wit.Chuliath 1.0 | 4 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 0 | 0% | 1 |

## Melee bench: F36

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.0 | 153 / 210 | 1.99 | 20.3% | 33125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.3% | 153 |
| alpha.RainingFire 1.0 | 2.2 | 12.4% | 20 |
| bzdp.Pansy 2.1 | 2.8 | 11.8% | 11 |
| mz.Cork 0.1 | 4.7 | 10.1% | 4 |
| bvh.micro.Freya 0.3 | 4.8 | 9.9% | 6 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.6% | 6 |
| m3thos.Eva02 0.7.1 | 6.5 | 8.8% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.5% | 0 |
| dl.BetterWalls 1.0 | 9.5 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.1 | 24 / 35 | 5417 |
| 2 | 1 | 70.8 | 90.2 | 24 / 35 | 5980 |
| 3 | 1 | 70.3 | 88.3 | 26 / 35 | 5517 |
| 4 | 1 | 67.9 | 79.0 | 23 / 35 | 5254 |
| 5 | 1 | 69.6 | 88.6 | 26 / 35 | 5282 |
| 6 | 1 | 72.1 | 96.8 | 30 / 35 | 5675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 91% |
| bvh.micro.Freya 0.3 | 31 | 97% |
| alpha.RainingFire 1.0 | 25 | 80% |
| bvh.mini.Fenrir 0.39 | 23 | 91% |
| mz.Cork 0.1 | 23 | 91% |
| m3thos.Eva02 0.7.1 | 10 | 90% |
| sample.MyFirstRobot 1.0 | 9 | 78% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 13 | 22% | 35 |
| bvh.mini.Fenrir 0.39 | 10 | 17% | 24 |
| mz.Cork 0.1 | 9 | 16% | 29 |
| bzdp.Pansy 2.1 | 8 | 14% | 50 |
| m3thos.Eva02 0.7.1 | 6 | 10% | 17 |
| dl.BetterWalls 1.0 | 5 | 9% | 15 |
| bvh.micro.Freya 0.3 | 4 | 7% | 28 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |

## Melee bench: F37

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.5 | 131 / 210 | 2.57 | 18.3% | 32233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.3% | 131 |
| germ.TheMind .2 | 2.7 | 11.0% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 10.4% | 14 |
| EBBU.Sim2 1.02 | 4.0 | 10.5% | 11 |
| agrach.Dalek 1.0 | 5.2 | 9.4% | 14 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.0% | 12 |
| mb.Beast 0.1 | 7.7 | 8.2% | 5 |
| lmk.ACPFinal 0.1 | 8.2 | 7.9% | 2 |
| skm.Ryubot 1.0 | 8.2 | 7.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.4 | 23 / 35 | 5074 |
| 2 | 1 | 66.7 | 79.0 | 19 / 35 | 5619 |
| 3 | 1 | 67.4 | 82.9 | 24 / 35 | 5615 |
| 4 | 1 | 68.5 | 86.3 | 25 / 35 | 5714 |
| 5 | 1 | 64.0 | 74.9 | 17 / 35 | 4866 |
| 6 | 1 | 67.8 | 87.6 | 23 / 35 | 5345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 34 | 82% |
| EBBU.Sim2 1.02 | 21 | 90% |
| skm.Ryubot 1.0 | 19 | 95% |
| stelo.UntouchableNano 1.3 | 18 | 78% |
| lmk.ACPFinal 0.1 | 16 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 93% |
| agrach.Dalek 1.0 | 13 | 77% |
| mb.Beast 0.1 | 12 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 418. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 19% | 34 |
| germ.TheMind .2 | 14 | 18% | 37 |
| EBBU.Sim2 1.02 | 13 | 16% | 36 |
| agrach.Dalek 1.0 | 13 | 16% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 11% | 12 |
| stelo.UntouchableNano 1.3 | 5 | 6% | 16 |
| lmk.ACPFinal 0.1 | 5 | 6% | 12 |
| mb.Beast 0.1 | 3 | 4% | 14 |
| skm.Ryubot 1.0 | 2 | 3% | 16 |

## Melee bench: F38

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 69.2 | 41 / 210 | 3.78 | 14.4% | 25392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.5% | 110 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.4% | 41 |
| bvh.mini.Freya 0.55 | 3.2 | 12.4% | 15 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.6% | 27 |
| cs.Wren 1.0 | 4.7 | 10.9% | 8 |
| kdf.KoulDestroyer 1.0 | 6.5 | 8.7% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 9.0% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.4% | 1 |
| bzdp.BoxCar 2.0 | 9.3 | 4.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 68.9 | 7 / 35 | 4353 |
| 2 | 2 | 62.4 | 72.1 | 4 / 35 | 4348 |
| 3 | 2 | 59.7 | 65.1 | 5 / 35 | 3948 |
| 4 | 2 | 63.1 | 71.1 | 11 / 35 | 4219 |
| 5 | 2 | 61.0 | 67.0 | 7 / 35 | 4045 |
| 6 | 2 | 62.9 | 70.8 | 7 / 35 | 4479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 48 | 25% |
| bts.mega.Gnarly 1.4 | 15 | 60% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 100% |
| cs.Wren 1.0 | 8 | 88% |
| bvh.mini.Freya 0.55 | 4 | 50% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 87 | 51% | 99 |
| bvh.mini.Freya 0.55 | 24 | 14% | 27 |
| bts.mega.Gnarly 1.4 | 15 | 9% | 27 |
| cs.Wren 1.0 | 13 | 8% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 7% | 18 |
| kdf.KoulDestroyer 1.0 | 10 | 6% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 2% | 6 |
| bzdp.BoxCar 2.0 | 3 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.9 | 68 / 210 | 3.17 | 16.7% | 32281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.7% | 68 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 32 |
| az.Ololobot 0.2.4 | 3.0 | 13.3% | 73 |
| catcat20.Lambda 0.024 | 4.0 | 11.2% | 29 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.0% | 1 |
| gimp.GimpBot 0.1 | 6.2 | 8.5% | 2 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.8% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 7.3 | 7.3% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 68.9 | 12 / 35 | 4872 |
| 2 | 1 | 67.1 | 80.3 | 14 / 35 | 5849 |
| 3 | 1 | 67.2 | 82.9 | 14 / 35 | 5374 |
| 4 | 1 | 65.3 | 74.0 | 11 / 35 | 5521 |
| 5 | 1 | 63.9 | 72.4 | 6 / 35 | 5263 |
| 6 | 1 | 65.2 | 76.8 | 11 / 35 | 5402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 41 | 15% |
| bvh.fry.Freya 0.82 | 39 | 74% |
| catcat20.Lambda 0.024 | 27 | 48% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 50 | 35% | 63 |
| bvh.fry.Freya 0.82 | 36 | 25% | 57 |
| catcat20.Lambda 0.024 | 28 | 20% | 41 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 8% | 16 |
| apollokidd.ApolloKidd 0.9 | 9 | 6% | 11 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 10 |
| gimp.GimpBot 0.1 | 2 | 1% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 1% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |

## Melee bench: F40

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.4 | 113 / 210 | 2.50 | 18.2% | 27867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.2% | 113 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 48 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 11.9% | 14 |
| Polkwane.SmashMelee 1.0 | 4.0 | 11.1% | 14 |
| mz.AntiGrav 1.0 | 4.7 | 10.5% | 5 |
| stelo.Randomness 1.0 | 6.3 | 8.7% | 12 |
| alpha.BlackIce 1.0 | 6.7 | 8.5% | 2 |
| testantiswapgun.AntiSwap 1.0 | 8.5 | 6.0% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.7 | 6.2% | 0 |
| sample.Corners 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.0 | 19 / 35 | 4967 |
| 2 | 1 | 68.0 | 87.9 | 19 / 35 | 4393 |
| 3 | 1 | 64.7 | 74.9 | 14 / 35 | 4351 |
| 4 | 1 | 68.9 | 86.7 | 22 / 35 | 4717 |
| 5 | 1 | 67.3 | 81.6 | 18 / 35 | 4669 |
| 6 | 1 | 68.8 | 88.3 | 21 / 35 | 4770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 54 | 52% |
| kano.gamma.KanoGamma 1.8 | 30 | 90% |
| Polkwane.SmashMelee 1.0 | 28 | 71% |
| mz.AntiGrav 1.0 | 24 | 100% |
| stelo.Randomness 1.0 | 12 | 67% |
| alpha.BlackIce 1.0 | 6 | 67% |
| sample.Corners 1.0 | 2 | 50% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 42 | 43% | 68 |
| stelo.Randomness 1.0 | 14 | 14% | 28 |
| kano.gamma.KanoGamma 1.8 | 12 | 12% | 41 |
| Polkwane.SmashMelee 1.0 | 10 | 10% | 20 |
| alpha.BlackIce 1.0 | 6 | 6% | 14 |
| mz.AntiGrav 1.0 | 5 | 5% | 24 |
| testantiswapgun.AntiSwap 1.0 | 5 | 5% | 6 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 3 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.8 | 55 / 210 | 3.71 | 15.1% | 26952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.2 | 17.0% | 109 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.1% | 55 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.6% | 18 |
| ary.Swarm 1.1 | 3.5 | 12.8% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.1% | 5 |
| shrub.Silver v048 | 5.8 | 9.5% | 6 |
| zyx.nano.Ant 1.1 | 7.0 | 8.0% | 0 |
| stelo.Mirror 1.1 | 8.2 | 6.1% | 1 |
| jsal.Jsalbot 1.0 | 8.8 | 5.8% | 2 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 66.7 | 8 / 35 | 4550 |
| 2 | 2 | 61.0 | 64.1 | 4 / 35 | 4608 |
| 3 | 2 | 62.8 | 69.8 | 7 / 35 | 4264 |
| 4 | 1 | 65.2 | 72.4 | 14 / 35 | 4948 |
| 5 | 2 | 64.2 | 72.1 | 13 / 35 | 4480 |
| 6 | 2 | 63.8 | 74.0 | 9 / 35 | 4102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 58 | 12% |
| ary.Swarm 1.1 | 19 | 89% |
| simonton.nano.MeleeSeed 1.8 | 18 | 89% |
| lessonz.robocode.Oz 0.5.0 | 17 | 65% |
| shrub.Silver v048 | 4 | 25% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 74 | 48% | 80 |
| simonton.nano.MeleeSeed 1.8 | 22 | 14% | 35 |
| ary.Swarm 1.1 | 16 | 10% | 33 |
| lessonz.robocode.Oz 0.5.0 | 16 | 10% | 25 |
| zyx.nano.Ant 1.1 | 8 | 5% | 8 |
| acogdev.alpha 0.2 | 7 | 5% | 8 |
| shrub.Silver v048 | 6 | 4% | 9 |
| stelo.Mirror 1.1 | 3 | 2% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |

## Melee bench: F42

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.3 | 49 / 210 | 3.22 | 16.2% | 30996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.2% | 100 |
| hadur117.micro.Saor 0.2 | 2.0 | 16.2% | 49 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.1% | 28 |
| ara.Shera 0.88 | 3.8 | 11.9% | 26 |
| amz.NanoClone 1.41 | 5.3 | 9.6% | 1 |
| maribo.IotaCT 1.1 | 5.7 | 8.3% | 0 |
| dsw.StaticD 1.0 | 7.2 | 7.0% | 5 |
| stelo.MirrorMicro 1.0 | 8.2 | 6.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 80.6 | 9 / 35 | 5176 |
| 2 | 2 | 63.4 | 74.6 | 6 / 35 | 4668 |
| 3 | 2 | 65.9 | 77.1 | 6 / 35 | 5533 |
| 4 | 2 | 65.2 | 77.1 | 10 / 35 | 5119 |
| 5 | 2 | 64.2 | 70.2 | 10 / 35 | 5225 |
| 6 | 2 | 64.1 | 72.1 | 8 / 35 | 5275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 63 | 29% |
| ara.Shera 0.88 | 24 | 54% |
| maribo.mini.MiniQuester 0.1 | 23 | 52% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| dsw.StaticD 1.0 | 2 | 50% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% |

Hadur died in 163 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 82 | 50% | 101 |
| maribo.mini.MiniQuester 0.1 | 26 | 16% | 39 |
| ara.Shera 0.88 | 26 | 16% | 34 |
| amz.NanoClone 1.41 | 11 | 7% | 13 |
| dsw.StaticD 1.0 | 7 | 4% | 10 |
| stelo.MirrorMicro 1.0 | 4 | 2% | 7 |
| maribo.IotaCT 1.1 | 4 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 1 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 70.6 | 20 / 210 | 3.65 | 13.7% | 21959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.1% | 157 |
| hadur117.micro.Saor 0.2 | 2.2 | 13.7% | 20 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.1% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.2% | 5 |
| dummy.micro.Sparrow 2.5 | 5.0 | 10.8% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.2 | 10.2% | 3 |
| jab.DiamondStealer 5 | 7.3 | 8.2% | 0 |
| mz.NanoGod 2.02 | 7.7 | 8.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 68.9 | 2 / 35 | 3105 |
| 2 | 2 | 61.7 | 67.6 | 3 / 35 | 3810 |
| 3 | 2 | 64.2 | 76.8 | 4 / 35 | 3914 |
| 4 | 2 | 63.1 | 73.3 | 3 / 35 | 3491 |
| 5 | 2 | 63.0 | 71.4 | 7 / 35 | 3978 |
| 6 | 2 | 60.8 | 65.4 | 1 / 35 | 3661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 62 | 0% |
| brainfade.melee.Dusk 0.44 | 10 | 50% |
| dummy.micro.Sparrow 2.5 | 8 | 88% |
| Krabb.akim2.Akim2 1.1b | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| mz.NanoGod 2.02 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 111 | 58% | 113 |
| brainfade.melee.Dusk 0.44 | 23 | 12% | 28 |
| wcsv.melee.EngineerMelee 0.1 | 21 | 11% | 23 |
| mz.NanoGod 2.02 | 16 | 8% | 18 |
| dummy.micro.Sparrow 2.5 | 11 | 6% | 17 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 6 |
| cvt.Firsty 1.0 | 2 | 1% | 3 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.8 | 91 / 210 | 2.72 | 18.1% | 32580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 91 |
| stelo.Liblix 0.3.1 | 2.2 | 15.5% | 78 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.4% | 26 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.8% | 0 |
| wompi.Quokka 1.6 | 5.3 | 9.9% | 5 |
| jwirde.Gort 2.0 | 5.5 | 9.6% | 7 |
| disan.Chair 2.2.0 | 7.0 | 7.9% | 3 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.7% | 0 |
| sample.Crazy 1.0 | 9.2 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.8 | 14 / 35 | 5549 |
| 2 | 1 | 69.0 | 86.3 | 16 / 35 | 5642 |
| 3 | 1 | 66.3 | 79.7 | 12 / 35 | 4871 |
| 4 | 1 | 68.3 | 83.5 | 15 / 35 | 5487 |
| 5 | 1 | 65.7 | 72.1 | 15 / 35 | 5485 |
| 6 | 1 | 68.0 | 79.7 | 19 / 35 | 5546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 71 | 37% |
| tzu.TheArtOfWar 1.2 | 52 | 79% |
| wompi.Quokka 1.6 | 7 | 86% |
| jwirde.Gort 2.0 | 7 | 100% |
| disan.Chair 2.2.0 | 6 | 83% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 63 | 53% | 88 |
| tzu.TheArtOfWar 1.2 | 29 | 24% | 65 |
| stf.PanzerGeneral 0.1 | 7 | 6% | 10 |
| wompi.Quokka 1.6 | 6 | 5% | 11 |
| disan.Chair 2.2.0 | 5 | 4% | 12 |
| jwirde.Gort 2.0 | 4 | 3% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 3% | 7 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

## Melee bench: F45

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.2 | 100 / 210 | 2.06 | 20.0% | 35500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.0% | 100 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.2% | 91 |
| jje.BagPuss 1.2 | 3.0 | 11.6% | 9 |
| myl.nano.Graviton 1.10 | 4.3 | 10.5% | 5 |
| sul.Lunar 1.1 | 4.7 | 10.0% | 2 |
| hvilela.HVilela 0.9 | 6.5 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 7.8% | 0 |
| fm.claire 1.7 | 7.2 | 7.9% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.9% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.9 | 13 / 35 | 5898 |
| 2 | 1 | 67.9 | 84.1 | 18 / 35 | 5151 |
| 3 | 1 | 70.0 | 88.9 | 18 / 35 | 5977 |
| 4 | 1 | 71.1 | 91.7 | 18 / 35 | 6446 |
| 5 | 1 | 70.2 | 89.2 | 17 / 35 | 6000 |
| 6 | 1 | 69.7 | 87.3 | 16 / 35 | 6028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 104 | 37% |
| jje.BagPuss 1.2 | 19 | 74% |
| sul.Lunar 1.1 | 16 | 100% |
| myl.nano.Graviton 1.10 | 15 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 100% |
| wit.Deep7 2.0 | 7 | 100% |
| fm.claire 1.7 | 5 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 2049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 68 | 62% | 0 |
| jje.BagPuss 1.2 | 19 | 17% | 59 |
| myl.nano.Graviton 1.10 | 6 | 5% | 43 |
| hvilela.HVilela 0.9 | 5 | 5% | 14 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 14 |
| fm.claire 1.7 | 3 | 3% | 11 |
| sul.Lunar 1.1 | 2 | 2% | 47 |
| abud.ThirdRobo 1.0 | 2 | 2% | 4 |
| wit.Deep7 2.0 | 1 | 1% | 14 |

## Melee bench: F46

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 69.4 | 23 / 210 | 3.75 | 14.4% | 26433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.1% | 74 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.6% | 90 |
| hadur117.micro.Saor 0.2 | 3.0 | 14.4% | 23 |
| cx.Princess 1.0 | 4.3 | 10.7% | 20 |
| mz.MicroSheep 1.0 | 5.0 | 10.3% | 3 |
| sadoner.killer 0.2 | 5.7 | 9.6% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.0% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.7% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 64.8 | 4 / 35 | 4312 |
| 2 | 3 | 62.7 | 68.9 | 5 / 35 | 4444 |
| 3 | 3 | 61.4 | 68.9 | 3 / 35 | 4054 |
| 4 | 3 | 63.3 | 76.2 | 3 / 35 | 4317 |
| 5 | 3 | 63.5 | 70.5 | 5 / 35 | 4700 |
| 6 | 3 | 62.2 | 67.3 | 3 / 35 | 4606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 33 | 30% |
| rsalesc.melee.Medina 0.4.5 | 25 | 16% |
| cx.Princess 1.0 | 8 | 13% |
| mz.MicroSheep 1.0 | 5 | 100% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 69 | 37% | 79 |
| rsalesc.melee.Medina 0.4.5 | 66 | 35% | 72 |
| cx.Princess 1.0 | 26 | 14% | 27 |
| sadoner.killer 0.2 | 10 | 5% | 12 |
| mz.MicroSheep 1.0 | 7 | 4% | 10 |
| kurios.DOSexe .9a | 4 | 2% | 5 |
| arthord.NanoSatanMelee Beta | 4 | 2% | 4 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

