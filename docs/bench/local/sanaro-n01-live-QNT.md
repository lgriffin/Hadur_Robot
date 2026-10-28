# Bench suite: suite.txt

## Melee bench: F01

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 76.7 | 19 / 210 | 3.10 | 14.8% | 26472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 153 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 19 |
| sgp.JollyNinja 3.53 | 3.2 | 12.1% | 22 |
| mz.MicroGodMelee 1 | 4.3 | 11.2% | 7 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.9% | 3 |
| lorneswork.Predator 1.0 | 6.0 | 9.8% | 5 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.3% | 1 |
| skm.butterfly 1.0 | 8.5 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 72.1 | 5 / 35 | 4373 |
| 2 | 2 | 64.8 | 79.4 | 2 / 35 | 4602 |
| 3 | 2 | 63.2 | 78.4 | 4 / 35 | 4088 |
| 4 | 2 | 64.0 | 78.4 | 4 / 35 | 4578 |
| 5 | 2 | 64.5 | 78.7 | 3 / 35 | 4908 |
| 6 | 2 | 61.5 | 73.3 | 1 / 35 | 3923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 89 | 2% |
| mz.MicroGodMelee 1 | 11 | 82% |
| sgp.JollyNinja 3.53 | 9 | 33% |
| lorneswork.Predator 1.0 | 4 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 112 | 59% | 117 |
| sgp.JollyNinja 3.53 | 31 | 16% | 32 |
| lorneswork.Predator 1.0 | 21 | 11% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 6% | 16 |
| mz.MicroGodMelee 1 | 9 | 5% | 13 |
| adt.Ar2 1.0 | 4 | 2% | 5 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F02

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 70.8 | 38 / 210 | 3.62 | 15.2% | 29169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.7 | 14.9% | 76 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 38 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 14.4% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.7% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.8% | 10 |
| sch.Simone 0.3d | 6.5 | 8.3% | 13 |
| Noran.BitchingElk 0.054 | 6.7 | 8.3% | 15 |
| fnc.bandit.Bandit 5.2.0 | 8.0 | 7.3% | 1 |
| stelo.PatternRobot 1.0 | 8.7 | 6.7% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 68.9 | 5 / 35 | 4643 |
| 2 | 2 | 62.0 | 67.3 | 7 / 35 | 4685 |
| 3 | 3 | 61.6 | 68.3 | 2 / 35 | 4940 |
| 4 | 3 | 60.5 | 64.8 | 5 / 35 | 4527 |
| 5 | 1 | 63.7 | 73.3 | 9 / 35 | 4994 |
| 6 | 1 | 66.9 | 82.5 | 10 / 35 | 5380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 36 | 50% |
| pulsar.PulsarMax 0.8.9 | 34 | 6% |
| Noran.BitchingElk 0.054 | 7 | 57% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| stelo.PatternRobot 1.0 | 6 | 33% |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 60% |
| fullsail.SweetTea 1.1 | 3 | 0% |
| sch.Simone 0.3d | 3 | 67% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 60 | 34% | 58 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 25% | 60 |
| lrem.micro.SpikeSoldier 0.4 | 26 | 15% | 28 |
| stelo.PatternRobot 1.0 | 14 | 8% | 14 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 6% | 16 |
| Noran.BitchingElk 0.054 | 6 | 3% | 13 |
| fullsail.SweetTea 1.1 | 6 | 3% | 6 |
| sch.Simone 0.3d | 5 | 3% | 10 |
| fnc.bandit.Bandit 5.2.0 | 4 | 2% | 5 |

## Melee bench: F03

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.8 | 63 / 210 | 2.82 | 16.1% | 29368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.1% | 63 |
| radnor.DoctorBob 1.42 | 2.2 | 14.6% | 50 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.9% | 38 |
| vuen.Cake 2.51 | 3.7 | 13.2% | 47 |
| urdos.URDOS 1.3 | 5.0 | 10.3% | 6 |
| adt.Ar1 2.1 | 6.3 | 7.5% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.1% | 1 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.3% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.9% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 79.0 | 13 / 35 | 4869 |
| 2 | 1 | 65.9 | 81.9 | 13 / 35 | 5077 |
| 3 | 1 | 66.2 | 85.7 | 12 / 35 | 5106 |
| 4 | 1 | 64.6 | 80.3 | 9 / 35 | 5145 |
| 5 | 2 | 63.8 | 77.8 | 10 / 35 | 4589 |
| 6 | 1 | 62.2 | 74.0 | 6 / 35 | 4582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 41 | 37% |
| kawigi.nano.Lib 1.0 | 36 | 56% |
| radnor.DoctorBob 1.42 | 35 | 51% |
| urdos.URDOS 1.3 | 8 | 63% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 0% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 43 | 29% | 64 |
| vuen.Cake 2.51 | 31 | 21% | 46 |
| radnor.DoctorBob 1.42 | 29 | 20% | 42 |
| urdos.URDOS 1.3 | 27 | 18% | 30 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 4% | 6 |
| adt.Ar1 2.1 | 4 | 3% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 3% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 2% | 5 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 5 |

## Melee bench: F04

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 72.4 | 3 / 210 | 3.48 | 14.4% | 28421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.5% | 191 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.4% | 3 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.3% | 9 |
| TNT.TNT 0.99.1 | 4.2 | 10.3% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 2 |
| css.Delitioner 0.11 | 6.3 | 7.9% | 2 |
| tj.zombie1n 1.0.1 | 6.5 | 7.9% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 4.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.6% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 71.1 | 0 / 35 | 4844 |
| 2 | 2 | 63.3 | 74.3 | 0 / 35 | 4500 |
| 3 | 2 | 62.4 | 70.8 | 1 / 35 | 4578 |
| 4 | 3 | 61.8 | 68.3 | 1 / 35 | 4551 |
| 5 | 2 | 64.1 | 74.3 | 1 / 35 | 5156 |
| 6 | 2 | 64.2 | 75.9 | 0 / 35 | 4792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 84 | 0% |
| josago.Jorgito 0.16 | 3 | 67% |
| css.Delitioner 0.11 | 2 | 0% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |
| TNT.TNT 0.99.1 | 2 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 66% | 138 |
| apc.LeeroyJenkins2 1.0 | 26 | 13% | 27 |
| josago.Jorgito 0.16 | 14 | 7% | 16 |
| TNT.TNT 0.99.1 | 11 | 5% | 11 |
| css.Delitioner 0.11 | 9 | 4% | 8 |
| tj.zombie1n 1.0.1 | 6 | 3% | 6 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F06

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 68.9 | 18 / 210 | 3.80 | 13.2% | 20728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.5% | 55 |
| origin.SleepSiphon 1.7b | 2.0 | 14.9% | 76 |
| d414.nano.Quantum 1.0.0 | 3.0 | 13.2% | 18 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.6% | 36 |
| mld.Wisdom 1.0 | 4.8 | 11.3% | 8 |
| gg.Wolverine 2.0 | 6.7 | 8.3% | 4 |
| spinnercat.Omen 1.0 | 7.0 | 8.3% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.3% | 4 |
| DBall.NUKE 0.1 | 8.2 | 6.9% | 5 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 72.7 | 3 / 35 | 3920 |
| 2 | 3 | 59.3 | 68.3 | 3 / 35 | 3294 |
| 3 | 3 | 58.2 | 64.8 | 2 / 35 | 3357 |
| 4 | 4 | 56.1 | 61.0 | 0 / 35 | 3160 |
| 5 | 3 | 60.0 | 70.8 | 2 / 35 | 3527 |
| 6 | 2 | 62.2 | 75.9 | 8 / 35 | 3470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 23 | 9% |
| jekl.StoneGhost 0.7 | 16 | 38% |
| pe.minimelee.SandboxMiniMelee 1.1 | 12 | 25% |
| mld.Wisdom 1.0 | 6 | 50% |
| gg.Wolverine 2.0 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 0% |
| DBall.NUKE 0.1 | 2 | 50% |

Hadur died in 193 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 53 | 27% | 53 |
| jekl.StoneGhost 0.7 | 51 | 26% | 52 |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 17% | 35 |
| mld.Wisdom 1.0 | 31 | 16% | 37 |
| gg.Wolverine 2.0 | 9 | 5% | 13 |
| spinnercat.Omen 1.0 | 7 | 4% | 9 |
| DBall.NUKE 0.1 | 4 | 2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 2% | 4 |
| sample.Fire 1.0 | 2 | 1% | 2 |

## Melee bench: F07

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.0 | 29 / 210 | 2.71 | 16.9% | 34007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 17.9% | 65 |
| rtk.Tachikoma 1.0 | 2.2 | 17.5% | 86 |
| d414.nano.Quantum 1.0.0 | 2.3 | 16.9% | 29 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.7% | 16 |
| franzor.Lizt 1.3.1 | 4.8 | 10.7% | 17 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.8 | 81.6 | 6 / 35 | 5811 |
| 2 | 1 | 68.6 | 82.5 | 8 / 35 | 5923 |
| 3 | 3 | 67.1 | 78.4 | 5 / 35 | 5351 |
| 4 | 2 | 68.0 | 82.5 | 5 / 35 | 5675 |
| 5 | 3 | 65.9 | 77.5 | 1 / 35 | 5440 |
| 6 | 2 | 68.0 | 83.2 | 4 / 35 | 5807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 61 | 16% |
| rsalesc.melee.Monk 0.3.6c | 29 | 7% |
| oog.melee.CapuletDroid 1.1 | 19 | 63% |
| franzor.Lizt 1.3.1 | 9 | 56% |

