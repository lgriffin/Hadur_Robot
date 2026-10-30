# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 70.8 | 19 / 210 | 3.62 | 14.5% | 27618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.9% | 162 |
| hadur117.micro.Saor 0.2 | 2.2 | 14.5% | 19 |
| sgp.JollyNinja 3.53 | 3.8 | 11.2% | 13 |
| mz.MicroGodMelee 1 | 4.0 | 11.2% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 10.9% | 4 |
| lorneswork.Predator 1.0 | 5.8 | 9.9% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 72.7 | 0 / 35 | 4910 |
| 2 | 3 | 61.2 | 65.7 | 2 / 35 | 4533 |
| 3 | 2 | 62.9 | 71.1 | 3 / 35 | 4503 |
| 4 | 2 | 64.5 | 78.1 | 5 / 35 | 4872 |
| 5 | 2 | 61.7 | 67.0 | 6 / 35 | 4538 |
| 6 | 2 | 62.0 | 70.5 | 3 / 35 | 4262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 84 | 2% |
| sgp.JollyNinja 3.53 | 12 | 67% |
| mz.MicroGodMelee 1 | 9 | 33% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| lorneswork.Predator 1.0 | 2 | 50% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 122 | 64% | 127 |
| mz.MicroGodMelee 1 | 20 | 10% | 24 |
| sgp.JollyNinja 3.53 | 14 | 7% | 20 |
| lorneswork.Predator 1.0 | 13 | 7% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 4% | 10 |
| adt.Ar2 1.0 | 5 | 3% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 3% | 5 |
| skm.butterfly 1.0 | 3 | 2% | 3 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.7 | 79 / 210 | 3.01 | 17.1% | 30390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.1% | 79 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.6% | 47 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 12.3% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 11.0% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.9% | 16 |
| sch.Simone 0.3d | 6.8 | 8.7% | 16 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.1% | 0 |
| Noran.BitchingElk 0.054 | 7.3 | 8.3% | 15 |
| stelo.PatternRobot 1.0 | 8.8 | 6.7% | 5 |
| fullsail.SweetTea 1.1 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.2 | 19 / 35 | 4999 |
| 2 | 1 | 66.9 | 79.7 | 16 / 35 | 5316 |
| 3 | 1 | 63.0 | 72.4 | 8 / 35 | 4782 |
| 4 | 1 | 64.9 | 74.6 | 11 / 35 | 5020 |
| 5 | 1 | 65.8 | 77.1 | 13 / 35 | 5093 |
| 6 | 1 | 66.4 | 80.0 | 12 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 42 | 60% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 26 | 38% |
| sch.Simone 0.3d | 14 | 64% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 67% |
| Noran.BitchingElk 0.054 | 10 | 80% |
| stelo.PatternRobot 1.0 | 8 | 63% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 38 | 29% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 32 | 24% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 14% | 21 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 12% | 27 |
| sch.Simone 0.3d | 11 | 8% | 24 |
| stelo.PatternRobot 1.0 | 8 | 6% | 10 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 8 |
| Noran.BitchingElk 0.054 | 3 | 2% | 8 |
| fullsail.SweetTea 1.1 | 1 | 1% | 7 |

## Melee bench: F03

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.4 | 116 / 210 | 3.12 | 17.4% | 33413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 116 |
| radnor.DoctorBob 1.42 | 2.3 | 14.7% | 38 |
| vuen.Cake 2.51 | 3.2 | 12.9% | 27 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.1% | 19 |
| urdos.URDOS 1.3 | 5.2 | 9.7% | 3 |
| adt.Ar1 2.1 | 6.5 | 8.1% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.3% | 4 |
| oa.weak.FlyMk1 0.1 | 7.5 | 7.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 74.0 | 18 / 35 | 5415 |
| 2 | 1 | 67.7 | 79.4 | 16 / 35 | 6325 |
| 3 | 1 | 65.2 | 73.7 | 20 / 35 | 5307 |
| 4 | 1 | 68.7 | 82.5 | 24 / 35 | 5681 |
| 5 | 1 | 64.7 | 71.7 | 17 / 35 | 5231 |
| 6 | 1 | 66.5 | 77.1 | 21 / 35 | 5454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 44 | 86% |
| kawigi.nano.Lib 1.0 | 38 | 92% |
| radnor.DoctorBob 1.42 | 35 | 89% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 30% | 60 |
| kawigi.nano.Lib 1.0 | 22 | 23% | 60 |
| vuen.Cake 2.51 | 11 | 11% | 43 |
| urdos.URDOS 1.3 | 9 | 9% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 8% | 8 |
| adt.Ar1 2.1 | 8 | 8% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 4 | 4% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 4% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.9 | 8 / 210 | 2.99 | 16.0% | 32830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.9% | 192 |
| hadur117.micro.Saor 0.2 | 2.0 | 16.0% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.9% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 3 |
| josago.Jorgito 0.16 | 5.0 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.9% | 0 |
| css.Delitioner 0.11 | 6.7 | 6.9% | 1 |
| rampancy.Durandal 2.1d | 7.7 | 6.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 3.9% | 1 |
| spin.Bugstard 0.012b | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 80.0 | 4 / 35 | 5675 |
| 2 | 2 | 65.0 | 75.2 | 2 / 35 | 5170 |
| 3 | 2 | 64.9 | 74.0 | 0 / 35 | 5310 |
| 4 | 2 | 65.5 | 78.4 | 0 / 35 | 5379 |
| 5 | 2 | 67.0 | 81.9 | 1 / 35 | 5789 |
| 6 | 2 | 66.1 | 77.8 | 1 / 35 | 5507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 93 | 0% |
| TNT.TNT 0.99.1 | 4 | 75% |
| apc.LeeroyJenkins2 1.0 | 3 | 67% |
| css.Delitioner 0.11 | 2 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 0% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 157 | 78% | 159 |
| apc.LeeroyJenkins2 1.0 | 23 | 11% | 25 |
| TNT.TNT 0.99.1 | 7 | 3% | 8 |
| josago.Jorgito 0.16 | 7 | 3% | 7 |
| tj.zombie1n 1.0.1 | 4 | 2% | 4 |
| css.Delitioner 0.11 | 3 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 2 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |

## Melee bench: F05

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 65.3 | 13 / 210 | 4.12 | 13.4% | 25349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.0% | 109 |
| justin.DemonicRage 3.4 | 1.8 | 17.3% | 68 |
| hadur117.micro.Saor 0.2 | 3.2 | 13.4% | 13 |
| wompi.Numbat 2.1 | 3.8 | 12.0% | 11 |
| axeBots.HataMoto 3.09 | 5.3 | 9.2% | 6 |
| ms.Ares 0.19 | 5.7 | 9.0% | 3 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.9% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 62.2 | 2 / 35 | 4221 |
| 2 | 3 | 62.4 | 72.4 | 4 / 35 | 4170 |
| 3 | 3 | 61.1 | 70.8 | 2 / 35 | 3897 |
| 4 | 4 | 59.4 | 59.7 | 0 / 35 | 4552 |
| 5 | 3 | 61.3 | 66.3 | 3 / 35 | 4444 |
| 6 | 3 | 58.9 | 60.3 | 2 / 35 | 4065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 23 | 17% |
| cb.fire.Firestarter 2.0f | 22 | 14% |
| wompi.Numbat 2.1 | 4 | 75% |
| supersample.SuperBoxBot 1.0 | 2 | 100% |
| ms.Ares 0.19 | 1 | 0% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 76 | 39% | 81 |
| cb.fire.Firestarter 2.0f | 63 | 32% | 67 |
| wompi.Numbat 2.1 | 25 | 13% | 27 |
| axeBots.HataMoto 3.09 | 10 | 5% | 11 |
| ms.Ares 0.19 | 9 | 5% | 10 |
| supersample.SuperBoxBot 1.0 | 7 | 4% | 8 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 1 |

