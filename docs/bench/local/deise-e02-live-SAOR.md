# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 74.0 | 27 / 210 | 3.34 | 15.0% | 28190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 146 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.0% | 27 |
| sgp.JollyNinja 3.53 | 3.7 | 11.6% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.6% | 4 |
| mz.MicroGodMelee 1 | 4.8 | 10.5% | 7 |
| lorneswork.Predator 1.0 | 5.2 | 10.2% | 3 |
| adt.Ar2 1.0 | 7.2 | 7.5% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 6.2% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.2% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 77.5 | 3 / 35 | 5053 |
| 2 | 2 | 61.4 | 67.9 | 5 / 35 | 4294 |
| 3 | 2 | 64.8 | 75.6 | 5 / 35 | 5153 |
| 4 | 2 | 62.7 | 72.7 | 2 / 35 | 4419 |
| 5 | 2 | 65.3 | 77.8 | 8 / 35 | 4898 |
| 6 | 2 | 62.2 | 72.7 | 4 / 35 | 4373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 80 | 8% |
| mz.MicroGodMelee 1 | 13 | 77% |
| sgp.JollyNinja 3.53 | 11 | 55% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 75% |
| adt.Ar2 1.0 | 2 | 50% |
| lorneswork.Predator 1.0 | 1 | 0% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 63% | 122 |
| sgp.JollyNinja 3.53 | 17 | 9% | 24 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 9% | 19 |
| mz.MicroGodMelee 1 | 13 | 7% | 20 |
| lorneswork.Predator 1.0 | 8 | 4% | 11 |
| adt.Ar2 1.0 | 5 | 3% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 2% | 4 |
| skm.butterfly 1.0 | 3 | 2% | 3 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.0 | 86 / 210 | 2.71 | 17.9% | 32015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 86 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.3% | 52 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.3 | 12.5% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.8% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.8% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.7% | 3 |
| sch.Simone 0.3d | 7.2 | 7.6% | 6 |
| Noran.BitchingElk 0.054 | 7.5 | 7.8% | 11 |
| stelo.PatternRobot 1.0 | 9.0 | 6.1% | 2 |
| fullsail.SweetTea 1.1 | 9.8 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.7 | 15 / 35 | 5110 |
| 2 | 1 | 67.9 | 83.2 | 14 / 35 | 5760 |
| 3 | 1 | 69.0 | 85.7 | 23 / 35 | 5505 |
| 4 | 1 | 66.9 | 80.6 | 12 / 35 | 5313 |
| 5 | 1 | 65.6 | 77.1 | 13 / 35 | 5047 |
| 6 | 1 | 66.4 | 80.6 | 9 / 35 | 5280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 47 | 40% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 36 | 56% |
| Noran.BitchingElk 0.054 | 17 | 76% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 63% |
| sch.Simone 0.3d | 10 | 70% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| fullsail.SweetTea 1.1 | 5 | 60% |
| fnc.bandit.Bandit 5.2.0 | 3 | 0% |

Hadur died in 125 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 44 | 35% | 57 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 33 | 26% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 8% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 7% | 24 |
| sch.Simone 0.3d | 7 | 6% | 16 |
| Noran.BitchingElk 0.054 | 6 | 5% | 15 |
| stelo.PatternRobot 1.0 | 6 | 5% | 10 |
| fullsail.SweetTea 1.1 | 5 | 4% | 9 |
| fnc.bandit.Bandit 5.2.0 | 4 | 3% | 7 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 74.9 | 109 / 210 | 3.26 | 17.0% | 33068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.0% | 109 |
| radnor.DoctorBob 1.42 | 2.2 | 14.4% | 44 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.3% | 24 |
| vuen.Cake 2.51 | 3.5 | 12.1% | 23 |
| urdos.URDOS 1.3 | 4.8 | 10.1% | 5 |
| adt.Ar1 2.1 | 6.5 | 7.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.6% | 3 |
| oa.weak.FlyMk1 0.1 | 8.2 | 6.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 66.3 | 14 / 35 | 5153 |
| 2 | 1 | 67.0 | 79.0 | 20 / 35 | 5960 |
| 3 | 1 | 68.8 | 85.4 | 23 / 35 | 5952 |
| 4 | 1 | 65.8 | 74.6 | 18 / 35 | 5552 |
| 5 | 2 | 62.3 | 65.1 | 13 / 35 | 5072 |
| 6 | 1 | 66.5 | 79.0 | 21 / 35 | 5379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 40 | 85% |
| kawigi.nano.Lib 1.0 | 39 | 90% |
| radnor.DoctorBob 1.42 | 34 | 76% |
| urdos.URDOS 1.3 | 7 | 71% |
| ghent.ArthurPanzergon 1.0.0 | 5 | 60% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 494. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 26% | 57 |
| kawigi.nano.Lib 1.0 | 22 | 22% | 60 |
| vuen.Cake 2.51 | 12 | 12% | 40 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 12% | 11 |
| urdos.URDOS 1.3 | 10 | 10% | 17 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 10% | 10 |
| adt.Ar1 2.1 | 5 | 5% | 6 |
| oa.weak.FlyMk1 0.1 | 3 | 3% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.0 | 3 / 210 | 3.43 | 15.3% | 31840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 195 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.3% | 3 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 4 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 1 |
| css.Delitioner 0.11 | 6.5 | 6.8% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 74.3 | 0 / 35 | 5573 |
| 2 | 2 | 65.7 | 75.6 | 1 / 35 | 5358 |
| 3 | 2 | 64.4 | 74.3 | 1 / 35 | 5007 |
| 4 | 2 | 65.2 | 70.5 | 0 / 35 | 5502 |
| 5 | 2 | 64.9 | 74.3 | 1 / 35 | 5470 |
| 6 | 2 | 63.2 | 69.2 | 0 / 35 | 4930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 81 | 1% |
| apc.LeeroyJenkins2 1.0 | 3 | 0% |
| TNT.TNT 0.99.1 | 3 | 33% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 207 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 157 | 76% | 158 |
| apc.LeeroyJenkins2 1.0 | 19 | 9% | 19 |
| TNT.TNT 0.99.1 | 9 | 4% | 10 |
| josago.Jorgito 0.16 | 8 | 4% | 9 |
| css.Delitioner 0.11 | 6 | 3% | 6 |
| tj.zombie1n 1.0.1 | 4 | 2% | 4 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |

## Melee bench: F05

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 60.7 | 7 / 210 | 4.53 | 12.6% | 24751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.1% | 111 |
| justin.DemonicRage 3.4 | 1.8 | 17.4% | 65 |
| hadur117.micro.Saor 0.2 | 3.3 | 12.6% | 7 |
| wompi.Numbat 2.1 | 3.7 | 12.7% | 14 |
| axeBots.HataMoto 3.09 | 5.5 | 9.1% | 9 |
| ms.Ares 0.19 | 5.5 | 9.2% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.9% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.0 | 50.8 | 2 / 35 | 3981 |
| 2 | 3 | 59.7 | 63.8 | 0 / 35 | 4226 |
| 3 | 4 | 57.4 | 58.1 | 1 / 35 | 3848 |
| 4 | 3 | 59.3 | 62.5 | 0 / 35 | 4170 |
| 5 | 3 | 60.8 | 65.1 | 2 / 35 | 4137 |
| 6 | 3 | 61.0 | 64.1 | 2 / 35 | 4389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 18 | 0% |
| justin.DemonicRage 3.4 | 16 | 0% |
| wompi.Numbat 2.1 | 11 | 55% |
| ms.Ares 0.19 | 2 | 0% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 71 | 35% | 72 |
| cb.fire.Firestarter 2.0f | 54 | 27% | 54 |
| wompi.Numbat 2.1 | 30 | 15% | 36 |
| ms.Ares 0.19 | 15 | 7% | 16 |
| supersample.SuperBoxBot 1.0 | 14 | 7% | 12 |
| axeBots.HataMoto 3.09 | 9 | 4% | 10 |
| GarmBox.Oranges 1.0 | 5 | 2% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 1% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.4 | 95 / 210 | 3.12 | 16.5% | 27170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.5% | 95 |
| jekl.StoneGhost 0.7 | 2.3 | 13.8% | 27 |
| origin.SleepSiphon 1.7b | 2.7 | 13.7% | 53 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.9% | 16 |
| mld.Wisdom 1.0 | 4.8 | 10.8% | 7 |
| gg.Wolverine 2.0 | 6.5 | 8.5% | 6 |
| spinnercat.Omen 1.0 | 7.0 | 7.8% | 2 |
| DBall.NUKE 0.1 | 8.2 | 6.5% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 7.0% | 2 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.6 | 15 / 35 | 4649 |
| 2 | 1 | 67.2 | 84.4 | 19 / 35 | 4568 |
| 3 | 1 | 66.8 | 83.2 | 17 / 35 | 4723 |
| 4 | 1 | 64.3 | 72.1 | 15 / 35 | 4652 |
| 5 | 1 | 64.1 | 71.4 | 16 / 35 | 4175 |
| 6 | 1 | 62.3 | 66.7 | 13 / 35 | 4403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 39 | 87% |
| origin.SleepSiphon 1.7b | 38 | 47% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 100% |
| gg.Wolverine 2.0 | 8 | 50% |
| mld.Wisdom 1.0 | 6 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 42 | 37% | 67 |
| mld.Wisdom 1.0 | 21 | 18% | 28 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 16% | 40 |
| jekl.StoneGhost 0.7 | 16 | 14% | 41 |
| gg.Wolverine 2.0 | 12 | 10% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 8 |
| DBall.NUKE 0.1 | 3 | 3% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |
| sample.Fire 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 84.8 | 70 / 210 | 2.37 | 18.7% | 36614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.7% | 70 |
| rtk.Tachikoma 1.0 | 2.3 | 17.1% | 61 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 17.3% | 62 |
| franzor.Lizt 1.3.1 | 4.2 | 10.8% | 11 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.6% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.3% | 0 |
| sample.Target 1.0 | 9.3 | 3.1% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.0 | 85.1 | 5 / 35 | 5825 |
| 2 | 1 | 68.6 | 82.2 | 13 / 35 | 5978 |
| 3 | 1 | 69.6 | 84.8 | 13 / 35 | 5702 |
| 4 | 1 | 70.5 | 85.7 | 12 / 35 | 6673 |
| 5 | 1 | 69.7 | 86.3 | 12 / 35 | 6117 |
| 6 | 1 | 70.2 | 84.8 | 15 / 35 | 6319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 76 | 50% |
| rsalesc.melee.Monk 0.3.6c | 48 | 17% |
| oog.melee.CapuletDroid 1.1 | 15 | 87% |
| franzor.Lizt 1.3.1 | 12 | 75% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 1195. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 61 | 44% | 106 |
| rsalesc.melee.Monk 0.3.6c | 58 | 41% | 76 |
| oog.melee.CapuletDroid 1.1 | 10 | 7% | 13 |
| franzor.Lizt 1.3.1 | 5 | 4% | 2 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 5 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 5 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.7 | 97 / 210 | 2.83 | 18.1% | 33447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.1% | 97 |
| tm.Yuugao 1.0 | 2.3 | 13.9% | 54 |
| shrub.Vapour v159 | 2.8 | 12.8% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 10.6% | 18 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.0% | 13 |
| m3thos.Eva00 1.1 | 5.8 | 8.9% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 7.8% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.7% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.7% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 76.5 | 18 / 35 | 5722 |
| 2 | 1 | 67.5 | 79.7 | 14 / 35 | 5764 |
| 3 | 1 | 67.1 | 80.6 | 16 / 35 | 5198 |
| 4 | 1 | 64.2 | 71.4 | 13 / 35 | 5016 |
| 5 | 1 | 69.5 | 86.7 | 17 / 35 | 6099 |
| 6 | 1 | 68.2 | 83.2 | 19 / 35 | 5648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 45 | 42% |
| shrub.Vapour v159 | 35 | 80% |
| com.spp.robocode.MostlyHarmless 010 | 24 | 71% |
| Krabb.sliNk.Garm 0.9u | 20 | 85% |
| m3thos.Eva00 1.1 | 7 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 49 | 43% | 77 |
| com.spp.robocode.MostlyHarmless 010 | 19 | 17% | 34 |
| shrub.Vapour v159 | 12 | 11% | 39 |
| Krabb.sliNk.Garm 0.9u | 12 | 11% | 23 |
| zyx.nano.BacillusComma 1.0 | 7 | 6% | 9 |
| m3thos.Eva00 1.1 | 6 | 5% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 4% | 10 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 4 |
| SHAM.WOW 1.4 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 63.8 | 36 / 210 | 4.26 | 13.4% | 23013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 121 |
| hadur117.micro.Saor 0.2 | 2.3 | 13.4% | 36 |
| kc.micro.Figment 1.0 | 2.7 | 13.2% | 27 |
| yagami.Tidus 0.11 | 4.3 | 10.8% | 2 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.1% | 14 |
| mc2.enemy.Original 0.9 | 5.7 | 9.8% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 0 |
| step.nanoPri 1.0 | 8.3 | 6.0% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.3% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 65.7 | 8 / 35 | 4147 |
| 2 | 2 | 60.8 | 68.3 | 6 / 35 | 3723 |
| 3 | 3 | 58.5 | 62.2 | 4 / 35 | 3659 |
| 4 | 3 | 58.0 | 57.5 | 6 / 35 | 3595 |
| 5 | 2 | 58.6 | 59.4 | 4 / 35 | 4075 |
| 6 | 2 | 61.3 | 69.5 | 8 / 35 | 3814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 38 | 8% |
| kc.micro.Figment 1.0 | 26 | 50% |
| mc2.enemy.Original 0.9 | 10 | 70% |
| yagami.Tidus 0.11 | 7 | 86% |
| pedersen.Grishnakh 1.0 | 5 | 60% |
| dft.Calliope 5.6 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 38% | 68 |
| kc.micro.Figment 1.0 | 48 | 28% | 64 |
| mc2.enemy.Original 0.9 | 12 | 7% | 18 |
| pedersen.Grishnakh 1.0 | 12 | 7% | 13 |
| yagami.Tidus 0.11 | 11 | 6% | 18 |
| dft.Calliope 5.6 | 7 | 4% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7 | 4% | 8 |
| step.nanoPri 1.0 | 7 | 4% | 7 |
| rdm.Dueler 0.4x | 4 | 2% | 5 |

## Melee bench: F10

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.5 | 82 / 210 | 2.85 | 17.0% | 31763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 17.0% | 82 |
| DTF.Kludgy 1.2b | 1.5 | 16.1% | 73 |
| ne.Chimera 1.2 | 3.3 | 12.5% | 18 |
| ejb.Polaris 1.0.1 | 4.2 | 12.0% | 16 |
| vStar.RAFzilla 2.15 | 4.7 | 11.1% | 10 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.7% | 6 |
| sam.Samspin 1.0 | 7.7 | 5.8% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.6% | 2 |
| donjezza.Muncho 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.8 | 19 / 35 | 5675 |
| 2 | 1 | 67.0 | 82.5 | 15 / 35 | 5393 |
| 3 | 2 | 63.8 | 75.2 | 8 / 35 | 4810 |
| 4 | 2 | 65.1 | 74.9 | 11 / 35 | 5450 |
| 5 | 2 | 63.8 | 72.4 | 11 / 35 | 4727 |
| 6 | 1 | 68.6 | 87.0 | 18 / 35 | 5708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 68 | 31% |
| ejb.Polaris 1.0.1 | 30 | 80% |
| vStar.RAFzilla 2.15 | 21 | 95% |
| ne.Chimera 1.2 | 13 | 77% |
| tvv.micro.Antares 1.1.1 | 7 | 43% |
| donjezza.Muncho 1.0 | 3 | 67% |
| kurios.DOSexe .9b | 2 | 50% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 76 | 59% | 97 |
| ejb.Polaris 1.0.1 | 15 | 12% | 40 |
| ne.Chimera 1.2 | 12 | 9% | 22 |
| vStar.RAFzilla 2.15 | 7 | 5% | 26 |
| tvv.micro.Antares 1.1.1 | 7 | 5% | 8 |
| kurios.DOSexe .9b | 5 | 4% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 2% | 4 |
| sam.Samspin 1.0 | 2 | 2% | 3 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |

## Melee bench: F11

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 72.0 | 51 / 210 | 3.52 | 15.5% | 27343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.1% | 94 |
| hadur117.micro.Saor 0.2 | 1.7 | 15.5% | 51 |
| cx.mini.Nimrod 0.55 | 3.3 | 11.7% | 16 |
| djc.DynaBot 0.1.1 | 3.8 | 10.8% | 19 |
| uji.YellohFellah 1.0 | 6.2 | 8.6% | 7 |
| br2.MobyDickBot 1.6 | 6.2 | 9.0% | 9 |
| rdt199.Warlord 0.73 | 6.3 | 9.0% | 14 |
| KiraNL.Chupacabra 0.4 | 7.2 | 8.0% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 65.4 | 9 / 35 | 4288 |
| 2 | 2 | 63.1 | 71.4 | 4 / 35 | 4656 |
| 3 | 2 | 64.8 | 76.5 | 8 / 35 | 4759 |
| 4 | 1 | 64.1 | 74.6 | 12 / 35 | 4509 |
| 5 | 1 | 65.8 | 77.5 | 11 / 35 | 5017 |
| 6 | 2 | 60.8 | 66.3 | 7 / 35 | 4114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 16% |
| cx.mini.Nimrod 0.55 | 17 | 76% |
| uji.YellohFellah 1.0 | 11 | 82% |
| djc.DynaBot 0.1.1 | 10 | 60% |
| rdt199.Warlord 0.73 | 9 | 78% |
| br2.MobyDickBot 1.6 | 8 | 75% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 85 | 53% | 96 |
| cx.mini.Nimrod 0.55 | 18 | 11% | 26 |
| KiraNL.Chupacabra 0.4 | 13 | 8% | 13 |
| djc.DynaBot 0.1.1 | 11 | 7% | 18 |
| rdt199.Warlord 0.73 | 10 | 6% | 20 |
| br2.MobyDickBot 1.6 | 9 | 6% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 4% | 6 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| uji.YellohFellah 1.0 | 3 | 2% | 12 |

## Melee bench: F12

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.4 | 80 / 210 | 3.03 | 16.2% | 24046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.2% | 80 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.6% | 40 |
| darkcanuck.Leon 1.01 | 3.0 | 13.1% | 27 |
| nat.PallasHawk 1.0 | 3.7 | 12.6% | 44 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.7% | 14 |
| jrm.Test0 1.0 | 6.0 | 8.4% | 0 |
| jp.Perpy 16.0 | 7.5 | 6.9% | 0 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 6.0% | 5 |
| stuff.Vlad 0.1 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 78.1 | 14 / 35 | 3807 |
| 2 | 1 | 64.0 | 76.2 | 11 / 35 | 4119 |
| 3 | 1 | 63.9 | 77.8 | 13 / 35 | 3645 |
| 4 | 1 | 65.7 | 82.2 | 13 / 35 | 4237 |
| 5 | 1 | 63.5 | 72.7 | 14 / 35 | 4139 |
| 6 | 1 | 64.8 | 77.5 | 15 / 35 | 4099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 34 | 56% |
| darkcanuck.Leon 1.01 | 33 | 73% |
| nat.PallasHawk 1.0 | 32 | 50% |
| brainfade.melee.Genghis 0.36 | 17 | 76% |
| jaybot.bots.Oddball 4.0 | 6 | 67% |
| jrm.Test0 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 38 | 29% | 56 |
| nat.PallasHawk 1.0 | 34 | 26% | 51 |
| darkcanuck.Leon 1.01 | 22 | 17% | 53 |
| brainfade.melee.Genghis 0.36 | 13 | 10% | 17 |
| jrm.Test0 1.0 | 11 | 8% | 14 |
| jp.Perpy 16.0 | 5 | 4% | 6 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 5 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |

## Melee bench: F13

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 67.1 | 15 / 210 | 3.96 | 13.4% | 24109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.7% | 113 |
| ags.Glacier 0.2.11 | 1.7 | 16.9% | 51 |
| hadur117.micro.Saor 0.2 | 3.2 | 13.4% | 15 |
| shinh.Entangled 0.3 | 4.2 | 12.2% | 21 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 9 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 1 |
| ayk.WallHugger 1.0 | 7.8 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 67.0 | 2 / 35 | 4310 |
| 2 | 3 | 61.4 | 67.9 | 5 / 35 | 4245 |
| 3 | 3 | 59.9 | 64.1 | 4 / 35 | 3777 |
| 4 | 4 | 59.1 | 64.1 | 1 / 35 | 3689 |
| 5 | 3 | 61.8 | 70.8 | 1 / 35 | 4267 |
| 6 | 3 | 61.1 | 68.6 | 2 / 35 | 3821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 33 | 12% |
| ags.Glacier 0.2.11 | 20 | 20% |
| shinh.Entangled 0.3 | 7 | 71% |
| gh.micro.Gruweltje 0.7 | 2 | 0% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 72 | 37% | 76 |
| ags.Glacier 0.2.11 | 63 | 32% | 66 |
| shinh.Entangled 0.3 | 22 | 11% | 27 |
| gh.micro.Gruweltje 0.7 | 14 | 7% | 17 |
| stelo.Wang 1.0 | 12 | 6% | 12 |
| apc.Colossus2 0.17 | 6 | 3% | 6 |
| maribo.FollowFire 1 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.4 | 122 / 210 | 3.21 | 17.0% | 29722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.0% | 122 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.2% | 22 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 37 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.9% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 10.1% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.9% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.8% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.7% | 5 |
| pa.Improved 1.0 | 9.0 | 6.1% | 3 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 74.0 | 20 / 35 | 4866 |
| 2 | 1 | 68.1 | 80.3 | 22 / 35 | 5533 |
| 3 | 1 | 66.7 | 78.1 | 24 / 35 | 4768 |
| 4 | 1 | 66.9 | 79.7 | 21 / 35 | 4950 |
| 5 | 1 | 63.7 | 69.5 | 18 / 35 | 4819 |
| 6 | 1 | 64.2 | 70.8 | 17 / 35 | 4786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 90% |
| catcat20.shape.Theta 0.018 | 34 | 59% |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 36 | 41% | 100 |
| catcat20.shape.Theta 0.018 | 22 | 25% | 39 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 11% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 6% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 6% | 11 |
| pa.Improved 1.0 | 3 | 3% | 6 |
| sample.TrackFire 1.0 | 3 | 3% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 3% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 1% | 13 |

## Melee bench: F15

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 84.8 | 116 / 210 | 2.37 | 19.5% | 36514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.5% | 116 |
| emp.Yngwie 1.11 | 2.3 | 13.4% | 48 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.0% | 20 |
| mld.DustBunny 3.8 | 3.8 | 11.8% | 7 |
| kawigi.robot.Girl 1.2 | 4.8 | 9.9% | 15 |
| cb.nano.Insomnia 1.0 | 6.3 | 8.3% | 2 |
| Grystrion.TrackerWO 1.0 | 6.8 | 7.4% | 0 |
| lambdaxy.TBot 0.1 | 8.2 | 6.3% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 5.1% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.1 | 22 / 35 | 6259 |
| 2 | 1 | 67.8 | 80.0 | 17 / 35 | 5997 |
| 3 | 1 | 70.7 | 89.2 | 21 / 35 | 6182 |
| 4 | 1 | 69.1 | 84.1 | 18 / 35 | 5800 |
| 5 | 1 | 70.2 | 86.7 | 21 / 35 | 6422 |
| 6 | 1 | 67.1 | 76.5 | 17 / 35 | 5854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 58 | 60% |
| kawigi.micro.Shiz 1.1 | 41 | 98% |
| mld.DustBunny 3.8 | 17 | 94% |
| kawigi.robot.Girl 1.2 | 12 | 67% |
| cb.nano.Insomnia 1.0 | 11 | 100% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 49 | 52% | 84 |
| kawigi.robot.Girl 1.2 | 15 | 16% | 23 |
| kawigi.micro.Shiz 1.1 | 8 | 9% | 40 |
| cb.nano.Insomnia 1.0 | 7 | 7% | 7 |
| mld.DustBunny 3.8 | 4 | 4% | 31 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 4 | 4% | 6 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 6 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| divineomega.TrialBot 0.003 | 1 | 1% | 9 |

## Melee bench: F16

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.8 | 80 / 210 | 2.37 | 18.7% | 34626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.7% | 80 |
| gh.Griezel 0.5.2 | 2.0 | 16.9% | 91 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.1% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.1% | 21 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.1% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 8.7% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.4% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 5.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 5.3% | 8 |
| asd.Cthulhu 1.3 | 9.2 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 74.6 | 12 / 35 | 5521 |
| 2 | 1 | 70.0 | 87.9 | 15 / 35 | 6029 |
| 3 | 1 | 67.8 | 83.8 | 12 / 35 | 5405 |
| 4 | 1 | 68.3 | 85.1 | 13 / 35 | 5820 |
| 5 | 1 | 69.6 | 89.5 | 12 / 35 | 5882 |
| 6 | 1 | 69.5 | 87.6 | 16 / 35 | 5969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 93 | 29% |
| techdude.forest.FlamingForest 1.1 | 23 | 61% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 95% |
| divineomega.DivineBot 1.9.4.5 | 5 | 80% |
| bvh.fnr.Fenrir 0.36l | 5 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 1507. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 90 | 69% | 122 |
| techdude.forest.FlamingForest 1.1 | 15 | 12% | 28 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 8% | 26 |
| bvh.fnr.Fenrir 0.36l | 7 | 5% | 10 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 7 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 7 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 2 | 2% | 4 |
| asd.Cthulhu 1.3 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.2 | 90 / 210 | 2.96 | 17.1% | 29177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.1% | 90 |
| et.Predator 1.8 | 2.7 | 12.9% | 22 |
| cx.BlestPain 1.41 | 3.5 | 12.3% | 43 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.3% | 34 |
| nic.Nicator 2.4 | 5.0 | 11.1% | 11 |
| ahf.NanoAndrew .4 | 5.3 | 10.9% | 8 |
| maribo.melee.BMV 0.1 | 6.8 | 8.9% | 2 |
| tex.Longbot 0.4 | 8.3 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.3 | 17 / 35 | 5056 |
| 2 | 1 | 64.5 | 71.4 | 12 / 35 | 4845 |
| 3 | 1 | 66.9 | 82.2 | 15 / 35 | 4855 |
| 4 | 1 | 66.3 | 78.1 | 15 / 35 | 4759 |
| 5 | 1 | 67.8 | 82.2 | 17 / 35 | 5165 |
| 6 | 1 | 64.6 | 74.0 | 14 / 35 | 4497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 36 | 72% |
| cx.BlestPain 1.41 | 36 | 33% |
| oog.melee.Mercutio 1.0 | 34 | 71% |
| nic.Nicator 2.4 | 19 | 79% |
| ahf.NanoAndrew .4 | 11 | 100% |
| maribo.melee.BMV 0.1 | 3 | 67% |

Hadur died in 120 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 29% | 50 |
| et.Predator 1.8 | 25 | 21% | 52 |
| oog.melee.Mercutio 1.0 | 24 | 20% | 49 |
| ahf.NanoAndrew .4 | 13 | 11% | 25 |
| nic.Nicator 2.4 | 10 | 8% | 20 |
| maribo.melee.BMV 0.1 | 7 | 6% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 3 |
| goblin.Bender 2.4 | 2 | 2% | 2 |
| tex.Longbot 0.4 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.3 | 112 / 210 | 2.78 | 17.7% | 27779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.7% | 112 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.4% | 37 |
| uji.DBH 1.1 | 3.5 | 11.1% | 14 |
| agd.Mooserwirt2 2.7 | 4.0 | 11.0% | 23 |
| ratosh.Nobo 0.21 | 5.0 | 10.3% | 6 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.6% | 5 |
| sigterm.Sigterm 1.0 | 7.2 | 8.4% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.4% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.5% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.1 | 18 / 35 | 5018 |
| 2 | 1 | 67.3 | 81.3 | 20 / 35 | 5028 |
| 3 | 1 | 65.7 | 80.0 | 18 / 35 | 4254 |
| 4 | 1 | 66.6 | 83.2 | 19 / 35 | 4253 |
| 5 | 1 | 65.4 | 77.5 | 14 / 35 | 4546 |
| 6 | 1 | 67.5 | 82.5 | 23 / 35 | 4680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 36 | 69% |
| agd.Mooserwirt2 2.7 | 29 | 59% |
| uji.DBH 1.1 | 22 | 86% |
| spinnercat.Robovirus 2.718 | 18 | 94% |
| ratosh.Nobo 0.21 | 12 | 83% |
| sigterm.Sigterm 1.0 | 12 | 100% |
| stelo.WangRobot 1.0 | 9 | 89% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 32 | 33% | 64 |
| agd.Mooserwirt2 2.7 | 27 | 28% | 53 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 12% | 19 |
| uji.DBH 1.1 | 7 | 7% | 17 |
| ratosh.Nobo 0.21 | 6 | 6% | 18 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 5% | 7 |
| stelo.WangRobot 1.0 | 4 | 4% | 11 |
| spinnercat.Robovirus 2.718 | 3 | 3% | 12 |
| sigterm.Sigterm 1.0 | 2 | 2% | 9 |