Hadur died in 182 of 210 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 92 | 51% | 103 |
| rsalesc.melee.Monk 0.3.6c | 60 | 33% | 65 |
| oog.melee.CapuletDroid 1.1 | 17 | 9% | 31 |
| franzor.Lizt 1.3.1 | 7 | 4% | 4 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 72.1 | 34 / 210 | 3.51 | 14.3% | 23113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.5 | 14.6% | 72 |
| d414.nano.Quantum 1.0.0 | 1.7 | 14.3% | 34 |
| shrub.Vapour v159 | 2.8 | 12.8% | 35 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 11.4% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.8% | 18 |
| m3thos.Eva00 1.1 | 5.8 | 9.0% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.4% | 13 |
| SHAM.WOW 1.4 | 8.8 | 6.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.7% | 3 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 6.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 73.0 | 9 / 35 | 3967 |
| 2 | 2 | 60.6 | 70.8 | 4 / 35 | 4044 |
| 3 | 2 | 60.4 | 71.7 | 5 / 35 | 3714 |
| 4 | 2 | 59.8 | 69.8 | 2 / 35 | 3911 |
| 5 | 2 | 60.4 | 69.8 | 7 / 35 | 3941 |
| 6 | 1 | 61.9 | 77.1 | 7 / 35 | 3536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 36 | 28% |
| Krabb.sliNk.Garm 0.9u | 17 | 53% |
| shrub.Vapour v159 | 15 | 13% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 27% |
| m3thos.Eva00 1.1 | 9 | 67% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 50% |
| zyx.nano.BacillusComma 1.0 | 3 | 0% |
| qualidafial.MajorDick 1.0.1 | 2 | 50% |

Hadur died in 181 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 53 | 29% | 62 |
| shrub.Vapour v159 | 37 | 20% | 42 |
| Krabb.sliNk.Garm 0.9u | 25 | 14% | 31 |
| com.spp.robocode.MostlyHarmless 010 | 21 | 12% | 25 |
| m3thos.Eva00 1.1 | 15 | 8% | 18 |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 7% | 15 |
| zyx.nano.BacillusComma 1.0 | 8 | 4% | 8 |
| qualidafial.MajorDick 1.0.1 | 4 | 2% | 5 |
| SHAM.WOW 1.4 | 3 | 2% | 4 |
2 death(s) with no robot to name.

## Melee bench: F09

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 61.9 | 10 / 210 | 4.43 | 12.2% | 20241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 122 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 39 |
| d414.nano.Quantum 1.0.0 | 3.3 | 12.2% | 10 |
| yagami.Tidus 0.11 | 3.7 | 12.0% | 10 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.2% | 17 |
| mc2.enemy.Original 0.9 | 5.8 | 9.6% | 9 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 3 |
| step.nanoPri 1.0 | 8.5 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 58.7 | 0 / 35 | 3369 |
| 2 | 3 | 58.8 | 64.8 | 1 / 35 | 3623 |
| 3 | 3 | 57.1 | 63.8 | 0 / 35 | 3240 |
| 4 | 3 | 57.3 | 60.6 | 2 / 35 | 3181 |
| 5 | 3 | 59.3 | 64.8 | 5 / 35 | 3544 |
| 6 | 4 | 56.9 | 58.7 | 2 / 35 | 3284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 23 | 9% |
| kc.micro.Figment 1.0 | 13 | 31% |
| yagami.Tidus 0.11 | 6 | 0% |
| mc2.enemy.Original 0.9 | 5 | 80% |
| pedersen.Grishnakh 1.0 | 3 | 0% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 200 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 64 | 32% | 64 |
| kc.micro.Figment 1.0 | 45 | 23% | 51 |
| yagami.Tidus 0.11 | 33 | 17% | 33 |
| mc2.enemy.Original 0.9 | 20 | 10% | 24 |
| pedersen.Grishnakh 1.0 | 20 | 10% | 20 |
| robar.nano.Assertive_Melee 0.2 | 7 | 4% | 7 |
| step.nanoPri 1.0 | 5 | 3% | 5 |
| dft.Calliope 5.6 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |

## Melee bench: F10

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.9 | 65 / 210 | 2.45 | 16.9% | 29429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.9% | 65 |
| DTF.Kludgy 1.2b | 2.3 | 14.2% | 52 |
| ejb.Polaris 1.0.1 | 3.5 | 12.3% | 23 |
| ne.Chimera 1.2 | 3.7 | 12.6% | 17 |
| tvv.micro.Antares 1.1.1 | 5.2 | 11.6% | 25 |
| vStar.RAFzilla 2.15 | 5.3 | 11.0% | 23 |
| sam.Samspin 1.0 | 7.5 | 6.2% | 2 |
| kurios.DOSexe .9b | 8.2 | 5.6% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 81.6 | 8 / 35 | 4850 |
| 2 | 1 | 66.3 | 84.1 | 15 / 35 | 4899 |
| 3 | 1 | 66.9 | 87.6 | 12 / 35 | 5030 |
| 4 | 1 | 66.0 | 83.5 | 9 / 35 | 4948 |
| 5 | 1 | 65.1 | 80.3 | 10 / 35 | 4683 |
| 6 | 1 | 66.8 | 86.0 | 11 / 35 | 5019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 45 | 44% |
| ejb.Polaris 1.0.1 | 29 | 59% |
| vStar.RAFzilla 2.15 | 23 | 43% |
| tvv.micro.Antares 1.1.1 | 18 | 33% |
| ne.Chimera 1.2 | 17 | 41% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 2 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 49 | 34% | 68 |
| ne.Chimera 1.2 | 30 | 21% | 45 |
| ejb.Polaris 1.0.1 | 19 | 13% | 40 |
| vStar.RAFzilla 2.15 | 18 | 12% | 24 |
| tvv.micro.Antares 1.1.1 | 17 | 12% | 14 |
| sam.Samspin 1.0 | 6 | 4% | 8 |
| donjezza.Muncho 1.0 | 4 | 3% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 1 |

## Melee bench: F11

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 67.6 | 10 / 210 | 3.92 | 13.3% | 22738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.5% | 102 |
| cx.mini.Nimrod 0.55 | 2.5 | 12.7% | 34 |
| d414.nano.Quantum 1.0.0 | 2.5 | 13.3% | 10 |
| djc.DynaBot 0.1.1 | 4.2 | 11.0% | 20 |
| br2.MobyDickBot 1.6 | 5.5 | 9.6% | 18 |
| rdt199.Warlord 0.73 | 5.5 | 10.0% | 16 |
| uji.YellohFellah 1.0 | 7.2 | 8.5% | 12 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 64.8 | 1 / 35 | 3589 |
| 2 | 2 | 60.7 | 69.8 | 3 / 35 | 4104 |
| 3 | 2 | 60.9 | 70.8 | 2 / 35 | 3976 |
| 4 | 2 | 60.4 | 70.5 | 3 / 35 | 3712 |
| 5 | 3 | 58.6 | 64.8 | 1 / 35 | 3618 |
| 6 | 3 | 58.2 | 64.8 | 0 / 35 | 3739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 37 | 5% |
| cx.mini.Nimrod 0.55 | 9 | 33% |
| uji.YellohFellah 1.0 | 7 | 43% |
| djc.DynaBot 0.1.1 | 7 | 14% |
| rdt199.Warlord 0.73 | 6 | 0% |
| br2.MobyDickBot 1.6 | 4 | 0% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 200 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 90 | 45% | 91 |
| cx.mini.Nimrod 0.55 | 33 | 17% | 34 |
| djc.DynaBot 0.1.1 | 22 | 11% | 22 |
| rdt199.Warlord 0.73 | 21 | 11% | 22 |
| br2.MobyDickBot 1.6 | 11 | 6% | 13 |
| uji.YellohFellah 1.0 | 10 | 5% | 13 |
| KiraNL.Chupacabra 0.4 | 8 | 4% | 9 |
| stelo.MirrorNano 1.3 | 4 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 2 |

## Melee bench: F12

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 69.6 | 43 / 210 | 3.74 | 13.8% | 20543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 2.2 | 14.3% | 50 |
| d414.nano.Quantum 1.0.0 | 2.3 | 13.8% | 43 |
| nat.PallasHawk 1.0 | 2.7 | 13.5% | 58 |
| darkcanuck.Leon 1.01 | 2.8 | 13.4% | 34 |
| brainfade.melee.Genghis 0.36 | 5.0 | 11.0% | 21 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.4% | 2 |
| jp.Perpy 16.0 | 7.0 | 7.5% | 0 |
| jrm.Test0 1.0 | 7.5 | 7.6% | 0 |
| stuff.Vlad 0.1 | 9.0 | 6.1% | 1 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 66.3 | 7 / 35 | 3335 |
| 2 | 1 | 60.4 | 71.1 | 6 / 35 | 3335 |
| 3 | 2 | 60.6 | 69.8 | 6 / 35 | 3559 |
| 4 | 3 | 60.5 | 68.3 | 8 / 35 | 3448 |
| 5 | 2 | 60.5 | 68.9 | 9 / 35 | 3540 |
| 6 | 2 | 61.1 | 73.0 | 7 / 35 | 3326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 33 | 61% |
| bts.wiki.RipCurl 0.9b | 26 | 31% |
| nat.PallasHawk 1.0 | 22 | 36% |
| brainfade.melee.Genghis 0.36 | 9 | 33% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 47 | 28% | 52 |
| darkcanuck.Leon 1.01 | 34 | 20% | 56 |
| nat.PallasHawk 1.0 | 33 | 19% | 41 |
| brainfade.melee.Genghis 0.36 | 27 | 16% | 28 |
| cs.sheldor.Talon 1.1 | 9 | 5% | 9 |
| jp.Perpy 16.0 | 8 | 5% | 9 |
| jrm.Test0 1.0 | 6 | 4% | 6 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| jaybot.bots.Oddball 4.0 | 3 | 2% | 4 |

## Melee bench: F13

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 71.1 | 12 / 210 | 3.60 | 13.3% | 22178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.9% | 101 |
| ags.Glacier 0.2.11 | 1.5 | 16.7% | 58 |
| d414.nano.Quantum 1.0.0 | 3.3 | 13.3% | 12 |
| shinh.Entangled 0.3 | 4.3 | 12.5% | 21 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.2% | 18 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.0% | 0 |
| maribo.FollowFire 1 | 8.5 | 5.0% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 5.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.8 | 70.5 | 2 / 35 | 3770 |
| 2 | 4 | 59.3 | 67.9 | 2 / 35 | 3544 |
| 3 | 3 | 62.3 | 75.2 | 5 / 35 | 3818 |
| 4 | 3 | 59.6 | 67.9 | 1 / 35 | 3541 |
| 5 | 3 | 60.6 | 69.5 | 1 / 35 | 3894 |
| 6 | 3 | 61.4 | 75.6 | 1 / 35 | 3611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 29 | 10% |
| mn.Combat 3.25.0 | 25 | 0% |
| shinh.Entangled 0.3 | 9 | 67% |
| gh.micro.Gruweltje 0.7 | 6 | 17% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 198 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 64 | 32% | 69 |
| mn.Combat 3.25.0 | 62 | 31% | 62 |
| shinh.Entangled 0.3 | 30 | 15% | 35 |
| gh.micro.Gruweltje 0.7 | 23 | 12% | 23 |
| stelo.Wang 1.0 | 10 | 5% | 12 |
| maribo.FollowFire 1 | 6 | 3% | 6 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

## Melee bench: F14

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 77.0 | 34 / 210 | 3.07 | 14.9% | 24660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.3% | 88 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 34 |
| catcat20.shape.Theta 0.018 | 3.8 | 12.1% | 46 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 10.2% | 11 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 10.1% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.9% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 10.0% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.2% | 11 |
| pa.Improved 1.0 | 9.0 | 5.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 76.8 | 5 / 35 | 3825 |
| 2 | 2 | 64.0 | 78.1 | 6 / 35 | 4419 |
| 3 | 2 | 64.0 | 77.5 | 8 / 35 | 4276 |
| 4 | 2 | 63.5 | 78.4 | 5 / 35 | 4364 |
| 5 | 2 | 63.7 | 78.7 | 6 / 35 | 4104 |
| 6 | 2 | 61.2 | 72.4 | 4 / 35 | 3672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 25% |
| catcat20.shape.Theta 0.018 | 29 | 34% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 38% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 29% |
| sanyi.mikrobi.Roberto 1.0 | 5 | 20% |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 50% |

Hadur died in 176 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 45% | 87 |
| catcat20.shape.Theta 0.018 | 32 | 18% | 39 |
| Lo_Ian.Gandalf_V4 4.0 | 20 | 11% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 7% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 7% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 9 | 5% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 5% | 12 |
| pa.Improved 1.0 | 1 | 1% | 1 |

## Melee bench: F15

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 65.9 | 28 / 210 | 4.07 | 13.6% | 25553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 15.0% | 48 |
| d414.nano.Quantum 1.0.0 | 2.3 | 13.6% | 28 |
| mld.DustBunny 3.8 | 3.0 | 13.3% | 21 |
| emp.Yngwie 1.11 | 3.5 | 13.1% | 59 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.7% | 11 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.2% | 36 |
| Grystrion.TrackerWO 1.0 | 7.7 | 7.1% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.9% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.8% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 69.8 | 4 / 35 | 4278 |
| 2 | 3 | 58.0 | 62.5 | 4 / 35 | 3729 |
| 3 | 3 | 57.5 | 58.7 | 2 / 35 | 4150 |
| 4 | 3 | 60.2 | 66.3 | 2 / 35 | 4410 |
| 5 | 2 | 60.2 | 66.0 | 6 / 35 | 4280 |
| 6 | 1 | 63.4 | 71.7 | 10 / 35 | 4706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 19 | 16% |
| kawigi.micro.Shiz 1.1 | 16 | 44% |
| mld.DustBunny 3.8 | 12 | 58% |
| kawigi.robot.Girl 1.2 | 9 | 33% |
| cb.nano.Insomnia 1.0 | 8 | 88% |
| divineomega.TrialBot 0.003 | 2 | 0% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 42 | 23% | 50 |
| emp.Yngwie 1.11 | 42 | 23% | 45 |
| mld.DustBunny 3.8 | 31 | 17% | 39 |
| cb.nano.Insomnia 1.0 | 25 | 14% | 26 |
| kawigi.robot.Girl 1.2 | 23 | 13% | 27 |
| Grystrion.TrackerWO 1.0 | 7 | 4% | 7 |
| divineomega.TrialBot 0.003 | 5 | 3% | 9 |
| lambdaxy.TBot 0.1 | 5 | 3% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |

## Melee bench: F16

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 69.6 | 45 / 210 | 3.74 | 14.9% | 28583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.2 | 17.2% | 85 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 15.1% | 21 |
| d414.nano.Quantum 1.0.0 | 2.5 | 14.9% | 45 |
| techdude.forest.FlamingForest 1.1 | 4.8 | 10.1% | 33 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.7% | 3 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.4% | 12 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 8.0% | 7 |
| repositorio.NanoStep 1.0 | 8.5 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.7% | 5 |
| asd.Cthulhu 1.3 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 72.7 | 9 / 35 | 4885 |
| 2 | 3 | 62.2 | 68.6 | 7 / 35 | 4684 |
| 3 | 3 | 62.8 | 68.6 | 7 / 35 | 4802 |
| 4 | 2 | 63.4 | 70.8 | 8 / 35 | 4819 |
| 5 | 2 | 64.2 | 71.4 | 8 / 35 | 5067 |
| 6 | 3 | 60.5 | 65.4 | 6 / 35 | 4326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 40 | 53% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 60% |
| techdude.forest.FlamingForest 1.1 | 12 | 25% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 50% |

Hadur died in 167 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 67 | 40% | 93 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 38 | 23% | 46 |
| bvh.fnr.Fenrir 0.36l | 18 | 11% | 19 |
| techdude.forest.FlamingForest 1.1 | 17 | 10% | 21 |
| stelo.IntrinsicVolatility 1.4 | 12 | 7% | 14 |
| divineomega.DivineBot 1.9.4.5 | 6 | 4% | 6 |
| tvv.nano.Polaris 1.2 | 4 | 2% | 5 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F17

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 67.4 | 26 / 210 | 3.93 | 13.9% | 26163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cx.BlestPain 1.41 | 1.8 | 14.4% | 79 |
| oog.melee.Mercutio 1.0 | 2.2 | 13.9% | 56 |
| d414.nano.Quantum 1.0.0 | 2.5 | 13.9% | 26 |
| et.Predator 1.8 | 3.7 | 13.0% | 18 |
| nic.Nicator 2.4 | 5.3 | 11.3% | 11 |
| ahf.NanoAndrew .4 | 5.5 | 11.0% | 18 |
| maribo.melee.BMV 0.1 | 7.0 | 8.7% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.3% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 69.8 | 6 / 35 | 4448 |
| 2 | 1 | 63.7 | 73.3 | 5 / 35 | 4756 |
| 3 | 3 | 59.4 | 62.9 | 3 / 35 | 4162 |
| 4 | 3 | 61.2 | 67.6 | 3 / 35 | 4326 |
| 5 | 3 | 58.6 | 63.5 | 4 / 35 | 3946 |
| 6 | 3 | 61.5 | 67.3 | 5 / 35 | 4525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 20 | 25% |
| oog.melee.Mercutio 1.0 | 18 | 22% |
| et.Predator 1.8 | 12 | 58% |
| nic.Nicator 2.4 | 11 | 55% |
| ahf.NanoAndrew .4 | 5 | 60% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 45 | 24% | 49 |
| cx.BlestPain 1.41 | 41 | 22% | 44 |
| nic.Nicator 2.4 | 29 | 16% | 33 |
| et.Predator 1.8 | 26 | 14% | 35 |
| ahf.NanoAndrew .4 | 24 | 13% | 26 |
| maribo.melee.BMV 0.1 | 12 | 7% | 16 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 2% | 4 |
| tex.Longbot 0.4 | 2 | 1% | 2 |
| goblin.Bender 2.4 | 1 | 1% | 1 |

## Melee bench: F18

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 73.1 | 36 / 210 | 3.42 | 14.5% | 23303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.5 | 14.5% | 59 |
| d414.nano.Quantum 1.0.0 | 1.5 | 14.5% | 36 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.4% | 44 |
| uji.DBH 1.1 | 4.3 | 11.2% | 24 |
| ratosh.Nobo 0.21 | 4.8 | 10.6% | 12 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.7% | 6 |
| sigterm.Sigterm 1.0 | 7.0 | 8.9% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.9% | 11 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 71.4 | 2 / 35 | 3944 |
| 2 | 2 | 62.5 | 76.8 | 5 / 35 | 3811 |
| 3 | 2 | 62.2 | 74.3 | 9 / 35 | 3955 |
| 4 | 1 | 61.8 | 74.6 | 7 / 35 | 3838 |
| 5 | 1 | 60.6 | 69.5 | 7 / 35 | 3876 |
| 6 | 1 | 61.0 | 72.1 | 6 / 35 | 3879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 36 | 33% |
| uji.DBH 1.1 | 15 | 47% |
| agd.Mooserwirt2 2.7 | 14 | 7% |
| sigterm.Sigterm 1.0 | 14 | 36% |
| ratosh.Nobo 0.21 | 10 | 40% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 43% |
| spinnercat.Robovirus 2.718 | 6 | 50% |
| stelo.WangRobot 1.0 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 58 | 33% | 67 |
| agd.Mooserwirt2 2.7 | 34 | 19% | 35 |
| uji.DBH 1.1 | 23 | 13% | 28 |
| ratosh.Nobo 0.21 | 16 | 9% | 19 |
| spinnercat.Robovirus 2.718 | 14 | 8% | 16 |
| sigterm.Sigterm 1.0 | 11 | 6% | 15 |
| stelo.WangRobot 1.0 | 8 | 5% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 4% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 3% | 7 |

## Melee bench: F19

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.5 | 53 / 210 | 2.57 | 16.7% | 28825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.7% | 53 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 15.9% | 53 |
| mld.Infinity 2.2 | 2.3 | 15.9% | 81 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 10.9% | 5 |
| erdnis.Rover 0.3 | 4.7 | 10.3% | 5 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.7% | 4 |
| pac.ABC 2.1 | 7.2 | 7.5% | 8 |
| mbh.Mbh 0.1 | 7.7 | 7.3% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 89.5 | 9 / 35 | 4994 |
| 2 | 1 | 66.0 | 80.3 | 11 / 35 | 4742 |
| 3 | 1 | 67.4 | 84.4 | 10 / 35 | 4980 |
| 4 | 1 | 65.7 | 80.6 | 3 / 35 | 4943 |
| 5 | 1 | 67.7 | 83.5 | 12 / 35 | 5181 |
| 6 | 3 | 64.0 | 76.8 | 8 / 35 | 3985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 56 | 32% |
| davidalves.net.DuelistMiniMelee 1.2 | 44 | 41% |
| krillr.mini.JointStrike 2.0.0 | 8 | 63% |
| patson.PatsonTestBot 1.0 | 8 | 75% |
| erdnis.Rover 0.3 | 7 | 57% |
| pac.ABC 2.1 | 4 | 25% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 63 | 39% | 99 |
| mld.Infinity 2.2 | 53 | 33% | 24 |
| krillr.mini.JointStrike 2.0.0 | 14 | 9% | 22 |
| erdnis.Rover 0.3 | 13 | 8% | 20 |
| patson.PatsonTestBot 1.0 | 8 | 5% | 15 |
| pac.ABC 2.1 | 5 | 3% | 9 |
| pbg.R2D2 1.0 | 4 | 3% | 11 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |

## Melee bench: F20

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 74.6 | 38 / 210 | 3.29 | 15.1% | 25671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 16.8% | 82 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 38 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.0% | 16 |
| fwb.Nine 1.0.1 | 4.3 | 10.7% | 29 |
| catcat20.Rabbit 0.001 | 5.2 | 10.3% | 28 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 9.2% | 11 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.6% | 4 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.8% | 2 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 76.5 | 8 / 35 | 4279 |
| 2 | 2 | 63.2 | 75.6 | 5 / 35 | 4399 |
| 3 | 2 | 62.5 | 72.1 | 7 / 35 | 4250 |
| 4 | 2 | 63.2 | 77.1 | 8 / 35 | 3995 |
| 5 | 2 | 63.3 | 75.2 | 5 / 35 | 4660 |
| 6 | 2 | 61.4 | 70.8 | 5 / 35 | 4088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 43 | 42% |
| catcat20.Rabbit 0.001 | 18 | 28% |
| fwb.Nine 1.0.1 | 10 | 20% |
| nz.jdc.nano.GridFu 1.0 | 9 | 44% |
| djdjdj.NanoSkunk10 1.0 | 6 | 67% |
| m3thos.mini.Eva01 0.5.5 | 4 | 25% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 67 | 38% | 78 |
| nz.jdc.nano.GridFu 1.0 | 26 | 15% | 38 |
| catcat20.Rabbit 0.001 | 26 | 15% | 28 |
| fwb.Nine 1.0.1 | 25 | 14% | 24 |
| djdjdj.NanoSkunk10 1.0 | 16 | 9% | 20 |
| bayen.nut.Squirrel 1.615 | 8 | 4% | 9 |
| m3thos.mini.Eva01 0.5.5 | 7 | 4% | 9 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F21

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.1 | 50 / 210 | 2.97 | 16.7% | 31848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.2 | 17.3% | 111 |
| d414.nano.Quantum 1.0.0 | 1.8 | 16.7% | 50 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 20 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 9 |
| oa.weak.BotherBot 0.1 | 5.3 | 9.2% | 6 |
| eld.Hmm 1.0 | 5.8 | 8.7% | 17 |
| fire219.CatBot 1.0 | 7.7 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.0 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 80.0 | 11 / 35 | 5785 |
| 2 | 2 | 64.8 | 77.5 | 4 / 35 | 4935 |
| 3 | 1 | 66.0 | 78.7 | 11 / 35 | 5358 |
| 4 | 2 | 65.9 | 76.8 | 9 / 35 | 5226 |
| 5 | 2 | 65.4 | 77.1 | 7 / 35 | 5369 |
| 6 | 2 | 65.8 | 78.4 | 8 / 35 | 5175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 68 | 34% |
| dummy.mini.Scimitar 1.01 | 20 | 70% |
| cf.RiO.RiOx 4.2.1 | 8 | 88% |
| eld.Hmm 1.0 | 7 | 14% |
| oa.weak.BotherBot 0.1 | 6 | 83% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 163 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 74 | 45% | 82 |
| dummy.mini.Scimitar 1.01 | 36 | 22% | 54 |
| cf.RiO.RiOx 4.2.1 | 23 | 14% | 32 |
| eld.Hmm 1.0 | 10 | 6% | 16 |
| oa.weak.BotherBot 0.1 | 6 | 4% | 13 |
| PSW.Relentless 0.1 | 6 | 4% | 6 |
| arthord.MannyPacquiao Beta | 2 | 1% | 3 |
| el.JumpShoot 0.2 | 2 | 1% | 2 |
| fire219.CatBot 1.0 | 2 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F23

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.3 | 40 / 210 | 2.77 | 16.2% | 27171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 19.3% | 102 |
| d414.nano.Quantum 1.0.0 | 2.3 | 16.2% | 40 |
| cre.Karolos 0.32 | 2.8 | 14.8% | 41 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.6% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.9% | 2 |
| stelo.RamTrackSurfer 1.2 | 6.5 | 8.5% | 7 |
| sample.Walls 1.0 | 6.5 | 8.4% | 9 |
| cw.megas.Blade 0.8 | 7.0 | 8.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.4 | 77.5 | 8 / 35 | 4195 |
| 2 | 2 | 65.6 | 76.8 | 6 / 35 | 4534 |
| 3 | 2 | 66.3 | 79.7 | 7 / 35 | 4437 |
| 4 | 2 | 68.0 | 84.1 | 6 / 35 | 4995 |
| 5 | 3 | 64.7 | 77.8 | 3 / 35 | 4214 |
| 6 | 2 | 67.9 | 86.0 | 10 / 35 | 4796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 68 | 25% |
| cre.Karolos 0.32 | 33 | 21% |
| stelo.AreaTargetingBot 1.1 | 13 | 92% |
| sample.Walls 1.0 | 8 | 25% |
| stelo.RamTrackSurfer 1.2 | 6 | 33% |

Hadur died in 172 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 90 | 52% | 105 |
| cre.Karolos 0.32 | 38 | 22% | 47 |
| stelo.AreaTargetingBot 1.1 | 13 | 8% | 21 |
| stelo.RamTrackSurfer 1.2 | 11 | 6% | 13 |
| sample.Walls 1.0 | 10 | 6% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 5% | 10 |
| cw.megas.Blade 0.8 | 2 | 1% | 2 |

## Melee bench: F24

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 63.1 | 17 / 210 | 4.32 | 12.4% | 20686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 2.3 | 13.8% | 54 |
| davidalves.Phoenix 0.54 | 2.5 | 13.6% | 54 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.0% | 40 |
| d414.nano.Quantum 1.0.0 | 3.5 | 12.4% | 17 |
| pedersen.Ugluk 1.1.1 | 4.2 | 11.8% | 24 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.7% | 10 |
| oog.melee.Corsair 1.0 | 6.5 | 9.4% | 11 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 2 |
| as.FrankTheTank 1.3 | 9.3 | 5.2% | 0 |
| evd.X1 0.01 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.0 | 64.1 | 2 / 35 | 3094 |
| 2 | 2 | 59.7 | 68.6 | 2 / 35 | 3809 |
| 3 | 3 | 59.1 | 67.9 | 2 / 35 | 3469 |
| 4 | 5 | 52.6 | 51.4 | 2 / 35 | 3144 |
| 5 | 3 | 58.9 | 64.1 | 3 / 35 | 3660 |
| 6 | 3 | 58.0 | 62.2 | 6 / 35 | 3510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 17 | 29% |
| florent.XSeries.X2 0.12 | 16 | 6% |
| pedersen.Ugluk 1.1.1 | 13 | 38% |
| davidalves.Phoenix 0.54 | 8 | 13% |
| stelo.SoJNanoMelee 1.1 | 7 | 71% |
| oog.melee.Corsair 1.0 | 4 | 0% |
| lunchie.Lunchbox 0.93 | 2 | 0% |

Hadur died in 193 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 49 | 25% | 49 |
| rz.GlowBlowMelee 1.4 | 40 | 21% | 47 |
| pedersen.Ugluk 1.1.1 | 33 | 17% | 33 |
| davidalves.Phoenix 0.54 | 26 | 13% | 27 |
| oog.melee.Corsair 1.0 | 17 | 9% | 22 |
| stelo.SoJNanoMelee 1.1 | 11 | 6% | 13 |
| lunchie.Lunchbox 0.93 | 9 | 5% | 11 |
| as.FrankTheTank 1.3 | 5 | 3% | 5 |
| evd.X1 0.01 | 3 | 2% | 3 |

## Melee bench: F25

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.5 | 50 / 210 | 3.74 | 14.1% | 20893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.4% | 47 |
| d414.nano.Quantum 1.0.0 | 1.8 | 14.1% | 50 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.9% | 28 |
| jdw.Hurricane 1.4 | 3.8 | 12.4% | 31 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 10.6% | 25 |
| ds.Oo 2.2 | 6.2 | 8.9% | 12 |
| gjr.Cephalosporin 0.1 | 6.5 | 8.4% | 12 |
| awesomeness.Elite 1.0 | 8.2 | 7.1% | 5 |
| adt.Ar2 1.1 | 8.8 | 6.6% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 74.6 | 8 / 35 | 3142 |
| 2 | 2 | 60.3 | 67.0 | 8 / 35 | 3639 |
| 3 | 1 | 61.0 | 69.8 | 5 / 35 | 3946 |
| 4 | 2 | 60.3 | 66.0 | 13 / 35 | 3354 |
| 5 | 2 | 60.9 | 68.3 | 11 / 35 | 3353 |
| 6 | 2 | 60.8 | 71.4 | 5 / 35 | 3459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 32 | 53% |
| jdw.Hurricane 1.4 | 17 | 53% |
| voidious.micro.BlitzBat 1.05 | 16 | 69% |
| gre.svman4.Morfeas 1.4.1 | 10 | 70% |
| gjr.Cephalosporin 0.1 | 6 | 33% |
| ds.Oo 2.2 | 5 | 20% |
| adt.Ar2 1.1 | 1 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 37 | 23% | 51 |
| jdw.Hurricane 1.4 | 36 | 22% | 40 |
| voidious.micro.BlitzBat 1.05 | 33 | 20% | 43 |
| ds.Oo 2.2 | 16 | 10% | 21 |
| gjr.Cephalosporin 0.1 | 13 | 8% | 16 |
| gre.svman4.Morfeas 1.4.1 | 10 | 6% | 17 |
| adt.Ar2 1.1 | 9 | 6% | 10 |
| awesomeness.Elite 1.0 | 4 | 2% | 7 |
| amk.ChumbaMini 0.2 | 3 | 2% | 4 |

## Melee bench: F26

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 68.0 | 22 / 210 | 3.88 | 13.4% | 24529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.3% | 83 |
| d414.nano.Quantum 1.0.0 | 2.8 | 13.4% | 22 |
| lrem.Spectre 0.4.4 | 3.3 | 12.7% | 30 |
| shu.nitro.LENIN .T34 | 3.5 | 12.2% | 32 |
| js.PinBall 1.6 | 4.7 | 11.5% | 13 |
| gh.mini.GrubbmOne 1.0 | 5.8 | 10.9% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 9.4% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 7 |
| sample.SpinBot 1.0 | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 63.5 | 1 / 35 | 3670 |
| 2 | 2 | 63.5 | 75.9 | 4 / 35 | 4735 |
| 3 | 4 | 57.4 | 61.0 | 4 / 35 | 3372 |
| 4 | 3 | 60.9 | 67.6 | 5 / 35 | 4371 |
| 5 | 2 | 61.2 | 70.5 | 2 / 35 | 4274 |
| 6 | 2 | 61.3 | 69.8 | 6 / 35 | 4107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 30 | 3% |
| shu.nitro.LENIN .T34 | 17 | 59% |
| lrem.Spectre 0.4.4 | 11 | 36% |
| gh.mini.GrubbmOne 1.0 | 10 | 30% |
| js.PinBall 1.6 | 8 | 38% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 17% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 0% |

Hadur died in 190 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 63 | 33% | 63 |
| gh.mini.GrubbmOne 1.0 | 30 | 16% | 33 |
| lrem.Spectre 0.4.4 | 26 | 14% | 26 |
| js.PinBall 1.6 | 25 | 13% | 29 |
| shu.nitro.LENIN .T34 | 22 | 12% | 33 |
| jaybot.adv.bots.JayBot 2.0 | 10 | 5% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 5% | 11 |
| sample.SpinBot 1.0 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F27

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 64.8 | 14 / 210 | 4.17 | 12.6% | 20684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.0 | 15.8% | 96 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 11.6% | 28 |
| wee.Gem 1.8.4 | 3.7 | 12.2% | 40 |
| EH.Eagle 1.0.6 | 3.7 | 11.9% | 25 |
| d414.nano.Quantum 1.0.0 | 3.7 | 12.6% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.9% | 7 |
| joe.ADinosaur 1.0 | 6.8 | 8.6% | 1 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.2% | 2 |
| caimano.Furia_Ceca 0.22 | 9.2 | 5.9% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 65.7 | 0 / 35 | 3002 |
| 2 | 3 | 59.7 | 72.4 | 4 / 35 | 3284 |
| 3 | 3 | 58.0 | 67.3 | 0 / 35 | 3238 |
| 4 | 4 | 57.9 | 65.4 | 2 / 35 | 3310 |
| 5 | 6 | 52.7 | 42.5 | 3 / 35 | 4190 |
| 6 | 2 | 61.8 | 75.6 | 5 / 35 | 3660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 19 | 26% |
| EH.Eagle 1.0.6 | 10 | 10% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 20% |
| wee.Gem 1.8.4 | 7 | 57% |
| throxbot.ThroxBot 0.1 | 1 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 1 | 100% |

Hadur died in 198 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 63 | 32% | 67 |
| EH.Eagle 1.0.6 | 32 | 16% | 33 |
| wee.Gem 1.8.4 | 31 | 16% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 14% | 31 |
| throxbot.ThroxBot 0.1 | 12 | 6% | 12 |
| joe.ADinosaur 1.0 | 10 | 5% | 10 |
| cs.Grudge 1.0 | 9 | 5% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 7 | 4% | 7 |
| caimano.Furia_Ceca 0.22 | 5 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F28

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 79.6 | 45 / 210 | 2.83 | 15.9% | 24618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 15.8% | 84 |
| d414.nano.Quantum 1.0.0 | 1.7 | 15.9% | 45 |
| uji.Antique 1.0 | 3.0 | 12.5% | 43 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.8% | 15 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 4 |
| ahr.ice.Ice 1.0.2 | 6.0 | 8.8% | 10 |
| amk.ChumbaWumba 0.3 | 7.2 | 7.9% | 3 |
| matt.advanced.Katana 1.0 | 7.8 | 6.9% | 6 |
| stelo.Lifestealer 1.0 | 9.2 | 5.7% | 0 |
| stelo.PianistNano 1.2 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 82.9 | 8 / 35 | 4244 |
| 2 | 2 | 63.9 | 78.7 | 7 / 35 | 4216 |
| 3 | 2 | 63.2 | 80.0 | 6 / 35 | 3687 |
| 4 | 1 | 64.4 | 78.1 | 9 / 35 | 4385 |
| 5 | 1 | 63.9 | 78.4 | 9 / 35 | 4249 |
| 6 | 2 | 63.4 | 79.7 | 6 / 35 | 3837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 54 | 7% |
| uji.Antique 1.0 | 35 | 43% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| qohnil.blot.BlotBot 3.61 | 9 | 44% |
| ahr.ice.Ice 1.0.2 | 8 | 50% |
| amk.ChumbaWumba 0.3 | 8 | 88% |
| matt.advanced.Katana 1.0 | 4 | 50% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 71 | 43% | 65 |
| uji.Antique 1.0 | 35 | 21% | 46 |
| pfvicm.Sobieski 7.2.3b | 22 | 13% | 33 |
| ahr.ice.Ice 1.0.2 | 11 | 7% | 19 |
| qohnil.blot.BlotBot 3.61 | 10 | 6% | 20 |
| amk.ChumbaWumba 0.3 | 8 | 5% | 10 |
| matt.advanced.Katana 1.0 | 6 | 4% | 9 |
| stelo.Lifestealer 1.0 | 3 | 2% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |

## Melee bench: F29

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 66.5 | 19 / 210 | 4.02 | 13.6% | 23077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.7 | 15.7% | 65 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.6% | 74 |
| d414.nano.Quantum 1.0.0 | 2.8 | 13.6% | 19 |
| myl.micro.Troodon 1.10 | 3.5 | 13.0% | 18 |
| jok.PheonixM 0.1.2 | 5.0 | 10.5% | 10 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.3% | 1 |
| DBall.Anarchy 0.1 | 6.5 | 8.5% | 18 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.8% | 4 |
| jangs.ns51 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 69.8 | 3 / 35 | 3710 |
| 2 | 2 | 62.2 | 71.7 | 4 / 35 | 4074 |
| 3 | 3 | 59.8 | 65.4 | 1 / 35 | 3800 |
| 4 | 3 | 58.7 | 61.3 | 2 / 35 | 3982 |
| 5 | 4 | 59.7 | 63.8 | 3 / 35 | 3922 |
| 6 | 3 | 60.9 | 66.7 | 6 / 35 | 3589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 28 | 43% |
| zyx.mega.YersiniaPestis 3.1 | 22 | 5% |
| myl.micro.Troodon 1.10 | 9 | 22% |
| jok.PheonixM 0.1.2 | 6 | 50% |
| DBall.Anarchy 0.1 | 4 | 0% |
| ap.Frederick 1.1 | 1 | 0% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 193 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 56 | 29% | 59 |
| deewiant.Anomaly 0.2 | 55 | 28% | 66 |
| myl.micro.Troodon 1.10 | 33 | 17% | 34 |
| jok.PheonixM 0.1.2 | 22 | 11% | 23 |
| DBall.Anarchy 0.1 | 10 | 5% | 11 |
| jangs.ns51 1.0 | 6 | 3% | 6 |
| ph.melee.ArcherME 0.3 | 5 | 3% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 2% | 4 |
| ap.Frederick 1.1 | 2 | 1% | 0 |

## Melee bench: F30

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.8 | 59.1 | 9 / 210 | 4.68 | 11.4% | 18856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.7 | 14.9% | 68 |
| oog.melee.Capulet 1.2 | 2.2 | 13.8% | 37 |
| darkcanuck.B26354 1.06 | 2.7 | 14.0% | 55 |
| stelo.PastFuture 2.3.2 | 3.5 | 13.0% | 29 |
| d414.nano.Quantum 1.0.0 | 5.0 | 11.4% | 9 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.8% | 7 |
| ntc.Opposite 1.5 | 7.2 | 8.0% | 0 |
| tripphippy.Alice 1.1 | 7.8 | 7.0% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 8.7 | 6.5% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.1 | 57.5 | 0 / 35 | 2942 |
| 2 | 5 | 58.4 | 64.4 | 4 / 35 | 3336 |
| 3 | 5 | 57.2 | 64.4 | 1 / 35 | 3163 |
| 4 | 5 | 54.8 | 55.2 | 2 / 35 | 2870 |
| 5 | 5 | 56.1 | 55.9 | 2 / 35 | 3467 |
| 6 | 5 | 54.1 | 57.1 | 0 / 35 | 3078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 16 | 0% |
| stelo.PastFuture 2.3.2 | 10 | 20% |
| darkcanuck.B26354 1.06 | 8 | 25% |
| oog.melee.Capulet 1.2 | 8 | 50% |
| intruder.PrairieWolf 2.61 | 1 | 0% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 201 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 50 | 25% | 50 |
| stelo.PastFuture 2.3.2 | 44 | 22% | 46 |
| catcat20.Matcha 0.006 | 38 | 19% | 40 |
| oog.melee.Capulet 1.2 | 31 | 15% | 34 |
| ntc.Opposite 1.5 | 17 | 8% | 18 |
| intruder.PrairieWolf 2.61 | 10 | 5% | 10 |
| tripphippy.Alice 1.1 | 5 | 2% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 2% | 5 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 63.1 | 20 / 210 | 4.32 | 12.3% | 19569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 112 |
| gh.mini.Griezel 0.2 | 2.3 | 13.6% | 44 |
| d414.nano.Quantum 1.0.0 | 3.3 | 12.3% | 20 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 11.8% | 13 |
| gh.nano.Grofvuil 0.2 | 5.3 | 9.8% | 9 |
| hadur117.nano.Sanaro 0.1 | 5.5 | 9.6% | 9 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.4% | 4 |
| fm.mammillarias 1.3 | 8.0 | 6.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.6% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 62.2 | 3 / 35 | 3264 |
| 2 | 3 | 57.0 | 61.6 | 4 / 35 | 3280 |
| 3 | 4 | 56.5 | 61.0 | 1 / 35 | 3121 |
| 4 | 2 | 63.0 | 74.3 | 8 / 35 | 4032 |
| 5 | 4 | 56.8 | 59.4 | 4 / 35 | 3116 |
| 6 | 4 | 55.3 | 60.3 | 0 / 35 | 2756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 28 | 7% |
| gh.mini.Griezel 0.2 | 14 | 43% |
| hadur117.nano.Sanaro 0.1 | 5 | 80% |
| spinnercat.micro.Tyger 0.1 | 4 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |

Hadur died in 193 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 60 | 31% | 61 |
| gh.mini.Griezel 0.2 | 48 | 25% | 51 |
| spinnercat.micro.Tyger 0.1 | 27 | 14% | 29 |
| hadur117.nano.Sanaro 0.1 | 21 | 11% | 24 |
| gh.nano.Grofvuil 0.2 | 13 | 7% | 16 |
| timmit.nano.TimDog 0.33 | 11 | 6% | 14 |
| fm.mammillarias 1.3 | 9 | 5% | 11 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 77.4 | 42 / 210 | 3.03 | 15.1% | 23689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.4% | 83 |
| d414.nano.Quantum 1.0.0 | 1.7 | 15.1% | 42 |
| apc.botM 3.0 | 3.2 | 12.9% | 36 |
| lxx.ConceptA 0.8 | 4.3 | 11.0% | 7 |
| vjik.UnViolation 1.1 | 4.7 | 10.7% | 23 |
| panzer.Panzer 0.2 | 6.5 | 8.2% | 0 |
| bayen.UbaMicro 1.4 | 6.8 | 8.0% | 2 |
| yk.JahMicro 1.0 | 8.0 | 7.1% | 12 |
| conscience.Electron 1.3g | 9.0 | 6.3% | 2 |
| donjezza.Jezza 1.0 | 9.5 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 76.5 | 4 / 35 | 3931 |
| 2 | 2 | 61.1 | 74.0 | 4 / 35 | 3850 |
| 3 | 2 | 61.1 | 74.6 | 7 / 35 | 3817 |
| 4 | 1 | 64.3 | 82.2 | 8 / 35 | 4098 |
| 5 | 2 | 62.5 | 74.0 | 10 / 35 | 4063 |
| 6 | 1 | 64.2 | 83.2 | 9 / 35 | 3930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 57 | 23% |
| apc.botM 3.0 | 21 | 29% |
| lxx.ConceptA 0.8 | 11 | 91% |
| vjik.UnViolation 1.1 | 10 | 40% |
| yk.JahMicro 1.0 | 9 | 44% |
| bayen.UbaMicro 1.4 | 3 | 67% |
| donjezza.Jezza 1.0 | 2 | 50% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 66 | 39% | 80 |
| apc.botM 3.0 | 29 | 17% | 34 |
| lxx.ConceptA 0.8 | 29 | 17% | 33 |
| vjik.UnViolation 1.1 | 16 | 9% | 24 |
| bayen.UbaMicro 1.4 | 10 | 6% | 13 |
| panzer.Panzer 0.2 | 7 | 4% | 9 |
| yk.JahMicro 1.0 | 7 | 4% | 7 |
| conscience.Electron 1.3g | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 2 | 1% | 5 |

## Melee bench: F33

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 71.1 | 24 / 210 | 3.60 | 14.4% | 24288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.1% | 92 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.4% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.0% | 24 |
| labg.Cataclysm 2.05 | 4.7 | 11.2% | 32 |
| gre.svman4.Leonidas 1.3.2 | 5.0 | 10.9% | 24 |
| baal.nano.N 1.42 | 6.2 | 9.4% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 8.4% | 13 |
| zyx.micro.Ant 1.1 | 8.5 | 5.5% | 0 |
| sanja.First 0.1 | 9.0 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 75.6 | 3 / 35 | 4192 |
| 2 | 2 | 61.4 | 70.8 | 1 / 35 | 3935 |
| 3 | 2 | 62.8 | 71.4 | 5 / 35 | 4342 |
| 4 | 2 | 60.4 | 67.6 | 4 / 35 | 3924 |
| 5 | 2 | 62.7 | 71.1 | 7 / 35 | 3934 |
| 6 | 3 | 61.8 | 70.2 | 4 / 35 | 3961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 34 | 9% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 86% |
| labg.Cataclysm 2.05 | 12 | 42% |
| gre.svman4.Leonidas 1.3.2 | 7 | 29% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 0% |
| baal.nano.N 1.42 | 3 | 67% |

Hadur died in 186 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 82 | 44% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 14% | 39 |
| labg.Cataclysm 2.05 | 23 | 12% | 25 |
| gre.svman4.Leonidas 1.3.2 | 22 | 12% | 24 |
| kinsen.melee.Angsaichmophobia 1.8c | 16 | 9% | 17 |
| baal.nano.N 1.42 | 10 | 5% | 13 |
| zyx.micro.Ant 1.1 | 5 | 3% | 5 |
| sanja.First 0.1 | 2 | 1% | 2 |

## Melee bench: F34

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 73.4 | 11 / 210 | 3.39 | 14.9% | 28603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.2 | 17.8% | 81 |
| stelo.Spread 0.9 | 1.8 | 17.2% | 91 |
| d414.nano.Quantum 1.0.0 | 3.0 | 14.9% | 11 |
| jcs.Seth 1.8 | 4.2 | 11.4% | 17 |
| tcf.Reach 3 | 4.8 | 11.0% | 7 |
| cli.Dancer 1.1 | 6.0 | 9.1% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 7.0% | 3 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 70.8 | 2 / 35 | 4777 |
| 2 | 3 | 63.7 | 73.0 | 4 / 35 | 4718 |
| 3 | 3 | 64.9 | 76.2 | 0 / 35 | 5111 |
| 4 | 3 | 66.2 | 81.3 | 5 / 35 | 5005 |
| 5 | 3 | 63.0 | 72.1 | 0 / 35 | 4688 |
| 6 | 3 | 61.5 | 67.3 | 0 / 35 | 4304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 44 | 2% |
| stelo.Spread 0.9 | 30 | 10% |
| jcs.Seth 1.8 | 11 | 36% |
| tcf.Reach 3 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 90 | 45% | 89 |
| stelo.Spread 0.9 | 67 | 34% | 72 |
| jcs.Seth 1.8 | 14 | 7% | 19 |
| tcf.Reach 3 | 10 | 5% | 12 |
| ratosh.Wesco 1.4 | 9 | 5% | 9 |
| cli.Dancer 1.1 | 5 | 3% | 5 |
| amk.Punbot.Punbot 0.01 | 3 | 2% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F35

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 66.3 | 2 / 210 | 4.03 | 12.4% | 18696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.7% | 173 |
| gh.mini.Gruwel 0.9 | 2.2 | 13.6% | 20 |
| d414.nano.Quantum 1.0.0 | 3.3 | 12.4% | 2 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.8% | 11 |
| rz.HawkOnFire 0.1 | 4.3 | 11.8% | 3 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.0% | 0 |
| wit.Chuliath 1.0 | 6.8 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.7% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.1% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.9 | 67.9 | 0 / 35 | 3005 |
| 2 | 3 | 58.7 | 65.4 | 0 / 35 | 3330 |
| 3 | 3 | 57.9 | 65.1 | 0 / 35 | 3118 |
| 4 | 2 | 60.3 | 73.0 | 1 / 35 | 3106 |
| 5 | 4 | 58.4 | 63.8 | 1 / 35 | 3301 |
| 6 | 4 | 56.6 | 62.5 | 0 / 35 | 2836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 46 | 0% |
| gh.mini.Gruwel 0.9 | 6 | 17% |
| dmh.robocode.robot.BlackDeath 9.2 | 1 | 0% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 208 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 89 | 43% | 86 |
| gh.mini.Gruwel 0.9 | 43 | 21% | 45 |
| dmh.robocode.robot.BlackDeath 9.2 | 31 | 15% | 34 |
| rz.HawkOnFire 0.1 | 25 | 12% | 25 |
| wit.Chuliath 1.0 | 6 | 3% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 1 | 0% | 1 |

## Melee bench: F36

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 72.2 | 61 / 210 | 3.50 | 15.2% | 25525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.2% | 61 |
| alpha.RainingFire 1.0 | 3.0 | 12.4% | 35 |
| bvh.micro.Freya 0.3 | 3.8 | 11.2% | 20 |
| bzdp.Pansy 2.1 | 4.2 | 11.3% | 19 |
| mz.Cork 0.1 | 4.3 | 11.1% | 23 |
| m3thos.Eva02 0.7.1 | 5.3 | 10.4% | 20 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.7% | 7 |
| dl.BetterWalls 1.0 | 8.3 | 7.0% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.7% | 6 |
| sample.MyFirstRobot 1.0 | 10.0 | 5.0% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 73.3 | 11 / 35 | 4413 |
| 2 | 1 | 64.4 | 76.2 | 13 / 35 | 4472 |
| 3 | 1 | 61.7 | 69.5 | 10 / 35 | 4234 |
| 4 | 1 | 62.1 | 70.8 | 9 / 35 | 4209 |
| 5 | 1 | 62.4 | 72.7 | 9 / 35 | 4190 |
| 6 | 1 | 61.4 | 70.5 | 9 / 35 | 4007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 18 | 61% |
| alpha.RainingFire 1.0 | 18 | 61% |
| mz.Cork 0.1 | 13 | 69% |
| bvh.micro.Freya 0.3 | 13 | 69% |
| m3thos.Eva02 0.7.1 | 11 | 55% |
| bvh.mini.Fenrir 0.39 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 60% |
| squidM.TentalceMeleeNano 1.1 | 4 | 50% |
| dl.BetterWalls 1.0 | 4 | 50% |

Hadur died in 150 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 29 | 19% | 35 |
| bzdp.Pansy 2.1 | 26 | 17% | 43 |
| bvh.micro.Freya 0.3 | 19 | 13% | 25 |
| m3thos.Eva02 0.7.1 | 19 | 13% | 25 |
| bvh.mini.Fenrir 0.39 | 18 | 12% | 19 |
| mz.Cork 0.1 | 17 | 11% | 28 |
| squidM.TentalceMeleeNano 1.1 | 10 | 7% | 15 |
| dl.BetterWalls 1.0 | 8 | 5% | 15 |
| sample.MyFirstRobot 1.0 | 4 | 3% | 5 |

## Melee bench: F37

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 76.5 | 79 / 210 | 3.12 | 15.7% | 28221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.7% | 79 |
| germ.TheMind .2 | 2.5 | 11.6% | 35 |
| EBBU.Sim2 1.02 | 3.3 | 10.7% | 13 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5.0 | 10.1% | 8 |
| agrach.Dalek 1.0 | 5.3 | 9.6% | 27 |
| stelo.UntouchableNano 1.3 | 6.5 | 9.1% | 12 |
| mb.Beast 0.1 | 7.2 | 8.5% | 18 |
| skm.Ryubot 1.0 | 8.0 | 7.9% | 12 |
| lmk.ACPFinal 0.1 | 8.0 | 8.4% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 8.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.5 | 70.8 | 10 / 35 | 4475 |
| 2 | 1 | 64.6 | 81.9 | 13 / 35 | 4796 |
| 3 | 1 | 60.7 | 71.1 | 11 / 35 | 4506 |
| 4 | 1 | 62.4 | 76.2 | 14 / 35 | 4535 |
| 5 | 1 | 62.9 | 78.7 | 11 / 35 | 4489 |
| 6 | 1 | 65.4 | 80.0 | 20 / 35 | 5420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 26 | 46% |
| EBBU.Sim2 1.02 | 17 | 88% |
| stelo.UntouchableNano 1.3 | 16 | 81% |
| mb.Beast 0.1 | 16 | 50% |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 73% |
| agrach.Dalek 1.0 | 12 | 50% |
| skm.Ryubot 1.0 | 11 | 64% |
| lmk.ACPFinal 0.1 | 8 | 88% |

Hadur died in 134 of 210 rounds, at a mean tick of 495. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 28 | 21% | 42 |
| EBBU.Sim2 1.02 | 18 | 13% | 30 |
| mb.Beast 0.1 | 18 | 13% | 25 |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 13% | 31 |
| agrach.Dalek 1.0 | 17 | 13% | 29 |
| lmk.ACPFinal 0.1 | 13 | 10% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 9% | 13 |
| skm.Ryubot 1.0 | 6 | 4% | 7 |
| stelo.UntouchableNano 1.3 | 5 | 4% | 13 |

## Melee bench: F38

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 66.7 | 28 / 210 | 4.00 | 13.1% | 21351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.4% | 104 |
| bvh.mini.Freya 0.55 | 2.7 | 13.3% | 25 |
| d414.nano.Quantum 1.0.0 | 2.7 | 13.1% | 28 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.3% | 21 |
| cs.Wren 1.0 | 5.3 | 10.7% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 10.0% | 7 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.3% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.6% | 6 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 67.3 | 3 / 35 | 3434 |
| 2 | 3 | 59.2 | 66.3 | 6 / 35 | 3224 |
| 3 | 3 | 61.4 | 69.5 | 5 / 35 | 3952 |
| 4 | 2 | 59.8 | 68.3 | 4 / 35 | 3767 |
| 5 | 2 | 59.2 | 64.8 | 6 / 35 | 3476 |
| 6 | 3 | 58.2 | 64.1 | 4 / 35 | 3498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 34 | 15% |
| bvh.mini.Freya 0.55 | 12 | 58% |
| bts.mega.Gnarly 1.4 | 10 | 50% |
| cs.Wren 1.0 | 6 | 83% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 60% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 75% |
| kdf.KoulDestroyer 1.0 | 1 | 0% |

Hadur died in 183 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 66 | 36% | 73 |
| bts.mega.Gnarly 1.4 | 29 | 16% | 34 |
| bvh.mini.Freya 0.55 | 25 | 14% | 29 |
| cs.Wren 1.0 | 24 | 13% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 10% | 23 |
| kdf.KoulDestroyer 1.0 | 13 | 7% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

## Melee bench: F39

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.0 | 38 / 210 | 4.06 | 13.4% | 23764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.7% | 53 |
| az.Ololobot 0.2.4 | 2.3 | 14.1% | 64 |
| d414.nano.Quantum 1.0.0 | 3.0 | 13.4% | 38 |
| catcat20.Lambda 0.024 | 3.7 | 11.7% | 34 |
| stelo.SoRobotNanoMelee 1.2 | 5.8 | 9.0% | 11 |
| gimp.GimpBot 0.1 | 6.7 | 8.2% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.3% | 3 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 8.3% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.7 | 6.3% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 72.4 | 9 / 35 | 4307 |
| 2 | 2 | 58.3 | 65.7 | 4 / 35 | 3692 |
| 3 | 4 | 57.3 | 60.6 | 6 / 35 | 3810 |
| 4 | 4 | 59.8 | 65.1 | 5 / 35 | 4207 |
| 5 | 3 | 59.0 | 64.4 | 6 / 35 | 3961 |
| 6 | 3 | 59.6 | 67.9 | 8 / 35 | 3787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 26 | 38% |
| bvh.fry.Freya 0.82 | 21 | 62% |
| catcat20.Lambda 0.024 | 17 | 53% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 71% |
| winamp32.micro.MicroMacro 1.0 | 2 | 0% |
| gimp.GimpBot 0.1 | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |

Hadur died in 175 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 63 | 36% | 73 |
| az.Ololobot 0.2.4 | 31 | 18% | 43 |
| catcat20.Lambda 0.024 | 24 | 14% | 30 |
| apollokidd.ApolloKidd 0.9 | 18 | 10% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 9% | 19 |
| winamp32.micro.MicroMacro 1.0 | 11 | 6% | 13 |
| gimp.GimpBot 0.1 | 6 | 3% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 3% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 2 |

## Melee bench: F41

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 67.7 | 13 / 210 | 3.90 | 13.1% | 21053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.6% | 117 |
| lessonz.robocode.Oz 0.5.0 | 2.7 | 13.7% | 31 |
| ary.Swarm 1.1 | 3.0 | 13.5% | 27 |
| d414.nano.Quantum 1.0.0 | 3.3 | 13.1% | 13 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.6% | 16 |
| shrub.Silver v048 | 6.2 | 8.8% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 0 |
| stelo.Mirror 1.1 | 8.2 | 5.9% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 5.7% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.1 | 66.7 | 2 / 35 | 3631 |
| 2 | 3 | 59.0 | 67.3 | 1 / 35 | 3253 |
| 3 | 4 | 60.4 | 67.9 | 5 / 35 | 3414 |
| 4 | 2 | 60.9 | 69.8 | 1 / 35 | 3717 |
| 5 | 4 | 60.2 | 67.9 | 3 / 35 | 3449 |
| 6 | 3 | 59.2 | 66.7 | 1 / 35 | 3589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 37 | 5% |
| lessonz.robocode.Oz 0.5.0 | 17 | 29% |
| ary.Swarm 1.1 | 13 | 8% |
| simonton.nano.MeleeSeed 1.8 | 5 | 80% |
| shrub.Silver v048 | 1 | 0% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 29% | 62 |
| ary.Swarm 1.1 | 50 | 25% | 53 |
| lessonz.robocode.Oz 0.5.0 | 44 | 22% | 47 |
| simonton.nano.MeleeSeed 1.8 | 20 | 10% | 22 |
| shrub.Silver v048 | 9 | 5% | 9 |
| zyx.nano.Ant 1.1 | 6 | 3% | 6 |
| stelo.Mirror 1.1 | 5 | 3% | 6 |
| jsal.Jsalbot 1.0 | 3 | 2% | 3 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 68.6 | 18 / 210 | 3.82 | 13.5% | 23911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 17.3% | 101 |
| maribo.mini.MiniQuester 0.1 | 2.0 | 15.1% | 41 |
| ara.Shera 0.88 | 3.2 | 14.2% | 40 |
| d414.nano.Quantum 1.0.0 | 3.7 | 13.5% | 18 |
| amz.NanoClone 1.41 | 5.2 | 9.2% | 6 |
| maribo.IotaCT 1.1 | 6.2 | 7.7% | 1 |
| dsw.StaticD 1.0 | 7.0 | 6.8% | 3 |
| mme.NikeEnhanced 2.0 | 8.3 | 5.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 62.0 | 72.4 | 5 / 35 | 4002 |
| 2 | 4 | 60.5 | 67.6 | 3 / 35 | 4138 |
| 3 | 4 | 58.3 | 63.2 | 2 / 35 | 3560 |
| 4 | 3 | 61.6 | 72.7 | 3 / 35 | 4073 |
| 5 | 4 | 60.1 | 66.7 | 3 / 35 | 4018 |
| 6 | 3 | 60.6 | 69.2 | 2 / 35 | 4120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 31 | 23% |
| ara.Shera 0.88 | 14 | 36% |
| maribo.mini.MiniQuester 0.1 | 14 | 14% |
| amz.NanoClone 1.41 | 2 | 50% |
| dsw.StaticD 1.0 | 2 | 50% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 59 | 31% | 64 |
| maribo.mini.MiniQuester 0.1 | 55 | 29% | 60 |
| ara.Shera 0.88 | 50 | 26% | 55 |
| amz.NanoClone 1.41 | 9 | 5% | 9 |
| maribo.IotaCT 1.1 | 8 | 4% | 7 |
| dsw.StaticD 1.0 | 5 | 3% | 6 |
| mme.NikeEnhanced 2.0 | 3 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |

## Melee bench: F43

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 64.3 | 7 / 210 | 4.21 | 12.7% | 21874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.1% | 162 |
| brainfade.melee.Dusk 0.44 | 2.5 | 12.8% | 23 |
| d414.nano.Quantum 1.0.0 | 3.0 | 12.7% | 7 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.2% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.5% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.7% | 2 |
| jab.DiamondStealer 5 | 7.2 | 7.8% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.6% | 2 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 63.2 | 1 / 35 | 3606 |
| 2 | 2 | 61.1 | 67.3 | 0 / 35 | 3723 |
| 3 | 3 | 59.5 | 63.2 | 0 / 35 | 3373 |
| 4 | 5 | 59.0 | 58.7 | 2 / 35 | 3806 |
| 5 | 2 | 62.5 | 70.5 | 2 / 35 | 3772 |
| 6 | 3 | 59.9 | 62.9 | 2 / 35 | 3594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 52 | 2% |
| brainfade.melee.Dusk 0.44 | 5 | 80% |
| mz.NanoGod 2.02 | 1 | 0% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| dummy.micro.Sparrow 2.5 | 1 | 0% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |

Hadur died in 203 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 99 | 49% | 100 |
| brainfade.melee.Dusk 0.44 | 32 | 16% | 34 |
| dummy.micro.Sparrow 2.5 | 23 | 11% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 7% | 15 |
| mz.NanoGod 2.02 | 11 | 5% | 12 |
| jab.DiamondStealer 5 | 10 | 5% | 10 |
| Krabb.akim2.Akim2 1.1b | 9 | 4% | 10 |
| cvt.Firsty 1.0 | 5 | 2% | 5 |

## Melee bench: F44

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 71.3 | 22 / 210 | 3.59 | 14.4% | 25342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.0 | 17.4% | 109 |
| tzu.TheArtOfWar 1.2 | 2.3 | 15.3% | 49 |
| d414.nano.Quantum 1.0.0 | 2.7 | 14.4% | 22 |
| jwirde.Gort 2.0 | 4.5 | 10.5% | 18 |
| wompi.Quokka 1.6 | 4.7 | 10.8% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 8.5% | 0 |
| disan.Chair 2.2.0 | 7.3 | 7.3% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.0% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 68.6 | 1 / 35 | 4294 |
| 2 | 2 | 63.2 | 74.3 | 4 / 35 | 4167 |
| 3 | 3 | 61.1 | 67.9 | 2 / 35 | 4170 |
| 4 | 2 | 63.7 | 74.9 | 5 / 35 | 4595 |
| 5 | 3 | 62.8 | 73.0 | 6 / 35 | 4095 |
| 6 | 3 | 61.2 | 68.9 | 4 / 35 | 4021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 6% |
| tzu.TheArtOfWar 1.2 | 26 | 50% |
| jwirde.Gort 2.0 | 9 | 33% |
| wompi.Quokka 1.6 | 4 | 25% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| disan.Chair 2.2.0 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 72 | 38% | 76 |
| tzu.TheArtOfWar 1.2 | 56 | 29% | 63 |
| jwirde.Gort 2.0 | 26 | 14% | 27 |
| wompi.Quokka 1.6 | 19 | 10% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 5% | 10 |
| stf.PanzerGeneral 0.1 | 4 | 2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 3 | 2% | 4 |
| disan.Chair 2.2.0 | 2 | 1% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F45

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 69.9 | 23 / 210 | 3.71 | 14.7% | 26555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.7% | 23 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 13.1% | 119 |
| jje.BagPuss 1.2 | 3.3 | 11.8% | 9 |
| sul.Lunar 1.1 | 3.7 | 11.3% | 19 |
| myl.nano.Graviton 1.10 | 4.7 | 10.9% | 15 |
| hvilela.HVilela 0.9 | 6.0 | 9.7% | 2 |
| fm.claire 1.7 | 7.2 | 8.4% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 8.3 | 7.8% | 6 |
| wit.Deep7 2.0 | 8.5 | 7.3% | 16 |
| abud.ThirdRobo 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 69.5 | 3 / 35 | 4393 |
| 2 | 1 | 62.2 | 70.8 | 7 / 35 | 4376 |
| 3 | 1 | 60.9 | 70.2 | 5 / 35 | 4235 |
| 4 | 1 | 60.0 | 67.6 | 2 / 35 | 4264 |
| 5 | 1 | 63.0 | 74.6 | 1 / 35 | 4750 |
| 6 | 1 | 61.0 | 66.7 | 5 / 35 | 4537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 55 | 0% |
| myl.nano.Graviton 1.10 | 10 | 20% |
| sul.Lunar 1.1 | 10 | 90% |
| jje.BagPuss 1.2 | 7 | 71% |
| wit.Deep7 2.0 | 4 | 25% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 2 | 50% |
| abud.ThirdRobo 1.0 | 1 | 0% |

Hadur died in 188 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 57 | 30% | 0 |
| jje.BagPuss 1.2 | 30 | 16% | 48 |
| sul.Lunar 1.1 | 25 | 13% | 51 |
| myl.nano.Graviton 1.10 | 25 | 13% | 37 |
| hvilela.HVilela 0.9 | 14 | 7% | 19 |
| wit.Deep7 2.0 | 12 | 6% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 11 | 6% | 15 |
| fm.claire 1.7 | 9 | 5% | 16 |
| abud.ThirdRobo 1.0 | 4 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F46

d414.nano.Quantum 1.0.0 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 71.4 | 16 / 210 | 3.58 | 13.3% | 20394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.9% | 84 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.1% | 89 |
| d414.nano.Quantum 1.0.0 | 3.0 | 13.3% | 16 |
| mz.MicroSheep 1.0 | 4.0 | 10.9% | 5 |
| cx.Princess 1.0 | 5.3 | 9.8% | 12 |
| sadoner.killer 0.2 | 6.0 | 9.1% | 3 |
| arthord.NanoSatanMelee Beta | 6.7 | 7.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.0% | 1 |
| kurios.DOSexe .9a | 9.3 | 4.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 72.4 | 0 / 35 | 3617 |
| 2 | 3 | 61.0 | 72.1 | 4 / 35 | 3589 |
| 3 | 3 | 59.9 | 68.9 | 4 / 35 | 3393 |
| 4 | 3 | 61.1 | 73.3 | 3 / 35 | 3395 |
| 5 | 3 | 58.5 | 68.6 | 2 / 35 | 3054 |
| 6 | 3 | 61.0 | 73.0 | 3 / 35 | 3346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 31 | 16% |
| rsalesc.melee.Medina 0.4.5 | 15 | 33% |
| cx.Princess 1.0 | 5 | 60% |
| mz.MicroSheep 1.0 | 3 | 67% |
| sadoner.killer 0.2 | 2 | 0% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 89 | 46% | 96 |
| rsalesc.melee.Medina 0.4.5 | 54 | 28% | 58 |
| mz.MicroSheep 1.0 | 15 | 8% | 16 |
| sadoner.killer 0.2 | 14 | 7% | 14 |
| cx.Princess 1.0 | 13 | 7% | 15 |
| arthord.NanoSatanMelee Beta | 6 | 3% | 7 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

