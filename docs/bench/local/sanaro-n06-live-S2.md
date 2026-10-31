# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 76.6 | 66 / 350 | 3.11 | 14.2% | 36175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 229 |
| hadur117.nano.SanaroS2 0.2 | 2.0 | 14.2% | 66 |
| sgp.JollyNinja 3.53 | 3.4 | 11.9% | 21 |
| mz.MicroGodMelee 1 | 4.3 | 11.4% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.6 | 11.2% | 7 |
| lorneswork.Predator 1.0 | 5.8 | 9.7% | 12 |
| adt.Ar2 1.0 | 6.9 | 7.8% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 77.5 | 9 / 35 | 3561 |
| 2 | 2 | 63.6 | 81.3 | 7 / 35 | 3652 |
| 3 | 2 | 62.4 | 76.8 | 7 / 35 | 3665 |
| 4 | 2 | 62.0 | 76.2 | 3 / 35 | 3838 |
| 5 | 2 | 61.7 | 73.0 | 7 / 35 | 3779 |
| 6 | 2 | 62.7 | 75.6 | 10 / 35 | 3489 |
| 7 | 2 | 62.1 | 75.2 | 7 / 35 | 3788 |
| 8 | 2 | 60.0 | 71.4 | 3 / 35 | 3409 |
| 9 | 2 | 63.0 | 79.4 | 6 / 35 | 3526 |
| 10 | 2 | 62.5 | 79.7 | 7 / 35 | 3468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 136 | 18% |
| sgp.JollyNinja 3.53 | 24 | 71% |
| mz.MicroGodMelee 1 | 16 | 75% |
| lorneswork.Predator 1.0 | 10 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 88% |
| adt.Ar2 1.0 | 1 | 0% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 150 | 53% | 175 |
| sgp.JollyNinja 3.53 | 42 | 15% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 34 | 12% | 40 |
| mz.MicroGodMelee 1 | 21 | 7% | 34 |
| lorneswork.Predator 1.0 | 19 | 7% | 26 |
| adt.Ar2 1.0 | 14 | 5% | 16 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 4 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 63.7 | 51 / 350 | 4.27 | 12.9% | 37165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.4 | 15.0% | 104 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 14.7% | 79 |
| hadur117.nano.SanaroS2 0.2 | 2.9 | 12.9% | 51 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.2% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.1% | 30 |
| sch.Simone 0.3d | 6.6 | 8.4% | 30 |
| Noran.BitchingElk 0.054 | 7.0 | 8.0% | 29 |
| fnc.bandit.Bandit 5.2.0 | 7.6 | 7.8% | 5 |
| stelo.PatternRobot 1.0 | 8.8 | 6.7% | 13 |
| fullsail.SweetTea 1.1 | 9.9 | 5.2% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.5 | 62.9 | 6 / 35 | 3713 |
| 2 | 3 | 57.4 | 63.2 | 3 / 35 | 3760 |
| 3 | 3 | 56.8 | 60.3 | 4 / 35 | 3520 |
| 4 | 3 | 55.4 | 55.6 | 3 / 35 | 3585 |
| 5 | 3 | 57.4 | 61.3 | 6 / 35 | 3474 |
| 6 | 2 | 59.5 | 65.7 | 6 / 35 | 4078 |
| 7 | 3 | 59.7 | 69.2 | 4 / 35 | 3611 |
| 8 | 3 | 59.2 | 66.0 | 5 / 35 | 3862 |
| 9 | 3 | 60.7 | 67.0 | 9 / 35 | 3917 |
| 10 | 3 | 58.4 | 65.4 | 5 / 35 | 3645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 44% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 36 | 31% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 55% |
| sch.Simone 0.3d | 11 | 18% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| Noran.BitchingElk 0.054 | 5 | 40% |
| stelo.PatternRobot 1.0 | 3 | 33% |
| fullsail.SweetTea 1.1 | 2 | 0% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 299 of 350 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 77 | 26% | 93 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 63 | 21% | 77 |
| lrem.micro.SpikeSoldier 0.4 | 40 | 13% | 46 |
| com.cohesiva.robocode.ManOwaR 1.0 | 30 | 10% | 37 |
| sch.Simone 0.3d | 29 | 10% | 31 |
| stelo.PatternRobot 1.0 | 19 | 6% | 19 |
| fnc.bandit.Bandit 5.2.0 | 18 | 6% | 20 |
| fullsail.SweetTea 1.1 | 13 | 4% | 16 |
| Noran.BitchingElk 0.054 | 10 | 3% | 11 |

## Melee bench: F03

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 76.8 | 75 / 350 | 3.09 | 14.7% | 41169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 2.1 | 15.1% | 97 |
| kawigi.nano.Lib 1.0 | 2.1 | 14.9% | 96 |
| hadur117.nano.SanaroS2 0.2 | 2.3 | 14.7% | 75 |
| vuen.Cake 2.51 | 3.5 | 13.2% | 64 |
| urdos.URDOS 1.3 | 5.0 | 10.4% | 13 |
| adt.Ar1 2.1 | 6.5 | 7.6% | 2 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 7.0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.8% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 80.0 | 9 / 35 | 4406 |
| 2 | 3 | 62.7 | 75.6 | 7 / 35 | 4355 |
| 3 | 2 | 64.6 | 81.3 | 10 / 35 | 4592 |
| 4 | 3 | 59.4 | 70.5 | 5 / 35 | 3480 |
| 5 | 2 | 62.3 | 75.9 | 9 / 35 | 4041 |
| 6 | 3 | 61.4 | 74.9 | 8 / 35 | 3810 |
| 7 | 3 | 61.3 | 76.2 | 2 / 35 | 4191 |
| 8 | 3 | 61.4 | 75.9 | 6 / 35 | 3850 |
| 9 | 1 | 62.2 | 75.9 | 9 / 35 | 4086 |
| 10 | 1 | 64.2 | 81.6 | 10 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 60 | 55% |
| kawigi.nano.Lib 1.0 | 56 | 11% |
| vuen.Cake 2.51 | 55 | 42% |
| urdos.URDOS 1.3 | 8 | 63% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 50% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 92 | 33% | 99 |
| radnor.DoctorBob 1.42 | 75 | 27% | 106 |
| vuen.Cake 2.51 | 49 | 18% | 74 |
| urdos.URDOS 1.3 | 33 | 12% | 38 |
| adt.Ar1 2.1 | 9 | 3% | 11 |
| ghent.ArthurPanzergon 1.0.0 | 6 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 5 | 2% | 6 |
| oa.weak.FlyMk1 0.1 | 3 | 1% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 71.9 | 13 / 350 | 3.53 | 13.8% | 41698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.9% | 312 |
| apc.LeeroyJenkins2 1.0 | 2.4 | 14.1% | 15 |
| hadur117.nano.SanaroS2 0.2 | 2.6 | 13.8% | 13 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 5 |
| josago.Jorgito 0.16 | 5.3 | 9.0% | 3 |
| css.Delitioner 0.11 | 6.2 | 7.4% | 2 |
| tj.zombie1n 1.0.1 | 6.7 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 67.6 | 3 / 35 | 3954 |
| 2 | 3 | 61.1 | 69.5 | 0 / 35 | 4069 |
| 3 | 3 | 62.4 | 74.0 | 1 / 35 | 4030 |
| 4 | 2 | 62.4 | 72.7 | 1 / 35 | 4199 |
| 5 | 3 | 62.5 | 71.4 | 3 / 35 | 4366 |
| 6 | 2 | 62.4 | 73.0 | 1 / 35 | 4216 |
| 7 | 2 | 64.6 | 78.4 | 2 / 35 | 4578 |
| 8 | 3 | 61.5 | 68.9 | 2 / 35 | 3971 |
| 9 | 3 | 61.4 | 72.1 | 0 / 35 | 4010 |
| 10 | 2 | 61.9 | 71.1 | 0 / 35 | 4305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 163 | 3% |
| apc.LeeroyJenkins2 1.0 | 5 | 60% |
| TNT.TNT 0.99.1 | 3 | 67% |
| josago.Jorgito 0.16 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 337 of 350 rounds, at a mean tick of 1168. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 217 | 64% | 222 |
| apc.LeeroyJenkins2 1.0 | 48 | 14% | 51 |
| josago.Jorgito 0.16 | 25 | 7% | 27 |
| TNT.TNT 0.99.1 | 16 | 5% | 18 |
| tj.zombie1n 1.0.1 | 12 | 4% | 12 |
| css.Delitioner 0.11 | 11 | 3% | 12 |
| rampancy.Durandal 2.1d | 5 | 1% | 5 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 69.5 | 73 / 350 | 3.75 | 13.5% | 33335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 15.6% | 89 |
| origin.SleepSiphon 1.7b | 1.8 | 15.0% | 98 |
| hadur117.nano.SanaroS2 0.2 | 3.2 | 13.5% | 73 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.4% | 57 |
| mld.Wisdom 1.0 | 4.9 | 10.7% | 10 |
| gg.Wolverine 2.0 | 6.6 | 8.7% | 6 |
| spinnercat.Omen 1.0 | 7.4 | 7.5% | 4 |
| DBall.NUKE 0.1 | 7.9 | 6.8% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.1 | 6.8% | 9 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 67.0 | 6 / 35 | 3345 |
| 2 | 4 | 58.2 | 64.4 | 6 / 35 | 3070 |
| 3 | 3 | 62.8 | 76.8 | 10 / 35 | 3414 |
| 4 | 2 | 61.8 | 73.7 | 10 / 35 | 3391 |
| 5 | 3 | 59.9 | 69.8 | 6 / 35 | 3215 |
| 6 | 4 | 57.2 | 63.8 | 3 / 35 | 3046 |
| 7 | 3 | 60.4 | 69.2 | 7 / 35 | 3489 |
| 8 | 4 | 59.6 | 66.7 | 8 / 35 | 3413 |
| 9 | 3 | 62.6 | 74.0 | 11 / 35 | 3481 |
| 10 | 3 | 60.1 | 69.2 | 6 / 35 | 3471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 45 | 53% |
| origin.SleepSiphon 1.7b | 44 | 48% |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 38% |
| gg.Wolverine 2.0 | 11 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 83% |
| mld.Wisdom 1.0 | 4 | 75% |
| DBall.NUKE 0.1 | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 50% |

Hadur died in 277 of 350 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 97 | 35% | 111 |
| origin.SleepSiphon 1.7b | 61 | 22% | 85 |
| pe.minimelee.SandboxMiniMelee 1.1 | 46 | 17% | 55 |
| mld.Wisdom 1.0 | 38 | 14% | 41 |
| gg.Wolverine 2.0 | 14 | 5% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 3% | 17 |
| spinnercat.Omen 1.0 | 7 | 3% | 8 |
| DBall.NUKE 0.1 | 4 | 1% | 7 |
| sample.Fire 1.0 | 2 | 1% | 3 |

## Melee bench: F07

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.0 | 95 / 350 | 2.53 | 16.6% | 47621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.6 | 17.6% | 103 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.1% | 74 |
| hadur117.nano.SanaroS2 0.2 | 2.4 | 16.6% | 95 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 12.0% | 37 |
| franzor.Lizt 1.3.1 | 4.7 | 11.4% | 41 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.4% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 86.0 | 13 / 35 | 4886 |
| 2 | 3 | 66.7 | 81.0 | 9 / 35 | 4919 |
| 3 | 2 | 66.7 | 81.9 | 9 / 35 | 4714 |
| 4 | 1 | 68.6 | 86.7 | 13 / 35 | 4997 |
| 5 | 3 | 66.1 | 80.0 | 7 / 35 | 4731 |
| 6 | 3 | 66.2 | 80.6 | 8 / 35 | 4702 |
| 7 | 1 | 68.3 | 87.9 | 13 / 35 | 4787 |
| 8 | 3 | 67.0 | 83.5 | 7 / 35 | 4862 |
| 9 | 3 | 65.3 | 79.4 | 7 / 35 | 4162 |
| 10 | 3 | 67.3 | 83.2 | 9 / 35 | 4861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 91 | 51% |
| rsalesc.melee.Monk 0.3.6c | 51 | 22% |
| oog.melee.CapuletDroid 1.1 | 46 | 59% |
| franzor.Lizt 1.3.1 | 20 | 45% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 255 of 350 rounds, at a mean tick of 1436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 120 | 47% | 177 |
| rsalesc.melee.Monk 0.3.6c | 75 | 29% | 96 |
| oog.melee.CapuletDroid 1.1 | 33 | 13% | 56 |
| franzor.Lizt 1.3.1 | 16 | 6% | 1 |
| exauge.GateKeeper 1.1.121g | 6 | 2% | 10 |
| lrem.micro.MoggFanatic 0.2 | 4 | 2% | 6 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 74.4 | 102 / 350 | 3.30 | 14.6% | 34856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.3 | 14.6% | 102 |
| shrub.Vapour v159 | 2.2 | 13.8% | 86 |
| tm.Yuugao 1.0 | 2.7 | 13.8% | 87 |
| Krabb.sliNk.Garm 0.9u | 4.4 | 10.7% | 27 |
| com.spp.robocode.MostlyHarmless 010 | 5.4 | 9.5% | 21 |
| m3thos.Eva00 1.1 | 5.4 | 9.2% | 15 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.0% | 9 |
| SHAM.WOW 1.4 | 8.1 | 7.2% | 3 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.7% | 0 |
| qualidafial.MajorDick 1.0.1 | 9.5 | 6.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 77.8 | 10 / 35 | 3609 |
| 2 | 1 | 61.5 | 74.0 | 8 / 35 | 3629 |
| 3 | 2 | 61.3 | 72.4 | 13 / 35 | 3370 |
| 4 | 1 | 62.4 | 76.2 | 13 / 35 | 3553 |
| 5 | 1 | 62.3 | 76.2 | 12 / 35 | 3452 |
| 6 | 1 | 60.7 | 74.6 | 11 / 35 | 2994 |
| 7 | 2 | 60.3 | 70.8 | 9 / 35 | 3447 |
| 8 | 1 | 62.0 | 76.8 | 10 / 35 | 3612 |
| 9 | 2 | 59.6 | 70.8 | 9 / 35 | 3197 |
| 10 | 1 | 62.0 | 74.9 | 7 / 35 | 3993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 60 | 58% |
| shrub.Vapour v159 | 41 | 34% |
| Krabb.sliNk.Garm 0.9u | 24 | 79% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 58% |
| SHAM.WOW 1.4 | 11 | 73% |
| m3thos.Eva00 1.1 | 9 | 44% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 67% |

Hadur died in 248 of 350 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 81 | 33% | 99 |
| tm.Yuugao 1.0 | 56 | 23% | 91 |
| Krabb.sliNk.Garm 0.9u | 34 | 14% | 41 |
| com.spp.robocode.MostlyHarmless 010 | 21 | 8% | 34 |
| m3thos.Eva00 1.1 | 18 | 7% | 25 |
| zyx.nano.BacillusComma 1.0 | 15 | 6% | 20 |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 5% | 24 |
| SHAM.WOW 1.4 | 6 | 2% | 10 |
| qualidafial.MajorDick 1.0.1 | 5 | 2% | 6 |

## Melee bench: F09

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 59.3 | 35 / 350 | 4.66 | 11.5% | 28456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.6% | 209 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 50 |
| hadur117.nano.SanaroS2 0.2 | 3.5 | 11.5% | 35 |
| yagami.Tidus 0.11 | 4.4 | 10.5% | 3 |
| pedersen.Grishnakh 1.0 | 4.4 | 10.5% | 24 |
| mc2.enemy.Original 0.9 | 5.8 | 9.7% | 25 |
| dft.Calliope 5.6 | 6.9 | 8.1% | 3 |
| step.nanoPri 1.0 | 8.2 | 6.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.2% | 1 |
| rdm.Dueler 0.4x | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.3 | 56.5 | 5 / 35 | 2820 |
| 2 | 3 | 57.4 | 64.1 | 3 / 35 | 2818 |
| 3 | 4 | 55.8 | 58.7 | 4 / 35 | 2707 |
| 4 | 5 | 53.7 | 56.8 | 1 / 35 | 2542 |
| 5 | 3 | 59.8 | 65.4 | 7 / 35 | 3692 |
| 6 | 3 | 55.7 | 59.0 | 3 / 35 | 2723 |
| 7 | 3 | 57.2 | 63.2 | 4 / 35 | 2715 |
| 8 | 3 | 53.6 | 54.0 | 3 / 35 | 2745 |
| 9 | 4 | 53.7 | 54.0 | 0 / 35 | 2924 |
| 10 | 4 | 56.5 | 61.3 | 5 / 35 | 2770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 62 | 18% |
| kc.micro.Figment 1.0 | 20 | 35% |
| mc2.enemy.Original 0.9 | 11 | 82% |
| yagami.Tidus 0.11 | 5 | 100% |
| pedersen.Grishnakh 1.0 | 5 | 60% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 315 of 350 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 99 | 31% | 111 |
| kc.micro.Figment 1.0 | 68 | 22% | 78 |
| yagami.Tidus 0.11 | 45 | 14% | 50 |
| mc2.enemy.Original 0.9 | 43 | 14% | 50 |
| pedersen.Grishnakh 1.0 | 25 | 8% | 25 |
| step.nanoPri 1.0 | 13 | 4% | 13 |
| dft.Calliope 5.6 | 9 | 3% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7 | 2% | 8 |
| rdm.Dueler 0.4x | 6 | 2% | 6 |

## Melee bench: F10

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.9 | 116 / 350 | 2.90 | 15.4% | 40365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.5 | 15.4% | 116 |
| DTF.Kludgy 1.2b | 1.7 | 15.2% | 103 |
| ne.Chimera 1.2 | 2.9 | 13.6% | 42 |
| ejb.Polaris 1.0.1 | 3.9 | 12.9% | 42 |
| tvv.micro.Antares 1.1.1 | 5.1 | 10.8% | 31 |
| vStar.RAFzilla 2.15 | 5.9 | 9.9% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.7 | 6.3% | 1 |
| sam.Samspin 1.0 | 7.8 | 6.2% | 2 |
| kurios.DOSexe .9b | 8.5 | 5.5% | 4 |
| donjezza.Muncho 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 75.2 | 7 / 35 | 3997 |
| 2 | 2 | 62.8 | 75.2 | 9 / 35 | 4171 |
| 3 | 1 | 62.5 | 73.0 | 14 / 35 | 4304 |
| 4 | 2 | 65.8 | 86.3 | 10 / 35 | 4234 |
| 5 | 1 | 64.5 | 82.9 | 15 / 35 | 3716 |
| 6 | 1 | 64.3 | 81.3 | 11 / 35 | 4360 |
| 7 | 2 | 62.7 | 78.7 | 11 / 35 | 3391 |
| 8 | 1 | 65.4 | 83.2 | 13 / 35 | 4443 |
| 9 | 2 | 62.0 | 74.3 | 12 / 35 | 3779 |
| 10 | 1 | 63.7 | 78.7 | 14 / 35 | 3970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 56 | 75% |
| DTF.Kludgy 1.2b | 56 | 43% |
| ne.Chimera 1.2 | 44 | 55% |
| tvv.micro.Antares 1.1.1 | 24 | 29% |
| vStar.RAFzilla 2.15 | 14 | 93% |
| kurios.DOSexe .9b | 5 | 80% |
| sam.Samspin 1.0 | 3 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 0% |

Hadur died in 234 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 70 | 30% | 89 |
| ne.Chimera 1.2 | 68 | 29% | 93 |
| tvv.micro.Antares 1.1.1 | 35 | 15% | 33 |
| ejb.Polaris 1.0.1 | 33 | 14% | 83 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 4% | 10 |
| sam.Samspin 1.0 | 9 | 4% | 12 |
| kurios.DOSexe .9b | 6 | 3% | 10 |
| vStar.RAFzilla 2.15 | 3 | 1% | 17 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 63.4 | 48 / 350 | 4.29 | 12.3% | 30451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.4% | 152 |
| cx.mini.Nimrod 0.55 | 2.2 | 13.6% | 52 |
| hadur117.nano.SanaroS2 0.2 | 3.1 | 12.3% | 48 |
| djc.DynaBot 0.1.1 | 4.3 | 10.8% | 24 |
| br2.MobyDickBot 1.6 | 5.5 | 9.7% | 27 |
| rdt199.Warlord 0.73 | 5.8 | 9.3% | 24 |
| uji.YellohFellah 1.0 | 6.4 | 8.9% | 22 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 63.5 | 2 / 35 | 3307 |
| 2 | 3 | 58.1 | 66.3 | 5 / 35 | 3014 |
| 3 | 3 | 57.0 | 64.1 | 4 / 35 | 2967 |
| 4 | 2 | 58.8 | 68.9 | 4 / 35 | 3195 |
| 5 | 2 | 61.8 | 75.9 | 12 / 35 | 3068 |
| 6 | 3 | 55.5 | 60.6 | 1 / 35 | 3030 |
| 7 | 3 | 57.4 | 61.9 | 5 / 35 | 3016 |
| 8 | 3 | 57.8 | 63.2 | 7 / 35 | 3035 |
| 9 | 5 | 52.8 | 51.4 | 6 / 35 | 2953 |
| 10 | 4 | 54.9 | 58.1 | 2 / 35 | 2866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 33% |
| cx.mini.Nimrod 0.55 | 23 | 22% |
| uji.YellohFellah 1.0 | 13 | 31% |
| djc.DynaBot 0.1.1 | 13 | 77% |
| rdt199.Warlord 0.73 | 10 | 100% |
| br2.MobyDickBot 1.6 | 10 | 20% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 302 of 350 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 117 | 39% | 130 |
| cx.mini.Nimrod 0.55 | 72 | 24% | 77 |
| uji.YellohFellah 1.0 | 21 | 7% | 26 |
| djc.DynaBot 0.1.1 | 20 | 7% | 31 |
| rdt199.Warlord 0.73 | 19 | 6% | 28 |
| br2.MobyDickBot 1.6 | 18 | 6% | 23 |
| KiraNL.Chupacabra 0.4 | 15 | 5% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 4% | 12 |
| stelo.MirrorNano 1.3 | 8 | 3% | 8 |

## Melee bench: F12

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 66.5 | 52 / 350 | 4.01 | 12.5% | 27092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.6 | 14.5% | 78 |
| nat.PallasHawk 1.0 | 2.0 | 14.3% | 106 |
| darkcanuck.Leon 1.01 | 2.7 | 13.3% | 69 |
| hadur117.nano.SanaroS2 0.2 | 3.8 | 12.5% | 52 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 27 |
| cs.sheldor.Talon 1.1 | 6.7 | 7.9% | 3 |
| jrm.Test0 1.0 | 6.8 | 8.4% | 4 |
| jp.Perpy 16.0 | 7.5 | 7.5% | 3 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.8% | 8 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.1 | 63.2 | 5 / 35 | 2473 |
| 2 | 4 | 57.0 | 63.8 | 2 / 35 | 2986 |
| 3 | 4 | 59.0 | 70.8 | 6 / 35 | 2669 |
| 4 | 3 | 59.3 | 72.1 | 6 / 35 | 2703 |
| 5 | 4 | 57.2 | 66.7 | 5 / 35 | 2576 |
| 6 | 3 | 57.1 | 64.8 | 5 / 35 | 2625 |
| 7 | 4 | 58.4 | 66.7 | 5 / 35 | 2991 |
| 8 | 4 | 57.5 | 67.3 | 4 / 35 | 2666 |
| 9 | 4 | 57.3 | 65.4 | 8 / 35 | 2336 |
| 10 | 3 | 58.1 | 64.4 | 6 / 35 | 3067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 50 | 28% |
| darkcanuck.Leon 1.01 | 44 | 25% |
| bts.wiki.RipCurl 0.9b | 34 | 50% |
| brainfade.melee.Genghis 0.36 | 10 | 60% |
| jaybot.bots.Oddball 4.0 | 5 | 0% |
| jrm.Test0 1.0 | 4 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 75 | 25% | 90 |
| bts.wiki.RipCurl 0.9b | 68 | 23% | 82 |
| darkcanuck.Leon 1.01 | 58 | 19% | 70 |
| brainfade.melee.Genghis 0.36 | 29 | 10% | 35 |
| jrm.Test0 1.0 | 26 | 9% | 29 |
| cs.sheldor.Talon 1.1 | 16 | 5% | 16 |
| jaybot.bots.Oddball 4.0 | 13 | 4% | 13 |
| jp.Perpy 16.0 | 12 | 4% | 12 |
| stuff.Vlad 0.1 | 3 | 1% | 3 |

