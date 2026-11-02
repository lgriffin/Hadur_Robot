# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 77.0 | 69 / 350 | 3.07 | 14.0% | 33324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 215 |
| hadur117.nano.SanaroK65 0.3 | 2.0 | 14.0% | 69 |
| sgp.JollyNinja 3.53 | 3.7 | 11.7% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.1 | 11.5% | 7 |
| mz.MicroGodMelee 1 | 4.3 | 11.3% | 12 |
| lorneswork.Predator 1.0 | 5.9 | 10.2% | 4 |
| adt.Ar2 1.0 | 7.1 | 7.7% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.8% | 3 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 81.3 | 8 / 35 | 3172 |
| 2 | 2 | 60.7 | 74.0 | 7 / 35 | 3252 |
| 3 | 2 | 61.2 | 74.3 | 4 / 35 | 3542 |
| 4 | 2 | 63.1 | 79.7 | 6 / 35 | 3474 |
| 5 | 2 | 62.6 | 80.3 | 13 / 35 | 3013 |
| 6 | 2 | 63.0 | 81.3 | 11 / 35 | 3174 |
| 7 | 2 | 58.5 | 68.3 | 4 / 35 | 3174 |
| 8 | 2 | 62.1 | 76.5 | 3 / 35 | 3698 |
| 9 | 2 | 61.4 | 76.5 | 9 / 35 | 3256 |
| 10 | 2 | 62.3 | 78.1 | 4 / 35 | 3569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 139 | 17% |
| mz.MicroGodMelee 1 | 24 | 83% |
| sgp.JollyNinja 3.53 | 22 | 45% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 78% |
| lorneswork.Predator 1.0 | 6 | 50% |
| adt.Ar2 1.0 | 4 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 145 | 51% | 170 |
| sgp.JollyNinja 3.53 | 45 | 16% | 54 |
| simonton.nano.WeekendObsession_Melee 1.0 | 31 | 11% | 34 |
| lorneswork.Predator 1.0 | 26 | 9% | 30 |
| mz.MicroGodMelee 1 | 17 | 6% | 35 |
| adt.Ar2 1.0 | 14 | 5% | 18 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 2% | 9 |

## Melee bench: F02

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 72.5 | 93 / 350 | 3.48 | 14.0% | 32324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.6 | 14.6% | 100 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 14.9% | 79 |
| hadur117.nano.SanaroK65 0.3 | 2.4 | 14.0% | 93 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 11.4% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 10.2% | 27 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.1% | 5 |
| Noran.BitchingElk 0.054 | 6.9 | 7.8% | 16 |
| sch.Simone 0.3d | 7.4 | 7.6% | 14 |
| stelo.PatternRobot 1.0 | 8.6 | 6.6% | 6 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 77.5 | 13 / 35 | 3388 |
| 2 | 3 | 60.1 | 73.0 | 7 / 35 | 3160 |
| 3 | 3 | 56.0 | 63.2 | 6 / 35 | 2879 |
| 4 | 3 | 58.0 | 63.8 | 9 / 35 | 3245 |
| 5 | 2 | 59.1 | 69.5 | 8 / 35 | 3249 |
| 6 | 2 | 62.6 | 75.6 | 11 / 35 | 3499 |
| 7 | 2 | 61.3 | 74.6 | 9 / 35 | 3273 |
| 8 | 1 | 63.0 | 78.4 | 14 / 35 | 3348 |
| 9 | 3 | 59.6 | 71.4 | 7 / 35 | 2974 |
| 10 | 2 | 62.6 | 77.8 | 9 / 35 | 3309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 57 | 70% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 50 | 26% |
| Noran.BitchingElk 0.054 | 18 | 72% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 47% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| sch.Simone 0.3d | 8 | 25% |
| stelo.PatternRobot 1.0 | 7 | 57% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 0% |

Hadur died in 257 of 350 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 74 | 29% | 93 |
| pulsar.PulsarMax 0.8.9 | 60 | 23% | 83 |
| lrem.micro.SpikeSoldier 0.4 | 29 | 11% | 37 |
| com.cohesiva.robocode.ManOwaR 1.0 | 25 | 10% | 33 |
| sch.Simone 0.3d | 23 | 9% | 27 |
| stelo.PatternRobot 1.0 | 16 | 6% | 20 |
| fnc.bandit.Bandit 5.2.0 | 15 | 6% | 17 |
| Noran.BitchingElk 0.054 | 8 | 3% | 28 |
| fullsail.SweetTea 1.1 | 7 | 3% | 11 |

## Melee bench: F03

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 79.4 | 90 / 350 | 2.86 | 14.5% | 34601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.7 | 15.4% | 99 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.5% | 79 |
| hadur117.nano.SanaroK65 0.3 | 2.6 | 14.5% | 90 |
| vuen.Cake 2.51 | 3.5 | 13.1% | 61 |
| urdos.URDOS 1.3 | 5.0 | 10.5% | 15 |
| adt.Ar1 2.1 | 6.5 | 7.7% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 6.7 | 7.4% | 3 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.1 | 5.5% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 77.5 | 6 / 35 | 3438 |
| 2 | 3 | 61.1 | 78.1 | 2 / 35 | 3525 |
| 3 | 2 | 60.2 | 74.3 | 12 / 35 | 3092 |
| 4 | 3 | 61.0 | 77.1 | 4 / 35 | 3594 |
| 5 | 2 | 62.4 | 81.3 | 10 / 35 | 3367 |
| 6 | 2 | 63.8 | 84.4 | 11 / 35 | 3386 |
| 7 | 3 | 61.9 | 79.7 | 9 / 35 | 3268 |
| 8 | 4 | 59.5 | 67.0 | 7 / 35 | 3903 |
| 9 | 2 | 63.8 | 86.0 | 14 / 35 | 3387 |
| 10 | 2 | 65.0 | 88.3 | 15 / 35 | 3641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 70 | 43% |
| vuen.Cake 2.51 | 59 | 61% |
| kawigi.nano.Lib 1.0 | 43 | 16% |
| urdos.URDOS 1.3 | 20 | 65% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 0% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 85 | 32% | 97 |
| radnor.DoctorBob 1.42 | 82 | 31% | 105 |
| vuen.Cake 2.51 | 39 | 15% | 74 |
| urdos.URDOS 1.3 | 29 | 11% | 42 |
| adt.Ar1 2.1 | 12 | 5% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 2% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 4 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 4 |
| oa.weak.FlyMk1 0.1 | 1 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 76.6 | 14 / 350 | 3.10 | 13.9% | 36121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.6% | 320 |
| hadur117.nano.SanaroK65 0.3 | 2.3 | 13.9% | 14 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.4% | 8 |
| TNT.TNT 0.99.1 | 4.1 | 10.9% | 5 |
| josago.Jorgito 0.16 | 5.1 | 9.2% | 2 |
| css.Delitioner 0.11 | 6.0 | 7.7% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 8.9 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 78.1 | 1 / 35 | 3477 |
| 2 | 2 | 61.9 | 75.6 | 1 / 35 | 3429 |
| 3 | 3 | 61.2 | 71.1 | 3 / 35 | 3717 |
| 4 | 2 | 62.4 | 77.1 | 0 / 35 | 3499 |
| 5 | 3 | 63.5 | 78.1 | 0 / 35 | 3923 |
| 6 | 2 | 63.0 | 79.4 | 2 / 35 | 3483 |
| 7 | 2 | 62.2 | 76.5 | 1 / 35 | 3743 |
| 8 | 2 | 63.3 | 77.5 | 2 / 35 | 4001 |
| 9 | 2 | 62.0 | 76.2 | 2 / 35 | 3472 |
| 10 | 2 | 62.0 | 76.8 | 2 / 35 | 3377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 191 | 2% |
| apc.LeeroyJenkins2 1.0 | 7 | 86% |
| TNT.TNT 0.99.1 | 3 | 67% |
| css.Delitioner 0.11 | 2 | 100% |

Hadur died in 336 of 350 rounds, at a mean tick of 1328. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 248 | 74% | 252 |
| apc.LeeroyJenkins2 1.0 | 41 | 12% | 48 |
| josago.Jorgito 0.16 | 20 | 6% | 20 |
| TNT.TNT 0.99.1 | 11 | 3% | 13 |
| css.Delitioner 0.11 | 7 | 2% | 8 |
| tj.zombie1n 1.0.1 | 7 | 2% | 7 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 74.1 | 98 / 350 | 3.33 | 13.8% | 28471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.3% | 81 |
| origin.SleepSiphon 1.7b | 2.4 | 14.0% | 88 |
| hadur117.nano.SanaroK65 0.3 | 2.9 | 13.8% | 98 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.6 | 12.8% | 48 |
| mld.Wisdom 1.0 | 4.9 | 11.2% | 16 |
| gg.Wolverine 2.0 | 6.2 | 8.5% | 6 |
| spinnercat.Omen 1.0 | 7.3 | 7.4% | 2 |
| DBall.NUKE 0.1 | 8.0 | 7.2% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.7% | 8 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.9 | 70.5 | 9 / 35 | 2587 |
| 2 | 4 | 59.8 | 71.4 | 10 / 35 | 2603 |
| 3 | 2 | 61.4 | 75.9 | 9 / 35 | 3121 |
| 4 | 3 | 61.7 | 79.0 | 8 / 35 | 2720 |
| 5 | 3 | 60.9 | 74.0 | 8 / 35 | 3058 |
| 6 | 3 | 59.5 | 71.4 | 8 / 35 | 2769 |
| 7 | 3 | 61.1 | 74.0 | 13 / 35 | 2747 |
| 8 | 3 | 58.7 | 67.6 | 8 / 35 | 2906 |
| 9 | 2 | 63.0 | 80.3 | 13 / 35 | 2782 |
| 10 | 2 | 62.3 | 76.8 | 12 / 35 | 3178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 52 | 48% |
| jekl.StoneGhost 0.7 | 47 | 68% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 53% |
| gg.Wolverine 2.0 | 14 | 86% |
| mld.Wisdom 1.0 | 6 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| spinnercat.Omen 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 3 | 67% |

Hadur died in 252 of 350 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 68 | 27% | 97 |
| jekl.StoneGhost 0.7 | 60 | 24% | 81 |
| pe.minimelee.SandboxMiniMelee 1.1 | 51 | 20% | 73 |
| mld.Wisdom 1.0 | 38 | 15% | 45 |
| gg.Wolverine 2.0 | 14 | 6% | 21 |
| spinnercat.Omen 1.0 | 11 | 4% | 16 |
| DBall.NUKE 0.1 | 7 | 3% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 1% | 8 |

## Melee bench: F07

hadur117.nano.SanaroK65 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.6 | 113 / 350 | 2.39 | 17.7% | 39302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.0 | 22.3% | 120 |
| hadur117.nano.SanaroK65 0.3 | 2.0 | 17.7% | 113 |
| franzor.Lizt 1.3.1 | 3.2 | 14.5% | 80 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 13.7% | 35 |
| lrem.micro.MoggFanatic 0.2 | 5.1 | 10.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.8% | 2 |
| skm.PateranBotlock2 1.0 | 6.9 | 6.9% | 0 |
| sample.Target 1.0 | 8.5 | 3.1% | 0 |
| drd.Dreadknoght 0.9 | 8.5 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 82.9 | 8 / 35 | 3682 |
| 2 | 2 | 64.8 | 77.9 | 12 / 35 | 3940 |
| 3 | 2 | 65.7 | 82.9 | 11 / 35 | 3796 |
| 4 | 2 | 66.7 | 83.9 | 17 / 35 | 3763 |
| 5 | 2 | 66.3 | 79.6 | 12 / 35 | 4203 |
| 6 | 2 | 67.0 | 85.7 | 12 / 35 | 3930 |
| 7 | 2 | 65.3 | 82.5 | 8 / 35 | 3722 |
| 8 | 2 | 67.5 | 87.5 | 13 / 35 | 4104 |
| 9 | 2 | 66.2 | 81.8 | 10 / 35 | 4176 |
| 10 | 2 | 66.3 | 81.8 | 10 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 114 | 49% |
| oog.melee.CapuletDroid 1.1 | 50 | 74% |
| franzor.Lizt 1.3.1 | 49 | 41% |
| exauge.GateKeeper 1.1.121g | 1 | 0% |

