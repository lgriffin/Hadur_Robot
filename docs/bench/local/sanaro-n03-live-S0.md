# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 75.7 | 45 / 350 | 3.19 | 14.1% | 38315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 234 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 14.1% | 45 |
| sgp.JollyNinja 3.53 | 3.6 | 12.1% | 33 |
| mz.MicroGodMelee 1 | 4.3 | 11.3% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.6 | 11.0% | 15 |
| lorneswork.Predator 1.0 | 5.6 | 10.4% | 7 |
| adt.Ar2 1.0 | 6.9 | 7.4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.4% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 75.6 | 5 / 35 | 3455 |
| 2 | 2 | 61.0 | 73.0 | 3 / 35 | 3840 |
| 3 | 2 | 62.0 | 75.6 | 3 / 35 | 4074 |
| 4 | 2 | 63.4 | 79.4 | 5 / 35 | 3844 |
| 5 | 2 | 61.2 | 73.3 | 4 / 35 | 3507 |
| 6 | 2 | 63.4 | 79.0 | 6 / 35 | 3886 |
| 7 | 2 | 61.8 | 74.9 | 4 / 35 | 3730 |
| 8 | 2 | 61.3 | 70.8 | 3 / 35 | 4271 |
| 9 | 2 | 62.4 | 77.1 | 3 / 35 | 3805 |
| 10 | 2 | 63.3 | 78.1 | 9 / 35 | 3903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 139 | 10% |
| sgp.JollyNinja 3.53 | 22 | 32% |
| mz.MicroGodMelee 1 | 17 | 65% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 70% |
| lorneswork.Predator 1.0 | 8 | 38% |
| adt.Ar2 1.0 | 3 | 67% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 1212. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 160 | 52% | 172 |
| sgp.JollyNinja 3.53 | 51 | 17% | 58 |
| mz.MicroGodMelee 1 | 28 | 9% | 39 |
| lorneswork.Predator 1.0 | 27 | 9% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 8% | 30 |
| adt.Ar2 1.0 | 6 | 2% | 9 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 1% | 4 |
| skm.butterfly 1.0 | 4 | 1% | 4 |
| mym.EdgeStalker 1.0 | 2 | 1% | 3 |

## Melee bench: F02

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 64.9 | 66 / 350 | 4.16 | 13.6% | 40959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.2 | 15.2% | 104 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 14.4% | 80 |
| hadur117.nano.SanaroS0 0.1 | 2.9 | 13.6% | 66 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.0% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.5% | 33 |
| fnc.bandit.Bandit 5.2.0 | 6.9 | 8.1% | 8 |
| sch.Simone 0.3d | 6.9 | 8.3% | 20 |
| Noran.BitchingElk 0.054 | 7.6 | 7.5% | 21 |
| stelo.PatternRobot 1.0 | 8.5 | 6.6% | 7 |
| fullsail.SweetTea 1.1 | 10.0 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 56.5 | 4 / 35 | 3825 |
| 2 | 3 | 59.4 | 65.1 | 5 / 35 | 4041 |
| 3 | 3 | 61.3 | 68.3 | 7 / 35 | 4229 |
| 4 | 2 | 60.8 | 67.3 | 7 / 35 | 4174 |
| 5 | 2 | 61.1 | 67.9 | 8 / 35 | 4289 |
| 6 | 3 | 60.6 | 65.7 | 9 / 35 | 4377 |
| 7 | 3 | 60.8 | 66.7 | 7 / 35 | 4266 |
| 8 | 3 | 61.5 | 69.8 | 8 / 35 | 4179 |
| 9 | 3 | 56.9 | 60.0 | 5 / 35 | 3466 |
| 10 | 3 | 58.4 | 61.3 | 6 / 35 | 4113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 47 | 64% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 35 | 20% |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 60% |
| sch.Simone 0.3d | 9 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| stelo.PatternRobot 1.0 | 5 | 20% |
| Noran.BitchingElk 0.054 | 4 | 25% |
| fullsail.SweetTea 1.1 | 2 | 50% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |

Hadur died in 285 of 350 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 74 | 26% | 102 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 63 | 22% | 72 |
| lrem.micro.SpikeSoldier 0.4 | 44 | 15% | 47 |
| com.cohesiva.robocode.ManOwaR 1.0 | 31 | 11% | 41 |
| stelo.PatternRobot 1.0 | 24 | 8% | 27 |
| sch.Simone 0.3d | 18 | 6% | 26 |
| fnc.bandit.Bandit 5.2.0 | 16 | 6% | 18 |
| fullsail.SweetTea 1.1 | 9 | 3% | 9 |
| Noran.BitchingElk 0.054 | 6 | 2% | 8 |

## Melee bench: F03

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 78.1 | 70 / 350 | 2.97 | 14.8% | 40197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.8 | 15.1% | 104 |
| hadur117.nano.SanaroS0 0.1 | 2.1 | 14.8% | 70 |
| kawigi.nano.Lib 1.0 | 2.9 | 13.9% | 80 |
| vuen.Cake 2.51 | 3.2 | 13.6% | 79 |
| urdos.URDOS 1.3 | 5.0 | 10.5% | 8 |
| adt.Ar1 2.1 | 6.4 | 8.1% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.1 | 7.2% | 5 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.4% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 77.5 | 8 / 35 | 3615 |
| 2 | 1 | 64.2 | 84.1 | 5 / 35 | 4366 |
| 3 | 1 | 63.9 | 83.2 | 9 / 35 | 4079 |
| 4 | 3 | 61.6 | 75.9 | 7 / 35 | 3811 |
| 5 | 2 | 61.8 | 78.7 | 7 / 35 | 3783 |
| 6 | 1 | 65.7 | 84.8 | 10 / 35 | 4867 |
| 7 | 2 | 62.4 | 75.6 | 9 / 35 | 4241 |
| 8 | 2 | 62.4 | 77.5 | 6 / 35 | 4076 |
| 9 | 4 | 59.6 | 68.6 | 4 / 35 | 3845 |
| 10 | 2 | 60.2 | 75.2 | 5 / 35 | 3514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 66 | 38% |
| radnor.DoctorBob 1.42 | 56 | 34% |
| kawigi.nano.Lib 1.0 | 42 | 14% |
| urdos.URDOS 1.3 | 12 | 75% |
| adt.Ar1 2.1 | 5 | 80% |
| ghent.ArthurPanzergon 1.0.0 | 5 | 40% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 280 of 350 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 79 | 28% | 89 |
| radnor.DoctorBob 1.42 | 71 | 25% | 86 |
| vuen.Cake 2.51 | 57 | 20% | 83 |
| urdos.URDOS 1.3 | 36 | 13% | 46 |
| ghent.ArthurPanzergon 1.0.0 | 18 | 6% | 20 |
| adt.Ar1 2.1 | 11 | 4% | 13 |
| oa.weak.FlyMk1 0.1 | 3 | 1% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 71.5 | 6 / 350 | 3.56 | 13.9% | 43649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 320 |
| apc.LeeroyJenkins2 1.0 | 2.4 | 13.8% | 14 |
| hadur117.nano.SanaroS0 0.1 | 2.6 | 13.9% | 6 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 5 |
| josago.Jorgito 0.16 | 5.2 | 9.1% | 0 |
| css.Delitioner 0.11 | 6.1 | 7.8% | 1 |
| tj.zombie1n 1.0.1 | 6.8 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.7% | 1 |
| spin.Bugstard 0.012b | 9.4 | 4.1% | 3 |
| sp.Nanos.Ember 1.1 | 9.6 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 70.2 | 0 / 35 | 4283 |
| 2 | 3 | 60.5 | 67.0 | 1 / 35 | 4080 |
| 3 | 2 | 63.7 | 74.9 | 3 / 35 | 4616 |
| 4 | 3 | 62.2 | 70.2 | 2 / 35 | 4522 |
| 5 | 3 | 60.1 | 66.3 | 0 / 35 | 3947 |
| 6 | 2 | 63.2 | 74.9 | 0 / 35 | 4576 |
| 7 | 2 | 64.5 | 76.8 | 0 / 35 | 4649 |
| 8 | 3 | 63.1 | 75.9 | 0 / 35 | 4121 |
| 9 | 2 | 61.3 | 69.2 | 0 / 35 | 4423 |
| 10 | 3 | 62.0 | 69.8 | 0 / 35 | 4432 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 157 | 3% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| TNT.TNT 0.99.1 | 1 | 0% |

Hadur died in 345 of 350 rounds, at a mean tick of 1215. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 240 | 70% | 245 |
| apc.LeeroyJenkins2 1.0 | 49 | 14% | 50 |
| josago.Jorgito 0.16 | 24 | 7% | 24 |
| TNT.TNT 0.99.1 | 12 | 3% | 12 |
| tj.zombie1n 1.0.1 | 8 | 2% | 8 |
| css.Delitioner 0.11 | 7 | 2% | 7 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 66.4 | 52 / 350 | 4.02 | 12.9% | 33445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.8% | 90 |
| origin.SleepSiphon 1.7b | 2.1 | 14.7% | 117 |
| hadur117.nano.SanaroS0 0.1 | 3.3 | 12.9% | 52 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.2% | 41 |
| mld.Wisdom 1.0 | 4.4 | 11.4% | 26 |
| gg.Wolverine 2.0 | 6.4 | 8.6% | 7 |
| spinnercat.Omen 1.0 | 7.5 | 7.2% | 1 |
| DBall.NUKE 0.1 | 7.7 | 7.6% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.4 | 6.5% | 10 |
| sample.Fire 1.0 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 67.6 | 5 / 35 | 3348 |
| 2 | 3 | 58.9 | 68.6 | 6 / 35 | 3089 |
| 3 | 2 | 60.2 | 67.9 | 9 / 35 | 3532 |
| 4 | 3 | 60.4 | 69.5 | 4 / 35 | 3693 |
| 5 | 4 | 58.1 | 63.5 | 5 / 35 | 3165 |
| 6 | 3 | 59.8 | 68.3 | 4 / 35 | 3559 |
| 7 | 5 | 57.7 | 61.9 | 6 / 35 | 3233 |
| 8 | 2 | 59.9 | 71.1 | 3 / 35 | 3397 |
| 9 | 4 | 57.5 | 61.0 | 6 / 35 | 3293 |
| 10 | 4 | 57.9 | 65.1 | 4 / 35 | 3136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 37 | 38% |
| origin.SleepSiphon 1.7b | 36 | 39% |
| pe.minimelee.SandboxMiniMelee 1.1 | 15 | 47% |
| mld.Wisdom 1.0 | 8 | 25% |
| gg.Wolverine 2.0 | 7 | 100% |
| DBall.NUKE 0.1 | 5 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| sample.Fire 1.0 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 89 | 30% | 100 |
| origin.SleepSiphon 1.7b | 65 | 22% | 81 |
| mld.Wisdom 1.0 | 52 | 17% | 55 |
| pe.minimelee.SandboxMiniMelee 1.1 | 46 | 15% | 53 |
| gg.Wolverine 2.0 | 16 | 5% | 20 |
| DBall.NUKE 0.1 | 12 | 4% | 18 |
| spinnercat.Omen 1.0 | 11 | 4% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 2% | 9 |
| sample.Fire 1.0 | 1 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.1 | 83 / 350 | 2.79 | 16.1% | 47153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.0% | 112 |
| rtk.Tachikoma 1.0 | 1.8 | 17.8% | 100 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 16.1% | 83 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.9% | 29 |
| franzor.Lizt 1.3.1 | 5.0 | 10.8% | 29 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.4 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.4 | 84.1 | 8 / 35 | 5023 |
| 2 | 3 | 65.7 | 77.8 | 6 / 35 | 4791 |
| 3 | 3 | 67.7 | 84.4 | 11 / 35 | 4634 |
| 4 | 3 | 67.3 | 80.3 | 11 / 35 | 4932 |
| 5 | 3 | 65.7 | 80.0 | 5 / 35 | 4399 |
| 6 | 1 | 68.5 | 84.4 | 14 / 35 | 5370 |
| 7 | 2 | 67.5 | 81.6 | 11 / 35 | 4877 |
| 8 | 3 | 65.3 | 76.8 | 7 / 35 | 4494 |
| 9 | 3 | 64.4 | 75.6 | 4 / 35 | 4503 |
| 10 | 3 | 64.0 | 75.6 | 6 / 35 | 4130 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 99 | 55% |
| rsalesc.melee.Monk 0.3.6c | 58 | 9% |
| oog.melee.CapuletDroid 1.1 | 29 | 62% |
| franzor.Lizt 1.3.1 | 13 | 46% |

Hadur died in 267 of 350 rounds, at a mean tick of 1268. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 128 | 48% | 187 |
| rsalesc.melee.Monk 0.3.6c | 93 | 35% | 103 |
| oog.melee.CapuletDroid 1.1 | 24 | 9% | 42 |
| lrem.micro.MoggFanatic 0.2 | 8 | 3% | 9 |
| franzor.Lizt 1.3.1 | 8 | 3% | 1 |
| exauge.GateKeeper 1.1.121g | 6 | 2% | 7 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 68.7 | 69 / 350 | 3.81 | 13.5% | 33899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.9 | 13.8% | 95 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 13.5% | 69 |
| shrub.Vapour v159 | 2.3 | 13.4% | 79 |
| Krabb.sliNk.Garm 0.9u | 4.6 | 10.8% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.1% | 30 |
| m3thos.Eva00 1.1 | 6.1 | 8.8% | 13 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.9% | 27 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.9% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 7.0% | 1 |
| SHAM.WOW 1.4 | 9.2 | 6.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 65.1 | 10 / 35 | 2758 |
| 2 | 2 | 59.6 | 70.8 | 8 / 35 | 3344 |
| 3 | 1 | 61.6 | 76.5 | 7 / 35 | 3708 |
| 4 | 2 | 59.4 | 70.2 | 6 / 35 | 3434 |
| 5 | 1 | 59.5 | 69.8 | 7 / 35 | 3377 |
| 6 | 3 | 53.6 | 54.3 | 5 / 35 | 3133 |
| 7 | 3 | 58.8 | 65.7 | 7 / 35 | 3583 |
| 8 | 1 | 62.2 | 76.2 | 9 / 35 | 3757 |
| 9 | 3 | 59.8 | 71.1 | 5 / 35 | 3445 |
| 10 | 1 | 58.3 | 67.6 | 5 / 35 | 3360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 41 | 34% |
| shrub.Vapour v159 | 40 | 35% |
| Krabb.sliNk.Garm 0.9u | 16 | 56% |
| com.spp.robocode.MostlyHarmless 010 | 13 | 38% |
| m3thos.Eva00 1.1 | 13 | 54% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 64% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 282 of 350 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 64 | 23% | 81 |
| shrub.Vapour v159 | 64 | 23% | 75 |
| Krabb.sliNk.Garm 0.9u | 39 | 14% | 48 |
| com.spp.robocode.MostlyHarmless 010 | 35 | 12% | 43 |
| m3thos.Eva00 1.1 | 24 | 9% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 22 | 8% | 34 |
| zyx.nano.BacillusComma 1.0 | 18 | 6% | 21 |
| SHAM.WOW 1.4 | 10 | 4% | 12 |
| qualidafial.MajorDick 1.0.1 | 5 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 60.4 | 26 / 350 | 4.56 | 11.7% | 30317 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 190 |
| kc.micro.Figment 1.0 | 2.0 | 14.9% | 62 |
| hadur117.nano.SanaroS0 0.1 | 3.3 | 11.7% | 26 |
| yagami.Tidus 0.11 | 4.2 | 11.3% | 6 |
| pedersen.Grishnakh 1.0 | 4.6 | 11.2% | 34 |
| mc2.enemy.Original 0.9 | 5.9 | 9.9% | 27 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 5 |
| step.nanoPri 1.0 | 8.2 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.2% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 65.1 | 5 / 35 | 3213 |
| 2 | 3 | 56.8 | 61.0 | 2 / 35 | 3253 |
| 3 | 4 | 54.0 | 54.9 | 1 / 35 | 2778 |
| 4 | 3 | 57.0 | 61.9 | 3 / 35 | 3161 |
| 5 | 3 | 57.4 | 62.5 | 3 / 35 | 3058 |
| 6 | 5 | 54.0 | 55.2 | 2 / 35 | 2795 |
| 7 | 3 | 56.8 | 60.0 | 2 / 35 | 2994 |
| 8 | 3 | 56.6 | 60.3 | 2 / 35 | 3084 |
| 9 | 3 | 57.8 | 61.3 | 4 / 35 | 3138 |
| 10 | 3 | 57.1 | 62.2 | 2 / 35 | 2843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 42 | 21% |
| kc.micro.Figment 1.0 | 24 | 25% |
| yagami.Tidus 0.11 | 11 | 73% |
| pedersen.Grishnakh 1.0 | 6 | 17% |
| mc2.enemy.Original 0.9 | 4 | 0% |
| step.nanoPri 1.0 | 2 | 100% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 324 of 350 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 90 | 28% | 99 |
| kc.micro.Figment 1.0 | 75 | 23% | 82 |
| yagami.Tidus 0.11 | 45 | 14% | 53 |
| mc2.enemy.Original 0.9 | 34 | 10% | 34 |
| pedersen.Grishnakh 1.0 | 29 | 9% | 29 |
| step.nanoPri 1.0 | 20 | 6% | 22 |
| dft.Calliope 5.6 | 19 | 6% | 19 |
| robar.nano.Assertive_Melee 0.2 | 10 | 3% | 10 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |

## Melee bench: F10

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 78.3 | 90 / 350 | 2.96 | 15.3% | 42178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.4 | 15.3% | 90 |
| DTF.Kludgy 1.2b | 2.2 | 14.5% | 89 |
| ne.Chimera 1.2 | 3.1 | 13.3% | 51 |
| ejb.Polaris 1.0.1 | 3.8 | 12.9% | 40 |
| tvv.micro.Antares 1.1.1 | 5.0 | 11.2% | 38 |
| vStar.RAFzilla 2.15 | 5.5 | 10.5% | 30 |
| sam.Samspin 1.0 | 7.6 | 6.3% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.1 | 5.8% | 1 |
| kurios.DOSexe .9b | 8.5 | 5.5% | 4 |
| donjezza.Muncho 1.0 | 9.8 | 4.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 76.2 | 11 / 35 | 4087 |
| 2 | 3 | 60.9 | 71.7 | 7 / 35 | 3717 |
| 3 | 2 | 62.6 | 77.8 | 7 / 35 | 3992 |
| 4 | 1 | 64.0 | 78.7 | 9 / 35 | 4502 |
| 5 | 1 | 63.9 | 81.3 | 8 / 35 | 4177 |
| 6 | 1 | 64.5 | 82.2 | 13 / 35 | 4045 |
| 7 | 1 | 64.1 | 82.2 | 8 / 35 | 4299 |
| 8 | 2 | 63.4 | 78.7 | 7 / 35 | 4491 |
| 9 | 1 | 64.8 | 79.7 | 11 / 35 | 4695 |
| 10 | 1 | 62.2 | 74.0 | 9 / 35 | 4173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 52 | 40% |
| ejb.Polaris 1.0.1 | 46 | 63% |
| ne.Chimera 1.2 | 33 | 30% |
| tvv.micro.Antares 1.1.1 | 29 | 45% |
| vStar.RAFzilla 2.15 | 24 | 58% |
| kurios.DOSexe .9b | 4 | 50% |
| donjezza.Muncho 1.0 | 3 | 33% |
| sam.Samspin 1.0 | 1 | 0% |

Hadur died in 261 of 350 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ne.Chimera 1.2 | 77 | 30% | 93 |
| DTF.Kludgy 1.2b | 68 | 26% | 83 |
| ejb.Polaris 1.0.1 | 36 | 14% | 66 |
| tvv.micro.Antares 1.1.1 | 31 | 12% | 33 |
| vStar.RAFzilla 2.15 | 23 | 9% | 35 |
| sam.Samspin 1.0 | 11 | 4% | 11 |
| kurios.DOSexe .9b | 6 | 2% | 11 |
| donjezza.Muncho 1.0 | 6 | 2% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 1% | 5 |

## Melee bench: F11

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 63.4 | 56 / 350 | 4.29 | 12.5% | 31922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.5% | 143 |
| cx.mini.Nimrod 0.55 | 2.5 | 13.5% | 54 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 12.5% | 56 |
| djc.DynaBot 0.1.1 | 3.9 | 11.3% | 31 |
| rdt199.Warlord 0.73 | 5.5 | 9.8% | 25 |
| br2.MobyDickBot 1.6 | 5.9 | 9.4% | 24 |
| uji.YellohFellah 1.0 | 6.6 | 8.5% | 17 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.9 | 5.7% | 1 |
| stelo.MirrorNano 1.3 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 64.1 | 3 / 35 | 3406 |
| 2 | 2 | 59.6 | 66.3 | 8 / 35 | 3408 |
| 3 | 3 | 57.5 | 63.2 | 6 / 35 | 3188 |
| 4 | 2 | 59.4 | 66.0 | 4 / 35 | 3701 |
| 5 | 4 | 51.5 | 49.8 | 3 / 35 | 2744 |
| 6 | 4 | 54.3 | 55.9 | 2 / 35 | 2972 |
| 7 | 3 | 57.1 | 63.2 | 4 / 35 | 3052 |
| 8 | 2 | 59.0 | 67.6 | 9 / 35 | 2840 |
| 9 | 2 | 59.5 | 65.4 | 9 / 35 | 3394 |
| 10 | 2 | 60.8 | 72.4 | 8 / 35 | 3217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 56% |
| cx.mini.Nimrod 0.55 | 22 | 64% |
| djc.DynaBot 0.1.1 | 11 | 73% |
| uji.YellohFellah 1.0 | 8 | 13% |
| br2.MobyDickBot 1.6 | 5 | 40% |
| rdt199.Warlord 0.73 | 3 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 109 | 37% | 136 |
| cx.mini.Nimrod 0.55 | 52 | 18% | 63 |
| rdt199.Warlord 0.73 | 36 | 12% | 39 |
| djc.DynaBot 0.1.1 | 29 | 10% | 38 |
| uji.YellohFellah 1.0 | 20 | 7% | 24 |
| KiraNL.Chupacabra 0.4 | 14 | 5% | 15 |
| br2.MobyDickBot 1.6 | 12 | 4% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 4% | 12 |
| stelo.MirrorNano 1.3 | 10 | 3% | 10 |

## Melee bench: F12

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 65.5 | 37 / 350 | 4.11 | 12.4% | 28676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.3% | 100 |
| bts.wiki.RipCurl 0.9b | 1.9 | 14.4% | 91 |
| darkcanuck.Leon 1.01 | 2.5 | 13.5% | 70 |
| hadur117.nano.SanaroS0 0.1 | 3.8 | 12.4% | 37 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.9% | 36 |
| jrm.Test0 1.0 | 6.2 | 8.7% | 7 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.3% | 4 |
| jp.Perpy 16.0 | 7.4 | 7.3% | 2 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.7% | 5 |
| stuff.Vlad 0.1 | 9.6 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 66.3 | 5 / 35 | 3111 |
| 2 | 4 | 55.3 | 60.0 | 3 / 35 | 2710 |
| 3 | 4 | 57.2 | 64.1 | 4 / 35 | 2979 |
| 4 | 3 | 59.6 | 71.4 | 4 / 35 | 2969 |
| 5 | 4 | 57.6 | 66.7 | 4 / 35 | 2711 |
| 6 | 4 | 56.2 | 62.2 | 4 / 35 | 2756 |
| 7 | 3 | 61.1 | 76.2 | 3 / 35 | 2965 |
| 8 | 4 | 56.7 | 63.8 | 4 / 35 | 2828 |
| 9 | 4 | 56.9 | 63.8 | 3 / 35 | 3040 |
| 10 | 4 | 54.7 | 60.0 | 3 / 35 | 2607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 39 | 23% |
| bts.wiki.RipCurl 0.9b | 38 | 29% |
| darkcanuck.Leon 1.01 | 32 | 28% |
| brainfade.melee.Genghis 0.36 | 14 | 36% |
| jaybot.bots.Oddball 4.0 | 3 | 33% |
| jrm.Test0 1.0 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 75 | 24% | 83 |
| nat.PallasHawk 1.0 | 67 | 21% | 75 |
| darkcanuck.Leon 1.01 | 64 | 20% | 77 |
| brainfade.melee.Genghis 0.36 | 36 | 12% | 38 |
| jrm.Test0 1.0 | 26 | 8% | 29 |
| cs.sheldor.Talon 1.1 | 16 | 5% | 17 |
| jp.Perpy 16.0 | 14 | 4% | 14 |
| jaybot.bots.Oddball 4.0 | 11 | 4% | 13 |
| stuff.Vlad 0.1 | 4 | 1% | 4 |

## Melee bench: F13

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 68.9 | 28 / 350 | 3.80 | 12.6% | 32256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.3% | 99 |
| mn.Combat 3.25.0 | 1.5 | 17.2% | 149 |
| hadur117.nano.SanaroS0 0.1 | 3.7 | 12.6% | 28 |
| shinh.Entangled 0.3 | 3.9 | 12.3% | 43 |
| gh.micro.Gruweltje 0.7 | 4.4 | 11.7% | 30 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.1 | 5.5% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 71.7 | 1 / 35 | 3423 |
| 2 | 5 | 58.6 | 69.8 | 3 / 35 | 2787 |
| 3 | 3 | 61.7 | 73.7 | 5 / 35 | 3679 |
| 4 | 3 | 59.4 | 67.6 | 5 / 35 | 3235 |
| 5 | 3 | 58.9 | 68.3 | 2 / 35 | 3216 |
| 6 | 3 | 59.7 | 72.1 | 2 / 35 | 3013 |
| 7 | 3 | 61.5 | 75.9 | 4 / 35 | 3314 |
| 8 | 4 | 56.9 | 61.6 | 4 / 35 | 3228 |
| 9 | 5 | 56.9 | 60.6 | 1 / 35 | 3422 |
| 10 | 5 | 57.7 | 67.9 | 1 / 35 | 2939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 52 | 29% |
| ags.Glacier 0.2.11 | 40 | 13% |
| shinh.Entangled 0.3 | 16 | 44% |
| gh.micro.Gruweltje 0.7 | 9 | 0% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 111 | 34% | 115 |
| mn.Combat 3.25.0 | 93 | 29% | 108 |
| shinh.Entangled 0.3 | 40 | 12% | 47 |
| gh.micro.Gruweltje 0.7 | 40 | 12% | 41 |
| stelo.Wang 1.0 | 22 | 7% | 22 |
| maribo.FollowFire 1 | 7 | 2% | 7 |
| apc.Colossus2 0.17 | 6 | 2% | 7 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 72.9 | 76 / 350 | 3.44 | 13.9% | 34300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.4% | 143 |
| hadur117.nano.SanaroS0 0.1 | 2.4 | 13.9% | 76 |
| catcat20.shape.Theta 0.018 | 2.7 | 12.6% | 70 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.6 | 10.6% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 5.1 | 10.3% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 6.1 | 9.9% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 6.7 | 9.5% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.4 | 8.5% | 22 |
| pa.Improved 1.0 | 9.0 | 5.4% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 66.7 | 3 / 35 | 3066 |
| 2 | 2 | 62.6 | 77.1 | 7 / 35 | 3789 |
| 3 | 2 | 62.2 | 76.8 | 8 / 35 | 3379 |
| 4 | 2 | 64.5 | 80.6 | 12 / 35 | 3891 |
| 5 | 3 | 59.0 | 66.3 | 4 / 35 | 3047 |
| 6 | 3 | 59.7 | 70.5 | 9 / 35 | 2963 |
| 7 | 2 | 61.1 | 69.5 | 8 / 35 | 3809 |
| 8 | 2 | 63.5 | 78.4 | 9 / 35 | 3717 |
| 9 | 3 | 60.2 | 69.8 | 7 / 35 | 3351 |
| 10 | 2 | 60.9 | 73.0 | 9 / 35 | 3288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 88 | 33% |
| catcat20.shape.Theta 0.018 | 39 | 51% |
| Lo_Ian.Gandalf_V4 4.0 | 10 | 30% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| sanyi.mikrobi.Roberto 1.0 | 6 | 67% |
| pa.Improved 1.0 | 3 | 33% |

Hadur died in 274 of 350 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 126 | 46% | 153 |
| catcat20.shape.Theta 0.018 | 43 | 16% | 59 |
| dmh.robocode.robot.RedDwarf 0.4 | 27 | 10% | 33 |
| Lo_Ian.Gandalf_V4 4.0 | 24 | 9% | 33 |
| sheldor.micro.PointInLineRRAL 1.0 | 20 | 7% | 30 |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 5% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 13 | 5% | 16 |
| pa.Improved 1.0 | 5 | 2% | 6 |
| sample.TrackFire 1.0 | 2 | 1% | 3 |

## Melee bench: F15

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 63.6 | 41 / 350 | 4.28 | 12.8% | 37018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.9 | 14.9% | 84 |
| emp.Yngwie 1.11 | 2.1 | 13.9% | 111 |
| mld.DustBunny 3.8 | 2.9 | 13.4% | 37 |
| hadur117.nano.SanaroS0 0.1 | 3.3 | 12.8% | 41 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.1% | 16 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.6% | 50 |
| Grystrion.TrackerWO 1.0 | 7.6 | 7.0% | 3 |
| lambdaxy.TBot 0.1 | 7.6 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.6% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 69.2 | 6 / 35 | 3826 |
| 2 | 2 | 60.6 | 70.2 | 3 / 35 | 3848 |
| 3 | 4 | 56.4 | 59.7 | 2 / 35 | 3475 |
| 4 | 4 | 57.5 | 58.4 | 4 / 35 | 3773 |
| 5 | 4 | 57.5 | 61.6 | 3 / 35 | 3652 |
| 6 | 6 | 56.4 | 58.1 | 2 / 35 | 3330 |
| 7 | 2 | 60.2 | 66.7 | 6 / 35 | 3984 |
| 8 | 2 | 59.4 | 67.3 | 4 / 35 | 3789 |
| 9 | 4 | 56.7 | 59.4 | 5 / 35 | 3471 |
| 10 | 2 | 59.7 | 65.4 | 6 / 35 | 3870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 37 | 35% |
| cb.nano.Insomnia 1.0 | 20 | 75% |
| kawigi.micro.Shiz 1.1 | 16 | 6% |
| mld.DustBunny 3.8 | 15 | 20% |
| kawigi.robot.Girl 1.2 | 15 | 53% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 0% |

Hadur died in 309 of 350 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 72 | 23% | 94 |
| mld.DustBunny 3.8 | 72 | 23% | 82 |
| kawigi.micro.Shiz 1.1 | 66 | 21% | 72 |
| cb.nano.Insomnia 1.0 | 35 | 11% | 30 |
| kawigi.robot.Girl 1.2 | 21 | 7% | 26 |
| Grystrion.TrackerWO 1.0 | 15 | 5% | 15 |
| divineomega.TrialBot 0.003 | 13 | 4% | 15 |
| lambdaxy.TBot 0.1 | 12 | 4% | 12 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 4 |

## Melee bench: F16

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 63.7 | 28 / 350 | 4.27 | 13.1% | 40950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.4% | 178 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.4% | 36 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 13.1% | 28 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 11.0% | 75 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.2% | 7 |
| tvv.nano.Polaris 1.2 | 5.6 | 9.1% | 8 |
| stelo.IntrinsicVolatility 1.4 | 6.6 | 8.1% | 10 |
| divineomega.DivineBot 1.9.4.5 | 8.4 | 5.5% | 8 |
| repositorio.NanoStep 1.0 | 8.9 | 5.4% | 0 |
| asd.Cthulhu 1.3 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 67.9 | 1 / 35 | 4374 |
| 2 | 3 | 58.8 | 61.3 | 4 / 35 | 4153 |
| 3 | 3 | 61.0 | 68.3 | 4 / 35 | 3842 |
| 4 | 3 | 58.6 | 61.6 | 2 / 35 | 3993 |
| 5 | 3 | 60.6 | 64.8 | 6 / 35 | 4209 |
| 6 | 3 | 57.6 | 58.1 | 2 / 35 | 3982 |
| 7 | 3 | 60.1 | 65.1 | 1 / 35 | 4369 |
| 8 | 3 | 59.9 | 64.8 | 2 / 35 | 4165 |
| 9 | 3 | 61.2 | 69.2 | 4 / 35 | 3980 |
| 10 | 3 | 56.4 | 56.2 | 2 / 35 | 3883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 79 | 11% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 38% |
| techdude.forest.FlamingForest 1.1 | 9 | 0% |
| bvh.fnr.Fenrir 0.36l | 6 | 67% |
| tvv.nano.Polaris 1.2 | 4 | 75% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 1136. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 144 | 45% | 152 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 74 | 23% | 83 |
| bvh.fnr.Fenrir 0.36l | 39 | 12% | 40 |
| techdude.forest.FlamingForest 1.1 | 26 | 8% | 27 |
| stelo.IntrinsicVolatility 1.4 | 16 | 5% | 20 |
| tvv.nano.Polaris 1.2 | 9 | 3% | 11 |
| asd.Cthulhu 1.3 | 7 | 2% | 7 |
| divineomega.DivineBot 1.9.4.5 | 5 | 2% | 8 |
| repositorio.NanoStep 1.0 | 2 | 1% | 2 |

## Melee bench: F17

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 63.0 | 48 / 350 | 4.33 | 12.6% | 36790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.0 | 14.7% | 76 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.9% | 77 |
| cx.BlestPain 1.41 | 3.4 | 13.0% | 68 |
| hadur117.nano.SanaroS0 0.1 | 3.9 | 12.6% | 48 |
| ahf.NanoAndrew .4 | 4.9 | 11.6% | 44 |
| nic.Nicator 2.4 | 5.5 | 11.3% | 32 |
| maribo.melee.BMV 0.1 | 7.0 | 8.9% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.4 | 5.6% | 2 |
| tex.Longbot 0.4 | 8.6 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.7 | 66.7 | 6 / 35 | 3523 |
| 2 | 3 | 62.0 | 71.4 | 7 / 35 | 4063 |
| 3 | 4 | 58.4 | 62.2 | 3 / 35 | 3825 |
| 4 | 4 | 58.2 | 63.5 | 3 / 35 | 3604 |
| 5 | 4 | 58.0 | 61.3 | 6 / 35 | 3554 |
| 6 | 5 | 56.4 | 59.0 | 4 / 35 | 3353 |
| 7 | 5 | 57.3 | 60.0 | 4 / 35 | 3673 |
| 8 | 3 | 58.9 | 61.9 | 6 / 35 | 4002 |
| 9 | 3 | 60.1 | 67.6 | 4 / 35 | 3946 |
| 10 | 4 | 55.9 | 56.5 | 5 / 35 | 3247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 36 | 25% |
| oog.melee.Mercutio 1.0 | 26 | 58% |
| cx.BlestPain 1.41 | 20 | 75% |
| ahf.NanoAndrew .4 | 13 | 31% |
| nic.Nicator 2.4 | 10 | 40% |
| maribo.melee.BMV 0.1 | 2 | 50% |

Hadur died in 302 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 82 | 27% | 94 |
| ahf.NanoAndrew .4 | 64 | 21% | 68 |
| oog.melee.Mercutio 1.0 | 42 | 14% | 54 |
| cx.BlestPain 1.41 | 40 | 13% | 52 |
| nic.Nicator 2.4 | 36 | 12% | 42 |
| maribo.melee.BMV 0.1 | 19 | 6% | 21 |
| tex.Longbot 0.4 | 10 | 3% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 8 | 3% | 8 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 67.2 | 67 / 350 | 3.95 | 13.3% | 34019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.7 | 13.9% | 93 |
| hadur117.nano.SanaroS0 0.1 | 1.9 | 13.3% | 67 |
| agd.Mooserwirt2 2.7 | 2.8 | 13.0% | 76 |
| uji.DBH 1.1 | 4.4 | 11.3% | 37 |
| ratosh.Nobo 0.21 | 4.9 | 10.7% | 12 |
| spinnercat.Robovirus 2.718 | 5.4 | 10.0% | 12 |
| sigterm.Sigterm 1.0 | 7.1 | 8.8% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.7% | 10 |
| stelo.WangRobot 1.0 | 9.3 | 6.0% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.2 | 57.8 | 5 / 35 | 3182 |
| 2 | 1 | 59.8 | 69.2 | 6 / 35 | 3690 |
| 3 | 1 | 63.5 | 77.1 | 11 / 35 | 3853 |
| 4 | 1 | 60.9 | 72.1 | 9 / 35 | 3315 |
| 5 | 3 | 57.0 | 62.9 | 5 / 35 | 3308 |
| 6 | 3 | 58.7 | 67.0 | 8 / 35 | 3330 |
| 7 | 1 | 59.9 | 70.5 | 5 / 35 | 3685 |
| 8 | 1 | 61.0 | 72.1 | 9 / 35 | 3761 |
| 9 | 2 | 57.2 | 66.3 | 5 / 35 | 2892 |
| 10 | 3 | 54.4 | 56.8 | 4 / 35 | 3003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 39 | 44% |
| agd.Mooserwirt2 2.7 | 36 | 42% |
| sigterm.Sigterm 1.0 | 18 | 61% |
| uji.DBH 1.1 | 17 | 41% |
| spinnercat.Robovirus 2.718 | 13 | 69% |
| ratosh.Nobo 0.21 | 8 | 50% |
| stelo.WangRobot 1.0 | 7 | 57% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 0% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 0% |

Hadur died in 284 of 350 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 88 | 31% | 108 |
| agd.Mooserwirt2 2.7 | 55 | 19% | 73 |
| ratosh.Nobo 0.21 | 32 | 11% | 37 |
| spinnercat.Robovirus 2.718 | 26 | 9% | 32 |
| uji.DBH 1.1 | 25 | 9% | 28 |
| sigterm.Sigterm 1.0 | 22 | 8% | 27 |
| kawigi.mini.Fhqwhgads 1.1 | 17 | 6% | 20 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 11 | 4% | 12 |
| stelo.WangRobot 1.0 | 8 | 3% | 12 |

## Melee bench: F19

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 78.0 | 88 / 350 | 2.98 | 15.5% | 41109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.6 | 16.6% | 116 |
| mld.Infinity 2.2 | 2.0 | 15.7% | 105 |
| hadur117.nano.SanaroS0 0.1 | 2.4 | 15.5% | 88 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.5% | 7 |
| erdnis.Rover 0.3 | 5.0 | 10.5% | 8 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.9% | 10 |
| mbh.Mbh 0.1 | 7.5 | 7.1% | 1 |
| pac.ABC 2.1 | 7.9 | 7.0% | 11 |
| pbg.R2D2 1.0 | 8.6 | 6.2% | 4 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 85.1 | 12 / 35 | 4174 |
| 2 | 3 | 64.2 | 77.8 | 8 / 35 | 3946 |
| 3 | 3 | 64.2 | 78.4 | 8 / 35 | 4155 |
| 4 | 3 | 65.5 | 80.0 | 12 / 35 | 4077 |
| 5 | 1 | 65.3 | 80.0 | 9 / 35 | 4410 |
| 6 | 3 | 61.4 | 70.2 | 5 / 35 | 3540 |
| 7 | 2 | 65.5 | 80.0 | 9 / 35 | 4283 |
| 8 | 2 | 65.0 | 77.5 | 9 / 35 | 4473 |
| 9 | 3 | 64.0 | 74.9 | 9 / 35 | 4059 |
| 10 | 3 | 64.1 | 76.5 | 7 / 35 | 3992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 86 | 55% |
| davidalves.net.DuelistMiniMelee 1.2 | 77 | 14% |
| krillr.mini.JointStrike 2.0.0 | 14 | 86% |
| erdnis.Rover 0.3 | 8 | 88% |
| pac.ABC 2.1 | 7 | 71% |
| pbg.R2D2 1.0 | 7 | 57% |
| patson.PatsonTestBot 1.0 | 3 | 33% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 127 | 48% | 168 |
| mld.Infinity 2.2 | 59 | 22% | 40 |
| erdnis.Rover 0.3 | 24 | 9% | 42 |
| krillr.mini.JointStrike 2.0.0 | 21 | 8% | 38 |
| patson.PatsonTestBot 1.0 | 17 | 6% | 22 |
| pac.ABC 2.1 | 9 | 3% | 15 |
| pbg.R2D2 1.0 | 4 | 2% | 10 |
| mbh.Mbh 0.1 | 2 | 1% | 8 |

## Melee bench: F20

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 69.7 | 63 / 350 | 3.73 | 13.8% | 37144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.7% | 148 |
| hadur117.nano.SanaroS0 0.1 | 2.1 | 13.8% | 63 |
| nz.jdc.nano.GridFu 1.0 | 3.4 | 11.5% | 19 |
| fwb.Nine 1.0.1 | 4.2 | 10.9% | 41 |
| catcat20.Rabbit 0.001 | 4.9 | 10.0% | 35 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 9.0% | 13 |
| djdjdj.NanoSkunk10 1.0 | 6.6 | 9.1% | 16 |
| bayen.nut.Squirrel 1.615 | 7.3 | 8.1% | 12 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 68.6 | 5 / 35 | 3666 |
| 2 | 3 | 56.7 | 61.3 | 6 / 35 | 3290 |
| 3 | 2 | 60.5 | 69.2 | 9 / 35 | 3691 |
| 4 | 2 | 61.1 | 73.7 | 6 / 35 | 3593 |
| 5 | 2 | 60.7 | 70.2 | 6 / 35 | 3806 |
| 6 | 2 | 61.4 | 71.7 | 7 / 35 | 3904 |
| 7 | 2 | 60.4 | 70.5 | 3 / 35 | 3969 |
| 8 | 2 | 59.7 | 66.0 | 5 / 35 | 4002 |
| 9 | 2 | 62.9 | 75.9 | 11 / 35 | 3615 |
| 10 | 2 | 59.8 | 69.8 | 5 / 35 | 3608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 41% |
| fwb.Nine 1.0.1 | 25 | 64% |
| catcat20.Rabbit 0.001 | 15 | 47% |
| nz.jdc.nano.GridFu 1.0 | 10 | 30% |
| m3thos.mini.Eva01 0.5.5 | 4 | 0% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 0% |

Hadur died in 288 of 350 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 133 | 46% | 156 |
| fwb.Nine 1.0.1 | 31 | 11% | 31 |
| nz.jdc.nano.GridFu 1.0 | 30 | 10% | 43 |
| catcat20.Rabbit 0.001 | 26 | 9% | 38 |
| djdjdj.NanoSkunk10 1.0 | 20 | 7% | 26 |
| m3thos.mini.Eva01 0.5.5 | 18 | 6% | 18 |
| bayen.nut.Squirrel 1.615 | 14 | 5% | 21 |
| sample.MyFirstJuniorRobot 1.0 | 8 | 3% | 9 |
| ntc.ControlledChaos 1.1.4 | 7 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.3 | 137 / 350 | 2.78 | 16.6% | 45471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 17.1% | 140 |
| hadur117.nano.SanaroS0 0.1 | 1.7 | 16.6% | 137 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.8% | 22 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 25 |
| eld.Hmm 1.0 | 5.4 | 8.8% | 19 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.6% | 7 |
| fire219.CatBot 1.0 | 7.8 | 6.2% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.8% | 1 |
| PSW.Relentless 0.1 | 8.4 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 78.7 | 15 / 35 | 4527 |
| 2 | 1 | 65.9 | 82.5 | 12 / 35 | 4510 |
| 3 | 2 | 66.6 | 81.0 | 17 / 35 | 4555 |
| 4 | 2 | 64.8 | 76.5 | 10 / 35 | 4692 |
| 5 | 1 | 67.3 | 82.5 | 18 / 35 | 4785 |
| 6 | 1 | 66.3 | 82.9 | 14 / 35 | 4665 |
| 7 | 1 | 65.3 | 77.8 | 15 / 35 | 4445 |
| 8 | 3 | 63.5 | 76.2 | 14 / 35 | 3771 |
| 9 | 2 | 66.0 | 79.7 | 11 / 35 | 4987 |
| 10 | 2 | 66.3 | 84.8 | 11 / 35 | 4534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 125 | 64% |
| dummy.mini.Scimitar 1.01 | 43 | 86% |
| cf.RiO.RiOx 4.2.1 | 15 | 47% |
| eld.Hmm 1.0 | 7 | 71% |
| oa.weak.BotherBot 0.1 | 5 | 60% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 213 of 350 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 81 | 38% | 138 |
| dummy.mini.Scimitar 1.01 | 56 | 26% | 105 |
| cf.RiO.RiOx 4.2.1 | 43 | 20% | 55 |
| oa.weak.BotherBot 0.1 | 13 | 6% | 17 |
| eld.Hmm 1.0 | 5 | 2% | 18 |
| el.JumpShoot 0.2 | 5 | 2% | 7 |
| arthord.MannyPacquiao Beta | 5 | 2% | 5 |
| PSW.Relentless 0.1 | 3 | 1% | 2 |
| fire219.CatBot 1.0 | 2 | 1% | 3 |

## Melee bench: F23

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 75.1 | 80 / 350 | 3.24 | 14.7% | 37249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.7% | 153 |
| cre.Karolos 0.32 | 2.2 | 15.3% | 66 |
| hadur117.nano.SanaroS0 0.1 | 2.8 | 14.7% | 80 |
| stelo.AreaTargetingBot 1.1 | 4.1 | 11.5% | 26 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.2% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 9.3% | 5 |
| sample.Walls 1.0 | 6.8 | 8.6% | 8 |
| cw.megas.Blade 0.8 | 7.6 | 8.1% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.4 | 73.0 | 9 / 35 | 3635 |
| 2 | 3 | 64.3 | 76.2 | 8 / 35 | 4035 |
| 3 | 3 | 64.6 | 79.0 | 8 / 35 | 4004 |
| 4 | 3 | 63.4 | 71.7 | 7 / 35 | 4014 |
| 5 | 3 | 62.2 | 71.1 | 6 / 35 | 3713 |
| 6 | 2 | 65.2 | 80.3 | 10 / 35 | 3813 |
| 7 | 3 | 62.5 | 75.2 | 7 / 35 | 3210 |
| 8 | 3 | 64.3 | 76.8 | 8 / 35 | 3493 |
| 9 | 2 | 62.9 | 75.2 | 6 / 35 | 3397 |
| 10 | 3 | 64.0 | 72.4 | 11 / 35 | 3935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 92 | 43% |
| cre.Karolos 0.32 | 42 | 36% |
| stelo.AreaTargetingBot 1.1 | 19 | 42% |
| sample.Walls 1.0 | 12 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 80% |
| stelo.RamTrackSurfer 1.2 | 5 | 80% |

Hadur died in 270 of 350 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 120 | 44% | 163 |
| cre.Karolos 0.32 | 66 | 24% | 82 |
| stelo.AreaTargetingBot 1.1 | 36 | 13% | 40 |
| sample.Walls 1.0 | 17 | 6% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 14 | 5% | 18 |
| stelo.RamTrackSurfer 1.2 | 11 | 4% | 16 |
| cw.megas.Blade 0.8 | 5 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 2 |

## Melee bench: F24

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 57.2 | 36 / 350 | 4.85 | 11.0% | 28280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.4 | 15.0% | 92 |
| davidalves.Phoenix 0.54 | 2.0 | 14.0% | 81 |
| florent.XSeries.X2 0.12 | 3.1 | 13.2% | 65 |
| pedersen.Ugluk 1.1.1 | 3.7 | 12.3% | 50 |
| hadur117.nano.SanaroS0 0.1 | 5.0 | 11.0% | 36 |
| oog.melee.Corsair 1.0 | 5.9 | 9.5% | 10 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.4% | 15 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.8% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 5.2% | 1 |
| evd.X1 0.01 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 51.1 | 50.2 | 3 / 35 | 2613 |
| 2 | 5 | 53.8 | 56.2 | 7 / 35 | 2478 |
| 3 | 5 | 52.8 | 53.3 | 4 / 35 | 2634 |
| 4 | 6 | 50.7 | 50.2 | 3 / 35 | 2550 |
| 5 | 5 | 55.2 | 58.4 | 4 / 35 | 2969 |
| 6 | 4 | 55.8 | 59.4 | 4 / 35 | 2981 |
| 7 | 5 | 55.6 | 59.0 | 4 / 35 | 2943 |
| 8 | 5 | 54.3 | 57.1 | 3 / 35 | 2839 |
| 9 | 5 | 56.4 | 62.9 | 1 / 35 | 2864 |
| 10 | 4 | 58.2 | 65.4 | 3 / 35 | 3409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 32 | 38% |
| davidalves.Phoenix 0.54 | 19 | 47% |
| florent.XSeries.X2 0.12 | 13 | 54% |
| pedersen.Ugluk 1.1.1 | 12 | 42% |
| stelo.SoJNanoMelee 1.1 | 9 | 11% |
| oog.melee.Corsair 1.0 | 4 | 50% |

Hadur died in 316 of 350 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 71 | 22% | 86 |
| davidalves.Phoenix 0.54 | 64 | 20% | 74 |
| florent.XSeries.X2 0.12 | 55 | 17% | 60 |
| pedersen.Ugluk 1.1.1 | 53 | 17% | 54 |
| stelo.SoJNanoMelee 1.1 | 25 | 8% | 26 |
| oog.melee.Corsair 1.0 | 20 | 6% | 24 |
| lunchie.Lunchbox 0.93 | 14 | 4% | 14 |
| evd.X1 0.01 | 7 | 2% | 7 |
| as.FrankTheTank 1.3 | 5 | 2% | 5 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 62.4 | 44 / 350 | 4.38 | 12.1% | 28631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.2% | 88 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.6% | 66 |
| jdw.Hurricane 1.4 | 3.1 | 12.6% | 60 |
| hadur117.nano.SanaroS0 0.1 | 3.6 | 12.1% | 44 |
| gre.svman4.Morfeas 1.4.1 | 4.7 | 10.9% | 37 |
| ds.Oo 2.2 | 6.3 | 9.4% | 21 |
| gjr.Cephalosporin 0.1 | 7.3 | 8.5% | 25 |
| awesomeness.Elite 1.0 | 7.7 | 7.6% | 7 |
| adt.Ar2 1.1 | 8.6 | 6.8% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.8 | 58.1 | 4 / 35 | 2796 |
| 2 | 2 | 60.9 | 73.0 | 7 / 35 | 3033 |
| 3 | 4 | 58.0 | 64.8 | 5 / 35 | 3062 |
| 4 | 3 | 56.8 | 63.8 | 5 / 35 | 2737 |
| 5 | 4 | 56.9 | 62.5 | 3 / 35 | 3008 |
| 6 | 4 | 56.2 | 60.6 | 4 / 35 | 2798 |
| 7 | 3 | 56.6 | 63.5 | 4 / 35 | 2721 |
| 8 | 3 | 56.8 | 61.0 | 8 / 35 | 2938 |
| 9 | 4 | 55.0 | 57.8 | 2 / 35 | 2809 |
| 10 | 4 | 54.6 | 59.0 | 2 / 35 | 2729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 36 | 17% |
| voidious.micro.BlitzBat 1.05 | 29 | 17% |
| jdw.Hurricane 1.4 | 25 | 64% |
| gre.svman4.Morfeas 1.4.1 | 15 | 60% |
| gjr.Cephalosporin 0.1 | 8 | 25% |
| ds.Oo 2.2 | 4 | 50% |
| adt.Ar2 1.1 | 3 | 67% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 70 | 23% | 76 |
| voidious.micro.BlitzBat 1.05 | 69 | 23% | 79 |
| jdw.Hurricane 1.4 | 46 | 15% | 59 |
| gre.svman4.Morfeas 1.4.1 | 35 | 11% | 40 |
| ds.Oo 2.2 | 33 | 11% | 38 |
| adt.Ar2 1.1 | 19 | 6% | 21 |
| gjr.Cephalosporin 0.1 | 17 | 6% | 18 |
| awesomeness.Elite 1.0 | 12 | 4% | 13 |
| amk.ChumbaMini 0.2 | 5 | 2% | 6 |

## Melee bench: F26

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 70.8 | 51 / 350 | 3.63 | 13.7% | 38943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.2 | 16.6% | 141 |
| hadur117.nano.SanaroS0 0.1 | 2.2 | 13.7% | 51 |
| shu.nitro.LENIN .T34 | 3.1 | 12.9% | 71 |
| lrem.Spectre 0.4.4 | 3.6 | 12.5% | 33 |
| js.PinBall 1.6 | 5.5 | 10.8% | 17 |
| gh.mini.GrubbmOne 1.0 | 5.6 | 10.7% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.4% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.7% | 6 |
| sample.SpinBot 1.0 | 8.8 | 5.4% | 4 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 70.2 | 6 / 35 | 4044 |
| 2 | 3 | 61.9 | 73.3 | 5 / 35 | 4018 |
| 3 | 2 | 62.1 | 75.2 | 5 / 35 | 3865 |
| 4 | 2 | 59.6 | 68.3 | 3 / 35 | 3819 |
| 5 | 2 | 61.4 | 71.4 | 6 / 35 | 3764 |
| 6 | 2 | 61.2 | 71.1 | 4 / 35 | 3728 |
| 7 | 3 | 60.0 | 68.6 | 3 / 35 | 3840 |
| 8 | 1 | 62.1 | 72.7 | 9 / 35 | 4085 |
| 9 | 2 | 60.2 | 68.9 | 5 / 35 | 3658 |
| 10 | 3 | 61.3 | 67.9 | 5 / 35 | 4122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 60 | 23% |
| shu.nitro.LENIN .T34 | 38 | 39% |
| lrem.Spectre 0.4.4 | 18 | 56% |
| js.PinBall 1.6 | 11 | 45% |
| gh.mini.GrubbmOne 1.0 | 9 | 33% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 33% |

Hadur died in 300 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 113 | 38% | 126 |
| shu.nitro.LENIN .T34 | 46 | 15% | 64 |
| gh.mini.GrubbmOne 1.0 | 41 | 14% | 45 |
| lrem.Spectre 0.4.4 | 38 | 13% | 43 |
| js.PinBall 1.6 | 23 | 8% | 28 |
| jaybot.adv.bots.JayBot 2.0 | 23 | 8% | 25 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 3% | 11 |
| sample.SpinBot 1.0 | 8 | 3% | 8 |

## Melee bench: F27

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 64.2 | 47 / 350 | 4.22 | 12.2% | 29429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.1 | 16.2% | 143 |
| hadur117.nano.SanaroS0 0.1 | 3.2 | 12.2% | 47 |
| wee.Gem 1.8.4 | 3.4 | 12.2% | 64 |
| sheldor.melee.nano.TestMelee 0.1 | 3.6 | 11.9% | 46 |
| EH.Eagle 1.0.6 | 4.3 | 11.5% | 33 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 8.9% | 10 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.3% | 6 |
| joe.ADinosaur 1.0 | 7.6 | 7.5% | 2 |
| caimano.Furia_Ceca 0.22 | 8.6 | 7.1% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 67.3 | 7 / 35 | 3359 |
| 2 | 4 | 54.5 | 61.0 | 2 / 35 | 2629 |
| 3 | 2 | 57.3 | 67.9 | 5 / 35 | 2590 |
| 4 | 4 | 55.7 | 63.8 | 3 / 35 | 2623 |
| 5 | 2 | 60.5 | 70.8 | 6 / 35 | 3217 |
| 6 | 2 | 57.9 | 67.9 | 6 / 35 | 2807 |
| 7 | 7 | 48.9 | 36.5 | 1 / 35 | 3828 |
| 8 | 3 | 58.3 | 69.2 | 9 / 35 | 2584 |
| 9 | 4 | 57.2 | 67.3 | 3 / 35 | 2680 |
| 10 | 2 | 59.4 | 70.2 | 5 / 35 | 3112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 65 | 46% |
| wee.Gem 1.8.4 | 24 | 21% |
| EH.Eagle 1.0.6 | 17 | 41% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 42% |
| techdude.kombat.FlamingKombat 1.5 | 1 | 0% |
| throxbot.ThroxBot 0.1 | 1 | 0% |
| joe.ADinosaur 1.0 | 1 | 0% |

Hadur died in 306 of 350 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 100 | 33% | 132 |
| sheldor.melee.nano.TestMelee 0.1 | 52 | 17% | 56 |
| wee.Gem 1.8.4 | 37 | 12% | 42 |
| EH.Eagle 1.0.6 | 36 | 12% | 42 |
| joe.ADinosaur 1.0 | 23 | 8% | 23 |
| caimano.Furia_Ceca 0.22 | 20 | 7% | 20 |
| techdude.kombat.FlamingKombat 1.5 | 19 | 6% | 19 |
| cs.Grudge 1.0 | 10 | 3% | 10 |
| throxbot.ThroxBot 0.1 | 6 | 2% | 6 |
3 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 77.5 | 113 / 350 | 3.03 | 15.4% | 36316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.2 | 16.5% | 122 |
| hadur117.nano.SanaroS0 0.1 | 1.9 | 15.4% | 113 |
| uji.Antique 1.0 | 3.1 | 12.5% | 63 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.7% | 25 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.5% | 10 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.4% | 3 |
| ahr.ice.Ice 1.0.2 | 6.6 | 7.9% | 8 |
| matt.advanced.Katana 1.0 | 8.1 | 6.7% | 6 |
| stelo.Lifestealer 1.0 | 9.1 | 5.7% | 1 |
| stelo.PianistNano 1.2 | 9.6 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 75.2 | 9 / 35 | 3302 |
| 2 | 2 | 59.8 | 72.1 | 6 / 35 | 3063 |
| 3 | 1 | 65.2 | 80.6 | 13 / 35 | 4120 |
| 4 | 2 | 64.8 | 82.2 | 14 / 35 | 3664 |
| 5 | 3 | 61.1 | 69.8 | 9 / 35 | 3683 |
| 6 | 2 | 64.1 | 80.0 | 14 / 35 | 3663 |
| 7 | 2 | 63.0 | 77.1 | 10 / 35 | 3618 |
| 8 | 1 | 66.6 | 86.0 | 18 / 35 | 4030 |
| 9 | 2 | 60.9 | 71.7 | 9 / 35 | 3406 |
| 10 | 2 | 64.2 | 80.0 | 11 / 35 | 3767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 113 | 57% |
| uji.Antique 1.0 | 46 | 63% |
| qohnil.blot.BlotBot 3.61 | 13 | 38% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| ahr.ice.Ice 1.0.2 | 5 | 60% |
| amk.ChumbaWumba 0.3 | 3 | 33% |
| matt.advanced.Katana 1.0 | 3 | 33% |
| stelo.Lifestealer 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 238 of 350 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 86 | 36% | 126 |
| uji.Antique 1.0 | 48 | 20% | 79 |
| pfvicm.Sobieski 7.2.3b | 35 | 15% | 44 |
| qohnil.blot.BlotBot 3.61 | 23 | 10% | 37 |
| amk.ChumbaWumba 0.3 | 22 | 9% | 24 |
| ahr.ice.Ice 1.0.2 | 10 | 4% | 18 |
| matt.advanced.Katana 1.0 | 5 | 2% | 8 |
| stelo.Lifestealer 1.0 | 5 | 2% | 7 |
| stelo.PianistNano 1.2 | 4 | 2% | 6 |

## Melee bench: F29

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 65.3 | 44 / 350 | 4.12 | 13.1% | 34409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 16.1% | 112 |
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 16.4% | 125 |
| hadur117.nano.SanaroS0 0.1 | 3.3 | 13.1% | 44 |
| myl.micro.Troodon 1.10 | 3.8 | 12.7% | 24 |
| jok.PheonixM 0.1.2 | 4.9 | 11.2% | 18 |
| DBall.Anarchy 0.1 | 6.3 | 8.2% | 18 |
| ph.melee.ArcherME 0.3 | 6.7 | 8.1% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.7% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.5% | 3 |
| jangs.ns51 1.0 | 9.6 | 4.1% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 64.1 | 5 / 35 | 3483 |
| 2 | 3 | 58.9 | 65.1 | 4 / 35 | 3298 |
| 3 | 4 | 58.8 | 62.5 | 4 / 35 | 3389 |
| 4 | 3 | 59.3 | 65.4 | 3 / 35 | 3379 |
| 5 | 4 | 57.3 | 58.7 | 3 / 35 | 3006 |
| 6 | 3 | 60.8 | 66.0 | 6 / 35 | 3686 |
| 7 | 4 | 58.0 | 61.6 | 5 / 35 | 3233 |
| 8 | 3 | 61.8 | 69.8 | 4 / 35 | 3805 |
| 9 | 3 | 61.2 | 69.2 | 4 / 35 | 3743 |
| 10 | 3 | 61.8 | 70.5 | 6 / 35 | 3387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 51 | 25% |
| zyx.mega.YersiniaPestis 3.1 | 43 | 44% |
| myl.micro.Troodon 1.10 | 12 | 50% |
| DBall.Anarchy 0.1 | 9 | 44% |
| jok.PheonixM 0.1.2 | 5 | 40% |
| ap.Frederick 1.1 | 1 | 0% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 308 of 350 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 108 | 35% | 115 |
| zyx.mega.YersiniaPestis 3.1 | 76 | 25% | 92 |
| myl.micro.Troodon 1.10 | 47 | 15% | 54 |
| jok.PheonixM 0.1.2 | 35 | 11% | 40 |
| DBall.Anarchy 0.1 | 15 | 5% | 21 |
| ph.melee.ArcherME 0.3 | 10 | 3% | 10 |
| jangs.ns51 1.0 | 8 | 3% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 8 | 3% | 8 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.3 | 53.8 | 30 / 350 | 5.16 | 10.4% | 28029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.9 | 14.3% | 83 |
| oog.melee.Capulet 1.2 | 2.1 | 13.9% | 70 |
| darkcanuck.B26354 1.06 | 2.5 | 13.7% | 82 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.9% | 52 |
| hadur117.nano.SanaroS0 0.1 | 5.1 | 10.4% | 30 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.3% | 19 |
| ntc.Opposite 1.5 | 7.6 | 7.8% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.6% | 8 |
| tripphippy.Alice 1.1 | 8.2 | 7.7% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.0 | 54.6 | 4 / 35 | 2561 |
| 2 | 5 | 51.2 | 48.6 | 1 / 35 | 2749 |
| 3 | 5 | 54.7 | 58.1 | 2 / 35 | 2892 |
| 4 | 5 | 52.6 | 52.7 | 5 / 35 | 2485 |
| 5 | 6 | 53.1 | 51.1 | 2 / 35 | 3080 |
| 6 | 5 | 52.7 | 54.0 | 3 / 35 | 2528 |
| 7 | 5 | 53.1 | 53.7 | 2 / 35 | 2677 |
| 8 | 5 | 55.2 | 58.4 | 4 / 35 | 2989 |
| 9 | 5 | 53.8 | 51.1 | 4 / 35 | 3200 |
| 10 | 5 | 54.0 | 55.6 | 3 / 35 | 2868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 22 | 27% |
| catcat20.Matcha 0.006 | 19 | 58% |
| darkcanuck.B26354 1.06 | 19 | 16% |
| stelo.PastFuture 2.3.2 | 6 | 67% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| tripphippy.Alice 1.1 | 3 | 33% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 320 of 350 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 64 | 20% | 74 |
| oog.melee.Capulet 1.2 | 61 | 19% | 65 |
| darkcanuck.B26354 1.06 | 56 | 18% | 60 |
| stelo.PastFuture 2.3.2 | 52 | 16% | 60 |
| intruder.PrairieWolf 2.61 | 25 | 8% | 29 |
| ntc.Opposite 1.5 | 22 | 7% | 22 |
| tripphippy.Alice 1.1 | 21 | 7% | 21 |
| fowl3628800.LightningBolt 2.6.0 | 15 | 5% | 15 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.8 | 55.9 | 16 / 350 | 4.97 | 10.6% | 26785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 174 |
| gh.mini.Griezel 0.2 | 2.2 | 14.2% | 101 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 12.2% | 22 |
| d414.nano.Quantum 1.0.0 | 3.7 | 12.1% | 25 |
| hadur117.nano.SanaroS0 0.1 | 4.7 | 10.6% | 16 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.0% | 11 |
| fm.mammillarias 1.3 | 7.2 | 7.0% | 2 |
| timmit.nano.TimDog 0.33 | 8.0 | 6.5% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.3% | 1 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.5 | 54.6 | 3 / 35 | 2537 |
| 2 | 5 | 50.9 | 50.5 | 2 / 35 | 2330 |
| 3 | 3 | 57.5 | 64.4 | 1 / 35 | 2864 |
| 4 | 5 | 57.1 | 64.1 | 1 / 35 | 2647 |
| 5 | 4 | 52.7 | 54.3 | 1 / 35 | 2552 |
| 6 | 5 | 52.8 | 54.0 | 1 / 35 | 2586 |
| 7 | 5 | 53.4 | 54.0 | 2 / 35 | 2816 |
| 8 | 5 | 54.3 | 56.8 | 0 / 35 | 2804 |
| 9 | 5 | 53.7 | 54.6 | 1 / 35 | 2892 |
| 10 | 5 | 52.4 | 51.4 | 4 / 35 | 2757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 36 | 33% |
| gh.mini.Griezel 0.2 | 36 | 3% |
| d414.nano.Quantum 1.0.0 | 7 | 14% |
| spinnercat.micro.Tyger 0.1 | 6 | 17% |
| gh.nano.Grofvuil 0.2 | 3 | 33% |

Hadur died in 335 of 350 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 97 | 29% | 98 |
| abc.Shadow 3.84i | 81 | 24% | 93 |
| d414.nano.Quantum 1.0.0 | 45 | 13% | 46 |
| spinnercat.micro.Tyger 0.1 | 44 | 13% | 45 |
| fm.mammillarias 1.3 | 26 | 8% | 26 |
| gh.nano.Grofvuil 0.2 | 24 | 7% | 25 |
| timmit.nano.TimDog 0.33 | 7 | 2% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 75.4 | 106 / 350 | 3.22 | 14.7% | 35796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.3% | 116 |
| hadur117.nano.SanaroS0 0.1 | 1.6 | 14.7% | 106 |
| apc.botM 3.0 | 3.7 | 11.8% | 39 |
| vjik.UnViolation 1.1 | 3.9 | 11.3% | 42 |
| lxx.ConceptA 0.8 | 4.5 | 11.0% | 4 |
| bayen.UbaMicro 1.4 | 5.9 | 9.3% | 11 |
| panzer.Panzer 0.2 | 7.7 | 7.3% | 3 |
| yk.JahMicro 1.0 | 8.1 | 7.1% | 16 |
| conscience.Electron 1.3g | 8.6 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 9.6 | 5.6% | 10 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 81.3 | 16 / 35 | 3629 |
| 2 | 2 | 61.3 | 75.2 | 7 / 35 | 3585 |
| 3 | 1 | 64.0 | 80.0 | 12 / 35 | 4079 |
| 4 | 2 | 59.9 | 71.1 | 7 / 35 | 3360 |
| 5 | 1 | 63.6 | 80.3 | 11 / 35 | 3829 |
| 6 | 2 | 61.3 | 74.3 | 12 / 35 | 3463 |
| 7 | 1 | 63.4 | 78.1 | 13 / 35 | 3882 |
| 8 | 2 | 61.0 | 73.0 | 10 / 35 | 3250 |
| 9 | 2 | 58.9 | 67.9 | 8 / 35 | 3430 |
| 10 | 2 | 60.3 | 72.4 | 10 / 35 | 3289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 87 | 43% |
| apc.botM 3.0 | 35 | 71% |
| vjik.UnViolation 1.1 | 29 | 52% |
| yk.JahMicro 1.0 | 16 | 50% |
| lxx.ConceptA 0.8 | 10 | 100% |
| donjezza.Jezza 1.0 | 9 | 56% |
| bayen.UbaMicro 1.4 | 5 | 60% |
| panzer.Panzer 0.2 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 244 of 350 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 74 | 30% | 113 |
| lxx.ConceptA 0.8 | 55 | 23% | 63 |
| apc.botM 3.0 | 34 | 14% | 62 |
| vjik.UnViolation 1.1 | 22 | 9% | 39 |
| bayen.UbaMicro 1.4 | 20 | 8% | 25 |
| panzer.Panzer 0.2 | 16 | 7% | 18 |
| yk.JahMicro 1.0 | 10 | 4% | 10 |
| conscience.Electron 1.3g | 7 | 3% | 7 |
| donjezza.Jezza 1.0 | 6 | 2% | 11 |

## Melee bench: F33

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 65.3 | 44 / 350 | 4.13 | 13.1% | 35225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.1% | 132 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.2% | 47 |
| hadur117.nano.SanaroS0 0.1 | 2.9 | 13.1% | 44 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.5% | 48 |
| labg.Cataclysm 2.05 | 4.4 | 11.4% | 45 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 9.1% | 23 |
| baal.nano.N 1.42 | 6.5 | 9.2% | 6 |
| zyx.micro.Ant 1.1 | 8.6 | 5.5% | 2 |
| sanja.First 0.1 | 9.0 | 5.3% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.4 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 71.1 | 10 / 35 | 4089 |
| 2 | 4 | 58.2 | 62.2 | 3 / 35 | 3449 |
| 3 | 3 | 57.2 | 62.2 | 3 / 35 | 3234 |
| 4 | 2 | 59.6 | 67.3 | 3 / 35 | 3590 |
| 5 | 5 | 56.5 | 59.0 | 3 / 35 | 3115 |
| 6 | 2 | 62.7 | 74.9 | 7 / 35 | 3867 |
| 7 | 4 | 56.9 | 59.0 | 2 / 35 | 3299 |
| 8 | 2 | 57.5 | 62.9 | 2 / 35 | 3333 |
| 9 | 2 | 61.4 | 69.2 | 5 / 35 | 3879 |
| 10 | 3 | 58.7 | 64.8 | 6 / 35 | 3370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 56 | 29% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 33% |
| labg.Cataclysm 2.05 | 15 | 20% |
| gre.svman4.Leonidas 1.3.2 | 13 | 77% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 56% |
| baal.nano.N 1.42 | 5 | 60% |
| zyx.micro.Ant 1.1 | 1 | 0% |
| sanja.First 0.1 | 1 | 0% |

Hadur died in 307 of 350 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 115 | 37% | 133 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 17% | 63 |
| gre.svman4.Leonidas 1.3.2 | 38 | 12% | 42 |
| labg.Cataclysm 2.05 | 34 | 11% | 40 |
| kinsen.melee.Angsaichmophobia 1.8c | 34 | 11% | 36 |
| baal.nano.N 1.42 | 18 | 6% | 20 |
| zyx.micro.Ant 1.1 | 8 | 3% | 8 |
| sanja.First 0.1 | 5 | 2% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 3 |

## Melee bench: F34

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 71.7 | 44 / 350 | 3.55 | 14.1% | 39806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.4 | 17.3% | 113 |
| stelo.Spread 0.9 | 1.6 | 17.5% | 139 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 14.1% | 44 |
| jcs.Seth 1.8 | 4.4 | 11.4% | 34 |
| tcf.Reach 3 | 4.9 | 10.6% | 13 |
| cli.Dancer 1.1 | 5.8 | 9.5% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.6% | 4 |
| amk.Punbot.Punbot 0.01 | 7.9 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 4.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 70.2 | 5 / 35 | 3670 |
| 2 | 3 | 60.6 | 67.3 | 4 / 35 | 3773 |
| 3 | 3 | 64.6 | 79.4 | 6 / 35 | 4131 |
| 4 | 3 | 63.6 | 74.3 | 6 / 35 | 4244 |
| 5 | 3 | 61.2 | 69.8 | 3 / 35 | 3736 |
| 6 | 3 | 60.6 | 67.0 | 3 / 35 | 3865 |
| 7 | 3 | 62.1 | 68.3 | 7 / 35 | 4060 |
| 8 | 3 | 64.0 | 74.6 | 3 / 35 | 4563 |
| 9 | 3 | 63.5 | 76.5 | 6 / 35 | 4105 |
| 10 | 3 | 61.0 | 69.8 | 1 / 35 | 3659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 58 | 12% |
| stelo.Spread 0.9 | 52 | 48% |
| jcs.Seth 1.8 | 18 | 39% |
| tcf.Reach 3 | 5 | 40% |
| cli.Dancer 1.1 | 2 | 0% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 306 of 350 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 132 | 43% | 138 |
| stelo.Spread 0.9 | 90 | 29% | 115 |
| jcs.Seth 1.8 | 33 | 11% | 40 |
| ratosh.Wesco 1.4 | 20 | 7% | 20 |
| tcf.Reach 3 | 16 | 5% | 21 |
| cli.Dancer 1.1 | 12 | 4% | 12 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 2 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 65.3 | 19 / 350 | 4.12 | 11.9% | 26913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 273 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.2% | 26 |
| rz.HawkOnFire 0.1 | 3.5 | 12.4% | 12 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.3% | 18 |
| hadur117.nano.SanaroS0 0.1 | 4.2 | 11.9% | 19 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.1% | 1 |
| wit.Chuliath 1.0 | 7.0 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.9 | 64.1 | 0 / 35 | 2309 |
| 2 | 2 | 60.3 | 71.4 | 4 / 35 | 2966 |
| 3 | 4 | 55.6 | 61.0 | 1 / 35 | 2368 |
| 4 | 5 | 58.1 | 65.7 | 3 / 35 | 2793 |
| 5 | 4 | 59.4 | 70.2 | 2 / 35 | 2976 |
| 6 | 4 | 58.4 | 66.3 | 3 / 35 | 2936 |
| 7 | 4 | 57.2 | 64.1 | 2 / 35 | 2673 |
| 8 | 5 | 57.8 | 65.4 | 1 / 35 | 2811 |
| 9 | 5 | 54.6 | 57.5 | 2 / 35 | 2553 |
| 10 | 4 | 57.7 | 67.3 | 1 / 35 | 2528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 61 | 8% |
| gh.mini.Gruwel 0.9 | 17 | 41% |
| rz.HawkOnFire 0.1 | 8 | 75% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 25% |

Hadur died in 331 of 350 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 135 | 41% | 140 |
| gh.mini.Gruwel 0.9 | 57 | 17% | 65 |
| rz.HawkOnFire 0.1 | 46 | 14% | 50 |
| dmh.robocode.robot.BlackDeath 9.2 | 46 | 14% | 48 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 17 | 5% | 17 |
| stelo.MyAgileRobot 0.2 | 10 | 3% | 10 |
| myl.nano.KomoriNinja 1.1 | 9 | 3% | 9 |
| dans.Cinnamon 1.2 | 6 | 2% | 5 |
| wit.Chuliath 1.0 | 5 | 2% | 6 |

## Melee bench: F36

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.3 | 97 / 350 | 3.67 | 14.3% | 36693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.2 | 14.3% | 97 |
| alpha.RainingFire 1.0 | 2.5 | 13.1% | 65 |
| bzdp.Pansy 2.1 | 3.3 | 12.1% | 48 |
| mz.Cork 0.1 | 4.3 | 11.4% | 31 |
| bvh.micro.Freya 0.3 | 4.4 | 11.5% | 41 |
| m3thos.Eva02 0.7.1 | 5.5 | 10.5% | 38 |
| bvh.mini.Fenrir 0.39 | 6.8 | 9.1% | 9 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.1% | 5 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 2 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 64.8 | 8 / 35 | 3656 |
| 2 | 1 | 59.3 | 66.0 | 9 / 35 | 3382 |
| 3 | 1 | 61.6 | 72.7 | 8 / 35 | 3790 |
| 4 | 1 | 59.5 | 67.9 | 7 / 35 | 3606 |
| 5 | 1 | 62.1 | 71.1 | 12 / 35 | 3824 |
| 6 | 1 | 63.7 | 74.9 | 15 / 35 | 4251 |
| 7 | 2 | 61.4 | 71.7 | 8 / 35 | 3678 |
| 8 | 1 | 61.5 | 74.6 | 7 / 35 | 3626 |
| 9 | 1 | 60.1 | 67.6 | 13 / 35 | 3310 |
| 10 | 1 | 61.4 | 71.4 | 10 / 35 | 3570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 32 | 78% |
| bvh.micro.Freya 0.3 | 31 | 74% |
| bzdp.Pansy 2.1 | 31 | 65% |
| alpha.RainingFire 1.0 | 25 | 36% |
| m3thos.Eva02 0.7.1 | 18 | 28% |
| squidM.TentalceMeleeNano 1.1 | 7 | 57% |
| sample.MyFirstRobot 1.0 | 6 | 17% |
| bvh.mini.Fenrir 0.39 | 6 | 100% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 256 of 350 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 59 | 23% | 71 |
| m3thos.Eva02 0.7.1 | 43 | 17% | 51 |
| bzdp.Pansy 2.1 | 40 | 16% | 63 |
| bvh.micro.Freya 0.3 | 26 | 10% | 40 |
| bvh.mini.Fenrir 0.39 | 25 | 10% | 28 |
| mz.Cork 0.1 | 24 | 9% | 48 |
| squidM.TentalceMeleeNano 1.1 | 19 | 7% | 22 |
| dl.BetterWalls 1.0 | 13 | 5% | 19 |
| sample.MyFirstRobot 1.0 | 7 | 3% | 8 |

## Melee bench: F37

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 77.2 | 102 / 350 | 3.05 | 15.3% | 44094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.0 | 15.3% | 102 |
| germ.TheMind .2 | 2.8 | 11.7% | 49 |
| EBBU.Sim2 1.02 | 3.1 | 11.2% | 37 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.7% | 30 |
| agrach.Dalek 1.0 | 5.4 | 9.8% | 44 |
| mb.Beast 0.1 | 6.9 | 8.8% | 29 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.8% | 24 |
| lmk.ACPFinal 0.1 | 7.5 | 8.3% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 8.5 | 7.9% | 0 |
| skm.Ryubot 1.0 | 8.9 | 7.6% | 20 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 79.4 | 14 / 35 | 4347 |
| 2 | 1 | 62.0 | 80.3 | 8 / 35 | 4036 |
| 3 | 1 | 63.4 | 79.7 | 12 / 35 | 4570 |
| 4 | 1 | 61.8 | 76.2 | 9 / 35 | 4513 |
| 5 | 1 | 61.1 | 74.9 | 8 / 35 | 4412 |
| 6 | 1 | 62.4 | 74.6 | 10 / 35 | 4865 |
| 7 | 1 | 61.0 | 73.0 | 10 / 35 | 4409 |
| 8 | 1 | 61.1 | 73.0 | 12 / 35 | 4180 |
| 9 | 1 | 62.3 | 79.7 | 10 / 35 | 4212 |
| 10 | 1 | 63.2 | 81.0 | 9 / 35 | 4550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 40 | 55% |
| germ.TheMind .2 | 31 | 32% |
| mb.Beast 0.1 | 31 | 74% |
| agrach.Dalek 1.0 | 29 | 48% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 48% |
| lmk.ACPFinal 0.1 | 17 | 82% |
| skm.Ryubot 1.0 | 17 | 24% |
| stelo.UntouchableNano 1.3 | 9 | 44% |

Hadur died in 253 of 350 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 53 | 21% | 61 |
| com.syncleus.robocode.Dreadnaught 0.1 | 39 | 15% | 51 |
| EBBU.Sim2 1.02 | 36 | 14% | 56 |
| agrach.Dalek 1.0 | 35 | 14% | 50 |
| mb.Beast 0.1 | 26 | 10% | 44 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 8% | 20 |
| lmk.ACPFinal 0.1 | 18 | 7% | 27 |
| skm.Ryubot 1.0 | 15 | 6% | 19 |
| stelo.UntouchableNano 1.3 | 12 | 5% | 19 |

## Melee bench: F38

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 62.3 | 34 / 350 | 4.39 | 11.8% | 30177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.4% | 169 |
| bvh.mini.Freya 0.55 | 2.1 | 13.3% | 42 |
| hadur117.nano.SanaroS0 0.1 | 3.9 | 11.8% | 34 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.5% | 40 |
| cs.Wren 1.0 | 4.5 | 11.4% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.6% | 22 |
| kdf.KoulDestroyer 1.0 | 6.9 | 9.2% | 18 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.0% | 5 |
| bzdp.BoxCar 2.0 | 9.4 | 4.3% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.8 | 61.3 | 0 / 35 | 3021 |
| 2 | 6 | 53.9 | 54.6 | 1 / 35 | 2706 |
| 3 | 4 | 56.6 | 64.4 | 1 / 35 | 3021 |
| 4 | 3 | 58.6 | 67.0 | 5 / 35 | 3216 |
| 5 | 4 | 55.2 | 58.7 | 3 / 35 | 2987 |
| 6 | 4 | 55.1 | 58.1 | 4 / 35 | 2950 |
| 7 | 4 | 58.4 | 64.1 | 8 / 35 | 3249 |
| 8 | 4 | 57.1 | 62.2 | 2 / 35 | 3205 |
| 9 | 3 | 58.4 | 67.6 | 4 / 35 | 2834 |
| 10 | 4 | 58.0 | 64.8 | 6 / 35 | 2988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 59 | 36% |
| bts.mega.Gnarly 1.4 | 15 | 27% |
| bvh.mini.Freya 0.55 | 12 | 42% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 0% |
| cs.Wren 1.0 | 6 | 50% |
| kdf.KoulDestroyer 1.0 | 4 | 0% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |

Hadur died in 316 of 350 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 101 | 32% | 124 |
| bvh.mini.Freya 0.55 | 45 | 14% | 47 |
| cs.Wren 1.0 | 43 | 14% | 45 |
| bts.mega.Gnarly 1.4 | 37 | 12% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 12% | 38 |
| kdf.KoulDestroyer 1.0 | 33 | 10% | 34 |
| kawigi.spare.SpareParts 0.7.6nosnd | 11 | 3% | 12 |
| bzdp.BoxCar 2.0 | 8 | 3% | 8 |
| matt.UnderDark3 2.4.34 | 1 | 0% | 1 |

## Melee bench: F39

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 63.5 | 39 / 350 | 4.28 | 12.1% | 31972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.5% | 68 |
| az.Ololobot 0.2.4 | 2.5 | 13.5% | 123 |
| hadur117.nano.SanaroS0 0.1 | 3.1 | 12.1% | 39 |
| catcat20.Lambda 0.024 | 3.4 | 11.3% | 57 |
| stelo.SoRobotNanoMelee 1.2 | 5.9 | 9.5% | 32 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.9% | 9 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.9% | 14 |
| gimp.GimpBot 0.1 | 7.3 | 8.5% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.4% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 53.5 | 55.9 | 2 / 35 | 3120 |
| 2 | 2 | 60.6 | 73.0 | 5 / 35 | 3934 |
| 3 | 3 | 55.1 | 65.4 | 0 / 35 | 2819 |
| 4 | 3 | 59.1 | 70.8 | 6 / 35 | 3175 |
| 5 | 3 | 56.1 | 64.1 | 4 / 35 | 3017 |
| 6 | 3 | 58.0 | 67.3 | 4 / 35 | 3250 |
| 7 | 4 | 53.8 | 58.1 | 1 / 35 | 2930 |
| 8 | 3 | 57.9 | 65.7 | 8 / 35 | 3198 |
| 9 | 3 | 53.5 | 55.2 | 3 / 35 | 3338 |
| 10 | 4 | 55.8 | 59.7 | 6 / 35 | 3191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 40 | 10% |
| bvh.fry.Freya 0.82 | 28 | 39% |
| catcat20.Lambda 0.024 | 26 | 58% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| gimp.GimpBot 0.1 | 5 | 60% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 20% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |

Hadur died in 313 of 350 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 99 | 32% | 104 |
| az.Ololobot 0.2.4 | 59 | 19% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 40 | 13% | 46 |
| catcat20.Lambda 0.024 | 36 | 12% | 44 |
| apollokidd.ApolloKidd 0.9 | 33 | 11% | 37 |
| gimp.GimpBot 0.1 | 14 | 4% | 18 |
| whitesquare.robots.SkynetAdvanced 1.1 | 12 | 4% | 14 |
| winamp32.micro.MicroMacro 1.0 | 11 | 4% | 16 |
| dcs.Eater_of_Worlds 1.1.3-A | 8 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F41

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 66.7 | 51 / 350 | 4.00 | 12.7% | 30615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.0% | 165 |
| ary.Swarm 1.1 | 2.5 | 13.9% | 31 |
| lessonz.robocode.Oz 0.5.0 | 3.4 | 13.1% | 50 |
| hadur117.nano.SanaroS0 0.1 | 3.9 | 12.7% | 51 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 12.0% | 40 |
| shrub.Silver v048 | 6.0 | 8.9% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 7.9% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.7% | 2 |
| jsal.Jsalbot 1.0 | 8.5 | 5.9% | 7 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 64.8 | 5 / 35 | 3036 |
| 2 | 5 | 57.9 | 61.9 | 5 / 35 | 3090 |
| 3 | 2 | 63.5 | 80.3 | 9 / 35 | 3271 |
| 4 | 4 | 58.9 | 66.7 | 5 / 35 | 3056 |
| 5 | 4 | 59.2 | 68.9 | 3 / 35 | 2982 |
| 6 | 2 | 61.3 | 71.7 | 7 / 35 | 3251 |
| 7 | 4 | 59.3 | 66.7 | 6 / 35 | 3175 |
| 8 | 5 | 57.5 | 61.6 | 6 / 35 | 2819 |
| 9 | 5 | 57.1 | 61.9 | 2 / 35 | 3107 |
| 10 | 4 | 56.4 | 62.5 | 3 / 35 | 2828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 66 | 24% |
| lessonz.robocode.Oz 0.5.0 | 18 | 44% |
| ary.Swarm 1.1 | 16 | 63% |
| simonton.nano.MeleeSeed 1.8 | 14 | 71% |
| shrub.Silver v048 | 4 | 75% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| stelo.Mirror 1.1 | 3 | 67% |

Hadur died in 299 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 101 | 34% | 118 |
| ary.Swarm 1.1 | 77 | 26% | 86 |
| lessonz.robocode.Oz 0.5.0 | 42 | 14% | 49 |
| simonton.nano.MeleeSeed 1.8 | 36 | 12% | 44 |
| shrub.Silver v048 | 16 | 5% | 18 |
| stelo.Mirror 1.1 | 8 | 3% | 10 |
| zyx.nano.Ant 1.1 | 7 | 2% | 10 |
| jsal.Jsalbot 1.0 | 6 | 2% | 8 |
| acogdev.alpha 0.2 | 6 | 2% | 7 |

## Melee bench: F42

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 71.0 | 50 / 350 | 3.61 | 13.6% | 36101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.7% | 174 |
| ara.Shera 0.88 | 2.6 | 14.5% | 71 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.9% | 39 |
| hadur117.nano.SanaroS0 0.1 | 3.4 | 13.6% | 50 |
| amz.NanoClone 1.41 | 5.1 | 9.2% | 8 |
| maribo.IotaCT 1.1 | 6.1 | 7.7% | 4 |
| dsw.StaticD 1.0 | 7.0 | 7.1% | 2 |
| stelo.MirrorMicro 1.0 | 8.6 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.4 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.6 | 69.2 | 5 / 35 | 3815 |
| 2 | 4 | 59.8 | 67.9 | 4 / 35 | 3635 |
| 3 | 3 | 62.9 | 77.1 | 9 / 35 | 3582 |
| 4 | 4 | 59.2 | 68.3 | 3 / 35 | 3609 |
| 5 | 2 | 61.0 | 74.0 | 5 / 35 | 3543 |
| 6 | 4 | 59.3 | 67.6 | 4 / 35 | 3471 |
| 7 | 4 | 58.1 | 64.4 | 4 / 35 | 3423 |
| 8 | 3 | 61.1 | 73.3 | 7 / 35 | 3117 |
| 9 | 4 | 61.3 | 72.7 | 4 / 35 | 3908 |
| 10 | 2 | 62.8 | 75.6 | 5 / 35 | 3998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 86 | 26% |
| ara.Shera 0.88 | 24 | 46% |
| maribo.mini.MiniQuester 0.1 | 24 | 63% |
| maribo.IotaCT 1.1 | 3 | 0% |
| dsw.StaticD 1.0 | 3 | 67% |

Hadur died in 301 of 350 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 123 | 41% | 144 |
| ara.Shera 0.88 | 75 | 25% | 87 |
| maribo.mini.MiniQuester 0.1 | 54 | 18% | 66 |
| amz.NanoClone 1.41 | 21 | 7% | 22 |
| maribo.IotaCT 1.1 | 9 | 3% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 6 | 2% | 6 |
| dsw.StaticD 1.0 | 5 | 2% | 8 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 65.7 | 29 / 350 | 4.09 | 12.7% | 33545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 258 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.2% | 42 |
| hadur117.nano.SanaroS0 0.1 | 3.1 | 12.7% | 29 |
| dummy.micro.Sparrow 2.5 | 3.9 | 11.8% | 14 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.9% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.8% | 4 |
| jab.DiamondStealer 5 | 7.2 | 8.0% | 1 |
| mz.NanoGod 2.02 | 7.8 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 64.1 | 1 / 35 | 3558 |
| 2 | 4 | 60.2 | 64.8 | 4 / 35 | 3273 |
| 3 | 3 | 61.2 | 66.7 | 5 / 35 | 3491 |
| 4 | 3 | 60.4 | 65.4 | 3 / 35 | 3443 |
| 5 | 4 | 59.7 | 63.8 | 4 / 35 | 3108 |
| 6 | 2 | 60.5 | 66.7 | 2 / 35 | 3231 |
| 7 | 3 | 59.3 | 64.1 | 0 / 35 | 3269 |
| 8 | 2 | 64.4 | 76.8 | 5 / 35 | 3628 |
| 9 | 5 | 58.4 | 62.2 | 1 / 35 | 3128 |
| 10 | 2 | 59.5 | 62.5 | 4 / 35 | 3416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 95 | 14% |
| brainfade.melee.Dusk 0.44 | 19 | 37% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 50% |
| jab.DiamondStealer 5 | 1 | 0% |

Hadur died in 321 of 350 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 173 | 54% | 185 |
| brainfade.melee.Dusk 0.44 | 44 | 14% | 51 |
| wcsv.melee.EngineerMelee 0.1 | 29 | 9% | 30 |
| dummy.micro.Sparrow 2.5 | 28 | 9% | 35 |
| jab.DiamondStealer 5 | 17 | 5% | 17 |
| mz.NanoGod 2.02 | 16 | 5% | 17 |
| Krabb.akim2.Akim2 1.1b | 11 | 3% | 12 |
| cvt.Firsty 1.0 | 3 | 1% | 3 |

## Melee bench: F44

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 63.7 | 51 / 350 | 4.26 | 12.8% | 36196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.0% | 147 |
| tzu.TheArtOfWar 1.2 | 2.0 | 15.5% | 105 |
| hadur117.nano.SanaroS0 0.1 | 3.1 | 12.8% | 51 |
| jwirde.Gort 2.0 | 4.3 | 11.1% | 29 |
| wompi.Quokka 1.6 | 4.6 | 10.9% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.0% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.4% | 3 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.7% | 3 |
| amk.jointstrike.JointStrike 0.2 | 9.4 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.6 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.0 | 60.3 | 2 / 35 | 3568 |
| 2 | 4 | 53.5 | 51.1 | 2 / 35 | 3331 |
| 3 | 3 | 58.8 | 63.8 | 6 / 35 | 3226 |
| 4 | 3 | 60.1 | 66.0 | 7 / 35 | 3690 |
| 5 | 2 | 64.4 | 78.4 | 10 / 35 | 4206 |
| 6 | 3 | 59.2 | 63.8 | 5 / 35 | 3753 |
| 7 | 3 | 59.7 | 66.3 | 6 / 35 | 3581 |
| 8 | 4 | 57.5 | 60.6 | 3 / 35 | 3563 |
| 9 | 3 | 57.5 | 62.2 | 4 / 35 | 3218 |
| 10 | 3 | 60.1 | 64.8 | 6 / 35 | 4060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 60 | 43% |
| tzu.TheArtOfWar 1.2 | 39 | 26% |
| jwirde.Gort 2.0 | 18 | 50% |
| wompi.Quokka 1.6 | 6 | 67% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 300 of 350 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 101 | 34% | 109 |
| stelo.Liblix 0.3.1 | 93 | 31% | 122 |
| jwirde.Gort 2.0 | 29 | 10% | 37 |
| wompi.Quokka 1.6 | 27 | 9% | 29 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 20 | 7% | 21 |
| disan.Chair 2.2.0 | 12 | 4% | 12 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 10 |
| amk.jointstrike.JointStrike 0.2 | 7 | 2% | 7 |
| sample.Crazy 1.0 | 2 | 1% | 3 |

## Melee bench: F45

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 67.5 | 57 / 350 | 3.93 | 13.8% | 37534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.4 | 13.8% | 57 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.2% | 192 |
| jje.BagPuss 1.2 | 3.0 | 12.3% | 23 |
| sul.Lunar 1.1 | 4.2 | 11.3% | 19 |
| myl.nano.Graviton 1.10 | 4.6 | 10.7% | 16 |
| hvilela.HVilela 0.9 | 6.5 | 9.1% | 7 |
| fm.claire 1.7 | 7.2 | 8.8% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.4 | 8.3% | 10 |
| wit.Deep7 2.0 | 8.9 | 7.0% | 22 |
| abud.ThirdRobo 1.0 | 9.8 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 71.4 | 4 / 35 | 3883 |
| 2 | 2 | 57.0 | 60.3 | 6 / 35 | 3374 |
| 3 | 1 | 58.1 | 65.4 | 4 / 35 | 3510 |
| 4 | 2 | 58.6 | 64.8 | 6 / 35 | 3414 |
| 5 | 2 | 59.0 | 64.8 | 6 / 35 | 3564 |
| 6 | 1 | 62.4 | 70.2 | 10 / 35 | 4157 |
| 7 | 2 | 59.2 | 67.6 | 3 / 35 | 3718 |
| 8 | 1 | 60.0 | 68.9 | 5 / 35 | 3778 |
| 9 | 1 | 62.0 | 73.7 | 5 / 35 | 4130 |
| 10 | 1 | 60.6 | 67.6 | 8 / 35 | 4006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 80 | 34% |
| sul.Lunar 1.1 | 14 | 86% |
| wit.Deep7 2.0 | 12 | 50% |
| myl.nano.Graviton 1.10 | 10 | 30% |
| jje.BagPuss 1.2 | 10 | 20% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 71% |
| hvilela.HVilela 0.9 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 0% |

Hadur died in 293 of 350 rounds, at a mean tick of 1153. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 58 | 20% | 85 |
| eem.IWillFireNoBullet v2.8 | 57 | 19% | 0 |
| myl.nano.Graviton 1.10 | 50 | 17% | 64 |
| sul.Lunar 1.1 | 34 | 12% | 76 |
| hvilela.HVilela 0.9 | 27 | 9% | 34 |
| fm.claire 1.7 | 25 | 9% | 33 |
| pez.mini.ChironexFleckeri 0.5 | 19 | 6% | 24 |
| wit.Deep7 2.0 | 14 | 5% | 20 |
| abud.ThirdRobo 1.0 | 9 | 3% | 14 |

## Melee bench: F46

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 68.1 | 24 / 350 | 3.87 | 12.3% | 28570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.4 | 18.0% | 148 |
| rsalesc.melee.Medina 0.4.5 | 1.6 | 17.0% | 143 |
| hadur117.nano.SanaroS0 0.1 | 3.3 | 12.3% | 24 |
| cx.Princess 1.0 | 4.2 | 10.8% | 26 |
| mz.MicroSheep 1.0 | 4.5 | 10.8% | 6 |
| sadoner.killer 0.2 | 6.0 | 9.2% | 2 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.3% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.9 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 68.9 | 3 / 35 | 2758 |
| 2 | 3 | 59.5 | 70.5 | 2 / 35 | 3003 |
| 3 | 4 | 56.4 | 64.1 | 1 / 35 | 2749 |
| 4 | 3 | 58.2 | 68.9 | 3 / 35 | 2706 |
| 5 | 4 | 58.2 | 67.0 | 3 / 35 | 2761 |
| 6 | 3 | 58.6 | 67.0 | 1 / 35 | 3168 |
| 7 | 3 | 59.1 | 69.5 | 4 / 35 | 2830 |
| 8 | 3 | 59.4 | 70.2 | 3 / 35 | 2952 |
| 9 | 3 | 58.3 | 67.9 | 1 / 35 | 2881 |
| 10 | 3 | 57.7 | 67.3 | 3 / 35 | 2762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 62 | 15% |
| rsalesc.melee.Medina 0.4.5 | 38 | 18% |
| cx.Princess 1.0 | 10 | 30% |
| mz.MicroSheep 1.0 | 6 | 33% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 133 | 41% | 143 |
| rsalesc.melee.Medina 0.4.5 | 87 | 27% | 95 |
| mz.MicroSheep 1.0 | 32 | 10% | 33 |
| cx.Princess 1.0 | 28 | 9% | 30 |
| sadoner.killer 0.2 | 22 | 7% | 23 |
| arthord.NanoSatanMelee Beta | 14 | 4% | 16 |
| jeremyreeder.collective.Prophet 5 | 7 | 2% | 7 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

