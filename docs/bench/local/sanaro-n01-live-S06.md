# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 71.4 | 21 / 210 | 3.58 | 13.4% | 22097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 139 |
| hadur117.nano.SanaroS06 0.1 | 2.3 | 13.4% | 21 |
| sgp.JollyNinja 3.53 | 3.7 | 11.4% | 22 |
| mz.MicroGodMelee 1 | 4.2 | 11.3% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.3% | 7 |
| lorneswork.Predator 1.0 | 5.5 | 10.7% | 8 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 80.6 | 3 / 35 | 4142 |
| 2 | 2 | 61.9 | 73.7 | 6 / 35 | 3758 |
| 3 | 2 | 58.9 | 67.0 | 2 / 35 | 3601 |
| 4 | 2 | 62.6 | 77.5 | 4 / 35 | 3860 |
| 5 | 4 | 57.4 | 63.8 | 0 / 35 | 3355 |
| 6 | 2 | 58.5 | 65.7 | 6 / 35 | 3381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 77 | 10% |
| sgp.JollyNinja 3.53 | 11 | 36% |
| mz.MicroGodMelee 1 | 8 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 75% |
| lorneswork.Predator 1.0 | 3 | 67% |

Hadur died in 189 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 95 | 50% | 104 |
| sgp.JollyNinja 3.53 | 25 | 13% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 11% | 23 |
| mz.MicroGodMelee 1 | 18 | 10% | 21 |
| lorneswork.Predator 1.0 | 18 | 10% | 19 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 3% | 5 |
| adt.Ar2 1.0 | 5 | 3% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| skm.butterfly 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 64.9 | 37 / 210 | 4.16 | 13.8% | 25824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.7 | 14.6% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 14.7% | 50 |
| hadur117.nano.SanaroS06 0.1 | 2.5 | 13.8% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.6% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.1% | 17 |
| Noran.BitchingElk 0.054 | 7.0 | 8.0% | 14 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.1% | 8 |
| sch.Simone 0.3d | 7.7 | 7.5% | 8 |
| stelo.PatternRobot 1.0 | 8.7 | 6.5% | 4 |
| fullsail.SweetTea 1.1 | 9.7 | 5.2% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 56.5 | 5 / 35 | 4183 |
| 2 | 3 | 60.3 | 67.3 | 5 / 35 | 3985 |
| 3 | 1 | 62.9 | 73.0 | 4 / 35 | 4775 |
| 4 | 3 | 57.8 | 59.0 | 6 / 35 | 4085 |
| 5 | 1 | 64.7 | 76.2 | 11 / 35 | 4811 |
| 6 | 4 | 57.2 | 57.5 | 6 / 35 | 3985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 28 | 32% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 20 | 55% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| Noran.BitchingElk 0.054 | 6 | 50% |
| com.cohesiva.robocode.ManOwaR 1.0 | 4 | 25% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| sch.Simone 0.3d | 3 | 67% |
| stelo.PatternRobot 1.0 | 2 | 50% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 173 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 52 | 30% | 58 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 38 | 22% | 51 |
| lrem.micro.SpikeSoldier 0.4 | 22 | 13% | 26 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 8% | 16 |
| fnc.bandit.Bandit 5.2.0 | 12 | 7% | 12 |
| stelo.PatternRobot 1.0 | 11 | 6% | 13 |
| Noran.BitchingElk 0.054 | 10 | 6% | 15 |
| sch.Simone 0.3d | 10 | 6% | 13 |
| fullsail.SweetTea 1.1 | 5 | 3% | 6 |

## Melee bench: F03

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 78.2 | 56 / 210 | 2.96 | 15.2% | 25723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.3 | 15.6% | 62 |
| hadur117.nano.SanaroS06 0.1 | 2.2 | 15.2% | 56 |
| kawigi.nano.Lib 1.0 | 2.8 | 14.1% | 38 |
| vuen.Cake 2.51 | 3.7 | 13.3% | 43 |
| urdos.URDOS 1.3 | 5.0 | 9.9% | 7 |
| adt.Ar1 2.1 | 6.3 | 7.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.4% | 0 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.5% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.8% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 75.6 | 10 / 35 | 4168 |
| 2 | 1 | 64.7 | 81.6 | 14 / 35 | 4396 |
| 3 | 2 | 62.2 | 74.6 | 7 / 35 | 4395 |
| 4 | 1 | 64.7 | 82.2 | 13 / 35 | 4290 |
| 5 | 3 | 63.1 | 78.1 | 6 / 35 | 4352 |
| 6 | 4 | 62.4 | 77.1 | 6 / 35 | 4122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 46 | 57% |
| vuen.Cake 2.51 | 31 | 35% |
| kawigi.nano.Lib 1.0 | 27 | 48% |
| urdos.URDOS 1.3 | 6 | 33% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 50% |
| adt.Ar1 2.1 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 50% |

Hadur died in 154 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 48 | 31% | 67 |
| kawigi.nano.Lib 1.0 | 42 | 27% | 56 |
| vuen.Cake 2.51 | 27 | 18% | 41 |
| urdos.URDOS 1.3 | 20 | 13% | 23 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 7 | 5% | 8 |
| ghent.ArthurPanzergon 1.0.0 | 4 | 3% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 2% | 3 |
| oa.weak.FlyMk1 0.1 | 2 | 1% | 4 |
| adt.Ar1 2.1 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 69.0 | 2 / 210 | 3.79 | 13.5% | 26088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.0% | 190 |
| apc.LeeroyJenkins2 1.0 | 2.3 | 13.5% | 12 |
| hadur117.nano.SanaroS06 0.1 | 2.7 | 13.5% | 2 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 2 |
| josago.Jorgito 0.16 | 5.3 | 8.8% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.9% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 7.5% | 0 |
| rampancy.Durandal 2.1d | 8.3 | 5.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.7% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 66.0 | 0 / 35 | 3957 |
| 2 | 2 | 64.3 | 74.6 | 1 / 35 | 5081 |
| 3 | 3 | 61.6 | 70.5 | 1 / 35 | 4092 |
| 4 | 3 | 60.9 | 67.6 | 0 / 35 | 4184 |
| 5 | 3 | 61.8 | 69.8 | 0 / 35 | 4337 |
| 6 | 2 | 60.5 | 65.4 | 0 / 35 | 4437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 68 | 0% |
| TNT.TNT 0.99.1 | 3 | 67% |
| apc.LeeroyJenkins2 1.0 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 208 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 123 | 59% | 123 |
| apc.LeeroyJenkins2 1.0 | 40 | 19% | 40 |
| josago.Jorgito 0.16 | 18 | 9% | 18 |
| TNT.TNT 0.99.1 | 9 | 4% | 11 |
| tj.zombie1n 1.0.1 | 7 | 3% | 7 |
| css.Delitioner 0.11 | 5 | 2% | 5 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 64.2 | 21 / 210 | 4.22 | 12.4% | 20001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 15.4% | 48 |
| origin.SleepSiphon 1.7b | 1.7 | 15.1% | 84 |
| hadur117.nano.SanaroS06 0.1 | 3.5 | 12.4% | 21 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 12.0% | 27 |
| mld.Wisdom 1.0 | 4.5 | 11.5% | 11 |
| gg.Wolverine 2.0 | 6.0 | 9.1% | 5 |
| spinnercat.Omen 1.0 | 7.2 | 7.7% | 3 |
| DBall.NUKE 0.1 | 8.2 | 6.9% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.5% | 7 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 66.3 | 2 / 35 | 3264 |
| 2 | 4 | 57.9 | 63.2 | 5 / 35 | 3382 |
| 3 | 3 | 58.1 | 64.1 | 2 / 35 | 3357 |
| 4 | 4 | 58.5 | 64.4 | 5 / 35 | 3391 |
| 5 | 3 | 57.7 | 64.8 | 4 / 35 | 3292 |
| 6 | 3 | 57.6 | 62.5 | 3 / 35 | 3315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 19 | 47% |
| origin.SleepSiphon 1.7b | 17 | 12% |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 22% |
| gg.Wolverine 2.0 | 5 | 80% |
| mld.Wisdom 1.0 | 4 | 25% |
| DBall.NUKE 0.1 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 56 | 30% | 58 |
| origin.SleepSiphon 1.7b | 55 | 29% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 15% | 34 |
| mld.Wisdom 1.0 | 26 | 14% | 27 |
| gg.Wolverine 2.0 | 8 | 4% | 12 |
| spinnercat.Omen 1.0 | 8 | 4% | 9 |
| DBall.NUKE 0.1 | 4 | 2% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 1% | 3 |
| sample.Fire 1.0 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.9 | 43 / 210 | 2.90 | 15.9% | 28303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.2 | 18.0% | 72 |
| rtk.Tachikoma 1.0 | 2.0 | 17.5% | 63 |
| hadur117.nano.SanaroS06 0.1 | 2.8 | 15.9% | 43 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.8% | 14 |
| franzor.Lizt 1.3.1 | 5.0 | 10.8% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.3% | 1 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.7% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| sample.Target 1.0 | 9.3 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 85.7 | 11 / 35 | 4834 |
| 2 | 3 | 66.2 | 78.7 | 8 / 35 | 4783 |
| 3 | 3 | 64.3 | 77.1 | 3 / 35 | 4379 |
| 4 | 3 | 67.3 | 82.9 | 9 / 35 | 4977 |
| 5 | 3 | 66.4 | 76.5 | 8 / 35 | 5112 |
| 6 | 3 | 63.1 | 72.4 | 4 / 35 | 4218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 61 | 51% |
| rsalesc.melee.Monk 0.3.6c | 28 | 11% |
| oog.melee.CapuletDroid 1.1 | 14 | 57% |
| franzor.Lizt 1.3.1 | 4 | 25% |
| exauge.GateKeeper 1.1.121g | 1 | 0% |

Hadur died in 168 of 210 rounds, at a mean tick of 1090. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 76 | 45% | 109 |
| rsalesc.melee.Monk 0.3.6c | 61 | 36% | 64 |
| oog.melee.CapuletDroid 1.1 | 18 | 11% | 26 |
| franzor.Lizt 1.3.1 | 6 | 4% | 1 |
| skm.PateranBotlock2 1.0 | 3 | 2% | 3 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 64.4 | 31 / 210 | 4.20 | 12.6% | 19865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.3 | 15.1% | 72 |
| shrub.Vapour v159 | 2.3 | 13.2% | 44 |
| hadur117.nano.SanaroS06 0.1 | 3.0 | 12.6% | 31 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.2% | 22 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.5% | 26 |
| m3thos.Eva00 1.1 | 6.2 | 8.8% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.4% | 7 |
| SHAM.WOW 1.4 | 8.5 | 6.9% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.8% | 0 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 6.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.6 | 58.1 | 6 / 35 | 2876 |
| 2 | 3 | 58.1 | 65.1 | 5 / 35 | 3631 |
| 3 | 2 | 62.1 | 75.6 | 7 / 35 | 3756 |
| 4 | 3 | 57.7 | 66.0 | 4 / 35 | 3180 |
| 5 | 3 | 57.5 | 63.5 | 6 / 35 | 3342 |
| 6 | 3 | 54.5 | 58.4 | 3 / 35 | 3080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 27 | 33% |
| shrub.Vapour v159 | 16 | 25% |
| Krabb.sliNk.Garm 0.9u | 10 | 60% |
| com.spp.robocode.MostlyHarmless 010 | 9 | 33% |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 75% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| m3thos.Eva00 1.1 | 2 | 50% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 64 | 36% | 76 |
| shrub.Vapour v159 | 41 | 23% | 45 |
| com.spp.robocode.MostlyHarmless 010 | 20 | 11% | 23 |
| Krabb.sliNk.Garm 0.9u | 13 | 7% | 15 |
| zyx.nano.BacillusComma 1.0 | 13 | 7% | 14 |
| m3thos.Eva00 1.1 | 12 | 7% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 4% | 11 |
| SHAM.WOW 1.4 | 5 | 3% | 7 |
| qualidafial.MajorDick 1.0.1 | 5 | 3% | 5 |

## Melee bench: F09

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.8 | 54.5 | 6 / 210 | 5.10 | 10.6% | 17081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.6% | 109 |
| kc.micro.Figment 1.0 | 1.8 | 15.3% | 56 |
| yagami.Tidus 0.11 | 3.2 | 11.8% | 3 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.6% | 15 |
| hadur117.nano.SanaroS06 0.1 | 4.8 | 10.6% | 6 |
| mc2.enemy.Original 0.9 | 5.2 | 10.2% | 17 |
| dft.Calliope 5.6 | 7.0 | 8.3% | 3 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.8% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.7 | 53.0 | 0 / 35 | 3052 |
| 2 | 5 | 53.5 | 53.7 | 2 / 35 | 2860 |
| 3 | 6 | 52.9 | 54.0 | 1 / 35 | 2586 |
| 4 | 6 | 53.8 | 54.6 | 1 / 35 | 2798 |
| 5 | 4 | 54.5 | 55.9 | 1 / 35 | 2875 |
| 6 | 3 | 54.2 | 55.9 | 1 / 35 | 2910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 20 | 20% |
| kc.micro.Figment 1.0 | 15 | 7% |
| mc2.enemy.Original 0.9 | 3 | 0% |
| yagami.Tidus 0.11 | 1 | 100% |
| rdm.Dueler 0.4x | 1 | 0% |

Hadur died in 204 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 60 | 29% | 61 |
| positive.Portia 1.26e | 50 | 25% | 54 |
| yagami.Tidus 0.11 | 29 | 14% | 30 |
| mc2.enemy.Original 0.9 | 29 | 14% | 29 |
| pedersen.Grishnakh 1.0 | 16 | 8% | 16 |
| dft.Calliope 5.6 | 9 | 4% | 10 |
| robar.nano.Assertive_Melee 0.2 | 5 | 2% | 5 |
| step.nanoPri 1.0 | 5 | 2% | 5 |
| rdm.Dueler 0.4x | 1 | 0% | 0 |

## Melee bench: F10

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 72.9 | 46 / 210 | 3.44 | 14.5% | 25293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.2 | 16.0% | 74 |
| hadur117.nano.SanaroS06 0.1 | 1.8 | 14.5% | 46 |
| ne.Chimera 1.2 | 3.5 | 12.9% | 15 |
| ejb.Polaris 1.0.1 | 3.8 | 12.4% | 30 |
| tvv.micro.Antares 1.1.1 | 4.8 | 11.5% | 26 |
| vStar.RAFzilla 2.15 | 5.8 | 10.8% | 14 |
| sam.Samspin 1.0 | 7.5 | 6.3% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.5% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 79.7 | 13 / 35 | 4132 |
| 2 | 2 | 61.7 | 70.2 | 7 / 35 | 4492 |
| 3 | 1 | 61.9 | 71.7 | 8 / 35 | 4360 |
| 4 | 2 | 59.0 | 66.7 | 6 / 35 | 3723 |
| 5 | 2 | 62.0 | 73.3 | 4 / 35 | 4463 |
| 6 | 2 | 62.8 | 75.9 | 8 / 35 | 4123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 32 | 31% |
| ejb.Polaris 1.0.1 | 19 | 68% |
| vStar.RAFzilla 2.15 | 17 | 47% |
| ne.Chimera 1.2 | 13 | 54% |
| tvv.micro.Antares 1.1.1 | 12 | 17% |
| kurios.DOSexe .9b | 5 | 60% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 50 | 30% | 60 |
| ne.Chimera 1.2 | 42 | 25% | 52 |
| ejb.Polaris 1.0.1 | 25 | 15% | 38 |
| tvv.micro.Antares 1.1.1 | 21 | 13% | 20 |
| vStar.RAFzilla 2.15 | 12 | 7% | 20 |
| sam.Samspin 1.0 | 8 | 5% | 9 |
| kurios.DOSexe .9b | 3 | 2% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 2% | 3 |
| donjezza.Muncho 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 60.9 | 15 / 210 | 4.52 | 11.9% | 18993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.9% | 104 |
| cx.mini.Nimrod 0.55 | 2.3 | 13.1% | 30 |
| hadur117.nano.SanaroS06 0.1 | 3.0 | 11.9% | 15 |
| djc.DynaBot 0.1.1 | 4.3 | 10.7% | 12 |
| rdt199.Warlord 0.73 | 5.7 | 9.7% | 13 |
| uji.YellohFellah 1.0 | 5.8 | 9.6% | 19 |
| br2.MobyDickBot 1.6 | 6.0 | 9.1% | 15 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.8% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.2% | 1 |
| stelo.MirrorNano 1.3 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.0 | 59.0 | 3 / 35 | 3236 |
| 2 | 2 | 58.9 | 66.7 | 4 / 35 | 3365 |
| 3 | 2 | 57.0 | 62.2 | 3 / 35 | 3356 |
| 4 | 5 | 54.4 | 55.9 | 1 / 35 | 3022 |
| 5 | 3 | 56.2 | 60.6 | 2 / 35 | 3133 |
| 6 | 3 | 55.9 | 61.0 | 2 / 35 | 2881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 31 | 19% |
| cx.mini.Nimrod 0.55 | 9 | 22% |
| djc.DynaBot 0.1.1 | 8 | 75% |
| uji.YellohFellah 1.0 | 6 | 17% |
| br2.MobyDickBot 1.6 | 2 | 0% |

Hadur died in 195 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 85 | 44% | 89 |
| cx.mini.Nimrod 0.55 | 39 | 20% | 42 |
| rdt199.Warlord 0.73 | 23 | 12% | 23 |
| uji.YellohFellah 1.0 | 12 | 6% | 14 |
| djc.DynaBot 0.1.1 | 11 | 6% | 16 |
| KiraNL.Chupacabra 0.4 | 8 | 4% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 3% | 6 |
| stelo.MirrorNano 1.3 | 6 | 3% | 6 |
| br2.MobyDickBot 1.6 | 5 | 3% | 5 |

## Melee bench: F12

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 65.7 | 35 / 210 | 4.09 | 12.7% | 17875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.8 | 14.3% | 50 |
| darkcanuck.Leon 1.01 | 2.3 | 13.9% | 47 |
| nat.PallasHawk 1.0 | 2.7 | 13.2% | 42 |
| hadur117.nano.SanaroS06 0.1 | 3.5 | 12.7% | 35 |
| brainfade.melee.Genghis 0.36 | 4.7 | 11.5% | 26 |
| jrm.Test0 1.0 | 6.2 | 8.5% | 4 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.3% | 1 |
| jp.Perpy 16.0 | 7.5 | 7.4% | 2 |
| jaybot.bots.Oddball 4.0 | 9.0 | 6.2% | 1 |
| stuff.Vlad 0.1 | 10.0 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.8 | 67.9 | 4 / 35 | 3263 |
| 2 | 5 | 56.3 | 61.9 | 5 / 35 | 2915 |
| 3 | 4 | 57.6 | 63.2 | 7 / 35 | 2940 |
| 4 | 5 | 56.9 | 62.5 | 5 / 35 | 2688 |
| 5 | 3 | 60.3 | 70.2 | 9 / 35 | 3109 |
| 6 | 2 | 58.8 | 68.3 | 5 / 35 | 2960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 22 | 27% |
| nat.PallasHawk 1.0 | 20 | 60% |
| bts.wiki.RipCurl 0.9b | 20 | 50% |
| brainfade.melee.Genghis 0.36 | 8 | 50% |
| jrm.Test0 1.0 | 3 | 33% |
| cs.sheldor.Talon 1.1 | 2 | 50% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 175 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 39 | 22% | 46 |
| bts.wiki.RipCurl 0.9b | 35 | 20% | 44 |
| nat.PallasHawk 1.0 | 30 | 17% | 41 |
| brainfade.melee.Genghis 0.36 | 28 | 16% | 32 |
| jrm.Test0 1.0 | 18 | 10% | 18 |
| cs.sheldor.Talon 1.1 | 12 | 7% | 14 |
| jp.Perpy 16.0 | 8 | 5% | 9 |
| jaybot.bots.Oddball 4.0 | 4 | 2% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 69.5 | 26 / 210 | 3.74 | 12.9% | 19664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.0% | 87 |
| ags.Glacier 0.2.11 | 1.5 | 17.5% | 66 |
| hadur117.nano.SanaroS06 0.1 | 3.5 | 12.9% | 26 |
| shinh.Entangled 0.3 | 3.8 | 12.7% | 17 |
| gh.micro.Gruweltje 0.7 | 4.7 | 12.0% | 13 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.5% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.5 | 71.7 | 4 / 35 | 3339 |
| 2 | 3 | 61.2 | 72.7 | 3 / 35 | 3597 |
| 3 | 3 | 60.6 | 71.1 | 4 / 35 | 3341 |
| 4 | 3 | 59.5 | 65.7 | 5 / 35 | 3338 |
| 5 | 4 | 59.4 | 68.6 | 4 / 35 | 3078 |
| 6 | 4 | 59.1 | 67.3 | 6 / 35 | 2971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 34 | 35% |
| ags.Glacier 0.2.11 | 25 | 20% |
| shinh.Entangled 0.3 | 9 | 67% |
| gh.micro.Gruweltje 0.7 | 4 | 25% |
| stelo.Wang 1.0 | 1 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 62 | 34% | 67 |
| mn.Combat 3.25.0 | 58 | 32% | 70 |
| shinh.Entangled 0.3 | 26 | 14% | 32 |
| gh.micro.Gruweltje 0.7 | 23 | 13% | 25 |
| stelo.Wang 1.0 | 10 | 5% | 10 |
| maribo.FollowFire 1 | 4 | 2% | 4 |
| apc.Colossus2 0.17 | 1 | 1% | 2 |

## Melee bench: F14

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 74.6 | 52 / 210 | 3.29 | 14.5% | 22096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.3% | 80 |
| hadur117.nano.SanaroS06 0.1 | 2.0 | 14.5% | 52 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.6% | 39 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.2% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.9% | 8 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.9% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 6.2 | 9.7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.5% | 16 |
| pa.Improved 1.0 | 9.0 | 5.2% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.0 | 67.3 | 7 / 35 | 3249 |
| 2 | 2 | 63.1 | 77.8 | 8 / 35 | 3895 |
| 3 | 2 | 63.4 | 77.1 | 11 / 35 | 3764 |
| 4 | 2 | 62.2 | 74.6 | 8 / 35 | 3849 |
| 5 | 2 | 63.6 | 77.1 | 11 / 35 | 3907 |
| 6 | 2 | 61.3 | 73.7 | 7 / 35 | 3432 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 61 | 46% |
| catcat20.shape.Theta 0.018 | 22 | 41% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 29% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 57% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 80% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 25% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 75% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 37% | 83 |
| catcat20.shape.Theta 0.018 | 32 | 20% | 43 |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 11% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 9% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 13 | 8% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 8% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 6% | 12 |
| pa.Improved 1.0 | 2 | 1% | 3 |

## Melee bench: F15

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 55.8 | 15 / 210 | 4.98 | 11.5% | 21577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 14.7% | 45 |
| emp.Yngwie 1.11 | 1.8 | 14.8% | 82 |
| mld.DustBunny 3.8 | 2.7 | 13.1% | 17 |
| hadur117.nano.SanaroS06 0.1 | 4.5 | 11.5% | 15 |
| cb.nano.Insomnia 1.0 | 4.5 | 11.6% | 20 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.7% | 27 |
| Grystrion.TrackerWO 1.0 | 7.2 | 7.0% | 1 |
| lambdaxy.TBot 0.1 | 8.0 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.9% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.9 | 58.1 | 3 / 35 | 3447 |
| 2 | 4 | 58.6 | 59.4 | 5 / 35 | 3988 |
| 3 | 6 | 51.2 | 48.6 | 1 / 35 | 2965 |
| 4 | 5 | 54.7 | 55.2 | 0 / 35 | 3295 |
| 5 | 4 | 57.5 | 58.7 | 3 / 35 | 3948 |
| 6 | 4 | 56.1 | 54.9 | 3 / 35 | 3934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 17 | 29% |
| kawigi.micro.Shiz 1.1 | 8 | 13% |
| mld.DustBunny 3.8 | 6 | 67% |
| cb.nano.Insomnia 1.0 | 5 | 60% |
| kawigi.robot.Girl 1.2 | 4 | 25% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 49 | 25% | 55 |
| mld.DustBunny 3.8 | 38 | 19% | 44 |
| kawigi.micro.Shiz 1.1 | 30 | 15% | 31 |
| cb.nano.Insomnia 1.0 | 26 | 13% | 24 |
| kawigi.robot.Girl 1.2 | 25 | 13% | 27 |
| Grystrion.TrackerWO 1.0 | 8 | 4% | 9 |
| lambdaxy.TBot 0.1 | 8 | 4% | 8 |
| divineomega.TrialBot 0.003 | 6 | 3% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 5 | 3% | 5 |

## Melee bench: F16

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 62.9 | 23 / 210 | 4.34 | 13.2% | 25005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.8% | 103 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 15.1% | 17 |
| hadur117.nano.SanaroS06 0.1 | 3.0 | 13.2% | 23 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.4% | 41 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.7% | 4 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.2% | 8 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.7% | 8 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.7% | 5 |
| asd.Cthulhu 1.3 | 9.0 | 5.2% | 1 |
| repositorio.NanoStep 1.0 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.5 | 61.9 | 4 / 35 | 3678 |
| 2 | 2 | 62.4 | 67.9 | 6 / 35 | 4799 |
| 3 | 2 | 62.0 | 69.2 | 7 / 35 | 4445 |
| 4 | 4 | 56.9 | 55.6 | 2 / 35 | 3780 |
| 5 | 4 | 56.9 | 57.5 | 2 / 35 | 3864 |
| 6 | 3 | 60.4 | 65.4 | 2 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 38 | 21% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 53% |
| bvh.fnr.Fenrir 0.36l | 4 | 75% |
| divineomega.DivineBot 1.9.4.5 | 2 | 50% |
| techdude.forest.FlamingForest 1.1 | 2 | 50% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| stelo.IntrinsicVolatility 1.4 | 1 | 0% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 85 | 45% | 93 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 47 | 25% | 52 |
| bvh.fnr.Fenrir 0.36l | 18 | 10% | 20 |
| techdude.forest.FlamingForest 1.1 | 12 | 6% | 13 |
| stelo.IntrinsicVolatility 1.4 | 9 | 5% | 9 |
| tvv.nano.Polaris 1.2 | 7 | 4% | 9 |
| divineomega.DivineBot 1.9.4.5 | 4 | 2% | 5 |
| repositorio.NanoStep 1.0 | 3 | 2% | 5 |
| asd.Cthulhu 1.3 | 3 | 2% | 4 |

## Melee bench: F17

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 62.0 | 30 / 210 | 4.42 | 12.6% | 22690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.7 | 14.3% | 34 |
| cx.BlestPain 1.41 | 2.7 | 13.6% | 56 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.7% | 47 |
| hadur117.nano.SanaroS06 0.1 | 3.7 | 12.6% | 30 |
| nic.Nicator 2.4 | 4.5 | 11.9% | 25 |
| ahf.NanoAndrew .4 | 5.7 | 11.1% | 14 |
| maribo.melee.BMV 0.1 | 7.0 | 8.7% | 3 |
| tex.Longbot 0.4 | 8.3 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.5% | 1 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 65.4 | 8 / 35 | 4180 |
| 2 | 5 | 58.8 | 62.2 | 6 / 35 | 3617 |
| 3 | 6 | 54.4 | 52.4 | 3 / 35 | 3356 |
| 4 | 4 | 59.5 | 64.8 | 4 / 35 | 3945 |
| 5 | 2 | 59.8 | 66.7 | 5 / 35 | 3962 |
| 6 | 4 | 57.5 | 60.3 | 4 / 35 | 3630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 20 | 60% |
| et.Predator 1.8 | 20 | 25% |
| oog.melee.Mercutio 1.0 | 13 | 46% |
| nic.Nicator 2.4 | 8 | 38% |
| ahf.NanoAndrew .4 | 5 | 60% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 40 | 22% | 45 |
| cx.BlestPain 1.41 | 35 | 19% | 44 |
| ahf.NanoAndrew .4 | 31 | 17% | 34 |
| oog.melee.Mercutio 1.0 | 30 | 17% | 37 |
| nic.Nicator 2.4 | 22 | 12% | 26 |
| maribo.melee.BMV 0.1 | 14 | 8% | 15 |
| tex.Longbot 0.4 | 5 | 3% | 5 |
| goblin.Bender 2.4 | 3 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 67.1 | 37 / 210 | 3.96 | 13.4% | 22034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.7 | 13.6% | 49 |
| hadur117.nano.SanaroS06 0.1 | 2.2 | 13.4% | 37 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.2% | 40 |
| ratosh.Nobo 0.21 | 4.2 | 11.4% | 19 |
| uji.DBH 1.1 | 4.2 | 11.1% | 19 |
| spinnercat.Robovirus 2.718 | 6.0 | 10.2% | 12 |
| sigterm.Sigterm 1.0 | 6.7 | 9.2% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.4% | 2 |
| stelo.WangRobot 1.0 | 9.2 | 6.0% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 72.4 | 9 / 35 | 3603 |
| 2 | 2 | 57.4 | 62.9 | 6 / 35 | 3603 |
| 3 | 4 | 58.9 | 64.4 | 7 / 35 | 3702 |
| 4 | 2 | 60.8 | 70.8 | 6 / 35 | 3971 |
| 5 | 1 | 58.8 | 67.9 | 6 / 35 | 3417 |
| 6 | 3 | 58.2 | 64.4 | 3 / 35 | 3738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 22 | 45% |
| agd.Mooserwirt2 2.7 | 21 | 24% |
| spinnercat.Robovirus 2.718 | 10 | 70% |
| uji.DBH 1.1 | 10 | 40% |
| ratosh.Nobo 0.21 | 8 | 50% |
| sigterm.Sigterm 1.0 | 7 | 71% |
| stelo.WangRobot 1.0 | 4 | 25% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 0% |

Hadur died in 174 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 39 | 22% | 48 |
| agd.Mooserwirt2 2.7 | 28 | 16% | 35 |
| uji.DBH 1.1 | 27 | 16% | 29 |
| ratosh.Nobo 0.21 | 26 | 15% | 31 |
| spinnercat.Robovirus 2.718 | 23 | 13% | 28 |
| sigterm.Sigterm 1.0 | 10 | 6% | 14 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 6% | 12 |
| stelo.WangRobot 1.0 | 7 | 4% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 2% | 4 |

## Melee bench: F19

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 76.5 | 51 / 210 | 3.11 | 15.1% | 23738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.7 | 16.2% | 73 |
| davidalves.net.DuelistMiniMelee 1.2 | 1.8 | 16.3% | 58 |
| hadur117.nano.SanaroS06 0.1 | 2.5 | 15.1% | 51 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.9% | 9 |
| erdnis.Rover 0.3 | 5.0 | 10.6% | 5 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.8% | 4 |
| pac.ABC 2.1 | 6.8 | 7.7% | 9 |
| mbh.Mbh 0.1 | 8.2 | 6.9% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.5% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.3 | 79.4 | 8 / 35 | 3678 |
| 2 | 3 | 64.6 | 77.8 | 10 / 35 | 3974 |
| 3 | 1 | 65.7 | 81.3 | 8 / 35 | 4350 |
| 4 | 3 | 61.7 | 69.5 | 6 / 35 | 3710 |
| 5 | 2 | 65.0 | 79.7 | 11 / 35 | 4091 |
| 6 | 3 | 62.7 | 71.4 | 8 / 35 | 3935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 52 | 44% |
| davidalves.net.DuelistMiniMelee 1.2 | 45 | 36% |
| krillr.mini.JointStrike 2.0.0 | 7 | 71% |
| pac.ABC 2.1 | 3 | 33% |
| erdnis.Rover 0.3 | 3 | 100% |
| patson.PatsonTestBot 1.0 | 3 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 64 | 40% | 97 |
| mld.Infinity 2.2 | 43 | 27% | 26 |
| erdnis.Rover 0.3 | 18 | 11% | 25 |
| krillr.mini.JointStrike 2.0.0 | 16 | 10% | 24 |
| patson.PatsonTestBot 1.0 | 8 | 5% | 18 |
| pac.ABC 2.1 | 6 | 4% | 6 |
| mbh.Mbh 0.1 | 4 | 3% | 6 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |

## Melee bench: F20

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 67.9 | 36 / 210 | 3.89 | 13.6% | 22798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.2 | 17.0% | 76 |
| hadur117.nano.SanaroS06 0.1 | 2.2 | 13.6% | 36 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.8% | 13 |
| fwb.Nine 1.0.1 | 4.0 | 11.2% | 23 |
| catcat20.Rabbit 0.001 | 4.7 | 11.1% | 38 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 8.8% | 6 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 8.6% | 5 |
| bayen.nut.Squirrel 1.615 | 7.2 | 8.4% | 10 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 74.0 | 8 / 35 | 4211 |
| 2 | 2 | 59.7 | 68.9 | 6 / 35 | 3508 |
| 3 | 2 | 60.6 | 68.6 | 6 / 35 | 4079 |
| 4 | 3 | 59.7 | 65.7 | 6 / 35 | 3827 |
| 5 | 2 | 59.8 | 68.6 | 4 / 35 | 3634 |
| 6 | 3 | 57.8 | 61.9 | 6 / 35 | 3539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 28 | 46% |
| catcat20.Rabbit 0.001 | 20 | 30% |
| nz.jdc.nano.GridFu 1.0 | 7 | 71% |
| fwb.Nine 1.0.1 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 5 | 40% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| m3thos.mini.Eva01 0.5.5 | 2 | 0% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 67 | 39% | 77 |
| catcat20.Rabbit 0.001 | 25 | 14% | 36 |
| fwb.Nine 1.0.1 | 23 | 13% | 27 |
| nz.jdc.nano.GridFu 1.0 | 22 | 13% | 25 |
| m3thos.mini.Eva01 0.5.5 | 11 | 6% | 11 |
| bayen.nut.Squirrel 1.615 | 10 | 6% | 13 |
| djdjdj.NanoSkunk10 1.0 | 8 | 5% | 12 |
| ntc.ControlledChaos 1.1.4 | 6 | 3% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 2 |

## Melee bench: F21

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 79.2 | 67 / 210 | 2.88 | 16.5% | 28106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.2 | 17.6% | 104 |
| hadur117.nano.SanaroS06 0.1 | 1.8 | 16.5% | 67 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.7% | 13 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 11 |
| eld.Hmm 1.0 | 5.5 | 8.7% | 11 |
| oa.weak.BotherBot 0.1 | 5.5 | 9.1% | 5 |
| fire219.CatBot 1.0 | 7.7 | 6.2% | 0 |
| el.JumpShoot 0.2 | 8.3 | 6.0% | 2 |
| PSW.Relentless 0.1 | 8.8 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 81.6 | 13 / 35 | 4640 |
| 2 | 2 | 66.1 | 80.0 | 8 / 35 | 5024 |
| 3 | 2 | 63.9 | 74.6 | 9 / 35 | 4491 |
| 4 | 1 | 66.9 | 82.5 | 15 / 35 | 4950 |
| 5 | 2 | 64.5 | 78.7 | 12 / 35 | 4235 |
| 6 | 2 | 65.3 | 77.5 | 10 / 35 | 4766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 68 | 46% |
| dummy.mini.Scimitar 1.01 | 24 | 92% |
| eld.Hmm 1.0 | 8 | 63% |
| cf.RiO.RiOx 4.2.1 | 8 | 75% |
| oa.weak.BotherBot 0.1 | 3 | 67% |
| el.JumpShoot 0.2 | 1 | 0% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 1056. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 69 | 48% | 82 |
| dummy.mini.Scimitar 1.01 | 28 | 19% | 63 |
| cf.RiO.RiOx 4.2.1 | 22 | 15% | 23 |
| eld.Hmm 1.0 | 8 | 6% | 16 |
| oa.weak.BotherBot 0.1 | 5 | 3% | 14 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| fire219.CatBot 1.0 | 3 | 2% | 3 |
| el.JumpShoot 0.2 | 2 | 1% | 3 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.8 | 51 / 210 | 3.00 | 15.3% | 23631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.2 | 18.2% | 91 |
| hadur117.nano.SanaroS06 0.1 | 2.3 | 15.3% | 51 |
| cre.Karolos 0.32 | 2.5 | 15.0% | 46 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.0% | 5 |
| sample.Walls 1.0 | 6.0 | 9.1% | 10 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 9.0% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.8 | 8.8% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 8.6% | 1 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.7 | 74.6 | 13 / 35 | 3920 |
| 2 | 3 | 63.7 | 74.6 | 7 / 35 | 4026 |
| 3 | 3 | 63.2 | 76.2 | 4 / 35 | 3846 |
| 4 | 1 | 66.7 | 84.8 | 12 / 35 | 4409 |
| 5 | 2 | 63.1 | 76.5 | 7 / 35 | 3194 |
| 6 | 2 | 65.9 | 80.0 | 8 / 35 | 4236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 57 | 37% |
| cre.Karolos 0.32 | 25 | 28% |
| stelo.AreaTargetingBot 1.1 | 15 | 80% |
| sample.Walls 1.0 | 9 | 56% |
| cw.megas.Blade 0.8 | 3 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |
| stelo.RamTrackSurfer 1.2 | 2 | 50% |

Hadur died in 160 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 67 | 42% | 89 |
| cre.Karolos 0.32 | 57 | 36% | 64 |
| stelo.AreaTargetingBot 1.1 | 13 | 8% | 22 |
| sample.Walls 1.0 | 7 | 4% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 4% | 9 |
| stelo.RamTrackSurfer 1.2 | 5 | 3% | 8 |
| cw.megas.Blade 0.8 | 5 | 3% | 8 |

## Melee bench: F24

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.6 | 57.3 | 25 / 210 | 4.84 | 11.2% | 17437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.2 | 15.0% | 57 |
| florent.XSeries.X2 0.12 | 2.3 | 13.8% | 40 |
| davidalves.Phoenix 0.54 | 3.3 | 13.4% | 50 |
| pedersen.Ugluk 1.1.1 | 3.7 | 12.2% | 17 |
| hadur117.nano.SanaroS06 0.1 | 4.7 | 11.2% | 25 |
| oog.melee.Corsair 1.0 | 5.8 | 9.3% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.4% | 13 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.5% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.1% | 1 |
| evd.X1 0.01 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.7 | 57.8 | 4 / 35 | 2666 |
| 2 | 2 | 59.7 | 67.9 | 9 / 35 | 3349 |
| 3 | 5 | 55.0 | 57.1 | 3 / 35 | 3185 |
| 4 | 5 | 54.8 | 56.8 | 4 / 35 | 2796 |
| 5 | 6 | 51.2 | 51.4 | 2 / 35 | 2584 |
| 6 | 5 | 52.5 | 52.7 | 3 / 35 | 2857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 16 | 31% |
| davidalves.Phoenix 0.54 | 9 | 44% |
| florent.XSeries.X2 0.12 | 9 | 67% |
| pedersen.Ugluk 1.1.1 | 8 | 88% |
| stelo.SoJNanoMelee 1.1 | 3 | 67% |
| oog.melee.Corsair 1.0 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 47 | 25% | 53 |
| florent.XSeries.X2 0.12 | 34 | 18% | 40 |
| pedersen.Ugluk 1.1.1 | 34 | 18% | 36 |
| davidalves.Phoenix 0.54 | 32 | 17% | 35 |
| stelo.SoJNanoMelee 1.1 | 11 | 6% | 13 |
| oog.melee.Corsair 1.0 | 10 | 5% | 15 |
| lunchie.Lunchbox 0.93 | 9 | 5% | 9 |
| as.FrankTheTank 1.3 | 5 | 3% | 5 |
| evd.X1 0.01 | 3 | 2% | 3 |

## Melee bench: F25

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 59.9 | 38 / 210 | 4.61 | 11.9% | 16772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.0 | 14.5% | 49 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.2% | 27 |
| jdw.Hurricane 1.4 | 3.3 | 12.5% | 36 |
| hadur117.nano.SanaroS06 0.1 | 3.8 | 11.9% | 38 |
| gre.svman4.Morfeas 1.4.1 | 4.5 | 11.0% | 20 |
| ds.Oo 2.2 | 6.2 | 9.2% | 16 |
| gjr.Cephalosporin 0.1 | 7.3 | 8.3% | 13 |
| awesomeness.Elite 1.0 | 7.7 | 7.9% | 11 |
| adt.Ar2 1.1 | 8.5 | 7.2% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 66.0 | 8 / 35 | 3050 |
| 2 | 4 | 58.8 | 65.4 | 6 / 35 | 3046 |
| 3 | 4 | 53.8 | 55.6 | 6 / 35 | 2486 |
| 4 | 3 | 55.5 | 59.0 | 6 / 35 | 2789 |
| 5 | 6 | 52.5 | 50.8 | 8 / 35 | 2582 |
| 6 | 4 | 56.3 | 62.5 | 4 / 35 | 2819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 24 | 50% |
| voidious.micro.BlitzBat 1.05 | 18 | 61% |
| jdw.Hurricane 1.4 | 10 | 50% |
| gre.svman4.Morfeas 1.4.1 | 8 | 88% |
| ds.Oo 2.2 | 5 | 20% |
| gjr.Cephalosporin 0.1 | 3 | 33% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 23% | 51 |
| voidious.mini.BrokenSword 2.0.3 | 34 | 20% | 45 |
| ds.Oo 2.2 | 21 | 12% | 24 |
| jdw.Hurricane 1.4 | 20 | 12% | 25 |
| awesomeness.Elite 1.0 | 16 | 9% | 17 |
| adt.Ar2 1.1 | 14 | 8% | 14 |
| gre.svman4.Morfeas 1.4.1 | 12 | 7% | 17 |
| gjr.Cephalosporin 0.1 | 12 | 7% | 13 |
| amk.ChumbaMini 0.2 | 4 | 2% | 4 |

## Melee bench: F26

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 66.4 | 21 / 210 | 4.02 | 12.9% | 22839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.2% | 81 |
| hadur117.nano.SanaroS06 0.1 | 3.0 | 12.9% | 21 |
| shu.nitro.LENIN .T34 | 3.3 | 12.7% | 33 |
| lrem.Spectre 0.4.4 | 4.0 | 12.4% | 26 |
| js.PinBall 1.6 | 4.7 | 11.7% | 22 |
| gh.mini.GrubbmOne 1.0 | 5.2 | 11.2% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.3% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.2% | 3 |
| sample.SpinBot 1.0 | 9.0 | 5.0% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 65.7 | 7 / 35 | 3977 |
| 2 | 4 | 59.4 | 66.7 | 3 / 35 | 3744 |
| 3 | 3 | 59.0 | 66.7 | 2 / 35 | 3684 |
| 4 | 2 | 60.3 | 69.5 | 3 / 35 | 3794 |
| 5 | 4 | 58.0 | 61.3 | 3 / 35 | 3662 |
| 6 | 2 | 60.5 | 68.6 | 3 / 35 | 3978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 28 | 18% |
| shu.nitro.LENIN .T34 | 14 | 21% |
| lrem.Spectre 0.4.4 | 10 | 70% |
| gh.mini.GrubbmOne 1.0 | 8 | 13% |
| js.PinBall 1.6 | 7 | 29% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 67% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 189 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 55 | 29% | 59 |
| gh.mini.GrubbmOne 1.0 | 35 | 19% | 36 |
| shu.nitro.LENIN .T34 | 28 | 15% | 32 |
| js.PinBall 1.6 | 28 | 15% | 31 |
| lrem.Spectre 0.4.4 | 20 | 11% | 25 |
| jaybot.adv.bots.JayBot 2.0 | 10 | 5% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 5% | 11 |
| sample.SpinBot 1.0 | 3 | 2% | 3 |

## Melee bench: F27

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 69.3 | 38 / 210 | 3.76 | 13.2% | 18180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.0 | 16.1% | 93 |
| hadur117.nano.SanaroS06 0.1 | 2.7 | 13.2% | 38 |
| EH.Eagle 1.0.6 | 3.5 | 11.7% | 21 |
| wee.Gem 1.8.4 | 4.2 | 11.2% | 29 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.9% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 5.7 | 9.4% | 5 |
| joe.ADinosaur 1.0 | 7.0 | 8.8% | 2 |
| throxbot.ThroxBot 0.1 | 7.7 | 8.3% | 3 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.2% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 76.2 | 8 / 35 | 2985 |
| 2 | 4 | 57.9 | 63.8 | 7 / 35 | 3013 |
| 3 | 3 | 57.1 | 66.7 | 4 / 35 | 2729 |
| 4 | 2 | 59.3 | 70.5 | 5 / 35 | 3169 |
| 5 | 2 | 59.4 | 69.5 | 8 / 35 | 3152 |
| 6 | 2 | 58.7 | 69.2 | 6 / 35 | 3132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 33 | 33% |
| EH.Eagle 1.0.6 | 14 | 57% |
| wee.Gem 1.8.4 | 10 | 30% |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 88% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 67% |
| throxbot.ThroxBot 0.1 | 5 | 60% |
| joe.ADinosaur 1.0 | 2 | 50% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 71 | 41% | 82 |
| EH.Eagle 1.0.6 | 24 | 14% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 11% | 27 |
| wee.Gem 1.8.4 | 17 | 10% | 21 |
| joe.ADinosaur 1.0 | 12 | 7% | 13 |
| throxbot.ThroxBot 0.1 | 9 | 5% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 9 | 5% | 10 |
| caimano.Furia_Ceca 0.22 | 9 | 5% | 10 |
| cs.Grudge 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 76.7 | 61 / 210 | 3.10 | 15.2% | 21588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.5 | 15.9% | 70 |
| hadur117.nano.SanaroS06 0.1 | 1.5 | 15.2% | 61 |
| uji.Antique 1.0 | 3.5 | 12.2% | 37 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.8% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.8% | 17 |
| ahr.ice.Ice 1.0.2 | 6.2 | 8.7% | 8 |
| amk.ChumbaWumba 0.3 | 7.0 | 8.2% | 7 |
| matt.advanced.Katana 1.0 | 8.0 | 6.8% | 4 |
| stelo.PianistNano 1.2 | 8.8 | 5.9% | 1 |
| stelo.Lifestealer 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 75.2 | 8 / 35 | 3545 |
| 2 | 2 | 62.0 | 72.4 | 12 / 35 | 3693 |
| 3 | 1 | 65.0 | 83.5 | 10 / 35 | 3753 |
| 4 | 2 | 60.8 | 73.0 | 6 / 35 | 3511 |
| 5 | 1 | 65.2 | 82.9 | 15 / 35 | 3748 |
| 6 | 1 | 61.1 | 73.3 | 10 / 35 | 3338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 69 | 42% |
| uji.Antique 1.0 | 24 | 58% |
| qohnil.blot.BlotBot 3.61 | 10 | 60% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| amk.ChumbaWumba 0.3 | 5 | 60% |
| matt.advanced.Katana 1.0 | 3 | 67% |
| ahr.ice.Ice 1.0.2 | 3 | 33% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 53 | 35% | 66 |
| uji.Antique 1.0 | 31 | 21% | 48 |
| pfvicm.Sobieski 7.2.3b | 21 | 14% | 21 |
| qohnil.blot.BlotBot 3.61 | 14 | 9% | 25 |
| amk.ChumbaWumba 0.3 | 11 | 7% | 15 |
| ahr.ice.Ice 1.0.2 | 8 | 5% | 12 |
| stelo.Lifestealer 1.0 | 5 | 3% | 8 |
| matt.advanced.Katana 1.0 | 4 | 3% | 10 |
| stelo.PianistNano 1.2 | 3 | 2% | 4 |

## Melee bench: F29

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 59.8 | 23 / 210 | 4.61 | 12.3% | 20720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.3 | 16.2% | 69 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.3% | 61 |
| myl.micro.Troodon 1.10 | 3.0 | 13.3% | 20 |
| hadur117.nano.SanaroS06 0.1 | 4.2 | 12.3% | 23 |
| jok.PheonixM 0.1.2 | 4.7 | 11.1% | 13 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.7% | 1 |
| DBall.Anarchy 0.1 | 6.7 | 8.5% | 19 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.7% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.6% | 2 |
| jangs.ns51 1.0 | 9.3 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.1 | 53.3 | 0 / 35 | 3222 |
| 2 | 4 | 58.0 | 61.6 | 2 / 35 | 3332 |
| 3 | 4 | 59.7 | 61.3 | 7 / 35 | 3827 |
| 4 | 3 | 61.0 | 67.0 | 5 / 35 | 3735 |
| 5 | 5 | 56.5 | 55.6 | 4 / 35 | 3360 |
| 6 | 4 | 57.7 | 60.3 | 5 / 35 | 3244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 22 | 36% |
| deewiant.Anomaly 0.2 | 17 | 47% |
| myl.micro.Troodon 1.10 | 7 | 29% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| jok.PheonixM 0.1.2 | 2 | 50% |
| DBall.Anarchy 0.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 187 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 35% | 74 |
| zyx.mega.YersiniaPestis 3.1 | 50 | 27% | 58 |
| myl.micro.Troodon 1.10 | 28 | 15% | 30 |
| jok.PheonixM 0.1.2 | 19 | 10% | 20 |
| DBall.Anarchy 0.1 | 10 | 5% | 12 |
| ph.melee.ArcherME 0.3 | 8 | 4% | 9 |
| jangs.ns51 1.0 | 4 | 2% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 3 |