## Melee bench: F19

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.3 | 164 / 210 | 1.87 | 20.6% | 34887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.6% | 164 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.2% | 17 |
| mld.Infinity 2.2 | 2.5 | 14.1% | 19 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.7% | 4 |
| erdnis.Rover 0.3 | 4.5 | 10.7% | 3 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.2% | 2 |
| mbh.Mbh 0.1 | 7.3 | 7.5% | 0 |
| pac.ABC 2.1 | 8.2 | 6.5% | 2 |
| pbg.R2D2 1.0 | 8.5 | 6.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 93.3 | 29 / 35 | 6116 |
| 2 | 1 | 71.9 | 92.1 | 32 / 35 | 5683 |
| 3 | 1 | 68.4 | 80.0 | 23 / 35 | 5475 |
| 4 | 1 | 69.8 | 85.1 | 23 / 35 | 5656 |
| 5 | 1 | 73.3 | 97.1 | 29 / 35 | 6268 |
| 6 | 1 | 71.8 | 94.3 | 28 / 35 | 5689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 73 | 97% |
| mld.Infinity 2.2 | 70 | 87% |
| erdnis.Rover 0.3 | 12 | 92% |
| krillr.mini.JointStrike 2.0.0 | 11 | 91% |
| pac.ABC 2.1 | 5 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 14 | 30% | 25 |
| davidalves.net.DuelistMiniMelee 1.2 | 9 | 19% | 95 |
| krillr.mini.JointStrike 2.0.0 | 9 | 19% | 20 |
| erdnis.Rover 0.3 | 6 | 13% | 27 |
| mbh.Mbh 0.1 | 3 | 6% | 12 |
| pbg.R2D2 1.0 | 2 | 4% | 9 |
| pac.ABC 2.1 | 2 | 4% | 9 |
| patson.PatsonTestBot 1.0 | 1 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.9 | 103 / 210 | 2.45 | 18.7% | 33362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.7% | 103 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 53 |
| fwb.Nine 1.0.1 | 3.2 | 11.9% | 30 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.3% | 1 |
| catcat20.Rabbit 0.001 | 4.7 | 9.8% | 16 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.6% | 4 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.5% | 2 |
| bayen.nut.Squirrel 1.615 | 7.8 | 7.2% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.2 | 12 / 35 | 5267 |
| 2 | 1 | 69.0 | 82.9 | 24 / 35 | 5728 |
| 3 | 1 | 70.1 | 92.7 | 17 / 35 | 5793 |
| 4 | 1 | 66.3 | 76.2 | 17 / 35 | 5194 |
| 5 | 1 | 69.8 | 86.0 | 19 / 35 | 6028 |
| 6 | 1 | 67.5 | 83.5 | 14 / 35 | 5352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 60% |
| fwb.Nine 1.0.1 | 42 | 45% |
| catcat20.Rabbit 0.001 | 18 | 61% |
| nz.jdc.nano.GridFu 1.0 | 11 | 100% |
| bayen.nut.Squirrel 1.615 | 11 | 100% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1167. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 45 | 42% | 83 |
| fwb.Nine 1.0.1 | 30 | 28% | 18 |
| catcat20.Rabbit 0.001 | 11 | 10% | 37 |
| bayen.nut.Squirrel 1.615 | 6 | 6% | 13 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 11 |
| nz.jdc.nano.GridFu 1.0 | 4 | 4% | 29 |
| ntc.ControlledChaos 1.1.4 | 4 | 4% | 5 |
| m3thos.mini.Eva01 0.5.5 | 3 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F21

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.1 | 98 / 210 | 2.34 | 18.9% | 33877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.9% | 98 |
| eem.EvBot v4.6.16 | 1.8 | 16.7% | 84 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.4% | 12 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 11.8% | 6 |
| eld.Hmm 1.0 | 5.3 | 8.2% | 8 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.7% | 2 |
| fire219.CatBot 1.0 | 7.5 | 6.7% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.4% | 0 |
| PSW.Relentless 0.1 | 8.3 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.3 | 18 / 35 | 5764 |
| 2 | 2 | 67.3 | 80.0 | 14 / 35 | 5126 |
| 3 | 1 | 68.7 | 82.5 | 16 / 35 | 5675 |
| 4 | 1 | 68.7 | 87.0 | 15 / 35 | 5501 |
| 5 | 1 | 69.0 | 86.0 | 14 / 35 | 5610 |
| 6 | 1 | 70.7 | 87.9 | 21 / 35 | 6201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 103 | 43% |
| cf.RiO.RiOx 4.2.1 | 23 | 96% |
| dummy.mini.Scimitar 1.01 | 23 | 91% |
| eld.Hmm 1.0 | 9 | 67% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1229. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 72 | 64% | 104 |
| dummy.mini.Scimitar 1.01 | 12 | 11% | 36 |
| cf.RiO.RiOx 4.2.1 | 6 | 5% | 25 |
| fire219.CatBot 1.0 | 6 | 5% | 7 |
| eld.Hmm 1.0 | 5 | 4% | 22 |
| oa.weak.BotherBot 0.1 | 4 | 4% | 5 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| arthord.MannyPacquiao Beta | 2 | 2% | 3 |

## Melee bench: F22

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.7 | 74 / 210 | 2.73 | 17.2% | 30234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.2% | 74 |
| pe.SandboxDT 2.71m | 2.2 | 16.1% | 54 |
| kvk.HebusLeTroll 0.35 | 2.5 | 14.7% | 51 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.5% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 6 |
| yk.JahRoslav 1.1 | 6.5 | 7.0% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.6% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.6% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.3 | 9 / 35 | 5196 |
| 2 | 1 | 67.1 | 80.6 | 13 / 35 | 4947 |
| 3 | 1 | 68.0 | 85.1 | 13 / 35 | 5313 |
| 4 | 1 | 67.8 | 84.4 | 11 / 35 | 5320 |
| 5 | 1 | 67.4 | 82.9 | 17 / 35 | 4738 |
| 6 | 3 | 64.1 | 71.1 | 11 / 35 | 4720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 47 | 47% |
| kvk.HebusLeTroll 0.35 | 44 | 50% |
| jlm.javaDisturbance 0.59 | 30 | 57% |
| bigpete.Stewie 1.0 | 7 | 86% |
| yk.JahRoslav 1.1 | 5 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 49 | 36% | 75 |
| pe.SandboxDT 2.71m | 43 | 32% | 67 |
| jlm.javaDisturbance 0.59 | 26 | 19% | 39 |
| gg.Squaraus 0.6 | 7 | 5% | 7 |
| bigpete.Stewie 1.0 | 4 | 3% | 12 |
| yk.JahRoslav 1.1 | 4 | 3% | 7 |
| tad.Dalek98 0.98 | 2 | 1% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 1 |

## Melee bench: F23

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 78.6 | 84 / 210 | 2.93 | 17.9% | 34054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 17.9% | 84 |
| pe.SandboxLump 1.52 | 1.5 | 17.6% | 80 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 23 |
| stelo.RamTrackSurfer 1.2 | 4.5 | 9.6% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.2% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.7% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 8.4% | 0 |
| sample.Walls 1.0 | 7.7 | 7.9% | 4 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.6 | 17 / 35 | 6040 |
| 2 | 1 | 68.8 | 80.0 | 16 / 35 | 5696 |
| 3 | 1 | 68.5 | 79.4 | 16 / 35 | 5872 |
| 4 | 2 | 66.9 | 72.7 | 11 / 35 | 5720 |
| 5 | 2 | 66.5 | 71.7 | 13 / 35 | 5347 |
| 6 | 2 | 67.0 | 79.0 | 11 / 35 | 5379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 92 | 50% |
| cre.Karolos 0.32 | 25 | 64% |
| stelo.AreaTargetingBot 1.1 | 16 | 94% |
| stelo.RamTrackSurfer 1.2 | 4 | 75% |
| sample.Walls 1.0 | 3 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 68 | 54% | 109 |
| cre.Karolos 0.32 | 21 | 17% | 34 |
| stelo.AreaTargetingBot 1.1 | 12 | 9% | 27 |
| cw.megas.Blade 0.8 | 10 | 8% | 15 |
| stelo.RamTrackSurfer 1.2 | 7 | 6% | 11 |
| sample.Walls 1.0 | 5 | 4% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 3% | 5 |

