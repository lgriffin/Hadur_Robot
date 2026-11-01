# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 77.0 | 60 / 350 | 3.07 | 14.2% | 35577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 226 |
| hadur117.nano.SanaroHC 0.2 | 2.0 | 14.2% | 60 |
| sgp.JollyNinja 3.53 | 3.6 | 11.9% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.1 | 11.2% | 11 |
| mz.MicroGodMelee 1 | 4.6 | 10.9% | 5 |
| lorneswork.Predator 1.0 | 5.7 | 9.7% | 7 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 6.0% | 1 |
| skm.butterfly 1.0 | 8.9 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 79.0 | 7 / 35 | 3810 |
| 2 | 2 | 64.7 | 83.5 | 7 / 35 | 3832 |
| 3 | 2 | 60.7 | 74.0 | 6 / 35 | 3298 |
| 4 | 2 | 62.8 | 79.7 | 4 / 35 | 3537 |
| 5 | 2 | 64.0 | 81.9 | 6 / 35 | 3757 |
| 6 | 2 | 61.6 | 75.2 | 5 / 35 | 3473 |
| 7 | 2 | 59.8 | 71.7 | 7 / 35 | 3243 |
| 8 | 2 | 60.9 | 72.1 | 5 / 35 | 3649 |
| 9 | 2 | 60.9 | 71.4 | 5 / 35 | 3669 |
| 10 | 2 | 63.4 | 81.9 | 8 / 35 | 3309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 160 | 16% |
| sgp.JollyNinja 3.53 | 26 | 58% |
| mz.MicroGodMelee 1 | 11 | 91% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 50% |
| lorneswork.Predator 1.0 | 6 | 67% |
| adt.Ar2 1.0 | 1 | 0% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 290 of 350 rounds, at a mean tick of 1038. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 169 | 58% | 194 |
| sgp.JollyNinja 3.53 | 37 | 13% | 52 |
| lorneswork.Predator 1.0 | 28 | 10% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 8% | 27 |
| mz.MicroGodMelee 1 | 16 | 6% | 26 |
| adt.Ar2 1.0 | 11 | 4% | 11 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 1% | 4 |
| mym.EdgeStalker 1.0 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 0% | 2 |

## Melee bench: F02

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 68.4 | 76 / 350 | 3.84 | 13.8% | 37280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 14.7% | 83 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.4% | 93 |
| hadur117.nano.SanaroHC 0.2 | 2.3 | 13.8% | 76 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 11.0% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 10.1% | 27 |
| sch.Simone 0.3d | 6.6 | 8.5% | 17 |
| Noran.BitchingElk 0.054 | 7.2 | 8.1% | 28 |
| fnc.bandit.Bandit 5.2.0 | 7.9 | 7.7% | 5 |
| stelo.PatternRobot 1.0 | 8.1 | 7.2% | 15 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 67.6 | 5 / 35 | 3614 |
| 2 | 3 | 56.4 | 59.7 | 5 / 35 | 3287 |
| 3 | 1 | 62.4 | 75.2 | 9 / 35 | 3800 |
| 4 | 1 | 62.0 | 72.1 | 11 / 35 | 3944 |
| 5 | 3 | 59.1 | 66.7 | 8 / 35 | 3514 |
| 6 | 2 | 60.2 | 69.8 | 6 / 35 | 3705 |
| 7 | 2 | 61.2 | 70.8 | 9 / 35 | 3913 |
| 8 | 3 | 59.8 | 69.2 | 6 / 35 | 3710 |
| 9 | 3 | 58.8 | 64.4 | 5 / 35 | 3777 |
| 10 | 2 | 61.4 | 68.9 | 12 / 35 | 4016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 54 | 39% |
| pulsar.PulsarMax 0.8.9 | 47 | 47% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 92% |
| Noran.BitchingElk 0.054 | 11 | 36% |
| sch.Simone 0.3d | 9 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 75% |
| stelo.PatternRobot 1.0 | 7 | 29% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 276 of 350 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 67 | 24% | 90 |
| pulsar.PulsarMax 0.8.9 | 66 | 24% | 84 |
| stelo.PatternRobot 1.0 | 29 | 11% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 27 | 10% | 29 |
| sch.Simone 0.3d | 21 | 8% | 27 |
| fnc.bandit.Bandit 5.2.0 | 21 | 8% | 24 |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 7% | 34 |
| Noran.BitchingElk 0.054 | 13 | 5% | 17 |
| fullsail.SweetTea 1.1 | 10 | 4% | 10 |
2 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 80.7 | 85 / 350 | 2.74 | 15.1% | 38590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHC 0.2 | 1.7 | 15.1% | 85 |
| kawigi.nano.Lib 1.0 | 2.1 | 14.8% | 100 |
| radnor.DoctorBob 1.42 | 2.4 | 14.6% | 84 |
| vuen.Cake 2.51 | 3.8 | 13.2% | 69 |
| urdos.URDOS 1.3 | 5.0 | 10.6% | 10 |
| adt.Ar1 2.1 | 6.2 | 7.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.9 | 7.4% | 3 |
| oa.weak.FlyMk1 0.1 | 8.1 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 78.4 | 12 / 35 | 3856 |
| 2 | 3 | 62.1 | 76.8 | 7 / 35 | 3922 |
| 3 | 1 | 62.9 | 79.7 | 11 / 35 | 4040 |
| 4 | 2 | 63.3 | 81.9 | 5 / 35 | 4089 |
| 5 | 1 | 62.9 | 83.2 | 10 / 35 | 3668 |
| 6 | 3 | 61.8 | 80.0 | 7 / 35 | 3487 |
| 7 | 1 | 65.7 | 85.7 | 10 / 35 | 4543 |
| 8 | 1 | 62.6 | 79.0 | 10 / 35 | 3665 |
| 9 | 1 | 63.3 | 83.5 | 8 / 35 | 3677 |
| 10 | 3 | 61.7 | 78.4 | 5 / 35 | 3643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 13% |
| radnor.DoctorBob 1.42 | 61 | 44% |
| vuen.Cake 2.51 | 58 | 53% |
| urdos.URDOS 1.3 | 14 | 71% |
| adt.Ar1 2.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 266 of 350 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 97 | 36% | 111 |
| radnor.DoctorBob 1.42 | 82 | 31% | 107 |
| vuen.Cake 2.51 | 33 | 12% | 62 |
| urdos.URDOS 1.3 | 33 | 12% | 42 |
| adt.Ar1 2.1 | 7 | 3% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 6 | 2% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 2% | 5 |
| oa.weak.FlyMk1 0.1 | 2 | 1% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 74.6 | 15 / 350 | 3.28 | 14.0% | 40772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.4% | 319 |
| hadur117.nano.SanaroHC 0.2 | 2.2 | 14.0% | 15 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.6% | 7 |
| TNT.TNT 0.99.1 | 4.1 | 10.6% | 3 |
| josago.Jorgito 0.16 | 5.1 | 8.9% | 2 |
| css.Delitioner 0.11 | 6.1 | 7.5% | 2 |
| tj.zombie1n 1.0.1 | 6.7 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 8.4 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.8 | 4.7% | 0 |
| spin.Bugstard 0.012b | 9.8 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 81.0 | 2 / 35 | 4163 |
| 2 | 2 | 62.7 | 74.3 | 3 / 35 | 4157 |
| 3 | 2 | 62.1 | 73.7 | 1 / 35 | 4008 |
| 4 | 2 | 62.8 | 73.7 | 1 / 35 | 4217 |
| 5 | 2 | 62.6 | 73.7 | 1 / 35 | 4314 |
| 6 | 3 | 61.4 | 69.5 | 1 / 35 | 4071 |
| 7 | 2 | 63.0 | 75.2 | 2 / 35 | 4272 |
| 8 | 2 | 62.4 | 76.2 | 1 / 35 | 3789 |
| 9 | 3 | 61.6 | 70.8 | 3 / 35 | 3983 |
| 10 | 2 | 62.8 | 78.4 | 0 / 35 | 3798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 160 | 3% |
| apc.LeeroyJenkins2 1.0 | 8 | 50% |
| spin.Bugstard 0.012b | 2 | 100% |
| css.Delitioner 0.11 | 2 | 100% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 335 of 350 rounds, at a mean tick of 1196. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 235 | 70% | 241 |
| apc.LeeroyJenkins2 1.0 | 49 | 15% | 54 |
| josago.Jorgito 0.16 | 17 | 5% | 17 |
| TNT.TNT 0.99.1 | 12 | 4% | 13 |
| css.Delitioner 0.11 | 11 | 3% | 13 |
| tj.zombie1n 1.0.1 | 6 | 2% | 6 |
| rampancy.Durandal 2.1d | 5 | 1% | 6 |

## Melee bench: F06

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 69.9 | 93 / 350 | 3.71 | 13.4% | 30508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.4 | 15.0% | 78 |
| origin.SleepSiphon 1.7b | 2.1 | 14.8% | 103 |
| hadur117.nano.SanaroHC 0.2 | 2.8 | 13.4% | 93 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 12.2% | 41 |
| mld.Wisdom 1.0 | 4.8 | 10.9% | 11 |
| gg.Wolverine 2.0 | 6.6 | 8.7% | 9 |
| DBall.NUKE 0.1 | 7.1 | 8.0% | 5 |
| spinnercat.Omen 1.0 | 7.3 | 7.9% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.2% | 6 |
| sample.Fire 1.0 | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 71.4 | 14 / 35 | 3081 |
| 2 | 3 | 57.7 | 63.8 | 7 / 35 | 3165 |
| 3 | 3 | 58.6 | 65.4 | 8 / 35 | 2891 |
| 4 | 3 | 60.2 | 71.4 | 10 / 35 | 3055 |
| 5 | 2 | 61.1 | 73.3 | 9 / 35 | 3066 |
| 6 | 3 | 59.0 | 69.8 | 5 / 35 | 2646 |
| 7 | 3 | 59.6 | 70.5 | 8 / 35 | 2881 |
| 8 | 3 | 61.1 | 71.4 | 11 / 35 | 3136 |
| 9 | 2 | 63.2 | 78.4 | 12 / 35 | 3398 |
| 10 | 4 | 58.3 | 63.5 | 9 / 35 | 3189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 50 | 38% |
| jekl.StoneGhost 0.7 | 39 | 74% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 58% |
| gg.Wolverine 2.0 | 8 | 75% |
| mld.Wisdom 1.0 | 7 | 100% |
| DBall.NUKE 0.1 | 6 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| sample.Fire 1.0 | 2 | 50% |

Hadur died in 260 of 350 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 78 | 30% | 102 |
| jekl.StoneGhost 0.7 | 67 | 26% | 86 |
| pe.minimelee.SandboxMiniMelee 1.1 | 47 | 18% | 71 |
| mld.Wisdom 1.0 | 35 | 13% | 43 |
| gg.Wolverine 2.0 | 13 | 5% | 15 |
| spinnercat.Omen 1.0 | 8 | 3% | 11 |
| DBall.NUKE 0.1 | 6 | 2% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 2% | 7 |
| sample.Fire 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.4 | 106 / 350 | 2.41 | 16.6% | 44367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.4 | 18.0% | 98 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.5% | 89 |
| hadur117.nano.SanaroHC 0.2 | 2.8 | 16.6% | 106 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.7% | 16 |
| franzor.Lizt 1.3.1 | 4.8 | 11.2% | 42 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 1 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.9 | 86.0 | 13 / 35 | 4331 |
| 2 | 2 | 68.5 | 87.0 | 15 / 35 | 4758 |
| 3 | 3 | 66.3 | 83.2 | 7 / 35 | 4190 |
| 4 | 3 | 65.6 | 81.9 | 5 / 35 | 4214 |
| 5 | 3 | 67.7 | 84.1 | 12 / 35 | 4632 |
| 6 | 3 | 66.8 | 83.2 | 10 / 35 | 4417 |
| 7 | 2 | 67.5 | 84.8 | 11 / 35 | 4433 |
| 8 | 3 | 67.1 | 85.1 | 11 / 35 | 4542 |
| 9 | 3 | 66.2 | 80.6 | 11 / 35 | 4448 |
| 10 | 3 | 68.2 | 87.9 | 11 / 35 | 4402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 121 | 46% |
| rsalesc.melee.Monk 0.3.6c | 51 | 12% |
| oog.melee.CapuletDroid 1.1 | 35 | 71% |
| franzor.Lizt 1.3.1 | 30 | 60% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 246 of 350 rounds, at a mean tick of 1597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 125 | 51% | 194 |
| rsalesc.melee.Monk 0.3.6c | 74 | 30% | 91 |
| oog.melee.CapuletDroid 1.1 | 19 | 8% | 46 |
| franzor.Lizt 1.3.1 | 18 | 7% | 4 |
| lrem.micro.MoggFanatic 0.2 | 5 | 2% | 7 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 4 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 10 battles (0.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 72.7 | 116 / 350 | 3.45 | 14.2% | 31523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHC 0.2 | 1.9 | 14.2% | 116 |
| tm.Yuugao 1.0 | 2.2 | 13.7% | 74 |
| shrub.Vapour v159 | 2.2 | 13.7% | 88 |
| Krabb.sliNk.Garm 0.9u | 3.9 | 11.0% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 5.6 | 9.3% | 20 |
| m3thos.Eva00 1.1 | 6.3 | 8.9% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.6% | 16 |
| qualidafial.MajorDick 1.0.1 | 8.1 | 7.1% | 9 |
| SHAM.WOW 1.4 | 8.3 | 7.0% | 5 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 6.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 81.9 | 16 / 35 | 3283 |
| 2 | 2 | 59.6 | 71.7 | 9 / 35 | 3064 |
| 3 | 2 | 60.1 | 69.5 | 10 / 35 | 3342 |
| 4 | 3 | 60.4 | 72.1 | 11 / 35 | 3082 |
| 5 | 3 | 58.7 | 68.6 | 11 / 35 | 2874 |
| 6 | 2 | 60.6 | 72.1 | 9 / 35 | 3316 |
| 7 | 2 | 59.4 | 68.6 | 12 / 35 | 3158 |
| 8 | 1 | 61.8 | 75.9 | 15 / 35 | 3186 |
| 9 | 1 | 58.5 | 67.9 | 10 / 35 | 2981 |
| 10 | 2 | 62.5 | 79.0 | 13 / 35 | 3237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 66 | 74% |
| shrub.Vapour v159 | 41 | 29% |
| Krabb.sliNk.Garm 0.9u | 24 | 88% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 71% |
| com.spp.robocode.MostlyHarmless 010 | 12 | 67% |
| m3thos.Eva00 1.1 | 7 | 100% |
| SHAM.WOW 1.4 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 33% |

Hadur died in 239 of 350 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 83 | 35% | 95 |
| tm.Yuugao 1.0 | 48 | 20% | 97 |
| Krabb.sliNk.Garm 0.9u | 33 | 14% | 48 |
| com.spp.robocode.MostlyHarmless 010 | 26 | 11% | 35 |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 6% | 24 |
| m3thos.Eva00 1.1 | 11 | 5% | 19 |
| zyx.nano.BacillusComma 1.0 | 9 | 4% | 10 |
| qualidafial.MajorDick 1.0.1 | 8 | 3% | 8 |
| SHAM.WOW 1.4 | 7 | 3% | 13 |

## Melee bench: F09

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 63.3 | 58 / 350 | 4.30 | 12.2% | 28179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 170 |
| kc.micro.Figment 1.0 | 2.0 | 14.9% | 57 |
| hadur117.nano.SanaroHC 0.2 | 3.5 | 12.2% | 58 |
| yagami.Tidus 0.11 | 4.2 | 11.3% | 7 |
| pedersen.Grishnakh 1.0 | 4.6 | 10.9% | 24 |
| mc2.enemy.Original 0.9 | 5.7 | 10.1% | 28 |
| dft.Calliope 5.6 | 7.1 | 7.5% | 5 |
| step.nanoPri 1.0 | 8.2 | 6.0% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.6 | 57.8 | 5 / 35 | 2537 |
| 2 | 5 | 54.8 | 55.9 | 7 / 35 | 2571 |
| 3 | 3 | 59.0 | 66.3 | 4 / 35 | 3318 |
| 4 | 3 | 57.6 | 65.1 | 9 / 35 | 2683 |
| 5 | 3 | 58.3 | 65.7 | 2 / 35 | 2924 |
| 6 | 3 | 62.1 | 73.3 | 10 / 35 | 3181 |
| 7 | 3 | 58.6 | 63.8 | 8 / 35 | 2994 |
| 8 | 5 | 54.6 | 55.9 | 4 / 35 | 2548 |
| 9 | 3 | 55.6 | 59.7 | 4 / 35 | 2648 |
| 10 | 3 | 59.4 | 69.5 | 5 / 35 | 2775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 59 | 25% |
| kc.micro.Figment 1.0 | 28 | 61% |
| mc2.enemy.Original 0.9 | 14 | 71% |
| yagami.Tidus 0.11 | 12 | 100% |
| pedersen.Grishnakh 1.0 | 8 | 38% |
| dft.Calliope 5.6 | 2 | 50% |

Hadur died in 292 of 350 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 88 | 30% | 104 |
| kc.micro.Figment 1.0 | 62 | 21% | 79 |
| yagami.Tidus 0.11 | 48 | 16% | 61 |
| mc2.enemy.Original 0.9 | 36 | 12% | 45 |
| pedersen.Grishnakh 1.0 | 28 | 10% | 30 |
| dft.Calliope 5.6 | 14 | 5% | 15 |
| robar.nano.Assertive_Melee 0.2 | 9 | 3% | 9 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |
| step.nanoPri 1.0 | 3 | 1% | 3 |

## Melee bench: F10

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 81.0 | 126 / 350 | 2.71 | 15.6% | 38180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHC 0.2 | 1.4 | 15.6% | 126 |
| DTF.Kludgy 1.2b | 1.6 | 15.1% | 87 |
| ne.Chimera 1.2 | 3.6 | 13.2% | 39 |
| ejb.Polaris 1.0.1 | 3.7 | 12.9% | 35 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.7% | 31 |
| vStar.RAFzilla 2.15 | 5.5 | 10.5% | 19 |
| sam.Samspin 1.0 | 7.2 | 6.5% | 3 |
| kurios.DOSexe .9b | 8.4 | 5.7% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.6 | 4.5% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 78.7 | 15 / 35 | 3549 |
| 2 | 1 | 65.4 | 83.8 | 13 / 35 | 4488 |
| 3 | 2 | 62.4 | 78.1 | 9 / 35 | 3654 |
| 4 | 2 | 63.7 | 79.0 | 12 / 35 | 3960 |
| 5 | 1 | 65.7 | 86.0 | 16 / 35 | 4173 |
| 6 | 1 | 65.4 | 86.3 | 15 / 35 | 3756 |
| 7 | 2 | 62.9 | 77.8 | 10 / 35 | 3879 |
| 8 | 1 | 64.3 | 82.9 | 13 / 35 | 3752 |
| 9 | 2 | 61.6 | 75.9 | 11 / 35 | 3224 |
| 10 | 1 | 64.0 | 81.6 | 12 / 35 | 3745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 67 | 49% |
| ejb.Polaris 1.0.1 | 59 | 88% |
| tvv.micro.Antares 1.1.1 | 28 | 29% |
| ne.Chimera 1.2 | 28 | 61% |
| vStar.RAFzilla 2.15 | 17 | 65% |
| donjezza.Muncho 1.0 | 5 | 60% |
| kurios.DOSexe .9b | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 226 of 350 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 84 | 37% | 117 |
| ne.Chimera 1.2 | 50 | 22% | 65 |
| tvv.micro.Antares 1.1.1 | 36 | 16% | 38 |
| ejb.Polaris 1.0.1 | 23 | 10% | 79 |
| vStar.RAFzilla 2.15 | 16 | 7% | 26 |
| sam.Samspin 1.0 | 8 | 4% | 11 |
| kurios.DOSexe .9b | 5 | 2% | 7 |
| donjezza.Muncho 1.0 | 3 | 1% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 0% | 1 |

## Melee bench: F11

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 67.2 | 66 / 350 | 3.95 | 12.9% | 30232 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.5% | 155 |
| cx.mini.Nimrod 0.55 | 2.4 | 13.0% | 50 |
| hadur117.nano.SanaroHC 0.2 | 2.7 | 12.9% | 66 |
| djc.DynaBot 0.1.1 | 4.1 | 11.1% | 30 |
| rdt199.Warlord 0.73 | 5.4 | 9.9% | 22 |
| br2.MobyDickBot 1.6 | 6.2 | 8.7% | 12 |
| uji.YellohFellah 1.0 | 6.5 | 8.5% | 17 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.7% | 2 |
| stelo.MirrorNano 1.3 | 9.5 | 5.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 70.8 | 6 / 35 | 3456 |
| 2 | 3 | 58.0 | 64.8 | 9 / 35 | 2909 |
| 3 | 3 | 56.5 | 65.4 | 5 / 35 | 2479 |
| 4 | 2 | 64.8 | 82.5 | 11 / 35 | 3682 |
| 5 | 3 | 58.2 | 67.6 | 7 / 35 | 2898 |
| 6 | 3 | 55.8 | 59.4 | 4 / 35 | 3129 |
| 7 | 2 | 58.5 | 67.9 | 7 / 35 | 2958 |
| 8 | 4 | 57.3 | 65.1 | 4 / 35 | 2981 |
| 9 | 2 | 58.5 | 65.1 | 9 / 35 | 2969 |
| 10 | 3 | 56.5 | 63.8 | 4 / 35 | 2771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 77 | 35% |
| cx.mini.Nimrod 0.55 | 26 | 58% |
| djc.DynaBot 0.1.1 | 14 | 64% |
| rdt199.Warlord 0.73 | 8 | 100% |
| uji.YellohFellah 1.0 | 7 | 29% |
| br2.MobyDickBot 1.6 | 4 | 75% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 118 | 41% | 139 |
| cx.mini.Nimrod 0.55 | 48 | 17% | 62 |
| rdt199.Warlord 0.73 | 29 | 10% | 36 |
| djc.DynaBot 0.1.1 | 23 | 8% | 35 |
| KiraNL.Chupacabra 0.4 | 21 | 7% | 24 |
| br2.MobyDickBot 1.6 | 16 | 6% | 22 |
| uji.YellohFellah 1.0 | 12 | 4% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 4% | 10 |
| stelo.MirrorNano 1.3 | 7 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 73.0 | 81 / 350 | 3.43 | 13.7% | 27490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.8% | 97 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.3% | 77 |
| hadur117.nano.SanaroHC 0.2 | 2.7 | 13.7% | 81 |
| darkcanuck.Leon 1.01 | 3.3 | 13.2% | 55 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.7% | 31 |
| jrm.Test0 1.0 | 6.2 | 8.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.1 | 7.4% | 3 |
| jp.Perpy 16.0 | 8.0 | 6.8% | 1 |
| jaybot.bots.Oddball 4.0 | 8.9 | 5.8% | 4 |
| stuff.Vlad 0.1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 76.8 | 9 / 35 | 2831 |
| 2 | 4 | 58.1 | 67.3 | 3 / 35 | 2940 |
| 3 | 1 | 62.6 | 78.7 | 12 / 35 | 2885 |
| 4 | 2 | 61.2 | 73.7 | 8 / 35 | 2994 |
| 5 | 3 | 59.7 | 71.1 | 7 / 35 | 2764 |
| 6 | 3 | 59.6 | 70.5 | 11 / 35 | 2637 |
| 7 | 4 | 57.3 | 66.3 | 5 / 35 | 2507 |
| 8 | 2 | 62.4 | 80.3 | 7 / 35 | 2907 |
| 9 | 2 | 61.8 | 77.1 | 12 / 35 | 2687 |
| 10 | 4 | 57.7 | 68.6 | 7 / 35 | 2338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 70 | 23% |
| bts.wiki.RipCurl 0.9b | 50 | 50% |
| darkcanuck.Leon 1.01 | 46 | 54% |
| brainfade.melee.Genghis 0.36 | 19 | 58% |
| jp.Perpy 16.0 | 3 | 67% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 0% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 269 of 350 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 80 | 30% | 99 |
| bts.wiki.RipCurl 0.9b | 59 | 22% | 82 |
| darkcanuck.Leon 1.01 | 44 | 16% | 71 |
| brainfade.melee.Genghis 0.36 | 32 | 12% | 35 |
| jrm.Test0 1.0 | 22 | 8% | 25 |
| cs.sheldor.Talon 1.1 | 14 | 5% | 16 |
| jp.Perpy 16.0 | 7 | 3% | 9 |
| stuff.Vlad 0.1 | 6 | 2% | 6 |
| jaybot.bots.Oddball 4.0 | 5 | 2% | 6 |

## Melee bench: F13

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 73.8 | 53 / 350 | 3.36 | 13.3% | 30102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.6% | 160 |
| ags.Glacier 0.2.11 | 1.8 | 17.0% | 89 |
| hadur117.nano.SanaroHC 0.2 | 3.4 | 13.3% | 53 |
| shinh.Entangled 0.3 | 3.8 | 12.5% | 37 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.4% | 9 |
| apc.Colossus2 0.17 | 6.0 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.1 | 6.8% | 2 |
| ayk.WallHugger 1.0 | 8.2 | 5.5% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.3 | 79.0 | 6 / 35 | 2546 |
| 2 | 3 | 62.2 | 80.0 | 7 / 35 | 2807 |
| 3 | 3 | 61.0 | 76.2 | 6 / 35 | 2830 |
| 4 | 3 | 59.3 | 70.2 | 6 / 35 | 2714 |
| 5 | 4 | 60.2 | 71.1 | 4 / 35 | 3271 |
| 6 | 4 | 59.0 | 68.6 | 3 / 35 | 3066 |
| 7 | 3 | 62.4 | 77.1 | 9 / 35 | 3279 |
| 8 | 4 | 60.9 | 75.6 | 4 / 35 | 2953 |
| 9 | 3 | 59.8 | 68.6 | 1 / 35 | 3524 |
| 10 | 3 | 60.4 | 71.4 | 7 / 35 | 3112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 83 | 39% |
| ags.Glacier 0.2.11 | 54 | 11% |
| shinh.Entangled 0.3 | 21 | 52% |
| gh.micro.Gruweltje 0.7 | 3 | 33% |
| stelo.Wang 1.0 | 2 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 99 | 33% | 108 |
| mn.Combat 3.25.0 | 92 | 31% | 122 |
| shinh.Entangled 0.3 | 43 | 14% | 53 |
| gh.micro.Gruweltje 0.7 | 37 | 12% | 39 |
| stelo.Wang 1.0 | 14 | 5% | 15 |
| maribo.FollowFire 1 | 6 | 2% | 6 |
| apc.Colossus2 0.17 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 1 | 0% | 2 |

## Melee bench: F14

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 78.4 | 102 / 350 | 2.95 | 14.6% | 31455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.1 | 18.0% | 130 |
| hadur117.nano.SanaroHC 0.2 | 2.0 | 14.6% | 102 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 57 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.9 | 10.4% | 7 |
| Lo_Ian.Gandalf_V4 4.0 | 5.6 | 9.9% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.7% | 13 |
| co.edu.usb.rc.LidisTron 1.0 | 5.9 | 9.7% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.0% | 18 |
| pa.Improved 1.0 | 9.0 | 5.6% | 4 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 78.7 | 11 / 35 | 3044 |
| 2 | 2 | 64.1 | 83.5 | 13 / 35 | 2839 |
| 3 | 2 | 62.6 | 78.4 | 7 / 35 | 3153 |
| 4 | 2 | 63.8 | 79.7 | 13 / 35 | 3392 |
| 5 | 2 | 62.2 | 79.0 | 11 / 35 | 2874 |
| 6 | 2 | 61.2 | 73.3 | 9 / 35 | 3363 |
| 7 | 2 | 61.7 | 76.8 | 10 / 35 | 3035 |
| 8 | 3 | 58.8 | 69.2 | 6 / 35 | 2796 |
| 9 | 1 | 63.2 | 80.6 | 11 / 35 | 3503 |
| 10 | 2 | 64.7 | 84.4 | 11 / 35 | 3456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 111 | 58% |
| catcat20.shape.Theta 0.018 | 40 | 40% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 33% |
| sanyi.mikrobi.Roberto 1.0 | 8 | 38% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |
| pa.Improved 1.0 | 5 | 40% |

Hadur died in 248 of 350 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 115 | 46% | 174 |
| catcat20.shape.Theta 0.018 | 37 | 15% | 52 |
| dmh.robocode.robot.RedDwarf 0.4 | 29 | 12% | 35 |
| co.edu.usb.rc.LidisTron 1.0 | 24 | 10% | 23 |
| sanyi.mikrobi.Roberto 1.0 | 16 | 6% | 20 |
| Lo_Ian.Gandalf_V4 4.0 | 14 | 6% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 4% | 19 |
| pa.Improved 1.0 | 3 | 1% | 5 |

## Melee bench: F15

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 65.8 | 59 / 350 | 4.07 | 12.9% | 34281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 2.0 | 14.3% | 68 |
| mld.DustBunny 3.8 | 2.3 | 13.5% | 42 |
| emp.Yngwie 1.11 | 2.4 | 14.0% | 105 |
| hadur117.nano.SanaroHC 0.2 | 3.7 | 12.9% | 59 |
| cb.nano.Insomnia 1.0 | 4.9 | 11.5% | 29 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.3% | 44 |
| Grystrion.TrackerWO 1.0 | 7.4 | 7.1% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.8% | 2 |
| divineomega.TrialBot 0.003 | 9.1 | 5.3% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 74.6 | 7 / 35 | 3983 |
| 2 | 4 | 56.8 | 62.2 | 3 / 35 | 3372 |
| 3 | 4 | 58.6 | 65.4 | 6 / 35 | 3288 |
| 4 | 3 | 60.4 | 66.7 | 7 / 35 | 3896 |
| 5 | 6 | 56.8 | 62.2 | 3 / 35 | 3039 |
| 6 | 4 | 59.0 | 64.8 | 6 / 35 | 3498 |
| 7 | 6 | 55.3 | 60.3 | 4 / 35 | 2833 |
| 8 | 3 | 58.5 | 66.0 | 7 / 35 | 3316 |
| 9 | 4 | 58.9 | 65.7 | 8 / 35 | 3222 |
| 10 | 2 | 61.3 | 70.5 | 8 / 35 | 3834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 41 | 66% |
| kawigi.robot.Girl 1.2 | 22 | 59% |
| cb.nano.Insomnia 1.0 | 18 | 61% |
| kawigi.micro.Shiz 1.1 | 17 | 24% |
| mld.DustBunny 3.8 | 14 | 7% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 73 | 25% | 83 |
| kawigi.micro.Shiz 1.1 | 61 | 21% | 70 |
| emp.Yngwie 1.11 | 56 | 19% | 85 |
| cb.nano.Insomnia 1.0 | 39 | 13% | 31 |
| kawigi.robot.Girl 1.2 | 28 | 10% | 40 |
| divineomega.TrialBot 0.003 | 12 | 4% | 17 |
| Grystrion.TrackerWO 1.0 | 12 | 4% | 14 |
| lambdaxy.TBot 0.1 | 8 | 3% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.0 | 66 / 350 | 3.88 | 13.5% | 36319 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.3% | 138 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 14.5% | 20 |
| hadur117.nano.SanaroHC 0.2 | 2.7 | 13.5% | 66 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.3% | 77 |
| tvv.nano.Polaris 1.2 | 5.1 | 10.0% | 25 |
| bvh.fnr.Fenrir 0.36l | 5.9 | 9.5% | 5 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 8.0% | 9 |
| divineomega.DivineBot 1.9.4.5 | 8.2 | 5.8% | 7 |
| repositorio.NanoStep 1.0 | 9.3 | 5.1% | 2 |
| asd.Cthulhu 1.3 | 9.4 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 68.6 | 6 / 35 | 3741 |
| 2 | 3 | 56.9 | 61.3 | 4 / 35 | 3131 |
| 3 | 3 | 57.3 | 60.3 | 6 / 35 | 3095 |
| 4 | 2 | 59.9 | 67.9 | 6 / 35 | 3657 |
| 5 | 3 | 58.1 | 63.5 | 5 / 35 | 3332 |
| 6 | 3 | 60.7 | 68.9 | 8 / 35 | 3752 |
| 7 | 3 | 60.4 | 68.6 | 7 / 35 | 3535 |
| 8 | 2 | 63.1 | 74.9 | 8 / 35 | 4000 |
| 9 | 3 | 61.4 | 69.5 | 8 / 35 | 3983 |
| 10 | 2 | 63.4 | 76.2 | 8 / 35 | 4093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 70 | 39% |
| techdude.forest.FlamingForest 1.1 | 28 | 29% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 94% |
| tvv.nano.Polaris 1.2 | 14 | 21% |
| divineomega.DivineBot 1.9.4.5 | 9 | 78% |
| bvh.fnr.Fenrir 0.36l | 4 | 75% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 1115. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 98 | 35% | 134 |
| techdude.forest.FlamingForest 1.1 | 48 | 17% | 56 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 47 | 17% | 57 |
| bvh.fnr.Fenrir 0.36l | 31 | 11% | 33 |
| tvv.nano.Polaris 1.2 | 24 | 8% | 27 |
| stelo.IntrinsicVolatility 1.4 | 15 | 5% | 15 |
| divineomega.DivineBot 1.9.4.5 | 13 | 5% | 18 |
| asd.Cthulhu 1.3 | 5 | 2% | 6 |
| repositorio.NanoStep 1.0 | 3 | 1% | 4 |

## Melee bench: F17

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 67.9 | 80 / 350 | 3.89 | 13.3% | 34049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.8 | 14.0% | 78 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.5% | 74 |
| hadur117.nano.SanaroHC 0.2 | 3.1 | 13.3% | 80 |
| cx.BlestPain 1.41 | 3.6 | 12.8% | 57 |
| nic.Nicator 2.4 | 4.9 | 11.6% | 31 |
| ahf.NanoAndrew .4 | 5.4 | 11.3% | 27 |
| maribo.melee.BMV 0.1 | 6.9 | 9.3% | 3 |
| tex.Longbot 0.4 | 8.3 | 5.7% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.6% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 72.7 | 11 / 35 | 3799 |
| 2 | 3 | 58.5 | 66.3 | 6 / 35 | 3043 |
| 3 | 4 | 59.4 | 65.4 | 7 / 35 | 3490 |
| 4 | 4 | 58.4 | 64.8 | 9 / 35 | 2857 |
| 5 | 2 | 62.8 | 75.6 | 11 / 35 | 3771 |
| 6 | 4 | 57.3 | 60.6 | 6 / 35 | 3546 |
| 7 | 2 | 61.4 | 72.4 | 9 / 35 | 3640 |
| 8 | 2 | 60.6 | 71.1 | 6 / 35 | 3500 |
| 9 | 4 | 59.7 | 67.3 | 10 / 35 | 3041 |
| 10 | 5 | 58.0 | 63.2 | 5 / 35 | 3362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 56 | 36% |
| oog.melee.Mercutio 1.0 | 37 | 54% |
| cx.BlestPain 1.41 | 30 | 80% |
| nic.Nicator 2.4 | 16 | 63% |
| ahf.NanoAndrew .4 | 13 | 46% |

Hadur died in 271 of 350 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 69 | 25% | 89 |
| oog.melee.Mercutio 1.0 | 53 | 20% | 75 |
| ahf.NanoAndrew .4 | 43 | 16% | 48 |
| nic.Nicator 2.4 | 40 | 15% | 48 |
| cx.BlestPain 1.41 | 37 | 14% | 61 |
| maribo.melee.BMV 0.1 | 20 | 7% | 20 |
| tex.Longbot 0.4 | 5 | 2% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 1% | 3 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 68.9 | 94 / 350 | 3.80 | 13.5% | 30978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.8 | 14.0% | 76 |
| hadur117.nano.SanaroHC 0.2 | 2.2 | 13.5% | 94 |
| agd.Mooserwirt2 2.7 | 2.3 | 13.3% | 84 |
| uji.DBH 1.1 | 4.2 | 11.6% | 35 |
| ratosh.Nobo 0.21 | 5.1 | 10.7% | 8 |
| spinnercat.Robovirus 2.718 | 5.4 | 10.0% | 17 |
| sigterm.Sigterm 1.0 | 7.1 | 8.6% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 8.1 | 7.1% | 7 |
| stelo.WangRobot 1.0 | 9.1 | 5.8% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 71.4 | 9 / 35 | 3582 |
| 2 | 2 | 61.0 | 74.0 | 12 / 35 | 3028 |
| 3 | 4 | 55.8 | 60.6 | 8 / 35 | 2640 |
| 4 | 1 | 62.6 | 76.2 | 14 / 35 | 3512 |
| 5 | 3 | 57.1 | 65.4 | 5 / 35 | 2910 |
| 6 | 1 | 61.0 | 73.7 | 9 / 35 | 3280 |
| 7 | 3 | 59.5 | 68.6 | 10 / 35 | 2957 |
| 8 | 3 | 57.7 | 63.8 | 7 / 35 | 3121 |
| 9 | 3 | 55.7 | 61.0 | 7 / 35 | 2744 |
| 10 | 1 | 61.6 | 74.3 | 13 / 35 | 3204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 46 | 65% |
| morbid.MorbidPriest 1.0 | 42 | 50% |
| uji.DBH 1.1 | 19 | 58% |
| spinnercat.Robovirus 2.718 | 16 | 69% |
| sigterm.Sigterm 1.0 | 11 | 64% |
| ratosh.Nobo 0.21 | 8 | 88% |
| stelo.WangRobot 1.0 | 7 | 71% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 40% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 0% |

Hadur died in 256 of 350 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 74 | 29% | 98 |
| agd.Mooserwirt2 2.7 | 61 | 24% | 90 |
| ratosh.Nobo 0.21 | 32 | 13% | 41 |
| spinnercat.Robovirus 2.718 | 25 | 10% | 28 |
| uji.DBH 1.1 | 23 | 9% | 29 |
| sigterm.Sigterm 1.0 | 16 | 6% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 4% | 18 |
| stelo.WangRobot 1.0 | 8 | 3% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 3% | 7 |

## Melee bench: F19

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.2 | 107 / 350 | 2.78 | 15.6% | 37516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.9 | 15.9% | 126 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.9% | 74 |
| hadur117.nano.SanaroHC 0.2 | 2.1 | 15.6% | 107 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.6% | 14 |
| erdnis.Rover 0.3 | 5.0 | 10.3% | 3 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.3% | 9 |
| pac.ABC 2.1 | 7.5 | 7.3% | 14 |
| mbh.Mbh 0.1 | 7.5 | 7.3% | 2 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 79.7 | 9 / 35 | 4020 |
| 2 | 1 | 67.4 | 88.6 | 15 / 35 | 4081 |
| 3 | 3 | 65.4 | 83.8 | 10 / 35 | 3553 |
| 4 | 3 | 63.6 | 78.4 | 8 / 35 | 3337 |
| 5 | 3 | 64.5 | 76.8 | 8 / 35 | 4084 |
| 6 | 2 | 65.6 | 82.5 | 11 / 35 | 3711 |
| 7 | 3 | 63.0 | 75.6 | 9 / 35 | 3624 |
| 8 | 2 | 63.4 | 75.2 | 11 / 35 | 3769 |
| 9 | 2 | 64.8 | 80.3 | 13 / 35 | 3528 |
| 10 | 1 | 65.1 | 81.3 | 13 / 35 | 3809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 98 | 37% |
| davidalves.net.DuelistMiniMelee 1.2 | 79 | 54% |
| krillr.mini.JointStrike 2.0.0 | 18 | 89% |
| patson.PatsonTestBot 1.0 | 8 | 75% |
| pac.ABC 2.1 | 7 | 43% |
| erdnis.Rover 0.3 | 3 | 33% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 244 of 350 rounds, at a mean tick of 1090. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 84 | 34% | 164 |
| mld.Infinity 2.2 | 78 | 32% | 32 |
| krillr.mini.JointStrike 2.0.0 | 23 | 9% | 45 |
| erdnis.Rover 0.3 | 20 | 8% | 33 |
| pac.ABC 2.1 | 16 | 7% | 23 |
| patson.PatsonTestBot 1.0 | 15 | 6% | 28 |
| mbh.Mbh 0.1 | 5 | 2% | 8 |
| pbg.R2D2 1.0 | 3 | 1% | 10 |

## Melee bench: F20

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.3 | 109 / 350 | 3.13 | 14.7% | 32486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.1% | 127 |
| hadur117.nano.SanaroHC 0.2 | 2.0 | 14.7% | 109 |
| fwb.Nine 1.0.1 | 3.5 | 11.7% | 42 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.6% | 21 |
| catcat20.Rabbit 0.001 | 4.9 | 10.3% | 32 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.9% | 7 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 8.5% | 5 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.9% | 6 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 76.8 | 9 / 35 | 3167 |
| 2 | 2 | 59.5 | 68.3 | 9 / 35 | 3181 |
| 3 | 2 | 60.2 | 70.5 | 10 / 35 | 3161 |
| 4 | 2 | 64.5 | 82.5 | 13 / 35 | 3478 |
| 5 | 2 | 65.0 | 81.9 | 16 / 35 | 3688 |
| 6 | 2 | 61.5 | 76.2 | 11 / 35 | 2969 |
| 7 | 2 | 60.8 | 74.3 | 11 / 35 | 2890 |
| 8 | 2 | 62.8 | 76.5 | 11 / 35 | 3600 |
| 9 | 2 | 62.4 | 78.1 | 9 / 35 | 3371 |
| 10 | 2 | 62.0 | 77.8 | 10 / 35 | 2981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 88 | 53% |
| fwb.Nine 1.0.1 | 31 | 65% |
| catcat20.Rabbit 0.001 | 23 | 57% |
| nz.jdc.nano.GridFu 1.0 | 16 | 69% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| m3thos.mini.Eva01 0.5.5 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 242 of 350 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 112 | 46% | 148 |
| fwb.Nine 1.0.1 | 38 | 16% | 42 |
| nz.jdc.nano.GridFu 1.0 | 31 | 13% | 44 |
| catcat20.Rabbit 0.001 | 21 | 9% | 41 |
| bayen.nut.Squirrel 1.615 | 14 | 6% | 21 |
| djdjdj.NanoSkunk10 1.0 | 13 | 5% | 26 |
| m3thos.mini.Eva01 0.5.5 | 7 | 3% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 2% | 7 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 3 |

## Melee bench: F21

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.8 | 132 / 350 | 2.63 | 16.5% | 42681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.2 | 17.7% | 154 |
| hadur117.nano.SanaroHC 0.2 | 1.8 | 16.5% | 132 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 19 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 16 |
| eld.Hmm 1.0 | 5.5 | 8.7% | 25 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.4% | 6 |
| fire219.CatBot 1.0 | 7.7 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 1 |
| PSW.Relentless 0.1 | 8.6 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 88.6 | 16 / 35 | 4121 |
| 2 | 1 | 66.9 | 83.8 | 18 / 35 | 4395 |
| 3 | 2 | 64.8 | 78.4 | 13 / 35 | 4077 |
| 4 | 2 | 64.7 | 78.1 | 10 / 35 | 4582 |
| 5 | 2 | 67.0 | 84.4 | 13 / 35 | 4522 |
| 6 | 2 | 62.9 | 74.3 | 8 / 35 | 4021 |
| 7 | 2 | 66.2 | 81.9 | 15 / 35 | 4411 |
| 8 | 2 | 67.7 | 87.6 | 15 / 35 | 4567 |
| 9 | 2 | 65.4 | 84.1 | 11 / 35 | 4200 |
| 10 | 2 | 63.6 | 77.1 | 13 / 35 | 3785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 150 | 55% |
| dummy.mini.Scimitar 1.01 | 36 | 83% |
| eld.Hmm 1.0 | 18 | 50% |
| cf.RiO.RiOx 4.2.1 | 16 | 56% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 219 of 350 rounds, at a mean tick of 1294. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 104 | 47% | 171 |
| dummy.mini.Scimitar 1.01 | 51 | 23% | 89 |
| cf.RiO.RiOx 4.2.1 | 30 | 14% | 41 |
| oa.weak.BotherBot 0.1 | 11 | 5% | 16 |
| eld.Hmm 1.0 | 10 | 5% | 19 |
| PSW.Relentless 0.1 | 7 | 3% | 7 |
| fire219.CatBot 1.0 | 2 | 1% | 3 |
| el.JumpShoot 0.2 | 2 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 86.0 | 143 / 350 | 2.26 | 16.9% | 38828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.3 | 18.4% | 128 |
| hadur117.nano.SanaroHC 0.2 | 1.9 | 16.9% | 143 |
| cre.Karolos 0.32 | 2.8 | 14.3% | 44 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.3% | 21 |
| stelo.RamTrackSurfer 1.2 | 5.4 | 9.4% | 9 |
| cw.megas.Blade 0.8 | 6.6 | 8.3% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.7 | 8.6% | 2 |
| sample.Walls 1.0 | 7.3 | 8.2% | 3 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 90.2 | 15 / 35 | 3680 |
| 2 | 2 | 67.8 | 87.6 | 16 / 35 | 3955 |
| 3 | 2 | 67.5 | 85.1 | 16 / 35 | 3997 |
| 4 | 1 | 66.4 | 85.1 | 16 / 35 | 3592 |
| 5 | 2 | 67.7 | 87.0 | 15 / 35 | 4119 |
| 6 | 2 | 66.8 | 84.8 | 15 / 35 | 4063 |
| 7 | 2 | 65.3 | 80.6 | 8 / 35 | 3893 |
| 8 | 2 | 66.7 | 87.3 | 13 / 35 | 3805 |
| 9 | 2 | 66.3 | 85.1 | 13 / 35 | 3434 |
| 10 | 2 | 67.7 | 87.3 | 16 / 35 | 4290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 132 | 54% |
| cre.Karolos 0.32 | 56 | 57% |
| stelo.AreaTargetingBot 1.1 | 33 | 64% |
| sample.Walls 1.0 | 11 | 91% |
| stelo.RamTrackSurfer 1.2 | 6 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 207 of 350 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 108 | 52% | 184 |
| cre.Karolos 0.32 | 51 | 25% | 82 |
| stelo.AreaTargetingBot 1.1 | 28 | 14% | 40 |
| stelo.RamTrackSurfer 1.2 | 8 | 4% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 3% | 8 |
| cw.megas.Blade 0.8 | 4 | 2% | 7 |
| sample.Walls 1.0 | 1 | 0% | 7 |

## Melee bench: F24

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.7 | 59.6 | 46 / 350 | 4.63 | 11.1% | 25006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.3 | 15.4% | 100 |
| florent.XSeries.X2 0.12 | 2.5 | 13.5% | 67 |
| davidalves.Phoenix 0.54 | 2.9 | 13.1% | 62 |
| pedersen.Ugluk 1.1.1 | 3.7 | 12.0% | 40 |
| hadur117.nano.SanaroHC 0.2 | 4.7 | 11.1% | 46 |
| oog.melee.Corsair 1.0 | 6.2 | 9.4% | 7 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.9% | 28 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.8% | 1 |
| as.FrankTheTank 1.3 | 9.4 | 5.2% | 0 |
| evd.X1 0.01 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 61.3 | 9 / 35 | 2600 |
| 2 | 4 | 56.4 | 63.2 | 5 / 35 | 2672 |
| 3 | 6 | 52.0 | 52.4 | 3 / 35 | 2628 |
| 4 | 4 | 57.5 | 68.3 | 3 / 35 | 2574 |
| 5 | 4 | 55.6 | 61.9 | 5 / 35 | 2588 |
| 6 | 5 | 54.8 | 59.0 | 4 / 35 | 2665 |
| 7 | 5 | 54.5 | 58.7 | 6 / 35 | 2367 |
| 8 | 5 | 53.0 | 58.4 | 5 / 35 | 2031 |
| 9 | 5 | 51.5 | 53.0 | 2 / 35 | 2321 |
| 10 | 5 | 55.2 | 60.0 | 4 / 35 | 2560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 29 | 41% |
| florent.XSeries.X2 0.12 | 27 | 52% |
| davidalves.Phoenix 0.54 | 17 | 59% |
| pedersen.Ugluk 1.1.1 | 12 | 42% |
| stelo.SoJNanoMelee 1.1 | 9 | 0% |
| oog.melee.Corsair 1.0 | 4 | 100% |
| evd.X1 0.01 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 304 of 350 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 70 | 23% | 80 |
| rz.GlowBlowMelee 1.4 | 63 | 21% | 78 |
| pedersen.Ugluk 1.1.1 | 50 | 16% | 55 |
| davidalves.Phoenix 0.54 | 45 | 15% | 54 |
| stelo.SoJNanoMelee 1.1 | 32 | 11% | 33 |
| oog.melee.Corsair 1.0 | 21 | 7% | 26 |
| lunchie.Lunchbox 0.93 | 13 | 4% | 14 |
| as.FrankTheTank 1.3 | 7 | 2% | 7 |
| evd.X1 0.01 | 3 | 1% | 3 |

## Melee bench: F25

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 72.5 | 80 / 350 | 3.48 | 13.9% | 29490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.7 | 14.4% | 86 |
| hadur117.nano.SanaroHC 0.2 | 2.1 | 13.9% | 80 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 13.9% | 69 |
| jdw.Hurricane 1.4 | 4.1 | 11.2% | 44 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 10.1% | 22 |
| ds.Oo 2.2 | 5.7 | 9.7% | 32 |
| gjr.Cephalosporin 0.1 | 7.0 | 8.6% | 11 |
| awesomeness.Elite 1.0 | 7.9 | 7.5% | 5 |
| adt.Ar2 1.1 | 8.8 | 6.6% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 75.6 | 9 / 35 | 2956 |
| 2 | 2 | 60.4 | 74.6 | 7 / 35 | 2766 |
| 3 | 2 | 61.3 | 74.6 | 12 / 35 | 2721 |
| 4 | 3 | 57.5 | 65.4 | 5 / 35 | 2730 |
| 5 | 2 | 62.4 | 76.8 | 10 / 35 | 3078 |
| 6 | 1 | 61.3 | 76.2 | 7 / 35 | 3036 |
| 7 | 2 | 60.3 | 73.7 | 7 / 35 | 2921 |
| 8 | 3 | 61.2 | 74.6 | 6 / 35 | 3138 |
| 9 | 2 | 59.7 | 66.7 | 9 / 35 | 3225 |
| 10 | 2 | 58.8 | 66.7 | 8 / 35 | 2919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 53 | 28% |
| voidious.mini.BrokenSword 2.0.3 | 52 | 27% |
| jdw.Hurricane 1.4 | 28 | 61% |
| gjr.Cephalosporin 0.1 | 14 | 79% |
| ds.Oo 2.2 | 14 | 43% |
| gre.svman4.Morfeas 1.4.1 | 14 | 64% |
| awesomeness.Elite 1.0 | 5 | 60% |
| adt.Ar2 1.1 | 5 | 100% |

Hadur died in 271 of 350 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 72 | 27% | 87 |
| voidious.mini.BrokenSword 2.0.3 | 63 | 23% | 80 |
| jdw.Hurricane 1.4 | 42 | 15% | 59 |
| ds.Oo 2.2 | 23 | 8% | 28 |
| gre.svman4.Morfeas 1.4.1 | 21 | 8% | 30 |
| gjr.Cephalosporin 0.1 | 20 | 7% | 30 |
| adt.Ar2 1.1 | 13 | 5% | 18 |
| awesomeness.Elite 1.0 | 12 | 4% | 14 |
| amk.ChumbaMini 0.2 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 70.1 | 56 / 350 | 3.69 | 13.2% | 34516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 17.0% | 134 |
| shu.nitro.LENIN .T34 | 2.9 | 13.3% | 78 |
| hadur117.nano.SanaroHC 0.2 | 3.2 | 13.2% | 56 |
| lrem.Spectre 0.4.4 | 3.3 | 12.6% | 41 |
| js.PinBall 1.6 | 5.2 | 11.1% | 18 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 10.5% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.1% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 5 |
| sample.SpinBot 1.0 | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 74.6 | 6 / 35 | 3954 |
| 2 | 3 | 61.4 | 74.6 | 3 / 35 | 3452 |
| 3 | 4 | 58.4 | 65.4 | 4 / 35 | 3459 |
| 4 | 5 | 57.9 | 64.8 | 6 / 35 | 2878 |
| 5 | 3 | 59.7 | 67.6 | 7 / 35 | 3355 |
| 6 | 2 | 64.3 | 77.8 | 14 / 35 | 3818 |
| 7 | 2 | 62.0 | 74.9 | 4 / 35 | 3817 |
| 8 | 3 | 59.8 | 69.5 | 5 / 35 | 3435 |
| 9 | 4 | 60.4 | 70.5 | 6 / 35 | 3292 |
| 10 | 4 | 56.6 | 61.6 | 1 / 35 | 3056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 59 | 36% |
| shu.nitro.LENIN .T34 | 32 | 16% |
| lrem.Spectre 0.4.4 | 24 | 42% |
| js.PinBall 1.6 | 12 | 75% |
| gh.mini.GrubbmOne 1.0 | 8 | 50% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 60% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 95 | 32% | 118 |
| shu.nitro.LENIN .T34 | 57 | 19% | 63 |
| lrem.Spectre 0.4.4 | 48 | 16% | 57 |
| gh.mini.GrubbmOne 1.0 | 30 | 10% | 36 |
| js.PinBall 1.6 | 26 | 9% | 31 |
| jaybot.adv.bots.JayBot 2.0 | 15 | 5% | 18 |
| sample.SpinBot 1.0 | 12 | 4% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 11 | 4% | 14 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 66.5 | 99 / 350 | 4.01 | 13.3% | 31733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.1 | 16.2% | 143 |
| hadur117.nano.SanaroHC 0.2 | 2.4 | 13.3% | 99 |
| sheldor.melee.nano.TestMelee 0.1 | 3.9 | 11.3% | 31 |
| EH.Eagle 1.0.6 | 4.0 | 11.3% | 10 |
| wee.Gem 1.8.4 | 4.2 | 11.5% | 48 |
| techdude.kombat.FlamingKombat 1.5 | 6.1 | 9.4% | 13 |
| joe.ADinosaur 1.0 | 6.9 | 8.8% | 4 |
| throxbot.ThroxBot 0.1 | 7.7 | 8.0% | 3 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.2% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.4 | 67.0 | 8 / 35 | 2548 |
| 2 | 5 | 51.3 | 40.6 | 6 / 35 | 3786 |
| 3 | 3 | 60.6 | 72.7 | 11 / 35 | 2806 |
| 4 | 2 | 61.3 | 74.9 | 12 / 35 | 2954 |
| 5 | 2 | 59.2 | 57.1 | 9 / 35 | 4351 |
| 6 | 2 | 60.5 | 75.2 | 10 / 35 | 2655 |
| 7 | 1 | 62.3 | 77.8 | 14 / 35 | 2901 |
| 8 | 2 | 59.6 | 73.0 | 9 / 35 | 2365 |
| 9 | 3 | 57.4 | 52.1 | 6 / 35 | 4250 |
| 10 | 2 | 62.0 | 74.9 | 14 / 35 | 3117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 83 | 64% |
| wee.Gem 1.8.4 | 26 | 62% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 56% |
| EH.Eagle 1.0.6 | 9 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 75% |
| throxbot.ThroxBot 0.1 | 4 | 75% |
| joe.ADinosaur 1.0 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 252 of 350 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 79 | 31% | 129 |
| sheldor.melee.nano.TestMelee 0.1 | 36 | 14% | 47 |
| wee.Gem 1.8.4 | 32 | 13% | 52 |
| joe.ADinosaur 1.0 | 26 | 10% | 26 |
| cs.Grudge 1.0 | 20 | 8% | 19 |
| EH.Eagle 1.0.6 | 19 | 8% | 27 |
| throxbot.ThroxBot 0.1 | 19 | 8% | 24 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 4% | 15 |
| caimano.Furia_Ceca 0.22 | 9 | 4% | 11 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.3 | 108 / 350 | 2.96 | 15.1% | 32426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.1 | 16.6% | 127 |
| hadur117.nano.SanaroHC 0.2 | 1.9 | 15.1% | 108 |
| uji.Antique 1.0 | 3.3 | 12.9% | 58 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.2% | 31 |
| pfvicm.Sobieski 7.2.3b | 4.4 | 10.4% | 7 |
| ahr.ice.Ice 1.0.2 | 6.1 | 8.5% | 14 |
| amk.ChumbaWumba 0.3 | 7.6 | 7.2% | 2 |
| matt.advanced.Katana 1.0 | 7.7 | 6.7% | 3 |
| stelo.PianistNano 1.2 | 9.2 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.4 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 82.5 | 11 / 35 | 3326 |
| 2 | 2 | 62.4 | 75.6 | 14 / 35 | 3129 |
| 3 | 2 | 62.3 | 76.5 | 8 / 35 | 3415 |
| 4 | 2 | 60.4 | 71.4 | 10 / 35 | 3192 |
| 5 | 2 | 62.3 | 80.3 | 9 / 35 | 3141 |
| 6 | 2 | 63.1 | 77.8 | 12 / 35 | 3225 |
| 7 | 2 | 63.4 | 77.8 | 13 / 35 | 3440 |
| 8 | 2 | 62.7 | 80.6 | 12 / 35 | 2852 |
| 9 | 2 | 63.1 | 80.3 | 7 / 35 | 3461 |
| 10 | 2 | 63.5 | 79.7 | 12 / 35 | 3245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 114 | 47% |
| uji.Antique 1.0 | 40 | 55% |
| qohnil.blot.BlotBot 3.61 | 22 | 45% |
| pfvicm.Sobieski 7.2.3b | 12 | 92% |
| ahr.ice.Ice 1.0.2 | 8 | 50% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| matt.advanced.Katana 1.0 | 2 | 0% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 243 of 350 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 101 | 42% | 141 |
| uji.Antique 1.0 | 52 | 21% | 83 |
| pfvicm.Sobieski 7.2.3b | 32 | 13% | 40 |
| qohnil.blot.BlotBot 3.61 | 19 | 8% | 31 |
| amk.ChumbaWumba 0.3 | 15 | 6% | 19 |
| ahr.ice.Ice 1.0.2 | 11 | 5% | 12 |
| matt.advanced.Katana 1.0 | 7 | 3% | 12 |
| stelo.PianistNano 1.2 | 4 | 2% | 6 |
| stelo.Lifestealer 1.0 | 2 | 1% | 5 |

## Melee bench: F29

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 66.2 | 56 / 350 | 4.05 | 13.0% | 31592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 15.7% | 110 |
| deewiant.Anomaly 0.2 | 1.7 | 15.9% | 112 |
| myl.micro.Troodon 1.10 | 3.4 | 13.0% | 25 |
| hadur117.nano.SanaroHC 0.2 | 3.5 | 13.0% | 56 |
| jok.PheonixM 0.1.2 | 4.9 | 11.0% | 17 |
| ph.melee.ArcherME 0.3 | 6.4 | 8.4% | 1 |
| DBall.Anarchy 0.1 | 6.7 | 8.0% | 25 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.7% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.5% | 1 |
| jangs.ns51 1.0 | 9.4 | 4.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 72.1 | 11 / 35 | 3271 |
| 2 | 4 | 58.0 | 63.8 | 6 / 35 | 2784 |
| 3 | 4 | 58.8 | 65.1 | 5 / 35 | 3045 |
| 4 | 4 | 57.0 | 58.4 | 4 / 35 | 3067 |
| 5 | 3 | 62.5 | 72.4 | 10 / 35 | 3273 |
| 6 | 3 | 61.4 | 73.0 | 4 / 35 | 3151 |
| 7 | 3 | 58.1 | 63.5 | 3 / 35 | 3170 |
| 8 | 4 | 56.4 | 58.4 | 3 / 35 | 3003 |
| 9 | 4 | 59.4 | 64.1 | 5 / 35 | 3730 |
| 10 | 4 | 61.0 | 70.8 | 5 / 35 | 3098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 53 | 13% |
| zyx.mega.YersiniaPestis 3.1 | 43 | 56% |
| myl.micro.Troodon 1.10 | 18 | 78% |
| DBall.Anarchy 0.1 | 12 | 25% |
| jok.PheonixM 0.1.2 | 11 | 55% |
| jangs.ns51 1.0 | 1 | 0% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 105 | 36% | 114 |
| zyx.mega.YersiniaPestis 3.1 | 66 | 22% | 87 |
| myl.micro.Troodon 1.10 | 52 | 18% | 65 |
| jok.PheonixM 0.1.2 | 37 | 13% | 43 |
| DBall.Anarchy 0.1 | 13 | 4% | 18 |
| ph.melee.ArcherME 0.3 | 13 | 4% | 14 |
| jangs.ns51 1.0 | 5 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 1% | 4 |

## Melee bench: F30

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.7 | 56.3 | 24 / 350 | 4.93 | 10.6% | 26521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.6 | 14.1% | 97 |
| darkcanuck.B26354 1.06 | 2.7 | 13.7% | 84 |
| stelo.PastFuture 2.3.2 | 2.8 | 13.6% | 51 |
| oog.melee.Capulet 1.2 | 3.0 | 13.6% | 69 |
| hadur117.nano.SanaroHC 0.2 | 5.1 | 10.6% | 24 |
| intruder.PrairieWolf 2.61 | 6.4 | 8.9% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 7.4 | 7.9% | 9 |
| ntc.Opposite 1.5 | 7.8 | 7.9% | 0 |
| tripphippy.Alice 1.1 | 8.2 | 7.4% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.3 | 53.0 | 0 / 35 | 2859 |
| 2 | 6 | 50.3 | 47.9 | 4 / 35 | 2372 |
| 3 | 5 | 58.1 | 65.7 | 6 / 35 | 2864 |
| 4 | 4 | 56.8 | 62.5 | 4 / 35 | 2839 |
| 5 | 5 | 54.7 | 58.4 | 3 / 35 | 2651 |
| 6 | 5 | 51.8 | 52.4 | 0 / 35 | 2607 |
| 7 | 5 | 53.5 | 54.9 | 2 / 35 | 2661 |
| 8 | 6 | 53.6 | 58.1 | 4 / 35 | 2334 |
| 9 | 5 | 54.4 | 55.9 | 1 / 35 | 3004 |
| 10 | 5 | 51.6 | 54.0 | 0 / 35 | 2330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 28 | 18% |
| catcat20.Matcha 0.006 | 25 | 8% |
| oog.melee.Capulet 1.2 | 13 | 31% |
| stelo.PastFuture 2.3.2 | 12 | 33% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 100% |
| tripphippy.Alice 1.1 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 3 | 67% |

Hadur died in 326 of 350 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 74 | 23% | 76 |
| darkcanuck.B26354 1.06 | 66 | 20% | 70 |
| stelo.PastFuture 2.3.2 | 61 | 19% | 70 |
| oog.melee.Capulet 1.2 | 51 | 16% | 55 |
| ntc.Opposite 1.5 | 19 | 6% | 20 |
| intruder.PrairieWolf 2.61 | 18 | 6% | 20 |
| fowl3628800.LightningBolt 2.6.0 | 18 | 6% | 18 |
| tripphippy.Alice 1.1 | 15 | 5% | 17 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 62.8 | 36 / 350 | 4.35 | 11.6% | 25010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 176 |
| gh.mini.Griezel 0.2 | 2.0 | 14.3% | 89 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 11.9% | 25 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.4% | 14 |
| hadur117.nano.SanaroHC 0.2 | 4.4 | 11.6% | 36 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.1% | 9 |
| timmit.nano.TimDog 0.33 | 7.4 | 7.0% | 3 |
| fm.mammillarias 1.3 | 7.8 | 6.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 73.7 | 8 / 35 | 2622 |
| 2 | 3 | 56.5 | 66.0 | 4 / 35 | 2340 |
| 3 | 5 | 57.0 | 63.8 | 4 / 35 | 2570 |
| 4 | 5 | 54.6 | 59.7 | 3 / 35 | 2343 |
| 5 | 6 | 53.3 | 55.2 | 3 / 35 | 2312 |
| 6 | 5 | 54.1 | 59.4 | 1 / 35 | 2204 |
| 7 | 5 | 55.9 | 60.3 | 4 / 35 | 2652 |
| 8 | 3 | 56.2 | 62.5 | 3 / 35 | 2774 |
| 9 | 4 | 57.9 | 67.0 | 4 / 35 | 2549 |
| 10 | 5 | 55.9 | 60.6 | 2 / 35 | 2644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 51 | 33% |
| abc.Shadow 3.84i | 44 | 27% |
| spinnercat.micro.Tyger 0.1 | 12 | 25% |
| timmit.nano.TimDog 0.33 | 4 | 50% |
| d414.nano.Quantum 1.0.0 | 3 | 0% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |

Hadur died in 314 of 350 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 81 | 26% | 98 |
| abc.Shadow 3.84i | 71 | 23% | 84 |
| spinnercat.micro.Tyger 0.1 | 58 | 18% | 61 |
| d414.nano.Quantum 1.0.0 | 48 | 15% | 49 |
| fm.mammillarias 1.3 | 18 | 6% | 18 |
| gh.nano.Grofvuil 0.2 | 17 | 5% | 19 |
| timmit.nano.TimDog 0.33 | 14 | 4% | 14 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 77.7 | 151 / 350 | 3.01 | 15.2% | 33253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHC 0.2 | 1.4 | 15.2% | 151 |
| kawigi.sbf.FloodHT 0.9.2 | 1.6 | 14.9% | 89 |
| apc.botM 3.0 | 3.1 | 12.3% | 39 |
| vjik.UnViolation 1.1 | 4.6 | 10.6% | 23 |
| lxx.ConceptA 0.8 | 4.7 | 10.5% | 11 |
| bayen.UbaMicro 1.4 | 5.8 | 9.2% | 4 |
| panzer.Panzer 0.2 | 7.5 | 7.5% | 2 |
| yk.JahMicro 1.0 | 7.7 | 7.5% | 18 |
| conscience.Electron 1.3g | 8.8 | 6.6% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.7% | 14 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 80.0 | 14 / 35 | 3602 |
| 2 | 2 | 63.3 | 81.6 | 15 / 35 | 3200 |
| 3 | 2 | 61.4 | 75.9 | 13 / 35 | 3095 |
| 4 | 2 | 60.5 | 71.4 | 12 / 35 | 3219 |
| 5 | 1 | 64.6 | 83.8 | 19 / 35 | 3252 |
| 6 | 1 | 61.3 | 73.7 | 16 / 35 | 2991 |
| 7 | 1 | 61.6 | 76.2 | 12 / 35 | 3484 |
| 8 | 2 | 61.1 | 72.4 | 15 / 35 | 3263 |
| 9 | 1 | 64.5 | 82.2 | 18 / 35 | 3545 |
| 10 | 1 | 63.7 | 80.0 | 17 / 35 | 3602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 91 | 68% |
| apc.botM 3.0 | 40 | 75% |
| vjik.UnViolation 1.1 | 27 | 81% |
| lxx.ConceptA 0.8 | 19 | 79% |
| donjezza.Jezza 1.0 | 12 | 58% |
| yk.JahMicro 1.0 | 10 | 50% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 199 of 350 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 58 | 29% | 121 |
| lxx.ConceptA 0.8 | 34 | 17% | 46 |
| apc.botM 3.0 | 28 | 14% | 64 |
| bayen.UbaMicro 1.4 | 26 | 13% | 32 |
| panzer.Panzer 0.2 | 15 | 8% | 16 |
| vjik.UnViolation 1.1 | 13 | 7% | 36 |
| yk.JahMicro 1.0 | 13 | 7% | 14 |
| donjezza.Jezza 1.0 | 6 | 3% | 14 |
| conscience.Electron 1.3g | 6 | 3% | 7 |

## Melee bench: F33

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 70.6 | 78 / 350 | 3.64 | 14.0% | 34959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.1 | 16.9% | 105 |
| hadur117.nano.SanaroHC 0.2 | 2.5 | 14.0% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 13.8% | 63 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 12.0% | 49 |
| labg.Cataclysm 2.05 | 4.6 | 11.3% | 42 |
| baal.nano.N 1.42 | 6.4 | 8.6% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.4% | 10 |
| zyx.micro.Ant 1.1 | 8.2 | 5.7% | 2 |
| sanja.First 0.1 | 9.3 | 4.7% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 75.6 | 8 / 35 | 3665 |
| 2 | 4 | 58.6 | 65.4 | 5 / 35 | 2978 |
| 3 | 2 | 62.0 | 72.1 | 11 / 35 | 3270 |
| 4 | 4 | 57.9 | 64.1 | 3 / 35 | 3075 |
| 5 | 2 | 61.6 | 72.4 | 9 / 35 | 3332 |
| 6 | 3 | 61.7 | 71.4 | 7 / 35 | 3600 |
| 7 | 2 | 60.2 | 68.3 | 7 / 35 | 3387 |
| 8 | 2 | 63.5 | 77.1 | 9 / 35 | 3927 |
| 9 | 3 | 59.9 | 65.7 | 6 / 35 | 3785 |
| 10 | 1 | 63.3 | 74.3 | 13 / 35 | 3940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 53 | 53% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 22% |
| gre.svman4.Leonidas 1.3.2 | 31 | 61% |
| labg.Cataclysm 2.05 | 21 | 57% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 63% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| baal.nano.N 1.42 | 2 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 1089. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 94 | 35% | 130 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 78 | 29% | 91 |
| gre.svman4.Leonidas 1.3.2 | 40 | 15% | 50 |
| labg.Cataclysm 2.05 | 23 | 8% | 34 |
| kinsen.melee.Angsaichmophobia 1.8c | 18 | 7% | 18 |
| zyx.micro.Ant 1.1 | 8 | 3% | 9 |
| baal.nano.N 1.42 | 6 | 2% | 11 |
| sanja.First 0.1 | 4 | 1% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 0% | 1 |

## Melee bench: F34

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 74.4 | 63 / 350 | 3.31 | 14.0% | 34263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.0% | 124 |
| kid.Gladiator .7.2 | 1.5 | 16.9% | 104 |
| hadur117.nano.SanaroHC 0.2 | 3.1 | 14.0% | 63 |
| jcs.Seth 1.8 | 4.1 | 12.0% | 36 |
| tcf.Reach 3 | 5.1 | 10.8% | 10 |
| cli.Dancer 1.1 | 5.7 | 10.2% | 10 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 3 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.7% | 1 |
| sample.RamFire 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 75.9 | 7 / 35 | 3708 |
| 2 | 3 | 60.4 | 71.4 | 4 / 35 | 3157 |
| 3 | 3 | 60.8 | 70.8 | 5 / 35 | 3277 |
| 4 | 3 | 62.4 | 77.5 | 8 / 35 | 3130 |
| 5 | 3 | 62.1 | 74.0 | 6 / 35 | 3334 |
| 6 | 4 | 59.7 | 67.0 | 5 / 35 | 3166 |
| 7 | 3 | 64.2 | 81.3 | 7 / 35 | 3556 |
| 8 | 3 | 63.0 | 74.6 | 5 / 35 | 3924 |
| 9 | 3 | 62.0 | 75.2 | 8 / 35 | 3177 |
| 10 | 3 | 63.7 | 76.2 | 8 / 35 | 3834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 50 | 54% |
| kid.Gladiator .7.2 | 47 | 21% |
| jcs.Seth 1.8 | 32 | 59% |
| cli.Dancer 1.1 | 8 | 25% |
| tcf.Reach 3 | 6 | 67% |
| ratosh.Wesco 1.4 | 3 | 33% |

Hadur died in 288 of 350 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 114 | 40% | 117 |
| stelo.Spread 0.9 | 90 | 31% | 122 |
| jcs.Seth 1.8 | 29 | 10% | 48 |
| tcf.Reach 3 | 20 | 7% | 26 |
| cli.Dancer 1.1 | 14 | 5% | 16 |
| ratosh.Wesco 1.4 | 13 | 5% | 14 |
| amk.Punbot.Punbot 0.01 | 6 | 2% | 6 |
| sample.RamFire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 71.4 | 27 / 350 | 3.58 | 12.8% | 26659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.8% | 274 |
| gh.mini.Gruwel 0.9 | 2.6 | 13.2% | 23 |
| hadur117.nano.SanaroHC 0.2 | 2.9 | 12.8% | 27 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.1 | 11.6% | 12 |
| rz.HawkOnFire 0.1 | 4.4 | 11.8% | 12 |
| wit.Chuliath 1.0 | 6.2 | 7.3% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.1 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.4 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 75.9 | 1 / 35 | 2769 |
| 2 | 3 | 58.3 | 64.8 | 2 / 35 | 3117 |
| 3 | 2 | 59.4 | 71.1 | 3 / 35 | 2683 |
| 4 | 4 | 58.2 | 69.2 | 2 / 35 | 2530 |
| 5 | 3 | 58.9 | 71.4 | 0 / 35 | 2535 |
| 6 | 2 | 62.7 | 79.0 | 7 / 35 | 2953 |
| 7 | 3 | 60.2 | 75.6 | 4 / 35 | 2380 |
| 8 | 4 | 57.7 | 66.7 | 2 / 35 | 2441 |
| 9 | 3 | 59.4 | 71.4 | 4 / 35 | 2552 |
| 10 | 3 | 58.7 | 68.6 | 2 / 35 | 2699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 94 | 3% |
| gh.mini.Gruwel 0.9 | 21 | 62% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 70% |
| rz.HawkOnFire 0.1 | 9 | 44% |

Hadur died in 325 of 350 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 165 | 51% | 168 |
| gh.mini.Gruwel 0.9 | 51 | 16% | 62 |
| rz.HawkOnFire 0.1 | 47 | 14% | 51 |
| dmh.robocode.robot.BlackDeath 9.2 | 39 | 12% | 46 |
| myl.nano.KomoriNinja 1.1 | 7 | 2% | 8 |
| wit.Chuliath 1.0 | 4 | 1% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 4 |
| dans.Cinnamon 1.2 | 4 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 73.1 | 118 / 350 | 3.42 | 14.8% | 35364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHC 0.2 | 1.4 | 14.8% | 118 |
| alpha.RainingFire 1.0 | 2.0 | 12.9% | 51 |
| bzdp.Pansy 2.1 | 3.0 | 12.6% | 55 |
| mz.Cork 0.1 | 4.6 | 11.1% | 34 |
| bvh.micro.Freya 0.3 | 4.9 | 11.0% | 30 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.9% | 9 |
| m3thos.Eva02 0.7.1 | 6.1 | 9.9% | 26 |
| dl.BetterWalls 1.0 | 8.3 | 6.8% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.5% | 4 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.6% | 21 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 71.7 | 14 / 35 | 3495 |
| 2 | 1 | 63.1 | 76.8 | 15 / 35 | 3488 |
| 3 | 1 | 61.9 | 74.3 | 10 / 35 | 3603 |
| 4 | 3 | 59.0 | 65.4 | 8 / 35 | 3559 |
| 5 | 3 | 57.8 | 61.6 | 8 / 35 | 3445 |
| 6 | 1 | 63.1 | 76.2 | 12 / 35 | 3435 |
| 7 | 1 | 64.3 | 81.0 | 13 / 35 | 3698 |
| 8 | 1 | 62.4 | 73.0 | 15 / 35 | 3528 |
| 9 | 1 | 62.6 | 77.1 | 10 / 35 | 3548 |
| 10 | 1 | 61.9 | 73.7 | 13 / 35 | 3565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 53% |
| bvh.micro.Freya 0.3 | 31 | 81% |
| alpha.RainingFire 1.0 | 29 | 59% |
| mz.Cork 0.1 | 25 | 60% |
| bvh.mini.Fenrir 0.39 | 22 | 82% |
| m3thos.Eva02 0.7.1 | 11 | 55% |
| dl.BetterWalls 1.0 | 10 | 90% |
| sample.MyFirstRobot 1.0 | 8 | 25% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |

Hadur died in 232 of 350 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 48 | 21% | 63 |
| bzdp.Pansy 2.1 | 46 | 20% | 80 |
| bvh.mini.Fenrir 0.39 | 34 | 15% | 42 |
| mz.Cork 0.1 | 32 | 14% | 48 |
| bvh.micro.Freya 0.3 | 26 | 11% | 40 |
| m3thos.Eva02 0.7.1 | 24 | 10% | 36 |
| sample.MyFirstRobot 1.0 | 10 | 4% | 12 |
| squidM.TentalceMeleeNano 1.1 | 7 | 3% | 12 |
| dl.BetterWalls 1.0 | 5 | 2% | 17 |

## Melee bench: F37

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.9 | 144 / 350 | 2.99 | 15.6% | 43097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHC 0.2 | 1.0 | 15.6% | 144 |
| germ.TheMind .2 | 2.6 | 11.7% | 50 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 11.1% | 24 |
| EBBU.Sim2 1.02 | 3.8 | 10.8% | 35 |
| stelo.UntouchableNano 1.3 | 5.8 | 9.6% | 21 |
| agrach.Dalek 1.0 | 5.8 | 9.5% | 33 |
| lmk.ACPFinal 0.1 | 7.3 | 8.5% | 13 |
| mb.Beast 0.1 | 7.5 | 8.5% | 20 |
| skm.Ryubot 1.0 | 8.9 | 7.4% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 9.1 | 7.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 76.5 | 15 / 35 | 3878 |
| 2 | 1 | 63.0 | 78.1 | 15 / 35 | 4314 |
| 3 | 1 | 63.3 | 81.0 | 15 / 35 | 4195 |
| 4 | 1 | 62.9 | 74.0 | 16 / 35 | 4673 |
| 5 | 1 | 63.7 | 82.5 | 15 / 35 | 4383 |
| 6 | 1 | 62.2 | 76.5 | 13 / 35 | 4160 |
| 7 | 1 | 59.4 | 70.5 | 9 / 35 | 4083 |
| 8 | 1 | 64.4 | 82.2 | 16 / 35 | 4620 |
| 9 | 1 | 65.0 | 84.1 | 19 / 35 | 4502 |
| 10 | 1 | 61.1 | 73.7 | 11 / 35 | 4289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 38 | 55% |
| germ.TheMind .2 | 37 | 49% |
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 83% |
| stelo.UntouchableNano 1.3 | 28 | 71% |
| agrach.Dalek 1.0 | 22 | 77% |
| mb.Beast 0.1 | 21 | 81% |
| skm.Ryubot 1.0 | 20 | 65% |
| lmk.ACPFinal 0.1 | 16 | 88% |

Hadur died in 209 of 350 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 39 | 19% | 59 |
| com.syncleus.robocode.Dreadnaught 0.1 | 35 | 17% | 61 |
| EBBU.Sim2 1.02 | 30 | 14% | 47 |
| agrach.Dalek 1.0 | 26 | 12% | 48 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 10% | 27 |
| lmk.ACPFinal 0.1 | 18 | 9% | 22 |
| stelo.UntouchableNano 1.3 | 16 | 8% | 31 |
| mb.Beast 0.1 | 12 | 6% | 28 |
| skm.Ryubot 1.0 | 12 | 6% | 24 |

## Melee bench: F38

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 64.9 | 54 / 350 | 4.16 | 12.1% | 27517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.1 | 16.8% | 149 |
| bvh.mini.Freya 0.55 | 2.3 | 13.8% | 45 |
| hadur117.nano.SanaroHC 0.2 | 4.0 | 12.1% | 54 |
| bts.mega.Gnarly 1.4 | 4.1 | 11.5% | 46 |
| cs.Wren 1.0 | 4.8 | 11.1% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 11.1% | 25 |
| kdf.KoulDestroyer 1.0 | 6.9 | 8.9% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.8% | 3 |
| matt.UnderDark3 2.4.34 | 9.1 | 4.7% | 4 |
| bzdp.BoxCar 2.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 66.7 | 7 / 35 | 2827 |
| 2 | 3 | 59.5 | 70.8 | 8 / 35 | 2981 |
| 3 | 3 | 59.9 | 72.1 | 8 / 35 | 2690 |
| 4 | 3 | 57.7 | 65.7 | 5 / 35 | 2932 |
| 5 | 5 | 55.0 | 58.4 | 6 / 35 | 2603 |
| 6 | 6 | 53.3 | 56.8 | 2 / 35 | 2473 |
| 7 | 6 | 54.5 | 58.4 | 3 / 35 | 2701 |
| 8 | 3 | 56.4 | 63.2 | 4 / 35 | 2706 |
| 9 | 3 | 60.3 | 73.7 | 5 / 35 | 3070 |
| 10 | 5 | 56.8 | 63.2 | 6 / 35 | 2534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 51 | 53% |
| bvh.mini.Freya 0.55 | 21 | 52% |
| bts.mega.Gnarly 1.4 | 21 | 38% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 0% |
| cs.Wren 1.0 | 6 | 67% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 0% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 82 | 28% | 110 |
| bvh.mini.Freya 0.55 | 57 | 19% | 65 |
| bts.mega.Gnarly 1.4 | 39 | 13% | 47 |
| cs.Wren 1.0 | 37 | 12% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 11% | 35 |
| kdf.KoulDestroyer 1.0 | 29 | 10% | 31 |
| matt.UnderDark3 2.4.34 | 9 | 3% | 9 |
| bzdp.BoxCar 2.0 | 6 | 2% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.8 | 63.0 | 41 / 350 | 4.33 | 11.8% | 29067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 16.2% | 87 |
| az.Ololobot 0.2.4 | 2.1 | 13.6% | 126 |
| hadur117.nano.SanaroHC 0.2 | 3.4 | 11.8% | 41 |
| catcat20.Lambda 0.024 | 3.4 | 11.9% | 50 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.7% | 27 |
| winamp32.micro.MicroMacro 1.0 | 6.6 | 8.7% | 6 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.6% | 6 |
| gimp.GimpBot 0.1 | 7.3 | 8.1% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.4% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 66.3 | 8 / 35 | 3008 |
| 2 | 3 | 55.7 | 64.1 | 3 / 35 | 2822 |
| 3 | 3 | 57.2 | 66.7 | 4 / 35 | 3009 |
| 4 | 4 | 56.3 | 63.5 | 3 / 35 | 3000 |
| 5 | 3 | 56.0 | 63.8 | 5 / 35 | 2824 |
| 6 | 3 | 55.7 | 63.2 | 2 / 35 | 2906 |
| 7 | 4 | 53.2 | 56.8 | 1 / 35 | 2855 |
| 8 | 4 | 56.1 | 63.2 | 5 / 35 | 2824 |
| 9 | 3 | 57.6 | 66.7 | 6 / 35 | 2985 |
| 10 | 4 | 52.6 | 55.6 | 4 / 35 | 2834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 30 | 40% |
| az.Ololobot 0.2.4 | 30 | 3% |
| catcat20.Lambda 0.024 | 26 | 42% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 57% |
| apollokidd.ApolloKidd 0.9 | 4 | 75% |
| gimp.GimpBot 0.1 | 4 | 75% |
| winamp32.micro.MicroMacro 1.0 | 3 | 67% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 113 | 36% | 121 |
| az.Ololobot 0.2.4 | 49 | 16% | 51 |
| catcat20.Lambda 0.024 | 40 | 13% | 51 |
| apollokidd.ApolloKidd 0.9 | 31 | 10% | 35 |
| stelo.SoRobotNanoMelee 1.2 | 31 | 10% | 34 |
| winamp32.micro.MicroMacro 1.0 | 19 | 6% | 22 |
| gimp.GimpBot 0.1 | 16 | 5% | 21 |
| dcs.Eater_of_Worlds 1.1.3-A | 8 | 3% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 2% | 6 |

## Melee bench: F41

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.0 | 96 / 350 | 3.61 | 13.7% | 30621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.7% | 141 |
| hadur117.nano.SanaroHC 0.2 | 2.8 | 13.7% | 96 |
| ary.Swarm 1.1 | 3.0 | 13.1% | 32 |
| lessonz.robocode.Oz 0.5.0 | 3.6 | 12.9% | 43 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.9% | 25 |
| shrub.Silver v048 | 6.0 | 9.4% | 9 |
| zyx.nano.Ant 1.1 | 6.9 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.4 | 6.1% | 2 |
| stelo.Mirror 1.1 | 8.6 | 5.7% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 69.2 | 9 / 35 | 2959 |
| 2 | 2 | 60.1 | 69.8 | 10 / 35 | 2806 |
| 3 | 2 | 62.3 | 73.0 | 9 / 35 | 3475 |
| 4 | 3 | 60.7 | 70.8 | 6 / 35 | 2970 |
| 5 | 2 | 62.2 | 74.6 | 11 / 35 | 3184 |
| 6 | 2 | 63.7 | 79.4 | 14 / 35 | 3011 |
| 7 | 4 | 59.0 | 64.8 | 7 / 35 | 3064 |
| 8 | 4 | 58.6 | 65.1 | 8 / 35 | 2991 |
| 9 | 2 | 63.1 | 76.8 | 13 / 35 | 3392 |
| 10 | 4 | 58.7 | 66.0 | 9 / 35 | 2769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 75 | 44% |
| simonton.nano.MeleeSeed 1.8 | 23 | 83% |
| lessonz.robocode.Oz 0.5.0 | 22 | 73% |
| ary.Swarm 1.1 | 21 | 95% |
| shrub.Silver v048 | 7 | 43% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| zyx.nano.Ant 1.1 | 2 | 50% |

Hadur died in 255 of 350 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 81 | 32% | 114 |
| ary.Swarm 1.1 | 53 | 21% | 71 |
| lessonz.robocode.Oz 0.5.0 | 32 | 13% | 43 |
| simonton.nano.MeleeSeed 1.8 | 31 | 12% | 48 |
| shrub.Silver v048 | 24 | 9% | 26 |
| zyx.nano.Ant 1.1 | 20 | 8% | 21 |
| jsal.Jsalbot 1.0 | 6 | 2% | 14 |
| stelo.Mirror 1.1 | 6 | 2% | 11 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 73.4 | 73 / 350 | 3.39 | 14.1% | 36042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.3% | 162 |
| maribo.mini.MiniQuester 0.1 | 2.9 | 14.1% | 35 |
| hadur117.nano.SanaroHC 0.2 | 3.0 | 14.1% | 73 |
| ara.Shera 0.88 | 3.1 | 14.3% | 67 |
| amz.NanoClone 1.41 | 5.1 | 9.3% | 1 |
| maribo.IotaCT 1.1 | 6.5 | 7.5% | 2 |
| dsw.StaticD 1.0 | 6.6 | 7.6% | 9 |
| stelo.MirrorMicro 1.0 | 8.4 | 5.6% | 1 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 78.4 | 7 / 35 | 3813 |
| 2 | 2 | 61.4 | 71.4 | 9 / 35 | 3658 |
| 3 | 3 | 62.6 | 73.7 | 9 / 35 | 3804 |
| 4 | 4 | 61.1 | 72.1 | 9 / 35 | 3348 |
| 5 | 4 | 61.6 | 75.6 | 3 / 35 | 3596 |
| 6 | 2 | 61.2 | 72.1 | 6 / 35 | 3672 |
| 7 | 3 | 62.6 | 76.8 | 9 / 35 | 3624 |
| 8 | 3 | 60.4 | 69.8 | 7 / 35 | 3388 |
| 9 | 3 | 61.4 | 73.7 | 7 / 35 | 3702 |
| 10 | 4 | 60.4 | 70.5 | 7 / 35 | 3437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 90 | 41% |
| ara.Shera 0.88 | 43 | 49% |
| maribo.mini.MiniQuester 0.1 | 20 | 70% |
| dsw.StaticD 1.0 | 1 | 0% |
| amz.NanoClone 1.41 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 0% |

Hadur died in 277 of 350 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 107 | 39% | 144 |
| ara.Shera 0.88 | 81 | 29% | 102 |
| maribo.mini.MiniQuester 0.1 | 42 | 15% | 56 |
| amz.NanoClone 1.41 | 21 | 8% | 22 |
| dsw.StaticD 1.0 | 11 | 4% | 11 |
| maribo.IotaCT 1.1 | 8 | 3% | 8 |
| stelo.MirrorMicro 1.0 | 3 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 0% | 1 |

## Melee bench: F43

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 60.5 | 20 / 350 | 4.55 | 11.2% | 27032 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 272 |
| brainfade.melee.Dusk 0.44 | 2.6 | 13.0% | 26 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.2% | 14 |
| wcsv.melee.EngineerMelee 0.1 | 4.1 | 11.3% | 10 |
| hadur117.nano.SanaroHC 0.2 | 4.5 | 11.2% | 20 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.1% | 6 |
| jab.DiamondStealer 5 | 7.3 | 7.8% | 1 |
| mz.NanoGod 2.02 | 7.7 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.5 | 57.8 | 3 / 35 | 2607 |
| 2 | 4 | 57.8 | 61.6 | 1 / 35 | 2773 |
| 3 | 5 | 56.6 | 59.7 | 1 / 35 | 2635 |
| 4 | 4 | 57.2 | 58.4 | 1 / 35 | 2977 |
| 5 | 3 | 59.4 | 66.0 | 3 / 35 | 2745 |
| 6 | 5 | 58.0 | 61.9 | 1 / 35 | 2786 |
| 7 | 5 | 55.9 | 56.2 | 0 / 35 | 2757 |
| 8 | 6 | 55.4 | 56.5 | 3 / 35 | 2388 |
| 9 | 6 | 56.5 | 58.1 | 3 / 35 | 2472 |
| 10 | 2 | 60.8 | 69.2 | 4 / 35 | 2892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 72 | 13% |
| brainfade.melee.Dusk 0.44 | 9 | 56% |
| dummy.micro.Sparrow 2.5 | 7 | 29% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| cvt.Firsty 1.0 | 1 | 0% |
| jab.DiamondStealer 5 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 330 of 350 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 142 | 43% | 149 |
| dummy.micro.Sparrow 2.5 | 47 | 14% | 51 |
| wcsv.melee.EngineerMelee 0.1 | 47 | 14% | 50 |
| brainfade.melee.Dusk 0.44 | 43 | 13% | 49 |
| Krabb.akim2.Akim2 1.1b | 21 | 6% | 21 |
| mz.NanoGod 2.02 | 14 | 4% | 14 |
| jab.DiamondStealer 5 | 11 | 3% | 11 |
| cvt.Firsty 1.0 | 5 | 2% | 5 |

## Melee bench: F44

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 72.7 | 82 / 350 | 3.46 | 14.3% | 35483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.5 | 16.8% | 128 |
| tzu.TheArtOfWar 1.2 | 1.7 | 16.3% | 106 |
| hadur117.nano.SanaroHC 0.2 | 2.8 | 14.3% | 82 |
| wompi.Quokka 1.6 | 4.3 | 10.5% | 9 |
| jwirde.Gort 2.0 | 4.9 | 10.4% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 8.7% | 4 |
| disan.Chair 2.2.0 | 7.1 | 7.2% | 6 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.7% | 2 |
| sample.Crazy 1.0 | 9.3 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 68.9 | 11 / 35 | 3650 |
| 2 | 3 | 63.9 | 78.4 | 9 / 35 | 3555 |
| 3 | 3 | 57.9 | 61.0 | 7 / 35 | 3360 |
| 4 | 1 | 63.8 | 81.3 | 11 / 35 | 3422 |
| 5 | 3 | 61.7 | 73.3 | 6 / 35 | 3478 |
| 6 | 3 | 63.6 | 77.1 | 9 / 35 | 3712 |
| 7 | 3 | 61.5 | 71.4 | 6 / 35 | 3595 |
| 8 | 3 | 61.9 | 71.4 | 8 / 35 | 3564 |
| 9 | 3 | 60.8 | 70.2 | 7 / 35 | 3593 |
| 10 | 3 | 62.3 | 74.0 | 8 / 35 | 3554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 73 | 58% |
| tzu.TheArtOfWar 1.2 | 65 | 25% |
| jwirde.Gort 2.0 | 18 | 83% |
| wompi.Quokka 1.6 | 5 | 80% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| disan.Chair 2.2.0 | 1 | 0% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 268 of 350 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 102 | 38% | 118 |
| stelo.Liblix 0.3.1 | 91 | 34% | 135 |
| wompi.Quokka 1.6 | 24 | 9% | 27 |
| jwirde.Gort 2.0 | 17 | 6% | 33 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 16 | 6% | 17 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 9 |
| disan.Chair 2.2.0 | 6 | 2% | 7 |
| amk.jointstrike.JointStrike 0.2 | 3 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 72.5 | 65 / 350 | 3.48 | 14.6% | 36787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHC 0.2 | 1.4 | 14.6% | 65 |
| jje.BagPuss 1.2 | 2.7 | 13.1% | 27 |
| eem.IWillFireNoBullet v2.8 | 2.8 | 12.1% | 173 |
| sul.Lunar 1.1 | 4.2 | 11.2% | 33 |
| myl.nano.Graviton 1.10 | 4.7 | 10.7% | 15 |
| hvilela.HVilela 0.9 | 6.2 | 9.1% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.1 | 8.6% | 12 |
| fm.claire 1.7 | 7.2 | 8.4% | 2 |
| wit.Deep7 2.0 | 9.1 | 6.7% | 20 |
| abud.ThirdRobo 1.0 | 9.6 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 66.7 | 6 / 35 | 3265 |
| 2 | 2 | 60.2 | 68.6 | 5 / 35 | 3628 |
| 3 | 1 | 67.4 | 85.7 | 16 / 35 | 3653 |
| 4 | 1 | 60.0 | 69.2 | 7 / 35 | 3610 |
| 5 | 1 | 61.6 | 74.6 | 4 / 35 | 3747 |
| 6 | 2 | 59.5 | 68.6 | 5 / 35 | 3616 |
| 7 | 1 | 62.3 | 75.2 | 4 / 35 | 3992 |
| 8 | 2 | 59.8 | 67.3 | 7 / 35 | 3612 |
| 9 | 1 | 62.4 | 74.9 | 7 / 35 | 4081 |
| 10 | 1 | 61.2 | 74.0 | 4 / 35 | 3583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 79 | 32% |
| jje.BagPuss 1.2 | 25 | 40% |
| sul.Lunar 1.1 | 24 | 33% |
| myl.nano.Graviton 1.10 | 15 | 53% |
| wit.Deep7 2.0 | 7 | 43% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 100% |
| abud.ThirdRobo 1.0 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 1270. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 64 | 22% | 103 |
| eem.IWillFireNoBullet v2.8 | 59 | 21% | 0 |
| sul.Lunar 1.1 | 41 | 14% | 67 |
| myl.nano.Graviton 1.10 | 41 | 14% | 65 |
| hvilela.HVilela 0.9 | 22 | 8% | 26 |
| wit.Deep7 2.0 | 20 | 7% | 26 |
| fm.claire 1.7 | 19 | 7% | 25 |
| pez.mini.ChironexFleckeri 0.5 | 18 | 6% | 28 |
| abud.ThirdRobo 1.0 | 3 | 1% | 9 |

## Melee bench: F46

hadur117.nano.SanaroHC 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 69.7 | 48 / 350 | 3.73 | 12.6% | 27498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.9% | 125 |
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.8% | 156 |
| hadur117.nano.SanaroHC 0.2 | 3.0 | 12.6% | 48 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 7 |
| cx.Princess 1.0 | 5.0 | 10.1% | 11 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.2% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.1% | 1 |
| kurios.DOSexe .9a | 8.7 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 71.4 | 6 / 35 | 2878 |
| 2 | 3 | 59.6 | 69.5 | 8 / 35 | 3046 |
| 3 | 3 | 58.2 | 67.9 | 4 / 35 | 2584 |
| 4 | 3 | 59.6 | 70.8 | 4 / 35 | 2923 |
| 5 | 3 | 57.5 | 64.8 | 5 / 35 | 2682 |
| 6 | 3 | 56.6 | 63.5 | 3 / 35 | 2569 |
| 7 | 3 | 60.7 | 73.3 | 4 / 35 | 3013 |
| 8 | 3 | 58.7 | 69.5 | 2 / 35 | 2639 |
| 9 | 3 | 59.8 | 73.3 | 5 / 35 | 2559 |
| 10 | 3 | 60.2 | 72.4 | 7 / 35 | 2605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 82 | 43% |
| rsalesc.melee.Medina 0.4.5 | 48 | 17% |
| cx.Princess 1.0 | 4 | 75% |
| sadoner.killer 0.2 | 2 | 50% |
| mz.MicroSheep 1.0 | 2 | 50% |

Hadur died in 302 of 350 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 124 | 41% | 161 |
| rsalesc.melee.Medina 0.4.5 | 96 | 32% | 106 |
| mz.MicroSheep 1.0 | 26 | 9% | 27 |
| cx.Princess 1.0 | 20 | 7% | 21 |
| sadoner.killer 0.2 | 20 | 7% | 19 |
| arthord.NanoSatanMelee Beta | 8 | 3% | 8 |
| kurios.DOSexe .9a | 4 | 1% | 4 |
| jeremyreeder.collective.Prophet 5 | 3 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