## Melee bench: F06

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 77.0 | 89 / 210 | 3.07 | 16.7% | 28243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.7% | 89 |
| jekl.StoneGhost 0.7 | 2.2 | 14.5% | 31 |
| origin.SleepSiphon 1.7b | 3.0 | 12.9% | 52 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.3% | 22 |
| mld.Wisdom 1.0 | 5.0 | 11.0% | 7 |
| gg.Wolverine 2.0 | 5.8 | 8.8% | 6 |
| DBall.NUKE 0.1 | 7.5 | 7.3% | 0 |
| spinnercat.Omen 1.0 | 7.7 | 7.1% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.1% | 3 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.7 | 16 / 35 | 4693 |
| 2 | 1 | 64.9 | 78.1 | 15 / 35 | 4380 |
| 3 | 1 | 66.9 | 81.9 | 16 / 35 | 4792 |
| 4 | 1 | 64.7 | 72.1 | 17 / 35 | 4673 |
| 5 | 1 | 65.1 | 74.6 | 13 / 35 | 4893 |
| 6 | 1 | 65.1 | 75.9 | 12 / 35 | 4812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 46 | 85% |
| origin.SleepSiphon 1.7b | 33 | 33% |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 78% |
| mld.Wisdom 1.0 | 6 | 83% |
| gg.Wolverine 2.0 | 6 | 33% |
| DBall.NUKE 0.1 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 40 | 33% | 58 |
| mld.Wisdom 1.0 | 28 | 23% | 33 |
| jekl.StoneGhost 0.7 | 25 | 21% | 55 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 12% | 36 |
| gg.Wolverine 2.0 | 10 | 8% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 9 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 83.4 | 65 / 210 | 2.50 | 18.3% | 36151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 18.3% | 65 |
| rsalesc.melee.Monk 0.3.6c | 1.7 | 18.2% | 67 |
| rtk.Tachikoma 1.0 | 2.8 | 16.5% | 57 |
| franzor.Lizt 1.3.1 | 4.0 | 11.2% | 15 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 8.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| sample.Target 1.0 | 9.0 | 2.9% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 81.6 | 6 / 35 | 5504 |
| 2 | 1 | 69.2 | 81.9 | 13 / 35 | 6231 |
| 3 | 1 | 71.1 | 89.2 | 15 / 35 | 6607 |
| 4 | 2 | 68.2 | 81.0 | 10 / 35 | 5422 |
| 5 | 2 | 68.9 | 80.6 | 9 / 35 | 6120 |
| 6 | 1 | 70.0 | 86.0 | 12 / 35 | 6267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 68 | 46% |
| rsalesc.melee.Monk 0.3.6c | 38 | 13% |
| franzor.Lizt 1.3.1 | 21 | 67% |
| oog.melee.CapuletDroid 1.1 | 13 | 92% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 1151. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 58 | 40% | 98 |
| rsalesc.melee.Monk 0.3.6c | 58 | 40% | 77 |
| oog.melee.CapuletDroid 1.1 | 11 | 8% | 12 |
| franzor.Lizt 1.3.1 | 7 | 5% | 2 |
| exauge.GateKeeper 1.1.121g | 6 | 4% | 12 |
| lrem.micro.MoggFanatic 0.2 | 4 | 3% | 4 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.6 | 82 / 210 | 3.20 | 17.1% | 32449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.1% | 82 |
| tm.Yuugao 1.0 | 2.2 | 13.5% | 52 |
| shrub.Vapour v159 | 2.8 | 11.9% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 10.7% | 20 |
| Krabb.sliNk.Garm 0.9u | 5.3 | 10.1% | 11 |
| m3thos.Eva00 1.1 | 6.2 | 9.1% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.7% | 7 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.3% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.8% | 1 |
| SHAM.WOW 1.4 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 74.9 | 12 / 35 | 5243 |
| 2 | 1 | 65.9 | 74.9 | 17 / 35 | 5276 |
| 3 | 1 | 65.5 | 72.4 | 13 / 35 | 5548 |
| 4 | 1 | 64.2 | 72.1 | 13 / 35 | 5259 |
| 5 | 1 | 66.4 | 77.8 | 14 / 35 | 5658 |
| 6 | 1 | 67.2 | 81.6 | 13 / 35 | 5465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 44 | 39% |
| shrub.Vapour v159 | 33 | 70% |
| Krabb.sliNk.Garm 0.9u | 17 | 94% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 55% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 50 | 39% | 75 |
| Krabb.sliNk.Garm 0.9u | 17 | 13% | 32 |
| shrub.Vapour v159 | 16 | 12% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 11% | 24 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 7% | 19 |
| zyx.nano.BacillusComma 1.0 | 7 | 5% | 10 |
| SHAM.WOW 1.4 | 7 | 5% | 7 |
| m3thos.Eva00 1.1 | 5 | 4% | 9 |
| qualidafial.MajorDick 1.0.1 | 3 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 66.0 | 37 / 210 | 4.06 | 13.8% | 23233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 115 |
| kc.micro.Figment 1.0 | 2.5 | 13.7% | 30 |
| hadur117.micro.Saor 0.2 | 2.5 | 13.8% | 37 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.8% | 13 |
| yagami.Tidus 0.11 | 5.0 | 10.1% | 2 |
| mc2.enemy.Original 0.9 | 5.3 | 9.2% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.7 | 6.0% | 1 |
| step.nanoPri 1.0 | 8.7 | 6.0% | 0 |
| rdm.Dueler 0.4x | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 63.8 | 6 / 35 | 3974 |
| 2 | 2 | 57.0 | 56.2 | 4 / 35 | 3830 |
| 3 | 2 | 62.0 | 70.5 | 8 / 35 | 3686 |
| 4 | 3 | 59.8 | 61.6 | 7 / 35 | 3845 |
| 5 | 2 | 63.3 | 74.3 | 7 / 35 | 3894 |
| 6 | 3 | 61.3 | 69.5 | 5 / 35 | 4004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 16% |
| kc.micro.Figment 1.0 | 27 | 59% |
| mc2.enemy.Original 0.9 | 6 | 50% |
| pedersen.Grishnakh 1.0 | 6 | 100% |
| yagami.Tidus 0.11 | 5 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 80 | 46% | 87 |
| kc.micro.Figment 1.0 | 44 | 25% | 65 |
| mc2.enemy.Original 0.9 | 10 | 6% | 14 |
| pedersen.Grishnakh 1.0 | 10 | 6% | 13 |
| robar.nano.Assertive_Melee 0.2 | 8 | 5% | 9 |
| yagami.Tidus 0.11 | 7 | 4% | 9 |
| dft.Calliope 5.6 | 5 | 3% | 5 |
| rdm.Dueler 0.4x | 5 | 3% | 4 |
| step.nanoPri 1.0 | 4 | 2% | 4 |

## Melee bench: F10

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.7 | 103 / 210 | 2.65 | 17.7% | 32084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.7% | 103 |
| DTF.Kludgy 1.2b | 1.8 | 15.2% | 56 |
| ne.Chimera 1.2 | 3.3 | 12.7% | 15 |
| ejb.Polaris 1.0.1 | 3.7 | 12.1% | 23 |
| vStar.RAFzilla 2.15 | 5.2 | 10.8% | 5 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.8% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.7 | 5.9% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.7% | 1 |
| sam.Samspin 1.0 | 8.3 | 5.7% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.0 | 24 / 35 | 5513 |
| 2 | 1 | 66.2 | 79.7 | 16 / 35 | 4898 |
| 3 | 1 | 67.6 | 83.5 | 16 / 35 | 5257 |
| 4 | 1 | 66.0 | 78.4 | 18 / 35 | 5226 |
| 5 | 1 | 67.2 | 81.3 | 17 / 35 | 5534 |
| 6 | 2 | 66.6 | 80.3 | 12 / 35 | 5656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 43 | 33% |
| ejb.Polaris 1.0.1 | 35 | 66% |
| ne.Chimera 1.2 | 28 | 89% |
| vStar.RAFzilla 2.15 | 25 | 96% |
| tvv.micro.Antares 1.1.1 | 7 | 100% |
| kurios.DOSexe .9b | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 55 | 51% | 67 |
| ejb.Polaris 1.0.1 | 18 | 17% | 42 |
| ne.Chimera 1.2 | 13 | 12% | 35 |
| vStar.RAFzilla 2.15 | 6 | 6% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 4% | 4 |
| sam.Samspin 1.0 | 4 | 4% | 4 |
| kurios.DOSexe .9b | 3 | 3% | 14 |
| donjezza.Muncho 1.0 | 3 | 3% | 3 |
| tvv.micro.Antares 1.1.1 | 1 | 1% | 10 |

## Melee bench: F11

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.3 | 45 / 210 | 3.67 | 14.8% | 25402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.8% | 96 |
| hadur117.micro.Saor 0.2 | 2.2 | 14.8% | 45 |
| cx.mini.Nimrod 0.55 | 2.8 | 12.7% | 27 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 15 |
| rdt199.Warlord 0.73 | 5.7 | 8.9% | 7 |
| br2.MobyDickBot 1.6 | 5.8 | 9.3% | 13 |
| uji.YellohFellah 1.0 | 6.7 | 8.3% | 7 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.2% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 69.5 | 6 / 35 | 4341 |
| 2 | 2 | 64.0 | 74.6 | 8 / 35 | 4639 |
| 3 | 2 | 62.1 | 70.5 | 7 / 35 | 4235 |
| 4 | 2 | 62.9 | 71.4 | 10 / 35 | 4135 |
| 5 | 2 | 61.6 | 67.6 | 8 / 35 | 4200 |
| 6 | 3 | 60.9 | 68.3 | 6 / 35 | 3852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 56 | 27% |
| djc.DynaBot 0.1.1 | 12 | 75% |
| cx.mini.Nimrod 0.55 | 12 | 83% |
| br2.MobyDickBot 1.6 | 9 | 56% |
| uji.YellohFellah 1.0 | 7 | 43% |
| rdt199.Warlord 0.73 | 5 | 60% |

Hadur died in 165 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 80 | 48% | 93 |
| cx.mini.Nimrod 0.55 | 26 | 16% | 32 |
| djc.DynaBot 0.1.1 | 14 | 8% | 20 |
| stelo.MirrorNano 1.3 | 10 | 6% | 10 |
| KiraNL.Chupacabra 0.4 | 9 | 5% | 11 |
| br2.MobyDickBot 1.6 | 8 | 5% | 15 |
| rdt199.Warlord 0.73 | 7 | 4% | 13 |
| uji.YellohFellah 1.0 | 6 | 4% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 3% | 6 |

## Melee bench: F12

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 76.0 | 82 / 210 | 3.16 | 16.0% | 22726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 16.0% | 82 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.6% | 42 |
| nat.PallasHawk 1.0 | 3.2 | 12.9% | 37 |
| darkcanuck.Leon 1.01 | 3.7 | 12.3% | 29 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 13 |
| jrm.Test0 1.0 | 6.7 | 8.0% | 1 |
| jp.Perpy 16.0 | 7.5 | 6.9% | 0 |
| cs.sheldor.Talon 1.1 | 7.7 | 7.0% | 1 |
| stuff.Vlad 0.1 | 8.8 | 6.4% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.3 | 15 / 35 | 4080 |
| 2 | 1 | 62.5 | 71.4 | 15 / 35 | 3589 |
| 3 | 1 | 62.6 | 72.7 | 12 / 35 | 3669 |
| 4 | 2 | 63.5 | 75.6 | 11 / 35 | 3782 |
| 5 | 1 | 64.4 | 74.6 | 15 / 35 | 3861 |
| 6 | 1 | 65.3 | 80.6 | 14 / 35 | 3745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 46 | 59% |
| nat.PallasHawk 1.0 | 34 | 59% |
| darkcanuck.Leon 1.01 | 27 | 70% |
| brainfade.melee.Genghis 0.36 | 10 | 80% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |

Hadur died in 128 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 44 | 34% | 67 |
| nat.PallasHawk 1.0 | 25 | 20% | 47 |
| darkcanuck.Leon 1.01 | 17 | 13% | 42 |
| brainfade.melee.Genghis 0.36 | 15 | 12% | 19 |
| jrm.Test0 1.0 | 9 | 7% | 10 |
| jp.Perpy 16.0 | 8 | 6% | 8 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 10 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 66.2 | 8 / 210 | 4.04 | 13.1% | 24328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.2 | 17.5% | 65 |
| mn.Combat 3.25.0 | 1.8 | 17.0% | 98 |
| hadur117.micro.Saor 0.2 | 3.3 | 13.1% | 8 |
| gh.micro.Gruweltje 0.7 | 4.0 | 12.1% | 18 |
| shinh.Entangled 0.3 | 4.7 | 12.1% | 17 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.7% | 3 |
| ayk.WallHugger 1.0 | 8.5 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 62.5 | 0 / 35 | 4061 |
| 2 | 4 | 59.3 | 62.5 | 0 / 35 | 4215 |
| 3 | 4 | 60.3 | 68.6 | 1 / 35 | 3924 |
| 4 | 3 | 61.3 | 70.8 | 3 / 35 | 4059 |
| 5 | 3 | 60.7 | 66.0 | 3 / 35 | 3896 |
| 6 | 3 | 60.9 | 67.0 | 1 / 35 | 4173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 29 | 3% |
| mn.Combat 3.25.0 | 17 | 18% |
| shinh.Entangled 0.3 | 6 | 33% |
| gh.micro.Gruweltje 0.7 | 6 | 17% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 77 | 38% | 79 |
| mn.Combat 3.25.0 | 57 | 28% | 59 |
| shinh.Entangled 0.3 | 25 | 12% | 28 |
| gh.micro.Gruweltje 0.7 | 16 | 8% | 18 |
| stelo.Wang 1.0 | 9 | 4% | 9 |
| apc.Colossus2 0.17 | 8 | 4% | 8 |
| maribo.FollowFire 1 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 4 | 2% | 3 |
| sample.Tracker 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 75.5 | 122 / 210 | 3.20 | 17.1% | 30595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.1% | 122 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.2% | 25 |
| catcat20.shape.Theta 0.018 | 3.2 | 12.3% | 36 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 10.1% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.8% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.5% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.2% | 8 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.9 | 20 / 35 | 4727 |
| 2 | 1 | 65.3 | 72.4 | 18 / 35 | 5008 |
| 3 | 1 | 68.8 | 83.2 | 22 / 35 | 5745 |
| 4 | 1 | 67.1 | 75.9 | 23 / 35 | 5704 |
| 5 | 1 | 62.1 | 64.1 | 17 / 35 | 4402 |
| 6 | 1 | 67.6 | 81.6 | 22 / 35 | 5009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 91% |
| catcat20.shape.Theta 0.018 | 38 | 63% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| sanyi.mikrobi.Roberto 1.0 | 6 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 47% | 103 |
| catcat20.shape.Theta 0.018 | 20 | 23% | 49 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 7% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 6% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 6% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 3% | 6 |
| pa.Improved 1.0 | 2 | 2% | 3 |
| sample.TrackFire 1.0 | 1 | 1% | 3 |

## Melee bench: F15

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.4 | 117 / 210 | 2.31 | 19.6% | 36211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.6% | 117 |
| emp.Yngwie 1.11 | 2.7 | 13.1% | 40 |
| kawigi.micro.Shiz 1.1 | 2.8 | 12.8% | 21 |
| mld.DustBunny 3.8 | 3.5 | 11.8% | 6 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.6% | 15 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.3% | 8 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.9% | 1 |
| lambdaxy.TBot 0.1 | 7.8 | 7.1% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 5.4% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.2 | 18 / 35 | 6344 |
| 2 | 1 | 67.5 | 80.3 | 15 / 35 | 5718 |
| 3 | 1 | 67.4 | 77.5 | 18 / 35 | 5594 |
| 4 | 1 | 70.7 | 88.3 | 23 / 35 | 6204 |
| 5 | 1 | 70.6 | 88.3 | 23 / 35 | 6244 |
| 6 | 1 | 70.1 | 89.2 | 20 / 35 | 6107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 73 | 64% |
| kawigi.micro.Shiz 1.1 | 31 | 87% |
| kawigi.robot.Girl 1.2 | 22 | 86% |
| mld.DustBunny 3.8 | 13 | 100% |
| cb.nano.Insomnia 1.0 | 7 | 71% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1063. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 41 | 44% | 95 |
| kawigi.micro.Shiz 1.1 | 12 | 13% | 31 |
| cb.nano.Insomnia 1.0 | 11 | 12% | 10 |
| mld.DustBunny 3.8 | 8 | 9% | 26 |
| Grystrion.TrackerWO 1.0 | 6 | 6% | 8 |
| lambdaxy.TBot 0.1 | 6 | 6% | 7 |
| kawigi.robot.Girl 1.2 | 5 | 5% | 18 |
| divineomega.TrialBot 0.003 | 3 | 3% | 13 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.7 | 84 / 210 | 2.47 | 18.7% | 34659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.7% | 84 |
| gh.Griezel 0.5.2 | 2.0 | 17.4% | 90 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.5% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.4% | 21 |
| tvv.nano.Polaris 1.2 | 5.2 | 8.9% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 8.6% | 0 |
| stelo.IntrinsicVolatility 1.4 | 7.2 | 7.2% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.5% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 5.1% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 86.7 | 16 / 35 | 6092 |
| 2 | 1 | 68.6 | 84.4 | 14 / 35 | 5928 |
| 3 | 1 | 67.9 | 82.2 | 11 / 35 | 5460 |
| 4 | 1 | 69.7 | 83.5 | 16 / 35 | 6246 |
| 5 | 1 | 66.3 | 76.8 | 13 / 35 | 5208 |
| 6 | 1 | 69.4 | 88.6 | 14 / 35 | 5725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 95 | 34% |
| techdude.forest.FlamingForest 1.1 | 23 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 100% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| tvv.nano.Polaris 1.2 | 3 | 67% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 76 | 60% | 112 |
| techdude.forest.FlamingForest 1.1 | 19 | 15% | 34 |
| bvh.fnr.Fenrir 0.36l | 9 | 7% | 11 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 7 | 6% | 24 |
| stelo.IntrinsicVolatility 1.4 | 5 | 4% | 7 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 8 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| repositorio.NanoStep 1.0 | 2 | 2% | 4 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 7 |

## Melee bench: F17

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.5 | 105 / 210 | 2.30 | 18.3% | 29483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.3% | 105 |
| et.Predator 1.8 | 2.7 | 12.7% | 26 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.3% | 25 |
| cx.BlestPain 1.41 | 4.2 | 11.6% | 25 |
| nic.Nicator 2.4 | 4.5 | 11.3% | 17 |
| ahf.NanoAndrew .4 | 5.8 | 10.2% | 8 |
| maribo.melee.BMV 0.1 | 6.8 | 8.9% | 3 |
| tex.Longbot 0.4 | 8.3 | 6.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.8% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.4 | 23 / 35 | 5127 |
| 2 | 1 | 67.3 | 83.5 | 15 / 35 | 4832 |
| 3 | 1 | 67.7 | 85.7 | 16 / 35 | 4726 |
| 4 | 1 | 66.5 | 81.0 | 15 / 35 | 4683 |
| 5 | 1 | 67.7 | 83.2 | 19 / 35 | 5146 |
| 6 | 1 | 68.5 | 87.3 | 17 / 35 | 4969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 43 | 79% |
| et.Predator 1.8 | 41 | 66% |
| nic.Nicator 2.4 | 31 | 68% |
| cx.BlestPain 1.41 | 26 | 31% |
| ahf.NanoAndrew .4 | 14 | 71% |
| maribo.melee.BMV 0.1 | 5 | 60% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1088. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 26 | 24% | 50 |
| cx.BlestPain 1.41 | 25 | 23% | 34 |
| oog.melee.Mercutio 1.0 | 22 | 21% | 53 |
| nic.Nicator 2.4 | 14 | 13% | 32 |
| ahf.NanoAndrew .4 | 9 | 8% | 22 |
| maribo.melee.BMV 0.1 | 8 | 7% | 12 |
| goblin.Bender 2.4 | 2 | 2% | 2 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.5 | 111 / 210 | 2.66 | 17.9% | 28252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 111 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.2% | 30 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.9% | 32 |
| uji.DBH 1.1 | 4.0 | 10.9% | 9 |
| spinnercat.Robovirus 2.718 | 5.2 | 10.0% | 7 |
| ratosh.Nobo 0.21 | 6.2 | 9.3% | 3 |
| sigterm.Sigterm 1.0 | 6.2 | 8.9% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.3% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.6% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 4.9% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.6 | 19 / 35 | 4483 |
| 2 | 1 | 68.7 | 84.4 | 22 / 35 | 4914 |
| 3 | 1 | 64.1 | 71.7 | 15 / 35 | 4508 |
| 4 | 1 | 67.9 | 83.5 | 21 / 35 | 4933 |
| 5 | 1 | 68.0 | 85.4 | 19 / 35 | 4948 |
| 6 | 1 | 66.2 | 82.5 | 15 / 35 | 4466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 38 | 66% |
| agd.Mooserwirt2 2.7 | 33 | 48% |
| uji.DBH 1.1 | 21 | 86% |
| spinnercat.Robovirus 2.718 | 19 | 95% |
| sigterm.Sigterm 1.0 | 17 | 94% |
| ratosh.Nobo 0.21 | 8 | 88% |
| stelo.WangRobot 1.0 | 6 | 83% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 29 | 29% | 60 |
| agd.Mooserwirt2 2.7 | 25 | 25% | 47 |
| ratosh.Nobo 0.21 | 11 | 11% | 19 |
| uji.DBH 1.1 | 9 | 9% | 21 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 9% | 13 |
| stelo.WangRobot 1.0 | 6 | 6% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 4% | 11 |
| sigterm.Sigterm 1.0 | 3 | 3% | 14 |
| spinnercat.Robovirus 2.718 | 3 | 3% | 11 |