## Melee bench: F24

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 67.7 | 57 / 210 | 3.91 | 14.4% | 24114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.8 | 14.4% | 57 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.4% | 43 |
| florent.XSeries.X2 0.12 | 3.0 | 13.4% | 35 |
| davidalves.Phoenix 0.54 | 3.2 | 12.7% | 46 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.8% | 20 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 5 |
| lunchie.Lunchbox 0.93 | 7.7 | 6.7% | 1 |
| stelo.SoJNanoMelee 1.1 | 7.7 | 6.8% | 5 |
| as.FrankTheTank 1.3 | 9.0 | 5.1% | 0 |
| evd.X1 0.01 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 63.5 | 10 / 35 | 3951 |
| 2 | 1 | 64.5 | 74.6 | 15 / 35 | 4300 |
| 3 | 1 | 64.3 | 72.7 | 15 / 35 | 4324 |
| 4 | 3 | 59.3 | 64.8 | 3 / 35 | 3756 |
| 5 | 3 | 58.5 | 60.6 | 6 / 35 | 3534 |
| 6 | 1 | 62.1 | 69.8 | 8 / 35 | 4249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 32 | 59% |
| davidalves.Phoenix 0.54 | 20 | 45% |
| florent.XSeries.X2 0.12 | 18 | 39% |
| pedersen.Ugluk 1.1.1 | 11 | 64% |
| stelo.SoJNanoMelee 1.1 | 10 | 90% |
| oog.melee.Corsair 1.0 | 5 | 80% |
| lunchie.Lunchbox 0.93 | 2 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 38 | 25% | 47 |
| rz.GlowBlowMelee 1.4 | 30 | 19% | 49 |
| davidalves.Phoenix 0.54 | 30 | 19% | 42 |
| pedersen.Ugluk 1.1.1 | 22 | 14% | 26 |
| oog.melee.Corsair 1.0 | 12 | 8% | 20 |
| evd.X1 0.01 | 9 | 6% | 10 |
| stelo.SoJNanoMelee 1.1 | 8 | 5% | 9 |
| as.FrankTheTank 1.3 | 3 | 2% | 3 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.4 | 130 / 210 | 2.50 | 18.3% | 26306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.3% | 130 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.4% | 18 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.8% | 12 |
| jdw.Hurricane 1.4 | 3.5 | 11.6% | 25 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.7% | 7 |
| ds.Oo 2.2 | 6.0 | 9.1% | 10 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.3% | 7 |
| awesomeness.Elite 1.0 | 7.8 | 6.8% | 1 |
| adt.Ar2 1.1 | 8.7 | 6.5% | 1 |
| amk.ChumbaMini 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.7 | 22 / 35 | 4656 |
| 2 | 1 | 68.8 | 86.3 | 25 / 35 | 4497 |
| 3 | 1 | 67.5 | 84.1 | 21 / 35 | 4398 |
| 4 | 1 | 68.0 | 85.1 | 24 / 35 | 4146 |
| 5 | 1 | 66.2 | 79.4 | 21 / 35 | 4098 |
| 6 | 1 | 66.6 | 79.7 | 17 / 35 | 4511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 96% |
| voidious.mini.BrokenSword 2.0.3 | 41 | 93% |
| jdw.Hurricane 1.4 | 28 | 82% |
| ds.Oo 2.2 | 8 | 63% |
| adt.Ar2 1.1 | 6 | 83% |
| gre.svman4.Morfeas 1.4.1 | 6 | 67% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 18 | 23% | 40 |
| voidious.micro.BlitzBat 1.05 | 15 | 19% | 46 |
| voidious.mini.BrokenSword 2.0.3 | 14 | 18% | 56 |
| gre.svman4.Morfeas 1.4.1 | 10 | 13% | 16 |
| ds.Oo 2.2 | 8 | 10% | 18 |
| gjr.Cephalosporin 0.1 | 5 | 6% | 13 |
| adt.Ar2 1.1 | 5 | 6% | 11 |
| awesomeness.Elite 1.0 | 5 | 6% | 8 |
| amk.ChumbaMini 0.2 | 0 | 0% | 2 |

## Melee bench: F26

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.4 | 92 / 210 | 2.59 | 17.6% | 31047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.6% | 92 |
| ak.Fermat 2.0 | 2.2 | 15.3% | 59 |
| shu.nitro.LENIN .T34 | 3.0 | 12.6% | 37 |
| lrem.Spectre 0.4.4 | 4.0 | 11.8% | 15 |
| js.PinBall 1.6 | 5.5 | 10.4% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.6% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.3% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 2 |
| sample.SpinBot 1.0 | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.1 | 18 / 35 | 5221 |
| 2 | 1 | 67.4 | 81.0 | 16 / 35 | 5272 |
| 3 | 1 | 68.4 | 86.0 | 15 / 35 | 5515 |
| 4 | 1 | 67.3 | 83.8 | 18 / 35 | 4971 |
| 5 | 1 | 64.9 | 77.8 | 12 / 35 | 4426 |
| 6 | 1 | 67.4 | 80.6 | 13 / 35 | 5642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 58 | 43% |
| shu.nitro.LENIN .T34 | 33 | 64% |
| lrem.Spectre 0.4.4 | 30 | 73% |
| js.PinBall 1.6 | 14 | 93% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 56 | 47% | 80 |
| shu.nitro.LENIN .T34 | 23 | 19% | 44 |
| lrem.Spectre 0.4.4 | 12 | 10% | 27 |
| js.PinBall 1.6 | 10 | 8% | 27 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 6% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 5% | 10 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 4 |
| sample.SpinBot 1.0 | 2 | 2% | 2 |

## Melee bench: F27

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.6 | 115 / 210 | 2.92 | 17.4% | 27815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.4% | 115 |
| mk.Alpha 0.2.1 | 1.8 | 14.8% | 54 |
| EH.Eagle 1.0.6 | 3.5 | 11.1% | 9 |
| wee.Gem 1.8.4 | 4.3 | 10.5% | 17 |
| sheldor.melee.nano.TestMelee 0.1 | 6.0 | 9.4% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 8.9% | 3 |
| throxbot.ThroxBot 0.1 | 6.3 | 8.7% | 0 |
| joe.ADinosaur 1.0 | 6.8 | 8.2% | 3 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.3% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.1 | 22 / 35 | 4521 |
| 2 | 3 | 57.4 | 46.0 | 7 / 35 | 4362 |
| 3 | 1 | 68.1 | 82.5 | 22 / 35 | 5110 |
| 4 | 1 | 65.5 | 79.7 | 22 / 35 | 4273 |
| 5 | 1 | 68.9 | 89.5 | 23 / 35 | 4759 |
| 6 | 1 | 68.5 | 88.9 | 19 / 35 | 4790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 75 | 72% |
| EH.Eagle 1.0.6 | 25 | 96% |
| wee.Gem 1.8.4 | 15 | 93% |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 86% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 38 | 40% | 93 |
| joe.ADinosaur 1.0 | 11 | 12% | 12 |
| cs.Grudge 1.0 | 9 | 9% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 8 | 8% | 16 |
| wee.Gem 1.8.4 | 7 | 7% | 20 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 7% | 17 |
| throxbot.ThroxBot 0.1 | 7 | 7% | 11 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 5 |
| EH.Eagle 1.0.6 | 3 | 3% | 25 |

## Melee bench: F28

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.2 | 117 / 210 | 2.51 | 17.8% | 25261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.8% | 117 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 34 |
| uji.Antique 1.0 | 3.2 | 11.9% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 11.2% | 9 |
| qohnil.blot.BlotBot 3.61 | 4.8 | 10.6% | 22 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.8% | 2 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.0% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.5% | 1 |
| stelo.PianistNano 1.2 | 8.7 | 6.1% | 1 |
| stelo.Lifestealer 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.2 | 24 / 35 | 4121 |
| 2 | 1 | 66.5 | 84.1 | 16 / 35 | 4168 |
| 3 | 1 | 65.3 | 77.1 | 18 / 35 | 4107 |
| 4 | 1 | 66.6 | 81.0 | 19 / 35 | 4307 |
| 5 | 1 | 67.1 | 82.5 | 19 / 35 | 4253 |
| 6 | 1 | 67.5 | 84.1 | 21 / 35 | 4305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 87 | 74% |
| uji.Antique 1.0 | 32 | 91% |
| qohnil.blot.BlotBot 3.61 | 19 | 53% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 50% |
| stelo.PianistNano 1.2 | 2 | 50% |

Hadur died in 94 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 31 | 33% | 70 |
| qohnil.blot.BlotBot 3.61 | 16 | 17% | 36 |
| pfvicm.Sobieski 7.2.3b | 16 | 17% | 24 |
| uji.Antique 1.0 | 13 | 14% | 47 |
| stelo.Lifestealer 1.0 | 8 | 9% | 7 |
| amk.ChumbaWumba 0.3 | 5 | 5% | 12 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 7 |
| stelo.PianistNano 1.2 | 2 | 2% | 5 |
| matt.advanced.Katana 1.0 | 1 | 1% | 2 |

## Melee bench: F29

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.6 | 68 / 210 | 2.66 | 17.5% | 28035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.5% | 68 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.9% | 73 |
| deewiant.Anomaly 0.2 | 2.8 | 14.2% | 55 |
| myl.micro.Troodon 1.10 | 4.0 | 12.2% | 5 |
| jok.PheonixM 0.1.2 | 5.0 | 10.2% | 4 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.7% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.2 | 5.1% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.4 | 13 / 35 | 4716 |
| 2 | 2 | 66.7 | 80.0 | 9 / 35 | 4619 |
| 3 | 1 | 67.3 | 82.2 | 13 / 35 | 4674 |
| 4 | 1 | 65.2 | 76.2 | 11 / 35 | 4472 |
| 5 | 1 | 67.5 | 83.2 | 10 / 35 | 4912 |
| 6 | 1 | 67.5 | 83.5 | 12 / 35 | 4642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 58 | 50% |
| zyx.mega.YersiniaPestis 3.1 | 44 | 18% |
| myl.micro.Troodon 1.10 | 18 | 89% |
| jok.PheonixM 0.1.2 | 12 | 92% |
| jangs.ns51 1.0 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 63 | 44% | 70 |
| deewiant.Anomaly 0.2 | 51 | 36% | 82 |
| myl.micro.Troodon 1.10 | 10 | 7% | 23 |
| jok.PheonixM 0.1.2 | 9 | 6% | 21 |
| jangs.ns51 1.0 | 3 | 2% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 3 |
| DBall.Anarchy 0.1 | 2 | 1% | 4 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 3 |

## Melee bench: F30

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 59.7 | 25 / 210 | 4.62 | 12.7% | 24863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.5 | 14.3% | 65 |
| darkcanuck.B26354 1.06 | 2.3 | 13.4% | 46 |
| hadur117.micro.Saor 0.2 | 3.2 | 12.7% | 25 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.6% | 28 |
| oog.melee.Capulet 1.2 | 4.2 | 12.3% | 26 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.8% | 10 |
| ntc.Opposite 1.5 | 7.2 | 8.2% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.7% | 7 |
| tripphippy.Alice 1.1 | 8.7 | 6.8% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 58.1 | 3 / 35 | 3985 |
| 2 | 5 | 56.4 | 56.8 | 3 / 35 | 3728 |
| 3 | 2 | 58.0 | 60.0 | 5 / 35 | 4205 |
| 4 | 2 | 60.4 | 64.8 | 6 / 35 | 4287 |
| 5 | 4 | 57.6 | 57.1 | 3 / 35 | 4212 |
| 6 | 2 | 59.6 | 61.6 | 5 / 35 | 4446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 19 | 47% |
| darkcanuck.B26354 1.06 | 15 | 27% |
| catcat20.Matcha 0.006 | 13 | 8% |
| stelo.PastFuture 2.3.2 | 10 | 70% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 42 | 23% | 51 |
| catcat20.Matcha 0.006 | 41 | 22% | 43 |
| darkcanuck.B26354 1.06 | 37 | 20% | 40 |
| stelo.PastFuture 2.3.2 | 25 | 14% | 31 |
| ntc.Opposite 1.5 | 13 | 7% | 14 |
| tripphippy.Alice 1.1 | 10 | 5% | 12 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 3% | 7 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 71.2 | 26 / 210 | 3.59 | 14.1% | 22144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.0% | 124 |
| hadur117.micro.Saor 0.2 | 2.2 | 14.1% | 26 |
| gh.mini.Griezel 0.2 | 2.8 | 13.1% | 40 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.4% | 4 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.8% | 10 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.8% | 4 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.6% | 1 |
| fm.mammillarias 1.3 | 7.8 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 72.7 | 7 / 35 | 3717 |
| 2 | 2 | 62.6 | 73.3 | 5 / 35 | 3762 |
| 3 | 3 | 58.7 | 63.5 | 2 / 35 | 3587 |
| 4 | 2 | 59.3 | 64.4 | 4 / 35 | 3480 |
| 5 | 2 | 63.4 | 78.7 | 4 / 35 | 3890 |
| 6 | 2 | 62.6 | 74.6 | 4 / 35 | 3708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 46 | 9% |
| gh.mini.Griezel 0.2 | 17 | 18% |
| d414.nano.Quantum 1.0.0 | 11 | 100% |
| spinnercat.micro.Tyger 0.1 | 7 | 86% |
| gh.nano.Grofvuil 0.2 | 3 | 33% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 106 | 58% | 112 |
| gh.mini.Griezel 0.2 | 25 | 14% | 30 |
| spinnercat.micro.Tyger 0.1 | 16 | 9% | 21 |
| gh.nano.Grofvuil 0.2 | 16 | 9% | 17 |
| d414.nano.Quantum 1.0.0 | 9 | 5% | 15 |
| fm.mammillarias 1.3 | 5 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |

## Melee bench: F32

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 74.9 | 78 / 210 | 3.26 | 16.1% | 28143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.1% | 78 |
| kawigi.sbf.FloodHT 0.9.2 | 1.7 | 15.9% | 82 |
| apc.botM 3.0 | 3.0 | 12.1% | 19 |
| vjik.UnViolation 1.1 | 4.3 | 10.6% | 11 |
| lxx.ConceptA 0.8 | 4.7 | 10.6% | 6 |
| bayen.UbaMicro 1.4 | 6.8 | 7.9% | 2 |
| yk.JahMicro 1.0 | 7.2 | 7.2% | 5 |
| panzer.Panzer 0.2 | 7.7 | 7.1% | 0 |
| conscience.Electron 1.3g | 8.7 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.8% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 76.8 | 11 / 35 | 4491 |
| 2 | 2 | 62.0 | 68.3 | 8 / 35 | 4415 |
| 3 | 1 | 65.2 | 80.0 | 14 / 35 | 4568 |
| 4 | 1 | 64.1 | 73.3 | 15 / 35 | 4872 |
| 5 | 2 | 62.3 | 68.3 | 11 / 35 | 4609 |
| 6 | 1 | 67.5 | 82.9 | 19 / 35 | 5188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 70 | 31% |
| apc.botM 3.0 | 20 | 90% |
| lxx.ConceptA 0.8 | 16 | 94% |
| vjik.UnViolation 1.1 | 12 | 92% |
| panzer.Panzer 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| yk.JahMicro 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 136 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 65 | 48% | 91 |
| lxx.ConceptA 0.8 | 21 | 15% | 27 |
| vjik.UnViolation 1.1 | 11 | 8% | 28 |
| conscience.Electron 1.3g | 9 | 7% | 10 |
| panzer.Panzer 0.2 | 9 | 7% | 9 |
| apc.botM 3.0 | 8 | 6% | 28 |
| bayen.UbaMicro 1.4 | 8 | 6% | 9 |
| yk.JahMicro 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |

## Melee bench: F33

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.8 | 111 / 210 | 2.73 | 18.2% | 30568 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.2% | 111 |
| maribo.Quester 0.3 | 1.8 | 15.9% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.5% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.0% | 17 |
| labg.Cataclysm 2.05 | 5.3 | 10.3% | 9 |
| baal.nano.N 1.42 | 6.0 | 9.0% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.3% | 2 |
| zyx.micro.Ant 1.1 | 8.3 | 5.8% | 1 |
| sanja.First 0.1 | 8.7 | 5.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 75.9 | 16 / 35 | 5123 |
| 2 | 1 | 69.3 | 86.0 | 20 / 35 | 5240 |
| 3 | 1 | 68.7 | 82.9 | 20 / 35 | 5426 |
| 4 | 2 | 65.5 | 74.3 | 16 / 35 | 4536 |
| 5 | 1 | 68.8 | 84.4 | 20 / 35 | 5068 |
| 6 | 1 | 68.2 | 81.3 | 19 / 35 | 5175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 67 | 72% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 90% |
| gre.svman4.Leonidas 1.3.2 | 19 | 79% |
| labg.Cataclysm 2.05 | 10 | 80% |
| sanja.First 0.1 | 5 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 100% |
| baal.nano.N 1.42 | 4 | 75% |

Hadur died in 99 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 47 | 47% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 11% | 42 |
| labg.Cataclysm 2.05 | 11 | 11% | 22 |
| gre.svman4.Leonidas 1.3.2 | 10 | 10% | 18 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 6% | 7 |
| zyx.micro.Ant 1.1 | 6 | 6% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 5% | 8 |
| baal.nano.N 1.42 | 3 | 3% | 6 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.9 | 29 / 210 | 3.53 | 15.1% | 27759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 16.4% | 86 |
| kid.Gladiator .7.2 | 1.5 | 16.2% | 61 |
| hadur117.micro.Saor 0.2 | 3.0 | 15.1% | 29 |
| tcf.Reach 3 | 4.7 | 11.0% | 13 |
| jcs.Seth 1.8 | 5.0 | 11.1% | 14 |
| cli.Dancer 1.1 | 5.3 | 10.4% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 7.6% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.7 | 78.4 | 5 / 35 | 4922 |
| 2 | 3 | 63.4 | 72.7 | 4 / 35 | 4474 |
| 3 | 3 | 59.4 | 58.7 | 4 / 35 | 4010 |
| 4 | 3 | 64.5 | 72.4 | 4 / 35 | 4931 |
| 5 | 3 | 63.4 | 72.4 | 6 / 35 | 4340 |
| 6 | 3 | 66.0 | 76.8 | 6 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 43 | 19% |
| kid.Gladiator .7.2 | 41 | 27% |
| tcf.Reach 3 | 7 | 29% |
| jcs.Seth 1.8 | 6 | 67% |
| cli.Dancer 1.1 | 4 | 25% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 70 | 39% | 78 |
| stelo.Spread 0.9 | 62 | 34% | 70 |
| tcf.Reach 3 | 18 | 10% | 22 |
| jcs.Seth 1.8 | 9 | 5% | 13 |
| cli.Dancer 1.1 | 8 | 4% | 10 |
| sample.RamFire 1.0 | 6 | 3% | 6 |
| ratosh.Wesco 1.4 | 3 | 2% | 6 |
| sample.VelociRobot 1.0 | 3 | 2% | 3 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 73.1 | 17 / 210 | 3.42 | 14.1% | 21416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 157 |
| hadur117.micro.Saor 0.2 | 2.5 | 14.1% | 17 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.4% | 22 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.4% | 10 |
| rz.HawkOnFire 0.1 | 4.5 | 11.2% | 2 |
| wit.Chuliath 1.0 | 6.8 | 7.0% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 67.0 | 5 / 35 | 3474 |
| 2 | 3 | 62.6 | 75.2 | 1 / 35 | 3718 |
| 3 | 3 | 62.3 | 74.0 | 1 / 35 | 3728 |
| 4 | 3 | 59.9 | 67.6 | 2 / 35 | 3337 |
| 5 | 2 | 63.7 | 79.4 | 3 / 35 | 3764 |
| 6 | 2 | 62.3 | 75.6 | 5 / 35 | 3395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 40 | 5% |
| gh.mini.Gruwel 0.9 | 13 | 15% |
| rz.HawkOnFire 0.1 | 9 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 75% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 193 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 123 | 64% | 125 |
| gh.mini.Gruwel 0.9 | 31 | 16% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 11% | 27 |
| rz.HawkOnFire 0.1 | 4 | 2% | 9 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 4 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |

## Melee bench: F36

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 87.7 | 151 / 210 | 2.10 | 20.2% | 33488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.2% | 151 |
| bzdp.Pansy 2.1 | 2.5 | 12.1% | 12 |
| alpha.RainingFire 1.0 | 3.5 | 11.6% | 13 |
| mz.Cork 0.1 | 4.0 | 11.0% | 7 |
| bvh.micro.Freya 0.3 | 5.0 | 10.2% | 13 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.4% | 3 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.5% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 5.2% | 1 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 95.2 | 31 / 35 | 6244 |
| 2 | 1 | 71.2 | 89.8 | 28 / 35 | 5671 |
| 3 | 1 | 71.8 | 94.3 | 29 / 35 | 5800 |
| 4 | 1 | 69.1 | 83.5 | 21 / 35 | 5588 |
| 5 | 1 | 66.1 | 75.2 | 19 / 35 | 4845 |
| 6 | 1 | 69.8 | 88.3 | 23 / 35 | 5340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 92% |
| mz.Cork 0.1 | 28 | 93% |
| bvh.micro.Freya 0.3 | 26 | 88% |
| bvh.mini.Fenrir 0.39 | 22 | 100% |
| alpha.RainingFire 1.0 | 17 | 76% |
| m3thos.Eva02 0.7.1 | 15 | 80% |
| sample.MyFirstRobot 1.0 | 10 | 70% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 14 | 23% | 28 |
| bzdp.Pansy 2.1 | 8 | 13% | 53 |
| mz.Cork 0.1 | 8 | 13% | 35 |
| bvh.micro.Freya 0.3 | 8 | 13% | 25 |
| bvh.mini.Fenrir 0.39 | 8 | 13% | 19 |
| m3thos.Eva02 0.7.1 | 5 | 8% | 21 |
| squidM.TentalceMeleeNano 1.1 | 4 | 7% | 6 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 9 |
| dl.BetterWalls 1.0 | 2 | 3% | 13 |

## Melee bench: F37

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.1 | 120 / 210 | 3.06 | 17.5% | 32699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.5% | 120 |
| germ.TheMind .2 | 2.3 | 11.6% | 24 |
| EBBU.Sim2 1.02 | 3.3 | 10.6% | 14 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.8 | 10.0% | 10 |
| agrach.Dalek 1.0 | 5.7 | 9.4% | 15 |
| lmk.ACPFinal 0.1 | 6.7 | 8.7% | 8 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.6% | 10 |
| mb.Beast 0.1 | 7.0 | 8.4% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.7% | 0 |
| skm.Ryubot 1.0 | 8.8 | 7.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 79.7 | 20 / 35 | 5845 |
| 2 | 1 | 63.3 | 69.5 | 19 / 35 | 4927 |
| 3 | 1 | 66.5 | 81.3 | 20 / 35 | 5497 |
| 4 | 1 | 67.6 | 81.6 | 22 / 35 | 5875 |
| 5 | 1 | 65.9 | 77.5 | 20 / 35 | 5324 |
| 6 | 1 | 64.6 | 73.3 | 19 / 35 | 5231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 30 | 97% |
| EBBU.Sim2 1.02 | 26 | 92% |
| mb.Beast 0.1 | 16 | 100% |
| stelo.UntouchableNano 1.3 | 15 | 87% |
| skm.Ryubot 1.0 | 14 | 93% |
| lmk.ACPFinal 0.1 | 13 | 92% |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 80% |
| agrach.Dalek 1.0 | 7 | 71% |

Hadur died in 90 of 210 rounds, at a mean tick of 354. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 20 | 22% | 36 |
| germ.TheMind .2 | 13 | 14% | 33 |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 14% | 24 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 14% | 15 |
| EBBU.Sim2 1.02 | 8 | 9% | 24 |
| lmk.ACPFinal 0.1 | 8 | 9% | 17 |
| stelo.UntouchableNano 1.3 | 7 | 8% | 21 |
| mb.Beast 0.1 | 4 | 4% | 20 |
| skm.Ryubot 1.0 | 4 | 4% | 17 |

## Melee bench: F38

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 73.3 | 47 / 210 | 3.40 | 15.1% | 25640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 17.1% | 104 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.1% | 47 |
| bvh.mini.Freya 0.55 | 2.8 | 13.2% | 16 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.3% | 21 |
| cs.Wren 1.0 | 5.3 | 10.2% | 8 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.5% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.3 | 9.1% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.6% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 75.6 | 8 / 35 | 4387 |
| 2 | 2 | 63.0 | 73.3 | 5 / 35 | 4304 |
| 3 | 2 | 63.3 | 72.4 | 7 / 35 | 4309 |
| 4 | 1 | 62.5 | 71.7 | 11 / 35 | 3930 |
| 5 | 2 | 63.7 | 72.1 | 9 / 35 | 4569 |
| 6 | 2 | 63.2 | 74.6 | 7 / 35 | 4141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 53 | 21% |
| bts.mega.Gnarly 1.4 | 13 | 62% |
| cs.Wren 1.0 | 12 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 83% |
| bvh.mini.Freya 0.55 | 12 | 67% |
| kdf.KoulDestroyer 1.0 | 3 | 33% |

Hadur died in 163 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 84 | 52% | 98 |
| bvh.mini.Freya 0.55 | 20 | 12% | 26 |
| bts.mega.Gnarly 1.4 | 18 | 11% | 26 |
| cs.Wren 1.0 | 14 | 9% | 22 |
| kdf.KoulDestroyer 1.0 | 11 | 7% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 4% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 3% | 6 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.9 | 72 / 210 | 2.90 | 17.4% | 32313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 72 |
| bvh.fry.Freya 0.82 | 2.0 | 14.9% | 35 |
| az.Ololobot 0.2.4 | 3.2 | 13.2% | 67 |
| catcat20.Lambda 0.024 | 4.0 | 10.7% | 22 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.8% | 1 |
| gimp.GimpBot 0.1 | 6.0 | 8.5% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.6% | 9 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.6% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.2% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.9 | 11 / 35 | 5195 |
| 2 | 1 | 65.4 | 74.0 | 14 / 35 | 5237 |
| 3 | 1 | 67.5 | 83.2 | 12 / 35 | 5755 |
| 4 | 1 | 68.2 | 87.3 | 17 / 35 | 5296 |
| 5 | 1 | 64.5 | 70.5 | 7 / 35 | 5670 |
| 6 | 1 | 65.2 | 76.5 | 11 / 35 | 5160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 34 | 68% |
| az.Ololobot 0.2.4 | 33 | 24% |
| catcat20.Lambda 0.024 | 26 | 77% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 77% |
| gimp.GimpBot 0.1 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 45 | 33% | 60 |
| bvh.fry.Freya 0.82 | 39 | 28% | 63 |
| catcat20.Lambda 0.024 | 23 | 17% | 35 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 9% | 20 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 4% | 6 |
| winamp32.micro.MicroMacro 1.0 | 5 | 4% | 8 |
| gimp.GimpBot 0.1 | 3 | 2% | 9 |
| apollokidd.ApolloKidd 0.9 | 3 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 3 |

## Melee bench: F40

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.8 | 107 / 210 | 2.90 | 17.5% | 28465 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.5% | 107 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 51 |
| Polkwane.SmashMelee 1.0 | 4.0 | 10.9% | 8 |
| kano.gamma.KanoGamma 1.8 | 4.0 | 11.4% | 17 |
| mz.AntiGrav 1.0 | 4.5 | 11.0% | 12 |
| stelo.Randomness 1.0 | 5.8 | 9.5% | 12 |
| alpha.BlackIce 1.0 | 6.7 | 8.7% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.7% | 1 |
| sample.Corners 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 77.1 | 18 / 35 | 4571 |
| 2 | 1 | 65.6 | 76.5 | 16 / 35 | 4537 |
| 3 | 1 | 67.2 | 77.1 | 16 / 35 | 5237 |
| 4 | 1 | 68.3 | 85.1 | 18 / 35 | 5049 |
| 5 | 1 | 68.0 | 83.5 | 23 / 35 | 4823 |
| 6 | 1 | 64.7 | 73.7 | 16 / 35 | 4248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 53% |
| kano.gamma.KanoGamma 1.8 | 33 | 82% |
| Polkwane.SmashMelee 1.0 | 26 | 96% |
| mz.AntiGrav 1.0 | 14 | 100% |
| stelo.Randomness 1.0 | 10 | 70% |
| alpha.BlackIce 1.0 | 5 | 100% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 46 | 45% | 66 |
| kano.gamma.KanoGamma 1.8 | 15 | 15% | 43 |
| stelo.Randomness 1.0 | 15 | 15% | 25 |
| Polkwane.SmashMelee 1.0 | 9 | 9% | 19 |
| alpha.BlackIce 1.0 | 8 | 8% | 16 |
| mz.AntiGrav 1.0 | 6 | 6% | 21 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 10 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 1 | 1% | 4 |

## Melee bench: F41

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.3 | 71 / 210 | 3.40 | 16.0% | 28412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 16.5% | 92 |
| hadur117.micro.Saor 0.2 | 1.7 | 16.0% | 71 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 12.9% | 25 |
| ary.Swarm 1.1 | 3.8 | 12.4% | 8 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 9.8% | 8 |
| shrub.Silver v048 | 5.8 | 9.4% | 0 |
| zyx.nano.Ant 1.1 | 7.2 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.3 | 6.0% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 6.3% | 5 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 67.0 | 8 / 35 | 4204 |
| 2 | 2 | 64.0 | 71.4 | 12 / 35 | 4482 |
| 3 | 2 | 65.2 | 72.7 | 15 / 35 | 4878 |
| 4 | 2 | 63.1 | 67.9 | 7 / 35 | 4806 |
| 5 | 1 | 67.5 | 81.6 | 18 / 35 | 4952 |
| 6 | 1 | 66.7 | 79.0 | 11 / 35 | 5090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 50 | 36% |
| lessonz.robocode.Oz 0.5.0 | 22 | 82% |
| ary.Swarm 1.1 | 21 | 86% |
| simonton.nano.MeleeSeed 1.8 | 13 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| shrub.Silver v048 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 65 | 47% | 89 |
| lessonz.robocode.Oz 0.5.0 | 21 | 15% | 31 |
| simonton.nano.MeleeSeed 1.8 | 19 | 14% | 30 |
| ary.Swarm 1.1 | 14 | 10% | 28 |
| zyx.nano.Ant 1.1 | 12 | 9% | 12 |
| stelo.Mirror 1.1 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |
| acogdev.alpha 0.2 | 2 | 1% | 3 |
| shrub.Silver v048 | 1 | 1% | 8 |

## Melee bench: F42

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 74.3 | 42 / 210 | 3.31 | 15.8% | 30373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 104 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.8% | 42 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.2% | 25 |
| ara.Shera 0.88 | 3.7 | 12.8% | 31 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 2 |
| maribo.IotaCT 1.1 | 6.2 | 7.9% | 0 |
| dsw.StaticD 1.0 | 7.0 | 7.3% | 4 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.8% | 2 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 75.2 | 4 / 35 | 4995 |
| 2 | 2 | 64.5 | 74.6 | 10 / 35 | 4944 |
| 3 | 2 | 64.6 | 75.2 | 7 / 35 | 5240 |
| 4 | 2 | 64.2 | 73.0 | 7 / 35 | 5030 |
| 5 | 2 | 65.4 | 76.2 | 9 / 35 | 5344 |
| 6 | 2 | 63.4 | 71.7 | 5 / 35 | 4820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 49 | 35% |
| ara.Shera 0.88 | 24 | 50% |
| maribo.mini.MiniQuester 0.1 | 18 | 44% |
| amz.NanoClone 1.41 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| dsw.StaticD 1.0 | 2 | 50% |
| stelo.MirrorMicro 1.0 | 1 | 0% |

Hadur died in 168 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 83 | 49% | 101 |
| ara.Shera 0.88 | 37 | 22% | 50 |
| maribo.mini.MiniQuester 0.1 | 27 | 16% | 31 |
| amz.NanoClone 1.41 | 8 | 5% | 10 |
| dsw.StaticD 1.0 | 5 | 3% | 8 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 4 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 68.5 | 18 / 210 | 3.84 | 13.5% | 22062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 166 |
| hadur117.micro.Saor 0.2 | 2.0 | 13.5% | 18 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.4% | 14 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.6% | 0 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.7% | 0 |
| mz.NanoGod 2.02 | 7.3 | 8.1% | 2 |
| jab.DiamondStealer 5 | 7.7 | 7.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 72.7 | 4 / 35 | 3670 |
| 2 | 2 | 63.2 | 72.7 | 6 / 35 | 3699 |
| 3 | 2 | 61.9 | 70.2 | 1 / 35 | 3794 |
| 4 | 2 | 60.3 | 62.9 | 1 / 35 | 3676 |
| 5 | 2 | 60.5 | 67.3 | 4 / 35 | 3413 |
| 6 | 2 | 61.1 | 65.1 | 2 / 35 | 3810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 50 | 4% |
| brainfade.melee.Dusk 0.44 | 11 | 64% |
| dummy.micro.Sparrow 2.5 | 8 | 63% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 130 | 68% | 133 |
| brainfade.melee.Dusk 0.44 | 21 | 11% | 27 |
| wcsv.melee.EngineerMelee 0.1 | 18 | 9% | 20 |
| dummy.micro.Sparrow 2.5 | 10 | 5% | 16 |
| mz.NanoGod 2.02 | 8 | 4% | 9 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.6 | 93 / 210 | 2.57 | 18.3% | 33079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.3% | 93 |
| stelo.Liblix 0.3.1 | 2.0 | 16.4% | 87 |
| tzu.TheArtOfWar 1.2 | 3.2 | 12.3% | 18 |
| wompi.Quokka 1.6 | 4.0 | 10.1% | 6 |
| jwirde.Gort 2.0 | 5.2 | 9.4% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 9.1% | 1 |
| disan.Chair 2.2.0 | 7.5 | 7.9% | 1 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.1% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.9% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 77.5 | 13 / 35 | 5268 |
| 2 | 1 | 66.9 | 79.7 | 16 / 35 | 5157 |
| 3 | 1 | 68.6 | 83.2 | 13 / 35 | 6116 |
| 4 | 1 | 68.5 | 85.7 | 17 / 35 | 5419 |
| 5 | 1 | 70.0 | 89.2 | 19 / 35 | 5846 |
| 6 | 1 | 67.2 | 80.3 | 15 / 35 | 5273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 90 | 40% |
| tzu.TheArtOfWar 1.2 | 46 | 83% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| wompi.Quokka 1.6 | 6 | 67% |
| disan.Chair 2.2.0 | 4 | 100% |
| jwirde.Gort 2.0 | 3 | 67% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 70 | 58% | 107 |
| tzu.TheArtOfWar 1.2 | 22 | 18% | 55 |
| stf.PanzerGeneral 0.1 | 6 | 5% | 8 |
| jwirde.Gort 2.0 | 5 | 4% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 4% | 8 |
| wompi.Quokka 1.6 | 5 | 4% | 7 |
| disan.Chair 2.2.0 | 3 | 3% | 8 |
| amk.jointstrike.JointStrike 0.2 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F45

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.1 | 88 / 210 | 2.16 | 19.7% | 35979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.7% | 88 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 12.9% | 106 |
| jje.BagPuss 1.2 | 3.2 | 11.8% | 7 |
| sul.Lunar 1.1 | 4.2 | 10.0% | 2 |
| myl.nano.Graviton 1.10 | 5.2 | 9.8% | 1 |
| hvilela.HVilela 0.9 | 6.2 | 8.9% | 2 |
| fm.claire 1.7 | 6.8 | 8.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.6% | 4 |
| abud.ThirdRobo 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.5 | 15 / 35 | 6214 |
| 2 | 1 | 69.6 | 87.6 | 19 / 35 | 5631 |
| 3 | 1 | 68.0 | 83.5 | 11 / 35 | 5761 |
| 4 | 1 | 68.0 | 82.9 | 11 / 35 | 5909 |
| 5 | 1 | 70.1 | 87.3 | 12 / 35 | 6805 |
| 6 | 1 | 70.3 | 90.8 | 20 / 35 | 5659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 108 | 31% |
| jje.BagPuss 1.2 | 19 | 68% |
| sul.Lunar 1.1 | 18 | 100% |
| myl.nano.Graviton 1.10 | 8 | 100% |
| wit.Deep7 2.0 | 8 | 75% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 2168. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 78 | 63% | 0 |
| jje.BagPuss 1.2 | 18 | 15% | 55 |
| sul.Lunar 1.1 | 8 | 7% | 56 |
| myl.nano.Graviton 1.10 | 8 | 7% | 29 |
| hvilela.HVilela 0.9 | 6 | 5% | 14 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 21 |
| wit.Deep7 2.0 | 2 | 2% | 14 |
| fm.claire 1.7 | 0 | 0% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 9 |

## Melee bench: F46

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 67.4 | 17 / 210 | 3.94 | 13.8% | 25677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.6% | 84 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.5% | 90 |
| hadur117.micro.Saor 0.2 | 3.0 | 13.8% | 17 |
| mz.MicroSheep 1.0 | 4.5 | 10.7% | 1 |
| cx.Princess 1.0 | 5.2 | 10.0% | 11 |
| sadoner.killer 0.2 | 5.5 | 9.4% | 3 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.1% | 4 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 65.4 | 2 / 35 | 4225 |
| 2 | 3 | 61.5 | 69.2 | 3 / 35 | 4158 |
| 3 | 3 | 61.7 | 68.9 | 2 / 35 | 4508 |
| 4 | 3 | 61.6 | 67.3 | 3 / 35 | 4285 |
| 5 | 3 | 60.7 | 67.6 | 2 / 35 | 4131 |
| 6 | 3 | 61.6 | 65.7 | 5 / 35 | 4370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 49 | 20% |
| rsalesc.melee.Medina 0.4.5 | 19 | 11% |
| cx.Princess 1.0 | 2 | 100% |
| mz.MicroSheep 1.0 | 2 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 193 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 80 | 41% | 90 |
| rsalesc.melee.Medina 0.4.5 | 58 | 30% | 60 |
| cx.Princess 1.0 | 15 | 8% | 17 |
| arthord.NanoSatanMelee Beta | 10 | 5% | 10 |
| sadoner.killer 0.2 | 9 | 5% | 10 |
| kurios.DOSexe .9a | 8 | 4% | 8 |
| jeremyreeder.collective.Prophet 5 | 6 | 3% | 6 |
| mz.MicroSheep 1.0 | 4 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 3 |