## Melee bench: F13

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 72.8 | 50 / 350 | 3.45 | 13.2% | 31183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 17.1% | 83 |
| mn.Combat 3.25.0 | 1.7 | 17.0% | 158 |
| hadur117.nano.SanaroS2 0.2 | 3.2 | 13.2% | 50 |
| shinh.Entangled 0.3 | 4.1 | 12.2% | 37 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.9% | 20 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 2 |
| stelo.Wang 1.0 | 6.8 | 7.1% | 2 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 70.5 | 6 / 35 | 3216 |
| 2 | 3 | 60.3 | 72.4 | 5 / 35 | 2759 |
| 3 | 3 | 61.5 | 75.2 | 5 / 35 | 3281 |
| 4 | 3 | 60.4 | 74.9 | 3 / 35 | 3130 |
| 5 | 4 | 59.3 | 68.6 | 5 / 35 | 3277 |
| 6 | 4 | 59.1 | 68.3 | 4 / 35 | 3106 |
| 7 | 3 | 58.5 | 68.6 | 3 / 35 | 2892 |
| 8 | 3 | 60.8 | 73.7 | 8 / 35 | 2974 |
| 9 | 3 | 63.2 | 81.9 | 8 / 35 | 3263 |
| 10 | 3 | 60.4 | 74.3 | 3 / 35 | 3285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 72 | 32% |
| ags.Glacier 0.2.11 | 45 | 11% |
| shinh.Entangled 0.3 | 21 | 48% |
| gh.micro.Gruweltje 0.7 | 11 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 98 | 32% | 107 |
| mn.Combat 3.25.0 | 90 | 30% | 110 |
| shinh.Entangled 0.3 | 40 | 13% | 50 |
| gh.micro.Gruweltje 0.7 | 33 | 11% | 44 |
| stelo.Wang 1.0 | 21 | 7% | 21 |
| apc.Colossus2 0.17 | 9 | 3% | 9 |
| maribo.FollowFire 1 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| sample.Tracker 1.0 | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 77.2 | 85 / 350 | 3.05 | 14.4% | 32905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 18.2% | 149 |
| hadur117.nano.SanaroS2 0.2 | 2.1 | 14.4% | 85 |
| catcat20.shape.Theta 0.018 | 2.9 | 12.5% | 70 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.1% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.4 | 10.1% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.7% | 12 |
| Lo_Ian.Gandalf_V4 4.0 | 5.9 | 9.7% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 7.6% | 12 |
| pa.Improved 1.0 | 9.0 | 5.6% | 4 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 76.8 | 8 / 35 | 3494 |
| 2 | 2 | 63.2 | 81.6 | 6 / 35 | 3488 |
| 3 | 2 | 60.8 | 71.4 | 11 / 35 | 3121 |
| 4 | 3 | 60.7 | 71.7 | 7 / 35 | 3222 |
| 5 | 2 | 63.4 | 81.3 | 10 / 35 | 3268 |
| 6 | 2 | 62.0 | 77.8 | 11 / 35 | 2909 |
| 7 | 2 | 62.5 | 77.1 | 8 / 35 | 3603 |
| 8 | 2 | 63.9 | 81.9 | 7 / 35 | 3660 |
| 9 | 2 | 61.6 | 74.9 | 6 / 35 | 3090 |
| 10 | 2 | 62.2 | 77.5 | 11 / 35 | 3050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 101 | 40% |
| catcat20.shape.Theta 0.018 | 42 | 33% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 50% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 50% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 3 | 33% |

Hadur died in 266 of 350 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 120 | 45% | 159 |
| catcat20.shape.Theta 0.018 | 53 | 20% | 70 |
| dmh.robocode.robot.RedDwarf 0.4 | 21 | 8% | 24 |
| sanyi.mikrobi.Roberto 1.0 | 20 | 8% | 28 |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 7% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 6% | 27 |
| Lo_Ian.Gandalf_V4 4.0 | 14 | 5% | 18 |
| pa.Improved 1.0 | 5 | 2% | 7 |

## Melee bench: F15

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 65.7 | 58 / 350 | 4.09 | 13.1% | 36180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 14.9% | 82 |
| emp.Yngwie 1.11 | 2.4 | 13.8% | 100 |
| mld.DustBunny 3.8 | 2.9 | 13.3% | 40 |
| hadur117.nano.SanaroS2 0.2 | 3.4 | 13.1% | 58 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.2% | 25 |
| kawigi.robot.Girl 1.2 | 5.4 | 10.5% | 37 |
| lambdaxy.TBot 0.1 | 7.7 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.8% | 1 |
| divineomega.TrialBot 0.003 | 8.5 | 5.6% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 69.8 | 5 / 35 | 3982 |
| 2 | 3 | 58.5 | 64.4 | 9 / 35 | 3277 |
| 3 | 3 | 58.9 | 66.7 | 3 / 35 | 3672 |
| 4 | 5 | 57.2 | 60.3 | 4 / 35 | 3389 |
| 5 | 3 | 58.3 | 64.4 | 5 / 35 | 3433 |
| 6 | 4 | 60.8 | 69.2 | 6 / 35 | 3750 |
| 7 | 4 | 58.7 | 64.1 | 3 / 35 | 3664 |
| 8 | 5 | 56.3 | 58.4 | 5 / 35 | 3425 |
| 9 | 1 | 64.1 | 78.1 | 11 / 35 | 3983 |
| 10 | 4 | 58.2 | 61.0 | 7 / 35 | 3605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 73% |
| kawigi.micro.Shiz 1.1 | 26 | 35% |
| cb.nano.Insomnia 1.0 | 20 | 60% |
| mld.DustBunny 3.8 | 18 | 6% |
| kawigi.robot.Girl 1.2 | 9 | 67% |
| divineomega.TrialBot 0.003 | 3 | 0% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 69 | 24% | 79 |
| mld.DustBunny 3.8 | 67 | 23% | 74 |
| cb.nano.Insomnia 1.0 | 49 | 17% | 48 |
| emp.Yngwie 1.11 | 48 | 16% | 79 |
| kawigi.robot.Girl 1.2 | 27 | 9% | 34 |
| Grystrion.TrackerWO 1.0 | 13 | 4% | 15 |
| lambdaxy.TBot 0.1 | 9 | 3% | 10 |
| divineomega.TrialBot 0.003 | 8 | 3% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 64.1 | 41 / 350 | 4.23 | 12.8% | 36231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.1% | 157 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 14.8% | 27 |
| hadur117.nano.SanaroS2 0.2 | 3.2 | 12.8% | 41 |
| techdude.forest.FlamingForest 1.1 | 3.9 | 11.5% | 88 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.8% | 22 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.1% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 8.1% | 7 |
| repositorio.NanoStep 1.0 | 8.7 | 5.6% | 2 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.2% | 3 |
| asd.Cthulhu 1.3 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 60.3 | 7 / 35 | 3783 |
| 2 | 4 | 57.9 | 63.5 | 2 / 35 | 3501 |
| 3 | 3 | 61.5 | 71.7 | 6 / 35 | 3692 |
| 4 | 3 | 60.2 | 67.6 | 6 / 35 | 3900 |
| 5 | 3 | 57.2 | 61.3 | 0 / 35 | 3566 |
| 6 | 3 | 58.5 | 61.9 | 4 / 35 | 3660 |
| 7 | 3 | 58.4 | 63.2 | 3 / 35 | 3656 |
| 8 | 3 | 57.5 | 62.5 | 3 / 35 | 3305 |
| 9 | 3 | 59.0 | 63.8 | 6 / 35 | 3627 |
| 10 | 4 | 59.2 | 64.8 | 4 / 35 | 3541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 73 | 22% |
| techdude.forest.FlamingForest 1.1 | 14 | 21% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 100% |
| tvv.nano.Polaris 1.2 | 7 | 0% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 4 | 75% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 1068. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 122 | 39% | 142 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 57 | 18% | 64 |
| bvh.fnr.Fenrir 0.36l | 37 | 12% | 38 |
| techdude.forest.FlamingForest 1.1 | 34 | 11% | 37 |
| tvv.nano.Polaris 1.2 | 24 | 8% | 23 |
| stelo.IntrinsicVolatility 1.4 | 16 | 5% | 19 |
| divineomega.DivineBot 1.9.4.5 | 8 | 3% | 12 |
| asd.Cthulhu 1.3 | 6 | 2% | 7 |
| repositorio.NanoStep 1.0 | 5 | 2% | 8 |

## Melee bench: F17

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 67.8 | 62 / 350 | 3.89 | 13.5% | 37524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.1 | 14.1% | 77 |
| cx.BlestPain 1.41 | 2.7 | 13.2% | 68 |
| hadur117.nano.SanaroS2 0.2 | 2.7 | 13.5% | 62 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.3% | 79 |
| nic.Nicator 2.4 | 5.0 | 11.6% | 32 |
| ahf.NanoAndrew .4 | 5.5 | 11.1% | 28 |
| maribo.melee.BMV 0.1 | 7.0 | 8.9% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 1 |
| tex.Longbot 0.4 | 8.7 | 5.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 70.8 | 6 / 35 | 3869 |
| 2 | 4 | 58.7 | 62.2 | 4 / 35 | 3985 |
| 3 | 1 | 62.2 | 72.4 | 6 / 35 | 4278 |
| 4 | 2 | 60.5 | 70.5 | 6 / 35 | 3549 |
| 5 | 2 | 61.2 | 69.8 | 8 / 35 | 3582 |
| 6 | 2 | 60.4 | 70.2 | 7 / 35 | 3567 |
| 7 | 3 | 60.3 | 66.3 | 5 / 35 | 3956 |
| 8 | 1 | 62.5 | 73.3 | 11 / 35 | 3722 |
| 9 | 3 | 59.4 | 66.3 | 6 / 35 | 3552 |
| 10 | 6 | 55.8 | 56.5 | 3 / 35 | 3464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 43 | 28% |
| oog.melee.Mercutio 1.0 | 33 | 58% |
| cx.BlestPain 1.41 | 31 | 61% |
| nic.Nicator 2.4 | 17 | 35% |
| ahf.NanoAndrew .4 | 13 | 38% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 78 | 27% | 91 |
| cx.BlestPain 1.41 | 48 | 17% | 69 |
| oog.melee.Mercutio 1.0 | 46 | 16% | 64 |
| nic.Nicator 2.4 | 46 | 16% | 51 |
| ahf.NanoAndrew .4 | 38 | 13% | 42 |
| maribo.melee.BMV 0.1 | 18 | 6% | 19 |
| tex.Longbot 0.4 | 9 | 3% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 67.5 | 74 / 350 | 3.93 | 13.3% | 33997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.5 | 14.1% | 85 |
| hadur117.nano.SanaroS2 0.2 | 2.3 | 13.3% | 74 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.5% | 81 |
| uji.DBH 1.1 | 4.0 | 11.7% | 35 |
| ratosh.Nobo 0.21 | 4.7 | 10.8% | 19 |
| spinnercat.Robovirus 2.718 | 5.7 | 10.3% | 14 |
| sigterm.Sigterm 1.0 | 7.2 | 8.9% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.7% | 11 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.7 | 64.8 | 7 / 35 | 3051 |
| 2 | 3 | 56.5 | 60.0 | 5 / 35 | 3523 |
| 3 | 1 | 60.7 | 72.1 | 8 / 35 | 3526 |
| 4 | 3 | 60.3 | 69.2 | 9 / 35 | 3542 |
| 5 | 2 | 60.6 | 68.6 | 14 / 35 | 3423 |
| 6 | 2 | 59.8 | 68.6 | 6 / 35 | 3546 |
| 7 | 3 | 57.9 | 65.1 | 4 / 35 | 3408 |
| 8 | 2 | 58.0 | 64.1 | 6 / 35 | 3400 |
| 9 | 1 | 61.1 | 73.3 | 10 / 35 | 3434 |
| 10 | 3 | 58.6 | 69.2 | 5 / 35 | 3144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 46 | 52% |
| agd.Mooserwirt2 2.7 | 33 | 42% |
| uji.DBH 1.1 | 15 | 40% |
| spinnercat.Robovirus 2.718 | 13 | 85% |
| ratosh.Nobo 0.21 | 11 | 55% |
| sigterm.Sigterm 1.0 | 10 | 80% |
| stelo.WangRobot 1.0 | 7 | 29% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 25% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 73 | 26% | 102 |
| agd.Mooserwirt2 2.7 | 54 | 19% | 70 |
| ratosh.Nobo 0.21 | 42 | 15% | 48 |
| uji.DBH 1.1 | 37 | 13% | 40 |
| spinnercat.Robovirus 2.718 | 23 | 8% | 29 |
| sigterm.Sigterm 1.0 | 18 | 6% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 4% | 14 |
| stelo.WangRobot 1.0 | 12 | 4% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 2% | 9 |