Hadur died in 237 of 350 rounds, at a mean tick of 1528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 151 | 64% | 245 |
| oog.melee.CapuletDroid 1.1 | 40 | 17% | 79 |
| franzor.Lizt 1.3.1 | 33 | 14% | 1 |
| lrem.micro.MoggFanatic 0.2 | 7 | 3% | 10 |
| exauge.GateKeeper 1.1.121g | 4 | 2% | 8 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroK65 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 80.1 | 146 / 350 | 2.59 | 16.8% | 29055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK65 0.3 | 1.2 | 16.8% | 146 |
| tm.Yuugao 1.0 | 2.2 | 15.6% | 69 |
| shrub.Vapour v159 | 2.6 | 15.6% | 87 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 11.4% | 25 |
| m3thos.Eva00 1.1 | 5.2 | 10.0% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 9.3% | 12 |
| qualidafial.MajorDick 1.0.1 | 7.7 | 7.2% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.9 | 6.9% | 0 |
| SHAM.WOW 1.4 | 8.1 | 7.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 86.1 | 14 / 35 | 3062 |
| 2 | 1 | 61.9 | 80.0 | 13 / 35 | 2612 |
| 3 | 1 | 64.0 | 82.5 | 19 / 35 | 3019 |
| 4 | 2 | 61.7 | 77.5 | 15 / 35 | 2797 |
| 5 | 1 | 63.3 | 81.4 | 15 / 35 | 2987 |
| 6 | 1 | 62.6 | 81.1 | 14 / 35 | 2806 |
| 7 | 2 | 61.0 | 74.3 | 12 / 35 | 2913 |
| 8 | 1 | 62.2 | 78.9 | 14 / 35 | 2762 |
| 9 | 1 | 63.4 | 80.0 | 15 / 35 | 3307 |
| 10 | 1 | 62.6 | 79.3 | 15 / 35 | 2790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 92 | 76% |
| shrub.Vapour v159 | 61 | 38% |
| com.spp.robocode.MostlyHarmless 010 | 32 | 78% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 80% |
| m3thos.Eva00 1.1 | 10 | 50% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 206 of 350 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 68 | 33% | 91 |
| tm.Yuugao 1.0 | 52 | 25% | 122 |
| com.spp.robocode.MostlyHarmless 010 | 28 | 14% | 48 |
| m3thos.Eva00 1.1 | 21 | 10% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 7% | 27 |
| zyx.nano.BacillusComma 1.0 | 12 | 6% | 15 |
| SHAM.WOW 1.4 | 5 | 2% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 2% | 5 |

## Melee bench: F09

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 67.1 | 59 / 350 | 3.96 | 12.4% | 25507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.3% | 181 |
| kc.micro.Figment 1.0 | 2.0 | 14.9% | 57 |
| hadur117.nano.SanaroK65 0.3 | 3.2 | 12.4% | 59 |
| yagami.Tidus 0.11 | 4.5 | 10.5% | 6 |
| pedersen.Grishnakh 1.0 | 4.9 | 10.6% | 26 |
| mc2.enemy.Original 0.9 | 5.5 | 9.8% | 18 |
| dft.Calliope 5.6 | 6.9 | 7.9% | 4 |
| step.nanoPri 1.0 | 8.4 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 64.8 | 8 / 35 | 2621 |
| 2 | 3 | 58.3 | 69.2 | 5 / 35 | 2391 |
| 3 | 3 | 57.6 | 66.0 | 5 / 35 | 2471 |
| 4 | 4 | 57.2 | 64.8 | 7 / 35 | 2429 |
| 5 | 4 | 54.2 | 56.5 | 4 / 35 | 2516 |
| 6 | 3 | 59.9 | 71.4 | 6 / 35 | 2679 |
| 7 | 3 | 60.7 | 75.2 | 4 / 35 | 2781 |
| 8 | 3 | 59.1 | 67.3 | 6 / 35 | 2685 |
| 9 | 3 | 57.4 | 66.3 | 6 / 35 | 2218 |
| 10 | 3 | 59.7 | 69.8 | 8 / 35 | 2716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 81 | 37% |
| kc.micro.Figment 1.0 | 33 | 42% |
| mc2.enemy.Original 0.9 | 11 | 64% |
| pedersen.Grishnakh 1.0 | 7 | 43% |
| yagami.Tidus 0.11 | 3 | 100% |
| dft.Calliope 5.6 | 3 | 67% |

Hadur died in 292 of 350 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 100 | 34% | 128 |
| kc.micro.Figment 1.0 | 70 | 24% | 85 |
| yagami.Tidus 0.11 | 37 | 13% | 40 |
| pedersen.Grishnakh 1.0 | 28 | 10% | 30 |
| mc2.enemy.Original 0.9 | 25 | 9% | 32 |
| robar.nano.Assertive_Melee 0.2 | 15 | 5% | 15 |
| step.nanoPri 1.0 | 8 | 3% | 8 |
| dft.Calliope 5.6 | 7 | 2% | 10 |
| rdm.Dueler 0.4x | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 83.3 | 150 / 350 | 2.51 | 15.8% | 35403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK65 0.3 | 1.2 | 15.8% | 150 |
| DTF.Kludgy 1.2b | 2.0 | 15.2% | 92 |
| ne.Chimera 1.2 | 3.1 | 13.5% | 42 |
| ejb.Polaris 1.0.1 | 4.0 | 12.6% | 29 |
| vStar.RAFzilla 2.15 | 5.3 | 10.2% | 7 |
| tvv.micro.Antares 1.1.1 | 5.4 | 10.6% | 23 |
| sam.Samspin 1.0 | 7.8 | 6.2% | 2 |
| kurios.DOSexe .9b | 8.0 | 5.7% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.9% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 86.0 | 17 / 35 | 3306 |
| 2 | 1 | 64.1 | 85.1 | 16 / 35 | 3366 |
| 3 | 2 | 62.1 | 76.5 | 11 / 35 | 3465 |
| 4 | 2 | 61.8 | 76.5 | 12 / 35 | 3228 |
| 5 | 1 | 63.9 | 80.6 | 14 / 35 | 3597 |
| 6 | 1 | 64.6 | 83.5 | 15 / 35 | 3547 |
| 7 | 1 | 64.1 | 81.9 | 15 / 35 | 3645 |
| 8 | 1 | 65.8 | 87.0 | 18 / 35 | 3833 |
| 9 | 1 | 65.1 | 86.7 | 17 / 35 | 3638 |
| 10 | 1 | 65.9 | 88.9 | 15 / 35 | 3778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 83 | 47% |
| ejb.Polaris 1.0.1 | 59 | 92% |
| ne.Chimera 1.2 | 41 | 56% |
| tvv.micro.Antares 1.1.1 | 27 | 56% |
| vStar.RAFzilla 2.15 | 11 | 82% |
| kurios.DOSexe .9b | 6 | 83% |
| donjezza.Muncho 1.0 | 5 | 60% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 201 of 350 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 82 | 41% | 115 |
| ne.Chimera 1.2 | 53 | 26% | 75 |
| tvv.micro.Antares 1.1.1 | 22 | 11% | 33 |
| ejb.Polaris 1.0.1 | 16 | 8% | 73 |
| vStar.RAFzilla 2.15 | 7 | 3% | 19 |
| kurios.DOSexe .9b | 7 | 3% | 12 |
| sam.Samspin 1.0 | 6 | 3% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 2% | 6 |
| donjezza.Muncho 1.0 | 3 | 1% | 8 |

## Melee bench: F11

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 71.7 | 85 / 350 | 3.55 | 13.3% | 25952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.1 | 16.8% | 122 |
| cx.mini.Nimrod 0.55 | 2.4 | 13.6% | 52 |
| hadur117.nano.SanaroK65 0.3 | 2.5 | 13.3% | 85 |
| djc.DynaBot 0.1.1 | 4.4 | 10.4% | 17 |
| rdt199.Warlord 0.73 | 5.5 | 9.7% | 26 |
| br2.MobyDickBot 1.6 | 5.6 | 9.5% | 24 |
| uji.YellohFellah 1.0 | 6.9 | 8.5% | 25 |
| KiraNL.Chupacabra 0.4 | 7.6 | 7.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 71.4 | 7 / 35 | 2584 |
| 2 | 3 | 59.1 | 71.1 | 9 / 35 | 2657 |
| 3 | 3 | 56.5 | 66.3 | 6 / 35 | 2490 |
| 4 | 2 | 59.4 | 69.2 | 10 / 35 | 2903 |
| 5 | 2 | 61.5 | 75.9 | 12 / 35 | 2805 |
| 6 | 2 | 60.4 | 76.8 | 9 / 35 | 2388 |
| 7 | 3 | 59.8 | 73.3 | 8 / 35 | 2543 |
| 8 | 3 | 57.9 | 69.8 | 8 / 35 | 2245 |
| 9 | 2 | 59.7 | 70.5 | 8 / 35 | 2741 |
| 10 | 2 | 59.6 | 72.4 | 8 / 35 | 2596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 72 | 42% |
| cx.mini.Nimrod 0.55 | 29 | 59% |
| uji.YellohFellah 1.0 | 14 | 50% |
| rdt199.Warlord 0.73 | 14 | 86% |
| djc.DynaBot 0.1.1 | 10 | 70% |
| br2.MobyDickBot 1.6 | 9 | 78% |
| KiraNL.Chupacabra 0.4 | 4 | 100% |

Hadur died in 265 of 350 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 98 | 37% | 122 |
| cx.mini.Nimrod 0.55 | 65 | 25% | 80 |
| rdt199.Warlord 0.73 | 26 | 10% | 43 |
| uji.YellohFellah 1.0 | 22 | 8% | 32 |
| br2.MobyDickBot 1.6 | 17 | 6% | 25 |
| djc.DynaBot 0.1.1 | 13 | 5% | 22 |
| KiraNL.Chupacabra 0.4 | 13 | 5% | 16 |
| stelo.MirrorNano 1.3 | 6 | 2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 2% | 4 |

## Melee bench: F12

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 72.9 | 88 / 350 | 3.44 | 13.6% | 25564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.9 | 14.4% | 71 |
| nat.PallasHawk 1.0 | 1.9 | 14.6% | 102 |
| hadur117.nano.SanaroK65 0.3 | 2.9 | 13.6% | 88 |
| darkcanuck.Leon 1.01 | 3.4 | 13.1% | 55 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.0% | 13 |
| jrm.Test0 1.0 | 6.3 | 8.4% | 6 |
| jp.Perpy 16.0 | 7.3 | 7.3% | 0 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.1% | 0 |
| stuff.Vlad 0.1 | 9.1 | 5.7% | 2 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.9% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.5 | 69.5 | 7 / 35 | 2594 |
| 2 | 2 | 61.1 | 75.9 | 7 / 35 | 2904 |
| 3 | 1 | 61.9 | 78.1 | 10 / 35 | 2753 |
| 4 | 2 | 61.7 | 77.5 | 10 / 35 | 2716 |
| 5 | 4 | 57.1 | 66.7 | 9 / 35 | 2234 |
| 6 | 2 | 61.6 | 79.0 | 8 / 35 | 2734 |
| 7 | 3 | 59.5 | 72.1 | 10 / 35 | 2488 |
| 8 | 3 | 59.5 | 71.4 | 11 / 35 | 2455 |
| 9 | 4 | 56.7 | 64.4 | 9 / 35 | 2236 |
| 10 | 4 | 60.1 | 74.6 | 7 / 35 | 2450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 69 | 17% |
| bts.wiki.RipCurl 0.9b | 53 | 66% |
| darkcanuck.Leon 1.01 | 43 | 53% |
| brainfade.melee.Genghis 0.36 | 11 | 82% |
| jaybot.bots.Oddball 4.0 | 7 | 0% |
| jp.Perpy 16.0 | 4 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 76 | 29% | 96 |
| bts.wiki.RipCurl 0.9b | 63 | 24% | 91 |
| darkcanuck.Leon 1.01 | 31 | 12% | 57 |
| brainfade.melee.Genghis 0.36 | 29 | 11% | 34 |
| jrm.Test0 1.0 | 18 | 7% | 22 |
| cs.sheldor.Talon 1.1 | 15 | 6% | 16 |
| jaybot.bots.Oddball 4.0 | 14 | 5% | 13 |
| jp.Perpy 16.0 | 10 | 4% | 12 |
| stuff.Vlad 0.1 | 6 | 2% | 9 |

## Melee bench: F13

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 75.0 | 70 / 350 | 3.25 | 13.3% | 27570 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.4% | 150 |
| ags.Glacier 0.2.11 | 1.8 | 16.4% | 76 |
| hadur117.nano.SanaroK65 0.3 | 3.3 | 13.3% | 70 |
| shinh.Entangled 0.3 | 4.2 | 12.2% | 32 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.9% | 20 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 1 |
| stelo.Wang 1.0 | 7.1 | 6.7% | 1 |
| ayk.WallHugger 1.0 | 7.8 | 5.7% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.1 | 72.7 | 9 / 35 | 2705 |
| 2 | 3 | 61.2 | 74.3 | 8 / 35 | 3109 |
| 3 | 3 | 60.0 | 73.0 | 8 / 35 | 2608 |
| 4 | 3 | 62.4 | 79.0 | 9 / 35 | 2881 |
| 5 | 3 | 60.1 | 77.8 | 4 / 35 | 2606 |
| 6 | 3 | 62.0 | 79.0 | 8 / 35 | 2754 |
| 7 | 3 | 61.3 | 76.2 | 9 / 35 | 2678 |
| 8 | 3 | 61.9 | 79.7 | 4 / 35 | 3048 |
| 9 | 4 | 57.3 | 66.7 | 5 / 35 | 2465 |
| 10 | 4 | 59.1 | 71.7 | 6 / 35 | 2716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 100 | 42% |
| ags.Glacier 0.2.11 | 48 | 27% |
| shinh.Entangled 0.3 | 22 | 41% |
| gh.micro.Gruweltje 0.7 | 8 | 50% |
| apc.Colossus2 0.17 | 2 | 100% |
| stelo.Wang 1.0 | 1 | 0% |

Hadur died in 280 of 350 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 86 | 31% | 127 |
| ags.Glacier 0.2.11 | 85 | 30% | 99 |
| shinh.Entangled 0.3 | 45 | 16% | 54 |
| gh.micro.Gruweltje 0.7 | 33 | 12% | 37 |
| stelo.Wang 1.0 | 12 | 4% | 12 |
| apc.Colossus2 0.17 | 9 | 3% | 11 |
| maribo.FollowFire 1 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| sample.Tracker 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.nano.SanaroK65 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 83.4 | 144 / 350 | 2.33 | 16.6% | 27235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 19.6% | 137 |
| hadur117.nano.SanaroK65 0.3 | 2.0 | 16.6% | 144 |
| dmh.robocode.robot.RedDwarf 0.4 | 3.2 | 12.8% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 4.6 | 11.2% | 16 |
| Lo_Ian.Gandalf_V4 4.0 | 5.1 | 11.0% | 14 |
| co.edu.usb.rc.LidisTron 1.0 | 5.1 | 10.9% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 9.2% | 15 |
| pa.Improved 1.0 | 8.0 | 6.2% | 1 |
| sample.TrackFire 1.0 | 9.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 84.6 | 16 / 35 | 2949 |
| 2 | 2 | 61.6 | 78.9 | 13 / 35 | 2718 |
| 3 | 2 | 65.3 | 87.9 | 18 / 35 | 2993 |
| 4 | 2 | 62.0 | 81.4 | 12 / 35 | 2525 |
| 5 | 2 | 60.8 | 76.8 | 10 / 35 | 2557 |
| 6 | 2 | 62.3 | 81.1 | 9 / 35 | 2386 |
| 7 | 2 | 65.2 | 90.0 | 17 / 35 | 2755 |
| 8 | 2 | 63.2 | 84.3 | 13 / 35 | 2661 |
| 9 | 2 | 64.8 | 83.9 | 19 / 35 | 3099 |
| 10 | 2 | 64.5 | 85.4 | 17 / 35 | 2592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 153 | 52% |
| sheldor.micro.PointInLineRRAL 1.0 | 31 | 74% |
| sanyi.mikrobi.Roberto 1.0 | 23 | 70% |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 75% |
| Lo_Ian.Gandalf_V4 4.0 | 11 | 64% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 206 of 350 rounds, at a mean tick of 1102. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 111 | 54% | 184 |
| co.edu.usb.rc.LidisTron 1.0 | 21 | 10% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 20 | 10% | 30 |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 9% | 43 |
| sanyi.mikrobi.Roberto 1.0 | 18 | 9% | 40 |
| Lo_Ian.Gandalf_V4 4.0 | 14 | 7% | 23 |
| pa.Improved 1.0 | 3 | 1% | 7 |
| sample.TrackFire 1.0 | 1 | 0% | 2 |

## Melee bench: F15

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 70.8 | 77 / 350 | 3.63 | 13.5% | 32053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.4 | 15.0% | 81 |
| hadur117.nano.SanaroK65 0.3 | 2.6 | 13.5% | 77 |
| emp.Yngwie 1.11 | 3.1 | 13.3% | 84 |
| mld.DustBunny 3.8 | 3.3 | 13.0% | 35 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.1% | 19 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.6% | 46 |
| Grystrion.TrackerWO 1.0 | 7.4 | 7.0% | 2 |
| lambdaxy.TBot 0.1 | 7.6 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 5.2% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.6 | 63.8 | 4 / 35 | 2825 |
| 2 | 2 | 60.0 | 71.7 | 9 / 35 | 3036 |
| 3 | 1 | 61.8 | 78.1 | 11 / 35 | 3119 |
| 4 | 4 | 59.4 | 69.2 | 9 / 35 | 2790 |
| 5 | 4 | 57.5 | 65.4 | 5 / 35 | 2987 |
| 6 | 2 | 59.9 | 69.2 | 8 / 35 | 3507 |
| 7 | 3 | 59.7 | 67.6 | 7 / 35 | 3294 |
| 8 | 1 | 61.7 | 75.2 | 7 / 35 | 3610 |
| 9 | 2 | 60.5 | 72.1 | 8 / 35 | 3416 |
| 10 | 2 | 61.9 | 75.2 | 9 / 35 | 3469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 55 | 67% |
| kawigi.micro.Shiz 1.1 | 33 | 39% |
| mld.DustBunny 3.8 | 19 | 0% |
| cb.nano.Insomnia 1.0 | 18 | 56% |
| kawigi.robot.Girl 1.2 | 18 | 50% |
| divineomega.TrialBot 0.003 | 5 | 80% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 276 of 350 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 60 | 22% | 99 |
| kawigi.micro.Shiz 1.1 | 53 | 19% | 66 |
| mld.DustBunny 3.8 | 51 | 18% | 59 |
| cb.nano.Insomnia 1.0 | 44 | 16% | 39 |
| kawigi.robot.Girl 1.2 | 37 | 13% | 47 |
| lambdaxy.TBot 0.1 | 11 | 4% | 12 |
| divineomega.TrialBot 0.003 | 10 | 4% | 17 |
| Grystrion.TrackerWO 1.0 | 5 | 2% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F16

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 73.3 | 86 / 350 | 3.40 | 14.3% | 34536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.8% | 139 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.4 | 14.2% | 14 |
| hadur117.nano.SanaroK65 0.3 | 2.6 | 14.3% | 86 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.4% | 53 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.9% | 28 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.3% | 6 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.9% | 10 |
| divineomega.DivineBot 1.9.4.5 | 8.6 | 6.0% | 12 |
| repositorio.NanoStep 1.0 | 9.1 | 5.3% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 78.4 | 14 / 35 | 3594 |
| 2 | 2 | 60.7 | 73.3 | 6 / 35 | 3483 |
| 3 | 2 | 60.4 | 68.6 | 10 / 35 | 3491 |
| 4 | 3 | 62.0 | 73.3 | 12 / 35 | 3245 |
| 5 | 2 | 64.4 | 81.6 | 8 / 35 | 3937 |
| 6 | 3 | 60.6 | 69.8 | 8 / 35 | 3654 |
| 7 | 3 | 59.8 | 70.2 | 3 / 35 | 3375 |
| 8 | 3 | 61.8 | 76.2 | 9 / 35 | 3116 |
| 9 | 3 | 60.1 | 67.9 | 6 / 35 | 3482 |
| 10 | 3 | 61.5 | 74.0 | 10 / 35 | 3159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 94 | 39% |
| techdude.forest.FlamingForest 1.1 | 24 | 29% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 100% |
| tvv.nano.Polaris 1.2 | 14 | 21% |
| divineomega.DivineBot 1.9.4.5 | 12 | 67% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| asd.Cthulhu 1.3 | 1 | 0% |

Hadur died in 265 of 350 rounds, at a mean tick of 1405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 108 | 41% | 152 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 42 | 16% | 56 |
| techdude.forest.FlamingForest 1.1 | 29 | 11% | 39 |
| bvh.fnr.Fenrir 0.36l | 24 | 9% | 28 |
| tvv.nano.Polaris 1.2 | 21 | 8% | 22 |
| divineomega.DivineBot 1.9.4.5 | 19 | 7% | 29 |
| asd.Cthulhu 1.3 | 11 | 4% | 11 |
| stelo.IntrinsicVolatility 1.4 | 10 | 4% | 12 |
| repositorio.NanoStep 1.0 | 1 | 0% | 1 |

## Melee bench: F17

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 71.3 | 96 / 350 | 3.58 | 13.5% | 30081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 2.2 | 14.0% | 74 |
| et.Predator 1.8 | 2.2 | 13.9% | 67 |
| hadur117.nano.SanaroK65 0.3 | 2.7 | 13.5% | 96 |
| cx.BlestPain 1.41 | 3.4 | 12.7% | 45 |
| nic.Nicator 2.4 | 5.1 | 11.7% | 35 |
| ahf.NanoAndrew .4 | 5.4 | 11.3% | 25 |
| maribo.melee.BMV 0.1 | 7.0 | 8.9% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.8% | 3 |
| tex.Longbot 0.4 | 8.7 | 5.7% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.8 | 65.1 | 7 / 35 | 2697 |
| 2 | 1 | 62.3 | 76.2 | 13 / 35 | 3230 |
| 3 | 4 | 57.6 | 64.4 | 8 / 35 | 2778 |
| 4 | 1 | 60.5 | 73.0 | 9 / 35 | 2889 |
| 5 | 2 | 63.1 | 78.4 | 11 / 35 | 3196 |
| 6 | 2 | 60.2 | 68.6 | 12 / 35 | 3117 |
| 7 | 3 | 61.6 | 73.0 | 7 / 35 | 3318 |
| 8 | 4 | 59.6 | 67.3 | 12 / 35 | 2875 |
| 9 | 3 | 61.3 | 76.2 | 7 / 35 | 2961 |
| 10 | 2 | 59.8 | 71.1 | 10 / 35 | 3020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 58 | 40% |
| oog.melee.Mercutio 1.0 | 39 | 64% |
| cx.BlestPain 1.41 | 34 | 91% |
| nic.Nicator 2.4 | 20 | 45% |
| ahf.NanoAndrew .4 | 10 | 60% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% |

Hadur died in 255 of 350 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 62 | 24% | 88 |
| oog.melee.Mercutio 1.0 | 58 | 23% | 85 |
| nic.Nicator 2.4 | 37 | 15% | 47 |
| ahf.NanoAndrew .4 | 37 | 15% | 41 |
| cx.BlestPain 1.41 | 31 | 12% | 58 |
| tex.Longbot 0.4 | 11 | 4% | 11 |
| maribo.melee.BMV 0.1 | 10 | 4% | 11 |
| edu.otg.spr.TheTeacher 1.2 | 6 | 2% | 7 |
| goblin.Bender 2.4 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.nano.SanaroK65 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 78.3 | 136 / 350 | 2.74 | 16.2% | 26708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK65 0.3 | 1.1 | 16.2% | 136 |
| agd.Mooserwirt2 2.7 | 2.1 | 14.4% | 75 |
| uji.DBH 1.1 | 3.5 | 12.7% | 34 |
| ratosh.Nobo 0.21 | 4.4 | 12.2% | 17 |
| spinnercat.Robovirus 2.718 | 4.6 | 12.1% | 27 |
| sigterm.Sigterm 1.0 | 5.5 | 10.7% | 35 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 8.8% | 13 |
| stelo.WangRobot 1.0 | 8.0 | 6.8% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.6 | 6.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.7 | 74.3 | 12 / 35 | 2428 |
| 2 | 1 | 62.2 | 80.4 | 15 / 35 | 2595 |
| 3 | 1 | 62.1 | 77.9 | 13 / 35 | 2887 |
| 4 | 1 | 61.5 | 79.3 | 14 / 35 | 2602 |
| 5 | 1 | 61.4 | 78.9 | 15 / 35 | 2490 |
| 6 | 1 | 62.9 | 81.4 | 16 / 35 | 2771 |
| 7 | 1 | 61.6 | 76.8 | 15 / 35 | 2823 |
| 8 | 1 | 64.0 | 86.1 | 14 / 35 | 2767 |
| 9 | 2 | 59.0 | 70.7 | 10 / 35 | 2711 |
| 10 | 1 | 61.0 | 77.1 | 12 / 35 | 2634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 60 | 65% |
| uji.DBH 1.1 | 36 | 58% |
| spinnercat.Robovirus 2.718 | 31 | 81% |
| sigterm.Sigterm 1.0 | 28 | 68% |
| ratosh.Nobo 0.21 | 17 | 76% |
| stelo.WangRobot 1.0 | 16 | 69% |
| kawigi.mini.Fhqwhgads 1.1 | 13 | 54% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 214 of 350 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 52 | 24% | 92 |
| ratosh.Nobo 0.21 | 38 | 18% | 56 |
| uji.DBH 1.1 | 35 | 16% | 49 |
| spinnercat.Robovirus 2.718 | 29 | 14% | 49 |
| sigterm.Sigterm 1.0 | 25 | 12% | 43 |
| kawigi.mini.Fhqwhgads 1.1 | 18 | 8% | 26 |
| stelo.WangRobot 1.0 | 14 | 7% | 27 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 1% | 6 |

## Melee bench: F19

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 84.2 | 133 / 350 | 2.42 | 16.0% | 34014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.7 | 16.4% | 118 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.1 | 16.0% | 75 |
| hadur117.nano.SanaroK65 0.3 | 2.2 | 16.0% | 133 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.5% | 10 |
| erdnis.Rover 0.3 | 4.8 | 10.5% | 1 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.4% | 4 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 0 |
| pac.ABC 2.1 | 7.3 | 7.3% | 10 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 87.9 | 14 / 35 | 3405 |
| 2 | 2 | 66.2 | 84.8 | 14 / 35 | 3689 |
| 3 | 1 | 66.4 | 86.0 | 14 / 35 | 3693 |
| 4 | 2 | 65.1 | 83.8 | 11 / 35 | 3503 |
| 5 | 3 | 63.1 | 78.4 | 9 / 35 | 3086 |
| 6 | 3 | 64.4 | 80.0 | 15 / 35 | 3069 |
| 7 | 3 | 65.0 | 82.9 | 13 / 35 | 3437 |
| 8 | 2 | 67.0 | 87.9 | 18 / 35 | 3417 |
| 9 | 1 | 67.6 | 90.8 | 16 / 35 | 3641 |
| 10 | 3 | 63.6 | 79.4 | 9 / 35 | 3074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 106 | 52% |
| davidalves.net.DuelistMiniMelee 1.2 | 85 | 52% |
| krillr.mini.JointStrike 2.0.0 | 19 | 68% |
| pac.ABC 2.1 | 10 | 60% |
| erdnis.Rover 0.3 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 83% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 219 of 350 rounds, at a mean tick of 1222. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 97 | 44% | 192 |
| mld.Infinity 2.2 | 67 | 31% | 38 |
| erdnis.Rover 0.3 | 16 | 7% | 30 |
| krillr.mini.JointStrike 2.0.0 | 14 | 6% | 32 |
| pac.ABC 2.1 | 10 | 5% | 20 |
| patson.PatsonTestBot 1.0 | 7 | 3% | 16 |
| pbg.R2D2 1.0 | 5 | 2% | 10 |
| mbh.Mbh 0.1 | 2 | 1% | 10 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 78.1 | 102 / 350 | 2.97 | 14.7% | 31479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.2% | 124 |
| hadur117.nano.SanaroK65 0.3 | 2.1 | 14.7% | 102 |
| fwb.Nine 1.0.1 | 3.4 | 12.1% | 50 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 11.1% | 19 |
| catcat20.Rabbit 0.001 | 4.6 | 10.4% | 34 |
| m3thos.mini.Eva01 0.5.5 | 6.1 | 8.8% | 7 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 8.4% | 4 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.6% | 7 |
| ntc.ControlledChaos 1.1.4 | 8.9 | 5.6% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 79.0 | 9 / 35 | 3013 |
| 2 | 2 | 65.0 | 84.8 | 13 / 35 | 3551 |
| 3 | 2 | 60.5 | 72.1 | 8 / 35 | 3131 |
| 4 | 2 | 62.3 | 77.8 | 9 / 35 | 3155 |
| 5 | 2 | 63.8 | 81.9 | 13 / 35 | 3422 |
| 6 | 2 | 63.2 | 79.0 | 13 / 35 | 3277 |
| 7 | 2 | 60.7 | 73.0 | 10 / 35 | 3055 |
| 8 | 2 | 61.9 | 78.4 | 9 / 35 | 3028 |
| 9 | 3 | 61.3 | 75.2 | 9 / 35 | 2964 |
| 10 | 2 | 61.8 | 80.0 | 9 / 35 | 2883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 81 | 38% |
| fwb.Nine 1.0.1 | 40 | 75% |
| catcat20.Rabbit 0.001 | 31 | 65% |
| nz.jdc.nano.GridFu 1.0 | 13 | 46% |
| bayen.nut.Squirrel 1.615 | 8 | 100% |
| m3thos.mini.Eva01 0.5.5 | 6 | 50% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |
| ntc.ControlledChaos 1.1.4 | 1 | 0% |

Hadur died in 248 of 350 rounds, at a mean tick of 1037. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 124 | 50% | 149 |
| fwb.Nine 1.0.1 | 40 | 16% | 48 |
| nz.jdc.nano.GridFu 1.0 | 30 | 12% | 46 |
| catcat20.Rabbit 0.001 | 25 | 10% | 57 |
| m3thos.mini.Eva01 0.5.5 | 11 | 4% | 17 |
| bayen.nut.Squirrel 1.615 | 8 | 3% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 2% | 7 |
| djdjdj.NanoSkunk10 1.0 | 3 | 1% | 10 |
| ntc.ControlledChaos 1.1.4 | 3 | 1% | 4 |

## Melee bench: F21

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 87.0 | 157 / 350 | 2.17 | 17.3% | 40479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK65 0.3 | 1.5 | 17.3% | 157 |
| eem.EvBot v4.6.16 | 1.5 | 17.6% | 143 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.7% | 18 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 20 |
| oa.weak.BotherBot 0.1 | 5.4 | 8.4% | 3 |
| eld.Hmm 1.0 | 5.6 | 8.4% | 9 |
| fire219.CatBot 1.0 | 7.5 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.2% | 1 |
| PSW.Relentless 0.1 | 8.9 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 89.2 | 15 / 35 | 3994 |
| 2 | 1 | 65.5 | 84.8 | 16 / 35 | 3657 |
| 3 | 2 | 66.9 | 88.6 | 15 / 35 | 3963 |
| 4 | 1 | 67.9 | 89.5 | 17 / 35 | 4241 |
| 5 | 1 | 67.9 | 87.6 | 18 / 35 | 4459 |
| 6 | 1 | 68.1 | 91.4 | 20 / 35 | 4002 |
| 7 | 2 | 66.8 | 85.4 | 15 / 35 | 3953 |
| 8 | 2 | 65.5 | 82.5 | 12 / 35 | 3979 |
| 9 | 2 | 65.3 | 83.8 | 14 / 35 | 3773 |
| 10 | 2 | 67.8 | 87.0 | 15 / 35 | 4458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 178 | 52% |
| dummy.mini.Scimitar 1.01 | 39 | 87% |
| cf.RiO.RiOx 4.2.1 | 24 | 46% |
| eld.Hmm 1.0 | 22 | 86% |
| el.JumpShoot 0.2 | 1 | 0% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 193 of 350 rounds, at a mean tick of 1548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 105 | 54% | 175 |
| dummy.mini.Scimitar 1.01 | 38 | 20% | 85 |
| cf.RiO.RiOx 4.2.1 | 30 | 16% | 40 |
| eld.Hmm 1.0 | 6 | 3% | 27 |
| fire219.CatBot 1.0 | 6 | 3% | 7 |
| oa.weak.BotherBot 0.1 | 3 | 2% | 8 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

## Melee bench: F23

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.0 | 136 / 350 | 2.35 | 16.5% | 35851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.8% | 139 |
| hadur117.nano.SanaroK65 0.3 | 2.1 | 16.5% | 136 |
| cre.Karolos 0.32 | 2.8 | 14.9% | 52 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.4% | 12 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.2% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 8.8% | 3 |
| sample.Walls 1.0 | 7.2 | 8.1% | 1 |
| cw.megas.Blade 0.8 | 7.3 | 8.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 86.3 | 13 / 35 | 3414 |
| 2 | 3 | 64.9 | 80.6 | 11 / 35 | 3220 |
| 3 | 2 | 68.0 | 89.8 | 16 / 35 | 3845 |
| 4 | 2 | 65.9 | 85.4 | 11 / 35 | 3348 |
| 5 | 2 | 66.4 | 85.4 | 14 / 35 | 3260 |
| 6 | 2 | 66.5 | 83.5 | 15 / 35 | 3630 |
| 7 | 2 | 66.0 | 82.2 | 7 / 35 | 3820 |
| 8 | 1 | 68.8 | 89.5 | 23 / 35 | 4102 |
| 9 | 3 | 64.7 | 81.0 | 9 / 35 | 3171 |
| 10 | 2 | 67.6 | 86.7 | 17 / 35 | 4041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 135 | 53% |
| cre.Karolos 0.32 | 49 | 51% |
| stelo.AreaTargetingBot 1.1 | 18 | 72% |
| sample.Walls 1.0 | 15 | 93% |
| stelo.RamTrackSurfer 1.2 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 60% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 214 of 350 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 115 | 54% | 190 |
| cre.Karolos 0.32 | 56 | 26% | 80 |
| stelo.AreaTargetingBot 1.1 | 24 | 11% | 32 |
| stelo.RamTrackSurfer 1.2 | 8 | 4% | 19 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 3% | 15 |
| sample.Walls 1.0 | 3 | 1% | 8 |
| cw.megas.Blade 0.8 | 2 | 1% | 4 |

## Melee bench: F24

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 62.8 | 57 / 350 | 4.35 | 11.3% | 21555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.7% | 85 |
| florent.XSeries.X2 0.12 | 1.9 | 14.1% | 58 |
| davidalves.Phoenix 0.54 | 2.9 | 13.3% | 70 |
| pedersen.Ugluk 1.1.1 | 3.6 | 12.5% | 48 |
| hadur117.nano.SanaroK65 0.3 | 4.8 | 11.3% | 57 |
| oog.melee.Corsair 1.0 | 6.2 | 9.5% | 7 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.5% | 23 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 4 |
| as.FrankTheTank 1.3 | 9.4 | 4.9% | 0 |
| evd.X1 0.01 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.3 | 59.7 | 2 / 35 | 2495 |
| 2 | 5 | 54.8 | 61.6 | 5 / 35 | 2136 |
| 3 | 5 | 55.3 | 62.9 | 6 / 35 | 2109 |
| 4 | 5 | 51.0 | 55.2 | 6 / 35 | 1729 |
| 5 | 5 | 52.9 | 57.1 | 7 / 35 | 1968 |
| 6 | 4 | 57.1 | 66.0 | 7 / 35 | 2343 |
| 7 | 4 | 56.8 | 67.0 | 7 / 35 | 2241 |
| 8 | 5 | 57.2 | 65.7 | 7 / 35 | 2215 |
| 9 | 5 | 57.3 | 68.3 | 5 / 35 | 2102 |
| 10 | 5 | 55.8 | 64.4 | 5 / 35 | 2217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 28 | 71% |
| florent.XSeries.X2 0.12 | 26 | 65% |
| pedersen.Ugluk 1.1.1 | 19 | 53% |
| davidalves.Phoenix 0.54 | 18 | 33% |
| stelo.SoJNanoMelee 1.1 | 15 | 7% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| lunchie.Lunchbox 0.93 | 3 | 33% |

Hadur died in 294 of 350 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 60 | 20% | 77 |
| florent.XSeries.X2 0.12 | 59 | 20% | 77 |
| davidalves.Phoenix 0.54 | 57 | 19% | 65 |
| pedersen.Ugluk 1.1.1 | 52 | 18% | 57 |
| stelo.SoJNanoMelee 1.1 | 30 | 10% | 31 |
| lunchie.Lunchbox 0.93 | 13 | 4% | 14 |
| oog.melee.Corsair 1.0 | 11 | 4% | 15 |
| evd.X1 0.01 | 6 | 2% | 8 |
| as.FrankTheTank 1.3 | 5 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroK65 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 75.4 | 109 / 350 | 2.97 | 15.5% | 23061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.4 | 16.1% | 78 |
| hadur117.nano.SanaroK65 0.3 | 2.3 | 15.5% | 109 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 15.1% | 66 |
| jdw.Hurricane 1.4 | 4.1 | 12.9% | 33 |
| ds.Oo 2.2 | 5.1 | 10.8% | 31 |
| gjr.Cephalosporin 0.1 | 6.0 | 9.6% | 23 |
| adt.Ar2 1.1 | 7.3 | 7.6% | 5 |
| awesomeness.Elite 1.0 | 7.4 | 7.6% | 4 |
| amk.ChumbaMini 0.2 | 9.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 76.8 | 11 / 35 | 2282 |
| 2 | 3 | 59.3 | 70.0 | 13 / 35 | 2272 |
| 3 | 3 | 60.7 | 76.1 | 10 / 35 | 2262 |
| 4 | 1 | 61.5 | 78.2 | 11 / 35 | 2352 |
| 5 | 3 | 59.3 | 72.1 | 8 / 35 | 2232 |
| 6 | 3 | 57.3 | 66.4 | 10 / 35 | 2158 |
| 7 | 2 | 61.7 | 80.4 | 12 / 35 | 2089 |
| 8 | 3 | 60.7 | 74.3 | 10 / 35 | 2362 |
| 9 | 2 | 62.6 | 81.1 | 9 / 35 | 2537 |
| 10 | 1 | 62.5 | 78.6 | 15 / 35 | 2515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 71 | 41% |
| voidious.micro.BlitzBat 1.05 | 49 | 43% |
| jdw.Hurricane 1.4 | 34 | 76% |
| gjr.Cephalosporin 0.1 | 21 | 57% |
| ds.Oo 2.2 | 20 | 60% |
| adt.Ar2 1.1 | 8 | 63% |
| awesomeness.Elite 1.0 | 4 | 100% |

Hadur died in 241 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 78 | 32% | 111 |
| voidious.micro.BlitzBat 1.05 | 65 | 27% | 85 |
| ds.Oo 2.2 | 33 | 14% | 46 |
| jdw.Hurricane 1.4 | 32 | 13% | 51 |
| gjr.Cephalosporin 0.1 | 14 | 6% | 25 |
| adt.Ar2 1.1 | 11 | 5% | 18 |
| awesomeness.Elite 1.0 | 5 | 2% | 10 |
| amk.ChumbaMini 0.2 | 3 | 1% | 4 |

## Melee bench: F26

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 71.2 | 71 / 350 | 3.59 | 13.1% | 29894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.1 | 16.0% | 104 |
| shu.nitro.LENIN .T34 | 2.4 | 13.7% | 82 |
| hadur117.nano.SanaroK65 0.3 | 2.6 | 13.1% | 71 |
| lrem.Spectre 0.4.4 | 3.9 | 12.4% | 41 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 11.1% | 21 |
| js.PinBall 1.6 | 5.7 | 11.1% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 8.9% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.5% | 5 |
| sample.SpinBot 1.0 | 8.8 | 5.6% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 78.7 | 12 / 35 | 3018 |
| 2 | 2 | 60.8 | 70.8 | 11 / 35 | 2985 |
| 3 | 2 | 59.2 | 68.6 | 9 / 35 | 2935 |
| 4 | 3 | 59.5 | 70.5 | 5 / 35 | 3072 |
| 5 | 4 | 58.4 | 67.6 | 4 / 35 | 2877 |
| 6 | 3 | 60.5 | 74.0 | 6 / 35 | 3018 |
| 7 | 3 | 58.9 | 70.5 | 3 / 35 | 3070 |
| 8 | 1 | 61.2 | 75.9 | 11 / 35 | 2913 |
| 9 | 3 | 59.4 | 69.2 | 6 / 35 | 2937 |
| 10 | 3 | 58.4 | 66.0 | 4 / 35 | 3069 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 52 | 44% |
| shu.nitro.LENIN .T34 | 37 | 19% |
| lrem.Spectre 0.4.4 | 27 | 78% |
| js.PinBall 1.6 | 13 | 92% |
| gh.mini.GrubbmOne 1.0 | 12 | 25% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 0% |

Hadur died in 280 of 350 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 78 | 28% | 103 |
| shu.nitro.LENIN .T34 | 59 | 21% | 72 |
| gh.mini.GrubbmOne 1.0 | 45 | 16% | 49 |
| lrem.Spectre 0.4.4 | 38 | 14% | 49 |
| js.PinBall 1.6 | 28 | 10% | 36 |
| jaybot.adv.bots.JayBot 2.0 | 17 | 6% | 20 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 3% | 13 |
| sample.SpinBot 1.0 | 7 | 3% | 8 |

## Melee bench: F27

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 68.3 | 115 / 350 | 3.85 | 13.3% | 28630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.4 | 15.6% | 115 |
| hadur117.nano.SanaroK65 0.3 | 2.7 | 13.3% | 115 |
| wee.Gem 1.8.4 | 3.0 | 12.8% | 67 |
| sheldor.melee.nano.TestMelee 0.1 | 3.9 | 11.4% | 27 |
| EH.Eagle 1.0.6 | 4.3 | 10.9% | 7 |
| joe.ADinosaur 1.0 | 6.5 | 8.8% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 9.0% | 8 |
| throxbot.ThroxBot 0.1 | 8.2 | 7.3% | 5 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.7% | 5 |
| cs.Grudge 1.0 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 76.5 | 13 / 35 | 2729 |
| 2 | 1 | 59.9 | 73.0 | 13 / 35 | 2508 |
| 3 | 6 | 51.5 | 41.9 | 4 / 35 | 3610 |
| 4 | 2 | 60.8 | 75.6 | 13 / 35 | 2470 |
| 5 | 2 | 61.9 | 76.8 | 15 / 35 | 2590 |
| 6 | 2 | 60.7 | 75.9 | 13 / 35 | 2481 |
| 7 | 4 | 57.7 | 55.2 | 9 / 35 | 3800 |
| 8 | 2 | 62.0 | 80.6 | 14 / 35 | 2414 |
| 9 | 1 | 62.8 | 81.9 | 14 / 35 | 2490 |
| 10 | 5 | 53.3 | 46.0 | 7 / 35 | 3538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 82 | 72% |
| wee.Gem 1.8.4 | 34 | 59% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 68% |
| EH.Eagle 1.0.6 | 15 | 87% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 50% |
| throxbot.ThroxBot 0.1 | 3 | 67% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 236 of 350 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 73 | 31% | 130 |
| wee.Gem 1.8.4 | 44 | 19% | 66 |
| sheldor.melee.nano.TestMelee 0.1 | 31 | 13% | 46 |
| joe.ADinosaur 1.0 | 26 | 11% | 28 |
| cs.Grudge 1.0 | 17 | 7% | 17 |
| caimano.Furia_Ceca 0.22 | 14 | 6% | 16 |
| EH.Eagle 1.0.6 | 11 | 5% | 25 |
| throxbot.ThroxBot 0.1 | 10 | 4% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 9 | 4% | 10 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 81.4 | 127 / 350 | 2.67 | 15.4% | 29676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.5% | 106 |
| hadur117.nano.SanaroK65 0.3 | 1.7 | 15.4% | 127 |
| uji.Antique 1.0 | 3.1 | 12.7% | 58 |
| qohnil.blot.BlotBot 3.61 | 4.6 | 10.9% | 29 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.2% | 9 |
| amk.ChumbaWumba 0.3 | 6.1 | 8.6% | 4 |
| ahr.ice.Ice 1.0.2 | 6.6 | 8.1% | 11 |
| matt.advanced.Katana 1.0 | 8.6 | 6.3% | 5 |
| stelo.Lifestealer 1.0 | 9.1 | 5.7% | 1 |
| stelo.PianistNano 1.2 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 78.7 | 12 / 35 | 3030 |
| 2 | 2 | 64.2 | 85.4 | 15 / 35 | 2809 |
| 3 | 1 | 64.4 | 84.8 | 17 / 35 | 2919 |
| 4 | 2 | 63.7 | 81.3 | 12 / 35 | 3271 |
| 5 | 2 | 60.5 | 72.1 | 9 / 35 | 2856 |
| 6 | 2 | 64.9 | 88.3 | 13 / 35 | 2776 |
| 7 | 1 | 64.1 | 82.5 | 15 / 35 | 3097 |
| 8 | 2 | 62.2 | 81.9 | 8 / 35 | 2631 |
| 9 | 2 | 60.9 | 75.9 | 10 / 35 | 3042 |
| 10 | 1 | 65.0 | 83.5 | 16 / 35 | 3245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 129 | 55% |
| uji.Antique 1.0 | 42 | 60% |
| qohnil.blot.BlotBot 3.61 | 21 | 43% |
| pfvicm.Sobieski 7.2.3b | 12 | 75% |
| amk.ChumbaWumba 0.3 | 9 | 89% |
| ahr.ice.Ice 1.0.2 | 8 | 38% |
| matt.advanced.Katana 1.0 | 4 | 25% |
| stelo.PianistNano 1.2 | 2 | 50% |

Hadur died in 226 of 350 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 97 | 43% | 152 |
| pfvicm.Sobieski 7.2.3b | 38 | 17% | 43 |
| uji.Antique 1.0 | 30 | 13% | 66 |
| qohnil.blot.BlotBot 3.61 | 21 | 9% | 33 |
| amk.ChumbaWumba 0.3 | 17 | 8% | 21 |
| ahr.ice.Ice 1.0.2 | 6 | 3% | 12 |
| stelo.Lifestealer 1.0 | 6 | 3% | 9 |
| matt.advanced.Katana 1.0 | 6 | 3% | 7 |
| stelo.PianistNano 1.2 | 4 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 73.7 | 83 / 350 | 3.37 | 14.1% | 28999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.3 | 16.1% | 117 |
| zyx.mega.YersiniaPestis 3.1 | 1.9 | 15.6% | 85 |
| hadur117.nano.SanaroK65 0.3 | 2.8 | 14.1% | 83 |
| myl.micro.Troodon 1.10 | 4.2 | 12.3% | 21 |
| jok.PheonixM 0.1.2 | 4.8 | 11.3% | 22 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.4% | 2 |
| DBall.Anarchy 0.1 | 6.8 | 7.5% | 17 |
| fullsail.TimbotNoPrediction 1.0 | 7.9 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.4% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 67.3 | 6 / 35 | 3077 |
| 2 | 3 | 60.9 | 73.7 | 4 / 35 | 2877 |
| 3 | 3 | 61.3 | 72.1 | 9 / 35 | 2846 |
| 4 | 3 | 60.6 | 71.4 | 7 / 35 | 2793 |
| 5 | 3 | 62.1 | 74.9 | 10 / 35 | 2910 |
| 6 | 3 | 63.1 | 80.0 | 11 / 35 | 2704 |
| 7 | 2 | 62.3 | 72.4 | 14 / 35 | 2928 |
| 8 | 3 | 63.0 | 80.3 | 5 / 35 | 3055 |
| 9 | 3 | 60.5 | 71.1 | 8 / 35 | 2758 |
| 10 | 2 | 61.6 | 73.3 | 9 / 35 | 3051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 80 | 11% |
| zyx.mega.YersiniaPestis 3.1 | 51 | 71% |
| myl.micro.Troodon 1.10 | 25 | 80% |
| jok.PheonixM 0.1.2 | 11 | 64% |
| DBall.Anarchy 0.1 | 10 | 60% |
| jangs.ns51 1.0 | 3 | 67% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 1356. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 124 | 46% | 136 |
| zyx.mega.YersiniaPestis 3.1 | 56 | 21% | 89 |
| myl.micro.Troodon 1.10 | 32 | 12% | 47 |
| jok.PheonixM 0.1.2 | 30 | 11% | 43 |
| DBall.Anarchy 0.1 | 9 | 3% | 16 |
| ph.melee.ArcherME 0.3 | 7 | 3% | 9 |
| jangs.ns51 1.0 | 6 | 2% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 1% | 3 |

## Melee bench: F30

hadur117.nano.SanaroK65 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 64.0 | 51 / 350 | 3.88 | 12.9% | 24303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.5 | 16.5% | 120 |
| oog.melee.Capulet 1.2 | 2.0 | 15.8% | 79 |
| stelo.PastFuture 2.3.2 | 2.5 | 15.5% | 54 |
| hadur117.nano.SanaroK65 0.3 | 4.0 | 12.9% | 51 |
| intruder.PrairieWolf 2.61 | 5.5 | 9.9% | 16 |
| tripphippy.Alice 1.1 | 6.2 | 9.3% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 6.9 | 9.0% | 18 |
| ntc.Opposite 1.5 | 7.4 | 8.7% | 1 |
| GarmBox.Anger 1.0 | 9.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 53.4 | 55.0 | 2 / 35 | 2466 |
| 2 | 4 | 56.6 | 64.6 | 5 / 35 | 2398 |
| 3 | 4 | 56.9 | 67.5 | 6 / 35 | 2215 |
| 4 | 4 | 58.3 | 66.1 | 4 / 35 | 2781 |
| 5 | 4 | 56.1 | 61.4 | 3 / 35 | 2617 |
| 6 | 4 | 56.0 | 63.6 | 4 / 35 | 2373 |
| 7 | 4 | 54.6 | 58.2 | 4 / 35 | 2296 |
| 8 | 4 | 57.4 | 66.4 | 5 / 35 | 2590 |
| 9 | 4 | 58.6 | 68.9 | 10 / 35 | 2425 |
| 10 | 4 | 57.3 | 67.9 | 8 / 35 | 2142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 48 | 25% |
| oog.melee.Capulet 1.2 | 30 | 33% |
| stelo.PastFuture 2.3.2 | 25 | 56% |
| intruder.PrairieWolf 2.61 | 11 | 73% |
| fowl3628800.LightningBolt 2.6.0 | 8 | 50% |
| tripphippy.Alice 1.1 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 76 | 25% | 88 |
| stelo.PastFuture 2.3.2 | 68 | 23% | 86 |
| oog.melee.Capulet 1.2 | 68 | 23% | 81 |
| tripphippy.Alice 1.1 | 32 | 11% | 33 |
| fowl3628800.LightningBolt 2.6.0 | 23 | 8% | 25 |
| ntc.Opposite 1.5 | 20 | 7% | 20 |
| intruder.PrairieWolf 2.61 | 11 | 4% | 16 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.1 | 61.3 | 45 / 350 | 4.48 | 11.1% | 21692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.7% | 180 |
| gh.mini.Griezel 0.2 | 2.4 | 13.6% | 69 |
| d414.nano.Quantum 1.0.0 | 3.5 | 11.9% | 18 |
| spinnercat.micro.Tyger 0.1 | 3.9 | 11.8% | 20 |
| hadur117.nano.SanaroK65 0.3 | 4.3 | 11.1% | 45 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.5% | 15 |
| timmit.nano.TimDog 0.33 | 7.4 | 6.8% | 2 |
| fm.mammillarias 1.3 | 7.6 | 6.8% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.0 | 63.2 | 7 / 35 | 2224 |
| 2 | 5 | 56.7 | 64.1 | 6 / 35 | 2272 |
| 3 | 4 | 53.6 | 56.8 | 5 / 35 | 2086 |
| 4 | 3 | 58.8 | 71.7 | 5 / 35 | 2115 |
| 5 | 4 | 55.0 | 61.6 | 3 / 35 | 2327 |
| 6 | 5 | 52.1 | 55.2 | 3 / 35 | 1794 |
| 7 | 5 | 54.6 | 60.3 | 2 / 35 | 2209 |
| 8 | 4 | 57.3 | 66.3 | 5 / 35 | 2529 |
| 9 | 6 | 50.4 | 51.7 | 2 / 35 | 1866 |
| 10 | 3 | 56.1 | 62.2 | 7 / 35 | 2270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 50 | 42% |
| abc.Shadow 3.84i | 47 | 38% |
| spinnercat.micro.Tyger 0.1 | 8 | 38% |
| d414.nano.Quantum 1.0.0 | 6 | 17% |
| gh.nano.Grofvuil 0.2 | 3 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 80 | 26% | 100 |
| abc.Shadow 3.84i | 68 | 22% | 85 |
| spinnercat.micro.Tyger 0.1 | 50 | 16% | 56 |
| d414.nano.Quantum 1.0.0 | 46 | 15% | 47 |
| gh.nano.Grofvuil 0.2 | 24 | 8% | 25 |
| fm.mammillarias 1.3 | 23 | 8% | 23 |
| Gecko.ultimateGeckoBot 1.0 | 8 | 3% | 8 |
| timmit.nano.TimDog 0.33 | 4 | 1% | 4 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 78.2 | 154 / 350 | 2.97 | 14.9% | 29490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK65 0.3 | 1.4 | 14.9% | 154 |
| kawigi.sbf.FloodHT 0.9.2 | 1.6 | 15.1% | 87 |
| apc.botM 3.0 | 3.1 | 12.7% | 43 |
| lxx.ConceptA 0.8 | 4.4 | 10.9% | 11 |
| vjik.UnViolation 1.1 | 4.7 | 10.8% | 29 |
| bayen.UbaMicro 1.4 | 5.8 | 9.4% | 9 |
| panzer.Panzer 0.2 | 7.5 | 7.2% | 1 |
| yk.JahMicro 1.0 | 8.4 | 6.7% | 9 |
| conscience.Electron 1.3g | 8.6 | 6.7% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.5% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 81.3 | 19 / 35 | 3619 |
| 2 | 1 | 60.1 | 72.7 | 11 / 35 | 3015 |
| 3 | 1 | 62.9 | 80.0 | 19 / 35 | 2868 |
| 4 | 2 | 61.3 | 76.2 | 14 / 35 | 2847 |
| 5 | 2 | 61.9 | 79.0 | 17 / 35 | 2750 |
| 6 | 1 | 64.8 | 84.8 | 19 / 35 | 2983 |
| 7 | 2 | 61.0 | 78.1 | 12 / 35 | 2757 |
| 8 | 2 | 57.3 | 65.4 | 11 / 35 | 2606 |
| 9 | 1 | 63.9 | 85.1 | 16 / 35 | 3209 |
| 10 | 1 | 62.1 | 79.0 | 16 / 35 | 2836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 98 | 69% |
| apc.botM 3.0 | 45 | 67% |
| vjik.UnViolation 1.1 | 22 | 77% |
| lxx.ConceptA 0.8 | 21 | 86% |
| yk.JahMicro 1.0 | 11 | 73% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| donjezza.Jezza 1.0 | 5 | 40% |
| conscience.Electron 1.3g | 3 | 100% |
| panzer.Panzer 0.2 | 1 | 0% |

Hadur died in 196 of 350 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 57 | 29% | 128 |
| lxx.ConceptA 0.8 | 44 | 22% | 50 |
| apc.botM 3.0 | 28 | 14% | 58 |
| bayen.UbaMicro 1.4 | 16 | 8% | 25 |
| vjik.UnViolation 1.1 | 15 | 8% | 39 |
| yk.JahMicro 1.0 | 12 | 6% | 16 |
| conscience.Electron 1.3g | 10 | 5% | 15 |
| panzer.Panzer 0.2 | 9 | 5% | 9 |
| donjezza.Jezza 1.0 | 5 | 3% | 9 |

## Melee bench: F33

hadur117.nano.SanaroK65 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 76.8 | 75 / 350 | 2.85 | 16.0% | 30198 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.2 | 19.0% | 116 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 16.1% | 91 |
| hadur117.nano.SanaroK65 0.3 | 2.5 | 16.0% | 75 |
| labg.Cataclysm 2.05 | 3.9 | 13.4% | 46 |
| baal.nano.N 1.42 | 5.3 | 9.9% | 5 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.7 | 9.6% | 16 |
| zyx.micro.Ant 1.1 | 7.1 | 6.5% | 1 |
| sanja.First 0.1 | 8.2 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 73.2 | 11 / 35 | 2888 |
| 2 | 3 | 63.1 | 78.2 | 8 / 35 | 3240 |
| 3 | 2 | 63.1 | 77.5 | 8 / 35 | 3197 |
| 4 | 2 | 62.6 | 78.6 | 7 / 35 | 2870 |
| 5 | 2 | 63.0 | 79.6 | 5 / 35 | 2856 |
| 6 | 4 | 59.1 | 68.2 | 3 / 35 | 2826 |
| 7 | 1 | 64.0 | 81.8 | 12 / 35 | 3098 |
| 8 | 3 | 64.9 | 82.9 | 9 / 35 | 3237 |
| 9 | 3 | 61.3 | 74.6 | 6 / 35 | 2848 |
| 10 | 3 | 61.2 | 73.6 | 6 / 35 | 3138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 71 | 35% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 17% |
| labg.Cataclysm 2.05 | 36 | 58% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 45% |
| baal.nano.N 1.42 | 8 | 100% |
| sanja.First 0.1 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 276 of 350 rounds, at a mean tick of 1581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 116 | 42% | 143 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 82 | 30% | 96 |
| labg.Cataclysm 2.05 | 47 | 17% | 66 |
| kinsen.melee.Angsaichmophobia 1.8c | 18 | 7% | 23 |
| baal.nano.N 1.42 | 7 | 3% | 13 |
| zyx.micro.Ant 1.1 | 5 | 2% | 6 |
| sanja.First 0.1 | 1 | 0% | 3 |

## Melee bench: F34

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.7 | 80 / 350 | 3.01 | 14.3% | 31053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.3 | 17.0% | 115 |
| kid.Gladiator .7.2 | 1.7 | 17.1% | 107 |
| hadur117.nano.SanaroK65 0.3 | 3.0 | 14.3% | 80 |
| jcs.Seth 1.8 | 4.3 | 11.5% | 25 |
| tcf.Reach 3 | 4.8 | 11.4% | 15 |
| cli.Dancer 1.1 | 5.9 | 9.9% | 7 |
| ratosh.Wesco 1.4 | 7.0 | 7.7% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 71.7 | 7 / 35 | 2807 |
| 2 | 3 | 62.1 | 77.1 | 7 / 35 | 2925 |
| 3 | 3 | 62.5 | 79.0 | 6 / 35 | 2969 |
| 4 | 3 | 63.6 | 79.4 | 11 / 35 | 3132 |
| 5 | 3 | 63.4 | 77.5 | 8 / 35 | 3226 |
| 6 | 3 | 62.8 | 79.0 | 7 / 35 | 2985 |
| 7 | 3 | 63.6 | 80.6 | 10 / 35 | 2965 |
| 8 | 3 | 64.1 | 79.7 | 9 / 35 | 3389 |
| 9 | 3 | 62.3 | 72.4 | 9 / 35 | 3284 |
| 10 | 3 | 63.3 | 80.0 | 6 / 35 | 3371 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 70 | 60% |
| kid.Gladiator .7.2 | 64 | 20% |
| jcs.Seth 1.8 | 27 | 56% |
| tcf.Reach 3 | 12 | 50% |
| ratosh.Wesco 1.4 | 3 | 100% |
| cli.Dancer 1.1 | 3 | 33% |

Hadur died in 270 of 350 rounds, at a mean tick of 1132. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 124 | 46% | 130 |
| stelo.Spread 0.9 | 80 | 30% | 125 |
| tcf.Reach 3 | 25 | 9% | 32 |
| jcs.Seth 1.8 | 21 | 8% | 39 |
| ratosh.Wesco 1.4 | 9 | 3% | 11 |
| cli.Dancer 1.1 | 8 | 3% | 9 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 0% | 2 |

## Melee bench: F35

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 69.0 | 26 / 350 | 3.79 | 12.1% | 22648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 262 |
| gh.mini.Gruwel 0.9 | 2.4 | 13.6% | 38 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.6 | 12.5% | 19 |
| rz.HawkOnFire 0.1 | 4.0 | 12.2% | 5 |
| hadur117.nano.SanaroK65 0.3 | 4.0 | 12.1% | 26 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 6.8% | 1 |
| wit.Chuliath 1.0 | 6.6 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.4 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.0 | 58.1 | 0 / 35 | 2201 |
| 2 | 4 | 57.5 | 67.6 | 1 / 35 | 2469 |
| 3 | 4 | 58.5 | 69.2 | 2 / 35 | 2487 |
| 4 | 3 | 60.4 | 75.6 | 5 / 35 | 2463 |
| 5 | 4 | 58.3 | 70.8 | 3 / 35 | 2233 |
| 6 | 4 | 57.5 | 68.6 | 3 / 35 | 2087 |
| 7 | 3 | 58.6 | 69.8 | 2 / 35 | 2409 |
| 8 | 4 | 58.7 | 73.0 | 4 / 35 | 1943 |
| 9 | 5 | 56.9 | 67.6 | 0 / 35 | 2142 |
| 10 | 4 | 58.3 | 69.2 | 6 / 35 | 2214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 86 | 0% |
| gh.mini.Gruwel 0.9 | 24 | 46% |
| rz.HawkOnFire 0.1 | 11 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 50% |

Hadur died in 324 of 350 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 150 | 46% | 150 |
| gh.mini.Gruwel 0.9 | 63 | 19% | 75 |
| dmh.robocode.robot.BlackDeath 9.2 | 42 | 13% | 46 |
| rz.HawkOnFire 0.1 | 35 | 11% | 45 |
| myl.nano.KomoriNinja 1.1 | 14 | 4% | 14 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 10 | 3% | 10 |
| wit.Chuliath 1.0 | 6 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 76.4 | 138 / 350 | 3.12 | 15.0% | 31241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK65 0.3 | 1.2 | 15.0% | 138 |
| bzdp.Pansy 2.1 | 2.4 | 13.0% | 54 |
| alpha.RainingFire 1.0 | 2.5 | 13.0% | 63 |
| bvh.micro.Freya 0.3 | 4.6 | 11.2% | 27 |
| mz.Cork 0.1 | 4.8 | 11.2% | 26 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.8% | 17 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.8% | 11 |
| dl.BetterWalls 1.0 | 8.3 | 6.9% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.9% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 76.2 | 15 / 35 | 3372 |
| 2 | 2 | 59.6 | 70.5 | 11 / 35 | 2958 |
| 3 | 1 | 65.0 | 83.8 | 16 / 35 | 3520 |
| 4 | 1 | 64.2 | 81.9 | 18 / 35 | 3108 |
| 5 | 1 | 63.1 | 77.5 | 18 / 35 | 3130 |
| 6 | 1 | 61.2 | 77.5 | 6 / 35 | 2957 |
| 7 | 1 | 63.0 | 77.1 | 13 / 35 | 3181 |
| 8 | 1 | 60.6 | 71.7 | 14 / 35 | 2735 |
| 9 | 2 | 60.2 | 69.5 | 13 / 35 | 2999 |
| 10 | 1 | 62.9 | 78.4 | 14 / 35 | 3281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 56% |
| alpha.RainingFire 1.0 | 43 | 58% |
| mz.Cork 0.1 | 36 | 83% |
| bvh.micro.Freya 0.3 | 27 | 78% |
| bvh.mini.Fenrir 0.39 | 17 | 76% |
| m3thos.Eva02 0.7.1 | 14 | 79% |
| sample.MyFirstRobot 1.0 | 8 | 38% |
| dl.BetterWalls 1.0 | 5 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 212 of 350 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 59 | 28% | 83 |
| bzdp.Pansy 2.1 | 49 | 23% | 85 |
| mz.Cork 0.1 | 27 | 13% | 62 |
| bvh.mini.Fenrir 0.39 | 27 | 13% | 32 |
| bvh.micro.Freya 0.3 | 21 | 10% | 33 |
| m3thos.Eva02 0.7.1 | 10 | 5% | 25 |
| sample.MyFirstRobot 1.0 | 9 | 4% | 13 |
| dl.BetterWalls 1.0 | 5 | 2% | 10 |
| squidM.TentalceMeleeNano 1.1 | 5 | 2% | 6 |

## Melee bench: F37

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 79.5 | 140 / 350 | 2.85 | 15.4% | 39612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK65 0.3 | 1.0 | 15.4% | 140 |
| germ.TheMind .2 | 2.6 | 11.8% | 53 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.6 | 10.8% | 29 |
| EBBU.Sim2 1.02 | 4.1 | 10.4% | 29 |
| agrach.Dalek 1.0 | 5.1 | 9.6% | 29 |
| stelo.UntouchableNano 1.3 | 6.2 | 9.1% | 17 |
| lmk.ACPFinal 0.1 | 7.2 | 8.8% | 17 |
| mb.Beast 0.1 | 7.8 | 8.5% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.8% | 1 |
| skm.Ryubot 1.0 | 8.7 | 7.8% | 24 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.3 | 76.8 | 12 / 35 | 3357 |
| 2 | 1 | 63.8 | 82.5 | 19 / 35 | 3876 |
| 3 | 1 | 62.0 | 78.4 | 14 / 35 | 3819 |
| 4 | 1 | 62.9 | 80.3 | 15 / 35 | 4148 |
| 5 | 1 | 61.0 | 75.9 | 10 / 35 | 4114 |
| 6 | 1 | 61.6 | 76.5 | 13 / 35 | 4127 |
| 7 | 1 | 62.8 | 80.0 | 12 / 35 | 4440 |
| 8 | 1 | 63.9 | 86.3 | 16 / 35 | 3773 |
| 9 | 1 | 62.3 | 80.0 | 13 / 35 | 3937 |
| 10 | 1 | 62.5 | 78.1 | 16 / 35 | 4021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 58 | 69% |
| EBBU.Sim2 1.02 | 33 | 36% |
| stelo.UntouchableNano 1.3 | 26 | 92% |
| skm.Ryubot 1.0 | 24 | 50% |
| agrach.Dalek 1.0 | 22 | 73% |
| lmk.ACPFinal 0.1 | 19 | 74% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 50% |
| mb.Beast 0.1 | 16 | 75% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 215 of 350 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 50 | 23% | 81 |
| EBBU.Sim2 1.02 | 31 | 14% | 42 |
| lmk.ACPFinal 0.1 | 26 | 12% | 41 |
| agrach.Dalek 1.0 | 24 | 11% | 44 |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 11% | 38 |
| stelo.UntouchableNano 1.3 | 18 | 8% | 38 |
| skm.Ryubot 1.0 | 17 | 8% | 25 |
| mb.Beast 0.1 | 13 | 6% | 26 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 6% | 13 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 69.7 | 62 / 350 | 3.73 | 12.8% | 27184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.1 | 16.6% | 142 |
| bvh.mini.Freya 0.55 | 2.4 | 13.1% | 36 |
| hadur117.nano.SanaroK65 0.3 | 3.1 | 12.8% | 62 |
| bts.mega.Gnarly 1.4 | 4.4 | 11.6% | 51 |
| cs.Wren 1.0 | 4.7 | 11.2% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.7% | 22 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.5% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.1% | 6 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.5% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.5 | 63.2 | 4 / 35 | 2698 |
| 2 | 3 | 57.7 | 70.5 | 4 / 35 | 2284 |
| 3 | 4 | 57.9 | 67.3 | 6 / 35 | 2706 |
| 4 | 4 | 58.5 | 68.6 | 8 / 35 | 2647 |
| 5 | 2 | 60.0 | 72.4 | 8 / 35 | 2728 |
| 6 | 2 | 57.9 | 69.2 | 3 / 35 | 2722 |
| 7 | 3 | 60.3 | 73.3 | 8 / 35 | 2825 |
| 8 | 3 | 58.4 | 69.2 | 5 / 35 | 2602 |
| 9 | 2 | 61.8 | 74.9 | 10 / 35 | 3209 |
| 10 | 3 | 58.3 | 68.3 | 6 / 35 | 2763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 77 | 42% |
| bts.mega.Gnarly 1.4 | 25 | 32% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 33% |
| bvh.mini.Freya 0.55 | 15 | 53% |
| cs.Wren 1.0 | 9 | 56% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 95 | 33% | 126 |
| bvh.mini.Freya 0.55 | 54 | 19% | 56 |
| bts.mega.Gnarly 1.4 | 43 | 15% | 52 |
| cs.Wren 1.0 | 31 | 11% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 30 | 10% | 38 |
| kdf.KoulDestroyer 1.0 | 24 | 8% | 28 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 2% | 9 |
| matt.UnderDark3 2.4.34 | 4 | 1% | 4 |
| bzdp.BoxCar 2.0 | 3 | 1% | 3 |

## Melee bench: F39

hadur117.nano.SanaroK65 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 70.6 | 38 / 350 | 3.35 | 13.7% | 26425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 17.8% | 87 |
| az.Ololobot 0.2.4 | 1.9 | 16.3% | 158 |
| hadur117.nano.SanaroK65 0.3 | 3.2 | 13.7% | 38 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 11.1% | 42 |
| winamp32.micro.MicroMacro 1.0 | 5.4 | 9.9% | 15 |
| apollokidd.ApolloKidd 0.9 | 5.6 | 9.9% | 6 |
| gimp.GimpBot 0.1 | 6.6 | 8.8% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.0 | 6.9% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.9 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.0 | 63.6 | 2 / 35 | 2695 |
| 2 | 3 | 59.6 | 75.7 | 5 / 35 | 2706 |
| 3 | 3 | 55.8 | 66.1 | 2 / 35 | 2559 |
| 4 | 3 | 57.2 | 71.1 | 4 / 35 | 2355 |
| 5 | 4 | 55.0 | 63.2 | 3 / 35 | 2678 |
| 6 | 3 | 56.6 | 68.2 | 3 / 35 | 2670 |
| 7 | 3 | 57.9 | 70.7 | 4 / 35 | 2771 |
| 8 | 3 | 59.5 | 76.8 | 6 / 35 | 2619 |
| 9 | 3 | 60.2 | 78.2 | 5 / 35 | 2911 |
| 10 | 3 | 57.6 | 72.5 | 4 / 35 | 2461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 82 | 5% |
| bvh.fry.Freya 0.82 | 55 | 27% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 43% |
| winamp32.micro.MicroMacro 1.0 | 11 | 73% |
| gimp.GimpBot 0.1 | 5 | 80% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 0% |

Hadur died in 313 of 350 rounds, at a mean tick of 1395. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 112 | 36% | 125 |
| az.Ololobot 0.2.4 | 99 | 32% | 103 |
| stelo.SoRobotNanoMelee 1.2 | 41 | 13% | 44 |
| apollokidd.ApolloKidd 0.9 | 33 | 11% | 34 |
| winamp32.micro.MicroMacro 1.0 | 12 | 4% | 20 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 3% | 9 |
| gimp.GimpBot 0.1 | 5 | 2% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 1% | 5 |

## Melee bench: F41

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 74.2 | 106 / 350 | 3.32 | 13.9% | 26388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 17.1% | 159 |
| hadur117.nano.SanaroK65 0.3 | 2.5 | 13.9% | 106 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.3% | 35 |
| ary.Swarm 1.1 | 3.3 | 13.2% | 14 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.5% | 23 |
| shrub.Silver v048 | 5.9 | 9.2% | 8 |
| zyx.nano.Ant 1.1 | 7.1 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.0% | 3 |
| stelo.Mirror 1.1 | 8.9 | 5.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 74.6 | 12 / 35 | 2622 |
| 2 | 3 | 60.5 | 72.1 | 13 / 35 | 2571 |
| 3 | 2 | 61.4 | 74.9 | 14 / 35 | 2433 |
| 4 | 3 | 60.8 | 74.3 | 8 / 35 | 2756 |
| 5 | 3 | 61.0 | 73.3 | 7 / 35 | 2626 |
| 6 | 2 | 61.8 | 76.8 | 8 / 35 | 2517 |
| 7 | 2 | 62.5 | 77.5 | 15 / 35 | 2517 |
| 8 | 3 | 59.8 | 69.2 | 10 / 35 | 2854 |
| 9 | 3 | 60.4 | 72.1 | 8 / 35 | 2611 |
| 10 | 2 | 62.6 | 77.5 | 11 / 35 | 2881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 101 | 41% |
| lessonz.robocode.Oz 0.5.0 | 36 | 69% |
| ary.Swarm 1.1 | 27 | 89% |
| simonton.nano.MeleeSeed 1.8 | 13 | 100% |
| shrub.Silver v048 | 5 | 20% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 245 of 350 rounds, at a mean tick of 1037. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 92 | 38% | 133 |
| ary.Swarm 1.1 | 48 | 20% | 74 |
| lessonz.robocode.Oz 0.5.0 | 40 | 16% | 56 |
| simonton.nano.MeleeSeed 1.8 | 32 | 13% | 47 |
| shrub.Silver v048 | 13 | 5% | 14 |
| zyx.nano.Ant 1.1 | 10 | 4% | 11 |
| stelo.Mirror 1.1 | 4 | 2% | 6 |
| jsal.Jsalbot 1.0 | 4 | 2% | 6 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 75.0 | 80 / 350 | 3.25 | 14.0% | 31925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.5% | 160 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 14.1% | 37 |
| hadur117.nano.SanaroK65 0.3 | 3.0 | 14.0% | 80 |
| ara.Shera 0.88 | 3.0 | 13.9% | 63 |
| amz.NanoClone 1.41 | 5.1 | 9.4% | 5 |
| maribo.IotaCT 1.1 | 6.0 | 8.1% | 0 |
| dsw.StaticD 1.0 | 7.0 | 7.1% | 5 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.4 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 75.6 | 6 / 35 | 3123 |
| 2 | 4 | 60.9 | 72.7 | 10 / 35 | 3056 |
| 3 | 4 | 61.0 | 74.9 | 4 / 35 | 3214 |
| 4 | 2 | 64.4 | 82.9 | 10 / 35 | 3823 |
| 5 | 2 | 61.9 | 75.9 | 7 / 35 | 3429 |
| 6 | 2 | 62.1 | 76.5 | 12 / 35 | 3095 |
| 7 | 4 | 58.3 | 69.8 | 6 / 35 | 2654 |
| 8 | 2 | 61.8 | 74.6 | 11 / 35 | 3359 |
| 9 | 3 | 60.5 | 72.7 | 6 / 35 | 3196 |
| 10 | 4 | 60.5 | 74.3 | 8 / 35 | 2976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 88 | 39% |
| ara.Shera 0.88 | 37 | 54% |
| maribo.mini.MiniQuester 0.1 | 31 | 77% |
| amz.NanoClone 1.41 | 2 | 50% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 102 | 38% | 136 |
| ara.Shera 0.88 | 77 | 29% | 96 |
| maribo.mini.MiniQuester 0.1 | 55 | 20% | 79 |
| amz.NanoClone 1.41 | 13 | 5% | 15 |
| maribo.IotaCT 1.1 | 7 | 3% | 8 |
| dsw.StaticD 1.0 | 6 | 2% | 6 |
| stelo.MirrorMicro 1.0 | 5 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 62.3 | 21 / 350 | 4.39 | 11.1% | 23489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 286 |
| brainfade.melee.Dusk 0.44 | 2.5 | 13.2% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 3.7 | 11.7% | 6 |
| dummy.micro.Sparrow 2.5 | 3.9 | 11.8% | 12 |
| hadur117.nano.SanaroK65 0.3 | 4.4 | 11.1% | 21 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.0% | 3 |
| mz.NanoGod 2.02 | 7.5 | 7.5% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 67.0 | 1 / 35 | 2541 |
| 2 | 5 | 56.6 | 61.3 | 2 / 35 | 2038 |
| 3 | 4 | 58.7 | 68.6 | 5 / 35 | 2147 |
| 4 | 6 | 54.8 | 56.5 | 1 / 35 | 2155 |
| 5 | 6 | 54.3 | 54.9 | 2 / 35 | 2207 |
| 6 | 2 | 60.1 | 70.2 | 2 / 35 | 2674 |
| 7 | 5 | 56.8 | 62.2 | 3 / 35 | 2213 |
| 8 | 4 | 58.3 | 65.4 | 1 / 35 | 2340 |
| 9 | 4 | 57.5 | 61.6 | 1 / 35 | 2653 |
| 10 | 5 | 55.2 | 55.6 | 3 / 35 | 2521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 64 | 6% |
| brainfade.melee.Dusk 0.44 | 10 | 80% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 71% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 329 of 350 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 150 | 46% | 153 |
| brainfade.melee.Dusk 0.44 | 42 | 13% | 50 |
| wcsv.melee.EngineerMelee 0.1 | 42 | 13% | 47 |
| dummy.micro.Sparrow 2.5 | 35 | 11% | 39 |
| Krabb.akim2.Akim2 1.1b | 22 | 7% | 23 |
| jab.DiamondStealer 5 | 19 | 6% | 19 |
| mz.NanoGod 2.02 | 18 | 5% | 18 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 74.6 | 100 / 350 | 3.28 | 14.3% | 31385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.3 | 16.8% | 135 |
| tzu.TheArtOfWar 1.2 | 1.9 | 15.4% | 80 |
| hadur117.nano.SanaroK65 0.3 | 2.8 | 14.3% | 100 |
| jwirde.Gort 2.0 | 4.4 | 10.8% | 20 |
| wompi.Quokka 1.6 | 4.6 | 10.4% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.1 | 9.1% | 2 |
| disan.Chair 2.2.0 | 7.3 | 7.5% | 5 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.7% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.4 | 4.6% | 1 |
| sample.Crazy 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 75.2 | 13 / 35 | 3458 |
| 2 | 3 | 60.6 | 72.4 | 11 / 35 | 2747 |
| 3 | 3 | 62.4 | 73.7 | 11 / 35 | 3430 |
| 4 | 3 | 58.7 | 66.3 | 6 / 35 | 2919 |
| 5 | 3 | 59.9 | 71.7 | 8 / 35 | 2770 |
| 6 | 3 | 61.8 | 75.2 | 9 / 35 | 2949 |
| 7 | 2 | 63.0 | 78.7 | 9 / 35 | 3288 |
| 8 | 2 | 62.2 | 76.2 | 9 / 35 | 3355 |
| 9 | 3 | 63.0 | 77.1 | 12 / 35 | 3147 |
| 10 | 3 | 63.5 | 79.7 | 12 / 35 | 3322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 78 | 65% |
| tzu.TheArtOfWar 1.2 | 52 | 29% |
| jwirde.Gort 2.0 | 21 | 81% |
| wompi.Quokka 1.6 | 7 | 71% |
| disan.Chair 2.2.0 | 6 | 83% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 251 of 350 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 35% | 142 |
| tzu.TheArtOfWar 1.2 | 80 | 32% | 96 |
| jwirde.Gort 2.0 | 25 | 10% | 45 |
| wompi.Quokka 1.6 | 20 | 8% | 23 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 13 | 5% | 14 |
| disan.Chair 2.2.0 | 10 | 4% | 11 |
| stf.PanzerGeneral 0.1 | 8 | 3% | 10 |
| amk.jointstrike.JointStrike 0.2 | 4 | 2% | 5 |
| sample.Crazy 1.0 | 2 | 1% | 4 |

## Melee bench: F45

hadur117.nano.SanaroK65 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 73.3 | 89 / 350 | 3.41 | 14.5% | 33843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK65 0.3 | 1.1 | 14.5% | 89 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.8% | 157 |
| jje.BagPuss 1.2 | 3.0 | 12.2% | 22 |
| sul.Lunar 1.1 | 3.8 | 11.5% | 44 |
| myl.nano.Graviton 1.10 | 5.0 | 10.3% | 10 |
| hvilela.HVilela 0.9 | 6.5 | 9.2% | 2 |
| fm.claire 1.7 | 6.8 | 8.8% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 7.1 | 8.8% | 8 |
| wit.Deep7 2.0 | 9.1 | 6.8% | 17 |
| abud.ThirdRobo 1.0 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 74.3 | 11 / 35 | 3537 |
| 2 | 1 | 62.5 | 75.9 | 8 / 35 | 3708 |
| 3 | 1 | 60.3 | 70.8 | 10 / 35 | 3191 |
| 4 | 1 | 59.1 | 69.8 | 6 / 35 | 3151 |
| 5 | 1 | 63.8 | 80.0 | 13 / 35 | 3600 |
| 6 | 1 | 61.5 | 73.7 | 9 / 35 | 3634 |
| 7 | 1 | 60.8 | 72.7 | 11 / 35 | 3122 |
| 8 | 1 | 59.0 | 67.3 | 5 / 35 | 3435 |
| 9 | 1 | 63.0 | 77.8 | 12 / 35 | 3440 |
| 10 | 2 | 59.2 | 70.5 | 4 / 35 | 3025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 111 | 48% |
| sul.Lunar 1.1 | 26 | 31% |
| jje.BagPuss 1.2 | 20 | 55% |
| wit.Deep7 2.0 | 11 | 36% |
| myl.nano.Graviton 1.10 | 9 | 89% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 75% |
| hvilela.HVilela 0.9 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 261 of 350 rounds, at a mean tick of 1377. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 25% | 0 |
| jje.BagPuss 1.2 | 51 | 20% | 104 |
| sul.Lunar 1.1 | 48 | 18% | 83 |
| myl.nano.Graviton 1.10 | 28 | 11% | 52 |
| fm.claire 1.7 | 25 | 10% | 36 |
| hvilela.HVilela 0.9 | 20 | 8% | 32 |
| wit.Deep7 2.0 | 12 | 5% | 20 |
| pez.mini.ChironexFleckeri 0.5 | 10 | 4% | 17 |
| abud.ThirdRobo 1.0 | 3 | 1% | 4 |

## Melee bench: F46

hadur117.nano.SanaroK65 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 78.5 | 76 / 350 | 2.72 | 15.4% | 26756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 22.0% | 218 |
| hadur117.nano.SanaroK65 0.3 | 2.0 | 15.4% | 76 |
| cx.Princess 1.0 | 3.4 | 13.2% | 35 |
| mz.MicroSheep 1.0 | 3.6 | 12.9% | 16 |
| sadoner.killer 0.2 | 5.2 | 10.2% | 3 |
| arthord.NanoSatanMelee Beta | 6.1 | 8.8% | 2 |
| jeremyreeder.collective.Prophet 5 | 6.7 | 7.8% | 0 |
| kurios.DOSexe .9a | 8.3 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 78.9 | 8 / 35 | 2630 |
| 2 | 2 | 61.6 | 80.0 | 7 / 35 | 2494 |
| 3 | 2 | 62.9 | 80.7 | 10 / 35 | 2752 |
| 4 | 2 | 61.8 | 78.9 | 10 / 35 | 2550 |
| 5 | 2 | 60.2 | 73.9 | 5 / 35 | 2883 |
| 6 | 2 | 61.8 | 81.4 | 8 / 35 | 2572 |
| 7 | 2 | 62.9 | 81.8 | 10 / 35 | 2803 |
| 8 | 2 | 60.9 | 75.7 | 3 / 35 | 2944 |
| 9 | 2 | 60.7 | 76.4 | 5 / 35 | 2823 |
| 10 | 2 | 60.7 | 77.5 | 10 / 35 | 2305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 166 | 30% |
| cx.Princess 1.0 | 27 | 52% |
| mz.MicroSheep 1.0 | 13 | 38% |
| sadoner.killer 0.2 | 4 | 50% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 1201. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 173 | 63% | 226 |
| cx.Princess 1.0 | 34 | 12% | 48 |
| mz.MicroSheep 1.0 | 28 | 10% | 31 |
| arthord.NanoSatanMelee Beta | 16 | 6% | 19 |
| sadoner.killer 0.2 | 15 | 5% | 17 |
| jeremyreeder.collective.Prophet 5 | 7 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 2 |