## Melee bench: F30

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.8 | 52.4 | 11 / 210 | 5.28 | 10.2% | 17097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.5 | 14.6% | 58 |
| darkcanuck.B26354 1.06 | 2.3 | 13.9% | 49 |
| oog.melee.Capulet 1.2 | 2.8 | 13.9% | 38 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.2% | 36 |
| hadur117.nano.SanaroS06 0.1 | 5.2 | 10.2% | 11 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.2% | 13 |
| ntc.Opposite 1.5 | 7.2 | 8.0% | 0 |
| tripphippy.Alice 1.1 | 8.2 | 7.3% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 8.5 | 7.1% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.5 | 57.8 | 2 / 35 | 2802 |
| 2 | 5 | 53.7 | 53.7 | 3 / 35 | 2987 |
| 3 | 5 | 53.0 | 52.7 | 2 / 35 | 2870 |
| 4 | 5 | 51.3 | 48.6 | 1 / 35 | 2932 |
| 5 | 6 | 50.6 | 47.0 | 1 / 35 | 2896 |
| 6 | 5 | 53.3 | 54.9 | 2 / 35 | 2610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 10 | 20% |
| catcat20.Matcha 0.006 | 9 | 11% |
| stelo.PastFuture 2.3.2 | 9 | 44% |
| darkcanuck.B26354 1.06 | 8 | 38% |
| intruder.PrairieWolf 2.61 | 3 | 33% |

Hadur died in 200 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 39 | 20% | 40 |
| stelo.PastFuture 2.3.2 | 38 | 19% | 42 |
| oog.melee.Capulet 1.2 | 36 | 18% | 37 |
| darkcanuck.B26354 1.06 | 32 | 16% | 35 |
| intruder.PrairieWolf 2.61 | 23 | 12% | 23 |
| ntc.Opposite 1.5 | 16 | 8% | 16 |
| tripphippy.Alice 1.1 | 9 | 5% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 3% | 6 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.1 | 52.9 | 11 / 210 | 5.24 | 10.4% | 16669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 116 |
| gh.mini.Griezel 0.2 | 2.0 | 13.9% | 49 |
| d414.nano.Quantum 1.0.0 | 3.0 | 12.2% | 9 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.6% | 14 |
| hadur117.nano.SanaroS06 0.1 | 5.2 | 10.4% | 11 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 6 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.3% | 3 |
| fm.mammillarias 1.3 | 8.0 | 6.2% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.6% | 3 |
| tlp.ThreeLeggedPig 1 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.3 | 51.7 | 2 / 35 | 2931 |
| 2 | 5 | 52.5 | 51.7 | 2 / 35 | 2639 |
| 3 | 6 | 50.0 | 47.3 | 2 / 35 | 2469 |
| 4 | 5 | 53.1 | 51.7 | 3 / 35 | 2940 |
| 5 | 5 | 56.8 | 60.3 | 2 / 35 | 2992 |
| 6 | 5 | 52.9 | 54.6 | 0 / 35 | 2698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 12 | 25% |
| gh.mini.Griezel 0.2 | 8 | 38% |
| spinnercat.micro.Tyger 0.1 | 4 | 50% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| d414.nano.Quantum 1.0.0 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 53 | 27% | 55 |
| spinnercat.micro.Tyger 0.1 | 40 | 20% | 41 |
| gh.mini.Griezel 0.2 | 38 | 19% | 42 |
| d414.nano.Quantum 1.0.0 | 27 | 14% | 28 |
| gh.nano.Grofvuil 0.2 | 14 | 7% | 14 |
| timmit.nano.TimDog 0.33 | 11 | 6% | 13 |
| fm.mammillarias 1.3 | 11 | 6% | 11 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 71.9 | 55 / 210 | 3.53 | 14.2% | 21895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.5 | 14.7% | 59 |
| hadur117.nano.SanaroS06 0.1 | 2.0 | 14.2% | 55 |
| apc.botM 3.0 | 3.0 | 12.7% | 36 |
| vjik.UnViolation 1.1 | 3.7 | 11.7% | 28 |
| lxx.ConceptA 0.8 | 5.2 | 10.6% | 5 |
| bayen.UbaMicro 1.4 | 5.7 | 9.5% | 7 |
| panzer.Panzer 0.2 | 7.5 | 7.6% | 3 |
| yk.JahMicro 1.0 | 8.2 | 7.2% | 12 |
| conscience.Electron 1.3g | 8.8 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.5 | 5.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 64.4 | 5 / 35 | 3654 |
| 2 | 2 | 59.5 | 69.8 | 9 / 35 | 3225 |
| 3 | 1 | 60.8 | 71.7 | 11 / 35 | 3600 |
| 4 | 2 | 61.2 | 70.8 | 10 / 35 | 3853 |
| 5 | 2 | 62.7 | 75.9 | 12 / 35 | 3929 |
| 6 | 1 | 62.0 | 78.4 | 8 / 35 | 3634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 42 | 45% |
| apc.botM 3.0 | 17 | 65% |
| lxx.ConceptA 0.8 | 15 | 100% |
| vjik.UnViolation 1.1 | 13 | 23% |
| yk.JahMicro 1.0 | 6 | 33% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| panzer.Panzer 0.2 | 2 | 50% |
| donjezza.Jezza 1.0 | 2 | 0% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 46 | 29% | 62 |
| apc.botM 3.0 | 24 | 15% | 39 |
| vjik.UnViolation 1.1 | 22 | 14% | 30 |
| lxx.ConceptA 0.8 | 22 | 14% | 28 |
| bayen.UbaMicro 1.4 | 14 | 9% | 19 |
| yk.JahMicro 1.0 | 13 | 8% | 12 |
| conscience.Electron 1.3g | 8 | 5% | 10 |
| panzer.Panzer 0.2 | 5 | 3% | 7 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |

## Melee bench: F33

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 64.6 | 26 / 210 | 4.19 | 13.2% | 22908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.7% | 98 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 13.8% | 38 |
| hadur117.nano.SanaroS06 0.1 | 3.0 | 13.2% | 26 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.4% | 17 |
| labg.Cataclysm 2.05 | 4.5 | 11.0% | 20 |
| baal.nano.N 1.42 | 6.5 | 8.6% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.7% | 8 |
| zyx.micro.Ant 1.1 | 8.2 | 5.7% | 0 |
| sanja.First 0.1 | 9.2 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 67.6 | 3 / 35 | 3819 |
| 2 | 2 | 63.2 | 75.2 | 6 / 35 | 3893 |
| 3 | 4 | 58.2 | 60.6 | 3 / 35 | 3604 |
| 4 | 3 | 59.2 | 61.0 | 6 / 35 | 3857 |
| 5 | 3 | 59.6 | 61.0 | 3 / 35 | 4112 |
| 6 | 3 | 58.9 | 61.9 | 5 / 35 | 3623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 32 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 80% |
| gre.svman4.Leonidas 1.3.2 | 6 | 83% |
| labg.Cataclysm 2.05 | 4 | 25% |

Hadur died in 184 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 85 | 46% | 93 |
| gre.svman4.Leonidas 1.3.2 | 31 | 17% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 14% | 39 |
| labg.Cataclysm 2.05 | 17 | 9% | 19 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 6% | 11 |
| baal.nano.N 1.42 | 9 | 5% | 9 |
| zyx.micro.Ant 1.1 | 4 | 2% | 4 |
| sanja.First 0.1 | 1 | 1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 67.5 | 22 / 210 | 3.92 | 13.4% | 23693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 18.1% | 79 |
| stelo.Spread 0.9 | 1.7 | 17.8% | 93 |
| hadur117.nano.SanaroS06 0.1 | 3.0 | 13.4% | 22 |
| jcs.Seth 1.8 | 4.3 | 11.0% | 12 |
| tcf.Reach 3 | 4.7 | 10.7% | 1 |
| cli.Dancer 1.1 | 6.0 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 66.7 | 0 / 35 | 3524 |
| 2 | 3 | 60.3 | 65.1 | 3 / 35 | 3838 |
| 3 | 3 | 62.5 | 72.1 | 5 / 35 | 3960 |
| 4 | 3 | 61.6 | 67.0 | 4 / 35 | 4321 |
| 5 | 3 | 58.8 | 61.6 | 2 / 35 | 3784 |
| 6 | 3 | 63.4 | 72.7 | 8 / 35 | 4266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 39 | 44% |
| kid.Gladiator .7.2 | 31 | 10% |
| jcs.Seth 1.8 | 3 | 67% |

Hadur died in 188 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 82 | 44% | 85 |
| stelo.Spread 0.9 | 68 | 36% | 84 |
| jcs.Seth 1.8 | 13 | 7% | 15 |
| ratosh.Wesco 1.4 | 11 | 6% | 11 |
| tcf.Reach 3 | 10 | 5% | 10 |
| cli.Dancer 1.1 | 3 | 2% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 64.0 | 12 / 210 | 4.24 | 11.8% | 16460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 167 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.3% | 12 |
| rz.HawkOnFire 0.1 | 3.3 | 12.4% | 9 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.7 | 12.0% | 8 |
| hadur117.nano.SanaroS06 0.1 | 4.2 | 11.8% | 12 |
| myl.nano.KomoriNinja 1.1 | 6.2 | 7.4% | 2 |
| wit.Chuliath 1.0 | 7.3 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 66.7 | 0 / 35 | 2757 |
| 2 | 4 | 57.2 | 63.8 | 3 / 35 | 2636 |
| 3 | 4 | 56.7 | 63.5 | 2 / 35 | 2700 |
| 4 | 4 | 58.3 | 65.7 | 2 / 35 | 2993 |
| 5 | 5 | 54.8 | 57.5 | 1 / 35 | 2804 |
| 6 | 5 | 57.7 | 66.7 | 4 / 35 | 2570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 37 | 8% |
| gh.mini.Gruwel 0.9 | 7 | 86% |
| rz.HawkOnFire 0.1 | 3 | 67% |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 50% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 198 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 89 | 45% | 92 |
| rz.HawkOnFire 0.1 | 31 | 16% | 32 |
| gh.mini.Gruwel 0.9 | 29 | 15% | 35 |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 11% | 23 |
| myl.nano.KomoriNinja 1.1 | 12 | 6% | 12 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 4% | 7 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |

## Melee bench: F36

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 63.5 | 48 / 210 | 4.28 | 13.1% | 21444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bzdp.Pansy 2.1 | 2.0 | 13.2% | 31 |
| alpha.RainingFire 1.0 | 2.3 | 13.0% | 39 |
| hadur117.nano.SanaroS06 0.1 | 2.3 | 13.1% | 48 |
| mz.Cork 0.1 | 3.7 | 12.0% | 38 |
| bvh.micro.Freya 0.3 | 5.2 | 10.4% | 17 |
| m3thos.Eva02 0.7.1 | 5.8 | 10.0% | 17 |
| bvh.mini.Fenrir 0.39 | 6.7 | 9.8% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.8% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 2 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.8% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.2 | 64.1 | 6 / 35 | 3530 |
| 2 | 4 | 53.4 | 51.4 | 5 / 35 | 3248 |
| 3 | 3 | 55.1 | 55.6 | 7 / 35 | 3218 |
| 4 | 3 | 59.7 | 66.0 | 9 / 35 | 3598 |
| 5 | 1 | 60.4 | 67.9 | 7 / 35 | 3864 |
| 6 | 1 | 63.5 | 76.2 | 14 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 24 | 71% |
| mz.Cork 0.1 | 15 | 67% |
| bvh.micro.Freya 0.3 | 10 | 70% |
| alpha.RainingFire 1.0 | 10 | 50% |
| bvh.mini.Fenrir 0.39 | 5 | 100% |
| m3thos.Eva02 0.7.1 | 4 | 50% |
| dl.BetterWalls 1.0 | 4 | 50% |
| sample.MyFirstRobot 1.0 | 2 | 0% |

Hadur died in 163 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 44 | 27% | 50 |
| bzdp.Pansy 2.1 | 35 | 21% | 55 |
| bvh.micro.Freya 0.3 | 20 | 12% | 24 |
| mz.Cork 0.1 | 19 | 12% | 25 |
| m3thos.Eva02 0.7.1 | 15 | 9% | 18 |
| bvh.mini.Fenrir 0.39 | 14 | 9% | 17 |
| dl.BetterWalls 1.0 | 7 | 4% | 10 |
| squidM.TentalceMeleeNano 1.1 | 5 | 3% | 7 |
| sample.MyFirstRobot 1.0 | 3 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.6 | 70 / 210 | 2.93 | 15.6% | 26726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS06 0.1 | 1.0 | 15.6% | 70 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.2 | 12.0% | 19 |
| germ.TheMind .2 | 3.2 | 11.3% | 30 |
| EBBU.Sim2 1.02 | 4.0 | 10.6% | 17 |
| agrach.Dalek 1.0 | 5.7 | 9.1% | 16 |
| lmk.ACPFinal 0.1 | 6.8 | 8.8% | 10 |
| mb.Beast 0.1 | 7.3 | 8.4% | 19 |
| stelo.UntouchableNano 1.3 | 7.8 | 8.4% | 17 |
| skm.Ryubot 1.0 | 8.5 | 8.0% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 8.5 | 7.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.7 | 73.7 | 8 / 35 | 4448 |
| 2 | 1 | 61.7 | 75.9 | 12 / 35 | 4204 |
| 3 | 1 | 62.8 | 80.6 | 11 / 35 | 4344 |
| 4 | 1 | 63.5 | 78.7 | 13 / 35 | 4639 |
| 5 | 1 | 63.5 | 80.3 | 13 / 35 | 4624 |
| 6 | 1 | 64.0 | 82.2 | 13 / 35 | 4467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 27 | 48% |
| EBBU.Sim2 1.02 | 21 | 48% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 72% |
| skm.Ryubot 1.0 | 16 | 56% |
| mb.Beast 0.1 | 12 | 50% |
| lmk.ACPFinal 0.1 | 11 | 64% |
| agrach.Dalek 1.0 | 10 | 60% |
| stelo.UntouchableNano 1.3 | 9 | 56% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 143 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 26 | 18% | 34 |
| EBBU.Sim2 1.02 | 24 | 17% | 31 |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 15% | 38 |
| agrach.Dalek 1.0 | 20 | 14% | 31 |
| mb.Beast 0.1 | 11 | 8% | 20 |
| lmk.ACPFinal 0.1 | 11 | 8% | 15 |
| stelo.UntouchableNano 1.3 | 10 | 7% | 16 |
| skm.Ryubot 1.0 | 10 | 7% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 6% | 10 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 60.5 | 20 / 210 | 4.56 | 11.6% | 18138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.4% | 108 |
| bvh.mini.Freya 0.55 | 2.2 | 13.6% | 27 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.7% | 25 |
| hadur117.nano.SanaroS06 0.1 | 4.3 | 11.6% | 20 |
| cs.Wren 1.0 | 4.5 | 11.3% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 11.2% | 10 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.7% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.1% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.6% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.5 | 57.1 | 3 / 35 | 2883 |
| 2 | 4 | 58.2 | 64.4 | 4 / 35 | 3210 |
| 3 | 4 | 56.6 | 62.9 | 5 / 35 | 2943 |
| 4 | 5 | 56.7 | 61.0 | 3 / 35 | 3108 |
| 5 | 4 | 56.4 | 58.1 | 5 / 35 | 3071 |
| 6 | 4 | 55.4 | 59.4 | 0 / 35 | 2923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 28 | 14% |
| bvh.mini.Freya 0.55 | 11 | 55% |
| bts.mega.Gnarly 1.4 | 11 | 55% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 40% |
| cs.Wren 1.0 | 3 | 33% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |
| kdf.KoulDestroyer 1.0 | 1 | 0% |

Hadur died in 190 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 68 | 36% | 73 |
| bvh.mini.Freya 0.55 | 31 | 16% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 12% | 26 |
| cs.Wren 1.0 | 22 | 12% | 24 |
| bts.mega.Gnarly 1.4 | 19 | 10% | 27 |
| kdf.KoulDestroyer 1.0 | 15 | 8% | 16 |
| matt.UnderDark3 2.4.34 | 6 | 3% | 6 |
| bzdp.BoxCar 2.0 | 5 | 3% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 59.6 | 21 / 210 | 4.63 | 11.7% | 19806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.8% | 48 |
| az.Ololobot 0.2.4 | 2.0 | 14.1% | 77 |
| hadur117.nano.SanaroS06 0.1 | 3.3 | 11.7% | 21 |
| catcat20.Lambda 0.024 | 3.7 | 11.4% | 28 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.3% | 17 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.6% | 4 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 9.1% | 11 |
| gimp.GimpBot 0.1 | 7.0 | 8.4% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.3 | 61.0 | 5 / 35 | 3412 |
| 2 | 3 | 56.5 | 60.6 | 3 / 35 | 3214 |
| 3 | 5 | 53.0 | 54.3 | 3 / 35 | 3063 |
| 4 | 2 | 57.8 | 64.8 | 4 / 35 | 3535 |
| 5 | 4 | 51.4 | 52.4 | 2 / 35 | 2917 |
| 6 | 3 | 58.0 | 64.8 | 4 / 35 | 3665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 17 | 59% |
| az.Ololobot 0.2.4 | 17 | 12% |
| catcat20.Lambda 0.024 | 8 | 50% |
| winamp32.micro.MicroMacro 1.0 | 4 | 25% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 67% |
| gimp.GimpBot 0.1 | 2 | 50% |
| apollokidd.ApolloKidd 0.9 | 1 | 0% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 57 | 30% | 68 |
| az.Ololobot 0.2.4 | 35 | 19% | 36 |
| catcat20.Lambda 0.024 | 23 | 12% | 26 |
| apollokidd.ApolloKidd 0.9 | 23 | 12% | 23 |
| winamp32.micro.MicroMacro 1.0 | 15 | 8% | 17 |
| gimp.GimpBot 0.1 | 14 | 7% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 6% | 13 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7 | 4% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 5 |

## Melee bench: F41

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 66.8 | 28 / 210 | 3.99 | 13.0% | 19730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.2% | 111 |
| ary.Swarm 1.1 | 3.0 | 13.4% | 24 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 13.2% | 22 |
| hadur117.nano.SanaroS06 0.1 | 3.5 | 13.0% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 12.6% | 17 |
| shrub.Silver v048 | 6.5 | 8.4% | 2 |
| zyx.nano.Ant 1.1 | 6.7 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 7.8 | 6.4% | 4 |
| stelo.Mirror 1.1 | 9.0 | 5.2% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 71.4 | 5 / 35 | 3330 |
| 2 | 2 | 60.7 | 69.2 | 5 / 35 | 3499 |
| 3 | 4 | 59.4 | 64.8 | 3 / 35 | 3493 |
| 4 | 4 | 59.6 | 65.7 | 5 / 35 | 3436 |
| 5 | 5 | 56.2 | 58.4 | 6 / 35 | 2911 |
| 6 | 3 | 60.8 | 71.4 | 4 / 35 | 3061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 29 | 14% |
| ary.Swarm 1.1 | 14 | 57% |
| lessonz.robocode.Oz 0.5.0 | 9 | 56% |
| simonton.nano.MeleeSeed 1.8 | 6 | 67% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| shrub.Silver v048 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 59 | 32% | 63 |
| ary.Swarm 1.1 | 38 | 21% | 51 |
| simonton.nano.MeleeSeed 1.8 | 28 | 15% | 30 |
| lessonz.robocode.Oz 0.5.0 | 25 | 14% | 30 |
| shrub.Silver v048 | 12 | 7% | 12 |
| zyx.nano.Ant 1.1 | 9 | 5% | 9 |
| stelo.Mirror 1.1 | 5 | 3% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 6 |
| acogdev.alpha 0.2 | 3 | 2% | 3 |

## Melee bench: F42

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 65.3 | 23 / 210 | 4.12 | 12.7% | 21429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.7% | 105 |
| maribo.mini.MiniQuester 0.1 | 2.3 | 14.3% | 29 |
| ara.Shera 0.88 | 3.0 | 13.9% | 42 |
| hadur117.nano.SanaroS06 0.1 | 3.7 | 12.7% | 23 |
| amz.NanoClone 1.41 | 5.5 | 8.5% | 3 |
| maribo.IotaCT 1.1 | 5.8 | 8.0% | 2 |
| dsw.StaticD 1.0 | 6.8 | 7.4% | 5 |
| stelo.MirrorMicro 1.0 | 8.2 | 6.3% | 1 |
| mme.NikeEnhanced 2.0 | 8.8 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.9 | 61.3 | 2 / 35 | 3412 |
| 2 | 3 | 59.3 | 66.3 | 5 / 35 | 3762 |
| 3 | 4 | 58.3 | 64.1 | 6 / 35 | 3411 |
| 4 | 3 | 61.0 | 71.7 | 5 / 35 | 3668 |
| 5 | 4 | 58.1 | 64.1 | 3 / 35 | 3631 |
| 6 | 4 | 57.8 | 64.4 | 2 / 35 | 3545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 35 | 20% |
| maribo.mini.MiniQuester 0.1 | 17 | 65% |
| ara.Shera 0.88 | 9 | 33% |
| maribo.IotaCT 1.1 | 1 | 0% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 63 | 34% | 70 |
| ara.Shera 0.88 | 49 | 26% | 52 |
| maribo.mini.MiniQuester 0.1 | 43 | 23% | 54 |
| maribo.IotaCT 1.1 | 9 | 5% | 9 |
| amz.NanoClone 1.41 | 8 | 4% | 8 |
| stelo.MirrorMicro 1.0 | 5 | 3% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 3% | 5 |
| mme.NikeEnhanced 2.0 | 4 | 2% | 4 |
| dsw.StaticD 1.0 | 2 | 1% | 3 |

## Melee bench: F43

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 59.9 | 7 / 210 | 4.60 | 11.6% | 18989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 172 |
| brainfade.melee.Dusk 0.44 | 2.2 | 13.3% | 19 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.9% | 6 |
| hadur117.nano.SanaroS06 0.1 | 4.0 | 11.6% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.2% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.6% | 0 |
| mz.NanoGod 2.02 | 7.0 | 8.2% | 1 |
| jab.DiamondStealer 5 | 8.0 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 56.8 | 1 / 35 | 3083 |
| 2 | 4 | 58.5 | 61.6 | 1 / 35 | 3109 |
| 3 | 5 | 57.5 | 58.1 | 0 / 35 | 3098 |
| 4 | 5 | 57.1 | 57.1 | 2 / 35 | 3149 |
| 5 | 3 | 58.9 | 61.9 | 2 / 35 | 3164 |
| 6 | 3 | 59.3 | 64.1 | 1 / 35 | 3386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 40 | 8% |
| brainfade.melee.Dusk 0.44 | 6 | 33% |
| dummy.micro.Sparrow 2.5 | 2 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 0% |

Hadur died in 203 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100 | 49% | 103 |
| brainfade.melee.Dusk 0.44 | 37 | 18% | 37 |
| dummy.micro.Sparrow 2.5 | 22 | 11% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 19 | 9% | 20 |
| mz.NanoGod 2.02 | 10 | 5% | 10 |
| Krabb.akim2.Akim2 1.1b | 7 | 3% | 9 |
| cvt.Firsty 1.0 | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |

## Melee bench: F44

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 66.3 | 35 / 210 | 4.03 | 13.5% | 23055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 17.2% | 88 |
| tzu.TheArtOfWar 1.2 | 1.8 | 15.4% | 56 |
| hadur117.nano.SanaroS06 0.1 | 3.2 | 13.5% | 35 |
| wompi.Quokka 1.6 | 4.0 | 11.1% | 10 |
| jwirde.Gort 2.0 | 5.2 | 10.2% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 9.0% | 4 |
| disan.Chair 2.2.0 | 7.2 | 7.4% | 3 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.7% | 0 |
| sample.Crazy 1.0 | 9.0 | 5.4% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 62.9 | 6 / 35 | 3790 |
| 2 | 4 | 56.2 | 57.8 | 5 / 35 | 3247 |
| 3 | 3 | 63.1 | 74.6 | 6 / 35 | 4182 |
| 4 | 3 | 60.6 | 66.3 | 7 / 35 | 3919 |
| 5 | 3 | 62.8 | 71.7 | 6 / 35 | 4247 |
| 6 | 3 | 59.3 | 64.4 | 5 / 35 | 3670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 46% |
| tzu.TheArtOfWar 1.2 | 22 | 36% |
| jwirde.Gort 2.0 | 5 | 40% |
| wompi.Quokka 1.6 | 4 | 75% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 176 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 66 | 38% | 89 |
| tzu.TheArtOfWar 1.2 | 47 | 27% | 52 |
| jwirde.Gort 2.0 | 19 | 11% | 23 |
| wompi.Quokka 1.6 | 16 | 9% | 18 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 4% | 8 |
| amk.jointstrike.JointStrike 0.2 | 6 | 3% | 7 |
| disan.Chair 2.2.0 | 6 | 3% | 5 |
| sample.Crazy 1.0 | 4 | 2% | 4 |
| stf.PanzerGeneral 0.1 | 4 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 63.1 | 20 / 210 | 4.32 | 13.0% | 22611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 1.7 | 13.4% | 118 |
| hadur117.nano.SanaroS06 0.1 | 2.3 | 13.0% | 20 |
| jje.BagPuss 1.2 | 3.2 | 12.3% | 16 |
| sul.Lunar 1.1 | 3.7 | 11.3% | 29 |
| myl.nano.Graviton 1.10 | 4.5 | 10.8% | 8 |
| hvilela.HVilela 0.9 | 6.0 | 10.0% | 2 |
| fm.claire 1.7 | 7.2 | 8.8% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.5% | 8 |
| wit.Deep7 2.0 | 9.0 | 6.5% | 11 |
| abud.ThirdRobo 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 58.8 | 65.4 | 3 / 35 | 3842 |
| 2 | 3 | 57.2 | 59.0 | 5 / 35 | 3570 |
| 3 | 2 | 59.4 | 67.9 | 1 / 35 | 3930 |
| 4 | 3 | 59.4 | 63.8 | 4 / 35 | 4023 |
| 5 | 4 | 56.0 | 56.8 | 3 / 35 | 3755 |
| 6 | 1 | 58.4 | 65.7 | 4 / 35 | 3491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 41 | 24% |
| sul.Lunar 1.1 | 9 | 44% |
| jje.BagPuss 1.2 | 6 | 17% |
| wit.Deep7 2.0 | 5 | 0% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 25% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 38 | 20% | 54 |
| sul.Lunar 1.1 | 36 | 19% | 52 |
| eem.IWillFireNoBullet v2.8 | 35 | 18% | 0 |
| hvilela.HVilela 0.9 | 24 | 13% | 27 |
| myl.nano.Graviton 1.10 | 16 | 8% | 27 |
| wit.Deep7 2.0 | 12 | 6% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 12 | 6% | 13 |
| fm.claire 1.7 | 11 | 6% | 12 |
| abud.ThirdRobo 1.0 | 7 | 4% | 8 |

## Melee bench: F46

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 67.4 | 15 / 210 | 3.93 | 12.4% | 18156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.7% | 107 |
| kc.mini.Mirage 0.2 | 1.5 | 17.7% | 77 |
| hadur117.nano.SanaroS06 0.1 | 3.0 | 12.4% | 15 |
| mz.MicroSheep 1.0 | 4.3 | 10.5% | 3 |
| sadoner.killer 0.2 | 5.3 | 9.6% | 0 |
| cx.Princess 1.0 | 5.3 | 9.7% | 8 |
| arthord.NanoSatanMelee Beta | 7.0 | 8.1% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.5 | 59.0 | 1 / 35 | 2927 |
| 2 | 3 | 61.0 | 73.0 | 2 / 35 | 3377 |
| 3 | 3 | 56.8 | 61.9 | 1 / 35 | 2949 |
| 4 | 3 | 61.3 | 76.2 | 5 / 35 | 3176 |
| 5 | 3 | 56.7 | 63.2 | 2 / 35 | 2682 |
| 6 | 3 | 60.1 | 71.1 | 4 / 35 | 3045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 35 | 26% |
| rsalesc.melee.Medina 0.4.5 | 24 | 25% |
| cx.Princess 1.0 | 2 | 0% |

Hadur died in 196 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 80 | 41% | 90 |
| rsalesc.melee.Medina 0.4.5 | 53 | 27% | 56 |
| cx.Princess 1.0 | 18 | 9% | 18 |
| sadoner.killer 0.2 | 16 | 8% | 16 |
| mz.MicroSheep 1.0 | 10 | 5% | 11 |
| arthord.NanoSatanMelee Beta | 10 | 5% | 10 |
| jeremyreeder.collective.Prophet 5 | 6 | 3% | 6 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