## Melee bench: F19

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.0 | 114 / 350 | 2.71 | 16.0% | 39452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.8 | 16.0% | 114 |
| mld.Infinity 2.2 | 2.1 | 15.7% | 117 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.1 | 15.8% | 73 |
| erdnis.Rover 0.3 | 4.5 | 10.9% | 9 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 11.3% | 14 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.9% | 9 |
| mbh.Mbh 0.1 | 7.4 | 7.5% | 0 |
| pac.ABC 2.1 | 7.5 | 7.1% | 15 |
| pbg.R2D2 1.0 | 8.9 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.1 | 13 / 35 | 4322 |
| 2 | 1 | 66.2 | 82.9 | 14 / 35 | 3920 |
| 3 | 2 | 66.2 | 84.1 | 12 / 35 | 3935 |
| 4 | 3 | 63.1 | 74.6 | 7 / 35 | 3948 |
| 5 | 1 | 66.6 | 86.0 | 17 / 35 | 3697 |
| 6 | 1 | 66.2 | 81.6 | 12 / 35 | 4412 |
| 7 | 2 | 64.2 | 78.1 | 9 / 35 | 3887 |
| 8 | 1 | 65.2 | 79.4 | 10 / 35 | 4303 |
| 9 | 3 | 63.5 | 78.4 | 7 / 35 | 3482 |
| 10 | 3 | 65.0 | 80.3 | 13 / 35 | 3546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 98 | 49% |
| davidalves.net.DuelistMiniMelee 1.2 | 78 | 50% |
| krillr.mini.JointStrike 2.0.0 | 12 | 75% |
| pac.ABC 2.1 | 11 | 27% |
| erdnis.Rover 0.3 | 10 | 70% |
| patson.PatsonTestBot 1.0 | 6 | 50% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 1083. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 96 | 40% | 177 |
| mld.Infinity 2.2 | 77 | 32% | 43 |
| krillr.mini.JointStrike 2.0.0 | 21 | 9% | 34 |
| erdnis.Rover 0.3 | 14 | 6% | 33 |
| pac.ABC 2.1 | 13 | 5% | 17 |
| patson.PatsonTestBot 1.0 | 12 | 5% | 23 |
| mbh.Mbh 0.1 | 4 | 2% | 12 |
| pbg.R2D2 1.0 | 1 | 0% | 9 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 69.6 | 70 / 350 | 3.74 | 13.6% | 34817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.5% | 140 |
| hadur117.nano.SanaroS2 0.2 | 2.2 | 13.6% | 70 |
| fwb.Nine 1.0.1 | 3.4 | 12.2% | 50 |
| nz.jdc.nano.GridFu 1.0 | 4.1 | 11.6% | 20 |
| catcat20.Rabbit 0.001 | 4.3 | 10.9% | 41 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.6% | 11 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 8.3% | 5 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.9% | 13 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.5 | 66.7 | 8 / 35 | 3495 |
| 2 | 2 | 61.2 | 69.2 | 10 / 35 | 3731 |
| 3 | 3 | 59.3 | 69.8 | 6 / 35 | 2992 |
| 4 | 2 | 61.4 | 72.1 | 7 / 35 | 3760 |
| 5 | 3 | 59.1 | 65.1 | 8 / 35 | 3471 |
| 6 | 2 | 58.9 | 65.1 | 9 / 35 | 3350 |
| 7 | 2 | 61.2 | 71.1 | 8 / 35 | 3651 |
| 8 | 2 | 60.9 | 73.0 | 5 / 35 | 3550 |
| 9 | 2 | 58.8 | 70.5 | 3 / 35 | 2960 |
| 10 | 2 | 61.6 | 73.3 | 6 / 35 | 3857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 60 | 40% |
| fwb.Nine 1.0.1 | 25 | 44% |
| catcat20.Rabbit 0.001 | 22 | 68% |
| nz.jdc.nano.GridFu 1.0 | 12 | 67% |
| bayen.nut.Squirrel 1.615 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 6 | 33% |
| m3thos.mini.Eva01 0.5.5 | 4 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |

Hadur died in 281 of 350 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 124 | 44% | 140 |
| fwb.Nine 1.0.1 | 40 | 14% | 40 |
| nz.jdc.nano.GridFu 1.0 | 38 | 14% | 49 |
| catcat20.Rabbit 0.001 | 26 | 9% | 42 |
| bayen.nut.Squirrel 1.615 | 19 | 7% | 30 |
| djdjdj.NanoSkunk10 1.0 | 16 | 6% | 18 |
| ntc.ControlledChaos 1.1.4 | 8 | 3% | 8 |
| m3thos.mini.Eva01 0.5.5 | 7 | 2% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.9 | 103 / 350 | 2.81 | 16.3% | 45060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.0 | 17.6% | 156 |
| hadur117.nano.SanaroS2 0.2 | 2.1 | 16.3% | 103 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 31 |
| cf.RiO.RiOx 4.2.1 | 3.9 | 12.2% | 27 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.6% | 5 |
| eld.Hmm 1.0 | 5.5 | 8.6% | 26 |
| fire219.CatBot 1.0 | 7.2 | 6.5% | 0 |
| el.JumpShoot 0.2 | 8.1 | 6.0% | 4 |
| PSW.Relentless 0.1 | 8.9 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 80.0 | 12 / 35 | 4383 |
| 2 | 2 | 64.7 | 76.2 | 11 / 35 | 4719 |
| 3 | 2 | 67.1 | 82.5 | 15 / 35 | 4907 |
| 4 | 2 | 65.5 | 81.6 | 10 / 35 | 4587 |
| 5 | 2 | 65.7 | 82.5 | 10 / 35 | 4349 |
| 6 | 2 | 65.8 | 82.2 | 9 / 35 | 4567 |
| 7 | 2 | 65.2 | 80.6 | 10 / 35 | 4390 |
| 8 | 3 | 63.9 | 74.9 | 8 / 35 | 4315 |
| 9 | 2 | 66.3 | 80.6 | 11 / 35 | 4494 |
| 10 | 2 | 64.3 | 77.8 | 7 / 35 | 4349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 137 | 45% |
| dummy.mini.Scimitar 1.01 | 24 | 79% |
| eld.Hmm 1.0 | 14 | 57% |
| cf.RiO.RiOx 4.2.1 | 13 | 46% |
| oa.weak.BotherBot 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| arthord.MannyPacquiao Beta | 1 | 0% |

Hadur died in 247 of 350 rounds, at a mean tick of 1159. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 107 | 43% | 150 |
| dummy.mini.Scimitar 1.01 | 54 | 22% | 85 |
| cf.RiO.RiOx 4.2.1 | 49 | 20% | 54 |
| eld.Hmm 1.0 | 13 | 5% | 28 |
| oa.weak.BotherBot 0.1 | 8 | 3% | 16 |
| el.JumpShoot 0.2 | 7 | 3% | 8 |
| fire219.CatBot 1.0 | 4 | 2% | 4 |
| PSW.Relentless 0.1 | 3 | 1% | 3 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

## Melee bench: F23

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 81.8 | 114 / 350 | 2.64 | 16.1% | 39824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.3 | 18.0% | 144 |
| hadur117.nano.SanaroS2 0.2 | 2.1 | 16.1% | 114 |
| cre.Karolos 0.32 | 2.6 | 14.8% | 53 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 11.3% | 24 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.3% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 9.1% | 1 |
| sample.Walls 1.0 | 6.7 | 8.5% | 6 |
| cw.megas.Blade 0.8 | 7.4 | 8.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.0 | 79.4 | 9 / 35 | 3784 |
| 2 | 2 | 65.6 | 82.2 | 11 / 35 | 4114 |
| 3 | 2 | 64.4 | 78.4 | 11 / 35 | 3804 |
| 4 | 2 | 64.6 | 78.1 | 10 / 35 | 3712 |
| 5 | 2 | 66.5 | 83.5 | 10 / 35 | 4121 |
| 6 | 2 | 67.3 | 84.4 | 13 / 35 | 4213 |
| 7 | 2 | 66.5 | 86.0 | 13 / 35 | 3824 |
| 8 | 2 | 67.9 | 84.8 | 15 / 35 | 4310 |
| 9 | 2 | 65.6 | 80.0 | 13 / 35 | 4120 |
| 10 | 2 | 65.7 | 81.0 | 9 / 35 | 3822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 107 | 41% |
| cre.Karolos 0.32 | 50 | 52% |
| stelo.AreaTargetingBot 1.1 | 24 | 63% |
| sample.Walls 1.0 | 15 | 93% |
| stelo.RamTrackSurfer 1.2 | 11 | 64% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 80% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 236 of 350 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 113 | 48% | 167 |
| cre.Karolos 0.32 | 63 | 27% | 85 |
| stelo.AreaTargetingBot 1.1 | 29 | 12% | 37 |
| stelo.RamTrackSurfer 1.2 | 12 | 5% | 30 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 10 | 4% | 14 |
| sample.Walls 1.0 | 6 | 3% | 8 |
| cw.megas.Blade 0.8 | 2 | 1% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 2 |

## Melee bench: F24

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 61.7 | 38 / 350 | 4.45 | 11.5% | 26024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.3 | 15.0% | 89 |
| florent.XSeries.X2 0.12 | 2.6 | 13.7% | 67 |
| davidalves.Phoenix 0.54 | 2.6 | 13.5% | 83 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.2% | 39 |
| hadur117.nano.SanaroS2 0.2 | 4.7 | 11.5% | 38 |
| oog.melee.Corsair 1.0 | 6.3 | 9.4% | 12 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.8% | 20 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 2 |
| as.FrankTheTank 1.3 | 9.1 | 5.2% | 1 |
| evd.X1 0.01 | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.6 | 61.0 | 4 / 35 | 2785 |
| 2 | 3 | 56.1 | 64.1 | 4 / 35 | 2568 |
| 3 | 5 | 55.9 | 61.3 | 3 / 35 | 2730 |
| 4 | 5 | 53.6 | 57.1 | 1 / 35 | 2525 |
| 5 | 4 | 57.7 | 66.7 | 6 / 35 | 2821 |
| 6 | 5 | 56.1 | 63.5 | 6 / 35 | 2372 |
| 7 | 5 | 55.6 | 60.6 | 4 / 35 | 2773 |
| 8 | 5 | 55.2 | 60.0 | 4 / 35 | 2657 |
| 9 | 5 | 55.0 | 60.6 | 2 / 35 | 2447 |
| 10 | 5 | 55.4 | 62.2 | 4 / 35 | 2346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 39% |
| florent.XSeries.X2 0.12 | 22 | 41% |
| davidalves.Phoenix 0.54 | 20 | 40% |
| stelo.SoJNanoMelee 1.1 | 11 | 18% |
| pedersen.Ugluk 1.1.1 | 8 | 38% |
| oog.melee.Corsair 1.0 | 5 | 80% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 66 | 21% | 69 |
| rz.GlowBlowMelee 1.4 | 60 | 19% | 72 |
| florent.XSeries.X2 0.12 | 60 | 19% | 69 |
| pedersen.Ugluk 1.1.1 | 59 | 19% | 62 |
| stelo.SoJNanoMelee 1.1 | 25 | 8% | 28 |
| oog.melee.Corsair 1.0 | 15 | 5% | 20 |
| lunchie.Lunchbox 0.93 | 11 | 4% | 11 |
| evd.X1 0.01 | 9 | 3% | 9 |
| as.FrankTheTank 1.3 | 7 | 2% | 9 |

## Melee bench: F25

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 66.1 | 61 / 350 | 4.05 | 12.8% | 29103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.7% | 91 |
| voidious.micro.BlitzBat 1.05 | 1.6 | 14.6% | 74 |
| hadur117.nano.SanaroS2 0.2 | 3.2 | 12.8% | 61 |
| jdw.Hurricane 1.4 | 4.0 | 11.4% | 44 |
| gre.svman4.Morfeas 1.4.1 | 5.4 | 10.4% | 27 |
| ds.Oo 2.2 | 5.8 | 9.3% | 25 |
| gjr.Cephalosporin 0.1 | 6.6 | 8.6% | 21 |
| awesomeness.Elite 1.0 | 8.1 | 7.3% | 4 |
| adt.Ar2 1.1 | 8.8 | 6.5% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 67.9 | 5 / 35 | 3385 |
| 2 | 3 | 61.1 | 73.3 | 10 / 35 | 2874 |
| 3 | 3 | 60.5 | 70.8 | 7 / 35 | 3204 |
| 4 | 3 | 57.1 | 64.4 | 6 / 35 | 2723 |
| 5 | 3 | 57.5 | 65.4 | 7 / 35 | 2654 |
| 6 | 4 | 57.9 | 64.4 | 4 / 35 | 3092 |
| 7 | 3 | 56.4 | 60.6 | 3 / 35 | 2788 |
| 8 | 2 | 59.6 | 69.2 | 9 / 35 | 3041 |
| 9 | 4 | 56.0 | 60.3 | 6 / 35 | 2568 |
| 10 | 4 | 57.0 | 64.1 | 4 / 35 | 2774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 44 | 27% |
| voidious.micro.BlitzBat 1.05 | 39 | 38% |
| jdw.Hurricane 1.4 | 17 | 71% |
| gjr.Cephalosporin 0.1 | 14 | 71% |
| gre.svman4.Morfeas 1.4.1 | 7 | 57% |
| ds.Oo 2.2 | 7 | 57% |
| adt.Ar2 1.1 | 4 | 50% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 290 of 350 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 79 | 27% | 92 |
| voidious.micro.BlitzBat 1.05 | 77 | 27% | 92 |
| jdw.Hurricane 1.4 | 44 | 15% | 53 |
| gre.svman4.Morfeas 1.4.1 | 25 | 9% | 31 |
| ds.Oo 2.2 | 21 | 7% | 26 |
| gjr.Cephalosporin 0.1 | 17 | 6% | 26 |
| adt.Ar2 1.1 | 11 | 4% | 13 |
| amk.ChumbaMini 0.2 | 8 | 3% | 9 |
| awesomeness.Elite 1.0 | 8 | 3% | 8 |

## Melee bench: F26

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 69.0 | 52 / 350 | 3.79 | 13.1% | 35560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.7% | 138 |
| hadur117.nano.SanaroS2 0.2 | 2.9 | 13.1% | 52 |
| shu.nitro.LENIN .T34 | 3.0 | 12.9% | 62 |
| lrem.Spectre 0.4.4 | 3.5 | 12.7% | 45 |
| gh.mini.GrubbmOne 1.0 | 5.2 | 11.1% | 19 |
| js.PinBall 1.6 | 5.5 | 10.9% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 8.9% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.9% | 9 |
| sample.SpinBot 1.0 | 8.9 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 73.0 | 7 / 35 | 3712 |
| 2 | 4 | 58.6 | 64.4 | 6 / 35 | 3355 |
| 3 | 3 | 61.3 | 72.4 | 5 / 35 | 3572 |
| 4 | 2 | 61.3 | 71.4 | 4 / 35 | 3623 |
| 5 | 4 | 57.5 | 61.0 | 3 / 35 | 3672 |
| 6 | 2 | 61.3 | 74.9 | 5 / 35 | 3481 |
| 7 | 3 | 59.7 | 67.3 | 6 / 35 | 3708 |
| 8 | 3 | 59.2 | 67.3 | 1 / 35 | 3768 |
| 9 | 3 | 60.4 | 68.6 | 8 / 35 | 3314 |
| 10 | 3 | 60.2 | 69.2 | 7 / 35 | 3355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 53 | 32% |
| lrem.Spectre 0.4.4 | 29 | 55% |
| shu.nitro.LENIN .T34 | 23 | 22% |
| gh.mini.GrubbmOne 1.0 | 12 | 17% |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 67% |
| js.PinBall 1.6 | 5 | 40% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 86 | 29% | 105 |
| lrem.Spectre 0.4.4 | 50 | 17% | 57 |
| gh.mini.GrubbmOne 1.0 | 50 | 17% | 52 |
| shu.nitro.LENIN .T34 | 48 | 16% | 58 |
| js.PinBall 1.6 | 23 | 8% | 26 |
| jaybot.adv.bots.JayBot 2.0 | 16 | 5% | 20 |
| sample.SpinBot 1.0 | 13 | 4% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 12 | 4% | 18 |

## Melee bench: F27

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 74.3 | 124 / 350 | 3.31 | 14.3% | 29491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.8 | 14.3% | 124 |
| mk.Alpha 0.2.1 | 2.1 | 14.4% | 98 |
| wee.Gem 1.8.4 | 3.7 | 12.1% | 53 |
| sheldor.melee.nano.TestMelee 0.1 | 3.8 | 11.8% | 32 |
| EH.Eagle 1.0.6 | 4.2 | 11.6% | 18 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.7% | 10 |
| throxbot.ThroxBot 0.1 | 7.4 | 7.9% | 9 |
| joe.ADinosaur 1.0 | 7.4 | 7.9% | 4 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.7% | 3 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 76.8 | 13 / 35 | 2773 |
| 2 | 1 | 62.4 | 76.2 | 14 / 35 | 3196 |
| 3 | 2 | 63.8 | 79.0 | 17 / 35 | 3180 |
| 4 | 1 | 60.5 | 71.4 | 12 / 35 | 3050 |
| 5 | 2 | 61.1 | 68.6 | 14 / 35 | 3677 |
| 6 | 2 | 59.2 | 70.2 | 10 / 35 | 2633 |
| 7 | 1 | 62.5 | 81.6 | 11 / 35 | 2824 |
| 8 | 2 | 61.6 | 76.5 | 12 / 35 | 2658 |
| 9 | 2 | 60.7 | 73.0 | 12 / 35 | 2887 |
| 10 | 3 | 58.3 | 69.5 | 9 / 35 | 2613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 76 | 63% |
| wee.Gem 1.8.4 | 44 | 68% |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 75% |
| EH.Eagle 1.0.6 | 23 | 87% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 56% |
| throxbot.ThroxBot 0.1 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 226 of 350 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 68 | 30% | 114 |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 17% | 54 |
| wee.Gem 1.8.4 | 34 | 15% | 65 |
| techdude.kombat.FlamingKombat 1.5 | 19 | 8% | 22 |
| EH.Eagle 1.0.6 | 16 | 7% | 40 |
| joe.ADinosaur 1.0 | 16 | 7% | 17 |
| throxbot.ThroxBot 0.1 | 15 | 7% | 17 |
| caimano.Furia_Ceca 0.22 | 15 | 7% | 16 |
| cs.Grudge 1.0 | 5 | 2% | 5 |

## Melee bench: F28

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 78.2 | 107 / 350 | 2.96 | 15.3% | 34182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.0 | 16.9% | 138 |
| hadur117.nano.SanaroS2 0.2 | 2.0 | 15.3% | 107 |
| uji.Antique 1.0 | 3.3 | 12.4% | 51 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.6% | 25 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.8% | 15 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.3% | 5 |
| ahr.ice.Ice 1.0.2 | 6.6 | 7.9% | 6 |
| matt.advanced.Katana 1.0 | 8.1 | 6.6% | 2 |
| stelo.PianistNano 1.2 | 9.1 | 5.9% | 1 |
| stelo.Lifestealer 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 79.0 | 13 / 35 | 3269 |
| 2 | 2 | 64.1 | 80.3 | 11 / 35 | 3809 |
| 3 | 2 | 62.3 | 77.5 | 8 / 35 | 3212 |
| 4 | 2 | 63.2 | 77.8 | 10 / 35 | 3749 |
| 5 | 2 | 63.3 | 78.4 | 12 / 35 | 3455 |
| 6 | 2 | 62.8 | 80.3 | 8 / 35 | 3232 |
| 7 | 2 | 62.0 | 76.5 | 9 / 35 | 3191 |
| 8 | 2 | 62.3 | 76.2 | 12 / 35 | 3265 |
| 9 | 2 | 61.9 | 74.9 | 9 / 35 | 3403 |
| 10 | 2 | 64.7 | 81.3 | 15 / 35 | 3597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 119 | 41% |
| uji.Antique 1.0 | 43 | 63% |
| qohnil.blot.BlotBot 3.61 | 25 | 56% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| ahr.ice.Ice 1.0.2 | 6 | 67% |
| amk.ChumbaWumba 0.3 | 4 | 75% |
| stelo.PianistNano 1.2 | 3 | 67% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 244 of 350 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 113 | 46% | 145 |
| pfvicm.Sobieski 7.2.3b | 37 | 15% | 44 |
| uji.Antique 1.0 | 31 | 13% | 66 |
| qohnil.blot.BlotBot 3.61 | 23 | 9% | 38 |
| amk.ChumbaWumba 0.3 | 15 | 6% | 18 |
| ahr.ice.Ice 1.0.2 | 10 | 4% | 14 |
| stelo.PianistNano 1.2 | 6 | 2% | 8 |
| matt.advanced.Katana 1.0 | 5 | 2% | 11 |
| stelo.Lifestealer 1.0 | 4 | 2% | 6 |

## Melee bench: F29

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 66.9 | 51 / 350 | 3.98 | 13.2% | 32896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.3 | 16.0% | 114 |
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 15.3% | 98 |
| hadur117.nano.SanaroS2 0.2 | 3.5 | 13.2% | 51 |
| myl.micro.Troodon 1.10 | 3.9 | 12.4% | 26 |
| jok.PheonixM 0.1.2 | 4.9 | 10.9% | 19 |
| DBall.Anarchy 0.1 | 6.3 | 8.9% | 34 |
| ph.melee.ArcherME 0.3 | 6.4 | 8.5% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.7% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.6% | 0 |
| ap.Frederick 1.1 | 9.6 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.7 | 67.3 | 5 / 35 | 3329 |
| 2 | 4 | 57.1 | 60.3 | 3 / 35 | 3079 |
| 3 | 3 | 61.1 | 69.8 | 8 / 35 | 3237 |
| 4 | 3 | 62.6 | 73.7 | 7 / 35 | 3500 |
| 5 | 4 | 58.3 | 61.6 | 3 / 35 | 3364 |
| 6 | 4 | 59.9 | 68.6 | 4 / 35 | 3182 |
| 7 | 4 | 57.6 | 63.5 | 5 / 35 | 2984 |
| 8 | 3 | 58.8 | 65.4 | 5 / 35 | 3047 |
| 9 | 3 | 62.9 | 75.2 | 7 / 35 | 3609 |
| 10 | 3 | 59.3 | 63.8 | 4 / 35 | 3565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 63 | 10% |
| zyx.mega.YersiniaPestis 3.1 | 40 | 53% |
| DBall.Anarchy 0.1 | 17 | 53% |
| myl.micro.Troodon 1.10 | 15 | 47% |
| jok.PheonixM 0.1.2 | 10 | 60% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 1047. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 122 | 41% | 129 |
| zyx.mega.YersiniaPestis 3.1 | 57 | 19% | 78 |
| myl.micro.Troodon 1.10 | 49 | 16% | 55 |
| jok.PheonixM 0.1.2 | 35 | 12% | 41 |
| DBall.Anarchy 0.1 | 15 | 5% | 26 |
| ph.melee.ArcherME 0.3 | 11 | 4% | 11 |
| jangs.ns51 1.0 | 5 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 2% | 5 |

## Melee bench: F30

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.3 | 55.0 | 15 / 350 | 5.05 | 10.4% | 27059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.7 | 14.4% | 91 |
| oog.melee.Capulet 1.2 | 2.4 | 14.0% | 74 |
| darkcanuck.B26354 1.06 | 2.9 | 13.9% | 81 |
| stelo.PastFuture 2.3.2 | 3.1 | 13.4% | 51 |
| hadur117.nano.SanaroS2 0.2 | 5.0 | 10.4% | 15 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.4% | 21 |
| ntc.Opposite 1.5 | 7.6 | 7.8% | 1 |
| tripphippy.Alice 1.1 | 8.0 | 7.2% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 6.9% | 7 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.6 | 50.5 | 2 / 35 | 2587 |
| 2 | 4 | 56.3 | 62.9 | 2 / 35 | 2839 |
| 3 | 5 | 51.9 | 49.8 | 0 / 35 | 2757 |
| 4 | 5 | 55.3 | 59.0 | 5 / 35 | 2771 |
| 5 | 5 | 51.8 | 52.7 | 0 / 35 | 2592 |
| 6 | 5 | 51.6 | 52.7 | 1 / 35 | 2481 |
| 7 | 5 | 55.1 | 59.0 | 2 / 35 | 2971 |
| 8 | 6 | 50.5 | 48.9 | 1 / 35 | 2418 |
| 9 | 5 | 55.0 | 58.7 | 1 / 35 | 2825 |
| 10 | 5 | 54.2 | 55.9 | 1 / 35 | 2818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 15 | 7% |
| oog.melee.Capulet 1.2 | 15 | 27% |
| catcat20.Matcha 0.006 | 12 | 25% |
| stelo.PastFuture 2.3.2 | 7 | 57% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| tripphippy.Alice 1.1 | 3 | 0% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |

Hadur died in 335 of 350 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 76 | 23% | 80 |
| oog.melee.Capulet 1.2 | 71 | 21% | 77 |
| darkcanuck.B26354 1.06 | 62 | 19% | 61 |
| catcat20.Matcha 0.006 | 54 | 16% | 57 |
| tripphippy.Alice 1.1 | 24 | 7% | 24 |
| intruder.PrairieWolf 2.61 | 18 | 5% | 20 |
| ntc.Opposite 1.5 | 17 | 5% | 17 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 4% | 13 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.3 | 55.6 | 30 / 350 | 5.00 | 10.4% | 23968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 171 |
| gh.mini.Griezel 0.2 | 2.1 | 14.1% | 82 |
| d414.nano.Quantum 1.0.0 | 3.6 | 12.2% | 27 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 12.0% | 20 |
| hadur117.nano.SanaroS2 0.2 | 5.1 | 10.4% | 30 |
| gh.nano.Grofvuil 0.2 | 5.6 | 10.0% | 16 |
| timmit.nano.TimDog 0.33 | 7.5 | 7.1% | 2 |
| fm.mammillarias 1.3 | 7.7 | 6.7% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.0 | 55.2 | 1 / 35 | 2324 |
| 2 | 5 | 55.4 | 60.0 | 3 / 35 | 2519 |
| 3 | 6 | 49.6 | 49.8 | 1 / 35 | 2072 |
| 4 | 6 | 52.1 | 51.7 | 2 / 35 | 2377 |
| 5 | 6 | 50.4 | 50.5 | 0 / 35 | 2312 |
| 6 | 5 | 51.7 | 50.8 | 5 / 35 | 2439 |
| 7 | 3 | 57.7 | 63.8 | 5 / 35 | 2744 |
| 8 | 5 | 55.3 | 59.0 | 3 / 35 | 2441 |
| 9 | 6 | 51.3 | 52.7 | 3 / 35 | 2127 |
| 10 | 4 | 56.4 | 61.9 | 7 / 35 | 2613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 37 | 38% |
| abc.Shadow 3.84i | 29 | 41% |
| d414.nano.Quantum 1.0.0 | 6 | 33% |
| spinnercat.micro.Tyger 0.1 | 3 | 33% |
| gh.nano.Grofvuil 0.2 | 2 | 0% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 320 of 350 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 87 | 27% | 100 |
| spinnercat.micro.Tyger 0.1 | 62 | 19% | 63 |
| abc.Shadow 3.84i | 58 | 18% | 69 |
| d414.nano.Quantum 1.0.0 | 41 | 13% | 45 |
| gh.nano.Grofvuil 0.2 | 32 | 10% | 32 |
| fm.mammillarias 1.3 | 18 | 6% | 18 |
| timmit.nano.TimDog 0.33 | 11 | 3% | 12 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 4 | 1% | 4 |

## Melee bench: F32

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 73.8 | 108 / 350 | 3.35 | 14.3% | 33408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.5% | 111 |
| hadur117.nano.SanaroS2 0.2 | 2.0 | 14.3% | 108 |
| apc.botM 3.0 | 3.4 | 12.0% | 49 |
| vjik.UnViolation 1.1 | 4.3 | 11.2% | 38 |
| lxx.ConceptA 0.8 | 4.4 | 10.9% | 11 |
| bayen.UbaMicro 1.4 | 5.6 | 9.3% | 7 |
| yk.JahMicro 1.0 | 7.5 | 7.4% | 15 |
| panzer.Panzer 0.2 | 7.9 | 7.7% | 3 |
| conscience.Electron 1.3g | 9.0 | 6.4% | 3 |
| donjezza.Jezza 1.0 | 9.6 | 5.3% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.5 | 67.0 | 9 / 35 | 3152 |
| 2 | 1 | 62.7 | 76.2 | 14 / 35 | 3685 |
| 3 | 1 | 64.0 | 81.9 | 14 / 35 | 3593 |
| 4 | 2 | 60.6 | 74.3 | 10 / 35 | 3200 |
| 5 | 2 | 59.6 | 71.7 | 8 / 35 | 3087 |
| 6 | 2 | 63.8 | 79.7 | 15 / 35 | 3635 |
| 7 | 2 | 59.8 | 71.1 | 9 / 35 | 3073 |
| 8 | 1 | 63.8 | 81.6 | 13 / 35 | 3705 |
| 9 | 5 | 54.8 | 60.6 | 6 / 35 | 2733 |
| 10 | 2 | 61.5 | 74.3 | 10 / 35 | 3545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 94 | 49% |
| apc.botM 3.0 | 32 | 72% |
| vjik.UnViolation 1.1 | 24 | 50% |
| lxx.ConceptA 0.8 | 11 | 100% |
| yk.JahMicro 1.0 | 6 | 83% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| donjezza.Jezza 1.0 | 5 | 60% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 0% |

Hadur died in 243 of 350 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 85 | 35% | 135 |
| lxx.ConceptA 0.8 | 43 | 18% | 49 |
| apc.botM 3.0 | 38 | 16% | 61 |
| vjik.UnViolation 1.1 | 28 | 12% | 44 |
| bayen.UbaMicro 1.4 | 14 | 6% | 16 |
| panzer.Panzer 0.2 | 12 | 5% | 15 |
| conscience.Electron 1.3g | 10 | 4% | 12 |
| yk.JahMicro 1.0 | 7 | 3% | 9 |
| donjezza.Jezza 1.0 | 6 | 2% | 9 |

## Melee bench: F33

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 71.0 | 68 / 350 | 3.61 | 14.2% | 36802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.1 | 17.4% | 115 |
| hadur117.nano.SanaroS2 0.2 | 2.4 | 14.2% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.5% | 67 |
| labg.Cataclysm 2.05 | 4.4 | 11.6% | 46 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 11.4% | 34 |
| baal.nano.N 1.42 | 6.2 | 8.5% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.2% | 12 |
| sanja.First 0.1 | 8.6 | 5.6% | 1 |
| zyx.micro.Ant 1.1 | 9.1 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 74.9 | 9 / 35 | 4119 |
| 2 | 3 | 60.7 | 70.2 | 5 / 35 | 3462 |
| 3 | 3 | 62.5 | 74.3 | 7 / 35 | 3802 |
| 4 | 2 | 63.4 | 75.9 | 11 / 35 | 3634 |
| 5 | 2 | 61.8 | 73.7 | 6 / 35 | 3652 |
| 6 | 3 | 61.3 | 70.5 | 8 / 35 | 3634 |
| 7 | 2 | 61.4 | 71.7 | 6 / 35 | 3578 |
| 8 | 2 | 59.8 | 67.6 | 4 / 35 | 3180 |
| 9 | 3 | 59.7 | 63.2 | 5 / 35 | 4053 |
| 10 | 2 | 60.8 | 67.6 | 7 / 35 | 3688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 61 | 54% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 14% |
| labg.Cataclysm 2.05 | 26 | 27% |
| gre.svman4.Leonidas 1.3.2 | 20 | 65% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 45% |
| baal.nano.N 1.42 | 5 | 60% |
| sanja.First 0.1 | 2 | 100% |

Hadur died in 282 of 350 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 101 | 36% | 137 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 21% | 66 |
| labg.Cataclysm 2.05 | 37 | 13% | 42 |
| gre.svman4.Leonidas 1.3.2 | 32 | 11% | 44 |
| kinsen.melee.Angsaichmophobia 1.8c | 32 | 11% | 34 |
| baal.nano.N 1.42 | 7 | 2% | 12 |
| zyx.micro.Ant 1.1 | 7 | 2% | 8 |
| sanja.First 0.1 | 3 | 1% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 3 |

## Melee bench: F34

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 70.6 | 51 / 350 | 3.65 | 13.4% | 34250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.4 | 17.6% | 101 |
| stelo.Spread 0.9 | 1.6 | 17.5% | 142 |
| hadur117.nano.SanaroS2 0.2 | 3.2 | 13.4% | 51 |
| jcs.Seth 1.8 | 4.2 | 11.4% | 33 |
| tcf.Reach 3 | 4.7 | 11.2% | 20 |
| cli.Dancer 1.1 | 5.9 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.9% | 1 |
| sample.RamFire 1.0 | 9.9 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 73.7 | 2 / 35 | 3327 |
| 2 | 3 | 62.9 | 74.9 | 7 / 35 | 3471 |
| 3 | 4 | 59.8 | 65.7 | 2 / 35 | 3479 |
| 4 | 3 | 62.0 | 71.7 | 5 / 35 | 3763 |
| 5 | 4 | 58.8 | 64.1 | 4 / 35 | 3155 |
| 6 | 3 | 63.5 | 77.1 | 8 / 35 | 3602 |
| 7 | 3 | 61.4 | 70.2 | 6 / 35 | 3500 |
| 8 | 3 | 61.4 | 72.1 | 4 / 35 | 3432 |
| 9 | 3 | 61.3 | 69.5 | 7 / 35 | 3395 |
| 10 | 3 | 59.6 | 67.0 | 6 / 35 | 3126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 48 | 25% |
| stelo.Spread 0.9 | 43 | 53% |
| jcs.Seth 1.8 | 17 | 59% |
| tcf.Reach 3 | 6 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 128 | 43% | 134 |
| stelo.Spread 0.9 | 93 | 31% | 116 |
| jcs.Seth 1.8 | 27 | 9% | 39 |
| tcf.Reach 3 | 27 | 9% | 34 |
| cli.Dancer 1.1 | 9 | 3% | 10 |
| ratosh.Wesco 1.4 | 9 | 3% | 9 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 3 |
| sample.VelociRobot 1.0 | 2 | 1% | 4 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 67.9 | 20 / 350 | 3.89 | 12.3% | 26775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 278 |
| gh.mini.Gruwel 0.9 | 2.2 | 13.4% | 28 |
| hadur117.nano.SanaroS2 0.2 | 3.7 | 12.3% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.0% | 17 |
| rz.HawkOnFire 0.1 | 4.1 | 12.1% | 8 |
| wit.Chuliath 1.0 | 6.3 | 7.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.7% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.3% | 1 |
| dans.Cinnamon 1.2 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 67.6 | 5 / 35 | 2656 |
| 2 | 3 | 60.3 | 74.0 | 3 / 35 | 2734 |
| 3 | 4 | 58.1 | 67.6 | 1 / 35 | 2722 |
| 4 | 4 | 58.0 | 67.9 | 0 / 35 | 2577 |
| 5 | 3 | 59.7 | 71.7 | 2 / 35 | 2832 |
| 6 | 4 | 57.8 | 65.1 | 1 / 35 | 2857 |
| 7 | 2 | 58.0 | 67.6 | 3 / 35 | 2725 |
| 8 | 4 | 57.7 | 67.3 | 0 / 35 | 2777 |
| 9 | 5 | 57.3 | 65.4 | 2 / 35 | 2571 |
| 10 | 5 | 56.6 | 64.4 | 3 / 35 | 2324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 77 | 3% |
| gh.mini.Gruwel 0.9 | 16 | 38% |
| rz.HawkOnFire 0.1 | 7 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 50% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 330 of 350 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 147 | 45% | 149 |
| gh.mini.Gruwel 0.9 | 68 | 21% | 74 |
| dmh.robocode.robot.BlackDeath 9.2 | 51 | 15% | 52 |
| rz.HawkOnFire 0.1 | 34 | 10% | 43 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 9 | 3% | 9 |
| myl.nano.KomoriNinja 1.1 | 7 | 2% | 7 |
| dans.Cinnamon 1.2 | 6 | 2% | 6 |
| wit.Chuliath 1.0 | 4 | 1% | 5 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 5 |

## Melee bench: F36

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.0 | 104 / 350 | 3.52 | 14.6% | 36943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.2 | 14.6% | 104 |
| alpha.RainingFire 1.0 | 2.4 | 12.9% | 64 |
| bzdp.Pansy 2.1 | 2.9 | 12.8% | 60 |
| bvh.micro.Freya 0.3 | 4.2 | 11.3% | 34 |
| mz.Cork 0.1 | 5.0 | 10.9% | 34 |
| m3thos.Eva02 0.7.1 | 5.9 | 10.1% | 25 |
| bvh.mini.Fenrir 0.39 | 6.4 | 9.7% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.7% | 6 |
| dl.BetterWalls 1.0 | 8.5 | 6.6% | 2 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.4% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 78.1 | 12 / 35 | 4077 |
| 2 | 1 | 61.6 | 70.5 | 11 / 35 | 4075 |
| 3 | 2 | 56.3 | 59.0 | 8 / 35 | 3169 |
| 4 | 1 | 61.4 | 70.8 | 11 / 35 | 3565 |
| 5 | 2 | 57.8 | 63.2 | 6 / 35 | 3385 |
| 6 | 1 | 61.8 | 74.3 | 10 / 35 | 3722 |
| 7 | 1 | 62.7 | 74.3 | 13 / 35 | 3591 |
| 8 | 1 | 60.7 | 70.2 | 8 / 35 | 3467 |
| 9 | 1 | 63.2 | 77.1 | 10 / 35 | 4055 |
| 10 | 1 | 65.3 | 82.9 | 15 / 35 | 3837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 45% |
| alpha.RainingFire 1.0 | 31 | 35% |
| mz.Cork 0.1 | 29 | 72% |
| bvh.micro.Freya 0.3 | 27 | 81% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 13 | 69% |
| sample.MyFirstRobot 1.0 | 3 | 33% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |

Hadur died in 247 of 350 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 62 | 25% | 77 |
| bzdp.Pansy 2.1 | 55 | 22% | 80 |
| mz.Cork 0.1 | 32 | 13% | 52 |
| bvh.micro.Freya 0.3 | 31 | 13% | 45 |
| bvh.mini.Fenrir 0.39 | 25 | 10% | 30 |
| m3thos.Eva02 0.7.1 | 22 | 9% | 33 |
| squidM.TentalceMeleeNano 1.1 | 9 | 4% | 11 |
| dl.BetterWalls 1.0 | 6 | 2% | 16 |
| sample.MyFirstRobot 1.0 | 5 | 2% | 6 |

## Melee bench: F37

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 80.5 | 143 / 350 | 2.75 | 16.0% | 43826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.0 | 16.0% | 143 |
| germ.TheMind .2 | 3.2 | 11.1% | 34 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 11.0% | 30 |
| EBBU.Sim2 1.02 | 3.4 | 10.9% | 37 |
| agrach.Dalek 1.0 | 5.9 | 9.4% | 26 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.8% | 17 |
| lmk.ACPFinal 0.1 | 6.8 | 8.6% | 24 |
| mb.Beast 0.1 | 7.1 | 8.6% | 24 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.8% | 1 |
| skm.Ryubot 1.0 | 8.9 | 7.9% | 14 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.6 | 76.8 | 13 / 35 | 3477 |
| 2 | 1 | 62.7 | 77.8 | 14 / 35 | 4238 |
| 3 | 1 | 64.8 | 85.1 | 16 / 35 | 4661 |
| 4 | 1 | 66.2 | 88.6 | 20 / 35 | 4551 |
| 5 | 1 | 61.1 | 73.7 | 9 / 35 | 4589 |
| 6 | 1 | 63.3 | 80.6 | 15 / 35 | 4291 |
| 7 | 1 | 63.6 | 79.7 | 13 / 35 | 4881 |
| 8 | 1 | 63.5 | 82.9 | 15 / 35 | 4110 |
| 9 | 1 | 64.3 | 83.2 | 18 / 35 | 4171 |
| 10 | 1 | 62.7 | 76.8 | 10 / 35 | 4857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 43 | 70% |
| EBBU.Sim2 1.02 | 39 | 38% |
| com.syncleus.robocode.Dreadnaught 0.1 | 30 | 60% |
| agrach.Dalek 1.0 | 28 | 79% |
| mb.Beast 0.1 | 27 | 78% |
| stelo.UntouchableNano 1.3 | 24 | 83% |
| lmk.ACPFinal 0.1 | 17 | 59% |
| skm.Ryubot 1.0 | 14 | 50% |

Hadur died in 207 of 350 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 46 | 22% | 59 |
| germ.TheMind .2 | 33 | 16% | 59 |
| com.syncleus.robocode.Dreadnaught 0.1 | 32 | 15% | 56 |
| lmk.ACPFinal 0.1 | 26 | 13% | 32 |
| agrach.Dalek 1.0 | 18 | 9% | 47 |
| stelo.UntouchableNano 1.3 | 15 | 7% | 31 |
| mb.Beast 0.1 | 13 | 6% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 6% | 13 |
| skm.Ryubot 1.0 | 11 | 5% | 16 |

## Melee bench: F38

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 61.5 | 42 / 350 | 4.46 | 11.6% | 28246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.9% | 156 |
| bvh.mini.Freya 0.55 | 2.3 | 13.4% | 42 |
| bts.mega.Gnarly 1.4 | 3.9 | 11.8% | 49 |
| hadur117.nano.SanaroS2 0.2 | 4.3 | 11.6% | 42 |
| cs.Wren 1.0 | 4.7 | 11.4% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.1 | 10.8% | 19 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.6% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 5.5% | 3 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.8% | 3 |
| bzdp.BoxCar 2.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.3 | 63.8 | 5 / 35 | 2816 |
| 2 | 5 | 55.5 | 59.4 | 3 / 35 | 2934 |
| 3 | 4 | 56.3 | 61.6 | 4 / 35 | 2763 |
| 4 | 5 | 57.2 | 62.5 | 5 / 35 | 2949 |
| 5 | 6 | 53.7 | 56.2 | 5 / 35 | 2412 |
| 6 | 5 | 56.4 | 60.3 | 5 / 35 | 2916 |
| 7 | 3 | 56.9 | 63.2 | 4 / 35 | 3039 |
| 8 | 4 | 55.5 | 63.2 | 3 / 35 | 2454 |
| 9 | 4 | 55.6 | 60.6 | 2 / 35 | 2726 |
| 10 | 4 | 58.3 | 64.4 | 6 / 35 | 3237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 44 | 50% |
| bts.mega.Gnarly 1.4 | 15 | 40% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 18% |
| bvh.mini.Freya 0.55 | 10 | 60% |
| cs.Wren 1.0 | 9 | 33% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 68 | 22% | 91 |
| bvh.mini.Freya 0.55 | 56 | 18% | 57 |
| cs.Wren 1.0 | 54 | 18% | 57 |
| bts.mega.Gnarly 1.4 | 46 | 15% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 14% | 48 |
| kdf.KoulDestroyer 1.0 | 27 | 9% | 30 |
| bzdp.BoxCar 2.0 | 6 | 2% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 2% | 6 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 63.1 | 34 / 350 | 4.32 | 11.9% | 30349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.8% | 71 |
| az.Ololobot 0.2.4 | 1.8 | 14.4% | 134 |
| hadur117.nano.SanaroS2 0.2 | 3.4 | 11.9% | 34 |
| catcat20.Lambda 0.024 | 3.8 | 11.4% | 58 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.9% | 32 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.7% | 9 |
| apollokidd.ApolloKidd 0.9 | 6.9 | 8.6% | 7 |
| gimp.GimpBot 0.1 | 7.1 | 8.3% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.3 | 57.8 | 2 / 35 | 2945 |
| 2 | 3 | 57.2 | 64.8 | 6 / 35 | 3192 |
| 3 | 3 | 57.1 | 67.0 | 3 / 35 | 3078 |
| 4 | 3 | 58.1 | 68.6 | 3 / 35 | 3114 |
| 5 | 4 | 56.2 | 62.2 | 5 / 35 | 2746 |
| 6 | 3 | 56.8 | 64.8 | 4 / 35 | 3022 |
| 7 | 3 | 56.0 | 61.3 | 3 / 35 | 3362 |
| 8 | 3 | 57.8 | 66.7 | 3 / 35 | 3306 |
| 9 | 3 | 56.0 | 63.2 | 2 / 35 | 2988 |
| 10 | 4 | 52.1 | 54.6 | 3 / 35 | 2596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 39 | 5% |
| bvh.fry.Freya 0.82 | 28 | 32% |
| catcat20.Lambda 0.024 | 19 | 53% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 62% |
| winamp32.micro.MicroMacro 1.0 | 4 | 0% |
| apollokidd.ApolloKidd 0.9 | 3 | 33% |
| gimp.GimpBot 0.1 | 3 | 67% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 317 of 350 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 127 | 40% | 137 |
| az.Ololobot 0.2.4 | 59 | 19% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 42 | 13% | 48 |
| catcat20.Lambda 0.024 | 32 | 10% | 38 |
| apollokidd.ApolloKidd 0.9 | 17 | 5% | 19 |
| winamp32.micro.MicroMacro 1.0 | 15 | 5% | 17 |
| dcs.Eater_of_Worlds 1.1.3-A | 10 | 3% | 9 |
| gimp.GimpBot 0.1 | 9 | 3% | 13 |
| whitesquare.robots.SkynetAdvanced 1.1 | 6 | 2% | 7 |

## Melee bench: F41

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 69.0 | 80 / 350 | 3.79 | 13.2% | 30156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.5% | 144 |
| ary.Swarm 1.1 | 2.5 | 13.8% | 31 |
| lessonz.robocode.Oz 0.5.0 | 3.1 | 13.6% | 52 |
| hadur117.nano.SanaroS2 0.2 | 3.4 | 13.2% | 80 |
| simonton.nano.MeleeSeed 1.8 | 4.9 | 11.8% | 33 |
| shrub.Silver v048 | 6.1 | 9.2% | 3 |
| zyx.nano.Ant 1.1 | 7.1 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 5.8% | 6 |
| stelo.Mirror 1.1 | 8.6 | 5.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 70.8 | 7 / 35 | 3066 |
| 2 | 3 | 59.8 | 67.6 | 4 / 35 | 3294 |
| 3 | 4 | 57.1 | 62.2 | 6 / 35 | 2627 |
| 4 | 3 | 61.5 | 71.1 | 10 / 35 | 3345 |
| 5 | 4 | 59.7 | 69.2 | 8 / 35 | 2878 |
| 6 | 2 | 63.2 | 76.8 | 12 / 35 | 3276 |
| 7 | 3 | 60.8 | 69.2 | 10 / 35 | 3061 |
| 8 | 5 | 56.8 | 60.3 | 7 / 35 | 2798 |
| 9 | 3 | 60.2 | 71.7 | 6 / 35 | 2869 |
| 10 | 4 | 60.7 | 70.8 | 10 / 35 | 2942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 63 | 41% |
| lessonz.robocode.Oz 0.5.0 | 32 | 56% |
| ary.Swarm 1.1 | 18 | 83% |
| simonton.nano.MeleeSeed 1.8 | 18 | 83% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 84 | 31% | 109 |
| ary.Swarm 1.1 | 67 | 25% | 89 |
| lessonz.robocode.Oz 0.5.0 | 43 | 16% | 52 |
| simonton.nano.MeleeSeed 1.8 | 36 | 13% | 51 |
| shrub.Silver v048 | 15 | 6% | 18 |
| zyx.nano.Ant 1.1 | 12 | 4% | 12 |
| jsal.Jsalbot 1.0 | 6 | 2% | 9 |
| stelo.Mirror 1.1 | 5 | 2% | 7 |
| acogdev.alpha 0.2 | 2 | 1% | 3 |

## Melee bench: F42

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.3 | 75 / 350 | 3.49 | 14.1% | 36765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.3% | 153 |
| ara.Shera 0.88 | 2.8 | 14.6% | 69 |
| maribo.mini.MiniQuester 0.1 | 2.9 | 14.2% | 35 |
| hadur117.nano.SanaroS2 0.2 | 3.3 | 14.1% | 75 |
| amz.NanoClone 1.41 | 5.1 | 9.0% | 3 |
| dsw.StaticD 1.0 | 6.5 | 7.4% | 10 |
| maribo.IotaCT 1.1 | 6.5 | 7.4% | 4 |
| mme.NikeEnhanced 2.0 | 8.6 | 5.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 65.1 | 3 / 35 | 3408 |
| 2 | 4 | 60.1 | 67.3 | 8 / 35 | 3585 |
| 3 | 2 | 65.0 | 81.9 | 11 / 35 | 4013 |
| 4 | 2 | 62.5 | 73.7 | 7 / 35 | 3962 |
| 5 | 4 | 60.1 | 69.5 | 7 / 35 | 3304 |
| 6 | 3 | 63.2 | 74.0 | 9 / 35 | 4336 |
| 7 | 4 | 61.7 | 74.3 | 7 / 35 | 3441 |
| 8 | 4 | 59.9 | 67.9 | 9 / 35 | 3270 |
| 9 | 3 | 62.3 | 75.6 | 7 / 35 | 3778 |
| 10 | 3 | 61.5 | 73.7 | 7 / 35 | 3668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 66 | 39% |
| ara.Shera 0.88 | 35 | 54% |
| maribo.mini.MiniQuester 0.1 | 29 | 90% |
| amz.NanoClone 1.41 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% |
| maribo.IotaCT 1.1 | 1 | 0% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 93 | 34% | 121 |
| ara.Shera 0.88 | 83 | 30% | 102 |
| maribo.mini.MiniQuester 0.1 | 53 | 19% | 78 |
| amz.NanoClone 1.41 | 15 | 5% | 17 |
| maribo.IotaCT 1.1 | 11 | 4% | 11 |
| dsw.StaticD 1.0 | 9 | 3% | 10 |
| mme.NikeEnhanced 2.0 | 5 | 2% | 5 |
| stelo.MirrorMicro 1.0 | 4 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 60.3 | 25 / 350 | 4.57 | 11.4% | 28532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.1% | 283 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.1% | 23 |
| dummy.micro.Sparrow 2.5 | 3.4 | 12.2% | 13 |
| hadur117.nano.SanaroS2 0.2 | 4.1 | 11.4% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 11.3% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 9.9% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.6 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.8 | 58.7 | 4 / 35 | 2983 |
| 2 | 4 | 58.0 | 59.4 | 3 / 35 | 2807 |
| 3 | 5 | 57.2 | 59.7 | 2 / 35 | 2919 |
| 4 | 5 | 57.4 | 59.0 | 2 / 35 | 2787 |
| 5 | 5 | 56.0 | 56.2 | 0 / 35 | 2760 |
| 6 | 4 | 58.4 | 60.3 | 3 / 35 | 3048 |
| 7 | 3 | 59.0 | 63.2 | 2 / 35 | 2992 |
| 8 | 5 | 57.0 | 57.1 | 2 / 35 | 2857 |
| 9 | 3 | 58.3 | 62.9 | 3 / 35 | 2805 |
| 10 | 3 | 59.6 | 66.7 | 4 / 35 | 2574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 64 | 14% |
| brainfade.melee.Dusk 0.44 | 13 | 85% |
| dummy.micro.Sparrow 2.5 | 5 | 60% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |

Hadur died in 325 of 350 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 158 | 49% | 168 |
| dummy.micro.Sparrow 2.5 | 42 | 13% | 43 |
| brainfade.melee.Dusk 0.44 | 38 | 12% | 49 |
| wcsv.melee.EngineerMelee 0.1 | 34 | 10% | 35 |
| Krabb.akim2.Akim2 1.1b | 21 | 6% | 22 |
| mz.NanoGod 2.02 | 16 | 5% | 16 |
| jab.DiamondStealer 5 | 14 | 4% | 14 |
| cvt.Firsty 1.0 | 2 | 1% | 3 |

## Melee bench: F44

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 68.9 | 67 / 350 | 3.80 | 13.7% | 36652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 16.8% | 136 |
| tzu.TheArtOfWar 1.2 | 1.9 | 16.0% | 104 |
| hadur117.nano.SanaroS2 0.2 | 2.9 | 13.7% | 67 |
| jwirde.Gort 2.0 | 4.5 | 10.6% | 25 |
| wompi.Quokka 1.6 | 4.8 | 10.3% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 8.8% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.4% | 6 |
| stf.PanzerGeneral 0.1 | 7.6 | 7.1% | 5 |
| sample.Crazy 1.0 | 9.3 | 4.8% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 70.5 | 6 / 35 | 3787 |
| 2 | 3 | 62.0 | 73.0 | 7 / 35 | 3605 |
| 3 | 3 | 58.6 | 64.8 | 5 / 35 | 3753 |
| 4 | 3 | 59.2 | 64.4 | 5 / 35 | 3467 |
| 5 | 2 | 63.4 | 72.7 | 10 / 35 | 4306 |
| 6 | 3 | 60.7 | 69.2 | 9 / 35 | 3510 |
| 7 | 3 | 58.7 | 64.8 | 5 / 35 | 3423 |
| 8 | 3 | 60.4 | 71.1 | 5 / 35 | 3587 |
| 9 | 3 | 60.5 | 67.6 | 8 / 35 | 3463 |
| 10 | 3 | 62.0 | 71.1 | 7 / 35 | 3751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 66 | 58% |
| tzu.TheArtOfWar 1.2 | 41 | 32% |
| jwirde.Gort 2.0 | 13 | 46% |
| disan.Chair 2.2.0 | 6 | 50% |
| wompi.Quokka 1.6 | 5 | 80% |
| sample.Crazy 1.0 | 2 | 50% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 50% |

Hadur died in 284 of 350 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 94 | 33% | 133 |
| tzu.TheArtOfWar 1.2 | 91 | 32% | 104 |
| jwirde.Gort 2.0 | 33 | 12% | 41 |
| wompi.Quokka 1.6 | 30 | 11% | 34 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 15 | 5% | 17 |
| disan.Chair 2.2.0 | 10 | 4% | 10 |
| stf.PanzerGeneral 0.1 | 5 | 2% | 5 |
| sample.Crazy 1.0 | 4 | 1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 70.9 | 51 / 350 | 3.62 | 14.3% | 37417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.4 | 14.3% | 51 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 13.0% | 182 |
| jje.BagPuss 1.2 | 2.8 | 13.0% | 32 |
| sul.Lunar 1.1 | 3.6 | 11.7% | 41 |
| myl.nano.Graviton 1.10 | 5.1 | 10.1% | 11 |
| hvilela.HVilela 0.9 | 6.0 | 9.6% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.2% | 8 |
| fm.claire 1.7 | 7.7 | 7.9% | 1 |
| wit.Deep7 2.0 | 8.8 | 6.9% | 22 |
| abud.ThirdRobo 1.0 | 9.9 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 66.3 | 2 / 35 | 3684 |
| 2 | 1 | 62.5 | 74.9 | 6 / 35 | 4034 |
| 3 | 1 | 60.7 | 70.8 | 6 / 35 | 3757 |
| 4 | 1 | 59.7 | 67.0 | 6 / 35 | 3819 |
| 5 | 1 | 63.7 | 78.1 | 8 / 35 | 4194 |
| 6 | 2 | 59.3 | 66.0 | 5 / 35 | 3620 |
| 7 | 2 | 59.8 | 71.1 | 3 / 35 | 3320 |
| 8 | 1 | 61.3 | 73.7 | 7 / 35 | 3524 |
| 9 | 2 | 59.7 | 67.9 | 3 / 35 | 3597 |
| 10 | 1 | 61.3 | 73.0 | 5 / 35 | 3868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 85 | 29% |
| jje.BagPuss 1.2 | 20 | 30% |
| sul.Lunar 1.1 | 18 | 6% |
| myl.nano.Graviton 1.10 | 15 | 67% |
| wit.Deep7 2.0 | 7 | 29% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 75% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 2 | 50% |
| fm.claire 1.7 | 2 | 50% |

Hadur died in 299 of 350 rounds, at a mean tick of 1254. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 72 | 24% | 104 |
| eem.IWillFireNoBullet v2.8 | 72 | 24% | 0 |
| sul.Lunar 1.1 | 45 | 15% | 75 |
| myl.nano.Graviton 1.10 | 33 | 11% | 54 |
| hvilela.HVilela 0.9 | 24 | 8% | 33 |
| fm.claire 1.7 | 21 | 7% | 27 |
| wit.Deep7 2.0 | 15 | 5% | 24 |
| pez.mini.ChironexFleckeri 0.5 | 11 | 4% | 22 |
| abud.ThirdRobo 1.0 | 6 | 2% | 11 |

## Melee bench: F46

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 69.3 | 42 / 350 | 3.77 | 12.6% | 28315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.1% | 146 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.5% | 125 |
| hadur117.nano.SanaroS2 0.2 | 3.3 | 12.6% | 42 |
| mz.MicroSheep 1.0 | 4.3 | 10.9% | 10 |
| cx.Princess 1.0 | 4.7 | 10.5% | 25 |
| sadoner.killer 0.2 | 5.7 | 9.3% | 1 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.4% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.5% | 1 |
| kurios.DOSexe .9a | 9.1 | 4.7% | 1 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 71.7 | 3 / 35 | 2768 |
| 2 | 3 | 59.8 | 70.8 | 9 / 35 | 3026 |
| 3 | 3 | 58.9 | 69.8 | 6 / 35 | 2809 |
| 4 | 3 | 58.0 | 67.9 | 5 / 35 | 2617 |
| 5 | 3 | 57.7 | 67.6 | 3 / 35 | 2715 |
| 6 | 4 | 57.5 | 62.9 | 1 / 35 | 3130 |
| 7 | 5 | 55.1 | 61.3 | 1 / 35 | 2296 |
| 8 | 3 | 61.4 | 74.6 | 6 / 35 | 3273 |
| 9 | 3 | 61.2 | 75.2 | 3 / 35 | 3170 |
| 10 | 3 | 58.9 | 70.8 | 5 / 35 | 2511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 74 | 36% |
| rsalesc.melee.Medina 0.4.5 | 41 | 24% |
| cx.Princess 1.0 | 8 | 25% |
| mz.MicroSheep 1.0 | 7 | 29% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 122 | 39% | 154 |
| rsalesc.melee.Medina 0.4.5 | 67 | 22% | 74 |
| sadoner.killer 0.2 | 34 | 11% | 34 |
| mz.MicroSheep 1.0 | 33 | 11% | 33 |
| cx.Princess 1.0 | 31 | 10% | 33 |
| arthord.NanoSatanMelee Beta | 16 | 5% | 17 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

