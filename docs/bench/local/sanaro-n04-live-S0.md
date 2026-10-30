# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 74.8 | 31 / 350 | 3.27 | 14.1% | 37840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.9% | 251 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 14.1% | 31 |
| mz.MicroGodMelee 1 | 3.2 | 12.1% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.4 | 11.1% | 9 |
| lorneswork.Predator 1.0 | 5.0 | 10.4% | 5 |
| sgp.JollyNinja 3.53 | 5.6 | 9.9% | 30 |
| adt.Ar2 1.0 | 6.9 | 7.6% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 75.9 | 1 / 35 | 3834 |
| 2 | 2 | 62.4 | 75.2 | 1 / 35 | 4097 |
| 3 | 2 | 61.7 | 75.9 | 2 / 35 | 3595 |
| 4 | 2 | 62.5 | 74.0 | 1 / 35 | 3990 |
| 5 | 2 | 62.9 | 75.9 | 4 / 35 | 4090 |
| 6 | 2 | 61.3 | 74.9 | 5 / 35 | 3143 |
| 7 | 2 | 62.4 | 76.5 | 6 / 35 | 3893 |
| 8 | 2 | 63.5 | 76.8 | 4 / 35 | 4077 |
| 9 | 2 | 58.9 | 66.3 | 4 / 35 | 3463 |
| 10 | 2 | 62.4 | 76.8 | 3 / 35 | 3658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 149 | 9% |
| sgp.JollyNinja 3.53 | 17 | 47% |
| mz.MicroGodMelee 1 | 16 | 31% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 43% |
| lorneswork.Predator 1.0 | 3 | 67% |

Hadur died in 320 of 350 rounds, at a mean tick of 1184. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 177 | 55% | 191 |
| lorneswork.Predator 1.0 | 35 | 11% | 37 |
| sgp.JollyNinja 3.53 | 34 | 11% | 40 |
| mz.MicroGodMelee 1 | 30 | 9% | 35 |
| simonton.nano.WeekendObsession_Melee 1.0 | 27 | 8% | 29 |
| adt.Ar2 1.0 | 8 | 3% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 1% | 4 |
| skm.butterfly 1.0 | 4 | 1% | 4 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 64.1 | 54 / 350 | 4.23 | 13.5% | 42544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.7 | 14.3% | 97 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 14.4% | 78 |
| hadur117.nano.SanaroS0 0.1 | 2.6 | 13.5% | 54 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.9% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 10.5% | 46 |
| sch.Simone 0.3d | 6.7 | 8.4% | 24 |
| fnc.bandit.Bandit 5.2.0 | 7.1 | 8.0% | 7 |
| Noran.BitchingElk 0.054 | 7.3 | 8.3% | 26 |
| stelo.PatternRobot 1.0 | 8.4 | 7.1% | 11 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 60.0 | 6 / 35 | 3814 |
| 2 | 3 | 58.7 | 62.2 | 6 / 35 | 4146 |
| 3 | 2 | 59.0 | 63.5 | 6 / 35 | 4022 |
| 4 | 3 | 59.6 | 65.4 | 5 / 35 | 4101 |
| 5 | 2 | 60.4 | 65.4 | 6 / 35 | 4584 |
| 6 | 3 | 59.6 | 65.4 | 5 / 35 | 4000 |
| 7 | 3 | 58.9 | 62.2 | 4 / 35 | 4289 |
| 8 | 3 | 60.1 | 62.9 | 4 / 35 | 4584 |
| 9 | 2 | 61.3 | 68.3 | 7 / 35 | 4402 |
| 10 | 2 | 60.6 | 65.4 | 5 / 35 | 4602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 59% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 38 | 32% |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 50% |
| sch.Simone 0.3d | 9 | 44% |
| Noran.BitchingElk 0.054 | 6 | 33% |
| stelo.PatternRobot 1.0 | 4 | 50% |
| fullsail.SweetTea 1.1 | 4 | 0% |
| lrem.micro.SpikeSoldier 0.4 | 1 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 75 | 25% | 87 |
| pulsar.PulsarMax 0.8.9 | 70 | 24% | 92 |
| com.cohesiva.robocode.ManOwaR 1.0 | 35 | 12% | 43 |
| stelo.PatternRobot 1.0 | 30 | 10% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 30 | 10% | 33 |
| sch.Simone 0.3d | 27 | 9% | 30 |
| Noran.BitchingElk 0.054 | 15 | 5% | 17 |
| fnc.bandit.Bandit 5.2.0 | 8 | 3% | 9 |
| fullsail.SweetTea 1.1 | 6 | 2% | 6 |

## Melee bench: F03

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 77.0 | 63 / 350 | 3.07 | 14.7% | 41931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.9 | 14.9% | 99 |
| kawigi.nano.Lib 1.0 | 2.3 | 14.4% | 84 |
| hadur117.nano.SanaroS0 0.1 | 2.3 | 14.7% | 63 |
| vuen.Cake 2.51 | 3.5 | 13.5% | 80 |
| urdos.URDOS 1.3 | 5.0 | 10.3% | 13 |
| adt.Ar1 2.1 | 6.6 | 7.4% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.1 | 7.2% | 5 |
| oa.weak.FlyMk1 0.1 | 7.6 | 6.9% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 6.0% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 76.2 | 8 / 35 | 4457 |
| 2 | 3 | 62.3 | 77.8 | 5 / 35 | 4126 |
| 3 | 3 | 62.1 | 74.6 | 9 / 35 | 4178 |
| 4 | 1 | 62.8 | 78.4 | 7 / 35 | 4143 |
| 5 | 4 | 59.7 | 73.3 | 2 / 35 | 3677 |
| 6 | 1 | 62.9 | 81.0 | 6 / 35 | 4177 |
| 7 | 1 | 63.8 | 80.0 | 7 / 35 | 4603 |
| 8 | 1 | 64.2 | 83.2 | 10 / 35 | 4358 |
| 9 | 4 | 59.3 | 69.8 | 2 / 35 | 4023 |
| 10 | 2 | 61.9 | 75.2 | 7 / 35 | 4189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 62 | 34% |
| radnor.DoctorBob 1.42 | 56 | 46% |
| kawigi.nano.Lib 1.0 | 41 | 5% |
| urdos.URDOS 1.3 | 10 | 70% |
| ghent.ArthurPanzergon 1.0.0 | 5 | 60% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 88 | 31% | 93 |
| radnor.DoctorBob 1.42 | 65 | 23% | 89 |
| vuen.Cake 2.51 | 51 | 18% | 72 |
| urdos.URDOS 1.3 | 44 | 15% | 52 |
| adt.Ar1 2.1 | 13 | 5% | 13 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 3% | 11 |
| oa.weak.FlyMk1 0.1 | 7 | 2% | 9 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 5 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 2% | 4 |

## Melee bench: F04

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 70.0 | 5 / 350 | 3.70 | 13.7% | 44489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 321 |
| hadur117.nano.SanaroS0 0.1 | 2.3 | 13.7% | 5 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.2% | 12 |
| TNT.TNT 0.99.1 | 4.1 | 10.8% | 4 |
| josago.Jorgito 0.16 | 5.4 | 9.0% | 6 |
| css.Delitioner 0.11 | 6.0 | 7.8% | 1 |
| tj.zombie1n 1.0.1 | 6.5 | 7.5% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 66.7 | 0 / 35 | 4116 |
| 2 | 2 | 64.0 | 76.5 | 1 / 35 | 4590 |
| 3 | 2 | 63.7 | 74.0 | 1 / 35 | 5051 |
| 4 | 2 | 63.6 | 74.3 | 1 / 35 | 4615 |
| 5 | 2 | 61.7 | 70.8 | 0 / 35 | 4190 |
| 6 | 3 | 59.0 | 62.2 | 1 / 35 | 3942 |
| 7 | 2 | 61.3 | 67.9 | 1 / 35 | 4393 |
| 8 | 3 | 62.3 | 71.4 | 0 / 35 | 4574 |
| 9 | 3 | 61.5 | 67.9 | 0 / 35 | 4412 |
| 10 | 2 | 61.5 | 68.3 | 0 / 35 | 4606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 108 | 3% |
| apc.LeeroyJenkins2 1.0 | 6 | 17% |
| josago.Jorgito 0.16 | 3 | 33% |
| TNT.TNT 0.99.1 | 2 | 0% |

Hadur died in 345 of 350 rounds, at a mean tick of 1063. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 209 | 61% | 212 |
| apc.LeeroyJenkins2 1.0 | 55 | 16% | 57 |
| josago.Jorgito 0.16 | 31 | 9% | 32 |
| TNT.TNT 0.99.1 | 16 | 5% | 16 |
| css.Delitioner 0.11 | 12 | 3% | 12 |
| tj.zombie1n 1.0.1 | 11 | 3% | 11 |
| rampancy.Durandal 2.1d | 8 | 2% | 7 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.1 | 50 / 350 | 3.96 | 12.7% | 30742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.9% | 100 |
| origin.SleepSiphon 1.7b | 2.0 | 15.0% | 107 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.4 | 12.7% | 53 |
| hadur117.nano.SanaroS0 0.1 | 3.5 | 12.7% | 50 |
| mld.Wisdom 1.0 | 4.9 | 10.9% | 20 |
| spinnercat.Omen 1.0 | 6.6 | 7.9% | 6 |
| gg.Wolverine 2.0 | 6.6 | 8.1% | 6 |
| DBall.NUKE 0.1 | 8.3 | 7.0% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.8% | 9 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 67.3 | 5 / 35 | 3169 |
| 2 | 3 | 60.5 | 70.5 | 8 / 35 | 3061 |
| 3 | 4 | 57.4 | 65.7 | 2 / 35 | 2911 |
| 4 | 3 | 59.7 | 69.5 | 7 / 35 | 3164 |
| 5 | 5 | 56.4 | 63.5 | 3 / 35 | 2693 |
| 6 | 3 | 57.4 | 63.2 | 5 / 35 | 3047 |
| 7 | 4 | 58.6 | 67.9 | 4 / 35 | 3078 |
| 8 | 4 | 58.6 | 65.1 | 5 / 35 | 3271 |
| 9 | 3 | 60.5 | 70.2 | 6 / 35 | 3334 |
| 10 | 3 | 59.0 | 68.3 | 5 / 35 | 3014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 46 | 43% |
| origin.SleepSiphon 1.7b | 39 | 28% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 28% |
| gg.Wolverine 2.0 | 6 | 100% |
| mld.Wisdom 1.0 | 5 | 20% |
| DBall.NUKE 0.1 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 33% |
| spinnercat.Omen 1.0 | 2 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 102 | 34% | 117 |
| origin.SleepSiphon 1.7b | 70 | 23% | 80 |
| pe.minimelee.SandboxMiniMelee 1.1 | 59 | 19% | 67 |
| mld.Wisdom 1.0 | 35 | 12% | 38 |
| spinnercat.Omen 1.0 | 13 | 4% | 14 |
| gg.Wolverine 2.0 | 11 | 4% | 14 |
| sample.Fire 1.0 | 5 | 2% | 5 |
| DBall.NUKE 0.1 | 4 | 1% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 1% | 6 |

## Melee bench: F07

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.1 | 98 / 350 | 2.88 | 16.3% | 48958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.3 | 18.2% | 111 |
| rtk.Tachikoma 1.0 | 2.1 | 17.0% | 82 |
| hadur117.nano.SanaroS0 0.1 | 2.6 | 16.3% | 98 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 12.1% | 29 |
| franzor.Lizt 1.3.1 | 5.0 | 11.1% | 29 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 81.6 | 11 / 35 | 5040 |
| 2 | 3 | 66.7 | 78.1 | 11 / 35 | 4580 |
| 3 | 3 | 67.7 | 81.0 | 13 / 35 | 4879 |
| 4 | 3 | 67.6 | 80.6 | 12 / 35 | 5240 |
| 5 | 3 | 66.3 | 80.6 | 5 / 35 | 4855 |
| 6 | 3 | 66.0 | 79.7 | 10 / 35 | 4571 |
| 7 | 3 | 66.7 | 80.3 | 10 / 35 | 4965 |
| 8 | 1 | 66.8 | 80.3 | 11 / 35 | 4988 |
| 9 | 2 | 66.6 | 79.4 | 9 / 35 | 5085 |
| 10 | 3 | 64.3 | 69.8 | 6 / 35 | 4755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 86 | 65% |
| rsalesc.melee.Monk 0.3.6c | 53 | 19% |
| oog.melee.CapuletDroid 1.1 | 33 | 67% |
| franzor.Lizt 1.3.1 | 13 | 46% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 0% |

Hadur died in 252 of 350 rounds, at a mean tick of 1247. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 96 | 38% | 155 |
| rsalesc.melee.Monk 0.3.6c | 95 | 38% | 110 |
| oog.melee.CapuletDroid 1.1 | 37 | 15% | 59 |
| franzor.Lizt 1.3.1 | 9 | 4% | 4 |
| lrem.micro.MoggFanatic 0.2 | 7 | 3% | 9 |
| exauge.GateKeeper 1.1.121g | 6 | 2% | 9 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 2 |
| drd.Dreadknoght 0.9 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 68.3 | 65 / 350 | 3.85 | 13.3% | 33422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 1.8 | 14.1% | 97 |
| tm.Yuugao 1.0 | 1.9 | 14.2% | 104 |
| hadur117.nano.SanaroS0 0.1 | 2.4 | 13.3% | 65 |
| Krabb.sliNk.Garm 0.9u | 4.7 | 10.6% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.8% | 24 |
| m3thos.Eva00 1.1 | 5.9 | 9.3% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 6.4 | 8.8% | 16 |
| SHAM.WOW 1.4 | 8.5 | 6.9% | 5 |
| zyx.nano.BacillusComma 1.0 | 9.1 | 6.3% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.3 | 6.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 66.7 | 6 / 35 | 3215 |
| 2 | 2 | 62.1 | 75.2 | 12 / 35 | 3443 |
| 3 | 3 | 57.8 | 64.4 | 6 / 35 | 3272 |
| 4 | 4 | 53.9 | 55.6 | 3 / 35 | 3289 |
| 5 | 2 | 60.4 | 74.0 | 4 / 35 | 3375 |
| 6 | 2 | 62.0 | 75.6 | 9 / 35 | 3567 |
| 7 | 2 | 62.0 | 77.5 | 7 / 35 | 3400 |
| 8 | 2 | 57.0 | 63.8 | 5 / 35 | 3334 |
| 9 | 1 | 59.9 | 69.5 | 8 / 35 | 3434 |
| 10 | 3 | 55.9 | 61.0 | 5 / 35 | 3093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 56 | 39% |
| shrub.Vapour v159 | 33 | 21% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 69% |
| com.spp.robocode.MostlyHarmless 010 | 13 | 38% |
| Krabb.sliNk.Garm 0.9u | 12 | 92% |
| m3thos.Eva00 1.1 | 12 | 58% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 84 | 29% | 114 |
| shrub.Vapour v159 | 67 | 23% | 72 |
| Krabb.sliNk.Garm 0.9u | 31 | 11% | 36 |
| com.spp.robocode.MostlyHarmless 010 | 30 | 10% | 40 |
| jwst.DAD.DarkAndDarker 1.1 | 23 | 8% | 29 |
| m3thos.Eva00 1.1 | 23 | 8% | 28 |
| zyx.nano.BacillusComma 1.0 | 15 | 5% | 16 |
| SHAM.WOW 1.4 | 8 | 3% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 59.6 | 21 / 350 | 4.64 | 11.5% | 29918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 18.2% | 194 |
| kc.micro.Figment 1.0 | 1.9 | 15.0% | 71 |
| yagami.Tidus 0.11 | 3.7 | 11.6% | 4 |
| hadur117.nano.SanaroS0 0.1 | 4.0 | 11.5% | 21 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.5% | 23 |
| mc2.enemy.Original 0.9 | 5.7 | 9.4% | 27 |
| dft.Calliope 5.6 | 6.9 | 7.7% | 8 |
| step.nanoPri 1.0 | 8.6 | 5.7% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.9 | 5.6% | 1 |
| rdm.Dueler 0.4x | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.0 | 58.4 | 1 / 35 | 2860 |
| 2 | 5 | 54.2 | 54.0 | 1 / 35 | 2965 |
| 3 | 5 | 56.5 | 60.3 | 0 / 35 | 3109 |
| 4 | 5 | 53.9 | 55.6 | 1 / 35 | 2652 |
| 5 | 4 | 57.4 | 64.8 | 2 / 35 | 2870 |
| 6 | 4 | 55.2 | 57.1 | 2 / 35 | 3025 |
| 7 | 3 | 56.1 | 60.0 | 1 / 35 | 3034 |
| 8 | 3 | 58.6 | 64.4 | 5 / 35 | 3171 |
| 9 | 3 | 58.8 | 64.1 | 5 / 35 | 3451 |
| 10 | 4 | 54.8 | 57.1 | 3 / 35 | 2781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 53 | 28% |
| kc.micro.Figment 1.0 | 21 | 19% |
| mc2.enemy.Original 0.9 | 6 | 0% |
| pedersen.Grishnakh 1.0 | 4 | 0% |
| yagami.Tidus 0.11 | 3 | 67% |

Hadur died in 329 of 350 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 103 | 31% | 118 |
| kc.micro.Figment 1.0 | 74 | 22% | 77 |
| yagami.Tidus 0.11 | 50 | 15% | 52 |
| mc2.enemy.Original 0.9 | 35 | 11% | 35 |
| pedersen.Grishnakh 1.0 | 30 | 9% | 32 |
| robar.nano.Assertive_Melee 0.2 | 16 | 5% | 16 |
| step.nanoPri 1.0 | 9 | 3% | 9 |
| dft.Calliope 5.6 | 9 | 3% | 9 |
| rdm.Dueler 0.4x | 3 | 1% | 2 |

## Melee bench: F10

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.9 | 95 / 350 | 2.90 | 15.4% | 42340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.3 | 15.4% | 95 |
| DTF.Kludgy 1.2b | 1.9 | 14.7% | 89 |
| ne.Chimera 1.2 | 3.3 | 13.3% | 55 |
| ejb.Polaris 1.0.1 | 3.5 | 13.1% | 49 |
| tvv.micro.Antares 1.1.1 | 5.4 | 10.7% | 34 |
| vStar.RAFzilla 2.15 | 5.6 | 10.8% | 21 |
| sam.Samspin 1.0 | 7.5 | 6.3% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.7 | 5.5% | 3 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 77.1 | 7 / 35 | 4360 |
| 2 | 1 | 62.6 | 77.8 | 9 / 35 | 3883 |
| 3 | 1 | 62.5 | 76.8 | 8 / 35 | 3951 |
| 4 | 1 | 65.3 | 84.1 | 11 / 35 | 4535 |
| 5 | 1 | 64.2 | 78.4 | 9 / 35 | 4520 |
| 6 | 1 | 66.0 | 84.8 | 12 / 35 | 4791 |
| 7 | 2 | 63.3 | 78.1 | 8 / 35 | 4170 |
| 8 | 2 | 63.2 | 77.5 | 10 / 35 | 3988 |
| 9 | 1 | 64.0 | 78.4 | 12 / 35 | 4341 |
| 10 | 2 | 61.9 | 75.6 | 9 / 35 | 3801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 60 | 43% |
| ejb.Polaris 1.0.1 | 48 | 71% |
| ne.Chimera 1.2 | 30 | 17% |
| vStar.RAFzilla 2.15 | 24 | 58% |
| tvv.micro.Antares 1.1.1 | 24 | 29% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 4 | 75% |
| sam.Samspin 1.0 | 3 | 0% |

Hadur died in 260 of 350 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 83 | 32% | 101 |
| ne.Chimera 1.2 | 76 | 29% | 85 |
| tvv.micro.Antares 1.1.1 | 32 | 12% | 34 |
| ejb.Polaris 1.0.1 | 29 | 11% | 66 |
| vStar.RAFzilla 2.15 | 17 | 7% | 32 |
| sam.Samspin 1.0 | 8 | 3% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 3% | 8 |
| kurios.DOSexe .9b | 4 | 2% | 10 |
| donjezza.Muncho 1.0 | 3 | 1% | 4 |

## Melee bench: F11

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 63.2 | 52 / 350 | 4.31 | 12.4% | 31740 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.2% | 139 |
| cx.mini.Nimrod 0.55 | 2.4 | 13.1% | 53 |
| hadur117.nano.SanaroS0 0.1 | 2.9 | 12.4% | 52 |
| djc.DynaBot 0.1.1 | 4.0 | 11.3% | 32 |
| br2.MobyDickBot 1.6 | 5.4 | 9.6% | 30 |
| rdt199.Warlord 0.73 | 6.1 | 9.5% | 22 |
| uji.YellohFellah 1.0 | 6.3 | 9.3% | 27 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 63.8 | 4 / 35 | 3050 |
| 2 | 3 | 56.8 | 61.0 | 6 / 35 | 3063 |
| 3 | 5 | 54.7 | 54.9 | 7 / 35 | 2983 |
| 4 | 3 | 55.3 | 58.4 | 3 / 35 | 3002 |
| 5 | 3 | 58.0 | 66.7 | 3 / 35 | 3151 |
| 6 | 3 | 58.3 | 63.8 | 5 / 35 | 3324 |
| 7 | 2 | 57.9 | 64.8 | 2 / 35 | 3527 |
| 8 | 2 | 60.0 | 68.6 | 8 / 35 | 3546 |
| 9 | 3 | 56.0 | 60.0 | 5 / 35 | 2842 |
| 10 | 2 | 60.1 | 69.8 | 9 / 35 | 3252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 60 | 53% |
| cx.mini.Nimrod 0.55 | 12 | 50% |
| uji.YellohFellah 1.0 | 10 | 20% |
| djc.DynaBot 0.1.1 | 9 | 67% |
| br2.MobyDickBot 1.6 | 7 | 0% |
| rdt199.Warlord 0.73 | 6 | 83% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 99 | 33% | 125 |
| cx.mini.Nimrod 0.55 | 62 | 21% | 67 |
| rdt199.Warlord 0.73 | 32 | 11% | 36 |
| br2.MobyDickBot 1.6 | 25 | 8% | 27 |
| djc.DynaBot 0.1.1 | 23 | 8% | 32 |
| uji.YellohFellah 1.0 | 18 | 6% | 22 |
| KiraNL.Chupacabra 0.4 | 17 | 6% | 18 |
| stelo.MirrorNano 1.3 | 12 | 4% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 3% | 11 |

## Melee bench: F12

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 10 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 65.2 | 46 / 350 | 4.13 | 12.4% | 28597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.6 | 14.4% | 81 |
| nat.PallasHawk 1.0 | 2.5 | 13.8% | 96 |
| darkcanuck.Leon 1.01 | 2.7 | 13.9% | 78 |
| hadur117.nano.SanaroS0 0.1 | 3.4 | 12.4% | 46 |
| brainfade.melee.Genghis 0.36 | 4.8 | 11.1% | 26 |
| jrm.Test0 1.0 | 6.6 | 8.1% | 5 |
| jp.Perpy 16.0 | 7.1 | 7.6% | 5 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.5% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 11 |
| stuff.Vlad 0.1 | 9.6 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.9 | 72.1 | 6 / 35 | 3036 |
| 2 | 3 | 58.4 | 69.5 | 3 / 35 | 2825 |
| 3 | 4 | 57.7 | 67.6 | 3 / 35 | 2849 |
| 4 | 4 | 58.7 | 64.4 | 6 / 35 | 2916 |
| 5 | 4 | 55.3 | 60.3 | 4 / 35 | 2563 |
| 6 | 4 | 57.3 | 64.1 | 3 / 35 | 2979 |
| 7 | 4 | 57.4 | 64.1 | 5 / 35 | 2919 |
| 8 | 3 | 56.9 | 63.2 | 6 / 35 | 2884 |
| 9 | 3 | 58.9 | 67.3 | 8 / 35 | 3030 |
| 10 | 4 | 54.6 | 59.4 | 2 / 35 | 2596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 41 | 20% |
| bts.wiki.RipCurl 0.9b | 38 | 55% |
| nat.PallasHawk 1.0 | 34 | 24% |
| brainfade.melee.Genghis 0.36 | 12 | 50% |
| jaybot.bots.Oddball 4.0 | 4 | 0% |
| stuff.Vlad 0.1 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 0% |

Hadur died in 305 of 350 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 83 | 27% | 92 |
| darkcanuck.Leon 1.01 | 66 | 22% | 77 |
| bts.wiki.RipCurl 0.9b | 53 | 17% | 76 |
| brainfade.melee.Genghis 0.36 | 34 | 11% | 34 |
| jrm.Test0 1.0 | 20 | 7% | 20 |
| jp.Perpy 16.0 | 15 | 5% | 15 |
| jaybot.bots.Oddball 4.0 | 15 | 5% | 15 |
| cs.sheldor.Talon 1.1 | 12 | 4% | 13 |
| stuff.Vlad 0.1 | 7 | 2% | 8 |

## Melee bench: F13

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 70.4 | 33 / 350 | 3.66 | 12.9% | 32591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.2% | 169 |
| ags.Glacier 0.2.11 | 1.6 | 16.8% | 95 |
| hadur117.nano.SanaroS0 0.1 | 3.4 | 12.9% | 33 |
| shinh.Entangled 0.3 | 4.0 | 12.5% | 32 |
| gh.micro.Gruweltje 0.7 | 4.6 | 12.0% | 21 |
| apc.Colossus2 0.17 | 6.1 | 8.3% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.6% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 74.9 | 6 / 35 | 3233 |
| 2 | 5 | 58.4 | 65.7 | 3 / 35 | 3128 |
| 3 | 3 | 60.7 | 71.4 | 4 / 35 | 3480 |
| 4 | 3 | 60.9 | 74.0 | 4 / 35 | 3407 |
| 5 | 5 | 58.7 | 66.7 | 4 / 35 | 3007 |
| 6 | 3 | 61.0 | 71.7 | 3 / 35 | 3495 |
| 7 | 3 | 58.0 | 67.9 | 1 / 35 | 3018 |
| 8 | 3 | 60.6 | 72.4 | 1 / 35 | 3504 |
| 9 | 3 | 59.4 | 70.5 | 4 / 35 | 3160 |
| 10 | 3 | 59.0 | 68.9 | 3 / 35 | 3159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 67 | 21% |
| ags.Glacier 0.2.11 | 49 | 12% |
| shinh.Entangled 0.3 | 17 | 35% |
| gh.micro.Gruweltje 0.7 | 4 | 50% |
| stelo.Wang 1.0 | 3 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |

Hadur died in 317 of 350 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 107 | 34% | 122 |
| ags.Glacier 0.2.11 | 93 | 29% | 98 |
| shinh.Entangled 0.3 | 42 | 13% | 48 |
| gh.micro.Gruweltje 0.7 | 36 | 11% | 38 |
| stelo.Wang 1.0 | 23 | 7% | 26 |
| apc.Colossus2 0.17 | 7 | 2% | 7 |
| maribo.FollowFire 1 | 4 | 1% | 4 |
| ayk.WallHugger 1.0 | 3 | 1% | 5 |
| sample.Tracker 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.4 | 74 / 350 | 3.30 | 14.1% | 35152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.9% | 158 |
| hadur117.nano.SanaroS0 0.1 | 2.1 | 14.1% | 74 |
| catcat20.shape.Theta 0.018 | 3.1 | 11.8% | 47 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.3% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 5.4 | 10.1% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 10.1% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 6.1 | 9.8% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 8.3% | 18 |
| pa.Improved 1.0 | 9.0 | 5.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 74.9 | 9 / 35 | 3320 |
| 2 | 2 | 64.3 | 83.2 | 10 / 35 | 3629 |
| 3 | 2 | 62.8 | 77.5 | 7 / 35 | 3618 |
| 4 | 2 | 61.7 | 75.2 | 7 / 35 | 3508 |
| 5 | 3 | 58.2 | 65.7 | 7 / 35 | 3029 |
| 6 | 2 | 62.5 | 76.5 | 6 / 35 | 3852 |
| 7 | 2 | 61.9 | 75.2 | 8 / 35 | 3556 |
| 8 | 2 | 60.7 | 70.8 | 6 / 35 | 3579 |
| 9 | 2 | 62.5 | 75.2 | 7 / 35 | 3872 |
| 10 | 2 | 60.2 | 70.2 | 7 / 35 | 3189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 86 | 33% |
| catcat20.shape.Theta 0.018 | 36 | 53% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 55% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 33% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 38% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 57% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 127 | 46% | 159 |
| catcat20.shape.Theta 0.018 | 34 | 12% | 52 |
| sanyi.mikrobi.Roberto 1.0 | 30 | 11% | 36 |
| dmh.robocode.robot.RedDwarf 0.4 | 30 | 11% | 32 |
| Lo_Ian.Gandalf_V4 4.0 | 21 | 8% | 23 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 5% | 22 |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 5% | 15 |
| pa.Improved 1.0 | 4 | 1% | 7 |
| sample.TrackFire 1.0 | 2 | 1% | 2 |

## Melee bench: F15

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 63.7 | 40 / 350 | 4.27 | 12.8% | 36954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 15.3% | 91 |
| emp.Yngwie 1.11 | 2.2 | 13.6% | 104 |
| mld.DustBunny 3.8 | 3.4 | 12.8% | 31 |
| hadur117.nano.SanaroS0 0.1 | 3.5 | 12.8% | 40 |
| cb.nano.Insomnia 1.0 | 5.3 | 11.0% | 27 |
| kawigi.robot.Girl 1.2 | 5.4 | 10.7% | 50 |
| Grystrion.TrackerWO 1.0 | 7.2 | 7.2% | 3 |
| lambdaxy.TBot 0.1 | 8.1 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 8.9 | 5.5% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 65.7 | 7 / 35 | 3859 |
| 2 | 4 | 58.2 | 62.5 | 4 / 35 | 3745 |
| 3 | 4 | 57.7 | 62.5 | 2 / 35 | 3588 |
| 4 | 5 | 56.7 | 61.3 | 3 / 35 | 3524 |
| 5 | 4 | 55.7 | 57.1 | 2 / 35 | 3474 |
| 6 | 2 | 60.5 | 66.0 | 7 / 35 | 4130 |
| 7 | 3 | 59.3 | 66.7 | 5 / 35 | 3589 |
| 8 | 4 | 59.1 | 62.9 | 4 / 35 | 3808 |
| 9 | 4 | 56.7 | 60.3 | 2 / 35 | 3506 |
| 10 | 2 | 60.6 | 72.1 | 4 / 35 | 3731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 43 | 30% |
| emp.Yngwie 1.11 | 23 | 35% |
| mld.DustBunny 3.8 | 16 | 6% |
| kawigi.robot.Girl 1.2 | 12 | 33% |
| cb.nano.Insomnia 1.0 | 11 | 91% |
| divineomega.TrialBot 0.003 | 4 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 69 | 22% | 78 |
| mld.DustBunny 3.8 | 57 | 18% | 66 |
| emp.Yngwie 1.11 | 52 | 17% | 68 |
| cb.nano.Insomnia 1.0 | 47 | 15% | 44 |
| kawigi.robot.Girl 1.2 | 41 | 13% | 45 |
| divineomega.TrialBot 0.003 | 16 | 5% | 20 |
| Grystrion.TrackerWO 1.0 | 12 | 4% | 13 |
| lambdaxy.TBot 0.1 | 12 | 4% | 12 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 4 | 1% | 4 |

## Melee bench: F16

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 62.9 | 32 / 350 | 4.34 | 12.8% | 38862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.6% | 158 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 15.4% | 34 |
| hadur117.nano.SanaroS0 0.1 | 3.1 | 12.8% | 32 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.2% | 73 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.9% | 23 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.4% | 9 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.9% | 12 |
| repositorio.NanoStep 1.0 | 8.9 | 5.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.3% | 8 |
| asd.Cthulhu 1.3 | 9.1 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.1 | 60.3 | 1 / 35 | 3690 |
| 2 | 3 | 57.8 | 60.6 | 3 / 35 | 3609 |
| 3 | 3 | 59.2 | 65.1 | 5 / 35 | 3681 |
| 4 | 3 | 58.3 | 62.2 | 3 / 35 | 3929 |
| 5 | 4 | 56.1 | 54.9 | 3 / 35 | 3705 |
| 6 | 3 | 59.1 | 66.0 | 1 / 35 | 3687 |
| 7 | 4 | 56.6 | 55.6 | 2 / 35 | 3908 |
| 8 | 2 | 61.7 | 71.1 | 4 / 35 | 4263 |
| 9 | 3 | 61.5 | 68.3 | 6 / 35 | 4101 |
| 10 | 3 | 60.3 | 65.1 | 4 / 35 | 4289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 59 | 5% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 28 | 68% |
| techdude.forest.FlamingForest 1.1 | 13 | 23% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| tvv.nano.Polaris 1.2 | 4 | 0% |
| stelo.IntrinsicVolatility 1.4 | 2 | 0% |
| divineomega.DivineBot 1.9.4.5 | 2 | 0% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 318 of 350 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 130 | 41% | 137 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 81 | 25% | 94 |
| bvh.fnr.Fenrir 0.36l | 34 | 11% | 38 |
| techdude.forest.FlamingForest 1.1 | 27 | 8% | 31 |
| divineomega.DivineBot 1.9.4.5 | 12 | 4% | 13 |
| asd.Cthulhu 1.3 | 12 | 4% | 12 |
| tvv.nano.Polaris 1.2 | 11 | 3% | 12 |
| stelo.IntrinsicVolatility 1.4 | 10 | 3% | 11 |
| repositorio.NanoStep 1.0 | 1 | 0% | 2 |

## Melee bench: F17

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 63.7 | 55 / 350 | 4.26 | 12.8% | 36807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.3 | 14.8% | 86 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.4% | 74 |
| cx.BlestPain 1.41 | 2.9 | 13.0% | 61 |
| hadur117.nano.SanaroS0 0.1 | 3.8 | 12.8% | 55 |
| ahf.NanoAndrew .4 | 5.1 | 11.8% | 41 |
| nic.Nicator 2.4 | 5.2 | 11.6% | 30 |
| maribo.melee.BMV 0.1 | 7.0 | 8.8% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.4% | 0 |
| tex.Longbot 0.4 | 8.6 | 5.2% | 0 |
| goblin.Bender 2.4 | 9.9 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.1 | 61.3 | 4 / 35 | 3310 |
| 2 | 3 | 59.9 | 67.0 | 4 / 35 | 3913 |
| 3 | 3 | 59.0 | 63.5 | 6 / 35 | 3580 |
| 4 | 4 | 58.6 | 62.9 | 6 / 35 | 3726 |
| 5 | 4 | 59.6 | 63.2 | 9 / 35 | 3959 |
| 6 | 5 | 56.2 | 57.1 | 2 / 35 | 3511 |
| 7 | 4 | 60.4 | 65.7 | 9 / 35 | 3569 |
| 8 | 3 | 59.3 | 66.3 | 5 / 35 | 3698 |
| 9 | 5 | 55.9 | 56.5 | 4 / 35 | 3525 |
| 10 | 2 | 62.4 | 74.0 | 6 / 35 | 4016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 42 | 17% |
| cx.BlestPain 1.41 | 29 | 79% |
| oog.melee.Mercutio 1.0 | 22 | 59% |
| nic.Nicator 2.4 | 14 | 29% |
| ahf.NanoAndrew .4 | 8 | 50% |
| maribo.melee.BMV 0.1 | 2 | 50% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 84 | 28% | 93 |
| ahf.NanoAndrew .4 | 48 | 16% | 53 |
| nic.Nicator 2.4 | 46 | 16% | 51 |
| oog.melee.Mercutio 1.0 | 44 | 15% | 57 |
| cx.BlestPain 1.41 | 40 | 14% | 60 |
| maribo.melee.BMV 0.1 | 21 | 7% | 22 |
| tex.Longbot 0.4 | 6 | 2% | 6 |
| goblin.Bender 2.4 | 4 | 1% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 1% | 4 |

## Melee bench: F18

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 68.8 | 66 / 350 | 3.81 | 13.5% | 34800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.2 | 14.3% | 95 |
| hadur117.nano.SanaroS0 0.1 | 1.9 | 13.5% | 66 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.5% | 69 |
| uji.DBH 1.1 | 4.8 | 11.1% | 34 |
| spinnercat.Robovirus 2.718 | 5.0 | 10.5% | 23 |
| ratosh.Nobo 0.21 | 5.3 | 10.5% | 15 |
| sigterm.Sigterm 1.0 | 7.0 | 8.9% | 28 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.4% | 11 |
| stelo.WangRobot 1.0 | 8.9 | 6.0% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.9 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 68.3 | 6 / 35 | 3564 |
| 2 | 2 | 60.1 | 71.7 | 7 / 35 | 3297 |
| 3 | 3 | 58.1 | 65.1 | 7 / 35 | 3410 |
| 4 | 1 | 61.8 | 74.3 | 9 / 35 | 3755 |
| 5 | 1 | 60.9 | 73.0 | 6 / 35 | 3662 |
| 6 | 2 | 59.2 | 67.3 | 7 / 35 | 3569 |
| 7 | 2 | 59.1 | 68.6 | 5 / 35 | 3197 |
| 8 | 2 | 59.7 | 68.3 | 8 / 35 | 3442 |
| 9 | 2 | 57.9 | 64.4 | 6 / 35 | 3460 |
| 10 | 2 | 58.3 | 67.3 | 5 / 35 | 3444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 42 | 45% |
| agd.Mooserwirt2 2.7 | 33 | 36% |
| uji.DBH 1.1 | 18 | 28% |
| spinnercat.Robovirus 2.718 | 18 | 67% |
| sigterm.Sigterm 1.0 | 15 | 60% |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 44% |
| ratosh.Nobo 0.21 | 9 | 44% |
| stelo.WangRobot 1.0 | 3 | 0% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 92 | 32% | 114 |
| agd.Mooserwirt2 2.7 | 48 | 17% | 63 |
| uji.DBH 1.1 | 32 | 11% | 37 |
| spinnercat.Robovirus 2.718 | 27 | 9% | 32 |
| ratosh.Nobo 0.21 | 25 | 9% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 24 | 8% | 28 |
| sigterm.Sigterm 1.0 | 18 | 6% | 23 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 11 | 4% | 12 |
| stelo.WangRobot 1.0 | 10 | 3% | 12 |

## Melee bench: F19

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.0 | 107 / 350 | 2.71 | 16.1% | 41798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.9 | 16.1% | 107 |
| mld.Infinity 2.2 | 2.0 | 15.9% | 108 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.1 | 15.7% | 90 |
| erdnis.Rover 0.3 | 4.4 | 10.8% | 11 |
| krillr.mini.JointStrike 2.0.0 | 4.6 | 10.9% | 13 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.7% | 6 |
| pac.ABC 2.1 | 7.1 | 7.5% | 12 |
| mbh.Mbh 0.1 | 7.7 | 7.1% | 2 |
| pbg.R2D2 1.0 | 8.9 | 6.2% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 77.5 | 9 / 35 | 3934 |
| 2 | 1 | 66.2 | 84.1 | 15 / 35 | 3991 |
| 3 | 1 | 66.1 | 83.2 | 13 / 35 | 3971 |
| 4 | 1 | 67.1 | 84.8 | 12 / 35 | 4655 |
| 5 | 2 | 66.0 | 82.5 | 6 / 35 | 4784 |
| 6 | 1 | 66.6 | 81.9 | 13 / 35 | 4494 |
| 7 | 3 | 64.6 | 79.0 | 10 / 35 | 3952 |
| 8 | 2 | 65.9 | 81.6 | 12 / 35 | 4088 |
| 9 | 3 | 64.0 | 75.6 | 6 / 35 | 4297 |
| 10 | 3 | 64.6 | 80.3 | 11 / 35 | 3632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 102 | 56% |
| davidalves.net.DuelistMiniMelee 1.2 | 70 | 24% |
| krillr.mini.JointStrike 2.0.0 | 18 | 56% |
| pac.ABC 2.1 | 13 | 46% |
| patson.PatsonTestBot 1.0 | 11 | 73% |
| erdnis.Rover 0.3 | 10 | 80% |
| pbg.R2D2 1.0 | 2 | 50% |
| mbh.Mbh 0.1 | 1 | 0% |

Hadur died in 243 of 350 rounds, at a mean tick of 1081. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 35% | 148 |
| mld.Infinity 2.2 | 64 | 26% | 36 |
| krillr.mini.JointStrike 2.0.0 | 30 | 12% | 44 |
| erdnis.Rover 0.3 | 22 | 9% | 35 |
| patson.PatsonTestBot 1.0 | 21 | 9% | 36 |
| pac.ABC 2.1 | 11 | 5% | 18 |
| pbg.R2D2 1.0 | 5 | 2% | 16 |
| mbh.Mbh 0.1 | 4 | 2% | 13 |

## Melee bench: F20

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 66.4 | 52 / 350 | 4.02 | 13.1% | 35519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 18.5% | 171 |
| hadur117.nano.SanaroS0 0.1 | 2.3 | 13.1% | 52 |
| fwb.Nine 1.0.1 | 3.1 | 11.9% | 48 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.5% | 18 |
| catcat20.Rabbit 0.001 | 5.7 | 9.5% | 26 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.9% | 10 |
| djdjdj.NanoSkunk10 1.0 | 6.6 | 8.7% | 9 |
| bayen.nut.Squirrel 1.615 | 7.3 | 8.0% | 14 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 67.9 | 6 / 35 | 3557 |
| 2 | 2 | 59.8 | 68.3 | 5 / 35 | 3894 |
| 3 | 2 | 60.4 | 69.5 | 11 / 35 | 3363 |
| 4 | 2 | 61.4 | 73.0 | 6 / 35 | 3571 |
| 5 | 2 | 61.0 | 70.8 | 7 / 35 | 3570 |
| 6 | 2 | 61.1 | 73.3 | 2 / 35 | 3575 |
| 7 | 2 | 58.7 | 63.5 | 5 / 35 | 3659 |
| 8 | 3 | 56.5 | 59.7 | 3 / 35 | 3519 |
| 9 | 4 | 55.2 | 57.8 | 3 / 35 | 3187 |
| 10 | 2 | 57.6 | 60.6 | 4 / 35 | 3624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 67 | 40% |
| fwb.Nine 1.0.1 | 31 | 48% |
| catcat20.Rabbit 0.001 | 10 | 40% |
| nz.jdc.nano.GridFu 1.0 | 7 | 29% |
| m3thos.mini.Eva01 0.5.5 | 7 | 29% |
| djdjdj.NanoSkunk10 1.0 | 3 | 0% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 123 | 41% | 140 |
| fwb.Nine 1.0.1 | 49 | 16% | 50 |
| nz.jdc.nano.GridFu 1.0 | 39 | 13% | 44 |
| bayen.nut.Squirrel 1.615 | 21 | 7% | 25 |
| djdjdj.NanoSkunk10 1.0 | 21 | 7% | 24 |
| catcat20.Rabbit 0.001 | 19 | 6% | 30 |
| m3thos.mini.Eva01 0.5.5 | 18 | 6% | 23 |
| ntc.ControlledChaos 1.1.4 | 8 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F21

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 76.6 | 113 / 350 | 3.11 | 15.9% | 45175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.4 | 16.8% | 137 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 15.9% | 113 |
| dummy.mini.Scimitar 1.01 | 2.6 | 15.1% | 33 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.3% | 39 |
| eld.Hmm 1.0 | 5.3 | 8.9% | 26 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.7% | 5 |
| el.JumpShoot 0.2 | 7.7 | 6.0% | 2 |
| fire219.CatBot 1.0 | 7.9 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.2 | 15 / 35 | 4473 |
| 2 | 1 | 65.8 | 76.5 | 16 / 35 | 4774 |
| 3 | 2 | 64.5 | 76.5 | 7 / 35 | 4628 |
| 4 | 3 | 60.8 | 67.3 | 7 / 35 | 3994 |
| 5 | 2 | 65.8 | 78.1 | 10 / 35 | 5108 |
| 6 | 1 | 66.9 | 84.4 | 16 / 35 | 4460 |
| 7 | 3 | 62.2 | 67.0 | 8 / 35 | 4588 |
| 8 | 2 | 65.2 | 78.7 | 10 / 35 | 4730 |
| 9 | 2 | 64.2 | 75.6 | 12 / 35 | 4348 |
| 10 | 3 | 64.5 | 78.4 | 12 / 35 | 4072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 105 | 57% |
| dummy.mini.Scimitar 1.01 | 35 | 77% |
| cf.RiO.RiOx 4.2.1 | 21 | 43% |
| eld.Hmm 1.0 | 18 | 56% |
| oa.weak.BotherBot 0.1 | 8 | 75% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 85 | 36% | 123 |
| dummy.mini.Scimitar 1.01 | 69 | 29% | 110 |
| cf.RiO.RiOx 4.2.1 | 45 | 19% | 53 |
| eld.Hmm 1.0 | 11 | 5% | 25 |
| oa.weak.BotherBot 0.1 | 10 | 4% | 20 |
| PSW.Relentless 0.1 | 9 | 4% | 9 |
| el.JumpShoot 0.2 | 5 | 2% | 6 |
| fire219.CatBot 1.0 | 3 | 1% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 79.0 | 83 / 350 | 2.89 | 15.4% | 38401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.2% | 151 |
| hadur117.nano.SanaroS0 0.1 | 2.5 | 15.4% | 83 |
| cre.Karolos 0.32 | 2.5 | 15.0% | 72 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.5% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 9.2% | 4 |
| stelo.RamTrackSurfer 1.2 | 6.3 | 9.0% | 3 |
| sample.Walls 1.0 | 6.4 | 9.0% | 14 |
| cw.megas.Blade 0.8 | 7.4 | 8.1% | 4 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 80.0 | 11 / 35 | 3665 |
| 2 | 2 | 65.6 | 83.2 | 9 / 35 | 3798 |
| 3 | 3 | 63.5 | 74.6 | 8 / 35 | 3631 |
| 4 | 3 | 64.7 | 78.4 | 10 / 35 | 3550 |
| 5 | 3 | 63.9 | 77.5 | 6 / 35 | 4046 |
| 6 | 3 | 65.9 | 83.8 | 7 / 35 | 3851 |
| 7 | 2 | 64.6 | 77.8 | 8 / 35 | 3972 |
| 8 | 2 | 63.7 | 75.6 | 8 / 35 | 3976 |
| 9 | 3 | 63.3 | 73.7 | 5 / 35 | 3642 |
| 10 | 2 | 67.1 | 85.1 | 11 / 35 | 4270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 88 | 38% |
| cre.Karolos 0.32 | 56 | 23% |
| stelo.AreaTargetingBot 1.1 | 23 | 52% |
| sample.Walls 1.0 | 23 | 61% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 80% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 100 | 37% | 135 |
| cre.Karolos 0.32 | 79 | 30% | 98 |
| stelo.AreaTargetingBot 1.1 | 46 | 17% | 51 |
| sample.Walls 1.0 | 17 | 6% | 22 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 3% | 14 |
| stelo.RamTrackSurfer 1.2 | 8 | 3% | 18 |
| cw.megas.Blade 0.8 | 7 | 3% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.9 | 58.4 | 50 / 350 | 4.74 | 11.3% | 27599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.4 | 14.8% | 85 |
| florent.XSeries.X2 0.12 | 2.5 | 13.4% | 62 |
| davidalves.Phoenix 0.54 | 3.1 | 13.2% | 76 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.2% | 46 |
| hadur117.nano.SanaroS0 0.1 | 4.4 | 11.3% | 50 |
| oog.melee.Corsair 1.0 | 6.1 | 9.6% | 14 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.8% | 19 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.5% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 5.1% | 0 |
| evd.X1 0.01 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 62.2 | 6 / 35 | 3082 |
| 2 | 5 | 51.6 | 52.4 | 3 / 35 | 2342 |
| 3 | 5 | 53.3 | 55.9 | 3 / 35 | 2637 |
| 4 | 5 | 54.0 | 54.6 | 7 / 35 | 2804 |
| 5 | 4 | 55.5 | 59.4 | 7 / 35 | 2866 |
| 6 | 5 | 55.2 | 57.8 | 5 / 35 | 2814 |
| 7 | 5 | 53.1 | 55.2 | 3 / 35 | 2583 |
| 8 | 4 | 56.4 | 62.9 | 5 / 35 | 2835 |
| 9 | 2 | 57.9 | 65.1 | 4 / 35 | 3119 |
| 10 | 5 | 55.6 | 58.7 | 7 / 35 | 2517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 47% |
| davidalves.Phoenix 0.54 | 18 | 72% |
| florent.XSeries.X2 0.12 | 17 | 59% |
| pedersen.Ugluk 1.1.1 | 12 | 75% |
| stelo.SoJNanoMelee 1.1 | 10 | 20% |
| oog.melee.Corsair 1.0 | 5 | 40% |

Hadur died in 302 of 350 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 71 | 24% | 83 |
| florent.XSeries.X2 0.12 | 53 | 18% | 63 |
| pedersen.Ugluk 1.1.1 | 53 | 18% | 60 |
| davidalves.Phoenix 0.54 | 48 | 16% | 58 |
| stelo.SoJNanoMelee 1.1 | 25 | 8% | 25 |
| oog.melee.Corsair 1.0 | 22 | 7% | 29 |
| lunchie.Lunchbox 0.93 | 15 | 5% | 17 |
| as.FrankTheTank 1.3 | 7 | 2% | 7 |
| evd.X1 0.01 | 7 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 64.5 | 53 / 350 | 4.20 | 12.5% | 28965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 1.9 | 13.5% | 68 |
| voidious.mini.BrokenSword 2.0.3 | 1.9 | 13.9% | 68 |
| jdw.Hurricane 1.4 | 3.0 | 12.8% | 70 |
| hadur117.nano.SanaroS0 0.1 | 3.5 | 12.5% | 53 |
| gre.svman4.Morfeas 1.4.1 | 4.8 | 11.4% | 43 |
| ds.Oo 2.2 | 6.6 | 8.8% | 16 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.6% | 25 |
| awesomeness.Elite 1.0 | 7.9 | 7.5% | 5 |
| adt.Ar2 1.1 | 8.6 | 6.7% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 74.9 | 5 / 35 | 3441 |
| 2 | 1 | 61.3 | 72.4 | 9 / 35 | 3150 |
| 3 | 5 | 55.0 | 59.4 | 5 / 35 | 2524 |
| 4 | 4 | 56.9 | 65.1 | 3 / 35 | 2925 |
| 5 | 5 | 54.6 | 57.5 | 3 / 35 | 2766 |
| 6 | 4 | 58.5 | 66.7 | 8 / 35 | 2811 |
| 7 | 4 | 59.0 | 67.6 | 6 / 35 | 2927 |
| 8 | 3 | 56.2 | 61.3 | 2 / 35 | 3067 |
| 9 | 4 | 55.4 | 60.0 | 5 / 35 | 2576 |
| 10 | 4 | 56.1 | 60.0 | 7 / 35 | 2778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 42 | 38% |
| voidious.micro.BlitzBat 1.05 | 28 | 18% |
| jdw.Hurricane 1.4 | 21 | 71% |
| gre.svman4.Morfeas 1.4.1 | 17 | 59% |
| gjr.Cephalosporin 0.1 | 8 | 13% |
| ds.Oo 2.2 | 5 | 40% |
| awesomeness.Elite 1.0 | 2 | 100% |
| adt.Ar2 1.1 | 1 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 75 | 25% | 85 |
| voidious.mini.BrokenSword 2.0.3 | 69 | 23% | 84 |
| jdw.Hurricane 1.4 | 46 | 15% | 53 |
| gjr.Cephalosporin 0.1 | 31 | 10% | 34 |
| gre.svman4.Morfeas 1.4.1 | 30 | 10% | 37 |
| ds.Oo 2.2 | 15 | 5% | 18 |
| awesomeness.Elite 1.0 | 14 | 5% | 18 |
| adt.Ar2 1.1 | 12 | 4% | 14 |
| amk.ChumbaMini 0.2 | 5 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 69.1 | 41 / 350 | 3.78 | 13.4% | 39524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.2% | 141 |
| hadur117.nano.SanaroS0 0.1 | 2.6 | 13.4% | 41 |
| lrem.Spectre 0.4.4 | 3.0 | 12.9% | 54 |
| shu.nitro.LENIN .T34 | 3.7 | 12.4% | 62 |
| gh.mini.GrubbmOne 1.0 | 5.3 | 11.1% | 20 |
| js.PinBall 1.6 | 5.6 | 10.7% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.4% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 7.9 | 7.0% | 7 |
| sample.SpinBot 1.0 | 9.0 | 5.3% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 78.4 | 5 / 35 | 4256 |
| 2 | 3 | 59.8 | 66.7 | 5 / 35 | 4064 |
| 3 | 3 | 60.0 | 66.7 | 4 / 35 | 4060 |
| 4 | 3 | 59.1 | 64.4 | 5 / 35 | 3875 |
| 5 | 2 | 60.7 | 69.5 | 6 / 35 | 3888 |
| 6 | 3 | 59.7 | 66.3 | 4 / 35 | 3827 |
| 7 | 3 | 58.2 | 63.5 | 2 / 35 | 3756 |
| 8 | 3 | 60.7 | 71.1 | 4 / 35 | 3706 |
| 9 | 2 | 61.8 | 71.7 | 4 / 35 | 4190 |
| 10 | 2 | 61.1 | 72.7 | 2 / 35 | 3902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 60 | 8% |
| lrem.Spectre 0.4.4 | 34 | 53% |
| shu.nitro.LENIN .T34 | 28 | 39% |
| gh.mini.GrubbmOne 1.0 | 6 | 0% |
| js.PinBall 1.6 | 6 | 50% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 50% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 0% |

Hadur died in 310 of 350 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 115 | 37% | 122 |
| lrem.Spectre 0.4.4 | 46 | 15% | 58 |
| gh.mini.GrubbmOne 1.0 | 41 | 13% | 42 |
| shu.nitro.LENIN .T34 | 40 | 13% | 52 |
| js.PinBall 1.6 | 25 | 8% | 29 |
| jaybot.adv.bots.JayBot 2.0 | 23 | 7% | 25 |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 3% | 13 |
| sample.SpinBot 1.0 | 9 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 57.5 | 45 / 350 | 4.83 | 11.7% | 33592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.1 | 15.9% | 141 |
| wee.Gem 1.8.4 | 2.9 | 12.3% | 76 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 12.2% | 47 |
| hadur117.nano.SanaroS0 0.1 | 3.6 | 11.7% | 45 |
| EH.Eagle 1.0.6 | 4.3 | 11.3% | 24 |
| joe.ADinosaur 1.0 | 6.6 | 8.6% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.7% | 7 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.8% | 4 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.8% | 4 |
| cs.Grudge 1.0 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 49.9 | 36.2 | 3 / 35 | 4011 |
| 2 | 2 | 60.8 | 75.6 | 9 / 35 | 2854 |
| 3 | 5 | 53.8 | 45.1 | 2 / 35 | 4115 |
| 4 | 3 | 55.6 | 51.4 | 1 / 35 | 4389 |
| 5 | 4 | 56.5 | 66.0 | 3 / 35 | 2548 |
| 6 | 2 | 58.4 | 67.3 | 7 / 35 | 2981 |
| 7 | 1 | 59.9 | 71.7 | 5 / 35 | 3193 |
| 8 | 4 | 54.8 | 60.0 | 5 / 35 | 2611 |
| 9 | 2 | 59.7 | 71.1 | 8 / 35 | 3024 |
| 10 | 7 | 47.2 | 30.5 | 2 / 35 | 3866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 49 | 51% |
| wee.Gem 1.8.4 | 22 | 14% |
| EH.Eagle 1.0.6 | 16 | 69% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 22% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 2 | 50% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 307 of 350 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 90 | 29% | 117 |
| wee.Gem 1.8.4 | 46 | 15% | 49 |
| sheldor.melee.nano.TestMelee 0.1 | 34 | 11% | 39 |
| EH.Eagle 1.0.6 | 32 | 10% | 39 |
| joe.ADinosaur 1.0 | 30 | 10% | 30 |
| cs.Grudge 1.0 | 30 | 10% | 29 |
| caimano.Furia_Ceca 0.22 | 16 | 5% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 14 | 5% | 16 |
| throxbot.ThroxBot 0.1 | 14 | 5% | 14 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.1 | 106 / 350 | 3.06 | 15.2% | 35389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.4 | 15.9% | 109 |
| hadur117.nano.SanaroS0 0.1 | 1.7 | 15.2% | 106 |
| uji.Antique 1.0 | 3.4 | 12.3% | 68 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 11.2% | 32 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.7% | 16 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.6% | 8 |
| ahr.ice.Ice 1.0.2 | 6.9 | 8.0% | 6 |
| matt.advanced.Katana 1.0 | 8.1 | 6.8% | 4 |
| stelo.PianistNano 1.2 | 9.2 | 5.8% | 1 |
| stelo.Lifestealer 1.0 | 9.4 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 73.3 | 11 / 35 | 3369 |
| 2 | 1 | 65.0 | 83.5 | 12 / 35 | 3779 |
| 3 | 2 | 63.9 | 79.4 | 14 / 35 | 3527 |
| 4 | 2 | 61.2 | 70.5 | 11 / 35 | 3375 |
| 5 | 2 | 64.6 | 81.9 | 13 / 35 | 3787 |
| 6 | 2 | 61.8 | 74.3 | 6 / 35 | 3689 |
| 7 | 1 | 63.6 | 76.8 | 12 / 35 | 3724 |
| 8 | 2 | 62.3 | 77.1 | 9 / 35 | 3291 |
| 9 | 2 | 61.0 | 74.3 | 7 / 35 | 3262 |
| 10 | 1 | 64.0 | 80.0 | 11 / 35 | 3586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 115 | 50% |
| uji.Antique 1.0 | 45 | 51% |
| qohnil.blot.BlotBot 3.61 | 20 | 45% |
| pfvicm.Sobieski 7.2.3b | 10 | 50% |
| matt.advanced.Katana 1.0 | 6 | 67% |
| ahr.ice.Ice 1.0.2 | 6 | 50% |
| amk.ChumbaWumba 0.3 | 5 | 80% |

Hadur died in 245 of 350 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 96 | 39% | 137 |
| uji.Antique 1.0 | 45 | 18% | 66 |
| pfvicm.Sobieski 7.2.3b | 35 | 14% | 42 |
| amk.ChumbaWumba 0.3 | 22 | 9% | 26 |
| qohnil.blot.BlotBot 3.61 | 21 | 9% | 34 |
| ahr.ice.Ice 1.0.2 | 9 | 4% | 17 |
| stelo.Lifestealer 1.0 | 7 | 3% | 8 |
| matt.advanced.Katana 1.0 | 5 | 2% | 16 |
| stelo.PianistNano 1.2 | 4 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 62.5 | 38 / 350 | 4.38 | 12.5% | 33516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.3 | 16.2% | 111 |
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 15.9% | 119 |
| hadur117.nano.SanaroS0 0.1 | 3.7 | 12.5% | 38 |
| myl.micro.Troodon 1.10 | 3.7 | 12.9% | 30 |
| jok.PheonixM 0.1.2 | 4.7 | 11.2% | 17 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.1% | 1 |
| DBall.Anarchy 0.1 | 6.6 | 8.2% | 29 |
| fullsail.TimbotNoPrediction 1.0 | 8.5 | 5.4% | 0 |
| jangs.ns51 1.0 | 9.1 | 4.9% | 2 |
| ap.Frederick 1.1 | 9.4 | 4.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 67.9 | 6 / 35 | 3302 |
| 2 | 4 | 62.4 | 71.1 | 5 / 35 | 3811 |
| 3 | 3 | 60.5 | 67.0 | 6 / 35 | 3378 |
| 4 | 3 | 60.5 | 66.7 | 6 / 35 | 3504 |
| 5 | 4 | 55.9 | 56.2 | 1 / 35 | 3408 |
| 6 | 4 | 54.8 | 54.0 | 3 / 35 | 3340 |
| 7 | 4 | 57.6 | 61.9 | 3 / 35 | 3125 |
| 8 | 4 | 58.2 | 63.8 | 1 / 35 | 3232 |
| 9 | 5 | 54.4 | 53.7 | 2 / 35 | 3061 |
| 10 | 3 | 58.4 | 62.5 | 5 / 35 | 3355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 38 | 13% |
| zyx.mega.YersiniaPestis 3.1 | 32 | 47% |
| myl.micro.Troodon 1.10 | 19 | 58% |
| DBall.Anarchy 0.1 | 8 | 25% |
| jok.PheonixM 0.1.2 | 8 | 63% |
| ap.Frederick 1.1 | 1 | 0% |

Hadur died in 314 of 350 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 112 | 36% | 119 |
| zyx.mega.YersiniaPestis 3.1 | 74 | 24% | 87 |
| myl.micro.Troodon 1.10 | 40 | 13% | 49 |
| jok.PheonixM 0.1.2 | 37 | 12% | 42 |
| fullsail.TimbotNoPrediction 1.0 | 17 | 5% | 17 |
| DBall.Anarchy 0.1 | 14 | 4% | 17 |
| ph.melee.ArcherME 0.3 | 13 | 4% | 14 |
| jangs.ns51 1.0 | 5 | 2% | 5 |
| ap.Frederick 1.1 | 1 | 0% | 0 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.5 | 54.9 | 25 / 350 | 5.06 | 10.5% | 28159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 2.3 | 13.9% | 61 |
| catcat20.Matcha 0.006 | 2.3 | 13.9% | 91 |
| darkcanuck.B26354 1.06 | 2.4 | 13.8% | 92 |
| oog.melee.Capulet 1.2 | 3.0 | 13.2% | 49 |
| hadur117.nano.SanaroS0 0.1 | 5.1 | 10.5% | 25 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.1% | 18 |
| tripphippy.Alice 1.1 | 7.8 | 7.8% | 5 |
| ntc.Opposite 1.5 | 7.9 | 7.7% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.5% | 9 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.8 | 61.6 | 4 / 35 | 3196 |
| 2 | 5 | 53.3 | 54.0 | 4 / 35 | 2561 |
| 3 | 5 | 54.6 | 56.2 | 3 / 35 | 2763 |
| 4 | 5 | 53.8 | 56.2 | 1 / 35 | 3056 |
| 5 | 6 | 50.0 | 46.3 | 2 / 35 | 2822 |
| 6 | 5 | 52.9 | 53.0 | 2 / 35 | 2785 |
| 7 | 5 | 52.6 | 54.6 | 1 / 35 | 2656 |
| 8 | 5 | 55.3 | 59.7 | 2 / 35 | 2831 |
| 9 | 5 | 54.6 | 56.5 | 5 / 35 | 2818 |
| 10 | 5 | 51.3 | 51.1 | 1 / 35 | 2671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 21 | 24% |
| stelo.PastFuture 2.3.2 | 15 | 80% |
| darkcanuck.B26354 1.06 | 15 | 7% |
| oog.melee.Capulet 1.2 | 14 | 29% |
| tripphippy.Alice 1.1 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 2 | 0% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 325 of 350 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 74 | 23% | 85 |
| darkcanuck.B26354 1.06 | 61 | 19% | 62 |
| catcat20.Matcha 0.006 | 56 | 17% | 60 |
| oog.melee.Capulet 1.2 | 47 | 14% | 54 |
| fowl3628800.LightningBolt 2.6.0 | 27 | 8% | 27 |
| ntc.Opposite 1.5 | 22 | 7% | 22 |
| tripphippy.Alice 1.1 | 20 | 6% | 21 |
| intruder.PrairieWolf 2.61 | 15 | 5% | 16 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.5 | 55.2 | 12 / 350 | 5.03 | 10.5% | 27411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.1% | 203 |
| gh.mini.Griezel 0.2 | 2.3 | 13.3% | 72 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 11.9% | 21 |
| d414.nano.Quantum 1.0.0 | 3.6 | 11.7% | 28 |
| hadur117.nano.SanaroS0 0.1 | 5.0 | 10.5% | 12 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.4% | 5 |
| timmit.nano.TimDog 0.33 | 6.9 | 7.6% | 5 |
| fm.mammillarias 1.3 | 8.5 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.2% | 2 |
| tlp.ThreeLeggedPig 1 | 9.2 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.1 | 58.1 | 0 / 35 | 2929 |
| 2 | 5 | 53.2 | 54.0 | 2 / 35 | 2704 |
| 3 | 5 | 51.6 | 51.4 | 2 / 35 | 2347 |
| 4 | 7 | 48.7 | 46.0 | 1 / 35 | 2332 |
| 5 | 5 | 53.7 | 54.0 | 0 / 35 | 3026 |
| 6 | 3 | 58.4 | 67.3 | 1 / 35 | 3319 |
| 7 | 5 | 52.3 | 53.3 | 1 / 35 | 2651 |
| 8 | 6 | 53.3 | 53.0 | 3 / 35 | 2556 |
| 9 | 4 | 55.7 | 60.0 | 2 / 35 | 2824 |
| 10 | 5 | 53.3 | 54.6 | 0 / 35 | 2723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 35 | 23% |
| gh.mini.Griezel 0.2 | 28 | 4% |
| d414.nano.Quantum 1.0.0 | 6 | 17% |
| spinnercat.micro.Tyger 0.1 | 4 | 25% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |

Hadur died in 338 of 350 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 84 | 25% | 92 |
| gh.mini.Griezel 0.2 | 77 | 23% | 78 |
| spinnercat.micro.Tyger 0.1 | 62 | 18% | 63 |
| d414.nano.Quantum 1.0.0 | 45 | 13% | 47 |
| gh.nano.Grofvuil 0.2 | 23 | 7% | 23 |
| timmit.nano.TimDog 0.33 | 20 | 6% | 20 |
| fm.mammillarias 1.3 | 15 | 4% | 15 |
| Gecko.ultimateGeckoBot 1.0 | 9 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 3 |

## Melee bench: F32

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 75.7 | 101 / 350 | 3.19 | 14.8% | 36959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.4% | 112 |
| hadur117.nano.SanaroS0 0.1 | 1.6 | 14.8% | 101 |
| apc.botM 3.0 | 3.5 | 12.2% | 49 |
| vjik.UnViolation 1.1 | 3.9 | 11.4% | 45 |
| lxx.ConceptA 0.8 | 4.8 | 10.9% | 8 |
| bayen.UbaMicro 1.4 | 6.1 | 9.2% | 10 |
| yk.JahMicro 1.0 | 7.7 | 7.4% | 17 |
| panzer.Panzer 0.2 | 7.8 | 7.1% | 1 |
| conscience.Electron 1.3g | 8.4 | 6.4% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.1% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 75.2 | 11 / 35 | 3936 |
| 2 | 1 | 64.6 | 81.0 | 12 / 35 | 3970 |
| 3 | 2 | 63.0 | 79.0 | 10 / 35 | 3810 |
| 4 | 2 | 60.9 | 74.0 | 7 / 35 | 3626 |
| 5 | 2 | 61.2 | 74.6 | 12 / 35 | 3251 |
| 6 | 1 | 61.6 | 75.6 | 9 / 35 | 3653 |
| 7 | 2 | 60.7 | 71.4 | 10 / 35 | 3355 |
| 8 | 1 | 64.3 | 78.7 | 14 / 35 | 4153 |
| 9 | 1 | 63.3 | 79.4 | 10 / 35 | 3795 |
| 10 | 2 | 58.6 | 67.6 | 6 / 35 | 3410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 79 | 38% |
| apc.botM 3.0 | 34 | 62% |
| vjik.UnViolation 1.1 | 27 | 41% |
| bayen.UbaMicro 1.4 | 15 | 73% |
| lxx.ConceptA 0.8 | 14 | 79% |
| yk.JahMicro 1.0 | 12 | 67% |
| panzer.Panzer 0.2 | 7 | 100% |
| conscience.Electron 1.3g | 2 | 50% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 250 of 350 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 77 | 31% | 110 |
| lxx.ConceptA 0.8 | 48 | 19% | 53 |
| apc.botM 3.0 | 39 | 16% | 61 |
| vjik.UnViolation 1.1 | 31 | 12% | 47 |
| bayen.UbaMicro 1.4 | 25 | 10% | 32 |
| yk.JahMicro 1.0 | 10 | 4% | 18 |
| panzer.Panzer 0.2 | 9 | 4% | 12 |
| conscience.Electron 1.3g | 8 | 3% | 11 |
| donjezza.Jezza 1.0 | 3 | 1% | 6 |

## Melee bench: F33

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 65.0 | 42 / 350 | 4.15 | 13.1% | 36635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.1% | 150 |
| hadur117.nano.SanaroS0 0.1 | 2.8 | 13.1% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 13.0% | 53 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.7% | 37 |
| labg.Cataclysm 2.05 | 4.2 | 11.6% | 50 |
| baal.nano.N 1.42 | 6.4 | 8.9% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.4% | 13 |
| zyx.micro.Ant 1.1 | 8.3 | 5.8% | 2 |
| sanja.First 0.1 | 8.9 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 72.7 | 6 / 35 | 3829 |
| 2 | 4 | 59.0 | 63.8 | 2 / 35 | 3437 |
| 3 | 2 | 61.8 | 70.2 | 7 / 35 | 3926 |
| 4 | 2 | 61.3 | 71.1 | 3 / 35 | 3912 |
| 5 | 2 | 61.9 | 70.2 | 6 / 35 | 4031 |
| 6 | 4 | 55.8 | 57.8 | 3 / 35 | 3129 |
| 7 | 2 | 59.6 | 64.8 | 5 / 35 | 3653 |
| 8 | 4 | 56.6 | 58.1 | 3 / 35 | 3499 |
| 9 | 4 | 56.9 | 59.0 | 3 / 35 | 3453 |
| 10 | 2 | 58.9 | 62.9 | 4 / 35 | 3766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 49 | 31% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 36% |
| gre.svman4.Leonidas 1.3.2 | 18 | 61% |
| labg.Cataclysm 2.05 | 11 | 27% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 33% |
| baal.nano.N 1.42 | 2 | 50% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 123 | 40% | 134 |
| gre.svman4.Leonidas 1.3.2 | 54 | 17% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 14% | 55 |
| labg.Cataclysm 2.05 | 39 | 13% | 41 |
| kinsen.melee.Angsaichmophobia 1.8c | 24 | 8% | 26 |
| zyx.micro.Ant 1.1 | 11 | 4% | 13 |
| baal.nano.N 1.42 | 9 | 3% | 10 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 2% | 5 |
| sanja.First 0.1 | 3 | 1% | 3 |

## Melee bench: F34

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.2 | 47 / 350 | 3.59 | 13.9% | 38975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 17.3% | 128 |
| stelo.Spread 0.9 | 1.7 | 17.0% | 122 |
| hadur117.nano.SanaroS0 0.1 | 3.1 | 13.9% | 47 |
| jcs.Seth 1.8 | 4.3 | 11.6% | 27 |
| tcf.Reach 3 | 4.7 | 11.1% | 18 |
| cli.Dancer 1.1 | 5.9 | 9.9% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.7% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 4.7% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.9 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.4 | 73.3 | 7 / 35 | 4259 |
| 2 | 3 | 62.2 | 72.7 | 8 / 35 | 3707 |
| 3 | 3 | 64.4 | 76.5 | 6 / 35 | 4366 |
| 4 | 3 | 60.5 | 68.6 | 2 / 35 | 3848 |
| 5 | 3 | 62.6 | 73.7 | 6 / 35 | 3998 |
| 6 | 3 | 61.1 | 69.2 | 3 / 35 | 3739 |
| 7 | 4 | 60.2 | 67.3 | 5 / 35 | 3288 |
| 8 | 3 | 62.4 | 72.1 | 4 / 35 | 3963 |
| 9 | 3 | 62.1 | 70.8 | 3 / 35 | 4147 |
| 10 | 3 | 61.0 | 67.9 | 3 / 35 | 3660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 63 | 48% |
| kid.Gladiator .7.2 | 52 | 6% |
| jcs.Seth 1.8 | 14 | 71% |
| tcf.Reach 3 | 7 | 14% |
| cli.Dancer 1.1 | 3 | 33% |
| ratosh.Wesco 1.4 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 129 | 42% | 134 |
| stelo.Spread 0.9 | 89 | 29% | 116 |
| tcf.Reach 3 | 32 | 11% | 33 |
| jcs.Seth 1.8 | 29 | 10% | 39 |
| cli.Dancer 1.1 | 15 | 5% | 16 |
| ratosh.Wesco 1.4 | 7 | 2% | 9 |
| sample.VelociRobot 1.0 | 2 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 65.5 | 17 / 350 | 4.11 | 12.0% | 28038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 276 |
| gh.mini.Gruwel 0.9 | 2.1 | 13.6% | 34 |
| hadur117.nano.SanaroS0 0.1 | 3.9 | 12.0% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.9 | 12.1% | 16 |
| rz.HawkOnFire 0.1 | 4.1 | 12.0% | 5 |
| wit.Chuliath 1.0 | 6.4 | 7.1% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 7.1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.9 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 4.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 66.0 | 1 / 35 | 3166 |
| 2 | 5 | 56.0 | 60.0 | 0 / 35 | 2712 |
| 3 | 3 | 59.8 | 72.1 | 3 / 35 | 2897 |
| 4 | 3 | 60.3 | 72.7 | 3 / 35 | 2931 |
| 5 | 3 | 58.8 | 67.9 | 4 / 35 | 2906 |
| 6 | 5 | 53.9 | 56.5 | 1 / 35 | 2657 |
| 7 | 3 | 58.1 | 67.0 | 1 / 35 | 2713 |
| 8 | 5 | 57.4 | 62.5 | 1 / 35 | 3070 |
| 9 | 4 | 57.8 | 67.3 | 2 / 35 | 2318 |
| 10 | 5 | 56.2 | 62.9 | 1 / 35 | 2668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 73 | 4% |
| gh.mini.Gruwel 0.9 | 15 | 20% |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 50% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 333 of 350 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 137 | 41% | 139 |
| gh.mini.Gruwel 0.9 | 65 | 20% | 68 |
| rz.HawkOnFire 0.1 | 48 | 14% | 53 |
| dmh.robocode.robot.BlackDeath 9.2 | 46 | 14% | 53 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 14 | 4% | 14 |
| myl.nano.KomoriNinja 1.1 | 9 | 3% | 9 |
| wit.Chuliath 1.0 | 8 | 2% | 8 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 71.2 | 113 / 350 | 3.59 | 14.6% | 36467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.0 | 14.6% | 113 |
| alpha.RainingFire 1.0 | 2.9 | 12.8% | 53 |
| bzdp.Pansy 2.1 | 3.4 | 12.1% | 44 |
| mz.Cork 0.1 | 3.5 | 12.3% | 49 |
| bvh.micro.Freya 0.3 | 4.7 | 11.0% | 33 |
| m3thos.Eva02 0.7.1 | 5.9 | 10.1% | 28 |
| bvh.mini.Fenrir 0.39 | 6.6 | 9.3% | 9 |
| dl.BetterWalls 1.0 | 8.3 | 6.9% | 5 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.8% | 4 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.6 | 65.7 | 9 / 35 | 3570 |
| 2 | 1 | 58.6 | 64.1 | 7 / 35 | 3659 |
| 3 | 1 | 61.5 | 68.3 | 14 / 35 | 3897 |
| 4 | 1 | 61.6 | 71.7 | 12 / 35 | 3583 |
| 5 | 1 | 62.6 | 74.9 | 15 / 35 | 3474 |
| 6 | 1 | 62.3 | 74.9 | 11 / 35 | 3484 |
| 7 | 1 | 62.5 | 73.3 | 13 / 35 | 3777 |
| 8 | 1 | 62.3 | 73.7 | 11 / 35 | 3678 |
| 9 | 1 | 63.4 | 77.8 | 12 / 35 | 3732 |
| 10 | 1 | 60.2 | 67.6 | 9 / 35 | 3613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 38 | 63% |
| bzdp.Pansy 2.1 | 37 | 76% |
| bvh.micro.Freya 0.3 | 27 | 74% |
| bvh.mini.Fenrir 0.39 | 22 | 91% |
| alpha.RainingFire 1.0 | 17 | 53% |
| m3thos.Eva02 0.7.1 | 10 | 40% |
| dl.BetterWalls 1.0 | 5 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 50% |
| sample.MyFirstRobot 1.0 | 3 | 33% |

Hadur died in 237 of 350 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 44 | 19% | 57 |
| bzdp.Pansy 2.1 | 42 | 18% | 73 |
| m3thos.Eva02 0.7.1 | 39 | 16% | 46 |
| mz.Cork 0.1 | 38 | 16% | 57 |
| bvh.micro.Freya 0.3 | 31 | 13% | 44 |
| bvh.mini.Fenrir 0.39 | 26 | 11% | 36 |
| squidM.TentalceMeleeNano 1.1 | 10 | 4% | 14 |
| sample.MyFirstRobot 1.0 | 5 | 2% | 8 |
| dl.BetterWalls 1.0 | 2 | 1% | 13 |

## Melee bench: F37

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 77.1 | 133 / 350 | 3.06 | 15.5% | 43702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.0 | 15.5% | 133 |
| germ.TheMind .2 | 2.9 | 11.7% | 52 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 11.2% | 28 |
| EBBU.Sim2 1.02 | 4.7 | 10.1% | 20 |
| agrach.Dalek 1.0 | 4.8 | 10.0% | 37 |
| mb.Beast 0.1 | 6.4 | 9.0% | 29 |
| lmk.ACPFinal 0.1 | 6.6 | 8.8% | 13 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.7% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 8.9 | 7.6% | 0 |
| skm.Ryubot 1.0 | 9.2 | 7.4% | 10 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 80.0 | 18 / 35 | 4369 |
| 2 | 1 | 64.4 | 83.5 | 14 / 35 | 4696 |
| 3 | 1 | 61.5 | 72.7 | 11 / 35 | 4466 |
| 4 | 1 | 64.7 | 82.2 | 14 / 35 | 4917 |
| 5 | 1 | 60.5 | 72.7 | 11 / 35 | 4028 |
| 6 | 1 | 60.0 | 70.5 | 12 / 35 | 4074 |
| 7 | 1 | 59.3 | 69.5 | 9 / 35 | 4055 |
| 8 | 1 | 62.0 | 79.4 | 15 / 35 | 3487 |
| 9 | 1 | 63.6 | 79.4 | 14 / 35 | 4600 |
| 10 | 1 | 64.6 | 81.3 | 15 / 35 | 5010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 44 | 43% |
| mb.Beast 0.1 | 33 | 70% |
| com.syncleus.robocode.Dreadnaught 0.1 | 30 | 70% |
| EBBU.Sim2 1.02 | 25 | 64% |
| stelo.UntouchableNano 1.3 | 24 | 79% |
| agrach.Dalek 1.0 | 21 | 81% |
| lmk.ACPFinal 0.1 | 12 | 75% |
| skm.Ryubot 1.0 | 11 | 55% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 222 of 350 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 59 | 27% | 71 |
| agrach.Dalek 1.0 | 26 | 12% | 49 |
| mb.Beast 0.1 | 26 | 12% | 48 |
| EBBU.Sim2 1.02 | 25 | 11% | 36 |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 11% | 49 |
| lmk.ACPFinal 0.1 | 18 | 8% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 8% | 19 |
| stelo.UntouchableNano 1.3 | 16 | 7% | 29 |
| skm.Ryubot 1.0 | 10 | 5% | 18 |

## Melee bench: F38

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 62.0 | 32 / 350 | 4.42 | 11.7% | 29544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.1% | 162 |
| bvh.mini.Freya 0.55 | 2.2 | 13.5% | 47 |
| hadur117.nano.SanaroS0 0.1 | 3.8 | 11.7% | 32 |
| cs.Wren 1.0 | 4.3 | 11.5% | 18 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.5% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.9 | 10.3% | 17 |
| kdf.KoulDestroyer 1.0 | 6.5 | 9.9% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.8% | 5 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.6% | 2 |
| bzdp.BoxCar 2.0 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.5 | 61.6 | 0 / 35 | 2843 |
| 2 | 3 | 58.0 | 65.1 | 2 / 35 | 3172 |
| 3 | 4 | 57.6 | 64.4 | 6 / 35 | 2977 |
| 4 | 3 | 57.0 | 61.9 | 5 / 35 | 2982 |
| 5 | 6 | 52.1 | 53.3 | 0 / 35 | 2607 |
| 6 | 4 | 57.1 | 64.4 | 4 / 35 | 3041 |
| 7 | 3 | 57.3 | 64.1 | 4 / 35 | 2849 |
| 8 | 5 | 56.5 | 62.2 | 2 / 35 | 2910 |
| 9 | 2 | 58.5 | 65.4 | 5 / 35 | 3271 |
| 10 | 5 | 55.1 | 57.5 | 4 / 35 | 2892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 48 | 27% |
| bts.mega.Gnarly 1.4 | 17 | 41% |
| bvh.mini.Freya 0.55 | 15 | 40% |
| cs.Wren 1.0 | 7 | 57% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 17% |
| kdf.KoulDestroyer 1.0 | 3 | 33% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |
| matt.UnderDark3 2.4.34 | 1 | 0% |

Hadur died in 320 of 350 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 84 | 26% | 98 |
| bvh.mini.Freya 0.55 | 58 | 18% | 61 |
| bts.mega.Gnarly 1.4 | 47 | 15% | 53 |
| cs.Wren 1.0 | 47 | 15% | 49 |
| kdf.KoulDestroyer 1.0 | 38 | 12% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 10% | 36 |
| bzdp.BoxCar 2.0 | 6 | 2% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 1% | 4 |
| matt.UnderDark3 2.4.34 | 4 | 1% | 3 |

## Melee bench: F39

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 64.5 | 41 / 350 | 4.20 | 12.4% | 33567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.6% | 79 |
| az.Ololobot 0.2.4 | 2.2 | 13.6% | 116 |
| hadur117.nano.SanaroS0 0.1 | 3.2 | 12.4% | 41 |
| catcat20.Lambda 0.024 | 3.6 | 11.6% | 49 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.7% | 33 |
| winamp32.micro.MicroMacro 1.0 | 6.4 | 8.9% | 20 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.3% | 6 |
| gimp.GimpBot 0.1 | 7.5 | 8.1% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.5% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.0 | 62.5 | 2 / 35 | 3222 |
| 2 | 3 | 58.2 | 67.9 | 3 / 35 | 3619 |
| 3 | 2 | 60.8 | 71.7 | 11 / 35 | 3657 |
| 4 | 4 | 53.9 | 59.0 | 3 / 35 | 2841 |
| 5 | 3 | 56.6 | 66.0 | 5 / 35 | 2928 |
| 6 | 3 | 58.1 | 66.3 | 3 / 35 | 3540 |
| 7 | 3 | 58.3 | 67.6 | 3 / 35 | 3432 |
| 8 | 4 | 54.7 | 56.5 | 2 / 35 | 3560 |
| 9 | 4 | 54.7 | 58.7 | 3 / 35 | 3233 |
| 10 | 3 | 59.0 | 68.3 | 6 / 35 | 3535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 39 | 18% |
| bvh.fry.Freya 0.82 | 34 | 29% |
| catcat20.Lambda 0.024 | 26 | 46% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 67% |
| winamp32.micro.MicroMacro 1.0 | 4 | 25% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |
| gimp.GimpBot 0.1 | 2 | 50% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 102 | 33% | 113 |
| az.Ololobot 0.2.4 | 55 | 18% | 63 |
| stelo.SoRobotNanoMelee 1.2 | 40 | 13% | 43 |
| apollokidd.ApolloKidd 0.9 | 36 | 12% | 36 |
| catcat20.Lambda 0.024 | 35 | 11% | 46 |
| winamp32.micro.MicroMacro 1.0 | 21 | 7% | 24 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 3% | 8 |
| gimp.GimpBot 0.1 | 7 | 2% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 7 | 2% | 7 |
2 death(s) with no robot to name.

## Melee bench: F41

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 67.7 | 53 / 350 | 3.91 | 13.0% | 31158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.5% | 163 |
| ary.Swarm 1.1 | 2.7 | 14.2% | 36 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 13.6% | 56 |
| hadur117.nano.SanaroS0 0.1 | 3.5 | 13.0% | 53 |
| simonton.nano.MeleeSeed 1.8 | 4.4 | 11.7% | 37 |
| shrub.Silver v048 | 6.2 | 8.9% | 2 |
| zyx.nano.Ant 1.1 | 6.8 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 3 |
| stelo.Mirror 1.1 | 8.8 | 5.5% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 70.2 | 6 / 35 | 3048 |
| 2 | 4 | 58.8 | 66.0 | 3 / 35 | 3295 |
| 3 | 3 | 60.7 | 73.3 | 4 / 35 | 3016 |
| 4 | 3 | 59.0 | 68.3 | 5 / 35 | 2927 |
| 5 | 2 | 62.0 | 73.0 | 7 / 35 | 3347 |
| 6 | 4 | 59.0 | 65.1 | 5 / 35 | 3104 |
| 7 | 4 | 58.8 | 65.4 | 3 / 35 | 3245 |
| 8 | 5 | 57.9 | 60.0 | 7 / 35 | 3150 |
| 9 | 3 | 61.3 | 71.4 | 8 / 35 | 3219 |
| 10 | 4 | 57.7 | 64.1 | 5 / 35 | 2807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 62 | 31% |
| lessonz.robocode.Oz 0.5.0 | 25 | 32% |
| ary.Swarm 1.1 | 23 | 74% |
| simonton.nano.MeleeSeed 1.8 | 10 | 60% |
| shrub.Silver v048 | 2 | 50% |
| stelo.Mirror 1.1 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 99 | 33% | 118 |
| lessonz.robocode.Oz 0.5.0 | 64 | 22% | 71 |
| ary.Swarm 1.1 | 59 | 20% | 76 |
| simonton.nano.MeleeSeed 1.8 | 33 | 11% | 41 |
| shrub.Silver v048 | 22 | 7% | 22 |
| zyx.nano.Ant 1.1 | 12 | 4% | 12 |
| jsal.Jsalbot 1.0 | 4 | 1% | 5 |
| stelo.Mirror 1.1 | 2 | 1% | 3 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 70.4 | 50 / 350 | 3.67 | 13.6% | 37191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.9% | 184 |
| ara.Shera 0.88 | 2.9 | 14.0% | 65 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 13.6% | 50 |
| maribo.mini.MiniQuester 0.1 | 3.1 | 13.9% | 38 |
| amz.NanoClone 1.41 | 5.1 | 9.2% | 2 |
| maribo.IotaCT 1.1 | 6.6 | 7.4% | 4 |
| dsw.StaticD 1.0 | 6.7 | 7.1% | 8 |
| mme.NikeEnhanced 2.0 | 8.6 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.5% | 0 |
| stelo.MirrorMicro 1.0 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 71.4 | 4 / 35 | 3488 |
| 2 | 4 | 59.2 | 67.3 | 3 / 35 | 3484 |
| 3 | 2 | 63.3 | 76.8 | 11 / 35 | 3798 |
| 4 | 3 | 61.5 | 71.1 | 7 / 35 | 3941 |
| 5 | 2 | 60.7 | 71.4 | 4 / 35 | 3775 |
| 6 | 3 | 61.6 | 74.0 | 4 / 35 | 3841 |
| 7 | 4 | 58.8 | 67.9 | 3 / 35 | 3541 |
| 8 | 3 | 59.2 | 67.3 | 3 / 35 | 3562 |
| 9 | 4 | 59.7 | 64.8 | 5 / 35 | 3815 |
| 10 | 2 | 61.1 | 71.7 | 6 / 35 | 3946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 72 | 26% |
| maribo.mini.MiniQuester 0.1 | 27 | 74% |
| ara.Shera 0.88 | 24 | 38% |
| maribo.IotaCT 1.1 | 2 | 0% |
| dsw.StaticD 1.0 | 1 | 0% |
| amz.NanoClone 1.41 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 112 | 37% | 129 |
| ara.Shera 0.88 | 77 | 26% | 89 |
| maribo.mini.MiniQuester 0.1 | 56 | 19% | 75 |
| amz.NanoClone 1.41 | 21 | 7% | 21 |
| maribo.IotaCT 1.1 | 11 | 4% | 11 |
| dsw.StaticD 1.0 | 9 | 3% | 10 |
| mme.NikeEnhanced 2.0 | 7 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 4 | 1% | 4 |
| stelo.MirrorMicro 1.0 | 3 | 1% | 4 |

## Melee bench: F43

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 62.1 | 19 / 350 | 4.41 | 12.0% | 33250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 272 |
| brainfade.melee.Dusk 0.44 | 2.3 | 13.0% | 33 |
| hadur117.nano.SanaroS0 0.1 | 3.5 | 12.0% | 19 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 12 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 11.2% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.2% | 4 |
| mz.NanoGod 2.02 | 7.4 | 8.0% | 3 |
| jab.DiamondStealer 5 | 7.6 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.0 | 55.6 | 0 / 35 | 3152 |
| 2 | 4 | 58.2 | 59.7 | 1 / 35 | 3323 |
| 3 | 3 | 60.0 | 64.8 | 2 / 35 | 3402 |
| 4 | 4 | 59.4 | 62.5 | 1 / 35 | 3290 |
| 5 | 2 | 62.1 | 68.9 | 4 / 35 | 3702 |
| 6 | 3 | 59.3 | 62.2 | 5 / 35 | 3304 |
| 7 | 3 | 58.9 | 61.0 | 2 / 35 | 3382 |
| 8 | 4 | 58.3 | 60.6 | 1 / 35 | 3214 |
| 9 | 3 | 60.4 | 64.8 | 3 / 35 | 3607 |
| 10 | 5 | 57.8 | 61.3 | 0 / 35 | 2874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 77 | 10% |
| brainfade.melee.Dusk 0.44 | 11 | 45% |
| dummy.micro.Sparrow 2.5 | 8 | 63% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 33% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 331 of 350 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 157 | 47% | 165 |
| brainfade.melee.Dusk 0.44 | 41 | 12% | 45 |
| dummy.micro.Sparrow 2.5 | 35 | 11% | 41 |
| wcsv.melee.EngineerMelee 0.1 | 31 | 9% | 32 |
| Krabb.akim2.Akim2 1.1b | 26 | 8% | 26 |
| mz.NanoGod 2.02 | 26 | 8% | 26 |
| jab.DiamondStealer 5 | 9 | 3% | 9 |
| cvt.Firsty 1.0 | 6 | 2% | 6 |

## Melee bench: F44

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 69.6 | 57 / 350 | 3.73 | 13.8% | 37362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.3 | 16.9% | 137 |
| tzu.TheArtOfWar 1.2 | 1.9 | 15.7% | 101 |
| hadur117.nano.SanaroS0 0.1 | 2.8 | 13.8% | 57 |
| wompi.Quokka 1.6 | 4.5 | 10.6% | 13 |
| jwirde.Gort 2.0 | 4.6 | 10.5% | 29 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.1 | 8.9% | 3 |
| disan.Chair 2.2.0 | 6.9 | 7.8% | 4 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.5% | 3 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.0 | 76.8 | 9 / 35 | 3929 |
| 2 | 3 | 58.6 | 62.5 | 4 / 35 | 3661 |
| 3 | 3 | 58.6 | 65.1 | 8 / 35 | 3313 |
| 4 | 3 | 60.0 | 67.3 | 4 / 35 | 3679 |
| 5 | 3 | 58.7 | 64.1 | 5 / 35 | 3569 |
| 6 | 2 | 62.7 | 77.5 | 4 / 35 | 3859 |
| 7 | 3 | 60.0 | 65.4 | 6 / 35 | 3874 |
| 8 | 3 | 61.6 | 71.7 | 3 / 35 | 3646 |
| 9 | 3 | 60.9 | 67.9 | 7 / 35 | 3841 |
| 10 | 2 | 63.5 | 77.8 | 7 / 35 | 3991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 63 | 49% |
| tzu.TheArtOfWar 1.2 | 47 | 32% |
| wompi.Quokka 1.6 | 12 | 50% |
| jwirde.Gort 2.0 | 11 | 18% |
| disan.Chair 2.2.0 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 0% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 103 | 35% | 121 |
| stelo.Liblix 0.3.1 | 93 | 32% | 124 |
| jwirde.Gort 2.0 | 36 | 12% | 42 |
| wompi.Quokka 1.6 | 22 | 8% | 24 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 14 | 5% | 14 |
| stf.PanzerGeneral 0.1 | 10 | 3% | 10 |
| disan.Chair 2.2.0 | 10 | 3% | 9 |
| amk.jointstrike.JointStrike 0.2 | 4 | 1% | 5 |
| sample.Crazy 1.0 | 1 | 0% | 1 |

## Melee bench: F45

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 68.7 | 57 / 350 | 3.82 | 14.2% | 39196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.7 | 14.2% | 57 |
| eem.IWillFireNoBullet v2.8 | 1.8 | 13.7% | 194 |
| jje.BagPuss 1.2 | 3.3 | 11.7% | 14 |
| sul.Lunar 1.1 | 3.4 | 11.7% | 44 |
| myl.nano.Graviton 1.10 | 5.0 | 10.7% | 18 |
| hvilela.HVilela 0.9 | 6.2 | 9.4% | 3 |
| fm.claire 1.7 | 7.2 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.1% | 7 |
| wit.Deep7 2.0 | 9.2 | 6.4% | 14 |
| abud.ThirdRobo 1.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 62.2 | 2 / 35 | 3701 |
| 2 | 2 | 58.6 | 62.2 | 4 / 35 | 4016 |
| 3 | 1 | 63.8 | 75.9 | 9 / 35 | 4569 |
| 4 | 1 | 61.7 | 71.1 | 7 / 35 | 4027 |
| 5 | 1 | 61.7 | 73.0 | 6 / 35 | 3813 |
| 6 | 1 | 61.7 | 73.7 | 7 / 35 | 3886 |
| 7 | 1 | 62.7 | 75.2 | 8 / 35 | 4025 |
| 8 | 2 | 58.2 | 64.4 | 3 / 35 | 3567 |
| 9 | 2 | 59.3 | 65.1 | 5 / 35 | 3702 |
| 10 | 2 | 59.5 | 64.1 | 6 / 35 | 3890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 33% |
| sul.Lunar 1.1 | 16 | 56% |
| myl.nano.Graviton 1.10 | 15 | 20% |
| jje.BagPuss 1.2 | 7 | 57% |
| hvilela.HVilela 0.9 | 6 | 67% |
| wit.Deep7 2.0 | 3 | 0% |
| pez.mini.ChironexFleckeri 0.5 | 3 | 100% |
| abud.ThirdRobo 1.0 | 2 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 1257. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 24% | 0 |
| sul.Lunar 1.1 | 49 | 17% | 92 |
| jje.BagPuss 1.2 | 48 | 16% | 82 |
| myl.nano.Graviton 1.10 | 39 | 13% | 57 |
| hvilela.HVilela 0.9 | 29 | 10% | 36 |
| fm.claire 1.7 | 20 | 7% | 25 |
| pez.mini.ChironexFleckeri 0.5 | 13 | 4% | 21 |
| abud.ThirdRobo 1.0 | 12 | 4% | 21 |
| wit.Deep7 2.0 | 12 | 4% | 15 |

## Melee bench: F46

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 67.3 | 33 / 350 | 3.94 | 12.3% | 28749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.0% | 150 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.2% | 118 |
| hadur117.nano.SanaroS0 0.1 | 3.2 | 12.3% | 33 |
| cx.Princess 1.0 | 4.5 | 10.9% | 25 |
| mz.MicroSheep 1.0 | 4.6 | 11.0% | 17 |
| sadoner.killer 0.2 | 5.7 | 9.8% | 3 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.2% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.5% | 2 |
| kurios.DOSexe .9a | 9.1 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 68.6 | 3 / 35 | 3056 |
| 2 | 3 | 56.7 | 67.9 | 1 / 35 | 2365 |
| 3 | 3 | 57.8 | 67.0 | 2 / 35 | 2835 |
| 4 | 3 | 60.2 | 72.1 | 6 / 35 | 2909 |
| 5 | 4 | 55.4 | 61.3 | 2 / 35 | 2810 |
| 6 | 3 | 58.5 | 65.1 | 3 / 35 | 3003 |
| 7 | 4 | 56.3 | 63.2 | 3 / 35 | 2706 |
| 8 | 3 | 58.2 | 65.7 | 2 / 35 | 2973 |
| 9 | 3 | 61.2 | 74.6 | 6 / 35 | 3191 |
| 10 | 3 | 58.8 | 67.6 | 5 / 35 | 2901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 56 | 25% |
| rsalesc.melee.Medina 0.4.5 | 29 | 31% |
| cx.Princess 1.0 | 11 | 45% |
| mz.MicroSheep 1.0 | 7 | 14% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 317 of 350 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 116 | 37% | 133 |
| rsalesc.melee.Medina 0.4.5 | 82 | 26% | 88 |
| mz.MicroSheep 1.0 | 37 | 12% | 38 |
| sadoner.killer 0.2 | 34 | 11% | 35 |
| cx.Princess 1.0 | 24 | 8% | 26 |
| arthord.NanoSatanMelee Beta | 12 | 4% | 16 |
| jeremyreeder.collective.Prophet 5 | 10 | 3% | 10 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |

