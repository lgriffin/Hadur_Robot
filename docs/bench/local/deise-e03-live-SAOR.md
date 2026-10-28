# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 73.1 | 25 / 210 | 3.42 | 15.1% | 29351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 148 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.1% | 25 |
| sgp.JollyNinja 3.53 | 3.2 | 12.2% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.7% | 3 |
| mz.MicroGodMelee 1 | 5.0 | 10.4% | 11 |
| lorneswork.Predator 1.0 | 5.5 | 9.9% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.6% | 1 |
| skm.butterfly 1.0 | 8.5 | 5.2% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 71.7 | 1 / 35 | 5029 |
| 2 | 2 | 61.6 | 69.2 | 4 / 35 | 4251 |
| 3 | 2 | 63.1 | 71.7 | 5 / 35 | 4786 |
| 4 | 2 | 65.6 | 76.8 | 5 / 35 | 5409 |
| 5 | 2 | 63.7 | 73.7 | 5 / 35 | 4706 |
| 6 | 2 | 64.6 | 75.6 | 5 / 35 | 5170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 84 | 5% |
| sgp.JollyNinja 3.53 | 16 | 75% |
| mz.MicroGodMelee 1 | 11 | 36% |
| lorneswork.Predator 1.0 | 3 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |

Hadur died in 185 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 65% | 128 |
| mz.MicroGodMelee 1 | 20 | 11% | 23 |
| sgp.JollyNinja 3.53 | 13 | 7% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 6% | 14 |
| lorneswork.Predator 1.0 | 11 | 6% | 14 |
| adt.Ar2 1.0 | 4 | 2% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 2% | 3 |
| skm.butterfly 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.4 | 74 / 210 | 3.04 | 17.2% | 31695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.2% | 74 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.1% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.4% | 38 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.2% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.0% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.2% | 2 |
| Noran.BitchingElk 0.054 | 7.0 | 7.6% | 9 |
| sch.Simone 0.3d | 7.8 | 7.6% | 9 |
| stelo.PatternRobot 1.0 | 8.3 | 6.7% | 6 |
| fullsail.SweetTea 1.1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.3 | 10 / 35 | 5443 |
| 2 | 1 | 68.5 | 83.8 | 14 / 35 | 5685 |
| 3 | 1 | 68.9 | 85.7 | 18 / 35 | 5585 |
| 4 | 1 | 64.3 | 73.3 | 14 / 35 | 4953 |
| 5 | 1 | 65.2 | 77.1 | 9 / 35 | 5258 |
| 6 | 1 | 62.8 | 69.8 | 9 / 35 | 4771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 44% |
| pulsar.PulsarMax 0.8.9 | 37 | 41% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 73% |
| sch.Simone 0.3d | 12 | 58% |
| stelo.PatternRobot 1.0 | 9 | 78% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| Noran.BitchingElk 0.054 | 4 | 75% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 46 | 34% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 39 | 29% | 60 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 8% | 17 |
| sch.Simone 0.3d | 10 | 7% | 19 |
| fnc.bandit.Bandit 5.2.0 | 9 | 7% | 10 |
| stelo.PatternRobot 1.0 | 7 | 5% | 11 |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 4% | 17 |
| fullsail.SweetTea 1.1 | 6 | 4% | 9 |
| Noran.BitchingElk 0.054 | 2 | 1% | 6 |

## Melee bench: F03

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.6 | 110 / 210 | 3.29 | 17.0% | 33602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.0% | 110 |
| radnor.DoctorBob 1.42 | 2.3 | 14.4% | 41 |
| vuen.Cake 2.51 | 3.2 | 12.6% | 27 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.4% | 21 |
| urdos.URDOS 1.3 | 5.0 | 10.3% | 5 |
| adt.Ar1 2.1 | 6.5 | 7.6% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.9% | 1 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.2 | 6.6% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 66.7 | 17 / 35 | 5483 |
| 2 | 1 | 66.3 | 78.1 | 20 / 35 | 5678 |
| 3 | 1 | 66.1 | 75.9 | 20 / 35 | 5430 |
| 4 | 1 | 66.5 | 75.2 | 16 / 35 | 5856 |
| 5 | 1 | 66.3 | 76.8 | 19 / 35 | 5805 |
| 6 | 1 | 65.6 | 74.9 | 18 / 35 | 5350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 41 | 83% |
| kawigi.nano.Lib 1.0 | 39 | 95% |
| vuen.Cake 2.51 | 36 | 81% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 75% |
| urdos.URDOS 1.3 | 3 | 33% |
| adt.Ar1 2.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 26% | 61 |
| kawigi.nano.Lib 1.0 | 22 | 22% | 57 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 18% | 17 |
| vuen.Cake 2.51 | 13 | 13% | 41 |
| adt.Ar1 2.1 | 9 | 9% | 11 |
| urdos.URDOS 1.3 | 7 | 7% | 7 |
| oa.weak.FlyMk1 0.1 | 3 | 3% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 73.0 | 8 / 210 | 3.43 | 15.2% | 31344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 182 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.2% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 14 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 0 |
| css.Delitioner 0.11 | 6.5 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.7% | 2 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 72.4 | 0 / 35 | 5058 |
| 2 | 2 | 65.6 | 77.5 | 2 / 35 | 5385 |
| 3 | 2 | 66.0 | 77.1 | 2 / 35 | 5408 |
| 4 | 2 | 62.8 | 66.7 | 1 / 35 | 4884 |
| 5 | 2 | 64.5 | 74.0 | 2 / 35 | 5223 |
| 6 | 2 | 64.1 | 70.5 | 1 / 35 | 5386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 59 | 2% |
| apc.LeeroyJenkins2 1.0 | 8 | 38% |
| TNT.TNT 0.99.1 | 6 | 67% |

Hadur died in 202 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 147 | 73% | 148 |
| apc.LeeroyJenkins2 1.0 | 22 | 11% | 24 |
| TNT.TNT 0.99.1 | 12 | 6% | 16 |
| josago.Jorgito 0.16 | 10 | 5% | 10 |
| css.Delitioner 0.11 | 6 | 3% | 6 |
| tj.zombie1n 1.0.1 | 3 | 1% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 59.4 | 9 / 210 | 4.66 | 12.3% | 24100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.6% | 119 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 61 |
| hadur117.micro.Saor 0.2 | 3.5 | 12.3% | 9 |
| wompi.Numbat 2.1 | 3.5 | 12.6% | 8 |
| axeBots.HataMoto 3.09 | 5.2 | 9.7% | 8 |
| ms.Ares 0.19 | 5.8 | 9.2% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.4% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.6% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 67.0 | 3 / 35 | 4508 |
| 2 | 4 | 57.8 | 55.9 | 3 / 35 | 3981 |
| 3 | 3 | 57.7 | 58.4 | 1 / 35 | 3813 |
| 4 | 4 | 55.4 | 52.1 | 0 / 35 | 3753 |
| 5 | 3 | 59.2 | 62.5 | 0 / 35 | 3883 |
| 6 | 4 | 59.1 | 60.3 | 2 / 35 | 4162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 20 | 10% |
| justin.DemonicRage 3.4 | 16 | 13% |
| wompi.Numbat 2.1 | 6 | 83% |
| ms.Ares 0.19 | 1 | 0% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 201 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 68 | 34% | 70 |
| justin.DemonicRage 3.4 | 63 | 31% | 65 |
| wompi.Numbat 2.1 | 29 | 14% | 34 |
| axeBots.HataMoto 3.09 | 14 | 7% | 14 |
| ms.Ares 0.19 | 10 | 5% | 10 |
| supersample.SuperBoxBot 1.0 | 10 | 5% | 10 |
| GarmBox.Oranges 1.0 | 4 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 75.5 | 93 / 210 | 3.20 | 16.1% | 25988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.1% | 93 |
| jekl.StoneGhost 0.7 | 2.0 | 14.6% | 28 |
| origin.SleepSiphon 1.7b | 3.2 | 13.4% | 53 |
| mld.Wisdom 1.0 | 4.5 | 11.3% | 5 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.5 | 11.7% | 16 |
| gg.Wolverine 2.0 | 5.8 | 9.5% | 11 |
| DBall.NUKE 0.1 | 7.7 | 6.8% | 4 |
| spinnercat.Omen 1.0 | 8.0 | 6.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.2% | 1 |
| sample.Fire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 73.3 | 16 / 35 | 4211 |
| 2 | 1 | 66.7 | 82.5 | 17 / 35 | 4515 |
| 3 | 1 | 65.8 | 79.4 | 15 / 35 | 4607 |
| 4 | 1 | 63.9 | 74.3 | 14 / 35 | 4155 |
| 5 | 1 | 62.9 | 70.5 | 17 / 35 | 3901 |
| 6 | 1 | 64.6 | 73.0 | 14 / 35 | 4599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 51 | 88% |
| origin.SleepSiphon 1.7b | 35 | 57% |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 81% |
| gg.Wolverine 2.0 | 12 | 58% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 31 | 26% | 58 |
| jekl.StoneGhost 0.7 | 25 | 21% | 56 |
| mld.Wisdom 1.0 | 25 | 21% | 33 |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 17% | 40 |
| gg.Wolverine 2.0 | 8 | 7% | 11 |
| sample.Fire 1.0 | 4 | 3% | 4 |
| DBall.NUKE 0.1 | 3 | 3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 2 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 84.9 | 69 / 210 | 2.36 | 18.4% | 35965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 18.4% | 69 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.9% | 69 |
| rtk.Tachikoma 1.0 | 2.7 | 16.0% | 50 |
| franzor.Lizt 1.3.1 | 4.3 | 10.9% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.5% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| sample.Target 1.0 | 9.2 | 3.0% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.0 | 84.1 | 13 / 35 | 5907 |
| 2 | 1 | 70.6 | 89.5 | 11 / 35 | 6536 |
| 3 | 2 | 67.7 | 79.4 | 14 / 35 | 5142 |
| 4 | 1 | 70.2 | 86.3 | 12 / 35 | 6235 |
| 5 | 2 | 69.0 | 83.5 | 9 / 35 | 6120 |
| 6 | 1 | 69.5 | 86.7 | 10 / 35 | 6025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 64 | 48% |
| rsalesc.melee.Monk 0.3.6c | 45 | 13% |
| oog.melee.CapuletDroid 1.1 | 23 | 83% |
| franzor.Lizt 1.3.1 | 16 | 69% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 1230. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 60 | 42% | 80 |
| rtk.Tachikoma 1.0 | 52 | 37% | 93 |
| oog.melee.CapuletDroid 1.1 | 16 | 11% | 21 |
| franzor.Lizt 1.3.1 | 10 | 7% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 3 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.9 | 88 / 210 | 3.08 | 17.4% | 32599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 88 |
| tm.Yuugao 1.0 | 2.3 | 13.7% | 55 |
| shrub.Vapour v159 | 3.2 | 11.8% | 25 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.4% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 10.6% | 16 |
| m3thos.Eva00 1.1 | 6.5 | 8.5% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.7% | 6 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.1% | 2 |
| SHAM.WOW 1.4 | 9.3 | 5.9% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.7 | 14 / 35 | 5667 |
| 2 | 1 | 65.4 | 74.6 | 14 / 35 | 5266 |
| 3 | 1 | 66.1 | 75.6 | 14 / 35 | 5502 |
| 4 | 1 | 64.4 | 73.3 | 13 / 35 | 5009 |
| 5 | 1 | 67.7 | 82.5 | 16 / 35 | 5756 |
| 6 | 1 | 66.4 | 76.8 | 17 / 35 | 5399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 44 | 43% |
| shrub.Vapour v159 | 35 | 74% |
| jwst.DAD.DarkAndDarker 1.1 | 18 | 83% |
| Krabb.sliNk.Garm 0.9u | 15 | 73% |
| com.spp.robocode.MostlyHarmless 010 | 12 | 75% |
| m3thos.Eva00 1.1 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 50 | 41% | 80 |
| shrub.Vapour v159 | 15 | 12% | 32 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 11% | 29 |
| Krabb.sliNk.Garm 0.9u | 11 | 9% | 21 |
| SHAM.WOW 1.4 | 10 | 8% | 11 |
| zyx.nano.BacillusComma 1.0 | 7 | 6% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 5% | 17 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 6 |
| m3thos.Eva00 1.1 | 4 | 3% | 5 |

## Melee bench: F09

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 59.1 | 45 / 210 | 4.68 | 13.0% | 23863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 16.5% | 92 |
| kc.micro.Figment 1.0 | 2.3 | 13.7% | 33 |
| hadur117.micro.Saor 0.2 | 2.8 | 13.0% | 45 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.9% | 19 |
| yagami.Tidus 0.11 | 4.8 | 10.6% | 3 |
| mc2.enemy.Original 0.9 | 5.2 | 10.1% | 15 |
| dft.Calliope 5.6 | 7.0 | 8.2% | 2 |
| step.nanoPri 1.0 | 8.8 | 6.0% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 59.7 | 8 / 35 | 3904 |
| 2 | 3 | 56.8 | 54.0 | 6 / 35 | 3907 |
| 3 | 4 | 55.1 | 49.5 | 5 / 35 | 3781 |
| 4 | 2 | 62.8 | 70.8 | 10 / 35 | 4207 |
| 5 | 2 | 60.7 | 63.5 | 9 / 35 | 4084 |
| 6 | 3 | 57.9 | 57.1 | 7 / 35 | 3980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 37 | 73% |
| positive.Portia 1.26e | 24 | 21% |
| pedersen.Grishnakh 1.0 | 8 | 50% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| dft.Calliope 5.6 | 5 | 80% |
| yagami.Tidus 0.11 | 2 | 50% |

Hadur died in 165 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 35% | 81 |
| positive.Portia 1.26e | 52 | 32% | 62 |
| pedersen.Grishnakh 1.0 | 12 | 7% | 17 |
| yagami.Tidus 0.11 | 11 | 7% | 13 |
| mc2.enemy.Original 0.9 | 10 | 6% | 13 |
| dft.Calliope 5.6 | 7 | 4% | 8 |
| step.nanoPri 1.0 | 7 | 4% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |

## Melee bench: F10

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.6 | 108 / 210 | 2.48 | 17.9% | 31464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.9% | 108 |
| DTF.Kludgy 1.2b | 2.0 | 15.5% | 61 |
| ne.Chimera 1.2 | 3.3 | 12.8% | 11 |
| ejb.Polaris 1.0.1 | 3.5 | 12.0% | 18 |
| vStar.RAFzilla 2.15 | 5.3 | 10.2% | 3 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.1% | 6 |
| sam.Samspin 1.0 | 7.8 | 6.0% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.8% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.4 | 20 / 35 | 5165 |
| 2 | 2 | 63.8 | 73.3 | 13 / 35 | 4636 |
| 3 | 1 | 67.9 | 84.4 | 19 / 35 | 5291 |
| 4 | 1 | 69.8 | 89.2 | 20 / 35 | 6127 |
| 5 | 1 | 67.7 | 84.1 | 18 / 35 | 5194 |
| 6 | 1 | 67.4 | 85.1 | 18 / 35 | 5051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 49 | 33% |
| ejb.Polaris 1.0.1 | 35 | 74% |
| ne.Chimera 1.2 | 29 | 90% |
| vStar.RAFzilla 2.15 | 19 | 100% |
| tvv.micro.Antares 1.1.1 | 11 | 91% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 4 | 100% |
| donjezza.Muncho 1.0 | 4 | 50% |

Hadur died in 102 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 55 | 54% | 70 |
| ne.Chimera 1.2 | 14 | 14% | 39 |
| ejb.Polaris 1.0.1 | 11 | 11% | 44 |
| sam.Samspin 1.0 | 5 | 5% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 5% | 6 |
| tvv.micro.Antares 1.1.1 | 4 | 4% | 14 |
| kurios.DOSexe .9b | 4 | 4% | 9 |
| vStar.RAFzilla 2.15 | 2 | 2% | 18 |
| donjezza.Muncho 1.0 | 2 | 2% | 3 |

## Melee bench: F11

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 70.5 | 46 / 210 | 3.66 | 14.9% | 26072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.2% | 102 |
| hadur117.micro.Saor 0.2 | 2.0 | 14.9% | 46 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.0% | 21 |
| djc.DynaBot 0.1.1 | 4.2 | 10.6% | 12 |
| br2.MobyDickBot 1.6 | 5.3 | 9.8% | 13 |
| rdt199.Warlord 0.73 | 5.8 | 9.1% | 9 |
| uji.YellohFellah 1.0 | 7.2 | 8.0% | 7 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 72.4 | 9 / 35 | 4053 |
| 2 | 2 | 61.6 | 66.7 | 6 / 35 | 4478 |
| 3 | 2 | 61.5 | 65.4 | 6 / 35 | 4570 |
| 4 | 2 | 62.9 | 73.7 | 8 / 35 | 4332 |
| 5 | 2 | 61.5 | 67.9 | 11 / 35 | 4170 |
| 6 | 2 | 63.9 | 76.8 | 6 / 35 | 4469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 8% |
| cx.mini.Nimrod 0.55 | 18 | 67% |
| djc.DynaBot 0.1.1 | 14 | 86% |
| uji.YellohFellah 1.0 | 9 | 67% |
| rdt199.Warlord 0.73 | 9 | 100% |
| br2.MobyDickBot 1.6 | 5 | 40% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 86 | 52% | 93 |
| cx.mini.Nimrod 0.55 | 22 | 13% | 31 |
| KiraNL.Chupacabra 0.4 | 13 | 8% | 14 |
| rdt199.Warlord 0.73 | 12 | 7% | 20 |
| br2.MobyDickBot 1.6 | 10 | 6% | 13 |
| stelo.MirrorNano 1.3 | 7 | 4% | 7 |
| djc.DynaBot 0.1.1 | 6 | 4% | 18 |
| uji.YellohFellah 1.0 | 6 | 4% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 76.6 | 82 / 210 | 3.10 | 15.9% | 22537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 15.9% | 82 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.0% | 41 |
| nat.PallasHawk 1.0 | 3.0 | 14.0% | 47 |
| darkcanuck.Leon 1.01 | 3.5 | 12.5% | 28 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.3% | 8 |
| jrm.Test0 1.0 | 6.2 | 8.5% | 1 |
| jp.Perpy 16.0 | 6.8 | 7.4% | 1 |
| cs.sheldor.Talon 1.1 | 8.0 | 6.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 72.4 | 8 / 35 | 3720 |
| 2 | 1 | 67.3 | 85.4 | 18 / 35 | 4138 |
| 3 | 1 | 64.9 | 78.7 | 14 / 35 | 3718 |
| 4 | 1 | 63.3 | 74.3 | 15 / 35 | 3695 |
| 5 | 1 | 62.1 | 70.8 | 11 / 35 | 3729 |
| 6 | 1 | 63.9 | 78.1 | 16 / 35 | 3537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 43 | 65% |
| nat.PallasHawk 1.0 | 38 | 63% |
| darkcanuck.Leon 1.01 | 22 | 82% |
| brainfade.melee.Genghis 0.36 | 12 | 67% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 40 | 31% | 66 |
| nat.PallasHawk 1.0 | 34 | 27% | 54 |
| darkcanuck.Leon 1.01 | 22 | 17% | 41 |
| brainfade.melee.Genghis 0.36 | 20 | 16% | 25 |
| jrm.Test0 1.0 | 5 | 4% | 6 |
| jp.Perpy 16.0 | 3 | 2% | 5 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 63.4 | 10 / 210 | 4.29 | 12.8% | 23960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.3% | 107 |
| ags.Glacier 0.2.11 | 1.5 | 17.2% | 58 |
| hadur117.micro.Saor 0.2 | 3.5 | 12.8% | 10 |
| shinh.Entangled 0.3 | 4.0 | 12.4% | 21 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.6% | 14 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.1% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 62.2 | 2 / 35 | 3893 |
| 2 | 3 | 60.8 | 67.9 | 1 / 35 | 4049 |
| 3 | 3 | 62.0 | 67.9 | 4 / 35 | 4327 |
| 4 | 4 | 59.1 | 61.9 | 3 / 35 | 3855 |
| 5 | 3 | 59.6 | 65.1 | 0 / 35 | 3996 |
| 6 | 5 | 56.8 | 55.6 | 0 / 35 | 3840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 20 | 15% |
| ags.Glacier 0.2.11 | 19 | 16% |
| shinh.Entangled 0.3 | 10 | 20% |
| gh.micro.Gruweltje 0.7 | 3 | 0% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 200 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 64 | 32% | 67 |
| mn.Combat 3.25.0 | 61 | 31% | 62 |
| shinh.Entangled 0.3 | 28 | 14% | 31 |
| gh.micro.Gruweltje 0.7 | 15 | 8% | 16 |
| maribo.FollowFire 1 | 10 | 5% | 10 |
| apc.Colossus2 0.17 | 7 | 4% | 8 |
| ayk.WallHugger 1.0 | 7 | 4% | 7 |
| stelo.Wang 1.0 | 5 | 3% | 6 |
| sample.Tracker 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.2 | 117 / 210 | 3.41 | 16.6% | 29409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.6% | 117 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 28 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 39 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 10.0% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 10.0% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.9% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.6% | 7 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 71.1 | 18 / 35 | 4574 |
| 2 | 1 | 65.6 | 72.1 | 18 / 35 | 5051 |
| 3 | 1 | 64.5 | 69.5 | 20 / 35 | 4683 |
| 4 | 1 | 69.6 | 89.5 | 23 / 35 | 5357 |
| 5 | 1 | 62.5 | 62.2 | 18 / 35 | 4808 |
| 6 | 1 | 65.9 | 74.9 | 20 / 35 | 4936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 90% |
| catcat20.shape.Theta 0.018 | 32 | 66% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 86% |
| pa.Improved 1.0 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 4 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 507. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 38 | 41% | 104 |
| catcat20.shape.Theta 0.018 | 21 | 23% | 34 |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 12% | 19 |
| sanyi.mikrobi.Roberto 1.0 | 9 | 10% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 14 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 4% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 9 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |
| pa.Improved 1.0 | 1 | 1% | 4 |

## Melee bench: F15

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 84.8 | 122 / 210 | 2.37 | 19.2% | 34203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.2% | 122 |
| emp.Yngwie 1.11 | 2.7 | 13.2% | 42 |
| kawigi.micro.Shiz 1.1 | 3.2 | 12.7% | 11 |
| mld.DustBunny 3.8 | 3.2 | 12.7% | 9 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.3% | 14 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.1% | 10 |
| Grystrion.TrackerWO 1.0 | 7.2 | 7.4% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 7.0% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.4% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.0 | 17 / 35 | 5783 |
| 2 | 1 | 69.4 | 86.3 | 21 / 35 | 5875 |
| 3 | 1 | 68.3 | 83.5 | 22 / 35 | 5174 |
| 4 | 1 | 70.1 | 87.0 | 21 / 35 | 5860 |
| 5 | 1 | 69.5 | 85.4 | 21 / 35 | 5821 |
| 6 | 1 | 68.1 | 80.6 | 20 / 35 | 5690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 51 | 59% |
| kawigi.micro.Shiz 1.1 | 37 | 97% |
| mld.DustBunny 3.8 | 24 | 100% |
| kawigi.robot.Girl 1.2 | 18 | 78% |
| cb.nano.Insomnia 1.0 | 15 | 87% |
| divineomega.TrialBot 0.003 | 5 | 80% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 45% | 86 |
| cb.nano.Insomnia 1.0 | 13 | 15% | 9 |
| mld.DustBunny 3.8 | 10 | 11% | 44 |
| kawigi.robot.Girl 1.2 | 7 | 8% | 14 |
| kawigi.micro.Shiz 1.1 | 6 | 7% | 30 |
| lambdaxy.TBot 0.1 | 5 | 6% | 6 |
| divineomega.TrialBot 0.003 | 4 | 5% | 12 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.1 | 71 / 210 | 2.52 | 18.5% | 35106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.5% | 71 |
| gh.Griezel 0.5.2 | 1.8 | 17.0% | 93 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.4% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 10.1% | 24 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.3% | 1 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.8% | 4 |
| repositorio.NanoStep 1.0 | 8.5 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.9% | 3 |
| asd.Cthulhu 1.3 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.8 | 14 / 35 | 5963 |
| 2 | 1 | 69.4 | 87.9 | 11 / 35 | 6072 |
| 3 | 2 | 67.8 | 80.3 | 8 / 35 | 6052 |
| 4 | 1 | 66.8 | 77.1 | 9 / 35 | 5675 |
| 5 | 1 | 67.8 | 80.0 | 16 / 35 | 5278 |
| 6 | 1 | 69.9 | 89.5 | 13 / 35 | 6066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 86 | 21% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 28 | 96% |
| techdude.forest.FlamingForest 1.1 | 21 | 29% |
| bvh.fnr.Fenrir 0.36l | 9 | 100% |
| tvv.nano.Polaris 1.2 | 8 | 88% |
| stelo.IntrinsicVolatility 1.4 | 4 | 25% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 1480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 80 | 57% | 105 |
| techdude.forest.FlamingForest 1.1 | 19 | 14% | 28 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 10% | 33 |
| stelo.IntrinsicVolatility 1.4 | 9 | 6% | 12 |
| bvh.fnr.Fenrir 0.36l | 8 | 6% | 11 |
| divineomega.DivineBot 1.9.4.5 | 4 | 3% | 9 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 9 |
| asd.Cthulhu 1.3 | 2 | 1% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.2 | 101 / 210 | 2.60 | 17.9% | 29716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 101 |
| et.Predator 1.8 | 2.7 | 13.1% | 28 |
| cx.BlestPain 1.41 | 3.7 | 11.8% | 32 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.1% | 29 |
| nic.Nicator 2.4 | 4.7 | 11.0% | 12 |
| ahf.NanoAndrew .4 | 5.5 | 10.4% | 6 |
| maribo.melee.BMV 0.1 | 6.8 | 8.9% | 2 |
| tex.Longbot 0.4 | 8.2 | 6.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.1 | 17 / 35 | 4522 |
| 2 | 1 | 66.4 | 78.7 | 15 / 35 | 4819 |
| 3 | 1 | 67.6 | 82.5 | 18 / 35 | 4923 |
| 4 | 1 | 66.2 | 78.1 | 13 / 35 | 4947 |
| 5 | 1 | 69.9 | 89.5 | 24 / 35 | 5263 |
| 6 | 1 | 66.6 | 79.0 | 14 / 35 | 5242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 35 | 69% |
| oog.melee.Mercutio 1.0 | 34 | 68% |
| cx.BlestPain 1.41 | 32 | 59% |
| nic.Nicator 2.4 | 24 | 67% |
| ahf.NanoAndrew .4 | 15 | 93% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 25 | 23% | 46 |
| et.Predator 1.8 | 24 | 22% | 48 |
| cx.BlestPain 1.41 | 24 | 22% | 43 |
| nic.Nicator 2.4 | 16 | 15% | 32 |
| ahf.NanoAndrew .4 | 13 | 12% | 28 |
| tex.Longbot 0.4 | 3 | 3% | 4 |
| goblin.Bender 2.4 | 3 | 3% | 3 |
| maribo.melee.BMV 0.1 | 2 | 2% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.4 | 112 / 210 | 2.68 | 17.6% | 26792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.6% | 112 |
| morbid.MorbidPriest 1.0 | 2.5 | 12.5% | 28 |
| agd.Mooserwirt2 2.7 | 3.0 | 11.9% | 28 |
| uji.DBH 1.1 | 3.8 | 11.3% | 12 |
| ratosh.Nobo 0.21 | 5.2 | 10.4% | 6 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.7% | 5 |
| sigterm.Sigterm 1.0 | 7.0 | 8.6% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.6% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.2 | 5.6% | 1 |
| stelo.WangRobot 1.0 | 9.8 | 4.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 79.4 | 22 / 35 | 4070 |
| 2 | 1 | 65.4 | 77.1 | 16 / 35 | 4589 |
| 3 | 1 | 65.0 | 77.5 | 15 / 35 | 4459 |
| 4 | 1 | 69.3 | 91.4 | 26 / 35 | 4581 |
| 5 | 1 | 67.8 | 85.1 | 18 / 35 | 4742 |
| 6 | 1 | 65.2 | 77.8 | 15 / 35 | 4351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 31 | 68% |
| agd.Mooserwirt2 2.7 | 28 | 54% |
| uji.DBH 1.1 | 26 | 96% |
| sigterm.Sigterm 1.0 | 22 | 77% |
| spinnercat.Robovirus 2.718 | 20 | 90% |
| ratosh.Nobo 0.21 | 13 | 62% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 71% |
| stelo.WangRobot 1.0 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 27 | 28% | 49 |
| morbid.MorbidPriest 1.0 | 23 | 23% | 55 |
| ratosh.Nobo 0.21 | 9 | 9% | 21 |
| uji.DBH 1.1 | 9 | 9% | 20 |
| sigterm.Sigterm 1.0 | 8 | 8% | 20 |
| spinnercat.Robovirus 2.718 | 7 | 7% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 7% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 5% | 7 |
| stelo.WangRobot 1.0 | 3 | 3% | 5 |

## Melee bench: F19

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 90.4 | 162 / 210 | 1.87 | 20.5% | 34059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.5% | 162 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.2% | 18 |
| mld.Infinity 2.2 | 2.8 | 13.0% | 21 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.1% | 3 |
| erdnis.Rover 0.3 | 4.5 | 11.0% | 5 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.8% | 0 |
| pac.ABC 2.1 | 7.5 | 7.0% | 2 |
| mbh.Mbh 0.1 | 8.0 | 6.8% | 0 |
| pbg.R2D2 1.0 | 8.5 | 6.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 97.1 | 28 / 35 | 5950 |
| 2 | 1 | 70.4 | 84.1 | 26 / 35 | 6014 |
| 3 | 1 | 71.5 | 91.7 | 28 / 35 | 5444 |
| 4 | 1 | 72.2 | 94.3 | 32 / 35 | 5816 |
| 5 | 1 | 68.5 | 82.9 | 20 / 35 | 5197 |
| 6 | 1 | 71.5 | 92.1 | 28 / 35 | 5638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 81 | 94% |
| mld.Infinity 2.2 | 46 | 85% |
| krillr.mini.JointStrike 2.0.0 | 18 | 83% |
| patson.PatsonTestBot 1.0 | 12 | 100% |
| pac.ABC 2.1 | 9 | 100% |
| erdnis.Rover 0.3 | 8 | 88% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 16 | 33% | 104 |
| mld.Infinity 2.2 | 13 | 27% | 19 |
| erdnis.Rover 0.3 | 6 | 12% | 17 |
| krillr.mini.JointStrike 2.0.0 | 4 | 8% | 29 |
| pac.ABC 2.1 | 3 | 6% | 13 |
| pbg.R2D2 1.0 | 2 | 4% | 10 |
| patson.PatsonTestBot 1.0 | 2 | 4% | 9 |
| mbh.Mbh 0.1 | 2 | 4% | 8 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.6 | 105 / 210 | 2.30 | 19.3% | 35253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.3% | 105 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.0% | 51 |
| fwb.Nine 1.0.1 | 3.5 | 11.2% | 27 |
| catcat20.Rabbit 0.001 | 4.2 | 10.0% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.5% | 4 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.9% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.7% | 2 |
| bayen.nut.Squirrel 1.615 | 7.7 | 6.8% | 3 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.2 | 16 / 35 | 6023 |
| 2 | 1 | 70.4 | 90.2 | 16 / 35 | 6279 |
| 3 | 1 | 69.2 | 83.2 | 19 / 35 | 5849 |
| 4 | 1 | 70.1 | 86.3 | 24 / 35 | 6052 |
| 5 | 1 | 66.9 | 78.4 | 14 / 35 | 5504 |
| 6 | 1 | 68.7 | 86.3 | 16 / 35 | 5546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 60% |
| fwb.Nine 1.0.1 | 47 | 51% |
| catcat20.Rabbit 0.001 | 21 | 62% |
| nz.jdc.nano.GridFu 1.0 | 11 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1267. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 47 | 44% | 87 |
| fwb.Nine 1.0.1 | 25 | 24% | 13 |
| catcat20.Rabbit 0.001 | 16 | 15% | 38 |
| m3thos.mini.Eva01 0.5.5 | 5 | 5% | 16 |
| ntc.ControlledChaos 1.1.4 | 5 | 5% | 7 |
| nz.jdc.nano.GridFu 1.0 | 3 | 3% | 25 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |
| bayen.nut.Squirrel 1.615 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.5 | 116 / 210 | 2.12 | 19.7% | 34286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.7% | 116 |
| eem.EvBot v4.6.16 | 2.0 | 16.5% | 76 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.3% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 4 |
| eld.Hmm 1.0 | 5.3 | 8.4% | 8 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.9% | 1 |
| el.JumpShoot 0.2 | 7.2 | 6.4% | 0 |
| fire219.CatBot 1.0 | 8.3 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.6 | 18 / 35 | 6091 |
| 2 | 1 | 69.4 | 84.4 | 15 / 35 | 5889 |
| 3 | 1 | 71.2 | 91.7 | 21 / 35 | 5575 |
| 4 | 1 | 69.1 | 83.8 | 19 / 35 | 5731 |
| 5 | 1 | 70.3 | 90.2 | 22 / 35 | 5461 |
| 6 | 1 | 69.4 | 86.3 | 21 / 35 | 5539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 103 | 55% |
| dummy.mini.Scimitar 1.01 | 36 | 94% |
| cf.RiO.RiOx 4.2.1 | 17 | 94% |
| eld.Hmm 1.0 | 9 | 56% |
| oa.weak.BotherBot 0.1 | 3 | 67% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1188. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 61 | 64% | 105 |
| dummy.mini.Scimitar 1.01 | 8 | 8% | 37 |
| PSW.Relentless 0.1 | 7 | 7% | 6 |
| eld.Hmm 1.0 | 6 | 6% | 19 |
| cf.RiO.RiOx 4.2.1 | 4 | 4% | 25 |
| oa.weak.BotherBot 0.1 | 4 | 4% | 9 |
| arthord.MannyPacquiao Beta | 2 | 2% | 3 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |

## Melee bench: F22

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.8 | 96 / 210 | 2.19 | 18.6% | 31389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.6% | 96 |
| pe.SandboxDT 2.71m | 2.0 | 15.8% | 55 |
| kvk.HebusLeTroll 0.35 | 3.2 | 13.2% | 28 |
| jlm.javaDisturbance 0.59 | 3.7 | 12.9% | 25 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 1 |
| tad.Dalek98 0.98 | 6.8 | 6.9% | 3 |
| yk.JahRoslav 1.1 | 7.0 | 6.8% | 1 |
| gg.Squaraus 0.6 | 7.2 | 6.8% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.0 | 15 / 35 | 5107 |
| 2 | 1 | 68.4 | 86.0 | 20 / 35 | 4950 |
| 3 | 1 | 70.9 | 93.7 | 20 / 35 | 5856 |
| 4 | 1 | 69.7 | 89.2 | 17 / 35 | 5444 |
| 5 | 1 | 68.1 | 85.1 | 15 / 35 | 5131 |
| 6 | 2 | 66.2 | 80.0 | 9 / 35 | 4901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jlm.javaDisturbance 0.59 | 50 | 66% |
| kvk.HebusLeTroll 0.35 | 46 | 63% |
| pe.SandboxDT 2.71m | 45 | 40% |
| bigpete.Stewie 1.0 | 7 | 100% |
| pbg.NinjaX 1.2 | 3 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 3 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 46 | 40% | 70 |
| kvk.HebusLeTroll 0.35 | 36 | 32% | 63 |
| jlm.javaDisturbance 0.59 | 22 | 19% | 47 |
| tad.Dalek98 0.98 | 7 | 6% | 9 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| bigpete.Stewie 1.0 | 1 | 1% | 9 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 82.3 | 86 / 210 | 2.60 | 18.9% | 36493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.9% | 86 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 71 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 32 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.8% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.3% | 3 |
| stelo.AreaTargetingBot 1.1 | 5.8 | 9.2% | 6 |
| cw.megas.Blade 0.8 | 6.5 | 8.6% | 1 |
| sample.Walls 1.0 | 7.3 | 7.7% | 4 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 83.8 | 15 / 35 | 6174 |
| 2 | 1 | 69.2 | 79.4 | 16 / 35 | 6082 |
| 3 | 1 | 69.9 | 82.9 | 14 / 35 | 6188 |
| 4 | 1 | 69.9 | 85.7 | 12 / 35 | 6205 |
| 5 | 1 | 70.3 | 85.7 | 19 / 35 | 6164 |
| 6 | 1 | 67.2 | 76.2 | 10 / 35 | 5680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 79 | 44% |
| cre.Karolos 0.32 | 32 | 56% |
| stelo.AreaTargetingBot 1.1 | 15 | 87% |
| stelo.RamTrackSurfer 1.2 | 10 | 80% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 10 | 90% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 66 | 53% | 100 |
| cre.Karolos 0.32 | 29 | 23% | 44 |
| stelo.AreaTargetingBot 1.1 | 11 | 9% | 26 |
| sample.Walls 1.0 | 6 | 5% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 4% | 13 |
| stelo.RamTrackSurfer 1.2 | 3 | 2% | 11 |
| cw.megas.Blade 0.8 | 3 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |

## Melee bench: F24

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 70.7 | 60 / 210 | 3.63 | 14.7% | 23786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 14.7% | 60 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.6% | 38 |
| florent.XSeries.X2 0.12 | 2.8 | 13.6% | 40 |
| davidalves.Phoenix 0.54 | 3.5 | 13.1% | 37 |
| pedersen.Ugluk 1.1.1 | 4.7 | 12.0% | 25 |
| oog.melee.Corsair 1.0 | 6.0 | 9.1% | 2 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 7.0% | 6 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.6% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.3% | 0 |
| evd.X1 0.01 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 70.5 | 9 / 35 | 4171 |
| 2 | 1 | 63.1 | 74.0 | 10 / 35 | 4209 |
| 3 | 1 | 61.1 | 67.0 | 10 / 35 | 3725 |
| 4 | 1 | 62.8 | 73.7 | 10 / 35 | 3842 |
| 5 | 1 | 63.1 | 70.2 | 13 / 35 | 4095 |
| 6 | 3 | 61.0 | 69.2 | 8 / 35 | 3744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 26 | 62% |
| davidalves.Phoenix 0.54 | 22 | 55% |
| pedersen.Ugluk 1.1.1 | 16 | 50% |
| florent.XSeries.X2 0.12 | 14 | 43% |
| stelo.SoJNanoMelee 1.1 | 11 | 82% |
| oog.melee.Corsair 1.0 | 8 | 88% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 40 | 26% | 48 |
| rz.GlowBlowMelee 1.4 | 32 | 21% | 49 |
| davidalves.Phoenix 0.54 | 26 | 17% | 39 |
| pedersen.Ugluk 1.1.1 | 17 | 11% | 24 |
| oog.melee.Corsair 1.0 | 16 | 11% | 23 |
| evd.X1 0.01 | 10 | 7% | 10 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 10 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 3 |

## Melee bench: F25

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.8 | 130 / 210 | 2.46 | 18.4% | 26484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.4% | 130 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.2% | 27 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.4% | 12 |
| jdw.Hurricane 1.4 | 3.8 | 11.9% | 21 |
| gre.svman4.Morfeas 1.4.1 | 4.8 | 10.1% | 7 |
| ds.Oo 2.2 | 6.5 | 8.3% | 5 |
| gjr.Cephalosporin 0.1 | 7.0 | 8.1% | 6 |
| adt.Ar2 1.1 | 8.0 | 7.1% | 1 |
| awesomeness.Elite 1.0 | 8.5 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.6 | 23 / 35 | 4692 |
| 2 | 1 | 66.1 | 81.0 | 20 / 35 | 3984 |
| 3 | 1 | 68.4 | 83.5 | 22 / 35 | 4689 |
| 4 | 1 | 66.3 | 79.4 | 20 / 35 | 3964 |
| 5 | 1 | 69.7 | 88.6 | 27 / 35 | 4811 |
| 6 | 1 | 67.1 | 82.5 | 18 / 35 | 4344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 41 | 76% |
| voidious.micro.BlitzBat 1.05 | 35 | 97% |
| jdw.Hurricane 1.4 | 26 | 100% |
| gjr.Cephalosporin 0.1 | 14 | 93% |
| gre.svman4.Morfeas 1.4.1 | 11 | 73% |
| ds.Oo 2.2 | 8 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 4 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 23 | 29% | 58 |
| jdw.Hurricane 1.4 | 16 | 20% | 43 |
| voidious.micro.BlitzBat 1.05 | 10 | 13% | 45 |
| gjr.Cephalosporin 0.1 | 7 | 9% | 17 |
| gre.svman4.Morfeas 1.4.1 | 7 | 9% | 15 |
| ds.Oo 2.2 | 7 | 9% | 15 |
| adt.Ar2 1.1 | 6 | 8% | 8 |
| awesomeness.Elite 1.0 | 4 | 5% | 6 |
| amk.ChumbaMini 0.2 | 0 | 0% | 3 |

## Melee bench: F26

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.0 | 93 / 210 | 2.35 | 18.4% | 34019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.4% | 93 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 49 |
| shu.nitro.LENIN .T34 | 3.7 | 12.5% | 39 |
| lrem.Spectre 0.4.4 | 3.7 | 12.1% | 18 |
| js.PinBall 1.6 | 5.2 | 10.6% | 5 |
| gh.mini.GrubbmOne 1.0 | 5.8 | 9.9% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.1% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.2 | 20 / 35 | 5831 |
| 2 | 1 | 67.6 | 84.1 | 13 / 35 | 5373 |
| 3 | 1 | 69.2 | 84.8 | 19 / 35 | 5797 |
| 4 | 1 | 68.4 | 81.6 | 17 / 35 | 5738 |
| 5 | 1 | 67.4 | 84.4 | 9 / 35 | 5553 |
| 6 | 1 | 68.8 | 85.1 | 15 / 35 | 5727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 50 | 68% |
| ak.Fermat 2.0 | 40 | 38% |
| lrem.Spectre 0.4.4 | 29 | 72% |
| js.PinBall 1.6 | 12 | 92% |
| gh.mini.GrubbmOne 1.0 | 7 | 86% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 50% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 47 | 40% | 69 |
| shu.nitro.LENIN .T34 | 27 | 23% | 59 |
| lrem.Spectre 0.4.4 | 16 | 14% | 28 |
| js.PinBall 1.6 | 9 | 8% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 6% | 9 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 5% | 14 |
| gh.mini.GrubbmOne 1.0 | 5 | 4% | 13 |

## Melee bench: F27

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.8 | 102 / 210 | 3.62 | 16.1% | 26471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.1% | 102 |
| mk.Alpha 0.2.1 | 2.7 | 13.4% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 11.5% | 23 |
| wee.Gem 1.8.4 | 3.8 | 11.4% | 22 |
| EH.Eagle 1.0.6 | 4.5 | 10.3% | 7 |
| joe.ADinosaur 1.0 | 6.7 | 8.9% | 0 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.8% | 8 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.4% | 5 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.0 | 23 / 35 | 4410 |
| 2 | 1 | 64.9 | 76.5 | 17 / 35 | 4512 |
| 3 | 3 | 54.6 | 41.0 | 6 / 35 | 4137 |
| 4 | 1 | 67.8 | 82.2 | 24 / 35 | 4617 |
| 5 | 1 | 62.5 | 61.0 | 12 / 35 | 4677 |
| 6 | 1 | 65.2 | 78.4 | 20 / 35 | 4118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 54 | 83% |
| wee.Gem 1.8.4 | 19 | 95% |
| EH.Eagle 1.0.6 | 15 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 85% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 88% |
| throxbot.ThroxBot 0.1 | 4 | 50% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 25 | 23% | 69 |
| cs.Grudge 1.0 | 16 | 15% | 15 |
| joe.ADinosaur 1.0 | 14 | 13% | 18 |
| wee.Gem 1.8.4 | 12 | 11% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 10% | 24 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 10% | 18 |
| throxbot.ThroxBot 0.1 | 8 | 7% | 9 |
| EH.Eagle 1.0.6 | 6 | 6% | 14 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 9 |

## Melee bench: F28

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 82.9 | 110 / 210 | 2.54 | 17.6% | 25617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.6% | 110 |
| kid.test.NightFox .2 | 2.2 | 14.8% | 37 |
| uji.Antique 1.0 | 3.2 | 12.2% | 29 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 11.4% | 21 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.2% | 5 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.0% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.8% | 3 |
| matt.advanced.Katana 1.0 | 7.7 | 6.8% | 2 |
| stelo.Lifestealer 1.0 | 9.3 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 86.7 | 17 / 35 | 4535 |
| 2 | 1 | 67.4 | 84.8 | 21 / 35 | 4411 |
| 3 | 1 | 67.5 | 86.3 | 18 / 35 | 4425 |
| 4 | 1 | 66.5 | 78.7 | 19 / 35 | 4304 |
| 5 | 1 | 64.3 | 77.8 | 18 / 35 | 3480 |
| 6 | 1 | 66.5 | 83.2 | 17 / 35 | 4462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 74 | 70% |
| uji.Antique 1.0 | 44 | 73% |
| qohnil.blot.BlotBot 3.61 | 16 | 25% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| matt.advanced.Katana 1.0 | 5 | 80% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 26 | 26% | 58 |
| uji.Antique 1.0 | 20 | 20% | 50 |
| pfvicm.Sobieski 7.2.3b | 20 | 20% | 24 |
| qohnil.blot.BlotBot 3.61 | 19 | 19% | 37 |
| amk.ChumbaWumba 0.3 | 4 | 4% | 8 |
| ahr.ice.Ice 1.0.2 | 3 | 3% | 11 |
| matt.advanced.Katana 1.0 | 3 | 3% | 9 |
| stelo.Lifestealer 1.0 | 3 | 3% | 6 |
| stelo.PianistNano 1.2 | 2 | 2% | 5 |

## Melee bench: F29

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.7 | 62 / 210 | 3.01 | 16.8% | 28064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 16.8% | 62 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.4% | 71 |
| deewiant.Anomaly 0.2 | 3.0 | 14.2% | 54 |
| myl.micro.Troodon 1.10 | 4.2 | 11.5% | 8 |
| jok.PheonixM 0.1.2 | 5.0 | 10.0% | 9 |
| ph.melee.ArcherME 0.3 | 5.7 | 8.8% | 1 |
| DBall.Anarchy 0.1 | 7.3 | 7.0% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 6.2% | 0 |
| ap.Frederick 1.1 | 8.8 | 5.3% | 3 |
| jangs.ns51 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 75.9 | 8 / 35 | 4402 |
| 2 | 1 | 66.3 | 79.4 | 10 / 35 | 4821 |
| 3 | 2 | 62.8 | 68.9 | 12 / 35 | 4218 |
| 4 | 1 | 66.7 | 81.0 | 11 / 35 | 4900 |
| 5 | 1 | 66.5 | 82.5 | 10 / 35 | 4569 |
| 6 | 1 | 66.9 | 78.4 | 11 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 50 | 22% |
| deewiant.Anomaly 0.2 | 47 | 32% |
| myl.micro.Troodon 1.10 | 14 | 86% |
| jok.PheonixM 0.1.2 | 11 | 91% |
| DBall.Anarchy 0.1 | 6 | 100% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 61 | 41% | 79 |
| zyx.mega.YersiniaPestis 3.1 | 57 | 38% | 68 |
| myl.micro.Troodon 1.10 | 9 | 6% | 20 |
| jok.PheonixM 0.1.2 | 8 | 5% | 21 |
| ph.melee.ArcherME 0.3 | 6 | 4% | 9 |
| DBall.Anarchy 0.1 | 3 | 2% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 3 |
| jangs.ns51 1.0 | 2 | 1% | 2 |

## Melee bench: F30

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 53.5 | 21 / 210 | 5.18 | 11.3% | 21818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.7 | 14.1% | 54 |
| darkcanuck.B26354 1.06 | 2.5 | 13.4% | 50 |
| oog.melee.Capulet 1.2 | 2.7 | 13.2% | 39 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.3% | 24 |
| hadur117.micro.Saor 0.2 | 4.5 | 11.3% | 21 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.5% | 12 |
| tripphippy.Alice 1.1 | 7.5 | 8.1% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.9% | 3 |
| ntc.Opposite 1.5 | 8.7 | 7.2% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 58.1 | 5 / 35 | 3791 |
| 2 | 5 | 53.8 | 50.5 | 2 / 35 | 3570 |
| 3 | 5 | 55.1 | 52.7 | 2 / 35 | 3670 |
| 4 | 5 | 54.0 | 51.7 | 4 / 35 | 3345 |
| 5 | 4 | 55.0 | 51.4 | 5 / 35 | 3774 |
| 6 | 5 | 56.0 | 56.8 | 3 / 35 | 3668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 17 | 47% |
| catcat20.Matcha 0.006 | 14 | 29% |
| stelo.PastFuture 2.3.2 | 11 | 55% |
| darkcanuck.B26354 1.06 | 5 | 0% |
| intruder.PrairieWolf 2.61 | 4 | 25% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| tripphippy.Alice 1.1 | 2 | 0% |

Hadur died in 189 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 41 | 22% | 46 |
| oog.melee.Capulet 1.2 | 40 | 21% | 50 |
| darkcanuck.B26354 1.06 | 33 | 17% | 32 |
| stelo.PastFuture 2.3.2 | 25 | 13% | 29 |
| tripphippy.Alice 1.1 | 13 | 7% | 14 |
| ntc.Opposite 1.5 | 11 | 6% | 11 |
| intruder.PrairieWolf 2.61 | 10 | 5% | 11 |
| GarmBox.Anger 1.0 | 10 | 5% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 3% | 7 |

## Melee bench: F31

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 74.3 | 35 / 210 | 3.31 | 14.8% | 23403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 112 |
| hadur117.micro.Saor 0.2 | 2.2 | 14.8% | 35 |
| gh.mini.Griezel 0.2 | 2.8 | 13.2% | 41 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.1% | 12 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.7% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.0% | 1 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.1% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.5 | 5.4% | 2 |
| fm.mammillarias 1.3 | 8.7 | 5.7% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 81.3 | 9 / 35 | 3696 |
| 2 | 3 | 60.6 | 68.9 | 5 / 35 | 3337 |
| 3 | 2 | 62.8 | 75.2 | 4 / 35 | 4003 |
| 4 | 2 | 64.1 | 78.1 | 5 / 35 | 4047 |
| 5 | 2 | 63.6 | 76.5 | 6 / 35 | 4227 |
| 6 | 2 | 61.0 | 65.7 | 6 / 35 | 4093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 42 | 19% |
| gh.mini.Griezel 0.2 | 22 | 27% |
| spinnercat.micro.Tyger 0.1 | 9 | 89% |
| d414.nano.Quantum 1.0.0 | 9 | 78% |
| timmit.nano.TimDog 0.33 | 4 | 75% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 93 | 53% | 104 |
| gh.mini.Griezel 0.2 | 38 | 22% | 47 |
| spinnercat.micro.Tyger 0.1 | 14 | 8% | 19 |
| timmit.nano.TimDog 0.33 | 10 | 6% | 11 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 10 |
| d414.nano.Quantum 1.0.0 | 5 | 3% | 10 |
| fm.mammillarias 1.3 | 5 | 3% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.0 | 94 / 210 | 2.89 | 16.9% | 27924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 16.9% | 94 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.3% | 69 |
| apc.botM 3.0 | 3.3 | 12.2% | 23 |
| lxx.ConceptA 0.8 | 4.0 | 11.0% | 6 |
| vjik.UnViolation 1.1 | 4.8 | 10.4% | 4 |
| bayen.UbaMicro 1.4 | 5.8 | 9.2% | 5 |
| panzer.Panzer 0.2 | 7.2 | 7.1% | 1 |
| yk.JahMicro 1.0 | 8.0 | 6.7% | 5 |
| conscience.Electron 1.3g | 9.2 | 5.9% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 79.4 | 15 / 35 | 4310 |
| 2 | 1 | 64.9 | 76.5 | 17 / 35 | 4806 |
| 3 | 1 | 66.9 | 81.9 | 16 / 35 | 5023 |
| 4 | 1 | 66.0 | 80.0 | 15 / 35 | 4859 |
| 5 | 1 | 66.7 | 82.9 | 17 / 35 | 4790 |
| 6 | 2 | 63.5 | 73.7 | 14 / 35 | 4136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 65 | 35% |
| apc.botM 3.0 | 22 | 73% |
| vjik.UnViolation 1.1 | 19 | 100% |
| lxx.ConceptA 0.8 | 18 | 100% |
| yk.JahMicro 1.0 | 7 | 71% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| donjezza.Jezza 1.0 | 5 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 50 | 43% | 77 |
| lxx.ConceptA 0.8 | 13 | 11% | 22 |
| vjik.UnViolation 1.1 | 12 | 10% | 35 |
| apc.botM 3.0 | 12 | 10% | 34 |
| bayen.UbaMicro 1.4 | 9 | 8% | 12 |
| conscience.Electron 1.3g | 7 | 6% | 8 |
| panzer.Panzer 0.2 | 6 | 5% | 8 |
| yk.JahMicro 1.0 | 4 | 3% | 7 |
| donjezza.Jezza 1.0 | 3 | 3% | 7 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.2 | 115 / 210 | 2.42 | 19.0% | 31812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 19.0% | 115 |
| maribo.Quester 0.3 | 1.8 | 15.7% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.4% | 14 |
| labg.Cataclysm 2.05 | 4.2 | 10.5% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.1% | 9 |
| baal.nano.N 1.42 | 6.3 | 9.1% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.9% | 8 |
| zyx.micro.Ant 1.1 | 8.3 | 5.5% | 0 |
| sanja.First 0.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.1 | 17 / 35 | 4967 |
| 2 | 1 | 70.3 | 91.1 | 21 / 35 | 5535 |
| 3 | 1 | 70.9 | 90.8 | 22 / 35 | 5386 |
| 4 | 2 | 66.2 | 76.5 | 15 / 35 | 4782 |
| 5 | 1 | 68.2 | 80.3 | 16 / 35 | 5543 |
| 6 | 1 | 71.2 | 89.5 | 24 / 35 | 5599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 56 | 70% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 88% |
| gre.svman4.Leonidas 1.3.2 | 20 | 90% |
| labg.Cataclysm 2.05 | 13 | 54% |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 67% |
| baal.nano.N 1.42 | 4 | 75% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 39 | 41% | 92 |
| labg.Cataclysm 2.05 | 15 | 16% | 24 |
| gre.svman4.Leonidas 1.3.2 | 12 | 13% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 9% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 8% | 40 |
| baal.nano.N 1.42 | 5 | 5% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 4% | 3 |
| zyx.micro.Ant 1.1 | 2 | 2% | 5 |
| sanja.First 0.1 | 1 | 1% | 2 |

## Melee bench: F34

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.4 | 28 / 210 | 3.30 | 15.6% | 29005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.3 | 17.6% | 98 |
| kid.Gladiator .7.2 | 2.0 | 16.5% | 59 |
| hadur117.micro.Saor 0.2 | 2.7 | 15.6% | 28 |
| jcs.Seth 1.8 | 4.5 | 10.8% | 12 |
| tcf.Reach 3 | 4.8 | 10.9% | 7 |
| cli.Dancer 1.1 | 5.7 | 9.5% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 3 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.9% | 1 |
| sample.VelociRobot 1.0 | 8.8 | 4.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 74.0 | 6 / 35 | 4661 |
| 2 | 3 | 64.3 | 72.4 | 4 / 35 | 4790 |
| 3 | 2 | 66.2 | 80.6 | 6 / 35 | 4811 |
| 4 | 3 | 65.4 | 75.2 | 4 / 35 | 5224 |
| 5 | 2 | 65.8 | 75.9 | 5 / 35 | 5107 |
| 6 | 3 | 62.9 | 68.6 | 3 / 35 | 4412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 55 | 15% |
| kid.Gladiator .7.2 | 34 | 29% |
| jcs.Seth 1.8 | 8 | 75% |
| cli.Dancer 1.1 | 4 | 50% |
| tcf.Reach 3 | 3 | 33% |
| sample.VelociRobot 1.0 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 182 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 75 | 41% | 87 |
| kid.Gladiator .7.2 | 63 | 35% | 65 |
| tcf.Reach 3 | 13 | 7% | 14 |
| cli.Dancer 1.1 | 11 | 6% | 16 |
| jcs.Seth 1.8 | 9 | 5% | 17 |
| ratosh.Wesco 1.4 | 6 | 3% | 6 |
| sample.RamFire 1.0 | 4 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 67.0 | 17 / 210 | 3.97 | 13.2% | 20583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 160 |
| hadur117.micro.Saor 0.2 | 2.7 | 13.2% | 17 |
| gh.mini.Gruwel 0.9 | 2.7 | 12.9% | 21 |
| rz.HawkOnFire 0.1 | 4.2 | 12.0% | 1 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.7% | 11 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.2% | 0 |
| wit.Chuliath 1.0 | 6.7 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 6.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 69.5 | 2 / 35 | 3627 |
| 2 | 2 | 61.7 | 71.7 | 5 / 35 | 3645 |
| 3 | 3 | 61.1 | 70.8 | 2 / 35 | 3423 |
| 4 | 3 | 58.9 | 63.8 | 2 / 35 | 3377 |
| 5 | 3 | 58.1 | 62.5 | 3 / 35 | 3110 |
| 6 | 3 | 58.5 | 63.5 | 3 / 35 | 3401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 36 | 14% |
| gh.mini.Gruwel 0.9 | 9 | 0% |
| rz.HawkOnFire 0.1 | 6 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 100% |
| wit.Chuliath 1.0 | 2 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 110 | 57% | 117 |
| gh.mini.Gruwel 0.9 | 32 | 16% | 32 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 10% | 24 |
| rz.HawkOnFire 0.1 | 12 | 6% | 14 |
| stelo.MyAgileRobot 0.2 | 7 | 4% | 7 |
| myl.nano.KomoriNinja 1.1 | 5 | 3% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 5 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.1 | 157 / 210 | 1.98 | 20.3% | 32585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.3% | 157 |
| alpha.RainingFire 1.0 | 2.7 | 11.6% | 9 |
| bzdp.Pansy 2.1 | 2.7 | 11.8% | 9 |
| mz.Cork 0.1 | 3.8 | 11.3% | 14 |
| bvh.micro.Freya 0.3 | 5.7 | 10.0% | 8 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.1% | 2 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.1% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.6% | 3 |
| dl.BetterWalls 1.0 | 9.0 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.9% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.3 | 23 / 35 | 5124 |
| 2 | 1 | 69.7 | 87.9 | 26 / 35 | 5245 |
| 3 | 1 | 69.1 | 84.1 | 24 / 35 | 5310 |
| 4 | 1 | 70.0 | 87.9 | 25 / 35 | 5537 |
| 5 | 1 | 72.6 | 97.8 | 33 / 35 | 5465 |
| 6 | 1 | 71.2 | 90.5 | 26 / 35 | 5904 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 98% |
| mz.Cork 0.1 | 30 | 80% |
| bvh.mini.Fenrir 0.39 | 25 | 100% |
| bvh.micro.Freya 0.3 | 24 | 88% |
| alpha.RainingFire 1.0 | 23 | 87% |
| m3thos.Eva02 0.7.1 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 9 | 67% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 14 | 26% | 27 |
| mz.Cork 0.1 | 13 | 25% | 43 |
| bzdp.Pansy 2.1 | 9 | 17% | 61 |
| bvh.micro.Freya 0.3 | 5 | 9% | 18 |
| bvh.mini.Fenrir 0.39 | 4 | 8% | 15 |
| sample.MyFirstRobot 1.0 | 4 | 8% | 10 |
| m3thos.Eva02 0.7.1 | 2 | 4% | 18 |
| dl.BetterWalls 1.0 | 1 | 2% | 12 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |

## Melee bench: F37

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.4 | 128 / 210 | 2.94 | 17.9% | 32887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 128 |
| germ.TheMind .2 | 3.0 | 10.8% | 13 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 9.9% | 11 |
| agrach.Dalek 1.0 | 4.3 | 9.9% | 20 |
| EBBU.Sim2 1.02 | 4.7 | 9.7% | 8 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.3% | 13 |
| lmk.ACPFinal 0.1 | 7.0 | 8.6% | 6 |
| mb.Beast 0.1 | 8.2 | 8.1% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 8.0% | 0 |
| skm.Ryubot 1.0 | 8.8 | 7.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 73.3 | 21 / 35 | 5592 |
| 2 | 1 | 65.7 | 76.5 | 18 / 35 | 5568 |
| 3 | 1 | 66.1 | 79.4 | 21 / 35 | 5112 |
| 4 | 1 | 67.8 | 83.2 | 25 / 35 | 5576 |
| 5 | 1 | 65.7 | 77.1 | 19 / 35 | 5380 |
| 6 | 1 | 67.1 | 81.0 | 24 / 35 | 5659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 33 | 97% |
| EBBU.Sim2 1.02 | 20 | 95% |
| stelo.UntouchableNano 1.3 | 17 | 94% |
| mb.Beast 0.1 | 17 | 100% |
| skm.Ryubot 1.0 | 15 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 77% |
| agrach.Dalek 1.0 | 12 | 83% |
| lmk.ACPFinal 0.1 | 10 | 90% |

Hadur died in 83 of 210 rounds, at a mean tick of 331. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 19 | 23% | 20 |
| agrach.Dalek 1.0 | 16 | 19% | 37 |
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 13% | 26 |
| germ.TheMind .2 | 10 | 12% | 37 |
| EBBU.Sim2 1.02 | 7 | 8% | 28 |
| lmk.ACPFinal 0.1 | 7 | 8% | 15 |
| mb.Beast 0.1 | 6 | 7% | 21 |
| stelo.UntouchableNano 1.3 | 6 | 7% | 17 |
| skm.Ryubot 1.0 | 1 | 1% | 8 |

## Melee bench: F38

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 76.2 | 58 / 210 | 3.14 | 15.8% | 26602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 16.9% | 98 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.8% | 58 |
| bvh.mini.Freya 0.55 | 3.2 | 12.3% | 16 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.1% | 20 |
| cs.Wren 1.0 | 5.0 | 10.4% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.8 | 9.9% | 4 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.2% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.6% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 79.0 | 10 / 35 | 4641 |
| 2 | 2 | 65.1 | 77.5 | 12 / 35 | 4314 |
| 3 | 1 | 66.5 | 85.4 | 12 / 35 | 4669 |
| 4 | 2 | 62.7 | 73.7 | 6 / 35 | 4233 |
| 5 | 2 | 62.9 | 69.8 | 9 / 35 | 4598 |
| 6 | 2 | 62.7 | 72.1 | 9 / 35 | 4147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 54 | 17% |
| bts.mega.Gnarly 1.4 | 17 | 47% |
| cs.Wren 1.0 | 15 | 87% |
| bvh.mini.Freya 0.55 | 15 | 73% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 100% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 75 | 49% | 88 |
| bvh.mini.Freya 0.55 | 25 | 16% | 33 |
| bts.mega.Gnarly 1.4 | 20 | 13% | 31 |
| cs.Wren 1.0 | 10 | 7% | 21 |
| kdf.KoulDestroyer 1.0 | 7 | 5% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 4% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 4% | 8 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F39

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 74.0 | 58 / 210 | 3.34 | 15.8% | 28563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 15.8% | 58 |
| bvh.fry.Freya 0.82 | 2.2 | 14.7% | 31 |
| az.Ololobot 0.2.4 | 2.7 | 13.1% | 70 |
| catcat20.Lambda 0.024 | 4.0 | 11.2% | 33 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.9% | 3 |
| gimp.GimpBot 0.1 | 6.3 | 8.2% | 0 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.4% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 6.8 | 7.9% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.5% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 68.9 | 10 / 35 | 4436 |
| 2 | 1 | 64.5 | 74.0 | 10 / 35 | 5218 |
| 3 | 1 | 65.1 | 78.7 | 10 / 35 | 4748 |
| 4 | 2 | 61.2 | 67.0 | 7 / 35 | 4529 |
| 5 | 1 | 65.0 | 76.8 | 11 / 35 | 5187 |
| 6 | 1 | 64.1 | 78.7 | 10 / 35 | 4445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 40 | 55% |
| az.Ololobot 0.2.4 | 33 | 9% |
| catcat20.Lambda 0.024 | 23 | 48% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 93% |
| gimp.GimpBot 0.1 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |

Hadur died in 152 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 43 | 28% | 51 |
| bvh.fry.Freya 0.82 | 42 | 28% | 65 |
| catcat20.Lambda 0.024 | 27 | 18% | 33 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 8% | 20 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 5% | 8 |
| apollokidd.ApolloKidd 0.9 | 7 | 5% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5 | 3% | 11 |
| gimp.GimpBot 0.1 | 4 | 3% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 4 | 3% | 4 |

## Melee bench: F40

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.2 | 117 / 210 | 2.60 | 18.5% | 29776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.5% | 117 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.1% | 47 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.2% | 16 |
| mz.AntiGrav 1.0 | 4.2 | 10.7% | 8 |
| Polkwane.SmashMelee 1.0 | 5.2 | 9.7% | 10 |
| stelo.Randomness 1.0 | 6.2 | 8.6% | 6 |
| alpha.BlackIce 1.0 | 6.5 | 8.8% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.5 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.5 | 6.1% | 1 |
| sample.Corners 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.6 | 17 / 35 | 4849 |
| 2 | 1 | 69.2 | 87.3 | 21 / 35 | 5183 |
| 3 | 1 | 67.7 | 81.9 | 20 / 35 | 4630 |
| 4 | 1 | 69.5 | 87.6 | 22 / 35 | 5219 |
| 5 | 1 | 66.8 | 78.1 | 17 / 35 | 4896 |
| 6 | 1 | 68.4 | 82.5 | 20 / 35 | 4999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 70 | 61% |
| mz.AntiGrav 1.0 | 25 | 96% |
| kano.gamma.KanoGamma 1.8 | 22 | 95% |
| Polkwane.SmashMelee 1.0 | 16 | 88% |
| stelo.Randomness 1.0 | 9 | 89% |
| alpha.BlackIce 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 48% | 86 |
| Polkwane.SmashMelee 1.0 | 11 | 12% | 14 |
| mz.AntiGrav 1.0 | 10 | 11% | 26 |
| kano.gamma.KanoGamma 1.8 | 9 | 10% | 38 |
| stelo.Randomness 1.0 | 7 | 8% | 19 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 10 |
| alpha.BlackIce 1.0 | 4 | 4% | 5 |
| sample.Corners 1.0 | 2 | 2% | 4 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 6 |

## Melee bench: F41

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.6 | 83 / 210 | 3.29 | 16.1% | 26603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.5 | 16.2% | 80 |
| hadur117.micro.Saor 0.2 | 1.5 | 16.1% | 83 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.7% | 19 |
| ary.Swarm 1.1 | 3.7 | 12.4% | 13 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.6% | 12 |
| shrub.Silver v048 | 5.8 | 9.9% | 3 |
| zyx.nano.Ant 1.1 | 7.3 | 7.4% | 1 |
| stelo.Mirror 1.1 | 8.3 | 5.9% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.0% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 67.0 | 10 / 35 | 4561 |
| 2 | 1 | 66.2 | 80.3 | 17 / 35 | 4433 |
| 3 | 1 | 66.6 | 79.7 | 14 / 35 | 4717 |
| 4 | 1 | 65.9 | 76.8 | 16 / 35 | 4724 |
| 5 | 2 | 61.7 | 66.0 | 11 / 35 | 3906 |
| 6 | 2 | 65.7 | 77.5 | 15 / 35 | 4262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 52 | 37% |
| lessonz.robocode.Oz 0.5.0 | 27 | 89% |
| ary.Swarm 1.1 | 22 | 91% |
| simonton.nano.MeleeSeed 1.8 | 17 | 94% |
| shrub.Silver v048 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 62 | 49% | 88 |
| ary.Swarm 1.1 | 17 | 13% | 36 |
| simonton.nano.MeleeSeed 1.8 | 17 | 13% | 34 |
| lessonz.robocode.Oz 0.5.0 | 10 | 8% | 23 |
| shrub.Silver v048 | 8 | 6% | 13 |
| zyx.nano.Ant 1.1 | 7 | 6% | 7 |
| acogdev.alpha 0.2 | 5 | 4% | 5 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |

## Melee bench: F42

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.1 | 52 / 210 | 2.97 | 16.4% | 30129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 16.7% | 86 |
| hadur117.micro.Saor 0.2 | 1.8 | 16.4% | 52 |
| ara.Shera 0.88 | 3.5 | 12.9% | 32 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.3% | 32 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 1 |
| dsw.StaticD 1.0 | 6.7 | 7.3% | 6 |
| maribo.IotaCT 1.1 | 6.7 | 7.4% | 1 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 78.7 | 8 / 35 | 4712 |
| 2 | 2 | 64.8 | 76.2 | 9 / 35 | 4717 |
| 3 | 2 | 63.9 | 72.4 | 6 / 35 | 4999 |
| 4 | 2 | 65.1 | 77.8 | 10 / 35 | 5011 |
| 5 | 1 | 68.1 | 86.7 | 15 / 35 | 5452 |
| 6 | 2 | 65.0 | 77.1 | 4 / 35 | 5238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 60 | 30% |
| ara.Shera 0.88 | 29 | 52% |
| maribo.mini.MiniQuester 0.1 | 27 | 56% |
| dsw.StaticD 1.0 | 4 | 50% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 77 | 49% | 96 |
| ara.Shera 0.88 | 32 | 20% | 45 |
| maribo.mini.MiniQuester 0.1 | 23 | 15% | 39 |
| dsw.StaticD 1.0 | 11 | 7% | 13 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 6 | 4% | 6 |
| maribo.IotaCT 1.1 | 3 | 2% | 3 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 3 |
| amz.NanoClone 1.41 | 2 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 3 |

## Melee bench: F43

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 65.0 | 8 / 210 | 4.15 | 12.6% | 20775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 171 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.5% | 18 |
| hadur117.micro.Saor 0.2 | 2.8 | 12.6% | 8 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.2% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.7% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.6% | 1 |
| jab.DiamondStealer 5 | 7.3 | 8.3% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.9% | 1 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.8 | 54.3 | 1 / 35 | 2840 |
| 2 | 2 | 62.4 | 70.5 | 3 / 35 | 3745 |
| 3 | 2 | 60.6 | 65.1 | 0 / 35 | 3705 |
| 4 | 3 | 60.1 | 64.8 | 1 / 35 | 3436 |
| 5 | 3 | 59.7 | 62.9 | 2 / 35 | 3492 |
| 6 | 2 | 62.8 | 72.7 | 1 / 35 | 3557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 58 | 0% |
| brainfade.melee.Dusk 0.44 | 6 | 33% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 50% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |

Hadur died in 202 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 124 | 61% | 124 |
| brainfade.melee.Dusk 0.44 | 22 | 11% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 20 | 10% | 21 |
| mz.NanoGod 2.02 | 14 | 7% | 14 |
| dummy.micro.Sparrow 2.5 | 12 | 6% | 15 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 7 |
| jab.DiamondStealer 5 | 3 | 1% | 3 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.4 | 83 / 210 | 2.94 | 17.5% | 31982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.3 | 17.5% | 83 |
| stelo.Liblix 0.3.1 | 1.7 | 16.7% | 97 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.2% | 18 |
| wompi.Quokka 1.6 | 4.5 | 10.0% | 2 |
| jwirde.Gort 2.0 | 5.0 | 9.4% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 9.1% | 2 |
| disan.Chair 2.2.0 | 7.3 | 7.3% | 2 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.2% | 2 |
| sample.Crazy 1.0 | 9.3 | 4.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.5 | 16 / 35 | 5584 |
| 2 | 1 | 68.8 | 84.8 | 16 / 35 | 5382 |
| 3 | 1 | 68.6 | 86.0 | 16 / 35 | 5389 |
| 4 | 1 | 66.5 | 77.5 | 15 / 35 | 5372 |
| 5 | 2 | 65.4 | 71.7 | 13 / 35 | 5310 |
| 6 | 2 | 62.9 | 67.9 | 7 / 35 | 4945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 79 | 29% |
| tzu.TheArtOfWar 1.2 | 51 | 84% |
| wompi.Quokka 1.6 | 8 | 88% |
| disan.Chair 2.2.0 | 6 | 67% |
| sample.Crazy 1.0 | 2 | 100% |
| jwirde.Gort 2.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 67 | 53% | 95 |
| tzu.TheArtOfWar 1.2 | 33 | 26% | 70 |
| wompi.Quokka 1.6 | 7 | 6% | 11 |
| stf.PanzerGeneral 0.1 | 6 | 5% | 8 |
| disan.Chair 2.2.0 | 6 | 5% | 8 |
| jwirde.Gort 2.0 | 3 | 2% | 9 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.0 | 93 / 210 | 2.35 | 19.5% | 35733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.5% | 93 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.0% | 100 |
| jje.BagPuss 1.2 | 3.5 | 11.3% | 6 |
| myl.nano.Graviton 1.10 | 4.0 | 10.5% | 2 |
| sul.Lunar 1.1 | 4.8 | 10.0% | 8 |
| hvilela.HVilela 0.9 | 6.0 | 8.8% | 0 |
| fm.claire 1.7 | 7.3 | 7.8% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.7% | 1 |
| wit.Deep7 2.0 | 9.3 | 5.7% | 0 |
| abud.ThirdRobo 1.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.6 | 14 / 35 | 6203 |
| 2 | 1 | 70.3 | 87.6 | 16 / 35 | 6187 |
| 3 | 1 | 69.2 | 86.0 | 15 / 35 | 6086 |
| 4 | 1 | 68.3 | 80.6 | 17 / 35 | 5793 |
| 5 | 1 | 68.7 | 83.2 | 18 / 35 | 5792 |
| 6 | 1 | 68.3 | 84.8 | 13 / 35 | 5672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 111 | 34% |
| jje.BagPuss 1.2 | 18 | 83% |
| sul.Lunar 1.1 | 18 | 100% |
| myl.nano.Graviton 1.10 | 9 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 100% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 2027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 76 | 64% | 0 |
| sul.Lunar 1.1 | 8 | 7% | 55 |
| jje.BagPuss 1.2 | 7 | 6% | 51 |
| hvilela.HVilela 0.9 | 7 | 6% | 19 |
| myl.nano.Graviton 1.10 | 6 | 5% | 37 |
| wit.Deep7 2.0 | 4 | 3% | 9 |
| abud.ThirdRobo 1.0 | 4 | 3% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 3% | 19 |
| fm.claire 1.7 | 3 | 3% | 7 |

## Melee bench: F46

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 70.7 | 28 / 210 | 3.64 | 14.6% | 26485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.5% | 83 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.5% | 81 |
| hadur117.micro.Saor 0.2 | 3.0 | 14.6% | 28 |
| mz.MicroSheep 1.0 | 4.2 | 10.4% | 3 |
| cx.Princess 1.0 | 5.2 | 9.8% | 12 |
| sadoner.killer 0.2 | 5.7 | 9.2% | 3 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.6% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 64.4 | 4 / 35 | 4252 |
| 2 | 3 | 62.4 | 68.6 | 5 / 35 | 4408 |
| 3 | 3 | 62.6 | 71.7 | 4 / 35 | 4371 |
| 4 | 3 | 64.1 | 75.6 | 7 / 35 | 4435 |
| 5 | 3 | 63.1 | 73.0 | 6 / 35 | 4352 |
| 6 | 3 | 62.8 | 70.8 | 2 / 35 | 4667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 35 | 29% |
| rsalesc.melee.Medina 0.4.5 | 24 | 17% |
| mz.MicroSheep 1.0 | 8 | 88% |
| cx.Princess 1.0 | 5 | 40% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| sadoner.killer 0.2 | 2 | 50% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 82 | 45% | 94 |
| rsalesc.melee.Medina 0.4.5 | 65 | 36% | 70 |
| cx.Princess 1.0 | 9 | 5% | 9 |
| sadoner.killer 0.2 | 8 | 4% | 13 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 6 |
| kurios.DOSexe .9a | 5 | 3% | 4 |
| mz.MicroSheep 1.0 | 4 | 2% | 8 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 4 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |

