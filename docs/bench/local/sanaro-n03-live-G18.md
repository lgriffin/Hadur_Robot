# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 74.8 | 36 / 350 | 3.27 | 14.0% | 38477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.9% | 252 |
| hadur117.nano.SanaroG18 0.1 | 2.0 | 14.0% | 36 |
| sgp.JollyNinja 3.53 | 3.7 | 11.9% | 35 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.2% | 7 |
| mz.MicroGodMelee 1 | 4.5 | 11.0% | 12 |
| lorneswork.Predator 1.0 | 5.5 | 9.8% | 5 |
| adt.Ar2 1.0 | 7.2 | 7.1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 7.9 | 6.0% | 1 |
| skm.butterfly 1.0 | 8.9 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 66.3 | 1 / 35 | 4077 |
| 2 | 2 | 62.4 | 77.5 | 3 / 35 | 3599 |
| 3 | 2 | 62.4 | 76.5 | 3 / 35 | 3908 |
| 4 | 2 | 60.9 | 70.2 | 2 / 35 | 4155 |
| 5 | 2 | 62.5 | 75.2 | 2 / 35 | 4108 |
| 6 | 2 | 62.5 | 76.2 | 8 / 35 | 3643 |
| 7 | 2 | 61.1 | 75.2 | 3 / 35 | 3695 |
| 8 | 2 | 62.2 | 77.1 | 5 / 35 | 3716 |
| 9 | 2 | 61.0 | 74.0 | 3 / 35 | 3674 |
| 10 | 2 | 63.3 | 79.4 | 6 / 35 | 3902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 140 | 4% |
| mz.MicroGodMelee 1 | 18 | 83% |
| sgp.JollyNinja 3.53 | 15 | 33% |
| lorneswork.Predator 1.0 | 8 | 63% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 67% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 314 of 350 rounds, at a mean tick of 1117. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 168 | 54% | 175 |
| sgp.JollyNinja 3.53 | 44 | 14% | 50 |
| lorneswork.Predator 1.0 | 35 | 11% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 31 | 10% | 36 |
| mz.MicroGodMelee 1 | 21 | 7% | 35 |
| adt.Ar2 1.0 | 9 | 3% | 10 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 3 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 70.4 | 75 / 350 | 3.67 | 14.7% | 43744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.8 | 14.8% | 109 |
| hadur117.nano.SanaroG18 0.1 | 1.9 | 14.7% | 75 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 13.9% | 62 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 11.0% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.5% | 29 |
| fnc.bandit.Bandit 5.2.0 | 6.9 | 8.3% | 4 |
| sch.Simone 0.3d | 7.1 | 8.0% | 21 |
| Noran.BitchingElk 0.054 | 7.5 | 7.8% | 31 |
| stelo.PatternRobot 1.0 | 8.2 | 6.8% | 13 |
| fullsail.SweetTea 1.1 | 10.0 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 75.6 | 6 / 35 | 4871 |
| 2 | 1 | 60.2 | 66.3 | 6 / 35 | 4262 |
| 3 | 1 | 61.5 | 70.8 | 8 / 35 | 4469 |
| 4 | 2 | 62.6 | 71.7 | 8 / 35 | 4381 |
| 5 | 3 | 59.1 | 63.8 | 5 / 35 | 3994 |
| 6 | 1 | 62.8 | 72.7 | 10 / 35 | 4443 |
| 7 | 2 | 63.4 | 75.2 | 6 / 35 | 4559 |
| 8 | 3 | 61.1 | 66.7 | 8 / 35 | 4186 |
| 9 | 2 | 63.2 | 72.4 | 9 / 35 | 4268 |
| 10 | 2 | 61.6 | 68.6 | 9 / 35 | 4311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 68 | 47% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 39 | 26% |
| sch.Simone 0.3d | 14 | 71% |
| Noran.BitchingElk 0.054 | 13 | 23% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 54% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| stelo.PatternRobot 1.0 | 9 | 22% |
| fullsail.SweetTea 1.1 | 2 | 0% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 75 | 27% | 89 |
| pulsar.PulsarMax 0.8.9 | 74 | 27% | 100 |
| lrem.micro.SpikeSoldier 0.4 | 30 | 11% | 36 |
| stelo.PatternRobot 1.0 | 27 | 10% | 30 |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 8% | 31 |
| sch.Simone 0.3d | 14 | 5% | 26 |
| Noran.BitchingElk 0.054 | 14 | 5% | 15 |
| fnc.bandit.Bandit 5.2.0 | 13 | 5% | 16 |
| fullsail.SweetTea 1.1 | 6 | 2% | 6 |

## Melee bench: F03

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 77.6 | 68 / 350 | 3.02 | 15.0% | 43114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG18 0.1 | 1.4 | 15.0% | 68 |
| radnor.DoctorBob 1.42 | 2.3 | 14.8% | 91 |
| kawigi.nano.Lib 1.0 | 2.7 | 14.2% | 85 |
| vuen.Cake 2.51 | 3.6 | 13.2% | 83 |
| urdos.URDOS 1.3 | 5.0 | 10.8% | 14 |
| adt.Ar1 2.1 | 6.4 | 7.7% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 7.0% | 3 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.8% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.9% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 79.7 | 11 / 35 | 4753 |
| 2 | 1 | 63.2 | 78.1 | 9 / 35 | 4351 |
| 3 | 1 | 62.7 | 81.6 | 6 / 35 | 3713 |
| 4 | 1 | 65.1 | 83.2 | 11 / 35 | 4471 |
| 5 | 1 | 64.5 | 82.5 | 10 / 35 | 4588 |
| 6 | 3 | 61.2 | 74.0 | 3 / 35 | 4130 |
| 7 | 1 | 61.3 | 74.6 | 8 / 35 | 4126 |
| 8 | 2 | 59.6 | 70.5 | 2 / 35 | 4051 |
| 9 | 1 | 62.9 | 77.5 | 6 / 35 | 4505 |
| 10 | 2 | 61.7 | 74.3 | 2 / 35 | 4426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 71 | 35% |
| radnor.DoctorBob 1.42 | 56 | 50% |
| kawigi.nano.Lib 1.0 | 39 | 10% |
| urdos.URDOS 1.3 | 13 | 54% |
| adt.Ar1 2.1 | 3 | 33% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 0% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% |

Hadur died in 283 of 350 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 78 | 28% | 84 |
| radnor.DoctorBob 1.42 | 75 | 27% | 96 |
| vuen.Cake 2.51 | 59 | 21% | 85 |
| urdos.URDOS 1.3 | 43 | 15% | 47 |
| ghent.ArthurPanzergon 1.0.0 | 8 | 3% | 12 |
| adt.Ar1 2.1 | 7 | 2% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 2% | 9 |
| oa.weak.FlyMk1 0.1 | 6 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% | 1 |

## Melee bench: F04

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 73.6 | 5 / 350 | 3.38 | 14.3% | 45004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 324 |
| hadur117.nano.SanaroG18 0.1 | 2.2 | 14.3% | 5 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.4% | 14 |
| TNT.TNT 0.99.1 | 4.1 | 10.6% | 2 |
| josago.Jorgito 0.16 | 5.1 | 8.9% | 1 |
| css.Delitioner 0.11 | 5.9 | 7.9% | 2 |
| tj.zombie1n 1.0.1 | 7.0 | 6.7% | 1 |
| rampancy.Durandal 2.1d | 8.1 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 77.5 | 0 / 35 | 5128 |
| 2 | 2 | 63.6 | 75.2 | 1 / 35 | 4321 |
| 3 | 2 | 62.5 | 73.0 | 0 / 35 | 4368 |
| 4 | 2 | 63.9 | 76.5 | 1 / 35 | 4519 |
| 5 | 2 | 63.6 | 75.6 | 1 / 35 | 4572 |
| 6 | 3 | 60.3 | 66.3 | 0 / 35 | 4324 |
| 7 | 2 | 63.6 | 74.6 | 0 / 35 | 4599 |
| 8 | 2 | 63.6 | 74.9 | 1 / 35 | 4534 |
| 9 | 2 | 63.3 | 74.9 | 0 / 35 | 4622 |
| 10 | 3 | 60.6 | 67.0 | 1 / 35 | 4017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 165 | 2% |
| apc.LeeroyJenkins2 1.0 | 6 | 0% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 345 of 350 rounds, at a mean tick of 1273. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 246 | 71% | 249 |
| apc.LeeroyJenkins2 1.0 | 36 | 10% | 36 |
| josago.Jorgito 0.16 | 25 | 7% | 25 |
| css.Delitioner 0.11 | 15 | 4% | 17 |
| TNT.TNT 0.99.1 | 13 | 4% | 13 |
| tj.zombie1n 1.0.1 | 5 | 1% | 5 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 70.4 | 63 / 350 | 3.66 | 13.5% | 32908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 15.5% | 88 |
| origin.SleepSiphon 1.7b | 2.3 | 14.4% | 94 |
| hadur117.nano.SanaroG18 0.1 | 2.8 | 13.5% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.6% | 53 |
| mld.Wisdom 1.0 | 5.1 | 10.4% | 19 |
| gg.Wolverine 2.0 | 6.0 | 9.0% | 11 |
| spinnercat.Omen 1.0 | 7.5 | 7.4% | 3 |
| DBall.NUKE 0.1 | 7.7 | 7.4% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.6% | 13 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 67.0 | 7 / 35 | 2963 |
| 2 | 3 | 58.4 | 66.7 | 7 / 35 | 3057 |
| 3 | 4 | 60.3 | 69.2 | 7 / 35 | 3454 |
| 4 | 1 | 63.3 | 80.3 | 9 / 35 | 3310 |
| 5 | 3 | 61.7 | 72.7 | 7 / 35 | 3582 |
| 6 | 2 | 61.9 | 74.0 | 8 / 35 | 3615 |
| 7 | 3 | 58.9 | 66.0 | 6 / 35 | 3112 |
| 8 | 4 | 56.2 | 61.9 | 1 / 35 | 2969 |
| 9 | 3 | 59.1 | 67.9 | 4 / 35 | 3332 |
| 10 | 1 | 62.4 | 78.4 | 7 / 35 | 3514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 42 | 40% |
| jekl.StoneGhost 0.7 | 41 | 59% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 39% |
| mld.Wisdom 1.0 | 8 | 25% |
| gg.Wolverine 2.0 | 5 | 60% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| DBall.NUKE 0.1 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 0% |

Hadur died in 287 of 350 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 77 | 27% | 93 |
| origin.SleepSiphon 1.7b | 69 | 24% | 90 |
| pe.minimelee.SandboxMiniMelee 1.1 | 56 | 20% | 69 |
| mld.Wisdom 1.0 | 43 | 15% | 51 |
| gg.Wolverine 2.0 | 15 | 5% | 18 |
| spinnercat.Omen 1.0 | 12 | 4% | 12 |
| DBall.NUKE 0.1 | 9 | 3% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 2% | 6 |

## Melee bench: F07

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.7 | 112 / 350 | 2.47 | 17.2% | 51903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.7 | 17.3% | 80 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.3% | 97 |
| hadur117.nano.SanaroG18 0.1 | 2.3 | 17.2% | 112 |
| oog.melee.CapuletDroid 1.1 | 4.1 | 11.8% | 22 |
| franzor.Lizt 1.3.1 | 4.9 | 11.0% | 38 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 2 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 83.5 | 15 / 35 | 5055 |
| 2 | 3 | 67.9 | 83.2 | 11 / 35 | 5043 |
| 3 | 2 | 68.3 | 86.0 | 10 / 35 | 5286 |
| 4 | 3 | 67.2 | 81.6 | 8 / 35 | 4997 |
| 5 | 3 | 67.2 | 82.9 | 9 / 35 | 5078 |
| 6 | 2 | 68.6 | 87.6 | 12 / 35 | 5348 |
| 7 | 2 | 68.3 | 83.8 | 13 / 35 | 5203 |
| 8 | 2 | 69.0 | 83.2 | 13 / 35 | 5753 |
| 9 | 2 | 67.9 | 82.5 | 11 / 35 | 5077 |
| 10 | 2 | 67.6 | 82.2 | 10 / 35 | 5063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 114 | 62% |
| rsalesc.melee.Monk 0.3.6c | 47 | 11% |
| oog.melee.CapuletDroid 1.1 | 37 | 76% |
| franzor.Lizt 1.3.1 | 16 | 50% |
| skm.PateranBotlock2 1.0 | 2 | 0% |

Hadur died in 238 of 350 rounds, at a mean tick of 1270. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 102 | 43% | 181 |
| rsalesc.melee.Monk 0.3.6c | 99 | 42% | 113 |
| oog.melee.CapuletDroid 1.1 | 17 | 7% | 40 |
| franzor.Lizt 1.3.1 | 11 | 5% | 2 |
| skm.PateranBotlock2 1.0 | 4 | 2% | 4 |
| exauge.GateKeeper 1.1.121g | 3 | 1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.9 | 101 / 350 | 3.53 | 14.3% | 35791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG18 0.1 | 1.4 | 14.3% | 101 |
| tm.Yuugao 1.0 | 2.2 | 13.6% | 77 |
| shrub.Vapour v159 | 2.6 | 13.9% | 79 |
| Krabb.sliNk.Garm 0.9u | 4.7 | 10.9% | 32 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.7% | 31 |
| m3thos.Eva00 1.1 | 5.6 | 9.5% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.3% | 14 |
| qualidafial.MajorDick 1.0.1 | 8.1 | 7.1% | 4 |
| SHAM.WOW 1.4 | 8.8 | 6.5% | 3 |
| zyx.nano.BacillusComma 1.0 | 9.6 | 6.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 74.0 | 12 / 35 | 3582 |
| 2 | 1 | 60.9 | 71.4 | 11 / 35 | 3571 |
| 3 | 1 | 62.7 | 77.5 | 14 / 35 | 3534 |
| 4 | 2 | 59.1 | 69.2 | 7 / 35 | 3394 |
| 5 | 1 | 63.3 | 77.1 | 14 / 35 | 3846 |
| 6 | 1 | 63.0 | 78.1 | 9 / 35 | 3675 |
| 7 | 2 | 56.9 | 62.5 | 8 / 35 | 3118 |
| 8 | 1 | 63.2 | 74.9 | 11 / 35 | 4212 |
| 9 | 2 | 57.0 | 61.3 | 7 / 35 | 3346 |
| 10 | 2 | 60.6 | 73.0 | 8 / 35 | 3513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 55% |
| shrub.Vapour v159 | 46 | 46% |
| Krabb.sliNk.Garm 0.9u | 24 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 12 | 58% |
| m3thos.Eva00 1.1 | 11 | 91% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| SHAM.WOW 1.4 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 250 of 350 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 66 | 26% | 102 |
| shrub.Vapour v159 | 62 | 25% | 85 |
| Krabb.sliNk.Garm 0.9u | 32 | 13% | 41 |
| com.spp.robocode.MostlyHarmless 010 | 24 | 10% | 31 |
| zyx.nano.BacillusComma 1.0 | 19 | 8% | 21 |
| m3thos.Eva00 1.1 | 15 | 6% | 23 |
| qualidafial.MajorDick 1.0.1 | 13 | 5% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 4% | 23 |
| SHAM.WOW 1.4 | 8 | 3% | 10 |

## Melee bench: F09

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 64.6 | 38 / 350 | 4.19 | 12.5% | 30901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 186 |
| kc.micro.Figment 1.0 | 2.0 | 15.2% | 76 |
| hadur117.nano.SanaroG18 0.1 | 3.2 | 12.5% | 38 |
| yagami.Tidus 0.11 | 4.6 | 10.9% | 0 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.6% | 24 |
| mc2.enemy.Original 0.9 | 5.5 | 9.7% | 21 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 5 |
| step.nanoPri 1.0 | 8.1 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.6 | 61.6 | 3 / 35 | 2895 |
| 2 | 3 | 58.1 | 66.3 | 4 / 35 | 2876 |
| 3 | 3 | 59.9 | 68.3 | 4 / 35 | 3242 |
| 4 | 3 | 57.0 | 62.2 | 3 / 35 | 3147 |
| 5 | 3 | 58.1 | 64.1 | 3 / 35 | 3246 |
| 6 | 3 | 57.3 | 63.2 | 2 / 35 | 3066 |
| 7 | 3 | 58.5 | 65.1 | 6 / 35 | 3120 |
| 8 | 4 | 58.1 | 62.5 | 3 / 35 | 3204 |
| 9 | 3 | 60.7 | 69.8 | 7 / 35 | 3254 |
| 10 | 3 | 57.0 | 62.9 | 3 / 35 | 2851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 57 | 30% |
| kc.micro.Figment 1.0 | 32 | 28% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| pedersen.Grishnakh 1.0 | 4 | 75% |
| yagami.Tidus 0.11 | 4 | 100% |
| dft.Calliope 5.6 | 3 | 33% |

Hadur died in 312 of 350 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 103 | 33% | 122 |
| kc.micro.Figment 1.0 | 76 | 24% | 84 |
| yagami.Tidus 0.11 | 49 | 16% | 54 |
| mc2.enemy.Original 0.9 | 33 | 11% | 37 |
| pedersen.Grishnakh 1.0 | 24 | 8% | 25 |
| dft.Calliope 5.6 | 9 | 3% | 10 |
| robar.nano.Assertive_Melee 0.2 | 8 | 3% | 8 |
| step.nanoPri 1.0 | 7 | 2% | 7 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |

## Melee bench: F10

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.6 | 95 / 350 | 2.93 | 15.4% | 42180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG18 0.1 | 1.5 | 15.4% | 95 |
| DTF.Kludgy 1.2b | 1.6 | 15.6% | 107 |
| ne.Chimera 1.2 | 3.4 | 13.4% | 49 |
| ejb.Polaris 1.0.1 | 3.6 | 12.7% | 35 |
| tvv.micro.Antares 1.1.1 | 5.1 | 11.0% | 38 |
| vStar.RAFzilla 2.15 | 5.8 | 10.5% | 18 |
| sam.Samspin 1.0 | 7.5 | 6.2% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.6% | 1 |
| kurios.DOSexe .9b | 8.5 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 79.0 | 14 / 35 | 4099 |
| 2 | 1 | 66.2 | 85.7 | 17 / 35 | 4165 |
| 3 | 2 | 61.1 | 69.2 | 10 / 35 | 3987 |
| 4 | 1 | 64.5 | 82.2 | 10 / 35 | 4219 |
| 5 | 1 | 63.7 | 79.0 | 8 / 35 | 4264 |
| 6 | 1 | 64.3 | 81.0 | 7 / 35 | 4497 |
| 7 | 2 | 63.9 | 79.0 | 12 / 35 | 4182 |
| 8 | 1 | 64.6 | 80.6 | 9 / 35 | 4470 |
| 9 | 2 | 61.6 | 73.0 | 4 / 35 | 4027 |
| 10 | 2 | 62.6 | 76.8 | 4 / 35 | 4270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 44% |
| ejb.Polaris 1.0.1 | 31 | 84% |
| tvv.micro.Antares 1.1.1 | 29 | 28% |
| vStar.RAFzilla 2.15 | 26 | 77% |
| ne.Chimera 1.2 | 22 | 27% |
| kurios.DOSexe .9b | 5 | 100% |
| donjezza.Muncho 1.0 | 3 | 0% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 0% |

Hadur died in 256 of 350 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 95 | 37% | 121 |
| ne.Chimera 1.2 | 75 | 29% | 85 |
| tvv.micro.Antares 1.1.1 | 28 | 11% | 27 |
| ejb.Polaris 1.0.1 | 26 | 10% | 53 |
| vStar.RAFzilla 2.15 | 13 | 5% | 32 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 2% | 6 |
| sam.Samspin 1.0 | 5 | 2% | 8 |
| donjezza.Muncho 1.0 | 5 | 2% | 6 |
| kurios.DOSexe .9b | 3 | 1% | 12 |

## Melee bench: F11

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 64.6 | 53 / 350 | 4.19 | 12.7% | 33174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 16.9% | 137 |
| cx.mini.Nimrod 0.55 | 2.6 | 12.6% | 44 |
| hadur117.nano.SanaroG18 0.1 | 2.8 | 12.7% | 53 |
| djc.DynaBot 0.1.1 | 3.8 | 11.4% | 40 |
| rdt199.Warlord 0.73 | 5.3 | 9.9% | 25 |
| br2.MobyDickBot 1.6 | 6.0 | 9.5% | 23 |
| uji.YellohFellah 1.0 | 6.7 | 8.8% | 29 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.7% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 62.2 | 5 / 35 | 3361 |
| 2 | 2 | 59.7 | 67.0 | 9 / 35 | 3345 |
| 3 | 2 | 59.1 | 69.8 | 3 / 35 | 3122 |
| 4 | 2 | 59.6 | 69.2 | 6 / 35 | 3501 |
| 5 | 2 | 60.2 | 72.4 | 6 / 35 | 3361 |
| 6 | 4 | 55.6 | 57.8 | 2 / 35 | 3278 |
| 7 | 5 | 52.3 | 51.1 | 1 / 35 | 3160 |
| 8 | 3 | 59.0 | 65.7 | 7 / 35 | 3389 |
| 9 | 3 | 58.8 | 65.1 | 8 / 35 | 3222 |
| 10 | 2 | 58.5 | 65.4 | 6 / 35 | 3435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 44% |
| cx.mini.Nimrod 0.55 | 17 | 41% |
| uji.YellohFellah 1.0 | 13 | 15% |
| djc.DynaBot 0.1.1 | 12 | 58% |
| rdt199.Warlord 0.73 | 11 | 73% |
| br2.MobyDickBot 1.6 | 7 | 57% |
| KiraNL.Chupacabra 0.4 | 2 | 0% |

Hadur died in 297 of 350 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 102 | 34% | 126 |
| cx.mini.Nimrod 0.55 | 55 | 19% | 62 |
| djc.DynaBot 0.1.1 | 32 | 11% | 38 |
| rdt199.Warlord 0.73 | 31 | 10% | 39 |
| KiraNL.Chupacabra 0.4 | 22 | 7% | 24 |
| uji.YellohFellah 1.0 | 22 | 7% | 24 |
| br2.MobyDickBot 1.6 | 17 | 6% | 21 |
| stelo.MirrorNano 1.3 | 10 | 3% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 2% | 6 |

## Melee bench: F12

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 69.2 | 56 / 350 | 3.77 | 13.3% | 31002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.9 | 14.5% | 82 |
| nat.PallasHawk 1.0 | 2.1 | 14.2% | 94 |
| hadur117.nano.SanaroG18 0.1 | 3.0 | 13.3% | 56 |
| darkcanuck.Leon 1.01 | 3.1 | 13.5% | 79 |
| brainfade.melee.Genghis 0.36 | 4.9 | 10.3% | 22 |
| jrm.Test0 1.0 | 6.4 | 8.0% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.6% | 3 |
| jp.Perpy 16.0 | 7.7 | 7.0% | 4 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.9% | 8 |
| stuff.Vlad 0.1 | 9.4 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.6 | 61.0 | 4 / 35 | 2914 |
| 2 | 4 | 55.8 | 61.6 | 5 / 35 | 2703 |
| 3 | 1 | 63.8 | 80.6 | 12 / 35 | 3471 |
| 4 | 5 | 55.3 | 58.4 | 2 / 35 | 3000 |
| 5 | 2 | 60.4 | 75.9 | 4 / 35 | 2814 |
| 6 | 3 | 59.2 | 67.6 | 6 / 35 | 3269 |
| 7 | 3 | 60.4 | 72.4 | 3 / 35 | 3327 |
| 8 | 3 | 60.5 | 74.0 | 6 / 35 | 3053 |
| 9 | 3 | 59.7 | 69.2 | 7 / 35 | 3133 |
| 10 | 2 | 60.5 | 71.4 | 7 / 35 | 3318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 47 | 53% |
| darkcanuck.Leon 1.01 | 43 | 16% |
| nat.PallasHawk 1.0 | 39 | 18% |
| brainfade.melee.Genghis 0.36 | 16 | 69% |
| cs.sheldor.Talon 1.1 | 2 | 50% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |

Hadur died in 295 of 350 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 74 | 25% | 96 |
| nat.PallasHawk 1.0 | 66 | 22% | 74 |
| darkcanuck.Leon 1.01 | 61 | 21% | 72 |
| brainfade.melee.Genghis 0.36 | 30 | 10% | 36 |
| cs.sheldor.Talon 1.1 | 22 | 7% | 24 |
| jrm.Test0 1.0 | 18 | 6% | 19 |
| jp.Perpy 16.0 | 11 | 4% | 12 |
| jaybot.bots.Oddball 4.0 | 11 | 4% | 12 |
| stuff.Vlad 0.1 | 2 | 1% | 5 |

## Melee bench: F13

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 71.7 | 20 / 350 | 3.55 | 13.1% | 33424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.9% | 175 |
| ags.Glacier 0.2.11 | 1.7 | 17.0% | 96 |
| hadur117.nano.SanaroG18 0.1 | 3.3 | 13.1% | 20 |
| shinh.Entangled 0.3 | 3.9 | 12.1% | 39 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.6% | 18 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 1 |
| stelo.Wang 1.0 | 7.1 | 6.8% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 67.0 | 2 / 35 | 3517 |
| 2 | 4 | 58.2 | 67.6 | 1 / 35 | 3035 |
| 3 | 3 | 60.1 | 72.1 | 1 / 35 | 3284 |
| 4 | 3 | 62.2 | 76.8 | 2 / 35 | 3759 |
| 5 | 3 | 59.3 | 69.8 | 2 / 35 | 3239 |
| 6 | 4 | 61.2 | 72.1 | 4 / 35 | 3392 |
| 7 | 3 | 59.8 | 72.4 | 1 / 35 | 3169 |
| 8 | 3 | 61.3 | 75.2 | 2 / 35 | 3365 |
| 9 | 4 | 60.9 | 72.7 | 3 / 35 | 3399 |
| 10 | 3 | 60.0 | 71.4 | 2 / 35 | 3265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 63 | 16% |
| ags.Glacier 0.2.11 | 62 | 10% |
| shinh.Entangled 0.3 | 19 | 16% |
| gh.micro.Gruweltje 0.7 | 6 | 0% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 330 of 350 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 114 | 35% | 119 |
| mn.Combat 3.25.0 | 103 | 31% | 113 |
| shinh.Entangled 0.3 | 48 | 15% | 52 |
| gh.micro.Gruweltje 0.7 | 37 | 11% | 37 |
| stelo.Wang 1.0 | 13 | 4% | 13 |
| apc.Colossus2 0.17 | 8 | 2% | 9 |
| maribo.FollowFire 1 | 3 | 1% | 3 |
| sample.Tracker 1.0 | 3 | 1% | 3 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 75.7 | 85 / 350 | 3.18 | 14.5% | 36030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 18.3% | 165 |
| hadur117.nano.SanaroG18 0.1 | 2.0 | 14.5% | 85 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.2% | 53 |
| co.edu.usb.rc.LidisTron 1.0 | 4.6 | 10.4% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.1% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 9.9% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 6.3 | 9.3% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 8.0% | 14 |
| pa.Improved 1.0 | 9.0 | 5.2% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 72.7 | 8 / 35 | 3745 |
| 2 | 2 | 61.6 | 72.7 | 7 / 35 | 3595 |
| 3 | 2 | 62.3 | 74.6 | 8 / 35 | 3609 |
| 4 | 2 | 62.8 | 75.6 | 10 / 35 | 3759 |
| 5 | 2 | 64.7 | 78.7 | 12 / 35 | 4208 |
| 6 | 2 | 63.3 | 79.4 | 9 / 35 | 3429 |
| 7 | 2 | 61.3 | 74.9 | 8 / 35 | 3300 |
| 8 | 2 | 60.8 | 72.4 | 7 / 35 | 3423 |
| 9 | 2 | 63.8 | 81.0 | 10 / 35 | 3361 |
| 10 | 2 | 62.3 | 75.6 | 6 / 35 | 3601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 36% |
| catcat20.shape.Theta 0.018 | 44 | 50% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 57% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 67% |
| sanyi.mikrobi.Roberto 1.0 | 5 | 40% |
| pa.Improved 1.0 | 3 | 67% |

Hadur died in 265 of 350 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 124 | 47% | 155 |
| catcat20.shape.Theta 0.018 | 53 | 20% | 74 |
| dmh.robocode.robot.RedDwarf 0.4 | 22 | 8% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 19 | 7% | 24 |
| sanyi.mikrobi.Roberto 1.0 | 18 | 7% | 25 |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 5% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 4% | 19 |
| pa.Improved 1.0 | 3 | 1% | 7 |
| sample.TrackFire 1.0 | 2 | 1% | 2 |

## Melee bench: F15

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 66.1 | 52 / 350 | 4.05 | 13.3% | 38598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 15.1% | 85 |
| emp.Yngwie 1.11 | 2.2 | 14.0% | 106 |
| hadur117.nano.SanaroG18 0.1 | 2.9 | 13.3% | 52 |
| mld.DustBunny 3.8 | 3.7 | 12.7% | 37 |
| cb.nano.Insomnia 1.0 | 5.1 | 10.8% | 22 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.4% | 45 |
| lambdaxy.TBot 0.1 | 7.3 | 7.4% | 1 |
| Grystrion.TrackerWO 1.0 | 7.7 | 7.0% | 1 |
| divineomega.TrialBot 0.003 | 9.1 | 5.2% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 63.5 | 3 / 35 | 4087 |
| 2 | 3 | 58.0 | 61.9 | 3 / 35 | 3699 |
| 3 | 4 | 56.9 | 61.3 | 3 / 35 | 3349 |
| 4 | 3 | 59.2 | 63.5 | 4 / 35 | 4119 |
| 5 | 3 | 60.7 | 67.6 | 7 / 35 | 4081 |
| 6 | 2 | 61.3 | 72.4 | 7 / 35 | 3785 |
| 7 | 3 | 59.4 | 67.3 | 6 / 35 | 3501 |
| 8 | 3 | 60.5 | 67.0 | 4 / 35 | 4109 |
| 9 | 3 | 60.0 | 68.6 | 6 / 35 | 3685 |
| 10 | 2 | 61.4 | 68.3 | 9 / 35 | 4183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 34 | 50% |
| kawigi.micro.Shiz 1.1 | 24 | 8% |
| cb.nano.Insomnia 1.0 | 18 | 78% |
| mld.DustBunny 3.8 | 17 | 18% |
| kawigi.robot.Girl 1.2 | 14 | 50% |
| divineomega.TrialBot 0.003 | 6 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 50% |
| lambdaxy.TBot 0.1 | 2 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 68 | 23% | 78 |
| emp.Yngwie 1.11 | 64 | 21% | 83 |
| kawigi.micro.Shiz 1.1 | 63 | 21% | 67 |
| kawigi.robot.Girl 1.2 | 36 | 12% | 42 |
| cb.nano.Insomnia 1.0 | 31 | 10% | 29 |
| lambdaxy.TBot 0.1 | 13 | 4% | 16 |
| divineomega.TrialBot 0.003 | 12 | 4% | 20 |
| Grystrion.TrackerWO 1.0 | 10 | 3% | 13 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 65.9 | 38 / 350 | 4.07 | 13.5% | 41494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.1 | 18.2% | 179 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.5% | 28 |
| hadur117.nano.SanaroG18 0.1 | 2.9 | 13.5% | 38 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.2% | 52 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.3% | 20 |
| bvh.fnr.Fenrir 0.36l | 5.4 | 9.5% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 8.0% | 8 |
| divineomega.DivineBot 1.9.4.5 | 8.4 | 5.9% | 20 |
| repositorio.NanoStep 1.0 | 9.1 | 5.2% | 1 |
| asd.Cthulhu 1.3 | 9.4 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 64.4 | 4 / 35 | 3907 |
| 2 | 3 | 57.9 | 60.6 | 4 / 35 | 3556 |
| 3 | 3 | 61.6 | 69.8 | 6 / 35 | 4149 |
| 4 | 3 | 61.1 | 68.6 | 2 / 35 | 4226 |
| 5 | 3 | 61.5 | 67.6 | 2 / 35 | 4537 |
| 6 | 3 | 60.4 | 66.3 | 4 / 35 | 4171 |
| 7 | 2 | 61.7 | 69.5 | 7 / 35 | 4285 |
| 8 | 3 | 58.4 | 61.0 | 2 / 35 | 4063 |
| 9 | 3 | 61.4 | 68.6 | 1 / 35 | 4247 |
| 10 | 3 | 60.1 | 62.2 | 6 / 35 | 4353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 66 | 6% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 69% |
| tvv.nano.Polaris 1.2 | 12 | 50% |
| divineomega.DivineBot 1.9.4.5 | 6 | 50% |
| stelo.IntrinsicVolatility 1.4 | 6 | 67% |
| techdude.forest.FlamingForest 1.1 | 4 | 0% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 1085. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 142 | 46% | 154 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 73 | 23% | 84 |
| bvh.fnr.Fenrir 0.36l | 34 | 11% | 36 |
| tvv.nano.Polaris 1.2 | 17 | 5% | 21 |
| divineomega.DivineBot 1.9.4.5 | 14 | 4% | 17 |
| stelo.IntrinsicVolatility 1.4 | 14 | 4% | 15 |
| techdude.forest.FlamingForest 1.1 | 14 | 4% | 15 |
| asd.Cthulhu 1.3 | 3 | 1% | 5 |
| repositorio.NanoStep 1.0 | 1 | 0% | 2 |

## Melee bench: F17

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 66.3 | 55 / 350 | 4.03 | 13.3% | 38703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 2.3 | 14.1% | 72 |
| et.Predator 1.8 | 2.4 | 14.0% | 66 |
| hadur117.nano.SanaroG18 0.1 | 2.7 | 13.3% | 55 |
| cx.BlestPain 1.41 | 3.3 | 13.0% | 77 |
| nic.Nicator 2.4 | 4.7 | 11.7% | 43 |
| ahf.NanoAndrew .4 | 5.7 | 11.3% | 33 |
| maribo.melee.BMV 0.1 | 6.9 | 8.7% | 4 |
| tex.Longbot 0.4 | 8.4 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.6 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 69.2 | 6 / 35 | 3705 |
| 2 | 2 | 60.5 | 67.0 | 2 / 35 | 4363 |
| 3 | 4 | 54.0 | 52.4 | 3 / 35 | 3247 |
| 4 | 2 | 62.3 | 74.9 | 8 / 35 | 3694 |
| 5 | 2 | 60.2 | 65.4 | 6 / 35 | 3997 |
| 6 | 3 | 60.3 | 65.4 | 8 / 35 | 3897 |
| 7 | 3 | 60.0 | 66.0 | 3 / 35 | 4127 |
| 8 | 2 | 60.8 | 68.6 | 6 / 35 | 3962 |
| 9 | 2 | 61.9 | 71.1 | 7 / 35 | 3863 |
| 10 | 4 | 59.0 | 62.9 | 6 / 35 | 3848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 32 | 9% |
| oog.melee.Mercutio 1.0 | 31 | 65% |
| cx.BlestPain 1.41 | 27 | 74% |
| nic.Nicator 2.4 | 14 | 29% |
| ahf.NanoAndrew .4 | 13 | 46% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 84 | 28% | 88 |
| ahf.NanoAndrew .4 | 50 | 17% | 57 |
| nic.Nicator 2.4 | 42 | 14% | 45 |
| oog.melee.Mercutio 1.0 | 41 | 14% | 59 |
| cx.BlestPain 1.41 | 38 | 13% | 60 |
| maribo.melee.BMV 0.1 | 30 | 10% | 30 |
| tex.Longbot 0.4 | 6 | 2% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 5 | 2% | 5 |

## Melee bench: F18

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 69.1 | 78 / 350 | 3.78 | 13.9% | 36813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.6 | 14.0% | 83 |
| hadur117.nano.SanaroG18 0.1 | 1.8 | 13.9% | 78 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.7% | 70 |
| uji.DBH 1.1 | 4.3 | 11.1% | 37 |
| ratosh.Nobo 0.21 | 5.3 | 10.6% | 13 |
| spinnercat.Robovirus 2.718 | 5.4 | 10.5% | 23 |
| sigterm.Sigterm 1.0 | 6.9 | 8.9% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 7.0% | 7 |
| stelo.WangRobot 1.0 | 8.9 | 6.3% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 64.4 | 8 / 35 | 3809 |
| 2 | 1 | 59.9 | 68.3 | 9 / 35 | 3548 |
| 3 | 1 | 60.5 | 71.1 | 8 / 35 | 3769 |
| 4 | 3 | 58.1 | 66.0 | 6 / 35 | 3205 |
| 5 | 1 | 60.7 | 68.9 | 12 / 35 | 3780 |
| 6 | 2 | 61.8 | 75.6 | 7 / 35 | 3773 |
| 7 | 1 | 62.8 | 75.6 | 9 / 35 | 4203 |
| 8 | 2 | 59.8 | 70.2 | 8 / 35 | 3243 |
| 9 | 3 | 59.3 | 67.3 | 5 / 35 | 3663 |
| 10 | 2 | 58.6 | 63.5 | 6 / 35 | 3820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 51 | 33% |
| agd.Mooserwirt2 2.7 | 30 | 47% |
| sigterm.Sigterm 1.0 | 22 | 64% |
| spinnercat.Robovirus 2.718 | 22 | 73% |
| uji.DBH 1.1 | 19 | 37% |
| ratosh.Nobo 0.21 | 10 | 60% |
| stelo.WangRobot 1.0 | 8 | 13% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 67% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 85 | 31% | 105 |
| agd.Mooserwirt2 2.7 | 36 | 13% | 53 |
| ratosh.Nobo 0.21 | 36 | 13% | 42 |
| uji.DBH 1.1 | 31 | 11% | 35 |
| spinnercat.Robovirus 2.718 | 23 | 8% | 33 |
| stelo.WangRobot 1.0 | 19 | 7% | 20 |
| sigterm.Sigterm 1.0 | 18 | 7% | 31 |
| kawigi.mini.Fhqwhgads 1.1 | 18 | 7% | 21 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8 | 3% | 10 |

## Melee bench: F19

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.6 | 85 / 350 | 2.75 | 16.0% | 42703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.5 | 16.7% | 125 |
| hadur117.nano.SanaroG18 0.1 | 2.1 | 16.0% | 85 |
| mld.Infinity 2.2 | 2.4 | 15.5% | 96 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.2% | 17 |
| erdnis.Rover 0.3 | 4.9 | 10.4% | 6 |
| patson.PatsonTestBot 1.0 | 5.9 | 8.7% | 6 |
| pac.ABC 2.1 | 7.5 | 7.2% | 12 |
| mbh.Mbh 0.1 | 7.7 | 7.1% | 0 |
| pbg.R2D2 1.0 | 8.8 | 6.2% | 4 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 76.8 | 7 / 35 | 4445 |
| 2 | 2 | 65.6 | 81.0 | 8 / 35 | 4318 |
| 3 | 2 | 63.7 | 78.4 | 7 / 35 | 3897 |
| 4 | 1 | 67.5 | 85.7 | 16 / 35 | 4444 |
| 5 | 2 | 63.8 | 75.9 | 7 / 35 | 4135 |
| 6 | 2 | 66.1 | 84.8 | 7 / 35 | 4184 |
| 7 | 2 | 66.6 | 82.5 | 10 / 35 | 4747 |
| 8 | 2 | 66.2 | 83.2 | 10 / 35 | 4294 |
| 9 | 2 | 65.1 | 81.9 | 8 / 35 | 3944 |
| 10 | 3 | 64.0 | 75.9 | 5 / 35 | 4295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 96 | 7% |
| mld.Infinity 2.2 | 86 | 57% |
| krillr.mini.JointStrike 2.0.0 | 25 | 64% |
| erdnis.Rover 0.3 | 11 | 82% |
| pac.ABC 2.1 | 4 | 50% |
| patson.PatsonTestBot 1.0 | 3 | 33% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 1044. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 125 | 47% | 177 |
| mld.Infinity 2.2 | 55 | 21% | 26 |
| krillr.mini.JointStrike 2.0.0 | 29 | 11% | 48 |
| patson.PatsonTestBot 1.0 | 23 | 9% | 29 |
| erdnis.Rover 0.3 | 18 | 7% | 23 |
| pbg.R2D2 1.0 | 9 | 3% | 15 |
| pac.ABC 2.1 | 4 | 1% | 12 |
| mbh.Mbh 0.1 | 4 | 1% | 12 |

## Melee bench: F20

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 72.7 | 59 / 350 | 3.46 | 14.3% | 37969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.6% | 152 |
| hadur117.nano.SanaroG18 0.1 | 2.0 | 14.3% | 59 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.0% | 27 |
| fwb.Nine 1.0.1 | 4.3 | 10.8% | 38 |
| catcat20.Rabbit 0.001 | 4.7 | 10.5% | 44 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 9.0% | 13 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 8.3% | 9 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.9% | 5 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 73.3 | 7 / 35 | 3638 |
| 2 | 2 | 60.2 | 70.2 | 5 / 35 | 3622 |
| 3 | 2 | 60.6 | 72.1 | 3 / 35 | 3662 |
| 4 | 2 | 59.6 | 68.9 | 4 / 35 | 3473 |
| 5 | 2 | 61.2 | 72.4 | 4 / 35 | 4122 |
| 6 | 2 | 64.4 | 79.7 | 11 / 35 | 4186 |
| 7 | 2 | 61.2 | 72.1 | 5 / 35 | 3860 |
| 8 | 2 | 61.0 | 70.5 | 5 / 35 | 3888 |
| 9 | 2 | 62.5 | 76.5 | 7 / 35 | 3674 |
| 10 | 2 | 61.4 | 71.4 | 8 / 35 | 3844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 84 | 35% |
| fwb.Nine 1.0.1 | 25 | 52% |
| nz.jdc.nano.GridFu 1.0 | 18 | 33% |
| catcat20.Rabbit 0.001 | 14 | 29% |
| djdjdj.NanoSkunk10 1.0 | 6 | 17% |
| m3thos.mini.Eva01 0.5.5 | 4 | 50% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 33% |

Hadur died in 292 of 350 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 128 | 44% | 146 |
| nz.jdc.nano.GridFu 1.0 | 38 | 13% | 48 |
| fwb.Nine 1.0.1 | 37 | 13% | 34 |
| catcat20.Rabbit 0.001 | 28 | 10% | 39 |
| djdjdj.NanoSkunk10 1.0 | 17 | 6% | 23 |
| bayen.nut.Squirrel 1.615 | 16 | 5% | 23 |
| m3thos.mini.Eva01 0.5.5 | 16 | 5% | 22 |
| ntc.ControlledChaos 1.1.4 | 8 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 1% | 7 |

## Melee bench: F21

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.6 | 130 / 350 | 2.48 | 17.2% | 47956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 17.2% | 148 |
| hadur117.nano.SanaroG18 0.1 | 1.6 | 17.2% | 130 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 21 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 29 |
| eld.Hmm 1.0 | 5.4 | 8.6% | 20 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.7% | 1 |
| fire219.CatBot 1.0 | 7.8 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.1 | 6.1% | 3 |
| PSW.Relentless 0.1 | 8.2 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.1 | 21 / 35 | 4878 |
| 2 | 1 | 68.3 | 87.3 | 18 / 35 | 5132 |
| 3 | 2 | 65.9 | 80.6 | 7 / 35 | 4717 |
| 4 | 2 | 67.3 | 83.8 | 12 / 35 | 5127 |
| 5 | 1 | 67.0 | 81.6 | 11 / 35 | 5501 |
| 6 | 2 | 64.0 | 77.1 | 12 / 35 | 4120 |
| 7 | 2 | 66.8 | 85.1 | 11 / 35 | 4669 |
| 8 | 2 | 66.5 | 83.8 | 13 / 35 | 4546 |
| 9 | 1 | 66.8 | 82.2 | 13 / 35 | 4887 |
| 10 | 2 | 66.0 | 83.2 | 12 / 35 | 4379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 135 | 53% |
| dummy.mini.Scimitar 1.01 | 47 | 87% |
| cf.RiO.RiOx 4.2.1 | 18 | 28% |
| eld.Hmm 1.0 | 16 | 56% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 220 of 350 rounds, at a mean tick of 1224. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 99 | 45% | 154 |
| dummy.mini.Scimitar 1.01 | 49 | 22% | 95 |
| cf.RiO.RiOx 4.2.1 | 41 | 19% | 47 |
| eld.Hmm 1.0 | 14 | 6% | 30 |
| oa.weak.BotherBot 0.1 | 6 | 3% | 12 |
| el.JumpShoot 0.2 | 5 | 2% | 6 |
| PSW.Relentless 0.1 | 3 | 1% | 3 |
| fire219.CatBot 1.0 | 3 | 1% | 3 |

## Melee bench: F23

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.2 | 98 / 350 | 2.69 | 15.9% | 40032 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.5% | 153 |
| hadur117.nano.SanaroG18 0.1 | 2.1 | 15.9% | 98 |
| cre.Karolos 0.32 | 2.9 | 14.5% | 53 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.2% | 21 |
| sample.Walls 1.0 | 6.1 | 9.1% | 12 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.9% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.9% | 3 |
| cw.megas.Blade 0.8 | 7.3 | 8.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 80.0 | 8 / 35 | 3902 |
| 2 | 2 | 66.1 | 80.0 | 9 / 35 | 4420 |
| 3 | 2 | 65.3 | 80.0 | 8 / 35 | 3897 |
| 4 | 2 | 66.4 | 81.9 | 12 / 35 | 3975 |
| 5 | 2 | 64.4 | 79.7 | 10 / 35 | 3818 |
| 6 | 2 | 66.8 | 83.2 | 10 / 35 | 4401 |
| 7 | 3 | 63.9 | 78.1 | 8 / 35 | 3396 |
| 8 | 2 | 66.7 | 85.1 | 10 / 35 | 4341 |
| 9 | 2 | 66.1 | 82.2 | 10 / 35 | 3888 |
| 10 | 2 | 65.8 | 81.9 | 13 / 35 | 3994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 116 | 34% |
| cre.Karolos 0.32 | 50 | 40% |
| stelo.AreaTargetingBot 1.1 | 21 | 62% |
| sample.Walls 1.0 | 19 | 79% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 60% |
| stelo.RamTrackSurfer 1.2 | 3 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 252 of 350 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 134 | 53% | 182 |
| cre.Karolos 0.32 | 60 | 24% | 84 |
| stelo.AreaTargetingBot 1.1 | 20 | 8% | 28 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 17 | 7% | 21 |
| stelo.RamTrackSurfer 1.2 | 9 | 4% | 15 |
| sample.Walls 1.0 | 6 | 2% | 12 |
| cw.megas.Blade 0.8 | 4 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 2 | 1% | 2 |

## Melee bench: F24

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 60.6 | 42 / 350 | 4.55 | 11.7% | 29803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 15.0% | 94 |
| davidalves.Phoenix 0.54 | 2.5 | 13.4% | 75 |
| florent.XSeries.X2 0.12 | 2.8 | 13.4% | 59 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.1% | 46 |
| hadur117.nano.SanaroG18 0.1 | 4.3 | 11.7% | 42 |
| oog.melee.Corsair 1.0 | 6.2 | 9.4% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.9% | 24 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 5 |
| evd.X1 0.01 | 9.5 | 4.9% | 1 |
| as.FrankTheTank 1.3 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.3 | 58.4 | 5 / 35 | 3230 |
| 2 | 5 | 54.6 | 59.0 | 3 / 35 | 2576 |
| 3 | 4 | 55.2 | 58.1 | 3 / 35 | 3150 |
| 4 | 5 | 55.1 | 58.7 | 3 / 35 | 2845 |
| 5 | 2 | 60.1 | 72.7 | 4 / 35 | 3272 |
| 6 | 3 | 57.0 | 63.2 | 6 / 35 | 2975 |
| 7 | 4 | 57.1 | 61.0 | 5 / 35 | 3201 |
| 8 | 5 | 54.4 | 56.8 | 4 / 35 | 2821 |
| 9 | 5 | 54.8 | 57.8 | 4 / 35 | 2754 |
| 10 | 5 | 55.8 | 60.3 | 5 / 35 | 2979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 47% |
| florent.XSeries.X2 0.12 | 16 | 44% |
| davidalves.Phoenix 0.54 | 16 | 38% |
| stelo.SoJNanoMelee 1.1 | 10 | 20% |
| pedersen.Ugluk 1.1.1 | 9 | 67% |
| oog.melee.Corsair 1.0 | 5 | 80% |

Hadur died in 308 of 350 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 64 | 21% | 84 |
| florent.XSeries.X2 0.12 | 56 | 18% | 63 |
| davidalves.Phoenix 0.54 | 56 | 18% | 58 |
| pedersen.Ugluk 1.1.1 | 56 | 18% | 57 |
| stelo.SoJNanoMelee 1.1 | 33 | 11% | 36 |
| oog.melee.Corsair 1.0 | 19 | 6% | 27 |
| lunchie.Lunchbox 0.93 | 11 | 4% | 12 |
| evd.X1 0.01 | 8 | 3% | 7 |
| as.FrankTheTank 1.3 | 5 | 2% | 6 |

## Melee bench: F25

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 70.3 | 59 / 350 | 3.67 | 13.7% | 31720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.4 | 14.6% | 85 |
| hadur117.nano.SanaroG18 0.1 | 2.1 | 13.7% | 59 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 13.0% | 58 |
| jdw.Hurricane 1.4 | 3.6 | 12.2% | 57 |
| gre.svman4.Morfeas 1.4.1 | 4.7 | 11.0% | 34 |
| ds.Oo 2.2 | 6.2 | 9.2% | 27 |
| gjr.Cephalosporin 0.1 | 6.9 | 8.4% | 21 |
| awesomeness.Elite 1.0 | 8.0 | 7.3% | 5 |
| adt.Ar2 1.1 | 8.8 | 6.5% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 74.0 | 8 / 35 | 3110 |
| 2 | 4 | 58.4 | 65.7 | 5 / 35 | 3032 |
| 3 | 1 | 60.9 | 74.6 | 6 / 35 | 3069 |
| 4 | 2 | 59.6 | 68.9 | 9 / 35 | 2986 |
| 5 | 3 | 59.1 | 68.9 | 4 / 35 | 3011 |
| 6 | 2 | 59.2 | 69.2 | 4 / 35 | 3066 |
| 7 | 1 | 61.5 | 74.9 | 6 / 35 | 3501 |
| 8 | 2 | 59.1 | 67.0 | 7 / 35 | 3411 |
| 9 | 2 | 61.0 | 71.7 | 6 / 35 | 3194 |
| 10 | 2 | 59.9 | 68.6 | 4 / 35 | 3340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 46 | 22% |
| voidious.micro.BlitzBat 1.05 | 30 | 7% |
| jdw.Hurricane 1.4 | 28 | 61% |
| gre.svman4.Morfeas 1.4.1 | 25 | 64% |
| gjr.Cephalosporin 0.1 | 17 | 24% |
| ds.Oo 2.2 | 9 | 44% |
| awesomeness.Elite 1.0 | 5 | 80% |
| adt.Ar2 1.1 | 4 | 50% |

Hadur died in 292 of 350 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 80 | 27% | 94 |
| voidious.micro.BlitzBat 1.05 | 74 | 25% | 83 |
| jdw.Hurricane 1.4 | 35 | 12% | 42 |
| gre.svman4.Morfeas 1.4.1 | 31 | 11% | 42 |
| ds.Oo 2.2 | 21 | 7% | 26 |
| gjr.Cephalosporin 0.1 | 19 | 7% | 23 |
| adt.Ar2 1.1 | 14 | 5% | 17 |
| awesomeness.Elite 1.0 | 10 | 3% | 13 |
| amk.ChumbaMini 0.2 | 8 | 3% | 8 |

## Melee bench: F26

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 71.0 | 45 / 350 | 3.61 | 13.8% | 40567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.2 | 16.0% | 123 |
| hadur117.nano.SanaroG18 0.1 | 2.1 | 13.8% | 45 |
| shu.nitro.LENIN .T34 | 3.4 | 13.0% | 74 |
| lrem.Spectre 0.4.4 | 4.2 | 12.3% | 43 |
| gh.mini.GrubbmOne 1.0 | 4.7 | 11.4% | 27 |
| js.PinBall 1.6 | 5.7 | 10.6% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.2% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 11 |
| sample.SpinBot 1.0 | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 64.1 | 3 / 35 | 3728 |
| 2 | 2 | 60.6 | 69.5 | 1 / 35 | 4282 |
| 3 | 2 | 61.5 | 71.1 | 4 / 35 | 4343 |
| 4 | 2 | 61.7 | 72.4 | 6 / 35 | 3721 |
| 5 | 4 | 59.0 | 67.0 | 4 / 35 | 3553 |
| 6 | 2 | 62.4 | 74.3 | 4 / 35 | 4144 |
| 7 | 1 | 62.4 | 73.3 | 4 / 35 | 4461 |
| 8 | 2 | 62.7 | 74.9 | 8 / 35 | 4127 |
| 9 | 2 | 61.3 | 71.4 | 5 / 35 | 3778 |
| 10 | 1 | 62.1 | 72.4 | 6 / 35 | 4430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 50 | 10% |
| shu.nitro.LENIN .T34 | 46 | 35% |
| lrem.Spectre 0.4.4 | 29 | 34% |
| gh.mini.GrubbmOne 1.0 | 13 | 0% |
| js.PinBall 1.6 | 11 | 64% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 50% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 60% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 97 | 32% | 103 |
| shu.nitro.LENIN .T34 | 55 | 18% | 72 |
| lrem.Spectre 0.4.4 | 53 | 17% | 61 |
| gh.mini.GrubbmOne 1.0 | 39 | 13% | 40 |
| js.PinBall 1.6 | 25 | 8% | 31 |
| jaybot.adv.bots.JayBot 2.0 | 18 | 6% | 22 |
| sample.SpinBot 1.0 | 10 | 3% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 69.5 | 65 / 350 | 3.75 | 13.5% | 33000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.1 | 16.1% | 142 |
| hadur117.nano.SanaroG18 0.1 | 2.5 | 13.5% | 65 |
| sheldor.melee.nano.TestMelee 0.1 | 3.7 | 11.7% | 45 |
| wee.Gem 1.8.4 | 4.0 | 11.8% | 61 |
| EH.Eagle 1.0.6 | 4.4 | 11.1% | 21 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.2% | 11 |
| throxbot.ThroxBot 0.1 | 7.6 | 7.9% | 2 |
| joe.ADinosaur 1.0 | 7.6 | 7.6% | 2 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.4% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.9 | 11 / 35 | 3660 |
| 2 | 3 | 55.3 | 59.4 | 4 / 35 | 2842 |
| 3 | 2 | 60.2 | 72.4 | 6 / 35 | 3081 |
| 4 | 3 | 60.3 | 73.3 | 6 / 35 | 2869 |
| 5 | 3 | 58.3 | 69.5 | 5 / 35 | 2827 |
| 6 | 2 | 61.4 | 76.5 | 7 / 35 | 3176 |
| 7 | 4 | 57.2 | 52.1 | 3 / 35 | 4374 |
| 8 | 2 | 62.4 | 75.2 | 12 / 35 | 3617 |
| 9 | 2 | 61.2 | 74.6 | 7 / 35 | 3340 |
| 10 | 2 | 58.4 | 66.7 | 4 / 35 | 3214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 61 | 51% |
| EH.Eagle 1.0.6 | 25 | 44% |
| wee.Gem 1.8.4 | 24 | 29% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 35% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 55% |
| throxbot.ThroxBot 0.1 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 107 | 38% | 139 |
| sheldor.melee.nano.TestMelee 0.1 | 41 | 14% | 50 |
| EH.Eagle 1.0.6 | 39 | 14% | 49 |
| wee.Gem 1.8.4 | 39 | 14% | 48 |
| throxbot.ThroxBot 0.1 | 14 | 5% | 14 |
| caimano.Furia_Ceca 0.22 | 14 | 5% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 13 | 5% | 17 |
| joe.ADinosaur 1.0 | 13 | 5% | 14 |
| cs.Grudge 1.0 | 5 | 2% | 5 |

## Melee bench: F28

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 78.1 | 98 / 350 | 2.97 | 15.4% | 37067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.4 | 16.3% | 122 |
| hadur117.nano.SanaroG18 0.1 | 1.6 | 15.4% | 98 |
| uji.Antique 1.0 | 3.1 | 12.8% | 67 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.6% | 16 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.7% | 26 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.2% | 6 |
| ahr.ice.Ice 1.0.2 | 6.9 | 7.9% | 10 |
| matt.advanced.Katana 1.0 | 7.8 | 6.8% | 6 |
| stelo.PianistNano 1.2 | 9.2 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.6 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 74.6 | 9 / 35 | 3488 |
| 2 | 2 | 61.2 | 73.7 | 7 / 35 | 3393 |
| 3 | 1 | 64.3 | 80.6 | 14 / 35 | 3687 |
| 4 | 1 | 66.7 | 87.3 | 14 / 35 | 4110 |
| 5 | 1 | 64.2 | 83.2 | 9 / 35 | 3739 |
| 6 | 2 | 63.3 | 76.2 | 11 / 35 | 3802 |
| 7 | 2 | 63.8 | 78.1 | 11 / 35 | 3964 |
| 8 | 1 | 64.5 | 83.2 | 10 / 35 | 3700 |
| 9 | 2 | 59.8 | 70.2 | 3 / 35 | 3339 |
| 10 | 2 | 62.4 | 73.7 | 10 / 35 | 3845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 108 | 44% |
| uji.Antique 1.0 | 48 | 48% |
| qohnil.blot.BlotBot 3.61 | 15 | 40% |
| amk.ChumbaWumba 0.3 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 8 | 25% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| matt.advanced.Katana 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 253 of 350 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 97 | 38% | 124 |
| uji.Antique 1.0 | 49 | 19% | 80 |
| pfvicm.Sobieski 7.2.3b | 46 | 18% | 53 |
| amk.ChumbaWumba 0.3 | 26 | 10% | 32 |
| qohnil.blot.BlotBot 3.61 | 15 | 6% | 25 |
| ahr.ice.Ice 1.0.2 | 8 | 3% | 12 |
| matt.advanced.Katana 1.0 | 6 | 2% | 13 |
| stelo.Lifestealer 1.0 | 4 | 2% | 6 |
| stelo.PianistNano 1.2 | 2 | 1% | 5 |

## Melee bench: F29

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 63.2 | 47 / 350 | 4.31 | 12.8% | 35220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 16.1% | 115 |
| deewiant.Anomaly 0.2 | 1.6 | 15.9% | 102 |
| myl.micro.Troodon 1.10 | 3.4 | 13.0% | 26 |
| hadur117.nano.SanaroG18 0.1 | 3.7 | 12.8% | 47 |
| jok.PheonixM 0.1.2 | 4.9 | 11.2% | 24 |
| DBall.Anarchy 0.1 | 6.3 | 8.3% | 24 |
| ph.melee.ArcherME 0.3 | 6.6 | 8.3% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.6% | 0 |
| jangs.ns51 1.0 | 9.4 | 4.5% | 5 |
| ap.Frederick 1.1 | 9.4 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 70.8 | 6 / 35 | 4169 |
| 2 | 5 | 56.5 | 57.5 | 6 / 35 | 3265 |
| 3 | 3 | 61.7 | 70.8 | 5 / 35 | 3571 |
| 4 | 5 | 55.3 | 54.6 | 4 / 35 | 3005 |
| 5 | 4 | 57.8 | 60.3 | 2 / 35 | 3459 |
| 6 | 4 | 60.5 | 64.8 | 7 / 35 | 3499 |
| 7 | 4 | 59.2 | 61.3 | 4 / 35 | 3673 |
| 8 | 3 | 59.9 | 63.2 | 6 / 35 | 3617 |
| 9 | 4 | 57.9 | 63.2 | 1 / 35 | 3345 |
| 10 | 3 | 60.6 | 66.0 | 6 / 35 | 3617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 37 | 14% |
| zyx.mega.YersiniaPestis 3.1 | 26 | 65% |
| myl.micro.Troodon 1.10 | 24 | 67% |
| jok.PheonixM 0.1.2 | 10 | 60% |
| DBall.Anarchy 0.1 | 6 | 17% |
| jangs.ns51 1.0 | 2 | 50% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 98 | 32% | 108 |
| zyx.mega.YersiniaPestis 3.1 | 65 | 21% | 80 |
| myl.micro.Troodon 1.10 | 53 | 17% | 65 |
| jok.PheonixM 0.1.2 | 46 | 15% | 54 |
| ph.melee.ArcherME 0.3 | 17 | 6% | 17 |
| DBall.Anarchy 0.1 | 9 | 3% | 11 |
| fullsail.TimbotNoPrediction 1.0 | 8 | 3% | 8 |
| jangs.ns51 1.0 | 7 | 2% | 7 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 58.6 | 33 / 350 | 4.72 | 11.2% | 29364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.2% | 72 |
| catcat20.Matcha 0.006 | 2.4 | 13.9% | 83 |
| darkcanuck.B26354 1.06 | 2.7 | 13.6% | 89 |
| stelo.PastFuture 2.3.2 | 3.1 | 13.5% | 51 |
| hadur117.nano.SanaroG18 0.1 | 5.2 | 11.2% | 33 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.3% | 11 |
| ntc.Opposite 1.5 | 7.1 | 7.9% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.2% | 7 |
| tripphippy.Alice 1.1 | 8.7 | 6.4% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.1 | 58.4 | 4 / 35 | 2963 |
| 2 | 6 | 51.8 | 52.4 | 1 / 35 | 2461 |
| 3 | 5 | 56.6 | 61.9 | 4 / 35 | 3134 |
| 4 | 5 | 56.9 | 61.0 | 4 / 35 | 3150 |
| 5 | 5 | 56.3 | 62.2 | 6 / 35 | 2632 |
| 6 | 5 | 55.2 | 56.5 | 4 / 35 | 3098 |
| 7 | 5 | 57.1 | 61.0 | 4 / 35 | 3126 |
| 8 | 6 | 52.5 | 53.3 | 1 / 35 | 2639 |
| 9 | 5 | 56.1 | 61.9 | 3 / 35 | 2851 |
| 10 | 5 | 54.9 | 57.8 | 2 / 35 | 3310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 25 | 44% |
| oog.melee.Capulet 1.2 | 24 | 33% |
| darkcanuck.B26354 1.06 | 17 | 18% |
| stelo.PastFuture 2.3.2 | 10 | 60% |
| intruder.PrairieWolf 2.61 | 5 | 40% |
| tripphippy.Alice 1.1 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 317 of 350 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 67 | 21% | 70 |
| oog.melee.Capulet 1.2 | 66 | 21% | 73 |
| stelo.PastFuture 2.3.2 | 62 | 20% | 68 |
| catcat20.Matcha 0.006 | 48 | 15% | 61 |
| ntc.Opposite 1.5 | 25 | 8% | 25 |
| intruder.PrairieWolf 2.61 | 20 | 6% | 23 |
| fowl3628800.LightningBolt 2.6.0 | 16 | 5% | 15 |
| tripphippy.Alice 1.1 | 12 | 4% | 14 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.6 | 55.5 | 11 / 350 | 5.01 | 10.5% | 26635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 184 |
| gh.mini.Griezel 0.2 | 2.1 | 14.3% | 98 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 12.5% | 28 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.5% | 14 |
| hadur117.nano.SanaroG18 0.1 | 4.7 | 10.5% | 11 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 8 |
| fm.mammillarias 1.3 | 7.4 | 6.9% | 3 |
| timmit.nano.TimDog 0.33 | 7.4 | 7.2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.0% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.4 | 52.7 | 2 / 35 | 2346 |
| 2 | 5 | 54.3 | 55.9 | 2 / 35 | 2870 |
| 3 | 6 | 50.6 | 48.3 | 0 / 35 | 2760 |
| 4 | 5 | 52.9 | 54.9 | 0 / 35 | 2594 |
| 5 | 4 | 57.2 | 62.5 | 2 / 35 | 3076 |
| 6 | 3 | 58.3 | 65.7 | 0 / 35 | 2882 |
| 7 | 5 | 52.1 | 54.0 | 0 / 35 | 2338 |
| 8 | 4 | 56.2 | 62.5 | 2 / 35 | 2613 |
| 9 | 5 | 50.3 | 47.6 | 1 / 35 | 2565 |
| 10 | 5 | 52.0 | 50.5 | 2 / 35 | 2591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 37 | 22% |
| gh.mini.Griezel 0.2 | 29 | 7% |
| spinnercat.micro.Tyger 0.1 | 5 | 20% |
| d414.nano.Quantum 1.0.0 | 4 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 0% |

Hadur died in 339 of 350 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 104 | 31% | 106 |
| abc.Shadow 3.84i | 74 | 22% | 82 |
| spinnercat.micro.Tyger 0.1 | 59 | 17% | 60 |
| d414.nano.Quantum 1.0.0 | 43 | 13% | 43 |
| gh.nano.Grofvuil 0.2 | 22 | 6% | 22 |
| fm.mammillarias 1.3 | 16 | 5% | 16 |
| timmit.nano.TimDog 0.33 | 12 | 4% | 12 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 1% | 5 |
| tlp.ThreeLeggedPig 1 | 4 | 1% | 4 |

## Melee bench: F32

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 74.9 | 106 / 350 | 3.26 | 14.8% | 36864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.6% | 129 |
| hadur117.nano.SanaroG18 0.1 | 1.7 | 14.8% | 106 |
| apc.botM 3.0 | 3.1 | 12.6% | 55 |
| lxx.ConceptA 0.8 | 4.3 | 10.8% | 5 |
| vjik.UnViolation 1.1 | 4.7 | 10.6% | 30 |
| bayen.UbaMicro 1.4 | 6.3 | 8.8% | 9 |
| panzer.Panzer 0.2 | 6.9 | 7.7% | 1 |
| conscience.Electron 1.3g | 8.4 | 6.6% | 2 |
| yk.JahMicro 1.0 | 8.6 | 6.8% | 5 |
| donjezza.Jezza 1.0 | 9.7 | 5.7% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 71.7 | 13 / 35 | 3396 |
| 2 | 1 | 65.0 | 84.1 | 13 / 35 | 3893 |
| 3 | 2 | 61.7 | 71.7 | 13 / 35 | 3682 |
| 4 | 2 | 61.3 | 74.6 | 8 / 35 | 3672 |
| 5 | 2 | 58.7 | 67.6 | 6 / 35 | 3450 |
| 6 | 2 | 62.1 | 74.3 | 9 / 35 | 3863 |
| 7 | 1 | 61.2 | 72.4 | 13 / 35 | 3540 |
| 8 | 2 | 61.7 | 73.7 | 8 / 35 | 3920 |
| 9 | 1 | 64.4 | 80.3 | 15 / 35 | 3926 |
| 10 | 2 | 61.9 | 78.1 | 8 / 35 | 3522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 38% |
| apc.botM 3.0 | 46 | 63% |
| vjik.UnViolation 1.1 | 22 | 55% |
| lxx.ConceptA 0.8 | 14 | 93% |
| yk.JahMicro 1.0 | 10 | 90% |
| donjezza.Jezza 1.0 | 6 | 33% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 244 of 350 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 35% | 123 |
| lxx.ConceptA 0.8 | 50 | 20% | 54 |
| apc.botM 3.0 | 40 | 16% | 70 |
| vjik.UnViolation 1.1 | 19 | 8% | 41 |
| bayen.UbaMicro 1.4 | 14 | 6% | 21 |
| conscience.Electron 1.3g | 12 | 5% | 14 |
| panzer.Panzer 0.2 | 11 | 5% | 11 |
| yk.JahMicro 1.0 | 7 | 3% | 8 |
| donjezza.Jezza 1.0 | 5 | 2% | 8 |

## Melee bench: F33

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 68.6 | 70 / 350 | 3.82 | 13.9% | 36801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.5% | 123 |
| hadur117.nano.SanaroG18 0.1 | 2.4 | 13.9% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.3% | 48 |
| gre.svman4.Leonidas 1.3.2 | 4.1 | 11.6% | 46 |
| labg.Cataclysm 2.05 | 4.8 | 11.1% | 37 |
| baal.nano.N 1.42 | 6.5 | 8.8% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 9.0% | 23 |
| zyx.micro.Ant 1.1 | 8.8 | 5.3% | 1 |
| sanja.First 0.1 | 8.9 | 5.0% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 77.5 | 10 / 35 | 3898 |
| 2 | 3 | 59.0 | 63.2 | 6 / 35 | 3653 |
| 3 | 2 | 59.2 | 62.9 | 8 / 35 | 3487 |
| 4 | 2 | 60.1 | 66.7 | 5 / 35 | 3677 |
| 5 | 2 | 62.1 | 71.7 | 7 / 35 | 3871 |
| 6 | 2 | 61.0 | 67.3 | 9 / 35 | 3723 |
| 7 | 3 | 61.5 | 70.2 | 7 / 35 | 3562 |
| 8 | 3 | 61.3 | 70.8 | 9 / 35 | 3476 |
| 9 | 3 | 59.2 | 66.0 | 5 / 35 | 3367 |
| 10 | 2 | 61.5 | 70.2 | 4 / 35 | 4087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 51 | 39% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 61% |
| gre.svman4.Leonidas 1.3.2 | 18 | 39% |
| kinsen.melee.Angsaichmophobia 1.8c | 17 | 65% |
| labg.Cataclysm 2.05 | 11 | 55% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 50% |
| sanja.First 0.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 111 | 40% | 133 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 56 | 20% | 83 |
| gre.svman4.Leonidas 1.3.2 | 40 | 14% | 44 |
| labg.Cataclysm 2.05 | 29 | 10% | 38 |
| kinsen.melee.Angsaichmophobia 1.8c | 21 | 7% | 23 |
| baal.nano.N 1.42 | 11 | 4% | 14 |
| zyx.micro.Ant 1.1 | 6 | 2% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 2% | 6 |
| sanja.First 0.1 | 2 | 1% | 2 |

## Melee bench: F34

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 74.2 | 67 / 350 | 3.32 | 14.8% | 42026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 17.3% | 127 |
| stelo.Spread 0.9 | 1.8 | 16.6% | 113 |
| hadur117.nano.SanaroG18 0.1 | 2.9 | 14.8% | 67 |
| tcf.Reach 3 | 4.5 | 11.1% | 13 |
| jcs.Seth 1.8 | 4.8 | 11.1% | 25 |
| cli.Dancer 1.1 | 5.7 | 9.7% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.5% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.9 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.3 | 74.6 | 6 / 35 | 4617 |
| 2 | 3 | 64.1 | 76.8 | 8 / 35 | 4076 |
| 3 | 3 | 63.8 | 74.0 | 6 / 35 | 4356 |
| 4 | 3 | 64.8 | 77.1 | 10 / 35 | 4431 |
| 5 | 3 | 61.1 | 68.9 | 5 / 35 | 3920 |
| 6 | 3 | 61.8 | 71.1 | 3 / 35 | 3820 |
| 7 | 2 | 63.6 | 74.6 | 8 / 35 | 4212 |
| 8 | 3 | 63.0 | 74.9 | 6 / 35 | 3739 |
| 9 | 3 | 63.0 | 72.1 | 4 / 35 | 4219 |
| 10 | 3 | 65.9 | 78.1 | 11 / 35 | 4636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 65 | 11% |
| stelo.Spread 0.9 | 62 | 66% |
| jcs.Seth 1.8 | 21 | 62% |
| tcf.Reach 3 | 4 | 25% |
| ratosh.Wesco 1.4 | 3 | 100% |
| cli.Dancer 1.1 | 2 | 0% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 138 | 49% | 139 |
| stelo.Spread 0.9 | 68 | 24% | 115 |
| jcs.Seth 1.8 | 29 | 10% | 43 |
| tcf.Reach 3 | 19 | 7% | 20 |
| cli.Dancer 1.1 | 14 | 5% | 15 |
| ratosh.Wesco 1.4 | 11 | 4% | 13 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 4 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 68.3 | 18 / 350 | 3.85 | 12.5% | 28331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 258 |
| gh.mini.Gruwel 0.9 | 2.4 | 13.1% | 36 |
| hadur117.nano.SanaroG18 0.1 | 3.3 | 12.5% | 18 |
| rz.HawkOnFire 0.1 | 4.1 | 12.2% | 11 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.2% | 24 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.2% | 1 |
| wit.Chuliath 1.0 | 6.9 | 6.9% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.2% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 74.6 | 4 / 35 | 2847 |
| 2 | 5 | 56.5 | 62.2 | 1 / 35 | 2881 |
| 3 | 4 | 57.7 | 67.0 | 2 / 35 | 2735 |
| 4 | 4 | 58.8 | 67.3 | 1 / 35 | 2964 |
| 5 | 2 | 58.7 | 67.9 | 2 / 35 | 3073 |
| 6 | 3 | 58.2 | 67.3 | 0 / 35 | 2823 |
| 7 | 2 | 60.6 | 73.3 | 5 / 35 | 2772 |
| 8 | 2 | 59.3 | 70.8 | 2 / 35 | 2824 |
| 9 | 5 | 57.0 | 63.8 | 0 / 35 | 2714 |
| 10 | 4 | 58.5 | 68.6 | 1 / 35 | 2698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 85 | 8% |
| gh.mini.Gruwel 0.9 | 18 | 22% |
| rz.HawkOnFire 0.1 | 11 | 55% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 25% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 332 of 350 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 136 | 41% | 141 |
| rz.HawkOnFire 0.1 | 60 | 18% | 66 |
| gh.mini.Gruwel 0.9 | 56 | 17% | 62 |
| dmh.robocode.robot.BlackDeath 9.2 | 38 | 11% | 39 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 18 | 5% | 18 |
| wit.Chuliath 1.0 | 10 | 3% | 10 |
| myl.nano.KomoriNinja 1.1 | 8 | 2% | 8 |
| dans.Cinnamon 1.2 | 4 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.2 | 125 / 350 | 3.23 | 15.4% | 38645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG18 0.1 | 1.0 | 15.4% | 125 |
| alpha.RainingFire 1.0 | 2.8 | 12.5% | 53 |
| bzdp.Pansy 2.1 | 3.4 | 12.1% | 45 |
| mz.Cork 0.1 | 3.9 | 11.6% | 39 |
| bvh.micro.Freya 0.3 | 4.2 | 11.3% | 30 |
| m3thos.Eva02 0.7.1 | 6.0 | 10.1% | 29 |
| bvh.mini.Fenrir 0.39 | 6.9 | 9.5% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 6.6% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 6.5% | 2 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 17 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 73.3 | 15 / 35 | 3582 |
| 2 | 1 | 65.0 | 79.7 | 15 / 35 | 4138 |
| 3 | 1 | 61.0 | 67.6 | 11 / 35 | 3985 |
| 4 | 1 | 61.8 | 74.0 | 8 / 35 | 3600 |
| 5 | 1 | 59.9 | 66.3 | 10 / 35 | 3554 |
| 6 | 1 | 63.9 | 78.4 | 13 / 35 | 3695 |
| 7 | 1 | 63.7 | 76.8 | 15 / 35 | 3932 |
| 8 | 1 | 64.3 | 80.0 | 12 / 35 | 4258 |
| 9 | 1 | 65.4 | 82.9 | 15 / 35 | 4063 |
| 10 | 1 | 62.2 | 72.7 | 11 / 35 | 3838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 64% |
| bvh.micro.Freya 0.3 | 31 | 74% |
| alpha.RainingFire 1.0 | 27 | 63% |
| bvh.mini.Fenrir 0.39 | 23 | 91% |
| mz.Cork 0.1 | 22 | 68% |
| m3thos.Eva02 0.7.1 | 21 | 48% |
| sample.MyFirstRobot 1.0 | 12 | 8% |
| dl.BetterWalls 1.0 | 6 | 83% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |

Hadur died in 226 of 350 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 46 | 20% | 65 |
| bzdp.Pansy 2.1 | 45 | 20% | 83 |
| bvh.micro.Freya 0.3 | 33 | 15% | 54 |
| mz.Cork 0.1 | 27 | 12% | 46 |
| m3thos.Eva02 0.7.1 | 27 | 12% | 39 |
| bvh.mini.Fenrir 0.39 | 22 | 10% | 26 |
| sample.MyFirstRobot 1.0 | 15 | 7% | 16 |
| squidM.TentalceMeleeNano 1.1 | 8 | 4% | 10 |
| dl.BetterWalls 1.0 | 3 | 1% | 11 |

## Melee bench: F37

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 77.5 | 115 / 350 | 3.03 | 15.4% | 43986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG18 0.1 | 1.0 | 15.4% | 115 |
| germ.TheMind .2 | 2.9 | 11.7% | 48 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.1 | 11.1% | 33 |
| EBBU.Sim2 1.02 | 3.6 | 10.5% | 26 |
| agrach.Dalek 1.0 | 5.2 | 9.7% | 47 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.8% | 21 |
| mb.Beast 0.1 | 7.1 | 8.6% | 26 |
| lmk.ACPFinal 0.1 | 7.2 | 8.9% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.9% | 1 |
| skm.Ryubot 1.0 | 9.2 | 7.6% | 14 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 79.4 | 13 / 35 | 4176 |
| 2 | 1 | 59.6 | 73.7 | 9 / 35 | 3783 |
| 3 | 1 | 64.3 | 79.0 | 16 / 35 | 4941 |
| 4 | 1 | 61.9 | 75.9 | 10 / 35 | 4746 |
| 5 | 1 | 59.5 | 70.8 | 5 / 35 | 4228 |
| 6 | 1 | 63.5 | 82.2 | 12 / 35 | 4336 |
| 7 | 1 | 61.5 | 75.2 | 8 / 35 | 4610 |
| 8 | 1 | 62.3 | 77.8 | 12 / 35 | 4177 |
| 9 | 1 | 63.0 | 79.0 | 15 / 35 | 4230 |
| 10 | 1 | 64.6 | 81.9 | 15 / 35 | 4759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 36 | 44% |
| EBBU.Sim2 1.02 | 32 | 66% |
| com.syncleus.robocode.Dreadnaught 0.1 | 31 | 61% |
| mb.Beast 0.1 | 24 | 67% |
| agrach.Dalek 1.0 | 22 | 45% |
| lmk.ACPFinal 0.1 | 21 | 62% |
| stelo.UntouchableNano 1.3 | 16 | 81% |
| skm.Ryubot 1.0 | 14 | 43% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 238 of 350 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 57 | 24% | 66 |
| lmk.ACPFinal 0.1 | 32 | 13% | 45 |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 12% | 48 |
| EBBU.Sim2 1.02 | 28 | 12% | 45 |
| agrach.Dalek 1.0 | 26 | 11% | 42 |
| mb.Beast 0.1 | 24 | 10% | 46 |
| stelo.UntouchableNano 1.3 | 15 | 6% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 6% | 19 |
| skm.Ryubot 1.0 | 12 | 5% | 17 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 63.5 | 33 / 350 | 4.28 | 12.1% | 31937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.5% | 179 |
| bvh.mini.Freya 0.55 | 2.7 | 13.1% | 36 |
| hadur117.nano.SanaroG18 0.1 | 3.3 | 12.1% | 33 |
| bts.mega.Gnarly 1.4 | 3.7 | 11.9% | 52 |
| cs.Wren 1.0 | 5.0 | 10.8% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.6% | 21 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.8% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.4% | 5 |
| matt.UnderDark3 2.4.34 | 9.1 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 67.0 | 5 / 35 | 3315 |
| 2 | 3 | 56.8 | 62.2 | 2 / 35 | 3099 |
| 3 | 4 | 57.1 | 61.0 | 6 / 35 | 3159 |
| 4 | 4 | 59.2 | 67.3 | 2 / 35 | 3438 |
| 5 | 4 | 56.3 | 61.6 | 2 / 35 | 3205 |
| 6 | 3 | 58.1 | 66.0 | 2 / 35 | 3256 |
| 7 | 4 | 57.7 | 62.5 | 7 / 35 | 3259 |
| 8 | 2 | 56.4 | 61.9 | 3 / 35 | 3181 |
| 9 | 4 | 53.8 | 55.2 | 2 / 35 | 2777 |
| 10 | 2 | 59.4 | 70.5 | 2 / 35 | 3248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 58 | 33% |
| bts.mega.Gnarly 1.4 | 20 | 30% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 11% |
| bvh.mini.Freya 0.55 | 9 | 22% |
| cs.Wren 1.0 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 317 of 350 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 97 | 31% | 116 |
| bvh.mini.Freya 0.55 | 48 | 15% | 51 |
| bts.mega.Gnarly 1.4 | 42 | 13% | 46 |
| cs.Wren 1.0 | 42 | 13% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 11% | 42 |
| kdf.KoulDestroyer 1.0 | 35 | 11% | 35 |
| kawigi.spare.SpareParts 0.7.6nosnd | 10 | 3% | 10 |
| bzdp.BoxCar 2.0 | 5 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 63.9 | 40 / 350 | 4.25 | 12.3% | 34133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.8% | 73 |
| az.Ololobot 0.2.4 | 2.3 | 13.6% | 124 |
| hadur117.nano.SanaroG18 0.1 | 3.3 | 12.3% | 40 |
| catcat20.Lambda 0.024 | 3.6 | 11.7% | 61 |
| stelo.SoRobotNanoMelee 1.2 | 5.9 | 9.2% | 28 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.9% | 14 |
| gimp.GimpBot 0.1 | 7.0 | 8.4% | 4 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 8.1% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 6.6% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 50.5 | 50.5 | 1 / 35 | 2979 |
| 2 | 3 | 58.0 | 68.3 | 3 / 35 | 3464 |
| 3 | 4 | 57.6 | 63.8 | 0 / 35 | 3829 |
| 4 | 2 | 58.7 | 68.9 | 5 / 35 | 3554 |
| 5 | 4 | 56.6 | 61.6 | 6 / 35 | 3300 |
| 6 | 3 | 57.1 | 63.8 | 4 / 35 | 3397 |
| 7 | 3 | 57.9 | 66.7 | 4 / 35 | 3328 |
| 8 | 3 | 56.9 | 62.5 | 6 / 35 | 3451 |
| 9 | 3 | 57.9 | 66.0 | 5 / 35 | 3570 |
| 10 | 2 | 58.0 | 67.0 | 6 / 35 | 3261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 43 | 5% |
| bvh.fry.Freya 0.82 | 33 | 42% |
| catcat20.Lambda 0.024 | 17 | 53% |
| winamp32.micro.MicroMacro 1.0 | 8 | 50% |
| gimp.GimpBot 0.1 | 6 | 83% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 67% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 314 of 350 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 109 | 35% | 120 |
| az.Ololobot 0.2.4 | 68 | 22% | 70 |
| catcat20.Lambda 0.024 | 41 | 13% | 49 |
| apollokidd.ApolloKidd 0.9 | 28 | 9% | 30 |
| winamp32.micro.MicroMacro 1.0 | 20 | 6% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 6% | 22 |
| gimp.GimpBot 0.1 | 13 | 4% | 19 |
| whitesquare.robots.SkynetAdvanced 1.1 | 12 | 4% | 13 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F41

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 67.8 | 56 / 350 | 3.89 | 13.1% | 31770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.1% | 169 |
| lessonz.robocode.Oz 0.5.0 | 2.8 | 13.5% | 53 |
| hadur117.nano.SanaroG18 0.1 | 3.3 | 13.1% | 56 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 25 |
| simonton.nano.MeleeSeed 1.8 | 4.6 | 12.1% | 35 |
| shrub.Silver v048 | 6.0 | 9.0% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 1 |
| jsal.Jsalbot 1.0 | 8.4 | 5.8% | 5 |
| stelo.Mirror 1.1 | 8.6 | 5.9% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 74.0 | 10 / 35 | 3382 |
| 2 | 4 | 58.8 | 65.4 | 4 / 35 | 2957 |
| 3 | 4 | 59.2 | 67.9 | 4 / 35 | 3029 |
| 4 | 4 | 59.4 | 65.1 | 7 / 35 | 2950 |
| 5 | 2 | 60.5 | 69.2 | 8 / 35 | 3193 |
| 6 | 4 | 59.2 | 67.0 | 3 / 35 | 3255 |
| 7 | 3 | 59.6 | 66.7 | 6 / 35 | 3130 |
| 8 | 4 | 59.3 | 66.3 | 4 / 35 | 3407 |
| 9 | 3 | 61.0 | 71.1 | 5 / 35 | 3337 |
| 10 | 3 | 58.7 | 65.7 | 5 / 35 | 3130 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 28% |
| ary.Swarm 1.1 | 21 | 76% |
| lessonz.robocode.Oz 0.5.0 | 20 | 65% |
| simonton.nano.MeleeSeed 1.8 | 14 | 57% |
| shrub.Silver v048 | 2 | 0% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 94 | 32% | 111 |
| ary.Swarm 1.1 | 64 | 22% | 77 |
| lessonz.robocode.Oz 0.5.0 | 45 | 15% | 55 |
| simonton.nano.MeleeSeed 1.8 | 40 | 14% | 50 |
| shrub.Silver v048 | 21 | 7% | 23 |
| zyx.nano.Ant 1.1 | 13 | 4% | 13 |
| stelo.Mirror 1.1 | 8 | 3% | 10 |
| jsal.Jsalbot 1.0 | 7 | 2% | 9 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 71.2 | 54 / 350 | 3.59 | 14.0% | 39030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.5% | 166 |
| hadur117.nano.SanaroG18 0.1 | 3.0 | 14.0% | 54 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 14.0% | 43 |
| ara.Shera 0.88 | 3.0 | 13.9% | 68 |
| amz.NanoClone 1.41 | 5.0 | 9.7% | 4 |
| dsw.StaticD 1.0 | 6.5 | 7.4% | 10 |
| maribo.IotaCT 1.1 | 6.5 | 7.5% | 4 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.7% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 71.1 | 4 / 35 | 3986 |
| 2 | 2 | 63.6 | 75.6 | 10 / 35 | 4248 |
| 3 | 4 | 60.0 | 67.6 | 6 / 35 | 3689 |
| 4 | 2 | 61.3 | 71.1 | 8 / 35 | 3767 |
| 5 | 3 | 62.2 | 74.3 | 6 / 35 | 3971 |
| 6 | 2 | 61.8 | 74.9 | 5 / 35 | 3912 |
| 7 | 4 | 61.8 | 72.1 | 5 / 35 | 4042 |
| 8 | 4 | 57.5 | 63.2 | 2 / 35 | 3385 |
| 9 | 3 | 60.9 | 71.1 | 4 / 35 | 3864 |
| 10 | 4 | 61.4 | 70.8 | 4 / 35 | 4166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 83 | 27% |
| maribo.mini.MiniQuester 0.1 | 29 | 72% |
| ara.Shera 0.88 | 26 | 27% |
| dsw.StaticD 1.0 | 3 | 33% |
| maribo.IotaCT 1.1 | 2 | 0% |
| amz.NanoClone 1.41 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 110 | 37% | 133 |
| ara.Shera 0.88 | 68 | 23% | 75 |
| maribo.mini.MiniQuester 0.1 | 59 | 20% | 77 |
| amz.NanoClone 1.41 | 27 | 9% | 28 |
| maribo.IotaCT 1.1 | 13 | 4% | 13 |
| dsw.StaticD 1.0 | 6 | 2% | 7 |
| stelo.MirrorMicro 1.0 | 6 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 5 |

## Melee bench: F43

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 64.2 | 25 / 350 | 4.22 | 12.5% | 33910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 273 |
| brainfade.melee.Dusk 0.44 | 2.6 | 12.7% | 25 |
| hadur117.nano.SanaroG18 0.1 | 3.0 | 12.5% | 25 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.0% | 15 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.3% | 7 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 10.1% | 3 |
| mz.NanoGod 2.02 | 7.4 | 7.9% | 2 |
| jab.DiamondStealer 5 | 7.6 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 69.5 | 8 / 35 | 3633 |
| 2 | 3 | 60.1 | 63.8 | 2 / 35 | 3425 |
| 3 | 3 | 58.8 | 61.9 | 1 / 35 | 3275 |
| 4 | 3 | 59.7 | 62.5 | 1 / 35 | 3596 |
| 5 | 3 | 60.8 | 67.0 | 1 / 35 | 3603 |
| 6 | 2 | 59.8 | 65.1 | 3 / 35 | 3160 |
| 7 | 5 | 58.1 | 60.6 | 2 / 35 | 3041 |
| 8 | 3 | 59.3 | 61.9 | 2 / 35 | 3373 |
| 9 | 2 | 62.2 | 70.5 | 3 / 35 | 3606 |
| 10 | 4 | 58.5 | 59.0 | 2 / 35 | 3198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 72 | 17% |
| brainfade.melee.Dusk 0.44 | 16 | 56% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 0% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |

Hadur died in 325 of 350 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 143 | 44% | 155 |
| brainfade.melee.Dusk 0.44 | 47 | 14% | 56 |
| dummy.micro.Sparrow 2.5 | 40 | 12% | 43 |
| wcsv.melee.EngineerMelee 0.1 | 40 | 12% | 40 |
| Krabb.akim2.Akim2 1.1b | 28 | 9% | 29 |
| mz.NanoGod 2.02 | 19 | 6% | 19 |
| jab.DiamondStealer 5 | 5 | 2% | 5 |
| cvt.Firsty 1.0 | 3 | 1% | 3 |

## Melee bench: F44

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 70.1 | 69 / 350 | 3.69 | 14.2% | 39022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.1% | 146 |
| tzu.TheArtOfWar 1.2 | 2.3 | 14.7% | 75 |
| hadur117.nano.SanaroG18 0.1 | 2.6 | 14.2% | 69 |
| jwirde.Gort 2.0 | 4.4 | 10.9% | 32 |
| wompi.Quokka 1.6 | 4.8 | 10.6% | 16 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 8.9% | 3 |
| disan.Chair 2.2.0 | 7.4 | 7.2% | 5 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.2% | 3 |
| sample.Crazy 1.0 | 9.3 | 4.9% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 67.3 | 7 / 35 | 3955 |
| 2 | 2 | 63.2 | 73.3 | 11 / 35 | 4003 |
| 3 | 3 | 59.2 | 61.0 | 5 / 35 | 4212 |
| 4 | 3 | 62.3 | 73.3 | 7 / 35 | 3550 |
| 5 | 3 | 60.5 | 66.0 | 6 / 35 | 3930 |
| 6 | 3 | 62.8 | 74.9 | 7 / 35 | 3945 |
| 7 | 3 | 60.4 | 67.9 | 3 / 35 | 3800 |
| 8 | 2 | 62.7 | 73.3 | 7 / 35 | 3977 |
| 9 | 2 | 59.9 | 67.0 | 7 / 35 | 3659 |
| 10 | 2 | 63.3 | 76.5 | 9 / 35 | 3991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 85 | 54% |
| tzu.TheArtOfWar 1.2 | 39 | 23% |
| jwirde.Gort 2.0 | 13 | 38% |
| wompi.Quokka 1.6 | 8 | 38% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 80% |
| stf.PanzerGeneral 0.1 | 2 | 50% |
| disan.Chair 2.2.0 | 1 | 0% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 281 of 350 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 87 | 31% | 130 |
| tzu.TheArtOfWar 1.2 | 79 | 28% | 91 |
| jwirde.Gort 2.0 | 40 | 14% | 44 |
| wompi.Quokka 1.6 | 26 | 9% | 29 |
| stf.PanzerGeneral 0.1 | 18 | 6% | 21 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 16 | 6% | 18 |
| disan.Chair 2.2.0 | 6 | 2% | 7 |
| sample.Crazy 1.0 | 5 | 2% | 6 |
| amk.jointstrike.JointStrike 0.2 | 4 | 1% | 4 |

## Melee bench: F45

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 70.7 | 58 / 350 | 3.64 | 14.6% | 40776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroG18 0.1 | 1.1 | 14.6% | 58 |
| eem.IWillFireNoBullet v2.8 | 2.1 | 13.6% | 191 |
| jje.BagPuss 1.2 | 3.4 | 12.2% | 21 |
| sul.Lunar 1.1 | 4.2 | 11.3% | 36 |
| myl.nano.Graviton 1.10 | 4.5 | 10.7% | 12 |
| hvilela.HVilela 0.9 | 6.6 | 8.9% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 8.3% | 5 |
| fm.claire 1.7 | 7.4 | 8.3% | 1 |
| wit.Deep7 2.0 | 9.1 | 6.8% | 23 |
| abud.ThirdRobo 1.0 | 9.9 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 74.3 | 7 / 35 | 4181 |
| 2 | 1 | 62.2 | 73.0 | 7 / 35 | 4074 |
| 3 | 1 | 63.1 | 74.9 | 9 / 35 | 4273 |
| 4 | 1 | 61.6 | 72.1 | 2 / 35 | 4240 |
| 5 | 1 | 63.2 | 76.5 | 5 / 35 | 4198 |
| 6 | 1 | 62.6 | 72.4 | 9 / 35 | 4249 |
| 7 | 2 | 60.2 | 67.9 | 3 / 35 | 3879 |
| 8 | 1 | 58.5 | 63.8 | 5 / 35 | 3799 |
| 9 | 1 | 59.1 | 63.8 | 5 / 35 | 3922 |
| 10 | 1 | 60.3 | 67.9 | 6 / 35 | 3961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 33% |
| sul.Lunar 1.1 | 22 | 41% |
| jje.BagPuss 1.2 | 12 | 42% |
| myl.nano.Graviton 1.10 | 11 | 36% |
| wit.Deep7 2.0 | 7 | 14% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 80% |
| abud.ThirdRobo 1.0 | 2 | 50% |
| fm.claire 1.7 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 1229. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 69 | 24% | 0 |
| jje.BagPuss 1.2 | 52 | 18% | 88 |
| sul.Lunar 1.1 | 51 | 17% | 83 |
| myl.nano.Graviton 1.10 | 46 | 16% | 70 |
| hvilela.HVilela 0.9 | 24 | 8% | 33 |
| fm.claire 1.7 | 20 | 7% | 24 |
| wit.Deep7 2.0 | 16 | 5% | 21 |
| pez.mini.ChironexFleckeri 0.5 | 12 | 4% | 21 |
| abud.ThirdRobo 1.0 | 2 | 1% | 8 |

## Melee bench: F46

hadur117.nano.SanaroG18 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 70.8 | 37 / 350 | 3.63 | 13.0% | 30432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.0% | 146 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.1% | 137 |
| hadur117.nano.SanaroG18 0.1 | 3.0 | 13.0% | 37 |
| cx.Princess 1.0 | 4.7 | 10.3% | 21 |
| mz.MicroSheep 1.0 | 4.8 | 10.2% | 7 |
| sadoner.killer 0.2 | 5.6 | 9.4% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.1 | 6.1% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 68.3 | 2 / 35 | 2960 |
| 2 | 3 | 60.1 | 71.1 | 5 / 35 | 2996 |
| 3 | 3 | 60.6 | 72.7 | 4 / 35 | 3204 |
| 4 | 3 | 60.3 | 73.7 | 3 / 35 | 3109 |
| 5 | 3 | 61.2 | 71.7 | 6 / 35 | 3216 |
| 6 | 3 | 57.9 | 67.6 | 1 / 35 | 2696 |
| 7 | 3 | 61.2 | 72.4 | 7 / 35 | 3370 |
| 8 | 3 | 59.4 | 73.0 | 2 / 35 | 2743 |
| 9 | 3 | 58.2 | 65.7 | 3 / 35 | 3156 |
| 10 | 3 | 59.6 | 71.7 | 4 / 35 | 2982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 90 | 24% |
| rsalesc.melee.Medina 0.4.5 | 38 | 29% |
| cx.Princess 1.0 | 7 | 29% |
| mz.MicroSheep 1.0 | 4 | 50% |

Hadur died in 313 of 350 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 140 | 45% | 160 |
| rsalesc.melee.Medina 0.4.5 | 80 | 26% | 93 |
| mz.MicroSheep 1.0 | 28 | 9% | 31 |
| cx.Princess 1.0 | 19 | 6% | 19 |
| sadoner.killer 0.2 | 18 | 6% | 18 |
| arthord.NanoSatanMelee Beta | 15 | 5% | 16 |
| jeremyreeder.collective.Prophet 5 | 10 | 3% | 10 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