## Melee bench: F19

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.2 | 169 / 210 | 1.79 | 20.9% | 35411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.9% | 169 |
| mld.Infinity 2.2 | 2.5 | 14.1% | 21 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.0% | 10 |
| erdnis.Rover 0.3 | 4.3 | 10.6% | 2 |
| krillr.mini.JointStrike 2.0.0 | 4.7 | 10.8% | 3 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.1% | 2 |
| mbh.Mbh 0.1 | 7.0 | 7.4% | 0 |
| pac.ABC 2.1 | 7.8 | 7.0% | 3 |
| pbg.R2D2 1.0 | 9.0 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.1 | 28 / 35 | 6047 |
| 2 | 1 | 73.1 | 97.8 | 30 / 35 | 5914 |
| 3 | 1 | 69.5 | 84.4 | 25 / 35 | 5520 |
| 4 | 1 | 71.8 | 93.3 | 30 / 35 | 5559 |
| 5 | 1 | 71.3 | 87.6 | 27 / 35 | 6107 |
| 6 | 1 | 72.2 | 93.0 | 29 / 35 | 6264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 70 | 97% |
| mld.Infinity 2.2 | 67 | 94% |
| krillr.mini.JointStrike 2.0.0 | 14 | 100% |
| erdnis.Rover 0.3 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| pac.ABC 2.1 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 11 | 27% | 36 |
| davidalves.net.DuelistMiniMelee 1.2 | 10 | 24% | 88 |
| mld.Infinity 2.2 | 8 | 20% | 29 |
| erdnis.Rover 0.3 | 4 | 10% | 20 |
| pac.ABC 2.1 | 4 | 10% | 7 |
| patson.PatsonTestBot 1.0 | 3 | 7% | 15 |
| mbh.Mbh 0.1 | 1 | 2% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.9 | 119 / 210 | 2.09 | 19.8% | 35117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.8% | 119 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 42 |
| fwb.Nine 1.0.1 | 3.3 | 10.9% | 26 |
| catcat20.Rabbit 0.001 | 4.3 | 9.8% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.1% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.7% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.5% | 3 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 19 / 35 | 6274 |
| 2 | 1 | 67.3 | 80.3 | 18 / 35 | 5223 |
| 3 | 1 | 70.6 | 88.9 | 23 / 35 | 5961 |
| 4 | 1 | 68.3 | 83.2 | 16 / 35 | 5676 |
| 5 | 1 | 69.7 | 88.6 | 20 / 35 | 5968 |
| 6 | 1 | 71.3 | 95.2 | 23 / 35 | 6015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 74 | 76% |
| fwb.Nine 1.0.1 | 36 | 47% |
| nz.jdc.nano.GridFu 1.0 | 16 | 100% |
| catcat20.Rabbit 0.001 | 13 | 46% |
| bayen.nut.Squirrel 1.615 | 12 | 100% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1179. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 42 | 46% | 89 |
| fwb.Nine 1.0.1 | 23 | 25% | 20 |
| catcat20.Rabbit 0.001 | 12 | 13% | 26 |
| nz.jdc.nano.GridFu 1.0 | 5 | 5% | 25 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 7 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 4 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 16 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 5 |

## Melee bench: F21

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.1 | 114 / 210 | 2.16 | 19.2% | 32554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.2% | 114 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 68 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.5% | 11 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 12.0% | 6 |
| eld.Hmm 1.0 | 5.5 | 8.2% | 11 |
| oa.weak.BotherBot 0.1 | 6.5 | 7.8% | 0 |
| el.JumpShoot 0.2 | 7.0 | 6.9% | 1 |
| fire219.CatBot 1.0 | 7.2 | 6.8% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.5 | 15 / 35 | 4845 |
| 2 | 1 | 70.7 | 90.8 | 22 / 35 | 5623 |
| 3 | 1 | 68.8 | 83.8 | 20 / 35 | 5337 |
| 4 | 1 | 70.5 | 89.2 | 20 / 35 | 5782 |
| 5 | 1 | 68.6 | 84.4 | 16 / 35 | 5536 |
| 6 | 1 | 70.3 | 90.8 | 21 / 35 | 5431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 95 | 60% |
| dummy.mini.Scimitar 1.01 | 27 | 93% |
| cf.RiO.RiOx 4.2.1 | 24 | 92% |
| eld.Hmm 1.0 | 12 | 50% |
| el.JumpShoot 0.2 | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 1141. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 53 | 55% | 87 |
| dummy.mini.Scimitar 1.01 | 16 | 17% | 51 |
| cf.RiO.RiOx 4.2.1 | 8 | 8% | 30 |
| eld.Hmm 1.0 | 6 | 6% | 19 |
| PSW.Relentless 0.1 | 5 | 5% | 5 |
| arthord.MannyPacquiao Beta | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 5 |
| el.JumpShoot 0.2 | 1 | 1% | 4 |

## Melee bench: F22

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 82.1 | 61 / 210 | 2.61 | 17.1% | 30025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.1% | 61 |
| pe.SandboxDT 2.71m | 1.8 | 16.7% | 77 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.4% | 36 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.5% | 28 |
| bigpete.Stewie 1.0 | 5.0 | 9.9% | 5 |
| gg.Squaraus 0.6 | 6.5 | 7.0% | 0 |
| yk.JahRoslav 1.1 | 7.0 | 6.8% | 3 |
| tad.Dalek98 0.98 | 7.7 | 6.6% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.3% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.9 | 10 / 35 | 5039 |
| 2 | 1 | 66.4 | 79.4 | 11 / 35 | 5277 |
| 3 | 1 | 67.1 | 85.1 | 9 / 35 | 4940 |
| 4 | 1 | 68.2 | 86.7 | 12 / 35 | 5093 |
| 5 | 2 | 64.4 | 73.3 | 10 / 35 | 4648 |
| 6 | 2 | 67.5 | 86.3 | 9 / 35 | 5028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 53 | 25% |
| kvk.HebusLeTroll 0.35 | 46 | 57% |
| jlm.javaDisturbance 0.59 | 27 | 44% |
| bigpete.Stewie 1.0 | 6 | 50% |
| gg.Squaraus 0.6 | 2 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 55 | 37% | 73 |
| kvk.HebusLeTroll 0.35 | 44 | 30% | 58 |
| jlm.javaDisturbance 0.59 | 31 | 21% | 47 |
| tad.Dalek98 0.98 | 11 | 7% | 13 |
| bigpete.Stewie 1.0 | 5 | 3% | 9 |
| yk.JahRoslav 1.1 | 2 | 1% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 83.8 | 96 / 210 | 2.46 | 19.1% | 35423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.1% | 96 |
| pe.SandboxLump 1.52 | 2.0 | 17.1% | 76 |
| cre.Karolos 0.32 | 3.0 | 14.1% | 22 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.4% | 7 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.4% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.1% | 2 |
| cw.megas.Blade 0.8 | 6.7 | 8.6% | 0 |
| sample.Walls 1.0 | 8.0 | 7.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 83.5 | 16 / 35 | 5847 |
| 2 | 1 | 70.7 | 84.8 | 16 / 35 | 6538 |
| 3 | 1 | 71.3 | 90.2 | 19 / 35 | 5820 |
| 4 | 1 | 68.9 | 81.6 | 15 / 35 | 5602 |
| 5 | 1 | 67.5 | 74.3 | 15 / 35 | 5746 |
| 6 | 1 | 70.5 | 88.3 | 15 / 35 | 5870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 92 | 50% |
| cre.Karolos 0.32 | 37 | 68% |
| stelo.AreaTargetingBot 1.1 | 15 | 73% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 63 | 55% | 106 |
| cre.Karolos 0.32 | 29 | 25% | 54 |
| stelo.AreaTargetingBot 1.1 | 8 | 7% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 6% | 11 |
| cw.megas.Blade 0.8 | 4 | 3% | 7 |
| stelo.RamTrackSurfer 1.2 | 3 | 3% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |
| sample.Walls 1.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 69.3 | 44 / 210 | 3.76 | 14.5% | 24177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.7 | 14.7% | 46 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.5% | 44 |
| florent.XSeries.X2 0.12 | 2.7 | 13.6% | 47 |
| davidalves.Phoenix 0.54 | 3.7 | 13.0% | 47 |
| pedersen.Ugluk 1.1.1 | 5.3 | 10.5% | 14 |
| oog.melee.Corsair 1.0 | 5.7 | 9.4% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 7.4% | 7 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.7% | 0 |
| evd.X1 0.01 | 9.2 | 5.0% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 67.3 | 7 / 35 | 3942 |
| 2 | 4 | 58.5 | 61.3 | 4 / 35 | 3703 |
| 3 | 1 | 64.3 | 76.5 | 11 / 35 | 4144 |
| 4 | 3 | 59.6 | 62.2 | 5 / 35 | 4002 |
| 5 | 1 | 64.2 | 76.8 | 12 / 35 | 4083 |
| 6 | 1 | 62.2 | 71.7 | 5 / 35 | 4303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 48% |
| davidalves.Phoenix 0.54 | 24 | 33% |
| florent.XSeries.X2 0.12 | 23 | 26% |
| stelo.SoJNanoMelee 1.1 | 9 | 67% |
| pedersen.Ugluk 1.1.1 | 7 | 29% |
| oog.melee.Corsair 1.0 | 6 | 83% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 55 | 33% | 60 |
| rz.GlowBlowMelee 1.4 | 38 | 23% | 54 |
| davidalves.Phoenix 0.54 | 31 | 19% | 38 |
| pedersen.Ugluk 1.1.1 | 14 | 8% | 19 |
| evd.X1 0.01 | 12 | 7% | 12 |
| oog.melee.Corsair 1.0 | 10 | 6% | 15 |
| stelo.SoJNanoMelee 1.1 | 4 | 2% | 7 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 4 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |

## Melee bench: F25

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.6 | 121 / 210 | 2.56 | 17.9% | 25343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 121 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.0% | 25 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.4% | 14 |
| jdw.Hurricane 1.4 | 3.3 | 12.0% | 21 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.7% | 11 |
| ds.Oo 2.2 | 6.0 | 9.3% | 12 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.5% | 4 |
| adt.Ar2 1.1 | 7.7 | 7.3% | 1 |
| awesomeness.Elite 1.0 | 8.5 | 6.8% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.6 | 17 / 35 | 4129 |
| 2 | 1 | 65.5 | 77.8 | 17 / 35 | 3942 |
| 3 | 1 | 67.3 | 85.1 | 21 / 35 | 4314 |
| 4 | 1 | 66.3 | 78.7 | 21 / 35 | 4109 |
| 5 | 1 | 69.0 | 87.3 | 24 / 35 | 4673 |
| 6 | 1 | 67.8 | 85.4 | 21 / 35 | 4176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 49 | 82% |
| voidious.micro.BlitzBat 1.05 | 29 | 93% |
| jdw.Hurricane 1.4 | 27 | 81% |
| ds.Oo 2.2 | 15 | 93% |
| gjr.Cephalosporin 0.1 | 7 | 86% |
| gre.svman4.Morfeas 1.4.1 | 6 | 50% |
| adt.Ar2 1.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 20 | 22% | 44 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 21% | 56 |
| voidious.micro.BlitzBat 1.05 | 16 | 18% | 40 |
| ds.Oo 2.2 | 12 | 13% | 29 |
| awesomeness.Elite 1.0 | 6 | 7% | 10 |
| gre.svman4.Morfeas 1.4.1 | 5 | 6% | 7 |
| gjr.Cephalosporin 0.1 | 4 | 4% | 14 |
| amk.ChumbaMini 0.2 | 4 | 4% | 4 |
| adt.Ar2 1.1 | 3 | 3% | 6 |

## Melee bench: F26

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.2 | 94 / 210 | 2.70 | 17.7% | 32813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.7% | 94 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 61 |
| shu.nitro.LENIN .T34 | 3.3 | 12.4% | 29 |
| lrem.Spectre 0.4.4 | 4.3 | 11.5% | 12 |
| js.PinBall 1.6 | 4.5 | 11.1% | 9 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.6% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.5% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 1 |
| sample.SpinBot 1.0 | 9.0 | 5.1% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 75.6 | 12 / 35 | 4786 |
| 2 | 1 | 66.9 | 78.7 | 11 / 35 | 5495 |
| 3 | 1 | 67.0 | 79.4 | 16 / 35 | 5393 |
| 4 | 1 | 69.9 | 88.9 | 21 / 35 | 5775 |
| 5 | 1 | 67.4 | 80.3 | 17 / 35 | 5640 |
| 6 | 1 | 68.6 | 84.1 | 17 / 35 | 5724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 49 | 39% |
| shu.nitro.LENIN .T34 | 46 | 70% |
| lrem.Spectre 0.4.4 | 24 | 75% |
| js.PinBall 1.6 | 14 | 57% |
| gh.mini.GrubbmOne 1.0 | 6 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 46 | 40% | 68 |
| shu.nitro.LENIN .T34 | 27 | 23% | 58 |
| js.PinBall 1.6 | 15 | 13% | 25 |
| lrem.Spectre 0.4.4 | 9 | 8% | 23 |
| gh.mini.GrubbmOne 1.0 | 6 | 5% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 5% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 3% | 11 |
| sample.SpinBot 1.0 | 3 | 3% | 3 |

## Melee bench: F27

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.7 | 117 / 210 | 2.92 | 17.2% | 26520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.2% | 117 |
| mk.Alpha 0.2.1 | 2.0 | 14.3% | 42 |
| wee.Gem 1.8.4 | 3.8 | 11.2% | 24 |
| EH.Eagle 1.0.6 | 3.8 | 11.1% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 10.3% | 13 |
| joe.ADinosaur 1.0 | 6.8 | 8.0% | 0 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.2% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 7.2 | 8.5% | 3 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.0% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.3 | 22 / 35 | 4083 |
| 2 | 1 | 66.9 | 81.0 | 22 / 35 | 4817 |
| 3 | 1 | 60.8 | 56.2 | 11 / 35 | 4357 |
| 4 | 1 | 68.8 | 90.2 | 26 / 35 | 4385 |
| 5 | 1 | 67.2 | 82.2 | 20 / 35 | 4697 |
| 6 | 1 | 65.7 | 81.3 | 16 / 35 | 4181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 59 | 76% |
| EH.Eagle 1.0.6 | 27 | 93% |
| wee.Gem 1.8.4 | 25 | 80% |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 88% |
| throxbot.ThroxBot 0.1 | 9 | 89% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 23 | 24% | 69 |
| wee.Gem 1.8.4 | 12 | 13% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 12% | 22 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 12% | 15 |
| caimano.Furia_Ceca 0.22 | 10 | 11% | 14 |
| joe.ADinosaur 1.0 | 10 | 11% | 11 |
| cs.Grudge 1.0 | 6 | 6% | 6 |
| EH.Eagle 1.0.6 | 5 | 5% | 24 |
| throxbot.ThroxBot 0.1 | 5 | 5% | 11 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.2 | 128 / 210 | 2.42 | 18.1% | 25848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 128 |
| kid.test.NightFox .2 | 2.2 | 14.0% | 25 |
| uji.Antique 1.0 | 3.2 | 12.2% | 23 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.6% | 21 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.5% | 2 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.4% | 7 |
| amk.ChumbaWumba 0.3 | 7.2 | 7.8% | 3 |
| matt.advanced.Katana 1.0 | 7.8 | 7.2% | 1 |
| stelo.PianistNano 1.2 | 9.2 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.3 | 21 / 35 | 4680 |
| 2 | 1 | 68.1 | 88.9 | 24 / 35 | 4257 |
| 3 | 1 | 66.3 | 80.6 | 17 / 35 | 4420 |
| 4 | 1 | 67.5 | 87.0 | 20 / 35 | 4198 |
| 5 | 1 | 67.3 | 83.5 | 22 / 35 | 4115 |
| 6 | 1 | 67.2 | 84.1 | 24 / 35 | 4178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 64 | 84% |
| uji.Antique 1.0 | 50 | 82% |
| qohnil.blot.BlotBot 3.61 | 17 | 29% |
| pfvicm.Sobieski 7.2.3b | 11 | 100% |
| ahr.ice.Ice 1.0.2 | 7 | 86% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| matt.advanced.Katana 1.0 | 5 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| qohnil.blot.BlotBot 3.61 | 19 | 23% | 30 |
| uji.Antique 1.0 | 18 | 22% | 68 |
| kid.test.NightFox .2 | 15 | 18% | 56 |
| pfvicm.Sobieski 7.2.3b | 13 | 16% | 24 |
| amk.ChumbaWumba 0.3 | 5 | 6% | 8 |
| stelo.PianistNano 1.2 | 5 | 6% | 6 |
| stelo.Lifestealer 1.0 | 4 | 5% | 4 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 7 |
| matt.advanced.Katana 1.0 | 1 | 1% | 7 |

## Melee bench: F29

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.1 | 75 / 210 | 2.97 | 17.1% | 28194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.1% | 75 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.1% | 63 |
| deewiant.Anomaly 0.2 | 2.7 | 14.3% | 53 |
| myl.micro.Troodon 1.10 | 4.2 | 11.1% | 4 |
| jok.PheonixM 0.1.2 | 4.8 | 10.8% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 7.2% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.2 | 5.5% | 2 |
| jangs.ns51 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.2 | 17 / 35 | 4883 |
| 2 | 2 | 65.6 | 76.2 | 14 / 35 | 4420 |
| 3 | 1 | 65.1 | 73.3 | 10 / 35 | 4799 |
| 4 | 1 | 65.9 | 77.1 | 12 / 35 | 4612 |
| 5 | 1 | 66.4 | 79.0 | 11 / 35 | 4777 |
| 6 | 1 | 66.4 | 79.7 | 11 / 35 | 4703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 63 | 52% |
| zyx.mega.YersiniaPestis 3.1 | 35 | 26% |
| myl.micro.Troodon 1.10 | 16 | 94% |
| jok.PheonixM 0.1.2 | 11 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 49 | 36% | 80 |
| zyx.mega.YersiniaPestis 3.1 | 49 | 36% | 61 |
| myl.micro.Troodon 1.10 | 17 | 13% | 26 |
| jok.PheonixM 0.1.2 | 10 | 7% | 24 |
| ph.melee.ArcherME 0.3 | 5 | 4% | 8 |
| jangs.ns51 1.0 | 4 | 3% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |

## Melee bench: F30

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 59.3 | 25 / 210 | 4.67 | 12.6% | 24986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.7 | 14.1% | 54 |
| catcat20.Matcha 0.006 | 1.8 | 13.5% | 48 |
| hadur117.micro.Saor 0.2 | 3.5 | 12.6% | 25 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.1% | 22 |
| oog.melee.Capulet 1.2 | 4.0 | 11.9% | 30 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.6% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.7% | 10 |
| tripphippy.Alice 1.1 | 8.2 | 7.8% | 6 |
| ntc.Opposite 1.5 | 8.3 | 7.8% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.8 | 64.4 | 5 / 35 | 4358 |
| 2 | 3 | 58.2 | 58.7 | 3 / 35 | 4496 |
| 3 | 5 | 54.5 | 52.4 | 4 / 35 | 3635 |
| 4 | 4 | 58.6 | 61.0 | 4 / 35 | 4038 |
| 5 | 4 | 58.4 | 60.6 | 3 / 35 | 4250 |
| 6 | 4 | 57.8 | 58.4 | 6 / 35 | 4209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 12 | 67% |
| catcat20.Matcha 0.006 | 11 | 45% |
| darkcanuck.B26354 1.06 | 10 | 10% |
| stelo.PastFuture 2.3.2 | 8 | 75% |
| intruder.PrairieWolf 2.61 | 6 | 33% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| tripphippy.Alice 1.1 | 2 | 50% |

Hadur died in 185 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 44 | 24% | 52 |
| darkcanuck.B26354 1.06 | 42 | 23% | 43 |
| oog.melee.Capulet 1.2 | 35 | 19% | 43 |
| stelo.PastFuture 2.3.2 | 24 | 13% | 29 |
| tripphippy.Alice 1.1 | 17 | 9% | 17 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 11 |
| ntc.Opposite 1.5 | 9 | 5% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 2% | 5 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 67.6 | 18 / 210 | 3.91 | 13.4% | 21572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.0% | 121 |
| hadur117.micro.Saor 0.2 | 2.5 | 13.4% | 18 |
| gh.mini.Griezel 0.2 | 2.7 | 13.2% | 44 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.3% | 7 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.1% | 11 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 5 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.2% | 4 |
| fm.mammillarias 1.3 | 8.0 | 6.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.9% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 63.5 | 4 / 35 | 3569 |
| 2 | 3 | 58.1 | 62.2 | 1 / 35 | 3651 |
| 3 | 3 | 59.8 | 66.7 | 3 / 35 | 3416 |
| 4 | 3 | 59.6 | 65.1 | 1 / 35 | 3662 |
| 5 | 2 | 61.0 | 72.1 | 3 / 35 | 3361 |
| 6 | 2 | 63.5 | 76.2 | 6 / 35 | 3913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 47 | 4% |
| gh.mini.Griezel 0.2 | 24 | 13% |
| d414.nano.Quantum 1.0.0 | 8 | 88% |
| spinnercat.micro.Tyger 0.1 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |

Hadur died in 192 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 101 | 53% | 105 |
| gh.mini.Griezel 0.2 | 35 | 18% | 38 |
| spinnercat.micro.Tyger 0.1 | 15 | 8% | 19 |
| gh.nano.Grofvuil 0.2 | 12 | 6% | 14 |
| d414.nano.Quantum 1.0.0 | 10 | 5% | 14 |
| timmit.nano.TimDog 0.33 | 8 | 4% | 8 |
| fm.mammillarias 1.3 | 7 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 78.9 | 89 / 210 | 2.90 | 16.9% | 28791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 16.9% | 89 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 14.6% | 64 |
| apc.botM 3.0 | 3.5 | 11.9% | 27 |
| lxx.ConceptA 0.8 | 4.2 | 11.2% | 9 |
| vjik.UnViolation 1.1 | 4.5 | 11.0% | 13 |
| bayen.UbaMicro 1.4 | 6.3 | 8.4% | 4 |
| panzer.Panzer 0.2 | 6.8 | 7.6% | 0 |
| yk.JahMicro 1.0 | 7.7 | 7.1% | 4 |
| conscience.Electron 1.3g | 9.3 | 5.9% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.4 | 17 / 35 | 4978 |
| 2 | 1 | 63.9 | 74.3 | 15 / 35 | 4611 |
| 3 | 1 | 65.4 | 79.7 | 13 / 35 | 4807 |
| 4 | 1 | 67.2 | 81.6 | 17 / 35 | 5232 |
| 5 | 1 | 66.0 | 82.2 | 18 / 35 | 4634 |
| 6 | 2 | 63.7 | 76.2 | 9 / 35 | 4529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 50 | 32% |
| apc.botM 3.0 | 31 | 68% |
| lxx.ConceptA 0.8 | 29 | 83% |
| vjik.UnViolation 1.1 | 16 | 69% |
| yk.JahMicro 1.0 | 10 | 60% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| panzer.Panzer 0.2 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 39% | 68 |
| lxx.ConceptA 0.8 | 21 | 17% | 34 |
| apc.botM 3.0 | 17 | 14% | 37 |
| vjik.UnViolation 1.1 | 9 | 7% | 27 |
| yk.JahMicro 1.0 | 8 | 7% | 16 |
| bayen.UbaMicro 1.4 | 6 | 5% | 9 |
| panzer.Panzer 0.2 | 6 | 5% | 7 |
| conscience.Electron 1.3g | 5 | 4% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 6 |

## Melee bench: F33

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.3 | 119 / 210 | 2.78 | 18.4% | 31410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.4% | 119 |
| maribo.Quester 0.3 | 2.0 | 15.5% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 14 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 10.9% | 12 |
| labg.Cataclysm 2.05 | 5.0 | 10.6% | 14 |
| baal.nano.N 1.42 | 6.0 | 9.2% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.6% | 6 |
| zyx.micro.Ant 1.1 | 8.5 | 5.4% | 0 |
| sanja.First 0.1 | 8.8 | 4.8% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 81.6 | 19 / 35 | 5065 |
| 2 | 1 | 65.0 | 70.5 | 16 / 35 | 4842 |
| 3 | 1 | 67.5 | 76.5 | 22 / 35 | 5090 |
| 4 | 1 | 68.4 | 81.9 | 19 / 35 | 5339 |
| 5 | 1 | 69.6 | 85.4 | 19 / 35 | 5509 |
| 6 | 1 | 70.2 | 85.7 | 24 / 35 | 5565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 53 | 81% |
| gre.svman4.Leonidas 1.3.2 | 30 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 93% |
| labg.Cataclysm 2.05 | 12 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 90% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 35 | 38% | 87 |
| labg.Cataclysm 2.05 | 16 | 17% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 11% | 39 |
| gre.svman4.Leonidas 1.3.2 | 10 | 11% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 8% | 11 |
| zyx.micro.Ant 1.1 | 5 | 5% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 5% | 5 |
| baal.nano.N 1.42 | 3 | 3% | 6 |
| sanja.First 0.1 | 1 | 1% | 2 |

## Melee bench: F34

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 74.0 | 35 / 210 | 3.34 | 15.4% | 27780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.3 | 17.3% | 93 |
| kid.Gladiator .7.2 | 2.2 | 16.3% | 55 |
| hadur117.micro.Saor 0.2 | 2.5 | 15.4% | 35 |
| jcs.Seth 1.8 | 4.3 | 11.4% | 17 |
| tcf.Reach 3 | 4.7 | 11.1% | 8 |
| cli.Dancer 1.1 | 6.0 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.9% | 1 |
| sample.RamFire 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 68.6 | 3 / 35 | 4366 |
| 2 | 3 | 61.4 | 65.1 | 4 / 35 | 4517 |
| 3 | 2 | 65.7 | 76.2 | 6 / 35 | 5047 |
| 4 | 3 | 63.9 | 72.1 | 6 / 35 | 4456 |
| 5 | 3 | 64.9 | 78.7 | 8 / 35 | 4151 |
| 6 | 1 | 67.8 | 83.2 | 8 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 53 | 25% |
| kid.Gladiator .7.2 | 35 | 29% |
| jcs.Seth 1.8 | 9 | 56% |
| tcf.Reach 3 | 5 | 60% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 68 | 39% | 82 |
| kid.Gladiator .7.2 | 62 | 35% | 71 |
| jcs.Seth 1.8 | 13 | 7% | 18 |
| tcf.Reach 3 | 10 | 6% | 14 |
| sample.RamFire 1.0 | 7 | 4% | 7 |
| ratosh.Wesco 1.4 | 7 | 4% | 7 |
| cli.Dancer 1.1 | 5 | 3% | 8 |
| amk.Punbot.Punbot 0.01 | 3 | 2% | 3 |

## Melee bench: F35

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 69.3 | 18 / 210 | 3.76 | 13.4% | 20369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 164 |
| hadur117.micro.Saor 0.2 | 2.5 | 13.4% | 18 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.5% | 15 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.9% | 9 |
| rz.HawkOnFire 0.1 | 4.3 | 11.4% | 4 |
| myl.nano.KomoriNinja 1.1 | 6.2 | 7.3% | 1 |
| wit.Chuliath 1.0 | 7.5 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.3% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 71.4 | 1 / 35 | 3217 |
| 2 | 3 | 57.4 | 60.3 | 2 / 35 | 3328 |
| 3 | 2 | 62.2 | 75.9 | 6 / 35 | 3399 |
| 4 | 2 | 60.7 | 69.2 | 3 / 35 | 3470 |
| 5 | 2 | 63.3 | 78.7 | 4 / 35 | 3641 |
| 6 | 4 | 57.5 | 60.3 | 2 / 35 | 3314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 41 | 7% |
| gh.mini.Gruwel 0.9 | 11 | 36% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 118 | 61% | 122 |
| gh.mini.Gruwel 0.9 | 19 | 10% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 8% | 22 |
| rz.HawkOnFire 0.1 | 13 | 7% | 18 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 11 | 6% | 12 |
| wit.Chuliath 1.0 | 6 | 3% | 6 |
| myl.nano.KomoriNinja 1.1 | 6 | 3% | 6 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.0 | 153 / 210 | 1.99 | 20.5% | 33465 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.5% | 153 |
| alpha.RainingFire 1.0 | 2.2 | 12.3% | 19 |
| bzdp.Pansy 2.1 | 3.3 | 11.4% | 11 |
| mz.Cork 0.1 | 4.7 | 10.3% | 6 |
| bvh.micro.Freya 0.3 | 4.8 | 10.3% | 8 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.3% | 2 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.3% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.4% | 2 |
| dl.BetterWalls 1.0 | 8.8 | 5.6% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 95.2 | 27 / 35 | 5974 |
| 2 | 1 | 71.7 | 93.7 | 26 / 35 | 5768 |
| 3 | 1 | 69.0 | 82.9 | 23 / 35 | 5450 |
| 4 | 1 | 72.0 | 96.8 | 28 / 35 | 5610 |
| 5 | 1 | 68.4 | 82.2 | 24 / 35 | 5180 |
| 6 | 1 | 69.5 | 83.2 | 25 / 35 | 5483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 92% |
| alpha.RainingFire 1.0 | 33 | 58% |
| mz.Cork 0.1 | 31 | 94% |
| bvh.micro.Freya 0.3 | 25 | 88% |
| bvh.mini.Fenrir 0.39 | 25 | 92% |
| m3thos.Eva02 0.7.1 | 11 | 91% |
| sample.MyFirstRobot 1.0 | 6 | 67% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 16 | 28% | 36 |
| bvh.mini.Fenrir 0.39 | 9 | 16% | 22 |
| bzdp.Pansy 2.1 | 8 | 14% | 50 |
| bvh.micro.Freya 0.3 | 7 | 12% | 23 |
| mz.Cork 0.1 | 5 | 9% | 39 |
| dl.BetterWalls 1.0 | 5 | 9% | 17 |
| m3thos.Eva02 0.7.1 | 4 | 7% | 15 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 2 |

## Melee bench: F37

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.0 | 126 / 210 | 3.07 | 17.5% | 32257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.5% | 126 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 11.4% | 10 |
| germ.TheMind .2 | 3.3 | 11.0% | 12 |
| EBBU.Sim2 1.02 | 4.5 | 9.8% | 5 |
| agrach.Dalek 1.0 | 4.7 | 10.0% | 23 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.2% | 14 |
| skm.Ryubot 1.0 | 7.8 | 7.8% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.9% | 1 |
| mb.Beast 0.1 | 8.3 | 7.9% | 9 |
| lmk.ACPFinal 0.1 | 8.8 | 7.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 79.7 | 23 / 35 | 5583 |
| 2 | 1 | 63.1 | 68.6 | 19 / 35 | 4942 |
| 3 | 1 | 65.8 | 78.1 | 20 / 35 | 5263 |
| 4 | 1 | 65.1 | 72.7 | 17 / 35 | 5634 |
| 5 | 1 | 67.5 | 82.9 | 23 / 35 | 5578 |
| 6 | 1 | 66.6 | 80.3 | 24 / 35 | 5257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 33 | 97% |
| stelo.UntouchableNano 1.3 | 24 | 92% |
| EBBU.Sim2 1.02 | 21 | 95% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 90% |
| skm.Ryubot 1.0 | 13 | 92% |
| agrach.Dalek 1.0 | 10 | 80% |
| mb.Beast 0.1 | 7 | 100% |
| lmk.ACPFinal 0.1 | 6 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 0% |

Hadur died in 84 of 210 rounds, at a mean tick of 314. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 16 | 19% | 17 |
| agrach.Dalek 1.0 | 14 | 17% | 32 |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 15% | 36 |
| germ.TheMind .2 | 11 | 13% | 42 |
| lmk.ACPFinal 0.1 | 10 | 12% | 17 |
| EBBU.Sim2 1.02 | 7 | 8% | 29 |
| stelo.UntouchableNano 1.3 | 7 | 8% | 19 |
| mb.Beast 0.1 | 3 | 4% | 9 |
| skm.Ryubot 1.0 | 3 | 4% | 7 |

## Melee bench: F38

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.0 | 66 / 210 | 3.16 | 15.9% | 26942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.6% | 95 |
| hadur117.micro.Saor 0.2 | 1.7 | 15.9% | 66 |
| bvh.mini.Freya 0.55 | 3.0 | 12.4% | 11 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.2% | 23 |
| cs.Wren 1.0 | 5.7 | 9.7% | 2 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.8% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.8% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.7% | 1 |
| bzdp.BoxCar 2.0 | 9.2 | 4.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 70.8 | 11 / 35 | 4293 |
| 2 | 2 | 64.9 | 78.1 | 12 / 35 | 4470 |
| 3 | 2 | 64.8 | 78.4 | 11 / 35 | 4354 |
| 4 | 1 | 63.9 | 74.9 | 12 / 35 | 4195 |
| 5 | 2 | 66.1 | 81.6 | 11 / 35 | 4749 |
| 6 | 1 | 63.8 | 72.1 | 9 / 35 | 4881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 47 | 17% |
| bts.mega.Gnarly 1.4 | 24 | 63% |
| bvh.mini.Freya 0.55 | 16 | 94% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 90% |
| cs.Wren 1.0 | 10 | 100% |
| kdf.KoulDestroyer 1.0 | 7 | 86% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 74 | 51% | 91 |
| bvh.mini.Freya 0.55 | 18 | 13% | 29 |
| bts.mega.Gnarly 1.4 | 16 | 11% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 9% | 20 |
| cs.Wren 1.0 | 8 | 6% | 14 |
| kdf.KoulDestroyer 1.0 | 7 | 5% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 7 |
| bzdp.BoxCar 2.0 | 3 | 2% | 3 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 73.7 | 63 / 210 | 3.37 | 16.1% | 29909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 16.1% | 63 |
| bvh.fry.Freya 0.82 | 1.7 | 15.2% | 36 |
| az.Ololobot 0.2.4 | 2.8 | 13.7% | 70 |
| catcat20.Lambda 0.024 | 4.2 | 10.2% | 21 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.7% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 6.7 | 8.2% | 11 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.2% | 0 |
| gimp.GimpBot 0.1 | 6.8 | 8.2% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.7% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 61.3 | 3 / 35 | 4689 |
| 2 | 1 | 65.8 | 80.3 | 10 / 35 | 5127 |
| 3 | 1 | 64.5 | 72.1 | 13 / 35 | 5064 |
| 4 | 1 | 67.6 | 85.1 | 16 / 35 | 5362 |
| 5 | 2 | 61.8 | 65.4 | 9 / 35 | 4706 |
| 6 | 1 | 65.1 | 78.1 | 12 / 35 | 4961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 41 | 73% |
| az.Ololobot 0.2.4 | 40 | 15% |
| catcat20.Lambda 0.024 | 14 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 92% |
| gimp.GimpBot 0.1 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |

Hadur died in 147 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 50 | 34% | 61 |
| bvh.fry.Freya 0.82 | 38 | 26% | 62 |
| catcat20.Lambda 0.024 | 21 | 14% | 27 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 7% | 17 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 7% | 10 |
| winamp32.micro.MicroMacro 1.0 | 7 | 5% | 11 |
| apollokidd.ApolloKidd 0.9 | 5 | 3% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 4 | 3% | 4 |
| gimp.GimpBot 0.1 | 2 | 1% | 9 |

## Melee bench: F40

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 76.0 | 104 / 210 | 3.16 | 17.1% | 28044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.1% | 104 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 15.1% | 49 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 11.9% | 21 |
| mz.AntiGrav 1.0 | 4.0 | 11.0% | 11 |
| Polkwane.SmashMelee 1.0 | 5.3 | 10.1% | 4 |
| alpha.BlackIce 1.0 | 6.2 | 9.2% | 1 |
| stelo.Randomness 1.0 | 6.3 | 9.2% | 19 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.8% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.4% | 0 |
| sample.Corners 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.3 | 21 / 35 | 4863 |
| 2 | 1 | 67.6 | 81.3 | 15 / 35 | 4866 |
| 3 | 1 | 63.8 | 69.5 | 14 / 35 | 4612 |
| 4 | 2 | 61.8 | 65.7 | 16 / 35 | 3990 |
| 5 | 1 | 67.0 | 79.0 | 21 / 35 | 4777 |
| 6 | 1 | 67.1 | 79.0 | 17 / 35 | 4936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 57 | 58% |
| kano.gamma.KanoGamma 1.8 | 23 | 78% |
| mz.AntiGrav 1.0 | 21 | 100% |
| Polkwane.SmashMelee 1.0 | 20 | 100% |
| alpha.BlackIce 1.0 | 8 | 100% |
| stelo.Randomness 1.0 | 4 | 0% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 41 | 39% | 64 |
| stelo.Randomness 1.0 | 15 | 14% | 25 |
| kano.gamma.KanoGamma 1.8 | 14 | 13% | 32 |
| mz.AntiGrav 1.0 | 12 | 11% | 28 |
| Polkwane.SmashMelee 1.0 | 10 | 9% | 24 |
| amk.superstrike.SuperStrike 0.3 | 6 | 6% | 11 |
| sample.Corners 1.0 | 3 | 3% | 8 |
| testantiswapgun.AntiSwap 1.0 | 3 | 3% | 6 |
| alpha.BlackIce 1.0 | 2 | 2% | 12 |

## Melee bench: F41

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 74.6 | 82 / 210 | 3.29 | 16.1% | 27005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.1% | 82 |
| eem.EvBotNG v12.8 | 1.8 | 15.6% | 80 |
| ary.Swarm 1.1 | 3.3 | 13.1% | 20 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.6% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.3% | 10 |
| shrub.Silver v048 | 5.8 | 9.0% | 2 |
| zyx.nano.Ant 1.1 | 7.3 | 7.3% | 0 |
| stelo.Mirror 1.1 | 8.2 | 6.3% | 2 |
| jsal.Jsalbot 1.0 | 8.5 | 6.2% | 3 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 73.0 | 11 / 35 | 4653 |
| 2 | 1 | 64.9 | 73.7 | 16 / 35 | 4224 |
| 3 | 1 | 67.1 | 81.3 | 20 / 35 | 4493 |
| 4 | 1 | 66.0 | 77.8 | 13 / 35 | 4745 |
| 5 | 2 | 64.3 | 74.3 | 12 / 35 | 4293 |
| 6 | 2 | 63.1 | 67.6 | 10 / 35 | 4597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 46 | 33% |
| lessonz.robocode.Oz 0.5.0 | 29 | 90% |
| ary.Swarm 1.1 | 23 | 70% |
| simonton.nano.MeleeSeed 1.8 | 18 | 100% |
| stelo.Mirror 1.1 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 57 | 45% | 83 |
| ary.Swarm 1.1 | 22 | 17% | 38 |
| simonton.nano.MeleeSeed 1.8 | 15 | 12% | 30 |
| lessonz.robocode.Oz 0.5.0 | 12 | 9% | 26 |
| zyx.nano.Ant 1.1 | 9 | 7% | 10 |
| stelo.Mirror 1.1 | 4 | 3% | 9 |
| shrub.Silver v048 | 3 | 2% | 7 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |
| acogdev.alpha 0.2 | 3 | 2% | 3 |

## Melee bench: F42

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.7 | 55 / 210 | 3.10 | 16.3% | 30430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 17.1% | 97 |
| hadur117.micro.Saor 0.2 | 1.7 | 16.3% | 55 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.7% | 27 |
| ara.Shera 0.88 | 3.7 | 12.7% | 24 |
| amz.NanoClone 1.41 | 5.3 | 9.2% | 1 |
| maribo.IotaCT 1.1 | 5.7 | 8.3% | 1 |
| dsw.StaticD 1.0 | 7.5 | 6.7% | 4 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.6% | 1 |
| mme.NikeEnhanced 2.0 | 9.2 | 4.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 77.5 | 8 / 35 | 5009 |
| 2 | 1 | 66.2 | 79.4 | 13 / 35 | 5136 |
| 3 | 1 | 66.1 | 77.8 | 9 / 35 | 5564 |
| 4 | 2 | 63.3 | 70.8 | 6 / 35 | 4885 |
| 5 | 2 | 65.2 | 76.8 | 9 / 35 | 4974 |
| 6 | 2 | 65.3 | 77.8 | 10 / 35 | 4862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 45 | 27% |
| maribo.mini.MiniQuester 0.1 | 32 | 66% |
| ara.Shera 0.88 | 28 | 61% |
| maribo.IotaCT 1.1 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 50% |
| dsw.StaticD 1.0 | 2 | 50% |

Hadur died in 155 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 75 | 48% | 89 |
| ara.Shera 0.88 | 34 | 22% | 52 |
| maribo.mini.MiniQuester 0.1 | 22 | 14% | 40 |
| maribo.IotaCT 1.1 | 8 | 5% | 11 |
| amz.NanoClone 1.41 | 7 | 5% | 7 |
| stelo.MirrorMicro 1.0 | 4 | 3% | 5 |
| dsw.StaticD 1.0 | 4 | 3% | 5 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 72.3 | 22 / 210 | 3.50 | 14.0% | 22138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 153 |
| hadur117.micro.Saor 0.2 | 2.2 | 14.0% | 22 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.1% | 20 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.7% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.1% | 7 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.9% | 3 |
| jab.DiamondStealer 5 | 7.5 | 7.5% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 68.9 | 7 / 35 | 3437 |
| 2 | 2 | 63.3 | 72.1 | 5 / 35 | 3798 |
| 3 | 2 | 62.4 | 69.8 | 3 / 35 | 3899 |
| 4 | 2 | 62.0 | 73.0 | 2 / 35 | 3548 |
| 5 | 3 | 61.3 | 69.5 | 2 / 35 | 3535 |
| 6 | 2 | 65.5 | 80.3 | 3 / 35 | 3921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 69 | 4% |
| dummy.micro.Sparrow 2.5 | 9 | 89% |
| brainfade.melee.Dusk 0.44 | 9 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 60% |
| mz.NanoGod 2.02 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 131 | 69% | 135 |
| brainfade.melee.Dusk 0.44 | 18 | 9% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 15 |
| dummy.micro.Sparrow 2.5 | 10 | 5% | 19 |
| mz.NanoGod 2.02 | 7 | 4% | 8 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.0 | 88 / 210 | 2.71 | 18.0% | 32112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.0% | 88 |
| stelo.Liblix 0.3.1 | 2.2 | 15.7% | 85 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.0% | 14 |
| jwirde.Gort 2.0 | 4.8 | 9.3% | 10 |
| wompi.Quokka 1.6 | 5.0 | 9.9% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.4% | 2 |
| disan.Chair 2.2.0 | 7.3 | 7.7% | 2 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.2% | 1 |
| sample.Crazy 1.0 | 9.3 | 5.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.3 | 13 / 35 | 5387 |
| 2 | 1 | 67.0 | 78.7 | 11 / 35 | 5475 |
| 3 | 1 | 66.8 | 80.3 | 15 / 35 | 5169 |
| 4 | 1 | 65.6 | 76.8 | 14 / 35 | 5072 |
| 5 | 1 | 69.6 | 89.5 | 15 / 35 | 5780 |
| 6 | 1 | 67.4 | 79.4 | 20 / 35 | 5229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 72 | 29% |
| tzu.TheArtOfWar 1.2 | 46 | 89% |
| jwirde.Gort 2.0 | 9 | 33% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 89% |
| wompi.Quokka 1.6 | 8 | 100% |
| disan.Chair 2.2.0 | 5 | 100% |
| amk.jointstrike.JointStrike 0.2 | 3 | 67% |

Hadur died in 122 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 66 | 54% | 97 |
| tzu.TheArtOfWar 1.2 | 20 | 16% | 49 |
| jwirde.Gort 2.0 | 11 | 9% | 20 |
| disan.Chair 2.2.0 | 8 | 7% | 11 |
| wompi.Quokka 1.6 | 7 | 6% | 10 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 5% | 11 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 6 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

## Melee bench: F45

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.7 | 87 / 210 | 2.38 | 19.3% | 34710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.3% | 87 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 12.7% | 97 |
| jje.BagPuss 1.2 | 3.2 | 11.3% | 3 |
| myl.nano.Graviton 1.10 | 4.2 | 10.6% | 4 |
| sul.Lunar 1.1 | 5.2 | 10.1% | 6 |
| hvilela.HVilela 0.9 | 6.7 | 8.3% | 0 |
| fm.claire 1.7 | 7.0 | 8.3% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.0% | 2 |
| wit.Deep7 2.0 | 8.8 | 6.4% | 10 |
| abud.ThirdRobo 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 79.7 | 8 / 35 | 5698 |
| 2 | 1 | 68.8 | 83.8 | 14 / 35 | 5894 |
| 3 | 1 | 67.9 | 81.9 | 15 / 35 | 5414 |
| 4 | 1 | 69.1 | 87.9 | 16 / 35 | 5622 |
| 5 | 1 | 69.8 | 86.7 | 20 / 35 | 5929 |
| 6 | 1 | 69.7 | 87.9 | 14 / 35 | 6153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 110 | 33% |
| sul.Lunar 1.1 | 16 | 100% |
| myl.nano.Graviton 1.10 | 14 | 93% |
| wit.Deep7 2.0 | 11 | 45% |
| jje.BagPuss 1.2 | 10 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 2085. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 77 | 63% | 0 |
| hvilela.HVilela 0.9 | 10 | 8% | 22 |
| wit.Deep7 2.0 | 9 | 7% | 18 |
| myl.nano.Graviton 1.10 | 8 | 7% | 33 |
| sul.Lunar 1.1 | 6 | 5% | 57 |
| jje.BagPuss 1.2 | 6 | 5% | 50 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 14 |
| fm.claire 1.7 | 2 | 2% | 10 |
| abud.ThirdRobo 1.0 | 2 | 2% | 4 |

## Melee bench: F46

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 66.4 | 19 / 210 | 4.02 | 13.7% | 25593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.5 | 16.8% | 92 |
| kc.mini.Mirage 0.2 | 1.5 | 17.1% | 81 |
| hadur117.micro.Saor 0.2 | 3.0 | 13.7% | 19 |
| mz.MicroSheep 1.0 | 4.5 | 10.5% | 1 |
| cx.Princess 1.0 | 4.7 | 10.7% | 15 |
| sadoner.killer 0.2 | 6.2 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.8% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.5 | 6.4% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 73.7 | 5 / 35 | 4495 |
| 2 | 3 | 60.6 | 62.2 | 2 / 35 | 4307 |
| 3 | 3 | 62.7 | 71.7 | 4 / 35 | 4442 |
| 4 | 3 | 60.5 | 66.3 | 4 / 35 | 4014 |
| 5 | 3 | 60.2 | 63.8 | 2 / 35 | 4133 |
| 6 | 3 | 58.9 | 60.6 | 2 / 35 | 4202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 28 | 18% |
| rsalesc.melee.Medina 0.4.5 | 24 | 17% |
| cx.Princess 1.0 | 5 | 40% |
| mz.MicroSheep 1.0 | 4 | 100% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 81 | 42% | 89 |
| rsalesc.melee.Medina 0.4.5 | 60 | 31% | 64 |
| cx.Princess 1.0 | 18 | 9% | 19 |
| sadoner.killer 0.2 | 8 | 4% | 11 |
| arthord.NanoSatanMelee Beta | 8 | 4% | 8 |
| mz.MicroSheep 1.0 | 7 | 4% | 10 |
| jeremyreeder.collective.Prophet 5 | 4 | 2% | 4 |
| kurios.DOSexe .9a | 3 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |

