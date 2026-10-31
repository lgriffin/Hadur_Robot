# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 77.2 | 57 / 350 | 3.05 | 14.2% | 35484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 225 |
| hadur117.nano.SanaroHD 0.2 | 2.0 | 14.2% | 57 |
| sgp.JollyNinja 3.53 | 3.4 | 12.2% | 35 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.4 | 11.1% | 11 |
| mz.MicroGodMelee 1 | 4.5 | 11.2% | 9 |
| lorneswork.Predator 1.0 | 5.7 | 9.9% | 10 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.5% | 3 |
| mym.EdgeStalker 1.0 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 68.3 | 6 / 35 | 3287 |
| 2 | 2 | 61.7 | 77.1 | 7 / 35 | 3322 |
| 3 | 2 | 61.5 | 75.9 | 4 / 35 | 3579 |
| 4 | 2 | 61.9 | 76.2 | 6 / 35 | 3460 |
| 5 | 2 | 63.5 | 85.1 | 5 / 35 | 3091 |
| 6 | 2 | 61.0 | 72.4 | 3 / 35 | 3703 |
| 7 | 2 | 61.2 | 74.9 | 3 / 35 | 3808 |
| 8 | 2 | 62.8 | 78.7 | 6 / 35 | 3646 |
| 9 | 2 | 64.6 | 84.1 | 9 / 35 | 3756 |
| 10 | 2 | 63.4 | 79.4 | 8 / 35 | 3832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 148 | 13% |
| mz.MicroGodMelee 1 | 23 | 91% |
| sgp.JollyNinja 3.53 | 23 | 52% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 50% |
| lorneswork.Predator 1.0 | 5 | 20% |
| skm.butterfly 1.0 | 3 | 0% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 1025. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 158 | 54% | 179 |
| sgp.JollyNinja 3.53 | 38 | 13% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 32 | 11% | 33 |
| lorneswork.Predator 1.0 | 31 | 11% | 33 |
| mz.MicroGodMelee 1 | 14 | 5% | 36 |
| adt.Ar2 1.0 | 12 | 4% | 13 |
| skm.butterfly 1.0 | 4 | 1% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 1% | 4 |

## Melee bench: F02

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 70.6 | 80 / 350 | 3.65 | 14.0% | 35470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 14.8% | 82 |
| hadur117.nano.SanaroHD 0.2 | 2.1 | 14.0% | 80 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.0% | 94 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.0% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.4% | 29 |
| sch.Simone 0.3d | 6.2 | 8.9% | 25 |
| Noran.BitchingElk 0.054 | 7.1 | 8.2% | 24 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.7% | 4 |
| stelo.PatternRobot 1.0 | 8.8 | 6.9% | 8 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 61.3 | 6 / 35 | 3542 |
| 2 | 1 | 61.9 | 73.3 | 8 / 35 | 3919 |
| 3 | 2 | 61.4 | 74.0 | 12 / 35 | 3361 |
| 4 | 1 | 61.7 | 73.3 | 9 / 35 | 3763 |
| 5 | 2 | 62.1 | 74.0 | 8 / 35 | 3864 |
| 6 | 2 | 62.5 | 76.2 | 8 / 35 | 3769 |
| 7 | 1 | 62.1 | 78.1 | 9 / 35 | 3275 |
| 8 | 4 | 57.6 | 62.2 | 8 / 35 | 3107 |
| 9 | 3 | 58.4 | 63.5 | 8 / 35 | 3393 |
| 10 | 2 | 59.6 | 69.8 | 4 / 35 | 3477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 54 | 35% |
| pulsar.PulsarMax 0.8.9 | 50 | 42% |
| Noran.BitchingElk 0.054 | 18 | 44% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 75% |
| sch.Simone 0.3d | 11 | 36% |
| stelo.PatternRobot 1.0 | 9 | 67% |
| fnc.bandit.Bandit 5.2.0 | 8 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |

Hadur died in 273 of 350 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 76 | 28% | 90 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 66 | 24% | 87 |
| stelo.PatternRobot 1.0 | 30 | 11% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 24 | 9% | 30 |
| sch.Simone 0.3d | 21 | 8% | 27 |
| Noran.BitchingElk 0.054 | 20 | 7% | 26 |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 6% | 31 |
| fnc.bandit.Bandit 5.2.0 | 11 | 4% | 14 |
| fullsail.SweetTea 1.1 | 7 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 79.2 | 82 / 350 | 2.87 | 14.7% | 37130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.8 | 15.1% | 96 |
| hadur117.nano.SanaroHD 0.2 | 2.0 | 14.7% | 82 |
| kawigi.nano.Lib 1.0 | 2.4 | 14.7% | 86 |
| vuen.Cake 2.51 | 3.8 | 13.5% | 69 |
| urdos.URDOS 1.3 | 5.0 | 10.5% | 13 |
| adt.Ar1 2.1 | 6.5 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.9% | 1 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.5% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 5.9% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 80.6 | 7 / 35 | 3746 |
| 2 | 1 | 63.5 | 82.9 | 12 / 35 | 3542 |
| 3 | 3 | 62.5 | 78.4 | 10 / 35 | 3717 |
| 4 | 3 | 61.1 | 76.8 | 5 / 35 | 3367 |
| 5 | 2 | 62.1 | 77.5 | 6 / 35 | 3965 |
| 6 | 1 | 63.5 | 82.2 | 10 / 35 | 3845 |
| 7 | 3 | 61.8 | 77.8 | 7 / 35 | 3691 |
| 8 | 1 | 62.0 | 79.7 | 5 / 35 | 3786 |
| 9 | 2 | 62.1 | 78.4 | 10 / 35 | 3723 |
| 10 | 2 | 62.4 | 77.8 | 10 / 35 | 3748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 69 | 52% |
| radnor.DoctorBob 1.42 | 61 | 39% |
| kawigi.nano.Lib 1.0 | 43 | 16% |
| urdos.URDOS 1.3 | 17 | 53% |
| oa.weak.FlyMk1 0.1 | 4 | 50% |
| adt.Ar1 2.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |

Hadur died in 269 of 350 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 90 | 33% | 112 |
| kawigi.nano.Lib 1.0 | 78 | 29% | 85 |
| vuen.Cake 2.51 | 41 | 15% | 77 |
| urdos.URDOS 1.3 | 39 | 14% | 46 |
| adt.Ar1 2.1 | 7 | 3% | 9 |
| oa.weak.FlyMk1 0.1 | 5 | 2% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 1% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 1% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 74.4 | 13 / 350 | 3.30 | 13.8% | 38828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 314 |
| hadur117.nano.SanaroHD 0.2 | 2.3 | 13.8% | 13 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.4% | 18 |
| TNT.TNT 0.99.1 | 4.3 | 10.6% | 2 |
| josago.Jorgito 0.16 | 4.7 | 9.8% | 1 |
| tj.zombie1n 1.0.1 | 6.3 | 7.5% | 0 |
| css.Delitioner 0.11 | 6.7 | 7.2% | 1 |
| rampancy.Durandal 2.1d | 8.1 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 76.2 | 2 / 35 | 3823 |
| 2 | 3 | 61.5 | 71.4 | 2 / 35 | 3796 |
| 3 | 2 | 63.8 | 77.5 | 0 / 35 | 4373 |
| 4 | 2 | 61.0 | 72.7 | 0 / 35 | 3562 |
| 5 | 3 | 61.1 | 72.7 | 2 / 35 | 3566 |
| 6 | 2 | 65.0 | 80.6 | 3 / 35 | 4519 |
| 7 | 2 | 62.5 | 74.3 | 0 / 35 | 4133 |
| 8 | 2 | 62.3 | 75.6 | 2 / 35 | 3649 |
| 9 | 3 | 58.8 | 64.1 | 0 / 35 | 3659 |
| 10 | 2 | 63.5 | 79.0 | 2 / 35 | 3748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 172 | 4% |
| apc.LeeroyJenkins2 1.0 | 8 | 38% |
| josago.Jorgito 0.16 | 3 | 67% |
| TNT.TNT 0.99.1 | 3 | 33% |

Hadur died in 337 of 350 rounds, at a mean tick of 1231. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 231 | 69% | 237 |
| apc.LeeroyJenkins2 1.0 | 36 | 11% | 40 |
| josago.Jorgito 0.16 | 30 | 9% | 32 |
| TNT.TNT 0.99.1 | 20 | 6% | 21 |
| css.Delitioner 0.11 | 8 | 2% | 8 |
| rampancy.Durandal 2.1d | 6 | 2% | 6 |
| tj.zombie1n 1.0.1 | 5 | 1% | 5 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 71.4 | 89 / 350 | 3.57 | 13.6% | 30807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.4 | 15.8% | 78 |
| origin.SleepSiphon 1.7b | 1.8 | 14.8% | 107 |
| hadur117.nano.SanaroHD 0.2 | 3.1 | 13.6% | 89 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.4% | 34 |
| mld.Wisdom 1.0 | 4.7 | 11.2% | 15 |
| gg.Wolverine 2.0 | 6.2 | 8.6% | 12 |
| spinnercat.Omen 1.0 | 7.8 | 7.2% | 4 |
| DBall.NUKE 0.1 | 7.9 | 7.1% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.1 | 6.4% | 6 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.9 | 71.1 | 7 / 35 | 3078 |
| 2 | 3 | 58.4 | 65.1 | 9 / 35 | 2980 |
| 3 | 3 | 60.5 | 72.4 | 10 / 35 | 2636 |
| 4 | 4 | 59.5 | 66.7 | 7 / 35 | 3408 |
| 5 | 2 | 60.6 | 73.0 | 10 / 35 | 2975 |
| 6 | 4 | 59.3 | 66.7 | 8 / 35 | 3027 |
| 7 | 3 | 61.2 | 72.4 | 9 / 35 | 3290 |
| 8 | 3 | 59.3 | 71.4 | 6 / 35 | 2654 |
| 9 | 3 | 61.2 | 73.0 | 10 / 35 | 3126 |
| 10 | 2 | 64.9 | 82.5 | 13 / 35 | 3633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 59 | 71% |
| origin.SleepSiphon 1.7b | 45 | 42% |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 65% |
| gg.Wolverine 2.0 | 9 | 67% |
| DBall.NUKE 0.1 | 5 | 40% |
| mld.Wisdom 1.0 | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| spinnercat.Omen 1.0 | 1 | 0% |

Hadur died in 265 of 350 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 74 | 28% | 103 |
| origin.SleepSiphon 1.7b | 60 | 23% | 85 |
| mld.Wisdom 1.0 | 48 | 18% | 50 |
| pe.minimelee.SandboxMiniMelee 1.1 | 42 | 16% | 60 |
| spinnercat.Omen 1.0 | 20 | 8% | 23 |
| gg.Wolverine 2.0 | 12 | 5% | 15 |
| DBall.NUKE 0.1 | 6 | 2% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 1% | 5 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.4 | 104 / 350 | 2.41 | 16.4% | 42548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.5 | 17.9% | 97 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.1% | 72 |
| hadur117.nano.SanaroHD 0.2 | 2.7 | 16.4% | 104 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.8% | 23 |
| franzor.Lizt 1.3.1 | 4.7 | 11.8% | 55 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.0 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 87.3 | 10 / 35 | 4103 |
| 2 | 2 | 67.6 | 86.3 | 15 / 35 | 4109 |
| 3 | 3 | 66.8 | 84.8 | 10 / 35 | 4122 |
| 4 | 3 | 66.8 | 83.2 | 11 / 35 | 4298 |
| 5 | 3 | 67.0 | 83.5 | 14 / 35 | 4288 |
| 6 | 3 | 65.9 | 82.5 | 9 / 35 | 3969 |
| 7 | 2 | 67.9 | 87.3 | 12 / 35 | 4323 |
| 8 | 3 | 67.0 | 83.5 | 7 / 35 | 4706 |
| 9 | 3 | 66.1 | 81.3 | 7 / 35 | 4515 |
| 10 | 3 | 66.3 | 84.1 | 9 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 121 | 52% |
| rsalesc.melee.Monk 0.3.6c | 43 | 16% |
| oog.melee.CapuletDroid 1.1 | 34 | 62% |
| franzor.Lizt 1.3.1 | 34 | 29% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 246 of 350 rounds, at a mean tick of 1526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 109 | 44% | 189 |
| rsalesc.melee.Monk 0.3.6c | 68 | 28% | 86 |
| oog.melee.CapuletDroid 1.1 | 34 | 14% | 60 |
| franzor.Lizt 1.3.1 | 28 | 11% | 5 |
| exauge.GateKeeper 1.1.121g | 7 | 3% | 8 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 10 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 76.4 | 124 / 350 | 3.13 | 14.8% | 32035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHD 0.2 | 1.5 | 14.8% | 124 |
| tm.Yuugao 1.0 | 2.1 | 13.7% | 71 |
| shrub.Vapour v159 | 2.6 | 13.0% | 68 |
| Krabb.sliNk.Garm 0.9u | 4.1 | 10.8% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.1% | 30 |
| m3thos.Eva00 1.1 | 6.1 | 9.2% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.5% | 21 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.7% | 2 |
| SHAM.WOW 1.4 | 8.9 | 6.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.1 | 6.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 79.0 | 11 / 35 | 3011 |
| 2 | 1 | 62.1 | 76.8 | 12 / 35 | 3449 |
| 3 | 1 | 63.9 | 79.7 | 14 / 35 | 3589 |
| 4 | 1 | 62.4 | 78.4 | 14 / 35 | 3347 |
| 5 | 1 | 61.6 | 75.2 | 15 / 35 | 3169 |
| 6 | 2 | 60.5 | 72.1 | 14 / 35 | 3116 |
| 7 | 3 | 61.0 | 77.1 | 10 / 35 | 2739 |
| 8 | 1 | 61.7 | 76.8 | 11 / 35 | 3318 |
| 9 | 2 | 60.1 | 71.4 | 9 / 35 | 3283 |
| 10 | 1 | 61.8 | 77.1 | 14 / 35 | 3014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 68 | 71% |
| shrub.Vapour v159 | 41 | 34% |
| Krabb.sliNk.Garm 0.9u | 31 | 87% |
| com.spp.robocode.MostlyHarmless 010 | 22 | 64% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 58% |
| m3thos.Eva00 1.1 | 10 | 60% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 227 of 350 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 61 | 27% | 78 |
| tm.Yuugao 1.0 | 52 | 23% | 105 |
| Krabb.sliNk.Garm 0.9u | 26 | 11% | 38 |
| com.spp.robocode.MostlyHarmless 010 | 25 | 11% | 41 |
| jwst.DAD.DarkAndDarker 1.1 | 18 | 8% | 25 |
| m3thos.Eva00 1.1 | 14 | 6% | 23 |
| zyx.nano.BacillusComma 1.0 | 14 | 6% | 18 |
| qualidafial.MajorDick 1.0.1 | 9 | 4% | 10 |
| SHAM.WOW 1.4 | 8 | 4% | 11 |

## Melee bench: F09

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 64.0 | 48 / 350 | 4.24 | 12.2% | 27747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.8% | 202 |
| kc.micro.Figment 1.0 | 2.0 | 15.1% | 57 |
| hadur117.nano.SanaroHD 0.2 | 3.4 | 12.2% | 48 |
| yagami.Tidus 0.11 | 4.2 | 10.7% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.5% | 24 |
| mc2.enemy.Original 0.9 | 5.7 | 9.2% | 14 |
| dft.Calliope 5.6 | 6.9 | 8.1% | 3 |
| step.nanoPri 1.0 | 8.5 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.6 | 61.9 | 4 / 35 | 2642 |
| 2 | 3 | 56.9 | 61.9 | 5 / 35 | 2665 |
| 3 | 5 | 53.7 | 55.6 | 2 / 35 | 2505 |
| 4 | 3 | 57.8 | 64.4 | 4 / 35 | 2679 |
| 5 | 3 | 60.7 | 72.4 | 3 / 35 | 3044 |
| 6 | 3 | 56.9 | 61.9 | 6 / 35 | 2735 |
| 7 | 3 | 56.9 | 62.2 | 4 / 35 | 2638 |
| 8 | 3 | 57.3 | 62.5 | 6 / 35 | 3012 |
| 9 | 3 | 61.8 | 76.2 | 7 / 35 | 2984 |
| 10 | 5 | 57.2 | 61.3 | 7 / 35 | 2843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 69 | 22% |
| kc.micro.Figment 1.0 | 36 | 50% |
| mc2.enemy.Original 0.9 | 9 | 78% |
| pedersen.Grishnakh 1.0 | 7 | 43% |
| dft.Calliope 5.6 | 2 | 100% |
| rdm.Dueler 0.4x | 2 | 50% |
| yagami.Tidus 0.11 | 2 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 118 | 39% | 133 |
| kc.micro.Figment 1.0 | 72 | 24% | 91 |
| yagami.Tidus 0.11 | 33 | 11% | 35 |
| pedersen.Grishnakh 1.0 | 27 | 9% | 30 |
| mc2.enemy.Original 0.9 | 15 | 5% | 22 |
| dft.Calliope 5.6 | 15 | 5% | 17 |
| robar.nano.Assertive_Melee 0.2 | 11 | 4% | 11 |
| rdm.Dueler 0.4x | 7 | 2% | 6 |
| step.nanoPri 1.0 | 4 | 1% | 5 |

## Melee bench: F10

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 83.6 | 136 / 350 | 2.47 | 15.9% | 37141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHD 0.2 | 1.5 | 15.9% | 136 |
| DTF.Kludgy 1.2b | 2.0 | 15.2% | 91 |
| ne.Chimera 1.2 | 2.9 | 13.4% | 42 |
| ejb.Polaris 1.0.1 | 4.0 | 12.6% | 28 |
| tvv.micro.Antares 1.1.1 | 4.9 | 11.0% | 32 |
| vStar.RAFzilla 2.15 | 5.7 | 10.1% | 11 |
| sam.Samspin 1.0 | 7.7 | 6.2% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.9 | 5.9% | 1 |
| kurios.DOSexe .9b | 8.6 | 5.4% | 6 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 82.5 | 13 / 35 | 3733 |
| 2 | 1 | 64.8 | 82.2 | 15 / 35 | 4035 |
| 3 | 1 | 65.5 | 86.0 | 13 / 35 | 3972 |
| 4 | 1 | 65.1 | 85.4 | 18 / 35 | 3534 |
| 5 | 3 | 62.4 | 76.5 | 9 / 35 | 3642 |
| 6 | 1 | 65.3 | 87.3 | 14 / 35 | 3406 |
| 7 | 1 | 64.3 | 83.8 | 15 / 35 | 3687 |
| 8 | 2 | 65.4 | 86.7 | 12 / 35 | 3708 |
| 9 | 2 | 64.9 | 83.2 | 15 / 35 | 3848 |
| 10 | 2 | 63.6 | 82.5 | 12 / 35 | 3576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 82 | 43% |
| ejb.Polaris 1.0.1 | 60 | 87% |
| tvv.micro.Antares 1.1.1 | 36 | 36% |
| ne.Chimera 1.2 | 31 | 48% |
| vStar.RAFzilla 2.15 | 18 | 72% |
| kurios.DOSexe .9b | 8 | 38% |
| donjezza.Muncho 1.0 | 6 | 67% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 214 of 350 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 80 | 37% | 110 |
| ne.Chimera 1.2 | 54 | 25% | 74 |
| tvv.micro.Antares 1.1.1 | 33 | 15% | 38 |
| ejb.Polaris 1.0.1 | 18 | 8% | 74 |
| kurios.DOSexe .9b | 8 | 4% | 11 |
| vStar.RAFzilla 2.15 | 6 | 3% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 3% | 7 |
| sam.Samspin 1.0 | 6 | 3% | 7 |
| donjezza.Muncho 1.0 | 3 | 1% | 7 |

## Melee bench: F11

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 67.5 | 85 / 350 | 3.93 | 13.0% | 29012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.1% | 135 |
| cx.mini.Nimrod 0.55 | 2.4 | 13.6% | 45 |
| hadur117.nano.SanaroHD 0.2 | 2.6 | 13.0% | 85 |
| djc.DynaBot 0.1.1 | 4.3 | 10.9% | 16 |
| br2.MobyDickBot 1.6 | 5.4 | 9.8% | 23 |
| rdt199.Warlord 0.73 | 5.9 | 9.4% | 24 |
| uji.YellohFellah 1.0 | 6.5 | 8.6% | 18 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.5% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 70.2 | 10 / 35 | 2882 |
| 2 | 2 | 59.5 | 68.3 | 10 / 35 | 3025 |
| 3 | 3 | 56.1 | 61.3 | 6 / 35 | 2634 |
| 4 | 3 | 58.2 | 65.7 | 9 / 35 | 2785 |
| 5 | 2 | 60.8 | 73.3 | 9 / 35 | 2997 |
| 6 | 2 | 58.5 | 67.9 | 7 / 35 | 2827 |
| 7 | 3 | 57.4 | 62.5 | 7 / 35 | 2961 |
| 8 | 3 | 59.5 | 68.6 | 9 / 35 | 3018 |
| 9 | 3 | 58.1 | 65.7 | 8 / 35 | 2773 |
| 10 | 2 | 60.1 | 71.1 | 10 / 35 | 3110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 55 | 58% |
| djc.DynaBot 0.1.1 | 22 | 91% |
| cx.mini.Nimrod 0.55 | 16 | 44% |
| br2.MobyDickBot 1.6 | 15 | 73% |
| rdt199.Warlord 0.73 | 13 | 100% |
| uji.YellohFellah 1.0 | 5 | 40% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 265 of 350 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 111 | 42% | 138 |
| cx.mini.Nimrod 0.55 | 53 | 20% | 60 |
| rdt199.Warlord 0.73 | 26 | 10% | 39 |
| djc.DynaBot 0.1.1 | 21 | 8% | 38 |
| KiraNL.Chupacabra 0.4 | 17 | 6% | 19 |
| br2.MobyDickBot 1.6 | 14 | 5% | 26 |
| uji.YellohFellah 1.0 | 14 | 5% | 20 |
| stelo.MirrorNano 1.3 | 6 | 2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 1% | 3 |

## Melee bench: F12

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 72.3 | 86 / 350 | 3.49 | 13.6% | 26701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.4% | 91 |
| bts.wiki.RipCurl 0.9b | 2.1 | 14.2% | 71 |
| hadur117.nano.SanaroHD 0.2 | 2.8 | 13.6% | 86 |
| darkcanuck.Leon 1.01 | 3.3 | 13.0% | 59 |
| brainfade.melee.Genghis 0.36 | 5.1 | 10.5% | 22 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 5 |
| jp.Perpy 16.0 | 7.1 | 7.6% | 4 |
| cs.sheldor.Talon 1.1 | 7.8 | 7.0% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.8% | 10 |
| stuff.Vlad 0.1 | 9.6 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 75.6 | 9 / 35 | 2905 |
| 2 | 2 | 61.2 | 75.6 | 10 / 35 | 2857 |
| 3 | 4 | 57.2 | 66.7 | 6 / 35 | 2376 |
| 4 | 3 | 59.8 | 72.1 | 6 / 35 | 2990 |
| 5 | 1 | 62.3 | 77.5 | 14 / 35 | 2845 |
| 6 | 1 | 61.7 | 76.5 | 12 / 35 | 2735 |
| 7 | 4 | 59.2 | 70.2 | 8 / 35 | 2507 |
| 8 | 3 | 59.1 | 69.5 | 7 / 35 | 2737 |
| 9 | 4 | 60.0 | 73.0 | 9 / 35 | 2377 |
| 10 | 4 | 56.9 | 66.3 | 5 / 35 | 2372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 65 | 37% |
| darkcanuck.Leon 1.01 | 46 | 41% |
| bts.wiki.RipCurl 0.9b | 44 | 61% |
| brainfade.melee.Genghis 0.36 | 14 | 71% |
| jp.Perpy 16.0 | 4 | 75% |
| jaybot.bots.Oddball 4.0 | 4 | 0% |
| jrm.Test0 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |

Hadur died in 264 of 350 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 73 | 28% | 97 |
| bts.wiki.RipCurl 0.9b | 50 | 19% | 76 |
| darkcanuck.Leon 1.01 | 48 | 18% | 73 |
| brainfade.melee.Genghis 0.36 | 30 | 11% | 33 |
| jrm.Test0 1.0 | 22 | 8% | 23 |
| cs.sheldor.Talon 1.1 | 14 | 5% | 18 |
| jaybot.bots.Oddball 4.0 | 11 | 4% | 11 |
| jp.Perpy 16.0 | 10 | 4% | 11 |
| stuff.Vlad 0.1 | 6 | 2% | 8 |

## Melee bench: F13

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 72.8 | 53 / 350 | 3.45 | 13.0% | 28868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.9% | 88 |
| mn.Combat 3.25.0 | 1.5 | 17.0% | 146 |
| hadur117.nano.SanaroHD 0.2 | 3.5 | 13.0% | 53 |
| shinh.Entangled 0.3 | 3.8 | 12.4% | 37 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.9% | 22 |
| apc.Colossus2 0.17 | 6.1 | 8.1% | 1 |
| stelo.Wang 1.0 | 6.9 | 7.2% | 3 |
| ayk.WallHugger 1.0 | 8.4 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 78.4 | 7 / 35 | 2910 |
| 2 | 4 | 58.9 | 71.1 | 4 / 35 | 2863 |
| 3 | 4 | 59.6 | 73.0 | 5 / 35 | 2767 |
| 4 | 3 | 61.6 | 75.9 | 5 / 35 | 3161 |
| 5 | 3 | 58.7 | 71.4 | 4 / 35 | 2538 |
| 6 | 3 | 60.1 | 71.1 | 5 / 35 | 3227 |
| 7 | 4 | 59.6 | 70.8 | 5 / 35 | 2942 |
| 8 | 3 | 60.0 | 72.7 | 4 / 35 | 2862 |
| 9 | 5 | 57.3 | 63.2 | 7 / 35 | 2598 |
| 10 | 3 | 62.3 | 80.6 | 7 / 35 | 3000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 87 | 38% |
| ags.Glacier 0.2.11 | 50 | 14% |
| shinh.Entangled 0.3 | 18 | 39% |
| gh.micro.Gruweltje 0.7 | 8 | 63% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 85 | 29% | 118 |
| ags.Glacier 0.2.11 | 80 | 27% | 86 |
| shinh.Entangled 0.3 | 45 | 15% | 53 |
| gh.micro.Gruweltje 0.7 | 45 | 15% | 50 |
| stelo.Wang 1.0 | 21 | 7% | 22 |
| apc.Colossus2 0.17 | 11 | 4% | 11 |
| maribo.FollowFire 1 | 7 | 2% | 7 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |

## Melee bench: F14

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 79.2 | 112 / 350 | 2.87 | 14.9% | 32115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 18.1% | 134 |
| hadur117.nano.SanaroHD 0.2 | 2.0 | 14.9% | 112 |
| catcat20.shape.Theta 0.018 | 3.1 | 12.6% | 62 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.1 | 10.4% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 5.4 | 9.8% | 12 |
| Lo_Ian.Gandalf_V4 4.0 | 5.6 | 9.8% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 6.1 | 9.4% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.6% | 10 |
| pa.Improved 1.0 | 9.0 | 5.5% | 3 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 81.9 | 11 / 35 | 3297 |
| 2 | 2 | 62.9 | 76.5 | 13 / 35 | 3362 |
| 3 | 2 | 63.5 | 82.5 | 12 / 35 | 3136 |
| 4 | 2 | 61.9 | 76.8 | 9 / 35 | 3135 |
| 5 | 2 | 63.3 | 76.5 | 13 / 35 | 3476 |
| 6 | 2 | 64.8 | 86.0 | 11 / 35 | 3304 |
| 7 | 2 | 62.7 | 80.6 | 9 / 35 | 2981 |
| 8 | 2 | 61.4 | 73.7 | 10 / 35 | 3167 |
| 9 | 2 | 62.9 | 77.5 | 11 / 35 | 3129 |
| 10 | 2 | 63.4 | 80.3 | 13 / 35 | 3128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 112 | 55% |
| catcat20.shape.Theta 0.018 | 46 | 41% |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 63% |
| Lo_Ian.Gandalf_V4 4.0 | 10 | 60% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 70% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 50% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 238 of 350 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 98 | 41% | 164 |
| catcat20.shape.Theta 0.018 | 47 | 20% | 60 |
| dmh.robocode.robot.RedDwarf 0.4 | 27 | 11% | 30 |
| Lo_Ian.Gandalf_V4 4.0 | 21 | 9% | 29 |
| co.edu.usb.rc.LidisTron 1.0 | 19 | 8% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 12 | 5% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 3% | 14 |
| pa.Improved 1.0 | 6 | 3% | 11 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 66.9 | 60 / 350 | 3.98 | 13.1% | 34058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 15.1% | 71 |
| emp.Yngwie 1.11 | 2.7 | 13.7% | 104 |
| hadur117.nano.SanaroHD 0.2 | 3.2 | 13.1% | 60 |
| mld.DustBunny 3.8 | 3.3 | 13.2% | 33 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.0% | 25 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.7% | 53 |
| Grystrion.TrackerWO 1.0 | 7.4 | 7.0% | 1 |
| lambdaxy.TBot 0.1 | 8.1 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.6% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 52.9 | 57.8 | 3 / 35 | 2318 |
| 2 | 2 | 60.8 | 72.4 | 6 / 35 | 3431 |
| 3 | 4 | 58.6 | 64.8 | 6 / 35 | 3414 |
| 4 | 4 | 57.7 | 65.4 | 6 / 35 | 3046 |
| 5 | 4 | 59.0 | 63.5 | 7 / 35 | 3669 |
| 6 | 2 | 59.8 | 70.5 | 5 / 35 | 3470 |
| 7 | 1 | 63.6 | 76.8 | 11 / 35 | 3977 |
| 8 | 2 | 61.8 | 73.3 | 8 / 35 | 3758 |
| 9 | 4 | 57.7 | 61.6 | 1 / 35 | 3661 |
| 10 | 3 | 58.1 | 62.9 | 7 / 35 | 3314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 58% |
| kawigi.micro.Shiz 1.1 | 25 | 32% |
| mld.DustBunny 3.8 | 19 | 5% |
| cb.nano.Insomnia 1.0 | 19 | 68% |
| kawigi.robot.Girl 1.2 | 18 | 67% |
| divineomega.TrialBot 0.003 | 4 | 75% |

Hadur died in 291 of 350 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 66 | 23% | 76 |
| emp.Yngwie 1.11 | 60 | 21% | 88 |
| kawigi.micro.Shiz 1.1 | 58 | 20% | 73 |
| kawigi.robot.Girl 1.2 | 34 | 12% | 45 |
| cb.nano.Insomnia 1.0 | 34 | 12% | 28 |
| Grystrion.TrackerWO 1.0 | 13 | 4% | 13 |
| divineomega.TrialBot 0.003 | 12 | 4% | 14 |
| lambdaxy.TBot 0.1 | 12 | 4% | 12 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.9 | 66 / 350 | 3.80 | 13.5% | 34839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.1 | 17.6% | 144 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 14.9% | 19 |
| hadur117.nano.SanaroHD 0.2 | 2.9 | 13.5% | 66 |
| techdude.forest.FlamingForest 1.1 | 3.9 | 11.2% | 70 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.6% | 29 |
| bvh.fnr.Fenrir 0.36l | 5.9 | 9.1% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.7% | 6 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.7% | 13 |
| asd.Cthulhu 1.3 | 8.8 | 5.4% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 72.1 | 7 / 35 | 3544 |
| 2 | 3 | 59.5 | 67.6 | 6 / 35 | 3211 |
| 3 | 3 | 62.2 | 72.7 | 7 / 35 | 3924 |
| 4 | 3 | 59.7 | 66.3 | 9 / 35 | 3266 |
| 5 | 4 | 56.4 | 59.7 | 3 / 35 | 3198 |
| 6 | 3 | 60.6 | 69.2 | 9 / 35 | 3433 |
| 7 | 3 | 59.2 | 65.4 | 6 / 35 | 3517 |
| 8 | 2 | 62.8 | 74.3 | 5 / 35 | 4051 |
| 9 | 3 | 60.4 | 71.7 | 7 / 35 | 3455 |
| 10 | 3 | 60.5 | 70.2 | 7 / 35 | 3240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 77 | 35% |
| techdude.forest.FlamingForest 1.1 | 40 | 33% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 93% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| tvv.nano.Polaris 1.2 | 8 | 25% |
| divineomega.DivineBot 1.9.4.5 | 3 | 67% |
| stelo.IntrinsicVolatility 1.4 | 2 | 50% |

Hadur died in 284 of 350 rounds, at a mean tick of 1259. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 122 | 43% | 154 |
| techdude.forest.FlamingForest 1.1 | 47 | 17% | 63 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 41 | 14% | 48 |
| bvh.fnr.Fenrir 0.36l | 25 | 9% | 31 |
| tvv.nano.Polaris 1.2 | 19 | 7% | 18 |
| stelo.IntrinsicVolatility 1.4 | 13 | 5% | 16 |
| divineomega.DivineBot 1.9.4.5 | 10 | 4% | 13 |
| asd.Cthulhu 1.3 | 6 | 2% | 6 |
| repositorio.NanoStep 1.0 | 1 | 0% | 1 |

## Melee bench: F17

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 69.2 | 80 / 350 | 3.77 | 13.4% | 32455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.8 | 14.3% | 70 |
| hadur117.nano.SanaroHD 0.2 | 2.7 | 13.4% | 80 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.5% | 66 |
| cx.BlestPain 1.41 | 3.8 | 12.8% | 58 |
| nic.Nicator 2.4 | 4.3 | 12.5% | 44 |
| ahf.NanoAndrew .4 | 5.8 | 10.8% | 28 |
| maribo.melee.BMV 0.1 | 6.9 | 9.1% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.7% | 2 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 67.6 | 6 / 35 | 3499 |
| 2 | 5 | 56.3 | 60.3 | 6 / 35 | 2885 |
| 3 | 4 | 59.1 | 68.9 | 6 / 35 | 2961 |
| 4 | 1 | 62.3 | 74.3 | 9 / 35 | 3458 |
| 5 | 3 | 58.8 | 67.3 | 6 / 35 | 3036 |
| 6 | 3 | 62.0 | 71.7 | 11 / 35 | 3551 |
| 7 | 3 | 58.6 | 64.1 | 8 / 35 | 3514 |
| 8 | 2 | 60.1 | 70.5 | 7 / 35 | 3112 |
| 9 | 2 | 61.3 | 73.7 | 6 / 35 | 3264 |
| 10 | 1 | 62.1 | 73.7 | 15 / 35 | 3175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 54% |
| et.Predator 1.8 | 39 | 33% |
| cx.BlestPain 1.41 | 32 | 88% |
| nic.Nicator 2.4 | 23 | 39% |
| ahf.NanoAndrew .4 | 8 | 50% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% |

Hadur died in 270 of 350 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 62 | 23% | 76 |
| cx.BlestPain 1.41 | 48 | 18% | 73 |
| oog.melee.Mercutio 1.0 | 48 | 18% | 69 |
| nic.Nicator 2.4 | 44 | 16% | 53 |
| ahf.NanoAndrew .4 | 35 | 13% | 40 |
| maribo.melee.BMV 0.1 | 20 | 7% | 23 |
| edu.otg.spr.TheTeacher 1.2 | 6 | 2% | 9 |
| tex.Longbot 0.4 | 5 | 2% | 5 |
| goblin.Bender 2.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 72.0 | 98 / 350 | 3.52 | 13.8% | 30533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHD 0.2 | 2.0 | 13.8% | 98 |
| morbid.MorbidPriest 1.0 | 2.1 | 13.4% | 79 |
| agd.Mooserwirt2 2.7 | 2.9 | 12.8% | 60 |
| uji.DBH 1.1 | 3.9 | 11.7% | 42 |
| ratosh.Nobo 0.21 | 4.8 | 10.8% | 16 |
| spinnercat.Robovirus 2.718 | 5.4 | 10.3% | 14 |
| sigterm.Sigterm 1.0 | 6.9 | 8.7% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 7.3% | 4 |
| stelo.WangRobot 1.0 | 9.2 | 5.8% | 18 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 63.5 | 7 / 35 | 2649 |
| 2 | 3 | 60.2 | 72.7 | 8 / 35 | 3219 |
| 3 | 1 | 62.1 | 75.6 | 12 / 35 | 3257 |
| 4 | 1 | 63.3 | 79.0 | 19 / 35 | 3290 |
| 5 | 1 | 59.3 | 73.7 | 5 / 35 | 2863 |
| 6 | 4 | 58.4 | 67.0 | 7 / 35 | 2997 |
| 7 | 1 | 60.3 | 74.0 | 9 / 35 | 2831 |
| 8 | 1 | 62.3 | 78.4 | 11 / 35 | 3268 |
| 9 | 3 | 57.6 | 65.7 | 7 / 35 | 2963 |
| 10 | 1 | 60.3 | 70.5 | 13 / 35 | 3196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 60 | 38% |
| agd.Mooserwirt2 2.7 | 31 | 61% |
| uji.DBH 1.1 | 23 | 52% |
| spinnercat.Robovirus 2.718 | 19 | 95% |
| stelo.WangRobot 1.0 | 13 | 46% |
| sigterm.Sigterm 1.0 | 13 | 69% |
| ratosh.Nobo 0.21 | 11 | 82% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 33% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |

Hadur died in 253 of 350 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 72 | 28% | 100 |
| agd.Mooserwirt2 2.7 | 39 | 15% | 62 |
| uji.DBH 1.1 | 39 | 15% | 43 |
| ratosh.Nobo 0.21 | 33 | 13% | 42 |
| spinnercat.Robovirus 2.718 | 19 | 8% | 28 |
| sigterm.Sigterm 1.0 | 17 | 7% | 29 |
| stelo.WangRobot 1.0 | 12 | 5% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 5% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10 | 4% | 11 |

## Melee bench: F19

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 81.8 | 123 / 350 | 2.64 | 15.8% | 35371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.8 | 16.3% | 111 |
| davidalves.net.DuelistMiniMelee 1.2 | 1.9 | 16.3% | 81 |
| hadur117.nano.SanaroHD 0.2 | 2.3 | 15.8% | 123 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.6% | 12 |
| erdnis.Rover 0.3 | 4.8 | 10.7% | 10 |
| patson.PatsonTestBot 1.0 | 6.4 | 8.4% | 4 |
| mbh.Mbh 0.1 | 7.1 | 7.6% | 0 |
| pac.ABC 2.1 | 7.6 | 7.2% | 9 |
| pbg.R2D2 1.0 | 8.9 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 74.6 | 10 / 35 | 3427 |
| 2 | 3 | 63.4 | 76.2 | 10 / 35 | 3233 |
| 3 | 3 | 64.8 | 79.7 | 11 / 35 | 3415 |
| 4 | 2 | 64.6 | 79.0 | 13 / 35 | 3535 |
| 5 | 2 | 65.9 | 85.7 | 17 / 35 | 3235 |
| 6 | 2 | 67.2 | 87.9 | 14 / 35 | 3811 |
| 7 | 2 | 64.9 | 82.2 | 13 / 35 | 3204 |
| 8 | 3 | 65.1 | 82.9 | 8 / 35 | 3703 |
| 9 | 2 | 67.1 | 86.0 | 16 / 35 | 3837 |
| 10 | 1 | 66.0 | 83.5 | 11 / 35 | 3971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 91 | 56% |
| davidalves.net.DuelistMiniMelee 1.2 | 77 | 49% |
| krillr.mini.JointStrike 2.0.0 | 22 | 86% |
| erdnis.Rover 0.3 | 10 | 70% |
| pac.ABC 2.1 | 7 | 57% |
| patson.PatsonTestBot 1.0 | 4 | 75% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 228 of 350 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 92 | 40% | 169 |
| mld.Infinity 2.2 | 71 | 31% | 41 |
| krillr.mini.JointStrike 2.0.0 | 22 | 10% | 50 |
| erdnis.Rover 0.3 | 16 | 7% | 27 |
| patson.PatsonTestBot 1.0 | 15 | 7% | 30 |
| mbh.Mbh 0.1 | 5 | 2% | 12 |
| pac.ABC 2.1 | 4 | 2% | 8 |
| pbg.R2D2 1.0 | 3 | 1% | 11 |

## Melee bench: F20

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 74.1 | 95 / 350 | 3.33 | 14.1% | 31858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.5% | 136 |
| hadur117.nano.SanaroHD 0.2 | 2.1 | 14.1% | 95 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.5% | 19 |
| fwb.Nine 1.0.1 | 3.7 | 11.7% | 43 |
| catcat20.Rabbit 0.001 | 5.0 | 10.1% | 29 |
| djdjdj.NanoSkunk10 1.0 | 6.6 | 8.8% | 6 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 8.7% | 10 |
| bayen.nut.Squirrel 1.615 | 7.1 | 8.4% | 12 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 75.6 | 14 / 35 | 3304 |
| 2 | 2 | 60.3 | 72.4 | 6 / 35 | 3230 |
| 3 | 2 | 60.4 | 72.1 | 8 / 35 | 3241 |
| 4 | 2 | 61.4 | 74.6 | 11 / 35 | 3275 |
| 5 | 2 | 62.7 | 78.4 | 13 / 35 | 3388 |
| 6 | 2 | 63.4 | 80.3 | 16 / 35 | 3005 |
| 7 | 2 | 60.9 | 72.7 | 7 / 35 | 3300 |
| 8 | 2 | 61.0 | 73.7 | 8 / 35 | 3281 |
| 9 | 2 | 61.0 | 73.0 | 8 / 35 | 3141 |
| 10 | 3 | 57.9 | 67.9 | 4 / 35 | 2693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 78 | 38% |
| fwb.Nine 1.0.1 | 43 | 67% |
| catcat20.Rabbit 0.001 | 21 | 67% |
| bayen.nut.Squirrel 1.615 | 9 | 89% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| nz.jdc.nano.GridFu 1.0 | 6 | 83% |
| m3thos.mini.Eva01 0.5.5 | 5 | 40% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 256 of 350 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 118 | 46% | 138 |
| fwb.Nine 1.0.1 | 45 | 18% | 48 |
| nz.jdc.nano.GridFu 1.0 | 32 | 13% | 52 |
| catcat20.Rabbit 0.001 | 24 | 9% | 47 |
| bayen.nut.Squirrel 1.615 | 14 | 5% | 24 |
| m3thos.mini.Eva01 0.5.5 | 11 | 4% | 15 |
| djdjdj.NanoSkunk10 1.0 | 7 | 3% | 18 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 1% | 3 |
| ntc.ControlledChaos 1.1.4 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.4 | 164 / 350 | 2.49 | 17.1% | 42632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 16.9% | 122 |
| hadur117.nano.SanaroHD 0.2 | 1.7 | 17.1% | 164 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.5% | 27 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.2% | 21 |
| oa.weak.BotherBot 0.1 | 5.4 | 8.6% | 2 |
| eld.Hmm 1.0 | 5.6 | 8.4% | 17 |
| fire219.CatBot 1.0 | 7.6 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.9 | 6.0% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 85.1 | 15 / 35 | 4351 |
| 2 | 2 | 64.9 | 81.6 | 14 / 35 | 3888 |
| 3 | 2 | 65.7 | 80.0 | 14 / 35 | 4429 |
| 4 | 2 | 65.5 | 78.7 | 16 / 35 | 4197 |
| 5 | 1 | 68.7 | 89.8 | 22 / 35 | 4558 |
| 6 | 2 | 65.1 | 80.6 | 14 / 35 | 3911 |
| 7 | 1 | 68.0 | 89.8 | 19 / 35 | 4226 |
| 8 | 1 | 65.9 | 80.3 | 17 / 35 | 4404 |
| 9 | 2 | 65.5 | 79.7 | 13 / 35 | 4391 |
| 10 | 2 | 67.9 | 88.3 | 20 / 35 | 4277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 150 | 65% |
| dummy.mini.Scimitar 1.01 | 33 | 85% |
| cf.RiO.RiOx 4.2.1 | 26 | 62% |
| eld.Hmm 1.0 | 22 | 59% |
| oa.weak.BotherBot 0.1 | 5 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 187 of 350 rounds, at a mean tick of 1216. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 76 | 41% | 149 |
| dummy.mini.Scimitar 1.01 | 43 | 23% | 85 |
| cf.RiO.RiOx 4.2.1 | 34 | 18% | 48 |
| eld.Hmm 1.0 | 10 | 5% | 32 |
| oa.weak.BotherBot 0.1 | 6 | 3% | 14 |
| fire219.CatBot 1.0 | 6 | 3% | 8 |
| PSW.Relentless 0.1 | 6 | 3% | 5 |
| el.JumpShoot 0.2 | 4 | 2% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.9 | 126 / 350 | 2.45 | 16.4% | 38749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.3% | 132 |
| hadur117.nano.SanaroHD 0.2 | 2.1 | 16.4% | 126 |
| cre.Karolos 0.32 | 2.9 | 14.6% | 52 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.7% | 29 |
| stelo.RamTrackSurfer 1.2 | 5.1 | 9.3% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.8% | 1 |
| cw.megas.Blade 0.8 | 7.2 | 8.0% | 0 |
| sample.Walls 1.0 | 7.3 | 8.2% | 2 |
| cli.WasteOfAmmo 1.0 | 9.1 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 86.7 | 14 / 35 | 4152 |
| 2 | 3 | 64.4 | 80.0 | 9 / 35 | 3518 |
| 3 | 2 | 67.6 | 86.3 | 16 / 35 | 3942 |
| 4 | 3 | 65.5 | 79.7 | 9 / 35 | 3824 |
| 5 | 2 | 65.3 | 82.5 | 12 / 35 | 3563 |
| 6 | 2 | 66.6 | 86.0 | 13 / 35 | 3728 |
| 7 | 2 | 67.2 | 86.0 | 12 / 35 | 4428 |
| 8 | 2 | 64.2 | 80.3 | 8 / 35 | 3203 |
| 9 | 2 | 67.0 | 83.5 | 14 / 35 | 4246 |
| 10 | 1 | 67.5 | 87.6 | 19 / 35 | 4145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 130 | 51% |
| cre.Karolos 0.32 | 45 | 58% |
| stelo.AreaTargetingBot 1.1 | 30 | 43% |
| sample.Walls 1.0 | 10 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 67% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 225 of 350 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 118 | 52% | 175 |
| cre.Karolos 0.32 | 52 | 23% | 80 |
| stelo.AreaTargetingBot 1.1 | 34 | 15% | 46 |
| stelo.RamTrackSurfer 1.2 | 10 | 4% | 25 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 2% | 9 |
| sample.Walls 1.0 | 4 | 2% | 6 |
| cw.megas.Blade 0.8 | 2 | 1% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 61.7 | 52 / 350 | 4.44 | 11.2% | 22618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 15.1% | 80 |
| florent.XSeries.X2 0.12 | 2.5 | 13.8% | 68 |
| davidalves.Phoenix 0.54 | 2.7 | 13.7% | 80 |
| pedersen.Ugluk 1.1.1 | 3.5 | 12.8% | 44 |
| hadur117.nano.SanaroHD 0.2 | 4.9 | 11.2% | 52 |
| oog.melee.Corsair 1.0 | 6.0 | 9.2% | 10 |
| stelo.SoJNanoMelee 1.1 | 6.9 | 8.2% | 14 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.5% | 2 |
| as.FrankTheTank 1.3 | 9.2 | 5.0% | 2 |
| evd.X1 0.01 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 51.7 | 54.6 | 4 / 35 | 1903 |
| 2 | 5 | 54.2 | 59.7 | 6 / 35 | 2075 |
| 3 | 5 | 55.4 | 64.8 | 5 / 35 | 1925 |
| 4 | 5 | 53.6 | 57.8 | 3 / 35 | 2342 |
| 5 | 3 | 58.9 | 70.8 | 7 / 35 | 2674 |
| 6 | 5 | 56.3 | 63.5 | 6 / 35 | 2362 |
| 7 | 5 | 56.6 | 62.5 | 8 / 35 | 2421 |
| 8 | 5 | 55.6 | 62.2 | 4 / 35 | 2490 |
| 9 | 5 | 54.1 | 58.1 | 3 / 35 | 2385 |
| 10 | 5 | 55.3 | 63.5 | 6 / 35 | 2041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 35 | 51% |
| davidalves.Phoenix 0.54 | 20 | 35% |
| pedersen.Ugluk 1.1.1 | 18 | 72% |
| florent.XSeries.X2 0.12 | 15 | 67% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| stelo.SoJNanoMelee 1.1 | 3 | 33% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 64 | 21% | 85 |
| florent.XSeries.X2 0.12 | 62 | 21% | 70 |
| pedersen.Ugluk 1.1.1 | 58 | 19% | 68 |
| davidalves.Phoenix 0.54 | 55 | 18% | 65 |
| oog.melee.Corsair 1.0 | 20 | 7% | 23 |
| stelo.SoJNanoMelee 1.1 | 20 | 7% | 20 |
| lunchie.Lunchbox 0.93 | 7 | 2% | 8 |
| evd.X1 0.01 | 7 | 2% | 6 |
| as.FrankTheTank 1.3 | 5 | 2% | 5 |

## Melee bench: F25

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 71.4 | 72 / 350 | 3.57 | 13.5% | 27503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.3 | 15.0% | 91 |
| voidious.micro.BlitzBat 1.05 | 2.1 | 14.0% | 65 |
| hadur117.nano.SanaroHD 0.2 | 2.6 | 13.5% | 72 |
| jdw.Hurricane 1.4 | 4.2 | 11.5% | 38 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 10.3% | 33 |
| ds.Oo 2.2 | 6.0 | 9.3% | 24 |
| gjr.Cephalosporin 0.1 | 7.2 | 8.4% | 13 |
| awesomeness.Elite 1.0 | 8.2 | 7.1% | 9 |
| adt.Ar2 1.1 | 8.4 | 6.7% | 5 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 65.7 | 6 / 35 | 2525 |
| 2 | 3 | 59.9 | 71.7 | 5 / 35 | 2781 |
| 3 | 3 | 62.0 | 75.2 | 10 / 35 | 3212 |
| 4 | 2 | 62.6 | 79.4 | 6 / 35 | 3099 |
| 5 | 3 | 59.1 | 69.5 | 6 / 35 | 2758 |
| 6 | 2 | 60.3 | 74.0 | 7 / 35 | 2692 |
| 7 | 2 | 59.6 | 72.1 | 10 / 35 | 2396 |
| 8 | 3 | 57.5 | 67.0 | 8 / 35 | 2585 |
| 9 | 3 | 58.9 | 68.3 | 7 / 35 | 2647 |
| 10 | 2 | 59.8 | 71.1 | 7 / 35 | 2808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 55 | 24% |
| voidious.micro.BlitzBat 1.05 | 45 | 42% |
| jdw.Hurricane 1.4 | 22 | 86% |
| gre.svman4.Morfeas 1.4.1 | 12 | 33% |
| gjr.Cephalosporin 0.1 | 10 | 70% |
| adt.Ar2 1.1 | 6 | 67% |
| awesomeness.Elite 1.0 | 5 | 60% |
| ds.Oo 2.2 | 5 | 40% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 279 of 350 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 83 | 30% | 101 |
| voidious.micro.BlitzBat 1.05 | 75 | 27% | 96 |
| jdw.Hurricane 1.4 | 31 | 11% | 46 |
| gre.svman4.Morfeas 1.4.1 | 25 | 9% | 32 |
| gjr.Cephalosporin 0.1 | 18 | 6% | 22 |
| ds.Oo 2.2 | 18 | 6% | 20 |
| adt.Ar2 1.1 | 17 | 6% | 19 |
| awesomeness.Elite 1.0 | 10 | 4% | 11 |
| amk.ChumbaMini 0.2 | 2 | 1% | 2 |

## Melee bench: F26

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 72.5 | 81 / 350 | 3.48 | 13.8% | 35085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.1 | 15.8% | 103 |
| hadur117.nano.SanaroHD 0.2 | 2.4 | 13.8% | 81 |
| shu.nitro.LENIN .T34 | 2.8 | 13.4% | 81 |
| lrem.Spectre 0.4.4 | 4.0 | 12.2% | 42 |
| js.PinBall 1.6 | 5.1 | 11.1% | 15 |
| gh.mini.GrubbmOne 1.0 | 5.7 | 10.7% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.3% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.0% | 7 |
| sample.SpinBot 1.0 | 9.0 | 5.2% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 67.6 | 4 / 35 | 3297 |
| 2 | 2 | 62.7 | 76.8 | 7 / 35 | 3787 |
| 3 | 3 | 61.0 | 71.7 | 7 / 35 | 3445 |
| 4 | 4 | 57.1 | 61.6 | 5 / 35 | 3386 |
| 5 | 2 | 62.1 | 72.7 | 12 / 35 | 3618 |
| 6 | 2 | 62.3 | 74.9 | 9 / 35 | 3664 |
| 7 | 3 | 59.5 | 67.0 | 9 / 35 | 3268 |
| 8 | 2 | 62.6 | 75.6 | 9 / 35 | 3840 |
| 9 | 2 | 60.1 | 72.7 | 5 / 35 | 3048 |
| 10 | 1 | 64.8 | 84.1 | 14 / 35 | 3732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 57 | 39% |
| shu.nitro.LENIN .T34 | 43 | 23% |
| lrem.Spectre 0.4.4 | 31 | 61% |
| js.PinBall 1.6 | 14 | 93% |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 88% |
| gh.mini.GrubbmOne 1.0 | 7 | 43% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 83% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 86 | 32% | 109 |
| shu.nitro.LENIN .T34 | 62 | 23% | 77 |
| gh.mini.GrubbmOne 1.0 | 35 | 13% | 38 |
| lrem.Spectre 0.4.4 | 33 | 12% | 43 |
| js.PinBall 1.6 | 19 | 7% | 33 |
| jaybot.adv.bots.JayBot 2.0 | 16 | 6% | 24 |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 4% | 16 |
| sample.SpinBot 1.0 | 8 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 72.4 | 113 / 350 | 3.49 | 13.8% | 28471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHD 0.2 | 2.0 | 13.8% | 113 |
| mk.Alpha 0.2.1 | 2.3 | 14.4% | 103 |
| wee.Gem 1.8.4 | 3.3 | 12.4% | 58 |
| sheldor.melee.nano.TestMelee 0.1 | 3.4 | 12.1% | 36 |
| EH.Eagle 1.0.6 | 4.2 | 11.4% | 21 |
| techdude.kombat.FlamingKombat 1.5 | 5.9 | 9.4% | 10 |
| joe.ADinosaur 1.0 | 7.2 | 8.3% | 2 |
| throxbot.ThroxBot 0.1 | 8.0 | 7.7% | 3 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.3% | 3 |
| cs.Grudge 1.0 | 9.9 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 78.4 | 13 / 35 | 2578 |
| 2 | 2 | 60.1 | 72.4 | 12 / 35 | 2773 |
| 3 | 1 | 62.0 | 78.4 | 12 / 35 | 2785 |
| 4 | 2 | 59.7 | 71.1 | 11 / 35 | 2900 |
| 5 | 2 | 61.1 | 76.5 | 12 / 35 | 2674 |
| 6 | 3 | 59.0 | 70.2 | 10 / 35 | 2523 |
| 7 | 3 | 56.2 | 52.1 | 7 / 35 | 3859 |
| 8 | 1 | 60.0 | 73.7 | 11 / 35 | 2583 |
| 9 | 2 | 61.8 | 76.2 | 14 / 35 | 2947 |
| 10 | 2 | 61.3 | 74.9 | 11 / 35 | 2849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 62 | 68% |
| wee.Gem 1.8.4 | 49 | 45% |
| sheldor.melee.nano.TestMelee 0.1 | 26 | 62% |
| EH.Eagle 1.0.6 | 19 | 95% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 75% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 237 of 350 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 62 | 26% | 108 |
| wee.Gem 1.8.4 | 52 | 22% | 74 |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 18% | 60 |
| joe.ADinosaur 1.0 | 25 | 11% | 26 |
| EH.Eagle 1.0.6 | 15 | 6% | 34 |
| caimano.Furia_Ceca 0.22 | 13 | 5% | 16 |
| throxbot.ThroxBot 0.1 | 13 | 5% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 10 | 4% | 13 |
| cs.Grudge 1.0 | 5 | 2% | 5 |

## Melee bench: F28

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 80.8 | 121 / 350 | 2.73 | 15.4% | 31210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.4 | 16.3% | 114 |
| hadur117.nano.SanaroHD 0.2 | 1.6 | 15.4% | 121 |
| uji.Antique 1.0 | 3.4 | 12.3% | 52 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 11.4% | 36 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.1% | 13 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.3% | 7 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.7% | 3 |
| matt.advanced.Katana 1.0 | 8.0 | 6.6% | 2 |
| stelo.PianistNano 1.2 | 9.1 | 6.1% | 2 |
| stelo.Lifestealer 1.0 | 9.6 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 79.7 | 14 / 35 | 2968 |
| 2 | 2 | 60.1 | 73.7 | 9 / 35 | 2655 |
| 3 | 2 | 60.7 | 75.2 | 8 / 35 | 2812 |
| 4 | 1 | 65.2 | 86.3 | 14 / 35 | 3381 |
| 5 | 2 | 61.1 | 76.2 | 8 / 35 | 3014 |
| 6 | 2 | 64.0 | 83.8 | 12 / 35 | 3101 |
| 7 | 1 | 65.3 | 87.6 | 12 / 35 | 3337 |
| 8 | 1 | 65.2 | 82.9 | 18 / 35 | 3498 |
| 9 | 1 | 64.1 | 81.3 | 14 / 35 | 3273 |
| 10 | 2 | 63.1 | 81.3 | 12 / 35 | 3171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 132 | 52% |
| uji.Antique 1.0 | 45 | 58% |
| qohnil.blot.BlotBot 3.61 | 24 | 46% |
| pfvicm.Sobieski 7.2.3b | 9 | 56% |
| amk.ChumbaWumba 0.3 | 6 | 50% |
| stelo.PianistNano 1.2 | 4 | 75% |
| ahr.ice.Ice 1.0.2 | 4 | 50% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 230 of 350 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 93 | 40% | 139 |
| uji.Antique 1.0 | 37 | 16% | 75 |
| pfvicm.Sobieski 7.2.3b | 29 | 13% | 36 |
| qohnil.blot.BlotBot 3.61 | 24 | 10% | 38 |
| amk.ChumbaWumba 0.3 | 24 | 10% | 26 |
| ahr.ice.Ice 1.0.2 | 8 | 3% | 13 |
| stelo.PianistNano 1.2 | 8 | 3% | 11 |
| matt.advanced.Katana 1.0 | 5 | 2% | 9 |
| stelo.Lifestealer 1.0 | 2 | 1% | 3 |

## Melee bench: F29

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 68.2 | 69 / 350 | 3.86 | 13.3% | 30797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.6 | 15.8% | 114 |
| zyx.mega.YersiniaPestis 3.1 | 1.6 | 15.4% | 90 |
| hadur117.nano.SanaroHD 0.2 | 3.4 | 13.3% | 69 |
| myl.micro.Troodon 1.10 | 3.7 | 12.8% | 22 |
| jok.PheonixM 0.1.2 | 4.7 | 11.3% | 22 |
| DBall.Anarchy 0.1 | 6.5 | 8.5% | 26 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.3% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.7% | 0 |
| ap.Frederick 1.1 | 9.4 | 4.5% | 5 |
| jangs.ns51 1.0 | 9.5 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 69.5 | 6 / 35 | 3665 |
| 2 | 3 | 63.9 | 77.1 | 12 / 35 | 3336 |
| 3 | 3 | 62.1 | 72.1 | 10 / 35 | 3400 |
| 4 | 3 | 60.1 | 71.1 | 3 / 35 | 2806 |
| 5 | 4 | 59.6 | 67.0 | 7 / 35 | 2889 |
| 6 | 3 | 60.3 | 69.5 | 7 / 35 | 3051 |
| 7 | 4 | 57.8 | 61.3 | 5 / 35 | 3186 |
| 8 | 4 | 59.5 | 67.6 | 9 / 35 | 2715 |
| 9 | 4 | 56.0 | 58.7 | 5 / 35 | 2796 |
| 10 | 4 | 59.7 | 67.9 | 5 / 35 | 2953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 56 | 7% |
| zyx.mega.YersiniaPestis 3.1 | 45 | 62% |
| myl.micro.Troodon 1.10 | 28 | 79% |
| DBall.Anarchy 0.1 | 15 | 47% |
| jok.PheonixM 0.1.2 | 9 | 67% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 1133. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 124 | 44% | 133 |
| zyx.mega.YersiniaPestis 3.1 | 56 | 20% | 81 |
| myl.micro.Troodon 1.10 | 36 | 13% | 56 |
| jok.PheonixM 0.1.2 | 34 | 12% | 38 |
| DBall.Anarchy 0.1 | 12 | 4% | 20 |
| ph.melee.ArcherME 0.3 | 8 | 3% | 9 |
| fullsail.TimbotNoPrediction 1.0 | 7 | 2% | 7 |
| jangs.ns51 1.0 | 6 | 2% | 6 |

## Melee bench: F30

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.7 | 57.6 | 24 / 350 | 4.82 | 10.6% | 24858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.1 | 14.1% | 87 |
| darkcanuck.B26354 1.06 | 2.2 | 14.1% | 83 |
| oog.melee.Capulet 1.2 | 2.3 | 13.9% | 68 |
| stelo.PastFuture 2.3.2 | 3.4 | 12.8% | 45 |
| hadur117.nano.SanaroHD 0.2 | 5.1 | 10.6% | 24 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.2% | 18 |
| ntc.Opposite 1.5 | 7.4 | 8.0% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.5% | 10 |
| tripphippy.Alice 1.1 | 8.3 | 7.2% | 14 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.0 | 61.0 | 2 / 35 | 2932 |
| 2 | 5 | 54.7 | 60.6 | 2 / 35 | 2519 |
| 3 | 5 | 50.8 | 48.9 | 4 / 35 | 2393 |
| 4 | 5 | 55.3 | 63.8 | 1 / 35 | 2628 |
| 5 | 5 | 54.1 | 58.4 | 2 / 35 | 2271 |
| 6 | 5 | 53.5 | 59.4 | 2 / 35 | 2308 |
| 7 | 5 | 54.1 | 59.0 | 4 / 35 | 2313 |
| 8 | 5 | 54.3 | 57.1 | 3 / 35 | 2602 |
| 9 | 6 | 50.3 | 49.2 | 1 / 35 | 2422 |
| 10 | 5 | 54.1 | 58.4 | 3 / 35 | 2470 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 14% |
| darkcanuck.B26354 1.06 | 19 | 37% |
| oog.melee.Capulet 1.2 | 17 | 18% |
| intruder.PrairieWolf 2.61 | 8 | 38% |
| stelo.PastFuture 2.3.2 | 8 | 88% |
| tripphippy.Alice 1.1 | 1 | 0% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 326 of 350 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 78 | 24% | 82 |
| oog.melee.Capulet 1.2 | 64 | 20% | 66 |
| darkcanuck.B26354 1.06 | 50 | 15% | 56 |
| stelo.PastFuture 2.3.2 | 45 | 14% | 55 |
| intruder.PrairieWolf 2.61 | 23 | 7% | 26 |
| tripphippy.Alice 1.1 | 22 | 7% | 22 |
| fowl3628800.LightningBolt 2.6.0 | 22 | 7% | 21 |
| ntc.Opposite 1.5 | 18 | 6% | 18 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 61.1 | 32 / 350 | 4.50 | 11.1% | 22623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 180 |
| gh.mini.Griezel 0.2 | 2.5 | 13.7% | 85 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 12.0% | 23 |
| d414.nano.Quantum 1.0.0 | 3.9 | 11.6% | 17 |
| hadur117.nano.SanaroHD 0.2 | 4.1 | 11.1% | 32 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.8% | 9 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.8% | 3 |
| fm.mammillarias 1.3 | 7.8 | 6.6% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.9 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.2 | 65.1 | 4 / 35 | 2236 |
| 2 | 5 | 54.1 | 58.7 | 3 / 35 | 2164 |
| 3 | 3 | 56.0 | 65.4 | 2 / 35 | 2194 |
| 4 | 4 | 54.9 | 60.6 | 5 / 35 | 2340 |
| 5 | 3 | 59.2 | 69.5 | 2 / 35 | 2928 |
| 6 | 4 | 54.0 | 55.2 | 4 / 35 | 2489 |
| 7 | 5 | 53.7 | 59.7 | 1 / 35 | 2075 |
| 8 | 6 | 52.5 | 54.3 | 4 / 35 | 2090 |
| 9 | 4 | 54.5 | 60.6 | 4 / 35 | 2013 |
| 10 | 4 | 55.2 | 62.2 | 3 / 35 | 2094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 52 | 33% |
| gh.mini.Griezel 0.2 | 41 | 32% |
| spinnercat.micro.Tyger 0.1 | 6 | 0% |
| d414.nano.Quantum 1.0.0 | 4 | 0% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |
| fm.mammillarias 1.3 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 320 of 350 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 84 | 26% | 97 |
| abc.Shadow 3.84i | 72 | 23% | 88 |
| spinnercat.micro.Tyger 0.1 | 49 | 15% | 51 |
| d414.nano.Quantum 1.0.0 | 46 | 14% | 46 |
| gh.nano.Grofvuil 0.2 | 26 | 8% | 27 |
| timmit.nano.TimDog 0.33 | 18 | 6% | 18 |
| fm.mammillarias 1.3 | 13 | 4% | 13 |
| Gecko.ultimateGeckoBot 1.0 | 8 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F32

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 75.5 | 131 / 350 | 3.20 | 14.5% | 30687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.2% | 111 |
| hadur117.nano.SanaroHD 0.2 | 2.0 | 14.5% | 131 |
| apc.botM 3.0 | 3.0 | 12.6% | 49 |
| lxx.ConceptA 0.8 | 4.0 | 11.5% | 8 |
| vjik.UnViolation 1.1 | 4.9 | 10.7% | 23 |
| bayen.UbaMicro 1.4 | 5.9 | 9.3% | 8 |
| panzer.Panzer 0.2 | 7.7 | 7.3% | 2 |
| yk.JahMicro 1.0 | 8.1 | 7.0% | 11 |
| conscience.Electron 1.3g | 8.4 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.3% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 78.4 | 17 / 35 | 3077 |
| 2 | 3 | 57.6 | 66.3 | 12 / 35 | 2610 |
| 3 | 1 | 64.7 | 84.4 | 19 / 35 | 3326 |
| 4 | 2 | 62.1 | 74.6 | 14 / 35 | 3284 |
| 5 | 2 | 59.6 | 73.7 | 8 / 35 | 2779 |
| 6 | 2 | 61.8 | 77.8 | 12 / 35 | 2878 |
| 7 | 2 | 59.5 | 71.4 | 12 / 35 | 3054 |
| 8 | 2 | 63.8 | 81.0 | 15 / 35 | 3370 |
| 9 | 2 | 60.8 | 72.1 | 12 / 35 | 3284 |
| 10 | 3 | 60.8 | 75.6 | 10 / 35 | 3025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 94 | 54% |
| apc.botM 3.0 | 36 | 67% |
| lxx.ConceptA 0.8 | 22 | 95% |
| vjik.UnViolation 1.1 | 17 | 76% |
| bayen.UbaMicro 1.4 | 12 | 83% |
| donjezza.Jezza 1.0 | 8 | 75% |
| yk.JahMicro 1.0 | 7 | 43% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 219 of 350 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 64 | 29% | 112 |
| lxx.ConceptA 0.8 | 39 | 18% | 50 |
| apc.botM 3.0 | 35 | 16% | 61 |
| vjik.UnViolation 1.1 | 25 | 11% | 42 |
| bayen.UbaMicro 1.4 | 22 | 10% | 35 |
| panzer.Panzer 0.2 | 12 | 5% | 12 |
| conscience.Electron 1.3g | 11 | 5% | 15 |
| yk.JahMicro 1.0 | 6 | 3% | 9 |
| donjezza.Jezza 1.0 | 5 | 2% | 13 |

## Melee bench: F33

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 71.9 | 84 / 350 | 3.53 | 14.1% | 34237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.5% | 122 |
| hadur117.nano.SanaroHD 0.2 | 2.6 | 14.1% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 14.0% | 68 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.1% | 23 |
| labg.Cataclysm 2.05 | 4.7 | 10.6% | 36 |
| baal.nano.N 1.42 | 6.0 | 9.0% | 5 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.0% | 9 |
| zyx.micro.Ant 1.1 | 8.4 | 5.7% | 1 |
| sanja.First 0.1 | 8.8 | 5.3% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 80.3 | 11 / 35 | 3468 |
| 2 | 3 | 62.3 | 72.7 | 9 / 35 | 3664 |
| 3 | 4 | 57.6 | 62.9 | 6 / 35 | 2910 |
| 4 | 3 | 61.0 | 71.7 | 8 / 35 | 3610 |
| 5 | 2 | 60.3 | 67.9 | 7 / 35 | 3341 |
| 6 | 3 | 62.0 | 72.7 | 9 / 35 | 3522 |
| 7 | 2 | 63.6 | 77.5 | 9 / 35 | 3604 |
| 8 | 2 | 63.6 | 76.8 | 11 / 35 | 3791 |
| 9 | 3 | 56.3 | 60.0 | 5 / 35 | 3015 |
| 10 | 2 | 62.4 | 76.5 | 9 / 35 | 3312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 60 | 52% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 56 | 18% |
| gre.svman4.Leonidas 1.3.2 | 22 | 91% |
| labg.Cataclysm 2.05 | 15 | 60% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 3 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 100% |

Hadur died in 266 of 350 rounds, at a mean tick of 1149. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 95 | 36% | 133 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 29% | 94 |
| gre.svman4.Leonidas 1.3.2 | 35 | 13% | 48 |
| labg.Cataclysm 2.05 | 21 | 8% | 25 |
| baal.nano.N 1.42 | 16 | 6% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 13 | 5% | 16 |
| zyx.micro.Ant 1.1 | 7 | 3% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 1% | 2 |
| sanja.First 0.1 | 0 | 0% | 3 |

## Melee bench: F34

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 73.1 | 62 / 350 | 3.42 | 13.7% | 33118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.4 | 17.5% | 109 |
| stelo.Spread 0.9 | 1.6 | 17.1% | 131 |
| hadur117.nano.SanaroHD 0.2 | 3.0 | 13.7% | 62 |
| jcs.Seth 1.8 | 4.4 | 11.5% | 26 |
| tcf.Reach 3 | 4.9 | 11.1% | 17 |
| cli.Dancer 1.1 | 5.7 | 10.1% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 4.1% | 1 |
| sample.RamFire 1.0 | 9.9 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 74.3 | 8 / 35 | 3498 |
| 2 | 3 | 61.9 | 74.3 | 8 / 35 | 3149 |
| 3 | 3 | 62.4 | 77.8 | 5 / 35 | 3200 |
| 4 | 3 | 60.9 | 72.1 | 4 / 35 | 3217 |
| 5 | 3 | 63.4 | 78.1 | 5 / 35 | 3604 |
| 6 | 3 | 59.7 | 68.6 | 6 / 35 | 3009 |
| 7 | 3 | 62.5 | 71.1 | 10 / 35 | 3509 |
| 8 | 3 | 61.5 | 73.3 | 5 / 35 | 3197 |
| 9 | 3 | 61.6 | 71.7 | 5 / 35 | 3600 |
| 10 | 3 | 60.7 | 70.2 | 6 / 35 | 3135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 60 | 53% |
| kid.Gladiator .7.2 | 53 | 23% |
| jcs.Seth 1.8 | 17 | 65% |
| tcf.Reach 3 | 8 | 38% |
| cli.Dancer 1.1 | 4 | 75% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 121 | 42% | 123 |
| stelo.Spread 0.9 | 91 | 31% | 129 |
| tcf.Reach 3 | 30 | 10% | 34 |
| jcs.Seth 1.8 | 28 | 10% | 40 |
| cli.Dancer 1.1 | 9 | 3% | 13 |
| ratosh.Wesco 1.4 | 9 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 69.6 | 25 / 350 | 3.73 | 12.4% | 25475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.7% | 275 |
| gh.mini.Gruwel 0.9 | 2.9 | 13.1% | 28 |
| hadur117.nano.SanaroHD 0.2 | 3.5 | 12.4% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.6 | 12.4% | 12 |
| rz.HawkOnFire 0.1 | 4.0 | 12.2% | 10 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.0% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.1 | 5.5% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.3 | 64.8 | 1 / 35 | 2066 |
| 2 | 2 | 59.4 | 74.0 | 1 / 35 | 2427 |
| 3 | 5 | 56.2 | 63.5 | 0 / 35 | 2385 |
| 4 | 3 | 58.4 | 68.3 | 4 / 35 | 2609 |
| 5 | 4 | 58.2 | 69.8 | 1 / 35 | 2586 |
| 6 | 3 | 60.9 | 74.0 | 4 / 35 | 2996 |
| 7 | 5 | 56.7 | 64.1 | 0 / 35 | 2660 |
| 8 | 3 | 60.3 | 71.4 | 4 / 35 | 2708 |
| 9 | 2 | 59.8 | 73.7 | 5 / 35 | 2389 |
| 10 | 3 | 59.7 | 72.7 | 5 / 35 | 2649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 104 | 3% |
| gh.mini.Gruwel 0.9 | 17 | 35% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 78% |
| rz.HawkOnFire 0.1 | 7 | 86% |
| wit.Chuliath 1.0 | 3 | 100% |

Hadur died in 325 of 350 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 163 | 50% | 167 |
| gh.mini.Gruwel 0.9 | 54 | 17% | 59 |
| rz.HawkOnFire 0.1 | 47 | 14% | 51 |
| dmh.robocode.robot.BlackDeath 9.2 | 39 | 12% | 47 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 10 | 3% | 10 |
| myl.nano.KomoriNinja 1.1 | 5 | 2% | 6 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 5 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 75.8 | 157 / 350 | 3.17 | 15.4% | 34420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHD 0.2 | 1.1 | 15.4% | 157 |
| alpha.RainingFire 1.0 | 2.8 | 12.8% | 54 |
| bzdp.Pansy 2.1 | 3.0 | 12.2% | 39 |
| bvh.micro.Freya 0.3 | 4.5 | 10.8% | 25 |
| mz.Cork 0.1 | 4.7 | 11.2% | 30 |
| m3thos.Eva02 0.7.1 | 5.7 | 9.9% | 15 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.4% | 6 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.8% | 4 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.7% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 74.9 | 16 / 35 | 3254 |
| 2 | 1 | 62.6 | 76.8 | 15 / 35 | 3261 |
| 3 | 1 | 63.2 | 77.8 | 15 / 35 | 3354 |
| 4 | 1 | 61.8 | 71.4 | 14 / 35 | 3465 |
| 5 | 1 | 65.9 | 86.3 | 20 / 35 | 3529 |
| 6 | 1 | 63.8 | 78.1 | 15 / 35 | 3743 |
| 7 | 1 | 63.6 | 75.9 | 17 / 35 | 3522 |
| 8 | 1 | 63.5 | 76.2 | 18 / 35 | 3405 |
| 9 | 1 | 62.9 | 73.3 | 16 / 35 | 3777 |
| 10 | 2 | 59.0 | 67.6 | 11 / 35 | 3110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 72% |
| bvh.micro.Freya 0.3 | 35 | 80% |
| alpha.RainingFire 1.0 | 34 | 74% |
| mz.Cork 0.1 | 26 | 85% |
| bvh.mini.Fenrir 0.39 | 18 | 100% |
| m3thos.Eva02 0.7.1 | 14 | 93% |
| dl.BetterWalls 1.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 9 | 56% |
| squidM.TentalceMeleeNano 1.1 | 3 | 0% |

Hadur died in 193 of 350 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 47 | 24% | 71 |
| bzdp.Pansy 2.1 | 37 | 19% | 83 |
| bvh.micro.Freya 0.3 | 20 | 10% | 38 |
| m3thos.Eva02 0.7.1 | 19 | 10% | 36 |
| mz.Cork 0.1 | 18 | 9% | 42 |
| bvh.mini.Fenrir 0.39 | 17 | 9% | 22 |
| squidM.TentalceMeleeNano 1.1 | 15 | 8% | 19 |
| dl.BetterWalls 1.0 | 11 | 6% | 23 |
| sample.MyFirstRobot 1.0 | 9 | 5% | 16 |

## Melee bench: F37

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 80.3 | 142 / 350 | 2.77 | 15.9% | 42742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHD 0.2 | 1.0 | 15.9% | 142 |
| germ.TheMind .2 | 2.8 | 11.6% | 45 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 11.1% | 30 |
| EBBU.Sim2 1.02 | 4.1 | 10.4% | 32 |
| agrach.Dalek 1.0 | 4.8 | 9.8% | 34 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.8% | 13 |
| mb.Beast 0.1 | 7.3 | 8.4% | 16 |
| lmk.ACPFinal 0.1 | 7.6 | 8.5% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 8.4 | 8.0% | 2 |
| skm.Ryubot 1.0 | 9.0 | 7.5% | 18 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 89.2 | 20 / 35 | 4815 |
| 2 | 1 | 62.5 | 80.3 | 12 / 35 | 4222 |
| 3 | 1 | 65.0 | 82.2 | 18 / 35 | 4844 |
| 4 | 1 | 63.6 | 81.6 | 16 / 35 | 4099 |
| 5 | 1 | 63.3 | 81.6 | 14 / 35 | 4225 |
| 6 | 1 | 61.4 | 78.1 | 10 / 35 | 3886 |
| 7 | 1 | 62.2 | 74.9 | 14 / 35 | 4445 |
| 8 | 1 | 65.3 | 87.3 | 16 / 35 | 4406 |
| 9 | 1 | 60.2 | 74.0 | 9 / 35 | 3885 |
| 10 | 1 | 60.6 | 74.0 | 13 / 35 | 3915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 51 | 61% |
| agrach.Dalek 1.0 | 35 | 63% |
| EBBU.Sim2 1.02 | 35 | 43% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 68% |
| mb.Beast 0.1 | 23 | 83% |
| stelo.UntouchableNano 1.3 | 22 | 86% |
| skm.Ryubot 1.0 | 16 | 69% |
| lmk.ACPFinal 0.1 | 13 | 54% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 213 of 350 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 37 | 17% | 62 |
| EBBU.Sim2 1.02 | 36 | 17% | 45 |
| com.syncleus.robocode.Dreadnaught 0.1 | 35 | 16% | 54 |
| agrach.Dalek 1.0 | 25 | 12% | 53 |
| lmk.ACPFinal 0.1 | 25 | 12% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 10% | 27 |
| skm.Ryubot 1.0 | 14 | 7% | 22 |
| stelo.UntouchableNano 1.3 | 11 | 5% | 27 |
| mb.Beast 0.1 | 9 | 4% | 26 |

## Melee bench: F38

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 65.7 | 43 / 350 | 4.08 | 12.0% | 26507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 156 |
| bvh.mini.Freya 0.55 | 2.4 | 13.4% | 46 |
| hadur117.nano.SanaroHD 0.2 | 3.7 | 12.0% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.4 | 11.6% | 31 |
| cs.Wren 1.0 | 4.8 | 11.2% | 21 |
| bts.mega.Gnarly 1.4 | 5.0 | 11.0% | 40 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.4% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.4 | 5.9% | 3 |
| matt.UnderDark3 2.4.34 | 9.1 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 74.0 | 6 / 35 | 3109 |
| 2 | 4 | 56.9 | 65.4 | 6 / 35 | 2447 |
| 3 | 4 | 57.0 | 63.5 | 4 / 35 | 2852 |
| 4 | 4 | 57.5 | 66.0 | 4 / 35 | 2643 |
| 5 | 6 | 53.2 | 55.9 | 3 / 35 | 2521 |
| 6 | 3 | 58.0 | 69.8 | 4 / 35 | 2630 |
| 7 | 4 | 56.8 | 66.7 | 4 / 35 | 2452 |
| 8 | 3 | 57.3 | 65.7 | 5 / 35 | 2559 |
| 9 | 3 | 58.1 | 67.9 | 3 / 35 | 2734 |
| 10 | 4 | 56.2 | 62.5 | 4 / 35 | 2560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 42 | 40% |
| bts.mega.Gnarly 1.4 | 22 | 36% |
| bvh.mini.Freya 0.55 | 16 | 50% |
| cs.Wren 1.0 | 10 | 30% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 0% |
| kdf.KoulDestroyer 1.0 | 7 | 43% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| matt.UnderDark3 2.4.34 | 2 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 88 | 29% | 108 |
| bvh.mini.Freya 0.55 | 53 | 17% | 57 |
| cs.Wren 1.0 | 40 | 13% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 13% | 43 |
| bts.mega.Gnarly 1.4 | 39 | 13% | 42 |
| kdf.KoulDestroyer 1.0 | 30 | 10% | 32 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 3% | 9 |
| matt.UnderDark3 2.4.34 | 6 | 2% | 8 |
| bzdp.BoxCar 2.0 | 4 | 1% | 5 |

## Melee bench: F39

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 66.3 | 39 / 350 | 4.04 | 12.2% | 29166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 16.1% | 87 |
| az.Ololobot 0.2.4 | 2.3 | 13.6% | 133 |
| hadur117.nano.SanaroHD 0.2 | 3.1 | 12.2% | 39 |
| catcat20.Lambda 0.024 | 4.1 | 11.2% | 36 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.3% | 38 |
| gimp.GimpBot 0.1 | 6.9 | 8.3% | 4 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 8.3% | 6 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.5% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.5% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.4 | 67.9 | 6 / 35 | 2712 |
| 2 | 4 | 53.9 | 57.8 | 3 / 35 | 2973 |
| 3 | 3 | 55.1 | 61.9 | 1 / 35 | 2834 |
| 4 | 3 | 56.8 | 67.6 | 3 / 35 | 2835 |
| 5 | 4 | 57.0 | 65.4 | 3 / 35 | 3185 |
| 6 | 3 | 58.3 | 70.2 | 3 / 35 | 3070 |
| 7 | 3 | 57.9 | 69.5 | 6 / 35 | 2854 |
| 8 | 2 | 59.9 | 73.3 | 7 / 35 | 3260 |
| 9 | 3 | 54.8 | 62.9 | 2 / 35 | 2692 |
| 10 | 3 | 56.8 | 66.0 | 5 / 35 | 2751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 49 | 6% |
| bvh.fry.Freya 0.82 | 35 | 26% |
| catcat20.Lambda 0.024 | 23 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 39% |
| gimp.GimpBot 0.1 | 5 | 60% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |
| winamp32.micro.MicroMacro 1.0 | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 100 | 32% | 110 |
| az.Ololobot 0.2.4 | 68 | 22% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 39 | 13% | 43 |
| catcat20.Lambda 0.024 | 29 | 9% | 42 |
| apollokidd.ApolloKidd 0.9 | 26 | 8% | 27 |
| gimp.GimpBot 0.1 | 18 | 6% | 23 |
| winamp32.micro.MicroMacro 1.0 | 15 | 5% | 16 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 3% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 8 | 3% | 8 |

## Melee bench: F41

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 75.0 | 106 / 350 | 3.25 | 14.1% | 28020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.0% | 149 |
| hadur117.nano.SanaroHD 0.2 | 2.0 | 14.1% | 106 |
| ary.Swarm 1.1 | 3.5 | 13.1% | 18 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.7% | 36 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.3% | 23 |
| shrub.Silver v048 | 5.9 | 8.8% | 7 |
| zyx.nano.Ant 1.1 | 7.1 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.3% | 7 |
| stelo.Mirror 1.1 | 8.7 | 6.0% | 3 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 78.4 | 14 / 35 | 3069 |
| 2 | 2 | 60.8 | 74.3 | 7 / 35 | 2802 |
| 3 | 2 | 62.1 | 76.5 | 9 / 35 | 2720 |
| 4 | 2 | 61.1 | 75.6 | 8 / 35 | 2887 |
| 5 | 2 | 60.4 | 73.0 | 7 / 35 | 2685 |
| 6 | 2 | 62.3 | 74.3 | 12 / 35 | 3139 |
| 7 | 2 | 60.3 | 71.1 | 12 / 35 | 2505 |
| 8 | 2 | 61.0 | 73.7 | 11 / 35 | 2846 |
| 9 | 2 | 62.0 | 76.5 | 12 / 35 | 2498 |
| 10 | 2 | 62.8 | 77.1 | 14 / 35 | 2869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 111 | 43% |
| lessonz.robocode.Oz 0.5.0 | 33 | 64% |
| ary.Swarm 1.1 | 22 | 77% |
| simonton.nano.MeleeSeed 1.8 | 16 | 81% |
| jsal.Jsalbot 1.0 | 6 | 67% |
| stelo.Mirror 1.1 | 3 | 33% |
| shrub.Silver v048 | 2 | 100% |

Hadur died in 245 of 350 rounds, at a mean tick of 1111. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 93 | 38% | 138 |
| ary.Swarm 1.1 | 53 | 22% | 76 |
| lessonz.robocode.Oz 0.5.0 | 38 | 16% | 53 |
| simonton.nano.MeleeSeed 1.8 | 23 | 9% | 35 |
| zyx.nano.Ant 1.1 | 14 | 6% | 14 |
| shrub.Silver v048 | 13 | 5% | 15 |
| stelo.Mirror 1.1 | 7 | 3% | 11 |
| jsal.Jsalbot 1.0 | 3 | 1% | 7 |
| acogdev.alpha 0.2 | 1 | 0% | 1 |

## Melee bench: F42

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 72.5 | 87 / 350 | 3.47 | 13.8% | 33432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 159 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.1% | 27 |
| hadur117.nano.SanaroHD 0.2 | 3.0 | 13.8% | 87 |
| ara.Shera 0.88 | 3.2 | 14.2% | 62 |
| amz.NanoClone 1.41 | 5.1 | 8.8% | 4 |
| maribo.IotaCT 1.1 | 6.2 | 7.6% | 1 |
| dsw.StaticD 1.0 | 6.7 | 7.3% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.7 | 5.5% | 2 |
| stelo.MirrorMicro 1.0 | 9.0 | 5.8% | 1 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 69.8 | 7 / 35 | 3542 |
| 2 | 3 | 61.5 | 73.0 | 9 / 35 | 3450 |
| 3 | 3 | 61.2 | 73.0 | 10 / 35 | 3357 |
| 4 | 3 | 61.8 | 74.3 | 10 / 35 | 3518 |
| 5 | 4 | 61.1 | 74.6 | 7 / 35 | 3318 |
| 6 | 4 | 55.9 | 60.6 | 4 / 35 | 3002 |
| 7 | 3 | 61.2 | 74.0 | 8 / 35 | 3402 |
| 8 | 3 | 60.6 | 73.0 | 10 / 35 | 3090 |
| 9 | 3 | 62.0 | 75.2 | 9 / 35 | 3417 |
| 10 | 2 | 62.9 | 77.8 | 13 / 35 | 3336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 75 | 45% |
| ara.Shera 0.88 | 42 | 57% |
| maribo.mini.MiniQuester 0.1 | 32 | 81% |
| dsw.StaticD 1.0 | 5 | 40% |
| maribo.IotaCT 1.1 | 2 | 50% |
| amz.NanoClone 1.41 | 1 | 0% |
| stelo.MirrorMicro 1.0 | 1 | 0% |

Hadur died in 266 of 350 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 103 | 39% | 139 |
| ara.Shera 0.88 | 62 | 23% | 82 |
| maribo.mini.MiniQuester 0.1 | 56 | 21% | 80 |
| amz.NanoClone 1.41 | 17 | 6% | 17 |
| dsw.StaticD 1.0 | 9 | 3% | 12 |
| maribo.IotaCT 1.1 | 5 | 2% | 7 |
| mme.NikeEnhanced 2.0 | 5 | 2% | 5 |
| stelo.MirrorMicro 1.0 | 4 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F43

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 61.4 | 25 / 350 | 4.48 | 11.2% | 24696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.2% | 278 |
| brainfade.melee.Dusk 0.44 | 2.4 | 12.8% | 25 |
| dummy.micro.Sparrow 2.5 | 2.9 | 12.4% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.4 | 11.2% | 9 |
| hadur117.nano.SanaroHD 0.2 | 4.5 | 11.2% | 25 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.7% | 3 |
| mz.NanoGod 2.02 | 7.4 | 7.9% | 0 |
| jab.DiamondStealer 5 | 7.6 | 7.4% | 2 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 66.3 | 1 / 35 | 2413 |
| 2 | 4 | 58.0 | 64.1 | 3 / 35 | 2644 |
| 3 | 5 | 56.3 | 59.0 | 3 / 35 | 2416 |
| 4 | 5 | 54.5 | 54.6 | 2 / 35 | 2189 |
| 5 | 5 | 57.4 | 61.6 | 3 / 35 | 2505 |
| 6 | 5 | 55.6 | 57.8 | 0 / 35 | 2304 |
| 7 | 3 | 59.7 | 67.3 | 6 / 35 | 2600 |
| 8 | 4 | 57.1 | 60.3 | 3 / 35 | 2464 |
| 9 | 4 | 58.8 | 65.1 | 2 / 35 | 2761 |
| 10 | 6 | 56.0 | 57.5 | 2 / 35 | 2400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 70 | 19% |
| brainfade.melee.Dusk 0.44 | 9 | 78% |
| dummy.micro.Sparrow 2.5 | 5 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 25% |
| cvt.Firsty 1.0 | 2 | 0% |
| Krabb.akim2.Akim2 1.1b | 2 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 148 | 45% | 160 |
| dummy.micro.Sparrow 2.5 | 42 | 13% | 45 |
| wcsv.melee.EngineerMelee 0.1 | 39 | 12% | 40 |
| brainfade.melee.Dusk 0.44 | 37 | 11% | 45 |
| mz.NanoGod 2.02 | 21 | 6% | 22 |
| Krabb.akim2.Akim2 1.1b | 19 | 6% | 19 |
| jab.DiamondStealer 5 | 15 | 5% | 15 |
| cvt.Firsty 1.0 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 71.8 | 77 / 350 | 3.54 | 13.9% | 33320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.4 | 16.5% | 144 |
| tzu.TheArtOfWar 1.2 | 2.1 | 15.7% | 94 |
| hadur117.nano.SanaroHD 0.2 | 2.5 | 13.9% | 77 |
| wompi.Quokka 1.6 | 4.6 | 10.6% | 8 |
| jwirde.Gort 2.0 | 4.6 | 10.5% | 20 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 9.1% | 3 |
| disan.Chair 2.2.0 | 7.4 | 7.3% | 2 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.1 | 5.0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 71.7 | 8 / 35 | 3147 |
| 2 | 1 | 62.1 | 73.0 | 11 / 35 | 3729 |
| 3 | 3 | 59.2 | 71.1 | 2 / 35 | 2942 |
| 4 | 3 | 60.6 | 71.4 | 6 / 35 | 3168 |
| 5 | 3 | 61.4 | 70.8 | 11 / 35 | 3292 |
| 6 | 1 | 64.5 | 80.0 | 15 / 35 | 3586 |
| 7 | 2 | 61.7 | 71.4 | 9 / 35 | 3523 |
| 8 | 3 | 60.6 | 72.1 | 4 / 35 | 3503 |
| 9 | 3 | 60.1 | 68.9 | 7 / 35 | 3330 |
| 10 | 3 | 59.2 | 67.6 | 4 / 35 | 3100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 70 | 51% |
| tzu.TheArtOfWar 1.2 | 55 | 24% |
| jwirde.Gort 2.0 | 25 | 60% |
| wompi.Quokka 1.6 | 9 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 67% |
| sample.Crazy 1.0 | 2 | 50% |
| disan.Chair 2.2.0 | 1 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 96 | 35% | 135 |
| tzu.TheArtOfWar 1.2 | 92 | 33% | 101 |
| jwirde.Gort 2.0 | 31 | 11% | 44 |
| wompi.Quokka 1.6 | 20 | 7% | 30 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 16 | 6% | 16 |
| stf.PanzerGeneral 0.1 | 7 | 3% | 8 |
| disan.Chair 2.2.0 | 6 | 2% | 6 |
| amk.jointstrike.JointStrike 0.2 | 6 | 2% | 6 |
| sample.Crazy 1.0 | 1 | 0% | 3 |

## Melee bench: F45

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 72.4 | 71 / 350 | 3.49 | 14.6% | 37351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHD 0.2 | 1.2 | 14.6% | 71 |
| eem.IWillFireNoBullet v2.8 | 1.9 | 13.5% | 195 |
| jje.BagPuss 1.2 | 3.1 | 12.4% | 23 |
| sul.Lunar 1.1 | 4.0 | 11.3% | 35 |
| myl.nano.Graviton 1.10 | 5.2 | 10.3% | 6 |
| hvilela.HVilela 0.9 | 6.4 | 9.2% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.4% | 8 |
| fm.claire 1.7 | 7.2 | 8.4% | 1 |
| wit.Deep7 2.0 | 9.1 | 6.3% | 10 |
| abud.ThirdRobo 1.0 | 9.9 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 72.4 | 8 / 35 | 3330 |
| 2 | 1 | 65.7 | 81.6 | 14 / 35 | 4325 |
| 3 | 1 | 61.9 | 72.7 | 7 / 35 | 4067 |
| 4 | 2 | 58.2 | 62.9 | 8 / 35 | 3297 |
| 5 | 1 | 63.6 | 78.7 | 6 / 35 | 4110 |
| 6 | 1 | 63.0 | 75.9 | 6 / 35 | 4191 |
| 7 | 1 | 61.3 | 71.7 | 6 / 35 | 3916 |
| 8 | 1 | 60.8 | 70.8 | 7 / 35 | 3585 |
| 9 | 2 | 58.1 | 66.3 | 6 / 35 | 3040 |
| 10 | 1 | 59.6 | 70.8 | 3 / 35 | 3490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 32% |
| jje.BagPuss 1.2 | 28 | 61% |
| sul.Lunar 1.1 | 22 | 14% |
| myl.nano.Graviton 1.10 | 11 | 82% |
| fm.claire 1.7 | 5 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 100% |
| wit.Deep7 2.0 | 4 | 25% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 279 of 350 rounds, at a mean tick of 1400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 79 | 28% | 0 |
| jje.BagPuss 1.2 | 55 | 20% | 91 |
| sul.Lunar 1.1 | 50 | 18% | 89 |
| myl.nano.Graviton 1.10 | 30 | 11% | 54 |
| hvilela.HVilela 0.9 | 20 | 7% | 33 |
| fm.claire 1.7 | 15 | 5% | 21 |
| pez.mini.ChironexFleckeri 0.5 | 13 | 5% | 24 |
| wit.Deep7 2.0 | 10 | 4% | 24 |
| abud.ThirdRobo 1.0 | 7 | 3% | 12 |

## Melee bench: F46

hadur117.nano.SanaroHD 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 73.0 | 65 / 350 | 3.43 | 13.0% | 26007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.7% | 117 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.9% | 129 |
| hadur117.nano.SanaroHD 0.2 | 2.9 | 13.0% | 65 |
| mz.MicroSheep 1.0 | 4.1 | 10.9% | 12 |
| cx.Princess 1.0 | 5.1 | 9.9% | 23 |
| sadoner.killer 0.2 | 5.8 | 9.0% | 3 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.8% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.3% | 1 |
| kurios.DOSexe .9a | 9.1 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 68.6 | 6 / 35 | 2787 |
| 2 | 3 | 61.4 | 78.4 | 10 / 35 | 2409 |
| 3 | 3 | 61.8 | 76.8 | 11 / 35 | 2818 |
| 4 | 3 | 58.6 | 67.6 | 4 / 35 | 2775 |
| 5 | 3 | 59.1 | 74.0 | 3 / 35 | 2451 |
| 6 | 3 | 57.6 | 69.2 | 6 / 35 | 2089 |
| 7 | 3 | 59.9 | 73.0 | 5 / 35 | 2703 |
| 8 | 3 | 59.6 | 72.7 | 3 / 35 | 2665 |
| 9 | 2 | 62.5 | 78.4 | 11 / 35 | 3074 |
| 10 | 3 | 58.1 | 70.8 | 6 / 35 | 2236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 86 | 45% |
| rsalesc.melee.Medina 0.4.5 | 41 | 39% |
| mz.MicroSheep 1.0 | 9 | 33% |
| cx.Princess 1.0 | 8 | 25% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 112 | 39% | 153 |
| rsalesc.melee.Medina 0.4.5 | 83 | 29% | 100 |
| mz.MicroSheep 1.0 | 32 | 11% | 34 |
| cx.Princess 1.0 | 23 | 8% | 23 |
| arthord.NanoSatanMelee Beta | 16 | 6% | 16 |
| sadoner.killer 0.2 | 9 | 3% | 12 |
| jeremyreeder.collective.Prophet 5 | 5 | 2% | 5 |
| kurios.DOSexe .9a | 3 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 3 |
1 death(s) with no robot to name.

